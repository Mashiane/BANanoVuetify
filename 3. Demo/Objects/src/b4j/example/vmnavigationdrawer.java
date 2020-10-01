package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmnavigationdrawer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmnavigationdrawer", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmnavigationdrawer.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _navigationdrawer = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public b4j.example.vmlist _list = null;
public b4j.example.vmtemplate _bottomsection = null;
public String _mini = "";
public b4j.example.vmcontainer _container = null;
public boolean _bstatic = false;
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
public b4j.example.vmnavigationdrawer  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 216;BA.debugLine="Sub AddChild(child As VMElement) As VMNavigationDr";
 //BA.debugLineNum = 217;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 218;BA.debugLine="NavigationDrawer.SetText(childHTML)";
_navigationdrawer._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 252;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 253;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 254;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmnavigationdrawer  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub AddClass(c As String) As VMNavigationDrawer";
 //BA.debugLineNum = 235;BA.debugLine="NavigationDrawer.AddClass(c)";
_navigationdrawer._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub AddComponent(comp As String) As VMNavigationDr";
 //BA.debugLineNum = 72;BA.debugLine="SetText(comp)";
_settext((Object)(_comp));
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _adddivider() throws Exception{
String _strline = "";
 //BA.debugLineNum = 94;BA.debugLine="Sub AddDivider As VMNavigationDrawer";
 //BA.debugLineNum = 95;BA.debugLine="Dim strLine As String = $\"<v-divider></v-divider>";
_strline = ("<v-divider></v-divider>");
 //BA.debugLineNum = 96;BA.debugLine="SetText(strLine)";
_settext((Object)(_strline));
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _adddivider1(boolean _binset) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub AddDivider1(bInset As Boolean) As VMNavigation";
 //BA.debugLineNum = 145;BA.debugLine="List.AddDivider1(bInset)";
_list._adddivider1 /*b4j.example.vmlist*/ (_binset);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public String  _addicon1(String _key,String _iconname,String _iconcolor,String _title,String _tooltip) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub AddIcon1(key As String, iconName As String, ic";
 //BA.debugLineNum = 137;BA.debugLine="List.AddItem1(key, \"\", iconName, iconColor, title";
_list._additem1 /*b4j.example.vmlist*/ (_key,"",_iconname,_iconcolor,_title,_tooltip,"","","");
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmnavigationdrawer  _additem(String _key,String _iconname,String _title) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub AddItem(key As String, iconName As String, tit";
 //BA.debugLineNum = 132;BA.debugLine="List.AddItem(key, \"\", iconName, title, \"\", \"\")";
_list._additem /*b4j.example.vmlist*/ (_key,"",_iconname,_title,"","");
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public String  _additem1(String _key,String _avatar,String _iconname,String _iconcolor,String _title,String _subtitle,String _subtitle1,String _actionicon,String _actioniconcolor) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub AddItem1(key As String, avatar As String, icon";
 //BA.debugLineNum = 141;BA.debugLine="List.AddItem1(key, avatar, iconName, iconColor, t";
_list._additem1 /*b4j.example.vmlist*/ (_key,_avatar,_iconname,_iconcolor,_title,_subtitle,_subtitle1,_actionicon,_actioniconcolor);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmnavigationdrawer  _addlist(b4j.example.vmlist _lst) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub AddList(lst As VMList) As VMNavigationDrawer";
 //BA.debugLineNum = 127;BA.debugLine="SetText(lst.ToString)";
_settext((Object)(_lst._tostring /*String*/ ()));
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _addonbottomsection(String _html) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub AddOnBottomSection(html As String) As VMNaviga";
 //BA.debugLineNum = 122;BA.debugLine="BottomSection.SetText(html)";
_bottomsection._settext /*b4j.example.vmtemplate*/ (_html);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _addparentchild(String _parent,String _key,String _iconname,String _iconcolor,String _title,String _badge) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub AddParentChild(parent As String, key As String";
 //BA.debugLineNum = 156;BA.debugLine="List.AddParentChild(parent, key, iconName, iconCo";
_list._addparentchild /*b4j.example.vmlist*/ (_parent,_key,_iconname,_iconcolor,_title,_badge);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _addsubheader1(String _hdr,boolean _binset) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub AddSubHeader1(hdr As String, bInset As Boolean";
 //BA.debugLineNum = 150;BA.debugLine="List.AddSubHeader1(hdr, bInset)";
_list._addsubheader1 /*b4j.example.vmlist*/ (_hdr,_binset);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _addtitlesubtitle(String _title,String _subtitle) throws Exception{
b4j.example.vmlistitem _vli = null;
b4j.example.vmlistitemcontent _lic = null;
b4j.example.vmlistitemtitle _lit = null;
b4j.example.vmlistitemsubtitle _listt = null;
 //BA.debugLineNum = 101;BA.debugLine="Sub AddTitleSubTitle(title As String, subtitle As";
 //BA.debugLineNum = 102;BA.debugLine="If title = \"\" Then Return Me";
if ((_title).equals("")) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 103;BA.debugLine="Dim vli As VMListItem";
_vli = new b4j.example.vmlistitem();
 //BA.debugLineNum = 104;BA.debugLine="vli.Initialize(vue, $\"${ID}app\"$, Module).SetStat";
_vli._initialize /*b4j.example.vmlistitem*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"app"),_module)._setstatic /*b4j.example.vmlistitem*/ (__c.True)._setdesignmode /*b4j.example.vmlistitem*/ (_designmode);
 //BA.debugLineNum = 106;BA.debugLine="Dim lic As VMListItemContent";
_lic = new b4j.example.vmlistitemcontent();
 //BA.debugLineNum = 107;BA.debugLine="lic.Initialize(vue,\"\", Module).SetStatic(True).Se";
_lic._initialize /*b4j.example.vmlistitemcontent*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmlistitemcontent*/ (__c.True)._setdesignmode /*b4j.example.vmlistitemcontent*/ (_designmode);
 //BA.debugLineNum = 108;BA.debugLine="Dim lit As VMListItemTitle";
_lit = new b4j.example.vmlistitemtitle();
 //BA.debugLineNum = 109;BA.debugLine="lit.Initialize(vue, \"\", Module).SetStatic(True).S";
_lit._initialize /*b4j.example.vmlistitemtitle*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmlistitemtitle*/ (__c.True)._setdesignmode /*b4j.example.vmlistitemtitle*/ (_designmode)._settext /*b4j.example.vmlistitemtitle*/ ((Object)(_title))._addclass /*b4j.example.vmlistitemtitle*/ ("title");
 //BA.debugLineNum = 110;BA.debugLine="Dim listt As VMListItemSubTitle";
_listt = new b4j.example.vmlistitemsubtitle();
 //BA.debugLineNum = 111;BA.debugLine="listt.Initialize(vue, \"\", Module).SetStatic(True)";
_listt._initialize /*b4j.example.vmlistitemsubtitle*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmlistitemsubtitle*/ (__c.True)._setdesignmode /*b4j.example.vmlistitemsubtitle*/ (_designmode)._settext /*b4j.example.vmlistitemsubtitle*/ ((Object)(_subtitle));
 //BA.debugLineNum = 113;BA.debugLine="lit.Pop(lic.ListItemContent)";
_lit._pop /*String*/ (_lic._listitemcontent /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 114;BA.debugLine="listt.Pop(lic.ListItemContent)";
_listt._pop /*String*/ (_lic._listitemcontent /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 116;BA.debugLine="lic.Pop(vli.ListItem)";
_lic._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 117;BA.debugLine="vli.Pop(NavigationDrawer)";
_vli._pop /*String*/ (_navigationdrawer);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 679;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 680;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 681;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 682;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 683;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 733;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 734;BA.debugLine="NavigationDrawer.BuildModel(mprops, mstyles, lcla";
_navigationdrawer._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 735;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 736;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public NavigationDrawer As VMElement";
_navigationdrawer = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Public List As VMList";
_list = new b4j.example.vmlist();
 //BA.debugLineNum = 10;BA.debugLine="Public BottomSection As VMTemplate";
_bottomsection = new b4j.example.vmtemplate();
 //BA.debugLineNum = 11;BA.debugLine="Private mini As String";
_mini = "";
 //BA.debugLineNum = 12;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
 //BA.debugLineNum = 13;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 14;BA.debugLine="Private smodel As String";
_smodel = "";
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmnavigationdrawer  _disable() throws Exception{
 //BA.debugLineNum = 672;BA.debugLine="Sub Disable As VMNavigationDrawer";
 //BA.debugLineNum = 673;BA.debugLine="NavigationDrawer.Disable(True)";
_navigationdrawer._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 674;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 675;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _enable() throws Exception{
 //BA.debugLineNum = 667;BA.debugLine="Sub Enable As VMNavigationDrawer";
 //BA.debugLineNum = 668;BA.debugLine="NavigationDrawer.Enable(True)";
_navigationdrawer._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 669;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 670;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _hide() throws Exception{
 //BA.debugLineNum = 657;BA.debugLine="Sub Hide As VMNavigationDrawer";
 //BA.debugLineNum = 658;BA.debugLine="vue.SetStateSingle(smodel, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_smodel,(Object)(__c.False));
 //BA.debugLineNum = 659;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 660;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 19;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 20;BA.debugLine="NavigationDrawer.Initialize(v, ID)";
_navigationdrawer._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 21;BA.debugLine="NavigationDrawer.SetTag(\"v-navigation-drawer\")";
_navigationdrawer._settag /*b4j.example.vmelement*/ ("v-navigation-drawer");
 //BA.debugLineNum = 22;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 24;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 25;BA.debugLine="List.Initialize(vue, $\"${ID}items\"$, Module).SetN";
_list._initialize /*b4j.example.vmlist*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"items"),_module)._setnav /*b4j.example.vmlist*/ (__c.True);
 //BA.debugLineNum = 26;BA.debugLine="BottomSection.Initialize(vue, $\"${ID}bottom\"$, Mo";
_bottomsection._initialize /*b4j.example.vmtemplate*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"bottom"),_module)._setslotappend /*b4j.example.vmtemplate*/ ();
 //BA.debugLineNum = 27;BA.debugLine="mini = $\"${ID}mini\"$";
_mini = (""+__c.SmartStringFormatter("",(Object)(_id))+"mini");
 //BA.debugLineNum = 28;BA.debugLine="Container.Initialize(vue, $\"${ID}cont\"$, Module)";
_container._initialize /*b4j.example.vmcontainer*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"cont"),_module);
 //BA.debugLineNum = 29;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 30;BA.debugLine="SetVModel(NavigationDrawer.showkey)";
_setvmodel(_navigationdrawer._showkey /*String*/ );
 //BA.debugLineNum = 31;BA.debugLine="Hide";
_hide();
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 230;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return "";
}
public String  _refresh() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub Refresh";
 //BA.debugLineNum = 46;BA.debugLine="List.Refresh";
_list._refresh /*String*/ ();
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmnavigationdrawer  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 686;BA.debugLine="public Sub RemoveAttr(sName As String) As VMNaviga";
 //BA.debugLineNum = 687;BA.debugLine="NavigationDrawer.RemoveAttr(sName)";
_navigationdrawer._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 688;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 689;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _removevmodel() throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub RemoveVModel As VMNavigationDrawer";
 //BA.debugLineNum = 41;BA.debugLine="RemoveAttr(\"v-model\")";
_removeattr("v-model");
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub Render";
 //BA.debugLineNum = 212;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmnavigationdrawer  _setabsolute(boolean _varabsolute) throws Exception{
String _pp = "";
 //BA.debugLineNum = 259;BA.debugLine="Sub SetAbsolute(varAbsolute As Boolean) As VMNavig";
 //BA.debugLineNum = 260;BA.debugLine="If varAbsolute = False Then Return Me";
if (_varabsolute==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 261;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 262;BA.debugLine="SetAttrSingle(\"absolute\", False)";
_setattrsingle("absolute",BA.ObjectToString(__c.False));
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 265;BA.debugLine="Dim pp As String = $\"${ID}Absolute\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Absolute");
 //BA.debugLineNum = 266;BA.debugLine="vue.SetStateSingle(pp, varAbsolute)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varabsolute));
 //BA.debugLineNum = 267;BA.debugLine="NavigationDrawer.Bind(\":absolute\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":absolute",_pp);
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setapp(boolean _varapp) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub SetApp(varApp As Boolean) As VMNavigationDrawe";
 //BA.debugLineNum = 273;BA.debugLine="If varApp = False Then Return Me";
if (_varapp==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 274;BA.debugLine="NavigationDrawer.SetAttrLoose(\"app\")";
_navigationdrawer._setattrloose /*b4j.example.vmelement*/ ("app");
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetAttr(attr As Map) As VMNavigationDrawer";
 //BA.debugLineNum = 241;BA.debugLine="NavigationDrawer.SetAttr(attr)";
_navigationdrawer._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 87;BA.debugLine="Sub SetAttributes(attrs As List) As VMNavigationDr";
 //BA.debugLineNum = 88;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 89;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetAttrLoose(loose As String) As VMNavigationD";
 //BA.debugLineNum = 83;BA.debugLine="NavigationDrawer.SetAttrLoose(loose)";
_navigationdrawer._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 728;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 729;BA.debugLine="NavigationDrawer.SetAttrSingle(prop, value)";
_navigationdrawer._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 730;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 731;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setbottom(boolean _varbottom) throws Exception{
String _pp = "";
 //BA.debugLineNum = 279;BA.debugLine="Sub SetBottom(varBottom As Boolean) As VMNavigatio";
 //BA.debugLineNum = 280;BA.debugLine="If varBottom = False Then Return Me";
if (_varbottom==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 281;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 282;BA.debugLine="SetAttrSingle(\"bottom\", varBottom)";
_setattrsingle("bottom",BA.ObjectToString(_varbottom));
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 285;BA.debugLine="Dim pp As String = $\"${ID}Bottom\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Bottom");
 //BA.debugLineNum = 286;BA.debugLine="vue.SetStateSingle(pp, varBottom)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbottom));
 //BA.debugLineNum = 287;BA.debugLine="NavigationDrawer.Bind(\":bottom\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":bottom",_pp);
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setclipped(boolean _varclipped) throws Exception{
String _pp = "";
 //BA.debugLineNum = 292;BA.debugLine="Sub SetClipped(varClipped As Boolean) As VMNavigat";
 //BA.debugLineNum = 293;BA.debugLine="If varClipped = False Then Return Me";
if (_varclipped==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 294;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 295;BA.debugLine="SetAttrSingle(\"clipped\", varClipped)";
_setattrsingle("clipped",BA.ObjectToString(_varclipped));
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 298;BA.debugLine="Dim pp As String = $\"${ID}Clipped\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Clipped");
 //BA.debugLineNum = 299;BA.debugLine="vue.SetStateSingle(pp, varClipped)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varclipped));
 //BA.debugLineNum = 300;BA.debugLine="NavigationDrawer.Bind(\":clipped\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":clipped",_pp);
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 305;BA.debugLine="Sub SetColor(varColor As String) As VMNavigationDr";
 //BA.debugLineNum = 306;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 307;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 308;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 311;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 312;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 313;BA.debugLine="NavigationDrawer.Bind(\":color\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 172;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 173;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 174;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 175;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 176;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 179;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 180;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 181;BA.debugLine="NavigationDrawer.Bind(\":color\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 318;BA.debugLine="Sub SetDark(varDark As Boolean) As VMNavigationDra";
 //BA.debugLineNum = 319;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 320;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 321;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 324;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 325;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 326;BA.debugLine="NavigationDrawer.Bind(\":dark\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 36;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public String  _setdatasourcetemplate1(String _datasource,String _key,String _avatar,String _iconname,String _iconcolor,String _title,String _subtitle,String _subtitle1,String _actionicon,String _actioniconcolor) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetDataSourceTemplate1(datasource As String, k";
 //BA.debugLineNum = 55;BA.debugLine="List.SetDataSourceTemplate1(datasource, key, avat";
_list._setdatasourcetemplate1 /*b4j.example.vmlist*/ (_datasource,_key,_avatar,_iconname,_iconcolor,_title,_subtitle,_subtitle1,_actionicon,_actioniconcolor);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmnavigationdrawer  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 702;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMNavigationDra";
 //BA.debugLineNum = 703;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 704;BA.debugLine="NavigationDrawer.SetDesignMode(b)";
_navigationdrawer._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 705;BA.debugLine="List.SetDesignMode(b)";
_list._setdesignmode /*b4j.example.vmlist*/ (_b);
 //BA.debugLineNum = 706;BA.debugLine="BottomSection.SetDesignMode(b)";
_bottomsection._setdesignmode /*b4j.example.vmtemplate*/ (_b);
 //BA.debugLineNum = 707;BA.debugLine="Container.SetDesignMode(b)";
_container._setdesignmode /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 708;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 709;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setdisableresizewatcher(boolean _vardisableresizewatcher) throws Exception{
String _pp = "";
 //BA.debugLineNum = 331;BA.debugLine="Sub SetDisableResizeWatcher(varDisableResizeWatche";
 //BA.debugLineNum = 332;BA.debugLine="If varDisableResizeWatcher = False Then Return Me";
if (_vardisableresizewatcher==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 333;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 334;BA.debugLine="SetAttrSingle(\"disable-resize-watcher\", varDisab";
_setattrsingle("disable-resize-watcher",BA.ObjectToString(_vardisableresizewatcher));
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 337;BA.debugLine="Dim pp As String = $\"${ID}DisableResizeWatcher\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DisableResizeWatcher");
 //BA.debugLineNum = 338;BA.debugLine="vue.SetStateSingle(pp, varDisableResizeWatcher)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisableresizewatcher));
 //BA.debugLineNum = 339;BA.debugLine="NavigationDrawer.Bind(\":disable-resize-watcher\",";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":disable-resize-watcher",_pp);
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setdisableroutewatcher(boolean _vardisableroutewatcher) throws Exception{
String _pp = "";
 //BA.debugLineNum = 344;BA.debugLine="Sub SetDisableRouteWatcher(varDisableRouteWatcher";
 //BA.debugLineNum = 345;BA.debugLine="If varDisableRouteWatcher = False Then Return Me";
if (_vardisableroutewatcher==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 346;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 347;BA.debugLine="SetAttrSingle(\"disable-route-watcher\", varDisabl";
_setattrsingle("disable-route-watcher",BA.ObjectToString(_vardisableroutewatcher));
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 350;BA.debugLine="Dim pp As String = $\"${ID}DisableRouteWatcher\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DisableRouteWatcher");
 //BA.debugLineNum = 351;BA.debugLine="vue.SetStateSingle(pp, varDisableRouteWatcher)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisableroutewatcher));
 //BA.debugLineNum = 352;BA.debugLine="NavigationDrawer.Bind(\":disable-route-watcher\", p";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":disable-route-watcher",_pp);
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setexpandonhover(boolean _varexpandonhover) throws Exception{
String _pp = "";
 //BA.debugLineNum = 357;BA.debugLine="Sub SetExpandOnHover(varExpandOnHover As Boolean)";
 //BA.debugLineNum = 358;BA.debugLine="If varExpandOnHover = False Then Return Me";
if (_varexpandonhover==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 359;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 360;BA.debugLine="SetAttrSingle(\"expand-on-hover\", varExpandOnHove";
_setattrsingle("expand-on-hover",BA.ObjectToString(_varexpandonhover));
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 363;BA.debugLine="Dim pp As String = $\"${ID}ExpandOnHover\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ExpandOnHover");
 //BA.debugLineNum = 364;BA.debugLine="vue.SetStateSingle(pp, varExpandOnHover)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexpandonhover));
 //BA.debugLineNum = 365;BA.debugLine="NavigationDrawer.Bind(\":expand-on-hover\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":expand-on-hover",_pp);
 //BA.debugLineNum = 366;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setfixed(boolean _varfixed) throws Exception{
String _pp = "";
 //BA.debugLineNum = 370;BA.debugLine="Sub SetFixed(varFixed As Boolean) As VMNavigationD";
 //BA.debugLineNum = 371;BA.debugLine="If varFixed = False Then Return Me";
if (_varfixed==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 372;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 373;BA.debugLine="SetAttrSingle(\"fixed\", varFixed)";
_setattrsingle("fixed",BA.ObjectToString(_varfixed));
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 376;BA.debugLine="Dim pp As String = $\"${ID}Fixed\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Fixed");
 //BA.debugLineNum = 377;BA.debugLine="vue.SetStateSingle(pp, varFixed)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfixed));
 //BA.debugLineNum = 378;BA.debugLine="NavigationDrawer.Bind(\":fixed\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":fixed",_pp);
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setfloating(boolean _varfloating) throws Exception{
String _pp = "";
 //BA.debugLineNum = 383;BA.debugLine="Sub SetFloating(varFloating As Boolean) As VMNavig";
 //BA.debugLineNum = 384;BA.debugLine="If varFloating = False Then Return Me";
if (_varfloating==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 385;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 386;BA.debugLine="SetAttrSingle(\"floating\", varFloating)";
_setattrsingle("floating",BA.ObjectToString(_varfloating));
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 389;BA.debugLine="Dim pp As String = $\"${ID}Floating\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Floating");
 //BA.debugLineNum = 390;BA.debugLine="vue.SetStateSingle(pp, varFloating)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfloating));
 //BA.debugLineNum = 391;BA.debugLine="NavigationDrawer.Bind(\":floating\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":floating",_pp);
 //BA.debugLineNum = 392;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 396;BA.debugLine="Sub SetHeight(varHeight As String) As VMNavigation";
 //BA.debugLineNum = 397;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 398;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 399;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 400;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 402;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 403;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 404;BA.debugLine="NavigationDrawer.Bind(\":height\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 405;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _sethideoverlay(boolean _varhideoverlay) throws Exception{
String _pp = "";
 //BA.debugLineNum = 409;BA.debugLine="Sub SetHideOverlay(varHideOverlay As Boolean) As V";
 //BA.debugLineNum = 410;BA.debugLine="If varHideOverlay = False Then Return Me";
if (_varhideoverlay==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 411;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 412;BA.debugLine="SetAttrSingle(\"hide-overlay\", varHideOverlay)";
_setattrsingle("hide-overlay",BA.ObjectToString(_varhideoverlay));
 //BA.debugLineNum = 413;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 415;BA.debugLine="Dim pp As String = $\"${ID}HideOverlay\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideOverlay");
 //BA.debugLineNum = 416;BA.debugLine="vue.SetStateSingle(pp, varHideOverlay)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhideoverlay));
 //BA.debugLineNum = 417;BA.debugLine="NavigationDrawer.Bind(\":hide-overlay\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":hide-overlay",_pp);
 //BA.debugLineNum = 418;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 422;BA.debugLine="Sub SetLight(varLight As Boolean) As VMNavigationD";
 //BA.debugLineNum = 423;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 424;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 425;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 428;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 429;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 430;BA.debugLine="NavigationDrawer.Bind(\":light\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 431;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 697;BA.debugLine="Sub SetMarginAll(p As String) As VMNavigationDrawe";
 //BA.debugLineNum = 698;BA.debugLine="NavigationDrawer.setmarginall(p)";
_navigationdrawer._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 699;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 700;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setmini(boolean _b) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetMini(b As Boolean) As VMNavigationDrawer";
 //BA.debugLineNum = 77;BA.debugLine="SetMiniVariant(b)";
_setminivariant(_b);
 //BA.debugLineNum = 78;BA.debugLine="SetPermanent(b)";
_setpermanent(_b);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setminivariant(boolean _b) throws Exception{
 //BA.debugLineNum = 435;BA.debugLine="Sub SetMiniVariant(b As Boolean) As VMNavigationDr";
 //BA.debugLineNum = 436;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 437;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 438;BA.debugLine="SetAttrSingle(\"mini-variant.sync\", b)";
_setattrsingle("mini-variant.sync",BA.ObjectToString(_b));
 //BA.debugLineNum = 439;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 441;BA.debugLine="vue.SetData(mini, b)";
_vue._setdata /*b4j.example.bananovue*/ (_mini,(Object)(_b));
 //BA.debugLineNum = 442;BA.debugLine="NavigationDrawer.Bind(\":mini-variant.sync\", mini)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":mini-variant.sync",_mini);
 //BA.debugLineNum = 443;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setminivariantwidth(String _varminivariantwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 447;BA.debugLine="Sub SetMiniVariantWidth(varMiniVariantWidth As Str";
 //BA.debugLineNum = 448;BA.debugLine="If varMiniVariantWidth = \"\" Then Return Me";
if ((_varminivariantwidth).equals("")) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 449;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 450;BA.debugLine="SetAttrSingle(\"mini-variant-width\", varMiniVaria";
_setattrsingle("mini-variant-width",_varminivariantwidth);
 //BA.debugLineNum = 451;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 453;BA.debugLine="Dim pp As String = $\"${ID}MiniVariantWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MiniVariantWidth");
 //BA.debugLineNum = 454;BA.debugLine="vue.SetStateSingle(pp, varMiniVariantWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminivariantwidth));
 //BA.debugLineNum = 455;BA.debugLine="NavigationDrawer.Bind(\":mini-variant-width\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":mini-variant-width",_pp);
 //BA.debugLineNum = 456;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setmobilebreakpoint(String _varmobilebreakpoint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 460;BA.debugLine="Sub SetMobileBreakPoint(varMobileBreakPoint As Str";
 //BA.debugLineNum = 461;BA.debugLine="If varMobileBreakPoint = \"\" Then Return Me";
if ((_varmobilebreakpoint).equals("")) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 462;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 463;BA.debugLine="SetAttrSingle(\"mobile-break-point\", varMobileBre";
_setattrsingle("mobile-break-point",_varmobilebreakpoint);
 //BA.debugLineNum = 464;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 466;BA.debugLine="Dim pp As String = $\"${ID}MobileBreakPoint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MobileBreakPoint");
 //BA.debugLineNum = 467;BA.debugLine="vue.SetStateSingle(pp, varMobileBreakPoint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmobilebreakpoint));
 //BA.debugLineNum = 468;BA.debugLine="NavigationDrawer.Bind(\":mobile-break-point\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":mobile-break-point",_pp);
 //BA.debugLineNum = 469;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 470;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 717;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 718;BA.debugLine="NavigationDrawer.SetName(varName, bbind)";
_navigationdrawer._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 719;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 720;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setoninput(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 621;BA.debugLine="Sub SetOnInput(methodName As String) As VMNavigati";
 //BA.debugLineNum = 622;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 623;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 624;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 625;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 626;BA.debugLine="SetAttr(CreateMap(\"@input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_methodname)}));
 //BA.debugLineNum = 628;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 629;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 630;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setontransitionend(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 633;BA.debugLine="Sub SetOnTransitionEnd(methodName As String) As VM";
 //BA.debugLineNum = 634;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 635;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 636;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 637;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 638;BA.debugLine="SetAttr(CreateMap(\"@transitionend\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@transitionend"),(Object)(_methodname)}));
 //BA.debugLineNum = 640;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 641;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 642;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setonupdateminivariant(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 645;BA.debugLine="Sub SetOnUpdateMiniVariant(methodName As String) A";
 //BA.debugLineNum = 646;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 647;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 648;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 649;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 650;BA.debugLine="SetAttr(CreateMap(\"@update:mini-variant\": methodN";
_setattr(__c.createMap(new Object[] {(Object)("@update:mini-variant"),(Object)(_methodname)}));
 //BA.debugLineNum = 652;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 653;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 654;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setopenonmediumlarge(boolean _b) throws Exception{
 //BA.debugLineNum = 498;BA.debugLine="Sub SetOpenOnMediumLarge(b As Boolean) As VMNaviga";
 //BA.debugLineNum = 499;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 500;BA.debugLine="NavigationDrawer.Bind(\":permanent\", \"$vuetify.bre";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":permanent","$vuetify.breakpoint.mdAndUp");
 //BA.debugLineNum = 501;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 502;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setoverlaycolor(String _varoverlaycolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 473;BA.debugLine="Sub SetOverlayColor(varOverlayColor As String) As";
 //BA.debugLineNum = 474;BA.debugLine="If varOverlayColor = \"\" Then Return Me";
if ((_varoverlaycolor).equals("")) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 475;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 476;BA.debugLine="SetAttrSingle(\"overlay-color\", varOverlayColor)";
_setattrsingle("overlay-color",_varoverlaycolor);
 //BA.debugLineNum = 477;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 479;BA.debugLine="Dim pp As String = $\"${ID}OverlayColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OverlayColor");
 //BA.debugLineNum = 480;BA.debugLine="vue.SetStateSingle(pp, varOverlayColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoverlaycolor));
 //BA.debugLineNum = 481;BA.debugLine="NavigationDrawer.Bind(\":overlay-color\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":overlay-color",_pp);
 //BA.debugLineNum = 482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 483;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setoverlayopacity(String _varoverlayopacity) throws Exception{
String _pp = "";
 //BA.debugLineNum = 486;BA.debugLine="Sub SetOverlayOpacity(varOverlayOpacity As String)";
 //BA.debugLineNum = 487;BA.debugLine="If varOverlayOpacity = \"\" Then Return Me";
if ((_varoverlayopacity).equals("")) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 488;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 489;BA.debugLine="SetAttrSingle(\"overlay-opacity\", varOverlayOpaci";
_setattrsingle("overlay-opacity",_varoverlayopacity);
 //BA.debugLineNum = 490;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 492;BA.debugLine="Dim pp As String = $\"${ID}OverlayOpacity\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OverlayOpacity");
 //BA.debugLineNum = 493;BA.debugLine="vue.SetStateSingle(pp, varOverlayOpacity)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoverlayopacity));
 //BA.debugLineNum = 494;BA.debugLine="NavigationDrawer.Bind(\":overlay-opacity\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":overlay-opacity",_pp);
 //BA.debugLineNum = 495;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 496;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 692;BA.debugLine="Sub SetPaddingAll(p As String) As VMNavigationDraw";
 //BA.debugLineNum = 693;BA.debugLine="NavigationDrawer.SetPaddingAll(p)";
_navigationdrawer._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 694;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 695;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setpermanent(boolean _varpermanent) throws Exception{
String _pp = "";
 //BA.debugLineNum = 505;BA.debugLine="Sub SetPermanent(varPermanent As Boolean) As VMNav";
 //BA.debugLineNum = 506;BA.debugLine="If varPermanent = False Then Return Me";
if (_varpermanent==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 507;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 508;BA.debugLine="SetAttrSingle(\"permanent\", varPermanent)";
_setattrsingle("permanent",BA.ObjectToString(_varpermanent));
 //BA.debugLineNum = 509;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 511;BA.debugLine="Dim pp As String = $\"${ID}Permanent\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Permanent");
 //BA.debugLineNum = 512;BA.debugLine="vue.SetStateSingle(pp, varPermanent)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpermanent));
 //BA.debugLineNum = 513;BA.debugLine="NavigationDrawer.Bind(\":permanent\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":permanent",_pp);
 //BA.debugLineNum = 514;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setright(boolean _varright) throws Exception{
String _pp = "";
 //BA.debugLineNum = 518;BA.debugLine="Sub SetRight(varRight As Boolean) As VMNavigationD";
 //BA.debugLineNum = 519;BA.debugLine="If varRight = False Then Return Me";
if (_varright==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 520;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 521;BA.debugLine="SetAttrSingle(\"right\", varRight)";
_setattrsingle("right",BA.ObjectToString(_varright));
 //BA.debugLineNum = 522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 524;BA.debugLine="Dim pp As String = $\"${ID}Right\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Right");
 //BA.debugLineNum = 525;BA.debugLine="vue.SetStateSingle(pp, varRight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varright));
 //BA.debugLineNum = 526;BA.debugLine="NavigationDrawer.Bind(\":right\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":right",_pp);
 //BA.debugLineNum = 527;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 528;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setslotappend(boolean _b) throws Exception{
 //BA.debugLineNum = 609;BA.debugLine="Sub SetSlotAppend(b As Boolean) As VMNavigationDra";
 //BA.debugLineNum = 610;BA.debugLine="SetAttr(CreateMap(\"slot\": \"append\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("append")}));
 //BA.debugLineNum = 611;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 612;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setslotimg(boolean _b) throws Exception{
 //BA.debugLineNum = 615;BA.debugLine="Sub SetSlotImg(b As Boolean) As VMNavigationDrawer";
 //BA.debugLineNum = 616;BA.debugLine="SetAttr(CreateMap(\"slot\": \"img\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("img")}));
 //BA.debugLineNum = 617;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 618;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setsrc(String _varsrc) throws Exception{
String _pp = "";
 //BA.debugLineNum = 531;BA.debugLine="Sub SetSrc(varSrc As String) As VMNavigationDrawer";
 //BA.debugLineNum = 532;BA.debugLine="If varSrc = \"\" Then Return Me";
if ((_varsrc).equals("")) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 533;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 534;BA.debugLine="SetAttrSingle(\"src\", varSrc)";
_setattrsingle("src",_varsrc);
 //BA.debugLineNum = 535;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 537;BA.debugLine="Dim pp As String = $\"${ID}Src\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Src");
 //BA.debugLineNum = 538;BA.debugLine="vue.SetStateSingle(pp, varSrc)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsrc));
 //BA.debugLineNum = 539;BA.debugLine="NavigationDrawer.Bind(\":src\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":src",_pp);
 //BA.debugLineNum = 540;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 541;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setstateless(boolean _varstateless) throws Exception{
String _pp = "";
 //BA.debugLineNum = 544;BA.debugLine="Sub SetStateless(varStateless As Boolean) As VMNav";
 //BA.debugLineNum = 545;BA.debugLine="If varStateless = False Then Return Me";
if (_varstateless==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 546;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 547;BA.debugLine="SetAttrSingle(\"stateless\", varStateless)";
_setattrsingle("stateless",BA.ObjectToString(_varstateless));
 //BA.debugLineNum = 548;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 550;BA.debugLine="Dim pp As String = $\"${ID}Stateless\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Stateless");
 //BA.debugLineNum = 551;BA.debugLine="vue.SetStateSingle(pp, varStateless)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varstateless));
 //BA.debugLineNum = 552;BA.debugLine="NavigationDrawer.Bind(\":stateless\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":stateless",_pp);
 //BA.debugLineNum = 553;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 554;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetStatic(b As Boolean) As VMNavigationDrawer";
 //BA.debugLineNum = 59;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 60;BA.debugLine="NavigationDrawer.SetStatic(b)";
_navigationdrawer._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 61;BA.debugLine="List.setstatic(b)";
_list._setstatic /*b4j.example.vmlist*/ (_b);
 //BA.debugLineNum = 62;BA.debugLine="BottomSection.setstatic(b)";
_bottomsection._setstatic /*b4j.example.vmtemplate*/ (_b);
 //BA.debugLineNum = 63;BA.debugLine="Container.SetStatic(b)";
_container._setstatic /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetStyle(sm As Map) As VMNavigationDrawer";
 //BA.debugLineNum = 247;BA.debugLine="NavigationDrawer.SetStyle(sm)";
_navigationdrawer._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 723;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 724;BA.debugLine="NavigationDrawer.SetStyleSingle(prop, value)";
_navigationdrawer._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 725;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 726;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 711;BA.debugLine="Sub SetTabIndex(ti As String) As VMNavigationDrawe";
 //BA.debugLineNum = 712;BA.debugLine="NavigationDrawer.SetTabIndex(ti)";
_navigationdrawer._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 713;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 714;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _settag(String _vartag) throws Exception{
 //BA.debugLineNum = 557;BA.debugLine="Sub SetTag(varTag As String) As VMNavigationDrawer";
 //BA.debugLineNum = 558;BA.debugLine="If varTag = \"\" Then Return Me";
if ((_vartag).equals("")) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 559;BA.debugLine="SetAttrSingle(\"tag\", varTag)";
_setattrsingle("tag",_vartag);
 //BA.debugLineNum = 560;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 561;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _settemporary(boolean _vartemporary) throws Exception{
String _pp = "";
 //BA.debugLineNum = 564;BA.debugLine="Sub SetTemporary(varTemporary As Boolean) As VMNav";
 //BA.debugLineNum = 565;BA.debugLine="If varTemporary = False Then Return Me";
if (_vartemporary==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 566;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 567;BA.debugLine="SetAttrSingle(\"temporary\", varTemporary)";
_setattrsingle("temporary",BA.ObjectToString(_vartemporary));
 //BA.debugLineNum = 568;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 570;BA.debugLine="Dim pp As String = $\"${ID}Temporary\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Temporary");
 //BA.debugLineNum = 571;BA.debugLine="vue.SetStateSingle(pp, varTemporary)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartemporary));
 //BA.debugLineNum = 572;BA.debugLine="NavigationDrawer.Bind(\":temporary\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":temporary",_pp);
 //BA.debugLineNum = 573;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 574;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetText(t As Object) As VMNavigationDrawer";
 //BA.debugLineNum = 224;BA.debugLine="NavigationDrawer.SetText(t)";
_navigationdrawer._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 739;BA.debugLine="Sub SetTextColor(varColor As String) As VMNavigati";
 //BA.debugLineNum = 740;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 741;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 742;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 743;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 746;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 747;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 748;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 749;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 750;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 751;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 752;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _settouchless(boolean _vartouchless) throws Exception{
String _pp = "";
 //BA.debugLineNum = 577;BA.debugLine="Sub SetTouchless(varTouchless As Boolean) As VMNav";
 //BA.debugLineNum = 578;BA.debugLine="If varTouchless = False Then Return Me";
if (_vartouchless==__c.False) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 579;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 580;BA.debugLine="SetAttrSingle(\"touchless\", varTouchless)";
_setattrsingle("touchless",BA.ObjectToString(_vartouchless));
 //BA.debugLineNum = 581;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 583;BA.debugLine="Dim pp As String = $\"${ID}Touchless\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Touchless");
 //BA.debugLineNum = 584;BA.debugLine="vue.SetStateSingle(pp, varTouchless)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartouchless));
 //BA.debugLineNum = 585;BA.debugLine="NavigationDrawer.Bind(\":touchless\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":touchless",_pp);
 //BA.debugLineNum = 586;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 587;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setvalue(boolean _varvalue) throws Exception{
 //BA.debugLineNum = 590;BA.debugLine="Sub SetValue(varValue As Boolean) As VMNavigationD";
 //BA.debugLineNum = 591;BA.debugLine="NavigationDrawer.SetValue(varValue, False)";
_navigationdrawer._setvalue /*b4j.example.vmelement*/ (BA.ObjectToString(_varvalue),__c.False);
 //BA.debugLineNum = 592;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 593;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetVIf(vif As String) As VMNavigationDrawer";
 //BA.debugLineNum = 201;BA.debugLine="NavigationDrawer.SetVIf(vif)";
_navigationdrawer._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub SetVModel(k As String) As VMNavigationDrawer";
 //BA.debugLineNum = 195;BA.debugLine="smodel = k";
_smodel = _k;
 //BA.debugLineNum = 196;BA.debugLine="NavigationDrawer.SetVModel(k)";
_navigationdrawer._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setvonce(boolean _t) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetVOnce(t As Boolean) As VMNavigationDrawer";
 //BA.debugLineNum = 50;BA.debugLine="NavigationDrawer.setvonce(t)";
_navigationdrawer._setvonce /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetVShow(vif As String) As VMNavigationDrawer";
 //BA.debugLineNum = 206;BA.debugLine="NavigationDrawer.SetVShow(vif)";
_navigationdrawer._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _setwidth(String _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 596;BA.debugLine="Sub SetWidth(varWidth As String) As VMNavigationDr";
 //BA.debugLineNum = 597;BA.debugLine="If varWidth = \"\" Then Return Me";
if ((_varwidth).equals("")) { 
if (true) return (b4j.example.vmnavigationdrawer)(this);};
 //BA.debugLineNum = 598;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 599;BA.debugLine="SetAttrSingle(\"width\", varWidth)";
_setattrsingle("width",_varwidth);
 //BA.debugLineNum = 600;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 };
 //BA.debugLineNum = 602;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 603;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varwidth));
 //BA.debugLineNum = 604;BA.debugLine="NavigationDrawer.Bind(\":width\", pp)";
_navigationdrawer._bind /*b4j.example.vmelement*/ (":width",_pp);
 //BA.debugLineNum = 605;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 606;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _show() throws Exception{
 //BA.debugLineNum = 662;BA.debugLine="Sub Show As VMNavigationDrawer";
 //BA.debugLineNum = 663;BA.debugLine="vue.SetStateSingle(smodel, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_smodel,(Object)(__c.True));
 //BA.debugLineNum = 664;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 665;BA.debugLine="End Sub";
return null;
}
public String  _toggle() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub Toggle";
 //BA.debugLineNum = 68;BA.debugLine="vue.ToggleState(smodel)";
_vue._togglestate /*b4j.example.bananovue*/ (_smodel);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 187;BA.debugLine="vue.SetStateSingle(\"item\", 1)";
_vue._setstatesingle /*b4j.example.bananovue*/ ("item",(Object)(1));
 //BA.debugLineNum = 188;BA.debugLine="If Container.HasContent Then SetText(Container.To";
if (_container._hascontent /*boolean*/ ) { 
_settext((Object)(_container._tostring /*String*/ ()));};
 //BA.debugLineNum = 189;BA.debugLine="If List.HasContent Then List.Pop(NavigationDrawer";
if (_list._hascontent /*boolean*/ ) { 
_list._pop /*String*/ (_navigationdrawer);};
 //BA.debugLineNum = 190;BA.debugLine="If BottomSection.HasContent Then BottomSection.Po";
if (_bottomsection._hascontent /*boolean*/ ) { 
_bottomsection._pop /*String*/ (_navigationdrawer);};
 //BA.debugLineNum = 191;BA.debugLine="Return NavigationDrawer.ToString";
if (true) return _navigationdrawer._tostring /*String*/ ();
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmnavigationdrawer  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 161;BA.debugLine="Sub UseTheme(themeName As String) As VMNavigationD";
 //BA.debugLineNum = 162;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 163;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 164;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 165;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 166;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnavigationdrawer)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
