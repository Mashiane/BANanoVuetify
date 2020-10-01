package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcarouselitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmcarouselitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcarouselitem.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _carouselitem = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
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
public b4j.example.vmcarouselitem  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 62;BA.debugLine="Sub AddChild(child As VMElement) As VMCarouselItem";
 //BA.debugLineNum = 63;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 64;BA.debugLine="CarouselItem.SetText(childHTML)";
_carouselitem._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 92;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 93;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 94;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcarouselitem  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub AddClass(c As String) As VMCarouselItem";
 //BA.debugLineNum = 75;BA.debugLine="CarouselItem.AddClass(c)";
_carouselitem._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 476;BA.debugLine="Sub AddComponent(comp As String) As VMCarouselItem";
 //BA.debugLineNum = 477;BA.debugLine="CarouselItem.SetText(comp)";
_carouselitem._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 487;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 488;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcarouselitem  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 320;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 321;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 408;BA.debugLine="CarouselItem.BindStyleSingle(prop, value)";
_carouselitem._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 492;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 493;BA.debugLine="CarouselItem.BuildModel(mprops, mstyles, lclasses,";
_carouselitem._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 494;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public CarouselItem As VMElement";
_carouselitem = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcarouselitem  _disable() throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Sub Disable As VMCarouselItem";
 //BA.debugLineNum = 313;BA.debugLine="CarouselItem.Disable(True)";
_carouselitem._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _enable() throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub Enable As VMCarouselItem";
 //BA.debugLineNum = 307;BA.debugLine="CarouselItem.Enable(True)";
_carouselitem._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _hide() throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub Hide As VMCarouselItem";
 //BA.debugLineNum = 295;BA.debugLine="CarouselItem.SetVisible(False)";
_carouselitem._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="CarouselItem.Initialize(v, ID)";
_carouselitem._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="CarouselItem.SetTag(\"v-carousel-item\")";
_carouselitem._settag /*b4j.example.vmelement*/ ("v-carousel-item");
 //BA.debugLineNum = 17;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 70;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcarouselitem  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 358;BA.debugLine="public Sub RemoveAttr(sName As String) As VMCarous";
 //BA.debugLineNum = 359;BA.debugLine="CarouselItem.RemoveAttr(sName)";
_carouselitem._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Render";
 //BA.debugLineNum = 58;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcarouselitem  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 99;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 100;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 101;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 102;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 };
 //BA.debugLineNum = 105;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 106;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 107;BA.debugLine="CarouselItem.Bind(\":active-class\", pp)";
_carouselitem._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setappend(boolean _varappend) throws Exception{
String _pp = "";
 //BA.debugLineNum = 112;BA.debugLine="Sub SetAppend(varAppend As Boolean) As VMCarouselI";
 //BA.debugLineNum = 113;BA.debugLine="If varAppend = False Then Return Me";
if (_varappend==__c.False) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 114;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 115;BA.debugLine="SetAttrSingle(\"append\", varAppend)";
_setattrsingle("append",BA.ObjectToString(_varappend));
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 };
 //BA.debugLineNum = 118;BA.debugLine="Dim pp As String = $\"${ID}Append\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Append");
 //BA.debugLineNum = 119;BA.debugLine="vue.SetStateSingle(pp, varAppend)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varappend));
 //BA.debugLineNum = 120;BA.debugLine="CarouselItem.Bind(\":append\", pp)";
_carouselitem._bind /*b4j.example.vmelement*/ (":append",_pp);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetAttr(attr As Map) As VMCarouselItem";
 //BA.debugLineNum = 81;BA.debugLine="CarouselItem.SetAttr(attr)";
_carouselitem._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 427;BA.debugLine="Sub SetAttributes(attrs As List) As VMCarouselItem";
 //BA.debugLineNum = 428;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 429;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 431;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetAttrLoose(loose As String) As VMCarouselIte";
 //BA.debugLineNum = 327;BA.debugLine="CarouselItem.SetAttrLoose(loose)";
