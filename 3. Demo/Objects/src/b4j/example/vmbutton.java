package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmbutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmbutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _button = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _hastooltip = false;
public b4j.example.vmtooltip _tooltip = null;
public b4j.example.vmtemplate _tmpl = null;
public b4j.example.vmlabel _span = null;
public String _txt = "";
public boolean _bstatic = false;
public b4j.example.vmbadge _badge = null;
public String _iconpos = "";
public String _icon = "";
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
public b4j.example.vmbutton  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 393;BA.debugLine="Sub AddChild(child As VMElement) As VMButton";
 //BA.debugLineNum = 394;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 395;BA.debugLine="Button.SetText(childHTML)";
_button._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 423;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 424;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 425;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbutton  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Sub AddClass(c As String) As VMButton";
 //BA.debugLineNum = 406;BA.debugLine="Button.AddClass(c)";
_button._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 407;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub AddComponent(comp As String) As VMButton";
 //BA.debugLineNum = 102;BA.debugLine="Button.SetText(comp)";
_button._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _addicon(String _iconname,String _siconpos,String _icontheme) throws Exception{
b4j.example.vmicon _bicon = null;
 //BA.debugLineNum = 268;BA.debugLine="Sub AddIcon(iconName As String, siconPos As String";
 //BA.debugLineNum = 269;BA.debugLine="If iconName = \"\" Then Return Me";
if ((_iconname).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 270;BA.debugLine="iconPos = siconPos";
_iconpos = _siconpos;
 //BA.debugLineNum = 271;BA.debugLine="Dim bicon As VMIcon";
_bicon = new b4j.example.vmicon();
 //BA.debugLineNum = 272;BA.debugLine="bicon.Initialize(vue, $\"${ID}icon\"$, Module)";
_bicon._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"icon"),_module);
 //BA.debugLineNum = 273;BA.debugLine="bicon.SetStatic(bStatic)";
_bicon._setstatic /*b4j.example.vmicon*/ (_bstatic);
 //BA.debugLineNum = 274;BA.debugLine="bicon.SetDesignMode(DesignMode)";
_bicon._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 275;BA.debugLine="bicon.SetText(iconName)";
_bicon._settext /*b4j.example.vmicon*/ (_iconname);
 //BA.debugLineNum = 276;BA.debugLine="bicon.SetHasBadge(False)";
_bicon._sethasbadge /*b4j.example.vmicon*/ (__c.False);
 //BA.debugLineNum = 277;BA.debugLine="Select Case iconPos";
switch (BA.switchObjectToInt(_iconpos,"left","right")) {
case 0: {
 //BA.debugLineNum = 279;BA.debugLine="bicon.SetLeft(True)";
_bicon._setleft /*b4j.example.vmicon*/ (__c.True);
 break; }
case 1: {
 //BA.debugLineNum = 281;BA.debugLine="bicon.SetRight(True)";
_bicon._setright /*b4j.example.vmicon*/ (__c.True);
 break; }
}
;
 //BA.debugLineNum = 283;BA.debugLine="If iconTheme <> \"\" Then";
if ((_icontheme).equals("") == false) { 
 //BA.debugLineNum = 284;BA.debugLine="bicon.UseTheme(iconTheme)";
_bicon._usetheme /*b4j.example.vmicon*/ (_icontheme);
 };
 //BA.debugLineNum = 286;BA.debugLine="icon = bicon.tostring";
