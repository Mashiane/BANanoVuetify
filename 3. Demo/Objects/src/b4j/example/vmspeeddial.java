package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmspeeddial extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmspeeddial", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmspeeddial.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _speeddial = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public b4j.example.vmtemplate _slot = null;
public b4j.example.vmbutton _button = null;
public b4j.example.vmicon _initialicon = null;
public b4j.example.vmicon _finalicon = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public boolean _bstatic = false;
public boolean _hasinitial = false;
public boolean _hasfinal = false;
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
public b4j.example.vmspeeddial  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 244;BA.debugLine="Sub AddChild(child As VMElement) As VMSpeedDial";
 //BA.debugLineNum = 245;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 246;BA.debugLine="SpeedDial.SetText(childHTML)";
_speeddial._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 280;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 281;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 282;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmspeeddial  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Sub AddClass(c As String) As VMSpeedDial";
 //BA.debugLineNum = 263;BA.debugLine="SpeedDial.AddClass(c)";
_speeddial._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _additem(String _key,String _iconname,String _color) throws Exception{
b4j.example.vmbutton _btn = null;
b4j.example.vmicon _icn = null;
 //BA.debugLineNum = 115;BA.debugLine="Sub AddItem(key As String, iconName As String, col";
 //BA.debugLineNum = 116;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 117;BA.debugLine="btn.Initialize(vue, key, Module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_key,_module);
 //BA.debugLineNum = 118;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 119;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 120;BA.debugLine="btn.SetFab(True)";
_btn._setfab /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 121;BA.debugLine="btn.SetDark(True)";
_btn._setdark /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 122;BA.debugLine="btn.SetSmall(True)";
_btn._setsmall /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 123;BA.debugLine="btn.SetColor(color)";
_btn._setcolor /*b4j.example.vmbutton*/ (_color);
 //BA.debugLineNum = 125;BA.debugLine="Dim icn As VMIcon";
_icn = new b4j.example.vmicon();
 //BA.debugLineNum = 126;BA.debugLine="icn.Initialize(vue, $\"${key}icon\"$, Module)";
_icn._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_key))+"icon"),_module);
 //BA.debugLineNum = 127;BA.debugLine="icn.SetStatic(bStatic)";
_icn._setstatic /*b4j.example.vmicon*/ (_bstatic);
 //BA.debugLineNum = 128;BA.debugLine="icn.SetDesignMode(DesignMode)";
_icn._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 129;BA.debugLine="icn.SetText(iconName)";
_icn._settext /*b4j.example.vmicon*/ (_iconname);
 //BA.debugLineNum = 130;BA.debugLine="btn.AddComponent(icn.ToString)";
_btn._addcomponent /*b4j.example.vmbutton*/ (_icn._tostring /*String*/ ());
 //BA.debugLineNum = 132;BA.debugLine="items.Add(btn.ToString)";
_items.Add((Object)(_btn._tostring /*String*/ ()));
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 610;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 611;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 612;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmspeeddial  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 542;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 543;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 544;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 545;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 546;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 614;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 615;BA.debugLine="SpeedDial.BuildModel(mprops, mstyles, lclasses, lo";
_speeddial._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 616;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 617;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public SpeedDial As VMElement";
_speeddial = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private Slot As VMTemplate";
_slot = new b4j.example.vmtemplate();
 //BA.debugLineNum = 10;BA.debugLine="Public Button As VMButton";
_button = new b4j.example.vmbutton();
 //BA.debugLineNum = 11;BA.debugLine="Public InitialIcon As VMIcon";
_initialicon = new b4j.example.vmicon();
 //BA.debugLineNum = 12;BA.debugLine="Public FinalIcon As VMIcon";
_finalicon = new b4j.example.vmicon();
 //BA.debugLineNum = 13;BA.debugLine="Private items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 14;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 15;BA.debugLine="Private hasInitial As Boolean";
_hasinitial = false;
 //BA.debugLineNum = 16;BA.debugLine="Private hasFinal As Boolean";
_hasfinal = false;
 //BA.debugLineNum = 17;BA.debugLine="Private smodel As String";
