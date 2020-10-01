package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmbottomnavigation extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmbottomnavigation", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmbottomnavigation.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _bottomnavigation = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _hascontent = false;
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
public String  _addbutton(String _btnid,String _btntext,String _btnicon,String _btncolor,String _btnvalue,String _btntooltip,String _btnbadge) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 41;BA.debugLine="Sub AddButton(btnID As String, btnText As String,";
 //BA.debugLineNum = 42;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 43;BA.debugLine="btn.Initialize(vue, btnID, Module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_btnid,_module);
 //BA.debugLineNum = 44;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 45;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 46;BA.debugLine="btn.SetColor(btnColor)";
_btn._setcolor /*b4j.example.vmbutton*/ (_btncolor);
 //BA.debugLineNum = 47;BA.debugLine="btn.SetSpan(btnText)";
_btn._setspan /*b4j.example.vmbutton*/ (_btntext);
 //BA.debugLineNum = 48;BA.debugLine="btn.AddIcon(btnIcon, \"\", \"\")";
_btn._addicon /*b4j.example.vmbutton*/ (_btnicon,"","");
 //BA.debugLineNum = 49;BA.debugLine="btn.SetTooltip(btnToolTip)";
_btn._settooltip /*b4j.example.vmbutton*/ (_btntooltip);
 //BA.debugLineNum = 50;BA.debugLine="btn.SetAttrSingle(\"value\", btnValue)";
_btn._setattrsingle /*b4j.example.vmbutton*/ ("value",_btnvalue);
 //BA.debugLineNum = 51;BA.debugLine="If btnBadge <> \"\" Then";
if ((_btnbadge).equals("") == false) { 
 //BA.debugLineNum = 52;BA.debugLine="btn.SetHasBadge(True)";
_btn._sethasbadge /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 53;BA.debugLine="btn.SetBadge(btnBadge)";
_btn._setbadge /*b4j.example.vmbutton*/ (_btnbadge);
 };
 //BA.debugLineNum = 55;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 56;BA.debugLine="AddComponent(btn.ToString)";
_addcomponent(_btn._tostring /*String*/ ());
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottomnavigation  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 119;BA.debugLine="Sub AddChild(child As VMElement) As VMBottomNaviga";
 //BA.debugLineNum = 120;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 121;BA.debugLine="BottomNavigation.SetText(childHTML)";
_bottomnavigation._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 122;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 150;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 151;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 152;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottomnavigation  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub AddClass(c As String) As VMBottomNavigation";
 //BA.debugLineNum = 133;BA.debugLine="BottomNavigation.AddClass(c)";
_bottomnavigation._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub AddComponent(comp As String) As VMBottomNaviga";
 //BA.debugLineNum = 66;BA.debugLine="BottomNavigation.SetText(comp)";
