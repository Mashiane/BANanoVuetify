package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcarousel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmcarousel", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcarousel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _carousel = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public b4j.example.vmcarouselitem _item = null;
public boolean _bstatic = false;
public anywheresoftware.b4a.objects.collections.List _items = null;
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
public b4j.example.vmcarousel  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 90;BA.debugLine="Sub AddChild(child As VMElement) As VMCarousel";
 //BA.debugLineNum = 91;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 92;BA.debugLine="Carousel.SetText(childHTML)";
_carousel._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 126;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 127;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 128;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcarousel  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub AddClass(c As String) As VMCarousel";
 //BA.debugLineNum = 109;BA.debugLine="Carousel.AddClass(c)";
_carousel._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 656;BA.debugLine="Sub AddComponent(comp As String) As VMCarousel";
 //BA.debugLineNum = 657;BA.debugLine="Carousel.SetText(comp)";
_carousel._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 658;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _additem(b4j.example.vmcarouselitem _ci) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub AddItem(ci As VMCarouselItem) As VMCarousel";
 //BA.debugLineNum = 53;BA.debugLine="AddComponent(ci.ToString)";
_addcomponent(_ci._tostring /*String*/ ());
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _additem1(String _src) throws Exception{
b4j.example.vmcarouselitem _ci = null;
 //BA.debugLineNum = 35;BA.debugLine="Sub AddItem1(src As String) As VMCarousel";
 //BA.debugLineNum = 36;BA.debugLine="Dim ci As VMCarouselItem";
_ci = new b4j.example.vmcarouselitem();
 //BA.debugLineNum = 37;BA.debugLine="ci.Initialize(vue, \"\", Me)";
_ci._initialize /*b4j.example.vmcarouselitem*/ (ba,_vue,"",this);
 //BA.debugLineNum = 38;BA.debugLine="ci.SetStatic(bStatic)";
_ci._setstatic /*b4j.example.vmcarouselitem*/ (_bstatic);
 //BA.debugLineNum = 39;BA.debugLine="ci.SetDesignMode(DesignMode)";
_ci._setdesignmode /*b4j.example.vmcarouselitem*/ (_designmode);
 //BA.debugLineNum = 40;BA.debugLine="ci.SetSRC(src)";
_ci._setsrc /*b4j.example.vmcarouselitem*/ (_src);
 //BA.debugLineNum = 41;BA.debugLine="items.Add(ci.ToString)";
_items.Add((Object)(_ci._tostring /*String*/ ()));
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 667;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 668;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 669;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcarousel  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 498;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 499;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 500;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 501;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 502;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 587;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 588;BA.debugLine="Carousel.BindStyleSingle(prop, value)";
_carousel._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 589;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 671;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 672;BA.debugLine="Carousel.BuildModel(mprops, mstyles, lclasses, loo";
_carousel._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 673;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 674;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Carousel As VMElement";
_carousel = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Public Item As VMCarouselItem";
_item = new b4j.example.vmcarouselitem();
 //BA.debugLineNum = 10;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 11;BA.debugLine="Private items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcarousel  _disable() throws Exception{
 //BA.debugLineNum = 491;BA.debugLine="Sub Disable As VMCarousel";
 //BA.debugLineNum = 492;BA.debugLine="Carousel.Disable(True)";
_carousel._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 493;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 494;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _enable() throws Exception{
 //BA.debugLineNum = 485;BA.debugLine="Sub Enable As VMCarousel";
 //BA.debugLineNum = 486;BA.debugLine="Carousel.Enable(True)";
_carousel._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 487;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 488;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _hide() throws Exception{
 //BA.debugLineNum = 473;BA.debugLine="Sub Hide As VMCarousel";
 //BA.debugLineNum = 474;BA.debugLine="Carousel.SetVisible(False)";
_carousel._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 475;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 476;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 16;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="Carousel.Initialize(v, ID)";
_carousel._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 18;BA.debugLine="Carousel.SetTag(\"v-carousel\")";
_carousel._settag /*b4j.example.vmelement*/ ("v-carousel");
 //BA.debugLineNum = 19;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 21;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 22;BA.debugLine="Item.Initialize(vue, \"\",Module)";
_item._initialize /*b4j.example.vmcarouselitem*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 23;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 24;BA.debugLine="items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 104;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcarousel  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 537;BA.debugLine="public Sub RemoveAttr(sName As String) As VMCarous";
 //BA.debugLineNum = 538;BA.debugLine="Carousel.RemoveAttr(sName)";
_carousel._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 539;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub Render";
 //BA.debugLineNum = 86;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcarousel  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 133;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 134;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 135;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 136;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 139;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 140;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 141;BA.debugLine="Carousel.Bind(\":active-class\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetAttr(attr As Map) As VMCarousel";
 //BA.debugLineNum = 115;BA.debugLine="Carousel.SetAttr(attr)";
_carousel._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 607;BA.debugLine="Sub SetAttributes(attrs As List) As VMCarousel";
 //BA.debugLineNum = 608;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 609;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 611;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 612;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 505;BA.debugLine="Sub SetAttrLoose(loose As String) As VMCarousel";
 //BA.debugLineNum = 506;BA.debugLine="Carousel.SetAttrLoose(loose)";
_carousel._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 507;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 508;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 581;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 582;BA.debugLine="Carousel.SetAttrSingle(prop, value)";
_carousel._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 583;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 584;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 523;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 524;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 525;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 526;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 527;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 528;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 530;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 531;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 532;BA.debugLine="Carousel.Bind(\":color\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 533;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 534;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setcontinuous(boolean _varcontinuous) throws Exception{
String _pp = "";
 //BA.debugLineNum = 146;BA.debugLine="Sub SetContinuous(varContinuous As Boolean) As VMC";
 //BA.debugLineNum = 147;BA.debugLine="If varContinuous Then Return Me";
if (_varcontinuous) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 148;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 149;BA.debugLine="SetAttrSingle(\"continuous\", varContinuous)";
_setattrsingle("continuous",BA.ObjectToString(_varcontinuous));
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 152;BA.debugLine="Dim pp As String = $\"${ID}Continuous\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Continuous");
 //BA.debugLineNum = 153;BA.debugLine="vue.SetStateSingle(pp, varContinuous)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcontinuous));
 //BA.debugLineNum = 154;BA.debugLine="Carousel.Bind(\":continuous\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":continuous",_pp);
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setcycle(boolean _varcycle) throws Exception{
String _pp = "";
 //BA.debugLineNum = 159;BA.debugLine="Sub SetCycle(varCycle As Boolean) As VMCarousel";
 //BA.debugLineNum = 160;BA.debugLine="If varCycle = False Then Return Me";
if (_varcycle==__c.False) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 161;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 162;BA.debugLine="SetAttrSingle(\"cycle\", varCycle)";
_setattrsingle("cycle",BA.ObjectToString(_varcycle));
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 165;BA.debugLine="Dim pp As String = $\"${ID}Cycle\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Cycle");
 //BA.debugLineNum = 166;BA.debugLine="vue.SetStateSingle(pp, varCycle)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcycle));
 //BA.debugLineNum = 167;BA.debugLine="Carousel.Bind(\":cycle\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":cycle",_pp);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 172;BA.debugLine="Sub SetDark(varDark As Boolean) As VMCarousel";
 //BA.debugLineNum = 173;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 174;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 175;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 178;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 179;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 180;BA.debugLine="Carousel.Bind(\":dark\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 29;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setdelimitericon(String _vardelimitericon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 185;BA.debugLine="Sub SetDelimiterIcon(varDelimiterIcon As String) A";
 //BA.debugLineNum = 186;BA.debugLine="If varDelimiterIcon = \"\" Then Return Me";
if ((_vardelimitericon).equals("")) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 187;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 188;BA.debugLine="SetAttrSingle(\"delimiter-icon\", varDelimiterIcon";
_setattrsingle("delimiter-icon",_vardelimitericon);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 191;BA.debugLine="Dim pp As String = $\"${ID}DelimiterIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DelimiterIcon");
 //BA.debugLineNum = 192;BA.debugLine="vue.SetStateSingle(pp, varDelimiterIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardelimitericon));
 //BA.debugLineNum = 193;BA.debugLine="Carousel.Bind(\":delimiter-icon\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":delimiter-icon",_pp);
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 555;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMCarousel";
 //BA.debugLineNum = 556;BA.debugLine="Carousel.SetDesignMode(b)";
_carousel._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 557;BA.debugLine="Item.SetDesignMode(b)";
_item._setdesignmode /*b4j.example.vmcarouselitem*/ (_b);
 //BA.debugLineNum = 558;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 559;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 560;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 636;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 637;BA.debugLine="Carousel.SetDeviceOffsets(OS, OM, OL, OX)";
_carousel._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 638;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 639;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 643;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 644;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 645;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 646;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 647;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 650;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 651;BA.debugLine="Carousel.SetDeviceSizes(SS, SM, SL, SX)";
_carousel._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 652;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 653;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 198;BA.debugLine="Sub SetHeight(varHeight As String) As VMCarousel";
 //BA.debugLineNum = 199;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 200;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 201;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 204;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 205;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 206;BA.debugLine="Carousel.Bind(\":height\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _sethidedelimiterbackground(boolean _varhidedelimiterbackground) throws Exception{
String _pp = "";
 //BA.debugLineNum = 211;BA.debugLine="Sub SetHideDelimiterBackground(varHideDelimiterBac";
 //BA.debugLineNum = 212;BA.debugLine="If varHideDelimiterBackground = False Then Return";
if (_varhidedelimiterbackground==__c.False) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 213;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 214;BA.debugLine="SetAttrSingle(\"hide-delimiter-background\", varHi";
_setattrsingle("hide-delimiter-background",BA.ObjectToString(_varhidedelimiterbackground));
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 217;BA.debugLine="Dim pp As String = $\"${ID}HideDelimiterBackground";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideDelimiterBackground");
 //BA.debugLineNum = 218;BA.debugLine="vue.SetStateSingle(pp, varHideDelimiterBackground";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhidedelimiterbackground));
 //BA.debugLineNum = 219;BA.debugLine="Carousel.Bind(\":hide-delimiter-background\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":hide-delimiter-background",_pp);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _sethidedelimiters(boolean _varhidedelimiters) throws Exception{
String _pp = "";
 //BA.debugLineNum = 224;BA.debugLine="Sub SetHideDelimiters(varHideDelimiters As Boolean";
 //BA.debugLineNum = 225;BA.debugLine="If varHideDelimiters = False Then Return Me";
if (_varhidedelimiters==__c.False) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 226;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 227;BA.debugLine="SetAttrSingle(\"hide-delimiters\", varHideDelimite";
_setattrsingle("hide-delimiters",BA.ObjectToString(_varhidedelimiters));
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 230;BA.debugLine="Dim pp As String = $\"${ID}HideDelimiters\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideDelimiters");
 //BA.debugLineNum = 231;BA.debugLine="vue.SetStateSingle(pp, varHideDelimiters)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhidedelimiters));
 //BA.debugLineNum = 232;BA.debugLine="Carousel.Bind(\":hide-delimiters\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":hide-delimiters",_pp);
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setinterval(String _varinterval) throws Exception{
String _pp = "";
 //BA.debugLineNum = 237;BA.debugLine="Sub SetInterval(varInterval As String) As VMCarous";
 //BA.debugLineNum = 238;BA.debugLine="If varInterval = \"\" Then Return Me";
if ((_varinterval).equals("")) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 239;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 240;BA.debugLine="SetAttrSingle(\"interval\", varInterval)";
_setattrsingle("interval",_varinterval);
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 243;BA.debugLine="Dim pp As String = $\"${ID}Interval\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Interval");
 //BA.debugLineNum = 244;BA.debugLine="vue.SetStateSingle(pp, varInterval)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varinterval));
 //BA.debugLineNum = 245;BA.debugLine="Carousel.Bind(\":interval\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":interval",_pp);
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 623;BA.debugLine="Sub SetKey(k As String) As VMCarousel";
 //BA.debugLineNum = 624;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 625;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 626;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 627;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 250;BA.debugLine="Sub SetLight(varLight As Boolean) As VMCarousel";
 //BA.debugLineNum = 251;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 252;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 253;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 256;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 257;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 258;BA.debugLine="Carousel.Bind(\":light\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setmandatory(boolean _varmandatory) throws Exception{
String _pp = "";
 //BA.debugLineNum = 263;BA.debugLine="Sub SetMandatory(varMandatory As Boolean) As VMCar";
 //BA.debugLineNum = 264;BA.debugLine="If varMandatory Then Return Me";
if (_varmandatory) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 265;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 266;BA.debugLine="SetAttrSingle(\"mandatory\", varMandatory)";
_setattrsingle("mandatory",BA.ObjectToString(_varmandatory));
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 269;BA.debugLine="Dim pp As String = $\"${ID}Mandatory\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Mandatory");
 //BA.debugLineNum = 270;BA.debugLine="vue.SetStateSingle(pp, varMandatory)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmandatory));
 //BA.debugLineNum = 271;BA.debugLine="Carousel.Bind(\":mandatory\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":mandatory",_pp);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 549;BA.debugLine="Sub SetMarginAll(p As String) As VMCarousel";
 //BA.debugLineNum = 550;BA.debugLine="Carousel.setmarginall(p)";
_carousel._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 551;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 552;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setmax(String _varmax) throws Exception{
String _pp = "";
 //BA.debugLineNum = 276;BA.debugLine="Sub SetMax(varMax As String) As VMCarousel";
 //BA.debugLineNum = 277;BA.debugLine="If varMax = \"\" Then Return Me";
if ((_varmax).equals("")) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 278;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 279;BA.debugLine="SetAttrSingle(\"max\", varMax)";
_setattrsingle("max",_varmax);
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 282;BA.debugLine="Dim pp As String = $\"${ID}Max\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Max");
 //BA.debugLineNum = 283;BA.debugLine="vue.SetStateSingle(pp, varMax)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmax));
 //BA.debugLineNum = 284;BA.debugLine="Carousel.Bind(\":max\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":max",_pp);
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setmultiple(boolean _varmultiple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 289;BA.debugLine="Sub SetMultiple(varMultiple As Boolean) As VMCarou";
 //BA.debugLineNum = 290;BA.debugLine="If varMultiple = False Then Return Me";
if (_varmultiple==__c.False) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 291;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 292;BA.debugLine="SetAttrSingle(\"multiple\", varMultiple)";
_setattrsingle("multiple",BA.ObjectToString(_varmultiple));
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 295;BA.debugLine="Dim pp As String = $\"${ID}Multiple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Multiple");
 //BA.debugLineNum = 296;BA.debugLine="vue.SetStateSingle(pp, varMultiple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmultiple));
 //BA.debugLineNum = 297;BA.debugLine="Carousel.Bind(\":multiple\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":multiple",_pp);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 569;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 570;BA.debugLine="Carousel.SetName(varName, bbind)";
_carousel._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 571;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 572;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setnexticon(boolean _varnexticon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 302;BA.debugLine="Sub SetNextIcon(varNextIcon As Boolean) As VMCarou";
 //BA.debugLineNum = 303;BA.debugLine="If varNextIcon = False Then Return Me";
if (_varnexticon==__c.False) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 304;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 305;BA.debugLine="SetAttrSingle(\"next-icon\", varNextIcon)";
_setattrsingle("next-icon",BA.ObjectToString(_varnexticon));
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 308;BA.debugLine="Dim pp As String = $\"${ID}NextIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NextIcon");
 //BA.debugLineNum = 309;BA.debugLine="vue.SetStateSingle(pp, varNextIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnexticon));
 //BA.debugLineNum = 310;BA.debugLine="Carousel.Bind(\":next-icon\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":next-icon",_pp);
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setoninput(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 460;BA.debugLine="Sub SetOnInput(methodName As String) As VMCarousel";
 //BA.debugLineNum = 461;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 462;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 463;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 464;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 465;BA.debugLine="SetAttr(CreateMap(\"@input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_methodname)}));
 //BA.debugLineNum = 467;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 468;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 543;BA.debugLine="Sub SetPaddingAll(p As String) As VMCarousel";
 //BA.debugLineNum = 544;BA.debugLine="Carousel.SetPaddingAll(p)";
_carousel._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 545;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 546;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setprevicon(boolean _varprevicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 315;BA.debugLine="Sub SetPrevIcon(varPrevIcon As Boolean) As VMCarou";
 //BA.debugLineNum = 316;BA.debugLine="If varPrevIcon  = False Then Return Me";
if (_varprevicon==__c.False) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 317;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 318;BA.debugLine="SetAttrSingle(\"prev-icon\", varPrevIcon)";
_setattrsingle("prev-icon",BA.ObjectToString(_varprevicon));
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 321;BA.debugLine="Dim pp As String = $\"${ID}PrevIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrevIcon");
 //BA.debugLineNum = 322;BA.debugLine="vue.SetStateSingle(pp, varPrevIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprevicon));
 //BA.debugLineNum = 323;BA.debugLine="Carousel.Bind(\":prev-icon\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":prev-icon",_pp);
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setprogress(boolean _varprogress) throws Exception{
String _pp = "";
 //BA.debugLineNum = 328;BA.debugLine="Sub SetProgress(varProgress As Boolean) As VMCarou";
 //BA.debugLineNum = 329;BA.debugLine="If varProgress = False Then Return Me";
if (_varprogress==__c.False) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 330;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 331;BA.debugLine="SetAttrSingle(\"progress\", varProgress)";
_setattrsingle("progress",BA.ObjectToString(_varprogress));
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 334;BA.debugLine="Dim pp As String = $\"${ID}Progress\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Progress");
 //BA.debugLineNum = 335;BA.debugLine="vue.SetStateSingle(pp, varProgress)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprogress));
 //BA.debugLineNum = 336;BA.debugLine="Carousel.Bind(\":progress\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":progress",_pp);
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setprogresscolor(String _varprogresscolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 341;BA.debugLine="Sub SetProgressColor(varProgressColor As String) A";
 //BA.debugLineNum = 342;BA.debugLine="If varProgressColor = \"\" Then Return Me";
if ((_varprogresscolor).equals("")) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 343;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 344;BA.debugLine="SetAttrSingle(\"progress-color\", varProgressColor";
_setattrsingle("progress-color",_varprogresscolor);
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 347;BA.debugLine="Dim pp As String = $\"${ID}ProgressColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ProgressColor");
 //BA.debugLineNum = 348;BA.debugLine="vue.SetStateSingle(pp, varProgressColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprogresscolor));
 //BA.debugLineNum = 349;BA.debugLine="Carousel.Bind(\":progress-color\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":progress-color",_pp);
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setprogresscolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 354;BA.debugLine="Sub SetProgressColorIntensity(varColor As String,";
 //BA.debugLineNum = 355;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 356;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 357;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 358;BA.debugLine="SetAttrSingle(\"progress-color\", scolor)";
_setattrsingle("progress-color",_scolor);
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 361;BA.debugLine="Dim pp As String = $\"${ID}ProgressColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ProgressColor");
 //BA.debugLineNum = 362;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 363;BA.debugLine="Carousel.Bind(\":progress-color\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":progress-color",_pp);
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 630;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMCar";
 //BA.debugLineNum = 631;BA.debugLine="Carousel.SetRC(sRow, sCol)";
_carousel._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 632;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 633;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setreverse(boolean _varreverse) throws Exception{
String _pp = "";
 //BA.debugLineNum = 368;BA.debugLine="Sub SetReverse(varReverse As Boolean) As VMCarouse";
 //BA.debugLineNum = 369;BA.debugLine="If varReverse = False Then Return Me";
if (_varreverse==__c.False) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 370;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 371;BA.debugLine="SetAttrSingle(\"reverse\", varReverse)";
_setattrsingle("reverse",BA.ObjectToString(_varreverse));
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 374;BA.debugLine="Dim pp As String = $\"${ID}Reverse\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Reverse");
 //BA.debugLineNum = 375;BA.debugLine="vue.SetStateSingle(pp, varReverse)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreverse));
 //BA.debugLineNum = 376;BA.debugLine="Carousel.Bind(\":reverse\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":reverse",_pp);
 //BA.debugLineNum = 377;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 378;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setshowarrows(boolean _varshowarrows) throws Exception{
String _pp = "";
 //BA.debugLineNum = 381;BA.debugLine="Sub SetShowArrows(varShowArrows As Boolean) As VMC";
 //BA.debugLineNum = 382;BA.debugLine="If varShowArrows Then Return Me";
if (_varshowarrows) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 383;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 384;BA.debugLine="SetAttrSingle(\"show-arrows\", varShowArrows)";
_setattrsingle("show-arrows",BA.ObjectToString(_varshowarrows));
 //BA.debugLineNum = 385;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 387;BA.debugLine="Dim pp As String = $\"${ID}ShowArrows\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowArrows");
 //BA.debugLineNum = 388;BA.debugLine="vue.SetStateSingle(pp, varShowArrows)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshowarrows));
 //BA.debugLineNum = 389;BA.debugLine="Carousel.Bind(\":show-arrows\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":show-arrows",_pp);
 //BA.debugLineNum = 390;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setshowarrowsonhover(boolean _varshowarrowsonhover) throws Exception{
String _pp = "";
 //BA.debugLineNum = 394;BA.debugLine="Sub SetShowArrowsOnHover(varShowArrowsOnHover As B";
 //BA.debugLineNum = 395;BA.debugLine="If varShowArrowsOnHover = False Then Return Me";
if (_varshowarrowsonhover==__c.False) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 396;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 397;BA.debugLine="SetAttrSingle(\"show-arrows-on-hover\", varShowArr";
_setattrsingle("show-arrows-on-hover",BA.ObjectToString(_varshowarrowsonhover));
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 400;BA.debugLine="Dim pp As String = $\"${ID}ShowArrowsOnHover\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowArrowsOnHover");
 //BA.debugLineNum = 401;BA.debugLine="vue.SetStateSingle(pp, varShowArrowsOnHover)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshowarrowsonhover));
 //BA.debugLineNum = 402;BA.debugLine="Carousel.Bind(\":show-arrows-on-hover\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":show-arrows-on-hover",_pp);
 //BA.debugLineNum = 403;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetStatic(b As Boolean) As VMCarousel";
 //BA.debugLineNum = 46;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 47;BA.debugLine="Carousel.SetStatic(b)";
