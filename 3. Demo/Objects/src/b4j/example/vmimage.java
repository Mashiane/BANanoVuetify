package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmimage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmimage", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmimage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _image = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public String _imglink = "";
public boolean _hastooltip = false;
public b4j.example.vmtooltip _tooltip = null;
public b4j.example.vmtemplate _tmpl = null;
public b4j.example.vmlabel _span = null;
public boolean _bstatic = false;
public boolean _hascontent = false;
public b4j.example.vmhover _hover = null;
public boolean _hashover = false;
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
public b4j.example.vmimage  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 331;BA.debugLine="Sub AddChild(child As VMElement) As VMImage";
 //BA.debugLineNum = 332;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 333;BA.debugLine="Image.SetText(childHTML)";
_image._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 367;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 368;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 369;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmimage  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub AddClass(c As String) As VMImage";
 //BA.debugLineNum = 350;BA.debugLine="Image.AddClass(c)";
_image._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _addcomponent(String _scomp) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub AddComponent(scomp As String) As VMImage";
 //BA.debugLineNum = 274;BA.debugLine="SetText(scomp)";
_settext(_scomp);
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 713;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 714;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 715;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmimage  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 656;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 657;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 658;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 659;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 660;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _bindstyle(anywheresoftware.b4a.objects.collections.Map _optm) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub BindStyle(optm As Map) As VMImage";
 //BA.debugLineNum = 168;BA.debugLine="Image.BindStyle(optm)";