_carouselitem._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 401;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 402;BA.debugLine="CarouselItem.SetAttrSingle(prop, value)";
_carouselitem._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 403;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 344;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 345;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 346;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 347;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 348;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 };
 //BA.debugLineNum = 351;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 352;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 353;BA.debugLine="CarouselItem.Bind(\":color\", pp)";
_carouselitem._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 31;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 376;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMCarouselItem";
 //BA.debugLineNum = 377;BA.debugLine="CarouselItem.SetDesignMode(b)";
_carouselitem._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 378;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 456;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 457;BA.debugLine="CarouselItem.SetDeviceOffsets(OS, OM, OL, OX)";
_carouselitem._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 458;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 459;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 463;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 464;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 465;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 466;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 470;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 471;BA.debugLine="CarouselItem.SetDeviceSizes(SS, SM, SL, SX)";
_carouselitem._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 472;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMCarou";
 //BA.debugLineNum = 126;BA.debugLine="CarouselItem.SetDisabled(varDisabled)";
_carouselitem._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _seteager(boolean _vareager) throws Exception{
String _pp = "";
 //BA.debugLineNum = 131;BA.debugLine="Sub SetEager(varEager As Boolean) As VMCarouselIte";
 //BA.debugLineNum = 132;BA.debugLine="If varEager = False Then Return Me";
if (_vareager==__c.False) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 133;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 134;BA.debugLine="SetAttrSingle(\"eager\", varEager)";
_setattrsingle("eager",BA.ObjectToString(_vareager));
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 };
 //BA.debugLineNum = 137;BA.debugLine="Dim pp As String = $\"${ID}Eager\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Eager");
 //BA.debugLineNum = 138;BA.debugLine="vue.SetStateSingle(pp, varEager)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareager));
 //BA.debugLineNum = 139;BA.debugLine="CarouselItem.Bind(\":eager\", pp)";
_carouselitem._bind /*b4j.example.vmelement*/ (":eager",_pp);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setexact(boolean _varexact) throws Exception{
String _pp = "";
 //BA.debugLineNum = 144;BA.debugLine="Sub SetExact(varExact As Boolean) As VMCarouselIte";
 //BA.debugLineNum = 145;BA.debugLine="If varExact = False Then Return Me";
if (_varexact==__c.False) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 146;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 147;BA.debugLine="SetAttrSingle(\"exact\", varExact)";
_setattrsingle("exact",BA.ObjectToString(_varexact));
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 };
 //BA.debugLineNum = 150;BA.debugLine="Dim pp As String = $\"${ID}Exact\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Exact");
 //BA.debugLineNum = 151;BA.debugLine="vue.SetStateSingle(pp, varExact)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexact));
 //BA.debugLineNum = 152;BA.debugLine="CarouselItem.Bind(\":exact\", pp)";
_carouselitem._bind /*b4j.example.vmelement*/ (":exact",_pp);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setexactactiveclass(String _varexactactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 157;BA.debugLine="Sub SetExactActiveClass(varExactActiveClass As Str";
 //BA.debugLineNum = 158;BA.debugLine="If varExactActiveClass = \"\" Then Return Me";
if ((_varexactactiveclass).equals("")) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 159;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 160;BA.debugLine="SetAttrSingle(\"exact-active-class\", varExactActi";
_setattrsingle("exact-active-class",_varexactactiveclass);
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 };
 //BA.debugLineNum = 163;BA.debugLine="Dim pp As String = $\"${ID}ExactActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ExactActiveClass");
 //BA.debugLineNum = 164;BA.debugLine="vue.SetStateSingle(pp, varExactActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexactactiveclass));
 //BA.debugLineNum = 165;BA.debugLine="CarouselItem.Bind(\":exact-active-class\", pp)";
