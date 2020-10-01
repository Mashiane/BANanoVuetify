package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmbottomsheet extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmbottomsheet", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmbottomsheet.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmcontainer _bottomsheet = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public String _smodel = "";
public b4j.example.vmcontainer _footer = null;
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
public b4j.example.vmbottomsheet  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 74;BA.debugLine="Sub AddChild(child As VMElement) As VMBottomSheet";
 //BA.debugLineNum = 75;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 76;BA.debugLine="BottomSheet.SetText(childHTML)";
_bottomsheet._settext /*b4j.example.vmcontainer*/ (_childhtml);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 110;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 111;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 112;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottomsheet  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub AddClass(c As String) As VMBottomSheet";
 //BA.debugLineNum = 93;BA.debugLine="BottomSheet.AddClass(c)";
_bottomsheet._addclass /*b4j.example.vmcontainer*/ (_c);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 586;BA.debugLine="Sub AddComponent(comp As String) As VMBottomSheet";
 //BA.debugLineNum = 587;BA.debugLine="BottomSheet.SetText(comp)";
_bottomsheet._settext /*b4j.example.vmcontainer*/ (_comp);
 //BA.debugLineNum = 588;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 589;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 597;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 598;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 599;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottomsheet  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 435;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 436;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 437;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 438;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 517;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 518;BA.debugLine="BottomSheet.BindStyleSingle(prop, value)";
_bottomsheet._bindstylesingle /*b4j.example.vmcontainer*/ (_prop,_value);
 //BA.debugLineNum = 519;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 520;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 602;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 603;BA.debugLine="BottomSheet.BuildModel(mprops, mstyles, lclasses,";
_bottomsheet._buildmodel /*b4j.example.vmcontainer*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 604;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 605;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public BottomSheet As VMContainer";
_bottomsheet = new b4j.example.vmcontainer();
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
 //BA.debugLineNum = 10;BA.debugLine="Private smodel As String";
_smodel = "";
 //BA.debugLineNum = 11;BA.debugLine="Private Footer As VMContainer";
_footer = new b4j.example.vmcontainer();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _hide() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub Hide";
 //BA.debugLineNum = 44;BA.debugLine="vue.SetData(smodel, False)";
_vue._setdata /*b4j.example.bananovue*/ (_smodel,(Object)(__c.False));
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottomsheet  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 16;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 18;BA.debugLine="BottomSheet.Initialize(v, ID, eventHandler)";
_bottomsheet._initialize /*b4j.example.vmcontainer*/ (ba,_v,_id,_eventhandler);
 //BA.debugLineNum = 19;BA.debugLine="BottomSheet.SetTag(\"v-bottom-sheet\")";
_bottomsheet._settag /*b4j.example.vmcontainer*/ ("v-bottom-sheet");
 //BA.debugLineNum = 20;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 22;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="SetVModel(BottomSheet.showkey)";
_setvmodel(_bottomsheet._showkey /*String*/ );
 //BA.debugLineNum = 24;BA.debugLine="Hide";
_hide();
 //BA.debugLineNum = 25;BA.debugLine="Footer.Initialize(vue, $\"${ID}footer\"$, eventHand";
_footer._initialize /*b4j.example.vmcontainer*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"footer"),_eventhandler);
 //BA.debugLineNum = 26;BA.debugLine="Footer.SetTag(\"v-sheet-footer\")";
_footer._settag /*b4j.example.vmcontainer*/ ("v-sheet-footer");
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 88;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottomsheet  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 459;BA.debugLine="public Sub RemoveAttr(sName As String) As VMBottom";
 //BA.debugLineNum = 460;BA.debugLine="BottomSheet.RemoveAttr(sName)";
_bottomsheet._removeattr /*b4j.example.vmcontainer*/ (_sname);
 //BA.debugLineNum = 461;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub Render";
 //BA.debugLineNum = 70;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottomsheet  _setactivator(String _varactivator) throws Exception{
