package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmavatar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmavatar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmavatar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _avatar = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public b4j.example.vmimage _image = null;
public b4j.example.vmicon _icon = null;
public boolean _hasicon = false;
public boolean _hasimage = false;
public boolean _bstatic = false;
public b4j.example.vmlabel _label = null;
public boolean _haslabel = false;
public b4j.example.vmbadge _badge = null;
public boolean _hasbadge = false;
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
public b4j.example.vmavatar  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 307;BA.debugLine="Sub AddChild(child As VMElement) As VMAvatar";
 //BA.debugLineNum = 308;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 309;BA.debugLine="Avatar.SetText(childHTML)";
_avatar._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 337;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 338;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 339;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmavatar  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub AddClass(c As String) As VMAvatar";
 //BA.debugLineNum = 320;BA.debugLine="Avatar.AddClass(c)";
_avatar._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub AddComponent(comp As String) As VMAvatar";
 //BA.debugLineNum = 253;BA.debugLine="Avatar.SetText(comp)";
_avatar._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _addicon(String _iid,String _iconname,anywheresoftware.b4a.objects.collections.Map _props,anywheresoftware.b4a.objects.collections.List _classes,anywheresoftware.b4a.objects.collections.List _attributes) throws Exception{
b4j.example.vmicon _vicon = null;
String _k = "";
String _v = "";
String _c = "";
 //BA.debugLineNum = 130;BA.debugLine="Sub AddIcon(iID As String, iconName As String, pro";
 //BA.debugLineNum = 131;BA.debugLine="Dim vicon As VMIcon";
_vicon = new b4j.example.vmicon();
 //BA.debugLineNum = 132;BA.debugLine="vicon.Initialize(vue, iID, Module).SetStatic(bSta";
_vicon._initialize /*b4j.example.vmicon*/ (ba,_vue,_iid,_module)._setstatic /*b4j.example.vmicon*/ (_bstatic)._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 133;BA.debugLine="vicon.SetText(iconName)";
_vicon._settext /*b4j.example.vmicon*/ (_iconname);
 //BA.debugLineNum = 134;BA.debugLine="If attributes <> Null Then";
if (_attributes!= null) { 
 //BA.debugLineNum = 135;BA.debugLine="vicon.SetAttributes(attributes)";
_vicon._setattributes /*b4j.example.vmicon*/ (_attributes);
 };
 //BA.debugLineNum = 137;BA.debugLine="If props <> Null Then";
if (_props!= null) { 
 //BA.debugLineNum = 138;BA.debugLine="For Each k As String In props.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _props.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_k = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 139;BA.debugLine="Dim v As String = props.Get(k)";
_v = BA.ObjectToString(_props.Get((Object)(_k)));
 //BA.debugLineNum = 140;BA.debugLine="vicon.SetAttrSingle(k, v)";
_vicon._setattrsingle /*b4j.example.vmicon*/ (_k,_v);
 }
};
 };
 //BA.debugLineNum = 143;BA.debugLine="If classes <> Null Then";
if (_classes!= null) { 
 //BA.debugLineNum = 144;BA.debugLine="For Each c As String In classes";
{
final anywheresoftware.b4a.BA.IterableList group14 = _classes;
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_c = BA.ObjectToString(group14.Get(index14));
 //BA.debugLineNum = 145;BA.debugLine="vicon.AddClass(c)";
_vicon._addclass /*b4j.example.vmicon*/ (_c);
 }
};
 };
 //BA.debugLineNum = 148;BA.debugLine="AddComponent(vicon.ToString)";
_addcomponent(_vicon._tostring /*String*/ ());
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 562;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 563;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 564;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmavatar  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 495;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 496;BA.debugLine="Avatar.Bind(prop, stateprop)";
_avatar._bind /*b4j.example.vmelement*/ (_prop,_stateprop);
 //BA.debugLineNum = 497;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 566;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 567;BA.debugLine="Avatar.BuildModel(mprops, mstyles, lclasses, loos";
_avatar._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 568;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 569;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Avatar As VMElement";
_avatar = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Public Image As VMImage";
_image = new b4j.example.vmimage();
 //BA.debugLineNum = 10;BA.debugLine="Public Icon As VMIcon";
