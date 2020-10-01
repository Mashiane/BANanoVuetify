package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmfooter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmfooter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmfooter.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _footer = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public b4j.example.vmcontainer _container = null;
public boolean _hascontent = false;
public boolean _bstatic = false;
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
public b4j.example.vmfooter  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 158;BA.debugLine="Sub AddChild(child As VMElement) As VMFooter";
 //BA.debugLineNum = 159;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 160;BA.debugLine="Footer.SetText(childHTML)";
_footer._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 161;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 189;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 190;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 191;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfooter  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub AddClass(c As String) As VMFooter";
 //BA.debugLineNum = 172;BA.debugLine="Footer.AddClass(c)";
_footer._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub AddComponent(comp As String) As VMFooter";
 //BA.debugLineNum = 136;BA.debugLine="Footer.SetText(comp)";
_footer._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 137;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _addcopyright(String _cyear) throws Exception{
String _spantext = "";
 //BA.debugLineNum = 101;BA.debugLine="Sub AddCopyRight(cYear As String) As VMFooter";
 //BA.debugLineNum = 102;BA.debugLine="Dim spanText As String = $\"&copy; ${cYear}\"$";
_spantext = ("&copy; "+__c.SmartStringFormatter("",(Object)(_cyear))+"");
 //BA.debugLineNum = 103;BA.debugLine="AddSpan(spanText)";
_addspan(_spantext);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public String  _addmadewithlove(int _row,int _col,String _message,String _creatorname,String _emailaddress) throws Exception{
b4j.example.vmelement _footerdiv = null;
b4j.example.vmicon _footericon = null;
b4j.example.vmlabel _lblwith = null;
b4j.example.vmlabel _lbla = null;
 //BA.debugLineNum = 50;BA.debugLine="Sub AddMadeWithLove(Row As Int, Col As Int, Messag";
 //BA.debugLineNum = 51;BA.debugLine="Dim footerDiv As VMElement";
_footerdiv = new b4j.example.vmelement();
 //BA.debugLineNum = 52;BA.debugLine="footerDiv.initialize(vue, \"footerdiv\")";
_footerdiv._initialize /*b4j.example.vmelement*/ (ba,_vue,"footerdiv");
 //BA.debugLineNum = 53;BA.debugLine="footerDiv.AddClass(\"white--text ml-3\")";
_footerdiv._addclass /*b4j.example.vmelement*/ ("white--text ml-3");
 //BA.debugLineNum = 54;BA.debugLine="footerDiv.SetText(\"Made with\")";
_footerdiv._settext /*b4j.example.vmelement*/ ("Made with");
 //BA.debugLineNum = 56;BA.debugLine="Dim footerIcon As VMIcon";
_footericon = new b4j.example.vmicon();
 //BA.debugLineNum = 57;BA.debugLine="footerIcon.Initialize(vue, \"footerlove\", Me).SetT";
_footericon._initialize /*b4j.example.vmicon*/ (ba,_vue,"footerlove",this)._settext /*b4j.example.vmicon*/ ("favorite")._addclass /*b4j.example.vmicon*/ ("red--text");
 //BA.debugLineNum = 58;BA.debugLine="footerIcon.AddClass(\"mx-1\")";
_footericon._addclass /*b4j.example.vmicon*/ ("mx-1");
 //BA.debugLineNum = 59;BA.debugLine="footerDiv.SetText(footerIcon.tostring)";
_footerdiv._settext /*b4j.example.vmelement*/ (_footericon._tostring /*String*/ ());
 //BA.debugLineNum = 61;BA.debugLine="Dim lblWith As VMLabel";
_lblwith = new b4j.example.vmlabel();
 //BA.debugLineNum = 62;BA.debugLine="lblWith.initialize(vue, \"lblwith\")";
_lblwith._initialize /*b4j.example.vmlabel*/ (ba,_vue,"lblwith");
 //BA.debugLineNum = 63;BA.debugLine="lblWith.SetText(Message)";
_lblwith._settext /*b4j.example.vmlabel*/ (_message);
 //BA.debugLineNum = 64;BA.debugLine="lblWith.AddClass(\"white--text\").AddClass(\"mr-1\")";
_lblwith._addclass /*b4j.example.vmlabel*/ ("white--text")._addclass /*b4j.example.vmlabel*/ ("mr-1");
 //BA.debugLineNum = 65;BA.debugLine="footerDiv.SetText(lblWith.ToString)";
_footerdiv._settext /*b4j.example.vmelement*/ (_lblwith._tostring /*String*/ ());
 //BA.debugLineNum = 67;BA.debugLine="Dim lbla As VMLabel";
_lbla = new b4j.example.vmlabel();
 //BA.debugLineNum = 68;BA.debugLine="lbla.Initialize(vue, \"lbla\").SetTag(\"a\").SetHREF(";
_lbla._initialize /*b4j.example.vmlabel*/ (ba,_vue,"lbla")._settag /*b4j.example.vmlabel*/ ("a")._sethref /*b4j.example.vmlabel*/ (("mailto:"+__c.SmartStringFormatter("",(Object)(_emailaddress))+""))._settext /*b4j.example.vmlabel*/ ((""+__c.SmartStringFormatter("",(Object)(_creatorname))+""));
 //BA.debugLineNum = 69;BA.debugLine="lbla.AddClass(\"white--text\")";
_lbla._addclass /*b4j.example.vmlabel*/ ("white--text");
 //BA.debugLineNum = 70;BA.debugLine="footerDiv.SetText(lbla.tostring)";
_footerdiv._settext /*b4j.example.vmelement*/ (_lbla._tostring /*String*/ ());
 //BA.debugLineNum = 72;BA.debugLine="Container.AddCOmponent(Row,Col, footerDiv.tostrin";
_container._addcomponent /*String*/ (_row,_col,_footerdiv._tostring /*String*/ ());
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfooter  _addspacer() throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub AddSpacer As VMFooter";
 //BA.debugLineNum = 90;BA.debugLine="Footer.AddSpacer";
_footer._addspacer /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _addspan(String _spantext) throws Exception{
b4j.example.vmelement _span = null;
 //BA.debugLineNum = 94;BA.debugLine="Sub AddSpan(spanText As String) As VMFooter";
 //BA.debugLineNum = 95;BA.debugLine="Dim span As VMElement";
_span = new b4j.example.vmelement();
 //BA.debugLineNum = 96;BA.debugLine="span.Initialize(vue, \"\").SetTag(\"span\").SetText(s";
_span._initialize /*b4j.example.vmelement*/ (ba,_vue,"")._settag /*b4j.example.vmelement*/ ("span")._settext /*b4j.example.vmelement*/ (_spantext);
 //BA.debugLineNum = 97;BA.debugLine="AddComponent(span.ToString)";
_addcomponent(_span._tostring /*String*/ ());
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 403;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 404;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 405;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 460;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 461;BA.debugLine="Footer.BuildModel(mprops, mstyles, lclasses, loose";
_footer._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 462;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 463;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Footer As VMElement";
_footer = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
 //BA.debugLineNum = 10;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 11;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 12;BA.debugLine="Private smodel As String";
_smodel = "";
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfooter  _disable() throws Exception{
 //BA.debugLineNum = 396;BA.debugLine="Sub Disable As VMFooter";
 //BA.debugLineNum = 397;BA.debugLine="Footer.Disable(True)";
_footer._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _enable() throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Sub Enable As VMFooter";
 //BA.debugLineNum = 392;BA.debugLine="Footer.Enable(True)";
_footer._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _hide() throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub Hide As VMFooter";
 //BA.debugLineNum = 120;BA.debugLine="vue.SetStateSingle(smodel, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_smodel,(Object)(__c.False));
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 17;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 18;BA.debugLine="Footer.Initialize(v, ID)";
_footer._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 19;BA.debugLine="Footer.SetTag(\"v-footer\")";
_footer._settag /*b4j.example.vmelement*/ ("v-footer");
 //BA.debugLineNum = 20;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 22;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 23;BA.debugLine="SetVShow(Footer.showkey)";
_setvshow(_footer._showkey /*String*/ );
 //BA.debugLineNum = 24;BA.debugLine="Container.Initialize(vue, $\"${ID}content\"$, Modul";
_container._initialize /*b4j.example.vmcontainer*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"content"),_module);
 //BA.debugLineNum = 25;BA.debugLine="HasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 26;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 27;BA.debugLine="Show";
_show();
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 167;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfooter  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 410;BA.debugLine="public Sub RemoveAttr(sName As String) As VMFooter";
 //BA.debugLineNum = 411;BA.debugLine="Footer.RemoveAttr(sName)";
_footer._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 412;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _removevmodel() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub RemoveVModel As VMFooter";
 //BA.debugLineNum = 32;BA.debugLine="RemoveAttr(\"v-model\")";
_removeattr("v-model");
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub Render";
 //BA.debugLineNum = 154;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfooter  _setabsolute(boolean _varabsolute) throws Exception{
String _pp = "";
 //BA.debugLineNum = 196;BA.debugLine="Sub SetAbsolute(varAbsolute As Boolean) As VMFoote";
 //BA.debugLineNum = 197;BA.debugLine="If varAbsolute = False Then Return Me";
if (_varabsolute==__c.False) { 
if (true) return (b4j.example.vmfooter)(this);};
 //BA.debugLineNum = 198;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 199;BA.debugLine="SetAttrSingle(\"absolute\", varAbsolute)";
_setattrsingle("absolute",BA.ObjectToString(_varabsolute));
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 };
 //BA.debugLineNum = 202;BA.debugLine="Dim pp As String = $\"${ID}Absolute\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Absolute");
 //BA.debugLineNum = 203;BA.debugLine="vue.SetStateSingle(pp, varAbsolute)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varabsolute));
 //BA.debugLineNum = 204;BA.debugLine="Footer.Bind(\":absolute\", pp)";
_footer._bind /*b4j.example.vmelement*/ (":absolute",_pp);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setapp(boolean _varapp) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetApp(varApp As Boolean) As VMFooter";
 //BA.debugLineNum = 210;BA.debugLine="If varApp = False Then Return Me";
if (_varapp==__c.False) { 
if (true) return (b4j.example.vmfooter)(this);};
 //BA.debugLineNum = 211;BA.debugLine="Footer.SetAttrLoose(\"app\")";
_footer._setattrloose /*b4j.example.vmelement*/ ("app");
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub SetAttr(attr As Map) As VMFooter";
 //BA.debugLineNum = 178;BA.debugLine="Footer.SetAttr(attr)";
_footer._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 112;BA.debugLine="Sub SetAttributes(attrs As List) As VMFooter";
 //BA.debugLineNum = 113;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 114;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetAttrLoose(loose As String) As VMFooter";
 //BA.debugLineNum = 108;BA.debugLine="Footer.SetAttrLoose(loose)";
_footer._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 455;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 456;BA.debugLine="Footer.SetAttrSingle(prop, value)";
_footer._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 457;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 216;BA.debugLine="Sub SetColor(varColor As String) As VMFooter";
 //BA.debugLineNum = 217;BA.debugLine="If varColor = False Then Return Me";
if ((_varcolor).equals(BA.ObjectToString(__c.False))) { 
if (true) return (b4j.example.vmfooter)(this);};
 //BA.debugLineNum = 218;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 219;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 };
 //BA.debugLineNum = 222;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 223;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 224;BA.debugLine="Footer.Bind(\":color\", pp)";
_footer._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 76;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 77;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmfooter)(this);};
 //BA.debugLineNum = 78;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 79;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 80;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 81;BA.debugLine="Footer.Bind(\"color\", scolor)";
_footer._bind /*b4j.example.vmelement*/ ("color",_scolor);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 };
 //BA.debugLineNum = 84;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 85;BA.debugLine="Footer.Bind(\":color\", pp)";
_footer._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 229;BA.debugLine="Sub SetDark(varDark As Boolean) As VMFooter";
 //BA.debugLineNum = 230;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmfooter)(this);};
 //BA.debugLineNum = 231;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 232;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 };
 //BA.debugLineNum = 235;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 236;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 237;BA.debugLine="Footer.Bind(\":dark\", pp)";
_footer._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 37;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 426;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMFooter";
 //BA.debugLineNum = 427;BA.debugLine="Footer.SetDesignMode(b)";
_footer._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 428;BA.debugLine="Container.SetDesignMode(b)";
_container._setdesignmode /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 429;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 430;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 444;BA.debugLine="Sub SetDisabled(b As Boolean) As VMFooter";
 //BA.debugLineNum = 445;BA.debugLine="Footer.SetDisabled(b)";
_footer._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 446;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setelevation(String _varelevation) throws Exception{
String _pp = "";
 //BA.debugLineNum = 242;BA.debugLine="Sub SetElevation(varElevation As String) As VMFoot";
 //BA.debugLineNum = 243;BA.debugLine="If varElevation = \"\" Then Return Me";
if ((_varelevation).equals("")) { 
if (true) return (b4j.example.vmfooter)(this);};
 //BA.debugLineNum = 244;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 245;BA.debugLine="SetAttrSingle(\"elevation\", varElevation)";
_setattrsingle("elevation",_varelevation);
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 };
 //BA.debugLineNum = 248;BA.debugLine="Dim pp As String = $\"${ID}Elevation\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Elevation");
 //BA.debugLineNum = 249;BA.debugLine="vue.SetStateSingle(pp, varElevation)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varelevation));
 //BA.debugLineNum = 250;BA.debugLine="Footer.Bind(\":elevation\", pp)";
_footer._bind /*b4j.example.vmelement*/ (":elevation",_pp);
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setfixed(boolean _varfixed) throws Exception{
String _pp = "";
 //BA.debugLineNum = 255;BA.debugLine="Sub SetFixed(varFixed As Boolean) As VMFooter";
 //BA.debugLineNum = 256;BA.debugLine="If varFixed = False Then Return Me";
if (_varfixed==__c.False) { 
if (true) return (b4j.example.vmfooter)(this);};
 //BA.debugLineNum = 257;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 258;BA.debugLine="SetAttrSingle(\"fixed\", varFixed)";
_setattrsingle("fixed",BA.ObjectToString(_varfixed));
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 };
 //BA.debugLineNum = 261;BA.debugLine="Dim pp As String = $\"${ID}Fixed\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Fixed");
 //BA.debugLineNum = 262;BA.debugLine="vue.SetStateSingle(pp, varFixed)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfixed));
 //BA.debugLineNum = 263;BA.debugLine="Footer.Bind(\":fixed\", pp)";
_footer._bind /*b4j.example.vmelement*/ (":fixed",_pp);
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 268;BA.debugLine="Sub SetHeight(varHeight As String) As VMFooter";
 //BA.debugLineNum = 269;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmfooter)(this);};
 //BA.debugLineNum = 270;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 271;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 };
 //BA.debugLineNum = 274;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 275;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 276;BA.debugLine="Footer.Bind(\":height\", pp)";
_footer._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setinset(boolean _varinset) throws Exception{
String _pp = "";
 //BA.debugLineNum = 281;BA.debugLine="Sub SetInset(varInset As Boolean) As VMFooter";
 //BA.debugLineNum = 282;BA.debugLine="If varInset = \"\" Then Return Me";
if (_varinset==BA.ObjectToBoolean("")) { 
if (true) return (b4j.example.vmfooter)(this);};
 //BA.debugLineNum = 283;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 284;BA.debugLine="SetAttrSingle(\"inset\", varInset)";
_setattrsingle("inset",BA.ObjectToString(_varinset));
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 };
 //BA.debugLineNum = 287;BA.debugLine="Dim pp As String = $\"${ID}Inset\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Inset");
 //BA.debugLineNum = 288;BA.debugLine="vue.SetStateSingle(pp, varInset)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varinset));
 //BA.debugLineNum = 289;BA.debugLine="Footer.Bind(\":inset\", pp)";
_footer._bind /*b4j.example.vmelement*/ (":inset",_pp);
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 294;BA.debugLine="Sub SetLight(varLight As Boolean) As VMFooter";
 //BA.debugLineNum = 295;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmfooter)(this);};
 //BA.debugLineNum = 296;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 297;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 };
 //BA.debugLineNum = 300;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 301;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 302;BA.debugLine="Footer.Bind(\":light\", pp)";
_footer._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 303;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 421;BA.debugLine="Sub SetMarginAll(p As String) As VMFooter";
 //BA.debugLineNum = 422;BA.debugLine="Footer.setmarginall(p)";
_footer._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 423;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 424;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setmaxheight(String _varmaxheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 307;BA.debugLine="Sub SetMaxHeight(varMaxHeight As String) As VMFoot";
 //BA.debugLineNum = 308;BA.debugLine="If varMaxHeight = \"\" Then Return Me";
if ((_varmaxheight).equals("")) { 
if (true) return (b4j.example.vmfooter)(this);};
 //BA.debugLineNum = 309;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 310;BA.debugLine="SetAttrSingle(\"max-height\", varMaxHeight)";
_setattrsingle("max-height",_varmaxheight);
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 };
 //BA.debugLineNum = 313;BA.debugLine="Dim pp As String = $\"${ID}MaxHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxHeight");
 //BA.debugLineNum = 314;BA.debugLine="vue.SetStateSingle(pp, varMaxHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxheight));
 //BA.debugLineNum = 315;BA.debugLine="Footer.Bind(\":max-height\", pp)";
_footer._bind /*b4j.example.vmelement*/ (":max-height",_pp);
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setmaxwidth(String _varmaxwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 320;BA.debugLine="Sub SetMaxWidth(varMaxWidth As String) As VMFooter";
 //BA.debugLineNum = 321;BA.debugLine="If varMaxWidth = \"\" Then Return Me";
if ((_varmaxwidth).equals("")) { 
if (true) return (b4j.example.vmfooter)(this);};
 //BA.debugLineNum = 322;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 323;BA.debugLine="SetAttrSingle(\"max-width\", varMaxWidth)";
_setattrsingle("max-width",_varmaxwidth);
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 };
 //BA.debugLineNum = 326;BA.debugLine="Dim pp As String = $\"${ID}MaxWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxWidth");
 //BA.debugLineNum = 327;BA.debugLine="vue.SetStateSingle(pp, varMaxWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxwidth));
 //BA.debugLineNum = 328;BA.debugLine="Footer.Bind(\":max-width\", pp)";
_footer._bind /*b4j.example.vmelement*/ (":max-width",_pp);
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setminheight(String _varminheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 333;BA.debugLine="Sub SetMinHeight(varMinHeight As String) As VMFoot";
 //BA.debugLineNum = 334;BA.debugLine="If varMinHeight = \"\" Then Return Me";
if ((_varminheight).equals("")) { 
if (true) return (b4j.example.vmfooter)(this);};
 //BA.debugLineNum = 335;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 336;BA.debugLine="SetAttrSingle(\"min-height\", varMinHeight)";
_setattrsingle("min-height",_varminheight);
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 };
 //BA.debugLineNum = 339;BA.debugLine="Dim pp As String = $\"${ID}MinHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinHeight");
 //BA.debugLineNum = 340;BA.debugLine="vue.SetStateSingle(pp, varMinHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminheight));
 //BA.debugLineNum = 341;BA.debugLine="Footer.Bind(\":min-height\", pp)";
_footer._bind /*b4j.example.vmelement*/ (":min-height",_pp);
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 439;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 440;BA.debugLine="Footer.SetName(varName, bbind)";
_footer._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 441;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 442;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 416;BA.debugLine="Sub SetPaddingAll(p As String) As VMFooter";
 //BA.debugLineNum = 417;BA.debugLine="Footer.SetPaddingAll(p)";
_footer._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 418;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setpadless(boolean _varpadless) throws Exception{
String _pp = "";
 //BA.debugLineNum = 346;BA.debugLine="Sub SetPadless(varPadless As Boolean) As VMFooter";
 //BA.debugLineNum = 347;BA.debugLine="If varPadless = False Then Return Me";
if (_varpadless==__c.False) { 
if (true) return (b4j.example.vmfooter)(this);};
 //BA.debugLineNum = 348;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 349;BA.debugLine="SetAttrSingle(\"padless\", varPadless)";
_setattrsingle("padless",BA.ObjectToString(_varpadless));
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 };
 //BA.debugLineNum = 352;BA.debugLine="Dim pp As String = $\"${ID}Padless\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Padless");
 //BA.debugLineNum = 353;BA.debugLine="vue.SetStateSingle(pp, varPadless)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpadless));
 //BA.debugLineNum = 354;BA.debugLine="Footer.Bind(\":padless\", pp)";
_footer._bind /*b4j.example.vmelement*/ (":padless",_pp);
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetStatic(b As Boolean) As VMFooter";
 //BA.debugLineNum = 44;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 45;BA.debugLine="Footer.SetStatic(b)";
_footer._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 46;BA.debugLine="Container.SetStatic(b)";
_container._setstatic /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetStyle(sm As Map) As VMFooter";
 //BA.debugLineNum = 184;BA.debugLine="Footer.SetStyle(sm)";
_footer._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 450;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 451;BA.debugLine="Footer.SetStyleSingle(prop, value)";
_footer._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 452;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 453;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 433;BA.debugLine="Sub SetTabIndex(ti As String) As VMFooter";
 //BA.debugLineNum = 434;BA.debugLine="Footer.SetTabIndex(ti)";
_footer._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 435;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _settag(String _vartag) throws Exception{
 //BA.debugLineNum = 359;BA.debugLine="Sub SetTag(varTag As String) As VMFooter";
 //BA.debugLineNum = 360;BA.debugLine="If varTag = \"\" Then Return Me";
if ((_vartag).equals("")) { 
if (true) return (b4j.example.vmfooter)(this);};
 //BA.debugLineNum = 361;BA.debugLine="SetAttrSingle(\"tag\", varTag)";
_setattrsingle("tag",_vartag);
 //BA.debugLineNum = 362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _settile(boolean _vartile) throws Exception{
String _pp = "";
 //BA.debugLineNum = 366;BA.debugLine="Sub SetTile(varTile As Boolean) As VMFooter";
 //BA.debugLineNum = 367;BA.debugLine="If varTile = False Then Return Me";
if (_vartile==__c.False) { 
if (true) return (b4j.example.vmfooter)(this);};
 //BA.debugLineNum = 368;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 369;BA.debugLine="SetAttrSingle(\"tile\", varTile)";
_setattrsingle("tile",BA.ObjectToString(_vartile));
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 };
 //BA.debugLineNum = 372;BA.debugLine="Dim pp As String = $\"${ID}Tile\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tile");
 //BA.debugLineNum = 373;BA.debugLine="vue.SetStateSingle(pp, varTile)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartile));
 //BA.debugLineNum = 374;BA.debugLine="Footer.Bind(\":tile\", pp)";
_footer._bind /*b4j.example.vmelement*/ (":tile",_pp);
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetVIf(vif As String) As VMFooter";
 //BA.debugLineNum = 142;BA.debugLine="Footer.SetVIf(vif)";
_footer._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub SetVShow(vif As String) As VMFooter";
 //BA.debugLineNum = 147;BA.debugLine="smodel = vif";
_smodel = _vif;
 //BA.debugLineNum = 148;BA.debugLine="Footer.SetVShow(vif)";
_footer._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _setwidth(String _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 379;BA.debugLine="Sub SetWidth(varWidth As String) As VMFooter";
 //BA.debugLineNum = 380;BA.debugLine="If varWidth = False Then Return Me";
if ((_varwidth).equals(BA.ObjectToString(__c.False))) { 
if (true) return (b4j.example.vmfooter)(this);};
 //BA.debugLineNum = 381;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 382;BA.debugLine="SetAttrSingle(\"width\", varWidth)";
_setattrsingle("width",_varwidth);
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 };
 //BA.debugLineNum = 385;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 386;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varwidth));
 //BA.debugLineNum = 387;BA.debugLine="Footer.Bind(\":width\", pp)";
_footer._bind /*b4j.example.vmelement*/ (":width",_pp);
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfooter  _show() throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub Show As VMFooter";
 //BA.debugLineNum = 125;BA.debugLine="vue.SetStateSingle(smodel, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_smodel,(Object)(__c.True));
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfooter)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 131;BA.debugLine="If Container.HasContent Then AddComponent(Contain";
if (_container._hascontent /*boolean*/ ) { 
_addcomponent(_container._tostring /*String*/ ());};
 //BA.debugLineNum = 132;BA.debugLine="Return Footer.ToString";
if (true) return _footer._tostring /*String*/ ();
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
