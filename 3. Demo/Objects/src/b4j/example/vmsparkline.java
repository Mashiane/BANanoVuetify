package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmsparkline extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmsparkline", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmsparkline.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _sparkline = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public anywheresoftware.b4a.objects.collections.Map _xy = null;
public boolean _hasxy = false;
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
public b4j.example.vmsparkline  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 82;BA.debugLine="Sub AddChild(child As VMElement) As VMSparkLine";
 //BA.debugLineNum = 83;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 84;BA.debugLine="Sparkline.SetText(childHTML)";
_sparkline._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 118;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 119;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 120;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsparkline  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub AddClass(c As String) As VMSparkLine";
 //BA.debugLineNum = 101;BA.debugLine="Sparkline.AddClass(c)";
_sparkline._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 559;BA.debugLine="Sub AddComponent(comp As String) As VMSparkLine";
 //BA.debugLineNum = 560;BA.debugLine="Sparkline.SetText(comp)";
_sparkline._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 561;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 562;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 570;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 571;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 572;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsparkline  _addxy(String _x,int _y) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub AddXY(x As String, y As Int) As VMSparkLine";
 //BA.debugLineNum = 30;BA.debugLine="xy.Put(x, y)";
_xy.Put((Object)(_x),(Object)(_y));
 //BA.debugLineNum = 31;BA.debugLine="hasXY = True";
