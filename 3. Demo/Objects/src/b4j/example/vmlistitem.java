package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmlistitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmlistitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmlistitem.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _listitem = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public b4j.example.vmlist _childlist = null;
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
public b4j.example.vmlistitem  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 102;BA.debugLine="Sub AddChild(child As VMElement) As VMListItem";
 //BA.debugLineNum = 103;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 104;BA.debugLine="ListItem.SetText(childHTML)";
_listitem._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
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
public b4j.example.vmlistitem  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub AddClass(c As String) As VMListItem";
 //BA.debugLineNum = 121;BA.debugLine="ListItem.AddClass(c)";
_listitem._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub AddComponent(comp As String) As VMListItem";
 //BA.debugLineNum = 30;BA.debugLine="ListItem.SetText(comp)";
_listitem._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 460;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 461;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 462;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 463;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 511;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 512;BA.debugLine="ListItem.BuildModel(mprops, mstyles, lclasses, lo";
_listitem._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 513;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 514;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ListItem As VMElement";
_listitem = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean  'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Public childList As VMList";
_childlist = new b4j.example.vmlist();
 //BA.debugLineNum = 10;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitem  _disable() throws Exception{
 //BA.debugLineNum = 454;BA.debugLine="Sub Disable As VMListItem";
 //BA.debugLineNum = 455;BA.debugLine="ListItem.Disable(True)";
