package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmrating extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmrating", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmrating.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _rating = null;
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
public b4j.example.vmrating  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 124;BA.debugLine="Sub AddChild(child As VMElement) As VMRating";
 //BA.debugLineNum = 125;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 126;BA.debugLine="Rating.SetText(childHTML)";
_rating._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 160;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 161;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 162;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmrating  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub AddClass(c As String) As VMRating";
 //BA.debugLineNum = 143;BA.debugLine="Rating.AddClass(c)";
_rating._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 472;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 473;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 474;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 475;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 476;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 570;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 571;BA.debugLine="Rating.BindStyleSingle(prop, value)";
_rating._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 572;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 573;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 612;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 613;BA.debugLine="Rating.BuildModel(mprops, mstyles, lclasses, loose";
_rating._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 614;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 615;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Rating As VMElement";
_rating = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="Private vmodel As String";
_vmodel = "";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmrating  _disable() throws Exception{
 //BA.debugLineNum = 465;BA.debugLine="Sub Disable As VMRating";
 //BA.debugLineNum = 466;BA.debugLine="Rating.Disable(True)";
_rating._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 467;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 468;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _enable() throws Exception{
 //BA.debugLineNum = 459;BA.debugLine="Sub Enable As VMRating";
 //BA.debugLineNum = 460;BA.debugLine="Rating.Enable(True)";
_rating._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 461;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _hide() throws Exception{
 //BA.debugLineNum = 447;BA.debugLine="Sub Hide As VMRating";
 //BA.debugLineNum = 448;BA.debugLine="Rating.SetVisible(False)";
_rating._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 449;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 450;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 16;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="Rating.Initialize(v, ID)";
_rating._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 18;BA.debugLine="Rating.SetTag(\"v-rating\")";
_rating._settag /*b4j.example.vmelement*/ ("v-rating");
 //BA.debugLineNum = 19;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 21;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="vmodel = \"\"";
_vmodel = "";
 //BA.debugLineNum = 23;BA.debugLine="Rating.typeOf = \"rating\"";
_rating._typeof /*String*/  = "rating";
 //BA.debugLineNum = 24;BA.debugLine="Rating.fieldType = \"dbl\"";
_rating._fieldtype /*String*/  = "dbl";
 //BA.debugLineNum = 25;BA.debugLine="SetOnInput(Module, $\"${ID}_input\"$)";
_setoninput(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_input"));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 138;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmrating  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 527;BA.debugLine="public Sub RemoveAttr(sName As String) As VMRating";
 //BA.debugLineNum = 528;BA.debugLine="Rating.RemoveAttr(sName)";
_rating._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 529;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub Render";
 //BA.debugLineNum = 120;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmrating  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetAttr(attr As Map) As VMRating";
 //BA.debugLineNum = 149;BA.debugLine="Rating.SetAttr(attr)";
_rating._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 590;BA.debugLine="Sub SetAttributes(attrs As List) As VMRating";
 //BA.debugLineNum = 591;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 592;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 594;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 595;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 479;BA.debugLine="Sub SetAttrLoose(loose As String) As VMRating";
 //BA.debugLineNum = 480;BA.debugLine="Rating.SetAttrLoose(loose)";
_rating._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 481;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 482;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 37;BA.debugLine="Rating.SetAttrSingle(prop, value)";
_rating._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setbackgroundcolor(String _varbackgroundcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 167;BA.debugLine="Sub SetBackgroundColor(varBackgroundColor As Strin";
 //BA.debugLineNum = 168;BA.debugLine="If varBackgroundColor = \"\" Then Return Me";
if ((_varbackgroundcolor).equals("")) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 169;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 170;BA.debugLine="SetAttrSingle(\"background-color\", varBackgroundC";
_setattrsingle("background-color",_varbackgroundcolor);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 173;BA.debugLine="Dim pp As String = $\"${ID}BackgroundColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BackgroundColor");
 //BA.debugLineNum = 174;BA.debugLine="vue.SetStateSingle(pp, varBackgroundColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbackgroundcolor));
 //BA.debugLineNum = 175;BA.debugLine="Rating.Bind(\":background-color\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setbackgroundcolorintensity(String _backgroundcolor,String _backgroundintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 512;BA.debugLine="Sub SetBackgroundColorIntensity(backgroundColor As";
 //BA.debugLineNum = 513;BA.debugLine="If backgroundColor = \"\" Then Return Me";
if ((_backgroundcolor).equals("")) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 514;BA.debugLine="Dim scolor As String = $\"${backgroundColor} ${bac";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_backgroundcolor))+" "+__c.SmartStringFormatter("",(Object)(_backgroundintensity))+"");
 //BA.debugLineNum = 515;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 516;BA.debugLine="SetAttrSingle(\"background-color\", scolor)";
_setattrsingle("background-color",_scolor);
 //BA.debugLineNum = 517;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 519;BA.debugLine="Dim pp As String = $\"${ID}BackgroundColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BackgroundColor");
 //BA.debugLineNum = 520;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 521;BA.debugLine="Rating.Bind(\":background-color\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 //BA.debugLineNum = 522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setclearable(boolean _varclearable) throws Exception{
String _pp = "";
 //BA.debugLineNum = 180;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMRat";
 //BA.debugLineNum = 181;BA.debugLine="If varClearable = False Then Return Me";
if (_varclearable==__c.False) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 182;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 183;BA.debugLine="SetAttrSingle(\"clearable\", varClearable)";
_setattrsingle("clearable",BA.ObjectToString(_varclearable));
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 186;BA.debugLine="Dim pp As String = $\"${ID}Clearable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Clearable");
 //BA.debugLineNum = 187;BA.debugLine="vue.SetStateSingle(pp, varClearable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varclearable));
 //BA.debugLineNum = 188;BA.debugLine="Rating.Bind(\":clearable\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":clearable",_pp);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setclosedelay(String _varclosedelay) throws Exception{
