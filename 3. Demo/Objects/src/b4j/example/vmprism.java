package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmprism extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmprism", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmprism.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _prismcomponent = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public String _codekey = "";
public b4j.example.vmcard _card = null;
public com.ab.banano.BANanoObject _pc = null;
public String _code_css = "";
public String _code_js = "";
public String _code_html = "";
public String _code_vb = "";
public String _code_other = "";
public String _lang = "";
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
public b4j.example.vmprism  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 110;BA.debugLine="Sub AddChild(child As VMElement) As VMPrism";
 //BA.debugLineNum = 111;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 112;BA.debugLine="PrismComponent.SetText(childHTML)";
_prismcomponent._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 140;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 141;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 142;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprism  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub AddClass(c As String) As VMPrism";
 //BA.debugLineNum = 123;BA.debugLine="PrismComponent.AddClass(c)";
_prismcomponent._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Sub AddComponent(comp As String) As VMPrism";
 //BA.debugLineNum = 367;BA.debugLine="PrismComponent.SetText(comp)";
_prismcomponent._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 377;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 378;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return "";
}
public String  _beautifysourcecode(String _slang,String _sc) throws Exception{
String _res = "";
 //BA.debugLineNum = 175;BA.debugLine="Sub BeautifySourceCode(slang As String, sc As Stri";
 //BA.debugLineNum = 176;BA.debugLine="Select Case slang";
switch (BA.switchObjectToInt(_slang,"js","css","html")) {
case 0: {
 //BA.debugLineNum = 178;BA.debugLine="Dim res As String = BANano.RunJavascriptMethod(\"";
_res = BA.ObjectToString(_banano.RunJavascriptMethod("js_beautify",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sc)})));
 break; }
case 1: {
 //BA.debugLineNum = 180;BA.debugLine="Dim res As String = BANano.RunJavascriptMethod(\"";
_res = BA.ObjectToString(_banano.RunJavascriptMethod("css_beautify",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sc)})));
 break; }
case 2: {
 //BA.debugLineNum = 182;BA.debugLine="Dim res As String = BANano.RunJavascriptMethod(\"";
_res = BA.ObjectToString(_banano.RunJavascriptMethod("html_beautify",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sc)})));
 break; }
}
;
 //BA.debugLineNum = 184;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprism  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 215;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 216;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 298;BA.debugLine="PrismComponent.BindStyleSingle(prop, value)";
_prismcomponent._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 299;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 383;BA.debugLine="PrismComponent.BuildModel(mprops, mstyles, lclasse";
_prismcomponent._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 384;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public PrismComponent As VMElement";
_prismcomponent = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private codeKey As String";
_codekey = "";
 //BA.debugLineNum = 10;BA.debugLine="Private Card As VMCard";
_card = new b4j.example.vmcard();
 //BA.debugLineNum = 11;BA.debugLine="Private PC As BANanoObject";
_pc = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 12;BA.debugLine="Public CODE_CSS As String = \"css\"";
_code_css = "css";
 //BA.debugLineNum = 13;BA.debugLine="Public CODE_JS As String = \"js\"";
_code_js = "js";
 //BA.debugLineNum = 14;BA.debugLine="Public CODE_HTML As String = \"html\"";
_code_html = "html";
 //BA.debugLineNum = 15;BA.debugLine="Public CODE_VB As String = \"vb\"";
_code_vb = "vb";
 //BA.debugLineNum = 16;BA.debugLine="Public CODE_OTHER As String = \"\"";
_code_other = "";
 //BA.debugLineNum = 17;BA.debugLine="Private lang As String = \"\"";
