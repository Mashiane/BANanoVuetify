package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmexpansionpanelcontent extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmexpansionpanelcontent", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmexpansionpanelcontent.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _expansionpanelcontent = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
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
public b4j.example.vmexpansionpanelcontent  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 81;BA.debugLine="Sub AddChild(child As VMElement) As VMExpansionPan";
 //BA.debugLineNum = 82;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 83;BA.debugLine="ExpansionPanelContent.SetText(childHTML)";
_expansionpanelcontent._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 117;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 118;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 119;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanelcontent  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub AddClass(c As String) As VMExpansionPanelConte";
 //BA.debugLineNum = 100;BA.debugLine="ExpansionPanelContent.AddClass(c)";
_expansionpanelcontent._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Sub AddComponent(comp As String) As VMExpansionPan";
 //BA.debugLineNum = 333;BA.debugLine="ExpansionPanelContent.SetText(comp)";
_expansionpanelcontent._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _addelement(String _elid,String _eltag,String _eltext,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses) throws Exception{
b4j.example.vmelement _d = null;
 //BA.debugLineNum = 28;BA.debugLine="Sub AddElement(elID As String, elTag As String, el";
 //BA.debugLineNum = 29;BA.debugLine="Dim d As VMElement";
_d = new b4j.example.vmelement();
 //BA.debugLineNum = 30;BA.debugLine="d.Initialize(vue,elID).SetDesignMode(DesignMode).";
_d._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid)._setdesignmode /*b4j.example.vmelement*/ (_designmode)._settag /*b4j.example.vmelement*/ (_eltag);
 //BA.debugLineNum = 31;BA.debugLine="d.SetText(elText)";
_d._settext /*b4j.example.vmelement*/ (_eltext);
 //BA.debugLineNum = 32;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, Null)";
_d._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 33;BA.debugLine="SetText(d.ToString)";
_settext((Object)(_d._tostring /*String*/ ()));
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 344;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanelcontent  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 191;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 192;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 264;BA.debugLine="ExpansionPanelContent.BindStyleSingle(prop, value";
_expansionpanelcontent._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 348;BA.debugLine="ExpansionPanelContent.BuildModel(mprops, mstyles,";
_expansionpanelcontent._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ExpansionPanelContent As VMElement";
_expansionpanelcontent = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean   'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
 //BA.debugLineNum = 10;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanelcontent  _disable() throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub Disable As VMExpansionPanelContent";
 //BA.debugLineNum = 184;BA.debugLine="ExpansionPanelContent.Disable(True)";
_expansionpanelcontent._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _enable() throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub Enable As VMExpansionPanelContent";
 //BA.debugLineNum = 178;BA.debugLine="ExpansionPanelContent.Enable(True)";
_expansionpanelcontent._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _hide() throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub Hide As VMExpansionPanelContent";
 //BA.debugLineNum = 166;BA.debugLine="ExpansionPanelContent.SetVisible(False)";
_expansionpanelcontent._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="ExpansionPanelContent.Initialize(v, ID)";
_expansionpanelcontent._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 17;BA.debugLine="ExpansionPanelContent.SetTag(\"v-expansion-panel-c";
_expansionpanelcontent._settag /*b4j.example.vmelement*/ ("v-expansion-panel-content");
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 21;BA.debugLine="Container.Initialize(vue, $\"${ID}content\"$, Modul";
_container._initialize /*b4j.example.vmcontainer*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"content"),_module);
 //BA.debugLineNum = 22;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 95;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanelcontent  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="public Sub RemoveAttr(sName As String) As VMExpans";
 //BA.debugLineNum = 215;BA.debugLine="ExpansionPanelContent.RemoveAttr(sName)";
_expansionpanelcontent._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub Render";
 //BA.debugLineNum = 77;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanelcontent  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetAttr(attr As Map) As VMExpansionPanelConten";
 //BA.debugLineNum = 106;BA.debugLine="ExpansionPanelContent.SetAttr(attr)";
_expansionpanelcontent._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 283;BA.debugLine="Sub SetAttributes(attrs As List) As VMExpansionPan";
 //BA.debugLineNum = 284;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 285;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetAttrLoose(loose As String) As VMExpansionPa";
 //BA.debugLineNum = 198;BA.debugLine="ExpansionPanelContent.SetAttrLoose(loose)";
_expansionpanelcontent._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 258;BA.debugLine="ExpansionPanelContent.SetAttrSingle(prop, value)";
_expansionpanelcontent._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 124;BA.debugLine="Sub SetColor(varColor As String) As VMExpansionPan";
 //BA.debugLineNum = 125;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmexpansionpanelcontent)(this);};
 //BA.debugLineNum = 126;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 127;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 };
 //BA.debugLineNum = 130;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 131;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 132;BA.debugLine="ExpansionPanelContent.Bind(\":color\", pp)";
_expansionpanelcontent._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 137;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 138;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 139;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 140;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmexpansionpanelcontent)(this);};
 //BA.debugLineNum = 141;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 142;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 };
 //BA.debugLineNum = 145;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 146;BA.debugLine="ExpansionPanelContent.Bind(\":color\", pp)";
_expansionpanelcontent._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 46;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMExpansionPane";
 //BA.debugLineNum = 233;BA.debugLine="ExpansionPanelContent.SetDesignMode(b)";
_expansionpanelcontent._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 234;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 313;BA.debugLine="ExpansionPanelContent.SetDeviceOffsets(OS, OM, OL";
_expansionpanelcontent._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 320;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 321;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 327;BA.debugLine="ExpansionPanelContent.SetDeviceSizes(SS, SM, SL,";
_expansionpanelcontent._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _seteager(boolean _vareager) throws Exception{
String _pp = "";
 //BA.debugLineNum = 151;BA.debugLine="Sub SetEager(varEager As Boolean) As VMExpansionPa";
 //BA.debugLineNum = 152;BA.debugLine="If varEager = False Then Return Me";
if (_vareager==__c.False) { 
if (true) return (b4j.example.vmexpansionpanelcontent)(this);};
 //BA.debugLineNum = 153;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 154;BA.debugLine="SetAttrSingle(\"eager\", varEager)";
_setattrsingle("eager",BA.ObjectToString(_vareager));
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 };
 //BA.debugLineNum = 157;BA.debugLine="Dim pp As String = $\"${ID}Eager\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Eager");
 //BA.debugLineNum = 158;BA.debugLine="vue.SetStateSingle(pp, varEager)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareager));
 //BA.debugLineNum = 159;BA.debugLine="ExpansionPanelContent.Bind(\":eager\", pp)";
_expansionpanelcontent._bind /*b4j.example.vmelement*/ (":eager",_pp);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub SetKey(k As String) As VMExpansionPanelContent";
 //BA.debugLineNum = 300;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 301;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub SetMarginAll(p As String) As VMExpansionPanelC";
 //BA.debugLineNum = 227;BA.debugLine="ExpansionPanelContent.setmarginall(p)";