_icon = new b4j.example.vmicon();
 //BA.debugLineNum = 11;BA.debugLine="Private hasIcon As Boolean";
_hasicon = false;
 //BA.debugLineNum = 12;BA.debugLine="Private hasImage As Boolean";
_hasimage = false;
 //BA.debugLineNum = 13;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 14;BA.debugLine="Public Label As VMLabel";
_label = new b4j.example.vmlabel();
 //BA.debugLineNum = 15;BA.debugLine="Private hasLabel As Boolean";
_haslabel = false;
 //BA.debugLineNum = 16;BA.debugLine="Public Badge As VMBadge";
_badge = new b4j.example.vmbadge();
 //BA.debugLineNum = 17;BA.debugLine="Private hasBadge As Boolean";
_hasbadge = false;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmavatar  _disable() throws Exception{
 //BA.debugLineNum = 488;BA.debugLine="Sub Disable As VMAvatar";
 //BA.debugLineNum = 489;BA.debugLine="Avatar.Enable(false)";
_avatar._enable /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 490;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 491;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _enable() throws Exception{
 //BA.debugLineNum = 483;BA.debugLine="Sub Enable As VMAvatar";
 //BA.debugLineNum = 484;BA.debugLine="Avatar.Enable(True)";
_avatar._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 485;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 486;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _hide() throws Exception{
 //BA.debugLineNum = 473;BA.debugLine="Sub Hide As VMAvatar";
 //BA.debugLineNum = 474;BA.debugLine="Avatar.SetVisible(False)";
_avatar._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 475;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 476;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 22;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 23;BA.debugLine="Avatar.Initialize(v, ID)";
_avatar._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 24;BA.debugLine="Avatar.SetTag(\"v-avatar\")";
_avatar._settag /*b4j.example.vmelement*/ ("v-avatar");
 //BA.debugLineNum = 25;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 26;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 27;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 28;BA.debugLine="If ID = \"\" Then";
if ((_id).equals("")) { 
 //BA.debugLineNum = 29;BA.debugLine="Icon.Initialize(vue, \"\", Module)";
_icon._initialize /*b4j.example.vmicon*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 30;BA.debugLine="Image.Initialize(vue, \"\", Module)";
_image._initialize /*b4j.example.vmimage*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 31;BA.debugLine="Label.Initialize(vue, \"\")";
_label._initialize /*b4j.example.vmlabel*/ (ba,_vue,"");
 //BA.debugLineNum = 32;BA.debugLine="Badge.Initialize(vue, \"\", Module)";
_badge._initialize /*b4j.example.vmbadge*/ (ba,_vue,"",_module);
 }else {
 //BA.debugLineNum = 34;BA.debugLine="Icon.Initialize(vue, $\"${ID}icon\"$, Module)";
_icon._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"icon"),_module);
 //BA.debugLineNum = 35;BA.debugLine="Image.Initialize(vue, $\"${ID}image\"$, Module)";
_image._initialize /*b4j.example.vmimage*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"image"),_module);
 //BA.debugLineNum = 36;BA.debugLine="Label.Initialize(vue, $\"${ID}label\"$)";
_label._initialize /*b4j.example.vmlabel*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"label"));
 //BA.debugLineNum = 37;BA.debugLine="Badge.Initialize(vue, $\"${ID}badge\"$, Module)";
_badge._initialize /*b4j.example.vmbadge*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"badge"),_module);
 };
 //BA.debugLineNum = 39;BA.debugLine="Label.SetTag(\"span\")";
_label._settag /*b4j.example.vmlabel*/ ("span");
 //BA.debugLineNum = 40;BA.debugLine="hasBadge = False";
_hasbadge = __c.False;
 //BA.debugLineNum = 41;BA.debugLine="hasIcon = False";
_hasicon = __c.False;
 //BA.debugLineNum = 42;BA.debugLine="hasImage = False";
_hasimage = __c.False;
 //BA.debugLineNum = 43;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 44;BA.debugLine="hasLabel = False";
_haslabel = __c.False;
 //BA.debugLineNum = 45;BA.debugLine="Avatar.typeOf = \"avatar\"";
_avatar._typeof /*String*/  = "avatar";
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 315;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmavatar  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 501;BA.debugLine="public Sub RemoveAttr(sName As String) As VMAvatar";
 //BA.debugLineNum = 502;BA.debugLine="Avatar.RemoveAttr(sName)";
_avatar._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 503;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 504;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub Render";
 //BA.debugLineNum = 303;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmavatar  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub SetAttr(attr As Map) As VMAvatar";
 //BA.debugLineNum = 326;BA.debugLine="Avatar.SetAttr(attr)";
_avatar._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 157;BA.debugLine="Sub SetAttributes(attrs As List) As VMAvatar";
 //BA.debugLineNum = 158;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 159;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub SetAttrLoose(loose As String) As VMAvatar";
 //BA.debugLineNum = 153;BA.debugLine="Avatar.SetAttrLoose(loose)";
_avatar._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 556;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 557;BA.debugLine="Avatar.SetAttrSingle(prop, value)";
_avatar._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 558;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 559;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setbadge(String _scontent) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetBadge(scontent As String) As VMAvatar";
 //BA.debugLineNum = 56;BA.debugLine="Badge.SetContent(scontent)";
_badge._setcontent /*b4j.example.vmbadge*/ (_scontent);
 //BA.debugLineNum = 57;BA.debugLine="Badge.SetBordered(True)";
_badge._setbordered /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 58;BA.debugLine="Badge.SetOverlap(True)";
_badge._setoverlap /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 59;BA.debugLine="Badge.SetColorIntensity(vue.COLOR_CYAN, vue.INTEN";
_badge._setcolorintensity /*b4j.example.vmbadge*/ (_vue._color_cyan /*String*/ ,_vue._intensity_normal /*String*/ );
 //BA.debugLineNum = 60;BA.debugLine="Badge.SetAvatar(True)";
_badge._setavatar /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 61;BA.debugLine="Badge.SetIcon(\"\")";
_badge._seticon /*b4j.example.vmbadge*/ ("");
 //BA.debugLineNum = 62;BA.debugLine="Badge.SetDot(False)";
_badge._setdot /*b4j.example.vmbadge*/ (__c.False);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setcenteronparent(boolean _b) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetCenterOnParent(b As Boolean) As VMAvatar";
 //BA.debugLineNum = 90;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 91;BA.debugLine="Avatar.CenterOnParent = True";
_avatar._centeronparent /*boolean*/  = __c.True;
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 344;BA.debugLine="Sub SetColor(varColor As String) As VMAvatar";
 //BA.debugLineNum = 345;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 346;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 347;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 };
 //BA.debugLineNum = 350;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 351;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 352;BA.debugLine="Avatar.Bind(\":color\", pp)";
_avatar._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 199;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 200;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 201;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 202;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 203;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 };
 //BA.debugLineNum = 206;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 207;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 208;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 209;BA.debugLine="Avatar.Bind(\":color\", pp)";
_avatar._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 50;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 524;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMAvatar";
 //BA.debugLineNum = 525;BA.debugLine="Avatar.SetDesignMode(b)";
_avatar._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 526;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 527;BA.debugLine="Icon.SetDesignMode(b)";
_icon._setdesignmode /*b4j.example.vmicon*/ (_b);
 //BA.debugLineNum = 528;BA.debugLine="Image.SetDesignMode(b)";
_image._setdesignmode /*b4j.example.vmimage*/ (_b);
 //BA.debugLineNum = 529;BA.debugLine="Label.SetDesignMode(b)";
_label._setdesignmode /*b4j.example.vmlabel*/ (_b);
 //BA.debugLineNum = 530;BA.debugLine="Badge.SetDesignMode(b)";
_badge._setdesignmode /*b4j.example.vmbadge*/ (_b);
 //BA.debugLineNum = 531;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 532;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 113;BA.debugLine="Avatar.SetDeviceOffsets(OS, OM, OL, OX)";
_avatar._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 125;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 126;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 119;BA.debugLine="Avatar.SetDeviceSizes(SS, SM, SL, SX)";
_avatar._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 545;BA.debugLine="Sub SetDisabled(b As Boolean) As VMAvatar";
 //BA.debugLineNum = 546;BA.debugLine="Avatar.SetDisabled(b)";
_avatar._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 547;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 548;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _sethasbadge(boolean _b) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetHasBadge(b As Boolean) As VMAvatar";
 //BA.debugLineNum = 84;BA.debugLine="hasBadge = b";
_hasbadge = _b;
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 357;BA.debugLine="Sub SetHeight(varHeight As String) As VMAvatar";
 //BA.debugLineNum = 358;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 359;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 360;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 };
 //BA.debugLineNum = 363;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 364;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 365;BA.debugLine="Avatar.Bind(\":height\", pp)";
_avatar._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 366;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _seticon(String _iconname,String _icontheme,anywheresoftware.b4a.objects.collections.Map _props,anywheresoftware.b4a.objects.collections.List _classes,anywheresoftware.b4a.objects.collections.List _attributes) throws Exception{
String _k = "";
String _v = "";
String _c = "";
 //BA.debugLineNum = 164;BA.debugLine="Sub SetIcon(iconName As String, iconTheme As Strin";
 //BA.debugLineNum = 165;BA.debugLine="hasIcon = True";
_hasicon = __c.True;
 //BA.debugLineNum = 166;BA.debugLine="Icon.SetText(iconName)";
_icon._settext /*b4j.example.vmicon*/ (_iconname);
 //BA.debugLineNum = 167;BA.debugLine="If iconTheme <> \"\" Then";
if ((_icontheme).equals("") == false) { 
 //BA.debugLineNum = 168;BA.debugLine="Icon.UseTheme(iconTheme)";
_icon._usetheme /*b4j.example.vmicon*/ (_icontheme);
 };
 //BA.debugLineNum = 171;BA.debugLine="If attributes <> Null Then";
if (_attributes!= null) { 
 //BA.debugLineNum = 172;BA.debugLine="Icon.SetAttributes(attributes)";
_icon._setattributes /*b4j.example.vmicon*/ (_attributes);
 };
 //BA.debugLineNum = 175;BA.debugLine="If props <> Null Then";
if (_props!= null) { 
 //BA.debugLineNum = 176;BA.debugLine="For Each k As String In props.Keys";
{
final anywheresoftware.b4a.BA.IterableList group10 = _props.Keys();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_k = BA.ObjectToString(group10.Get(index10));
 //BA.debugLineNum = 177;BA.debugLine="Dim v As String = props.Get(k)";
_v = BA.ObjectToString(_props.Get((Object)(_k)));
 //BA.debugLineNum = 178;BA.debugLine="Icon.SetAttrSingle(k, v)";
_icon._setattrsingle /*b4j.example.vmicon*/ (_k,_v);
 }
};
 };
 //BA.debugLineNum = 182;BA.debugLine="If classes <> Null Then";
if (_classes!= null) { 
 //BA.debugLineNum = 183;BA.debugLine="For Each c As String In classes";
{
final anywheresoftware.b4a.BA.IterableList group16 = _classes;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_c = BA.ObjectToString(group16.Get(index16));
 //BA.debugLineNum = 184;BA.debugLine="Icon.AddClass(c)";
_icon._addclass /*b4j.example.vmicon*/ (_c);
 }
};
 };
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _seticononly(String _iconname) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub SetIconOnly(iconName As String) As VMAvatar";
 //BA.debugLineNum = 191;BA.debugLine="hasIcon = True";
