package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmoverlay extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmoverlay", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmoverlay.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _overlay = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public b4j.example.vmcontainer _container = null;
public String _smodel = "";
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
public b4j.example.vmoverlay  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 58;BA.debugLine="Sub AddChild(child As VMElement) As VMOverlay";
 //BA.debugLineNum = 59;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 60;BA.debugLine="Overlay.SetText(childHTML)";
_overlay._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
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
public b4j.example.vmoverlay  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub AddClass(c As String) As VMOverlay";
 //BA.debugLineNum = 71;BA.debugLine="Overlay.AddClass(c)";
_overlay._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="Sub AddComponent(comp As String) As VMOverlay";
 //BA.debugLineNum = 369;BA.debugLine="Overlay.SetText(comp)";
_overlay._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 380;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmoverlay  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 203;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 204;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 300;BA.debugLine="Overlay.BindStyleSingle(prop, value)";
_overlay._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 384;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 385;BA.debugLine="Overlay.BuildModel(mprops, mstyles, lclasses, loo";
_overlay._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Overlay As VMElement";
_overlay = new b4j.example.vmelement();
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
 //BA.debugLineNum = 10;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
 //BA.debugLineNum = 11;BA.debugLine="Private smodel As String";
_smodel = "";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmoverlay  _disable() throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub Disable As VMOverlay";
 //BA.debugLineNum = 196;BA.debugLine="Overlay.Disable(True)";
_overlay._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _enable() throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub Enable As VMOverlay";
 //BA.debugLineNum = 190;BA.debugLine="Overlay.Enable(True)";
_overlay._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _hide() throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub Hide As VMOverlay";
 //BA.debugLineNum = 178;BA.debugLine="vue.SetData(smodel, False)";
_vue._setdata /*b4j.example.bananovue*/ (_smodel,(Object)(__c.False));
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 16;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="Overlay.Initialize(v, ID)";
_overlay._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 18;BA.debugLine="Overlay.SetTag(\"v-overlay\")";
_overlay._settag /*b4j.example.vmelement*/ ("v-overlay");
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 22;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="SetVModel(Overlay.showkey)";
_setvmodel(_overlay._showkey /*String*/ );
 //BA.debugLineNum = 24;BA.debugLine="Container.Initialize(vue, $\"${ID}cont\"$, Module)";
_container._initialize /*b4j.example.vmcontainer*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"cont"),_module);
 //BA.debugLineNum = 25;BA.debugLine="Hide";
_hide();
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 66;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmoverlay  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="public Sub RemoveAttr(sName As String) As VMOverla";
 //BA.debugLineNum = 242;BA.debugLine="Overlay.RemoveAttr(sName)";
_overlay._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub Render";
 //BA.debugLineNum = 54;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmoverlay  _setabsolute(boolean _varabsolute) throws Exception{
String _pp = "";
 //BA.debugLineNum = 137;BA.debugLine="Sub SetAbsolute(varAbsolute As Boolean) As VMOverl";
 //BA.debugLineNum = 138;BA.debugLine="If varAbsolute = False Then Return Me";
if (_varabsolute==__c.False) { 
if (true) return (b4j.example.vmoverlay)(this);};
 //BA.debugLineNum = 139;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 140;BA.debugLine="SetAttrSingle(\"absolute\", varAbsolute)";
_setattrsingle("absolute",BA.ObjectToString(_varabsolute));
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 };
 //BA.debugLineNum = 143;BA.debugLine="Dim pp As String = $\"${ID}Absolute\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Absolute");
 //BA.debugLineNum = 144;BA.debugLine="vue.SetStateSingle(pp, varAbsolute)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varabsolute));
 //BA.debugLineNum = 145;BA.debugLine="Overlay.Bind(\":absolute\", pp)";
_overlay._bind /*b4j.example.vmelement*/ (":absolute",_pp);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetAttr(attr As Map) As VMOverlay";
 //BA.debugLineNum = 77;BA.debugLine="Overlay.SetAttr(attr)";
_overlay._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 319;BA.debugLine="Sub SetAttributes(attrs As List) As VMOverlay";
 //BA.debugLineNum = 320;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 321;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetAttrLoose(loose As String) As VMOverlay";
 //BA.debugLineNum = 210;BA.debugLine="Overlay.SetAttrLoose(loose)";
