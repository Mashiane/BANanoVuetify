package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmsnackbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmsnackbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmsnackbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _snackbar = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public b4j.example.vmbutton _button = null;
public String _mkey = "";
public String _mname = "";
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
public b4j.example.vmsnackbar  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 243;BA.debugLine="Sub AddChild(child As VMElement) As VMSnackBar";
 //BA.debugLineNum = 244;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 245;BA.debugLine="SnackBar.SetText(childHTML)";
_snackbar._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 279;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 280;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 281;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsnackbar  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub AddClass(c As String) As VMSnackBar";
 //BA.debugLineNum = 262;BA.debugLine="SnackBar.AddClass(c)";
_snackbar._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 478;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 479;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 480;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsnackbar  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 426;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 427;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 428;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 429;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 430;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 482;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 483;BA.debugLine="SnackBar.BuildModel(mprops, mstyles, lclasses, loo";
_snackbar._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 484;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 485;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public SnackBar As VMElement";
_snackbar = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean  'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Public Button As VMButton";
_button = new b4j.example.vmbutton();
 //BA.debugLineNum = 10;BA.debugLine="Private mKey As String";
_mkey = "";
 //BA.debugLineNum = 11;BA.debugLine="Private mName As String";
_mname = "";
 //BA.debugLineNum = 12;BA.debugLine="Private smodel As String";