_smodel = "";
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmspeeddial  _disable() throws Exception{
 //BA.debugLineNum = 535;BA.debugLine="Sub Disable As VMSpeedDial";
 //BA.debugLineNum = 536;BA.debugLine="SpeedDial.Disable(True)";
_speeddial._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 537;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _enable() throws Exception{
 //BA.debugLineNum = 530;BA.debugLine="Sub Enable As VMSpeedDial";
 //BA.debugLineNum = 531;BA.debugLine="SpeedDial.Enable(True)";
_speeddial._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 532;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 533;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _hide() throws Exception{
 //BA.debugLineNum = 520;BA.debugLine="Sub Hide As VMSpeedDial";
 //BA.debugLineNum = 521;BA.debugLine="vue.SetStateSingle(smodel, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_smodel,(Object)(__c.False));
 //BA.debugLineNum = 522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 22;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 23;BA.debugLine="SpeedDial.Initialize(v, ID)";
_speeddial._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 24;BA.debugLine="SpeedDial.SetTag(\"v-speed-dial\")";
_speeddial._settag /*b4j.example.vmelement*/ ("v-speed-dial");
 //BA.debugLineNum = 25;BA.debugLine="SpeedDial.SetVModel(SpeedDial.showkey)";
_speeddial._setvmodel /*b4j.example.vmelement*/ (_speeddial._showkey /*String*/ );
 //BA.debugLineNum = 26;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 27;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 28;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 29;BA.debugLine="Slot.Initialize(vue, $\"${ID}slot\"$, Module)";
_slot._initialize /*b4j.example.vmtemplate*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"slot"),_module);
 //BA.debugLineNum = 30;BA.debugLine="Button.Initialize(vue, $\"${ID}btn\"$, Module)";
_button._initialize /*b4j.example.vmbutton*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"btn"),_module);
 //BA.debugLineNum = 31;BA.debugLine="Button.SetVModel(SpeedDial.showkey)";
_button._setvmodel /*b4j.example.vmbutton*/ (_speeddial._showkey /*String*/ );
 //BA.debugLineNum = 32;BA.debugLine="InitialIcon.Initialize(vue, $\"${ID}initial\"$, Mod";
_initialicon._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"initial"),_module);
 //BA.debugLineNum = 33;BA.debugLine="InitialIcon.SetAttrLoose(\"v-else\")";
_initialicon._setattrloose /*b4j.example.vmicon*/ ("v-else");
 //BA.debugLineNum = 34;BA.debugLine="FinalIcon.Initialize(vue,$\"${ID}finalicon\"$, Modu";
_finalicon._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"finalicon"),_module);
 //BA.debugLineNum = 35;BA.debugLine="FinalIcon.SetVIf(SpeedDial.showkey)";
_finalicon._setvif /*b4j.example.vmicon*/ (_speeddial._showkey /*String*/ );
 //BA.debugLineNum = 36;BA.debugLine="Hide";
_hide();
 //BA.debugLineNum = 37;BA.debugLine="items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 38;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 39;BA.debugLine="hasInitial = False";
_hasinitial = __c.False;
 //BA.debugLineNum = 40;BA.debugLine="hasFinal = False";
_hasfinal = __c.False;
 //BA.debugLineNum = 41;BA.debugLine="SetOnClick($\"${ID}_click\"$)";