_hasicon = __c.True;
 //BA.debugLineNum = 192;BA.debugLine="Icon.SetText(iconName)";
_icon._settext /*b4j.example.vmicon*/ (_iconname);
 //BA.debugLineNum = 193;BA.debugLine="Icon.SetDark(True)";
_icon._setdark /*b4j.example.vmicon*/ (__c.True);
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setimage(String _url,String _alt,anywheresoftware.b4a.objects.collections.Map _props,anywheresoftware.b4a.objects.collections.List _classes,anywheresoftware.b4a.objects.collections.List _attributes) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub SetImage(url As String, alt As String, props A";
 //BA.debugLineNum = 237;BA.debugLine="hasImage = True";
_hasimage = __c.True;
 //BA.debugLineNum = 238;BA.debugLine="Image.SetVModel($\"${ID}image\"$, url)";
_image._setvmodel /*b4j.example.vmimage*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"image"),_url);
 //BA.debugLineNum = 239;BA.debugLine="Image.SetAlt(alt)";
_image._setalt /*b4j.example.vmimage*/ (_alt);
 //BA.debugLineNum = 240;BA.debugLine="Image.BuildModel(props, Null, classes, attributes";
_image._buildmodel /*b4j.example.vmimage*/ (_props,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__c.Null)),_classes,_attributes);
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setimageonly(String _url) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub SetImageOnly(url As String) As VMAvatar";
 //BA.debugLineNum = 245;BA.debugLine="hasImage = True";