_smodel = "";
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsnackbar  _disable() throws Exception{
 //BA.debugLineNum = 419;BA.debugLine="Sub Disable As VMSnackBar";
 //BA.debugLineNum = 420;BA.debugLine="SnackBar.Disable(True)";
_snackbar._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 421;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 422;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _enable() throws Exception{
 //BA.debugLineNum = 414;BA.debugLine="Sub Enable As VMSnackBar";
 //BA.debugLineNum = 415;BA.debugLine="SnackBar.Enable(True)";
_snackbar._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 416;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 417;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _hide() throws Exception{
 //BA.debugLineNum = 404;BA.debugLine="Sub Hide As VMSnackBar";
 //BA.debugLineNum = 405;BA.debugLine="vue.SetStateSingle(smodel, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_smodel,(Object)(__c.False));
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 17;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 18;BA.debugLine="SnackBar.Initialize(v, ID)";
_snackbar._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 19;BA.debugLine="SnackBar.SetTag(\"v-snackbar\")";
_snackbar._settag /*b4j.example.vmelement*/ ("v-snackbar");
 //BA.debugLineNum = 20;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 22;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 23;BA.debugLine="mKey = $\"${ID}message\"$";
_mkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"message");
 //BA.debugLineNum = 24;BA.debugLine="vue.SetStateSingle(mKey, Null)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_mkey,__c.Null);
 //BA.debugLineNum = 25;BA.debugLine="SetText($\"{{ ${mKey} }}\"$)";
_settext(("{{ "+__c.SmartStringFormatter("",(Object)(_mkey))+" }}"));
 //BA.debugLineNum = 26;BA.debugLine="Button.Initialize(vue, \"snackbutton\", Me).SetColo";
_button._initialize /*b4j.example.vmbutton*/ (ba,_vue,"snackbutton",this)._setcolor /*b4j.example.vmbutton*/ ("");
 //BA.debugLineNum = 27;BA.debugLine="Button.hide";
_button._hide /*b4j.example.vmbutton*/ ();
 //BA.debugLineNum = 28;BA.debugLine="Button.SetLabel(\"Ok\")";
_button._setlabel /*b4j.example.vmbutton*/ ("Ok");
 //BA.debugLineNum = 29;BA.debugLine="SetVModel(SnackBar.showkey)";
_setvmodel(_snackbar._showkey /*String*/ );
 //BA.debugLineNum = 30;BA.debugLine="Hide";
_hide();
 //BA.debugLineNum = 31;BA.debugLine="mName = \"\"";
_mname = "";
 //BA.debugLineNum = 32;BA.debugLine="SetTop(False)";
_settop(__c.False);
 //BA.debugLineNum = 33;BA.debugLine="SetBottom(False)";
_setbottom(__c.False);
 //BA.debugLineNum = 34;BA.debugLine="SetRight(False)";
_setright(__c.False);
 //BA.debugLineNum = 35;BA.debugLine="SetLeft(False)";
_setleft(__c.False);
 //BA.debugLineNum = 36;BA.debugLine="SetCentered(False)";
_setcentered(__c.False);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 257;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsnackbar  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 433;BA.debugLine="public Sub RemoveAttr(sName As String) As VMSnackB";
 //BA.debugLineNum = 434;BA.debugLine="SnackBar.RemoveAttr(sName)";
_snackbar._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 435;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _removevmodel() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub RemoveVModel As VMSnackBar";
 //BA.debugLineNum = 46;BA.debugLine="RemoveAttr(\"v-model\")";
_removeattr("v-model");
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub Render";
 //BA.debugLineNum = 239;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return "";
}
public String  _reset() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub Reset";
 //BA.debugLineNum = 119;BA.debugLine="SetBottom(False)";
_setbottom(__c.False);
 //BA.debugLineNum = 120;BA.debugLine="SetLeft(False)";
_setleft(__c.False);
 //BA.debugLineNum = 121;BA.debugLine="SetTop(False)";
_settop(__c.False);
 //BA.debugLineNum = 122;BA.debugLine="SetRight(False)";
_setright(__c.False);
 //BA.debugLineNum = 123;BA.debugLine="SetCentered(False)";
_setcentered(__c.False);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsnackbar  _setabsolute(boolean _varabsolute) throws Exception{
String _pp = "";
 //BA.debugLineNum = 286;BA.debugLine="Sub SetAbsolute(varAbsolute As Boolean) As VMSnack";
 //BA.debugLineNum = 287;BA.debugLine="Dim pp As String = $\"${ID}Absolute\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Absolute");
 //BA.debugLineNum = 288;BA.debugLine="vue.SetStateSingle(pp, varAbsolute)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varabsolute));
 //BA.debugLineNum = 289;BA.debugLine="SnackBar.Bind(\":absolute\", pp)";
_snackbar._bind /*b4j.example.vmelement*/ (":absolute",_pp);
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub SetAttr(attr As Map) As VMSnackBar";
 //BA.debugLineNum = 268;BA.debugLine="SnackBar.SetAttr(attr)";
_snackbar._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 171;BA.debugLine="Sub SetAttributes(attrs As List) As VMSnackBar";
 //BA.debugLineNum = 172;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 173;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetAttrLoose(loose As String) As VMSnackBar";
 //BA.debugLineNum = 167;BA.debugLine="SnackBar.SetAttrLoose(loose)";
_snackbar._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 472;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 473;BA.debugLine="SnackBar.SetAttrSingle(prop, value)";
_snackbar._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setbottom(boolean _varbottom) throws Exception{
String _pp = "";
 //BA.debugLineNum = 294;BA.debugLine="Sub SetBottom(varBottom As Boolean) As VMSnackBar";
 //BA.debugLineNum = 295;BA.debugLine="Dim pp As String = $\"${ID}Bottom\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Bottom");
 //BA.debugLineNum = 296;BA.debugLine="vue.SetStateSingle(pp, varBottom)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbottom));
 //BA.debugLineNum = 297;BA.debugLine="SnackBar.Bind(\":bottom\", pp)";
_snackbar._bind /*b4j.example.vmelement*/ (":bottom",_pp);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setbottomleft(boolean _b) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetBottomLeft(b As Boolean) As VMSnackBar";
 //BA.debugLineNum = 127;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmsnackbar)(this);};
 //BA.debugLineNum = 128;BA.debugLine="SetBottom(True)";
_setbottom(__c.True);
 //BA.debugLineNum = 129;BA.debugLine="SetLeft(True)";
_setleft(__c.True);
 //BA.debugLineNum = 130;BA.debugLine="SetTop(False)";
_settop(__c.False);
 //BA.debugLineNum = 131;BA.debugLine="SetRight(False)";
_setright(__c.False);
 //BA.debugLineNum = 132;BA.debugLine="SetCentered(False)";
_setcentered(__c.False);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setbottomright(boolean _b) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetBottomRight(b As Boolean) As VMSnackBar";
 //BA.debugLineNum = 137;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmsnackbar)(this);};
 //BA.debugLineNum = 138;BA.debugLine="SetBottom(True)";
_setbottom(__c.True);
 //BA.debugLineNum = 139;BA.debugLine="SetLeft(False)";
_setleft(__c.False);
 //BA.debugLineNum = 140;BA.debugLine="SetTop(False)";
_settop(__c.False);
 //BA.debugLineNum = 141;BA.debugLine="SetRight(True)";
_setright(__c.True);
 //BA.debugLineNum = 142;BA.debugLine="SetCentered(False)";
_setcentered(__c.False);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setcentered(boolean _vartop) throws Exception{
String _pp = "";
 //BA.debugLineNum = 351;BA.debugLine="Sub SetCentered(varTop As Boolean) As VMSnackBar";
 //BA.debugLineNum = 352;BA.debugLine="Dim pp As String = $\"${ID}Centered\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Centered");
 //BA.debugLineNum = 353;BA.debugLine="vue.SetStateSingle(pp, varTop)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartop));
 //BA.debugLineNum = 354;BA.debugLine="SnackBar.Bind(\":centered\", pp)";
_snackbar._bind /*b4j.example.vmelement*/ (":centered",_pp);
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 302;BA.debugLine="Sub SetColor(varColor As String) As VMSnackBar";
 //BA.debugLineNum = 303;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 304;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 305;BA.debugLine="SnackBar.Bind(\":color\", pp)";
_snackbar._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 206;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 207;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 208;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 209;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 210;BA.debugLine="SnackBar.Bind(\":color\", pp)";
_snackbar._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 41;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 449;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMSnackBar";
 //BA.debugLineNum = 450;BA.debugLine="SnackBar.SetDesignMode(b)";
_snackbar._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 451;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 452;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 453;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 101;BA.debugLine="SnackBar.SetDeviceOffsets(OS, OM, OL, OX)";
_snackbar._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 113;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 114;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 107;BA.debugLine="SnackBar.SetDeviceSizes(SS, SM, SL, SX)";
_snackbar._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setelevation(String _varelevation) throws Exception{
String _pp = "";
 //BA.debugLineNum = 369;BA.debugLine="Sub SetElevation(varElevation As String) As VMSnac";
 //BA.debugLineNum = 370;BA.debugLine="If varElevation = \"\" Then Return Me";
if ((_varelevation).equals("")) { 
if (true) return (b4j.example.vmsnackbar)(this);};
 //BA.debugLineNum = 371;BA.debugLine="Dim pp As String = $\"${ID}Elevation\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Elevation");
 //BA.debugLineNum = 372;BA.debugLine="vue.SetStateSingle(pp, varElevation)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varelevation));
 //BA.debugLineNum = 373;BA.debugLine="SnackBar.Bind(\":elevation\", pp)";
_snackbar._bind /*b4j.example.vmelement*/ (":elevation",_pp);
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setlabel(String _mlabel) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetLabel(mLabel As String) As VMSnackBar";
 //BA.debugLineNum = 52;BA.debugLine="vue.SetData(mKey, mLabel)";
_vue._setdata /*b4j.example.bananovue*/ (_mkey,(Object)(_mlabel));
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setleft(boolean _varleft) throws Exception{
String _pp = "";
 //BA.debugLineNum = 310;BA.debugLine="Sub SetLeft(varLeft As Boolean) As VMSnackBar";
 //BA.debugLineNum = 311;BA.debugLine="Dim pp As String = $\"${ID}Left\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Left");
 //BA.debugLineNum = 312;BA.debugLine="vue.SetStateSingle(pp, varLeft)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varleft));
 //BA.debugLineNum = 313;BA.debugLine="SnackBar.Bind(\":left\", pp)";
_snackbar._bind /*b4j.example.vmelement*/ (":left",_pp);
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 444;BA.debugLine="Sub SetMarginAll(p As String) As VMSnackBar";
 //BA.debugLineNum = 445;BA.debugLine="SnackBar.setmarginall(p)";
_snackbar._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 446;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setmultiline(boolean _varmultiline) throws Exception{
String _pp = "";
 //BA.debugLineNum = 318;BA.debugLine="Sub SetMultiLine(varMultiLine As Boolean) As VMSna";
 //BA.debugLineNum = 319;BA.debugLine="Dim pp As String = $\"${ID}MultiLine\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MultiLine");
 //BA.debugLineNum = 320;BA.debugLine="vue.SetStateSingle(pp, varMultiLine)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmultiline));
 //BA.debugLineNum = 321;BA.debugLine="SnackBar.Bind(\":multi-line\", pp)";
_snackbar._bind /*b4j.example.vmelement*/ (":multi-line",_pp);
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 461;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 462;BA.debugLine="SnackBar.SetName(varName, bbind)";
_snackbar._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 463;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setonclick(String _methodname) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetOnClick(methodName As String) As VMSnackBar";
 //BA.debugLineNum = 180;BA.debugLine="mName = methodName.ToLowerCase";
_mname = _methodname.toLowerCase();
 //BA.debugLineNum = 181;BA.debugLine="Button.show";
_button._show /*b4j.example.vmbutton*/ ();
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setoninput(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 392;BA.debugLine="Sub SetOnInput(methodName As String) As VMSnackBar";
 //BA.debugLineNum = 393;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 394;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmsnackbar)(this);};
 //BA.debugLineNum = 395;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 396;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 397;BA.debugLine="SetAttr(CreateMap(\"@input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_methodname)}));
 //BA.debugLineNum = 399;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 400;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setoutlined(boolean _varoutlined) throws Exception{
String _pp = "";
 //BA.debugLineNum = 360;BA.debugLine="Sub SetOutlined(varOutlined As Boolean) As VMSnack";
 //BA.debugLineNum = 361;BA.debugLine="Dim pp As String = $\"${ID}Outlined\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Outlined");
 //BA.debugLineNum = 362;BA.debugLine="vue.SetStateSingle(pp, varOutlined)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoutlined));
 //BA.debugLineNum = 363;BA.debugLine="SnackBar.Bind(\":outlined\", pp)";
_snackbar._bind /*b4j.example.vmelement*/ (":outlined",_pp);
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 439;BA.debugLine="Sub SetPaddingAll(p As String) As VMSnackBar";
 //BA.debugLineNum = 440;BA.debugLine="SnackBar.SetPaddingAll(p)";
_snackbar._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 441;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 442;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMSna";
 //BA.debugLineNum = 95;BA.debugLine="SnackBar.SetRC(sRow, sCol)";
_snackbar._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setright(boolean _varright) throws Exception{
String _pp = "";
 //BA.debugLineNum = 326;BA.debugLine="Sub SetRight(varRight As Boolean) As VMSnackBar";
 //BA.debugLineNum = 327;BA.debugLine="Dim pp As String = $\"${ID}Right\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Right");
 //BA.debugLineNum = 328;BA.debugLine="vue.SetStateSingle(pp, varRight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varright));
 //BA.debugLineNum = 329;BA.debugLine="SnackBar.Bind(\":right\", pp)";
_snackbar._bind /*b4j.example.vmelement*/ (":right",_pp);
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setrounded(Object _varrounded) throws Exception{
String _pp = "";
 //BA.debugLineNum = 84;BA.debugLine="Sub SetRounded(varRounded As Object) As VMSnackBar";
 //BA.debugLineNum = 85;BA.debugLine="If varRounded = False Then Return Me";
if ((_varrounded).equals((Object)(__c.False))) { 
if (true) return (b4j.example.vmsnackbar)(this);};
 //BA.debugLineNum = 86;BA.debugLine="Dim pp As String = $\"${ID}Rounded\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Rounded");
 //BA.debugLineNum = 87;BA.debugLine="vue.SetStateSingle(pp, varRounded)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varrounded);
 //BA.debugLineNum = 88;BA.debugLine="SnackBar.Bind(\":rounded\", pp)";
_snackbar._bind /*b4j.example.vmelement*/ (":rounded",_pp);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setshaped(boolean _varshaped) throws Exception{
String _pp = "";
 //BA.debugLineNum = 57;BA.debugLine="Sub SetShaped(varShaped As Boolean) As VMSnackBar";
 //BA.debugLineNum = 58;BA.debugLine="If varShaped = False Then Return Me";
if (_varshaped==__c.False) { 
if (true) return (b4j.example.vmsnackbar)(this);};
 //BA.debugLineNum = 59;BA.debugLine="Dim pp As String = $\"${ID}Shaped\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Shaped");
 //BA.debugLineNum = 60;BA.debugLine="vue.SetStateSingle(pp, varShaped)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshaped));
 //BA.debugLineNum = 61;BA.debugLine="SnackBar.Bind(\":shaped\", pp)";
_snackbar._bind /*b4j.example.vmelement*/ (":shaped",_pp);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetStyle(sm As Map) As VMSnackBar";
 //BA.debugLineNum = 274;BA.debugLine="SnackBar.SetStyle(sm)";
_snackbar._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 467;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 468;BA.debugLine="SnackBar.SetStyleSingle(prop, value)";
_snackbar._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 469;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 470;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 455;BA.debugLine="Sub SetTabIndex(ti As String) As VMSnackBar";
 //BA.debugLineNum = 456;BA.debugLine="SnackBar.SetTabIndex(ti)";
_snackbar._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 457;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _settext(String _t) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub SetText(t As String) As VMSnackBar";
 //BA.debugLineNum = 251;BA.debugLine="SnackBar.SetText(t)";
_snackbar._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _settext1(boolean _varshaped) throws Exception{
String _pp = "";
 //BA.debugLineNum = 66;BA.debugLine="Sub SetText1(varShaped As Boolean) As VMSnackBar";
 //BA.debugLineNum = 67;BA.debugLine="If varShaped = False Then Return Me";
if (_varshaped==__c.False) { 
if (true) return (b4j.example.vmsnackbar)(this);};
 //BA.debugLineNum = 68;BA.debugLine="Dim pp As String = $\"${ID}Text\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Text");
 //BA.debugLineNum = 69;BA.debugLine="vue.SetStateSingle(pp, varShaped)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshaped));
 //BA.debugLineNum = 70;BA.debugLine="SnackBar.Bind(\":text\", pp)";
_snackbar._bind /*b4j.example.vmelement*/ (":text",_pp);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 492;BA.debugLine="Sub SetTextColor(varColor As String) As VMSnackBar";
 //BA.debugLineNum = 493;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 494;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 495;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 496;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 499;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 500;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 501;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 502;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 503;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 504;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _settile(boolean _varshaped) throws Exception{
String _pp = "";
 //BA.debugLineNum = 75;BA.debugLine="Sub SetTile(varShaped As Boolean) As VMSnackBar";
 //BA.debugLineNum = 76;BA.debugLine="If varShaped = False Then Return Me";
if (_varshaped==__c.False) { 
if (true) return (b4j.example.vmsnackbar)(this);};
 //BA.debugLineNum = 77;BA.debugLine="Dim pp As String = $\"${ID}Tile\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tile");
 //BA.debugLineNum = 78;BA.debugLine="vue.SetStateSingle(pp, varShaped)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshaped));
 //BA.debugLineNum = 79;BA.debugLine="SnackBar.Bind(\":tile\", pp)";
_snackbar._bind /*b4j.example.vmelement*/ (":tile",_pp);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _settimeout(String _vartimeout) throws Exception{
String _pp = "";
 //BA.debugLineNum = 334;BA.debugLine="Sub SetTimeout(varTimeout As String) As VMSnackBar";
 //BA.debugLineNum = 335;BA.debugLine="Dim pp As String = $\"${ID}Timeout\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Timeout");
 //BA.debugLineNum = 336;BA.debugLine="vue.SetStateSingle(pp, varTimeout)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartimeout));
 //BA.debugLineNum = 337;BA.debugLine="SnackBar.Bind(\":timeout\", pp)";
_snackbar._bind /*b4j.example.vmelement*/ (":timeout",_pp);
 //BA.debugLineNum = 338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _settop(boolean _vartop) throws Exception{
String _pp = "";
 //BA.debugLineNum = 342;BA.debugLine="Sub SetTop(varTop As Boolean) As VMSnackBar";
 //BA.debugLineNum = 343;BA.debugLine="Dim pp As String = $\"${ID}Top\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Top");
 //BA.debugLineNum = 344;BA.debugLine="vue.SetStateSingle(pp, varTop)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartop));
 //BA.debugLineNum = 345;BA.debugLine="SnackBar.Bind(\":top\", pp)";
_snackbar._bind /*b4j.example.vmelement*/ (":top",_pp);
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _settopleft(boolean _b) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub SetTopLeft(b As Boolean) As VMSnackBar";
 //BA.debugLineNum = 147;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmsnackbar)(this);};
 //BA.debugLineNum = 148;BA.debugLine="SetBottom(False)";
_setbottom(__c.False);
 //BA.debugLineNum = 149;BA.debugLine="SetLeft(True)";
_setleft(__c.True);
 //BA.debugLineNum = 150;BA.debugLine="SetTop(True)";
_settop(__c.True);
 //BA.debugLineNum = 151;BA.debugLine="SetRight(False)";
_setright(__c.False);
 //BA.debugLineNum = 152;BA.debugLine="SetCentered(False)";
_setcentered(__c.False);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _settopright(boolean _b) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetTopRight(b As Boolean) As VMSnackBar";
 //BA.debugLineNum = 157;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmsnackbar)(this);};
 //BA.debugLineNum = 158;BA.debugLine="SetBottom(False)";
_setbottom(__c.False);
 //BA.debugLineNum = 159;BA.debugLine="SetLeft(False)";
_setleft(__c.False);
 //BA.debugLineNum = 160;BA.debugLine="SetTop(True)";
_settop(__c.True);
 //BA.debugLineNum = 161;BA.debugLine="SetRight(True)";
_setright(__c.True);
 //BA.debugLineNum = 162;BA.debugLine="SetCentered(False)";
_setcentered(__c.False);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setvalue(boolean _varvalue) throws Exception{
 //BA.debugLineNum = 378;BA.debugLine="Sub SetValue(varValue As Boolean) As VMSnackBar";
 //BA.debugLineNum = 379;BA.debugLine="SnackBar.SetValue(varValue, False)";
_snackbar._setvalue /*b4j.example.vmelement*/ (BA.ObjectToString(_varvalue),__c.False);
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setvertical(boolean _varvertical) throws Exception{
String _pp = "";
 //BA.debugLineNum = 384;BA.debugLine="Sub SetVertical(varVertical As Boolean) As VMSnack";
 //BA.debugLineNum = 385;BA.debugLine="Dim pp As String = $\"${ID}Vertical\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Vertical");
 //BA.debugLineNum = 386;BA.debugLine="vue.SetStateSingle(pp, varVertical)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvertical));
 //BA.debugLineNum = 387;BA.debugLine="SnackBar.Bind(\":vertical\", pp)";
_snackbar._bind /*b4j.example.vmelement*/ (":vertical",_pp);
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetVIf(vif As String) As VMSnackBar";
 //BA.debugLineNum = 228;BA.debugLine="SnackBar.SetVIf(vif)";
_snackbar._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 486;BA.debugLine="Sub SetVisible(b As Boolean) As VMSnackBar";
 //BA.debugLineNum = 487;BA.debugLine="SnackBar.SetVisible(b)";
_snackbar._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 488;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SetVModel(k As String) As VMSnackBar";
 //BA.debugLineNum = 222;BA.debugLine="smodel = k";
_smodel = _k;
 //BA.debugLineNum = 223;BA.debugLine="SnackBar.SetVModel(k)";
_snackbar._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub SetVShow(vif As String) As VMSnackBar";
 //BA.debugLineNum = 233;BA.debugLine="SnackBar.SetVShow(vif)";
_snackbar._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _show() throws Exception{
 //BA.debugLineNum = 409;BA.debugLine="Sub Show As VMSnackBar";
 //BA.debugLineNum = 410;BA.debugLine="vue.SetStateSingle(smodel, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_smodel,(Object)(__c.True));
 //BA.debugLineNum = 411;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return null;
}
public String  _snackbutton_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub snackbutton_click(e As BANanoEvent)";
 //BA.debugLineNum = 186;BA.debugLine="If mName = \"\" Then";
if ((_mname).equals("")) { 
 //BA.debugLineNum = 187;BA.debugLine="Log($\"VMSnackbar.snackbutton_click: 'SetOnClick'";
__c.Log(("VMSnackbar.snackbutton_click: 'SetOnClick' has not been set!"));
 };
 //BA.debugLineNum = 189;BA.debugLine="Hide";
_hide();
 //BA.debugLineNum = 190;BA.debugLine="BANano.CallSub(Module, mName, Null)";
_banano.CallSub(_module,_mname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 217;BA.debugLine="Button.Pop(SnackBar)";
_button._pop /*String*/ (_snackbar);
 //BA.debugLineNum = 218;BA.debugLine="Return SnackBar.ToString";
if (true) return _snackbar._tostring /*String*/ ();
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsnackbar  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 194;BA.debugLine="Sub UseTheme(themeName As String) As VMSnackBar";
 //BA.debugLineNum = 195;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 196;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 197;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 198;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 199;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
