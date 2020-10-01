package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmdatafooter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmdatafooter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmdatafooter.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _datafooter = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
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
public b4j.example.vmdatafooter  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 54;BA.debugLine="Sub AddChild(child As VMElement) As VMDataFooter";
 //BA.debugLineNum = 55;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 56;BA.debugLine="DataFooter.SetText(childHTML)";
_datafooter._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 90;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 91;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 92;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatafooter  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub AddClass(c As String) As VMDataFooter";
 //BA.debugLineNum = 73;BA.debugLine="DataFooter.AddClass(c)";
_datafooter._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Sub AddComponent(comp As String) As VMDataFooter";
 //BA.debugLineNum = 406;BA.debugLine="DataFooter.SetText(comp)";
_datafooter._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 407;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 416;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 417;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 418;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatafooter  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 254;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 255;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 336;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 337;BA.debugLine="DataFooter.BindStyleSingle(prop, value)";
_datafooter._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 420;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 421;BA.debugLine="DataFooter.BuildModel(mprops, mstyles, lclasses, l";
_datafooter._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 422;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public DataFooter As VMElement";
_datafooter = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatafooter  _disable() throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub Disable As VMDataFooter";
 //BA.debugLineNum = 247;BA.debugLine="DataFooter.Disable(True)";
_datafooter._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _enable() throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub Enable As VMDataFooter";
 //BA.debugLineNum = 241;BA.debugLine="DataFooter.Enable(True)";
_datafooter._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _hide() throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub Hide As VMDataFooter";
 //BA.debugLineNum = 229;BA.debugLine="DataFooter.SetVisible(False)";
_datafooter._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="DataFooter.Initialize(v, ID)";
_datafooter._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 15;BA.debugLine="DataFooter.SetTag(\"v-data-footer\")";
_datafooter._settag /*b4j.example.vmelement*/ ("v-data-footer");
 //BA.debugLineNum = 16;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 18;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 68;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatafooter  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="public Sub RemoveAttr(sName As String) As VMDataFo";
 //BA.debugLineNum = 288;BA.debugLine="DataFooter.RemoveAttr(sName)";
_datafooter._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub Render";
 //BA.debugLineNum = 50;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatafooter  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetAttr(attr As Map) As VMDataFooter";
 //BA.debugLineNum = 79;BA.debugLine="DataFooter.SetAttr(attr)";
_datafooter._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 356;BA.debugLine="Sub SetAttributes(attrs As List) As VMDataFooter";
 //BA.debugLineNum = 357;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 358;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetAttrLoose(loose As String) As VMDataFooter";
 //BA.debugLineNum = 261;BA.debugLine="DataFooter.SetAttrLoose(loose)";
_datafooter._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 330;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 331;BA.debugLine="DataFooter.SetAttrSingle(prop, value)";
_datafooter._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 278;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 279;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 280;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 281;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 282;BA.debugLine="DataFooter.Bind(\":color\", pp)";
_datafooter._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 23;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMDataFooter";
 //BA.debugLineNum = 306;BA.debugLine="DataFooter.SetDesignMode(b)";
