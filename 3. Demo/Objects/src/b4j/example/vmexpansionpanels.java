package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmexpansionpanels extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmexpansionpanels", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmexpansionpanels.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _expansionpanels = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public String _sactive = "";
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
public b4j.example.vmexpansionpanels  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 97;BA.debugLine="Sub AddChild(child As VMElement) As VMExpansionPan";
 //BA.debugLineNum = 98;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 99;BA.debugLine="ExpansionPanels.SetText(childHTML)";
_expansionpanels._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 133;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 134;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 135;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanels  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub AddClass(c As String) As VMExpansionPanels";
 //BA.debugLineNum = 116;BA.debugLine="ExpansionPanels.AddClass(c)";
_expansionpanels._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 496;BA.debugLine="Sub AddComponent(comp As String) As VMExpansionPan";
 //BA.debugLineNum = 497;BA.debugLine="ExpansionPanels.SetText(comp)";
_expansionpanels._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 498;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 499;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _addpanel(b4j.example.vmexpansionpanel _pnl) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub AddPanel(pnl As VMExpansionPanel) As VMExpansi";
 //BA.debugLineNum = 55;BA.debugLine="AddComponent(pnl.ToString)";
_addcomponent(_pnl._tostring /*String*/ ());
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public String  _addpanel1(String _pnlid,String _pnllabel,b4j.example.vmcontainer _pnlcontent) throws Exception{
b4j.example.vmexpansionpanel _tabi = null;
 //BA.debugLineNum = 59;BA.debugLine="Sub AddPanel1(pnlID As String, pnlLabel As String,";
 //BA.debugLineNum = 60;BA.debugLine="pnlID = pnlID.ToLowerCase";
_pnlid = _pnlid.toLowerCase();
 //BA.debugLineNum = 61;BA.debugLine="Dim tabi As VMExpansionPanel";
_tabi = new b4j.example.vmexpansionpanel();
 //BA.debugLineNum = 62;BA.debugLine="tabi.Initialize(vue, ID, pnlID, Module).SetStatic";
_tabi._initialize /*b4j.example.vmexpansionpanel*/ (ba,_vue,_id,_pnlid,_module)._setstatic /*b4j.example.vmexpansionpanel*/ (_bstatic)._setdesignmode /*b4j.example.vmexpansionpanel*/ (_designmode);
 //BA.debugLineNum = 63;BA.debugLine="tabi.Header.SetText(pnlLabel)";
_tabi._header /*b4j.example.vmexpansionpanelheader*/ ._settext /*b4j.example.vmexpansionpanelheader*/ (_pnllabel);
 //BA.debugLineNum = 64;BA.debugLine="tabi.SetAttrSingle(\"key\", pnlID)";
_tabi._setattrsingle /*b4j.example.vmexpansionpanel*/ ("key",_pnlid);
 //BA.debugLineNum = 65;BA.debugLine="If pnlContent <> Null Then";
if (_pnlcontent!= null) { 
 //BA.debugLineNum = 66;BA.debugLine="tabi.Content.Container = pnlContent";
_tabi._content /*b4j.example.vmexpansionpanelcontent*/ ._container /*b4j.example.vmcontainer*/  = _pnlcontent;
 };
 //BA.debugLineNum = 68;BA.debugLine="AddComponent(tabi.tostring)";
_addcomponent(_tabi._tostring /*String*/ ());
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 507;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 508;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 509;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanels  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 359;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 360;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 361;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 427;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 428;BA.debugLine="ExpansionPanels.BindStyleSingle(prop, value)";
_expansionpanels._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 429;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 430;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 511;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 512;BA.debugLine="ExpansionPanels.BuildModel(mprops, mstyles, lclass";
_expansionpanels._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 513;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 514;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ExpansionPanels As VMElement";
_expansionpanels = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private bstatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="Private sactive As String";
_sactive = "";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanels  _disable() throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Sub Disable As VMExpansionPanels";
 //BA.debugLineNum = 353;BA.debugLine="ExpansionPanels.Disable(True)";
_expansionpanels._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _enable() throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub Enable As VMExpansionPanels";
 //BA.debugLineNum = 347;BA.debugLine="ExpansionPanels.Enable(True)";
_expansionpanels._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _hide() throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub Hide As VMExpansionPanels";
 //BA.debugLineNum = 335;BA.debugLine="ExpansionPanels.SetVisible(False)";
_expansionpanels._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="ExpansionPanels.Initialize(v, ID)";
_expansionpanels._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 17;BA.debugLine="ExpansionPanels.SetTag(\"v-expansion-panels\")";
_expansionpanels._settag /*b4j.example.vmelement*/ ("v-expansion-panels");
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 21;BA.debugLine="bstatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="sactive = $\"${ID}active\"$";
_sactive = (""+__c.SmartStringFormatter("",(Object)(_id))+"active");
 //BA.debugLineNum = 23;BA.debugLine="SetVModel(sactive)";
_setvmodel(_sactive);
 //BA.debugLineNum = 24;BA.debugLine="vue.SetData(sactive, 0)";
_vue._setdata /*b4j.example.bananovue*/ (_sactive,(Object)(0));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _openpanel(String _pnl) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub OpenPanel(pnl As String) As VMExpansionPanels";
 //BA.debugLineNum = 43;BA.debugLine="SetActivePanel(pnl)";
_setactivepanel(_pnl);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 111;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanels  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 383;BA.debugLine="public Sub RemoveAttr(sName As String) As VMExpans";
 //BA.debugLineNum = 384;BA.debugLine="ExpansionPanels.RemoveAttr(sName)";
_expansionpanels._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 385;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub Render";
 //BA.debugLineNum = 93;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanels  _setaccordion(boolean _varaccordion) throws Exception{
String _pp = "";
 //BA.debugLineNum = 140;BA.debugLine="Sub SetAccordion(varAccordion As Boolean) As VMExp";
 //BA.debugLineNum = 141;BA.debugLine="If varAccordion = False Then Return Me";
if (_varaccordion==__c.False) { 
if (true) return (b4j.example.vmexpansionpanels)(this);};
 //BA.debugLineNum = 142;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 143;BA.debugLine="SetAttrSingle(\"accordion\", varAccordion)";
_setattrsingle("accordion",BA.ObjectToString(_varaccordion));
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 };
 //BA.debugLineNum = 146;BA.debugLine="Dim pp As String = $\"${ID}Accordion\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Accordion");
 //BA.debugLineNum = 147;BA.debugLine="vue.SetStateSingle(pp, varAccordion)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varaccordion));
 //BA.debugLineNum = 148;BA.debugLine="ExpansionPanels.Bind(\":accordion\", pp)";
