package b4j.example;


import anywheresoftware.b4a.BA;

public class modrealtimelogging extends Object{
public static modrealtimelogging mostCurrent = new modrealtimelogging();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modrealtimelogging", null);
		ba.loadHtSubs(modrealtimelogging.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modrealtimelogging", ba);
		}
	}
    public static Class<?> getObject() {
		return modrealtimelogging.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _name = "";
public static String _title = "";
public static b4j.example.bananovm _vm = null;
public static b4j.example.bananovue _vue = null;
public static anywheresoftware.b4a.objects.collections.Map _icons = null;
public static anywheresoftware.b4a.objects.collections.List _colors = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moditemgroups _moditemgroups = null;
public static b4j.example.modcalendar _modcalendar = null;
public static b4j.example.modcard _modcard = null;
public static b4j.example.modsparkline _modsparkline = null;
public static b4j.example.modbuttons _modbuttons = null;
public static b4j.example.modchips _modchips = null;
public static b4j.example.moddialog _moddialog = null;
public static b4j.example.modbadges _modbadges = null;
public static b4j.example.modtabs _modtabs = null;
public static b4j.example.modalert _modalert = null;
public static b4j.example.modautocomplete _modautocomplete = null;
public static b4j.example.modavatar _modavatar = null;
public static b4j.example.modbanner _modbanner = null;
public static b4j.example.modbottomnavigation _modbottomnavigation = null;
public static b4j.example.modbottomsheet _modbottomsheet = null;
public static b4j.example.modbreadcrumbs _modbreadcrumbs = null;
public static b4j.example.modcarousel _modcarousel = null;
public static b4j.example.modcheckbox _modcheckbox = null;
public static b4j.example.modcolorpicker _modcolorpicker = null;
public static b4j.example.modcombo _modcombo = null;
public static b4j.example.moddatatable _moddatatable = null;
public static b4j.example.moddatepicker _moddatepicker = null;
public static b4j.example.moddesign _moddesign = null;
public static b4j.example.modexpansionpanels _modexpansionpanels = null;
public static b4j.example.modfileinput _modfileinput = null;
public static b4j.example.modform _modform = null;
public static b4j.example.modgrid _modgrid = null;
public static b4j.example.modicons _modicons = null;
public static b4j.example.modimages _modimages = null;
public static b4j.example.modlists _modlists = null;
public static b4j.example.modloadingskeleton _modloadingskeleton = null;
public static b4j.example.modmenus _modmenus = null;
public static b4j.example.modmessageboard _modmessageboard = null;
public static b4j.example.modoverlay _modoverlay = null;
public static b4j.example.modpagination _modpagination = null;
public static b4j.example.modparallax _modparallax = null;
public static b4j.example.modprogress _modprogress = null;
public static b4j.example.modradiogroups _modradiogroups = null;
public static b4j.example.modrating _modrating = null;
public static b4j.example.modselects _modselects = null;
public static b4j.example.modslidegroups _modslidegroups = null;
public static b4j.example.modslider _modslider = null;
public static b4j.example.modsnackbar _modsnackbar = null;
public static b4j.example.modstepper _modstepper = null;
public static b4j.example.modswitch _modswitch = null;
public static b4j.example.modtextarea _modtextarea = null;
public static b4j.example.modtextfield _modtextfield = null;
public static b4j.example.modtimeline _modtimeline = null;
public static b4j.example.modtimepicker _modtimepicker = null;
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.modtoolkit _modtoolkit = null;
public static b4j.example.modtreeview _modtreeview = null;
public static b4j.example.modwindow _modwindow = null;
public static b4j.example.pgbrs _pgbrs = null;
public static b4j.example.bananoshared _bananoshared = null;
public static String  _addevent() throws Exception{
anywheresoftware.b4a.objects.collections.Map _alert = null;
String _color = "";
anywheresoftware.b4a.objects.collections.Map _firstitem = null;
String _previouscolor = "";
int _nonce = 0;
 //BA.debugLineNum = 127;BA.debugLine="Sub addevent()";
 //BA.debugLineNum = 129;BA.debugLine="Dim alert As Map = genAlert";
_alert = new anywheresoftware.b4a.objects.collections.Map();
_alert = _genalert();
 //BA.debugLineNum = 130;BA.debugLine="Dim color As String = alert.get(\"color\")";
_color = BA.ObjectToString(_alert.Get((Object)("color")));
 //BA.debugLineNum = 132;BA.debugLine="Dim firstitem As Map = vue.ListFirstItem(\"mashlog";
_firstitem = new anywheresoftware.b4a.objects.collections.Map();
_firstitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_vue._listfirstitem /*Object*/ ("mashlogs")));
 //BA.debugLineNum = 134;BA.debugLine="Dim previousColor As String = firstitem.get(\"colo";
