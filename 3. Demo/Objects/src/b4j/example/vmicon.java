package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmicon extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmicon", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmicon.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _icon = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
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
public b4j.example.vmicon  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 173;BA.debugLine="Sub AddChild(child As VMElement) As VMIcon";
 //BA.debugLineNum = 174;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 175;BA.debugLine="Icon.SetText(childHTML)";
_icon._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 221;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 222;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 223;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmicon  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub AddClass(c As String) As VMIcon";
 //BA.debugLineNum = 204;BA.debugLine="Icon.AddClass(c)";
_icon._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 482;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 483;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 484;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmicon  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 429;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 430;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 431;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 432;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 486;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 487;BA.debugLine="Icon.BuildModel(mprops, mstyles, lclasses, loose)";
_icon._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 488;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Icon As VMElement";
_icon = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="Public Badge As VMBadge";
_badge = new b4j.example.vmbadge();
 //BA.debugLineNum = 11;BA.debugLine="Private hasBadge As Boolean";
_hasbadge = false;
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmicon  _disable() throws Exception{
 //BA.debugLineNum = 422;BA.debugLine="Sub Disable As VMIcon";
 //BA.debugLineNum = 423;BA.debugLine="Icon.Disable(True)";
_icon._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 424;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _enable() throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub Enable As VMIcon";
 //BA.debugLineNum = 418;BA.debugLine="Icon.Enable(True)";
_icon._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _hide() throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Sub Hide As VMIcon";
 //BA.debugLineNum = 408;BA.debugLine="Icon.SetVisible(False)";
_icon._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 16;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="Icon.Initialize(v, ID)";
_icon._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 18;BA.debugLine="Icon.SetTag(\"v-icon\")";
_icon._settag /*b4j.example.vmelement*/ ("v-icon");
 //BA.debugLineNum = 19;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 21;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 22;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="Badge.Initialize(vue, $\"${ID}badge\"$, Module)";
_badge._initialize /*b4j.example.vmbadge*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"badge"),_module);
 //BA.debugLineNum = 24;BA.debugLine="hasBadge = False";
_hasbadge = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="SetOnClick(Module, $\"${sid}_click\"$)";
_setonclick(_module,(""+__c.SmartStringFormatter("",(Object)(_sid))+"_click"));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 199;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmicon  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 436;BA.debugLine="public Sub RemoveAttr(sName As String) As VMIcon";
 //BA.debugLineNum = 437;BA.debugLine="Icon.RemoveAttr(sName)";
_icon._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 438;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub Render";
 //BA.debugLineNum = 169;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmicon  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetAttr(attr As Map) As VMIcon";
 //BA.debugLineNum = 210;BA.debugLine="Icon.SetAttr(attr)";
_icon._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 107;BA.debugLine="Sub SetAttributes(attrs As List) As VMIcon";
 //BA.debugLineNum = 108;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 109;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetAttrLoose(loose As String) As VMIcon";
 //BA.debugLineNum = 115;BA.debugLine="Icon.SetAttrLoose(loose)";
_icon._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 476;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 477;BA.debugLine="Icon.SetAttrSingle(prop, value)";
_icon._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setbadge(String _scontent) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetBadge(scontent As String) As VMIcon";
 //BA.debugLineNum = 53;BA.debugLine="Badge.SetContent(scontent)";
_badge._setcontent /*b4j.example.vmbadge*/ (_scontent);
 //BA.debugLineNum = 54;BA.debugLine="Badge.SetBordered(True)";
_badge._setbordered /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 55;BA.debugLine="Badge.SetOverlap(True)";
_badge._setoverlap /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 56;BA.debugLine="Badge.SetColorIntensity(vue.COLOR_CYAN, vue.INTEN";
_badge._setcolorintensity /*b4j.example.vmbadge*/ (_vue._color_cyan /*String*/ ,_vue._intensity_normal /*String*/ );
 //BA.debugLineNum = 57;BA.debugLine="Badge.SetAvatar(True)";
_badge._setavatar /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 58;BA.debugLine="Badge.SetIcon(\"\")";
_badge._seticon /*b4j.example.vmbadge*/ ("");
 //BA.debugLineNum = 59;BA.debugLine="Badge.SetDot(False)";
_badge._setdot /*b4j.example.vmbadge*/ (__c.False);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setcenteronparent(boolean _b) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetCenterOnParent(b As Boolean) As VMIcon";
 //BA.debugLineNum = 77;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 78;BA.debugLine="Icon.CenterOnParent = True";
_icon._centeronparent /*boolean*/  = __c.True;
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 239;BA.debugLine="Sub SetColor(varColor As String) As VMIcon";
 //BA.debugLineNum = 240;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 241;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 242;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 };
 //BA.debugLineNum = 245;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 246;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 247;BA.debugLine="Icon.Bind(\":color\", pp)";
_icon._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 139;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 140;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 141;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 142;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 143;BA.debugLine="Icon.SetAttrSingle(\"color\", scolor)";
_icon._setattrsingle /*b4j.example.vmelement*/ ("color",_scolor);
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 };
 //BA.debugLineNum = 146;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 147;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 148;BA.debugLine="Icon.Bind(\":color\", pp)";