_carouselitem._bind /*b4j.example.vmelement*/ (":exact-active-class",_pp);
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _sethref(String _varhref) throws Exception{
String _pp = "";
 //BA.debugLineNum = 170;BA.debugLine="Sub SetHref(varHref As String) As VMCarouselItem";
 //BA.debugLineNum = 171;BA.debugLine="If varHref = \"\" Then Return Me";
if ((_varhref).equals("")) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 172;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 173;BA.debugLine="SetAttrSingle(\"href\", varHref)";
_setattrsingle("href",_varhref);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 };
 //BA.debugLineNum = 176;BA.debugLine="Dim pp As String = $\"${ID}Href\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Href");
 //BA.debugLineNum = 177;BA.debugLine="vue.SetStateSingle(pp, varHref)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhref));
 //BA.debugLineNum = 178;BA.debugLine="CarouselItem.Bind(\":href\", pp)";
_carouselitem._bind /*b4j.example.vmelement*/ (":href",_pp);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 443;BA.debugLine="Sub SetKey(k As String) As VMCarouselItem";
 //BA.debugLineNum = 444;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 445;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 446;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setlink(boolean _varlink) throws Exception{
String _pp = "";
 //BA.debugLineNum = 183;BA.debugLine="Sub SetLink(varLink As Boolean) As VMCarouselItem";
 //BA.debugLineNum = 184;BA.debugLine="If varLink = False Then Return Me";
if (_varlink==__c.False) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 185;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 186;BA.debugLine="SetAttrSingle(\"link\", varLink)";
_setattrsingle("link",BA.ObjectToString(_varlink));
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 };
 //BA.debugLineNum = 189;BA.debugLine="Dim pp As String = $\"${ID}Link\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Link");
 //BA.debugLineNum = 190;BA.debugLine="vue.SetStateSingle(pp, varLink)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlink));
 //BA.debugLineNum = 191;BA.debugLine="CarouselItem.Bind(\":link\", pp)";
_carouselitem._bind /*b4j.example.vmelement*/ (":link",_pp);
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 370;BA.debugLine="Sub SetMarginAll(p As String) As VMCarouselItem";
 //BA.debugLineNum = 371;BA.debugLine="CarouselItem.setmarginall(p)";
_carouselitem._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 389;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 390;BA.debugLine="CarouselItem.SetName(varName, bbind)";
_carouselitem._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 391;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setnuxt(boolean _varnuxt) throws Exception{
String _pp = "";
 //BA.debugLineNum = 201;BA.debugLine="Sub SetNuxt(varNuxt As Boolean) As VMCarouselItem";
 //BA.debugLineNum = 202;BA.debugLine="If varNuxt = False Then Return Me";
if (_varnuxt==__c.False) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 203;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 204;BA.debugLine="SetAttrSingle(\"nuxt\", varNuxt)";
_setattrsingle("nuxt",BA.ObjectToString(_varnuxt));
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 };
 //BA.debugLineNum = 207;BA.debugLine="Dim pp As String = $\"${ID}Nuxt\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Nuxt");
 //BA.debugLineNum = 208;BA.debugLine="vue.SetStateSingle(pp, varNuxt)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnuxt));
 //BA.debugLineNum = 209;BA.debugLine="CarouselItem.Bind(\":nuxt\", pp)";
_carouselitem._bind /*b4j.example.vmelement*/ (":nuxt",_pp);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 364;BA.debugLine="Sub SetPaddingAll(p As String) As VMCarouselItem";
 //BA.debugLineNum = 365;BA.debugLine="CarouselItem.SetPaddingAll(p)";
_carouselitem._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 366;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 450;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMCar";
 //BA.debugLineNum = 451;BA.debugLine="CarouselItem.SetRC(sRow, sCol)";
_carouselitem._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 452;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 453;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setreplace(boolean _varreplace) throws Exception{
String _pp = "";
 //BA.debugLineNum = 214;BA.debugLine="Sub SetReplace(varReplace As Boolean) As VMCarouse";
 //BA.debugLineNum = 215;BA.debugLine="If varReplace = False Then Return Me";
if (_varreplace==__c.False) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 216;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 217;BA.debugLine="SetAttrSingle(\"replace\", varReplace)";
_setattrsingle("replace",BA.ObjectToString(_varreplace));
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 };
 //BA.debugLineNum = 220;BA.debugLine="Dim pp As String = $\"${ID}Replace\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Replace");
 //BA.debugLineNum = 221;BA.debugLine="vue.SetStateSingle(pp, varReplace)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreplace));
 //BA.debugLineNum = 222;BA.debugLine="CarouselItem.Bind(\":replace\", pp)";