_overlay._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 294;BA.debugLine="Overlay.SetAttrSingle(prop, value)";
_overlay._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 95;BA.debugLine="Sub SetColor(varColor As String) As VMOverlay";
 //BA.debugLineNum = 96;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmoverlay)(this);};
 //BA.debugLineNum = 97;BA.debugLine="If varColor = \"#212121\" Then Return Me";
if ((_varcolor).equals("#212121")) { 
if (true) return (b4j.example.vmoverlay)(this);};
 //BA.debugLineNum = 98;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 99;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 };
 //BA.debugLineNum = 102;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 103;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 104;BA.debugLine="Overlay.Bind(\":color\", pp)";
_overlay._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 227;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 228;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmoverlay)(this);};
 //BA.debugLineNum = 229;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 230;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 231;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 };
 //BA.debugLineNum = 234;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 235;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 236;BA.debugLine="Overlay.Bind(\":color\", pp)";
_overlay._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 150;BA.debugLine="Sub SetDark(varDark As Boolean) As VMOverlay";
 //BA.debugLineNum = 151;BA.debugLine="If varDark = True Then Return Me";
if (_vardark==__c.True) { 
if (true) return (b4j.example.vmoverlay)(this);};
 //BA.debugLineNum = 152;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 153;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 };
 //BA.debugLineNum = 156;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 157;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 158;BA.debugLine="Overlay.Bind(\":dark\", pp)";
_overlay._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 30;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMOverlay";
 //BA.debugLineNum = 260;BA.debugLine="Overlay.SetDesignMode(b)";
_overlay._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 261;BA.debugLine="Container.SetDesignMode(b)";
_container._setdesignmode /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 262;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 349;BA.debugLine="Overlay.SetDeviceOffsets(OS, OM, OL, OX)";
_overlay._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 356;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 357;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 358;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 363;BA.debugLine="Overlay.SetDeviceSizes(SS, SM, SL, SX)";
_overlay._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Sub SetKey(k As String) As VMOverlay";
 //BA.debugLineNum = 336;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 337;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 163;BA.debugLine="Sub SetLight(varLight As Boolean) As VMOverlay";
 //BA.debugLineNum = 164;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmoverlay)(this);};
 //BA.debugLineNum = 165;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 166;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 };
 //BA.debugLineNum = 169;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 170;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 171;BA.debugLine="Overlay.Bind(\":light\", pp)";
_overlay._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetMarginAll(p As String) As VMOverlay";
 //BA.debugLineNum = 254;BA.debugLine="Overlay.setmarginall(p)";
_overlay._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 282;BA.debugLine="Overlay.SetName(varName, bbind)";
_overlay._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setopacity(String _varopacity) throws Exception{
String _pp = "";
 //BA.debugLineNum = 109;BA.debugLine="Sub SetOpacity(varOpacity As String) As VMOverlay";
 //BA.debugLineNum = 110;BA.debugLine="If varOpacity = \"\" Then Return Me";
if ((_varopacity).equals("")) { 
if (true) return (b4j.example.vmoverlay)(this);};
 //BA.debugLineNum = 111;BA.debugLine="If varOpacity = \"0.46\" Then Return Me";
if ((_varopacity).equals("0.46")) { 
if (true) return (b4j.example.vmoverlay)(this);};
 //BA.debugLineNum = 112;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 113;BA.debugLine="SetAttrSingle(\"opacity\", varOpacity)";
_setattrsingle("opacity",_varopacity);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 };
 //BA.debugLineNum = 116;BA.debugLine="Dim pp As String = $\"${ID}Opacity\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Opacity");
 //BA.debugLineNum = 117;BA.debugLine="vue.SetStateSingle(pp, varOpacity)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varopacity));
 //BA.debugLineNum = 118;BA.debugLine="Overlay.Bind(\":opacity\", pp)";
_overlay._bind /*b4j.example.vmelement*/ (":opacity",_pp);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetPaddingAll(p As String) As VMOverlay";
 //BA.debugLineNum = 248;BA.debugLine="Overlay.SetPaddingAll(p)";