_expansionpanels._bind /*b4j.example.vmelement*/ (":accordion",_pp);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 153;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 154;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmexpansionpanels)(this);};
 //BA.debugLineNum = 155;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 156;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 };
 //BA.debugLineNum = 159;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 160;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 161;BA.debugLine="ExpansionPanels.Bind(\":active-class\", pp)";
_expansionpanels._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setactivepanel(String _activeid) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetActivePanel(activeID As String) As VMExpans";
 //BA.debugLineNum = 49;BA.debugLine="vue.SetData(sactive, activeID)";
_vue._setdata /*b4j.example.bananovue*/ (_sactive,(Object)(_activeid));
 //BA.debugLineNum = 50;BA.debugLine="SetValue(activeID)";
_setvalue(_activeid);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetAttr(attr As Map) As VMExpansionPanels";
 //BA.debugLineNum = 122;BA.debugLine="ExpansionPanels.SetAttr(attr)";
_expansionpanels._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 447;BA.debugLine="Sub SetAttributes(attrs As List) As VMExpansionPan";
 //BA.debugLineNum = 448;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 449;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 451;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Sub SetAttrLoose(loose As String) As VMExpansionPa";
 //BA.debugLineNum = 367;BA.debugLine="ExpansionPanels.SetAttrLoose(loose)";