String _pp = "";
 //BA.debugLineNum = 193;BA.debugLine="Sub SetCloseDelay(varCloseDelay As String) As VMRa";
 //BA.debugLineNum = 194;BA.debugLine="If varCloseDelay = \"\" Then Return Me";
if ((_varclosedelay).equals("")) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 195;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 196;BA.debugLine="SetAttrSingle(\"close-delay\", varCloseDelay)";
_setattrsingle("close-delay",_varclosedelay);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 199;BA.debugLine="Dim pp As String = $\"${ID}CloseDelay\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CloseDelay");
 //BA.debugLineNum = 200;BA.debugLine="vue.SetStateSingle(pp, varCloseDelay)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varclosedelay));
 //BA.debugLineNum = 201;BA.debugLine="Rating.Bind(\":close-delay\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":close-delay",_pp);
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setcolor(String _color) throws Exception{
String _pp = "";
 //BA.debugLineNum = 206;BA.debugLine="Sub SetColor(color As String) As VMRating";
 //BA.debugLineNum = 207;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 208;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 209;BA.debugLine="SetAttrSingle(\"color\", color)";
_setattrsingle("color",_color);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 212;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 213;BA.debugLine="vue.SetStateSingle(pp, color)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_color));
 //BA.debugLineNum = 214;BA.debugLine="Rating.Bind(\":color\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 497;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 498;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 499;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 500;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 501;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 502;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 504;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 505;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 506;BA.debugLine="Rating.Bind(\":color\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 507;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 508;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 219;BA.debugLine="Sub SetDark(varDark As Boolean) As VMRating";
 //BA.debugLineNum = 220;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 221;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 222;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 225;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 226;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 227;BA.debugLine="Rating.Bind(\":dark\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 30;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setdense(boolean _vardense) throws Exception{
String _pp = "";
 //BA.debugLineNum = 232;BA.debugLine="Sub SetDense(varDense As Boolean) As VMRating";
 //BA.debugLineNum = 233;BA.debugLine="If varDense = False Then Return Me";
if (_vardense==__c.False) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 234;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 235;BA.debugLine="SetAttrSingle(\"dense\", varDense)";
_setattrsingle("dense",BA.ObjectToString(_vardense));
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 238;BA.debugLine="Dim pp As String = $\"${ID}Dense\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dense");
 //BA.debugLineNum = 239;BA.debugLine="vue.SetStateSingle(pp, varDense)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardense));
 //BA.debugLineNum = 240;BA.debugLine="Rating.Bind(\":dense\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":dense",_pp);
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 545;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMRating";
 //BA.debugLineNum = 546;BA.debugLine="Rating.SetDesignMode(b)";