_carousel._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 48;BA.debugLine="Item.setstatic(b)";
_item._setstatic /*b4j.example.vmcarouselitem*/ (_b);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetStyle(sm As Map) As VMCarousel";
 //BA.debugLineNum = 121;BA.debugLine="Carousel.SetStyle(sm)";
_carousel._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 575;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 576;BA.debugLine="Carousel.SetStyleSingle(prop, value)";
_carousel._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 577;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 578;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 563;BA.debugLine="Sub SetTabIndex(ti As String) As VMCarousel";
 //BA.debugLineNum = 564;BA.debugLine="Carousel.SetTabIndex(ti)";
_carousel._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 565;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 566;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _settext(String _t) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetText(t As String) As VMCarousel";
 //BA.debugLineNum = 98;BA.debugLine="Carousel.SetText(t)";
_carousel._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _settextcenter() throws Exception{
 //BA.debugLineNum = 662;BA.debugLine="Sub SetTextCenter As VMCarousel";
 //BA.debugLineNum = 663;BA.debugLine="Carousel.AddClass(\"text-center\")";
_carousel._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 664;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 665;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 682;BA.debugLine="Sub SetTextColor(varColor As String) As VMCarousel";
 //BA.debugLineNum = 683;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 684;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 685;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 686;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 689;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 690;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 691;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 692;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 693;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 694;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 695;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _settouch(Object _vartouch) throws Exception{
String _pp = "";
 //BA.debugLineNum = 407;BA.debugLine="Sub SetTouch(varTouch As Object) As VMCarousel";
 //BA.debugLineNum = 408;BA.debugLine="Dim pp As String = $\"${ID}Touch\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Touch");
 //BA.debugLineNum = 409;BA.debugLine="vue.SetStateSingle(pp, varTouch)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vartouch);
 //BA.debugLineNum = 410;BA.debugLine="Carousel.Bind(\":touch\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":touch",_pp);
 //BA.debugLineNum = 411;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _settouchless(boolean _vartouchless) throws Exception{
String _pp = "";
 //BA.debugLineNum = 415;BA.debugLine="Sub SetTouchless(varTouchless As Boolean) As VMCar";
 //BA.debugLineNum = 416;BA.debugLine="If varTouchless = False Then Return Me";
if (_vartouchless==__c.False) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 417;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 418;BA.debugLine="SetAttrSingle(\"touchless\", varTouchless)";
_setattrsingle("touchless",BA.ObjectToString(_vartouchless));
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 421;BA.debugLine="Dim pp As String = $\"${ID}Touchless\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Touchless");
 //BA.debugLineNum = 422;BA.debugLine="vue.SetStateSingle(pp, varTouchless)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartouchless));
 //BA.debugLineNum = 423;BA.debugLine="Carousel.Bind(\":touchless\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":touchless",_pp);
 //BA.debugLineNum = 424;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 428;BA.debugLine="Sub SetValue(varValue As String) As VMCarousel";
 //BA.debugLineNum = 429;BA.debugLine="Carousel.SetValue(varValue, False)";