String _pp = "";
 //BA.debugLineNum = 117;BA.debugLine="Sub SetActivator(varActivator As String) As VMBott";
 //BA.debugLineNum = 118;BA.debugLine="If varActivator = \"\" Then Return Me";
if ((_varactivator).equals("")) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 119;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 120;BA.debugLine="SetAttrSingle(\"activator\", varActivator)";
_setattrsingle("activator",_varactivator);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 123;BA.debugLine="Dim pp As String = $\"${ID}Activator\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Activator");
 //BA.debugLineNum = 124;BA.debugLine="vue.SetStateSingle(pp, varActivator)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactivator));
 //BA.debugLineNum = 125;BA.debugLine="BottomSheet.Bind(\":activator\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":activator",_pp);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setattach(String _varattach) throws Exception{
String _pp = "";
 //BA.debugLineNum = 130;BA.debugLine="Sub SetAttach(varAttach As String) As VMBottomShee";
 //BA.debugLineNum = 131;BA.debugLine="If varAttach = \"\" Then Return Me";
if ((_varattach).equals("")) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 132;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 133;BA.debugLine="SetAttrSingle(\"attach\", varAttach)";
_setattrsingle("attach",_varattach);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 136;BA.debugLine="Dim pp As String = $\"${ID}Attach\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Attach");
 //BA.debugLineNum = 137;BA.debugLine="vue.SetStateSingle(pp, varAttach)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varattach));
 //BA.debugLineNum = 138;BA.debugLine="BottomSheet.Bind(\":attach\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":attach",_pp);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetAttr(attr As Map) As VMBottomSheet";
 //BA.debugLineNum = 99;BA.debugLine="BottomSheet.SetAttr(attr)";
_bottomsheet._setattr /*b4j.example.vmcontainer*/ (_attr);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 537;BA.debugLine="Sub SetAttributes(attrs As List) As VMBottomSheet";
 //BA.debugLineNum = 538;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 539;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 541;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 542;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 442;BA.debugLine="Sub SetAttrLoose(loose As String) As VMBottomSheet";
 //BA.debugLineNum = 443;BA.debugLine="BottomSheet.SetAttrLoose(loose)";
_bottomsheet._setattrloose /*b4j.example.vmcontainer*/ (_loose);
 //BA.debugLineNum = 444;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 511;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 512;BA.debugLine="BottomSheet.SetAttrSingle(prop, value)";
_bottomsheet._setattrsingle /*b4j.example.vmcontainer*/ (_prop,_value);
 //BA.debugLineNum = 513;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 514;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setcontentclass(String _varcontentclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 143;BA.debugLine="Sub SetContentClass(varContentClass As String) As";
 //BA.debugLineNum = 144;BA.debugLine="If varContentClass = \"\" Then Return Me";
if ((_varcontentclass).equals("")) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 145;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 146;BA.debugLine="SetAttrSingle(\"content-class\", varContentClass)";
_setattrsingle("content-class",_varcontentclass);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 149;BA.debugLine="Dim pp As String = $\"${ID}ContentClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ContentClass");
 //BA.debugLineNum = 150;BA.debugLine="vue.SetStateSingle(pp, varContentClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcontentclass));
 //BA.debugLineNum = 151;BA.debugLine="BottomSheet.Bind(\":content-class\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":content-class",_pp);
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 265;BA.debugLine="Sub SetDark(varDark As Boolean) As VMBottomSheet";
 //BA.debugLineNum = 266;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 267;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 268;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 271;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 272;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 273;BA.debugLine="BottomSheet.Bind(\":dark\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":dark",_pp);
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 37;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 477;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMBottomSheet";
 //BA.debugLineNum = 478;BA.debugLine="BottomSheet.SetDesignMode(b)";