_icon._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 261;BA.debugLine="Sub SetDark(varDark As Boolean) As VMIcon";
 //BA.debugLineNum = 262;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 263;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 264;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 };
 //BA.debugLineNum = 267;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 268;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 269;BA.debugLine="Icon.Bind(\":dark\", pp)";
_icon._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 30;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setdense(boolean _vardense) throws Exception{
String _pp = "";
 //BA.debugLineNum = 274;BA.debugLine="Sub SetDense(varDense As Boolean) As VMIcon";
 //BA.debugLineNum = 275;BA.debugLine="If varDense = False Then Return Me";
if (_vardense==__c.False) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 276;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 277;BA.debugLine="SetAttrSingle(\"dense\", varDense)";
_setattrsingle("dense",BA.ObjectToString(_vardense));
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 };
 //BA.debugLineNum = 280;BA.debugLine="Dim pp As String = $\"${ID}Dense\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dense");
 //BA.debugLineNum = 281;BA.debugLine="vue.SetStateSingle(pp, varDense)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardense));
 //BA.debugLineNum = 282;BA.debugLine="Icon.Bind(\":dense\", pp)";
_icon._bind /*b4j.example.vmelement*/ (":dense",_pp);
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 452;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMIcon";
 //BA.debugLineNum = 453;BA.debugLine="Icon.SetDesignMode(b)";
_icon._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 454;BA.debugLine="Badge.SetDesignMode(b)";
_badge._setdesignmode /*b4j.example.vmbadge*/ (_b);
 //BA.debugLineNum = 455;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 456;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 90;BA.debugLine="Icon.SetDeviceOffsets(OS, OM, OL, OX)";
_icon._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 102;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 103;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 96;BA.debugLine="Icon.SetDeviceSizes(SS, SM, SL, SX)";
_icon._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMIcon";
 //BA.debugLineNum = 288;BA.debugLine="Icon.SetDisabled(varDisabled)";
_icon._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _sethasbadge(boolean _b) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetHasBadge(b As Boolean) As VMIcon";
 //BA.debugLineNum = 64;BA.debugLine="hasBadge = b";
_hasbadge = _b;
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _seticon(String _t) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetIcon(t As String) As VMIcon";
 //BA.debugLineNum = 180;BA.debugLine="SetText(t)";
_settext(_t);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setlarge(boolean _varlarge) throws Exception{
String _pp = "";
 //BA.debugLineNum = 293;BA.debugLine="Sub SetLarge(varLarge As Boolean) As VMIcon";
 //BA.debugLineNum = 294;BA.debugLine="If varLarge = False Then Return Me";
if (_varlarge==__c.False) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 295;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 296;BA.debugLine="SetAttrSingle(\"large\", varLarge)";
_setattrsingle("large",BA.ObjectToString(_varlarge));
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 };
 //BA.debugLineNum = 299;BA.debugLine="Dim pp As String = $\"${ID}Large\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Large");
 //BA.debugLineNum = 300;BA.debugLine="vue.SetStateSingle(pp, varLarge)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlarge));
 //BA.debugLineNum = 301;BA.debugLine="Icon.Bind(\":large\", pp)";
