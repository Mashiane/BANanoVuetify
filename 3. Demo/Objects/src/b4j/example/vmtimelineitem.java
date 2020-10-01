package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtimelineitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtimelineitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtimelineitem.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _timelineitem = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public b4j.example.vmcontainer _container = null;
public b4j.example.vmavatar _avatar = null;
public boolean _hasavatar = false;
public b4j.example.vmcontainer _opposite = null;
public b4j.example.vmlabel _oppositetext = null;
public b4j.example.vmcard _card = null;
public boolean _usescard = false;
public b4j.example.vmcardtitle _cardtitle = null;
public b4j.example.vmcardsubtitle _cardsubtitle = null;
public b4j.example.vmcardtext _cardtext = null;
public b4j.example.vmcardactions _cardactions = null;
public b4j.example.vmcontainer _cardcontainer = null;
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
public b4j.example.vmtimelineitem  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 107;BA.debugLine="Sub AddChild(child As VMElement) As VMTimelineItem";
 //BA.debugLineNum = 108;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 109;BA.debugLine="TimeLineItem.SetText(childHTML)";
_timelineitem._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 143;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 144;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 145;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtimelineitem  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub AddClass(c As String) As VMTimelineItem";
 //BA.debugLineNum = 126;BA.debugLine="TimeLineItem.AddClass(c)";
_timelineitem._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 506;BA.debugLine="Sub AddComponent(comp As String) As VMTimelineItem";
 //BA.debugLineNum = 507;BA.debugLine="TimeLineItem.SetText(comp)";
_timelineitem._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 508;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 509;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 511;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 512;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 513;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtimelineitem  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 335;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 336;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 437;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 438;BA.debugLine="TimeLineItem.BindStyleSingle(prop, value)";
_timelineitem._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 439;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 440;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 516;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 517;BA.debugLine="TimeLineItem.BuildModel(mprops, mstyles, lclasses";
_timelineitem._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 518;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 519;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public TimeLineItem As VMElement";
_timelineitem = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean  'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
 //BA.debugLineNum = 11;BA.debugLine="Public Avatar As VMAvatar";
_avatar = new b4j.example.vmavatar();
 //BA.debugLineNum = 12;BA.debugLine="Private hasAvatar As Boolean";
_hasavatar = false;
 //BA.debugLineNum = 13;BA.debugLine="Public Opposite As VMContainer";
_opposite = new b4j.example.vmcontainer();
 //BA.debugLineNum = 14;BA.debugLine="Public OppositeText As VMLabel";
_oppositetext = new b4j.example.vmlabel();
 //BA.debugLineNum = 15;BA.debugLine="Public Card As VMCard";
_card = new b4j.example.vmcard();
 //BA.debugLineNum = 16;BA.debugLine="Public UsesCard As Boolean";
_usescard = false;
 //BA.debugLineNum = 17;BA.debugLine="Public CardTitle As VMCardTitle";
_cardtitle = new b4j.example.vmcardtitle();
 //BA.debugLineNum = 18;BA.debugLine="Public CardSubTitle As VMCardSubTitle";
_cardsubtitle = new b4j.example.vmcardsubtitle();
 //BA.debugLineNum = 19;BA.debugLine="Public CardText As VMCardText";
_cardtext = new b4j.example.vmcardtext();
 //BA.debugLineNum = 20;BA.debugLine="Public CardActions As VMCardActions";
_cardactions = new b4j.example.vmcardactions();
 //BA.debugLineNum = 21;BA.debugLine="Public CardContainer As VMContainer";
_cardcontainer = new b4j.example.vmcontainer();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtimelineitem  _disable() throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub Disable As VMTimelineItem";
 //BA.debugLineNum = 328;BA.debugLine="TimeLineItem.Disable(True)";
_timelineitem._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _enable() throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub Enable As VMTimelineItem";
 //BA.debugLineNum = 322;BA.debugLine="TimeLineItem.Enable(True)";
_timelineitem._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _hide() throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub Hide As VMTimelineItem";
 //BA.debugLineNum = 310;BA.debugLine="TimeLineItem.SetVisible(False)";
_timelineitem._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 26;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 27;BA.debugLine="TimeLineItem.Initialize(v, ID)";
_timelineitem._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 28;BA.debugLine="TimeLineItem.SetTag(\"v-timeline-item\")";
_timelineitem._settag /*b4j.example.vmelement*/ ("v-timeline-item");
 //BA.debugLineNum = 29;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 30;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 31;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 32;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 33;BA.debugLine="Container.Initialize(vue, $\"${ID}cont\"$, eventHan";