_lang = "";
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoPromise  _copy2clipboard() throws Exception{
String _scode = "";
com.ab.banano.BANanoPromise _bp = null;
 //BA.debugLineNum = 87;BA.debugLine="Sub Copy2Clipboard As BANanoPromise";
 //BA.debugLineNum = 89;BA.debugLine="Dim sCode As String = vue.GetData(codeKey)";
_scode = BA.ObjectToString(_vue._getdata /*Object*/ (_codekey));
 //BA.debugLineNum = 90;BA.debugLine="Dim bp As BANanoPromise = vue.RunMethod(\"$copyTex";
_bp = new com.ab.banano.BANanoPromise();
_bp = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_vue._runmethod /*com.ab.banano.BANanoObject*/ ("$copyText",(Object)(new Object[]{(Object)(_scode)})).getObject()));
 //BA.debugLineNum = 91;BA.debugLine="Return bp";
if (true) return _bp;
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _disable() throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub Disable As VMPrism";
 //BA.debugLineNum = 208;BA.debugLine="PrismComponent.Disable(True)";
_prismcomponent._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public String  _download(String _filename) throws Exception{
String _scode = "";
anywheresoftware.b4a.objects.collections.List _fc = null;
com.ab.banano.BANanoObject _blob = null;
 //BA.debugLineNum = 76;BA.debugLine="Sub Download(fileName As String)";
 //BA.debugLineNum = 77;BA.debugLine="Dim sCode As String = vue.GetData(codeKey)";
_scode = BA.ObjectToString(_vue._getdata /*Object*/ (_codekey));
 //BA.debugLineNum = 78;BA.debugLine="Dim fc As List";
_fc = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 79;BA.debugLine="fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 80;BA.debugLine="fc.Add(sCode)";
_fc.Add((Object)(_scode));
 //BA.debugLineNum = 81;BA.debugLine="Dim blob As BANanoObject";
_blob = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 82;BA.debugLine="blob.Initialize2(\"Blob\",Array(fc, CreateMap(\"type";
_blob.Initialize2("Blob",(Object)(new Object[]{(Object)(_fc.getObject()),(Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("text/plain;charset=utf-8")}).getObject())}));
 //BA.debugLineNum = 83;BA.debugLine="BANano.RunJavascriptMethod(\"saveAs\",Array(blob,fi";
_banano.RunJavascriptMethod("saveAs",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_blob.getObject()),(Object)(_filename)}));
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprism  _enable() throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub Enable As VMPrism";
 //BA.debugLineNum = 202;BA.debugLine="PrismComponent.Enable(True)";
_prismcomponent._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _hide() throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub Hide As VMPrism";
 //BA.debugLineNum = 190;BA.debugLine="PrismComponent.SetVisible(False)";
_prismcomponent._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 22;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 23;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 25;BA.debugLine="If vue.ModuleExist(\"prism\") = False Then";
if (_vue._moduleexist /*boolean*/ ("prism")==__c.False) { 
 //BA.debugLineNum = 26;BA.debugLine="PC.Initialize(\"PrismComponent\")";
_pc.Initialize((Object)("PrismComponent"));
 //BA.debugLineNum = 27;BA.debugLine="vue.AddComponentBO(\"prism\", PC)";
_vue._addcomponentbo /*b4j.example.bananovue*/ ("prism",_pc);
 //BA.debugLineNum = 28;BA.debugLine="vue.AddModule(\"prism\")";
_vue._addmodule /*b4j.example.bananovue*/ ("prism");
 };
 //BA.debugLineNum = 31;BA.debugLine="BANano.DependsOnAsset(\"fileSaver.min.js\")";
_banano.DependsOnAsset("fileSaver.min.js");
 //BA.debugLineNum = 32;BA.debugLine="BANano.DependsOnAsset(\"jszip.min.js\")";
_banano.DependsOnAsset("jszip.min.js");
 //BA.debugLineNum = 34;BA.debugLine="BANano.DependsOnAsset(\"prism.min.css\")";
_banano.DependsOnAsset("prism.min.css");
 //BA.debugLineNum = 35;BA.debugLine="BANano.DependsOnAsset(\"prism.min.js\")";
_banano.DependsOnAsset("prism.min.js");
 //BA.debugLineNum = 36;BA.debugLine="BANano.DependsOnAsset(\"vue-prism-component.min.js";
