package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmbadge extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmbadge", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmbadge.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _badge = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public boolean _hascontent = false;
public String _smodel = "";
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
public b4j.example.vmbadge  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 114;BA.debugLine="Sub AddChild(child As VMElement) As VMBadge";
 //BA.debugLineNum = 115;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 116;BA.debugLine="Badge.SetText(childHTML)";
_badge._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 150;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 151;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 152;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbadge  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub AddClass(c As String) As VMBadge";
 //BA.debugLineNum = 133;BA.debugLine="Badge.AddClass(c)";
_badge._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub AddComponent(comp As String) As VMBadge";
 //BA.debugLineNum = 83;BA.debugLine="Badge.SetText(comp)";
_badge._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 481;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 482;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 483;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbadge  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 428;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 429;BA.debugLine="Badge.Bind(prop, stateprop)";
_badge._bind /*b4j.example.vmelement*/ (_prop,_stateprop);
 //BA.debugLineNum = 430;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 485;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 486;BA.debugLine="Badge.BuildModel(mprops, mstyles, lclasses, loose";
_badge._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 487;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 488;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Badge As VMElement";
_badge = new b4j.example.vmelement();
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
 //BA.debugLineNum = 10;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 11;BA.debugLine="Private smodel As String";
_smodel = "";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbadge  _disable() throws Exception{
 //BA.debugLineNum = 422;BA.debugLine="Sub Disable As VMBadge";
 //BA.debugLineNum = 423;BA.debugLine="Badge.Enable(False)";
_badge._enable /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 424;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _enable() throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub Enable As VMBadge";
 //BA.debugLineNum = 418;BA.debugLine="Badge.Enable(True)";
_badge._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _hide() throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Sub Hide As VMBadge";
 //BA.debugLineNum = 408;BA.debugLine="vue.SetData(smodel, False)";
_vue._setdata /*b4j.example.bananovue*/ (_smodel,(Object)(__c.False));
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 16;BA.debugLine="HasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 18;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 19;BA.debugLine="Badge.Initialize(v, ID)";
_badge._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 20;BA.debugLine="Badge.SetTag(\"v-badge\")";
_badge._settag /*b4j.example.vmelement*/ ("v-badge");
 //BA.debugLineNum = 21;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 23;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 24;BA.debugLine="SetVModel(Badge.showkey)";
_setvmodel(_badge._showkey /*String*/ );
 //BA.debugLineNum = 25;BA.debugLine="Show";
_show();
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 128;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbadge  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 433;BA.debugLine="public Sub RemoveAttr(sName As String) As VMBadge";
 //BA.debugLineNum = 434;BA.debugLine="Badge.RemoveAttr(sName)";
_badge._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 435;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 436;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub Render";
 //BA.debugLineNum = 110;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbadge  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetAttr(attr As Map) As VMBadge";
 //BA.debugLineNum = 139;BA.debugLine="Badge.SetAttr(attr)";
_badge._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 46;BA.debugLine="Sub SetAttributes(attrs As List) As VMBadge";
 //BA.debugLineNum = 47;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 48;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetAttrLoose(loose As String) As VMBadge";
 //BA.debugLineNum = 42;BA.debugLine="Badge.SetAttrLoose(loose)";
_badge._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 476;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 477;BA.debugLine="Badge.SetAttrSingle(prop, value)";
_badge._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setavatar(boolean _varavatar) throws Exception{
String _pp = "";
 //BA.debugLineNum = 157;BA.debugLine="Sub SetAvatar(varAvatar As Boolean) As VMBadge";
 //BA.debugLineNum = 158;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 159;BA.debugLine="SetAttrSingle(\"avatar\", varAvatar)";
_setattrsingle("avatar",BA.ObjectToString(_varavatar));
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 162;BA.debugLine="Dim pp As String = $\"${ID}Avatar\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Avatar");
 //BA.debugLineNum = 163;BA.debugLine="vue.SetStateSingle(pp, varAvatar)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varavatar));
 //BA.debugLineNum = 164;BA.debugLine="Badge.Bind(\":avatar\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":avatar",_pp);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setbordered(boolean _varbordered) throws Exception{
String _pp = "";
 //BA.debugLineNum = 169;BA.debugLine="Sub SetBordered(varBordered As Boolean) As VMBadge";
 //BA.debugLineNum = 170;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 171;BA.debugLine="SetAttrSingle(\"bordered\", varBordered)";
_setattrsingle("bordered",BA.ObjectToString(_varbordered));
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 174;BA.debugLine="Dim pp As String = $\"${ID}Bordered\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Bordered");
 //BA.debugLineNum = 175;BA.debugLine="vue.SetStateSingle(pp, varBordered)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbordered));
 //BA.debugLineNum = 176;BA.debugLine="Badge.Bind(\":bordered\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":bordered",_pp);
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setbottom(boolean _varbottom) throws Exception{
String _pp = "";
 //BA.debugLineNum = 181;BA.debugLine="Sub SetBottom(varBottom As Boolean) As VMBadge";
 //BA.debugLineNum = 182;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 183;BA.debugLine="SetAttrSingle(\"bottom\", varBottom)";
_setattrsingle("bottom",BA.ObjectToString(_varbottom));
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 186;BA.debugLine="Dim pp As String = $\"${ID}Bottom\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Bottom");
 //BA.debugLineNum = 187;BA.debugLine="vue.SetStateSingle(pp, varBottom)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbottom));
 //BA.debugLineNum = 188;BA.debugLine="Badge.Bind(\":bottom\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":bottom",_pp);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 193;BA.debugLine="Sub SetColor(varColor As String) As VMBadge";
 //BA.debugLineNum = 194;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 195;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 198;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 199;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 200;BA.debugLine="Badge.Bind(\":color\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 64;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 65;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmbadge)(this);};
 //BA.debugLineNum = 66;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 67;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 68;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 71;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 72;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 73;BA.debugLine="Badge.Bind(\":color\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setcontent(String _varcontent) throws Exception{
