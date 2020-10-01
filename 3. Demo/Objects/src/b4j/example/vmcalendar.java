package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcalendar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmcalendar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcalendar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _calendar = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public String _focus = "";
public anywheresoftware.b4a.objects.collections.List _events = null;
public String _eventsname = "";
public anywheresoftware.b4a.objects.collections.List _categories = null;
public String _categoryname = "";
public anywheresoftware.b4a.objects.collections.Map _catmap = null;
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
public String  _addcategory(String _catname,String _catcolor) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub AddCategory(catName As String, catColor As Str";
 //BA.debugLineNum = 83;BA.debugLine="categories.Add(catName)";
_categories.Add((Object)(_catname));
 //BA.debugLineNum = 84;BA.debugLine="catmap.Put(catName, catColor)";
_catmap.Put((Object)(_catname),(Object)(_catcolor));
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcalendar  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 188;BA.debugLine="Sub AddChild(child As VMElement) As VMCalendar";
 //BA.debugLineNum = 189;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 190;BA.debugLine="Calendar.SetText(childHTML)";
_calendar._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 224;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 225;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 226;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcalendar  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub AddClass(c As String) As VMCalendar";
 //BA.debugLineNum = 207;BA.debugLine="Calendar.AddClass(c)";
_calendar._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 1088;BA.debugLine="Sub AddComponent(comp As String) As VMCalendar";
 //BA.debugLineNum = 1089;BA.debugLine="Calendar.SetText(comp)";
_calendar._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 1090;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1091;BA.debugLine="End Sub";
return null;
}
public String  _addevent(String _eid,String _ecategory,String _ename,String _estartdt,String _eenddt,boolean _eallday) throws Exception{
String _catcolor = "";
anywheresoftware.b4a.objects.collections.Map _em = null;
 //BA.debugLineNum = 58;BA.debugLine="Sub AddEvent(eID As String, eCategory As String, e";
 //BA.debugLineNum = 59;BA.debugLine="Dim catColor As String";
_catcolor = "";
 //BA.debugLineNum = 60;BA.debugLine="If catmap.ContainsKey(eCategory) Then";
if (_catmap.ContainsKey((Object)(_ecategory))) { 
 //BA.debugLineNum = 61;BA.debugLine="catColor = catmap.Get(eCategory)";
_catcolor = BA.ObjectToString(_catmap.Get((Object)(_ecategory)));
 }else {
 //BA.debugLineNum = 63;BA.debugLine="catColor = \"primary\"";
_catcolor = "primary";
 };
 //BA.debugLineNum = 65;BA.debugLine="Dim em As Map = CreateMap()";
_em = new anywheresoftware.b4a.objects.collections.Map();
_em = __c.createMap(new Object[] {});
 //BA.debugLineNum = 66;BA.debugLine="em.Put(\"id\", eID)";
_em.Put((Object)("id"),(Object)(_eid));
 //BA.debugLineNum = 67;BA.debugLine="em.Put(\"name\", eName)";
_em.Put((Object)("name"),(Object)(_ename));
 //BA.debugLineNum = 68;BA.debugLine="em.Put(\"start\", eStartDT)";
_em.Put((Object)("start"),(Object)(_estartdt));
 //BA.debugLineNum = 69;BA.debugLine="em.Put(\"end\", eEndDT)";
_em.Put((Object)("end"),(Object)(_eenddt));
 //BA.debugLineNum = 70;BA.debugLine="em.put(\"color\", catColor)";
_em.Put((Object)("color"),(Object)(_catcolor));
 //BA.debugLineNum = 71;BA.debugLine="em.Put(\"timed\", eAllDay)";
_em.Put((Object)("timed"),(Object)(_eallday));
 //BA.debugLineNum = 72;BA.debugLine="em.Put(\"category\", eCategory)";
_em.Put((Object)("category"),(Object)(_ecategory));
 //BA.debugLineNum = 73;BA.debugLine="events.Add(em)";
_events.Add((Object)(_em.getObject()));
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 1099;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 1100;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 1101;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcalendar  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 924;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 925;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 926;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 927;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 928;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1019;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 1020;BA.debugLine="Calendar.BindStyleSingle(prop, value)";
_calendar._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 1021;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1022;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 1104;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 1105;BA.debugLine="Calendar.BuildModel(mprops, mstyles, lclasses, lo";
_calendar._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 1106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1107;BA.debugLine="End Sub";
return null;
}
public String  _checkchange() throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub CheckChange";
 //BA.debugLineNum = 108;BA.debugLine="vue.refs.GetField(ID).RunMethod(\"checkChange\", Nu";
_vue._refs /*com.ab.banano.BANanoObject*/ .GetField(_id).RunMethod("checkChange",__c.Null);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Calendar As VMElement";
_calendar = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean   'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object   'ignore";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean   'ignore";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="Private focus As String";
_focus = "";
 //BA.debugLineNum = 11;BA.debugLine="Private events As List";
_events = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Private eventsName As String";
_eventsname = "";
 //BA.debugLineNum = 13;BA.debugLine="Private categories As List";
_categories = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 14;BA.debugLine="Private categoryName As String";
_categoryname = "";
 //BA.debugLineNum = 15;BA.debugLine="Private catmap As Map";
_catmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public String  _clearcategories() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub ClearCategories";
 //BA.debugLineNum = 77;BA.debugLine="categories.Clear";
_categories.Clear();
 //BA.debugLineNum = 78;BA.debugLine="vue.SetData(categoryName, categories)";
_vue._setdata /*b4j.example.bananovue*/ (_categoryname,(Object)(_categories.getObject()));
 //BA.debugLineNum = 79;BA.debugLine="catmap.clear";
_catmap.Clear();
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _clearevents() throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub ClearEvents";
 //BA.debugLineNum = 134;BA.debugLine="events.clear";
_events.Clear();
 //BA.debugLineNum = 135;BA.debugLine="vue.SetData(eventsName, events)";
_vue._setdata /*b4j.example.bananovue*/ (_eventsname,(Object)(_events.getObject()));
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public String  _dayview() throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub DayView";
 //BA.debugLineNum = 93;BA.debugLine="SetType(\"day\")";