_banano.DependsOnAsset("vue-prism-component.min.js");
 //BA.debugLineNum = 38;BA.debugLine="BANano.DependsOnAsset(\"beautify.min.js\")";
_banano.DependsOnAsset("beautify.min.js");
 //BA.debugLineNum = 39;BA.debugLine="BANano.DependsOnAsset(\"beautify-css.min.js\")";
_banano.DependsOnAsset("beautify-css.min.js");
 //BA.debugLineNum = 40;BA.debugLine="BANano.DependsOnAsset(\"beautify-html.min.js\")";
_banano.DependsOnAsset("beautify-html.min.js");
 //BA.debugLineNum = 41;BA.debugLine="BANano.DependsOnAsset(\"vue-clipboard.min.js\")";
_banano.DependsOnAsset("vue-clipboard.min.js");
 //BA.debugLineNum = 43;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 44;BA.debugLine="PrismComponent.Initialize(v, ID)";
_prismcomponent._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 45;BA.debugLine="PrismComponent.SetTag(\"prism\")";
_prismcomponent._settag /*b4j.example.vmelement*/ ("prism");
 //BA.debugLineNum = 46;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 47;BA.debugLine="codeKey =  $\"${ID}code\"$";
_codekey = (""+__c.SmartStringFormatter("",(Object)(_id))+"code");
 //BA.debugLineNum = 48;BA.debugLine="vue.SetStateSingle(codeKey , \"\")";
_vue._setstatesingle /*b4j.example.bananovue*/ (_codekey,(Object)(""));
 //BA.debugLineNum = 49;BA.debugLine="Bind(\":code\", codeKey)";
_bind(":code",_codekey);
 //BA.debugLineNum = 50;BA.debugLine="Card.Initialize(vue, $\"${ID}card\"$, Module)";
_card._initialize /*b4j.example.vmcard*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"card"),_module);
 //BA.debugLineNum = 51;BA.debugLine="Card.ToolBar.AddTitle(\"Source Code\", \"\")";
_card._toolbar /*b4j.example.vmtoolbar*/ ._addtitle /*b4j.example.vmtoolbar*/ ("Source Code","");
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 118;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprism  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="public Sub RemoveAttr(sName As String) As VMPrism";
 //BA.debugLineNum = 249;BA.debugLine="PrismComponent.RemoveAttr(sName)";
_prismcomponent._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub Render";
 //BA.debugLineNum = 106;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprism  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetAttr(attr As Map) As VMPrism";
 //BA.debugLineNum = 129;BA.debugLine="PrismComponent.SetAttr(attr)";
_prismcomponent._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 317;BA.debugLine="Sub SetAttributes(attrs As List) As VMPrism";
 //BA.debugLineNum = 318;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 319;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SetAttrLoose(loose As String) As VMPrism";
 //BA.debugLineNum = 222;BA.debugLine="PrismComponent.SetAttrLoose(loose)";
