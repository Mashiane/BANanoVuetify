package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcontainer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmcontainer", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcontainer.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _container = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public anywheresoftware.b4a.objects.collections.Map _rows = null;
public anywheresoftware.b4a.objects.collections.Map _columns = null;
public int _lastrow = 0;
public anywheresoftware.b4a.objects.collections.Map _rc = null;
public anywheresoftware.b4a.objects.collections.Map _components = null;
public anywheresoftware.b4a.objects.collections.List _fields = null;
public anywheresoftware.b4a.objects.collections.List _controls = null;
public anywheresoftware.b4a.objects.collections.List _strings = null;
public anywheresoftware.b4a.objects.collections.List _integers = null;
public anywheresoftware.b4a.objects.collections.List _booleans = null;
public anywheresoftware.b4a.objects.collections.List _doubles = null;
public anywheresoftware.b4a.objects.collections.List _dates = null;
public anywheresoftware.b4a.objects.collections.Map _defaults = null;
public anywheresoftware.b4a.objects.collections.Map _required = null;
public String _mode = "";
public int _totalrows = 0;
public anywheresoftware.b4a.objects.collections.Map _sortitm = null;
public anywheresoftware.b4a.objects.collections.List _sortitl = null;
public anywheresoftware.b4a.objects.collections.Map _cells = null;
public anywheresoftware.b4a.objects.collections.Map _visibility = null;
public anywheresoftware.b4a.objects.collections.Map _rowstyles = null;
public boolean _hasinfobox = false;
public anywheresoftware.b4a.objects.collections.List _exclusions = null;
public anywheresoftware.b4a.objects.collections.Map _rowclasses = null;
public anywheresoftware.b4a.objects.collections.Map _attributes = null;
public anywheresoftware.b4a.objects.collections.List _afewoptions = null;
public boolean _bcontrols = false;
public boolean _hasborder = false;
public boolean _showmatrix = false;
public boolean _nogutters = false;
public boolean _cstatic = false;
public boolean _hascontent = false;
public anywheresoftware.b4a.objects.collections.Map _bindings = null;
public boolean _usevshow = false;
public String _showkey = "";
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
public static class _gridrow{
public boolean IsInitialized;
public int Rows;
public anywheresoftware.b4a.objects.collections.List Columns;
public int Row;
public void Initialize() {
IsInitialized = true;
Rows = 0;
Columns = new anywheresoftware.b4a.objects.collections.List();
Row = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _gridcolumn{
public boolean IsInitialized;
public int Columns;
public int sm;
public int md;
public int lg;
public int xl;
public int ofsm;
public int ofmd;
public int oflg;
public int ofxl;
public int orsm;
public int ormd;
public int orlg;
public int orxl;
public int Row;
public int Col;
public void Initialize() {
IsInitialized = true;
Columns = 0;
sm = 0;
md = 0;
lg = 0;
xl = 0;
ofsm = 0;
ofmd = 0;
oflg = 0;
ofxl = 0;
orsm = 0;
ormd = 0;
orlg = 0;
orxl = 0;
Row = 0;
Col = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _eachrow{
public boolean IsInitialized;
public String visibility;
public void Initialize() {
IsInitialized = true;
visibility = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _checkedunchecked{
public boolean IsInitialized;
public String fieldname;
public Object checkedValue;
public Object uncheckedValue;
public void Initialize() {
IsInitialized = true;
fieldname = "";
checkedValue = new Object();
uncheckedValue = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public b4j.example.vmcontainer  _addbooleans(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 1094;BA.debugLine="Sub AddBooleans(i As List) As VMContainer";
 //BA.debugLineNum = 1095;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1096;BA.debugLine="Booleans.Add(s)";
_booleans.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 1098;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1099;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addbuttonaccent(Object _eventhandler,int _row,int _col,String _btnid,String _btntext,boolean _btnraised,String _btntooltip,boolean _btnfitwidth) throws Exception{
b4j.example.vmbutton _el = null;
 //BA.debugLineNum = 1134;BA.debugLine="Sub AddButtonAccent(eventHandler As Object, row As";
 //BA.debugLineNum = 1135;BA.debugLine="Dim el As VMButton";
_el = new b4j.example.vmbutton();
 //BA.debugLineNum = 1136;BA.debugLine="el.Initialize(vue, btnID, eventHandler)";
_el._initialize /*b4j.example.vmbutton*/ (ba,_vue,_btnid,_eventhandler);
 //BA.debugLineNum = 1137;BA.debugLine="el.SetLabel(btnText)";
_el._setlabel /*b4j.example.vmbutton*/ (_btntext);
 //BA.debugLineNum = 1138;BA.debugLine="el.SetAccent(True)";
_el._setaccent /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 1139;BA.debugLine="el.SetBlock(btnFitWidth)";
_el._setblock /*b4j.example.vmbutton*/ (_btnfitwidth);
 //BA.debugLineNum = 1140;BA.debugLine="el.SetToolTip(btnTooltip)";
_el._settooltip /*b4j.example.vmbutton*/ (_btntooltip);
 //BA.debugLineNum = 1141;BA.debugLine="If btnRaised = False Then el.SetTransparent(True)";
if (_btnraised==__c.False) { 
_el._settransparent /*b4j.example.vmbutton*/ (__c.True);};
 //BA.debugLineNum = 1142;BA.debugLine="AddComponent(row, col, el.ToString)";
_addcomponent(_row,_col,_el._tostring /*String*/ ());
 //BA.debugLineNum = 1143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addbuttonprimary(Object _eventhandler,int _row,int _col,String _btnid,String _btntext,boolean _btnraised,String _btntooltip,boolean _btnfitwidth) throws Exception{
b4j.example.vmbutton _el = null;
 //BA.debugLineNum = 1122;BA.debugLine="Sub AddButtonPrimary(eventHandler As Object, row A";
 //BA.debugLineNum = 1123;BA.debugLine="Dim el As VMButton";
_el = new b4j.example.vmbutton();
 //BA.debugLineNum = 1124;BA.debugLine="el.Initialize(vue, btnID, eventHandler)";
_el._initialize /*b4j.example.vmbutton*/ (ba,_vue,_btnid,_eventhandler);
 //BA.debugLineNum = 1125;BA.debugLine="el.SetLabel(btnText)";
_el._setlabel /*b4j.example.vmbutton*/ (_btntext);
 //BA.debugLineNum = 1126;BA.debugLine="el.SetPrimary(True)";
_el._setprimary /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 1127;BA.debugLine="el.SetBlock(btnFitWidth)";
_el._setblock /*b4j.example.vmbutton*/ (_btnfitwidth);
 //BA.debugLineNum = 1128;BA.debugLine="el.SetToolTip(btnTooltip)";
_el._settooltip /*b4j.example.vmbutton*/ (_btntooltip);
 //BA.debugLineNum = 1129;BA.debugLine="If btnRaised = False Then el.SetTransparent(True)";
if (_btnraised==__c.False) { 
_el._settransparent /*b4j.example.vmbutton*/ (__c.True);};
 //BA.debugLineNum = 1130;BA.debugLine="AddComponent(row, col, el.ToString)";
_addcomponent(_row,_col,_el._tostring /*String*/ ());
 //BA.debugLineNum = 1131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 1958;BA.debugLine="Sub AddChild(child As VMElement) As VMContainer";
 //BA.debugLineNum = 1959;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 1960;BA.debugLine="Container.SetText(childHTML)";
_container._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 1961;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 1962;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1963;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 2002;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 2003;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 2004;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 2006;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 1984;BA.debugLine="Sub AddClass(c As String) As VMContainer";
 //BA.debugLineNum = 1985;BA.debugLine="Container.AddClass(c)";
_container._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 1986;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1987;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addclassrc(int _row,int _col,anywheresoftware.b4a.objects.collections.List _classnames) throws Exception{
String _clsname = "";
 //BA.debugLineNum = 1237;BA.debugLine="Sub AddClassRC(row As Int, col As Int, classNames";
 //BA.debugLineNum = 1238;BA.debugLine="For Each clsName As String In classNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _classnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_clsname = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1239;BA.debugLine="SetClassRC(row, col, clsName)";
_setclassrc(_row,_col,_clsname);
 }
};
 //BA.debugLineNum = 1241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1242;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns(int _icolumns,int _sm,int _md,int _lg,int _xl) throws Exception{
 //BA.debugLineNum = 1201;BA.debugLine="Sub AddColumns(iColumns As Int, sm As Int, md As I";
 //BA.debugLineNum = 1202;BA.debugLine="AddColumnsOS(iColumns, 0,0,0,0,sm,md,lg,xl)";
_addcolumnsos(_icolumns,(int) (0),(int) (0),(int) (0),(int) (0),_sm,_md,_lg,_xl);
 //BA.debugLineNum = 1203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns1() throws Exception{
 //BA.debugLineNum = 1403;BA.debugLine="Sub AddColumns1 As VMContainer";
 //BA.debugLineNum = 1404;BA.debugLine="AddColumns(1,\"12\",\"1\",\"1\",\"1\")";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("1")),(int)(Double.parseDouble("1")),(int)(Double.parseDouble("1")));
 //BA.debugLineNum = 1405;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1406;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns10() throws Exception{
 //BA.debugLineNum = 1438;BA.debugLine="Sub AddColumns10 As VMContainer";
 //BA.debugLineNum = 1439;BA.debugLine="AddColumns(1,\"12\",\"10\",\"10\",\"10\")";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("10")),(int)(Double.parseDouble("10")),(int)(Double.parseDouble("10")));
 //BA.debugLineNum = 1440;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1441;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns10p2() throws Exception{
 //BA.debugLineNum = 1363;BA.debugLine="Sub AddColumns10p2 As VMContainer";
 //BA.debugLineNum = 1364;BA.debugLine="AddColumns(1,\"12\",\"10\",\"10\",\"10\").AddColumns(1,\"1";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("10")),(int)(Double.parseDouble("10")),(int)(Double.parseDouble("10")))._addcolumns /*b4j.example.vmcontainer*/ ((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("2")),(int)(Double.parseDouble("2")),(int)(Double.parseDouble("2")));
 //BA.debugLineNum = 1365;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1366;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns11() throws Exception{
 //BA.debugLineNum = 1443;BA.debugLine="Sub AddColumns11 As VMContainer";
 //BA.debugLineNum = 1444;BA.debugLine="AddColumns(1,\"12\",\"11\",\"11\",\"11\")";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("11")),(int)(Double.parseDouble("11")),(int)(Double.parseDouble("11")));
 //BA.debugLineNum = 1445;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1446;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns11p1() throws Exception{
 //BA.debugLineNum = 1353;BA.debugLine="Sub AddColumns11p1 As VMContainer";
 //BA.debugLineNum = 1354;BA.debugLine="AddColumns(1,\"12\",\"11\",\"11\",\"11\").AddColumns(1,\"1";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("11")),(int)(Double.parseDouble("11")),(int)(Double.parseDouble("11")))._addcolumns /*b4j.example.vmcontainer*/ ((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("1")),(int)(Double.parseDouble("1")),(int)(Double.parseDouble("1")));
 //BA.debugLineNum = 1355;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1356;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns12() throws Exception{
 //BA.debugLineNum = 1388;BA.debugLine="Sub AddColumns12 As VMContainer";
 //BA.debugLineNum = 1389;BA.debugLine="AddColumns(1,\"12\",\"12\",\"12\",\"12\")";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("12")));
 //BA.debugLineNum = 1390;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1391;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns12x1() throws Exception{
 //BA.debugLineNum = 1333;BA.debugLine="Sub AddColumns12x1 As VMContainer";
 //BA.debugLineNum = 1334;BA.debugLine="AddColumns(12,\"12\",\"1\",\"1\",\"1\")";
_addcolumns((int) (12),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("1")),(int)(Double.parseDouble("1")),(int)(Double.parseDouble("1")));
 //BA.debugLineNum = 1335;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns1p11() throws Exception{
 //BA.debugLineNum = 1348;BA.debugLine="Sub AddColumns1p11 As VMContainer";
 //BA.debugLineNum = 1349;BA.debugLine="AddColumns(1,\"12\",\"1\",\"1\",\"1\").AddColumns(1,\"12\",";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("1")),(int)(Double.parseDouble("1")),(int)(Double.parseDouble("1")))._addcolumns /*b4j.example.vmcontainer*/ ((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("11")),(int)(Double.parseDouble("11")),(int)(Double.parseDouble("11")));
 //BA.debugLineNum = 1350;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1351;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns2() throws Exception{
 //BA.debugLineNum = 1398;BA.debugLine="Sub AddColumns2 As VMContainer";
 //BA.debugLineNum = 1399;BA.debugLine="AddColumns(1,\"12\",\"2\",\"2\",\"2\")";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("2")),(int)(Double.parseDouble("2")),(int)(Double.parseDouble("2")));
 //BA.debugLineNum = 1400;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1401;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns2p10() throws Exception{
 //BA.debugLineNum = 1358;BA.debugLine="Sub AddColumns2p10 As VMContainer";
 //BA.debugLineNum = 1359;BA.debugLine="AddColumns(1,\"12\",\"2\",\"2\",\"2\").AddColumns(1,\"12\",";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("2")),(int)(Double.parseDouble("2")),(int)(Double.parseDouble("2")))._addcolumns /*b4j.example.vmcontainer*/ ((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("10")),(int)(Double.parseDouble("10")),(int)(Double.parseDouble("10")));
 //BA.debugLineNum = 1360;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1361;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns2x6() throws Exception{
 //BA.debugLineNum = 1323;BA.debugLine="Sub AddColumns2x6 As VMContainer";
 //BA.debugLineNum = 1324;BA.debugLine="AddColumns(2,\"12\",\"6\",\"6\",\"6\")";
_addcolumns((int) (2),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("6")),(int)(Double.parseDouble("6")),(int)(Double.parseDouble("6")));
 //BA.debugLineNum = 1325;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1326;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns3() throws Exception{
 //BA.debugLineNum = 1408;BA.debugLine="Sub AddColumns3 As VMContainer";
 //BA.debugLineNum = 1409;BA.debugLine="AddColumns(1,\"12\",\"3\",\"3\",\"3\")";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("3")),(int)(Double.parseDouble("3")),(int)(Double.parseDouble("3")));
 //BA.debugLineNum = 1410;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns3p9() throws Exception{
 //BA.debugLineNum = 1368;BA.debugLine="Sub AddColumns3p9 As VMContainer";
 //BA.debugLineNum = 1369;BA.debugLine="AddColumns(1,\"12\",\"3\",\"3\",\"3\").AddColumns(1,\"12\",";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("3")),(int)(Double.parseDouble("3")),(int)(Double.parseDouble("3")))._addcolumns /*b4j.example.vmcontainer*/ ((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("9")),(int)(Double.parseDouble("9")),(int)(Double.parseDouble("9")));
 //BA.debugLineNum = 1370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns3x4() throws Exception{
 //BA.debugLineNum = 1313;BA.debugLine="Sub AddColumns3x4 As VMContainer";
 //BA.debugLineNum = 1314;BA.debugLine="AddColumns(3,\"12\",\"4\",\"4\",\"4\")";
_addcolumns((int) (3),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("4")),(int)(Double.parseDouble("4")),(int)(Double.parseDouble("4")));
 //BA.debugLineNum = 1315;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1316;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns4() throws Exception{
 //BA.debugLineNum = 1413;BA.debugLine="Sub AddColumns4 As VMContainer";
 //BA.debugLineNum = 1414;BA.debugLine="AddColumns(1,\"12\",\"4\",\"4\",\"4\")";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("4")),(int)(Double.parseDouble("4")),(int)(Double.parseDouble("4")));
 //BA.debugLineNum = 1415;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1416;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns4p8() throws Exception{
 //BA.debugLineNum = 1343;BA.debugLine="Sub AddColumns4p8 As VMContainer";
 //BA.debugLineNum = 1344;BA.debugLine="AddColumns(1,\"12\",\"4\",\"4\",\"4\").AddColumns(1,\"12\",";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("4")),(int)(Double.parseDouble("4")),(int)(Double.parseDouble("4")))._addcolumns /*b4j.example.vmcontainer*/ ((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("8")),(int)(Double.parseDouble("8")),(int)(Double.parseDouble("8")));
 //BA.debugLineNum = 1345;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1346;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns4x3() throws Exception{
 //BA.debugLineNum = 1318;BA.debugLine="Sub AddColumns4x3 As VMContainer";
 //BA.debugLineNum = 1319;BA.debugLine="AddColumns(4,\"12\",\"3\",\"3\",\"3\")";
_addcolumns((int) (4),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("3")),(int)(Double.parseDouble("3")),(int)(Double.parseDouble("3")));
 //BA.debugLineNum = 1320;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1321;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns5() throws Exception{
 //BA.debugLineNum = 1418;BA.debugLine="Sub AddColumns5 As VMContainer";
 //BA.debugLineNum = 1419;BA.debugLine="AddColumns(1,\"12\",\"5\",\"5\",\"5\")";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("5")),(int)(Double.parseDouble("5")),(int)(Double.parseDouble("5")));
 //BA.debugLineNum = 1420;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1421;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns5p7() throws Exception{
 //BA.debugLineNum = 1383;BA.debugLine="Sub AddColumns5p7 As VMContainer";
 //BA.debugLineNum = 1384;BA.debugLine="AddColumns(1,\"12\",\"5\",\"5\",\"5\").AddColumns(1,\"12\",";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("5")),(int)(Double.parseDouble("5")),(int)(Double.parseDouble("5")))._addcolumns /*b4j.example.vmcontainer*/ ((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("7")),(int)(Double.parseDouble("7")),(int)(Double.parseDouble("7")));
 //BA.debugLineNum = 1385;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1386;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns6() throws Exception{
 //BA.debugLineNum = 1393;BA.debugLine="Sub AddColumns6 As VMContainer";
 //BA.debugLineNum = 1394;BA.debugLine="AddColumns(1,\"12\",\"6\",\"6\",\"6\")";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("6")),(int)(Double.parseDouble("6")),(int)(Double.parseDouble("6")));
 //BA.debugLineNum = 1395;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1396;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns6x2() throws Exception{
 //BA.debugLineNum = 1328;BA.debugLine="Sub AddColumns6x2 As VMContainer";
 //BA.debugLineNum = 1329;BA.debugLine="AddColumns(6,\"12\",\"2\",\"2\",\"2\")";
_addcolumns((int) (6),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("2")),(int)(Double.parseDouble("2")),(int)(Double.parseDouble("2")));
 //BA.debugLineNum = 1330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns7() throws Exception{
 //BA.debugLineNum = 1423;BA.debugLine="Sub AddColumns7 As VMContainer";
 //BA.debugLineNum = 1424;BA.debugLine="AddColumns(1,\"12\",\"7\",\"7\",\"7\")";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("7")),(int)(Double.parseDouble("7")),(int)(Double.parseDouble("7")));
 //BA.debugLineNum = 1425;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1426;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns7p5() throws Exception{
 //BA.debugLineNum = 1378;BA.debugLine="Sub AddColumns7p5 As VMContainer";
 //BA.debugLineNum = 1379;BA.debugLine="AddColumns(1,\"12\",\"7\",\"7\",\"7\").AddColumns(1,\"12\",";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("7")),(int)(Double.parseDouble("7")),(int)(Double.parseDouble("7")))._addcolumns /*b4j.example.vmcontainer*/ ((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("5")),(int)(Double.parseDouble("5")),(int)(Double.parseDouble("5")));
 //BA.debugLineNum = 1380;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1381;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns8() throws Exception{
 //BA.debugLineNum = 1428;BA.debugLine="Sub AddColumns8 As VMContainer";
 //BA.debugLineNum = 1429;BA.debugLine="AddColumns(1,\"12\",\"8\",\"8\",\"8\")";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("8")),(int)(Double.parseDouble("8")),(int)(Double.parseDouble("8")));
 //BA.debugLineNum = 1430;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1431;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns8p4() throws Exception{
 //BA.debugLineNum = 1338;BA.debugLine="Sub AddColumns8p4 As VMContainer";
 //BA.debugLineNum = 1339;BA.debugLine="AddColumns(1,\"12\",\"8\",\"8\",\"8\").AddColumns(1,\"12\",";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("8")),(int)(Double.parseDouble("8")),(int)(Double.parseDouble("8")))._addcolumns /*b4j.example.vmcontainer*/ ((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("4")),(int)(Double.parseDouble("4")),(int)(Double.parseDouble("4")));
 //BA.debugLineNum = 1340;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1341;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns9() throws Exception{
 //BA.debugLineNum = 1433;BA.debugLine="Sub AddColumns9 As VMContainer";
 //BA.debugLineNum = 1434;BA.debugLine="AddColumns(1,\"12\",\"9\",\"9\",\"9\")";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("9")),(int)(Double.parseDouble("9")),(int)(Double.parseDouble("9")));
 //BA.debugLineNum = 1435;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumns9p3() throws Exception{
 //BA.debugLineNum = 1373;BA.debugLine="Sub AddColumns9p3 As VMContainer";
 //BA.debugLineNum = 1374;BA.debugLine="AddColumns(1,\"12\",\"9\",\"9\",\"9\").AddColumns(1,\"12\",";
_addcolumns((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("9")),(int)(Double.parseDouble("9")),(int)(Double.parseDouble("9")))._addcolumns /*b4j.example.vmcontainer*/ ((int) (1),(int)(Double.parseDouble("12")),(int)(Double.parseDouble("3")),(int)(Double.parseDouble("3")),(int)(Double.parseDouble("3")));
 //BA.debugLineNum = 1375;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1376;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addcolumnsos(int _icolumns,int _osm,int _omd,int _olg,int _oxl,int _sm,int _md,int _lg,int _xl) throws Exception{
b4j.example.vmcontainer._gridcolumn _ncol = null;
String _rowkey = "";
b4j.example.vmcontainer._gridrow _oldrow = null;
 //BA.debugLineNum = 1207;BA.debugLine="Sub AddColumnsOS(iColumns As Int, osm As Int, omd";
 //BA.debugLineNum = 1208;BA.debugLine="Dim nCol As GridColumn";
_ncol = new b4j.example.vmcontainer._gridcolumn();
 //BA.debugLineNum = 1209;BA.debugLine="nCol.Initialize";
_ncol.Initialize();
 //BA.debugLineNum = 1210;BA.debugLine="nCol.Columns = iColumns";
_ncol.Columns /*int*/  = _icolumns;
 //BA.debugLineNum = 1211;BA.debugLine="nCol.Row = 0";
_ncol.Row /*int*/  = (int) (0);
 //BA.debugLineNum = 1212;BA.debugLine="nCol.Col = 0";
_ncol.Col /*int*/  = (int) (0);
 //BA.debugLineNum = 1213;BA.debugLine="nCol.lg = lg";
_ncol.lg /*int*/  = _lg;
 //BA.debugLineNum = 1214;BA.debugLine="nCol.md = md";
_ncol.md /*int*/  = _md;
 //BA.debugLineNum = 1215;BA.debugLine="nCol.sm = sm";
_ncol.sm /*int*/  = _sm;
 //BA.debugLineNum = 1216;BA.debugLine="nCol.xl = xl";
_ncol.xl /*int*/  = _xl;
 //BA.debugLineNum = 1217;BA.debugLine="nCol.oflg = olg";
_ncol.oflg /*int*/  = _olg;
 //BA.debugLineNum = 1218;BA.debugLine="nCol.ofmd = omd";
_ncol.ofmd /*int*/  = _omd;
 //BA.debugLineNum = 1219;BA.debugLine="nCol.ofsm = osm";
_ncol.ofsm /*int*/  = _osm;
 //BA.debugLineNum = 1220;BA.debugLine="nCol.ofxl = oxl";
_ncol.ofxl /*int*/  = _oxl;
 //BA.debugLineNum = 1222;BA.debugLine="Dim rowkey As String = $\"${ID}r${LastRow}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_lastrow))+"");
 //BA.debugLineNum = 1224;BA.debugLine="If Rows.ContainsKey(rowkey) Then";
if (_rows.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 1226;BA.debugLine="Dim oldRow As GridRow = Rows.Get(rowkey)";
_oldrow = (b4j.example.vmcontainer._gridrow)(_rows.Get((Object)(_rowkey)));
 //BA.debugLineNum = 1228;BA.debugLine="oldRow.Columns.Add(nCol)";
_oldrow.Columns /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_ncol));
 //BA.debugLineNum = 1230;BA.debugLine="Rows.Put(rowkey,oldRow)";
_rows.Put((Object)(_rowkey),(Object)(_oldrow));
 };
 //BA.debugLineNum = 1232;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 1233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1234;BA.debugLine="End Sub";
return null;
}
public String  _addcomponent(int _rowpos,int _colpos,String _elhtml) throws Exception{
String _cellkey = "";
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 1806;BA.debugLine="Sub AddComponent(rowPos As Int, colPos As Int, elH";
 //BA.debugLineNum = 1807;BA.debugLine="rowPos = CStr(rowPos)";
_rowpos = (int)(Double.parseDouble(_cstr((Object)(_rowpos))));
 //BA.debugLineNum = 1808;BA.debugLine="colPos = CStr(colPos)";
_colpos = (int)(Double.parseDouble(_cstr((Object)(_colpos))));
 //BA.debugLineNum = 1809;BA.debugLine="If rowPos = \"0\" And colPos = \"0\" Then";
if (_rowpos==(double)(Double.parseDouble("0")) && _colpos==(double)(Double.parseDouble("0"))) { 
 //BA.debugLineNum = 1810;BA.debugLine="SetText(elHTML)";
_settext(_elhtml);
 }else {
 //BA.debugLineNum = 1812;BA.debugLine="Dim cellKey As String = $\"${ID}r${rowPos}c${colP";
_cellkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_rowpos))+"c"+__c.SmartStringFormatter("",(Object)(_colpos))+"");
 //BA.debugLineNum = 1813;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1814;BA.debugLine="If Components.ContainsKey(cellKey) Then";