_container._initialize /*b4j.example.vmcontainer*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"cont"),_eventhandler);
 //BA.debugLineNum = 34;BA.debugLine="Avatar.Initialize(vue, $\"${ID}avt\"$, eventHandler";
_avatar._initialize /*b4j.example.vmavatar*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"avt"),_eventhandler);
 //BA.debugLineNum = 35;BA.debugLine="Opposite.Initialize(vue, $\"${ID}opp\"$, eventHandl";
_opposite._initialize /*b4j.example.vmcontainer*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"opp"),_eventhandler)._settag /*b4j.example.vmcontainer*/ ("template")._setslotopposite /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 36;BA.debugLine="OppositeText.Initialize(vue, $\"${ID}span\"$)";
_oppositetext._initialize /*b4j.example.vmlabel*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"span"));
 //BA.debugLineNum = 37;BA.debugLine="OppositeText.SetSpan";
_oppositetext._setspan /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 38;BA.debugLine="OppositeText.SetAttrSingle(\"slot\",\"opposite\")";
_oppositetext._setattrsingle /*b4j.example.vmlabel*/ ("slot","opposite");
 //BA.debugLineNum = 39;BA.debugLine="hasAvatar = False";
_hasavatar = __c.False;
 //BA.debugLineNum = 40;BA.debugLine="UsesCard = False";
_usescard = __c.False;
 //BA.debugLineNum = 41;BA.debugLine="Card.Initialize(vue, $\"${ID}card\"$,eventHandler)";
_card._initialize /*b4j.example.vmcard*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"card"),_eventhandler);
 //BA.debugLineNum = 42;BA.debugLine="CardTitle = Card.Title";
_cardtitle = _card._title /*b4j.example.vmcardtitle*/ ;
 //BA.debugLineNum = 43;BA.debugLine="CardSubTitle = Card.SubTitle";
_cardsubtitle = _card._subtitle /*b4j.example.vmcardsubtitle*/ ;
 //BA.debugLineNum = 44;BA.debugLine="CardText = Card.Text";
_cardtext = _card._text /*b4j.example.vmcardtext*/ ;
 //BA.debugLineNum = 45;BA.debugLine="CardActions = Card.Actions";
_cardactions = _card._actions /*b4j.example.vmcardactions*/ ;
 //BA.debugLineNum = 46;BA.debugLine="CardContainer = Card.Container";
_cardcontainer = _card._container /*b4j.example.vmcontainer*/ ;
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 121;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtimelineitem  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 373;BA.debugLine="public Sub RemoveAttr(sName As String) As VMTimeli";
 //BA.debugLineNum = 374;BA.debugLine="TimeLineItem.RemoveAttr(sName)";
_timelineitem._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub Render";
 //BA.debugLineNum = 103;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtimelineitem  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetAttr(attr As Map) As VMTimelineItem";
 //BA.debugLineNum = 132;BA.debugLine="TimeLineItem.SetAttr(attr)";
_timelineitem._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 457;BA.debugLine="Sub SetAttributes(attrs As List) As VMTimelineItem";
 //BA.debugLineNum = 458;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 459;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 461;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 341;BA.debugLine="Sub SetAttrLoose(loose As String) As VMTimelineIte";
 //BA.debugLineNum = 342;BA.debugLine="TimeLineItem.SetAttrLoose(loose)";
_timelineitem._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 343;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 431;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 432;BA.debugLine="TimeLineItem.SetAttrSingle(prop, value)";
_timelineitem._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 433;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setavatar(String _url) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetAvatar(url As String) As VMTimelineItem";
 //BA.debugLineNum = 58;BA.debugLine="Avatar.SetImage(url, \"\", Null, Null, Null)";
_avatar._setimage /*b4j.example.vmavatar*/ (_url,"",(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__c.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 59;BA.debugLine="hasAvatar = True";
_hasavatar = __c.True;
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 254;BA.debugLine="Sub SetColor(varColor As String) As VMTimelineItem";
 //BA.debugLineNum = 255;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtimelineitem)(this);};
 //BA.debugLineNum = 256;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 257;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 };
 //BA.debugLineNum = 260;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 261;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 262;BA.debugLine="TimeLineItem.Bind(\":color\", pp)";
_timelineitem._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 359;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 360;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmtimelineitem)(this);};
 //BA.debugLineNum = 361;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 362;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 363;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 };
 //BA.debugLineNum = 366;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 367;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 368;BA.debugLine="TimeLineItem.Bind(\":color\", pp)";
