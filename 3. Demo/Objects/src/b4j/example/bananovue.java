package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananovue extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.bananovue", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananovue.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public com.ab.banano.BANanoObject _bovue = null;
public com.ab.banano.BANano _banano = null;
public anywheresoftware.b4a.objects.collections.Map _methods = null;
public anywheresoftware.b4a.objects.collections.Map _filters = null;
public anywheresoftware.b4a.objects.collections.Map _data = null;
public com.ab.banano.BANanoObject _el = null;
public com.ab.banano.BANanoObject _refs = null;
public com.ab.banano.BANanoObject _emit = null;
public com.ab.banano.BANanoElement _body = null;
public b4j.example.vuehtml _template = null;
public anywheresoftware.b4a.objects.collections.Map _computed = null;
public anywheresoftware.b4a.objects.collections.Map _watches = null;
public anywheresoftware.b4a.objects.collections.List _routes = null;
public anywheresoftware.b4a.objects.collections.Map _components = null;
public anywheresoftware.b4a.objects.collections.Map _options = null;
public anywheresoftware.b4a.objects.collections.Map _dynamicstyle = null;
public String _gettemplate = "";
public boolean _showwarnings = false;
public String _border_default = "";
public String _border_dashed = "";
public String _border_dotted = "";
public String _border_double = "";
public String _border_groove = "";
public String _border_hidden = "";
public String _border_inset = "";
public String _border_none = "";
public String _border_outset = "";
public String _border_ridge = "";
public String _border_solid = "";
public String _color_amber = "";
public String _color_black = "";
public String _color_blue = "";
public String _color_bluegrey = "";
public String _color_brown = "";
public String _color_cyan = "";
public String _color_deeporange = "";
public String _color_deeppurple = "";
public String _color_green = "";
public String _color_grey = "";
public String _color_indigo = "";
public String _color_lightblue = "";
public String _color_lightgreen = "";
public String _color_lime = "";
public String _color_orange = "";
public String _color_pink = "";
public String _color_purple = "";
public String _color_red = "";
public String _color_teal = "";
public String _color_transparent = "";
public String _color_white = "";
public String _color_yellow = "";
public String _color_none = "";
public String _intensity_normal = "";
public String _intensity_lighten5 = "";
public String _intensity_lighten4 = "";
public String _intensity_lighten3 = "";
public String _intensity_lighten2 = "";
public String _intensity_lighten1 = "";
public String _intensity_darken1 = "";
public String _intensity_darken2 = "";
public String _intensity_darken3 = "";
public String _intensity_darken4 = "";
public String _intensity_accent1 = "";
public String _intensity_accent2 = "";
public String _intensity_accent3 = "";
public String _intensity_accent4 = "";
public String _size_h1 = "";
public String _size_h2 = "";
public String _size_h3 = "";
public String _size_h4 = "";
public String _size_h5 = "";
public String _size_h6 = "";
public String _size_p = "";
public String _size_span = "";
public String _size_blockquote = "";
public String _size_div = "";
public String _text_left = "";
public String _text_center = "";
public String _text_right = "";
public String _text_no_wrap = "";
public String _text_truncate = "";
public String _text_lowercase = "";
public String _text_uppercase = "";
public String _text_capitalize = "";
public b4j.example.bananovue._colortypes _colors = null;
public anywheresoftware.b4a.objects.collections.Map _colormap = null;
public anywheresoftware.b4a.objects.collections.Map _themes = null;
public anywheresoftware.b4a.objects.collections.Map _targetoptions = null;
public anywheresoftware.b4a.objects.collections.Map _columntypes = null;
public anywheresoftware.b4a.objects.collections.Map _columnalign = null;
public anywheresoftware.b4a.objects.collections.Map _datatypes = null;
public anywheresoftware.b4a.objects.collections.Map _controltypes = null;
public anywheresoftware.b4a.objects.collections.Map _modules = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _sourcecode = null;
public anywheresoftware.b4a.objects.collections.Map _hashtype = null;
public anywheresoftware.b4a.objects.collections.Map _algorithm = null;
public anywheresoftware.b4a.objects.collections.Map _errors = null;
public anywheresoftware.b4a.objects.collections.Map _position = null;
public Object _module = null;
public com.ab.banano.BANanoObject _store = null;
public anywheresoftware.b4a.objects.collections.Map _state = null;
public anywheresoftware.b4a.objects.collections.Map _bindings = null;
public com.ab.banano.BANanoObject _router = null;
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
public static class _colortypes{
public boolean IsInitialized;
public String red;
public String pink;
public String purple;
public String deepPurple;
public String indigo;
public String blue;
public String lightBlue;
public String cyan;
public String teal;
public String green;
public String lightGreen;
public String lime;
public String yellow;
public String amber;
public String Orange;
public String deepOrange;
public String brown;
public String grey;
public String blueGrey;
public String black;
public String white;
public String transparent;
public void Initialize() {
IsInitialized = true;
red = "";
pink = "";
purple = "";
deepPurple = "";
indigo = "";
blue = "";
lightBlue = "";
cyan = "";
teal = "";
green = "";
lightGreen = "";
lime = "";
yellow = "";
amber = "";
Orange = "";
deepOrange = "";
brown = "";
grey = "";
blueGrey = "";
black = "";
white = "";
transparent = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _addcode(String _scomment) throws Exception{
 //BA.debugLineNum = 964;BA.debugLine="Sub AddCode(scomment As String)";
 //BA.debugLineNum = 965;BA.debugLine="SourceCode.append(scomment).append(CRLF)";
_sourcecode.Append(_scomment).Append(__c.CRLF);
 //BA.debugLineNum = 966;BA.debugLine="End Sub";
return "";
}
public String  _addcode1(anywheresoftware.b4a.keywords.StringBuilderWrapper _sbx,String _scomment) throws Exception{
 //BA.debugLineNum = 976;BA.debugLine="Sub AddCode1(sbx As StringBuilder, scomment As Str";
 //BA.debugLineNum = 977;BA.debugLine="sbx.append(scomment).append(CRLF)";
_sbx.Append(_scomment).Append(__c.CRLF);
 //BA.debugLineNum = 978;BA.debugLine="End Sub";
return "";
}
public String  _addcomment(String _sc) throws Exception{
 //BA.debugLineNum = 968;BA.debugLine="Sub AddComment(sc As String)";
 //BA.debugLineNum = 969;BA.debugLine="SourceCode.append($\"'${sc}\"$).append(CRLF)";
_sourcecode.Append(("'"+__c.SmartStringFormatter("",(Object)(_sc))+"")).Append(__c.CRLF);
 //BA.debugLineNum = 970;BA.debugLine="End Sub";
return "";
}
public String  _addcomment1(anywheresoftware.b4a.keywords.StringBuilderWrapper _sbx,String _sc) throws Exception{
 //BA.debugLineNum = 980;BA.debugLine="Sub AddComment1(sbx As StringBuilder, sc As String";
 //BA.debugLineNum = 981;BA.debugLine="sbx.append($\"'${sc}\"$).append(CRLF)";
_sbx.Append(("'"+__c.SmartStringFormatter("",(Object)(_sc))+"")).Append(__c.CRLF);
 //BA.debugLineNum = 982;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _addcomponent(b4j.example.vmcomponent _comp) throws Exception{
String _sid = "";
 //BA.debugLineNum = 2645;BA.debugLine="Sub AddComponent(comp As VMComponent) As BANanoVue";
 //BA.debugLineNum = 2646;BA.debugLine="Dim sid As String = comp.id";
_sid = _comp._id /*String*/ ;
 //BA.debugLineNum = 2647;BA.debugLine="If components.ContainsKey(sid) = True Then Return";
if (_components.ContainsKey((Object)(_sid))==__c.True) { 
if (true) return (b4j.example.bananovue)(this);};
 //BA.debugLineNum = 2648;BA.debugLine="components.Put(sid, comp.Component)";
_components.Put((Object)(_sid),(Object)(_comp._component /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 2649;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2650;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _addcomponentbo(String _compname,com.ab.banano.BANanoObject _comp) throws Exception{
 //BA.debugLineNum = 2652;BA.debugLine="Sub AddComponentBO(compName As String, comp As BAN";
 //BA.debugLineNum = 2653;BA.debugLine="If components.ContainsKey(compName) = True Then R";
if (_components.ContainsKey((Object)(_compname))==__c.True) { 
if (true) return (b4j.example.bananovue)(this);};
 //BA.debugLineNum = 2654;BA.debugLine="components.Put(compName, comp)";
_components.Put((Object)(_compname),(Object)(_comp.getObject()));
 //BA.debugLineNum = 2655;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2656;BA.debugLine="End Sub";
return null;
}
public String  _adderror(String _vmodel,String _verror) throws Exception{
 //BA.debugLineNum = 951;BA.debugLine="Sub AddError(vmodel As String, vError As String)";
 //BA.debugLineNum = 952;BA.debugLine="vmodel = vmodel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 953;BA.debugLine="Errors.Put(vmodel, vError)";
_errors.Put((Object)(_vmodel),(Object)(_verror));
 //BA.debugLineNum = 954;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _addmodule(String _tagname) throws Exception{
 //BA.debugLineNum = 997;BA.debugLine="Sub AddModule(tagName As String) As BANanoVue";
 //BA.debugLineNum = 998;BA.debugLine="tagName = tagName.tolowercase";
_tagname = _tagname.toLowerCase();
 //BA.debugLineNum = 999;BA.debugLine="Modules.Put(tagName, tagName)";
_modules.Put((Object)(_tagname),(Object)(_tagname));
 //BA.debugLineNum = 1000;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 1001;BA.debugLine="End Sub";
return null;
}
public String  _addnewline() throws Exception{
 //BA.debugLineNum = 960;BA.debugLine="Sub AddNewLine";
 //BA.debugLineNum = 961;BA.debugLine="SourceCode.append(CRLF)";
_sourcecode.Append(__c.CRLF);
 //BA.debugLineNum = 962;BA.debugLine="End Sub";
return "";
}
public String  _addnewline1(anywheresoftware.b4a.keywords.StringBuilderWrapper _sbx) throws Exception{
 //BA.debugLineNum = 972;BA.debugLine="Sub AddNewLine1(sbx As StringBuilder)";
 //BA.debugLineNum = 973;BA.debugLine="sbx.append(CRLF)";
_sbx.Append(__c.CRLF);
 //BA.debugLineNum = 974;BA.debugLine="End Sub";
return "";
}
public String  _addroute(b4j.example.vmcomponent _comp) throws Exception{
anywheresoftware.b4a.objects.collections.Map _eachroute = null;
 //BA.debugLineNum = 2658;BA.debugLine="Sub AddRoute(comp As VMComponent)";
 //BA.debugLineNum = 2659;BA.debugLine="If comp.name = \"\" Then";
if ((_comp._name /*String*/ ).equals("")) { 
 //BA.debugLineNum = 2660;BA.debugLine="Log(\"AddRoute: Please specify the name of the Ro";
__c.Log("AddRoute: Please specify the name of the Route!");
 };
 //BA.debugLineNum = 2663;BA.debugLine="Dim eachroute As Map = CreateMap()";
_eachroute = new anywheresoftware.b4a.objects.collections.Map();
_eachroute = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2664;BA.debugLine="eachroute.Put(\"path\", comp.path)";
_eachroute.Put((Object)("path"),(Object)(_comp._path /*String*/ ));
 //BA.debugLineNum = 2665;BA.debugLine="eachroute.Put(\"name\", comp.name)";
_eachroute.Put((Object)("name"),(Object)(_comp._name /*String*/ ));
 //BA.debugLineNum = 2666;BA.debugLine="eachroute.Put(\"component\", comp.component)";
_eachroute.Put((Object)("component"),(Object)(_comp._component /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 2668;BA.debugLine="routes.Add(eachroute)";
_routes.Add((Object)(_eachroute.getObject()));
 //BA.debugLineNum = 2669;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _addstyle(String _sid,anywheresoftware.b4a.objects.collections.Map _opt) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
anywheresoftware.b4a.objects.collections.Map _oldm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 1334;BA.debugLine="Sub AddStyle(sID As String, opt As Map) As BANanoV";
 //BA.debugLineNum = 1335;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1336;BA.debugLine="sID = sID.ToLowerCase";
_sid = _sid.toLowerCase();
 //BA.debugLineNum = 1337;BA.debugLine="Dim oldm As Map = GetState(sID, nm)";
_oldm = new anywheresoftware.b4a.objects.collections.Map();
_oldm = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_getstate(_sid,(Object)(_nm.getObject()))));
 //BA.debugLineNum = 1338;BA.debugLine="For Each k As String In opt.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _opt.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 1339;BA.debugLine="Dim v As Object = opt.Get(k)";
_v = _opt.Get((Object)(_k));
 //BA.debugLineNum = 1340;BA.debugLine="oldm.Put(k, v)";
_oldm.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 1342;BA.debugLine="SetStateSingle(sID, oldm)";
_setstatesingle(_sid,(Object)(_oldm.getObject()));
 //BA.debugLineNum = 1343;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 1344;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _addstylesingle(String _sid,String _prop,String _opt) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
 //BA.debugLineNum = 1346;BA.debugLine="Sub AddStyleSingle(sID As String, prop As String,";
 //BA.debugLineNum = 1347;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1348;BA.debugLine="nm.Put(prop, opt)";
_nm.Put((Object)(_prop),(Object)(_opt));
 //BA.debugLineNum = 1349;BA.debugLine="AddStyle(sID, nm)";
_addstyle(_sid,_nm);
 //BA.debugLineNum = 1350;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 1351;BA.debugLine="End Sub";
return null;
}
public String  _addtheme(String _themename,String _forecolor,String _forecolorintensity,String _backcolor,String _backcolorintensity) throws Exception{
String _fc = "";
String _fci = "";
String _bc = "";
String _classline = "";
 //BA.debugLineNum = 2439;BA.debugLine="Sub AddTheme(themeName As String, ForeColor As Str";
 //BA.debugLineNum = 2440;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 2442;BA.debugLine="Dim fc As String = $\"${ForeColor}--text\"$";
_fc = (""+__c.SmartStringFormatter("",(Object)(_forecolor))+"--text");
 //BA.debugLineNum = 2443;BA.debugLine="Dim fci As String = $\"text--${ForeColorIntensity}";
_fci = ("text--"+__c.SmartStringFormatter("",(Object)(_forecolorintensity))+"");
 //BA.debugLineNum = 2444;BA.debugLine="Dim bc As String = $\"${BackColor} ${BackColorInte";
_bc = (""+__c.SmartStringFormatter("",(Object)(_backcolor))+" "+__c.SmartStringFormatter("",(Object)(_backcolorintensity))+"");
 //BA.debugLineNum = 2446;BA.debugLine="fc = fc.trim";
_fc = _fc.trim();
 //BA.debugLineNum = 2447;BA.debugLine="fci = fci.Trim";
_fci = _fci.trim();
 //BA.debugLineNum = 2449;BA.debugLine="If fc = \"--text\" Then fc = \"\"";
if ((_fc).equals("--text")) { 
_fc = "";};
 //BA.debugLineNum = 2450;BA.debugLine="If fci = \"text--\" Then fci = \"\"";
if ((_fci).equals("text--")) { 
_fci = "";};
 //BA.debugLineNum = 2452;BA.debugLine="Dim classLine As String = $\"${fc} ${fci} ${bc}\"$";
_classline = (""+__c.SmartStringFormatter("",(Object)(_fc))+" "+__c.SmartStringFormatter("",(Object)(_fci))+" "+__c.SmartStringFormatter("",(Object)(_bc))+"");
 //BA.debugLineNum = 2453;BA.debugLine="classLine = classLine.Trim";
_classline = _classline.trim();
 //BA.debugLineNum = 2454;BA.debugLine="classLine = classLine.Replace(\"  \",\" \")";
_classline = _classline.replace("  "," ");
 //BA.debugLineNum = 2455;BA.debugLine="classLine = classLine.Trim";
_classline = _classline.trim();
 //BA.debugLineNum = 2456;BA.debugLine="Themes.Put(themeName, classLine)";
_themes.Put((Object)(_themename),(Object)(_classline));
 //BA.debugLineNum = 2457;BA.debugLine="End Sub";
return "";
}
public String  _aftertodayrg(long _dvariance) throws Exception{
 //BA.debugLineNum = 3777;BA.debugLine="public Sub AfterTodayRG(dVariance As Long) As Stri";
 //BA.debugLineNum = 3778;BA.debugLine="If dVariance <= 0 Then";
if (_dvariance<=0) { 
 //BA.debugLineNum = 3779;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else if(_dvariance>0) { 
 //BA.debugLineNum = 3781;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else {
 //BA.debugLineNum = 3783;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 };
 //BA.debugLineNum = 3785;BA.debugLine="End Sub";
return "";
}
public String  _alpha(String _value) throws Exception{
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
 //BA.debugLineNum = 1720;BA.debugLine="Public Sub Alpha(value As String) As String";
 //BA.debugLineNum = 1721;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 1722;BA.debugLine="Try";
try { //BA.debugLineNum = 1723;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 1724;BA.debugLine="If value = \"\" Then value = \"\"";
if ((_value).equals("")) { 
_value = "";};
 //BA.debugLineNum = 1725;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
 //BA.debugLineNum = 1726;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
 //BA.debugLineNum = 1727;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
 //BA.debugLineNum = 1728;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 1729;BA.debugLine="For i = 0 To slen - 1";
{
final int step9 = 1;
final int limit9 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 1730;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
 //BA.debugLineNum = 1731;BA.debugLine="If InStr(\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJK";
if (_instr("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ",_mout)!=-1) { 
 //BA.debugLineNum = 1732;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
 //BA.debugLineNum = 1735;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 1737;BA.debugLine="Return value";
if (true) return _value;
 };
 //BA.debugLineNum = 1739;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _audittrail(anywheresoftware.b4a.objects.collections.Map _oldm,anywheresoftware.b4a.objects.collections.Map _newm) throws Exception{
anywheresoftware.b4a.objects.collections.Map _df = null;
String _k = "";
Object _v = null;
Object _nv = null;
Object _ov = null;
 //BA.debugLineNum = 2683;BA.debugLine="Sub AuditTrail(oldM As Map, newM As Map) As Map";
 //BA.debugLineNum = 2684;BA.debugLine="Dim df As Map = CreateMap()";
_df = new anywheresoftware.b4a.objects.collections.Map();
_df = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2685;BA.debugLine="For Each k As String In oldM.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _oldm.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 2686;BA.debugLine="Dim v As Object = oldM.Get(k)";
_v = _oldm.Get((Object)(_k));
 //BA.debugLineNum = 2687;BA.debugLine="If newM.ContainsKey(k) Then";
if (_newm.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 2688;BA.debugLine="Dim nv As Object = newM.Get(k)";
_nv = _newm.Get((Object)(_k));
 //BA.debugLineNum = 2689;BA.debugLine="If v <> nv Then";
if ((_v).equals(_nv) == false) { 
 //BA.debugLineNum = 2690;BA.debugLine="df.Put(k, nv)";
_df.Put((Object)(_k),_nv);
 };
 };
 }
};
 //BA.debugLineNum = 2694;BA.debugLine="For Each k As String In newM.Keys";
{
final anywheresoftware.b4a.BA.IterableList group11 = _newm.Keys();
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_k = BA.ObjectToString(group11.Get(index11));
 //BA.debugLineNum = 2695;BA.debugLine="Dim v As Object = newM.Get(k)";
_v = _newm.Get((Object)(_k));
 //BA.debugLineNum = 2696;BA.debugLine="If oldM.ContainsKey(k) Then";
if (_oldm.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 2697;BA.debugLine="Dim ov As Object = oldM.Get(k)";
_ov = _oldm.Get((Object)(_k));
 //BA.debugLineNum = 2698;BA.debugLine="If v <> ov Then";
if ((_v).equals(_ov) == false) { 
 //BA.debugLineNum = 2699;BA.debugLine="df.Put(k, v)";
_df.Put((Object)(_k),_v);
 };
 }else {
 //BA.debugLineNum = 2702;BA.debugLine="df.Put(k, v)";
_df.Put((Object)(_k),_v);
 };
 }
};
 //BA.debugLineNum = 2705;BA.debugLine="Return df";
if (true) return _df;
 //BA.debugLineNum = 2706;BA.debugLine="End Sub";
return null;
}
public String  _beautifyname(String _idname) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _ls = null;
int _slen = 0;
int _i = 0;
String _mout = "";
String _sname = "";
 //BA.debugLineNum = 2098;BA.debugLine="Sub BeautifyName(idName As String) As String";
 //BA.debugLineNum = 2099;BA.debugLine="idName = idName.trim";
_idname = _idname.trim();
 //BA.debugLineNum = 2100;BA.debugLine="If idName = \"\" Then Return \"\"";
if ((_idname).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 2101;BA.debugLine="Dim ls As StringBuilder";
_ls = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2102;BA.debugLine="ls.Initialize";
_ls.Initialize();
 //BA.debugLineNum = 2103;BA.debugLine="Dim slen As Int = idName.Length";
_slen = _idname.length();
 //BA.debugLineNum = 2104;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 2105;BA.debugLine="For i = 0 To slen - 1";
{
final int step7 = 1;
final int limit7 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 2106;BA.debugLine="Dim mout As String = idName.CharAt(i)";
_mout = BA.ObjectToString(_idname.charAt(_i));
 //BA.debugLineNum = 2107;BA.debugLine="If \"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQR";
if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".indexOf(_mout)==-1) { 
 //BA.debugLineNum = 2108;BA.debugLine="ls.Append(\"-\")";
_ls.Append("-");
 }else {
 //BA.debugLineNum = 2110;BA.debugLine="ls.Append(mout)";
_ls.Append(_mout);
 };
 }
};
 //BA.debugLineNum = 2113;BA.debugLine="Dim sname As String = ls.tostring";
_sname = _ls.ToString();
 //BA.debugLineNum = 2114;BA.debugLine="sname = ProperSubName(sname, False)";
_sname = _propersubname(_sname,__c.False);
 //BA.debugLineNum = 2115;BA.debugLine="Return sname";
if (true) return _sname;
 //BA.debugLineNum = 2116;BA.debugLine="End Sub";
return "";
}
public String  _beautifyrest(String _idname) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _ls = null;
int _slen = 0;
int _i = 0;
String _mout = "";
String _sname = "";
 //BA.debugLineNum = 2118;BA.debugLine="Sub BeautifyRest(idName As String) As String";
 //BA.debugLineNum = 2119;BA.debugLine="idName = idName.trim";
_idname = _idname.trim();
 //BA.debugLineNum = 2120;BA.debugLine="If idName = \"\" Then Return \"\"";
if ((_idname).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 2121;BA.debugLine="Dim ls As StringBuilder";
_ls = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2122;BA.debugLine="ls.Initialize";
_ls.Initialize();
 //BA.debugLineNum = 2123;BA.debugLine="Dim slen As Int = idName.Length";
_slen = _idname.length();
 //BA.debugLineNum = 2124;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 2125;BA.debugLine="For i = 0 To slen - 1";
{
final int step7 = 1;
final int limit7 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 2126;BA.debugLine="Dim mout As String = idName.CharAt(i)";
_mout = BA.ObjectToString(_idname.charAt(_i));
 //BA.debugLineNum = 2127;BA.debugLine="If \"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQR";
if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".indexOf(_mout)==-1) { 
 //BA.debugLineNum = 2128;BA.debugLine="ls.Append(\"-\")";
_ls.Append("-");
 }else {
 //BA.debugLineNum = 2130;BA.debugLine="ls.Append(mout)";
_ls.Append(_mout);
 };
 }
};
 //BA.debugLineNum = 2133;BA.debugLine="Dim sname As String = ls.tostring";
_sname = _ls.ToString();
 //BA.debugLineNum = 2134;BA.debugLine="sname = ProperSubNameRest(sname, False)";
_sname = _propersubnamerest(_sname,__c.False);
 //BA.debugLineNum = 2135;BA.debugLine="Return sname";
if (true) return _sname;
 //BA.debugLineNum = 2136;BA.debugLine="End Sub";
return "";
}
public String  _beautifysourcecode(String _slang,String _sc) throws Exception{
String _res = "";
 //BA.debugLineNum = 1322;BA.debugLine="Sub BeautifySourceCode(slang As String, sc As Stri";
 //BA.debugLineNum = 1323;BA.debugLine="Select Case slang";
switch (BA.switchObjectToInt(_slang,"js","css","html")) {
case 0: {
 //BA.debugLineNum = 1325;BA.debugLine="Dim res As String = BANAno.RunJavascriptMethod(\"";
_res = BA.ObjectToString(_banano.RunJavascriptMethod("js_beautify",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sc)})));
 break; }
case 1: {
 //BA.debugLineNum = 1327;BA.debugLine="Dim res As String = BANAno.RunJavascriptMethod(\"";
_res = BA.ObjectToString(_banano.RunJavascriptMethod("css_beautify",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sc)})));
 break; }
case 2: {
 //BA.debugLineNum = 1329;BA.debugLine="Dim res As String = BANAno.RunJavascriptMethod(\"";
_res = BA.ObjectToString(_banano.RunJavascriptMethod("html_beautify",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sc)})));
 break; }
}
;
 //BA.debugLineNum = 1331;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 1332;BA.debugLine="End Sub";
return "";
}
public String  _br() throws Exception{
 //BA.debugLineNum = 2471;BA.debugLine="Sub BR As String";
 //BA.debugLineNum = 2472;BA.debugLine="Return \"<br>\"";
if (true) return "<br>";
 //BA.debugLineNum = 2473;BA.debugLine="End Sub";
return "";
}
public Object  _callcomputed(String _methodname) throws Exception{
 //BA.debugLineNum = 3075;BA.debugLine="Sub CallComputed(methodName As String) As Object";
 //BA.debugLineNum = 3076;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3077;BA.debugLine="Return BOVue.GetField(methodName)";
if (true) return (Object)(_bovue.GetField(_methodname).getObject());
 //BA.debugLineNum = 3078;BA.debugLine="End Sub";
return null;
}
public String  _callmethod(String _methodname) throws Exception{
 //BA.debugLineNum = 3080;BA.debugLine="Sub CallMethod(methodName As String)";
 //BA.debugLineNum = 3081;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3082;BA.debugLine="BOVue.RunMethod(methodName, Null)";
_bovue.RunMethod(_methodname,__c.Null);
 //BA.debugLineNum = 3083;BA.debugLine="End Sub";
return "";
}
public String  _capitalize(String _t) throws Exception{
 //BA.debugLineNum = 2177;BA.debugLine="Sub Capitalize(t As String) As String";
 //BA.debugLineNum = 2178;BA.debugLine="Return ProperCase(t)";
if (true) return _propercase(_t);
 //BA.debugLineNum = 2179;BA.debugLine="End Sub";
return "";
}
public double  _cdbl(String _value) throws Exception{
double _out = 0;
 //BA.debugLineNum = 1594;BA.debugLine="Public Sub CDbl(value As String) As Double";
 //BA.debugLineNum = 1595;BA.debugLine="Try";
try { //BA.debugLineNum = 1596;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 1597;BA.debugLine="If value = \"\" Then value = \"0\"";
if ((_value).equals("")) { 
_value = "0";};
 //BA.debugLineNum = 1598;BA.debugLine="value = value.Replace(\",\",\"\")";
_value = _value.replace(",","");
 //BA.debugLineNum = 1599;BA.debugLine="Dim out As Double = NumberFormat2(value,0,2,2,Fa";
_out = (double)(Double.parseDouble(__c.NumberFormat2((double)(Double.parseDouble(_value)),(int) (0),(int) (2),(int) (2),__c.False)));
 //BA.debugLineNum = 1600;BA.debugLine="Return out";
if (true) return _out;
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 1602;BA.debugLine="Return value";
if (true) return (double)(Double.parseDouble(_value));
 };
 //BA.debugLineNum = 1604;BA.debugLine="End Sub";
return 0;
}
public int  _cint(Object _o) throws Exception{
 //BA.debugLineNum = 1853;BA.debugLine="Sub CInt(o As Object) As Int";
 //BA.debugLineNum = 1854;BA.debugLine="Return Floor(o)";
if (true) return (int) (__c.Floor((double)(BA.ObjectToNumber(_o))));
 //BA.debugLineNum = 1855;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public BOVue As BANanoObject";
_bovue = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 4;BA.debugLine="Private BANAno As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 5;BA.debugLine="Public methods As Map";
_methods = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Public filters As Map";
_filters = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 7;BA.debugLine="Public data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="Public el As BANanoObject";
_el = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 9;BA.debugLine="Public refs As BANanoObject";
_refs = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 10;BA.debugLine="Public emit As BANanoObject";
_emit = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 11;BA.debugLine="Public body As BANanoElement";
_body = new com.ab.banano.BANanoElement();
 //BA.debugLineNum = 12;BA.debugLine="Public Template As VueHTML";
_template = new b4j.example.vuehtml();
 //BA.debugLineNum = 13;BA.debugLine="Public computed As Map";
_computed = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 14;BA.debugLine="Public watches As Map";
_watches = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 15;BA.debugLine="Private routes As List";
_routes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="Public components As Map";
_components = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 17;BA.debugLine="Public Options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 18;BA.debugLine="Private dynamicStyle As Map";
_dynamicstyle = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 19;BA.debugLine="Public GetTemplate As String";
_gettemplate = "";
 //BA.debugLineNum = 20;BA.debugLine="Public ShowWarnings As Boolean";
_showwarnings = false;
 //BA.debugLineNum = 21;BA.debugLine="Public const BORDER_DEFAULT As String = \"\"";
_border_default = "";
 //BA.debugLineNum = 22;BA.debugLine="Public const BORDER_DASHED As String = \"dashed\"";
_border_dashed = "dashed";
 //BA.debugLineNum = 23;BA.debugLine="Public const BORDER_DOTTED As String = \"dotted\"";
_border_dotted = "dotted";
 //BA.debugLineNum = 24;BA.debugLine="Public const BORDER_DOUBLE As String = \"double\"";
_border_double = "double";
 //BA.debugLineNum = 25;BA.debugLine="Public const BORDER_GROOVE As String = \"groove\"";
_border_groove = "groove";
 //BA.debugLineNum = 26;BA.debugLine="Public const BORDER_HIDDEN As String = \"hidden\"";
_border_hidden = "hidden";
 //BA.debugLineNum = 27;BA.debugLine="Public const BORDER_INSET As String = \"inset\"";
_border_inset = "inset";
 //BA.debugLineNum = 28;BA.debugLine="Public const BORDER_NONE As String = \"none\"";
_border_none = "none";
 //BA.debugLineNum = 29;BA.debugLine="Public const BORDER_OUTSET As String = \"outset\"";
_border_outset = "outset";
 //BA.debugLineNum = 30;BA.debugLine="Public const BORDER_RIDGE As String = \"ridge\"";
_border_ridge = "ridge";
 //BA.debugLineNum = 31;BA.debugLine="Public const BORDER_SOLID As String = \"solid\"";
_border_solid = "solid";
 //BA.debugLineNum = 33;BA.debugLine="Public const COLOR_AMBER As String = \"amber\"";
_color_amber = "amber";
 //BA.debugLineNum = 34;BA.debugLine="Public const COLOR_BLACK As String = \"black\"";
_color_black = "black";
 //BA.debugLineNum = 35;BA.debugLine="Public const COLOR_BLUE As String = \"blue\"";
_color_blue = "blue";
 //BA.debugLineNum = 36;BA.debugLine="Public const COLOR_BLUEGREY As String = \"blue-gre";
_color_bluegrey = "blue-grey";
 //BA.debugLineNum = 37;BA.debugLine="Public const COLOR_BROWN As String = \"brown\"";
_color_brown = "brown";
 //BA.debugLineNum = 38;BA.debugLine="Public const COLOR_CYAN As String = \"cyan\"";
_color_cyan = "cyan";
 //BA.debugLineNum = 39;BA.debugLine="Public const COLOR_DEEPORANGE As String = \"deep-o";
_color_deeporange = "deep-orange";
 //BA.debugLineNum = 40;BA.debugLine="Public const COLOR_DEEPPURPLE As String = \"deep-p";
_color_deeppurple = "deep-purple";
 //BA.debugLineNum = 41;BA.debugLine="Public const COLOR_GREEN As String = \"green\"";
_color_green = "green";
 //BA.debugLineNum = 42;BA.debugLine="Public const COLOR_GREY As String = \"grey\"";
_color_grey = "grey";
 //BA.debugLineNum = 43;BA.debugLine="Public const COLOR_INDIGO As String = \"indigo\"";
_color_indigo = "indigo";
 //BA.debugLineNum = 44;BA.debugLine="Public const COLOR_LIGHTBLUE As String = \"light-b";
_color_lightblue = "light-blue";
 //BA.debugLineNum = 45;BA.debugLine="Public const COLOR_LIGHTGREEN As String = \"light-";
_color_lightgreen = "light-green";
 //BA.debugLineNum = 46;BA.debugLine="Public const COLOR_LIME As String = \"lime\"";
_color_lime = "lime";
 //BA.debugLineNum = 47;BA.debugLine="Public const COLOR_ORANGE As String = \"orange\"";
_color_orange = "orange";
 //BA.debugLineNum = 48;BA.debugLine="Public const COLOR_PINK As String = \"pink\"";
_color_pink = "pink";
 //BA.debugLineNum = 49;BA.debugLine="Public const COLOR_PURPLE As String = \"purple\"";
_color_purple = "purple";
 //BA.debugLineNum = 50;BA.debugLine="Public const COLOR_RED As String = \"red\"";
_color_red = "red";
 //BA.debugLineNum = 51;BA.debugLine="Public const COLOR_TEAL As String = \"teal\"";
_color_teal = "teal";
 //BA.debugLineNum = 52;BA.debugLine="Public const COLOR_TRANSPARENT As String = \"trans";
_color_transparent = "transparent";
 //BA.debugLineNum = 53;BA.debugLine="Public const COLOR_WHITE As String = \"white\"";
_color_white = "white";
 //BA.debugLineNum = 54;BA.debugLine="Public const COLOR_YELLOW As String = \"yellow\"";
_color_yellow = "yellow";
 //BA.debugLineNum = 55;BA.debugLine="Public const COLOR_NONE As String = \"\"";
_color_none = "";
 //BA.debugLineNum = 57;BA.debugLine="Public const INTENSITY_NORMAL As String = \"\"";
_intensity_normal = "";
 //BA.debugLineNum = 58;BA.debugLine="Public const INTENSITY_LIGHTEN5 As String = \"ligh";
_intensity_lighten5 = "lighten-5";
 //BA.debugLineNum = 59;BA.debugLine="Public const INTENSITY_LIGHTEN4 As String = \"ligh";
_intensity_lighten4 = "lighten-4";
 //BA.debugLineNum = 60;BA.debugLine="Public const INTENSITY_LIGHTEN3 As String = \"ligh";
_intensity_lighten3 = "lighten-3";
 //BA.debugLineNum = 61;BA.debugLine="Public const INTENSITY_LIGHTEN2 As String = \"ligh";
_intensity_lighten2 = "lighten-2";
 //BA.debugLineNum = 62;BA.debugLine="Public const INTENSITY_LIGHTEN1 As String = \"ligh";
_intensity_lighten1 = "lighten-1";
 //BA.debugLineNum = 63;BA.debugLine="Public const INTENSITY_DARKEN1 As String = \"darke";
_intensity_darken1 = "darken-1";
 //BA.debugLineNum = 64;BA.debugLine="Public const INTENSITY_DARKEN2 As String = \"darke";
_intensity_darken2 = "darken-2";
 //BA.debugLineNum = 65;BA.debugLine="Public const INTENSITY_DARKEN3 As String = \"darke";
_intensity_darken3 = "darken-3";
 //BA.debugLineNum = 66;BA.debugLine="Public const INTENSITY_DARKEN4 As String = \"darke";
_intensity_darken4 = "darken-4";
 //BA.debugLineNum = 67;BA.debugLine="Public const INTENSITY_ACCENT1 As String = \"accen";
_intensity_accent1 = "accent-1";
 //BA.debugLineNum = 68;BA.debugLine="Public const INTENSITY_ACCENT2 As String = \"accen";
_intensity_accent2 = "accent-2";
 //BA.debugLineNum = 69;BA.debugLine="Public const INTENSITY_ACCENT3 As String = \"accen";
_intensity_accent3 = "accent-3";
 //BA.debugLineNum = 70;BA.debugLine="Public const INTENSITY_ACCENT4 As String = \"accen";
_intensity_accent4 = "accent-4";
 //BA.debugLineNum = 72;BA.debugLine="Public const SIZE_H1 As String = \"h1\"";
_size_h1 = "h1";
 //BA.debugLineNum = 73;BA.debugLine="Public const SIZE_H2 As String = \"h2\"";
_size_h2 = "h2";
 //BA.debugLineNum = 74;BA.debugLine="Public const SIZE_H3 As String = \"h3\"";
_size_h3 = "h3";
 //BA.debugLineNum = 75;BA.debugLine="Public const SIZE_H4 As String = \"h4\"";
_size_h4 = "h4";
 //BA.debugLineNum = 76;BA.debugLine="Public const SIZE_H5 As String = \"h5\"";
_size_h5 = "h5";
 //BA.debugLineNum = 77;BA.debugLine="Public const SIZE_H6 As String = \"h6\"";
_size_h6 = "h6";
 //BA.debugLineNum = 78;BA.debugLine="Public const SIZE_P As String = \"p\"";
_size_p = "p";
 //BA.debugLineNum = 79;BA.debugLine="Public const SIZE_SPAN As String = \"span\"";
_size_span = "span";
 //BA.debugLineNum = 80;BA.debugLine="Public const SIZE_BLOCKQUOTE As String = \"blockqu";
_size_blockquote = "blockquote";
 //BA.debugLineNum = 81;BA.debugLine="Public const SIZE_DIV As String = \"div\"";
_size_div = "div";
 //BA.debugLineNum = 83;BA.debugLine="Public const TEXT_LEFT As String = \"text-left\"";
_text_left = "text-left";
 //BA.debugLineNum = 84;BA.debugLine="Public const TEXT_CENTER As String = \"text-center";
_text_center = "text-center";
 //BA.debugLineNum = 85;BA.debugLine="Public const TEXT_RIGHT As String = \"text-right\"";
_text_right = "text-right";
 //BA.debugLineNum = 86;BA.debugLine="Public const TEXT_NO_WRAP As String = \"text-no-wr";
_text_no_wrap = "text-no-wrap";
 //BA.debugLineNum = 87;BA.debugLine="Public const TEXT_TRUNCATE As String = \"text-trun";
_text_truncate = "text-truncate";
 //BA.debugLineNum = 88;BA.debugLine="Public const TEXT_LOWERCASE As String = \"text-low";
_text_lowercase = "text-lowercase";
 //BA.debugLineNum = 89;BA.debugLine="Public const TEXT_UPPERCASE As String = \"text-upp";
_text_uppercase = "text-uppercase";
 //BA.debugLineNum = 90;BA.debugLine="Public const TEXT_CAPITALIZE As String = \"text-ca";
_text_capitalize = "text-capitalize";
 //BA.debugLineNum = 92;BA.debugLine="Type ColorTypes(red As String, pink As String, pu";
;
 //BA.debugLineNum = 96;BA.debugLine="Public Colors As ColorTypes";
_colors = new b4j.example.bananovue._colortypes();
 //BA.debugLineNum = 98;BA.debugLine="Private ColorMap As Map";
_colormap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 99;BA.debugLine="Public Themes As Map";
_themes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 100;BA.debugLine="Public TargetOptions As Map";
_targetoptions = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 101;BA.debugLine="Public ColumnTypes As Map";
_columntypes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 102;BA.debugLine="Public ColumnAlign As Map";
_columnalign = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 103;BA.debugLine="Public DataTypes As Map";
_datatypes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 104;BA.debugLine="Public ControlTypes As Map";
_controltypes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 105;BA.debugLine="Public Modules As Map";
_modules = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 106;BA.debugLine="Public SourceCode As StringBuilder";
_sourcecode = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 107;BA.debugLine="Public HashType As Map";
_hashtype = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 108;BA.debugLine="Public Algorithm As Map";
_algorithm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 109;BA.debugLine="Public Errors As Map";
_errors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 110;BA.debugLine="Public Position As Map";
_position = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 111;BA.debugLine="Public Module As Object";
_module = new Object();
 //BA.debugLineNum = 112;BA.debugLine="Public store As BANanoObject";
_store = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 113;BA.debugLine="Public state As Map";
_state = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 114;BA.debugLine="Public bindings As Map";
_bindings = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 115;BA.debugLine="Public Router As BANanoObject";
_router = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public long  _clng(Object _o) throws Exception{
 //BA.debugLineNum = 1849;BA.debugLine="Sub CLng(o As Object) As Long";
 //BA.debugLineNum = 1850;BA.debugLine="Return Floor(o)";
if (true) return (long) (__c.Floor((double)(BA.ObjectToNumber(_o))));
 //BA.debugLineNum = 1851;BA.debugLine="End Sub";
return 0L;
}
public String  _copycode2clipboard(String _prismid) throws Exception{
String _codekey = "";
String _scode = "";
 //BA.debugLineNum = 818;BA.debugLine="Sub CopyCode2Clipboard(prismID As String)";
 //BA.debugLineNum = 819;BA.debugLine="prismID = prismID.tolowercase";
_prismid = _prismid.toLowerCase();
 //BA.debugLineNum = 820;BA.debugLine="Dim codeKey As String = $\"${prismID}code\"$";
_codekey = (""+__c.SmartStringFormatter("",(Object)(_prismid))+"code");
 //BA.debugLineNum = 822;BA.debugLine="Dim sCode As String = GetData(codeKey)";
_scode = BA.ObjectToString(_getdata(_codekey));
 //BA.debugLineNum = 823;BA.debugLine="BOVue.RunMethod(\"$copyText\", Array(sCode))";
_bovue.RunMethod("$copyText",(Object)(new Object[]{(Object)(_scode)}));
 //BA.debugLineNum = 824;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _copymap(anywheresoftware.b4a.objects.collections.Map _source,anywheresoftware.b4a.objects.collections.List _keys) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 2743;BA.debugLine="Sub CopyMap(source As Map, keys As List) As Map";
 //BA.debugLineNum = 2744;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2745;BA.debugLine="If keys.Get(0) = \"*\" Then";
if ((_keys.Get((int) (0))).equals((Object)("*"))) { 
 //BA.debugLineNum = 2746;BA.debugLine="For Each k As String In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _source.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 2747;BA.debugLine="Dim v As Object = source.Get(k)";
_v = _source.Get((Object)(_k));
 //BA.debugLineNum = 2748;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 }else {
 //BA.debugLineNum = 2751;BA.debugLine="For Each k As String In keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _keys;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_k = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 2752;BA.debugLine="Dim v As Object = source.Get(k)";
_v = _source.Get((Object)(_k));
 //BA.debugLineNum = 2753;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 };
 //BA.debugLineNum = 2756;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 2757;BA.debugLine="End Sub";
return null;
}
public String  _correctname(String _oldname) throws Exception{
String _strname = "";
 //BA.debugLineNum = 787;BA.debugLine="Sub CorrectName(oldName As String) As String";
 //BA.debugLineNum = 788;BA.debugLine="Dim strName As String = StringBreakAtUpperCase(ol";
_strname = _stringbreakatuppercase(_oldname);
 //BA.debugLineNum = 789;BA.debugLine="strName = strName.replace(\" \", \"-\")";
_strname = _strname.replace(" ","-");
 //BA.debugLineNum = 790;BA.debugLine="strName = strName.tolowercase";
_strname = _strname.toLowerCase();
 //BA.debugLineNum = 791;BA.debugLine="Return strName";
if (true) return _strname;
 //BA.debugLineNum = 792;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _createb4xlist(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
 //BA.debugLineNum = 841;BA.debugLine="Sub CreateB4xList(lst As List) As List";
 //BA.debugLineNum = 842;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 843;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 844;BA.debugLine="nl.AddAll(lst)";
_nl.AddAll(_lst);
 //BA.debugLineNum = 845;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 846;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createbutton1(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 2565;BA.debugLine="Sub CreateBUTTON1(id As String) As VMElement";
 //BA.debugLineNum = 2566;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 2567;BA.debugLine="elx.Initialize(Me, id).SetTag(\"button\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("button");
 //BA.debugLineNum = 2568;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 2569;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createcomponent(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3713;BA.debugLine="Sub CreateComponent(id As String) As VMElement";
 //BA.debugLineNum = 3714;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3715;BA.debugLine="elx.Initialize(Me, id).SetTag(\"component\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("component");
 //BA.debugLineNum = 3716;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3717;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _creatediv(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3668;BA.debugLine="Sub CreateDiv(id As String) As VMElement";
 //BA.debugLineNum = 3669;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3670;BA.debugLine="elx.Initialize(Me,id).SetTag(\"div\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("div");
 //BA.debugLineNum = 3671;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3672;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createdynamiccomponent(String _id,String _viewid,String _compid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3720;BA.debugLine="Sub CreateDynamicComponent(id As String, viewID As";
 //BA.debugLineNum = 3721;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3722;BA.debugLine="elx.Initialize(Me, id).SetTag(\"component\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("component");
 //BA.debugLineNum = 3723;BA.debugLine="elx.BindDynamicComponent(viewID, compID)";
_elx._binddynamiccomponent /*b4j.example.vmelement*/ (_viewid,_compid);
 //BA.debugLineNum = 3724;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3725;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createform(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 2541;BA.debugLine="Sub CreateFORM(id As String) As VMElement";
 //BA.debugLineNum = 2542;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 2543;BA.debugLine="elx.Initialize(Me, id).SetTag(\"form\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("form");
 //BA.debugLineNum = 2544;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 2545;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh1(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3740;BA.debugLine="Sub CreateH1(id As String) As VMElement";
 //BA.debugLineNum = 3741;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3742;BA.debugLine="elx.Initialize(Me, id).SetTag(\"h1\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("h1");
 //BA.debugLineNum = 3743;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3744;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh2(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3746;BA.debugLine="Sub CreateH2(id As String) As VMElement";
 //BA.debugLineNum = 3747;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3748;BA.debugLine="elx.Initialize(Me, id).SetTag(\"h2\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("h2");
 //BA.debugLineNum = 3749;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3750;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh3(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3752;BA.debugLine="Sub CreateH3(id As String) As VMElement";
 //BA.debugLineNum = 3753;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3754;BA.debugLine="elx.Initialize(Me, id).SetTag(\"h3\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("h3");
 //BA.debugLineNum = 3755;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3756;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh4(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3758;BA.debugLine="Sub CreateH4(id As String) As VMElement";
 //BA.debugLineNum = 3759;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3760;BA.debugLine="elx.Initialize(Me, id).SetTag(\"h4\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("h4");
 //BA.debugLineNum = 3761;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3762;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh5(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3764;BA.debugLine="Sub CreateH5(id As String) As VMElement";
 //BA.debugLineNum = 3765;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3766;BA.debugLine="elx.Initialize(Me, id).SetTag(\"h5\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("h5");
 //BA.debugLineNum = 3767;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3768;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh6(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3770;BA.debugLine="Sub CreateH6(id As String) As VMElement";
 //BA.debugLineNum = 3771;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3772;BA.debugLine="elx.Initialize(Me, id).SetTag(\"h6\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("h6");
 //BA.debugLineNum = 3773;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3774;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createimg(String _img) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3734;BA.debugLine="Sub CreateIMG(img As String) As VMElement";
 //BA.debugLineNum = 3735;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3736;BA.debugLine="elx.Initialize(Me, img).SetTag(\"img\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_img)._settag /*b4j.example.vmelement*/ ("img");
 //BA.debugLineNum = 3737;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3738;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createinput(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 2553;BA.debugLine="Sub CreateINPUT(id As String) As VMElement";
 //BA.debugLineNum = 2554;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 2555;BA.debugLine="elx.Initialize(Me, id).SetTag(\"input\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("input");
 //BA.debugLineNum = 2556;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 2557;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createkeepalive(String _sid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3706;BA.debugLine="Sub CreateKeepAlive(sid As String) As VMElement";
 //BA.debugLineNum = 3707;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3708;BA.debugLine="elx.Initialize(Me,sid).SetTag(\"keep-alive\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_sid)._settag /*b4j.example.vmelement*/ ("keep-alive");
 //BA.debugLineNum = 3709;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3710;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createlabel(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 2547;BA.debugLine="Sub CreateLABEL(id As String) As VMElement";
 //BA.debugLineNum = 2548;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 2549;BA.debugLine="elx.Initialize(Me, id).SetTag(\"label\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("label");
 //BA.debugLineNum = 2550;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 2551;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createli(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3686;BA.debugLine="Sub CreateLI(id As String) As VMElement";
 //BA.debugLineNum = 3687;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3688;BA.debugLine="elx.Initialize(Me,id).SetTag(\"li\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("li");
 //BA.debugLineNum = 3689;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3690;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _createlist(String _delimiter,String _values) throws Exception{
anywheresoftware.b4a.objects.collections.List _newlst = null;
anywheresoftware.b4a.objects.collections.List _spv = null;
 //BA.debugLineNum = 3209;BA.debugLine="Sub CreateList(Delimiter As String, Values As Stri";
 //BA.debugLineNum = 3210;BA.debugLine="Dim newLst As List";
_newlst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3211;BA.debugLine="newLst.Initialize";
_newlst.Initialize();
 //BA.debugLineNum = 3212;BA.debugLine="If Values.length > 0 Then";
if (_values.length()>0) { 
 //BA.debugLineNum = 3213;BA.debugLine="Dim spV As List = StrParse(Delimiter,Values)";
_spv = new anywheresoftware.b4a.objects.collections.List();
_spv = _strparse(_delimiter,_values);
 //BA.debugLineNum = 3214;BA.debugLine="newLst.AddAll(spV)";
_newlst.AddAll(_spv);
 };
 //BA.debugLineNum = 3216;BA.debugLine="Return newLst";
if (true) return _newlst;
 //BA.debugLineNum = 3217;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createol(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3693;BA.debugLine="Sub CreateOL(id As String) As VMElement";
 //BA.debugLineNum = 3694;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3695;BA.debugLine="elx.Initialize(Me,id).SetTag(\"ol\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("ol");
 //BA.debugLineNum = 3696;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3697;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createoption(String _sid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 2408;BA.debugLine="Sub CreateOPTION(sid As String) As VMElement";
 //BA.debugLineNum = 2409;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 2410;BA.debugLine="elx.Initialize(Me,sid).SetTag(\"option\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_sid)._settag /*b4j.example.vmelement*/ ("option");
 //BA.debugLineNum = 2411;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 2412;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createowncomponent(String _id,String _compname) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3728;BA.debugLine="Sub CreateOwnComponent(id As String, compName As S";
 //BA.debugLineNum = 3729;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3730;BA.debugLine="elx.Initialize(Me, id).SetTag(compName)";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (_compname);
 //BA.debugLineNum = 3731;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3732;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createp(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3700;BA.debugLine="Sub CreateP(id As String) As VMElement";
 //BA.debugLineNum = 3701;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3702;BA.debugLine="elx.Initialize(Me, id).SetTag(\"p\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("p");
 //BA.debugLineNum = 3703;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3704;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createrouterlink(String _rid,String _rto,String _text) throws Exception{
b4j.example.vuehtml _elx = null;
 //BA.debugLineNum = 2671;BA.debugLine="Sub CreateRouterLink(rID As String, rTo As String,";
 //BA.debugLineNum = 2672;BA.debugLine="Dim elx As VueHTML";
_elx = new b4j.example.vuehtml();
 //BA.debugLineNum = 2673;BA.debugLine="elx.Initialize(rID,\"router-link\").SetTo(rTo).SetT";
_elx._initialize /*b4j.example.vuehtml*/ (ba,_rid,"router-link")._setto /*b4j.example.vuehtml*/ ((Object)(_rto))._settext /*b4j.example.vuehtml*/ (_text);
 //BA.debugLineNum = 2674;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 2675;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createrouterview(String _rid) throws Exception{
b4j.example.vuehtml _elx = null;
 //BA.debugLineNum = 2677;BA.debugLine="Sub CreateRouterView(rID As String) As VueHTML";
 //BA.debugLineNum = 2678;BA.debugLine="Dim elx As VueHTML";
_elx = new b4j.example.vuehtml();
 //BA.debugLineNum = 2679;BA.debugLine="elx.Initialize(rID, \"router-view\")";
_elx._initialize /*b4j.example.vuehtml*/ (ba,_rid,"router-view");
 //BA.debugLineNum = 2680;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 2681;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createselect(String _sid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 2416;BA.debugLine="Sub CreateSELECT(sid As String) As VMElement";
 //BA.debugLineNum = 2417;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 2418;BA.debugLine="elx.Initialize(Me,sid).SetTag(\"select\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_sid)._settag /*b4j.example.vmelement*/ ("select");
 //BA.debugLineNum = 2419;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 2420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createspan(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3674;BA.debugLine="Sub CreateSPAN(id As String) As VMElement";
 //BA.debugLineNum = 3675;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3676;BA.debugLine="elx.Initialize(Me,id).SetTag(\"span\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 3677;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3678;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createtag(String _id,String _tag) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3662;BA.debugLine="Sub CreateTag(id As String, tag As String) As VMEl";
 //BA.debugLineNum = 3663;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3664;BA.debugLine="elx.Initialize(Me,id).SetTag(tag)";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (_tag);
 //BA.debugLineNum = 3665;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3666;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createtextarea(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 2559;BA.debugLine="Sub CreateTEXTAREA(id As String) As VMElement";
 //BA.debugLineNum = 2560;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 2561;BA.debugLine="elx.Initialize(Me, id).SetTag(\"textarea\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("textarea");
 //BA.debugLineNum = 2562;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 2563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createul(String _id) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 3680;BA.debugLine="Sub CreateUL(id As String) As VMElement";
 //BA.debugLineNum = 3681;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 3682;BA.debugLine="elx.Initialize(Me,id).SetTag(\"ul\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("ul");
 //BA.debugLineNum = 3683;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3684;BA.debugLine="End Sub";
return null;
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 2881;BA.debugLine="Sub CStr(o As Object) As String";
 //BA.debugLineNum = 2882;BA.debugLine="If o = BANAno.UNDEFINED Then o = \"\"";
if ((_o).equals(_banano.UNDEFINED())) { 
_o = (Object)("");};
 //BA.debugLineNum = 2883;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 2884;BA.debugLine="End Sub";
return "";
}
public String  _datatype2fieldtype(String _fldtype) throws Exception{
 //BA.debugLineNum = 3013;BA.debugLine="Sub DataType2FieldType(fldtype As String) As Strin";
 //BA.debugLineNum = 3014;BA.debugLine="fldtype = fldtype.ToUpperCase";
_fldtype = _fldtype.toUpperCase();
 //BA.debugLineNum = 3015;BA.debugLine="If fldtype.EqualsIgnoreCase(\"double\") Then fldtyp";
if (_fldtype.equalsIgnoreCase("double")) { 
_fldtype = "FLOAT";};
 //BA.debugLineNum = 3016;BA.debugLine="If fldtype.EqualsIgnoreCase(\"integer\") Then fldty";
if (_fldtype.equalsIgnoreCase("integer")) { 
_fldtype = "INT";};
 //BA.debugLineNum = 3017;BA.debugLine="If fldtype.EqualsIgnoreCase(\"long\") Then fldtype";
if (_fldtype.equalsIgnoreCase("long")) { 
_fldtype = "INT";};
 //BA.debugLineNum = 3018;BA.debugLine="If fldtype.EqualsIgnoreCase(\"short\") Then fldtype";
if (_fldtype.equalsIgnoreCase("short")) { 
_fldtype = "INT";};
 //BA.debugLineNum = 3019;BA.debugLine="If fldtype.endswith(\"INT\") Then fldtype = \"INT\"";
if (_fldtype.endsWith("INT")) { 
_fldtype = "INT";};
 //BA.debugLineNum = 3020;BA.debugLine="If fldtype.endswith(\"CHAR\") Then fldtype = \"TEXT\"";
if (_fldtype.endsWith("CHAR")) { 
_fldtype = "TEXT";};
 //BA.debugLineNum = 3021;BA.debugLine="If fldtype.endswith(\"TEXT\") Then fldtype = \"TEXT\"";
if (_fldtype.endsWith("TEXT")) { 
_fldtype = "TEXT";};
 //BA.debugLineNum = 3022;BA.debugLine="If fldtype.endswith(\"REAL\") Then fldtype = \"FLOAT";
if (_fldtype.endsWith("REAL")) { 
_fldtype = "FLOAT";};
 //BA.debugLineNum = 3023;BA.debugLine="If fldtype.endswith(\"BIT\") Then fldtype = \"INT\"";
if (_fldtype.endsWith("BIT")) { 
_fldtype = "INT";};
 //BA.debugLineNum = 3025;BA.debugLine="fldtype = fldtype.tolowercase";
_fldtype = _fldtype.toLowerCase();
 //BA.debugLineNum = 3026;BA.debugLine="fldtype = fldtype.replace(\"text\", \"string\")";
_fldtype = _fldtype.replace("text","string");
 //BA.debugLineNum = 3027;BA.debugLine="fldtype = fldtype.replace(\"float\", \"dbl\")";
_fldtype = _fldtype.replace("float","dbl");
 //BA.debugLineNum = 3028;BA.debugLine="fldtype = fldtype.replace(\"blob\", \"string\")";
_fldtype = _fldtype.replace("blob","string");
 //BA.debugLineNum = 3029;BA.debugLine="fldtype = fldtype.replace(\"none\", \"string\")";
_fldtype = _fldtype.replace("none","string");
 //BA.debugLineNum = 3030;BA.debugLine="fldtype = fldtype.replace(\"varchar\", \"string\")";
_fldtype = _fldtype.replace("varchar","string");
 //BA.debugLineNum = 3031;BA.debugLine="Return fldtype";
if (true) return _fldtype;
 //BA.debugLineNum = 3032;BA.debugLine="End Sub";
return "";
}
public String  _dateadd(String _mdate,int _howmanydays) throws Exception{
long _convertdate = 0L;
long _newdateday = 0L;
 //BA.debugLineNum = 1575;BA.debugLine="Sub DateAdd(mDate As String, HowManyDays As Int) A";
 //BA.debugLineNum = 1576;BA.debugLine="HowManyDays = BANAno.parseInt(HowManyDays)";
_howmanydays = _banano.parseInt((Object)(_howmanydays));
 //BA.debugLineNum = 1577;BA.debugLine="Dim ConvertDate, NewDateDay As Long";
_convertdate = 0L;
_newdateday = 0L;
 //BA.debugLineNum = 1578;BA.debugLine="ConvertDate = DateTime.DateParse(mDate)";
_convertdate = __c.DateTime.DateParse(_mdate);
 //BA.debugLineNum = 1579;BA.debugLine="NewDateDay = DateTime.Add(ConvertDate, 0, 0, HowM";
_newdateday = __c.DateTime.Add(_convertdate,(int) (0),(int) (0),_howmanydays);
 //BA.debugLineNum = 1580;BA.debugLine="Return DateTime.Date(NewDateDay)";
if (true) return __c.DateTime.Date(_newdateday);
 //BA.debugLineNum = 1581;BA.debugLine="End Sub";
return "";
}
public int  _datediff(String _currentdate,String _otherdate) throws Exception{
com.ab.banano.BANanoObject _dates = null;
com.ab.banano.BANanoObject _datee = null;
 //BA.debugLineNum = 1171;BA.debugLine="Sub DateDiff(currentDate As String, otherDate As S";
 //BA.debugLineNum = 1172;BA.debugLine="Dim dateS, dateE As BANanoObject";
_dates = new com.ab.banano.BANanoObject();
_datee = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 1173;BA.debugLine="dateS.Initialize4(\"moment\", currentDate)";
_dates.Initialize4("moment",(Object)(_currentdate));
 //BA.debugLineNum = 1174;BA.debugLine="dateE.Initialize4(\"moment\", otherDate)";
_datee.Initialize4("moment",(Object)(_otherdate));
 //BA.debugLineNum = 1175;BA.debugLine="Return dateS.RunMethod(\"diff\", Array(dateE, \"days";
if (true) return (int)(BA.ObjectToNumber(_dates.RunMethod("diff",(Object)(new Object[]{(Object)(_datee.getObject()),(Object)("days")}))));
 //BA.debugLineNum = 1176;BA.debugLine="End Sub";
return 0;
}
public String  _dateformat(String _item,String _sformat) throws Exception{
long _dt = 0L;
String _rslt = "";
 //BA.debugLineNum = 2037;BA.debugLine="Sub DateFormat(item As String, sFormat As String)";
 //BA.debugLineNum = 2038;BA.debugLine="If BANAno.IsUndefined(item) Or BANAno.IsNull(item";
if (_banano.IsUndefined((Object)(_item)) || _banano.IsNull((Object)(_item))) { 
if (true) return "";};
 //BA.debugLineNum = 2039;BA.debugLine="If item.Length = 0 Then Return \"\"";
if (_item.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 2040;BA.debugLine="Try";
try { //BA.debugLineNum = 2041;BA.debugLine="item = MvField(item,1,\" \")";
_item = _mvfield(_item,(int) (1)," ");
 //BA.debugLineNum = 2042;BA.debugLine="item = item.trim";
_item = _item.trim();
 //BA.debugLineNum = 2043;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 2044;BA.debugLine="Dim dt As Long = DateTime.DateParse(item)";
_dt = __c.DateTime.DateParse(_item);
 //BA.debugLineNum = 2045;BA.debugLine="DateTime.DateFormat = sFormat";
__c.DateTime.setDateFormat(_sformat);
 //BA.debugLineNum = 2046;BA.debugLine="Dim rslt As String = DateTime.Date(dt)";
_rslt = __c.DateTime.Date(_dt);
 //BA.debugLineNum = 2047;BA.debugLine="Return rslt";
if (true) return _rslt;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 2049;BA.debugLine="Return item";
if (true) return _item;
 };
 //BA.debugLineNum = 2051;BA.debugLine="End Sub";
return "";
}
public long  _dateiconv(String _sdate) throws Exception{
long _lps = 0L;
 //BA.debugLineNum = 1034;BA.debugLine="Sub DateIconv(sdate As String) As Long";
 //BA.debugLineNum = 1035;BA.debugLine="Dim lps As Long = DateTime.DateParse(sdate)";
_lps = __c.DateTime.DateParse(_sdate);
 //BA.debugLineNum = 1036;BA.debugLine="Return lps";
if (true) return _lps;
 //BA.debugLineNum = 1037;BA.debugLine="End Sub";
return 0L;
}
public boolean  _dateisafter(String _date1,String _date2) throws Exception{
int _d1 = 0;
int _d2 = 0;
boolean _b = false;
 //BA.debugLineNum = 1003;BA.debugLine="Sub DateIsAfter(date1 As String, date2 As String)";
 //BA.debugLineNum = 1004;BA.debugLine="Dim d1 As Int = DateIconv(date1)";
_d1 = (int) (_dateiconv(_date1));
 //BA.debugLineNum = 1005;BA.debugLine="Dim d2 As Int = DateIconv(date2)";
_d2 = (int) (_dateiconv(_date2));
 //BA.debugLineNum = 1006;BA.debugLine="d1 = BANAno.parseint(d1)";
_d1 = _banano.parseInt((Object)(_d1));
 //BA.debugLineNum = 1007;BA.debugLine="d2 = BANAno.parseInt(d2)";
_d2 = _banano.parseInt((Object)(_d2));
 //BA.debugLineNum = 1008;BA.debugLine="Dim b As Boolean = BANAno.IIf(d1 > d2, True, Fals";
_b = BA.ObjectToBoolean(_banano.IIf((Object)(_d1>_d2),(Object)(__c.True),(Object)(__c.False)));
 //BA.debugLineNum = 1009;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 1010;BA.debugLine="End Sub";
return false;
}
public String  _datenow() throws Exception{
long _lnow = 0L;
String _dt = "";
 //BA.debugLineNum = 2717;BA.debugLine="Public Sub DateNow() As String";
 //BA.debugLineNum = 2718;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
 //BA.debugLineNum = 2719;BA.debugLine="Dim dt As String";
_dt = "";
 //BA.debugLineNum = 2720;BA.debugLine="lNow = DateTime.Now";
_lnow = __c.DateTime.getNow();
 //BA.debugLineNum = 2721;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 2722;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = __c.DateTime.Date(_lnow);
 //BA.debugLineNum = 2723;BA.debugLine="Return dt";
if (true) return _dt;
 //BA.debugLineNum = 2724;BA.debugLine="End Sub";
return "";
}
public String  _dateoconv(long _ldate) throws Exception{
String _sdate = "";
 //BA.debugLineNum = 1039;BA.debugLine="Sub DateOconv(lDate As Long) As String";
 //BA.debugLineNum = 1040;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 1041;BA.debugLine="Dim sdate As String = DateTime.Date(lDate)";
_sdate = __c.DateTime.Date(_ldate);
 //BA.debugLineNum = 1042;BA.debugLine="Return sdate";
if (true) return _sdate;
 //BA.debugLineNum = 1043;BA.debugLine="End Sub";
return "";
}
public String  _datetimenow() throws Exception{
long _lnow = 0L;
String _dt = "";
 //BA.debugLineNum = 2726;BA.debugLine="Public Sub DateTimeNow() As String";
 //BA.debugLineNum = 2727;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
 //BA.debugLineNum = 2728;BA.debugLine="Dim dt As String";
_dt = "";
 //BA.debugLineNum = 2729;BA.debugLine="lNow = DateTime.Now";
_lnow = __c.DateTime.getNow();
 //BA.debugLineNum = 2730;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm\"";
__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm");
 //BA.debugLineNum = 2731;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = __c.DateTime.Date(_lnow);
 //BA.debugLineNum = 2732;BA.debugLine="Return dt";
if (true) return _dt;
 //BA.debugLineNum = 2733;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _decrement(String _elid,int _valueof) throws Exception{
int _oldv = 0;
 //BA.debugLineNum = 4212;BA.debugLine="Sub Decrement(elID As String, valueOf As Int) As B";
 //BA.debugLineNum = 4213;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 4214;BA.debugLine="Dim oldv As Int = GetState(elID,0)";
_oldv = (int)(BA.ObjectToNumber(_getstate(_elid,(Object)(0))));
 //BA.debugLineNum = 4215;BA.debugLine="oldv = BANAno.parseInt(oldv) - valueOf";
_oldv = (int) (_banano.parseInt((Object)(_oldv))-_valueof);
 //BA.debugLineNum = 4216;BA.debugLine="SetStateSingle(elID, oldv)";
_setstatesingle(_elid,(Object)(_oldv));
 //BA.debugLineNum = 4217;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 4218;BA.debugLine="End Sub";
return null;
}
public String  _decrementglobal(String _prop,int _addval) throws Exception{
int _cc = 0;
 //BA.debugLineNum = 776;BA.debugLine="Sub DecrementGlobal(prop As String, addVal As Int)";
 //BA.debugLineNum = 777;BA.debugLine="prop = prop.tolowercase";
_prop = _prop.toLowerCase();
 //BA.debugLineNum = 779;BA.debugLine="Dim cc As Int = GetDataGlobal(prop)";
_cc = (int)(BA.ObjectToNumber(_getdataglobal(_prop)));
 //BA.debugLineNum = 780;BA.debugLine="cc = BANAno.parseInt(cc)";
_cc = _banano.parseInt((Object)(_cc));
 //BA.debugLineNum = 782;BA.debugLine="cc = cc - addVal";
_cc = (int) (_cc-_addval);
 //BA.debugLineNum = 784;BA.debugLine="SetDataGlobal(prop, cc)";
_setdataglobal(_prop,(Object)(_cc));
 //BA.debugLineNum = 785;BA.debugLine="End Sub";
return "";
}
public String  _disable(String _elid) throws Exception{
 //BA.debugLineNum = 3993;BA.debugLine="Sub Disable(elID As String)";
 //BA.debugLineNum = 3994;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 3995;BA.debugLine="SetStateSingle($\"${elID}disabled\"$, True)";
_setstatesingle((""+__c.SmartStringFormatter("",(Object)(_elid))+"disabled"),(Object)(__c.True));
 //BA.debugLineNum = 3996;BA.debugLine="End Sub";
return "";
}
public String  _disableitem(String _elid) throws Exception{
 //BA.debugLineNum = 2611;BA.debugLine="Sub DisableItem(elID As String)";
 //BA.debugLineNum = 2612;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 2613;BA.debugLine="SetStateSingle($\"${elID}disabled\"$, True)";
_setstatesingle((""+__c.SmartStringFormatter("",(Object)(_elid))+"disabled"),(Object)(__c.True));
 //BA.debugLineNum = 2614;BA.debugLine="End Sub";
return "";
}
public String  _doupload(Object _fileobj) throws Exception{
Object _aevt = null;
com.ab.banano.BANanoXMLHttpRequest _xhr = null;
com.ab.banano.BANanoObject _fd = null;
anywheresoftware.b4a.objects.collections.Map _err = null;
String _serr = "";
 //BA.debugLineNum = 1357;BA.debugLine="private Sub DoUpload(fileObj As Object) As String";
 //BA.debugLineNum = 1358;BA.debugLine="Dim aEvt As Object";
_aevt = new Object();
 //BA.debugLineNum = 1359;BA.debugLine="Dim xhr As BANanoXMLHttpRequest";
_xhr = new com.ab.banano.BANanoXMLHttpRequest();
 //BA.debugLineNum = 1361;BA.debugLine="Dim fd As BANanoObject";
_fd = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 1362;BA.debugLine="fd.Initialize2(\"FormData\",Null)";
_fd.Initialize2("FormData",__c.Null);
 //BA.debugLineNum = 1363;BA.debugLine="fd.RunMethod(\"append\", Array(\"upload\", fileObj))";
_fd.RunMethod("append",(Object)(new Object[]{(Object)("upload"),_fileobj}));
 //BA.debugLineNum = 1365;BA.debugLine="xhr.Initialize";
_xhr.Initialize();
 //BA.debugLineNum = 1366;BA.debugLine="xhr.Open(\"POST\", \"./assets/upload.php\")";
_xhr.Open("POST","./assets/upload.php");
 //BA.debugLineNum = 1367;BA.debugLine="xhr.AddEventListenerOpenAsync(\"onreadystatechange";
_xhr.AddEventListenerOpenAsync("onreadystatechange",_aevt);
 //BA.debugLineNum = 1368;BA.debugLine="If xhr.ReadyState = 4 Then";
if (_xhr.getReadyState()==4) { 
 //BA.debugLineNum = 1369;BA.debugLine="If xhr.Status = 200 Then";
if (_xhr.getStatus()==200) { 
 //BA.debugLineNum = 1370;BA.debugLine="BANAno.ReturnThen(xhr.ResponseText)";
_banano.ReturnThen((Object)(_xhr.getResponseText()));
 }else {
 //BA.debugLineNum = 1372;BA.debugLine="Dim err As Map = CreateMap()";
_err = new anywheresoftware.b4a.objects.collections.Map();
_err = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1373;BA.debugLine="err.Put(\"status\", \"error\")";
_err.Put((Object)("status"),(Object)("error"));
 //BA.debugLineNum = 1374;BA.debugLine="Dim serr As String = BANAno.ToJson(err)";
_serr = BA.ObjectToString(_banano.ToJson((Object)(_err.getObject())));
 //BA.debugLineNum = 1375;BA.debugLine="BANAno.ReturnElse(serr)";
_banano.ReturnElse((Object)(_serr));
 };
 };
 //BA.debugLineNum = 1378;BA.debugLine="xhr.CloseEventListener";
_xhr.CloseEventListener();
 //BA.debugLineNum = 1379;BA.debugLine="xhr.Send2(fd)";
_xhr.Send2((Object)(_fd.getObject()));
 //BA.debugLineNum = 1380;BA.debugLine="End Sub";
return "";
}
public String  _downloadcode(String _prismid,String _filename) throws Exception{
String _codekey = "";
String _scode = "";
 //BA.debugLineNum = 810;BA.debugLine="Sub DownloadCode(prismID As String, fileName As St";
 //BA.debugLineNum = 811;BA.debugLine="prismID = prismID.tolowercase";
_prismid = _prismid.toLowerCase();
 //BA.debugLineNum = 812;BA.debugLine="Dim codeKey As String = $\"${prismID}code\"$";
_codekey = (""+__c.SmartStringFormatter("",(Object)(_prismid))+"code");
 //BA.debugLineNum = 813;BA.debugLine="Dim sCode As String = GetData(codeKey)";
_scode = BA.ObjectToString(_getdata(_codekey));
 //BA.debugLineNum = 814;BA.debugLine="SaveText2File(sCode, fileName)";
_savetext2file(_scode,_filename);
 //BA.debugLineNum = 815;BA.debugLine="End Sub";
return "";
}
public String  _enable(String _elid) throws Exception{
 //BA.debugLineNum = 3988;BA.debugLine="Sub Enable(elID As String)";
 //BA.debugLineNum = 3989;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 3990;BA.debugLine="SetStateSingle($\"${elID}disabled\"$, False)";
_setstatesingle((""+__c.SmartStringFormatter("",(Object)(_elid))+"disabled"),(Object)(__c.False));
 //BA.debugLineNum = 3991;BA.debugLine="End Sub";
return "";
}
public String  _enableitem(String _elid) throws Exception{
 //BA.debugLineNum = 2606;BA.debugLine="Sub EnableItem(elID As String)";
 //BA.debugLineNum = 2607;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 2608;BA.debugLine="SetStateSingle($\"${elID}disabled\"$, False)";
_setstatesingle((""+__c.SmartStringFormatter("",(Object)(_elid))+"disabled"),(Object)(__c.False));
 //BA.debugLineNum = 2609;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _eqoperators(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _k = "";
 //BA.debugLineNum = 2423;BA.debugLine="Sub EQOperators(sm As Map) As List";
 //BA.debugLineNum = 2424;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2425;BA.debugLine="nl.initialize";
_nl.Initialize();
 //BA.debugLineNum = 2426;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _sm.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 2427;BA.debugLine="nl.Add(\"=\")";
_nl.Add((Object)("="));
 }
};
 //BA.debugLineNum = 2429;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 2430;BA.debugLine="End Sub";
return null;
}
public String  _escapefield(String _f) throws Exception{
 //BA.debugLineNum = 3941;BA.debugLine="Sub EscapeField(f As String) As String";
 //BA.debugLineNum = 3942;BA.debugLine="Return $\"[${f}]\"$";
if (true) return ("["+__c.SmartStringFormatter("",(Object)(_f))+"]");
 //BA.debugLineNum = 3943;BA.debugLine="End Sub";
return "";
}
public String  _expectedrag(double _dvalue) throws Exception{
 //BA.debugLineNum = 3801;BA.debugLine="Public Sub ExpectedRAG(dValue As Double) As String";
 //BA.debugLineNum = 3802;BA.debugLine="If dValue = 0 Then";
if (_dvalue==0) { 
 //BA.debugLineNum = 3803;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 }else if(_dvalue>0) { 
 //BA.debugLineNum = 3805;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else if(_dvalue<0) { 
 //BA.debugLineNum = 3807;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else {
 //BA.debugLineNum = 3809;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 };
 //BA.debugLineNum = 3811;BA.debugLine="End Sub";
return "";
}
public String  _expenditurerag(double _dvariance) throws Exception{
 //BA.debugLineNum = 3813;BA.debugLine="Public Sub ExpenditureRAG(dVariance As Double) As";
 //BA.debugLineNum = 3814;BA.debugLine="If dVariance > 0 Then";
if (_dvariance>0) { 
 //BA.debugLineNum = 3815;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else if(_dvariance<0) { 
 //BA.debugLineNum = 3817;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else if(_dvariance==0) { 
 //BA.debugLineNum = 3819;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 }else {
 //BA.debugLineNum = 3821;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 };
 //BA.debugLineNum = 3823;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _extractmap(anywheresoftware.b4a.objects.collections.Map _source,anywheresoftware.b4a.objects.collections.List _keys) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 1454;BA.debugLine="Sub ExtractMap(source As Map, keys As List) As Map";
 //BA.debugLineNum = 1455;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1456;BA.debugLine="For Each k As String In keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _keys;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1457;BA.debugLine="Dim v As Object = source.get(k)";
_v = _source.Get((Object)(_k));
 //BA.debugLineNum = 1458;BA.debugLine="nm.put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 1460;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 1461;BA.debugLine="End Sub";
return null;
}
public String  _facedone(int _dvalue) throws Exception{
 //BA.debugLineNum = 3912;BA.debugLine="Public Sub FaceDone(dValue As Int) As String";
 //BA.debugLineNum = 3913;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 100: {
 //BA.debugLineNum = 3915;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
 //BA.debugLineNum = 3917;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
 //BA.debugLineNum = 3919;BA.debugLine="End Sub";
return "";
}
public String  _facerag(int _dvalue) throws Exception{
 //BA.debugLineNum = 3877;BA.debugLine="Public Sub FaceRAG(dValue As Int) As String";
 //BA.debugLineNum = 3878;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 3880;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
case 1: {
 //BA.debugLineNum = 3882;BA.debugLine="Return \"./assets/neutralface.png\"";
if (true) return "./assets/neutralface.png";
 break; }
case 2: {
 //BA.debugLineNum = 3884;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
 //BA.debugLineNum = 3886;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
 //BA.debugLineNum = 3888;BA.debugLine="End Sub";
return "";
}
public String  _facerg(int _dvalue) throws Exception{
 //BA.debugLineNum = 3890;BA.debugLine="Public Sub FaceRG(dValue As Int) As String";
 //BA.debugLineNum = 3891;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 3893;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
case 1: {
 //BA.debugLineNum = 3895;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
 //BA.debugLineNum = 3897;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
 //BA.debugLineNum = 3899;BA.debugLine="End Sub";
return "";
}
public String  _facerg1(int _dvalue) throws Exception{
 //BA.debugLineNum = 3901;BA.debugLine="Public Sub FaceRG1(dValue As Int) As String";
 //BA.debugLineNum = 3902;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 1: {
 //BA.debugLineNum = 3904;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
case 0: {
 //BA.debugLineNum = 3906;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
 //BA.debugLineNum = 3908;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
 //BA.debugLineNum = 3910;BA.debugLine="End Sub";
return "";
}
public String  _fixrecords(anywheresoftware.b4a.objects.collections.List _recs,anywheresoftware.b4a.objects.collections.List _trimthese,anywheresoftware.b4a.objects.collections.List _numthese,anywheresoftware.b4a.objects.collections.List _boolthese,anywheresoftware.b4a.objects.collections.List _datethese,anywheresoftware.b4a.objects.collections.List _dblthese) throws Exception{
int _rtot = 0;
int _rcnt = 0;
anywheresoftware.b4a.objects.collections.Map _rec = null;
anywheresoftware.b4a.objects.collections.Map _nrec = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 2887;BA.debugLine="Sub FixRecords(recs As List, trimThese As List, nu";
 //BA.debugLineNum = 2888;BA.debugLine="Dim rTot As Int = recs.Size - 1";
_rtot = (int) (_recs.getSize()-1);
 //BA.debugLineNum = 2889;BA.debugLine="Dim rCnt As Int";
_rcnt = 0;
 //BA.debugLineNum = 2890;BA.debugLine="For rCnt = 0 To rTot";
{
final int step3 = 1;
final int limit3 = _rtot;
_rcnt = (int) (0) ;
for (;_rcnt <= limit3 ;_rcnt = _rcnt + step3 ) {
 //BA.debugLineNum = 2891;BA.debugLine="Dim rec As Map = recs.Get(rCnt)";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_recs.Get(_rcnt)));
 //BA.debugLineNum = 2893;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2894;BA.debugLine="For Each k As String In rec.keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _rec.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_k = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 2895;BA.debugLine="Dim v As Object = rec.Get(k)";
_v = _rec.Get((Object)(_k));
 //BA.debugLineNum = 2896;BA.debugLine="k = k.ToLowerCase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 2897;BA.debugLine="nrec.Put(k, v)";
_nrec.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 2899;BA.debugLine="If dateThese <> Null Then MakeDate(nrec,dateThes";
if (_datethese!= null) { 
_makedate(_nrec,_datethese);};
 //BA.debugLineNum = 2900;BA.debugLine="If trimThese <> Null Then MakeTrim(nrec,trimThes";
if (_trimthese!= null) { 
_maketrim(_nrec,_trimthese);};
 //BA.debugLineNum = 2901;BA.debugLine="If numThese <> Null Then MakeInteger(nrec, numTh";
if (_numthese!= null) { 
_makeinteger(_nrec,_numthese);};
 //BA.debugLineNum = 2902;BA.debugLine="If dblThese <> Null Then MakeDouble(nrec, dblThe";
if (_dblthese!= null) { 
_makedouble(_nrec,_dblthese);};
 //BA.debugLineNum = 2903;BA.debugLine="If boolThese <> Null Then MakeBoolean(nrec, bool";
if (_boolthese!= null) { 
_makeboolean(_nrec,_boolthese);};
 //BA.debugLineNum = 2904;BA.debugLine="recs.Set(rCnt, nrec)";
_recs.Set(_rcnt,(Object)(_nrec.getObject()));
 }
};
 //BA.debugLineNum = 2906;BA.debugLine="End Sub";
return "";
}
public String  _forceupdate() throws Exception{
String _fu = "";
String _dkey = "";
String _rkey = "";
 //BA.debugLineNum = 3380;BA.debugLine="Sub ForceUpdate";
 //BA.debugLineNum = 3381;BA.debugLine="Dim fu As String = \"$forceUpdate\"";
_fu = "$forceUpdate";
 //BA.debugLineNum = 3382;BA.debugLine="BOVue.RunMethod(fu, Null)";
_bovue.RunMethod(_fu,__c.Null);
 //BA.debugLineNum = 3384;BA.debugLine="Dim dKey As String = \"$data\"";
_dkey = "$data";
 //BA.debugLineNum = 3385;BA.debugLine="data = BOVue.GetField(dKey).Result";
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_bovue.GetField(_dkey).Result()));
 //BA.debugLineNum = 3387;BA.debugLine="Dim rKey As String = \"$refs\"";
_rkey = "$refs";
 //BA.debugLineNum = 3388;BA.debugLine="refs = BOVue.GetField(rKey)";
_refs = _bovue.GetField(_rkey);
 //BA.debugLineNum = 3389;BA.debugLine="End Sub";
return "";
}
public String  _formatfilesize(float _bytes) throws Exception{
String[] _unit = null;
double _po = 0;
double _si = 0;
int _i = 0;
 //BA.debugLineNum = 1632;BA.debugLine="Sub FormatFileSize(Bytes As Float) As String";
 //BA.debugLineNum = 1633;BA.debugLine="If BANAno.IsNull(Bytes) Or BANAno.IsUndefined(Byt";
if (_banano.IsNull((Object)(_bytes)) || _banano.IsUndefined((Object)(_bytes))) { 
 //BA.debugLineNum = 1634;BA.debugLine="Bytes = 0";
_bytes = (float) (0);
 };
 //BA.debugLineNum = 1636;BA.debugLine="Bytes = BANAno.parsefloat(Bytes)";
_bytes = (float) (_banano.parseFloat((Object)(_bytes)));
 //BA.debugLineNum = 1637;BA.debugLine="Try";
try { //BA.debugLineNum = 1638;BA.debugLine="Private Unit() As String = Array As String(\" Byt";
_unit = new String[]{" Byte"," KB"," MB"," GB"," TB"," PB"," EB"," ZB"," YB"};
 //BA.debugLineNum = 1639;BA.debugLine="If Bytes = 0 Then";
if (_bytes==0) { 
 //BA.debugLineNum = 1640;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 }else {
 //BA.debugLineNum = 1642;BA.debugLine="Private Po, Si As Double";
_po = 0;
_si = 0;
 //BA.debugLineNum = 1643;BA.debugLine="Private I As Int";
_i = 0;
 //BA.debugLineNum = 1644;BA.debugLine="Bytes = Abs(Bytes)";
_bytes = (float) (__c.Abs(_bytes));
 //BA.debugLineNum = 1645;BA.debugLine="I = Logarithm(Bytes, 1024)";
_i = (int) (__c.Logarithm(_bytes,1024));
 //BA.debugLineNum = 1646;BA.debugLine="i = Floor(I)";
_i = (int) (__c.Floor(_i));
 //BA.debugLineNum = 1647;BA.debugLine="Po = Power(1024, I)";
_po = __c.Power(1024,_i);
 //BA.debugLineNum = 1648;BA.debugLine="Si = Bytes / Po";
_si = _bytes/(double)_po;
 //BA.debugLineNum = 1649;BA.debugLine="Return NumberFormat2(Si,1,3,3,True) & Unit(I)";
if (true) return __c.NumberFormat2(_si,(int) (1),(int) (3),(int) (3),__c.True)+_unit[_i];
 };
 } 
       catch (Exception e20) {
			ba.setLastException(e20); //BA.debugLineNum = 1652;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 };
 //BA.debugLineNum = 1654;BA.debugLine="End Sub";
return "";
}
public String  _formattext(String _stext) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rm = null;
int _ktot = 0;
int _kcnt = 0;
String _strvalue = "";
String _strrep = "";
 //BA.debugLineNum = 849;BA.debugLine="Sub FormatText(sText As String) As String";
 //BA.debugLineNum = 850;BA.debugLine="Dim RM As Map";
_rm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 851;BA.debugLine="RM.Initialize";
_rm.Initialize();
 //BA.debugLineNum = 852;BA.debugLine="RM.clear";
_rm.Clear();
 //BA.debugLineNum = 853;BA.debugLine="RM.Put(\"{U}\", \"<ins>\")";
_rm.Put((Object)("{U}"),(Object)("<ins>"));
 //BA.debugLineNum = 854;BA.debugLine="RM.Put(\"{/U}\", \"</ins>\")";
_rm.Put((Object)("{/U}"),(Object)("</ins>"));
 //BA.debugLineNum = 855;BA.debugLine="RM.Put(\"¢\",\"&cent;\")";
_rm.Put((Object)("¢"),(Object)("&cent;"));
 //BA.debugLineNum = 856;BA.debugLine="RM.put(\"£\",\"&pound;\")";
_rm.Put((Object)("£"),(Object)("&pound;"));
 //BA.debugLineNum = 857;BA.debugLine="RM.Put(\"{SUP}\", \"<sup>\")";
_rm.Put((Object)("{SUP}"),(Object)("<sup>"));
 //BA.debugLineNum = 858;BA.debugLine="RM.Put(\"{/SUP}\", \"</sup>\")";
_rm.Put((Object)("{/SUP}"),(Object)("</sup>"));
 //BA.debugLineNum = 859;BA.debugLine="RM.Put(\"¥\",\"&yen;\")";
_rm.Put((Object)("¥"),(Object)("&yen;"));
 //BA.debugLineNum = 860;BA.debugLine="RM.Put(\"€\",\"&euro;\")";
_rm.Put((Object)("€"),(Object)("&euro;"));
 //BA.debugLineNum = 861;BA.debugLine="RM.put(\"©\",\"&copy;\")";
_rm.Put((Object)("©"),(Object)("&copy;"));
 //BA.debugLineNum = 862;BA.debugLine="RM.Put(\"®\",\"&reg;\")";
_rm.Put((Object)("®"),(Object)("&reg;"));
 //BA.debugLineNum = 863;BA.debugLine="RM.Put(\"{POUND}\",\"&pound;\")";
_rm.Put((Object)("{POUND}"),(Object)("&pound;"));
 //BA.debugLineNum = 864;BA.debugLine="RM.Put(\"{/B}\", \"</b>\")";
_rm.Put((Object)("{/B}"),(Object)("</b>"));
 //BA.debugLineNum = 865;BA.debugLine="RM.Put(\"{I}\", \"<i>\")";
_rm.Put((Object)("{I}"),(Object)("<i>"));
 //BA.debugLineNum = 866;BA.debugLine="RM.Put(\"{YEN}\",\"&yen;\")";
_rm.Put((Object)("{YEN}"),(Object)("&yen;"));
 //BA.debugLineNum = 867;BA.debugLine="RM.Put(\"{EURO}\",\"&euro;\")";
_rm.Put((Object)("{EURO}"),(Object)("&euro;"));
 //BA.debugLineNum = 868;BA.debugLine="RM.Put(\"{CODE}\",\"<code>\")";
_rm.Put((Object)("{CODE}"),(Object)("<code>"));
 //BA.debugLineNum = 869;BA.debugLine="RM.Put(\"{/CODE}\",\"</code>\")";
_rm.Put((Object)("{/CODE}"),(Object)("</code>"));
 //BA.debugLineNum = 870;BA.debugLine="RM.put(\"{COPYRIGHT}\",\"&copy;\")";
_rm.Put((Object)("{COPYRIGHT}"),(Object)("&copy;"));
 //BA.debugLineNum = 871;BA.debugLine="RM.Put(\"{REGISTERED}\",\"&reg;\")";
_rm.Put((Object)("{REGISTERED}"),(Object)("&reg;"));
 //BA.debugLineNum = 872;BA.debugLine="RM.Put(\"®\", \"&reg;\")";
_rm.Put((Object)("®"),(Object)("&reg;"));
 //BA.debugLineNum = 873;BA.debugLine="RM.Put(\"{B}\", \"<b>\")";
_rm.Put((Object)("{B}"),(Object)("<b>"));
 //BA.debugLineNum = 874;BA.debugLine="RM.Put(\"{SMALL}\", \"<small>\")";
_rm.Put((Object)("{SMALL}"),(Object)("<small>"));
 //BA.debugLineNum = 875;BA.debugLine="RM.Put(\"{/SMALL}\", \"</small>\")";
_rm.Put((Object)("{/SMALL}"),(Object)("</small>"));
 //BA.debugLineNum = 876;BA.debugLine="RM.Put(\"{EM}\", \"<em>\")";
_rm.Put((Object)("{EM}"),(Object)("<em>"));
 //BA.debugLineNum = 877;BA.debugLine="RM.Put(\"{/EM}\", \"</em>\")";
_rm.Put((Object)("{/EM}"),(Object)("</em>"));
 //BA.debugLineNum = 878;BA.debugLine="RM.Put(\"{MARK}\", \"<mark>\")";
_rm.Put((Object)("{MARK}"),(Object)("<mark>"));
 //BA.debugLineNum = 879;BA.debugLine="RM.Put(\"{/MARK}\", \"</mark>\")";
_rm.Put((Object)("{/MARK}"),(Object)("</mark>"));
 //BA.debugLineNum = 880;BA.debugLine="RM.Put(\"{/I}\", \"</i>\")";
_rm.Put((Object)("{/I}"),(Object)("</i>"));
 //BA.debugLineNum = 881;BA.debugLine="RM.Put(\"{SUB}\", \"<sub>\")";
_rm.Put((Object)("{SUB}"),(Object)("<sub>"));
 //BA.debugLineNum = 882;BA.debugLine="RM.Put(\"{/SUB}\", \"</sub>\")";
_rm.Put((Object)("{/SUB}"),(Object)("</sub>"));
 //BA.debugLineNum = 883;BA.debugLine="RM.Put(\"{BR}\", \"<br/>\")";
_rm.Put((Object)("{BR}"),(Object)("<br/>"));
 //BA.debugLineNum = 884;BA.debugLine="RM.Put(\"{WBR}\",\"<wbr>\")";
_rm.Put((Object)("{WBR}"),(Object)("<wbr>"));
 //BA.debugLineNum = 885;BA.debugLine="RM.Put(\"{STRONG}\", \"<strong>\")";
_rm.Put((Object)("{STRONG}"),(Object)("<strong>"));
 //BA.debugLineNum = 886;BA.debugLine="RM.Put(\"{/STRONG}\", \"</strong>\")";
_rm.Put((Object)("{/STRONG}"),(Object)("</strong>"));
 //BA.debugLineNum = 887;BA.debugLine="RM.Put(\"{NBSP}\", \"&nbsp;\")";
_rm.Put((Object)("{NBSP}"),(Object)("&nbsp;"));
 //BA.debugLineNum = 888;BA.debugLine="RM.Put(\"“\",\"\")";
_rm.Put((Object)("“"),(Object)(""));
 //BA.debugLineNum = 889;BA.debugLine="RM.Put(\"”\",\"\")";
_rm.Put((Object)("”"),(Object)(""));
 //BA.debugLineNum = 890;BA.debugLine="RM.Put(\"’\",\"'\")";
_rm.Put((Object)("’"),(Object)("'"));
 //BA.debugLineNum = 891;BA.debugLine="Dim kTot As Int = RM.Size - 1";
_ktot = (int) (_rm.getSize()-1);
 //BA.debugLineNum = 892;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 893;BA.debugLine="For kCnt = 0 To kTot";
{
final int step44 = 1;
final int limit44 = _ktot;
_kcnt = (int) (0) ;
for (;_kcnt <= limit44 ;_kcnt = _kcnt + step44 ) {
 //BA.debugLineNum = 894;BA.debugLine="Dim strValue As String = RM.GetKeyAt(kCnt)";
_strvalue = BA.ObjectToString(_rm.GetKeyAt(_kcnt));
 //BA.debugLineNum = 895;BA.debugLine="Dim strRep As String = RM.Get(strValue)";
_strrep = BA.ObjectToString(_rm.Get((Object)(_strvalue)));
 //BA.debugLineNum = 896;BA.debugLine="sText = sText.Replace(strValue, strRep)";
_stext = _stext.replace(_strvalue,_strrep);
 }
};
 //BA.debugLineNum = 898;BA.debugLine="sText = BANAno.SF(sText)";
_stext = _banano.SF(_stext);
 //BA.debugLineNum = 899;BA.debugLine="Return sText";
if (true) return _stext;
 //BA.debugLineNum = 900;BA.debugLine="End Sub";
return "";
}
public String  _gar(int _dvalue) throws Exception{
 //BA.debugLineNum = 3851;BA.debugLine="Public Sub GAR(dValue As Int) As String";
 //BA.debugLineNum = 3852;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 3854;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
case 1: {
 //BA.debugLineNum = 3856;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
 //BA.debugLineNum = 3858;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
default: {
 //BA.debugLineNum = 3860;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
 //BA.debugLineNum = 3862;BA.debugLine="End Sub";
return "";
}
public String  _generatepassword(int _intnum) throws Exception{
 //BA.debugLineNum = 1951;BA.debugLine="Sub GeneratePassword(IntNum As Int) As String";
 //BA.debugLineNum = 1952;BA.debugLine="Return RandomString(IntNum,True,True,True,\"\")";
if (true) return _randomstring(_intnum,__c.True,__c.True,__c.True,"");
 //BA.debugLineNum = 1953;BA.debugLine="End Sub";
return "";
}
public String  _getalphabets(String _value) throws Exception{
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
 //BA.debugLineNum = 1426;BA.debugLine="Public Sub GetAlphabets(value As String) As String";
 //BA.debugLineNum = 1427;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 1428;BA.debugLine="Try";
try { //BA.debugLineNum = 1429;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 1430;BA.debugLine="If value = \"\" Then value = \"\"";
if ((_value).equals("")) { 
_value = "";};
 //BA.debugLineNum = 1431;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
 //BA.debugLineNum = 1432;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
 //BA.debugLineNum = 1433;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
 //BA.debugLineNum = 1434;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 1435;BA.debugLine="For i = 0 To slen - 1";
{
final int step9 = 1;
final int limit9 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 1436;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
 //BA.debugLineNum = 1437;BA.debugLine="If InStr(\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJK";
if (_instr("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ",_mout)!=-1) { 
 //BA.debugLineNum = 1438;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
 //BA.debugLineNum = 1441;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 1443;BA.debugLine="Return value";
if (true) return _value;
 };
 //BA.debugLineNum = 1445;BA.debugLine="End Sub";
return "";
}
public String  _getalphanumeric(String _value) throws Exception{
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
 //BA.debugLineNum = 1404;BA.debugLine="Sub GetAlphaNumeric(value As String) As String";
 //BA.debugLineNum = 1405;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 1406;BA.debugLine="Try";
try { //BA.debugLineNum = 1407;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 1408;BA.debugLine="If value = \"\" Then value = \"\"";
if ((_value).equals("")) { 
_value = "";};
 //BA.debugLineNum = 1409;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
 //BA.debugLineNum = 1410;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
 //BA.debugLineNum = 1411;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
 //BA.debugLineNum = 1412;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 1413;BA.debugLine="For i = 0 To slen - 1";
{
final int step9 = 1;
final int limit9 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 1414;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
 //BA.debugLineNum = 1415;BA.debugLine="If InStr(\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJK";
if (_instr("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789",_mout)!=-1) { 
 //BA.debugLineNum = 1416;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
 //BA.debugLineNum = 1419;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 1421;BA.debugLine="Return value";
if (true) return _value;
 };
 //BA.debugLineNum = 1423;BA.debugLine="End Sub";
return "";
}
public String  _getcolorhex(String _scolor) throws Exception{
String _xcolor = "";
 //BA.debugLineNum = 2461;BA.debugLine="Sub GetColorHex(sColor As String) As String";
 //BA.debugLineNum = 2462;BA.debugLine="sColor = sColor.tolowercase";
_scolor = _scolor.toLowerCase();
 //BA.debugLineNum = 2463;BA.debugLine="If ColorMap.ContainsKey(sColor) Then";
if (_colormap.ContainsKey((Object)(_scolor))) { 
 //BA.debugLineNum = 2464;BA.debugLine="Dim xColor As String = ColorMap.Get(sColor)";
_xcolor = BA.ObjectToString(_colormap.Get((Object)(_scolor)));
 //BA.debugLineNum = 2465;BA.debugLine="Return xColor";
if (true) return _xcolor;
 };
 //BA.debugLineNum = 2467;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 2468;BA.debugLine="End Sub";
return "";
}
public Object  _getdata(String _prop) throws Exception{
Object _obj = null;
 //BA.debugLineNum = 1189;BA.debugLine="Sub GetData(prop As String) As Object";
 //BA.debugLineNum = 1190;BA.debugLine="Dim obj As Object = GetState(prop, Null)";
_obj = _getstate(_prop,__c.Null);
 //BA.debugLineNum = 1191;BA.debugLine="Return obj";
if (true) return _obj;
 //BA.debugLineNum = 1192;BA.debugLine="End Sub";
return null;
}
public Object  _getdataglobal(String _prop) throws Exception{
Object _rslt = null;
com.ab.banano.BANanoObject _bo = null;
 //BA.debugLineNum = 723;BA.debugLine="Sub GetDataGlobal(prop As String) As Object";
 //BA.debugLineNum = 724;BA.debugLine="prop = prop.tolowercase";
_prop = _prop.toLowerCase();
 //BA.debugLineNum = 725;BA.debugLine="Dim rslt As Object";
_rslt = new Object();
 //BA.debugLineNum = 726;BA.debugLine="rslt = state.GetDefault(prop, Null)";
_rslt = _state.GetDefault((Object)(_prop),__c.Null);
 //BA.debugLineNum = 727;BA.debugLine="Try";
try { //BA.debugLineNum = 728;BA.debugLine="Dim bo As BANanoObject = store.GetField(prop)";
_bo = new com.ab.banano.BANanoObject();
_bo = _store.GetField(_prop);
 //BA.debugLineNum = 729;BA.debugLine="If BANAno.IsNull(bo) Then Return Me";
if (_banano.IsNull((Object)(_bo.getObject()))) { 
if (true) return this;};
 //BA.debugLineNum = 730;BA.debugLine="If BANAno.IsUndefined(bo) Then Return Me";
if (_banano.IsUndefined((Object)(_bo.getObject()))) { 
if (true) return this;};
 //BA.debugLineNum = 731;BA.debugLine="rslt = store.GetField(prop)";
_rslt = (Object)(_store.GetField(_prop).getObject());
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 733;BA.debugLine="Log($\"Error - VueApp.GetDataGlobal: ${prop}\"$)";
__c.Log(("Error - VueApp.GetDataGlobal: "+__c.SmartStringFormatter("",(Object)(_prop))+""));
 };
 //BA.debugLineNum = 735;BA.debugLine="Return rslt";
if (true) return _rslt;
 //BA.debugLineNum = 736;BA.debugLine="End Sub";
return null;
}
public boolean  _getdisabledstate(String _k) throws Exception{
String _diskey = "";
 //BA.debugLineNum = 2280;BA.debugLine="Sub GetDisabledState(k As String) As Boolean";
 //BA.debugLineNum = 2281;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"disabled");
 //BA.debugLineNum = 2282;BA.debugLine="Return GetState(disKey,False)";
if (true) return BA.ObjectToBoolean(_getstate(_diskey,(Object)(__c.False)));
 //BA.debugLineNum = 2283;BA.debugLine="End Sub";
return false;
}
public com.ab.banano.BANanoObject  _getelementbyid(String _sid) throws Exception{
 //BA.debugLineNum = 1166;BA.debugLine="Sub getElementById(sid As String) As BANanoObject";
 //BA.debugLineNum = 1167;BA.debugLine="Dim el As BANanoObject = BANAno.Window.GetField(\"";
_el = new com.ab.banano.BANanoObject();
_el = _banano.Window().GetField("document").RunMethod("getElementById",(Object)(new Object[]{(Object)(_sid)}));
 //BA.debugLineNum = 1168;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1169;BA.debugLine="End Sub";
return null;
}
public String  _geterror() throws Exception{
String _strerror = "";
 //BA.debugLineNum = 2760;BA.debugLine="Sub GetError As String";
 //BA.debugLineNum = 2761;BA.debugLine="Dim strError As String = Errors.GetValueAt(0)";
_strerror = BA.ObjectToString(_errors.GetValueAt((int) (0)));
 //BA.debugLineNum = 2762;BA.debugLine="Return strError";
if (true) return _strerror;
 //BA.debugLineNum = 2763;BA.debugLine="End Sub";
return "";
}
public String  _geteventtargetproperty(com.ab.banano.BANanoEvent _e,String _prop) throws Exception{
String _sid = "";
 //BA.debugLineNum = 3059;BA.debugLine="Sub GetEventTargetProperty(e As BANanoEvent, prop";
 //BA.debugLineNum = 3060;BA.debugLine="Dim sid As String = e.OtherField(\"target\").GetFie";
_sid = BA.ObjectToString(_e.OtherField("target").GetField(_prop).Result());
 //BA.debugLineNum = 3061;BA.debugLine="Return sid";
if (true) return _sid;
 //BA.debugLineNum = 3062;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananoshared._fileobject  _getfiledetails(anywheresoftware.b4a.objects.collections.Map _fileobj) throws Exception{
String _sname = "";
com.ab.banano.BANanoObject _slastmodifieddate = null;
String _ssize = "";
String _stype = "";
String _yyyy = "";
String _dd = "";
String _mm = "";
String _hh = "";
String _minutes = "";
String _fd = "";
b4j.example.bananoshared._fileobject _ff = null;
 //BA.debugLineNum = 1292;BA.debugLine="Sub GetFileDetails(fileObj As Map) As FileObject";
 //BA.debugLineNum = 1293;BA.debugLine="Dim sname As String = fileObj.Get(\"name\")";
_sname = BA.ObjectToString(_fileobj.Get((Object)("name")));
 //BA.debugLineNum = 1294;BA.debugLine="Dim slastModifiedDate As BANanoObject = fileObj.G";
_slastmodifieddate = new com.ab.banano.BANanoObject();
_slastmodifieddate = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_fileobj.Get((Object)("lastModifiedDate"))));
 //BA.debugLineNum = 1295;BA.debugLine="Dim ssize As String = fileObj.Get(\"size\")";
_ssize = BA.ObjectToString(_fileobj.Get((Object)("size")));
 //BA.debugLineNum = 1296;BA.debugLine="Dim stype As String = fileObj.Get(\"type\")";
_stype = BA.ObjectToString(_fileobj.Get((Object)("type")));
 //BA.debugLineNum = 1298;BA.debugLine="Dim yyyy As String = slastModifiedDate.RunMethod(";
_yyyy = BA.ObjectToString(_slastmodifieddate.RunMethod("getFullYear",__c.Null).Result());
 //BA.debugLineNum = 1299;BA.debugLine="Dim dd As String = slastModifiedDate.RunMethod(\"g";
_dd = BA.ObjectToString(_slastmodifieddate.RunMethod("getDate",__c.Null).Result());
 //BA.debugLineNum = 1300;BA.debugLine="Dim mm As String = slastModifiedDate.RunMethod(\"g";
_mm = BA.ObjectToString(_slastmodifieddate.RunMethod("getMonth",__c.Null).Result());
 //BA.debugLineNum = 1301;BA.debugLine="Dim hh As String = slastModifiedDate.RunMethod(\"g";
_hh = BA.ObjectToString(_slastmodifieddate.RunMethod("getHours",__c.Null).Result());
 //BA.debugLineNum = 1302;BA.debugLine="Dim minutes As String = slastModifiedDate.RunMeth";
_minutes = BA.ObjectToString(_slastmodifieddate.RunMethod("getMinutes",__c.Null).Result());
 //BA.debugLineNum = 1304;BA.debugLine="dd = PadRight(dd, 2, \"0\")";
_dd = _padright(_dd,(int) (2),"0");
 //BA.debugLineNum = 1305;BA.debugLine="mm = PadRight(mm, 2, \"0\")";
_mm = _padright(_mm,(int) (2),"0");
 //BA.debugLineNum = 1306;BA.debugLine="hh = PadRight(hh, 2, \"0\")";
_hh = _padright(_hh,(int) (2),"0");
 //BA.debugLineNum = 1307;BA.debugLine="minutes = PadRight(minutes, 2, \"0\")";
_minutes = _padright(_minutes,(int) (2),"0");
 //BA.debugLineNum = 1309;BA.debugLine="Dim fd As String = $\"${yyyy}-${mm}-${dd} ${hh}:${";
_fd = (""+__c.SmartStringFormatter("",(Object)(_yyyy))+"-"+__c.SmartStringFormatter("",(Object)(_mm))+"-"+__c.SmartStringFormatter("",(Object)(_dd))+" "+__c.SmartStringFormatter("",(Object)(_hh))+":"+__c.SmartStringFormatter("",(Object)(_minutes))+"");
 //BA.debugLineNum = 1312;BA.debugLine="Dim ff As FileObject";
_ff = new b4j.example.bananoshared._fileobject();
 //BA.debugLineNum = 1313;BA.debugLine="ff.Initialize";
_ff.Initialize();
 //BA.debugLineNum = 1314;BA.debugLine="ff.FileName = sname";
_ff.FileName /*String*/  = _sname;
 //BA.debugLineNum = 1315;BA.debugLine="ff.FileDate = fd";
_ff.FileDate /*String*/  = _fd;
 //BA.debugLineNum = 1316;BA.debugLine="ff.FileSize = ssize";
_ff.FileSize /*long*/  = (long)(Double.parseDouble(_ssize));
 //BA.debugLineNum = 1317;BA.debugLine="ff.FileType = stype";
_ff.FileType /*String*/  = _stype;
 //BA.debugLineNum = 1318;BA.debugLine="Return ff";
if (true) return _ff;
 //BA.debugLineNum = 1319;BA.debugLine="End Sub";
return null;
}
public String  _getfileext(String _fullpath) throws Exception{
 //BA.debugLineNum = 2866;BA.debugLine="Sub GetFileExt(FullPath As String) As String";
 //BA.debugLineNum = 2867;BA.debugLine="Return FullPath.SubString(FullPath.LastIndexOf(\".";
if (true) return _fullpath.substring((int) (_fullpath.lastIndexOf(".")+1));
 //BA.debugLineNum = 2868;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getfilelistfromtarget(com.ab.banano.BANanoEvent _e) throws Exception{
anywheresoftware.b4a.objects.collections.List _files = null;
 //BA.debugLineNum = 3064;BA.debugLine="Sub GetFileListFromTarget(e As BANanoEvent) As Lis";
 //BA.debugLineNum = 3065;BA.debugLine="Dim files As List = e.OtherField(\"target\").GetFie";
_files = new anywheresoftware.b4a.objects.collections.List();
_files = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e.OtherField("target").GetField("files").Result()));
 //BA.debugLineNum = 3066;BA.debugLine="Return files";
if (true) return _files;
 //BA.debugLineNum = 3067;BA.debugLine="End Sub";
return null;
}
public String  _getfileparentpath(String _path) throws Exception{
String _path1 = "";
int _l = 0;
 //BA.debugLineNum = 2846;BA.debugLine="Sub GetFileParentPath(Path As String) As String";
 //BA.debugLineNum = 2847;BA.debugLine="Dim Path1 As String";
_path1 = "";
 //BA.debugLineNum = 2848;BA.debugLine="Dim L As Int";
_l = 0;
 //BA.debugLineNum = 2849;BA.debugLine="If Path = \"/\" Then";
if ((_path).equals("/")) { 
 //BA.debugLineNum = 2850;BA.debugLine="Return \"/\"";
if (true) return "/";
 };
 //BA.debugLineNum = 2852;BA.debugLine="L = Path.LastIndexOf(\"/\")";
_l = _path.lastIndexOf("/");
 //BA.debugLineNum = 2853;BA.debugLine="If L = Path.Length - 1 Then";
if (_l==_path.length()-1) { 
 //BA.debugLineNum = 2855;BA.debugLine="Path1 = Path.SubString2(0,L)";
_path1 = _path.substring((int) (0),_l);
 }else {
 //BA.debugLineNum = 2857;BA.debugLine="Path1 = Path";
_path1 = _path;
 };
 //BA.debugLineNum = 2859;BA.debugLine="L = Path.LastIndexOf(\"/\")";
_l = _path.lastIndexOf("/");
 //BA.debugLineNum = 2860;BA.debugLine="If L = 0 Then";
if (_l==0) { 
 //BA.debugLineNum = 2861;BA.debugLine="L = 1";
_l = (int) (1);
 };
 //BA.debugLineNum = 2863;BA.debugLine="Return Path1.SubString2(0,L)";
if (true) return _path1.substring((int) (0),_l);
 //BA.debugLineNum = 2864;BA.debugLine="End Sub";
return "";
}
public Object  _getglobalstate(String _prop) throws Exception{
Object _rslt = null;
 //BA.debugLineNum = 717;BA.debugLine="private Sub getglobalstate(prop As String) As Obje";
 //BA.debugLineNum = 718;BA.debugLine="prop = prop.tolowercase";
_prop = _prop.toLowerCase();
 //BA.debugLineNum = 719;BA.debugLine="Dim rslt As Object = GetDataGlobal(prop)";
_rslt = _getdataglobal(_prop);
 //BA.debugLineNum = 720;BA.debugLine="Return rslt";
if (true) return _rslt;
 //BA.debugLineNum = 721;BA.debugLine="End Sub";
return null;
}
public String  _getidfromevent(com.ab.banano.BANanoEvent _e) throws Exception{
com.ab.banano.BANanoElement _cureve = null;
String _id = "";
 //BA.debugLineNum = 3046;BA.debugLine="Sub GetIDFromEvent(e As BANanoEvent) As String";
 //BA.debugLineNum = 3047;BA.debugLine="Dim curEve As BANanoElement = BANAno.ToElement(e.";
_cureve = new com.ab.banano.BANanoElement();
_cureve = _banano.ToElement(_e.OtherField("currentTarget"));
 //BA.debugLineNum = 3048;BA.debugLine="Dim id As String = curEve.GetField(\"id\").Result";
_id = BA.ObjectToString(_cureve.GetField("id").Result());
 //BA.debugLineNum = 3049;BA.debugLine="Return id";
if (true) return _id;
 //BA.debugLineNum = 3050;BA.debugLine="End Sub";
return "";
}
public String  _getkeyfromevent(com.ab.banano.BANanoEvent _e) throws Exception{
com.ab.banano.BANanoElement _cureve = null;
String _id = "";
 //BA.debugLineNum = 3053;BA.debugLine="Sub GetKeyFromEvent(e As BANanoEvent) As String";
 //BA.debugLineNum = 3054;BA.debugLine="Dim curEve As BANanoElement = BANAno.ToElement(e.";
_cureve = new com.ab.banano.BANanoElement();
_cureve = _banano.ToElement(_e.OtherField("currentTarget"));
 //BA.debugLineNum = 3055;BA.debugLine="Dim id As String = curEve.GetField(\"key\").Result";
_id = BA.ObjectToString(_cureve.GetField("key").Result());
 //BA.debugLineNum = 3056;BA.debugLine="Return id";
if (true) return _id;
 //BA.debugLineNum = 3057;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getlistofmapsproperty(anywheresoftware.b4a.objects.collections.List _lst,String _prop) throws Exception{
anywheresoftware.b4a.objects.collections.List _kc = null;
anywheresoftware.b4a.objects.collections.Map _rec = null;
String _v = "";
 //BA.debugLineNum = 1677;BA.debugLine="Sub GetListOfMapsProperty(lst As List, prop As Str";
 //BA.debugLineNum = 1678;BA.debugLine="prop = prop.tolowercase";
_prop = _prop.toLowerCase();
 //BA.debugLineNum = 1679;BA.debugLine="Dim kc As List";
_kc = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1680;BA.debugLine="kc.initialize";
_kc.Initialize();
 //BA.debugLineNum = 1681;BA.debugLine="For Each rec As Map In lst";
_rec = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = _lst;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_rec = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group4.Get(index4)));
 //BA.debugLineNum = 1682;BA.debugLine="Dim v As String = rec.Get(prop)";
_v = BA.ObjectToString(_rec.Get((Object)(_prop)));
 //BA.debugLineNum = 1683;BA.debugLine="kc.add(v)";
_kc.Add((Object)(_v));
 }
};
 //BA.debugLineNum = 1685;BA.debugLine="Return kc";
if (true) return _kc;
 //BA.debugLineNum = 1686;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapkeys(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
Object _value = null;
 //BA.debugLineNum = 2219;BA.debugLine="Sub GetMapKeys(sourceMap As Map) As List";
 //BA.debugLineNum = 2220;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2221;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 2222;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 2223;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 2224;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 2225;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 2226;BA.debugLine="Dim value As Object = sourceMap.GetKeyAt(iCnt)";
_value = _sourcemap.GetKeyAt(_icnt);
 //BA.debugLineNum = 2227;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
 //BA.debugLineNum = 2229;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 2230;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapvalues(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
Object _value = null;
 //BA.debugLineNum = 2205;BA.debugLine="Sub GetMapValues(sourceMap As Map) As List";
 //BA.debugLineNum = 2206;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2207;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 2208;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 2209;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 2210;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 2211;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 2212;BA.debugLine="Dim value As Object = sourceMap.GetValueAt(iCnt)";
_value = _sourcemap.GetValueAt(_icnt);
 //BA.debugLineNum = 2213;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
 //BA.debugLineNum = 2215;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 2216;BA.debugLine="End Sub";
return null;
}
public String  _getnumbers(String _value) throws Exception{
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
 //BA.debugLineNum = 2234;BA.debugLine="Public Sub GetNumbers(value As String) As String";
 //BA.debugLineNum = 2235;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 2236;BA.debugLine="Try";
try { //BA.debugLineNum = 2237;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 2238;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
 //BA.debugLineNum = 2239;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
 //BA.debugLineNum = 2240;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
 //BA.debugLineNum = 2241;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 2242;BA.debugLine="For i = 0 To slen - 1";
{
final int step8 = 1;
final int limit8 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 2243;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
 //BA.debugLineNum = 2244;BA.debugLine="If InStr(\"0123456789.-\", mout) <> -1 Then";
if (_instr("0123456789.-",_mout)!=-1) { 
 //BA.debugLineNum = 2245;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
 //BA.debugLineNum = 2248;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 2250;BA.debugLine="Return value";
if (true) return _value;
 };
 //BA.debugLineNum = 2252;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getoptionsfromkv(String _delim,String _k,String _v) throws Exception{
anywheresoftware.b4a.objects.collections.Map _no = null;
String[] _rkeys = null;
String[] _rvalues = null;
int _rtot = 0;
int _vtot = 0;
int _rcnt = 0;
String _k1 = "";
String _v1 = "";
 //BA.debugLineNum = 4013;BA.debugLine="Sub GetOptionsFromKV(delim As String, k As String,";
 //BA.debugLineNum = 4014;BA.debugLine="k = CStr(k)";
_k = _cstr((Object)(_k));
 //BA.debugLineNum = 4015;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 4016;BA.debugLine="Dim no As Map = CreateMap()";
_no = new anywheresoftware.b4a.objects.collections.Map();
_no = __c.createMap(new Object[] {});
 //BA.debugLineNum = 4017;BA.debugLine="Dim rkeys() As String = BANAno.Split(delim, k)";
_rkeys = _banano.Split(_delim,_k);
 //BA.debugLineNum = 4018;BA.debugLine="Dim rvalues() As String = BANAno.Split(delim, v)";
_rvalues = _banano.Split(_delim,_v);
 //BA.debugLineNum = 4020;BA.debugLine="Dim rTot As Int = rkeys.Length - 1";
_rtot = (int) (_rkeys.length-1);
 //BA.debugLineNum = 4021;BA.debugLine="Dim vTot As Int = rvalues.Length - 1";
_vtot = (int) (_rvalues.length-1);
 //BA.debugLineNum = 4023;BA.debugLine="If rTot <> vTot Then Return no";
if (_rtot!=_vtot) { 
if (true) return _no;};
 //BA.debugLineNum = 4025;BA.debugLine="Dim rCnt As Int";
_rcnt = 0;
 //BA.debugLineNum = 4026;BA.debugLine="For rCnt = 0 To rTot";
{
final int step10 = 1;
final int limit10 = _rtot;
_rcnt = (int) (0) ;
for (;_rcnt <= limit10 ;_rcnt = _rcnt + step10 ) {
 //BA.debugLineNum = 4027;BA.debugLine="Dim k1 As String = rkeys(rCnt)";
_k1 = _rkeys[_rcnt];
 //BA.debugLineNum = 4028;BA.debugLine="Dim v1 As String = rvalues(rCnt)";
_v1 = _rvalues[_rcnt];
 //BA.debugLineNum = 4029;BA.debugLine="no.put(k1, v1)";
_no.Put((Object)(_k1),(Object)(_v1));
 }
};
 //BA.debugLineNum = 4031;BA.debugLine="Return no";
if (true) return _no;
 //BA.debugLineNum = 4032;BA.debugLine="End Sub";
return null;
}
public String  _getreadystate() throws Exception{
String _rs = "";
 //BA.debugLineNum = 903;BA.debugLine="Sub GetReadyState As String";
 //BA.debugLineNum = 904;BA.debugLine="Dim rs As String = BANAno.Window.GetField(\"docume";
_rs = BA.ObjectToString(_banano.Window().GetField("document").GetField("readyState").Result());
 //BA.debugLineNum = 905;BA.debugLine="Return rs";
if (true) return _rs;
 //BA.debugLineNum = 906;BA.debugLine="End Sub";
return "";
}
public boolean  _getrequiredstate(String _k) throws Exception{
String _diskey = "";
 //BA.debugLineNum = 2968;BA.debugLine="Sub GetRequiredState(k As String) As Boolean";
 //BA.debugLineNum = 2969;BA.debugLine="Dim disKey As String = $\"${k}required\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"required");
 //BA.debugLineNum = 2970;BA.debugLine="Return GetState(disKey,False)";
if (true) return BA.ObjectToBoolean(_getstate(_diskey,(Object)(__c.False)));
 //BA.debugLineNum = 2971;BA.debugLine="End Sub";
return false;
}
public boolean  _getshowstate(String _k) throws Exception{
String _showkey = "";
 //BA.debugLineNum = 2275;BA.debugLine="Sub GetShowState(k As String) As Boolean";
 //BA.debugLineNum = 2276;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"show");
 //BA.debugLineNum = 2277;BA.debugLine="Return GetState(showKey,False)";
if (true) return BA.ObjectToBoolean(_getstate(_showkey,(Object)(__c.False)));
 //BA.debugLineNum = 2278;BA.debugLine="End Sub";
return false;
}
public String  _getsourcecode() throws Exception{
 //BA.debugLineNum = 984;BA.debugLine="Sub GetSourceCode As String";
 //BA.debugLineNum = 985;BA.debugLine="Return SourceCode.tostring";
if (true) return _sourcecode.ToString();
 //BA.debugLineNum = 986;BA.debugLine="End Sub";
return "";
}
public Object  _getstate(String _k,Object _v) throws Exception{
Object _out = null;
 //BA.debugLineNum = 3651;BA.debugLine="Sub GetState(k As String, v As Object) As Object";
 //BA.debugLineNum = 3652;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 3653;BA.debugLine="If data.ContainsKey(k) Then";
if (_data.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 3654;BA.debugLine="Dim out As Object = data.GetDefault(k,v)";
_out = _data.GetDefault((Object)(_k),_v);
 //BA.debugLineNum = 3655;BA.debugLine="Return out";
if (true) return _out;
 }else {
 //BA.debugLineNum = 3657;BA.debugLine="Log(\"GetState: First set the v-model for \" & k)";
__c.Log("GetState: First set the v-model for "+_k);
 //BA.debugLineNum = 3658;BA.debugLine="Return \"\"";
if (true) return (Object)("");
 };
 //BA.debugLineNum = 3660;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getstates(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.Map _sm = null;
String _lstrec = "";
Object _xstate = null;
 //BA.debugLineNum = 3627;BA.debugLine="Sub GetStates(lst As List) As Map";
 //BA.debugLineNum = 3628;BA.debugLine="Dim sm As Map = CreateMap()";
_sm = new anywheresoftware.b4a.objects.collections.Map();
_sm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 3629;BA.debugLine="For Each lstrec As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lstrec = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 3630;BA.debugLine="lstrec = lstrec.tolowercase";
_lstrec = _lstrec.toLowerCase();
 //BA.debugLineNum = 3631;BA.debugLine="Dim xstate As Object = GetState(lstrec, Null)";
_xstate = _getstate(_lstrec,__c.Null);
 //BA.debugLineNum = 3632;BA.debugLine="sm.Put(lstrec, xstate)";
_sm.Put((Object)(_lstrec),_xstate);
 }
};
 //BA.debugLineNum = 3634;BA.debugLine="Return sm";
if (true) return _sm;
 //BA.debugLineNum = 3635;BA.debugLine="End Sub";
return null;
}
public boolean  _hasstate(String _k) throws Exception{
 //BA.debugLineNum = 3622;BA.debugLine="Sub HasState(k As String) As Boolean";
 //BA.debugLineNum = 3623;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 3624;BA.debugLine="Return data.ContainsKey(k)";
if (true) return _data.ContainsKey((Object)(_k));
 //BA.debugLineNum = 3625;BA.debugLine="End Sub";
return false;
}
public String  _hide(String _elid) throws Exception{
 //BA.debugLineNum = 4003;BA.debugLine="Sub Hide(elID As String)";
 //BA.debugLineNum = 4004;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 4005;BA.debugLine="SetStateSingle($\"${elID}value\"$, False)";
_setstatesingle((""+__c.SmartStringFormatter("",(Object)(_elid))+"value"),(Object)(__c.False));
 //BA.debugLineNum = 4006;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _hidebody() throws Exception{
anywheresoftware.b4a.objects.collections.Map _stylem = null;
 //BA.debugLineNum = 917;BA.debugLine="private Sub HideBody As BANanoVue";
 //BA.debugLineNum = 918;BA.debugLine="Dim stylem As Map = CreateMap(\"visibility\":\"hidde";
_stylem = new anywheresoftware.b4a.objects.collections.Map();
_stylem = __c.createMap(new Object[] {(Object)("visibility"),(Object)("hidden")});
 //BA.debugLineNum = 919;BA.debugLine="body.SetStyle(BANAno.ToJson(stylem))";
_body.SetStyle(BA.ObjectToString(_banano.ToJson((Object)(_stylem.getObject()))));
 //BA.debugLineNum = 920;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 921;BA.debugLine="End Sub";
return null;
}
public String  _hideerror(String _elid) throws Exception{
String _pp = "";
anywheresoftware.b4a.objects.collections.List _nl = null;
String _pp1 = "";
 //BA.debugLineNum = 2836;BA.debugLine="Sub HideError(elID As String)";
 //BA.debugLineNum = 2837;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 2838;BA.debugLine="Dim pp As String = $\"${elID}ErrorMessages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_elid))+"ErrorMessages");
 //BA.debugLineNum = 2839;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2840;BA.debugLine="nl = NewList";
_nl = _newlist();
 //BA.debugLineNum = 2841;BA.debugLine="SetData(pp, nl)";
_setdata(_pp,(Object)(_nl.getObject()));
 //BA.debugLineNum = 2842;BA.debugLine="Dim pp1 As String = $\"${elID}Error\"$";
_pp1 = (""+__c.SmartStringFormatter("",(Object)(_elid))+"Error");
 //BA.debugLineNum = 2843;BA.debugLine="SetData(pp1, False)";
_setdata(_pp1,(Object)(__c.False));
 //BA.debugLineNum = 2844;BA.debugLine="End Sub";
return "";
}
public String  _hideitem(String _elid) throws Exception{
 //BA.debugLineNum = 2617;BA.debugLine="Sub HideItem(elID As String)";
 //BA.debugLineNum = 2618;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 2619;BA.debugLine="SetStateSingle($\"${elID}show\"$, False)";
_setstatesingle((""+__c.SmartStringFormatter("",(Object)(_elid))+"show"),(Object)(__c.False));
 //BA.debugLineNum = 2620;BA.debugLine="SetStateSingle($\"${elID}badgeshow\"$, False)";
_setstatesingle((""+__c.SmartStringFormatter("",(Object)(_elid))+"badgeshow"),(Object)(__c.False));
 //BA.debugLineNum = 2621;BA.debugLine="End Sub";
return "";
}
public String  _hideitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
String _item = "";
 //BA.debugLineNum = 2316;BA.debugLine="Sub HideItems(items As List)";
 //BA.debugLineNum = 2317;BA.debugLine="For Each item As String In items";
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2318;BA.debugLine="SetStateSingle(item, False)";
_setstatesingle(_item,(Object)(__c.False));
 }
};
 //BA.debugLineNum = 2320;BA.debugLine="End Sub";
return "";
}
public String  _hidemulti(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
String _item = "";
 //BA.debugLineNum = 1286;BA.debugLine="Sub HideMulti(lst As List)";
 //BA.debugLineNum = 1287;BA.debugLine="For Each item As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1288;BA.debugLine="HideItem(item)";
_hideitem(_item);
 }
};
 //BA.debugLineNum = 1290;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _hidepreloader() throws Exception{
anywheresoftware.b4a.objects.collections.Map _stylem = null;
 //BA.debugLineNum = 939;BA.debugLine="Sub HidePreloader As BANanoVue";
 //BA.debugLineNum = 940;BA.debugLine="Dim stylem As Map = CreateMap(\"display\":\"none\")";
_stylem = new anywheresoftware.b4a.objects.collections.Map();
_stylem = __c.createMap(new Object[] {(Object)("display"),(Object)("none")});
 //BA.debugLineNum = 941;BA.debugLine="BANAno.GetElement(\"#preloader\").SetStyle(BANAno.T";
_banano.GetElement("#preloader").SetStyle(BA.ObjectToString(_banano.ToJson((Object)(_stylem.getObject()))));
 //BA.debugLineNum = 942;BA.debugLine="ShowBody";
_showbody();
 //BA.debugLineNum = 943;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 944;BA.debugLine="End Sub";
return null;
}
public String  _hr() throws Exception{
 //BA.debugLineNum = 2476;BA.debugLine="Sub HR As String";
 //BA.debugLineNum = 2477;BA.debugLine="Return \"<hr>\"";
if (true) return "<hr>";
 //BA.debugLineNum = 2478;BA.debugLine="End Sub";
return "";
}
public String  _httpupload(Object _fileobj,Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoPromise _promise = null;
String _error = "";
String _json = "";
 //BA.debugLineNum = 1382;BA.debugLine="Sub HTTPUpload(fileObj As Object, EventHandler As";
 //BA.debugLineNum = 1383;BA.debugLine="Dim promise As BANanoPromise 'ignore";
_promise = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 1385;BA.debugLine="Dim Error As String";
_error = "";
 //BA.debugLineNum = 1386;BA.debugLine="Dim json As String";
_json = "";
 //BA.debugLineNum = 1389;BA.debugLine="promise.CallSub(Me, \"DoUpload\", Array(fileObj))";
_promise.CallSub(this,"DoUpload",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_fileobj}));
 //BA.debugLineNum = 1390;BA.debugLine="promise.ThenWait(json)";
_promise.ThenWait((Object)(_json));
 //BA.debugLineNum = 1391;BA.debugLine="BANAno.CallSub(EventHandler, methodname, Array(fi";
_banano.CallSub(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_fileobj,(Object)(_json)}));
 //BA.debugLineNum = 1392;BA.debugLine="promise.ElseWait(Error)  'ignore";
_promise.ElseWait((Object)(_error));
 //BA.debugLineNum = 1393;BA.debugLine="BANAno.CallSub(EventHandler, methodname, Array(fi";
_banano.CallSub(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_fileobj,(Object)(_error)}));
 //BA.debugLineNum = 1394;BA.debugLine="promise.End";
_promise.End();
 //BA.debugLineNum = 1395;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _increment(String _elid,int _valueof) throws Exception{
int _oldv = 0;
 //BA.debugLineNum = 4204;BA.debugLine="Sub Increment(elID As String, valueOf As Int) As B";
 //BA.debugLineNum = 4205;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 4206;BA.debugLine="Dim oldv As Int = GetState(elID,0)";
_oldv = (int)(BA.ObjectToNumber(_getstate(_elid,(Object)(0))));
 //BA.debugLineNum = 4207;BA.debugLine="oldv = BANAno.parseInt(oldv) + valueOf";
_oldv = (int) (_banano.parseInt((Object)(_oldv))+_valueof);
 //BA.debugLineNum = 4208;BA.debugLine="SetStateSingle(elID, oldv)";
_setstatesingle(_elid,(Object)(_oldv));
 //BA.debugLineNum = 4209;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 4210;BA.debugLine="End Sub";
return null;
}
public String  _incrementglobal(String _prop,int _addval) throws Exception{
int _cc = 0;
 //BA.debugLineNum = 764;BA.debugLine="Sub IncrementGlobal(prop As String, addVal As Int)";
 //BA.debugLineNum = 765;BA.debugLine="prop = prop.tolowercase";
_prop = _prop.toLowerCase();
 //BA.debugLineNum = 767;BA.debugLine="Dim cc As Int = GetDataGlobal(prop)";
_cc = (int)(BA.ObjectToNumber(_getdataglobal(_prop)));
 //BA.debugLineNum = 768;BA.debugLine="cc = BANAno.parseInt(cc)";
_cc = _banano.parseInt((Object)(_cc));
 //BA.debugLineNum = 770;BA.debugLine="cc = cc + addVal";
_cc = (int) (_cc+_addval);
 //BA.debugLineNum = 772;BA.debugLine="SetDataGlobal(prop, cc)";
_setdataglobal(_prop,(Object)(_cc));
 //BA.debugLineNum = 773;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 119;BA.debugLine="Public Sub Initialize(EventHandler As Object)";
 //BA.debugLineNum = 121;BA.debugLine="body = BANAno.GetElement(\"#body\")";
_body = _banano.GetElement("#body");
 //BA.debugLineNum = 122;BA.debugLine="body.empty";
_body.Empty();
 //BA.debugLineNum = 123;BA.debugLine="body.Append($\"<div id=\"app\"></div>\"$)";
_body.Append(("<div id=\"app\"></div>"));
 //BA.debugLineNum = 124;BA.debugLine="Template.Initialize(\"app1\", \"div\")";
_template._initialize /*b4j.example.vuehtml*/ (ba,"app1","div");
 //BA.debugLineNum = 125;BA.debugLine="Module = EventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 127;BA.debugLine="Errors.Initialize";
_errors.Initialize();
 //BA.debugLineNum = 128;BA.debugLine="SourceCode.Initialize";
_sourcecode.Initialize();
 //BA.debugLineNum = 129;BA.debugLine="Themes.Initialize";
_themes.Initialize();
 //BA.debugLineNum = 130;BA.debugLine="Modules.Initialize";
_modules.Initialize();
 //BA.debugLineNum = 131;BA.debugLine="BOVue.Initialize(\"Vue\")";
_bovue.Initialize((Object)("Vue"));
 //BA.debugLineNum = 133;BA.debugLine="Template.SetVCloak";
_template._setvcloak /*b4j.example.vuehtml*/ ();
 //BA.debugLineNum = 134;BA.debugLine="methods.Initialize";
_methods.Initialize();
 //BA.debugLineNum = 135;BA.debugLine="filters.initialize";
_filters.Initialize();
 //BA.debugLineNum = 136;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 137;BA.debugLine="computed.Initialize";
_computed.Initialize();
 //BA.debugLineNum = 138;BA.debugLine="watches.Initialize";
_watches.Initialize();
 //BA.debugLineNum = 139;BA.debugLine="routes.Initialize";
_routes.Initialize();
 //BA.debugLineNum = 142;BA.debugLine="state.Initialize";
_state.Initialize();
 //BA.debugLineNum = 144;BA.debugLine="Position.initialize";
_position.Initialize();
 //BA.debugLineNum = 145;BA.debugLine="Position.Put(\"static\",\"static\")";
_position.Put((Object)("static"),(Object)("static"));
 //BA.debugLineNum = 146;BA.debugLine="Position.Put(\"relative\",\"relative\")";
_position.Put((Object)("relative"),(Object)("relative"));
 //BA.debugLineNum = 147;BA.debugLine="Position.Put(\"fixed\",\"fixe\")";
_position.Put((Object)("fixed"),(Object)("fixe"));
 //BA.debugLineNum = 148;BA.debugLine="Position.Put(\"absolute\",\"absolute\")";
_position.Put((Object)("absolute"),(Object)("absolute"));
 //BA.debugLineNum = 149;BA.debugLine="Position.Put(\"sticky\", \"sticky\")";
_position.Put((Object)("sticky"),(Object)("sticky"));
 //BA.debugLineNum = 150;BA.debugLine="Position.Put(\"\", \"none\")";
_position.Put((Object)(""),(Object)("none"));
 //BA.debugLineNum = 152;BA.debugLine="Options = CreateMap()";
_options = __c.createMap(new Object[] {});
 //BA.debugLineNum = 153;BA.debugLine="dynamicStyle = CreateMap()";
_dynamicstyle = __c.createMap(new Object[] {});
 //BA.debugLineNum = 155;BA.debugLine="Colors.initialize";
_colors.Initialize();
 //BA.debugLineNum = 156;BA.debugLine="Colors.red = \"red\"";
_colors.red /*String*/  = "red";
 //BA.debugLineNum = 157;BA.debugLine="Colors.pink = \"pink\"";
_colors.pink /*String*/  = "pink";
 //BA.debugLineNum = 158;BA.debugLine="Colors.purple = \"purple\"";
_colors.purple /*String*/  = "purple";
 //BA.debugLineNum = 159;BA.debugLine="Colors.deepPurple = \"deep-purple\"";
_colors.deepPurple /*String*/  = "deep-purple";
 //BA.debugLineNum = 160;BA.debugLine="Colors.indigo = \"indigo\"";
_colors.indigo /*String*/  = "indigo";
 //BA.debugLineNum = 161;BA.debugLine="Colors.blue = \"blue\"";
_colors.blue /*String*/  = "blue";
 //BA.debugLineNum = 162;BA.debugLine="Colors.lightBlue = \"light-blue\"";
_colors.lightBlue /*String*/  = "light-blue";
 //BA.debugLineNum = 163;BA.debugLine="Colors.cyan = \"cyan\"";
_colors.cyan /*String*/  = "cyan";
 //BA.debugLineNum = 164;BA.debugLine="Colors.teal = \"teal\"";
_colors.teal /*String*/  = "teal";
 //BA.debugLineNum = 165;BA.debugLine="Colors.green = \"green\"";
_colors.green /*String*/  = "green";
 //BA.debugLineNum = 166;BA.debugLine="Colors.lightGreen = \"light-green\"";
_colors.lightGreen /*String*/  = "light-green";
 //BA.debugLineNum = 167;BA.debugLine="Colors.lime = \"lime\"";
_colors.lime /*String*/  = "lime";
 //BA.debugLineNum = 168;BA.debugLine="Colors.yellow = \"yellow\"";
_colors.yellow /*String*/  = "yellow";
 //BA.debugLineNum = 169;BA.debugLine="Colors.amber = \"amber\"";
_colors.amber /*String*/  = "amber";
 //BA.debugLineNum = 170;BA.debugLine="Colors.Orange = \"orange\"";
_colors.Orange /*String*/  = "orange";
 //BA.debugLineNum = 171;BA.debugLine="Colors.deepOrange = \"deep-orange\"";
_colors.deepOrange /*String*/  = "deep-orange";
 //BA.debugLineNum = 172;BA.debugLine="Colors.brown = \"brown\"";
_colors.brown /*String*/  = "brown";
 //BA.debugLineNum = 173;BA.debugLine="Colors.grey = \"grey\"";
_colors.grey /*String*/  = "grey";
 //BA.debugLineNum = 174;BA.debugLine="Colors.blueGrey = \"blue-grey\"";
_colors.blueGrey /*String*/  = "blue-grey";
 //BA.debugLineNum = 175;BA.debugLine="Colors.black = \"black\"";
_colors.black /*String*/  = "black";
 //BA.debugLineNum = 176;BA.debugLine="Colors.white = \"white\"";
_colors.white /*String*/  = "white";
 //BA.debugLineNum = 177;BA.debugLine="Colors.transparent = \"transparent\"";
_colors.transparent /*String*/  = "transparent";
 //BA.debugLineNum = 179;BA.debugLine="ColorMap.Initialize";
_colormap.Initialize();
 //BA.debugLineNum = 180;BA.debugLine="ColorMap.put(\"red lighten-5\", \"#ffebee\")";
_colormap.Put((Object)("red lighten-5"),(Object)("#ffebee"));
 //BA.debugLineNum = 181;BA.debugLine="ColorMap.put(\"red lighten-4\", \"#ffcdd2\")";
_colormap.Put((Object)("red lighten-4"),(Object)("#ffcdd2"));
 //BA.debugLineNum = 182;BA.debugLine="ColorMap.put(\"red lighten-3\", \"#ef9a9a\")";
_colormap.Put((Object)("red lighten-3"),(Object)("#ef9a9a"));
 //BA.debugLineNum = 183;BA.debugLine="ColorMap.put(\"red lighten-2\", \"#e57373\")";
_colormap.Put((Object)("red lighten-2"),(Object)("#e57373"));
 //BA.debugLineNum = 184;BA.debugLine="ColorMap.put(\"red lighten-1\", \"#ef5350\")";
_colormap.Put((Object)("red lighten-1"),(Object)("#ef5350"));
 //BA.debugLineNum = 185;BA.debugLine="ColorMap.put(\"red\", \"#f44336\")";
_colormap.Put((Object)("red"),(Object)("#f44336"));
 //BA.debugLineNum = 186;BA.debugLine="ColorMap.put(\"red darken-1\", \"#e53935\")";
_colormap.Put((Object)("red darken-1"),(Object)("#e53935"));
 //BA.debugLineNum = 187;BA.debugLine="ColorMap.put(\"red darken-2\", \"#d32f2f\")";
_colormap.Put((Object)("red darken-2"),(Object)("#d32f2f"));
 //BA.debugLineNum = 188;BA.debugLine="ColorMap.put(\"red darken-3\", \"#c62828\")";
_colormap.Put((Object)("red darken-3"),(Object)("#c62828"));
 //BA.debugLineNum = 189;BA.debugLine="ColorMap.put(\"red darken-4\", \"#b71c1c\")";
_colormap.Put((Object)("red darken-4"),(Object)("#b71c1c"));
 //BA.debugLineNum = 190;BA.debugLine="ColorMap.put(\"red accent-1\", \"#ff8a80\")";
_colormap.Put((Object)("red accent-1"),(Object)("#ff8a80"));
 //BA.debugLineNum = 191;BA.debugLine="ColorMap.put(\"red accent-2\", \"#ff5252\")";
_colormap.Put((Object)("red accent-2"),(Object)("#ff5252"));
 //BA.debugLineNum = 192;BA.debugLine="ColorMap.put(\"red accent-3\", \"#ff1744\")";
_colormap.Put((Object)("red accent-3"),(Object)("#ff1744"));
 //BA.debugLineNum = 193;BA.debugLine="ColorMap.put(\"red accent-4\", \"#d50000\")";
_colormap.Put((Object)("red accent-4"),(Object)("#d50000"));
 //BA.debugLineNum = 194;BA.debugLine="ColorMap.put(\"pink lighten-5\", \"#fce4ec\")";
_colormap.Put((Object)("pink lighten-5"),(Object)("#fce4ec"));
 //BA.debugLineNum = 195;BA.debugLine="ColorMap.put(\"pink lighten-4\", \"#f8bbd0\")";
_colormap.Put((Object)("pink lighten-4"),(Object)("#f8bbd0"));
 //BA.debugLineNum = 196;BA.debugLine="ColorMap.put(\"pink lighten-3\", \"#f48fb1\")";
_colormap.Put((Object)("pink lighten-3"),(Object)("#f48fb1"));
 //BA.debugLineNum = 197;BA.debugLine="ColorMap.put(\"pink lighten-2\", \"#f06292\")";
_colormap.Put((Object)("pink lighten-2"),(Object)("#f06292"));
 //BA.debugLineNum = 198;BA.debugLine="ColorMap.put(\"pink lighten-1\", \"#ec407a\")";
_colormap.Put((Object)("pink lighten-1"),(Object)("#ec407a"));
 //BA.debugLineNum = 199;BA.debugLine="ColorMap.put(\"pink\", \"#e91e63\")";
_colormap.Put((Object)("pink"),(Object)("#e91e63"));
 //BA.debugLineNum = 200;BA.debugLine="ColorMap.put(\"pink darken-1\", \"#d81b60\")";
_colormap.Put((Object)("pink darken-1"),(Object)("#d81b60"));
 //BA.debugLineNum = 201;BA.debugLine="ColorMap.put(\"pink darken-2\", \"#c2185b\")";
_colormap.Put((Object)("pink darken-2"),(Object)("#c2185b"));
 //BA.debugLineNum = 202;BA.debugLine="ColorMap.put(\"pink darken-3\", \"#ad1457\")";
_colormap.Put((Object)("pink darken-3"),(Object)("#ad1457"));
 //BA.debugLineNum = 203;BA.debugLine="ColorMap.put(\"pink darken-4\", \"#880e4f\")";
_colormap.Put((Object)("pink darken-4"),(Object)("#880e4f"));
 //BA.debugLineNum = 204;BA.debugLine="ColorMap.put(\"pink accent-1\", \"#ff80ab\")";
_colormap.Put((Object)("pink accent-1"),(Object)("#ff80ab"));
 //BA.debugLineNum = 205;BA.debugLine="ColorMap.put(\"pink accent-2\", \"#ff4081\")";
_colormap.Put((Object)("pink accent-2"),(Object)("#ff4081"));
 //BA.debugLineNum = 206;BA.debugLine="ColorMap.put(\"pink accent-3\", \"#f50057\")";
_colormap.Put((Object)("pink accent-3"),(Object)("#f50057"));
 //BA.debugLineNum = 207;BA.debugLine="ColorMap.put(\"pink accent-4\", \"#c51162\")";
_colormap.Put((Object)("pink accent-4"),(Object)("#c51162"));
 //BA.debugLineNum = 208;BA.debugLine="ColorMap.put(\"purple lighten-5\", \"#f3e5f5\")";
_colormap.Put((Object)("purple lighten-5"),(Object)("#f3e5f5"));
 //BA.debugLineNum = 209;BA.debugLine="ColorMap.put(\"purple lighten-4\", \"#e1bee7\")";
_colormap.Put((Object)("purple lighten-4"),(Object)("#e1bee7"));
 //BA.debugLineNum = 210;BA.debugLine="ColorMap.put(\"purple lighten-3\", \"#ce93d8\")";
_colormap.Put((Object)("purple lighten-3"),(Object)("#ce93d8"));
 //BA.debugLineNum = 211;BA.debugLine="ColorMap.put(\"purple lighten-2\", \"#ba68c8\")";
_colormap.Put((Object)("purple lighten-2"),(Object)("#ba68c8"));
 //BA.debugLineNum = 212;BA.debugLine="ColorMap.put(\"purple lighten-1\", \"#ab47bc\")";
_colormap.Put((Object)("purple lighten-1"),(Object)("#ab47bc"));
 //BA.debugLineNum = 213;BA.debugLine="ColorMap.put(\"purple\", \"#9c27b0\")";
_colormap.Put((Object)("purple"),(Object)("#9c27b0"));
 //BA.debugLineNum = 214;BA.debugLine="ColorMap.put(\"purple darken-1\", \"#8e24aa\")";
_colormap.Put((Object)("purple darken-1"),(Object)("#8e24aa"));
 //BA.debugLineNum = 215;BA.debugLine="ColorMap.put(\"purple darken-2\", \"#7b1fa2\")";
_colormap.Put((Object)("purple darken-2"),(Object)("#7b1fa2"));
 //BA.debugLineNum = 216;BA.debugLine="ColorMap.put(\"purple darken-3\", \"#6a1b9a\")";
_colormap.Put((Object)("purple darken-3"),(Object)("#6a1b9a"));
 //BA.debugLineNum = 217;BA.debugLine="ColorMap.put(\"purple darken-4\", \"#4a148c\")";
_colormap.Put((Object)("purple darken-4"),(Object)("#4a148c"));
 //BA.debugLineNum = 218;BA.debugLine="ColorMap.put(\"purple accent-1\", \"#ea80fc\")";
_colormap.Put((Object)("purple accent-1"),(Object)("#ea80fc"));
 //BA.debugLineNum = 219;BA.debugLine="ColorMap.put(\"purple accent-2\", \"#e040fb\")";
_colormap.Put((Object)("purple accent-2"),(Object)("#e040fb"));
 //BA.debugLineNum = 220;BA.debugLine="ColorMap.put(\"purple accent-3\", \"#d500f9\")";
_colormap.Put((Object)("purple accent-3"),(Object)("#d500f9"));
 //BA.debugLineNum = 221;BA.debugLine="ColorMap.put(\"purple accent-4\", \"#aa00ff\")";
_colormap.Put((Object)("purple accent-4"),(Object)("#aa00ff"));
 //BA.debugLineNum = 222;BA.debugLine="ColorMap.put(\"deep-purple lighten-5\", \"#ede7f6\")";
_colormap.Put((Object)("deep-purple lighten-5"),(Object)("#ede7f6"));
 //BA.debugLineNum = 223;BA.debugLine="ColorMap.put(\"deep-purple lighten-4\", \"#d1c4e9\")";
_colormap.Put((Object)("deep-purple lighten-4"),(Object)("#d1c4e9"));
 //BA.debugLineNum = 224;BA.debugLine="ColorMap.put(\"deep-purple lighten-3\", \"#b39ddb\")";
_colormap.Put((Object)("deep-purple lighten-3"),(Object)("#b39ddb"));
 //BA.debugLineNum = 225;BA.debugLine="ColorMap.put(\"deep-purple lighten-2\", \"#9575cd\")";
_colormap.Put((Object)("deep-purple lighten-2"),(Object)("#9575cd"));
 //BA.debugLineNum = 226;BA.debugLine="ColorMap.put(\"deep-purple lighten-1\", \"#7e57c2\")";
_colormap.Put((Object)("deep-purple lighten-1"),(Object)("#7e57c2"));
 //BA.debugLineNum = 227;BA.debugLine="ColorMap.put(\"deep-purple\", \"#673ab7\")";
_colormap.Put((Object)("deep-purple"),(Object)("#673ab7"));
 //BA.debugLineNum = 228;BA.debugLine="ColorMap.put(\"deep-purple darken-1\", \"#5e35b1\")";
_colormap.Put((Object)("deep-purple darken-1"),(Object)("#5e35b1"));
 //BA.debugLineNum = 229;BA.debugLine="ColorMap.put(\"deep-purple darken-2\", \"#512da8\")";
_colormap.Put((Object)("deep-purple darken-2"),(Object)("#512da8"));
 //BA.debugLineNum = 230;BA.debugLine="ColorMap.put(\"deep-purple darken-3\", \"#4527a0\")";
_colormap.Put((Object)("deep-purple darken-3"),(Object)("#4527a0"));
 //BA.debugLineNum = 231;BA.debugLine="ColorMap.put(\"deep-purple darken-4\", \"#311b92\")";
_colormap.Put((Object)("deep-purple darken-4"),(Object)("#311b92"));
 //BA.debugLineNum = 232;BA.debugLine="ColorMap.put(\"deep-purple accent-1\", \"#b388ff\")";
_colormap.Put((Object)("deep-purple accent-1"),(Object)("#b388ff"));
 //BA.debugLineNum = 233;BA.debugLine="ColorMap.put(\"deep-purple accent-2\", \"#7c4dff\")";
_colormap.Put((Object)("deep-purple accent-2"),(Object)("#7c4dff"));
 //BA.debugLineNum = 234;BA.debugLine="ColorMap.put(\"deep-purple accent-3\", \"#651fff\")";
_colormap.Put((Object)("deep-purple accent-3"),(Object)("#651fff"));
 //BA.debugLineNum = 235;BA.debugLine="ColorMap.put(\"deep-purple accent-4\", \"#6200ea\")";
_colormap.Put((Object)("deep-purple accent-4"),(Object)("#6200ea"));
 //BA.debugLineNum = 236;BA.debugLine="ColorMap.put(\"indigo lighten-5\", \"#e8eaf6\")";
_colormap.Put((Object)("indigo lighten-5"),(Object)("#e8eaf6"));
 //BA.debugLineNum = 237;BA.debugLine="ColorMap.put(\"indigo lighten-4\", \"#c5cae9\")";
_colormap.Put((Object)("indigo lighten-4"),(Object)("#c5cae9"));
 //BA.debugLineNum = 238;BA.debugLine="ColorMap.put(\"indigo lighten-3\", \"#9fa8da\")";
_colormap.Put((Object)("indigo lighten-3"),(Object)("#9fa8da"));
 //BA.debugLineNum = 239;BA.debugLine="ColorMap.put(\"indigo lighten-2\", \"#7986cb\")";
_colormap.Put((Object)("indigo lighten-2"),(Object)("#7986cb"));
 //BA.debugLineNum = 240;BA.debugLine="ColorMap.put(\"indigo lighten-1\", \"#5c6bc0\")";
_colormap.Put((Object)("indigo lighten-1"),(Object)("#5c6bc0"));
 //BA.debugLineNum = 241;BA.debugLine="ColorMap.put(\"indigo\", \"#3f51b5\")";
_colormap.Put((Object)("indigo"),(Object)("#3f51b5"));
 //BA.debugLineNum = 242;BA.debugLine="ColorMap.put(\"indigo darken-1\", \"#3949ab\")";
_colormap.Put((Object)("indigo darken-1"),(Object)("#3949ab"));
 //BA.debugLineNum = 243;BA.debugLine="ColorMap.put(\"indigo darken-2\", \"#303f9f\")";
_colormap.Put((Object)("indigo darken-2"),(Object)("#303f9f"));
 //BA.debugLineNum = 244;BA.debugLine="ColorMap.put(\"indigo darken-3\", \"#283593\")";
_colormap.Put((Object)("indigo darken-3"),(Object)("#283593"));
 //BA.debugLineNum = 245;BA.debugLine="ColorMap.put(\"indigo darken-4\", \"#1a237e\")";
_colormap.Put((Object)("indigo darken-4"),(Object)("#1a237e"));
 //BA.debugLineNum = 246;BA.debugLine="ColorMap.put(\"indigo accent-1\", \"#8c9eff\")";
_colormap.Put((Object)("indigo accent-1"),(Object)("#8c9eff"));
 //BA.debugLineNum = 247;BA.debugLine="ColorMap.put(\"indigo accent-2\", \"#536dfe\")";
_colormap.Put((Object)("indigo accent-2"),(Object)("#536dfe"));
 //BA.debugLineNum = 248;BA.debugLine="ColorMap.put(\"indigo accent-3\", \"#3d5afe\")";
_colormap.Put((Object)("indigo accent-3"),(Object)("#3d5afe"));
 //BA.debugLineNum = 249;BA.debugLine="ColorMap.put(\"indigo accent-4\", \"#304ffe\")";
_colormap.Put((Object)("indigo accent-4"),(Object)("#304ffe"));
 //BA.debugLineNum = 250;BA.debugLine="ColorMap.put(\"blue lighten-5\", \"#e3f2fd\")";
_colormap.Put((Object)("blue lighten-5"),(Object)("#e3f2fd"));
 //BA.debugLineNum = 251;BA.debugLine="ColorMap.put(\"blue lighten-4\", \"#bbdefb\")";
_colormap.Put((Object)("blue lighten-4"),(Object)("#bbdefb"));
 //BA.debugLineNum = 252;BA.debugLine="ColorMap.put(\"blue lighten-3\", \"#90caf9\")";
_colormap.Put((Object)("blue lighten-3"),(Object)("#90caf9"));
 //BA.debugLineNum = 253;BA.debugLine="ColorMap.put(\"blue lighten-2\", \"#64b5f6\")";
_colormap.Put((Object)("blue lighten-2"),(Object)("#64b5f6"));
 //BA.debugLineNum = 254;BA.debugLine="ColorMap.put(\"blue lighten-1\", \"#42a5f5\")";
_colormap.Put((Object)("blue lighten-1"),(Object)("#42a5f5"));
 //BA.debugLineNum = 255;BA.debugLine="ColorMap.put(\"blue\", \"#2196f3\")";
_colormap.Put((Object)("blue"),(Object)("#2196f3"));
 //BA.debugLineNum = 256;BA.debugLine="ColorMap.put(\"blue darken-1\", \"#1e88e5\")";
_colormap.Put((Object)("blue darken-1"),(Object)("#1e88e5"));
 //BA.debugLineNum = 257;BA.debugLine="ColorMap.put(\"blue darken-2\", \"#1976d2\")";
_colormap.Put((Object)("blue darken-2"),(Object)("#1976d2"));
 //BA.debugLineNum = 258;BA.debugLine="ColorMap.put(\"blue darken-3\", \"#1565c0\")";
_colormap.Put((Object)("blue darken-3"),(Object)("#1565c0"));
 //BA.debugLineNum = 259;BA.debugLine="ColorMap.put(\"blue darken-4\", \"#0d47a1\")";
_colormap.Put((Object)("blue darken-4"),(Object)("#0d47a1"));
 //BA.debugLineNum = 260;BA.debugLine="ColorMap.put(\"blue accent-1\", \"#82b1ff\")";
_colormap.Put((Object)("blue accent-1"),(Object)("#82b1ff"));
 //BA.debugLineNum = 261;BA.debugLine="ColorMap.put(\"blue accent-2\", \"#448aff\")";
_colormap.Put((Object)("blue accent-2"),(Object)("#448aff"));
 //BA.debugLineNum = 262;BA.debugLine="ColorMap.put(\"blue accent-3\", \"#2979ff\")";
_colormap.Put((Object)("blue accent-3"),(Object)("#2979ff"));
 //BA.debugLineNum = 263;BA.debugLine="ColorMap.put(\"blue accent-4\", \"#2962ff\")";
_colormap.Put((Object)("blue accent-4"),(Object)("#2962ff"));
 //BA.debugLineNum = 264;BA.debugLine="ColorMap.put(\"light-blue lighten-5\", \"#e1f5fe\")";
_colormap.Put((Object)("light-blue lighten-5"),(Object)("#e1f5fe"));
 //BA.debugLineNum = 265;BA.debugLine="ColorMap.put(\"light-blue lighten-4\", \"#b3e5fc\")";
_colormap.Put((Object)("light-blue lighten-4"),(Object)("#b3e5fc"));
 //BA.debugLineNum = 266;BA.debugLine="ColorMap.put(\"light-blue lighten-3\", \"#81d4fa\")";
_colormap.Put((Object)("light-blue lighten-3"),(Object)("#81d4fa"));
 //BA.debugLineNum = 267;BA.debugLine="ColorMap.put(\"light-blue lighten-2\", \"#4fc3f7\")";
_colormap.Put((Object)("light-blue lighten-2"),(Object)("#4fc3f7"));
 //BA.debugLineNum = 268;BA.debugLine="ColorMap.put(\"light-blue lighten-1\", \"#29b6f6\")";
_colormap.Put((Object)("light-blue lighten-1"),(Object)("#29b6f6"));
 //BA.debugLineNum = 269;BA.debugLine="ColorMap.put(\"light-blue\", \"#03a9f4\")";
_colormap.Put((Object)("light-blue"),(Object)("#03a9f4"));
 //BA.debugLineNum = 270;BA.debugLine="ColorMap.put(\"light-blue darken-1\", \"#039be5\")";
_colormap.Put((Object)("light-blue darken-1"),(Object)("#039be5"));
 //BA.debugLineNum = 271;BA.debugLine="ColorMap.put(\"light-blue darken-2\", \"#0288d1\")";
_colormap.Put((Object)("light-blue darken-2"),(Object)("#0288d1"));
 //BA.debugLineNum = 272;BA.debugLine="ColorMap.put(\"light-blue darken-3\", \"#0277bd\")";
_colormap.Put((Object)("light-blue darken-3"),(Object)("#0277bd"));
 //BA.debugLineNum = 273;BA.debugLine="ColorMap.put(\"light-blue darken-4\", \"#01579b\")";
_colormap.Put((Object)("light-blue darken-4"),(Object)("#01579b"));
 //BA.debugLineNum = 274;BA.debugLine="ColorMap.put(\"light-blue accent-1\", \"#80d8ff\")";
_colormap.Put((Object)("light-blue accent-1"),(Object)("#80d8ff"));
 //BA.debugLineNum = 275;BA.debugLine="ColorMap.put(\"light-blue accent-2\", \"#40c4ff\")";
_colormap.Put((Object)("light-blue accent-2"),(Object)("#40c4ff"));
 //BA.debugLineNum = 276;BA.debugLine="ColorMap.put(\"light-blue accent-3\", \"#00b0ff\")";
_colormap.Put((Object)("light-blue accent-3"),(Object)("#00b0ff"));
 //BA.debugLineNum = 277;BA.debugLine="ColorMap.put(\"light-blue accent-4\", \"#0091ea\")";
_colormap.Put((Object)("light-blue accent-4"),(Object)("#0091ea"));
 //BA.debugLineNum = 278;BA.debugLine="ColorMap.put(\"cyan lighten-5\", \"#e0f7fa\")";
_colormap.Put((Object)("cyan lighten-5"),(Object)("#e0f7fa"));
 //BA.debugLineNum = 279;BA.debugLine="ColorMap.put(\"cyan lighten-4\", \"#b2ebf2\")";
_colormap.Put((Object)("cyan lighten-4"),(Object)("#b2ebf2"));
 //BA.debugLineNum = 280;BA.debugLine="ColorMap.put(\"cyan lighten-3\", \"#80deea\")";
_colormap.Put((Object)("cyan lighten-3"),(Object)("#80deea"));
 //BA.debugLineNum = 281;BA.debugLine="ColorMap.put(\"cyan lighten-2\", \"#4dd0e1\")";
_colormap.Put((Object)("cyan lighten-2"),(Object)("#4dd0e1"));
 //BA.debugLineNum = 282;BA.debugLine="ColorMap.put(\"cyan lighten-1\", \"#26c6da\")";
_colormap.Put((Object)("cyan lighten-1"),(Object)("#26c6da"));
 //BA.debugLineNum = 283;BA.debugLine="ColorMap.put(\"cyan\", \"#00bcd4\")";
_colormap.Put((Object)("cyan"),(Object)("#00bcd4"));
 //BA.debugLineNum = 284;BA.debugLine="ColorMap.put(\"cyan darken-1\", \"#00acc1\")";
_colormap.Put((Object)("cyan darken-1"),(Object)("#00acc1"));
 //BA.debugLineNum = 285;BA.debugLine="ColorMap.put(\"cyan darken-2\", \"#0097a7\")";
_colormap.Put((Object)("cyan darken-2"),(Object)("#0097a7"));
 //BA.debugLineNum = 286;BA.debugLine="ColorMap.put(\"cyan darken-3\", \"#00838f\")";
_colormap.Put((Object)("cyan darken-3"),(Object)("#00838f"));
 //BA.debugLineNum = 287;BA.debugLine="ColorMap.put(\"cyan darken-4\", \"#006064\")";
_colormap.Put((Object)("cyan darken-4"),(Object)("#006064"));
 //BA.debugLineNum = 288;BA.debugLine="ColorMap.put(\"cyan accent-1\", \"#84ffff\")";
_colormap.Put((Object)("cyan accent-1"),(Object)("#84ffff"));
 //BA.debugLineNum = 289;BA.debugLine="ColorMap.put(\"cyan accent-2\", \"#18ffff\")";
_colormap.Put((Object)("cyan accent-2"),(Object)("#18ffff"));
 //BA.debugLineNum = 290;BA.debugLine="ColorMap.put(\"cyan accent-3\", \"#00e5ff\")";
_colormap.Put((Object)("cyan accent-3"),(Object)("#00e5ff"));
 //BA.debugLineNum = 291;BA.debugLine="ColorMap.put(\"cyan accent-4\", \"#00b8d4\")";
_colormap.Put((Object)("cyan accent-4"),(Object)("#00b8d4"));
 //BA.debugLineNum = 292;BA.debugLine="ColorMap.put(\"teal lighten-5\", \"#e0f2f1\")";
_colormap.Put((Object)("teal lighten-5"),(Object)("#e0f2f1"));
 //BA.debugLineNum = 293;BA.debugLine="ColorMap.put(\"teal lighten-4\", \"#b2dfdb\")";
_colormap.Put((Object)("teal lighten-4"),(Object)("#b2dfdb"));
 //BA.debugLineNum = 294;BA.debugLine="ColorMap.put(\"teal lighten-3\", \"#80cbc4\")";
_colormap.Put((Object)("teal lighten-3"),(Object)("#80cbc4"));
 //BA.debugLineNum = 295;BA.debugLine="ColorMap.put(\"teal lighten-2\", \"#4db6ac\")";
_colormap.Put((Object)("teal lighten-2"),(Object)("#4db6ac"));
 //BA.debugLineNum = 296;BA.debugLine="ColorMap.put(\"teal lighten-1\", \"#26a69a\")";
_colormap.Put((Object)("teal lighten-1"),(Object)("#26a69a"));
 //BA.debugLineNum = 297;BA.debugLine="ColorMap.put(\"teal\", \"#009688\")";
_colormap.Put((Object)("teal"),(Object)("#009688"));
 //BA.debugLineNum = 298;BA.debugLine="ColorMap.put(\"teal darken-1\", \"#00897b\")";
_colormap.Put((Object)("teal darken-1"),(Object)("#00897b"));
 //BA.debugLineNum = 299;BA.debugLine="ColorMap.put(\"teal darken-2\", \"#00796b\")";
_colormap.Put((Object)("teal darken-2"),(Object)("#00796b"));
 //BA.debugLineNum = 300;BA.debugLine="ColorMap.put(\"teal darken-3\", \"#00695c\")";
_colormap.Put((Object)("teal darken-3"),(Object)("#00695c"));
 //BA.debugLineNum = 301;BA.debugLine="ColorMap.put(\"teal darken-4\", \"#004d40\")";
_colormap.Put((Object)("teal darken-4"),(Object)("#004d40"));
 //BA.debugLineNum = 302;BA.debugLine="ColorMap.put(\"teal accent-1\", \"#a7ffeb\")";
_colormap.Put((Object)("teal accent-1"),(Object)("#a7ffeb"));
 //BA.debugLineNum = 303;BA.debugLine="ColorMap.put(\"teal accent-2\", \"#64ffda\")";
_colormap.Put((Object)("teal accent-2"),(Object)("#64ffda"));
 //BA.debugLineNum = 304;BA.debugLine="ColorMap.put(\"teal accent-3\", \"#1de9b6\")";
_colormap.Put((Object)("teal accent-3"),(Object)("#1de9b6"));
 //BA.debugLineNum = 305;BA.debugLine="ColorMap.put(\"teal accent-4\", \"#00bfa5\")";
_colormap.Put((Object)("teal accent-4"),(Object)("#00bfa5"));
 //BA.debugLineNum = 306;BA.debugLine="ColorMap.put(\"green lighten-5\", \"#e8f5e9\")";
_colormap.Put((Object)("green lighten-5"),(Object)("#e8f5e9"));
 //BA.debugLineNum = 307;BA.debugLine="ColorMap.put(\"green lighten-4\", \"#c8e6c9\")";
_colormap.Put((Object)("green lighten-4"),(Object)("#c8e6c9"));
 //BA.debugLineNum = 308;BA.debugLine="ColorMap.put(\"green lighten-3\", \"#a5d6a7\")";
_colormap.Put((Object)("green lighten-3"),(Object)("#a5d6a7"));
 //BA.debugLineNum = 309;BA.debugLine="ColorMap.put(\"green lighten-2\", \"#81c784\")";
_colormap.Put((Object)("green lighten-2"),(Object)("#81c784"));
 //BA.debugLineNum = 310;BA.debugLine="ColorMap.put(\"green lighten-1\", \"#66bb6a\")";
_colormap.Put((Object)("green lighten-1"),(Object)("#66bb6a"));
 //BA.debugLineNum = 311;BA.debugLine="ColorMap.put(\"green\", \"#4caf50\")";
_colormap.Put((Object)("green"),(Object)("#4caf50"));
 //BA.debugLineNum = 312;BA.debugLine="ColorMap.put(\"green darken-1\", \"#43a047\")";
_colormap.Put((Object)("green darken-1"),(Object)("#43a047"));
 //BA.debugLineNum = 313;BA.debugLine="ColorMap.put(\"green darken-2\", \"#388e3c\")";
_colormap.Put((Object)("green darken-2"),(Object)("#388e3c"));
 //BA.debugLineNum = 314;BA.debugLine="ColorMap.put(\"green darken-3\", \"#2e7d32\")";
_colormap.Put((Object)("green darken-3"),(Object)("#2e7d32"));
 //BA.debugLineNum = 315;BA.debugLine="ColorMap.put(\"green darken-4\", \"#1b5e20\")";
_colormap.Put((Object)("green darken-4"),(Object)("#1b5e20"));
 //BA.debugLineNum = 316;BA.debugLine="ColorMap.put(\"green accent-1\", \"#b9f6ca\")";
_colormap.Put((Object)("green accent-1"),(Object)("#b9f6ca"));
 //BA.debugLineNum = 317;BA.debugLine="ColorMap.put(\"green accent-2\", \"#69f0ae\")";
_colormap.Put((Object)("green accent-2"),(Object)("#69f0ae"));
 //BA.debugLineNum = 318;BA.debugLine="ColorMap.put(\"green accent-3\", \"#00e676\")";
_colormap.Put((Object)("green accent-3"),(Object)("#00e676"));
 //BA.debugLineNum = 319;BA.debugLine="ColorMap.put(\"green accent-4\", \"#00c853\")";
_colormap.Put((Object)("green accent-4"),(Object)("#00c853"));
 //BA.debugLineNum = 320;BA.debugLine="ColorMap.put(\"light-green lighten-5\", \"#f1f8e9\")";
_colormap.Put((Object)("light-green lighten-5"),(Object)("#f1f8e9"));
 //BA.debugLineNum = 321;BA.debugLine="ColorMap.put(\"light-green lighten-4\", \"#dcedc8\")";
_colormap.Put((Object)("light-green lighten-4"),(Object)("#dcedc8"));
 //BA.debugLineNum = 322;BA.debugLine="ColorMap.put(\"light-green lighten-3\", \"#c5e1a5\")";
_colormap.Put((Object)("light-green lighten-3"),(Object)("#c5e1a5"));
 //BA.debugLineNum = 323;BA.debugLine="ColorMap.put(\"light-green lighten-2\", \"#aed581\")";
_colormap.Put((Object)("light-green lighten-2"),(Object)("#aed581"));
 //BA.debugLineNum = 324;BA.debugLine="ColorMap.put(\"light-green lighten-1\", \"#9ccc65\")";
_colormap.Put((Object)("light-green lighten-1"),(Object)("#9ccc65"));
 //BA.debugLineNum = 325;BA.debugLine="ColorMap.put(\"light-green\", \"#8bc34a\")";
_colormap.Put((Object)("light-green"),(Object)("#8bc34a"));
 //BA.debugLineNum = 326;BA.debugLine="ColorMap.put(\"light-green darken-1\", \"#7cb342\")";
_colormap.Put((Object)("light-green darken-1"),(Object)("#7cb342"));
 //BA.debugLineNum = 327;BA.debugLine="ColorMap.put(\"light-green darken-2\", \"#689f38\")";
_colormap.Put((Object)("light-green darken-2"),(Object)("#689f38"));
 //BA.debugLineNum = 328;BA.debugLine="ColorMap.put(\"light-green darken-3\", \"#558b2f\")";
_colormap.Put((Object)("light-green darken-3"),(Object)("#558b2f"));
 //BA.debugLineNum = 329;BA.debugLine="ColorMap.put(\"light-green darken-4\", \"#33691e\")";
_colormap.Put((Object)("light-green darken-4"),(Object)("#33691e"));
 //BA.debugLineNum = 330;BA.debugLine="ColorMap.put(\"light-green accent-1\", \"#ccff90\")";
_colormap.Put((Object)("light-green accent-1"),(Object)("#ccff90"));
 //BA.debugLineNum = 331;BA.debugLine="ColorMap.put(\"light-green accent-2\", \"#b2ff59\")";
_colormap.Put((Object)("light-green accent-2"),(Object)("#b2ff59"));
 //BA.debugLineNum = 332;BA.debugLine="ColorMap.put(\"light-green accent-3\", \"#76ff03\")";
_colormap.Put((Object)("light-green accent-3"),(Object)("#76ff03"));
 //BA.debugLineNum = 333;BA.debugLine="ColorMap.put(\"light-green accent-4\", \"#64dd17\")";
_colormap.Put((Object)("light-green accent-4"),(Object)("#64dd17"));
 //BA.debugLineNum = 334;BA.debugLine="ColorMap.put(\"lime lighten-5\", \"#f9fbe7\")";
_colormap.Put((Object)("lime lighten-5"),(Object)("#f9fbe7"));
 //BA.debugLineNum = 335;BA.debugLine="ColorMap.put(\"lime lighten-4\", \"#f0f4c3\")";
_colormap.Put((Object)("lime lighten-4"),(Object)("#f0f4c3"));
 //BA.debugLineNum = 336;BA.debugLine="ColorMap.put(\"lime lighten-3\", \"#e6ee9c\")";
_colormap.Put((Object)("lime lighten-3"),(Object)("#e6ee9c"));
 //BA.debugLineNum = 337;BA.debugLine="ColorMap.put(\"lime lighten-2\", \"#dce775\")";
_colormap.Put((Object)("lime lighten-2"),(Object)("#dce775"));
 //BA.debugLineNum = 338;BA.debugLine="ColorMap.put(\"lime lighten-1\", \"#d4e157\")";
_colormap.Put((Object)("lime lighten-1"),(Object)("#d4e157"));
 //BA.debugLineNum = 339;BA.debugLine="ColorMap.put(\"lime\", \"#cddc39\")";
_colormap.Put((Object)("lime"),(Object)("#cddc39"));
 //BA.debugLineNum = 340;BA.debugLine="ColorMap.put(\"lime darken-1\", \"#c0ca33\")";
_colormap.Put((Object)("lime darken-1"),(Object)("#c0ca33"));
 //BA.debugLineNum = 341;BA.debugLine="ColorMap.put(\"lime darken-2\", \"#afb42b\")";
_colormap.Put((Object)("lime darken-2"),(Object)("#afb42b"));
 //BA.debugLineNum = 342;BA.debugLine="ColorMap.put(\"lime darken-3\", \"#9e9d24\")";
_colormap.Put((Object)("lime darken-3"),(Object)("#9e9d24"));
 //BA.debugLineNum = 343;BA.debugLine="ColorMap.put(\"lime darken-4\", \"#827717\")";
_colormap.Put((Object)("lime darken-4"),(Object)("#827717"));
 //BA.debugLineNum = 344;BA.debugLine="ColorMap.put(\"lime accent-1\", \"#f4ff81\")";
_colormap.Put((Object)("lime accent-1"),(Object)("#f4ff81"));
 //BA.debugLineNum = 345;BA.debugLine="ColorMap.put(\"lime accent-2\", \"#eeff41\")";
_colormap.Put((Object)("lime accent-2"),(Object)("#eeff41"));
 //BA.debugLineNum = 346;BA.debugLine="ColorMap.put(\"lime accent-3\", \"#c6ff00\")";
_colormap.Put((Object)("lime accent-3"),(Object)("#c6ff00"));
 //BA.debugLineNum = 347;BA.debugLine="ColorMap.put(\"lime accent-4\", \"#aeea00\")";
_colormap.Put((Object)("lime accent-4"),(Object)("#aeea00"));
 //BA.debugLineNum = 348;BA.debugLine="ColorMap.put(\"yellow lighten-5\", \"#fffde7\")";
_colormap.Put((Object)("yellow lighten-5"),(Object)("#fffde7"));
 //BA.debugLineNum = 349;BA.debugLine="ColorMap.put(\"yellow lighten-4\", \"#fff9c4\")";
_colormap.Put((Object)("yellow lighten-4"),(Object)("#fff9c4"));
 //BA.debugLineNum = 350;BA.debugLine="ColorMap.put(\"yellow lighten-3\", \"#fff59d\")";
_colormap.Put((Object)("yellow lighten-3"),(Object)("#fff59d"));
 //BA.debugLineNum = 351;BA.debugLine="ColorMap.put(\"yellow lighten-2\", \"#fff176\")";
_colormap.Put((Object)("yellow lighten-2"),(Object)("#fff176"));
 //BA.debugLineNum = 352;BA.debugLine="ColorMap.put(\"yellow lighten-1\", \"#ffee58\")";
_colormap.Put((Object)("yellow lighten-1"),(Object)("#ffee58"));
 //BA.debugLineNum = 353;BA.debugLine="ColorMap.put(\"yellow\", \"#ffeb3b\")";
_colormap.Put((Object)("yellow"),(Object)("#ffeb3b"));
 //BA.debugLineNum = 354;BA.debugLine="ColorMap.put(\"yellow darken-1\", \"#fdd835\")";
_colormap.Put((Object)("yellow darken-1"),(Object)("#fdd835"));
 //BA.debugLineNum = 355;BA.debugLine="ColorMap.put(\"yellow darken-2\", \"#fbc02d\")";
_colormap.Put((Object)("yellow darken-2"),(Object)("#fbc02d"));
 //BA.debugLineNum = 356;BA.debugLine="ColorMap.put(\"yellow darken-3\", \"#f9a825\")";
_colormap.Put((Object)("yellow darken-3"),(Object)("#f9a825"));
 //BA.debugLineNum = 357;BA.debugLine="ColorMap.put(\"yellow darken-4\", \"#f57f17\")";
_colormap.Put((Object)("yellow darken-4"),(Object)("#f57f17"));
 //BA.debugLineNum = 358;BA.debugLine="ColorMap.put(\"yellow accent-1\", \"#ffff8d\")";
_colormap.Put((Object)("yellow accent-1"),(Object)("#ffff8d"));
 //BA.debugLineNum = 359;BA.debugLine="ColorMap.put(\"yellow accent-2\", \"#ffff00\")";
_colormap.Put((Object)("yellow accent-2"),(Object)("#ffff00"));
 //BA.debugLineNum = 360;BA.debugLine="ColorMap.put(\"yellow accent-3\", \"#ffea00\")";
_colormap.Put((Object)("yellow accent-3"),(Object)("#ffea00"));
 //BA.debugLineNum = 361;BA.debugLine="ColorMap.put(\"yellow accent-4\", \"#ffd600\")";
_colormap.Put((Object)("yellow accent-4"),(Object)("#ffd600"));
 //BA.debugLineNum = 362;BA.debugLine="ColorMap.put(\"amber lighten-5\", \"#fff8e1\")";
_colormap.Put((Object)("amber lighten-5"),(Object)("#fff8e1"));
 //BA.debugLineNum = 363;BA.debugLine="ColorMap.put(\"amber lighten-4\", \"#ffecb3\")";
_colormap.Put((Object)("amber lighten-4"),(Object)("#ffecb3"));
 //BA.debugLineNum = 364;BA.debugLine="ColorMap.put(\"amber lighten-3\", \"#ffe082\")";
_colormap.Put((Object)("amber lighten-3"),(Object)("#ffe082"));
 //BA.debugLineNum = 365;BA.debugLine="ColorMap.put(\"amber lighten-2\", \"#ffd54f\")";
_colormap.Put((Object)("amber lighten-2"),(Object)("#ffd54f"));
 //BA.debugLineNum = 366;BA.debugLine="ColorMap.put(\"amber lighten-1\", \"#ffca28\")";
_colormap.Put((Object)("amber lighten-1"),(Object)("#ffca28"));
 //BA.debugLineNum = 367;BA.debugLine="ColorMap.put(\"amber\", \"#ffc107\")";
_colormap.Put((Object)("amber"),(Object)("#ffc107"));
 //BA.debugLineNum = 368;BA.debugLine="ColorMap.put(\"amber darken-1\", \"#ffb300\")";
_colormap.Put((Object)("amber darken-1"),(Object)("#ffb300"));
 //BA.debugLineNum = 369;BA.debugLine="ColorMap.put(\"amber darken-2\", \"#ffa000\")";
_colormap.Put((Object)("amber darken-2"),(Object)("#ffa000"));
 //BA.debugLineNum = 370;BA.debugLine="ColorMap.put(\"amber darken-3\", \"#ff8f00\")";
_colormap.Put((Object)("amber darken-3"),(Object)("#ff8f00"));
 //BA.debugLineNum = 371;BA.debugLine="ColorMap.put(\"amber darken-4\", \"#ff6f00\")";
_colormap.Put((Object)("amber darken-4"),(Object)("#ff6f00"));
 //BA.debugLineNum = 372;BA.debugLine="ColorMap.put(\"amber accent-1\", \"#ffe57f\")";
_colormap.Put((Object)("amber accent-1"),(Object)("#ffe57f"));
 //BA.debugLineNum = 373;BA.debugLine="ColorMap.put(\"amber accent-2\", \"#ffd740\")";
_colormap.Put((Object)("amber accent-2"),(Object)("#ffd740"));
 //BA.debugLineNum = 374;BA.debugLine="ColorMap.put(\"amber accent-3\", \"#ffc400\")";
_colormap.Put((Object)("amber accent-3"),(Object)("#ffc400"));
 //BA.debugLineNum = 375;BA.debugLine="ColorMap.put(\"amber accent-4\", \"#ffab00\")";
_colormap.Put((Object)("amber accent-4"),(Object)("#ffab00"));
 //BA.debugLineNum = 376;BA.debugLine="ColorMap.put(\"orange lighten-5\", \"#fff3e0\")";
_colormap.Put((Object)("orange lighten-5"),(Object)("#fff3e0"));
 //BA.debugLineNum = 377;BA.debugLine="ColorMap.put(\"orange lighten-4\", \"#ffe0b2\")";
_colormap.Put((Object)("orange lighten-4"),(Object)("#ffe0b2"));
 //BA.debugLineNum = 378;BA.debugLine="ColorMap.put(\"orange lighten-3\", \"#ffcc80\")";
_colormap.Put((Object)("orange lighten-3"),(Object)("#ffcc80"));
 //BA.debugLineNum = 379;BA.debugLine="ColorMap.put(\"orange lighten-2\", \"#ffb74d\")";
_colormap.Put((Object)("orange lighten-2"),(Object)("#ffb74d"));
 //BA.debugLineNum = 380;BA.debugLine="ColorMap.put(\"orange lighten-1\", \"#ffa726\")";
_colormap.Put((Object)("orange lighten-1"),(Object)("#ffa726"));
 //BA.debugLineNum = 381;BA.debugLine="ColorMap.put(\"orange\", \"#ff9800\")";
_colormap.Put((Object)("orange"),(Object)("#ff9800"));
 //BA.debugLineNum = 382;BA.debugLine="ColorMap.put(\"orange darken-1\", \"#fb8c00\")";
_colormap.Put((Object)("orange darken-1"),(Object)("#fb8c00"));
 //BA.debugLineNum = 383;BA.debugLine="ColorMap.put(\"orange darken-2\", \"#f57c00\")";
_colormap.Put((Object)("orange darken-2"),(Object)("#f57c00"));
 //BA.debugLineNum = 384;BA.debugLine="ColorMap.put(\"orange darken-3\", \"#ef6c00\")";
_colormap.Put((Object)("orange darken-3"),(Object)("#ef6c00"));
 //BA.debugLineNum = 385;BA.debugLine="ColorMap.put(\"orange darken-4\", \"#e65100\")";
_colormap.Put((Object)("orange darken-4"),(Object)("#e65100"));
 //BA.debugLineNum = 386;BA.debugLine="ColorMap.put(\"orange accent-1\", \"#ffd180\")";
_colormap.Put((Object)("orange accent-1"),(Object)("#ffd180"));
 //BA.debugLineNum = 387;BA.debugLine="ColorMap.put(\"orange accent-2\", \"#ffab40\")";
_colormap.Put((Object)("orange accent-2"),(Object)("#ffab40"));
 //BA.debugLineNum = 388;BA.debugLine="ColorMap.put(\"orange accent-3\", \"#ff9100\")";
_colormap.Put((Object)("orange accent-3"),(Object)("#ff9100"));
 //BA.debugLineNum = 389;BA.debugLine="ColorMap.put(\"orange accent-4\", \"#ff6d00\")";
_colormap.Put((Object)("orange accent-4"),(Object)("#ff6d00"));
 //BA.debugLineNum = 390;BA.debugLine="ColorMap.put(\"deep-orange lighten-5\", \"#fbe9e7\")";
_colormap.Put((Object)("deep-orange lighten-5"),(Object)("#fbe9e7"));
 //BA.debugLineNum = 391;BA.debugLine="ColorMap.put(\"deep-orange lighten-4\", \"#ffccbc\")";
_colormap.Put((Object)("deep-orange lighten-4"),(Object)("#ffccbc"));
 //BA.debugLineNum = 392;BA.debugLine="ColorMap.put(\"deep-orange lighten-3\", \"#ffab91\")";
_colormap.Put((Object)("deep-orange lighten-3"),(Object)("#ffab91"));
 //BA.debugLineNum = 393;BA.debugLine="ColorMap.put(\"deep-orange lighten-2\", \"#ff8a65\")";
_colormap.Put((Object)("deep-orange lighten-2"),(Object)("#ff8a65"));
 //BA.debugLineNum = 394;BA.debugLine="ColorMap.put(\"deep-orange lighten-1\", \"#ff7043\")";
_colormap.Put((Object)("deep-orange lighten-1"),(Object)("#ff7043"));
 //BA.debugLineNum = 395;BA.debugLine="ColorMap.put(\"deep-orange\", \"#ff5722\")";
_colormap.Put((Object)("deep-orange"),(Object)("#ff5722"));
 //BA.debugLineNum = 396;BA.debugLine="ColorMap.put(\"deep-orange darken-1\", \"#f4511e\")";
_colormap.Put((Object)("deep-orange darken-1"),(Object)("#f4511e"));
 //BA.debugLineNum = 397;BA.debugLine="ColorMap.put(\"deep-orange darken-2\", \"#e64a19\")";
_colormap.Put((Object)("deep-orange darken-2"),(Object)("#e64a19"));
 //BA.debugLineNum = 398;BA.debugLine="ColorMap.put(\"deep-orange darken-3\", \"#d84315\")";
_colormap.Put((Object)("deep-orange darken-3"),(Object)("#d84315"));
 //BA.debugLineNum = 399;BA.debugLine="ColorMap.put(\"deep-orange darken-4\", \"#bf360c\")";
_colormap.Put((Object)("deep-orange darken-4"),(Object)("#bf360c"));
 //BA.debugLineNum = 400;BA.debugLine="ColorMap.put(\"deep-orange accent-1\", \"#ff9e80\")";
_colormap.Put((Object)("deep-orange accent-1"),(Object)("#ff9e80"));
 //BA.debugLineNum = 401;BA.debugLine="ColorMap.put(\"deep-orange accent-2\", \"#ff6e40\")";
_colormap.Put((Object)("deep-orange accent-2"),(Object)("#ff6e40"));
 //BA.debugLineNum = 402;BA.debugLine="ColorMap.put(\"deep-orange accent-3\", \"#ff3d00\")";
_colormap.Put((Object)("deep-orange accent-3"),(Object)("#ff3d00"));
 //BA.debugLineNum = 403;BA.debugLine="ColorMap.put(\"deep-orange accent-4\", \"#dd2c00\")";
_colormap.Put((Object)("deep-orange accent-4"),(Object)("#dd2c00"));
 //BA.debugLineNum = 404;BA.debugLine="ColorMap.put(\"brown lighten-5\", \"#efebe9\")";
_colormap.Put((Object)("brown lighten-5"),(Object)("#efebe9"));
 //BA.debugLineNum = 405;BA.debugLine="ColorMap.put(\"brown lighten-4\", \"#d7ccc8\")";
_colormap.Put((Object)("brown lighten-4"),(Object)("#d7ccc8"));
 //BA.debugLineNum = 406;BA.debugLine="ColorMap.put(\"brown lighten-3\", \"#bcaaa4\")";
_colormap.Put((Object)("brown lighten-3"),(Object)("#bcaaa4"));
 //BA.debugLineNum = 407;BA.debugLine="ColorMap.put(\"brown lighten-2\", \"#a1887f\")";
_colormap.Put((Object)("brown lighten-2"),(Object)("#a1887f"));
 //BA.debugLineNum = 408;BA.debugLine="ColorMap.put(\"brown lighten-1\", \"#8d6e63\")";
_colormap.Put((Object)("brown lighten-1"),(Object)("#8d6e63"));
 //BA.debugLineNum = 409;BA.debugLine="ColorMap.put(\"brown\", \"#795548\")";
_colormap.Put((Object)("brown"),(Object)("#795548"));
 //BA.debugLineNum = 410;BA.debugLine="ColorMap.put(\"brown darken-1\", \"#6d4c41\")";
_colormap.Put((Object)("brown darken-1"),(Object)("#6d4c41"));
 //BA.debugLineNum = 411;BA.debugLine="ColorMap.put(\"brown darken-2\", \"#5d4037\")";
_colormap.Put((Object)("brown darken-2"),(Object)("#5d4037"));
 //BA.debugLineNum = 412;BA.debugLine="ColorMap.put(\"brown darken-3\", \"#4e342e\")";
_colormap.Put((Object)("brown darken-3"),(Object)("#4e342e"));
 //BA.debugLineNum = 413;BA.debugLine="ColorMap.put(\"brown darken-4\", \"#3e2723\")";
_colormap.Put((Object)("brown darken-4"),(Object)("#3e2723"));
 //BA.debugLineNum = 414;BA.debugLine="ColorMap.put(\"grey lighten-5\", \"#fafafa\")";
_colormap.Put((Object)("grey lighten-5"),(Object)("#fafafa"));
 //BA.debugLineNum = 415;BA.debugLine="ColorMap.put(\"grey lighten-4\", \"#f5f5f5\")";
_colormap.Put((Object)("grey lighten-4"),(Object)("#f5f5f5"));
 //BA.debugLineNum = 416;BA.debugLine="ColorMap.put(\"grey lighten-3\", \"#eeeeee\")";
_colormap.Put((Object)("grey lighten-3"),(Object)("#eeeeee"));
 //BA.debugLineNum = 417;BA.debugLine="ColorMap.put(\"grey lighten-2\", \"#e0e0e0\")";
_colormap.Put((Object)("grey lighten-2"),(Object)("#e0e0e0"));
 //BA.debugLineNum = 418;BA.debugLine="ColorMap.put(\"grey lighten-1\", \"#bdbdbd\")";
_colormap.Put((Object)("grey lighten-1"),(Object)("#bdbdbd"));
 //BA.debugLineNum = 419;BA.debugLine="ColorMap.put(\"grey\", \"#9e9e9e\")";
_colormap.Put((Object)("grey"),(Object)("#9e9e9e"));
 //BA.debugLineNum = 420;BA.debugLine="ColorMap.put(\"grey darken-1\", \"#757575\")";
_colormap.Put((Object)("grey darken-1"),(Object)("#757575"));
 //BA.debugLineNum = 421;BA.debugLine="ColorMap.put(\"grey darken-2\", \"#616161\")";
_colormap.Put((Object)("grey darken-2"),(Object)("#616161"));
 //BA.debugLineNum = 422;BA.debugLine="ColorMap.put(\"grey darken-3\", \"#424242\")";
_colormap.Put((Object)("grey darken-3"),(Object)("#424242"));
 //BA.debugLineNum = 423;BA.debugLine="ColorMap.put(\"grey darken-4\", \"#212121\")";
_colormap.Put((Object)("grey darken-4"),(Object)("#212121"));
 //BA.debugLineNum = 424;BA.debugLine="ColorMap.put(\"blue-grey lighten-5\", \"#eceff1\")";
_colormap.Put((Object)("blue-grey lighten-5"),(Object)("#eceff1"));
 //BA.debugLineNum = 425;BA.debugLine="ColorMap.put(\"blue-grey lighten-4\", \"#cfd8dc\")";
_colormap.Put((Object)("blue-grey lighten-4"),(Object)("#cfd8dc"));
 //BA.debugLineNum = 426;BA.debugLine="ColorMap.put(\"blue-grey lighten-3\", \"#b0bec5\")";
_colormap.Put((Object)("blue-grey lighten-3"),(Object)("#b0bec5"));
 //BA.debugLineNum = 427;BA.debugLine="ColorMap.put(\"blue-grey lighten-2\", \"#90a4ae\")";
_colormap.Put((Object)("blue-grey lighten-2"),(Object)("#90a4ae"));
 //BA.debugLineNum = 428;BA.debugLine="ColorMap.put(\"blue-grey lighten-1\", \"#78909c\")";
_colormap.Put((Object)("blue-grey lighten-1"),(Object)("#78909c"));
 //BA.debugLineNum = 429;BA.debugLine="ColorMap.put(\"blue-grey\", \"#607d8b\")";
_colormap.Put((Object)("blue-grey"),(Object)("#607d8b"));
 //BA.debugLineNum = 430;BA.debugLine="ColorMap.put(\"blue-grey darken-1\", \"#546e7a\")";
_colormap.Put((Object)("blue-grey darken-1"),(Object)("#546e7a"));
 //BA.debugLineNum = 431;BA.debugLine="ColorMap.put(\"blue-grey darken-2\", \"#455a64\")";
_colormap.Put((Object)("blue-grey darken-2"),(Object)("#455a64"));
 //BA.debugLineNum = 432;BA.debugLine="ColorMap.put(\"blue-grey darken-3\", \"#37474f\")";
_colormap.Put((Object)("blue-grey darken-3"),(Object)("#37474f"));
 //BA.debugLineNum = 433;BA.debugLine="ColorMap.put(\"blue-grey darken-4\", \"#263238\")";
_colormap.Put((Object)("blue-grey darken-4"),(Object)("#263238"));
 //BA.debugLineNum = 434;BA.debugLine="ColorMap.put(\"black\", \"#000000\")";
_colormap.Put((Object)("black"),(Object)("#000000"));
 //BA.debugLineNum = 435;BA.debugLine="ColorMap.put(\"white\", \"#ffffff\")";
_colormap.Put((Object)("white"),(Object)("#ffffff"));
 //BA.debugLineNum = 436;BA.debugLine="ColorMap.put(\"transparent\", \"transparent\")";
_colormap.Put((Object)("transparent"),(Object)("transparent"));
 //BA.debugLineNum = 438;BA.debugLine="TargetOptions.Put(\"\",\"None\")";
_targetoptions.Put((Object)(""),(Object)("None"));
 //BA.debugLineNum = 439;BA.debugLine="TargetOptions.Put(\"_blank\",\"Blank\")";
_targetoptions.Put((Object)("_blank"),(Object)("Blank"));
 //BA.debugLineNum = 440;BA.debugLine="TargetOptions.Put(\"_self\",\"Self\")";
_targetoptions.Put((Object)("_self"),(Object)("Self"));
 //BA.debugLineNum = 441;BA.debugLine="TargetOptions.Put(\"_parent\",\"Parent\")";
_targetoptions.Put((Object)("_parent"),(Object)("Parent"));
 //BA.debugLineNum = 442;BA.debugLine="TargetOptions.Put(\"_top\",\"Top\")";
_targetoptions.Put((Object)("_top"),(Object)("Top"));
 //BA.debugLineNum = 444;BA.debugLine="ColumnTypes.Initialize";
_columntypes.Initialize();
 //BA.debugLineNum = 445;BA.debugLine="ColumnTypes.put(\"date\",\"Date\")";
_columntypes.Put((Object)("date"),(Object)("Date"));
 //BA.debugLineNum = 446;BA.debugLine="ColumnTypes.put(\"text\", \"Text\")";
_columntypes.Put((Object)("text"),(Object)("Text"));
 //BA.debugLineNum = 447;BA.debugLine="ColumnTypes.put(\"icon\", \"Icon\")";
_columntypes.Put((Object)("icon"),(Object)("Icon"));
 //BA.debugLineNum = 448;BA.debugLine="ColumnTypes.put(\"checkbox\", \"Check Box\")";
_columntypes.Put((Object)("checkbox"),(Object)("Check Box"));
 //BA.debugLineNum = 449;BA.debugLine="ColumnTypes.put(\"\", \"None\")";
_columntypes.Put((Object)(""),(Object)("None"));
 //BA.debugLineNum = 450;BA.debugLine="ColumnTypes.put(\"time\",\"Time\")";
_columntypes.Put((Object)("time"),(Object)("Time"));
 //BA.debugLineNum = 451;BA.debugLine="ColumnTypes.put(\"datetime\",\"Date Time\")";
_columntypes.Put((Object)("datetime"),(Object)("Date Time"));
 //BA.debugLineNum = 452;BA.debugLine="ColumnTypes.put(\"image\",\"Image\")";
_columntypes.Put((Object)("image"),(Object)("Image"));
 //BA.debugLineNum = 453;BA.debugLine="ColumnTypes.Put(\"money\",\"Money\")";
_columntypes.Put((Object)("money"),(Object)("Money"));
 //BA.debugLineNum = 454;BA.debugLine="ColumnTypes.put(\"filesize\", \"File Size\")";
_columntypes.Put((Object)("filesize"),(Object)("File Size"));
 //BA.debugLineNum = 455;BA.debugLine="ColumnTypes.put(\"chip\",\"Chip\")";
_columntypes.Put((Object)("chip"),(Object)("Chip"));
 //BA.debugLineNum = 456;BA.debugLine="ColumnTypes.put(\"edit\",\"Edit\")";
_columntypes.Put((Object)("edit"),(Object)("Edit"));
 //BA.debugLineNum = 457;BA.debugLine="ColumnTypes.put(\"delete\",\"Delete\")";
_columntypes.Put((Object)("delete"),(Object)("Delete"));
 //BA.debugLineNum = 458;BA.debugLine="ColumnTypes.put(\"action\",\"Action\")";
_columntypes.Put((Object)("action"),(Object)("Action"));
 //BA.debugLineNum = 459;BA.debugLine="ColumnTypes.put(\"save\",\"Save\")";
_columntypes.Put((Object)("save"),(Object)("Save"));
 //BA.debugLineNum = 460;BA.debugLine="ColumnTypes.put(\"cancel\",\"Cancel\")";
_columntypes.Put((Object)("cancel"),(Object)("Cancel"));
 //BA.debugLineNum = 461;BA.debugLine="ColumnTypes.Put(\"switch\", \"Switch\")";
_columntypes.Put((Object)("switch"),(Object)("Switch"));
 //BA.debugLineNum = 462;BA.debugLine="ColumnTypes.put(\"avatarimg\", \"Avatar\")";
_columntypes.Put((Object)("avatarimg"),(Object)("Avatar"));
 //BA.debugLineNum = 463;BA.debugLine="ColumnTypes.Put(\"rating\", \"Rating\")";
_columntypes.Put((Object)("rating"),(Object)("Rating"));
 //BA.debugLineNum = 464;BA.debugLine="ColumnTypes.Put(\"progresscircular\", \"ProgressCirc";
_columntypes.Put((Object)("progresscircular"),(Object)("ProgressCircular"));
 //BA.debugLineNum = 465;BA.debugLine="ColumnTypes.Put(\"progresslinear\", \"ProgressLinear";
_columntypes.Put((Object)("progresslinear"),(Object)("ProgressLinear"));
 //BA.debugLineNum = 467;BA.debugLine="ColumnAlign.Initialize";
_columnalign.Initialize();
 //BA.debugLineNum = 468;BA.debugLine="ColumnAlign.Put(\"start\", \"Start\")";
_columnalign.Put((Object)("start"),(Object)("Start"));
 //BA.debugLineNum = 469;BA.debugLine="ColumnAlign.Put(\"center\", \"Center\")";
_columnalign.Put((Object)("center"),(Object)("Center"));
 //BA.debugLineNum = 470;BA.debugLine="ColumnAlign.Put(\"end\", \"End\")";
_columnalign.Put((Object)("end"),(Object)("End"));
 //BA.debugLineNum = 472;BA.debugLine="DataTypes.Initialize";
_datatypes.Initialize();
 //BA.debugLineNum = 473;BA.debugLine="DataTypes.Put(\"BOOL\", \"Boolean\")";
_datatypes.Put((Object)("BOOL"),(Object)("Boolean"));
 //BA.debugLineNum = 474;BA.debugLine="DataTypes.Put(\"INT\", \"Integer\")";
_datatypes.Put((Object)("INT"),(Object)("Integer"));
 //BA.debugLineNum = 475;BA.debugLine="DataTypes.Put(\"TEXT\", \"Text\")";
_datatypes.Put((Object)("TEXT"),(Object)("Text"));
 //BA.debugLineNum = 476;BA.debugLine="DataTypes.Put(\"FLOAT\", \"Double\")";
_datatypes.Put((Object)("FLOAT"),(Object)("Double"));
 //BA.debugLineNum = 477;BA.debugLine="DataTypes.Put(\"BLOB\", \"Blob\")";
_datatypes.Put((Object)("BLOB"),(Object)("Blob"));
 //BA.debugLineNum = 478;BA.debugLine="DataTypes.Put(\"DATE\", \"Date\")";
_datatypes.Put((Object)("DATE"),(Object)("Date"));
 //BA.debugLineNum = 479;BA.debugLine="DataTypes.Put(\"None\", \"None\")";
_datatypes.Put((Object)("None"),(Object)("None"));
 //BA.debugLineNum = 481;BA.debugLine="HashType.Initialize";
_hashtype.Initialize();
 //BA.debugLineNum = 482;BA.debugLine="HashType.Put(\"MD5\", \"MD5\")";
_hashtype.Put((Object)("MD5"),(Object)("MD5"));
 //BA.debugLineNum = 483;BA.debugLine="HashType.Put(\"SHA1\", \"SHA1\")";
_hashtype.Put((Object)("SHA1"),(Object)("SHA1"));
 //BA.debugLineNum = 484;BA.debugLine="HashType.Put(\"SHA256\", \"SHA256\")";
_hashtype.Put((Object)("SHA256"),(Object)("SHA256"));
 //BA.debugLineNum = 485;BA.debugLine="HashType.Put(\"SHA512\", \"SHA512\")";
_hashtype.Put((Object)("SHA512"),(Object)("SHA512"));
 //BA.debugLineNum = 486;BA.debugLine="HashType.Put(\"RMD160\", \"RMD160\")";
_hashtype.Put((Object)("RMD160"),(Object)("RMD160"));
 //BA.debugLineNum = 487;BA.debugLine="HashType.Put(\"\", \"None\")";
_hashtype.Put((Object)(""),(Object)("None"));
 //BA.debugLineNum = 489;BA.debugLine="Algorithm.Initialize";
_algorithm.Initialize();
 //BA.debugLineNum = 490;BA.debugLine="Algorithm.Put(\"hex\", \"hex\")";
_algorithm.Put((Object)("hex"),(Object)("hex"));
 //BA.debugLineNum = 491;BA.debugLine="Algorithm.Put(\"b64\", \"b64\")";
_algorithm.Put((Object)("b64"),(Object)("b64"));
 //BA.debugLineNum = 492;BA.debugLine="Algorithm.Put(\"hex_hmac\", \"hex_hmac\")";
_algorithm.Put((Object)("hex_hmac"),(Object)("hex_hmac"));
 //BA.debugLineNum = 493;BA.debugLine="Algorithm.Put(\"b64_hmac\", \"b64_hmac\")";
_algorithm.Put((Object)("b64_hmac"),(Object)("b64_hmac"));
 //BA.debugLineNum = 494;BA.debugLine="Algorithm.Put(\"\", \"None\")";
_algorithm.Put((Object)(""),(Object)("None"));
 //BA.debugLineNum = 496;BA.debugLine="ControlTypes.Initialize";
_controltypes.Initialize();
 //BA.debugLineNum = 497;BA.debugLine="ControlTypes.put(\"text\", \"Text\")";
_controltypes.Put((Object)("text"),(Object)("Text"));
 //BA.debugLineNum = 498;BA.debugLine="ControlTypes.put(\"textarea\", \"Text Area\")";
_controltypes.Put((Object)("textarea"),(Object)("Text Area"));
 //BA.debugLineNum = 499;BA.debugLine="ControlTypes.put(\"checkbox\", \"Check Box\")";
_controltypes.Put((Object)("checkbox"),(Object)("Check Box"));
 //BA.debugLineNum = 500;BA.debugLine="ControlTypes.put(\"date\", \"Date\")";
_controltypes.Put((Object)("date"),(Object)("Date"));
 //BA.debugLineNum = 501;BA.debugLine="ControlTypes.put(\"file\", \"File\")";
_controltypes.Put((Object)("file"),(Object)("File"));
 //BA.debugLineNum = 502;BA.debugLine="ControlTypes.put(\"radio\", \"Radio\")";
_controltypes.Put((Object)("radio"),(Object)("Radio"));
 //BA.debugLineNum = 503;BA.debugLine="ControlTypes.put(\"select\", \"Select\")";
_controltypes.Put((Object)("select"),(Object)("Select"));
 //BA.debugLineNum = 504;BA.debugLine="ControlTypes.put(\"slider\", \"Slider\")";
_controltypes.Put((Object)("slider"),(Object)("Slider"));
 //BA.debugLineNum = 505;BA.debugLine="ControlTypes.put(\"switch\", \"Switch\")";
_controltypes.Put((Object)("switch"),(Object)("Switch"));
 //BA.debugLineNum = 506;BA.debugLine="ControlTypes.put(\"label\", \"Label\")";
_controltypes.Put((Object)("label"),(Object)("Label"));
 //BA.debugLineNum = 507;BA.debugLine="ControlTypes.put(\"email\", \"Email\")";
_controltypes.Put((Object)("email"),(Object)("Email"));
 //BA.debugLineNum = 508;BA.debugLine="ControlTypes.put(\"rating\", \"Rating\")";
_controltypes.Put((Object)("rating"),(Object)("Rating"));
 //BA.debugLineNum = 509;BA.debugLine="ControlTypes.put(\"password\", \"Password\")";
_controltypes.Put((Object)("password"),(Object)("Password"));
 //BA.debugLineNum = 510;BA.debugLine="ControlTypes.put(\"tel\", \"Telephone\")";
_controltypes.Put((Object)("tel"),(Object)("Telephone"));
 //BA.debugLineNum = 511;BA.debugLine="ControlTypes.put(\"time\", \"Time\")";
_controltypes.Put((Object)("time"),(Object)("Time"));
 //BA.debugLineNum = 512;BA.debugLine="ControlTypes.put(\"combo\", \"Combo\")";
_controltypes.Put((Object)("combo"),(Object)("Combo"));
 //BA.debugLineNum = 513;BA.debugLine="ControlTypes.put(\"auto\", \"Auto Complete\")";
_controltypes.Put((Object)("auto"),(Object)("Auto Complete"));
 //BA.debugLineNum = 514;BA.debugLine="ControlTypes.put(\"profile\", \"Profile\")";
_controltypes.Put((Object)("profile"),(Object)("Profile"));
 //BA.debugLineNum = 515;BA.debugLine="ControlTypes.put(\"image\", \"Image\")";
_controltypes.Put((Object)("image"),(Object)("Image"));
 //BA.debugLineNum = 516;BA.debugLine="ControlTypes.put(\"button\", \"Button\")";
_controltypes.Put((Object)("button"),(Object)("Button"));
 //BA.debugLineNum = 517;BA.debugLine="ControlTypes.put(\"icon\", \"Icon\")";
_controltypes.Put((Object)("icon"),(Object)("Icon"));
 //BA.debugLineNum = 518;BA.debugLine="ControlTypes.put(\"parallax\", \"Parallax\")";
_controltypes.Put((Object)("parallax"),(Object)("Parallax"));
 //BA.debugLineNum = 519;BA.debugLine="ControlTypes.put(\"container\", \"Container\")";
_controltypes.Put((Object)("container"),(Object)("Container"));
 //BA.debugLineNum = 520;BA.debugLine="ControlTypes.put(\"menu\", \"Menu\")";
_controltypes.Put((Object)("menu"),(Object)("Menu"));
 //BA.debugLineNum = 521;BA.debugLine="ControlTypes.put(\"carousel\", \"Carousel\")";
_controltypes.Put((Object)("carousel"),(Object)("Carousel"));
 //BA.debugLineNum = 522;BA.debugLine="ControlTypes.put(\"speeddial\", \"Speed Dial\")";
_controltypes.Put((Object)("speeddial"),(Object)("Speed Dial"));
 //BA.debugLineNum = 523;BA.debugLine="ControlTypes.Put(\"quill\", \"Quill Editor\")";
_controltypes.Put((Object)("quill"),(Object)("Quill Editor"));
 //BA.debugLineNum = 524;BA.debugLine="ControlTypes.Put(\"None\", \"None\")";
_controltypes.Put((Object)("None"),(Object)("None"));
 //BA.debugLineNum = 525;BA.debugLine="ControlTypes.Put(\"rangeslider\", \"Range Slider\")";
_controltypes.Put((Object)("rangeslider"),(Object)("Range Slider"));
 //BA.debugLineNum = 526;BA.debugLine="ControlTypes.Put(\"infobox\", \"Info Box\")";
_controltypes.Put((Object)("infobox"),(Object)("Info Box"));
 //BA.debugLineNum = 527;BA.debugLine="ControlTypes.Put(\"fileselect\", \"File Select\")";
_controltypes.Put((Object)("fileselect"),(Object)("File Select"));
 //BA.debugLineNum = 528;BA.debugLine="ControlTypes.Put(\"sparkline\", \"Sparkline\")";
_controltypes.Put((Object)("sparkline"),(Object)("Sparkline"));
 //BA.debugLineNum = 529;BA.debugLine="ControlTypes.Put(\"number\", \"Number\")";
_controltypes.Put((Object)("number"),(Object)("Number"));
 //BA.debugLineNum = 535;BA.debugLine="ShowWarnings = True";
_showwarnings = __c.True;
 //BA.debugLineNum = 536;BA.debugLine="bindings.Initialize";
_bindings.Initialize();
 //BA.debugLineNum = 537;BA.debugLine="End Sub";
return "";
}
public String  _inquotes(String _svalue) throws Exception{
 //BA.debugLineNum = 2074;BA.debugLine="Public Sub InQuotes(sValue As String) As String";
 //BA.debugLineNum = 2075;BA.debugLine="Return QUOTE & sValue & QUOTE";
if (true) return __c.QUOTE+_svalue+__c.QUOTE;
 //BA.debugLineNum = 2076;BA.debugLine="End Sub";
return "";
}
public int  _instr(String _text,String _sfind) throws Exception{
 //BA.debugLineNum = 1463;BA.debugLine="Sub InStr(Text As String, sFind As String) As Int";
 //BA.debugLineNum = 1464;BA.debugLine="Return Text.tolowercase.IndexOf(sFind.tolowercase";
if (true) return _text.toLowerCase().indexOf(_sfind.toLowerCase());
 //BA.debugLineNum = 1465;BA.debugLine="End Sub";
return 0;
}
public long  _instrrev(String _value,String _search) throws Exception{
 //BA.debugLineNum = 1656;BA.debugLine="Sub InStrRev(value As String, search As String) As";
 //BA.debugLineNum = 1657;BA.debugLine="Return value.LastIndexOf(search) + 1";
if (true) return (long) (_value.lastIndexOf(_search)+1);
 //BA.debugLineNum = 1658;BA.debugLine="End Sub";
return 0L;
}
public String  _join(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 1109;BA.debugLine="Sub Join(delimiter As String, lst As List) As Stri";
 //BA.debugLineNum = 1110;BA.debugLine="If lst.Size = 0 Then Return \"\"";
if (_lst.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 1111;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 1112;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1113;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 1114;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1115;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 1116;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 1117;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 1118;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 1119;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 1121;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1122;BA.debugLine="End Sub";
return "";
}
public String  _joinfields(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 3946;BA.debugLine="Sub JoinFields(delimiter As String, lst As List) A";
 //BA.debugLineNum = 3947;BA.debugLine="If lst.Size = 0 Then Return \"\"";
if (_lst.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 3948;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 3949;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 3950;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 3951;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 3952;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 3953;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 3954;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 3955;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 3956;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 3957;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 3958;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 3960;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 3961;BA.debugLine="End Sub";
return "";
}
public String  _joinfields1(String _delimiter,String _squote,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
String _xfld = "";
 //BA.debugLineNum = 3964;BA.debugLine="Sub JoinFields1(delimiter As String, sQuote As Str";
 //BA.debugLineNum = 3965;BA.debugLine="If lst.Size = 0 Then Return \"\"";
if (_lst.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 3966;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 3967;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 3968;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 3969;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 3970;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 3971;BA.debugLine="Dim xfld As String = $\"${fld}\"$";
_xfld = (""+__c.SmartStringFormatter("",(Object)(_fld))+"");
 //BA.debugLineNum = 3972;BA.debugLine="xfld = sQuote & xfld & sQuote";
_xfld = _squote+_xfld+_squote;
 //BA.debugLineNum = 3973;BA.debugLine="sb.Append(xfld)";
_sb.Append(_xfld);
 //BA.debugLineNum = 3974;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 3975;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 3976;BA.debugLine="Dim xfld As String = $\"${fld}\"$";
_xfld = (""+__c.SmartStringFormatter("",(Object)(_fld))+"");
 //BA.debugLineNum = 3977;BA.debugLine="xfld = sQuote & xfld & sQuote";
_xfld = _squote+_xfld+_squote;
 //BA.debugLineNum = 3978;BA.debugLine="sb.Append(delimiter).Append(xfld)";
_sb.Append(_delimiter).Append(_xfld);
 }
};
 //BA.debugLineNum = 3980;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 3981;BA.debugLine="End Sub";
return "";
}
public String  _joinitems(String _delimiter,String _squote,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
String _xfld = "";
 //BA.debugLineNum = 4148;BA.debugLine="Sub JoinItems(delimiter As String, sQuote As Strin";
 //BA.debugLineNum = 4149;BA.debugLine="If lst.Size = 0 Then Return \"\"";
if (_lst.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 4150;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 4151;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 4152;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 4153;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 4154;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 4155;BA.debugLine="Dim xfld As String = $\"${fld}\"$";
_xfld = (""+__c.SmartStringFormatter("",(Object)(_fld))+"");
 //BA.debugLineNum = 4156;BA.debugLine="xfld = sQuote & xfld & sQuote";
_xfld = _squote+_xfld+_squote;
 //BA.debugLineNum = 4157;BA.debugLine="sb.Append(xfld)";
_sb.Append(_xfld);
 //BA.debugLineNum = 4158;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 4159;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 4160;BA.debugLine="Dim xfld As String = $\"${fld}\"$";
_xfld = (""+__c.SmartStringFormatter("",(Object)(_fld))+"");
 //BA.debugLineNum = 4161;BA.debugLine="xfld = sQuote & xfld & sQuote";
_xfld = _squote+_xfld+_squote;
 //BA.debugLineNum = 4162;BA.debugLine="sb.Append(delimiter).Append(xfld)";
_sb.Append(_delimiter).Append(_xfld);
 }
};
 //BA.debugLineNum = 4164;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 4165;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _joinlists(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
anywheresoftware.b4a.objects.collections.List _lo = null;
Object _k = null;
 //BA.debugLineNum = 1509;BA.debugLine="Sub JoinLists(lst As List) As List";
 //BA.debugLineNum = 1510;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1511;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 1512;BA.debugLine="For Each lo As List In lst";
_lo = new anywheresoftware.b4a.objects.collections.List();
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_lo = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(group3.Get(index3)));
 //BA.debugLineNum = 1513;BA.debugLine="For Each k As Object In lo";
{
final anywheresoftware.b4a.BA.IterableList group4 = _lo;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = group4.Get(index4);
 //BA.debugLineNum = 1514;BA.debugLine="nl.Add(k)";
_nl.Add(_k);
 }
};
 }
};
 //BA.debugLineNum = 1517;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 1518;BA.debugLine="End Sub";
return null;
}
public String  _joinmapkeys(anywheresoftware.b4a.objects.collections.Map _m,String _delim) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _strkey = "";
 //BA.debugLineNum = 1063;BA.debugLine="Sub JoinMapKeys(m As Map, delim As String) As Stri";
 //BA.debugLineNum = 1064;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1065;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1066;BA.debugLine="Dim kTot As Int = m.Size - 1";
_ktot = (int) (_m.getSize()-1);
 //BA.debugLineNum = 1067;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 1068;BA.debugLine="Dim strKey As String = m.getkeyat(0)";
_strkey = BA.ObjectToString(_m.GetKeyAt((int) (0)));
 //BA.debugLineNum = 1069;BA.debugLine="sb.Append(strKey)";
_sb.Append(_strkey);
 //BA.debugLineNum = 1070;BA.debugLine="For kCnt = 1 To kTot";
{
final int step7 = 1;
final int limit7 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit7 ;_kcnt = _kcnt + step7 ) {
 //BA.debugLineNum = 1071;BA.debugLine="Dim strKey As String = m.getkeyat(kCnt)";
_strkey = BA.ObjectToString(_m.GetKeyAt(_kcnt));
 //BA.debugLineNum = 1072;BA.debugLine="sb.Append(delim).append(strKey)";
_sb.Append(_delim).Append(_strkey);
 }
};
 //BA.debugLineNum = 1074;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1075;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _joinmaps(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
anywheresoftware.b4a.objects.collections.Map _mr = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 1496;BA.debugLine="Sub JoinMaps(lst As List) As Map";
 //BA.debugLineNum = 1497;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1498;BA.debugLine="If lst.Size = 0 Then Return nm";
if (_lst.getSize()==0) { 
if (true) return _nm;};
 //BA.debugLineNum = 1499;BA.debugLine="For Each mr As Map In lst";
_mr = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_mr = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group3.Get(index3)));
 //BA.debugLineNum = 1500;BA.debugLine="For Each k As String In mr.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _mr.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 1501;BA.debugLine="Dim v As Object = mr.Get(k)";
_v = _mr.Get((Object)(_k));
 //BA.debugLineNum = 1502;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 }
};
 //BA.debugLineNum = 1505;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 1506;BA.debugLine="End Sub";
return null;
}
public String  _joinnonblanks(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _str = "";
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 1468;BA.debugLine="Sub JoinNonBlanks(delimiter As String, lst As List";
 //BA.debugLineNum = 1469;BA.debugLine="If lst.size = 0 Then Return \"\"";
if (_lst.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 1471;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1472;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 1473;BA.debugLine="For Each str As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group4 = _lst;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_str = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 1474;BA.debugLine="str = str.Trim";
_str = _str.trim();
 //BA.debugLineNum = 1475;BA.debugLine="If str.Length > 0 Then";
if (_str.length()>0) { 
 //BA.debugLineNum = 1476;BA.debugLine="nl.Add(str)";
_nl.Add((Object)(_str));
 };
 }
};
 //BA.debugLineNum = 1479;BA.debugLine="If nl.Size = 0 Then Return \"\"";
if (_nl.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 1481;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 1482;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1483;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 1484;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1485;BA.debugLine="fld = nl.Get(0)";
_fld = BA.ObjectToString(_nl.Get((int) (0)));
 //BA.debugLineNum = 1486;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 1487;BA.debugLine="For i = 1 To nl.size - 1";
{
final int step17 = 1;
final int limit17 = (int) (_nl.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
 //BA.debugLineNum = 1488;BA.debugLine="Dim fld As String = nl.Get(i)";
_fld = BA.ObjectToString(_nl.Get(_i));
 //BA.debugLineNum = 1489;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 1491;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1492;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _json2list(String _strvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
com.ab.banano.BANanoJSONParser _parser = null;
 //BA.debugLineNum = 1866;BA.debugLine="Sub Json2List(strValue As String) As List";
 //BA.debugLineNum = 1867;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1868;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 1869;BA.debugLine="lst.clear";
_lst.Clear();
 //BA.debugLineNum = 1870;BA.debugLine="If strValue.Length = 0 Then";
if (_strvalue.length()==0) { 
 //BA.debugLineNum = 1871;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 1873;BA.debugLine="Try";
try { //BA.debugLineNum = 1874;BA.debugLine="Dim parser As BANanoJSONParser";
_parser = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 1875;BA.debugLine="parser.Initialize(strValue)";
_parser.Initialize(_strvalue);
 //BA.debugLineNum = 1876;BA.debugLine="Return parser.NextArray";
if (true) return _parser.NextArray();
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 1878;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 1880;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(String _strjson) throws Exception{
com.ab.banano.BANanoJSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
 //BA.debugLineNum = 1808;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
 //BA.debugLineNum = 1809;BA.debugLine="Dim json As BANanoJSONParser";
_json = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 1810;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1811;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 1812;BA.debugLine="Map1.clear";
_map1.Clear();
 //BA.debugLineNum = 1813;BA.debugLine="Try";
try { //BA.debugLineNum = 1814;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
 //BA.debugLineNum = 1815;BA.debugLine="json.Initialize(strJSON)";
_json.Initialize(_strjson);
 //BA.debugLineNum = 1816;BA.debugLine="Map1 = json.NextObject";
_map1 = _json.NextObject();
 };
 //BA.debugLineNum = 1818;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 1820;BA.debugLine="Return Map1";
if (true) return _map1;
 };
 //BA.debugLineNum = 1822;BA.debugLine="End Sub";
return null;
}
public String  _jsonpretty(Object _m) throws Exception{
String _pretty = "";
 //BA.debugLineNum = 1448;BA.debugLine="Sub JSONPretty(m As Object) As String";
 //BA.debugLineNum = 1449;BA.debugLine="Dim pretty As String = BANAno.RunJavascriptMethod";
_pretty = BA.ObjectToString(_banano.RunJavascriptMethod("JSON.stringify",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_m,__c.Null,(Object)(4)})));
 //BA.debugLineNum = 1450;BA.debugLine="Return pretty";
if (true) return _pretty;
 //BA.debugLineNum = 1451;BA.debugLine="End Sub";
return "";
}
public String  _jsonsetproperty(String _sjson,anywheresoftware.b4a.objects.collections.Map _updates) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
String _k = "";
Object _v = null;
String _sout = "";
 //BA.debugLineNum = 2397;BA.debugLine="Sub JSONSetProperty(sjson As String, updates As Ma";
 //BA.debugLineNum = 2398;BA.debugLine="Dim m As Map = BANAno.FromJson(sjson)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_banano.FromJson((Object)(_sjson))));
 //BA.debugLineNum = 2399;BA.debugLine="For Each k As String In updates.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _updates.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 2400;BA.debugLine="Dim v As Object = updates.Get(k)";
_v = _updates.Get((Object)(_k));
 //BA.debugLineNum = 2401;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 2403;BA.debugLine="Dim sout As String = BANAno.ToJson(m)";
_sout = BA.ObjectToString(_banano.ToJson((Object)(_m.getObject())));
 //BA.debugLineNum = 2404;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 2405;BA.debugLine="End Sub";
return "";
}
public String  _jsonvalues2lowercase(String _sjson,anywheresoftware.b4a.objects.collections.List _props) throws Exception{
anywheresoftware.b4a.objects.collections.Map _jmap = null;
String _njson = "";
 //BA.debugLineNum = 1784;BA.debugLine="Sub JSONValues2LowerCase(sJSON As String, props As";
 //BA.debugLineNum = 1786;BA.debugLine="Dim jmap As Map = Json2Map(sJSON)";
_jmap = new anywheresoftware.b4a.objects.collections.Map();
_jmap = _json2map(_sjson);
 //BA.debugLineNum = 1787;BA.debugLine="MapValues2LowerCase(jmap, props)";
_mapvalues2lowercase(_jmap,_props);
 //BA.debugLineNum = 1788;BA.debugLine="Dim nJSON As String = Map2Json(jmap)";
_njson = _map2json(_jmap);
 //BA.debugLineNum = 1789;BA.debugLine="Return nJSON";
if (true) return _njson;
 //BA.debugLineNum = 1790;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _keyvalues2map(String _delim,String _keys,String _values) throws Exception{
anywheresoftware.b4a.objects.collections.List _rkeys = null;
anywheresoftware.b4a.objects.collections.List _rvalues = null;
anywheresoftware.b4a.objects.collections.Map _optm = null;
int _rtot = 0;
int _vtot = 0;
int _rcnt = 0;
String _k = "";
String _v = "";
 //BA.debugLineNum = 1139;BA.debugLine="Sub KeyValues2Map(delim As String, keys As String,";
 //BA.debugLineNum = 1140;BA.debugLine="Dim rkeys As List = StrParse(delim, keys)";
_rkeys = new anywheresoftware.b4a.objects.collections.List();
_rkeys = _strparse(_delim,_keys);
 //BA.debugLineNum = 1141;BA.debugLine="Dim rvalues As List = StrParse(delim, values)";
_rvalues = new anywheresoftware.b4a.objects.collections.List();
_rvalues = _strparse(_delim,_values);
 //BA.debugLineNum = 1143;BA.debugLine="Dim optm As Map = CreateMap()";
_optm = new anywheresoftware.b4a.objects.collections.Map();
_optm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1145;BA.debugLine="Dim rTot As Int = rkeys.Size -1";
_rtot = (int) (_rkeys.getSize()-1);
 //BA.debugLineNum = 1146;BA.debugLine="Dim vTot As Int = rvalues.Size - 1";
_vtot = (int) (_rvalues.getSize()-1);
 //BA.debugLineNum = 1147;BA.debugLine="If rTot <> vTot Then";
if (_rtot!=_vtot) { 
 }else {
 //BA.debugLineNum = 1149;BA.debugLine="Dim rCnt As Int";
_rcnt = 0;
 //BA.debugLineNum = 1150;BA.debugLine="For rCnt = 0 To rTot";
{
final int step9 = 1;
final int limit9 = _rtot;
_rcnt = (int) (0) ;
for (;_rcnt <= limit9 ;_rcnt = _rcnt + step9 ) {
 //BA.debugLineNum = 1151;BA.debugLine="Dim k As String = rkeys.Get(rCnt)";
_k = BA.ObjectToString(_rkeys.Get(_rcnt));
 //BA.debugLineNum = 1152;BA.debugLine="Dim v As String = rvalues.Get(rCnt)";
_v = BA.ObjectToString(_rvalues.Get(_rcnt));
 //BA.debugLineNum = 1153;BA.debugLine="optm.put(k, v)";
_optm.Put((Object)(_k),(Object)(_v));
 }
};
 };
 //BA.debugLineNum = 1156;BA.debugLine="Return optm";
if (true) return _optm;
 //BA.debugLineNum = 1157;BA.debugLine="End Sub";
return null;
}
public String  _lcase(String _text) throws Exception{
 //BA.debugLineNum = 2070;BA.debugLine="Sub LCase(Text As String) As String";
 //BA.debugLineNum = 2071;BA.debugLine="Return Text.ToLowerCase";
if (true) return _text.toLowerCase();
 //BA.debugLineNum = 2072;BA.debugLine="End Sub";
return "";
}
public String  _leftstring(String _text,long _llength) throws Exception{
 //BA.debugLineNum = 2015;BA.debugLine="Sub LeftString(Text As String, lLength As Long)As";
 //BA.debugLineNum = 2016;BA.debugLine="If lLength>Text.Length Then lLength=Text.Length";
if (_llength>_text.length()) { 
_llength = (long) (_text.length());};
 //BA.debugLineNum = 2017;BA.debugLine="Return Text.SubString2(0, lLength)";
if (true) return _text.substring((int) (0),(int) (_llength));
 //BA.debugLineNum = 2018;BA.debugLine="End Sub";
return "";
}
public int  _len(String _text) throws Exception{
 //BA.debugLineNum = 1662;BA.debugLine="Sub Len(Text As String) As Int";
 //BA.debugLineNum = 1663;BA.debugLine="Return Text.Length";
if (true) return _text.length();
 //BA.debugLineNum = 1664;BA.debugLine="End Sub";
return 0;
}
public String[]  _list2array(anywheresoftware.b4a.objects.collections.List _a_lstargs) throws Exception{
String[] _arrargs = null;
int _i = 0;
 //BA.debugLineNum = 1919;BA.debugLine="Sub List2Array (a_lstArgs As List) As String()";
 //BA.debugLineNum = 1920;BA.debugLine="Dim arrArgs(a_lstArgs.Size) As String";
_arrargs = new String[_a_lstargs.getSize()];
java.util.Arrays.fill(_arrargs,"");
 //BA.debugLineNum = 1921;BA.debugLine="For i = 0 To arrArgs.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_arrargs.length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 1922;BA.debugLine="arrArgs(i) = a_lstArgs.Get(i)";
_arrargs[_i] = BA.ObjectToString(_a_lstargs.Get(_i));
 }
};
 //BA.debugLineNum = 1924;BA.debugLine="Return arrArgs";
if (true) return _arrargs;
 //BA.debugLineNum = 1925;BA.debugLine="End Sub";
return null;
}
public String  _list2arrayvariable(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 1764;BA.debugLine="Sub List2ArrayVariable(lst As List) As String";
 //BA.debugLineNum = 1765;BA.debugLine="If lst.Size = 0 Then";
if (_lst.getSize()==0) { 
 //BA.debugLineNum = 1766;BA.debugLine="Return $\"\"\"\"$";
if (true) return ("\"\"");
 };
 //BA.debugLineNum = 1768;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 1769;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1770;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 1771;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1772;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 1773;BA.debugLine="fld = $\"\"${fld}\"\"$";
_fld = ("\""+__c.SmartStringFormatter("",(Object)(_fld))+"\"");
 //BA.debugLineNum = 1774;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 1775;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
 //BA.debugLineNum = 1776;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 1777;BA.debugLine="fld = $\"\"${fld}\"\"$";
_fld = ("\""+__c.SmartStringFormatter("",(Object)(_fld))+"\"");
 //BA.debugLineNum = 1778;BA.debugLine="sb.Append(\",\").Append(fld)";
_sb.Append(",").Append(_fld);
 }
};
 //BA.debugLineNum = 1780;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1781;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _list2idvalue(anywheresoftware.b4a.objects.collections.List _lst,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
String _mv1 = "";
String _mv2 = "";
anywheresoftware.b4a.objects.collections.List _nlst = null;
anywheresoftware.b4a.objects.collections.Map _dict = null;
String _mk = "";
String _mv = "";
anywheresoftware.b4a.objects.collections.Map _nm = null;
 //BA.debugLineNum = 1748;BA.debugLine="Sub List2IDValue(lst As List, mapValues As List) A";
 //BA.debugLineNum = 1749;BA.debugLine="Dim mv1 As String = mapValues.get(0)";
_mv1 = BA.ObjectToString(_mapvalues.Get((int) (0)));
 //BA.debugLineNum = 1750;BA.debugLine="Dim mv2 As String = mapValues.get(1)";
_mv2 = BA.ObjectToString(_mapvalues.Get((int) (1)));
 //BA.debugLineNum = 1751;BA.debugLine="Dim nlst As List";
_nlst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1752;BA.debugLine="nlst.initialize";
_nlst.Initialize();
 //BA.debugLineNum = 1753;BA.debugLine="For Each dict As Map In lst";
_dict = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group5 = _lst;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_dict = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group5.Get(index5)));
 //BA.debugLineNum = 1754;BA.debugLine="Dim mk As String = dict.get(mv1)";
_mk = BA.ObjectToString(_dict.Get((Object)(_mv1)));
 //BA.debugLineNum = 1755;BA.debugLine="Dim mv As String = dict.get(mv2)";
_mv = BA.ObjectToString(_dict.Get((Object)(_mv2)));
 //BA.debugLineNum = 1756;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1757;BA.debugLine="nm.Put(\"id\", mk)";
_nm.Put((Object)("id"),(Object)(_mk));
 //BA.debugLineNum = 1758;BA.debugLine="nm.put(\"value\", mv)";
_nm.Put((Object)("value"),(Object)(_mv));
 //BA.debugLineNum = 1759;BA.debugLine="nlst.Add(nm)";
_nlst.Add((Object)(_nm.getObject()));
 }
};
 //BA.debugLineNum = 1761;BA.debugLine="Return nlst";
if (true) return _nlst;
 //BA.debugLineNum = 1762;BA.debugLine="End Sub";
return null;
}
public String  _list2json(anywheresoftware.b4a.objects.collections.List _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 1859;BA.debugLine="Sub List2Json(mp As List) As String";
 //BA.debugLineNum = 1860;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 1861;BA.debugLine="JSON.Initialize2(mp)";
_json.Initialize2(_mp);
 //BA.debugLineNum = 1862;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
 //BA.debugLineNum = 1863;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _list2keyvalues(anywheresoftware.b4a.objects.collections.List _lst,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
 //BA.debugLineNum = 1743;BA.debugLine="Sub List2KeyValues(lst As List, mapvalues As List)";
 //BA.debugLineNum = 1744;BA.debugLine="Return List2IDValue(lst, mapvalues)";
if (true) return _list2idvalue(_lst,_mapvalues);
 //BA.debugLineNum = 1745;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _list2map(anywheresoftware.b4a.objects.collections.List _lst,String _keyname,String _valuename) throws Exception{
 //BA.debugLineNum = 2353;BA.debugLine="Sub List2Map(lst As List, keyName As String, value";
 //BA.debugLineNum = 2354;BA.debugLine="Return List2Options(lst, keyName, valueName)";
if (true) return _list2options(_lst,_keyname,_valuename);
 //BA.debugLineNum = 2355;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _list2mapsimple(anywheresoftware.b4a.objects.collections.List _lst,boolean _bsort) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
 //BA.debugLineNum = 2329;BA.debugLine="Sub List2MapSimple(lst As List, bSort As Boolean)";
 //BA.debugLineNum = 2330;BA.debugLine="If bSort Then lst.Sort(True)";
if (_bsort) { 
_lst.Sort(__c.True);};
 //BA.debugLineNum = 2331;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2332;BA.debugLine="For Each k As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 2333;BA.debugLine="nm.Put(k, k)";
_nm.Put((Object)(_k),(Object)(_k));
 }
};
 //BA.debugLineNum = 2335;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 2336;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _list2options(anywheresoftware.b4a.objects.collections.List _lst,String _keyname,String _valuename) throws Exception{
anywheresoftware.b4a.objects.collections.List _recs = null;
String _k = "";
anywheresoftware.b4a.objects.collections.Map _nrec = null;
 //BA.debugLineNum = 2340;BA.debugLine="Sub List2Options(lst As List, keyName As String, v";
 //BA.debugLineNum = 2341;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2342;BA.debugLine="recs.Initialize";
_recs.Initialize();
 //BA.debugLineNum = 2343;BA.debugLine="For Each k As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 2344;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2345;BA.debugLine="nrec.Put(keyName, k)";
_nrec.Put((Object)(_keyname),(Object)(_k));
 //BA.debugLineNum = 2346;BA.debugLine="nrec.Put(valueName, k)";
_nrec.Put((Object)(_valuename),(Object)(_k));
 //BA.debugLineNum = 2347;BA.debugLine="recs.Add(nrec)";
_recs.Add((Object)(_nrec.getObject()));
 }
};
 //BA.debugLineNum = 2349;BA.debugLine="Return recs";
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_recs.getObject()));
 //BA.debugLineNum = 2350;BA.debugLine="End Sub";
return null;
}
public Object  _listfirstitem(String _lstname) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
Object _obj = null;
 //BA.debugLineNum = 1195;BA.debugLine="Sub ListFirstItem(lstName As String) As Object";
 //BA.debugLineNum = 1196;BA.debugLine="lstName = lstName.tolowercase";
_lstname = _lstname.toLowerCase();
 //BA.debugLineNum = 1197;BA.debugLine="Dim lst As List = BOVue.GetField(lstName).result";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_bovue.GetField(_lstname).Result()));
 //BA.debugLineNum = 1198;BA.debugLine="Dim obj As Object = lst.Get(0)";
_obj = _lst.Get((int) (0));
 //BA.debugLineNum = 1199;BA.debugLine="Return obj";
if (true) return _obj;
 //BA.debugLineNum = 1200;BA.debugLine="End Sub";
return null;
}
public Object  _listfirstitemglobal(String _lstname) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
Object _obj = null;
 //BA.debugLineNum = 744;BA.debugLine="Sub ListFirstItemGlobal(lstName As String) As Obje";
 //BA.debugLineNum = 745;BA.debugLine="lstName = lstName.tolowercase";
_lstname = _lstname.toLowerCase();
 //BA.debugLineNum = 746;BA.debugLine="Dim lst As List = store.GetField(lstName).result";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_store.GetField(_lstname).Result()));
 //BA.debugLineNum = 747;BA.debugLine="Dim obj As Object = lst.Get(0)";
_obj = _lst.Get((int) (0));
 //BA.debugLineNum = 748;BA.debugLine="Return obj";
if (true) return _obj;
 //BA.debugLineNum = 749;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _listget(String _lstname) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 1209;BA.debugLine="Sub ListGet(lstname As String) As List";
 //BA.debugLineNum = 1210;BA.debugLine="lstname = lstname.tolowercase";
_lstname = _lstname.toLowerCase();
 //BA.debugLineNum = 1211;BA.debugLine="Dim lst As List = BOVue.GetField(lstname).result";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_bovue.GetField(_lstname).Result()));
 //BA.debugLineNum = 1212;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 1213;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _listofmap2strings(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.Map _nm = null;
 //BA.debugLineNum = 2801;BA.debugLine="Sub ListOfMap2Strings(lst As List) As List";
 //BA.debugLineNum = 2802;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2803;BA.debugLine="nl = NewList";
_nl = _newlist();
 //BA.debugLineNum = 2804;BA.debugLine="For Each m As Map In lst";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group3.Get(index3)));
 //BA.debugLineNum = 2805;BA.debugLine="Dim nm As Map = Map2Strings(m)";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = _map2strings(_m);
 //BA.debugLineNum = 2806;BA.debugLine="nl.Add(nm)";
_nl.Add((Object)(_nm.getObject()));
 }
};
 //BA.debugLineNum = 2808;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 2809;BA.debugLine="End Sub";
return null;
}
public int  _listofmapsrecordpos(anywheresoftware.b4a.objects.collections.List _lst,String _k,String _v) throws Exception{
int _ltot = 0;
int _lcnt = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _sk = "";
 //BA.debugLineNum = 1095;BA.debugLine="Sub ListOfMapsRecordPos(lst As List, k As String,";
 //BA.debugLineNum = 1096;BA.debugLine="Dim lTot As Int = lst.Size - 1";
_ltot = (int) (_lst.getSize()-1);
 //BA.debugLineNum = 1097;BA.debugLine="Dim lCnt As Int";
_lcnt = 0;
 //BA.debugLineNum = 1098;BA.debugLine="For lCnt = 0 To lTot";
{
final int step3 = 1;
final int limit3 = _ltot;
_lcnt = (int) (0) ;
for (;_lcnt <= limit3 ;_lcnt = _lcnt + step3 ) {
 //BA.debugLineNum = 1099;BA.debugLine="Dim m As Map = lst.Get(lCnt)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_lst.Get(_lcnt)));
 //BA.debugLineNum = 1100;BA.debugLine="Dim sk As String = m.GetDefault(k, \"\")";
_sk = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 1101;BA.debugLine="If sk.EqualsIgnoreCase(v) Then";
if (_sk.equalsIgnoreCase(_v)) { 
 //BA.debugLineNum = 1102;BA.debugLine="Return lCnt";
if (true) return _lcnt;
 };
 }
};
 //BA.debugLineNum = 1105;BA.debugLine="Return -1";
if (true) return (int) (-1);
 //BA.debugLineNum = 1106;BA.debugLine="End Sub";
return 0;
}
public String  _listpop(String _lstname) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
int _arsize = 0;
 //BA.debugLineNum = 1230;BA.debugLine="Sub ListPop(lstname As String)";
 //BA.debugLineNum = 1231;BA.debugLine="lstname = lstname.tolowercase";
_lstname = _lstname.toLowerCase();
 //BA.debugLineNum = 1232;BA.debugLine="Dim lst As List = BOVue.GetField(lstname).result";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_bovue.GetField(_lstname).Result()));
 //BA.debugLineNum = 1233;BA.debugLine="Dim arsize As Int = lst.Size - 1";
_arsize = (int) (_lst.getSize()-1);
 //BA.debugLineNum = 1234;BA.debugLine="lst.RemoveAt(arsize)";
_lst.RemoveAt(_arsize);
 //BA.debugLineNum = 1235;BA.debugLine="End Sub";
return "";
}
public String  _listpopglobal(String _lstname) throws Exception{
 //BA.debugLineNum = 739;BA.debugLine="Sub ListPopGlobal(lstname As String)";
 //BA.debugLineNum = 740;BA.debugLine="lstname = lstname.tolowercase";
_lstname = _lstname.toLowerCase();
 //BA.debugLineNum = 741;BA.debugLine="store.GetField(lstname).RunMethod(\"pop\", Null)";
_store.GetField(_lstname).RunMethod("pop",__c.Null);
 //BA.debugLineNum = 742;BA.debugLine="End Sub";
return "";
}
public String  _listpush(String _lstname,Object _obj) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 1223;BA.debugLine="Sub ListPush(lstname As String, obj As Object)";
 //BA.debugLineNum = 1224;BA.debugLine="lstname = lstname.tolowercase";
_lstname = _lstname.toLowerCase();
 //BA.debugLineNum = 1225;BA.debugLine="Dim lst As List = BOVue.GetField(lstname).result";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_bovue.GetField(_lstname).Result()));
 //BA.debugLineNum = 1226;BA.debugLine="lst.Add(obj)";
_lst.Add(_obj);
 //BA.debugLineNum = 1227;BA.debugLine="End Sub";
return "";
}
public String  _listpushglobal(String _listname,Object _item) throws Exception{
 //BA.debugLineNum = 752;BA.debugLine="Sub ListPushGlobal(listName As String, item As Obj";
 //BA.debugLineNum = 753;BA.debugLine="listName = listName.ToLowerCase";
_listname = _listname.toLowerCase();
 //BA.debugLineNum = 754;BA.debugLine="store.GetField(listName).RunMethod(\"push\", item)";
_store.GetField(_listname).RunMethod("push",_item);
 //BA.debugLineNum = 755;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _listremoveduplicates(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nd = null;
String _k = "";
anywheresoftware.b4a.objects.collections.List _nl = null;
 //BA.debugLineNum = 1266;BA.debugLine="Sub ListRemoveDuplicates(lst As List) As List";
 //BA.debugLineNum = 1267;BA.debugLine="Dim nd As Map = CreateMap()";
_nd = new anywheresoftware.b4a.objects.collections.Map();
_nd = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1268;BA.debugLine="For Each k As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1269;BA.debugLine="nd.Put(k, k)";
_nd.Put((Object)(_k),(Object)(_k));
 }
};
 //BA.debugLineNum = 1271;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1272;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 1273;BA.debugLine="For Each k As String In nd.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _nd.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_k = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 1274;BA.debugLine="nl.Add(k)";
_nl.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 1276;BA.debugLine="nl.Sort(True)";
_nl.Sort(__c.True);
 //BA.debugLineNum = 1277;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 1278;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _listset(String _lstname,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
 //BA.debugLineNum = 1215;BA.debugLine="Sub ListSet(lstname As String, lst As List) As Lis";
 //BA.debugLineNum = 1216;BA.debugLine="lstname = lstname.tolowercase";
_lstname = _lstname.toLowerCase();
 //BA.debugLineNum = 1217;BA.debugLine="BOVue.SetField(lstname, lst)";
_bovue.SetField(_lstname,(Object)(_lst.getObject()));
 //BA.debugLineNum = 1218;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 1219;BA.debugLine="End Sub";
return null;
}
public String  _listunshift(String _lstname,Object _obj) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 1203;BA.debugLine="Sub ListUnshift(lstname As String, obj As Object)";
 //BA.debugLineNum = 1204;BA.debugLine="lstname = lstname.tolowercase";
_lstname = _lstname.toLowerCase();
 //BA.debugLineNum = 1205;BA.debugLine="Dim lst As List = BOVue.GetField(lstname).result";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_bovue.GetField(_lstname).Result()));
 //BA.debugLineNum = 1206;BA.debugLine="lst.InsertAt(0, obj)";
_lst.InsertAt((int) (0),_obj);
 //BA.debugLineNum = 1207;BA.debugLine="End Sub";
return "";
}
public String  _listunshiftglobal(String _lstname,Object _obj) throws Exception{
 //BA.debugLineNum = 758;BA.debugLine="Sub ListUnshiftGlobal(lstname As String, obj As Ob";
 //BA.debugLineNum = 759;BA.debugLine="lstname = lstname.tolowercase";
_lstname = _lstname.toLowerCase();
 //BA.debugLineNum = 760;BA.debugLine="store.GetField(lstname).RunMethod(\"unshift\", obj)";
_store.GetField(_lstname).RunMethod("unshift",_obj);
 //BA.debugLineNum = 761;BA.debugLine="End Sub";
return "";
}
public String  _longdate(String _sdate) throws Exception{
long _dt = 0L;
 //BA.debugLineNum = 2024;BA.debugLine="Sub LongDate(sDate As String) As String";
 //BA.debugLineNum = 2025;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
if (_sdate.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 2026;BA.debugLine="Try";
try { //BA.debugLineNum = 2027;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 2028;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
_dt = __c.DateTime.DateParse(_sdate);
 //BA.debugLineNum = 2029;BA.debugLine="DateTime.DateFormat = \"EEEE, dd MMMM yyyy\"";
__c.DateTime.setDateFormat("EEEE, dd MMMM yyyy");
 //BA.debugLineNum = 2030;BA.debugLine="Return DateTime.Date(dt)";
if (true) return __c.DateTime.Date(_dt);
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 2032;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 2034;BA.debugLine="End Sub";
return "";
}
public String  _longdatetime(String _sdate) throws Exception{
long _dt = 0L;
 //BA.debugLineNum = 2054;BA.debugLine="Sub LongDateTime(sDate As String) As String";
 //BA.debugLineNum = 2055;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
if (_sdate.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 2056;BA.debugLine="Try";
try { //BA.debugLineNum = 2057;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm\"";
__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm");
 //BA.debugLineNum = 2058;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
_dt = __c.DateTime.DateParse(_sdate);
 //BA.debugLineNum = 2059;BA.debugLine="DateTime.DateFormat = \"EEEE, dd MMMM yyyy HH:mm\"";
__c.DateTime.setDateFormat("EEEE, dd MMMM yyyy HH:mm");
 //BA.debugLineNum = 2060;BA.debugLine="Return DateTime.Date(dt)";
if (true) return __c.DateTime.Date(_dt);
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 2062;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 2064;BA.debugLine="End Sub";
return "";
}
public String  _longdatetimetoday() throws Exception{
long _dt = 0L;
 //BA.debugLineNum = 2736;BA.debugLine="Sub LongDateTimeToday() As String";
 //BA.debugLineNum = 2737;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm\"";
__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm");
 //BA.debugLineNum = 2738;BA.debugLine="Dim dt As Long = DateTime.now";
_dt = __c.DateTime.getNow();
 //BA.debugLineNum = 2739;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy, HH:mm\"";
__c.DateTime.setDateFormat("dd/MM/yyyy, HH:mm");
 //BA.debugLineNum = 2740;BA.debugLine="Return DateTime.Date(dt)";
if (true) return __c.DateTime.Date(_dt);
 //BA.debugLineNum = 2741;BA.debugLine="End Sub";
return "";
}
public String  _makeboolean(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 2952;BA.debugLine="Sub MakeBoolean(m As Map, xkeys As List)";
 //BA.debugLineNum = 2953;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2954;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 2955;BA.debugLine="Dim v As String = m.GetDefault(k,\"0\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("0")));
 //BA.debugLineNum = 2956;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 2957;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 2958;BA.debugLine="Select Case v";
switch (BA.switchObjectToInt(_v,"","0","false","False",BA.ObjectToString(__c.False),BA.NumberToString(0),"no","No","1","true","True",BA.ObjectToString(__c.True),BA.NumberToString(1),"yes","Yes")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: {
 //BA.debugLineNum = 2960;BA.debugLine="m.Put(k, False)";
_m.Put((Object)(_k),(Object)(__c.False));
 break; }
case 8: 
case 9: 
case 10: 
case 11: 
case 12: 
case 13: 
case 14: {
 //BA.debugLineNum = 2962;BA.debugLine="m.Put(k, True)";
_m.Put((Object)(_k),(Object)(__c.True));
 break; }
}
;
 };
 }
};
 //BA.debugLineNum = 2966;BA.debugLine="End Sub";
return "";
}
public String  _makedate(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 3000;BA.debugLine="Sub MakeDate(m As Map, xkeys As List)";
 //BA.debugLineNum = 3001;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 3002;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 3003;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 3004;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 3005;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 3006;BA.debugLine="v = MvField(v,1,\" \")";
_v = _mvfield(_v,(int) (1)," ");
 //BA.debugLineNum = 3007;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),(Object)(_v));
 };
 }
};
 //BA.debugLineNum = 3010;BA.debugLine="End Sub";
return "";
}
public String  _makedouble(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 2921;BA.debugLine="Sub MakeDouble(m As Map, xkeys As List)";
 //BA.debugLineNum = 2922;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2923;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 2924;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 2925;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 2926;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 2927;BA.debugLine="If v = \"\" Then v = \"0\"";
if ((_v).equals("")) { 
_v = "0";};
 //BA.debugLineNum = 2928;BA.debugLine="v = BANAno.parseFloat(v)";
_v = BA.NumberToString(_banano.parseFloat((Object)(_v)));
 //BA.debugLineNum = 2929;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),(Object)(_v));
 };
 }
};
 //BA.debugLineNum = 2932;BA.debugLine="End Sub";
return "";
}
public String  _makeinteger(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 2908;BA.debugLine="Sub MakeInteger(m As Map, xkeys As List)";
 //BA.debugLineNum = 2909;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2910;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 2911;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 2912;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 2913;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 2914;BA.debugLine="If v = \"\" Then v = \"0\"";
if ((_v).equals("")) { 
_v = "0";};
 //BA.debugLineNum = 2915;BA.debugLine="v = BANAno.parseInt(v)";
_v = BA.NumberToString(_banano.parseInt((Object)(_v)));
 //BA.debugLineNum = 2916;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),(Object)(_v));
 };
 }
};
 //BA.debugLineNum = 2919;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _makelowercase(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 2990;BA.debugLine="Sub MakeLowerCase(m As Map) As Map";
 //BA.debugLineNum = 2991;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2992;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 2993;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 2994;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 2995;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 2997;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 2998;BA.debugLine="End Sub";
return null;
}
public String  _makemoney(String _svalue) throws Exception{
 //BA.debugLineNum = 1973;BA.debugLine="Sub MakeMoney(sValue As String) As String";
 //BA.debugLineNum = 1974;BA.debugLine="If BANAno.IsNull(sValue) Or BANAno.IsUndefined(sV";
if (_banano.IsNull((Object)(_svalue)) || _banano.IsUndefined((Object)(_svalue))) { 
 //BA.debugLineNum = 1975;BA.debugLine="sValue = \"0.00\"";
_svalue = "0.00";
 //BA.debugLineNum = 1976;BA.debugLine="Return sValue";
if (true) return _svalue;
 };
 //BA.debugLineNum = 1978;BA.debugLine="sValue = CStr(sValue)";
_svalue = _cstr((Object)(_svalue));
 //BA.debugLineNum = 1979;BA.debugLine="sValue = sValue.trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 1980;BA.debugLine="If sValue.Length = 0 Then";
if (_svalue.length()==0) { 
 //BA.debugLineNum = 1981;BA.debugLine="Return \"0.00\"";
if (true) return "0.00";
 };
 //BA.debugLineNum = 1983;BA.debugLine="sValue = Val(sValue)";
_svalue = _val(_svalue);
 //BA.debugLineNum = 1984;BA.debugLine="If sValue = \"0\" Then sValue = \"0.00\"";
if ((_svalue).equals("0")) { 
_svalue = "0.00";};
 //BA.debugLineNum = 1985;BA.debugLine="sValue = BANAno.parsefloat(sValue)";
_svalue = BA.NumberToString(_banano.parseFloat((Object)(_svalue)));
 //BA.debugLineNum = 1986;BA.debugLine="sValue = Round2(sValue,2)";
_svalue = BA.NumberToString(__c.Round2((double)(Double.parseDouble(_svalue)),(int) (2)));
 //BA.debugLineNum = 1987;BA.debugLine="Return NumberFormat2(sValue, 1, 2, 2, True)";
if (true) return __c.NumberFormat2((double)(Double.parseDouble(_svalue)),(int) (1),(int) (2),(int) (2),__c.True);
 //BA.debugLineNum = 1988;BA.debugLine="End Sub";
return "";
}
public String  _makepx(String _svalue) throws Exception{
 //BA.debugLineNum = 2497;BA.debugLine="Sub MakePx(sValue As String) As String";
 //BA.debugLineNum = 2498;BA.debugLine="sValue = sValue.trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 2499;BA.debugLine="If sValue.EndsWith(\"%\") Then";
if (_svalue.endsWith("%")) { 
 //BA.debugLineNum = 2500;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vm")) { 
 //BA.debugLineNum = 2502;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("px")) { 
 //BA.debugLineNum = 2504;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("cm")) { 
 //BA.debugLineNum = 2506;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("mm")) { 
 //BA.debugLineNum = 2508;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("in")) { 
 //BA.debugLineNum = 2510;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("pt")) { 
 //BA.debugLineNum = 2512;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("pc")) { 
 //BA.debugLineNum = 2514;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("em")) { 
 //BA.debugLineNum = 2516;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("ex")) { 
 //BA.debugLineNum = 2518;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("ch")) { 
 //BA.debugLineNum = 2520;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("rem")) { 
 //BA.debugLineNum = 2522;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vw")) { 
 //BA.debugLineNum = 2524;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vh")) { 
 //BA.debugLineNum = 2526;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vmin")) { 
 //BA.debugLineNum = 2528;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vmax")) { 
 //BA.debugLineNum = 2530;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith(";")) { 
 //BA.debugLineNum = 2532;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else {
 //BA.debugLineNum = 2534;BA.debugLine="sValue = sValue.Replace(\"px\",\"\")";
_svalue = _svalue.replace("px","");
 //BA.debugLineNum = 2535;BA.debugLine="sValue = $\"${sValue}px\"$";
_svalue = (""+__c.SmartStringFormatter("",(Object)(_svalue))+"px");
 //BA.debugLineNum = 2536;BA.debugLine="If sValue = \"px\" Then sValue = \"\"";
if ((_svalue).equals("px")) { 
_svalue = "";};
 //BA.debugLineNum = 2537;BA.debugLine="Return sValue";
if (true) return _svalue;
 };
 //BA.debugLineNum = 2539;BA.debugLine="End Sub";
return "";
}
public String  _maketrim(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 2979;BA.debugLine="Sub MakeTrim(m As Map, xkeys As List)";
 //BA.debugLineNum = 2980;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2981;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 2982;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 2983;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 2984;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 2985;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),(Object)(_v));
 };
 }
};
 //BA.debugLineNum = 2988;BA.debugLine="End Sub";
return "";
}
public String  _makeyesno(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 2934;BA.debugLine="Sub MakeYesNo(m As Map, xkeys As List)";
 //BA.debugLineNum = 2935;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2936;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 2937;BA.debugLine="Dim v As String = m.GetDefault(k,\"No\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("No")));
 //BA.debugLineNum = 2938;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 2939;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 2940;BA.debugLine="Select Case v";
switch (BA.switchObjectToInt(_v,"","0","false","False",BA.ObjectToString(__c.False),BA.NumberToString(0),"no","No","1","true","True",BA.ObjectToString(__c.True),BA.NumberToString(1),"yes","Yes")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: {
 //BA.debugLineNum = 2942;BA.debugLine="m.Put(k, \"No\")";
_m.Put((Object)(_k),(Object)("No"));
 break; }
case 8: 
case 9: 
case 10: 
case 11: 
case 12: 
case 13: 
case 14: {
 //BA.debugLineNum = 2944;BA.debugLine="m.Put(k, \"Yes\")";
_m.Put((Object)(_k),(Object)("Yes"));
 break; }
}
;
 };
 }
};
 //BA.debugLineNum = 2948;BA.debugLine="End Sub";
return "";
}
public String  _map2json(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 1794;BA.debugLine="Sub Map2Json(mp As Map) As String";
 //BA.debugLineNum = 1795;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 1796;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
 //BA.debugLineNum = 1797;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
 //BA.debugLineNum = 1798;BA.debugLine="End Sub";
return "";
}
public String  _map2jsonpretty(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 1800;BA.debugLine="Sub Map2JsonPretty(mp As Map) As String";
 //BA.debugLineNum = 1801;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 1802;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
 //BA.debugLineNum = 1803;BA.debugLine="Return JSON.ToPrettyString(4)";
if (true) return _json.ToPrettyString((int) (4));
 //BA.debugLineNum = 1804;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _map2options(anywheresoftware.b4a.objects.collections.Map _m,String _keyname,String _valuename) throws Exception{
anywheresoftware.b4a.objects.collections.List _recs = null;
String _k = "";
Object _v = null;
anywheresoftware.b4a.objects.collections.Map _nrec = null;
 //BA.debugLineNum = 2358;BA.debugLine="Sub Map2Options(m As Map, keyName As String, value";
 //BA.debugLineNum = 2359;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2360;BA.debugLine="recs.Initialize";
_recs.Initialize();
 //BA.debugLineNum = 2361;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 2362;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 2363;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2364;BA.debugLine="nrec.Put(keyName, k)";
_nrec.Put((Object)(_keyname),(Object)(_k));
 //BA.debugLineNum = 2365;BA.debugLine="nrec.Put(valueName, v)";
_nrec.Put((Object)(_valuename),_v);
 //BA.debugLineNum = 2366;BA.debugLine="recs.Add(nrec)";
_recs.Add((Object)(_nrec.getObject()));
 }
};
 //BA.debugLineNum = 2368;BA.debugLine="Return recs";
if (true) return _recs;
 //BA.debugLineNum = 2369;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _map2strings(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
String _vv = "";
 //BA.debugLineNum = 2813;BA.debugLine="Sub Map2Strings(m As Map) As Map";
 //BA.debugLineNum = 2814;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2815;BA.debugLine="For Each k As String In m.keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 2816;BA.debugLine="Dim v As Object = m.get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 2817;BA.debugLine="If BANAno.IsNull(v) Then v = \"\"";
if (_banano.IsNull(_v)) { 
_v = (Object)("");};
 //BA.debugLineNum = 2818;BA.debugLine="If BANAno.IsUndefined(v) Then v = \"\"";
if (_banano.IsUndefined(_v)) { 
_v = (Object)("");};
 //BA.debugLineNum = 2819;BA.debugLine="Dim vv As String = CStr(v)";
_vv = _cstr(_v);
 //BA.debugLineNum = 2820;BA.debugLine="nm.put(k, vv)";
_nm.Put((Object)(_k),(Object)(_vv));
 }
};
 //BA.debugLineNum = 2822;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 2823;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _mapclone(anywheresoftware.b4a.objects.collections.Map _oldmap) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 2372;BA.debugLine="Sub MapClone(oldMap As Map) As Map";
 //BA.debugLineNum = 2373;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2374;BA.debugLine="For Each k As String In oldMap.keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _oldmap.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 2375;BA.debugLine="Dim v As Object = oldMap.Get(k)";
_v = _oldmap.Get((Object)(_k));
 //BA.debugLineNum = 2376;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 2378;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 2379;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _mapcloneswap(anywheresoftware.b4a.objects.collections.Map _oldmap) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 2382;BA.debugLine="Sub MapCloneSwap(oldMap As Map) As Map";
 //BA.debugLineNum = 2383;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2384;BA.debugLine="For Each k As String In oldMap.keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _oldmap.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 2385;BA.debugLine="Dim v As Object = oldMap.Get(k)";
_v = _oldmap.Get((Object)(_k));
 //BA.debugLineNum = 2386;BA.debugLine="nm.Put(v, k)";
_nm.Put(_v,(Object)(_k));
 }
};
 //BA.debugLineNum = 2388;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 2389;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _mapkeys2list(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
String _k = "";
 //BA.debugLineNum = 1522;BA.debugLine="Sub MapKeys2List(m As Map) As List";
 //BA.debugLineNum = 1523;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1524;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 1525;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 1526;BA.debugLine="lst.Add(k)";
_lst.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 1528;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 1529;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _mapkeyslowercaselist(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 2193;BA.debugLine="Sub MapKeysLowerCaseList(lst As List) As List";
 //BA.debugLineNum = 2194;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2195;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 2196;BA.debugLine="For Each rec As Map In lst";
_rec = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_rec = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group3.Get(index3)));
 //BA.debugLineNum = 2197;BA.debugLine="rec = MapKeysLowerCaseSingle(rec)";
_rec = _mapkeyslowercasesingle(_rec);
 //BA.debugLineNum = 2198;BA.debugLine="nl.Add(rec)";
_nl.Add((Object)(_rec.getObject()));
 }
};
 //BA.debugLineNum = 2200;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 2201;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _mapkeyslowercasesingle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 2182;BA.debugLine="Sub MapKeysLowerCaseSingle(m As Map) As Map";
 //BA.debugLineNum = 2183;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2184;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 2185;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 2186;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 2187;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 2189;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 2190;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _mapremoveprefix(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
String _v = "";
 //BA.debugLineNum = 3035;BA.debugLine="Sub MapRemovePrefix(m As Map) As Map";
 //BA.debugLineNum = 3036;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 3037;BA.debugLine="For Each k As String In m.keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 3038;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 3039;BA.debugLine="k = MvField(k,2,\"_\")";
_k = _mvfield(_k,(int) (2),"_");
 //BA.debugLineNum = 3040;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),(Object)(_v));
 }
};
 //BA.debugLineNum = 3042;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 3043;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _mapvalues2list(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
String _k = "";
 //BA.debugLineNum = 1532;BA.debugLine="Sub MapValues2List(m As Map) As List";
 //BA.debugLineNum = 1533;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1534;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 1535;BA.debugLine="For Each k As String In m.values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 1536;BA.debugLine="lst.Add(k)";
_lst.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 1538;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 1539;BA.debugLine="End Sub";
return null;
}
public String  _mapvalues2lowercase(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _props) throws Exception{
String _prop = "";
String _v = "";
 //BA.debugLineNum = 1883;BA.debugLine="Sub MapValues2LowerCase(m As Map, props As List)";
 //BA.debugLineNum = 1884;BA.debugLine="For Each prop As String In props";
{
final anywheresoftware.b4a.BA.IterableList group1 = _props;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_prop = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1885;BA.debugLine="If m.ContainsKey(prop) Then";
if (_m.ContainsKey((Object)(_prop))) { 
 //BA.debugLineNum = 1886;BA.debugLine="Dim v As String = m.GetDefault(prop,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_prop),(Object)("")));
 //BA.debugLineNum = 1887;BA.debugLine="v = v.tolowercase";
_v = _v.toLowerCase();
 //BA.debugLineNum = 1888;BA.debugLine="m.Put(prop,v)";
_m.Put((Object)(_prop),(Object)(_v));
 };
 }
};
 //BA.debugLineNum = 1891;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _mergemaps(anywheresoftware.b4a.objects.collections.Map _oldm,anywheresoftware.b4a.objects.collections.Map _newm) throws Exception{
anywheresoftware.b4a.objects.collections.Map _om = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 2301;BA.debugLine="Sub MergeMaps(oldm As Map, newm As Map) As Map";
 //BA.debugLineNum = 2302;BA.debugLine="Dim om As Map = CreateMap()";
_om = new anywheresoftware.b4a.objects.collections.Map();
_om = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2303;BA.debugLine="For Each k As String In oldm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _oldm.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 2304;BA.debugLine="Dim v As Object = oldm.Get(k)";
_v = _oldm.Get((Object)(_k));
 //BA.debugLineNum = 2305;BA.debugLine="om.Put(k, v)";
_om.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 2308;BA.debugLine="For Each k As String In newm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _newm.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_k = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 2309;BA.debugLine="Dim v As Object = newm.Get(k)";
_v = _newm.Get((Object)(_k));
 //BA.debugLineNum = 2310;BA.debugLine="om.Put(k, v)";
_om.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 2312;BA.debugLine="Return om";
if (true) return _om;
 //BA.debugLineNum = 2313;BA.debugLine="End Sub";
return null;
}
public String  _midstring(String _text,int _start,int _llength) throws Exception{
 //BA.debugLineNum = 2002;BA.debugLine="Sub MidString(Text As String, Start As Int, lLengt";
 //BA.debugLineNum = 2003;BA.debugLine="Return Text.SubString2(Start-1,Start+lLength-1)";
if (true) return _text.substring((int) (_start-1),(int) (_start+_llength-1));
 //BA.debugLineNum = 2004;BA.debugLine="End Sub";
return "";
}
public String  _midstring2(String _text,int _start) throws Exception{
 //BA.debugLineNum = 2006;BA.debugLine="Sub MidString2(Text As String, Start As Int) As St";
 //BA.debugLineNum = 2007;BA.debugLine="Return Text.SubString(Start-1)";
if (true) return _text.substring((int) (_start-1));
 //BA.debugLineNum = 2008;BA.debugLine="End Sub";
return "";
}
public boolean  _moduleexist(String _tagname) throws Exception{
boolean _b = false;
 //BA.debugLineNum = 1012;BA.debugLine="Sub ModuleExist(tagName As String) As Boolean";
 //BA.debugLineNum = 1013;BA.debugLine="tagName = tagName.tolowercase";
_tagname = _tagname.toLowerCase();
 //BA.debugLineNum = 1014;BA.debugLine="Dim b As Boolean = Modules.ContainsKey(tagName)";
_b = _modules.ContainsKey((Object)(_tagname));
 //BA.debugLineNum = 1015;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 1016;BA.debugLine="End Sub";
return false;
}
public String  _monthnow() throws Exception{
long _lnow = 0L;
String _dt = "";
 //BA.debugLineNum = 1566;BA.debugLine="Public Sub MonthNow() As String";
 //BA.debugLineNum = 1567;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
 //BA.debugLineNum = 1568;BA.debugLine="Dim dt As String";
_dt = "";
 //BA.debugLineNum = 1569;BA.debugLine="lNow = DateTime.Now";
_lnow = __c.DateTime.getNow();
 //BA.debugLineNum = 1570;BA.debugLine="DateTime.DateFormat = \"M\"";
__c.DateTime.setDateFormat("M");
 //BA.debugLineNum = 1571;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = __c.DateTime.Date(_lnow);
 //BA.debugLineNum = 1572;BA.debugLine="Return dt";
if (true) return _dt;
 //BA.debugLineNum = 1573;BA.debugLine="End Sub";
return "";
}
public int  _mvcount(String _strmv,String _delimiter) throws Exception{
String[] _spvalues = null;
 //BA.debugLineNum = 2629;BA.debugLine="Sub MvCount(strMV As String, Delimiter As String)";
 //BA.debugLineNum = 2630;BA.debugLine="Dim spValues() As String = BANAno.Split(Delimiter";
_spvalues = _banano.Split(_delimiter,_strmv);
 //BA.debugLineNum = 2631;BA.debugLine="Return spValues.Length";
if (true) return _spvalues.length;
 //BA.debugLineNum = 2632;BA.debugLine="End Sub";
return 0;
}
public String  _mvdistinct(String _delim,String _strmv) throws Exception{
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _mi = null;
String _k = "";
anywheresoftware.b4a.objects.collections.List _nl = null;
String _sout = "";
 //BA.debugLineNum = 1124;BA.debugLine="Sub MvDistinct(delim As String, strmv As String) A";
 //BA.debugLineNum = 1125;BA.debugLine="Dim items As List = StrParse(delim, strmv)";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = _strparse(_delim,_strmv);
 //BA.debugLineNum = 1126;BA.debugLine="Dim mi As Map = CreateMap()";
_mi = new anywheresoftware.b4a.objects.collections.Map();
_mi = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1127;BA.debugLine="For Each k As String In items";
{
final anywheresoftware.b4a.BA.IterableList group3 = _items;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 1128;BA.debugLine="mi.Put(k, k)";
_mi.Put((Object)(_k),(Object)(_k));
 }
};
 //BA.debugLineNum = 1130;BA.debugLine="Dim nl As List = NewList";
_nl = new anywheresoftware.b4a.objects.collections.List();
_nl = _newlist();
 //BA.debugLineNum = 1131;BA.debugLine="For Each k As String In mi.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _mi.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_k = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 1132;BA.debugLine="nl.Add(k)";
_nl.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 1134;BA.debugLine="Dim sout As String = Join(delim, nl)";
_sout = _join(_delim,_nl);
 //BA.debugLineNum = 1135;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 1136;BA.debugLine="End Sub";
return "";
}
public String  _mvfield(String _svalue,int _iposition,String _delimiter) throws Exception{
int _xpos = 0;
anywheresoftware.b4a.objects.collections.List _mvalues = null;
int _tvalues = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _startcnt = 0;
 //BA.debugLineNum = 3220;BA.debugLine="Sub MvField(sValue As String, iPosition As Int, De";
 //BA.debugLineNum = 3221;BA.debugLine="If sValue.Length = 0 Then Return \"\"";
if (_svalue.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 3222;BA.debugLine="Dim xPos As Int = sValue.IndexOf(Delimiter)";
_xpos = _svalue.indexOf(_delimiter);
 //BA.debugLineNum = 3223;BA.debugLine="If xPos = -1 Then Return sValue";
if (_xpos==-1) { 
if (true) return _svalue;};
 //BA.debugLineNum = 3224;BA.debugLine="Dim mValues As List = StrParse(Delimiter,sValue)";
_mvalues = new anywheresoftware.b4a.objects.collections.List();
_mvalues = _strparse(_delimiter,_svalue);
 //BA.debugLineNum = 3225;BA.debugLine="Dim tValues As Int";
_tvalues = 0;
 //BA.debugLineNum = 3226;BA.debugLine="tValues = mValues.size -1";
_tvalues = (int) (_mvalues.getSize()-1);
 //BA.debugLineNum = 3227;BA.debugLine="Select Case iPosition";
switch (BA.switchObjectToInt(_iposition,(int) (-1),(int) (-2),(int) (-3))) {
case 0: {
 //BA.debugLineNum = 3229;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 break; }
case 1: {
 //BA.debugLineNum = 3231;BA.debugLine="Return mValues.get(tValues - 1)";
if (true) return BA.ObjectToString(_mvalues.Get((int) (_tvalues-1)));
 break; }
case 2: {
 //BA.debugLineNum = 3233;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 3234;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 3235;BA.debugLine="Dim startcnt As Int";
_startcnt = 0;
 //BA.debugLineNum = 3236;BA.debugLine="sb.Append(mValues.Get(1))";
_sb.Append(BA.ObjectToString(_mvalues.Get((int) (1))));
 //BA.debugLineNum = 3237;BA.debugLine="For startcnt = 2 To tValues";
{
final int step17 = 1;
final int limit17 = _tvalues;
_startcnt = (int) (2) ;
for (;_startcnt <= limit17 ;_startcnt = _startcnt + step17 ) {
 //BA.debugLineNum = 3238;BA.debugLine="sb.Append(Delimiter)";
_sb.Append(_delimiter);
 //BA.debugLineNum = 3239;BA.debugLine="sb.Append(mValues.get(startcnt))";
_sb.Append(BA.ObjectToString(_mvalues.Get(_startcnt)));
 }
};
 //BA.debugLineNum = 3241;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 break; }
default: {
 //BA.debugLineNum = 3243;BA.debugLine="iPosition = iPosition - 1";
_iposition = (int) (_iposition-1);
 //BA.debugLineNum = 3244;BA.debugLine="If iPosition <= -1 Then";
if (_iposition<=-1) { 
 //BA.debugLineNum = 3245;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 };
 //BA.debugLineNum = 3247;BA.debugLine="If iPosition > tValues Then";
if (_iposition>_tvalues) { 
 //BA.debugLineNum = 3248;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 3250;BA.debugLine="Return mValues.get(iPosition)";
if (true) return BA.ObjectToString(_mvalues.Get(_iposition));
 break; }
}
;
 //BA.debugLineNum = 3252;BA.debugLine="End Sub";
return "";
}
public String  _mvquoteitems(String _delim,String _mvstring) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbout = null;
anywheresoftware.b4a.objects.collections.List _litems = null;
String _k = "";
String _sout = "";
 //BA.debugLineNum = 795;BA.debugLine="Sub MVQuoteItems(delim As String, mvstring As Stri";
 //BA.debugLineNum = 796;BA.debugLine="Dim sbOut As StringBuilder";
_sbout = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 797;BA.debugLine="sbOut.Initialize";
_sbout.Initialize();
 //BA.debugLineNum = 798;BA.debugLine="Dim lItems As List = StrParse(delim, mvstring)";
_litems = new anywheresoftware.b4a.objects.collections.List();
_litems = _strparse(_delim,_mvstring);
 //BA.debugLineNum = 799;BA.debugLine="For Each k As String In lItems";
{
final anywheresoftware.b4a.BA.IterableList group4 = _litems;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 800;BA.debugLine="k = CStr(k)";
_k = _cstr((Object)(_k));
 //BA.debugLineNum = 801;BA.debugLine="k = k.Trim";
_k = _k.trim();
 //BA.debugLineNum = 802;BA.debugLine="sbOut.Append($\"\"${k}\"\"$).Append(delim)";
_sbout.Append(("\""+__c.SmartStringFormatter("",(Object)(_k))+"\"")).Append(_delim);
 }
};
 //BA.debugLineNum = 804;BA.debugLine="Dim sout As String = sbOut.ToString";
_sout = _sbout.ToString();
 //BA.debugLineNum = 805;BA.debugLine="sout = RemDelim(sout, delim)";
_sout = _remdelim(_sout,_delim);
 //BA.debugLineNum = 806;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 807;BA.debugLine="End Sub";
return "";
}
public String  _mvsinglequoteitems(String _delim,String _mvstring) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbout = null;
anywheresoftware.b4a.objects.collections.List _litems = null;
String _k = "";
String _sout = "";
 //BA.debugLineNum = 827;BA.debugLine="Sub MVSingleQuoteItems(delim As String, mvstring A";
 //BA.debugLineNum = 828;BA.debugLine="Dim sbOut As StringBuilder";
_sbout = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 829;BA.debugLine="sbOut.Initialize";
_sbout.Initialize();
 //BA.debugLineNum = 830;BA.debugLine="Dim lItems As List = StrParse(delim, mvstring)";
_litems = new anywheresoftware.b4a.objects.collections.List();
_litems = _strparse(_delim,_mvstring);
 //BA.debugLineNum = 831;BA.debugLine="For Each k As String In lItems";
{
final anywheresoftware.b4a.BA.IterableList group4 = _litems;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 832;BA.debugLine="k = CStr(k)";
_k = _cstr((Object)(_k));
 //BA.debugLineNum = 833;BA.debugLine="k = k.Trim";
_k = _k.trim();
 //BA.debugLineNum = 834;BA.debugLine="sbOut.Append($\"'${k}'\"$).Append(delim)";
_sbout.Append(("'"+__c.SmartStringFormatter("",(Object)(_k))+"'")).Append(_delim);
 }
};
 //BA.debugLineNum = 836;BA.debugLine="Dim sout As String = sbOut.ToString";
_sout = _sbout.ToString();
 //BA.debugLineNum = 837;BA.debugLine="sout = RemDelim(sout, delim)";
_sout = _remdelim(_sout,_delim);
 //BA.debugLineNum = 838;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 839;BA.debugLine="End Sub";
return "";
}
public String  _navigateto(String _spath) throws Exception{
anywheresoftware.b4a.objects.collections.Map _namem = null;
 //BA.debugLineNum = 3373;BA.debugLine="Sub NavigateTo(sPath As String)";
 //BA.debugLineNum = 3374;BA.debugLine="sPath = sPath.tolowercase";
_spath = _spath.toLowerCase();
 //BA.debugLineNum = 3375;BA.debugLine="Dim namem As Map = CreateMap()";
_namem = new anywheresoftware.b4a.objects.collections.Map();
_namem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 3376;BA.debugLine="namem.put(\"path\", sPath)";
_namem.Put((Object)("path"),(Object)(_spath));
 //BA.debugLineNum = 3377;BA.debugLine="Router.RunMethod(\"push\", Array(namem))";
_router.RunMethod("push",(Object)(new Object[]{(Object)(_namem.getObject())}));
 //BA.debugLineNum = 3378;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _newdate(int _year,int _month,int _day) throws Exception{
com.ab.banano.BANanoObject _dd = null;
 //BA.debugLineNum = 1824;BA.debugLine="Sub NewDate(year As Int, month As Int, day As Int)";
 //BA.debugLineNum = 1825;BA.debugLine="Dim dd As BANanoObject";
_dd = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 1826;BA.debugLine="dd.Initialize2(\"Date\", Array(year, month, day))";
_dd.Initialize2("Date",(Object)(new Object[]{(Object)(_year),(Object)(_month),(Object)(_day)}));
 //BA.debugLineNum = 1827;BA.debugLine="Return dd";
if (true) return _dd;
 //BA.debugLineNum = 1828;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _newdatetime(int _year,int _month,int _day,int _hour,int _minute) throws Exception{
com.ab.banano.BANanoObject _dd = null;
 //BA.debugLineNum = 1830;BA.debugLine="Sub NewDateTime(year As Int, month As Int, day As";
 //BA.debugLineNum = 1831;BA.debugLine="Dim dd As BANanoObject";
_dd = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 1832;BA.debugLine="dd.Initialize2(\"Date\", Array(year, month, day, ho";
_dd.Initialize2("Date",(Object)(new Object[]{(Object)(_year),(Object)(_month),(Object)(_day),(Object)(_hour),(Object)(_minute)}));
 //BA.debugLineNum = 1833;BA.debugLine="Return dd";
if (true) return _dd;
 //BA.debugLineNum = 1834;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _newlist() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 1088;BA.debugLine="Sub NewList As List";
 //BA.debugLineNum = 1089;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1090;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 1091;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 1092;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _newlist1(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
 //BA.debugLineNum = 686;BA.debugLine="Sub NewList1(lst As List) As List";
 //BA.debugLineNum = 687;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 688;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 689;BA.debugLine="nl.AddAll(lst)";
_nl.AddAll(_lst);
 //BA.debugLineNum = 690;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 691;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _newmap() throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
 //BA.debugLineNum = 1159;BA.debugLine="Sub NewMap As Map";
 //BA.debugLineNum = 1160;BA.debugLine="Dim nm As Map";
_nm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1161;BA.debugLine="nm.Initialize";
_nm.Initialize();
 //BA.debugLineNum = 1162;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 1163;BA.debugLine="End Sub";
return null;
}
public boolean  _notstate(String _statename) throws Exception{
boolean _bcurrent = false;
 //BA.debugLineNum = 3143;BA.debugLine="Sub NotState(stateName As String) As Boolean";
 //BA.debugLineNum = 3144;BA.debugLine="Dim bcurrent As Boolean = GetState(stateName,Fals";
_bcurrent = BA.ObjectToBoolean(_getstate(_statename,(Object)(__c.False)));
 //BA.debugLineNum = 3145;BA.debugLine="If bcurrent = Null Then bcurrent = True";
if (_bcurrent==BA.ObjectToBoolean(__c.Null)) { 
_bcurrent = __c.True;};
 //BA.debugLineNum = 3146;BA.debugLine="bcurrent = Not(bcurrent)";
_bcurrent = __c.Not(_bcurrent);
 //BA.debugLineNum = 3147;BA.debugLine="Return bcurrent";
if (true) return _bcurrent;
 //BA.debugLineNum = 3148;BA.debugLine="End Sub";
return false;
}
public String  _nullifyfileselect(String _refid) throws Exception{
 //BA.debugLineNum = 4176;BA.debugLine="Sub NullifyFileSelect(refID As String)";
 //BA.debugLineNum = 4177;BA.debugLine="RefNull(refID)";
_refnull(_refid);
 //BA.debugLineNum = 4178;BA.debugLine="End Sub";
return "";
}
public int  _numberofdaysbetweendates(String _currentdate,String _otherdate) throws Exception{
long _currdate = 0L;
long _othdate = 0L;
long _tpd = 0L;
long _iout = 0L;
 //BA.debugLineNum = 1585;BA.debugLine="Sub NumberOfDaysBetweenDates(CurrentDate As String";
 //BA.debugLineNum = 1586;BA.debugLine="Dim CurrDate, OthDate As Long";
_currdate = 0L;
_othdate = 0L;
 //BA.debugLineNum = 1587;BA.debugLine="CurrDate = DateTime.DateParse(CurrentDate)";
_currdate = __c.DateTime.DateParse(_currentdate);
 //BA.debugLineNum = 1588;BA.debugLine="OthDate = DateTime.DateParse(OtherDate)";
_othdate = __c.DateTime.DateParse(_otherdate);
 //BA.debugLineNum = 1589;BA.debugLine="Dim tpd As Long = DateTime.TicksPerDay";
_tpd = __c.DateTime.TicksPerDay;
 //BA.debugLineNum = 1590;BA.debugLine="Dim iOut As Long = (CurrDate - OthDate)/tpd";
_iout = (long) ((_currdate-_othdate)/(double)_tpd);
 //BA.debugLineNum = 1591;BA.debugLine="Return iOut";
if (true) return (int) (_iout);
 //BA.debugLineNum = 1592;BA.debugLine="End Sub";
return 0;
}
public String  _numbersuffix(double _n) throws Exception{
String[] _suffix = null;
int _thousands = 0;
int _maxdecimalplaces = 0;
double _relativeerror = 0;
 //BA.debugLineNum = 1893;BA.debugLine="Sub NumberSuffix(N As Double) As String";
 //BA.debugLineNum = 1894;BA.debugLine="If N < 0 Then";
if (_n<0) { 
 //BA.debugLineNum = 1895;BA.debugLine="Return \"-\" & NumberSuffix(-N)";
if (true) return "-"+_numbersuffix(-_n);
 };
 //BA.debugLineNum = 1897;BA.debugLine="Dim Suffix() As String = Array As String(\"\", \"k\",";
_suffix = new String[]{"","k","M","B","T"};
 //BA.debugLineNum = 1898;BA.debugLine="Dim Thousands As Int = 0";
_thousands = (int) (0);
 //BA.debugLineNum = 1899;BA.debugLine="Do While N >= 1000 And Thousands < Suffix.Length";
while (_n>=1000 && _thousands<_suffix.length-1) {
 //BA.debugLineNum = 1900;BA.debugLine="Thousands = Thousands + 1";
_thousands = (int) (_thousands+1);
 //BA.debugLineNum = 1901;BA.debugLine="N = N / 1000";
_n = _n/(double)1000;
 }
;
 //BA.debugLineNum = 1903;BA.debugLine="If Thousands = 0 Then";
if (_thousands==0) { 
 //BA.debugLineNum = 1904;BA.debugLine="Return NumberFormat2(N, 1, 2, 2, False)";
if (true) return __c.NumberFormat2(_n,(int) (1),(int) (2),(int) (2),__c.False);
 };
 //BA.debugLineNum = 1907;BA.debugLine="Dim MaxDecimalPlaces As Int = 0";
_maxdecimalplaces = (int) (0);
 //BA.debugLineNum = 1908;BA.debugLine="Do While MaxDecimalPlaces < 5";
while (_maxdecimalplaces<5) {
 //BA.debugLineNum = 1909;BA.debugLine="Dim RelativeError As Double = Abs(N - Round2(N,";
_relativeerror = __c.Abs(_n-__c.Round2(_n,_maxdecimalplaces))/(double)_n;
 //BA.debugLineNum = 1910;BA.debugLine="If RelativeError < 0.007 Then";
if (_relativeerror<0.007) { 
 //BA.debugLineNum = 1911;BA.debugLine="Exit";
if (true) break;
 };
 //BA.debugLineNum = 1913;BA.debugLine="MaxDecimalPlaces = MaxDecimalPlaces + 1";
_maxdecimalplaces = (int) (_maxdecimalplaces+1);
 }
;
 //BA.debugLineNum = 1915;BA.debugLine="Return NumberFormat2(N, 1, 0, MaxDecimalPlaces, F";
if (true) return __c.NumberFormat2(_n,(int) (1),(int) (0),_maxdecimalplaces,__c.False)+_suffix[_thousands];
 //BA.debugLineNum = 1916;BA.debugLine="End Sub";
return "";
}
public String  _onerror(anywheresoftware.b4a.objects.collections.Map _event) throws Exception{
com.ab.banano.BANanoObject _filereader = null;
com.ab.banano.BANanoObject _uploadedfile = null;
boolean _abort = false;
 //BA.debugLineNum = 4135;BA.debugLine="private Sub OnError(event As Map) As String 'ignor";
 //BA.debugLineNum = 4136;BA.debugLine="Dim FileReader As BANanoObject = event.Get(\"targe";
_filereader = new com.ab.banano.BANanoObject();
_filereader = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_event.Get((Object)("target"))));
 //BA.debugLineNum = 4137;BA.debugLine="Dim UploadedFile As BANanoObject = FileReader.Get";
_uploadedfile = new com.ab.banano.BANanoObject();
_uploadedfile = _filereader.GetField("file");
 //BA.debugLineNum = 4138;BA.debugLine="Dim Abort As Boolean = False";
_abort = __c.False;
 //BA.debugLineNum = 4143;BA.debugLine="BANAno.ReturnElse(CreateMap(\"name\": UploadedFile.";
_banano.ReturnElse((Object)(__c.createMap(new Object[] {(Object)("name"),(Object)(_uploadedfile.GetField("name").getObject()),(Object)("result"),(Object)(_filereader.GetField("error").getObject()),(Object)("abort"),(Object)(_abort)}).getObject()));
 //BA.debugLineNum = 4144;BA.debugLine="End Sub";
return "";
}
public String  _onload(anywheresoftware.b4a.objects.collections.Map _event) throws Exception{
com.ab.banano.BANanoObject _filereader = null;
com.ab.banano.BANanoObject _uploadedfile = null;
 //BA.debugLineNum = 4127;BA.debugLine="private Sub OnLoad(event As Map) As String 'ignore";
 //BA.debugLineNum = 4129;BA.debugLine="Dim FileReader As BANanoObject = event.Get(\"targe";
_filereader = new com.ab.banano.BANanoObject();
_filereader = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_event.Get((Object)("target"))));
 //BA.debugLineNum = 4130;BA.debugLine="Dim UploadedFile As BANanoObject = FileReader.Get";
_uploadedfile = new com.ab.banano.BANanoObject();
_uploadedfile = _filereader.GetField("file");
 //BA.debugLineNum = 4132;BA.debugLine="BANAno.ReturnThen(CreateMap(\"name\": UploadedFile.";
_banano.ReturnThen((Object)(__c.createMap(new Object[] {(Object)("name"),(Object)(_uploadedfile.GetField("name").getObject()),(Object)("result"),(Object)(_filereader.GetField("result").getObject())}).getObject()));
 //BA.debugLineNum = 4133;BA.debugLine="End Sub";
return "";
}
public String  _pad(String _value,int _maxlen,String _padchar,boolean _right) throws Exception{
int _intordnolen = 0;
int _i = 0;
 //BA.debugLineNum = 1836;BA.debugLine="Sub Pad(Value As String, MaxLen As Int, PadChar As";
 //BA.debugLineNum = 1837;BA.debugLine="Dim  intOrdNoLen As Int = Value.Length";
_intordnolen = _value.length();
 //BA.debugLineNum = 1838;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 1839;BA.debugLine="For i = 1 To (MaxLen - intOrdNoLen) Step 1";
{
final int step3 = 1;
final int limit3 = (int) ((_maxlen-_intordnolen));
_i = (int) (1) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 1840;BA.debugLine="If right Then";
if (_right) { 
 //BA.debugLineNum = 1841;BA.debugLine="Value =  Value & PadChar";
_value = _value+_padchar;
 }else {
 //BA.debugLineNum = 1843;BA.debugLine="Value = PadChar & Value";
_value = _padchar+_value;
 };
 }
};
 //BA.debugLineNum = 1846;BA.debugLine="Return Value";
if (true) return _value;
 //BA.debugLineNum = 1847;BA.debugLine="End Sub";
return "";
}
public String  _padright(String _value,int _maxlen,String _padchar) throws Exception{
int _intordnolen = 0;
int _i = 0;
 //BA.debugLineNum = 1667;BA.debugLine="Sub PadRight(Value As String, MaxLen As Int, PadCh";
 //BA.debugLineNum = 1668;BA.debugLine="Value = CStr(Value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 1669;BA.debugLine="Dim intOrdNoLen As Int = Len(Value)";
_intordnolen = _len(_value);
 //BA.debugLineNum = 1670;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 1671;BA.debugLine="For i = 1 To (MaxLen - intOrdNoLen) Step 1";
{
final int step4 = 1;
final int limit4 = (int) ((_maxlen-_intordnolen));
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 1672;BA.debugLine="Value = PadChar & Value";
_value = _padchar+_value;
 }
};
 //BA.debugLineNum = 1674;BA.debugLine="Return Value";
if (true) return _value;
 //BA.debugLineNum = 1675;BA.debugLine="End Sub";
return "";
}
public String  _percentage(String _svalue) throws Exception{
 //BA.debugLineNum = 1990;BA.debugLine="Sub Percentage(sValue As String) As String";
 //BA.debugLineNum = 1991;BA.debugLine="If sValue = \"\" Then sValue = \"0.00\"";
if ((_svalue).equals("")) { 
_svalue = "0.00";};
 //BA.debugLineNum = 1992;BA.debugLine="If sValue.Length = 0 Then Return \"0.00\"";
if (_svalue.length()==0) { 
if (true) return "0.00";};
 //BA.debugLineNum = 1993;BA.debugLine="If sValue = \"null\" Then sValue = \"0.00\"";
if ((_svalue).equals("null")) { 
_svalue = "0.00";};
 //BA.debugLineNum = 1994;BA.debugLine="sValue = sValue.Replace(\",\",\"\")";
_svalue = _svalue.replace(",","");
 //BA.debugLineNum = 1995;BA.debugLine="sValue = Val(sValue)";
_svalue = _val(_svalue);
 //BA.debugLineNum = 1996;BA.debugLine="If sValue = \"0\" Then sValue = \"0.00\"";
if ((_svalue).equals("0")) { 
_svalue = "0.00";};
 //BA.debugLineNum = 1997;BA.debugLine="sValue = Round2(sValue,2)";
_svalue = BA.NumberToString(__c.Round2((double)(Double.parseDouble(_svalue)),(int) (2)));
 //BA.debugLineNum = 1998;BA.debugLine="sValue = sValue & \"%\"";
_svalue = _svalue+"%";
 //BA.debugLineNum = 1999;BA.debugLine="Return sValue";
if (true) return _svalue;
 //BA.debugLineNum = 2000;BA.debugLine="End Sub";
return "";
}
public String  _priorityrag(int _dvalue) throws Exception{
 //BA.debugLineNum = 3825;BA.debugLine="Public Sub PriorityRAG(dValue As Int) As String";
 //BA.debugLineNum = 3826;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 3828;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
case 1: {
 //BA.debugLineNum = 3830;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
 //BA.debugLineNum = 3832;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
default: {
 //BA.debugLineNum = 3834;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
 //BA.debugLineNum = 3836;BA.debugLine="End Sub";
return "";
}
public String  _progressrag(double _dvariance) throws Exception{
 //BA.debugLineNum = 3788;BA.debugLine="Public Sub ProgressRAG(dVariance As Double) As Str";
 //BA.debugLineNum = 3789;BA.debugLine="If dVariance < 0 Then";
if (_dvariance<0) { 
 //BA.debugLineNum = 3790;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else if(_dvariance>0) { 
 //BA.debugLineNum = 3792;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else if(_dvariance==0) { 
 //BA.debugLineNum = 3794;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 }else {
 //BA.debugLineNum = 3796;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 };
 //BA.debugLineNum = 3798;BA.debugLine="End Sub";
return "";
}
public int  _progressstatus(int _dvalue) throws Exception{
 //BA.debugLineNum = 3921;BA.debugLine="Sub ProgressStatus(dValue As Int) As Int";
 //BA.debugLineNum = 3922;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 100: {
 //BA.debugLineNum = 3924;BA.debugLine="Return 1";
if (true) return (int) (1);
 break; }
default: {
 //BA.debugLineNum = 3926;BA.debugLine="Return 0";
if (true) return (int) (0);
 break; }
}
;
 //BA.debugLineNum = 3928;BA.debugLine="End Sub";
return 0;
}
public String  _projectdate(String _sdate) throws Exception{
long _dt = 0L;
 //BA.debugLineNum = 1619;BA.debugLine="Sub ProjectDate(sDate As String) As String";
 //BA.debugLineNum = 1620;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
if (_sdate.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 1621;BA.debugLine="Try";
try { //BA.debugLineNum = 1622;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 1623;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
_dt = __c.DateTime.DateParse(_sdate);
 //BA.debugLineNum = 1624;BA.debugLine="DateTime.DateFormat = \"dd-MMM-yyyy, EEE\"";
__c.DateTime.setDateFormat("dd-MMM-yyyy, EEE");
 //BA.debugLineNum = 1625;BA.debugLine="Return DateTime.Date(dt)";
if (true) return __c.DateTime.Date(_dt);
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 1627;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 1629;BA.debugLine="End Sub";
return "";
}
public String  _projectdays(String _sdays) throws Exception{
 //BA.debugLineNum = 1607;BA.debugLine="Sub ProjectDays(sDays As String) As String";
 //BA.debugLineNum = 1608;BA.debugLine="Try";
try { //BA.debugLineNum = 1609;BA.debugLine="sDays = sDays.trim";
_sdays = _sdays.trim();
 //BA.debugLineNum = 1610;BA.debugLine="If sDays = \"\" Then sDays = \"0\"";
if ((_sdays).equals("")) { 
_sdays = "0";};
 //BA.debugLineNum = 1611;BA.debugLine="sDays = sDays.Replace(\",\",\"\")";
_sdays = _sdays.replace(",","");
 //BA.debugLineNum = 1612;BA.debugLine="sDays = NumberFormat2(sDays,0,0,0,True)";
_sdays = __c.NumberFormat2((double)(Double.parseDouble(_sdays)),(int) (0),(int) (0),(int) (0),__c.True);
 //BA.debugLineNum = 1613;BA.debugLine="Return sDays & \" Dys\"";
if (true) return _sdays+" Dys";
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 1615;BA.debugLine="Return \"0 Dys\"";
if (true) return "0 Dys";
 };
 //BA.debugLineNum = 1617;BA.debugLine="End Sub";
return "";
}
public String  _propercase(String _mystr) throws Exception{
String _x = "";
int _j = 0;
int _k = 0;
 //BA.debugLineNum = 2078;BA.debugLine="Sub ProperCase(myStr As String) As String";
 //BA.debugLineNum = 2079;BA.debugLine="Try";
try { //BA.debugLineNum = 2080;BA.debugLine="If myStr.trim.length = 0 Then Return \"\"";
if (_mystr.trim().length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 2081;BA.debugLine="Dim x As String";
_x = "";
 //BA.debugLineNum = 2082;BA.debugLine="Dim j, k As Int";
_j = 0;
_k = 0;
 //BA.debugLineNum = 2083;BA.debugLine="myStr = myStr.tolowercase";
_mystr = _mystr.toLowerCase();
 //BA.debugLineNum = 2084;BA.debugLine="x = myStr.ToUpperCase.CharAt(0)";
_x = BA.ObjectToString(_mystr.toUpperCase().charAt((int) (0)));
 //BA.debugLineNum = 2085;BA.debugLine="myStr = x & myStr.SubString2(1, myStr.Length)";
_mystr = _x+_mystr.substring((int) (1),_mystr.length());
 //BA.debugLineNum = 2086;BA.debugLine="For j = 1 To myStr.Length";
{
final int step8 = 1;
final int limit8 = _mystr.length();
_j = (int) (1) ;
for (;_j <= limit8 ;_j = _j + step8 ) {
 //BA.debugLineNum = 2087;BA.debugLine="k = myStr.IndexOf2(\" \", j + 1)";
_k = _mystr.indexOf(" ",(int) (_j+1));
 //BA.debugLineNum = 2088;BA.debugLine="If k = -1 Then Exit";
if (_k==-1) { 
if (true) break;};
 //BA.debugLineNum = 2089;BA.debugLine="x = myStr.ToUpperCase.CharAt(k + 1)";
_x = BA.ObjectToString(_mystr.toUpperCase().charAt((int) (_k+1)));
 //BA.debugLineNum = 2090;BA.debugLine="myStr = myStr.SubString2(0, k + 1) & x & myStr.";
_mystr = _mystr.substring((int) (0),(int) (_k+1))+_x+_mystr.substring((int) (_k+2),_mystr.length());
 }
};
 //BA.debugLineNum = 2092;BA.debugLine="Return myStr";
if (true) return _mystr;
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 2094;BA.debugLine="Return myStr";
if (true) return _mystr;
 };
 //BA.debugLineNum = 2096;BA.debugLine="End Sub";
return "";
}
public String  _propersubname(String _vx,boolean _removepref) throws Exception{
anywheresoftware.b4a.objects.collections.List _varlist = null;
int _vartot = 0;
int _varcnt = 0;
String _varitem = "";
String _subname1 = "";
 //BA.debugLineNum = 2159;BA.debugLine="Sub ProperSubName(vx As String, removePref As Bool";
 //BA.debugLineNum = 2160;BA.debugLine="vx = vx.Replace(\":\", \"-\")";
_vx = _vx.replace(":","-");
 //BA.debugLineNum = 2161;BA.debugLine="vx = vx.Replace(\".\", \"-\")";
_vx = _vx.replace(".","-");
 //BA.debugLineNum = 2162;BA.debugLine="Dim varList As List = StrParse(\"-\", vx)";
_varlist = new anywheresoftware.b4a.objects.collections.List();
_varlist = _strparse("-",_vx);
 //BA.debugLineNum = 2163;BA.debugLine="If removePref Then";
if (_removepref) { 
 //BA.debugLineNum = 2164;BA.debugLine="varList.RemoveAt(0)";
_varlist.RemoveAt((int) (0));
 };
 //BA.debugLineNum = 2166;BA.debugLine="Dim varTot As Int = varList.Size - 1";
_vartot = (int) (_varlist.getSize()-1);
 //BA.debugLineNum = 2167;BA.debugLine="Dim varCnt As Int";
_varcnt = 0;
 //BA.debugLineNum = 2168;BA.debugLine="For varCnt = 0 To varTot";
{
final int step9 = 1;
final int limit9 = _vartot;
_varcnt = (int) (0) ;
for (;_varcnt <= limit9 ;_varcnt = _varcnt + step9 ) {
 //BA.debugLineNum = 2169;BA.debugLine="Dim varItem As String = varList.Get(varCnt)";
_varitem = BA.ObjectToString(_varlist.Get(_varcnt));
 //BA.debugLineNum = 2170;BA.debugLine="varItem = ProperCase(varItem)";
_varitem = _propercase(_varitem);
 //BA.debugLineNum = 2171;BA.debugLine="varList.Set(varCnt, varItem)";
_varlist.Set(_varcnt,(Object)(_varitem));
 }
};
 //BA.debugLineNum = 2173;BA.debugLine="Dim subName1 As String = Join(\"\",varList)";
_subname1 = _join("",_varlist);
 //BA.debugLineNum = 2174;BA.debugLine="Return subName1";
if (true) return _subname1;
 //BA.debugLineNum = 2175;BA.debugLine="End Sub";
return "";
}
public String  _propersubnamerest(String _vx,boolean _removepref) throws Exception{
anywheresoftware.b4a.objects.collections.List _varlist = null;
int _vartot = 0;
int _varcnt = 0;
String _varitem = "";
String _subname1 = "";
 //BA.debugLineNum = 2138;BA.debugLine="Sub ProperSubNameRest(vx As String, removePref As";
 //BA.debugLineNum = 2139;BA.debugLine="vx = vx.Replace(\":\", \"-\")";
_vx = _vx.replace(":","-");
 //BA.debugLineNum = 2140;BA.debugLine="vx = vx.Replace(\".\", \"-\")";
_vx = _vx.replace(".","-");
 //BA.debugLineNum = 2141;BA.debugLine="Dim varList As List = StrParse(\"-\", vx)";
_varlist = new anywheresoftware.b4a.objects.collections.List();
_varlist = _strparse("-",_vx);
 //BA.debugLineNum = 2142;BA.debugLine="If removePref Then";
if (_removepref) { 
 //BA.debugLineNum = 2143;BA.debugLine="varList.RemoveAt(0)";
_varlist.RemoveAt((int) (0));
 };
 //BA.debugLineNum = 2145;BA.debugLine="Dim varTot As Int = varList.Size - 1";
_vartot = (int) (_varlist.getSize()-1);
 //BA.debugLineNum = 2146;BA.debugLine="Dim varCnt As Int";
_varcnt = 0;
 //BA.debugLineNum = 2147;BA.debugLine="For varCnt = 0 To varTot";
{
final int step9 = 1;
final int limit9 = _vartot;
_varcnt = (int) (0) ;
for (;_varcnt <= limit9 ;_varcnt = _varcnt + step9 ) {
 //BA.debugLineNum = 2148;BA.debugLine="Dim varItem As String = varList.Get(varCnt)";
_varitem = BA.ObjectToString(_varlist.Get(_varcnt));
 //BA.debugLineNum = 2149;BA.debugLine="If varCnt > 0 Then";
if (_varcnt>0) { 
 //BA.debugLineNum = 2150;BA.debugLine="varItem = ProperCase(varItem)";
_varitem = _propercase(_varitem);
 };
 //BA.debugLineNum = 2152;BA.debugLine="varList.Set(varCnt, varItem)";
_varlist.Set(_varcnt,(Object)(_varitem));
 }
};
 //BA.debugLineNum = 2154;BA.debugLine="Dim subName1 As String = Join(\"\",varList)";
_subname1 = _join("",_varlist);
 //BA.debugLineNum = 2155;BA.debugLine="Return subName1";
if (true) return _subname1;
 //BA.debugLineNum = 2156;BA.debugLine="End Sub";
return "";
}
public String  _rag(int _dvalue) throws Exception{
 //BA.debugLineNum = 3838;BA.debugLine="Public Sub RAG(dValue As Int) As String";
 //BA.debugLineNum = 3839;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 3841;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
case 1: {
 //BA.debugLineNum = 3843;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
 //BA.debugLineNum = 3845;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
default: {
 //BA.debugLineNum = 3847;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
 //BA.debugLineNum = 3849;BA.debugLine="End Sub";
return "";
}
public String  _ramovefromlist(anywheresoftware.b4a.objects.collections.List _listx,String _item) throws Exception{
int _li = 0;
 //BA.debugLineNum = 3262;BA.debugLine="Sub RamoveFromList(listX As List, item As String)";
 //BA.debugLineNum = 3263;BA.debugLine="Dim li As Int = listX.IndexOf(item)";
_li = _listx.IndexOf((Object)(_item));
 //BA.debugLineNum = 3264;BA.debugLine="If li >= 0 Then listX.RemoveAt(li)";
if (_li>=0) { 
_listx.RemoveAt(_li);};
 //BA.debugLineNum = 3265;BA.debugLine="End Sub";
return "";
}
public String  _rand_loremipsum(int _count) throws Exception{
String _str = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
 //BA.debugLineNum = 1078;BA.debugLine="Sub Rand_LoremIpsum(count As Int) As String";
 //BA.debugLineNum = 1079;BA.debugLine="Dim str As String = $\"Lorem ipsum dolor sit amet,";
_str = ("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
 //BA.debugLineNum = 1080;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1081;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1082;BA.debugLine="For i = 1 To count";
{
final int step4 = 1;
final int limit4 = _count;
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 1083;BA.debugLine="sb.Append(str).Append(CRLF)";
_sb.Append(_str).Append(__c.CRLF);
 }
};
 //BA.debugLineNum = 1085;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1086;BA.debugLine="End Sub";
return "";
}
public Object  _randlistvalue(anywheresoftware.b4a.objects.collections.List _listx) throws Exception{
 //BA.debugLineNum = 3256;BA.debugLine="Sub RandListValue(ListX As List) As Object";
 //BA.debugLineNum = 3257;BA.debugLine="ShuffleList(ListX)";
_shufflelist(_listx);
 //BA.debugLineNum = 3258;BA.debugLine="Return ListX.Get(Rnd(0, ListX.Size -1))";
if (true) return _listx.Get(__c.Rnd((int) (0),(int) (_listx.getSize()-1)));
 //BA.debugLineNum = 3259;BA.debugLine="End Sub";
return null;
}
public String  _randomstring(int _ilength,boolean _blowercase,boolean _buppercase,boolean _bnumbers,String _additionalchars) throws Exception{
String _source = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _r = 0;
 //BA.debugLineNum = 1927;BA.debugLine="Sub RandomString(iLength As Int, bLowerCase As Boo";
 //BA.debugLineNum = 1928;BA.debugLine="Dim source As String";
_source = "";
 //BA.debugLineNum = 1929;BA.debugLine="If bLowerCase = True Then";
if (_blowercase==__c.True) { 
 //BA.debugLineNum = 1930;BA.debugLine="source = source &\"abcdefghijklmnopqrstuvwxyz\"";
_source = _source+"abcdefghijklmnopqrstuvwxyz";
 };
 //BA.debugLineNum = 1932;BA.debugLine="If bUpperCase = True Then";
if (_buppercase==__c.True) { 
 //BA.debugLineNum = 1933;BA.debugLine="source = source &\"ABCDEFGHIJKLMNOPQRSTUVWXYZ\"";
_source = _source+"ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 };
 //BA.debugLineNum = 1935;BA.debugLine="If bNumbers = True Then";
if (_bnumbers==__c.True) { 
 //BA.debugLineNum = 1936;BA.debugLine="source = source &\"0123456789\"";
_source = _source+"0123456789";
 };
 //BA.debugLineNum = 1938;BA.debugLine="If AdditionalChars.Length > 0 Then";
if (_additionalchars.length()>0) { 
 //BA.debugLineNum = 1939;BA.debugLine="source = source&AdditionalChars";
_source = _source+_additionalchars;
 };
 //BA.debugLineNum = 1942;BA.debugLine="Dim SB As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1943;BA.debugLine="SB.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1944;BA.debugLine="For i = 1 To iLength";
{
final int step16 = 1;
final int limit16 = _ilength;
_i = (int) (1) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 1945;BA.debugLine="Dim r As Int = Rnd(0,source.Length-1)";
_r = __c.Rnd((int) (0),(int) (_source.length()-1));
 //BA.debugLineNum = 1946;BA.debugLine="SB.Append(source.SubString2(r,r+1))";
_sb.Append(_source.substring(_r,(int) (_r+1)));
 }
};
 //BA.debugLineNum = 1948;BA.debugLine="Return SB.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1949;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoPromise  _readasarraybuffer(anywheresoftware.b4a.objects.collections.Map _fr) throws Exception{
com.ab.banano.BANanoPromise _promise = null;
 //BA.debugLineNum = 4103;BA.debugLine="Sub readAsArrayBuffer(fr As Map) As BANanoPromise";
 //BA.debugLineNum = 4104;BA.debugLine="Dim promise As BANanoPromise 'ignore";
_promise = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 4107;BA.debugLine="promise.CallSub(Me, \"ReadFile\", Array(fr, \"readAs";
_promise.CallSub(this,"ReadFile",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fr.getObject()),(Object)("readAsArrayBuffer")}));
 //BA.debugLineNum = 4108;BA.debugLine="Return promise";
if (true) return _promise;
 //BA.debugLineNum = 4109;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _readasbinarystring(anywheresoftware.b4a.objects.collections.Map _fr) throws Exception{
com.ab.banano.BANanoPromise _promise = null;
 //BA.debugLineNum = 4087;BA.debugLine="Sub readAsBinaryString(fr As Map) As BANanoPromise";
 //BA.debugLineNum = 4088;BA.debugLine="Dim promise As BANanoPromise 'ignore";
_promise = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 4091;BA.debugLine="promise.CallSub(Me, \"ReadFile\", Array(fr, \"readAs";
_promise.CallSub(this,"ReadFile",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fr.getObject()),(Object)("readAsBinaryString")}));
 //BA.debugLineNum = 4092;BA.debugLine="Return promise";
if (true) return _promise;
 //BA.debugLineNum = 4093;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _readasdataurl(anywheresoftware.b4a.objects.collections.Map _fr) throws Exception{
com.ab.banano.BANanoPromise _promise = null;
 //BA.debugLineNum = 4095;BA.debugLine="Sub readAsDataURL(fr As Map) As BANanoPromise";
 //BA.debugLineNum = 4096;BA.debugLine="Dim promise As BANanoPromise 'ignore";
_promise = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 4099;BA.debugLine="promise.CallSub(Me, \"ReadFile\", Array(fr, \"readAs";
_promise.CallSub(this,"ReadFile",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fr.getObject()),(Object)("readAsDataURL")}));
 //BA.debugLineNum = 4100;BA.debugLine="Return promise";
if (true) return _promise;
 //BA.debugLineNum = 4101;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _readastext(anywheresoftware.b4a.objects.collections.Map _fr) throws Exception{
com.ab.banano.BANanoPromise _promise = null;
 //BA.debugLineNum = 4079;BA.debugLine="public Sub readAsText(fr As Map) As BANanoPromise";
 //BA.debugLineNum = 4080;BA.debugLine="Dim promise As BANanoPromise 'ignore";
_promise = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 4083;BA.debugLine="promise.CallSub(Me, \"ReadFile\", Array(fr, \"readAs";
_promise.CallSub(this,"ReadFile",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fr.getObject()),(Object)("readAsText")}));
 //BA.debugLineNum = 4084;BA.debugLine="Return promise";
if (true) return _promise;
 //BA.debugLineNum = 4085;BA.debugLine="End Sub";
return null;
}
public String  _readfile(Object _filetoread,String _methodname) throws Exception{
com.ab.banano.BANanoObject _filereader = null;
anywheresoftware.b4a.objects.collections.Map _event = null;
 //BA.debugLineNum = 4111;BA.debugLine="private Sub ReadFile(FileToRead As Object, MethodN";
 //BA.debugLineNum = 4113;BA.debugLine="Dim FileReader As BANanoObject";
_filereader = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 4114;BA.debugLine="FileReader.Initialize2(\"FileReader\", Null)";
_filereader.Initialize2("FileReader",__c.Null);
 //BA.debugLineNum = 4116;BA.debugLine="FileReader.SetField(\"file\", FileToRead)";
_filereader.SetField("file",_filetoread);
 //BA.debugLineNum = 4120;BA.debugLine="Dim event As Map";
_event = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4121;BA.debugLine="FileReader.SetField(\"onload\", BANAno.CallBack(Me,";
_filereader.SetField("onload",_banano.CallBack(this,"OnLoad",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_event.getObject())})));
 //BA.debugLineNum = 4122;BA.debugLine="FileReader.SetField(\"onerror\", BANAno.CallBack(Me";
_filereader.SetField("onerror",_banano.CallBack(this,"OnError",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_event.getObject())})));
 //BA.debugLineNum = 4124;BA.debugLine="FileReader.RunMethod(MethodName, FileToRead)";
_filereader.RunMethod(_methodname,_filetoread);
 //BA.debugLineNum = 4125;BA.debugLine="End Sub";
return "";
}
public String  _refclick(String _refid) throws Exception{
 //BA.debugLineNum = 4187;BA.debugLine="Sub RefClick(refID As String)";
 //BA.debugLineNum = 4188;BA.debugLine="refID = refID.tolowercase";
_refid = _refid.toLowerCase();
 //BA.debugLineNum = 4189;BA.debugLine="refs.GetField(refID).RunMethod(\"click\", Null)";
_refs.GetField(_refid).RunMethod("click",__c.Null);
 //BA.debugLineNum = 4190;BA.debugLine="End Sub";
return "";
}
public String  _refnull(String _refid) throws Exception{
 //BA.debugLineNum = 4180;BA.debugLine="Sub RefNull(refID As String)";
 //BA.debugLineNum = 4181;BA.debugLine="refID = refID.tolowercase";
_refid = _refid.toLowerCase();
 //BA.debugLineNum = 4182;BA.debugLine="refs.GetField(refID).SetField(\"value\", Null)";
_refs.GetField(_refid).SetField("value",__c.Null);
 //BA.debugLineNum = 4183;BA.debugLine="End Sub";
return "";
}
public String  _refreset(String _frmid) throws Exception{
 //BA.debugLineNum = 3070;BA.debugLine="Sub RefReset(frmID As String)";
 //BA.debugLineNum = 3071;BA.debugLine="frmID = frmID.tolowercase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 3072;BA.debugLine="refs.GetField(frmID).RunMethod(\"reset\", Null)";
_refs.GetField(_frmid).RunMethod("reset",__c.Null);
 //BA.debugLineNum = 3073;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _refreshkey(String _keyname) throws Exception{
 //BA.debugLineNum = 4197;BA.debugLine="Sub RefreshKey(keyName As String) As BANanoVue";
 //BA.debugLineNum = 4198;BA.debugLine="keyName = keyName.ToLowerCase";
_keyname = _keyname.toLowerCase();
 //BA.debugLineNum = 4199;BA.debugLine="SetData(keyName, DateTime.now)";
_setdata(_keyname,(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 4200;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 4201;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _registercomponent(String _compname,anywheresoftware.b4a.objects.collections.Map _compoptions) throws Exception{
 //BA.debugLineNum = 2638;BA.debugLine="Sub RegisterComponent(compName As String, compOpti";
 //BA.debugLineNum = 2639;BA.debugLine="compName = compName.tolowercase";
_compname = _compname.toLowerCase();
 //BA.debugLineNum = 2640;BA.debugLine="BOVue.RunMethod(\"component\", Array(compName, comp";
_bovue.RunMethod("component",(Object)(new Object[]{(Object)(_compname),(Object)(_compoptions.getObject())}));
 //BA.debugLineNum = 2641;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2642;BA.debugLine="End Sub";
return null;
}
public String  _remdelim(String _svalue,String _delim) throws Exception{
boolean _sw = false;
int _ldelim = 0;
String _nvalue = "";
 //BA.debugLineNum = 1019;BA.debugLine="Sub RemDelim(sValue As String, Delim As String) As";
 //BA.debugLineNum = 1020;BA.debugLine="Dim sw As Boolean = sValue.EndsWith(Delim)";
_sw = _svalue.endsWith(_delim);
 //BA.debugLineNum = 1021;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 1022;BA.debugLine="Dim lDelim As Int = Delim.Length";
_ldelim = _delim.length();
 //BA.debugLineNum = 1023;BA.debugLine="Dim nValue As String = sValue";
_nvalue = _svalue;
 //BA.debugLineNum = 1024;BA.debugLine="sw = nValue.EndsWith(Delim)";
_sw = _nvalue.endsWith(_delim);
 //BA.debugLineNum = 1025;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 1026;BA.debugLine="nValue = nValue.SubString2(0, nValue.Length-lDe";
_nvalue = _nvalue.substring((int) (0),(int) (_nvalue.length()-_ldelim));
 };
 //BA.debugLineNum = 1028;BA.debugLine="Return nValue";
if (true) return _nvalue;
 }else {
 //BA.debugLineNum = 1030;BA.debugLine="Return sValue";
if (true) return _svalue;
 };
 //BA.debugLineNum = 1032;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.StringBuilderWrapper  _remdelimsb(String _delimiter,anywheresoftware.b4a.keywords.StringBuilderWrapper _value) throws Exception{
int _delimlen = 0;
 //BA.debugLineNum = 1956;BA.debugLine="Sub RemDelimSB(delimiter As String, value As Strin";
 //BA.debugLineNum = 1957;BA.debugLine="If value.tostring.EndsWith(delimiter) = True Then";
if (_value.ToString().endsWith(_delimiter)==__c.True) { 
 //BA.debugLineNum = 1958;BA.debugLine="Dim delimLen As Int = delimiter.length";
_delimlen = _delimiter.length();
 //BA.debugLineNum = 1959;BA.debugLine="value.Remove(value.Length-delimLen,value.Length)";
_value.Remove((int) (_value.getLength()-_delimlen),_value.getLength());
 };
 //BA.debugLineNum = 1961;BA.debugLine="Return value";
if (true) return _value;
 //BA.debugLineNum = 1962;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _removedata(String _key) throws Exception{
 //BA.debugLineNum = 1178;BA.debugLine="Sub RemoveData(key As String) As BANanoVue";
 //BA.debugLineNum = 1179;BA.debugLine="key = key.ToLowerCase";
_key = _key.toLowerCase();
 //BA.debugLineNum = 1180;BA.debugLine="data.Remove(key)";
_data.Remove((Object)(_key));
 //BA.debugLineNum = 1181;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 1182;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _removemethod(String _methodname) throws Exception{
 //BA.debugLineNum = 3549;BA.debugLine="Sub RemoveMethod(methodName As String) As BANanoVu";
 //BA.debugLineNum = 3550;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3551;BA.debugLine="If methods.ContainsKey(methodName) Then";
if (_methods.ContainsKey((Object)(_methodname))) { 
 //BA.debugLineNum = 3552;BA.debugLine="methods.Remove(methodName)";
_methods.Remove((Object)(_methodname));
 };
 //BA.debugLineNum = 3554;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3555;BA.debugLine="End Sub";
return null;
}
public String  _removepreloader() throws Exception{
 //BA.debugLineNum = 946;BA.debugLine="Sub RemovePreloader";
 //BA.debugLineNum = 947;BA.debugLine="BANAno.GetElement(\"#preloader\").Remove";
_banano.GetElement("#preloader").Remove();
 //BA.debugLineNum = 948;BA.debugLine="End Sub";
return "";
}
public String  _replacestring(String _text,String _sfind,String _sreplacewith) throws Exception{
 //BA.debugLineNum = 2020;BA.debugLine="Sub ReplaceString(Text As String, sFind As String,";
 //BA.debugLineNum = 2021;BA.debugLine="Return Text.Replace(sFind, sReplaceWith)";
if (true) return _text.replace(_sfind,_sreplacewith);
 //BA.debugLineNum = 2022;BA.debugLine="End Sub";
return "";
}
public String  _rightstring(String _text,long _llength) throws Exception{
 //BA.debugLineNum = 2010;BA.debugLine="Sub RightString(Text As String, lLength As Long) A";
 //BA.debugLineNum = 2011;BA.debugLine="If lLength>Text.Length Then lLength=Text.Length";
if (_llength>_text.length()) { 
_llength = (long) (_text.length());};
 //BA.debugLineNum = 2012;BA.debugLine="Return Text.SubString(Text.Length-lLength)";
if (true) return _text.substring((int) (_text.length()-_llength));
 //BA.debugLineNum = 2013;BA.debugLine="End Sub";
return "";
}
public String  _rsaidnumber2dateofbirth(String _rsaid) throws Exception{
String _yymmdd = "";
String _yy = "";
String _mm = "";
String _dd = "";
 //BA.debugLineNum = 1543;BA.debugLine="Sub RSAIDNumber2DateOfBirth(rsaID As String) As St";
 //BA.debugLineNum = 1545;BA.debugLine="If rsaID.length = 13 Then";
if (_rsaid.length()==13) { 
 //BA.debugLineNum = 1546;BA.debugLine="Dim yymmdd As String = LeftString(rsaID, 6)";
_yymmdd = _leftstring(_rsaid,(long) (6));
 //BA.debugLineNum = 1547;BA.debugLine="Dim yy As String = LeftString(yymmdd,2)";
_yy = _leftstring(_yymmdd,(long) (2));
 //BA.debugLineNum = 1548;BA.debugLine="Dim mm As String = MidString(yymmdd,3,2)";
_mm = _midstring(_yymmdd,(int) (3),(int) (2));
 //BA.debugLineNum = 1549;BA.debugLine="Dim dd As String = RightString(yymmdd,2)";
_dd = _rightstring(_yymmdd,(long) (2));
 //BA.debugLineNum = 1550;BA.debugLine="yymmdd = $\"19${yy}-${mm}-${dd}\"$";
_yymmdd = ("19"+__c.SmartStringFormatter("",(Object)(_yy))+"-"+__c.SmartStringFormatter("",(Object)(_mm))+"-"+__c.SmartStringFormatter("",(Object)(_dd))+"");
 //BA.debugLineNum = 1551;BA.debugLine="Return yymmdd";
if (true) return _yymmdd;
 }else {
 //BA.debugLineNum = 1553;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 1555;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _runmethod(String _methodname,Object _params) throws Exception{
 //BA.debugLineNum = 3085;BA.debugLine="Sub RunMethod(methodName As String, params As Obje";
 //BA.debugLineNum = 3086;BA.debugLine="Return BOVue.RunMethod(methodName, params)";
if (true) return _bovue.RunMethod(_methodname,_params);
 //BA.debugLineNum = 3087;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _runmethod1(String _methodname,anywheresoftware.b4a.objects.collections.List _args) throws Exception{
 //BA.debugLineNum = 3089;BA.debugLine="Sub RunMethod1(methodName As String, args As List)";
 //BA.debugLineNum = 3090;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3091;BA.debugLine="Return BOVue.RunMethod(methodName, args)";
if (true) return _bovue.RunMethod(_methodname,(Object)(_args.getObject()));
 //BA.debugLineNum = 3092;BA.debugLine="End Sub";
return null;
}
public String  _savebinaryarray2file(Object _iuint8array,String _dbname) throws Exception{
anywheresoftware.b4a.objects.collections.List _fc = null;
com.ab.banano.BANanoObject _blob = null;
 //BA.debugLineNum = 2595;BA.debugLine="Sub SaveBinaryArray2File(iUint8Array As Object, db";
 //BA.debugLineNum = 2596;BA.debugLine="Dim fc As List";
_fc = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2597;BA.debugLine="fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 2598;BA.debugLine="fc.Add(iUint8Array)";
_fc.Add(_iuint8array);
 //BA.debugLineNum = 2600;BA.debugLine="Dim blob As BANanoObject";
_blob = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 2601;BA.debugLine="blob.Initialize2(\"Blob\",Array(fc, CreateMap(\"type";
_blob.Initialize2("Blob",(Object)(new Object[]{(Object)(_fc.getObject()),(Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("application/octet-stream")}).getObject())}));
 //BA.debugLineNum = 2602;BA.debugLine="BANAno.RunJavascriptMethod(\"saveAs\",Array(blob, d";
_banano.RunJavascriptMethod("saveAs",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_blob.getObject()),(Object)(_dbname)}));
 //BA.debugLineNum = 2603;BA.debugLine="End Sub";
return "";
}
public String  _savetext2file(String _content,String _filename) throws Exception{
anywheresoftware.b4a.objects.collections.List _fc = null;
com.ab.banano.BANanoObject _blob = null;
 //BA.debugLineNum = 2586;BA.debugLine="Sub SaveText2File(content As String, fileName As S";
 //BA.debugLineNum = 2587;BA.debugLine="Dim fc As List";
_fc = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2588;BA.debugLine="fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 2589;BA.debugLine="fc.Add(content)";
_fc.Add((Object)(_content));
 //BA.debugLineNum = 2590;BA.debugLine="Dim blob As BANanoObject";
_blob = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 2591;BA.debugLine="blob.Initialize2(\"Blob\",Array(fc, CreateMap(\"type";
_blob.Initialize2("Blob",(Object)(new Object[]{(Object)(_fc.getObject()),(Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("text/plain;charset=utf-8")}).getObject())}));
 //BA.debugLineNum = 2592;BA.debugLine="BANAno.RunJavascriptMethod(\"saveAs\",Array(blob,fi";
_banano.RunJavascriptMethod("saveAs",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_blob.getObject()),(Object)(_filename)}));
 //BA.debugLineNum = 2593;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setactivated(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _activated = null;
 //BA.debugLineNum = 3416;BA.debugLine="Sub SetActivated(EventHandler As Object, methodNam";
 //BA.debugLineNum = 3417;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3418;BA.debugLine="If SubExists(EventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.bananovue)(this);};
 //BA.debugLineNum = 3419;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 3420;BA.debugLine="Dim activated As BANanoObject = BANAno.CallBack(E";
_activated = new com.ab.banano.BANanoObject();
_activated = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 3421;BA.debugLine="Options.Put(\"activated\", activated)";
_options.Put((Object)("activated"),(Object)(_activated.getObject()));
 //BA.debugLineNum = 3422;BA.debugLine="SetMethod(EventHandler, methodName)";
_setmethod(_eventhandler,_methodname);
 //BA.debugLineNum = 3423;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3424;BA.debugLine="End Sub";
return null;
}
public String  _setbackgroundimage(String _elid,String _url) throws Exception{
 //BA.debugLineNum = 2392;BA.debugLine="Sub SetBackgroundImage(elid As String, url As Stri";
 //BA.debugLineNum = 2393;BA.debugLine="BANAno.GetElement(elid).SetStyle(BANAno.ToJson(Cr";
_banano.GetElement(_elid).SetStyle(BA.ObjectToString(_banano.ToJson((Object)(__c.createMap(new Object[] {(Object)("background-image"),(Object)(("url('"+__c.SmartStringFormatter("",(Object)(_url))+"')")),(Object)("background-size"),(Object)("100% 100%")}).getObject()))));
 //BA.debugLineNum = 2394;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setbeforecreate(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _beforecreate = null;
 //BA.debugLineNum = 3485;BA.debugLine="Sub SetBeforeCreate(EventHandler As Object, method";
 //BA.debugLineNum = 3486;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3487;BA.debugLine="If SubExists(EventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.bananovue)(this);};
 //BA.debugLineNum = 3488;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 3489;BA.debugLine="Dim beforeCreate As BANanoObject = BANAno.CallBac";
_beforecreate = new com.ab.banano.BANanoObject();
_beforecreate = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 3490;BA.debugLine="Options.Put(\"beforeCreate\", beforeCreate)";
_options.Put((Object)("beforeCreate"),(Object)(_beforecreate.getObject()));
 //BA.debugLineNum = 3491;BA.debugLine="SetMethod(EventHandler, methodName)";
_setmethod(_eventhandler,_methodname);
 //BA.debugLineNum = 3492;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3493;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setbeforedestroy(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
boolean _beforedestroy = false;
 //BA.debugLineNum = 3473;BA.debugLine="Sub SetBeforeDestroy(EventHandler As Object, metho";
 //BA.debugLineNum = 3474;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3475;BA.debugLine="If SubExists(EventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.bananovue)(this);};
 //BA.debugLineNum = 3476;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 3477;BA.debugLine="Dim beforeDestroy As Boolean = BANAno.CallBack(Ev";
_beforedestroy = BA.ObjectToBoolean(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)})));
 //BA.debugLineNum = 3478;BA.debugLine="Options.Put(\"beforeDestroy\", beforeDestroy)";
_options.Put((Object)("beforeDestroy"),(Object)(_beforedestroy));
 //BA.debugLineNum = 3479;BA.debugLine="SetMethod(EventHandler, methodName)";
_setmethod(_eventhandler,_methodname);
 //BA.debugLineNum = 3480;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3481;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setbeforemount(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _beforemount = null;
 //BA.debugLineNum = 3451;BA.debugLine="Sub SetBeforeMount(EventHandler As Object, methodN";
 //BA.debugLineNum = 3452;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3453;BA.debugLine="If SubExists(EventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.bananovue)(this);};
 //BA.debugLineNum = 3454;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 3455;BA.debugLine="Dim beforeMount As BANanoObject = BANAno.CallBack";
_beforemount = new com.ab.banano.BANanoObject();
_beforemount = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 3456;BA.debugLine="Options.Put(\"beforeMount\", beforeMount)";
_options.Put((Object)("beforeMount"),(Object)(_beforemount.getObject()));
 //BA.debugLineNum = 3457;BA.debugLine="SetMethod(EventHandler, methodName)";
_setmethod(_eventhandler,_methodname);
 //BA.debugLineNum = 3458;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3459;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setbeforeupdate(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
boolean _beforeupdate = false;
 //BA.debugLineNum = 3462;BA.debugLine="Sub SetBeforeUpdate(EventHandler As Object, method";
 //BA.debugLineNum = 3463;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3464;BA.debugLine="If SubExists(EventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.bananovue)(this);};
 //BA.debugLineNum = 3465;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 3466;BA.debugLine="Dim beforeUpdate As Boolean = BANAno.CallBack(Eve";
_beforeupdate = BA.ObjectToBoolean(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)})));
 //BA.debugLineNum = 3467;BA.debugLine="Options.Put(\"beforeUpdate\", beforeUpdate)";
_options.Put((Object)("beforeUpdate"),(Object)(_beforeupdate));
 //BA.debugLineNum = 3468;BA.debugLine="SetMethod(EventHandler, methodName)";
_setmethod(_eventhandler,_methodname);
 //BA.debugLineNum = 3469;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3470;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setboolean(String _k,boolean _b) throws Exception{
 //BA.debugLineNum = 3131;BA.debugLine="Sub SetBoolean(k As String, b As Boolean) As BANan";
 //BA.debugLineNum = 3132;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 3133;BA.debugLine="data.Put(k, b)";
_data.Put((Object)(_k),(Object)(_b));
 //BA.debugLineNum = 3134;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3135;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _setbooleans(anywheresoftware.b4a.objects.collections.Map _rec,anywheresoftware.b4a.objects.collections.List _xfields,String _checkedvalue,String _uncheckedvalue) throws Exception{
String _sfield = "";
String _svalue = "";
 //BA.debugLineNum = 3182;BA.debugLine="Sub SetBooleans(rec As Map, xFields As List, check";
 //BA.debugLineNum = 3183;BA.debugLine="Try";
try { //BA.debugLineNum = 3184;BA.debugLine="For Each sfield As String In xFields";
{
final anywheresoftware.b4a.BA.IterableList group2 = _xfields;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_sfield = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 3185;BA.debugLine="Dim svalue As String = rec.Get(sfield)";
_svalue = BA.ObjectToString(_rec.Get((Object)(_sfield)));
 //BA.debugLineNum = 3186;BA.debugLine="If svalue.EqualsIgnoreCase(checkedValue) Then r";
if (_svalue.equalsIgnoreCase(_checkedvalue)) { 
_rec.Put((Object)(_sfield),(Object)(__c.True));};
 //BA.debugLineNum = 3187;BA.debugLine="If svalue.EqualsIgnoreCase(UnCheckedValue) Then";
if (_svalue.equalsIgnoreCase(_uncheckedvalue)) { 
_rec.Put((Object)(_sfield),(Object)(__c.False));};
 }
};
 //BA.debugLineNum = 3189;BA.debugLine="Return rec";
if (true) return _rec;
 } 
       catch (Exception e9) {
			ba.setLastException(e9); //BA.debugLineNum = 3191;BA.debugLine="Return rec";
if (true) return _rec;
 };
 //BA.debugLineNum = 3193;BA.debugLine="End Sub";
return null;
}
public String  _setcallback(String _methodname,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 3544;BA.debugLine="Sub SetCallBack(methodName As String, cb As BANano";
 //BA.debugLineNum = 3545;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3546;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 //BA.debugLineNum = 3547;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setcloak(boolean _b) throws Exception{
 //BA.debugLineNum = 2432;BA.debugLine="Sub SetCloak(b As Boolean) As BANanoVue";
 //BA.debugLineNum = 2433;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.bananovue)(this);};
 //BA.debugLineNum = 2434;BA.debugLine="Template.SetAttr(\"v-cloak\",\"true\")";
_template._setattr /*b4j.example.vuehtml*/ ("v-cloak","true");
 //BA.debugLineNum = 2435;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2436;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setcomputed(String _k,Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 3558;BA.debugLine="Sub SetComputed(k As String, EventHandler As Objec";
 //BA.debugLineNum = 3559;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 3560;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3561;BA.debugLine="If SubExists(EventHandler, methodName) Then";
if (__c.SubExists(ba,_eventhandler,_methodname)) { 
 //BA.debugLineNum = 3562;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 3563;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(EventHa";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 3564;BA.debugLine="computed.Put(k, cb.Result)";
_computed.Put((Object)(_k),_cb.Result());
 };
 //BA.debugLineNum = 3566;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3567;BA.debugLine="End Sub";
return null;
}
public String  _setcoverimage(String _imgurl) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
String _sjson = "";
 //BA.debugLineNum = 3292;BA.debugLine="Sub SetCoverImage(imgURL As String)";
 //BA.debugLineNum = 3293;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 3294;BA.debugLine="If imgURL = \"none\" Then";
if ((_imgurl).equals("none")) { 
 //BA.debugLineNum = 3295;BA.debugLine="opt.Put(\"background-image\", \"none\")";
_opt.Put((Object)("background-image"),(Object)("none"));
 }else {
 //BA.debugLineNum = 3303;BA.debugLine="opt.Put(\"background\", $\"url('${imgURL}')\"$)";
_opt.Put((Object)("background"),(Object)(("url('"+__c.SmartStringFormatter("",(Object)(_imgurl))+"')")));
 //BA.debugLineNum = 3304;BA.debugLine="opt.Put(\"position\", \"absolute\")";
_opt.Put((Object)("position"),(Object)("absolute"));
 //BA.debugLineNum = 3305;BA.debugLine="opt.Put(\"height\", \"100%\")";
_opt.Put((Object)("height"),(Object)("100%"));
 //BA.debugLineNum = 3306;BA.debugLine="opt.Put(\"width\", \"100%\")";
_opt.Put((Object)("width"),(Object)("100%"));
 //BA.debugLineNum = 3307;BA.debugLine="opt.Put(\"top\", \"0\")";
_opt.Put((Object)("top"),(Object)("0"));
 //BA.debugLineNum = 3308;BA.debugLine="opt.Put(\"bottom\", \"0\")";
_opt.Put((Object)("bottom"),(Object)("0"));
 //BA.debugLineNum = 3309;BA.debugLine="opt.Put(\"right\", \"0\")";
_opt.Put((Object)("right"),(Object)("0"));
 //BA.debugLineNum = 3310;BA.debugLine="opt.Put(\"left\", \"0\")";
_opt.Put((Object)("left"),(Object)("0"));
 //BA.debugLineNum = 3311;BA.debugLine="opt.Put(\"z-index\", \"0\")";
_opt.Put((Object)("z-index"),(Object)("0"));
 };
 //BA.debugLineNum = 3313;BA.debugLine="Dim sjson As String = BANAno.ToJson(opt)";
_sjson = BA.ObjectToString(_banano.ToJson((Object)(_opt.getObject())));
 //BA.debugLineNum = 3314;BA.debugLine="body.SetStyle(sjson)";
_body.SetStyle(_sjson);
 //BA.debugLineNum = 3315;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setcreated(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _created = null;
 //BA.debugLineNum = 3497;BA.debugLine="Sub SetCreated(EventHandler As Object, methodName";
 //BA.debugLineNum = 3498;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3499;BA.debugLine="If SubExists(EventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.bananovue)(this);};
 //BA.debugLineNum = 3500;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 3501;BA.debugLine="Dim created As BANanoObject = BANAno.CallBack(Eve";
_created = new com.ab.banano.BANanoObject();
_created = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 3502;BA.debugLine="Options.Put(\"created\", created)";
_options.Put((Object)("created"),(Object)(_created.getObject()));
 //BA.debugLineNum = 3503;BA.debugLine="SetMethod(EventHandler, methodName)";
_setmethod(_eventhandler,_methodname);
 //BA.debugLineNum = 3504;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3505;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setdata(String _prop,Object _valuex) throws Exception{
 //BA.debugLineNum = 1184;BA.debugLine="Sub SetData(prop As String, valuex As Object) As B";
 //BA.debugLineNum = 1185;BA.debugLine="SetStateSingle(prop, valuex)";
_setstatesingle(_prop,_valuex);
 //BA.debugLineNum = 1186;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 1187;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setdataglobal(String _prop,Object _value) throws Exception{
com.ab.banano.BANanoObject _bo = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 694;BA.debugLine="Sub SetDataGlobal(prop As String, value As Object)";
 //BA.debugLineNum = 695;BA.debugLine="prop = prop.ToLowerCase";
_prop = _prop.toLowerCase();
 //BA.debugLineNum = 696;BA.debugLine="state.Put(prop, value)";
_state.Put((Object)(_prop),_value);
 //BA.debugLineNum = 698;BA.debugLine="Try";
try { //BA.debugLineNum = 699;BA.debugLine="Dim bo As BANanoObject = store.GetField(prop)";
_bo = new com.ab.banano.BANanoObject();
_bo = _store.GetField(_prop);
 //BA.debugLineNum = 700;BA.debugLine="If BANAno.IsNull(bo) Then Return Me";
if (_banano.IsNull((Object)(_bo.getObject()))) { 
if (true) return (b4j.example.bananovue)(this);};
 //BA.debugLineNum = 701;BA.debugLine="If BANAno.IsUndefined(bo) Then Return Me";
if (_banano.IsUndefined((Object)(_bo.getObject()))) { 
if (true) return (b4j.example.bananovue)(this);};
 //BA.debugLineNum = 703;BA.debugLine="store.GetField(prop).SetField(prop, value)";
_store.GetField(_prop).SetField(_prop,_value);
 } 
       catch (Exception e9) {
			ba.setLastException(e9); //BA.debugLineNum = 705;BA.debugLine="Log($\"Error - VueApp.SetDataGlobal: ${prop}.${va";
__c.Log(("Error - VueApp.SetDataGlobal: "+__c.SmartStringFormatter("",(Object)(_prop))+"."+__c.SmartStringFormatter("",_value)+""));
 };
 //BA.debugLineNum = 709;BA.debugLine="If computed.ContainsKey(prop) = False Then";
if (_computed.ContainsKey((Object)(_prop))==__c.False) { 
 //BA.debugLineNum = 710;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBackExtra(Me";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBackExtra(this,"getglobalstate",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_prop)}))));
 //BA.debugLineNum = 711;BA.debugLine="computed.Put(prop, cb.Result)";
_computed.Put((Object)(_prop),_cb.Result());
 };
 //BA.debugLineNum = 713;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 714;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setdeactivated(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _deactivated = null;
 //BA.debugLineNum = 3428;BA.debugLine="Sub SetDeActivated(EventHandler As Object, methodN";
 //BA.debugLineNum = 3429;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3430;BA.debugLine="If SubExists(EventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.bananovue)(this);};
 //BA.debugLineNum = 3431;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 3432;BA.debugLine="Dim deactivated As BANanoObject = BANAno.CallBack";
_deactivated = new com.ab.banano.BANanoObject();
_deactivated = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 3433;BA.debugLine="Options.Put(\"deactivated\", deactivated)";
_options.Put((Object)("deactivated"),(Object)(_deactivated.getObject()));
 //BA.debugLineNum = 3434;BA.debugLine="SetMethod(EventHandler, methodName)";
_setmethod(_eventhandler,_methodname);
 //BA.debugLineNum = 3435;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3436;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setdestroyed(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _destroyed = null;
 //BA.debugLineNum = 3404;BA.debugLine="Sub SetDestroyed(EventHandler As Object, methodNam";
 //BA.debugLineNum = 3405;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3406;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.bananovue)(this);};
 //BA.debugLineNum = 3407;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 3408;BA.debugLine="Dim destroyed As BANanoObject = BANAno.CallBack(E";
_destroyed = new com.ab.banano.BANanoObject();
_destroyed = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 3409;BA.debugLine="Options.Put(\"destroyed\", destroyed)";
_options.Put((Object)("destroyed"),(Object)(_destroyed.getObject()));
 //BA.debugLineNum = 3410;BA.debugLine="SetMethod(EventHandler, methodName)";
_setmethod(_eventhandler,_methodname);
 //BA.debugLineNum = 3411;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3412;BA.debugLine="End Sub";
return null;
}
public String  _setdisabledstate(String _k,boolean _v) throws Exception{
String _diskey = "";
 //BA.debugLineNum = 2296;BA.debugLine="Sub SetDisabledState(k As String, v As Boolean)";
 //BA.debugLineNum = 2297;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"disabled");
 //BA.debugLineNum = 2298;BA.debugLine="SetStateSingle(disKey, v)";
_setstatesingle(_diskey,(Object)(_v));
 //BA.debugLineNum = 2299;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(String _elid,boolean _b) throws Exception{
 //BA.debugLineNum = 3998;BA.debugLine="Sub SetEnabled(elID As String, b As Boolean)";
 //BA.debugLineNum = 3999;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 4000;BA.debugLine="SetStateSingle($\"${elID}disabled\"$, b)";
_setstatesingle((""+__c.SmartStringFormatter("",(Object)(_elid))+"disabled"),(Object)(_b));
 //BA.debugLineNum = 4001;BA.debugLine="End Sub";
return "";
}
public String  _seterrorstate(String _k,boolean _v) throws Exception{
String _showkey = "";
 //BA.debugLineNum = 2290;BA.debugLine="Sub SetErrorState(k As String, v As Boolean)";
 //BA.debugLineNum = 2291;BA.debugLine="Dim showKey As String = $\"${k}error\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"error");
 //BA.debugLineNum = 2292;BA.debugLine="SetStateSingle(showKey, v)";
_setstatesingle(_showkey,(Object)(_v));
 //BA.debugLineNum = 2293;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setfilter(String _k,Object _eventhandler,String _methodname) throws Exception{
Object _value = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 3531;BA.debugLine="Sub SetFilter(k As String, EventHandler As Object,";
 //BA.debugLineNum = 3532;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 3533;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3534;BA.debugLine="If SubExists(EventHandler, methodName) Then";
if (__c.SubExists(ba,_eventhandler,_methodname)) { 
 //BA.debugLineNum = 3535;BA.debugLine="Dim value As Object";
_value = new Object();
 //BA.debugLineNum = 3536;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(EventHa";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_value}))));
 //BA.debugLineNum = 3537;BA.debugLine="filters.Put(k, cb.Result)";
_filters.Put((Object)(_k),_cb.Result());
 }else {
 //BA.debugLineNum = 3539;BA.debugLine="Log($\"SetFilter.${methodName} could not be found";
__c.Log(("SetFilter."+__c.SmartStringFormatter("",(Object)(_methodname))+" could not be found!"));
 };
 //BA.debugLineNum = 3541;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3542;BA.debugLine="End Sub";
return null;
}
public String  _setfocus(String _refid) throws Exception{
 //BA.debugLineNum = 4169;BA.debugLine="Sub SetFocus(refID As String)";
 //BA.debugLineNum = 4170;BA.debugLine="refID = refID.tolowercase";
_refid = _refid.toLowerCase();
 //BA.debugLineNum = 4171;BA.debugLine="refs.GetField(refID).RunMethod(\"focus\", Null)";
_refs.GetField(_refid).RunMethod("focus",__c.Null);
 //BA.debugLineNum = 4172;BA.debugLine="End Sub";
return "";
}
public String  _setfontfamily(Object _ff) throws Exception{
 //BA.debugLineNum = 3287;BA.debugLine="Sub SetFontFamily(ff As Object)";
 //BA.debugLineNum = 3288;BA.debugLine="body.SetStyle(BANAno.ToJson(CreateMap(\"font-famil";
_body.SetStyle(BA.ObjectToString(_banano.ToJson((Object)(__c.createMap(new Object[] {(Object)("font-family"),_ff}).getObject()))));
 //BA.debugLineNum = 3289;BA.debugLine="End Sub";
return "";
}
public String  _setframework(String _optname,com.ab.banano.BANanoObject _boframework) throws Exception{
 //BA.debugLineNum = 3332;BA.debugLine="Sub SetFrameWork(optName As String, boFrameWork As";
 //BA.debugLineNum = 3333;BA.debugLine="Options.Put(optName, boFrameWork)";
_options.Put((Object)(_optname),(Object)(_boframework.getObject()));
 //BA.debugLineNum = 3334;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setlist(String _k,boolean _l) throws Exception{
 //BA.debugLineNum = 3137;BA.debugLine="Sub SetList(k As String, l As Boolean) As BANanoVu";
 //BA.debugLineNum = 3138;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 3139;BA.debugLine="data.Put(k, l)";
_data.Put((Object)(_k),(Object)(_l));
 //BA.debugLineNum = 3140;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3141;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setmethod(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 3508;BA.debugLine="Sub SetMethod(EventHandler As Object, methodName A";
 //BA.debugLineNum = 3509;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3510;BA.debugLine="If SubExists(EventHandler, methodName) Then";
if (__c.SubExists(ba,_eventhandler,_methodname)) { 
 //BA.debugLineNum = 3511;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 3512;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(EventHa";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 3513;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 }else {
 //BA.debugLineNum = 3515;BA.debugLine="Log($\"SetMethod.${methodName} could not be found";
__c.Log(("SetMethod."+__c.SmartStringFormatter("",(Object)(_methodname))+" could not be found!"));
 };
 //BA.debugLineNum = 3517;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3518;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setmethod1(Object _eventhandler,String _methodname,anywheresoftware.b4a.objects.collections.List _args) throws Exception{
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 3521;BA.debugLine="Sub SetMethod1(EventHandler As Object, methodName";
 //BA.debugLineNum = 3522;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3523;BA.debugLine="If SubExists(EventHandler, methodName) Then";
if (__c.SubExists(ba,_eventhandler,_methodname)) { 
 //BA.debugLineNum = 3524;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(EventHa";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,_args)));
 //BA.debugLineNum = 3525;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 3527;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3528;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setmounted(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _mounted = null;
 //BA.debugLineNum = 3392;BA.debugLine="Sub SetMounted(EventHandler As Object, methodName";
 //BA.debugLineNum = 3393;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3394;BA.debugLine="If SubExists(EventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.bananovue)(this);};
 //BA.debugLineNum = 3395;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 3396;BA.debugLine="Dim mounted As BANanoObject = BANAno.CallBack(Eve";
_mounted = new com.ab.banano.BANanoObject();
_mounted = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 3397;BA.debugLine="Options.Put(\"mounted\", mounted)";
_options.Put((Object)("mounted"),(Object)(_mounted.getObject()));
 //BA.debugLineNum = 3398;BA.debugLine="SetMethod(EventHandler, methodName)";
_setmethod(_eventhandler,_methodname);
 //BA.debugLineNum = 3399;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3400;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setnexttick(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 3569;BA.debugLine="Sub SetNextTick(EventHandler As Object, methodName";
 //BA.debugLineNum = 3570;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3571;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 3572;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(EventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 3573;BA.debugLine="BOVue.RunMethod(\"nextTick\", cb)";
_bovue.RunMethod("nextTick",(Object)(_cb.getObject()));
 //BA.debugLineNum = 3574;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3575;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setonreadychange(Object _eventhandler) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 909;BA.debugLine="Sub SetOnReadyChange(EventHandler As Object) As BA";
 //BA.debugLineNum = 910;BA.debugLine="If SubExists(EventHandler, \"ReadyChange\") = False";
if (__c.SubExists(ba,_eventhandler,"ReadyChange")==__c.False) { 
if (true) return (b4j.example.bananovue)(this);};
 //BA.debugLineNum = 911;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 912;BA.debugLine="Dim cb As BANanoObject = BANAno.callback(EventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,"ReadyChange",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 913;BA.debugLine="BANAno.Window.GetField(\"document\").AddEventListen";
_banano.Window().GetField("document").AddEventListener("readystatechange",(Object)(_cb.getObject()),__c.True);
 //BA.debugLineNum = 914;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 915;BA.debugLine="End Sub";
return null;
}
public String  _setoptionbo(String _optionname,com.ab.banano.BANanoObject _optionobject) throws Exception{
 //BA.debugLineNum = 2634;BA.debugLine="Sub SetOptionBO(optionName As String, optionObject";
 //BA.debugLineNum = 2635;BA.debugLine="Options.Put(optionName, optionObject)";
_options.Put((Object)(_optionname),(Object)(_optionobject.getObject()));
 //BA.debugLineNum = 2636;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _setprefix(String _prefix,anywheresoftware.b4a.objects.collections.Map _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _mk = "";
Object _mv = null;
String _mk1 = "";
 //BA.debugLineNum = 2870;BA.debugLine="Sub SetPrefix(prefix As String, target As Map) As";
 //BA.debugLineNum = 2871;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2872;BA.debugLine="For Each mk As String In target.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _target.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_mk = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 2873;BA.debugLine="Dim mv As Object = target.Get(mk)";
_mv = _target.Get((Object)(_mk));
 //BA.debugLineNum = 2874;BA.debugLine="Dim mk1 As String = prefix & \"_\" & mk";
_mk1 = _prefix+"_"+_mk;
 //BA.debugLineNum = 2875;BA.debugLine="nm.Put(mk1,mv)";
_nm.Put((Object)(_mk1),_mv);
 }
};
 //BA.debugLineNum = 2877;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 2878;BA.debugLine="End Sub";
return null;
}
public String  _setrequired(String _elid,boolean _b) throws Exception{
 //BA.debugLineNum = 3983;BA.debugLine="Sub SetRequired(elID As String, b As Boolean)";
 //BA.debugLineNum = 3984;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 3985;BA.debugLine="SetStateSingle($\"${elID}required\"$, b)";
_setstatesingle((""+__c.SmartStringFormatter("",(Object)(_elid))+"required"),(Object)(_b));
 //BA.debugLineNum = 3986;BA.debugLine="End Sub";
return "";
}
public String  _setrequiredstate(String _k,boolean _v) throws Exception{
String _diskey = "";
 //BA.debugLineNum = 2973;BA.debugLine="Sub SetRequiredState(k As String, v As Boolean)";
 //BA.debugLineNum = 2974;BA.debugLine="Dim disKey As String = $\"${k}required\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"required");
 //BA.debugLineNum = 2975;BA.debugLine="SetStateSingle(disKey, v)";
_setstatesingle(_diskey,(Object)(_v));
 //BA.debugLineNum = 2976;BA.debugLine="End Sub";
return "";
}
public String  _setshowstate(String _k,boolean _v) throws Exception{
String _showkey = "";
 //BA.debugLineNum = 2285;BA.debugLine="Sub SetShowState(k As String, v As Boolean)";
 //BA.debugLineNum = 2286;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"show");
 //BA.debugLineNum = 2287;BA.debugLine="SetStateSingle(showKey, v)";
_setstatesingle(_showkey,(Object)(_v));
 //BA.debugLineNum = 2288;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setstate(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
Object _v = null;
 //BA.debugLineNum = 3608;BA.debugLine="Sub SetState(m As Map) As BANanoVue";
 //BA.debugLineNum = 3609;BA.debugLine="Try";
try { //BA.debugLineNum = 3610;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 3611;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 3612;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 3613;BA.debugLine="data.Put(k, v)";
_data.Put((Object)(_k),_v);
 }
};
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 3616;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
 //BA.debugLineNum = 3618;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3619;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatedecrement(String _k) throws Exception{
String _oldv = "";
 //BA.debugLineNum = 3111;BA.debugLine="Sub SetStateDecrement(k As String) As BANanoVue";
 //BA.debugLineNum = 3112;BA.debugLine="Dim oldV As String = GetState(k, \"0\")";
_oldv = BA.ObjectToString(_getstate(_k,(Object)("0")));
 //BA.debugLineNum = 3113;BA.debugLine="oldV = BANAno.parseInt(oldV) - 1";
_oldv = BA.NumberToString(_banano.parseInt((Object)(_oldv))-1);
 //BA.debugLineNum = 3114;BA.debugLine="SetStateSingle(k, oldV)";
_setstatesingle(_k,(Object)(_oldv));
 //BA.debugLineNum = 3115;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3116;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatefalse(String _k) throws Exception{
 //BA.debugLineNum = 3099;BA.debugLine="Sub SetStateFalse(k As String) As BANanoVue";
 //BA.debugLineNum = 3100;BA.debugLine="SetStateSingle(k,False)";
_setstatesingle(_k,(Object)(__c.False));
 //BA.debugLineNum = 3101;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3102;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstateincrement(String _k) throws Exception{
String _oldv = "";
 //BA.debugLineNum = 3104;BA.debugLine="Sub SetStateIncrement(k As String) As BANanoVue";
 //BA.debugLineNum = 3105;BA.debugLine="Dim oldV As String = GetState(k, \"0\")";
_oldv = BA.ObjectToString(_getstate(_k,(Object)("0")));
 //BA.debugLineNum = 3106;BA.debugLine="oldV = BANAno.parseInt(oldV) + 1";
_oldv = BA.NumberToString(_banano.parseInt((Object)(_oldv))+1);
 //BA.debugLineNum = 3107;BA.debugLine="SetStateSingle(k, oldV)";
_setstatesingle(_k,(Object)(_oldv));
 //BA.debugLineNum = 3108;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3109;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatelist(String _k,anywheresoftware.b4a.objects.collections.List _l) throws Exception{
 //BA.debugLineNum = 3118;BA.debugLine="Sub SetStateList(k As String, l As List) As BANano";
 //BA.debugLineNum = 3119;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 3120;BA.debugLine="data.Put(k, l)";
_data.Put((Object)(_k),(Object)(_l.getObject()));
 //BA.debugLineNum = 3121;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3122;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatelistvalues(anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
String _lstvalue = "";
 //BA.debugLineNum = 3600;BA.debugLine="Sub SetStateListValues(mapValues As List) As BANan";
 //BA.debugLineNum = 3601;BA.debugLine="For Each lstValue As String In mapValues";
{
final anywheresoftware.b4a.BA.IterableList group1 = _mapvalues;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lstvalue = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 3602;BA.debugLine="SetStateSingle(lstValue,\"\")";
_setstatesingle(_lstvalue,(Object)(""));
 }
};
 //BA.debugLineNum = 3604;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3605;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatemap(String _mapkey,anywheresoftware.b4a.objects.collections.Map _mapvalues) throws Exception{
 //BA.debugLineNum = 3595;BA.debugLine="Sub SetStateMap(mapKey As String, mapValues As Map";
 //BA.debugLineNum = 3596;BA.debugLine="SetStateSingle(mapKey, mapValues)";
_setstatesingle(_mapkey,(Object)(_mapvalues.getObject()));
 //BA.debugLineNum = 3597;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3598;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatesingle(String _k,Object _v) throws Exception{
 //BA.debugLineNum = 3125;BA.debugLine="Sub SetStateSingle(k As String, v As Object) As BA";
 //BA.debugLineNum = 3126;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 3127;BA.debugLine="data.Put(k, v)";
_data.Put((Object)(_k),_v);
 //BA.debugLineNum = 3128;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3129;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatetrue(String _k) throws Exception{
 //BA.debugLineNum = 3094;BA.debugLine="Sub SetStateTrue(k As String) As BANanoVue";
 //BA.debugLineNum = 3095;BA.debugLine="SetStateSingle(k,True)";
_setstatesingle(_k,(Object)(__c.True));
 //BA.debugLineNum = 3096;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3097;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstyle(String _classname,String _prop,String _valx) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 2572;BA.debugLine="Sub SetStyle(className As String, prop As String,";
 //BA.debugLineNum = 2573;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2574;BA.debugLine="If dynamicStyle.ContainsKey(className) Then";
if (_dynamicstyle.ContainsKey((Object)(_classname))) { 
 //BA.debugLineNum = 2575;BA.debugLine="m = dynamicStyle.Get(className)";
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_dynamicstyle.Get((Object)(_classname))));
 //BA.debugLineNum = 2576;BA.debugLine="m.Put(prop, valx)";
_m.Put((Object)(_prop),(Object)(_valx));
 }else {
 //BA.debugLineNum = 2578;BA.debugLine="m = CreateMap()";
_m = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2579;BA.debugLine="m.Put(prop, valx)";
_m.Put((Object)(_prop),(Object)(_valx));
 };
 //BA.debugLineNum = 2581;BA.debugLine="dynamicStyle.Put(className, m)";
_dynamicstyle.Put((Object)(_classname),(Object)(_m.getObject()));
 //BA.debugLineNum = 2582;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2583;BA.debugLine="End Sub";
return null;
}
public String  _settemplate(String _tmp) throws Exception{
 //BA.debugLineNum = 3318;BA.debugLine="Sub SetTemplate(tmp As String)";
 //BA.debugLineNum = 3319;BA.debugLine="Template.SetText(tmp)";
_template._settext /*b4j.example.vuehtml*/ (_tmp);
 //BA.debugLineNum = 3320;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _setuncheckedvalue(anywheresoftware.b4a.objects.collections.Map _rec,anywheresoftware.b4a.objects.collections.List _xfields,String _checkedvalue,String _uncheckedvalue) throws Exception{
String _sfield = "";
String _svalue = "";
 //BA.debugLineNum = 3195;BA.debugLine="Sub SetUncheckedValue(rec As Map, xfields As List,";
 //BA.debugLineNum = 3196;BA.debugLine="Try";
try { //BA.debugLineNum = 3197;BA.debugLine="For Each sfield As String In xfields";
{
final anywheresoftware.b4a.BA.IterableList group2 = _xfields;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_sfield = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 3198;BA.debugLine="Dim svalue As String = rec.Get(sfield)";
_svalue = BA.ObjectToString(_rec.Get((Object)(_sfield)));
 //BA.debugLineNum = 3199;BA.debugLine="If svalue.EqualsIgnoreCase(checkedValue) = Fals";
if (_svalue.equalsIgnoreCase(_checkedvalue)==__c.False) { 
 //BA.debugLineNum = 3200;BA.debugLine="rec.Put(sfield, UncheckedValue)";
_rec.Put((Object)(_sfield),(Object)(_uncheckedvalue));
 };
 }
};
 //BA.debugLineNum = 3203;BA.debugLine="Return rec";
if (true) return _rec;
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 3205;BA.debugLine="Return rec";
if (true) return _rec;
 };
 //BA.debugLineNum = 3207;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setupdated(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _updated = null;
 //BA.debugLineNum = 3440;BA.debugLine="Sub SetUpdated(EventHandler As Object, methodName";
 //BA.debugLineNum = 3441;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3442;BA.debugLine="If SubExists(EventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.bananovue)(this);};
 //BA.debugLineNum = 3443;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 3444;BA.debugLine="Dim updated As BANanoObject = BANAno.CallBack(Eve";
_updated = new com.ab.banano.BANanoObject();
_updated = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 3445;BA.debugLine="Options.Put(\"updated\", updated)";
_options.Put((Object)("updated"),(Object)(_updated.getObject()));
 //BA.debugLineNum = 3446;BA.debugLine="SetMethod(EventHandler, methodName)";
_setmethod(_eventhandler,_methodname);
 //BA.debugLineNum = 3447;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3448;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setwatch(String _k,boolean _bimmediate,boolean _bdeep,Object _eventhandler,String _methodname) throws Exception{
Object _newval = null;
com.ab.banano.BANanoObject _cb = null;
anywheresoftware.b4a.objects.collections.Map _deepit = null;
 //BA.debugLineNum = 3578;BA.debugLine="Sub SetWatch(k As String, bImmediate As Boolean, b";
 //BA.debugLineNum = 3579;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 3580;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 3581;BA.debugLine="If SubExists(EventHandler, methodName) Then";
if (__c.SubExists(ba,_eventhandler,_methodname)) { 
 //BA.debugLineNum = 3582;BA.debugLine="Dim newVal As Object";
_newval = new Object();
 //BA.debugLineNum = 3583;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(EventHa";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_newval}))));
 //BA.debugLineNum = 3584;BA.debugLine="Dim deepit As Map = CreateMap()";
_deepit = new anywheresoftware.b4a.objects.collections.Map();
_deepit = __c.createMap(new Object[] {});
 //BA.debugLineNum = 3585;BA.debugLine="deepit.Put(\"handler\", methodName)";
_deepit.Put((Object)("handler"),(Object)(_methodname));
 //BA.debugLineNum = 3586;BA.debugLine="deepit.Put(\"deep\", bDeep)";
_deepit.Put((Object)("deep"),(Object)(_bdeep));
 //BA.debugLineNum = 3587;BA.debugLine="deepit.Put(\"immediate\", bImmediate)";
_deepit.Put((Object)("immediate"),(Object)(_bimmediate));
 //BA.debugLineNum = 3588;BA.debugLine="watches.Put(k, deepit)";
_watches.Put((Object)(_k),(Object)(_deepit.getObject()));
 //BA.debugLineNum = 3589;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 3591;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3592;BA.debugLine="End Sub";
return null;
}
public String  _show(String _elid) throws Exception{
 //BA.debugLineNum = 4008;BA.debugLine="Sub Show(elID As String)";
 //BA.debugLineNum = 4009;BA.debugLine="SetStateSingle($\"${elID}value\"$, True)";
_setstatesingle((""+__c.SmartStringFormatter("",(Object)(_elid))+"value"),(Object)(__c.True));
 //BA.debugLineNum = 4010;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _showbody() throws Exception{
anywheresoftware.b4a.objects.collections.Map _stylem = null;
 //BA.debugLineNum = 924;BA.debugLine="private Sub ShowBody As BANanoVue";
 //BA.debugLineNum = 925;BA.debugLine="Dim stylem As Map = CreateMap(\"visibility\":\"visib";
_stylem = new anywheresoftware.b4a.objects.collections.Map();
_stylem = __c.createMap(new Object[] {(Object)("visibility"),(Object)("visible")});
 //BA.debugLineNum = 926;BA.debugLine="body.SetStyle(BANAno.ToJson(stylem))";
_body.SetStyle(BA.ObjectToString(_banano.ToJson((Object)(_stylem.getObject()))));
 //BA.debugLineNum = 927;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 928;BA.debugLine="End Sub";
return null;
}
public String  _showerror(String _elid,String _elerror) throws Exception{
String _pp = "";
anywheresoftware.b4a.objects.collections.List _nl = null;
String _pp1 = "";
 //BA.debugLineNum = 2825;BA.debugLine="Sub ShowError(elID As String, elError As String)";
 //BA.debugLineNum = 2826;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 2827;BA.debugLine="Dim pp As String = $\"${elID}ErrorMessages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_elid))+"ErrorMessages");
 //BA.debugLineNum = 2828;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2829;BA.debugLine="nl = NewList";
_nl = _newlist();
 //BA.debugLineNum = 2830;BA.debugLine="nl.Add(elError)";
_nl.Add((Object)(_elerror));
 //BA.debugLineNum = 2831;BA.debugLine="SetData(pp, nl)";
_setdata(_pp,(Object)(_nl.getObject()));
 //BA.debugLineNum = 2832;BA.debugLine="Dim pp1 As String = $\"${elID}Error\"$";
_pp1 = (""+__c.SmartStringFormatter("",(Object)(_elid))+"Error");
 //BA.debugLineNum = 2833;BA.debugLine="SetData(pp1, True)";
_setdata(_pp1,(Object)(__c.True));
 //BA.debugLineNum = 2834;BA.debugLine="End Sub";
return "";
}
public String  _showfileselect(String _fsname) throws Exception{
 //BA.debugLineNum = 4192;BA.debugLine="Sub ShowFileSelect(fsName As String)";
 //BA.debugLineNum = 4193;BA.debugLine="RefClick(fsName)";
_refclick(_fsname);
 //BA.debugLineNum = 4194;BA.debugLine="End Sub";
return "";
}
public String  _showitem(String _elid) throws Exception{
 //BA.debugLineNum = 2623;BA.debugLine="Sub ShowItem(elID As String)";
 //BA.debugLineNum = 2624;BA.debugLine="SetStateSingle($\"${elID}show\"$, True)";
_setstatesingle((""+__c.SmartStringFormatter("",(Object)(_elid))+"show"),(Object)(__c.True));
 //BA.debugLineNum = 2625;BA.debugLine="SetStateSingle($\"${elID}badgeshow\"$, True)";
_setstatesingle((""+__c.SmartStringFormatter("",(Object)(_elid))+"badgeshow"),(Object)(__c.True));
 //BA.debugLineNum = 2626;BA.debugLine="End Sub";
return "";
}
public String  _showitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
String _item = "";
 //BA.debugLineNum = 2323;BA.debugLine="Sub ShowItems(items As List)";
 //BA.debugLineNum = 2324;BA.debugLine="For Each item As String In items";
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2325;BA.debugLine="SetStateSingle(item, True)";
_setstatesingle(_item,(Object)(__c.True));
 }
};
 //BA.debugLineNum = 2327;BA.debugLine="End Sub";
return "";
}
public String  _showmulti(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
String _item = "";
 //BA.debugLineNum = 1280;BA.debugLine="Sub ShowMulti(lst As List)";
 //BA.debugLineNum = 1281;BA.debugLine="For Each item As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1282;BA.debugLine="ShowItem(item)";
_showitem(_item);
 }
};
 //BA.debugLineNum = 1284;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _showpreloader() throws Exception{
anywheresoftware.b4a.objects.collections.Map _stylem = null;
 //BA.debugLineNum = 931;BA.debugLine="Sub ShowPreloader As BANanoVue";
 //BA.debugLineNum = 932;BA.debugLine="Dim stylem As Map = CreateMap(\"visibility\":\"visib";
_stylem = new anywheresoftware.b4a.objects.collections.Map();
_stylem = __c.createMap(new Object[] {(Object)("visibility"),(Object)("visible")});
 //BA.debugLineNum = 933;BA.debugLine="BANAno.GetElement(\"#preloader\").SetStyle(BANAno.T";
_banano.GetElement("#preloader").SetStyle(BA.ObjectToString(_banano.ToJson((Object)(_stylem.getObject()))));
 //BA.debugLineNum = 934;BA.debugLine="HideBody";
_hidebody();
 //BA.debugLineNum = 935;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 936;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _shufflelist(anywheresoftware.b4a.objects.collections.List _pl) throws Exception{
int _i = 0;
int _j = 0;
Object _k = null;
 //BA.debugLineNum = 3267;BA.debugLine="Sub ShuffleList(pl As List) As List";
 //BA.debugLineNum = 3268;BA.debugLine="For i = pl.Size - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (_pl.getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 3269;BA.debugLine="Dim j As Int";
_j = 0;
 //BA.debugLineNum = 3270;BA.debugLine="Dim k As Object";
_k = new Object();
 //BA.debugLineNum = 3271;BA.debugLine="j = Rnd(0, i + 1)";
_j = __c.Rnd((int) (0),(int) (_i+1));
 //BA.debugLineNum = 3272;BA.debugLine="k = pl.Get(j)";
_k = _pl.Get(_j);
 //BA.debugLineNum = 3273;BA.debugLine="pl.Set(j,pl.Get(i))";
_pl.Set(_j,_pl.Get(_i));
 //BA.debugLineNum = 3274;BA.debugLine="pl.Set(i,k)";
_pl.Set(_i,_k);
 }
};
 //BA.debugLineNum = 3276;BA.debugLine="Return pl";
if (true) return _pl;
 //BA.debugLineNum = 3277;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _sortmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
String _strkey = "";
Object _strvalue = null;
 //BA.debugLineNum = 2254;BA.debugLine="Sub SortMap(m As Map) As Map";
 //BA.debugLineNum = 2255;BA.debugLine="Try";
try { //BA.debugLineNum = 2256;BA.debugLine="Dim nm As Map";
_nm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2257;BA.debugLine="nm.Initialize";
_nm.Initialize();
 //BA.debugLineNum = 2258;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2259;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 2260;BA.debugLine="For Each strkey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _m.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_strkey = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 2261;BA.debugLine="lst.Add(strkey)";
_lst.Add((Object)(_strkey));
 }
};
 //BA.debugLineNum = 2264;BA.debugLine="lst.Sort(True)";
_lst.Sort(__c.True);
 //BA.debugLineNum = 2265;BA.debugLine="For Each strkey As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group10 = _lst;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_strkey = BA.ObjectToString(group10.Get(index10));
 //BA.debugLineNum = 2266;BA.debugLine="Dim strvalue As Object = m.Get(strkey)";
_strvalue = _m.Get((Object)(_strkey));
 //BA.debugLineNum = 2267;BA.debugLine="nm.Put(strkey,strvalue)";
_nm.Put((Object)(_strkey),_strvalue);
 }
};
 //BA.debugLineNum = 2269;BA.debugLine="Return nm";
if (true) return _nm;
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 2271;BA.debugLine="Return m";
if (true) return _m;
 };
 //BA.debugLineNum = 2273;BA.debugLine="End Sub";
return null;
}
public String  _sourcecodebuilder() throws Exception{
 //BA.debugLineNum = 956;BA.debugLine="Sub SourceCodeBuilder";
 //BA.debugLineNum = 957;BA.debugLine="SourceCode.Initialize";
_sourcecode.Initialize();
 //BA.debugLineNum = 958;BA.debugLine="End Sub";
return "";
}
public String  _space(int _hm) throws Exception{
String _rs = "";
 //BA.debugLineNum = 1965;BA.debugLine="Sub Space(HM As Int) As String";
 //BA.debugLineNum = 1966;BA.debugLine="Dim RS As String = \"\"";
_rs = "";
 //BA.debugLineNum = 1967;BA.debugLine="Do While Len(RS) < HM";
while (_len(_rs)<_hm) {
 //BA.debugLineNum = 1968;BA.debugLine="RS = RS & \" \"";
_rs = _rs+" ";
 }
;
 //BA.debugLineNum = 1970;BA.debugLine="Return RS";
if (true) return _rs;
 //BA.debugLineNum = 1971;BA.debugLine="End Sub";
return "";
}
public String  _state2another(String _source,String _target,Object _defaultvalue) throws Exception{
Object _readobj = null;
 //BA.debugLineNum = 1399;BA.debugLine="Sub State2Another(source As String, target As Stri";
 //BA.debugLineNum = 1400;BA.debugLine="Dim readObj As Object = GetState(source, defaultV";
_readobj = _getstate(_source,_defaultvalue);
 //BA.debugLineNum = 1401;BA.debugLine="SetStateSingle(target, readObj)";
_setstatesingle(_target,_readobj);
 //BA.debugLineNum = 1402;BA.debugLine="End Sub";
return "";
}
public int  _statedecrement(String _itemname) throws Exception{
int _intx = 0;
 //BA.debugLineNum = 1257;BA.debugLine="Sub StateDecrement(itemName As String) As Int";
 //BA.debugLineNum = 1258;BA.debugLine="itemName = itemName.tolowercase";
_itemname = _itemname.toLowerCase();
 //BA.debugLineNum = 1259;BA.debugLine="Dim intX As Int = BOVue.GetField(itemName).result";
_intx = (int)(BA.ObjectToNumber(_bovue.GetField(_itemname).Result()));
 //BA.debugLineNum = 1260;BA.debugLine="intX = BANAno.parseint(intX) - 1";
_intx = (int) (_banano.parseInt((Object)(_intx))-1);
 //BA.debugLineNum = 1261;BA.debugLine="BOVue.GetField(itemName)";
_bovue.GetField(_itemname);
 //BA.debugLineNum = 1262;BA.debugLine="BOVue.SetField(itemName, intX)";
_bovue.SetField(_itemname,(Object)(_intx));
 //BA.debugLineNum = 1263;BA.debugLine="Return intX";
if (true) return _intx;
 //BA.debugLineNum = 1264;BA.debugLine="End Sub";
return 0;
}
public boolean  _stateexists(String _statename) throws Exception{
 //BA.debugLineNum = 3281;BA.debugLine="Sub StateExists(stateName As String) As Boolean";
 //BA.debugLineNum = 3282;BA.debugLine="stateName = stateName.tolowercase";
_statename = _statename.toLowerCase();
 //BA.debugLineNum = 3283;BA.debugLine="Return data.ContainsKey(stateName)";
if (true) return _data.ContainsKey((Object)(_statename));
 //BA.debugLineNum = 3284;BA.debugLine="End Sub";
return false;
}
public Object  _stateget(String _key) throws Exception{
Object _rslt = null;
 //BA.debugLineNum = 1252;BA.debugLine="Sub StateGet(key As String) As Object";
 //BA.debugLineNum = 1253;BA.debugLine="Dim rslt As Object = BOVue.RunMethod(\"get\", Array";
_rslt = (Object)(_bovue.RunMethod("get",(Object)(new Object[]{(Object)(_key)})).getObject());
 //BA.debugLineNum = 1254;BA.debugLine="Return rslt";
if (true) return _rslt;
 //BA.debugLineNum = 1255;BA.debugLine="End Sub";
return null;
}
public int  _stateincrement(String _itemname) throws Exception{
int _intx = 0;
 //BA.debugLineNum = 1237;BA.debugLine="Sub StateIncrement(itemName As String) As Int";
 //BA.debugLineNum = 1238;BA.debugLine="itemName = itemName.tolowercase";
_itemname = _itemname.toLowerCase();
 //BA.debugLineNum = 1239;BA.debugLine="Dim intX As Int = BOVue.GetField(itemName).result";
_intx = (int)(BA.ObjectToNumber(_bovue.GetField(_itemname).Result()));
 //BA.debugLineNum = 1240;BA.debugLine="intX = BANAno.parseint(intX) + 1";
_intx = (int) (_banano.parseInt((Object)(_intx))+1);
 //BA.debugLineNum = 1241;BA.debugLine="BOVue.GetField(itemName)";
_bovue.GetField(_itemname);
 //BA.debugLineNum = 1242;BA.debugLine="BOVue.SetField(itemName, intX)";
_bovue.SetField(_itemname,(Object)(_intx));
 //BA.debugLineNum = 1243;BA.debugLine="Return intX";
if (true) return _intx;
 //BA.debugLineNum = 1244;BA.debugLine="End Sub";
return 0;
}
public String  _stateset(String _key,Object _value) throws Exception{
 //BA.debugLineNum = 1247;BA.debugLine="Sub StateSet(key As String, value As Object)";
 //BA.debugLineNum = 1248;BA.debugLine="BOVue.RunMethod(\"set\", Array(key, value))";
_bovue.RunMethod("set",(Object)(new Object[]{(Object)(_key),_value}));
 //BA.debugLineNum = 1249;BA.debugLine="End Sub";
return "";
}
public String  _statusrag(int _dvalue) throws Exception{
 //BA.debugLineNum = 3864;BA.debugLine="Public Sub StatusRAG(dValue As Int) As String";
 //BA.debugLineNum = 3865;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 3867;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
case 1: {
 //BA.debugLineNum = 3869;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
 //BA.debugLineNum = 3871;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
default: {
 //BA.debugLineNum = 3873;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
 //BA.debugLineNum = 3875;BA.debugLine="End Sub";
return "";
}
public String  _statusrg(int _dvalue) throws Exception{
 //BA.debugLineNum = 3930;BA.debugLine="Sub StatusRG(dValue As Int) As String";
 //BA.debugLineNum = 3931;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 3933;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
case 1: {
 //BA.debugLineNum = 3935;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
default: {
 //BA.debugLineNum = 3937;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
}
;
 //BA.debugLineNum = 3939;BA.debugLine="End Sub";
return "";
}
public String  _stringbreakatuppercase(String _st) throws Exception{
int _k = 0;
String _s = "";
String _newst = "";
int _i = 0;
 //BA.debugLineNum = 1046;BA.debugLine="Sub StringBreakAtUpperCase(st As String) As String";
 //BA.debugLineNum = 1047;BA.debugLine="If st.Length = 0 Then Return \"\"";
if (_st.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 1048;BA.debugLine="Dim k As Int";
_k = 0;
 //BA.debugLineNum = 1049;BA.debugLine="Dim s As String";
_s = "";
 //BA.debugLineNum = 1050;BA.debugLine="Dim newst As String = st.CharAt(0)";
_newst = BA.ObjectToString(_st.charAt((int) (0)));
 //BA.debugLineNum = 1051;BA.debugLine="For i = 1 To st.Length - 1";
{
final int step5 = 1;
final int limit5 = (int) (_st.length()-1);
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 1052;BA.debugLine="s = st.CharAt(i)";
_s = BA.ObjectToString(_st.charAt(_i));
 //BA.debugLineNum = 1053;BA.debugLine="k = Asc(s)";
_k = __c.Asc(BA.ObjectToChar(_s));
 //BA.debugLineNum = 1054;BA.debugLine="If (k > 64) And (k < 91) And (st.CharAt(i-1) <>";
if ((_k>64) && (_k<91) && (_st.charAt((int) (_i-1))!=BA.ObjectToChar(" "))) { 
 //BA.debugLineNum = 1055;BA.debugLine="newst = newst & \" \" & s";
_newst = _newst+" "+_s;
 }else {
 //BA.debugLineNum = 1057;BA.debugLine="newst = newst & s";
_newst = _newst+_s;
 };
 }
};
 //BA.debugLineNum = 1060;BA.debugLine="Return newst";
if (true) return _newst;
 //BA.debugLineNum = 1061;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _strparse(String _delim,String _inputstring) throws Exception{
String[] _values = null;
anywheresoftware.b4a.objects.collections.List _nl = null;
 //BA.debugLineNum = 3172;BA.debugLine="Sub StrParse(delim As String, inputString As Strin";
 //BA.debugLineNum = 3173;BA.debugLine="Dim values() As String = BANAno.Split(delim,input";
_values = _banano.Split(_delim,_inputstring);
 //BA.debugLineNum = 3174;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3175;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 3176;BA.debugLine="nl.AddAll(values)";
_nl.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(_values));
 //BA.debugLineNum = 3177;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 3178;BA.debugLine="End Sub";
return null;
}
public double  _sumlistofmapsproperty(anywheresoftware.b4a.objects.collections.List _lst,String _prop) throws Exception{
double _tsum = 0;
anywheresoftware.b4a.objects.collections.Map _rec = null;
String _propv = "";
 //BA.debugLineNum = 1689;BA.debugLine="Sub SumListOfMapsProperty(lst As List, prop As Str";
 //BA.debugLineNum = 1690;BA.debugLine="Dim tsum As Double = 0";
_tsum = 0;
 //BA.debugLineNum = 1691;BA.debugLine="For Each rec As Map In lst";
_rec = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_rec = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group2.Get(index2)));
 //BA.debugLineNum = 1692;BA.debugLine="Dim propv As String = rec.GetDefault(prop,\"0\")";
_propv = BA.ObjectToString(_rec.GetDefault((Object)(_prop),(Object)("0")));
 //BA.debugLineNum = 1693;BA.debugLine="tsum = tsum + BANAno.parseFloat(propv)";
_tsum = _tsum+_banano.parseFloat((Object)(_propv));
 }
};
 //BA.debugLineNum = 1695;BA.debugLine="Return tsum";
if (true) return _tsum;
 //BA.debugLineNum = 1696;BA.debugLine="End Sub";
return 0;
}
public String  _timenow() throws Exception{
long _lnow = 0L;
String _dt = "";
 //BA.debugLineNum = 2708;BA.debugLine="Public Sub TimeNow() As String";
 //BA.debugLineNum = 2709;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
 //BA.debugLineNum = 2710;BA.debugLine="Dim dt As String";
_dt = "";
 //BA.debugLineNum = 2711;BA.debugLine="lNow = DateTime.Now";
_lnow = __c.DateTime.getNow();
 //BA.debugLineNum = 2712;BA.debugLine="DateTime.DateFormat = \"HH:mm\"";
__c.DateTime.setDateFormat("HH:mm");
 //BA.debugLineNum = 2713;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = __c.DateTime.Date(_lnow);
 //BA.debugLineNum = 2714;BA.debugLine="Return dt";
if (true) return _dt;
 //BA.debugLineNum = 2715;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _togglenamedstate(String _statename,String _state1,String _state2) throws Exception{
String _bcurrent = "";
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 3158;BA.debugLine="Sub ToggleNamedState(stateName As String, state1 A";
 //BA.debugLineNum = 3159;BA.debugLine="Dim bcurrent As String = GetState(stateName,\"\")";
_bcurrent = BA.ObjectToString(_getstate(_statename,(Object)("")));
 //BA.debugLineNum = 3160;BA.debugLine="If bcurrent.EqualsIgnoreCase(state1) Then";
if (_bcurrent.equalsIgnoreCase(_state1)) { 
 //BA.debugLineNum = 3161;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 3162;BA.debugLine="opt.Put(stateName, state2)";
_opt.Put((Object)(_statename),(Object)(_state2));
 //BA.debugLineNum = 3163;BA.debugLine="SetState(opt)";
_setstate(_opt);
 }else {
 //BA.debugLineNum = 3165;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 3166;BA.debugLine="opt.Put(stateName, state1)";
_opt.Put((Object)(_statename),(Object)(_state1));
 //BA.debugLineNum = 3167;BA.debugLine="SetState(opt)";
_setstate(_opt);
 };
 //BA.debugLineNum = 3169;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3170;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _togglestate(String _statename) throws Exception{
boolean _bcurrent = false;
 //BA.debugLineNum = 3150;BA.debugLine="Sub ToggleState(stateName As String) As BANanoVue";
 //BA.debugLineNum = 3151;BA.debugLine="Dim bcurrent As Boolean = GetState(stateName,Fals";
_bcurrent = BA.ObjectToBoolean(_getstate(_statename,(Object)(__c.False)));
 //BA.debugLineNum = 3152;BA.debugLine="If bcurrent = Null Then bcurrent = True";
if (_bcurrent==BA.ObjectToBoolean(__c.Null)) { 
_bcurrent = __c.True;};
 //BA.debugLineNum = 3153;BA.debugLine="bcurrent = Not(bcurrent)";
_bcurrent = __c.Not(_bcurrent);
 //BA.debugLineNum = 3154;BA.debugLine="SetStateSingle(stateName, bcurrent)";
_setstatesingle(_statename,(Object)(_bcurrent));
 //BA.debugLineNum = 3155;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 3156;BA.debugLine="End Sub";
return null;
}
public String  _trimstring(String _strvalue) throws Exception{
 //BA.debugLineNum = 2066;BA.debugLine="private Sub TrimString(strValue As String) As Stri";
 //BA.debugLineNum = 2067;BA.debugLine="Return strValue.trim";
if (true) return _strvalue.trim();
 //BA.debugLineNum = 2068;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _unflatten(anywheresoftware.b4a.objects.collections.List _tdata,String _childname) throws Exception{
anywheresoftware.b4a.objects.collections.List _tree = null;
anywheresoftware.b4a.objects.collections.Map _mappedarr = null;
anywheresoftware.b4a.objects.collections.Map _arrelem = null;
String _did = "";
anywheresoftware.b4a.objects.collections.List _cdata = null;
anywheresoftware.b4a.objects.collections.Map _mappedelem = null;
String _parentid = "";
anywheresoftware.b4a.objects.collections.Map _parentelem = null;
anywheresoftware.b4a.objects.collections.List _children = null;
String _mk = "";
anywheresoftware.b4a.objects.collections.Map _mi = null;
anywheresoftware.b4a.objects.collections.List _childs = null;
 //BA.debugLineNum = 4036;BA.debugLine="Sub Unflatten(tdata As List, childname As String)";
 //BA.debugLineNum = 4038;BA.debugLine="Dim tree As List";
_tree = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4039;BA.debugLine="Dim mappedArr As Map";
_mappedarr = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4041;BA.debugLine="tree.Initialize";
_tree.Initialize();
 //BA.debugLineNum = 4042;BA.debugLine="mappedArr.Initialize";
_mappedarr.Initialize();
 //BA.debugLineNum = 4045;BA.debugLine="For Each arrElem As Map In tdata";
_arrelem = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group5 = _tdata;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_arrelem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group5.Get(index5)));
 //BA.debugLineNum = 4046;BA.debugLine="Dim dID As String = arrElem.Get(\"id\")";
_did = BA.ObjectToString(_arrelem.Get((Object)("id")));
 //BA.debugLineNum = 4048;BA.debugLine="Dim cdata As List";
_cdata = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4049;BA.debugLine="cdata.Initialize";
_cdata.Initialize();
 //BA.debugLineNum = 4050;BA.debugLine="arrElem.Put(childname, cdata)";
_arrelem.Put((Object)(_childname),(Object)(_cdata.getObject()));
 //BA.debugLineNum = 4052;BA.debugLine="mappedArr.Put(dID, arrElem)";
_mappedarr.Put((Object)(_did),(Object)(_arrelem.getObject()));
 }
};
 //BA.debugLineNum = 4055;BA.debugLine="For Each dID As String In mappedArr.Keys";
{
final anywheresoftware.b4a.BA.IterableList group12 = _mappedarr.Keys();
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_did = BA.ObjectToString(group12.Get(index12));
 //BA.debugLineNum = 4056;BA.debugLine="Dim mappedElem As Map = mappedArr.Get(dID)";
_mappedelem = new anywheresoftware.b4a.objects.collections.Map();
_mappedelem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mappedarr.Get((Object)(_did))));
 //BA.debugLineNum = 4057;BA.debugLine="Dim parentid As String = mappedElem.Get(\"parenti";
_parentid = BA.ObjectToString(_mappedelem.Get((Object)("parentid")));
 //BA.debugLineNum = 4059;BA.debugLine="If parentid = \"\" Or parentid = \"0\" Then";
if ((_parentid).equals("") || (_parentid).equals("0")) { 
 //BA.debugLineNum = 4060;BA.debugLine="tree.Add(mappedElem)";
_tree.Add((Object)(_mappedelem.getObject()));
 }else {
 //BA.debugLineNum = 4063;BA.debugLine="Dim parentElem As Map = mappedArr.Get(parentid)";
_parentelem = new anywheresoftware.b4a.objects.collections.Map();
_parentelem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mappedarr.Get((Object)(_parentid))));
 //BA.debugLineNum = 4064;BA.debugLine="Dim children As List = parentElem.Get(childname";
_children = new anywheresoftware.b4a.objects.collections.List();
_children = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_parentelem.Get((Object)(_childname))));
 //BA.debugLineNum = 4065;BA.debugLine="children.Add(mappedElem)";
_children.Add((Object)(_mappedelem.getObject()));
 //BA.debugLineNum = 4066;BA.debugLine="parentElem.Put(childname, children)";
_parentelem.Put((Object)(_childname),(Object)(_children.getObject()));
 //BA.debugLineNum = 4067;BA.debugLine="mappedArr.Put(parentid, parentElem)";
_mappedarr.Put((Object)(_parentid),(Object)(_parentelem.getObject()));
 };
 }
};
 //BA.debugLineNum = 4071;BA.debugLine="For Each mk As String In mappedArr.Keys";
{
final anywheresoftware.b4a.BA.IterableList group25 = _mappedarr.Keys();
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_mk = BA.ObjectToString(group25.Get(index25));
 //BA.debugLineNum = 4072;BA.debugLine="Dim mi As Map = mappedArr.Get(mk)";
_mi = new anywheresoftware.b4a.objects.collections.Map();
_mi = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mappedarr.Get((Object)(_mk))));
 //BA.debugLineNum = 4073;BA.debugLine="Dim childs As List = mi.Get(childname)";
_childs = new anywheresoftware.b4a.objects.collections.List();
_childs = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mi.Get((Object)(_childname))));
 //BA.debugLineNum = 4074;BA.debugLine="If childs.Size = 0 Then mi.Remove(childname)";
if (_childs.getSize()==0) { 
_mi.Remove((Object)(_childname));};
 }
};
 //BA.debugLineNum = 4076;BA.debugLine="Return tree";
if (true) return _tree;
 //BA.debugLineNum = 4077;BA.debugLine="End Sub";
return null;
}
public String  _use(com.ab.banano.BANanoObject _bo) throws Exception{
 //BA.debugLineNum = 3323;BA.debugLine="Sub Use(bo As BANanoObject)";
 //BA.debugLineNum = 3324;BA.debugLine="BOVue.RunMethod(\"use\", bo)";
_bovue.RunMethod("use",(Object)(_bo.getObject()));
 //BA.debugLineNum = 3325;BA.debugLine="End Sub";
return "";
}
public String  _use1(com.ab.banano.BANanoObject _bo,anywheresoftware.b4a.objects.collections.Map _opt) throws Exception{
 //BA.debugLineNum = 3328;BA.debugLine="Sub Use1(bo As BANanoObject, opt As Map)";
 //BA.debugLineNum = 3329;BA.debugLine="BOVue.RunMethod(\"use\", Array(bo, opt))";
_bovue.RunMethod("use",(Object)(new Object[]{(Object)(_bo.getObject()),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 3330;BA.debugLine="End Sub";
return "";
}
public String  _ux() throws Exception{
anywheresoftware.b4a.objects.collections.Map _ropt = null;
String _dkey = "";
String _rkey = "";
String _elkey = "";
String _emitkey = "";
String _srouter = "";
 //BA.debugLineNum = 3337;BA.debugLine="Sub UX()";
 //BA.debugLineNum = 3338;BA.debugLine="GetTemplate = Template.tostring";
_gettemplate = _template._tostring /*String*/ ();
 //BA.debugLineNum = 3339;BA.debugLine="If routes.Size > 0 Then";
if (_routes.getSize()>0) { 
 //BA.debugLineNum = 3340;BA.debugLine="Dim ropt As Map = CreateMap()";
_ropt = new anywheresoftware.b4a.objects.collections.Map();
_ropt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 3342;BA.debugLine="ropt.Put(\"routes\", routes)";
_ropt.Put((Object)("routes"),(Object)(_routes.getObject()));
 //BA.debugLineNum = 3343;BA.debugLine="Router.Initialize2(\"VueRouter\", Array(ropt))";
_router.Initialize2("VueRouter",(Object)(new Object[]{(Object)(_ropt.getObject())}));
 //BA.debugLineNum = 3344;BA.debugLine="Options.Put(\"router\", Router)";
_options.Put((Object)("router"),(Object)(_router.getObject()));
 };
 //BA.debugLineNum = 3346;BA.debugLine="Options.Put(\"el\", \"#app\")";
_options.Put((Object)("el"),(Object)("#app"));
 //BA.debugLineNum = 3347;BA.debugLine="If data.Size > 0 Then Options.put(\"data\", data)";
if (_data.getSize()>0) { 
_options.Put((Object)("data"),(Object)(_data.getObject()));};
 //BA.debugLineNum = 3348;BA.debugLine="If methods.Size > 0 Then Options.Put(\"methods\", m";
if (_methods.getSize()>0) { 
_options.Put((Object)("methods"),(Object)(_methods.getObject()));};
 //BA.debugLineNum = 3349;BA.debugLine="If filters.Size > 0 Then Options.Put(\"filters\", f";
if (_filters.getSize()>0) { 
_options.Put((Object)("filters"),(Object)(_filters.getObject()));};
 //BA.debugLineNum = 3350;BA.debugLine="If computed.Size > 0 Then Options.Put(\"computed\",";
if (_computed.getSize()>0) { 
_options.Put((Object)("computed"),(Object)(_computed.getObject()));};
 //BA.debugLineNum = 3351;BA.debugLine="If watches.Size > 0 Then Options.Put(\"watch\", wat";
if (_watches.getSize()>0) { 
_options.Put((Object)("watch"),(Object)(_watches.getObject()));};
 //BA.debugLineNum = 3352;BA.debugLine="If components.Size > 0 Then Options.Put(\"componen";
if (_components.getSize()>0) { 
_options.Put((Object)("components"),(Object)(_components.getObject()));};
 //BA.debugLineNum = 3354;BA.debugLine="store = BOVue.RunMethod(\"observable\", Array(state";
_store = _bovue.RunMethod("observable",(Object)(new Object[]{(Object)(_state.getObject())}));
 //BA.debugLineNum = 3355;BA.debugLine="BOVue.GetField(\"prototype\").SetField(\"$store\", st";
_bovue.GetField("prototype").SetField("$store",(Object)(_store.getObject()));
 //BA.debugLineNum = 3356;BA.debugLine="Options.Put(\"template\", GetTemplate)";
_options.Put((Object)("template"),(Object)(_gettemplate));
 //BA.debugLineNum = 3357;BA.debugLine="BOVue.Initialize2(\"Vue\", Options)";
_bovue.Initialize2("Vue",(Object)(_options.getObject()));
 //BA.debugLineNum = 3359;BA.debugLine="Dim dKey As String = \"$data\"";
_dkey = "$data";
 //BA.debugLineNum = 3360;BA.debugLine="data = BOVue.GetField(dKey).Result";
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_bovue.GetField(_dkey).Result()));
 //BA.debugLineNum = 3362;BA.debugLine="Dim rKey As String = \"$refs\"";
_rkey = "$refs";
 //BA.debugLineNum = 3363;BA.debugLine="refs = BOVue.GetField(rKey)";
_refs = _bovue.GetField(_rkey);
 //BA.debugLineNum = 3364;BA.debugLine="Dim elKey As String = \"$el\"";
_elkey = "$el";
 //BA.debugLineNum = 3365;BA.debugLine="el = BOVue.GetField(elKey)";
_el = _bovue.GetField(_elkey);
 //BA.debugLineNum = 3366;BA.debugLine="Dim emitKey As String = \"$emit\"";
_emitkey = "$emit";
 //BA.debugLineNum = 3367;BA.debugLine="emit = BOVue.GetField(emitKey)";
_emit = _bovue.GetField(_emitkey);
 //BA.debugLineNum = 3368;BA.debugLine="Dim srouter As String = \"$router\"";
_srouter = "$router";
 //BA.debugLineNum = 3369;BA.debugLine="Router = BOVue.GetField(srouter)";
_router = _bovue.GetField(_srouter);
 //BA.debugLineNum = 3370;BA.debugLine="End Sub";
return "";
}
public String  _val(String _value) throws Exception{
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
 //BA.debugLineNum = 1699;BA.debugLine="Public Sub Val(value As String) As String";
 //BA.debugLineNum = 1700;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 1701;BA.debugLine="Try";
try { //BA.debugLineNum = 1702;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 1703;BA.debugLine="If value = \"\" Then value = \"0\"";
if ((_value).equals("")) { 
_value = "0";};
 //BA.debugLineNum = 1704;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
 //BA.debugLineNum = 1705;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
 //BA.debugLineNum = 1706;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
 //BA.debugLineNum = 1707;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 1708;BA.debugLine="For i = 0 To slen - 1";
{
final int step9 = 1;
final int limit9 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 1709;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
 //BA.debugLineNum = 1710;BA.debugLine="If InStr(\"0123456789.-\", mout) <> -1 Then";
if (_instr("0123456789.-",_mout)!=-1) { 
 //BA.debugLineNum = 1711;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
 //BA.debugLineNum = 1714;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 1716;BA.debugLine="Return value";
if (true) return _value;
 };
 //BA.debugLineNum = 1718;BA.debugLine="End Sub";
return "";
}
public boolean  _validate(anywheresoftware.b4a.objects.collections.Map _rec,anywheresoftware.b4a.objects.collections.Map _required) throws Exception{
int _iv = 0;
String _k = "";
String _error = "";
Object _v = null;
String _vv = "";
 //BA.debugLineNum = 2765;BA.debugLine="Sub Validate(rec As Map, required As Map) As Boole";
 //BA.debugLineNum = 2766;BA.debugLine="Errors.Initialize";
_errors.Initialize();
 //BA.debugLineNum = 2767;BA.debugLine="Dim iv As Int = 0";
_iv = (int) (0);
 //BA.debugLineNum = 2768;BA.debugLine="For Each k As String In required.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _required.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 2770;BA.debugLine="Dim error As String = required.GetDefault(k, \"\")";
_error = BA.ObjectToString(_required.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 2771;BA.debugLine="If error = \"\" Then";
if ((_error).equals("")) { 
 //BA.debugLineNum = 2772;BA.debugLine="error = $\"The ${k} should be specified!\"$";
_error = ("The "+__c.SmartStringFormatter("",(Object)(_k))+" should be specified!");
 };
 //BA.debugLineNum = 2775;BA.debugLine="If rec.ContainsKey(k) Then";
if (_rec.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 2776;BA.debugLine="Dim v As Object = rec.Get(k)";
_v = _rec.Get((Object)(_k));
 //BA.debugLineNum = 2777;BA.debugLine="If BANAno.IsNull(v) Then v = \"\"";
if (_banano.IsNull(_v)) { 
_v = (Object)("");};
 //BA.debugLineNum = 2778;BA.debugLine="If BANAno.IsUndefined(v) Then v = \"\"";
if (_banano.IsUndefined(_v)) { 
_v = (Object)("");};
 //BA.debugLineNum = 2780;BA.debugLine="Dim vv As String = CStr(v)";
_vv = _cstr(_v);
 //BA.debugLineNum = 2781;BA.debugLine="vv = vv.trim";
_vv = _vv.trim();
 //BA.debugLineNum = 2782;BA.debugLine="If vv = \"\" Then";
if ((_vv).equals("")) { 
 //BA.debugLineNum = 2783;BA.debugLine="iv = iv + 1";
_iv = (int) (_iv+1);
 //BA.debugLineNum = 2784;BA.debugLine="ShowError(k, error)";
_showerror(_k,_error);
 //BA.debugLineNum = 2785;BA.debugLine="Errors.Put(k, error)";
_errors.Put((Object)(_k),(Object)(_error));
 }else {
 //BA.debugLineNum = 2787;BA.debugLine="HideError(k)";
_hideerror(_k);
 };
 }else {
 //BA.debugLineNum = 2790;BA.debugLine="iv = iv + 1";
_iv = (int) (_iv+1);
 //BA.debugLineNum = 2791;BA.debugLine="Errors.Put(k, error)";
_errors.Put((Object)(_k),(Object)(_error));
 };
 }
};
 //BA.debugLineNum = 2794;BA.debugLine="If iv = 0 Then";
if (_iv==0) { 
 //BA.debugLineNum = 2795;BA.debugLine="Return True";
if (true) return __c.True;
 }else {
 //BA.debugLineNum = 2797;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2799;BA.debugLine="End Sub";
return false;
}
public String  _yearnow() throws Exception{
long _lnow = 0L;
String _dt = "";
 //BA.debugLineNum = 1557;BA.debugLine="Public Sub YearNow() As String";
 //BA.debugLineNum = 1558;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
 //BA.debugLineNum = 1559;BA.debugLine="Dim dt As String";
_dt = "";
 //BA.debugLineNum = 1560;BA.debugLine="lNow = DateTime.Now";
_lnow = __c.DateTime.getNow();
 //BA.debugLineNum = 1561;BA.debugLine="DateTime.DateFormat = \"yyyy\"";
__c.DateTime.setDateFormat("yyyy");
 //BA.debugLineNum = 1562;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = __c.DateTime.Date(_lnow);
 //BA.debugLineNum = 1563;BA.debugLine="Return dt";
if (true) return _dt;
 //BA.debugLineNum = 1564;BA.debugLine="End Sub";
return "";
}
public boolean  _yesnotoboolean(String _xvalue) throws Exception{
 //BA.debugLineNum = 988;BA.debugLine="Sub YesNoToBoolean(xvalue As String) As Boolean";
 //BA.debugLineNum = 989;BA.debugLine="Select Case xvalue";
switch (BA.switchObjectToInt(_xvalue,"Yes","yes")) {
case 0: 
case 1: {
 //BA.debugLineNum = 991;BA.debugLine="Return True";
if (true) return __c.True;
 break; }
default: {
 //BA.debugLineNum = 993;BA.debugLine="Return False";
if (true) return __c.False;
 break; }
}
;
 //BA.debugLineNum = 995;BA.debugLine="End Sub";
return false;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "DOUPLOAD"))
	return _doupload((Object) args[0]);
if (BA.fastSubCompare(sub, "READFILE"))
	return _readfile((Object) args[0], (String) args[1]);
return BA.SubDelegator.SubNotFound;
}
}