_settype("day");
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcalendar  _disable() throws Exception{
 //BA.debugLineNum = 917;BA.debugLine="Sub Disable As VMCalendar";
 //BA.debugLineNum = 918;BA.debugLine="Calendar.Enable(False)";
_calendar._enable /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 919;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 920;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _enable() throws Exception{
 //BA.debugLineNum = 911;BA.debugLine="Sub Enable As VMCalendar";
 //BA.debugLineNum = 912;BA.debugLine="Calendar.Enable(True)";
_calendar._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 913;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 914;BA.debugLine="End Sub";
return null;
}
public String  _geteventcolor(anywheresoftware.b4a.objects.collections.Map _e) throws Exception{
String _ecolor = "";
 //BA.debugLineNum = 53;BA.debugLine="Sub geteventcolor(e As Map) As String";
 //BA.debugLineNum = 54;BA.debugLine="Dim ecolor As String = e.Get(\"color\")";
_ecolor = BA.ObjectToString(_e.Get((Object)("color")));
 //BA.debugLineNum = 55;BA.debugLine="Return ecolor";
if (true) return _ecolor;
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _gettitle() throws Exception{
String _stitle = "";
 //BA.debugLineNum = 101;BA.debugLine="Sub GetTitle As String";
 //BA.debugLineNum = 102;BA.debugLine="Dim sTitle As String = vue.refs.GetField(ID).GetF";
_stitle = BA.ObjectToString(_vue._refs /*com.ab.banano.BANanoObject*/ .GetField(_id).GetField("title").Result());
 //BA.debugLineNum = 103;BA.debugLine="Return sTitle";
if (true) return _stitle;
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcalendar  _hide() throws Exception{
 //BA.debugLineNum = 899;BA.debugLine="Sub Hide As VMCalendar";
 //BA.debugLineNum = 900;BA.debugLine="Calendar.SetVisible(False)";
_calendar._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 901;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 902;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 20;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 21;BA.debugLine="Calendar.Initialize(v, ID)";
_calendar._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 22;BA.debugLine="Calendar.SetTag(\"v-calendar\")";
_calendar._settag /*b4j.example.vmelement*/ ("v-calendar");
 //BA.debugLineNum = 23;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 24;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 26;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 27;BA.debugLine="focus = $\"${ID}focus\"$";
_focus = (""+__c.SmartStringFormatter("",(Object)(_id))+"focus");
 //BA.debugLineNum = 28;BA.debugLine="SetVModel(focus)";
_setvmodel(_focus);
 //BA.debugLineNum = 29;BA.debugLine="vue.SetData(focus, \"\")";
_vue._setdata /*b4j.example.bananovue*/ (_focus,(Object)(""));
 //BA.debugLineNum = 30;BA.debugLine="events = vue.newlist";
_events = _vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 31;BA.debugLine="SetType(\"month\")";
_settype("month");
 //BA.debugLineNum = 32;BA.debugLine="SetOnChange";
_setonchange();
 //BA.debugLineNum = 33;BA.debugLine="SetOnClickDate";
_setonclickdate();
 //BA.debugLineNum = 34;BA.debugLine="SetOnClickMore";
_setonclickmore();
 //BA.debugLineNum = 35;BA.debugLine="SetOnClickEvent";
_setonclickevent();
 //BA.debugLineNum = 36;BA.debugLine="eventsName = $\"${ID}events\"$";
_eventsname = (""+__c.SmartStringFormatter("",(Object)(_id))+"events");
 //BA.debugLineNum = 37;BA.debugLine="categoryName = $\"${ID}categories\"$";
_categoryname = (""+__c.SmartStringFormatter("",(Object)(_id))+"categories");
 //BA.debugLineNum = 38;BA.debugLine="categories.Initialize";
_categories.Initialize();
 //BA.debugLineNum = 39;BA.debugLine="SetCategories(categories)";
_setcategories(_categories);
 //BA.debugLineNum = 40;BA.debugLine="SetEvents(events)";
_setevents(_events);
 //BA.debugLineNum = 41;BA.debugLine="catmap.Initialize";
_catmap.Initialize();
 //BA.debugLineNum = 42;BA.debugLine="SetAttrSingle(\":event-color\", \"geteventcolor\")";
_setattrsingle(":event-color","geteventcolor");
 //BA.debugLineNum = 43;BA.debugLine="vue.SetMethod(Me, \"geteventcolor\")";
_vue._setmethod /*b4j.example.bananovue*/ (this,"geteventcolor");
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public String  _monthview() throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub MonthView";
 //BA.debugLineNum = 97;BA.debugLine="SetType(\"month\")";
_settype("month");
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 202;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcalendar  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 963;BA.debugLine="public Sub RemoveAttr(sName As String) As VMCalend";
 //BA.debugLineNum = 964;BA.debugLine="Calendar.RemoveAttr(sName)";
_calendar._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 965;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 966;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub Render";
 //BA.debugLineNum = 184;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return "";
}
public String  _selectdate(Object _seldate) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SelectDate(selDate As Object)";
 //BA.debugLineNum = 123;BA.debugLine="vue.SetData(focus, selDate)";
_vue._setdata /*b4j.example.bananovue*/ (_focus,_seldate);
 //BA.debugLineNum = 124;BA.debugLine="SetType(\"day\")";
_settype("day");
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public String  _selecttoday() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SelectToday";
 //BA.debugLineNum = 129;BA.debugLine="vue.SetData(focus, \"\")";
_vue._setdata /*b4j.example.bananovue*/ (_focus,(Object)(""));
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcalendar  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub SetAttr(attr As Map) As VMCalendar";
 //BA.debugLineNum = 213;BA.debugLine="Calendar.SetAttr(attr)";
_calendar._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 1039;BA.debugLine="Sub SetAttributes(attrs As List) As VMCalendar";
 //BA.debugLineNum = 1040;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1041;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 1043;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1044;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 931;BA.debugLine="Sub SetAttrLoose(loose As String) As VMCalendar";
 //BA.debugLineNum = 932;BA.debugLine="Calendar.SetAttrLoose(loose)";
_calendar._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 933;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 934;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1013;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 1014;BA.debugLine="Calendar.SetAttrSingle(prop, value)";
_calendar._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 1015;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1016;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setcategories(anywheresoftware.b4a.objects.collections.List _varcategories) throws Exception{
String _pp = "";
 //BA.debugLineNum = 231;BA.debugLine="Sub SetCategories(varCategories As List) As VMCale";
 //BA.debugLineNum = 232;BA.debugLine="Dim pp As String = $\"${ID}Categories\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Categories");
 //BA.debugLineNum = 233;BA.debugLine="vue.SetStateSingle(pp, varCategories)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcategories.getObject()));
 //BA.debugLineNum = 234;BA.debugLine="Calendar.Bind(\":categories\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":categories",_pp);
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setcategorydays(String _varcategorydays) throws Exception{
String _pp = "";
 //BA.debugLineNum = 239;BA.debugLine="Sub SetCategoryDays(varCategoryDays As String) As";
 //BA.debugLineNum = 240;BA.debugLine="If varCategoryDays = \"\" Then Return Me";
if ((_varcategorydays).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 241;BA.debugLine="If varCategoryDays = \"1\" Then Return Me";
if ((_varcategorydays).equals("1")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 242;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 243;BA.debugLine="SetAttrSingle(\"category-days\", varCategoryDays)";
_setattrsingle("category-days",_varcategorydays);
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 246;BA.debugLine="Dim pp As String = $\"${ID}CategoryDays\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CategoryDays");
 //BA.debugLineNum = 247;BA.debugLine="vue.SetStateSingle(pp, varCategoryDays)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcategorydays));
 //BA.debugLineNum = 248;BA.debugLine="Calendar.Bind(\":category-days\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":category-days",_pp);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setcategoryforinvalid(String _varcategoryforinvalid) throws Exception{
String _pp = "";
 //BA.debugLineNum = 253;BA.debugLine="Sub SetCategoryForInvalid(varCategoryForInvalid As";
 //BA.debugLineNum = 254;BA.debugLine="If varCategoryForInvalid = \"\" Then Return Me";
if ((_varcategoryforinvalid).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 255;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 256;BA.debugLine="SetAttrSingle(\"category-for-invalid\", varCategor";
_setattrsingle("category-for-invalid",_varcategoryforinvalid);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 259;BA.debugLine="Dim pp As String = $\"${ID}CategoryForInvalid\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CategoryForInvalid");
 //BA.debugLineNum = 260;BA.debugLine="vue.SetStateSingle(pp, varCategoryForInvalid)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcategoryforinvalid));
 //BA.debugLineNum = 261;BA.debugLine="Calendar.Bind(\":category-for-invalid\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":category-for-invalid",_pp);
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setcategoryhidedynamic(boolean _varcategoryhidedynamic) throws Exception{
String _pp = "";
 //BA.debugLineNum = 715;BA.debugLine="Sub SetCategoryHideDynamic(varCategoryHideDynamic";
 //BA.debugLineNum = 716;BA.debugLine="If varCategoryHideDynamic = False Then Return Me";
if (_varcategoryhidedynamic==__c.False) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 717;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 718;BA.debugLine="SetAttrSingle(\"category-hide-dynamic\", varCatego";
_setattrsingle("category-hide-dynamic",BA.ObjectToString(_varcategoryhidedynamic));
 //BA.debugLineNum = 719;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 721;BA.debugLine="Dim pp As String = $\"${ID}CategoryHideDynamic\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CategoryHideDynamic");
 //BA.debugLineNum = 722;BA.debugLine="vue.SetStateSingle(pp, varCategoryHideDynamic)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcategoryhidedynamic));
 //BA.debugLineNum = 723;BA.debugLine="Calendar.Bind(\":category-hide-dynamic\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":category-hide-dynamic",_pp);
 //BA.debugLineNum = 724;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 725;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setcategoryshowall(boolean _varcategoryshowall) throws Exception{
String _pp = "";
 //BA.debugLineNum = 728;BA.debugLine="Sub SetCategoryShowAll(varCategoryShowAll As Boole";
 //BA.debugLineNum = 729;BA.debugLine="If varCategoryShowAll = False Then Return Me";
if (_varcategoryshowall==__c.False) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 730;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 731;BA.debugLine="SetAttrSingle(\"category-show-all\", varCategorySh";
_setattrsingle("category-show-all",BA.ObjectToString(_varcategoryshowall));
 //BA.debugLineNum = 732;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 734;BA.debugLine="Dim pp As String = $\"${ID}CategoryShowAll\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CategoryShowAll");
 //BA.debugLineNum = 735;BA.debugLine="vue.SetStateSingle(pp, varCategoryShowAll)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcategoryshowall));
 //BA.debugLineNum = 736;BA.debugLine="Calendar.Bind(\":category-show-all\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":category-show-all",_pp);
 //BA.debugLineNum = 737;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 738;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 266;BA.debugLine="Sub SetColor(varColor As String) As VMCalendar";
 //BA.debugLineNum = 267;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 268;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 269;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 272;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 273;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 274;BA.debugLine="Calendar.Bind(\":color\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 949;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 950;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 951;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 952;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 953;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 954;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 956;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 957;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 958;BA.debugLine="Calendar.Bind(\":color\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 959;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 960;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 741;BA.debugLine="Sub SetDark(varDark As Boolean) As VMCalendar";
 //BA.debugLineNum = 742;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 743;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 744;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 745;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 747;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 748;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 749;BA.debugLine="Calendar.Bind(\":dark\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 750;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 751;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 48;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setdayformat(anywheresoftware.b4a.objects.collections.List _vardayformat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 871;BA.debugLine="Sub SetDayFormat(varDayFormat As List) As VMCalend";
 //BA.debugLineNum = 872;BA.debugLine="If bStatic Then Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 873;BA.debugLine="Dim pp As String = $\"${ID}DayFormat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DayFormat");
 //BA.debugLineNum = 874;BA.debugLine="vue.SetStateSingle(pp, varDayFormat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardayformat.getObject()));
 //BA.debugLineNum = 875;BA.debugLine="Calendar.Bind(\":day-format\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":day-format",_pp);
 //BA.debugLineNum = 876;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 877;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 981;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMCalendar";
 //BA.debugLineNum = 982;BA.debugLine="Calendar.SetDesignMode(b)";
_calendar._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 983;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 984;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 985;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 1068;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 1069;BA.debugLine="Calendar.SetDeviceOffsets(OS, OM, OL, OX)";
_calendar._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 1070;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1071;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 1075;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 1076;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 1077;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 1078;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1079;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 1082;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 1083;BA.debugLine="Calendar.SetDeviceSizes(SS, SM, SL, SX)";
_calendar._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 1084;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1085;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setend(String _varend) throws Exception{
String _pp = "";
 //BA.debugLineNum = 279;BA.debugLine="Sub SetEnd(varEnd As String) As VMCalendar";
 //BA.debugLineNum = 280;BA.debugLine="If varEnd = \"\" Then Return Me";
if ((_varend).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 281;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 282;BA.debugLine="SetAttrSingle(\"end\", varEnd)";
_setattrsingle("end",_varend);
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 285;BA.debugLine="Dim pp As String = $\"${ID}End\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"End");
 //BA.debugLineNum = 286;BA.debugLine="vue.SetStateSingle(pp, varEnd)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varend));
 //BA.debugLineNum = 287;BA.debugLine="Calendar.Bind(\":end\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":end",_pp);
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _seteventcategory(String _vareventcategory) throws Exception{
String _pp = "";
 //BA.debugLineNum = 292;BA.debugLine="Sub SetEventCategory(varEventCategory As String) A";
 //BA.debugLineNum = 293;BA.debugLine="If varEventCategory = \"\" Then Return Me";
if ((_vareventcategory).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 294;BA.debugLine="If varEventCategory = \"category\" Then Return Me";
if ((_vareventcategory).equals("category")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 295;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 296;BA.debugLine="SetAttrSingle(\"event-category\", varEventCategory";
_setattrsingle("event-category",_vareventcategory);
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 299;BA.debugLine="Dim pp As String = $\"${ID}EventCategory\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"EventCategory");
 //BA.debugLineNum = 300;BA.debugLine="vue.SetStateSingle(pp, varEventCategory)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareventcategory));
 //BA.debugLineNum = 301;BA.debugLine="Calendar.Bind(\":event-category\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":event-category",_pp);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _seteventcolor(String _vareventcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 306;BA.debugLine="Sub SetEventColor(varEventColor As String) As VMCa";
 //BA.debugLineNum = 307;BA.debugLine="If varEventColor = \"\" Then Return Me";
if ((_vareventcolor).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 308;BA.debugLine="If varEventColor = \"primary\" Then Return Me";
if ((_vareventcolor).equals("primary")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 309;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 310;BA.debugLine="SetAttrSingle(\"event-color\", varEventColor)";
_setattrsingle("event-color",_vareventcolor);
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 313;BA.debugLine="Dim pp As String = $\"${ID}EventColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"EventColor");
 //BA.debugLineNum = 314;BA.debugLine="vue.SetStateSingle(pp, varEventColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareventcolor));
 //BA.debugLineNum = 315;BA.debugLine="Calendar.Bind(\":event-color\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":event-color",_pp);
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _seteventend(String _vareventend) throws Exception{
String _pp = "";
 //BA.debugLineNum = 320;BA.debugLine="Sub SetEventEnd(varEventEnd As String) As VMCalend";
 //BA.debugLineNum = 321;BA.debugLine="If varEventEnd = \"\" Then Return Me";
if ((_vareventend).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 322;BA.debugLine="If varEventEnd = \"end\" Then Return Me";
if ((_vareventend).equals("end")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 323;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 324;BA.debugLine="SetAttrSingle(\"event-end\", varEventEnd)";
_setattrsingle("event-end",_vareventend);
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 327;BA.debugLine="Dim pp As String = $\"${ID}EventEnd\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"EventEnd");
 //BA.debugLineNum = 328;BA.debugLine="vue.SetStateSingle(pp, varEventEnd)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareventend));
 //BA.debugLineNum = 329;BA.debugLine="Calendar.Bind(\":event-end\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":event-end",_pp);
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _seteventheight(String _vareventheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 334;BA.debugLine="Sub SetEventHeight(varEventHeight As String) As VM";
 //BA.debugLineNum = 335;BA.debugLine="If varEventHeight = \"\" Then Return Me";
if ((_vareventheight).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 336;BA.debugLine="If varEventHeight = \"20\" Then Return Me";
if ((_vareventheight).equals("20")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 337;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 338;BA.debugLine="SetAttrSingle(\"event-height\", varEventHeight)";
_setattrsingle("event-height",_vareventheight);
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 341;BA.debugLine="Dim pp As String = $\"${ID}EventHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"EventHeight");
 //BA.debugLineNum = 342;BA.debugLine="vue.SetStateSingle(pp, varEventHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareventheight));
 //BA.debugLineNum = 343;BA.debugLine="Calendar.Bind(\":event-height\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":event-height",_pp);
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _seteventmarginbottom(String _vareventmarginbottom) throws Exception{
String _pp = "";
 //BA.debugLineNum = 348;BA.debugLine="Sub SetEventMarginBottom(varEventMarginBottom As S";
 //BA.debugLineNum = 349;BA.debugLine="If varEventMarginBottom = \"\" Then Return Me";
if ((_vareventmarginbottom).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 350;BA.debugLine="If varEventMarginBottom = \"1\" Then Return Me";
if ((_vareventmarginbottom).equals("1")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 351;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 352;BA.debugLine="SetAttrSingle(\"event-margin-bottom\", varEventMar";
_setattrsingle("event-margin-bottom",_vareventmarginbottom);
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 355;BA.debugLine="Dim pp As String = $\"${ID}EventMarginBottom\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"EventMarginBottom");
 //BA.debugLineNum = 356;BA.debugLine="vue.SetStateSingle(pp, varEventMarginBottom)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareventmarginbottom));
 //BA.debugLineNum = 357;BA.debugLine="Calendar.Bind(\":event-margin-bottom\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":event-margin-bottom",_pp);
 //BA.debugLineNum = 358;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _seteventmore(boolean _vareventmore) throws Exception{
String _pp = "";
 //BA.debugLineNum = 754;BA.debugLine="Sub SetEventMore(varEventMore As Boolean) As VMCal";
 //BA.debugLineNum = 755;BA.debugLine="If varEventMore = True Then Return Me";
if (_vareventmore==__c.True) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 756;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 757;BA.debugLine="SetAttrSingle(\"event-more\", varEventMore)";
_setattrsingle("event-more",BA.ObjectToString(_vareventmore));
 //BA.debugLineNum = 758;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 760;BA.debugLine="Dim pp As String = $\"${ID}EventMore\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"EventMore");
 //BA.debugLineNum = 761;BA.debugLine="vue.SetStateSingle(pp, varEventMore)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareventmore));
 //BA.debugLineNum = 762;BA.debugLine="Calendar.Bind(\":event-more\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":event-more",_pp);
 //BA.debugLineNum = 763;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 764;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _seteventmoretext(String _vareventmoretext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 362;BA.debugLine="Sub SetEventMoreText(varEventMoreText As String) A";
 //BA.debugLineNum = 363;BA.debugLine="If varEventMoreText = \"\" Then Return Me";
if ((_vareventmoretext).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 364;BA.debugLine="If varEventMoreText = \"$vuetify.calendar.moreEven";
if ((_vareventmoretext).equals("$vuetify.calendar.moreEvents")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 365;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 366;BA.debugLine="SetAttrSingle(\"event-more-text\", varEventMoreTex";
_setattrsingle("event-more-text",_vareventmoretext);
 //BA.debugLineNum = 367;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 369;BA.debugLine="Dim pp As String = $\"${ID}EventMoreText\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"EventMoreText");
 //BA.debugLineNum = 370;BA.debugLine="vue.SetStateSingle(pp, varEventMoreText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareventmoretext));
 //BA.debugLineNum = 371;BA.debugLine="Calendar.Bind(\":event-more-text\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":event-more-text",_pp);
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _seteventname(String _vareventname) throws Exception{
String _pp = "";
 //BA.debugLineNum = 376;BA.debugLine="Sub SetEventName(varEventName As String) As VMCale";
 //BA.debugLineNum = 377;BA.debugLine="If varEventName = \"\" Then Return Me";
if ((_vareventname).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 378;BA.debugLine="If varEventName = \"name\" Then Return Me";
if ((_vareventname).equals("name")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 379;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 380;BA.debugLine="SetAttrSingle(\"event-name\", varEventName)";
_setattrsingle("event-name",_vareventname);
 //BA.debugLineNum = 381;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 383;BA.debugLine="Dim pp As String = $\"${ID}EventName\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"EventName");
 //BA.debugLineNum = 384;BA.debugLine="vue.SetStateSingle(pp, varEventName)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareventname));
 //BA.debugLineNum = 385;BA.debugLine="Calendar.Bind(\":event-name\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":event-name",_pp);
 //BA.debugLineNum = 386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _seteventoverlapmode(String _vareventoverlapmode) throws Exception{
String _pp = "";
 //BA.debugLineNum = 390;BA.debugLine="Sub SetEventOverlapMode(varEventOverlapMode As Str";
 //BA.debugLineNum = 391;BA.debugLine="If varEventOverlapMode = \"\" Then Return Me";
if ((_vareventoverlapmode).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 392;BA.debugLine="If varEventOverlapMode = \"stack\" Then Return Me";
if ((_vareventoverlapmode).equals("stack")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 393;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 394;BA.debugLine="SetAttrSingle(\"event-overlap-mode\", varEventOver";
_setattrsingle("event-overlap-mode",_vareventoverlapmode);
 //BA.debugLineNum = 395;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 397;BA.debugLine="Dim pp As String = $\"${ID}EventOverlapMode\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"EventOverlapMode");
 //BA.debugLineNum = 398;BA.debugLine="vue.SetStateSingle(pp, varEventOverlapMode)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareventoverlapmode));
 //BA.debugLineNum = 399;BA.debugLine="Calendar.Bind(\":event-overlap-mode\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":event-overlap-mode",_pp);
 //BA.debugLineNum = 400;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _seteventoverlapthreshold(String _vareventoverlapthreshold) throws Exception{
String _pp = "";
 //BA.debugLineNum = 404;BA.debugLine="Sub SetEventOverlapThreshold(varEventOverlapThresh";
 //BA.debugLineNum = 405;BA.debugLine="If varEventOverlapThreshold = \"\" Then Return Me";
if ((_vareventoverlapthreshold).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 406;BA.debugLine="If varEventOverlapThreshold = \"60\" Then Return Me";
if ((_vareventoverlapthreshold).equals("60")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 407;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 408;BA.debugLine="SetAttrSingle(\"event-overlap-threshold\", varEven";
_setattrsingle("event-overlap-threshold",_vareventoverlapthreshold);
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 411;BA.debugLine="Dim pp As String = $\"${ID}EventOverlapThreshold\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"EventOverlapThreshold");
 //BA.debugLineNum = 412;BA.debugLine="vue.SetStateSingle(pp, varEventOverlapThreshold)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareventoverlapthreshold));
 //BA.debugLineNum = 413;BA.debugLine="Calendar.Bind(\":event-overlap-threshold\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":event-overlap-threshold",_pp);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _seteventripple(boolean _vareventripple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 767;BA.debugLine="Sub SetEventRipple(varEventRipple As Boolean) As V";
 //BA.debugLineNum = 768;BA.debugLine="If varEventRipple = False Then Return Me";
if (_vareventripple==__c.False) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 769;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 770;BA.debugLine="SetAttrSingle(\"event-ripple\", varEventRipple)";
_setattrsingle("event-ripple",BA.ObjectToString(_vareventripple));
 //BA.debugLineNum = 771;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 773;BA.debugLine="Dim pp As String = $\"${ID}EventRipple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"EventRipple");
 //BA.debugLineNum = 774;BA.debugLine="vue.SetStateSingle(pp, varEventRipple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareventripple));
 //BA.debugLineNum = 775;BA.debugLine="Calendar.Bind(\":event-ripple\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":event-ripple",_pp);
 //BA.debugLineNum = 776;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 777;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setevents(anywheresoftware.b4a.objects.collections.List _varevents) throws Exception{
String _pp = "";
 //BA.debugLineNum = 880;BA.debugLine="Sub SetEvents(varEvents As List) As VMCalendar";
 //BA.debugLineNum = 881;BA.debugLine="If bStatic Then Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 882;BA.debugLine="Dim pp As String = $\"${ID}Events\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Events");
 //BA.debugLineNum = 883;BA.debugLine="vue.SetStateSingle(pp, varEvents)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varevents.getObject()));
 //BA.debugLineNum = 884;BA.debugLine="Calendar.Bind(\":events\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":events",_pp);
 //BA.debugLineNum = 885;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 886;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _seteventstart(String _vareventstart) throws Exception{
String _pp = "";
 //BA.debugLineNum = 418;BA.debugLine="Sub SetEventStart(varEventStart As String) As VMCa";
 //BA.debugLineNum = 419;BA.debugLine="If varEventStart = \"\" Then Return Me";
if ((_vareventstart).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 420;BA.debugLine="If varEventStart = \"start\" Then Return Me";
if ((_vareventstart).equals("start")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 421;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 422;BA.debugLine="SetAttrSingle(\"event-start\", varEventStart)";
_setattrsingle("event-start",_vareventstart);
 //BA.debugLineNum = 423;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 425;BA.debugLine="Dim pp As String = $\"${ID}EventStart\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"EventStart");
 //BA.debugLineNum = 426;BA.debugLine="vue.SetStateSingle(pp, varEventStart)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareventstart));
 //BA.debugLineNum = 427;BA.debugLine="Calendar.Bind(\":event-start\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":event-start",_pp);
 //BA.debugLineNum = 428;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 429;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _seteventtextcolor(String _vareventtextcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 432;BA.debugLine="Sub SetEventTextColor(varEventTextColor As String)";
 //BA.debugLineNum = 433;BA.debugLine="If varEventTextColor = \"\" Then Return Me";
if ((_vareventtextcolor).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 434;BA.debugLine="If varEventTextColor = \"white\" Then Return Me";
if ((_vareventtextcolor).equals("white")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 435;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 436;BA.debugLine="SetAttrSingle(\"event-text-color\", varEventTextCo";
_setattrsingle("event-text-color",_vareventtextcolor);
 //BA.debugLineNum = 437;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 439;BA.debugLine="Dim pp As String = $\"${ID}EventTextColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"EventTextColor");
 //BA.debugLineNum = 440;BA.debugLine="vue.SetStateSingle(pp, varEventTextColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareventtextcolor));
 //BA.debugLineNum = 441;BA.debugLine="Calendar.Bind(\":event-text-color\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":event-text-color",_pp);
 //BA.debugLineNum = 442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _seteventtimed(String _vareventtimed) throws Exception{
String _pp = "";
 //BA.debugLineNum = 446;BA.debugLine="Sub SetEventTimed(varEventTimed As String) As VMCa";
 //BA.debugLineNum = 447;BA.debugLine="If varEventTimed = \"\" Then Return Me";
if ((_vareventtimed).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 448;BA.debugLine="If varEventTimed = \"timed\" Then Return Me";
if ((_vareventtimed).equals("timed")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 449;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 450;BA.debugLine="SetAttrSingle(\"event-timed\", varEventTimed)";
_setattrsingle("event-timed",_vareventtimed);
 //BA.debugLineNum = 451;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 453;BA.debugLine="Dim pp As String = $\"${ID}EventTimed\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"EventTimed");
 //BA.debugLineNum = 454;BA.debugLine="vue.SetStateSingle(pp, varEventTimed)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareventtimed));
 //BA.debugLineNum = 455;BA.debugLine="Calendar.Bind(\":event-timed\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":event-timed",_pp);
 //BA.debugLineNum = 456;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setfirstinterval(String _varfirstinterval) throws Exception{
String _pp = "";
 //BA.debugLineNum = 460;BA.debugLine="Sub SetFirstInterval(varFirstInterval As String) A";
 //BA.debugLineNum = 461;BA.debugLine="If varFirstInterval = \"\" Then Return Me";
if ((_varfirstinterval).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 462;BA.debugLine="If varFirstInterval = \"0\" Then Return Me";
if ((_varfirstinterval).equals("0")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 463;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 464;BA.debugLine="SetAttrSingle(\"first-interval\", varFirstInterval";
_setattrsingle("first-interval",_varfirstinterval);
 //BA.debugLineNum = 465;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 467;BA.debugLine="Dim pp As String = $\"${ID}FirstInterval\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"FirstInterval");
 //BA.debugLineNum = 468;BA.debugLine="vue.SetStateSingle(pp, varFirstInterval)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfirstinterval));
 //BA.debugLineNum = 469;BA.debugLine="Calendar.Bind(\":first-interval\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":first-interval",_pp);
 //BA.debugLineNum = 470;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 471;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setfirsttime(String _varfirsttime) throws Exception{
String _pp = "";
 //BA.debugLineNum = 474;BA.debugLine="Sub SetFirstTime(varFirstTime As String) As VMCale";
 //BA.debugLineNum = 475;BA.debugLine="If varFirstTime = \"\" Then Return Me";
if ((_varfirsttime).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 476;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 477;BA.debugLine="SetAttrSingle(\"first-time\", varFirstTime)";
_setattrsingle("first-time",_varfirsttime);
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 480;BA.debugLine="Dim pp As String = $\"${ID}FirstTime\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"FirstTime");
 //BA.debugLineNum = 481;BA.debugLine="vue.SetStateSingle(pp, varFirstTime)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfirsttime));
 //BA.debugLineNum = 482;BA.debugLine="Calendar.Bind(\":first-time\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":first-time",_pp);
 //BA.debugLineNum = 483;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 484;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _sethideheader(boolean _varhideheader) throws Exception{
String _pp = "";
 //BA.debugLineNum = 780;BA.debugLine="Sub SetHideHeader(varHideHeader As Boolean) As VMC";
 //BA.debugLineNum = 781;BA.debugLine="If varHideHeader = False Then Return Me";
if (_varhideheader==__c.False) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 782;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 783;BA.debugLine="SetAttrSingle(\"hide-header\", varHideHeader)";
_setattrsingle("hide-header",BA.ObjectToString(_varhideheader));
 //BA.debugLineNum = 784;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 786;BA.debugLine="Dim pp As String = $\"${ID}HideHeader\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideHeader");
 //BA.debugLineNum = 787;BA.debugLine="vue.SetStateSingle(pp, varHideHeader)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhideheader));
 //BA.debugLineNum = 788;BA.debugLine="Calendar.Bind(\":hide-header\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":hide-header",_pp);
 //BA.debugLineNum = 789;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 790;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setintervalcount(String _varintervalcount) throws Exception{
String _pp = "";
 //BA.debugLineNum = 487;BA.debugLine="Sub SetIntervalCount(varIntervalCount As String) A";
 //BA.debugLineNum = 488;BA.debugLine="If varIntervalCount = \"\" Then Return Me";
if ((_varintervalcount).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 489;BA.debugLine="If varIntervalCount = \"24\" Then Return Me";
if ((_varintervalcount).equals("24")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 490;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 491;BA.debugLine="SetAttrSingle(\"interval-count\", varIntervalCount";
_setattrsingle("interval-count",_varintervalcount);
 //BA.debugLineNum = 492;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 494;BA.debugLine="Dim pp As String = $\"${ID}IntervalCount\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"IntervalCount");
 //BA.debugLineNum = 495;BA.debugLine="vue.SetStateSingle(pp, varIntervalCount)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varintervalcount));
 //BA.debugLineNum = 496;BA.debugLine="Calendar.Bind(\":interval-count\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":interval-count",_pp);
 //BA.debugLineNum = 497;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setintervalformat(String _varintervalformat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 501;BA.debugLine="Sub SetIntervalFormat(varIntervalFormat As String)";
 //BA.debugLineNum = 502;BA.debugLine="If varIntervalFormat = \"\" Then Return Me";
if ((_varintervalformat).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 503;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 504;BA.debugLine="SetAttrSingle(\"interval-format\", varIntervalForm";
_setattrsingle("interval-format",_varintervalformat);
 //BA.debugLineNum = 505;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 507;BA.debugLine="Dim pp As String = $\"${ID}IntervalFormat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"IntervalFormat");
 //BA.debugLineNum = 508;BA.debugLine="vue.SetStateSingle(pp, varIntervalFormat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varintervalformat));
 //BA.debugLineNum = 509;BA.debugLine="Calendar.Bind(\":interval-format\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":interval-format",_pp);
 //BA.debugLineNum = 510;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 511;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setintervalheight(String _varintervalheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 514;BA.debugLine="Sub SetIntervalHeight(varIntervalHeight As String)";
 //BA.debugLineNum = 515;BA.debugLine="If varIntervalHeight = \"\" Then Return Me";
if ((_varintervalheight).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 516;BA.debugLine="If varIntervalHeight = \"48\" Then Return Me";
if ((_varintervalheight).equals("48")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 517;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 518;BA.debugLine="SetAttrSingle(\"interval-height\", varIntervalHeig";
_setattrsingle("interval-height",_varintervalheight);
 //BA.debugLineNum = 519;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 521;BA.debugLine="Dim pp As String = $\"${ID}IntervalHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"IntervalHeight");
 //BA.debugLineNum = 522;BA.debugLine="vue.SetStateSingle(pp, varIntervalHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varintervalheight));
 //BA.debugLineNum = 523;BA.debugLine="Calendar.Bind(\":interval-height\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":interval-height",_pp);
 //BA.debugLineNum = 524;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setintervalminutes(String _varintervalminutes) throws Exception{
String _pp = "";
 //BA.debugLineNum = 528;BA.debugLine="Sub SetIntervalMinutes(varIntervalMinutes As Strin";
 //BA.debugLineNum = 529;BA.debugLine="If varIntervalMinutes = \"\" Then Return Me";
if ((_varintervalminutes).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 530;BA.debugLine="If varIntervalMinutes = \"60\" Then Return Me";
if ((_varintervalminutes).equals("60")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 531;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 532;BA.debugLine="SetAttrSingle(\"interval-minutes\", varIntervalMin";
_setattrsingle("interval-minutes",_varintervalminutes);
 //BA.debugLineNum = 533;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 535;BA.debugLine="Dim pp As String = $\"${ID}IntervalMinutes\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"IntervalMinutes");
 //BA.debugLineNum = 536;BA.debugLine="vue.SetStateSingle(pp, varIntervalMinutes)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varintervalminutes));
 //BA.debugLineNum = 537;BA.debugLine="Calendar.Bind(\":interval-minutes\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":interval-minutes",_pp);
 //BA.debugLineNum = 538;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 539;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setintervalstyle(String _varintervalstyle) throws Exception{
String _pp = "";
 //BA.debugLineNum = 542;BA.debugLine="Sub SetIntervalStyle(varIntervalStyle As String) A";
 //BA.debugLineNum = 543;BA.debugLine="If varIntervalStyle = \"\" Then Return Me";
if ((_varintervalstyle).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 544;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 545;BA.debugLine="SetAttrSingle(\"interval-style\", varIntervalStyle";
_setattrsingle("interval-style",_varintervalstyle);
 //BA.debugLineNum = 546;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 548;BA.debugLine="Dim pp As String = $\"${ID}IntervalStyle\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"IntervalStyle");
 //BA.debugLineNum = 549;BA.debugLine="vue.SetStateSingle(pp, varIntervalStyle)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varintervalstyle));
 //BA.debugLineNum = 550;BA.debugLine="Calendar.Bind(\":interval-style\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":interval-style",_pp);
 //BA.debugLineNum = 551;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 552;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setintervalwidth(String _varintervalwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 555;BA.debugLine="Sub SetIntervalWidth(varIntervalWidth As String) A";
 //BA.debugLineNum = 556;BA.debugLine="If varIntervalWidth = \"\" Then Return Me";
if ((_varintervalwidth).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 557;BA.debugLine="If varIntervalWidth = \"60\" Then Return Me";
if ((_varintervalwidth).equals("60")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 558;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 559;BA.debugLine="SetAttrSingle(\"interval-width\", varIntervalWidth";
_setattrsingle("interval-width",_varintervalwidth);
 //BA.debugLineNum = 560;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 562;BA.debugLine="Dim pp As String = $\"${ID}IntervalWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"IntervalWidth");
 //BA.debugLineNum = 563;BA.debugLine="vue.SetStateSingle(pp, varIntervalWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varintervalwidth));
 //BA.debugLineNum = 564;BA.debugLine="Calendar.Bind(\":interval-width\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":interval-width",_pp);
 //BA.debugLineNum = 565;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 566;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 1055;BA.debugLine="Sub SetKey(k As String) As VMCalendar";
 //BA.debugLineNum = 1056;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 1057;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 1058;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1059;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 793;BA.debugLine="Sub SetLight(varLight As Boolean) As VMCalendar";
 //BA.debugLineNum = 794;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 795;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 796;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 797;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 799;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 800;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 801;BA.debugLine="Calendar.Bind(\":light\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 802;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 803;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setlocale(String _varlocale) throws Exception{
String _pp = "";
 //BA.debugLineNum = 569;BA.debugLine="Sub SetLocale(varLocale As String) As VMCalendar";
 //BA.debugLineNum = 570;BA.debugLine="If varLocale = \"\" Then Return Me";
if ((_varlocale).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 571;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 572;BA.debugLine="SetAttrSingle(\"locale\", varLocale)";
_setattrsingle("locale",_varlocale);
 //BA.debugLineNum = 573;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 575;BA.debugLine="Dim pp As String = $\"${ID}Locale\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Locale");
 //BA.debugLineNum = 576;BA.debugLine="vue.SetStateSingle(pp, varLocale)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlocale));
 //BA.debugLineNum = 577;BA.debugLine="Calendar.Bind(\":locale\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":locale",_pp);
 //BA.debugLineNum = 578;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 579;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setlocalefirstdayofyear(String _varlocalefirstdayofyear) throws Exception{
String _pp = "";
 //BA.debugLineNum = 582;BA.debugLine="Sub SetLocaleFirstDayOfYear(varLocaleFirstDayOfYea";
 //BA.debugLineNum = 583;BA.debugLine="If varLocaleFirstDayOfYear = \"\" Then Return Me";
if ((_varlocalefirstdayofyear).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 584;BA.debugLine="If varLocaleFirstDayOfYear = \"0\" Then Return Me";
if ((_varlocalefirstdayofyear).equals("0")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 585;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 586;BA.debugLine="SetAttrSingle(\"locale-first-day-of-year\", varLoc";
_setattrsingle("locale-first-day-of-year",_varlocalefirstdayofyear);
 //BA.debugLineNum = 587;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 589;BA.debugLine="Dim pp As String = $\"${ID}LocaleFirstDayOfYear\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"LocaleFirstDayOfYear");
 //BA.debugLineNum = 590;BA.debugLine="vue.SetStateSingle(pp, varLocaleFirstDayOfYear)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlocalefirstdayofyear));
 //BA.debugLineNum = 591;BA.debugLine="Calendar.Bind(\":locale-first-day-of-year\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":locale-first-day-of-year",_pp);
 //BA.debugLineNum = 592;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 593;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 975;BA.debugLine="Sub SetMarginAll(p As String) As VMCalendar";
 //BA.debugLineNum = 976;BA.debugLine="Calendar.setmarginall(p)";
_calendar._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 977;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 978;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setmaxdays(String _varmaxdays) throws Exception{
String _pp = "";
 //BA.debugLineNum = 596;BA.debugLine="Sub SetMaxDays(varMaxDays As String) As VMCalendar";
 //BA.debugLineNum = 597;BA.debugLine="If varMaxDays = \"\" Then Return Me";
if ((_varmaxdays).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 598;BA.debugLine="If varMaxDays = \"7\" Then Return Me";
if ((_varmaxdays).equals("7")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 599;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 600;BA.debugLine="SetAttrSingle(\"max-days\", varMaxDays)";
_setattrsingle("max-days",_varmaxdays);
 //BA.debugLineNum = 601;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 603;BA.debugLine="Dim pp As String = $\"${ID}MaxDays\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxDays");
 //BA.debugLineNum = 604;BA.debugLine="vue.SetStateSingle(pp, varMaxDays)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxdays));
 //BA.debugLineNum = 605;BA.debugLine="Calendar.Bind(\":max-days\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":max-days",_pp);
 //BA.debugLineNum = 606;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 607;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setminweeks(String _varminweeks) throws Exception{
String _pp = "";
 //BA.debugLineNum = 610;BA.debugLine="Sub SetMinWeeks(varMinWeeks As String) As VMCalend";
 //BA.debugLineNum = 611;BA.debugLine="If varMinWeeks = \"\" Then Return Me";
if ((_varminweeks).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 612;BA.debugLine="If varMinWeeks = \"1\" Then Return Me";
if ((_varminweeks).equals("1")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 613;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 614;BA.debugLine="SetAttrSingle(\"min-weeks\", varMinWeeks)";
_setattrsingle("min-weeks",_varminweeks);
 //BA.debugLineNum = 615;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 617;BA.debugLine="Dim pp As String = $\"${ID}MinWeeks\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinWeeks");
 //BA.debugLineNum = 618;BA.debugLine="vue.SetStateSingle(pp, varMinWeeks)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminweeks));
 //BA.debugLineNum = 619;BA.debugLine="Calendar.Bind(\":min-weeks\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":min-weeks",_pp);
 //BA.debugLineNum = 620;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 621;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setmonthformat(String _varmonthformat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 624;BA.debugLine="Sub SetMonthFormat(varMonthFormat As String) As VM";
 //BA.debugLineNum = 625;BA.debugLine="If varMonthFormat = \"\" Then Return Me";
if ((_varmonthformat).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 626;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 627;BA.debugLine="SetAttrSingle(\"month-format\", varMonthFormat)";
_setattrsingle("month-format",_varmonthformat);
 //BA.debugLineNum = 628;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 630;BA.debugLine="Dim pp As String = $\"${ID}MonthFormat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MonthFormat");
 //BA.debugLineNum = 631;BA.debugLine="vue.SetStateSingle(pp, varMonthFormat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmonthformat));
 //BA.debugLineNum = 632;BA.debugLine="Calendar.Bind(\":month-format\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":month-format",_pp);
 //BA.debugLineNum = 633;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 634;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 1001;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 1002;BA.debugLine="Calendar.SetName(varName, bbind)";
_calendar._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 1003;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1004;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setnow(String _varnow) throws Exception{
String _pp = "";
 //BA.debugLineNum = 637;BA.debugLine="Sub SetNow(varNow As String) As VMCalendar";
 //BA.debugLineNum = 638;BA.debugLine="If varNow = \"\" Then Return Me";
if ((_varnow).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 639;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 640;BA.debugLine="SetAttrSingle(\"now\", varNow)";
_setattrsingle("now",_varnow);
 //BA.debugLineNum = 641;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 643;BA.debugLine="Dim pp As String = $\"${ID}Now\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Now");
 //BA.debugLineNum = 644;BA.debugLine="vue.SetStateSingle(pp, varNow)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnow));
 //BA.debugLineNum = 645;BA.debugLine="Calendar.Bind(\":now\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":now",_pp);
 //BA.debugLineNum = 646;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 647;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setonchange() throws Exception{
String _methodname = "";
Object _obj = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1167;BA.debugLine="Sub SetOnChange As VMCalendar";
 //BA.debugLineNum = 1168;BA.debugLine="Dim methodName As String = $\"${ID}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 1169;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 1170;BA.debugLine="Dim obj As Object";
_obj = new Object();
 //BA.debugLineNum = 1171;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_obj}))));
 //BA.debugLineNum = 1172;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 1174;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1176;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setonclickdate() throws Exception{
String _methodname = "";
Object _obj = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1156;BA.debugLine="Sub SetOnClickDate As VMCalendar";
 //BA.debugLineNum = 1157;BA.debugLine="Dim methodName As String = $\"${ID}_clickdate\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_clickdate");
 //BA.debugLineNum = 1158;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 1159;BA.debugLine="Dim obj As Object";
_obj = new Object();
 //BA.debugLineNum = 1160;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_obj}))));
 //BA.debugLineNum = 1161;BA.debugLine="SetAttr(CreateMap(\"@click:date\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:date"),(Object)(_methodname)}));
 //BA.debugLineNum = 1163;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1164;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1165;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setonclickevent() throws Exception{
String _methodname = "";
Object _obj = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1134;BA.debugLine="Sub SetOnClickEvent As VMCalendar";
 //BA.debugLineNum = 1135;BA.debugLine="Dim methodName As String = $\"${ID}_clickevent\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_clickevent");
 //BA.debugLineNum = 1136;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 1137;BA.debugLine="Dim obj As Object";
_obj = new Object();
 //BA.debugLineNum = 1138;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_obj}))));
 //BA.debugLineNum = 1139;BA.debugLine="SetAttr(CreateMap(\"@click:event\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:event"),(Object)(_methodname)}));
 //BA.debugLineNum = 1141;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1143;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setonclickmore() throws Exception{
String _methodname = "";
Object _obj = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1145;BA.debugLine="Sub SetOnClickMore As VMCalendar";
 //BA.debugLineNum = 1146;BA.debugLine="Dim methodName As String  = $\"${ID}_clickmore\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_clickmore");
 //BA.debugLineNum = 1147;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 1148;BA.debugLine="Dim obj As Object";
_obj = new Object();
 //BA.debugLineNum = 1149;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_obj}))));
 //BA.debugLineNum = 1150;BA.debugLine="SetAttr(CreateMap(\"@click:more\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:more"),(Object)(_methodname)}));
 //BA.debugLineNum = 1152;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 969;BA.debugLine="Sub SetPaddingAll(p As String) As VMCalendar";
 //BA.debugLineNum = 970;BA.debugLine="Calendar.SetPaddingAll(p)";
_calendar._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 971;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 972;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 1062;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMCal";
 //BA.debugLineNum = 1063;BA.debugLine="Calendar.SetRC(sRow, sCol)";
_calendar._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 1064;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1065;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setshortintervals(boolean _varshortintervals) throws Exception{
String _pp = "";
 //BA.debugLineNum = 806;BA.debugLine="Sub SetShortIntervals(varShortIntervals As Boolean";
 //BA.debugLineNum = 807;BA.debugLine="If varShortIntervals = True Then Return Me";
if (_varshortintervals==__c.True) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 808;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 809;BA.debugLine="SetAttrSingle(\"short-intervals\", varShortInterva";
_setattrsingle("short-intervals",BA.ObjectToString(_varshortintervals));
 //BA.debugLineNum = 810;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 812;BA.debugLine="Dim pp As String = $\"${ID}ShortIntervals\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShortIntervals");
 //BA.debugLineNum = 813;BA.debugLine="vue.SetStateSingle(pp, varShortIntervals)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshortintervals));
 //BA.debugLineNum = 814;BA.debugLine="Calendar.Bind(\":short-intervals\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":short-intervals",_pp);
 //BA.debugLineNum = 815;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 816;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setshortmonths(boolean _varshortmonths) throws Exception{
String _pp = "";
 //BA.debugLineNum = 819;BA.debugLine="Sub SetShortMonths(varShortMonths As Boolean) As V";
 //BA.debugLineNum = 820;BA.debugLine="If varShortMonths = True Then Return Me";
if (_varshortmonths==__c.True) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 821;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 822;BA.debugLine="SetAttrSingle(\"short-months\", varShortMonths)";
_setattrsingle("short-months",BA.ObjectToString(_varshortmonths));
 //BA.debugLineNum = 823;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 825;BA.debugLine="Dim pp As String = $\"${ID}ShortMonths\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShortMonths");
 //BA.debugLineNum = 826;BA.debugLine="vue.SetStateSingle(pp, varShortMonths)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshortmonths));
 //BA.debugLineNum = 827;BA.debugLine="Calendar.Bind(\":short-months\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":short-months",_pp);
 //BA.debugLineNum = 828;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 829;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setshortweekdays(boolean _varshortweekdays) throws Exception{
String _pp = "";
 //BA.debugLineNum = 832;BA.debugLine="Sub SetShortWeekdays(varShortWeekdays As Boolean)";
 //BA.debugLineNum = 833;BA.debugLine="If varShortWeekdays = True Then Return Me";
if (_varshortweekdays==__c.True) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 834;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 835;BA.debugLine="SetAttrSingle(\"short-weekdays\", varShortWeekdays";
_setattrsingle("short-weekdays",BA.ObjectToString(_varshortweekdays));
 //BA.debugLineNum = 836;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 838;BA.debugLine="Dim pp As String = $\"${ID}ShortWeekdays\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShortWeekdays");
 //BA.debugLineNum = 839;BA.debugLine="vue.SetStateSingle(pp, varShortWeekdays)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshortweekdays));
 //BA.debugLineNum = 840;BA.debugLine="Calendar.Bind(\":short-weekdays\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":short-weekdays",_pp);
 //BA.debugLineNum = 841;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 842;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setshowintervallabel(String _varshowintervallabel) throws Exception{
String _pp = "";
 //BA.debugLineNum = 650;BA.debugLine="Sub SetShowIntervalLabel(varShowIntervalLabel As S";
 //BA.debugLineNum = 651;BA.debugLine="If varShowIntervalLabel = \"\" Then Return Me";
if ((_varshowintervallabel).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 652;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 653;BA.debugLine="SetAttrSingle(\"show-interval-label\", varShowInte";
_setattrsingle("show-interval-label",_varshowintervallabel);
 //BA.debugLineNum = 654;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 656;BA.debugLine="Dim pp As String = $\"${ID}ShowIntervalLabel\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowIntervalLabel");
 //BA.debugLineNum = 657;BA.debugLine="vue.SetStateSingle(pp, varShowIntervalLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshowintervallabel));
 //BA.debugLineNum = 658;BA.debugLine="Calendar.Bind(\":show-interval-label\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":show-interval-label",_pp);
 //BA.debugLineNum = 659;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 660;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setshowmonthonfirst(boolean _varshowmonthonfirst) throws Exception{
String _pp = "";
 //BA.debugLineNum = 845;BA.debugLine="Sub SetShowMonthOnFirst(varShowMonthOnFirst As Boo";
 //BA.debugLineNum = 846;BA.debugLine="If varShowMonthOnFirst = True Then Return Me";
if (_varshowmonthonfirst==__c.True) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 847;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 848;BA.debugLine="SetAttrSingle(\"show-month-on-first\", varShowMont";
_setattrsingle("show-month-on-first",BA.ObjectToString(_varshowmonthonfirst));
 //BA.debugLineNum = 849;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 851;BA.debugLine="Dim pp As String = $\"${ID}ShowMonthOnFirst\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowMonthOnFirst");
 //BA.debugLineNum = 852;BA.debugLine="vue.SetStateSingle(pp, varShowMonthOnFirst)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshowmonthonfirst));
 //BA.debugLineNum = 853;BA.debugLine="Calendar.Bind(\":show-month-on-first\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":show-month-on-first",_pp);
 //BA.debugLineNum = 854;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 855;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setshowweek(boolean _varshowweek) throws Exception{
String _pp = "";
 //BA.debugLineNum = 858;BA.debugLine="Sub SetShowWeek(varShowWeek As Boolean) As VMCalen";
 //BA.debugLineNum = 859;BA.debugLine="If varShowWeek = False Then Return Me";
if (_varshowweek==__c.False) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 860;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 861;BA.debugLine="SetAttrSingle(\"show-week\", varShowWeek)";
_setattrsingle("show-week",BA.ObjectToString(_varshowweek));
 //BA.debugLineNum = 862;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 864;BA.debugLine="Dim pp As String = $\"${ID}ShowWeek\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowWeek");
 //BA.debugLineNum = 865;BA.debugLine="vue.SetStateSingle(pp, varShowWeek)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshowweek));
 //BA.debugLineNum = 866;BA.debugLine="Calendar.Bind(\":show-week\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":show-week",_pp);
 //BA.debugLineNum = 867;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 868;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setstart(String _varstart) throws Exception{
String _pp = "";
 //BA.debugLineNum = 663;BA.debugLine="Sub SetStart(varStart As String) As VMCalendar";
 //BA.debugLineNum = 664;BA.debugLine="If varStart = \"\" Then Return Me";
if ((_varstart).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 665;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 666;BA.debugLine="SetAttrSingle(\"start\", varStart)";
_setattrsingle("start",_varstart);
 //BA.debugLineNum = 667;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 669;BA.debugLine="Dim pp As String = $\"${ID}Start\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Start");
 //BA.debugLineNum = 670;BA.debugLine="vue.SetStateSingle(pp, varStart)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varstart));
 //BA.debugLineNum = 671;BA.debugLine="Calendar.Bind(\":start\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":start",_pp);
 //BA.debugLineNum = 672;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 673;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 988;BA.debugLine="Sub SetStatic(b As Boolean) As VMCalendar";
 //BA.debugLineNum = 989;BA.debugLine="Calendar.SetStatic(b)";
_calendar._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 990;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 991;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 992;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetStyle(sm As Map) As VMCalendar";
 //BA.debugLineNum = 219;BA.debugLine="Calendar.SetStyle(sm)";
_calendar._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1007;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 1008;BA.debugLine="Calendar.SetStyleSingle(prop, value)";
_calendar._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 1009;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1010;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 995;BA.debugLine="Sub SetTabIndex(ti As String) As VMCalendar";
 //BA.debugLineNum = 996;BA.debugLine="Calendar.SetTabIndex(ti)";
_calendar._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 997;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 998;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _settext(String _t) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetText(t As String) As VMCalendar";
 //BA.debugLineNum = 196;BA.debugLine="Calendar.SetText(t)";
_calendar._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _settextcenter() throws Exception{
 //BA.debugLineNum = 1094;BA.debugLine="Sub SetTextCenter As VMCalendar";
 //BA.debugLineNum = 1095;BA.debugLine="Calendar.AddClass(\"text-center\")";
_calendar._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 1096;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1097;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _settextcolor(String _textcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 1117;BA.debugLine="Sub SetTextColor(textcolor As String) As VMCalenda";
 //BA.debugLineNum = 1118;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 1119;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 1120;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 1121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _settextcolorintensity(String _textcolor,String _textintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 1125;BA.debugLine="Sub SetTextColorIntensity(textcolor As String, tex";
 //BA.debugLineNum = 1126;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 1127;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 1128;BA.debugLine="Dim sIntensity As String = $\"text--${textintensit";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_textintensity))+"");
 //BA.debugLineNum = 1129;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 1130;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 1131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _settype(String _vartype) throws Exception{
String _pp = "";
 //BA.debugLineNum = 676;BA.debugLine="Sub SetType(varType As String) As VMCalendar";
 //BA.debugLineNum = 677;BA.debugLine="If varType = \"\" Then Return Me";
if ((_vartype).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 678;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 679;BA.debugLine="SetAttrSingle(\"type\", varType)";
_setattrsingle("type",_vartype);
 //BA.debugLineNum = 680;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 682;BA.debugLine="Dim pp As String = $\"${ID}Type\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Type");
 //BA.debugLineNum = 683;BA.debugLine="vue.SetStateSingle(pp, varType)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartype));
 //BA.debugLineNum = 684;BA.debugLine="Calendar.Bind(\":type\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":type",_pp);
 //BA.debugLineNum = 685;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 686;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setvalue(String _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 689;BA.debugLine="Sub SetValue(varValue As String) As VMCalendar";
 //BA.debugLineNum = 690;BA.debugLine="If varValue = \"\" Then Return Me";
if ((_varvalue).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 691;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 692;BA.debugLine="SetAttrSingle(\"value\", varValue)";
_setattrsingle("value",_varvalue);
 //BA.debugLineNum = 693;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 695;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 696;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue));
 //BA.debugLineNum = 697;BA.debugLine="Calendar.Bind(\":value\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":value",_pp);
 //BA.debugLineNum = 698;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 1024;BA.debugLine="Sub SetVElse(vif As String) As VMCalendar";
 //BA.debugLineNum = 1025;BA.debugLine="Calendar.SetVElse(vif)";
_calendar._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 1026;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1027;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 1047;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 1048;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 1049;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 1050;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 1051;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 1052;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1053;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 1034;BA.debugLine="Sub SetVhtml(vhtml As String) As VMCalendar";
 //BA.debugLineNum = 1035;BA.debugLine="Calendar.SetVHtml(vhtml)";
_calendar._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 1036;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1037;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetVIf(vif As String) As VMCalendar";
 //BA.debugLineNum = 173;BA.debugLine="Calendar.SetVIf(vif)";
_calendar._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 1110;BA.debugLine="Sub SetVisible(b As Boolean) As VMCalendar";
 //BA.debugLineNum = 1111;BA.debugLine="Calendar.SetVisible(b)";
_calendar._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 1112;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1113;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetVModel(k As String) As VMCalendar";
 //BA.debugLineNum = 168;BA.debugLine="Calendar.SetVModel(k)";
_calendar._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub SetVShow(vif As String) As VMCalendar";
 //BA.debugLineNum = 178;BA.debugLine="Calendar.SetVShow(vif)";
_calendar._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 1029;BA.debugLine="Sub SetVText(vhtml As String) As VMCalendar";
 //BA.debugLineNum = 1030;BA.debugLine="Calendar.SetVText(vhtml)";
_calendar._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 1031;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 1032;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setweekdayformat(String _varweekdayformat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 702;BA.debugLine="Sub SetWeekdayFormat(varWeekdayFormat As String) A";
 //BA.debugLineNum = 703;BA.debugLine="If varWeekdayFormat = \"\" Then Return Me";
if ((_varweekdayformat).equals("")) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 704;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 705;BA.debugLine="SetAttrSingle(\"weekday-format\", varWeekdayFormat";
_setattrsingle("weekday-format",_varweekdayformat);
 //BA.debugLineNum = 706;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 };
 //BA.debugLineNum = 708;BA.debugLine="Dim pp As String = $\"${ID}WeekdayFormat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"WeekdayFormat");
 //BA.debugLineNum = 709;BA.debugLine="vue.SetStateSingle(pp, varWeekdayFormat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varweekdayformat));
 //BA.debugLineNum = 710;BA.debugLine="Calendar.Bind(\":weekday-format\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":weekday-format",_pp);
 //BA.debugLineNum = 711;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 712;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _setweekdays(anywheresoftware.b4a.objects.collections.List _varweekdays) throws Exception{
String _pp = "";
 //BA.debugLineNum = 889;BA.debugLine="Sub SetWeekdays(varWeekdays As List) As VMCalendar";
 //BA.debugLineNum = 890;BA.debugLine="If bStatic Then Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vmcalendar)(this);};
 //BA.debugLineNum = 891;BA.debugLine="Dim pp As String = $\"${ID}Weekdays\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Weekdays");
 //BA.debugLineNum = 892;BA.debugLine="vue.SetStateSingle(pp, varWeekdays)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varweekdays.getObject()));
 //BA.debugLineNum = 893;BA.debugLine="Calendar.Bind(\":weekdays\", pp)";
_calendar._bind /*b4j.example.vmelement*/ (":weekdays",_pp);
 //BA.debugLineNum = 894;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 895;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _show() throws Exception{
 //BA.debugLineNum = 905;BA.debugLine="Sub Show As VMCalendar";
 //BA.debugLineNum = 906;BA.debugLine="Calendar.SetVisible(True)";
_calendar._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 907;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 908;BA.debugLine="End Sub";
return null;
}
public String  _shownext() throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub ShowNext";
 //BA.debugLineNum = 118;BA.debugLine="vue.refs.GetField(ID).RunMethod(\"next\", Null)";
_vue._refs /*com.ab.banano.BANanoObject*/ .GetField(_id).RunMethod("next",__c.Null);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public String  _showprevious() throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub ShowPrevious";
 //BA.debugLineNum = 113;BA.debugLine="vue.refs.GetField(ID).RunMethod(\"prev\", Null)";
_vue._refs /*com.ab.banano.BANanoObject*/ .GetField(_id).RunMethod("prev",__c.Null);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 145;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 146;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 147;BA.debugLine="Dim eName As String = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 148;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 149;BA.debugLine="Log($\"VMCalendar.${eName} event has not been def";
__c.Log(("VMCalendar."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 //BA.debugLineNum = 151;BA.debugLine="eName = $\"${ID}_clickdate\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_clickdate");
 //BA.debugLineNum = 152;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 153;BA.debugLine="Log($\"VMCalendar.${eName} event has not been def";
__c.Log(("VMCalendar."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 //BA.debugLineNum = 155;BA.debugLine="eName = $\"${ID}_clickmore\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_clickmore");
 //BA.debugLineNum = 156;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 157;BA.debugLine="Log($\"VMCalendar.${eName} event has not been def";
__c.Log(("VMCalendar."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 //BA.debugLineNum = 159;BA.debugLine="eName = $\"${ID}_clickevent\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_clickevent");
 //BA.debugLineNum = 160;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 161;BA.debugLine="Log($\"VMCalendar.${eName} event has not been def";
__c.Log(("VMCalendar."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 164;BA.debugLine="Return Calendar.ToString";
if (true) return _calendar._tostring /*String*/ ();
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public String  _update() throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub Update";
 //BA.debugLineNum = 140;BA.debugLine="vue.SetData(eventsName, events)";
_vue._setdata /*b4j.example.bananovue*/ (_eventsname,(Object)(_events.getObject()));
 //BA.debugLineNum = 141;BA.debugLine="vue.SetData(categoryName, categories)";
_vue._setdata /*b4j.example.bananovue*/ (_categoryname,(Object)(_categories.getObject()));
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcalendar  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 937;BA.debugLine="Sub UseTheme(themeName As String) As VMCalendar";
 //BA.debugLineNum = 938;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 939;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 940;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 941;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 942;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 944;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcalendar)(this);
 //BA.debugLineNum = 945;BA.debugLine="End Sub";
return null;
}
public String  _weekview() throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub WeekView";
 //BA.debugLineNum = 88;BA.debugLine="SetType(\"week\")";
_settype("week");
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
