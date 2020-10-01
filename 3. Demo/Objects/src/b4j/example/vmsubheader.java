package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmsubheader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmsubheader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmsubheader.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _subheader = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
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
public b4j.example.vmsubheader  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 52;BA.debugLine="Sub AddChild(child As VMElement) As VMSubHeader";
 //BA.debugLineNum = 53;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 54;BA.debugLine="SubHeader.SetText(childHTML)";
_subheader._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 88;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 89;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 90;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsubheader  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub AddClass(c As String) As VMSubHeader";
 //BA.debugLineNum = 71;BA.debugLine="SubHeader.AddClass(c)";
_subheader._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 152;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 153;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 235;BA.debugLine="SubHeader.BindStyleSingle(prop, value)";
_subheader._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 273;BA.debugLine="SubHeader.BuildModel(mprops, mstyles, lclasses, lo";
_subheader._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public SubHeader As VMElement";
_subheader = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean   'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsubheader  _disable() throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub Disable As VMSubHeader";
 //BA.debugLineNum = 145;BA.debugLine="SubHeader.Disable(True)";
_subheader._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _enable() throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub Enable As VMSubHeader";
 //BA.debugLineNum = 139;BA.debugLine="SubHeader.Enable(True)";
_subheader._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _hide() throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub Hide As VMSubHeader";
 //BA.debugLineNum = 127;BA.debugLine="SubHeader.SetVisible(False)";
_subheader._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue) As VMSubHead";
 //BA.debugLineNum = 12;BA.debugLine="SubHeader.Initialize(v, ID)";
_subheader._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 13;BA.debugLine="SubHeader.SetTag(\"v-subheader\")";
_subheader._settag /*b4j.example.vmelement*/ ("v-subheader");
 //BA.debugLineNum = 14;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 15;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 66;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsubheader  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="public Sub RemoveAttr(sName As String) As VMSubHea";
 //BA.debugLineNum = 186;BA.debugLine="SubHeader.RemoveAttr(sName)";
_subheader._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub Render";
 //BA.debugLineNum = 48;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsubheader  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetAttr(attr As Map) As VMSubHeader";
 //BA.debugLineNum = 77;BA.debugLine="SubHeader.SetAttr(attr)";
_subheader._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 250;BA.debugLine="Sub SetAttributes(attrs As List) As VMSubHeader";
 //BA.debugLineNum = 251;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 252;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetAttrLoose(loose As String) As VMSubHeader";
 //BA.debugLineNum = 159;BA.debugLine="SubHeader.SetAttrLoose(loose)";
_subheader._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 229;BA.debugLine="SubHeader.SetAttrSingle(prop, value)";
_subheader._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 176;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 177;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 178;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 179;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 180;BA.debugLine="SubHeader.Bind(\":color\", pp)";
_subheader._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setdark(Object _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 95;BA.debugLine="Sub SetDark(varDark As Object) As VMSubHeader";
 //BA.debugLineNum = 96;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 97;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vardark);
 //BA.debugLineNum = 98;BA.debugLine="SubHeader.Bind(\":dark\", pp)";
_subheader._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 35;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMSubHeader";
 //BA.debugLineNum = 204;BA.debugLine="SubHeader.SetDesignMode(b)";
_subheader._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 205;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setinset(Object _varinset) throws Exception{
String _pp = "";
 //BA.debugLineNum = 109;BA.debugLine="Sub SetInset(varInset As Object) As VMSubHeader";
 //BA.debugLineNum = 110;BA.debugLine="Dim pp As String = $\"${ID}Inset\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Inset");
 //BA.debugLineNum = 111;BA.debugLine="vue.SetStateSingle(pp, varInset)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varinset);
 //BA.debugLineNum = 112;BA.debugLine="SubHeader.Bind(\":inset\", pp)";
_subheader._bind /*b4j.example.vmelement*/ (":inset",_pp);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub SetKey(k As String) As VMSubHeader";
 //BA.debugLineNum = 267;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 268;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setlight(Object _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 117;BA.debugLine="Sub SetLight(varLight As Object) As VMSubHeader";
 //BA.debugLineNum = 118;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 119;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varlight);
 //BA.debugLineNum = 120;BA.debugLine="SubHeader.Bind(\":light\", pp)";
_subheader._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetMarginAll(p As String) As VMSubHeader";
 //BA.debugLineNum = 198;BA.debugLine="SubHeader.setmarginall(p)";
_subheader._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 217;BA.debugLine="SubHeader.SetName(varName, bbind)";
_subheader._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetPaddingAll(p As String) As VMSubHeader";
 //BA.debugLineNum = 192;BA.debugLine="SubHeader.SetPaddingAll(p)";
_subheader._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetStyle(sm As Map) As VMSubHeader";
 //BA.debugLineNum = 83;BA.debugLine="SubHeader.SetStyle(sm)";
_subheader._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 223;BA.debugLine="SubHeader.SetStyleSingle(prop, value)";
_subheader._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub SetTabIndex(ti As String) As VMSubHeader";
 //BA.debugLineNum = 211;BA.debugLine="SubHeader.SetTabIndex(ti)";
_subheader._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetText(t As Object) As VMSubHeader";
 //BA.debugLineNum = 60;BA.debugLine="SubHeader.SetText(t)";
_subheader._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 282;BA.debugLine="Sub SetTextColor(varColor As String) As VMSubHeade";
 //BA.debugLineNum = 283;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 284;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 289;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 290;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 291;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 292;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 293;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setvelseif(String _t) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetVElseIf(t As String) As VMSubHeader";
 //BA.debugLineNum = 104;BA.debugLine="SetAttrSingle(\"v-else-if\", t)";
_setattrsingle("v-else-if",_t);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 258;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 259;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 260;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 261;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 262;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub SetVhtml(vhtml As String) As VMSubHeader";
 //BA.debugLineNum = 246;BA.debugLine="SubHeader.SetVHtml(vhtml)";
_subheader._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetVIf(vif As String) As VMSubHeader";
 //BA.debugLineNum = 30;BA.debugLine="SubHeader.SetVIf(vif)";
_subheader._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub SetVisible(b As Boolean) As VMSubHeader";
 //BA.debugLineNum = 277;BA.debugLine="SubHeader.SetVisible(b)";
_subheader._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetVModel(k As String) As VMSubHeader";
 //BA.debugLineNum = 25;BA.debugLine="SubHeader.SetVModel(k)";
_subheader._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetVShow(vif As String) As VMSubHeader";
 //BA.debugLineNum = 42;BA.debugLine="SubHeader.SetVShow(vif)";
_subheader._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetVText(vhtml As String) As VMSubHeader";
 //BA.debugLineNum = 241;BA.debugLine="SubHeader.SetVText(vhtml)";
_subheader._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsubheader  _show() throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub Show As VMSubHeader";
 //BA.debugLineNum = 133;BA.debugLine="SubHeader.SetVisible(True)";
_subheader._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 21;BA.debugLine="Return SubHeader.ToString";
if (true) return _subheader._tostring /*String*/ ();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsubheader  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 164;BA.debugLine="Sub UseTheme(themeName As String) As VMSubHeader";
 //BA.debugLineNum = 165;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 166;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 167;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 168;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 169;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsubheader)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