String _pp = "";
 //BA.debugLineNum = 205;BA.debugLine="Sub SetContent(varContent As String) As VMBadge";
 //BA.debugLineNum = 206;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 207;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 208;BA.debugLine="SetAttrSingle(\"content\", varContent)";
_setattrsingle("content",_varcontent);
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 211;BA.debugLine="Dim pp As String = $\"${ID}content\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"content");
 //BA.debugLineNum = 212;BA.debugLine="vue.SetStateSingle(pp, varContent)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcontent));
 //BA.debugLineNum = 213;BA.debugLine="Badge.bind(\":content\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":content",_pp);
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 218;BA.debugLine="Sub SetDark(varDark As Boolean) As VMBadge";
 //BA.debugLineNum = 219;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 220;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 223;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 224;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 225;BA.debugLine="Badge.Bind(\":dark\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 30;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 449;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMBadge";
 //BA.debugLineNum = 450;BA.debugLine="Badge.SetDesignMode(b)";
_badge._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 451;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 452;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 453;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 466;BA.debugLine="Sub SetDisabled(b As Boolean) As VMBadge";
 //BA.debugLineNum = 467;BA.debugLine="Badge.SetDisabled(b)";
_badge._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 468;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setdot(boolean _vardot) throws Exception{
String _pp = "";
 //BA.debugLineNum = 230;BA.debugLine="Sub SetDot(varDot As Boolean) As VMBadge";
 //BA.debugLineNum = 231;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 232;BA.debugLine="SetAttrSingle(\"dot\", varDot)";
_setattrsingle("dot",BA.ObjectToString(_vardot));
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 235;BA.debugLine="Dim pp As String = $\"${ID}Dot\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dot");
 //BA.debugLineNum = 236;BA.debugLine="vue.SetStateSingle(pp, varDot)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardot));
 //BA.debugLineNum = 237;BA.debugLine="Badge.Bind(\":dot\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":dot",_pp);
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _seticon(String _varicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 242;BA.debugLine="Sub SetIcon(varIcon As String) As VMBadge";
 //BA.debugLineNum = 243;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 244;BA.debugLine="SetAttrSingle(\"icon\", varIcon)";
_setattrsingle("icon",_varicon);
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 247;BA.debugLine="Dim pp As String = $\"${ID}Icon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Icon");
 //BA.debugLineNum = 248;BA.debugLine="vue.SetStateSingle(pp, varIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varicon));
 //BA.debugLineNum = 249;BA.debugLine="Badge.Bind(\":icon\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":icon",_pp);
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setinline(boolean _varinline) throws Exception{
String _pp = "";
 //BA.debugLineNum = 254;BA.debugLine="Sub SetInline(varInline As Boolean) As VMBadge";
 //BA.debugLineNum = 255;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 256;BA.debugLine="SetAttrSingle(\"inline\", varInline)";
_setattrsingle("inline",BA.ObjectToString(_varinline));
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 259;BA.debugLine="Dim pp As String = $\"${ID}Inline\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Inline");
 //BA.debugLineNum = 260;BA.debugLine="vue.SetStateSingle(pp, varInline)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varinline));
 //BA.debugLineNum = 261;BA.debugLine="Badge.Bind(\":inline\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":inline",_pp);
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setlabel(String _varlabel) throws Exception{
String _pp = "";
 //BA.debugLineNum = 266;BA.debugLine="Sub SetLabel(varLabel As String) As VMBadge";
 //BA.debugLineNum = 267;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 268;BA.debugLine="SetAttrSingle(\"label\", varLabel)";
_setattrsingle("label",_varlabel);
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 271;BA.debugLine="Dim pp As String = $\"${ID}Label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Label");
 //BA.debugLineNum = 272;BA.debugLine="vue.SetStateSingle(pp, varLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlabel));
 //BA.debugLineNum = 273;BA.debugLine="Badge.Bind(\":label\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":label",_pp);
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setleft(boolean _varleft) throws Exception{
String _pp = "";
 //BA.debugLineNum = 278;BA.debugLine="Sub SetLeft(varLeft As Boolean) As VMBadge";
 //BA.debugLineNum = 279;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 280;BA.debugLine="SetAttrSingle(\"left\", varLeft)";
_setattrsingle("left",BA.ObjectToString(_varleft));
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 283;BA.debugLine="Dim pp As String = $\"${ID}Left\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Left");
 //BA.debugLineNum = 284;BA.debugLine="vue.SetStateSingle(pp, varLeft)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varleft));
 //BA.debugLineNum = 285;BA.debugLine="Badge.Bind(\":left\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":left",_pp);
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 290;BA.debugLine="Sub SetLight(varLight As Boolean) As VMBadge";
 //BA.debugLineNum = 291;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 292;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 295;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 296;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 297;BA.debugLine="Badge.Bind(\":light\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 444;BA.debugLine="Sub SetMarginAll(p As String) As VMBadge";
 //BA.debugLineNum = 445;BA.debugLine="Badge.setmarginall(p)";
