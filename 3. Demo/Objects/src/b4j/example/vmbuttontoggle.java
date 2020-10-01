package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmbuttontoggle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmbuttontoggle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmbuttontoggle.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _buttontoggle = null;
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
public String  _addbutton(String _btnid,String _btntext,String _btnicon,String _btncolor,String _btnvalue,String _btntooltip) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 45;BA.debugLine="Sub AddButton(btnID As String, btnText As String,";
 //BA.debugLineNum = 46;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 47;BA.debugLine="btn.Initialize(vue, btnID, Module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_btnid,_module);
 //BA.debugLineNum = 48;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 49;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 50;BA.debugLine="btn.SetColor(btnColor)";
_btn._setcolor /*b4j.example.vmbutton*/ (_btncolor);
 //BA.debugLineNum = 52;BA.debugLine="If btnText = \"\" Then";
if ((_btntext).equals("")) { 
 //BA.debugLineNum = 53;BA.debugLine="btn.SetLabel(btnText)";
_btn._setlabel /*b4j.example.vmbutton*/ (_btntext);
 //BA.debugLineNum = 54;BA.debugLine="btn.AddIcon(btnIcon, \"left\", \"\")";
_btn._addicon /*b4j.example.vmbutton*/ (_btnicon,"left","");
 }else {
 //BA.debugLineNum = 56;BA.debugLine="btn.SetLabel(btnText)";
_btn._setlabel /*b4j.example.vmbutton*/ (_btntext);
 //BA.debugLineNum = 57;BA.debugLine="btn.AddIcon(btnIcon, \"right\", \"\")";
_btn._addicon /*b4j.example.vmbutton*/ (_btnicon,"right","");
 };
 //BA.debugLineNum = 59;BA.debugLine="btn.SetTooltip(btnToolTip)";
_btn._settooltip /*b4j.example.vmbutton*/ (_btntooltip);
 //BA.debugLineNum = 60;BA.debugLine="If btnValue <> \"\" Then";
if ((_btnvalue).equals("") == false) { 
 //BA.debugLineNum = 61;BA.debugLine="btn.SetAttrSingle(\"value\", btnValue)";
_btn._setattrsingle /*b4j.example.vmbutton*/ ("value",_btnvalue);
 };
 //BA.debugLineNum = 63;BA.debugLine="AddComponent(btn.ToString)";
_addcomponent(_btn._tostring /*String*/ ());
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbuttontoggle  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 110;BA.debugLine="Sub AddChild(child As VMElement) As VMButtonToggle";
 //BA.debugLineNum = 111;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 112;BA.debugLine="ButtonToggle.SetText(childHTML)";
_buttontoggle._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 140;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 141;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 142;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbuttontoggle  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub AddClass(c As String) As VMButtonToggle";
 //BA.debugLineNum = 123;BA.debugLine="ButtonToggle.AddClass(c)";
_buttontoggle._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 547;BA.debugLine="Sub AddComponent(comp As String) As VMButtonToggle";
 //BA.debugLineNum = 548;BA.debugLine="ButtonToggle.SetText(comp)";
_buttontoggle._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 549;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 550;BA.debugLine="End Sub";
return null;
}
public String  _addicon(String _btnid,String _btnicon,String _btncolor,String _btnvalue,String _btntooltip) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 25;BA.debugLine="Sub AddIcon(btnID As String, btnIcon As String, bt";
 //BA.debugLineNum = 26;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 27;BA.debugLine="btn.Initialize(vue, btnID, Module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_btnid,_module);
 //BA.debugLineNum = 28;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 29;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 30;BA.debugLine="btn.SetColor(btnColor)";
_btn._setcolor /*b4j.example.vmbutton*/ (_btncolor);
 //BA.debugLineNum = 31;BA.debugLine="btn.AddIcon(btnIcon,  \"\", \"\")";
_btn._addicon /*b4j.example.vmbutton*/ (_btnicon,"","");
 //BA.debugLineNum = 32;BA.debugLine="btn.SetTooltip(btnToolTip)";