_icon = _bicon._tostring /*String*/ ();
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _addiconvelse(String _iconname,String _vif,String _theme) throws Exception{
b4j.example.vmicon _bicon = null;
 //BA.debugLineNum = 254;BA.debugLine="Sub AddIconVElse(iconName As String, vif As String";
 //BA.debugLineNum = 255;BA.debugLine="Dim bicon As VMIcon";
_bicon = new b4j.example.vmicon();
 //BA.debugLineNum = 256;BA.debugLine="bicon.Initialize(vue, \"\", Module)";
_bicon._initialize /*b4j.example.vmicon*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 257;BA.debugLine="bicon.SetStatic(bStatic)";
_bicon._setstatic /*b4j.example.vmicon*/ (_bstatic);
 //BA.debugLineNum = 258;BA.debugLine="bicon.SetDesignMode(DesignMode)";
_bicon._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 259;BA.debugLine="bicon.SetText(iconName).setvelse(vif)";
_bicon._settext /*b4j.example.vmicon*/ (_iconname)._setvelse /*b4j.example.vmicon*/ ((Object)(_vif));
 //BA.debugLineNum = 260;BA.debugLine="If theme <> \"\" Then";
if ((_theme).equals("") == false) { 
 //BA.debugLineNum = 261;BA.debugLine="bicon.UseTheme(theme)";
_bicon._usetheme /*b4j.example.vmicon*/ (_theme);
 };
 //BA.debugLineNum = 263;BA.debugLine="bicon.Pop(Button)";
_bicon._pop /*String*/ (_button);
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _addiconvif(String _iconname,String _vif,String _theme) throws Exception{
b4j.example.vmicon _bicon = null;
 //BA.debugLineNum = 240;BA.debugLine="Sub AddIconVIf(iconName As String, vif As String,";
 //BA.debugLineNum = 241;BA.debugLine="Dim bicon As VMIcon";
_bicon = new b4j.example.vmicon();
 //BA.debugLineNum = 242;BA.debugLine="bicon.Initialize(vue, \"\", Module)";
_bicon._initialize /*b4j.example.vmicon*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 243;BA.debugLine="bicon.SetStatic(bStatic)";
_bicon._setstatic /*b4j.example.vmicon*/ (_bstatic);
 //BA.debugLineNum = 244;BA.debugLine="bicon.SetDesignMode(DesignMode)";
_bicon._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 245;BA.debugLine="bicon.SetText(iconName).SetVIf(vif)";
_bicon._settext /*b4j.example.vmicon*/ (_iconname)._setvif /*b4j.example.vmicon*/ (_vif);
 //BA.debugLineNum = 246;BA.debugLine="If theme <> \"\" Then";
if ((_theme).equals("") == false) { 
 //BA.debugLineNum = 247;BA.debugLine="bicon.UseTheme(theme)";
_bicon._usetheme /*b4j.example.vmicon*/ (_theme);
 };
 //BA.debugLineNum = 249;BA.debugLine="bicon.Pop(Button)";
_bicon._pop /*String*/ (_button);
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _addtext(String _stxt) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub AddText(stxt As String) As VMButton";
 //BA.debugLineNum = 228;BA.debugLine="Button.SetText(stxt)";
_button._settext /*b4j.example.vmelement*/ (_stxt);
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 1084;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 1085;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 1086;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbutton  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 1030;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 1031;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 1032;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 1033;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 1034;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 1088;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 1089;BA.debugLine="Button.BuildModel(mprops, mstyles, lclasses, loos";
_button._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 1090;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 1091;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Button As VMElement";
_button = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private hasToolTip As Boolean";
_hastooltip = false;
 //BA.debugLineNum = 10;BA.debugLine="Private tooltip As VMToolTip";
_tooltip = new b4j.example.vmtooltip();
 //BA.debugLineNum = 11;BA.debugLine="Private tmpl As VMTemplate";
_tmpl = new b4j.example.vmtemplate();
 //BA.debugLineNum = 12;BA.debugLine="Private span As VMLabel";
_span = new b4j.example.vmlabel();
 //BA.debugLineNum = 13;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 14;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 15;BA.debugLine="Public Badge As VMBadge";
_badge = new b4j.example.vmbadge();
 //BA.debugLineNum = 16;BA.debugLine="Private iconPos As String";
_iconpos = "";
 //BA.debugLineNum = 17;BA.debugLine="Private icon As String";
_icon = "";
 //BA.debugLineNum = 18;BA.debugLine="Private hasBadge As Boolean";
_hasbadge = false;
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbutton  _disable() throws Exception{
 //BA.debugLineNum = 1023;BA.debugLine="Sub Disable As VMButton";
 //BA.debugLineNum = 1024;BA.debugLine="Button.Enable(False)";
_button._enable /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 1025;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 1026;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _enable() throws Exception{
 //BA.debugLineNum = 1018;BA.debugLine="Sub Enable As VMButton";
 //BA.debugLineNum = 1019;BA.debugLine="Button.Enable(True)";
_button._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1020;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 1021;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _hide() throws Exception{
 //BA.debugLineNum = 1008;BA.debugLine="Sub Hide As VMButton";
 //BA.debugLineNum = 1009;BA.debugLine="Button.SetVisible(False)";
_button._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 1010;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 1011;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 23;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 24;BA.debugLine="Button.Initialize(v, ID)";
_button._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 25;BA.debugLine="Button.SetTag(\"v-btn\")";
_button._settag /*b4j.example.vmelement*/ ("v-btn");
 //BA.debugLineNum = 26;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 27;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 28;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 30;BA.debugLine="SetOnClick($\"${ID}_click\"$)";
_setonclick((""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 31;BA.debugLine="hasToolTip = False";
_hastooltip = __c.False;
 //BA.debugLineNum = 32;BA.debugLine="tooltip.Initialize(vue, $\"${ID}tt\"$, Module)";
_tooltip._initialize /*b4j.example.vmtooltip*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tt"),_module);
 //BA.debugLineNum = 33;BA.debugLine="tmpl.Initialize(vue, $\"${ID}tmp\"$, Module)";
_tmpl._initialize /*b4j.example.vmtemplate*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tmp"),_module);
 //BA.debugLineNum = 34;BA.debugLine="tmpl.SetAttrSingle(\"v-slot:activator\", \"{ on }\")";
_tmpl._setattrsingle /*b4j.example.vmtemplate*/ ("v-slot:activator","{ on }");
 //BA.debugLineNum = 35;BA.debugLine="span.Initialize(vue, $\"${ID}span\"$)";
_span._initialize /*b4j.example.vmlabel*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"span"));
 //BA.debugLineNum = 36;BA.debugLine="span.SetSpan";
_span._setspan /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 37;BA.debugLine="Button.typeOf = \"button\"";
_button._typeof /*String*/  = "button";
 //BA.debugLineNum = 38;BA.debugLine="Badge.Initialize(vue, $\"${ID}badge\"$, Module)";
_badge._initialize /*b4j.example.vmbadge*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"badge"),_module);
 //BA.debugLineNum = 39;BA.debugLine="txt = \"\"";
_txt = "";
 //BA.debugLineNum = 40;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 41;BA.debugLine="icon = \"\"";
_icon = "";
 //BA.debugLineNum = 42;BA.debugLine="iconPos = \"\"";
_iconpos = "";
 //BA.debugLineNum = 43;BA.debugLine="hasBadge = False";
_hasbadge = __c.False;
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 400;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 401;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbutton  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 1037;BA.debugLine="public Sub RemoveAttr(sName As String) As VMButton";
 //BA.debugLineNum = 1038;BA.debugLine="Button.RemoveAttr(sName)";
_button._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 1039;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 1040;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 388;BA.debugLine="Sub Render";
 //BA.debugLineNum = 389;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbutton  _setabsolute(boolean _varabsolute) throws Exception{
String _pp = "";
 //BA.debugLineNum = 430;BA.debugLine="Sub SetAbsolute(varAbsolute As Boolean) As VMButto";
 //BA.debugLineNum = 431;BA.debugLine="If varAbsolute = False Then Return Me";
if (_varabsolute==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 432;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 433;BA.debugLine="Button.SetAttrSingle(\"absolute\", varAbsolute)";
_button._setattrsingle /*b4j.example.vmelement*/ ("absolute",BA.ObjectToString(_varabsolute));
 //BA.debugLineNum = 434;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 436;BA.debugLine="Dim pp As String = $\"${ID}Absolute\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Absolute");
 //BA.debugLineNum = 437;BA.debugLine="vue.SetStateSingle(pp, varAbsolute)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varabsolute));
 //BA.debugLineNum = 438;BA.debugLine="Button.Bind(\":absolute\", pp)";
_button._bind /*b4j.example.vmelement*/ (":absolute",_pp);
 //BA.debugLineNum = 439;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 440;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetAccent(b As Boolean) As VMButton";
 //BA.debugLineNum = 309;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 310;BA.debugLine="SetColor(\"error\")";
_setcolor("error");
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 443;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 444;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 445;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 446;BA.debugLine="Button.SetAttrSingle(\"active-class\", varActiveCl";
_button._setattrsingle /*b4j.example.vmelement*/ ("active-class",_varactiveclass);
 //BA.debugLineNum = 447;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 449;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 450;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 451;BA.debugLine="Button.Bind(\":active-class\", pp)";
_button._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 452;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 453;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setappend(boolean _varappend) throws Exception{
String _pp = "";
 //BA.debugLineNum = 456;BA.debugLine="Sub SetAppend(varAppend As Boolean) As VMButton";
 //BA.debugLineNum = 457;BA.debugLine="If varAppend = False Then Return Me";
if (_varappend==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 458;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 459;BA.debugLine="Button.SetAttrSingle(\"append\", varAppend)";
_button._setattrsingle /*b4j.example.vmelement*/ ("append",BA.ObjectToString(_varappend));
 //BA.debugLineNum = 460;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 462;BA.debugLine="Dim pp As String = $\"${ID}Append\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Append");
 //BA.debugLineNum = 463;BA.debugLine="vue.SetStateSingle(pp, varAppend)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varappend));
 //BA.debugLineNum = 464;BA.debugLine="Button.Bind(\":append\", pp)";
_button._bind /*b4j.example.vmelement*/ (":append",_pp);
 //BA.debugLineNum = 465;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 466;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setatclick(String _btnclick) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetAtClick(btnClick As String) As VMButton";
 //BA.debugLineNum = 144;BA.debugLine="SetAttrSingle(\"@click\", btnClick)";
_setattrsingle("@click",_btnclick);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Sub SetAttr(attr As Map) As VMButton";
 //BA.debugLineNum = 412;BA.debugLine="Button.SetAttr(attr)";
_button._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 413;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 136;BA.debugLine="Sub SetAttributes(attrs As List) As VMButton";
 //BA.debugLineNum = 137;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 138;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetAttrLoose(loose As String) As VMButton";
 //BA.debugLineNum = 149;BA.debugLine="Button.SetAttrLoose(loose)";
_button._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1079;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 1080;BA.debugLine="Button.SetAttrSingle(prop, value)";
_button._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 1081;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 1082;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbadge(String _bvalue) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetBadge(bvalue As String) As VMButton";
 //BA.debugLineNum = 60;BA.debugLine="Badge.SetContent(bvalue)";
_badge._setcontent /*b4j.example.vmbadge*/ (_bvalue);
 //BA.debugLineNum = 61;BA.debugLine="Badge.SetBordered(True)";
_badge._setbordered /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 62;BA.debugLine="Badge.SetOverlap(True)";
_badge._setoverlap /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 63;BA.debugLine="Badge.SetColorIntensity(vue.COLOR_CYAN, vue.INTEN";
_badge._setcolorintensity /*b4j.example.vmbadge*/ (_vue._color_cyan /*String*/ ,_vue._intensity_normal /*String*/ );
 //BA.debugLineNum = 64;BA.debugLine="Badge.SetAvatar(True)";
_badge._setavatar /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 65;BA.debugLine="Badge.SetIcon(\"\")";
_badge._seticon /*b4j.example.vmbadge*/ ("");
 //BA.debugLineNum = 66;BA.debugLine="Badge.SetDot(False)";
_badge._setdot /*b4j.example.vmbadge*/ (__c.False);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setblock(boolean _varblock) throws Exception{
String _pp = "";
 //BA.debugLineNum = 469;BA.debugLine="Sub SetBlock(varBlock As Boolean) As VMButton";
 //BA.debugLineNum = 470;BA.debugLine="If varBlock = False Then Return Me";
if (_varblock==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 471;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 472;BA.debugLine="Button.SetAttrSingle(\"block\", varBlock)";
_button._setattrsingle /*b4j.example.vmelement*/ ("block",BA.ObjectToString(_varblock));
 //BA.debugLineNum = 473;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 475;BA.debugLine="Dim pp As String = $\"${ID}Block\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Block");
 //BA.debugLineNum = 476;BA.debugLine="vue.SetStateSingle(pp, varBlock)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varblock));
 //BA.debugLineNum = 477;BA.debugLine="Button.Bind(\":block\", pp)";
_button._bind /*b4j.example.vmelement*/ (":block",_pp);
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbottom(boolean _varbottom) throws Exception{
String _pp = "";
 //BA.debugLineNum = 482;BA.debugLine="Sub SetBottom(varBottom As Boolean) As VMButton";
 //BA.debugLineNum = 483;BA.debugLine="If varBottom = False Then Return Me";
if (_varbottom==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 484;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 485;BA.debugLine="Button.Setattrsingle(\"bottom\", varBottom)";
_button._setattrsingle /*b4j.example.vmelement*/ ("bottom",BA.ObjectToString(_varbottom));
 //BA.debugLineNum = 486;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 488;BA.debugLine="Dim pp As String = $\"${ID}Bottom\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Bottom");
 //BA.debugLineNum = 489;BA.debugLine="vue.SetStateSingle(pp, varBottom)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbottom));
 //BA.debugLineNum = 490;BA.debugLine="Button.Bind(\":bottom\", pp)";
_button._bind /*b4j.example.vmelement*/ (":bottom",_pp);
 //BA.debugLineNum = 491;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 492;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbottomleft(boolean _b) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SetBottomLeft(b As Boolean) As VMButton";
 //BA.debugLineNum = 202;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 203;BA.debugLine="SetBottom(True)";
_setbottom(__c.True);
 //BA.debugLineNum = 204;BA.debugLine="SetLeft(True)";
_setleft(__c.True);
 //BA.debugLineNum = 205;BA.debugLine="SetAbsolute(True)";
_setabsolute(__c.True);
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbottomright(boolean _b) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetBottomRight(b As Boolean) As VMButton";
 //BA.debugLineNum = 194;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 195;BA.debugLine="SetBottom(True)";
_setbottom(__c.True);
 //BA.debugLineNum = 196;BA.debugLine="SetRight(True)";
_setright(__c.True);
 //BA.debugLineNum = 197;BA.debugLine="SetAbsolute(True)";
_setabsolute(__c.True);
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setcenteronparent(boolean _b) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetCenterOnParent(b As Boolean) As VMButton";
 //BA.debugLineNum = 72;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 73;BA.debugLine="Button.CenterOnParent = True";
_button._centeronparent /*boolean*/  = __c.True;
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 513;BA.debugLine="Sub SetColor(varColor As String) As VMButton";
 //BA.debugLineNum = 514;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 515;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 516;BA.debugLine="Button.SetAttrSingle(\"color\", varColor)";
_button._setattrsingle /*b4j.example.vmelement*/ ("color",_varcolor);
 //BA.debugLineNum = 517;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 519;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 520;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 521;BA.debugLine="Button.Bind(\":color\", pp)";
_button._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 526;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 527;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 528;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 529;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 530;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 531;BA.debugLine="Button.SetAttrSingle(\"color\", scolor)";
_button._setattrsingle /*b4j.example.vmelement*/ ("color",_scolor);
 //BA.debugLineNum = 532;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 534;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 535;BA.debugLine="Button.Bind(\":color\", pp)";
_button._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 536;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 537;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setdark(boolean _vardark) throws Exception{
 //BA.debugLineNum = 540;BA.debugLine="Sub SetDark(varDark As Boolean) As VMButton";
 //BA.debugLineNum = 541;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 542;BA.debugLine="Button.SetAttrLoose(\"dark\")";
_button._setattrloose /*b4j.example.vmelement*/ ("dark");
 //BA.debugLineNum = 543;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 544;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 48;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setdepressed(boolean _vardepressed) throws Exception{
String _pp = "";
 //BA.debugLineNum = 547;BA.debugLine="Sub SetDepressed(varDepressed As Boolean) As VMBut";
 //BA.debugLineNum = 548;BA.debugLine="If varDepressed = False Then Return Me";
if (_vardepressed==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 549;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 550;BA.debugLine="Button.SetAttrSingle(\"depressed\", varDepressed)";
_button._setattrsingle /*b4j.example.vmelement*/ ("depressed",BA.ObjectToString(_vardepressed));
 //BA.debugLineNum = 551;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 553;BA.debugLine="Dim pp As String = $\"${ID}Depressed\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Depressed");
 //BA.debugLineNum = 554;BA.debugLine="vue.SetStateSingle(pp, varDepressed)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardepressed));
 //BA.debugLineNum = 555;BA.debugLine="Button.Bind(\":depressed\", pp)";
_button._bind /*b4j.example.vmelement*/ (":depressed",_pp);
 //BA.debugLineNum = 556;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 557;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 1053;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMButton";
 //BA.debugLineNum = 1054;BA.debugLine="Button.SetDesignMode(b)";
_button._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 1055;BA.debugLine="tooltip.SetDesignMode(b)";
_tooltip._setdesignmode /*b4j.example.vmtooltip*/ (_b);
 //BA.debugLineNum = 1056;BA.debugLine="tmpl.SetDesignMode(b)";
_tmpl._setdesignmode /*b4j.example.vmtemplate*/ (_b);
 //BA.debugLineNum = 1057;BA.debugLine="span.SetDesignMode(b)";
_span._setdesignmode /*b4j.example.vmlabel*/ (_b);
 //BA.debugLineNum = 1058;BA.debugLine="Badge.SetDesignMode(b)";
_badge._setdesignmode /*b4j.example.vmbadge*/ (_b);
 //BA.debugLineNum = 1059;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 1060;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 1061;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 114;BA.debugLine="Button.SetDeviceOffsets(OS, OM, OL, OX)";
_button._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 126;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 127;BA.debugLine="SetDeviceSizes(small, medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 120;BA.debugLine="Button.SetDeviceSizes(SS, SM, SL, SX)";
_button._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 560;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMButto";
 //BA.debugLineNum = 561;BA.debugLine="Button.SetDisabled(varDisabled)";
_button._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 562;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setelevation(String _varelevation) throws Exception{
String _pp = "";
 //BA.debugLineNum = 566;BA.debugLine="Sub SetElevation(varElevation As String) As VMButt";
 //BA.debugLineNum = 567;BA.debugLine="If varElevation = \"\" Then Return Me";
if ((_varelevation).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 568;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 569;BA.debugLine="Button.SetAttrSingle(\"elevation\", varElevation)";
_button._setattrsingle /*b4j.example.vmelement*/ ("elevation",_varelevation);
 //BA.debugLineNum = 570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 572;BA.debugLine="Dim pp As String = $\"${ID}Elevation\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Elevation");
 //BA.debugLineNum = 573;BA.debugLine="vue.SetStateSingle(pp, varElevation)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varelevation));
 //BA.debugLineNum = 574;BA.debugLine="Button.Bind(\":elevation\", pp)";
_button._bind /*b4j.example.vmelement*/ (":elevation",_pp);
 //BA.debugLineNum = 575;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 576;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setexact(boolean _varexact) throws Exception{
String _pp = "";
 //BA.debugLineNum = 579;BA.debugLine="Sub SetExact(varExact As Boolean) As VMButton";
 //BA.debugLineNum = 580;BA.debugLine="If varExact = False Then Return Me";
if (_varexact==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 581;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 582;BA.debugLine="Button.SetAttrSingle(\"exact\", varExact)";
_button._setattrsingle /*b4j.example.vmelement*/ ("exact",BA.ObjectToString(_varexact));
 //BA.debugLineNum = 583;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 585;BA.debugLine="Dim pp As String = $\"${ID}Exact\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Exact");
 //BA.debugLineNum = 586;BA.debugLine="vue.SetStateSingle(pp, varExact)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexact));
 //BA.debugLineNum = 587;BA.debugLine="Button.Bind(\":exact\", pp)";
_button._bind /*b4j.example.vmelement*/ (":exact",_pp);
 //BA.debugLineNum = 588;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 589;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setexactactiveclass(String _varexactactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 592;BA.debugLine="Sub SetExactActiveClass(varExactActiveClass As Str";
 //BA.debugLineNum = 593;BA.debugLine="If varExactActiveClass = \"\" Then Return Me";
if ((_varexactactiveclass).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 594;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 595;BA.debugLine="Button.SetAttrSIngle(\"exact-active-class\", varEx";
_button._setattrsingle /*b4j.example.vmelement*/ ("exact-active-class",_varexactactiveclass);
 //BA.debugLineNum = 596;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 598;BA.debugLine="Dim pp As String = $\"${ID}ExactActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ExactActiveClass");
 //BA.debugLineNum = 599;BA.debugLine="vue.SetStateSingle(pp, varExactActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexactactiveclass));
 //BA.debugLineNum = 600;BA.debugLine="Button.Bind(\":exact-active-class\", pp)";
_button._bind /*b4j.example.vmelement*/ (":exact-active-class",_pp);
 //BA.debugLineNum = 601;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 602;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfab(boolean _varfab) throws Exception{
 //BA.debugLineNum = 605;BA.debugLine="Sub SetFab(varFab As Boolean) As VMButton";
 //BA.debugLineNum = 606;BA.debugLine="If varFab = False Then Return Me";
if (_varfab==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 607;BA.debugLine="Button.SetAttrLoose(\"fab\")";
_button._setattrloose /*b4j.example.vmelement*/ ("fab");
 //BA.debugLineNum = 608;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 609;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfabbutton(String _iconname) throws Exception{
b4j.example.vmicon _bicon = null;
 //BA.debugLineNum = 211;BA.debugLine="Sub SetFABButton(iconName As String) As VMButton";
 //BA.debugLineNum = 212;BA.debugLine="If iconName = \"\" Then Return Me";
if ((_iconname).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 213;BA.debugLine="SetFab(True)";
_setfab(__c.True);
 //BA.debugLineNum = 214;BA.debugLine="SetDark(True)";
_setdark(__c.True);
 //BA.debugLineNum = 215;BA.debugLine="Dim bicon As VMIcon";
_bicon = new b4j.example.vmicon();
 //BA.debugLineNum = 216;BA.debugLine="bicon.Initialize(vue, $\"${ID}icon\"$, Module)";
_bicon._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"icon"),_module);
 //BA.debugLineNum = 217;BA.debugLine="bicon.SetStatic(bStatic)";
_bicon._setstatic /*b4j.example.vmicon*/ (_bstatic);
 //BA.debugLineNum = 218;BA.debugLine="bicon.SetDesignMode(DesignMode)";
_bicon._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 219;BA.debugLine="bicon.SetText(iconName)";
_bicon._settext /*b4j.example.vmicon*/ (_iconname);
 //BA.debugLineNum = 220;BA.debugLine="bicon.Pop(Button)";
_bicon._pop /*String*/ (_button);
 //BA.debugLineNum = 221;BA.debugLine="iconPos = \"\"";
_iconpos = "";
 //BA.debugLineNum = 222;BA.debugLine="txt = \"\"";
_txt = "";
 //BA.debugLineNum = 223;BA.debugLine="icon = \"\"";
_icon = "";
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfixed(boolean _varfixed) throws Exception{
String _pp = "";
 //BA.debugLineNum = 612;BA.debugLine="Sub SetFixed(varFixed As Boolean) As VMButton";
 //BA.debugLineNum = 613;BA.debugLine="If varFixed = False Then Return Me";
if (_varfixed==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 614;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 615;BA.debugLine="Button.SetAttrSingle(\"fixed\", varFixed)";
_button._setattrsingle /*b4j.example.vmelement*/ ("fixed",BA.ObjectToString(_varfixed));
 //BA.debugLineNum = 616;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 618;BA.debugLine="Dim pp As String = $\"${ID}Fixed\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Fixed");
 //BA.debugLineNum = 619;BA.debugLine="vue.SetStateSingle(pp, varFixed)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfixed));
 //BA.debugLineNum = 620;BA.debugLine="Button.Bind(\":fixed\", pp)";
_button._bind /*b4j.example.vmelement*/ (":fixed",_pp);
 //BA.debugLineNum = 621;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 622;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _sethasbadge(boolean _b) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetHasBadge(b As Boolean) As VMButton";
 //BA.debugLineNum = 54;BA.debugLine="hasBadge = b";
_hasbadge = _b;
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 625;BA.debugLine="Sub SetHeight(varHeight As String) As VMButton";
 //BA.debugLineNum = 626;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 627;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 628;BA.debugLine="Button.SetAttrSingle(\"height\", varHeight)";
_button._setattrsingle /*b4j.example.vmelement*/ ("height",_varheight);
 //BA.debugLineNum = 629;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 631;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 632;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 633;BA.debugLine="Button.Bind(\":height\", pp)";
_button._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 634;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 635;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _sethref(String _varhref) throws Exception{
 //BA.debugLineNum = 638;BA.debugLine="Sub SetHref(varHref As String) As VMButton";
 //BA.debugLineNum = 639;BA.debugLine="If varHref = \"\" Then Return Me";
if ((_varhref).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 640;BA.debugLine="Button.SetAttrSingle(\"href\", varHref)";
_button._setattrsingle /*b4j.example.vmelement*/ ("href",_varhref);
 //BA.debugLineNum = 641;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 642;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _seticon(boolean _varicon) throws Exception{
 //BA.debugLineNum = 645;BA.debugLine="Sub SetIcon(varIcon As Boolean) As VMButton";
 //BA.debugLineNum = 646;BA.debugLine="If varIcon = False Then Return Me";
if (_varicon==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 647;BA.debugLine="Button.SetAttrSingle(\"icon\", varIcon)";
_button._setattrsingle /*b4j.example.vmelement*/ ("icon",BA.ObjectToString(_varicon));
 //BA.debugLineNum = 648;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 649;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _seticonbutton(String _iconname) throws Exception{
b4j.example.vmicon _bicon = null;
 //BA.debugLineNum = 154;BA.debugLine="Sub SetIconButton(iconName As String) As VMButton";
 //BA.debugLineNum = 155;BA.debugLine="If iconName = \"\" Then Return Me";
if ((_iconname).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 156;BA.debugLine="SetIcon(True)";
_seticon(__c.True);
 //BA.debugLineNum = 157;BA.debugLine="Dim bicon As VMIcon";
_bicon = new b4j.example.vmicon();
 //BA.debugLineNum = 158;BA.debugLine="bicon.Initialize(vue, $\"${ID}icon\"$, Module)";
_bicon._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"icon"),_module);
 //BA.debugLineNum = 159;BA.debugLine="bicon.SetStatic(bStatic)";
_bicon._setstatic /*b4j.example.vmicon*/ (_bstatic);
 //BA.debugLineNum = 160;BA.debugLine="bicon.SetDesignMode(DesignMode)";
_bicon._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 161;BA.debugLine="bicon.SetText(iconName)";
_bicon._settext /*b4j.example.vmicon*/ (_iconname);
 //BA.debugLineNum = 162;BA.debugLine="bicon.Pop(Button)";
_bicon._pop /*String*/ (_button);
 //BA.debugLineNum = 163;BA.debugLine="txt = \"\"";
_txt = "";
 //BA.debugLineNum = 164;BA.debugLine="iconPos = \"\"";
_iconpos = "";
 //BA.debugLineNum = 165;BA.debugLine="icon = \"\"";
_icon = "";
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setinputvalue(String _varinputvalue) throws Exception{
 //BA.debugLineNum = 652;BA.debugLine="Sub SetInputValue(varInputValue As String) As VMBu";
 //BA.debugLineNum = 653;BA.debugLine="If varInputValue = \"\" Then Return Me";
if ((_varinputvalue).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 654;BA.debugLine="Button.SetAttrSingle(\"input-value\", varInputValue";
_button._setattrsingle /*b4j.example.vmelement*/ ("input-value",_varinputvalue);
 //BA.debugLineNum = 655;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 656;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setistext(boolean _b) throws Exception{
 //BA.debugLineNum = 934;BA.debugLine="Sub SetIsText(b As Boolean) As VMButton";
 //BA.debugLineNum = 935;BA.debugLine="SetTransparent(b)";
_settransparent(_b);
 //BA.debugLineNum = 936;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 937;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setlabel(String _vartext) throws Exception{
 //BA.debugLineNum = 864;BA.debugLine="Sub SetLabel(varText As String) As VMButton";
 //BA.debugLineNum = 865;BA.debugLine="SetText(varText)";
_settext(_vartext);
 //BA.debugLineNum = 866;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 867;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setlarge(boolean _varlarge) throws Exception{
 //BA.debugLineNum = 659;BA.debugLine="Sub SetLarge(varLarge As Boolean) As VMButton";
 //BA.debugLineNum = 660;BA.debugLine="If varLarge = False Then Return Me";
if (_varlarge==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 661;BA.debugLine="Button.SetAttrSIngle(\"large\", varLarge)";
_button._setattrsingle /*b4j.example.vmelement*/ ("large",BA.ObjectToString(_varlarge));
 //BA.debugLineNum = 662;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 663;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setleft(boolean _varleft) throws Exception{
 //BA.debugLineNum = 666;BA.debugLine="Sub SetLeft(varLeft As Boolean) As VMButton";
 //BA.debugLineNum = 667;BA.debugLine="If varLeft = False Then Return Me";
if (_varleft==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 668;BA.debugLine="Button.SetAttrLoose(\"left\")";
_button._setattrloose /*b4j.example.vmelement*/ ("left");
 //BA.debugLineNum = 669;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 670;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 673;BA.debugLine="Sub SetLight(varLight As Boolean) As VMButton";
 //BA.debugLineNum = 674;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 675;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 676;BA.debugLine="Button.SetAttrsingle(\"light\", varLight)";
_button._setattrsingle /*b4j.example.vmelement*/ ("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 677;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 679;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 680;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 681;BA.debugLine="Button.Bind(\":light\", pp)";
_button._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 682;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 683;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setlink(boolean _varlink) throws Exception{
String _pp = "";
 //BA.debugLineNum = 686;BA.debugLine="Sub SetLink(varLink As Boolean) As VMButton";
 //BA.debugLineNum = 687;BA.debugLine="If varLink = False Then Return Me";
if (_varlink==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 688;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 689;BA.debugLine="Button.SetAttrSIngle(\"link\", varLink)";
_button._setattrsingle /*b4j.example.vmelement*/ ("link",BA.ObjectToString(_varlink));
 //BA.debugLineNum = 690;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 692;BA.debugLine="Dim pp As String = $\"${ID}Link\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Link");
 //BA.debugLineNum = 693;BA.debugLine="vue.SetStateSingle(pp, varLink)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlink));
 //BA.debugLineNum = 694;BA.debugLine="Button.Bind(\":link\", pp)";
_button._bind /*b4j.example.vmelement*/ (":link",_pp);
 //BA.debugLineNum = 695;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 696;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setloading(boolean _varloading) throws Exception{
String _pp = "";
 //BA.debugLineNum = 699;BA.debugLine="Sub SetLoading(varLoading As Boolean) As VMButton";
 //BA.debugLineNum = 700;BA.debugLine="If varLoading = False Then Return Me";
if (_varloading==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 701;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 702;BA.debugLine="Button.SetAttrSingle(\"loading\", varLoading)";
_button._setattrsingle /*b4j.example.vmelement*/ ("loading",BA.ObjectToString(_varloading));
 //BA.debugLineNum = 703;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 705;BA.debugLine="Dim pp As String = $\"${ID}Loading\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Loading");
 //BA.debugLineNum = 706;BA.debugLine="vue.SetStateSingle(pp, varLoading)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloading));
 //BA.debugLineNum = 707;BA.debugLine="Button.Bind(\":loading\", pp)";
_button._bind /*b4j.example.vmelement*/ (":loading",_pp);
 //BA.debugLineNum = 708;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 709;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 1048;BA.debugLine="Sub SetMarginAll(p As String) As VMButton";
 //BA.debugLineNum = 1049;BA.debugLine="Button.setmarginall(p)";
_button._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 1050;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 1051;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setmaxheight(String _varmaxheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 712;BA.debugLine="Sub SetMaxHeight(varMaxHeight As String) As VMButt";
 //BA.debugLineNum = 713;BA.debugLine="If varMaxHeight = \"\" Then Return Me";
if ((_varmaxheight).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 714;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 715;BA.debugLine="Button.SetAttrSingle(\"max-height\", varMaxHeight)";
_button._setattrsingle /*b4j.example.vmelement*/ ("max-height",_varmaxheight);
 //BA.debugLineNum = 716;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 718;BA.debugLine="Dim pp As String = $\"${ID}MaxHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxHeight");
 //BA.debugLineNum = 719;BA.debugLine="vue.SetStateSingle(pp, varMaxHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxheight));
 //BA.debugLineNum = 720;BA.debugLine="Button.Bind(\":max-height\", pp)";
_button._bind /*b4j.example.vmelement*/ (":max-height",_pp);
 //BA.debugLineNum = 721;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 722;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setmaxwidth(String _varmaxwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 725;BA.debugLine="Sub SetMaxWidth(varMaxWidth As String) As VMButton";
 //BA.debugLineNum = 726;BA.debugLine="If varMaxWidth = \"\" Then Return Me";
if ((_varmaxwidth).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 727;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 728;BA.debugLine="Button.SetAttrSIngle(\"max-width\", varMaxWidth)";
_button._setattrsingle /*b4j.example.vmelement*/ ("max-width",_varmaxwidth);
 //BA.debugLineNum = 729;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 731;BA.debugLine="Dim pp As String = $\"${ID}MaxWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxWidth");
 //BA.debugLineNum = 732;BA.debugLine="vue.SetStateSingle(pp, varMaxWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxwidth));
 //BA.debugLineNum = 733;BA.debugLine="Button.Bind(\":max-width\", pp)";
_button._bind /*b4j.example.vmelement*/ (":max-width",_pp);
 //BA.debugLineNum = 734;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 735;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setmenutrigger(boolean _b) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetMenuTrigger(b As Boolean) As VMButton";
 //BA.debugLineNum = 172;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 173;BA.debugLine="Button.SetAttrSingle(\"v-on\",\"on\")";
_button._setattrsingle /*b4j.example.vmelement*/ ("v-on","on");
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setminheight(String _varminheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 738;BA.debugLine="Sub SetMinHeight(varMinHeight As String) As VMButt";
 //BA.debugLineNum = 739;BA.debugLine="If varMinHeight = \"\" Then Return Me";
if ((_varminheight).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 740;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 741;BA.debugLine="Button.SetAttrSingle(\"min-height\", varMinHeight)";
_button._setattrsingle /*b4j.example.vmelement*/ ("min-height",_varminheight);
 //BA.debugLineNum = 742;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 744;BA.debugLine="Dim pp As String = $\"${ID}MinHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinHeight");
 //BA.debugLineNum = 745;BA.debugLine="vue.SetStateSingle(pp, varMinHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminheight));
 //BA.debugLineNum = 746;BA.debugLine="Button.Bind(\":min-height\", pp)";
_button._bind /*b4j.example.vmelement*/ (":min-height",_pp);
 //BA.debugLineNum = 747;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 748;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setminwidth(String _varminwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 751;BA.debugLine="Sub SetMinWidth(varMinWidth As String) As VMButton";
 //BA.debugLineNum = 752;BA.debugLine="If varMinWidth = \"\" Then Return Me";
if ((_varminwidth).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 753;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 754;BA.debugLine="Button.SetAttrSingle(\"min-width\", varMinWidth)";
_button._setattrsingle /*b4j.example.vmelement*/ ("min-width",_varminwidth);
 //BA.debugLineNum = 755;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 757;BA.debugLine="Dim pp As String = $\"${ID}MinWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinWidth");
 //BA.debugLineNum = 758;BA.debugLine="vue.SetStateSingle(pp, varMinWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminwidth));
 //BA.debugLineNum = 759;BA.debugLine="Button.Bind(\":min-width\", pp)";
_button._bind /*b4j.example.vmelement*/ (":min-width",_pp);
 //BA.debugLineNum = 760;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 761;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 1069;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 1070;BA.debugLine="Button.SetName(varName, bbind)";
_button._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 1071;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 1072;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setnuxt(boolean _varnuxt) throws Exception{
 //BA.debugLineNum = 764;BA.debugLine="Sub SetNuxt(varNuxt As Boolean) As VMButton";
 //BA.debugLineNum = 765;BA.debugLine="If varNuxt = False Then Return Me";
if (_varnuxt==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 766;BA.debugLine="Button.SetAttrSingle(\"nuxt\", varNuxt)";
_button._setattrsingle /*b4j.example.vmelement*/ ("nuxt",BA.ObjectToString(_varnuxt));
 //BA.debugLineNum = 767;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 768;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setonclick(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 996;BA.debugLine="Sub SetOnClick(methodName As String) As VMButton";
 //BA.debugLineNum = 997;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 998;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 999;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1000;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1001;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 1003;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1004;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 1005;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setoutlined(boolean _varoutlined) throws Exception{
String _pp = "";
 //BA.debugLineNum = 771;BA.debugLine="Sub SetOutlined(varOutlined As Boolean) As VMButto";
 //BA.debugLineNum = 772;BA.debugLine="If varOutlined = False Then Return Me";
if (_varoutlined==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 773;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 774;BA.debugLine="Button.SetAttrSIngle(\"outlined\", varOutlined)";
_button._setattrsingle /*b4j.example.vmelement*/ ("outlined",BA.ObjectToString(_varoutlined));
 //BA.debugLineNum = 775;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 777;BA.debugLine="Dim pp As String = $\"${ID}Outlined\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Outlined");
 //BA.debugLineNum = 778;BA.debugLine="vue.SetStateSingle(pp, varOutlined)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoutlined));
 //BA.debugLineNum = 779;BA.debugLine="Button.Bind(\":outlined\", pp)";
_button._bind /*b4j.example.vmelement*/ (":outlined",_pp);
 //BA.debugLineNum = 780;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 781;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 1043;BA.debugLine="Sub SetPaddingAll(p As String) As VMButton";
 //BA.debugLineNum = 1044;BA.debugLine="Button.SetPaddingAll(p)";
_button._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 1045;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 1046;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub SetPrimary(b As Boolean) As VMButton";
 //BA.debugLineNum = 303;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 304;BA.debugLine="SetColor(\"primary\")";
_setcolor("primary");
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setraised(boolean _b) throws Exception{
 //BA.debugLineNum = 952;BA.debugLine="Sub SetRaised(b As Boolean) As VMButton";
 //BA.debugLineNum = 953;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 954;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMBut";
 //BA.debugLineNum = 108;BA.debugLine="Button.SetRC(sRow, sCol)";
_button._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setreplace(boolean _varreplace) throws Exception{
String _pp = "";
 //BA.debugLineNum = 784;BA.debugLine="Sub SetReplace(varReplace As Boolean) As VMButton";
 //BA.debugLineNum = 785;BA.debugLine="If varReplace = False Then Return Me";
if (_varreplace==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 786;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 787;BA.debugLine="Button.SetAttrSingle(\"replace\", varReplace)";
_button._setattrsingle /*b4j.example.vmelement*/ ("replace",BA.ObjectToString(_varreplace));
 //BA.debugLineNum = 788;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 790;BA.debugLine="Dim pp As String = $\"${ID}Replace\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Replace");
 //BA.debugLineNum = 791;BA.debugLine="vue.SetStateSingle(pp, varReplace)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreplace));
 //BA.debugLineNum = 792;BA.debugLine="Button.Bind(\":replace\", pp)";
_button._bind /*b4j.example.vmelement*/ (":replace",_pp);
 //BA.debugLineNum = 793;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 794;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setretainfocusonclick(boolean _varretainfocusonclick) throws Exception{
String _pp = "";
 //BA.debugLineNum = 797;BA.debugLine="Sub SetRetainFocusOnClick(varRetainFocusOnClick As";
 //BA.debugLineNum = 798;BA.debugLine="If varRetainFocusOnClick = False Then Return Me";
if (_varretainfocusonclick==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 799;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 800;BA.debugLine="Button.SetAttrSingle(\"retain-focus-on-click\", va";
_button._setattrsingle /*b4j.example.vmelement*/ ("retain-focus-on-click",BA.ObjectToString(_varretainfocusonclick));
 //BA.debugLineNum = 801;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 803;BA.debugLine="Dim pp As String = $\"${ID}RetainFocusOnClick\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"RetainFocusOnClick");
 //BA.debugLineNum = 804;BA.debugLine="vue.SetStateSingle(pp, varRetainFocusOnClick)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varretainfocusonclick));
 //BA.debugLineNum = 805;BA.debugLine="Button.Bind(\":retain-focus-on-click\", pp)";
_button._bind /*b4j.example.vmelement*/ (":retain-focus-on-click",_pp);
 //BA.debugLineNum = 806;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 807;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setright(boolean _varright) throws Exception{
 //BA.debugLineNum = 810;BA.debugLine="Sub SetRight(varRight As Boolean) As VMButton";
 //BA.debugLineNum = 811;BA.debugLine="If varRight = False Then Return Me";
if (_varright==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 812;BA.debugLine="Button.SetAttrLoose(\"right\")";
_button._setattrloose /*b4j.example.vmelement*/ ("right");
 //BA.debugLineNum = 813;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 814;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setripple(boolean _varripple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 817;BA.debugLine="Sub SetRipple(varRipple As Boolean) As VMButton";
 //BA.debugLineNum = 818;BA.debugLine="If varRipple = False Then Return Me";
if (_varripple==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 819;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 820;BA.debugLine="Button.SetAttrSingle(\"ripple\", varRipple)";
_button._setattrsingle /*b4j.example.vmelement*/ ("ripple",BA.ObjectToString(_varripple));
 //BA.debugLineNum = 821;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 823;BA.debugLine="Dim pp As String = $\"${ID}Ripple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Ripple");
 //BA.debugLineNum = 824;BA.debugLine="vue.SetStateSingle(pp, varRipple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varripple));
 //BA.debugLineNum = 825;BA.debugLine="Button.Bind(\":ripple\", pp)";
_button._bind /*b4j.example.vmelement*/ (":ripple",_pp);
 //BA.debugLineNum = 826;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 827;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setrounded(boolean _varrounded) throws Exception{
String _pp = "";
 //BA.debugLineNum = 830;BA.debugLine="Sub SetRounded(varRounded As Boolean) As VMButton";
 //BA.debugLineNum = 831;BA.debugLine="If varRounded = False Then Return Me";
if (_varrounded==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 832;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 833;BA.debugLine="Button.SetAttrSingle(\"rounded\", varRounded)";
_button._setattrsingle /*b4j.example.vmelement*/ ("rounded",BA.ObjectToString(_varrounded));
 //BA.debugLineNum = 834;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 836;BA.debugLine="Dim pp As String = $\"${ID}Rounded\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Rounded");
 //BA.debugLineNum = 837;BA.debugLine="vue.SetStateSingle(pp, varRounded)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varrounded));
 //BA.debugLineNum = 838;BA.debugLine="Button.Bind(\":rounded\", pp)";
_button._bind /*b4j.example.vmelement*/ (":rounded",_pp);
 //BA.debugLineNum = 839;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 840;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setsize(String _varsize) throws Exception{
String _pp = "";
 //BA.debugLineNum = 89;BA.debugLine="Sub SetSize(varSize As String) As VMButton";
 //BA.debugLineNum = 90;BA.debugLine="If varSize = \"\" Then Return Me";
if ((_varsize).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 91;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 92;BA.debugLine="SetAttrSingle(\"size\", varSize)";
_setattrsingle("size",_varsize);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 95;BA.debugLine="Dim pp As String = $\"${ID}Size\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Size");
 //BA.debugLineNum = 96;BA.debugLine="vue.SetStateSingle(pp, varSize)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsize));
 //BA.debugLineNum = 97;BA.debugLine="Button.Bind(\":size\", pp)";
_button._bind /*b4j.example.vmelement*/ (":size",_pp);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setslotloader(boolean _b) throws Exception{
 //BA.debugLineNum = 990;BA.debugLine="Sub SetSlotLoader(b As Boolean) As VMButton    'ig";
 //BA.debugLineNum = 991;BA.debugLine="SetAttr(CreateMap(\"slot\": \"loader\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("loader")}));
 //BA.debugLineNum = 992;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 993;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setsmall(boolean _varsmall) throws Exception{
 //BA.debugLineNum = 843;BA.debugLine="Sub SetSmall(varSmall As Boolean) As VMButton";
 //BA.debugLineNum = 844;BA.debugLine="If varSmall = False Then Return Me";
if (_varsmall==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 845;BA.debugLine="Button.SetAttrsingle(\"small\", varSmall)";
_button._setattrsingle /*b4j.example.vmelement*/ ("small",BA.ObjectToString(_varsmall));
 //BA.debugLineNum = 846;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 847;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setspan(String _vartext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 882;BA.debugLine="Sub SetSpan(varText As String) As VMButton";
 //BA.debugLineNum = 883;BA.debugLine="If DesignMode = True Or bStatic = True Then";
if (_designmode==__c.True || _bstatic==__c.True) { 
 //BA.debugLineNum = 884;BA.debugLine="txt = $\"<span>${varText}</span>\"$";
_txt = ("<span>"+__c.SmartStringFormatter("",(Object)(_vartext))+"</span>");
 }else {
 //BA.debugLineNum = 886;BA.debugLine="Dim pp As String = $\"${ID}label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"label");
 //BA.debugLineNum = 887;BA.debugLine="pp = pp.tolowercase";
_pp = _pp.toLowerCase();
 //BA.debugLineNum = 888;BA.debugLine="vue.SetStateSingle(pp, varText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartext));
 //BA.debugLineNum = 889;BA.debugLine="txt = $\"<span>{{ ${pp} }}</span>\"$";
_txt = ("<span>{{ "+__c.SmartStringFormatter("",(Object)(_pp))+" }}</span>");
 };
 //BA.debugLineNum = 891;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 892;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetStatic(b As Boolean) As VMButton";
 //BA.debugLineNum = 78;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 79;BA.debugLine="Button.SetStatic(b)";
_button._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 80;BA.debugLine="tooltip.setstatic(b)";
_tooltip._setstatic /*b4j.example.vmtooltip*/ (_b);
 //BA.debugLineNum = 81;BA.debugLine="tmpl.setstatic(b)";
_tmpl._setstatic /*b4j.example.vmtemplate*/ (_b);
 //BA.debugLineNum = 82;BA.debugLine="span.SetStatic(b)";
_span._setstatic /*b4j.example.vmlabel*/ (_b);
 //BA.debugLineNum = 83;BA.debugLine="Badge.SetStatic(b)";
_badge._setstatic /*b4j.example.vmbadge*/ (_b);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub SetStyle(sm As Map) As VMButton";
 //BA.debugLineNum = 418;BA.debugLine="Button.SetStyle(sm)";
_button._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1074;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 1075;BA.debugLine="Button.SetStyleSingle(prop, value)";
_button._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 1076;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 1077;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 1063;BA.debugLine="Sub SetTabIndex(ti As String) As VMButton";
 //BA.debugLineNum = 1064;BA.debugLine="Button.SetTabIndex(ti)";
_button._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 1065;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 1066;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settag(String _vartag) throws Exception{
 //BA.debugLineNum = 850;BA.debugLine="Sub SetTag(varTag As String) As VMButton";
 //BA.debugLineNum = 851;BA.debugLine="If varTag = \"\" Then Return Me";
if ((_vartag).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 852;BA.debugLine="Button.SetAttrSingle(\"tag\", varTag)";
_button._setattrsingle /*b4j.example.vmelement*/ ("tag",_vartag);
 //BA.debugLineNum = 853;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 854;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settarget(String _vartarget) throws Exception{
 //BA.debugLineNum = 857;BA.debugLine="Sub SetTarget(varTarget As String) As VMButton";
 //BA.debugLineNum = 858;BA.debugLine="If varTarget = \"\" Then Return Me";
if ((_vartarget).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 859;BA.debugLine="Button.SetAttrSingle(\"target\", varTarget)";
_button._setattrsingle /*b4j.example.vmelement*/ ("target",_vartarget);
 //BA.debugLineNum = 860;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 861;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settext(String _vartext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 870;BA.debugLine="private Sub SetText(varText As String) As VMButton";
 //BA.debugLineNum = 871;BA.debugLine="If DesignMode = True Or bStatic = True Then";
if (_designmode==__c.True || _bstatic==__c.True) { 
 //BA.debugLineNum = 872;BA.debugLine="txt = varText";
_txt = _vartext;
 }else {
 //BA.debugLineNum = 874;BA.debugLine="Dim pp As String = $\"${ID}label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"label");
 //BA.debugLineNum = 875;BA.debugLine="pp = pp.tolowercase";
_pp = _pp.toLowerCase();
 //BA.debugLineNum = 876;BA.debugLine="vue.SetStateSingle(pp, varText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartext));
 //BA.debugLineNum = 877;BA.debugLine="txt = $\"{{ ${pp} }}\"$";
_txt = ("{{ "+__c.SmartStringFormatter("",(Object)(_pp))+" }}");
 };
 //BA.debugLineNum = 879;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 880;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 495;BA.debugLine="Sub SetTextColor(varColor As String) As VMButton";
 //BA.debugLineNum = 496;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 497;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 498;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 499;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 500;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 503;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 504;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 505;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 506;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 507;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 508;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 509;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 510;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settile(boolean _vartile) throws Exception{
String _pp = "";
 //BA.debugLineNum = 895;BA.debugLine="Sub SetTile(varTile As Boolean) As VMButton";
 //BA.debugLineNum = 896;BA.debugLine="If varTile = False Then Return Me";
if (_vartile==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 897;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 898;BA.debugLine="Button.SetAttrSingle(\"tile\", varTile)";
_button._setattrsingle /*b4j.example.vmelement*/ ("tile",BA.ObjectToString(_vartile));
 //BA.debugLineNum = 899;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 901;BA.debugLine="Dim pp As String = $\"${ID}Tile\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tile");
 //BA.debugLineNum = 902;BA.debugLine="vue.SetStateSingle(pp, varTile)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartile));
 //BA.debugLineNum = 903;BA.debugLine="Button.Bind(\":tile\", pp)";
_button._bind /*b4j.example.vmelement*/ (":tile",_pp);
 //BA.debugLineNum = 904;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 905;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setto(String _varto) throws Exception{
 //BA.debugLineNum = 908;BA.debugLine="Sub SetTo(varTo As String) As VMButton";
 //BA.debugLineNum = 909;BA.debugLine="If varTo = \"\" Then Return Me";
if ((_varto).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 910;BA.debugLine="Button.SetAttrSingle(\"to\", varTo)";
_button._setattrsingle /*b4j.example.vmelement*/ ("to",_varto);
 //BA.debugLineNum = 911;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 912;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settoggleicons(String _vmodel,String _vificon,String _velseicon) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub SetToggleIcons(vmodel As String, vifIcon As St";
 //BA.debugLineNum = 233;BA.debugLine="vmodel = vmodel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 234;BA.debugLine="AddIconVIf(vifIcon, vmodel, \"\")";
_addiconvif(_vificon,_vmodel,"");
 //BA.debugLineNum = 235;BA.debugLine="AddIconVElse(velseIcon, vmodel, \"\")";
_addiconvelse(_velseicon,_vmodel,"");
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SetTooltip(tt As String) As VMButton";
 //BA.debugLineNum = 315;BA.debugLine="If tt = \"\" Then Return Me";
if ((_tt).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 316;BA.debugLine="hasToolTip = True";
_hastooltip = __c.True;
 //BA.debugLineNum = 317;BA.debugLine="tooltip.SetBottom(True)";
_tooltip._setbottom /*b4j.example.vmtooltip*/ (__c.True);
 //BA.debugLineNum = 318;BA.debugLine="Button.SetAttrSingle(\"v-on\", \"on\")";
_button._setattrsingle /*b4j.example.vmelement*/ ("v-on","on");
 //BA.debugLineNum = 319;BA.debugLine="span.SetText(tt)";
_span._settext /*b4j.example.vmlabel*/ (_tt);
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settop(boolean _vartop) throws Exception{
String _pp = "";
 //BA.debugLineNum = 915;BA.debugLine="Sub SetTop(varTop As Boolean) As VMButton";
 //BA.debugLineNum = 916;BA.debugLine="If varTop = False Then Return Me";
if (_vartop==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 917;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 918;BA.debugLine="Button.SetAttrSingle(\"top\", varTop)";
_button._setattrsingle /*b4j.example.vmelement*/ ("top",BA.ObjectToString(_vartop));
 //BA.debugLineNum = 919;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 921;BA.debugLine="Dim pp As String = $\"${ID}Top\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Top");
 //BA.debugLineNum = 922;BA.debugLine="vue.SetStateSingle(pp, varTop)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartop));
 //BA.debugLineNum = 923;BA.debugLine="Button.Bind(\":top\", pp)";
_button._bind /*b4j.example.vmelement*/ (":top",_pp);
 //BA.debugLineNum = 924;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 925;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settopleft(boolean _b) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetTopLeft(b As Boolean) As VMButton";
 //BA.debugLineNum = 186;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 187;BA.debugLine="SetTop(True)";
_settop(__c.True);
 //BA.debugLineNum = 188;BA.debugLine="SetLeft(True)";
_setleft(__c.True);
 //BA.debugLineNum = 189;BA.debugLine="SetAbsolute(True)";
_setabsolute(__c.True);
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settopright(boolean _b) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub SetTopRight(b As Boolean) As VMButton";
 //BA.debugLineNum = 178;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 179;BA.debugLine="SetTop(True)";
_settop(__c.True);
 //BA.debugLineNum = 180;BA.debugLine="SetRight(True)";
_setright(__c.True);
 //BA.debugLineNum = 181;BA.debugLine="SetAbsolute(True)";
_setabsolute(__c.True);
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settransparent(boolean _vartype) throws Exception{
String _pp = "";
 //BA.debugLineNum = 939;BA.debugLine="Sub SetTransparent(varType As Boolean) As VMButton";
 //BA.debugLineNum = 940;BA.debugLine="If varType = False Then Return Me";
if (_vartype==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 941;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 942;BA.debugLine="Button.SetAttrSingle(\"text\", varType)";
_button._setattrsingle /*b4j.example.vmelement*/ ("text",BA.ObjectToString(_vartype));
 //BA.debugLineNum = 943;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 945;BA.debugLine="Dim pp As String = $\"${ID}text\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"text");
 //BA.debugLineNum = 946;BA.debugLine="vue.SetStateSingle(pp, varType)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartype));
 //BA.debugLineNum = 947;BA.debugLine="Button.Bind(\":text\", pp)";
_button._bind /*b4j.example.vmelement*/ (":text",_pp);
 //BA.debugLineNum = 948;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 949;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settype(String _vartype) throws Exception{
 //BA.debugLineNum = 928;BA.debugLine="Sub SetType(varType As String) As VMButton";
 //BA.debugLineNum = 929;BA.debugLine="If varType = \"\" Then Return Me";
if ((_vartype).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 930;BA.debugLine="Button.Bind(\"type\", varType)";
_button._bind /*b4j.example.vmelement*/ ("type",_vartype);
 //BA.debugLineNum = 931;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 932;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 957;BA.debugLine="Sub SetValue(varValue As String) As VMButton";
 //BA.debugLineNum = 958;BA.debugLine="Button.SetValue(varValue,False)";
_button._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 959;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 960;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 377;BA.debugLine="Sub SetVIf(vif As String) As VMButton";
 //BA.debugLineNum = 378;BA.debugLine="Button.SetVIf(vif)";
_button._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 1093;BA.debugLine="Sub SetVisible(b As Boolean) As VMButton";
 //BA.debugLineNum = 1094;BA.debugLine="Button.SetVisible(b)";
_button._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 1095;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 1096;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Sub SetVModel(k As String) As VMButton";
 //BA.debugLineNum = 373;BA.debugLine="Button.SetVModel(k)";
_button._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setvon(String _von) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetVOn(von As String) As VMButton";
 //BA.debugLineNum = 132;BA.debugLine="Button.SetVOn(von)";
_button._setvon /*b4j.example.vmelement*/ ((Object)(_von));
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Sub SetVShow(vif As String) As VMButton";
 //BA.debugLineNum = 383;BA.debugLine="Button.SetVShow(vif)";
_button._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 384;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setwidth(String _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 963;BA.debugLine="Sub SetWidth(varWidth As String) As VMButton";
 //BA.debugLineNum = 964;BA.debugLine="If varWidth = \"\" Then Return Me";
if ((_varwidth).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 965;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 966;BA.debugLine="Button.SetAttrSingle(\"width\", varWidth)";
_button._setattrsingle /*b4j.example.vmelement*/ ("width",_varwidth);
 //BA.debugLineNum = 967;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 };
 //BA.debugLineNum = 969;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 970;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varwidth));
 //BA.debugLineNum = 971;BA.debugLine="Button.Bind(\":width\", pp)";
_button._bind /*b4j.example.vmelement*/ (":width",_pp);
 //BA.debugLineNum = 972;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 973;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setxlarge(boolean _varxlarge) throws Exception{
 //BA.debugLineNum = 976;BA.debugLine="Sub SetXLarge(varXLarge As Boolean) As VMButton";
 //BA.debugLineNum = 977;BA.debugLine="If varXLarge = False Then Return Me";
if (_varxlarge==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 978;BA.debugLine="Button.SetAttrSingle(\":x-large\", varXLarge)";
_button._setattrsingle /*b4j.example.vmelement*/ (":x-large",BA.ObjectToString(_varxlarge));
 //BA.debugLineNum = 979;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 980;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setxsmall(boolean _varxsmall) throws Exception{
 //BA.debugLineNum = 983;BA.debugLine="Sub SetXSmall(varXSmall As Boolean) As VMButton";
 //BA.debugLineNum = 984;BA.debugLine="If varXSmall = False Then Return Me";
if (_varxsmall==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 985;BA.debugLine="Button.SetAttrSingle(\":x-small\", varXSmall)";
_button._setattrsingle /*b4j.example.vmelement*/ (":x-small",BA.ObjectToString(_varxsmall));
 //BA.debugLineNum = 986;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 987;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _show() throws Exception{
 //BA.debugLineNum = 1013;BA.debugLine="Sub Show As VMButton";
 //BA.debugLineNum = 1014;BA.debugLine="Button.SetVisible(True)";
_button._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1015;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 1016;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 324;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 325;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 326;BA.debugLine="Dim eName As String = $\"${ID}_click\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_click");
 //BA.debugLineNum = 327;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 328;BA.debugLine="Log($\"VMButton.${eName} event has not been defi";
__c.Log(("VMButton."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 332;BA.debugLine="Select Case iconPos";
switch (BA.switchObjectToInt(_iconpos,"left","right")) {
case 0: {
 //BA.debugLineNum = 334;BA.debugLine="Button.SetText(icon)";
_button._settext /*b4j.example.vmelement*/ (_icon);
 //BA.debugLineNum = 335;BA.debugLine="Button.SetText(txt)";
_button._settext /*b4j.example.vmelement*/ (_txt);
 break; }
case 1: {
 //BA.debugLineNum = 337;BA.debugLine="Button.SetText(txt)";
_button._settext /*b4j.example.vmelement*/ (_txt);
 //BA.debugLineNum = 338;BA.debugLine="Button.SetText(icon)";
_button._settext /*b4j.example.vmelement*/ (_icon);
 break; }
default: {
 //BA.debugLineNum = 340;BA.debugLine="Button.SetText(txt)";
_button._settext /*b4j.example.vmelement*/ (_txt);
 //BA.debugLineNum = 341;BA.debugLine="Button.SetText(icon)";
_button._settext /*b4j.example.vmelement*/ (_icon);
 break; }
}
;
 //BA.debugLineNum = 343;BA.debugLine="If hasToolTip Then";
if (_hastooltip) { 
 //BA.debugLineNum = 344;BA.debugLine="Button.Pop(tmpl.Template)";
_button._pop /*String*/ (_tmpl._template /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 345;BA.debugLine="tmpl.Pop(tooltip.tooltip)";
_tmpl._pop /*String*/ (_tooltip._tooltip /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 346;BA.debugLine="span.Pop(tooltip.ToolTip)";
_span._pop /*String*/ (_tooltip._tooltip /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 348;BA.debugLine="If hasBadge = False Then";
if (_hasbadge==__c.False) { 
 //BA.debugLineNum = 349;BA.debugLine="Return tooltip.tostring";
if (true) return _tooltip._tostring /*String*/ ();
 };
 //BA.debugLineNum = 352;BA.debugLine="If Badge.HasContent Then";
if (_badge._hascontent /*boolean*/ ) { 
 //BA.debugLineNum = 353;BA.debugLine="Badge.AddComponent(tooltip.ToString)";
_badge._addcomponent /*b4j.example.vmbadge*/ (_tooltip._tostring /*String*/ ());
 //BA.debugLineNum = 354;BA.debugLine="Return Badge.tostring";
if (true) return _badge._tostring /*String*/ ();
 }else {
 //BA.debugLineNum = 356;BA.debugLine="Return tooltip.ToString";
if (true) return _tooltip._tostring /*String*/ ();
 };
 }else {
 //BA.debugLineNum = 359;BA.debugLine="If hasBadge = False Then";
if (_hasbadge==__c.False) { 
 //BA.debugLineNum = 360;BA.debugLine="Return Button.tostring";
if (true) return _button._tostring /*String*/ ();
 };
 //BA.debugLineNum = 363;BA.debugLine="If Badge.HasContent Then";
if (_badge._hascontent /*boolean*/ ) { 
 //BA.debugLineNum = 364;BA.debugLine="Badge.AddComponent(Button.ToString)";
_badge._addcomponent /*b4j.example.vmbadge*/ (_button._tostring /*String*/ ());
 //BA.debugLineNum = 365;BA.debugLine="Return Badge.tostring";
if (true) return _badge._tostring /*String*/ ();
 }else {
 //BA.debugLineNum = 367;BA.debugLine="Return Button.ToString";
if (true) return _button._tostring /*String*/ ();
 };
 };
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbutton  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 291;BA.debugLine="Sub UseTheme(themeName As String) As VMButton";
 //BA.debugLineNum = 292;BA.debugLine="If themeName = \"\" Then Return Me";
if ((_themename).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 293;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 294;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 295;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 296;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 297;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 299;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
