package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmradiogroup extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmradiogroup", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmradiogroup.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _radiogroup = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public anywheresoftware.b4a.objects.collections.Map _items = null;
public boolean _bstatic = false;
public String _xmodel = "";
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
public b4j.example.vmradiogroup  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 241;BA.debugLine="Sub AddChild(child As VMElement) As VMRadioGroup";
 //BA.debugLineNum = 242;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 243;BA.debugLine="RadioGroup.SetText(childHTML)";
_radiogroup._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 277;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 278;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 279;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradiogroup  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub AddClass(c As String) As VMRadioGroup";
 //BA.debugLineNum = 260;BA.debugLine="RadioGroup.AddClass(c)";
_radiogroup._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _additem(String _k,String _v) throws Exception{
b4j.example.vmradio _el = null;
 //BA.debugLineNum = 149;BA.debugLine="private Sub AddItem(k As String, v As String) As V";
 //BA.debugLineNum = 150;BA.debugLine="Dim el As VMRadio";
_el = new b4j.example.vmradio();
 //BA.debugLineNum = 151;BA.debugLine="el.Initialize(vue, \"\", Module)";
_el._initialize /*b4j.example.vmradio*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 152;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmradio*/ (_bstatic);
 //BA.debugLineNum = 153;BA.debugLine="el.SetAttrSingle(\"label\", v)";
_el._setattrsingle /*b4j.example.vmradio*/ ("label",_v);
 //BA.debugLineNum = 154;BA.debugLine="el.SetAttrSingle(\"value\", k)";
_el._setattrsingle /*b4j.example.vmradio*/ ("value",_k);
 //BA.debugLineNum = 155;BA.debugLine="el.SetAttrSingle(\"key\", k)";
_el._setattrsingle /*b4j.example.vmradio*/ ("key",_k);
 //BA.debugLineNum = 156;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmradio*/ (_designmode);
 //BA.debugLineNum = 157;BA.debugLine="el.Pop(RadioGroup)	'";
_el._pop /*String*/ (_radiogroup);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _additems(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
Object _v = null;
 //BA.debugLineNum = 141;BA.debugLine="Sub AddItems(m As Map) As VMRadioGroup";
 //BA.debugLineNum = 142;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 143;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 144;BA.debugLine="items.Put(k, v)";
_items.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 795;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 796;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 797;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradiogroup  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 749;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 750;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 751;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 752;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 753;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 800;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 801;BA.debugLine="RadioGroup.BuildModel(mprops, mstyles, lclasses, l";
_radiogroup._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 802;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 803;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public RadioGroup As VMElement";
_radiogroup = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private items As Map";
_items = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 11;BA.debugLine="Private xmodel As String";
_xmodel = "";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradiogroup  _disable() throws Exception{
 //BA.debugLineNum = 742;BA.debugLine="Sub Disable As VMRadioGroup";
 //BA.debugLineNum = 743;BA.debugLine="RadioGroup.Disable(True)";
_radiogroup._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 744;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 745;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _enable() throws Exception{
 //BA.debugLineNum = 737;BA.debugLine="Sub Enable As VMRadioGroup";
 //BA.debugLineNum = 738;BA.debugLine="RadioGroup.Enable(True)";
_radiogroup._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 739;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 740;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _hide() throws Exception{
 //BA.debugLineNum = 727;BA.debugLine="Sub Hide As VMRadioGroup";
 //BA.debugLineNum = 728;BA.debugLine="RadioGroup.SetVisible(False)";
_radiogroup._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 729;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 730;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 16;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="RadioGroup.Initialize(v, ID)";
_radiogroup._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 18;BA.debugLine="RadioGroup.SetTag(\"v-radio-group\")";
_radiogroup._settag /*b4j.example.vmelement*/ ("v-radio-group");
 //BA.debugLineNum = 19;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 21;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 22;BA.debugLine="RadioGroup.typeOf = \"radiogroup\"";
_radiogroup._typeof /*String*/  = "radiogroup";
 //BA.debugLineNum = 23;BA.debugLine="RadioGroup.fieldType = \"string\"";
_radiogroup._fieldtype /*String*/  = "string";
 //BA.debugLineNum = 24;BA.debugLine="items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 25;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 26;BA.debugLine="xmodel = \"\"";
_xmodel = "";
 //BA.debugLineNum = 27;BA.debugLine="SetOnChange(Module, $\"${ID}_change\"$)";
_setonchange(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_change"));
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 255;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradiogroup  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 756;BA.debugLine="public Sub RemoveAttr(sName As String) As VMRadioG";
 //BA.debugLineNum = 757;BA.debugLine="RadioGroup.RemoveAttr(sName)";
_radiogroup._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 758;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 759;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub Render";
 //BA.debugLineNum = 237;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradiogroup  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 284;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 285;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 286;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 287;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 }else {
 //BA.debugLineNum = 289;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 290;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 291;BA.debugLine="RadioGroup.Bind(\":active-class\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 };
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setappendicon(String _varappendicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 297;BA.debugLine="Sub SetAppendIcon(varAppendIcon As String) As VMRa";
 //BA.debugLineNum = 298;BA.debugLine="If varAppendIcon = \"\" Then Return Me";
if ((_varappendicon).equals("")) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 299;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 300;BA.debugLine="SetAttrSingle(\"append-icon\", varAppendIcon)";
_setattrsingle("append-icon",_varappendicon);
 }else {
 //BA.debugLineNum = 302;BA.debugLine="Dim pp As String = $\"${ID}AppendIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AppendIcon");
 //BA.debugLineNum = 303;BA.debugLine="vue.SetStateSingle(pp, varAppendIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varappendicon));
 //BA.debugLineNum = 304;BA.debugLine="RadioGroup.Bind(\":append-icon\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":append-icon",_pp);
 };
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetAttr(attr As Map) As VMRadioGroup";
 //BA.debugLineNum = 266;BA.debugLine="RadioGroup.SetAttr(attr)";
_radiogroup._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 97;BA.debugLine="Sub SetAttributes(attrs As List) As VMRadioGroup";
 //BA.debugLineNum = 98;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 99;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetAttrLoose(loose As String) As VMRadioGroup";
 //BA.debugLineNum = 92;BA.debugLine="RadioGroup.SetAttrLoose(loose)";
_radiogroup._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 789;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 790;BA.debugLine="RadioGroup.SetAttrSingle(prop, value)";
_radiogroup._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 791;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 792;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setbackgroundcolor(String _varbackgroundcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 310;BA.debugLine="Sub SetBackgroundColor(varBackgroundColor As Strin";
 //BA.debugLineNum = 311;BA.debugLine="If varBackgroundColor = \"\" Then Return Me";
if ((_varbackgroundcolor).equals("")) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 312;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 313;BA.debugLine="SetAttrSingle(\"background-color\", varBackgroundC";
_setattrsingle("background-color",_varbackgroundcolor);
 }else {
 //BA.debugLineNum = 315;BA.debugLine="Dim pp As String = $\"${ID}BackgroundColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BackgroundColor");
 //BA.debugLineNum = 316;BA.debugLine="vue.SetStateSingle(pp, varBackgroundColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbackgroundcolor));
 //BA.debugLineNum = 317;BA.debugLine="RadioGroup.Bind(\":background-color\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 };
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 174;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 175;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 176;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 177;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 178;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 }else {
 //BA.debugLineNum = 180;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 181;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 182;BA.debugLine="RadioGroup.Bind(\":color\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":color",_pp);
 };
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setcolumn(boolean _varcolumn) throws Exception{
String _pp = "";
 //BA.debugLineNum = 557;BA.debugLine="Sub SetColumn(varColumn As Boolean) As VMRadioGrou";
 //BA.debugLineNum = 558;BA.debugLine="If varColumn = False Then Return Me";
if (_varcolumn==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 559;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 560;BA.debugLine="SetAttrSingle(\"column\", varColumn)";
_setattrsingle("column",BA.ObjectToString(_varcolumn));
 }else {
 //BA.debugLineNum = 562;BA.debugLine="Dim pp As String = $\"${ID}column\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"column");
 //BA.debugLineNum = 563;BA.debugLine="vue.SetStateSingle(pp, varColumn)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolumn));
 //BA.debugLineNum = 564;BA.debugLine="RadioGroup.Bind(\":column\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":column",_pp);
 };
 //BA.debugLineNum = 566;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 567;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 323;BA.debugLine="Sub SetDark(varDark As Boolean) As VMRadioGroup";
 //BA.debugLineNum = 324;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 325;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 326;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 }else {
 //BA.debugLineNum = 328;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 329;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 330;BA.debugLine="RadioGroup.Bind(\":dark\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":dark",_pp);
 };
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 32;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setdatasource(String _sourcename,String _sourcefield,String _displayfield) throws Exception{
String _krow = "";
String _drow = "";
b4j.example.vmradio _radio = null;
 //BA.debugLineNum = 117;BA.debugLine="Sub SetDataSource(sourceName As String, sourceFiel";
 //BA.debugLineNum = 118;BA.debugLine="items.Clear";
_items.Clear();
 //BA.debugLineNum = 119;BA.debugLine="sourceName = sourceName.tolowercase";
_sourcename = _sourcename.toLowerCase();
 //BA.debugLineNum = 121;BA.debugLine="Dim kRow As String = $\"row.${sourceField}\"$";
_krow = ("row."+__c.SmartStringFormatter("",(Object)(_sourcefield))+"");
 //BA.debugLineNum = 122;BA.debugLine="Dim dRow As String = $\"row.${displayField}\"$";
_drow = ("row."+__c.SmartStringFormatter("",(Object)(_displayfield))+"");
 //BA.debugLineNum = 124;BA.debugLine="Dim Radio As VMRadio";
_radio = new b4j.example.vmradio();
 //BA.debugLineNum = 125;BA.debugLine="Radio.Initialize(vue, \"\", Module)";
_radio._initialize /*b4j.example.vmradio*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 126;BA.debugLine="Radio.SetStatic(bStatic)";
_radio._setstatic /*b4j.example.vmradio*/ (_bstatic);
 //BA.debugLineNum = 127;BA.debugLine="Radio.SetAttrSingle(\"v-for\", $\"row in ${sourceNam";
_radio._setattrsingle /*b4j.example.vmradio*/ ("v-for",("row in "+__c.SmartStringFormatter("",(Object)(_sourcename))+""));
 //BA.debugLineNum = 128;BA.debugLine="Radio.SetAttrSingle(\":key\", kRow)";
_radio._setattrsingle /*b4j.example.vmradio*/ (":key",_krow);
 //BA.debugLineNum = 129;BA.debugLine="Radio.SetAttrSingle(\":value\", kRow)";
_radio._setattrsingle /*b4j.example.vmradio*/ (":value",_krow);
 //BA.debugLineNum = 130;BA.debugLine="Radio.SetAttrSingle(\":label\", dRow)";
_radio._setattrsingle /*b4j.example.vmradio*/ (":label",_drow);
 //BA.debugLineNum = 131;BA.debugLine="Radio.SetDesignMode(DesignMode)";
_radio._setdesignmode /*b4j.example.vmradio*/ (_designmode);
 //BA.debugLineNum = 133;BA.debugLine="Radio.Pop(RadioGroup)";
_radio._pop /*String*/ (_radiogroup);
 //BA.debugLineNum = 134;BA.debugLine="If vue.StateExists(sourceName) = False Then";
if (_vue._stateexists /*boolean*/ (_sourcename)==__c.False) { 
 //BA.debugLineNum = 135;BA.debugLine="vue.SetData(sourceName, vue.newlist)";
_vue._setdata /*b4j.example.bananovue*/ (_sourcename,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 };
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setdense(boolean _vardense) throws Exception{
String _pp = "";
 //BA.debugLineNum = 336;BA.debugLine="Sub SetDense(varDense As Boolean) As VMRadioGroup";
 //BA.debugLineNum = 337;BA.debugLine="If varDense = False Then Return Me";
if (_vardense==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 338;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 339;BA.debugLine="SetAttrSingle(\"dense\", varDense)";
_setattrsingle("dense",BA.ObjectToString(_vardense));
 }else {
 //BA.debugLineNum = 341;BA.debugLine="Dim pp As String = $\"${ID}Dense\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dense");
 //BA.debugLineNum = 342;BA.debugLine="vue.SetStateSingle(pp, varDense)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardense));
 //BA.debugLineNum = 343;BA.debugLine="RadioGroup.Bind(\":dense\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":dense",_pp);
 };
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 772;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMRadioGroup";
 //BA.debugLineNum = 773;BA.debugLine="RadioGroup.SetDesignMode(b)";
_radiogroup._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 774;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 775;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 776;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 74;BA.debugLine="RadioGroup.SetDeviceOffsets(OS, OM, OL, OX)";
_radiogroup._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 86;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 87;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 80;BA.debugLine="RadioGroup.SetDeviceSizes(SS, SM, SL, SX)";
_radiogroup._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMRadio";
 //BA.debugLineNum = 350;BA.debugLine="RadioGroup.SetDisabled(varDisabled)";
_radiogroup._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _seterror(boolean _varerror) throws Exception{
String _pp = "";
 //BA.debugLineNum = 355;BA.debugLine="Sub SetError(varError As Boolean) As VMRadioGroup";
 //BA.debugLineNum = 356;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 357;BA.debugLine="SetAttrSingle(\"error\", varError)";
_setattrsingle("error",BA.ObjectToString(_varerror));
 //BA.debugLineNum = 358;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 };
 //BA.debugLineNum = 360;BA.debugLine="Dim pp As String = $\"${xmodel}Error\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_xmodel))+"Error");
 //BA.debugLineNum = 361;BA.debugLine="vue.SetStateSingle(pp, varError)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varerror));
 //BA.debugLineNum = 362;BA.debugLine="RadioGroup.Bind(\":error\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":error",_pp);
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _seterrorcount(String _varerrorcount) throws Exception{
String _pp = "";
 //BA.debugLineNum = 367;BA.debugLine="Sub SetErrorCount(varErrorCount As String) As VMRa";
 //BA.debugLineNum = 368;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 369;BA.debugLine="SetAttrSingle(\"error-count\", varErrorCount)";
_setattrsingle("error-count",_varerrorcount);
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 };
 //BA.debugLineNum = 372;BA.debugLine="Dim pp As String = $\"${xmodel}ErrorCount\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_xmodel))+"ErrorCount");
 //BA.debugLineNum = 373;BA.debugLine="vue.SetStateSingle(pp, varErrorCount)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varerrorcount));
 //BA.debugLineNum = 374;BA.debugLine="RadioGroup.Bind(\":error-count\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":error-count",_pp);
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _seterrormessages(boolean _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _pp = "";
 //BA.debugLineNum = 379;BA.debugLine="Sub SetErrorMessages(b As Boolean) As VMRadioGroup";
 //BA.debugLineNum = 380;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 381;BA.debugLine="Dim nl As List = vue.NewList";
_nl = new anywheresoftware.b4a.objects.collections.List();
_nl = _vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 382;BA.debugLine="Dim pp As String = $\"${xmodel}ErrorMessages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_xmodel))+"ErrorMessages");
 //BA.debugLineNum = 383;BA.debugLine="vue.SetData(pp, nl)";
_vue._setdata /*b4j.example.bananovue*/ (_pp,(Object)(_nl.getObject()));
 //BA.debugLineNum = 384;BA.debugLine="RadioGroup.Bind(\":error-messages\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":error-messages",_pp);
 //BA.debugLineNum = 385;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setfieldtype(String _ft) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetFieldType(ft As String) As VMRadioGroup";
 //BA.debugLineNum = 39;BA.debugLine="RadioGroup.fieldType = ft";
_radiogroup._fieldtype /*String*/  = _ft;
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _sethidedetails(boolean _varhidedetails) throws Exception{
String _pp = "";
 //BA.debugLineNum = 390;BA.debugLine="Sub SetHideDetails(varHideDetails As Boolean) As V";
 //BA.debugLineNum = 391;BA.debugLine="If varHideDetails = False Then Return Me";
if (_varhidedetails==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 392;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 393;BA.debugLine="SetAttrSingle(\"hide-details\", varHideDetails)";
_setattrsingle("hide-details",BA.ObjectToString(_varhidedetails));
 }else {
 //BA.debugLineNum = 395;BA.debugLine="Dim pp As String = $\"${ID}HideDetails\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideDetails");
 //BA.debugLineNum = 396;BA.debugLine="vue.SetStateSingle(pp, varHideDetails)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhidedetails));
 //BA.debugLineNum = 397;BA.debugLine="RadioGroup.Bind(\":hide-details\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":hide-details",_pp);
 };
 //BA.debugLineNum = 399;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _sethint(String _varhint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 403;BA.debugLine="Sub SetHint(varHint As String) As VMRadioGroup";
 //BA.debugLineNum = 404;BA.debugLine="If varHint = \"\" Then Return Me";
if ((_varhint).equals("")) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 405;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 406;BA.debugLine="SetAttrSingle(\"hint\", varHint)";
_setattrsingle("hint",_varhint);
 }else {
 //BA.debugLineNum = 408;BA.debugLine="Dim pp As String = $\"${ID}Hint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Hint");
 //BA.debugLineNum = 409;BA.debugLine="vue.SetStateSingle(pp, varHint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhint));
 //BA.debugLineNum = 410;BA.debugLine="RadioGroup.Bind(\":hint\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":hint",_pp);
 };
 //BA.debugLineNum = 412;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _sethorizontal(boolean _b) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetHorizontal(b As Boolean) As VMRadioGroup";
 //BA.debugLineNum = 105;BA.debugLine="SetRow(True)";
_setrow(__c.True);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setid(Object _varid) throws Exception{
String _pp = "";
 //BA.debugLineNum = 416;BA.debugLine="Sub SetId(varId As Object) As VMRadioGroup";
 //BA.debugLineNum = 417;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 418;BA.debugLine="SetAttrSingle(\"id\", varId)";
_setattrsingle("id",BA.ObjectToString(_varid));
 }else {
 //BA.debugLineNum = 420;BA.debugLine="Dim pp As String = $\"${ID}Id\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Id");
 //BA.debugLineNum = 421;BA.debugLine="vue.SetStateSingle(pp, varId)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varid);
 //BA.debugLineNum = 422;BA.debugLine="RadioGroup.Bind(\":id\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":id",_pp);
 };
 //BA.debugLineNum = 424;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setlabel(String _varlabel) throws Exception{
String _pp = "";
 //BA.debugLineNum = 428;BA.debugLine="Sub SetLabel(varLabel As String) As VMRadioGroup";
 //BA.debugLineNum = 429;BA.debugLine="If varLabel = \"\" Then Return Me";
if ((_varlabel).equals("")) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 430;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 431;BA.debugLine="SetAttrSingle(\"label\", varLabel)";
_setattrsingle("label",_varlabel);
 }else {
 //BA.debugLineNum = 433;BA.debugLine="Dim pp As String = $\"${ID}Label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Label");
 //BA.debugLineNum = 434;BA.debugLine="vue.SetStateSingle(pp, varLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlabel));
 //BA.debugLineNum = 435;BA.debugLine="RadioGroup.Bind(\":label\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":label",_pp);
 };
 //BA.debugLineNum = 437;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 438;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 441;BA.debugLine="Sub SetLight(varLight As Boolean) As VMRadioGroup";
 //BA.debugLineNum = 442;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 443;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 444;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 }else {
 //BA.debugLineNum = 446;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 447;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 448;BA.debugLine="RadioGroup.Bind(\":light\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":light",_pp);
 };
 //BA.debugLineNum = 450;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setloading(boolean _varloading) throws Exception{
String _pp = "";
 //BA.debugLineNum = 454;BA.debugLine="Sub SetLoading(varLoading As Boolean) As VMRadioGr";
 //BA.debugLineNum = 455;BA.debugLine="If varLoading = False Then Return Me";
if (_varloading==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 456;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 457;BA.debugLine="SetAttrSingle(\"loading\", varLoading)";
_setattrsingle("loading",BA.ObjectToString(_varloading));
 }else {
 //BA.debugLineNum = 459;BA.debugLine="Dim pp As String = $\"${ID}Loading\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Loading");
 //BA.debugLineNum = 460;BA.debugLine="vue.SetStateSingle(pp, varLoading)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloading));
 //BA.debugLineNum = 461;BA.debugLine="RadioGroup.Bind(\":loading\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":loading",_pp);
 };
 //BA.debugLineNum = 463;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setmandatory(boolean _varmandatory) throws Exception{
String _pp = "";
 //BA.debugLineNum = 189;BA.debugLine="Sub SetMandatory(varMandatory As Boolean) As VMRad";
 //BA.debugLineNum = 190;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 191;BA.debugLine="SetAttrSingle(\"mandatory\", varMandatory)";
_setattrsingle("mandatory",BA.ObjectToString(_varmandatory));
 }else {
 //BA.debugLineNum = 193;BA.debugLine="Dim pp As String = $\"${ID}varMandatory\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"varMandatory");
 //BA.debugLineNum = 194;BA.debugLine="vue.SetStateSingle(pp, varMandatory)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmandatory));
 //BA.debugLineNum = 195;BA.debugLine="RadioGroup.Bind(\":mandatory\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":mandatory",_pp);
 };
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 767;BA.debugLine="Sub SetMarginAll(p As String) As VMRadioGroup";
 //BA.debugLineNum = 768;BA.debugLine="RadioGroup.setmarginall(p)";
_radiogroup._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 769;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 770;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setmax(Object _varmax) throws Exception{
String _pp = "";
 //BA.debugLineNum = 467;BA.debugLine="Sub SetMax(varMax As Object) As VMRadioGroup";
 //BA.debugLineNum = 468;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 469;BA.debugLine="SetAttrSingle(\"max\", varMax)";
_setattrsingle("max",BA.ObjectToString(_varmax));
 }else {
 //BA.debugLineNum = 471;BA.debugLine="Dim pp As String = $\"${ID}Max\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Max");
 //BA.debugLineNum = 472;BA.debugLine="vue.SetStateSingle(pp, varMax)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmax);
 //BA.debugLineNum = 473;BA.debugLine="RadioGroup.Bind(\":max\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":max",_pp);
 };
 //BA.debugLineNum = 475;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 476;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setmessages(Object _varmessages) throws Exception{
String _pp = "";
 //BA.debugLineNum = 479;BA.debugLine="Sub SetMessages(varMessages As Object) As VMRadioG";
 //BA.debugLineNum = 480;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 481;BA.debugLine="SetAttrSingle(\"messages\", varMessages)";
_setattrsingle("messages",BA.ObjectToString(_varmessages));
 }else {
 //BA.debugLineNum = 483;BA.debugLine="Dim pp As String = $\"${ID}Messages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Messages");
 //BA.debugLineNum = 484;BA.debugLine="vue.SetStateSingle(pp, varMessages)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmessages);
 //BA.debugLineNum = 485;BA.debugLine="RadioGroup.Bind(\":messages\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":messages",_pp);
 };
 //BA.debugLineNum = 487;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 488;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setmultiple(boolean _varmultiple) throws Exception{
 //BA.debugLineNum = 491;BA.debugLine="Sub SetMultiple(varMultiple As Boolean) As VMRadio";
 //BA.debugLineNum = 492;BA.debugLine="If varMultiple = False Then Return Me";
if (_varmultiple==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 493;BA.debugLine="SetAttrSingle(\"multiple\", varMultiple)";
_setattrsingle("multiple",BA.ObjectToString(_varmultiple));
 //BA.debugLineNum = 494;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setname(Object _varname) throws Exception{
 //BA.debugLineNum = 498;BA.debugLine="Sub SetName(varName As Object) As VMRadioGroup";
 //BA.debugLineNum = 499;BA.debugLine="SetAttrSingle(\"name\", varName)";
_setattrsingle("name",BA.ObjectToString(_varname));
 //BA.debugLineNum = 500;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 501;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setonchange(Object _eventhandler,String _methodname) throws Exception{
Object _value = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 655;BA.debugLine="Sub SetOnChange(eventHandler As Object, methodName";
 //BA.debugLineNum = 656;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 657;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 658;BA.debugLine="Dim value As Object";
_value = new Object();
 //BA.debugLineNum = 659;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_value}))));
 //BA.debugLineNum = 660;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 662;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 663;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 664;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setonclickappend(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 667;BA.debugLine="Sub SetOnClickAppend(methodName As String) As VMRa";
 //BA.debugLineNum = 668;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 669;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 670;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 671;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 672;BA.debugLine="SetAttr(CreateMap(\"@click:append\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:append"),(Object)(_methodname)}));
 //BA.debugLineNum = 674;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 675;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 676;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setonclickprepend(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 679;BA.debugLine="Sub SetOnClickPrepend(methodName As String) As VMR";
 //BA.debugLineNum = 680;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 681;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 682;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 683;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 684;BA.debugLine="SetAttr(CreateMap(\"@click:prepend\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:prepend"),(Object)(_methodname)}));
 //BA.debugLineNum = 686;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 687;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 688;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setonmousedown(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 691;BA.debugLine="Sub SetOnMousedown(methodName As String) As VMRadi";
 //BA.debugLineNum = 692;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 693;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 694;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 695;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 696;BA.debugLine="SetAttr(CreateMap(\"@mousedown\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mousedown"),(Object)(_methodname)}));
 //BA.debugLineNum = 698;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 699;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 700;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setonmouseup(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 703;BA.debugLine="Sub SetOnMouseup(methodName As String) As VMRadioG";
 //BA.debugLineNum = 704;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 705;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 706;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 707;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 708;BA.debugLine="SetAttr(CreateMap(\"@mouseup\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mouseup"),(Object)(_methodname)}));
 //BA.debugLineNum = 710;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 711;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 712;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setonupdateerror(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 715;BA.debugLine="Sub SetOnUpdateError(methodName As String) As VMRa";
 //BA.debugLineNum = 716;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 717;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 718;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 719;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 720;BA.debugLine="SetAttr(CreateMap(\"@update:error\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:error"),(Object)(_methodname)}));
 //BA.debugLineNum = 722;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 723;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 724;BA.debugLine="End Sub";
return null;
}
public String  _setoptions(anywheresoftware.b4a.objects.collections.Map _options) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 109;BA.debugLine="Sub SetOptions(options As Map)";
 //BA.debugLineNum = 110;BA.debugLine="For Each k As String In options.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _options.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 111;BA.debugLine="Dim v As String = options.Get(k)";
_v = BA.ObjectToString(_options.Get((Object)(_k)));
 //BA.debugLineNum = 112;BA.debugLine="items.Put(k, v)";
_items.Put((Object)(_k),(Object)(_v));
 }
};
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradiogroup  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 762;BA.debugLine="Sub SetPaddingAll(p As String) As VMRadioGroup";
 //BA.debugLineNum = 763;BA.debugLine="RadioGroup.SetPaddingAll(p)";
_radiogroup._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 764;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 765;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setpersistenthint(boolean _varpersistenthint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 504;BA.debugLine="Sub SetPersistentHint(varPersistentHint As Boolean";
 //BA.debugLineNum = 505;BA.debugLine="If varPersistentHint = False Then Return Me";
if (_varpersistenthint==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 506;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 507;BA.debugLine="SetAttrSingle(\"persistent-hint\", varPersistentHi";
_setattrsingle("persistent-hint",BA.ObjectToString(_varpersistenthint));
 }else {
 //BA.debugLineNum = 509;BA.debugLine="Dim pp As String = $\"${ID}PersistentHint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PersistentHint");
 //BA.debugLineNum = 510;BA.debugLine="vue.SetStateSingle(pp, varPersistentHint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpersistenthint));
 //BA.debugLineNum = 511;BA.debugLine="RadioGroup.Bind(\":persistent-hint\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":persistent-hint",_pp);
 };
 //BA.debugLineNum = 513;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 514;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setprependicon(String _varprependicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 517;BA.debugLine="Sub SetPrependIcon(varPrependIcon As String) As VM";
 //BA.debugLineNum = 518;BA.debugLine="If varPrependIcon = \"\" Then Return Me";
if ((_varprependicon).equals("")) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 519;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 520;BA.debugLine="SetAttrSingle(\"prepend-icon\", varPrependIcon)";
_setattrsingle("prepend-icon",_varprependicon);
 }else {
 //BA.debugLineNum = 522;BA.debugLine="Dim pp As String = $\"${ID}PrependIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrependIcon");
 //BA.debugLineNum = 523;BA.debugLine="vue.SetStateSingle(pp, varPrependIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprependicon));
 //BA.debugLineNum = 524;BA.debugLine="RadioGroup.Bind(\":prepend-icon\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":prepend-icon",_pp);
 };
 //BA.debugLineNum = 526;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 527;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMRad";
 //BA.debugLineNum = 68;BA.debugLine="RadioGroup.SetRC(sRow, sCol)";
_radiogroup._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setreadonly(boolean _varreadonly) throws Exception{
String _pp = "";
 //BA.debugLineNum = 530;BA.debugLine="Sub SetReadonly(varReadonly As Boolean) As VMRadio";
 //BA.debugLineNum = 531;BA.debugLine="If varReadonly = False Then Return Me";
if (_varreadonly==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 532;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 533;BA.debugLine="SetAttrSingle(\"readonly\", varReadonly)";
_setattrsingle("readonly",BA.ObjectToString(_varreadonly));
 }else {
 //BA.debugLineNum = 535;BA.debugLine="Dim pp As String = $\"${ID}Readonly\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Readonly");
 //BA.debugLineNum = 536;BA.debugLine="vue.SetStateSingle(pp, varReadonly)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreadonly));
 //BA.debugLineNum = 537;BA.debugLine="RadioGroup.Bind(\":readonly\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":readonly",_pp);
 };
 //BA.debugLineNum = 539;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setrow(boolean _varrow) throws Exception{
String _pp = "";
 //BA.debugLineNum = 543;BA.debugLine="Sub SetRow(varRow As Boolean) As VMRadioGroup";
 //BA.debugLineNum = 544;BA.debugLine="If varRow = False Then Return Me";
if (_varrow==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 545;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 546;BA.debugLine="SetAttrSingle(\"row\", varRow)";
_setattrsingle("row",BA.ObjectToString(_varrow));
 }else {
 //BA.debugLineNum = 548;BA.debugLine="Dim pp As String = $\"${ID}Row\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Row");
 //BA.debugLineNum = 549;BA.debugLine="vue.SetStateSingle(pp, varRow)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varrow));
 //BA.debugLineNum = 550;BA.debugLine="RadioGroup.Bind(\":row\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":row",_pp);
 };
 //BA.debugLineNum = 552;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 553;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setrules(boolean _varrules) throws Exception{
String _pp = "";
 //BA.debugLineNum = 570;BA.debugLine="Sub SetRules(varRules As Boolean) As VMRadioGroup";
 //BA.debugLineNum = 571;BA.debugLine="If varRules = False Then Return Me";
if (_varrules==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 572;BA.debugLine="If bStatic Then Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 573;BA.debugLine="If DesignMode Then Return Me";
if (_designmode) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 574;BA.debugLine="Dim pp As String = $\"${xmodel}Rules\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_xmodel))+"Rules");
 //BA.debugLineNum = 575;BA.debugLine="RadioGroup.Bind(\":rules\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":rules",_pp);
 //BA.debugLineNum = 576;BA.debugLine="vue.SetData(pp, vue.NewList)";
_vue._setdata /*b4j.example.bananovue*/ (_pp,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 577;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 578;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setslotappend(boolean _b) throws Exception{
 //BA.debugLineNum = 637;BA.debugLine="Sub SetSlotAppend(b As Boolean) As VMRadioGroup";
 //BA.debugLineNum = 638;BA.debugLine="SetAttr(CreateMap(\"slot\": \"append\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("append")}));
 //BA.debugLineNum = 639;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 640;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setslotmessage(boolean _b) throws Exception{
 //BA.debugLineNum = 643;BA.debugLine="Sub SetSlotMessage(b As Boolean) As VMRadioGroup";
 //BA.debugLineNum = 644;BA.debugLine="SetAttr(CreateMap(\"slot\": \"message\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("message")}));
 //BA.debugLineNum = 645;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 646;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setslotprepend(boolean _b) throws Exception{
 //BA.debugLineNum = 649;BA.debugLine="Sub SetSlotPrepend(b As Boolean) As VMRadioGroup";
 //BA.debugLineNum = 650;BA.debugLine="SetAttr(CreateMap(\"slot\": \"prepend\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("prepend")}));
 //BA.debugLineNum = 651;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 652;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetStatic(b As Boolean) As VMRadioGroup";
 //BA.debugLineNum = 61;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 62;BA.debugLine="RadioGroup.SetStatic(b)";
_radiogroup._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetStyle(sm As Map) As VMRadioGroup";
 //BA.debugLineNum = 272;BA.debugLine="RadioGroup.SetStyle(sm)";
_radiogroup._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 784;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 785;BA.debugLine="RadioGroup.SetStyleSingle(prop, value)";
_radiogroup._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 786;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 787;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setsuccess(Object _varsuccess) throws Exception{
String _pp = "";
 //BA.debugLineNum = 581;BA.debugLine="Sub SetSuccess(varSuccess As Object) As VMRadioGro";
 //BA.debugLineNum = 582;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 583;BA.debugLine="SetAttrSingle(\"success\", varSuccess)";
_setattrsingle("success",BA.ObjectToString(_varsuccess));
 }else {
 //BA.debugLineNum = 585;BA.debugLine="Dim pp As String = $\"${ID}Success\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Success");
 //BA.debugLineNum = 586;BA.debugLine="vue.SetStateSingle(pp, varSuccess)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varsuccess);
 //BA.debugLineNum = 587;BA.debugLine="RadioGroup.Bind(\":success\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":success",_pp);
 };
 //BA.debugLineNum = 589;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setsuccessmessages(Object _varsuccessmessages) throws Exception{
String _pp = "";
 //BA.debugLineNum = 593;BA.debugLine="Sub SetSuccessMessages(varSuccessMessages As Objec";
 //BA.debugLineNum = 594;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 595;BA.debugLine="SetAttrSingle(\"success-messages\", varSuccessMess";
_setattrsingle("success-messages",BA.ObjectToString(_varsuccessmessages));
 }else {
 //BA.debugLineNum = 597;BA.debugLine="Dim pp As String = $\"${ID}SuccessMessages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SuccessMessages");
 //BA.debugLineNum = 598;BA.debugLine="vue.SetStateSingle(pp, varSuccessMessages)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varsuccessmessages);
 //BA.debugLineNum = 599;BA.debugLine="RadioGroup.Bind(\":success-messages\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":success-messages",_pp);
 };
 //BA.debugLineNum = 601;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 602;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 778;BA.debugLine="Sub SetTabIndex(ti As String) As VMRadioGroup";
 //BA.debugLineNum = 779;BA.debugLine="RadioGroup.SetTabIndex(ti)";
_radiogroup._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 780;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 781;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetText(t As Object) As VMRadioGroup";
 //BA.debugLineNum = 249;BA.debugLine="RadioGroup.SetText(t)";
_radiogroup._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 811;BA.debugLine="Sub SetTextColor(varColor As String) As VMRadioGro";
 //BA.debugLineNum = 812;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 813;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 814;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 815;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 818;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 819;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 820;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 821;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 822;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 823;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 824;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setvalidateonblur(boolean _varvalidateonblur) throws Exception{
String _pp = "";
 //BA.debugLineNum = 605;BA.debugLine="Sub SetValidateOnBlur(varValidateOnBlur As Boolean";
 //BA.debugLineNum = 606;BA.debugLine="If varValidateOnBlur = False Then Return Me";
if (_varvalidateonblur==__c.False) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 607;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 608;BA.debugLine="SetAttrSingle(\"validate-on-blur\", varValidateOnB";
_setattrsingle("validate-on-blur",BA.ObjectToString(_varvalidateonblur));
 }else {
 //BA.debugLineNum = 610;BA.debugLine="Dim pp As String = $\"${ID}ValidateOnBlur\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ValidateOnBlur");
 //BA.debugLineNum = 611;BA.debugLine="vue.SetStateSingle(pp, varValidateOnBlur)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalidateonblur));
 //BA.debugLineNum = 612;BA.debugLine="RadioGroup.Bind(\":validate-on-blur\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":validate-on-blur",_pp);
 };
 //BA.debugLineNum = 614;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 615;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 618;BA.debugLine="Sub SetValue(varValue As String) As VMRadioGroup";
 //BA.debugLineNum = 619;BA.debugLine="RadioGroup.SetValue(varValue, False)";
_radiogroup._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 620;BA.debugLine="vue.SetData(xmodel, varValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xmodel,(Object)(_varvalue));
 //BA.debugLineNum = 621;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 622;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setvaluecomparator(Object _varvaluecomparator) throws Exception{
String _pp = "";
 //BA.debugLineNum = 625;BA.debugLine="Sub SetValueComparator(varValueComparator As Objec";
 //BA.debugLineNum = 626;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 627;BA.debugLine="SetAttrSingle(\"value-comparator\", varValueCompar";
_setattrsingle("value-comparator",BA.ObjectToString(_varvaluecomparator));
 }else {
 //BA.debugLineNum = 629;BA.debugLine="Dim pp As String = $\"${ID}ValueComparator\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ValueComparator");
 //BA.debugLineNum = 630;BA.debugLine="vue.SetStateSingle(pp, varValueComparator)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varvaluecomparator);
 //BA.debugLineNum = 631;BA.debugLine="RadioGroup.Bind(\":value-comparator\", pp)";
_radiogroup._bind /*b4j.example.vmelement*/ (":value-comparator",_pp);
 };
 //BA.debugLineNum = 633;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 634;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setvfor(String _item,String _datasource,String _keyfield,String _valuefield,String _labelfield) throws Exception{
b4j.example.vmradio _radio = null;
String _sline = "";
 //BA.debugLineNum = 44;BA.debugLine="Sub SetVFor(item As String, dataSource As String,";
 //BA.debugLineNum = 45;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 46;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 47;BA.debugLine="Dim Radio As VMRadio";
_radio = new b4j.example.vmradio();
 //BA.debugLineNum = 48;BA.debugLine="Radio.Initialize(vue, \"\", Module)";
_radio._initialize /*b4j.example.vmradio*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 49;BA.debugLine="Radio.SetStatic(bStatic)";
_radio._setstatic /*b4j.example.vmradio*/ (_bstatic);
 //BA.debugLineNum = 50;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 51;BA.debugLine="Radio.SetAttrSingle(\"v-for\", sline)";
_radio._setattrsingle /*b4j.example.vmradio*/ ("v-for",_sline);
 //BA.debugLineNum = 52;BA.debugLine="Radio.SetAttrSingle(\":key\", keyField)";
_radio._setattrsingle /*b4j.example.vmradio*/ (":key",_keyfield);
 //BA.debugLineNum = 53;BA.debugLine="Radio.SetAttrSingle(\":value\", valueField)";
_radio._setattrsingle /*b4j.example.vmradio*/ (":value",_valuefield);
 //BA.debugLineNum = 54;BA.debugLine="Radio.SetAttrSingle(\":label\", labelField)";
_radio._setattrsingle /*b4j.example.vmradio*/ (":label",_labelfield);
 //BA.debugLineNum = 55;BA.debugLine="Radio.SetDesignMode(DesignMode)";
_radio._setdesignmode /*b4j.example.vmradio*/ (_designmode);
 //BA.debugLineNum = 56;BA.debugLine="Radio.Pop(RadioGroup)";
_radio._pop /*String*/ (_radiogroup);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub SetVIf(vif As String) As VMRadioGroup";
 //BA.debugLineNum = 226;BA.debugLine="RadioGroup.SetVIf(vif)";
_radiogroup._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 805;BA.debugLine="Sub SetVisible(b As Boolean) As VMRadioGroup";
 //BA.debugLineNum = 806;BA.debugLine="RadioGroup.SetVisible(b)";
_radiogroup._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 807;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 808;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Sub SetVModel(k As String) As VMRadioGroup";
 //BA.debugLineNum = 220;BA.debugLine="xmodel = k.tolowercase";
_xmodel = _k.toLowerCase();
 //BA.debugLineNum = 221;BA.debugLine="RadioGroup.SetVModel(k)";
_radiogroup._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetVShow(vif As String) As VMRadioGroup";
 //BA.debugLineNum = 231;BA.debugLine="RadioGroup.SetVShow(vif)";
_radiogroup._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _show() throws Exception{
 //BA.debugLineNum = 732;BA.debugLine="Sub Show As VMRadioGroup";
 //BA.debugLineNum = 733;BA.debugLine="RadioGroup.SetVisible(True)";
_radiogroup._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 734;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 735;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
String _k = "";
String _v = "";
 //BA.debugLineNum = 201;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 202;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 203;BA.debugLine="Dim eName As String = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 204;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 205;BA.debugLine="Log($\"VMRadioGroup.${eName} event has not been d";
__c.Log(("VMRadioGroup."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 208;BA.debugLine="RemoveAttr(\"required\")";
_removeattr("required");
 //BA.debugLineNum = 209;BA.debugLine="RemoveAttr(\":required\")";
_removeattr(":required");
 //BA.debugLineNum = 210;BA.debugLine="If items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 211;BA.debugLine="For Each k As String In items.Keys";
{
final anywheresoftware.b4a.BA.IterableList group10 = _items.Keys();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_k = BA.ObjectToString(group10.Get(index10));
 //BA.debugLineNum = 212;BA.debugLine="Dim v As String = items.Get(k)";
_v = BA.ObjectToString(_items.Get((Object)(_k)));
 //BA.debugLineNum = 213;BA.debugLine="AddItem(k, v)";
_additem(_k,_v);
 }
};
 };
 //BA.debugLineNum = 216;BA.debugLine="Return RadioGroup.ToString";
if (true) return _radiogroup._tostring /*String*/ ();
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradiogroup  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 162;BA.debugLine="Sub UseTheme(themeName As String) As VMRadioGroup";
 //BA.debugLineNum = 163;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 164;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 165;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 166;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 167;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
