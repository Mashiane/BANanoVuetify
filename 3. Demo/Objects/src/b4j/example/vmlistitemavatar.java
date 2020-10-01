package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmlistitemavatar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmlistitemavatar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmlistitemavatar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _listitemavatar = null;
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
public b4j.example.vmlistitemavatar  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 75;BA.debugLine="Sub AddChild(child As VMElement) As VMListItemAvat";
 //BA.debugLineNum = 76;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 77;BA.debugLine="ListItemAvatar.SetText(childHTML)";
_listitemavatar._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 111;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 112;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 113;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitemavatar  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub AddClass(c As String) As VMListItemAvatar";
 //BA.debugLineNum = 94;BA.debugLine="ListItemAvatar.AddClass(c)";
_listitemavatar._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 297;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 298;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 299;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 348;BA.debugLine="ListItemAvatar.BuildModel(mprops, mstyles, lclass";
_listitemavatar._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ListItemAvatar As VMElement";
_listitemavatar = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean    'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object     'ignore";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitemavatar  _disable() throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub Disable As VMListItemAvatar";
 //BA.debugLineNum = 290;BA.debugLine="ListItemAvatar.Disable(True)";
_listitemavatar._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _enable() throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub Enable As VMListItemAvatar";
 //BA.debugLineNum = 285;BA.debugLine="ListItemAvatar.Enable(True)";
_listitemavatar._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _hide() throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub Hide As VMListItemAvatar";
 //BA.debugLineNum = 275;BA.debugLine="ListItemAvatar.SetVisible(False)";
_listitemavatar._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="ListItemAvatar.Initialize(v, ID)";
_listitemavatar._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="ListItemAvatar.SetTag(\"v-list-item-avatar\")";
_listitemavatar._settag /*b4j.example.vmelement*/ ("v-list-item-avatar");
 //BA.debugLineNum = 17;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 89;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitemavatar  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="public Sub RemoveAttr(sName As String) As VMListIt";
 //BA.debugLineNum = 304;BA.debugLine="ListItemAvatar.RemoveAttr(sName)";
_listitemavatar._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub Render";
 //BA.debugLineNum = 71;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitemavatar  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetAttr(attr As Map) As VMListItemAvatar";
 //BA.debugLineNum = 100;BA.debugLine="ListItemAvatar.SetAttr(attr)";
_listitemavatar._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 35;BA.debugLine="Sub SetAttributes(attrs As List) As VMListItemAvat";
 //BA.debugLineNum = 36;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 37;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetAttrLoose(loose As String) As VMListItemAva";
 //BA.debugLineNum = 31;BA.debugLine="ListItemAvatar.SetAttrLoose(loose)";
_listitemavatar._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 343;BA.debugLine="ListItemAvatar.SetAttrSingle(prop, value)";
_listitemavatar._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 118;BA.debugLine="Sub SetColor(varColor As String) As VMListItemAvat";
 //BA.debugLineNum = 119;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmlistitemavatar)(this);};
 //BA.debugLineNum = 120;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 121;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 };
 //BA.debugLineNum = 124;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 125;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 126;BA.debugLine="ListItemAvatar.Bind(\":color\", pp)";
_listitemavatar._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 43;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMListItemAvata";
 //BA.debugLineNum = 320;BA.debugLine="ListItemAvatar.SetDesignMode(b)";
_listitemavatar._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 321;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 131;BA.debugLine="Sub SetHeight(varHeight As String) As VMListItemAv";
 //BA.debugLineNum = 132;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmlistitemavatar)(this);};
 //BA.debugLineNum = 133;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 134;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 };
 //BA.debugLineNum = 137;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 138;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 139;BA.debugLine="ListItemAvatar.Bind(\":height\", pp)";