_badge._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 446;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setmode(String _varmode) throws Exception{
String _pp = "";
 //BA.debugLineNum = 302;BA.debugLine="Sub SetMode(varMode As String) As VMBadge";
 //BA.debugLineNum = 303;BA.debugLine="If varMode = \"\" Then Return Me";
if ((_varmode).equals("")) { 
if (true) return (b4j.example.vmbadge)(this);};
 //BA.debugLineNum = 304;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 305;BA.debugLine="SetAttrSingle(\"mode\", varMode)";
_setattrsingle("mode",_varmode);
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 308;BA.debugLine="Dim pp As String = $\"${ID}Mode\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Mode");
 //BA.debugLineNum = 309;BA.debugLine="vue.SetStateSingle(pp, varMode)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmode));
 //BA.debugLineNum = 310;BA.debugLine="Badge.Bind(\":mode\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":mode",_pp);
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 461;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 462;BA.debugLine="Badge.SetName(varName, bbind)";
_badge._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 463;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setoffsetx(String _varoffsetx) throws Exception{
String _pp = "";
 //BA.debugLineNum = 315;BA.debugLine="Sub SetOffsetX(varOffsetX As String) As VMBadge";
 //BA.debugLineNum = 316;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 317;BA.debugLine="SetAttrSingle(\"offset-x\", varOffsetX)";
_setattrsingle("offset-x",_varoffsetx);
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 320;BA.debugLine="Dim pp As String = $\"${ID}OffsetX\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OffsetX");
 //BA.debugLineNum = 321;BA.debugLine="vue.SetStateSingle(pp, varOffsetX)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoffsetx));
 //BA.debugLineNum = 322;BA.debugLine="Badge.Bind(\":offset-x\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":offset-x",_pp);
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setoffsety(String _varoffsety) throws Exception{
String _pp = "";
 //BA.debugLineNum = 327;BA.debugLine="Sub SetOffsetY(varOffsetY As String) As VMBadge";
 //BA.debugLineNum = 328;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 329;BA.debugLine="SetAttrSingle(\"offset-y\", varOffsetY)";
_setattrsingle("offset-y",_varoffsety);
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 332;BA.debugLine="Dim pp As String = $\"${ID}OffsetY\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OffsetY");
 //BA.debugLineNum = 333;BA.debugLine="vue.SetStateSingle(pp, varOffsetY)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoffsety));
 //BA.debugLineNum = 334;BA.debugLine="Badge.Bind(\":offset-y\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":offset-y",_pp);
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setonlineindicator(boolean _b) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetOnlineIndicator(b As Boolean) As VMBadge";
 //BA.debugLineNum = 54;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbadge)(this);};
 //BA.debugLineNum = 55;BA.debugLine="SetBordered(True)";