_timelineitem._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 369;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 150;BA.debugLine="Sub SetDark(varDark As Boolean) As VMTimelineItem";
 //BA.debugLineNum = 151;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmtimelineitem)(this);};
 //BA.debugLineNum = 152;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 153;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 };
 //BA.debugLineNum = 156;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 157;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 158;BA.debugLine="TimeLineItem.Bind(\":dark\", pp)";
_timelineitem._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 51;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMTimelineItem";
 //BA.debugLineNum = 392;BA.debugLine="TimeLineItem.SetDesignMode(b)";
_timelineitem._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 393;BA.debugLine="Container.SetDesignMode(b)";
_container._setdesignmode /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 394;BA.debugLine="Avatar.SetDesignMode(b)";
_avatar._setdesignmode /*b4j.example.vmavatar*/ (_b);
 //BA.debugLineNum = 395;BA.debugLine="Opposite.SetDesignMode(b)";
_opposite._setdesignmode /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 396;BA.debugLine="OppositeText.SetDesignMode(b)";
_oppositetext._setdesignmode /*b4j.example.vmlabel*/ (_b);
 //BA.debugLineNum = 397;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 486;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 487;BA.debugLine="TimeLineItem.SetDeviceOffsets(OS, OM, OL, OX)";
_timelineitem._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 488;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 493;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 494;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 495;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 496;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 500;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 501;BA.debugLine="TimeLineItem.SetDeviceSizes(SS, SM, SL, SX)";
_timelineitem._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 502;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 503;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setfilldot(boolean _varfilldot) throws Exception{
String _pp = "";
 //BA.debugLineNum = 163;BA.debugLine="Sub SetFillDot(varFillDot As Boolean) As VMTimelin";
 //BA.debugLineNum = 164;BA.debugLine="If varFillDot = False Then Return Me";
if (_varfilldot==__c.False) { 
if (true) return (b4j.example.vmtimelineitem)(this);};
 //BA.debugLineNum = 165;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 166;BA.debugLine="SetAttrSingle(\"fill-dot\", varFillDot)";
_setattrsingle("fill-dot",BA.ObjectToString(_varfilldot));
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 };
 //BA.debugLineNum = 169;BA.debugLine="Dim pp As String = $\"${ID}FillDot\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"FillDot");
 //BA.debugLineNum = 170;BA.debugLine="vue.SetStateSingle(pp, varFillDot)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfilldot));
 //BA.debugLineNum = 171;BA.debugLine="TimeLineItem.Bind(\":fill-dot\", pp)";
_timelineitem._bind /*b4j.example.vmelement*/ (":fill-dot",_pp);
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _sethidedot(boolean _varhidedot) throws Exception{
String _pp = "";
 //BA.debugLineNum = 176;BA.debugLine="Sub SetHideDot(varHideDot As Boolean) As VMTimelin";
 //BA.debugLineNum = 177;BA.debugLine="If varHideDot = False Then Return Me";
if (_varhidedot==__c.False) { 
if (true) return (b4j.example.vmtimelineitem)(this);};
 //BA.debugLineNum = 178;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 179;BA.debugLine="SetAttrSingle(\"hide-dot\", varHideDot)";
_setattrsingle("hide-dot",BA.ObjectToString(_varhidedot));
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 };
 //BA.debugLineNum = 182;BA.debugLine="Dim pp As String = $\"${ID}HideDot\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideDot");
 //BA.debugLineNum = 183;BA.debugLine="vue.SetStateSingle(pp, varHideDot)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhidedot));
 //BA.debugLineNum = 184;BA.debugLine="TimeLineItem.Bind(\":hide-dot\", pp)";
_timelineitem._bind /*b4j.example.vmelement*/ (":hide-dot",_pp);
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _seticon(String _varicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 267;BA.debugLine="Sub SetIcon(varIcon As String) As VMTimelineItem";
 //BA.debugLineNum = 268;BA.debugLine="If varIcon = \"\" Then Return Me";
if ((_varicon).equals("")) { 
if (true) return (b4j.example.vmtimelineitem)(this);};
 //BA.debugLineNum = 269;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 270;BA.debugLine="SetAttrSingle(\"icon\", varIcon)";
_setattrsingle("icon",_varicon);
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 };
 //BA.debugLineNum = 273;BA.debugLine="Dim pp As String = $\"${ID}Icon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Icon");
 //BA.debugLineNum = 274;BA.debugLine="vue.SetStateSingle(pp, varIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varicon));
 //BA.debugLineNum = 275;BA.debugLine="TimeLineItem.Bind(\":icon\", pp)";
