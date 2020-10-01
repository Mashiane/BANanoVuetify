package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmitemgroup extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmitemgroup", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmitemgroup.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _itemgroup = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
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
public b4j.example.vmitemgroup  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 85;BA.debugLine="Sub AddChild(child As VMElement) As VMItemGroup";
 //BA.debugLineNum = 86;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 87;BA.debugLine="ItemGroup.SetText(childHTML)";
_itemgroup._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
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
public b4j.example.vmitemgroup  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub AddClass(c As String) As VMItemGroup";
 //BA.debugLineNum = 108;BA.debugLine="ItemGroup.AddClass(c)";
_itemgroup._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub AddComponent(comp As String) As VMItemGroup";
 //BA.debugLineNum = 41;BA.debugLine="SetText(comp)";
_settext(_comp);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _addelement(String _elid,String _eltag,String _eltext,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses) throws Exception{
b4j.example.vmelement _d = null;
 //BA.debugLineNum = 433;BA.debugLine="Sub AddElement(elID As String, elTag As String, el";
 //BA.debugLineNum = 434;BA.debugLine="Dim d As VMElement";
_d = new b4j.example.vmelement();
 //BA.debugLineNum = 435;BA.debugLine="d.Initialize(vue,elID).SetDesignMode(DesignMode).";
_d._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid)._setdesignmode /*b4j.example.vmelement*/ (_designmode)._settag /*b4j.example.vmelement*/ (_eltag);
 //BA.debugLineNum = 436;BA.debugLine="d.SetText(elText)";
_d._settext /*b4j.example.vmelement*/ (_eltext);
 //BA.debugLineNum = 437;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, Null)";
_d._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 438;BA.debugLine="SetText(d.ToString)";
_settext(_d._tostring /*String*/ ());
 //BA.debugLineNum = 439;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 440;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _additem(b4j.example.vmitem _vitem) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub AddItem(vitem As VMItem) As VMItemGroup";
 //BA.debugLineNum = 92;BA.debugLine="SetText(vitem.ToString)";
_settext(_vitem._tostring /*String*/ ());
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 416;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 417;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 418;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmitemgroup  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 251;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 252;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 343;BA.debugLine="ItemGroup.BindStyleSingle(prop, value)";
_itemgroup._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 421;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 422;BA.debugLine="ItemGroup.BuildModel(mprops, mstyles, lclasses, l";
_itemgroup._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 423;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 424;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ItemGroup As VMElement";
_itemgroup = new b4j.example.vmelement();
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
 //BA.debugLineNum = 10;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmitemgroup  _disable() throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub Disable As VMItemGroup";
 //BA.debugLineNum = 244;BA.debugLine="ItemGroup.Disable(True)";
_itemgroup._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _enable() throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub Enable As VMItemGroup";
 //BA.debugLineNum = 238;BA.debugLine="ItemGroup.Enable(True)";
_itemgroup._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _hide() throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub Hide As VMItemGroup";
 //BA.debugLineNum = 226;BA.debugLine="ItemGroup.SetVisible(False)";
_itemgroup._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="ItemGroup.Initialize(v, ID)";
_itemgroup._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 17;BA.debugLine="ItemGroup.SetTag(\"v-item-group\")";
_itemgroup._settag /*b4j.example.vmelement*/ ("v-item-group");
 //BA.debugLineNum = 18;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 19;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 21;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="Container.Initialize(vue, $\"${ID}cont\"$, Module)";