_bottomsheet._setdesignmode /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 479;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 480;BA.debugLine="Footer.setdesignmode(b)";
_footer._setdesignmode /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 481;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 482;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 566;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 567;BA.debugLine="BottomSheet.SetDeviceOffsets(OS, OM, OL, OX)";
_bottomsheet._setdeviceoffsets /*b4j.example.vmcontainer*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 568;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 569;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 573;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 574;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 575;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 576;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 577;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 580;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 581;BA.debugLine="BottomSheet.SetDeviceSizes(SS, SM, SL, SX)";
_bottomsheet._setdevicesizes /*b4j.example.vmcontainer*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 582;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 583;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setdisabled(boolean _vardisabled) throws Exception{
String _pp = "";
 //BA.debugLineNum = 278;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMBotto";
 //BA.debugLineNum = 279;BA.debugLine="If varDisabled = False Then Return Me";
if (_vardisabled==__c.False) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 280;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 281;BA.debugLine="SetAttrSingle(\"disabled\", varDisabled)";
_setattrsingle("disabled",BA.ObjectToString(_vardisabled));
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 284;BA.debugLine="Dim pp As String = $\"${ID}Disabled\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Disabled");
 //BA.debugLineNum = 285;BA.debugLine="vue.SetStateSingle(pp, varDisabled)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisabled));
 //BA.debugLineNum = 286;BA.debugLine="BottomSheet.Bind(\":disabled\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":disabled",_pp);
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _seteager(boolean _vareager) throws Exception{
String _pp = "";
 //BA.debugLineNum = 291;BA.debugLine="Sub SetEager(varEager As Boolean) As VMBottomSheet";
 //BA.debugLineNum = 292;BA.debugLine="If varEager = False Then Return Me";
if (_vareager==__c.False) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 293;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 294;BA.debugLine="SetAttrSingle(\"eager\", varEager)";
_setattrsingle("eager",BA.ObjectToString(_vareager));
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 297;BA.debugLine="Dim pp As String = $\"${ID}Eager\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Eager");
 //BA.debugLineNum = 298;BA.debugLine="vue.SetStateSingle(pp, varEager)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareager));
 //BA.debugLineNum = 299;BA.debugLine="BottomSheet.Bind(\":eager\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":eager",_pp);
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setfullscreen(boolean _varfullscreen) throws Exception{
String _pp = "";
 //BA.debugLineNum = 304;BA.debugLine="Sub SetFullscreen(varFullscreen As Boolean) As VMB";
 //BA.debugLineNum = 305;BA.debugLine="If varFullscreen = False Then Return Me";
if (_varfullscreen==__c.False) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 306;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 307;BA.debugLine="SetAttrSingle(\"fullscreen\", varFullscreen)";
_setattrsingle("fullscreen",BA.ObjectToString(_varfullscreen));
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 310;BA.debugLine="Dim pp As String = $\"${ID}Fullscreen\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Fullscreen");
 //BA.debugLineNum = 311;BA.debugLine="vue.SetStateSingle(pp, varFullscreen)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfullscreen));
 //BA.debugLineNum = 312;BA.debugLine="BottomSheet.Bind(\":fullscreen\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":fullscreen",_pp);
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _sethideoverlay(boolean _varhideoverlay) throws Exception{
String _pp = "";
 //BA.debugLineNum = 317;BA.debugLine="Sub SetHideOverlay(varHideOverlay As Boolean) As V";
 //BA.debugLineNum = 318;BA.debugLine="If varHideOverlay = False Then Return Me";
if (_varhideoverlay==__c.False) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 319;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 320;BA.debugLine="SetAttrSingle(\"hide-overlay\", varHideOverlay)";
_setattrsingle("hide-overlay",BA.ObjectToString(_varhideoverlay));
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 323;BA.debugLine="Dim pp As String = $\"${ID}HideOverlay\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideOverlay");
 //BA.debugLineNum = 324;BA.debugLine="vue.SetStateSingle(pp, varHideOverlay)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhideoverlay));
 //BA.debugLineNum = 325;BA.debugLine="BottomSheet.Bind(\":hide-overlay\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":hide-overlay",_pp);
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setinset(boolean _varinset) throws Exception{
String _pp = "";
 //BA.debugLineNum = 330;BA.debugLine="Sub SetInset(varInset As Boolean) As VMBottomSheet";
 //BA.debugLineNum = 331;BA.debugLine="If varInset = False Then Return Me";
if (_varinset==__c.False) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 332;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 333;BA.debugLine="SetAttrSingle(\"inset\", varInset)";
_setattrsingle("inset",BA.ObjectToString(_varinset));
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 336;BA.debugLine="Dim pp As String = $\"${ID}Inset\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Inset");
 //BA.debugLineNum = 337;BA.debugLine="vue.SetStateSingle(pp, varInset)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varinset));
 //BA.debugLineNum = 338;BA.debugLine="BottomSheet.Bind(\":inset\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":inset",_pp);
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setinternalactivator(boolean _varinternalactivator) throws Exception{
String _pp = "";
 //BA.debugLineNum = 343;BA.debugLine="Sub SetInternalActivator(varInternalActivator As B";
 //BA.debugLineNum = 344;BA.debugLine="If varInternalActivator = False Then Return Me";
if (_varinternalactivator==__c.False) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 345;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 346;BA.debugLine="SetAttrSingle(\"internal-activator\", varInternalA";
_setattrsingle("internal-activator",BA.ObjectToString(_varinternalactivator));
 //BA.debugLineNum = 347;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 349;BA.debugLine="Dim pp As String = $\"${ID}InternalActivator\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"InternalActivator");
 //BA.debugLineNum = 350;BA.debugLine="vue.SetStateSingle(pp, varInternalActivator)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varinternalactivator));
 //BA.debugLineNum = 351;BA.debugLine="BottomSheet.Bind(\":internal-activator\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":internal-activator",_pp);
 //BA.debugLineNum = 352;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 553;BA.debugLine="Sub SetKey(k As String) As VMBottomSheet";
 //BA.debugLineNum = 554;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 555;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 556;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 557;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 356;BA.debugLine="Sub SetLight(varLight As Boolean) As VMBottomSheet";
 //BA.debugLineNum = 357;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 358;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 359;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 362;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 363;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 364;BA.debugLine="BottomSheet.Bind(\":light\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":light",_pp);
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 471;BA.debugLine="Sub SetMarginAll(p As String) As VMBottomSheet";
 //BA.debugLineNum = 472;BA.debugLine="BottomSheet.setmarginall(p)";
_bottomsheet._setmarginall /*b4j.example.vmcontainer*/ (_p);
 //BA.debugLineNum = 473;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 474;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setmaxwidth(String _varmaxwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 156;BA.debugLine="Sub SetMaxWidth(varMaxWidth As String) As VMBottom";
 //BA.debugLineNum = 157;BA.debugLine="If varMaxWidth = \"\" Then Return Me";
