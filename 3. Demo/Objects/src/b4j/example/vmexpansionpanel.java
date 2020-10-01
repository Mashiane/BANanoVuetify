package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmexpansionpanel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmexpansionpanel", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmexpansionpanel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _expansionpanel = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public b4j.example.vmexpansionpanelheader _header = null;
public b4j.example.vmexpansionpanelcontent _content = null;
public b4j.example.vmcontainer _container = null;
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
public b4j.example.vmexpansionpanel  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 102;BA.debugLine="Sub AddChild(child As VMElement) As VMExpansionPan";
 //BA.debugLineNum = 103;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 104;BA.debugLine="ExpansionPanel.SetText(childHTML)";
_expansionpanel._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 138;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 139;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 140;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanel  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub AddClass(c As String) As VMExpansionPanel";
 //BA.debugLineNum = 121;BA.debugLine="ExpansionPanel.AddClass(c)";
_expansionpanel._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Sub AddComponent(comp As String) As VMExpansionPan";
 //BA.debugLineNum = 380;BA.debugLine="ExpansionPanel.SetText(comp)";
_expansionpanel._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 381;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _addelement(String _elid,String _eltag,String _eltext,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses) throws Exception{
b4j.example.vmelement _d = null;
 //BA.debugLineNum = 35;BA.debugLine="Sub AddElement(elID As String, elTag As String, el";
 //BA.debugLineNum = 36;BA.debugLine="Dim d As VMElement";
_d = new b4j.example.vmelement();
 //BA.debugLineNum = 37;BA.debugLine="d.Initialize(vue,elID).SetDesignMode(DesignMode).";
_d._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid)._setdesignmode /*b4j.example.vmelement*/ (_designmode)._settag /*b4j.example.vmelement*/ (_eltag);
 //BA.debugLineNum = 38;BA.debugLine="d.SetText(elText)";
_d._settext /*b4j.example.vmelement*/ (_eltext);
 //BA.debugLineNum = 39;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, Null)";
_d._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 40;BA.debugLine="SetText(d.ToString)";
_settext(_d._tostring /*String*/ ());
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 390;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 391;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanel  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 228;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 229;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 311;BA.debugLine="ExpansionPanel.BindStyleSingle(prop, value)";
_expansionpanel._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 312;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 393;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 394;BA.debugLine="ExpansionPanel.BuildModel(mprops, mstyles, lclasse";
_expansionpanel._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 395;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ExpansionPanel As VMElement";
_expansionpanel = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Public Header As VMExpansionPanelHeader";
_header = new b4j.example.vmexpansionpanelheader();
 //BA.debugLineNum = 10;BA.debugLine="Public Content As VMExpansionPanelContent";
_content = new b4j.example.vmexpansionpanelcontent();
 //BA.debugLineNum = 11;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
 //BA.debugLineNum = 12;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanel  _disable() throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub Disable As VMExpansionPanel";
 //BA.debugLineNum = 221;BA.debugLine="ExpansionPanel.Disable(True)";
_expansionpanel._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _enable() throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub Enable As VMExpansionPanel";
 //BA.debugLineNum = 215;BA.debugLine="ExpansionPanel.Enable(True)";
_expansionpanel._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _hide() throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub Hide As VMExpansionPanel";
 //BA.debugLineNum = 203;BA.debugLine="ExpansionPanel.SetVisible(False)";
