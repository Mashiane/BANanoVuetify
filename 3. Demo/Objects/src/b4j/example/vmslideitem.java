package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmslideitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmslideitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmslideitem.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _slideitem = null;
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
public b4j.example.vmslideitem  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 83;BA.debugLine="Sub AddChild(child As VMElement) As VMSlideItem";
 //BA.debugLineNum = 84;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 85;BA.debugLine="SlideItem.SetText(childHTML)";
_slideitem._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 114;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 115;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 116;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslideitem  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub AddClass(c As String) As VMSlideItem";
 //BA.debugLineNum = 97;BA.debugLine="SlideItem.AddClass(c)";
_slideitem._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub AddComponent(comp As String) As VMSlideItem";
 //BA.debugLineNum = 31;BA.debugLine="SetText(comp)";
_settext(_comp);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _addelement(String _elid,String _eltag,String _eltext,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses) throws Exception{
b4j.example.vmelement _d = null;
 //BA.debugLineNum = 35;BA.debugLine="Sub AddElement(elID As String, elTag As String, el";
 //BA.debugLineNum = 36;BA.debugLine="Dim d As VMElement";
_d = new b4j.example.vmelement();
 //BA.debugLineNum = 37;BA.debugLine="d.Initialize(vue,elID).SetDesignMode(DesignMode).";
_d._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid)._setdesignmode /*b4j.example.vmelement*/ (_designmode)._settag /*b4j.example.vmelement*/ (_eltag);
 //BA.debugLineNum = 38;BA.debugLine="d.SetText(elText)";
_d._settext /*b4j.example.vmelement*/ (_eltext);
 //BA.debugLineNum = 39;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, Null)";
_d._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 40;BA.debugLine="SetText(d.ToString)";
_settext(_d._tostring /*String*/ ());
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 350;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 351;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslideitem  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 187;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 188;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 277;BA.debugLine="SlideItem.BindStyleSingle(prop, value)";
_slideitem._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 356;BA.debugLine="SlideItem.BuildModel(mprops, mstyles, lclasses, l";
_slideitem._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 357;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public SlideItem As VMElement";
_slideitem = new b4j.example.vmelement();
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
public b4j.example.vmslideitem  _disable() throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub Disable As VMSlideItem";
 //BA.debugLineNum = 180;BA.debugLine="SlideItem.Disable(True)";
_slideitem._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _enable() throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub Enable As VMSlideItem";
 //BA.debugLineNum = 174;BA.debugLine="SlideItem.Enable(True)";
_slideitem._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _hide() throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub Hide As VMSlideItem";
 //BA.debugLineNum = 162;BA.debugLine="SlideItem.SetVisible(False)";
_slideitem._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="SlideItem.Initialize(v, ID)";
_slideitem._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="SlideItem.SetTag(\"v-slide-item\")";
_slideitem._settag /*b4j.example.vmelement*/ ("v-slide-item");
 //BA.debugLineNum = 17;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 92;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslideitem  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="public Sub RemoveAttr(sName As String) As VMSlideI";
 //BA.debugLineNum = 226;BA.debugLine="SlideItem.RemoveAttr(sName)";
_slideitem._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub Render";
 //BA.debugLineNum = 79;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslideitem  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 121;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 122;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmslideitem)(this);};
 //BA.debugLineNum = 123;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 124;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 };
 //BA.debugLineNum = 127;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 128;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 129;BA.debugLine="SlideItem.Bind(\":active-class\", pp)";
_slideitem._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setactivetoggle() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetActiveToggle As VMSlideItem";
 //BA.debugLineNum = 25;BA.debugLine="SetAttrSingle(\"v-slot:default\", \"{ active, toggle";
_setattrsingle("v-slot:default","{ active, toggle }");
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetAttr(attr As Map) As VMSlideItem";
 //BA.debugLineNum = 103;BA.debugLine="SlideItem.SetAttr(attr)";
_slideitem._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 296;BA.debugLine="Sub SetAttributes(attrs As List) As VMSlideItem";
 //BA.debugLineNum = 297;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 298;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetAttrLoose(loose As String) As VMSlideItem";
 //BA.debugLineNum = 194;BA.debugLine="SlideItem.SetAttrLoose(loose)";
_slideitem._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 271;BA.debugLine="SlideItem.SetAttrSingle(prop, value)";
_slideitem._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 211;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 212;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmslideitem)(this);};
 //BA.debugLineNum = 213;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 214;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 215;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 };
 //BA.debugLineNum = 218;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 219;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 220;BA.debugLine="SlideItem.Bind(\":color\", pp)";
_slideitem._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 56;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMSlideItem";
 //BA.debugLineNum = 244;BA.debugLine="SlideItem.SetDesignMode(b)";
_slideitem._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 245;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 326;BA.debugLine="SlideItem.SetDeviceOffsets(OS, OM, OL, OX)";
_slideitem._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 333;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 334;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 339;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 340;BA.debugLine="SlideItem.SetDeviceSizes(SS, SM, SL, SX)";
_slideitem._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 341;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setdisabled(boolean _vardisabled) throws Exception{
String _pp = "";
 //BA.debugLineNum = 147;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMSlide";
 //BA.debugLineNum = 148;BA.debugLine="If varDisabled = False Then Return Me";
if (_vardisabled==__c.False) { 
if (true) return (b4j.example.vmslideitem)(this);};
 //BA.debugLineNum = 149;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 150;BA.debugLine="SetAttrSingle(\"disabled\", varDisabled)";
_setattrsingle("disabled",BA.ObjectToString(_vardisabled));
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 };
 //BA.debugLineNum = 153;BA.debugLine="Dim pp As String = $\"${ID}Disabled\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Disabled");
 //BA.debugLineNum = 154;BA.debugLine="vue.SetStateSingle(pp, varDisabled)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisabled));
 //BA.debugLineNum = 155;BA.debugLine="SlideItem.Bind(\":disabled\", pp)";