_listitem._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 456;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _enable() throws Exception{
 //BA.debugLineNum = 449;BA.debugLine="Sub Enable As VMListItem";
 //BA.debugLineNum = 450;BA.debugLine="ListItem.Enable(True)";
_listitem._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 451;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _hide() throws Exception{
 //BA.debugLineNum = 439;BA.debugLine="Sub Hide As VMListItem";
 //BA.debugLineNum = 440;BA.debugLine="ListItem.SetVisible(False)";
_listitem._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 441;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 442;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="ListItem.Initialize(v, ID)";
_listitem._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 17;BA.debugLine="ListItem.SetTag(\"v-list-item\")";
_listitem._settag /*b4j.example.vmelement*/ ("v-list-item");
 //BA.debugLineNum = 18;BA.debugLine="ListItem.SetAttrLoose(\"link\")";
_listitem._setattrloose /*b4j.example.vmelement*/ ("link");
 //BA.debugLineNum = 19;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 21;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 22;BA.debugLine="SetOnClick($\"${ID}_click\"$)";
_setonclick((""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 23;BA.debugLine="childList.Initialize(vue, $\"${ID}children\"$, Modu";
_childlist._initialize /*b4j.example.vmlist*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"children"),_module);
 //BA.debugLineNum = 24;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 116;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitem  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 467;BA.debugLine="public Sub RemoveAttr(sName As String) As VMListIt";
 //BA.debugLineNum = 468;BA.debugLine="ListItem.RemoveAttr(sName)";
_listitem._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 469;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 470;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub Render";
 //BA.debugLineNum = 98;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitem  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 145;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 146;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 147;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 148;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 151;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 152;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 153;BA.debugLine="ListItem.Bind(\":active-class\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setappend(boolean _varappend) throws Exception{
String _pp = "";
 //BA.debugLineNum = 158;BA.debugLine="Sub SetAppend(varAppend As Boolean) As VMListItem";
 //BA.debugLineNum = 159;BA.debugLine="If varAppend = False Then Return Me";
if (_varappend==__c.False) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 160;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 161;BA.debugLine="SetAttrSingle(\"append\", varAppend)";
_setattrsingle("append",BA.ObjectToString(_varappend));
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 164;BA.debugLine="Dim pp As String = $\"${ID}Append\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Append");
 //BA.debugLineNum = 165;BA.debugLine="vue.SetStateSingle(pp, varAppend)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varappend));
 //BA.debugLineNum = 166;BA.debugLine="ListItem.Bind(\":append\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":append",_pp);
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetAttr(attr As Map) As VMListItem";
 //BA.debugLineNum = 127;BA.debugLine="ListItem.SetAttr(attr)";
_listitem._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 48;BA.debugLine="Sub SetAttributes(attrs As List) As VMListItem";
 //BA.debugLineNum = 49;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 50;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetAttrLoose(loose As String) As VMListItem";
 //BA.debugLineNum = 56;BA.debugLine="ListItem.SetAttrLoose(loose)";
_listitem._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 506;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 507;BA.debugLine="ListItem.SetAttrSingle(prop, value)";
_listitem._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 508;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 509;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 171;BA.debugLine="Sub SetColor(varColor As String) As VMListItem";
 //BA.debugLineNum = 172;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 173;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 174;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 177;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 178;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 179;BA.debugLine="ListItem.Bind(\":color\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 184;BA.debugLine="Sub SetDark(varDark As Boolean) As VMListItem";
 //BA.debugLineNum = 185;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 186;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 187;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 190;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 191;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 192;BA.debugLine="ListItem.Bind(\":dark\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 35;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setdense(boolean _vardense) throws Exception{
String _pp = "";
 //BA.debugLineNum = 197;BA.debugLine="Sub SetDense(varDense As Boolean) As VMListItem";
 //BA.debugLineNum = 198;BA.debugLine="If varDense = False Then Return Me";
if (_vardense==__c.False) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 199;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 200;BA.debugLine="SetAttrSingle(\"dense\", varDense)";
_setattrsingle("dense",BA.ObjectToString(_vardense));
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 203;BA.debugLine="Dim pp As String = $\"${ID}Dense\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dense");
 //BA.debugLineNum = 204;BA.debugLine="vue.SetStateSingle(pp, varDense)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardense));
 //BA.debugLineNum = 205;BA.debugLine="ListItem.Bind(\":dense\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":dense",_pp);
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 483;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMListItem";
 //BA.debugLineNum = 484;BA.debugLine="ListItem.SetDesignMode(b)";
_listitem._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 485;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 486;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 487;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMListI";
 //BA.debugLineNum = 211;BA.debugLine="ListItem.SetDisabled(varDisabled)";
_listitem._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setexact(boolean _varexact) throws Exception{
String _pp = "";
 //BA.debugLineNum = 216;BA.debugLine="Sub SetExact(varExact As Boolean) As VMListItem";
 //BA.debugLineNum = 217;BA.debugLine="If varExact = False Then Return Me";
if (_varexact==__c.False) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 218;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 219;BA.debugLine="SetAttrSingle(\"exact\", varExact)";
_setattrsingle("exact",BA.ObjectToString(_varexact));
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 222;BA.debugLine="Dim pp As String = $\"${ID}Exact\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Exact");
 //BA.debugLineNum = 223;BA.debugLine="vue.SetStateSingle(pp, varExact)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexact));
 //BA.debugLineNum = 224;BA.debugLine="ListItem.Bind(\":exact\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":exact",_pp);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setexactactiveclass(String _varexactactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 229;BA.debugLine="Sub SetExactActiveClass(varExactActiveClass As Str";
 //BA.debugLineNum = 230;BA.debugLine="If varExactActiveClass = \"\" Then Return Me";
if ((_varexactactiveclass).equals("")) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 231;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 232;BA.debugLine="SetAttrSingle(\"exact-active-class\", varExactActi";
_setattrsingle("exact-active-class",_varexactactiveclass);
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 235;BA.debugLine="Dim pp As String = $\"${ID}ExactActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ExactActiveClass");
 //BA.debugLineNum = 236;BA.debugLine="vue.SetStateSingle(pp, varExactActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexactactiveclass));
 //BA.debugLineNum = 237;BA.debugLine="ListItem.Bind(\":exact-active-class\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":exact-active-class",_pp);
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _sethref(String _varhref) throws Exception{
String _pp = "";
 //BA.debugLineNum = 242;BA.debugLine="Sub SetHref(varHref As String) As VMListItem";
 //BA.debugLineNum = 243;BA.debugLine="If varHref = \"\" Then Return Me";
if ((_varhref).equals("")) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 244;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 245;BA.debugLine="SetAttrSingle(\"href\", varHref)";
_setattrsingle("href",_varhref);
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 248;BA.debugLine="Dim pp As String = $\"${ID}Href\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Href");
 //BA.debugLineNum = 249;BA.debugLine="vue.SetStateSingle(pp, varHref)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhref));
 //BA.debugLineNum = 250;BA.debugLine="ListItem.Bind(\":href\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":href",_pp);
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setinactive(boolean _varinactive) throws Exception{
String _pp = "";
 //BA.debugLineNum = 255;BA.debugLine="Sub SetInactive(varInactive As Boolean) As VMListI";
 //BA.debugLineNum = 256;BA.debugLine="If varInactive  = False Then Return Me";
if (_varinactive==__c.False) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 257;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 258;BA.debugLine="SetAttrSingle(\"inactive\", varInactive)";
_setattrsingle("inactive",BA.ObjectToString(_varinactive));
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 261;BA.debugLine="Dim pp As String = $\"${ID}Inactive\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Inactive");
 //BA.debugLineNum = 262;BA.debugLine="vue.SetStateSingle(pp, varInactive)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varinactive));
 //BA.debugLineNum = 263;BA.debugLine="ListItem.Bind(\":inactive\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":inactive",_pp);
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setinputvalue(String _varinputvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 268;BA.debugLine="Sub SetInputValue(varInputValue As String) As VMLi";
 //BA.debugLineNum = 269;BA.debugLine="If varInputValue = \"\" Then Return Me";
if ((_varinputvalue).equals("")) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 270;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 271;BA.debugLine="SetAttrSingle(\"input-value\", varInputValue)";
_setattrsingle("input-value",_varinputvalue);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 274;BA.debugLine="Dim pp As String = $\"${ID}InputValue\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"InputValue");
 //BA.debugLineNum = 275;BA.debugLine="vue.SetStateSingle(pp, varInputValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varinputvalue));
 //BA.debugLineNum = 276;BA.debugLine="ListItem.Bind(\":input-value\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":input-value",_pp);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 281;BA.debugLine="Sub SetLight(varLight As Boolean) As VMListItem";
 //BA.debugLineNum = 282;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 283;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 284;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 287;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 288;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 289;BA.debugLine="ListItem.Bind(\":light\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setlink(boolean _varlink) throws Exception{
String _pp = "";
 //BA.debugLineNum = 294;BA.debugLine="Sub SetLink(varLink As Boolean) As VMListItem";
 //BA.debugLineNum = 295;BA.debugLine="If varLink = False Then Return Me";
if (_varlink==__c.False) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 296;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 297;BA.debugLine="SetAttrSingle(\"link\", varLink)";
_setattrsingle("link",BA.ObjectToString(_varlink));
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 300;BA.debugLine="Dim pp As String = $\"${ID}Link\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Link");
 //BA.debugLineNum = 301;BA.debugLine="vue.SetStateSingle(pp, varLink)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlink));
 //BA.debugLineNum = 302;BA.debugLine="ListItem.Bind(\":link\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":link",_pp);
 //BA.debugLineNum = 303;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setlist(b4j.example.vmlist _lst) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetList(lst As VMList) As VMListItem";
 //BA.debugLineNum = 66;BA.debugLine="ListItem.SetText(lst.ToString)";
_listitem._settext /*b4j.example.vmelement*/ (_lst._tostring /*String*/ ());
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 478;BA.debugLine="Sub SetMarginAll(p As String) As VMListItem";
 //BA.debugLineNum = 479;BA.debugLine="ListItem.setmarginall(p)";
_listitem._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 480;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 481;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 495;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 496;BA.debugLine="ListItem.SetName(varName, bbind)";
_listitem._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 497;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setnuxt(boolean _varnuxt) throws Exception{
String _pp = "";
 //BA.debugLineNum = 307;BA.debugLine="Sub SetNuxt(varNuxt As Boolean) As VMListItem";
 //BA.debugLineNum = 308;BA.debugLine="If varNuxt = False Then Return Me";
if (_varnuxt==__c.False) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 309;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 310;BA.debugLine="SetAttrSingle(\"nuxt\", varNuxt)";
_setattrsingle("nuxt",BA.ObjectToString(_varnuxt));
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 313;BA.debugLine="Dim pp As String = $\"${ID}Nuxt\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Nuxt");
 //BA.debugLineNum = 314;BA.debugLine="vue.SetStateSingle(pp, varNuxt)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnuxt));
 //BA.debugLineNum = 315;BA.debugLine="ListItem.Bind(\":nuxt\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":nuxt",_pp);
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setonclick(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 417;BA.debugLine="Sub SetOnClick(methodName As String) As VMListItem";
 //BA.debugLineNum = 418;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 419;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 420;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 421;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 422;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 424;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 425;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setonkeydown(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 428;BA.debugLine="Sub SetOnKeydown(methodName As String) As VMListIt";
 //BA.debugLineNum = 429;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 430;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 431;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 432;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 433;BA.debugLine="SetAttr(CreateMap(\"@keydown\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@keydown"),(Object)(_methodname)}));
 //BA.debugLineNum = 435;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 436;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 473;BA.debugLine="Sub SetPaddingAll(p As String) As VMListItem";
 //BA.debugLineNum = 474;BA.debugLine="ListItem.SetPaddingAll(p)";
_listitem._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 475;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 476;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setreplace(boolean _varreplace) throws Exception{
String _pp = "";
 //BA.debugLineNum = 320;BA.debugLine="Sub SetReplace(varReplace As Boolean) As VMListIte";
 //BA.debugLineNum = 321;BA.debugLine="If varReplace = False Then Return Me";
if (_varreplace==__c.False) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 322;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 323;BA.debugLine="SetAttrSingle(\"replace\", varReplace)";
_setattrsingle("replace",BA.ObjectToString(_varreplace));
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 326;BA.debugLine="Dim pp As String = $\"${ID}Replace\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Replace");
 //BA.debugLineNum = 327;BA.debugLine="vue.SetStateSingle(pp, varReplace)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreplace));
 //BA.debugLineNum = 328;BA.debugLine="ListItem.Bind(\":replace\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":replace",_pp);
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setripple(boolean _varripple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 333;BA.debugLine="Sub SetRipple(varRipple As Boolean) As VMListItem";
 //BA.debugLineNum = 334;BA.debugLine="If varRipple = False Then Return Me";
if (_varripple==__c.False) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 335;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 336;BA.debugLine="SetAttrSingle(\"ripple\", varRipple)";
_setattrsingle("ripple",BA.ObjectToString(_varripple));
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 339;BA.debugLine="Dim pp As String = $\"${ID}Ripple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Ripple");
 //BA.debugLineNum = 340;BA.debugLine="vue.SetStateSingle(pp, varRipple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varripple));
 //BA.debugLineNum = 341;BA.debugLine="ListItem.Bind(\":ripple\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":ripple",_pp);
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setselectable(boolean _varselectable) throws Exception{
String _pp = "";
 //BA.debugLineNum = 346;BA.debugLine="Sub SetSelectable(varSelectable As Boolean) As VML";
 //BA.debugLineNum = 347;BA.debugLine="If varSelectable = False Then Return Me";
if (_varselectable==__c.False) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 348;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 349;BA.debugLine="SetAttrSingle(\"selectable\", varSelectable)";
_setattrsingle("selectable",BA.ObjectToString(_varselectable));
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 352;BA.debugLine="Dim pp As String = $\"${ID}Selectable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Selectable");
 //BA.debugLineNum = 353;BA.debugLine="vue.SetStateSingle(pp, varSelectable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varselectable));
 //BA.debugLineNum = 354;BA.debugLine="ListItem.Bind(\":selectable\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":selectable",_pp);
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetStatic(b As Boolean) As VMListItem";
 //BA.debugLineNum = 42;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 43;BA.debugLine="ListItem.SetStatic(b)";
_listitem._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 44;BA.debugLine="childList.SetStatic(b)";
_childlist._setstatic /*b4j.example.vmlist*/ (_b);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetStyle(sm As Map) As VMListItem";
 //BA.debugLineNum = 133;BA.debugLine="ListItem.SetStyle(sm)";
_listitem._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 501;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 502;BA.debugLine="ListItem.SetStyleSingle(prop, value)";
_listitem._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 503;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 504;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 489;BA.debugLine="Sub SetTabIndex(ti As String) As VMListItem";
 //BA.debugLineNum = 490;BA.debugLine="ListItem.SetTabIndex(ti)";
_listitem._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 491;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 492;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _settag(String _vartag) throws Exception{
 //BA.debugLineNum = 359;BA.debugLine="Sub SetTag(varTag As String) As VMListItem";
 //BA.debugLineNum = 360;BA.debugLine="If varTag = \"\" Then Return Me";
if ((_vartag).equals("")) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 361;BA.debugLine="SetAttrSingle(\"tag\", varTag)";
_setattrsingle("tag",_vartag);
 //BA.debugLineNum = 362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _settarget(String _vartarget) throws Exception{
String _pp = "";
 //BA.debugLineNum = 366;BA.debugLine="Sub SetTarget(varTarget As String) As VMListItem";
 //BA.debugLineNum = 367;BA.debugLine="If varTarget = \"\" Then Return Me";
if ((_vartarget).equals("")) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 368;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 369;BA.debugLine="SetAttrSingle(\"target\", varTarget)";
_setattrsingle("target",_vartarget);
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 372;BA.debugLine="Dim pp As String = $\"${ID}Target\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Target");
 //BA.debugLineNum = 373;BA.debugLine="vue.SetStateSingle(pp, varTarget)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartarget));
 //BA.debugLineNum = 374;BA.debugLine="ListItem.Bind(\":target\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":target",_pp);
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetText(t As Object) As VMListItem";
 //BA.debugLineNum = 110;BA.debugLine="ListItem.SetText(t)";
_listitem._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 522;BA.debugLine="Sub SetTextColor(varColor As String) As VMListItem";
 //BA.debugLineNum = 523;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 524;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 525;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 526;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 529;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 530;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 531;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 532;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 533;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 534;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 535;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setthreeline(boolean _varthreeline) throws Exception{
String _pp = "";
 //BA.debugLineNum = 379;BA.debugLine="Sub SetThreeLine(varThreeLine As Boolean) As VMLis";
 //BA.debugLineNum = 380;BA.debugLine="If varThreeLine = False Then Return Me";
if (_varthreeline==__c.False) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 381;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 382;BA.debugLine="SetAttrSingle(\"three-line\", varThreeLine)";
_setattrsingle("three-line",BA.ObjectToString(_varthreeline));
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 385;BA.debugLine="Dim pp As String = $\"${ID}ThreeLine\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ThreeLine");
 //BA.debugLineNum = 386;BA.debugLine="vue.SetStateSingle(pp, varThreeLine)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varthreeline));
 //BA.debugLineNum = 387;BA.debugLine="ListItem.Bind(\":three-line\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":three-line",_pp);
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setto(String _varto) throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Sub SetTo(varTo As String) As VMListItem";
 //BA.debugLineNum = 393;BA.debugLine="If varTo = \"\" Then Return Me";
if ((_varto).equals("")) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 394;BA.debugLine="SetAttrSingle(\"to\", varTo)";
_setattrsingle("to",_varto);
 //BA.debugLineNum = 395;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _settwoline(boolean _vartwoline) throws Exception{
String _pp = "";
 //BA.debugLineNum = 399;BA.debugLine="Sub SetTwoLine(varTwoLine As Boolean) As VMListIte";
 //BA.debugLineNum = 400;BA.debugLine="If varTwoLine = False Then Return Me";
if (_vartwoline==__c.False) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 401;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 402;BA.debugLine="SetAttrSingle(\"two-line\", varTwoLine)";
_setattrsingle("two-line",BA.ObjectToString(_vartwoline));
 //BA.debugLineNum = 403;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 };
 //BA.debugLineNum = 405;BA.debugLine="Dim pp As String = $\"${ID}TwoLine\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"TwoLine");
 //BA.debugLineNum = 406;BA.debugLine="vue.SetStateSingle(pp, varTwoLine)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartwoline));
 //BA.debugLineNum = 407;BA.debugLine="ListItem.Bind(\":two-line\", pp)";
_listitem._bind /*b4j.example.vmelement*/ (":two-line",_pp);
 //BA.debugLineNum = 408;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setvalue(Object _varvalue) throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Sub SetValue(varValue As Object) As VMListItem";
 //BA.debugLineNum = 413;BA.debugLine="ListItem.SetValue(varValue, False)";
_listitem._setvalue /*b4j.example.vmelement*/ (BA.ObjectToString(_varvalue),__c.False);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setvelse(Object _t) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetVElse(t As Object) As VMListItem";
 //BA.debugLineNum = 61;BA.debugLine="ListItem.SetVElse(t)";
_listitem._setvelse /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetVIf(vif As String) As VMListItem";
 //BA.debugLineNum = 87;BA.debugLine="ListItem.SetVIf(vif)";
_listitem._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 516;BA.debugLine="Sub SetVisible(b As Boolean) As VMListItem";
 //BA.debugLineNum = 517;BA.debugLine="ListItem.SetVisible(b)";
_listitem._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 518;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 519;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetVModel(k As String) As VMListItem";
 //BA.debugLineNum = 82;BA.debugLine="ListItem.SetVModel(k)";
_listitem._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetVShow(vif As String) As VMListItem";
 //BA.debugLineNum = 92;BA.debugLine="ListItem.SetVShow(vif)";
_listitem._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _show() throws Exception{
 //BA.debugLineNum = 444;BA.debugLine="Sub Show As VMListItem";
 //BA.debugLineNum = 445;BA.debugLine="ListItem.SetVisible(True)";
_listitem._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 446;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 71;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 72;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 73;BA.debugLine="Dim eName As String = $\"${ID}_click\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_click");
 //BA.debugLineNum = 74;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 75;BA.debugLine="Log($\"VMListItem.${eName} event has not been def";
__c.Log(("VMListItem."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 78;BA.debugLine="Return ListItem.ToString";
if (true) return _listitem._tostring /*String*/ ();
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
