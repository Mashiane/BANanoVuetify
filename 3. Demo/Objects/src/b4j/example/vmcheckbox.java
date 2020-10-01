package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcheckbox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmcheckbox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcheckbox.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _checkbox = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public String _vmodel = "";
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
public b4j.example.vmcheckbox  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 214;BA.debugLine="Sub AddChild(child As VMElement) As VMCheckBox";
 //BA.debugLineNum = 215;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 216;BA.debugLine="CheckBox.SetText(childHTML)";
_checkbox._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 250;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 251;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 252;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcheckbox  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub AddClass(c As String) As VMCheckBox";
 //BA.debugLineNum = 233;BA.debugLine="CheckBox.AddClass(c)";
_checkbox._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 852;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 853;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 854;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcheckbox  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 800;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 801;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 802;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 803;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 804;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 856;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 857;BA.debugLine="CheckBox.BuildModel(mprops, mstyles, lclasses, loo";
_checkbox._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 858;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 859;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public CheckBox As VMElement";
_checkbox = new b4j.example.vmelement();
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
 //BA.debugLineNum = 10;BA.debugLine="Private vmodel As String";
_vmodel = "";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcheckbox  _disable() throws Exception{
 //BA.debugLineNum = 793;BA.debugLine="Sub Disable As VMCheckBox";
 //BA.debugLineNum = 794;BA.debugLine="CheckBox.Disable(True)";
_checkbox._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 795;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 796;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _enable() throws Exception{
 //BA.debugLineNum = 788;BA.debugLine="Sub Enable As VMCheckBox";
 //BA.debugLineNum = 789;BA.debugLine="CheckBox.Enable(True)";
_checkbox._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 790;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 791;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _hide() throws Exception{
 //BA.debugLineNum = 778;BA.debugLine="Sub Hide As VMCheckBox";
 //BA.debugLineNum = 779;BA.debugLine="CheckBox.SetVisible(False)";
_checkbox._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 780;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 781;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="CheckBox.Initialize(v, ID)";
_checkbox._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 17;BA.debugLine="CheckBox.SetTag(\"v-checkbox\")";
_checkbox._settag /*b4j.example.vmelement*/ ("v-checkbox");
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 21;BA.debugLine="CheckBox.typeOf = \"checkbox\"";
_checkbox._typeof /*String*/  = "checkbox";
 //BA.debugLineNum = 22;BA.debugLine="CheckBox.fieldType = \"bool\"";
_checkbox._fieldtype /*String*/  = "bool";
 //BA.debugLineNum = 23;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 24;BA.debugLine="vmodel = \"\"";
_vmodel = "";
 //BA.debugLineNum = 25;BA.debugLine="SetOnChange(Module, $\"${ID}_change\"$)";
_setonchange(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_change"));
 //BA.debugLineNum = 26;BA.debugLine="SetOnClick(Module, $\"${ID}_click\"$)";
_setonclick(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 228;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcheckbox  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 807;BA.debugLine="public Sub RemoveAttr(sName As String) As VMCheckB";
 //BA.debugLineNum = 808;BA.debugLine="CheckBox.RemoveAttr(sName)";
_checkbox._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 809;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 810;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub Render";
 //BA.debugLineNum = 210;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcheckbox  _setappendicon(String _varappendicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 257;BA.debugLine="Sub SetAppendIcon(varAppendIcon As String) As VMCh";
 //BA.debugLineNum = 258;BA.debugLine="If varAppendIcon= \"\" Then Return Me";
if ((_varappendicon).equals("")) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 259;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 260;BA.debugLine="SetAttrSingle(\"append-icon\", varAppendIcon)";
_setattrsingle("append-icon",_varappendicon);
 }else {
 //BA.debugLineNum = 262;BA.debugLine="Dim pp As String = $\"${ID}AppendIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AppendIcon");
 //BA.debugLineNum = 263;BA.debugLine="vue.SetStateSingle(pp, varAppendIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varappendicon));
 //BA.debugLineNum = 264;BA.debugLine="CheckBox.Bind(\":append-icon\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":append-icon",_pp);
 };
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub SetAttr(attr As Map) As VMCheckBox";
 //BA.debugLineNum = 239;BA.debugLine="CheckBox.SetAttr(attr)";
_checkbox._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 135;BA.debugLine="Sub SetAttributes(attrs As List) As VMCheckBox";
 //BA.debugLineNum = 136;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 137;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetAttrLoose(loose As String) As VMCheckBox";
 //BA.debugLineNum = 131;BA.debugLine="CheckBox.SetAttrLoose(loose)";
_checkbox._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 846;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 847;BA.debugLine="CheckBox.SetAttrSingle(prop, value)";
_checkbox._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 848;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 849;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setbackgroundcolor(String _varbackgroundcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 270;BA.debugLine="Sub SetBackgroundColor(varBackgroundColor As Strin";
 //BA.debugLineNum = 271;BA.debugLine="If varBackgroundColor = \"\" Then Return Me";
if ((_varbackgroundcolor).equals("")) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 272;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 273;BA.debugLine="SetAttrSingle(\"background-color\", varBackgroundC";
_setattrsingle("background-color",_varbackgroundcolor);
 }else {
 //BA.debugLineNum = 275;BA.debugLine="Dim pp As String = $\"${ID}BackgroundColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BackgroundColor");
 //BA.debugLineNum = 276;BA.debugLine="vue.SetStateSingle(pp, varBackgroundColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbackgroundcolor));
 //BA.debugLineNum = 277;BA.debugLine="CheckBox.Bind(\":background-color\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 };
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setbool() throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetBool As VMCheckBox";
 //BA.debugLineNum = 89;BA.debugLine="CheckBox.fieldType = \"bool\"";
_checkbox._fieldtype /*String*/  = "bool";
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 283;BA.debugLine="Sub SetColor(varColor As String) As VMCheckBox";
 //BA.debugLineNum = 284;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 285;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 286;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 }else {
 //BA.debugLineNum = 288;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 289;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 290;BA.debugLine="CheckBox.Bind(\":color\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":color",_pp);
 };
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 155;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 156;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 157;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 158;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 159;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 }else {
 //BA.debugLineNum = 161;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 162;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 163;BA.debugLine="CheckBox.Bind(\":color\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":color",_pp);
 };
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 296;BA.debugLine="Sub SetDark(varDark As Boolean) As VMCheckBox";
 //BA.debugLineNum = 297;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 298;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 299;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 }else {
 //BA.debugLineNum = 301;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 302;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 303;BA.debugLine="CheckBox.Bind(\":dark\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":dark",_pp);
 };
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 31;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setdense(boolean _vardense) throws Exception{
String _pp = "";
 //BA.debugLineNum = 309;BA.debugLine="Sub SetDense(varDense As Boolean) As VMCheckBox";
 //BA.debugLineNum = 310;BA.debugLine="If varDense = False Then Return Me";
if (_vardense==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 311;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 312;BA.debugLine="SetAttrSingle(\"dense\", varDense)";
_setattrsingle("dense",BA.ObjectToString(_vardense));
 }else {
 //BA.debugLineNum = 314;BA.debugLine="Dim pp As String = $\"${ID}Dense\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dense");
 //BA.debugLineNum = 315;BA.debugLine="vue.SetStateSingle(pp, varDense)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardense));
 //BA.debugLineNum = 316;BA.debugLine="CheckBox.Bind(\":dense\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":dense",_pp);
 };
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 823;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMCheckBox";
 //BA.debugLineNum = 824;BA.debugLine="CheckBox.SetDesignMode(b)";
_checkbox._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 825;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 826;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 827;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 107;BA.debugLine="CheckBox.SetDeviceOffsets(OS, OM, OL, OX)";
_checkbox._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 119;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 120;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 113;BA.debugLine="CheckBox.SetDeviceSizes(SS, SM, SL, SX)";
_checkbox._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMCheck";
 //BA.debugLineNum = 323;BA.debugLine="CheckBox.SetDisabled(varDisabled)";
_checkbox._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _seterror(boolean _varerror) throws Exception{
String _pp = "";
 //BA.debugLineNum = 328;BA.debugLine="Sub SetError(varError As Boolean) As VMCheckBox";
 //BA.debugLineNum = 329;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 330;BA.debugLine="SetAttrSingle(\"error\", varError)";
_setattrsingle("error",BA.ObjectToString(_varerror));
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 };
 //BA.debugLineNum = 333;BA.debugLine="Dim pp As String = $\"${vmodel}Error\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"Error");
 //BA.debugLineNum = 334;BA.debugLine="vue.SetStateSingle(pp, varError)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varerror));
 //BA.debugLineNum = 335;BA.debugLine="CheckBox.Bind(\":error\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":error",_pp);
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _seterrorcount(String _varerrorcount) throws Exception{
String _pp = "";
 //BA.debugLineNum = 340;BA.debugLine="Sub SetErrorCount(varErrorCount As String) As VMCh";
 //BA.debugLineNum = 341;BA.debugLine="If varErrorCount = \"\" Then Return Me";
if ((_varerrorcount).equals("")) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 342;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 343;BA.debugLine="SetAttrSingle(\"error-count\", varErrorCount)";
_setattrsingle("error-count",_varerrorcount);
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 };
 //BA.debugLineNum = 346;BA.debugLine="Dim pp As String = $\"${vmodel}ErrorCount\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"ErrorCount");
 //BA.debugLineNum = 347;BA.debugLine="vue.SetStateSingle(pp, varErrorCount)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varerrorcount));
 //BA.debugLineNum = 348;BA.debugLine="CheckBox.Bind(\":error-count\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":error-count",_pp);
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _seterrormessages(boolean _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _pp = "";
 //BA.debugLineNum = 353;BA.debugLine="Sub SetErrorMessages(b As Boolean) As VMCheckBox";
 //BA.debugLineNum = 354;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 355;BA.debugLine="Dim nl As List = vue.NewList";
_nl = new anywheresoftware.b4a.objects.collections.List();
_nl = _vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 356;BA.debugLine="Dim pp As String = $\"${vmodel}ErrorMessages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"ErrorMessages");
 //BA.debugLineNum = 357;BA.debugLine="vue.SetData(pp, nl)";
_vue._setdata /*b4j.example.bananovue*/ (_pp,(Object)(_nl.getObject()));
 //BA.debugLineNum = 358;BA.debugLine="CheckBox.Bind(\":error-messages\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":error-messages",_pp);
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setfalsevalue(String _varfalsevalue) throws Exception{
 //BA.debugLineNum = 363;BA.debugLine="Sub SetFalseValue(varFalseValue As String) As VMCh";
 //BA.debugLineNum = 364;BA.debugLine="SetAttrSingle(\"false-value\", varFalseValue)";
_setattrsingle("false-value",_varfalsevalue);
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setfieldtype(String _ft) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetFieldType(ft As String) As VMCheckBox";
 //BA.debugLineNum = 37;BA.debugLine="CheckBox.fieldType = ft";
_checkbox._fieldtype /*String*/  = _ft;
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setflat(boolean _varloading) throws Exception{
String _pp = "";
 //BA.debugLineNum = 478;BA.debugLine="Sub SetFlat(varLoading As Boolean) As VMCheckBox";
 //BA.debugLineNum = 479;BA.debugLine="If varLoading = False Then Return Me";
if (_varloading==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 480;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 481;BA.debugLine="SetAttrSingle(\"flat\", varLoading)";
_setattrsingle("flat",BA.ObjectToString(_varloading));
 }else {
 //BA.debugLineNum = 483;BA.debugLine="Dim pp As String = $\"${ID}flat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"flat");
 //BA.debugLineNum = 484;BA.debugLine="vue.SetStateSingle(pp, varLoading)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloading));
 //BA.debugLineNum = 485;BA.debugLine="CheckBox.Bind(\":flat\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":flat",_pp);
 };
 //BA.debugLineNum = 487;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 488;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _sethidedetails(boolean _varhidedetails) throws Exception{
String _pp = "";
 //BA.debugLineNum = 369;BA.debugLine="Sub SetHideDetails(varHideDetails As Boolean) As V";
 //BA.debugLineNum = 370;BA.debugLine="If varHideDetails = False Then Return Me";
if (_varhidedetails==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 371;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 372;BA.debugLine="SetAttrSingle(\"hide-details\", varHideDetails)";
_setattrsingle("hide-details",BA.ObjectToString(_varhidedetails));
 }else {
 //BA.debugLineNum = 374;BA.debugLine="Dim pp As String = $\"${ID}HideDetails\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideDetails");
 //BA.debugLineNum = 375;BA.debugLine="vue.SetStateSingle(pp, varHideDetails)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhidedetails));
 //BA.debugLineNum = 376;BA.debugLine="CheckBox.Bind(\":hide-details\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":hide-details",_pp);
 };
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _sethint(String _varhint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 382;BA.debugLine="Sub SetHint(varHint As String) As VMCheckBox";
 //BA.debugLineNum = 383;BA.debugLine="If varHint = \"\" Then Return Me";
if ((_varhint).equals("")) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 384;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 385;BA.debugLine="SetAttrSingle(\"hint\", varHint)";
_setattrsingle("hint",_varhint);
 }else {
 //BA.debugLineNum = 387;BA.debugLine="Dim pp As String = $\"${ID}Hint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Hint");
 //BA.debugLineNum = 388;BA.debugLine="vue.SetStateSingle(pp, varHint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhint));
 //BA.debugLineNum = 389;BA.debugLine="CheckBox.Bind(\":hint\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":hint",_pp);
 };
 //BA.debugLineNum = 391;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setid(Object _varid) throws Exception{
String _pp = "";
 //BA.debugLineNum = 395;BA.debugLine="Sub SetId(varId As Object) As VMCheckBox";
 //BA.debugLineNum = 396;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 397;BA.debugLine="SetAttrSingle(\"id\", varId)";
_setattrsingle("id",BA.ObjectToString(_varid));
 }else {
 //BA.debugLineNum = 399;BA.debugLine="Dim pp As String = $\"${ID}Id\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Id");
 //BA.debugLineNum = 400;BA.debugLine="vue.SetStateSingle(pp, varId)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varid);
 //BA.debugLineNum = 401;BA.debugLine="CheckBox.Bind(\":id\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":id",_pp);
 };
 //BA.debugLineNum = 403;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setindeterminate(boolean _varindeterminate) throws Exception{
String _pp = "";
 //BA.debugLineNum = 407;BA.debugLine="Sub SetIndeterminate(varIndeterminate As Boolean)";
 //BA.debugLineNum = 408;BA.debugLine="If varIndeterminate = False Then Return Me";
if (_varindeterminate==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 409;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 410;BA.debugLine="SetAttrSingle(\"indeterminate\", varIndeterminate)";
_setattrsingle("indeterminate",BA.ObjectToString(_varindeterminate));
 }else {
 //BA.debugLineNum = 412;BA.debugLine="Dim pp As String = $\"${ID}Indeterminate\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Indeterminate");
 //BA.debugLineNum = 413;BA.debugLine="vue.SetStateSingle(pp, varIndeterminate)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varindeterminate));
 //BA.debugLineNum = 414;BA.debugLine="CheckBox.Bind(\":indeterminate\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":indeterminate",_pp);
 };
 //BA.debugLineNum = 416;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 417;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setindeterminateicon(String _varindeterminateicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 420;BA.debugLine="Sub SetIndeterminateIcon(varIndeterminateIcon As S";
 //BA.debugLineNum = 421;BA.debugLine="If varIndeterminateIcon = \"\" Then Return Me";
if ((_varindeterminateicon).equals("")) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 422;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 423;BA.debugLine="SetAttrSingle(\"indeterminate-icon\", varIndetermi";
_setattrsingle("indeterminate-icon",_varindeterminateicon);
 }else {
 //BA.debugLineNum = 425;BA.debugLine="Dim pp As String = $\"${ID}IndeterminateIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"IndeterminateIcon");
 //BA.debugLineNum = 426;BA.debugLine="vue.SetStateSingle(pp, varIndeterminateIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varindeterminateicon));
 //BA.debugLineNum = 427;BA.debugLine="CheckBox.Bind(\":indeterminate-icon\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":indeterminate-icon",_pp);
 };
 //BA.debugLineNum = 429;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 430;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setinputvalue(Object _varinputvalue) throws Exception{
 //BA.debugLineNum = 433;BA.debugLine="Sub SetInputValue(varInputValue As Object) As VMCh";
 //BA.debugLineNum = 434;BA.debugLine="SetAttrSingle(\"input-value\", varInputValue)";
_setattrsingle("input-value",BA.ObjectToString(_varinputvalue));
 //BA.debugLineNum = 435;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setinset(boolean _varinset) throws Exception{
String _pp = "";
 //BA.debugLineNum = 42;BA.debugLine="Sub SetInset(varInset As Boolean) As VMCheckBox";
 //BA.debugLineNum = 43;BA.debugLine="If varInset = False Then Return Me";
if (_varinset==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 44;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 45;BA.debugLine="SetAttrSingle(\"inset\", varInset)";
_setattrsingle("inset",BA.ObjectToString(_varinset));
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 };
 //BA.debugLineNum = 48;BA.debugLine="Dim pp As String = $\"${ID}Inset\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Inset");
 //BA.debugLineNum = 49;BA.debugLine="vue.SetStateSingle(pp, varInset)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varinset));
 //BA.debugLineNum = 50;BA.debugLine="CheckBox.Bind(\":inset\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":inset",_pp);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setint() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetInt As VMCheckBox";
 //BA.debugLineNum = 94;BA.debugLine="CheckBox.fieldType = \"int\"";
_checkbox._fieldtype /*String*/  = "int";
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setlabel(String _varlabel) throws Exception{
String _pp = "";
 //BA.debugLineNum = 439;BA.debugLine="Sub SetLabel(varLabel As String) As VMCheckBox";
 //BA.debugLineNum = 440;BA.debugLine="If varLabel = \"\" Then Return Me";
if ((_varlabel).equals("")) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 441;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 442;BA.debugLine="SetAttrSingle(\"label\", varLabel)";
_setattrsingle("label",_varlabel);
 }else {
 //BA.debugLineNum = 444;BA.debugLine="Dim pp As String = $\"${ID}Label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Label");
 //BA.debugLineNum = 445;BA.debugLine="vue.SetStateSingle(pp, varLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlabel));
 //BA.debugLineNum = 446;BA.debugLine="CheckBox.Bind(\":label\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":label",_pp);
 };
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 452;BA.debugLine="Sub SetLight(varLight As Boolean) As VMCheckBox";
 //BA.debugLineNum = 453;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 454;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 455;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 }else {
 //BA.debugLineNum = 457;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 458;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 459;BA.debugLine="CheckBox.Bind(\":light\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":light",_pp);
 };
 //BA.debugLineNum = 461;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setloading(String _varloading) throws Exception{
String _pp = "";
 //BA.debugLineNum = 465;BA.debugLine="Sub SetLoading(varLoading As String) As VMCheckBox";
 //BA.debugLineNum = 466;BA.debugLine="If varLoading = \"\" Then Return Me";
if ((_varloading).equals("")) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 467;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 468;BA.debugLine="SetAttrSingle(\"loading\", varLoading)";
_setattrsingle("loading",_varloading);
 }else {
 //BA.debugLineNum = 470;BA.debugLine="Dim pp As String = $\"${ID}Loading\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Loading");
 //BA.debugLineNum = 471;BA.debugLine="vue.SetStateSingle(pp, varLoading)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloading));
 //BA.debugLineNum = 472;BA.debugLine="CheckBox.Bind(\":loading\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":loading",_pp);
 };
 //BA.debugLineNum = 474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 818;BA.debugLine="Sub SetMarginAll(p As String) As VMCheckBox";
 //BA.debugLineNum = 819;BA.debugLine="CheckBox.setmarginall(p)";
_checkbox._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 820;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 821;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setmessages(Object _varmessages) throws Exception{
String _pp = "";
 //BA.debugLineNum = 493;BA.debugLine="Sub SetMessages(varMessages As Object) As VMCheckB";
 //BA.debugLineNum = 494;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 495;BA.debugLine="SetAttrSingle(\"messages\", varMessages)";
_setattrsingle("messages",BA.ObjectToString(_varmessages));
 }else {
 //BA.debugLineNum = 497;BA.debugLine="Dim pp As String = $\"${ID}Messages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Messages");
 //BA.debugLineNum = 498;BA.debugLine="vue.SetStateSingle(pp, varMessages)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmessages);
 //BA.debugLineNum = 499;BA.debugLine="CheckBox.Bind(\":messages\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":messages",_pp);
 };
 //BA.debugLineNum = 501;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 502;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setmultiple(boolean _varmultiple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 505;BA.debugLine="Sub SetMultiple(varMultiple As Boolean) As VMCheck";
 //BA.debugLineNum = 506;BA.debugLine="If varMultiple = False Then Return Me";
if (_varmultiple==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 507;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 508;BA.debugLine="SetAttrSingle(\"multiple\", varMultiple)";
_setattrsingle("multiple",BA.ObjectToString(_varmultiple));
 }else {
 //BA.debugLineNum = 510;BA.debugLine="Dim pp As String = $\"${ID}Multiple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Multiple");
 //BA.debugLineNum = 511;BA.debugLine="vue.SetStateSingle(pp, varMultiple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmultiple));
 //BA.debugLineNum = 512;BA.debugLine="CheckBox.Bind(\":multiple\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":multiple",_pp);
 };
 //BA.debugLineNum = 514;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 835;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 836;BA.debugLine="CheckBox.SetName(varName, bbind)";
_checkbox._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 837;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 838;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setofficon(String _varofficon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 518;BA.debugLine="Sub SetOffIcon(varOffIcon As String) As VMCheckBox";
 //BA.debugLineNum = 519;BA.debugLine="If varOffIcon = \"\" Then Return Me";
if ((_varofficon).equals("")) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 520;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 521;BA.debugLine="SetAttrSingle(\"off-icon\", varOffIcon)";
_setattrsingle("off-icon",_varofficon);
 }else {
 //BA.debugLineNum = 523;BA.debugLine="Dim pp As String = $\"${ID}OffIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OffIcon");
 //BA.debugLineNum = 524;BA.debugLine="vue.SetStateSingle(pp, varOffIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varofficon));
 //BA.debugLineNum = 525;BA.debugLine="CheckBox.Bind(\":off-icon\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":off-icon",_pp);
 };
 //BA.debugLineNum = 527;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 528;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setonchange(Object _eventhandler,String _methodname) throws Exception{
Object _value = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 881;BA.debugLine="Sub SetOnChange(eventHandler As Object, methodName";
 //BA.debugLineNum = 882;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 883;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 884;BA.debugLine="Dim value As Object";
_value = new Object();
 //BA.debugLineNum = 885;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_value}))));
 //BA.debugLineNum = 886;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 888;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 889;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 890;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setonclick(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 694;BA.debugLine="Sub SetOnClick(eventHandler As Object, methodName";
 //BA.debugLineNum = 695;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 696;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 697;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 698;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 699;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 701;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 702;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 703;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setonclickappend(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 706;BA.debugLine="Sub SetOnClickAppend(eventHandler As Object, metho";
 //BA.debugLineNum = 707;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 708;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 709;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 710;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 711;BA.debugLine="SetAttr(CreateMap(\"@click:append\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:append"),(Object)(_methodname)}));
 //BA.debugLineNum = 713;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 714;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 715;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setonclickprepend(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 718;BA.debugLine="Sub SetOnClickPrepend(methodName As String) As VMC";
 //BA.debugLineNum = 719;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 720;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 721;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 722;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 723;BA.debugLine="SetAttr(CreateMap(\"@click:prepend\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:prepend"),(Object)(_methodname)}));
 //BA.debugLineNum = 725;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 726;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 727;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setonicon(String _varonicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 531;BA.debugLine="Sub SetOnIcon(varOnIcon As String) As VMCheckBox";
 //BA.debugLineNum = 532;BA.debugLine="If varOnIcon = \"\" Then Return Me";
if ((_varonicon).equals("")) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 533;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 534;BA.debugLine="SetAttrSingle(\"on-icon\", varOnIcon)";
_setattrsingle("on-icon",_varonicon);
 }else {
 //BA.debugLineNum = 536;BA.debugLine="Dim pp As String = $\"${ID}OnIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OnIcon");
 //BA.debugLineNum = 537;BA.debugLine="vue.SetStateSingle(pp, varOnIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varonicon));
 //BA.debugLineNum = 538;BA.debugLine="CheckBox.Bind(\":on-icon\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":on-icon",_pp);
 };
 //BA.debugLineNum = 540;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 541;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setonmousedown(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 730;BA.debugLine="Sub SetOnMousedown(methodName As String) As VMChec";
 //BA.debugLineNum = 731;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 732;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 733;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 734;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 735;BA.debugLine="SetAttr(CreateMap(\"@mousedown\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mousedown"),(Object)(_methodname)}));
 //BA.debugLineNum = 737;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 738;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 739;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setonmouseup(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 742;BA.debugLine="Sub SetOnMouseup(methodName As String) As VMCheckB";
 //BA.debugLineNum = 743;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 744;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 745;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 746;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 747;BA.debugLine="SetAttr(CreateMap(\"@mouseup\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mouseup"),(Object)(_methodname)}));
 //BA.debugLineNum = 749;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 750;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 751;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setonupdateerror(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 754;BA.debugLine="Sub SetOnUpdateError(methodName As String) As VMCh";
 //BA.debugLineNum = 755;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 756;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 757;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 758;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 759;BA.debugLine="SetAttr(CreateMap(\"@update:error\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:error"),(Object)(_methodname)}));
 //BA.debugLineNum = 761;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 762;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 763;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setonupdateindeterminate(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 766;BA.debugLine="Sub SetOnUpdateIndeterminate(methodName As String)";
 //BA.debugLineNum = 767;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 768;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 769;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 770;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 771;BA.debugLine="SetAttr(CreateMap(\"@update:indeterminate\": method";
_setattr(__c.createMap(new Object[] {(Object)("@update:indeterminate"),(Object)(_methodname)}));
 //BA.debugLineNum = 773;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 774;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 775;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 813;BA.debugLine="Sub SetPaddingAll(p As String) As VMCheckBox";
 //BA.debugLineNum = 814;BA.debugLine="CheckBox.SetPaddingAll(p)";
_checkbox._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 815;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 816;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setpersistenthint(boolean _varpersistenthint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 544;BA.debugLine="Sub SetPersistentHint(varPersistentHint As Boolean";
 //BA.debugLineNum = 545;BA.debugLine="If varPersistentHint = False Then Return Me";
if (_varpersistenthint==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 546;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 547;BA.debugLine="SetAttrSingle(\"persistent-hint\", varPersistentHi";
_setattrsingle("persistent-hint",BA.ObjectToString(_varpersistenthint));
 }else {
 //BA.debugLineNum = 549;BA.debugLine="Dim pp As String = $\"${ID}PersistentHint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PersistentHint");
 //BA.debugLineNum = 550;BA.debugLine="vue.SetStateSingle(pp, varPersistentHint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpersistenthint));
 //BA.debugLineNum = 551;BA.debugLine="CheckBox.Bind(\":persistent-hint\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":persistent-hint",_pp);
 };
 //BA.debugLineNum = 553;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 554;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setprepedicon(String _varprepedicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 557;BA.debugLine="Sub SetPrepedIcon(varPrepedIcon As String) As VMCh";
 //BA.debugLineNum = 558;BA.debugLine="If varPrepedIcon = \"\" Then Return Me";
if ((_varprepedicon).equals("")) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 559;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 560;BA.debugLine="SetAttrSingle(\"prepend-icon\", varPrepedIcon)";
_setattrsingle("prepend-icon",_varprepedicon);
 }else {
 //BA.debugLineNum = 562;BA.debugLine="Dim pp As String = $\"${ID}PrepedIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrepedIcon");
 //BA.debugLineNum = 563;BA.debugLine="vue.SetStateSingle(pp, varPrepedIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprepedicon));
 //BA.debugLineNum = 564;BA.debugLine="CheckBox.Bind(\":prepend-icon\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":prepend-icon",_pp);
 };
 //BA.debugLineNum = 566;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 567;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetPrimary(b As Boolean) As VMCheckBox";
 //BA.debugLineNum = 125;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 126;BA.debugLine="SetColor(\"primary\")";
_setcolor("primary");
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMChe";
 //BA.debugLineNum = 101;BA.debugLine="CheckBox.SetRC(sRow, sCol)";
_checkbox._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setreadonly(boolean _varreadonly) throws Exception{
String _pp = "";
 //BA.debugLineNum = 570;BA.debugLine="Sub SetReadonly(varReadonly As Boolean) As VMCheck";
 //BA.debugLineNum = 571;BA.debugLine="If varReadonly = False Then Return Me";
if (_varreadonly==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 572;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 573;BA.debugLine="SetAttrSingle(\"readonly\", varReadonly)";
_setattrsingle("readonly",BA.ObjectToString(_varreadonly));
 }else {
 //BA.debugLineNum = 575;BA.debugLine="Dim pp As String = $\"${ID}Readonly\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Readonly");
 //BA.debugLineNum = 576;BA.debugLine="vue.SetStateSingle(pp, varReadonly)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreadonly));
 //BA.debugLineNum = 577;BA.debugLine="CheckBox.Bind(\":readonly\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":readonly",_pp);
 };
 //BA.debugLineNum = 579;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 580;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setrequired(boolean _varrequired) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMCheck";
 //BA.debugLineNum = 171;BA.debugLine="If varRequired = False Then Return Me";
if (_varrequired==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 172;BA.debugLine="CheckBox.SetRequired(varRequired)";
_checkbox._setrequired /*b4j.example.vmelement*/ (_varrequired);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setripple(boolean _varripple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 583;BA.debugLine="Sub SetRipple(varRipple As Boolean) As VMCheckBox";
 //BA.debugLineNum = 584;BA.debugLine="If varRipple = False Then Return Me";
if (_varripple==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 585;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 586;BA.debugLine="SetAttrSingle(\"ripple\", varRipple)";
_setattrsingle("ripple",BA.ObjectToString(_varripple));
 }else {
 //BA.debugLineNum = 588;BA.debugLine="Dim pp As String = $\"${ID}Ripple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Ripple");
 //BA.debugLineNum = 589;BA.debugLine="vue.SetStateSingle(pp, varRipple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varripple));
 //BA.debugLineNum = 590;BA.debugLine="CheckBox.Bind(\":ripple\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":ripple",_pp);
 };
 //BA.debugLineNum = 592;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 593;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setrules(boolean _varrules) throws Exception{
String _pp = "";
 //BA.debugLineNum = 596;BA.debugLine="Sub SetRules(varRules As Boolean) As VMCheckBox";
 //BA.debugLineNum = 597;BA.debugLine="If varRules = False Then Return Me";
if (_varrules==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 598;BA.debugLine="If bStatic Then Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 599;BA.debugLine="If DesignMode Then Return Me";
if (_designmode) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 600;BA.debugLine="Dim pp As String = $\"${vmodel}Rules\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"Rules");
 //BA.debugLineNum = 601;BA.debugLine="CheckBox.Bind(\":rules\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":rules",_pp);
 //BA.debugLineNum = 602;BA.debugLine="vue.SetData(pp, vue.NewList)";
_vue._setdata /*b4j.example.bananovue*/ (_pp,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 603;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 604;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setslotappend(boolean _b) throws Exception{
 //BA.debugLineNum = 670;BA.debugLine="Sub SetSlotAppend(b As Boolean) As VMCheckBox    '";
 //BA.debugLineNum = 671;BA.debugLine="SetAttr(CreateMap(\"slot\": \"append\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("append")}));
 //BA.debugLineNum = 672;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 673;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setslotlabel(boolean _b) throws Exception{
 //BA.debugLineNum = 676;BA.debugLine="Sub SetSlotLabel(b As Boolean) As VMCheckBox    'i";
 //BA.debugLineNum = 677;BA.debugLine="SetAttr(CreateMap(\"slot\": \"label\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("label")}));
 //BA.debugLineNum = 678;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setslotmessage(boolean _b) throws Exception{
 //BA.debugLineNum = 682;BA.debugLine="Sub SetSlotMessage(b As Boolean) As VMCheckBox";
 //BA.debugLineNum = 683;BA.debugLine="SetAttr(CreateMap(\"slot\": \"message\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("message")}));
 //BA.debugLineNum = 684;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 685;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setslotprepend(boolean _b) throws Exception{
 //BA.debugLineNum = 688;BA.debugLine="Sub SetSlotPrepend(b As Boolean) As VMCheckBox";
 //BA.debugLineNum = 689;BA.debugLine="SetAttr(CreateMap(\"slot\": \"prepend\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("prepend")}));
 //BA.debugLineNum = 690;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetStatic(b As Boolean) As VMCheckBox";
 //BA.debugLineNum = 67;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 68;BA.debugLine="CheckBox.SetStatic(b)";
_checkbox._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setstring() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetString As VMCheckBox";
 //BA.debugLineNum = 84;BA.debugLine="CheckBox.fieldType = \"string\"";
_checkbox._fieldtype /*String*/  = "string";
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub SetStyle(sm As Map) As VMCheckBox";
 //BA.debugLineNum = 245;BA.debugLine="CheckBox.SetStyle(sm)";
_checkbox._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 841;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 842;BA.debugLine="CheckBox.SetStyleSingle(prop, value)";
_checkbox._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 843;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 844;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setsuccess(boolean _varsuccess) throws Exception{
String _pp = "";
 //BA.debugLineNum = 607;BA.debugLine="Sub SetSuccess(varSuccess As Boolean) As VMCheckBo";
 //BA.debugLineNum = 608;BA.debugLine="If varSuccess = False Then Return Me";
if (_varsuccess==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 609;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 610;BA.debugLine="SetAttrSingle(\"success\", varSuccess)";
_setattrsingle("success",BA.ObjectToString(_varsuccess));
 }else {
 //BA.debugLineNum = 612;BA.debugLine="Dim pp As String = $\"${ID}Success\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Success");
 //BA.debugLineNum = 613;BA.debugLine="vue.SetStateSingle(pp, varSuccess)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsuccess));
 //BA.debugLineNum = 614;BA.debugLine="CheckBox.Bind(\":success\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":success",_pp);
 };
 //BA.debugLineNum = 616;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 617;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setsuccessmessages(Object _varsuccessmessages) throws Exception{
String _pp = "";
 //BA.debugLineNum = 620;BA.debugLine="Sub SetSuccessMessages(varSuccessMessages As Objec";
 //BA.debugLineNum = 621;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 622;BA.debugLine="SetAttrSingle(\"success-messages\", varSuccessMess";
_setattrsingle("success-messages",BA.ObjectToString(_varsuccessmessages));
 }else {
 //BA.debugLineNum = 624;BA.debugLine="Dim pp As String = $\"${ID}SuccessMessages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SuccessMessages");
 //BA.debugLineNum = 625;BA.debugLine="vue.SetStateSingle(pp, varSuccessMessages)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varsuccessmessages);
 //BA.debugLineNum = 626;BA.debugLine="CheckBox.Bind(\":success-messages\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":success-messages",_pp);
 };
 //BA.debugLineNum = 628;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 629;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setswitch() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetSwitch As VMCheckBox";
 //BA.debugLineNum = 55;BA.debugLine="CheckBox.SetTag(\"v-switch\")";
_checkbox._settag /*b4j.example.vmelement*/ ("v-switch");
 //BA.debugLineNum = 56;BA.debugLine="CheckBox.typeOf = \"switchbox\"";
_checkbox._typeof /*String*/  = "switchbox";
 //BA.debugLineNum = 57;BA.debugLine="CheckBox.fieldType = \"bool\"";
_checkbox._fieldtype /*String*/  = "bool";
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 829;BA.debugLine="Sub SetTabIndex(ti As String) As VMCheckBox";
 //BA.debugLineNum = 830;BA.debugLine="CheckBox.SetTabIndex(ti)";
_checkbox._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 831;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 832;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _settag(String _stag) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetTag(sTag As String) As VMCheckBox";
 //BA.debugLineNum = 62;BA.debugLine="CheckBox.SetTag(sTag)";
_checkbox._settag /*b4j.example.vmelement*/ (_stag);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SetText(t As Object) As VMCheckBox";
 //BA.debugLineNum = 222;BA.debugLine="CheckBox.SetText(t)";
_checkbox._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 864;BA.debugLine="Sub SetTextColor(varColor As String) As VMCheckBox";
 //BA.debugLineNum = 865;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 866;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 867;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 868;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 869;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 872;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 873;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 874;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 875;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 876;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 877;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 878;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 879;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _settruevalue(String _vartruevalue) throws Exception{
 //BA.debugLineNum = 632;BA.debugLine="Sub SetTrueValue(varTrueValue As String) As VMChec";
 //BA.debugLineNum = 633;BA.debugLine="SetAttrSingle(\"true-value\", varTrueValue)";
_setattrsingle("true-value",_vartruevalue);
 //BA.debugLineNum = 634;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 635;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setuncheckedvalue(Object _suncheckedvalue) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetUncheckedValue(suncheckedValue As Object) A";
 //BA.debugLineNum = 73;BA.debugLine="CheckBox.SetUncheckedValue(suncheckedValue)";
_checkbox._setuncheckedvalue /*b4j.example.vmelement*/ (_suncheckedvalue);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setvalidateonblur(boolean _varvalidateonblur) throws Exception{
String _pp = "";
 //BA.debugLineNum = 638;BA.debugLine="Sub SetValidateOnBlur(varValidateOnBlur As Boolean";
 //BA.debugLineNum = 639;BA.debugLine="If varValidateOnBlur = False Then Return Me";
if (_varvalidateonblur==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
 //BA.debugLineNum = 640;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 641;BA.debugLine="SetAttrSingle(\"validate-on-blur\", varValidateOnB";
_setattrsingle("validate-on-blur",BA.ObjectToString(_varvalidateonblur));
 }else {
 //BA.debugLineNum = 643;BA.debugLine="Dim pp As String = $\"${ID}ValidateOnBlur\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ValidateOnBlur");
 //BA.debugLineNum = 644;BA.debugLine="vue.SetStateSingle(pp, varValidateOnBlur)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalidateonblur));
 //BA.debugLineNum = 645;BA.debugLine="CheckBox.Bind(\":validate-on-blur\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":validate-on-blur",_pp);
 };
 //BA.debugLineNum = 647;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 648;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 651;BA.debugLine="Sub SetValue(varValue As String) As VMCheckBox";
 //BA.debugLineNum = 652;BA.debugLine="CheckBox.SetValue(varValue,False)";
_checkbox._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 653;BA.debugLine="vue.SetData(vmodel, varValue)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(_varvalue));
 //BA.debugLineNum = 654;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 655;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setvaluecomparator(Object _varvaluecomparator) throws Exception{
String _pp = "";
 //BA.debugLineNum = 658;BA.debugLine="Sub SetValueComparator(varValueComparator As Objec";
 //BA.debugLineNum = 659;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 660;BA.debugLine="SetAttrSingle(\"value-comparator\", varValueCompar";
_setattrsingle("value-comparator",BA.ObjectToString(_varvaluecomparator));
 }else {
 //BA.debugLineNum = 662;BA.debugLine="Dim pp As String = $\"${ID}ValueComparator\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ValueComparator");
 //BA.debugLineNum = 663;BA.debugLine="vue.SetStateSingle(pp, varValueComparator)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varvaluecomparator);
 //BA.debugLineNum = 664;BA.debugLine="CheckBox.Bind(\":value-comparator\", pp)";
_checkbox._bind /*b4j.example.vmelement*/ (":value-comparator",_pp);
 };
 //BA.debugLineNum = 666;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 667;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetVIf(vif As String) As VMCheckBox";
 //BA.debugLineNum = 199;BA.debugLine="CheckBox.SetVIf(vif)";
_checkbox._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetVisible(b As Boolean) As VMCheckBox";
 //BA.debugLineNum = 79;BA.debugLine="CheckBox.SetVisible(b)";
_checkbox._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetVModel(k As String) As VMCheckBox";
 //BA.debugLineNum = 193;BA.debugLine="vmodel = k.tolowercase";
_vmodel = _k.toLowerCase();
 //BA.debugLineNum = 194;BA.debugLine="CheckBox.SetVModel(k)";
_checkbox._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetVShow(vif As String) As VMCheckBox";
 //BA.debugLineNum = 204;BA.debugLine="CheckBox.SetVShow(vif)";
_checkbox._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _show() throws Exception{
 //BA.debugLineNum = 783;BA.debugLine="Sub Show As VMCheckBox";
 //BA.debugLineNum = 784;BA.debugLine="CheckBox.SetVisible(True)";
_checkbox._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 785;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 786;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 178;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 179;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 180;BA.debugLine="Dim eName As String = $\"${ID}_click\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_click");
 //BA.debugLineNum = 181;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 182;BA.debugLine="Log($\"VMCheckBox.${eName} event has not been def";
__c.Log(("VMCheckBox."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 //BA.debugLineNum = 184;BA.debugLine="eName = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 185;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 186;BA.debugLine="Log($\"VMCheckBox.${eName} event has not been def";
__c.Log(("VMCheckBox."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 189;BA.debugLine="Return CheckBox.ToString";
if (true) return _checkbox._tostring /*String*/ ();
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcheckbox  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 143;BA.debugLine="Sub UseTheme(themeName As String) As VMCheckBox";
 //BA.debugLineNum = 144;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 145;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 146;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 147;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 148;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
