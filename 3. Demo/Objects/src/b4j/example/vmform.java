package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmform extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmform", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmform.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmcontainer _container = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public String _formvalid = "";
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
public b4j.example.vmform  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 134;BA.debugLine="Sub AddChild(child As VMElement) As VMForm";
 //BA.debugLineNum = 135;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 136;BA.debugLine="Container.SetText(childHTML)";
_container._settext /*b4j.example.vmcontainer*/ (_childhtml);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 170;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 171;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 172;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmform  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub AddClass(c As String) As VMForm";
 //BA.debugLineNum = 153;BA.debugLine="Container.AddClass(c)";
_container._addclass /*b4j.example.vmcontainer*/ (_c);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 290;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmform  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 221;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 222;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 295;BA.debugLine="Container.BuildModel(mprops, mstyles, lclasses, l";
_container._buildmodel /*b4j.example.vmcontainer*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
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
 //BA.debugLineNum = 10;BA.debugLine="Private formValid As String";
_formvalid = "";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public boolean  _hascontent() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub HasContent As Boolean";
 //BA.debugLineNum = 50;BA.debugLine="Return Container.hascontent";
if (true) return _container._hascontent /*boolean*/ ;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return false;
}
public b4j.example.vmform  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="Container.Initialize(v, ID, eventHandler).SetTag(";
_container._initialize /*b4j.example.vmcontainer*/ (ba,_v,_id,_eventhandler)._settag /*b4j.example.vmcontainer*/ ("v-form");
 //BA.debugLineNum = 17;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="formValid = $\"${ID}valid\"$";
_formvalid = (""+__c.SmartStringFormatter("",(Object)(_id))+"valid");
 //BA.debugLineNum = 22;BA.debugLine="SetVModel(formValid)";
_setvmodel(_formvalid);
 //BA.debugLineNum = 23;BA.debugLine="SetAttrSingle(\"ref\", ID)";
_setattrsingle("ref",_id);
 //BA.debugLineNum = 24;BA.debugLine="SetValid(True)";
_setvalid(__c.True);
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 148;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmform  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="public Sub RemoveAttr(sName As String) As VMForm";
 //BA.debugLineNum = 228;BA.debugLine="Container.RemoveAttr(sName)";
_container._removeattr /*b4j.example.vmcontainer*/ (_sname);
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _removevmodel() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub RemoveVModel As VMForm";
 //BA.debugLineNum = 40;BA.debugLine="RemoveAttr(\"v-model\")";
_removeattr("v-model");
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub Render";
 //BA.debugLineNum = 130;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _reset() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Reset";
 //BA.debugLineNum = 58;BA.debugLine="vue.refs.GetField(ID).RunMethod(\"reset\", Null)";
_vue._refs /*com.ab.banano.BANanoObject*/ .GetField(_id).RunMethod("reset",__c.Null);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _resetvalidation() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub ResetValidation";
 //BA.debugLineNum = 62;BA.debugLine="vue.refs.GetField(ID).RunMethod(\"resetValidation\"";
_vue._refs /*com.ab.banano.BANanoObject*/ .GetField(_id).RunMethod("resetValidation",__c.Null);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmform  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetAttr(attr As Map) As VMForm";
 //BA.debugLineNum = 159;BA.debugLine="Container.SetAttr(attr)";
_container._setattr /*b4j.example.vmcontainer*/ (_attr);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 95;BA.debugLine="Sub SetAttributes(attrs As List) As VMForm";
 //BA.debugLineNum = 96;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 97;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetAttrLoose(loose As String) As VMForm";
 //BA.debugLineNum = 91;BA.debugLine="Container.SetAttrLoose(loose)";
_container._setattrloose /*b4j.example.vmcontainer*/ (_loose);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 272;BA.debugLine="Container.SetAttrSingle(prop, value)";
_container._setattrsingle /*b4j.example.vmcontainer*/ (_prop,_value);
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 45;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMForm";
 //BA.debugLineNum = 244;BA.debugLine="Container.SetDesignMode(b)";
_container._setdesignmode /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 245;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 73;BA.debugLine="Container.SetDeviceOffsets(OS, OM, OL, OX)";
_container._setdeviceoffsets /*b4j.example.vmcontainer*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 85;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 86;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 79;BA.debugLine="Container.SetDeviceSizes(SS, SM, SL, SX)";
_container._setdevicesizes /*b4j.example.vmcontainer*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setheight(String _h) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub SetHeight(h As String) As VMForm";
 //BA.debugLineNum = 278;BA.debugLine="Container.SetStyleSingle(\"height\", h)";
_container._setstylesingle /*b4j.example.vmcontainer*/ ("height",_h);
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setlazyvalidation(boolean _varlazyvalidation) throws Exception{
String _pp = "";
 //BA.debugLineNum = 177;BA.debugLine="Sub SetLazyValidation(varLazyValidation As Boolean";
 //BA.debugLineNum = 178;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 179;BA.debugLine="SetAttrSingle(\"lazy-validation\", varLazyValidati";
_setattrsingle("lazy-validation",BA.ObjectToString(_varlazyvalidation));
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 };
 //BA.debugLineNum = 182;BA.debugLine="Dim pp As String = $\"${ID}LazyValidation\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"LazyValidation");
 //BA.debugLineNum = 183;BA.debugLine="vue.SetStateSingle(pp, varLazyValidation)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlazyvalidation));
 //BA.debugLineNum = 184;BA.debugLine="Container.Bind(\":lazy-validation\", pp)";
