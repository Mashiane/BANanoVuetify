package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmpagination extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmpagination", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmpagination.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _pagination = null;
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
public b4j.example.vmpagination  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 57;BA.debugLine="Sub AddChild(child As VMElement) As VMPagination";
 //BA.debugLineNum = 58;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 59;BA.debugLine="Pagination.SetText(childHTML)";
_pagination._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 99;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 100;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 101;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmpagination  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub AddClass(c As String) As VMPagination";
 //BA.debugLineNum = 82;BA.debugLine="Pagination.AddClass(c)";
_pagination._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 424;BA.debugLine="Sub AddComponent(comp As String) As VMPagination";
 //BA.debugLineNum = 425;BA.debugLine="Pagination.SetText(comp)";
_pagination._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 435;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 436;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmpagination  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 267;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 268;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 356;BA.debugLine="Pagination.BindStyleSingle(prop, value)";
_pagination._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 357;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 440;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 441;BA.debugLine="Pagination.BuildModel(mprops, mstyles, lclasses,";
_pagination._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 443;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Pagination As VMElement";
_pagination = new b4j.example.vmelement();
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
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmpagination  _disable() throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub Disable As VMPagination";
 //BA.debugLineNum = 260;BA.debugLine="Pagination.Disable(True)";
_pagination._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _enable() throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub Enable As VMPagination";
 //BA.debugLineNum = 254;BA.debugLine="Pagination.Enable(True)";
_pagination._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _hide() throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub Hide As VMPagination";
 //BA.debugLineNum = 242;BA.debugLine="Pagination.SetVisible(False)";
_pagination._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="Pagination.Initialize(v, ID)";
_pagination._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="Pagination.SetTag(\"v-pagination\")";
_pagination._settag /*b4j.example.vmelement*/ ("v-pagination");
 //BA.debugLineNum = 17;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 77;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmpagination  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="public Sub RemoveAttr(sName As String) As VMPagina";
 //BA.debugLineNum = 306;BA.debugLine="Pagination.RemoveAttr(sName)";
_pagination._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub Render";
 //BA.debugLineNum = 53;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmpagination  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetAttr(attr As Map) As VMPagination";
 //BA.debugLineNum = 88;BA.debugLine="Pagination.SetAttr(attr)";
_pagination._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 375;BA.debugLine="Sub SetAttributes(attrs As List) As VMPagination";
 //BA.debugLineNum = 376;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 377;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetAttrLoose(loose As String) As VMPagination";
 //BA.debugLineNum = 274;BA.debugLine="Pagination.SetAttrLoose(loose)";
_pagination._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 350;BA.debugLine="Pagination.SetAttrSingle(prop, value)";
_pagination._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setcircle(boolean _varcircle) throws Exception{
String _pp = "";
 //BA.debugLineNum = 188;BA.debugLine="Sub SetCircle(varCircle As Boolean) As VMPaginatio";
 //BA.debugLineNum = 189;BA.debugLine="If varCircle = False Then Return Me";
if (_varcircle==__c.False) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 190;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 191;BA.debugLine="SetAttrSingle(\"circle\", varCircle)";
_setattrsingle("circle",BA.ObjectToString(_varcircle));
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 };
 //BA.debugLineNum = 194;BA.debugLine="Dim pp As String = $\"${ID}Circle\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Circle");
 //BA.debugLineNum = 195;BA.debugLine="vue.SetStateSingle(pp, varCircle)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcircle));
 //BA.debugLineNum = 196;BA.debugLine="Pagination.Bind(\":circle\", pp)";
_pagination._bind /*b4j.example.vmelement*/ (":circle",_pp);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 106;BA.debugLine="Sub SetColor(varColor As String) As VMPagination";
 //BA.debugLineNum = 107;BA.debugLine="if varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 108;BA.debugLine="if bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 109;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 };
 //BA.debugLineNum = 112;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 113;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 114;BA.debugLine="Pagination.Bind(\":color\", pp)";
_pagination._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 291;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 292;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 293;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 294;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 295;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 };
 //BA.debugLineNum = 298;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 299;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 300;BA.debugLine="Pagination.Bind(\":color\", pp)";