_rating._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 547;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 548;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 549;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 74;BA.debugLine="Rating.SetDeviceOffsets(OS, OM, OL, OX)";
_rating._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 86;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 87;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 80;BA.debugLine="Rating.SetDeviceSizes(SS, SM, SL, SX)";
_rating._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setemptyicon(String _varemptyicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 245;BA.debugLine="Sub SetEmptyIcon(varEmptyIcon As String) As VMRati";
 //BA.debugLineNum = 246;BA.debugLine="If varEmptyIcon = \"\" Then Return Me";
if ((_varemptyicon).equals("")) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 247;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 248;BA.debugLine="SetAttrSingle(\"empty-icon\", varEmptyIcon)";
_setattrsingle("empty-icon",_varemptyicon);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 251;BA.debugLine="Dim pp As String = $\"${ID}EmptyIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"EmptyIcon");
 //BA.debugLineNum = 252;BA.debugLine="vue.SetStateSingle(pp, varEmptyIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varemptyicon));
 //BA.debugLineNum = 253;BA.debugLine="Rating.Bind(\":empty-icon\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":empty-icon",_pp);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setfieldtype(String _ft) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetFieldType(ft As String) As VMRating";
 //BA.debugLineNum = 55;BA.debugLine="Rating.fieldType = ft";
_rating._fieldtype /*String*/  = _ft;
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setfullicon(String _varfullicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 258;BA.debugLine="Sub SetFullIcon(varFullIcon As String) As VMRating";
 //BA.debugLineNum = 259;BA.debugLine="If varFullIcon = \"\" Then Return Me";
if ((_varfullicon).equals("")) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 260;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 261;BA.debugLine="SetAttrSingle(\"full-icon\", varFullIcon)";
_setattrsingle("full-icon",_varfullicon);
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 264;BA.debugLine="Dim pp As String = $\"${ID}FullIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"FullIcon");
 //BA.debugLineNum = 265;BA.debugLine="vue.SetStateSingle(pp, varFullIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfullicon));
 //BA.debugLineNum = 266;BA.debugLine="Rating.Bind(\":full-icon\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":full-icon",_pp);
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _sethalficon(String _varhalficon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 271;BA.debugLine="Sub SetHalfIcon(varHalfIcon As String) As VMRating";
 //BA.debugLineNum = 272;BA.debugLine="If varHalfIcon = \"\" Then Return Me";
if ((_varhalficon).equals("")) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 273;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 274;BA.debugLine="SetAttrSingle(\"half-icon\", varHalfIcon)";
_setattrsingle("half-icon",_varhalficon);
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 277;BA.debugLine="Dim pp As String = $\"${ID}HalfIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HalfIcon");
 //BA.debugLineNum = 278;BA.debugLine="vue.SetStateSingle(pp, varHalfIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhalficon));
 //BA.debugLineNum = 279;BA.debugLine="Rating.Bind(\":half-icon\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":half-icon",_pp);
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _sethalfincrements(boolean _varhalfincrements) throws Exception{
String _pp = "";
 //BA.debugLineNum = 284;BA.debugLine="Sub SetHalfIncrements(varHalfIncrements As Boolean";
 //BA.debugLineNum = 285;BA.debugLine="If varHalfIncrements = False Then Return Me";
if (_varhalfincrements==__c.False) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 286;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 287;BA.debugLine="SetAttrSingle(\"half-increments\", varHalfIncremen";
_setattrsingle("half-increments",BA.ObjectToString(_varhalfincrements));
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 290;BA.debugLine="Dim pp As String = $\"${ID}HalfIncrements\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HalfIncrements");
 //BA.debugLineNum = 291;BA.debugLine="vue.SetStateSingle(pp, varHalfIncrements)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhalfincrements));
 //BA.debugLineNum = 292;BA.debugLine="Rating.Bind(\":half-increments\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":half-increments",_pp);
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _sethover(boolean _varhover) throws Exception{
String _pp = "";
 //BA.debugLineNum = 297;BA.debugLine="Sub SetHover(varHover As Boolean) As VMRating";
 //BA.debugLineNum = 298;BA.debugLine="If varHover = False Then Return Me";
if (_varhover==__c.False) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 299;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 300;BA.debugLine="SetAttrSingle(\"hover\", varHover)";
_setattrsingle("hover",BA.ObjectToString(_varhover));
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 303;BA.debugLine="Dim pp As String = $\"${ID}Hover\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Hover");
 //BA.debugLineNum = 304;BA.debugLine="vue.SetStateSingle(pp, varHover)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhover));
 //BA.debugLineNum = 305;BA.debugLine="Rating.Bind(\":hover\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":hover",_pp);
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 606;BA.debugLine="Sub SetKey(k As String) As VMRating";
 //BA.debugLineNum = 607;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 608;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 609;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 610;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setlarge(boolean _varlarge) throws Exception{
String _pp = "";
 //BA.debugLineNum = 310;BA.debugLine="Sub SetLarge(varLarge As Boolean) As VMRating";
 //BA.debugLineNum = 311;BA.debugLine="If varLarge = False Then Return Me";
if (_varlarge==__c.False) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 312;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 313;BA.debugLine="SetAttrSingle(\"large\", varLarge)";
_setattrsingle("large",BA.ObjectToString(_varlarge));
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 316;BA.debugLine="Dim pp As String = $\"${ID}Large\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Large");
 //BA.debugLineNum = 317;BA.debugLine="vue.SetStateSingle(pp, varLarge)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlarge));
 //BA.debugLineNum = 318;BA.debugLine="Rating.Bind(\":large\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":large",_pp);
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setlength(String _varlength) throws Exception{
String _pp = "";
 //BA.debugLineNum = 323;BA.debugLine="Sub SetLength(varLength As String) As VMRating";
 //BA.debugLineNum = 324;BA.debugLine="If varLength = \"\" Then Return Me";
if ((_varlength).equals("")) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 325;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 326;BA.debugLine="SetAttrSingle(\"length\", varLength)";
_setattrsingle("length",_varlength);
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 329;BA.debugLine="Dim pp As String = $\"${ID}Length\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Length");
 //BA.debugLineNum = 330;BA.debugLine="vue.SetStateSingle(pp, varLength)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlength));
 //BA.debugLineNum = 331;BA.debugLine="Rating.Bind(\":length\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":length",_pp);
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 336;BA.debugLine="Sub SetLight(varLight As Boolean) As VMRating";
 //BA.debugLineNum = 337;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 338;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 339;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 342;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 343;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 344;BA.debugLine="Rating.Bind(\":light\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 539;BA.debugLine="Sub SetMarginAll(p As String) As VMRating";
 //BA.debugLineNum = 540;BA.debugLine="Rating.setmarginall(p)";
_rating._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 541;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 542;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 558;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 559;BA.debugLine="Rating.SetName(varName, bbind)";
_rating._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 560;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 561;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setoninput(Object _eventhandler,String _methodname) throws Exception{
Object _value = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 41;BA.debugLine="Sub SetOnInput(eventHandler As Object,methodName A";
 //BA.debugLineNum = 42;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 43;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 44;BA.debugLine="Dim value As Object";
_value = new Object();
 //BA.debugLineNum = 45;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_value}))));
 //BA.debugLineNum = 46;BA.debugLine="SetAttr(CreateMap(\"@input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_methodname)}));
 //BA.debugLineNum = 48;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setopendelay(String _varopendelay) throws Exception{
String _pp = "";
 //BA.debugLineNum = 349;BA.debugLine="Sub SetOpenDelay(varOpenDelay As String) As VMRati";
 //BA.debugLineNum = 350;BA.debugLine="If varOpenDelay = \"\" Then Return Me";
if ((_varopendelay).equals("")) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 351;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 352;BA.debugLine="SetAttrSingle(\"open-delay\", varOpenDelay)";
_setattrsingle("open-delay",_varopendelay);
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 355;BA.debugLine="Dim pp As String = $\"${ID}OpenDelay\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OpenDelay");
 //BA.debugLineNum = 356;BA.debugLine="vue.SetStateSingle(pp, varOpenDelay)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varopendelay));
 //BA.debugLineNum = 357;BA.debugLine="Rating.Bind(\":open-delay\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":open-delay",_pp);
 //BA.debugLineNum = 358;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 533;BA.debugLine="Sub SetPaddingAll(p As String) As VMRating";
 //BA.debugLineNum = 534;BA.debugLine="Rating.SetPaddingAll(p)";
_rating._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 535;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 536;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMRat";
 //BA.debugLineNum = 68;BA.debugLine="Rating.SetRC(sRow, sCol)";
_rating._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setreadonly(boolean _varreadonly) throws Exception{
String _pp = "";
 //BA.debugLineNum = 362;BA.debugLine="Sub SetReadonly(varReadonly As Boolean) As VMRatin";
 //BA.debugLineNum = 363;BA.debugLine="If varReadonly = False Then Return Me";
if (_varreadonly==__c.False) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 364;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 365;BA.debugLine="SetAttrSingle(\"readonly\", varReadonly)";
_setattrsingle("readonly",BA.ObjectToString(_varreadonly));
 //BA.debugLineNum = 366;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 368;BA.debugLine="Dim pp As String = $\"${ID}Readonly\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Readonly");
 //BA.debugLineNum = 369;BA.debugLine="vue.SetStateSingle(pp, varReadonly)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreadonly));
 //BA.debugLineNum = 370;BA.debugLine="Rating.Bind(\":readonly\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":readonly",_pp);
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setripple(boolean _varripple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 375;BA.debugLine="Sub SetRipple(varRipple As Boolean) As VMRating";
 //BA.debugLineNum = 376;BA.debugLine="If varRipple Then Return Me";
if (_varripple) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 377;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 378;BA.debugLine="SetAttrSingle(\"ripple\", varRipple)";
_setattrsingle("ripple",BA.ObjectToString(_varripple));
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 381;BA.debugLine="Dim pp As String = $\"${ID}Ripple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Ripple");
 //BA.debugLineNum = 382;BA.debugLine="vue.SetStateSingle(pp, varRipple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varripple));
 //BA.debugLineNum = 383;BA.debugLine="Rating.Bind(\":ripple\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":ripple",_pp);
 //BA.debugLineNum = 384;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setsize(String _varsize) throws Exception{
String _pp = "";
 //BA.debugLineNum = 388;BA.debugLine="Sub SetSize(varSize As String) As VMRating";
 //BA.debugLineNum = 389;BA.debugLine="If varSize = \"\" Then Return Me";
if ((_varsize).equals("")) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 390;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 391;BA.debugLine="SetAttrSingle(\"size\", varSize)";
_setattrsingle("size",_varsize);
 //BA.debugLineNum = 392;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 394;BA.debugLine="Dim pp As String = $\"${ID}Size\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Size");
 //BA.debugLineNum = 395;BA.debugLine="vue.SetStateSingle(pp, varSize)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsize));
 //BA.debugLineNum = 396;BA.debugLine="Rating.Bind(\":size\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":size",_pp);
 //BA.debugLineNum = 397;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setsmall(boolean _varsmall) throws Exception{
String _pp = "";
 //BA.debugLineNum = 401;BA.debugLine="Sub SetSmall(varSmall As Boolean) As VMRating";
 //BA.debugLineNum = 402;BA.debugLine="If varSmall = False Then Return Me";
if (_varsmall==__c.False) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 403;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 404;BA.debugLine="SetAttrSingle(\"small\", varSmall)";
_setattrsingle("small",BA.ObjectToString(_varsmall));
 //BA.debugLineNum = 405;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 407;BA.debugLine="Dim pp As String = $\"${ID}Small\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Small");
 //BA.debugLineNum = 408;BA.debugLine="vue.SetStateSingle(pp, varSmall)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsmall));
 //BA.debugLineNum = 409;BA.debugLine="Rating.Bind(\":small\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":small",_pp);
 //BA.debugLineNum = 410;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetStatic(b As Boolean) As VMRating";
 //BA.debugLineNum = 61;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 62;BA.debugLine="Rating.SetStatic(b)";
_rating._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetStyle(sm As Map) As VMRating";
 //BA.debugLineNum = 155;BA.debugLine="Rating.SetStyle(sm)";
_rating._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 564;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 565;BA.debugLine="Rating.SetStyleSingle(prop, value)";
_rating._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 566;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 567;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 552;BA.debugLine="Sub SetTabIndex(ti As String) As VMRating";
 //BA.debugLineNum = 553;BA.debugLine="Rating.SetTabIndex(ti)";
_rating._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 554;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 555;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetText(t As Object) As VMRating";
 //BA.debugLineNum = 132;BA.debugLine="Rating.SetText(t)";
_rating._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 414;BA.debugLine="Sub SetValue(varValue As String) As VMRating";
 //BA.debugLineNum = 415;BA.debugLine="Rating.SetValue(varValue, False)";
_rating._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 416;BA.debugLine="vue.SetData(vmodel, varValue)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(_varvalue));
 //BA.debugLineNum = 417;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 418;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 575;BA.debugLine="Sub SetVElse(vif As String) As VMRating";
 //BA.debugLineNum = 576;BA.debugLine="Rating.SetVElse(vif)";
_rating._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 577;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 578;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 598;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 599;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 600;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 601;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 602;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 603;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 604;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 585;BA.debugLine="Sub SetVhtml(vhtml As String) As VMRating";
 //BA.debugLineNum = 586;BA.debugLine="Rating.SetVHtml(vhtml)";
_rating._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 587;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 588;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetVIf(vif As String) As VMRating";
 //BA.debugLineNum = 109;BA.debugLine="Rating.SetVIf(vif)";
_rating._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 617;BA.debugLine="Sub SetVisible(b As Boolean) As VMRating";
 //BA.debugLineNum = 618;BA.debugLine="Rating.SetVisible(b)";
_rating._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 619;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 620;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetVModel(k As String) As VMRating";
 //BA.debugLineNum = 103;BA.debugLine="vmodel = k.tolowercase";
_vmodel = _k.toLowerCase();
 //BA.debugLineNum = 104;BA.debugLine="Rating.SetVModel(k)";
_rating._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetVShow(vif As String) As VMRating";
 //BA.debugLineNum = 114;BA.debugLine="Rating.SetVShow(vif)";
_rating._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 580;BA.debugLine="Sub SetVText(vhtml As String) As VMRating";
 //BA.debugLineNum = 581;BA.debugLine="Rating.SetVText(vhtml)";
_rating._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 582;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 583;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setxlarge(boolean _varxlarge) throws Exception{
String _pp = "";
 //BA.debugLineNum = 421;BA.debugLine="Sub SetXLarge(varXLarge As Boolean) As VMRating";
 //BA.debugLineNum = 422;BA.debugLine="If varXLarge = False Then Return Me";
if (_varxlarge==__c.False) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 423;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 424;BA.debugLine="SetAttrSingle(\"x-large\", varXLarge)";
_setattrsingle("x-large",BA.ObjectToString(_varxlarge));
 //BA.debugLineNum = 425;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 427;BA.debugLine="Dim pp As String = $\"${ID}XLarge\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"XLarge");
 //BA.debugLineNum = 428;BA.debugLine="vue.SetStateSingle(pp, varXLarge)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varxlarge));
 //BA.debugLineNum = 429;BA.debugLine="Rating.Bind(\":x-large\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":x-large",_pp);
 //BA.debugLineNum = 430;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _setxsmall(boolean _varxsmall) throws Exception{
String _pp = "";
 //BA.debugLineNum = 434;BA.debugLine="Sub SetXSmall(varXSmall As Boolean) As VMRating";
 //BA.debugLineNum = 435;BA.debugLine="If varXSmall = False Then Return Me";
if (_varxsmall==__c.False) { 
if (true) return (b4j.example.vmrating)(this);};
 //BA.debugLineNum = 436;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 437;BA.debugLine="SetAttrSingle(\"x-small\", varXSmall)";
_setattrsingle("x-small",BA.ObjectToString(_varxsmall));
 //BA.debugLineNum = 438;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 };
 //BA.debugLineNum = 440;BA.debugLine="Dim pp As String = $\"${ID}XSmall\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"XSmall");
 //BA.debugLineNum = 441;BA.debugLine="vue.SetStateSingle(pp, varXSmall)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varxsmall));
 //BA.debugLineNum = 442;BA.debugLine="Rating.Bind(\":x-small\", pp)";
_rating._bind /*b4j.example.vmelement*/ (":x-small",_pp);
 //BA.debugLineNum = 443;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _show() throws Exception{
 //BA.debugLineNum = 453;BA.debugLine="Sub Show As VMRating";
 //BA.debugLineNum = 454;BA.debugLine="Rating.SetVisible(True)";
_rating._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 455;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 92;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 93;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 94;BA.debugLine="Dim eName As String = $\"${ID}_input\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_input");
 //BA.debugLineNum = 95;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 96;BA.debugLine="Log($\"VMRating.${eName} event has not been defin";
__c.Log(("VMRating."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 99;BA.debugLine="Return Rating.ToString";
if (true) return _rating._tostring /*String*/ ();
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmrating  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 485;BA.debugLine="Sub UseTheme(themeName As String) As VMRating";
 //BA.debugLineNum = 486;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 487;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 488;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 489;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 490;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 492;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrating)(this);
 //BA.debugLineNum = 493;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