_expansionpanel._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sparent,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(v As BANanoVue, sparent As S";
 //BA.debugLineNum = 17;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 18;BA.debugLine="ExpansionPanel.Initialize(v, ID)";
_expansionpanel._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 19;BA.debugLine="ExpansionPanel.SetTag(\"v-expansion-panel\")";
_expansionpanel._settag /*b4j.example.vmelement*/ ("v-expansion-panel");
 //BA.debugLineNum = 20;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 22;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 23;BA.debugLine="Header.Initialize(vue, $\"${ID}hdr\"$, Module)";
_header._initialize /*b4j.example.vmexpansionpanelheader*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"hdr"),_module);
 //BA.debugLineNum = 24;BA.debugLine="Header.SetOnClick($\"${sparent}_click\"$)";
_header._setonclick /*b4j.example.vmexpansionpanelheader*/ ((""+__c.SmartStringFormatter("",(Object)(_sparent))+"_click"));
 //BA.debugLineNum = 25;BA.debugLine="Content.Initialize(vue, $\"${ID}cnt\"$, Module)";
_content._initialize /*b4j.example.vmexpansionpanelcontent*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"cnt"),_module);
 //BA.debugLineNum = 26;BA.debugLine="Container = Content.container";
_container = _content._container /*b4j.example.vmcontainer*/ ;
 //BA.debugLineNum = 27;BA.debugLine="SetAttrSingle(\"key\", ID)";
_setattrsingle("key",_id);
 //BA.debugLineNum = 28;BA.debugLine="SetOnClick($\"${ID}_click\"$)";
_setonclick((""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 29;BA.debugLine="SetOnChange(Module, $\"${ID}_change\"$)";
_setonchange(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_change"));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 116;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanel  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="public Sub RemoveAttr(sName As String) As VMExpans";
 //BA.debugLineNum = 262;BA.debugLine="ExpansionPanel.RemoveAttr(sName)";
_expansionpanel._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub Render";
 //BA.debugLineNum = 98;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanel  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 145;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 146;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmexpansionpanel)(this);};
 //BA.debugLineNum = 147;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 148;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 };
 //BA.debugLineNum = 151;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 152;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 153;BA.debugLine="ExpansionPanel.Bind(\":active-class\", pp)";
_expansionpanel._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetAttr(attr As Map) As VMExpansionPanel";
 //BA.debugLineNum = 127;BA.debugLine="ExpansionPanel.SetAttr(attr)";
_expansionpanel._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 330;BA.debugLine="Sub SetAttributes(attrs As List) As VMExpansionPan";
 //BA.debugLineNum = 331;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 332;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetAttrLoose(loose As String) As VMExpansionPa";
 //BA.debugLineNum = 235;BA.debugLine="ExpansionPanel.SetAttrLoose(loose)";
_expansionpanel._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 305;BA.debugLine="ExpansionPanel.SetAttrSingle(prop, value)";
_expansionpanel._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 252;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 253;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 254;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 255;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 256;BA.debugLine="ExpansionPanel.Bind(\":color\", pp)";
_expansionpanel._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 46;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMExpansionPane";
 //BA.debugLineNum = 280;BA.debugLine="ExpansionPanel.SetDesignMode(b)";
_expansionpanel._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 281;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 359;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 360;BA.debugLine="ExpansionPanel.SetDeviceOffsets(OS, OM, OL, OX)";
_expansionpanel._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 367;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 368;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 369;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 373;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 374;BA.debugLine="ExpansionPanel.SetDeviceSizes(SS, SM, SL, SX)";
_expansionpanel._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMExpan";
 //BA.debugLineNum = 159;BA.debugLine="ExpansionPanel.SetDisabled(varDisabled)";
_expansionpanel._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub SetKey(k As String) As VMExpansionPanel";
 //BA.debugLineNum = 347;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 348;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetMarginAll(p As String) As VMExpansionPanel";
 //BA.debugLineNum = 274;BA.debugLine="ExpansionPanel.setmarginall(p)";
_expansionpanel._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 293;BA.debugLine="ExpansionPanel.SetName(varName, bbind)";
_expansionpanel._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setonchange(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 177;BA.debugLine="Sub SetOnChange(eventHandler As Object, methodName";
 //BA.debugLineNum = 178;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 179;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmexpansionpanel)(this);};
 //BA.debugLineNum = 180;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 181;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 182;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 184;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setonclick(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 189;BA.debugLine="Sub SetOnClick(methodName As String) As VMExpansio";
 //BA.debugLineNum = 190;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 191;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmexpansionpanel)(this);};
 //BA.debugLineNum = 192;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 193;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 194;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 196;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub SetPaddingAll(p As String) As VMExpansionPanel";
 //BA.debugLineNum = 268;BA.debugLine="ExpansionPanel.SetPaddingAll(p)";
_expansionpanel._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMExp";
 //BA.debugLineNum = 354;BA.debugLine="ExpansionPanel.SetRC(sRow, sCol)";
_expansionpanel._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setreadonly(boolean _varreadonly) throws Exception{
String _pp = "";
 //BA.debugLineNum = 164;BA.debugLine="Sub SetReadonly(varReadonly As Boolean) As VMExpan";
 //BA.debugLineNum = 165;BA.debugLine="If varReadonly = False Then Return Me";
if (_varreadonly==__c.False) { 
if (true) return (b4j.example.vmexpansionpanel)(this);};
 //BA.debugLineNum = 166;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 167;BA.debugLine="SetAttrSingle(\"readonly\", varReadonly)";
_setattrsingle("readonly",BA.ObjectToString(_varreadonly));
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 };
 //BA.debugLineNum = 170;BA.debugLine="Dim pp As String = $\"${ID}Readonly\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Readonly");
 //BA.debugLineNum = 171;BA.debugLine="vue.SetStateSingle(pp, varReadonly)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreadonly));
 //BA.debugLineNum = 172;BA.debugLine="ExpansionPanel.Bind(\":readonly\", pp)";
_expansionpanel._bind /*b4j.example.vmelement*/ (":readonly",_pp);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetStatic(b As Boolean) As VMExpansionPanel";
 //BA.debugLineNum = 53;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 54;BA.debugLine="Header.SetStatic(b)";
_header._setstatic /*b4j.example.vmexpansionpanelheader*/ (_b);
 //BA.debugLineNum = 55;BA.debugLine="ExpansionPanel.setstatic(b)";
_expansionpanel._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 56;BA.debugLine="Content.setstatic(b)";
_content._setstatic /*b4j.example.vmexpansionpanelcontent*/ (_b);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetStyle(sm As Map) As VMExpansionPanel";
 //BA.debugLineNum = 133;BA.debugLine="ExpansionPanel.SetStyle(sm)";
_expansionpanel._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 299;BA.debugLine="ExpansionPanel.SetStyleSingle(prop, value)";
_expansionpanel._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub SetTabIndex(ti As String) As VMExpansionPanel";
 //BA.debugLineNum = 287;BA.debugLine="ExpansionPanel.SetTabIndex(ti)";
_expansionpanel._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _settext(String _t) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetText(t As String) As VMExpansionPanel";
 //BA.debugLineNum = 110;BA.debugLine="ExpansionPanel.SetText(t)";
_expansionpanel._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _settextcenter() throws Exception{
 //BA.debugLineNum = 385;BA.debugLine="Sub SetTextCenter As VMExpansionPanel";
 //BA.debugLineNum = 386;BA.debugLine="ExpansionPanel.AddClass(\"text-center\")";
_expansionpanel._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub SetVElse(vif As String) As VMExpansionPanel";
 //BA.debugLineNum = 316;BA.debugLine="ExpansionPanel.SetVElse(vif)";
_expansionpanel._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 338;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 339;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 340;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 341;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 342;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 343;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub SetVhtml(vhtml As String) As VMExpansionPanel";
 //BA.debugLineNum = 326;BA.debugLine="ExpansionPanel.SetVHtml(vhtml)";
_expansionpanel._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetVIf(vif As String) As VMExpansionPanel";
 //BA.debugLineNum = 87;BA.debugLine="ExpansionPanel.SetVIf(vif)";
_expansionpanel._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 398;BA.debugLine="Sub SetVisible(b As Boolean) As VMExpansionPanel";
 //BA.debugLineNum = 399;BA.debugLine="ExpansionPanel.SetVisible(b)";
_expansionpanel._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 400;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetVModel(k As String) As VMExpansionPanel";
 //BA.debugLineNum = 82;BA.debugLine="ExpansionPanel.SetVModel(k)";
_expansionpanel._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetVShow(vif As String) As VMExpansionPanel";
 //BA.debugLineNum = 92;BA.debugLine="ExpansionPanel.SetVShow(vif)";
_expansionpanel._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub SetVText(vhtml As String) As VMExpansionPanel";
 //BA.debugLineNum = 321;BA.debugLine="ExpansionPanel.SetVText(vhtml)";
_expansionpanel._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _show() throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub Show As VMExpansionPanel";
 //BA.debugLineNum = 209;BA.debugLine="ExpansionPanel.SetVisible(True)";
_expansionpanel._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 61;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 62;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 63;BA.debugLine="Dim eName As String = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 64;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 65;BA.debugLine="Log($\"VMExpansionPanel.${eName} event has not be";
__c.Log(("VMExpansionPanel."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 //BA.debugLineNum = 67;BA.debugLine="eName = $\"${ID}_click\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_click");
 //BA.debugLineNum = 68;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 69;BA.debugLine="Log($\"VMExpansionPanel.${eName} event has not be";
__c.Log(("VMExpansionPanel."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 72;BA.debugLine="Content.RemoveAttr(\"v-show\")";
_content._removeattr /*b4j.example.vmexpansionpanelcontent*/ ("v-show");
 //BA.debugLineNum = 73;BA.debugLine="Content.RemoveAttr(\":style\")";
_content._removeattr /*b4j.example.vmexpansionpanelcontent*/ (":style");
 //BA.debugLineNum = 74;BA.debugLine="ExpansionPanel.RemoveAttr(\"v-show\")";
_expansionpanel._removeattr /*b4j.example.vmelement*/ ("v-show");
 //BA.debugLineNum = 75;BA.debugLine="ExpansionPanel.RemoveAttr(\":style\")";
_expansionpanel._removeattr /*b4j.example.vmelement*/ (":style");
 //BA.debugLineNum = 76;BA.debugLine="AddComponent(Header.ToString)";
_addcomponent(_header._tostring /*String*/ ());
 //BA.debugLineNum = 77;BA.debugLine="AddComponent(Content.ToString)";
_addcomponent(_content._tostring /*String*/ ());
 //BA.debugLineNum = 78;BA.debugLine="Return ExpansionPanel.ToString";
if (true) return _expansionpanel._tostring /*String*/ ();
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanel  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 240;BA.debugLine="Sub UseTheme(themeName As String) As VMExpansionPa";
 //BA.debugLineNum = 241;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 242;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 243;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 244;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 245;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanel)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