_previouscolor = BA.ObjectToString(_firstitem.Get((Object)("color")));
 //BA.debugLineNum = 136;BA.debugLine="Do While previousColor = color";
while ((_previouscolor).equals(_color)) {
 //BA.debugLineNum = 138;BA.debugLine="color = genColor";
_color = _gencolor();
 }
;
 //BA.debugLineNum = 141;BA.debugLine="Dim nonce As Int = vue.StateIncrement(\"nonce\")";
_nonce = _vue._stateincrement /*int*/ ("nonce");
 //BA.debugLineNum = 143;BA.debugLine="alert.Put(\"id\", nonce)";
_alert.Put((Object)("id"),(Object)(_nonce));
 //BA.debugLineNum = 144;BA.debugLine="vue.ListUnshift(\"mashlogs\", alert)";
_vue._listunshift /*String*/ ("mashlogs",(Object)(_alert.getObject()));
 //BA.debugLineNum = 146;BA.debugLine="If (nonce > 6) Then";
if ((_nonce>6)) { 
 //BA.debugLineNum = 148;BA.debugLine="vue.ListPop(\"mashlogs\")";
_vue._listpop /*String*/ ("mashlogs");
 };
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public static String  _btnreadlog_click(com.ab.banano.BANanoEvent _e) throws Exception{
Object _interval = null;
 //BA.debugLineNum = 98;BA.debugLine="Sub btnReadLog_click(e As BANanoEvent)";
 //BA.debugLineNum = 100;BA.debugLine="Dim interval As Object = vm.getdata(\"interval\")";
_interval = _vm._getdata /*Object*/ ("interval");
 //BA.debugLineNum = 101;BA.debugLine="If BANano.isnull(interval) Or BANano.isundefined(";
if (_banano.IsNull(_interval) || _banano.IsUndefined(_interval)) { 
 //BA.debugLineNum = 102;BA.debugLine="vm.callmethod(\"start\")";
_vm._callmethod /*String*/ ("start");
 }else {
 //BA.debugLineNum = 104;BA.debugLine="vm.callmethod(\"stop\")";
_vm._callmethod /*String*/ ("stop");
 };
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmcard _cardlog = null;
b4j.example.vmbutton _btnreadlog = null;
b4j.example.vmtimeline _tx = null;
b4j.example.vmslidexreversetransition _stran = null;
b4j.example.vmtimelineitem _txi = null;
b4j.example.vmalert _alx = null;
anywheresoftware.b4a.objects.collections.List _mashlogs = null;
anywheresoftware.b4a.objects.collections.Map _logx = null;
String _sicon = "";
 //BA.debugLineNum = 12;BA.debugLine="Sub Code";
 //BA.debugLineNum = 13;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 14;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 16;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modrealtimelogging.getObject());
 //BA.debugLineNum = 18;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="cont.AddRows(5).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (5))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 23;BA.debugLine="Dim cardLog As VMCard";
_cardlog = new b4j.example.vmcard();
 //BA.debugLineNum = 24;BA.debugLine="cardLog.Initialize(vue,\"rtlog\", Me)";
_cardlog._initialize /*b4j.example.vmcard*/ (ba,_vue,"rtlog",modrealtimelogging.getObject());
 //BA.debugLineNum = 25;BA.debugLine="cardLog.AddClass(\"mx-auto\").SetMaxWidth(\"600\")";
_cardlog._addclass /*b4j.example.vmcard*/ ("mx-auto")._setmaxwidth /*b4j.example.vmcard*/ ("600");
 //BA.debugLineNum = 26;BA.debugLine="cardLog.Title.SetColor(vm.COLOR_BLUEGREY)";
_cardlog._title /*b4j.example.vmcardtitle*/ ._setcolor /*b4j.example.vmcardtitle*/ (_vm._color_bluegrey /*String*/ );
 //BA.debugLineNum = 27;BA.debugLine="cardLog.Title.SetTextColor(vm.COLOR_WHITE)";
_cardlog._title /*b4j.example.vmcardtitle*/ ._settextcolor /*b4j.example.vmcardtitle*/ (_vm._color_white /*String*/ );
 //BA.debugLineNum = 28;BA.debugLine="cardLog.Title.AddElement(\"\", \"span\", \"Logs\", Null";
_cardlog._title /*b4j.example.vmcardtitle*/ ._addelement /*b4j.example.vmcardtitle*/ ("","span","Logs",(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("title")}));
 //BA.debugLineNum = 29;BA.debugLine="cardLog.Title.AddSpacer";