_container._bind /*b4j.example.vmcontainer*/ (":lazy-validation",_pp);
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub SetMarginAll(p As String) As VMForm";
 //BA.debugLineNum = 239;BA.debugLine="Container.setmarginall(p)";
_container._setmarginall /*b4j.example.vmcontainer*/ (_p);
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 262;BA.debugLine="Container.SetName(varName, bbind)";
_container._setname /*b4j.example.vmcontainer*/ (_varname,_bbind);
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setoninput(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 195;BA.debugLine="Sub SetOnInput(methodName As String) As VMForm";
 //BA.debugLineNum = 196;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 197;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmform)(this);};
 //BA.debugLineNum = 198;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 199;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 200;BA.debugLine="SetAttr(CreateMap(\"@input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_methodname)}));
 //BA.debugLineNum = 202;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setonsubmit(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 207;BA.debugLine="Sub SetOnSubmit(methodName As String) As VMForm";
 //BA.debugLineNum = 208;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 209;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmform)(this);};
 //BA.debugLineNum = 210;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 211;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 212;BA.debugLine="SetAttr(CreateMap(\"@submit\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@submit"),(Object)(_methodname)}));
 //BA.debugLineNum = 214;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub SetPaddingAll(p As String) As VMForm";
 //BA.debugLineNum = 234;BA.debugLine="Container.SetPaddingAll(p)";
_container._setpaddingall /*b4j.example.vmcontainer*/ (_p);
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMFor";
 //BA.debugLineNum = 67;BA.debugLine="Container.SetRC(sRow, sCol)";
_container._setrc /*b4j.example.vmcontainer*/ (_srow,_scol);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub SetStatic(b As Boolean) As VMForm";
 //BA.debugLineNum = 250;BA.debugLine="Container.SetStatic(b)";
_container._setstatic /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 251;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SetStyle(sm As Map) As VMForm";
 //BA.debugLineNum = 165;BA.debugLine="Container.SetStyle(sm)";
_container._setstyle /*b4j.example.vmcontainer*/ (_sm);
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 267;BA.debugLine="Container.SetStyleSingle(prop, value)";
_container._setstylesingle /*b4j.example.vmcontainer*/ (_prop,_value);
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetTabIndex(ti As String) As VMForm";
 //BA.debugLineNum = 256;BA.debugLine="Container.SetTabIndex(ti)";
_container._settabindex /*b4j.example.vmcontainer*/ (_ti);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetText(t As Object) As VMForm";
 //BA.debugLineNum = 142;BA.debugLine="Container.SetText(t)";
_container._settext /*b4j.example.vmcontainer*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setvalid(boolean _b) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetValid(b As Boolean) As VMForm";
 //BA.debugLineNum = 35;BA.debugLine="vue.SetData(formValid, b)";
_vue._setdata /*b4j.example.bananovue*/ (_formvalid,(Object)(_b));
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setvalue(boolean _varvalue) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub SetValue(varValue As Boolean) As VMForm";
 //BA.debugLineNum = 190;BA.debugLine="vue.SetStateSingle(ID, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_id,(Object)(_varvalue));
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetVIf(vif As String) As VMForm";
 //BA.debugLineNum = 119;BA.debugLine="Container.SetVIf(vif)";
_container._setvif /*b4j.example.vmcontainer*/ (_vif);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetVModel(k As String) As VMForm";
 //BA.debugLineNum = 29;BA.debugLine="Container.SetVModel(k)";
_container._setvmodel /*b4j.example.vmcontainer*/ (_k);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetVShow(vif As String) As VMForm";
 //BA.debugLineNum = 124;BA.debugLine="Container.SetVShow(vif)";
_container._setvshow /*b4j.example.vmcontainer*/ (_vif);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setwidth(String _w) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub SetWidth(w As String) As VMForm";
 //BA.debugLineNum = 284;BA.debugLine="Container.SetStyleSingle(\"width\", w)";
_container._setstylesingle /*b4j.example.vmcontainer*/ ("width",_w);
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 104;BA.debugLine="Return Container.ToString";
if (true) return _container._tostring /*String*/ ();
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmform  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 108;BA.debugLine="Sub UseTheme(themeName As String) As VMForm";
 //BA.debugLineNum = 109;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 110;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 111;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 112;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 113;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public String  _validate() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub Validate";
 //BA.debugLineNum = 54;BA.debugLine="vue.refs.GetField(ID).RunMethod(\"validate\", Null)";
_vue._refs /*com.ab.banano.BANanoObject*/ .GetField(_id).RunMethod("validate",__c.Null);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
