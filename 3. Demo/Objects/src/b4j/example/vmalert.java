package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmalert extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmalert", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmalert.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _alert = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public b4j.example.vmcontainer _container = null;
public String _smodel = "";
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
public b4j.example.vmalert  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 77;BA.debugLine="Sub AddChild(child As VMElement) As VMAlert";
 //BA.debugLineNum = 78;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 79;BA.debugLine="Alert.SetText(childHTML)";
_alert._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 107;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 108;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 109;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmalert  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub AddClass(c As String) As VMAlert";
 //BA.debugLineNum = 90;BA.debugLine="Alert.AddClass(c)";
_alert._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 643;BA.debugLine="Sub AddComponent(comp As String) As VMAlert";
 //BA.debugLineNum = 644;BA.debugLine="Alert.SetText(comp)";
_alert._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 645;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 646;BA.debugLine="End Sub";
return null;
}
public String  _addcontent(String _child) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub AddContent(child As String)";
 //BA.debugLineNum = 40;BA.debugLine="Alert.SetText(child)";
_alert._settext /*b4j.example.vmelement*/ (_child);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 654;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 655;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 656;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmalert  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 483;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 484;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 485;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 486;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 487;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 574;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 575;BA.debugLine="Alert.BindStyleSingle(prop, value)";
_alert._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 576;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 577;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 659;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 660;BA.debugLine="Alert.BuildModel(mprops, mstyles, lclasses, loose)";
_alert._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 661;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 662;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Alert As VMElement";
_alert = new b4j.example.vmelement();
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
 //BA.debugLineNum = 11;BA.debugLine="Private smodel As String";