if ((_varmaxwidth).equals("")) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 158;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 159;BA.debugLine="SetAttrSingle(\"max-width\", varMaxWidth)";
_setattrsingle("max-width",_varmaxwidth);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 162;BA.debugLine="Dim pp As String = $\"${ID}MaxWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxWidth");
 //BA.debugLineNum = 163;BA.debugLine="vue.SetStateSingle(pp, varMaxWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxwidth));
 //BA.debugLineNum = 164;BA.debugLine="BottomSheet.Bind(\":max-width\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":max-width",_pp);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 499;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 500;BA.debugLine="BottomSheet.SetName(varName, bbind)";
_bottomsheet._setname /*b4j.example.vmcontainer*/ ((Object)(_varname),_bbind);
 //BA.debugLineNum = 501;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 502;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setnoclickanimation(boolean _varnoclickanimation) throws Exception{
String _pp = "";
 //BA.debugLineNum = 369;BA.debugLine="Sub SetNoClickAnimation(varNoClickAnimation As Boo";
 //BA.debugLineNum = 370;BA.debugLine="If varNoClickAnimation = False Then Return Me";
if (_varnoclickanimation==__c.False) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 371;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 372;BA.debugLine="SetAttrSingle(\"no-click-animation\", varNoClickAn";
_setattrsingle("no-click-animation",BA.ObjectToString(_varnoclickanimation));
 //BA.debugLineNum = 373;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 375;BA.debugLine="Dim pp As String = $\"${ID}NoClickAnimation\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NoClickAnimation");
 //BA.debugLineNum = 376;BA.debugLine="vue.SetStateSingle(pp, varNoClickAnimation)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnoclickanimation));
 //BA.debugLineNum = 377;BA.debugLine="BottomSheet.Bind(\":no-click-animation\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":no-click-animation",_pp);
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setopenonhover(boolean _varopenonhover) throws Exception{
String _pp = "";
 //BA.debugLineNum = 382;BA.debugLine="Sub SetOpenOnHover(varOpenOnHover As Boolean) As V";
 //BA.debugLineNum = 383;BA.debugLine="If varOpenOnHover = False Then Return Me";
if (_varopenonhover==__c.False) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 384;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 385;BA.debugLine="SetAttrSingle(\"open-on-hover\", varOpenOnHover)";
_setattrsingle("open-on-hover",BA.ObjectToString(_varopenonhover));
 //BA.debugLineNum = 386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 388;BA.debugLine="Dim pp As String = $\"${ID}OpenOnHover\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OpenOnHover");
 //BA.debugLineNum = 389;BA.debugLine="vue.SetStateSingle(pp, varOpenOnHover)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varopenonhover));
 //BA.debugLineNum = 390;BA.debugLine="BottomSheet.Bind(\":open-on-hover\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":open-on-hover",_pp);
 //BA.debugLineNum = 391;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setorigin(String _varorigin) throws Exception{
String _pp = "";
 //BA.debugLineNum = 169;BA.debugLine="Sub SetOrigin(varOrigin As String) As VMBottomShee";
 //BA.debugLineNum = 170;BA.debugLine="If varOrigin = \"\" Then Return Me";
if ((_varorigin).equals("")) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 171;BA.debugLine="If varOrigin = \"center center\" Then Return Me";
if ((_varorigin).equals("center center")) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 172;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 173;BA.debugLine="SetAttrSingle(\"origin\", varOrigin)";
_setattrsingle("origin",_varorigin);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 176;BA.debugLine="Dim pp As String = $\"${ID}Origin\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Origin");
 //BA.debugLineNum = 177;BA.debugLine="vue.SetStateSingle(pp, varOrigin)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varorigin));
 //BA.debugLineNum = 178;BA.debugLine="BottomSheet.Bind(\":origin\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":origin",_pp);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setoverlaycolor(String _varoverlaycolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 183;BA.debugLine="Sub SetOverlayColor(varOverlayColor As String) As";
 //BA.debugLineNum = 184;BA.debugLine="If varOverlayColor = \"\" Then Return Me";