_overlay._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMOve";
 //BA.debugLineNum = 343;BA.debugLine="Overlay.SetRC(sRow, sCol)";
_overlay._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub SetStatic(b As Boolean) As VMOverlay";
 //BA.debugLineNum = 268;BA.debugLine="Overlay.SetStatic(b)";
_overlay._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 269;BA.debugLine="Container.SetStatic(b)";
_container._setstatic /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 270;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetStyle(sm As Map) As VMOverlay";
 //BA.debugLineNum = 83;BA.debugLine="Overlay.SetStyle(sm)";
_overlay._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 288;BA.debugLine="Overlay.SetStyleSingle(prop, value)";
_overlay._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub SetTabIndex(ti As String) As VMOverlay";
 //BA.debugLineNum = 276;BA.debugLine="Overlay.SetTabIndex(ti)";
_overlay._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public String  _settext(String _child) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetText(child As String)";
 //BA.debugLineNum = 43;BA.debugLine="Overlay.SetText(child)";
_overlay._settext /*b4j.example.vmelement*/ (_child);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmoverlay  _settextcenter() throws Exception{
 //BA.debugLineNum = 374;BA.debugLine="Sub SetTextCenter As VMOverlay";
 //BA.debugLineNum = 375;BA.debugLine="Overlay.AddClass(\"text-center\")";
_overlay._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub SetVElse(vif As String) As VMOverlay";
 //BA.debugLineNum = 305;BA.debugLine="Overlay.SetVElse(vif)";
_overlay._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 327;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 328;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 329;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 330;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 331;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SetVhtml(vhtml As String) As VMOverlay";
 //BA.debugLineNum = 315;BA.debugLine="Overlay.SetVHtml(vhtml)";
_overlay._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetVModel(k As String) As VMOverlay";
 //BA.debugLineNum = 35;BA.debugLine="smodel = k";
_smodel = _k;
 //BA.debugLineNum = 36;BA.debugLine="Overlay.SetVModel(k)";
_overlay._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub SetVText(vhtml As String) As VMOverlay";
 //BA.debugLineNum = 310;BA.debugLine="Overlay.SetVText(vhtml)";
_overlay._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _setzindex(String _varzindex) throws Exception{
String _pp = "";
 //BA.debugLineNum = 123;BA.debugLine="Sub SetZIndex(varZIndex As String) As VMOverlay";
 //BA.debugLineNum = 124;BA.debugLine="If varZIndex = \"\" Then Return Me";
if ((_varzindex).equals("")) { 
if (true) return (b4j.example.vmoverlay)(this);};
 //BA.debugLineNum = 125;BA.debugLine="If varZIndex = \"5\" Then Return Me";
if ((_varzindex).equals("5")) { 
if (true) return (b4j.example.vmoverlay)(this);};
 //BA.debugLineNum = 126;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 127;BA.debugLine="SetAttrSingle(\"z-index\", varZIndex)";
_setattrsingle("z-index",_varzindex);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 };
 //BA.debugLineNum = 130;BA.debugLine="Dim pp As String = $\"${ID}ZIndex\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ZIndex");
 //BA.debugLineNum = 131;BA.debugLine="vue.SetStateSingle(pp, varZIndex)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varzindex));
 //BA.debugLineNum = 132;BA.debugLine="Overlay.Bind(\":z-index\", pp)";
_overlay._bind /*b4j.example.vmelement*/ (":z-index",_pp);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _show() throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub Show As VMOverlay";
 //BA.debugLineNum = 184;BA.debugLine="vue.SetData(smodel, True)";
_vue._setdata /*b4j.example.bananovue*/ (_smodel,(Object)(__c.True));
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 48;BA.debugLine="If Container.HasContent Then AddComponent(Contain";
if (_container._hascontent /*boolean*/ ) { 
_addcomponent(_container._tostring /*String*/ ());};
 //BA.debugLineNum = 49;BA.debugLine="Return Overlay.ToString";
if (true) return _overlay._tostring /*String*/ ();
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmoverlay  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 215;BA.debugLine="Sub UseTheme(themeName As String) As VMOverlay";
 //BA.debugLineNum = 216;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 217;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 218;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 219;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 220;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.example.vmoverlay)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