_hasimage = __c.True;
 //BA.debugLineNum = 246;BA.debugLine="Image.SetVModel($\"${ID}image\"$, url)";
_image._setvmodel /*b4j.example.vmimage*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"image"),_url);
 //BA.debugLineNum = 247;BA.debugLine="Image.SetAlt(\"\")";
_image._setalt /*b4j.example.vmimage*/ ("");
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setlabeltheme(String _stheme) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetLabelTheme(stheme As String) As VMAvatar";
 //BA.debugLineNum = 67;BA.debugLine="Label.UseTheme(stheme)";
_label._usetheme /*b4j.example.vmlabel*/ (_stheme);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setleft(boolean _varleft) throws Exception{
String _pp = "";
 //BA.debugLineNum = 370;BA.debugLine="Sub SetLeft(varLeft As Boolean) As VMAvatar";
 //BA.debugLineNum = 371;BA.debugLine="If varLeft = False Then Return Me";
if (_varleft==__c.False) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 372;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 373;BA.debugLine="SetAttrSingle(\"left\", varLeft)";
_setattrsingle("left",BA.ObjectToString(_varleft));
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 };
 //BA.debugLineNum = 376;BA.debugLine="Dim pp As String = $\"${ID}Left\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Left");
 //BA.debugLineNum = 377;BA.debugLine="vue.SetStateSingle(pp, varLeft)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varleft));
 //BA.debugLineNum = 378;BA.debugLine="Avatar.Bind(\":left\", pp)";