_expansionpanels._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 421;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 422;BA.debugLine="ExpansionPanels.SetAttrSingle(prop, value)";
_expansionpanels._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 423;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 424;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 166;BA.debugLine="Sub SetDark(varDark As Boolean) As VMExpansionPane";
 //BA.debugLineNum = 167;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmexpansionpanels)(this);};
 //BA.debugLineNum = 168;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 169;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 };
 //BA.debugLineNum = 172;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 173;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 174;BA.debugLine="ExpansionPanels.Bind(\":dark\", pp)";
_expansionpanels._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 29;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 401;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMExpansionPane";
 //BA.debugLineNum = 402;BA.debugLine="ExpansionPanels.SetDesignMode(b)";
_expansionpanels._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 403;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 404;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 476;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 477;BA.debugLine="ExpansionPanels.SetDeviceOffsets(OS, OM, OL, OX)";
_expansionpanels._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 483;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 484;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 485;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 486;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 487;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 490;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 491;BA.debugLine="ExpansionPanels.SetDeviceSizes(SS, SM, SL, SX)";
_expansionpanels._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 492;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 493;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMExpan";
 //BA.debugLineNum = 180;BA.debugLine="ExpansionPanels.SetDisabled(varDisabled)";
_expansionpanels._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setflat(boolean _varflat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 185;BA.debugLine="Sub SetFlat(varFlat As Boolean) As VMExpansionPane";
 //BA.debugLineNum = 186;BA.debugLine="If varFlat = False Then Return Me";
if (_varflat==__c.False) { 
if (true) return (b4j.example.vmexpansionpanels)(this);};
 //BA.debugLineNum = 187;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 188;BA.debugLine="SetAttrSingle(\"flat\", varFlat)";
_setattrsingle("flat",BA.ObjectToString(_varflat));
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 };
 //BA.debugLineNum = 191;BA.debugLine="Dim pp As String = $\"${ID}Flat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Flat");
 //BA.debugLineNum = 192;BA.debugLine="vue.SetStateSingle(pp, varFlat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varflat));
 //BA.debugLineNum = 193;BA.debugLine="ExpansionPanels.Bind(\":flat\", pp)";
_expansionpanels._bind /*b4j.example.vmelement*/ (":flat",_pp);
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setfocusable(boolean _varfocusable) throws Exception{
String _pp = "";
 //BA.debugLineNum = 198;BA.debugLine="Sub SetFocusable(varFocusable As Boolean) As VMExp";
 //BA.debugLineNum = 199;BA.debugLine="If varFocusable = False Then Return Me";
if (_varfocusable==__c.False) { 
if (true) return (b4j.example.vmexpansionpanels)(this);};
 //BA.debugLineNum = 200;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 201;BA.debugLine="SetAttrSingle(\"focusable\", varFocusable)";
_setattrsingle("focusable",BA.ObjectToString(_varfocusable));
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 };
 //BA.debugLineNum = 204;BA.debugLine="Dim pp As String = $\"${ID}Focusable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Focusable");
 //BA.debugLineNum = 205;BA.debugLine="vue.SetStateSingle(pp, varFocusable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfocusable));
 //BA.debugLineNum = 206;BA.debugLine="ExpansionPanels.Bind(\":focusable\", pp)";
_expansionpanels._bind /*b4j.example.vmelement*/ (":focusable",_pp);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _sethover(boolean _varhover) throws Exception{
String _pp = "";
 //BA.debugLineNum = 211;BA.debugLine="Sub SetHover(varHover As Boolean) As VMExpansionPa";
 //BA.debugLineNum = 212;BA.debugLine="If varHover = False Then Return Me";
if (_varhover==__c.False) { 
if (true) return (b4j.example.vmexpansionpanels)(this);};
 //BA.debugLineNum = 213;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 214;BA.debugLine="SetAttrSingle(\"hover\", varHover)";
_setattrsingle("hover",BA.ObjectToString(_varhover));
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 };
 //BA.debugLineNum = 217;BA.debugLine="Dim pp As String = $\"${ID}Hover\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Hover");
 //BA.debugLineNum = 218;BA.debugLine="vue.SetStateSingle(pp, varHover)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhover));
 //BA.debugLineNum = 219;BA.debugLine="ExpansionPanels.Bind(\":hover\", pp)";
