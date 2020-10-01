package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmmenu", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmmenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _menu = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public b4j.example.vmtemplate _act = null;
public b4j.example.vmlist _menucontent = null;
public boolean _bstatic = false;
public boolean _hasactivator = false;
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
public b4j.example.vmmenu  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 269;BA.debugLine="Sub AddChild(child As VMElement) As VMMenu";
 //BA.debugLineNum = 270;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 271;BA.debugLine="Menu.SetText(childHTML)";
_menu._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 305;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 306;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 307;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenu  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub AddClass(c As String) As VMMenu";
 //BA.debugLineNum = 288;BA.debugLine="Menu.AddClass(c)";
_menu._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _addcomponent(String _scomp) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub AddComponent(scomp As String) As VMMenu";
 //BA.debugLineNum = 91;BA.debugLine="SetText(scomp)";
_settext((Object)(_scomp));
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _adddivider1(boolean _binset) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub AddDivider1(bInset As Boolean) As VMMenu";
 //BA.debugLineNum = 212;BA.debugLine="MenuContent.AddDivider1(bInset)";
_menucontent._adddivider1 /*b4j.example.vmlist*/ (_binset);
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public String  _additem(String _key,String _avatar,String _iconname,String _title,String _subtitle,String _actionicon) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub AddItem(key As String, avatar As String, iconN";
 //BA.debugLineNum = 204;BA.debugLine="MenuContent.AddItem(key, avatar, iconName, title,";
_menucontent._additem /*b4j.example.vmlist*/ (_key,_avatar,_iconname,_title,_subtitle,_actionicon);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public String  _additem1(String _key,String _avatar,String _iconname,String _iconcolor,String _title,String _subtitle,String _subtitle1,String _actionicon,String _actioniconcolor) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub AddItem1(key As String, avatar As String, icon";
 //BA.debugLineNum = 208;BA.debugLine="MenuContent.AddItem1(key, avatar, iconName, iconC";
_menucontent._additem1 /*b4j.example.vmlist*/ (_key,_avatar,_iconname,_iconcolor,_title,_subtitle,_subtitle1,_actionicon,_actioniconcolor);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenu  _additemdivider() throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub AddItemDivider() As VMMenu";
 //BA.debugLineNum = 217;BA.debugLine="MenuContent.AddItemDivider";
_menucontent._additemdivider /*b4j.example.vmlist*/ ();
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _additemheader(String _hdr) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub AddItemHeader(hdr As String) As VMMenu";
 //BA.debugLineNum = 222;BA.debugLine="MenuContent.AddItemHeader(hdr)";
_menucontent._additemheader /*b4j.example.vmlist*/ (_hdr);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _additemv(String _key,String _avatar,String _iconname,String _title,String _subtitle,String _actionicon,boolean _visibility) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub AddItemV(key As String, avatar As String, icon";
 //BA.debugLineNum = 232;BA.debugLine="MenuContent.AddItemV(key, avatar, iconName, title";
_menucontent._additemv /*b4j.example.vmlist*/ (_key,_avatar,_iconname,_title,_subtitle,_actionicon,_visibility);
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public String  _addkeyvalue(String _key,String _value) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub AddKeyValue(key As String, value As String)";
 //BA.debugLineNum = 199;BA.debugLine="AddItem(key, \"\", \"\", value, \"\", \"\")";
_additem(_key,"","",_value,"","");
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenu  _addsubheader1(String _hdr,boolean _binset) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub AddSubHeader1(hdr As String, bInset As Boolean";
 //BA.debugLineNum = 237;BA.debugLine="MenuContent.AddSubHeader1(hdr, bInset)";
_menucontent._addsubheader1 /*b4j.example.vmlist*/ (_hdr,_binset);
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 902;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 903;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 904;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenu  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 856;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 857;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 858;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 859;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 860;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 906;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 907;BA.debugLine="Menu.BuildModel(mprops, mstyles, lclasses, loose)";
_menu._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 908;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 909;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Menu As VMElement";
_menu = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private act As VMTemplate";
_act = new b4j.example.vmtemplate();
 //BA.debugLineNum = 10;BA.debugLine="Private MenuContent As VMList";
_menucontent = new b4j.example.vmlist();
 //BA.debugLineNum = 11;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 12;BA.debugLine="Private hasActivator As Boolean";
_hasactivator = false;
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenu  _disable() throws Exception{
 //BA.debugLineNum = 849;BA.debugLine="Sub Disable As VMMenu";
 //BA.debugLineNum = 850;BA.debugLine="Menu.Disable(True)";
_menu._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 851;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 852;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _enable() throws Exception{
 //BA.debugLineNum = 844;BA.debugLine="Sub Enable As VMMenu";
 //BA.debugLineNum = 845;BA.debugLine="Menu.Enable(True)";
_menu._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 846;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 847;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _hide() throws Exception{
 //BA.debugLineNum = 834;BA.debugLine="Sub Hide As VMMenu";
 //BA.debugLineNum = 835;BA.debugLine="Menu.SetVisible(False)";
_menu._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 836;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 837;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 17;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 20;BA.debugLine="Menu.Initialize(v, ID).SetTag(\"v-menu\")";
_menu._initialize /*b4j.example.vmelement*/ (ba,_v,_id)._settag /*b4j.example.vmelement*/ ("v-menu");
 //BA.debugLineNum = 21;BA.debugLine="MenuContent.Initialize(vue, $\"${ID}items\"$, Modul";
_menucontent._initialize /*b4j.example.vmlist*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"items"),_module);
 //BA.debugLineNum = 23;BA.debugLine="act.Initialize(vue, \"\", Module)";
_act._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 24;BA.debugLine="act.SetSlotActivatorOn";
_act._setslotactivatoron /*b4j.example.vmtemplate*/ ();
 //BA.debugLineNum = 26;BA.debugLine="SetOpenOnHover(True)";
_setopenonhover(__c.True);
 //BA.debugLineNum = 27;BA.debugLine="SetOffsetY(True)";
_setoffsety(__c.True);
 //BA.debugLineNum = 28;BA.debugLine="hasActivator = False";
_hasactivator = __c.False;
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 283;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenu  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 863;BA.debugLine="public Sub RemoveAttr(sName As String) As VMMenu";
 //BA.debugLineNum = 864;BA.debugLine="Menu.RemoveAttr(sName)";
_menu._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 865;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 866;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub Render";
 //BA.debugLineNum = 265;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenu  _setabsolute(boolean _varabsolute) throws Exception{
String _pp = "";
 //BA.debugLineNum = 312;BA.debugLine="Sub SetAbsolute(varAbsolute As Boolean) As VMMenu";
 //BA.debugLineNum = 313;BA.debugLine="If varAbsolute = False Then Return Me";
if (_varabsolute==__c.False) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 314;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 315;BA.debugLine="SetAttrSingle(\"absolute\", varAbsolute)";
_setattrsingle("absolute",BA.ObjectToString(_varabsolute));
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 318;BA.debugLine="Dim pp As String = $\"${ID}Absolute\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Absolute");
 //BA.debugLineNum = 319;BA.debugLine="vue.SetStateSingle(pp, varAbsolute)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varabsolute));
 //BA.debugLineNum = 320;BA.debugLine="Menu.Bind(\":absolute\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":absolute",_pp);
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setactivator(String _varactivator) throws Exception{
String _pp = "";
 //BA.debugLineNum = 325;BA.debugLine="Sub SetActivator(varActivator As String) As VMMenu";
 //BA.debugLineNum = 326;BA.debugLine="If varActivator = \"\" Then Return Me";
if ((_varactivator).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 327;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 328;BA.debugLine="SetAttrSingle(\"activator\", varActivator)";
_setattrsingle("activator",_varactivator);
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 331;BA.debugLine="Dim pp As String = $\"${ID}Activator\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Activator");
 //BA.debugLineNum = 332;BA.debugLine="vue.SetStateSingle(pp, varActivator)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactivator));
 //BA.debugLineNum = 333;BA.debugLine="Menu.Bind(\":activator\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":activator",_pp);
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setallowoverflow(boolean _varallowoverflow) throws Exception{
String _pp = "";
 //BA.debugLineNum = 338;BA.debugLine="Sub SetAllowOverflow(varAllowOverflow As Boolean)";
 //BA.debugLineNum = 339;BA.debugLine="If varAllowOverflow = False Then Return Me";
if (_varallowoverflow==__c.False) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 340;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 341;BA.debugLine="SetAttrSingle(\"allow-overflow\", varAllowOverflow";
_setattrsingle("allow-overflow",BA.ObjectToString(_varallowoverflow));
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 344;BA.debugLine="Dim pp As String = $\"${ID}AllowOverflow\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AllowOverflow");
 //BA.debugLineNum = 345;BA.debugLine="vue.SetStateSingle(pp, varAllowOverflow)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varallowoverflow));
 //BA.debugLineNum = 346;BA.debugLine="Menu.Bind(\":allow-overflow\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":allow-overflow",_pp);
 //BA.debugLineNum = 347;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setattach(Object _varattach) throws Exception{
String _pp = "";
 //BA.debugLineNum = 351;BA.debugLine="Sub SetAttach(varAttach As Object) As VMMenu";
 //BA.debugLineNum = 352;BA.debugLine="Dim pp As String = $\"${ID}Attach\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Attach");
 //BA.debugLineNum = 353;BA.debugLine="vue.SetStateSingle(pp, varAttach)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varattach);
 //BA.debugLineNum = 354;BA.debugLine="Menu.Bind(\":attach\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":attach",_pp);
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Sub SetAttr(attr As Map) As VMMenu";
 //BA.debugLineNum = 294;BA.debugLine="Menu.SetAttr(attr)";
_menu._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 100;BA.debugLine="Sub SetAttributes(attrs As List) As VMMenu";
 //BA.debugLineNum = 101;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 102;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetAttrLoose(loose As String) As VMMenu";
 //BA.debugLineNum = 109;BA.debugLine="Menu.SetAttrLoose(loose)";
_menu._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 896;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 897;BA.debugLine="Menu.SetAttrSingle(prop, value)";
_menu._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 898;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 899;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setauto(boolean _varauto) throws Exception{
String _pp = "";
 //BA.debugLineNum = 359;BA.debugLine="Sub SetAuto(varAuto As Boolean) As VMMenu";
 //BA.debugLineNum = 360;BA.debugLine="If varAuto = False Then Return Me";
if (_varauto==__c.False) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 361;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 362;BA.debugLine="SetAttrSingle(\"auto\", varAuto)";
_setattrsingle("auto",BA.ObjectToString(_varauto));
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 365;BA.debugLine="Dim pp As String = $\"${ID}Auto\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Auto");
 //BA.debugLineNum = 366;BA.debugLine="vue.SetStateSingle(pp, varAuto)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varauto));
 //BA.debugLineNum = 367;BA.debugLine="Menu.Bind(\":auto\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":auto",_pp);
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setavatar(String _url) throws Exception{
b4j.example.vmavatar _c6a = null;
 //BA.debugLineNum = 179;BA.debugLine="Sub SetAvatar(url As String) As VMMenu";
 //BA.debugLineNum = 180;BA.debugLine="Dim c6a As VMAvatar";
_c6a = new b4j.example.vmavatar();
 //BA.debugLineNum = 181;BA.debugLine="c6a.Initialize(vue, $\"${ID}avatar\"$, Module)";
_c6a._initialize /*b4j.example.vmavatar*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"avatar"),_module);
 //BA.debugLineNum = 182;BA.debugLine="c6a.SetStatic(bStatic)";
_c6a._setstatic /*b4j.example.vmavatar*/ (_bstatic);
 //BA.debugLineNum = 183;BA.debugLine="c6a.SetDesignMode(DesignMode)";
_c6a._setdesignmode /*b4j.example.vmavatar*/ (_designmode);
 //BA.debugLineNum = 184;BA.debugLine="c6a.SetImage(url, \"\", Null, Null, Null)";
_c6a._setimage /*b4j.example.vmavatar*/ (_url,"",(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__c.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 185;BA.debugLine="c6a.SetMenuTrigger(True)";
_c6a._setmenutrigger /*b4j.example.vmavatar*/ (__c.True);
 //BA.debugLineNum = 186;BA.debugLine="c6a.Pop(act.Template)";
_c6a._pop /*String*/ (_act._template /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 187;BA.debugLine="hasActivator = True";
_hasactivator = __c.True;
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setbottom(boolean _varbottom) throws Exception{
String _pp = "";
 //BA.debugLineNum = 372;BA.debugLine="Sub SetBottom(varBottom As Boolean) As VMMenu";
 //BA.debugLineNum = 373;BA.debugLine="If varBottom = False Then Return Me";
if (_varbottom==__c.False) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 374;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 375;BA.debugLine="SetAttrSingle(\"bottom\", varBottom)";
_setattrsingle("bottom",BA.ObjectToString(_varbottom));
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 378;BA.debugLine="Dim pp As String = $\"${ID}Bottom\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Bottom");
 //BA.debugLineNum = 379;BA.debugLine="vue.SetStateSingle(pp, varBottom)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbottom));
 //BA.debugLineNum = 380;BA.debugLine="Menu.Bind(\":bottom\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":bottom",_pp);
 //BA.debugLineNum = 381;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setbutton(String _iconname,String _btntext) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 143;BA.debugLine="Sub SetButton(iconName As String, btnText As Strin";
 //BA.debugLineNum = 144;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 145;BA.debugLine="btn.Initialize(vue, $\"${ID}button\"$, Module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"button"),_module);
 //BA.debugLineNum = 146;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 147;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 148;BA.debugLine="btn.AddIcon(iconName,\"left\",\"\")";
_btn._addicon /*b4j.example.vmbutton*/ (_iconname,"left","");
 //BA.debugLineNum = 149;BA.debugLine="btn.SetLabel(btnText)";
_btn._setlabel /*b4j.example.vmbutton*/ (_btntext);
 //BA.debugLineNum = 150;BA.debugLine="btn.SetMenuTrigger(True)";
_btn._setmenutrigger /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 151;BA.debugLine="btn.SetTransparent(True)";
_btn._settransparent /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 152;BA.debugLine="btn.Pop(act.Template)";
_btn._pop /*String*/ (_act._template /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 153;BA.debugLine="hasActivator = True";
_hasactivator = __c.True;
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setbutton1(String _iconname,String _iconpos,String _btntext,boolean _btnoutlined) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 157;BA.debugLine="Sub SetButton1(iconName As String, iconPos As Stri";
 //BA.debugLineNum = 158;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 159;BA.debugLine="btn.Initialize(vue, $\"${ID}button\"$, Module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"button"),_module);
 //BA.debugLineNum = 160;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 161;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 162;BA.debugLine="btn.AddIcon(iconName,iconPos,\"\")";
_btn._addicon /*b4j.example.vmbutton*/ (_iconname,_iconpos,"");
 //BA.debugLineNum = 163;BA.debugLine="btn.SetLabel(btnText)";
_btn._setlabel /*b4j.example.vmbutton*/ (_btntext);
 //BA.debugLineNum = 164;BA.debugLine="btn.SetMenuTrigger(True)";
_btn._setmenutrigger /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 165;BA.debugLine="btn.SetTransparent(True)";
_btn._settransparent /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 166;BA.debugLine="btn.SetOutlined(btnOutlined)";
_btn._setoutlined /*b4j.example.vmbutton*/ (_btnoutlined);
 //BA.debugLineNum = 167;BA.debugLine="btn.Pop(act.Template)";
_btn._pop /*String*/ (_act._template /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 168;BA.debugLine="hasActivator = True";
_hasactivator = __c.True;
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setclosedelay(String _varclosedelay) throws Exception{
String _pp = "";
 //BA.debugLineNum = 385;BA.debugLine="Sub SetCloseDelay(varCloseDelay As String) As VMMe";
 //BA.debugLineNum = 386;BA.debugLine="If varCloseDelay = \"\" Then Return Me";
if ((_varclosedelay).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 387;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 388;BA.debugLine="SetAttrSingle(\"close-delay\", varCloseDelay)";
_setattrsingle("close-delay",_varclosedelay);
 //BA.debugLineNum = 389;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 391;BA.debugLine="Dim pp As String = $\"${ID}CloseDelay\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CloseDelay");
 //BA.debugLineNum = 392;BA.debugLine="vue.SetStateSingle(pp, varCloseDelay)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varclosedelay));
 //BA.debugLineNum = 393;BA.debugLine="Menu.Bind(\":close-delay\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":close-delay",_pp);
 //BA.debugLineNum = 394;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setcloseonclick(boolean _varcloseonclick) throws Exception{
String _pp = "";
 //BA.debugLineNum = 398;BA.debugLine="Sub SetCloseOnClick(varCloseOnClick As Boolean) As";
 //BA.debugLineNum = 399;BA.debugLine="If varCloseOnClick Then Return Me";
if (_varcloseonclick) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 400;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 401;BA.debugLine="SetAttrSingle(\"close-on-click\", varCloseOnClick)";
_setattrsingle("close-on-click",BA.ObjectToString(_varcloseonclick));
 //BA.debugLineNum = 402;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 404;BA.debugLine="Dim pp As String = $\"${ID}CloseOnClick\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CloseOnClick");
 //BA.debugLineNum = 405;BA.debugLine="vue.SetStateSingle(pp, varCloseOnClick)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcloseonclick));
 //BA.debugLineNum = 406;BA.debugLine="Menu.Bind(\":close-on-click\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":close-on-click",_pp);
 //BA.debugLineNum = 407;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setcloseoncontentclick(boolean _varcloseoncontentclick) throws Exception{
String _pp = "";
 //BA.debugLineNum = 411;BA.debugLine="Sub SetCloseOnContentClick(varCloseOnContentClick";
 //BA.debugLineNum = 412;BA.debugLine="If varCloseOnContentClick Then Return Me";
if (_varcloseoncontentclick) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 413;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 414;BA.debugLine="SetAttrSingle(\"close-on-content-click\", varClose";
_setattrsingle("close-on-content-click",BA.ObjectToString(_varcloseoncontentclick));
 //BA.debugLineNum = 415;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 417;BA.debugLine="Dim pp As String = $\"${ID}CloseOnContentClick\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CloseOnContentClick");
 //BA.debugLineNum = 418;BA.debugLine="vue.SetStateSingle(pp, varCloseOnContentClick)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcloseoncontentclick));
 //BA.debugLineNum = 419;BA.debugLine="Menu.Bind(\":close-on-content-click\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":close-on-content-click",_pp);
 //BA.debugLineNum = 420;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 421;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setcontentclass(String _varcontentclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 424;BA.debugLine="Sub SetContentClass(varContentClass As String) As";
 //BA.debugLineNum = 425;BA.debugLine="If varContentClass = \"\" Then Return Me";
if ((_varcontentclass).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 426;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 427;BA.debugLine="SetAttrSingle(\"content-class\", varContentClass)";
_setattrsingle("content-class",_varcontentclass);
 //BA.debugLineNum = 428;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 430;BA.debugLine="Dim pp As String = $\"${ID}ContentClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ContentClass");
 //BA.debugLineNum = 431;BA.debugLine="vue.SetStateSingle(pp, varContentClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcontentclass));
 //BA.debugLineNum = 432;BA.debugLine="Menu.Bind(\":content-class\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":content-class",_pp);
 //BA.debugLineNum = 433;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 437;BA.debugLine="Sub SetDark(varDark As Boolean) As VMMenu";
 //BA.debugLineNum = 438;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 439;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 440;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 441;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 443;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 444;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 445;BA.debugLine="Menu.Bind(\":dark\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 446;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 33;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMMenu";
 //BA.debugLineNum = 58;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 59;BA.debugLine="Menu.SetDesignMode(b)";
_menu._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 60;BA.debugLine="act.SetDesignMode(b)";
_act._setdesignmode /*b4j.example.vmtemplate*/ (_b);
 //BA.debugLineNum = 61;BA.debugLine="MenuContent.SetDesignMode(b)";
_menucontent._setdesignmode /*b4j.example.vmlist*/ (_b);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 73;BA.debugLine="Menu.SetDeviceOffsets(OS, OM, OL, OX)";
_menu._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 85;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 86;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 79;BA.debugLine="Menu.SetDeviceSizes(SS, SM, SL, SX)";
_menu._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 463;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMMenu";
 //BA.debugLineNum = 464;BA.debugLine="Menu.SetDisabled(varDisabled)";
_menu._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 465;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 466;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdisablekeys(boolean _vardisablekeys) throws Exception{
String _pp = "";
 //BA.debugLineNum = 450;BA.debugLine="Sub SetDisableKeys(varDisableKeys As Boolean) As V";
 //BA.debugLineNum = 451;BA.debugLine="If varDisableKeys = False Then Return Me";
if (_vardisablekeys==__c.False) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 452;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 453;BA.debugLine="SetAttrSingle(\"disable-keys\", varDisableKeys)";
_setattrsingle("disable-keys",BA.ObjectToString(_vardisablekeys));
 //BA.debugLineNum = 454;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 456;BA.debugLine="Dim pp As String = $\"${ID}DisableKeys\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DisableKeys");
 //BA.debugLineNum = 457;BA.debugLine="vue.SetStateSingle(pp, varDisableKeys)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisablekeys));
 //BA.debugLineNum = 458;BA.debugLine="Menu.Bind(\":disable-keys\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":disable-keys",_pp);
 //BA.debugLineNum = 459;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 460;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _seteager(boolean _vareager) throws Exception{
String _pp = "";
 //BA.debugLineNum = 469;BA.debugLine="Sub SetEager(varEager As Boolean) As VMMenu";
 //BA.debugLineNum = 470;BA.debugLine="If varEager = False Then Return Me";
if (_vareager==__c.False) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 471;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 472;BA.debugLine="SetAttrSingle(\"eager\", varEager)";
_setattrsingle("eager",BA.ObjectToString(_vareager));
 //BA.debugLineNum = 473;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 475;BA.debugLine="Dim pp As String = $\"${ID}Eager\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Eager");
 //BA.debugLineNum = 476;BA.debugLine="vue.SetStateSingle(pp, varEager)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareager));
 //BA.debugLineNum = 477;BA.debugLine="Menu.Bind(\":eager\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":eager",_pp);
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setfixed(boolean _varfixed) throws Exception{
String _pp = "";
 //BA.debugLineNum = 482;BA.debugLine="Sub SetFixed(varFixed As Boolean) As VMMenu";
 //BA.debugLineNum = 483;BA.debugLine="If varFixed = False Then Return Me";
if (_varfixed==__c.False) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 484;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 485;BA.debugLine="SetAttrSingle(\"fixed\", varFixed)";
_setattrsingle("fixed",BA.ObjectToString(_varfixed));
 //BA.debugLineNum = 486;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 488;BA.debugLine="Dim pp As String = $\"${ID}Fixed\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Fixed");
 //BA.debugLineNum = 489;BA.debugLine="vue.SetStateSingle(pp, varFixed)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfixed));
 //BA.debugLineNum = 490;BA.debugLine="Menu.Bind(\":fixed\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":fixed",_pp);
 //BA.debugLineNum = 491;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 492;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _seticon(String _iconname) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 114;BA.debugLine="Sub SetIcon(iconName As String) As VMMenu";
 //BA.debugLineNum = 115;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 116;BA.debugLine="btn.Initialize(vue, $\"${ID}button\"$, Module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"button"),_module);
 //BA.debugLineNum = 117;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 118;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 119;BA.debugLine="btn.SetIconButton(iconName)";
_btn._seticonbutton /*b4j.example.vmbutton*/ (_iconname);
 //BA.debugLineNum = 120;BA.debugLine="btn.SetMenuTrigger(True)";
_btn._setmenutrigger /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 121;BA.debugLine="btn.Pop(act.Template)";
_btn._pop /*String*/ (_act._template /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 122;BA.debugLine="hasActivator = True";
_hasactivator = __c.True;
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _seticoncolor(String _iconname,String _iconcolor) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 127;BA.debugLine="Sub SetIconColor(iconName As String, iconColor As";
 //BA.debugLineNum = 128;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 129;BA.debugLine="btn.Initialize(vue, $\"${ID}button\"$, Module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"button"),_module);
 //BA.debugLineNum = 130;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 131;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 132;BA.debugLine="btn.SetIconButton(iconName)";
_btn._seticonbutton /*b4j.example.vmbutton*/ (_iconname);
 //BA.debugLineNum = 133;BA.debugLine="btn.SetMenuTrigger(True)";
_btn._setmenutrigger /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 134;BA.debugLine="btn.SetColor(iconColor)";
_btn._setcolor /*b4j.example.vmbutton*/ (_iconcolor);
 //BA.debugLineNum = 135;BA.debugLine="btn.SetDark(True)";
_btn._setdark /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 136;BA.debugLine="btn.Pop(act.Template)";
_btn._pop /*String*/ (_act._template /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 137;BA.debugLine="hasActivator = True";
_hasactivator = __c.True;
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setinternalactivator(boolean _varinternalactivator) throws Exception{
String _pp = "";
 //BA.debugLineNum = 495;BA.debugLine="Sub SetInternalActivator(varInternalActivator As B";
 //BA.debugLineNum = 496;BA.debugLine="If varInternalActivator = False Then Return Me";
if (_varinternalactivator==__c.False) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 497;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 498;BA.debugLine="SetAttrSingle(\"internal-activator\", varInternalA";
_setattrsingle("internal-activator",BA.ObjectToString(_varinternalactivator));
 //BA.debugLineNum = 499;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 501;BA.debugLine="Dim pp As String = $\"${ID}InternalActivator\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"InternalActivator");
 //BA.debugLineNum = 502;BA.debugLine="vue.SetStateSingle(pp, varInternalActivator)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varinternalactivator));
 //BA.debugLineNum = 503;BA.debugLine="Menu.Bind(\":internal-activator\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":internal-activator",_pp);
 //BA.debugLineNum = 504;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
return null;
}
public String  _setitemvisibility(anywheresoftware.b4a.objects.collections.Map _itms) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub SetItemVisibility(itms As Map)";
 //BA.debugLineNum = 227;BA.debugLine="MenuContent.SetItemVisibility(itms)";
_menucontent._setitemvisibility /*String*/ (_itms);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenu  _setleft(boolean _varleft) throws Exception{
String _pp = "";
 //BA.debugLineNum = 508;BA.debugLine="Sub SetLeft(varLeft As Boolean) As VMMenu";
 //BA.debugLineNum = 509;BA.debugLine="If varLeft = False Then Return Me";
if (_varleft==__c.False) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 510;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 511;BA.debugLine="SetAttrSingle(\"left\", varLeft)";
_setattrsingle("left",BA.ObjectToString(_varleft));
 //BA.debugLineNum = 512;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 514;BA.debugLine="Dim pp As String = $\"${ID}Left\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Left");
 //BA.debugLineNum = 515;BA.debugLine="vue.SetStateSingle(pp, varLeft)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varleft));
 //BA.debugLineNum = 516;BA.debugLine="Menu.Bind(\":left\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":left",_pp);
 //BA.debugLineNum = 517;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 518;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 521;BA.debugLine="Sub SetLight(varLight As Boolean) As VMMenu";
 //BA.debugLineNum = 522;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 523;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 524;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 525;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 527;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 528;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 529;BA.debugLine="Menu.Bind(\":light\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 530;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 531;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 874;BA.debugLine="Sub SetMarginAll(p As String) As VMMenu";
 //BA.debugLineNum = 875;BA.debugLine="Menu.setmarginall(p)";
_menu._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 876;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 877;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setmaxheight(String _varmaxheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 534;BA.debugLine="Sub SetMaxHeight(varMaxHeight As String) As VMMenu";
 //BA.debugLineNum = 535;BA.debugLine="If varMaxHeight = \"\" Then Return Me";
if ((_varmaxheight).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 536;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 537;BA.debugLine="SetAttrSingle(\"max-height\", varMaxHeight)";
_setattrsingle("max-height",_varmaxheight);
 //BA.debugLineNum = 538;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 540;BA.debugLine="Dim pp As String = $\"${ID}MaxHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxHeight");
 //BA.debugLineNum = 541;BA.debugLine="vue.SetStateSingle(pp, varMaxHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxheight));
 //BA.debugLineNum = 542;BA.debugLine="Menu.Bind(\":max-height\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":max-height",_pp);
 //BA.debugLineNum = 543;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 544;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setmaxwidth(String _varmaxwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 547;BA.debugLine="Sub SetMaxWidth(varMaxWidth As String) As VMMenu";
 //BA.debugLineNum = 548;BA.debugLine="If varMaxWidth = \"\" Then Return Me";
if ((_varmaxwidth).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 549;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 550;BA.debugLine="SetAttrSingle(\"max-width\", varMaxWidth)";
_setattrsingle("max-width",_varmaxwidth);
 //BA.debugLineNum = 551;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 553;BA.debugLine="Dim pp As String = $\"${ID}MaxWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxWidth");
 //BA.debugLineNum = 554;BA.debugLine="vue.SetStateSingle(pp, varMaxWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxwidth));
 //BA.debugLineNum = 555;BA.debugLine="Menu.Bind(\":max-width\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":max-width",_pp);
 //BA.debugLineNum = 556;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 557;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setminwidth(String _varminwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 560;BA.debugLine="Sub SetMinWidth(varMinWidth As String) As VMMenu";
 //BA.debugLineNum = 561;BA.debugLine="If varMinWidth = \"\" Then Return Me";
if ((_varminwidth).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 562;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 563;BA.debugLine="SetAttrSingle(\"min-width\", varMinWidth)";
_setattrsingle("min-width",_varminwidth);
 //BA.debugLineNum = 564;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 566;BA.debugLine="Dim pp As String = $\"${ID}MinWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinWidth");
 //BA.debugLineNum = 567;BA.debugLine="vue.SetStateSingle(pp, varMinWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminwidth));
 //BA.debugLineNum = 568;BA.debugLine="Menu.Bind(\":min-width\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":min-width",_pp);
 //BA.debugLineNum = 569;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 570;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 885;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 886;BA.debugLine="Menu.SetName(varName, bbind)";
_menu._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 887;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 888;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setnudgebottom(String _varnudgebottom) throws Exception{
String _pp = "";
 //BA.debugLineNum = 573;BA.debugLine="Sub SetNudgeBottom(varNudgeBottom As String) As VM";
 //BA.debugLineNum = 574;BA.debugLine="If varNudgeBottom = \"\" Then Return Me";
if ((_varnudgebottom).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 575;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 576;BA.debugLine="SetAttrSingle(\"nudge-bottom\", varNudgeBottom)";
_setattrsingle("nudge-bottom",_varnudgebottom);
 //BA.debugLineNum = 577;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 579;BA.debugLine="Dim pp As String = $\"${ID}NudgeBottom\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NudgeBottom");
 //BA.debugLineNum = 580;BA.debugLine="vue.SetStateSingle(pp, varNudgeBottom)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnudgebottom));
 //BA.debugLineNum = 581;BA.debugLine="Menu.Bind(\":nudge-bottom\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":nudge-bottom",_pp);
 //BA.debugLineNum = 582;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 583;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setnudgeleft(String _varnudgeleft) throws Exception{
String _pp = "";
 //BA.debugLineNum = 586;BA.debugLine="Sub SetNudgeLeft(varNudgeLeft As String) As VMMenu";
 //BA.debugLineNum = 587;BA.debugLine="If varNudgeLeft = \"\" Then Return Me";
if ((_varnudgeleft).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 588;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 589;BA.debugLine="SetAttrSingle(\"nudge-left\", varNudgeLeft)";
_setattrsingle("nudge-left",_varnudgeleft);
 //BA.debugLineNum = 590;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 592;BA.debugLine="Dim pp As String = $\"${ID}NudgeLeft\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NudgeLeft");
 //BA.debugLineNum = 593;BA.debugLine="vue.SetStateSingle(pp, varNudgeLeft)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnudgeleft));
 //BA.debugLineNum = 594;BA.debugLine="Menu.Bind(\":nudge-left\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":nudge-left",_pp);
 //BA.debugLineNum = 595;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 596;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setnudgeright(String _varnudgeright) throws Exception{
String _pp = "";
 //BA.debugLineNum = 599;BA.debugLine="Sub SetNudgeRight(varNudgeRight As String) As VMMe";
 //BA.debugLineNum = 600;BA.debugLine="If varNudgeRight = \"\" Then Return Me";
if ((_varnudgeright).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 601;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 602;BA.debugLine="SetAttrSingle(\"nudge-right\", varNudgeRight)";
_setattrsingle("nudge-right",_varnudgeright);
 //BA.debugLineNum = 603;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 605;BA.debugLine="Dim pp As String = $\"${ID}NudgeRight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NudgeRight");
 //BA.debugLineNum = 606;BA.debugLine="vue.SetStateSingle(pp, varNudgeRight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnudgeright));
 //BA.debugLineNum = 607;BA.debugLine="Menu.Bind(\":nudge-right\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":nudge-right",_pp);
 //BA.debugLineNum = 608;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 609;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setnudgetop(String _varnudgetop) throws Exception{
String _pp = "";
 //BA.debugLineNum = 612;BA.debugLine="Sub SetNudgeTop(varNudgeTop As String) As VMMenu";
 //BA.debugLineNum = 613;BA.debugLine="If varNudgeTop = \"\" Then Return Me";
if ((_varnudgetop).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 614;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 615;BA.debugLine="SetAttrSingle(\"nudge-top\", varNudgeTop)";
_setattrsingle("nudge-top",_varnudgetop);
 //BA.debugLineNum = 616;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 618;BA.debugLine="Dim pp As String = $\"${ID}NudgeTop\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NudgeTop");
 //BA.debugLineNum = 619;BA.debugLine="vue.SetStateSingle(pp, varNudgeTop)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnudgetop));
 //BA.debugLineNum = 620;BA.debugLine="Menu.Bind(\":nudge-top\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":nudge-top",_pp);
 //BA.debugLineNum = 621;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 622;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setnudgewidth(String _varnudgewidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 625;BA.debugLine="Sub SetNudgeWidth(varNudgeWidth As String) As VMMe";
 //BA.debugLineNum = 626;BA.debugLine="If varNudgeWidth = \"\" Then Return Me";
if ((_varnudgewidth).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 627;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 628;BA.debugLine="SetAttrSingle(\"nudge-width\", varNudgeWidth)";
_setattrsingle("nudge-width",_varnudgewidth);
 //BA.debugLineNum = 629;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 631;BA.debugLine="Dim pp As String = $\"${ID}NudgeWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NudgeWidth");
 //BA.debugLineNum = 632;BA.debugLine="vue.SetStateSingle(pp, varNudgeWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnudgewidth));
 //BA.debugLineNum = 633;BA.debugLine="Menu.Bind(\":nudge-width\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":nudge-width",_pp);
 //BA.debugLineNum = 634;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 635;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setoffsetoverflow(boolean _varoffsetoverflow) throws Exception{
String _pp = "";
 //BA.debugLineNum = 638;BA.debugLine="Sub SetOffsetOverflow(varOffsetOverflow As Boolean";
 //BA.debugLineNum = 639;BA.debugLine="If varOffsetOverflow = False Then Return Me";
if (_varoffsetoverflow==__c.False) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 640;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 641;BA.debugLine="SetAttrSingle(\"offset-overflow\", varOffsetOverfl";
_setattrsingle("offset-overflow",BA.ObjectToString(_varoffsetoverflow));
 //BA.debugLineNum = 642;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 644;BA.debugLine="Dim pp As String = $\"${ID}OffsetOverflow\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OffsetOverflow");
 //BA.debugLineNum = 645;BA.debugLine="vue.SetStateSingle(pp, varOffsetOverflow)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoffsetoverflow));
 //BA.debugLineNum = 646;BA.debugLine="Menu.Bind(\":offset-overflow\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":offset-overflow",_pp);
 //BA.debugLineNum = 647;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 648;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setoffsetx(boolean _varoffsetx) throws Exception{
String _pp = "";
 //BA.debugLineNum = 651;BA.debugLine="Sub SetOffsetX(varOffsetX As Boolean) As VMMenu";
 //BA.debugLineNum = 652;BA.debugLine="If varOffsetX = False Then Return Me";
if (_varoffsetx==__c.False) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 653;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 654;BA.debugLine="SetAttrSingle(\"offset-x\", varOffsetX)";
_setattrsingle("offset-x",BA.ObjectToString(_varoffsetx));
 //BA.debugLineNum = 655;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 657;BA.debugLine="Dim pp As String = $\"${ID}OffsetX\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OffsetX");
 //BA.debugLineNum = 658;BA.debugLine="vue.SetStateSingle(pp, varOffsetX)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoffsetx));
 //BA.debugLineNum = 659;BA.debugLine="Menu.Bind(\":offset-x\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":offset-x",_pp);
 //BA.debugLineNum = 660;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 661;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setoffsety(boolean _varoffsety) throws Exception{
String _pp = "";
 //BA.debugLineNum = 664;BA.debugLine="Sub SetOffsetY(varOffsetY As Boolean) As VMMenu";
 //BA.debugLineNum = 665;BA.debugLine="If varOffsetY = False Then";
if (_varoffsety==__c.False) { 
 //BA.debugLineNum = 666;BA.debugLine="RemoveAttr(\"offset-y\")";
_removeattr("offset-y");
 //BA.debugLineNum = 667;BA.debugLine="RemoveAttr(\":offset-y\")";
_removeattr(":offset-y");
 //BA.debugLineNum = 668;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 670;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 671;BA.debugLine="SetAttrSingle(\"offset-y\", varOffsetY)";
_setattrsingle("offset-y",BA.ObjectToString(_varoffsety));
 //BA.debugLineNum = 672;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 674;BA.debugLine="Dim pp As String = $\"${ID}OffsetY\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OffsetY");
 //BA.debugLineNum = 675;BA.debugLine="vue.SetStateSingle(pp, varOffsetY)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoffsety));
 //BA.debugLineNum = 676;BA.debugLine="Menu.Bind(\":offset-y\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":offset-y",_pp);
 //BA.debugLineNum = 677;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 678;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setopendelay(String _varopendelay) throws Exception{
String _pp = "";
 //BA.debugLineNum = 681;BA.debugLine="Sub SetOpenDelay(varOpenDelay As String) As VMMenu";
 //BA.debugLineNum = 682;BA.debugLine="If varOpenDelay = \"\" Then Return Me";
if ((_varopendelay).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 683;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 684;BA.debugLine="SetAttrSingle(\"open-delay\", varOpenDelay)";
_setattrsingle("open-delay",_varopendelay);
 //BA.debugLineNum = 685;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 687;BA.debugLine="Dim pp As String = $\"${ID}OpenDelay\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OpenDelay");
 //BA.debugLineNum = 688;BA.debugLine="vue.SetStateSingle(pp, varOpenDelay)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varopendelay));
 //BA.debugLineNum = 689;BA.debugLine="Menu.Bind(\":open-delay\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":open-delay",_pp);
 //BA.debugLineNum = 690;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setopenonclick(boolean _varopenonclick) throws Exception{
String _pp = "";
 //BA.debugLineNum = 694;BA.debugLine="Sub SetOpenOnClick(varOpenOnClick As Boolean) As V";
 //BA.debugLineNum = 695;BA.debugLine="If varOpenOnClick Then Return Me";
if (_varopenonclick) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 696;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 697;BA.debugLine="SetAttrSingle(\"open-on-click\", varOpenOnClick)";
_setattrsingle("open-on-click",BA.ObjectToString(_varopenonclick));
 //BA.debugLineNum = 698;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 700;BA.debugLine="Dim pp As String = $\"${ID}OpenOnClick\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OpenOnClick");
 //BA.debugLineNum = 701;BA.debugLine="vue.SetStateSingle(pp, varOpenOnClick)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varopenonclick));
 //BA.debugLineNum = 702;BA.debugLine="Menu.Bind(\":open-on-click\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":open-on-click",_pp);
 //BA.debugLineNum = 703;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 704;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setopenonhover(boolean _varopenonhover) throws Exception{
String _pp = "";
 //BA.debugLineNum = 707;BA.debugLine="Sub SetOpenOnHover(varOpenOnHover As Boolean) As V";
 //BA.debugLineNum = 708;BA.debugLine="If varOpenOnHover = False Then";
if (_varopenonhover==__c.False) { 
 //BA.debugLineNum = 709;BA.debugLine="RemoveAttr(\"open-on-hover\")";
_removeattr("open-on-hover");
 //BA.debugLineNum = 710;BA.debugLine="RemoveAttr(\":open-on-hover\")";
_removeattr(":open-on-hover");
 //BA.debugLineNum = 711;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 713;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 714;BA.debugLine="SetAttrSingle(\"\", varOpenOnHover)";
_setattrsingle("",BA.ObjectToString(_varopenonhover));
 //BA.debugLineNum = 715;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 717;BA.debugLine="Dim pp As String = $\"${ID}OpenOnHover\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OpenOnHover");
 //BA.debugLineNum = 718;BA.debugLine="vue.SetStateSingle(pp, varOpenOnHover)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varopenonhover));
 //BA.debugLineNum = 719;BA.debugLine="Menu.Bind(\":open-on-hover\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":open-on-hover",_pp);
 //BA.debugLineNum = 720;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 721;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setorigin(String _varorigin) throws Exception{
String _pp = "";
 //BA.debugLineNum = 724;BA.debugLine="Sub SetOrigin(varOrigin As String) As VMMenu";
 //BA.debugLineNum = 725;BA.debugLine="If varOrigin = \"\" Then Return Me";
if ((_varorigin).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 726;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 727;BA.debugLine="SetAttrSingle(\"origin\", varOrigin)";
_setattrsingle("origin",_varorigin);
 //BA.debugLineNum = 728;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 730;BA.debugLine="Dim pp As String = $\"${ID}Origin\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Origin");
 //BA.debugLineNum = 731;BA.debugLine="vue.SetStateSingle(pp, varOrigin)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varorigin));
 //BA.debugLineNum = 732;BA.debugLine="Menu.Bind(\":origin\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":origin",_pp);
 //BA.debugLineNum = 733;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 734;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 869;BA.debugLine="Sub SetPaddingAll(p As String) As VMMenu";
 //BA.debugLineNum = 870;BA.debugLine="Menu.SetPaddingAll(p)";
_menu._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 871;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 872;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setpositionx(String _varpositionx) throws Exception{
String _pp = "";
 //BA.debugLineNum = 737;BA.debugLine="Sub SetPositionX(varPositionX As String) As VMMenu";
 //BA.debugLineNum = 738;BA.debugLine="If varPositionX = \"\" Then Return Me";
if ((_varpositionx).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 739;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 740;BA.debugLine="SetAttrSingle(\"position-x\", varPositionX)";
_setattrsingle("position-x",_varpositionx);
 //BA.debugLineNum = 741;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 743;BA.debugLine="Dim pp As String = $\"${ID}PositionX\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PositionX");
 //BA.debugLineNum = 744;BA.debugLine="vue.SetStateSingle(pp, varPositionX)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpositionx));
 //BA.debugLineNum = 745;BA.debugLine="Menu.Bind(\":position-x\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":position-x",_pp);
 //BA.debugLineNum = 746;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 747;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setpositiony(String _varpositiony) throws Exception{
String _pp = "";
 //BA.debugLineNum = 750;BA.debugLine="Sub SetPositionY(varPositionY As String) As VMMenu";
 //BA.debugLineNum = 751;BA.debugLine="If varPositionY = \"\" Then Return Me";
if ((_varpositiony).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 752;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 753;BA.debugLine="SetAttrSingle(\"position-y\", varPositionY)";
_setattrsingle("position-y",_varpositiony);
 //BA.debugLineNum = 754;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 756;BA.debugLine="Dim pp As String = $\"${ID}PositionY\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PositionY");
 //BA.debugLineNum = 757;BA.debugLine="vue.SetStateSingle(pp, varPositionY)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpositiony));
 //BA.debugLineNum = 758;BA.debugLine="Menu.Bind(\":position-y\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":position-y",_pp);
 //BA.debugLineNum = 759;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 760;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMMen";
 //BA.debugLineNum = 67;BA.debugLine="Menu.SetRC(sRow, sCol)";
_menu._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setreturnvalue(String _varreturnvalue) throws Exception{
 //BA.debugLineNum = 763;BA.debugLine="Sub SetReturnValue(varReturnValue As String) As VM";
 //BA.debugLineNum = 764;BA.debugLine="If varReturnValue = \"\" Then Return Me";
if ((_varreturnvalue).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 765;BA.debugLine="Menu.Bind(\"return-value\", varReturnValue)";
_menu._bind /*b4j.example.vmelement*/ ("return-value",_varreturnvalue);
 //BA.debugLineNum = 766;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 767;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setright(boolean _varright) throws Exception{
String _pp = "";
 //BA.debugLineNum = 770;BA.debugLine="Sub SetRight(varRight As Boolean) As VMMenu";
 //BA.debugLineNum = 771;BA.debugLine="If varRight = False Then Return Me";
if (_varright==__c.False) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 772;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 773;BA.debugLine="SetAttrSingle(\"right\", varRight)";
_setattrsingle("right",BA.ObjectToString(_varright));
 //BA.debugLineNum = 774;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 776;BA.debugLine="Dim pp As String = $\"${ID}Right\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Right");
 //BA.debugLineNum = 777;BA.debugLine="vue.SetStateSingle(pp, varRight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varright));
 //BA.debugLineNum = 778;BA.debugLine="Menu.Bind(\":right\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":right",_pp);
 //BA.debugLineNum = 779;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 780;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setslideytransition() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetSlideYTransition As VMMenu";
 //BA.debugLineNum = 96;BA.debugLine="SetAttrSingle(\"transition\", \"slide-y-transition\")";
_setattrsingle("transition","slide-y-transition");
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setslotactivator(boolean _b) throws Exception{
 //BA.debugLineNum = 828;BA.debugLine="Sub SetSlotActivator(b As Boolean) As VMMenu    'i";
 //BA.debugLineNum = 829;BA.debugLine="SetAttr(CreateMap(\"slot\": \"activator\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("activator")}));
 //BA.debugLineNum = 830;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 831;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetStatic(b As Boolean) As VMMenu";
 //BA.debugLineNum = 50;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 51;BA.debugLine="Menu.SetStatic(b)";
_menu._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 52;BA.debugLine="act.setstatic(b)";
_act._setstatic /*b4j.example.vmtemplate*/ (_b);
 //BA.debugLineNum = 53;BA.debugLine="MenuContent.SetStatic(b)";
_menucontent._setstatic /*b4j.example.vmlist*/ (_b);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub SetStyle(sm As Map) As VMMenu";
 //BA.debugLineNum = 300;BA.debugLine="Menu.SetStyle(sm)";
_menu._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 891;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 892;BA.debugLine="Menu.SetStyleSingle(prop, value)";
_menu._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 893;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 894;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 879;BA.debugLine="Sub SetTabIndex(ti As String) As VMMenu";
 //BA.debugLineNum = 880;BA.debugLine="Menu.SetTabIndex(ti)";
_menu._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 881;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 882;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub SetText(t As Object) As VMMenu";
 //BA.debugLineNum = 277;BA.debugLine="Menu.SetText(t)";
_menu._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 917;BA.debugLine="Sub SetTextColor(varColor As String) As VMMenu";
 //BA.debugLineNum = 918;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 919;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 920;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 921;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 924;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 925;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 926;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 927;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 928;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 929;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 930;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _settop(boolean _vartop) throws Exception{
String _pp = "";
 //BA.debugLineNum = 783;BA.debugLine="Sub SetTop(varTop As Boolean) As VMMenu";
 //BA.debugLineNum = 784;BA.debugLine="If varTop = False Then Return Me";
if (_vartop==__c.False) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 785;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 786;BA.debugLine="SetAttrSingle(\"top\", varTop)";
_setattrsingle("top",BA.ObjectToString(_vartop));
 //BA.debugLineNum = 787;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 789;BA.debugLine="Dim pp As String = $\"${ID}Top\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Top");
 //BA.debugLineNum = 790;BA.debugLine="vue.SetStateSingle(pp, varTop)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartop));
 //BA.debugLineNum = 791;BA.debugLine="Menu.Bind(\":top\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":top",_pp);
 //BA.debugLineNum = 792;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 793;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _settransition(String _vartransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 796;BA.debugLine="Sub SetTransition(varTransition As String) As VMMe";
 //BA.debugLineNum = 797;BA.debugLine="If varTransition = \"\" Then Return Me";
if ((_vartransition).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 798;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 799;BA.debugLine="SetAttrSingle(\"transition\", varTransition)";
_setattrsingle("transition",_vartransition);
 //BA.debugLineNum = 800;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 802;BA.debugLine="Dim pp As String = $\"${ID}Transition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Transition");
 //BA.debugLineNum = 803;BA.debugLine="vue.SetStateSingle(pp, varTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartransition));
 //BA.debugLineNum = 804;BA.debugLine="Menu.Bind(\":transition\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":transition",_pp);
 //BA.debugLineNum = 805;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 806;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setvalue(boolean _varvalue) throws Exception{
 //BA.debugLineNum = 809;BA.debugLine="Sub SetValue(varValue As Boolean) As VMMenu";
 //BA.debugLineNum = 810;BA.debugLine="Menu.SetValue(varValue,False)";
_menu._setvalue /*b4j.example.vmelement*/ (BA.ObjectToString(_varvalue),__c.False);
 //BA.debugLineNum = 811;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 812;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetVIf(vif As String) As VMMenu";
 //BA.debugLineNum = 254;BA.debugLine="Menu.SetVIf(vif)";
_menu._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 911;BA.debugLine="Sub SetVisible(b As Boolean) As VMMenu";
 //BA.debugLineNum = 912;BA.debugLine="Menu.SetVisible(b)";
_menu._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 913;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 914;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetVModel(k As String) As VMMenu";
 //BA.debugLineNum = 249;BA.debugLine="Menu.SetVModel(k)";
_menu._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setvonce(boolean _t) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetVOnce(t As Boolean) As VMMenu";
 //BA.debugLineNum = 45;BA.debugLine="Menu.setvonce(t)";
_menu._setvonce /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub SetVShow(vif As String) As VMMenu";
 //BA.debugLineNum = 259;BA.debugLine="Menu.SetVShow(vif)";
_menu._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setzindex(String _varzindex) throws Exception{
String _pp = "";
 //BA.debugLineNum = 815;BA.debugLine="Sub SetZIndex(varZIndex As String) As VMMenu";
 //BA.debugLineNum = 816;BA.debugLine="If varZIndex = \"\" Then Return Me";
if ((_varzindex).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 817;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 818;BA.debugLine="SetAttrSingle(\"z-index\", varZIndex)";
_setattrsingle("z-index",_varzindex);
 //BA.debugLineNum = 819;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 };
 //BA.debugLineNum = 821;BA.debugLine="Dim pp As String = $\"${ID}ZIndex\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ZIndex");
 //BA.debugLineNum = 822;BA.debugLine="vue.SetStateSingle(pp, varZIndex)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varzindex));
 //BA.debugLineNum = 823;BA.debugLine="Menu.Bind(\":z-index\", pp)";
_menu._bind /*b4j.example.vmelement*/ (":z-index",_pp);
 //BA.debugLineNum = 824;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 825;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _show() throws Exception{
 //BA.debugLineNum = 839;BA.debugLine="Sub Show As VMMenu";
 //BA.debugLineNum = 840;BA.debugLine="Menu.SetVisible(True)";
_menu._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 841;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 842;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 243;BA.debugLine="If hasActivator Then act.Pop(Menu)";
if (_hasactivator) { 
_act._pop /*String*/ (_menu);};
 //BA.debugLineNum = 244;BA.debugLine="If MenuContent.HasContent Then MenuContent.Pop(Me";
if (_menucontent._hascontent /*boolean*/ ) { 
_menucontent._pop /*String*/ (_menu);};
 //BA.debugLineNum = 245;BA.debugLine="Return Menu.ToString";
if (true) return _menu._tostring /*String*/ ();
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenu  _updateavatar(String _url) throws Exception{
String _urllink = "";
 //BA.debugLineNum = 192;BA.debugLine="Sub UpdateAvatar(url As String) As VMMenu";
 //BA.debugLineNum = 193;BA.debugLine="Dim urlLink As String = $\"${ID}avatarimage\"$";
_urllink = (""+__c.SmartStringFormatter("",(Object)(_id))+"avatarimage");
 //BA.debugLineNum = 194;BA.debugLine="vue.SetData(urlLink, url)";
_vue._setdata /*b4j.example.bananovue*/ (_urllink,(Object)(_url));
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public String  _updatebuttonlabel(String _txt) throws Exception{
String _skey = "";
 //BA.debugLineNum = 174;BA.debugLine="Sub UpdateButtonLabel(txt As String)";
 //BA.debugLineNum = 175;BA.debugLine="Dim skey As String = $\"${ID}buttonlabel\"$";
_skey = (""+__c.SmartStringFormatter("",(Object)(_id))+"buttonlabel");
 //BA.debugLineNum = 176;BA.debugLine="vue.SetData(skey, txt)";
_vue._setdata /*b4j.example.bananovue*/ (_skey,(Object)(_txt));
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return "";
}
public String  _usevisibility() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub UseVisibility";
 //BA.debugLineNum = 40;BA.debugLine="MenuContent.UseVisibility = True";
_menucontent._usevisibility /*boolean*/  = __c.True;
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