_listitemavatar._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _sethorizontal(boolean _varhorizontal) throws Exception{
String _pp = "";
 //BA.debugLineNum = 144;BA.debugLine="Sub SetHorizontal(varHorizontal As Boolean) As VML";
 //BA.debugLineNum = 145;BA.debugLine="If varHorizontal = False Then Return Me";
if (_varhorizontal==__c.False) { 
if (true) return (b4j.example.vmlistitemavatar)(this);};
 //BA.debugLineNum = 146;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 147;BA.debugLine="SetAttrSingle(\"horizontal\", varHorizontal)";
_setattrsingle("horizontal",BA.ObjectToString(_varhorizontal));
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 };
 //BA.debugLineNum = 150;BA.debugLine="Dim pp As String = $\"${ID}Horizontal\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Horizontal");
 //BA.debugLineNum = 151;BA.debugLine="vue.SetStateSingle(pp, varHorizontal)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhorizontal));
 //BA.debugLineNum = 152;BA.debugLine="ListItemAvatar.Bind(\":horizontal\", pp)";
_listitemavatar._bind /*b4j.example.vmelement*/ (":horizontal",_pp);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setleft(boolean _varleft) throws Exception{
String _pp = "";
 //BA.debugLineNum = 157;BA.debugLine="Sub SetLeft(varLeft As Boolean) As VMListItemAvata";
 //BA.debugLineNum = 158;BA.debugLine="If varLeft = False Then Return Me";
if (_varleft==__c.False) { 
if (true) return (b4j.example.vmlistitemavatar)(this);};
 //BA.debugLineNum = 159;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 160;BA.debugLine="SetAttrSingle(\"left\", varLeft)";
_setattrsingle("left",BA.ObjectToString(_varleft));
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 };
 //BA.debugLineNum = 163;BA.debugLine="Dim pp As String = $\"${ID}Left\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Left");
 //BA.debugLineNum = 164;BA.debugLine="vue.SetStateSingle(pp, varLeft)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varleft));
 //BA.debugLineNum = 165;BA.debugLine="ListItemAvatar.Bind(\":left\", pp)";
_listitemavatar._bind /*b4j.example.vmelement*/ (":left",_pp);
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SetMarginAll(p As String) As VMListItemAvatar";
 //BA.debugLineNum = 315;BA.debugLine="ListItemAvatar.setmarginall(p)";
_listitemavatar._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setmaxheight(String _varmaxheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 170;BA.debugLine="Sub SetMaxHeight(varMaxHeight As String) As VMList";
 //BA.debugLineNum = 171;BA.debugLine="If varMaxHeight = \"\" Then Return Me";
if ((_varmaxheight).equals("")) { 
if (true) return (b4j.example.vmlistitemavatar)(this);};
 //BA.debugLineNum = 172;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 173;BA.debugLine="SetAttrSingle(\"max-height\", varMaxHeight)";
_setattrsingle("max-height",_varmaxheight);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 };
 //BA.debugLineNum = 176;BA.debugLine="Dim pp As String = $\"${ID}MaxHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxHeight");
 //BA.debugLineNum = 177;BA.debugLine="vue.SetStateSingle(pp, varMaxHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxheight));
 //BA.debugLineNum = 178;BA.debugLine="ListItemAvatar.Bind(\":max-height\", pp)";
_listitemavatar._bind /*b4j.example.vmelement*/ (":max-height",_pp);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setmaxwidth(String _varmaxwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 183;BA.debugLine="Sub SetMaxWidth(varMaxWidth As String) As VMListIt";
 //BA.debugLineNum = 184;BA.debugLine="If varMaxWidth = \"\" Then Return Me";
if ((_varmaxwidth).equals("")) { 
if (true) return (b4j.example.vmlistitemavatar)(this);};
 //BA.debugLineNum = 185;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 186;BA.debugLine="SetAttrSingle(\"max-width\", varMaxWidth)";
_setattrsingle("max-width",_varmaxwidth);
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 };
 //BA.debugLineNum = 189;BA.debugLine="Dim pp As String = $\"${ID}MaxWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxWidth");
 //BA.debugLineNum = 190;BA.debugLine="vue.SetStateSingle(pp, varMaxWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxwidth));
 //BA.debugLineNum = 191;BA.debugLine="ListItemAvatar.Bind(\":max-width\", pp)";