_avatar._bind /*b4j.example.vmelement*/ (":left",_pp);
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 512;BA.debugLine="Sub SetMarginAll(p As String) As VMAvatar";
 //BA.debugLineNum = 513;BA.debugLine="Avatar.setmarginall(p)";
_avatar._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 514;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setmaxheight(String _varmaxheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 383;BA.debugLine="Sub SetMaxHeight(varMaxHeight As String) As VMAvat";
 //BA.debugLineNum = 384;BA.debugLine="If varMaxHeight = \"\" Then Return Me";
if ((_varmaxheight).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 385;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 386;BA.debugLine="SetAttrSingle(\"max-height\", varMaxHeight)";
_setattrsingle("max-height",_varmaxheight);
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 };
 //BA.debugLineNum = 389;BA.debugLine="Dim pp As String = $\"${ID}MaxHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxHeight");
 //BA.debugLineNum = 390;BA.debugLine="vue.SetStateSingle(pp, varMaxHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxheight));
 //BA.debugLineNum = 391;BA.debugLine="Avatar.Bind(\":max-height\", pp)";
_avatar._bind /*b4j.example.vmelement*/ (":max-height",_pp);
 //BA.debugLineNum = 392;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setmaxwidth(String _varmaxwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 396;BA.debugLine="Sub SetMaxWidth(varMaxWidth As String) As VMAvatar";
 //BA.debugLineNum = 397;BA.debugLine="If varMaxWidth = \"\" Then Return Me";
if ((_varmaxwidth).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 398;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 399;BA.debugLine="SetAttrSingle(\"max-width\", varMaxWidth)";
_setattrsingle("max-width",_varmaxwidth);
 //BA.debugLineNum = 400;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 };
 //BA.debugLineNum = 402;BA.debugLine="Dim pp As String = $\"${ID}MaxWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxWidth");
 //BA.debugLineNum = 403;BA.debugLine="vue.SetStateSingle(pp, varMaxWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxwidth));
 //BA.debugLineNum = 404;BA.debugLine="Avatar.Bind(\":max-width\", pp)";
_avatar._bind /*b4j.example.vmelement*/ (":max-width",_pp);
 //BA.debugLineNum = 405;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setmenutrigger(boolean _b) throws Exception{
 //BA.debugLineNum = 518;BA.debugLine="Sub SetMenuTrigger(b As Boolean) As VMAvatar";
 //BA.debugLineNum = 519;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 520;BA.debugLine="Avatar.SetAttrSingle(\"v-on\",\"on\")";
_avatar._setattrsingle /*b4j.example.vmelement*/ ("v-on","on");
 //BA.debugLineNum = 521;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 522;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setminheight(String _varminheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 409;BA.debugLine="Sub SetMinHeight(varMinHeight As String) As VMAvat";
 //BA.debugLineNum = 410;BA.debugLine="If varMinHeight = \"\" Then Return Me";
if ((_varminheight).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 411;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 412;BA.debugLine="SetAttrSingle(\"min-height\", varMinHeight)";
_setattrsingle("min-height",_varminheight);
 //BA.debugLineNum = 413;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 };
 //BA.debugLineNum = 415;BA.debugLine="Dim pp As String = $\"${ID}MinHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinHeight");
 //BA.debugLineNum = 416;BA.debugLine="vue.SetStateSingle(pp, varMinHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminheight));
 //BA.debugLineNum = 417;BA.debugLine="Avatar.Bind(\":min-height\", pp)";
_avatar._bind /*b4j.example.vmelement*/ (":min-height",_pp);
 //BA.debugLineNum = 418;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setminwidth(String _varminwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 422;BA.debugLine="Sub SetMinWidth(varMinWidth As String) As VMAvatar";
 //BA.debugLineNum = 423;BA.debugLine="If varMinWidth = \"\" Then Return Me";
if ((_varminwidth).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 424;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 425;BA.debugLine="SetAttrSingle(\"min-width\", varMinWidth)";
_setattrsingle("min-width",_varminwidth);
 //BA.debugLineNum = 426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 };
 //BA.debugLineNum = 428;BA.debugLine="Dim pp As String = $\"${ID}MinWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinWidth");
 //BA.debugLineNum = 429;BA.debugLine="vue.SetStateSingle(pp, varMinWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminwidth));
 //BA.debugLineNum = 430;BA.debugLine="Avatar.Bind(\":min-width\", pp)";
_avatar._bind /*b4j.example.vmelement*/ (":min-width",_pp);
 //BA.debugLineNum = 431;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 540;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 541;BA.debugLine="Avatar.SetName(varName, bbind)";
_avatar._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 542;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 543;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setonclick(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 71;BA.debugLine="Sub SetOnClick(EventHandler As Object, methodName";
 //BA.debugLineNum = 72;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 73;BA.debugLine="If SubExists(EventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 74;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 75;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(EventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 76;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 78;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 507;BA.debugLine="Sub SetPaddingAll(p As String) As VMAvatar";
 //BA.debugLineNum = 508;BA.debugLine="Avatar.SetPaddingAll(p)";
_avatar._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 509;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 510;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMAva";
 //BA.debugLineNum = 107;BA.debugLine="Avatar.SetRC(sRow, sCol)";
_avatar._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setright(boolean _varright) throws Exception{
String _pp = "";
 //BA.debugLineNum = 435;BA.debugLine="Sub SetRight(varRight As Boolean) As VMAvatar";
 //BA.debugLineNum = 436;BA.debugLine="If varRight = False Then Return Me";
if (_varright==__c.False) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 437;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 438;BA.debugLine="SetAttrSingle(\"right\", varRight)";
_setattrsingle("right",BA.ObjectToString(_varright));
 //BA.debugLineNum = 439;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 };
 //BA.debugLineNum = 441;BA.debugLine="Dim pp As String = $\"${ID}Right\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Right");
 //BA.debugLineNum = 442;BA.debugLine="vue.SetStateSingle(pp, varRight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varright));
 //BA.debugLineNum = 443;BA.debugLine="Avatar.Bind(\":right\", pp)";
_avatar._bind /*b4j.example.vmelement*/ (":right",_pp);
 //BA.debugLineNum = 444;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setsize(String _varsize) throws Exception{
String _pp = "";
 //BA.debugLineNum = 448;BA.debugLine="Sub SetSize(varSize As String) As VMAvatar";
 //BA.debugLineNum = 449;BA.debugLine="If varSize = \"\" Then Return Me";
if ((_varsize).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 450;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 451;BA.debugLine="SetAttrSingle(\"size\", varSize)";
_setattrsingle("size",_varsize);
 //BA.debugLineNum = 452;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 };
 //BA.debugLineNum = 454;BA.debugLine="Dim pp As String = $\"${ID}Size\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Size");
 //BA.debugLineNum = 455;BA.debugLine="vue.SetStateSingle(pp, varSize)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsize));
 //BA.debugLineNum = 456;BA.debugLine="Avatar.Bind(\":size\", pp)";
_avatar._bind /*b4j.example.vmelement*/ (":size",_pp);
 //BA.debugLineNum = 457;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setslot(String _varslot) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetSlot(varSlot As String) As VMAvatar";
 //BA.debugLineNum = 216;BA.debugLine="Avatar.SetAttrSingle(\"slot\", varSlot)";
_avatar._setattrsingle /*b4j.example.vmelement*/ ("slot",_varslot);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetStatic(b As Boolean) As VMAvatar";
 //BA.debugLineNum = 96;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 97;BA.debugLine="Avatar.SetStatic(b)";
_avatar._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 98;BA.debugLine="Icon.SetStatic(b)";
_icon._setstatic /*b4j.example.vmicon*/ (_b);
 //BA.debugLineNum = 99;BA.debugLine="Image.SetStatic(b)";
_image._setstatic /*b4j.example.vmimage*/ (_b);
 //BA.debugLineNum = 100;BA.debugLine="Label.SetStatic(b)";
_label._setstatic /*b4j.example.vmlabel*/ (_b);
 //BA.debugLineNum = 101;BA.debugLine="Badge.SetStatic(b)";
_badge._setstatic /*b4j.example.vmbadge*/ (_b);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub SetStyle(sm As Map) As VMAvatar";
 //BA.debugLineNum = 332;BA.debugLine="Avatar.SetStyle(sm)";
_avatar._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 551;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 552;BA.debugLine="Avatar.SetStyleSingle(prop, value)";
_avatar._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 553;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 554;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 534;BA.debugLine="Sub SetTabIndex(ti As String) As VMAvatar";
 //BA.debugLineNum = 535;BA.debugLine="Avatar.SetTabIndex(ti)";
_avatar._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 536;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 537;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _settext(String _text,anywheresoftware.b4a.objects.collections.Map _props,anywheresoftware.b4a.objects.collections.List _classes,anywheresoftware.b4a.objects.collections.List _attributes) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub SetText(Text As String, props As Map, classes";
 //BA.debugLineNum = 221;BA.debugLine="If Text = \"\" Then Return Me";
if ((_text).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 222;BA.debugLine="hasLabel = True";
_haslabel = __c.True;
 //BA.debugLineNum = 223;BA.debugLine="Label.SetText(Text).SetHeadline(True)";
_label._settext /*b4j.example.vmlabel*/ (_text)._setheadline /*b4j.example.vmlabel*/ (__c.True);
 //BA.debugLineNum = 224;BA.debugLine="Label.BuildModel(props,Null, classes, attributes)";
_label._buildmodel /*b4j.example.vmlabel*/ (_props,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__c.Null)),_classes,_attributes);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 577;BA.debugLine="Sub SetTextColor(varColor As String) As VMAvatar";
 //BA.debugLineNum = 578;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 579;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 580;BA.debugLine="Label.AddClass(sColor)";
_label._addclass /*b4j.example.vmlabel*/ (_scolor);
 //BA.debugLineNum = 581;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 582;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 585;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 586;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 587;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 588;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 589;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 590;BA.debugLine="Label.AddClass(mcolor)";
_label._addclass /*b4j.example.vmlabel*/ (_mcolor);
 //BA.debugLineNum = 591;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 592;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _settextonly(String _text) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetTextOnly(Text As String) As VMAvatar";
 //BA.debugLineNum = 229;BA.debugLine="If Text = \"\" Then Return Me";
if ((_text).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 230;BA.debugLine="hasLabel = True";
_haslabel = __c.True;
 //BA.debugLineNum = 231;BA.debugLine="Label.SetText(Text).SetHeadline(True)";
_label._settext /*b4j.example.vmlabel*/ (_text)._setheadline /*b4j.example.vmlabel*/ (__c.True);
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _settile(boolean _vartile) throws Exception{
String _pp = "";
 //BA.debugLineNum = 461;BA.debugLine="Sub SetTile(varTile As Boolean) As VMAvatar";
 //BA.debugLineNum = 462;BA.debugLine="If varTile = False Then Return Me";
if (_vartile==__c.False) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 463;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 464;BA.debugLine="SetAttrSingle(\"tile\", varTile)";
_setattrsingle("tile",BA.ObjectToString(_vartile));
 //BA.debugLineNum = 465;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 };
 //BA.debugLineNum = 467;BA.debugLine="Dim pp As String = $\"${ID}Tile\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tile");
 //BA.debugLineNum = 468;BA.debugLine="vue.SetStateSingle(pp, varTile)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartile));
 //BA.debugLineNum = 469;BA.debugLine="Avatar.Bind(\":tile\", pp)";
_avatar._bind /*b4j.example.vmelement*/ (":tile",_pp);
 //BA.debugLineNum = 470;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 471;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub SetVIf(vif As String) As VMAvatar";
 //BA.debugLineNum = 292;BA.debugLine="Avatar.SetVIf(vif)";
_avatar._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 571;BA.debugLine="Sub SetVisible(b As Boolean) As VMAvatar";
 //BA.debugLineNum = 572;BA.debugLine="Avatar.SetVisible(b)";
_avatar._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 573;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 574;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub SetVModel(k As String) As VMAvatar";
 //BA.debugLineNum = 287;BA.debugLine="Avatar.SetVModel(k)";
_avatar._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetVShow(vif As String) As VMAvatar";
 //BA.debugLineNum = 297;BA.debugLine="Avatar.SetVShow(vif)";
_avatar._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _show() throws Exception{
 //BA.debugLineNum = 478;BA.debugLine="Sub Show As VMAvatar";
 //BA.debugLineNum = 479;BA.debugLine="Avatar.SetVisible(True)";
_avatar._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 480;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 481;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 270;BA.debugLine="If hasImage Then Image.Pop(Avatar)";
if (_hasimage) { 
_image._pop /*String*/ (_avatar);};
 //BA.debugLineNum = 271;BA.debugLine="If hasIcon Then Icon.Pop(Avatar)";
if (_hasicon) { 
_icon._pop /*String*/ (_avatar);};
 //BA.debugLineNum = 272;BA.debugLine="If hasLabel Then Label.Pop(Avatar)";
if (_haslabel) { 
_label._pop /*String*/ (_avatar);};
 //BA.debugLineNum = 274;BA.debugLine="If hasBadge = False Then";
if (_hasbadge==__c.False) { 
 //BA.debugLineNum = 275;BA.debugLine="Return Avatar.ToString";
if (true) return _avatar._tostring /*String*/ ();
 };
 //BA.debugLineNum = 278;BA.debugLine="If Badge.HasContent Then";
if (_badge._hascontent /*boolean*/ ) { 
 //BA.debugLineNum = 279;BA.debugLine="Badge.AddComponent(Avatar.ToString)";
_badge._addcomponent /*b4j.example.vmbadge*/ (_avatar._tostring /*String*/ ());
 //BA.debugLineNum = 280;BA.debugLine="Return Badge.tostring";
if (true) return _badge._tostring /*String*/ ();
 }else {
 //BA.debugLineNum = 282;BA.debugLine="Return Avatar.ToString";
if (true) return _avatar._tostring /*String*/ ();
 };
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmavatar  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 258;BA.debugLine="Sub UseTheme(themeName As String) As VMAvatar";
 //BA.debugLineNum = 259;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 260;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 261;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 262;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 263;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