_prismcomponent._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 292;BA.debugLine="PrismComponent.SetAttrSingle(prop, value)";
_prismcomponent._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setcode(String _varcode) throws Exception{
String _sformat = "";
 //BA.debugLineNum = 147;BA.debugLine="Sub SetCode(varCode As String) As VMPrism";
 //BA.debugLineNum = 148;BA.debugLine="Select lang";
switch (BA.switchObjectToInt(_lang,"js","css","html")) {
case 0: 
case 1: 
case 2: {
 //BA.debugLineNum = 150;BA.debugLine="Dim sformat As String = BeautifySourceCode(lang,";
_sformat = _beautifysourcecode(_lang,_varcode);
 //BA.debugLineNum = 151;BA.debugLine="varCode = sformat";
_varcode = _sformat;
 break; }
}
;
 //BA.debugLineNum = 153;BA.debugLine="vue.SetStateSingle(codeKey, varCode)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_codekey,(Object)(_varcode));
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 239;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 240;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 241;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 242;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 243;BA.debugLine="PrismComponent.Bind(\":color\", pp)";
_prismcomponent._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMPrism";
 //BA.debugLineNum = 267;BA.debugLine="PrismComponent.SetDesignMode(b)";
_prismcomponent._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 268;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 347;BA.debugLine="PrismComponent.SetDeviceOffsets(OS, OM, OL, OX)";
_prismcomponent._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 354;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 355;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 360;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 361;BA.debugLine="PrismComponent.SetDeviceSizes(SS, SM, SL, SX)";
_prismcomponent._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setinline(Object _varinline) throws Exception{
String _pp = "";
 //BA.debugLineNum = 158;BA.debugLine="Sub SetInline(varInline As Object) As VMPrism";
 //BA.debugLineNum = 159;BA.debugLine="Dim pp As String = $\"${ID}Inline\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Inline");
 //BA.debugLineNum = 160;BA.debugLine="vue.SetStateSingle(pp, varInline)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varinline);
 //BA.debugLineNum = 161;BA.debugLine="PrismComponent.Bind(\":inline\", pp)";
_prismcomponent._bind /*b4j.example.vmelement*/ (":inline",_pp);
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub SetKey(k As String) As VMPrism";
 //BA.debugLineNum = 334;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 335;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setlanguage(String _varlanguage) throws Exception{
String _pp = "";
 //BA.debugLineNum = 166;BA.debugLine="Sub SetLanguage(varLanguage As String) As VMPrism";
 //BA.debugLineNum = 167;BA.debugLine="Dim pp As String = $\"${ID}Language\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Language");
 //BA.debugLineNum = 168;BA.debugLine="vue.SetStateSingle(pp, varLanguage)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlanguage));
 //BA.debugLineNum = 169;BA.debugLine="PrismComponent.Bind(\":language\", pp)";
_prismcomponent._bind /*b4j.example.vmelement*/ (":language",_pp);
 //BA.debugLineNum = 170;BA.debugLine="lang = varLanguage";
_lang = _varlanguage;
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetMarginAll(p As String) As VMPrism";
 //BA.debugLineNum = 261;BA.debugLine="PrismComponent.setmarginall(p)";
_prismcomponent._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 280;BA.debugLine="PrismComponent.SetName(varName, bbind)";
_prismcomponent._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub SetPaddingAll(p As String) As VMPrism";
 //BA.debugLineNum = 255;BA.debugLine="PrismComponent.SetPaddingAll(p)";
_prismcomponent._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMPri";
 //BA.debugLineNum = 341;BA.debugLine="PrismComponent.SetRC(sRow, sCol)";
_prismcomponent._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetStyle(sm As Map) As VMPrism";
 //BA.debugLineNum = 135;BA.debugLine="PrismComponent.SetStyle(sm)";
_prismcomponent._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 286;BA.debugLine="PrismComponent.SetStyleSingle(prop, value)";
_prismcomponent._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetTabIndex(ti As String) As VMPrism";
 //BA.debugLineNum = 274;BA.debugLine="PrismComponent.SetTabIndex(ti)";
_prismcomponent._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _settextcenter() throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Sub SetTextCenter As VMPrism";
 //BA.debugLineNum = 373;BA.debugLine="PrismComponent.AddClass(\"text-center\")";
_prismcomponent._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 395;BA.debugLine="Sub SetTextColor(varColor As String) As VMPrism";
 //BA.debugLineNum = 396;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 397;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 402;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 403;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 404;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 405;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 406;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 407;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return null;
}
public String  _settitle(String _stitle) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetTitle(sTitle As String)";
 //BA.debugLineNum = 56;BA.debugLine="Card.ToolBar.UpdateTitle(sTitle)";
_card._toolbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_stitle);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprism  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub SetVElse(vif As String) As VMPrism";
 //BA.debugLineNum = 303;BA.debugLine="PrismComponent.SetVElse(vif)";