_pagination._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 201;BA.debugLine="Sub SetDark(varDark As Boolean) As VMPagination";
 //BA.debugLineNum = 202;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 203;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 204;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 };
 //BA.debugLineNum = 207;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 208;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 209;BA.debugLine="Pagination.Bind(\":dark\", pp)";
_pagination._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 25;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setdatatable(String _tblid) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetDataTable(tblID As String) As VMPagination";
 //BA.debugLineNum = 65;BA.debugLine="tblID = tblID.tolowercase";
_tblid = _tblid.toLowerCase();
 //BA.debugLineNum = 66;BA.debugLine="SetAttrSingle(\":length\", $\"${tblID}pagecount\"$)";
_setattrsingle(":length",(""+__c.SmartStringFormatter("",(Object)(_tblid))+"pagecount"));
 //BA.debugLineNum = 67;BA.debugLine="SetAttrSingle(\"v-model\", $\"${tblID}page\"$)";
_setattrsingle("v-model",(""+__c.SmartStringFormatter("",(Object)(_tblid))+"page"));
 //BA.debugLineNum = 68;BA.debugLine="vue.SetData($\"${tblID}page\"$, \"1\")";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_tblid))+"page"),(Object)("1"));
 //BA.debugLineNum = 69;BA.debugLine="vue.SetData($\"${tblID}pagecount\"$, \"0\")";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_tblid))+"pagecount"),(Object)("0"));
 //BA.debugLineNum = 70;BA.debugLine="SetCircle(True)";
_setcircle(__c.True);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMPagination";
 //BA.debugLineNum = 324;BA.debugLine="Pagination.SetDesignMode(b)";
_pagination._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 325;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 404;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 405;BA.debugLine="Pagination.SetDeviceOffsets(OS, OM, OL, OX)";
_pagination._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 412;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 413;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 418;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 419;BA.debugLine="Pagination.SetDeviceSizes(SS, SM, SL, SX)";
_pagination._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 420;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 421;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setdisabled(boolean _vardisabled) throws Exception{
String _pp = "";
 //BA.debugLineNum = 214;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMPagin";
 //BA.debugLineNum = 215;BA.debugLine="if varDisabled = False Then Return Me";
if (_vardisabled==__c.False) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 216;BA.debugLine="if bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 217;BA.debugLine="SetAttrSingle(\"disabled\", varDisabled)";
_setattrsingle("disabled",BA.ObjectToString(_vardisabled));
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 };
 //BA.debugLineNum = 220;BA.debugLine="Dim pp As String = $\"${ID}Disabled\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Disabled");
 //BA.debugLineNum = 221;BA.debugLine="vue.SetStateSingle(pp, varDisabled)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisabled));
 //BA.debugLineNum = 222;BA.debugLine="Pagination.Bind(\":disabled\", pp)";
_pagination._bind /*b4j.example.vmelement*/ (":disabled",_pp);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Sub SetKey(k As String) As VMPagination";
 //BA.debugLineNum = 392;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 393;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 394;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setlength(String _varlength) throws Exception{
String _pp = "";
 //BA.debugLineNum = 119;BA.debugLine="Sub SetLength(varLength As String) As VMPagination";
 //BA.debugLineNum = 120;BA.debugLine="if varLength = \"\" Then Return Me";
if ((_varlength).equals("")) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 121;BA.debugLine="If varLength = \"0\" Then Return Me";
if ((_varlength).equals("0")) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 122;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 123;BA.debugLine="SetAttrSingle(\"length\", varLength)";
_setattrsingle("length",_varlength);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 };
 //BA.debugLineNum = 126;BA.debugLine="Dim pp As String = $\"${ID}Length\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Length");
 //BA.debugLineNum = 127;BA.debugLine="vue.SetStateSingle(pp, varLength)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlength));
 //BA.debugLineNum = 128;BA.debugLine="Pagination.Bind(\":length\", pp)";
_pagination._bind /*b4j.example.vmelement*/ (":length",_pp);
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 227;BA.debugLine="Sub SetLight(varLight As Boolean) As VMPagination";
 //BA.debugLineNum = 228;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 229;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 230;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 };
 //BA.debugLineNum = 233;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 234;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 235;BA.debugLine="Pagination.Bind(\":light\", pp)";