_timelineitem._bind /*b4j.example.vmelement*/ (":icon",_pp);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _seticoncolor(String _variconcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 280;BA.debugLine="Sub SetIconColor(varIconColor As String) As VMTime";
 //BA.debugLineNum = 281;BA.debugLine="If varIconColor = \"\" Then Return Me";
if ((_variconcolor).equals("")) { 
if (true) return (b4j.example.vmtimelineitem)(this);};
 //BA.debugLineNum = 282;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 283;BA.debugLine="SetAttrSingle(\"icon-color\", varIconColor)";
_setattrsingle("icon-color",_variconcolor);
 //BA.debugLineNum = 284;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 };
 //BA.debugLineNum = 286;BA.debugLine="Dim pp As String = $\"${ID}IconColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"IconColor");
 //BA.debugLineNum = 287;BA.debugLine="vue.SetStateSingle(pp, varIconColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_variconcolor));
 //BA.debugLineNum = 288;BA.debugLine="TimeLineItem.Bind(\":icon-color\", pp)";
_timelineitem._bind /*b4j.example.vmelement*/ (":icon-color",_pp);
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _seticoncolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 294;BA.debugLine="Sub SetIconColorIntensity(color As String, intensi";
 //BA.debugLineNum = 295;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmtimelineitem)(this);};
 //BA.debugLineNum = 296;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 297;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 298;BA.debugLine="SetAttrSingle(\"icon-color\", scolor)";
_setattrsingle("icon-color",_scolor);
 //BA.debugLineNum = 299;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 };
 //BA.debugLineNum = 301;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 302;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 303;BA.debugLine="TimeLineItem.Bind(\":icon-color\", pp)";
_timelineitem._bind /*b4j.example.vmelement*/ (":icon-color",_pp);
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 473;BA.debugLine="Sub SetKey(k As String) As VMTimelineItem";
 //BA.debugLineNum = 474;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 475;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 476;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 477;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setlarge(boolean _varlarge) throws Exception{
String _pp = "";
 //BA.debugLineNum = 189;BA.debugLine="Sub SetLarge(varLarge As Boolean) As VMTimelineIte";
 //BA.debugLineNum = 190;BA.debugLine="If varLarge = False Then Return Me";
if (_varlarge==__c.False) { 
if (true) return (b4j.example.vmtimelineitem)(this);};
 //BA.debugLineNum = 191;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 192;BA.debugLine="SetAttrSingle(\"large\", varLarge)";
_setattrsingle("large",BA.ObjectToString(_varlarge));
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 };
 //BA.debugLineNum = 195;BA.debugLine="Dim pp As String = $\"${ID}Large\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Large");
 //BA.debugLineNum = 196;BA.debugLine="vue.SetStateSingle(pp, varLarge)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlarge));
 //BA.debugLineNum = 197;BA.debugLine="TimeLineItem.Bind(\":large\", pp)";
_timelineitem._bind /*b4j.example.vmelement*/ (":large",_pp);
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setleft(boolean _varleft) throws Exception{
String _pp = "";
 //BA.debugLineNum = 202;BA.debugLine="Sub SetLeft(varLeft As Boolean) As VMTimelineItem";
 //BA.debugLineNum = 203;BA.debugLine="If varLeft = False Then Return Me";
if (_varleft==__c.False) { 
if (true) return (b4j.example.vmtimelineitem)(this);};
 //BA.debugLineNum = 204;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 205;BA.debugLine="SetAttrSingle(\"left\", varLeft)";
_setattrsingle("left",BA.ObjectToString(_varleft));
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 };
 //BA.debugLineNum = 208;BA.debugLine="Dim pp As String = $\"${ID}Left\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Left");
 //BA.debugLineNum = 209;BA.debugLine="vue.SetStateSingle(pp, varLeft)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varleft));
 //BA.debugLineNum = 210;BA.debugLine="TimeLineItem.Bind(\":left\", pp)";
