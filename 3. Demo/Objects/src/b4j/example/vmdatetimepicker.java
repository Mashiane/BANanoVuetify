package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmdatetimepicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmdatetimepicker", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmdatetimepicker.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _datetimepicker = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bforinput = false;
public String _vmodel = "";
public b4j.example.vmtextfield _textfield = null;
public boolean _btimepicker = false;
public boolean _bstatic = false;
public boolean _bhideicons = false;
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
public b4j.example.vmdatetimepicker  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 314;BA.debugLine="Sub AddChild(child As VMElement) As VMDateTimePick";
 //BA.debugLineNum = 315;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 316;BA.debugLine="DateTimePicker.SetText(childHTML)";
_datetimepicker._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 350;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 351;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 352;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatetimepicker  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Sub AddClass(c As String) As VMDateTimePicker";
 //BA.debugLineNum = 333;BA.debugLine="DateTimePicker.AddClass(c)";
_datetimepicker._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _addspacer() throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="private Sub AddSpacer As VMDateTimePicker";
 //BA.debugLineNum = 280;BA.debugLine="DateTimePicker.AddSpacer";
_datetimepicker._addspacer /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 976;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 977;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 978;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatetimepicker  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 923;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 924;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 925;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 926;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 927;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 980;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 981;BA.debugLine="DateTimePicker.BuildModel(mprops, mstyles, lclasse";
_datetimepicker._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 982;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 983;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public DateTimePicker As VMElement";
_datetimepicker = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private bForInput As Boolean";
_bforinput = false;
 //BA.debugLineNum = 10;BA.debugLine="Private vmodel As String";
_vmodel = "";
 //BA.debugLineNum = 11;BA.debugLine="Public TextField As VMTextField";
_textfield = new b4j.example.vmtextfield();
 //BA.debugLineNum = 12;BA.debugLine="Private bTimePicker As Boolean";
_btimepicker = false;
 //BA.debugLineNum = 13;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 14;BA.debugLine="Private bHideIcons As Boolean";