if ((_varoverlaycolor).equals("")) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 185;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 186;BA.debugLine="SetAttrSingle(\"overlay-color\", varOverlayColor)";
_setattrsingle("overlay-color",_varoverlaycolor);
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 189;BA.debugLine="Dim pp As String = $\"${ID}OverlayColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OverlayColor");
 //BA.debugLineNum = 190;BA.debugLine="vue.SetStateSingle(pp, varOverlayColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoverlaycolor));
 //BA.debugLineNum = 191;BA.debugLine="BottomSheet.Bind(\":overlay-color\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":overlay-color",_pp);
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setoverlaycolorintensity(String _varoverlaycolor,String _varoverlayintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 197;BA.debugLine="Sub SetOverlayColorIntensity(varOverlayColor As St";
 //BA.debugLineNum = 198;BA.debugLine="If varOverlayColor = \"\" Then Return Me";
if ((_varoverlaycolor).equals("")) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 199;BA.debugLine="Dim scolor As String = $\"${varOverlayColor} ${var";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varoverlaycolor))+" "+__c.SmartStringFormatter("",(Object)(_varoverlayintensity))+"");
 //BA.debugLineNum = 200;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 201;BA.debugLine="SetAttrSingle(\"overlay-color\", scolor)";
_setattrsingle("overlay-color",_scolor);
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 204;BA.debugLine="Dim pp As String = $\"${ID}OverlayColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OverlayColor");
 //BA.debugLineNum = 205;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 206;BA.debugLine="BottomSheet.Bind(\":overlay-color\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":overlay-color",_pp);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setoverlayopacity(String _varoverlayopacity) throws Exception{