_timelineitem._bind /*b4j.example.vmelement*/ (":left",_pp);
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 215;BA.debugLine="Sub SetLight(varLight As Boolean) As VMTimelineIte";
 //BA.debugLineNum = 216;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmtimelineitem)(this);};
 //BA.debugLineNum = 217;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 218;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 };
 //BA.debugLineNum = 221;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 222;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 223;BA.debugLine="TimeLineItem.Bind(\":light\", pp)";
_timelineitem._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 385;BA.debugLine="Sub SetMarginAll(p As String) As VMTimelineItem";
 //BA.debugLineNum = 386;BA.debugLine="TimeLineItem.setmarginall(p)";
_timelineitem._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 419;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 420;BA.debugLine="TimeLineItem.SetName(varName, bbind)";
_timelineitem._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 421;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 422;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Sub SetPaddingAll(p As String) As VMTimelineItem";
 //BA.debugLineNum = 380;BA.debugLine="TimeLineItem.SetPaddingAll(p)";
_timelineitem._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 381;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 480;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMTim";
 //BA.debugLineNum = 481;BA.debugLine="TimeLineItem.SetRC(sRow, sCol)";
_timelineitem._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 483;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setright(boolean _varright) throws Exception{
String _pp = "";
 //BA.debugLineNum = 228;BA.debugLine="Sub SetRight(varRight As Boolean) As VMTimelineIte";
 //BA.debugLineNum = 229;BA.debugLine="If varRight = False Then Return Me";
if (_varright==__c.False) { 
if (true) return (b4j.example.vmtimelineitem)(this);};
 //BA.debugLineNum = 230;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 231;BA.debugLine="SetAttrSingle(\"right\", varRight)";
_setattrsingle("right",BA.ObjectToString(_varright));
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 };
 //BA.debugLineNum = 234;BA.debugLine="Dim pp As String = $\"${ID}Right\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Right");
 //BA.debugLineNum = 235;BA.debugLine="vue.SetStateSingle(pp, varRight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varright));
 //BA.debugLineNum = 236;BA.debugLine="TimeLineItem.Bind(\":right\", pp)";
_timelineitem._bind /*b4j.example.vmelement*/ (":right",_pp);
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setsmall(boolean _varsmall) throws Exception{
String _pp = "";
 //BA.debugLineNum = 241;BA.debugLine="Sub SetSmall(varSmall As Boolean) As VMTimelineIte";
 //BA.debugLineNum = 242;BA.debugLine="If varSmall = False Then Return Me";
if (_varsmall==__c.False) { 
if (true) return (b4j.example.vmtimelineitem)(this);};
 //BA.debugLineNum = 243;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 244;BA.debugLine="SetAttrSingle(\"small\", varSmall)";
_setattrsingle("small",BA.ObjectToString(_varsmall));
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 };
 //BA.debugLineNum = 247;BA.debugLine="Dim pp As String = $\"${ID}Small\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Small");
 //BA.debugLineNum = 248;BA.debugLine="vue.SetStateSingle(pp, varSmall)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsmall));
 //BA.debugLineNum = 249;BA.debugLine="TimeLineItem.Bind(\":small\", pp)";
_timelineitem._bind /*b4j.example.vmelement*/ (":small",_pp);
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 402;BA.debugLine="Sub SetStatic(b As Boolean) As VMTimelineItem";
 //BA.debugLineNum = 403;BA.debugLine="TimeLineItem.SetStatic(b)";
_timelineitem._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 404;BA.debugLine="Container.SetStatic(b)";
_container._setstatic /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 405;BA.debugLine="Avatar.SetStatic(b)";
_avatar._setstatic /*b4j.example.vmavatar*/ (_b);
 //BA.debugLineNum = 406;BA.debugLine="Opposite.SetStatic(b)";
_opposite._setstatic /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 407;BA.debugLine="OppositeText.SetStatic(b)";
_oppositetext._setstatic /*b4j.example.vmlabel*/ (_b);
 //BA.debugLineNum = 408;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetStyle(sm As Map) As VMTimelineItem";
 //BA.debugLineNum = 138;BA.debugLine="TimeLineItem.SetStyle(sm)";
_timelineitem._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 425;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 426;BA.debugLine="TimeLineItem.SetStyleSingle(prop, value)";
_timelineitem._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 427;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 413;BA.debugLine="Sub SetTabIndex(ti As String) As VMTimelineItem";
 //BA.debugLineNum = 414;BA.debugLine="TimeLineItem.SetTabIndex(ti)";
