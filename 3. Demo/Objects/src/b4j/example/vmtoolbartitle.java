package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtoolbartitle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtoolbartitle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtoolbartitle.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _toolbartitle = null;
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
public b4j.example.vmtoolbartitle  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub AddClass(c As String) As VMToolbarTitle";
 //BA.debugLineNum = 102;BA.debugLine="ToolbarTitle.AddClass(c)";
_toolbartitle._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _addelement(String _elid,String _eltag,String _eltext,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses) throws Exception{
b4j.example.vmelement _d = null;
 //BA.debugLineNum = 29;BA.debugLine="Sub AddElement(elID As String, elTag As String, el";
 //BA.debugLineNum = 30;BA.debugLine="Dim d As VMElement";
_d = new b4j.example.vmelement();
 //BA.debugLineNum = 31;BA.debugLine="d.Initialize(vue,elID).SetDesignMode(DesignMode).";
_d._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid)._setdesignmode /*b4j.example.vmelement*/ (_designmode)._settag /*b4j.example.vmelement*/ (_eltag);
 //BA.debugLineNum = 32;BA.debugLine="d.SetText(elText)";
_d._settext /*b4j.example.vmelement*/ (_eltext);
 //BA.debugLineNum = 33;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, Null)";
_d._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 34;BA.debugLine="SetText(d.ToString)";
_settext(_d._tostring /*String*/ ());
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 141;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 142;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 192;BA.debugLine="ToolbarTitle.BuildModel(mprops, mstyles, lclasses";
_toolbartitle._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ToolbarTitle As VMElement";
_toolbartitle = new b4j.example.vmelement();
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
public b4j.example.vmtoolbartitle  _disable() throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub Disable As VMToolbarTitle";
 //BA.debugLineNum = 134;BA.debugLine="ToolbarTitle.Disable(True)";
_toolbartitle._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _enable() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub Enable As VMToolbarTitle";
 //BA.debugLineNum = 129;BA.debugLine="ToolbarTitle.Enable(True)";
_toolbartitle._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _hide() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub Hide As VMToolbarTitle";
 //BA.debugLineNum = 119;BA.debugLine="ToolbarTitle.SetVisible(False)";
_toolbartitle._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="ToolbarTitle.Initialize(v, ID)";
_toolbartitle._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="ToolbarTitle.SetTag(\"v-toolbar-title\")";
_toolbartitle._settag /*b4j.example.vmelement*/ ("v-toolbar-title");
 //BA.debugLineNum = 17;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 97;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbartitle  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="public Sub RemoveAttr(sName As String) As VMToolba";
 //BA.debugLineNum = 148;BA.debugLine="ToolbarTitle.RemoveAttr(sName)";
_toolbartitle._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub Render";
 //BA.debugLineNum = 85;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbartitle  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetAttr(attr As Map) As VMToolbarTitle";
 //BA.debugLineNum = 108;BA.debugLine="ToolbarTitle.SetAttr(attr)";
_toolbartitle._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 49;BA.debugLine="Sub SetAttributes(attrs As List) As VMToolbarTitle";
 //BA.debugLineNum = 50;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 51;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetAttrLoose(loose As String) As VMToolbarTitl";
 //BA.debugLineNum = 45;BA.debugLine="ToolbarTitle.SetAttrLoose(loose)";
_toolbartitle._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 187;BA.debugLine="ToolbarTitle.SetAttrSingle(prop, value)";
_toolbartitle._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 220;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 221;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmtoolbartitle)(this);};
 //BA.debugLineNum = 222;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 223;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 224;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 };
 //BA.debugLineNum = 227;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 228;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 229;BA.debugLine="ToolbarTitle.Bind(\":color\", pp)";
_toolbartitle._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 24;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMToolbarTitle";
 //BA.debugLineNum = 164;BA.debugLine="ToolbarTitle.SetDesignMode(b)";
_toolbartitle._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 165;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetMarginAll(p As String) As VMToolbarTitle";
 //BA.debugLineNum = 159;BA.debugLine="ToolbarTitle.setmarginall(p)";
_toolbartitle._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 176;BA.debugLine="ToolbarTitle.SetName(varName, bbind)";
_toolbartitle._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetPaddingAll(p As String) As VMToolbarTitle";
 //BA.debugLineNum = 154;BA.debugLine="ToolbarTitle.SetPaddingAll(p)";
_toolbartitle._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetStatic(b As Boolean) As VMToolbarTitle";
 //BA.debugLineNum = 39;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 40;BA.debugLine="ToolbarTitle.SetStatic(b)";
_toolbartitle._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetStyle(sm As Map) As VMToolbarTitle";
 //BA.debugLineNum = 114;BA.debugLine="ToolbarTitle.SetStyle(sm)";
_toolbartitle._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 182;BA.debugLine="ToolbarTitle.SetStyleSingle(prop, value)";
_toolbartitle._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub SetTabIndex(ti As String) As VMToolbarTitle";
 //BA.debugLineNum = 170;BA.debugLine="ToolbarTitle.SetTabIndex(ti)";
_toolbartitle._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _settext(String _t) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetText(t As String) As VMToolbarTitle";
 //BA.debugLineNum = 90;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmtoolbartitle)(this);};
 //BA.debugLineNum = 91;BA.debugLine="ToolbarTitle.SetText(t)";
_toolbartitle._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 202;BA.debugLine="Sub SetTextColor(varColor As String) As VMToolbarT";
 //BA.debugLineNum = 203;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 204;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _settextcolorintensity(String _textcolor,String _textintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 210;BA.debugLine="Sub SetTextColorIntensity(textcolor As String, tex";
 //BA.debugLineNum = 211;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmtoolbartitle)(this);};
 //BA.debugLineNum = 212;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 213;BA.debugLine="Dim sIntensity As String = $\"text--${textintensit";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_textintensity))+"");
 //BA.debugLineNum = 214;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 215;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetVIf(vif As String) As VMToolbarTitle";
 //BA.debugLineNum = 74;BA.debugLine="ToolbarTitle.SetVIf(vif)";
_toolbartitle._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub SetVisible(b As Boolean) As VMToolbarTitle";
 //BA.debugLineNum = 197;BA.debugLine="ToolbarTitle.SetVisible(b)";
_toolbartitle._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetVShow(vif As String) As VMToolbarTitle";
 //BA.debugLineNum = 79;BA.debugLine="ToolbarTitle.SetVShow(vif)";
_toolbartitle._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _show() throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub Show As VMToolbarTitle";
 //BA.debugLineNum = 124;BA.debugLine="ToolbarTitle.SetVisible(True)";
_toolbartitle._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 70;BA.debugLine="Return ToolbarTitle.ToString";
if (true) return _toolbartitle._tostring /*String*/ ();
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbartitle  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 58;BA.debugLine="Sub UseTheme(themeName As String) As VMToolbarTitl";
 //BA.debugLineNum = 59;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 60;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 61;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 62;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 63;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbartitle)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