_icon._bind /*b4j.example.vmelement*/ (":large",_pp);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setleft(boolean _varleft) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub SetLeft(varLeft As Boolean) As VMIcon";
 //BA.debugLineNum = 307;BA.debugLine="If varLeft = False Then Return Me";
if (_varleft==__c.False) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 308;BA.debugLine="Icon.SetAttrLoose(\"left\")";
_icon._setattrloose /*b4j.example.vmelement*/ ("left");
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setlight(Object _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 313;BA.debugLine="Sub SetLight(varLight As Object) As VMIcon";
 //BA.debugLineNum = 314;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 315;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varlight);
 //BA.debugLineNum = 316;BA.debugLine="Icon.Bind(\":light\", pp)";
_icon._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 447;BA.debugLine="Sub SetMarginAll(p As String) As VMIcon";
 //BA.debugLineNum = 448;BA.debugLine="Icon.setmarginall(p)";
_icon._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 449;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 450;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setmedium(boolean _varxsmall) throws Exception{
String _pp = "";
 //BA.debugLineNum = 394;BA.debugLine="Sub SetMedium(varXSmall As Boolean) As VMIcon";
 //BA.debugLineNum = 395;BA.debugLine="If varXSmall = False Then Return Me";
if (_varxsmall==__c.False) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 396;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 397;BA.debugLine="SetAttrSingle(\"medium\", varXSmall)";
_setattrsingle("medium",BA.ObjectToString(_varxsmall));
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 };
 //BA.debugLineNum = 400;BA.debugLine="Dim pp As String = $\"${ID}XSmall\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"XSmall");
 //BA.debugLineNum = 401;BA.debugLine="vue.SetStateSingle(pp, varXSmall)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varxsmall));
 //BA.debugLineNum = 402;BA.debugLine="Icon.Bind(\":medium\", pp)";
_icon._bind /*b4j.example.vmelement*/ (":medium",_pp);
 //BA.debugLineNum = 403;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 465;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 466;BA.debugLine="Icon.SetName(varName, bbind)";
_icon._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 467;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 468;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setonclick(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 36;BA.debugLine="Sub SetOnClick(EventHandler As Object, methodName";
 //BA.debugLineNum = 37;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 38;BA.debugLine="If SubExists(EventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 39;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 40;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(EventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 41;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 43;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 442;BA.debugLine="Sub SetPaddingAll(p As String) As VMIcon";
 //BA.debugLineNum = 443;BA.debugLine="Icon.SetPaddingAll(p)";
_icon._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 444;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMIco";
 //BA.debugLineNum = 84;BA.debugLine="Icon.SetRC(sRow, sCol)";
_icon._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setright(boolean _varright) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub SetRight(varRight As Boolean) As VMIcon";
 //BA.debugLineNum = 322;BA.debugLine="If varRight = False Then Return Me";
if (_varright==__c.False) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 323;BA.debugLine="Icon.SetAttrLoose(\"right\")";
_icon._setattrloose /*b4j.example.vmelement*/ ("right");
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setsize(String _varsize) throws Exception{
String _pp = "";
 //BA.debugLineNum = 328;BA.debugLine="Sub SetSize(varSize As String) As VMIcon";
 //BA.debugLineNum = 329;BA.debugLine="If varSize = \"\" Then Return Me";
if ((_varsize).equals("")) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 330;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 331;BA.debugLine="SetAttrSingle(\"size\", varSize)";
_setattrsingle("size",_varsize);
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 };
 //BA.debugLineNum = 334;BA.debugLine="Dim pp As String = $\"${ID}Size\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Size");
 //BA.debugLineNum = 335;BA.debugLine="vue.SetStateSingle(pp, varSize)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsize));
 //BA.debugLineNum = 336;BA.debugLine="Icon.Bind(\":size\", pp)";
_icon._bind /*b4j.example.vmelement*/ (":size",_pp);
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setsmall(boolean _varsmall) throws Exception{
String _pp = "";
 //BA.debugLineNum = 341;BA.debugLine="Sub SetSmall(varSmall As Boolean) As VMIcon";
 //BA.debugLineNum = 342;BA.debugLine="If varSmall = False Then Return Me";
if (_varsmall==__c.False) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 343;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 344;BA.debugLine="SetAttrSingle(\"small\", varSmall)";
_setattrsingle("small",BA.ObjectToString(_varsmall));
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 };
 //BA.debugLineNum = 347;BA.debugLine="Dim pp As String = $\"${ID}Small\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Small");
 //BA.debugLineNum = 348;BA.debugLine="vue.SetStateSingle(pp, varSmall)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsmall));
 //BA.debugLineNum = 349;BA.debugLine="Icon.Bind(\":small\", pp)";
_icon._bind /*b4j.example.vmelement*/ (":small",_pp);
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetStatic(b As Boolean) As VMIcon";
 //BA.debugLineNum = 69;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 70;BA.debugLine="Icon.SetStatic(b)";
_icon._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 71;BA.debugLine="Badge.SetStatic(b)";
_badge._setstatic /*b4j.example.vmbadge*/ (_b);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetStyle(sm As Map) As VMIcon";
 //BA.debugLineNum = 216;BA.debugLine="Icon.SetStyle(sm)";
_icon._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 471;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 472;BA.debugLine="Icon.SetStyleSingle(prop, value)";
_icon._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 473;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 474;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 459;BA.debugLine="Sub SetTabIndex(ti As String) As VMIcon";
 //BA.debugLineNum = 460;BA.debugLine="Icon.SetTabIndex(ti)";
_icon._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 461;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _settag(String _vartag) throws Exception{
String _pp = "";
 //BA.debugLineNum = 354;BA.debugLine="Sub SetTag(varTag As String) As VMIcon";
 //BA.debugLineNum = 355;BA.debugLine="If varTag = \"\" Then Return Me";
if ((_vartag).equals("")) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 356;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 357;BA.debugLine="SetAttrSingle(\"tag\", varTag)";
_setattrsingle("tag",_vartag);
 //BA.debugLineNum = 358;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 };
 //BA.debugLineNum = 360;BA.debugLine="Dim pp As String = $\"${ID}Tag\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tag");
 //BA.debugLineNum = 361;BA.debugLine="vue.SetStateSingle(pp, varTag)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartag));
 //BA.debugLineNum = 362;BA.debugLine="Icon.Bind(\":tag\", pp)";
_icon._bind /*b4j.example.vmelement*/ (":tag",_pp);
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _settext(String _t) throws Exception{
String _iconname = "";
 //BA.debugLineNum = 185;BA.debugLine="Sub SetText(t As String) As VMIcon";
 //BA.debugLineNum = 186;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 187;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 188;BA.debugLine="Icon.SetText(t)";
_icon._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 };
 //BA.debugLineNum = 191;BA.debugLine="Dim iconName As String = $\"${ID}icon\"$";
_iconname = (""+__c.SmartStringFormatter("",(Object)(_id))+"icon");
 //BA.debugLineNum = 192;BA.debugLine="vue.SetData(iconName, t)";
_vue._setdata /*b4j.example.bananovue*/ (_iconname,(Object)(_t));
 //BA.debugLineNum = 193;BA.debugLine="Icon.SetText($\"{{ ${iconName} }}\"$)";
_icon._settext /*b4j.example.vmelement*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_iconname))+" }}"));
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 497;BA.debugLine="Sub SetTextColor(varColor As String) As VMIcon";
 //BA.debugLineNum = 498;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 499;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 500;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 501;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 502;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 505;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 506;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 507;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 508;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 509;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 510;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 511;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 512;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setvelse(Object _vif) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub SetVElse(vif As Object) As VMIcon";
 //BA.debugLineNum = 158;BA.debugLine="Icon.SetVElse(vif)";
_icon._setvelse /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub SetVIf(vif As String) As VMIcon";
 //BA.debugLineNum = 153;BA.debugLine="Icon.SetVIf(vif)";
_icon._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 491;BA.debugLine="Sub SetVisible(b As Boolean) As VMIcon";
 //BA.debugLineNum = 492;BA.debugLine="Icon.SetVisible(b)";
_icon._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 493;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 494;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setvonce(boolean _t) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetVOnce(t As Boolean) As VMIcon";
 //BA.debugLineNum = 48;BA.debugLine="Icon.setvonce(t)";
_icon._setvonce /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetVShow(vif As String) As VMIcon";
 //BA.debugLineNum = 163;BA.debugLine="Icon.SetVShow(vif)";
_icon._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetVText(vhtml As String) As VMIcon";
 //BA.debugLineNum = 134;BA.debugLine="Icon.SetVText(vhtml)";
_icon._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setxlarge(boolean _varxlarge) throws Exception{
String _pp = "";
 //BA.debugLineNum = 367;BA.debugLine="Sub SetXLarge(varXLarge As Boolean) As VMIcon";
 //BA.debugLineNum = 368;BA.debugLine="If varXLarge = False Then Return Me";
if (_varxlarge==__c.False) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 369;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 370;BA.debugLine="SetAttrSingle(\"x-large\", varXLarge)";
_setattrsingle("x-large",BA.ObjectToString(_varxlarge));
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 };
 //BA.debugLineNum = 373;BA.debugLine="Dim pp As String = $\"${ID}XLarge\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"XLarge");
 //BA.debugLineNum = 374;BA.debugLine="vue.SetStateSingle(pp, varXLarge)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varxlarge));
 //BA.debugLineNum = 375;BA.debugLine="Icon.Bind(\":x-large\", pp)";
_icon._bind /*b4j.example.vmelement*/ (":x-large",_pp);
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setxsmall(boolean _varxsmall) throws Exception{
String _pp = "";
 //BA.debugLineNum = 380;BA.debugLine="Sub SetXSmall(varXSmall As Boolean) As VMIcon";
 //BA.debugLineNum = 381;BA.debugLine="If varXSmall = False Then Return Me";
if (_varxsmall==__c.False) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 382;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 383;BA.debugLine="SetAttrSingle(\"x-small\", varXSmall)";
_setattrsingle("x-small",BA.ObjectToString(_varxsmall));
 //BA.debugLineNum = 384;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 };
 //BA.debugLineNum = 386;BA.debugLine="Dim pp As String = $\"${ID}XSmall\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"XSmall");
 //BA.debugLineNum = 387;BA.debugLine="vue.SetStateSingle(pp, varXSmall)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varxsmall));
 //BA.debugLineNum = 388;BA.debugLine="Icon.Bind(\":x-small\", pp)";
_icon._bind /*b4j.example.vmelement*/ (":x-small",_pp);
 //BA.debugLineNum = 389;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _show() throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Sub Show As VMIcon";
 //BA.debugLineNum = 413;BA.debugLine="Icon.SetVisible(True)";
_icon._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 121;BA.debugLine="If hasBadge = False Then";
if (_hasbadge==__c.False) { 
 //BA.debugLineNum = 122;BA.debugLine="Return Icon.ToString";
if (true) return _icon._tostring /*String*/ ();
 };
 //BA.debugLineNum = 124;BA.debugLine="If Badge.HasContent Then";
if (_badge._hascontent /*boolean*/ ) { 
 //BA.debugLineNum = 125;BA.debugLine="Badge.AddComponent(Icon.ToString)";
_badge._addcomponent /*b4j.example.vmbadge*/ (_icon._tostring /*String*/ ());
 //BA.debugLineNum = 126;BA.debugLine="Return Badge.tostring";
if (true) return _badge._tostring /*String*/ ();
 }else {
 //BA.debugLineNum = 128;BA.debugLine="Return Icon.ToString";
if (true) return _icon._tostring /*String*/ ();
 };
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmicon  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 228;BA.debugLine="Sub UseTheme(themeName As String) As VMIcon";
 //BA.debugLineNum = 229;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 230;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 231;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 232;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 233;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
