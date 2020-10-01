package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmbanner extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmbanner", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmbanner.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _banner = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public b4j.example.vmtemplate _actions = null;
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
public b4j.example.vmbanner  _addaction(b4j.example.vmbutton _btn) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub AddAction(btn As VMButton) As VMBanner";
 //BA.debugLineNum = 56;BA.debugLine="Actions.AddComponent(btn.ToString)";
_actions._addcomponent /*b4j.example.vmtemplate*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 106;BA.debugLine="Sub AddChild(child As VMElement) As VMBanner";
 //BA.debugLineNum = 107;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 108;BA.debugLine="Banner.SetText(childHTML)";
_banner._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 142;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 143;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 144;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbanner  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub AddClass(c As String) As VMBanner";
 //BA.debugLineNum = 125;BA.debugLine="Banner.AddClass(c)";
_banner._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub AddComponent(comp As String) As VMBanner";
 //BA.debugLineNum = 61;BA.debugLine="SetText(comp)";
_settext((Object)(_comp));
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 388;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 389;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbanner  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 333;BA.debugLine="Banner.Bind(prop, stateprop)";
_banner._bind /*b4j.example.vmelement*/ (_prop,_stateprop);
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 393;BA.debugLine="Banner.BuildModel(mprops, mstyles, lclasses, loose";
_banner._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 394;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Banner As VMElement";
_banner = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private Actions As VMTemplate";
_actions = new b4j.example.vmtemplate();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbanner  _disable() throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub Disable As VMBanner";
 //BA.debugLineNum = 326;BA.debugLine="Banner.Enable(false)";
_banner._enable /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _enable() throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub Enable As VMBanner";
 //BA.debugLineNum = 321;BA.debugLine="Banner.Enable(True)";
_banner._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _hide() throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub Hide As VMBanner";
 //BA.debugLineNum = 311;BA.debugLine="Banner.SetVisible(False)";
_banner._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 312;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="Banner.Initialize(v, ID)";
_banner._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="Banner.SetTag(\"v-banner\")";
_banner._settag /*b4j.example.vmelement*/ ("v-banner");
 //BA.debugLineNum = 17;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="If ID = \"\" Then";
if ((_id).equals("")) { 
 //BA.debugLineNum = 21;BA.debugLine="Actions.Initialize(vue, \"\", Module).SetSlotActio";
_actions._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",_module)._setslotactions /*b4j.example.vmtemplate*/ ();
 }else {
 //BA.debugLineNum = 23;BA.debugLine="Actions.Initialize(vue, $\"${ID}actions\"$, Module";
_actions._initialize /*b4j.example.vmtemplate*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"actions"),_module)._setslotactions /*b4j.example.vmtemplate*/ ();
 };
 //BA.debugLineNum = 25;BA.debugLine="Banner.typeOf = \"banner\"";
_banner._typeof /*String*/  = "banner";
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 120;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbanner  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="public Sub RemoveAttr(sName As String) As VMBanner";
 //BA.debugLineNum = 339;BA.debugLine="Banner.RemoveAttr(sName)";
_banner._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub Render";
 //BA.debugLineNum = 102;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbanner  _setapp(boolean _varapp) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetApp(varApp As Boolean) As VMBanner";
 //BA.debugLineNum = 150;BA.debugLine="If varApp = False Then Return Me";
if (_varapp==__c.False) { 
if (true) return (b4j.example.vmbanner)(this);};
 //BA.debugLineNum = 151;BA.debugLine="Banner.SetAttrLoose(\"app\")";
_banner._setattrloose /*b4j.example.vmelement*/ ("app");
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetAttr(attr As Map) As VMBanner";
 //BA.debugLineNum = 131;BA.debugLine="Banner.SetAttr(attr)";
_banner._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 72;BA.debugLine="Sub SetAttributes(attrs As List) As VMBanner";
 //BA.debugLineNum = 73;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 74;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetAttrLoose(loose As String) As VMBanner";
 //BA.debugLineNum = 67;BA.debugLine="Banner.SetAttrLoose(loose)";
