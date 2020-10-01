package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtooltip extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtooltip", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtooltip.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _tooltip = null;
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
public b4j.example.vmtooltip  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 76;BA.debugLine="Sub AddChild(child As VMElement) As VMToolTip";
 //BA.debugLineNum = 77;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 78;BA.debugLine="ToolTip.SetText(childHTML)";
_tooltip._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 112;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 113;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 114;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtooltip  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub AddClass(c As String) As VMToolTip";
 //BA.debugLineNum = 95;BA.debugLine="ToolTip.AddClass(c)";
_tooltip._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 624;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 625;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 626;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtooltip  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 572;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 573;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 574;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 575;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 576;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 628;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 629;BA.debugLine="ToolTip.BuildModel(mprops, mstyles, lclasses, loo";
_tooltip._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 630;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 631;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ToolTip As VMElement";
_tooltip = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtooltip  _disable() throws Exception{
 //BA.debugLineNum = 565;BA.debugLine="Sub Disable As VMToolTip";
 //BA.debugLineNum = 566;BA.debugLine="ToolTip.Disable(True)";
_tooltip._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 567;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 568;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _enable() throws Exception{
 //BA.debugLineNum = 560;BA.debugLine="Sub Enable As VMToolTip";
 //BA.debugLineNum = 561;BA.debugLine="ToolTip.Enable(True)";
_tooltip._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 562;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _hide() throws Exception{
 //BA.debugLineNum = 550;BA.debugLine="Sub Hide As VMToolTip";
 //BA.debugLineNum = 551;BA.debugLine="ToolTip.SetVisible(False)";
_tooltip._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 552;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 553;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="ToolTip.Initialize(v, ID)";
_tooltip._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="ToolTip.SetTag(\"v-tooltip\")";
_tooltip._settag /*b4j.example.vmelement*/ ("v-tooltip");
 //BA.debugLineNum = 17;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 90;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtooltip  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 579;BA.debugLine="public Sub RemoveAttr(sName As String) As VMToolTi";
 //BA.debugLineNum = 580;BA.debugLine="ToolTip.RemoveAttr(sName)";
_tooltip._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 581;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 582;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub Render";
 //BA.debugLineNum = 72;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtooltip  _setabsolute(boolean _varabsolute) throws Exception{
String _pp = "";
 //BA.debugLineNum = 119;BA.debugLine="Sub SetAbsolute(varAbsolute As Boolean) As VMToolT";
 //BA.debugLineNum = 120;BA.debugLine="If varAbsolute = False Then Return Me";
if (_varabsolute==__c.False) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 121;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 122;BA.debugLine="SetAttrSingle(\"absolute\", varAbsolute)";
_setattrsingle("absolute",BA.ObjectToString(_varabsolute));
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 125;BA.debugLine="Dim pp As String = $\"${ID}Absolute\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Absolute");
 //BA.debugLineNum = 126;BA.debugLine="vue.SetStateSingle(pp, varAbsolute)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varabsolute));
 //BA.debugLineNum = 127;BA.debugLine="ToolTip.Bind(\":absolute\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":absolute",_pp);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setactivator(String _varactivator) throws Exception{
String _pp = "";
 //BA.debugLineNum = 132;BA.debugLine="Sub SetActivator(varActivator As String) As VMTool";
 //BA.debugLineNum = 133;BA.debugLine="If varActivator = \"\" Then Return Me";
if ((_varactivator).equals("")) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 134;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 135;BA.debugLine="SetAttrSingle(\"activator\", varActivator)";
_setattrsingle("activator",_varactivator);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 138;BA.debugLine="Dim pp As String = $\"${ID}Activator\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Activator");
 //BA.debugLineNum = 139;BA.debugLine="vue.SetStateSingle(pp, varActivator)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactivator));
 //BA.debugLineNum = 140;BA.debugLine="ToolTip.Bind(\":activator\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":activator",_pp);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setallowoverflow(boolean _varallowoverflow) throws Exception{
String _pp = "";
 //BA.debugLineNum = 145;BA.debugLine="Sub SetAllowOverflow(varAllowOverflow As Boolean)";
 //BA.debugLineNum = 146;BA.debugLine="If varAllowOverflow = False Then Return Me";
if (_varallowoverflow==__c.False) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 147;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 148;BA.debugLine="SetAttrSingle(\"allow-overflow\", varAllowOverflow";
_setattrsingle("allow-overflow",BA.ObjectToString(_varallowoverflow));
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 151;BA.debugLine="Dim pp As String = $\"${ID}AllowOverflow\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AllowOverflow");
 //BA.debugLineNum = 152;BA.debugLine="vue.SetStateSingle(pp, varAllowOverflow)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varallowoverflow));
 //BA.debugLineNum = 153;BA.debugLine="ToolTip.Bind(\":allow-overflow\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":allow-overflow",_pp);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setattach(boolean _varattach) throws Exception{
