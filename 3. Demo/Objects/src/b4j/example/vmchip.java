package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmchip extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmchip", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmchip.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _chip = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public String _spos = "";
public String _icon = "";
public String _content = "";
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
public b4j.example.vmchip  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 165;BA.debugLine="Sub AddChild(child As VMElement) As VMChip";
 //BA.debugLineNum = 166;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 167;BA.debugLine="Chip.SetText(childHTML)";
_chip._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 201;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 202;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 203;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchip  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub AddClass(c As String) As VMChip";
 //BA.debugLineNum = 184;BA.debugLine="Chip.AddClass(c)";
_chip._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _addcomponent(String _scomp) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub AddComponent(scomp As String) As VMChip";
 //BA.debugLineNum = 105;BA.debugLine="SetText(scomp)";
_settext(_scomp);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 767;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 768;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 769;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchip  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 716;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 717;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 718;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 719;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 720;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 771;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 772;BA.debugLine="Chip.BuildModel(mprops, mstyles, lclasses, loose)";
_chip._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 773;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 774;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Chip As VMElement";
_chip = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="Private sPos As String";
_spos = "";
 //BA.debugLineNum = 11;BA.debugLine="Private icon As String";
_icon = "";
 //BA.debugLineNum = 12;BA.debugLine="Private content As String";