if (_components.ContainsKey((Object)(_cellkey))) { 
 //BA.debugLineNum = 1815;BA.debugLine="lst = Components.Get(cellKey)";
_lst = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_components.Get((Object)(_cellkey))));
 }else {
 //BA.debugLineNum = 1817;BA.debugLine="lst.Initialize";
_lst.Initialize();
 };
 //BA.debugLineNum = 1819;BA.debugLine="lst.Add(elHTML)";
_lst.Add((Object)(_elhtml));
 //BA.debugLineNum = 1820;BA.debugLine="Components.Put(cellKey,lst)";
_components.Put((Object)(_cellkey),(Object)(_lst.getObject()));
 };
 //BA.debugLineNum = 1822;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 1823;BA.debugLine="End Sub";
return "";
}
public String  _addcontrol(b4j.example.vmelement _el,String _template,String _r,String _c,String _os,String _om,String _ol,String _oxl,String _s,String _m,String _l,String _xl) throws Exception{
 //BA.debugLineNum = 1826;BA.debugLine="Sub AddControl(el As VMElement, template As String";
 //BA.debugLineNum = 1827;BA.debugLine="el.SetDeviceOffsets(os, om, ol,oxl)";
_el._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_oxl);
 //BA.debugLineNum = 1828;BA.debugLine="el.SetDevicePositions(r, c, s, m, l, xl)";
_el._setdevicepositions /*b4j.example.vmelement*/ (_r,_c,_s,_m,_l,_xl);
 //BA.debugLineNum = 1829;BA.debugLine="AddControl1(el, template)";
_addcontrol1(_el,_template);
 //BA.debugLineNum = 1830;BA.debugLine="End Sub";
return "";
}
public String  _addcontrol1(b4j.example.vmelement _el,String _template) throws Exception{
String _r = "";
String _c = "";
String _srow = "";
String _scell = "";
String _rckey = "";
String _diskey = "";
String _enakey = "";
String _errkey = "";
b4j.example.vmcontainer._checkedunchecked _newoption = null;
 //BA.debugLineNum = 1847;BA.debugLine="Sub AddControl1(el As VMElement, template As Strin";
 //BA.debugLineNum = 1848;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 1849;BA.debugLine="Controls.Add(el)";
_controls.Add((Object)(_el));
 //BA.debugLineNum = 1850;BA.debugLine="bControls = True";
_bcontrols = __c.True;
 //BA.debugLineNum = 1852;BA.debugLine="Dim r As String = el.R";
_r = _el._r /*String*/ ;
 //BA.debugLineNum = 1854;BA.debugLine="Dim c As String = el.c";
_c = _el._c /*String*/ ;
 //BA.debugLineNum = 1856;BA.debugLine="If el.CenterOnParent = True Then";
if (_el._centeronparent /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1857;BA.debugLine="SetJustifyRC(r, c, \"center\")";
_setjustifyrc((int)(Double.parseDouble(_r)),(int)(Double.parseDouble(_c)),"center");
 //BA.debugLineNum = 1858;BA.debugLine="SetAlignRC(r, c, \"center\")";
_setalignrc((int)(Double.parseDouble(_r)),(int)(Double.parseDouble(_c)),"center");
 //BA.debugLineNum = 1859;BA.debugLine="AddClassRC(r, c, Array(\"mx-auto\"))";
_addclassrc((int)(Double.parseDouble(_r)),(int)(Double.parseDouble(_c)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("mx-auto")}));
 };
 //BA.debugLineNum = 1862;BA.debugLine="Dim sRow As String = vue.PadRight(r,2,\"0\")";
_srow = _vue._padright /*String*/ (_r,(int) (2),"0");
 //BA.debugLineNum = 1863;BA.debugLine="Dim sCell As String = vue.PadRight(c,2,\"0\")";
_scell = _vue._padright /*String*/ (_c,(int) (2),"0");
 //BA.debugLineNum = 1864;BA.debugLine="Dim rcKey As String = $\"${sRow}.${sCell}\"$";
_rckey = (""+__c.SmartStringFormatter("",(Object)(_srow))+"."+__c.SmartStringFormatter("",(Object)(_scell))+"");
 //BA.debugLineNum = 1866;BA.debugLine="sortitM.Put(rcKey, el)";
_sortitm.Put((Object)(_rckey),(Object)(_el));
 //BA.debugLineNum = 1867;BA.debugLine="If BANano.parseInt(r) > TotalRows Then";
if (_banano.parseInt((Object)(_r))>_totalrows) { 
 //BA.debugLineNum = 1868;BA.debugLine="TotalRows = BANano.parseInt(r)";
_totalrows = _banano.parseInt((Object)(_r));
 };
 //BA.debugLineNum = 1871;BA.debugLine="Dim showKey As String = $\"${el.vmodel}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_el._vmodel /*String*/ ))+"show");
 //BA.debugLineNum = 1872;BA.debugLine="Dim disKey As String = $\"${el.vmodel}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_el._vmodel /*String*/ ))+"disabled");
 //BA.debugLineNum = 1873;BA.debugLine="Dim enaKey As String = $\"${el.vmodel}required\"$";
_enakey = (""+__c.SmartStringFormatter("",(Object)(_el._vmodel /*String*/ ))+"required");
 //BA.debugLineNum = 1874;BA.debugLine="Dim errKey As String = $\"${el.vmodel}error\"$";
_errkey = (""+__c.SmartStringFormatter("",(Object)(_el._vmodel /*String*/ ))+"error");
 //BA.debugLineNum = 1875;BA.debugLine="visibility.Put(showKey, el.Isvisible)";
_visibility.Put((Object)(_showkey),(Object)(_el._isvisible /*boolean*/ ));
 //BA.debugLineNum = 1877;BA.debugLine="AddComponent(el.r, el.C, template)";
_addcomponent((int)(Double.parseDouble(_el._r /*String*/ )),(int)(Double.parseDouble(_el._c /*String*/ )),_template);
 //BA.debugLineNum = 1878;BA.debugLine="Select Case el.typeOf";
switch (BA.switchObjectToInt(_el._typeof /*String*/ ,"checkbox","switchbox","switch")) {
case 0: 
case 1: 
case 2: {
 //BA.debugLineNum = 1880;BA.debugLine="Dim newoption As CheckedUnchecked";
_newoption = new b4j.example.vmcontainer._checkedunchecked();
 //BA.debugLineNum = 1881;BA.debugLine="newoption.Initialize";
_newoption.Initialize();
 //BA.debugLineNum = 1882;BA.debugLine="newoption.fieldname = el.vmodel";
_newoption.fieldname /*String*/  = _el._vmodel /*String*/ ;
 //BA.debugLineNum = 1883;BA.debugLine="newoption.checkedValue = el.Value";
_newoption.checkedValue /*Object*/  = _el._value /*Object*/ ;
 //BA.debugLineNum = 1884;BA.debugLine="newoption.uncheckedValue = el.UncheckedValue";
_newoption.uncheckedValue /*Object*/  = _el._uncheckedvalue /*Object*/ ;
 //BA.debugLineNum = 1885;BA.debugLine="afewoptions.Add(newoption)";
_afewoptions.Add((Object)(_newoption));
 break; }
}
;
 //BA.debugLineNum = 1888;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1889;BA.debugLine="vue.SetStateSingle(showKey, el.Isvisible)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_showkey,(Object)(_el._isvisible /*boolean*/ ));
 //BA.debugLineNum = 1890;BA.debugLine="vue.SetStateSingle(disKey, el.IsDisabled)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_diskey,(Object)(_el._isdisabled /*boolean*/ ));
 //BA.debugLineNum = 1891;BA.debugLine="vue.SetStateSingle(enaKey, el.IsRequired)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_enakey,(Object)(_el._isrequired /*boolean*/ ));
 //BA.debugLineNum = 1892;BA.debugLine="If el.isarray Then";
if (_el._isarray /*boolean*/ ) { 
 //BA.debugLineNum = 1893;BA.debugLine="vue.SetStateSingle(el.vmodel, vue.newlist)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_el._vmodel /*String*/ ,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 }else {
 //BA.debugLineNum = 1895;BA.debugLine="vue.SetStateSingle(el.vmodel, el.Value)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_el._vmodel /*String*/ ,_el._value /*Object*/ );
 };
 //BA.debugLineNum = 1897;BA.debugLine="vue.SetStateSingle(errKey, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_errkey,(Object)(__c.False));
 };
 //BA.debugLineNum = 1899;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _addcontrolonly(b4j.example.vmelement _el,String _template) throws Exception{
 //BA.debugLineNum = 1833;BA.debugLine="Sub AddControlOnly(el As VMElement, template As St";
 //BA.debugLineNum = 1834;BA.debugLine="AddControl1(el, template)";
_addcontrol1(_el,_template);
 //BA.debugLineNum = 1835;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1836;BA.debugLine="End Sub";
return null;
}
public String  _addcontrols(b4j.example.vmelement _ctl,String _template,String _r,String _c,String _s,String _m,String _l,String _xl) throws Exception{
 //BA.debugLineNum = 997;BA.debugLine="Sub AddControlS(ctl As VMElement, template As Stri";
 //BA.debugLineNum = 998;BA.debugLine="AddControl(ctl, template, r, c, 0,0,0,0,s,m,l,xl)";
_addcontrol(_ctl,_template,_r,_c,BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),_s,_m,_l,_xl);
 //BA.debugLineNum = 999;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _adddates(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 1101;BA.debugLine="Sub AddDates(i As List) As VMContainer";
 //BA.debugLineNum = 1102;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1103;BA.debugLine="Dates.Add(s)";
_dates.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 1105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _adddoubles(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
String _s = "";
 //BA.debugLineNum = 1108;BA.debugLine="Sub AddDoubles(d As List) As VMContainer";
 //BA.debugLineNum = 1109;BA.debugLine="For Each s As String In d";
{
final anywheresoftware.b4a.BA.IterableList group1 = _d;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1110;BA.debugLine="Doubles.Add(s)";
_doubles.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 1112;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1113;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addexclusion(anywheresoftware.b4a.objects.collections.List _them) throws Exception{
String _k = "";
 //BA.debugLineNum = 949;BA.debugLine="Sub AddExclusion(them As List) As VMContainer";
 //BA.debugLineNum = 950;BA.debugLine="For Each k As String In them";
{
final anywheresoftware.b4a.BA.IterableList group1 = _them;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 951;BA.debugLine="Exclusions.Add(k)";
_exclusions.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 953;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 954;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addhtml(String _htmlcontent) throws Exception{
 //BA.debugLineNum = 1972;BA.debugLine="Sub AddHTML(htmlContent As String) As VMContainer";
 //BA.debugLineNum = 1973;BA.debugLine="Container.SetText(htmlContent)";
_container._settext /*b4j.example.vmelement*/ (_htmlcontent);
 //BA.debugLineNum = 1974;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 1975;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1976;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addintegers(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 1080;BA.debugLine="Sub AddIntegers(i As List) As VMContainer";
 //BA.debugLineNum = 1081;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1082;BA.debugLine="Integers.Add(s)";
_integers.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 1084;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1085;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addlabel(int _row,int _col,String _elid,String _elsize,String _eltext) throws Exception{
b4j.example.vmlabel _lbl = null;
 //BA.debugLineNum = 1115;BA.debugLine="Sub AddLabel(row As Int, col As Int, elID As Strin";
 //BA.debugLineNum = 1116;BA.debugLine="Dim lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
 //BA.debugLineNum = 1117;BA.debugLine="lbl.Initialize(vue, elID).SetTag(elSize).SetText(";
_lbl._initialize /*b4j.example.vmlabel*/ (ba,_vue,_elid)._settag /*b4j.example.vmlabel*/ (_elsize)._settext /*b4j.example.vmlabel*/ (_eltext);
 //BA.debugLineNum = 1118;BA.debugLine="AddComponent(row, col, lbl.ToString)";
_addcomponent(_row,_col,_lbl._tostring /*String*/ ());
 //BA.debugLineNum = 1119;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1120;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addrequired(String _r,String _e) throws Exception{
 //BA.debugLineNum = 984;BA.debugLine="Sub AddRequired(r As String,e As String) As VMCont";
 //BA.debugLineNum = 985;BA.debugLine="r = r.tolowercase";
_r = _r.toLowerCase();
 //BA.debugLineNum = 986;BA.debugLine="Required.put(r, e)";
_required.Put((Object)(_r),(Object)(_e));
 //BA.debugLineNum = 987;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 988;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addrows(int _irows) throws Exception{
b4j.example.vmcontainer._gridrow _nrow = null;
String _rowkey = "";
 //BA.debugLineNum = 1183;BA.debugLine="Sub AddRows(iRows As Int) As VMContainer";
 //BA.debugLineNum = 1186;BA.debugLine="LastRow = Rows.size";
_lastrow = _rows.getSize();
 //BA.debugLineNum = 1188;BA.debugLine="Dim nRow As GridRow";
_nrow = new b4j.example.vmcontainer._gridrow();
 //BA.debugLineNum = 1189;BA.debugLine="nRow.Initialize";
_nrow.Initialize();
 //BA.debugLineNum = 1190;BA.debugLine="nRow.Rows = iRows";
_nrow.Rows /*int*/  = _irows;
 //BA.debugLineNum = 1191;BA.debugLine="nRow.Columns.Initialize";
_nrow.Columns /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 1192;BA.debugLine="nRow.Row = 0";
_nrow.Row /*int*/  = (int) (0);
 //BA.debugLineNum = 1194;BA.debugLine="Dim rowKey As String = $\"${ID}r${LastRow}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_lastrow))+"");
 //BA.debugLineNum = 1196;BA.debugLine="Rows.Put(rowKey,nRow)";
_rows.Put((Object)(_rowkey),(Object)(_nrow));
 //BA.debugLineNum = 1197;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 1198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1199;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addstrings(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 1087;BA.debugLine="Sub AddStrings(i As List) As VMContainer";
 //BA.debugLineNum = 1088;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1089;BA.debugLine="Strings.Add(s)";
_strings.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 1091;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1092;BA.debugLine="End Sub";
return null;
}
public String  _bananoreplacerc(int _rowpos,int _colpos,String _elhtml) throws Exception{
String _rowkey = "";
String _cellkey = "";
com.ab.banano.BANanoElement _elbody = null;
 //BA.debugLineNum = 2456;BA.debugLine="Sub BANanoReplaceRC(rowPos As Int, colPos As Int,";
 //BA.debugLineNum = 2457;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 2458;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 2459;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 2461;BA.debugLine="Dim cellKey As String = $\"#${rowKey}\"$";
_cellkey = ("#"+__c.SmartStringFormatter("",(Object)(_rowkey))+"");
 //BA.debugLineNum = 2462;BA.debugLine="Dim elBody As BANanoElement";
_elbody = new com.ab.banano.BANanoElement();
 //BA.debugLineNum = 2463;BA.debugLine="elBody = BANano.GetElement(cellKey)";
_elbody = _banano.GetElement(_cellkey);
 //BA.debugLineNum = 2464;BA.debugLine="If elBody <> Null Then";
if (_elbody!= null) { 
 //BA.debugLineNum = 2465;BA.debugLine="elBody.Empty";
_elbody.Empty();
 //BA.debugLineNum = 2466;BA.debugLine="elBody.SetHTML(elHTML)";
_elbody.SetHTML(_elhtml);
 };
 //BA.debugLineNum = 2468;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 2056;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 2057;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 2058;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 2059;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2060;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 148;BA.debugLine="Container.BindStyleSingle(prop, value)";
_container._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 2250;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 2251;BA.debugLine="Container.BuildModel(mprops, mstyles, lclasses, l";
_container._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 2252;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2253;BA.debugLine="End Sub";
return null;
}
public String  _buildrow(b4j.example.vmcontainer._gridrow _row) throws Exception{
int _rowtot = 0;
int _rowcnt = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _rowkey = "";
b4j.example.vmrow _trow = null;
String _rowkeyshow = "";
anywheresoftware.b4a.objects.collections.Map _cm = null;
String _strkey = "";
String _strval = "";
String _clsname = "";
anywheresoftware.b4a.objects.collections.List _cols = null;
int _colcnt = 0;
int _coltot = 0;
int _lastcolumn = 0;
b4j.example.vmcontainer._gridcolumn _column = null;
int _colcnt1 = 0;
int _coltot1 = 0;
String _cellkey = "";
b4j.example.vmcol _tcolumn = null;
String _cellkeyshow = "";
String _matrix = "";
anywheresoftware.b4a.objects.collections.List _lst = null;
String _strrow = "";
 //BA.debugLineNum = 1668;BA.debugLine="private Sub BuildRow(row As GridRow) As String";
 //BA.debugLineNum = 1670;BA.debugLine="Dim rowTot As Int = row.Rows";
_rowtot = _row.Rows /*int*/ ;
 //BA.debugLineNum = 1671;BA.debugLine="Dim rowCnt As Int";
_rowcnt = 0;
 //BA.debugLineNum = 1673;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1674;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1676;BA.debugLine="For rowCnt = 1 To rowTot";
{
final int step5 = 1;
final int limit5 = _rowtot;
_rowcnt = (int) (1) ;
for (;_rowcnt <= limit5 ;_rowcnt = _rowcnt + step5 ) {
 //BA.debugLineNum = 1677;BA.debugLine="LastRow = LastRow + 1";
_lastrow = (int) (_lastrow+1);
 //BA.debugLineNum = 1678;BA.debugLine="row.Row = CStr(LastRow)";
_row.Row /*int*/  = (int)(Double.parseDouble(_cstr((Object)(_lastrow))));
 //BA.debugLineNum = 1679;BA.debugLine="Dim rowKey As String = $\"${ID}r${LastRow}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_lastrow))+"");
 //BA.debugLineNum = 1681;BA.debugLine="If NoGutters Then";
if (_nogutters) { 
 //BA.debugLineNum = 1682;BA.debugLine="SetAttrRC(LastRow, 0, \"no-gutters\", True)";
_setattrrc(_lastrow,(int) (0),"no-gutters",BA.ObjectToString(__c.True));
 };
 //BA.debugLineNum = 1685;BA.debugLine="Dim tRow As VMRow";
_trow = new b4j.example.vmrow();
 //BA.debugLineNum = 1686;BA.debugLine="tRow.Initialize(vue, rowKey, Module)";
_trow._initialize /*b4j.example.vmrow*/ (ba,_vue,_rowkey,_module);
 //BA.debugLineNum = 1687;BA.debugLine="tRow.SetDesignMode(DesignMode)";
_trow._setdesignmode /*b4j.example.vmrow*/ (_designmode);
 //BA.debugLineNum = 1688;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1689;BA.debugLine="Dim rowKeyShow As String = $\"${rowKey}show\"$";
_rowkeyshow = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"show");
 //BA.debugLineNum = 1690;BA.debugLine="vue.SetData(rowKeyShow, True)";
_vue._setdata /*b4j.example.bananovue*/ (_rowkeyshow,(Object)(__c.True));
 //BA.debugLineNum = 1691;BA.debugLine="tRow.SetAttrSingle(\"v-show\", rowKeyShow)";
_trow._setattrsingle /*b4j.example.vmrow*/ ("v-show",_rowkeyshow);
 };
 //BA.debugLineNum = 1694;BA.debugLine="If rowStyles.ContainsKey(rowKey) Then";
if (_rowstyles.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 1695;BA.debugLine="Dim cm As Map = rowStyles.Get(rowKey)";
_cm = new anywheresoftware.b4a.objects.collections.Map();
_cm = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowstyles.Get((Object)(_rowkey))));
 //BA.debugLineNum = 1696;BA.debugLine="For Each strkey As String In cm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group22 = _cm.Keys();
final int groupLen22 = group22.getSize()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_strkey = BA.ObjectToString(group22.Get(index22));
 //BA.debugLineNum = 1697;BA.debugLine="Dim strVal As String = cm.Get(strkey)";
_strval = BA.ObjectToString(_cm.Get((Object)(_strkey)));
 //BA.debugLineNum = 1698;BA.debugLine="tRow.SetStyleSingle(strkey, strVal)";
_trow._setstylesingle /*b4j.example.vmrow*/ (_strkey,_strval);
 }
};
 };
 //BA.debugLineNum = 1702;BA.debugLine="If rowClasses.ContainsKey(rowKey) Then";
if (_rowclasses.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 1704;BA.debugLine="Dim cm As Map = rowClasses.Get(rowKey)";
_cm = new anywheresoftware.b4a.objects.collections.Map();
_cm = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowclasses.Get((Object)(_rowkey))));
 //BA.debugLineNum = 1705;BA.debugLine="Dim clsName As String = MapKeys2Delim(cm, \" \")";
_clsname = _mapkeys2delim(_cm," ");
 //BA.debugLineNum = 1706;BA.debugLine="tRow.AddClass(clsName)";
_trow._addclass /*b4j.example.vmrow*/ (_clsname);
 };
 //BA.debugLineNum = 1709;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (_attributes.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 1710;BA.debugLine="Dim cm As Map = attributes.Get(rowKey)";
_cm = new anywheresoftware.b4a.objects.collections.Map();
_cm = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_rowkey))));
 //BA.debugLineNum = 1711;BA.debugLine="For Each strkey As String In cm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group34 = _cm.Keys();
final int groupLen34 = group34.getSize()
;int index34 = 0;
;
for (; index34 < groupLen34;index34++){
_strkey = BA.ObjectToString(group34.Get(index34));
 //BA.debugLineNum = 1712;BA.debugLine="Dim strVal As String = cm.Get(strkey)";
_strval = BA.ObjectToString(_cm.Get((Object)(_strkey)));
 //BA.debugLineNum = 1713;BA.debugLine="tRow.SetAttrSingle(strkey, strVal)";
_trow._setattrsingle /*b4j.example.vmrow*/ (_strkey,_strval);
 }
};
 };
 //BA.debugLineNum = 1718;BA.debugLine="Dim cols As List = row.Columns";
_cols = new anywheresoftware.b4a.objects.collections.List();
_cols = _row.Columns /*anywheresoftware.b4a.objects.collections.List*/ ;
 //BA.debugLineNum = 1720;BA.debugLine="Dim colCnt As Int = 0";
_colcnt = (int) (0);
 //BA.debugLineNum = 1721;BA.debugLine="Dim colTot As Int = cols.Size - 1";
_coltot = (int) (_cols.getSize()-1);
 //BA.debugLineNum = 1723;BA.debugLine="Dim LastColumn As Int = 0";
