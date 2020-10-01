package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmfileinput extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmfileinput", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmfileinput.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _fileinput = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public String _errortext = "";
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
public b4j.example.vmfileinput  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 97;BA.debugLine="Sub AddChild(child As VMElement) As VMFileInput";
 //BA.debugLineNum = 98;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 99;BA.debugLine="FileInput.SetText(childHTML)";
_fileinput._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
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
public b4j.example.vmfileinput  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub AddClass(c As String) As VMFileInput";
 //BA.debugLineNum = 116;BA.debugLine="FileInput.AddClass(c)";
_fileinput._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 1141;BA.debugLine="Sub AddComponent(comp As String) As VMFileInput";
 //BA.debugLineNum = 1142;BA.debugLine="FileInput.SetText(comp)";
_fileinput._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 1143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1144;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 1146;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 1147;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 1148;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfileinput  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 977;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 978;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 979;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 980;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 981;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1072;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 1073;BA.debugLine="FileInput.BindStyleSingle(prop, value)";
_fileinput._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 1074;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1075;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 1151;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 1152;BA.debugLine="FileInput.BuildModel(mprops, mstyles, lclasses, l";
_fileinput._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 1153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1154;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public FileInput As VMElement";
_fileinput = new b4j.example.vmelement();
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
 //BA.debugLineNum = 10;BA.debugLine="Public ErrorText As String";