_bottomnavigation._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 67;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 574;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 575;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 576;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottomnavigation  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 517;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 518;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 519;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 520;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 521;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 578;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 579;BA.debugLine="BottomNavigation.BuildModel(mprops, mstyles, lclas";
_bottomnavigation._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 580;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 581;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public BottomNavigation As VMElement";
_bottomnavigation = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 10;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottomnavigation  _disable() throws Exception{
 //BA.debugLineNum = 510;BA.debugLine="Sub Disable As VMBottomNavigation";
 //BA.debugLineNum = 511;BA.debugLine="BottomNavigation.Enable(False)";
_bottomnavigation._enable /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 512;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 513;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _enable() throws Exception{
 //BA.debugLineNum = 505;BA.debugLine="Sub Enable As VMBottomNavigation";
 //BA.debugLineNum = 506;BA.debugLine="BottomNavigation.Enable(True)";
_bottomnavigation._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 507;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 508;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _hide() throws Exception{
 //BA.debugLineNum = 495;BA.debugLine="Sub Hide As VMBottomNavigation";
 //BA.debugLineNum = 496;BA.debugLine="BottomNavigation.SetVisible(False)";
_bottomnavigation._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 497;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="BottomNavigation.Initialize(v, ID)";
_bottomnavigation._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 17;BA.debugLine="BottomNavigation.SetTag(\"v-bottom-navigation\")";
_bottomnavigation._settag /*b4j.example.vmelement*/ ("v-bottom-navigation");
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 21;BA.debugLine="BottomNavigation.typeOf = \"nav\"";
_bottomnavigation._typeof /*String*/  = "nav";
 //BA.debugLineNum = 22;BA.debugLine="HasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 24;BA.debugLine="SetOnChange(Module, $\"${ID}_change\"$)";
_setonchange(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_change"));
 //BA.debugLineNum = 25;BA.debugLine="SetOnUpdateInputValue($\"${ID}_updateinputvalue\"$)";
_setonupdateinputvalue((""+__c.SmartStringFormatter("",(Object)(_id))+"_updateinputvalue"));
 //BA.debugLineNum = 26;BA.debugLine="SetVModel($\"${ID}bn\"$)";
_setvmodel((""+__c.SmartStringFormatter("",(Object)(_id))+"bn"));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 128;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottomnavigation  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 524;BA.debugLine="public Sub RemoveAttr(sName As String) As VMBottom";
 //BA.debugLineNum = 525;BA.debugLine="BottomNavigation.RemoveAttr(sName)";
_bottomnavigation._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 526;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 527;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub Render";
 //BA.debugLineNum = 115;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottomnavigation  _setabsolute(boolean _varabsolute) throws Exception{
String _pp = "";
 //BA.debugLineNum = 157;BA.debugLine="Sub SetAbsolute(varAbsolute As Boolean) As VMBotto";
 //BA.debugLineNum = 158;BA.debugLine="If varAbsolute = False Then Return Me";
if (_varabsolute==__c.False) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 159;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 160;BA.debugLine="SetAttrSingle(\"absolute\", varAbsolute)";
_setattrsingle("absolute",BA.ObjectToString(_varabsolute));
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 163;BA.debugLine="Dim pp As String = $\"${ID}Absolute\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Absolute");
 //BA.debugLineNum = 164;BA.debugLine="vue.SetStateSingle(pp, varAbsolute)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varabsolute));
 //BA.debugLineNum = 165;BA.debugLine="BottomNavigation.Bind(\":absolute\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":absolute",_pp);
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setactive(String _btnid) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetActive(btnID As String) As VMBottomNavigati";
 //BA.debugLineNum = 37;BA.debugLine="vue.SetData($\"${ID}bn\"$, btnID)";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"bn"),(Object)(_btnid));
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 170;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 171;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 172;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 173;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 176;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 177;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 178;BA.debugLine="BottomNavigation.Bind(\":active-class\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setapp(boolean _varapp) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetApp(varApp As Boolean) As VMBottomNavigatio";
 //BA.debugLineNum = 184;BA.debugLine="If varApp = False Then Return Me";
if (_varapp==__c.False) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 185;BA.debugLine="BottomNavigation.SetAttrLoose(\"app\")";
_bottomnavigation._setattrloose /*b4j.example.vmelement*/ ("app");
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetAttr(attr As Map) As VMBottomNavigation";
 //BA.debugLineNum = 139;BA.debugLine="BottomNavigation.SetAttr(attr)";
_bottomnavigation._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 76;BA.debugLine="Sub SetAttributes(attrs As List) As VMBottomNaviga";
 //BA.debugLineNum = 77;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 78;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetAttrLoose(loose As String) As VMBottomNavig";
 //BA.debugLineNum = 72;BA.debugLine="BottomNavigation.SetAttrLoose(loose)";
_bottomnavigation._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 568;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 569;BA.debugLine="BottomNavigation.SetAttrSingle(prop, value)";
_bottomnavigation._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 571;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setbackgroundcolor(String _varbackgroundcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 190;BA.debugLine="Sub SetBackgroundColor(varBackgroundColor As Strin";
 //BA.debugLineNum = 191;BA.debugLine="If varBackgroundColor = \"\" Then Return Me";
if ((_varbackgroundcolor).equals("")) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 192;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 193;BA.debugLine="SetAttrSingle(\"background-color\", varBackgroundC";
_setattrsingle("background-color",_varbackgroundcolor);
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 196;BA.debugLine="Dim pp As String = $\"${ID}BackgroundColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BackgroundColor");
 //BA.debugLineNum = 197;BA.debugLine="vue.SetStateSingle(pp, varBackgroundColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbackgroundcolor));
 //BA.debugLineNum = 198;BA.debugLine="BottomNavigation.Bind(\":background-color\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setbackgroundcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 216;BA.debugLine="Sub SetBackgroundColorIntensity(color As String, i";
 //BA.debugLineNum = 217;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 218;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 219;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 220;BA.debugLine="SetAttrSingle(\"background-color\", scolor)";
_setattrsingle("background-color",_scolor);
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 223;BA.debugLine="Dim pp As String = $\"${ID}backgroundcolor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"backgroundcolor");
 //BA.debugLineNum = 224;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 225;BA.debugLine="Bind(\":background-color\", pp)";
_bind(":background-color",_pp);
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 203;BA.debugLine="Sub SetColor(varColor As String) As VMBottomNaviga";
 //BA.debugLineNum = 204;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 205;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 206;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 209;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 210;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 211;BA.debugLine="BottomNavigation.Bind(\":color\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 230;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 231;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 232;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 233;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 234;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 237;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 238;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 239;BA.debugLine="Bind(\":color\", pp)";
_bind(":color",_pp);
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 244;BA.debugLine="Sub SetDark(varDark As Boolean) As VMBottomNavigat";
 //BA.debugLineNum = 245;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 246;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 247;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 250;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 251;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 252;BA.debugLine="BottomNavigation.Bind(\":dark\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 31;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 540;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMBottomNavigat";
 //BA.debugLineNum = 541;BA.debugLine="BottomNavigation.SetDesignMode(b)";
_bottomnavigation._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 542;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 543;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 544;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 557;BA.debugLine="Sub SetDisabled(b As Boolean) As VMBottomNavigatio";
 //BA.debugLineNum = 558;BA.debugLine="BottomNavigation.SetDisabled(b)";
_bottomnavigation._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 559;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 560;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setfixed(boolean _varfixed) throws Exception{
String _pp = "";
 //BA.debugLineNum = 257;BA.debugLine="Sub SetFixed(varFixed As Boolean) As VMBottomNavig";
 //BA.debugLineNum = 258;BA.debugLine="If varFixed = False Then Return Me";
if (_varfixed==__c.False) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 259;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 260;BA.debugLine="SetAttrSingle(\"fixed\", varFixed)";
_setattrsingle("fixed",BA.ObjectToString(_varfixed));
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 263;BA.debugLine="Dim pp As String = $\"${ID}Fixed\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Fixed");
 //BA.debugLineNum = 264;BA.debugLine="vue.SetStateSingle(pp, varFixed)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfixed));
 //BA.debugLineNum = 265;BA.debugLine="BottomNavigation.Bind(\":fixed\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":fixed",_pp);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setgrow(boolean _vargrow) throws Exception{
String _pp = "";
 //BA.debugLineNum = 270;BA.debugLine="Sub SetGrow(varGrow As Boolean) As VMBottomNavigat";
 //BA.debugLineNum = 271;BA.debugLine="If varGrow = False Then Return Me";
if (_vargrow==__c.False) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 272;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 273;BA.debugLine="SetAttrSingle(\"grow\", varGrow)";
_setattrsingle("grow",BA.ObjectToString(_vargrow));
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 276;BA.debugLine="Dim pp As String = $\"${ID}Grow\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Grow");
 //BA.debugLineNum = 277;BA.debugLine="vue.SetStateSingle(pp, varGrow)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vargrow));
 //BA.debugLineNum = 278;BA.debugLine="BottomNavigation.Bind(\":grow\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":grow",_pp);
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 283;BA.debugLine="Sub SetHeight(varHeight As String) As VMBottomNavi";
 //BA.debugLineNum = 284;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 285;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 286;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 289;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 290;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 291;BA.debugLine="BottomNavigation.Bind(\":height\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _sethideonscroll(boolean _varhideonscroll) throws Exception{
String _pp = "";
 //BA.debugLineNum = 296;BA.debugLine="Sub SetHideOnScroll(varHideOnScroll As Boolean) As";
 //BA.debugLineNum = 297;BA.debugLine="If varHideOnScroll = False Then Return Me";
if (_varhideonscroll==__c.False) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 298;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 299;BA.debugLine="SetAttrSingle(\"hide-on-scroll\", varHideOnScroll)";
_setattrsingle("hide-on-scroll",BA.ObjectToString(_varhideonscroll));
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 302;BA.debugLine="Dim pp As String = $\"${ID}HideOnScroll\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideOnScroll");
 //BA.debugLineNum = 303;BA.debugLine="vue.SetStateSingle(pp, varHideOnScroll)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhideonscroll));
 //BA.debugLineNum = 304;BA.debugLine="BottomNavigation.Bind(\":hide-on-scroll\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":hide-on-scroll",_pp);
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _sethorizontal(boolean _varhorizontal) throws Exception{
String _pp = "";
 //BA.debugLineNum = 309;BA.debugLine="Sub SetHorizontal(varHorizontal As Boolean) As VMB";
 //BA.debugLineNum = 310;BA.debugLine="If varHorizontal = False Then Return Me";
if (_varhorizontal==__c.False) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 311;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 312;BA.debugLine="SetAttrSingle(\"horizontal\", varHorizontal)";
_setattrsingle("horizontal",BA.ObjectToString(_varhorizontal));
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 315;BA.debugLine="Dim pp As String = $\"${ID}Horizontal\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Horizontal");
 //BA.debugLineNum = 316;BA.debugLine="vue.SetStateSingle(pp, varHorizontal)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhorizontal));
 //BA.debugLineNum = 317;BA.debugLine="BottomNavigation.Bind(\":horizontal\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":horizontal",_pp);
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setinputvalue(boolean _varinputvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 322;BA.debugLine="Sub SetInputValue(varInputValue As Boolean) As VMB";
 //BA.debugLineNum = 323;BA.debugLine="If varInputValue = True Then Return Me";
if (_varinputvalue==__c.True) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 324;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 325;BA.debugLine="SetAttrSingle(\"input-value.sync\", varInputValue)";
_setattrsingle("input-value.sync",BA.ObjectToString(_varinputvalue));
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 328;BA.debugLine="Dim pp As String = $\"${ID}InputValue\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"InputValue");
 //BA.debugLineNum = 329;BA.debugLine="vue.SetStateSingle(pp, varInputValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varinputvalue));
 //BA.debugLineNum = 330;BA.debugLine="BottomNavigation.Bind(\":input-value.sync\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":input-value.sync",_pp);
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 335;BA.debugLine="Sub SetLight(varLight As Boolean) As VMBottomNavig";
 //BA.debugLineNum = 336;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 337;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 338;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 341;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 342;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 343;BA.debugLine="BottomNavigation.Bind(\":light\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setmandatory(boolean _varmandatory) throws Exception{
String _pp = "";
 //BA.debugLineNum = 348;BA.debugLine="Sub SetMandatory(varMandatory As Boolean) As VMBot";
 //BA.debugLineNum = 349;BA.debugLine="If varMandatory = False Then Return Me";
if (_varmandatory==__c.False) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 350;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 351;BA.debugLine="SetAttrSingle(\"mandatory\", varMandatory)";
_setattrsingle("mandatory",BA.ObjectToString(_varmandatory));
 //BA.debugLineNum = 352;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 354;BA.debugLine="Dim pp As String = $\"${ID}Mandatory\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Mandatory");
 //BA.debugLineNum = 355;BA.debugLine="vue.SetStateSingle(pp, varMandatory)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmandatory));
 //BA.debugLineNum = 356;BA.debugLine="BottomNavigation.Bind(\":mandatory\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":mandatory",_pp);
 //BA.debugLineNum = 357;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 535;BA.debugLine="Sub SetMarginAll(p As String) As VMBottomNavigatio";
 //BA.debugLineNum = 536;BA.debugLine="BottomNavigation.setmarginall(p)";
_bottomnavigation._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 537;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setmaxheight(String _varmaxheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 361;BA.debugLine="Sub SetMaxHeight(varMaxHeight As String) As VMBott";
 //BA.debugLineNum = 362;BA.debugLine="If varMaxHeight = \"\" Then Return Me";
if ((_varmaxheight).equals("")) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 363;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 364;BA.debugLine="SetAttrSingle(\"max-height\", varMaxHeight)";
_setattrsingle("max-height",_varmaxheight);
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 367;BA.debugLine="Dim pp As String = $\"${ID}MaxHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxHeight");
 //BA.debugLineNum = 368;BA.debugLine="vue.SetStateSingle(pp, varMaxHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxheight));
 //BA.debugLineNum = 369;BA.debugLine="BottomNavigation.Bind(\":max-height\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":max-height",_pp);
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setmaxwidth(String _varmaxwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 374;BA.debugLine="Sub SetMaxWidth(varMaxWidth As String) As VMBottom";
 //BA.debugLineNum = 375;BA.debugLine="If varMaxWidth = \"\" Then Return Me";
if ((_varmaxwidth).equals("")) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 376;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 377;BA.debugLine="SetAttrSingle(\"max-width\", varMaxWidth)";
_setattrsingle("max-width",_varmaxwidth);
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 380;BA.debugLine="Dim pp As String = $\"${ID}MaxWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxWidth");
 //BA.debugLineNum = 381;BA.debugLine="vue.SetStateSingle(pp, varMaxWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxwidth));
 //BA.debugLineNum = 382;BA.debugLine="BottomNavigation.Bind(\":max-width\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":max-width",_pp);
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setminheight(String _varminheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 387;BA.debugLine="Sub SetMinHeight(varMinHeight As String) As VMBott";
 //BA.debugLineNum = 388;BA.debugLine="If varMinHeight = \"\" Then Return Me";
if ((_varminheight).equals("")) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 389;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 390;BA.debugLine="SetAttrSingle(\"min-height\", varMinHeight)";
_setattrsingle("min-height",_varminheight);
 //BA.debugLineNum = 391;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 393;BA.debugLine="Dim pp As String = $\"${ID}MinHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinHeight");
 //BA.debugLineNum = 394;BA.debugLine="vue.SetStateSingle(pp, varMinHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminheight));
 //BA.debugLineNum = 395;BA.debugLine="BottomNavigation.Bind(\":min-height\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":min-height",_pp);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setminwidth(String _varminwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 400;BA.debugLine="Sub SetMinWidth(varMinWidth As String) As VMBottom";
 //BA.debugLineNum = 401;BA.debugLine="If varMinWidth = \"\" Then Return Me";
if ((_varminwidth).equals("")) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 402;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 403;BA.debugLine="SetAttrSingle(\"min-width\", varMinWidth)";
_setattrsingle("min-width",_varminwidth);
 //BA.debugLineNum = 404;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 406;BA.debugLine="Dim pp As String = $\"${ID}MinWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinWidth");
 //BA.debugLineNum = 407;BA.debugLine="vue.SetStateSingle(pp, varMinWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminwidth));
 //BA.debugLineNum = 408;BA.debugLine="BottomNavigation.Bind(\":min-width\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":min-width",_pp);
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 552;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 553;BA.debugLine="BottomNavigation.SetName(varName, bbind)";
_bottomnavigation._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 554;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 555;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setonchange(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 471;BA.debugLine="Sub SetOnChange(eventHandler As Object,methodName";
 //BA.debugLineNum = 472;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 473;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 474;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 475;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 476;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 478;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 479;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 480;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setonupdateinputvalue(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 483;BA.debugLine="Sub SetOnUpdateInputValue(methodName As String) As";
 //BA.debugLineNum = 484;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 485;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 486;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 487;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 488;BA.debugLine="SetAttr(CreateMap(\"@update:input-value\": methodNa";
_setattr(__c.createMap(new Object[] {(Object)("@update:input-value"),(Object)(_methodname)}));
 //BA.debugLineNum = 490;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 491;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 492;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 530;BA.debugLine="Sub SetPaddingAll(p As String) As VMBottomNavigati";
 //BA.debugLineNum = 531;BA.debugLine="BottomNavigation.SetPaddingAll(p)";
_bottomnavigation._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 532;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 533;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setscrolltarget(String _varscrolltarget) throws Exception{
String _pp = "";
 //BA.debugLineNum = 413;BA.debugLine="Sub SetScrollTarget(varScrollTarget As String) As";
 //BA.debugLineNum = 414;BA.debugLine="If varScrollTarget = \"\" Then Return Me";
if ((_varscrolltarget).equals("")) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 415;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 416;BA.debugLine="SetAttrSingle(\"scroll-target\", varScrollTarget)";
_setattrsingle("scroll-target",_varscrolltarget);
 //BA.debugLineNum = 417;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 419;BA.debugLine="Dim pp As String = $\"${ID}ScrollTarget\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ScrollTarget");
 //BA.debugLineNum = 420;BA.debugLine="vue.SetStateSingle(pp, varScrollTarget)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varscrolltarget));
 //BA.debugLineNum = 421;BA.debugLine="BottomNavigation.Bind(\":scroll-target\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":scroll-target",_pp);
 //BA.debugLineNum = 422;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setscrollthreshold(String _varscrollthreshold) throws Exception{
String _pp = "";
 //BA.debugLineNum = 426;BA.debugLine="Sub SetScrollThreshold(varScrollThreshold As Strin";
 //BA.debugLineNum = 427;BA.debugLine="If varScrollThreshold = \"\" Then Return Me";
if ((_varscrollthreshold).equals("")) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 428;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 429;BA.debugLine="SetAttrSingle(\"scroll-threshold\", varScrollThres";
_setattrsingle("scroll-threshold",_varscrollthreshold);
 //BA.debugLineNum = 430;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 432;BA.debugLine="Dim pp As String = $\"${ID}ScrollThreshold\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ScrollThreshold");
 //BA.debugLineNum = 433;BA.debugLine="vue.SetStateSingle(pp, varScrollThreshold)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varscrollthreshold));
 //BA.debugLineNum = 434;BA.debugLine="BottomNavigation.Bind(\":scroll-threshold\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":scroll-threshold",_pp);
 //BA.debugLineNum = 435;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setshift(boolean _varshift) throws Exception{
String _pp = "";
 //BA.debugLineNum = 439;BA.debugLine="Sub SetShift(varShift As Boolean) As VMBottomNavig";
 //BA.debugLineNum = 440;BA.debugLine="If varShift = \"\" Then Return Me";
if (_varshift==BA.ObjectToBoolean("")) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 441;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 442;BA.debugLine="SetAttrSingle(\"shift\", varShift)";
_setattrsingle("shift",BA.ObjectToString(_varshift));
 //BA.debugLineNum = 443;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 445;BA.debugLine="Dim pp As String = $\"${ID}Shift\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Shift");
 //BA.debugLineNum = 446;BA.debugLine="vue.SetStateSingle(pp, varShift)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshift));
 //BA.debugLineNum = 447;BA.debugLine="BottomNavigation.Bind(\":shift\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":shift",_pp);
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetStatic(b As Boolean) As VMBottomNavigation";
 //BA.debugLineNum = 60;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 61;BA.debugLine="BottomNavigation.SetStatic(b)";
_bottomnavigation._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetStyle(sm As Map) As VMBottomNavigation";
 //BA.debugLineNum = 145;BA.debugLine="BottomNavigation.SetStyle(sm)";
_bottomnavigation._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 563;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 564;BA.debugLine="BottomNavigation.SetStyleSingle(prop, value)";
_bottomnavigation._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 565;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 566;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 546;BA.debugLine="Sub SetTabIndex(ti As String) As VMBottomNavigatio";
 //BA.debugLineNum = 547;BA.debugLine="BottomNavigation.SetTabIndex(ti)";
_bottomnavigation._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 548;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 549;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 452;BA.debugLine="Sub SetValue(varValue As String) As VMBottomNaviga";
 //BA.debugLineNum = 453;BA.debugLine="BottomNavigation.SetValue(varValue,False)";
_bottomnavigation._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 454;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 455;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetVIf(vif As String) As VMBottomNavigation";
 //BA.debugLineNum = 104;BA.debugLine="BottomNavigation.SetVIf(vif)";
_bottomnavigation._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 583;BA.debugLine="Sub SetVisible(b As Boolean) As VMBottomNavigation";
 //BA.debugLineNum = 584;BA.debugLine="BottomNavigation.SetVisible(b)";
_bottomnavigation._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 585;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 586;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetVModel(k As String) As VMBottomNavigation";
 //BA.debugLineNum = 99;BA.debugLine="BottomNavigation.SetVModel(k)";
_bottomnavigation._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetVShow(vif As String) As VMBottomNavigation";
 //BA.debugLineNum = 109;BA.debugLine="BottomNavigation.SetVShow(vif)";
_bottomnavigation._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _setwidth(String _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 458;BA.debugLine="Sub SetWidth(varWidth As String) As VMBottomNaviga";
 //BA.debugLineNum = 459;BA.debugLine="If varWidth = \"\" Then Return Me";
if ((_varwidth).equals("")) { 
if (true) return (b4j.example.vmbottomnavigation)(this);};
 //BA.debugLineNum = 460;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 461;BA.debugLine="SetAttrSingle(\"width\", varWidth)";
_setattrsingle("width",_varwidth);
 //BA.debugLineNum = 462;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 };
 //BA.debugLineNum = 464;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 465;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varwidth));
 //BA.debugLineNum = 466;BA.debugLine="BottomNavigation.Bind(\":width\", pp)";
_bottomnavigation._bind /*b4j.example.vmelement*/ (":width",_pp);
 //BA.debugLineNum = 467;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 468;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _show() throws Exception{
 //BA.debugLineNum = 500;BA.debugLine="Sub Show As VMBottomNavigation";
 //BA.debugLineNum = 501;BA.debugLine="BottomNavigation.SetVisible(True)";
_bottomnavigation._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 502;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottomnavigation)(this);
 //BA.debugLineNum = 503;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 84;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 85;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 86;BA.debugLine="Dim eName As String = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 87;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 88;BA.debugLine="Log($\"VMBottomNavigation.${eName} event has not";
__c.Log(("VMBottomNavigation."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 //BA.debugLineNum = 90;BA.debugLine="eName  = $\"${ID}_updateinputvalue\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_updateinputvalue");
 //BA.debugLineNum = 91;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 92;BA.debugLine="Log($\"VMBottomNavigation.${eName} event has not";
__c.Log(("VMBottomNavigation."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 95;BA.debugLine="Return BottomNavigation.ToString";
if (true) return _bottomnavigation._tostring /*String*/ ();
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