_cardlog._title /*b4j.example.vmcardtitle*/ ._addspacer /*b4j.example.vmcardtitle*/ ();
 //BA.debugLineNum = 30;BA.debugLine="Dim btnReadLog As VMButton";
_btnreadlog = new b4j.example.vmbutton();
 //BA.debugLineNum = 31;BA.debugLine="btnReadLog.Initialize(vue, \"btnReadLog\", Me)";
_btnreadlog._initialize /*b4j.example.vmbutton*/ (ba,_vue,"btnReadLog",modrealtimelogging.getObject());
 //BA.debugLineNum = 32;BA.debugLine="btnReadLog.SetLabel(\"Realtime Logging\")";
_btnreadlog._setlabel /*b4j.example.vmbutton*/ ("Realtime Logging");
 //BA.debugLineNum = 33;BA.debugLine="btnReadLog.SetDark(True)";
_btnreadlog._setdark /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 34;BA.debugLine="btnReadLog.SetDepressed(True)";
_btnreadlog._setdepressed /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 35;BA.debugLine="btnReadLog.Bind(\":outlined\", \"interval == null\")";
_btnreadlog._bind /*b4j.example.vmbutton*/ (":outlined","interval == null");
 //BA.debugLineNum = 36;BA.debugLine="btnReadLog.Bind(\":color\", \"interval == null ? 'wh";
_btnreadlog._bind /*b4j.example.vmbutton*/ (":color","interval == null ? 'white' : 'primary'");
 //BA.debugLineNum = 37;BA.debugLine="cardLog.Title.AddButton(btnReadLog)";
_cardlog._title /*b4j.example.vmcardtitle*/ ._addbutton /*b4j.example.vmcardtitle*/ (_btnreadlog);
 //BA.debugLineNum = 39;BA.debugLine="cardLog.Text.AddClass(\"py-0\")";
_cardlog._text /*b4j.example.vmcardtext*/ ._addclass /*b4j.example.vmcardtext*/ ("py-0");
 //BA.debugLineNum = 42;BA.debugLine="Dim tx As VMTimeline";
_tx = new b4j.example.vmtimeline();
 //BA.debugLineNum = 43;BA.debugLine="tx.Initialize(vue, \"tx\", Me).SetDense(True)";
_tx._initialize /*b4j.example.vmtimeline*/ (ba,_vue,"tx",modrealtimelogging.getObject())._setdense /*b4j.example.vmtimeline*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 46;BA.debugLine="Dim stran As VMSlideXReverseTransition";
_stran = new b4j.example.vmslidexreversetransition();
 //BA.debugLineNum = 47;BA.debugLine="stran.Initialize(vue, \"stran\", Me).SetGroup(True)";
_stran._initialize /*b4j.example.vmslidexreversetransition*/ (ba,_vue,"stran",modrealtimelogging.getObject())._setgroup /*b4j.example.vmslidexreversetransition*/ (anywheresoftware.b4a.keywords.Common.True)._sethideonleave /*b4j.example.vmslidexreversetransition*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 49;BA.debugLine="Dim txi As VMTimelineItem";
_txi = new b4j.example.vmtimelineitem();
 //BA.debugLineNum = 50;BA.debugLine="txi.Initialize(vue, \"\", Me)";
_txi._initialize /*b4j.example.vmtimelineitem*/ (ba,_vue,"",modrealtimelogging.getObject());
 //BA.debugLineNum = 51;BA.debugLine="txi.SetVFor(\"item\", \"mashlogs\")";
_txi._setvfor /*b4j.example.vmtimelineitem*/ ("item","mashlogs");
 //BA.debugLineNum = 52;BA.debugLine="txi.Bind(\":key\", \"item.id\")";
_txi._bind /*b4j.example.vmtimelineitem*/ (":key","item.id");
 //BA.debugLineNum = 53;BA.debugLine="txi.Bind(\":color\", \"item.color\")";
_txi._bind /*b4j.example.vmtimelineitem*/ (":color","item.color");
 //BA.debugLineNum = 54;BA.debugLine="txi.SetSmall(True)";
