package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtextfield extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtextfield", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtextfield.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _textfield = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public String _password = "";
public boolean _bstatic = false;
public boolean _bmultiple = false;
public String _vmodel = "";
public String _errortext = "";
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
public b4j.example.vmtextfield  _addbuttonafter(b4j.example.vmbutton _btn) throws Exception{
b4j.example.vmtemplate _appendouter = null;
 //BA.debugLineNum = 50;BA.debugLine="Sub AddButtonAfter(btn As VMButton) As VMTextField";
 //BA.debugLineNum = 51;BA.debugLine="Dim appendOuter As VMTemplate";
_appendouter = new b4j.example.vmtemplate();
 //BA.debugLineNum = 52;BA.debugLine="appendOuter.Initialize(vue, $\"${ID}menuafter\"$, M";
_appendouter._initialize /*b4j.example.vmtemplate*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"menuafter"),_module);
 //BA.debugLineNum = 53;BA.debugLine="appendOuter.SetAttrLoose(\"v-slot:append-outer\")";
_appendouter._setattrloose /*b4j.example.vmtemplate*/ ("v-slot:append-outer");
 //BA.debugLineNum = 54;BA.debugLine="appendOuter.AddComponent(btn.ToString)";
_appendouter._addcomponent /*b4j.example.vmtemplate*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 55;BA.debugLine="AddComponent(appendOuter.ToString)";
_addcomponent(_appendouter._tostring /*String*/ ());
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 263;BA.debugLine="Sub AddChild(child As VMElement) As VMTextField";
 //BA.debugLineNum = 264;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 265;BA.debugLine="TextField.SetText(childHTML)";
_textfield._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 299;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 300;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 301;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtextfield  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub AddClass(c As String) As VMTextField";
 //BA.debugLineNum = 282;BA.debugLine="TextField.AddClass(c)";
_textfield._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub AddComponent(comp As String) As VMTextField";
 //BA.debugLineNum = 61;BA.debugLine="SetText(comp)";