_container._initialize /*b4j.example.vmcontainer*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"cont"),_module);
 //BA.debugLineNum = 23;BA.debugLine="SetOnChange(Module, $\"${ID}_change\"$)";
_setonchange(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_change"));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 103;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmitemgroup  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="public Sub RemoveAttr(sName As String) As VMItemGr";
 //BA.debugLineNum = 290;BA.debugLine="ItemGroup.RemoveAttr(sName)";
_itemgroup._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub Render";
 //BA.debugLineNum = 81;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmitemgroup  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 132;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 133;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmitemgroup)(this);};
 //BA.debugLineNum = 134;BA.debugLine="If varActiveClass = \"v-item--active\" Then Return";
if ((_varactiveclass).equals("v-item--active")) { 
if (true) return (b4j.example.vmitemgroup)(this);};
 //BA.debugLineNum = 135;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 136;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 };
 //BA.debugLineNum = 139;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 140;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 141;BA.debugLine="ItemGroup.Bind(\":active-class\", pp)";
_itemgroup._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetAttr(attr As Map) As VMItemGroup";
 //BA.debugLineNum = 114;BA.debugLine="ItemGroup.SetAttr(attr)";
_itemgroup._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 362;BA.debugLine="Sub SetAttributes(attrs As List) As VMItemGroup";
 //BA.debugLineNum = 363;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 364;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 366;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub SetAttrLoose(loose As String) As VMItemGroup";
 //BA.debugLineNum = 258;BA.debugLine="ItemGroup.SetAttrLoose(loose)";
_itemgroup._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 336;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 337;BA.debugLine="ItemGroup.SetAttrSingle(prop, value)";
_itemgroup._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 275;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 276;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmitemgroup)(this);};
 //BA.debugLineNum = 277;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 278;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 279;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 };
 //BA.debugLineNum = 282;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 283;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 284;BA.debugLine="ItemGroup.Bind(\":color\", pp)";
_itemgroup._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 172;BA.debugLine="Sub SetDark(varDark As Boolean) As VMItemGroup";
 //BA.debugLineNum = 173;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmitemgroup)(this);};
 //BA.debugLineNum = 174;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 175;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 };
 //BA.debugLineNum = 178;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 179;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 180;BA.debugLine="ItemGroup.Bind(\":dark\", pp)";
_itemgroup._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 58;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 307;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMItemGroup";
 //BA.debugLineNum = 308;BA.debugLine="ItemGroup.SetDesignMode(b)";
_itemgroup._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 309;BA.debugLine="Container.SetDesignMode(b)";
_container._setdesignmode /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 310;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 392;BA.debugLine="ItemGroup.SetDeviceOffsets(OS, OM, OL, OX)";
_itemgroup._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 398;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 399;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 400;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 401;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 406;BA.debugLine="ItemGroup.SetDeviceSizes(SS, SM, SL, SX)";
_itemgroup._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 407;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 378;BA.debugLine="Sub SetKey(k As String) As VMItemGroup";
 //BA.debugLineNum = 379;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 380;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 381;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 185;BA.debugLine="Sub SetLight(varLight As Boolean) As VMItemGroup";
 //BA.debugLineNum = 186;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmitemgroup)(this);};
 //BA.debugLineNum = 187;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 188;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 };
 //BA.debugLineNum = 191;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 192;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 193;BA.debugLine="ItemGroup.Bind(\":light\", pp)";
_itemgroup._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setmandatory(boolean _varmandatory) throws Exception{
String _pp = "";
 //BA.debugLineNum = 198;BA.debugLine="Sub SetMandatory(varMandatory As Boolean) As VMIte";
 //BA.debugLineNum = 199;BA.debugLine="If varMandatory = False Then Return Me";
if (_varmandatory==__c.False) { 
if (true) return (b4j.example.vmitemgroup)(this);};
 //BA.debugLineNum = 200;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 201;BA.debugLine="SetAttrSingle(\"mandatory\", varMandatory)";
_setattrsingle("mandatory",BA.ObjectToString(_varmandatory));
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 };
 //BA.debugLineNum = 204;BA.debugLine="Dim pp As String = $\"${ID}Mandatory\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Mandatory");
 //BA.debugLineNum = 205;BA.debugLine="vue.SetStateSingle(pp, varMandatory)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmandatory));
 //BA.debugLineNum = 206;BA.debugLine="ItemGroup.Bind(\":mandatory\", pp)";
_itemgroup._bind /*b4j.example.vmelement*/ (":mandatory",_pp);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub SetMarginAll(p As String) As VMItemGroup";
 //BA.debugLineNum = 302;BA.debugLine="ItemGroup.setmarginall(p)";
_itemgroup._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 303;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setmax(String _varmax) throws Exception{
String _pp = "";
 //BA.debugLineNum = 146;BA.debugLine="Sub SetMax(varMax As String) As VMItemGroup";
 //BA.debugLineNum = 147;BA.debugLine="If varMax = \"\" Then Return Me";
if ((_varmax).equals("")) { 
if (true) return (b4j.example.vmitemgroup)(this);};
 //BA.debugLineNum = 148;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 149;BA.debugLine="SetAttrSingle(\"max\", varMax)";
_setattrsingle("max",_varmax);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 };
 //BA.debugLineNum = 152;BA.debugLine="Dim pp As String = $\"${ID}Max\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Max");
 //BA.debugLineNum = 153;BA.debugLine="vue.SetStateSingle(pp, varMax)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmax));
 //BA.debugLineNum = 154;BA.debugLine="ItemGroup.Bind(\":max\", pp)";
_itemgroup._bind /*b4j.example.vmelement*/ (":max",_pp);
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setmultiple(boolean _varmultiple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 211;BA.debugLine="Sub SetMultiple(varMultiple As Boolean) As VMItemG";
 //BA.debugLineNum = 212;BA.debugLine="If varMultiple = False Then Return Me";
if (_varmultiple==__c.False) { 
if (true) return (b4j.example.vmitemgroup)(this);};
 //BA.debugLineNum = 213;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 214;BA.debugLine="SetAttrSingle(\"multiple\", varMultiple)";
_setattrsingle("multiple",BA.ObjectToString(_varmultiple));
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 };
 //BA.debugLineNum = 217;BA.debugLine="Dim pp As String = $\"${ID}Multiple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Multiple");
 //BA.debugLineNum = 218;BA.debugLine="vue.SetStateSingle(pp, varMultiple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmultiple));
 //BA.debugLineNum = 219;BA.debugLine="ItemGroup.Bind(\":multiple\", pp)";
