package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmslider", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmslider.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _slider = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public String _xmodel = "";
public boolean _bstatic = false;
public boolean _bisrange = false;
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
public b4j.example.vmslider  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 168;BA.debugLine="Sub AddChild(child As VMElement) As VMSlider";
 //BA.debugLineNum = 169;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 170;BA.debugLine="Slider.SetText(childHTML)";
_slider._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 204;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 205;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 206;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslider  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub AddClass(c As String) As VMSlider";
 //BA.debugLineNum = 187;BA.debugLine="Slider.AddClass(c)";
_slider._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 934;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 935;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 936;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslider  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 882;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 883;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 884;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 885;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 886;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 938;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 939;BA.debugLine="Slider.BuildModel(mprops, mstyles, lclasses, loos";
_slider._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 940;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 941;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Slider As VMElement";
_slider = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private xmodel As String = \"\"";
_xmodel = "";
 //BA.debugLineNum = 10;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 11;BA.debugLine="Private bIsRange As Boolean";
_bisrange = false;
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslider  _disable() throws Exception{
 //BA.debugLineNum = 875;BA.debugLine="Sub Disable As VMSlider";
 //BA.debugLineNum = 876;BA.debugLine="Slider.Disable(True)";
_slider._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 877;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 878;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _enable() throws Exception{
 //BA.debugLineNum = 870;BA.debugLine="Sub Enable As VMSlider";
 //BA.debugLineNum = 871;BA.debugLine="Slider.Enable(True)";
_slider._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 872;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 873;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _hide() throws Exception{
 //BA.debugLineNum = 860;BA.debugLine="Sub Hide As VMSlider";
 //BA.debugLineNum = 861;BA.debugLine="Slider.SetVisible(False)";
_slider._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 862;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 863;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 16;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="Slider.Initialize(v, ID).SetTag(\"v-slider\")";
_slider._initialize /*b4j.example.vmelement*/ (ba,_v,_id)._settag /*b4j.example.vmelement*/ ("v-slider");
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 21;BA.debugLine="SetOnClickAppend($\"${ID}_append\"$)";
_setonclickappend((""+__c.SmartStringFormatter("",(Object)(_id))+"_append"));
 //BA.debugLineNum = 22;BA.debugLine="SetOnClickPrepend($\"${ID}_prepend\"$)";
_setonclickprepend((""+__c.SmartStringFormatter("",(Object)(_id))+"_prepend"));
 //BA.debugLineNum = 23;BA.debugLine="xmodel = \"\"";
_xmodel = "";
 //BA.debugLineNum = 24;BA.debugLine="Slider.typeOf = \"slide\"";
_slider._typeof /*String*/  = "slide";
 //BA.debugLineNum = 25;BA.debugLine="Slider.fieldType = \"int\"";
_slider._fieldtype /*String*/  = "int";
 //BA.debugLineNum = 26;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 27;BA.debugLine="bIsRange = False";
_bisrange = __c.False;
 //BA.debugLineNum = 28;BA.debugLine="SetOnClick($\"${ID}_click\"$)";
_setonclick((""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 182;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslider  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 889;BA.debugLine="public Sub RemoveAttr(sName As String) As VMSlider";
 //BA.debugLineNum = 890;BA.debugLine="Slider.RemoveAttr(sName)";
_slider._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 891;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 892;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub Render";
 //BA.debugLineNum = 164;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslider  _setappendicon(String _varappendicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 211;BA.debugLine="Sub SetAppendIcon(varAppendIcon As String) As VMSl";
 //BA.debugLineNum = 212;BA.debugLine="If varAppendIcon = \"\" Then Return Me";
if ((_varappendicon).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 213;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 214;BA.debugLine="SetAttrSingle(\"append-icon\", varAppendIcon)";
_setattrsingle("append-icon",_varappendicon);
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 217;BA.debugLine="Dim pp As String = $\"${ID}AppendIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AppendIcon");
 //BA.debugLineNum = 218;BA.debugLine="vue.SetStateSingle(pp, varAppendIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varappendicon));
 //BA.debugLineNum = 219;BA.debugLine="Slider.Bind(\":append-icon\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":append-icon",_pp);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetAttr(attr As Map) As VMSlider";
 //BA.debugLineNum = 193;BA.debugLine="Slider.SetAttr(attr)";
_slider._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 87;BA.debugLine="Sub SetAttributes(attrs As List) As VMSlider";
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
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetAttrLoose(loose As String) As VMSlider";
 //BA.debugLineNum = 83;BA.debugLine="Slider.SetAttrLoose(loose)";
_slider._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 928;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 929;BA.debugLine="Slider.SetAttrSingle(prop, value)";
_slider._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 930;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 931;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setbackgroundcolor(String _varbackgroundcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 224;BA.debugLine="Sub SetBackgroundColor(varBackgroundColor As Strin";
 //BA.debugLineNum = 225;BA.debugLine="If varBackgroundColor = \"\" Then Return Me";
if ((_varbackgroundcolor).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 226;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 227;BA.debugLine="SetAttrSingle(\"background-color\", varBackgroundC";
_setattrsingle("background-color",_varbackgroundcolor);
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 230;BA.debugLine="Dim pp As String = $\"${ID}BackgroundColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BackgroundColor");
 //BA.debugLineNum = 231;BA.debugLine="vue.SetStateSingle(pp, varBackgroundColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbackgroundcolor));
 //BA.debugLineNum = 232;BA.debugLine="Slider.Bind(\":background-color\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 237;BA.debugLine="Sub SetColor(varColor As String) As VMSlider";
 //BA.debugLineNum = 238;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 239;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 240;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 243;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 244;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 245;BA.debugLine="Slider.Bind(\":color\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 114;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 115;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 116;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 117;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 118;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 121;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 122;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 123;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 124;BA.debugLine="Slider.Bind(\":color\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 250;BA.debugLine="Sub SetDark(varDark As Boolean) As VMSlider";
 //BA.debugLineNum = 251;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 252;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 253;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 256;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 257;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 258;BA.debugLine="Slider.Bind(\":dark\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 38;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setdense(boolean _vardense) throws Exception{
String _pp = "";
 //BA.debugLineNum = 263;BA.debugLine="Sub SetDense(varDense As Boolean) As VMSlider";
 //BA.debugLineNum = 264;BA.debugLine="If varDense = False Then Return Me";
if (_vardense==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 265;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 266;BA.debugLine="SetAttrSingle(\"dense\", varDense)";
_setattrsingle("dense",BA.ObjectToString(_vardense));
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 269;BA.debugLine="Dim pp As String = $\"${ID}Dense\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dense");
 //BA.debugLineNum = 270;BA.debugLine="vue.SetStateSingle(pp, varDense)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardense));
 //BA.debugLineNum = 271;BA.debugLine="Slider.Bind(\":dense\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":dense",_pp);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 905;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMSlider";
 //BA.debugLineNum = 906;BA.debugLine="Slider.SetDesignMode(b)";
_slider._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 907;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 908;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 909;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 65;BA.debugLine="Slider.SetDeviceOffsets(OS, OM, OL, OX)";
_slider._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 77;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 78;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 71;BA.debugLine="Slider.SetDeviceSizes(SS, SM, SL, SX)";
_slider._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMSlide";
 //BA.debugLineNum = 277;BA.debugLine="Slider.SetDisabled(varDisabled)";
_slider._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _seterror(boolean _varerror) throws Exception{
String _pp = "";
 //BA.debugLineNum = 282;BA.debugLine="Sub SetError(varError As Boolean) As VMSlider";
 //BA.debugLineNum = 283;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 284;BA.debugLine="SetAttrSingle(\"error\", varError)";
_setattrsingle("error",BA.ObjectToString(_varerror));
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 287;BA.debugLine="Dim pp As String = $\"${xmodel}Error\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_xmodel))+"Error");
 //BA.debugLineNum = 288;BA.debugLine="vue.SetStateSingle(pp, varError)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varerror));
 //BA.debugLineNum = 289;BA.debugLine="Slider.Bind(\":error\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":error",_pp);
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _seterrorcount(int _varerrorcount) throws Exception{
String _pp = "";
 //BA.debugLineNum = 294;BA.debugLine="Sub SetErrorCount(varErrorCount As Int) As VMSlide";
 //BA.debugLineNum = 295;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 296;BA.debugLine="SetAttrSingle(\"error-count\", varErrorCount)";
_setattrsingle("error-count",BA.NumberToString(_varerrorcount));
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 299;BA.debugLine="Dim pp As String = $\"${xmodel}ErrorCount\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_xmodel))+"ErrorCount");
 //BA.debugLineNum = 300;BA.debugLine="vue.SetStateSingle(pp, varErrorCount)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varerrorcount));
 //BA.debugLineNum = 301;BA.debugLine="Slider.Bind(\":error-count\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":error-count",_pp);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _seterrormessages(boolean _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _pp = "";
 //BA.debugLineNum = 306;BA.debugLine="Sub SetErrorMessages(b As Boolean) As VMSlider";
 //BA.debugLineNum = 307;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 308;BA.debugLine="Dim nl As List = vue.NewList";
_nl = new anywheresoftware.b4a.objects.collections.List();
_nl = _vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 309;BA.debugLine="Dim pp As String = $\"${xmodel}ErrorMessages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_xmodel))+"ErrorMessages");
 //BA.debugLineNum = 310;BA.debugLine="vue.SetData(pp, nl)";
_vue._setdata /*b4j.example.bananovue*/ (_pp,(Object)(_nl.getObject()));
 //BA.debugLineNum = 311;BA.debugLine="Slider.Bind(\":error-messages\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":error-messages",_pp);
 //BA.debugLineNum = 312;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setfieldtype(String _ft) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetFieldType(ft As String) As VMSlider";
 //BA.debugLineNum = 33;BA.debugLine="Slider.fieldType = ft";
_slider._fieldtype /*String*/  = _ft;
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 316;BA.debugLine="Sub SetHeight(varHeight As String) As VMSlider";
 //BA.debugLineNum = 317;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 318;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 319;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 322;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 323;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 324;BA.debugLine="Slider.Bind(\":height\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _sethidedetails(boolean _varhidedetails) throws Exception{
String _pp = "";
 //BA.debugLineNum = 329;BA.debugLine="Sub SetHideDetails(varHideDetails As Boolean) As V";
 //BA.debugLineNum = 330;BA.debugLine="If varHideDetails = False Then Return Me";
if (_varhidedetails==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 331;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 332;BA.debugLine="SetAttrSingle(\"hide-details\", varHideDetails)";
_setattrsingle("hide-details",BA.ObjectToString(_varhidedetails));
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 335;BA.debugLine="Dim pp As String = $\"${ID}HideDetails\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideDetails");
 //BA.debugLineNum = 336;BA.debugLine="vue.SetStateSingle(pp, varHideDetails)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhidedetails));
 //BA.debugLineNum = 337;BA.debugLine="Slider.Bind(\":hide-details\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":hide-details",_pp);
 //BA.debugLineNum = 338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _sethint(String _varhint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 342;BA.debugLine="Sub SetHint(varHint As String) As VMSlider";
 //BA.debugLineNum = 343;BA.debugLine="If varHint = \"\" Then Return Me";
if ((_varhint).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 344;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 345;BA.debugLine="SetAttrSingle(\"hint\", varHint)";
_setattrsingle("hint",_varhint);
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 348;BA.debugLine="Dim pp As String = $\"${ID}Hint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Hint");
 //BA.debugLineNum = 349;BA.debugLine="vue.SetStateSingle(pp, varHint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhint));
 //BA.debugLineNum = 350;BA.debugLine="Slider.Bind(\":hint\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":hint",_pp);
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setid(String _varid) throws Exception{
String _pp = "";
 //BA.debugLineNum = 355;BA.debugLine="Sub SetId(varId As String) As VMSlider";
 //BA.debugLineNum = 356;BA.debugLine="Dim pp As String = $\"${ID}Id\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Id");
 //BA.debugLineNum = 357;BA.debugLine="vue.SetStateSingle(pp, varId)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varid));
 //BA.debugLineNum = 358;BA.debugLine="Slider.Bind(\":id\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":id",_pp);
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setinverselabel(boolean _varinverselabel) throws Exception{
String _pp = "";
 //BA.debugLineNum = 363;BA.debugLine="Sub SetInverseLabel(varInverseLabel As Boolean) As";
 //BA.debugLineNum = 364;BA.debugLine="If varInverseLabel = False Then Return Me";
if (_varinverselabel==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 365;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 366;BA.debugLine="SetAttrSingle(\"inverse-label\", varInverseLabel)";
_setattrsingle("inverse-label",BA.ObjectToString(_varinverselabel));
 //BA.debugLineNum = 367;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 369;BA.debugLine="Dim pp As String = $\"${ID}InverseLabel\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"InverseLabel");
 //BA.debugLineNum = 370;BA.debugLine="vue.SetStateSingle(pp, varInverseLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varinverselabel));
 //BA.debugLineNum = 371;BA.debugLine="Slider.Bind(\":inverse-label\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":inverse-label",_pp);
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setlabel(String _varlabel) throws Exception{
String _pp = "";
 //BA.debugLineNum = 376;BA.debugLine="Sub SetLabel(varLabel As String) As VMSlider";
 //BA.debugLineNum = 377;BA.debugLine="If varLabel = \"\" Then Return Me";
if ((_varlabel).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 378;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 379;BA.debugLine="SetAttrSingle(\"label\", varLabel)";
_setattrsingle("label",_varlabel);
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 382;BA.debugLine="Dim pp As String = $\"${ID}Label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Label");
 //BA.debugLineNum = 383;BA.debugLine="vue.SetStateSingle(pp, varLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlabel));
 //BA.debugLineNum = 384;BA.debugLine="Slider.Bind(\":label\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":label",_pp);
 //BA.debugLineNum = 385;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setlabelonright(boolean _b) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetLabelOnRight(b As Boolean) As VMSlider";
 //BA.debugLineNum = 107;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 108;BA.debugLine="SetInverseLabel(True)";
_setinverselabel(__c.True);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 389;BA.debugLine="Sub SetLight(varLight As Boolean) As VMSlider";
 //BA.debugLineNum = 390;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 391;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 392;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 395;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 396;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 397;BA.debugLine="Slider.Bind(\":light\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setloaderheight(String _varloaderheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 402;BA.debugLine="Sub SetLoaderHeight(varLoaderHeight As String) As";
 //BA.debugLineNum = 403;BA.debugLine="If varLoaderHeight = \"\" Then Return Me";
if ((_varloaderheight).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 404;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 405;BA.debugLine="SetAttrSingle(\"loader-height\", varLoaderHeight)";
_setattrsingle("loader-height",_varloaderheight);
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 408;BA.debugLine="Dim pp As String = $\"${ID}LoaderHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"LoaderHeight");
 //BA.debugLineNum = 409;BA.debugLine="vue.SetStateSingle(pp, varLoaderHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloaderheight));
 //BA.debugLineNum = 410;BA.debugLine="Slider.Bind(\":loader-height\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":loader-height",_pp);
 //BA.debugLineNum = 411;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setloading(boolean _varloading) throws Exception{
String _pp = "";
 //BA.debugLineNum = 415;BA.debugLine="Sub SetLoading(varLoading As Boolean) As VMSlider";
 //BA.debugLineNum = 416;BA.debugLine="If varLoading = False Then Return Me";
if (_varloading==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 417;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 418;BA.debugLine="SetAttrSingle(\"loading\", varLoading)";
_setattrsingle("loading",BA.ObjectToString(_varloading));
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 421;BA.debugLine="Dim pp As String = $\"${ID}Loading\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Loading");
 //BA.debugLineNum = 422;BA.debugLine="vue.SetStateSingle(pp, varLoading)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloading));
 //BA.debugLineNum = 423;BA.debugLine="Slider.Bind(\":loading\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":loading",_pp);
 //BA.debugLineNum = 424;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 900;BA.debugLine="Sub SetMarginAll(p As String) As VMSlider";
 //BA.debugLineNum = 901;BA.debugLine="Slider.setmarginall(p)";
_slider._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 902;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 903;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setmax(double _varmax) throws Exception{
String _pp = "";
 //BA.debugLineNum = 428;BA.debugLine="Sub SetMax(varMax As Double) As VMSlider";
 //BA.debugLineNum = 429;BA.debugLine="varMax = BANano.parseFloat(varMax)";
_varmax = _banano.parseFloat((Object)(_varmax));
 //BA.debugLineNum = 430;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 431;BA.debugLine="SetAttrSingle(\"max\", varMax)";
_setattrsingle("max",BA.NumberToString(_varmax));
 //BA.debugLineNum = 432;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 434;BA.debugLine="Dim pp As String = $\"${ID}Max\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Max");
 //BA.debugLineNum = 435;BA.debugLine="vue.SetStateSingle(pp, varMax)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmax));
 //BA.debugLineNum = 436;BA.debugLine="Slider.Bind(\":max\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":max",_pp);
 //BA.debugLineNum = 437;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 438;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setmessages(Object _varmessages) throws Exception{
String _pp = "";
 //BA.debugLineNum = 441;BA.debugLine="Sub SetMessages(varMessages As Object) As VMSlider";
 //BA.debugLineNum = 442;BA.debugLine="Dim pp As String = $\"${ID}Messages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Messages");
 //BA.debugLineNum = 443;BA.debugLine="vue.SetStateSingle(pp, varMessages)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmessages);
 //BA.debugLineNum = 444;BA.debugLine="Slider.Bind(\":messages\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":messages",_pp);
 //BA.debugLineNum = 445;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 446;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setmin(double _varmin) throws Exception{
String _pp = "";
 //BA.debugLineNum = 449;BA.debugLine="Sub SetMin(varMin As Double) As VMSlider";
 //BA.debugLineNum = 450;BA.debugLine="varMin = BANano.parseFloat(varMin)";
_varmin = _banano.parseFloat((Object)(_varmin));
 //BA.debugLineNum = 451;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 452;BA.debugLine="SetAttrSingle(\"min\", varMin)";
_setattrsingle("min",BA.NumberToString(_varmin));
 //BA.debugLineNum = 453;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 455;BA.debugLine="Dim pp As String = $\"${ID}Min\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Min");
 //BA.debugLineNum = 456;BA.debugLine="vue.SetStateSingle(pp, varMin)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmin));
 //BA.debugLineNum = 457;BA.debugLine="Slider.Bind(\":min\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":min",_pp);
 //BA.debugLineNum = 458;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 459;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 917;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 918;BA.debugLine="Slider.SetName(varName, bbind)";
_slider._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 919;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 920;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setonclick(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 764;BA.debugLine="Sub SetOnClick(methodName As String) As VMSlider";
 //BA.debugLineNum = 765;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 766;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 767;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 768;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 769;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 771;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 772;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 773;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setonclickappend(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 776;BA.debugLine="Sub SetOnClickAppend(methodName As String) As VMSl";
 //BA.debugLineNum = 777;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 778;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 779;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 780;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 781;BA.debugLine="SetAttrSingle(\"@click:append\", methodName)";
_setattrsingle("@click:append",_methodname);
 //BA.debugLineNum = 783;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 784;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 785;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setonclickprepend(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 788;BA.debugLine="Sub SetOnClickPrepend(methodName As String) As VMS";
 //BA.debugLineNum = 789;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 790;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 791;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 792;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 793;BA.debugLine="SetAttrSingle(\"@click:prepend\", methodName)";
_setattrsingle("@click:prepend",_methodname);
 //BA.debugLineNum = 795;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 796;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 797;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setonend(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 800;BA.debugLine="Sub SetOnEnd(methodName As String) As VMSlider";
 //BA.debugLineNum = 801;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 802;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 803;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 804;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 805;BA.debugLine="SetAttr(CreateMap(\"@end\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@end"),(Object)(_methodname)}));
 //BA.debugLineNum = 807;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 808;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 809;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setonmousedown(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 812;BA.debugLine="Sub SetOnMousedown(methodName As String) As VMSlid";
 //BA.debugLineNum = 813;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 814;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 815;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 816;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 817;BA.debugLine="SetAttr(CreateMap(\"@mousedown\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mousedown"),(Object)(_methodname)}));
 //BA.debugLineNum = 819;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 820;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 821;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setonmouseup(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 824;BA.debugLine="Sub SetOnMouseup(methodName As String) As VMSlider";
 //BA.debugLineNum = 825;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 826;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 827;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 828;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 829;BA.debugLine="SetAttr(CreateMap(\"@mouseup\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mouseup"),(Object)(_methodname)}));
 //BA.debugLineNum = 831;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 832;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 833;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setonstart(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 836;BA.debugLine="Sub SetOnStart(methodName As String) As VMSlider";
 //BA.debugLineNum = 837;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 838;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 839;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 840;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 841;BA.debugLine="SetAttr(CreateMap(\"@start\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@start"),(Object)(_methodname)}));
 //BA.debugLineNum = 843;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 844;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 845;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setonupdateerror(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 848;BA.debugLine="Sub SetOnUpdateError(methodName As String) As VMSl";
 //BA.debugLineNum = 849;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 850;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 851;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 852;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 853;BA.debugLine="SetAttr(CreateMap(\"@update:error\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:error"),(Object)(_methodname)}));
 //BA.debugLineNum = 855;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 856;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 857;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 895;BA.debugLine="Sub SetPaddingAll(p As String) As VMSlider";
 //BA.debugLineNum = 896;BA.debugLine="Slider.SetPaddingAll(p)";
_slider._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 897;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 898;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setpersistenthint(boolean _varpersistenthint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 462;BA.debugLine="Sub SetPersistentHint(varPersistentHint As Boolean";
 //BA.debugLineNum = 463;BA.debugLine="If varPersistentHint = False Then Return Me";
if (_varpersistenthint==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 464;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 465;BA.debugLine="SetAttrSingle(\"persistent-hint\", varPersistentHi";
_setattrsingle("persistent-hint",BA.ObjectToString(_varpersistenthint));
 //BA.debugLineNum = 466;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 468;BA.debugLine="Dim pp As String = $\"${ID}PersistentHint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PersistentHint");
 //BA.debugLineNum = 469;BA.debugLine="vue.SetStateSingle(pp, varPersistentHint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpersistenthint));
 //BA.debugLineNum = 470;BA.debugLine="Slider.Bind(\":persistent-hint\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":persistent-hint",_pp);
 //BA.debugLineNum = 471;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 472;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setprependicon(String _varprependicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 475;BA.debugLine="Sub SetPrependIcon(varPrependIcon As String) As VM";
 //BA.debugLineNum = 476;BA.debugLine="If varPrependIcon = \"\" Then Return Me";
if ((_varprependicon).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 477;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 478;BA.debugLine="SetAttrSingle(\"prepend-icon\", varPrependIcon)";
_setattrsingle("prepend-icon",_varprependicon);
 //BA.debugLineNum = 479;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 481;BA.debugLine="Dim pp As String = $\"${ID}PrependIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrependIcon");
 //BA.debugLineNum = 482;BA.debugLine="vue.SetStateSingle(pp, varPrependIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprependicon));
 //BA.debugLineNum = 483;BA.debugLine="Slider.Bind(\":prepend-icon\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":prepend-icon",_pp);
 //BA.debugLineNum = 484;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 485;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setrangeslider(boolean _b) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetRangeSlider(b As Boolean) As VMSlider";
 //BA.debugLineNum = 45;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 46;BA.debugLine="Slider.SetTag(\"v-range-slider\")";
_slider._settag /*b4j.example.vmelement*/ ("v-range-slider");
 //BA.debugLineNum = 47;BA.debugLine="bIsRange = True";
_bisrange = __c.True;
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMSli";
 //BA.debugLineNum = 59;BA.debugLine="Slider.SetRC(sRow, sCol)";
_slider._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setreadonly(boolean _varreadonly) throws Exception{
String _pp = "";
 //BA.debugLineNum = 488;BA.debugLine="Sub SetReadonly(varReadonly As Boolean) As VMSlide";
 //BA.debugLineNum = 489;BA.debugLine="If varReadonly = False Then Return Me";
if (_varreadonly==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 490;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 491;BA.debugLine="SetAttrSingle(\"readonly\", varReadonly)";
_setattrsingle("readonly",BA.ObjectToString(_varreadonly));
 //BA.debugLineNum = 492;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 494;BA.debugLine="Dim pp As String = $\"${ID}Readonly\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Readonly");
 //BA.debugLineNum = 495;BA.debugLine="vue.SetStateSingle(pp, varReadonly)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreadonly));
 //BA.debugLineNum = 496;BA.debugLine="Slider.Bind(\":readonly\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":readonly",_pp);
 //BA.debugLineNum = 497;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setrequired(boolean _varrequired) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMSlide";
 //BA.debugLineNum = 130;BA.debugLine="Slider.SetRequired(varRequired)";
_slider._setrequired /*b4j.example.vmelement*/ (_varrequired);
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setrules(boolean _varrules) throws Exception{
String _pp = "";
 //BA.debugLineNum = 501;BA.debugLine="Sub SetRules(varRules As Boolean) As VMSlider";
 //BA.debugLineNum = 502;BA.debugLine="If varRules = False Then Return Me";
if (_varrules==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 503;BA.debugLine="If bStatic Then Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 504;BA.debugLine="If DesignMode Then Return Me";
if (_designmode) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 505;BA.debugLine="Dim pp As String = $\"${xmodel}Rules\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_xmodel))+"Rules");
 //BA.debugLineNum = 506;BA.debugLine="Slider.Bind(\":rules\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":rules",_pp);
 //BA.debugLineNum = 507;BA.debugLine="vue.SetData(pp, vue.NewList)";
_vue._setdata /*b4j.example.bananovue*/ (_pp,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 508;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 509;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setslotappend(boolean _b) throws Exception{
 //BA.debugLineNum = 734;BA.debugLine="Sub SetSlotAppend(b As Boolean) As VMSlider    'ig";
 //BA.debugLineNum = 735;BA.debugLine="SetAttr(CreateMap(\"slot\": \"append\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("append")}));
 //BA.debugLineNum = 736;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 737;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setslotmessage(boolean _b) throws Exception{
 //BA.debugLineNum = 740;BA.debugLine="Sub SetSlotMessage(b As Boolean) As VMSlider    'i";
 //BA.debugLineNum = 741;BA.debugLine="SetAttr(CreateMap(\"slot\": \"message\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("message")}));
 //BA.debugLineNum = 742;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 743;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setslotprepend(boolean _b) throws Exception{
 //BA.debugLineNum = 746;BA.debugLine="Sub SetSlotPrepend(b As Boolean) As VMSlider    'i";
 //BA.debugLineNum = 747;BA.debugLine="SetAttr(CreateMap(\"slot\": \"prepend\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("prepend")}));
 //BA.debugLineNum = 748;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 749;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setslotprogress(boolean _b) throws Exception{
 //BA.debugLineNum = 752;BA.debugLine="Sub SetSlotProgress(b As Boolean) As VMSlider    '";
 //BA.debugLineNum = 753;BA.debugLine="SetAttr(CreateMap(\"slot\": \"progress\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("progress")}));
 //BA.debugLineNum = 754;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 755;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setslotthumblabel(boolean _b) throws Exception{
 //BA.debugLineNum = 758;BA.debugLine="Sub SetSlotThumbLabel(b As Boolean) As VMSlider";
 //BA.debugLineNum = 759;BA.debugLine="SetAttr(CreateMap(\"slot\": \"thumb-label\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("thumb-label")}));
 //BA.debugLineNum = 760;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 761;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetStatic(b As Boolean) As VMSlider";
 //BA.debugLineNum = 52;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 53;BA.debugLine="Slider.SetStatic(b)";
_slider._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setstep(double _varstep) throws Exception{
String _pp = "";
 //BA.debugLineNum = 512;BA.debugLine="Sub SetStep(varStep As Double) As VMSlider";
 //BA.debugLineNum = 513;BA.debugLine="varStep = BANano.parseFloat(varStep)";
_varstep = _banano.parseFloat((Object)(_varstep));
 //BA.debugLineNum = 514;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 515;BA.debugLine="SetAttrSingle(\"step\", varStep)";
_setattrsingle("step",BA.NumberToString(_varstep));
 //BA.debugLineNum = 516;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 518;BA.debugLine="Dim pp As String = $\"${ID}Step\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Step");
 //BA.debugLineNum = 519;BA.debugLine="vue.SetStateSingle(pp, varStep)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varstep));
 //BA.debugLineNum = 520;BA.debugLine="Slider.Bind(\":step\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":step",_pp);
 //BA.debugLineNum = 521;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 522;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetStyle(sm As Map) As VMSlider";
 //BA.debugLineNum = 199;BA.debugLine="Slider.SetStyle(sm)";
_slider._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 923;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 924;BA.debugLine="Slider.SetStyleSingle(prop, value)";
_slider._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 925;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 926;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setsuccess(boolean _varsuccess) throws Exception{
String _pp = "";
 //BA.debugLineNum = 525;BA.debugLine="Sub SetSuccess(varSuccess As Boolean) As VMSlider";
 //BA.debugLineNum = 526;BA.debugLine="If varSuccess = False Then Return Me";
if (_varsuccess==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 527;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 528;BA.debugLine="SetAttrSingle(\"success\", varSuccess)";
_setattrsingle("success",BA.ObjectToString(_varsuccess));
 //BA.debugLineNum = 529;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 531;BA.debugLine="Dim pp As String = $\"${ID}Success\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Success");
 //BA.debugLineNum = 532;BA.debugLine="vue.SetStateSingle(pp, varSuccess)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsuccess));
 //BA.debugLineNum = 533;BA.debugLine="Slider.Bind(\":success\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":success",_pp);
 //BA.debugLineNum = 534;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 535;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setsuccessmessages(Object _varsuccessmessages) throws Exception{
String _pp = "";
 //BA.debugLineNum = 538;BA.debugLine="Sub SetSuccessMessages(varSuccessMessages As Objec";
 //BA.debugLineNum = 539;BA.debugLine="Dim pp As String = $\"${ID}SuccessMessages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SuccessMessages");
 //BA.debugLineNum = 540;BA.debugLine="vue.SetStateSingle(pp, varSuccessMessages)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varsuccessmessages);
 //BA.debugLineNum = 541;BA.debugLine="Slider.Bind(\":success-messages\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":success-messages",_pp);
 //BA.debugLineNum = 542;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 543;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 911;BA.debugLine="Sub SetTabIndex(ti As String) As VMSlider";
 //BA.debugLineNum = 912;BA.debugLine="Slider.SetTabIndex(ti)";
_slider._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 913;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 914;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub SetText(t As Object) As VMSlider";
 //BA.debugLineNum = 176;BA.debugLine="Slider.SetText(t)";
_slider._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 949;BA.debugLine="Sub SetTextColor(varColor As String) As VMSlider";
 //BA.debugLineNum = 950;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 951;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 952;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 953;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 954;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 957;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 958;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 959;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 960;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 961;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 962;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 963;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 964;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setthumbcolor(String _varthumbcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 546;BA.debugLine="Sub SetThumbColor(varThumbColor As String) As VMSl";
 //BA.debugLineNum = 547;BA.debugLine="If varThumbColor = \"\" Then Return Me";
if ((_varthumbcolor).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 548;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 549;BA.debugLine="SetAttrSingle(\"thumb-color\", varThumbColor)";
_setattrsingle("thumb-color",_varthumbcolor);
 //BA.debugLineNum = 550;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 552;BA.debugLine="Dim pp As String = $\"${ID}ThumbColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ThumbColor");
 //BA.debugLineNum = 553;BA.debugLine="vue.SetStateSingle(pp, varThumbColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varthumbcolor));
 //BA.debugLineNum = 554;BA.debugLine="Slider.Bind(\":thumb-color\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":thumb-color",_pp);
 //BA.debugLineNum = 555;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 556;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setthumbcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 559;BA.debugLine="Sub SetThumbColorIntensity(varColor As String, var";
 //BA.debugLineNum = 560;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 561;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 562;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 563;BA.debugLine="SetAttrSingle(\"thumb-color\", scolor)";
_setattrsingle("thumb-color",_scolor);
 //BA.debugLineNum = 564;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 566;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 567;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 568;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 569;BA.debugLine="Slider.Bind(\":thumb-color\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":thumb-color",_pp);
 //BA.debugLineNum = 570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 571;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setthumblabel(String _varthumblabel) throws Exception{
String _pp = "";
 //BA.debugLineNum = 580;BA.debugLine="Sub SetThumbLabel(varThumbLabel As String) As VMSl";
 //BA.debugLineNum = 581;BA.debugLine="If varThumbLabel = \"\" Then Return Me";
if ((_varthumblabel).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 582;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 583;BA.debugLine="SetAttrSingle(\"thumb-label\", varThumbLabel)";
_setattrsingle("thumb-label",_varthumblabel);
 //BA.debugLineNum = 584;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 586;BA.debugLine="Dim pp As String = $\"${ID}ThumbLabel\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ThumbLabel");
 //BA.debugLineNum = 587;BA.debugLine="vue.SetStateSingle(pp, varThumbLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varthumblabel));
 //BA.debugLineNum = 588;BA.debugLine="Slider.Bind(\":thumb-label\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":thumb-label",_pp);
 //BA.debugLineNum = 589;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setthumblabelalways(boolean _b) throws Exception{
 //BA.debugLineNum = 573;BA.debugLine="Sub SetThumbLabelAlways(b As Boolean) As VMSlider";
 //BA.debugLineNum = 574;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 575;BA.debugLine="SetThumbLabel(\"always\")";
_setthumblabel("always");
 //BA.debugLineNum = 576;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 577;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setthumbsize(int _varthumbsize) throws Exception{
String _pp = "";
 //BA.debugLineNum = 593;BA.debugLine="Sub SetThumbSize(varThumbSize As Int) As VMSlider";
 //BA.debugLineNum = 594;BA.debugLine="varThumbSize = BANano.parseInt(varThumbSize)";
_varthumbsize = _banano.parseInt((Object)(_varthumbsize));
 //BA.debugLineNum = 595;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 596;BA.debugLine="SetAttrSingle(\"thumb-size\", varThumbSize)";
_setattrsingle("thumb-size",BA.NumberToString(_varthumbsize));
 //BA.debugLineNum = 597;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 599;BA.debugLine="Dim pp As String = $\"${ID}ThumbSize\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ThumbSize");
 //BA.debugLineNum = 600;BA.debugLine="vue.SetStateSingle(pp, varThumbSize)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varthumbsize));
 //BA.debugLineNum = 601;BA.debugLine="Slider.Bind(\":thumb-size\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":thumb-size",_pp);
 //BA.debugLineNum = 602;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 603;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setticklabels(anywheresoftware.b4a.objects.collections.List _varticklabels) throws Exception{
String _pp = "";
 //BA.debugLineNum = 606;BA.debugLine="Sub SetTickLabels(varTickLabels As List) As VMSlid";
 //BA.debugLineNum = 607;BA.debugLine="If varTickLabels = Null Then Return Me";
if (_varticklabels== null) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 608;BA.debugLine="Dim pp As String = $\"${ID}TickLabels\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"TickLabels");
 //BA.debugLineNum = 609;BA.debugLine="vue.SetData(pp, varTickLabels)";
_vue._setdata /*b4j.example.bananovue*/ (_pp,(Object)(_varticklabels.getObject()));
 //BA.debugLineNum = 610;BA.debugLine="Slider.Bind(\":tick-labels\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":tick-labels",_pp);
 //BA.debugLineNum = 611;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 612;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setticks(String _varticks) throws Exception{
String _pp = "";
 //BA.debugLineNum = 628;BA.debugLine="Sub SetTicks(varTicks As String) As VMSlider";
 //BA.debugLineNum = 629;BA.debugLine="If varTicks = \"\" Then Return Me";
if ((_varticks).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 630;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 631;BA.debugLine="SetAttrSingle(\"ticks\", varTicks)";
_setattrsingle("ticks",_varticks);
 //BA.debugLineNum = 632;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 634;BA.debugLine="Dim pp As String = $\"${ID}Ticks\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Ticks");
 //BA.debugLineNum = 635;BA.debugLine="vue.SetStateSingle(pp, varTicks)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varticks));
 //BA.debugLineNum = 636;BA.debugLine="Slider.Bind(\":ticks\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":ticks",_pp);
 //BA.debugLineNum = 637;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 638;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setticksize(int _varticksize) throws Exception{
String _pp = "";
 //BA.debugLineNum = 615;BA.debugLine="Sub SetTickSize(varTickSize As Int) As VMSlider";
 //BA.debugLineNum = 616;BA.debugLine="varTickSize = BANano.parseInt(varTickSize)";
_varticksize = _banano.parseInt((Object)(_varticksize));
 //BA.debugLineNum = 617;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 618;BA.debugLine="SetAttrSingle(\"tick-size\", varTickSize)";
_setattrsingle("tick-size",BA.NumberToString(_varticksize));
 //BA.debugLineNum = 619;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 621;BA.debugLine="Dim pp As String = $\"${ID}TickSize\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"TickSize");
 //BA.debugLineNum = 622;BA.debugLine="vue.SetStateSingle(pp, varTickSize)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varticksize));
 //BA.debugLineNum = 623;BA.debugLine="Slider.Bind(\":tick-size\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":tick-size",_pp);
 //BA.debugLineNum = 624;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 625;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _settrackcolor(String _vartrackcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 641;BA.debugLine="Sub SetTrackColor(varTrackColor As String) As VMSl";
 //BA.debugLineNum = 642;BA.debugLine="If varTrackColor = \"\" Then Return Me";
if ((_vartrackcolor).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 643;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 644;BA.debugLine="SetAttrSingle(\"track-color\", varTrackColor)";
_setattrsingle("track-color",_vartrackcolor);
 //BA.debugLineNum = 645;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 647;BA.debugLine="Dim pp As String = $\"${ID}TrackColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"TrackColor");
 //BA.debugLineNum = 648;BA.debugLine="vue.SetStateSingle(pp, varTrackColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartrackcolor));
 //BA.debugLineNum = 649;BA.debugLine="Slider.Bind(\":track-color\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":track-color",_pp);
 //BA.debugLineNum = 650;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 651;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _settrackcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 654;BA.debugLine="Sub SetTrackColorIntensity(varColor As String, var";
 //BA.debugLineNum = 655;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 656;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 657;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 658;BA.debugLine="SetAttrSingle(\"track-color\", scolor)";
_setattrsingle("track-color",_scolor);
 //BA.debugLineNum = 659;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 661;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 662;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 663;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 664;BA.debugLine="Slider.Bind(\":track-color\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":track-color",_pp);
 //BA.debugLineNum = 665;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 666;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _settrackfillcolor(String _vartrackfillcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 670;BA.debugLine="Sub SetTrackFillColor(varTrackFillColor As String)";
 //BA.debugLineNum = 671;BA.debugLine="If varTrackFillColor = \"\" Then Return Me";
if ((_vartrackfillcolor).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 672;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 673;BA.debugLine="SetAttrSingle(\"track-fill-color\", varTrackFillCo";
_setattrsingle("track-fill-color",_vartrackfillcolor);
 //BA.debugLineNum = 674;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 676;BA.debugLine="Dim pp As String = $\"${ID}TrackFillColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"TrackFillColor");
 //BA.debugLineNum = 677;BA.debugLine="vue.SetStateSingle(pp, varTrackFillColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartrackfillcolor));
 //BA.debugLineNum = 678;BA.debugLine="Slider.Bind(\":track-fill-color\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":track-fill-color",_pp);
 //BA.debugLineNum = 679;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 680;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setvalidateonblur(boolean _varvalidateonblur) throws Exception{
String _pp = "";
 //BA.debugLineNum = 683;BA.debugLine="Sub SetValidateOnBlur(varValidateOnBlur As Boolean";
 //BA.debugLineNum = 684;BA.debugLine="If varValidateOnBlur = False Then Return Me";
if (_varvalidateonblur==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 685;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 686;BA.debugLine="SetAttrSingle(\"validate-on-blur\", varValidateOnB";
_setattrsingle("validate-on-blur",BA.ObjectToString(_varvalidateonblur));
 //BA.debugLineNum = 687;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 689;BA.debugLine="Dim pp As String = $\"${ID}ValidateOnBlur\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ValidateOnBlur");
 //BA.debugLineNum = 690;BA.debugLine="vue.SetStateSingle(pp, varValidateOnBlur)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalidateonblur));
 //BA.debugLineNum = 691;BA.debugLine="Slider.Bind(\":validate-on-blur\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":validate-on-blur",_pp);
 //BA.debugLineNum = 692;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 693;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setvalue(String _varvalue) throws Exception{
String _v1 = "";
String _v2 = "";
anywheresoftware.b4a.objects.collections.List _values = null;
 //BA.debugLineNum = 696;BA.debugLine="Sub SetValue(varValue As String) As VMSlider";
 //BA.debugLineNum = 697;BA.debugLine="If xmodel = \"\" Then";
if ((_xmodel).equals("")) { 
 //BA.debugLineNum = 698;BA.debugLine="Log($\"VMSlider.SetValue '${ID}' - please set the";
__c.Log(("VMSlider.SetValue '"+__c.SmartStringFormatter("",(Object)(_id))+"' - please set the vmodel first!"));
 };
 //BA.debugLineNum = 700;BA.debugLine="If bIsRange Then";
if (_bisrange) { 
 //BA.debugLineNum = 701;BA.debugLine="Dim v1 As String = vue.MvField(varValue,1,\",\")";
_v1 = _vue._mvfield /*String*/ (_varvalue,(int) (1),",");
 //BA.debugLineNum = 702;BA.debugLine="Dim v2 As String = vue.MvField(varValue,2,\",\")";
_v2 = _vue._mvfield /*String*/ (_varvalue,(int) (2),",");
 //BA.debugLineNum = 704;BA.debugLine="v1 = BANano.parseFloat(v1)";
_v1 = BA.NumberToString(_banano.parseFloat((Object)(_v1)));
 //BA.debugLineNum = 705;BA.debugLine="v2 = BANano.parseFloat(v2)";
_v2 = BA.NumberToString(_banano.parseFloat((Object)(_v2)));
 //BA.debugLineNum = 707;BA.debugLine="Dim values As List";
_values = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 708;BA.debugLine="values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 709;BA.debugLine="values.Add(v1)";
_values.Add((Object)(_v1));
 //BA.debugLineNum = 710;BA.debugLine="values.Add(v2)";
_values.Add((Object)(_v2));
 //BA.debugLineNum = 711;BA.debugLine="vue.SetData(xmodel, values)";
_vue._setdata /*b4j.example.bananovue*/ (_xmodel,(Object)(_values.getObject()));
 //BA.debugLineNum = 712;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 714;BA.debugLine="varValue = BANano.parseFloat(varValue)";
_varvalue = BA.NumberToString(_banano.parseFloat((Object)(_varvalue)));
 //BA.debugLineNum = 715;BA.debugLine="vue.SetData(xmodel, varValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xmodel,(Object)(_varvalue));
 //BA.debugLineNum = 716;BA.debugLine="Slider.SetValue(varValue,False)";
_slider._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 717;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 718;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setvertical(boolean _varvertical) throws Exception{
String _pp = "";
 //BA.debugLineNum = 721;BA.debugLine="Sub SetVertical(varVertical As Boolean) As VMSlide";
 //BA.debugLineNum = 722;BA.debugLine="If varVertical = False Then Return Me";
if (_varvertical==__c.False) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 723;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 724;BA.debugLine="SetAttrSingle(\"vertical\", varVertical)";
_setattrsingle("vertical",BA.ObjectToString(_varvertical));
 //BA.debugLineNum = 725;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 };
 //BA.debugLineNum = 727;BA.debugLine="Dim pp As String = $\"${ID}Vertical\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Vertical");
 //BA.debugLineNum = 728;BA.debugLine="vue.SetStateSingle(pp, varVertical)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvertical));
 //BA.debugLineNum = 729;BA.debugLine="Slider.Bind(\":vertical\", pp)";
_slider._bind /*b4j.example.vmelement*/ (":vertical",_pp);
 //BA.debugLineNum = 730;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 731;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub SetVIf(vif As String) As VMSlider";
 //BA.debugLineNum = 153;BA.debugLine="Slider.SetVIf(vif)";
_slider._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 943;BA.debugLine="Sub SetVisible(b As Boolean) As VMSlider";
 //BA.debugLineNum = 944;BA.debugLine="Slider.SetVisible(b)";
_slider._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 945;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 946;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetVModel(k As String) As VMSlider";
 //BA.debugLineNum = 146;BA.debugLine="xmodel = k.tolowercase";
_xmodel = _k.toLowerCase();
 //BA.debugLineNum = 147;BA.debugLine="vue.SetStateSingle(xmodel, 0)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_xmodel,(Object)(0));
 //BA.debugLineNum = 148;BA.debugLine="Slider.SetVModel(xmodel)";
_slider._setvmodel /*b4j.example.vmelement*/ (_xmodel);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub SetVShow(vif As String) As VMSlider";
 //BA.debugLineNum = 158;BA.debugLine="Slider.SetVShow(vif)";
_slider._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _show() throws Exception{
 //BA.debugLineNum = 865;BA.debugLine="Sub Show As VMSlider";
 //BA.debugLineNum = 866;BA.debugLine="Slider.SetVisible(True)";
_slider._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 867;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 868;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 135;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 136;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 137;BA.debugLine="Dim eName As String = $\"${ID}_click\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_click");
 //BA.debugLineNum = 138;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 139;BA.debugLine="Log($\"VMSlider.${eName} event has not been defin";
__c.Log(("VMSlider."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 142;BA.debugLine="Return Slider.ToString";
if (true) return _slider._tostring /*String*/ ();
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslider  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 95;BA.debugLine="Sub UseTheme(themeName As String) As VMSlider";
 //BA.debugLineNum = 96;BA.debugLine="If themeName = \"\" Then Return Me";
if ((_themename).equals("")) { 
if (true) return (b4j.example.vmslider)(this);};
 //BA.debugLineNum = 97;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 98;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 99;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 100;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 101;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