_prismcomponent._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 325;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 326;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 327;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 328;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 329;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Sub SetVhtml(vhtml As String) As VMPrism";
 //BA.debugLineNum = 313;BA.debugLine="PrismComponent.SetVHtml(vhtml)";
_prismcomponent._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetVIf(vif As Object) As VMPrism";
 //BA.debugLineNum = 95;BA.debugLine="PrismComponent.SetVIf(vif)";
_prismcomponent._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 388;BA.debugLine="Sub SetVisible(b As Boolean) As VMPrism";
 //BA.debugLineNum = 389;BA.debugLine="PrismComponent.SetVisible(b)";
_prismcomponent._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 390;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetVShow(vif As Object) As VMPrism";
 //BA.debugLineNum = 100;BA.debugLine="PrismComponent.SetVShow(vif)";
_prismcomponent._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 307;BA.debugLine="Sub SetVText(vhtml As String) As VMPrism";
 //BA.debugLineNum = 308;BA.debugLine="PrismComponent.SetVText(vhtml)";
_prismcomponent._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprism  _show() throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub Show As VMPrism";
 //BA.debugLineNum = 196;BA.debugLine="PrismComponent.SetVisible(True)";
_prismcomponent._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 61;BA.debugLine="Card.ToolBar.SetDense(True)";
_card._toolbar /*b4j.example.vmtoolbar*/ ._setdense /*b4j.example.vmtoolbar*/ (__c.True);
 //BA.debugLineNum = 62;BA.debugLine="Card.ToolBar.SetFlat(True)";
_card._toolbar /*b4j.example.vmtoolbar*/ ._setflat /*b4j.example.vmtoolbar*/ (__c.True);
 //BA.debugLineNum = 63;BA.debugLine="Card.ToolBar.AddSpacer";
_card._toolbar /*b4j.example.vmtoolbar*/ ._addspacer /*b4j.example.vmtoolbar*/ ();
 //BA.debugLineNum = 64;BA.debugLine="Card.ToolBar.AddIcon($\"${ID}copy\"$, \"mdi-content-";
_card._toolbar /*b4j.example.vmtoolbar*/ ._addicon /*b4j.example.vmtoolbar*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"copy"),"mdi-content-copy","Copy code to clipboard","");
 //BA.debugLineNum = 65;BA.debugLine="Card.ToolBar.AddDivider(True, Null, Null, Null, N";
_card._toolbar /*b4j.example.vmtoolbar*/ ._adddivider /*b4j.example.vmtoolbar*/ (__c.True,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__c.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__c.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 66;BA.debugLine="Card.ToolBar.AddIcon($\"${ID}download\"$, \"mdi-clou";
_card._toolbar /*b4j.example.vmtoolbar*/ ._addicon /*b4j.example.vmtoolbar*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"download"),"mdi-cloud-download-outline","Download code","");
 //BA.debugLineNum = 67;BA.debugLine="Card.Actions.SetVisible(False)";
_card._actions /*b4j.example.vmcardactions*/ ._setvisible /*b4j.example.vmcardactions*/ (__c.False);
 //BA.debugLineNum = 68;BA.debugLine="Card.Container.SetTag(\"div\")";
_card._container /*b4j.example.vmcontainer*/ ._settag /*b4j.example.vmcontainer*/ ("div");
 //BA.debugLineNum = 69;BA.debugLine="Card.container.SetNoGutters(True)";
_card._container /*b4j.example.vmcontainer*/ ._setnogutters /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 70;BA.debugLine="Card.Container.AddControlS(PrismComponent, PrismC";
_card._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_prismcomponent,_prismcomponent._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 72;BA.debugLine="Return Card.ToString";
if (true) return _card._tostring /*String*/ ();
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprism  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 227;BA.debugLine="Sub UseTheme(themeName As String) As VMPrism";
 //BA.debugLineNum = 228;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 229;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 230;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 231;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 232;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprism)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