_smodel = "";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmalert  _disable() throws Exception{
 //BA.debugLineNum = 476;BA.debugLine="Sub Disable As VMAlert";
 //BA.debugLineNum = 477;BA.debugLine="Alert.Enable(False)";
_alert._enable /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _enable() throws Exception{
 //BA.debugLineNum = 470;BA.debugLine="Sub Enable As VMAlert";
 //BA.debugLineNum = 471;BA.debugLine="Alert.Enable(True)";
_alert._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 472;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _hide() throws Exception{
 //BA.debugLineNum = 458;BA.debugLine="Sub Hide As VMAlert";
 //BA.debugLineNum = 459;BA.debugLine="vue.SetData(smodel, False)";
_vue._setdata /*b4j.example.bananovue*/ (_smodel,(Object)(__c.False));
 //BA.debugLineNum = 460;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 16;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="Alert.Initialize(v, ID)";
_alert._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 18;BA.debugLine="Alert.SetTag(\"v-alert\")";
_alert._settag /*b4j.example.vmelement*/ ("v-alert");
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 22;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="Container.Initialize(vue, $\"${ID}cont\"$, Module)";
_container._initialize /*b4j.example.vmcontainer*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"cont"),_module);
 //BA.debugLineNum = 24;BA.debugLine="SetVModel(Alert.showkey)";
_setvmodel(_alert._showkey /*String*/ );
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 85;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmalert  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 522;BA.debugLine="public Sub RemoveAttr(sName As String) As VMAlert";
 //BA.debugLineNum = 523;BA.debugLine="Alert.RemoveAttr(sName)";
_alert._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 524;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _removevmodel() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub RemoveVModel As VMAlert";
 //BA.debugLineNum = 34;BA.debugLine="RemoveAttr(\"v-model\")";
_removeattr("v-model");
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub Render";
 //BA.debugLineNum = 73;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmalert  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetAttr(attr As Map) As VMAlert";
 //BA.debugLineNum = 96;BA.debugLine="Alert.SetAttr(attr)";
_alert._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 594;BA.debugLine="Sub SetAttributes(attrs As List) As VMAlert";
 //BA.debugLineNum = 595;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 596;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 598;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 599;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 490;BA.debugLine="Sub SetAttrLoose(loose As String) As VMAlert";
 //BA.debugLineNum = 491;BA.debugLine="Alert.SetAttrLoose(loose)";
_alert._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 492;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 493;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 568;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 569;BA.debugLine="Alert.SetAttrSingle(prop, value)";
_alert._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 571;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setborder(String _varborder) throws Exception{
String _pp = "";
 //BA.debugLineNum = 117;BA.debugLine="Sub SetBorder(varBorder As String) As VMAlert";
 //BA.debugLineNum = 118;BA.debugLine="If varBorder = \"\" Then Return Me";
if ((_varborder).equals("")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 119;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 120;BA.debugLine="SetAttrSingle(\"border\", varBorder)";
_setattrsingle("border",_varborder);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 123;BA.debugLine="Dim pp As String = $\"${ID}Border\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Border");
 //BA.debugLineNum = 124;BA.debugLine="vue.SetStateSingle(pp, varBorder)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varborder));
 //BA.debugLineNum = 125;BA.debugLine="Alert.Bind(\":border\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":border",_pp);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setcloselabel(String _varcloselabel) throws Exception{
String _pp = "";
 //BA.debugLineNum = 130;BA.debugLine="Sub SetCloseLabel(varCloseLabel As String) As VMAl";
 //BA.debugLineNum = 131;BA.debugLine="If varCloseLabel = \"\" Then Return Me";
if ((_varcloselabel).equals("")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 132;BA.debugLine="If varCloseLabel = \"$vuetify.close\" Then Return M";
if ((_varcloselabel).equals("$vuetify.close")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 133;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 134;BA.debugLine="SetAttrSingle(\"close-label\", varCloseLabel)";
_setattrsingle("close-label",_varcloselabel);
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 137;BA.debugLine="Dim pp As String = $\"${ID}CloseLabel\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CloseLabel");
 //BA.debugLineNum = 138;BA.debugLine="vue.SetStateSingle(pp, varCloseLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcloselabel));
 //BA.debugLineNum = 139;BA.debugLine="Alert.Bind(\":close-label\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":close-label",_pp);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 144;BA.debugLine="Sub SetColor(varColor As String) As VMAlert";
 //BA.debugLineNum = 145;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 146;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 147;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 150;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 151;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 152;BA.debugLine="Alert.Bind(\":color\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setcoloredborder(boolean _varcoloredborder) throws Exception{
String _pp = "";
 //BA.debugLineNum = 324;BA.debugLine="Sub SetColoredBorder(varColoredBorder As Boolean)";
 //BA.debugLineNum = 325;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 326;BA.debugLine="SetAttrSingle(\"colored-border\", varColoredBorder";
_setattrsingle("colored-border",BA.ObjectToString(_varcoloredborder));
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 329;BA.debugLine="Dim pp As String = $\"${ID}ColoredBorder\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ColoredBorder");
 //BA.debugLineNum = 330;BA.debugLine="vue.SetStateSingle(pp, varColoredBorder)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcoloredborder));
 //BA.debugLineNum = 331;BA.debugLine="Alert.Bind(\":colored-border\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":colored-border",_pp);
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 508;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 509;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 510;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 511;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 512;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 513;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 515;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 516;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 517;BA.debugLine="Alert.Bind(\":color\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 518;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 519;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setcontent(String _scontent) throws Exception{
String _contid = "";
 //BA.debugLineNum = 43;BA.debugLine="Sub SetContent(sContent As String) As VMAlert";
 //BA.debugLineNum = 44;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 45;BA.debugLine="AddComponent(sContent)";
_addcomponent(_scontent);
 }else {
 //BA.debugLineNum = 47;BA.debugLine="Dim contid As String = $\"${ID}content\"$";
_contid = (""+__c.SmartStringFormatter("",(Object)(_id))+"content");
 //BA.debugLineNum = 48;BA.debugLine="vue.SetData(contid, sContent)";
_vue._setdata /*b4j.example.bananovue*/ (_contid,(Object)(_scontent));
 //BA.debugLineNum = 49;BA.debugLine="AddComponent($\"{{ ${contid} }}\"$)";
_addcomponent(("{{ "+__c.SmartStringFormatter("",(Object)(_contid))+" }}"));
 };
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 336;BA.debugLine="Sub SetDark(varDark As Boolean) As VMAlert";
 //BA.debugLineNum = 337;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 338;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 341;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 342;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 343;BA.debugLine="Alert.Bind(\":dark\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 29;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setdense(boolean _vardense) throws Exception{
String _pp = "";
 //BA.debugLineNum = 348;BA.debugLine="Sub SetDense(varDense As Boolean) As VMAlert";
 //BA.debugLineNum = 349;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 350;BA.debugLine="SetAttrSingle(\"dense\", varDense)";
_setattrsingle("dense",BA.ObjectToString(_vardense));
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 353;BA.debugLine="Dim pp As String = $\"${ID}Dense\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dense");
 //BA.debugLineNum = 354;BA.debugLine="vue.SetStateSingle(pp, varDense)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardense));
 //BA.debugLineNum = 355;BA.debugLine="Alert.Bind(\":dense\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":dense",_pp);
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 540;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMAlert";
 //BA.debugLineNum = 541;BA.debugLine="Alert.SetDesignMode(b)";
_alert._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 542;BA.debugLine="Container.SetDesignMode(b)";
_container._setdesignmode /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 543;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 544;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 545;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 623;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 624;BA.debugLine="Alert.SetDeviceOffsets(OS, OM, OL, OX)";
_alert._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 625;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 626;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 630;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 631;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 632;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 633;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 634;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 637;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 638;BA.debugLine="Alert.SetDeviceSizes(SS, SM, SL, SX)";
_alert._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 639;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 640;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setdismissible(boolean _vardismissible) throws Exception{
String _pp = "";
 //BA.debugLineNum = 360;BA.debugLine="Sub SetDismissible(varDismissible As Boolean) As V";
 //BA.debugLineNum = 361;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 362;BA.debugLine="SetAttrSingle(\"dismissible\", varDismissible)";
_setattrsingle("dismissible",BA.ObjectToString(_vardismissible));
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 365;BA.debugLine="Dim pp As String = $\"${ID}Dismissible\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dismissible");
 //BA.debugLineNum = 366;BA.debugLine="vue.SetStateSingle(pp, varDismissible)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardismissible));
 //BA.debugLineNum = 367;BA.debugLine="Alert.Bind(\":dismissible\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":dismissible",_pp);
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setelevation(String _varelevation) throws Exception{
String _pp = "";
 //BA.debugLineNum = 157;BA.debugLine="Sub SetElevation(varElevation As String) As VMAler";
 //BA.debugLineNum = 158;BA.debugLine="If varElevation = \"\" Then Return Me";
if ((_varelevation).equals("")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 159;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 160;BA.debugLine="SetAttrSingle(\"elevation\", varElevation)";
_setattrsingle("elevation",_varelevation);
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 163;BA.debugLine="Dim pp As String = $\"${ID}Elevation\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Elevation");
 //BA.debugLineNum = 164;BA.debugLine="vue.SetStateSingle(pp, varElevation)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varelevation));
 //BA.debugLineNum = 165;BA.debugLine="Alert.Bind(\":elevation\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":elevation",_pp);
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 170;BA.debugLine="Sub SetHeight(varHeight As String) As VMAlert";
 //BA.debugLineNum = 171;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 172;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 173;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 176;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 177;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 178;BA.debugLine="Alert.Bind(\":height\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _seticon(String _varicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 183;BA.debugLine="Sub SetIcon(varIcon As String) As VMAlert";
 //BA.debugLineNum = 184;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 185;BA.debugLine="SetAttrSingle(\"icon\", varIcon)";
_setattrsingle("icon",_varicon);
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 188;BA.debugLine="Dim pp As String = $\"${ID}Icon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Icon");
 //BA.debugLineNum = 189;BA.debugLine="vue.SetStateSingle(pp, varIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varicon));
 //BA.debugLineNum = 190;BA.debugLine="Alert.Bind(\":icon\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":icon",_pp);
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 610;BA.debugLine="Sub SetKey(k As String) As VMAlert";
 //BA.debugLineNum = 611;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 612;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 613;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 614;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 372;BA.debugLine="Sub SetLight(varLight As Boolean) As VMAlert";
 //BA.debugLineNum = 373;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 374;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 377;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 378;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 379;BA.debugLine="Alert.Bind(\":light\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 534;BA.debugLine="Sub SetMarginAll(p As String) As VMAlert";
 //BA.debugLineNum = 535;BA.debugLine="Alert.setmarginall(p)";
_alert._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 536;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 537;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setmaxheight(String _varmaxheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 195;BA.debugLine="Sub SetMaxHeight(varMaxHeight As String) As VMAler";
 //BA.debugLineNum = 196;BA.debugLine="If varMaxHeight = \"\" Then Return Me";
if ((_varmaxheight).equals("")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 197;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 198;BA.debugLine="SetAttrSingle(\"max-height\", varMaxHeight)";
_setattrsingle("max-height",_varmaxheight);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 201;BA.debugLine="Dim pp As String = $\"${ID}MaxHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxHeight");
 //BA.debugLineNum = 202;BA.debugLine="vue.SetStateSingle(pp, varMaxHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxheight));
 //BA.debugLineNum = 203;BA.debugLine="Alert.Bind(\":max-height\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":max-height",_pp);
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setmaxwidth(String _varmaxwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 208;BA.debugLine="Sub SetMaxWidth(varMaxWidth As String) As VMAlert";
 //BA.debugLineNum = 209;BA.debugLine="If varMaxWidth = \"\" Then Return Me";
if ((_varmaxwidth).equals("")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 210;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 211;BA.debugLine="SetAttrSingle(\"max-width\", varMaxWidth)";
_setattrsingle("max-width",_varmaxwidth);
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 214;BA.debugLine="Dim pp As String = $\"${ID}MaxWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxWidth");
 //BA.debugLineNum = 215;BA.debugLine="vue.SetStateSingle(pp, varMaxWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxwidth));
 //BA.debugLineNum = 216;BA.debugLine="Alert.Bind(\":max-width\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":max-width",_pp);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setminheight(String _varminheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 221;BA.debugLine="Sub SetMinHeight(varMinHeight As String) As VMAler";
 //BA.debugLineNum = 222;BA.debugLine="If varMinHeight = \"\" Then Return Me";
if ((_varminheight).equals("")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 223;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 224;BA.debugLine="SetAttrSingle(\"min-height\", varMinHeight)";
_setattrsingle("min-height",_varminheight);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 227;BA.debugLine="Dim pp As String = $\"${ID}MinHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinHeight");
 //BA.debugLineNum = 228;BA.debugLine="vue.SetStateSingle(pp, varMinHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminheight));
 //BA.debugLineNum = 229;BA.debugLine="Alert.Bind(\":min-height\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":min-height",_pp);
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setminwidth(String _varminwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 234;BA.debugLine="Sub SetMinWidth(varMinWidth As String) As VMAlert";
 //BA.debugLineNum = 235;BA.debugLine="If varMinWidth = \"\" Then Return Me";
if ((_varminwidth).equals("")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 236;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 237;BA.debugLine="SetAttrSingle(\"min-width\", varMinWidth)";
_setattrsingle("min-width",_varminwidth);
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 240;BA.debugLine="Dim pp As String = $\"${ID}MinWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinWidth");
 //BA.debugLineNum = 241;BA.debugLine="vue.SetStateSingle(pp, varMinWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminwidth));
 //BA.debugLineNum = 242;BA.debugLine="Alert.Bind(\":min-width\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":min-width",_pp);
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setmode(String _varmode) throws Exception{
String _pp = "";
 //BA.debugLineNum = 247;BA.debugLine="Sub SetMode(varMode As String) As VMAlert";
 //BA.debugLineNum = 248;BA.debugLine="If varMode = \"\" Then Return Me";
if ((_varmode).equals("")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 249;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 250;BA.debugLine="SetAttrSingle(\"mode\", varMode)";
_setattrsingle("mode",_varmode);
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 253;BA.debugLine="Dim pp As String = $\"${ID}Mode\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Mode");
 //BA.debugLineNum = 254;BA.debugLine="vue.SetStateSingle(pp, varMode)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmode));
 //BA.debugLineNum = 255;BA.debugLine="Alert.Bind(\":mode\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":mode",_pp);
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 556;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 557;BA.debugLine="Alert.SetName(varName, bbind)";
_alert._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 558;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 559;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setoninput(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 445;BA.debugLine="Sub SetOnInput(methodName As String) As VMAlert";
 //BA.debugLineNum = 446;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 447;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 448;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 449;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 450;BA.debugLine="SetAttr(CreateMap(\"@input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_methodname)}));
 //BA.debugLineNum = 452;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 453;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 454;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setorigin(String _varorigin) throws Exception{
String _pp = "";
 //BA.debugLineNum = 260;BA.debugLine="Sub SetOrigin(varOrigin As String) As VMAlert";
 //BA.debugLineNum = 261;BA.debugLine="If varOrigin = \"\" Then Return Me";
if ((_varorigin).equals("")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 262;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 263;BA.debugLine="SetAttrSingle(\"origin\", varOrigin)";
_setattrsingle("origin",_varorigin);
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 266;BA.debugLine="Dim pp As String = $\"${ID}Origin\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Origin");
 //BA.debugLineNum = 267;BA.debugLine="vue.SetStateSingle(pp, varOrigin)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varorigin));
 //BA.debugLineNum = 268;BA.debugLine="Alert.Bind(\":origin\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":origin",_pp);
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setoutlined(boolean _varoutlined) throws Exception{
String _pp = "";
 //BA.debugLineNum = 384;BA.debugLine="Sub SetOutlined(varOutlined As Boolean) As VMAlert";
 //BA.debugLineNum = 385;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 386;BA.debugLine="SetAttrSingle(\"outlined\", varOutlined)";
_setattrsingle("outlined",BA.ObjectToString(_varoutlined));
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 389;BA.debugLine="Dim pp As String = $\"${ID}Outlined\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Outlined");
 //BA.debugLineNum = 390;BA.debugLine="vue.SetStateSingle(pp, varOutlined)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoutlined));
 //BA.debugLineNum = 391;BA.debugLine="Alert.Bind(\":outlined\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":outlined",_pp);
 //BA.debugLineNum = 392;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 528;BA.debugLine="Sub SetPaddingAll(p As String) As VMAlert";
 //BA.debugLineNum = 529;BA.debugLine="Alert.SetPaddingAll(p)";
_alert._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 530;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 531;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setprominent(boolean _varprominent) throws Exception{
String _pp = "";
 //BA.debugLineNum = 396;BA.debugLine="Sub SetProminent(varProminent As Boolean) As VMAle";
 //BA.debugLineNum = 397;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 398;BA.debugLine="SetAttrSingle(\"prominent\", varProminent)";
_setattrsingle("prominent",BA.ObjectToString(_varprominent));
 //BA.debugLineNum = 399;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 401;BA.debugLine="Dim pp As String = $\"${ID}Prominent\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Prominent");
 //BA.debugLineNum = 402;BA.debugLine="vue.SetStateSingle(pp, varProminent)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprominent));
 //BA.debugLineNum = 403;BA.debugLine="Alert.Bind(\":prominent\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":prominent",_pp);
 //BA.debugLineNum = 404;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 617;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMAle";
 //BA.debugLineNum = 618;BA.debugLine="Alert.SetRC(sRow, sCol)";
_alert._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 619;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 620;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 548;BA.debugLine="Sub SetStatic(b As Boolean) As VMAlert";
 //BA.debugLineNum = 549;BA.debugLine="Alert.SetStatic(b)";
_alert._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 550;BA.debugLine="Container.SetStatic(b)";
_container._setstatic /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 551;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 552;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 553;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetStyle(sm As Map) As VMAlert";
 //BA.debugLineNum = 102;BA.debugLine="Alert.SetStyle(sm)";
_alert._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 562;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 563;BA.debugLine="Alert.SetStyleSingle(prop, value)";
_alert._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 564;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 565;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _settag(String _vartag) throws Exception{
String _pp = "";
 //BA.debugLineNum = 273;BA.debugLine="Sub SetTag(varTag As String) As VMAlert";
 //BA.debugLineNum = 274;BA.debugLine="If varTag = \"\" Then Return Me";
if ((_vartag).equals("")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 275;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 276;BA.debugLine="SetAttrSingle(\"tag\", varTag)";
_setattrsingle("tag",_vartag);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 279;BA.debugLine="Dim pp As String = $\"${ID}Tag\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tag");
 //BA.debugLineNum = 280;BA.debugLine="vue.SetStateSingle(pp, varTag)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartag));
 //BA.debugLineNum = 281;BA.debugLine="Alert.Bind(\":tag\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":tag",_pp);
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _settext(boolean _vartext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 408;BA.debugLine="Sub SetText(varText As Boolean) As VMAlert";
 //BA.debugLineNum = 409;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 410;BA.debugLine="SetAttrSingle(\"text\", varText)";
_setattrsingle("text",BA.ObjectToString(_vartext));
 //BA.debugLineNum = 411;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 413;BA.debugLine="Dim pp As String = $\"${ID}Text\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Text");
 //BA.debugLineNum = 414;BA.debugLine="vue.SetStateSingle(pp, varText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartext));
 //BA.debugLineNum = 415;BA.debugLine="Alert.Bind(\":text\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":text",_pp);
 //BA.debugLineNum = 416;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 417;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _settextcenter() throws Exception{
 //BA.debugLineNum = 649;BA.debugLine="Sub SetTextCenter As VMAlert";
 //BA.debugLineNum = 650;BA.debugLine="Alert.AddClass(\"text-center\")";
_alert._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 651;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 652;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _settextcolor(String _textcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 666;BA.debugLine="Sub SetTextColor(textcolor As String) As VMAlert";
 //BA.debugLineNum = 667;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 668;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 669;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 670;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 671;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _settextcolorintensity(String _textcolor,String _textintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 674;BA.debugLine="Sub SetTextColorIntensity(textcolor As String, tex";
 //BA.debugLineNum = 675;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 676;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 677;BA.debugLine="Dim sIntensity As String = $\"text--${textintensit";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_textintensity))+"");
 //BA.debugLineNum = 678;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 679;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 680;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 681;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _settile(boolean _vartile) throws Exception{
String _pp = "";
 //BA.debugLineNum = 420;BA.debugLine="Sub SetTile(varTile As Boolean) As VMAlert";
 //BA.debugLineNum = 421;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 422;BA.debugLine="SetAttrSingle(\"tile\", varTile)";
_setattrsingle("tile",BA.ObjectToString(_vartile));
 //BA.debugLineNum = 423;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 425;BA.debugLine="Dim pp As String = $\"${ID}Tile\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tile");
 //BA.debugLineNum = 426;BA.debugLine="vue.SetStateSingle(pp, varTile)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartile));
 //BA.debugLineNum = 427;BA.debugLine="Alert.Bind(\":tile\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":tile",_pp);
 //BA.debugLineNum = 428;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 429;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _settransition(String _vartransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 286;BA.debugLine="Sub SetTransition(varTransition As String) As VMAl";
 //BA.debugLineNum = 287;BA.debugLine="If varTransition = \"\" Then Return Me";
if ((_vartransition).equals("")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 288;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 289;BA.debugLine="SetAttrSingle(\"transition\", varTransition)";
_setattrsingle("transition",_vartransition);
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 292;BA.debugLine="Dim pp As String = $\"${ID}Transition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Transition");
 //BA.debugLineNum = 293;BA.debugLine="vue.SetStateSingle(pp, varTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartransition));
 //BA.debugLineNum = 294;BA.debugLine="Alert.Bind(\":transition\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":transition",_pp);
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _settype(String _vartype) throws Exception{
String _pp = "";
 //BA.debugLineNum = 299;BA.debugLine="Sub SetType(varType As String) As VMAlert";
 //BA.debugLineNum = 300;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 301;BA.debugLine="SetAttrSingle(\"type\", varType)";
_setattrsingle("type",_vartype);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 304;BA.debugLine="Dim pp As String = $\"${ID}Type\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Type");
 //BA.debugLineNum = 305;BA.debugLine="vue.SetStateSingle(pp, varType)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartype));
 //BA.debugLineNum = 306;BA.debugLine="Alert.Bind(\":type\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":type",_pp);
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setvalue(boolean _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 432;BA.debugLine="Sub SetValue(varValue As Boolean) As VMAlert";
 //BA.debugLineNum = 433;BA.debugLine="If varValue = False Then Return Me";
if (_varvalue==__c.False) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 434;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 435;BA.debugLine="SetAttrSingle(\"value\", varValue)";
_setattrsingle("value",BA.ObjectToString(_varvalue));
 //BA.debugLineNum = 436;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 438;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 439;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue));
 //BA.debugLineNum = 440;BA.debugLine="Alert.Bind(\":value\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":value",_pp);
 //BA.debugLineNum = 441;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 442;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 579;BA.debugLine="Sub SetVElse(vif As String) As VMAlert";
 //BA.debugLineNum = 580;BA.debugLine="Alert.SetVElse(vif)";
_alert._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 581;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 582;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 602;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 603;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 604;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 605;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 606;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 607;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 608;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 589;BA.debugLine="Sub SetVhtml(vhtml As String) As VMAlert";
 //BA.debugLineNum = 590;BA.debugLine="Alert.SetVHtml(vhtml)";
_alert._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 591;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 592;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetVIf(vif As String) As VMAlert";
 //BA.debugLineNum = 67;BA.debugLine="Alert.SetVIf(vif)";
_alert._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetVModel(k As String) As VMAlert";
 //BA.debugLineNum = 61;BA.debugLine="smodel = k";
_smodel = _k;
 //BA.debugLineNum = 62;BA.debugLine="Alert.SetVModel(k)";
_alert._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 584;BA.debugLine="Sub SetVText(vhtml As String) As VMAlert";
 //BA.debugLineNum = 585;BA.debugLine="Alert.SetVText(vhtml)";
_alert._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 586;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 587;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setwidth(String _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 311;BA.debugLine="Sub SetWidth(varWidth As String) As VMAlert";
 //BA.debugLineNum = 312;BA.debugLine="If varWidth = \"\" Then Return Me";
if ((_varwidth).equals("")) { 
if (true) return (b4j.example.vmalert)(this);};
 //BA.debugLineNum = 313;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 314;BA.debugLine="SetAttrSingle(\"width\", varWidth)";
_setattrsingle("width",_varwidth);
 //BA.debugLineNum = 315;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 317;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 318;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varwidth));
 //BA.debugLineNum = 319;BA.debugLine="Alert.Bind(\":width\", pp)";
_alert._bind /*b4j.example.vmelement*/ (":width",_pp);
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _show() throws Exception{
 //BA.debugLineNum = 464;BA.debugLine="Sub Show As VMAlert";
 //BA.debugLineNum = 465;BA.debugLine="vue.SetData(smodel, True)";
_vue._setdata /*b4j.example.bananovue*/ (_smodel,(Object)(__c.True));
 //BA.debugLineNum = 466;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 56;BA.debugLine="If Container.HasContent Then AddComponent(Contain";
if (_container._hascontent /*boolean*/ ) { 
_addcomponent(_container._tostring /*String*/ ());};
 //BA.debugLineNum = 57;BA.debugLine="Return Alert.ToString";
if (true) return _alert._tostring /*String*/ ();
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmalert  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 496;BA.debugLine="Sub UseTheme(themeName As String) As VMAlert";
 //BA.debugLineNum = 497;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 498;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 499;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 500;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 501;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 503;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 504;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