_lastcolumn = (int) (0);
 //BA.debugLineNum = 1724;BA.debugLine="For colCnt = 0 To colTot";
{
final int step43 = 1;
final int limit43 = _coltot;
_colcnt = (int) (0) ;
for (;_colcnt <= limit43 ;_colcnt = _colcnt + step43 ) {
 //BA.debugLineNum = 1726;BA.debugLine="Dim column As GridColumn = cols.Get(colCnt)";
_column = (b4j.example.vmcontainer._gridcolumn)(_cols.Get(_colcnt));
 //BA.debugLineNum = 1727;BA.debugLine="Dim colCnt1 As Int = 0";
_colcnt1 = (int) (0);
 //BA.debugLineNum = 1728;BA.debugLine="Dim colTot1 As Int = column.Columns";
_coltot1 = _column.Columns /*int*/ ;
 //BA.debugLineNum = 1729;BA.debugLine="For colCnt1 = 1 To colTot1";
{
final int step47 = 1;
final int limit47 = _coltot1;
_colcnt1 = (int) (1) ;
for (;_colcnt1 <= limit47 ;_colcnt1 = _colcnt1 + step47 ) {
 //BA.debugLineNum = 1731;BA.debugLine="LastColumn = LastColumn + 1";
_lastcolumn = (int) (_lastcolumn+1);
 //BA.debugLineNum = 1732;BA.debugLine="column.Row = CStr(LastRow)";
_column.Row /*int*/  = (int)(Double.parseDouble(_cstr((Object)(_lastrow))));
 //BA.debugLineNum = 1733;BA.debugLine="column.Col = CStr(LastColumn)";
_column.Col /*int*/  = (int)(Double.parseDouble(_cstr((Object)(_lastcolumn))));
 //BA.debugLineNum = 1734;BA.debugLine="Dim cellKey As String = $\"${rowKey}c${LastColu";
_cellkey = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"c"+__c.SmartStringFormatter("",(Object)(_lastcolumn))+"");
 //BA.debugLineNum = 1736;BA.debugLine="RC.Put(cellKey,cellKey)";
_rc.Put((Object)(_cellkey),(Object)(_cellkey));
 //BA.debugLineNum = 1738;BA.debugLine="If HasBorder Then";
if (_hasborder) { 
 //BA.debugLineNum = 1739;BA.debugLine="SetBorderRC(LastRow, LastColumn, \"1px\", vue.C";
_setborderrc(_lastrow,_lastcolumn,"1px",_vue._color_grey /*String*/ ,_vue._border_solid /*String*/ );
 };
 //BA.debugLineNum = 1742;BA.debugLine="Dim tColumn As VMCol";
_tcolumn = new b4j.example.vmcol();
 //BA.debugLineNum = 1743;BA.debugLine="tColumn.Initialize(vue,cellKey,Module)";
_tcolumn._initialize /*b4j.example.vmcol*/ (ba,_vue,_cellkey,_module);
 //BA.debugLineNum = 1744;BA.debugLine="tColumn.SetDesignMode(DesignMode)";
_tcolumn._setdesignmode /*b4j.example.vmcol*/ (_designmode);
 //BA.debugLineNum = 1745;BA.debugLine="tColumn.SetLg(column.lg)";
_tcolumn._setlg /*b4j.example.vmcol*/ (BA.NumberToString(_column.lg /*int*/ ));
 //BA.debugLineNum = 1746;BA.debugLine="tColumn.SetSm(column.sm)";
_tcolumn._setsm /*b4j.example.vmcol*/ (BA.NumberToString(_column.sm /*int*/ ));
 //BA.debugLineNum = 1747;BA.debugLine="tColumn.SetMd(column.md)";
_tcolumn._setmd /*b4j.example.vmcol*/ (BA.NumberToString(_column.md /*int*/ ));
 //BA.debugLineNum = 1748;BA.debugLine="tColumn.SetXl(column.xl)";
_tcolumn._setxl /*b4j.example.vmcol*/ ((Object)(_column.xl /*int*/ ));
 //BA.debugLineNum = 1749;BA.debugLine="tColumn.SetOffsetSm(column.ofsm)";
_tcolumn._setoffsetsm /*b4j.example.vmcol*/ (BA.NumberToString(_column.ofsm /*int*/ ));
 //BA.debugLineNum = 1750;BA.debugLine="tColumn.SetOffsetMd(column.ofmd)";
_tcolumn._setoffsetmd /*b4j.example.vmcol*/ (BA.NumberToString(_column.ofmd /*int*/ ));
 //BA.debugLineNum = 1751;BA.debugLine="tColumn.SetOffsetLg(column.oflg)";
_tcolumn._setoffsetlg /*b4j.example.vmcol*/ (BA.NumberToString(_column.oflg /*int*/ ));
 //BA.debugLineNum = 1752;BA.debugLine="tColumn.SetOffsetXl(column.ofxl)";
_tcolumn._setoffsetxl /*b4j.example.vmcol*/ (BA.NumberToString(_column.ofxl /*int*/ ));
 //BA.debugLineNum = 1754;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1755;BA.debugLine="Dim cellKeyShow As String = $\"${cellKey}show\"";
_cellkeyshow = (""+__c.SmartStringFormatter("",(Object)(_cellkey))+"show");
 //BA.debugLineNum = 1756;BA.debugLine="vue.SetData(cellKeyShow, True)";
_vue._setdata /*b4j.example.bananovue*/ (_cellkeyshow,(Object)(__c.True));
 //BA.debugLineNum = 1757;BA.debugLine="tColumn.SetAttrSingle(\"v-show\", cellKeyShow)";
_tcolumn._setattrsingle /*b4j.example.vmcol*/ ("v-show",_cellkeyshow);
 };
 //BA.debugLineNum = 1760;BA.debugLine="If ShowMatrix Then";
if (_showmatrix) { 
 //BA.debugLineNum = 1761;BA.debugLine="Dim matrix As String = $\"R${LastRow}.C${LastC";
_matrix = ("R"+__c.SmartStringFormatter("",(Object)(_lastrow))+".C"+__c.SmartStringFormatter("",(Object)(_lastcolumn))+"");
 //BA.debugLineNum = 1762;BA.debugLine="tColumn.AddComponent(matrix)";
_tcolumn._addcomponent /*b4j.example.vmcol*/ (_matrix);
 };
 //BA.debugLineNum = 1765;BA.debugLine="If rowStyles.ContainsKey(cellKey) Then";
if (_rowstyles.ContainsKey((Object)(_cellkey))) { 
 //BA.debugLineNum = 1766;BA.debugLine="Dim cm As Map = rowStyles.Get(cellKey)";
_cm = new anywheresoftware.b4a.objects.collections.Map();
_cm = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowstyles.Get((Object)(_cellkey))));
 //BA.debugLineNum = 1767;BA.debugLine="For Each strkey As String In cm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group78 = _cm.Keys();
final int groupLen78 = group78.getSize()
;int index78 = 0;
;
for (; index78 < groupLen78;index78++){
_strkey = BA.ObjectToString(group78.Get(index78));
 //BA.debugLineNum = 1768;BA.debugLine="Dim strVal As String = cm.Get(strkey)";
_strval = BA.ObjectToString(_cm.Get((Object)(_strkey)));
 //BA.debugLineNum = 1769;BA.debugLine="tColumn.SetStyleSingle(strkey, strVal)";
_tcolumn._setstylesingle /*b4j.example.vmcol*/ (_strkey,_strval);
 }
};
 };
 //BA.debugLineNum = 1774;BA.debugLine="If rowClasses.ContainsKey(cellKey) Then";
if (_rowclasses.ContainsKey((Object)(_cellkey))) { 
 //BA.debugLineNum = 1776;BA.debugLine="Dim cm As Map = rowClasses.Get(cellKey)";
_cm = new anywheresoftware.b4a.objects.collections.Map();
_cm = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowclasses.Get((Object)(_cellkey))));
 //BA.debugLineNum = 1777;BA.debugLine="Dim clsName As String = MapKeys2Delim(cm, \" \"";
_clsname = _mapkeys2delim(_cm," ");
 //BA.debugLineNum = 1778;BA.debugLine="tColumn.AddClass(clsName)";
_tcolumn._addclass /*b4j.example.vmcol*/ (_clsname);
 };
 //BA.debugLineNum = 1782;BA.debugLine="If attributes.ContainsKey(cellKey) Then";
if (_attributes.ContainsKey((Object)(_cellkey))) { 
 //BA.debugLineNum = 1783;BA.debugLine="Dim cm As Map = attributes.Get(cellKey)";
_cm = new anywheresoftware.b4a.objects.collections.Map();
_cm = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_cellkey))));
 //BA.debugLineNum = 1784;BA.debugLine="For Each strkey As String In cm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group90 = _cm.Keys();
final int groupLen90 = group90.getSize()
;int index90 = 0;
;
for (; index90 < groupLen90;index90++){
_strkey = BA.ObjectToString(group90.Get(index90));
 //BA.debugLineNum = 1785;BA.debugLine="Dim strVal As String = cm.Get(strkey)";
_strval = BA.ObjectToString(_cm.Get((Object)(_strkey)));
 //BA.debugLineNum = 1786;BA.debugLine="tColumn.SetAttrSingle(strkey, strVal)";
_tcolumn._setattrsingle /*b4j.example.vmcol*/ (_strkey,_strval);
 }
};
 };
 //BA.debugLineNum = 1790;BA.debugLine="If Components.ContainsKey(cellKey) Then";
if (_components.ContainsKey((Object)(_cellkey))) { 
 //BA.debugLineNum = 1791;BA.debugLine="Dim lst As List = Components.Get(cellKey)";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_components.Get((Object)(_cellkey))));
 //BA.debugLineNum = 1792;BA.debugLine="tColumn.AddContentList(lst)";
_tcolumn._addcontentlist /*b4j.example.vmcol*/ (_lst);
 };
 //BA.debugLineNum = 1794;BA.debugLine="If UseVShow = False Then tColumn.Col.RemoveVSh";
if (_usevshow==__c.False) { 
_tcolumn._col /*b4j.example.vmelement*/ ._removevshow /*b4j.example.vmelement*/ ();};
 //BA.debugLineNum = 1795;BA.debugLine="tRow.AddComponent(tColumn.ToString)";
_trow._addcomponent /*b4j.example.vmrow*/ (_tcolumn._tostring /*String*/ ());
 }
};
 }
};
 //BA.debugLineNum = 1798;BA.debugLine="If UseVShow = False Then tRow.Row.RemoveVShow";
if (_usevshow==__c.False) { 
_trow._row /*b4j.example.vmelement*/ ._removevshow /*b4j.example.vmelement*/ ();};
 //BA.debugLineNum = 1799;BA.debugLine="Dim strRow As String = tRow.tostring";
_strrow = _trow._tostring /*String*/ ();
 //BA.debugLineNum = 1800;BA.debugLine="sb.Append(strRow)";
_sb.Append(_strrow);
 }
};
 //BA.debugLineNum = 1802;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1803;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Container As VMElement";
_container = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Type GridRow(Rows As Int, Columns As List, Row As";
;
 //BA.debugLineNum = 10;BA.debugLine="Type GridColumn(Columns As Int, sm As Int, md As";
;
 //BA.debugLineNum = 14;BA.debugLine="Private Rows As Map";
_rows = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 16;BA.debugLine="Private Columns As Map";
_columns = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 19;BA.debugLine="Private LastRow As Int";
_lastrow = 0;
 //BA.debugLineNum = 21;BA.debugLine="Private RC As Map";
_rc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 22;BA.debugLine="Private Components As Map";
_components = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 24;BA.debugLine="Public Fields As List";
_fields = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 25;BA.debugLine="Public Controls As List";
_controls = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 26;BA.debugLine="Public Strings As List";
_strings = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 27;BA.debugLine="Public Integers As List";
_integers = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 28;BA.debugLine="Public Booleans As List";
_booleans = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 29;BA.debugLine="Public Doubles As List";
_doubles = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 30;BA.debugLine="Public Dates As List";
_dates = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 31;BA.debugLine="Public Defaults As Map";
_defaults = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 32;BA.debugLine="Public Required As Map";
_required = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 33;BA.debugLine="Public Mode As String";
_mode = "";
 //BA.debugLineNum = 34;BA.debugLine="Private TotalRows As Int";
_totalrows = 0;
 //BA.debugLineNum = 35;BA.debugLine="Private sortitM As Map";
_sortitm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 36;BA.debugLine="Private sortItL As List";
_sortitl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 37;BA.debugLine="Private cells As Map";
_cells = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 38;BA.debugLine="Type EachRow(visibility As String)";
;
 //BA.debugLineNum = 39;BA.debugLine="Public visibility As Map";
_visibility = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 40;BA.debugLine="Private rowStyles As Map";
_rowstyles = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 41;BA.debugLine="Public HasInfoBox As Boolean";
_hasinfobox = false;
 //BA.debugLineNum = 42;BA.debugLine="Public Exclusions As List";
_exclusions = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 43;BA.debugLine="Private DesignMode As Boolean";
_designmode = false;
 //BA.debugLineNum = 44;BA.debugLine="Type CheckedUnchecked(fieldname As String, checke";
;
 //BA.debugLineNum = 45;BA.debugLine="Private rowClasses As Map";
_rowclasses = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 46;BA.debugLine="Private rowStyles As Map";
_rowstyles = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 47;BA.debugLine="Private attributes As Map";
_attributes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 48;BA.debugLine="Private afewoptions As List";
_afewoptions = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 49;BA.debugLine="Private bControls As Boolean";
_bcontrols = false;
 //BA.debugLineNum = 50;BA.debugLine="Public HasBorder As Boolean";
_hasborder = false;
 //BA.debugLineNum = 51;BA.debugLine="Public ShowMatrix As Boolean";
_showmatrix = false;
 //BA.debugLineNum = 52;BA.debugLine="Public NoGutters As Boolean";
_nogutters = false;
 //BA.debugLineNum = 53;BA.debugLine="Private cStatic As Boolean";
_cstatic = false;
 //BA.debugLineNum = 54;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 55;BA.debugLine="Public bindings As Map";
_bindings = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 56;BA.debugLine="Public UseVShow As Boolean";
_usevshow = false;
 //BA.debugLineNum = 57;BA.debugLine="Public showKey As String";
_showkey = "";
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _clear() throws Exception{
 //BA.debugLineNum = 1166;BA.debugLine="Sub Clear As VMContainer";
 //BA.debugLineNum = 1167;BA.debugLine="Rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 1168;BA.debugLine="LastRow = 0";
_lastrow = (int) (0);
 //BA.debugLineNum = 1169;BA.debugLine="RC.Initialize";
_rc.Initialize();
 //BA.debugLineNum = 1170;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 1171;BA.debugLine="Components.Initialize";
_components.Initialize();
 //BA.debugLineNum = 1172;BA.debugLine="rowStyles.Initialize";
_rowstyles.Initialize();
 //BA.debugLineNum = 1173;BA.debugLine="rowClasses.Initialize";
_rowclasses.Initialize();
 //BA.debugLineNum = 1174;BA.debugLine="HasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 1175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1176;BA.debugLine="End Sub";
return null;
}
public boolean  _columnexists(int _rowpos,int _colpos) throws Exception{
String _rowcol = "";
 //BA.debugLineNum = 1932;BA.debugLine="Sub ColumnExists(rowPos As Int, colPos As Int) As";
 //BA.debugLineNum = 1933;BA.debugLine="Dim rowcol As String = $\"${ID}r${rowPos}c${colPos";
_rowcol = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_rowpos))+"c"+__c.SmartStringFormatter("",(Object)(_colpos))+"");
 //BA.debugLineNum = 1934;BA.debugLine="Return RC.ContainsKey(rowcol)";
if (true) return _rc.ContainsKey((Object)(_rowcol));
 //BA.debugLineNum = 1935;BA.debugLine="End Sub";
return false;
}
public b4j.example.vmtoolbar  _createappbar(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmtoolbar _el = null;
 //BA.debugLineNum = 329;BA.debugLine="Sub CreateAppBar(sid As String, moduleObj As Objec";
 //BA.debugLineNum = 330;BA.debugLine="Dim el As VMToolBar";
_el = new b4j.example.vmtoolbar();
 //BA.debugLineNum = 331;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmtoolbar*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 332;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmtoolbar*/ (_designmode);
 //BA.debugLineNum = 333;BA.debugLine="el.SetAppBar(True)";
_el._setappbar /*b4j.example.vmtoolbar*/ (__c.True);
 //BA.debugLineNum = 334;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _createavatar(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmavatar _el = null;
 //BA.debugLineNum = 235;BA.debugLine="Sub CreateAvatar(sid As String, moduleObj As Objec";
 //BA.debugLineNum = 236;BA.debugLine="Dim el As VMAvatar";
_el = new b4j.example.vmavatar();
 //BA.debugLineNum = 237;BA.debugLine="el.Initialize(vue,sid, moduleObj)";
_el._initialize /*b4j.example.vmavatar*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 238;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmavatar*/ (_designmode);
 //BA.debugLineNum = 239;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _createbadge(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmbadge _el = null;
 //BA.debugLineNum = 173;BA.debugLine="Sub CreateBadge(sid As String, moduleObj As Object";
 //BA.debugLineNum = 174;BA.debugLine="Dim el As VMBadge";
_el = new b4j.example.vmbadge();
 //BA.debugLineNum = 175;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmbadge*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 176;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmbadge*/ (_designmode);
 //BA.debugLineNum = 177;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _createbutton(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmbutton _el = null;
 //BA.debugLineNum = 883;BA.debugLine="Sub CreateButton(sid As String,moduleObj As Object";
 //BA.debugLineNum = 884;BA.debugLine="Dim el As VMButton";
_el = new b4j.example.vmbutton();
 //BA.debugLineNum = 885;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmbutton*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 886;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 887;BA.debugLine="el.SetType(\"button\")";
_el._settype /*b4j.example.vmbutton*/ ("button");
 //BA.debugLineNum = 888;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 889;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _createbuttontoggle(String _bid,Object _moduleobj) throws Exception{
b4j.example.vmbuttontoggle _el = null;
 //BA.debugLineNum = 159;BA.debugLine="Sub CreateButtonToggle(bid As String, moduleObj As";
 //BA.debugLineNum = 160;BA.debugLine="Dim el As VMButtonToggle";
_el = new b4j.example.vmbuttontoggle();
 //BA.debugLineNum = 161;BA.debugLine="el.Initialize(vue, bid, moduleObj)";
_el._initialize /*b4j.example.vmbuttontoggle*/ (ba,_vue,_bid,_moduleobj);
 //BA.debugLineNum = 162;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmbuttontoggle*/ (_designmode);
 //BA.debugLineNum = 163;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _createcard(String _cid,Object _eventhandler) throws Exception{
b4j.example.vmcard _el = null;
 //BA.debugLineNum = 284;BA.debugLine="Sub CreateCard(cID As String, eventHandler As Obje";
 //BA.debugLineNum = 285;BA.debugLine="Dim el As VMCard";
_el = new b4j.example.vmcard();
 //BA.debugLineNum = 286;BA.debugLine="el.Initialize(vue, cID, eventHandler)";
_el._initialize /*b4j.example.vmcard*/ (ba,_vue,_cid,_eventhandler);
 //BA.debugLineNum = 287;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmcard*/ (_designmode);
 //BA.debugLineNum = 288;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _createcarousel(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmcarousel _el = null;
 //BA.debugLineNum = 263;BA.debugLine="Sub CreateCarousel(sid As String, moduleObj As Obj";
 //BA.debugLineNum = 264;BA.debugLine="Dim el As VMCarousel";
_el = new b4j.example.vmcarousel();
 //BA.debugLineNum = 265;BA.debugLine="el.Initialize(vue,sid, moduleObj)";
_el._initialize /*b4j.example.vmcarousel*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 266;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmcarousel*/ (_designmode);
 //BA.debugLineNum = 267;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _createcheckbox(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmcheckbox _el = null;
 //BA.debugLineNum = 660;BA.debugLine="Sub CreateCheckBox(sid As String, eventHandler As";
 //BA.debugLineNum = 661;BA.debugLine="Dim el As VMCheckBox";
_el = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 662;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 663;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmcheckbox*/ (_designmode);
 //BA.debugLineNum = 664;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 665;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _createchip(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmchip _el = null;
 //BA.debugLineNum = 199;BA.debugLine="Sub CreateChip(sid As String, eventHandler As Obje";
 //BA.debugLineNum = 200;BA.debugLine="Dim el As VMChip";
_el = new b4j.example.vmchip();
 //BA.debugLineNum = 201;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmchip*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 202;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmchip*/ (_designmode);
 //BA.debugLineNum = 203;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _createcontainer(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmcontainer _el = null;
 //BA.debugLineNum = 277;BA.debugLine="Sub CreateContainer(sid As String, eventHandler As";
 //BA.debugLineNum = 278;BA.debugLine="Dim el As VMContainer";
_el = new b4j.example.vmcontainer();
 //BA.debugLineNum = 279;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmcontainer*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 280;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmcontainer*/ (_designmode);
 //BA.debugLineNum = 281;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _createdatatable(String _cid,String _primarykey,Object _eventhandler) throws Exception{
b4j.example.vmdatatable _el = null;
 //BA.debugLineNum = 192;BA.debugLine="Sub CreateDataTable(cID As String, PrimaryKey As S";
 //BA.debugLineNum = 193;BA.debugLine="Dim el As VMDataTable";
_el = new b4j.example.vmdatatable();
 //BA.debugLineNum = 194;BA.debugLine="el.Initialize(vue, cID,PrimaryKey,  eventHandler)";
_el._initialize /*b4j.example.vmdatatable*/ (ba,_vue,_cid,_primarykey,_eventhandler);
 //BA.debugLineNum = 195;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmdatatable*/ (_designmode);
 //BA.debugLineNum = 196;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _createdatetimepicker(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmdatetimepicker _el = null;
 //BA.debugLineNum = 684;BA.debugLine="Sub CreateDateTimePicker(sid As String, eventHandl";
 //BA.debugLineNum = 685;BA.debugLine="Dim el As VMDateTimePicker";
_el = new b4j.example.vmdatetimepicker();
 //BA.debugLineNum = 686;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmdatetimepicker*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 687;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmdatetimepicker*/ (_designmode);
 //BA.debugLineNum = 688;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 689;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _createdialog(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmdialog _el = null;
 //BA.debugLineNum = 249;BA.debugLine="Sub CreateDialog(sid As String, moduleObj As Objec";
 //BA.debugLineNum = 250;BA.debugLine="Dim el As VMDialog";
_el = new b4j.example.vmdialog();
 //BA.debugLineNum = 251;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmdialog*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 252;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmdialog*/ (_designmode);
 //BA.debugLineNum = 253;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _createdrawer(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmnavigationdrawer _el = null;
 //BA.debugLineNum = 270;BA.debugLine="Sub CreateDrawer(sid As String, eventHandler As Ob";
 //BA.debugLineNum = 271;BA.debugLine="Dim el As VMNavigationDrawer";
_el = new b4j.example.vmnavigationdrawer();
 //BA.debugLineNum = 272;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmnavigationdrawer*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 273;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmnavigationdrawer*/ (_designmode);
 //BA.debugLineNum = 274;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _createexpansionpanels(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmexpansionpanels _el = null;
 //BA.debugLineNum = 207;BA.debugLine="Sub CreateExpansionPanels(sid As String, eventHand";
 //BA.debugLineNum = 208;BA.debugLine="Dim el As VMExpansionPanels";
_el = new b4j.example.vmexpansionpanels();
 //BA.debugLineNum = 209;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmexpansionpanels*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 210;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmexpansionpanels*/ (_designmode);
 //BA.debugLineNum = 211;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _createfabbutton(String _sid,Object _moduleobj,String _iconname) throws Exception{
b4j.example.vmbutton _el = null;
 //BA.debugLineNum = 578;BA.debugLine="Sub CreateFABButton(sid As String,moduleObj As Obj";
 //BA.debugLineNum = 579;BA.debugLine="Dim el As VMButton";
_el = new b4j.example.vmbutton();
 //BA.debugLineNum = 580;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmbutton*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 581;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 582;BA.debugLine="el.SetFabButton(iconName)";
_el._setfabbutton /*b4j.example.vmbutton*/ (_iconname);
 //BA.debugLineNum = 583;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 584;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _createfileinput(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmfileinput _el = null;
 //BA.debugLineNum = 833;BA.debugLine="Sub CreateFileInput(sid As String, eventHandler As";
 //BA.debugLineNum = 834;BA.debugLine="Dim el As VMFileInput";
_el = new b4j.example.vmfileinput();
 //BA.debugLineNum = 835;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmfileinput*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 836;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmfileinput*/ (_designmode);
 //BA.debugLineNum = 837;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 838;BA.debugLine="End Sub";
return null;
}
public String  _creategrid() throws Exception{
b4j.example.vmelement _el = null;
int _idxpos = 0;
String _k = "";
anywheresoftware.b4a.objects.collections.List _missingrc = null;
int _compcnt = 0;
String _srow = "";
String _scell = "";
String _rckey = "";
String _strrc = "";
String _lblkey = "";
String _xrow = "";
String _xcol = "";
b4j.example.vmlabel _lbl = null;
anywheresoftware.b4a.objects.collections.Map _finalrows = null;
anywheresoftware.b4a.objects.collections.List _finalcells = null;
String _strrow = "";
int _colcnt = 0;
String _finalrow = "";
String[] _finalcell = null;
b4j.example.vmelement[] _ec = null;
int _finalcellssize = 0;
int _cellsize = 0;
 //BA.debugLineNum = 2108;BA.debugLine="private Sub CreateGrid";
 //BA.debugLineNum = 2111;BA.debugLine="For Each el As VMElement In Controls";
{
final anywheresoftware.b4a.BA.IterableList group1 = _controls;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_el = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 2112;BA.debugLine="If el.Exclude = True Then Exclusions.Add(el.id)";
if (_el._exclude /*boolean*/ ==__c.True) { 
_exclusions.Add((Object)(_el._id /*String*/ ));};
 //BA.debugLineNum = 2114;BA.debugLine="Dim idxpos As Int = Exclusions.IndexOf(el.id)";
_idxpos = _exclusions.IndexOf((Object)(_el._id /*String*/ ));
 //BA.debugLineNum = 2115;BA.debugLine="If idxpos = -1 Then";
if (_idxpos==-1) { 
 //BA.debugLineNum = 2116;BA.debugLine="Select Case el.typeOf";
switch (BA.switchObjectToInt(_el._typeof /*String*/ ,"button","list","image","label","profile","table","alert","badge","avatar","banner","nav")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: 
case 8: 
case 9: 
case 10: {
 //BA.debugLineNum = 2119;BA.debugLine="el.fieldType = \"\"";
_el._fieldtype /*String*/  = "";
 //BA.debugLineNum = 2120;BA.debugLine="el.IsRequired = False";
_el._isrequired /*boolean*/  = __c.False;
 break; }
default: {
 //BA.debugLineNum = 2122;BA.debugLine="Fields.Add(el.vmodel)";
_fields.Add((Object)(_el._vmodel /*String*/ ));
 //BA.debugLineNum = 2123;BA.debugLine="Defaults.Put(el.vmodel, el.value)";
_defaults.Put((Object)(_el._vmodel /*String*/ ),_el._value /*Object*/ );
 break; }
}
;
 //BA.debugLineNum = 2125;BA.debugLine="If el.isrequired Then Required.put(el.vmodel, e";
if (_el._isrequired /*boolean*/ ) { 
_required.Put((Object)(_el._vmodel /*String*/ ),(Object)(_el._errormessage /*String*/ ));};
 //BA.debugLineNum = 2126;BA.debugLine="If (el.vmodel <> \"\") And (el.fieldType <> \"\") T";
if (((_el._vmodel /*String*/ ).equals("") == false) && ((_el._fieldtype /*String*/ ).equals("") == false)) { 
 //BA.debugLineNum = 2127;BA.debugLine="Select Case el.fieldType";
switch (BA.switchObjectToInt(_el._fieldtype /*String*/ ,"int","bool","string","date","dbl")) {
case 0: {
 //BA.debugLineNum = 2129;BA.debugLine="Integers.Add(el.vmodel)";
_integers.Add((Object)(_el._vmodel /*String*/ ));
 break; }
case 1: {
 //BA.debugLineNum = 2131;BA.debugLine="Booleans.Add(el.vmodel)";
_booleans.Add((Object)(_el._vmodel /*String*/ ));
 break; }
case 2: {
 //BA.debugLineNum = 2133;BA.debugLine="Strings.Add(el.vmodel)";
_strings.Add((Object)(_el._vmodel /*String*/ ));
 break; }
case 3: {
 //BA.debugLineNum = 2135;BA.debugLine="Dates.Add(el.vmodel)";
_dates.Add((Object)(_el._vmodel /*String*/ ));
 break; }
case 4: {
 //BA.debugLineNum = 2137;BA.debugLine="Doubles.Add(el.vmodel)";
_doubles.Add((Object)(_el._vmodel /*String*/ ));
 break; }
}
;
 };
 };
 }
};
 //BA.debugLineNum = 2144;BA.debugLine="sortItL.Initialize";
