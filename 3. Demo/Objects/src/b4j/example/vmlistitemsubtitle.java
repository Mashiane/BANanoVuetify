package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmlistitemsubtitle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmlistitemsubtitle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmlistitemsubtitle.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _listitemsubtitle = null;
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
public b4j.example.vmlistitemsubtitle  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 88;BA.debugLine="Sub AddChild(child As VMElement) As VMListItemSubT";
 //BA.debugLineNum = 89;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 90;BA.debugLine="ListItemSubTitle.SetText(childHTML)";
_listitemsubtitle._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 124;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 125;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 126;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitemsubtitle  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub AddClass(c As String) As VMListItemSubTitle";
 //BA.debugLineNum = 107;BA.debugLine="ListItemSubTitle.AddClass(c)";
_listitemsubtitle._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 132;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 133;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 183;BA.debugLine="ListItemSubTitle.BuildModel(mprops, mstyles, lcla";
_listitemsubtitle._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ListItemSubTitle As VMElement";
_listitemsubtitle = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean    'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object         'ignore";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean       'ignore";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitemsubtitle  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="ListItemSubTitle.Initialize(v, ID)";
_listitemsubtitle._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="ListItemSubTitle.SetTag(\"v-list-item-subtitle\")";
_listitemsubtitle._settag /*b4j.example.vmelement*/ ("v-list-item-subtitle");
 //BA.debugLineNum = 17;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 102;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitemsubtitle  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="public Sub RemoveAttr(sName As String) As VMListIt";
 //BA.debugLineNum = 139;BA.debugLine="ListItemSubTitle.RemoveAttr(sName)";
_listitemsubtitle._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub Render";
 //BA.debugLineNum = 84;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitemsubtitle  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetAttr(attr As Map) As VMListItemSubTitle";
 //BA.debugLineNum = 113;BA.debugLine="ListItemSubTitle.SetAttr(attr)";
_listitemsubtitle._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 43;BA.debugLine="Sub SetAttributes(attrs As List) As VMListItemSubT";
 //BA.debugLineNum = 44;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 45;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetAttrLoose(loose As String) As VMListItemSub";
 //BA.debugLineNum = 39;BA.debugLine="ListItemSubTitle.SetAttrLoose(loose)";
_listitemsubtitle._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 178;BA.debugLine="ListItemSubTitle.SetAttrSingle(prop, value)";
_listitemsubtitle._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 32;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMListItemSubTi";
 //BA.debugLineNum = 155;BA.debugLine="ListItemSubTitle.SetDesignMode(b)";
_listitemsubtitle._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 156;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetMarginAll(p As String) As VMListItemSubTitl";
 //BA.debugLineNum = 150;BA.debugLine="ListItemSubTitle.setmarginall(p)";
_listitemsubtitle._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 167;BA.debugLine="ListItemSubTitle.SetName(varName, bbind)";
_listitemsubtitle._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetPaddingAll(p As String) As VMListItemSubTit";
 //BA.debugLineNum = 145;BA.debugLine="ListItemSubTitle.SetPaddingAll(p)";
_listitemsubtitle._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetStatic(b As Boolean) As VMListItemSubTitle";
 //BA.debugLineNum = 26;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 27;BA.debugLine="ListItemSubTitle.SetStatic(b)";
_listitemsubtitle._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetStyle(sm As Map) As VMListItemSubTitle";
 //BA.debugLineNum = 119;BA.debugLine="ListItemSubTitle.SetStyle(sm)";
_listitemsubtitle._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 173;BA.debugLine="ListItemSubTitle.SetStyleSingle(prop, value)";
_listitemsubtitle._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetTabIndex(ti As String) As VMListItemSubTitl";
 //BA.debugLineNum = 161;BA.debugLine="ListItemSubTitle.SetTabIndex(ti)";
_listitemsubtitle._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetText(t As Object) As VMListItemSubTitle";
 //BA.debugLineNum = 96;BA.debugLine="ListItemSubTitle.SetText(t)";
_listitemsubtitle._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 193;BA.debugLine="Sub SetTextColor(varColor As String) As VMListItem";
 //BA.debugLineNum = 194;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 195;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 200;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 201;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 202;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 203;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 204;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetVhtml(vhtml As String) As VMListItemSubTitl";
 //BA.debugLineNum = 78;BA.debugLine="ListItemSubTitle.SetVHtml(vhtml)";
_listitemsubtitle._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetVIf(vif As String) As VMListItemSubTitle";
 //BA.debugLineNum = 61;BA.debugLine="ListItemSubTitle.SetVIf(vif)";
_listitemsubtitle._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetVisible(b As Boolean) As VMListItemSubTitle";
 //BA.debugLineNum = 188;BA.debugLine="ListItemSubTitle.SetVisible(b)";
_listitemsubtitle._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetVModel(k As String) As VMListItemSubTitle";
 //BA.debugLineNum = 56;BA.debugLine="ListItemSubTitle.SetVModel(k)";
_listitemsubtitle._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetVShow(vif As String) As VMListItemSubTitle";
 //BA.debugLineNum = 66;BA.debugLine="ListItemSubTitle.SetVShow(vif)";
_listitemsubtitle._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemsubtitle  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetVText(vhtml As String) As VMListItemSubTitl";
 //BA.debugLineNum = 72;BA.debugLine="ListItemSubTitle.SetVText(vhtml)";
_listitemsubtitle._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemsubtitle)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 52;BA.debugLine="Return ListItemSubTitle.ToString";
if (true) return _listitemsubtitle._tostring /*String*/ ();
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