_pagination._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Sub SetMarginAll(p As String) As VMPagination";
 //BA.debugLineNum = 318;BA.debugLine="Pagination.setmarginall(p)";
_pagination._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 338;BA.debugLine="Pagination.SetName(varName, bbind)";
_pagination._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setnexticon(String _varnexticon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 133;BA.debugLine="Sub SetNextIcon(varNextIcon As String) As VMPagina";
 //BA.debugLineNum = 134;BA.debugLine="If varNextIcon = \"\" Then Return Me";
if ((_varnexticon).equals("")) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 135;BA.debugLine="If varNextIcon = \"$next\" Then Return Me";
if ((_varnexticon).equals("$next")) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 136;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 137;BA.debugLine="SetAttrSingle(\"next-icon\", varNextIcon)";
_setattrsingle("next-icon",_varnexticon);
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 };
 //BA.debugLineNum = 140;BA.debugLine="Dim pp As String = $\"${ID}NextIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NextIcon");
 //BA.debugLineNum = 141;BA.debugLine="vue.SetStateSingle(pp, varNextIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnexticon));
 //BA.debugLineNum = 142;BA.debugLine="Pagination.Bind(\":next-icon\", pp)";
_pagination._bind /*b4j.example.vmelement*/ (":next-icon",_pp);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setoninput(String _methodname) throws Exception{
Object _value = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 452;BA.debugLine="Sub SetOnInput(methodName As String) As VMPaginati";
 //BA.debugLineNum = 453;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 454;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 455;BA.debugLine="Dim value As Object";
_value = new Object();
 //BA.debugLineNum = 456;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_value}))));
 //BA.debugLineNum = 457;BA.debugLine="SetAttr(CreateMap(\"@input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_methodname)}));
 //BA.debugLineNum = 459;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 460;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setonnext(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 464;BA.debugLine="Sub SetOnNext(methodName As String) As VMPaginatio";
 //BA.debugLineNum = 465;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 466;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 467;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 468;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 469;BA.debugLine="SetAttr(CreateMap(\"@next\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@next"),(Object)(_methodname)}));
 //BA.debugLineNum = 471;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 472;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setonprevious(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 476;BA.debugLine="Sub SetOnPrevious(methodName As String) As VMPagin";
 //BA.debugLineNum = 477;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 478;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 479;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 480;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 481;BA.debugLine="SetAttr(CreateMap(\"@previous\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@previous"),(Object)(_methodname)}));
 //BA.debugLineNum = 483;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 484;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 485;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub SetPaddingAll(p As String) As VMPagination";
 //BA.debugLineNum = 312;BA.debugLine="Pagination.SetPaddingAll(p)";
_pagination._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setprevicon(String _varprevicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 147;BA.debugLine="Sub SetPrevIcon(varPrevIcon As String) As VMPagina";
 //BA.debugLineNum = 148;BA.debugLine="If varPrevIcon = \"\" Then Return Me";
if ((_varprevicon).equals("")) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 149;BA.debugLine="If varPrevIcon = \"$prev\" Then Return Me";
if ((_varprevicon).equals("$prev")) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 150;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 151;BA.debugLine="SetAttrSingle(\"prev-icon\", varPrevIcon)";
_setattrsingle("prev-icon",_varprevicon);
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 };
 //BA.debugLineNum = 154;BA.debugLine="Dim pp As String = $\"${ID}PrevIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrevIcon");
 //BA.debugLineNum = 155;BA.debugLine="vue.SetStateSingle(pp, varPrevIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprevicon));
 //BA.debugLineNum = 156;BA.debugLine="Pagination.Bind(\":prev-icon\", pp)";
_pagination._bind /*b4j.example.vmelement*/ (":prev-icon",_pp);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 398;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMPag";
 //BA.debugLineNum = 399;BA.debugLine="Pagination.SetRC(sRow, sCol)";
_pagination._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 400;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 330;BA.debugLine="Sub SetStatic(b As Boolean) As VMPagination";
 //BA.debugLineNum = 331;BA.debugLine="Pagination.SetStatic(b)";
_pagination._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 332;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetStyle(sm As Map) As VMPagination";
 //BA.debugLineNum = 94;BA.debugLine="Pagination.SetStyle(sm)";
_pagination._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 344;BA.debugLine="Pagination.SetStyleSingle(prop, value)";
_pagination._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _settextcenter() throws Exception{
 //BA.debugLineNum = 430;BA.debugLine="Sub SetTextCenter As VMPagination";
 //BA.debugLineNum = 431;BA.debugLine="Pagination.AddClass(\"text-center\")";
_pagination._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 432;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _settotalvisible(String _vartotalvisible) throws Exception{
String _pp = "";
 //BA.debugLineNum = 161;BA.debugLine="Sub SetTotalVisible(varTotalVisible As String) As";
 //BA.debugLineNum = 162;BA.debugLine="If varTotalVisible = \"\" Then Return Me";
if ((_vartotalvisible).equals("")) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 163;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 164;BA.debugLine="SetAttrSingle(\"total-visible\", varTotalVisible)";
_setattrsingle("total-visible",_vartotalvisible);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 };
 //BA.debugLineNum = 167;BA.debugLine="Dim pp As String = $\"${ID}TotalVisible\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"TotalVisible");
 //BA.debugLineNum = 168;BA.debugLine="vue.SetStateSingle(pp, varTotalVisible)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartotalvisible));
 //BA.debugLineNum = 169;BA.debugLine="Pagination.Bind(\":total-visible\", pp)";
_pagination._bind /*b4j.example.vmelement*/ (":total-visible",_pp);
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setvalue(String _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 174;BA.debugLine="Sub SetValue(varValue As String) As VMPagination";
 //BA.debugLineNum = 175;BA.debugLine="If varValue = \"\" Then Return Me";
if ((_varvalue).equals("")) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 176;BA.debugLine="If varValue = \"0\" Then Return Me";
if ((_varvalue).equals("0")) { 
if (true) return (b4j.example.vmpagination)(this);};
 //BA.debugLineNum = 177;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 178;BA.debugLine="SetAttrSingle(\"value\", varValue)";
_setattrsingle("value",_varvalue);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 };
 //BA.debugLineNum = 181;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 182;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue));
 //BA.debugLineNum = 183;BA.debugLine="Pagination.Bind(\":value\", pp)";
_pagination._bind /*b4j.example.vmelement*/ (":value",_pp);
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 360;BA.debugLine="Sub SetVElse(vif As String) As VMPagination";
 //BA.debugLineNum = 361;BA.debugLine="Pagination.SetVElse(vif)";
_pagination._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 383;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 384;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 385;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 386;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 387;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 370;BA.debugLine="Sub SetVhtml(vhtml As String) As VMPagination";
 //BA.debugLineNum = 371;BA.debugLine="Pagination.SetVHtml(vhtml)";
_pagination._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetVIf(vif As String) As VMPagination";
 //BA.debugLineNum = 42;BA.debugLine="Pagination.SetVIf(vif)";
_pagination._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 446;BA.debugLine="Sub SetVisible(b As Boolean) As VMPagination";
 //BA.debugLineNum = 447;BA.debugLine="Pagination.SetVisible(b)";
_pagination._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetVModel(k As String) As VMPagination";
 //BA.debugLineNum = 37;BA.debugLine="Pagination.SetVModel(k)";
_pagination._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetVShow(vif As String) As VMPagination";
 //BA.debugLineNum = 47;BA.debugLine="Pagination.SetVShow(vif)";
_pagination._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 365;BA.debugLine="Sub SetVText(vhtml As String) As VMPagination";
 //BA.debugLineNum = 366;BA.debugLine="Pagination.SetVText(vhtml)";
_pagination._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 367;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _show() throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub Show As VMPagination";
 //BA.debugLineNum = 248;BA.debugLine="Pagination.SetVisible(True)";
_pagination._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 33;BA.debugLine="Return Pagination.ToString";
if (true) return _pagination._tostring /*String*/ ();
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmpagination  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 279;BA.debugLine="Sub UseTheme(themeName As String) As VMPagination";
 //BA.debugLineNum = 280;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 281;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 282;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 283;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 284;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpagination)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
