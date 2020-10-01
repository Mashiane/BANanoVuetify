package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmrow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmrow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmrow.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _row = null;
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
public b4j.example.vmrow  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 69;BA.debugLine="Sub AddChild(child As VMElement) As VMRow";
 //BA.debugLineNum = 70;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 71;BA.debugLine="Row.SetText(childHTML)";
_row._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 100;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 101;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 102;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmrow  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub AddClass(c As String) As VMRow";
 //BA.debugLineNum = 83;BA.debugLine="Row.AddClass(c)";
_row._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub AddComponent(comp As String) As VMRow";
 //BA.debugLineNum = 268;BA.debugLine="Row.SetText(comp)";
_row._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 238;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 239;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 291;BA.debugLine="Row.BuildModel(mprops, mstyles, lclasses, loose)";
_row._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Row As VMElement";
_row = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean    'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object         'ignore";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmrow  _disable() throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub Disable As VMRow";
 //BA.debugLineNum = 231;BA.debugLine="Row.Disable(True)";
_row._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _enable() throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub Enable As VMRow";
 //BA.debugLineNum = 226;BA.debugLine="Row.Enable(True)";
_row._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _hide() throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub Hide As VMRow";
 //BA.debugLineNum = 216;BA.debugLine="Row.SetVisible(False)";
_row._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="Row.Initialize(v, ID)";
_row._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 15;BA.debugLine="Row.SetTag(\"v-row\")";
_row._settag /*b4j.example.vmelement*/ ("v-row");
 //BA.debugLineNum = 16;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 18;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 78;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmrow  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="public Sub RemoveAttr(sName As String) As VMRow";
 //BA.debugLineNum = 245;BA.debugLine="Row.RemoveAttr(sName)";
_row._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub Render";
 //BA.debugLineNum = 65;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmrow  _setalign(String _varalign) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetAlign(varAlign As String) As VMRow";
 //BA.debugLineNum = 108;BA.debugLine="Row.SetAttrSingle(\"align\", varAlign)";
_row._setattrsingle /*b4j.example.vmelement*/ ("align",_varalign);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setaligncontent(String _varaligncontent) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetAlignContent(varAlignContent As String) As";
 //BA.debugLineNum = 114;BA.debugLine="Row.SetAttrSingle(\"align-content\", varAlignConten";
_row._setattrsingle /*b4j.example.vmelement*/ ("align-content",_varaligncontent);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setaligncontentlg(String _varaligncontentlg) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetAlignContentLg(varAlignContentLg As String)";
 //BA.debugLineNum = 120;BA.debugLine="Row.SetAttrSingle(\"align-content-lg\", varAlignCon";
_row._setattrsingle /*b4j.example.vmelement*/ ("align-content-lg",_varaligncontentlg);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setaligncontentmd(String _varaligncontentmd) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetAlignContentMd(varAlignContentMd As String)";
 //BA.debugLineNum = 126;BA.debugLine="Row.SetAttrSingle(\"align-content-md\", varAlignCon";
_row._setattrsingle /*b4j.example.vmelement*/ ("align-content-md",_varaligncontentmd);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setaligncontentsm(String _varaligncontentsm) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetAlignContentSm(varAlignContentSm As String)";
 //BA.debugLineNum = 132;BA.debugLine="Row.SetAttrSingle(\"align-content-sm\", varAlignCon";
_row._setattrsingle /*b4j.example.vmelement*/ ("align-content-sm",_varaligncontentsm);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setaligncontentxl(String _varaligncontentxl) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetAlignContentXl(varAlignContentXl As String)";
 //BA.debugLineNum = 138;BA.debugLine="Row.SetAttrSingle(\"align-content-xl\", varAlignCon";
_row._setattrsingle /*b4j.example.vmelement*/ ("align-content-xl",_varaligncontentxl);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setalignlg(String _varalignlg) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetAlignLg(varAlignLg As String) As VMRow";
 //BA.debugLineNum = 144;BA.debugLine="Row.SetAttrSingle(\"align-lg\", varAlignLg)";
_row._setattrsingle /*b4j.example.vmelement*/ ("align-lg",_varalignlg);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setalignmd(String _varalignmd) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetAlignMd(varAlignMd As String) As VMRow";
 //BA.debugLineNum = 150;BA.debugLine="Row.SetAttrSingle(\"align-md\", varAlignMd)";
_row._setattrsingle /*b4j.example.vmelement*/ ("align-md",_varalignmd);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setalignsm(String _varalignsm) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetAlignSm(varAlignSm As String) As VMRow";
 //BA.debugLineNum = 156;BA.debugLine="Row.SetAttrSingle(\"align-sm\", varAlignSm)";
_row._setattrsingle /*b4j.example.vmelement*/ ("align-sm",_varalignsm);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setalignxl(String _varalignxl) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetAlignXl(varAlignXl As String) As VMRow";
 //BA.debugLineNum = 162;BA.debugLine="Row.SetAttrSingle(\"align-xl\", varAlignXl)";
