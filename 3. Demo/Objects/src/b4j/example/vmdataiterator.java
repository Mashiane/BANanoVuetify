package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmdataiterator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmdataiterator", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmdataiterator.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _dataiterator = null;
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
public b4j.example.vmdataiterator  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 62;BA.debugLine="Sub AddChild(child As VMElement) As VMDataIterator";
 //BA.debugLineNum = 63;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 64;BA.debugLine="DataIterator.SetText(childHTML)";
_dataiterator._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 98;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 99;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 100;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdataiterator  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub AddClass(c As String) As VMDataIterator";
 //BA.debugLineNum = 81;BA.debugLine="DataIterator.AddClass(c)";
_dataiterator._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 913;BA.debugLine="Sub AddComponent(comp As String) As VMDataIterator";
 //BA.debugLineNum = 914;BA.debugLine="DataIterator.SetText(comp)";
_dataiterator._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 915;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 916;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 918;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 919;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 920;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdataiterator  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 785;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 786;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 787;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 788;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 789;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 859;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 860;BA.debugLine="DataIterator.BindStyleSingle(prop, value)";
_dataiterator._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 861;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 862;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 922;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 923;BA.debugLine="DataIterator.BuildModel(mprops, mstyles, lclasses,";
_dataiterator._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 924;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 925;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public DataIterator As VMElement";
_dataiterator = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdataiterator  _disable() throws Exception{
 //BA.debugLineNum = 778;BA.debugLine="Sub Disable As VMDataIterator";
 //BA.debugLineNum = 779;BA.debugLine="DataIterator.Disable(True)";
_dataiterator._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 780;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 781;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _enable() throws Exception{
 //BA.debugLineNum = 772;BA.debugLine="Sub Enable As VMDataIterator";
 //BA.debugLineNum = 773;BA.debugLine="DataIterator.Enable(True)";
_dataiterator._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 774;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 775;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _hide() throws Exception{
 //BA.debugLineNum = 760;BA.debugLine="Sub Hide As VMDataIterator";
 //BA.debugLineNum = 761;BA.debugLine="DataIterator.SetVisible(False)";
_dataiterator._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 762;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 763;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="DataIterator.Initialize(v, ID)";
_dataiterator._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="DataIterator.SetTag(\"v-data-iterator\")";
_dataiterator._settag /*b4j.example.vmelement*/ ("v-data-iterator");
 //BA.debugLineNum = 17;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 76;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdataiterator  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 810;BA.debugLine="public Sub RemoveAttr(sName As String) As VMDataIt";
 //BA.debugLineNum = 811;BA.debugLine="DataIterator.RemoveAttr(sName)";
_dataiterator._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 812;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 813;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Render";
 //BA.debugLineNum = 58;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdataiterator  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetAttr(attr As Map) As VMDataIterator";
 //BA.debugLineNum = 87;BA.debugLine="DataIterator.SetAttr(attr)";
_dataiterator._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 879;BA.debugLine="Sub SetAttributes(attrs As List) As VMDataIterator";
 //BA.debugLineNum = 880;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 881;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 883;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 884;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 792;BA.debugLine="Sub SetAttrLoose(loose As String) As VMDataIterato";
 //BA.debugLineNum = 793;BA.debugLine="DataIterator.SetAttrLoose(loose)";
_dataiterator._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 794;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 795;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 853;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 854;BA.debugLine="DataIterator.SetAttrSingle(prop, value)";
_dataiterator._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 855;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 856;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setcustomfilter(Object _varcustomfilter) throws Exception{
String _pp = "";
 //BA.debugLineNum = 113;BA.debugLine="Sub SetCustomFilter(varCustomFilter As Object) As";
 //BA.debugLineNum = 114;BA.debugLine="Dim pp As String = $\"${ID}CustomFilter\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CustomFilter");
 //BA.debugLineNum = 115;BA.debugLine="vue.SetStateSingle(pp, varCustomFilter)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varcustomfilter);
 //BA.debugLineNum = 116;BA.debugLine="DataIterator.Bind(\":custom-filter\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":custom-filter",_pp);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setcustomgroup(Object _varcustomgroup) throws Exception{
String _pp = "";
 //BA.debugLineNum = 121;BA.debugLine="Sub SetCustomGroup(varCustomGroup As Object) As VM";
 //BA.debugLineNum = 122;BA.debugLine="Dim pp As String = $\"${ID}CustomGroup\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CustomGroup");
 //BA.debugLineNum = 123;BA.debugLine="vue.SetStateSingle(pp, varCustomGroup)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varcustomgroup);
 //BA.debugLineNum = 124;BA.debugLine="DataIterator.Bind(\":custom-group\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":custom-group",_pp);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setcustomsort(Object _varcustomfilter) throws Exception{
String _pp = "";
 //BA.debugLineNum = 105;BA.debugLine="Sub SetCustomSort(varCustomFilter As Object) As VM";
 //BA.debugLineNum = 106;BA.debugLine="Dim pp As String = $\"${ID}CustomSort\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CustomSort");
 //BA.debugLineNum = 107;BA.debugLine="vue.SetStateSingle(pp, varCustomFilter)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varcustomfilter);
 //BA.debugLineNum = 108;BA.debugLine="DataIterator.Bind(\":custom-sort\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":custom-sort",_pp);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 129;BA.debugLine="Sub SetDark(varDark As Boolean) As VMDataIterator";
 //BA.debugLineNum = 130;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 131;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 132;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 135;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 136;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 137;BA.debugLine="DataIterator.Bind(\":dark\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 25;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 828;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMDataIterator";
 //BA.debugLineNum = 829;BA.debugLine="DataIterator.SetDesignMode(b)";
_dataiterator._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 830;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 831;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 832;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 893;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 894;BA.debugLine="DataIterator.SetDeviceOffsets(OS, OM, OL, OX)";
_dataiterator._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 895;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 896;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 900;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 901;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 902;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 903;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 904;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 907;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 908;BA.debugLine="DataIterator.SetDeviceSizes(SS, SM, SL, SX)";
_dataiterator._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 909;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 910;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setdisablefiltering(boolean _vardisablefiltering) throws Exception{
String _pp = "";
 //BA.debugLineNum = 142;BA.debugLine="Sub SetDisableFiltering(varDisableFiltering As Boo";
 //BA.debugLineNum = 143;BA.debugLine="If varDisableFiltering = False Then Return Me";
if (_vardisablefiltering==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 144;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 145;BA.debugLine="SetAttrSingle(\"disable-filtering\", varDisableFil";
_setattrsingle("disable-filtering",BA.ObjectToString(_vardisablefiltering));
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 148;BA.debugLine="Dim pp As String = $\"${ID}DisableFiltering\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DisableFiltering");
 //BA.debugLineNum = 149;BA.debugLine="vue.SetStateSingle(pp, varDisableFiltering)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisablefiltering));
 //BA.debugLineNum = 150;BA.debugLine="DataIterator.Bind(\":disable-filtering\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":disable-filtering",_pp);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setdisablepagination(boolean _vardisablepagination) throws Exception{
String _pp = "";
 //BA.debugLineNum = 155;BA.debugLine="Sub SetDisablePagination(varDisablePagination As B";
 //BA.debugLineNum = 156;BA.debugLine="If varDisablePagination = False Then Return Me";
if (_vardisablepagination==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 157;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 158;BA.debugLine="SetAttrSingle(\"disable-pagination\", varDisablePa";
_setattrsingle("disable-pagination",BA.ObjectToString(_vardisablepagination));
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 161;BA.debugLine="Dim pp As String = $\"${ID}DisablePagination\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DisablePagination");
 //BA.debugLineNum = 162;BA.debugLine="vue.SetStateSingle(pp, varDisablePagination)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisablepagination));
 //BA.debugLineNum = 163;BA.debugLine="DataIterator.Bind(\":disable-pagination\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":disable-pagination",_pp);
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setdisablesort(boolean _vardisablesort) throws Exception{
String _pp = "";
 //BA.debugLineNum = 168;BA.debugLine="Sub SetDisableSort(varDisableSort As Boolean) As V";
 //BA.debugLineNum = 169;BA.debugLine="If varDisableSort = False Then Return Me";
if (_vardisablesort==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 170;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 171;BA.debugLine="SetAttrSingle(\"disable-sort\", varDisableSort)";
_setattrsingle("disable-sort",BA.ObjectToString(_vardisablesort));
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 174;BA.debugLine="Dim pp As String = $\"${ID}DisableSort\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DisableSort");
 //BA.debugLineNum = 175;BA.debugLine="vue.SetStateSingle(pp, varDisableSort)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisablesort));
 //BA.debugLineNum = 176;BA.debugLine="DataIterator.Bind(\":disable-sort\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":disable-sort",_pp);
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setexpanded(String _varexpanded) throws Exception{
String _pp = "";
 //BA.debugLineNum = 272;BA.debugLine="Sub SetExpanded(varExpanded As String) As VMDataIt";
 //BA.debugLineNum = 273;BA.debugLine="If varExpanded = \"\" Then Return Me";
if ((_varexpanded).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 274;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 275;BA.debugLine="SetAttrSingle(\"expanded\", varExpanded)";
_setattrsingle("expanded",_varexpanded);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 278;BA.debugLine="Dim pp As String = $\"${ID}Expanded\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Expanded");
 //BA.debugLineNum = 279;BA.debugLine="vue.SetStateSingle(pp, varExpanded)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexpanded));
 //BA.debugLineNum = 280;BA.debugLine="DataIterator.Bind(\":expanded\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":expanded",_pp);
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setfooterprops(String _varfooterprops) throws Exception{
String _pp = "";
 //BA.debugLineNum = 285;BA.debugLine="Sub SetFooterProps(varFooterProps As String) As VM";
 //BA.debugLineNum = 286;BA.debugLine="If varFooterProps = \"\" Then Return Me";
if ((_varfooterprops).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 287;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 288;BA.debugLine="SetAttrSingle(\"footer-props\", varFooterProps)";
_setattrsingle("footer-props",_varfooterprops);
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 291;BA.debugLine="Dim pp As String = $\"${ID}FooterProps\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"FooterProps");
 //BA.debugLineNum = 292;BA.debugLine="vue.SetStateSingle(pp, varFooterProps)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfooterprops));
 //BA.debugLineNum = 293;BA.debugLine="DataIterator.Bind(\":footer-props\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":footer-props",_pp);
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setgroupby(String _vargroupby) throws Exception{
String _pp = "";
 //BA.debugLineNum = 298;BA.debugLine="Sub SetGroupBy(varGroupBy As String) As VMDataIter";
 //BA.debugLineNum = 299;BA.debugLine="If varGroupBy = \"\" Then Return Me";
if ((_vargroupby).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 300;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 301;BA.debugLine="SetAttrSingle(\"group-by\", varGroupBy)";
_setattrsingle("group-by",_vargroupby);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 304;BA.debugLine="Dim pp As String = $\"${ID}GroupBy\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"GroupBy");
 //BA.debugLineNum = 305;BA.debugLine="vue.SetStateSingle(pp, varGroupBy)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vargroupby));
 //BA.debugLineNum = 306;BA.debugLine="DataIterator.Bind(\":group-by\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":group-by",_pp);
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setgroupdesc(String _vargroupdesc) throws Exception{
String _pp = "";
 //BA.debugLineNum = 311;BA.debugLine="Sub SetGroupDesc(varGroupDesc As String) As VMData";
 //BA.debugLineNum = 312;BA.debugLine="If varGroupDesc = \"\" Then Return Me";
if ((_vargroupdesc).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 313;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 314;BA.debugLine="SetAttrSingle(\"group-desc\", varGroupDesc)";
_setattrsingle("group-desc",_vargroupdesc);
 //BA.debugLineNum = 315;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 317;BA.debugLine="Dim pp As String = $\"${ID}GroupDesc\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"GroupDesc");
 //BA.debugLineNum = 318;BA.debugLine="vue.SetStateSingle(pp, varGroupDesc)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vargroupdesc));
 //BA.debugLineNum = 319;BA.debugLine="DataIterator.Bind(\":group-desc\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":group-desc",_pp);
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _sethidedefaultfooter(boolean _varhidedefaultfooter) throws Exception{
String _pp = "";
 //BA.debugLineNum = 181;BA.debugLine="Sub SetHideDefaultFooter(varHideDefaultFooter As B";
 //BA.debugLineNum = 182;BA.debugLine="If varHideDefaultFooter = False Then Return Me";
if (_varhidedefaultfooter==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 183;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 184;BA.debugLine="SetAttrSingle(\"hide-default-footer\", varHideDefa";
_setattrsingle("hide-default-footer",BA.ObjectToString(_varhidedefaultfooter));
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 187;BA.debugLine="Dim pp As String = $\"${ID}HideDefaultFooter\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideDefaultFooter");
 //BA.debugLineNum = 188;BA.debugLine="vue.SetStateSingle(pp, varHideDefaultFooter)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhidedefaultfooter));
 //BA.debugLineNum = 189;BA.debugLine="DataIterator.Bind(\":hide-default-footer\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":hide-default-footer",_pp);
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setitemkey(String _varitemkey) throws Exception{
String _pp = "";
 //BA.debugLineNum = 324;BA.debugLine="Sub SetItemKey(varItemKey As String) As VMDataIter";
 //BA.debugLineNum = 325;BA.debugLine="If varItemKey = \"\" Then Return Me";
if ((_varitemkey).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 326;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 327;BA.debugLine="SetAttrSingle(\"item-key\", varItemKey)";
_setattrsingle("item-key",_varitemkey);
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 330;BA.debugLine="Dim pp As String = $\"${ID}ItemKey\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ItemKey");
 //BA.debugLineNum = 331;BA.debugLine="vue.SetStateSingle(pp, varItemKey)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varitemkey));
 //BA.debugLineNum = 332;BA.debugLine="DataIterator.Bind(\":item-key\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":item-key",_pp);
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setitems(String _varitems) throws Exception{
String _pp = "";
 //BA.debugLineNum = 337;BA.debugLine="Sub SetItems(varItems As String) As VMDataIterator";
 //BA.debugLineNum = 338;BA.debugLine="If varItems = \"\" Then Return Me";
if ((_varitems).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 339;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 340;BA.debugLine="SetAttrSingle(\"items\", varItems)";
_setattrsingle("items",_varitems);
 //BA.debugLineNum = 341;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 343;BA.debugLine="Dim pp As String = $\"${ID}Items\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Items");
 //BA.debugLineNum = 344;BA.debugLine="vue.SetStateSingle(pp, varItems)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varitems));
 //BA.debugLineNum = 345;BA.debugLine="DataIterator.Bind(\":items\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":items",_pp);
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setitemsperpage(String _varitemsperpage) throws Exception{
String _pp = "";
 //BA.debugLineNum = 350;BA.debugLine="Sub SetItemsPerPage(varItemsPerPage As String) As";
 //BA.debugLineNum = 351;BA.debugLine="If varItemsPerPage = \"\" Then Return Me";
if ((_varitemsperpage).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 352;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 353;BA.debugLine="SetAttrSingle(\"items-per-page\", varItemsPerPage)";
_setattrsingle("items-per-page",_varitemsperpage);
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 356;BA.debugLine="Dim pp As String = $\"${ID}ItemsPerPage\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ItemsPerPage");
 //BA.debugLineNum = 357;BA.debugLine="vue.SetStateSingle(pp, varItemsPerPage)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varitemsperpage));
 //BA.debugLineNum = 358;BA.debugLine="DataIterator.Bind(\":items-per-page\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":items-per-page",_pp);
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 194;BA.debugLine="Sub SetLight(varLight As Boolean) As VMDataIterato";
 //BA.debugLineNum = 195;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 196;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 197;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 200;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 201;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 202;BA.debugLine="DataIterator.Bind(\":light\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setloading(boolean _varloading) throws Exception{
String _pp = "";
 //BA.debugLineNum = 207;BA.debugLine="Sub SetLoading(varLoading As Boolean) As VMDataIte";
 //BA.debugLineNum = 208;BA.debugLine="If varLoading = False Then Return Me";
if (_varloading==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 209;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 210;BA.debugLine="SetAttrSingle(\"loading\", varLoading)";
_setattrsingle("loading",BA.ObjectToString(_varloading));
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 213;BA.debugLine="Dim pp As String = $\"${ID}Loading\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Loading");
 //BA.debugLineNum = 214;BA.debugLine="vue.SetStateSingle(pp, varLoading)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloading));
 //BA.debugLineNum = 215;BA.debugLine="DataIterator.Bind(\":loading\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":loading",_pp);
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setloadingtext(String _varloadingtext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 363;BA.debugLine="Sub SetLoadingText(varLoadingText As String) As VM";
 //BA.debugLineNum = 364;BA.debugLine="If varLoadingText = \"\" Then Return Me";
if ((_varloadingtext).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 365;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 366;BA.debugLine="SetAttrSingle(\"loading-text\", varLoadingText)";
_setattrsingle("loading-text",_varloadingtext);
 //BA.debugLineNum = 367;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 369;BA.debugLine="Dim pp As String = $\"${ID}LoadingText\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"LoadingText");
 //BA.debugLineNum = 370;BA.debugLine="vue.SetStateSingle(pp, varLoadingText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloadingtext));
 //BA.debugLineNum = 371;BA.debugLine="DataIterator.Bind(\":loading-text\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":loading-text",_pp);
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setlocale(String _varlocale) throws Exception{
String _pp = "";
 //BA.debugLineNum = 376;BA.debugLine="Sub SetLocale(varLocale As String) As VMDataIterat";
 //BA.debugLineNum = 377;BA.debugLine="If varLocale = \"\" Then Return Me";
if ((_varlocale).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 378;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 379;BA.debugLine="SetAttrSingle(\"locale\", varLocale)";
_setattrsingle("locale",_varlocale);
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 382;BA.debugLine="Dim pp As String = $\"${ID}Locale\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Locale");
 //BA.debugLineNum = 383;BA.debugLine="vue.SetStateSingle(pp, varLocale)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlocale));
 //BA.debugLineNum = 384;BA.debugLine="DataIterator.Bind(\":locale\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":locale",_pp);
 //BA.debugLineNum = 385;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 822;BA.debugLine="Sub SetMarginAll(p As String) As VMDataIterator";
 //BA.debugLineNum = 823;BA.debugLine="DataIterator.setmarginall(p)";
_dataiterator._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 824;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 825;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setmobilebreakpoint(String _varmobilebreakpoint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 389;BA.debugLine="Sub SetMobileBreakpoint(varMobileBreakpoint As Str";
 //BA.debugLineNum = 390;BA.debugLine="If varMobileBreakpoint = \"\" Then Return Me";
if ((_varmobilebreakpoint).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 391;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 392;BA.debugLine="SetAttrSingle(\"mobile-breakpoint\", varMobileBrea";
_setattrsingle("mobile-breakpoint",_varmobilebreakpoint);
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 395;BA.debugLine="Dim pp As String = $\"${ID}MobileBreakpoint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MobileBreakpoint");
 //BA.debugLineNum = 396;BA.debugLine="vue.SetStateSingle(pp, varMobileBreakpoint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmobilebreakpoint));
 //BA.debugLineNum = 397;BA.debugLine="DataIterator.Bind(\":mobile-breakpoint\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":mobile-breakpoint",_pp);
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setmultisort(boolean _varmultisort) throws Exception{
String _pp = "";
 //BA.debugLineNum = 220;BA.debugLine="Sub SetMultiSort(varMultiSort As Boolean) As VMDat";
 //BA.debugLineNum = 221;BA.debugLine="If varMultiSort = False Then Return Me";
if (_varmultisort==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 222;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 223;BA.debugLine="SetAttrSingle(\"multi-sort\", varMultiSort)";
_setattrsingle("multi-sort",BA.ObjectToString(_varmultisort));
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 226;BA.debugLine="Dim pp As String = $\"${ID}MultiSort\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MultiSort");
 //BA.debugLineNum = 227;BA.debugLine="vue.SetStateSingle(pp, varMultiSort)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmultisort));
 //BA.debugLineNum = 228;BA.debugLine="DataIterator.Bind(\":multi-sort\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":multi-sort",_pp);
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setmustsort(boolean _varmustsort) throws Exception{
String _pp = "";
 //BA.debugLineNum = 233;BA.debugLine="Sub SetMustSort(varMustSort As Boolean) As VMDataI";
 //BA.debugLineNum = 234;BA.debugLine="If varMustSort = False Then Return Me";
if (_varmustsort==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 235;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 236;BA.debugLine="SetAttrSingle(\"must-sort\", varMustSort)";
_setattrsingle("must-sort",BA.ObjectToString(_varmustsort));
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 239;BA.debugLine="Dim pp As String = $\"${ID}MustSort\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MustSort");
 //BA.debugLineNum = 240;BA.debugLine="vue.SetStateSingle(pp, varMustSort)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmustsort));
 //BA.debugLineNum = 241;BA.debugLine="DataIterator.Bind(\":must-sort\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":must-sort",_pp);
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 841;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 842;BA.debugLine="DataIterator.SetName(varName, bbind)";
_dataiterator._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 843;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 844;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setnodatatext(String _varnodatatext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 402;BA.debugLine="Sub SetNoDataText(varNoDataText As String) As VMDa";
 //BA.debugLineNum = 403;BA.debugLine="If varNoDataText = \"\" Then Return Me";
if ((_varnodatatext).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 404;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 405;BA.debugLine="SetAttrSingle(\"no-data-text\", varNoDataText)";
_setattrsingle("no-data-text",_varnodatatext);
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 408;BA.debugLine="Dim pp As String = $\"${ID}NoDataText\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NoDataText");
 //BA.debugLineNum = 409;BA.debugLine="vue.SetStateSingle(pp, varNoDataText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnodatatext));
 //BA.debugLineNum = 410;BA.debugLine="DataIterator.Bind(\":no-data-text\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":no-data-text",_pp);
 //BA.debugLineNum = 411;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setnoresultstext(String _varnoresultstext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 415;BA.debugLine="Sub SetNoResultsText(varNoResultsText As String) A";
 //BA.debugLineNum = 416;BA.debugLine="If varNoResultsText = \"\" Then Return Me";
if ((_varnoresultstext).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 417;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 418;BA.debugLine="SetAttrSingle(\"no-results-text\", varNoResultsTex";
_setattrsingle("no-results-text",_varnoresultstext);
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 421;BA.debugLine="Dim pp As String = $\"${ID}NoResultsText\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NoResultsText");
 //BA.debugLineNum = 422;BA.debugLine="vue.SetStateSingle(pp, varNoResultsText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnoresultstext));
 //BA.debugLineNum = 423;BA.debugLine="DataIterator.Bind(\":no-results-text\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":no-results-text",_pp);
 //BA.debugLineNum = 424;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setoncurrentitems(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 567;BA.debugLine="Sub SetOnCurrentItems(methodName As String) As VMD";
 //BA.debugLineNum = 568;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 569;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 570;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 571;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 572;BA.debugLine="SetAttr(CreateMap(\"@current-items\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@current-items"),(Object)(_methodname)}));
 //BA.debugLineNum = 574;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 575;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 576;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setoninput(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 579;BA.debugLine="Sub SetOnInput(methodName As String) As VMDataIter";
 //BA.debugLineNum = 580;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 581;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 582;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 583;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 584;BA.debugLine="SetAttr(CreateMap(\"@input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_methodname)}));
 //BA.debugLineNum = 586;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 587;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 588;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setonitemexpanded(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 591;BA.debugLine="Sub SetOnItemExpanded(methodName As String) As VMD";
 //BA.debugLineNum = 592;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 593;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 594;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 595;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 596;BA.debugLine="SetAttr(CreateMap(\"@item-expanded\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@item-expanded"),(Object)(_methodname)}));
 //BA.debugLineNum = 598;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 599;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 600;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setonitemselected(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 603;BA.debugLine="Sub SetOnItemSelected(methodName As String) As VMD";
 //BA.debugLineNum = 604;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 605;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 606;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 607;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 608;BA.debugLine="SetAttr(CreateMap(\"@item-selected\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@item-selected"),(Object)(_methodname)}));
 //BA.debugLineNum = 610;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 611;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 612;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setonpagecount(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 615;BA.debugLine="Sub SetOnPageCount(methodName As String) As VMData";
 //BA.debugLineNum = 616;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 617;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 618;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 619;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 620;BA.debugLine="SetAttr(CreateMap(\"@page-count\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@page-count"),(Object)(_methodname)}));
 //BA.debugLineNum = 622;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 623;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 624;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setonpagination(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 627;BA.debugLine="Sub SetOnPagination(methodName As String) As VMDat";
 //BA.debugLineNum = 628;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 629;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 630;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 631;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 632;BA.debugLine="SetAttr(CreateMap(\"@pagination\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@pagination"),(Object)(_methodname)}));
 //BA.debugLineNum = 634;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 635;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 636;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setontoggleselectall(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 639;BA.debugLine="Sub SetOnToggleSelectAll(methodName As String) As";
 //BA.debugLineNum = 640;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 641;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 642;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 643;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 644;BA.debugLine="SetAttr(CreateMap(\"@toggle-select-all\": methodNam";
_setattr(__c.createMap(new Object[] {(Object)("@toggle-select-all"),(Object)(_methodname)}));
 //BA.debugLineNum = 646;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 647;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 648;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setonupdateexpanded(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 651;BA.debugLine="Sub SetOnUpdateExpanded(methodName As String) As V";
 //BA.debugLineNum = 652;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 653;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 654;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 655;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 656;BA.debugLine="SetAttr(CreateMap(\"@update:expanded\": methodName)";
_setattr(__c.createMap(new Object[] {(Object)("@update:expanded"),(Object)(_methodname)}));
 //BA.debugLineNum = 658;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 659;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 660;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setonupdategroupby(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 663;BA.debugLine="Sub SetOnUpdateGroupBy(methodName As String) As VM";
 //BA.debugLineNum = 664;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 665;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 666;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 667;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 668;BA.debugLine="SetAttr(CreateMap(\"@update:group-by\": methodName)";
_setattr(__c.createMap(new Object[] {(Object)("@update:group-by"),(Object)(_methodname)}));
 //BA.debugLineNum = 670;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 671;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 672;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setonupdategroupdesc(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 675;BA.debugLine="Sub SetOnUpdateGroupDesc(methodName As String) As";
 //BA.debugLineNum = 676;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 677;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 678;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 679;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 680;BA.debugLine="SetAttr(CreateMap(\"@update:group-desc\": methodNam";
_setattr(__c.createMap(new Object[] {(Object)("@update:group-desc"),(Object)(_methodname)}));
 //BA.debugLineNum = 682;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 683;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 684;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setonupdateitemsperpage(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 687;BA.debugLine="Sub SetOnUpdateItemsPerPage(methodName As String)";
 //BA.debugLineNum = 688;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 689;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 690;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 691;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 692;BA.debugLine="SetAttr(CreateMap(\"@update:items-per-page\": metho";
_setattr(__c.createMap(new Object[] {(Object)("@update:items-per-page"),(Object)(_methodname)}));
 //BA.debugLineNum = 694;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 695;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 696;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setonupdatemultisort(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 699;BA.debugLine="Sub SetOnUpdateMultiSort(methodName As String) As";
 //BA.debugLineNum = 700;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 701;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 702;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 703;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 704;BA.debugLine="SetAttr(CreateMap(\"@update:multi-sort\": methodNam";
_setattr(__c.createMap(new Object[] {(Object)("@update:multi-sort"),(Object)(_methodname)}));
 //BA.debugLineNum = 706;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 707;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 708;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setonupdateoptions(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 711;BA.debugLine="Sub SetOnUpdateOptions(methodName As String) As VM";
 //BA.debugLineNum = 712;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 713;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 714;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 715;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 716;BA.debugLine="SetAttr(CreateMap(\"@update:options\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:options"),(Object)(_methodname)}));
 //BA.debugLineNum = 718;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 719;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 720;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setonupdatepage(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 723;BA.debugLine="Sub SetOnUpdatePage(methodName As String) As VMDat";
 //BA.debugLineNum = 724;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 725;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 726;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 727;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 728;BA.debugLine="SetAttr(CreateMap(\"@update:page\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:page"),(Object)(_methodname)}));
 //BA.debugLineNum = 730;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 731;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 732;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setonupdatesortby(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 735;BA.debugLine="Sub SetOnUpdateSortBy(methodName As String) As VMD";
 //BA.debugLineNum = 736;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 737;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 738;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 739;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 740;BA.debugLine="SetAttr(CreateMap(\"@update:sort-by\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:sort-by"),(Object)(_methodname)}));
 //BA.debugLineNum = 742;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 743;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 744;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setonupdatesortdesc(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 747;BA.debugLine="Sub SetOnUpdateSortDesc(methodName As String) As V";
 //BA.debugLineNum = 748;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 749;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 750;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 751;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 752;BA.debugLine="SetAttr(CreateMap(\"@update:sort-desc\": methodName";
_setattr(__c.createMap(new Object[] {(Object)("@update:sort-desc"),(Object)(_methodname)}));
 //BA.debugLineNum = 754;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 755;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 756;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setoptions(String _varoptions) throws Exception{
String _pp = "";
 //BA.debugLineNum = 428;BA.debugLine="Sub SetOptions(varOptions As String) As VMDataIter";
 //BA.debugLineNum = 429;BA.debugLine="If varOptions = \"\" Then Return Me";
if ((_varoptions).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 430;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 431;BA.debugLine="SetAttrSingle(\"options\", varOptions)";
_setattrsingle("options",_varoptions);
 //BA.debugLineNum = 432;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 434;BA.debugLine="Dim pp As String = $\"${ID}Options\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Options");
 //BA.debugLineNum = 435;BA.debugLine="vue.SetStateSingle(pp, varOptions)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoptions));
 //BA.debugLineNum = 436;BA.debugLine="DataIterator.Bind(\":options\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":options",_pp);
 //BA.debugLineNum = 437;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 438;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 816;BA.debugLine="Sub SetPaddingAll(p As String) As VMDataIterator";
 //BA.debugLineNum = 817;BA.debugLine="DataIterator.SetPaddingAll(p)";
_dataiterator._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 818;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 819;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setpage(String _varpage) throws Exception{
String _pp = "";
 //BA.debugLineNum = 441;BA.debugLine="Sub SetPage(varPage As String) As VMDataIterator";
 //BA.debugLineNum = 442;BA.debugLine="If varPage = \"\" Then Return Me";
if ((_varpage).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 443;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 444;BA.debugLine="SetAttrSingle(\"page\", varPage)";
_setattrsingle("page",_varpage);
 //BA.debugLineNum = 445;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 447;BA.debugLine="Dim pp As String = $\"${ID}Page\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Page");
 //BA.debugLineNum = 448;BA.debugLine="vue.SetStateSingle(pp, varPage)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpage));
 //BA.debugLineNum = 449;BA.debugLine="DataIterator.Bind(\":page\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":page",_pp);
 //BA.debugLineNum = 450;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 887;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMDat";
 //BA.debugLineNum = 888;BA.debugLine="DataIterator.SetRC(sRow, sCol)";
_dataiterator._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 889;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 890;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setsearch(String _varsearch) throws Exception{
String _pp = "";
 //BA.debugLineNum = 454;BA.debugLine="Sub SetSearch(varSearch As String) As VMDataIterat";
 //BA.debugLineNum = 455;BA.debugLine="If varSearch = \"\" Then Return Me";
if ((_varsearch).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 456;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 457;BA.debugLine="SetAttrSingle(\"search\", varSearch)";
_setattrsingle("search",_varsearch);
 //BA.debugLineNum = 458;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 460;BA.debugLine="Dim pp As String = $\"${ID}Search\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Search");
 //BA.debugLineNum = 461;BA.debugLine="vue.SetStateSingle(pp, varSearch)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsearch));
 //BA.debugLineNum = 462;BA.debugLine="DataIterator.Bind(\":search\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":search",_pp);
 //BA.debugLineNum = 463;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setselectablekey(String _varselectablekey) throws Exception{
String _pp = "";
 //BA.debugLineNum = 467;BA.debugLine="Sub SetSelectableKey(varSelectableKey As String) A";
 //BA.debugLineNum = 468;BA.debugLine="If varSelectableKey = \"\" Then Return Me";
if ((_varselectablekey).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 469;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 470;BA.debugLine="SetAttrSingle(\"selectable-key\", varSelectableKey";
_setattrsingle("selectable-key",_varselectablekey);
 //BA.debugLineNum = 471;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 473;BA.debugLine="Dim pp As String = $\"${ID}SelectableKey\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SelectableKey");
 //BA.debugLineNum = 474;BA.debugLine="vue.SetStateSingle(pp, varSelectableKey)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varselectablekey));
 //BA.debugLineNum = 475;BA.debugLine="DataIterator.Bind(\":selectable-key\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":selectable-key",_pp);
 //BA.debugLineNum = 476;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 477;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setserveritemslength(String _varserveritemslength) throws Exception{
String _pp = "";
 //BA.debugLineNum = 480;BA.debugLine="Sub SetServerItemsLength(varServerItemsLength As S";
 //BA.debugLineNum = 481;BA.debugLine="If varServerItemsLength = \"\" Then Return Me";
if ((_varserveritemslength).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 482;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 483;BA.debugLine="SetAttrSingle(\"server-items-length\", varServerIt";
_setattrsingle("server-items-length",_varserveritemslength);
 //BA.debugLineNum = 484;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 486;BA.debugLine="Dim pp As String = $\"${ID}ServerItemsLength\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ServerItemsLength");
 //BA.debugLineNum = 487;BA.debugLine="vue.SetStateSingle(pp, varServerItemsLength)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varserveritemslength));
 //BA.debugLineNum = 488;BA.debugLine="DataIterator.Bind(\":server-items-length\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":server-items-length",_pp);
 //BA.debugLineNum = 489;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 490;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setsingleexpand(boolean _varsingleexpand) throws Exception{
String _pp = "";
 //BA.debugLineNum = 246;BA.debugLine="Sub SetSingleExpand(varSingleExpand As Boolean) As";
 //BA.debugLineNum = 247;BA.debugLine="If varSingleExpand = False Then Return Me";
if (_varsingleexpand==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 248;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 249;BA.debugLine="SetAttrSingle(\"single-expand\", varSingleExpand)";
_setattrsingle("single-expand",BA.ObjectToString(_varsingleexpand));
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 252;BA.debugLine="Dim pp As String = $\"${ID}SingleExpand\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SingleExpand");
 //BA.debugLineNum = 253;BA.debugLine="vue.SetStateSingle(pp, varSingleExpand)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsingleexpand));
 //BA.debugLineNum = 254;BA.debugLine="DataIterator.Bind(\":single-expand\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":single-expand",_pp);
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setsingleselect(boolean _varsingleselect) throws Exception{
String _pp = "";
 //BA.debugLineNum = 259;BA.debugLine="Sub SetSingleSelect(varSingleSelect As Boolean) As";
 //BA.debugLineNum = 260;BA.debugLine="If varSingleSelect = False Then Return Me";
if (_varsingleselect==__c.False) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 261;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 262;BA.debugLine="SetAttrSingle(\"single-select\", varSingleSelect)";
_setattrsingle("single-select",BA.ObjectToString(_varsingleselect));
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 265;BA.debugLine="Dim pp As String = $\"${ID}SingleSelect\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SingleSelect");
 //BA.debugLineNum = 266;BA.debugLine="vue.SetStateSingle(pp, varSingleSelect)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsingleselect));
 //BA.debugLineNum = 267;BA.debugLine="DataIterator.Bind(\":single-select\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":single-select",_pp);
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setslotfooter(boolean _b) throws Exception{
 //BA.debugLineNum = 525;BA.debugLine="Sub SetSlotFooter(b As Boolean) As VMDataIterator";
 //BA.debugLineNum = 526;BA.debugLine="SetAttr(CreateMap(\"slot\": \"footer\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("footer")}));
 //BA.debugLineNum = 527;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 528;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setslotfooterpagetext(boolean _b) throws Exception{
 //BA.debugLineNum = 531;BA.debugLine="Sub SetSlotFooterPageText(b As Boolean) As VMDataI";
 //BA.debugLineNum = 532;BA.debugLine="SetAttr(CreateMap(\"slot\": \"footer.page-text\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("footer.page-text")}));
 //BA.debugLineNum = 533;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 534;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setslotheader(boolean _b) throws Exception{
 //BA.debugLineNum = 537;BA.debugLine="Sub SetSlotHeader(b As Boolean) As VMDataIterator";
 //BA.debugLineNum = 538;BA.debugLine="SetAttr(CreateMap(\"slot\": \"header\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("header")}));
 //BA.debugLineNum = 539;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setslotitem(boolean _b) throws Exception{
 //BA.debugLineNum = 543;BA.debugLine="Sub SetSlotItem(b As Boolean) As VMDataIterator";
 //BA.debugLineNum = 544;BA.debugLine="SetAttr(CreateMap(\"slot\": \"item\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("item")}));
 //BA.debugLineNum = 545;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 546;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setslotloading(boolean _b) throws Exception{
 //BA.debugLineNum = 549;BA.debugLine="Sub SetSlotLoading(b As Boolean) As VMDataIterator";
 //BA.debugLineNum = 550;BA.debugLine="SetAttr(CreateMap(\"slot\": \"loading\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("loading")}));
 //BA.debugLineNum = 551;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 552;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setslotnodata(boolean _b) throws Exception{
 //BA.debugLineNum = 555;BA.debugLine="Sub SetSlotNoData(b As Boolean) As VMDataIterator";
 //BA.debugLineNum = 556;BA.debugLine="SetAttr(CreateMap(\"slot\": \"no-data\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("no-data")}));
 //BA.debugLineNum = 557;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 558;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setslotnoresults(boolean _b) throws Exception{
 //BA.debugLineNum = 561;BA.debugLine="Sub SetSlotNoResults(b As Boolean) As VMDataIterat";
 //BA.debugLineNum = 562;BA.debugLine="SetAttr(CreateMap(\"slot\": \"no-results\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("no-results")}));
 //BA.debugLineNum = 563;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 564;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setsortby(String _varsortby) throws Exception{
String _pp = "";
 //BA.debugLineNum = 493;BA.debugLine="Sub SetSortBy(varSortBy As String) As VMDataIterat";
 //BA.debugLineNum = 494;BA.debugLine="If varSortBy = \"\" Then Return Me";
if ((_varsortby).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 495;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 496;BA.debugLine="SetAttrSingle(\"sort-by\", varSortBy)";
_setattrsingle("sort-by",_varsortby);
 //BA.debugLineNum = 497;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 499;BA.debugLine="Dim pp As String = $\"${ID}SortBy\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SortBy");
 //BA.debugLineNum = 500;BA.debugLine="vue.SetStateSingle(pp, varSortBy)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsortby));
 //BA.debugLineNum = 501;BA.debugLine="DataIterator.Bind(\":sort-by\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":sort-by",_pp);
 //BA.debugLineNum = 502;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 503;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setsortdesc(String _varsortdesc) throws Exception{
String _pp = "";
 //BA.debugLineNum = 506;BA.debugLine="Sub SetSortDesc(varSortDesc As String) As VMDataIt";
 //BA.debugLineNum = 507;BA.debugLine="If varSortDesc = \"\" Then Return Me";
if ((_varsortdesc).equals("")) { 
if (true) return (b4j.example.vmdataiterator)(this);};
 //BA.debugLineNum = 508;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 509;BA.debugLine="SetAttrSingle(\"sort-desc\", varSortDesc)";
_setattrsingle("sort-desc",_varsortdesc);
 //BA.debugLineNum = 510;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 };
 //BA.debugLineNum = 512;BA.debugLine="Dim pp As String = $\"${ID}SortDesc\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SortDesc");
 //BA.debugLineNum = 513;BA.debugLine="vue.SetStateSingle(pp, varSortDesc)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsortdesc));
 //BA.debugLineNum = 514;BA.debugLine="DataIterator.Bind(\":sort-desc\", pp)";
_dataiterator._bind /*b4j.example.vmelement*/ (":sort-desc",_pp);
 //BA.debugLineNum = 515;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 516;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetStatic(b As Boolean) As VMDataIterator";
 //BA.debugLineNum = 31;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 32;BA.debugLine="DataIterator.SetStatic(b)";
_dataiterator._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetStyle(sm As Map) As VMDataIterator";
 //BA.debugLineNum = 93;BA.debugLine="DataIterator.SetStyle(sm)";
_dataiterator._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 847;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 848;BA.debugLine="DataIterator.SetStyleSingle(prop, value)";
_dataiterator._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 849;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 850;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 835;BA.debugLine="Sub SetTabIndex(ti As String) As VMDataIterator";
 //BA.debugLineNum = 836;BA.debugLine="DataIterator.SetTabIndex(ti)";
_dataiterator._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 837;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 838;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetText(t As Object) As VMDataIterator";
 //BA.debugLineNum = 70;BA.debugLine="DataIterator.SetText(t)";
_dataiterator._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 519;BA.debugLine="Sub SetValue(varValue As String) As VMDataIterator";
 //BA.debugLineNum = 520;BA.debugLine="DataIterator.SetValue(varValue, False)";
_dataiterator._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 521;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 522;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 864;BA.debugLine="Sub SetVElse(vif As String) As VMDataIterator";
 //BA.debugLineNum = 865;BA.debugLine="DataIterator.SetVElse(vif)";
_dataiterator._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 866;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 867;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 874;BA.debugLine="Sub SetVhtml(vhtml As String) As VMDataIterator";
 //BA.debugLineNum = 875;BA.debugLine="DataIterator.SetVHtml(vhtml)";
_dataiterator._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 876;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 877;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetVIf(vif As String) As VMDataIterator";
 //BA.debugLineNum = 47;BA.debugLine="DataIterator.SetVIf(vif)";
_dataiterator._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 927;BA.debugLine="Sub SetVisible(b As Boolean) As VMDataIterator";
 //BA.debugLineNum = 928;BA.debugLine="DataIterator.SetVisible(b)";
_dataiterator._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 929;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 930;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetVModel(k As String) As VMDataIterator";
 //BA.debugLineNum = 42;BA.debugLine="DataIterator.SetVModel(k)";
_dataiterator._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetVShow(vif As String) As VMDataIterator";
 //BA.debugLineNum = 52;BA.debugLine="DataIterator.SetVShow(vif)";
_dataiterator._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 869;BA.debugLine="Sub SetVText(vhtml As String) As VMDataIterator";
 //BA.debugLineNum = 870;BA.debugLine="DataIterator.SetVText(vhtml)";
_dataiterator._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 871;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 872;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdataiterator  _show() throws Exception{
 //BA.debugLineNum = 766;BA.debugLine="Sub Show As VMDataIterator";
 //BA.debugLineNum = 767;BA.debugLine="DataIterator.SetVisible(True)";
_dataiterator._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 768;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 769;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 38;BA.debugLine="Return DataIterator.ToString";
if (true) return _dataiterator._tostring /*String*/ ();
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdataiterator  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 798;BA.debugLine="Sub UseTheme(themeName As String) As VMDataIterato";
 //BA.debugLineNum = 799;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 800;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 801;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 802;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 803;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 805;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdataiterator)(this);
 //BA.debugLineNum = 806;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