_sortitl.Initialize();
 //BA.debugLineNum = 2145;BA.debugLine="For Each k As String In sortitM.Keys";
{
final anywheresoftware.b4a.BA.IterableList group31 = _sortitm.Keys();
final int groupLen31 = group31.getSize()
;int index31 = 0;
;
for (; index31 < groupLen31;index31++){
_k = BA.ObjectToString(group31.Get(index31));
 //BA.debugLineNum = 2146;BA.debugLine="sortItL.Add(k)";
_sortitl.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 2149;BA.debugLine="sortItL.Sort(True)";
_sortitl.Sort(__c.True);
 //BA.debugLineNum = 2151;BA.debugLine="Dim missingRC As List";
_missingrc = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2152;BA.debugLine="missingRC.Initialize";
_missingrc.Initialize();
 //BA.debugLineNum = 2153;BA.debugLine="For compCnt = 1 To TotalRows";
{
final int step37 = 1;
final int limit37 = _totalrows;
_compcnt = (int) (1) ;
for (;_compcnt <= limit37 ;_compcnt = _compcnt + step37 ) {
 //BA.debugLineNum = 2154;BA.debugLine="Dim sRow As String = compCnt";
_srow = BA.NumberToString(_compcnt);
 //BA.debugLineNum = 2155;BA.debugLine="sRow = vue.PadRight(sRow, 2, \"0\")";
_srow = _vue._padright /*String*/ (_srow,(int) (2),"0");
 //BA.debugLineNum = 2156;BA.debugLine="Dim sCell As String = vue.PadRight(\"1\", 2, \"0\")";
_scell = _vue._padright /*String*/ ("1",(int) (2),"0");
 //BA.debugLineNum = 2157;BA.debugLine="Dim rcKey As String = $\"${sRow}.${sCell}\"$";
_rckey = (""+__c.SmartStringFormatter("",(Object)(_srow))+"."+__c.SmartStringFormatter("",(Object)(_scell))+"");
 //BA.debugLineNum = 2158;BA.debugLine="If sortItL.IndexOf(rcKey) = -1 Then";
if (_sortitl.IndexOf((Object)(_rckey))==-1) { 
 //BA.debugLineNum = 2159;BA.debugLine="missingRC.Add(rcKey)";
_missingrc.Add((Object)(_rckey));
 };
 }
};
 //BA.debugLineNum = 2162;BA.debugLine="If missingRC.Size -1 >= 0 Then";
if (_missingrc.getSize()-1>=0) { 
 //BA.debugLineNum = 2163;BA.debugLine="For Each strRC As String In missingRC";
{
final anywheresoftware.b4a.BA.IterableList group47 = _missingrc;
final int groupLen47 = group47.getSize()
;int index47 = 0;
;
for (; index47 < groupLen47;index47++){
_strrc = BA.ObjectToString(group47.Get(index47));
 //BA.debugLineNum = 2165;BA.debugLine="Dim lblKey As String = \"lbl\" & strRC.Replace(\".";
_lblkey = "lbl"+_strrc.replace(".","");
 //BA.debugLineNum = 2166;BA.debugLine="Dim xRow As String = vue.MvField(strRC,1,\".\")";
_xrow = _vue._mvfield /*String*/ (_strrc,(int) (1),".");
 //BA.debugLineNum = 2167;BA.debugLine="Dim xCol As String = vue.MvField(strRC,2,\".\")";
_xcol = _vue._mvfield /*String*/ (_strrc,(int) (2),".");
 //BA.debugLineNum = 2169;BA.debugLine="Dim lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
 //BA.debugLineNum = 2170;BA.debugLine="lbl.Initialize(vue, lblKey)";
_lbl._initialize /*b4j.example.vmlabel*/ (ba,_vue,_lblkey);
 //BA.debugLineNum = 2171;BA.debugLine="lbl.SetText(lblKey)";
_lbl._settext /*b4j.example.vmlabel*/ (_lblkey);
 //BA.debugLineNum = 2172;BA.debugLine="lbl.SetVisible(False)";
_lbl._setvisible /*b4j.example.vmlabel*/ (__c.False);
 //BA.debugLineNum = 2173;BA.debugLine="AddControl(lbl.Label, lbl.ToString,xRow,xCol,\"0";
_addcontrol(_lbl._label /*b4j.example.vmelement*/ ,_lbl._tostring /*String*/ (),_xrow,_xcol,"0","0","0","0","12","12","12","12");
 //BA.debugLineNum = 2174;BA.debugLine="Log(\"VMContainer.CreateGrid: \" & ID & \".\" & str";
__c.Log("VMContainer.CreateGrid: "+_id+"."+_strrc+": RC is NOT defined");
 }
};
 };
 //BA.debugLineNum = 2180;BA.debugLine="Dim finalRows As Map";
_finalrows = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2181;BA.debugLine="finalRows.Initialize";
_finalrows.Initialize();
 //BA.debugLineNum = 2182;BA.debugLine="For Each strRC As String In sortItL";
{
final anywheresoftware.b4a.BA.IterableList group61 = _sortitl;
final int groupLen61 = group61.getSize()
;int index61 = 0;
;
for (; index61 < groupLen61;index61++){
_strrc = BA.ObjectToString(group61.Get(index61));
 //BA.debugLineNum = 2183;BA.debugLine="Dim sRow As String = vue.MvField(strRC,1,\".\")";
_srow = _vue._mvfield /*String*/ (_strrc,(int) (1),".");
 //BA.debugLineNum = 2184;BA.debugLine="If finalRows.ContainsKey(sRow) Then";
if (_finalrows.ContainsKey((Object)(_srow))) { 
 //BA.debugLineNum = 2185;BA.debugLine="Dim finalCells As List = finalRows.Get(sRow)";
_finalcells = new anywheresoftware.b4a.objects.collections.List();
_finalcells = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_finalrows.Get((Object)(_srow))));
 }else {
 //BA.debugLineNum = 2187;BA.debugLine="Dim finalCells As List";
_finalcells = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2188;BA.debugLine="finalCells.Initialize";
_finalcells.Initialize();
 };
 //BA.debugLineNum = 2190;BA.debugLine="finalCells.Add(strRC)";
_finalcells.Add((Object)(_strrc));
 //BA.debugLineNum = 2191;BA.debugLine="finalRows.Put(sRow,finalCells)";
_finalrows.Put((Object)(_srow),(Object)(_finalcells.getObject()));
 }
};
 //BA.debugLineNum = 2195;BA.debugLine="sortItL.Initialize";
_sortitl.Initialize();
 //BA.debugLineNum = 2196;BA.debugLine="For Each strRow As String In finalRows.Keys";
{
final anywheresoftware.b4a.BA.IterableList group73 = _finalrows.Keys();
final int groupLen73 = group73.getSize()
;int index73 = 0;
;
for (; index73 < groupLen73;index73++){
_strrow = BA.ObjectToString(group73.Get(index73));
 //BA.debugLineNum = 2197;BA.debugLine="sortItL.Add(strRow)";
_sortitl.Add((Object)(_strrow));
 }
};
 //BA.debugLineNum = 2199;BA.debugLine="sortItL.Sort(True)";
_sortitl.Sort(__c.True);
 //BA.debugLineNum = 2200;BA.debugLine="Dim colCnt As Int";
_colcnt = 0;
 //BA.debugLineNum = 2201;BA.debugLine="For Each finalRow As String In sortItL";
{
final anywheresoftware.b4a.BA.IterableList group78 = _sortitl;
final int groupLen78 = group78.getSize()
;int index78 = 0;
;
for (; index78 < groupLen78;index78++){
_finalrow = BA.ObjectToString(group78.Get(index78));
 //BA.debugLineNum = 2203;BA.debugLine="Dim finalCell(11) As String";
_finalcell = new String[(int) (11)];
java.util.Arrays.fill(_finalcell,"");
 //BA.debugLineNum = 2204;BA.debugLine="Dim ec(11) As VMElement";
_ec = new b4j.example.vmelement[(int) (11)];
{
int d0 = _ec.length;
for (int i0 = 0;i0 < d0;i0++) {
_ec[i0] = new b4j.example.vmelement();
}
}
;
 //BA.debugLineNum = 2207;BA.debugLine="Dim finalCells As List = finalRows.Get(finalRow)";
_finalcells = new anywheresoftware.b4a.objects.collections.List();
_finalcells = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_finalrows.Get((Object)(_finalrow))));
 //BA.debugLineNum = 2209;BA.debugLine="Dim finalCellsSize As Int = finalCells.Size - 1";
_finalcellssize = (int) (_finalcells.getSize()-1);
 //BA.debugLineNum = 2210;BA.debugLine="For colCnt = 0 To finalCellsSize";
{
final int step83 = 1;
final int limit83 = _finalcellssize;
_colcnt = (int) (0) ;
for (;_colcnt <= limit83 ;_colcnt = _colcnt + step83 ) {
 //BA.debugLineNum = 2211;BA.debugLine="finalCell(colCnt) = finalCells.Get(colCnt)";
_finalcell[_colcnt] = BA.ObjectToString(_finalcells.Get(_colcnt));
 //BA.debugLineNum = 2212;BA.debugLine="ec(colCnt) = sortitM.Get(finalCell(colCnt))";
_ec[_colcnt] = (b4j.example.vmelement)(_sortitm.Get((Object)(_finalcell[_colcnt])));
 }
};
 //BA.debugLineNum = 2215;BA.debugLine="AddRows(1)";
_addrows((int) (1));
 //BA.debugLineNum = 2216;BA.debugLine="Dim cellSize As Int";
_cellsize = 0;
 //BA.debugLineNum = 2217;BA.debugLine="For cellSize = 0 To finalCellsSize";
{
final int step89 = 1;
final int limit89 = _finalcellssize;
_cellsize = (int) (0) ;
for (;_cellsize <= limit89 ;_cellsize = _cellsize + step89 ) {
 //BA.debugLineNum = 2219;BA.debugLine="AddColumnsOS(1, ec(cellSize).os, ec(cellSize).o";
_addcolumnsos((int) (1),(int)(Double.parseDouble(_ec[_cellsize]._os /*String*/ )),(int)(Double.parseDouble(_ec[_cellsize]._om /*String*/ )),(int)(Double.parseDouble(_ec[_cellsize]._ol /*String*/ )),(int)(Double.parseDouble(_ec[_cellsize]._ox /*String*/ )),(int)(Double.parseDouble(_ec[_cellsize]._ss /*String*/ )),(int)(Double.parseDouble(_ec[_cellsize]._sm /*String*/ )),(int)(Double.parseDouble(_ec[_cellsize]._sl /*String*/ )),(int)(Double.parseDouble(_ec[_cellsize]._sx /*String*/ )));
 }
};
 }
};
 //BA.debugLineNum = 2223;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmicon  _createicon(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmicon _el = null;
 //BA.debugLineNum = 401;BA.debugLine="Sub CreateIcon(sid As String, moduleObj As Object)";
 //BA.debugLineNum = 402;BA.debugLine="Dim el As VMIcon";
_el = new b4j.example.vmicon();
 //BA.debugLineNum = 403;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmicon*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 404;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 405;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _createimage(String _img,Object _eventhandler) throws Exception{
b4j.example.vmimage _el = null;
 //BA.debugLineNum = 365;BA.debugLine="Sub CreateImage(img As String, eventHandler As Obj";
 //BA.debugLineNum = 366;BA.debugLine="Dim el As VMImage";
_el = new b4j.example.vmimage();
 //BA.debugLineNum = 367;BA.debugLine="el.Initialize(vue, img, eventHandler)";
_el._initialize /*b4j.example.vmimage*/ (ba,_vue,_img,_eventhandler);
 //BA.debugLineNum = 368;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmimage*/ (_designmode);
 //BA.debugLineNum = 369;BA.debugLine="el.Image.typeof = \"image\"";
_el._image /*b4j.example.vmelement*/ ._typeof /*String*/  = "image";
 //BA.debugLineNum = 370;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _createlabel(String _sid) throws Exception{
b4j.example.vmlabel _el = null;
 //BA.debugLineNum = 358;BA.debugLine="Sub CreateLabel(sID As String) As VMLabel";
 //BA.debugLineNum = 359;BA.debugLine="Dim el As VMLabel";
_el = new b4j.example.vmlabel();
 //BA.debugLineNum = 360;BA.debugLine="el.Initialize(vue, sID)";
_el._initialize /*b4j.example.vmlabel*/ (ba,_vue,_sid);
 //BA.debugLineNum = 361;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmlabel*/ (_designmode);
 //BA.debugLineNum = 362;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _createlist(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmlist _el = null;
 //BA.debugLineNum = 152;BA.debugLine="Sub CreateList(sid As String, eventHandler As Obje";
 //BA.debugLineNum = 153;BA.debugLine="Dim el As VMList";
_el = new b4j.example.vmlist();
 //BA.debugLineNum = 154;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmlist*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 155;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmlist*/ (_designmode);
 //BA.debugLineNum = 156;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _createmenu(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmmenu _el = null;
 //BA.debugLineNum = 256;BA.debugLine="Sub CreateMenu(sid As String, moduleObj As Object)";
 //BA.debugLineNum = 257;BA.debugLine="Dim el As VMMenu";
_el = new b4j.example.vmmenu();
 //BA.debugLineNum = 258;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmmenu*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 259;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmmenu*/ (_designmode);
 //BA.debugLineNum = 260;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _createparallax(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmparallax _el = null;
 //BA.debugLineNum = 242;BA.debugLine="Sub CreateParallax(eID As String, eventHandler As";
 //BA.debugLineNum = 243;BA.debugLine="Dim el As VMParallax";
_el = new b4j.example.vmparallax();
 //BA.debugLineNum = 244;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmparallax*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 245;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmparallax*/ (_designmode);
 //BA.debugLineNum = 246;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _createradiogroup(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmradiogroup _el = null;
 //BA.debugLineNum = 471;BA.debugLine="Sub CreateRadioGroup(sid As String, eventHandler A";
 //BA.debugLineNum = 472;BA.debugLine="Dim el As VMRadioGroup";
_el = new b4j.example.vmradiogroup();
 //BA.debugLineNum = 473;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmradiogroup*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 474;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmradiogroup*/ (_designmode);
 //BA.debugLineNum = 475;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 476;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _createrating(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmrating _el = null;
 //BA.debugLineNum = 221;BA.debugLine="Sub CreateRating(eID As String, eventHandler As Ob";
 //BA.debugLineNum = 222;BA.debugLine="Dim el As VMRating";
_el = new b4j.example.vmrating();
 //BA.debugLineNum = 223;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmrating*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 224;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmrating*/ (_designmode);
 //BA.debugLineNum = 225;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _createselect(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 875;BA.debugLine="Sub CreateSelect(sid As String, eventHandler As Ob";
 //BA.debugLineNum = 876;BA.debugLine="Dim el As VMSelect";
_el = new b4j.example.vmselect();
 //BA.debugLineNum = 877;BA.debugLine="el.Initialize(vue,sid,eventHandler)";
_el._initialize /*b4j.example.vmselect*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 878;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmselect*/ (_designmode);
 //BA.debugLineNum = 879;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 880;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _createslider(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmslider _el = null;
 //BA.debugLineNum = 419;BA.debugLine="Sub CreateSlider(sid As String, eventHandler As Ob";
 //BA.debugLineNum = 420;BA.debugLine="Dim el As VMSlider";
_el = new b4j.example.vmslider();
 //BA.debugLineNum = 421;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmslider*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 422;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmslider*/ (_designmode);
 //BA.debugLineNum = 423;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 424;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _createspeeddial(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmspeeddial _el = null;
 //BA.debugLineNum = 214;BA.debugLine="Sub CreateSpeedDial(sid As String, eventHandler As";
 //BA.debugLineNum = 215;BA.debugLine="Dim el As VMSpeedDial";
_el = new b4j.example.vmspeeddial();
 //BA.debugLineNum = 216;BA.debugLine="el.Initialize(vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmspeeddial*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 217;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmspeeddial*/ (_designmode);
 //BA.debugLineNum = 218;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _createstepper(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmstepper _el = null;
 //BA.debugLineNum = 166;BA.debugLine="Sub CreateStepper(sid As String, eventHandler As O";
 //BA.debugLineNum = 167;BA.debugLine="Dim el As VMStepper";
_el = new b4j.example.vmstepper();
 //BA.debugLineNum = 168;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmstepper*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 169;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmstepper*/ (_designmode);
 //BA.debugLineNum = 170;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _createswitch(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmcheckbox _el = null;
 //BA.debugLineNum = 440;BA.debugLine="Sub CreateSwitch(sid As String, eventHandler As Ob";
 //BA.debugLineNum = 441;BA.debugLine="Dim el As VMCheckBox";
_el = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 442;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 443;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmcheckbox*/ (_designmode);
 //BA.debugLineNum = 444;BA.debugLine="el.SetSwitch";
_el._setswitch /*b4j.example.vmcheckbox*/ ();
 //BA.debugLineNum = 445;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 446;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _createsystembar(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmtoolbar _el = null;
 //BA.debugLineNum = 337;BA.debugLine="Sub CreateSystemBar(sid As String, moduleObj As Ob";
 //BA.debugLineNum = 338;BA.debugLine="Dim el As VMToolBar";
_el = new b4j.example.vmtoolbar();
 //BA.debugLineNum = 339;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmtoolbar*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 340;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmtoolbar*/ (_designmode);
 //BA.debugLineNum = 341;BA.debugLine="el.SetSystemBar(True)";
_el._setsystembar /*b4j.example.vmtoolbar*/ (__c.True);
 //BA.debugLineNum = 342;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _createtabs(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmtabs _el = null;
 //BA.debugLineNum = 228;BA.debugLine="Sub CreateTabs(sid As String, eventHandler As Obje";
 //BA.debugLineNum = 229;BA.debugLine="Dim el As VMTabs";
_el = new b4j.example.vmtabs();
 //BA.debugLineNum = 230;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmtabs*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 231;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmtabs*/ (_designmode);
 //BA.debugLineNum = 232;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _createtextfield(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmtextfield _el = null;
 //BA.debugLineNum = 729;BA.debugLine="Sub CreateTextField(sid As String, eventHandler As";
 //BA.debugLineNum = 730;BA.debugLine="Dim el As VMTextField";
_el = new b4j.example.vmtextfield();
 //BA.debugLineNum = 731;BA.debugLine="el.Initialize(vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmtextfield*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 732;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmtextfield*/ (_designmode);
 //BA.debugLineNum = 733;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 734;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _createtoolbar(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmtoolbar _el = null;
 //BA.debugLineNum = 345;BA.debugLine="Sub CreateToolbar(sid As String, moduleObj As Obje";
 //BA.debugLineNum = 346;BA.debugLine="Dim el As VMToolBar";
_el = new b4j.example.vmtoolbar();
 //BA.debugLineNum = 347;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmtoolbar*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 348;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmtoolbar*/ (_designmode);
 //BA.debugLineNum = 349;BA.debugLine="el.SetToolBar(True)";
_el._settoolbar /*b4j.example.vmtoolbar*/ (__c.True);
 //BA.debugLineNum = 350;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 1648;BA.debugLine="private Sub CStr(o As Object) As String";
 //BA.debugLineNum = 1649;BA.debugLine="If o = BANano.UNDEFINED Then o = \"\"";
if ((_o).equals(_banano.UNDEFINED())) { 
_o = (Object)("");};
 //BA.debugLineNum = 1650;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 1651;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _disable() throws Exception{
 //BA.debugLineNum = 2049;BA.debugLine="Sub Disable As VMContainer";
 //BA.debugLineNum = 2050;BA.debugLine="Container.Disable(True)";
_container._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 2051;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2052;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _enable() throws Exception{
 //BA.debugLineNum = 2044;BA.debugLine="Sub Enable As VMContainer";
 //BA.debugLineNum = 2045;BA.debugLine="Container.Enable(True)";
_container._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 2046;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2047;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getdata() throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
b4j.example.vmcontainer._checkedunchecked _record = null;
anywheresoftware.b4a.objects.collections.List _xlst = null;
 //BA.debugLineNum = 1030;BA.debugLine="Sub GetData As Map";
 //BA.debugLineNum = 1031;BA.debugLine="Dim m As Map = CreateMap()";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1032;BA.debugLine="m = vue.GetStates(Fields)";
_m = _vue._getstates /*anywheresoftware.b4a.objects.collections.Map*/ (_fields);
 //BA.debugLineNum = 1033;BA.debugLine="m = LinkRecordTypes(m)";
_m = _linkrecordtypes(_m);
 //BA.debugLineNum = 1035;BA.debugLine="For Each record As CheckedUnchecked In afewoption";
{
final anywheresoftware.b4a.BA.IterableList group4 = _afewoptions;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_record = (b4j.example.vmcontainer._checkedunchecked)(group4.Get(index4));
 //BA.debugLineNum = 1036;BA.debugLine="Dim xlst As List";
_xlst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1037;BA.debugLine="xlst.Initialize";
_xlst.Initialize();
 //BA.debugLineNum = 1038;BA.debugLine="xlst.Add(record.fieldname)";
_xlst.Add((Object)(_record.fieldname /*String*/ ));
 //BA.debugLineNum = 1039;BA.debugLine="m = SetUncheckedValue(m, xlst, record.checkedVal";
_m = _setuncheckedvalue(_m,_xlst,BA.ObjectToString(_record.checkedValue /*Object*/ ),BA.ObjectToString(_record.uncheckedValue /*Object*/ ));
 }
};
 //BA.debugLineNum = 1041;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 1042;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _hide() throws Exception{
 //BA.debugLineNum = 2034;BA.debugLine="Sub Hide As VMContainer";
 //BA.debugLineNum = 2035;BA.debugLine="Container.SetVisible(False)";
_container._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 2036;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2037;BA.debugLine="End Sub";
return null;
}
public String  _hiderc(int _rowpos,int _colpos) throws Exception{
String _rowkey = "";
 //BA.debugLineNum = 1578;BA.debugLine="Sub HideRC(rowPos As Int, colPos As Int)";
 //BA.debugLineNum = 1579;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 1580;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 1581;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 1583;BA.debugLine="rowKey = $\"${rowKey}show\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"show");
 //BA.debugLineNum = 1584;BA.debugLine="vue.SetData(rowKey, False)";
_vue._setdata /*b4j.example.bananovue*/ (_rowkey,(Object)(__c.False));
 //BA.debugLineNum = 1585;BA.debugLine="End Sub";
return "";
}
public int  _howmanyrows() throws Exception{
 //BA.debugLineNum = 1938;BA.debugLine="Sub HowManyRows() As Int";
 //BA.debugLineNum = 1939;BA.debugLine="Return LastRow";
if (true) return _lastrow;
 //BA.debugLineNum = 1940;BA.debugLine="End Sub";
return 0;
}
public b4j.example.vmcontainer  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 61;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 62;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 63;BA.debugLine="HasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 64;BA.debugLine="rowClasses.Initialize";
_rowclasses.Initialize();
 //BA.debugLineNum = 65;BA.debugLine="rowStyles.Initialize";
_rowstyles.Initialize();
 //BA.debugLineNum = 66;BA.debugLine="attributes.Initialize";
_attributes.Initialize();
 //BA.debugLineNum = 67;BA.debugLine="afewoptions.Initialize";
_afewoptions.Initialize();
 //BA.debugLineNum = 68;BA.debugLine="Container.Initialize(v, ID)";
_container._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 69;BA.debugLine="Container.SetTag(\"v-container\")";
_container._settag /*b4j.example.vmelement*/ ("v-container");
 //BA.debugLineNum = 70;BA.debugLine="showKey = $\"${ID}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"show");
 //BA.debugLineNum = 71;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 72;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 73;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 74;BA.debugLine="LastRow = 0";
_lastrow = (int) (0);
 //BA.debugLineNum = 75;BA.debugLine="Rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 76;BA.debugLine="RC.Initialize";
_rc.Initialize();
 //BA.debugLineNum = 77;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 78;BA.debugLine="Components.Initialize";
_components.Initialize();
 //BA.debugLineNum = 80;BA.debugLine="TotalRows = 0";
_totalrows = (int) (0);
 //BA.debugLineNum = 81;BA.debugLine="rowStyles.Initialize";
_rowstyles.Initialize();
 //BA.debugLineNum = 82;BA.debugLine="sortitM.Initialize";
_sortitm.Initialize();
 //BA.debugLineNum = 83;BA.debugLine="sortItL.Initialize";
_sortitl.Initialize();
 //BA.debugLineNum = 84;BA.debugLine="Fields.Initialize";
_fields.Initialize();
 //BA.debugLineNum = 85;BA.debugLine="Controls.Initialize";
_controls.Initialize();
 //BA.debugLineNum = 86;BA.debugLine="Strings.Initialize";
_strings.Initialize();
 //BA.debugLineNum = 87;BA.debugLine="Integers.Initialize";
_integers.Initialize();
 //BA.debugLineNum = 88;BA.debugLine="Booleans.Initialize";
_booleans.Initialize();
 //BA.debugLineNum = 89;BA.debugLine="Defaults.Initialize";
_defaults.Initialize();
 //BA.debugLineNum = 90;BA.debugLine="Required.Initialize";
_required.Initialize();
 //BA.debugLineNum = 91;BA.debugLine="Doubles.Initialize";
_doubles.Initialize();
 //BA.debugLineNum = 92;BA.debugLine="Dates.initialize";
_dates.Initialize();
 //BA.debugLineNum = 93;BA.debugLine="cells.Initialize";
_cells.Initialize();
 //BA.debugLineNum = 94;BA.debugLine="visibility.Initialize";
_visibility.Initialize();
 //BA.debugLineNum = 95;BA.debugLine="Exclusions.Initialize";
_exclusions.Initialize();
 //BA.debugLineNum = 96;BA.debugLine="Mode = \"A\"";