String _pp = "";
 //BA.debugLineNum = 211;BA.debugLine="Sub SetOverlayOpacity(varOverlayOpacity As String)";
 //BA.debugLineNum = 212;BA.debugLine="If varOverlayOpacity = \"\" Then Return Me";
if ((_varoverlayopacity).equals("")) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 213;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 214;BA.debugLine="SetAttrSingle(\"overlay-opacity\", varOverlayOpaci";
_setattrsingle("overlay-opacity",_varoverlayopacity);
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 217;BA.debugLine="Dim pp As String = $\"${ID}OverlayOpacity\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OverlayOpacity");
 //BA.debugLineNum = 218;BA.debugLine="vue.SetStateSingle(pp, varOverlayOpacity)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoverlayopacity));
 //BA.debugLineNum = 219;BA.debugLine="BottomSheet.Bind(\":overlay-opacity\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":overlay-opacity",_pp);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 465;BA.debugLine="Sub SetPaddingAll(p As String) As VMBottomSheet";
 //BA.debugLineNum = 466;BA.debugLine="BottomSheet.SetPaddingAll(p)";
_bottomsheet._setpaddingall /*b4j.example.vmcontainer*/ (_p);
 //BA.debugLineNum = 467;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 468;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setpersistent(boolean _varpersistent) throws Exception{
String _pp = "";
 //BA.debugLineNum = 395;BA.debugLine="Sub SetPersistent(varPersistent As Boolean) As VMB";
 //BA.debugLineNum = 396;BA.debugLine="If varPersistent = False Then Return Me";
if (_varpersistent==__c.False) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 397;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 398;BA.debugLine="SetAttrSingle(\"persistent\", varPersistent)";
_setattrsingle("persistent",BA.ObjectToString(_varpersistent));
 //BA.debugLineNum = 399;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 401;BA.debugLine="Dim pp As String = $\"${ID}Persistent\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Persistent");
 //BA.debugLineNum = 402;BA.debugLine="vue.SetStateSingle(pp, varPersistent)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpersistent));
 //BA.debugLineNum = 403;BA.debugLine="BottomSheet.Bind(\":persistent\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":persistent",_pp);
 //BA.debugLineNum = 404;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 560;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMBot";
 //BA.debugLineNum = 561;BA.debugLine="BottomSheet.SetRC(sRow, sCol)";
_bottomsheet._setrc /*b4j.example.vmcontainer*/ (_srow,_scol);
 //BA.debugLineNum = 562;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setretainfocus(boolean _varretainfocus) throws Exception{
String _pp = "";
 //BA.debugLineNum = 408;BA.debugLine="Sub SetRetainFocus(varRetainFocus As Boolean) As V";
 //BA.debugLineNum = 409;BA.debugLine="If varRetainFocus = True Then Return Me";
if (_varretainfocus==__c.True) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 410;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 411;BA.debugLine="SetAttrSingle(\"retain-focus\", varRetainFocus)";
_setattrsingle("retain-focus",BA.ObjectToString(_varretainfocus));
 //BA.debugLineNum = 412;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 414;BA.debugLine="Dim pp As String = $\"${ID}RetainFocus\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"RetainFocus");
 //BA.debugLineNum = 415;BA.debugLine="vue.SetStateSingle(pp, varRetainFocus)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varretainfocus));
 //BA.debugLineNum = 416;BA.debugLine="BottomSheet.Bind(\":retain-focus\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":retain-focus",_pp);
 //BA.debugLineNum = 417;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 418;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setscrollable(boolean _varscrollable) throws Exception{