_itemgroup._bind /*b4j.example.vmelement*/ (":multiple",_pp);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 325;BA.debugLine="ItemGroup.SetName(varName, bbind)";
_itemgroup._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setonchange(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 28;BA.debugLine="Sub SetOnChange(eventHandler As Object,methodName";
 //BA.debugLineNum = 29;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 30;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmitemgroup)(this);};
 //BA.debugLineNum = 31;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 32;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 33;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 35;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub SetPaddingAll(p As String) As VMItemGroup";
 //BA.debugLineNum = 296;BA.debugLine="ItemGroup.SetPaddingAll(p)";
_itemgroup._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 385;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMIte";
 //BA.debugLineNum = 386;BA.debugLine="ItemGroup.SetRC(sRow, sCol)";
_itemgroup._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub SetStatic(b As Boolean) As VMItemGroup";
 //BA.debugLineNum = 316;BA.debugLine="ItemGroup.SetStatic(b)";
_itemgroup._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 317;BA.debugLine="Container.SetStatic(b)";
_container._setstatic /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 318;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetStyle(sm As Map) As VMItemGroup";
 //BA.debugLineNum = 120;BA.debugLine="ItemGroup.SetStyle(sm)";
_itemgroup._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 330;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 331;BA.debugLine="ItemGroup.SetStyleSingle(prop, value)";
_itemgroup._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _settext(String _txt) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetText(txt As String) As VMItemGroup";
 //BA.debugLineNum = 97;BA.debugLine="ItemGroup.SetText(txt)";
_itemgroup._settext /*b4j.example.vmelement*/ (_txt);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _settextcenter() throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Sub SetTextCenter As VMItemGroup";
 //BA.debugLineNum = 412;BA.debugLine="ItemGroup.AddClass(\"text-center\")";
_itemgroup._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 413;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setvalue(String _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 159;BA.debugLine="Sub SetValue(varValue As String) As VMItemGroup";
 //BA.debugLineNum = 160;BA.debugLine="If varValue = \"\" Then Return Me";
if ((_varvalue).equals("")) { 
if (true) return (b4j.example.vmitemgroup)(this);};
 //BA.debugLineNum = 161;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 162;BA.debugLine="SetAttrSingle(\"value\", varValue)";
_setattrsingle("value",_varvalue);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 };
 //BA.debugLineNum = 165;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 166;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue));
 //BA.debugLineNum = 167;BA.debugLine="ItemGroup.Bind(\":value\", pp)";
_itemgroup._bind /*b4j.example.vmelement*/ (":value",_pp);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Sub SetVElse(vif As String) As VMItemGroup";
 //BA.debugLineNum = 348;BA.debugLine="ItemGroup.SetVElse(vif)";
_itemgroup._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 370;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 371;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 372;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 373;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 374;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Sub SetVhtml(vhtml As String) As VMItemGroup";
 //BA.debugLineNum = 358;BA.debugLine="ItemGroup.SetVHtml(vhtml)";
_itemgroup._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetVIf(vif As String) As VMItemGroup";
 //BA.debugLineNum = 70;BA.debugLine="ItemGroup.SetVIf(vif)";
_itemgroup._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 427;BA.debugLine="Sub SetVisible(b As Boolean) As VMItemGroup";
 //BA.debugLineNum = 428;BA.debugLine="ItemGroup.SetVisible(b)";
_itemgroup._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 429;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 430;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetVModel(k As String) As VMItemGroup";
 //BA.debugLineNum = 65;BA.debugLine="ItemGroup.SetVModel(k)";
_itemgroup._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetVShow(vif As String) As VMItemGroup";
 //BA.debugLineNum = 75;BA.debugLine="ItemGroup.SetVShow(vif)";
_itemgroup._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Sub SetVText(vhtml As String) As VMItemGroup";
 //BA.debugLineNum = 353;BA.debugLine="ItemGroup.SetVText(vhtml)";
_itemgroup._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _show() throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub Show As VMItemGroup";
 //BA.debugLineNum = 232;BA.debugLine="ItemGroup.SetVisible(True)";
_itemgroup._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 46;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 47;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 48;BA.debugLine="Dim eName As String = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 49;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 50;BA.debugLine="Log($\"VMItemGroup.${eName} event has not been d";
__c.Log(("VMItemGroup."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 53;BA.debugLine="If Container.HasContent Then ItemGroup.AddCompone";
if (_container._hascontent /*boolean*/ ) { 
_itemgroup._addcomponent /*b4j.example.vmelement*/ (_container._tostring /*String*/ ());};
 //BA.debugLineNum = 54;BA.debugLine="Return ItemGroup.ToString";
if (true) return _itemgroup._tostring /*String*/ ();
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmitemgroup  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 263;BA.debugLine="Sub UseTheme(themeName As String) As VMItemGroup";
 //BA.debugLineNum = 264;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 265;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 266;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 267;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 268;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitemgroup)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