_row._setattrsingle /*b4j.example.vmelement*/ ("align-xl",_varalignxl);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetAttr(attr As Map) As VMRow";
 //BA.debugLineNum = 89;BA.debugLine="Row.SetAttr(attr)";
_row._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 35;BA.debugLine="Sub SetAttributes(attrs As List) As VMRow";
 //BA.debugLineNum = 36;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 37;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetAttrLoose(loose As String) As VMRow";
 //BA.debugLineNum = 30;BA.debugLine="Row.SetAttrLoose(loose)";
_row._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 286;BA.debugLine="Row.SetAttrSingle(prop, value)";
_row._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 23;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setdense(String _vardense) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetDense(varDense As String) As VMRow";
 //BA.debugLineNum = 168;BA.debugLine="Row.SetAttrSingle(\"dense\", varDense)";
_row._setattrsingle /*b4j.example.vmelement*/ ("dense",_vardense);
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMRow";
 //BA.debugLineNum = 261;BA.debugLine="Row.SetDesignMode(b)";
_row._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 262;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setjustify(String _varjustify) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetJustify(varJustify As String) As VMRow";
 //BA.debugLineNum = 174;BA.debugLine="Row.SetAttrSingle(\"justify\", varJustify)";
_row._setattrsingle /*b4j.example.vmelement*/ ("justify",_varjustify);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setjustifylg(String _varjustifylg) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetJustifyLg(varJustifyLg As String) As VMRow";
 //BA.debugLineNum = 180;BA.debugLine="Row.SetAttrSingle(\"justify-lg\", varJustifyLg)";
_row._setattrsingle /*b4j.example.vmelement*/ ("justify-lg",_varjustifylg);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setjustifymd(String _varjustifymd) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetJustifyMd(varJustifyMd As String) As VMRow";
 //BA.debugLineNum = 186;BA.debugLine="Row.SetAttrSingle(\"justify-md\", varJustifyMd)";
_row._setattrsingle /*b4j.example.vmelement*/ ("justify-md",_varjustifymd);
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setjustifysm(String _varjustifysm) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetJustifySm(varJustifySm As String) As VMRow";
 //BA.debugLineNum = 192;BA.debugLine="Row.SetAttrSingle(\"justify-sm\", varJustifySm)";
_row._setattrsingle /*b4j.example.vmelement*/ ("justify-sm",_varjustifysm);
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setjustifyxl(String _varjustifyxl) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetJustifyXl(varJustifyXl As String) As VMRow";
 //BA.debugLineNum = 198;BA.debugLine="Row.SetAttrSingle(\"justify-xl\", varJustifyXl)";
_row._setattrsingle /*b4j.example.vmelement*/ ("justify-xl",_varjustifyxl);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetMarginAll(p As String) As VMRow";
 //BA.debugLineNum = 256;BA.debugLine="Row.setmarginall(p)";
_row._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 275;BA.debugLine="Row.SetName(varName, bbind)";
_row._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setnogutters(String _varnogutters) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetNoGutters(varNoGutters As String) As VMRow";
 //BA.debugLineNum = 204;BA.debugLine="Row.SetAttrSingle(\"no-gutters\", varNoGutters)";
_row._setattrsingle /*b4j.example.vmelement*/ ("no-gutters",_varnogutters);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub SetPaddingAll(p As String) As VMRow";
 //BA.debugLineNum = 251;BA.debugLine="Row.SetPaddingAll(p)";
_row._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetStyle(sm As Map) As VMRow";
 //BA.debugLineNum = 95;BA.debugLine="Row.SetStyle(sm)";
_row._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 281;BA.debugLine="Row.SetStyleSingle(prop, value)";
_row._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _settag(Object _vartag) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetTag(varTag As Object) As VMRow";
 //BA.debugLineNum = 210;BA.debugLine="Row.SetTag(varTag)";
_row._settag /*b4j.example.vmelement*/ (BA.ObjectToString(_vartag));
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 301;BA.debugLine="Sub SetTextColor(varColor As String) As VMRow";
 //BA.debugLineNum = 302;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 303;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
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
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetVIf(vif As String) As VMRow";
 //BA.debugLineNum = 54;BA.debugLine="Row.SetVIf(vif)";
_row._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub SetVisible(b As Boolean) As VMRow";
 //BA.debugLineNum = 296;BA.debugLine="Row.SetVisible(b)";
_row._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetVModel(k As String) As VMRow";
 //BA.debugLineNum = 49;BA.debugLine="Row.SetVModel(k)";
_row._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetVShow(vif As String) As VMRow";
 //BA.debugLineNum = 59;BA.debugLine="Row.SetVShow(vif)";
_row._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _show() throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub Show As VMRow";
 //BA.debugLineNum = 221;BA.debugLine="Row.SetVisible(True)";
_row._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 45;BA.debugLine="Return Row.ToString";
if (true) return _row._tostring /*String*/ ();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