_timelineitem._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 415;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _settext(String _t) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetText(t As String) As VMTimelineItem";
 //BA.debugLineNum = 115;BA.debugLine="TimeLineItem.SetText(t)";
_timelineitem._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 442;BA.debugLine="Sub SetVElse(vif As String) As VMTimelineItem";
 //BA.debugLineNum = 443;BA.debugLine="TimeLineItem.SetVElse(vif)";
_timelineitem._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 444;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 465;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 466;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 467;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 468;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 469;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 470;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 471;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 452;BA.debugLine="Sub SetVhtml(vhtml As String) As VMTimelineItem";
 //BA.debugLineNum = 453;BA.debugLine="TimeLineItem.SetVHtml(vhtml)";
_timelineitem._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 454;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 455;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetVIf(vif As String) As VMTimelineItem";
 //BA.debugLineNum = 92;BA.debugLine="TimeLineItem.SetVIf(vif)";
_timelineitem._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 522;BA.debugLine="Sub SetVisible(b As Boolean) As VMTimelineItem";
 //BA.debugLineNum = 523;BA.debugLine="TimeLineItem.SetVisible(b)";
_timelineitem._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 524;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetVModel(k As String) As VMTimelineItem";
 //BA.debugLineNum = 87;BA.debugLine="TimeLineItem.SetVModel(k)";
_timelineitem._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetVShow(vif As String) As VMTimelineItem";
 //BA.debugLineNum = 97;BA.debugLine="TimeLineItem.SetVShow(vif)";
_timelineitem._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 447;BA.debugLine="Sub SetVText(vhtml As String) As VMTimelineItem";
 //BA.debugLineNum = 448;BA.debugLine="TimeLineItem.SetVText(vhtml)";
_timelineitem._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 449;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 450;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimelineitem  _show() throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub Show As VMTimelineItem";
 //BA.debugLineNum = 316;BA.debugLine="TimeLineItem.SetVisible(True)";
_timelineitem._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
b4j.example.vmtemplate _tmp = null;
 //BA.debugLineNum = 64;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 66;BA.debugLine="If hasAvatar Then";
if (_hasavatar) { 
 //BA.debugLineNum = 67;BA.debugLine="Dim tmp As VMTemplate";
_tmp = new b4j.example.vmtemplate();
 //BA.debugLineNum = 68;BA.debugLine="tmp.Initialize(vue, \"\", Module).SetSlotIcon";
_tmp._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",_module)._setsloticon /*b4j.example.vmtemplate*/ ();
 //BA.debugLineNum = 69;BA.debugLine="tmp.AddComponent(Avatar.ToString)";
_tmp._addcomponent /*b4j.example.vmtemplate*/ (_avatar._tostring /*String*/ ());
 //BA.debugLineNum = 70;BA.debugLine="AddComponent(tmp.ToString)";
_addcomponent(_tmp._tostring /*String*/ ());
 };
 //BA.debugLineNum = 72;BA.debugLine="AddComponent(OppositeText.ToString)";
_addcomponent(_oppositetext._tostring /*String*/ ());
 //BA.debugLineNum = 73;BA.debugLine="If Opposite.HasContent Then";
if (_opposite._hascontent /*boolean*/ ) { 
 //BA.debugLineNum = 74;BA.debugLine="AddComponent(Opposite.ToString)";
_addcomponent(_opposite._tostring /*String*/ ());
 };
 //BA.debugLineNum = 77;BA.debugLine="If Container.HasContent Then";
if (_container._hascontent /*boolean*/ ) { 
 //BA.debugLineNum = 78;BA.debugLine="AddComponent(Container.ToString)";
_addcomponent(_container._tostring /*String*/ ());
 };
 //BA.debugLineNum = 80;BA.debugLine="If UsesCard Then";
if (_usescard) { 
 //BA.debugLineNum = 81;BA.debugLine="AddComponent(Card.ToString)";
_addcomponent(_card._tostring /*String*/ ());
 };
 //BA.debugLineNum = 83;BA.debugLine="Return TimeLineItem.ToString";
if (true) return _timelineitem._tostring /*String*/ ();
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtimelineitem  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 347;BA.debugLine="Sub UseTheme(themeName As String) As VMTimelineIte";
 //BA.debugLineNum = 348;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 349;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 350;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 351;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 352;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimelineitem)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