_expansionpanels._bind /*b4j.example.vmelement*/ (":hover",_pp);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setinset(boolean _varinset) throws Exception{
String _pp = "";
 //BA.debugLineNum = 224;BA.debugLine="Sub SetInset(varInset As Boolean) As VMExpansionPa";
 //BA.debugLineNum = 225;BA.debugLine="If varInset = False Then Return Me";
if (_varinset==__c.False) { 
if (true) return (b4j.example.vmexpansionpanels)(this);};
 //BA.debugLineNum = 226;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 227;BA.debugLine="SetAttrSingle(\"inset\", varInset)";
_setattrsingle("inset",BA.ObjectToString(_varinset));
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 };
 //BA.debugLineNum = 230;BA.debugLine="Dim pp As String = $\"${ID}Inset\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Inset");
 //BA.debugLineNum = 231;BA.debugLine="vue.SetStateSingle(pp, varInset)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varinset));
 //BA.debugLineNum = 232;BA.debugLine="ExpansionPanels.Bind(\":inset\", pp)";
_expansionpanels._bind /*b4j.example.vmelement*/ (":inset",_pp);
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 463;BA.debugLine="Sub SetKey(k As String) As VMExpansionPanels";
 //BA.debugLineNum = 464;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 465;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 466;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 237;BA.debugLine="Sub SetLight(varLight As Boolean) As VMExpansionPa";
 //BA.debugLineNum = 238;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmexpansionpanels)(this);};
 //BA.debugLineNum = 239;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 240;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 };
 //BA.debugLineNum = 243;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 244;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 245;BA.debugLine="ExpansionPanels.Bind(\":light\", pp)";
_expansionpanels._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setmandatory(boolean _varmandatory) throws Exception{
String _pp = "";
 //BA.debugLineNum = 250;BA.debugLine="Sub SetMandatory(varMandatory As Boolean) As VMExp";
 //BA.debugLineNum = 251;BA.debugLine="If varMandatory = False Then Return Me";
if (_varmandatory==__c.False) { 
if (true) return (b4j.example.vmexpansionpanels)(this);};
 //BA.debugLineNum = 252;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 253;BA.debugLine="SetAttrSingle(\"mandatory\", varMandatory)";
_setattrsingle("mandatory",BA.ObjectToString(_varmandatory));
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 };
 //BA.debugLineNum = 256;BA.debugLine="Dim pp As String = $\"${ID}Mandatory\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Mandatory");
 //BA.debugLineNum = 257;BA.debugLine="vue.SetStateSingle(pp, varMandatory)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmandatory));
 //BA.debugLineNum = 258;BA.debugLine="ExpansionPanels.Bind(\":mandatory\", pp)";
_expansionpanels._bind /*b4j.example.vmelement*/ (":mandatory",_pp);
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 395;BA.debugLine="Sub SetMarginAll(p As String) As VMExpansionPanels";
 //BA.debugLineNum = 396;BA.debugLine="ExpansionPanels.setmarginall(p)";
_expansionpanels._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 397;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setmax(String _varmax) throws Exception{
String _pp = "";
 //BA.debugLineNum = 263;BA.debugLine="Sub SetMax(varMax As String) As VMExpansionPanels";
 //BA.debugLineNum = 264;BA.debugLine="If varMax = \"\" Then Return Me";
if ((_varmax).equals("")) { 
if (true) return (b4j.example.vmexpansionpanels)(this);};
 //BA.debugLineNum = 265;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 266;BA.debugLine="SetAttrSingle(\"max\", varMax)";
_setattrsingle("max",_varmax);
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 };
 //BA.debugLineNum = 269;BA.debugLine="Dim pp As String = $\"${ID}Max\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Max");
 //BA.debugLineNum = 270;BA.debugLine="vue.SetStateSingle(pp, varMax)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmax));
 //BA.debugLineNum = 271;BA.debugLine="ExpansionPanels.Bind(\":max\", pp)";
