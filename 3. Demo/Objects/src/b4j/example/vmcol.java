package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcol extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmcol", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcol.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _col = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
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
public b4j.example.vmcol  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 72;BA.debugLine="Sub AddChild(child As VMElement) As VMCol";
 //BA.debugLineNum = 73;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 74;BA.debugLine="Col.SetText(childHTML)";
_col._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 103;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 104;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 105;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcol  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub AddClass(c As String) As VMCol";
 //BA.debugLineNum = 86;BA.debugLine="Col.AddClass(c)";
_col._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub AddComponent(comp As String) As VMCol";
 //BA.debugLineNum = 269;BA.debugLine="Col.SetText(comp)";
_col._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _addcontentlist(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub AddContentList(lst As List) As VMCol";
 //BA.debugLineNum = 57;BA.debugLine="Col.AddContentList(lst)";
_col._addcontentlist /*b4j.example.vmelement*/ (_lst);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 239;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 240;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 291;BA.debugLine="Col.BuildModel(mprops, mstyles, lclasses, loose)";
_col._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Col As VMElement";
_col = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean   'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object    'ignore";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcol  _disable() throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub Disable As VMCol";
 //BA.debugLineNum = 232;BA.debugLine="Col.Disable(True)";
_col._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _enable() throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub Enable As VMCol";
 //BA.debugLineNum = 227;BA.debugLine="Col.Enable(True)";
_col._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _hide() throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub Hide As VMCol";
 //BA.debugLineNum = 217;BA.debugLine="Col.SetVisible(False)";
_col._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="Col.Initialize(v, ID)";
_col._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 15;BA.debugLine="Col.SetTag(\"v-col\")";
_col._settag /*b4j.example.vmelement*/ ("v-col");
 //BA.debugLineNum = 16;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 18;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 81;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcol  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="public Sub RemoveAttr(sName As String) As VMCol";
 //BA.debugLineNum = 246;BA.debugLine="Col.RemoveAttr(sName)";
_col._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub Render";
 //BA.debugLineNum = 68;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcol  _setalignself(String _varalignself) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetAlignSelf(varAlignSelf As String) As VMCol";
 //BA.debugLineNum = 111;BA.debugLine="Col.SetAttrSingle(\"align-self\", varAlignSelf)";
_col._setattrsingle /*b4j.example.vmelement*/ ("align-self",_varalignself);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetAttr(attr As Map) As VMCol";
 //BA.debugLineNum = 92;BA.debugLine="Col.SetAttr(attr)";
_col._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 28;BA.debugLine="Sub SetAttributes(attrs As List) As VMCol";
 //BA.debugLineNum = 29;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 30;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetAttrLoose(loose As String) As VMCol";
 //BA.debugLineNum = 24;BA.debugLine="Col.SetAttrLoose(loose)";
_col._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 286;BA.debugLine="Col.SetAttrSingle(prop, value)";
_col._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setcols(String _varcols) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetCols(varCols As String) As VMCol";
 //BA.debugLineNum = 117;BA.debugLine="Col.SetAttrSingle(\"cols\", varCols)";
_col._setattrsingle /*b4j.example.vmelement*/ ("cols",_varcols);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 36;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMCol";
 //BA.debugLineNum = 262;BA.debugLine="Col.SetDesignMode(b)";
_col._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 263;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setlg(String _varlg) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetLg(varLg As String) As VMCol";
 //BA.debugLineNum = 123;BA.debugLine="Col.SetAttrSingle(\"lg\", varLg)";
_col._setattrsingle /*b4j.example.vmelement*/ ("lg",_varlg);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub SetMarginAll(p As String) As VMCol";
 //BA.debugLineNum = 257;BA.debugLine="Col.setmarginall(p)";
_col._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setmd(String _varmd) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetMd(varMd As String) As VMCol";
 //BA.debugLineNum = 129;BA.debugLine="Col.SetAttrSingle(\"md\", varMd)";
_col._setattrsingle /*b4j.example.vmelement*/ ("md",_varmd);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 275;BA.debugLine="Col.SetName(varName, bbind)";
_col._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setoffset(String _varoffset) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetOffset(varOffset As String) As VMCol";
 //BA.debugLineNum = 135;BA.debugLine="Col.SetAttrSingle(\"offset\", varOffset)";
_col._setattrsingle /*b4j.example.vmelement*/ ("offset",_varoffset);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setoffsetlg(String _varoffsetlg) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetOffsetLg(varOffsetLg As String) As VMCol";
 //BA.debugLineNum = 141;BA.debugLine="If varOffsetLg = \"0\" Then Return Me";
if ((_varoffsetlg).equals("0")) { 
if (true) return (b4j.example.vmcol)(this);};
 //BA.debugLineNum = 142;BA.debugLine="Col.SetAttrSingle(\"offset-lg\", varOffsetLg)";
_col._setattrsingle /*b4j.example.vmelement*/ ("offset-lg",_varoffsetlg);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setoffsetmd(String _varoffsetmd) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetOffsetMd(varOffsetMd As String) As VMCol";
 //BA.debugLineNum = 148;BA.debugLine="If varOffsetMd = \"0\" Then Return Me";
if ((_varoffsetmd).equals("0")) { 
if (true) return (b4j.example.vmcol)(this);};
 //BA.debugLineNum = 149;BA.debugLine="Col.SetAttrSingle(\"offset-md\", varOffsetMd)";
_col._setattrsingle /*b4j.example.vmelement*/ ("offset-md",_varoffsetmd);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setoffsetsm(String _varoffsetsm) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetOffsetSm(varOffsetSm As String) As VMCol";
 //BA.debugLineNum = 155;BA.debugLine="If varOffsetSm = \"0\" Then Return Me";
if ((_varoffsetsm).equals("0")) { 
if (true) return (b4j.example.vmcol)(this);};
 //BA.debugLineNum = 156;BA.debugLine="Col.SetAttrSingle(\"offset-sm\", varOffsetSm)";
_col._setattrsingle /*b4j.example.vmelement*/ ("offset-sm",_varoffsetsm);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setoffsetxl(String _varoffsetxl) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetOffsetXl(varOffsetXl As String) As VMCol";
 //BA.debugLineNum = 162;BA.debugLine="If varOffsetXl = \"0\" Then Return Me";
if ((_varoffsetxl).equals("0")) { 
if (true) return (b4j.example.vmcol)(this);};
 //BA.debugLineNum = 163;BA.debugLine="Col.SetAttrSingle(\"offset-xl\", varOffsetXl)";
_col._setattrsingle /*b4j.example.vmelement*/ ("offset-xl",_varoffsetxl);
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setorder(String _varorder) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetOrder(varOrder As String) As VMCol";
 //BA.debugLineNum = 169;BA.debugLine="Col.SetAttrSingle(\"order\", varOrder)";
_col._setattrsingle /*b4j.example.vmelement*/ ("order",_varorder);
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setorderlg(String _varorderlg) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub SetOrderLg(varOrderLg As String) As VMCol";
 //BA.debugLineNum = 175;BA.debugLine="Col.SetAttrSingle(\"order-lg\", varOrderLg)";
_col._setattrsingle /*b4j.example.vmelement*/ ("order-lg",_varorderlg);
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setordermd(String _varordermd) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetOrderMd(varOrderMd As String) As VMCol";
 //BA.debugLineNum = 181;BA.debugLine="Col.SetAttrSingle(\"order-md\", varOrderMd)";
_col._setattrsingle /*b4j.example.vmelement*/ ("order-md",_varordermd);
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setordersm(String _varordersm) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetOrderSm(varOrderSm As String) As VMCol";
 //BA.debugLineNum = 187;BA.debugLine="Col.SetAttrSingle(\"order-sm\", varOrderSm)";
_col._setattrsingle /*b4j.example.vmelement*/ ("order-sm",_varordersm);
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setorderxl(String _varorderxl) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetOrderXl(varOrderXl As String) As VMCol";
 //BA.debugLineNum = 193;BA.debugLine="Col.SetAttrSingle(\"order-xl\", varOrderXl)";
_col._setattrsingle /*b4j.example.vmelement*/ ("order-xl",_varorderxl);
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetPaddingAll(p As String) As VMCol";
 //BA.debugLineNum = 252;BA.debugLine="Col.SetPaddingAll(p)";
_col._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setsm(String _varsm) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetSm(varSm As String) As VMCol";
 //BA.debugLineNum = 199;BA.debugLine="Col.SetAttrSingle(\"sm\", varSm)";
_col._setattrsingle /*b4j.example.vmelement*/ ("sm",_varsm);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetStyle(sm As Map) As VMCol";
 //BA.debugLineNum = 98;BA.debugLine="Col.SetStyle(sm)";
_col._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 281;BA.debugLine="Col.SetStyleSingle(prop, value)";
_col._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _settag(Object _vartag) throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Sub SetTag(varTag As Object) As VMCol";
 //BA.debugLineNum = 205;BA.debugLine="Col.SetTag(varTag)";
_col._settag /*b4j.example.vmelement*/ (BA.ObjectToString(_vartag));
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 301;BA.debugLine="Sub SetTextColor(varColor As String) As VMCol";
 //BA.debugLineNum = 302;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 303;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 308;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 309;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 310;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 311;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 312;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetVIf(vif As String) As VMCol";
 //BA.debugLineNum = 52;BA.debugLine="Col.SetVIf(vif)";
_col._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub SetVisible(b As Boolean) As VMCol";
 //BA.debugLineNum = 296;BA.debugLine="Col.SetVisible(b)";
_col._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetVModel(k As String) As VMCol";
 //BA.debugLineNum = 47;BA.debugLine="Col.SetVModel(k)";
_col._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetVShow(vif As String) As VMCol";
 //BA.debugLineNum = 62;BA.debugLine="Col.SetVShow(vif)";
_col._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setxl(Object _varxl) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub SetXl(varXl As Object) As VMCol";
 //BA.debugLineNum = 211;BA.debugLine="Col.SetAttrSingle(\"xl\", varXl)";
_col._setattrsingle /*b4j.example.vmelement*/ ("xl",BA.ObjectToString(_varxl));
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _show() throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub Show As VMCol";
 //BA.debugLineNum = 222;BA.debugLine="Col.SetVisible(True)";
_col._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 43;BA.debugLine="Return Col.ToString";
if (true) return _col._tostring /*String*/ ();
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