String _pp = "";
 //BA.debugLineNum = 158;BA.debugLine="Sub SetAttach(varAttach As Boolean) As VMToolTip";
 //BA.debugLineNum = 159;BA.debugLine="If varAttach = False Then Return Me";
if (_varattach==__c.False) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 160;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 161;BA.debugLine="SetAttrSingle(\"attach\", varAttach)";
_setattrsingle("attach",BA.ObjectToString(_varattach));
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 164;BA.debugLine="Dim pp As String = $\"${ID}Attach\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Attach");
 //BA.debugLineNum = 165;BA.debugLine="vue.SetStateSingle(pp, varAttach)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varattach));
 //BA.debugLineNum = 166;BA.debugLine="ToolTip.Bind(\":attach\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":attach",_pp);
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetAttr(attr As Map) As VMToolTip";
 //BA.debugLineNum = 101;BA.debugLine="ToolTip.SetAttr(attr)";
_tooltip._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 42;BA.debugLine="Sub SetAttributes(attrs As List) As VMToolTip";
 //BA.debugLineNum = 43;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 44;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetAttrLoose(loose As String) As VMToolTip";
 //BA.debugLineNum = 38;BA.debugLine="ToolTip.SetAttrLoose(loose)";
_tooltip._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 618;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 619;BA.debugLine="ToolTip.SetAttrSingle(prop, value)";
_tooltip._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 620;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 621;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setbottom(boolean _varbottom) throws Exception{
String _pp = "";
 //BA.debugLineNum = 171;BA.debugLine="Sub SetBottom(varBottom As Boolean) As VMToolTip";
 //BA.debugLineNum = 172;BA.debugLine="If varBottom = False Then Return Me";
if (_varbottom==__c.False) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 173;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 174;BA.debugLine="SetAttrSingle(\"bottom\", varBottom)";
_setattrsingle("bottom",BA.ObjectToString(_varbottom));
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 177;BA.debugLine="Dim pp As String = $\"${ID}Bottom\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Bottom");
 //BA.debugLineNum = 178;BA.debugLine="vue.SetStateSingle(pp, varBottom)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbottom));
 //BA.debugLineNum = 179;BA.debugLine="ToolTip.Bind(\":bottom\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":bottom",_pp);
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setclosedelay(int _varclosedelay) throws Exception{
String _pp = "";
 //BA.debugLineNum = 184;BA.debugLine="Sub SetCloseDelay(varCloseDelay As Int) As VMToolT";
 //BA.debugLineNum = 185;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 186;BA.debugLine="SetAttrSingle(\"close-delay\", varCloseDelay)";
_setattrsingle("close-delay",BA.NumberToString(_varclosedelay));
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 189;BA.debugLine="Dim pp As String = $\"${ID}CloseDelay\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CloseDelay");
 //BA.debugLineNum = 190;BA.debugLine="vue.SetStateSingle(pp, varCloseDelay)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varclosedelay));
 //BA.debugLineNum = 191;BA.debugLine="ToolTip.Bind(\":close-delay\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":close-delay",_pp);
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 196;BA.debugLine="Sub SetColor(varColor As String) As VMToolTip";
 //BA.debugLineNum = 197;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 198;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 199;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 202;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 203;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 204;BA.debugLine="ToolTip.Bind(\":color\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setcontentclass(String _varcontentclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 209;BA.debugLine="Sub SetContentClass(varContentClass As String) As";
 //BA.debugLineNum = 210;BA.debugLine="If varContentClass = \"\" Then Return Me";