_settext((Object)(_comp));
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _addmenuafter(b4j.example.vmmenu _menu) throws Exception{
b4j.example.vmtemplate _appendouter = null;
 //BA.debugLineNum = 40;BA.debugLine="Sub AddMenuAfter(menu As VMMenu) As VMTextField";
 //BA.debugLineNum = 41;BA.debugLine="Dim appendOuter As VMTemplate";
_appendouter = new b4j.example.vmtemplate();
 //BA.debugLineNum = 42;BA.debugLine="appendOuter.Initialize(vue, $\"${ID}menuafter\"$, M";
_appendouter._initialize /*b4j.example.vmtemplate*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"menuafter"),_module);
 //BA.debugLineNum = 43;BA.debugLine="appendOuter.SetAttrLoose(\"v-slot:append-outer\")";
_appendouter._setattrloose /*b4j.example.vmtemplate*/ ("v-slot:append-outer");
 //BA.debugLineNum = 44;BA.debugLine="appendOuter.AddComponent(menu.ToString)";
_appendouter._addcomponent /*b4j.example.vmtemplate*/ (_menu._tostring /*String*/ ());
 //BA.debugLineNum = 45;BA.debugLine="AddComponent(appendOuter.ToString)";
_addcomponent(_appendouter._tostring /*String*/ ());
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 1188;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 1189;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 1190;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtextfield  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 1137;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 1138;BA.debugLine="TextField.Bind(prop, stateprop)";
_textfield._bind /*b4j.example.vmelement*/ (_prop,_stateprop);
 //BA.debugLineNum = 1139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 1193;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 1194;BA.debugLine="TextField.BuildModel(mprops, mstyles, lclasses, lo";
_textfield._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 1195;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1196;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public TextField As VMElement";
_textfield = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private password As String";
_password = "";
 //BA.debugLineNum = 10;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 11;BA.debugLine="Private bMultiple As Boolean";
_bmultiple = false;
 //BA.debugLineNum = 12;BA.debugLine="Private vmodel As String";
_vmodel = "";
 //BA.debugLineNum = 13;BA.debugLine="Public ErrorText As String";
_errortext = "";
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtextfield  _disable() throws Exception{
 //BA.debugLineNum = 1130;BA.debugLine="Sub Disable As VMTextField";
 //BA.debugLineNum = 1131;BA.debugLine="TextField.Disable(True)";
_textfield._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1133;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _enable() throws Exception{
 //BA.debugLineNum = 1125;BA.debugLine="Sub Enable As VMTextField";
 //BA.debugLineNum = 1126;BA.debugLine="TextField.Enable(True)";
_textfield._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1127;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1128;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _hide() throws Exception{
 //BA.debugLineNum = 1115;BA.debugLine="Sub Hide As VMTextField";
 //BA.debugLineNum = 1116;BA.debugLine="TextField.SetVisible(False)";
_textfield._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 1117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1118;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 18;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 19;BA.debugLine="TextField.Initialize(v, ID)";
_textfield._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 20;BA.debugLine="TextField.SetTag(\"v-text-field\")";
_textfield._settag /*b4j.example.vmelement*/ ("v-text-field");
 //BA.debugLineNum = 21;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 23;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 24;BA.debugLine="password = $\"${ID}password\"$";
_password = (""+__c.SmartStringFormatter("",(Object)(_id))+"password");
 //BA.debugLineNum = 25;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 26;BA.debugLine="vmodel = \"\"";
_vmodel = "";
 //BA.debugLineNum = 27;BA.debugLine="bMultiple = False";
_bmultiple = __c.False;
 //BA.debugLineNum = 28;BA.debugLine="ErrorText = \"\"";
_errortext = "";
 //BA.debugLineNum = 29;BA.debugLine="TextField.fieldType = \"string\"";
_textfield._fieldtype /*String*/  = "string";
 //BA.debugLineNum = 30;BA.debugLine="TextField.typeOf = \"textfield\"";
_textfield._typeof /*String*/  = "textfield";
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 277;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtextfield  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 1143;BA.debugLine="public Sub RemoveAttr(sName As String) As VMTextFi";
 //BA.debugLineNum = 1144;BA.debugLine="TextField.RemoveAttr(sName)";
_textfield._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 1145;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1146;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub Render";
 //BA.debugLineNum = 259;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtextfield  _setaccept(String _varaccept) throws Exception{
String _pp = "";
 //BA.debugLineNum = 77;BA.debugLine="Sub SetAccept(varAccept As String) As VMTextField";
 //BA.debugLineNum = 78;BA.debugLine="If varAccept = \"\" Then Return Me";
if ((_varaccept).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 79;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 80;BA.debugLine="TextField.SetAttrSingle(\"accept\", varAccept)";
_textfield._setattrsingle /*b4j.example.vmelement*/ ("accept",_varaccept);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 };
 //BA.debugLineNum = 83;BA.debugLine="Dim pp As String = $\"${ID}varAccept\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"varAccept");
 //BA.debugLineNum = 84;BA.debugLine="vue.SetStateSingle(pp, varAccept)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varaccept));
 //BA.debugLineNum = 85;BA.debugLine="TextField.Bind(\":accept\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":accept",_pp);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setappendicon(String _varappendicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 306;BA.debugLine="Sub SetAppendIcon(varAppendIcon As String) As VMTe";
 //BA.debugLineNum = 307;BA.debugLine="If varAppendIcon = \"\" Then Return Me";
if ((_varappendicon).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 308;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 309;BA.debugLine="SetAttrSingle(\"append-icon\", varAppendIcon)";
_setattrsingle("append-icon",_varappendicon);
 }else {
 //BA.debugLineNum = 311;BA.debugLine="Dim pp As String = $\"${ID}AppendIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AppendIcon");
 //BA.debugLineNum = 312;BA.debugLine="vue.SetStateSingle(pp, varAppendIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varappendicon));
 //BA.debugLineNum = 313;BA.debugLine="TextField.Bind(\":append-icon\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":append-icon",_pp);
 };
 //BA.debugLineNum = 315;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setappendoutericon(String _varappendoutericon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 319;BA.debugLine="Sub SetAppendOuterIcon(varAppendOuterIcon As Strin";
 //BA.debugLineNum = 320;BA.debugLine="If varAppendOuterIcon = \"\" Then Return Me";
if ((_varappendoutericon).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 321;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 322;BA.debugLine="SetAttrSingle(\"append-outer-icon\", varAppendOute";
_setattrsingle("append-outer-icon",_varappendoutericon);
 }else {
 //BA.debugLineNum = 324;BA.debugLine="Dim pp As String = $\"${ID}AppendOuterIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AppendOuterIcon");
 //BA.debugLineNum = 325;BA.debugLine="vue.SetStateSingle(pp, varAppendOuterIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varappendoutericon));
 //BA.debugLineNum = 326;BA.debugLine="TextField.Bind(\":append-outer-icon\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":append-outer-icon",_pp);
 };
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetAttr(attr As Map) As VMTextField";
 //BA.debugLineNum = 288;BA.debugLine="TextField.SetAttr(attr)";
_textfield._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 175;BA.debugLine="Sub SetAttributes(attrs As List) As VMTextField";
 //BA.debugLineNum = 176;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 177;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetAttrLoose(loose As String) As VMTextField";
 //BA.debugLineNum = 184;BA.debugLine="TextField.SetAttrLoose(loose)";
_textfield._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1182;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 1183;BA.debugLine="TextField.SetAttrSingle(prop, value)";
_textfield._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 1184;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1185;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setautofocus(boolean _varautofocus) throws Exception{
String _pp = "";
 //BA.debugLineNum = 332;BA.debugLine="Sub SetAutofocus(varAutofocus As Boolean) As VMTex";
 //BA.debugLineNum = 333;BA.debugLine="If varAutofocus = False Then Return Me";
if (_varautofocus==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 334;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 335;BA.debugLine="SetAttrSingle(\"autofocus\", varAutofocus)";
_setattrsingle("autofocus",BA.ObjectToString(_varautofocus));
 }else {
 //BA.debugLineNum = 337;BA.debugLine="Dim pp As String = $\"${ID}Autofocus\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Autofocus");
 //BA.debugLineNum = 338;BA.debugLine="vue.SetStateSingle(pp, varAutofocus)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varautofocus));
 //BA.debugLineNum = 339;BA.debugLine="TextField.Bind(\":autofocus\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":autofocus",_pp);
 };
 //BA.debugLineNum = 341;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setautogrow(boolean _varautogrow) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1253;BA.debugLine="Sub SetAutoGrow(varAutoGrow As Boolean) As VMTextF";
 //BA.debugLineNum = 1254;BA.debugLine="If varAutoGrow = False Then Return Me";
if (_varautogrow==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1255;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1256;BA.debugLine="TextField.SetAttrSingle(\"auto-grow\", varAutoGrow";
_textfield._setattrsingle /*b4j.example.vmelement*/ ("auto-grow",BA.ObjectToString(_varautogrow));
 //BA.debugLineNum = 1257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 };
 //BA.debugLineNum = 1259;BA.debugLine="Dim pp As String = $\"${ID}AutoGrow\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AutoGrow");
 //BA.debugLineNum = 1260;BA.debugLine="vue.SetStateSingle(pp, varAutoGrow)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varautogrow));
 //BA.debugLineNum = 1261;BA.debugLine="TextField.Bind(\":auto-grow\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":auto-grow",_pp);
 //BA.debugLineNum = 1262;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setbackgroundcolor(String _varbackgroundcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 345;BA.debugLine="Sub SetBackgroundColor(varBackgroundColor As Strin";
 //BA.debugLineNum = 346;BA.debugLine="If varBackgroundColor = \"\" Then Return Me";
if ((_varbackgroundcolor).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 347;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 348;BA.debugLine="SetAttrSingle(\"background-color\", varBackgroundC";
_setattrsingle("background-color",_varbackgroundcolor);
 }else {
 //BA.debugLineNum = 350;BA.debugLine="Dim pp As String = $\"${ID}BackgroundColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BackgroundColor");
 //BA.debugLineNum = 351;BA.debugLine="vue.SetStateSingle(pp, varBackgroundColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbackgroundcolor));
 //BA.debugLineNum = 352;BA.debugLine="TextField.Bind(\":background-color\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 };
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setbackgroundcolorintensity(Object _varbackgroundcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 1314;BA.debugLine="Sub SetBackgroundColorIntensity(varBackgroundColor";
 //BA.debugLineNum = 1315;BA.debugLine="Dim scolor As String = $\"${varBackgroundColor} ${";
_scolor = (""+__c.SmartStringFormatter("",_varbackgroundcolor)+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 1316;BA.debugLine="If varBackgroundColor = \"\" And varIntensity = \"\"";
if ((_varbackgroundcolor).equals((Object)("")) && (_varintensity).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1317;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1318;BA.debugLine="TextField.SetAttrSingle(\"background-color\", scol";
_textfield._setattrsingle /*b4j.example.vmelement*/ ("background-color",_scolor);
 //BA.debugLineNum = 1319;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 };
 //BA.debugLineNum = 1321;BA.debugLine="Dim pp As String = $\"${ID}BackgroundColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BackgroundColor");
 //BA.debugLineNum = 1322;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 1323;BA.debugLine="TextField.Bind(\":background-color\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 //BA.debugLineNum = 1324;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1325;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setbool() throws Exception{
 //BA.debugLineNum = 1218;BA.debugLine="Sub SetBool As VMTextField";
 //BA.debugLineNum = 1219;BA.debugLine="TextField.fieldType = \"bool\"";
_textfield._fieldtype /*String*/  = "bool";
 //BA.debugLineNum = 1220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1221;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setchips(boolean _varchips) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1328;BA.debugLine="Sub SetChips(varChips As Boolean) As VMTextField";
 //BA.debugLineNum = 1329;BA.debugLine="If varChips = False Then Return Me";
if (_varchips==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1330;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1331;BA.debugLine="TextField.SetAttrSingle(\"chips\", varChips)";
_textfield._setattrsingle /*b4j.example.vmelement*/ ("chips",BA.ObjectToString(_varchips));
 //BA.debugLineNum = 1332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 };
 //BA.debugLineNum = 1334;BA.debugLine="Dim pp As String = $\"${ID}Chips\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Chips");
 //BA.debugLineNum = 1335;BA.debugLine="vue.SetStateSingle(pp, varChips)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varchips));
 //BA.debugLineNum = 1336;BA.debugLine="TextField.Bind(\":chips\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":chips",_pp);
 //BA.debugLineNum = 1337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1338;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setclearable(boolean _varclearable) throws Exception{
String _pp = "";
 //BA.debugLineNum = 371;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMTex";
 //BA.debugLineNum = 372;BA.debugLine="If varClearable = False Then Return Me";
if (_varclearable==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 373;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 374;BA.debugLine="SetAttrSingle(\"clearable\", varClearable)";
_setattrsingle("clearable",BA.ObjectToString(_varclearable));
 }else {
 //BA.debugLineNum = 376;BA.debugLine="Dim pp As String = $\"${ID}Clearable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Clearable");
 //BA.debugLineNum = 377;BA.debugLine="vue.SetStateSingle(pp, varClearable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varclearable));
 //BA.debugLineNum = 378;BA.debugLine="TextField.Bind(\":clearable\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":clearable",_pp);
 };
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setclearicon(String _varclearicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 358;BA.debugLine="Sub SetClearIcon(varClearIcon As String) As VMText";
 //BA.debugLineNum = 359;BA.debugLine="If varClearIcon = \"\" Then Return Me";
if ((_varclearicon).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 360;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 361;BA.debugLine="SetAttrSingle(\"clear-icon\", varClearIcon)";
_setattrsingle("clear-icon",_varclearicon);
 }else {
 //BA.debugLineNum = 363;BA.debugLine="Dim pp As String = $\"${ID}ClearIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ClearIcon");
 //BA.debugLineNum = 364;BA.debugLine="vue.SetStateSingle(pp, varClearIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varclearicon));
 //BA.debugLineNum = 365;BA.debugLine="TextField.Bind(\":clear-icon\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":clear-icon",_pp);
 };
 //BA.debugLineNum = 367;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 384;BA.debugLine="Sub SetColor(varColor As String) As VMTextField";
 //BA.debugLineNum = 385;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 386;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 387;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 }else {
 //BA.debugLineNum = 389;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 390;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 391;BA.debugLine="TextField.Bind(\":color\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":color",_pp);
 };
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 201;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 202;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 203;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 204;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 205;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 }else {
 //BA.debugLineNum = 207;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 208;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 209;BA.debugLine="TextField.Bind(\":color\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":color",_pp);
 };
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setcounter(boolean _varcounter) throws Exception{
String _pp = "";
 //BA.debugLineNum = 397;BA.debugLine="Sub SetCounter(varCounter As Boolean) As VMTextFie";
 //BA.debugLineNum = 398;BA.debugLine="If varCounter = False Then Return Me";
if (_varcounter==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 399;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 400;BA.debugLine="SetAttrSingle(\"counter\", varCounter)";
_setattrsingle("counter",BA.ObjectToString(_varcounter));
 }else {
 //BA.debugLineNum = 402;BA.debugLine="Dim pp As String = $\"${ID}Counter\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Counter");
 //BA.debugLineNum = 403;BA.debugLine="vue.SetStateSingle(pp, varCounter)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcounter));
 //BA.debugLineNum = 404;BA.debugLine="TextField.Bind(\":counter\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":counter",_pp);
 };
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setcountersizestring(String _varcountersizestring) throws Exception{
 //BA.debugLineNum = 1341;BA.debugLine="Sub SetCounterSizeString(varCounterSizeString As S";
 //BA.debugLineNum = 1342;BA.debugLine="If varCounterSizeString = \"\" Then Return Me";
if ((_varcountersizestring).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1343;BA.debugLine="TextField.SetAttrSingle(\":counter-size-string\", v";
_textfield._setattrsingle /*b4j.example.vmelement*/ (":counter-size-string",_varcountersizestring);
 //BA.debugLineNum = 1344;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1345;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setcounterstring(String _varcounterstring) throws Exception{
 //BA.debugLineNum = 1348;BA.debugLine="Sub SetCounterString(varCounterString As String) A";
 //BA.debugLineNum = 1349;BA.debugLine="If varCounterString = \"\" Then Return Me";
if ((_varcounterstring).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1350;BA.debugLine="TextField.SetAttrSingle(\":counter-string\", varCou";
_textfield._setattrsingle /*b4j.example.vmelement*/ (":counter-string",_varcounterstring);
 //BA.debugLineNum = 1351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1352;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setcountervalue(String _varcountervalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 410;BA.debugLine="Sub SetCounterValue(varCounterValue As String) As";
 //BA.debugLineNum = 411;BA.debugLine="If varCounterValue = \"\" Then Return Me";
if ((_varcountervalue).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 412;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 413;BA.debugLine="SetAttrSingle(\"counter-value\", varCounterValue)";
_setattrsingle("counter-value",_varcountervalue);
 }else {
 //BA.debugLineNum = 415;BA.debugLine="Dim pp As String = $\"${ID}CounterValue\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CounterValue");
 //BA.debugLineNum = 416;BA.debugLine="vue.SetStateSingle(pp, varCounterValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcountervalue));
 //BA.debugLineNum = 417;BA.debugLine="TextField.Bind(\":counter-value\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":counter-value",_pp);
 };
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 423;BA.debugLine="Sub SetDark(varDark As Boolean) As VMTextField";
 //BA.debugLineNum = 424;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 425;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 426;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 }else {
 //BA.debugLineNum = 428;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 429;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 430;BA.debugLine="TextField.Bind(\":dark\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":dark",_pp);
 };
 //BA.debugLineNum = 432;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 35;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setdense(boolean _vardense) throws Exception{
String _pp = "";
 //BA.debugLineNum = 436;BA.debugLine="Sub SetDense(varDense As Boolean) As VMTextField";
 //BA.debugLineNum = 437;BA.debugLine="If varDense = False Then Return Me";
if (_vardense==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 438;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 439;BA.debugLine="SetAttrSingle(\"dense\", varDense)";
_setattrsingle("dense",BA.ObjectToString(_vardense));
 }else {
 //BA.debugLineNum = 441;BA.debugLine="Dim pp As String = $\"${ID}Dense\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dense");
 //BA.debugLineNum = 442;BA.debugLine="vue.SetStateSingle(pp, varDense)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardense));
 //BA.debugLineNum = 443;BA.debugLine="TextField.Bind(\":dense\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":dense",_pp);
 };
 //BA.debugLineNum = 445;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 446;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 1159;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMTextField";
 //BA.debugLineNum = 1160;BA.debugLine="TextField.SetDesignMode(b)";
_textfield._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 1161;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 1162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 151;BA.debugLine="TextField.SetDeviceOffsets(OS, OM, OL, OX)";
_textfield._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 163;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 164;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 157;BA.debugLine="TextField.SetDeviceSizes(SS, SM, SL, SX)";
_textfield._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 449;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMTextF";
 //BA.debugLineNum = 450;BA.debugLine="TextField.SetDisabled(varDisabled)";
_textfield._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 451;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setdouble() throws Exception{
 //BA.debugLineNum = 1198;BA.debugLine="Sub SetDouble As VMTextField";
 //BA.debugLineNum = 1199;BA.debugLine="TextField.fieldType = \"dbl\"";
_textfield._fieldtype /*String*/  = "dbl";
 //BA.debugLineNum = 1200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1201;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setemail() throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetEmail As VMTextField";
 //BA.debugLineNum = 138;BA.debugLine="TextField.typeOf = \"email\"";
_textfield._typeof /*String*/  = "email";
 //BA.debugLineNum = 139;BA.debugLine="TextField.InputType = \"email\"";
_textfield._inputtype /*String*/  = "email";
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _seterror(boolean _varerror) throws Exception{
String _pp = "";
 //BA.debugLineNum = 455;BA.debugLine="Sub SetError(varError As Boolean) As VMTextField";
 //BA.debugLineNum = 456;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 457;BA.debugLine="SetAttrSingle(\"error\", varError)";
_setattrsingle("error",BA.ObjectToString(_varerror));
 //BA.debugLineNum = 458;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 };
 //BA.debugLineNum = 460;BA.debugLine="Dim pp As String = $\"${vmodel}Error\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"Error");
 //BA.debugLineNum = 461;BA.debugLine="vue.SetBoolean(pp, varError)";
_vue._setboolean /*b4j.example.bananovue*/ (_pp,_varerror);
 //BA.debugLineNum = 462;BA.debugLine="TextField.Bind(\":error\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":error",_pp);
 //BA.debugLineNum = 463;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _seterrorcount(String _varerrorcount) throws Exception{
String _pp = "";
 //BA.debugLineNum = 467;BA.debugLine="Sub SetErrorCount(varErrorCount As String) As VMTe";
 //BA.debugLineNum = 468;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 469;BA.debugLine="SetAttrSingle(\"error-count\", varErrorCount)";
_setattrsingle("error-count",_varerrorcount);
 //BA.debugLineNum = 470;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 };
 //BA.debugLineNum = 472;BA.debugLine="Dim pp As String = $\"${vmodel}ErrorCount\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"ErrorCount");
 //BA.debugLineNum = 473;BA.debugLine="vue.SetStateSingle(pp, varErrorCount)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varerrorcount));
 //BA.debugLineNum = 474;BA.debugLine="TextField.Bind(\":error-count\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":error-count",_pp);
 //BA.debugLineNum = 475;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 476;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _seterrormessages(boolean _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _pp = "";
 //BA.debugLineNum = 479;BA.debugLine="Sub SetErrorMessages(b As Boolean) As VMTextField";
 //BA.debugLineNum = 480;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 481;BA.debugLine="Dim nl As List = vue.NewList";
_nl = new anywheresoftware.b4a.objects.collections.List();
_nl = _vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 482;BA.debugLine="Dim pp As String = $\"${vmodel}ErrorMessages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"ErrorMessages");
 //BA.debugLineNum = 483;BA.debugLine="vue.SetData(pp, nl)";
_vue._setdata /*b4j.example.bananovue*/ (_pp,(Object)(_nl.getObject()));
 //BA.debugLineNum = 484;BA.debugLine="TextField.Bind(\":error-messages\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":error-messages",_pp);
 //BA.debugLineNum = 485;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 486;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _seterrortext(String _serror) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetErrorText(sError As String) As VMTextField";
 //BA.debugLineNum = 66;BA.debugLine="ErrorText = sError";
_errortext = _serror;
 //BA.debugLineNum = 67;BA.debugLine="TextField.ErrorMessage = sError";
_textfield._errormessage /*String*/  = _serror;
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setfieldtype(String _ftype) throws Exception{
 //BA.debugLineNum = 1203;BA.debugLine="Sub SetFieldType(ftype As String) As VMTextField";
 //BA.debugLineNum = 1204;BA.debugLine="TextField.fieldType = ftype";
_textfield._fieldtype /*String*/  = _ftype;
 //BA.debugLineNum = 1205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setfilled(boolean _varfilled) throws Exception{
String _pp = "";
 //BA.debugLineNum = 489;BA.debugLine="Sub SetFilled(varFilled As Boolean) As VMTextField";
 //BA.debugLineNum = 490;BA.debugLine="If varFilled = False Then Return Me";
if (_varfilled==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 491;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 492;BA.debugLine="SetAttrSingle(\"filled\", varFilled)";
_setattrsingle("filled",BA.ObjectToString(_varfilled));
 }else {
 //BA.debugLineNum = 494;BA.debugLine="Dim pp As String = $\"${ID}Filled\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Filled");
 //BA.debugLineNum = 495;BA.debugLine="vue.SetStateSingle(pp, varFilled)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfilled));
 //BA.debugLineNum = 496;BA.debugLine="TextField.Bind(\":filled\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":filled",_pp);
 };
 //BA.debugLineNum = 498;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 499;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setflat(boolean _varflat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 502;BA.debugLine="Sub SetFlat(varFlat As Boolean) As VMTextField";
 //BA.debugLineNum = 503;BA.debugLine="If varFlat = False Then Return Me";
if (_varflat==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 504;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 505;BA.debugLine="SetAttrSingle(\"flat\", varFlat)";
_setattrsingle("flat",BA.ObjectToString(_varflat));
 }else {
 //BA.debugLineNum = 507;BA.debugLine="Dim pp As String = $\"${ID}Flat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Flat");
 //BA.debugLineNum = 508;BA.debugLine="vue.SetStateSingle(pp, varFlat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varflat));
 //BA.debugLineNum = 509;BA.debugLine="TextField.Bind(\":flat\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":flat",_pp);
 };
 //BA.debugLineNum = 511;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 512;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setfullwidth(boolean _varfullwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 515;BA.debugLine="Sub SetFullWidth(varFullWidth As Boolean) As VMTex";
 //BA.debugLineNum = 516;BA.debugLine="If varFullWidth = False Then Return Me";
if (_varfullwidth==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 517;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 518;BA.debugLine="SetAttrSingle(\"full-width\", varFullWidth)";
_setattrsingle("full-width",BA.ObjectToString(_varfullwidth));
 }else {
 //BA.debugLineNum = 520;BA.debugLine="Dim pp As String = $\"${ID}FullWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"FullWidth");
 //BA.debugLineNum = 521;BA.debugLine="vue.SetStateSingle(pp, varFullWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfullwidth));
 //BA.debugLineNum = 522;BA.debugLine="TextField.Bind(\":full-width\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":full-width",_pp);
 };
 //BA.debugLineNum = 524;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 528;BA.debugLine="Sub SetHeight(varHeight As String) As VMTextField";
 //BA.debugLineNum = 529;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 530;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 531;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 }else {
 //BA.debugLineNum = 533;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 534;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 535;BA.debugLine="TextField.Bind(\":height\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":height",_pp);
 };
 //BA.debugLineNum = 537;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _sethidedetails(boolean _varhidedetails) throws Exception{
String _pp = "";
 //BA.debugLineNum = 541;BA.debugLine="Sub SetHideDetails(varHideDetails As Boolean) As V";
 //BA.debugLineNum = 542;BA.debugLine="If varHideDetails = False Then Return Me";
if (_varhidedetails==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 543;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 544;BA.debugLine="SetAttrSingle(\"hide-details\", varHideDetails)";
_setattrsingle("hide-details",BA.ObjectToString(_varhidedetails));
 }else {
 //BA.debugLineNum = 546;BA.debugLine="Dim pp As String = $\"${ID}HideDetails\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideDetails");
 //BA.debugLineNum = 547;BA.debugLine="vue.SetStateSingle(pp, varHideDetails)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhidedetails));
 //BA.debugLineNum = 548;BA.debugLine="TextField.Bind(\":hide-details\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":hide-details",_pp);
 };
 //BA.debugLineNum = 550;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 551;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _sethint(String _varhint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 554;BA.debugLine="Sub SetHint(varHint As String) As VMTextField";
 //BA.debugLineNum = 555;BA.debugLine="If varHint = \"\" Then Return Me";
if ((_varhint).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 556;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 557;BA.debugLine="SetAttrSingle(\"hint\", varHint)";
_setattrsingle("hint",_varhint);
 }else {
 //BA.debugLineNum = 559;BA.debugLine="Dim pp As String = $\"${ID}Hint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Hint");
 //BA.debugLineNum = 560;BA.debugLine="vue.SetStateSingle(pp, varHint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhint));
 //BA.debugLineNum = 561;BA.debugLine="TextField.Bind(\":hint\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":hint",_pp);
 };
 //BA.debugLineNum = 563;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 564;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setint() throws Exception{
 //BA.debugLineNum = 1223;BA.debugLine="Sub SetInt As VMTextField";
 //BA.debugLineNum = 1224;BA.debugLine="TextField.fieldType = \"int\"";
_textfield._fieldtype /*String*/  = "int";
 //BA.debugLineNum = 1225;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1226;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setlabel(String _varlabel) throws Exception{
String _pp = "";
 //BA.debugLineNum = 567;BA.debugLine="Sub SetLabel(varLabel As String) As VMTextField";
 //BA.debugLineNum = 568;BA.debugLine="If varLabel = \"\" Then Return Me";
if ((_varlabel).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 569;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 570;BA.debugLine="SetAttrSingle(\"label\", varLabel)";
_setattrsingle("label",_varlabel);
 }else {
 //BA.debugLineNum = 572;BA.debugLine="Dim pp As String = $\"${ID}Label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Label");
 //BA.debugLineNum = 573;BA.debugLine="vue.SetStateSingle(pp, varLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlabel));
 //BA.debugLineNum = 574;BA.debugLine="TextField.Bind(\":label\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":label",_pp);
 };
 //BA.debugLineNum = 576;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 577;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 580;BA.debugLine="Sub SetLight(varLight As Boolean) As VMTextField";
 //BA.debugLineNum = 581;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 582;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 583;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 }else {
 //BA.debugLineNum = 585;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 586;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 587;BA.debugLine="TextField.Bind(\":light\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":light",_pp);
 };
 //BA.debugLineNum = 589;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setloaderheight(String _varloaderheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 593;BA.debugLine="Sub SetLoaderHeight(varLoaderHeight As String) As";
 //BA.debugLineNum = 594;BA.debugLine="If varLoaderHeight = \"\" Then Return Me";
if ((_varloaderheight).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 595;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 596;BA.debugLine="SetAttrSingle(\"loader-height\", varLoaderHeight)";
_setattrsingle("loader-height",_varloaderheight);
 }else {
 //BA.debugLineNum = 598;BA.debugLine="Dim pp As String = $\"${ID}LoaderHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"LoaderHeight");
 //BA.debugLineNum = 599;BA.debugLine="vue.SetStateSingle(pp, varLoaderHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloaderheight));
 //BA.debugLineNum = 600;BA.debugLine="TextField.Bind(\":loader-height\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":loader-height",_pp);
 };
 //BA.debugLineNum = 602;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 603;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setloading(boolean _varloading) throws Exception{
String _pp = "";
 //BA.debugLineNum = 606;BA.debugLine="Sub SetLoading(varLoading As Boolean) As VMTextFie";
 //BA.debugLineNum = 607;BA.debugLine="If varLoading = False Then Return Me";
if (_varloading==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 608;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 609;BA.debugLine="SetAttrSingle(\"loading\", varLoading)";
_setattrsingle("loading",BA.ObjectToString(_varloading));
 }else {
 //BA.debugLineNum = 611;BA.debugLine="Dim pp As String = $\"${ID}Loading\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Loading");
 //BA.debugLineNum = 612;BA.debugLine="vue.SetStateSingle(pp, varLoading)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloading));
 //BA.debugLineNum = 613;BA.debugLine="TextField.Bind(\":loading\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":loading",_pp);
 };
 //BA.debugLineNum = 615;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 616;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 1154;BA.debugLine="Sub SetMarginAll(p As String) As VMTextField";
 //BA.debugLineNum = 1155;BA.debugLine="TextField.setmarginall(p)";
_textfield._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 1156;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1157;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setmaxlength(String _varmaxlen) throws Exception{
String _pp = "";
 //BA.debugLineNum = 215;BA.debugLine="Sub SetMaxLength(varMaxLen As String) As VMTextFie";
 //BA.debugLineNum = 216;BA.debugLine="If varMaxLen = \"0\" Then Return Me";
if ((_varmaxlen).equals("0")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 217;BA.debugLine="If varMaxLen = \"\" Then Return Me";
if ((_varmaxlen).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 218;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 219;BA.debugLine="SetAttrSingle(\"maxlength\", varMaxLen)";
_setattrsingle("maxlength",_varmaxlen);
 }else {
 //BA.debugLineNum = 221;BA.debugLine="Dim pp As String = $\"${ID}varMaxLen\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"varMaxLen");
 //BA.debugLineNum = 222;BA.debugLine="vue.SetStateSingle(pp, varMaxLen)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxlen));
 //BA.debugLineNum = 223;BA.debugLine="TextField.Bind(\":maxlength\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":maxlength",_pp);
 };
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setmessages(Object _varmessages) throws Exception{
String _pp = "";
 //BA.debugLineNum = 619;BA.debugLine="Sub SetMessages(varMessages As Object) As VMTextFi";
 //BA.debugLineNum = 620;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 621;BA.debugLine="SetAttrSingle(\"messages\", varMessages)";
_setattrsingle("messages",BA.ObjectToString(_varmessages));
 }else {
 //BA.debugLineNum = 623;BA.debugLine="Dim pp As String = $\"${ID}Messages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Messages");
 //BA.debugLineNum = 624;BA.debugLine="vue.SetStateSingle(pp, varMessages)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmessages);
 //BA.debugLineNum = 625;BA.debugLine="TextField.Bind(\":messages\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":messages",_pp);
 };
 //BA.debugLineNum = 627;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 628;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setmultiple(boolean _varmultiple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1355;BA.debugLine="Sub SetMultiple(varMultiple As Boolean) As VMTextF";
 //BA.debugLineNum = 1356;BA.debugLine="If varMultiple = False Then Return Me";
if (_varmultiple==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1357;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1358;BA.debugLine="TextField.SetAttrSingle(\"multiple\", varMultiple)";
_textfield._setattrsingle /*b4j.example.vmelement*/ ("multiple",BA.ObjectToString(_varmultiple));
 //BA.debugLineNum = 1359;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 };
 //BA.debugLineNum = 1361;BA.debugLine="Dim pp As String = $\"${ID}Multiple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Multiple");
 //BA.debugLineNum = 1362;BA.debugLine="vue.SetStateSingle(pp, varMultiple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmultiple));
 //BA.debugLineNum = 1363;BA.debugLine="TextField.Bind(\":multiple\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":multiple",_pp);
 //BA.debugLineNum = 1364;BA.debugLine="bMultiple = varMultiple";
_bmultiple = _varmultiple;
 //BA.debugLineNum = 1365;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1366;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 1171;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 1172;BA.debugLine="TextField.SetName(varName, bbind)";
_textfield._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 1173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setnoresize(boolean _varnoresize) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1266;BA.debugLine="Sub SetNoResize(varNoResize As Boolean) As VMTextF";
 //BA.debugLineNum = 1267;BA.debugLine="If varNoResize = False Then Return Me";
if (_varnoresize==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1268;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1269;BA.debugLine="TextField.SetAttrSingle(\"no-resize\", varNoResize";
_textfield._setattrsingle /*b4j.example.vmelement*/ ("no-resize",BA.ObjectToString(_varnoresize));
 //BA.debugLineNum = 1270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 };
 //BA.debugLineNum = 1272;BA.debugLine="Dim pp As String = $\"${ID}NoResize\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NoResize");
 //BA.debugLineNum = 1273;BA.debugLine="vue.SetStateSingle(pp, varNoResize)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnoresize));
 //BA.debugLineNum = 1274;BA.debugLine="TextField.Bind(\":no-resize\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":no-resize",_pp);
 //BA.debugLineNum = 1275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setnumber() throws Exception{
 //BA.debugLineNum = 1213;BA.debugLine="Sub SetNumber As VMTextField";
 //BA.debugLineNum = 1214;BA.debugLine="TextField.typeOf = \"number\"";
_textfield._typeof /*String*/  = "number";
 //BA.debugLineNum = 1215;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1216;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setonblur(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 925;BA.debugLine="Sub SetOnBlur(eventHandler As Object, methodName A";
 //BA.debugLineNum = 926;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 927;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 928;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 929;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 930;BA.debugLine="SetAttr(CreateMap(\"@blur\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@blur"),(Object)(_methodname)}));
 //BA.debugLineNum = 932;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 933;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 934;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setonchange(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 937;BA.debugLine="Sub SetOnChange(eventHandler As Object, methodName";
 //BA.debugLineNum = 938;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 939;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 940;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 941;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 942;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 944;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 945;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 946;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setonclick(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 960;BA.debugLine="Sub SetOnClick(eventHandler As Object, methodName";
 //BA.debugLineNum = 961;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 962;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 963;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 964;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 965;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 967;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 968;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 969;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setonclickappend(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 972;BA.debugLine="Sub SetOnClickAppend(eventHandler As Object, metho";
 //BA.debugLineNum = 973;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 974;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 975;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 976;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 977;BA.debugLine="SetAttr(CreateMap(\"@click:append\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:append"),(Object)(_methodname)}));
 //BA.debugLineNum = 979;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 980;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 981;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setonclickappendouter(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 984;BA.debugLine="Sub SetOnClickAppendOuter(eventHandler As Object,";
 //BA.debugLineNum = 985;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 986;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 987;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 988;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 989;BA.debugLine="SetAttr(CreateMap(\"@click:append-outer\": methodNa";
_setattr(__c.createMap(new Object[] {(Object)("@click:append-outer"),(Object)(_methodname)}));
 //BA.debugLineNum = 991;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 992;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 993;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setonclickclear(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 996;BA.debugLine="Sub SetOnClickClear(eventHandler As Object, method";
 //BA.debugLineNum = 997;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 998;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 999;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1000;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1001;BA.debugLine="SetAttr(CreateMap(\"@click:clear\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:clear"),(Object)(_methodname)}));
 //BA.debugLineNum = 1003;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1004;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1005;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setonclickprepend(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1008;BA.debugLine="Sub SetOnClickPrepend(eventHandler As Object, meth";
 //BA.debugLineNum = 1009;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1010;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1011;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1012;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1013;BA.debugLine="SetAttr(CreateMap(\"@click:prepend\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:prepend"),(Object)(_methodname)}));
 //BA.debugLineNum = 1015;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1016;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1017;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setonclickprependinner(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1020;BA.debugLine="Sub SetOnClickPrependInner(eventHandler As Object,";
 //BA.debugLineNum = 1021;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1022;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1023;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1024;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1025;BA.debugLine="SetAttr(CreateMap(\"@click:prepend-inner\": methodN";
_setattr(__c.createMap(new Object[] {(Object)("@click:prepend-inner"),(Object)(_methodname)}));
 //BA.debugLineNum = 1027;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1028;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1029;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setonfile(Object _eventhandler,String _methodname) throws Exception{
Object _filelist = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 948;BA.debugLine="Sub SetOnFile(eventHandler As Object, methodName A";
 //BA.debugLineNum = 949;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 950;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 951;BA.debugLine="Dim fileList As Object";
_filelist = new Object();
 //BA.debugLineNum = 952;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_filelist}))));
 //BA.debugLineNum = 953;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 955;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 956;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 957;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setonfocus(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1032;BA.debugLine="Sub SetOnFocus(eventHandler As Object, methodName";
 //BA.debugLineNum = 1033;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1034;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1035;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1036;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1037;BA.debugLine="SetAttr(CreateMap(\"@focus\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@focus"),(Object)(_methodname)}));
 //BA.debugLineNum = 1039;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1040;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1041;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setoninput(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1044;BA.debugLine="Sub SetOnInput(eventHandler As Object, methodName";
 //BA.debugLineNum = 1045;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1046;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1047;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1048;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1049;BA.debugLine="SetAttr(CreateMap(\"@input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_methodname)}));
 //BA.debugLineNum = 1051;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1052;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1053;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setonkeydown(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1056;BA.debugLine="Sub SetOnKeydown(eventHandler As Object, methodNam";
 //BA.debugLineNum = 1057;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1058;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1059;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1060;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1061;BA.debugLine="SetAttr(CreateMap(\"@keydown\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@keydown"),(Object)(_methodname)}));
 //BA.debugLineNum = 1063;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1064;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1065;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setonkeydownenter(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1067;BA.debugLine="Sub SetOnKeydownEnter(eventHandler As Object, meth";
 //BA.debugLineNum = 1068;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1069;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1070;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1071;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1072;BA.debugLine="SetAttr(CreateMap(\"@keydown.enter\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@keydown.enter"),(Object)(_methodname)}));
 //BA.debugLineNum = 1074;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1075;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1076;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setonmousedown(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1080;BA.debugLine="Sub SetOnMousedown(methodName As String) As VMText";
 //BA.debugLineNum = 1081;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1082;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1083;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1084;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1085;BA.debugLine="SetAttr(CreateMap(\"@mousedown\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mousedown"),(Object)(_methodname)}));
 //BA.debugLineNum = 1087;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1088;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1089;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setonmouseup(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1092;BA.debugLine="Sub SetOnMouseup(methodName As String) As VMTextFi";
 //BA.debugLineNum = 1093;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1094;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1095;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1096;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1097;BA.debugLine="SetAttr(CreateMap(\"@mouseup\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mouseup"),(Object)(_methodname)}));
 //BA.debugLineNum = 1099;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setonupdateerror(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1104;BA.debugLine="Sub SetOnUpdateError(methodName As String) As VMTe";
 //BA.debugLineNum = 1105;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1106;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1107;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1108;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1109;BA.debugLine="SetAttr(CreateMap(\"@update:error\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:error"),(Object)(_methodname)}));
 //BA.debugLineNum = 1111;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1112;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1113;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setoutlined(boolean _varoutlined) throws Exception{
String _pp = "";
 //BA.debugLineNum = 631;BA.debugLine="Sub SetOutlined(varOutlined As Boolean) As VMTextF";
 //BA.debugLineNum = 632;BA.debugLine="If varOutlined = False Then Return Me";
if (_varoutlined==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 633;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 634;BA.debugLine="SetAttrSingle(\"outlined\", varOutlined)";
_setattrsingle("outlined",BA.ObjectToString(_varoutlined));
 }else {
 //BA.debugLineNum = 636;BA.debugLine="Dim pp As String = $\"${ID}Outlined\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Outlined");
 //BA.debugLineNum = 637;BA.debugLine="vue.SetStateSingle(pp, varOutlined)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoutlined));
 //BA.debugLineNum = 638;BA.debugLine="TextField.Bind(\":outlined\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":outlined",_pp);
 };
 //BA.debugLineNum = 640;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 641;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 1149;BA.debugLine="Sub SetPaddingAll(p As String) As VMTextField";
 //BA.debugLineNum = 1150;BA.debugLine="TextField.SetPaddingAll(p)";
_textfield._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 1151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1152;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setpassword(boolean _b,boolean _toggle) throws Exception{
String _sline = "";
 //BA.debugLineNum = 102;BA.debugLine="Sub SetPassword(b As Boolean, toggle As Boolean) A";
 //BA.debugLineNum = 103;BA.debugLine="vue.SetData(password, False)";
_vue._setdata /*b4j.example.bananovue*/ (_password,(Object)(__c.False));
 //BA.debugLineNum = 104;BA.debugLine="Dim sline As String = $\"${password} ? 'mdi-eye' :";
_sline = (""+__c.SmartStringFormatter("",(Object)(_password))+" ? 'mdi-eye' : 'mdi-eye-off'");
 //BA.debugLineNum = 105;BA.debugLine="If toggle Then TextField.Bind(\":append-icon\", sli";
if (_toggle) { 
_textfield._bind /*b4j.example.vmelement*/ (":append-icon",_sline);};
 //BA.debugLineNum = 106;BA.debugLine="TextField.Bind(\":type\", $\"${password} ? 'text' :";
_textfield._bind /*b4j.example.vmelement*/ (":type",(""+__c.SmartStringFormatter("",(Object)(_password))+" ? 'text' : 'password'"));
 //BA.debugLineNum = 107;BA.debugLine="If toggle Then TextField.SetAttrSingle(\"@click:ap";
if (_toggle) { 
_textfield._setattrsingle /*b4j.example.vmelement*/ ("@click:append",(""+__c.SmartStringFormatter("",(Object)(_password))+" = !"+__c.SmartStringFormatter("",(Object)(_password))+""));};
 //BA.debugLineNum = 108;BA.debugLine="TextField.typeOf = \"password\"";
_textfield._typeof /*String*/  = "password";
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setpersistenthint(boolean _varpersistenthint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 644;BA.debugLine="Sub SetPersistentHint(varPersistentHint As Boolean";
 //BA.debugLineNum = 645;BA.debugLine="If varPersistentHint = False Then Return Me";
if (_varpersistenthint==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 646;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 647;BA.debugLine="SetAttrSingle(\"persistent-hint\", varPersistentHi";
_setattrsingle("persistent-hint",BA.ObjectToString(_varpersistenthint));
 }else {
 //BA.debugLineNum = 649;BA.debugLine="Dim pp As String = $\"${ID}PersistentHint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PersistentHint");
 //BA.debugLineNum = 650;BA.debugLine="vue.SetStateSingle(pp, varPersistentHint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpersistenthint));
 //BA.debugLineNum = 651;BA.debugLine="TextField.Bind(\":persistent-hint\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":persistent-hint",_pp);
 };
 //BA.debugLineNum = 653;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 654;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setplaceholder(String _varplaceholder) throws Exception{
String _pp = "";
 //BA.debugLineNum = 657;BA.debugLine="Sub SetPlaceholder(varPlaceholder As String) As VM";
 //BA.debugLineNum = 658;BA.debugLine="If varPlaceholder = \"\" Then Return Me";
if ((_varplaceholder).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 659;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 660;BA.debugLine="SetAttrSingle(\"placeholder\", varPlaceholder)";
_setattrsingle("placeholder",_varplaceholder);
 }else {
 //BA.debugLineNum = 662;BA.debugLine="Dim pp As String = $\"${ID}Placeholder\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Placeholder");
 //BA.debugLineNum = 663;BA.debugLine="vue.SetStateSingle(pp, varPlaceholder)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varplaceholder));
 //BA.debugLineNum = 664;BA.debugLine="TextField.Bind(\":placeholder\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":placeholder",_pp);
 };
 //BA.debugLineNum = 666;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 667;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setprefix(String _varprefix) throws Exception{
String _pp = "";
 //BA.debugLineNum = 672;BA.debugLine="Sub SetPrefix(varPrefix As String) As VMTextField";
 //BA.debugLineNum = 673;BA.debugLine="If varPrefix = \"\" Then Return Me";
if ((_varprefix).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 674;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 675;BA.debugLine="SetAttrSingle(\"prefix\", varPrefix)";
_setattrsingle("prefix",_varprefix);
 }else {
 //BA.debugLineNum = 677;BA.debugLine="Dim pp As String = $\"${ID}Prefix\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Prefix");
 //BA.debugLineNum = 678;BA.debugLine="vue.SetStateSingle(pp, varPrefix)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprefix));
 //BA.debugLineNum = 679;BA.debugLine="TextField.Bind(\":prefix\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":prefix",_pp);
 };
 //BA.debugLineNum = 681;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 682;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setprependicon(String _varprependicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 685;BA.debugLine="Sub SetPrependIcon(varPrependIcon As String) As VM";
 //BA.debugLineNum = 686;BA.debugLine="If varPrependIcon = \"\" Then Return Me";
if ((_varprependicon).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 687;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 688;BA.debugLine="SetAttrSingle(\"prepend-icon\", varPrependIcon)";
_setattrsingle("prepend-icon",_varprependicon);
 }else {
 //BA.debugLineNum = 690;BA.debugLine="Dim pp As String = $\"${ID}PrependIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrependIcon");
 //BA.debugLineNum = 691;BA.debugLine="vue.SetStateSingle(pp, varPrependIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprependicon));
 //BA.debugLineNum = 692;BA.debugLine="TextField.Bind(\":prepend-icon\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":prepend-icon",_pp);
 };
 //BA.debugLineNum = 694;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 695;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setprependinnericon(String _varprependinnericon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 698;BA.debugLine="Sub SetPrependInnerIcon(varPrependInnerIcon As Str";
 //BA.debugLineNum = 699;BA.debugLine="If varPrependInnerIcon = \"\" Then Return Me";
if ((_varprependinnericon).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 700;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 701;BA.debugLine="SetAttrSingle(\"prepend-inner-icon\", varPrependIn";
_setattrsingle("prepend-inner-icon",_varprependinnericon);
 }else {
 //BA.debugLineNum = 703;BA.debugLine="Dim pp As String = $\"${ID}PrependInnerIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrependInnerIcon");
 //BA.debugLineNum = 704;BA.debugLine="vue.SetStateSingle(pp, varPrependInnerIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprependinnericon));
 //BA.debugLineNum = 705;BA.debugLine="TextField.Bind(\":prepend-inner-icon\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":prepend-inner-icon",_pp);
 };
 //BA.debugLineNum = 707;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 708;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMTex";
 //BA.debugLineNum = 145;BA.debugLine="TextField.SetRC(sRow, sCol)";
_textfield._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setreadonly(boolean _varreadonly) throws Exception{
String _pp = "";
 //BA.debugLineNum = 711;BA.debugLine="Sub SetReadonly(varReadonly As Boolean) As VMTextF";
 //BA.debugLineNum = 712;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 713;BA.debugLine="SetAttrSingle(\"readonly\", varReadonly)";
_setattrsingle("readonly",BA.ObjectToString(_varreadonly));
 }else {
 //BA.debugLineNum = 715;BA.debugLine="Dim pp As String = $\"${ID}Readonly\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Readonly");
 //BA.debugLineNum = 716;BA.debugLine="vue.SetStateSingle(pp, varReadonly)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreadonly));
 //BA.debugLineNum = 717;BA.debugLine="TextField.Bind(\":readonly\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":readonly",_pp);
 };
 //BA.debugLineNum = 719;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 720;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setrequired(boolean _varrequired) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMTextF";
 //BA.debugLineNum = 230;BA.debugLine="If varRequired = False Then Return Me";
if (_varrequired==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 231;BA.debugLine="TextField.SetRequired(varRequired)";
_textfield._setrequired /*b4j.example.vmelement*/ (_varrequired);
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setreverse(boolean _varreverse) throws Exception{
String _pp = "";
 //BA.debugLineNum = 723;BA.debugLine="Sub SetReverse(varReverse As Boolean) As VMTextFie";
 //BA.debugLineNum = 724;BA.debugLine="If varReverse = False Then Return Me";
if (_varreverse==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 725;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 726;BA.debugLine="SetAttrSingle(\"reverse\", varReverse)";
_setattrsingle("reverse",BA.ObjectToString(_varreverse));
 }else {
 //BA.debugLineNum = 728;BA.debugLine="Dim pp As String = $\"${ID}Reverse\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Reverse");
 //BA.debugLineNum = 729;BA.debugLine="vue.SetStateSingle(pp, varReverse)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreverse));
 //BA.debugLineNum = 730;BA.debugLine="TextField.Bind(\":reverse\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":reverse",_pp);
 };
 //BA.debugLineNum = 732;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 733;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setrounded(boolean _varrounded) throws Exception{
String _pp = "";
 //BA.debugLineNum = 736;BA.debugLine="Sub SetRounded(varRounded As Boolean) As VMTextFie";
 //BA.debugLineNum = 737;BA.debugLine="If varRounded = False Then Return Me";
if (_varrounded==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 738;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 739;BA.debugLine="SetAttrSingle(\"rounded\", varRounded)";
_setattrsingle("rounded",BA.ObjectToString(_varrounded));
 }else {
 //BA.debugLineNum = 741;BA.debugLine="Dim pp As String = $\"${ID}Rounded\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Rounded");
 //BA.debugLineNum = 742;BA.debugLine="vue.SetStateSingle(pp, varRounded)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varrounded));
 //BA.debugLineNum = 743;BA.debugLine="TextField.Bind(\":rounded\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":rounded",_pp);
 };
 //BA.debugLineNum = 745;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 746;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setrowheight(String _varrowheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1279;BA.debugLine="Sub SetRowHeight(varRowHeight As String) As VMText";
 //BA.debugLineNum = 1280;BA.debugLine="If varRowHeight = \"\" Then Return Me";
if ((_varrowheight).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1281;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1282;BA.debugLine="TextField.SetAttrSingle(\":row-height\", varRowHei";
_textfield._setattrsingle /*b4j.example.vmelement*/ (":row-height",_varrowheight);
 //BA.debugLineNum = 1283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 };
 //BA.debugLineNum = 1285;BA.debugLine="Dim pp As String = $\"${ID}RowHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"RowHeight");
 //BA.debugLineNum = 1286;BA.debugLine="vue.SetStateSingle(pp, varRowHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varrowheight));
 //BA.debugLineNum = 1287;BA.debugLine="TextField.Bind(\":row-height\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":row-height",_pp);
 //BA.debugLineNum = 1288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setrows(String _varrows) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1292;BA.debugLine="Sub SetRows(varRows As String) As VMTextField";
 //BA.debugLineNum = 1293;BA.debugLine="If varRows = \"\" Then Return Me";
if ((_varrows).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1294;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1295;BA.debugLine="TextField.SetAttrSingle(\"rows\", varRows)";
_textfield._setattrsingle /*b4j.example.vmelement*/ ("rows",_varrows);
 //BA.debugLineNum = 1296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 };
 //BA.debugLineNum = 1298;BA.debugLine="Dim pp As String = $\"${ID}Rows\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Rows");
 //BA.debugLineNum = 1299;BA.debugLine="vue.SetStateSingle(pp, varRows)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varrows));
 //BA.debugLineNum = 1300;BA.debugLine="TextField.Bind(\":rows\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":rows",_pp);
 //BA.debugLineNum = 1301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1302;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setrules(boolean _b) throws Exception{
String _pp = "";
 //BA.debugLineNum = 749;BA.debugLine="Sub SetRules(b As Boolean) As VMTextField";
 //BA.debugLineNum = 750;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 751;BA.debugLine="If bStatic Then Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 752;BA.debugLine="If DesignMode Then Return Me";
if (_designmode) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 753;BA.debugLine="Dim pp As String = $\"${vmodel}rules\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"rules");
 //BA.debugLineNum = 754;BA.debugLine="TextField.Bind(\":rules\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":rules",_pp);
 //BA.debugLineNum = 755;BA.debugLine="vue.SetData(pp, vue.NewList)";
_vue._setdata /*b4j.example.bananovue*/ (_pp,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 756;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 757;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setshaped(boolean _varshaped) throws Exception{
String _pp = "";
 //BA.debugLineNum = 760;BA.debugLine="Sub SetShaped(varShaped As Boolean) As VMTextField";
 //BA.debugLineNum = 761;BA.debugLine="If varShaped = False Then Return Me";
if (_varshaped==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 762;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 763;BA.debugLine="SetAttrSingle(\"shaped\", varShaped)";
_setattrsingle("shaped",BA.ObjectToString(_varshaped));
 }else {
 //BA.debugLineNum = 765;BA.debugLine="Dim pp As String = $\"${ID}Shaped\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Shaped");
 //BA.debugLineNum = 766;BA.debugLine="vue.SetStateSingle(pp, varShaped)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshaped));
 //BA.debugLineNum = 767;BA.debugLine="TextField.Bind(\":shaped\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":shaped",_pp);
 };
 //BA.debugLineNum = 769;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 770;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setshowsize(boolean _varshowsize) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1369;BA.debugLine="Sub SetShowSize(varShowSize As Boolean) As VMTextF";
 //BA.debugLineNum = 1370;BA.debugLine="If varShowSize = False Then Return Me";
if (_varshowsize==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1371;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1372;BA.debugLine="TextField.Bind(\"show-size\", varShowSize)";
_textfield._bind /*b4j.example.vmelement*/ ("show-size",BA.ObjectToString(_varshowsize));
 //BA.debugLineNum = 1373;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 };
 //BA.debugLineNum = 1375;BA.debugLine="Dim pp As String = $\"${ID}ShowSize\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowSize");
 //BA.debugLineNum = 1376;BA.debugLine="vue.SetStateSingle(pp, varShowSize)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshowsize));
 //BA.debugLineNum = 1377;BA.debugLine="TextField.Bind(\":show-size\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":show-size",_pp);
 //BA.debugLineNum = 1378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setsingleline(boolean _varsingleline) throws Exception{
String _pp = "";
 //BA.debugLineNum = 773;BA.debugLine="Sub SetSingleLine(varSingleLine As Boolean) As VMT";
 //BA.debugLineNum = 774;BA.debugLine="If varSingleLine = False Then Return Me";
if (_varsingleline==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 775;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 776;BA.debugLine="SetAttrSingle(\"single-line\", varSingleLine)";
_setattrsingle("single-line",BA.ObjectToString(_varsingleline));
 }else {
 //BA.debugLineNum = 778;BA.debugLine="Dim pp As String = $\"${ID}SingleLine\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SingleLine");
 //BA.debugLineNum = 779;BA.debugLine="vue.SetStateSingle(pp, varSingleLine)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsingleline));
 //BA.debugLineNum = 780;BA.debugLine="TextField.Bind(\":single-line\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":single-line",_pp);
 };
 //BA.debugLineNum = 782;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 783;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setslotactivator(boolean _b) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetSlotActivator(b As Boolean) As VMTextField";
 //BA.debugLineNum = 72;BA.debugLine="SetAttrSingle(\"slot\", \"activator\")";
_setattrsingle("slot","activator");
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setslotappend(boolean _b) throws Exception{
 //BA.debugLineNum = 883;BA.debugLine="Sub SetSlotAppend(b As Boolean) As VMTextField";
 //BA.debugLineNum = 884;BA.debugLine="SetAttr(CreateMap(\"slot\": \"append\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("append")}));
 //BA.debugLineNum = 885;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 886;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setslotappendouter(boolean _b) throws Exception{
 //BA.debugLineNum = 889;BA.debugLine="Sub SetSlotAppendOuter(b As Boolean) As VMTextFiel";
 //BA.debugLineNum = 890;BA.debugLine="SetAttr(CreateMap(\"slot\": \"append-outer\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("append-outer")}));
 //BA.debugLineNum = 891;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 892;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setslotlabel(boolean _b) throws Exception{
 //BA.debugLineNum = 895;BA.debugLine="Sub SetSlotLabel(b As Boolean) As VMTextField    '";
 //BA.debugLineNum = 896;BA.debugLine="SetAttr(CreateMap(\"slot\": \"label\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("label")}));
 //BA.debugLineNum = 897;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 898;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setslotmessage(boolean _b) throws Exception{
 //BA.debugLineNum = 901;BA.debugLine="Sub SetSlotMessage(b As Boolean) As VMTextField";
 //BA.debugLineNum = 902;BA.debugLine="SetAttr(CreateMap(\"slot\": \"message\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("message")}));
 //BA.debugLineNum = 903;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 904;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setslotprepend(boolean _b) throws Exception{
 //BA.debugLineNum = 907;BA.debugLine="Sub SetSlotPrepend(b As Boolean) As VMTextField";
 //BA.debugLineNum = 908;BA.debugLine="SetAttr(CreateMap(\"slot\": \"prepend\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("prepend")}));
 //BA.debugLineNum = 909;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 910;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setslotprependinner(boolean _b) throws Exception{
 //BA.debugLineNum = 913;BA.debugLine="Sub SetSlotPrependInner(b As Boolean) As VMTextFie";
 //BA.debugLineNum = 914;BA.debugLine="SetAttr(CreateMap(\"slot\": \"prepend-inner\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("prepend-inner")}));
 //BA.debugLineNum = 915;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 916;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setslotprogress(boolean _b) throws Exception{
 //BA.debugLineNum = 919;BA.debugLine="Sub SetSlotProgress(b As Boolean) As VMTextField";
 //BA.debugLineNum = 920;BA.debugLine="SetAttr(CreateMap(\"slot\": \"progress\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("progress")}));
 //BA.debugLineNum = 921;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 922;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setslotselection(boolean _b) throws Exception{
 //BA.debugLineNum = 1407;BA.debugLine="Sub SetSlotSelection(b As Boolean) As VMTextField";
 //BA.debugLineNum = 1408;BA.debugLine="SetAttr(CreateMap(\"slot\": \"selection\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("selection")}));
 //BA.debugLineNum = 1409;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1410;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setsmallchips(boolean _varsmallchips) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1382;BA.debugLine="Sub SetSmallChips(varSmallChips As Boolean) As VMT";
 //BA.debugLineNum = 1383;BA.debugLine="If varSmallChips = False Then Return Me";
if (_varsmallchips==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1384;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1385;BA.debugLine="TextField.SetAttrSingle(\"small-chips\", varSmallC";
_textfield._setattrsingle /*b4j.example.vmelement*/ ("small-chips",BA.ObjectToString(_varsmallchips));
 //BA.debugLineNum = 1386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 };
 //BA.debugLineNum = 1388;BA.debugLine="Dim pp As String = $\"${ID}SmallChips\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SmallChips");
 //BA.debugLineNum = 1389;BA.debugLine="vue.SetStateSingle(pp, varSmallChips)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsmallchips));
 //BA.debugLineNum = 1390;BA.debugLine="TextField.Bind(\":small-chips\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":small-chips",_pp);
 //BA.debugLineNum = 1391;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1392;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setsolo(boolean _varsolo) throws Exception{
String _pp = "";
 //BA.debugLineNum = 786;BA.debugLine="Sub SetSolo(varSolo As Boolean) As VMTextField";
 //BA.debugLineNum = 787;BA.debugLine="If varSolo = False Then Return Me";
if (_varsolo==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 788;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 789;BA.debugLine="SetAttrSingle(\"solo\", varSolo)";
_setattrsingle("solo",BA.ObjectToString(_varsolo));
 }else {
 //BA.debugLineNum = 791;BA.debugLine="Dim pp As String = $\"${ID}Solo\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Solo");
 //BA.debugLineNum = 792;BA.debugLine="vue.SetStateSingle(pp, varSolo)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsolo));
 //BA.debugLineNum = 793;BA.debugLine="TextField.Bind(\":solo\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":solo",_pp);
 };
 //BA.debugLineNum = 795;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 796;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setsoloinverted(boolean _varsoloinverted) throws Exception{
String _pp = "";
 //BA.debugLineNum = 799;BA.debugLine="Sub SetSoloInverted(varSoloInverted As Boolean) As";
 //BA.debugLineNum = 800;BA.debugLine="If varSoloInverted = False Then Return Me";
if (_varsoloinverted==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 801;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 802;BA.debugLine="SetAttrSingle(\"solo-inverted\", varSoloInverted)";
_setattrsingle("solo-inverted",BA.ObjectToString(_varsoloinverted));
 }else {
 //BA.debugLineNum = 804;BA.debugLine="Dim pp As String = $\"${ID}SoloInverted\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SoloInverted");
 //BA.debugLineNum = 805;BA.debugLine="vue.SetStateSingle(pp, varSoloInverted)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsoloinverted));
 //BA.debugLineNum = 806;BA.debugLine="TextField.Bind(\":solo-inverted\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":solo-inverted",_pp);
 };
 //BA.debugLineNum = 808;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 809;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetStatic(b As Boolean) As VMTextField";
 //BA.debugLineNum = 96;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 97;BA.debugLine="TextField.SetStatic(b)";
_textfield._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setstring() throws Exception{
 //BA.debugLineNum = 1208;BA.debugLine="Sub SetString As VMTextField";
 //BA.debugLineNum = 1209;BA.debugLine="TextField.fieldType = \"string\"";
_textfield._fieldtype /*String*/  = "string";
 //BA.debugLineNum = 1210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Sub SetStyle(sm As Map) As VMTextField";
 //BA.debugLineNum = 294;BA.debugLine="TextField.SetStyle(sm)";
_textfield._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1177;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 1178;BA.debugLine="TextField.SetStyleSingle(prop, value)";
_textfield._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 1179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setsuccess(boolean _varsuccess) throws Exception{
String _pp = "";
 //BA.debugLineNum = 812;BA.debugLine="Sub SetSuccess(varSuccess As Boolean) As VMTextFie";
 //BA.debugLineNum = 813;BA.debugLine="If varSuccess = False Then Return Me";
if (_varsuccess==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 814;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 815;BA.debugLine="SetAttrSingle(\"success\", varSuccess)";
_setattrsingle("success",BA.ObjectToString(_varsuccess));
 }else {
 //BA.debugLineNum = 817;BA.debugLine="Dim pp As String = $\"${ID}Success\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Success");
 //BA.debugLineNum = 818;BA.debugLine="vue.SetStateSingle(pp, varSuccess)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsuccess));
 //BA.debugLineNum = 819;BA.debugLine="TextField.Bind(\":success\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":success",_pp);
 };
 //BA.debugLineNum = 821;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 822;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setsuccessmessage(Object _varsuccessmessage) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1305;BA.debugLine="Sub SetSuccessMessage(varSuccessMessage As Object)";
 //BA.debugLineNum = 1306;BA.debugLine="Dim pp As String = $\"${ID}SuccessMessage\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SuccessMessage");
 //BA.debugLineNum = 1307;BA.debugLine="vue.SetStateSingle(pp, varSuccessMessage)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varsuccessmessage);
 //BA.debugLineNum = 1308;BA.debugLine="TextField.Bind(\":success-message\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":success-message",_pp);
 //BA.debugLineNum = 1309;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1310;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setsuccessmessages(Object _varsuccessmessages) throws Exception{
String _pp = "";
 //BA.debugLineNum = 825;BA.debugLine="Sub SetSuccessMessages(varSuccessMessages As Objec";
 //BA.debugLineNum = 826;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 827;BA.debugLine="SetAttrSingle(\"success-messages\", varSuccessMess";
_setattrsingle("success-messages",BA.ObjectToString(_varsuccessmessages));
 }else {
 //BA.debugLineNum = 829;BA.debugLine="Dim pp As String = $\"${ID}SuccessMessages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SuccessMessages");
 //BA.debugLineNum = 830;BA.debugLine="vue.SetStateSingle(pp, varSuccessMessages)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varsuccessmessages);
 //BA.debugLineNum = 831;BA.debugLine="TextField.Bind(\":success-messages\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":success-messages",_pp);
 };
 //BA.debugLineNum = 833;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 834;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setsuffix(String _varsuffix) throws Exception{
String _pp = "";
 //BA.debugLineNum = 837;BA.debugLine="Sub SetSuffix(varSuffix As String) As VMTextField";
 //BA.debugLineNum = 838;BA.debugLine="If varSuffix = \"\" Then Return Me";
if ((_varsuffix).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 839;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 840;BA.debugLine="SetAttrSingle(\"suffix\", varSuffix)";
_setattrsingle("suffix",_varsuffix);
 }else {
 //BA.debugLineNum = 842;BA.debugLine="Dim pp As String = $\"${ID}Suffix\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Suffix");
 //BA.debugLineNum = 843;BA.debugLine="vue.SetStateSingle(pp, varSuffix)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsuffix));
 //BA.debugLineNum = 844;BA.debugLine="TextField.Bind(\":suffix\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":suffix",_pp);
 };
 //BA.debugLineNum = 846;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 847;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 1165;BA.debugLine="Sub SetTabIndex(ti As String) As VMTextField";
 //BA.debugLineNum = 1166;BA.debugLine="TextField.SetTabIndex(ti)";
_textfield._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 1167;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1168;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _settel() throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetTel As VMTextField";
 //BA.debugLineNum = 169;BA.debugLine="TextField.typeOf = \"tel\"";
_textfield._typeof /*String*/  = "tel";
 //BA.debugLineNum = 170;BA.debugLine="TextField.InputType = \"tel\"";
_textfield._inputtype /*String*/  = "tel";
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetText(t As Object) As VMTextField";
 //BA.debugLineNum = 271;BA.debugLine="TextField.SetText(t)";
_textfield._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _settextarea() throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetTextArea As VMTextField";
 //BA.debugLineNum = 90;BA.debugLine="TextField.SetTag(\"v-textarea\")";
_textfield._settag /*b4j.example.vmelement*/ ("v-textarea");
 //BA.debugLineNum = 91;BA.debugLine="TextField.typeOf = \"textarea\"";
_textfield._typeof /*String*/  = "textarea";
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 1235;BA.debugLine="Sub SetTextColor(varColor As String) As VMTextFiel";
 //BA.debugLineNum = 1236;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1237;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 1238;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 1239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1240;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 1243;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 1244;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1245;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 1246;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 1247;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 1248;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 1249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1250;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _settruncatelength(boolean _vartruncatelength) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1395;BA.debugLine="Sub SetTruncateLength(varTruncateLength As Boolean";
 //BA.debugLineNum = 1396;BA.debugLine="If varTruncateLength = False Then Return Me";
if (_vartruncatelength==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1397;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1398;BA.debugLine="TextField.SetAttrSingle(\":truncate-length\", varT";
_textfield._setattrsingle /*b4j.example.vmelement*/ (":truncate-length",BA.ObjectToString(_vartruncatelength));
 //BA.debugLineNum = 1399;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 };
 //BA.debugLineNum = 1401;BA.debugLine="Dim pp As String = $\"${ID}TruncateLength\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"TruncateLength");
 //BA.debugLineNum = 1402;BA.debugLine="vue.SetStateSingle(pp, varTruncateLength)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartruncatelength));
 //BA.debugLineNum = 1403;BA.debugLine="TextField.Bind(\":truncate-length\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":truncate-length",_pp);
 //BA.debugLineNum = 1404;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1405;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _settype(String _vartype) throws Exception{
String _pp = "";
 //BA.debugLineNum = 850;BA.debugLine="Sub SetType(varType As String) As VMTextField";
 //BA.debugLineNum = 851;BA.debugLine="If varType = \"\" Then Return Me";
if ((_vartype).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 852;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 853;BA.debugLine="SetAttrSingle(\"type\", varType)";
_setattrsingle("type",_vartype);
 }else {
 //BA.debugLineNum = 855;BA.debugLine="Dim pp As String = $\"${ID}Type\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Type");
 //BA.debugLineNum = 856;BA.debugLine="vue.SetStateSingle(pp, varType)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartype));
 //BA.debugLineNum = 857;BA.debugLine="TextField.Bind(\":type\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":type",_pp);
 };
 //BA.debugLineNum = 859;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 860;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _settypedate(boolean _b) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetTypeDate(b As Boolean) As VMTextField";
 //BA.debugLineNum = 133;BA.debugLine="SetType(\"date\")";
_settype("date");
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _settypeemail(boolean _b) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetTypeEmail(b As Boolean) As VMTextField";
 //BA.debugLineNum = 118;BA.debugLine="SetType(\"email\")";
_settype("email");
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _settypenumber(boolean _b) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetTypeNumber(b As Boolean) As VMTextField";
 //BA.debugLineNum = 113;BA.debugLine="SetType(\"number\")";
_settype("number");
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _settypepassword(boolean _b) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetTypePassword(b As Boolean) As VMTextField";
 //BA.debugLineNum = 123;BA.debugLine="SetType(\"password\")";
_settype("password");
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _settypetext(boolean _b) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetTypeText(b As Boolean) As VMTextField";
 //BA.debugLineNum = 128;BA.debugLine="SetType(\"text\")";
_settype("text");
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setvalidateonblur(boolean _varvalidateonblur) throws Exception{
String _pp = "";
 //BA.debugLineNum = 863;BA.debugLine="Sub SetValidateOnBlur(varValidateOnBlur As Boolean";
 //BA.debugLineNum = 864;BA.debugLine="If varValidateOnBlur = False Then Return Me";
if (_varvalidateonblur==__c.False) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 865;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 866;BA.debugLine="SetAttrSingle(\"validate-on-blur\", varValidateOnB";
_setattrsingle("validate-on-blur",BA.ObjectToString(_varvalidateonblur));
 //BA.debugLineNum = 867;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 };
 //BA.debugLineNum = 869;BA.debugLine="Dim pp As String = $\"${ID}ValidateOnBlur\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ValidateOnBlur");
 //BA.debugLineNum = 870;BA.debugLine="vue.SetBoolean(pp, varValidateOnBlur)";
_vue._setboolean /*b4j.example.bananovue*/ (_pp,_varvalidateonblur);
 //BA.debugLineNum = 871;BA.debugLine="TextField.Bind(\":validate-on-blur\", pp)";
_textfield._bind /*b4j.example.vmelement*/ (":validate-on-blur",_pp);
 //BA.debugLineNum = 872;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 873;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 876;BA.debugLine="Sub SetValue(varValue As String) As VMTextField";
 //BA.debugLineNum = 877;BA.debugLine="TextField.SetValue(varValue,False)";
_textfield._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 878;BA.debugLine="vue.SetData(vmodel, varValue)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(_varvalue));
 //BA.debugLineNum = 879;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 880;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetVIf(vif As String) As VMTextField";
 //BA.debugLineNum = 248;BA.debugLine="TextField.SetVIf(vif)";
_textfield._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 1229;BA.debugLine="Sub SetVisible(b As Boolean) As VMTextField";
 //BA.debugLineNum = 1230;BA.debugLine="TextField.SetVisible(b)";
_textfield._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 1231;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1232;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub SetVModel(k As String) As VMTextField";
 //BA.debugLineNum = 242;BA.debugLine="vmodel = k.tolowercase";
_vmodel = _k.toLowerCase();
 //BA.debugLineNum = 243;BA.debugLine="TextField.SetVModel(k)";
_textfield._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetVShow(vif As String) As VMTextField";
 //BA.debugLineNum = 253;BA.debugLine="TextField.SetVShow(vif)";
_textfield._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _setwidth(String _w) throws Exception{
 //BA.debugLineNum = 1412;BA.debugLine="Sub SetWidth(w As String) As VMTextField";
 //BA.debugLineNum = 1413;BA.debugLine="If w = \"\" Then Return Me";
if ((_w).equals("")) { 
if (true) return (b4j.example.vmtextfield)(this);};
 //BA.debugLineNum = 1414;BA.debugLine="TextField.SetStyleSingle(\"width\", w)";
_textfield._setstylesingle /*b4j.example.vmelement*/ ("width",(Object)(_w));
 //BA.debugLineNum = 1415;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1416;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _show() throws Exception{
 //BA.debugLineNum = 1120;BA.debugLine="Sub Show As VMTextField";
 //BA.debugLineNum = 1121;BA.debugLine="TextField.SetVisible(True)";
_textfield._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 1123;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 238;BA.debugLine="Return TextField.ToString";
if (true) return _textfield._tostring /*String*/ ();
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtextfield  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 189;BA.debugLine="Sub UseTheme(themeName As String) As VMTextField";
 //BA.debugLineNum = 190;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 191;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 192;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 193;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 194;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextfield)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