_carouselitem._bind /*b4j.example.vmelement*/ (":replace",_pp);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setreversetransition(String _varreversetransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 227;BA.debugLine="Sub SetReverseTransition(varReverseTransition As S";
 //BA.debugLineNum = 228;BA.debugLine="If varReverseTransition = \"\" Then Return Me";
if ((_varreversetransition).equals("")) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 229;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 230;BA.debugLine="SetAttrSingle(\"reverse-transition\", varReverseTr";
_setattrsingle("reverse-transition",_varreversetransition);
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 };
 //BA.debugLineNum = 233;BA.debugLine="Dim pp As String = $\"${ID}ReverseTransition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ReverseTransition");
 //BA.debugLineNum = 234;BA.debugLine="vue.SetStateSingle(pp, varReverseTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreversetransition));
 //BA.debugLineNum = 235;BA.debugLine="CarouselItem.Bind(\":reverse-transition\", pp)";
_carouselitem._bind /*b4j.example.vmelement*/ (":reverse-transition",_pp);
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setripple(boolean _varripple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 240;BA.debugLine="Sub SetRipple(varRipple As Boolean) As VMCarouselI";
 //BA.debugLineNum = 241;BA.debugLine="If varRipple = False Then Return Me";
if (_varripple==__c.False) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 242;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 243;BA.debugLine="SetAttrSingle(\"ripple\", varRipple)";
_setattrsingle("ripple",BA.ObjectToString(_varripple));
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 };
 //BA.debugLineNum = 246;BA.debugLine="Dim pp As String = $\"${ID}Ripple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Ripple");
 //BA.debugLineNum = 247;BA.debugLine="vue.SetStateSingle(pp, varRipple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varripple));
 //BA.debugLineNum = 248;BA.debugLine="CarouselItem.Bind(\":ripple\", pp)";
_carouselitem._bind /*b4j.example.vmelement*/ (":ripple",_pp);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setsrc(String _src) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetSRC(src As String) As VMCarouselItem";
 //BA.debugLineNum = 196;BA.debugLine="SetAttrSingle(\"src\", src)";
_setattrsingle("src",_src);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetStatic(b As Boolean) As VMCarouselItem";
 //BA.debugLineNum = 25;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 26;BA.debugLine="CarouselItem.SetStatic(b)";
_carouselitem._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetStyle(sm As Map) As VMCarouselItem";
 //BA.debugLineNum = 87;BA.debugLine="CarouselItem.SetStyle(sm)";
_carouselitem._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 395;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 396;BA.debugLine="CarouselItem.SetStyleSingle(prop, value)";
_carouselitem._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 397;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 383;BA.debugLine="Sub SetTabIndex(ti As String) As VMCarouselItem";
 //BA.debugLineNum = 384;BA.debugLine="CarouselItem.SetTabIndex(ti)";
_carouselitem._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 385;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _settag(String _vartag) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetTag(varTag As String) As VMCarouselItem";
 //BA.debugLineNum = 254;BA.debugLine="If varTag = \"\" Then Return Me";
if ((_vartag).equals("")) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 255;BA.debugLine="SetAttrSingle(\"tag\", varTag)";
_setattrsingle("tag",_vartag);
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _settarget(String _vartarget) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetTarget(varTarget As String) As VMCarouselIt";
 //BA.debugLineNum = 261;BA.debugLine="If varTarget = \"\" Then Return Me";