String _pp = "";
 //BA.debugLineNum = 421;BA.debugLine="Sub SetScrollable(varScrollable As Boolean) As VMB";
 //BA.debugLineNum = 422;BA.debugLine="If varScrollable = False Then Return Me";
if (_varscrollable==__c.False) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 423;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 424;BA.debugLine="SetAttrSingle(\"scrollable\", varScrollable)";
_setattrsingle("scrollable",BA.ObjectToString(_varscrollable));
 //BA.debugLineNum = 425;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 427;BA.debugLine="Dim pp As String = $\"${ID}Scrollable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Scrollable");
 //BA.debugLineNum = 428;BA.debugLine="vue.SetStateSingle(pp, varScrollable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varscrollable));
 //BA.debugLineNum = 429;BA.debugLine="BottomSheet.Bind(\":scrollable\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":scrollable",_pp);
 //BA.debugLineNum = 430;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 485;BA.debugLine="Sub SetStatic(b As Boolean) As VMBottomSheet";
 //BA.debugLineNum = 486;BA.debugLine="BottomSheet.SetStatic(b)";
_bottomsheet._setstatic /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 487;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 488;BA.debugLine="Footer.SetStatic(b)";
_footer._setstatic /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 489;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 490;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetStyle(sm As Map) As VMBottomSheet";
 //BA.debugLineNum = 105;BA.debugLine="BottomSheet.SetStyle(sm)";
_bottomsheet._setstyle /*b4j.example.vmcontainer*/ (_sm);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 505;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 506;BA.debugLine="BottomSheet.SetStyleSingle(prop, value)";
_bottomsheet._setstylesingle /*b4j.example.vmcontainer*/ (_prop,_value);
 //BA.debugLineNum = 507;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 508;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 493;BA.debugLine="Sub SetTabIndex(ti As String) As VMBottomSheet";
 //BA.debugLineNum = 494;BA.debugLine="BottomSheet.SetTabIndex(ti)";
_bottomsheet._settabindex /*b4j.example.vmcontainer*/ (_ti);
 //BA.debugLineNum = 495;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 496;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _settext(String _t) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetText(t As String) As VMBottomSheet";
 //BA.debugLineNum = 82;BA.debugLine="BottomSheet.SetText(t)";
_bottomsheet._settext /*b4j.example.vmcontainer*/ (_t);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _settextcenter() throws Exception{
 //BA.debugLineNum = 592;BA.debugLine="Sub SetTextCenter As VMBottomSheet";
 //BA.debugLineNum = 593;BA.debugLine="BottomSheet.AddClass(\"text-center\")";
_bottomsheet._addclass /*b4j.example.vmcontainer*/ ("text-center");
 //BA.debugLineNum = 594;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 595;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _settransition(String _vartransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 224;BA.debugLine="Sub SetTransition(varTransition As String) As VMBo";
 //BA.debugLineNum = 225;BA.debugLine="If varTransition = \"\" Then Return Me";
if ((_vartransition).equals("")) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 226;BA.debugLine="If varTransition = \"bottom-sheet-transition\" Then";
if ((_vartransition).equals("bottom-sheet-transition")) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 227;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 228;BA.debugLine="SetAttrSingle(\"transition\", varTransition)";
_setattrsingle("transition",_vartransition);
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 231;BA.debugLine="Dim pp As String = $\"${ID}Transition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Transition");
 //BA.debugLineNum = 232;BA.debugLine="vue.SetStateSingle(pp, varTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartransition));
 //BA.debugLineNum = 233;BA.debugLine="BottomSheet.Bind(\":transition\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":transition",_pp);
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setvalue(String _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 238;BA.debugLine="Sub SetValue(varValue As String) As VMBottomSheet";
 //BA.debugLineNum = 239;BA.debugLine="If varValue = \"\" Then Return Me";
if ((_varvalue).equals("")) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 240;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 241;BA.debugLine="SetAttrSingle(\"value\", varValue)";
_setattrsingle("value",_varvalue);
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 244;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 245;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue));
 //BA.debugLineNum = 246;BA.debugLine="BottomSheet.Bind(\":value\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":value",_pp);
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 522;BA.debugLine="Sub SetVElse(vif As String) As VMBottomSheet";
 //BA.debugLineNum = 523;BA.debugLine="BottomSheet.SetVElse(vif)";
