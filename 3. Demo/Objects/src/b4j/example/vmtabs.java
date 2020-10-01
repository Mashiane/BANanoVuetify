package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtabs extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtabs", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtabs.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _tabs = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _hascontent = false;
public boolean _ontoolbar = false;
public boolean _bstatic = false;
public anywheresoftware.b4a.objects.collections.List _titems = null;
public String _iconpos = "";
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
public b4j.example.vmtabs  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 257;BA.debugLine="Sub AddChild(child As VMElement) As VMTabs";
 //BA.debugLineNum = 258;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 259;BA.debugLine="Tabs.SetText(childHTML)";
_tabs._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub AddClass(c As String) As VMTabs";
 //BA.debugLineNum = 276;BA.debugLine="Tabs.AddClass(c)";
_tabs._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub AddComponent(comp As String) As VMTabs";
 //BA.debugLineNum = 201;BA.debugLine="Tabs.SetText(comp)";
_tabs._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 202;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public String  _addtab(String _tabid,String _tablabel,String _tabicon,b4j.example.vmcontainer _tabcontent) throws Exception{
String _xcode = "";
 //BA.debugLineNum = 186;BA.debugLine="Sub AddTab(tabID As String, tabLabel As String, ta";
 //BA.debugLineNum = 187;BA.debugLine="Dim xcode As String = \"\"";
_xcode = "";
 //BA.debugLineNum = 188;BA.debugLine="If tabContent <> Null Then xcode = tabContent.tos";
if (_tabcontent!= null) { 
_xcode = _tabcontent._tostring /*String*/ ();};
 //BA.debugLineNum = 189;BA.debugLine="AddTabItem(tabID, tabLabel, tabIcon, xcode)";
_addtabitem(_tabid,_tablabel,_tabicon,_xcode);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public String  _addtabbadge(String _tabid,String _tablabel,String _tabicon,b4j.example.vmcontainer _tabcontent,String _badge) throws Exception{
String _xcode = "";
 //BA.debugLineNum = 193;BA.debugLine="Sub AddTabBadge(tabID As String, tabLabel As Strin";
 //BA.debugLineNum = 194;BA.debugLine="Dim xcode As String = \"\"";
_xcode = "";
 //BA.debugLineNum = 195;BA.debugLine="If tabContent <> Null Then xcode = tabContent.tos";
if (_tabcontent!= null) { 
_xcode = _tabcontent._tostring /*String*/ ();};
 //BA.debugLineNum = 196;BA.debugLine="AddTabItemBadge(tabID, tabLabel, tabIcon, xcode,";
_addtabitembadge(_tabid,_tablabel,_tabicon,_xcode,_badge);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public String  _addtabitem(String _tabid,String _tablabel,String _tabicon,String _tabcontent) throws Exception{
b4j.example.vmtab _tabi = null;
int _ttot = 0;
b4j.example.vmtabitem _tabitem = null;
b4j.example.vmelement _vcard = null;
b4j.example.vmelement _vcardtext = null;
 //BA.debugLineNum = 149;BA.debugLine="Sub AddTabItem(tabID As String, tabLabel As String";
 //BA.debugLineNum = 150;BA.debugLine="tabID = tabID.ToLowerCase";
_tabid = _tabid.toLowerCase();
 //BA.debugLineNum = 151;BA.debugLine="Dim tabi As VMTab";
_tabi = new b4j.example.vmtab();
 //BA.debugLineNum = 152;BA.debugLine="tabi.Initialize(vue, tabID, Module).SetStatic(bSt";
_tabi._initialize /*b4j.example.vmtab*/ (ba,_vue,_tabid,_module)._setstatic /*b4j.example.vmtab*/ (_bstatic)._setdesignmode /*b4j.example.vmtab*/ (_designmode);
 //BA.debugLineNum = 153;BA.debugLine="Dim tTot As Int = titems.Size";
_ttot = _titems.getSize();
 //BA.debugLineNum = 154;BA.debugLine="tabi.SetKey(tTot)";
_tabi._setkey /*b4j.example.vmtab*/ (BA.NumberToString(_ttot));
 //BA.debugLineNum = 157;BA.debugLine="tabi.SetHref($\"#tab${tabID}\"$)";
_tabi._sethref /*b4j.example.vmtab*/ (("#tab"+__c.SmartStringFormatter("",(Object)(_tabid))+""));
 //BA.debugLineNum = 158;BA.debugLine="Select Case iconPos";
switch (BA.switchObjectToInt(_iconpos,"right","left")) {
case 0: {
 //BA.debugLineNum = 160;BA.debugLine="tabi.SetText(tabLabel)";
_tabi._settext /*b4j.example.vmtab*/ (_tablabel);
 //BA.debugLineNum = 161;BA.debugLine="tabi.SetIcon(tabIcon)";
_tabi._seticon /*b4j.example.vmtab*/ (_tabicon);
 break; }
case 1: {
 //BA.debugLineNum = 163;BA.debugLine="tabi.SetText(tabLabel)";
_tabi._settext /*b4j.example.vmtab*/ (_tablabel);
 //BA.debugLineNum = 164;BA.debugLine="tabi.SetIcon(tabIcon)";
_tabi._seticon /*b4j.example.vmtab*/ (_tabicon);
 break; }
}
;
 //BA.debugLineNum = 166;BA.debugLine="AddComponent(tabi.ToString)";
_addcomponent(_tabi._tostring /*String*/ ());
 //BA.debugLineNum = 168;BA.debugLine="Dim tabitem As VMTabItem";
_tabitem = new b4j.example.vmtabitem();
 //BA.debugLineNum = 169;BA.debugLine="tabitem.Initialize(vue, \"\", Module).SetStatic(bSt";
_tabitem._initialize /*b4j.example.vmtabitem*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmtabitem*/ (_bstatic)._setdesignmode /*b4j.example.vmtabitem*/ (_designmode);
 //BA.debugLineNum = 170;BA.debugLine="tabitem.SetKey(tabID)";
_tabitem._setkey /*b4j.example.vmtabitem*/ (_tabid);
 //BA.debugLineNum = 171;BA.debugLine="tabitem.SetValue($\"tab${tabID}\"$)";
_tabitem._setvalue /*b4j.example.vmtabitem*/ (("tab"+__c.SmartStringFormatter("",(Object)(_tabid))+""));
 //BA.debugLineNum = 173;BA.debugLine="Dim vcard As VMElement";
_vcard = new b4j.example.vmelement();
 //BA.debugLineNum = 174;BA.debugLine="vcard.Initialize(vue, \"\").SetTag(\"v-card\").SetSta";
_vcard._initialize /*b4j.example.vmelement*/ (ba,_vue,"")._settag /*b4j.example.vmelement*/ ("v-card")._setstatic /*b4j.example.vmelement*/ (_bstatic)._setdesignmode /*b4j.example.vmelement*/ (_designmode)._setattrloose /*b4j.example.vmelement*/ ("flat");
 //BA.debugLineNum = 176;BA.debugLine="Dim vcardtext As VMElement";
_vcardtext = new b4j.example.vmelement();
 //BA.debugLineNum = 177;BA.debugLine="vcardtext.Initialize(vue,\"\").SetTag(\"v-card-text\"";
_vcardtext._initialize /*b4j.example.vmelement*/ (ba,_vue,"")._settag /*b4j.example.vmelement*/ ("v-card-text")._setstatic /*b4j.example.vmelement*/ (_bstatic)._setdesignmode /*b4j.example.vmelement*/ (_designmode);
 //BA.debugLineNum = 178;BA.debugLine="vcardtext.AddComponent(tabContent)";
_vcardtext._addcomponent /*b4j.example.vmelement*/ (_tabcontent);
 //BA.debugLineNum = 179;BA.debugLine="vcard.AddComponent(vcardtext.ToString)";
_vcard._addcomponent /*b4j.example.vmelement*/ (_vcardtext._tostring /*String*/ ());
 //BA.debugLineNum = 180;BA.debugLine="tabitem.AddComponent(vcard.ToString)";
_tabitem._addcomponent /*b4j.example.vmtabitem*/ (_vcard._tostring /*String*/ ());
 //BA.debugLineNum = 181;BA.debugLine="titems.Add(tabitem.ToString)";
_titems.Add((Object)(_tabitem._tostring /*String*/ ()));
 //BA.debugLineNum = 182;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public String  _addtabitembadge(String _tabid,String _tablabel,String _tabicon,String _tabcontent,String _badge) throws Exception{
b4j.example.vmtab _tabi = null;
int _ttot = 0;
b4j.example.vmtabitem _tabitem = null;
b4j.example.vmelement _vcard = null;
b4j.example.vmelement _vcardtext = null;
 //BA.debugLineNum = 110;BA.debugLine="Sub AddTabItemBadge(tabID As String, tabLabel As S";
 //BA.debugLineNum = 111;BA.debugLine="tabID = tabID.ToLowerCase";
_tabid = _tabid.toLowerCase();
 //BA.debugLineNum = 112;BA.debugLine="Dim tabi As VMTab";
_tabi = new b4j.example.vmtab();
 //BA.debugLineNum = 113;BA.debugLine="tabi.Initialize(vue, tabID, Module).SetStatic(bSt";
_tabi._initialize /*b4j.example.vmtab*/ (ba,_vue,_tabid,_module)._setstatic /*b4j.example.vmtab*/ (_bstatic)._setdesignmode /*b4j.example.vmtab*/ (_designmode);
 //BA.debugLineNum = 114;BA.debugLine="Dim tTot As Int = titems.Size";
_ttot = _titems.getSize();
 //BA.debugLineNum = 115;BA.debugLine="tabi.SetKey(tTot)";
_tabi._setkey /*b4j.example.vmtab*/ (BA.NumberToString(_ttot));
 //BA.debugLineNum = 117;BA.debugLine="tabi.SetBadge(badge)";
_tabi._setbadge /*b4j.example.vmtab*/ (_badge);
 //BA.debugLineNum = 118;BA.debugLine="tabi.SetHref($\"#tab${tabID}\"$)";
_tabi._sethref /*b4j.example.vmtab*/ (("#tab"+__c.SmartStringFormatter("",(Object)(_tabid))+""));
 //BA.debugLineNum = 119;BA.debugLine="Select Case iconPos";
switch (BA.switchObjectToInt(_iconpos,"right","left")) {
case 0: {
 //BA.debugLineNum = 121;BA.debugLine="tabi.SetText(tabLabel)";
_tabi._settext /*b4j.example.vmtab*/ (_tablabel);
 //BA.debugLineNum = 122;BA.debugLine="tabi.SetIcon(tabIcon)";
_tabi._seticon /*b4j.example.vmtab*/ (_tabicon);
 break; }
case 1: {
 //BA.debugLineNum = 124;BA.debugLine="tabi.SetText(tabLabel)";
_tabi._settext /*b4j.example.vmtab*/ (_tablabel);
 //BA.debugLineNum = 125;BA.debugLine="tabi.SetIcon(tabIcon)";
_tabi._seticon /*b4j.example.vmtab*/ (_tabicon);
 break; }
}
;
 //BA.debugLineNum = 127;BA.debugLine="AddComponent(tabi.ToString)";
_addcomponent(_tabi._tostring /*String*/ ());
 //BA.debugLineNum = 129;BA.debugLine="Dim tabitem As VMTabItem";
_tabitem = new b4j.example.vmtabitem();
 //BA.debugLineNum = 130;BA.debugLine="tabitem.Initialize(vue, \"\", Module).SetStatic(bSt";
_tabitem._initialize /*b4j.example.vmtabitem*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmtabitem*/ (_bstatic)._setdesignmode /*b4j.example.vmtabitem*/ (_designmode);
 //BA.debugLineNum = 131;BA.debugLine="tabitem.SetKey(tabID)";
_tabitem._setkey /*b4j.example.vmtabitem*/ (_tabid);
 //BA.debugLineNum = 132;BA.debugLine="tabitem.SetValue($\"tab${tabID}\"$)";
_tabitem._setvalue /*b4j.example.vmtabitem*/ (("tab"+__c.SmartStringFormatter("",(Object)(_tabid))+""));
 //BA.debugLineNum = 134;BA.debugLine="Dim vcard As VMElement";
_vcard = new b4j.example.vmelement();
 //BA.debugLineNum = 135;BA.debugLine="vcard.Initialize(vue, \"\").SetTag(\"v-card\").SetSta";
_vcard._initialize /*b4j.example.vmelement*/ (ba,_vue,"")._settag /*b4j.example.vmelement*/ ("v-card")._setstatic /*b4j.example.vmelement*/ (_bstatic)._setdesignmode /*b4j.example.vmelement*/ (_designmode)._setattrloose /*b4j.example.vmelement*/ ("flat");
 //BA.debugLineNum = 137;BA.debugLine="Dim vcardtext As VMElement";
_vcardtext = new b4j.example.vmelement();
 //BA.debugLineNum = 138;BA.debugLine="vcardtext.Initialize(vue,\"\").SetTag(\"v-card-text\"";
_vcardtext._initialize /*b4j.example.vmelement*/ (ba,_vue,"")._settag /*b4j.example.vmelement*/ ("v-card-text")._setstatic /*b4j.example.vmelement*/ (_bstatic)._setdesignmode /*b4j.example.vmelement*/ (_designmode);
 //BA.debugLineNum = 139;BA.debugLine="vcardtext.AddComponent(tabContent)";
_vcardtext._addcomponent /*b4j.example.vmelement*/ (_tabcontent);
 //BA.debugLineNum = 140;BA.debugLine="vcard.AddComponent(vcardtext.ToString)";
_vcard._addcomponent /*b4j.example.vmelement*/ (_vcardtext._tostring /*String*/ ());
 //BA.debugLineNum = 141;BA.debugLine="tabitem.AddComponent(vcard.ToString)";
_tabitem._addcomponent /*b4j.example.vmtabitem*/ (_vcard._tostring /*String*/ ());
 //BA.debugLineNum = 142;BA.debugLine="titems.Add(tabitem.ToString)";
_titems.Add((Object)(_tabitem._tostring /*String*/ ()));
 //BA.debugLineNum = 143;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabs  _addtabslider() throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub AddTabSlider As VMTabs";
 //BA.debugLineNum = 97;BA.debugLine="AddComponent(\"<v-tabs-slider></v-tabs-slider>\")";
_addcomponent("<v-tabs-slider></v-tabs-slider>");
 //BA.debugLineNum = 98;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 716;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 717;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 718;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabs  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 663;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 664;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 665;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 666;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 667;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 720;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 721;BA.debugLine="Tabs.BuildModel(mprops, mstyles, lclasses, loose)";
_tabs._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 722;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 723;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Tabs As VMElement";
_tabs = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Public hasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 10;BA.debugLine="Public OnToolBar As Boolean";
_ontoolbar = false;
 //BA.debugLineNum = 11;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 12;BA.debugLine="Private titems As List";
_titems = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 13;BA.debugLine="Private iconPos As String";
_iconpos = "";
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabs  _disable() throws Exception{
 //BA.debugLineNum = 656;BA.debugLine="Sub Disable As VMTabs";
 //BA.debugLineNum = 657;BA.debugLine="Tabs.Disable(True)";
_tabs._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 658;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _enable() throws Exception{
 //BA.debugLineNum = 651;BA.debugLine="Sub Enable As VMTabs";
 //BA.debugLineNum = 652;BA.debugLine="Tabs.Enable(True)";
_tabs._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 653;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 654;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _hide() throws Exception{
 //BA.debugLineNum = 641;BA.debugLine="Sub Hide As VMTabs";
 //BA.debugLineNum = 642;BA.debugLine="Tabs.SetVisible(False)";
_tabs._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 643;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 644;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 18;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 19;BA.debugLine="Tabs.Initialize(v, ID)";
_tabs._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 20;BA.debugLine="Tabs.SetTag(\"v-tabs\").SetVModel($\"${ID}ds\"$)";
_tabs._settag /*b4j.example.vmelement*/ ("v-tabs")._setvmodel /*b4j.example.vmelement*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"ds"));
 //BA.debugLineNum = 21;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 23;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 24;BA.debugLine="vue.SetData($\"${ID}ds\"$, Null)";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"ds"),__c.Null);
 //BA.debugLineNum = 25;BA.debugLine="hasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 26;BA.debugLine="OnToolBar = False";
_ontoolbar = __c.False;
 //BA.debugLineNum = 27;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 28;BA.debugLine="titems.Initialize";
_titems.Initialize();
 //BA.debugLineNum = 29;BA.debugLine="iconPos = \"left\"";
_iconpos = "left";
 //BA.debugLineNum = 30;BA.debugLine="SetOnChange(Module,  $\"${ID}_change\"$)";
_setonchange(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_change"));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 271;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabs  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 670;BA.debugLine="public Sub RemoveAttr(sName As String) As VMTabs";
 //BA.debugLineNum = 671;BA.debugLine="Tabs.RemoveAttr(sName)";
_tabs._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 672;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 673;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub Render";
 //BA.debugLineNum = 253;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabs  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 293;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 294;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 295;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 296;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 299;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 300;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 301;BA.debugLine="Tabs.Bind(\":active-class\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setalignwithtitle(boolean _varalignwithtitle) throws Exception{
String _pp = "";
 //BA.debugLineNum = 306;BA.debugLine="Sub SetAlignWithTitle(varAlignWithTitle As Boolean";
 //BA.debugLineNum = 307;BA.debugLine="If varAlignWithTitle = False Then Return Me";
if (_varalignwithtitle==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 308;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 309;BA.debugLine="SetAttrSingle(\"align-with-title\", varAlignWithTi";
_setattrsingle("align-with-title",BA.ObjectToString(_varalignwithtitle));
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 312;BA.debugLine="Dim pp As String = $\"${ID}AlignWithTitle\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AlignWithTitle");
 //BA.debugLineNum = 313;BA.debugLine="vue.SetStateSingle(pp, varAlignWithTitle)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varalignwithtitle));
 //BA.debugLineNum = 314;BA.debugLine="Tabs.Bind(\":align-with-title\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":align-with-title",_pp);
 //BA.debugLineNum = 315;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub SetAttr(attr As Map) As VMTabs";
 //BA.debugLineNum = 282;BA.debugLine="Tabs.SetAttr(attr)";
_tabs._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 211;BA.debugLine="Sub SetAttributes(attrs As List) As VMTabs";
 //BA.debugLineNum = 212;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 213;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetAttrLoose(loose As String) As VMTabs";
 //BA.debugLineNum = 207;BA.debugLine="Tabs.SetAttrLoose(loose)";
_tabs._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 710;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 711;BA.debugLine="Tabs.SetAttrSingle(prop, value)";
_tabs._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 712;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 713;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setbackgroundcolor(String _varbackgroundcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 319;BA.debugLine="Sub SetBackgroundColor(varBackgroundColor As Strin";
 //BA.debugLineNum = 320;BA.debugLine="If varBackgroundColor = \"\" Then Return Me";
if ((_varbackgroundcolor).equals("")) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 321;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 322;BA.debugLine="SetAttrSingle(\"background-color\", varBackgroundC";
_setattrsingle("background-color",_varbackgroundcolor);
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 325;BA.debugLine="Dim pp As String = $\"${ID}BackgroundColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BackgroundColor");
 //BA.debugLineNum = 326;BA.debugLine="vue.SetStateSingle(pp, varBackgroundColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbackgroundcolor));
 //BA.debugLineNum = 327;BA.debugLine="Tabs.Bind(\":background-color\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setbackgroundcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 332;BA.debugLine="Sub SetBackgroundColorIntensity(varColor As String";
 //BA.debugLineNum = 333;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 334;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 335;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 336;BA.debugLine="SetAttrSingle(\"background-color\", scolor)";
_setattrsingle("background-color",_scolor);
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 339;BA.debugLine="Dim pp As String = $\"${ID}backgroundcolor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"backgroundcolor");
 //BA.debugLineNum = 340;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 341;BA.debugLine="Tabs.Bind(\":background-color\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setcenteractive(boolean _varcenteractive) throws Exception{
String _pp = "";
 //BA.debugLineNum = 347;BA.debugLine="Sub SetCenterActive(varCenterActive As Boolean) As";
 //BA.debugLineNum = 348;BA.debugLine="If varCenterActive = False Then Return Me";
if (_varcenteractive==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 349;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 350;BA.debugLine="SetAttrSingle(\"center-active\", varCenterActive)";
_setattrsingle("center-active",BA.ObjectToString(_varcenteractive));
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 353;BA.debugLine="Dim pp As String = $\"${ID}CenterActive\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CenterActive");
 //BA.debugLineNum = 354;BA.debugLine="vue.SetStateSingle(pp, varCenterActive)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcenteractive));
 //BA.debugLineNum = 355;BA.debugLine="Tabs.Bind(\":center-active\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":center-active",_pp);
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setcentered(boolean _varcentered) throws Exception{
String _pp = "";
 //BA.debugLineNum = 360;BA.debugLine="Sub SetCentered(varCentered As Boolean) As VMTabs";
 //BA.debugLineNum = 361;BA.debugLine="If varCentered = False Then Return Me";
if (_varcentered==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 362;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 363;BA.debugLine="SetAttrSingle(\"centered\", varCentered)";
_setattrsingle("centered",BA.ObjectToString(_varcentered));
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 366;BA.debugLine="Dim pp As String = $\"${ID}Centered\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Centered");
 //BA.debugLineNum = 367;BA.debugLine="vue.SetStateSingle(pp, varCentered)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcentered));
 //BA.debugLineNum = 368;BA.debugLine="Tabs.Bind(\":centered\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":centered",_pp);
 //BA.debugLineNum = 369;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 373;BA.debugLine="Sub SetColor(varColor As String) As VMTabs";
 //BA.debugLineNum = 374;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 375;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 376;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 377;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 379;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 380;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 381;BA.debugLine="Tabs.Bind(\":color\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 382;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 386;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 387;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 388;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 389;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 390;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 391;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 393;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 394;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 395;BA.debugLine="Tabs.Bind(\":color\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 400;BA.debugLine="Sub SetDark(varDark As Boolean) As VMTabs";
 //BA.debugLineNum = 401;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 402;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 403;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 404;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 406;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 407;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 408;BA.debugLine="Tabs.Bind(\":dark\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 35;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 686;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMTabs";
 //BA.debugLineNum = 687;BA.debugLine="Tabs.SetDesignMode(b)";
_tabs._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 689;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 690;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 79;BA.debugLine="Tabs.SetDeviceOffsets(OS, OM, OL, OX)";
_tabs._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 91;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 92;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 85;BA.debugLine="Tabs.SetDeviceSizes(SS, SM, SL, SX)";
_tabs._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setfixedtabs(boolean _varfixedtabs) throws Exception{
String _pp = "";
 //BA.debugLineNum = 413;BA.debugLine="Sub SetFixedTabs(varFixedTabs As Boolean) As VMTab";
 //BA.debugLineNum = 414;BA.debugLine="If varFixedTabs = False Then Return Me";
if (_varfixedtabs==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 415;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 416;BA.debugLine="SetAttrSingle(\"fixed-tabs\",varFixedTabs)";
_setattrsingle("fixed-tabs",BA.ObjectToString(_varfixedtabs));
 //BA.debugLineNum = 417;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 419;BA.debugLine="Dim pp As String = $\"${ID}FixedTabs\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"FixedTabs");
 //BA.debugLineNum = 420;BA.debugLine="vue.SetStateSingle(pp, varFixedTabs)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfixedtabs));
 //BA.debugLineNum = 421;BA.debugLine="Tabs.Bind(\":fixed-tabs\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":fixed-tabs",_pp);
 //BA.debugLineNum = 422;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setgrow(boolean _vargrow) throws Exception{
String _pp = "";
 //BA.debugLineNum = 426;BA.debugLine="Sub SetGrow(varGrow As Boolean) As VMTabs";
 //BA.debugLineNum = 427;BA.debugLine="If varGrow = False Then Return Me";
if (_vargrow==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 428;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 429;BA.debugLine="SetAttrSingle(\"grow\", varGrow)";
_setattrsingle("grow",BA.ObjectToString(_vargrow));
 //BA.debugLineNum = 430;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 432;BA.debugLine="Dim pp As String = $\"${ID}Grow\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Grow");
 //BA.debugLineNum = 433;BA.debugLine="vue.SetStateSingle(pp, varGrow)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vargrow));
 //BA.debugLineNum = 434;BA.debugLine="Tabs.Bind(\":grow\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":grow",_pp);
 //BA.debugLineNum = 435;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 439;BA.debugLine="Sub SetHeight(varHeight As String) As VMTabs";
 //BA.debugLineNum = 440;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 441;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 442;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 443;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 445;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 446;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 447;BA.debugLine="Tabs.Bind(\":height\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _sethideslider(boolean _varhideslider) throws Exception{
String _pp = "";
 //BA.debugLineNum = 452;BA.debugLine="Sub SetHideSlider(varHideSlider As Boolean) As VMT";
 //BA.debugLineNum = 453;BA.debugLine="If varHideSlider = False Then Return Me";
if (_varhideslider==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 454;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 455;BA.debugLine="SetAttrSingle(\"hide-slider\", varHideSlider)";
_setattrsingle("hide-slider",BA.ObjectToString(_varhideslider));
 //BA.debugLineNum = 456;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 458;BA.debugLine="Dim pp As String = $\"${ID}HideSlider\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideSlider");
 //BA.debugLineNum = 459;BA.debugLine="vue.SetStateSingle(pp, varHideSlider)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhideslider));
 //BA.debugLineNum = 460;BA.debugLine="Tabs.Bind(\":hide-slider\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":hide-slider",_pp);
 //BA.debugLineNum = 461;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _seticonposright(boolean _b) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetIconPosRight(b As Boolean) As VMTabs";
 //BA.debugLineNum = 60;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 61;BA.debugLine="iconPos = \"right\"";
_iconpos = "right";
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _seticonsandtext(boolean _variconsandtext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 465;BA.debugLine="Sub SetIconsAndText(varIconsAndText As Boolean) As";
 //BA.debugLineNum = 466;BA.debugLine="If varIconsAndText = False Then Return Me";
if (_variconsandtext==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 467;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 468;BA.debugLine="SetAttrSingle(\"icons-and-text\", varIconsAndText)";
_setattrsingle("icons-and-text",BA.ObjectToString(_variconsandtext));
 //BA.debugLineNum = 469;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 471;BA.debugLine="Dim pp As String = $\"${ID}IconsAndText\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"IconsAndText");
 //BA.debugLineNum = 472;BA.debugLine="vue.SetStateSingle(pp, varIconsAndText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_variconsandtext));
 //BA.debugLineNum = 473;BA.debugLine="Tabs.Bind(\":icons-and-text\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":icons-and-text",_pp);
 //BA.debugLineNum = 474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 478;BA.debugLine="Sub SetLight(varLight As Boolean) As VMTabs";
 //BA.debugLineNum = 479;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 480;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 481;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 484;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 485;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 486;BA.debugLine="Tabs.Bind(\":light\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 487;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 488;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 681;BA.debugLine="Sub SetMarginAll(p As String) As VMTabs";
 //BA.debugLineNum = 682;BA.debugLine="Tabs.setmarginall(p)";
_tabs._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 683;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 684;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setmobilebreakpoint(String _varmobilebreakpoint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 491;BA.debugLine="Sub SetMobileBreakPoint(varMobileBreakPoint As Str";
 //BA.debugLineNum = 492;BA.debugLine="If varMobileBreakPoint = \"\" Then Return Me";
if ((_varmobilebreakpoint).equals("")) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 493;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 494;BA.debugLine="SetAttrSingle(\"mobile-break-point\", varMobileBre";
_setattrsingle("mobile-break-point",_varmobilebreakpoint);
 //BA.debugLineNum = 495;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 497;BA.debugLine="Dim pp As String = $\"${ID}MobileBreakPoint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MobileBreakPoint");
 //BA.debugLineNum = 498;BA.debugLine="vue.SetStateSingle(pp, varMobileBreakPoint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmobilebreakpoint));
 //BA.debugLineNum = 499;BA.debugLine="Tabs.Bind(\":mobile-break-point\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":mobile-break-point",_pp);
 //BA.debugLineNum = 500;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 501;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 699;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 700;BA.debugLine="Tabs.SetName(varName, bbind)";
_tabs._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 701;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 702;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setnexticon(String _varnexticon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 504;BA.debugLine="Sub SetNextIcon(varNextIcon As String) As VMTabs";
 //BA.debugLineNum = 505;BA.debugLine="If varNextIcon = \"\" Then Return Me";
if ((_varnexticon).equals("")) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 506;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 507;BA.debugLine="SetAttrSingle(\"next-icon\", varNextIcon)";
_setattrsingle("next-icon",_varnexticon);
 //BA.debugLineNum = 508;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 510;BA.debugLine="Dim pp As String = $\"${ID}NextIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NextIcon");
 //BA.debugLineNum = 511;BA.debugLine="vue.SetStateSingle(pp, varNextIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnexticon));
 //BA.debugLineNum = 512;BA.debugLine="Tabs.Bind(\":next-icon\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":next-icon",_pp);
 //BA.debugLineNum = 513;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 514;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setonchange(Object _eventhandler,String _methodname) throws Exception{
Object _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 629;BA.debugLine="Sub SetOnChange(eventHandler As Object, methodName";
 //BA.debugLineNum = 630;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 631;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 632;BA.debugLine="Dim e As Object";
_e = new Object();
 //BA.debugLineNum = 633;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_e}))));
 //BA.debugLineNum = 634;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 636;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 637;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 638;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setoptional(boolean _varoptional) throws Exception{
String _pp = "";
 //BA.debugLineNum = 517;BA.debugLine="Sub SetOptional(varOptional As Boolean) As VMTabs";
 //BA.debugLineNum = 518;BA.debugLine="If varOptional = False Then Return Me";
if (_varoptional==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 519;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 520;BA.debugLine="SetAttrSingle(\"optional\", varOptional)";
_setattrsingle("optional",BA.ObjectToString(_varoptional));
 //BA.debugLineNum = 521;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 523;BA.debugLine="Dim pp As String = $\"${ID}Optional\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Optional");
 //BA.debugLineNum = 524;BA.debugLine="vue.SetStateSingle(pp, varOptional)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoptional));
 //BA.debugLineNum = 525;BA.debugLine="Tabs.Bind(\":optional\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":optional",_pp);
 //BA.debugLineNum = 526;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 527;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 676;BA.debugLine="Sub SetPaddingAll(p As String) As VMTabs";
 //BA.debugLineNum = 677;BA.debugLine="Tabs.SetPaddingAll(p)";
_tabs._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 678;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setprevicon(String _varprevicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 530;BA.debugLine="Sub SetPrevIcon(varPrevIcon As String) As VMTabs";
 //BA.debugLineNum = 531;BA.debugLine="If varPrevIcon = \"\" Then Return Me";
if ((_varprevicon).equals("")) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 532;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 533;BA.debugLine="SetAttrSingle(\"prev-icon\", varPrevIcon)";
_setattrsingle("prev-icon",_varprevicon);
 //BA.debugLineNum = 534;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 536;BA.debugLine="Dim pp As String = $\"${ID}PrevIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrevIcon");
 //BA.debugLineNum = 537;BA.debugLine="vue.SetStateSingle(pp, varPrevIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprevicon));
 //BA.debugLineNum = 538;BA.debugLine="Tabs.Bind(\":prev-icon\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":prev-icon",_pp);
 //BA.debugLineNum = 539;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMTab";
 //BA.debugLineNum = 73;BA.debugLine="Tabs.SetRC(sRow, sCol)";
_tabs._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setright(boolean _varright) throws Exception{
String _pp = "";
 //BA.debugLineNum = 543;BA.debugLine="Sub SetRight(varRight As Boolean) As VMTabs";
 //BA.debugLineNum = 544;BA.debugLine="If varRight = False Then Return Me";
if (_varright==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 545;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 546;BA.debugLine="SetAttrSingle(\"right\", varRight)";
_setattrsingle("right",BA.ObjectToString(_varright));
 //BA.debugLineNum = 547;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 549;BA.debugLine="Dim pp As String = $\"${ID}Right\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Right");
 //BA.debugLineNum = 550;BA.debugLine="vue.SetStateSingle(pp, varRight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varright));
 //BA.debugLineNum = 551;BA.debugLine="Tabs.Bind(\":right\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":right",_pp);
 //BA.debugLineNum = 552;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 553;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setshowarrows(boolean _varshowarrows) throws Exception{
String _pp = "";
 //BA.debugLineNum = 556;BA.debugLine="Sub SetShowArrows(varShowArrows As Boolean) As VMT";
 //BA.debugLineNum = 557;BA.debugLine="If varShowArrows = False Then Return Me";
if (_varshowarrows==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 558;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 559;BA.debugLine="SetAttrSingle(\"show-arrows\", varShowArrows)";
_setattrsingle("show-arrows",BA.ObjectToString(_varshowarrows));
 //BA.debugLineNum = 560;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 562;BA.debugLine="Dim pp As String = $\"${ID}ShowArrows\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowArrows");
 //BA.debugLineNum = 563;BA.debugLine="vue.SetStateSingle(pp, varShowArrows)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshowarrows));
 //BA.debugLineNum = 564;BA.debugLine="Tabs.Bind(\":show-arrows\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":show-arrows",_pp);
 //BA.debugLineNum = 565;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 566;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setslidercolor(String _varslidercolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 569;BA.debugLine="Sub SetSliderColor(varSliderColor As String) As VM";
 //BA.debugLineNum = 570;BA.debugLine="If varSliderColor = \"\" Then Return Me";
if ((_varslidercolor).equals("")) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 571;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 572;BA.debugLine="SetAttrSingle(\"slider-color\", varSliderColor)";
_setattrsingle("slider-color",_varslidercolor);
 //BA.debugLineNum = 573;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 575;BA.debugLine="Dim pp As String = $\"${ID}SliderColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SliderColor");
 //BA.debugLineNum = 576;BA.debugLine="vue.SetStateSingle(pp, varSliderColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varslidercolor));
 //BA.debugLineNum = 577;BA.debugLine="Tabs.Bind(\":slider-color\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":slider-color",_pp);
 //BA.debugLineNum = 578;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 579;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setslidercolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 582;BA.debugLine="Sub SetSliderColorIntensity(varColor As String, va";
 //BA.debugLineNum = 583;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 584;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 585;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 586;BA.debugLine="SetAttrSingle(\"slider-color\", scolor)";
_setattrsingle("slider-color",_scolor);
 //BA.debugLineNum = 587;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 589;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 590;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 591;BA.debugLine="Tabs.Bind(\":slider-color\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":slider-color",_pp);
 //BA.debugLineNum = 592;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 593;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setslidersize(String _varslidersize) throws Exception{
String _pp = "";
 //BA.debugLineNum = 596;BA.debugLine="Sub SetSliderSize(varSliderSize As String) As VMTa";
 //BA.debugLineNum = 597;BA.debugLine="If varSliderSize = \"\" Then Return Me";
if ((_varslidersize).equals("")) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 598;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 599;BA.debugLine="SetAttrSingle(\"slider-size\",varSliderSize)";
_setattrsingle("slider-size",_varslidersize);
 //BA.debugLineNum = 600;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 602;BA.debugLine="Dim pp As String = $\"${ID}SliderSize\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SliderSize");
 //BA.debugLineNum = 603;BA.debugLine="vue.SetStateSingle(pp, varSliderSize)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varslidersize));
 //BA.debugLineNum = 604;BA.debugLine="Tabs.Bind(\":slider-size\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":slider-size",_pp);
 //BA.debugLineNum = 605;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 606;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetStatic(b As Boolean) As VMTabs";
 //BA.debugLineNum = 66;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 67;BA.debugLine="Tabs.SetStatic(b)";
_tabs._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetStyle(sm As Map) As VMTabs";
 //BA.debugLineNum = 288;BA.debugLine="Tabs.SetStyle(sm)";
_tabs._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 705;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 706;BA.debugLine="Tabs.SetStyleSingle(prop, value)";
_tabs._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 707;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 708;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 693;BA.debugLine="Sub SetTabIndex(ti As String) As VMTabs";
 //BA.debugLineNum = 694;BA.debugLine="Tabs.SetTabIndex(ti)";
_tabs._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 695;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 696;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _settabslider(boolean _b) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetTabSlider(b As Boolean) As VMTabs";
 //BA.debugLineNum = 103;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 104;BA.debugLine="AddComponent(\"<v-tabs-slider></v-tabs-slider>\")";
_addcomponent("<v-tabs-slider></v-tabs-slider>");
 //BA.debugLineNum = 105;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub SetText(t As Object) As VMTabs";
 //BA.debugLineNum = 265;BA.debugLine="Tabs.SetText(t)";
_tabs._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _settransition(String _vartransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 42;BA.debugLine="Sub SetTransition(varTransition As String) As VMTa";
 //BA.debugLineNum = 43;BA.debugLine="If varTransition = \"\" Then Return Me";
if ((_vartransition).equals("")) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 44;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 45;BA.debugLine="SetAttrSingle(\"transition\", varTransition)";
_setattrsingle("transition",_vartransition);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 48;BA.debugLine="Dim pp As String = $\"${ID}Transition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Transition");
 //BA.debugLineNum = 49;BA.debugLine="vue.SetStateSingle(pp, varTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartransition));
 //BA.debugLineNum = 50;BA.debugLine="Tabs.Bind(\":transition\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":transition",_pp);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 609;BA.debugLine="Sub SetValue(varValue As String) As VMTabs";
 //BA.debugLineNum = 610;BA.debugLine="varValue = varValue.tolowercase";
_varvalue = _varvalue.toLowerCase();
 //BA.debugLineNum = 611;BA.debugLine="Tabs.SetValue(varValue, False)";
_tabs._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 612;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 613;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setvertical(boolean _varvertical) throws Exception{
String _pp = "";
 //BA.debugLineNum = 616;BA.debugLine="Sub SetVertical(varVertical As Boolean) As VMTabs";
 //BA.debugLineNum = 617;BA.debugLine="If varVertical = False Then Return Me";
if (_varvertical==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 618;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 619;BA.debugLine="SetAttrSingle(\"vertical\", varVertical)";
_setattrsingle("vertical",BA.ObjectToString(_varvertical));
 //BA.debugLineNum = 620;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 };
 //BA.debugLineNum = 622;BA.debugLine="Dim pp As String = $\"${ID}Vertical\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Vertical");
 //BA.debugLineNum = 623;BA.debugLine="vue.SetStateSingle(pp, varVertical)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvertical));
 //BA.debugLineNum = 624;BA.debugLine="Tabs.Bind(\":vertical\", pp)";
_tabs._bind /*b4j.example.vmelement*/ (":vertical",_pp);
 //BA.debugLineNum = 625;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 626;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub SetVIf(vif As String) As VMTabs";
 //BA.debugLineNum = 242;BA.debugLine="Tabs.SetVIf(vif)";
_tabs._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 725;BA.debugLine="Sub SetVisible(b As Boolean) As VMTabs";
 //BA.debugLineNum = 726;BA.debugLine="Tabs.SetVisible(b)";
_tabs._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 727;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 728;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub SetVModel(k As String) As VMTabs";
 //BA.debugLineNum = 237;BA.debugLine="Tabs.SetVModel(k)";
_tabs._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setvonce(boolean _t) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetVOnce(t As Boolean) As VMTabs";
 //BA.debugLineNum = 55;BA.debugLine="Tabs.setvonce(t)";
_tabs._setvonce /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetVShow(vif As String) As VMTabs";
 //BA.debugLineNum = 247;BA.debugLine="Tabs.SetVShow(vif)";
_tabs._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _show() throws Exception{
 //BA.debugLineNum = 646;BA.debugLine="Sub Show As VMTabs";
 //BA.debugLineNum = 647;BA.debugLine="Tabs.SetVisible(True)";
_tabs._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 648;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 649;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
String _sitems = "";
 //BA.debugLineNum = 219;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 220;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 221;BA.debugLine="Dim eName As String = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 222;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 223;BA.debugLine="Log($\"VMTabs.${eName} event has not been defined";
__c.Log(("VMTabs."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 226;BA.debugLine="Dim sitems As String = vue.Join(\"\", titems)";
_sitems = _vue._join /*String*/ ("",_titems);
 //BA.debugLineNum = 227;BA.debugLine="AddComponent(sitems)";
_addcomponent(_sitems);
 //BA.debugLineNum = 229;BA.debugLine="If OnToolBar = False Then";
if (_ontoolbar==__c.False) { 
 //BA.debugLineNum = 230;BA.debugLine="Return $\"<v-card>${Tabs.tostring}</v-card>\"$";
if (true) return ("<v-card>"+__c.SmartStringFormatter("",(Object)(_tabs._tostring /*String*/ ()))+"</v-card>");
 }else {
 //BA.debugLineNum = 232;BA.debugLine="Return Tabs.ToString";
if (true) return _tabs._tostring /*String*/ ();
 };
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