_content = "";
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchip  _disable() throws Exception{
 //BA.debugLineNum = 709;BA.debugLine="Sub Disable As VMChip";
 //BA.debugLineNum = 710;BA.debugLine="Chip.Disable(True)";
_chip._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 711;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 712;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _enable() throws Exception{
 //BA.debugLineNum = 704;BA.debugLine="Sub Enable As VMChip";
 //BA.debugLineNum = 705;BA.debugLine="Chip.Enable(True)";
_chip._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 706;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 707;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _hide() throws Exception{
 //BA.debugLineNum = 694;BA.debugLine="Sub Hide As VMChip";
 //BA.debugLineNum = 695;BA.debugLine="SetActive(False)";
_setactive(__c.False);
 //BA.debugLineNum = 696;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 697;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 17;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 18;BA.debugLine="Chip.Initialize(v, ID).SetTag(\"v-chip\")";
_chip._initialize /*b4j.example.vmelement*/ (ba,_v,_id)._settag /*b4j.example.vmelement*/ ("v-chip");
 //BA.debugLineNum = 19;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 21;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 22;BA.debugLine="SetOnClickClose($\"${ID}_close\"$)";
_setonclickclose((""+__c.SmartStringFormatter("",(Object)(_id))+"_close"));
 //BA.debugLineNum = 23;BA.debugLine="SetOnClick($\"${ID}_click\"$)";
_setonclick((""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 24;BA.debugLine="Chip.typeOf = \"chip\"";
_chip._typeof /*String*/  = "chip";
 //BA.debugLineNum = 25;BA.debugLine="Chip.fieldType = \"string\"";
_chip._fieldtype /*String*/  = "string";
 //BA.debugLineNum = 26;BA.debugLine="Chip.InputType = \"text\"";
_chip._inputtype /*String*/  = "text";
 //BA.debugLineNum = 27;BA.debugLine="Chip.IsArray = True";
_chip._isarray /*boolean*/  = __c.True;
 //BA.debugLineNum = 28;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 29;BA.debugLine="sPos = \"left\"";
_spos = "left";
 //BA.debugLineNum = 30;BA.debugLine="icon = \"\"";
_icon = "";
 //BA.debugLineNum = 31;BA.debugLine="content = \"\"";
_content = "";
 //BA.debugLineNum = 32;BA.debugLine="SetActive(True)";
_setactive(__c.True);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 179;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchip  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 723;BA.debugLine="public Sub RemoveAttr(sName As String) As VMChip";
 //BA.debugLineNum = 724;BA.debugLine="Chip.RemoveAttr(sName)";
_chip._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 725;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 726;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub Render";
 //BA.debugLineNum = 161;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchip  _setactive(boolean _varactive) throws Exception{
String _pp = "";
 //BA.debugLineNum = 208;BA.debugLine="Sub SetActive(varActive As Boolean) As VMChip";
 //BA.debugLineNum = 209;BA.debugLine="If varActive = False Then Return Me";
if (_varactive==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 210;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 211;BA.debugLine="SetAttrSingle(\"active\", varActive)";
_setattrsingle("active",BA.ObjectToString(_varactive));
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 214;BA.debugLine="Dim pp As String = $\"${ID}Active\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Active");
 //BA.debugLineNum = 215;BA.debugLine="vue.SetStateSingle(pp, varActive)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactive));
 //BA.debugLineNum = 216;BA.debugLine="Chip.Bind(\":active\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":active",_pp);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 461;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 462;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 463;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 464;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 465;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 467;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 468;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 469;BA.debugLine="Chip.Bind(\":active-class\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 470;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 471;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setappend(boolean _varappend) throws Exception{
String _pp = "";
 //BA.debugLineNum = 221;BA.debugLine="Sub SetAppend(varAppend As Boolean) As VMChip";
 //BA.debugLineNum = 222;BA.debugLine="If varAppend = False Then Return Me";
if (_varappend==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 223;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 224;BA.debugLine="SetAttrSingle(\"append\", varAppend)";
_setattrsingle("append",BA.ObjectToString(_varappend));
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 227;BA.debugLine="Dim pp As String = $\"${ID}Append\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Append");
 //BA.debugLineNum = 228;BA.debugLine="vue.SetStateSingle(pp, varAppend)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varappend));
 //BA.debugLineNum = 229;BA.debugLine="Chip.Bind(\":append\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":append",_pp);
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub SetAttr(attr As Map) As VMChip";
 //BA.debugLineNum = 190;BA.debugLine="Chip.SetAttr(attr)";
_chip._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 114;BA.debugLine="Sub SetAttributes(attrs As List) As VMChip";
 //BA.debugLineNum = 115;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 116;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetAttrLoose(loose As String) As VMChip";
 //BA.debugLineNum = 110;BA.debugLine="Chip.SetAttrLoose(loose)";
_chip._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 762;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 763;BA.debugLine="Chip.SetAttrSingle(prop, value)";
_chip._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 764;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 765;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setclose(boolean _varclose) throws Exception{
String _pp = "";
 //BA.debugLineNum = 234;BA.debugLine="Sub SetClose(varClose As Boolean) As VMChip";
 //BA.debugLineNum = 235;BA.debugLine="If varClose = False Then Return Me";
if (_varclose==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 236;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 237;BA.debugLine="SetAttrSingle(\"close\", varClose)";
_setattrsingle("close",BA.ObjectToString(_varclose));
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 240;BA.debugLine="Dim pp As String = $\"${ID}Close\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Close");
 //BA.debugLineNum = 241;BA.debugLine="vue.SetStateSingle(pp, varClose)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varclose));
 //BA.debugLineNum = 242;BA.debugLine="Chip.Bind(\":close\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":close",_pp);
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setcloseicon(String _varcloseicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 474;BA.debugLine="Sub SetCloseIcon(varCloseIcon As String) As VMChip";
 //BA.debugLineNum = 475;BA.debugLine="If varCloseIcon = \"\" Then Return Me";
if ((_varcloseicon).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 476;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 477;BA.debugLine="SetAttrSingle(\"close-icon\", varCloseIcon)";
_setattrsingle("close-icon",_varcloseicon);
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 480;BA.debugLine="Dim pp As String = $\"${ID}CloseIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CloseIcon");
 //BA.debugLineNum = 481;BA.debugLine="vue.SetStateSingle(pp, varCloseIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcloseicon));
 //BA.debugLineNum = 482;BA.debugLine="Chip.Bind(\":close-icon\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":close-icon",_pp);
 //BA.debugLineNum = 483;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 484;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setcolor(String _color) throws Exception{
String _pp = "";
 //BA.debugLineNum = 487;BA.debugLine="Sub SetColor(color As String) As VMChip";
 //BA.debugLineNum = 488;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 489;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 490;BA.debugLine="SetAttrSingle(\"color\", color)";
_setattrsingle("color",_color);
 //BA.debugLineNum = 491;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 493;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 494;BA.debugLine="vue.SetStateSingle(pp, color)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_color));
 //BA.debugLineNum = 495;BA.debugLine="Chip.Bind(\":color\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 496;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setcolorintensity(String _color,String _intensity) throws Exception{
String _mcolor = "";
String _pp = "";
 //BA.debugLineNum = 500;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 501;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 502;BA.debugLine="Dim mcolor As String = $\"${color} ${intensity}\"$";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 503;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 504;BA.debugLine="SetAttrSingle(\"color\", mcolor)";
_setattrsingle("color",_mcolor);
 //BA.debugLineNum = 505;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 507;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 508;BA.debugLine="vue.SetStateSingle(pp, mcolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_mcolor));
 //BA.debugLineNum = 509;BA.debugLine="Chip.Bind(\":color\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 510;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 511;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 247;BA.debugLine="Sub SetDark(varDark As Boolean) As VMChip";
 //BA.debugLineNum = 248;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 249;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 250;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 253;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 254;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 255;BA.debugLine="Chip.Bind(\":dark\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 37;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 739;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMChip";
 //BA.debugLineNum = 740;BA.debugLine="Chip.SetDesignMode(b)";
_chip._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 741;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 742;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 743;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 65;BA.debugLine="Chip.SetDeviceOffsets(OS, OM, OL, OX)";
_chip._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 77;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 78;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 71;BA.debugLine="Chip.SetDeviceSizes(SS, SM, SL, SX)";
_chip._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMChip";
 //BA.debugLineNum = 261;BA.debugLine="Chip.SetDisabled(varDisabled)";
_chip._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setdraggable(boolean _vardraggable) throws Exception{
String _pp = "";
 //BA.debugLineNum = 266;BA.debugLine="Sub SetDraggable(varDraggable As Boolean) As VMChi";
 //BA.debugLineNum = 267;BA.debugLine="If varDraggable = False Then Return Me";
if (_vardraggable==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 268;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 269;BA.debugLine="SetAttrSingle(\"draggable\", varDraggable)";
_setattrsingle("draggable",BA.ObjectToString(_vardraggable));
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 272;BA.debugLine="Dim pp As String = $\"${ID}Draggable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Draggable");
 //BA.debugLineNum = 273;BA.debugLine="vue.SetStateSingle(pp, varDraggable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardraggable));
 //BA.debugLineNum = 274;BA.debugLine="Chip.Bind(\":draggable\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":draggable",_pp);
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setexact(boolean _varexact) throws Exception{
String _pp = "";
 //BA.debugLineNum = 279;BA.debugLine="Sub SetExact(varExact As Boolean) As VMChip";
 //BA.debugLineNum = 280;BA.debugLine="If varExact = False Then Return Me";
if (_varexact==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 281;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 282;BA.debugLine="SetAttrSingle(\"exact\", varExact)";
_setattrsingle("exact",BA.ObjectToString(_varexact));
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 285;BA.debugLine="Dim pp As String = $\"${ID}Exact\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Exact");
 //BA.debugLineNum = 286;BA.debugLine="vue.SetStateSingle(pp, varExact)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexact));
 //BA.debugLineNum = 287;BA.debugLine="Chip.Bind(\":exact\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":exact",_pp);
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setexactactiveclass(String _varexactactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 514;BA.debugLine="Sub SetExactActiveClass(varExactActiveClass As Str";
 //BA.debugLineNum = 515;BA.debugLine="If varExactActiveClass = \"\" Then Return Me";
if ((_varexactactiveclass).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 516;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 517;BA.debugLine="SetAttrSingle(\"exact-active-class\", varExactActi";
_setattrsingle("exact-active-class",_varexactactiveclass);
 //BA.debugLineNum = 518;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 520;BA.debugLine="Dim pp As String = $\"${ID}ExactActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ExactActiveClass");
 //BA.debugLineNum = 521;BA.debugLine="vue.SetStateSingle(pp, varExactActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexactactiveclass));
 //BA.debugLineNum = 522;BA.debugLine="Chip.Bind(\":exact-active-class\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":exact-active-class",_pp);
 //BA.debugLineNum = 523;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 524;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setfilter(boolean _varfilter) throws Exception{
String _pp = "";
 //BA.debugLineNum = 292;BA.debugLine="Sub SetFilter(varFilter As Boolean) As VMChip";
 //BA.debugLineNum = 293;BA.debugLine="If varFilter = False Then Return Me";
if (_varfilter==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 294;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 295;BA.debugLine="SetAttrSingle(\"filter\", varFilter)";
_setattrsingle("filter",BA.ObjectToString(_varfilter));
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 298;BA.debugLine="Dim pp As String = $\"${ID}Filter\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Filter");
 //BA.debugLineNum = 299;BA.debugLine="vue.SetStateSingle(pp, varFilter)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfilter));
 //BA.debugLineNum = 300;BA.debugLine="Chip.Bind(\":filter\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":filter",_pp);
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setfiltericon(String _varfiltericon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 527;BA.debugLine="Sub SetFilterIcon(varFilterIcon As String) As VMCh";
 //BA.debugLineNum = 528;BA.debugLine="If varFilterIcon = \"\" Then Return Me";
if ((_varfiltericon).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 529;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 530;BA.debugLine="SetAttrSingle(\"filter-icon\", varFilterIcon)";
_setattrsingle("filter-icon",_varfiltericon);
 //BA.debugLineNum = 531;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 533;BA.debugLine="Dim pp As String = $\"${ID}FilterIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"FilterIcon");
 //BA.debugLineNum = 534;BA.debugLine="vue.SetStateSingle(pp, varFilterIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfiltericon));
 //BA.debugLineNum = 535;BA.debugLine="Chip.Bind(\":filter-icon\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":filter-icon",_pp);
 //BA.debugLineNum = 536;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 537;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _sethref(String _varhref) throws Exception{
String _pp = "";
 //BA.debugLineNum = 540;BA.debugLine="Sub SetHref(varHref As String) As VMChip";
 //BA.debugLineNum = 541;BA.debugLine="If varHref = \"\" Then Return Me";
if ((_varhref).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 542;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 543;BA.debugLine="SetAttrSingle(\"href\", varHref)";
_setattrsingle("href",_varhref);
 //BA.debugLineNum = 544;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 546;BA.debugLine="Dim pp As String = $\"${ID}Href\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Href");
 //BA.debugLineNum = 547;BA.debugLine="vue.SetStateSingle(pp, varHref)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhref));
 //BA.debugLineNum = 548;BA.debugLine="Chip.Bind(\":href\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":href",_pp);
 //BA.debugLineNum = 549;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 550;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _seticon(String _iconname,String _position) throws Exception{
b4j.example.vmicon _c6a = null;
 //BA.debugLineNum = 93;BA.debugLine="Sub SetIcon(iconName As String, position As String";
 //BA.debugLineNum = 94;BA.debugLine="If position = \"\" Then position = \"left\"";
if ((_position).equals("")) { 
_position = "left";};
 //BA.debugLineNum = 95;BA.debugLine="sPos = position";
_spos = _position;
 //BA.debugLineNum = 96;BA.debugLine="Dim c6a As VMIcon";
_c6a = new b4j.example.vmicon();
 //BA.debugLineNum = 97;BA.debugLine="c6a.Initialize(vue, $\"${ID}a\"$, Module).SetStatic";
_c6a._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"a"),_module)._setstatic /*b4j.example.vmicon*/ (_bstatic)._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 98;BA.debugLine="c6a.SetAttributes(Array(position))";
_c6a._setattributes /*b4j.example.vmicon*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_position)}));
 //BA.debugLineNum = 99;BA.debugLine="c6a.SetText(iconName)";
_c6a._settext /*b4j.example.vmicon*/ (_iconname);
 //BA.debugLineNum = 100;BA.debugLine="icon = c6a.ToString";
_icon = _c6a._tostring /*String*/ ();
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setimage(String _url,String _position) throws Exception{
b4j.example.vmavatar _c6a = null;
 //BA.debugLineNum = 82;BA.debugLine="Sub SetImage(url As String, position As String) As";
 //BA.debugLineNum = 83;BA.debugLine="If position = \"\" Then position = \"left\"";
if ((_position).equals("")) { 
_position = "left";};
 //BA.debugLineNum = 84;BA.debugLine="sPos = position";
_spos = _position;
 //BA.debugLineNum = 85;BA.debugLine="Dim c6a As VMAvatar";
_c6a = new b4j.example.vmavatar();
 //BA.debugLineNum = 86;BA.debugLine="c6a.Initialize(vue, $\"${ID}a\"$, Module).SetStatic";
_c6a._initialize /*b4j.example.vmavatar*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"a"),_module)._setstatic /*b4j.example.vmavatar*/ (_bstatic)._setdesignmode /*b4j.example.vmavatar*/ (_designmode);
 //BA.debugLineNum = 87;BA.debugLine="c6a.SetAttributes(Array(position))";
_c6a._setattributes /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_position)}));
 //BA.debugLineNum = 88;BA.debugLine="c6a.SetImage(url, \"\", Null, Null, Null)";
_c6a._setimage /*b4j.example.vmavatar*/ (_url,"",(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__c.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 89;BA.debugLine="icon = c6a.ToString";
_icon = _c6a._tostring /*String*/ ();
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setinputvalue(String _varinputvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 553;BA.debugLine="Sub SetInputValue(varInputValue As String) As VMCh";
 //BA.debugLineNum = 554;BA.debugLine="If varInputValue = \"\" Then Return Me";
if ((_varinputvalue).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 555;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 556;BA.debugLine="SetAttrSingle(\"input-value\", varInputValue)";
_setattrsingle("input-value",_varinputvalue);
 //BA.debugLineNum = 557;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 559;BA.debugLine="Dim pp As String = $\"${ID}InputValue\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"InputValue");
 //BA.debugLineNum = 560;BA.debugLine="vue.SetStateSingle(pp, varInputValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varinputvalue));
 //BA.debugLineNum = 561;BA.debugLine="Chip.Bind(\":input-value\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":input-value",_pp);
 //BA.debugLineNum = 562;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setlabel(boolean _varlabel) throws Exception{
String _pp = "";
 //BA.debugLineNum = 305;BA.debugLine="Sub SetLabel(varLabel As Boolean) As VMChip";
 //BA.debugLineNum = 306;BA.debugLine="If varLabel = False Then Return Me";
if (_varlabel==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 307;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 308;BA.debugLine="SetAttrSingle(\"label\", varLabel)";
_setattrsingle("label",BA.ObjectToString(_varlabel));
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 311;BA.debugLine="Dim pp As String = $\"${ID}Label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Label");
 //BA.debugLineNum = 312;BA.debugLine="vue.SetStateSingle(pp, varLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlabel));
 //BA.debugLineNum = 313;BA.debugLine="Chip.Bind(\":label\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":label",_pp);
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setlarge(boolean _varlarge) throws Exception{
String _pp = "";
 //BA.debugLineNum = 318;BA.debugLine="Sub SetLarge(varLarge As Boolean) As VMChip";
 //BA.debugLineNum = 319;BA.debugLine="If varLarge = False Then Return Me";
if (_varlarge==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 320;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 321;BA.debugLine="SetAttrSingle(\"large\", varLarge)";
_setattrsingle("large",BA.ObjectToString(_varlarge));
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 324;BA.debugLine="Dim pp As String = $\"${ID}Large\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Large");
 //BA.debugLineNum = 325;BA.debugLine="vue.SetStateSingle(pp, varLarge)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlarge));
 //BA.debugLineNum = 326;BA.debugLine="Chip.Bind(\":large\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":large",_pp);
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 331;BA.debugLine="Sub SetLight(varLight As Boolean) As VMChip";
 //BA.debugLineNum = 332;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 333;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 334;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 337;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 338;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 339;BA.debugLine="Chip.Bind(\":light\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setlink(boolean _varlink) throws Exception{
String _pp = "";
 //BA.debugLineNum = 344;BA.debugLine="Sub SetLink(varLink As Boolean) As VMChip";
 //BA.debugLineNum = 345;BA.debugLine="If varLink = False Then Return Me";
if (_varlink==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 346;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 347;BA.debugLine="SetAttrSingle(\"link\", varLink)";
_setattrsingle("link",BA.ObjectToString(_varlink));
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 350;BA.debugLine="Dim pp As String = $\"${ID}Link\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Link");
 //BA.debugLineNum = 351;BA.debugLine="vue.SetStateSingle(pp, varLink)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlink));
 //BA.debugLineNum = 352;BA.debugLine="Chip.Bind(\":link\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":link",_pp);
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 734;BA.debugLine="Sub SetMarginAll(p As String) As VMChip";
 //BA.debugLineNum = 735;BA.debugLine="Chip.setmarginall(p)";
_chip._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 736;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 737;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 751;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 752;BA.debugLine="Chip.SetName(varName, bbind)";
_chip._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 753;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 754;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setnuxt(boolean _varnuxt) throws Exception{
String _pp = "";
 //BA.debugLineNum = 357;BA.debugLine="Sub SetNuxt(varNuxt As Boolean) As VMChip";
 //BA.debugLineNum = 358;BA.debugLine="If varNuxt = False Then Return Me";
if (_varnuxt==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 359;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 360;BA.debugLine="SetAttrSingle(\"nuxt\", varNuxt)";
_setattrsingle("nuxt",BA.ObjectToString(_varnuxt));
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 363;BA.debugLine="Dim pp As String = $\"${ID}Nuxt\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Nuxt");
 //BA.debugLineNum = 364;BA.debugLine="vue.SetStateSingle(pp, varNuxt)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnuxt));
 //BA.debugLineNum = 365;BA.debugLine="Chip.Bind(\":nuxt\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":nuxt",_pp);
 //BA.debugLineNum = 366;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setonclick(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 646;BA.debugLine="Sub SetOnClick(methodName As String) As VMChip";
 //BA.debugLineNum = 647;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 648;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 649;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 650;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 651;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 653;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 654;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 655;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setonclickclose(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 658;BA.debugLine="Sub SetOnClickClose(methodName As String) As VMChi";
 //BA.debugLineNum = 659;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 660;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 661;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 662;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 663;BA.debugLine="SetAttr(CreateMap(\"@click:close\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:close"),(Object)(_methodname)}));
 //BA.debugLineNum = 665;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 666;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 667;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setoninput(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 670;BA.debugLine="Sub SetOnInput(methodName As String) As VMChip";
 //BA.debugLineNum = 671;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 672;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 673;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 674;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 675;BA.debugLine="SetAttr(CreateMap(\"@input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_methodname)}));
 //BA.debugLineNum = 677;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 678;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setonupdateactive(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 682;BA.debugLine="Sub SetOnUpdateActive(methodName As String) As VMC";
 //BA.debugLineNum = 683;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 684;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 685;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 686;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 687;BA.debugLine="SetAttr(CreateMap(\"@update:active\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:active"),(Object)(_methodname)}));
 //BA.debugLineNum = 689;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 690;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setoutlined(boolean _varoutlined) throws Exception{
String _pp = "";
 //BA.debugLineNum = 370;BA.debugLine="Sub SetOutlined(varOutlined As Boolean) As VMChip";
 //BA.debugLineNum = 371;BA.debugLine="If varOutlined = False Then Return Me";
if (_varoutlined==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 372;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 373;BA.debugLine="SetAttrSingle(\"outlined\", varOutlined)";
_setattrsingle("outlined",BA.ObjectToString(_varoutlined));
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 376;BA.debugLine="Dim pp As String = $\"${ID}Outlined\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Outlined");
 //BA.debugLineNum = 377;BA.debugLine="vue.SetStateSingle(pp, varOutlined)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoutlined));
 //BA.debugLineNum = 378;BA.debugLine="Chip.Bind(\":outlined\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":outlined",_pp);
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 729;BA.debugLine="Sub SetPaddingAll(p As String) As VMChip";
 //BA.debugLineNum = 730;BA.debugLine="Chip.SetPaddingAll(p)";
_chip._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 731;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 732;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setpill(boolean _varpill) throws Exception{
String _pp = "";
 //BA.debugLineNum = 383;BA.debugLine="Sub SetPill(varPill As Boolean) As VMChip";
 //BA.debugLineNum = 384;BA.debugLine="If varPill = False Then Return Me";
if (_varpill==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 385;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 386;BA.debugLine="SetAttrSingle(\"pill\", varPill)";
_setattrsingle("pill",BA.ObjectToString(_varpill));
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 389;BA.debugLine="Dim pp As String = $\"${ID}Pill\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Pill");
 //BA.debugLineNum = 390;BA.debugLine="vue.SetStateSingle(pp, varPill)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpill));
 //BA.debugLineNum = 391;BA.debugLine="Chip.Bind(\":pill\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":pill",_pp);
 //BA.debugLineNum = 392;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMChi";
 //BA.debugLineNum = 59;BA.debugLine="Chip.SetRC(sRow, sCol)";
_chip._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setreplace(boolean _varreplace) throws Exception{
String _pp = "";
 //BA.debugLineNum = 396;BA.debugLine="Sub SetReplace(varReplace As Boolean) As VMChip";
 //BA.debugLineNum = 397;BA.debugLine="If varReplace = False Then Return Me";
if (_varreplace==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 398;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 399;BA.debugLine="SetAttrSingle(\"replace\", varReplace)";
_setattrsingle("replace",BA.ObjectToString(_varreplace));
 //BA.debugLineNum = 400;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 402;BA.debugLine="Dim pp As String = $\"${ID}Replace\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Replace");
 //BA.debugLineNum = 403;BA.debugLine="vue.SetStateSingle(pp, varReplace)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreplace));
 //BA.debugLineNum = 404;BA.debugLine="Chip.Bind(\":replace\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":replace",_pp);
 //BA.debugLineNum = 405;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setripple(boolean _varripple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 409;BA.debugLine="Sub SetRipple(varRipple As Boolean) As VMChip";
 //BA.debugLineNum = 410;BA.debugLine="If varRipple = False Then Return Me";
if (_varripple==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 411;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 412;BA.debugLine="SetAttrSingle(\"ripple\", varRipple)";
_setattrsingle("ripple",BA.ObjectToString(_varripple));
 //BA.debugLineNum = 413;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 415;BA.debugLine="Dim pp As String = $\"${ID}Ripple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Ripple");
 //BA.debugLineNum = 416;BA.debugLine="vue.SetStateSingle(pp, varRipple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varripple));
 //BA.debugLineNum = 417;BA.debugLine="Chip.Bind(\":ripple\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":ripple",_pp);
 //BA.debugLineNum = 418;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setsmall(boolean _varsmall) throws Exception{
String _pp = "";
 //BA.debugLineNum = 422;BA.debugLine="Sub SetSmall(varSmall As Boolean) As VMChip";
 //BA.debugLineNum = 423;BA.debugLine="If varSmall = False Then Return Me";
if (_varsmall==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 424;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 425;BA.debugLine="SetAttrSingle(\"small\", varSmall)";
_setattrsingle("small",BA.ObjectToString(_varsmall));
 //BA.debugLineNum = 426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 428;BA.debugLine="Dim pp As String = $\"${ID}Small\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Small");
 //BA.debugLineNum = 429;BA.debugLine="vue.SetStateSingle(pp, varSmall)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsmall));
 //BA.debugLineNum = 430;BA.debugLine="Chip.Bind(\":small\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":small",_pp);
 //BA.debugLineNum = 431;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetStatic(b As Boolean) As VMChip";
 //BA.debugLineNum = 52;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 53;BA.debugLine="Chip.SetStatic(b)";
_chip._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetStyle(sm As Map) As VMChip";
 //BA.debugLineNum = 196;BA.debugLine="Chip.SetStyle(sm)";
_chip._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 757;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 758;BA.debugLine="Chip.SetStyleSingle(prop, value)";
_chip._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 759;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 760;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 745;BA.debugLine="Sub SetTabIndex(ti As String) As VMChip";
 //BA.debugLineNum = 746;BA.debugLine="Chip.SetTabIndex(ti)";
_chip._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 747;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 748;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _settag(String _vartag) throws Exception{
String _pp = "";
 //BA.debugLineNum = 566;BA.debugLine="Sub SetTag(varTag As String) As VMChip";
 //BA.debugLineNum = 567;BA.debugLine="If varTag = \"\" Then Return Me";
if ((_vartag).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 568;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 569;BA.debugLine="SetAttrSingle(\"tag\", varTag)";
_setattrsingle("tag",_vartag);
 //BA.debugLineNum = 570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 572;BA.debugLine="Dim pp As String = $\"${ID}Tag\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tag");
 //BA.debugLineNum = 573;BA.debugLine="vue.SetStateSingle(pp, varTag)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartag));
 //BA.debugLineNum = 574;BA.debugLine="Chip.Bind(\":tag\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":tag",_pp);
 //BA.debugLineNum = 575;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 576;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _settarget(String _vartarget) throws Exception{
String _pp = "";
 //BA.debugLineNum = 579;BA.debugLine="Sub SetTarget(varTarget As String) As VMChip";
 //BA.debugLineNum = 580;BA.debugLine="If varTarget = \"\" Then Return Me";
if ((_vartarget).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 581;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 582;BA.debugLine="SetAttrSingle(\"target\", varTarget)";
_setattrsingle("target",_vartarget);
 //BA.debugLineNum = 583;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 585;BA.debugLine="Dim pp As String = $\"${ID}Target\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Target");
 //BA.debugLineNum = 586;BA.debugLine="vue.SetStateSingle(pp, varTarget)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartarget));
 //BA.debugLineNum = 587;BA.debugLine="Chip.Bind(\":target\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":target",_pp);
 //BA.debugLineNum = 588;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 589;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _settext(String _t) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetText(t As String) As VMChip";
 //BA.debugLineNum = 173;BA.debugLine="content = t";
_content = _t;
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _settextcolor(String _textcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 592;BA.debugLine="Sub SetTextColor(textcolor As String) As VMChip";
 //BA.debugLineNum = 593;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 594;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 595;BA.debugLine="SetAttrSingle(\"text-color\", textcolor)";
_setattrsingle("text-color",_textcolor);
 //BA.debugLineNum = 596;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 598;BA.debugLine="Dim pp As String = $\"${ID}TextColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"TextColor");
 //BA.debugLineNum = 599;BA.debugLine="vue.SetStateSingle(pp, textcolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_textcolor));
 //BA.debugLineNum = 600;BA.debugLine="Chip.Bind(\":text-color\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":text-color",_pp);
 //BA.debugLineNum = 601;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 602;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _settextcolorintensity(String _textcolor,String _textintensity) throws Exception{
String _mcolor = "";
String _pp = "";
 //BA.debugLineNum = 606;BA.debugLine="Sub SetTextColorIntensity(textcolor As String, tex";
 //BA.debugLineNum = 607;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 608;BA.debugLine="Dim mcolor As String = $\"${textcolor} ${textinten";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+" "+__c.SmartStringFormatter("",(Object)(_textintensity))+"");
 //BA.debugLineNum = 609;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 610;BA.debugLine="SetAttrSingle(\"text-color\", mcolor)";
_setattrsingle("text-color",_mcolor);
 //BA.debugLineNum = 611;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 613;BA.debugLine="Dim pp As String = $\"${ID}TextColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"TextColor");
 //BA.debugLineNum = 614;BA.debugLine="vue.SetStateSingle(pp, mcolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_mcolor));
 //BA.debugLineNum = 615;BA.debugLine="Chip.Bind(\":text-color\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":text-color",_pp);
 //BA.debugLineNum = 616;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 617;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setto(String _varto) throws Exception{
String _pp = "";
 //BA.debugLineNum = 620;BA.debugLine="Sub SetTo(varTo As String) As VMChip";
 //BA.debugLineNum = 621;BA.debugLine="If varTo = \"\" Then Return Me";
if ((_varto).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 622;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 623;BA.debugLine="SetAttrSingle(\"to\", varTo)";
_setattrsingle("to",_varto);
 //BA.debugLineNum = 624;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 626;BA.debugLine="Dim pp As String = $\"${ID}To\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"To");
 //BA.debugLineNum = 627;BA.debugLine="vue.SetStateSingle(pp, varTo)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varto));
 //BA.debugLineNum = 628;BA.debugLine="Chip.Bind(\":to\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":to",_pp);
 //BA.debugLineNum = 629;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 630;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setvalue(String _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 633;BA.debugLine="Sub SetValue(varValue As String) As VMChip";
 //BA.debugLineNum = 634;BA.debugLine="If varValue = \"\" Then Return Me";
if ((_varvalue).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 635;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 636;BA.debugLine="Chip.SetValue(varValue, False)";
_chip._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 637;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 639;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 640;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue));
 //BA.debugLineNum = 641;BA.debugLine="Chip.Bind(\":value\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":value",_pp);
 //BA.debugLineNum = 642;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 643;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 43;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 44;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 45;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 46;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 47;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetVIf(vif As String) As VMChip";
 //BA.debugLineNum = 150;BA.debugLine="Chip.SetVIf(vif)";
_chip._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetVModel(k As String) As VMChip";
 //BA.debugLineNum = 145;BA.debugLine="Chip.SetVModel(k)";
_chip._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetVShow(vif As String) As VMChip";
 //BA.debugLineNum = 155;BA.debugLine="Chip.SetVShow(vif)";
_chip._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setxlarge(boolean _varxlarge) throws Exception{
String _pp = "";
 //BA.debugLineNum = 435;BA.debugLine="Sub SetXLarge(varXLarge As Boolean) As VMChip";
 //BA.debugLineNum = 436;BA.debugLine="If varXLarge = False Then Return Me";
if (_varxlarge==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 437;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 438;BA.debugLine="SetAttrSingle(\"x-large\", varXLarge)";
_setattrsingle("x-large",BA.ObjectToString(_varxlarge));
 //BA.debugLineNum = 439;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 441;BA.debugLine="Dim pp As String = $\"${ID}XLarge\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"XLarge");
 //BA.debugLineNum = 442;BA.debugLine="vue.SetStateSingle(pp, varXLarge)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varxlarge));
 //BA.debugLineNum = 443;BA.debugLine="Chip.Bind(\":x-large\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":x-large",_pp);
 //BA.debugLineNum = 444;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setxsmall(boolean _varxsmall) throws Exception{
String _pp = "";
 //BA.debugLineNum = 448;BA.debugLine="Sub SetXSmall(varXSmall As Boolean) As VMChip";
 //BA.debugLineNum = 449;BA.debugLine="If varXSmall = False Then Return Me";
if (_varxsmall==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 450;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 451;BA.debugLine="SetAttrSingle(\"x-small\", varXSmall)";
_setattrsingle("x-small",BA.ObjectToString(_varxsmall));
 //BA.debugLineNum = 452;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 };
 //BA.debugLineNum = 454;BA.debugLine="Dim pp As String = $\"${ID}XSmall\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"XSmall");
 //BA.debugLineNum = 455;BA.debugLine="vue.SetStateSingle(pp, varXSmall)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varxsmall));
 //BA.debugLineNum = 456;BA.debugLine="Chip.Bind(\":x-small\", pp)";
_chip._bind /*b4j.example.vmelement*/ (":x-small",_pp);
 //BA.debugLineNum = 457;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _show() throws Exception{
 //BA.debugLineNum = 699;BA.debugLine="Sub Show As VMChip";
 //BA.debugLineNum = 700;BA.debugLine="SetActive(True)";
_setactive(__c.True);
 //BA.debugLineNum = 701;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 702;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 122;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 123;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 124;BA.debugLine="Dim eName As String = $\"${ID}_click\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_click");
 //BA.debugLineNum = 125;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 126;BA.debugLine="Log($\"VMChip.${eName} event has not been defined";
__c.Log(("VMChip."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 //BA.debugLineNum = 128;BA.debugLine="eName = $\"${ID}_close\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_close");
 //BA.debugLineNum = 129;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 130;BA.debugLine="Log($\"VMChip.${eName} event has not been defined";
__c.Log(("VMChip."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 133;BA.debugLine="Select Case sPos";
switch (BA.switchObjectToInt(_spos,"left","right")) {
case 0: {
 //BA.debugLineNum = 135;BA.debugLine="Chip.SetText(icon)";
_chip._settext /*b4j.example.vmelement*/ (_icon);
 //BA.debugLineNum = 136;BA.debugLine="Chip.SetText(content)";
_chip._settext /*b4j.example.vmelement*/ (_content);
 break; }
case 1: {
 //BA.debugLineNum = 138;BA.debugLine="Chip.SetText(content)";
_chip._settext /*b4j.example.vmelement*/ (_content);
 //BA.debugLineNum = 139;BA.debugLine="Chip.SetText(icon)";
_chip._settext /*b4j.example.vmelement*/ (_icon);
 break; }
}
;
 //BA.debugLineNum = 141;BA.debugLine="Return Chip.ToString";
if (true) return _chip._tostring /*String*/ ();
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