_hasxy = __c.True;
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 395;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 396;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 397;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 490;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 491;BA.debugLine="Sparkline.BindStyleSingle(prop, value)";
_sparkline._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 492;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 493;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 575;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 576;BA.debugLine="Sparkline.BuildModel(mprops, mstyles, lclasses, l";
_sparkline._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 577;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 578;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Sparkline As VMElement";
_sparkline = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean   'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object      'ignore";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="Private xy As Map";
_xy = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Private hasXY As Boolean";
_hasxy = false;
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsparkline  _disable() throws Exception{
 //BA.debugLineNum = 388;BA.debugLine="Sub Disable As VMSparkLine";
 //BA.debugLineNum = 389;BA.debugLine="Sparkline.Disable(True)";
_sparkline._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 390;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _enable() throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Sub Enable As VMSparkLine";
 //BA.debugLineNum = 383;BA.debugLine="Sparkline.Enable(True)";
_sparkline._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 384;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _hide() throws Exception{
 //BA.debugLineNum = 370;BA.debugLine="Sub Hide As VMSparkLine";
 //BA.debugLineNum = 371;BA.debugLine="Sparkline.SetVisible(False)";
_sparkline._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 16;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="Sparkline.Initialize(v, ID)";
_sparkline._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 18;BA.debugLine="Sparkline.SetTag(\"v-sparkline\")";
_sparkline._settag /*b4j.example.vmelement*/ ("v-sparkline");
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 22;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="xy.Initialize";
_xy.Initialize();
 //BA.debugLineNum = 24;BA.debugLine="hasXY = False";
_hasxy = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 96;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsparkline  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 434;BA.debugLine="public Sub RemoveAttr(sName As String) As VMSparkL";
 //BA.debugLineNum = 435;BA.debugLine="Sparkline.RemoveAttr(sName)";
_sparkline._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 436;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub Render";
 //BA.debugLineNum = 78;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsparkline  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetAttr(attr As Map) As VMSparkLine";
 //BA.debugLineNum = 107;BA.debugLine="Sparkline.SetAttr(attr)";
_sparkline._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 510;BA.debugLine="Sub SetAttributes(attrs As List) As VMSparkLine";
 //BA.debugLineNum = 511;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 512;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 514;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 402;BA.debugLine="Sub SetAttrLoose(loose As String) As VMSparkLine";
 //BA.debugLineNum = 403;BA.debugLine="Sparkline.SetAttrLoose(loose)";
_sparkline._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 404;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 484;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 485;BA.debugLine="Sparkline.SetAttrSingle(prop, value)";
_sparkline._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 486;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 487;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setautodraw(boolean _varautodraw) throws Exception{
String _pp = "";
 //BA.debugLineNum = 165;BA.debugLine="Sub SetAutoDraw(varAutoDraw As Boolean) As VMSpark";
 //BA.debugLineNum = 166;BA.debugLine="If varAutoDraw = False Then Return Me";
if (_varautodraw==__c.False) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 167;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 168;BA.debugLine="SetAttrSingle(\"auto-draw\", varAutoDraw)";
_setattrsingle("auto-draw",BA.ObjectToString(_varautodraw));
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 };
 //BA.debugLineNum = 171;BA.debugLine="Dim pp As String = $\"${ID}AutoDraw\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AutoDraw");
 //BA.debugLineNum = 172;BA.debugLine="vue.SetStateSingle(pp, varAutoDraw)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varautodraw));
 //BA.debugLineNum = 173;BA.debugLine="Sparkline.Bind(\":auto-draw\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":auto-draw",_pp);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setautodrawduration(String _varautodrawduration) throws Exception{
String _pp = "";
 //BA.debugLineNum = 229;BA.debugLine="Sub SetAutoDrawDuration(varAutoDrawDuration As Str";
 //BA.debugLineNum = 230;BA.debugLine="If varAutoDrawDuration = \"\" Then Return Me";
if ((_varautodrawduration).equals("")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 231;BA.debugLine="If varAutoDrawDuration = \"2000\" Then Return Me";
if ((_varautodrawduration).equals("2000")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 232;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 233;BA.debugLine="SetAttrSingle(\"auto-draw-duration\", varAutoDrawD";
_setattrsingle("auto-draw-duration",_varautodrawduration);
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 };
 //BA.debugLineNum = 236;BA.debugLine="Dim pp As String = $\"${ID}AutoDrawDuration\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AutoDrawDuration");
 //BA.debugLineNum = 237;BA.debugLine="vue.SetStateSingle(pp, varAutoDrawDuration)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varautodrawduration));
 //BA.debugLineNum = 238;BA.debugLine="Sparkline.Bind(\":auto-draw-duration\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":auto-draw-duration",_pp);
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setautodraweasing(String _varautodraweasing) throws Exception{
String _pp = "";
 //BA.debugLineNum = 243;BA.debugLine="Sub SetAutoDrawEasing(varAutoDrawEasing As String)";
 //BA.debugLineNum = 244;BA.debugLine="If varAutoDrawEasing = \"\" Then Return Me";
if ((_varautodraweasing).equals("")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 245;BA.debugLine="If varAutoDrawEasing = \"ease\" Then Return Me";
if ((_varautodraweasing).equals("ease")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 246;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 247;BA.debugLine="SetAttrSingle(\"auto-draw-easing\", varAutoDrawEas";
_setattrsingle("auto-draw-easing",_varautodraweasing);
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 };
 //BA.debugLineNum = 250;BA.debugLine="Dim pp As String = $\"${ID}AutoDrawEasing\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AutoDrawEasing");
 //BA.debugLineNum = 251;BA.debugLine="vue.SetStateSingle(pp, varAutoDrawEasing)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varautodraweasing));
 //BA.debugLineNum = 252;BA.debugLine="Sparkline.Bind(\":auto-draw-easing\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":auto-draw-easing",_pp);
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setautolinewidth(boolean _varautolinewidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 178;BA.debugLine="Sub SetAutoLineWidth(varAutoLineWidth As Boolean)";
 //BA.debugLineNum = 179;BA.debugLine="If varAutoLineWidth = False Then Return Me";
if (_varautolinewidth==__c.False) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 180;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 181;BA.debugLine="SetAttrSingle(\"auto-line-width\", varAutoLineWidt";
_setattrsingle("auto-line-width",BA.ObjectToString(_varautolinewidth));
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 };
 //BA.debugLineNum = 184;BA.debugLine="Dim pp As String = $\"${ID}AutoLineWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AutoLineWidth");
 //BA.debugLineNum = 185;BA.debugLine="vue.SetStateSingle(pp, varAutoLineWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varautolinewidth));
 //BA.debugLineNum = 186;BA.debugLine="Sparkline.Bind(\":auto-line-width\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":auto-line-width",_pp);
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 257;BA.debugLine="Sub SetColor(varColor As String) As VMSparkLine";
 //BA.debugLineNum = 258;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 259;BA.debugLine="If varColor = \"primary\" Then Return Me";
if ((_varcolor).equals("primary")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 260;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 261;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 };
 //BA.debugLineNum = 264;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 265;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 266;BA.debugLine="Sparkline.Bind(\":color\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 420;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 421;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 422;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 423;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 424;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 425;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 };
 //BA.debugLineNum = 427;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 428;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 429;BA.debugLine="Sparkline.Bind(\":color\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 430;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 36;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 452;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMSparkLine";
 //BA.debugLineNum = 453;BA.debugLine="Sparkline.SetDesignMode(b)";
_sparkline._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 454;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 455;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 539;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 540;BA.debugLine="Sparkline.SetDeviceOffsets(OS, OM, OL, OX)";
_sparkline._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 541;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 542;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 546;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 547;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 548;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 549;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 550;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 553;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 554;BA.debugLine="Sparkline.SetDeviceSizes(SS, SM, SL, SX)";
_sparkline._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 555;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 556;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setfill(boolean _varfill) throws Exception{
String _pp = "";
 //BA.debugLineNum = 191;BA.debugLine="Sub SetFill(varFill As Boolean) As VMSparkLine";
 //BA.debugLineNum = 192;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 193;BA.debugLine="SetAttrSingle(\"fill\", varFill)";
_setattrsingle("fill",BA.ObjectToString(_varfill));
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 };
 //BA.debugLineNum = 196;BA.debugLine="Dim pp As String = $\"${ID}Fill\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Fill");
 //BA.debugLineNum = 197;BA.debugLine="vue.SetStateSingle(pp, varFill)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfill));
 //BA.debugLineNum = 198;BA.debugLine="Sparkline.Bind(\":fill\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":fill",_pp);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setgradient(anywheresoftware.b4a.objects.collections.List _vargradient) throws Exception{
String _pp = "";
 //BA.debugLineNum = 156;BA.debugLine="Sub SetGradient(varGradient As List) As VMSparkLin";
 //BA.debugLineNum = 157;BA.debugLine="If bStatic Then Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 158;BA.debugLine="Dim pp As String = $\"${ID}Gradient\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Gradient");
 //BA.debugLineNum = 159;BA.debugLine="vue.SetStateSingle(pp, varGradient)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vargradient.getObject()));
 //BA.debugLineNum = 160;BA.debugLine="Sparkline.Bind(\":gradient\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":gradient",_pp);
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setgradientdirection(String _vargradientdirection) throws Exception{
String _pp = "";
 //BA.debugLineNum = 271;BA.debugLine="Sub SetGradientDirection(varGradientDirection As S";
 //BA.debugLineNum = 272;BA.debugLine="If varGradientDirection = \"\" Then Return Me";
if ((_vargradientdirection).equals("")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 273;BA.debugLine="If varGradientDirection = \"top\" Then Return Me";
if ((_vargradientdirection).equals("top")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 274;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 275;BA.debugLine="SetAttrSingle(\"gradient-direction\", varGradientD";
_setattrsingle("gradient-direction",_vargradientdirection);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 };
 //BA.debugLineNum = 278;BA.debugLine="Dim pp As String = $\"${ID}GradientDirection\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"GradientDirection");
 //BA.debugLineNum = 279;BA.debugLine="vue.SetStateSingle(pp, varGradientDirection)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vargradientdirection));
 //BA.debugLineNum = 280;BA.debugLine="Sparkline.Bind(\":gradient-direction\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":gradient-direction",_pp);
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 285;BA.debugLine="Sub SetHeight(varHeight As String) As VMSparkLine";
 //BA.debugLineNum = 286;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 287;BA.debugLine="If varHeight = \"75\" Then Return Me";
if ((_varheight).equals("75")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 288;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 289;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 };
 //BA.debugLineNum = 292;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 293;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 294;BA.debugLine="Sparkline.Bind(\":height\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 526;BA.debugLine="Sub SetKey(k As String) As VMSparkLine";
 //BA.debugLineNum = 527;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 528;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 529;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setlabels(anywheresoftware.b4a.objects.collections.List _varlabels) throws Exception{
String _pp = "";
 //BA.debugLineNum = 147;BA.debugLine="Sub SetLabels(varLabels As List) As VMSparkLine";
 //BA.debugLineNum = 148;BA.debugLine="If bStatic Then	Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 149;BA.debugLine="Dim pp As String = $\"${ID}Labels\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Labels");
 //BA.debugLineNum = 150;BA.debugLine="vue.SetStateSingle(pp, varLabels)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlabels.getObject()));
 //BA.debugLineNum = 151;BA.debugLine="Sparkline.Bind(\":labels\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":labels",_pp);
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setlabelsize(String _varlabelsize) throws Exception{
String _pp = "";
 //BA.debugLineNum = 299;BA.debugLine="Sub SetLabelSize(varLabelSize As String) As VMSpar";
 //BA.debugLineNum = 300;BA.debugLine="If varLabelSize = \"\" Then Return Me";
if ((_varlabelsize).equals("")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 301;BA.debugLine="If varLabelSize = \"7\" Then Return Me";
if ((_varlabelsize).equals("7")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 302;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 303;BA.debugLine="SetAttrSingle(\"label-size\", varLabelSize)";
_setattrsingle("label-size",_varlabelsize);
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 };
 //BA.debugLineNum = 306;BA.debugLine="Dim pp As String = $\"${ID}LabelSize\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"LabelSize");
 //BA.debugLineNum = 307;BA.debugLine="vue.SetStateSingle(pp, varLabelSize)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlabelsize));
 //BA.debugLineNum = 308;BA.debugLine="Sparkline.Bind(\":label-size\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":label-size",_pp);
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setlinewidth(String _varlinewidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 313;BA.debugLine="Sub SetLineWidth(varLineWidth As String) As VMSpar";
 //BA.debugLineNum = 314;BA.debugLine="If varLineWidth = \"\" Then Return Me";
if ((_varlinewidth).equals("")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 315;BA.debugLine="If varLineWidth = \"4\" Then Return Me";
if ((_varlinewidth).equals("4")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 316;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 317;BA.debugLine="SetAttrSingle(\"line-width\", varLineWidth)";
_setattrsingle("line-width",_varlinewidth);
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 };
 //BA.debugLineNum = 320;BA.debugLine="Dim pp As String = $\"${ID}LineWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"LineWidth");
 //BA.debugLineNum = 321;BA.debugLine="vue.SetStateSingle(pp, varLineWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlinewidth));
 //BA.debugLineNum = 322;BA.debugLine="Sparkline.Bind(\":line-width\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":line-width",_pp);
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 446;BA.debugLine="Sub SetMarginAll(p As String) As VMSparkLine";
 //BA.debugLineNum = 447;BA.debugLine="Sparkline.setmarginall(p)";
_sparkline._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 472;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 473;BA.debugLine="Sparkline.SetName(varName, bbind)";
_sparkline._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setpadding(String _varpadding) throws Exception{
String _pp = "";
 //BA.debugLineNum = 327;BA.debugLine="Sub SetPadding(varPadding As String) As VMSparkLin";
 //BA.debugLineNum = 328;BA.debugLine="If varPadding = \"\" Then Return Me";
if ((_varpadding).equals("")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 329;BA.debugLine="If varPadding = \"8\" Then Return Me";
if ((_varpadding).equals("8")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 330;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 331;BA.debugLine="SetAttrSingle(\"padding\", varPadding)";
_setattrsingle("padding",_varpadding);
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 };
 //BA.debugLineNum = 334;BA.debugLine="Dim pp As String = $\"${ID}Padding\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Padding");
 //BA.debugLineNum = 335;BA.debugLine="vue.SetStateSingle(pp, varPadding)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpadding));
 //BA.debugLineNum = 336;BA.debugLine="Sparkline.Bind(\":padding\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":padding",_pp);
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 440;BA.debugLine="Sub SetPaddingAll(p As String) As VMSparkLine";
 //BA.debugLineNum = 441;BA.debugLine="Sparkline.SetPaddingAll(p)";
_sparkline._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 533;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMSpa";
 //BA.debugLineNum = 534;BA.debugLine="Sparkline.SetRC(sRow, sCol)";
_sparkline._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 535;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 536;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setshowlabels(boolean _varshowlabels) throws Exception{
String _pp = "";
 //BA.debugLineNum = 203;BA.debugLine="Sub SetShowLabels(varShowLabels As Boolean) As VMS";
 //BA.debugLineNum = 204;BA.debugLine="If varShowLabels = False Then Return Me";
if (_varshowlabels==__c.False) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 205;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 206;BA.debugLine="SetAttrSingle(\"show-labels\", varShowLabels)";
_setattrsingle("show-labels",BA.ObjectToString(_varshowlabels));
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 };
 //BA.debugLineNum = 209;BA.debugLine="Dim pp As String = $\"${ID}ShowLabels\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowLabels");
 //BA.debugLineNum = 210;BA.debugLine="vue.SetStateSingle(pp, varShowLabels)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshowlabels));
 //BA.debugLineNum = 211;BA.debugLine="Sparkline.Bind(\":show-labels\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":show-labels",_pp);
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setsmooth(boolean _varsmooth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 216;BA.debugLine="Sub SetSmooth(varSmooth As Boolean) As VMSparkLine";
 //BA.debugLineNum = 217;BA.debugLine="If varSmooth = False Then Return Me";
if (_varsmooth==__c.False) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 218;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 219;BA.debugLine="SetAttrSingle(\"smooth\", varSmooth)";
_setattrsingle("smooth",BA.ObjectToString(_varsmooth));
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 };
 //BA.debugLineNum = 222;BA.debugLine="Dim pp As String = $\"${ID}Smooth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Smooth");
 //BA.debugLineNum = 223;BA.debugLine="vue.SetStateSingle(pp, varSmooth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsmooth));
 //BA.debugLineNum = 224;BA.debugLine="Sparkline.Bind(\":smooth\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":smooth",_pp);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 459;BA.debugLine="Sub SetStatic(b As Boolean) As VMSparkLine";
 //BA.debugLineNum = 460;BA.debugLine="Sparkline.SetStatic(b)";
_sparkline._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 461;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 462;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 463;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setstrokelinecap(String _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 134;BA.debugLine="Sub SetStrokeLineCap(varValue As String) As VMSpar";
 //BA.debugLineNum = 135;BA.debugLine="If varValue = \"\" Then Return Me";
if ((_varvalue).equals("")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 136;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 137;BA.debugLine="SetAttrSingle(\"stroke-linecap\", varValue)";
_setattrsingle("stroke-linecap",_varvalue);
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 };
 //BA.debugLineNum = 140;BA.debugLine="Dim pp As String = $\"${ID}StrokeLineCap\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"StrokeLineCap");
 //BA.debugLineNum = 141;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue));
 //BA.debugLineNum = 142;BA.debugLine="Sparkline.Bind(\":stroke-linecap\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":stroke-linecap",_pp);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetStyle(sm As Map) As VMSparkLine";
 //BA.debugLineNum = 113;BA.debugLine="Sparkline.SetStyle(sm)";
_sparkline._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 478;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 479;BA.debugLine="Sparkline.SetStyleSingle(prop, value)";
_sparkline._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 480;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 481;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 466;BA.debugLine="Sub SetTabIndex(ti As String) As VMSparkLine";
 //BA.debugLineNum = 467;BA.debugLine="Sparkline.SetTabIndex(ti)";
_sparkline._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 468;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _settext(String _t) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetText(t As String) As VMSparkLine";
 //BA.debugLineNum = 90;BA.debugLine="Sparkline.SetText(t)";
_sparkline._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _settextcenter() throws Exception{
 //BA.debugLineNum = 565;BA.debugLine="Sub SetTextCenter As VMSparkLine";
 //BA.debugLineNum = 566;BA.debugLine="Sparkline.AddClass(\"text-center\")";
_sparkline._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 567;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 568;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _settype(String _vartype) throws Exception{
String _pp = "";
 //BA.debugLineNum = 341;BA.debugLine="Sub SetType(varType As String) As VMSparkLine";
 //BA.debugLineNum = 342;BA.debugLine="If varType = \"\" Then Return Me";
if ((_vartype).equals("")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 343;BA.debugLine="If varType = \"trend\" Then Return Me";
if ((_vartype).equals("trend")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 344;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 345;BA.debugLine="SetAttrSingle(\"type\", varType)";
_setattrsingle("type",_vartype);
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 };
 //BA.debugLineNum = 348;BA.debugLine="Dim pp As String = $\"${ID}Type\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Type");
 //BA.debugLineNum = 349;BA.debugLine="vue.SetStateSingle(pp, varType)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartype));
 //BA.debugLineNum = 350;BA.debugLine="Sparkline.Bind(\":type\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":type",_pp);
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setvalue(anywheresoftware.b4a.objects.collections.List _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 125;BA.debugLine="Sub SetValue(varValue As List) As VMSparkLine";
 //BA.debugLineNum = 126;BA.debugLine="If bStatic Then	Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 127;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 128;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue.getObject()));
 //BA.debugLineNum = 129;BA.debugLine="Sparkline.Bind(\":value\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":value",_pp);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 495;BA.debugLine="Sub SetVElse(vif As String) As VMSparkLine";
 //BA.debugLineNum = 496;BA.debugLine="Sparkline.SetVElse(vif)";
_sparkline._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 497;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 518;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 519;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 520;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 521;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 522;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 523;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 524;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 505;BA.debugLine="Sub SetVhtml(vhtml As String) As VMSparkLine";
 //BA.debugLineNum = 506;BA.debugLine="Sparkline.SetVHtml(vhtml)";
_sparkline._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 507;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 508;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetVIf(vif As String) As VMSparkLine";
 //BA.debugLineNum = 67;BA.debugLine="Sparkline.SetVIf(vif)";
_sparkline._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 581;BA.debugLine="Sub SetVisible(b As Boolean) As VMSparkLine";
 //BA.debugLineNum = 582;BA.debugLine="Sparkline.SetVisible(b)";
_sparkline._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 583;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 584;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetVModel(k As String) As VMSparkLine";
 //BA.debugLineNum = 62;BA.debugLine="Sparkline.SetVModel(k)";
_sparkline._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetVShow(vif As String) As VMSparkLine";
 //BA.debugLineNum = 72;BA.debugLine="Sparkline.SetVShow(vif)";
_sparkline._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 500;BA.debugLine="Sub SetVText(vhtml As String) As VMSparkLine";
 //BA.debugLineNum = 501;BA.debugLine="Sparkline.SetVText(vhtml)";
_sparkline._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 502;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 503;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _setwidth(String _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 355;BA.debugLine="Sub SetWidth(varWidth As String) As VMSparkLine";
 //BA.debugLineNum = 356;BA.debugLine="If varWidth = \"\" Then Return Me";
if ((_varwidth).equals("")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 357;BA.debugLine="If varWidth = \"300\" Then Return Me";
if ((_varwidth).equals("300")) { 
if (true) return (b4j.example.vmsparkline)(this);};
 //BA.debugLineNum = 358;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 359;BA.debugLine="SetAttrSingle(\"width\", varWidth)";
_setattrsingle("width",_varwidth);
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 };
 //BA.debugLineNum = 362;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 363;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varwidth));
 //BA.debugLineNum = 364;BA.debugLine="Sparkline.Bind(\":width\", pp)";
_sparkline._bind /*b4j.example.vmelement*/ (":width",_pp);
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _show() throws Exception{
 //BA.debugLineNum = 376;BA.debugLine="Sub Show As VMSparkLine";
 //BA.debugLineNum = 377;BA.debugLine="Sparkline.SetVisible(True)";
_sparkline._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
anywheresoftware.b4a.objects.collections.List _labels = null;
anywheresoftware.b4a.objects.collections.List _values = null;
String _k = "";
String _v = "";
 //BA.debugLineNum = 42;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 43;BA.debugLine="If hasXY Then";
if (_hasxy) { 
 //BA.debugLineNum = 44;BA.debugLine="Dim labels As List";
_labels = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 45;BA.debugLine="labels.Initialize";
_labels.Initialize();
 //BA.debugLineNum = 46;BA.debugLine="Dim values As List";
_values = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 47;BA.debugLine="values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 49;BA.debugLine="For Each k As String In xy.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _xy.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_k = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 50;BA.debugLine="Dim v As String = xy.Get(k)";
_v = BA.ObjectToString(_xy.Get((Object)(_k)));
 //BA.debugLineNum = 51;BA.debugLine="v = BANano.parseInt(v)";
_v = BA.NumberToString(_banano.parseInt((Object)(_v)));
 //BA.debugLineNum = 52;BA.debugLine="labels.Add(k)";
_labels.Add((Object)(_k));
 //BA.debugLineNum = 53;BA.debugLine="values.Add(v)";
_values.Add((Object)(_v));
 }
};
 //BA.debugLineNum = 55;BA.debugLine="SetLabels(labels)";
_setlabels(_labels);
 //BA.debugLineNum = 56;BA.debugLine="SetValue(values)";
_setvalue(_values);
 };
 //BA.debugLineNum = 58;BA.debugLine="Return Sparkline.ToString";
if (true) return _sparkline._tostring /*String*/ ();
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsparkline  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 408;BA.debugLine="Sub UseTheme(themeName As String) As VMSparkLine";
 //BA.debugLineNum = 409;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 410;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 411;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 412;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 413;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 415;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsparkline)(this);
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