if ((_varcontentclass).equals("")) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 211;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 212;BA.debugLine="SetAttrSingle(\"content-class\", varContentClass)";
_setattrsingle("content-class",_varcontentclass);
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 215;BA.debugLine="Dim pp As String = $\"${ID}ContentClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ContentClass");
 //BA.debugLineNum = 216;BA.debugLine="vue.SetStateSingle(pp, varContentClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcontentclass));
 //BA.debugLineNum = 217;BA.debugLine="ToolTip.Bind(\":content-class\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":content-class",_pp);
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 222;BA.debugLine="Sub SetDark(varDark As Boolean) As VMToolTip";
 //BA.debugLineNum = 223;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 224;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 225;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 228;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 229;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 230;BA.debugLine="ToolTip.Bind(\":dark\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 31;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 595;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMToolTip";
 //BA.debugLineNum = 596;BA.debugLine="ToolTip.SetDesignMode(b)";
_tooltip._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 597;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 598;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 599;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMToolT";
 //BA.debugLineNum = 236;BA.debugLine="ToolTip.SetDisabled(varDisabled)";
_tooltip._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _seteager(boolean _vareager) throws Exception{
String _pp = "";
 //BA.debugLineNum = 241;BA.debugLine="Sub SetEager(varEager As Boolean) As VMToolTip";
 //BA.debugLineNum = 242;BA.debugLine="If varEager = False Then Return Me";
if (_vareager==__c.False) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 243;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 244;BA.debugLine="SetAttrSingle(\"eager\", varEager)";
_setattrsingle("eager",BA.ObjectToString(_vareager));
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 247;BA.debugLine="Dim pp As String = $\"${ID}Eager\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Eager");
 //BA.debugLineNum = 248;BA.debugLine="vue.SetStateSingle(pp, varEager)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareager));
 //BA.debugLineNum = 249;BA.debugLine="ToolTip.Bind(\":eager\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":eager",_pp);
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setfixed(boolean _varfixed) throws Exception{
String _pp = "";
 //BA.debugLineNum = 254;BA.debugLine="Sub SetFixed(varFixed As Boolean) As VMToolTip";
 //BA.debugLineNum = 255;BA.debugLine="If varFixed = False Then Return Me";
if (_varfixed==__c.False) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 256;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 257;BA.debugLine="SetAttrSingle(\"fixed\", varFixed)";
_setattrsingle("fixed",BA.ObjectToString(_varfixed));
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 260;BA.debugLine="Dim pp As String = $\"${ID}Fixed\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Fixed");
 //BA.debugLineNum = 261;BA.debugLine="vue.SetStateSingle(pp, varFixed)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfixed));
 //BA.debugLineNum = 262;BA.debugLine="ToolTip.Bind(\":fixed\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":fixed",_pp);
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setinternalactivator(boolean _varinternalactivator) throws Exception{
String _pp = "";
 //BA.debugLineNum = 267;BA.debugLine="Sub SetInternalActivator(varInternalActivator As B";
 //BA.debugLineNum = 268;BA.debugLine="If varInternalActivator = False Then Return Me";
if (_varinternalactivator==__c.False) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 269;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 270;BA.debugLine="SetAttrSingle(\"internal-activator\", varInternalA";
_setattrsingle("internal-activator",BA.ObjectToString(_varinternalactivator));
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 273;BA.debugLine="Dim pp As String = $\"${ID}InternalActivator\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"InternalActivator");
 //BA.debugLineNum = 274;BA.debugLine="vue.SetStateSingle(pp, varInternalActivator)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varinternalactivator));
 //BA.debugLineNum = 275;BA.debugLine="ToolTip.Bind(\":internal-activator\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":internal-activator",_pp);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setleft(boolean _varleft) throws Exception{
String _pp = "";
 //BA.debugLineNum = 280;BA.debugLine="Sub SetLeft(varLeft As Boolean) As VMToolTip";
 //BA.debugLineNum = 281;BA.debugLine="If varLeft = False Then Return Me";
if (_varleft==__c.False) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 282;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 283;BA.debugLine="SetAttrSingle(\"left\", varLeft)";
_setattrsingle("left",BA.ObjectToString(_varleft));
 //BA.debugLineNum = 284;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 286;BA.debugLine="Dim pp As String = $\"${ID}Left\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Left");
 //BA.debugLineNum = 287;BA.debugLine="vue.SetStateSingle(pp, varLeft)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varleft));
 //BA.debugLineNum = 288;BA.debugLine="ToolTip.Bind(\":left\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":left",_pp);
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 293;BA.debugLine="Sub SetLight(varLight As Boolean) As VMToolTip";
 //BA.debugLineNum = 294;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 295;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 296;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 299;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 300;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 301;BA.debugLine="ToolTip.Bind(\":light\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 590;BA.debugLine="Sub SetMarginAll(p As String) As VMToolTip";
 //BA.debugLineNum = 591;BA.debugLine="ToolTip.setmarginall(p)";
_tooltip._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 592;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 593;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setmaxwidth(String _varmaxwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 306;BA.debugLine="Sub SetMaxWidth(varMaxWidth As String) As VMToolTi";
 //BA.debugLineNum = 307;BA.debugLine="If varMaxWidth = \"\" Then Return Me";
if ((_varmaxwidth).equals("")) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 308;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 309;BA.debugLine="SetAttrSingle(\"max-width\", varMaxWidth)";
_setattrsingle("max-width",_varmaxwidth);
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 312;BA.debugLine="Dim pp As String = $\"${ID}MaxWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxWidth");
 //BA.debugLineNum = 313;BA.debugLine="vue.SetStateSingle(pp, varMaxWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxwidth));
 //BA.debugLineNum = 314;BA.debugLine="ToolTip.Bind(\":max-width\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":max-width",_pp);
 //BA.debugLineNum = 315;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setminwidth(String _varminwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 319;BA.debugLine="Sub SetMinWidth(varMinWidth As String) As VMToolTi";
 //BA.debugLineNum = 320;BA.debugLine="If varMinWidth = \"\" Then Return Me";
if ((_varminwidth).equals("")) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 321;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 322;BA.debugLine="SetAttrSingle(\"min-width\", varMinWidth)";
_setattrsingle("min-width",_varminwidth);
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 325;BA.debugLine="Dim pp As String = $\"${ID}MinWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinWidth");
 //BA.debugLineNum = 326;BA.debugLine="vue.SetStateSingle(pp, varMinWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminwidth));
 //BA.debugLineNum = 327;BA.debugLine="ToolTip.Bind(\":min-width\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":min-width",_pp);
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 607;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 608;BA.debugLine="ToolTip.SetName(varName, bbind)";
_tooltip._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 609;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 610;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setnudgebottom(String _varnudgebottom) throws Exception{
String _pp = "";
 //BA.debugLineNum = 332;BA.debugLine="Sub SetNudgeBottom(varNudgeBottom As String) As VM";
 //BA.debugLineNum = 333;BA.debugLine="If varNudgeBottom = \"\" Then Return Me";
if ((_varnudgebottom).equals("")) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 334;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 335;BA.debugLine="SetAttrSingle(\"nudge-bottom\", varNudgeBottom)";
_setattrsingle("nudge-bottom",_varnudgebottom);
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 338;BA.debugLine="Dim pp As String = $\"${ID}NudgeBottom\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NudgeBottom");
 //BA.debugLineNum = 339;BA.debugLine="vue.SetStateSingle(pp, varNudgeBottom)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnudgebottom));
 //BA.debugLineNum = 340;BA.debugLine="ToolTip.Bind(\":nudge-bottom\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":nudge-bottom",_pp);
 //BA.debugLineNum = 341;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setnudgeleft(String _varnudgeleft) throws Exception{