_txi._setsmall /*b4j.example.vmtimelineitem*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 55;BA.debugLine="txi.SetFillDot(True)";
_txi._setfilldot /*b4j.example.vmtimelineitem*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 57;BA.debugLine="Dim alx As VMAlert";
_alx = new b4j.example.vmalert();
 //BA.debugLineNum = 58;BA.debugLine="alx.Initialize(vue, \"\", Me)";
_alx._initialize /*b4j.example.vmalert*/ (ba,_vue,"",modrealtimelogging.getObject());
 //BA.debugLineNum = 59;BA.debugLine="alx.RemoveVModel";
_alx._removevmodel /*b4j.example.vmalert*/ ();
 //BA.debugLineNum = 60;BA.debugLine="alx.Bind(\":color\", \"item.color\")";
_alx._bind /*b4j.example.vmalert*/ (":color","item.color");
 //BA.debugLineNum = 61;BA.debugLine="alx.Bind(\":icon\", \"item.icon\")";
_alx._bind /*b4j.example.vmalert*/ (":icon","item.icon");
 //BA.debugLineNum = 62;BA.debugLine="alx.Bind(\":value\", \"true\")";
_alx._bind /*b4j.example.vmalert*/ (":value","true");
 //BA.debugLineNum = 63;BA.debugLine="alx.SetTextColor(vm.COLOR_WHITE)";
_alx._settextcolor /*b4j.example.vmalert*/ (_vm._color_white /*String*/ );
 //BA.debugLineNum = 64;BA.debugLine="alx.AddContent($\"<h1>{{ item.id }}</h1>\"$)";
_alx._addcontent /*String*/ (("<h1>{{ item.id }}</h1>"));
 //BA.debugLineNum = 65;BA.debugLine="alx.AddContent($\"<p>${BANanoShared.LoremIpsum(1)}";
_alx._addcontent /*String*/ (("<p>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_bananoshared._loremipsum /*String*/ (BA.NumberToString(1))))+"</p>"));
 //BA.debugLineNum = 66;BA.debugLine="txi.SetText(alx.tostring)";
_txi._settext /*b4j.example.vmtimelineitem*/ (_alx._tostring /*String*/ ());
 //BA.debugLineNum = 69;BA.debugLine="stran.SetText(txi.ToString)";
_stran._settext /*String*/ (_txi._tostring /*String*/ ());
 //BA.debugLineNum = 71;BA.debugLine="tx.SetText(stran.tostring)";
_tx._settext /*b4j.example.vmtimeline*/ (_stran._tostring /*String*/ ());
 //BA.debugLineNum = 74;BA.debugLine="cardLog.Text.SetText(tx.tostring)";
_cardlog._text /*b4j.example.vmcardtext*/ ._settext /*b4j.example.vmcardtext*/ (_tx._tostring /*String*/ ());
 //BA.debugLineNum = 76;BA.debugLine="cardLog.AddToContainer(cont,1,1)";
_cardlog._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 79;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 82;BA.debugLine="vm.SetData(\"interval\", Null)";
_vm._setdata /*b4j.example.bananovm*/ ("interval",anywheresoftware.b4a.keywords.Common.Null);
 //BA.debugLineNum = 83;BA.debugLine="COLORS = vue.CreateB4xList(Array(\"info\", \"warning";
_colors = _vue._createb4xlist /*anywheresoftware.b4a.objects.collections.List*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("info"),(Object)("warning"),(Object)("error"),(Object)("success")}));
 //BA.debugLineNum = 84;BA.debugLine="ICONS = CreateMap(\"info\": \"mdi-information\", \"war";
_icons = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("info"),(Object)("mdi-information"),(Object)("warning"),(Object)("mdi-alert"),(Object)("error"),(Object)("mdi-alert-circle"),(Object)("success"),(Object)("mdi-check-circle")});
 //BA.debugLineNum = 85;BA.debugLine="vue.SetMethod(Me, \"start\")";
_vue._setmethod /*b4j.example.bananovue*/ (modrealtimelogging.getObject(),"start");
 //BA.debugLineNum = 86;BA.debugLine="vue.SetMethod(Me, \"stop\")";
_vue._setmethod /*b4j.example.bananovue*/ (modrealtimelogging.getObject(),"stop");
 //BA.debugLineNum = 88;BA.debugLine="Dim mashlogs As List = vue.NewList";
_mashlogs = new anywheresoftware.b4a.objects.collections.List();
_mashlogs = _vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 89;BA.debugLine="Dim logx As Map = CreateMap(\"id\":1, \"color\":\"info";
_logx = new anywheresoftware.b4a.objects.collections.Map();
_logx = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(1),(Object)("color"),(Object)("info")});
 //BA.debugLineNum = 90;BA.debugLine="Dim sicon As String = ICONS.get(\"info\")";