_bottomsheet._setvelse /*b4j.example.vmcontainer*/ (_vif);
 //BA.debugLineNum = 524;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 545;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 546;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 547;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 548;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 549;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 550;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 551;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 532;BA.debugLine="Sub SetVhtml(vhtml As String) As VMBottomSheet";
 //BA.debugLineNum = 533;BA.debugLine="BottomSheet.SetVHtml(vhtml)";
_bottomsheet._setvhtml /*b4j.example.vmcontainer*/ (_vhtml);
 //BA.debugLineNum = 534;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 535;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetVIf(vif As String) As VMBottomSheet";
 //BA.debugLineNum = 59;BA.debugLine="BottomSheet.SetVIf(vif)";
_bottomsheet._setvif /*b4j.example.vmcontainer*/ (_vif);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 608;BA.debugLine="Sub SetVisible(b As Boolean) As VMBottomSheet";
 //BA.debugLineNum = 609;BA.debugLine="BottomSheet.SetVisible(b)";
_bottomsheet._setvisible /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 610;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 611;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetVModel(k As String) As VMBottomSheet";
 //BA.debugLineNum = 31;BA.debugLine="smodel = k";
_smodel = _k;
 //BA.debugLineNum = 32;BA.debugLine="BottomSheet.SetVModel(k)";
_bottomsheet._setvmodel /*b4j.example.vmcontainer*/ (_k);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetVShow(vif As String) As VMBottomSheet";
 //BA.debugLineNum = 64;BA.debugLine="BottomSheet.SetVShow(vif)";
_bottomsheet._setvshow /*b4j.example.vmcontainer*/ (_vif);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 527;BA.debugLine="Sub SetVText(vhtml As String) As VMBottomSheet";
 //BA.debugLineNum = 528;BA.debugLine="BottomSheet.SetVText(vhtml)";
_bottomsheet._setvtext /*b4j.example.vmcontainer*/ (_vhtml);
 //BA.debugLineNum = 529;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _setwidth(String _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 251;BA.debugLine="Sub SetWidth(varWidth As String) As VMBottomSheet";
 //BA.debugLineNum = 252;BA.debugLine="If varWidth = \"\" Then Return Me";
if ((_varwidth).equals("")) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 253;BA.debugLine="If varWidth = \"auto\" Then Return Me";
if ((_varwidth).equals("auto")) { 
if (true) return (b4j.example.vmbottomsheet)(this);};
 //BA.debugLineNum = 254;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 255;BA.debugLine="SetAttrSingle(\"width\", varWidth)";
_setattrsingle("width",_varwidth);
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 };
 //BA.debugLineNum = 258;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 259;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varwidth));
 //BA.debugLineNum = 260;BA.debugLine="BottomSheet.Bind(\":width\", pp)";
_bottomsheet._bind /*b4j.example.vmcontainer*/ (":width",_pp);
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public String  _show() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub Show";
 //BA.debugLineNum = 49;BA.debugLine="vue.SetData(smodel, True)";
_vue._setdata /*b4j.example.bananovue*/ (_smodel,(Object)(__c.True));
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 54;BA.debugLine="If Footer.HasContent Then SetText(Footer.ToString";
if (_footer._hascontent /*boolean*/ ) { 
_settext(_footer._tostring /*String*/ ());};
 //BA.debugLineNum = 55;BA.debugLine="Return BottomSheet.ToString";
if (true) return _bottomsheet._tostring /*String*/ ();
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottomsheet  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 448;BA.debugLine="Sub UseTheme(themeName As String) As VMBottomSheet";
 //BA.debugLineNum = 449;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 450;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 451;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 452;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 453;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 455;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomsheet)(this);
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