_expansionpanels._bind /*b4j.example.vmelement*/ (":max",_pp);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setmultiple(boolean _varmultiple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 276;BA.debugLine="Sub SetMultiple(varMultiple As Boolean) As VMExpan";
 //BA.debugLineNum = 277;BA.debugLine="If varMultiple = False Then Return Me";
if (_varmultiple==__c.False) { 
if (true) return (b4j.example.vmexpansionpanels)(this);};
 //BA.debugLineNum = 278;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 279;BA.debugLine="SetAttrSingle(\"multiple\", varMultiple)";
_setattrsingle("multiple",BA.ObjectToString(_varmultiple));
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 };
 //BA.debugLineNum = 282;BA.debugLine="Dim pp As String = $\"${ID}Multiple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Multiple");
 //BA.debugLineNum = 283;BA.debugLine="vue.SetStateSingle(pp, varMultiple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmultiple));
 //BA.debugLineNum = 284;BA.debugLine="ExpansionPanels.Bind(\":multiple\", pp)";
_expansionpanels._bind /*b4j.example.vmelement*/ (":multiple",_pp);
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 409;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 410;BA.debugLine="ExpansionPanels.SetName(varName, bbind)";
_expansionpanels._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 411;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 389;BA.debugLine="Sub SetPaddingAll(p As String) As VMExpansionPanel";
 //BA.debugLineNum = 390;BA.debugLine="ExpansionPanels.SetPaddingAll(p)";
_expansionpanels._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 391;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setpopout(boolean _varpopout) throws Exception{
String _pp = "";
 //BA.debugLineNum = 289;BA.debugLine="Sub SetPopout(varPopout As Boolean) As VMExpansion";
 //BA.debugLineNum = 290;BA.debugLine="If varPopout = False Then Return Me";
if (_varpopout==__c.False) { 
if (true) return (b4j.example.vmexpansionpanels)(this);};
 //BA.debugLineNum = 291;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 292;BA.debugLine="SetAttrSingle(\"popout\", varPopout)";
_setattrsingle("popout",BA.ObjectToString(_varpopout));
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 };
 //BA.debugLineNum = 295;BA.debugLine="Dim pp As String = $\"${ID}Popout\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Popout");
 //BA.debugLineNum = 296;BA.debugLine="vue.SetStateSingle(pp, varPopout)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpopout));
 //BA.debugLineNum = 297;BA.debugLine="ExpansionPanels.Bind(\":popout\", pp)";
_expansionpanels._bind /*b4j.example.vmelement*/ (":popout",_pp);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 470;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMExp";
 //BA.debugLineNum = 471;BA.debugLine="ExpansionPanels.SetRC(sRow, sCol)";
_expansionpanels._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 472;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setreadonly(boolean _varreadonly) throws Exception{
String _pp = "";
 //BA.debugLineNum = 302;BA.debugLine="Sub SetReadonly(varReadonly As Boolean) As VMExpan";
 //BA.debugLineNum = 303;BA.debugLine="If varReadonly = False Then Return Me";
if (_varreadonly==__c.False) { 
if (true) return (b4j.example.vmexpansionpanels)(this);};
 //BA.debugLineNum = 304;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 305;BA.debugLine="SetAttrSingle(\"readonly\", varReadonly)";
_setattrsingle("readonly",BA.ObjectToString(_varreadonly));
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 };
 //BA.debugLineNum = 308;BA.debugLine="Dim pp As String = $\"${ID}Readonly\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Readonly");
 //BA.debugLineNum = 309;BA.debugLine="vue.SetStateSingle(pp, varReadonly)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreadonly));
 //BA.debugLineNum = 310;BA.debugLine="ExpansionPanels.Bind(\":readonly\", pp)";
_expansionpanels._bind /*b4j.example.vmelement*/ (":readonly",_pp);
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetStatic(b As Boolean) As VMExpansionPanels";
 //BA.debugLineNum = 36;BA.debugLine="bstatic = b";
_bstatic = _b;
 //BA.debugLineNum = 37;BA.debugLine="ExpansionPanels.SetStatic(b)";