_expansionpanelcontent._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 246;BA.debugLine="ExpansionPanelContent.SetName(varName, bbind)";
_expansionpanelcontent._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub SetPaddingAll(p As String) As VMExpansionPanel";
 //BA.debugLineNum = 221;BA.debugLine="ExpansionPanelContent.SetPaddingAll(p)";
_expansionpanelcontent._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMExp";
 //BA.debugLineNum = 307;BA.debugLine="ExpansionPanelContent.SetRC(sRow, sCol)";
_expansionpanelcontent._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetStatic(b As Boolean) As VMExpansionPanelCon";
 //BA.debugLineNum = 39;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 40;BA.debugLine="ExpansionPanelContent.SetStatic(b)";
_expansionpanelcontent._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 41;BA.debugLine="Container.SetStatic(b)";
_container._setstatic /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetStyle(sm As Map) As VMExpansionPanelContent";
 //BA.debugLineNum = 112;BA.debugLine="ExpansionPanelContent.SetStyle(sm)";
_expansionpanelcontent._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 252;BA.debugLine="ExpansionPanelContent.SetStyleSingle(prop, value)";
_expansionpanelcontent._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub SetTabIndex(ti As String) As VMExpansionPanelC";
 //BA.debugLineNum = 240;BA.debugLine="ExpansionPanelContent.SetTabIndex(ti)";
_expansionpanelcontent._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetText(t As Object) As VMExpansionPanelConten";
 //BA.debugLineNum = 89;BA.debugLine="ExpansionPanelContent.SetText(t)";
_expansionpanelcontent._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _settextcenter() throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub SetTextCenter As VMExpansionPanelContent";
 //BA.debugLineNum = 339;BA.debugLine="ExpansionPanelContent.AddClass(\"text-center\")";
_expansionpanelcontent._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub SetVElse(vif As String) As VMExpansionPanelCon";
 //BA.debugLineNum = 269;BA.debugLine="ExpansionPanelContent.SetVElse(vif)";
_expansionpanelcontent._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 291;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 292;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 293;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 294;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 295;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetVhtml(vhtml As String) As VMExpansionPanelC";
 //BA.debugLineNum = 279;BA.debugLine="ExpansionPanelContent.SetVHtml(vhtml)";
_expansionpanelcontent._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetVIf(vif As String) As VMExpansionPanelConte";
 //BA.debugLineNum = 66;BA.debugLine="ExpansionPanelContent.SetVIf(vif)";
_expansionpanelcontent._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Sub SetVisible(b As Boolean) As VMExpansionPanelCo";
 //BA.debugLineNum = 353;BA.debugLine="ExpansionPanelContent.SetVisible(b)";
_expansionpanelcontent._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetVModel(k As String) As VMExpansionPanelCont";
 //BA.debugLineNum = 61;BA.debugLine="ExpansionPanelContent.SetVModel(k)";
_expansionpanelcontent._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetVShow(vif As String) As VMExpansionPanelCon";
 //BA.debugLineNum = 71;BA.debugLine="ExpansionPanelContent.SetVShow(vif)";
_expansionpanelcontent._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetVText(vhtml As String) As VMExpansionPanelC";
 //BA.debugLineNum = 274;BA.debugLine="ExpansionPanelContent.SetVText(vhtml)";
_expansionpanelcontent._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelcontent  _show() throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub Show As VMExpansionPanelContent";
 //BA.debugLineNum = 172;BA.debugLine="ExpansionPanelContent.SetVisible(True)";
_expansionpanelcontent._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 54;BA.debugLine="Container.RemoveAttr(\"v-show\")";
_container._removeattr /*b4j.example.vmcontainer*/ ("v-show");
 //BA.debugLineNum = 55;BA.debugLine="Container.RemoveAttr(\":style\")";
_container._removeattr /*b4j.example.vmcontainer*/ (":style");
 //BA.debugLineNum = 56;BA.debugLine="If Container.HasContent Then AddComponent(Contain";
if (_container._hascontent /*boolean*/ ) { 
_addcomponent(_container._tostring /*String*/ ());};
 //BA.debugLineNum = 57;BA.debugLine="Return ExpansionPanelContent.ToString";
if (true) return _expansionpanelcontent._tostring /*String*/ ();
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanelcontent  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 203;BA.debugLine="Sub UseTheme(themeName As String) As VMExpansionPa";
 //BA.debugLineNum = 204;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 205;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 206;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 207;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 208;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelcontent)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