_listitemavatar._bind /*b4j.example.vmelement*/ (":max-width",_pp);
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setminheight(String _varminheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 196;BA.debugLine="Sub SetMinHeight(varMinHeight As String) As VMList";
 //BA.debugLineNum = 197;BA.debugLine="If varMinHeight = \"\" Then Return Me";
if ((_varminheight).equals("")) { 
if (true) return (b4j.example.vmlistitemavatar)(this);};
 //BA.debugLineNum = 198;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 199;BA.debugLine="SetAttrSingle(\"min-height\", varMinHeight)";
_setattrsingle("min-height",_varminheight);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 };
 //BA.debugLineNum = 202;BA.debugLine="Dim pp As String = $\"${ID}MinHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinHeight");
 //BA.debugLineNum = 203;BA.debugLine="vue.SetStateSingle(pp, varMinHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminheight));
 //BA.debugLineNum = 204;BA.debugLine="ListItemAvatar.Bind(\":min-height\", pp)";
_listitemavatar._bind /*b4j.example.vmelement*/ (":min-height",_pp);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setminwidth(String _varminwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 209;BA.debugLine="Sub SetMinWidth(varMinWidth As String) As VMListIt";
 //BA.debugLineNum = 210;BA.debugLine="If varMinWidth = \"\" Then Return Me";
if ((_varminwidth).equals("")) { 
if (true) return (b4j.example.vmlistitemavatar)(this);};
 //BA.debugLineNum = 211;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 212;BA.debugLine="SetAttrSingle(\"min-width\", varMinWidth)";
_setattrsingle("min-width",_varminwidth);
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 };
 //BA.debugLineNum = 215;BA.debugLine="Dim pp As String = $\"${ID}MinWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinWidth");
 //BA.debugLineNum = 216;BA.debugLine="vue.SetStateSingle(pp, varMinWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminwidth));
 //BA.debugLineNum = 217;BA.debugLine="ListItemAvatar.Bind(\":min-width\", pp)";
_listitemavatar._bind /*b4j.example.vmelement*/ (":min-width",_pp);
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 332;BA.debugLine="ListItemAvatar.SetName(varName, bbind)";
_listitemavatar._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub SetPaddingAll(p As String) As VMListItemAvatar";
 //BA.debugLineNum = 310;BA.debugLine="ListItemAvatar.SetPaddingAll(p)";
_listitemavatar._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setright(boolean _varright) throws Exception{
String _pp = "";
 //BA.debugLineNum = 222;BA.debugLine="Sub SetRight(varRight As Boolean) As VMListItemAva";
 //BA.debugLineNum = 223;BA.debugLine="If varRight = False Then Return Me";
if (_varright==__c.False) { 
if (true) return (b4j.example.vmlistitemavatar)(this);};
 //BA.debugLineNum = 224;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 225;BA.debugLine="SetAttrSingle(\"right\", varRight)";
_setattrsingle("right",BA.ObjectToString(_varright));
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 };
 //BA.debugLineNum = 228;BA.debugLine="Dim pp As String = $\"${ID}Right\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Right");
 //BA.debugLineNum = 229;BA.debugLine="vue.SetStateSingle(pp, varRight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varright));
 //BA.debugLineNum = 230;BA.debugLine="ListItemAvatar.Bind(\":right\", pp)";
_listitemavatar._bind /*b4j.example.vmelement*/ (":right",_pp);
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setsize(String _varsize) throws Exception{
String _pp = "";
 //BA.debugLineNum = 235;BA.debugLine="Sub SetSize(varSize As String) As VMListItemAvatar";
 //BA.debugLineNum = 236;BA.debugLine="If varSize = \"\" Then Return Me";
if ((_varsize).equals("")) { 
if (true) return (b4j.example.vmlistitemavatar)(this);};
 //BA.debugLineNum = 237;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 238;BA.debugLine="SetAttrSingle(\"size\", varSize)";
_setattrsingle("size",_varsize);
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 };
 //BA.debugLineNum = 241;BA.debugLine="Dim pp As String = $\"${ID}Size\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Size");
 //BA.debugLineNum = 242;BA.debugLine="vue.SetStateSingle(pp, varSize)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsize));
 //BA.debugLineNum = 243;BA.debugLine="ListItemAvatar.Bind(\":size\", pp)";