_image._bindstyle /*b4j.example.vmelement*/ (_optm);
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _bindstylesingle(String _prop,String _optm) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub BindStyleSingle(prop As String, optm As String";
 //BA.debugLineNum = 163;BA.debugLine="Image.BindStyleSingle(prop, optm)";
_image._bindstylesingle /*b4j.example.vmelement*/ (_prop,_optm);
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 717;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 718;BA.debugLine="Image.BuildModel(mprops, mstyles, lclasses, loose";
_image._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 719;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 720;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Image As VMElement";
_image = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private imgLink As String";
_imglink = "";
 //BA.debugLineNum = 10;BA.debugLine="Private hasTooltip As Boolean";
_hastooltip = false;
 //BA.debugLineNum = 11;BA.debugLine="Private tooltip As VMToolTip";
_tooltip = new b4j.example.vmtooltip();
 //BA.debugLineNum = 12;BA.debugLine="Private tmpl As VMTemplate";
_tmpl = new b4j.example.vmtemplate();
 //BA.debugLineNum = 13;BA.debugLine="Private span As VMLabel";
_span = new b4j.example.vmlabel();
 //BA.debugLineNum = 14;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 15;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 16;BA.debugLine="Public Hover As VMHover";
_hover = new b4j.example.vmhover();
 //BA.debugLineNum = 17;BA.debugLine="Private hasHover As Boolean";
_hashover = false;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmimage  _disable() throws Exception{
 //BA.debugLineNum = 649;BA.debugLine="Sub Disable As VMImage";
 //BA.debugLineNum = 650;BA.debugLine="Image.Disable(True)";
_image._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 651;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 652;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _enable() throws Exception{
 //BA.debugLineNum = 644;BA.debugLine="Sub Enable As VMImage";
 //BA.debugLineNum = 645;BA.debugLine="Image.Enable(True)";
_image._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 646;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 647;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _hide() throws Exception{
 //BA.debugLineNum = 634;BA.debugLine="Sub Hide As VMImage";
 //BA.debugLineNum = 635;BA.debugLine="Image.SetVisible(False)";
_image._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 636;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 637;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 22;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 23;BA.debugLine="Image.Initialize(v, ID)";
_image._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 24;BA.debugLine="Image.SetTag(\"v-img\")";
_image._settag /*b4j.example.vmelement*/ ("v-img");
 //BA.debugLineNum = 25;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 26;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 27;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 28;BA.debugLine="imgLink = $\"${ID}url\"$";
_imglink = (""+__c.SmartStringFormatter("",(Object)(_id))+"url");
 //BA.debugLineNum = 29;BA.debugLine="hasTooltip = False";
_hastooltip = __c.False;
 //BA.debugLineNum = 30;BA.debugLine="tooltip.Initialize(vue, \"\", Module)";
_tooltip._initialize /*b4j.example.vmtooltip*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 31;BA.debugLine="tmpl.Initialize(vue, \"\", Module)";
_tmpl._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 32;BA.debugLine="tmpl.SetAttrSingle(\"v-slot:activator\", \"{ on }\")";
_tmpl._setattrsingle /*b4j.example.vmtemplate*/ ("v-slot:activator","{ on }");
 //BA.debugLineNum = 33;BA.debugLine="span.Initialize(vue, \"\").SetSpan";
_span._initialize /*b4j.example.vmlabel*/ (ba,_vue,"")._setspan /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 34;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 35;BA.debugLine="HasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 36;BA.debugLine="Hover.Initialize(vue, $\"${ID}hover\"$, Module)";
_hover._initialize /*b4j.example.vmhover*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"hover"),_module);
 //BA.debugLineNum = 37;BA.debugLine="hasHover = False";
_hashover = __c.False;
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 345;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmimage  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 663;BA.debugLine="public Sub RemoveAttr(sName As String) As VMImage";
 //BA.debugLineNum = 664;BA.debugLine="Image.RemoveAttr(sName)";
_image._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 665;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 666;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub Render";
 //BA.debugLineNum = 327;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmimage  _setalt(String _varalt) throws Exception{
String _pp = "";
 //BA.debugLineNum = 374;BA.debugLine="Sub SetAlt(varAlt As String) As VMImage";
 //BA.debugLineNum = 375;BA.debugLine="If varAlt = \"\" Then Return Me";
if ((_varalt).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 376;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 377;BA.debugLine="SetAttrSingle(\"alt\", varAlt)";
_setattrsingle("alt",_varalt);
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 380;BA.debugLine="Dim pp As String = $\"${ID}Alt\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Alt");
 //BA.debugLineNum = 381;BA.debugLine="vue.SetStateSingle(pp, varAlt)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varalt));
 //BA.debugLineNum = 382;BA.debugLine="Image.Bind(\":alt\", pp)";
_image._bind /*b4j.example.vmelement*/ (":alt",_pp);
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setaspectratio(String _varaspectratio) throws Exception{
String _pp = "";
 //BA.debugLineNum = 387;BA.debugLine="Sub SetAspectRatio(varAspectRatio As String) As VM";
 //BA.debugLineNum = 388;BA.debugLine="If varAspectRatio = \"\" Then Return Me";
if ((_varaspectratio).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 389;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 390;BA.debugLine="SetAttrSingle(\"aspect-ratio\", varAspectRatio)";
_setattrsingle("aspect-ratio",_varaspectratio);
 //BA.debugLineNum = 391;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 393;BA.debugLine="Dim pp As String = $\"${ID}AspectRatio\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AspectRatio");
 //BA.debugLineNum = 394;BA.debugLine="vue.SetStateSingle(pp, varAspectRatio)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varaspectratio));
 //BA.debugLineNum = 395;BA.debugLine="Image.Bind(\":aspect-ratio\", pp)";
_image._bind /*b4j.example.vmelement*/ (":aspect-ratio",_pp);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Sub SetAttr(attr As Map) As VMImage";
 //BA.debugLineNum = 356;BA.debugLine="Image.SetAttr(attr)";
_image._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 357;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 222;BA.debugLine="Sub SetAttributes(attrs As List) As VMImage";
 //BA.debugLineNum = 223;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 224;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetAttrLoose(loose As String) As VMImage";
 //BA.debugLineNum = 218;BA.debugLine="Image.SetAttrLoose(loose)";
_image._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 707;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 708;BA.debugLine="Image.SetAttrSingle(prop, value)";
_image._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 709;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 710;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setborder(String _swidth,String _color,String _bstyle) throws Exception{
anywheresoftware.b4a.objects.collections.Map _b = null;
 //BA.debugLineNum = 202;BA.debugLine="Sub SetBorder(swidth As String, color As String, b";
 //BA.debugLineNum = 203;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 204;BA.debugLine="SetStyleSingle(\"border-style\", bstyle)";
_setstylesingle("border-style",_bstyle);
 //BA.debugLineNum = 205;BA.debugLine="SetStyleSingle(\"border-width\", swidth)";
_setstylesingle("border-width",_swidth);
 //BA.debugLineNum = 206;BA.debugLine="SetStyleSingle(\"border-color\", color)";
_setstylesingle("border-color",_color);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 209;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
 //BA.debugLineNum = 210;BA.debugLine="b.Put(\"borderStyle\", bstyle)";
_b.Put((Object)("borderStyle"),(Object)(_bstyle));
 //BA.debugLineNum = 211;BA.debugLine="b.Put(\"borderWidth\", swidth)";
_b.Put((Object)("borderWidth"),(Object)(_swidth));
 //BA.debugLineNum = 212;BA.debugLine="b.Put(\"borderColor\", color)";
_b.Put((Object)("borderColor"),(Object)(_color));
 //BA.debugLineNum = 213;BA.debugLine="BindStyle(b)";
_bindstyle(_b);
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setbordercolor(String _bcolor) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetBorderColor(bColor As String) As VMImage";
 //BA.debugLineNum = 193;BA.debugLine="If bColor = \"\" Then Return Me";
if ((_bcolor).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 194;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 195;BA.debugLine="SetStyleSingle(\"border-color\", bColor)";
_setstylesingle("border-color",_bcolor);
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 198;BA.debugLine="BindStyleSingle(\"borderColor\", bColor)";
_bindstylesingle("borderColor",_bcolor);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setborderradius(String _br) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetBorderRadius(br As String) As VMImage";
 //BA.debugLineNum = 103;BA.debugLine="If br = \"\" Then Return Me";
if ((_br).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 104;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 105;BA.debugLine="SetStyleSingle(\"border-radius\", br)";
_setstylesingle("border-radius",_br);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 108;BA.debugLine="BindStyleSingle(\"borderRadius\", br)";
_bindstylesingle("borderRadius",_br);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setborderstyle(String _bstyle) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetBorderStyle(bStyle As String) As VMImage";
 //BA.debugLineNum = 173;BA.debugLine="If bStyle = \"\" Then Return Me";
if ((_bstyle).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 174;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 175;BA.debugLine="SetStyleSingle(\"border-style\", bStyle)";
_setstylesingle("border-style",_bstyle);
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 178;BA.debugLine="BindStyleSingle(\"borderStyle\", bStyle)";
_bindstylesingle("borderStyle",_bstyle);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setborderwidth(String _bwidth) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub SetBorderWidth(bWidth As String) As VMImage";
 //BA.debugLineNum = 183;BA.debugLine="If bWidth = \"\" Then Return Me";
if ((_bwidth).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 184;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 185;BA.debugLine="SetStyleSingle(\"border-width\", bWidth)";
_setstylesingle("border-width",_bwidth);
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 188;BA.debugLine="BindStyleSingle(\"borderWidth\", bWidth)";
_bindstylesingle("borderWidth",_bwidth);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setcenteronparent(boolean _b) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetCenterOnParent(b As Boolean) As VMImage";
 //BA.debugLineNum = 82;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 83;BA.debugLine="Image.CenterOnParent = True";
_image._centeronparent /*boolean*/  = __c.True;
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 253;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 254;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 255;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 256;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 257;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 260;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 261;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 262;BA.debugLine="Image.Bind(\":color\", pp)";
_image._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setcontain(boolean _varcontain) throws Exception{
String _pp = "";
 //BA.debugLineNum = 400;BA.debugLine="Sub SetContain(varContain As Boolean) As VMImage";
 //BA.debugLineNum = 401;BA.debugLine="If varContain = False Then Return Me";
if (_varcontain==__c.False) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 402;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 403;BA.debugLine="SetAttrSingle(\"contain\", varContain)";
_setattrsingle("contain",BA.ObjectToString(_varcontain));
 //BA.debugLineNum = 404;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 406;BA.debugLine="Dim pp As String = $\"${ID}Contain\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Contain");
 //BA.debugLineNum = 407;BA.debugLine="vue.SetStateSingle(pp, varContain)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcontain));
 //BA.debugLineNum = 408;BA.debugLine="Image.Bind(\":contain\", pp)";
_image._bind /*b4j.example.vmelement*/ (":contain",_pp);
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setcursormove() throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetCursorMove As VMImage";
 //BA.debugLineNum = 140;BA.debugLine="Image.SetCursorMove";
_image._setcursormove /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setcursorpointer() throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetCursorPointer As VMImage";
 //BA.debugLineNum = 145;BA.debugLine="Image.SetCursorPointer";
_image._setcursorpointer /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 42;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 679;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMImage";
 //BA.debugLineNum = 680;BA.debugLine="Image.SetDesignMode(b)";
_image._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 681;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 682;BA.debugLine="Image.SetDesignMode(b)";
_image._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 683;BA.debugLine="tooltip.SetDesignMode(b)";
_tooltip._setdesignmode /*b4j.example.vmtooltip*/ (_b);
 //BA.debugLineNum = 684;BA.debugLine="tmpl.SetDesignMode(b)";
_tmpl._setdesignmode /*b4j.example.vmtemplate*/ (_b);
 //BA.debugLineNum = 685;BA.debugLine="span.SetDesignMode(b)";
_span._setdesignmode /*b4j.example.vmlabel*/ (_b);
 //BA.debugLineNum = 686;BA.debugLine="Hover.SetDesignMode(b)";
_hover._setdesignmode /*b4j.example.vmhover*/ (_b);
 //BA.debugLineNum = 687;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 688;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 120;BA.debugLine="Image.SetDeviceOffsets(OS, OM, OL, OX)";
_image._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 151;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 152;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 158;BA.debugLine="Image.SetDeviceSizes(SS, SM, SL, SX)";
_image._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setdraggable(boolean _b) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetDraggable(b As Boolean) As VMImage";
 //BA.debugLineNum = 125;BA.debugLine="Image.SetDraggable(b)";
_image._setdraggable /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setdroppable(boolean _b) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetDroppable(b As Boolean) As VMImage";
 //BA.debugLineNum = 130;BA.debugLine="Image.SetDroppable(b)";
_image._setdroppable /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _seteager(boolean _vareager) throws Exception{
String _pp = "";
 //BA.debugLineNum = 413;BA.debugLine="Sub SetEager(varEager As Boolean) As VMImage";
 //BA.debugLineNum = 414;BA.debugLine="If varEager = False Then Return Me";
if (_vareager==__c.False) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 415;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 416;BA.debugLine="SetAttrSingle(\"eager\", varEager)";
_setattrsingle("eager",BA.ObjectToString(_vareager));
 //BA.debugLineNum = 417;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 419;BA.debugLine="Dim pp As String = $\"${ID}Eager\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Eager");
 //BA.debugLineNum = 420;BA.debugLine="vue.SetStateSingle(pp, varEager)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareager));
 //BA.debugLineNum = 421;BA.debugLine="Image.Bind(\":eager\", pp)";
_image._bind /*b4j.example.vmelement*/ (":eager",_pp);
 //BA.debugLineNum = 422;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setgradient(String _vargradient) throws Exception{
String _pp = "";
 //BA.debugLineNum = 426;BA.debugLine="Sub SetGradient(varGradient As String) As VMImage";
 //BA.debugLineNum = 427;BA.debugLine="If varGradient = \"\" Then Return Me";
if ((_vargradient).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 428;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 429;BA.debugLine="SetAttrSingle(\"gradient\", varGradient)";
_setattrsingle("gradient",_vargradient);
 //BA.debugLineNum = 430;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 432;BA.debugLine="Dim pp As String = $\"${ID}Gradient\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Gradient");
 //BA.debugLineNum = 433;BA.debugLine="vue.SetStateSingle(pp, varGradient)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vargradient));
 //BA.debugLineNum = 434;BA.debugLine="Image.Bind(\":gradient\", pp)";
_image._bind /*b4j.example.vmelement*/ (":gradient",_pp);
 //BA.debugLineNum = 435;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 439;BA.debugLine="Sub SetHeight(varHeight As String) As VMImage";
 //BA.debugLineNum = 440;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 441;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 442;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 443;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 445;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 446;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 447;BA.debugLine="Image.Bind(\":height\", pp)";
_image._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _sethover(boolean _b) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetHover(b As Boolean) As VMImage";
 //BA.debugLineNum = 49;BA.debugLine="hasHover = b";
_hashover = _b;
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setlazysrc(String _varlazysrc) throws Exception{
String _pp = "";
 //BA.debugLineNum = 452;BA.debugLine="Sub SetLazySrc(varLazySrc As String) As VMImage";
 //BA.debugLineNum = 453;BA.debugLine="If varLazySrc = \"\" Then Return Me";
if ((_varlazysrc).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 454;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 455;BA.debugLine="SetAttrSingle(\"lazy-src\", varLazySrc)";
_setattrsingle("lazy-src",_varlazysrc);
 //BA.debugLineNum = 456;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 458;BA.debugLine="Dim pp As String = $\"${ID}LazySrc\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"LazySrc");
 //BA.debugLineNum = 459;BA.debugLine="vue.SetStateSingle(pp, varLazySrc)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlazysrc));
 //BA.debugLineNum = 460;BA.debugLine="Image.Bind(\":lazy-src\", pp)";
_image._bind /*b4j.example.vmelement*/ (":lazy-src",_pp);
 //BA.debugLineNum = 461;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 462;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 463;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 674;BA.debugLine="Sub SetMarginAll(p As String) As VMImage";
 //BA.debugLineNum = 675;BA.debugLine="Image.setmarginall(p)";
_image._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 676;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 677;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setmaxheight(String _varmaxheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 466;BA.debugLine="Sub SetMaxHeight(varMaxHeight As String) As VMImag";
 //BA.debugLineNum = 467;BA.debugLine="If varMaxHeight = \"\" Then Return Me";
if ((_varmaxheight).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 468;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 469;BA.debugLine="SetAttrSingle(\"max-height\", varMaxHeight)";
_setattrsingle("max-height",_varmaxheight);
 //BA.debugLineNum = 470;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 472;BA.debugLine="Dim pp As String = $\"${ID}MaxHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxHeight");
 //BA.debugLineNum = 473;BA.debugLine="vue.SetStateSingle(pp, varMaxHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxheight));
 //BA.debugLineNum = 474;BA.debugLine="Image.Bind(\":max-height\", pp)";
_image._bind /*b4j.example.vmelement*/ (":max-height",_pp);
 //BA.debugLineNum = 475;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 476;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setmaxwidth(String _varmaxwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 479;BA.debugLine="Sub SetMaxWidth(varMaxWidth As String) As VMImage";
 //BA.debugLineNum = 480;BA.debugLine="If varMaxWidth = \"\" Then Return Me";
if ((_varmaxwidth).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 481;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 482;BA.debugLine="SetAttrSingle(\"max-width\", varMaxWidth)";
_setattrsingle("max-width",_varmaxwidth);
 //BA.debugLineNum = 483;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 485;BA.debugLine="Dim pp As String = $\"${ID}MaxWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxWidth");
 //BA.debugLineNum = 486;BA.debugLine="vue.SetStateSingle(pp, varMaxWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxwidth));
 //BA.debugLineNum = 487;BA.debugLine="Image.Bind(\":max-width\", pp)";
_image._bind /*b4j.example.vmelement*/ (":max-width",_pp);
 //BA.debugLineNum = 488;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setminheight(String _varminheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 492;BA.debugLine="Sub SetMinHeight(varMinHeight As String) As VMImag";
 //BA.debugLineNum = 493;BA.debugLine="If varMinHeight = \"\" Then Return Me";
if ((_varminheight).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 494;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 495;BA.debugLine="SetAttrSingle(\"min-height\", varMinHeight)";
_setattrsingle("min-height",_varminheight);
 //BA.debugLineNum = 496;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 498;BA.debugLine="Dim pp As String = $\"${ID}MinHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinHeight");
 //BA.debugLineNum = 499;BA.debugLine="vue.SetStateSingle(pp, varMinHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminheight));
 //BA.debugLineNum = 500;BA.debugLine="Image.Bind(\":min-height\", pp)";
_image._bind /*b4j.example.vmelement*/ (":min-height",_pp);
 //BA.debugLineNum = 501;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 502;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setminwidth(String _varminwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 505;BA.debugLine="Sub SetMinWidth(varMinWidth As String) As VMImage";
 //BA.debugLineNum = 506;BA.debugLine="If varMinWidth = \"\" Then Return Me";
if ((_varminwidth).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 507;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 508;BA.debugLine="SetAttrSingle(\"min-width\", varMinWidth)";
_setattrsingle("min-width",_varminwidth);
 //BA.debugLineNum = 509;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 511;BA.debugLine="Dim pp As String = $\"${ID}MinWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinWidth");
 //BA.debugLineNum = 512;BA.debugLine="vue.SetStateSingle(pp, varMinWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminwidth));
 //BA.debugLineNum = 513;BA.debugLine="Image.Bind(\":min-width\", pp)";
_image._bind /*b4j.example.vmelement*/ (":min-width",_pp);
 //BA.debugLineNum = 514;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 696;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 697;BA.debugLine="Image.SetName(varName, bbind)";
_image._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 698;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setonclick(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 58;BA.debugLine="Sub SetOnClick(EventHandler As Object, methodName";
 //BA.debugLineNum = 59;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 60;BA.debugLine="If SubExists(EventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 61;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 62;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(EventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 63;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 65;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setondragstart(Object _eventhandler,String _methodname) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetOnDragStart(eventHandler As Object, methodN";
 //BA.debugLineNum = 135;BA.debugLine="Image.SetOnDragStart(eventHandler, methodName)";
_image._setondragstart /*b4j.example.vmelement*/ (_eventhandler,_methodname);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setonerror(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 610;BA.debugLine="Sub SetOnError(methodName As String) As VMImage";
 //BA.debugLineNum = 611;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 612;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 613;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 614;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 615;BA.debugLine="SetAttr(CreateMap(\"@error\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@error"),(Object)(_methodname)}));
 //BA.debugLineNum = 617;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 618;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setonload(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 622;BA.debugLine="Sub SetOnLoad(methodName As String) As VMImage";
 //BA.debugLineNum = 623;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 624;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 625;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 626;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 627;BA.debugLine="SetAttr(CreateMap(\"@load\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@load"),(Object)(_methodname)}));
 //BA.debugLineNum = 629;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 630;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 631;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setoptions(Object _varoptions) throws Exception{
String _pp = "";
 //BA.debugLineNum = 518;BA.debugLine="Sub SetOptions(varOptions As Object) As VMImage";
 //BA.debugLineNum = 519;BA.debugLine="Dim pp As String = $\"${ID}Options\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Options");
 //BA.debugLineNum = 520;BA.debugLine="vue.SetStateSingle(pp, varOptions)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varoptions);
 //BA.debugLineNum = 521;BA.debugLine="Image.Bind(\":options\", pp)";
_image._bind /*b4j.example.vmelement*/ (":options",_pp);
 //BA.debugLineNum = 522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 669;BA.debugLine="Sub SetPaddingAll(p As String) As VMImage";
 //BA.debugLineNum = 670;BA.debugLine="Image.SetPaddingAll(p)";
_image._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 671;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 672;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setposition(String _varposition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 526;BA.debugLine="Sub SetPosition(varPosition As String) As VMImage";
 //BA.debugLineNum = 527;BA.debugLine="If varPosition = \"\" Then Return Me";
if ((_varposition).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 528;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 529;BA.debugLine="SetAttrSingle(\"position\", varPosition)";
_setattrsingle("position",_varposition);
 //BA.debugLineNum = 530;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 532;BA.debugLine="Dim pp As String = $\"${ID}Position\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Position");
 //BA.debugLineNum = 533;BA.debugLine="vue.SetStateSingle(pp, varPosition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varposition));
 //BA.debugLineNum = 534;BA.debugLine="Image.Bind(\":position\", pp)";
_image._bind /*b4j.example.vmelement*/ (":position",_pp);
 //BA.debugLineNum = 535;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 536;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMIma";
 //BA.debugLineNum = 114;BA.debugLine="Image.SetRC(sRow, sCol)";
_image._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setrequired(boolean _varrequired) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMImage";
 //BA.debugLineNum = 268;BA.debugLine="If varRequired = False Then Return Me";
if (_varrequired==__c.False) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 269;BA.debugLine="Image.SetRequired(varRequired)";
_image._setrequired /*b4j.example.vmelement*/ (_varrequired);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setsize(String _swidth,String _sheight) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetSize(swidth As String, sheight As String) A";
 //BA.debugLineNum = 230;BA.debugLine="If swidth <> \"\" Then";
if ((_swidth).equals("") == false) { 
 //BA.debugLineNum = 231;BA.debugLine="SetWidth(swidth)";
_setwidth(_swidth);
 //BA.debugLineNum = 232;BA.debugLine="SetMaxWidth(swidth)";
_setmaxwidth(_swidth);
 };
 //BA.debugLineNum = 234;BA.debugLine="If sheight <> \"\" Then";
if ((_sheight).equals("") == false) { 
 //BA.debugLineNum = 235;BA.debugLine="SetHeight(sheight)";
_setheight(_sheight);
 //BA.debugLineNum = 236;BA.debugLine="SetMaxHeight(sheight)";
_setmaxheight(_sheight);
 };
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setsizes(String _varsizes) throws Exception{
String _pp = "";
 //BA.debugLineNum = 539;BA.debugLine="Sub SetSizes(varSizes As String) As VMImage";
 //BA.debugLineNum = 540;BA.debugLine="If varSizes = \"\" Then Return Me";
if ((_varsizes).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 541;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 542;BA.debugLine="SetAttrSingle(\"sizes\", varSizes)";
_setattrsingle("sizes",_varsizes);
 //BA.debugLineNum = 543;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 545;BA.debugLine="Dim pp As String = $\"${ID}Sizes\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Sizes");
 //BA.debugLineNum = 546;BA.debugLine="vue.SetStateSingle(pp, varSizes)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsizes));
 //BA.debugLineNum = 547;BA.debugLine="Image.Bind(\":sizes\", pp)";
_image._bind /*b4j.example.vmelement*/ (":sizes",_pp);
 //BA.debugLineNum = 548;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 549;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setslotplaceholder(boolean _b) throws Exception{
 //BA.debugLineNum = 604;BA.debugLine="Sub SetSlotPlaceholder(b As Boolean) As VMImage";
 //BA.debugLineNum = 605;BA.debugLine="SetAttr(CreateMap(\"slot\": \"placeholder\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("placeholder")}));
 //BA.debugLineNum = 606;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 607;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setsrc(String _varsrc) throws Exception{
 //BA.debugLineNum = 552;BA.debugLine="Sub SetSrc(varSrc As String) As VMImage";
 //BA.debugLineNum = 553;BA.debugLine="If varSrc = \"\" Then Return Me";
if ((_varsrc).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 554;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 555;BA.debugLine="SetAttrSingle(\"src\", varSrc)";
_setattrsingle("src",_varsrc);
 //BA.debugLineNum = 556;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 558;BA.debugLine="Image.Bind(\":src\", varSrc)";
_image._bind /*b4j.example.vmelement*/ (":src",_varsrc);
 //BA.debugLineNum = 559;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 560;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 561;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setsrcset(String _varsrcset) throws Exception{
String _pp = "";
 //BA.debugLineNum = 564;BA.debugLine="Sub SetSrcSet(varSrcset As String) As VMImage";
 //BA.debugLineNum = 565;BA.debugLine="If varSrcset = \"\" Then Return Me";
if ((_varsrcset).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 566;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 567;BA.debugLine="SetAttrSingle(\"srcset\", varSrcset)";
_setattrsingle("srcset",_varsrcset);
 //BA.debugLineNum = 568;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 570;BA.debugLine="Dim pp As String = $\"${ID}Srcset\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Srcset");
 //BA.debugLineNum = 571;BA.debugLine="vue.SetStateSingle(pp, varSrcset)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsrcset));
 //BA.debugLineNum = 572;BA.debugLine="Image.Bind(\":srcset\", pp)";
_image._bind /*b4j.example.vmelement*/ (":srcset",_pp);
 //BA.debugLineNum = 573;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 574;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 575;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetStatic(b As Boolean) As VMImage";
 //BA.debugLineNum = 71;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 72;BA.debugLine="Image.SetStatic(b)";
_image._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 73;BA.debugLine="tooltip.SetStatic(b)";
_tooltip._setstatic /*b4j.example.vmtooltip*/ (_b);
 //BA.debugLineNum = 74;BA.debugLine="tmpl.SetStatic(b)";
_tmpl._setstatic /*b4j.example.vmtemplate*/ (_b);
 //BA.debugLineNum = 75;BA.debugLine="span.SetStatic(b)";
_span._setstatic /*b4j.example.vmlabel*/ (_b);
 //BA.debugLineNum = 76;BA.debugLine="Hover.SetStatic(b)";
_hover._setstatic /*b4j.example.vmhover*/ (_b);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Sub SetStyle(sm As Map) As VMImage";
 //BA.debugLineNum = 362;BA.debugLine="Image.SetStyle(sm)";
_image._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 702;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 703;BA.debugLine="Image.SetStyleSingle(prop, value)";
_image._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 704;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 705;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 690;BA.debugLine="Sub SetTabIndex(ti As String) As VMImage";
 //BA.debugLineNum = 691;BA.debugLine="Image.SetTabIndex(ti)";
_image._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 692;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 693;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _settext(String _t) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub SetText(t As String) As VMImage";
 //BA.debugLineNum = 339;BA.debugLine="Image.SetText(t)";
_image._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 728;BA.debugLine="Sub SetTextColor(varColor As String) As VMImage";
 //BA.debugLineNum = 729;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 730;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 731;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 732;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 735;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 736;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 737;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 738;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 739;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 740;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 741;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetTooltip(tt As String) As VMImage";
 //BA.debugLineNum = 89;BA.debugLine="If tt = \"\" Then Return Me";
if ((_tt).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 90;BA.debugLine="hasTooltip = True";
_hastooltip = __c.True;
 //BA.debugLineNum = 91;BA.debugLine="tooltip.SetRight(True)";
_tooltip._setright /*b4j.example.vmtooltip*/ (__c.True);
 //BA.debugLineNum = 92;BA.debugLine="Image.SetAttrSingle(\"v-on\", \"on\")";
_image._setattrsingle /*b4j.example.vmelement*/ ("v-on","on");
 //BA.debugLineNum = 93;BA.debugLine="span.SetText(tt)";
_span._settext /*b4j.example.vmlabel*/ (_tt);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _settransition(String _vartransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 578;BA.debugLine="Sub SetTransition(varTransition As String) As VMIm";
 //BA.debugLineNum = 579;BA.debugLine="If varTransition = \"\" Then Return Me";
if ((_vartransition).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 580;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 581;BA.debugLine="SetAttrSingle(\"transition\", varTransition)";
_setattrsingle("transition",_vartransition);
 //BA.debugLineNum = 582;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 584;BA.debugLine="Dim pp As String = $\"${ID}Transition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Transition");
 //BA.debugLineNum = 585;BA.debugLine="vue.SetStateSingle(pp, varTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartransition));
 //BA.debugLineNum = 586;BA.debugLine="Image.Bind(\":transition\", pp)";
_image._bind /*b4j.example.vmelement*/ (":transition",_pp);
 //BA.debugLineNum = 587;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 588;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setvalue(String _url) throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Sub SetValue(url As String) As VMImage";
 //BA.debugLineNum = 298;BA.debugLine="SetVModel(imgLink, url)";
_setvmodel(_imglink,_url);
 //BA.debugLineNum = 299;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setverticalalignmiddle() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetVerticalAlignMiddle As VMImage";
 //BA.debugLineNum = 98;BA.debugLine="Image.SetVerticalAlignMiddle";
_image._setverticalalignmiddle /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub SetVIf(vif As String) As VMImage";
 //BA.debugLineNum = 316;BA.debugLine="Image.SetVIf(vif)";
_image._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 722;BA.debugLine="Sub SetVisible(b As Boolean) As VMImage";
 //BA.debugLineNum = 723;BA.debugLine="Image.SetVisible(b)";
_image._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 724;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 725;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setvmodel(String _k,String _value) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub SetVModel(k As String, value As String) As VMI";
 //BA.debugLineNum = 304;BA.debugLine="Image.Value = value";
_image._value /*Object*/  = (Object)(_value);
 //BA.debugLineNum = 305;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 306;BA.debugLine="SetSrc(value)";
_setsrc(_value);
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 309;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 310;BA.debugLine="vue.SetData(k, value)";
_vue._setdata /*b4j.example.bananovue*/ (_k,(Object)(_value));
 //BA.debugLineNum = 311;BA.debugLine="SetSrc(k)";
_setsrc(_k);
 //BA.debugLineNum = 312;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setvonce(boolean _t) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetVOnce(t As Boolean) As VMImage";
 //BA.debugLineNum = 54;BA.debugLine="Image.setvonce(t)";
_image._setvonce /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub SetVShow(vif As String) As VMImage";
 //BA.debugLineNum = 321;BA.debugLine="Image.SetVShow(vif)";
_image._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setwidth(String _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 591;BA.debugLine="Sub SetWidth(varWidth As String) As VMImage";
 //BA.debugLineNum = 592;BA.debugLine="If varWidth = \"\" Then Return Me";
if ((_varwidth).equals("")) { 
if (true) return (b4j.example.vmimage)(this);};
 //BA.debugLineNum = 593;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 594;BA.debugLine="SetAttrSingle(\"width\", varWidth)";
_setattrsingle("width",_varwidth);
 //BA.debugLineNum = 595;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 };
 //BA.debugLineNum = 597;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 598;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varwidth));
 //BA.debugLineNum = 599;BA.debugLine="Image.Bind(\":width\", pp)";
_image._bind /*b4j.example.vmelement*/ (":width",_pp);
 //BA.debugLineNum = 600;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 601;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _show() throws Exception{
 //BA.debugLineNum = 639;BA.debugLine="Sub Show As VMImage";
 //BA.debugLineNum = 640;BA.debugLine="Image.SetVisible(True)";
_image._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 641;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 642;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _sout = "";
 //BA.debugLineNum = 279;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 280;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
 //BA.debugLineNum = 281;BA.debugLine="If hasTooltip Then";
if (_hastooltip) { 
 //BA.debugLineNum = 282;BA.debugLine="Image.Pop(tmpl.Template)";
_image._pop /*String*/ (_tmpl._template /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 283;BA.debugLine="tmpl.Pop(tooltip.tooltip)";
_tmpl._pop /*String*/ (_tooltip._tooltip /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 284;BA.debugLine="span.Pop(tooltip.ToolTip)";
_span._pop /*String*/ (_tooltip._tooltip /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 285;BA.debugLine="sout = tooltip.ToString";
_sout = _tooltip._tostring /*String*/ ();
 }else {
 //BA.debugLineNum = 287;BA.debugLine="sout = Image.ToString";
_sout = _image._tostring /*String*/ ();
 };
 //BA.debugLineNum = 289;BA.debugLine="If hasHover Then";
if (_hashover) { 
 //BA.debugLineNum = 290;BA.debugLine="Hover.AddComponent(sout)";
_hover._addcomponent /*b4j.example.vmhover*/ (_sout);
 //BA.debugLineNum = 291;BA.debugLine="Return Hover.tostring";
if (true) return _hover._tostring /*String*/ ();
 }else {
 //BA.debugLineNum = 293;BA.debugLine="Return sout";
if (true) return _sout;
 };
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmimage  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 242;BA.debugLine="Sub UseTheme(themeName As String) As VMImage";
 //BA.debugLineNum = 243;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 244;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 245;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 246;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 247;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