_banner._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 383;BA.debugLine="Banner.SetAttrSingle(prop, value)";
_banner._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 384;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setcolor(Object _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 156;BA.debugLine="Sub SetColor(varColor As Object) As VMBanner";
 //BA.debugLineNum = 157;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 158;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varcolor);
 //BA.debugLineNum = 159;BA.debugLine="Banner.Bind(\":color\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setdark(Object _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 164;BA.debugLine="Sub SetDark(varDark As Object) As VMBanner";
 //BA.debugLineNum = 165;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 166;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vardark);
 //BA.debugLineNum = 167;BA.debugLine="Banner.Bind(\":dark\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 41;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMBanner";
 //BA.debugLineNum = 355;BA.debugLine="Banner.SetDesignMode(b)";
_banner._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 356;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 357;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 371;BA.debugLine="Sub SetDisabled(b As Boolean) As VMBanner";
 //BA.debugLineNum = 372;BA.debugLine="Banner.SetDisabled(b)";
_banner._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 373;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setevelation(Object _varevelation) throws Exception{
String _pp = "";
 //BA.debugLineNum = 172;BA.debugLine="Sub SetEvelation(varEvelation As Object) As VMBann";
 //BA.debugLineNum = 173;BA.debugLine="Dim pp As String = $\"${ID}Evelation\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Evelation");
 //BA.debugLineNum = 174;BA.debugLine="vue.SetStateSingle(pp, varEvelation)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varevelation);
 //BA.debugLineNum = 175;BA.debugLine="Banner.Bind(\":evelation\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":evelation",_pp);
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setheight(Object _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 180;BA.debugLine="Sub SetHeight(varHeight As Object) As VMBanner";
 //BA.debugLineNum = 181;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 182;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varheight);
 //BA.debugLineNum = 183;BA.debugLine="Banner.Bind(\":height\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _seticon(Object _varicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 188;BA.debugLine="Sub SetIcon(varIcon As Object) As VMBanner";
 //BA.debugLineNum = 189;BA.debugLine="Dim pp As String = $\"${ID}Icon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Icon");
 //BA.debugLineNum = 190;BA.debugLine="vue.SetStateSingle(pp, varIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varicon);
 //BA.debugLineNum = 191;BA.debugLine="Banner.Bind(\":icon\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":icon",_pp);
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _seticoncolor(Object _variconcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 196;BA.debugLine="Sub SetIconColor(varIconColor As Object) As VMBann";
 //BA.debugLineNum = 197;BA.debugLine="Dim pp As String = $\"${ID}IconColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"IconColor");
 //BA.debugLineNum = 198;BA.debugLine="vue.SetStateSingle(pp, varIconColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_variconcolor);
 //BA.debugLineNum = 199;BA.debugLine="Banner.Bind(\":icon-color\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":icon-color",_pp);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setlight(Object _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 204;BA.debugLine="Sub SetLight(varLight As Object) As VMBanner";
 //BA.debugLineNum = 205;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 206;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varlight);
 //BA.debugLineNum = 207;BA.debugLine="Banner.Bind(\":light\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub SetMarginAll(p As String) As VMBanner";
 //BA.debugLineNum = 350;BA.debugLine="Banner.setmarginall(p)";
_banner._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setmaxheight(Object _varmaxheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 212;BA.debugLine="Sub SetMaxHeight(varMaxHeight As Object) As VMBann";
 //BA.debugLineNum = 213;BA.debugLine="Dim pp As String = $\"${ID}MaxHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxHeight");
 //BA.debugLineNum = 214;BA.debugLine="vue.SetStateSingle(pp, varMaxHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmaxheight);
 //BA.debugLineNum = 215;BA.debugLine="Banner.Bind(\":max-height\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":max-height",_pp);
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setmaxwidth(Object _varmaxwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 220;BA.debugLine="Sub SetMaxWidth(varMaxWidth As Object) As VMBanner";
 //BA.debugLineNum = 221;BA.debugLine="Dim pp As String = $\"${ID}MaxWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxWidth");
 //BA.debugLineNum = 222;BA.debugLine="vue.SetStateSingle(pp, varMaxWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmaxwidth);
 //BA.debugLineNum = 223;BA.debugLine="Banner.Bind(\":max-width\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":max-width",_pp);
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setminheight(Object _varminheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 228;BA.debugLine="Sub SetMinHeight(varMinHeight As Object) As VMBann";
 //BA.debugLineNum = 229;BA.debugLine="Dim pp As String = $\"${ID}MinHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinHeight");
 //BA.debugLineNum = 230;BA.debugLine="vue.SetStateSingle(pp, varMinHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varminheight);
 //BA.debugLineNum = 231;BA.debugLine="Banner.Bind(\":min-height\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":min-height",_pp);
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setminwidth(Object _varminwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 236;BA.debugLine="Sub SetMinWidth(varMinWidth As Object) As VMBanner";
 //BA.debugLineNum = 237;BA.debugLine="Dim pp As String = $\"${ID}MinWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinWidth");
 //BA.debugLineNum = 238;BA.debugLine="vue.SetStateSingle(pp, varMinWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varminwidth);
 //BA.debugLineNum = 239;BA.debugLine="Banner.Bind(\":min-width\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":min-width",_pp);
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setmobilebreakpoint(Object _varmobilebreakpoint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 244;BA.debugLine="Sub SetMobileBreakPoint(varMobileBreakPoint As Obj";
 //BA.debugLineNum = 245;BA.debugLine="Dim pp As String = $\"${ID}MobileBreakPoint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MobileBreakPoint");
 //BA.debugLineNum = 246;BA.debugLine="vue.SetStateSingle(pp, varMobileBreakPoint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmobilebreakpoint);
 //BA.debugLineNum = 247;BA.debugLine="Banner.Bind(\":mobile-break-point\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":mobile-break-point",_pp);
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 367;BA.debugLine="Banner.SetName(varName, bbind)";
_banner._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setonclickicon(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 29;BA.debugLine="Sub SetOnClickIcon(methodName As String) As VMBann";
 //BA.debugLineNum = 30;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 31;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmbanner)(this);};
 //BA.debugLineNum = 32;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 33;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 34;BA.debugLine="SetAttr(CreateMap(\"@click:icon\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:icon"),(Object)(_methodname)}));
 //BA.debugLineNum = 36;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub SetPaddingAll(p As String) As VMBanner";
 //BA.debugLineNum = 345;BA.debugLine="Banner.SetPaddingAll(p)";
_banner._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setsingleline(Object _varsingleline) throws Exception{
String _pp = "";
 //BA.debugLineNum = 252;BA.debugLine="Sub SetSingleLine(varSingleLine As Object) As VMBa";
 //BA.debugLineNum = 253;BA.debugLine="Dim pp As String = $\"${ID}SingleLine\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SingleLine");
 //BA.debugLineNum = 254;BA.debugLine="vue.SetStateSingle(pp, varSingleLine)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varsingleline);
 //BA.debugLineNum = 255;BA.debugLine="Banner.Bind(\":single-line\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":single-line",_pp);
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setslotactions(boolean _b) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub SetSlotActions(b As Boolean) As VMBanner    'i";
 //BA.debugLineNum = 299;BA.debugLine="SetAttr(CreateMap(\"slot\": \"actions\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("actions")}));
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setsloticon(boolean _b) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub SetSlotIcon(b As Boolean) As VMBanner    'igno";
 //BA.debugLineNum = 305;BA.debugLine="SetAttr(CreateMap(\"slot\": \"icon\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("icon")}));
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setsticky(Object _varsticky) throws Exception{
String _pp = "";
 //BA.debugLineNum = 260;BA.debugLine="Sub SetSticky(varSticky As Object) As VMBanner";
 //BA.debugLineNum = 261;BA.debugLine="Dim pp As String = $\"${ID}Sticky\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Sticky");
 //BA.debugLineNum = 262;BA.debugLine="vue.SetStateSingle(pp, varSticky)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varsticky);
 //BA.debugLineNum = 263;BA.debugLine="Banner.Bind(\":sticky\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":sticky",_pp);
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetStyle(sm As Map) As VMBanner";
 //BA.debugLineNum = 137;BA.debugLine="Banner.SetStyle(sm)";
_banner._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 377;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 378;BA.debugLine="Banner.SetStyleSingle(prop, value)";
_banner._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 360;BA.debugLine="Sub SetTabIndex(ti As String) As VMBanner";
 //BA.debugLineNum = 361;BA.debugLine="Banner.SetTabIndex(ti)";
_banner._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _settag(Object _vartag) throws Exception{
String _pp = "";
 //BA.debugLineNum = 268;BA.debugLine="Sub SetTag(varTag As Object) As VMBanner";
 //BA.debugLineNum = 269;BA.debugLine="Dim pp As String = $\"${ID}Tag\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tag");
 //BA.debugLineNum = 270;BA.debugLine="vue.SetStateSingle(pp, varTag)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vartag);
 //BA.debugLineNum = 271;BA.debugLine="Banner.Bind(\":tag\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":tag",_pp);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetText(t As Object) As VMBanner";
 //BA.debugLineNum = 114;BA.debugLine="Banner.SetText(t)";
_banner._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 402;BA.debugLine="Sub SetTextColor(varColor As String) As VMBanner";
 //BA.debugLineNum = 403;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 404;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 405;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 409;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 410;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 411;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 412;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 413;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _settile(Object _vartile) throws Exception{
String _pp = "";
 //BA.debugLineNum = 276;BA.debugLine="Sub SetTile(varTile As Object) As VMBanner";
 //BA.debugLineNum = 277;BA.debugLine="Dim pp As String = $\"${ID}Tile\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tile");
 //BA.debugLineNum = 278;BA.debugLine="vue.SetStateSingle(pp, varTile)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vartile);
 //BA.debugLineNum = 279;BA.debugLine="Banner.Bind(\":tile\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":tile",_pp);
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _settwoline(Object _vartwoline) throws Exception{
String _pp = "";
 //BA.debugLineNum = 47;BA.debugLine="Sub SetTwoLine(varTwoLine As Object) As VMBanner";
 //BA.debugLineNum = 48;BA.debugLine="Dim pp As String = $\"${ID}TwoLine\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"TwoLine");
 //BA.debugLineNum = 49;BA.debugLine="vue.SetStateSingle(pp, varTwoLine)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vartwoline);
 //BA.debugLineNum = 50;BA.debugLine="Banner.Bind(\":two-line\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":two-line",_pp);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setvalue(Object _varvalue) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub SetValue(varValue As Object) As VMBanner";
 //BA.debugLineNum = 285;BA.debugLine="Banner.SetValue(varValue,False)";
_banner._setvalue /*b4j.example.vmelement*/ (BA.ObjectToString(_varvalue),__c.False);
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetVIf(vif As String) As VMBanner";
 //BA.debugLineNum = 91;BA.debugLine="Banner.SetVIf(vif)";
_banner._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 396;BA.debugLine="Sub SetVisible(b As Boolean) As VMBanner";
 //BA.debugLineNum = 397;BA.debugLine="Banner.SetVisible(b)";
_banner._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetVModel(k As String) As VMBanner";
 //BA.debugLineNum = 86;BA.debugLine="Banner.SetVModel(k)";
_banner._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetVShow(vif As String) As VMBanner";
 //BA.debugLineNum = 96;BA.debugLine="Banner.SetVShow(vif)";
_banner._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _setwidth(Object _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 290;BA.debugLine="Sub SetWidth(varWidth As Object) As VMBanner";
 //BA.debugLineNum = 291;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 292;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varwidth);
 //BA.debugLineNum = 293;BA.debugLine="Banner.Bind(\":width\", pp)";
_banner._bind /*b4j.example.vmelement*/ (":width",_pp);
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _show() throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub Show As VMBanner";
 //BA.debugLineNum = 316;BA.debugLine="Banner.SetVisible(True)";
_banner._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbanner)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 81;BA.debugLine="Actions.Pop(Banner)";
_actions._pop /*String*/ (_banner);
 //BA.debugLineNum = 82;BA.debugLine="Return Banner.ToString";
if (true) return _banner._tostring /*String*/ ();
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