_mode = "A";
 //BA.debugLineNum = 97;BA.debugLine="HasInfoBox = False";
_hasinfobox = __c.False;
 //BA.debugLineNum = 98;BA.debugLine="bControls = False";
_bcontrols = __c.False;
 //BA.debugLineNum = 99;BA.debugLine="HasBorder = False";
_hasborder = __c.False;
 //BA.debugLineNum = 100;BA.debugLine="ShowMatrix = False";
_showmatrix = __c.False;
 //BA.debugLineNum = 101;BA.debugLine="NoGutters = False";
_nogutters = __c.False;
 //BA.debugLineNum = 102;BA.debugLine="cStatic = True";
_cstatic = __c.True;
 //BA.debugLineNum = 103;BA.debugLine="UseVShow = True";
_usevshow = __c.True;
 //BA.debugLineNum = 104;BA.debugLine="SetVShow(Container.showKey)";
_setvshow(_container._showkey /*String*/ );
 //BA.debugLineNum = 105;BA.debugLine="Show";
_show();
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _linkrecordtypes(anywheresoftware.b4a.objects.collections.Map _rec) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nrec = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 1049;BA.debugLine="Sub LinkRecordTypes(rec As Map) As Map";
 //BA.debugLineNum = 1050;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1051;BA.debugLine="For Each k As String In rec.keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _rec.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1052;BA.debugLine="Dim v As Object = rec.Get(k)";
_v = _rec.Get((Object)(_k));
 //BA.debugLineNum = 1053;BA.debugLine="k = k.ToLowerCase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 1054;BA.debugLine="nrec.Put(k, v)";
_nrec.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 1056;BA.debugLine="If Doubles.Size > 0 Then vue.MakeDouble(nrec, Dou";
if (_doubles.getSize()>0) { 
_vue._makedouble /*String*/ (_nrec,_doubles);};
 //BA.debugLineNum = 1057;BA.debugLine="If Integers.Size > 0 Then vue.MakeInteger(nrec, I";
if (_integers.getSize()>0) { 
_vue._makeinteger /*String*/ (_nrec,_integers);};
 //BA.debugLineNum = 1058;BA.debugLine="If Strings.Size > 0 Then vue.MakeTrim(nrec, Strin";
if (_strings.getSize()>0) { 
_vue._maketrim /*String*/ (_nrec,_strings);};
 //BA.debugLineNum = 1059;BA.debugLine="If Dates.Size > 0 Then vue.MakeDate(nrec, Dates)";
if (_dates.getSize()>0) { 
_vue._makedate /*String*/ (_nrec,_dates);};
 //BA.debugLineNum = 1060;BA.debugLine="If Booleans.Size > 0 Then vue.MakeBoolean(nrec, B";
if (_booleans.getSize()>0) { 
_vue._makeboolean /*String*/ (_nrec,_booleans);};
 //BA.debugLineNum = 1061;BA.debugLine="Return nrec";
if (true) return _nrec;
 //BA.debugLineNum = 1062;BA.debugLine="End Sub";
return null;
}
public String  _mapkeys2delim(anywheresoftware.b4a.objects.collections.Map _m,String _delim) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _strkey = "";
 //BA.debugLineNum = 1653;BA.debugLine="private Sub MapKeys2Delim(m As Map, delim As Strin";
 //BA.debugLineNum = 1654;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1655;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1656;BA.debugLine="Dim kTot As Int = m.Size - 1";
_ktot = (int) (_m.getSize()-1);
 //BA.debugLineNum = 1657;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 1658;BA.debugLine="Dim strKey As String = m.getkeyat(0)";
_strkey = BA.ObjectToString(_m.GetKeyAt((int) (0)));
 //BA.debugLineNum = 1659;BA.debugLine="sb.Append(strKey)";
_sb.Append(_strkey);
 //BA.debugLineNum = 1660;BA.debugLine="For kCnt = 1 To kTot";
{
final int step7 = 1;
final int limit7 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit7 ;_kcnt = _kcnt + step7 ) {
 //BA.debugLineNum = 1661;BA.debugLine="Dim strKey As String = m.getkeyat(kCnt)";
_strkey = BA.ObjectToString(_m.GetKeyAt(_kcnt));
 //BA.debugLineNum = 1662;BA.debugLine="sb.Append(delim).append(strKey)";
_sb.Append(_delim).Append(_strkey);
 }
};
 //BA.debugLineNum = 1664;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1665;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _newautocompletedatasource(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,boolean _brequired,boolean _bmultiple,String _splaceholder,String _sourcetable,String _sourcefield,String _displayfield,boolean _returnobject,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 309;BA.debugLine="Sub NewAutoCompleteDataSource(eventHandler As Obje";
 //BA.debugLineNum = 310;BA.debugLine="Dim el As VMSelect = CreateSelect(sname, eventHan";
_el = _createselect(_sname,_eventhandler);
 //BA.debugLineNum = 311;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmselect*/ (_designmode);
 //BA.debugLineNum = 312;BA.debugLine="el.SetAutoComplete";
_el._setautocomplete /*b4j.example.vmselect*/ ();
 //BA.debugLineNum = 313;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmselect*/ (_bstatic);
 //BA.debugLineNum = 314;BA.debugLine="el.Setlabel(sLabel)";
_el._setlabel /*b4j.example.vmselect*/ (_slabel);
 //BA.debugLineNum = 315;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmselect*/ (_brequired);
 //BA.debugLineNum = 316;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmselect*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 317;BA.debugLine="el.SetPlaceholder(sPlaceHolder)";
_el._setplaceholder /*b4j.example.vmselect*/ (_splaceholder);
 //BA.debugLineNum = 318;BA.debugLine="el.SetHint(sHelperText)";
_el._sethint /*b4j.example.vmselect*/ (_shelpertext);
 //BA.debugLineNum = 319;BA.debugLine="el.SetMultiple(bMultiple)";
_el._setmultiple /*b4j.example.vmselect*/ (_bmultiple);
 //BA.debugLineNum = 320;BA.debugLine="el.SetDataSource(sourceTable, sourceField, displa";
_el._setdatasource /*b4j.example.vmselect*/ (_sourcetable,_sourcefield,_displayfield,_returnobject);
 //BA.debugLineNum = 321;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmselect*/ (_vmodel);
 //BA.debugLineNum = 322;BA.debugLine="el.SetRules(True)";
_el._setrules /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 323;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmselect*/ (__c.False);
 //BA.debugLineNum = 324;BA.debugLine="el.SetErrorMessages(True)";