_slideitem._bind /*b4j.example.vmelement*/ (":disabled",_pp);
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Sub SetKey(k As String) As VMSlideItem";
 //BA.debugLineNum = 313;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 314;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 315;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub SetMarginAll(p As String) As VMSlideItem";
 //BA.debugLineNum = 238;BA.debugLine="SlideItem.setmarginall(p)";
_slideitem._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 259;BA.debugLine="SlideItem.SetName(varName, bbind)";
_slideitem._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub SetPaddingAll(p As String) As VMSlideItem";
 //BA.debugLineNum = 232;BA.debugLine="SlideItem.SetPaddingAll(p)";
_slideitem._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMSli";
 //BA.debugLineNum = 320;BA.debugLine="SlideItem.SetRC(sRow, sCol)";
_slideitem._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub SetStatic(b As Boolean) As VMSlideItem";
 //BA.debugLineNum = 251;BA.debugLine="SlideItem.SetStatic(b)";
_slideitem._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 252;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetStyle(sm As Map) As VMSlideItem";
 //BA.debugLineNum = 109;BA.debugLine="SlideItem.SetStyle(sm)";
_slideitem._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 265;BA.debugLine="SlideItem.SetStyleSingle(prop, value)";
_slideitem._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _settext(String _txt) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetText(txt As String) As VMSlideItem";
 //BA.debugLineNum = 46;BA.debugLine="SlideItem.SetText(txt)";
_slideitem._settext /*b4j.example.vmelement*/ (_txt);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _settextcenter() throws Exception{
 //BA.debugLineNum = 345;BA.debugLine="Sub SetTextCenter As VMSlideItem";
 //BA.debugLineNum = 346;BA.debugLine="SlideItem.AddClass(\"text-center\")";
_slideitem._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 347;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _settextcolor(String _textcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 368;BA.debugLine="Sub SetTextColor(textcolor As String) As VMSlideIt";
 //BA.debugLineNum = 369;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmslideitem)(this);};
 //BA.debugLineNum = 370;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 371;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _settextcolorintensity(String _textcolor,String _textintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 376;BA.debugLine="Sub SetTextColorIntensity(textcolor As String, tex";
 //BA.debugLineNum = 377;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmslideitem)(this);};
 //BA.debugLineNum = 378;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 379;BA.debugLine="Dim sIntensity As String = $\"text--${textintensit";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_textintensity))+"");
 //BA.debugLineNum = 380;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 381;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 382;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setvalue(String _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 134;BA.debugLine="Sub SetValue(varValue As String) As VMSlideItem";
 //BA.debugLineNum = 135;BA.debugLine="If varValue = \"\" Then Return Me";
if ((_varvalue).equals("")) { 
if (true) return (b4j.example.vmslideitem)(this);};
 //BA.debugLineNum = 136;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 137;BA.debugLine="SetAttrSingle(\"value\", varValue)";
_setattrsingle("value",_varvalue);
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 };
 //BA.debugLineNum = 140;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 141;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue));
 //BA.debugLineNum = 142;BA.debugLine="SlideItem.Bind(\":value\", pp)";
_slideitem._bind /*b4j.example.vmelement*/ (":value",_pp);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub SetVElse(vif As String) As VMSlideItem";
 //BA.debugLineNum = 282;BA.debugLine="SlideItem.SetVElse(vif)";
_slideitem._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setvfor(String _eitem,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 304;BA.debugLine="Sub SetVFor(eitem As String, dataSource As String)";
 //BA.debugLineNum = 305;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 306;BA.debugLine="eitem = eitem.tolowercase";
_eitem = _eitem.toLowerCase();
 //BA.debugLineNum = 307;BA.debugLine="Dim sline As String = $\"${eitem} in ${dataSource}";
_sline = (""+__c.SmartStringFormatter("",(Object)(_eitem))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 308;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub SetVhtml(vhtml As String) As VMSlideItem";
 //BA.debugLineNum = 292;BA.debugLine="SlideItem.SetVHtml(vhtml)";
_slideitem._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetVIf(vif As String) As VMSlideItem";
 //BA.debugLineNum = 68;BA.debugLine="SlideItem.SetVIf(vif)";
_slideitem._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Sub SetVisible(b As Boolean) As VMSlideItem";
 //BA.debugLineNum = 362;BA.debugLine="SlideItem.SetVisible(b)";
_slideitem._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetVModel(k As String) As VMSlideItem";
 //BA.debugLineNum = 63;BA.debugLine="SlideItem.SetVModel(k)";
_slideitem._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetVShow(vif As String) As VMSlideItem";
 //BA.debugLineNum = 73;BA.debugLine="SlideItem.SetVShow(vif)";
_slideitem._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub SetVText(vhtml As String) As VMSlideItem";
 //BA.debugLineNum = 287;BA.debugLine="SlideItem.SetVText(vhtml)";
_slideitem._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _show() throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub Show As VMSlideItem";
 //BA.debugLineNum = 168;BA.debugLine="SlideItem.SetVisible(True)";
_slideitem._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 52;BA.debugLine="Return SlideItem.ToString";
if (true) return _slideitem._tostring /*String*/ ();
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslideitem  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 199;BA.debugLine="Sub UseTheme(themeName As String) As VMSlideItem";
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
if (true) return (b4j.example.vmslideitem)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