_expansionpanels._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetStyle(sm As Map) As VMExpansionPanels";
 //BA.debugLineNum = 128;BA.debugLine="ExpansionPanels.SetStyle(sm)";
_expansionpanels._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 415;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 416;BA.debugLine="ExpansionPanels.SetStyleSingle(prop, value)";
_expansionpanels._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 417;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 418;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetText(t As Object) As VMExpansionPanels";
 //BA.debugLineNum = 105;BA.debugLine="ExpansionPanels.SetText(t)";
_expansionpanels._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _settextcenter() throws Exception{
 //BA.debugLineNum = 502;BA.debugLine="Sub SetTextCenter As VMExpansionPanels";
 //BA.debugLineNum = 503;BA.debugLine="ExpansionPanels.AddClass(\"text-center\")";
_expansionpanels._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 504;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _settile(boolean _vartile) throws Exception{
String _pp = "";
 //BA.debugLineNum = 315;BA.debugLine="Sub SetTile(varTile As Boolean) As VMExpansionPane";
 //BA.debugLineNum = 316;BA.debugLine="If varTile = False Then Return Me";
if (_vartile==__c.False) { 
if (true) return (b4j.example.vmexpansionpanels)(this);};
 //BA.debugLineNum = 317;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 318;BA.debugLine="SetAttrSingle(\"tile\", varTile)";
_setattrsingle("tile",BA.ObjectToString(_vartile));
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 };
 //BA.debugLineNum = 321;BA.debugLine="Dim pp As String = $\"${ID}Tile\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tile");
 //BA.debugLineNum = 322;BA.debugLine="vue.SetStateSingle(pp, varTile)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartile));
 //BA.debugLineNum = 323;BA.debugLine="ExpansionPanels.Bind(\":tile\", pp)";
_expansionpanels._bind /*b4j.example.vmelement*/ (":tile",_pp);
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Sub SetValue(varValue As String) As VMExpansionPan";
 //BA.debugLineNum = 329;BA.debugLine="ExpansionPanels.SetValue(varValue, False)";
_expansionpanels._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 432;BA.debugLine="Sub SetVElse(vif As String) As VMExpansionPanels";
 //BA.debugLineNum = 433;BA.debugLine="ExpansionPanels.SetVElse(vif)";
_expansionpanels._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 434;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 455;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 456;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 457;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 458;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 459;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 460;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 442;BA.debugLine="Sub SetVhtml(vhtml As String) As VMExpansionPanels";
 //BA.debugLineNum = 443;BA.debugLine="ExpansionPanels.SetVHtml(vhtml)";
_expansionpanels._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 444;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetVIf(vif As String) As VMExpansionPanels";
 //BA.debugLineNum = 82;BA.debugLine="ExpansionPanels.SetVIf(vif)";
_expansionpanels._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 516;BA.debugLine="Sub SetVisible(b As Boolean) As VMExpansionPanels";
 //BA.debugLineNum = 517;BA.debugLine="ExpansionPanels.SetVisible(b)";
_expansionpanels._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 518;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 519;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetVModel(k As String) As VMExpansionPanels";
 //BA.debugLineNum = 77;BA.debugLine="ExpansionPanels.SetVModel(k)";
_expansionpanels._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetVShow(vif As String) As VMExpansionPanels";
 //BA.debugLineNum = 87;BA.debugLine="ExpansionPanels.SetVShow(vif)";
_expansionpanels._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 437;BA.debugLine="Sub SetVText(vhtml As String) As VMExpansionPanels";
 //BA.debugLineNum = 438;BA.debugLine="ExpansionPanels.SetVText(vhtml)";
_expansionpanels._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 439;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 440;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _show() throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub Show As VMExpansionPanels";
 //BA.debugLineNum = 341;BA.debugLine="ExpansionPanels.SetVisible(True)";
_expansionpanels._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 73;BA.debugLine="Return ExpansionPanels.ToString";
if (true) return _expansionpanels._tostring /*String*/ ();
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanels  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 372;BA.debugLine="Sub UseTheme(themeName As String) As VMExpansionPa";
 //BA.debugLineNum = 373;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 374;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 375;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 376;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 377;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanels)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