_carousel._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 430;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 592;BA.debugLine="Sub SetVElse(vif As String) As VMCarousel";
 //BA.debugLineNum = 593;BA.debugLine="Carousel.SetVElse(vif)";
_carousel._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 594;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 595;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setvertical(boolean _varvertical) throws Exception{
String _pp = "";
 //BA.debugLineNum = 434;BA.debugLine="Sub SetVertical(varVertical As Boolean) As VMCarou";
 //BA.debugLineNum = 435;BA.debugLine="If varVertical = False Then Return Me";
if (_varvertical==__c.False) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 436;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 437;BA.debugLine="SetAttrSingle(\"vertical\", varVertical)";
_setattrsingle("vertical",BA.ObjectToString(_varvertical));
 //BA.debugLineNum = 438;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 440;BA.debugLine="Dim pp As String = $\"${ID}Vertical\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Vertical");
 //BA.debugLineNum = 441;BA.debugLine="vue.SetStateSingle(pp, varVertical)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvertical));
 //BA.debugLineNum = 442;BA.debugLine="Carousel.Bind(\":vertical\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":vertical",_pp);
 //BA.debugLineNum = 443;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setverticaldelimiters(String _varverticaldelimiters) throws Exception{
String _pp = "";
 //BA.debugLineNum = 447;BA.debugLine="Sub SetVerticalDelimiters(varVerticalDelimiters As";
 //BA.debugLineNum = 448;BA.debugLine="If varVerticalDelimiters = \"\" Then Return Me";
if ((_varverticaldelimiters).equals("")) { 
if (true) return (b4j.example.vmcarousel)(this);};
 //BA.debugLineNum = 449;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 450;BA.debugLine="SetAttrSingle(\"vertical-delimiters\", varVertical";
_setattrsingle("vertical-delimiters",_varverticaldelimiters);
 //BA.debugLineNum = 451;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 };
 //BA.debugLineNum = 453;BA.debugLine="Dim pp As String = $\"${ID}VerticalDelimiters\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"VerticalDelimiters");
 //BA.debugLineNum = 454;BA.debugLine="vue.SetStateSingle(pp, varVerticalDelimiters)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varverticaldelimiters));
 //BA.debugLineNum = 455;BA.debugLine="Carousel.Bind(\":vertical-delimiters\", pp)";
_carousel._bind /*b4j.example.vmelement*/ (":vertical-delimiters",_pp);
 //BA.debugLineNum = 456;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setvfor(String _sitem,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 615;BA.debugLine="Sub SetVFor(sItem As String, dataSource As String)";
 //BA.debugLineNum = 616;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 617;BA.debugLine="sItem = sItem.tolowercase";
_sitem = _sitem.toLowerCase();
 //BA.debugLineNum = 618;BA.debugLine="Dim sline As String = $\"${sItem} in ${dataSource}";
_sline = (""+__c.SmartStringFormatter("",(Object)(_sitem))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 619;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 620;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 621;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 602;BA.debugLine="Sub SetVhtml(vhtml As String) As VMCarousel";
 //BA.debugLineNum = 603;BA.debugLine="Carousel.SetVHtml(vhtml)";
_carousel._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 604;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 605;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetVIf(vif As String) As VMCarousel";
 //BA.debugLineNum = 75;BA.debugLine="Carousel.SetVIf(vif)";
_carousel._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 676;BA.debugLine="Sub SetVisible(b As Boolean) As VMCarousel";
 //BA.debugLineNum = 677;BA.debugLine="Carousel.SetVisible(b)";
_carousel._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 678;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetVModel(k As String) As VMCarousel";
 //BA.debugLineNum = 70;BA.debugLine="Carousel.SetVModel(k)";
_carousel._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetVShow(vif As String) As VMCarousel";
 //BA.debugLineNum = 80;BA.debugLine="Carousel.SetVShow(vif)";
_carousel._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 597;BA.debugLine="Sub SetVText(vhtml As String) As VMCarousel";
 //BA.debugLineNum = 598;BA.debugLine="Carousel.SetVText(vhtml)";
_carousel._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 599;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 600;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _show() throws Exception{
 //BA.debugLineNum = 479;BA.debugLine="Sub Show As VMCarousel";
 //BA.debugLineNum = 480;BA.debugLine="Carousel.SetVisible(True)";
_carousel._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 481;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 482;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _s = "";
 //BA.debugLineNum = 58;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 59;BA.debugLine="If items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 60;BA.debugLine="For Each s As String In items";
{
final anywheresoftware.b4a.BA.IterableList group2 = _items;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_s = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 61;BA.debugLine="AddComponent(s)";
_addcomponent(_s);
 }
};
 }else {
 //BA.debugLineNum = 64;BA.debugLine="AddComponent(Item.ToString)";
_addcomponent(_item._tostring /*String*/ ());
 };
 //BA.debugLineNum = 66;BA.debugLine="Return Carousel.ToString";
if (true) return _carousel._tostring /*String*/ ();
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcarousel  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 511;BA.debugLine="Sub UseTheme(themeName As String) As VMCarousel";
 //BA.debugLineNum = 512;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 513;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 514;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 515;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 516;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 518;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarousel)(this);
 //BA.debugLineNum = 519;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