_btn._settooltip /*b4j.example.vmbutton*/ (_btntooltip);
 //BA.debugLineNum = 33;BA.debugLine="If btnValue <> \"\" Then";
if ((_btnvalue).equals("") == false) { 
 //BA.debugLineNum = 34;BA.debugLine="btn.SetAttrSingle(\"value\", btnValue)";
_btn._setattrsingle /*b4j.example.vmbutton*/ ("value",_btnvalue);
 };
 //BA.debugLineNum = 36;BA.debugLine="AddComponent(btn.ToString)";
_addcomponent(_btn._tostring /*String*/ ());
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 552;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 553;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 554;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbuttontoggle  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 383;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 384;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 385;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 478;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 479;BA.debugLine="ButtonToggle.BindStyleSingle(prop, value)";
_buttontoggle._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 480;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 481;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 557;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 558;BA.debugLine="ButtonToggle.BuildModel(mprops, mstyles, lclasses";
_buttontoggle._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 559;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 560;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ButtonToggle As VMElement";
_buttontoggle = new b4j.example.vmelement();
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
public b4j.example.vmbuttontoggle  _disable() throws Exception{
 //BA.debugLineNum = 376;BA.debugLine="Sub Disable As VMButtonToggle";
 //BA.debugLineNum = 377;BA.debugLine="ButtonToggle.Enable(False)";
_buttontoggle._enable /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _enable() throws Exception{
 //BA.debugLineNum = 370;BA.debugLine="Sub Enable As VMButtonToggle";
 //BA.debugLineNum = 371;BA.debugLine="ButtonToggle.Enable(True)";
_buttontoggle._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _hide() throws Exception{
 //BA.debugLineNum = 358;BA.debugLine="Sub Hide As VMButtonToggle";
 //BA.debugLineNum = 359;BA.debugLine="ButtonToggle.SetVisible(False)";
_buttontoggle._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="ButtonToggle.Initialize(v, ID)";
_buttontoggle._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="ButtonToggle.SetTag(\"v-btn-toggle\")";
_buttontoggle._settag /*b4j.example.vmelement*/ ("v-btn-toggle");
 //BA.debugLineNum = 17;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="SetOnChange(Module, $\"${ID}_change\"$)";
_setonchange(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_change"));
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 118;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbuttontoggle  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 422;BA.debugLine="public Sub RemoveAttr(sName As String) As VMButton";
 //BA.debugLineNum = 423;BA.debugLine="ButtonToggle.RemoveAttr(sName)";
_buttontoggle._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 424;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub Render";
 //BA.debugLineNum = 106;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbuttontoggle  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 147;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 148;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 149;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 150;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 };
 //BA.debugLineNum = 153;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 154;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 155;BA.debugLine="ButtonToggle.Bind(\":active-class\", pp)";
_buttontoggle._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetAttr(attr As Map) As VMButtonToggle";
 //BA.debugLineNum = 129;BA.debugLine="ButtonToggle.SetAttr(attr)";
_buttontoggle._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 498;BA.debugLine="Sub SetAttributes(attrs As List) As VMButtonToggle";
 //BA.debugLineNum = 499;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 500;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 502;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 503;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 390;BA.debugLine="Sub SetAttrLoose(loose As String) As VMButtonToggl";
 //BA.debugLineNum = 391;BA.debugLine="ButtonToggle.SetAttrLoose(loose)";
_buttontoggle._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 392;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 472;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 473;BA.debugLine="ButtonToggle.SetAttrSingle(prop, value)";
_buttontoggle._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setbackgroundcolor(String _varbackgroundcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 160;BA.debugLine="Sub SetBackgroundColor(varBackgroundColor As Strin";
 //BA.debugLineNum = 161;BA.debugLine="If varBackgroundColor = \"\" Then Return Me";
if ((_varbackgroundcolor).equals("")) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 162;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 163;BA.debugLine="SetAttrSingle(\"background-color\", varBackgroundC";
_setattrsingle("background-color",_varbackgroundcolor);
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 };
 //BA.debugLineNum = 166;BA.debugLine="Dim pp As String = $\"${ID}BackgroundColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BackgroundColor");
 //BA.debugLineNum = 167;BA.debugLine="vue.SetStateSingle(pp, varBackgroundColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbackgroundcolor));
 //BA.debugLineNum = 168;BA.debugLine="ButtonToggle.Bind(\":background-color\", pp)";
_buttontoggle._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setbackgroundcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 174;BA.debugLine="Sub SetBackgroundColorIntensity(color As String, i";
 //BA.debugLineNum = 175;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 176;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 177;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 178;BA.debugLine="SetAttrSingle(\"background-color\", scolor)";
_setattrsingle("background-color",_scolor);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 };
 //BA.debugLineNum = 181;BA.debugLine="Dim pp As String = $\"${ID}backgroundcolor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"backgroundcolor");
 //BA.debugLineNum = 182;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 183;BA.debugLine="ButtonToggle.Bind(\":background-color\", pp)";
_buttontoggle._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setborderless(boolean _varborderless) throws Exception{
String _pp = "";
 //BA.debugLineNum = 227;BA.debugLine="Sub SetBorderless(varBorderless As Boolean) As VMB";
 //BA.debugLineNum = 228;BA.debugLine="If varBorderless = False Then Return Me";
if (_varborderless==__c.False) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 229;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 230;BA.debugLine="SetAttrSingle(\"borderless\", varBorderless)";
_setattrsingle("borderless",BA.ObjectToString(_varborderless));
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 };
 //BA.debugLineNum = 233;BA.debugLine="Dim pp As String = $\"${ID}Borderless\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Borderless");
 //BA.debugLineNum = 234;BA.debugLine="vue.SetStateSingle(pp, varBorderless)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varborderless));
 //BA.debugLineNum = 235;BA.debugLine="ButtonToggle.Bind(\":borderless\", pp)";
_buttontoggle._bind /*b4j.example.vmelement*/ (":borderless",_pp);
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 188;BA.debugLine="Sub SetColor(varColor As String) As VMButtonToggle";
 //BA.debugLineNum = 189;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 190;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 191;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 };
 //BA.debugLineNum = 194;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 195;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 196;BA.debugLine="ButtonToggle.Bind(\":color\", pp)";
_buttontoggle._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 408;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 409;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 410;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 411;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 412;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 413;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 };
 //BA.debugLineNum = 415;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 416;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 417;BA.debugLine="ButtonToggle.Bind(\":color\", pp)";
_buttontoggle._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 418;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 240;BA.debugLine="Sub SetDark(varDark As Boolean) As VMButtonToggle";
 //BA.debugLineNum = 241;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 242;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 243;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 };
 //BA.debugLineNum = 246;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 247;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 248;BA.debugLine="ButtonToggle.Bind(\":dark\", pp)";
_buttontoggle._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 40;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setdense(boolean _vardense) throws Exception{
String _pp = "";
 //BA.debugLineNum = 253;BA.debugLine="Sub SetDense(varDense As Boolean) As VMButtonToggl";
 //BA.debugLineNum = 254;BA.debugLine="If varDense = False Then Return Me";
if (_vardense==__c.False) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 255;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 256;BA.debugLine="SetAttrSingle(\"dense\", varDense)";
_setattrsingle("dense",BA.ObjectToString(_vardense));
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 };
 //BA.debugLineNum = 259;BA.debugLine="Dim pp As String = $\"${ID}Dense\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dense");
 //BA.debugLineNum = 260;BA.debugLine="vue.SetStateSingle(pp, varDense)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardense));
 //BA.debugLineNum = 261;BA.debugLine="ButtonToggle.Bind(\":dense\", pp)";
_buttontoggle._bind /*b4j.example.vmelement*/ (":dense",_pp);
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 440;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMButtonToggle";
 //BA.debugLineNum = 441;BA.debugLine="ButtonToggle.SetDesignMode(b)";
_buttontoggle._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 442;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 443;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 527;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 528;BA.debugLine="ButtonToggle.SetDeviceOffsets(OS, OM, OL, OX)";
_buttontoggle._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 529;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 534;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 535;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 536;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 537;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 541;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 542;BA.debugLine="ButtonToggle.SetDeviceSizes(SS, SM, SL, SX)";
_buttontoggle._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 543;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 544;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setgroup(boolean _vargroup) throws Exception{
String _pp = "";
 //BA.debugLineNum = 266;BA.debugLine="Sub SetGroup(varGroup As Boolean) As VMButtonToggl";
 //BA.debugLineNum = 267;BA.debugLine="If varGroup = False Then Return Me";
if (_vargroup==__c.False) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 268;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 269;BA.debugLine="SetAttrSingle(\"group\", varGroup)";
_setattrsingle("group",BA.ObjectToString(_vargroup));
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 };
 //BA.debugLineNum = 272;BA.debugLine="Dim pp As String = $\"${ID}Group\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Group");
 //BA.debugLineNum = 273;BA.debugLine="vue.SetStateSingle(pp, varGroup)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vargroup));
 //BA.debugLineNum = 274;BA.debugLine="ButtonToggle.Bind(\":group\", pp)";
_buttontoggle._bind /*b4j.example.vmelement*/ (":group",_pp);
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 514;BA.debugLine="Sub SetKey(k As String) As VMButtonToggle";
 //BA.debugLineNum = 515;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 516;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 517;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 518;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 279;BA.debugLine="Sub SetLight(varLight As Boolean) As VMButtonToggl";
 //BA.debugLineNum = 280;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 281;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 282;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 };
 //BA.debugLineNum = 285;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 286;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 287;BA.debugLine="ButtonToggle.Bind(\":light\", pp)";
_buttontoggle._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setmandatory(boolean _varmandatory) throws Exception{
String _pp = "";
 //BA.debugLineNum = 292;BA.debugLine="Sub SetMandatory(varMandatory As Boolean) As VMBut";
 //BA.debugLineNum = 293;BA.debugLine="If varMandatory = False Then Return Me";
if (_varmandatory==__c.False) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 294;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 295;BA.debugLine="SetAttrSingle(\"mandatory\", varMandatory)";
_setattrsingle("mandatory",BA.ObjectToString(_varmandatory));
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 };
 //BA.debugLineNum = 298;BA.debugLine="Dim pp As String = $\"${ID}Mandatory\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Mandatory");
 //BA.debugLineNum = 299;BA.debugLine="vue.SetStateSingle(pp, varMandatory)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmandatory));
 //BA.debugLineNum = 300;BA.debugLine="ButtonToggle.Bind(\":mandatory\", pp)";
_buttontoggle._bind /*b4j.example.vmelement*/ (":mandatory",_pp);
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 434;BA.debugLine="Sub SetMarginAll(p As String) As VMButtonToggle";
 //BA.debugLineNum = 435;BA.debugLine="ButtonToggle.setmarginall(p)";
_buttontoggle._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 436;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setmax(String _varmax) throws Exception{
String _pp = "";
 //BA.debugLineNum = 201;BA.debugLine="Sub SetMax(varMax As String) As VMButtonToggle";
 //BA.debugLineNum = 202;BA.debugLine="If varMax = \"\" Then Return Me";
if ((_varmax).equals("")) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 203;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 204;BA.debugLine="SetAttrSingle(\"max\", varMax)";
_setattrsingle("max",_varmax);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 };
 //BA.debugLineNum = 207;BA.debugLine="Dim pp As String = $\"${ID}Max\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Max");
 //BA.debugLineNum = 208;BA.debugLine="vue.SetStateSingle(pp, varMax)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmax));
 //BA.debugLineNum = 209;BA.debugLine="ButtonToggle.Bind(\":max\", pp)";
_buttontoggle._bind /*b4j.example.vmelement*/ (":max",_pp);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setmultiple(boolean _varmultiple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 305;BA.debugLine="Sub SetMultiple(varMultiple As Boolean) As VMButto";
 //BA.debugLineNum = 306;BA.debugLine="If varMultiple = False Then Return Me";
if (_varmultiple==__c.False) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 307;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 308;BA.debugLine="SetAttrSingle(\"multiple\", varMultiple)";
_setattrsingle("multiple",BA.ObjectToString(_varmultiple));
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 };
 //BA.debugLineNum = 311;BA.debugLine="Dim pp As String = $\"${ID}Multiple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Multiple");
 //BA.debugLineNum = 312;BA.debugLine="vue.SetStateSingle(pp, varMultiple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmultiple));
 //BA.debugLineNum = 313;BA.debugLine="ButtonToggle.Bind(\":multiple\", pp)";
_buttontoggle._bind /*b4j.example.vmelement*/ (":multiple",_pp);
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 460;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 461;BA.debugLine="ButtonToggle.SetName(varName, bbind)";
_buttontoggle._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 462;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 463;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setonchange(Object _eventhandler,String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.List _items = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 67;BA.debugLine="Sub SetOnChange(eventHandler As Object,methodName";
 //BA.debugLineNum = 68;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 69;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 70;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 71;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_items.getObject())}))));
 //BA.debugLineNum = 72;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 74;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 428;BA.debugLine="Sub SetPaddingAll(p As String) As VMButtonToggle";
 //BA.debugLineNum = 429;BA.debugLine="ButtonToggle.SetPaddingAll(p)";
_buttontoggle._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 430;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 521;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMBut";
 //BA.debugLineNum = 522;BA.debugLine="ButtonToggle.SetRC(sRow, sCol)";
_buttontoggle._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 523;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 524;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setrounded(boolean _varrounded) throws Exception{
String _pp = "";
 //BA.debugLineNum = 318;BA.debugLine="Sub SetRounded(varRounded As Boolean) As VMButtonT";
 //BA.debugLineNum = 319;BA.debugLine="If varRounded = False Then Return Me";
if (_varrounded==__c.False) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 320;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 321;BA.debugLine="SetAttrSingle(\"rounded\", varRounded)";
_setattrsingle("rounded",BA.ObjectToString(_varrounded));
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 };
 //BA.debugLineNum = 324;BA.debugLine="Dim pp As String = $\"${ID}Rounded\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Rounded");
 //BA.debugLineNum = 325;BA.debugLine="vue.SetStateSingle(pp, varRounded)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varrounded));
 //BA.debugLineNum = 326;BA.debugLine="ButtonToggle.Bind(\":rounded\", pp)";
_buttontoggle._bind /*b4j.example.vmelement*/ (":rounded",_pp);
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setshaped(boolean _varshaped) throws Exception{
String _pp = "";
 //BA.debugLineNum = 331;BA.debugLine="Sub SetShaped(varShaped As Boolean) As VMButtonTog";
 //BA.debugLineNum = 332;BA.debugLine="If varShaped = False Then Return Me";
if (_varshaped==__c.False) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 333;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 334;BA.debugLine="SetAttrSingle(\"shaped\", varShaped)";
_setattrsingle("shaped",BA.ObjectToString(_varshaped));
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 };
 //BA.debugLineNum = 337;BA.debugLine="Dim pp As String = $\"${ID}Shaped\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Shaped");
 //BA.debugLineNum = 338;BA.debugLine="vue.SetStateSingle(pp, varShaped)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshaped));
 //BA.debugLineNum = 339;BA.debugLine="ButtonToggle.Bind(\":shaped\", pp)";
_buttontoggle._bind /*b4j.example.vmelement*/ (":shaped",_pp);
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 447;BA.debugLine="Sub SetStatic(b As Boolean) As VMButtonToggle";
 //BA.debugLineNum = 448;BA.debugLine="ButtonToggle.SetStatic(b)";
_buttontoggle._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 449;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 450;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetStyle(sm As Map) As VMButtonToggle";
 //BA.debugLineNum = 135;BA.debugLine="ButtonToggle.SetStyle(sm)";
_buttontoggle._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 466;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 467;BA.debugLine="ButtonToggle.SetStyleSingle(prop, value)";
_buttontoggle._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 468;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 454;BA.debugLine="Sub SetTabIndex(ti As String) As VMButtonToggle";
 //BA.debugLineNum = 455;BA.debugLine="ButtonToggle.SetTabIndex(ti)";
_buttontoggle._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 456;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _settile(boolean _vartitle) throws Exception{
String _pp = "";
 //BA.debugLineNum = 344;BA.debugLine="Sub SetTile(varTitle As Boolean) As VMButtonToggle";
 //BA.debugLineNum = 345;BA.debugLine="If varTitle = False Then Return Me";
if (_vartitle==__c.False) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 346;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 347;BA.debugLine="SetAttrSingle(\"tile\", varTitle)";
_setattrsingle("tile",BA.ObjectToString(_vartitle));
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 };
 //BA.debugLineNum = 350;BA.debugLine="Dim pp As String = $\"${ID}Tile\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tile");
 //BA.debugLineNum = 351;BA.debugLine="vue.SetStateSingle(pp, varTitle)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartitle));
 //BA.debugLineNum = 352;BA.debugLine="ButtonToggle.Bind(\":tile\", pp)";
_buttontoggle._bind /*b4j.example.vmelement*/ (":tile",_pp);
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setvalue(String _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 214;BA.debugLine="Sub SetValue(varValue As String) As VMButtonToggle";
 //BA.debugLineNum = 215;BA.debugLine="If varValue = \"\" Then Return Me";
if ((_varvalue).equals("")) { 
if (true) return (b4j.example.vmbuttontoggle)(this);};
 //BA.debugLineNum = 216;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 217;BA.debugLine="SetAttrSingle(\"value\", varValue)";
_setattrsingle("value",_varvalue);
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 };
 //BA.debugLineNum = 220;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 221;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue));
 //BA.debugLineNum = 222;BA.debugLine="ButtonToggle.Bind(\":value\", pp)";
_buttontoggle._bind /*b4j.example.vmelement*/ (":value",_pp);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 483;BA.debugLine="Sub SetVElse(vif As String) As VMButtonToggle";
 //BA.debugLineNum = 484;BA.debugLine="ButtonToggle.SetVElse(vif)";
_buttontoggle._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 485;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 486;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 506;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 507;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 508;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 509;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 510;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 511;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 512;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 493;BA.debugLine="Sub SetVhtml(vhtml As String) As VMButtonToggle";
 //BA.debugLineNum = 494;BA.debugLine="ButtonToggle.SetVHtml(vhtml)";
_buttontoggle._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 495;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 496;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetVIf(vif As String) As VMButtonToggle";
 //BA.debugLineNum = 95;BA.debugLine="ButtonToggle.SetVIf(vif)";
_buttontoggle._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 563;BA.debugLine="Sub SetVisible(b As Boolean) As VMButtonToggle";
 //BA.debugLineNum = 564;BA.debugLine="ButtonToggle.SetVisible(b)";
_buttontoggle._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 565;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 566;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetVModel(k As String) As VMButtonToggle";
 //BA.debugLineNum = 90;BA.debugLine="ButtonToggle.SetVModel(k)";
_buttontoggle._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetVShow(vif As String) As VMButtonToggle";
 //BA.debugLineNum = 100;BA.debugLine="ButtonToggle.SetVShow(vif)";
_buttontoggle._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 488;BA.debugLine="Sub SetVText(vhtml As String) As VMButtonToggle";
 //BA.debugLineNum = 489;BA.debugLine="ButtonToggle.SetVText(vhtml)";
_buttontoggle._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 490;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 491;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _show() throws Exception{
 //BA.debugLineNum = 364;BA.debugLine="Sub Show As VMButtonToggle";
 //BA.debugLineNum = 365;BA.debugLine="ButtonToggle.SetVisible(True)";
_buttontoggle._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 366;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 79;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 80;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 81;BA.debugLine="Dim eName As String = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 82;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 83;BA.debugLine="Log($\"VMBottomToggle.${eName} event has not been";
__c.Log(("VMBottomToggle."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 86;BA.debugLine="Return ButtonToggle.ToString";
if (true) return _buttontoggle._tostring /*String*/ ();
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbuttontoggle  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 396;BA.debugLine="Sub UseTheme(themeName As String) As VMButtonToggl";
 //BA.debugLineNum = 397;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 398;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 399;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 400;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 401;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 403;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbuttontoggle)(this);
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