_el._seterrormessages /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 325;BA.debugLine="el.Combo.ErrorMessage = sErrorText";
_el._combo /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 326;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _newautocompleteoptions(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,boolean _brequired,boolean _bmultiple,String _splaceholder,anywheresoftware.b4a.objects.collections.Map _optionsm,String _sourcefield,String _displayfield,boolean _returnobject,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 841;BA.debugLine="Sub NewAutoCompleteOptions(eventHandler As Object,";
 //BA.debugLineNum = 842;BA.debugLine="Dim el As VMSelect = CreateSelect(sname, eventHan";
_el = _createselect(_sname,_eventhandler);
 //BA.debugLineNum = 843;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmselect*/ (_designmode);
 //BA.debugLineNum = 844;BA.debugLine="el.SetAutoComplete";
_el._setautocomplete /*b4j.example.vmselect*/ ();
 //BA.debugLineNum = 845;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmselect*/ (_bstatic);
 //BA.debugLineNum = 846;BA.debugLine="el.Setlabel(sLabel)";
_el._setlabel /*b4j.example.vmselect*/ (_slabel);
 //BA.debugLineNum = 847;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmselect*/ (_brequired);
 //BA.debugLineNum = 848;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmselect*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 849;BA.debugLine="el.Setplaceholder(sPlaceHolder)";
_el._setplaceholder /*b4j.example.vmselect*/ (_splaceholder);
 //BA.debugLineNum = 850;BA.debugLine="el.SetHint(sHelperText)";
_el._sethint /*b4j.example.vmselect*/ (_shelpertext);
 //BA.debugLineNum = 851;BA.debugLine="el.Setmultiple(bMultiple)";
_el._setmultiple /*b4j.example.vmselect*/ (_bmultiple);
 //BA.debugLineNum = 852;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmselect*/ (_vmodel);
 //BA.debugLineNum = 853;BA.debugLine="el.SetOptions($\"${vmodel}items\"$, optionsm, sourc";
_el._setoptions /*b4j.example.vmselect*/ ((""+__c.SmartStringFormatter("",(Object)(_vmodel))+"items"),_optionsm,_sourcefield,_displayfield,_returnobject);
 //BA.debugLineNum = 854;BA.debugLine="el.SetRules(True)";
_el._setrules /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 855;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmselect*/ (__c.False);
 //BA.debugLineNum = 856;BA.debugLine="el.SetErrorMessages(True)";
_el._seterrormessages /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 857;BA.debugLine="el.Combo.ErrorMessage = sErrorText";
_el._combo /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 858;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 859;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newblockquote(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 637;BA.debugLine="Sub NewBLOCKQUOTE(bStatic As Boolean,sname As Stri";
 //BA.debugLineNum = 638;BA.debugLine="Return NewLabel(bStatic,sname, sname, \"blockquote";
if (true) return _newlabel(_bstatic,_sname,_sname,"blockquote",_stext);
 //BA.debugLineNum = 639;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _newbutton(Object _eventhandler,boolean _bstatic,String _sname,String _slabel,boolean _braised,boolean _bprimary,boolean _baccent,boolean _bfitwidth) throws Exception{
b4j.example.vmbutton _el = null;
 //BA.debugLineNum = 862;BA.debugLine="Sub NewButton(eventHandler As Object,bStatic As Bo";
 //BA.debugLineNum = 863;BA.debugLine="Dim el As VMButton = CreateButton(sname, eventHan";
_el = _createbutton(_sname,_eventhandler);
 //BA.debugLineNum = 864;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 865;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 866;BA.debugLine="el.SetLabel(sLabel)";
_el._setlabel /*b4j.example.vmbutton*/ (_slabel);
 //BA.debugLineNum = 867;BA.debugLine="If bRaised = False Then el.SetTransparent(True)";
if (_braised==__c.False) { 
_el._settransparent /*b4j.example.vmbutton*/ (__c.True);};
 //BA.debugLineNum = 868;BA.debugLine="If bPrimary Then el.SetPrimary(bPrimary)";
if (_bprimary) { 
_el._setprimary /*b4j.example.vmbutton*/ (_bprimary);};
 //BA.debugLineNum = 869;BA.debugLine="If bAccent Then el.SetColor(\"accent\")";
if (_baccent) { 
_el._setcolor /*b4j.example.vmbutton*/ ("accent");};
 //BA.debugLineNum = 870;BA.debugLine="If bFitWidth Then el.SetBlock(True)";
if (_bfitwidth) { 
_el._setblock /*b4j.example.vmbutton*/ (__c.True);};
 //BA.debugLineNum = 871;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 872;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _newcheckbox(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,Object _svalue,Object _sunchecked,boolean _bprimary,int _itabindex) throws Exception{
b4j.example.vmcheckbox _el = null;
 //BA.debugLineNum = 667;BA.debugLine="Sub NewCheckBox(eventHandler As Object, bStatic As";
 //BA.debugLineNum = 668;BA.debugLine="Dim el As VMCheckBox = CreateCheckBox(sid, eventH";
_el = _createcheckbox(_sid,_eventhandler);
 //BA.debugLineNum = 669;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmcheckbox*/ (_designmode);
 //BA.debugLineNum = 670;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmcheckbox*/ (_bstatic);
 //BA.debugLineNum = 671;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmcheckbox*/ (_vmodel);
 //BA.debugLineNum = 672;BA.debugLine="el.SetTrueValue(svalue)";
_el._settruevalue /*b4j.example.vmcheckbox*/ (BA.ObjectToString(_svalue));
 //BA.debugLineNum = 673;BA.debugLine="el.SetValue(svalue)";
_el._setvalue /*b4j.example.vmcheckbox*/ (BA.ObjectToString(_svalue));
 //BA.debugLineNum = 674;BA.debugLine="el.Setlabel(slabel)";
_el._setlabel /*b4j.example.vmcheckbox*/ (_slabel);
 //BA.debugLineNum = 675;BA.debugLine="el.SetPrimary(bPrimary)";
_el._setprimary /*b4j.example.vmcheckbox*/ (_bprimary);
 //BA.debugLineNum = 676;BA.debugLine="el.SetUncheckedValue(sunchecked)";
_el._setuncheckedvalue /*b4j.example.vmcheckbox*/ (_sunchecked);
 //BA.debugLineNum = 677;BA.debugLine="el.SetFalseValue(sunchecked)";
_el._setfalsevalue /*b4j.example.vmcheckbox*/ (BA.ObjectToString(_sunchecked));
 //BA.debugLineNum = 678;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmcheckbox*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 679;BA.debugLine="vue.SetData(vmodel, sunchecked)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,_sunchecked);
 //BA.debugLineNum = 680;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 681;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _newcombodatasource(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,boolean _brequired,boolean _bmultiple,String _splaceholder,String _sourcetable,String _sourcefield,String _displayfield,boolean _returnobject,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 536;BA.debugLine="Sub NewComboDataSource(eventHandler As Object,bSta";
 //BA.debugLineNum = 537;BA.debugLine="Dim el As VMSelect = CreateSelect(sname, eventHan";
_el = _createselect(_sname,_eventhandler);
 //BA.debugLineNum = 538;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmselect*/ (_designmode);
 //BA.debugLineNum = 539;BA.debugLine="el.SetComboBox";
_el._setcombobox /*b4j.example.vmselect*/ ();
 //BA.debugLineNum = 540;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmselect*/ (_bstatic);
 //BA.debugLineNum = 541;BA.debugLine="el.Setlabel(sLabel)";
_el._setlabel /*b4j.example.vmselect*/ (_slabel);
 //BA.debugLineNum = 542;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmselect*/ (_brequired);
 //BA.debugLineNum = 543;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmselect*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 544;BA.debugLine="el.SetPlaceholder(sPlaceHolder)";
_el._setplaceholder /*b4j.example.vmselect*/ (_splaceholder);
 //BA.debugLineNum = 545;BA.debugLine="el.SetHint(sHelperText)";
_el._sethint /*b4j.example.vmselect*/ (_shelpertext);
 //BA.debugLineNum = 546;BA.debugLine="el.SetMultiple(bMultiple)";
_el._setmultiple /*b4j.example.vmselect*/ (_bmultiple);
 //BA.debugLineNum = 547;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmselect*/ (_vmodel);
 //BA.debugLineNum = 548;BA.debugLine="el.SetDataSource(sourceTable, sourceField, displa";
_el._setdatasource /*b4j.example.vmselect*/ (_sourcetable,_sourcefield,_displayfield,_returnobject);
 //BA.debugLineNum = 549;BA.debugLine="el.SetRules(True)";
_el._setrules /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 550;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmselect*/ (__c.False);
 //BA.debugLineNum = 551;BA.debugLine="el.SetErrorMessages(True)";
_el._seterrormessages /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 552;BA.debugLine="el.Combo.ErrorMessage = sErrorText";
_el._combo /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 553;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 554;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _newcombooptions(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,boolean _brequired,boolean _bmultiple,String _splaceholder,anywheresoftware.b4a.objects.collections.Map _optionsm,String _sourcefield,String _displayfield,boolean _returnobject,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 557;BA.debugLine="Sub NewComboOptions(eventHandler As Object,bStatic";
 //BA.debugLineNum = 558;BA.debugLine="Dim el As VMSelect = CreateSelect(sname, eventHan";
_el = _createselect(_sname,_eventhandler);
 //BA.debugLineNum = 559;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmselect*/ (_designmode);
 //BA.debugLineNum = 560;BA.debugLine="el.SetComboBox";
_el._setcombobox /*b4j.example.vmselect*/ ();
 //BA.debugLineNum = 561;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmselect*/ (_bstatic);
 //BA.debugLineNum = 562;BA.debugLine="el.Setlabel(sLabel)";
_el._setlabel /*b4j.example.vmselect*/ (_slabel);
 //BA.debugLineNum = 563;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmselect*/ (_brequired);
 //BA.debugLineNum = 564;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmselect*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 565;BA.debugLine="el.Setplaceholder(sPlaceHolder)";
_el._setplaceholder /*b4j.example.vmselect*/ (_splaceholder);
 //BA.debugLineNum = 566;BA.debugLine="el.SetHint(sHelperText)";
_el._sethint /*b4j.example.vmselect*/ (_shelpertext);
 //BA.debugLineNum = 567;BA.debugLine="el.Setmultiple(bMultiple)";
_el._setmultiple /*b4j.example.vmselect*/ (_bmultiple);
 //BA.debugLineNum = 568;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmselect*/ (_vmodel);
 //BA.debugLineNum = 569;BA.debugLine="el.SetOptions($\"${vmodel}items\"$, optionsm, sourc";
_el._setoptions /*b4j.example.vmselect*/ ((""+__c.SmartStringFormatter("",(Object)(_vmodel))+"items"),_optionsm,_sourcefield,_displayfield,_returnobject);
 //BA.debugLineNum = 570;BA.debugLine="el.SetRules(True)";
_el._setrules /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 571;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmselect*/ (__c.False);
 //BA.debugLineNum = 572;BA.debugLine="el.SetErrorMessages(True)";
_el._seterrormessages /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 573;BA.debugLine="el.Combo.ErrorMessage = sErrorText";
_el._combo /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 574;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 575;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _newcontainer(Object _eventhandler,boolean _bstatic,String _sname) throws Exception{
b4j.example.vmcontainer _el = null;
 //BA.debugLineNum = 302;BA.debugLine="Sub NewContainer(eventHandler As Object, bStatic A";
 //BA.debugLineNum = 303;BA.debugLine="Dim el As VMContainer = CreateContainer(sname, ev";
_el = _createcontainer(_sname,_eventhandler);
 //BA.debugLineNum = 304;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmcontainer*/ (_bstatic);
 //BA.debugLineNum = 305;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmcontainer*/ (_designmode);
 //BA.debugLineNum = 306;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _newdatepicker(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,boolean _brequired,String _splaceholder,String _shint,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmdatetimepicker _el = null;
 //BA.debugLineNum = 691;BA.debugLine="Sub NewDatePicker(eventHandler As Object, bStatic";
 //BA.debugLineNum = 692;BA.debugLine="Dim el As VMDateTimePicker = CreateDateTimePicker";
_el = _createdatetimepicker(_sid,_eventhandler);
 //BA.debugLineNum = 693;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmdatetimepicker*/ (_designmode);
 //BA.debugLineNum = 694;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmdatetimepicker*/ (_bstatic);
 //BA.debugLineNum = 695;BA.debugLine="el.Setlabel(slabel)";
_el._setlabel /*b4j.example.vmdatetimepicker*/ (_slabel);
 //BA.debugLineNum = 696;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmdatetimepicker*/ (_brequired);
 //BA.debugLineNum = 697;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmdatetimepicker*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 698;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmdatetimepicker*/ (_vmodel);
 //BA.debugLineNum = 699;BA.debugLine="el.SetPlaceHolder(sPlaceholder)";
_el._setplaceholder /*b4j.example.vmdatetimepicker*/ (_splaceholder);
 //BA.debugLineNum = 700;BA.debugLine="el.SetHint(sHint)";
_el._sethint /*b4j.example.vmdatetimepicker*/ (_shint);
 //BA.debugLineNum = 701;BA.debugLine="el.TextField.SetRules(True)";
_el._textfield /*b4j.example.vmtextfield*/ ._setrules /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 702;BA.debugLine="el.TextField.SetErrorMessages(True)";
_el._textfield /*b4j.example.vmtextfield*/ ._seterrormessages /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 703;BA.debugLine="el.DateTimePicker.ErrorMessage = sErrorText";
_el._datetimepicker /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 704;BA.debugLine="el.TextField.SetError(False)";
_el._textfield /*b4j.example.vmtextfield*/ ._seterror /*b4j.example.vmtextfield*/ (__c.False);
 //BA.debugLineNum = 705;BA.debugLine="el.SetForInput";
_el._setforinput /*b4j.example.vmdatetimepicker*/ ();
 //BA.debugLineNum = 706;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 707;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _newemail(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,String _sicon,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmtextfield _el = null;
 //BA.debugLineNum = 448;BA.debugLine="Sub NewEmail(eventHandler As Object, bStatic As Bo";
 //BA.debugLineNum = 449;BA.debugLine="Dim el As VMTextField = NewTextField(eventHandler";
_el = _newtextfield(_eventhandler,_bstatic,_sid,_vmodel,_slabel,_splaceholder,_brequired,_sicon,(int) (0),_shelpertext,_serrortext,_itabindex);
 //BA.debugLineNum = 450;BA.debugLine="el.SetType(\"email\")";
_el._settype /*b4j.example.vmtextfield*/ ("email");
 //BA.debugLineNum = 451;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _newfabbutton(Object _eventhandler,boolean _bstatic,String _sname,String _iconname,String _scolor,String _stooltip) throws Exception{
b4j.example.vmbutton _el = null;
 //BA.debugLineNum = 596;BA.debugLine="Sub NewFABButton(eventHandler As Object,bStatic As";
 //BA.debugLineNum = 597;BA.debugLine="Dim el As VMButton = CreateFABButton(sname, event";
_el = _createfabbutton(_sname,_eventhandler,_iconname);
 //BA.debugLineNum = 598;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 599;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 600;BA.debugLine="el.SetColor(sColor)";
_el._setcolor /*b4j.example.vmbutton*/ (_scolor);
 //BA.debugLineNum = 601;BA.debugLine="el.SetTooltip(sTooltip)";
_el._settooltip /*b4j.example.vmbutton*/ (_stooltip);
 //BA.debugLineNum = 602;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 603;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _newfile(Object _eventhandler,boolean _bstatic,boolean _bupload,String _sname,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
 //BA.debugLineNum = 809;BA.debugLine="Sub NewFile(eventHandler As Object,bStatic As Bool";
 //BA.debugLineNum = 810;BA.debugLine="Return NewFileInput(eventHandler,bStatic,bUpload,";
if (true) return _newfileinput(_eventhandler,_bstatic,_bupload,_sname,_vmodel,_slabel,_splaceholder,_brequired,_shelpertext,_serrortext,_itabindex);
 //BA.debugLineNum = 811;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _newfileinput(Object _eventhandler,boolean _bstatic,boolean _bupload,String _sname,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmfileinput _el = null;
 //BA.debugLineNum = 813;BA.debugLine="Sub NewFileInput(eventHandler As Object,bStatic As";
 //BA.debugLineNum = 814;BA.debugLine="Dim el As VMFileInput = CreateFileInput(sname, ev";
_el = _createfileinput(_sname,_eventhandler);
 //BA.debugLineNum = 815;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmfileinput*/ (_designmode);
 //BA.debugLineNum = 816;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmfileinput*/ (_bstatic);
 //BA.debugLineNum = 817;BA.debugLine="el.SetHint(shelperText)";
_el._sethint /*b4j.example.vmfileinput*/ (_shelpertext);
 //BA.debugLineNum = 818;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmfileinput*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 819;BA.debugLine="el.SetPlaceHolder(splaceholder)";
_el._setplaceholder /*b4j.example.vmfileinput*/ (_splaceholder);
 //BA.debugLineNum = 820;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmfileinput*/ (_vmodel);
 //BA.debugLineNum = 821;BA.debugLine="el.SetClearable(False)";
_el._setclearable /*b4j.example.vmfileinput*/ (__c.False);
 //BA.debugLineNum = 822;BA.debugLine="el.Setlabel(slabel)";
_el._setlabel /*b4j.example.vmfileinput*/ (_slabel);
 //BA.debugLineNum = 823;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmfileinput*/ (_brequired);
 //BA.debugLineNum = 824;BA.debugLine="vue.SetData(vmodel, Null)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,__c.Null);
 //BA.debugLineNum = 825;BA.debugLine="el.SetRules(vue.newlist)";
_el._setrules /*b4j.example.vmfileinput*/ (_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 826;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmfileinput*/ (__c.False);
 //BA.debugLineNum = 827;BA.debugLine="el.SetErrorMessages(vue.newlist)";
_el._seterrormessages /*b4j.example.vmfileinput*/ (_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 828;BA.debugLine="el.SetErrorText(sErrorText)";
_el._seterrortext /*b4j.example.vmfileinput*/ (_serrortext);
 //BA.debugLineNum = 829;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 830;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newh1(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 605;BA.debugLine="Sub NewH1(bStatic As Boolean,sname As String, sTex";
 //BA.debugLineNum = 606;BA.debugLine="Return NewLabel(bStatic,sname, sname, \"h1\", sText";
if (true) return _newlabel(_bstatic,_sname,_sname,"h1",_stext);
 //BA.debugLineNum = 607;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newh2(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 609;BA.debugLine="Sub NewH2(bStatic As Boolean,sname As String, sTex";
 //BA.debugLineNum = 610;BA.debugLine="Return NewLabel(bStatic,sname, sname, \"h2\", sText";
if (true) return _newlabel(_bstatic,_sname,_sname,"h2",_stext);
 //BA.debugLineNum = 611;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newh3(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 613;BA.debugLine="Sub NewH3(bStatic As Boolean,sname As String, sTex";
 //BA.debugLineNum = 614;BA.debugLine="Return NewLabel(bStatic,sname, sname, \"h3\", sText";
if (true) return _newlabel(_bstatic,_sname,_sname,"h3",_stext);
 //BA.debugLineNum = 615;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newh4(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 617;BA.debugLine="Sub NewH4(bStatic As Boolean,sname As String, sTex";
 //BA.debugLineNum = 618;BA.debugLine="Return NewLabel(bStatic,sname, sname, \"h4\", sText";
if (true) return _newlabel(_bstatic,_sname,_sname,"h4",_stext);
 //BA.debugLineNum = 619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newh5(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 621;BA.debugLine="Sub NewH5(bStatic As Boolean,sname As String, sTex";
 //BA.debugLineNum = 622;BA.debugLine="Return NewLabel(bStatic,sname,sname, \"h5\", sText)";
if (true) return _newlabel(_bstatic,_sname,_sname,"h5",_stext);
 //BA.debugLineNum = 623;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newh6(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 625;BA.debugLine="Sub NewH6(bStatic As Boolean,sname As String, sTex";
 //BA.debugLineNum = 626;BA.debugLine="Return NewLabel(bStatic,sname, sname, \"h6\", sText";
if (true) return _newlabel(_bstatic,_sname,_sname,"h6",_stext);
 //BA.debugLineNum = 627;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _newicon(Object _eventhandler,boolean _bstatic,String _sname,String _sicon,String _ssize,String _scolor,String _sintensity) throws Exception{
b4j.example.vmicon _el = null;
 //BA.debugLineNum = 408;BA.debugLine="Sub NewIcon(eventHandler As Object,bStatic As Bool";
 //BA.debugLineNum = 409;BA.debugLine="Dim el As VMIcon = CreateIcon(sname, eventHandler";
_el = _createicon(_sname,_eventhandler);
 //BA.debugLineNum = 410;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 411;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmicon*/ (_bstatic);
 //BA.debugLineNum = 412;BA.debugLine="el.SetText(sIcon)";
_el._settext /*b4j.example.vmicon*/ (_sicon);
 //BA.debugLineNum = 413;BA.debugLine="el.SetAttributes(Array(sSize))";
_el._setattributes /*b4j.example.vmicon*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_ssize)}));
 //BA.debugLineNum = 414;BA.debugLine="el.SetColorIntensity(scolor,sintensity)";
_el._setcolorintensity /*b4j.example.vmicon*/ (_scolor,_sintensity);
 //BA.debugLineNum = 415;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _newiconbutton(Object _eventhandler,boolean _bstatic,String _sname,String _iconname,String _scolor,String _stooltip) throws Exception{
b4j.example.vmbutton _el = null;
 //BA.debugLineNum = 586;BA.debugLine="Sub NewIconButton(eventHandler As Object,bStatic A";
 //BA.debugLineNum = 587;BA.debugLine="Dim el As VMButton = CreateButton(sname, eventHan";
_el = _createbutton(_sname,_eventhandler);
 //BA.debugLineNum = 588;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 589;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 590;BA.debugLine="el.SetIconButton(iconName)";
_el._seticonbutton /*b4j.example.vmbutton*/ (_iconname);
 //BA.debugLineNum = 591;BA.debugLine="el.SetColor(sColor)";
_el._setcolor /*b4j.example.vmbutton*/ (_scolor);
 //BA.debugLineNum = 592;BA.debugLine="el.SetTooltip(sTooltip)";
_el._settooltip /*b4j.example.vmbutton*/ (_stooltip);
 //BA.debugLineNum = 593;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 594;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _newimage(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _src,String _salt,String _swidth,String _sheight) throws Exception{
b4j.example.vmimage _el = null;
 //BA.debugLineNum = 373;BA.debugLine="Sub NewImage(eventHandler As Object,bStatic As Boo";
 //BA.debugLineNum = 374;BA.debugLine="vmodel = vmodel.ToLowerCase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 375;BA.debugLine="Dim el As VMImage = CreateImage(sname, eventHandl";
_el = _createimage(_sname,_eventhandler);
 //BA.debugLineNum = 376;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmimage*/ (_designmode);
 //BA.debugLineNum = 377;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmimage*/ (_bstatic);
 //BA.debugLineNum = 378;BA.debugLine="el.SetWidth(swidth)";
_el._setwidth /*b4j.example.vmimage*/ (_swidth);
 //BA.debugLineNum = 379;BA.debugLine="el.SetHeight(sheight)";
_el._setheight /*b4j.example.vmimage*/ (_sheight);
 //BA.debugLineNum = 380;BA.debugLine="el.SetAlt(salt)";
_el._setalt /*b4j.example.vmimage*/ (_salt);
 //BA.debugLineNum = 381;BA.debugLine="el.SetVModel(vmodel, src)";
_el._setvmodel /*b4j.example.vmimage*/ (_vmodel,_src);
 //BA.debugLineNum = 382;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newlabel(boolean _bstatic,String _sname,String _vmodel,String _ssize,String _stext) throws Exception{
b4j.example.vmlabel _el = null;
 //BA.debugLineNum = 386;BA.debugLine="Sub NewLabel(bStatic As Boolean,sname As String, v";
 //BA.debugLineNum = 387;BA.debugLine="vmodel = vmodel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 388;BA.debugLine="vue.SetStateSingle(vmodel, sText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_vmodel,(Object)(_stext));
 //BA.debugLineNum = 389;BA.debugLine="Dim el As VMLabel = CreateLabel(sname)";
_el = _createlabel(_sname);
 //BA.debugLineNum = 390;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmlabel*/ (_designmode);
 //BA.debugLineNum = 391;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmlabel*/ (_bstatic);
 //BA.debugLineNum = 392;BA.debugLine="el.SetTag(sSize)";
_el._settag /*b4j.example.vmlabel*/ (_ssize);
 //BA.debugLineNum = 393;BA.debugLine="el.SetVModel(vmodel, sText)";
_el._setvmodel /*b4j.example.vmlabel*/ (_vmodel,_stext);
 //BA.debugLineNum = 394;BA.debugLine="Select Case sSize";
switch (BA.switchObjectToInt(_ssize,_vue._size_blockquote /*String*/ )) {
case 0: {
 //BA.debugLineNum = 396;BA.debugLine="el.AddClass(\"blockquote\")";
_el._addclass /*b4j.example.vmlabel*/ ("blockquote");
 break; }
}
;
 //BA.debugLineNum = 398;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _newnumber(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,String _sicon,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmtextfield _el = null;
 //BA.debugLineNum = 771;BA.debugLine="Sub NewNumber(eventHandler As Object,bStatic As Bo";
 //BA.debugLineNum = 772;BA.debugLine="Dim el As VMTextField = NewTextField(eventHandler";
_el = _newtextfield(_eventhandler,_bstatic,_sname,_vmodel,_slabel,_splaceholder,_brequired,_sicon,(int) (0),_shelpertext,_serrortext,_itabindex);
 //BA.debugLineNum = 773;BA.debugLine="el.SetType(\"number\")";
_el._settype /*b4j.example.vmtextfield*/ ("number");
 //BA.debugLineNum = 774;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 775;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newp(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 629;BA.debugLine="Sub NewP(bStatic As Boolean,sname As String, sText";
 //BA.debugLineNum = 630;BA.debugLine="Return NewLabel(bStatic,sname, sname, \"p\", sText)";
if (true) return _newlabel(_bstatic,_sname,_sname,"p",_stext);
 //BA.debugLineNum = 631;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _newparallax(Object _eventhandler,boolean _bstatic,String _sname,String _sheight,String _src,String _salt) throws Exception{
b4j.example.vmparallax _el = null;
 //BA.debugLineNum = 292;BA.debugLine="Sub NewParallax(eventHandler As Object,bStatic As";
 //BA.debugLineNum = 293;BA.debugLine="Dim el As VMParallax = CreateParallax(sname, even";
_el = _createparallax(_sname,_eventhandler);
 //BA.debugLineNum = 294;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmparallax*/ (_bstatic);
 //BA.debugLineNum = 295;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmparallax*/ (_designmode);
 //BA.debugLineNum = 296;BA.debugLine="el.SetHeight(sheight)";
_el._setheight /*b4j.example.vmparallax*/ (_sheight);
 //BA.debugLineNum = 297;BA.debugLine="el.SetSrc(src)";
_el._setsrc /*b4j.example.vmparallax*/ (_src);
 //BA.debugLineNum = 298;BA.debugLine="el.SetAlt(salt)";
_el._setalt /*b4j.example.vmparallax*/ (_salt);
 //BA.debugLineNum = 299;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _newpassword(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,boolean _btoggle,String _sicon,int _imaxlen,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmtextfield _el = null;
 //BA.debugLineNum = 802;BA.debugLine="Sub NewPassword(eventHandler As Object,bStatic As";
 //BA.debugLineNum = 803;BA.debugLine="Dim el As VMTextField = NewTextField(eventHandler";
_el = _newtextfield(_eventhandler,_bstatic,_sname,_vmodel,_slabel,_splaceholder,_brequired,_sicon,_imaxlen,_shelpertext,_serrortext,_itabindex);
 //BA.debugLineNum = 804;BA.debugLine="el.SetPassword(True, bToggle)";
_el._setpassword /*b4j.example.vmtextfield*/ (__c.True,_btoggle);
 //BA.debugLineNum = 805;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 806;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _newradiogroup(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,Object _svalue,anywheresoftware.b4a.objects.collections.Map _optionsm,boolean _bshowlabel,boolean _blabelontop,int _itabindex) throws Exception{
b4j.example.vmradiogroup _el = null;
 //BA.debugLineNum = 478;BA.debugLine="Sub NewRadioGroup(eventHandler As Object, bStatic";
 //BA.debugLineNum = 479;BA.debugLine="Dim el As VMRadioGroup = CreateRadioGroup(sid, ev";
_el = _createradiogroup(_sid,_eventhandler);
 //BA.debugLineNum = 480;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmradiogroup*/ (_designmode);
 //BA.debugLineNum = 481;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmradiogroup*/ (_bstatic);
 //BA.debugLineNum = 482;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmradiogroup*/ (_vmodel);
 //BA.debugLineNum = 483;BA.debugLine="el.Setlabel(slabel)";
_el._setlabel /*b4j.example.vmradiogroup*/ (_slabel);
 //BA.debugLineNum = 484;BA.debugLine="el.SetOptions(optionsm)";
_el._setoptions /*String*/ (_optionsm);
 //BA.debugLineNum = 485;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmradiogroup*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 486;BA.debugLine="el.SetValue(svalue)";
_el._setvalue /*b4j.example.vmradiogroup*/ (BA.ObjectToString(_svalue));
 //BA.debugLineNum = 487;BA.debugLine="vue.SetData(vmodel, svalue)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,_svalue);
 //BA.debugLineNum = 488;BA.debugLine="If bShowLabel = False Then el.SetLabel(\"\")";
if (_bshowlabel==__c.False) { 
_el._setlabel /*b4j.example.vmradiogroup*/ ("");};
 //BA.debugLineNum = 489;BA.debugLine="If bLabelOnTop Then";
if (_blabelontop) { 
 //BA.debugLineNum = 490;BA.debugLine="el.SetColumn(bLabelOnTop)";
_el._setcolumn /*b4j.example.vmradiogroup*/ (_blabelontop);
 }else {
 //BA.debugLineNum = 492;BA.debugLine="el.SetRow(True)";
_el._setrow /*b4j.example.vmradiogroup*/ (__c.True);
 };
 //BA.debugLineNum = 494;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _newradiogroupdatasource(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,String _svalue,String _sourcetable,String _sourcefield,String _displayfield,boolean _bshowlabel,boolean _blabelontop,int _itabindex) throws Exception{
b4j.example.vmradiogroup _el = null;
 //BA.debugLineNum = 641;BA.debugLine="Sub NewRadioGroupDataSource(eventHandler As Object";
 //BA.debugLineNum = 642;BA.debugLine="Dim el As VMRadioGroup = CreateRadioGroup(sname,";
_el = _createradiogroup(_sname,_eventhandler);
 //BA.debugLineNum = 643;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmradiogroup*/ (_designmode);
 //BA.debugLineNum = 644;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmradiogroup*/ (_bstatic);
 //BA.debugLineNum = 645;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmradiogroup*/ (_vmodel);
 //BA.debugLineNum = 646;BA.debugLine="el.Setlabel(sLabel)";
_el._setlabel /*b4j.example.vmradiogroup*/ (_slabel);
 //BA.debugLineNum = 647;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmradiogroup*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 648;BA.debugLine="el.SetDataSource(sourceTable, sourceField, displa";
_el._setdatasource /*b4j.example.vmradiogroup*/ (_sourcetable,_sourcefield,_displayfield);
 //BA.debugLineNum = 649;BA.debugLine="vue.SetData(vmodel, svalue)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(_svalue));
 //BA.debugLineNum = 650;BA.debugLine="If bShowLabel = False Then el.SetLabel(\"\")";
if (_bshowlabel==__c.False) { 
_el._setlabel /*b4j.example.vmradiogroup*/ ("");};
 //BA.debugLineNum = 651;BA.debugLine="If bLabelOnTop Then";
if (_blabelontop) { 
 //BA.debugLineNum = 652;BA.debugLine="el.SetColumn(bLabelOnTop)";
_el._setcolumn /*b4j.example.vmradiogroup*/ (_blabelontop);
 }else {
 //BA.debugLineNum = 654;BA.debugLine="el.SetRow(True)";
_el._setrow /*b4j.example.vmradiogroup*/ (__c.True);
 };
 //BA.debugLineNum = 656;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 657;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _newselectdatasource(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,boolean _brequired,boolean _bmultiple,String _splaceholder,String _sourcetable,String _sourcefield,String _displayfield,boolean _returnobject,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 497;BA.debugLine="Sub NewSelectDataSource(eventHandler As Object,bSt";
 //BA.debugLineNum = 498;BA.debugLine="Dim el As VMSelect = CreateSelect(sname, eventHan";
_el = _createselect(_sname,_eventhandler);
 //BA.debugLineNum = 499;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmselect*/ (_designmode);
 //BA.debugLineNum = 500;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmselect*/ (_bstatic);
 //BA.debugLineNum = 501;BA.debugLine="el.Setlabel(sLabel)";
_el._setlabel /*b4j.example.vmselect*/ (_slabel);
 //BA.debugLineNum = 502;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmselect*/ (_brequired);
 //BA.debugLineNum = 503;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmselect*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 504;BA.debugLine="el.SetPlaceholder(sPlaceHolder)";
_el._setplaceholder /*b4j.example.vmselect*/ (_splaceholder);
 //BA.debugLineNum = 505;BA.debugLine="el.SetHint(sHelperText)";
_el._sethint /*b4j.example.vmselect*/ (_shelpertext);
 //BA.debugLineNum = 506;BA.debugLine="el.SetMultiple(bMultiple)";
_el._setmultiple /*b4j.example.vmselect*/ (_bmultiple);
 //BA.debugLineNum = 507;BA.debugLine="el.SetDataSource(sourceTable, sourceField, displa";
_el._setdatasource /*b4j.example.vmselect*/ (_sourcetable,_sourcefield,_displayfield,_returnobject);
 //BA.debugLineNum = 508;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmselect*/ (_vmodel);
 //BA.debugLineNum = 509;BA.debugLine="el.SetRules(True)";
_el._setrules /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 510;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmselect*/ (__c.False);
 //BA.debugLineNum = 511;BA.debugLine="el.SetErrorMessages(True)";
_el._seterrormessages /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 512;BA.debugLine="el.Combo.ErrorMessage = sErrorText";
_el._combo /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 513;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 514;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _newselectoptions(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,boolean _brequired,boolean _bmultiple,String _splaceholder,anywheresoftware.b4a.objects.collections.Map _optionsm,String _sourcefield,String _displayfield,boolean _returnobject,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 517;BA.debugLine="Sub NewSelectOptions(eventHandler As Object,bStati";
 //BA.debugLineNum = 518;BA.debugLine="Dim el As VMSelect = CreateSelect(sname, eventHan";
_el = _createselect(_sname,_eventhandler);
 //BA.debugLineNum = 519;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmselect*/ (_designmode);
 //BA.debugLineNum = 520;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmselect*/ (_bstatic);
 //BA.debugLineNum = 521;BA.debugLine="el.Setlabel(sLabel)";
_el._setlabel /*b4j.example.vmselect*/ (_slabel);
 //BA.debugLineNum = 522;BA.debugLine="el.Setrequired(bRequired)";
_el._setrequired /*b4j.example.vmselect*/ (_brequired);
 //BA.debugLineNum = 523;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmselect*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 524;BA.debugLine="el.Setplaceholder(sPlaceHolder)";
_el._setplaceholder /*b4j.example.vmselect*/ (_splaceholder);
 //BA.debugLineNum = 525;BA.debugLine="el.SetHint(sHelperText)";
_el._sethint /*b4j.example.vmselect*/ (_shelpertext);
 //BA.debugLineNum = 526;BA.debugLine="el.Setmultiple(bMultiple)";
_el._setmultiple /*b4j.example.vmselect*/ (_bmultiple);
 //BA.debugLineNum = 527;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmselect*/ (_vmodel);
 //BA.debugLineNum = 528;BA.debugLine="el.SetOptions($\"${vmodel}items\"$, optionsm, sourc";
_el._setoptions /*b4j.example.vmselect*/ ((""+__c.SmartStringFormatter("",(Object)(_vmodel))+"items"),_optionsm,_sourcefield,_displayfield,_returnobject);
 //BA.debugLineNum = 529;BA.debugLine="el.SetRules(True)";
_el._setrules /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 530;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmselect*/ (__c.False);
 //BA.debugLineNum = 531;BA.debugLine="el.SetErrorMessages(True)";
_el._seterrormessages /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 532;BA.debugLine="el.Combo.ErrorMessage = sErrorText";
_el._combo /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 533;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 534;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _newslider(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,String _iminvalue,String _imaxvalue,int _itabindex) throws Exception{
b4j.example.vmslider _el = null;
 //BA.debugLineNum = 427;BA.debugLine="Sub NewSlider(eventHandler As Object,bStatic As Bo";
 //BA.debugLineNum = 428;BA.debugLine="Dim el As VMSlider = CreateSlider(sid, eventHandl";
_el = _createslider(_sid,_eventhandler);
 //BA.debugLineNum = 429;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmslider*/ (_designmode);
 //BA.debugLineNum = 430;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmslider*/ (_bstatic);
 //BA.debugLineNum = 431;BA.debugLine="el.SetMin(iMinValue)";
_el._setmin /*b4j.example.vmslider*/ ((double)(Double.parseDouble(_iminvalue)));
 //BA.debugLineNum = 432;BA.debugLine="el.SetMax(iMaxValue)";
_el._setmax /*b4j.example.vmslider*/ ((double)(Double.parseDouble(_imaxvalue)));
 //BA.debugLineNum = 433;BA.debugLine="el.SetLabel(slabel)";
_el._setlabel /*b4j.example.vmslider*/ (_slabel);
 //BA.debugLineNum = 434;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmslider*/ (_vmodel);
 //BA.debugLineNum = 435;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmslider*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 436;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newspan(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 633;BA.debugLine="Sub NewSPAN(bstatic As Boolean,sname As String, sT";
 //BA.debugLineNum = 634;BA.debugLine="Return NewLabel(bstatic,sname, sname, \"span\", sTe";
if (true) return _newlabel(_bstatic,_sname,_sname,"span",_stext);
 //BA.debugLineNum = 635;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _newswitch(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,Object _svalue,Object _sunchecked,boolean _bprimary,int _itabindex) throws Exception{
b4j.example.vmcheckbox _el = null;
 //BA.debugLineNum = 454;BA.debugLine="Sub NewSwitch(eventHandler As Object, bStatic As B";
 //BA.debugLineNum = 455;BA.debugLine="Dim el As VMCheckBox = CreateSwitch(sid, eventHan";
_el = _createswitch(_sid,_eventhandler);
 //BA.debugLineNum = 456;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmcheckbox*/ (_designmode);
 //BA.debugLineNum = 457;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmcheckbox*/ (_bstatic);
 //BA.debugLineNum = 458;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmcheckbox*/ (_vmodel);
 //BA.debugLineNum = 459;BA.debugLine="el.Setlabel(slabel)";
_el._setlabel /*b4j.example.vmcheckbox*/ (_slabel);
 //BA.debugLineNum = 460;BA.debugLine="el.SetValue(svalue)";
_el._setvalue /*b4j.example.vmcheckbox*/ (BA.ObjectToString(_svalue));
 //BA.debugLineNum = 461;BA.debugLine="el.SetTrueValue(svalue)";
_el._settruevalue /*b4j.example.vmcheckbox*/ (BA.ObjectToString(_svalue));
 //BA.debugLineNum = 462;BA.debugLine="el.SetPrimary(bPrimary)";
_el._setprimary /*b4j.example.vmcheckbox*/ (_bprimary);
 //BA.debugLineNum = 463;BA.debugLine="el.SetUncheckedValue(sunchecked)";
_el._setuncheckedvalue /*b4j.example.vmcheckbox*/ (_sunchecked);
 //BA.debugLineNum = 464;BA.debugLine="el.SetFalseValue(sunchecked)";
_el._setfalsevalue /*b4j.example.vmcheckbox*/ (BA.ObjectToString(_sunchecked));
 //BA.debugLineNum = 465;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmcheckbox*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 466;BA.debugLine="vue.SetData(vmodel, sunchecked)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,_sunchecked);
 //BA.debugLineNum = 467;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 468;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _newtel(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,String _sicon,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmtextfield _el = null;
 //BA.debugLineNum = 765;BA.debugLine="Sub NewTel(eventHandler As Object,bStatic As Boole";
 //BA.debugLineNum = 766;BA.debugLine="Dim el As VMTextField = NewTextField(eventHandler";
_el = _newtextfield(_eventhandler,_bstatic,_sname,_vmodel,_slabel,_splaceholder,_brequired,_sicon,(int) (0),_shelpertext,_serrortext,_itabindex);
 //BA.debugLineNum = 767;BA.debugLine="el.SetType(\"tel\")";
_el._settype /*b4j.example.vmtextfield*/ ("tel");
 //BA.debugLineNum = 768;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 769;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _newtext(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,String _sicon,int _imaxlen,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
 //BA.debugLineNum = 738;BA.debugLine="Sub NewText(eventHandler As Object,bStatic As Bool";
 //BA.debugLineNum = 739;BA.debugLine="Return NewTextField(eventHandler,bStatic,sid, vmo";
if (true) return _newtextfield(_eventhandler,_bstatic,_sid,_vmodel,_slabel,_splaceholder,_brequired,_sicon,_imaxlen,_shelpertext,_serrortext,_itabindex);
 //BA.debugLineNum = 740;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _newtextarea(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,boolean _bautogrow,String _sicon,int _imaxlen,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmtextfield _el = null;
 //BA.debugLineNum = 777;BA.debugLine="Sub NewTextArea(eventHandler As Object,bStatic As";
 //BA.debugLineNum = 778;BA.debugLine="Dim el As VMTextField = CreateTextField(sname, ev";
_el = _createtextfield(_sname,_eventhandler);
 //BA.debugLineNum = 779;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmtextfield*/ (_designmode);
 //BA.debugLineNum = 780;BA.debugLine="el.SetTextArea";
_el._settextarea /*b4j.example.vmtextfield*/ ();
 //BA.debugLineNum = 781;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmtextfield*/ (_bstatic);
 //BA.debugLineNum = 782;BA.debugLine="el.Setlabel(slabel)";
_el._setlabel /*b4j.example.vmtextfield*/ (_slabel);
 //BA.debugLineNum = 783;BA.debugLine="el.Setrequired(bRequired)";
_el._setrequired /*b4j.example.vmtextfield*/ (_brequired);
 //BA.debugLineNum = 784;BA.debugLine="el.SetPrependIcon(sIcon)";
_el._setprependicon /*b4j.example.vmtextfield*/ (_sicon);
 //BA.debugLineNum = 785;BA.debugLine="If iMaxLen > 0 Then";
if (_imaxlen>0) { 
 //BA.debugLineNum = 786;BA.debugLine="el.SetCounter(iMaxLen)";
_el._setcounter /*b4j.example.vmtextfield*/ (BA.ObjectToBoolean(_imaxlen));
 //BA.debugLineNum = 787;BA.debugLine="el.SetMaxLength(iMaxLen)";
_el._setmaxlength /*b4j.example.vmtextfield*/ (BA.NumberToString(_imaxlen));
 };
 //BA.debugLineNum = 789;BA.debugLine="el.SetPlaceHolder(splaceholder)";
_el._setplaceholder /*b4j.example.vmtextfield*/ (_splaceholder);
 //BA.debugLineNum = 790;BA.debugLine="el.SetHint(shelpertext)";
_el._sethint /*b4j.example.vmtextfield*/ (_shelpertext);
 //BA.debugLineNum = 791;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmtextfield*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 792;BA.debugLine="el.SetAutoGrow(bAutoGrow)";
_el._setautogrow /*b4j.example.vmtextfield*/ (_bautogrow);
 //BA.debugLineNum = 793;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmtextfield*/ (_vmodel);
 //BA.debugLineNum = 794;BA.debugLine="el.SetRules(True)";
_el._setrules /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 795;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmtextfield*/ (__c.False);
 //BA.debugLineNum = 796;BA.debugLine="el.SetErrorMessages(True)";
_el._seterrormessages /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 797;BA.debugLine="el.TextField.ErrorMessage = sErrorText";
_el._textfield /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 798;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 799;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _newtextfield(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,String _sicon,int _imaxlen,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmtextfield _el = null;
 //BA.debugLineNum = 742;BA.debugLine="Sub NewTextField(eventHandler As Object,bStatic As";
 //BA.debugLineNum = 743;BA.debugLine="Dim el As VMTextField = CreateTextField(sid, even";
_el = _createtextfield(_sid,_eventhandler);
 //BA.debugLineNum = 744;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmtextfield*/ (_designmode);
 //BA.debugLineNum = 745;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmtextfield*/ (_bstatic);
 //BA.debugLineNum = 746;BA.debugLine="el.Setlabel(slabel)";
_el._setlabel /*b4j.example.vmtextfield*/ (_slabel);
 //BA.debugLineNum = 747;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmtextfield*/ (_brequired);
 //BA.debugLineNum = 748;BA.debugLine="el.SetPrependIcon(sIcon)";
_el._setprependicon /*b4j.example.vmtextfield*/ (_sicon);
 //BA.debugLineNum = 749;BA.debugLine="If iMaxLen > 0 Then";
if (_imaxlen>0) { 
 //BA.debugLineNum = 750;BA.debugLine="el.SetMaxLength(iMaxLen)";
_el._setmaxlength /*b4j.example.vmtextfield*/ (BA.NumberToString(_imaxlen));
 //BA.debugLineNum = 751;BA.debugLine="el.SetCounter(True)";
_el._setcounter /*b4j.example.vmtextfield*/ (__c.True);
 };
 //BA.debugLineNum = 753;BA.debugLine="el.SetPlaceHolder(splaceholder)";
_el._setplaceholder /*b4j.example.vmtextfield*/ (_splaceholder);
 //BA.debugLineNum = 754;BA.debugLine="el.SetHint(shelpertext)";
_el._sethint /*b4j.example.vmtextfield*/ (_shelpertext);
 //BA.debugLineNum = 755;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmtextfield*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 756;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmtextfield*/ (_vmodel);
 //BA.debugLineNum = 757;BA.debugLine="el.SetType(\"text\")";
_el._settype /*b4j.example.vmtextfield*/ ("text");
 //BA.debugLineNum = 758;BA.debugLine="el.SetRules(True)";
_el._setrules /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 759;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmtextfield*/ (__c.False);
 //BA.debugLineNum = 760;BA.debugLine="el.SetErrorMessages(True)";
_el._seterrormessages /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 761;BA.debugLine="el.TextField.ErrorMessage = sErrorText";
_el._textfield /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 762;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 763;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _newtimepicker(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,boolean _brequired,String _splaceholder,String _shint,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmdatetimepicker _el = null;
 //BA.debugLineNum = 709;BA.debugLine="Sub NewTimePicker(eventHandler As Object, bStatic";
 //BA.debugLineNum = 710;BA.debugLine="Dim el As VMDateTimePicker = CreateDateTimePicker";
_el = _createdatetimepicker(_sid,_eventhandler);
 //BA.debugLineNum = 711;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmdatetimepicker*/ (_designmode);
 //BA.debugLineNum = 712;BA.debugLine="el.SetTimePicker";
_el._settimepicker /*b4j.example.vmdatetimepicker*/ ();
 //BA.debugLineNum = 713;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmdatetimepicker*/ (_bstatic);
 //BA.debugLineNum = 714;BA.debugLine="el.Setlabel(slabel)";
_el._setlabel /*b4j.example.vmdatetimepicker*/ (_slabel);
 //BA.debugLineNum = 715;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmdatetimepicker*/ (_vmodel);
 //BA.debugLineNum = 716;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmdatetimepicker*/ (_brequired);
 //BA.debugLineNum = 717;BA.debugLine="el.SetPlaceHolder(sPlaceholder)";
_el._setplaceholder /*b4j.example.vmdatetimepicker*/ (_splaceholder);
 //BA.debugLineNum = 718;BA.debugLine="el.SetHint(sHint)";
_el._sethint /*b4j.example.vmdatetimepicker*/ (_shint);
 //BA.debugLineNum = 719;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmdatetimepicker*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 720;BA.debugLine="el.TextField.SetRules(True)";
_el._textfield /*b4j.example.vmtextfield*/ ._setrules /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 721;BA.debugLine="el.TextField.SetErrorMessages(True)";
_el._textfield /*b4j.example.vmtextfield*/ ._seterrormessages /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 722;BA.debugLine="el.TextField.SetError(False)";
_el._textfield /*b4j.example.vmtextfield*/ ._seterror /*b4j.example.vmtextfield*/ (__c.False);
 //BA.debugLineNum = 723;BA.debugLine="el.SetForInput";
_el._setforinput /*b4j.example.vmdatetimepicker*/ ();
 //BA.debugLineNum = 724;BA.debugLine="el.DateTimePicker.ErrorMessage = sErrorText";
_el._datetimepicker /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 725;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 726;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _nospaces(anywheresoftware.b4a.objects.collections.Map _rec,anywheresoftware.b4a.objects.collections.List _sfields) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nrec = null;
String _k = "";
Object _v = null;
String _v1 = "";
 //BA.debugLineNum = 1064;BA.debugLine="Sub NoSpaces(rec As Map, sFields As List) As Map";
 //BA.debugLineNum = 1065;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1066;BA.debugLine="For Each k As String In rec.keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _rec.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1067;BA.debugLine="Dim v As Object = rec.Get(k)";
_v = _rec.Get((Object)(_k));
 //BA.debugLineNum = 1068;BA.debugLine="If sFields.IndexOf(k) = -1 Then";
if (_sfields.IndexOf((Object)(_k))==-1) { 
 //BA.debugLineNum = 1069;BA.debugLine="nrec.Put(k, v)";
_nrec.Put((Object)(_k),_v);
 }else {
 //BA.debugLineNum = 1071;BA.debugLine="Dim v1 As String = vue.CStr(v)";
_v1 = _vue._cstr /*String*/ (_v);
 //BA.debugLineNum = 1072;BA.debugLine="v1 = v1.Replace(\" \",\"\")";
_v1 = _v1.replace(" ","");
 //BA.debugLineNum = 1073;BA.debugLine="v1 = v1.trim";
_v1 = _v1.trim();
 //BA.debugLineNum = 1074;BA.debugLine="nrec.Put(k, v1)";
_nrec.Put((Object)(_k),(Object)(_v1));
 };
 }
};
 //BA.debugLineNum = 1077;BA.debugLine="Return nrec";
if (true) return _nrec;
 //BA.debugLineNum = 1078;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 1979;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 1980;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 1981;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 2063;BA.debugLine="public Sub RemoveAttr(sName As String) As VMContai";
 //BA.debugLineNum = 2064;BA.debugLine="Container.RemoveAttr(sName)";
_container._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 2065;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2066;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _removerequired(String _r) throws Exception{
 //BA.debugLineNum = 990;BA.debugLine="Sub RemoveRequired(r As String) As VMContainer";
 //BA.debugLineNum = 991;BA.debugLine="r = r.tolowercase";
_r = _r.toLowerCase();
 //BA.debugLineNum = 992;BA.debugLine="Required.Remove(r)";
_required.Remove((Object)(_r));
 //BA.debugLineNum = 993;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 994;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 1953;BA.debugLine="Sub Render";
 //BA.debugLineNum = 1954;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 1955;BA.debugLine="End Sub";
return "";
}
public boolean  _rowexists(int _rowpos) throws Exception{
String _rowcol = "";
 //BA.debugLineNum = 1926;BA.debugLine="Sub RowExists(rowPos As Int) As Boolean";
 //BA.debugLineNum = 1927;BA.debugLine="Dim rowcol As String = $\"${ID}r${rowPos}\"$";
_rowcol = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_rowpos))+"");
 //BA.debugLineNum = 1928;BA.debugLine="Return Rows.ContainsKey(rowcol)";
if (true) return _rows.ContainsKey((Object)(_rowcol));
 //BA.debugLineNum = 1929;BA.debugLine="End Sub";
return false;
}
public b4j.example.vmcontainer  _setaligncenterrow(int _rowpos) throws Exception{
 //BA.debugLineNum = 1478;BA.debugLine="Sub SetAlignCenterRow(rowPos As Int) As VMContaine";
 //BA.debugLineNum = 1479;BA.debugLine="SetAlignRC(rowPos, 0, \"center\")";
_setalignrc(_rowpos,(int) (0),"center");
 //BA.debugLineNum = 1480;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1481;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setaligncontentrc(int _rowpos,int _colpos,String _align) throws Exception{
 //BA.debugLineNum = 1468;BA.debugLine="Sub SetAlignContentRC(rowPos As Int, colPos As Int";
 //BA.debugLineNum = 1469;BA.debugLine="SetAttrRC(rowPos, colPos, \"align-content\", align)";
_setattrrc(_rowpos,_colpos,"align-content",_align);
 //BA.debugLineNum = 1470;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1471;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setalignrc(int _rowpos,int _colpos,String _align) throws Exception{
 //BA.debugLineNum = 1490;BA.debugLine="Sub SetAlignRC(rowPos As Int, colPos As Int, align";
 //BA.debugLineNum = 1491;BA.debugLine="SetAttrRC(rowPos, colPos, \"align\", align)";
_setattrrc(_rowpos,_colpos,"align",_align);
 //BA.debugLineNum = 1492;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1493;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setalignselfrc(int _rowpos,int _colpos,String _align) throws Exception{
 //BA.debugLineNum = 1496;BA.debugLine="Sub SetAlignSelfRC(rowPos As Int, colPos As Int, a";
 //BA.debugLineNum = 1497;BA.debugLine="SetAttrRC(rowPos, colPos, \"align-self\", align)";
_setattrrc(_rowpos,_colpos,"align-self",_align);
 //BA.debugLineNum = 1498;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1499;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 1990;BA.debugLine="Sub SetAttr(attr As Map) As VMContainer";
 //BA.debugLineNum = 1991;BA.debugLine="Container.SetAttr(attr)";
_container._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 1992;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1993;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 1158;BA.debugLine="Sub SetAttributes(attrs As List) As VMContainer";
 //BA.debugLineNum = 1159;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1160;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 1162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 1153;BA.debugLine="Sub SetAttrLoose(loose As String) As VMContainer";
 //BA.debugLineNum = 1154;BA.debugLine="Container.SetAttrLoose(loose)";
_container._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 1155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setattrrc(int _rowpos,int _colpos,String _prop,String _value) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
 //BA.debugLineNum = 1523;BA.debugLine="Sub SetAttrRC(rowPos As Int, colPos As Int, prop A";
 //BA.debugLineNum = 1524;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1525;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 1526;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 1527;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 1529;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (_attributes.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 1530;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 1532;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 1533;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 1535;BA.debugLine="rowc.Put(prop,value)";
_rowc.Put((Object)(_prop),(Object)(_value));
 //BA.debugLineNum = 1536;BA.debugLine="attributes.Put(rowKey,rowc)";
_attributes.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 1537;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1538;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 2102;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 2103;BA.debugLine="Container.SetAttrSingle(prop, value)";
_container._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 2104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2105;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _setbooleans(anywheresoftware.b4a.objects.collections.Map _rec,anywheresoftware.b4a.objects.collections.List _xfields,String _checkedvalue,String _uncheckedvalue) throws Exception{
String _sfield = "";
String _svalue = "";
 //BA.debugLineNum = 1002;BA.debugLine="Sub SetBooleans(rec As Map, xFields As List, check";
 //BA.debugLineNum = 1003;BA.debugLine="Try";
try { //BA.debugLineNum = 1004;BA.debugLine="For Each sfield As String In xFields";
{
final anywheresoftware.b4a.BA.IterableList group2 = _xfields;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_sfield = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1005;BA.debugLine="Dim svalue As String = rec.Get(sfield)";
_svalue = BA.ObjectToString(_rec.Get((Object)(_sfield)));
 //BA.debugLineNum = 1006;BA.debugLine="If svalue.EqualsIgnoreCase(checkedValue) Then r";
if (_svalue.equalsIgnoreCase(_checkedvalue)) { 
_rec.Put((Object)(_sfield),(Object)(__c.True));};
 //BA.debugLineNum = 1007;BA.debugLine="If svalue.EqualsIgnoreCase(UnCheckedValue) Then";
if (_svalue.equalsIgnoreCase(_uncheckedvalue)) { 
_rec.Put((Object)(_sfield),(Object)(__c.False));};
 }
};
 //BA.debugLineNum = 1009;BA.debugLine="Return rec";
if (true) return _rec;
 } 
       catch (Exception e9) {
			ba.setLastException(e9); //BA.debugLineNum = 1011;BA.debugLine="Return rec";
if (true) return _rec;
 };
 //BA.debugLineNum = 1013;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setborder(String _bwidth,String _bcolor,String _bstyle) throws Exception{
 //BA.debugLineNum = 1561;BA.debugLine="Sub SetBorder(bwidth As String, bcolor As String,";
 //BA.debugLineNum = 1562;BA.debugLine="If bstyle <> \"\" Then SetStyleSingle(\"border-style";
if ((_bstyle).equals("") == false) { 
_setstylesingle("border-style",_bstyle);};
 //BA.debugLineNum = 1563;BA.debugLine="If bwidth <> \"\" Then SetStyleSingle(\"border-width";
if ((_bwidth).equals("") == false) { 
_setstylesingle("border-width",_bwidth);};
 //BA.debugLineNum = 1564;BA.debugLine="If bcolor <> \"\" Then SetStyleSingle(\"border-color";
if ((_bcolor).equals("") == false) { 
_setstylesingle("border-color",_bcolor);};
 //BA.debugLineNum = 1565;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1566;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setbordercolor(String _bcolor) throws Exception{
 //BA.debugLineNum = 1554;BA.debugLine="Sub SetBorderColor(bcolor As String) As VMContaine";
 //BA.debugLineNum = 1555;BA.debugLine="If bcolor = \"\" Then Return Me";
if ((_bcolor).equals("")) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 1556;BA.debugLine="SetStyleSingle(\"border-color\", bcolor)";
_setstylesingle("border-color",_bcolor);
 //BA.debugLineNum = 1557;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1558;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setborderradius(String _size) throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Sub SetBorderRadius(size As String) As VMContainer";
 //BA.debugLineNum = 354;BA.debugLine="Container.SetBorderRadius(size)";
_container._setborderradius /*b4j.example.vmelement*/ (_size);
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setborderrc(int _rowpos,int _colpos,String _bwidth,String _bcolor,String _bstyle) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
 //BA.debugLineNum = 1589;BA.debugLine="Sub SetBorderRC(rowPos As Int, colPos As Int, bwid";
 //BA.debugLineNum = 1590;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1591;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 1592;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 1593;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 1595;BA.debugLine="If rowStyles.ContainsKey(rowKey) Then";
if (_rowstyles.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 1596;BA.debugLine="rowc = rowStyles.Get(rowKey)";
_rowc = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowstyles.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 1598;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 1599;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 1601;BA.debugLine="If bstyle <> \"\" Then rowc.Put(\"border-style\", bst";
if ((_bstyle).equals("") == false) { 
_rowc.Put((Object)("border-style"),(Object)(_bstyle));};
 //BA.debugLineNum = 1602;BA.debugLine="If bwidth <> \"\" Then rowc.Put(\"border-width\", bwi";
if ((_bwidth).equals("") == false) { 
_rowc.Put((Object)("border-width"),(Object)(_bwidth));};
 //BA.debugLineNum = 1603;BA.debugLine="If bcolor <> \"\" Then rowc.Put(\"border-color\", bco";
if ((_bcolor).equals("") == false) { 
_rowc.Put((Object)("border-color"),(Object)(_bcolor));};
 //BA.debugLineNum = 1604;BA.debugLine="rowStyles.Put(rowKey,rowc)";
_rowstyles.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 1605;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1606;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setborderstyle(String _bstyle) throws Exception{
 //BA.debugLineNum = 1541;BA.debugLine="Sub SetBorderStyle(bstyle As String) As VMContaine";
 //BA.debugLineNum = 1542;BA.debugLine="If bstyle = \"\" Then Return Me";
if ((_bstyle).equals("")) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 1543;BA.debugLine="SetStyleSingle(\"border-style\", bstyle)";
_setstylesingle("border-style",_bstyle);
 //BA.debugLineNum = 1544;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1545;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setborderwidth(String _bwidth) throws Exception{
 //BA.debugLineNum = 1547;BA.debugLine="Sub SetBorderWidth(bwidth As String) As VMContaine";
 //BA.debugLineNum = 1548;BA.debugLine="If bwidth = \"\" Then Return Me";
if ((_bwidth).equals("")) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 1549;BA.debugLine="SetStyleSingle(\"border-width\", bwidth)";
_setstylesingle("border-width",_bwidth);
 //BA.debugLineNum = 1550;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1551;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setcentercontentrc(int _r,int _c) throws Exception{
 //BA.debugLineNum = 1839;BA.debugLine="Sub SetCenterContentRC(r As Int, c As Int) As VMCo";
 //BA.debugLineNum = 1840;BA.debugLine="SetJustifyRC(r, c, \"center\")";
_setjustifyrc(_r,_c,"center");
 //BA.debugLineNum = 1841;BA.debugLine="SetAlignRC(r, c, \"center\")";
_setalignrc(_r,_c,"center");
 //BA.debugLineNum = 1842;BA.debugLine="AddClassRC(r, c, Array(\"mx-auto\"))";
_addclassrc(_r,_c,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("mx-auto")}));
 //BA.debugLineNum = 1843;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1844;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setclassrc(int _rowpos,int _colpos,String _classname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
 //BA.debugLineNum = 1295;BA.debugLine="Sub SetClassRC(rowPos As Int, colPos As Int, class";
 //BA.debugLineNum = 1297;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1298;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 1299;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 1300;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 1302;BA.debugLine="If rowClasses.ContainsKey(rowKey) Then";
if (_rowclasses.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 1303;BA.debugLine="rowc = rowClasses.Get(rowKey)";
_rowc = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowclasses.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 1305;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 1306;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 1308;BA.debugLine="rowc.Put(className,className)";
_rowc.Put((Object)(_classname),(Object)(_classname));
 //BA.debugLineNum = 1309;BA.debugLine="rowClasses.Put(rowKey,rowc)";
_rowclasses.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 1310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1311;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 2485;BA.debugLine="Sub SetColor(varColor As String) As VMContainer";
 //BA.debugLineNum = 2486;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 2487;BA.debugLine="If cStatic Then";
if (_cstatic) { 
 //BA.debugLineNum = 2488;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 2489;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 };
 //BA.debugLineNum = 2491;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 2492;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 2493;BA.debugLine="Container.Bind(\":color\", pp)";
_container._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 2494;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2495;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 2471;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 2472;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 2473;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 2474;BA.debugLine="If cStatic Then";
if (_cstatic) { 
 //BA.debugLineNum = 2475;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 2476;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 };
 //BA.debugLineNum = 2478;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 2479;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 2480;BA.debugLine="Container.Bind(\":color\", pp)";
_container._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 2481;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2482;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setcolorintensityrc(int _row,int _col,String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 1245;BA.debugLine="Sub SetColorIntensityRC(row As Int, col As Int, va";
 //BA.debugLineNum = 1246;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 1247;BA.debugLine="SetClassRC(row, col, scolor)";
_setclassrc(_row,_col,_scolor);
 //BA.debugLineNum = 1248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setcolorrc(int _row,int _col,String _varcolor) throws Exception{
 //BA.debugLineNum = 1252;BA.debugLine="Sub SetColorRC(row As Int, col As Int, varColor As";
 //BA.debugLineNum = 1253;BA.debugLine="SetClassRC(row, col, varColor)";
_setclassrc(_row,_col,_varcolor);
 //BA.debugLineNum = 1254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 125;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public String  _setdefaults() throws Exception{
String _k = "";
 //BA.debugLineNum = 976;BA.debugLine="Sub SetDefaults";
 //BA.debugLineNum = 977;BA.debugLine="vue.SetState(Defaults)";
_vue._setstate /*b4j.example.bananovue*/ (_defaults);
 //BA.debugLineNum = 978;BA.debugLine="vue.SetState(visibility)";
_vue._setstate /*b4j.example.bananovue*/ (_visibility);
 //BA.debugLineNum = 979;BA.debugLine="For Each k As String In Required.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _required.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 980;BA.debugLine="vue.HideError(k)";
_vue._hideerror /*String*/ (_k);
 }
};
 //BA.debugLineNum = 982;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _setdenserc(int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 1501;BA.debugLine="Sub SetDenseRC(rowPos As Int, colPos As Int) As VM";
 //BA.debugLineNum = 1502;BA.debugLine="SetAttrRC(rowPos, colPos, \"dense\", True)";
_setattrrc(_rowpos,_colpos,"dense",BA.ObjectToString(__c.True));
 //BA.debugLineNum = 1503;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1504;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 2079;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMContainer";
 //BA.debugLineNum = 2080;BA.debugLine="Container.SetDesignMode(b)";
_container._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 2081;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 2082;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2083;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 2232;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 2233;BA.debugLine="Container.SetDeviceOffsets(OS, OM, OL, OX)";
_container._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 2234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 2244;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 2245;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 2246;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 2247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2248;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 2238;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 2239;BA.debugLine="Container.SetDeviceSizes(SS, SM, SL, SX)";
_container._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 2240;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2241;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setdiv(boolean _b) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetDiv(b As Boolean) As VMContainer";
 //BA.debugLineNum = 187;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 188;BA.debugLine="SetTag(\"div\")";
_settag("div");
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setelevation(String _elx) throws Exception{
 //BA.debugLineNum = 956;BA.debugLine="Sub SetElevation(elx As String) As VMContainer";
 //BA.debugLineNum = 957;BA.debugLine="If elx = \"\" Then Return Me";
if ((_elx).equals("")) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 958;BA.debugLine="AddClass($\"elevation-${elx}\"$)";
_addclass(("elevation-"+__c.SmartStringFormatter("",(Object)(_elx))+""));
 //BA.debugLineNum = 959;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 960;BA.debugLine="End Sub";
return null;
}
public String  _setempty() throws Exception{
 //BA.debugLineNum = 972;BA.debugLine="Sub SetEmpty";
 //BA.debugLineNum = 973;BA.debugLine="vue.SetStateListValues(Fields)";
_vue._setstatelistvalues /*b4j.example.bananovue*/ (_fields);
 //BA.debugLineNum = 974;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _setfillheight(boolean _b) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetFillHeight(b As Boolean) As VMContainer";
 //BA.debugLineNum = 136;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 137;BA.debugLine="AddClass(\"fill-height\")";
_addclass("fill-height");
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setfluid(boolean _varfluid) throws Exception{
String _pp = "";
 //BA.debugLineNum = 2009;BA.debugLine="Sub SetFluid(varFluid As Boolean) As VMContainer";
 //BA.debugLineNum = 2010;BA.debugLine="If varFluid = False Then Return Me";
if (_varfluid==__c.False) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 2011;BA.debugLine="If cStatic Then";
if (_cstatic) { 
 //BA.debugLineNum = 2012;BA.debugLine="SetAttrSingle(\"fluid\", varFluid)";
_setattrsingle("fluid",BA.ObjectToString(_varfluid));
 //BA.debugLineNum = 2013;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 };
 //BA.debugLineNum = 2015;BA.debugLine="Dim pp As String = $\"${ID}Fluid\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Fluid");
 //BA.debugLineNum = 2016;BA.debugLine="vue.SetStateSingle(pp, varFluid)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfluid));
 //BA.debugLineNum = 2017;BA.debugLine="Container.Bind(\":fluid\", pp)";
_container._bind /*b4j.example.vmelement*/ (":fluid",_pp);
 //BA.debugLineNum = 2018;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2019;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _sethasborder(boolean _b) throws Exception{
 //BA.debugLineNum = 891;BA.debugLine="Sub SetHasBorder(b As Boolean) As VMContainer";
 //BA.debugLineNum = 892;BA.debugLine="HasBorder = b";
_hasborder = _b;
 //BA.debugLineNum = 893;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 894;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setheight(String _h) throws Exception{
 //BA.debugLineNum = 924;BA.debugLine="Sub SetHeight(h As String) As VMContainer";
 //BA.debugLineNum = 925;BA.debugLine="If h = \"\" Then Return Me";
if ((_h).equals("")) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 926;BA.debugLine="Container.SetStyleSingle(\"height\", h)";
_container._setstylesingle /*b4j.example.vmelement*/ ("height",(Object)(_h));
 //BA.debugLineNum = 927;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 928;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setjustifycenterrow(int _rowpos) throws Exception{
 //BA.debugLineNum = 1473;BA.debugLine="Sub SetJustifyCenterRow(rowPos As Int) As VMContai";
 //BA.debugLineNum = 1474;BA.debugLine="SetJustifyRC(rowPos, 0, \"center\")";
_setjustifyrc(_rowpos,(int) (0),"center");
 //BA.debugLineNum = 1475;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1476;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setjustifyrc(int _rowpos,int _colpos,String _align) throws Exception{
 //BA.debugLineNum = 1484;BA.debugLine="Sub SetJustifyRC(rowPos As Int, colPos As Int, ali";
 //BA.debugLineNum = 1485;BA.debugLine="SetAttrRC(rowPos, colPos, \"justify\", align)";
_setattrrc(_rowpos,_colpos,"justify",_align);
 //BA.debugLineNum = 1486;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1487;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setkeyrc(int _rowpos,int _colpos,String _keyname) throws Exception{
String _rowkey = "";
 //BA.debugLineNum = 1511;BA.debugLine="Sub SetKeyRC(rowPos As Int, colPos As Int, keyName";
 //BA.debugLineNum = 1512;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 1513;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 1514;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 1516;BA.debugLine="keyName = keyName.tolowercase";
_keyname = _keyname.toLowerCase();
 //BA.debugLineNum = 1517;BA.debugLine="vue.SetData(keyName, rowKey)";
_vue._setdata /*b4j.example.bananovue*/ (_keyname,(Object)(_rowkey));
 //BA.debugLineNum = 1518;BA.debugLine="SetAttrRC(rowPos, colPos, \":key\", keyName)";
_setattrrc(_rowpos,_colpos,":key",_keyname);
 //BA.debugLineNum = 1519;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1520;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 2074;BA.debugLine="Sub SetMarginAll(p As String) As VMContainer";
 //BA.debugLineNum = 2075;BA.debugLine="Container.setmarginall(p)";
_container._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 2076;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2077;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setmargins(String _smt,String _smb,String _sml,String _smr) throws Exception{
 //BA.debugLineNum = 962;BA.debugLine="Sub SetMargins(sMT As String, sMB As String, sML A";
 //BA.debugLineNum = 963;BA.debugLine="Container.SetMargins(sMT, sMB, sML, sMR)";
_container._setmargins /*b4j.example.vmelement*/ (_smt,_smb,_sml,_smr);
 //BA.debugLineNum = 964;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 965;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setmarginsrc(int _rowpos,int _colpos,Object _mt,Object _mb,Object _ml,Object _mr) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
 //BA.debugLineNum = 1608;BA.debugLine="Sub SetMarginsRC(rowPos As Int, colPos As Int, mt";
 //BA.debugLineNum = 1609;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1610;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 1611;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 1612;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 1614;BA.debugLine="If rowStyles.ContainsKey(rowKey) Then";
if (_rowstyles.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 1615;BA.debugLine="rowc = rowStyles.Get(rowKey)";
_rowc = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowstyles.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 1617;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 1618;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 1620;BA.debugLine="If mt <> Null Then rowc.Put(\"margin-top\", mt)";
if (_mt!= null) { 
_rowc.Put((Object)("margin-top"),_mt);};
 //BA.debugLineNum = 1621;BA.debugLine="If mb <> Null Then rowc.Put(\"margin-bottom\", mb)";
if (_mb!= null) { 
_rowc.Put((Object)("margin-bottom"),_mb);};
 //BA.debugLineNum = 1622;BA.debugLine="If ml <> Null Then rowc.Put(\"margin-left\", ml)";
if (_ml!= null) { 
_rowc.Put((Object)("margin-left"),_ml);};
 //BA.debugLineNum = 1623;BA.debugLine="If mr <> Null Then rowc.Put(\"margin-right\", mr)";
if (_mr!= null) { 
_rowc.Put((Object)("margin-right"),_mr);};
 //BA.debugLineNum = 1624;BA.debugLine="rowStyles.Put(rowKey,rowc)";
_rowstyles.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 1625;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1626;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setmaxheight(String _h) throws Exception{
 //BA.debugLineNum = 930;BA.debugLine="Sub SetMaxHeight(h As String) As VMContainer";
 //BA.debugLineNum = 931;BA.debugLine="If h = \"\" Then Return Me";
if ((_h).equals("")) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 932;BA.debugLine="Container.SetStyleSingle(\"max-height\", h)";
_container._setstylesingle /*b4j.example.vmelement*/ ("max-height",(Object)(_h));
 //BA.debugLineNum = 933;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 934;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setmaxwidth(String _w) throws Exception{
 //BA.debugLineNum = 912;BA.debugLine="Sub SetMaxWidth(w As String) As VMContainer";
 //BA.debugLineNum = 913;BA.debugLine="If w = \"\" Then Return Me";
if ((_w).equals("")) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 914;BA.debugLine="Container.SetStyleSingle(\"max-width\", w)";
_container._setstylesingle /*b4j.example.vmelement*/ ("max-width",(Object)(_w));
 //BA.debugLineNum = 915;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 916;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setminheight(String _h) throws Exception{
 //BA.debugLineNum = 936;BA.debugLine="Sub SetMinHeight(h As String) As VMContainer";
 //BA.debugLineNum = 937;BA.debugLine="If h = \"\" Then Return Me";
if ((_h).equals("")) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 938;BA.debugLine="Container.SetStyleSingle(\"min-height\", h)";
_container._setstylesingle /*b4j.example.vmelement*/ ("min-height",(Object)(_h));
 //BA.debugLineNum = 939;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 940;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setminwidth(String _w) throws Exception{
 //BA.debugLineNum = 918;BA.debugLine="Sub SetMinWidth(w As String) As VMContainer";
 //BA.debugLineNum = 919;BA.debugLine="If w = \"\" Then Return Me";
if ((_w).equals("")) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 920;BA.debugLine="Container.SetStyleSingle(\"min-width\", w)";
_container._setstylesingle /*b4j.example.vmelement*/ ("min-width",(Object)(_w));
 //BA.debugLineNum = 921;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 922;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 2091;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 2092;BA.debugLine="Container.SetName(varName, bbind)";
_container._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 2093;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2094;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setnogutters(boolean _b) throws Exception{
 //BA.debugLineNum = 901;BA.debugLine="Sub SetNoGutters(b As Boolean) As VMContainer";
 //BA.debugLineNum = 902;BA.debugLine="NoGutters = b";
_nogutters = _b;
 //BA.debugLineNum = 903;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 904;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setnoguttersrc(int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 1506;BA.debugLine="Sub SetNoGuttersRC(rowPos As Int, colPos As Int) A";
 //BA.debugLineNum = 1507;BA.debugLine="SetAttrRC(rowPos, colPos, \"no-gutters\", True)";
_setattrrc(_rowpos,_colpos,"no-gutters",BA.ObjectToString(__c.True));
 //BA.debugLineNum = 1508;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1509;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setonclickrc(int _rowpos,int _colpos,String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2279;BA.debugLine="Sub SetOnClickRC(rowpos As Int, colpos As Int, met";
 //BA.debugLineNum = 2280;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2281;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2282;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowpos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 2283;BA.debugLine="If colpos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 2284;BA.debugLine="rowKey = $\"${ID}r${CStr(rowpos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 2286;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 2287;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2288;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2290;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2291;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (_attributes.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 2292;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 2294;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 2295;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 2297;BA.debugLine="rowc.Put(\"@click\",methodName)";
_rowc.Put((Object)("@click"),(Object)(_methodname));
 //BA.debugLineNum = 2298;BA.debugLine="attributes.Put(rowKey,rowc)";
_attributes.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 2299;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2300;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setondragendrc(int _rowpos,int _colpos,String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2383;BA.debugLine="Sub SetOnDragEndRC(rowPos As Int, colPos As Int, m";
 //BA.debugLineNum = 2384;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2385;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2386;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 2387;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 2388;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 2390;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 2391;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2392;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2394;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2396;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (_attributes.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 2397;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 2399;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 2400;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 2402;BA.debugLine="rowc.Put(\"@dragend\",methodName)";
_rowc.Put((Object)("@dragend"),(Object)(_methodname));
 //BA.debugLineNum = 2403;BA.debugLine="attributes.Put(rowKey,rowc)";
_attributes.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 2404;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2405;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setondragenterrc(int _rowpos,int _colpos,String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2407;BA.debugLine="Sub SetOnDragEnterRC(rowPos As Int, colPos As Int,";
 //BA.debugLineNum = 2408;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2409;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2410;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 2411;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 2412;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 2414;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 2415;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2416;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2418;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2420;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (_attributes.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 2421;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 2423;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 2424;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 2426;BA.debugLine="rowc.Put(\"@dragenter\",methodName)";
_rowc.Put((Object)("@dragenter"),(Object)(_methodname));
 //BA.debugLineNum = 2427;BA.debugLine="attributes.Put(rowKey,rowc)";
_attributes.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 2428;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2429;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setondragover(String _methodname) throws Exception{
 //BA.debugLineNum = 2330;BA.debugLine="Sub SetOnDragOver(methodName As String) As VMConta";
 //BA.debugLineNum = 2331;BA.debugLine="Container.SetOnDragOver(Module, methodName)";
_container._setondragover /*b4j.example.vmelement*/ (_module,_methodname);
 //BA.debugLineNum = 2332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2333;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setondragoverrc(int _rowpos,int _colpos,String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2335;BA.debugLine="Sub SetOnDragOverRC(rowPos As Int, colPos As Int,";
 //BA.debugLineNum = 2336;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2337;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2338;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 2339;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 2340;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 2342;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 2343;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2344;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2346;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2348;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (_attributes.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 2349;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 2351;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 2352;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 2354;BA.debugLine="rowc.Put(\"@dragover\",methodName)";
_rowc.Put((Object)("@dragover"),(Object)(_methodname));
 //BA.debugLineNum = 2355;BA.debugLine="attributes.Put(rowKey,rowc)";
_attributes.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 2356;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2357;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setondragstartrc(int _rowpos,int _colpos,String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2359;BA.debugLine="Sub SetOnDragStartRC(rowPos As Int, colPos As Int,";
 //BA.debugLineNum = 2360;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2361;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2362;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 2363;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 2364;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 2366;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 2367;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2368;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2370;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2372;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (_attributes.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 2373;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 2375;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 2376;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 2378;BA.debugLine="rowc.Put(\"@dragstart\",methodName)";
_rowc.Put((Object)("@dragstart"),(Object)(_methodname));
 //BA.debugLineNum = 2379;BA.debugLine="attributes.Put(rowKey,rowc)";
_attributes.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 2380;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2381;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setondrop(String _methodname) throws Exception{
 //BA.debugLineNum = 2325;BA.debugLine="Sub SetOnDrop(methodName As String) As VMContainer";
 //BA.debugLineNum = 2326;BA.debugLine="Container.SetOnDrop(Module, methodName)";
_container._setondrop /*b4j.example.vmelement*/ (_module,_methodname);
 //BA.debugLineNum = 2327;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2328;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setondroprc(int _rowpos,int _colpos,String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2431;BA.debugLine="Sub SetOnDropRC(rowPos As Int, colPos As Int, meth";
 //BA.debugLineNum = 2432;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2433;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2434;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 2435;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 2436;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 2438;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 2439;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2440;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2442;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2444;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (_attributes.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 2445;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 2447;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 2448;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 2450;BA.debugLine="rowc.Put(\"@drop\",methodName)";
_rowc.Put((Object)("@drop"),(Object)(_methodname));
 //BA.debugLineNum = 2451;BA.debugLine="attributes.Put(rowKey,rowc)";
_attributes.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 2452;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2453;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setontouchstartrc(int _rowpos,int _colpos,String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2303;BA.debugLine="Sub SetOnTouchStartRC(rowpos As Int, colpos As Int";
 //BA.debugLineNum = 2304;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2305;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2306;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowpos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 2307;BA.debugLine="If colpos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 2308;BA.debugLine="rowKey = $\"${ID}r${CStr(rowpos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 2310;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2311;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2313;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2314;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (_attributes.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 2315;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 2317;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 2318;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 2320;BA.debugLine="rowc.Put(\"@touchstart\",methodName)";
_rowc.Put((Object)("@touchstart"),(Object)(_methodname));
 //BA.debugLineNum = 2321;BA.debugLine="attributes.Put(rowKey,rowc)";
_attributes.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 2322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setpadding(String _spt,String _spb,String _spl,String _spr) throws Exception{
 //BA.debugLineNum = 967;BA.debugLine="Sub SetPadding(sPT As String, sPB As String, sPL A";
 //BA.debugLineNum = 968;BA.debugLine="Container.SetPadding(sPT, sPB, sPL, sPR)";
_container._setpadding /*b4j.example.vmelement*/ (_spt,_spb,_spl,_spr);
 //BA.debugLineNum = 969;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 970;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 2069;BA.debugLine="Sub SetPaddingAll(p As String) As VMContainer";
 //BA.debugLineNum = 2070;BA.debugLine="Container.SetPaddingAll(p)";
_container._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 2071;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2072;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setpaddingrc(int _rowpos,int _colpos,Object _pt,Object _pb,Object _pl,Object _pr) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
 //BA.debugLineNum = 1628;BA.debugLine="Sub SetPaddingRC(rowPos As Int, colPos As Int, pt";
 //BA.debugLineNum = 1629;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1630;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 1631;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 1632;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 1634;BA.debugLine="If rowStyles.ContainsKey(rowKey) Then";
if (_rowstyles.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 1635;BA.debugLine="rowc = rowStyles.Get(rowKey)";
_rowc = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowstyles.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 1637;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 1638;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 1640;BA.debugLine="If pt <> Null Then rowc.Put(\"padding-top\", pt)";
if (_pt!= null) { 
_rowc.Put((Object)("padding-top"),_pt);};
 //BA.debugLineNum = 1641;BA.debugLine="If pb <> Null Then rowc.Put(\"padding-bottom\", pb)";
if (_pb!= null) { 
_rowc.Put((Object)("padding-bottom"),_pb);};
 //BA.debugLineNum = 1642;BA.debugLine="If pl <> Null Then rowc.Put(\"padding-left\", pl)";
if (_pl!= null) { 
_rowc.Put((Object)("padding-left"),_pl);};
 //BA.debugLineNum = 1643;BA.debugLine="If pr <> Null Then rowc.Put(\"padding-right\", pr)";
if (_pr!= null) { 
_rowc.Put((Object)("padding-right"),_pr);};
 //BA.debugLineNum = 1644;BA.debugLine="rowStyles.Put(rowKey,rowc)";
_rowstyles.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 1645;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1646;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 2226;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMCon";
 //BA.debugLineNum = 2227;BA.debugLine="Container.SetRC(sRow, sCol)";
_container._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 2228;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2229;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setshowmatrix(boolean _b) throws Exception{
 //BA.debugLineNum = 896;BA.debugLine="Sub SetShowMatrix(b As Boolean) As VMContainer";
 //BA.debugLineNum = 897;BA.debugLine="ShowMatrix = b";
_showmatrix = _b;
 //BA.debugLineNum = 898;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 899;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setslotopposite() throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetSlotOpposite As VMContainer";
 //BA.debugLineNum = 131;BA.debugLine="Container.SetAttrLoose(\"v-slot:opposite\")";
_container._setattrloose /*b4j.example.vmelement*/ ("v-slot:opposite");
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetStatic(b As Boolean) As VMContainer";
 //BA.debugLineNum = 181;BA.debugLine="cStatic = b";
_cstatic = _b;
 //BA.debugLineNum = 182;BA.debugLine="Container.SetStatic(b)";
_container._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 1996;BA.debugLine="Sub SetStyle(sm As Map) As VMContainer";
 //BA.debugLineNum = 1997;BA.debugLine="Container.SetStyle(sm)";
_container._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 1998;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1999;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setstylerc(int _rowpos,int _colpos,String _prop,String _value) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
 //BA.debugLineNum = 1450;BA.debugLine="Sub SetStyleRC(rowPos As Int, colPos As Int, prop";
 //BA.debugLineNum = 1451;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1452;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 1453;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 1454;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 1456;BA.debugLine="If rowStyles.ContainsKey(rowKey) Then";
if (_rowstyles.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 1457;BA.debugLine="rowc = rowStyles.Get(rowKey)";
_rowc = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowstyles.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 1459;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 1460;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 1462;BA.debugLine="rowc.Put(prop,value)";
_rowc.Put((Object)(_prop),(Object)(_value));
 //BA.debugLineNum = 1463;BA.debugLine="rowStyles.Put(rowKey,rowc)";
_rowstyles.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 1464;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1465;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 2097;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 2098;BA.debugLine="Container.SetStyleSingle(prop, value)";
_container._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 2099;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 2085;BA.debugLine="Sub SetTabIndex(ti As String) As VMContainer";
 //BA.debugLineNum = 2086;BA.debugLine="Container.SetTabIndex(ti)";
_container._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 2087;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2088;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _settag(String _vartag) throws Exception{
 //BA.debugLineNum = 2028;BA.debugLine="Sub SetTag(varTag As String) As VMContainer";
 //BA.debugLineNum = 2029;BA.debugLine="If varTag = \"\" Then Return Me";
if ((_vartag).equals("")) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 2030;BA.debugLine="Container.SetTag(varTag)";
_container._settag /*b4j.example.vmelement*/ (_vartag);
 //BA.debugLineNum = 2031;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2032;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _settext(String _t) throws Exception{
 //BA.debugLineNum = 1966;BA.debugLine="Sub SetText(t As String) As VMContainer";
 //BA.debugLineNum = 1967;BA.debugLine="Container.SetText(t)";
_container._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 1968;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 1969;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1970;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _settextcenter() throws Exception{
 //BA.debugLineNum = 1146;BA.debugLine="Sub SetTextCenter As VMContainer";
 //BA.debugLineNum = 1147;BA.debugLine="Container.SetTextCenter";
_container._settextcenter /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 1148;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1149;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _settextcenterrc(int _row,int _col) throws Exception{
 //BA.debugLineNum = 1273;BA.debugLine="Sub SetTextCenterRC(row As Int, col As Int) As VMC";
 //BA.debugLineNum = 1274;BA.debugLine="AddClassRC(row, col, Array(\"text-center\"))";
_addclassrc(_row,_col,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("text-center")}));
 //BA.debugLineNum = 1275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 2261;BA.debugLine="Sub SetTextColor(varColor As String) As VMContaine";
 //BA.debugLineNum = 2262;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 2263;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 2264;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 2265;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2266;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 2269;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 2270;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 2271;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 2272;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 2273;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 2274;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 2275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _settextcolorintensityrc(int _row,int _col,String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 1265;BA.debugLine="Sub SetTextColorIntensityRC(row As Int, col As Int";
 //BA.debugLineNum = 1266;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 1267;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 1268;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 1269;BA.debugLine="SetClassRC(row, col, mcolor)";
_setclassrc(_row,_col,_mcolor);
 //BA.debugLineNum = 1270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _settextcolorrc(int _row,int _col,String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 1258;BA.debugLine="Sub SetTextColorRC(row As Int, col As Int, varColo";
 //BA.debugLineNum = 1259;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 1260;BA.debugLine="SetClassRC(row, col, sColor)";
_setclassrc(_row,_col,_scolor);
 //BA.debugLineNum = 1261;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1262;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _settextrightrc(int _row,int _col) throws Exception{
 //BA.debugLineNum = 1278;BA.debugLine="Sub SetTextRightRC(row As Int, col As Int) As VMCo";
 //BA.debugLineNum = 1279;BA.debugLine="AddClassRC(row, col, Array(\"text-right\"))";
_addclassrc(_row,_col,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("text-right")}));
 //BA.debugLineNum = 1280;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1281;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _settransition(String _vartransition) throws Exception{
 //BA.debugLineNum = 943;BA.debugLine="Sub SetTransition(varTransition As String) As VMCo";
 //BA.debugLineNum = 944;BA.debugLine="If varTransition = \"\" Then Return Me";
if ((_vartransition).equals("")) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 945;BA.debugLine="SetAttrSingle(\"transition\", varTransition)";
_setattrsingle("transition",_vartransition);
 //BA.debugLineNum = 946;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 947;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _setuncheckedvalue(anywheresoftware.b4a.objects.collections.Map _rec,anywheresoftware.b4a.objects.collections.List _xfields,String _checkedvalue,String _uncheckedvalue) throws Exception{
String _sfield = "";
String _svalue = "";
 //BA.debugLineNum = 1015;BA.debugLine="Sub SetUncheckedValue(rec As Map, xFields As List,";
 //BA.debugLineNum = 1016;BA.debugLine="Try";
try { //BA.debugLineNum = 1017;BA.debugLine="For Each sfield As String In xFields";
{
final anywheresoftware.b4a.BA.IterableList group2 = _xfields;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_sfield = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1018;BA.debugLine="Dim svalue As String = rec.Get(sfield)";
_svalue = BA.ObjectToString(_rec.Get((Object)(_sfield)));
 //BA.debugLineNum = 1019;BA.debugLine="If svalue.EqualsIgnoreCase(checkedValue) = Fals";
if (_svalue.equalsIgnoreCase(_checkedvalue)==__c.False) { 
 //BA.debugLineNum = 1020;BA.debugLine="rec.Put(sfield, UncheckedValue)";
_rec.Put((Object)(_sfield),(Object)(_uncheckedvalue));
 };
 }
};
 //BA.debugLineNum = 1023;BA.debugLine="Return rec";
if (true) return _rec;
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 1025;BA.debugLine="Return rec";
if (true) return _rec;
 };
 //BA.debugLineNum = 1027;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetVElse(vif As String) As VMContainer";
 //BA.debugLineNum = 110;BA.debugLine="Container.SetVElse(vif)";
_container._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetVhtml(vhtml As String) As VMContainer";
 //BA.debugLineNum = 120;BA.debugLine="Container.SetVHtml(vhtml)";
_container._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 1942;BA.debugLine="Sub SetVIf(vif As String) As VMContainer";
 //BA.debugLineNum = 1943;BA.debugLine="Container.SetVIf(vif)";
_container._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 1944;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1945;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 2255;BA.debugLine="Sub SetVisible(b As Boolean) As VMContainer";
 //BA.debugLineNum = 2256;BA.debugLine="Container.SetVisible(b)";
_container._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 2257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 1178;BA.debugLine="Sub SetVModel(k As String) As VMContainer";
 //BA.debugLineNum = 1179;BA.debugLine="Container.SetVModel(k)";
_container._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 1180;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1181;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setvonce(boolean _t) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetVOnce(t As Boolean) As VMContainer";
 //BA.debugLineNum = 142;BA.debugLine="Container.setvonce(t)";
_container._setvonce /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 1947;BA.debugLine="Sub SetVShow(vif As String) As VMContainer";
 //BA.debugLineNum = 1948;BA.debugLine="Container.SetVShow(vif)";
_container._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 1949;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1950;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetVText(vhtml As String) As VMContainer";
 //BA.debugLineNum = 115;BA.debugLine="Container.SetVText(vhtml)";
_container._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setwidth(String _w) throws Exception{
 //BA.debugLineNum = 906;BA.debugLine="Sub SetWidth(w As String) As VMContainer";
 //BA.debugLineNum = 907;BA.debugLine="If w = \"\" Then Return Me";
if ((_w).equals("")) { 
if (true) return (b4j.example.vmcontainer)(this);};
 //BA.debugLineNum = 908;BA.debugLine="Container.SetStyleSingle(\"width\", w)";
_container._setstylesingle /*b4j.example.vmelement*/ ("width",(Object)(_w));
 //BA.debugLineNum = 909;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 910;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _show() throws Exception{
 //BA.debugLineNum = 2039;BA.debugLine="Sub Show As VMContainer";
 //BA.debugLineNum = 2040;BA.debugLine="Container.SetVisible(True)";
_container._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 2041;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2042;BA.debugLine="End Sub";
return null;
}
public String  _showrc(int _rowpos,int _colpos) throws Exception{
String _rowkey = "";
 //BA.debugLineNum = 1569;BA.debugLine="Sub ShowRC(rowPos As Int, colPos As Int)";
 //BA.debugLineNum = 1570;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 1571;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 1572;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 1574;BA.debugLine="rowKey = $\"${rowKey}show\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"show");
 //BA.debugLineNum = 1575;BA.debugLine="vue.SetData(rowKey, True)";
_vue._setdata /*b4j.example.bananovue*/ (_rowkey,(Object)(__c.True));
 //BA.debugLineNum = 1576;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _rowcnt = 0;
int _rowtot = 0;
String _rowkey = "";
b4j.example.vmcontainer._gridrow _currentrow = null;
String _strrow = "";
 //BA.debugLineNum = 1902;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 1903;BA.debugLine="If bControls Then CreateGrid";
if (_bcontrols) { 
_creategrid();};
 //BA.debugLineNum = 1906;BA.debugLine="LastRow = 0";
_lastrow = (int) (0);
 //BA.debugLineNum = 1907;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1908;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1910;BA.debugLine="Dim rowCnt As Int = 0";
_rowcnt = (int) (0);
 //BA.debugLineNum = 1911;BA.debugLine="Dim rowTot As Int = Rows.Size - 1";
_rowtot = (int) (_rows.getSize()-1);
 //BA.debugLineNum = 1912;BA.debugLine="For rowCnt = 0 To rowTot";
{
final int step7 = 1;
final int limit7 = _rowtot;
_rowcnt = (int) (0) ;
for (;_rowcnt <= limit7 ;_rowcnt = _rowcnt + step7 ) {
 //BA.debugLineNum = 1914;BA.debugLine="Dim rowKey As String = Rows.GetKeyAt(rowCnt)";
_rowkey = BA.ObjectToString(_rows.GetKeyAt(_rowcnt));
 //BA.debugLineNum = 1915;BA.debugLine="Dim currentRow As GridRow = Rows.Get(rowKey)";
_currentrow = (b4j.example.vmcontainer._gridrow)(_rows.Get((Object)(_rowkey)));
 //BA.debugLineNum = 1916;BA.debugLine="Dim strRow As String = BuildRow(currentRow)";
_strrow = _buildrow(_currentrow);
 //BA.debugLineNum = 1917;BA.debugLine="sb.Append(strRow)";
_sb.Append(_strrow);
 }
};
 //BA.debugLineNum = 1920;BA.debugLine="SetText(sb.tostring)";
_settext(_sb.ToString());
 //BA.debugLineNum = 1921;BA.debugLine="If UseVShow = False Then Container.RemoveVShow";
if (_usevshow==__c.False) { 
_container._removevshow /*b4j.example.vmelement*/ ();};
 //BA.debugLineNum = 1922;BA.debugLine="Return Container.ToString";
if (true) return _container._tostring /*String*/ ();
 //BA.debugLineNum = 1923;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _usetheme(String _themename) throws Exception{
 //BA.debugLineNum = 2022;BA.debugLine="Sub UseTheme(themeName As String) As VMContainer";
 //BA.debugLineNum = 2023;BA.debugLine="Container.UseTheme(themeName)";
_container._usetheme /*b4j.example.vmelement*/ (_themename);
 //BA.debugLineNum = 2024;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 2025;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _usethemerc(int _row,int _col,String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 1284;BA.debugLine="Sub UseThemeRC(row As Int, col As Int, themeName A";
 //BA.debugLineNum = 1285;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 1286;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 1287;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 1288;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 1289;BA.debugLine="AddClassRC(row, col, Array(sclass))";
_addclassrc(_row,_col,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sclass)}));
 };
 //BA.debugLineNum = 1291;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 1292;BA.debugLine="End Sub";
return null;
}
public boolean  _validate(anywheresoftware.b4a.objects.collections.Map _rec) throws Exception{
 //BA.debugLineNum = 1045;BA.debugLine="Sub Validate(rec As Map) As Boolean";
 //BA.debugLineNum = 1046;BA.debugLine="Return vue.Validate(rec, Required)";
if (true) return _vue._validate /*boolean*/ (_rec,_required);
 //BA.debugLineNum = 1047;BA.debugLine="End Sub";
return false;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