if ((_vartarget).equals("")) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 262;BA.debugLine="SetAttrSingle(\"target\", varTarget)";
_setattrsingle("target",_vartarget);
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _settextcenter() throws Exception{
 //BA.debugLineNum = 482;BA.debugLine="Sub SetTextCenter As VMCarouselItem";
 //BA.debugLineNum = 483;BA.debugLine="CarouselItem.AddClass(\"text-center\")";
_carouselitem._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 484;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 485;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 505;BA.debugLine="Sub SetTextColor(varColor As String) As VMCarousel";
 //BA.debugLineNum = 506;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 507;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 508;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 509;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 510;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 513;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 514;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 515;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 516;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 517;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 518;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 519;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 520;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setto(String _varto) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub SetTo(varTo As String) As VMCarouselItem";
 //BA.debugLineNum = 268;BA.debugLine="If varTo = \"\" Then Return Me";
if ((_varto).equals("")) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 269;BA.debugLine="SetAttrSingle(\"to\", varTo)";
_setattrsingle("to",_varto);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _settransition(String _vartransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 274;BA.debugLine="Sub SetTransition(varTransition As String) As VMCa";
 //BA.debugLineNum = 275;BA.debugLine="If varTransition = \"\" Then Return Me";
if ((_vartransition).equals("")) { 
if (true) return (b4j.example.vmcarouselitem)(this);};
 //BA.debugLineNum = 276;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 277;BA.debugLine="SetAttrSingle(\"transition\", varTransition)";
_setattrsingle("transition",_vartransition);
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 };
 //BA.debugLineNum = 280;BA.debugLine="Dim pp As String = $\"${ID}Transition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Transition");
 //BA.debugLineNum = 281;BA.debugLine="vue.SetStateSingle(pp, varTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartransition));
 //BA.debugLineNum = 282;BA.debugLine="CarouselItem.Bind(\":transition\", pp)";
_carouselitem._bind /*b4j.example.vmelement*/ (":transition",_pp);
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetValue(varValue As String) As VMCarouselItem";
 //BA.debugLineNum = 288;BA.debugLine="CarouselItem.SetValue(varValue, False)";
_carouselitem._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Sub SetVElse(vif As String) As VMCarouselItem";
 //BA.debugLineNum = 413;BA.debugLine="CarouselItem.SetVElse(vif)";
_carouselitem._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 435;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 436;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 437;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 438;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 439;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 440;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 441;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 422;BA.debugLine="Sub SetVhtml(vhtml As String) As VMCarouselItem";
 //BA.debugLineNum = 423;BA.debugLine="CarouselItem.SetVHtml(vhtml)";
_carouselitem._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 424;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetVIf(vif As String) As VMCarouselItem";
 //BA.debugLineNum = 47;BA.debugLine="CarouselItem.SetVIf(vif)";
_carouselitem._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 498;BA.debugLine="Sub SetVisible(b As Boolean) As VMCarouselItem";
 //BA.debugLineNum = 499;BA.debugLine="CarouselItem.SetVisible(b)";
_carouselitem._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 500;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 501;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetVModel(k As String) As VMCarouselItem";
 //BA.debugLineNum = 42;BA.debugLine="CarouselItem.SetVModel(k)";
_carouselitem._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetVShow(vif As String) As VMCarouselItem";
 //BA.debugLineNum = 52;BA.debugLine="CarouselItem.SetVShow(vif)";
_carouselitem._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub SetVText(vhtml As String) As VMCarouselItem";
 //BA.debugLineNum = 418;BA.debugLine="CarouselItem.SetVText(vhtml)";
_carouselitem._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _show() throws Exception{
 //BA.debugLineNum = 300;BA.debugLine="Sub Show As VMCarouselItem";
 //BA.debugLineNum = 301;BA.debugLine="CarouselItem.SetVisible(True)";
_carouselitem._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 38;BA.debugLine="Return CarouselItem.ToString";
if (true) return _carouselitem._tostring /*String*/ ();
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcarouselitem  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 332;BA.debugLine="Sub UseTheme(themeName As String) As VMCarouselIte";
 //BA.debugLineNum = 333;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 334;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 335;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 336;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 337;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcarouselitem)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