_sicon = BA.ObjectToString(_icons.Get((Object)("info")));
 //BA.debugLineNum = 91;BA.debugLine="logx.Put(\"icon\", sicon)";
_logx.Put((Object)("icon"),(Object)(_sicon));
 //BA.debugLineNum = 92;BA.debugLine="mashlogs.Add(logx)";
_mashlogs.Add((Object)(_logx.getObject()));
 //BA.debugLineNum = 93;BA.debugLine="vue.SetData(\"mashlogs\", mashlogs)";
_vue._setdata /*b4j.example.bananovue*/ ("mashlogs",(Object)(_mashlogs.getObject()));
 //BA.debugLineNum = 94;BA.debugLine="vue.SetData(\"nonce\", 2)";
_vue._setdata /*b4j.example.bananovue*/ ("nonce",(Object)(2));
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _genalert() throws Exception{
String _color = "";
String _icon = "";
anywheresoftware.b4a.objects.collections.Map _res = null;
 //BA.debugLineNum = 153;BA.debugLine="Sub genAlert As Map";
 //BA.debugLineNum = 155;BA.debugLine="Dim color As String = genColor";
_color = _gencolor();
 //BA.debugLineNum = 157;BA.debugLine="Dim icon As String = genIcon(color)";
_icon = _genicon(_color);
 //BA.debugLineNum = 159;BA.debugLine="Dim res As Map = CreateMap()";
_res = new anywheresoftware.b4a.objects.collections.Map();
_res = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 160;BA.debugLine="res.put(\"color\", color)";
_res.Put((Object)("color"),(Object)(_color));
 //BA.debugLineNum = 161;BA.debugLine="res.put(\"icon\", icon)";
_res.Put((Object)("icon"),(Object)(_icon));
 //BA.debugLineNum = 162;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public static String  _gencolor() throws Exception{
String _rcolor = "";
 //BA.debugLineNum = 172;BA.debugLine="Sub genColor As String";
 //BA.debugLineNum = 174;BA.debugLine="Dim rcolor As String = BANanoShared.RandListValue";
_rcolor = BA.ObjectToString(_bananoshared._randlistvalue /*Object*/ (_colors));
 //BA.debugLineNum = 175;BA.debugLine="Return rcolor";
if (true) return _rcolor;
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public static String  _genicon(String _color) throws Exception{
String _sicon = "";
 //BA.debugLineNum = 166;BA.debugLine="Sub genIcon(color As String) As String";
 //BA.debugLineNum = 167;BA.debugLine="Dim sicon As String = ICONS.get(color)";
_sicon = BA.ObjectToString(_icons.Get((Object)(_color)));
 //BA.debugLineNum = 168;BA.debugLine="Return sicon";
if (true) return _sicon;
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"realtimeLogging\"";
_name = "realtimeLogging";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Realtime Logging\"";
_title = "Realtime Logging";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="Private ICONS As Map";
_icons = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="Private COLORS As List";
_colors = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 9;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public static String  _start() throws Exception{
Object _interval = null;
 //BA.debugLineNum = 109;BA.debugLine="Sub start";
 //BA.debugLineNum = 111;BA.debugLine="Dim interval As Object = BANanoShared.SetInterval";
_interval = _bananoshared._setinterval /*Object*/ (modrealtimelogging.getObject(),"addevent",(int) (5000),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 113;BA.debugLine="vue.setdata(\"interval\", interval)";
_vue._setdata /*b4j.example.bananovue*/ ("interval",_interval);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public static String  _stop() throws Exception{
Object _interval = null;
 //BA.debugLineNum = 117;BA.debugLine="Sub stop";
 //BA.debugLineNum = 119;BA.debugLine="Dim interval As Object = vue.getdata(\"interval\")";
_interval = _vue._getdata /*Object*/ ("interval");
 //BA.debugLineNum = 121;BA.debugLine="BANanoShared.clearinterval(interval)";
_bananoshared._clearinterval /*String*/ (_interval);
 //BA.debugLineNum = 123;BA.debugLine="vue.setdata(\"interval\", Null)";
_vue._setdata /*b4j.example.bananovue*/ ("interval",anywheresoftware.b4a.keywords.Common.Null);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
}