_setbordered(__c.True);
 //BA.debugLineNum = 56;BA.debugLine="SetDot(True)";
_setdot(__c.True);
 //BA.debugLineNum = 57;BA.debugLine="SetOffsetX(\"10\")";
_setoffsetx("10");
 //BA.debugLineNum = 58;BA.debugLine="SetOffsetY(\"10\")";
_setoffsety("10");
 //BA.debugLineNum = 59;BA.debugLine="SetBottom(True)";
_setbottom(__c.True);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setorigin(String _varorigin) throws Exception{
String _pp = "";
 //BA.debugLineNum = 339;BA.debugLine="Sub SetOrigin(varOrigin As String) As VMBadge";
 //BA.debugLineNum = 340;BA.debugLine="If varOrigin = \"\" Then Return Me";
if ((_varorigin).equals("")) { 
if (true) return (b4j.example.vmbadge)(this);};
 //BA.debugLineNum = 341;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 342;BA.debugLine="SetAttrSingle(\"origin\", varOrigin)";
_setattrsingle("origin",_varorigin);
 //BA.debugLineNum = 343;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 345;BA.debugLine="Dim pp As String = $\"${ID}Origin\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Origin");
 //BA.debugLineNum = 346;BA.debugLine="vue.SetStateSingle(pp, varOrigin)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varorigin));
 //BA.debugLineNum = 347;BA.debugLine="Badge.Bind(\":origin\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":origin",_pp);
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setoverlap(boolean _varoverlap) throws Exception{
String _pp = "";
 //BA.debugLineNum = 352;BA.debugLine="Sub SetOverlap(varOverlap As Boolean) As VMBadge";
 //BA.debugLineNum = 353;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 354;BA.debugLine="SetAttrSingle(\"overlap\", varOverlap)";
_setattrsingle("overlap",BA.ObjectToString(_varoverlap));
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 357;BA.debugLine="Dim pp As String = $\"${ID}Overlap\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Overlap");
 //BA.debugLineNum = 358;BA.debugLine="vue.SetStateSingle(pp, varOverlap)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoverlap));
 //BA.debugLineNum = 359;BA.debugLine="Badge.Bind(\":overlap\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":overlap",_pp);
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 439;BA.debugLine="Sub SetPaddingAll(p As String) As VMBadge";
 //BA.debugLineNum = 440;BA.debugLine="Badge.SetPaddingAll(p)";
_badge._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 441;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 442;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetStatic(b As Boolean) As VMBadge";
 //BA.debugLineNum = 36;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 37;BA.debugLine="Badge.SetStatic(b)";
_badge._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetStyle(sm As Map) As VMBadge";
 //BA.debugLineNum = 145;BA.debugLine="Badge.SetStyle(sm)";
_badge._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 471;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 472;BA.debugLine="Badge.SetStyleSingle(prop, value)";
_badge._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 473;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 474;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 455;BA.debugLine="Sub SetTabIndex(ti As String) As VMBadge";
 //BA.debugLineNum = 456;BA.debugLine="Badge.SetTabIndex(ti)";
_badge._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 457;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _settext(String _t) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetText(t As String) As VMBadge";
 //BA.debugLineNum = 122;BA.debugLine="Badge.SetText(t)";
_badge._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _settile(boolean _vartile) throws Exception{
String _pp = "";
 //BA.debugLineNum = 364;BA.debugLine="Sub SetTile(varTile As Boolean) As VMBadge";
 //BA.debugLineNum = 365;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 366;BA.debugLine="SetAttrSingle(\"tile\", varTile)";
_setattrsingle("tile",BA.ObjectToString(_vartile));
 //BA.debugLineNum = 367;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 369;BA.debugLine="Dim pp As String = $\"${ID}Tile\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tile");
 //BA.debugLineNum = 370;BA.debugLine="vue.SetStateSingle(pp, varTile)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartile));
 //BA.debugLineNum = 371;BA.debugLine="Badge.Bind(\":tile\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":tile",_pp);
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _settransition(String _vartransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 376;BA.debugLine="Sub SetTransition(varTransition As String) As VMBa";
 //BA.debugLineNum = 377;BA.debugLine="If varTransition = \"\" Then Return Me";
if ((_vartransition).equals("")) { 
if (true) return (b4j.example.vmbadge)(this);};
 //BA.debugLineNum = 378;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 379;BA.debugLine="SetAttrSingle(\"transition\", varTransition)";
_setattrsingle("transition",_vartransition);
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 382;BA.debugLine="Dim pp As String = $\"${ID}Transition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Transition");
 //BA.debugLineNum = 383;BA.debugLine="vue.SetStateSingle(pp, varTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartransition));
 //BA.debugLineNum = 384;BA.debugLine="Badge.Bind(\":transition\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":transition",_pp);
 //BA.debugLineNum = 385;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetVIf(vif As String) As VMBadge";
 //BA.debugLineNum = 99;BA.debugLine="Badge.SetVIf(vif)";
_badge._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setvisible(boolean _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 389;BA.debugLine="Sub SetVisible(varValue As Boolean) As VMBadge";
 //BA.debugLineNum = 390;BA.debugLine="If varValue = \"\" Then Return Me";
if (_varvalue==BA.ObjectToBoolean("")) { 
if (true) return (b4j.example.vmbadge)(this);};
 //BA.debugLineNum = 391;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 392;BA.debugLine="Badge.SetValue(varValue,False)";
_badge._setvalue /*b4j.example.vmelement*/ (BA.ObjectToString(_varvalue),__c.False);
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 };
 //BA.debugLineNum = 395;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 396;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue));
 //BA.debugLineNum = 397;BA.debugLine="Badge.Bind(\":value\", pp)";
_badge._bind /*b4j.example.vmelement*/ (":value",_pp);
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 401;BA.debugLine="Sub SetVModel(k As String) As VMBadge";
 //BA.debugLineNum = 402;BA.debugLine="smodel = k";
_smodel = _k;
 //BA.debugLineNum = 403;BA.debugLine="Badge.SetVModel(k)";
_badge._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 404;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetVShow(vif As String) As VMBadge";
 //BA.debugLineNum = 104;BA.debugLine="Badge.SetVShow(vif)";
_badge._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _show() throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Sub Show As VMBadge";
 //BA.debugLineNum = 413;BA.debugLine="vue.SetData(smodel, True)";
_vue._setdata /*b4j.example.bananovue*/ (_smodel,(Object)(__c.True));
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 79;BA.debugLine="Return Badge.ToString";
if (true) return _badge._tostring /*String*/ ();
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbadge  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 88;BA.debugLine="Sub UseTheme(themeName As String) As VMBadge";
 //BA.debugLineNum = 89;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 90;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 91;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 92;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 93;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
