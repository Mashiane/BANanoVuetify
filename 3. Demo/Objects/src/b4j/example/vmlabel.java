package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmlabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmlabel", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmlabel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _label = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public String _vmodel = "";
public boolean _designmode = false;
public boolean _bstatic = false;
public com.ab.banano.BANano _banano = null;
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
public b4j.example.vmlabel  _addbold(String _value) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 304;BA.debugLine="Sub AddBold(value As String) As VMLabel";
 //BA.debugLineNum = 305;BA.debugLine="If value = \"\" Then Return Me";
if ((_value).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 306;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 307;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 308;BA.debugLine="sb.Append(\"{B}\").Append(value).Append(\"{/B}\")";
_sb.Append("{B}").Append(_value).Append("{/B}");
 //BA.debugLineNum = 309;BA.debugLine="SetText(sb.ToString)";
_settext(_sb.ToString());
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 393;BA.debugLine="Sub AddChild(child As VMElement) As VMLabel";
 //BA.debugLineNum = 394;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 395;BA.debugLine="Label.SetText(childHTML)";
_label._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 400;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 401;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 402;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlabel  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub AddClass(c As String) As VMLabel";
 //BA.debugLineNum = 387;BA.debugLine="If c = \"\" Then Return Me";
if ((_c).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 388;BA.debugLine="Label.AddClass(c)";
_label._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 389;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _addcolor(String _value,String _hexcolor) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 349;BA.debugLine="Sub AddColor(value As String, HexColor As String)";
 //BA.debugLineNum = 350;BA.debugLine="If value = \"\" Then Return Me";
if ((_value).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 351;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 352;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 353;BA.debugLine="sb.Append($\"{C:${HexColor}}${value}{/C}\"$)";
_sb.Append(("{C:"+__c.SmartStringFormatter("",(Object)(_hexcolor))+"}"+__c.SmartStringFormatter("",(Object)(_value))+"{/C}"));
 //BA.debugLineNum = 354;BA.debugLine="SetText(sb.ToString)";
_settext(_sb.ToString());
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _addhyperlink(String _title,String _url) throws Exception{
String _txt = "";
 //BA.debugLineNum = 367;BA.debugLine="Sub AddHyperLink(Title As String, URL As String) A";
 //BA.debugLineNum = 368;BA.debugLine="Dim txt As String = $\"<a href=\"${URL}\" target=\"_b";
_txt = ("<a href=\""+__c.SmartStringFormatter("",(Object)(_url))+"\" target=\"_blank\">"+__c.SmartStringFormatter("",(Object)(_title))+"</a>.");
 //BA.debugLineNum = 369;BA.debugLine="SetText(txt)";
_settext(_txt);
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _addiconcolor(String _icon,String _hexcolor) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 358;BA.debugLine="Sub AddIconColor(icon As String,HexColor As String";
 //BA.debugLineNum = 359;BA.debugLine="If icon = \"\" Then Return Me";
if ((_icon).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 360;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 361;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 362;BA.debugLine="sb.Append($\"{IC:${HexColor}}${icon}{/IC}\"$)";
_sb.Append(("{IC:"+__c.SmartStringFormatter("",(Object)(_hexcolor))+"}"+__c.SmartStringFormatter("",(Object)(_icon))+"{/IC}"));
 //BA.debugLineNum = 363;BA.debugLine="SetText(sb.ToString)";
_settext(_sb.ToString());
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _additalic(String _value) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 313;BA.debugLine="Sub AddItalic(value As String) As VMLabel";
 //BA.debugLineNum = 314;BA.debugLine="If value = \"\" Then Return Me";
if ((_value).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 315;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 316;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 317;BA.debugLine="sb.Append(\"{I}\").Append(value).Append(\"{/I}\")";
_sb.Append("{I}").Append(_value).Append("{/I}");
 //BA.debugLineNum = 318;BA.debugLine="SetText(sb.ToString)";
_settext(_sb.ToString());
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _addsubscript(String _value) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 331;BA.debugLine="Sub AddSubScript(value As String) As VMLabel";
 //BA.debugLineNum = 332;BA.debugLine="If value = \"\" Then Return Me";
if ((_value).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 333;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 334;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 335;BA.debugLine="sb.Append(\"{SUB}\").Append(value).Append(\"{/SUB}\")";
_sb.Append("{SUB}").Append(_value).Append("{/SUB}");
 //BA.debugLineNum = 336;BA.debugLine="SetText(sb.ToString)";
_settext(_sb.ToString());
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _addsuperscript(String _value) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 340;BA.debugLine="Sub AddSuperScript(value As String) As VMLabel";
 //BA.debugLineNum = 341;BA.debugLine="If value = \"\" Then Return Me";
if ((_value).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 342;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 343;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 344;BA.debugLine="sb.Append(\"{SUP}\").Append(value).Append(\"{/SUP}\")";
_sb.Append("{SUP}").Append(_value).Append("{/SUP}");
 //BA.debugLineNum = 345;BA.debugLine="SetText(sb.ToString)";
_settext(_sb.ToString());
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 496;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 497;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlabel  _addunderline(String _value) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 322;BA.debugLine="Sub AddUnderline(value As String) As VMLabel";
 //BA.debugLineNum = 323;BA.debugLine="If value = \"\" Then Return Me";
if ((_value).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 324;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 325;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 326;BA.debugLine="sb.Append(\"{U}\").Append(value).Append(\"{/U}\")";
_sb.Append("{U}").Append(_value).Append("{/U}");
 //BA.debugLineNum = 327;BA.debugLine="SetText(sb.ToString)";
_settext(_sb.ToString());
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 500;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 501;BA.debugLine="Label.BuildModel(mprops, mstyles, lclasses, loose";
_label._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 502;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 503;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Label As VMElement";
_label = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Public vmodel As String";
_vmodel = "";
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean    'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 9;BA.debugLine="Private BANano As BANano     'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlabel  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 15;BA.debugLine="Label.Initialize(vue, ID).SetTag(\"label\")";
_label._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("label");
 //BA.debugLineNum = 16;BA.debugLine="vmodel = \"\"";
_vmodel = "";
 //BA.debugLineNum = 17;BA.debugLine="Label.typeOf = \"label\"";
_label._typeof /*String*/  = "label";
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 425;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 426;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlabel  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="public Sub RemoveAttr(sName As String) As VMLabel";
 //BA.debugLineNum = 205;BA.debugLine="Label.RemoveAttr(sName)";
_label._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 421;BA.debugLine="Sub Render";
 //BA.debugLineNum = 422;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlabel  _seta() throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Sub SetA As VMLabel";
 //BA.debugLineNum = 294;BA.debugLine="Label.SetTag(\"a\")";
_label._settag /*b4j.example.vmelement*/ ("a");
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Sub SetAttr(attr As Map) As VMLabel";
 //BA.debugLineNum = 408;BA.debugLine="Label.SetAttr(attr)";
_label._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 131;BA.debugLine="Sub SetAttributes(attrs As List) As VMLabel";
 //BA.debugLineNum = 132;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 133;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetAttrLoose(loose As String) As VMLabel";
 //BA.debugLineNum = 127;BA.debugLine="Label.SetAttrLoose(loose)";
_label._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 25;BA.debugLine="Label.SetAttrSingle(prop, value)";
_label._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setblockquote() throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetBlockQuote As VMLabel";
 //BA.debugLineNum = 279;BA.debugLine="Label.SetTag(\"blockquote\").AddClass(\"blockquote\")";
_label._settag /*b4j.example.vmelement*/ ("blockquote")._addclass /*b4j.example.vmelement*/ ("blockquote");
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setcaption(boolean _b) throws Exception{
 //BA.debugLineNum = 482;BA.debugLine="Sub SetCaption(b As Boolean) As VMLabel";
 //BA.debugLineNum = 483;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 484;BA.debugLine="Label.AddClass(\"caption\")";
_label._addclass /*b4j.example.vmelement*/ ("caption");
 //BA.debugLineNum = 485;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 486;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setcolor(String _scolor) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetColor(scolor As String) As VMLabel";
 //BA.debugLineNum = 111;BA.debugLine="If scolor = \"\" Then Return Me";
if ((_scolor).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 112;BA.debugLine="AddClass(scolor)";
_addclass(_scolor);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 103;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 104;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 105;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 106;BA.debugLine="AddClass(scolor)";
_addclass(_scolor);
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 30;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMLabel";
 //BA.debugLineNum = 199;BA.debugLine="Label.SetDesignMode(b)";
_label._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 200;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 85;BA.debugLine="Label.SetDeviceOffsets(OS, OM, OL, OX)";
_label._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 97;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 98;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 91;BA.debugLine="Label.SetDeviceSizes(SS, SM, SL, SX)";
_label._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Sub SetDisabled(b As Boolean) As VMLabel";
 //BA.debugLineNum = 220;BA.debugLine="Label.SetDisabled(b)";
_label._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdisplay1(boolean _b) throws Exception{
 //BA.debugLineNum = 448;BA.debugLine="Sub SetDisplay1(b As Boolean) As VMLabel";
 //BA.debugLineNum = 449;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 450;BA.debugLine="Label.AddClass(\"display-1\")";
_label._addclass /*b4j.example.vmelement*/ ("display-1");
 //BA.debugLineNum = 451;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdisplay2(boolean _b) throws Exception{
 //BA.debugLineNum = 442;BA.debugLine="Sub SetDisplay2(b As Boolean) As VMLabel";
 //BA.debugLineNum = 443;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 444;BA.debugLine="Label.AddClass(\"display-2\")";
_label._addclass /*b4j.example.vmelement*/ ("display-2");
 //BA.debugLineNum = 445;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 446;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdisplay3(boolean _b) throws Exception{
 //BA.debugLineNum = 436;BA.debugLine="Sub SetDisplay3(b As Boolean) As VMLabel";
 //BA.debugLineNum = 437;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 438;BA.debugLine="Label.AddClass(\"display-3\")";
_label._addclass /*b4j.example.vmelement*/ ("display-3");
 //BA.debugLineNum = 439;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 440;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdisplay4(boolean _b) throws Exception{
 //BA.debugLineNum = 430;BA.debugLine="Sub SetDisplay4(b As Boolean) As VMLabel";
 //BA.debugLineNum = 431;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 432;BA.debugLine="Label.AddClass(\"display-4\")";
_label._addclass /*b4j.example.vmelement*/ ("display-4");
 //BA.debugLineNum = 433;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setelevation(int _e) throws Exception{
String _sele = "";
 //BA.debugLineNum = 379;BA.debugLine="Sub SetElevation(e As Int) As VMLabel";
 //BA.debugLineNum = 380;BA.debugLine="Dim sele As String = $\"elevation-${e}\"$";
_sele = ("elevation-"+__c.SmartStringFormatter("",(Object)(_e))+"");
 //BA.debugLineNum = 381;BA.debugLine="AddClass(sele)";
_addclass(_sele);
 //BA.debugLineNum = 382;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setfontfamily(String _ff) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetFontFamily(ff As String) As VMLabel";
 //BA.debugLineNum = 37;BA.debugLine="If ff = \"\" Then Return Me";
if ((_ff).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 38;BA.debugLine="SetStyleSingle(\"font-family\", ff)";
_setstylesingle("font-family",_ff);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setfontsize(String _fs) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetFontSize(fs As String) As VMLabel";
 //BA.debugLineNum = 43;BA.debugLine="If fs = \"\" Then Return Me";
if ((_fs).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 44;BA.debugLine="SetStyleSingle(\"font-size\", fs)";
_setstylesingle("font-size",_fs);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth1() throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetH1 As VMLabel";
 //BA.debugLineNum = 248;BA.debugLine="Label.SetTag(\"h1\")";
_label._settag /*b4j.example.vmelement*/ ("h1");
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth2() throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub SetH2 As VMLabel";
 //BA.debugLineNum = 258;BA.debugLine="Label.SetTag(\"h2\")";
_label._settag /*b4j.example.vmelement*/ ("h2");
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth3() throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub SetH3 As VMLabel";
 //BA.debugLineNum = 264;BA.debugLine="Label.SetTag(\"h3\")";
_label._settag /*b4j.example.vmelement*/ ("h3");
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth4() throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub SetH4 As VMLabel";
 //BA.debugLineNum = 269;BA.debugLine="Label.SetTag(\"h4\")";
_label._settag /*b4j.example.vmelement*/ ("h4");
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth5() throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub SetH5 As VMLabel";
 //BA.debugLineNum = 284;BA.debugLine="Label.SetTag(\"h5\")";
_label._settag /*b4j.example.vmelement*/ ("h5");
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth6() throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub SetH6 As VMLabel";
 //BA.debugLineNum = 289;BA.debugLine="Label.SetTag(\"h6\")";
_label._settag /*b4j.example.vmelement*/ ("h6");
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setheadline(boolean _b) throws Exception{
 //BA.debugLineNum = 455;BA.debugLine="Sub SetHeadline(b As Boolean) As VMLabel";
 //BA.debugLineNum = 456;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 457;BA.debugLine="Label.AddClass(\"headline\")";
_label._addclass /*b4j.example.vmelement*/ ("headline");
 //BA.debugLineNum = 458;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 459;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _sethref(String _href) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub SetHREF(href As String) As VMLabel";
 //BA.debugLineNum = 299;BA.debugLine="If href = \"\" Then Return Me";
if ((_href).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 300;BA.debugLine="Label.SetAttrSingle(\"href\", href)";
_label._setattrsingle /*b4j.example.vmelement*/ ("href",_href);
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setid(String _iid,boolean _bind) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMLab";
 //BA.debugLineNum = 152;BA.debugLine="Label.SetID(iID,bind)";
_label._setid /*b4j.example.vmelement*/ (_iid,_bind);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setitalic(boolean _b) throws Exception{
 //BA.debugLineNum = 373;BA.debugLine="Sub SetItalic(b As Boolean) As VMLabel";
 //BA.debugLineNum = 374;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 375;BA.debugLine="AddClass(\"font-italic\")";
_addclass("font-italic");
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setoverline(boolean _b) throws Exception{
 //BA.debugLineNum = 489;BA.debugLine="Sub SetOverline(b As Boolean) As VMLabel";
 //BA.debugLineNum = 490;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 491;BA.debugLine="Label.AddClass(\"overline\")";
_label._addclass /*b4j.example.vmelement*/ ("overline");
 //BA.debugLineNum = 492;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 493;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setparagraph() throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub SetParagraph As VMLabel";
 //BA.debugLineNum = 243;BA.debugLine="Label.SetTag(\"p\")";
_label._settag /*b4j.example.vmelement*/ ("p");
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMLab";
 //BA.debugLineNum = 79;BA.debugLine="Label.SetRC(sRow, sCol)";
_label._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetRequired(b As Boolean) As VMLabel";
 //BA.debugLineNum = 210;BA.debugLine="Label.SetRequired(b)";
_label._setrequired /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setspan() throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetSpan As VMLabel";
 //BA.debugLineNum = 274;BA.debugLine="Label.SetTag(\"span\")";
_label._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetStatic(b As Boolean) As VMLabel";
 //BA.debugLineNum = 60;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 61;BA.debugLine="Label.SetStatic(b)";
_label._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub SetStyle(sm As Map) As VMLabel";
 //BA.debugLineNum = 232;BA.debugLine="Label.SetStyle(sm)";
_label._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 50;BA.debugLine="Label.SetStyleSingle(prop, value)";
_label._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setsubtitle1(boolean _b) throws Exception{
 //BA.debugLineNum = 468;BA.debugLine="Sub SetSubTitle1(b As Boolean) As VMLabel";
 //BA.debugLineNum = 469;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 470;BA.debugLine="Label.AddClass(\"subtitle-1\")";
_label._addclass /*b4j.example.vmelement*/ ("subtitle-1");
 //BA.debugLineNum = 471;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 472;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setsubtitle2(boolean _b) throws Exception{
 //BA.debugLineNum = 475;BA.debugLine="Sub SetSubTitle2(b As Boolean) As VMLabel";
 //BA.debugLineNum = 476;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 477;BA.debugLine="Label.AddClass(\"subtitle-2\")";
_label._addclass /*b4j.example.vmelement*/ ("subtitle-2");
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settag(String _size) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetTag(size As String) As VMLabel";
 //BA.debugLineNum = 253;BA.debugLine="Label.SetTag(size)";
_label._settag /*b4j.example.vmelement*/ (_size);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settext(String _t) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub SetText(t As String) As VMLabel";
 //BA.debugLineNum = 237;BA.debugLine="t = BANano.SF(t)";
_t = _banano.SF(_t);
 //BA.debugLineNum = 238;BA.debugLine="Label.SetText(t)";
_label._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settextcapitalize(boolean _b) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetTextCapitalize(b As Boolean) As VMLabel";
 //BA.debugLineNum = 186;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 187;BA.debugLine="Label.AddClass(\"text-capitalize\")";
_label._addclass /*b4j.example.vmelement*/ ("text-capitalize");
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settextcenter() throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetTextCenter As VMLabel";
 //BA.debugLineNum = 193;BA.debugLine="Label.AddClass(\"text-center\")";
_label._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 511;BA.debugLine="Sub SetTextColor(varColor As String) As VMLabel";
 //BA.debugLineNum = 512;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 513;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 514;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 515;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 516;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 519;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 520;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 521;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 522;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 523;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 524;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 525;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 526;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settextjustify() throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetTextJustify As VMLabel";
 //BA.debugLineNum = 157;BA.debugLine="Label.AddClass(\"text-justify\")";
_label._addclass /*b4j.example.vmelement*/ ("text-justify");
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settextleft() throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetTextLeft As VMLabel";
 //BA.debugLineNum = 163;BA.debugLine="Label.AddClass(\"text-left\")";
_label._addclass /*b4j.example.vmelement*/ ("text-left");
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settextlowercase(boolean _b) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetTextLowerCase(b As Boolean) As VMLabel";
 //BA.debugLineNum = 173;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 174;BA.debugLine="Label.AddClass(\"text-lowercase\")";
_label._addclass /*b4j.example.vmelement*/ ("text-lowercase");
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settextright() throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetTextRight As VMLabel";
 //BA.debugLineNum = 168;BA.debugLine="Label.AddClass(\"text-right\")";
_label._addclass /*b4j.example.vmelement*/ ("text-right");
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settextuppercase(boolean _b) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetTextUpperCase(b As Boolean) As VMLabel";
 //BA.debugLineNum = 179;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 180;BA.debugLine="Label.AddClass(\"text-uppercase\")";
_label._addclass /*b4j.example.vmelement*/ ("text-uppercase");
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settitle(boolean _b) throws Exception{
 //BA.debugLineNum = 462;BA.debugLine="Sub SetTitle(b As Boolean) As VMLabel";
 //BA.debugLineNum = 463;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 464;BA.debugLine="Label.AddClass(\"title\")";
_label._addclass /*b4j.example.vmelement*/ ("title");
 //BA.debugLineNum = 465;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 466;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setverticalalignmiddle() throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub SetVerticalAlignMiddle As VMLabel";
 //BA.debugLineNum = 215;BA.debugLine="Label.SetVerticalAlignMiddle";
_label._setverticalalignmiddle /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 505;BA.debugLine="Sub SetVisible(b As Boolean) As VMLabel";
 //BA.debugLineNum = 506;BA.debugLine="Label.SetVisible(b)";
_label._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 507;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 508;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setvmodel(String _svmodel,String _value) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetVModel(svmodel As String, value As String)";
 //BA.debugLineNum = 66;BA.debugLine="value = BANano.SF(value)";
_value = _banano.SF(_value);
 //BA.debugLineNum = 67;BA.debugLine="svmodel = svmodel.tolowercase";
_svmodel = _svmodel.toLowerCase();
 //BA.debugLineNum = 68;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 69;BA.debugLine="SetText(value)";
_settext(_value);
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 };
 //BA.debugLineNum = 72;BA.debugLine="vue.SetData(svmodel, value)";
_vue._setdata /*b4j.example.bananovue*/ (_svmodel,(Object)(_value));
 //BA.debugLineNum = 73;BA.debugLine="SetText($\"{{ ${svmodel} }}\"$)";
_settext(("{{ "+__c.SmartStringFormatter("",(Object)(_svmodel))+" }}"));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setvonce(boolean _t) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetVOnce(t As Boolean) As VMLabel";
 //BA.debugLineNum = 55;BA.debugLine="Label.setvonce(t)";
_label._setvonce /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub SetVShow(vif As String) As VMLabel";
 //BA.debugLineNum = 225;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 226;BA.debugLine="Label.SetVShow(vif)";
_label._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _textcenter() throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub TextCenter As VMLabel";
 //BA.debugLineNum = 117;BA.debugLine="AddClass(\"text-center\")";
_addclass("text-center");
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _textright() throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub TextRight As VMLabel";
 //BA.debugLineNum = 122;BA.debugLine="AddClass(\"text-right\")";
_addclass("text-right");
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 418;BA.debugLine="Return Label.tostring";
if (true) return _label._tostring /*String*/ ();
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlabel  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 139;BA.debugLine="Sub UseTheme(themeName As String) As VMLabel";
 //BA.debugLineNum = 140;BA.debugLine="If themeName = \"\" Then Return Me";
if ((_themename).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 141;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 142;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 143;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 144;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 145;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