_datafooter._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 307;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 385;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 386;BA.debugLine="DataFooter.SetDeviceOffsets(OS, OM, OL, OX)";
_datafooter._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 393;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 394;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 395;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 399;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 400;BA.debugLine="DataFooter.SetDeviceSizes(SS, SM, SL, SX)";
_datafooter._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 401;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setdisableitemsperpage(Object _vardisableitemsperpage) throws Exception{
String _pp = "";
 //BA.debugLineNum = 97;BA.debugLine="Sub SetDisableItemsPerPage(varDisableItemsPerPage";
 //BA.debugLineNum = 98;BA.debugLine="Dim pp As String = $\"${ID}DisableItemsPerPage\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DisableItemsPerPage");
 //BA.debugLineNum = 99;BA.debugLine="vue.SetStateSingle(pp, varDisableItemsPerPage)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vardisableitemsperpage);
 //BA.debugLineNum = 100;BA.debugLine="DataFooter.Bind(\":disable-items-per-page\", pp)";
_datafooter._bind /*b4j.example.vmelement*/ (":disable-items-per-page",_pp);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setdisablepagination(Object _vardisablepagination) throws Exception{
String _pp = "";
 //BA.debugLineNum = 105;BA.debugLine="Sub SetDisablePagination(varDisablePagination As O";
 //BA.debugLineNum = 106;BA.debugLine="Dim pp As String = $\"${ID}DisablePagination\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DisablePagination");
 //BA.debugLineNum = 107;BA.debugLine="vue.SetStateSingle(pp, varDisablePagination)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vardisablepagination);
 //BA.debugLineNum = 108;BA.debugLine="DataFooter.Bind(\":disable-pagination\", pp)";
_datafooter._bind /*b4j.example.vmelement*/ (":disable-pagination",_pp);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setfirsticon(Object _varfirsticon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 113;BA.debugLine="Sub SetFirstIcon(varFirstIcon As Object) As VMData";
 //BA.debugLineNum = 114;BA.debugLine="Dim pp As String = $\"${ID}FirstIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"FirstIcon");
 //BA.debugLineNum = 115;BA.debugLine="vue.SetStateSingle(pp, varFirstIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varfirsticon);
 //BA.debugLineNum = 116;BA.debugLine="DataFooter.Bind(\":first-icon\", pp)";
_datafooter._bind /*b4j.example.vmelement*/ (":first-icon",_pp);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setitemsperpagealltext(Object _varitemsperpagealltext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 121;BA.debugLine="Sub SetItemsPerPageAllText(varItemsPerPageAllText";
 //BA.debugLineNum = 122;BA.debugLine="Dim pp As String = $\"${ID}ItemsPerPageAllText\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ItemsPerPageAllText");
 //BA.debugLineNum = 123;BA.debugLine="vue.SetStateSingle(pp, varItemsPerPageAllText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varitemsperpagealltext);
 //BA.debugLineNum = 124;BA.debugLine="DataFooter.Bind(\":items-per-page-all-text\", pp)";
_datafooter._bind /*b4j.example.vmelement*/ (":items-per-page-all-text",_pp);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setitemsperpageoptions(Object _varitemsperpageoptions) throws Exception{
String _pp = "";
 //BA.debugLineNum = 129;BA.debugLine="Sub SetItemsPerPageOptions(varItemsPerPageOptions";
 //BA.debugLineNum = 130;BA.debugLine="Dim pp As String = $\"${ID}ItemsPerPageOptions\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ItemsPerPageOptions");
 //BA.debugLineNum = 131;BA.debugLine="vue.SetStateSingle(pp, varItemsPerPageOptions)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varitemsperpageoptions);
 //BA.debugLineNum = 132;BA.debugLine="DataFooter.Bind(\":items-per-page-options\", pp)";
_datafooter._bind /*b4j.example.vmelement*/ (":items-per-page-options",_pp);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setitemsperpagetext(Object _varitemsperpagetext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 137;BA.debugLine="Sub SetItemsPerPageText(varItemsPerPageText As Obj";
 //BA.debugLineNum = 138;BA.debugLine="Dim pp As String = $\"${ID}ItemsPerPageText\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ItemsPerPageText");
 //BA.debugLineNum = 139;BA.debugLine="vue.SetStateSingle(pp, varItemsPerPageText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varitemsperpagetext);
 //BA.debugLineNum = 140;BA.debugLine="DataFooter.Bind(\":items-per-page-text\", pp)";
_datafooter._bind /*b4j.example.vmelement*/ (":items-per-page-text",_pp);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Sub SetKey(k As String) As VMDataFooter";
 //BA.debugLineNum = 373;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 374;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setlasticon(Object _varlasticon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 145;BA.debugLine="Sub SetLastIcon(varLastIcon As Object) As VMDataFo";
 //BA.debugLineNum = 146;BA.debugLine="Dim pp As String = $\"${ID}LastIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"LastIcon");
 //BA.debugLineNum = 147;BA.debugLine="vue.SetStateSingle(pp, varLastIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varlasticon);
 //BA.debugLineNum = 148;BA.debugLine="DataFooter.Bind(\":last-icon\", pp)";
_datafooter._bind /*b4j.example.vmelement*/ (":last-icon",_pp);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub SetMarginAll(p As String) As VMDataFooter";
 //BA.debugLineNum = 300;BA.debugLine="DataFooter.setmarginall(p)";
_datafooter._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 319;BA.debugLine="DataFooter.SetName(varName, bbind)";
_datafooter._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setnexticon(Object _varnexticon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 153;BA.debugLine="Sub SetNextIcon(varNextIcon As Object) As VMDataFo";
 //BA.debugLineNum = 154;BA.debugLine="Dim pp As String = $\"${ID}NextIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NextIcon");
 //BA.debugLineNum = 155;BA.debugLine="vue.SetStateSingle(pp, varNextIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varnexticon);
 //BA.debugLineNum = 156;BA.debugLine="DataFooter.Bind(\":next-icon\", pp)";
_datafooter._bind /*b4j.example.vmelement*/ (":next-icon",_pp);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setonupdateoptions(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 215;BA.debugLine="Sub SetOnUpdateOptions(methodName As String) As VM";
 //BA.debugLineNum = 216;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 217;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatafooter)(this);};
 //BA.debugLineNum = 218;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 219;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 220;BA.debugLine="SetAttr(CreateMap(\"@update:options\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:options"),(Object)(_methodname)}));
 //BA.debugLineNum = 222;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setoptions(Object _varoptions) throws Exception{
String _pp = "";
 //BA.debugLineNum = 161;BA.debugLine="Sub SetOptions(varOptions As Object) As VMDataFoot";
 //BA.debugLineNum = 162;BA.debugLine="Dim pp As String = $\"${ID}Options\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Options");
 //BA.debugLineNum = 163;BA.debugLine="vue.SetStateSingle(pp, varOptions)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varoptions);
 //BA.debugLineNum = 164;BA.debugLine="DataFooter.Bind(\":options\", pp)";
_datafooter._bind /*b4j.example.vmelement*/ (":options",_pp);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Sub SetPaddingAll(p As String) As VMDataFooter";
 //BA.debugLineNum = 294;BA.debugLine="DataFooter.SetPaddingAll(p)";
_datafooter._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setpagetext(Object _varpagetext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 169;BA.debugLine="Sub SetPageText(varPageText As Object) As VMDataFo";
 //BA.debugLineNum = 170;BA.debugLine="Dim pp As String = $\"${ID}PageText\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PageText");
 //BA.debugLineNum = 171;BA.debugLine="vue.SetStateSingle(pp, varPageText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varpagetext);
 //BA.debugLineNum = 172;BA.debugLine="DataFooter.Bind(\":page-text\", pp)";
_datafooter._bind /*b4j.example.vmelement*/ (":page-text",_pp);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setpagination(Object _varpagination) throws Exception{
String _pp = "";
 //BA.debugLineNum = 177;BA.debugLine="Sub SetPagination(varPagination As Object) As VMDa";
 //BA.debugLineNum = 178;BA.debugLine="Dim pp As String = $\"${ID}Pagination\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Pagination");
 //BA.debugLineNum = 179;BA.debugLine="vue.SetStateSingle(pp, varPagination)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varpagination);
 //BA.debugLineNum = 180;BA.debugLine="DataFooter.Bind(\":pagination\", pp)";
_datafooter._bind /*b4j.example.vmelement*/ (":pagination",_pp);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setprevicon(Object _varprevicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 185;BA.debugLine="Sub SetPrevIcon(varPrevIcon As Object) As VMDataFo";
 //BA.debugLineNum = 186;BA.debugLine="Dim pp As String = $\"${ID}PrevIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrevIcon");
 //BA.debugLineNum = 187;BA.debugLine="vue.SetStateSingle(pp, varPrevIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varprevicon);
 //BA.debugLineNum = 188;BA.debugLine="DataFooter.Bind(\":prev-icon\", pp)";
_datafooter._bind /*b4j.example.vmelement*/ (":prev-icon",_pp);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMDat";
 //BA.debugLineNum = 380;BA.debugLine="DataFooter.SetRC(sRow, sCol)";
_datafooter._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 381;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setshowcurrentpage(Object _varshowcurrentpage) throws Exception{
String _pp = "";
 //BA.debugLineNum = 193;BA.debugLine="Sub SetShowCurrentPage(varShowCurrentPage As Objec";
 //BA.debugLineNum = 194;BA.debugLine="Dim pp As String = $\"${ID}ShowCurrentPage\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowCurrentPage");
 //BA.debugLineNum = 195;BA.debugLine="vue.SetStateSingle(pp, varShowCurrentPage)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varshowcurrentpage);
 //BA.debugLineNum = 196;BA.debugLine="DataFooter.Bind(\":show-current-page\", pp)";
_datafooter._bind /*b4j.example.vmelement*/ (":show-current-page",_pp);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setshowfirstlastpage(Object _varshowfirstlastpage) throws Exception{
String _pp = "";
 //BA.debugLineNum = 201;BA.debugLine="Sub SetShowFirstLastPage(varShowFirstLastPage As O";
 //BA.debugLineNum = 202;BA.debugLine="Dim pp As String = $\"${ID}ShowFirstLastPage\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowFirstLastPage");
 //BA.debugLineNum = 203;BA.debugLine="vue.SetStateSingle(pp, varShowFirstLastPage)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varshowfirstlastpage);
 //BA.debugLineNum = 204;BA.debugLine="DataFooter.Bind(\":show-first-last-page\", pp)";
_datafooter._bind /*b4j.example.vmelement*/ (":show-first-last-page",_pp);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setslotpagetext(boolean _b) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetSlotPageText(b As Boolean) As VMDataFooter";
 //BA.debugLineNum = 210;BA.debugLine="SetAttr(CreateMap(\"slot\": \"page-text\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("page-text")}));
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetStyle(sm As Map) As VMDataFooter";
 //BA.debugLineNum = 85;BA.debugLine="DataFooter.SetStyle(sm)";
_datafooter._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 325;BA.debugLine="DataFooter.SetStyleSingle(prop, value)";
_datafooter._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Sub SetTabIndex(ti As String) As VMDataFooter";
 //BA.debugLineNum = 313;BA.debugLine="DataFooter.SetTabIndex(ti)";
_datafooter._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetText(t As Object) As VMDataFooter";
 //BA.debugLineNum = 62;BA.debugLine="DataFooter.SetText(t)";
_datafooter._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _settextcenter() throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Sub SetTextCenter As VMDataFooter";
 //BA.debugLineNum = 412;BA.debugLine="DataFooter.AddClass(\"text-center\")";
_datafooter._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 413;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 430;BA.debugLine="Sub SetTextColor(varColor As String) As VMDataFoot";
 //BA.debugLineNum = 431;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 432;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 433;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 437;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 438;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 439;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 440;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 441;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 341;BA.debugLine="Sub SetVElse(vif As String) As VMDataFooter";
 //BA.debugLineNum = 342;BA.debugLine="DataFooter.SetVElse(vif)";
_datafooter._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 343;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 364;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 365;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 366;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 367;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 368;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 369;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Sub SetVhtml(vhtml As String) As VMDataFooter";
 //BA.debugLineNum = 352;BA.debugLine="DataFooter.SetVHtml(vhtml)";
_datafooter._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetVIf(vif As String) As VMDataFooter";
 //BA.debugLineNum = 39;BA.debugLine="DataFooter.SetVIf(vif)";
_datafooter._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 424;BA.debugLine="Sub SetVisible(b As Boolean) As VMDataFooter";
 //BA.debugLineNum = 425;BA.debugLine="DataFooter.SetVisible(b)";
_datafooter._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetVModel(k As String) As VMDataFooter";
 //BA.debugLineNum = 34;BA.debugLine="DataFooter.SetVModel(k)";
_datafooter._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetVShow(vif As String) As VMDataFooter";
 //BA.debugLineNum = 44;BA.debugLine="DataFooter.SetVShow(vif)";
_datafooter._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub SetVText(vhtml As String) As VMDataFooter";
 //BA.debugLineNum = 347;BA.debugLine="DataFooter.SetVText(vhtml)";
_datafooter._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatafooter  _show() throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub Show As VMDataFooter";
 //BA.debugLineNum = 235;BA.debugLine="DataFooter.SetVisible(True)";
_datafooter._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 30;BA.debugLine="Return DataFooter.ToString";
if (true) return _datafooter._tostring /*String*/ ();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatafooter  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 266;BA.debugLine="Sub UseTheme(themeName As String) As VMDataFooter";
 //BA.debugLineNum = 267;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 268;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 269;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 270;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 271;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatafooter)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