_errortext = "";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfileinput  _disable() throws Exception{
 //BA.debugLineNum = 970;BA.debugLine="Sub Disable As VMFileInput";
 //BA.debugLineNum = 971;BA.debugLine="FileInput.Disable(True)";
_fileinput._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 972;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 973;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _enable() throws Exception{
 //BA.debugLineNum = 964;BA.debugLine="Sub Enable As VMFileInput";
 //BA.debugLineNum = 965;BA.debugLine="FileInput.Enable(True)";
_fileinput._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 966;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 967;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _hide() throws Exception{
 //BA.debugLineNum = 952;BA.debugLine="Sub Hide As VMFileInput";
 //BA.debugLineNum = 953;BA.debugLine="FileInput.SetVisible(False)";
_fileinput._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 954;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 955;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="FileInput.Initialize(v, ID)";
_fileinput._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 17;BA.debugLine="FileInput.SetTag(\"v-file-input\")";
_fileinput._settag /*b4j.example.vmelement*/ ("v-file-input");
 //BA.debugLineNum = 18;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 19;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 21;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="FileInput.fieldType = \"string\"";
_fileinput._fieldtype /*String*/  = "string";
 //BA.debugLineNum = 23;BA.debugLine="FileInput.typeOf = \"string\"";
_fileinput._typeof /*String*/  = "string";
 //BA.debugLineNum = 24;BA.debugLine="FileInput.InputType = \"file\"";
_fileinput._inputtype /*String*/  = "file";
 //BA.debugLineNum = 25;BA.debugLine="SetOnChange($\"${ID}_change\"$)";
_setonchange((""+__c.SmartStringFormatter("",(Object)(_id))+"_change"));
 //BA.debugLineNum = 26;BA.debugLine="SetRules(vue.NewList)";
_setrules(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 27;BA.debugLine="SetErrorMessages(vue.NewList)";
_seterrormessages(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 28;BA.debugLine="SetError(False)";
_seterror(__c.False);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 111;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfileinput  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 1016;BA.debugLine="public Sub RemoveAttr(sName As String) As VMFileIn";
 //BA.debugLineNum = 1017;BA.debugLine="FileInput.RemoveAttr(sName)";
_fileinput._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 1018;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1019;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub Render";
 //BA.debugLineNum = 93;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfileinput  _setaccept(String _varaccept) throws Exception{
String _pp = "";
 //BA.debugLineNum = 45;BA.debugLine="Sub SetAccept(varAccept As String) As VMFileInput";
 //BA.debugLineNum = 46;BA.debugLine="If varAccept = \"\" Then Return Me";
if ((_varaccept).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 47;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 48;BA.debugLine="SetAttrSingle(\"accept\", varAccept)";
_setattrsingle("accept",_varaccept);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 51;BA.debugLine="Dim pp As String = $\"${ID}varAccept\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"varAccept");
 //BA.debugLineNum = 52;BA.debugLine="vue.SetStateSingle(pp, varAccept)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varaccept));
 //BA.debugLineNum = 53;BA.debugLine="Bind(\":accept\", pp)";
_bind(":accept",_pp);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setappendicon(String _varappendicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 140;BA.debugLine="Sub SetAppendIcon(varAppendIcon As String) As VMFi";
 //BA.debugLineNum = 141;BA.debugLine="If varAppendIcon = \"\" Then Return Me";
if ((_varappendicon).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 142;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 143;BA.debugLine="SetAttrSingle(\"append-icon\", varAppendIcon)";
_setattrsingle("append-icon",_varappendicon);
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 146;BA.debugLine="Dim pp As String = $\"${ID}AppendIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AppendIcon");
 //BA.debugLineNum = 147;BA.debugLine="vue.SetStateSingle(pp, varAppendIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varappendicon));
 //BA.debugLineNum = 148;BA.debugLine="FileInput.Bind(\":append-icon\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":append-icon",_pp);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setappendoutericon(String _varappendoutericon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 153;BA.debugLine="Sub SetAppendOuterIcon(varAppendOuterIcon As Strin";
 //BA.debugLineNum = 154;BA.debugLine="If varAppendOuterIcon = \"\" Then Return Me";
if ((_varappendoutericon).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 155;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 156;BA.debugLine="SetAttrSingle(\"append-outer-icon\", varAppendOute";
_setattrsingle("append-outer-icon",_varappendoutericon);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 159;BA.debugLine="Dim pp As String = $\"${ID}AppendOuterIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AppendOuterIcon");
 //BA.debugLineNum = 160;BA.debugLine="vue.SetStateSingle(pp, varAppendOuterIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varappendoutericon));
 //BA.debugLineNum = 161;BA.debugLine="FileInput.Bind(\":append-outer-icon\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":append-outer-icon",_pp);
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetAttr(attr As Map) As VMFileInput";
 //BA.debugLineNum = 122;BA.debugLine="FileInput.SetAttr(attr)";
_fileinput._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 1092;BA.debugLine="Sub SetAttributes(attrs As List) As VMFileInput";
 //BA.debugLineNum = 1093;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1094;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 1096;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1097;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 984;BA.debugLine="Sub SetAttrLoose(loose As String) As VMFileInput";
 //BA.debugLineNum = 985;BA.debugLine="FileInput.SetAttrLoose(loose)";
_fileinput._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 986;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 987;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1066;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 1067;BA.debugLine="FileInput.SetAttrSingle(prop, value)";
_fileinput._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 1068;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1069;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setautofocus(boolean _varautofocus) throws Exception{
String _pp = "";
 //BA.debugLineNum = 396;BA.debugLine="Sub SetAutofocus(varAutofocus As Boolean) As VMFil";
 //BA.debugLineNum = 397;BA.debugLine="If varAutofocus = False Then Return Me";
if (_varautofocus==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 398;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 399;BA.debugLine="SetAttrSingle(\"autofocus\", varAutofocus)";
_setattrsingle("autofocus",BA.ObjectToString(_varautofocus));
 //BA.debugLineNum = 400;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 402;BA.debugLine="Dim pp As String = $\"${ID}Autofocus\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Autofocus");
 //BA.debugLineNum = 403;BA.debugLine="vue.SetStateSingle(pp, varAutofocus)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varautofocus));
 //BA.debugLineNum = 404;BA.debugLine="FileInput.Bind(\":autofocus\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":autofocus",_pp);
 //BA.debugLineNum = 405;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setbackgroundcolor(String _varbackgroundcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 166;BA.debugLine="Sub SetBackgroundColor(varBackgroundColor As Strin";
 //BA.debugLineNum = 167;BA.debugLine="If varBackgroundColor = \"\" Then Return Me";
if ((_varbackgroundcolor).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 168;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 169;BA.debugLine="SetAttrSingle(\"background-color\", varBackgroundC";
_setattrsingle("background-color",_varbackgroundcolor);
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 172;BA.debugLine="Dim pp As String = $\"${ID}BackgroundColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BackgroundColor");
 //BA.debugLineNum = 173;BA.debugLine="vue.SetStateSingle(pp, varBackgroundColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbackgroundcolor));
 //BA.debugLineNum = 174;BA.debugLine="FileInput.Bind(\":background-color\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setbackgroundcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 180;BA.debugLine="Sub SetBackgroundColorIntensity(color As String, i";
 //BA.debugLineNum = 181;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 182;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 183;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 184;BA.debugLine="SetAttrSingle(\"background-color\", scolor)";
_setattrsingle("background-color",_scolor);
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 187;BA.debugLine="Dim pp As String = $\"${ID}BackgroundColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BackgroundColor");
 //BA.debugLineNum = 188;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 189;BA.debugLine="FileInput.Bind(\":background-color\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setchips(boolean _varchips) throws Exception{
String _pp = "";
 //BA.debugLineNum = 409;BA.debugLine="Sub SetChips(varChips As Boolean) As VMFileInput";
 //BA.debugLineNum = 410;BA.debugLine="If varChips = False Then Return Me";
if (_varchips==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 411;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 412;BA.debugLine="SetAttrSingle(\"chips\", varChips)";
_setattrsingle("chips",BA.ObjectToString(_varchips));
 //BA.debugLineNum = 413;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 415;BA.debugLine="Dim pp As String = $\"${ID}Chips\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Chips");
 //BA.debugLineNum = 416;BA.debugLine="vue.SetStateSingle(pp, varChips)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varchips));
 //BA.debugLineNum = 417;BA.debugLine="FileInput.Bind(\":chips\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":chips",_pp);
 //BA.debugLineNum = 418;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setclearable(boolean _varclearable) throws Exception{
String _pp = "";
 //BA.debugLineNum = 422;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMFil";
 //BA.debugLineNum = 423;BA.debugLine="If varClearable = True Then Return Me";
if (_varclearable==__c.True) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 424;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 425;BA.debugLine="SetAttrSingle(\"clearable\", varClearable)";
_setattrsingle("clearable",BA.ObjectToString(_varclearable));
 //BA.debugLineNum = 426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 428;BA.debugLine="Dim pp As String = $\"${ID}Clearable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Clearable");
 //BA.debugLineNum = 429;BA.debugLine="vue.SetStateSingle(pp, varClearable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varclearable));
 //BA.debugLineNum = 430;BA.debugLine="FileInput.Bind(\":clearable\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":clearable",_pp);
 //BA.debugLineNum = 431;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 195;BA.debugLine="Sub SetColor(varColor As String) As VMFileInput";
 //BA.debugLineNum = 196;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 197;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 198;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 201;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 202;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 203;BA.debugLine="FileInput.Bind(\":color\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 1002;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 1003;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 1004;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 1005;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1006;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 1007;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 1009;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 1010;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 1011;BA.debugLine="FileInput.Bind(\":color\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 1012;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1013;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setcounter(String _varcounter) throws Exception{
String _pp = "";
 //BA.debugLineNum = 208;BA.debugLine="Sub SetCounter(varCounter As String) As VMFileInpu";
 //BA.debugLineNum = 209;BA.debugLine="If varCounter = \"\" Then Return Me";
if ((_varcounter).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 210;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 211;BA.debugLine="SetAttrSingle(\"counter\", varCounter)";
_setattrsingle("counter",_varcounter);
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 214;BA.debugLine="Dim pp As String = $\"${ID}Counter\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Counter");
 //BA.debugLineNum = 215;BA.debugLine="vue.SetStateSingle(pp, varCounter)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcounter));
 //BA.debugLineNum = 216;BA.debugLine="FileInput.Bind(\":counter\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":counter",_pp);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 435;BA.debugLine="Sub SetDark(varDark As Boolean) As VMFileInput";
 //BA.debugLineNum = 436;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 437;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 438;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 439;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 441;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 442;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 443;BA.debugLine="FileInput.Bind(\":dark\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 444;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 33;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setdense(boolean _vardense) throws Exception{
String _pp = "";
 //BA.debugLineNum = 448;BA.debugLine="Sub SetDense(varDense As Boolean) As VMFileInput";
 //BA.debugLineNum = 449;BA.debugLine="If varDense = False Then Return Me";
if (_vardense==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 450;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 451;BA.debugLine="SetAttrSingle(\"dense\", varDense)";
_setattrsingle("dense",BA.ObjectToString(_vardense));
 //BA.debugLineNum = 452;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 454;BA.debugLine="Dim pp As String = $\"${ID}Dense\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dense");
 //BA.debugLineNum = 455;BA.debugLine="vue.SetStateSingle(pp, varDense)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardense));
 //BA.debugLineNum = 456;BA.debugLine="FileInput.Bind(\":dense\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":dense",_pp);
 //BA.debugLineNum = 457;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 1034;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMFileInput";
 //BA.debugLineNum = 1035;BA.debugLine="FileInput.SetDesignMode(b)";
_fileinput._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 1036;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 1037;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1038;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 1121;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 1122;BA.debugLine="FileInput.SetDeviceOffsets(OS, OM, OL, OX)";
_fileinput._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 1123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 1128;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 1129;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 1130;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 1131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 1135;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 1136;BA.debugLine="FileInput.SetDeviceSizes(SS, SM, SL, SX)";
_fileinput._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 1137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1138;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setdisabled(boolean _vardisabled) throws Exception{
String _pp = "";
 //BA.debugLineNum = 461;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMFileI";
 //BA.debugLineNum = 462;BA.debugLine="If varDisabled = False Then Return Me";
if (_vardisabled==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 463;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 464;BA.debugLine="SetAttrSingle(\"disabled\", varDisabled)";
_setattrsingle("disabled",BA.ObjectToString(_vardisabled));
 //BA.debugLineNum = 465;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 467;BA.debugLine="Dim pp As String = $\"${ID}Disabled\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Disabled");
 //BA.debugLineNum = 468;BA.debugLine="vue.SetStateSingle(pp, varDisabled)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisabled));
 //BA.debugLineNum = 469;BA.debugLine="FileInput.Bind(\":disabled\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":disabled",_pp);
 //BA.debugLineNum = 470;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 471;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _seterror(boolean _varerror) throws Exception{
String _pp = "";
 //BA.debugLineNum = 474;BA.debugLine="Sub SetError(varError As Boolean) As VMFileInput";
 //BA.debugLineNum = 475;BA.debugLine="If varError = False Then Return Me";
if (_varerror==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 476;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 477;BA.debugLine="SetAttrSingle(\"error\", varError)";
_setattrsingle("error",BA.ObjectToString(_varerror));
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 480;BA.debugLine="Dim pp As String = $\"${ID}Error\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Error");
 //BA.debugLineNum = 481;BA.debugLine="vue.SetStateSingle(pp, varError)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varerror));
 //BA.debugLineNum = 482;BA.debugLine="FileInput.Bind(\":error\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":error",_pp);
 //BA.debugLineNum = 483;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 484;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _seterrorcount(String _varerrorcount) throws Exception{
String _pp = "";
 //BA.debugLineNum = 221;BA.debugLine="Sub SetErrorCount(varErrorCount As String) As VMFi";
 //BA.debugLineNum = 222;BA.debugLine="If varErrorCount = \"\" Then Return Me";
if ((_varerrorcount).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 223;BA.debugLine="If varErrorCount = \"1\" Then Return Me";
if ((_varerrorcount).equals("1")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 224;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 225;BA.debugLine="SetAttrSingle(\"error-count\", varErrorCount)";
_setattrsingle("error-count",_varerrorcount);
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 228;BA.debugLine="Dim pp As String = $\"${ID}ErrorCount\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ErrorCount");
 //BA.debugLineNum = 229;BA.debugLine="vue.SetStateSingle(pp, varErrorCount)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varerrorcount));
 //BA.debugLineNum = 230;BA.debugLine="FileInput.Bind(\":error-count\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":error-count",_pp);
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _seterrormessages(anywheresoftware.b4a.objects.collections.List _varerrormessages) throws Exception{
String _pp = "";
 //BA.debugLineNum = 747;BA.debugLine="Sub SetErrorMessages(varErrorMessages As List) As";
 //BA.debugLineNum = 748;BA.debugLine="If bStatic Then Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 749;BA.debugLine="Dim pp As String = $\"${ID}ErrorMessages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ErrorMessages");
 //BA.debugLineNum = 750;BA.debugLine="vue.SetStateSingle(pp, varErrorMessages)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varerrormessages.getObject()));
 //BA.debugLineNum = 751;BA.debugLine="FileInput.Bind(\":error-messages\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":error-messages",_pp);
 //BA.debugLineNum = 752;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 753;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _seterrortext(String _serror) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetErrorText(sError As String) As VMFileInput";
 //BA.debugLineNum = 39;BA.debugLine="ErrorText = sError";
_errortext = _serror;
 //BA.debugLineNum = 40;BA.debugLine="FileInput.ErrorMessage = sError";
_fileinput._errormessage /*String*/  = _serror;
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setfilled(boolean _varfilled) throws Exception{
String _pp = "";
 //BA.debugLineNum = 487;BA.debugLine="Sub SetFilled(varFilled As Boolean) As VMFileInput";
 //BA.debugLineNum = 488;BA.debugLine="If varFilled = False Then Return Me";
if (_varfilled==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 489;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 490;BA.debugLine="SetAttrSingle(\"filled\", varFilled)";
_setattrsingle("filled",BA.ObjectToString(_varfilled));
 //BA.debugLineNum = 491;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 493;BA.debugLine="Dim pp As String = $\"${ID}Filled\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Filled");
 //BA.debugLineNum = 494;BA.debugLine="vue.SetStateSingle(pp, varFilled)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfilled));
 //BA.debugLineNum = 495;BA.debugLine="FileInput.Bind(\":filled\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":filled",_pp);
 //BA.debugLineNum = 496;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setflat(boolean _varflat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 500;BA.debugLine="Sub SetFlat(varFlat As Boolean) As VMFileInput";
 //BA.debugLineNum = 501;BA.debugLine="If varFlat = False Then Return Me";
if (_varflat==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 502;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 503;BA.debugLine="SetAttrSingle(\"flat\", varFlat)";
_setattrsingle("flat",BA.ObjectToString(_varflat));
 //BA.debugLineNum = 504;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 506;BA.debugLine="Dim pp As String = $\"${ID}Flat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Flat");
 //BA.debugLineNum = 507;BA.debugLine="vue.SetStateSingle(pp, varFlat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varflat));
 //BA.debugLineNum = 508;BA.debugLine="FileInput.Bind(\":flat\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":flat",_pp);
 //BA.debugLineNum = 509;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 510;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setfullwidth(boolean _varfullwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 513;BA.debugLine="Sub SetFullWidth(varFullWidth As Boolean) As VMFil";
 //BA.debugLineNum = 514;BA.debugLine="If varFullWidth = False Then Return Me";
if (_varfullwidth==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 515;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 516;BA.debugLine="SetAttrSingle(\"full-width\", varFullWidth)";
_setattrsingle("full-width",BA.ObjectToString(_varfullwidth));
 //BA.debugLineNum = 517;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 519;BA.debugLine="Dim pp As String = $\"${ID}FullWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"FullWidth");
 //BA.debugLineNum = 520;BA.debugLine="vue.SetStateSingle(pp, varFullWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfullwidth));
 //BA.debugLineNum = 521;BA.debugLine="FileInput.Bind(\":full-width\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":full-width",_pp);
 //BA.debugLineNum = 522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 235;BA.debugLine="Sub SetHeight(varHeight As String) As VMFileInput";
 //BA.debugLineNum = 236;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 237;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 238;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 241;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 242;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 243;BA.debugLine="FileInput.Bind(\":height\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _sethidedetails(boolean _varhidedetails) throws Exception{
String _pp = "";
 //BA.debugLineNum = 526;BA.debugLine="Sub SetHideDetails(varHideDetails As Boolean) As V";
 //BA.debugLineNum = 527;BA.debugLine="If varHideDetails = False Then Return Me";
if (_varhidedetails==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 528;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 529;BA.debugLine="SetAttrSingle(\"hide-details\", varHideDetails)";
_setattrsingle("hide-details",BA.ObjectToString(_varhidedetails));
 //BA.debugLineNum = 530;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 532;BA.debugLine="Dim pp As String = $\"${ID}HideDetails\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideDetails");
 //BA.debugLineNum = 533;BA.debugLine="vue.SetStateSingle(pp, varHideDetails)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhidedetails));
 //BA.debugLineNum = 534;BA.debugLine="FileInput.Bind(\":hide-details\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":hide-details",_pp);
 //BA.debugLineNum = 535;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 536;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _sethideinput(boolean _varhideinput) throws Exception{
String _pp = "";
 //BA.debugLineNum = 539;BA.debugLine="Sub SetHideInput(varHideInput As Boolean) As VMFil";
 //BA.debugLineNum = 540;BA.debugLine="If varHideInput = False Then Return Me";
if (_varhideinput==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 541;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 542;BA.debugLine="SetAttrSingle(\"hide-input\", varHideInput)";
_setattrsingle("hide-input",BA.ObjectToString(_varhideinput));
 //BA.debugLineNum = 543;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 545;BA.debugLine="Dim pp As String = $\"${ID}HideInput\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideInput");
 //BA.debugLineNum = 546;BA.debugLine="vue.SetStateSingle(pp, varHideInput)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhideinput));
 //BA.debugLineNum = 547;BA.debugLine="FileInput.Bind(\":hide-input\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":hide-input",_pp);
 //BA.debugLineNum = 548;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 549;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _sethint(String _varhint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 249;BA.debugLine="Sub SetHint(varHint As String) As VMFileInput";
 //BA.debugLineNum = 250;BA.debugLine="If varHint = \"\" Then Return Me";
if ((_varhint).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 251;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 252;BA.debugLine="SetAttrSingle(\"hint\", varHint)";
_setattrsingle("hint",_varhint);
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 255;BA.debugLine="Dim pp As String = $\"${ID}Hint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Hint");
 //BA.debugLineNum = 256;BA.debugLine="vue.SetStateSingle(pp, varHint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhint));
 //BA.debugLineNum = 257;BA.debugLine="FileInput.Bind(\":hint\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":hint",_pp);
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 1108;BA.debugLine="Sub SetKey(k As String) As VMFileInput";
 //BA.debugLineNum = 1109;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 1110;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 1111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setlabel(String _varlabel) throws Exception{
String _pp = "";
 //BA.debugLineNum = 262;BA.debugLine="Sub SetLabel(varLabel As String) As VMFileInput";
 //BA.debugLineNum = 263;BA.debugLine="If varLabel = \"\" Then Return Me";
if ((_varlabel).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 264;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 265;BA.debugLine="SetAttrSingle(\"label\", varLabel)";
_setattrsingle("label",_varlabel);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 268;BA.debugLine="Dim pp As String = $\"${ID}Label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Label");
 //BA.debugLineNum = 269;BA.debugLine="vue.SetStateSingle(pp, varLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlabel));
 //BA.debugLineNum = 270;BA.debugLine="FileInput.Bind(\":label\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":label",_pp);
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 552;BA.debugLine="Sub SetLight(varLight As Boolean) As VMFileInput";
 //BA.debugLineNum = 553;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 554;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 555;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 556;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 558;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 559;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 560;BA.debugLine="FileInput.Bind(\":light\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 561;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 562;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setloaderheight(String _varloaderheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 275;BA.debugLine="Sub SetLoaderHeight(varLoaderHeight As String) As";
 //BA.debugLineNum = 276;BA.debugLine="If varLoaderHeight = \"\" Then Return Me";
if ((_varloaderheight).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 277;BA.debugLine="If varLoaderHeight = \"2\" Then Return Me";
if ((_varloaderheight).equals("2")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 278;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 279;BA.debugLine="SetAttrSingle(\"loader-height\", varLoaderHeight)";
_setattrsingle("loader-height",_varloaderheight);
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 282;BA.debugLine="Dim pp As String = $\"${ID}LoaderHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"LoaderHeight");
 //BA.debugLineNum = 283;BA.debugLine="vue.SetStateSingle(pp, varLoaderHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloaderheight));
 //BA.debugLineNum = 284;BA.debugLine="FileInput.Bind(\":loader-height\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":loader-height",_pp);
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setloading(boolean _varloading) throws Exception{
String _pp = "";
 //BA.debugLineNum = 565;BA.debugLine="Sub SetLoading(varLoading As Boolean) As VMFileInp";
 //BA.debugLineNum = 566;BA.debugLine="If varLoading = False Then Return Me";
if (_varloading==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 567;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 568;BA.debugLine="SetAttrSingle(\"loading\", varLoading)";
_setattrsingle("loading",BA.ObjectToString(_varloading));
 //BA.debugLineNum = 569;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 571;BA.debugLine="Dim pp As String = $\"${ID}Loading\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Loading");
 //BA.debugLineNum = 572;BA.debugLine="vue.SetStateSingle(pp, varLoading)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloading));
 //BA.debugLineNum = 573;BA.debugLine="FileInput.Bind(\":loading\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":loading",_pp);
 //BA.debugLineNum = 574;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 575;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 1028;BA.debugLine="Sub SetMarginAll(p As String) As VMFileInput";
 //BA.debugLineNum = 1029;BA.debugLine="FileInput.setmarginall(p)";
_fileinput._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 1030;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1031;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setmessages(anywheresoftware.b4a.objects.collections.List _varmessages) throws Exception{
String _pp = "";
 //BA.debugLineNum = 756;BA.debugLine="Sub SetMessages(varMessages As List) As VMFileInpu";
 //BA.debugLineNum = 757;BA.debugLine="If bStatic Then Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 758;BA.debugLine="Dim pp As String = $\"${ID}Messages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Messages");
 //BA.debugLineNum = 759;BA.debugLine="vue.SetStateSingle(pp, varMessages)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmessages.getObject()));
 //BA.debugLineNum = 760;BA.debugLine="FileInput.Bind(\":messages\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":messages",_pp);
 //BA.debugLineNum = 761;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 762;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setmultiple(boolean _varmultiple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 578;BA.debugLine="Sub SetMultiple(varMultiple As Boolean) As VMFileI";
 //BA.debugLineNum = 579;BA.debugLine="If varMultiple = False Then Return Me";
if (_varmultiple==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 580;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 581;BA.debugLine="SetAttrSingle(\"multiple\", varMultiple)";
_setattrsingle("multiple",BA.ObjectToString(_varmultiple));
 //BA.debugLineNum = 582;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 584;BA.debugLine="Dim pp As String = $\"${ID}Multiple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Multiple");
 //BA.debugLineNum = 585;BA.debugLine="vue.SetStateSingle(pp, varMultiple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmultiple));
 //BA.debugLineNum = 586;BA.debugLine="FileInput.Bind(\":multiple\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":multiple",_pp);
 //BA.debugLineNum = 587;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 588;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 1054;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 1055;BA.debugLine="FileInput.SetName(varName, bbind)";
_fileinput._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 1056;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1057;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setonblur(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 783;BA.debugLine="Sub SetOnBlur(methodName As String) As VMFileInput";
 //BA.debugLineNum = 784;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 785;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 786;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 787;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 788;BA.debugLine="SetAttr(CreateMap(\"@blur\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@blur"),(Object)(_methodname)}));
 //BA.debugLineNum = 790;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 791;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 792;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setonchange(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 795;BA.debugLine="Sub SetOnChange(methodName As String) As VMFileInp";
 //BA.debugLineNum = 796;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 797;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 798;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 799;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 800;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 802;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 803;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 804;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setonclick(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 807;BA.debugLine="Sub SetOnClick(methodName As String) As VMFileInpu";
 //BA.debugLineNum = 808;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 809;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 810;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 811;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 812;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 814;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 815;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 816;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setonclickappend(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 819;BA.debugLine="Sub SetOnClickAppend(methodName As String) As VMFi";
 //BA.debugLineNum = 820;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 821;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 822;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 823;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 824;BA.debugLine="SetAttr(CreateMap(\"@click:append\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:append"),(Object)(_methodname)}));
 //BA.debugLineNum = 826;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 827;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 828;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setonclickappendouter(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 831;BA.debugLine="Sub SetOnClickAppendOuter(methodName As String) As";
 //BA.debugLineNum = 832;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 833;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 834;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 835;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 836;BA.debugLine="SetAttr(CreateMap(\"@click:append-outer\": methodNa";
_setattr(__c.createMap(new Object[] {(Object)("@click:append-outer"),(Object)(_methodname)}));
 //BA.debugLineNum = 838;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 839;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 840;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setonclickclear(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 843;BA.debugLine="Sub SetOnClickClear(methodName As String) As VMFil";
 //BA.debugLineNum = 844;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 845;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 846;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 847;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 848;BA.debugLine="SetAttr(CreateMap(\"@click:clear\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:clear"),(Object)(_methodname)}));
 //BA.debugLineNum = 850;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 851;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 852;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setonclickprepend(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 855;BA.debugLine="Sub SetOnClickPrepend(methodName As String) As VMF";
 //BA.debugLineNum = 856;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 857;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 858;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 859;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 860;BA.debugLine="SetAttr(CreateMap(\"@click:prepend\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:prepend"),(Object)(_methodname)}));
 //BA.debugLineNum = 862;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 863;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 864;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setonclickprependinner(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 867;BA.debugLine="Sub SetOnClickPrependInner(methodName As String) A";
 //BA.debugLineNum = 868;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 869;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 870;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 871;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 872;BA.debugLine="SetAttr(CreateMap(\"@click:prepend-inner\": methodN";
_setattr(__c.createMap(new Object[] {(Object)("@click:prepend-inner"),(Object)(_methodname)}));
 //BA.debugLineNum = 874;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 875;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 876;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setonfocus(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 879;BA.debugLine="Sub SetOnFocus(methodName As String) As VMFileInpu";
 //BA.debugLineNum = 880;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 881;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 882;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 883;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 884;BA.debugLine="SetAttr(CreateMap(\"@focus\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@focus"),(Object)(_methodname)}));
 //BA.debugLineNum = 886;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 887;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 888;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setoninput(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 891;BA.debugLine="Sub SetOnInput(methodName As String) As VMFileInpu";
 //BA.debugLineNum = 892;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 893;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 894;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 895;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 896;BA.debugLine="SetAttr(CreateMap(\"@input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_methodname)}));
 //BA.debugLineNum = 898;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 899;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 900;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setonkeydown(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 903;BA.debugLine="Sub SetOnKeydown(methodName As String) As VMFileIn";
 //BA.debugLineNum = 904;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 905;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 906;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 907;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 908;BA.debugLine="SetAttr(CreateMap(\"@keydown\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@keydown"),(Object)(_methodname)}));
 //BA.debugLineNum = 910;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 911;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 912;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setonmousedown(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 915;BA.debugLine="Sub SetOnMousedown(methodName As String) As VMFile";
 //BA.debugLineNum = 916;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 917;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 918;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 919;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 920;BA.debugLine="SetAttr(CreateMap(\"@mousedown\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mousedown"),(Object)(_methodname)}));
 //BA.debugLineNum = 922;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 923;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 924;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setonmouseup(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 927;BA.debugLine="Sub SetOnMouseup(methodName As String) As VMFileIn";
 //BA.debugLineNum = 928;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 929;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 930;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 931;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 932;BA.debugLine="SetAttr(CreateMap(\"@mouseup\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mouseup"),(Object)(_methodname)}));
 //BA.debugLineNum = 934;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 935;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 936;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setonupdateerror(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 939;BA.debugLine="Sub SetOnUpdateError(methodName As String) As VMFi";
 //BA.debugLineNum = 940;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 941;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 942;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 943;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 944;BA.debugLine="SetAttr(CreateMap(\"@update:error\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:error"),(Object)(_methodname)}));
 //BA.debugLineNum = 946;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 947;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 948;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setoutlined(boolean _varoutlined) throws Exception{
String _pp = "";
 //BA.debugLineNum = 591;BA.debugLine="Sub SetOutlined(varOutlined As Boolean) As VMFileI";
 //BA.debugLineNum = 592;BA.debugLine="If varOutlined = False Then Return Me";
if (_varoutlined==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 593;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 594;BA.debugLine="SetAttrSingle(\"outlined\", varOutlined)";
_setattrsingle("outlined",BA.ObjectToString(_varoutlined));
 //BA.debugLineNum = 595;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 597;BA.debugLine="Dim pp As String = $\"${ID}Outlined\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Outlined");
 //BA.debugLineNum = 598;BA.debugLine="vue.SetStateSingle(pp, varOutlined)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoutlined));
 //BA.debugLineNum = 599;BA.debugLine="FileInput.Bind(\":outlined\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":outlined",_pp);
 //BA.debugLineNum = 600;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 601;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 1022;BA.debugLine="Sub SetPaddingAll(p As String) As VMFileInput";
 //BA.debugLineNum = 1023;BA.debugLine="FileInput.SetPaddingAll(p)";
_fileinput._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 1024;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1025;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setpersistenthint(boolean _varpersistenthint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 604;BA.debugLine="Sub SetPersistentHint(varPersistentHint As Boolean";
 //BA.debugLineNum = 605;BA.debugLine="If varPersistentHint = False Then Return Me";
if (_varpersistenthint==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 606;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 607;BA.debugLine="SetAttrSingle(\"persistent-hint\", varPersistentHi";
_setattrsingle("persistent-hint",BA.ObjectToString(_varpersistenthint));
 //BA.debugLineNum = 608;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 610;BA.debugLine="Dim pp As String = $\"${ID}PersistentHint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PersistentHint");
 //BA.debugLineNum = 611;BA.debugLine="vue.SetStateSingle(pp, varPersistentHint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpersistenthint));
 //BA.debugLineNum = 612;BA.debugLine="FileInput.Bind(\":persistent-hint\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":persistent-hint",_pp);
 //BA.debugLineNum = 613;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 614;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setplaceholder(String _varplaceholder) throws Exception{
String _pp = "";
 //BA.debugLineNum = 289;BA.debugLine="Sub SetPlaceholder(varPlaceholder As String) As VM";
 //BA.debugLineNum = 290;BA.debugLine="If varPlaceholder = \"\" Then Return Me";
if ((_varplaceholder).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 291;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 292;BA.debugLine="SetAttrSingle(\"placeholder\", varPlaceholder)";
_setattrsingle("placeholder",_varplaceholder);
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 295;BA.debugLine="Dim pp As String = $\"${ID}Placeholder\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Placeholder");
 //BA.debugLineNum = 296;BA.debugLine="vue.SetStateSingle(pp, varPlaceholder)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varplaceholder));
 //BA.debugLineNum = 297;BA.debugLine="FileInput.Bind(\":placeholder\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":placeholder",_pp);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setprefix(String _varprefix) throws Exception{
String _pp = "";
 //BA.debugLineNum = 302;BA.debugLine="Sub SetPrefix(varPrefix As String) As VMFileInput";
 //BA.debugLineNum = 303;BA.debugLine="If varPrefix = \"\" Then Return Me";
if ((_varprefix).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 304;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 305;BA.debugLine="SetAttrSingle(\"prefix\", varPrefix)";
_setattrsingle("prefix",_varprefix);
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 308;BA.debugLine="Dim pp As String = $\"${ID}Prefix\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Prefix");
 //BA.debugLineNum = 309;BA.debugLine="vue.SetStateSingle(pp, varPrefix)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprefix));
 //BA.debugLineNum = 310;BA.debugLine="FileInput.Bind(\":prefix\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":prefix",_pp);
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setprependicon(String _varprependicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 315;BA.debugLine="Sub SetPrependIcon(varPrependIcon As String) As VM";
 //BA.debugLineNum = 316;BA.debugLine="If varPrependIcon = \"\" Then Return Me";
if ((_varprependicon).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 317;BA.debugLine="If varPrependIcon = \"$file\" Then Return Me";
if ((_varprependicon).equals("$file")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 318;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 319;BA.debugLine="SetAttrSingle(\"prepend-icon\", varPrependIcon)";
_setattrsingle("prepend-icon",_varprependicon);
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 322;BA.debugLine="Dim pp As String = $\"${ID}PrependIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrependIcon");
 //BA.debugLineNum = 323;BA.debugLine="vue.SetStateSingle(pp, varPrependIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprependicon));
 //BA.debugLineNum = 324;BA.debugLine="FileInput.Bind(\":prepend-icon\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":prepend-icon",_pp);
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setprependinnericon(String _varprependinnericon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 329;BA.debugLine="Sub SetPrependInnerIcon(varPrependInnerIcon As Str";
 //BA.debugLineNum = 330;BA.debugLine="If varPrependInnerIcon = \"\" Then Return Me";
if ((_varprependinnericon).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 331;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 332;BA.debugLine="SetAttrSingle(\"prepend-inner-icon\", varPrependIn";
_setattrsingle("prepend-inner-icon",_varprependinnericon);
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 335;BA.debugLine="Dim pp As String = $\"${ID}PrependInnerIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrependInnerIcon");
 //BA.debugLineNum = 336;BA.debugLine="vue.SetStateSingle(pp, varPrependInnerIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprependinnericon));
 //BA.debugLineNum = 337;BA.debugLine="FileInput.Bind(\":prepend-inner-icon\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":prepend-inner-icon",_pp);
 //BA.debugLineNum = 338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 1115;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMFil";
 //BA.debugLineNum = 1116;BA.debugLine="FileInput.SetRC(sRow, sCol)";
_fileinput._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 1117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1118;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setrequired(boolean _varrequired) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMFileI";
 //BA.debugLineNum = 60;BA.debugLine="If varRequired = False Then Return Me";
if (_varrequired==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 61;BA.debugLine="FileInput.SetRequired(varRequired)";
_fileinput._setrequired /*b4j.example.vmelement*/ (_varrequired);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setreverse(boolean _varreverse) throws Exception{
String _pp = "";
 //BA.debugLineNum = 617;BA.debugLine="Sub SetReverse(varReverse As Boolean) As VMFileInp";
 //BA.debugLineNum = 618;BA.debugLine="If varReverse = False Then Return Me";
if (_varreverse==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 619;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 620;BA.debugLine="SetAttrSingle(\"reverse\", varReverse)";
_setattrsingle("reverse",BA.ObjectToString(_varreverse));
 //BA.debugLineNum = 621;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 623;BA.debugLine="Dim pp As String = $\"${ID}Reverse\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Reverse");
 //BA.debugLineNum = 624;BA.debugLine="vue.SetStateSingle(pp, varReverse)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreverse));
 //BA.debugLineNum = 625;BA.debugLine="FileInput.Bind(\":reverse\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":reverse",_pp);
 //BA.debugLineNum = 626;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 627;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setrounded(boolean _varrounded) throws Exception{
String _pp = "";
 //BA.debugLineNum = 630;BA.debugLine="Sub SetRounded(varRounded As Boolean) As VMFileInp";
 //BA.debugLineNum = 631;BA.debugLine="If varRounded = False Then Return Me";
if (_varrounded==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 632;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 633;BA.debugLine="SetAttrSingle(\"rounded\", varRounded)";
_setattrsingle("rounded",BA.ObjectToString(_varrounded));
 //BA.debugLineNum = 634;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 636;BA.debugLine="Dim pp As String = $\"${ID}Rounded\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Rounded");
 //BA.debugLineNum = 637;BA.debugLine="vue.SetStateSingle(pp, varRounded)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varrounded));
 //BA.debugLineNum = 638;BA.debugLine="FileInput.Bind(\":rounded\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":rounded",_pp);
 //BA.debugLineNum = 639;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 640;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setrules(anywheresoftware.b4a.objects.collections.List _varrules) throws Exception{
String _pp = "";
 //BA.debugLineNum = 765;BA.debugLine="Sub SetRules(varRules As List) As VMFileInput";
 //BA.debugLineNum = 766;BA.debugLine="If bStatic Then Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 767;BA.debugLine="Dim pp As String = $\"${ID}Rules\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Rules");
 //BA.debugLineNum = 768;BA.debugLine="vue.SetStateSingle(pp, varRules)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varrules.getObject()));
 //BA.debugLineNum = 769;BA.debugLine="FileInput.Bind(\":rules\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":rules",_pp);
 //BA.debugLineNum = 770;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 771;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setshaped(boolean _varshaped) throws Exception{
String _pp = "";
 //BA.debugLineNum = 643;BA.debugLine="Sub SetShaped(varShaped As Boolean) As VMFileInput";
 //BA.debugLineNum = 644;BA.debugLine="If varShaped = False Then Return Me";
if (_varshaped==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 645;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 646;BA.debugLine="SetAttrSingle(\"shaped\", varShaped)";
_setattrsingle("shaped",BA.ObjectToString(_varshaped));
 //BA.debugLineNum = 647;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 649;BA.debugLine="Dim pp As String = $\"${ID}Shaped\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Shaped");
 //BA.debugLineNum = 650;BA.debugLine="vue.SetStateSingle(pp, varShaped)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshaped));
 //BA.debugLineNum = 651;BA.debugLine="FileInput.Bind(\":shaped\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":shaped",_pp);
 //BA.debugLineNum = 652;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 653;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setshowsize(boolean _varshowsize) throws Exception{
String _pp = "";
 //BA.debugLineNum = 656;BA.debugLine="Sub SetShowSize(varShowSize As Boolean) As VMFileI";
 //BA.debugLineNum = 657;BA.debugLine="If varShowSize = False Then Return Me";
if (_varshowsize==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 658;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 659;BA.debugLine="SetAttrSingle(\"show-size\", varShowSize)";
_setattrsingle("show-size",BA.ObjectToString(_varshowsize));
 //BA.debugLineNum = 660;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 662;BA.debugLine="Dim pp As String = $\"${ID}ShowSize\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowSize");
 //BA.debugLineNum = 663;BA.debugLine="vue.SetStateSingle(pp, varShowSize)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshowsize));
 //BA.debugLineNum = 664;BA.debugLine="FileInput.Bind(\":show-size\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":show-size",_pp);
 //BA.debugLineNum = 665;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 666;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setsingleline(boolean _varsingleline) throws Exception{
String _pp = "";
 //BA.debugLineNum = 669;BA.debugLine="Sub SetSingleLine(varSingleLine As Boolean) As VMF";
 //BA.debugLineNum = 670;BA.debugLine="If varSingleLine = False Then Return Me";
if (_varsingleline==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 671;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 672;BA.debugLine="SetAttrSingle(\"single-line\", varSingleLine)";
_setattrsingle("single-line",BA.ObjectToString(_varsingleline));
 //BA.debugLineNum = 673;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 675;BA.debugLine="Dim pp As String = $\"${ID}SingleLine\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SingleLine");
 //BA.debugLineNum = 676;BA.debugLine="vue.SetStateSingle(pp, varSingleLine)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsingleline));
 //BA.debugLineNum = 677;BA.debugLine="FileInput.Bind(\":single-line\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":single-line",_pp);
 //BA.debugLineNum = 678;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setsmallchips(boolean _varsmallchips) throws Exception{
String _pp = "";
 //BA.debugLineNum = 682;BA.debugLine="Sub SetSmallChips(varSmallChips As Boolean) As VMF";
 //BA.debugLineNum = 683;BA.debugLine="If varSmallChips = False Then Return Me";
if (_varsmallchips==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 684;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 685;BA.debugLine="SetAttrSingle(\"small-chips\", varSmallChips)";
_setattrsingle("small-chips",BA.ObjectToString(_varsmallchips));
 //BA.debugLineNum = 686;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 688;BA.debugLine="Dim pp As String = $\"${ID}SmallChips\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SmallChips");
 //BA.debugLineNum = 689;BA.debugLine="vue.SetStateSingle(pp, varSmallChips)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsmallchips));
 //BA.debugLineNum = 690;BA.debugLine="FileInput.Bind(\":small-chips\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":small-chips",_pp);
 //BA.debugLineNum = 691;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 692;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setsolo(boolean _varsolo) throws Exception{
String _pp = "";
 //BA.debugLineNum = 695;BA.debugLine="Sub SetSolo(varSolo As Boolean) As VMFileInput";
 //BA.debugLineNum = 696;BA.debugLine="If varSolo = False Then Return Me";
if (_varsolo==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 697;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 698;BA.debugLine="SetAttrSingle(\"solo\", varSolo)";
_setattrsingle("solo",BA.ObjectToString(_varsolo));
 //BA.debugLineNum = 699;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 701;BA.debugLine="Dim pp As String = $\"${ID}Solo\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Solo");
 //BA.debugLineNum = 702;BA.debugLine="vue.SetStateSingle(pp, varSolo)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsolo));
 //BA.debugLineNum = 703;BA.debugLine="FileInput.Bind(\":solo\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":solo",_pp);
 //BA.debugLineNum = 704;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 705;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setsoloinverted(boolean _varsoloinverted) throws Exception{
String _pp = "";
 //BA.debugLineNum = 708;BA.debugLine="Sub SetSoloInverted(varSoloInverted As Boolean) As";
 //BA.debugLineNum = 709;BA.debugLine="If varSoloInverted = False Then Return Me";
if (_varsoloinverted==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 710;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 711;BA.debugLine="SetAttrSingle(\"solo-inverted\", varSoloInverted)";
_setattrsingle("solo-inverted",BA.ObjectToString(_varsoloinverted));
 //BA.debugLineNum = 712;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 714;BA.debugLine="Dim pp As String = $\"${ID}SoloInverted\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SoloInverted");
 //BA.debugLineNum = 715;BA.debugLine="vue.SetStateSingle(pp, varSoloInverted)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsoloinverted));
 //BA.debugLineNum = 716;BA.debugLine="FileInput.Bind(\":solo-inverted\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":solo-inverted",_pp);
 //BA.debugLineNum = 717;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 718;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 1041;BA.debugLine="Sub SetStatic(b As Boolean) As VMFileInput";
 //BA.debugLineNum = 1042;BA.debugLine="FileInput.SetStatic(b)";
_fileinput._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 1043;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 1044;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1045;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetStyle(sm As Map) As VMFileInput";
 //BA.debugLineNum = 128;BA.debugLine="FileInput.SetStyle(sm)";
_fileinput._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1060;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 1061;BA.debugLine="FileInput.SetStyleSingle(prop, value)";
_fileinput._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 1062;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1063;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setsuccess(boolean _varsuccess) throws Exception{
String _pp = "";
 //BA.debugLineNum = 721;BA.debugLine="Sub SetSuccess(varSuccess As Boolean) As VMFileInp";
 //BA.debugLineNum = 722;BA.debugLine="If varSuccess = False Then Return Me";
if (_varsuccess==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 723;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 724;BA.debugLine="SetAttrSingle(\"success\", varSuccess)";
_setattrsingle("success",BA.ObjectToString(_varsuccess));
 //BA.debugLineNum = 725;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 727;BA.debugLine="Dim pp As String = $\"${ID}Success\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Success");
 //BA.debugLineNum = 728;BA.debugLine="vue.SetStateSingle(pp, varSuccess)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsuccess));
 //BA.debugLineNum = 729;BA.debugLine="FileInput.Bind(\":success\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":success",_pp);
 //BA.debugLineNum = 730;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 731;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setsuccessmessages(anywheresoftware.b4a.objects.collections.List _varsuccessmessages) throws Exception{
String _pp = "";
 //BA.debugLineNum = 774;BA.debugLine="Sub SetSuccessMessages(varSuccessMessages As List)";
 //BA.debugLineNum = 775;BA.debugLine="If bStatic Then Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 776;BA.debugLine="Dim pp As String = $\"${ID}SuccessMessages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SuccessMessages");
 //BA.debugLineNum = 777;BA.debugLine="vue.SetStateSingle(pp, varSuccessMessages)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsuccessmessages.getObject()));
 //BA.debugLineNum = 778;BA.debugLine="FileInput.Bind(\":success-messages\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":success-messages",_pp);
 //BA.debugLineNum = 779;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 780;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setsuffix(String _varsuffix) throws Exception{
String _pp = "";
 //BA.debugLineNum = 342;BA.debugLine="Sub SetSuffix(varSuffix As String) As VMFileInput";
 //BA.debugLineNum = 343;BA.debugLine="If varSuffix = \"\" Then Return Me";
if ((_varsuffix).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 344;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 345;BA.debugLine="SetAttrSingle(\"suffix\", varSuffix)";
_setattrsingle("suffix",_varsuffix);
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 348;BA.debugLine="Dim pp As String = $\"${ID}Suffix\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Suffix");
 //BA.debugLineNum = 349;BA.debugLine="vue.SetStateSingle(pp, varSuffix)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsuffix));
 //BA.debugLineNum = 350;BA.debugLine="FileInput.Bind(\":suffix\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":suffix",_pp);
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 1048;BA.debugLine="Sub SetTabIndex(ti As String) As VMFileInput";
 //BA.debugLineNum = 1049;BA.debugLine="FileInput.SetTabIndex(ti)";
_fileinput._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 1050;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1051;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _settext(String _t) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetText(t As String) As VMFileInput";
 //BA.debugLineNum = 105;BA.debugLine="FileInput.SetText(t)";
_fileinput._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _settruncatelength(String _vartruncatelength) throws Exception{
String _pp = "";
 //BA.debugLineNum = 355;BA.debugLine="Sub SetTruncateLength(varTruncateLength As String)";
 //BA.debugLineNum = 356;BA.debugLine="If varTruncateLength = \"\" Then Return Me";
if ((_vartruncatelength).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 357;BA.debugLine="If varTruncateLength = \"22\" Then Return Me";
if ((_vartruncatelength).equals("22")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 358;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 359;BA.debugLine="SetAttrSingle(\"truncate-length\", varTruncateLeng";
_setattrsingle("truncate-length",_vartruncatelength);
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 362;BA.debugLine="Dim pp As String = $\"${ID}TruncateLength\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"TruncateLength");
 //BA.debugLineNum = 363;BA.debugLine="vue.SetStateSingle(pp, varTruncateLength)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartruncatelength));
 //BA.debugLineNum = 364;BA.debugLine="FileInput.Bind(\":truncate-length\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":truncate-length",_pp);
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _settype(String _vartype) throws Exception{
String _pp = "";
 //BA.debugLineNum = 369;BA.debugLine="Sub SetType(varType As String) As VMFileInput";
 //BA.debugLineNum = 370;BA.debugLine="If varType = \"\" Then Return Me";
if ((_vartype).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 371;BA.debugLine="If varType = \"file\" Then Return Me";
if ((_vartype).equals("file")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 372;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 373;BA.debugLine="SetAttrSingle(\"type\", varType)";
_setattrsingle("type",_vartype);
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 376;BA.debugLine="Dim pp As String = $\"${ID}Type\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Type");
 //BA.debugLineNum = 377;BA.debugLine="vue.SetStateSingle(pp, varType)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartype));
 //BA.debugLineNum = 378;BA.debugLine="FileInput.Bind(\":type\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":type",_pp);
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setvalidateonblur(boolean _varvalidateonblur) throws Exception{
String _pp = "";
 //BA.debugLineNum = 734;BA.debugLine="Sub SetValidateOnBlur(varValidateOnBlur As Boolean";
 //BA.debugLineNum = 735;BA.debugLine="If varValidateOnBlur = False Then Return Me";
if (_varvalidateonblur==__c.False) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 736;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 737;BA.debugLine="SetAttrSingle(\"validate-on-blur\", varValidateOnB";
_setattrsingle("validate-on-blur",BA.ObjectToString(_varvalidateonblur));
 //BA.debugLineNum = 738;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 740;BA.debugLine="Dim pp As String = $\"${ID}ValidateOnBlur\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ValidateOnBlur");
 //BA.debugLineNum = 741;BA.debugLine="vue.SetStateSingle(pp, varValidateOnBlur)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalidateonblur));
 //BA.debugLineNum = 742;BA.debugLine="FileInput.Bind(\":validate-on-blur\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":validate-on-blur",_pp);
 //BA.debugLineNum = 743;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 744;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setvalue(String _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 383;BA.debugLine="Sub SetValue(varValue As String) As VMFileInput";
 //BA.debugLineNum = 384;BA.debugLine="If varValue = \"\" Then Return Me";
if ((_varvalue).equals("")) { 
if (true) return (b4j.example.vmfileinput)(this);};
 //BA.debugLineNum = 385;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 386;BA.debugLine="SetAttrSingle(\"value\", varValue)";
_setattrsingle("value",_varvalue);
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 };
 //BA.debugLineNum = 389;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 390;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue));
 //BA.debugLineNum = 391;BA.debugLine="FileInput.Bind(\":value\", pp)";
_fileinput._bind /*b4j.example.vmelement*/ (":value",_pp);
 //BA.debugLineNum = 392;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 1077;BA.debugLine="Sub SetVElse(vif As String) As VMFileInput";
 //BA.debugLineNum = 1078;BA.debugLine="FileInput.SetVElse(vif)";
_fileinput._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 1079;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1080;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 1100;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 1101;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 1102;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 1103;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 1104;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 1105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 1087;BA.debugLine="Sub SetVhtml(vhtml As String) As VMFileInput";
 //BA.debugLineNum = 1088;BA.debugLine="FileInput.SetVHtml(vhtml)";
_fileinput._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 1089;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1090;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetVIf(vif As String) As VMFileInput";
 //BA.debugLineNum = 82;BA.debugLine="FileInput.SetVIf(vif)";
_fileinput._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 1157;BA.debugLine="Sub SetVisible(b As Boolean) As VMFileInput";
 //BA.debugLineNum = 1158;BA.debugLine="FileInput.SetVisible(b)";
_fileinput._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 1159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1160;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetVModel(k As String) As VMFileInput";
 //BA.debugLineNum = 77;BA.debugLine="FileInput.SetVModel(k)";
_fileinput._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetVShow(vif As String) As VMFileInput";
 //BA.debugLineNum = 87;BA.debugLine="FileInput.SetVShow(vif)";
_fileinput._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 1082;BA.debugLine="Sub SetVText(vhtml As String) As VMFileInput";
 //BA.debugLineNum = 1083;BA.debugLine="FileInput.SetVText(vhtml)";
_fileinput._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 1084;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 1085;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _show() throws Exception{
 //BA.debugLineNum = 958;BA.debugLine="Sub Show As VMFileInput";
 //BA.debugLineNum = 959;BA.debugLine="FileInput.SetVisible(True)";
_fileinput._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 960;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 961;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 66;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 67;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 68;BA.debugLine="Dim eName As String = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 69;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 70;BA.debugLine="Log($\"VMFileInput.${eName} event has not been de";
__c.Log(("VMFileInput."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 73;BA.debugLine="Return FileInput.ToString";
if (true) return _fileinput._tostring /*String*/ ();
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfileinput  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 990;BA.debugLine="Sub UseTheme(themeName As String) As VMFileInput";
 //BA.debugLineNum = 991;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 992;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 993;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 994;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 995;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 997;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfileinput)(this);
 //BA.debugLineNum = 998;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