_listitemavatar._bind /*b4j.example.vmelement*/ (":size",_pp);
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetStatic(b As Boolean) As VMListItemAvatar";
 //BA.debugLineNum = 25;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 26;BA.debugLine="ListItemAvatar.SetStatic(b)";
_listitemavatar._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetStyle(sm As Map) As VMListItemAvatar";
 //BA.debugLineNum = 106;BA.debugLine="ListItemAvatar.SetStyle(sm)";
_listitemavatar._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 338;BA.debugLine="ListItemAvatar.SetStyleSingle(prop, value)";
_listitemavatar._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub SetTabIndex(ti As String) As VMListItemAvatar";
 //BA.debugLineNum = 326;BA.debugLine="ListItemAvatar.SetTabIndex(ti)";
_listitemavatar._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetText(t As Object) As VMListItemAvatar";
 //BA.debugLineNum = 83;BA.debugLine="ListItemAvatar.SetText(t)";
_listitemavatar._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 358;BA.debugLine="Sub SetTextColor(varColor As String) As VMListItem";
 //BA.debugLineNum = 359;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 360;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 365;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 366;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 367;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 368;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 369;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _settile(boolean _vartile) throws Exception{
String _pp = "";
 //BA.debugLineNum = 248;BA.debugLine="Sub SetTile(varTile As Boolean) As VMListItemAvata";
 //BA.debugLineNum = 249;BA.debugLine="If varTile = False Then Return Me";
if (_vartile==__c.False) { 
if (true) return (b4j.example.vmlistitemavatar)(this);};
 //BA.debugLineNum = 250;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 251;BA.debugLine="SetAttrSingle(\"tile\", varTile)";
_setattrsingle("tile",BA.ObjectToString(_vartile));
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 };
 //BA.debugLineNum = 254;BA.debugLine="Dim pp As String = $\"${ID}Tile\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tile");
 //BA.debugLineNum = 255;BA.debugLine="vue.SetStateSingle(pp, varTile)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartile));
 //BA.debugLineNum = 256;BA.debugLine="ListItemAvatar.Bind(\":tile\", pp)";
_listitemavatar._bind /*b4j.example.vmelement*/ (":tile",_pp);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetVIf(vif As String) As VMListItemAvatar";
 //BA.debugLineNum = 60;BA.debugLine="ListItemAvatar.SetVIf(vif)";
_listitemavatar._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Sub SetVisible(b As Boolean) As VMListItemAvatar";
 //BA.debugLineNum = 353;BA.debugLine="ListItemAvatar.SetVisible(b)";
_listitemavatar._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetVModel(k As String) As VMListItemAvatar";
 //BA.debugLineNum = 55;BA.debugLine="ListItemAvatar.SetVModel(k)";
_listitemavatar._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetVShow(vif As String) As VMListItemAvatar";
 //BA.debugLineNum = 65;BA.debugLine="ListItemAvatar.SetVShow(vif)";
_listitemavatar._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _setwidth(String _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 261;BA.debugLine="Sub SetWidth(varWidth As String) As VMListItemAvat";
 //BA.debugLineNum = 262;BA.debugLine="If varWidth = \"\" Then Return Me";
if ((_varwidth).equals("")) { 
if (true) return (b4j.example.vmlistitemavatar)(this);};
 //BA.debugLineNum = 263;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 264;BA.debugLine="SetAttrSingle(\"width\", varWidth)";
_setattrsingle("width",_varwidth);
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 };
 //BA.debugLineNum = 267;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 268;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varwidth));
 //BA.debugLineNum = 269;BA.debugLine="ListItemAvatar.Bind(\":width\", pp)";
_listitemavatar._bind /*b4j.example.vmelement*/ (":width",_pp);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemavatar  _show() throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub Show As VMListItemAvatar";
 //BA.debugLineNum = 280;BA.debugLine="ListItemAvatar.SetVisible(True)";
_listitemavatar._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemavatar)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 51;BA.debugLine="Return ListItemAvatar.ToString";
if (true) return _listitemavatar._tostring /*String*/ ();
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