String _pp = "";
 //BA.debugLineNum = 345;BA.debugLine="Sub SetNudgeLeft(varNudgeLeft As String) As VMTool";
 //BA.debugLineNum = 346;BA.debugLine="If varNudgeLeft = \"\" Then Return Me";
if ((_varnudgeleft).equals("")) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 347;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 348;BA.debugLine="SetAttrSingle(\"nudge-left\", varNudgeLeft)";
_setattrsingle("nudge-left",_varnudgeleft);
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 351;BA.debugLine="Dim pp As String = $\"${ID}NudgeLeft\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NudgeLeft");
 //BA.debugLineNum = 352;BA.debugLine="vue.SetStateSingle(pp, varNudgeLeft)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnudgeleft));
 //BA.debugLineNum = 353;BA.debugLine="ToolTip.Bind(\":nudge-left\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":nudge-left",_pp);
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setnudgeright(String _varnudgeright) throws Exception{
String _pp = "";
 //BA.debugLineNum = 358;BA.debugLine="Sub SetNudgeRight(varNudgeRight As String) As VMTo";
 //BA.debugLineNum = 359;BA.debugLine="If varNudgeRight = \"\" Then Return Me";
if ((_varnudgeright).equals("")) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 360;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 361;BA.debugLine="SetAttrSingle(\"nudge-right\", varNudgeRight)";
_setattrsingle("nudge-right",_varnudgeright);
 //BA.debugLineNum = 362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 364;BA.debugLine="Dim pp As String = $\"${ID}NudgeRight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NudgeRight");
 //BA.debugLineNum = 365;BA.debugLine="vue.SetStateSingle(pp, varNudgeRight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnudgeright));
 //BA.debugLineNum = 366;BA.debugLine="ToolTip.Bind(\":nudge-right\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":nudge-right",_pp);
 //BA.debugLineNum = 367;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setnudgetop(String _varnudgetop) throws Exception{
String _pp = "";
 //BA.debugLineNum = 371;BA.debugLine="Sub SetNudgeTop(varNudgeTop As String) As VMToolTi";
 //BA.debugLineNum = 372;BA.debugLine="If varNudgeTop = \"\" Then Return Me";
if ((_varnudgetop).equals("")) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 373;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 374;BA.debugLine="SetAttrSingle(\"nudge-top\", varNudgeTop)";
_setattrsingle("nudge-top",_varnudgetop);
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 377;BA.debugLine="Dim pp As String = $\"${ID}NudgeTop\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NudgeTop");
 //BA.debugLineNum = 378;BA.debugLine="vue.SetStateSingle(pp, varNudgeTop)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnudgetop));
 //BA.debugLineNum = 379;BA.debugLine="ToolTip.Bind(\":nudge-top\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":nudge-top",_pp);
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setnudgewidth(String _varnudgewidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 384;BA.debugLine="Sub SetNudgeWidth(varNudgeWidth As String) As VMTo";
 //BA.debugLineNum = 385;BA.debugLine="If varNudgeWidth = \"\" Then Return Me";
if ((_varnudgewidth).equals("")) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 386;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 387;BA.debugLine="SetAttrSingle(\"nudge-width\", varNudgeWidth)";
_setattrsingle("nudge-width",_varnudgewidth);
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 390;BA.debugLine="Dim pp As String = $\"${ID}NudgeWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NudgeWidth");
 //BA.debugLineNum = 391;BA.debugLine="vue.SetStateSingle(pp, varNudgeWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnudgewidth));
 //BA.debugLineNum = 392;BA.debugLine="ToolTip.Bind(\":nudge-width\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":nudge-width",_pp);
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setoffsetoverflow(boolean _varoffsetoverflow) throws Exception{
String _pp = "";
 //BA.debugLineNum = 397;BA.debugLine="Sub SetOffsetOverflow(varOffsetOverflow As Boolean";
 //BA.debugLineNum = 398;BA.debugLine="If varOffsetOverflow = False Then Return Me";
if (_varoffsetoverflow==__c.False) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 399;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 400;BA.debugLine="SetAttrSingle(\"offset-overflow\", varOffsetOverfl";
_setattrsingle("offset-overflow",BA.ObjectToString(_varoffsetoverflow));
 //BA.debugLineNum = 401;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 403;BA.debugLine="Dim pp As String = $\"${ID}OffsetOverflow\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OffsetOverflow");
 //BA.debugLineNum = 404;BA.debugLine="vue.SetStateSingle(pp, varOffsetOverflow)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoffsetoverflow));
 //BA.debugLineNum = 405;BA.debugLine="ToolTip.Bind(\":offset-overflow\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":offset-overflow",_pp);
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setopendelay(String _varopendelay) throws Exception{
String _pp = "";
 //BA.debugLineNum = 410;BA.debugLine="Sub SetOpenDelay(varOpenDelay As String) As VMTool";
 //BA.debugLineNum = 411;BA.debugLine="If varOpenDelay = \"\" Then Return Me";
if ((_varopendelay).equals("")) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 412;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 413;BA.debugLine="SetAttrSingle(\"open-delay\", varOpenDelay)";
_setattrsingle("open-delay",_varopendelay);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 416;BA.debugLine="Dim pp As String = $\"${ID}OpenDelay\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OpenDelay");
 //BA.debugLineNum = 417;BA.debugLine="vue.SetStateSingle(pp, varOpenDelay)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varopendelay));
 //BA.debugLineNum = 418;BA.debugLine="ToolTip.Bind(\":open-delay\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":open-delay",_pp);
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setopenonclick(boolean _varopenonclick) throws Exception{
String _pp = "";
 //BA.debugLineNum = 423;BA.debugLine="Sub SetOpenOnClick(varOpenOnClick As Boolean) As V";
 //BA.debugLineNum = 424;BA.debugLine="If varOpenOnClick = False Then Return Me";
if (_varopenonclick==__c.False) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 425;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 426;BA.debugLine="SetAttrSingle(\"open-on-click\", varOpenOnClick)";
_setattrsingle("open-on-click",BA.ObjectToString(_varopenonclick));
 //BA.debugLineNum = 427;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 429;BA.debugLine="Dim pp As String = $\"${ID}OpenOnClick\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OpenOnClick");
 //BA.debugLineNum = 430;BA.debugLine="vue.SetStateSingle(pp, varOpenOnClick)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varopenonclick));
 //BA.debugLineNum = 431;BA.debugLine="ToolTip.Bind(\":open-on-click\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":open-on-click",_pp);
 //BA.debugLineNum = 432;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setopenonhover(boolean _varopenonhover) throws Exception{
String _pp = "";
 //BA.debugLineNum = 436;BA.debugLine="Sub SetOpenOnHover(varOpenOnHover As Boolean) As V";
 //BA.debugLineNum = 437;BA.debugLine="If varOpenOnHover = False Then Return Me";
if (_varopenonhover==__c.False) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 438;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 439;BA.debugLine="SetAttrSingle(\"open-on-hover\", varOpenOnHover)";
_setattrsingle("open-on-hover",BA.ObjectToString(_varopenonhover));
 //BA.debugLineNum = 440;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 442;BA.debugLine="Dim pp As String = $\"${ID}OpenOnHover\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OpenOnHover");
 //BA.debugLineNum = 443;BA.debugLine="vue.SetStateSingle(pp, varOpenOnHover)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varopenonhover));
 //BA.debugLineNum = 444;BA.debugLine="ToolTip.Bind(\":open-on-hover\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":open-on-hover",_pp);
 //BA.debugLineNum = 445;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 446;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 585;BA.debugLine="Sub SetPaddingAll(p As String) As VMToolTip";
 //BA.debugLineNum = 586;BA.debugLine="ToolTip.SetPaddingAll(p)";
_tooltip._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 587;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 588;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setpositionx(int _varpositionx) throws Exception{
String _pp = "";
 //BA.debugLineNum = 449;BA.debugLine="Sub SetPositionX(varPositionX As Int) As VMToolTip";
 //BA.debugLineNum = 450;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 451;BA.debugLine="SetAttrSingle(\"position-x\", varPositionX)";
_setattrsingle("position-x",BA.NumberToString(_varpositionx));
 //BA.debugLineNum = 452;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 454;BA.debugLine="Dim pp As String = $\"${ID}PositionX\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PositionX");
 //BA.debugLineNum = 455;BA.debugLine="vue.SetStateSingle(pp, varPositionX)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpositionx));
 //BA.debugLineNum = 456;BA.debugLine="ToolTip.Bind(\":position-x\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":position-x",_pp);
 //BA.debugLineNum = 457;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setpositiony(int _varpositiony) throws Exception{
String _pp = "";
 //BA.debugLineNum = 461;BA.debugLine="Sub SetPositionY(varPositionY As Int) As VMToolTip";
 //BA.debugLineNum = 462;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 463;BA.debugLine="SetAttrSingle(\"position-y\", varPositionY)";
_setattrsingle("position-y",BA.NumberToString(_varpositiony));
 //BA.debugLineNum = 464;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 466;BA.debugLine="Dim pp As String = $\"${ID}PositionY\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PositionY");
 //BA.debugLineNum = 467;BA.debugLine="vue.SetStateSingle(pp, varPositionY)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpositiony));
 //BA.debugLineNum = 468;BA.debugLine="ToolTip.Bind(\":position-y\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":position-y",_pp);
 //BA.debugLineNum = 469;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 470;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setright(boolean _varright) throws Exception{
String _pp = "";
 //BA.debugLineNum = 473;BA.debugLine="Sub SetRight(varRight As Boolean) As VMToolTip";
 //BA.debugLineNum = 474;BA.debugLine="If varRight = False Then Return Me";
if (_varright==__c.False) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 475;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 476;BA.debugLine="SetAttrSingle(\"right\", varRight)";
_setattrsingle("right",BA.ObjectToString(_varright));
 //BA.debugLineNum = 477;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 479;BA.debugLine="Dim pp As String = $\"${ID}Right\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Right");
 //BA.debugLineNum = 480;BA.debugLine="vue.SetStateSingle(pp, varRight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varright));
 //BA.debugLineNum = 481;BA.debugLine="ToolTip.Bind(\":right\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":right",_pp);
 //BA.debugLineNum = 482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 483;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setslotactivator(boolean _b) throws Exception{
 //BA.debugLineNum = 544;BA.debugLine="Sub SetSlotActivator(b As Boolean) As VMToolTip";
 //BA.debugLineNum = 545;BA.debugLine="SetAttr(CreateMap(\"slot\": \"activator\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("activator")}));
 //BA.debugLineNum = 546;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 547;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetStatic(b As Boolean) As VMToolTip";
 //BA.debugLineNum = 25;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 26;BA.debugLine="ToolTip.SetStatic(b)";
_tooltip._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetStyle(sm As Map) As VMToolTip";
 //BA.debugLineNum = 107;BA.debugLine="ToolTip.SetStyle(sm)";
_tooltip._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 613;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 614;BA.debugLine="ToolTip.SetStyleSingle(prop, value)";
_tooltip._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 615;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 616;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 601;BA.debugLine="Sub SetTabIndex(ti As String) As VMToolTip";
 //BA.debugLineNum = 602;BA.debugLine="ToolTip.SetTabIndex(ti)";
_tooltip._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 603;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 604;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _settag(String _vartag) throws Exception{
String _pp = "";
 //BA.debugLineNum = 486;BA.debugLine="Sub SetTag(varTag As String) As VMToolTip";
 //BA.debugLineNum = 487;BA.debugLine="If varTag = \"\" Then Return Me";
if ((_vartag).equals("")) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 488;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 489;BA.debugLine="SetAttrSingle(\"tag\", varTag)";
_setattrsingle("tag",_vartag);
 //BA.debugLineNum = 490;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 492;BA.debugLine="Dim pp As String = $\"${ID}Tag\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tag");
 //BA.debugLineNum = 493;BA.debugLine="vue.SetStateSingle(pp, varTag)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartag));
 //BA.debugLineNum = 494;BA.debugLine="ToolTip.Bind(\":tag\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":tag",_pp);
 //BA.debugLineNum = 495;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 496;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _settext(String _t) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetText(t As String) As VMToolTip";
 //BA.debugLineNum = 84;BA.debugLine="ToolTip.SetText(t)";
_tooltip._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 639;BA.debugLine="Sub SetTextColor(varColor As String) As VMToolTip";
 //BA.debugLineNum = 640;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 641;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 642;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 643;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 646;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 647;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 648;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 649;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 650;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 651;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 652;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 653;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _settop(boolean _vartop) throws Exception{
String _pp = "";
 //BA.debugLineNum = 499;BA.debugLine="Sub SetTop(varTop As Boolean) As VMToolTip";
 //BA.debugLineNum = 500;BA.debugLine="If varTop = False Then Return Me";
if (_vartop==__c.False) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 501;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 502;BA.debugLine="SetAttrSingle(\"top\", varTop)";
_setattrsingle("top",BA.ObjectToString(_vartop));
 //BA.debugLineNum = 503;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 505;BA.debugLine="Dim pp As String = $\"${ID}Top\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Top");
 //BA.debugLineNum = 506;BA.debugLine="vue.SetStateSingle(pp, varTop)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartop));
 //BA.debugLineNum = 507;BA.debugLine="ToolTip.Bind(\":top\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":top",_pp);
 //BA.debugLineNum = 508;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 509;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _settransition(String _vartransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 512;BA.debugLine="Sub SetTransition(varTransition As String) As VMTo";
 //BA.debugLineNum = 513;BA.debugLine="If varTransition = \"\" Then Return Me";
if ((_vartransition).equals("")) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 514;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 515;BA.debugLine="SetAttrSingle(\"transition\", varTransition)";
_setattrsingle("transition",_vartransition);
 //BA.debugLineNum = 516;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 518;BA.debugLine="Dim pp As String = $\"${ID}Transition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Transition");
 //BA.debugLineNum = 519;BA.debugLine="vue.SetStateSingle(pp, varTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartransition));
 //BA.debugLineNum = 520;BA.debugLine="ToolTip.Bind(\":transition\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":transition",_pp);
 //BA.debugLineNum = 521;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 522;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 525;BA.debugLine="Sub SetValue(varValue As String) As VMToolTip";
 //BA.debugLineNum = 526;BA.debugLine="ToolTip.SetValue(varValue, False)";
_tooltip._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 527;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 528;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetVIf(vif As String) As VMToolTip";
 //BA.debugLineNum = 61;BA.debugLine="ToolTip.SetVIf(vif)";
_tooltip._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 633;BA.debugLine="Sub SetVisible(b As Boolean) As VMToolTip";
 //BA.debugLineNum = 634;BA.debugLine="ToolTip.SetVisible(b)";
_tooltip._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 635;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 636;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetVModel(k As String) As VMToolTip";
 //BA.debugLineNum = 56;BA.debugLine="ToolTip.SetVModel(k)";
_tooltip._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetVShow(vif As String) As VMToolTip";
 //BA.debugLineNum = 66;BA.debugLine="ToolTip.SetVShow(vif)";
_tooltip._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setzindex(String _varzindex) throws Exception{
String _pp = "";
 //BA.debugLineNum = 531;BA.debugLine="Sub SetZIndex(varZIndex As String) As VMToolTip";
 //BA.debugLineNum = 532;BA.debugLine="If varZIndex = \"\" Then Return Me";
if ((_varzindex).equals("")) { 
if (true) return (b4j.example.vmtooltip)(this);};
 //BA.debugLineNum = 533;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 534;BA.debugLine="SetAttrSingle(\"z-index\", varZIndex)";
_setattrsingle("z-index",_varzindex);
 //BA.debugLineNum = 535;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 };
 //BA.debugLineNum = 537;BA.debugLine="Dim pp As String = $\"${ID}ZIndex\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ZIndex");
 //BA.debugLineNum = 538;BA.debugLine="vue.SetStateSingle(pp, varZIndex)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varzindex));
 //BA.debugLineNum = 539;BA.debugLine="ToolTip.Bind(\":z-index\", pp)";
_tooltip._bind /*b4j.example.vmelement*/ (":z-index",_pp);
 //BA.debugLineNum = 540;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 541;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _show() throws Exception{
 //BA.debugLineNum = 555;BA.debugLine="Sub Show As VMToolTip";
 //BA.debugLineNum = 556;BA.debugLine="ToolTip.SetVisible(True)";
_tooltip._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 557;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 558;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 52;BA.debugLine="Return ToolTip.ToString";
if (true) return _tooltip._tostring /*String*/ ();
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
