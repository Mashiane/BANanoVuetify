package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmeditdialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmeditdialog", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmeditdialog.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _editdialog = null;
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
public b4j.example.vmeditdialog  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 54;BA.debugLine="Sub AddChild(child As VMElement) As VMEditDialog";
 //BA.debugLineNum = 55;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 56;BA.debugLine="EditDialog.SetText(childHTML)";
_editdialog._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 90;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 91;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 92;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmeditdialog  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub AddClass(c As String) As VMEditDialog";
 //BA.debugLineNum = 73;BA.debugLine="EditDialog.AddClass(c)";
_editdialog._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 250;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 251;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 333;BA.debugLine="EditDialog.BindStyleSingle(prop, value)";
_editdialog._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 370;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 371;BA.debugLine="EditDialog.BuildModel(mprops, mstyles, lclasses, l";
_editdialog._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public EditDialog As VMElement";
_editdialog = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmeditdialog  _disable() throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub Disable As VMEditDialog";
 //BA.debugLineNum = 243;BA.debugLine="EditDialog.Disable(True)";
_editdialog._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _enable() throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub Enable As VMEditDialog";
 //BA.debugLineNum = 237;BA.debugLine="EditDialog.Enable(True)";
_editdialog._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _hide() throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub Hide As VMEditDialog";
 //BA.debugLineNum = 225;BA.debugLine="EditDialog.SetVisible(False)";
_editdialog._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="EditDialog.Initialize(v, ID)";
_editdialog._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 15;BA.debugLine="EditDialog.SetTag(\"v-edit-dialog\")";
_editdialog._settag /*b4j.example.vmelement*/ ("v-edit-dialog");
 //BA.debugLineNum = 16;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 18;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 68;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmeditdialog  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="public Sub RemoveAttr(sName As String) As VMEditDi";
 //BA.debugLineNum = 284;BA.debugLine="EditDialog.RemoveAttr(sName)";
_editdialog._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub Render";
 //BA.debugLineNum = 50;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmeditdialog  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetAttr(attr As Map) As VMEditDialog";
 //BA.debugLineNum = 79;BA.debugLine="EditDialog.SetAttr(attr)";
_editdialog._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 348;BA.debugLine="Sub SetAttributes(attrs As List) As VMEditDialog";
 //BA.debugLineNum = 349;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 350;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 352;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub SetAttrLoose(loose As String) As VMEditDialog";
 //BA.debugLineNum = 257;BA.debugLine="EditDialog.SetAttrLoose(loose)";