_bhideicons = false;
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatetimepicker  _disable() throws Exception{
 //BA.debugLineNum = 916;BA.debugLine="Sub Disable As VMDateTimePicker";
 //BA.debugLineNum = 917;BA.debugLine="DateTimePicker.Disable(True)";
_datetimepicker._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 918;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 919;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _enable() throws Exception{
 //BA.debugLineNum = 911;BA.debugLine="Sub Enable As VMDateTimePicker";
 //BA.debugLineNum = 912;BA.debugLine="DateTimePicker.Enable(True)";
_datetimepicker._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 913;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 914;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _hide() throws Exception{
 //BA.debugLineNum = 901;BA.debugLine="Sub Hide As VMDateTimePicker";
 //BA.debugLineNum = 902;BA.debugLine="DateTimePicker.SetVisible(False)";
_datetimepicker._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 903;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 904;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 19;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 20;BA.debugLine="DateTimePicker.Initialize(v, ID)";
_datetimepicker._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 21;BA.debugLine="DateTimePicker.SetTag(\"v-date-picker\")";
_datetimepicker._settag /*b4j.example.vmelement*/ ("v-date-picker");
 //BA.debugLineNum = 22;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 24;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 25;BA.debugLine="bForInput = False";
_bforinput = __c.False;
 //BA.debugLineNum = 26;BA.debugLine="vmodel = \"\"";
_vmodel = "";
 //BA.debugLineNum = 27;BA.debugLine="DateTimePicker.typeOf = \"datepicker\"";
_datetimepicker._typeof /*String*/  = "datepicker";
 //BA.debugLineNum = 28;BA.debugLine="DateTimePicker.fieldType = \"date\"";
_datetimepicker._fieldtype /*String*/  = "date";
 //BA.debugLineNum = 29;BA.debugLine="TextField.Initialize(vue, $\"${ID}txt\"$, Module)";
_textfield._initialize /*b4j.example.vmtextfield*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"txt"),_module);
 //BA.debugLineNum = 30;BA.debugLine="bTimePicker = False";
_btimepicker = __c.False;
 //BA.debugLineNum = 31;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 32;BA.debugLine="bHideIcons = False";
_bhideicons = __c.False;
 //BA.debugLineNum = 33;BA.debugLine="SetOnChange(Module, $\"${ID}_change\"$)";
_setonchange(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_change"));
 //BA.debugLineNum = 34;BA.debugLine="SetOnClickDate($\"${ID}_clickdate\"$)";
_setonclickdate((""+__c.SmartStringFormatter("",(Object)(_id))+"_clickdate"));
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 328;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatetimepicker  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 930;BA.debugLine="public Sub RemoveAttr(sName As String) As VMDateTi";
 //BA.debugLineNum = 931;BA.debugLine="DateTimePicker.RemoveAttr(sName)";
_datetimepicker._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 932;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 933;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub Render";
 //BA.debugLineNum = 310;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatetimepicker  _set24() throws Exception{
 //BA.debugLineNum = 1120;BA.debugLine="Sub Set24 As VMDateTimePicker";
 //BA.debugLineNum = 1121;BA.debugLine="SetFormat(\"24hr\")";
_setformat("24hr");
 //BA.debugLineNum = 1122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 1123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setalloweddates(Object _varalloweddates) throws Exception{
String _pp = "";
 //BA.debugLineNum = 357;BA.debugLine="Sub SetAllowedDates(varAllowedDates As Object) As";
 //BA.debugLineNum = 358;BA.debugLine="Dim pp As String = $\"${ID}AllowedDates\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AllowedDates");
 //BA.debugLineNum = 359;BA.debugLine="vue.SetStateSingle(pp, varAllowedDates)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varalloweddates);
 //BA.debugLineNum = 360;BA.debugLine="DateTimePicker.Bind(\":allowed-dates\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":allowed-dates",_pp);
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setallowedhours(Object _varallowedhours) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1008;BA.debugLine="Sub SetAllowedHours(varAllowedHours As Object) As";
 //BA.debugLineNum = 1009;BA.debugLine="Dim pp As String = $\"${ID}AllowedHours\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AllowedHours");
 //BA.debugLineNum = 1010;BA.debugLine="vue.SetStateSingle(pp, varAllowedHours)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varallowedhours);
 //BA.debugLineNum = 1011;BA.debugLine="DateTimePicker.Bind(\":allowed-hours\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":allowed-hours",_pp);
 //BA.debugLineNum = 1012;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 1013;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setallowedminutes(Object _varallowedminutes) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1016;BA.debugLine="Sub SetAllowedMinutes(varAllowedMinutes As Object)";
 //BA.debugLineNum = 1017;BA.debugLine="Dim pp As String = $\"${ID}AllowedMinutes\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AllowedMinutes");
 //BA.debugLineNum = 1018;BA.debugLine="vue.SetStateSingle(pp, varAllowedMinutes)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varallowedminutes);
 //BA.debugLineNum = 1019;BA.debugLine="DateTimePicker.Bind(\":allowed-minutes\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":allowed-minutes",_pp);
 //BA.debugLineNum = 1020;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 1021;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setallowedseconds(Object _varallowedseconds) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1024;BA.debugLine="Sub SetAllowedSeconds(varAllowedSeconds As Object)";
 //BA.debugLineNum = 1025;BA.debugLine="Dim pp As String = $\"${ID}AllowedSeconds\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AllowedSeconds");
 //BA.debugLineNum = 1026;BA.debugLine="vue.SetStateSingle(pp, varAllowedSeconds)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varallowedseconds);
 //BA.debugLineNum = 1027;BA.debugLine="DateTimePicker.Bind(\":allowed-seconds\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":allowed-seconds",_pp);
 //BA.debugLineNum = 1028;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 1029;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setampmintitle(boolean _varampmintitle) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1032;BA.debugLine="Sub SetAmPmInTitle(varAmpmInTitle As Boolean) As V";
 //BA.debugLineNum = 1033;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1034;BA.debugLine="DateTimePicker.SetAttrSingle(\"ampm-in-title\", va";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("ampm-in-title",BA.ObjectToString(_varampmintitle));
 //BA.debugLineNum = 1035;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 1037;BA.debugLine="Dim pp As String = $\"${ID}AmpmInTitle\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AmpmInTitle");
 //BA.debugLineNum = 1038;BA.debugLine="vue.SetStateSingle(pp, varAmpmInTitle)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varampmintitle));
 //BA.debugLineNum = 1039;BA.debugLine="DateTimePicker.Bind(\":ampm-in-title\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":ampm-in-title",_pp);
 //BA.debugLineNum = 1040;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 1041;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub SetAttr(attr As Map) As VMDateTimePicker";
 //BA.debugLineNum = 339;BA.debugLine="DateTimePicker.SetAttr(attr)";
_datetimepicker._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 115;BA.debugLine="Sub SetAttributes(attrs As List) As VMDateTimePick";
 //BA.debugLineNum = 116;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 117;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub SetAttrLoose(loose As String) As VMDateTimePic";
 //BA.debugLineNum = 286;BA.debugLine="DateTimePicker.SetAttrLoose(loose)";
_datetimepicker._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 970;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 971;BA.debugLine="DateTimePicker.SetAttrSingle(prop, value)";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 972;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 973;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setautofocus(boolean _varautofocus) throws Exception{
String _pp = "";
 //BA.debugLineNum = 44;BA.debugLine="Sub SetAutofocus(varAutofocus As Boolean) As VMDat";
 //BA.debugLineNum = 45;BA.debugLine="If varAutofocus = False Then Return Me";
if (_varautofocus==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 46;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 47;BA.debugLine="TextField.SetAttrSingle(\"autofocus\", varAutofocu";
_textfield._setattrsingle /*b4j.example.vmtextfield*/ ("autofocus",BA.ObjectToString(_varautofocus));
 }else {
 //BA.debugLineNum = 49;BA.debugLine="Dim pp As String = $\"${ID}Autofocus\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Autofocus");
 //BA.debugLineNum = 50;BA.debugLine="vue.SetStateSingle(pp, varAutofocus)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varautofocus));
 //BA.debugLineNum = 51;BA.debugLine="TextField.Bind(\":autofocus\", pp)";
_textfield._bind /*b4j.example.vmtextfield*/ (":autofocus",_pp);
 };
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setclearable(boolean _varclearable) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMDat";
 //BA.debugLineNum = 185;BA.debugLine="TextField.SetClearable(varClearable)";
_textfield._setclearable /*b4j.example.vmtextfield*/ (_varclearable);
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 365;BA.debugLine="Sub SetColor(varColor As String) As VMDateTimePick";
 //BA.debugLineNum = 366;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 367;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 368;BA.debugLine="DateTimePicker.SetAttrSingle(\"color\", varColor)";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("color",_varcolor);
 //BA.debugLineNum = 369;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 371;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 372;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 373;BA.debugLine="DateTimePicker.Bind(\":color\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 151;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 152;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 153;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 154;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 155;BA.debugLine="DateTimePicker.SetAttrSingle(\"color\", scolor)";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("color",_scolor);
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 158;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 159;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 160;BA.debugLine="DateTimePicker.Bind(\":color\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 378;BA.debugLine="Sub SetDark(varDark As Boolean) As VMDateTimePicke";
 //BA.debugLineNum = 379;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 380;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 381;BA.debugLine="DateTimePicker.SetAttrSingle(\"dark\", varDark)";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 382;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 384;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 385;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 386;BA.debugLine="DateTimePicker.Bind(\":dark\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 39;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setdate() throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetDate As VMDateTimePicker";
 //BA.debugLineNum = 86;BA.debugLine="DateTimePicker.fieldType = \"date\"";
_datetimepicker._fieldtype /*String*/  = "date";
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setdayformat(String _vardayformat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 391;BA.debugLine="Sub SetDayFormat(varDayFormat As String) As VMDate";
 //BA.debugLineNum = 392;BA.debugLine="If varDayFormat = \"\" Then Return Me";
if ((_vardayformat).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 393;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 394;BA.debugLine="DateTimePicker.SetAttrSingle(\"day-format\", varDa";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("day-format",_vardayformat);
 //BA.debugLineNum = 395;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 397;BA.debugLine="Dim pp As String = $\"${ID}DayFormat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DayFormat");
 //BA.debugLineNum = 398;BA.debugLine="vue.SetStateSingle(pp, varDayFormat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardayformat));
 //BA.debugLineNum = 399;BA.debugLine="DateTimePicker.Bind(\":day-format\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":day-format",_pp);
 //BA.debugLineNum = 400;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setdense(boolean _b) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetDense(b As Boolean) As VMDateTimePicker";
 //BA.debugLineNum = 206;BA.debugLine="TextField.SetDense(b)";
_textfield._setdense /*b4j.example.vmtextfield*/ (_b);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 946;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMDateTimePicke";
 //BA.debugLineNum = 947;BA.debugLine="DateTimePicker.SetDesignMode(b)";
_datetimepicker._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 948;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 949;BA.debugLine="TextField.SetDesignMode(b)";
_textfield._setdesignmode /*b4j.example.vmtextfield*/ (_b);
 //BA.debugLineNum = 950;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 951;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 98;BA.debugLine="DateTimePicker.SetDeviceOffsets(OS, OM, OL, OX)";
_datetimepicker._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 110;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 111;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 104;BA.debugLine="DateTimePicker.SetDeviceSizes(SS, SM, SL, SX)";
_datetimepicker._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 404;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMDateT";
 //BA.debugLineNum = 405;BA.debugLine="DateTimePicker.SetDisabled(varDisabled)";
_datetimepicker._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _seteventcolor(String _vareventcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 410;BA.debugLine="Sub SetEventColor(varEventColor As String) As VMDa";
 //BA.debugLineNum = 411;BA.debugLine="If varEventColor = \"\" Then Return Me";
if ((_vareventcolor).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 412;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 413;BA.debugLine="DateTimePicker.SetAttrSingle(\"event-color\", varE";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("event-color",_vareventcolor);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 416;BA.debugLine="Dim pp As String = $\"${ID}EventColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"EventColor");
 //BA.debugLineNum = 417;BA.debugLine="vue.SetStateSingle(pp, varEventColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareventcolor));
 //BA.debugLineNum = 418;BA.debugLine="DateTimePicker.Bind(\":event-color\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":event-color",_pp);
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setevents(Object _varevents) throws Exception{
String _pp = "";
 //BA.debugLineNum = 423;BA.debugLine="Sub SetEvents(varEvents As Object) As VMDateTimePi";
 //BA.debugLineNum = 424;BA.debugLine="Dim pp As String = $\"${ID}Events\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Events");
 //BA.debugLineNum = 425;BA.debugLine="vue.SetStateSingle(pp, varEvents)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varevents);
 //BA.debugLineNum = 426;BA.debugLine="DateTimePicker.Bind(\":events\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":events",_pp);
 //BA.debugLineNum = 427;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setfieldtype(String _ft) throws Exception{
 //BA.debugLineNum = 731;BA.debugLine="Sub SetFieldType(ft As String) As VMDateTimePicker";
 //BA.debugLineNum = 732;BA.debugLine="DateTimePicker.fieldType = ft";
_datetimepicker._fieldtype /*String*/  = _ft;
 //BA.debugLineNum = 733;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 734;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setfirstdayofweek(String _varfirstdayofweek) throws Exception{
String _pp = "";
 //BA.debugLineNum = 431;BA.debugLine="Sub SetFirstDayOfWeek(varFirstDayOfWeek As String)";
 //BA.debugLineNum = 432;BA.debugLine="If varFirstDayOfWeek = \"\" Then Return Me";
if ((_varfirstdayofweek).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 433;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 434;BA.debugLine="DateTimePicker.SetAttrSingle(\"first-day-of-week\"";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("first-day-of-week",_varfirstdayofweek);
 //BA.debugLineNum = 435;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 437;BA.debugLine="Dim pp As String = $\"${ID}FirstDayOfWeek\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"FirstDayOfWeek");
 //BA.debugLineNum = 438;BA.debugLine="vue.SetStateSingle(pp, varFirstDayOfWeek)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfirstdayofweek));
 //BA.debugLineNum = 439;BA.debugLine="DateTimePicker.Bind(\":first-day-of-week\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":first-day-of-week",_pp);
 //BA.debugLineNum = 440;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 441;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setforinput() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetForInput As VMDateTimePicker";
 //BA.debugLineNum = 129;BA.debugLine="bForInput = True";
_bforinput = __c.True;
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setformat(String _varformat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1045;BA.debugLine="Sub SetFormat(varFormat As String) As VMDateTimePi";
 //BA.debugLineNum = 1046;BA.debugLine="If varFormat = \"\" Then Return Me";
if ((_varformat).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 1047;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1048;BA.debugLine="DateTimePicker.SetAttrSingle(\"format\", varFormat";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("format",_varformat);
 //BA.debugLineNum = 1049;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 1051;BA.debugLine="Dim pp As String = $\"${ID}Format\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Format");
 //BA.debugLineNum = 1052;BA.debugLine="vue.SetStateSingle(pp, varFormat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varformat));
 //BA.debugLineNum = 1053;BA.debugLine="DateTimePicker.Bind(\":format\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":format",_pp);
 //BA.debugLineNum = 1054;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 1055;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setfullwidth(boolean _varfullwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 444;BA.debugLine="Sub SetFullWidth(varFullWidth As Boolean) As VMDat";
 //BA.debugLineNum = 445;BA.debugLine="If varFullWidth = False Then Return Me";
if (_varfullwidth==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 446;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 447;BA.debugLine="DateTimePicker.SetAttrSingle(\"full-width\", varFu";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("full-width",BA.ObjectToString(_varfullwidth));
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 450;BA.debugLine="Dim pp As String = $\"${ID}FullWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"FullWidth");
 //BA.debugLineNum = 451;BA.debugLine="vue.SetStateSingle(pp, varFullWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfullwidth));
 //BA.debugLineNum = 452;BA.debugLine="DateTimePicker.Bind(\":full-width\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":full-width",_pp);
 //BA.debugLineNum = 453;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 454;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _sethaderdateformat(String _varhaderdateformat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 470;BA.debugLine="Sub SetHaderDateFormat(varHaderDateFormat As Strin";
 //BA.debugLineNum = 471;BA.debugLine="If varHaderDateFormat = \"\" Then Return Me";
if ((_varhaderdateformat).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 472;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 473;BA.debugLine="DateTimePicker.SetAttrSingle(\"hader-date-format\"";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("hader-date-format",_varhaderdateformat);
 //BA.debugLineNum = 474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 476;BA.debugLine="Dim pp As String = $\"${ID}HaderDateFormat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HaderDateFormat");
 //BA.debugLineNum = 477;BA.debugLine="vue.SetStateSingle(pp, varHaderDateFormat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhaderdateformat));
 //BA.debugLineNum = 478;BA.debugLine="DateTimePicker.Bind(\":hader-date-format\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":hader-date-format",_pp);
 //BA.debugLineNum = 479;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 480;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setheadercolor(String _varheadercolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 457;BA.debugLine="Sub SetHeaderColor(varHeaderColor As String) As VM";
 //BA.debugLineNum = 458;BA.debugLine="If varHeaderColor = \"\" Then Return Me";
if ((_varheadercolor).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 459;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 460;BA.debugLine="DateTimePicker.SetAttrSingle(\"header-color\", var";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("header-color",_varheadercolor);
 //BA.debugLineNum = 461;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 463;BA.debugLine="Dim pp As String = $\"${ID}HeaderColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HeaderColor");
 //BA.debugLineNum = 464;BA.debugLine="vue.SetStateSingle(pp, varHeaderColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheadercolor));
 //BA.debugLineNum = 465;BA.debugLine="DateTimePicker.Bind(\":header-color\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":header-color",_pp);
 //BA.debugLineNum = 466;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setheadercolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 164;BA.debugLine="Sub SetHeaderColorIntensity(varColor As String, va";
 //BA.debugLineNum = 165;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 166;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 167;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 168;BA.debugLine="DateTimePicker.SetAttrSingle(\"header-color\", sco";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("header-color",_scolor);
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 171;BA.debugLine="Dim pp As String = $\"${ID}HeaderColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HeaderColor");
 //BA.debugLineNum = 172;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 173;BA.debugLine="DateTimePicker.Bind(\":header-color\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":header-color",_pp);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _sethidedetails(boolean _b) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetHideDetails(b As Boolean) As VMDateTimePick";
 //BA.debugLineNum = 76;BA.debugLine="TextField.SetHideDetails(b)";
_textfield._sethidedetails /*b4j.example.vmtextfield*/ (_b);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _sethint(String _varhint) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetHint(varHint As String) As VMDateTimePicker";
 //BA.debugLineNum = 199;BA.debugLine="TextField.SetHint(varHint)";
_textfield._sethint /*b4j.example.vmtextfield*/ (_varhint);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setisnow(boolean _b) throws Exception{
long _lnow = 0L;
String _dt = "";
 //BA.debugLineNum = 744;BA.debugLine="Sub SetIsNow(b As Boolean) As VMDateTimePicker";
 //BA.debugLineNum = 745;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 746;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
 //BA.debugLineNum = 747;BA.debugLine="Dim dt As String";
_dt = "";
 //BA.debugLineNum = 748;BA.debugLine="lNow = DateTime.Now";
_lnow = __c.DateTime.getNow();
 //BA.debugLineNum = 749;BA.debugLine="Select Case bTimePicker";
switch (BA.switchObjectToInt(_btimepicker,__c.False,__c.True)) {
case 0: {
 //BA.debugLineNum = 752;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 753;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = __c.DateTime.Date(_lnow);
 //BA.debugLineNum = 754;BA.debugLine="SetValue(dt)";
_setvalue(_dt);
 break; }
case 1: {
 //BA.debugLineNum = 757;BA.debugLine="DateTime.DateFormat = \"HH:mm\"";
__c.DateTime.setDateFormat("HH:mm");
 //BA.debugLineNum = 758;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = __c.DateTime.Date(_lnow);
 //BA.debugLineNum = 759;BA.debugLine="SetValue(dt)";
_setvalue(_dt);
 break; }
}
;
 //BA.debugLineNum = 761;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 762;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setlabel(String _dlabel) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetLabel(dlabel As String) As VMDateTimePicker";
 //BA.debugLineNum = 123;BA.debugLine="TextField.SetLabel(dlabel)";
_textfield._setlabel /*b4j.example.vmtextfield*/ (_dlabel);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setlandscape(boolean _varlandscape) throws Exception{
String _pp = "";
 //BA.debugLineNum = 483;BA.debugLine="Sub SetLandscape(varLandscape As Boolean) As VMDat";
 //BA.debugLineNum = 484;BA.debugLine="If varLandscape = False Then Return Me";
if (_varlandscape==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 485;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 486;BA.debugLine="DateTimePicker.SetAttrSingle(\"landscape\", varLan";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("landscape",BA.ObjectToString(_varlandscape));
 //BA.debugLineNum = 487;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 489;BA.debugLine="Dim pp As String = $\"${ID}Landscape\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Landscape");
 //BA.debugLineNum = 490;BA.debugLine="vue.SetStateSingle(pp, varLandscape)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlandscape));
 //BA.debugLineNum = 491;BA.debugLine="DateTimePicker.Bind(\":landscape\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":landscape",_pp);
 //BA.debugLineNum = 492;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 493;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 496;BA.debugLine="Sub SetLight(varLight As Boolean) As VMDateTimePic";
 //BA.debugLineNum = 497;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 498;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 499;BA.debugLine="DateTimePicker.SetAttrSingle(\"light\", varLight)";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 500;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 502;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 503;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 504;BA.debugLine="DateTimePicker.Bind(\":light\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 505;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 506;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setlocale(String _varlocale) throws Exception{
String _pp = "";
 //BA.debugLineNum = 509;BA.debugLine="Sub SetLocale(varLocale As String) As VMDateTimePi";
 //BA.debugLineNum = 510;BA.debugLine="If varLocale = \"\" Then Return Me";
if ((_varlocale).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 511;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 512;BA.debugLine="DateTimePicker.SetAttrSingle(\"locale\", varLocale";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("locale",_varlocale);
 //BA.debugLineNum = 513;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 515;BA.debugLine="Dim pp As String = $\"${ID}Locale\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Locale");
 //BA.debugLineNum = 516;BA.debugLine="vue.SetStateSingle(pp, varLocale)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlocale));
 //BA.debugLineNum = 517;BA.debugLine="DateTimePicker.Bind(\":locale\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":locale",_pp);
 //BA.debugLineNum = 518;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 519;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 941;BA.debugLine="Sub SetMarginAll(p As String) As VMDateTimePicker";
 //BA.debugLineNum = 942;BA.debugLine="DateTimePicker.setmarginall(p)";
_datetimepicker._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 943;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 944;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setmax(String _varmax) throws Exception{
String _pp = "";
 //BA.debugLineNum = 522;BA.debugLine="Sub SetMax(varMax As String) As VMDateTimePicker";
 //BA.debugLineNum = 523;BA.debugLine="If varMax = \"\" Then Return Me";
if ((_varmax).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 524;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 525;BA.debugLine="DateTimePicker.SetAttrSingle(\"max\", varMax)";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("max",_varmax);
 //BA.debugLineNum = 526;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 528;BA.debugLine="Dim pp As String = $\"${ID}Max\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Max");
 //BA.debugLineNum = 529;BA.debugLine="vue.SetStateSingle(pp, varMax)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmax));
 //BA.debugLineNum = 530;BA.debugLine="DateTimePicker.Bind(\":max\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":max",_pp);
 //BA.debugLineNum = 531;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 532;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setmin(String _varmin) throws Exception{
String _pp = "";
 //BA.debugLineNum = 535;BA.debugLine="Sub SetMin(varMin As String) As VMDateTimePicker";
 //BA.debugLineNum = 536;BA.debugLine="If varMin = \"\" Then Return Me";
if ((_varmin).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 537;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 538;BA.debugLine="DateTimePicker.SetAttrSingle(\"min\", varMin)";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("min",_varmin);
 //BA.debugLineNum = 539;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 541;BA.debugLine="Dim pp As String = $\"${ID}Min\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Min");
 //BA.debugLineNum = 542;BA.debugLine="vue.SetStateSingle(pp, varMin)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmin));
 //BA.debugLineNum = 543;BA.debugLine="DateTimePicker.Bind(\":min\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":min",_pp);
 //BA.debugLineNum = 544;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 545;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setmonthformat(String _varmonthformat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 548;BA.debugLine="Sub SetMonthFormat(varMonthFormat As String) As VM";
 //BA.debugLineNum = 549;BA.debugLine="If varMonthFormat = \"\" Then Return Me";
if ((_varmonthformat).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 550;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 551;BA.debugLine="DateTimePicker.SetAttrSingle(\"month-format\", var";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("month-format",_varmonthformat);
 //BA.debugLineNum = 552;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 554;BA.debugLine="Dim pp As String = $\"${ID}MonthFormat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MonthFormat");
 //BA.debugLineNum = 555;BA.debugLine="vue.SetStateSingle(pp, varMonthFormat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmonthformat));
 //BA.debugLineNum = 556;BA.debugLine="DateTimePicker.Bind(\":month-format\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":month-format",_pp);
 //BA.debugLineNum = 557;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 558;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setmonthpicker() throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetMonthPicker As VMDateTimePicker";
 //BA.debugLineNum = 134;BA.debugLine="SetType(\"month\")";
_settype("month");
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setmultiple(boolean _varmultiple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 561;BA.debugLine="Sub SetMultiple(varMultiple As Boolean) As VMDateT";
 //BA.debugLineNum = 562;BA.debugLine="If varMultiple = False Then Return Me";
if (_varmultiple==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 563;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 564;BA.debugLine="DateTimePicker.SetAttrSingle(\"multiple\", varMult";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("multiple",BA.ObjectToString(_varmultiple));
 //BA.debugLineNum = 565;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 567;BA.debugLine="Dim pp As String = $\"${ID}Multiple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Multiple");
 //BA.debugLineNum = 568;BA.debugLine="vue.SetStateSingle(pp, varMultiple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmultiple));
 //BA.debugLineNum = 569;BA.debugLine="DateTimePicker.Bind(\":multiple\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":multiple",_pp);
 //BA.debugLineNum = 570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 571;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 959;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 960;BA.debugLine="DateTimePicker.SetName(varName, bbind)";
_datetimepicker._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 961;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 962;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setnexticon(String _varnexticon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 574;BA.debugLine="Sub SetNextIcon(varNextIcon As String) As VMDateTi";
 //BA.debugLineNum = 575;BA.debugLine="If varNextIcon = \"\" Then Return Me";
if ((_varnexticon).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 576;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 577;BA.debugLine="DateTimePicker.SetAttrSingle(\"next-icon\", varNex";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("next-icon",_varnexticon);
 //BA.debugLineNum = 578;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 580;BA.debugLine="Dim pp As String = $\"${ID}NextIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NextIcon");
 //BA.debugLineNum = 581;BA.debugLine="vue.SetStateSingle(pp, varNextIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnexticon));
 //BA.debugLineNum = 582;BA.debugLine="DateTimePicker.Bind(\":next-icon\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":next-icon",_pp);
 //BA.debugLineNum = 583;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 584;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setnotitle(boolean _varnotitle) throws Exception{
String _pp = "";
 //BA.debugLineNum = 587;BA.debugLine="Sub SetNoTitle(varNoTitle As Boolean) As VMDateTim";
 //BA.debugLineNum = 588;BA.debugLine="If varNoTitle = False Then Return Me";
if (_varnotitle==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 589;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 590;BA.debugLine="DateTimePicker.SetAttrSingle(\"no-title\", varNoTi";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("no-title",BA.ObjectToString(_varnotitle));
 //BA.debugLineNum = 591;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 593;BA.debugLine="Dim pp As String = $\"${ID}NoTitle\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NoTitle");
 //BA.debugLineNum = 594;BA.debugLine="vue.SetStateSingle(pp, varNoTitle)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnotitle));
 //BA.debugLineNum = 595;BA.debugLine="DateTimePicker.Bind(\":no-title\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":no-title",_pp);
 //BA.debugLineNum = 596;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 597;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setonchange(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 817;BA.debugLine="Sub SetOnChange(eventHandler As Object, methodName";
 //BA.debugLineNum = 818;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 819;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 820;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 821;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 822;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 824;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 825;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 826;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setonclickclear(Object _eventhandler,String _methodname) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetOnClickClear(eventHandler As Object, method";
 //BA.debugLineNum = 57;BA.debugLine="TextField.SetOnClickClear(eventHandler, methodNam";
_textfield._setonclickclear /*b4j.example.vmtextfield*/ (_eventhandler,_methodname);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setonclickdate(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 829;BA.debugLine="Sub SetOnClickDate(methodName As String) As VMDate";
 //BA.debugLineNum = 830;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 831;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 832;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 833;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 834;BA.debugLine="SetAttr(CreateMap(\"@click:date\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:date"),(Object)(_methodname)}));
 //BA.debugLineNum = 836;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 837;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 838;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setonclickhour(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1072;BA.debugLine="Sub SetOnClickHour(methodName As String) As VMDate";
 //BA.debugLineNum = 1073;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1074;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 1075;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1076;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1077;BA.debugLine="SetAttr(CreateMap(\"@click:hour\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:hour"),(Object)(_methodname)}));
 //BA.debugLineNum = 1079;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1080;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 1081;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setonclickminute(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1084;BA.debugLine="Sub SetOnClickMinute(methodName As String) As VMDa";
 //BA.debugLineNum = 1085;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1086;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 1087;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1088;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1089;BA.debugLine="SetAttr(CreateMap(\"@click:minute\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:minute"),(Object)(_methodname)}));
 //BA.debugLineNum = 1091;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1092;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 1093;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setonclickmonth(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 841;BA.debugLine="Sub SetOnClickMonth(methodName As String) As VMDat";
 //BA.debugLineNum = 842;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 843;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 844;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 845;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 846;BA.debugLine="SetAttr(CreateMap(\"@click:month\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:month"),(Object)(_methodname)}));
 //BA.debugLineNum = 848;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 849;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 850;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setonclicksecond(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1096;BA.debugLine="Sub SetOnClickSecond(methodName As String) As VMDa";
 //BA.debugLineNum = 1097;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1098;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 1099;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1100;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1101;BA.debugLine="SetAttr(CreateMap(\"@click:second\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:second"),(Object)(_methodname)}));
 //BA.debugLineNum = 1103;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 1105;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setondblclickdate(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 865;BA.debugLine="Sub SetOnDblclickDate(methodName As String) As VMD";
 //BA.debugLineNum = 866;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 867;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 868;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 869;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 870;BA.debugLine="SetAttr(CreateMap(\"@dblclick:date\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@dblclick:date"),(Object)(_methodname)}));
 //BA.debugLineNum = 872;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 873;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 874;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setondblclickmonth(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 853;BA.debugLine="Sub SetOnDblclickMonth(methodName As String) As VM";
 //BA.debugLineNum = 854;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 855;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 856;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 857;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 858;BA.debugLine="SetAttr(CreateMap(\"@dblclick:month\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@dblclick:month"),(Object)(_methodname)}));
 //BA.debugLineNum = 860;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 861;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 862;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setoninput(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 877;BA.debugLine="Sub SetOnInput(methodName As String) As VMDateTime";
 //BA.debugLineNum = 878;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 879;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 880;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 881;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 882;BA.debugLine="SetAttr(CreateMap(\"@input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_methodname)}));
 //BA.debugLineNum = 884;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 885;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 886;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setonupdateperiod(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1108;BA.debugLine="Sub SetOnUpdatePeriod(methodName As String) As VMD";
 //BA.debugLineNum = 1109;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1110;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 1111;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1112;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1113;BA.debugLine="SetAttr(CreateMap(\"@update:period\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:period"),(Object)(_methodname)}));
 //BA.debugLineNum = 1115;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 1117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setonupdatepickerdate(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 889;BA.debugLine="Sub SetOnUpDatePickerDate(methodName As String) As";
 //BA.debugLineNum = 890;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 891;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 892;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 893;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 894;BA.debugLine="SetAttr(CreateMap(\"@update:picker-date\": methodNa";
_setattr(__c.createMap(new Object[] {(Object)("@update:picker-date"),(Object)(_methodname)}));
 //BA.debugLineNum = 896;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 897;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 898;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setoutlined(boolean _b) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetOutlined(b As Boolean) As VMDateTimePicker";
 //BA.debugLineNum = 81;BA.debugLine="TextField.SetOutlined(b)";
_textfield._setoutlined /*b4j.example.vmtextfield*/ (_b);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 936;BA.debugLine="Sub SetPaddingAll(p As String) As VMDateTimePicker";
 //BA.debugLineNum = 937;BA.debugLine="DateTimePicker.SetPaddingAll(p)";
_datetimepicker._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 938;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 939;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setpickerdate(String _varpickerdate) throws Exception{
String _pp = "";
 //BA.debugLineNum = 600;BA.debugLine="Sub SetPickerDate(varPickerDate As String) As VMDa";
 //BA.debugLineNum = 601;BA.debugLine="If varPickerDate = \"\" Then Return Me";
if ((_varpickerdate).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 602;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 603;BA.debugLine="DateTimePicker.SetAttrSingle(\"picker-date\", varP";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("picker-date",_varpickerdate);
 //BA.debugLineNum = 604;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 606;BA.debugLine="Dim pp As String = $\"${ID}PickerDate\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PickerDate");
 //BA.debugLineNum = 607;BA.debugLine="vue.SetStateSingle(pp, varPickerDate)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpickerdate));
 //BA.debugLineNum = 608;BA.debugLine="DateTimePicker.Bind(\":picker-date\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":picker-date",_pp);
 //BA.debugLineNum = 609;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 610;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setplaceholder(String _varplaceholder) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub SetPlaceholder(varPlaceholder As String) As VM";
 //BA.debugLineNum = 191;BA.debugLine="If varPlaceholder = \"\" Then Return Me";
if ((_varplaceholder).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 192;BA.debugLine="TextField.SetPlaceholder(varPlaceholder)";
_textfield._setplaceholder /*b4j.example.vmtextfield*/ (_varplaceholder);
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setprevicon(String _varprevicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 613;BA.debugLine="Sub SetPrevIcon(varPrevIcon As String) As VMDateTi";
 //BA.debugLineNum = 614;BA.debugLine="If varPrevIcon = \"\" Then Return Me";
if ((_varprevicon).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 615;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 616;BA.debugLine="DateTimePicker.SetAttrSingle(\"prev-icon\", varPre";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("prev-icon",_varprevicon);
 //BA.debugLineNum = 617;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 619;BA.debugLine="Dim pp As String = $\"${ID}PrevIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrevIcon");
 //BA.debugLineNum = 620;BA.debugLine="vue.SetStateSingle(pp, varPrevIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprevicon));
 //BA.debugLineNum = 621;BA.debugLine="DateTimePicker.Bind(\":prev-icon\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":prev-icon",_pp);
 //BA.debugLineNum = 622;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 623;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setrange(boolean _varrange) throws Exception{
String _pp = "";
 //BA.debugLineNum = 626;BA.debugLine="Sub SetRange(varRange As Boolean) As VMDateTimePic";
 //BA.debugLineNum = 627;BA.debugLine="If varRange = False Then Return Me";
if (_varrange==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 628;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 629;BA.debugLine="DateTimePicker.SetAttrSingle(\"range\", varRange)";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("range",BA.ObjectToString(_varrange));
 //BA.debugLineNum = 630;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 632;BA.debugLine="Dim pp As String = $\"${ID}Range\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Range");
 //BA.debugLineNum = 633;BA.debugLine="vue.SetStateSingle(pp, varRange)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varrange));
 //BA.debugLineNum = 634;BA.debugLine="DateTimePicker.Bind(\":range\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":range",_pp);
 //BA.debugLineNum = 635;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 636;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMDat";
 //BA.debugLineNum = 92;BA.debugLine="DateTimePicker.SetRC(sRow, sCol)";
_datetimepicker._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setreadonly(boolean _varreadonly) throws Exception{
String _pp = "";
 //BA.debugLineNum = 639;BA.debugLine="Sub SetReadonly(varReadonly As Boolean) As VMDateT";
 //BA.debugLineNum = 640;BA.debugLine="bHideIcons = varReadonly";
_bhideicons = _varreadonly;
 //BA.debugLineNum = 641;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 642;BA.debugLine="TextField.SetAttrSingle(\"readonly\", varReadonly)";
_textfield._setattrsingle /*b4j.example.vmtextfield*/ ("readonly",BA.ObjectToString(_varreadonly));
 //BA.debugLineNum = 643;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 645;BA.debugLine="Dim pp As String = $\"${ID}Readonly\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Readonly");
 //BA.debugLineNum = 646;BA.debugLine="vue.SetStateSingle(pp, varReadonly)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreadonly));
 //BA.debugLineNum = 647;BA.debugLine="TextField.Bind(\":readonly\", pp)";
_textfield._bind /*b4j.example.vmtextfield*/ (":readonly",_pp);
 //BA.debugLineNum = 648;BA.debugLine="DateTimePicker.Bind(\":readonly\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":readonly",_pp);
 //BA.debugLineNum = 649;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 650;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setrequired(boolean _varrequired) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMDateT";
 //BA.debugLineNum = 179;BA.debugLine="TextField.SetRequired(varRequired)";
_textfield._setrequired /*b4j.example.vmtextfield*/ (_varrequired);
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setscrollable(boolean _varscrollable) throws Exception{
String _pp = "";
 //BA.debugLineNum = 653;BA.debugLine="Sub SetScrollable(varScrollable As Boolean) As VMD";
 //BA.debugLineNum = 654;BA.debugLine="If varScrollable = False Then Return Me";
if (_varscrollable==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 655;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 656;BA.debugLine="DateTimePicker.SetAttrSingle(\"scrollable\", varSc";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("scrollable",BA.ObjectToString(_varscrollable));
 //BA.debugLineNum = 657;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 659;BA.debugLine="Dim pp As String = $\"${ID}Scrollable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Scrollable");
 //BA.debugLineNum = 660;BA.debugLine="vue.SetStateSingle(pp, varScrollable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varscrollable));
 //BA.debugLineNum = 661;BA.debugLine="DateTimePicker.Bind(\":scrollable\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":scrollable",_pp);
 //BA.debugLineNum = 662;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 663;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setselecteditemstext(String _varselecteditemstext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 666;BA.debugLine="Sub SetSelectedItemsText(varSelectedItemsText As S";
 //BA.debugLineNum = 667;BA.debugLine="If varSelectedItemsText = \"\" Then Return Me";
if ((_varselecteditemstext).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 668;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 669;BA.debugLine="DateTimePicker.SetAttrSingle(\"selected-items-tex";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("selected-items-text",_varselecteditemstext);
 //BA.debugLineNum = 670;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 672;BA.debugLine="Dim pp As String = $\"${ID}SelectedItemsText\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SelectedItemsText");
 //BA.debugLineNum = 673;BA.debugLine="vue.SetStateSingle(pp, varSelectedItemsText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varselecteditemstext));
 //BA.debugLineNum = 674;BA.debugLine="DateTimePicker.Bind(\":selected-items-text\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":selected-items-text",_pp);
 //BA.debugLineNum = 675;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 676;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setshowcurrent(boolean _varshowcurrent) throws Exception{
String _pp = "";
 //BA.debugLineNum = 679;BA.debugLine="Sub SetShowCurrent(varShowCurrent As Boolean) As V";
 //BA.debugLineNum = 680;BA.debugLine="If varShowCurrent = False Then Return Me";
if (_varshowcurrent==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 681;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 682;BA.debugLine="DateTimePicker.SetAttrSingle(\"show-current\", var";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("show-current",BA.ObjectToString(_varshowcurrent));
 //BA.debugLineNum = 683;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 685;BA.debugLine="Dim pp As String = $\"${ID}ShowCurrent\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowCurrent");
 //BA.debugLineNum = 686;BA.debugLine="vue.SetStateSingle(pp, varShowCurrent)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshowcurrent));
 //BA.debugLineNum = 687;BA.debugLine="DateTimePicker.Bind(\":show-current\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":show-current",_pp);
 //BA.debugLineNum = 688;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 689;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setshowweek(boolean _varshowweek) throws Exception{
String _pp = "";
 //BA.debugLineNum = 692;BA.debugLine="Sub SetShowWeek(varShowWeek As Boolean) As VMDateT";
 //BA.debugLineNum = 693;BA.debugLine="If varShowWeek = False Then Return Me";
if (_varshowweek==__c.False) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 694;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 695;BA.debugLine="DateTimePicker.SetAttrSingle(\"show-week\", varSho";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("show-week",BA.ObjectToString(_varshowweek));
 //BA.debugLineNum = 696;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 698;BA.debugLine="Dim pp As String = $\"${ID}ShowWeek\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowWeek");
 //BA.debugLineNum = 699;BA.debugLine="vue.SetStateSingle(pp, varShowWeek)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshowweek));
 //BA.debugLineNum = 700;BA.debugLine="DateTimePicker.Bind(\":show-week\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":show-week",_pp);
 //BA.debugLineNum = 701;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 702;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetStatic(b As Boolean) As VMDateTimePicker";
 //BA.debugLineNum = 62;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 63;BA.debugLine="TextField.SetStatic(b)";
_textfield._setstatic /*b4j.example.vmtextfield*/ (_b);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub SetStyle(sm As Map) As VMDateTimePicker";
 //BA.debugLineNum = 345;BA.debugLine="DateTimePicker.SetStyle(sm)";
_datetimepicker._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 965;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 966;BA.debugLine="DateTimePicker.SetStyleSingle(prop, value)";
_datetimepicker._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 967;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 968;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 953;BA.debugLine="Sub SetTabIndex(ti As String) As VMDateTimePicker";
 //BA.debugLineNum = 954;BA.debugLine="DateTimePicker.SetTabIndex(ti)";
_datetimepicker._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 955;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 956;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub SetText(t As Object) As VMDateTimePicker";
 //BA.debugLineNum = 322;BA.debugLine="DateTimePicker.SetText(t)";
_datetimepicker._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 991;BA.debugLine="Sub SetTextColor(varColor As String) As VMDateTime";
 //BA.debugLineNum = 992;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 993;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 994;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 995;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 998;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 999;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 1000;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 1001;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 1002;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 1003;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 1004;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _settimepicker() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetTimePicker As VMDateTimePicker";
 //BA.debugLineNum = 68;BA.debugLine="bTimePicker = True";
_btimepicker = __c.True;
 //BA.debugLineNum = 69;BA.debugLine="DateTimePicker.SetTag(\"v-time-picker\")";
_datetimepicker._settag /*b4j.example.vmelement*/ ("v-time-picker");
 //BA.debugLineNum = 70;BA.debugLine="DateTimePicker.typeOf = \"timepicker\"";
_datetimepicker._typeof /*String*/  = "timepicker";
 //BA.debugLineNum = 71;BA.debugLine="DateTimePicker.fieldType = \"string\"";
_datetimepicker._fieldtype /*String*/  = "string";
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _settitledateformat(String _vartitledateformat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 705;BA.debugLine="Sub SetTitleDateFormat(varTitleDateFormat As Strin";
 //BA.debugLineNum = 706;BA.debugLine="If varTitleDateFormat = \"\" Then Return Me";
if ((_vartitledateformat).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 707;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 708;BA.debugLine="DateTimePicker.SetAttrSingle(\"title-date-format\"";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("title-date-format",_vartitledateformat);
 //BA.debugLineNum = 709;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 711;BA.debugLine="Dim pp As String = $\"${ID}TitleDateFormat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"TitleDateFormat");
 //BA.debugLineNum = 712;BA.debugLine="vue.SetStateSingle(pp, varTitleDateFormat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartitledateformat));
 //BA.debugLineNum = 713;BA.debugLine="DateTimePicker.Bind(\":title-date-format\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":title-date-format",_pp);
 //BA.debugLineNum = 714;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 715;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _settype(String _vartype) throws Exception{
String _pp = "";
 //BA.debugLineNum = 718;BA.debugLine="Sub SetType(varType As String) As VMDateTimePicker";
 //BA.debugLineNum = 719;BA.debugLine="If varType = \"\" Then Return Me";
if ((_vartype).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 720;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 721;BA.debugLine="DateTimePicker.SetAttrSingle(\"type\", varType)";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("type",_vartype);
 //BA.debugLineNum = 722;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 724;BA.debugLine="Dim pp As String = $\"${ID}Type\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Type");
 //BA.debugLineNum = 725;BA.debugLine="vue.SetStateSingle(pp, varType)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartype));
 //BA.debugLineNum = 726;BA.debugLine="DateTimePicker.Bind(\":type\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":type",_pp);
 //BA.debugLineNum = 727;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 728;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setuseseconds(Object _varuserseconds) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1059;BA.debugLine="Sub SetUseSeconds(varUserSeconds As Object) As VMD";
 //BA.debugLineNum = 1060;BA.debugLine="If varUserSeconds = False Then Return Me";
if ((_varuserseconds).equals((Object)(__c.False))) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 1061;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1062;BA.debugLine="DateTimePicker.SetAttrSingle(\"use-seconds\", varU";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("use-seconds",BA.ObjectToString(_varuserseconds));
 //BA.debugLineNum = 1063;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 1065;BA.debugLine="Dim pp As String = $\"${ID}UserSeconds\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"UserSeconds");
 //BA.debugLineNum = 1066;BA.debugLine="vue.SetStateSingle(pp, varUserSeconds)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varuserseconds);
 //BA.debugLineNum = 1067;BA.debugLine="DateTimePicker.Bind(\":use-seconds\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":use-seconds",_pp);
 //BA.debugLineNum = 1068;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 1069;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 737;BA.debugLine="Sub SetValue(varValue As String) As VMDateTimePick";
 //BA.debugLineNum = 738;BA.debugLine="DateTimePicker.SetValue(varValue,False)";
_datetimepicker._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 739;BA.debugLine="TextField.SetValue(varValue)";
_textfield._setvalue /*b4j.example.vmtextfield*/ (_varvalue);
 //BA.debugLineNum = 740;BA.debugLine="vue.SetData(vmodel, varValue)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(_varvalue));
 //BA.debugLineNum = 741;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 742;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub SetVIf(vif As String) As VMDateTimePicker";
 //BA.debugLineNum = 299;BA.debugLine="DateTimePicker.SetVIf(vif)";
_datetimepicker._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 985;BA.debugLine="Sub SetVisible(b As Boolean) As VMDateTimePicker";
 //BA.debugLineNum = 986;BA.debugLine="DateTimePicker.SetVisible(b)";
_datetimepicker._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 987;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 988;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub SetVModel(k As String) As VMDateTimePicker";
 //BA.debugLineNum = 291;BA.debugLine="k =k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 292;BA.debugLine="DateTimePicker.SetVModel(k)";
_datetimepicker._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 293;BA.debugLine="TextField.SetVModel(k)";
_textfield._setvmodel /*b4j.example.vmtextfield*/ (_k);
 //BA.debugLineNum = 294;BA.debugLine="vmodel = k";
_vmodel = _k;
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub SetVShow(vif As String) As VMDateTimePicker";
 //BA.debugLineNum = 304;BA.debugLine="DateTimePicker.SetVShow(vif)";
_datetimepicker._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setweekdayformat(String _varweekdayformat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 765;BA.debugLine="Sub SetWeekdayFormat(varWeekdayFormat As String) A";
 //BA.debugLineNum = 766;BA.debugLine="If varWeekdayFormat = \"\" Then Return Me";
if ((_varweekdayformat).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 767;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 768;BA.debugLine="DateTimePicker.SetAttrSingle(\"weekday-format\", v";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("weekday-format",_varweekdayformat);
 //BA.debugLineNum = 769;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 771;BA.debugLine="Dim pp As String = $\"${ID}WeekdayFormat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"WeekdayFormat");
 //BA.debugLineNum = 772;BA.debugLine="vue.SetStateSingle(pp, varWeekdayFormat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varweekdayformat));
 //BA.debugLineNum = 773;BA.debugLine="DateTimePicker.Bind(\":weekday-format\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":weekday-format",_pp);
 //BA.debugLineNum = 774;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 775;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setwidth(String _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 778;BA.debugLine="Sub SetWidth(varWidth As String) As VMDateTimePick";
 //BA.debugLineNum = 779;BA.debugLine="If varWidth = \"\" Then Return Me";
if ((_varwidth).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 780;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 781;BA.debugLine="DateTimePicker.SetAttrSingle(\"width\", varWidth)";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("width",_varwidth);
 //BA.debugLineNum = 782;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 784;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 785;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varwidth));
 //BA.debugLineNum = 786;BA.debugLine="DateTimePicker.Bind(\":width\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":width",_pp);
 //BA.debugLineNum = 787;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 788;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setyearformat(String _varyearformat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 791;BA.debugLine="Sub SetYearFormat(varYearFormat As String) As VMDa";
 //BA.debugLineNum = 792;BA.debugLine="If varYearFormat = \"\" Then Return Me";
if ((_varyearformat).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 793;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 794;BA.debugLine="DateTimePicker.SetAttrSingle(\"year-format\", varY";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("year-format",_varyearformat);
 //BA.debugLineNum = 795;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 797;BA.debugLine="Dim pp As String = $\"${ID}YearFormat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"YearFormat");
 //BA.debugLineNum = 798;BA.debugLine="vue.SetStateSingle(pp, varYearFormat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varyearformat));
 //BA.debugLineNum = 799;BA.debugLine="DateTimePicker.Bind(\":year-format\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":year-format",_pp);
 //BA.debugLineNum = 800;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 801;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _setyearicon(String _varyearicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 804;BA.debugLine="Sub SetYearIcon(varYearIcon As String) As VMDateTi";
 //BA.debugLineNum = 805;BA.debugLine="If varYearIcon = \"\" Then Return Me";
if ((_varyearicon).equals("")) { 
if (true) return (b4j.example.vmdatetimepicker)(this);};
 //BA.debugLineNum = 806;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 807;BA.debugLine="DateTimePicker.SetAttrSingle(\"year-icon\", varYea";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("year-icon",_varyearicon);
 //BA.debugLineNum = 808;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 };
 //BA.debugLineNum = 810;BA.debugLine="Dim pp As String = $\"${ID}YearIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"YearIcon");
 //BA.debugLineNum = 811;BA.debugLine="vue.SetStateSingle(pp, varYearIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varyearicon));
 //BA.debugLineNum = 812;BA.debugLine="DateTimePicker.Bind(\":year-icon\", pp)";
_datetimepicker._bind /*b4j.example.vmelement*/ (":year-icon",_pp);
 //BA.debugLineNum = 813;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 814;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _show() throws Exception{
 //BA.debugLineNum = 906;BA.debugLine="Sub Show As VMDateTimePicker";
 //BA.debugLineNum = 907;BA.debugLine="DateTimePicker.SetVisible(True)";
_datetimepicker._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 908;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 909;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
b4j.example.vmelement _dmenu = null;
b4j.example.vmtemplate _tmpl = null;
String _ssave = "";
 //BA.debugLineNum = 211;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 212;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 213;BA.debugLine="Dim eName As String = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 214;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 215;BA.debugLine="Log($\"VMDateTimePicker.${eName} event has not be";
__c.Log(("VMDateTimePicker."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 //BA.debugLineNum = 217;BA.debugLine="eName = $\"${ID}_clickdate\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_clickdate");
 //BA.debugLineNum = 218;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 219;BA.debugLine="Log($\"VMDateTimePicker.${eName} event has not be";
__c.Log(("VMDateTimePicker."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 222;BA.debugLine="If bForInput Then";
if (_bforinput) { 
 //BA.debugLineNum = 224;BA.debugLine="vue.SetStateSingle($\"${ID}menu\"$, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"menu"),(Object)(__c.False));
 //BA.debugLineNum = 225;BA.debugLine="Dim dMenu As VMElement";
_dmenu = new b4j.example.vmelement();
 //BA.debugLineNum = 226;BA.debugLine="dMenu.Initialize(vue, $\"${ID}menu\"$).SetTag(\"v-m";
_dmenu._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"menu"))._settag /*b4j.example.vmelement*/ ("v-menu");
 //BA.debugLineNum = 227;BA.debugLine="dMenu.SetStatic(bStatic)";
_dmenu._setstatic /*b4j.example.vmelement*/ (_bstatic);
 //BA.debugLineNum = 228;BA.debugLine="dMenu.SetDesignMode(DesignMode)";
_dmenu._setdesignmode /*b4j.example.vmelement*/ (_designmode);
 //BA.debugLineNum = 229;BA.debugLine="dMenu.SetAttrSingle(\"ref\", $\"${ID}menu\"$)";
_dmenu._setattrsingle /*b4j.example.vmelement*/ ("ref",(""+__c.SmartStringFormatter("",(Object)(_id))+"menu"));
 //BA.debugLineNum = 230;BA.debugLine="dMenu.SetVModel($\"${ID}menu\"$)";
_dmenu._setvmodel /*b4j.example.vmelement*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"menu"));
 //BA.debugLineNum = 231;BA.debugLine="dMenu.SetAttrSingle(\":close-on-content-click\", F";
_dmenu._setattrsingle /*b4j.example.vmelement*/ (":close-on-content-click",BA.ObjectToString(__c.False));
 //BA.debugLineNum = 233;BA.debugLine="dMenu.SetAttrSingle(\":return-value.sync\", vmodel";
_dmenu._setattrsingle /*b4j.example.vmelement*/ (":return-value.sync",_vmodel);
 //BA.debugLineNum = 234;BA.debugLine="dMenu.SetAttrSingle(\"transition\", \"scale-transit";
_dmenu._setattrsingle /*b4j.example.vmelement*/ ("transition","scale-transition");
 //BA.debugLineNum = 235;BA.debugLine="dMenu.SetAttrloose(\"offset-y\")";
_dmenu._setattrloose /*b4j.example.vmelement*/ ("offset-y");
 //BA.debugLineNum = 236;BA.debugLine="dMenu.SetAttrLoose(\"full-width\")";
_dmenu._setattrloose /*b4j.example.vmelement*/ ("full-width");
 //BA.debugLineNum = 237;BA.debugLine="dMenu.SetAttrLoose(\"lazy\")";
_dmenu._setattrloose /*b4j.example.vmelement*/ ("lazy");
 //BA.debugLineNum = 238;BA.debugLine="dMenu.SetAttrSingle(\"min-width\", \"290px\")";
_dmenu._setattrsingle /*b4j.example.vmelement*/ ("min-width","290px");
 //BA.debugLineNum = 239;BA.debugLine="dMenu.SetAttrSingle(\"max-width\", \"290px\")";
_dmenu._setattrsingle /*b4j.example.vmelement*/ ("max-width","290px");
 //BA.debugLineNum = 241;BA.debugLine="Dim tmpl As VMTemplate";
_tmpl = new b4j.example.vmtemplate();
 //BA.debugLineNum = 242;BA.debugLine="tmpl.Initialize(vue, $\"${ID}tmpl\"$, Module)";
_tmpl._initialize /*b4j.example.vmtemplate*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tmpl"),_module);
 //BA.debugLineNum = 243;BA.debugLine="tmpl.SetStatic(bStatic)";
_tmpl._setstatic /*b4j.example.vmtemplate*/ (_bstatic);
 //BA.debugLineNum = 244;BA.debugLine="tmpl.SetDesignMode(DesignMode)";
_tmpl._setdesignmode /*b4j.example.vmtemplate*/ (_designmode);
 //BA.debugLineNum = 245;BA.debugLine="tmpl.SetSlotActivator1($\"on\"$)";
_tmpl._setslotactivator1 /*b4j.example.vmtemplate*/ (("on"));
 //BA.debugLineNum = 247;BA.debugLine="TextField.SetAttrSingle(\"v-on\", $\"on\"$)";
_textfield._setattrsingle /*b4j.example.vmtextfield*/ ("v-on",("on"));
 //BA.debugLineNum = 250;BA.debugLine="If bHideIcons = False Then";
if (_bhideicons==__c.False) { 
 //BA.debugLineNum = 251;BA.debugLine="If bTimePicker Then";
if (_btimepicker) { 
 //BA.debugLineNum = 252;BA.debugLine="TextField.SetAppendIcon(\"schedule\")";
_textfield._setappendicon /*b4j.example.vmtextfield*/ ("schedule");
 //BA.debugLineNum = 253;BA.debugLine="TextField.SetAttrSingle(\"@click:append\", $\"${I";
_textfield._setattrsingle /*b4j.example.vmtextfield*/ ("@click:append",(""+__c.SmartStringFormatter("",(Object)(_id))+"menu = !"+__c.SmartStringFormatter("",(Object)(_id))+"menu"));
 }else {
 //BA.debugLineNum = 255;BA.debugLine="TextField.SetAppendIcon(\"today\")";
_textfield._setappendicon /*b4j.example.vmtextfield*/ ("today");
 //BA.debugLineNum = 256;BA.debugLine="TextField.SetAttrSingle(\"@click:append\", $\"${I";
_textfield._setattrsingle /*b4j.example.vmtextfield*/ ("@click:append",(""+__c.SmartStringFormatter("",(Object)(_id))+"menu = !"+__c.SmartStringFormatter("",(Object)(_id))+"menu"));
 };
 };
 //BA.debugLineNum = 260;BA.debugLine="TextField.Pop(tmpl.Template)";
_textfield._pop /*String*/ (_tmpl._template /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 261;BA.debugLine="dMenu.SetText(tmpl.ToString)";
_dmenu._settext /*b4j.example.vmelement*/ (_tmpl._tostring /*String*/ ());
 //BA.debugLineNum = 263;BA.debugLine="DateTimePicker.SetVIf($\"${ID}menu\"$)";
_datetimepicker._setvif /*b4j.example.vmelement*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"menu"));
 //BA.debugLineNum = 264;BA.debugLine="Dim ssave As String = \"$refs.\" & ID & \"menu.save";
_ssave = "$refs."+_id+"menu.save("+_vmodel+")";
 //BA.debugLineNum = 265;BA.debugLine="If bTimePicker Then";
if (_btimepicker) { 
 //BA.debugLineNum = 266;BA.debugLine="DateTimePicker.SetAttrSingle(\"@click:minute\", s";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("@click:minute",_ssave);
 }else {
 //BA.debugLineNum = 268;BA.debugLine="DateTimePicker.SetAttrLoose(\"scrollable\")";
_datetimepicker._setattrloose /*b4j.example.vmelement*/ ("scrollable");
 //BA.debugLineNum = 269;BA.debugLine="DateTimePicker.SetAttrSingle(\"@click:date\", ssa";
_datetimepicker._setattrsingle /*b4j.example.vmelement*/ ("@click:date",_ssave);
 };
 //BA.debugLineNum = 272;BA.debugLine="dMenu.SetText(DateTimePicker.ToString)";
_dmenu._settext /*b4j.example.vmelement*/ (_datetimepicker._tostring /*String*/ ());
 //BA.debugLineNum = 273;BA.debugLine="Return dMenu.tostring";
if (true) return _dmenu._tostring /*String*/ ();
 }else {
 //BA.debugLineNum = 275;BA.debugLine="Return DateTimePicker.ToString";
if (true) return _datetimepicker._tostring /*String*/ ();
 };
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatetimepicker  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 139;BA.debugLine="Sub UseTheme(themeName As String) As VMDateTimePic";
 //BA.debugLineNum = 140;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 141;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 142;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 143;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 144;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatetimepicker)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