_setonclick((""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 258;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmspeeddial  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 549;BA.debugLine="public Sub RemoveAttr(sName As String) As VMSpeedD";
 //BA.debugLineNum = 550;BA.debugLine="SpeedDial.RemoveAttr(sName)";
_speeddial._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 551;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 552;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _removevmodel() throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub RemoveVModel As VMSpeedDial";
 //BA.debugLineNum = 53;BA.debugLine="RemoveAttr(\"v-model\")";
_removeattr("v-model");
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub Render";
 //BA.debugLineNum = 240;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmspeeddial  _setabsolute(boolean _varabsolute) throws Exception{
String _pp = "";
 //BA.debugLineNum = 287;BA.debugLine="Sub SetAbsolute(varAbsolute As Boolean) As VMSpeed";
 //BA.debugLineNum = 288;BA.debugLine="If varAbsolute = False Then Return Me";
if (_varabsolute==__c.False) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 289;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 290;BA.debugLine="SetAttrSingle(\"absolute\", varAbsolute)";
_setattrsingle("absolute",BA.ObjectToString(_varabsolute));
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 293;BA.debugLine="Dim pp As String = $\"${ID}Absolute\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Absolute");
 //BA.debugLineNum = 294;BA.debugLine="vue.SetStateSingle(pp, varAbsolute)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varabsolute));
 //BA.debugLineNum = 295;BA.debugLine="SpeedDial.Bind(\":absolute\", pp)";
_speeddial._bind /*b4j.example.vmelement*/ (":absolute",_pp);
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub SetAttr(attr As Map) As VMSpeedDial";
 //BA.debugLineNum = 269;BA.debugLine="SpeedDial.SetAttr(attr)";
_speeddial._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 108;BA.debugLine="Sub SetAttributes(attrs As List) As VMSpeedDial";
 //BA.debugLineNum = 109;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 110;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetAttrLoose(loose As String) As VMSpeedDial";
 //BA.debugLineNum = 104;BA.debugLine="SpeedDial.SetAttrLoose(loose)";
_speeddial._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 592;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 593;BA.debugLine="SpeedDial.SetAttrSingle(prop, value)";
_speeddial._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 594;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 595;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setbottom(boolean _varbottom) throws Exception{
String _pp = "";
 //BA.debugLineNum = 300;BA.debugLine="Sub SetBottom(varBottom As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 301;BA.debugLine="If varBottom = False Then Return Me";
if (_varbottom==__c.False) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 302;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 303;BA.debugLine="SetAttrSingle(\"bottom\", varBottom)";
_setattrsingle("bottom",BA.ObjectToString(_varbottom));
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 306;BA.debugLine="Dim pp As String = $\"${ID}Bottom\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Bottom");
 //BA.debugLineNum = 307;BA.debugLine="vue.SetStateSingle(pp, varBottom)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbottom));
 //BA.debugLineNum = 308;BA.debugLine="SpeedDial.Bind(\":bottom\", pp)";
_speeddial._bind /*b4j.example.vmelement*/ (":bottom",_pp);
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 163;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 164;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 165;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 166;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 167;BA.debugLine="Button.SetAttrSingle(\"color\", scolor)";
_button._setattrsingle /*b4j.example.vmbutton*/ ("color",_scolor);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 170;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 171;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 172;BA.debugLine="Button.Bind(\":color\", pp)";
_button._bind /*b4j.example.vmbutton*/ (":color",_pp);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 177;BA.debugLine="Sub SetDark(varDark As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 178;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 179;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 180;BA.debugLine="Button.SetAttrSingle(\"dark\", varDark)";
_button._setattrsingle /*b4j.example.vmbutton*/ ("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 183;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 184;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 185;BA.debugLine="Button.Bind(\":dark\", pp)";
_button._bind /*b4j.example.vmbutton*/ (":dark",_pp);
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 46;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 565;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 566;BA.debugLine="SpeedDial.SetDesignMode(b)";
_speeddial._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 567;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 568;BA.debugLine="Slot.SetDesignMode(b)";
_slot._setdesignmode /*b4j.example.vmtemplate*/ (_b);
 //BA.debugLineNum = 569;BA.debugLine="Button.SetDesignMode(b)";
_button._setdesignmode /*b4j.example.vmbutton*/ (_b);
 //BA.debugLineNum = 570;BA.debugLine="InitialIcon.SetDesignMode(b)";
_initialicon._setdesignmode /*b4j.example.vmicon*/ (_b);
 //BA.debugLineNum = 571;BA.debugLine="FinalIcon.SetDesignMode(b)";
_finalicon._setdesignmode /*b4j.example.vmicon*/ (_b);
 //BA.debugLineNum = 572;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 573;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 86;BA.debugLine="SpeedDial.SetDeviceOffsets(OS, OM, OL, OX)";
_speeddial._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 98;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 99;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 92;BA.debugLine="SpeedDial.SetDeviceSizes(SS, SM, SL, SX)";
_speeddial._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setdirection(String _vardirection) throws Exception{
String _pp = "";
 //BA.debugLineNum = 313;BA.debugLine="Sub SetDirection(varDirection As String) As VMSpee";
 //BA.debugLineNum = 314;BA.debugLine="If varDirection = \"\" Then Return Me";
if ((_vardirection).equals("")) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 315;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 316;BA.debugLine="SetAttrSingle(\"direction\", varDirection)";
_setattrsingle("direction",_vardirection);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 319;BA.debugLine="Dim pp As String = $\"${ID}Direction\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Direction");
 //BA.debugLineNum = 320;BA.debugLine="vue.SetStateSingle(pp, varDirection)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardirection));
 //BA.debugLineNum = 321;BA.debugLine="SpeedDial.Bind(\":direction\", pp)";
_speeddial._bind /*b4j.example.vmelement*/ (":direction",_pp);
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setfinalicon(String _iconname) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetFinalIcon(iconName As String) As VMSpeedDia";
 //BA.debugLineNum = 145;BA.debugLine="If iconName = \"\" Then Return Me";
if ((_iconname).equals("")) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 146;BA.debugLine="FinalIcon.SetText(iconName)";
_finalicon._settext /*b4j.example.vmicon*/ (_iconname);
 //BA.debugLineNum = 147;BA.debugLine="hasFinal = True";
_hasfinal = __c.True;
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setfixed(boolean _varfixed) throws Exception{
String _pp = "";
 //BA.debugLineNum = 378;BA.debugLine="Sub SetFixed(varFixed As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 379;BA.debugLine="If varFixed = False Then Return Me";
if (_varfixed==__c.False) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 380;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 381;BA.debugLine="SetAttrSingle(\"fixed\", varFixed)";
_setattrsingle("fixed",BA.ObjectToString(_varfixed));
 //BA.debugLineNum = 382;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 384;BA.debugLine="Dim pp As String = $\"${ID}Fixed\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Fixed");
 //BA.debugLineNum = 385;BA.debugLine="vue.SetStateSingle(pp, varFixed)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfixed));
 //BA.debugLineNum = 386;BA.debugLine="SpeedDial.Bind(\":fixed\", pp)";
_speeddial._bind /*b4j.example.vmelement*/ (":fixed",_pp);
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _sethref(String _varhref) throws Exception{
String _pp = "";
 //BA.debugLineNum = 365;BA.debugLine="Sub SetHref(varHref As String) As VMSpeedDial";
 //BA.debugLineNum = 366;BA.debugLine="If varHref = \"\" Then Return Me";
if ((_varhref).equals("")) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 367;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 368;BA.debugLine="Button.SetAttrSingle(\"href\", varHref)";
_button._setattrsingle /*b4j.example.vmbutton*/ ("href",_varhref);
 //BA.debugLineNum = 369;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 371;BA.debugLine="Dim pp As String = $\"${ID}Href\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Href");
 //BA.debugLineNum = 372;BA.debugLine="vue.SetStateSingle(pp, varHref)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhref));
 //BA.debugLineNum = 373;BA.debugLine="Button.Bind(\":href\", pp)";
_button._bind /*b4j.example.vmbutton*/ (":href",_pp);
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _seticon(String _iconname) throws Exception{
b4j.example.vmicon _icon = null;
 //BA.debugLineNum = 598;BA.debugLine="Sub SetIcon(iconName As String) As VMSpeedDial";
 //BA.debugLineNum = 599;BA.debugLine="If iconName = \"\" Then Return Me";
if ((_iconname).equals("")) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 600;BA.debugLine="Dim icon As VMIcon";
_icon = new b4j.example.vmicon();
 //BA.debugLineNum = 601;BA.debugLine="icon.Initialize(vue, $\"${ID}icon\"$, Module)";
_icon._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"icon"),_module);
 //BA.debugLineNum = 602;BA.debugLine="icon.SetStatic(bStatic)";
_icon._setstatic /*b4j.example.vmicon*/ (_bstatic);
 //BA.debugLineNum = 603;BA.debugLine="icon.SetDesignMode(DesignMode)";
_icon._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 604;BA.debugLine="icon.SetText(iconName)";
_icon._settext /*b4j.example.vmicon*/ (_iconname);
 //BA.debugLineNum = 605;BA.debugLine="Button.AddComponent(icon.ToString)";
_button._addcomponent /*b4j.example.vmbutton*/ (_icon._tostring /*String*/ ());
 //BA.debugLineNum = 606;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 607;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setinitialicon(String _iconname) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetInitialIcon(iconName As String) As VMSpeedD";
 //BA.debugLineNum = 137;BA.debugLine="If iconName = \"\" Then Return Me";
if ((_iconname).equals("")) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 138;BA.debugLine="InitialIcon.SetText(iconName)";
_initialicon._settext /*b4j.example.vmicon*/ (_iconname);
 //BA.debugLineNum = 139;BA.debugLine="hasInitial = True";
_hasinitial = __c.True;
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setlarge(boolean _varlarge) throws Exception{
String _pp = "";
 //BA.debugLineNum = 190;BA.debugLine="Sub SetLarge(varLarge As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 191;BA.debugLine="If varLarge = False Then Return Me";
if (_varlarge==__c.False) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 192;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 193;BA.debugLine="Button.SetAttrSingle(\"large\", varLarge)";
_button._setattrsingle /*b4j.example.vmbutton*/ ("large",BA.ObjectToString(_varlarge));
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 196;BA.debugLine="Dim pp As String = $\"${ID}Large\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Large");
 //BA.debugLineNum = 197;BA.debugLine="vue.SetStateSingle(pp, varLarge)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlarge));
 //BA.debugLineNum = 198;BA.debugLine="Button.Bind(\":large\", pp)";
_button._bind /*b4j.example.vmbutton*/ (":large",_pp);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setleft(boolean _varleft) throws Exception{
String _pp = "";
 //BA.debugLineNum = 417;BA.debugLine="Sub SetLeft(varLeft As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 418;BA.debugLine="If varLeft = False Then Return Me";
if (_varleft==__c.False) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 419;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 420;BA.debugLine="SetAttrSingle(\"left\", varLeft)";
_setattrsingle("left",BA.ObjectToString(_varleft));
 //BA.debugLineNum = 421;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 423;BA.debugLine="Dim pp As String = $\"${ID}Left\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Left");
 //BA.debugLineNum = 424;BA.debugLine="vue.SetStateSingle(pp, varLeft)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varleft));
 //BA.debugLineNum = 425;BA.debugLine="SpeedDial.Bind(\":left\", pp)";
_speeddial._bind /*b4j.example.vmelement*/ (":left",_pp);
 //BA.debugLineNum = 426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 560;BA.debugLine="Sub SetMarginAll(p As String) As VMSpeedDial";
 //BA.debugLineNum = 561;BA.debugLine="SpeedDial.setmarginall(p)";
_speeddial._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 562;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setmode(String _varmode) throws Exception{
String _pp = "";
 //BA.debugLineNum = 430;BA.debugLine="Sub SetMode(varMode As String) As VMSpeedDial";
 //BA.debugLineNum = 431;BA.debugLine="If varMode = \"\" Then Return Me";
if ((_varmode).equals("")) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 432;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 433;BA.debugLine="SetAttrSingle(\"mode\", varMode)";
_setattrsingle("mode",_varmode);
 //BA.debugLineNum = 434;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 436;BA.debugLine="Dim pp As String = $\"${ID}Mode\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Mode");
 //BA.debugLineNum = 437;BA.debugLine="vue.SetStateSingle(pp, varMode)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmode));
 //BA.debugLineNum = 438;BA.debugLine="SpeedDial.Bind(\":mode\", pp)";
_speeddial._bind /*b4j.example.vmelement*/ (":mode",_pp);
 //BA.debugLineNum = 439;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 440;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 581;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 582;BA.debugLine="SpeedDial.SetName(varName, bbind)";
_speeddial._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 583;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 584;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setonclick(String _methodname) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetOnClick(methodName As String) As VMSpeedDia";
 //BA.debugLineNum = 64;BA.debugLine="Button.SetOnClick(methodName)";
_button._setonclick /*b4j.example.vmbutton*/ (_methodname);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setopenonhover(boolean _varopenonhover) throws Exception{
String _pp = "";
 //BA.debugLineNum = 443;BA.debugLine="Sub SetOpenOnHover(varOpenOnHover As Boolean) As V";
 //BA.debugLineNum = 444;BA.debugLine="If varOpenOnHover = False Then Return Me";
if (_varopenonhover==__c.False) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 445;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 446;BA.debugLine="SetAttrSingle(\"open-on-hover\", varOpenOnHover)";
_setattrsingle("open-on-hover",BA.ObjectToString(_varopenonhover));
 //BA.debugLineNum = 447;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 449;BA.debugLine="Dim pp As String = $\"${ID}OpenOnHover\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OpenOnHover");
 //BA.debugLineNum = 450;BA.debugLine="vue.SetStateSingle(pp, varOpenOnHover)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varopenonhover));
 //BA.debugLineNum = 451;BA.debugLine="SpeedDial.Bind(\":open-on-hover\", pp)";
_speeddial._bind /*b4j.example.vmelement*/ (":open-on-hover",_pp);
 //BA.debugLineNum = 452;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 453;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setorigin(String _varorigin) throws Exception{
String _pp = "";
 //BA.debugLineNum = 456;BA.debugLine="Sub SetOrigin(varOrigin As String) As VMSpeedDial";
 //BA.debugLineNum = 457;BA.debugLine="If varOrigin = \"\" Then Return Me";
if ((_varorigin).equals("")) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 458;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 459;BA.debugLine="SetAttrSingle(\"origin\", varOrigin)";
_setattrsingle("origin",_varorigin);
 //BA.debugLineNum = 460;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 462;BA.debugLine="Dim pp As String = $\"${ID}Origin\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Origin");
 //BA.debugLineNum = 463;BA.debugLine="vue.SetStateSingle(pp, varOrigin)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varorigin));
 //BA.debugLineNum = 464;BA.debugLine="SpeedDial.Bind(\":origin\", pp)";
_speeddial._bind /*b4j.example.vmelement*/ (":origin",_pp);
 //BA.debugLineNum = 465;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 466;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 555;BA.debugLine="Sub SetPaddingAll(p As String) As VMSpeedDial";
 //BA.debugLineNum = 556;BA.debugLine="SpeedDial.SetPaddingAll(p)";
_speeddial._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 557;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 558;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMSpe";
 //BA.debugLineNum = 80;BA.debugLine="SpeedDial.SetRC(sRow, sCol)";
_speeddial._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setright(boolean _varright) throws Exception{
String _pp = "";
 //BA.debugLineNum = 469;BA.debugLine="Sub SetRight(varRight As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 470;BA.debugLine="If varRight = False Then Return Me";
if (_varright==__c.False) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 471;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 472;BA.debugLine="SetAttrSingle(\"right\", varRight)";
_setattrsingle("right",BA.ObjectToString(_varright));
 //BA.debugLineNum = 473;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 475;BA.debugLine="Dim pp As String = $\"${ID}Right\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Right");
 //BA.debugLineNum = 476;BA.debugLine="vue.SetStateSingle(pp, varRight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varright));
 //BA.debugLineNum = 477;BA.debugLine="SpeedDial.Bind(\":right\", pp)";
_speeddial._bind /*b4j.example.vmelement*/ (":right",_pp);
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setslotactivator(boolean _b) throws Exception{
 //BA.debugLineNum = 514;BA.debugLine="Sub SetSlotActivator(b As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 515;BA.debugLine="SetAttr(CreateMap(\"slot\": \"activator\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("activator")}));
 //BA.debugLineNum = 516;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 517;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setsmall(boolean _varsmall) throws Exception{
String _pp = "";
 //BA.debugLineNum = 326;BA.debugLine="Sub SetSmall(varSmall As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 327;BA.debugLine="If varSmall = False Then Return Me";
if (_varsmall==__c.False) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 328;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 329;BA.debugLine="Button.SetAttrSingle(\"small\", varSmall)";
_button._setattrsingle /*b4j.example.vmbutton*/ ("small",BA.ObjectToString(_varsmall));
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 332;BA.debugLine="Dim pp As String = $\"${ID}Small\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Small");
 //BA.debugLineNum = 333;BA.debugLine="vue.SetStateSingle(pp, varSmall)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsmall));
 //BA.debugLineNum = 334;BA.debugLine="Button.Bind(\":small\", pp)";
_button._bind /*b4j.example.vmbutton*/ (":small",_pp);
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetStatic(b As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 69;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 70;BA.debugLine="SpeedDial.SetStatic(b)";
_speeddial._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 71;BA.debugLine="Slot.SetStatic(b)";
_slot._setstatic /*b4j.example.vmtemplate*/ (_b);
 //BA.debugLineNum = 72;BA.debugLine="Button.SetStatic(b)";
_button._setstatic /*b4j.example.vmbutton*/ (_b);
 //BA.debugLineNum = 73;BA.debugLine="InitialIcon.SetStatic(b)";
_initialicon._setstatic /*b4j.example.vmicon*/ (_b);
 //BA.debugLineNum = 74;BA.debugLine="FinalIcon.SetStatic(b)";
_finalicon._setstatic /*b4j.example.vmicon*/ (_b);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub SetStyle(sm As Map) As VMSpeedDial";
 //BA.debugLineNum = 275;BA.debugLine="SpeedDial.SetStyle(sm)";
_speeddial._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 587;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 588;BA.debugLine="SpeedDial.SetStyleSingle(prop, value)";
_speeddial._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 589;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 575;BA.debugLine="Sub SetTabIndex(ti As String) As VMSpeedDial";
 //BA.debugLineNum = 576;BA.debugLine="SpeedDial.SetTabIndex(ti)";
_speeddial._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 577;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 578;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _settarget(String _vartarget) throws Exception{
String _pp = "";
 //BA.debugLineNum = 391;BA.debugLine="Sub SetTarget(varTarget As String) As VMSpeedDial";
 //BA.debugLineNum = 392;BA.debugLine="If varTarget = \"\" Then Return Me";
if ((_vartarget).equals("")) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 393;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 394;BA.debugLine="Button.SetAttrSingle(\"target\", varTarget)";
_button._setattrsingle /*b4j.example.vmbutton*/ ("target",_vartarget);
 //BA.debugLineNum = 395;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 397;BA.debugLine="Dim pp As String = $\"${ID}Target\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Target");
 //BA.debugLineNum = 398;BA.debugLine="vue.SetStateSingle(pp, varTarget)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartarget));
 //BA.debugLineNum = 399;BA.debugLine="Button.Bind(\":target\", pp)";
_button._bind /*b4j.example.vmbutton*/ (":target",_pp);
 //BA.debugLineNum = 400;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetText(t As Object) As VMSpeedDial";
 //BA.debugLineNum = 252;BA.debugLine="SpeedDial.SetText(t)";
_speeddial._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _settextcolor(String _textcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 620;BA.debugLine="Sub SetTextColor(textcolor As String) As VMSpeedDi";
 //BA.debugLineNum = 621;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 622;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 623;BA.debugLine="Button.AddClass(sColor)";
_button._addclass /*b4j.example.vmbutton*/ (_scolor);
 //BA.debugLineNum = 624;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 625;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _settextcolorintensity(String _textcolor,String _textcolorintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 628;BA.debugLine="Sub SetTextColorIntensity(textcolor As String, tex";
 //BA.debugLineNum = 629;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 630;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 631;BA.debugLine="Dim sIntensity As String = $\"text--${textcolorint";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_textcolorintensity))+"");
 //BA.debugLineNum = 632;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 633;BA.debugLine="Button.AddClass(mcolor)";
_button._addclass /*b4j.example.vmbutton*/ (_mcolor);
 //BA.debugLineNum = 634;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 635;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setto(String _varto) throws Exception{
String _pp = "";
 //BA.debugLineNum = 404;BA.debugLine="Sub SetTo(varTo As String) As VMSpeedDial";
 //BA.debugLineNum = 405;BA.debugLine="If varTo = \"\" Then Return Me";
if ((_varto).equals("")) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 406;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 407;BA.debugLine="Button.SetAttrSingle(\"to\", varTo)";
_button._setattrsingle /*b4j.example.vmbutton*/ ("to",_varto);
 //BA.debugLineNum = 408;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 410;BA.debugLine="Dim pp As String = $\"${ID}To\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"To");
 //BA.debugLineNum = 411;BA.debugLine="vue.SetStateSingle(pp, varTo)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varto));
 //BA.debugLineNum = 412;BA.debugLine="Button.Bind(\":to\", pp)";
_button._bind /*b4j.example.vmbutton*/ (":to",_pp);
 //BA.debugLineNum = 413;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _settop(boolean _vartop) throws Exception{
String _pp = "";
 //BA.debugLineNum = 482;BA.debugLine="Sub SetTop(varTop As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 483;BA.debugLine="If varTop = False Then Return Me";
if (_vartop==__c.False) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 484;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 485;BA.debugLine="SetAttrSingle(\"top\", varTop)";
_setattrsingle("top",BA.ObjectToString(_vartop));
 //BA.debugLineNum = 486;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 488;BA.debugLine="Dim pp As String = $\"${ID}Top\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Top");
 //BA.debugLineNum = 489;BA.debugLine="vue.SetStateSingle(pp, varTop)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartop));
 //BA.debugLineNum = 490;BA.debugLine="SpeedDial.Bind(\":top\", pp)";
_speeddial._bind /*b4j.example.vmelement*/ (":top",_pp);
 //BA.debugLineNum = 491;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 492;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _settransition(String _vartransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 495;BA.debugLine="Sub SetTransition(varTransition As String) As VMSp";
 //BA.debugLineNum = 496;BA.debugLine="If varTransition = \"\" Then Return Me";
if ((_vartransition).equals("")) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 497;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 498;BA.debugLine="SetAttrSingle(\"transition\", varTransition)";
_setattrsingle("transition",_vartransition);
 //BA.debugLineNum = 499;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 501;BA.debugLine="Dim pp As String = $\"${ID}Transition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Transition");
 //BA.debugLineNum = 502;BA.debugLine="vue.SetStateSingle(pp, varTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartransition));
 //BA.debugLineNum = 503;BA.debugLine="SpeedDial.Bind(\":transition\", pp)";
_speeddial._bind /*b4j.example.vmelement*/ (":transition",_pp);
 //BA.debugLineNum = 504;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 508;BA.debugLine="Sub SetValue(varValue As String) As VMSpeedDial";
 //BA.debugLineNum = 509;BA.debugLine="SpeedDial.SetValue(varValue, False)";
_speeddial._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 510;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 511;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetVIf(vif As String) As VMSpeedDial";
 //BA.debugLineNum = 229;BA.debugLine="SpeedDial.SetVIf(vif)";
_speeddial._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetVModel(k As String) As VMSpeedDial";
 //BA.debugLineNum = 223;BA.debugLine="smodel = k";
_smodel = _k;
 //BA.debugLineNum = 224;BA.debugLine="SpeedDial.SetVModel(k)";
_speeddial._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setvonce(boolean _t) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetVOnce(t As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 58;BA.debugLine="SpeedDial.setvonce(t)";
_speeddial._setvonce /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub SetVShow(vif As String) As VMSpeedDial";
 //BA.debugLineNum = 234;BA.debugLine="SpeedDial.SetVShow(vif)";
_speeddial._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setxlarge(boolean _varxlarge) throws Exception{
String _pp = "";
 //BA.debugLineNum = 339;BA.debugLine="Sub SetXLarge(varXLarge As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 340;BA.debugLine="If varXLarge = False Then Return Me";
if (_varxlarge==__c.False) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 341;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 342;BA.debugLine="Button.SetAttrSingle(\"x-large\", varXLarge)";
_button._setattrsingle /*b4j.example.vmbutton*/ ("x-large",BA.ObjectToString(_varxlarge));
 //BA.debugLineNum = 343;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 345;BA.debugLine="Dim pp As String = $\"${ID}XLarge\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"XLarge");
 //BA.debugLineNum = 346;BA.debugLine="vue.SetStateSingle(pp, varXLarge)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varxlarge));
 //BA.debugLineNum = 347;BA.debugLine="Button.Bind(\":x-large\", pp)";
_button._bind /*b4j.example.vmbutton*/ (":x-large",_pp);
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setxsmall(boolean _varxsmall) throws Exception{
String _pp = "";
 //BA.debugLineNum = 352;BA.debugLine="Sub SetXSmall(varXSmall As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 353;BA.debugLine="If varXSmall = False Then Return Me";
if (_varxsmall==__c.False) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 354;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 355;BA.debugLine="Button.SetAttrSingle(\"x-small\", varXSmall)";
_button._setattrsingle /*b4j.example.vmbutton*/ ("x-small",BA.ObjectToString(_varxsmall));
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 };
 //BA.debugLineNum = 358;BA.debugLine="Dim pp As String = $\"${ID}XSmall\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"XSmall");
 //BA.debugLineNum = 359;BA.debugLine="vue.SetStateSingle(pp, varXSmall)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varxsmall));
 //BA.debugLineNum = 360;BA.debugLine="Button.Bind(\":x-small\", pp)";
_button._bind /*b4j.example.vmbutton*/ (":x-small",_pp);
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _show() throws Exception{
 //BA.debugLineNum = 525;BA.debugLine="Sub Show As VMSpeedDial";
 //BA.debugLineNum = 526;BA.debugLine="vue.SetStateSingle(smodel, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_smodel,(Object)(__c.True));
 //BA.debugLineNum = 527;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 528;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
String _item = "";
 //BA.debugLineNum = 203;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 204;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 205;BA.debugLine="Dim eName As String = $\"${ID}_click\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_click");
 //BA.debugLineNum = 206;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 207;BA.debugLine="Log($\"VMSpeedDial.${eName} event has not been de";
__c.Log(("VMSpeedDial."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 210;BA.debugLine="Slot.SetSlotActivator";
_slot._setslotactivator /*b4j.example.vmtemplate*/ ();
 //BA.debugLineNum = 211;BA.debugLine="Button.SetFab(True)";
_button._setfab /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 212;BA.debugLine="If hasFinal Then FinalIcon.Pop(Button.Button)";
if (_hasfinal) { 
_finalicon._pop /*String*/ (_button._button /*b4j.example.vmelement*/ );};
 //BA.debugLineNum = 213;BA.debugLine="If hasInitial Then InitialIcon.Pop(Button.Button)";
if (_hasinitial) { 
_initialicon._pop /*String*/ (_button._button /*b4j.example.vmelement*/ );};
 //BA.debugLineNum = 214;BA.debugLine="Button.Pop(Slot.Template)";
_button._pop /*String*/ (_slot._template /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 215;BA.debugLine="Slot.Pop(SpeedDial)";
_slot._pop /*String*/ (_speeddial);
 //BA.debugLineNum = 216;BA.debugLine="For Each item As String In items";
{
final anywheresoftware.b4a.BA.IterableList group13 = _items;
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_item = BA.ObjectToString(group13.Get(index13));
 //BA.debugLineNum = 217;BA.debugLine="SpeedDial.SetText(item)";
_speeddial._settext /*b4j.example.vmelement*/ (_item);
 }
};
 //BA.debugLineNum = 219;BA.debugLine="Return SpeedDial.ToString";
if (true) return _speeddial._tostring /*String*/ ();
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmspeeddial  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 152;BA.debugLine="Sub UseTheme(themeName As String) As VMSpeedDial";
 //BA.debugLineNum = 153;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 154;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 155;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 156;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 157;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