_editdialog._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 327;BA.debugLine="EditDialog.SetAttrSingle(prop, value)";
_editdialog._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setcanceltext(Object _varcanceltext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 97;BA.debugLine="Sub SetCancelText(varCancelText As Object) As VMEd";
 //BA.debugLineNum = 98;BA.debugLine="Dim pp As String = $\"${ID}CancelText\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CancelText");
 //BA.debugLineNum = 99;BA.debugLine="vue.SetStateSingle(pp, varCancelText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varcanceltext);
 //BA.debugLineNum = 100;BA.debugLine="EditDialog.Bind(\":cancel-text\", pp)";
_editdialog._bind /*b4j.example.vmelement*/ (":cancel-text",_pp);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 274;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 275;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 276;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 277;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 278;BA.debugLine="EditDialog.Bind(\":color\", pp)";
_editdialog._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setdark(Object _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 105;BA.debugLine="Sub SetDark(varDark As Object) As VMEditDialog";
 //BA.debugLineNum = 106;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 107;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vardark);
 //BA.debugLineNum = 108;BA.debugLine="EditDialog.Bind(\":dark\", pp)";
_editdialog._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 28;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMEditDialog";
 //BA.debugLineNum = 302;BA.debugLine="EditDialog.SetDesignMode(b)";
_editdialog._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 303;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _seteager(Object _vareager) throws Exception{
String _pp = "";
 //BA.debugLineNum = 113;BA.debugLine="Sub SetEager(varEager As Object) As VMEditDialog";
 //BA.debugLineNum = 114;BA.debugLine="Dim pp As String = $\"${ID}Eager\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Eager");
 //BA.debugLineNum = 115;BA.debugLine="vue.SetStateSingle(pp, varEager)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vareager);
 //BA.debugLineNum = 116;BA.debugLine="EditDialog.Bind(\":eager\", pp)";
_editdialog._bind /*b4j.example.vmelement*/ (":eager",_pp);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 364;BA.debugLine="Sub SetKey(k As String) As VMEditDialog";
 //BA.debugLineNum = 365;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 366;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 367;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setlarge(Object _varlarge) throws Exception{
String _pp = "";
 //BA.debugLineNum = 121;BA.debugLine="Sub SetLarge(varLarge As Object) As VMEditDialog";
 //BA.debugLineNum = 122;BA.debugLine="Dim pp As String = $\"${ID}Large\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Large");
 //BA.debugLineNum = 123;BA.debugLine="vue.SetStateSingle(pp, varLarge)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varlarge);
 //BA.debugLineNum = 124;BA.debugLine="EditDialog.Bind(\":large\", pp)";
_editdialog._bind /*b4j.example.vmelement*/ (":large",_pp);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setlight(Object _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 129;BA.debugLine="Sub SetLight(varLight As Object) As VMEditDialog";
 //BA.debugLineNum = 130;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 131;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varlight);
 //BA.debugLineNum = 132;BA.debugLine="EditDialog.Bind(\":light\", pp)";
_editdialog._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub SetMarginAll(p As String) As VMEditDialog";
 //BA.debugLineNum = 296;BA.debugLine="EditDialog.setmarginall(p)";
_editdialog._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 315;BA.debugLine="EditDialog.SetName(varName, bbind)";
_editdialog._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setoncancel(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 175;BA.debugLine="Sub SetOnCancel(methodName As String) As VMEditDia";
 //BA.debugLineNum = 176;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 177;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmeditdialog)(this);};
 //BA.debugLineNum = 178;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 179;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 180;BA.debugLine="SetAttr(CreateMap(\"@cancel\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@cancel"),(Object)(_methodname)}));
 //BA.debugLineNum = 182;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setonclose(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 187;BA.debugLine="Sub SetOnClose(methodName As String) As VMEditDial";
 //BA.debugLineNum = 188;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 189;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmeditdialog)(this);};
 //BA.debugLineNum = 190;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 191;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 192;BA.debugLine="SetAttr(CreateMap(\"@close\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@close"),(Object)(_methodname)}));
 //BA.debugLineNum = 194;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setonopen(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 199;BA.debugLine="Sub SetOnOpen(methodName As String) As VMEditDialo";
 //BA.debugLineNum = 200;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 201;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmeditdialog)(this);};
 //BA.debugLineNum = 202;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 203;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 204;BA.debugLine="SetAttr(CreateMap(\"@open\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@open"),(Object)(_methodname)}));
 //BA.debugLineNum = 206;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setonsave(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 211;BA.debugLine="Sub SetOnSave(methodName As String) As VMEditDialo";
 //BA.debugLineNum = 212;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 213;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmeditdialog)(this);};
 //BA.debugLineNum = 214;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 215;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 216;BA.debugLine="SetAttr(CreateMap(\"@save\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@save"),(Object)(_methodname)}));
 //BA.debugLineNum = 218;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub SetPaddingAll(p As String) As VMEditDialog";
 //BA.debugLineNum = 290;BA.debugLine="EditDialog.SetPaddingAll(p)";
_editdialog._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setpersistent(Object _varpersistent) throws Exception{
String _pp = "";
 //BA.debugLineNum = 137;BA.debugLine="Sub SetPersistent(varPersistent As Object) As VMEd";
 //BA.debugLineNum = 138;BA.debugLine="Dim pp As String = $\"${ID}Persistent\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Persistent");
 //BA.debugLineNum = 139;BA.debugLine="vue.SetStateSingle(pp, varPersistent)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varpersistent);
 //BA.debugLineNum = 140;BA.debugLine="EditDialog.Bind(\":persistent\", pp)";
_editdialog._bind /*b4j.example.vmelement*/ (":persistent",_pp);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setreturnvalue(Object _varreturnvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 145;BA.debugLine="Sub SetReturnValue(varReturnValue As Object) As VM";
 //BA.debugLineNum = 146;BA.debugLine="Dim pp As String = $\"${ID}ReturnValue\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ReturnValue");
 //BA.debugLineNum = 147;BA.debugLine="vue.SetStateSingle(pp, varReturnValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varreturnvalue);
 //BA.debugLineNum = 148;BA.debugLine="EditDialog.Bind(\":return-value\", pp)";
_editdialog._bind /*b4j.example.vmelement*/ (":return-value",_pp);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setsavetext(Object _varsavetext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 153;BA.debugLine="Sub SetSaveText(varSaveText As Object) As VMEditDi";
 //BA.debugLineNum = 154;BA.debugLine="Dim pp As String = $\"${ID}SaveText\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SaveText");
 //BA.debugLineNum = 155;BA.debugLine="vue.SetStateSingle(pp, varSaveText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varsavetext);
 //BA.debugLineNum = 156;BA.debugLine="EditDialog.Bind(\":save-text\", pp)";
_editdialog._bind /*b4j.example.vmelement*/ (":save-text",_pp);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setslotinput(boolean _b) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub SetSlotInput(b As Boolean) As VMEditDialog";
 //BA.debugLineNum = 170;BA.debugLine="SetAttr(CreateMap(\"slot\": \"input\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("input")}));
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetStyle(sm As Map) As VMEditDialog";
 //BA.debugLineNum = 85;BA.debugLine="EditDialog.SetStyle(sm)";
_editdialog._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 321;BA.debugLine="EditDialog.SetStyleSingle(prop, value)";
_editdialog._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetTabIndex(ti As String) As VMEditDialog";
 //BA.debugLineNum = 309;BA.debugLine="EditDialog.SetTabIndex(ti)";
_editdialog._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetText(t As Object) As VMEditDialog";
 //BA.debugLineNum = 62;BA.debugLine="EditDialog.SetText(t)";
_editdialog._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 380;BA.debugLine="Sub SetTextColor(varColor As String) As VMEditDial";
 //BA.debugLineNum = 381;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 382;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 387;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 388;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 389;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 390;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 391;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 392;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _settransition(Object _vartransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 161;BA.debugLine="Sub SetTransition(varTransition As Object) As VMEd";
 //BA.debugLineNum = 162;BA.debugLine="Dim pp As String = $\"${ID}Transition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Transition");
 //BA.debugLineNum = 163;BA.debugLine="vue.SetStateSingle(pp, varTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vartransition);
 //BA.debugLineNum = 164;BA.debugLine="EditDialog.Bind(\":transition\", pp)";
_editdialog._bind /*b4j.example.vmelement*/ (":transition",_pp);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 356;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 357;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 358;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 359;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 360;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetVhtml(vhtml As String) As VMEditDialog";
 //BA.debugLineNum = 344;BA.debugLine="EditDialog.SetVHtml(vhtml)";
_editdialog._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetVIf(vif As String) As VMEditDialog";
 //BA.debugLineNum = 39;BA.debugLine="EditDialog.SetVIf(vif)";
_editdialog._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 374;BA.debugLine="Sub SetVisible(b As Boolean) As VMEditDialog";
 //BA.debugLineNum = 375;BA.debugLine="EditDialog.SetVisible(b)";
_editdialog._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetVModel(k As String) As VMEditDialog";
 //BA.debugLineNum = 34;BA.debugLine="EditDialog.SetVModel(k)";
_editdialog._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetVShow(vif As String) As VMEditDialog";
 //BA.debugLineNum = 44;BA.debugLine="EditDialog.SetVShow(vif)";
_editdialog._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub SetVText(vhtml As String) As VMEditDialog";
 //BA.debugLineNum = 339;BA.debugLine="EditDialog.SetVText(vhtml)";
_editdialog._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmeditdialog  _show() throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub Show As VMEditDialog";
 //BA.debugLineNum = 231;BA.debugLine="EditDialog.SetVisible(True)";
_editdialog._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 24;BA.debugLine="Return EditDialog.ToString";
if (true) return _editdialog._tostring /*String*/ ();
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmeditdialog  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 262;BA.debugLine="Sub UseTheme(themeName As String) As VMEditDialog";
 //BA.debugLineNum = 263;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 264;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 265;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 266;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 267;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.vmeditdialog)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
