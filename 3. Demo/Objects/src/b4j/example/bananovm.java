package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananovm extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.bananovm", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananovm.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _modules = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.bananovue _vue = null;
public anywheresoftware.b4a.objects.collections.List _pages = null;
public b4j.example.vmelement _vapp = null;
public b4j.example.vmelement _vcontent = null;
public b4j.example.vmelement _routerview = null;
public b4j.example.vmcontainer _container = null;
public com.ab.banano.BANanoObject _bovuetify = null;
public b4j.example.vmtransition _animate = null;
public b4j.example.vmnavigationdrawer _drawer = null;
public b4j.example.vmtoolbar _navbar = null;
public b4j.example.vmfooter _footer = null;
public Object _module = null;
public anywheresoftware.b4a.objects.collections.Map _elevation = null;
public anywheresoftware.b4a.objects.collections.Map _transition = null;
public anywheresoftware.b4a.objects.collections.Map _transitions = null;
public anywheresoftware.b4a.objects.collections.Map _intensityoptions = null;
public anywheresoftware.b4a.objects.collections.Map _coloroptions = null;
public anywheresoftware.b4a.objects.collections.Map _borderoptions = null;
public b4j.example.vmoverlay _overlay = null;
public com.ab.banano.BANanoObject _vuetify = null;
public b4j.example.vmdialog _confirm = null;
public b4j.example.vmdialog _alert = null;
public anywheresoftware.b4a.objects.collections.Map _displayoptions = null;
public anywheresoftware.b4a.objects.collections.Map _textalignmentoptions = null;
public anywheresoftware.b4a.objects.collections.Map _fontweightoptions = null;
public anywheresoftware.b4a.objects.collections.Map _targetoptions = null;
public anywheresoftware.b4a.objects.collections.Map _columntypes = null;
public anywheresoftware.b4a.objects.collections.Map _direction = null;
public anywheresoftware.b4a.objects.collections.Map _columnalign = null;
public anywheresoftware.b4a.objects.collections.Map _datatypes = null;
public anywheresoftware.b4a.objects.collections.Map _controltypes = null;
public b4j.example.vmbottomnavigation _bottomnav = null;
public b4j.example.vmalert _notification = null;
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
public String _color_primary = "";
public String _color_secondary = "";
public String _color_accent = "";
public String _color_error = "";
public String _color_info = "";
public String _color_success = "";
public String _color_warning = "";
public String _color_amber_text = "";
public String _color_black_text = "";
public String _color_blue_text = "";
public String _color_bluegrey_text = "";
public String _color_brown_text = "";
public String _color_cyan_text = "";
public String _color_deeporange_text = "";
public String _color_deeppurple_text = "";
public String _color_green_text = "";
public String _color_grey_text = "";
public String _color_indigo_text = "";
public String _color_lightblue_text = "";
public String _color_lightgreen_text = "";
public String _color_lime_text = "";
public String _color_orange_text = "";
public String _color_pink_text = "";
public String _color_purple_text = "";
public String _color_red_text = "";
public String _color_teal_text = "";
public String _color_transparent_text = "";
public String _color_white_text = "";
public String _color_yellow_text = "";
public String _color_primary_text = "";
public String _color_secondary_text = "";
public String _color_accent_text = "";
public String _color_error_text = "";
public String _color_info_text = "";
public String _color_success_text = "";
public String _color_warning_text = "";
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
public String _icon_small = "";
public String _icon_large = "";
public String _icon_xsmall = "";
public String _icon_xlarge = "";
public String _button_small = "";
public String _button_large = "";
public String _button_xsmall = "";
public String _button_xlarge = "";
public String _transition_slide_x = "";
public String _transition_slide_x_reverse = "";
public String _transition_slide_y = "";
public String _transition_slide_y_reverse = "";
public String _transition_scroll_x = "";
public String _transition_scroll_x_reverse = "";
public String _transition_scroll_y = "";
public String _transition_scroll_y_reverse = "";
public String _transition_scale = "";
public String _transition_fade = "";
public String _transition_fab = "";
public String _justify_center = "";
public String _justify_start = "";
public String _justify_end = "";
public String _align_center = "";
public String _align_start = "";
public String _align_end = "";
public String _align_stretch = "";
public String _flex_grow_0 = "";
public String _flex_grow_1 = "";
public String _flex_shrink_0 = "";
public String _flex_shrink_1 = "";
public String _text_left = "";
public String _text_center = "";
public String _text_right = "";
public String _text_no_wrap = "";
public String _text_truncate = "";
public String _text_lowercase = "";
public String _text_uppercase = "";
public String _text_capitalize = "";
public b4j.example.vmsnackbar _snackbar = null;
public boolean _rtl = false;
public boolean _dark = false;
public anywheresoftware.b4a.objects.collections.Map _options = null;
public String _lang = "";
public anywheresoftware.b4a.objects.collections.List _drawers = null;
public int _placeholder = 0;
public anywheresoftware.b4a.objects.collections.Map _floats = null;
public anywheresoftware.b4a.objects.collections.Map _fontsizes = null;
public boolean _buserouter = false;
public anywheresoftware.b4a.objects.collections.Map _position = null;
public boolean _showwarnings = false;
public int _scrollbarwidth = 0;
public String _breakpoint_xs = "";
public String _breakpoint_sm = "";
public String _breakpoint_md = "";
public String _breakpoint_lg = "";
public String _breakpoint_xl = "";
public String _breakpoint_xsonly = "";
public String _breakpoint_smonly = "";
public String _breakpoint_smanddown = "";
public String _breakpoint_smandup = "";
public String _breakpoint_mdonly = "";
public String _breakpoint_mdanddown = "";
public String _breakpoint_mdandup = "";
public String _breakpoint_lgonly = "";
public String _breakpoint_lganddown = "";
public String _breakpoint_lgandup = "";
public String _breakpoint_xlonly = "";
public Object _breakpoint = null;
public String _breakpointname = "";
public com.ab.banano.BANanoObject _config = null;
public boolean _usesdrawer = false;
public boolean _usesnavbar = false;
public boolean _usesfooter = false;
public boolean _usesbottomnav = false;
public boolean _usesoverlay = false;
public boolean _usesloader = false;
public boolean _usessnackbar = false;
public boolean _usesdialog = false;
public boolean _usesnotification = false;
public String _locale_afrikaans = "";
public String _locale_arabic = "";
public String _locale_catalan = "";
public String _locale_czech = "";
public String _locale_german = "";
public String _locale_greek = "";
public String _locale_english = "";
public String _locale_spanish = "";
public String _locale_estonian = "";
public String _locale_persian = "";
public String _locale_finnish = "";
public String _locale_french = "";
public String _locale_hebrew = "";
public String _locale_croatian = "";
public String _locale_hungarian = "";
public String _locale_indonesian = "";
public String _locale_italian = "";
public String _locale_japanese = "";
public String _locale_korean = "";
public String _locale_lithuanian = "";
public String _locale_latvian = "";
public String _locale_dutch = "";
public String _locale_norwegian = "";
public String _locale_polish = "";
public String _locale_portuguese = "";
public String _locale_romanian = "";
public String _locale_russian = "";
public String _locale_slovak = "";
public String _locale_slovene = "";
public String _locale_serbian = "";
public String _locale_swedish = "";
public String _locale_thai = "";
public String _locale_turkish = "";
public String _locale_ukrainian = "";
public String _locale_chinese = "";
public String _locale_chinese1 = "";
public String _visibility_printonly = "";
public String _visibility_screenonly = "";
public String _visibility_xsonly = "";
public String _visibility_smonly = "";
public String _visibility_smanddown = "";
public String _visibility_smandup = "";
public String _visibility_mdonly = "";
public String _visibility_mdanddown = "";
public String _visibility_mdandup = "";
public String _visibility_lgonly = "";
public String _visibility_lganddown = "";
public String _visibility_lgandup = "";
public String _visibility_xlonly = "";
public String _visibility_all = "";
public String _alert_border_left = "";
public String _alert_border_right = "";
public String _alert_border_bottom = "";
public String _alert_border_top = "";
public String _alert_type_success = "";
public String _alert_type_info = "";
public String _alert_type_warning = "";
public String _alert_type_error = "";
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
public b4j.example.vmelement  _a(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 488;BA.debugLine="Sub A(elID As String) As VMElement";
 //BA.debugLineNum = 489;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 490;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 491;BA.debugLine="elx.SetTag(\"a\")";
_elx._settag /*b4j.example.vmelement*/ ("a");
 //BA.debugLineNum = 492;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 493;BA.debugLine="End Sub";
return null;
}
public String  _addblankoption(anywheresoftware.b4a.objects.collections.List _lst,String _keyfield,String _valuefield) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 3612;BA.debugLine="Sub AddBlankOption(lst As List, keyField As String";
 //BA.debugLineNum = 3613;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 3614;BA.debugLine="opt.Put(keyField, \"\")";
_opt.Put((Object)(_keyfield),(Object)(""));
 //BA.debugLineNum = 3615;BA.debugLine="opt.Put(ValueField, \"--Nothing Selected--\")";
_opt.Put((Object)(_valuefield),(Object)("--Nothing Selected--"));
 //BA.debugLineNum = 3616;BA.debugLine="lst.Add(opt)";
_lst.Add((Object)(_opt.getObject()));
 //BA.debugLineNum = 3617;BA.debugLine="End Sub";
return "";
}
public String  _addbottomsheet(b4j.example.vmbottomsheet _cont) throws Exception{
String _scont = "";
 //BA.debugLineNum = 3187;BA.debugLine="Sub AddBottomSheet(cont As VMBottomSheet)";
 //BA.debugLineNum = 3188;BA.debugLine="Dim scont As String = cont.tostring";
_scont = _cont._tostring /*String*/ ();
 //BA.debugLineNum = 3189;BA.debugLine="Container.SetText(scont)";
_container._settext /*b4j.example.vmcontainer*/ (_scont);
 //BA.debugLineNum = 3190;BA.debugLine="End Sub";
return "";
}
public String  _addcomponent(b4j.example.vmcomponent _comp) throws Exception{
 //BA.debugLineNum = 2091;BA.debugLine="Sub AddComponent(comp As VMComponent)";
 //BA.debugLineNum = 2092;BA.debugLine="vue.AddComponent(comp)";
_vue._addcomponent /*b4j.example.bananovue*/ (_comp);
 //BA.debugLineNum = 2093;BA.debugLine="End Sub";
return "";
}
public String  _addcontainer(b4j.example.vmcontainer _cont) throws Exception{
String _scont = "";
 //BA.debugLineNum = 3180;BA.debugLine="Sub AddContainer(cont As VMContainer)";
 //BA.debugLineNum = 3181;BA.debugLine="Dim scont As String = cont.tostring";
_scont = _cont._tostring /*String*/ ();
 //BA.debugLineNum = 3182;BA.debugLine="Container.SetText(scont)";
_container._settext /*b4j.example.vmcontainer*/ (_scont);
 //BA.debugLineNum = 3183;BA.debugLine="End Sub";
return "";
}
public String  _addcontainerrc(int _row,int _col,b4j.example.vmcontainer _cont) throws Exception{
 //BA.debugLineNum = 3193;BA.debugLine="Sub AddContainerRC(row As Int, col As Int, cont As";
 //BA.debugLineNum = 3194;BA.debugLine="Container.AddComponent(row, col, cont.ToString)";
_container._addcomponent /*String*/ (_row,_col,_cont._tostring /*String*/ ());
 //BA.debugLineNum = 3195;BA.debugLine="End Sub";
return "";
}
public String  _addcontent(String _els) throws Exception{
 //BA.debugLineNum = 2833;BA.debugLine="Sub AddContent(els As String)";
 //BA.debugLineNum = 2834;BA.debugLine="vue.SetTemplate(els)";
_vue._settemplate /*String*/ (_els);
 //BA.debugLineNum = 2835;BA.debugLine="End Sub";
return "";
}
public String  _adddialog(b4j.example.vmdialog _diag) throws Exception{
 //BA.debugLineNum = 1693;BA.debugLine="Sub AddDialog(diag As VMDialog)";
 //BA.debugLineNum = 1694;BA.debugLine="diag.Pop(Container.Container)";
_diag._pop /*String*/ (_container._container /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 1695;BA.debugLine="End Sub";
return "";
}
public String  _adddrawer(b4j.example.vmnavigationdrawer _cont) throws Exception{
String _scont = "";
 //BA.debugLineNum = 3167;BA.debugLine="Sub AddDrawer(cont As VMNavigationDrawer)";
 //BA.debugLineNum = 3168;BA.debugLine="drawers.Add(cont.ID)";
_drawers.Add((Object)(_cont._id /*String*/ ));
 //BA.debugLineNum = 3169;BA.debugLine="Dim scont As String = cont.tostring";
_scont = _cont._tostring /*String*/ ();
 //BA.debugLineNum = 3171;BA.debugLine="VApp.SetText(scont)";
_vapp._settext /*b4j.example.vmelement*/ (_scont);
 //BA.debugLineNum = 3172;BA.debugLine="End Sub";
return "";
}
public String  _addelement(b4j.example.vmelement _elm) throws Exception{
 //BA.debugLineNum = 2096;BA.debugLine="Sub AddElement(elm As VMElement)";
 //BA.debugLineNum = 2097;BA.debugLine="elm.Pop(Container.Container)";
_elm._pop /*String*/ (_container._container /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 2098;BA.debugLine="End Sub";
return "";
}
public String  _addfileselect(Object _eventhandler,String _fid) throws Exception{
b4j.example.vmelement _fu = null;
 //BA.debugLineNum = 1088;BA.debugLine="Sub AddFileSelect(eventHandler As Object, fid As S";
 //BA.debugLineNum = 1089;BA.debugLine="Dim fu As VMElement = CreateInvisibleFileInput(ev";
_fu = _createinvisiblefileinput(_eventhandler,_fid);
 //BA.debugLineNum = 1090;BA.debugLine="Container.SetText(fu.ToString)";
_container._settext /*b4j.example.vmcontainer*/ (_fu._tostring /*String*/ ());
 //BA.debugLineNum = 1091;BA.debugLine="End Sub";
return "";
}
public String  _addhtml(String _htmlcontent) throws Exception{
 //BA.debugLineNum = 2100;BA.debugLine="Sub AddHTML(htmlContent As String)";
 //BA.debugLineNum = 2101;BA.debugLine="Container.SetText(htmlContent)";
_container._settext /*b4j.example.vmcontainer*/ (_htmlcontent);
 //BA.debugLineNum = 2102;BA.debugLine="End Sub";
return "";
}
public String  _addhtmlelement(Object _eventhandler,String _parentid,String _elid,String _tag,anywheresoftware.b4a.objects.collections.Map _props,anywheresoftware.b4a.objects.collections.Map _styleprops,anywheresoftware.b4a.objects.collections.List _classnames,anywheresoftware.b4a.objects.collections.List _loose,String _text) throws Exception{
b4j.example.vmelement _elit = null;
String _k = "";
String _v = "";
String _strclass = "";
String _selement = "";
 //BA.debugLineNum = 1147;BA.debugLine="Sub AddHTMLElement(EventHandler As Object, parentI";
 //BA.debugLineNum = 1148;BA.debugLine="parentID = parentID.ToLowerCase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 1149;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 1150;BA.debugLine="parentID = parentID.Replace(\"#\",\"\")";
_parentid = _parentid.replace("#","");
 //BA.debugLineNum = 1151;BA.debugLine="elID = elID.Replace(\"#\",\"\")";
_elid = _elid.replace("#","");
 //BA.debugLineNum = 1153;BA.debugLine="Dim elIT As VMElement";
_elit = new b4j.example.vmelement();
 //BA.debugLineNum = 1154;BA.debugLine="elIT.Initialize(EventHandler, elID)";
_elit._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(_eventhandler),_elid);
 //BA.debugLineNum = 1155;BA.debugLine="elIT.SetText(Text)";
_elit._settext /*b4j.example.vmelement*/ (_text);
 //BA.debugLineNum = 1156;BA.debugLine="If loose <> Null Then";
if (_loose!= null) { 
 //BA.debugLineNum = 1157;BA.debugLine="For Each k As String In loose";
{
final anywheresoftware.b4a.BA.IterableList group9 = _loose;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_k = BA.ObjectToString(group9.Get(index9));
 //BA.debugLineNum = 1158;BA.debugLine="elIT.SetAttrSingle(k, True)";
_elit._setattrsingle /*b4j.example.vmelement*/ (_k,BA.ObjectToString(__c.True));
 }
};
 };
 //BA.debugLineNum = 1161;BA.debugLine="If props <> Null Then";
if (_props!= null) { 
 //BA.debugLineNum = 1162;BA.debugLine="For Each k As String In props.Keys";
{
final anywheresoftware.b4a.BA.IterableList group14 = _props.Keys();
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_k = BA.ObjectToString(group14.Get(index14));
 //BA.debugLineNum = 1163;BA.debugLine="Dim v As String = props.Get(k)";
_v = BA.ObjectToString(_props.Get((Object)(_k)));
 //BA.debugLineNum = 1164;BA.debugLine="elIT.SetAttrSingle(k, v)";
_elit._setattrsingle /*b4j.example.vmelement*/ (_k,_v);
 }
};
 };
 //BA.debugLineNum = 1167;BA.debugLine="If styleProps <> Null Then";
if (_styleprops!= null) { 
 //BA.debugLineNum = 1168;BA.debugLine="For Each k As String In styleProps.Keys";
{
final anywheresoftware.b4a.BA.IterableList group20 = _styleprops.Keys();
final int groupLen20 = group20.getSize()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_k = BA.ObjectToString(group20.Get(index20));
 //BA.debugLineNum = 1169;BA.debugLine="Dim v As String = styleProps.get(k)";
_v = BA.ObjectToString(_styleprops.Get((Object)(_k)));
 //BA.debugLineNum = 1170;BA.debugLine="elIT.SetStyleSingle(k, v)";
_elit._setstylesingle /*b4j.example.vmelement*/ (_k,(Object)(_v));
 }
};
 };
 //BA.debugLineNum = 1173;BA.debugLine="If classNames <> Null Then";
if (_classnames!= null) { 
 //BA.debugLineNum = 1174;BA.debugLine="For Each strClass As String In classNames";
{
final anywheresoftware.b4a.BA.IterableList group26 = _classnames;
final int groupLen26 = group26.getSize()
;int index26 = 0;
;
for (; index26 < groupLen26;index26++){
_strclass = BA.ObjectToString(group26.Get(index26));
 //BA.debugLineNum = 1175;BA.debugLine="elIT.AddClass(strClass)";
_elit._addclass /*b4j.example.vmelement*/ (_strclass);
 }
};
 };
 //BA.debugLineNum = 1179;BA.debugLine="Dim sElement As String = elIT.tostring";
_selement = _elit._tostring /*String*/ ();
 //BA.debugLineNum = 1180;BA.debugLine="BANano.GetElement($\"#${parentID}\"$).Append(sEleme";
_banano.GetElement(("#"+__c.SmartStringFormatter("",(Object)(_parentid))+"")).Append(_selement);
 //BA.debugLineNum = 1181;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _addmodule(String _tagname) throws Exception{
 //BA.debugLineNum = 954;BA.debugLine="Sub AddModule(tagName As String) As BANanoVM";
 //BA.debugLineNum = 955;BA.debugLine="tagName = tagName.tolowercase";
_tagname = _tagname.toLowerCase();
 //BA.debugLineNum = 956;BA.debugLine="Modules.Put(tagName, tagName)";
_modules.Put((Object)(_tagname),(Object)(_tagname));
 //BA.debugLineNum = 957;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 958;BA.debugLine="End Sub";
return null;
}
public String  _addpage(String _name,Object _moduleobj) throws Exception{
 //BA.debugLineNum = 2694;BA.debugLine="Sub AddPage(name As String, moduleObj As Object)";
 //BA.debugLineNum = 2695;BA.debugLine="name = name.tolowercase";
_name = _name.toLowerCase();
 //BA.debugLineNum = 2696;BA.debugLine="Pages.add(name)";
_pages.Add((Object)(_name));
 //BA.debugLineNum = 2697;BA.debugLine="BANano.CallSub(moduleObj, \"Code\", Array(Me))   'i";
_banano.CallSub(_moduleobj,"Code",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{this}));
 //BA.debugLineNum = 2698;BA.debugLine="Hide(name)";
_hide(_name);
 //BA.debugLineNum = 2699;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _addroute(b4j.example.vmcomponent _comp) throws Exception{
 //BA.debugLineNum = 2125;BA.debugLine="Sub AddRoute(comp As VMComponent) As BANanoVM";
 //BA.debugLineNum = 2126;BA.debugLine="vue.AddRoute(comp)";
_vue._addroute /*String*/ (_comp);
 //BA.debugLineNum = 2127;BA.debugLine="SetUseRouter(True)";
_setuserouter(__c.True);
 //BA.debugLineNum = 2128;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2129;BA.debugLine="End Sub";
return null;
}
public String  _addsnackbar(b4j.example.vmsnackbar _csnackbar) throws Exception{
 //BA.debugLineNum = 1702;BA.debugLine="Sub AddSnackBar(cSnackBar As VMSnackBar)";
 //BA.debugLineNum = 1703;BA.debugLine="cSnackBar.Pop(Container.Container)";
_csnackbar._pop /*String*/ (_container._container /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 1704;BA.debugLine="End Sub";
return "";
}
public String  _addspeeddial(b4j.example.vmspeeddial _sd) throws Exception{
 //BA.debugLineNum = 1697;BA.debugLine="Sub AddSpeedDial(sd As VMSpeedDial)";
 //BA.debugLineNum = 1698;BA.debugLine="sd.Pop(Container.Container)";
_sd._pop /*String*/ (_container._container /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 1699;BA.debugLine="End Sub";
return "";
}
public String  _addtheme(String _themename,String _forecolor,String _forecolorintensity,String _backcolor,String _backcolorintensity) throws Exception{
 //BA.debugLineNum = 1596;BA.debugLine="Sub AddTheme(themeName As String, ForeColor As Str";
 //BA.debugLineNum = 1597;BA.debugLine="vue.AddTheme(themeName, ForeColor, ForeColorInten";
_vue._addtheme /*String*/ (_themename,_forecolor,_forecolorintensity,_backcolor,_backcolorintensity);
 //BA.debugLineNum = 1598;BA.debugLine="End Sub";
return "";
}
public String  _addtoapp(String _content) throws Exception{
 //BA.debugLineNum = 3175;BA.debugLine="Sub AddToApp(content As String)";
 //BA.debugLineNum = 3176;BA.debugLine="VApp.SetText(content)";
_vapp._settext /*b4j.example.vmelement*/ (_content);
 //BA.debugLineNum = 3177;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _audittrail(anywheresoftware.b4a.objects.collections.Map _oldm,anywheresoftware.b4a.objects.collections.Map _newm) throws Exception{
 //BA.debugLineNum = 2454;BA.debugLine="Sub AuditTrail(oldM As Map, newM As Map) As Map";
 //BA.debugLineNum = 2455;BA.debugLine="Return vue.AuditTrail(oldM, newM)";
if (true) return _vue._audittrail /*anywheresoftware.b4a.objects.collections.Map*/ (_oldm,_newm);
 //BA.debugLineNum = 2456;BA.debugLine="End Sub";
return null;
}
public String  _beautifyname(String _namx) throws Exception{
 //BA.debugLineNum = 1612;BA.debugLine="Sub BeautifyName(namx As String) As String";
 //BA.debugLineNum = 1613;BA.debugLine="Return vue.BeautifyName(namx)";
if (true) return _vue._beautifyname /*String*/ (_namx);
 //BA.debugLineNum = 1614;BA.debugLine="End Sub";
return "";
}
public String  _beautifyrest(String _idname) throws Exception{
 //BA.debugLineNum = 1626;BA.debugLine="Sub BeautifyRest(idName As String) As String";
 //BA.debugLineNum = 1627;BA.debugLine="Return vue.BeautifyRest(idName)";
if (true) return _vue._beautifyrest /*String*/ (_idname);
 //BA.debugLineNum = 1628;BA.debugLine="End Sub";
return "";
}
public String  _beautifysourcecode(String _slang,String _sourcecode) throws Exception{
 //BA.debugLineNum = 1199;BA.debugLine="Sub BeautifySourceCode(slang As String, sourceCode";
 //BA.debugLineNum = 1200;BA.debugLine="Return vue.BeautifySourceCode(slang, sourceCode)";
if (true) return _vue._beautifysourcecode /*String*/ (_slang,_sourcecode);
 //BA.debugLineNum = 1201;BA.debugLine="End Sub";
return "";
}
public String  _br() throws Exception{
 //BA.debugLineNum = 2258;BA.debugLine="Sub BR As String";
 //BA.debugLineNum = 2259;BA.debugLine="Return \"<br>\"";
if (true) return "<br>";
 //BA.debugLineNum = 2260;BA.debugLine="End Sub";
return "";
}
public String  _btnalertok_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 1270;BA.debugLine="Sub btnalertOk_click(e As BANanoEvent)";
 //BA.debugLineNum = 1271;BA.debugLine="Alert.hide";
_alert._hide /*b4j.example.vmdialog*/ ();
 //BA.debugLineNum = 1272;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1273;BA.debugLine="BANano.CallSub(Module, \"alert_ok\", Array(e))   'i";
_banano.CallSub(_module,"alert_ok",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}));
 //BA.debugLineNum = 1274;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmcancel_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 1276;BA.debugLine="Sub btnConfirmCancel_click(e As BANanoEvent)";
 //BA.debugLineNum = 1277;BA.debugLine="Confirm.hide";
_confirm._hide /*b4j.example.vmdialog*/ ();
 //BA.debugLineNum = 1278;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1279;BA.debugLine="BANano.CallSub(Module, \"confirm_cancel\", Array(e)";
_banano.CallSub(_module,"confirm_cancel",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}));
 //BA.debugLineNum = 1280;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmok_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 1282;BA.debugLine="Sub btnConfirmOk_click(e As BANanoEvent)";
 //BA.debugLineNum = 1283;BA.debugLine="Confirm.hide";
_confirm._hide /*b4j.example.vmdialog*/ ();
 //BA.debugLineNum = 1284;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1285;BA.debugLine="BANano.CallSub(Module, \"confirm_ok\", Array(e))  '";
_banano.CallSub(_module,"confirm_ok",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}));
 //BA.debugLineNum = 1286;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _buildphpemail(String _sfrom,String _sto,String _scc,String _ssubject,String _smsg) throws Exception{
anywheresoftware.b4a.objects.collections.Map _se = null;
 //BA.debugLineNum = 1184;BA.debugLine="Sub BuildPHPEmail(sfrom As String, sto As String,";
 //BA.debugLineNum = 1185;BA.debugLine="Dim se As Map = CreateMap(\"from\":sfrom, \"to\":sto,";
_se = new anywheresoftware.b4a.objects.collections.Map();
_se = __c.createMap(new Object[] {(Object)("from"),(Object)(_sfrom),(Object)("to"),(Object)(_sto),(Object)("cc"),(Object)(_scc),(Object)("subject"),(Object)(_ssubject),(Object)("msg"),(Object)(_smsg)});
 //BA.debugLineNum = 1186;BA.debugLine="Return se";
if (true) return _se;
 //BA.debugLineNum = 1187;BA.debugLine="End Sub";
return null;
}
public Object  _callcomputed(String _methodname) throws Exception{
 //BA.debugLineNum = 2419;BA.debugLine="Sub CallComputed(methodName As String) As Object";
 //BA.debugLineNum = 2420;BA.debugLine="Return vue.CallComputed(methodName)";
if (true) return _vue._callcomputed /*Object*/ (_methodname);
 //BA.debugLineNum = 2421;BA.debugLine="End Sub";
return null;
}
public String  _callmethod(String _methodname) throws Exception{
 //BA.debugLineNum = 2415;BA.debugLine="Sub CallMethod(methodName As String)";
 //BA.debugLineNum = 2416;BA.debugLine="vue.CallMethod(methodName)";
_vue._callmethod /*String*/ (_methodname);
 //BA.debugLineNum = 2417;BA.debugLine="End Sub";
return "";
}
public String  _capitalize(String _t) throws Exception{
 //BA.debugLineNum = 1616;BA.debugLine="Sub Capitalize(t As String) As String";
 //BA.debugLineNum = 1617;BA.debugLine="Return vue.propercase(t)";
if (true) return _vue._propercase /*String*/ (_t);
 //BA.debugLineNum = 1618;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Modules As Map";
_modules = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 5;BA.debugLine="Public vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private Pages As List";
_pages = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Public VApp As VMElement";
_vapp = new b4j.example.vmelement();
 //BA.debugLineNum = 8;BA.debugLine="Public VContent As VMElement";
_vcontent = new b4j.example.vmelement();
 //BA.debugLineNum = 9;BA.debugLine="Public RouterView As VMElement";
_routerview = new b4j.example.vmelement();
 //BA.debugLineNum = 10;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
 //BA.debugLineNum = 11;BA.debugLine="Public BOVuetify As BANanoObject";
_bovuetify = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 12;BA.debugLine="Public Animate As VMTransition";
_animate = new b4j.example.vmtransition();
 //BA.debugLineNum = 13;BA.debugLine="Public Drawer As VMNavigationDrawer";
_drawer = new b4j.example.vmnavigationdrawer();
 //BA.debugLineNum = 14;BA.debugLine="Public NavBar As VMToolBar";
_navbar = new b4j.example.vmtoolbar();
 //BA.debugLineNum = 15;BA.debugLine="Public Footer As VMFooter";
_footer = new b4j.example.vmfooter();
 //BA.debugLineNum = 16;BA.debugLine="Private Module As Object";
_module = new Object();
 //BA.debugLineNum = 17;BA.debugLine="Public Elevation As Map";
_elevation = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 18;BA.debugLine="Public Transition As Map";
_transition = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 19;BA.debugLine="Public Transitions As Map";
_transitions = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 20;BA.debugLine="Public IntensityOptions As Map";
_intensityoptions = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 21;BA.debugLine="Public ColorOptions As Map";
_coloroptions = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 22;BA.debugLine="Public BorderOptions As Map";
_borderoptions = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 23;BA.debugLine="Public Overlay As VMOverlay";
_overlay = new b4j.example.vmoverlay();
 //BA.debugLineNum = 24;BA.debugLine="Public vuetify As BANanoObject";
_vuetify = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 25;BA.debugLine="Public Confirm As VMDialog";
_confirm = new b4j.example.vmdialog();
 //BA.debugLineNum = 26;BA.debugLine="Public Alert As VMDialog";
_alert = new b4j.example.vmdialog();
 //BA.debugLineNum = 27;BA.debugLine="Public DisplayOptions As Map";
_displayoptions = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 28;BA.debugLine="Public TextAlignmentOptions As Map";
_textalignmentoptions = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 29;BA.debugLine="Public FontWeightOptions As Map";
_fontweightoptions = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 30;BA.debugLine="Public TargetOptions As Map";
_targetoptions = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 31;BA.debugLine="Public ColumnTypes As Map";
_columntypes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 32;BA.debugLine="Public Direction As Map";
_direction = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 33;BA.debugLine="Public ColumnAlign As Map";
_columnalign = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 34;BA.debugLine="Public DataTypes As Map";
_datatypes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 35;BA.debugLine="Public ControlTypes As Map";
_controltypes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 36;BA.debugLine="Public BottomNav As VMBottomNavigation";
_bottomnav = new b4j.example.vmbottomnavigation();
 //BA.debugLineNum = 37;BA.debugLine="Public Notification As VMAlert";
_notification = new b4j.example.vmalert();
 //BA.debugLineNum = 39;BA.debugLine="Public const COLOR_AMBER As String = \"amber\"";
_color_amber = "amber";
 //BA.debugLineNum = 40;BA.debugLine="Public const COLOR_BLACK As String = \"black\"";
_color_black = "black";
 //BA.debugLineNum = 41;BA.debugLine="Public const COLOR_BLUE As String = \"blue\"";
_color_blue = "blue";
 //BA.debugLineNum = 42;BA.debugLine="Public const COLOR_BLUEGREY As String = \"blue-gre";
_color_bluegrey = "blue-grey";
 //BA.debugLineNum = 43;BA.debugLine="Public const COLOR_BROWN As String = \"brown\"";
_color_brown = "brown";
 //BA.debugLineNum = 44;BA.debugLine="Public const COLOR_CYAN As String = \"cyan\"";
_color_cyan = "cyan";
 //BA.debugLineNum = 45;BA.debugLine="Public const COLOR_DEEPORANGE As String = \"deep-o";
_color_deeporange = "deep-orange";
 //BA.debugLineNum = 46;BA.debugLine="Public const COLOR_DEEPPURPLE As String = \"deep-p";
_color_deeppurple = "deep-purple";
 //BA.debugLineNum = 47;BA.debugLine="Public const COLOR_GREEN As String = \"green\"";
_color_green = "green";
 //BA.debugLineNum = 48;BA.debugLine="Public const COLOR_GREY As String = \"grey\"";
_color_grey = "grey";
 //BA.debugLineNum = 49;BA.debugLine="Public const COLOR_INDIGO As String = \"indigo\"";
_color_indigo = "indigo";
 //BA.debugLineNum = 50;BA.debugLine="Public const COLOR_LIGHTBLUE As String = \"light-b";
_color_lightblue = "light-blue";
 //BA.debugLineNum = 51;BA.debugLine="Public const COLOR_LIGHTGREEN As String = \"light-";
_color_lightgreen = "light-green";
 //BA.debugLineNum = 52;BA.debugLine="Public const COLOR_LIME As String = \"lime\"";
_color_lime = "lime";
 //BA.debugLineNum = 53;BA.debugLine="Public const COLOR_ORANGE As String = \"orange\"";
_color_orange = "orange";
 //BA.debugLineNum = 54;BA.debugLine="Public const COLOR_PINK As String = \"pink\"";
_color_pink = "pink";
 //BA.debugLineNum = 55;BA.debugLine="Public const COLOR_PURPLE As String = \"purple\"";
_color_purple = "purple";
 //BA.debugLineNum = 56;BA.debugLine="Public const COLOR_RED As String = \"red\"";
_color_red = "red";
 //BA.debugLineNum = 57;BA.debugLine="Public const COLOR_TEAL As String = \"teal\"";
_color_teal = "teal";
 //BA.debugLineNum = 58;BA.debugLine="Public const COLOR_TRANSPARENT As String = \"trans";
_color_transparent = "transparent";
 //BA.debugLineNum = 59;BA.debugLine="Public const COLOR_WHITE As String = \"white\"";
_color_white = "white";
 //BA.debugLineNum = 60;BA.debugLine="Public const COLOR_YELLOW As String = \"yellow\"";
_color_yellow = "yellow";
 //BA.debugLineNum = 61;BA.debugLine="Public const COLOR_NONE As String = \"\"";
_color_none = "";
 //BA.debugLineNum = 62;BA.debugLine="Public const COLOR_PRIMARY As String = \"primary\"";
_color_primary = "primary";
 //BA.debugLineNum = 63;BA.debugLine="Public const COLOR_SECONDARY As String = \"seconda";
_color_secondary = "secondary";
 //BA.debugLineNum = 64;BA.debugLine="Public const COLOR_ACCENT As String = \"accent\"";
_color_accent = "accent";
 //BA.debugLineNum = 65;BA.debugLine="Public const COLOR_ERROR As String = \"error\"";
_color_error = "error";
 //BA.debugLineNum = 66;BA.debugLine="Public const COLOR_INFO As String = \"info\"";
_color_info = "info";
 //BA.debugLineNum = 67;BA.debugLine="Public const COLOR_SUCCESS As String = \"success\"";
_color_success = "success";
 //BA.debugLineNum = 68;BA.debugLine="Public const COLOR_WARNING As String = \"warning\"";
_color_warning = "warning";
 //BA.debugLineNum = 69;BA.debugLine="Public const COLOR_NONE As String = \"\"";
_color_none = "";
 //BA.debugLineNum = 72;BA.debugLine="Public const COLOR_AMBER_TEXT As String = \"amber-";
_color_amber_text = "amber--text";
 //BA.debugLineNum = 73;BA.debugLine="Public const COLOR_BLACK_TEXT As String = \"black-";
_color_black_text = "black--text";
 //BA.debugLineNum = 74;BA.debugLine="Public const COLOR_BLUE_TEXT As String = \"blue--t";
_color_blue_text = "blue--text";
 //BA.debugLineNum = 75;BA.debugLine="Public const COLOR_BLUEGREY_TEXT As String = \"blu";
_color_bluegrey_text = "blue-grey--text";
 //BA.debugLineNum = 76;BA.debugLine="Public const COLOR_BROWN_TEXT As String = \"brown-";
_color_brown_text = "brown--text";
 //BA.debugLineNum = 77;BA.debugLine="Public const COLOR_CYAN_TEXT As String = \"cyan--t";
_color_cyan_text = "cyan--text";
 //BA.debugLineNum = 78;BA.debugLine="Public const COLOR_DEEPORANGE_TEXT As String = \"d";
_color_deeporange_text = "deep-orange--text";
 //BA.debugLineNum = 79;BA.debugLine="Public const COLOR_DEEPPURPLE_TEXT As String = \"d";
_color_deeppurple_text = "deep-purple--text";
 //BA.debugLineNum = 80;BA.debugLine="Public const COLOR_GREEN_TEXT As String = \"green-";
_color_green_text = "green--text";
 //BA.debugLineNum = 81;BA.debugLine="Public const COLOR_GREY_TEXT As String = \"grey--t";
_color_grey_text = "grey--text";
 //BA.debugLineNum = 82;BA.debugLine="Public const COLOR_INDIGO_TEXT As String = \"indig";
_color_indigo_text = "indigo--text";
 //BA.debugLineNum = 83;BA.debugLine="Public const COLOR_LIGHTBLUE_TEXT As String = \"li";
_color_lightblue_text = "light-blue--text";
 //BA.debugLineNum = 84;BA.debugLine="Public const COLOR_LIGHTGREEN_TEXT As String = \"l";
_color_lightgreen_text = "light-green--text";
 //BA.debugLineNum = 85;BA.debugLine="Public const COLOR_LIME_TEXT As String = \"lime--t";
_color_lime_text = "lime--text";
 //BA.debugLineNum = 86;BA.debugLine="Public const COLOR_ORANGE_TEXT As String = \"orang";
_color_orange_text = "orange--text";
 //BA.debugLineNum = 87;BA.debugLine="Public const COLOR_PINK_TEXT As String = \"pink--t";
_color_pink_text = "pink--text";
 //BA.debugLineNum = 88;BA.debugLine="Public const COLOR_PURPLE_TEXT As String = \"purpl";
_color_purple_text = "purple--text";
 //BA.debugLineNum = 89;BA.debugLine="Public const COLOR_RED_TEXT As String = \"red--tex";
_color_red_text = "red--text";
 //BA.debugLineNum = 90;BA.debugLine="Public const COLOR_TEAL_TEXT As String = \"teal--t";
_color_teal_text = "teal--text";
 //BA.debugLineNum = 91;BA.debugLine="Public const COLOR_TRANSPARENT_TEXT As String = \"";
_color_transparent_text = "transparent--text";
 //BA.debugLineNum = 92;BA.debugLine="Public const COLOR_WHITE_TEXT As String = \"white-";
_color_white_text = "white--text";
 //BA.debugLineNum = 93;BA.debugLine="Public const COLOR_YELLOW_TEXT As String = \"yello";
_color_yellow_text = "yellow--text";
 //BA.debugLineNum = 94;BA.debugLine="Public const COLOR_PRIMARY_TEXT As String = \"prim";
_color_primary_text = "primary--text";
 //BA.debugLineNum = 95;BA.debugLine="Public const COLOR_SECONDARY_TEXT As String = \"se";
_color_secondary_text = "secondary--text";
 //BA.debugLineNum = 96;BA.debugLine="Public const COLOR_ACCENT_TEXT As String = \"accen";
_color_accent_text = "accent--text";
 //BA.debugLineNum = 97;BA.debugLine="Public const COLOR_ERROR_TEXT As String = \"error-";
_color_error_text = "error--text";
 //BA.debugLineNum = 98;BA.debugLine="Public const COLOR_INFO_TEXT As String = \"info--t";
_color_info_text = "info--text";
 //BA.debugLineNum = 99;BA.debugLine="Public const COLOR_SUCCESS_TEXT As String = \"succ";
_color_success_text = "success--text";
 //BA.debugLineNum = 100;BA.debugLine="Public const COLOR_WARNING_TEXT As String = \"warn";
_color_warning_text = "warning--text";
 //BA.debugLineNum = 102;BA.debugLine="Public const INTENSITY_NORMAL As String = \"\"";
_intensity_normal = "";
 //BA.debugLineNum = 103;BA.debugLine="Public const INTENSITY_LIGHTEN5 As String = \"ligh";
_intensity_lighten5 = "lighten-5";
 //BA.debugLineNum = 104;BA.debugLine="Public const INTENSITY_LIGHTEN4 As String = \"ligh";
_intensity_lighten4 = "lighten-4";
 //BA.debugLineNum = 105;BA.debugLine="Public const INTENSITY_LIGHTEN3 As String = \"ligh";
_intensity_lighten3 = "lighten-3";
 //BA.debugLineNum = 106;BA.debugLine="Public const INTENSITY_LIGHTEN2 As String = \"ligh";
_intensity_lighten2 = "lighten-2";
 //BA.debugLineNum = 107;BA.debugLine="Public const INTENSITY_LIGHTEN1 As String = \"ligh";
_intensity_lighten1 = "lighten-1";
 //BA.debugLineNum = 108;BA.debugLine="Public const INTENSITY_DARKEN1 As String = \"darke";
_intensity_darken1 = "darken-1";
 //BA.debugLineNum = 109;BA.debugLine="Public const INTENSITY_DARKEN2 As String = \"darke";
_intensity_darken2 = "darken-2";
 //BA.debugLineNum = 110;BA.debugLine="Public const INTENSITY_DARKEN3 As String = \"darke";
_intensity_darken3 = "darken-3";
 //BA.debugLineNum = 111;BA.debugLine="Public const INTENSITY_DARKEN4 As String = \"darke";
_intensity_darken4 = "darken-4";
 //BA.debugLineNum = 112;BA.debugLine="Public const INTENSITY_ACCENT1 As String = \"accen";
_intensity_accent1 = "accent-1";
 //BA.debugLineNum = 113;BA.debugLine="Public const INTENSITY_ACCENT2 As String = \"accen";
_intensity_accent2 = "accent-2";
 //BA.debugLineNum = 114;BA.debugLine="Public const INTENSITY_ACCENT3 As String = \"accen";
_intensity_accent3 = "accent-3";
 //BA.debugLineNum = 115;BA.debugLine="Public const INTENSITY_ACCENT4 As String = \"accen";
_intensity_accent4 = "accent-4";
 //BA.debugLineNum = 117;BA.debugLine="Public const BORDER_DEFAULT As String = \"\"";
_border_default = "";
 //BA.debugLineNum = 118;BA.debugLine="Public const BORDER_DASHED As String = \"dashed\"";
_border_dashed = "dashed";
 //BA.debugLineNum = 119;BA.debugLine="Public const BORDER_DOTTED As String = \"dotted\"";
_border_dotted = "dotted";
 //BA.debugLineNum = 120;BA.debugLine="Public const BORDER_DOUBLE As String = \"double\"";
_border_double = "double";
 //BA.debugLineNum = 121;BA.debugLine="Public const BORDER_GROOVE As String = \"groove\"";
_border_groove = "groove";
 //BA.debugLineNum = 122;BA.debugLine="Public const BORDER_HIDDEN As String = \"hidden\"";
_border_hidden = "hidden";
 //BA.debugLineNum = 123;BA.debugLine="Public const BORDER_INSET As String = \"inset\"";
_border_inset = "inset";
 //BA.debugLineNum = 124;BA.debugLine="Public const BORDER_NONE As String = \"none\"";
_border_none = "none";
 //BA.debugLineNum = 125;BA.debugLine="Public const BORDER_OUTSET As String = \"outset\"";
_border_outset = "outset";
 //BA.debugLineNum = 126;BA.debugLine="Public const BORDER_RIDGE As String = \"ridge\"";
_border_ridge = "ridge";
 //BA.debugLineNum = 127;BA.debugLine="Public const BORDER_SOLID As String = \"solid\"";
_border_solid = "solid";
 //BA.debugLineNum = 129;BA.debugLine="Public const SIZE_H1 As String = \"h1\"";
_size_h1 = "h1";
 //BA.debugLineNum = 130;BA.debugLine="Public const SIZE_H2 As String = \"h2\"";
_size_h2 = "h2";
 //BA.debugLineNum = 131;BA.debugLine="Public const SIZE_H3 As String = \"h3\"";
_size_h3 = "h3";
 //BA.debugLineNum = 132;BA.debugLine="Public const SIZE_H4 As String = \"h4\"";
_size_h4 = "h4";
 //BA.debugLineNum = 133;BA.debugLine="Public const SIZE_H5 As String = \"h5\"";
_size_h5 = "h5";
 //BA.debugLineNum = 134;BA.debugLine="Public const SIZE_H6 As String = \"h6\"";
_size_h6 = "h6";
 //BA.debugLineNum = 135;BA.debugLine="Public const SIZE_P As String = \"p\"";
_size_p = "p";
 //BA.debugLineNum = 136;BA.debugLine="Public const SIZE_SPAN As String = \"span\"";
_size_span = "span";
 //BA.debugLineNum = 137;BA.debugLine="Public const SIZE_BLOCKQUOTE As String = \"blockqu";
_size_blockquote = "blockquote";
 //BA.debugLineNum = 138;BA.debugLine="Public const SIZE_DIV As String = \"div\"";
_size_div = "div";
 //BA.debugLineNum = 140;BA.debugLine="Public const ICON_SMALL As String = \"small\"";
_icon_small = "small";
 //BA.debugLineNum = 141;BA.debugLine="Public const ICON_LARGE As String = \"large\"";
_icon_large = "large";
 //BA.debugLineNum = 142;BA.debugLine="Public const ICON_XSMALL As String = \"x-small\"";
_icon_xsmall = "x-small";
 //BA.debugLineNum = 143;BA.debugLine="Public const ICON_XLARGE As String = \"x-large\"";
_icon_xlarge = "x-large";
 //BA.debugLineNum = 145;BA.debugLine="Public const BUTTON_SMALL As String = \"small\"";
_button_small = "small";
 //BA.debugLineNum = 146;BA.debugLine="Public const BUTTON_LARGE As String = \"large\"";
_button_large = "large";
 //BA.debugLineNum = 147;BA.debugLine="Public const BUTTON_XSMALL As String = \"x-small\"";
_button_xsmall = "x-small";
 //BA.debugLineNum = 148;BA.debugLine="Public const BUTTON_XLARGE As String = \"x-large\"";
_button_xlarge = "x-large";
 //BA.debugLineNum = 150;BA.debugLine="Public const TRANSITION_SLIDE_X As String = \"slid";
_transition_slide_x = "slide-x-transition";
 //BA.debugLineNum = 151;BA.debugLine="Public const TRANSITION_SLIDE_X_REVERSE As String";
_transition_slide_x_reverse = "slide-x-reverse-transition";
 //BA.debugLineNum = 152;BA.debugLine="Public const TRANSITION_SLIDE_Y As String = \"slid";
_transition_slide_y = "slide-y-transition";
 //BA.debugLineNum = 153;BA.debugLine="Public const TRANSITION_SLIDE_Y_REVERSE As String";
_transition_slide_y_reverse = "slide-y-reverse-transition";
 //BA.debugLineNum = 154;BA.debugLine="Public const TRANSITION_SCROLL_X As String = \"scr";
_transition_scroll_x = "scroll-x-transition";
 //BA.debugLineNum = 155;BA.debugLine="Public const TRANSITION_SCROLL_X_REVERSE As Strin";
_transition_scroll_x_reverse = "scroll-x-reverse-transition";
 //BA.debugLineNum = 156;BA.debugLine="Public const TRANSITION_SCROLL_Y As String = \"scr";
_transition_scroll_y = "scroll-y-transition";
 //BA.debugLineNum = 157;BA.debugLine="Public const TRANSITION_SCROLL_Y_REVERSE As Strin";
_transition_scroll_y_reverse = "scroll-y-reverse-transition";
 //BA.debugLineNum = 158;BA.debugLine="Public const TRANSITION_SCALE As String = \"scale-";
_transition_scale = "scale-transition";
 //BA.debugLineNum = 159;BA.debugLine="Public const TRANSITION_FADE As String = \"fade-tr";
_transition_fade = "fade-transition";
 //BA.debugLineNum = 160;BA.debugLine="Public const TRANSITION_FAB As String = \"fab-tran";
_transition_fab = "fab-transition";
 //BA.debugLineNum = 162;BA.debugLine="Public const JUSTIFY_CENTER As String = \"center\"";
_justify_center = "center";
 //BA.debugLineNum = 163;BA.debugLine="Public const JUSTIFY_START As String = \"start\"";
_justify_start = "start";
 //BA.debugLineNum = 164;BA.debugLine="Public const JUSTIFY_END As String = \"end\"";
_justify_end = "end";
 //BA.debugLineNum = 166;BA.debugLine="Public const ALIGN_CENTER As String = \"center\"";
_align_center = "center";
 //BA.debugLineNum = 167;BA.debugLine="Public const ALIGN_START As String = \"start\"";
_align_start = "start";
 //BA.debugLineNum = 168;BA.debugLine="Public const ALIGN_END As String = \"end\"";
_align_end = "end";
 //BA.debugLineNum = 169;BA.debugLine="Public const ALIGN_STRETCH As String = \"stretch\"";
_align_stretch = "stretch";
 //BA.debugLineNum = 171;BA.debugLine="Public const FLEX_GROW_0 As String = \"flex-grow-0";
_flex_grow_0 = "flex-grow-0";
 //BA.debugLineNum = 172;BA.debugLine="Public const FLEX_GROW_1 As String = \"flex-grow-1";
_flex_grow_1 = "flex-grow-1";
 //BA.debugLineNum = 173;BA.debugLine="Public const FLEX_SHRINK_0 As String = \"flex-shri";
_flex_shrink_0 = "flex-shrink-0";
 //BA.debugLineNum = 174;BA.debugLine="Public const FLEX_SHRINK_1 As String = \"flex-shri";
_flex_shrink_1 = "flex-shrink-1";
 //BA.debugLineNum = 176;BA.debugLine="Public const TEXT_LEFT As String = \"text-left\"";
_text_left = "text-left";
 //BA.debugLineNum = 177;BA.debugLine="Public const TEXT_CENTER As String = \"text-center";
_text_center = "text-center";
 //BA.debugLineNum = 178;BA.debugLine="Public const TEXT_RIGHT As String = \"text-right\"";
_text_right = "text-right";
 //BA.debugLineNum = 179;BA.debugLine="Public const TEXT_NO_WRAP As String = \"text-no-wr";
_text_no_wrap = "text-no-wrap";
 //BA.debugLineNum = 180;BA.debugLine="Public const TEXT_TRUNCATE As String = \"text-trun";
_text_truncate = "text-truncate";
 //BA.debugLineNum = 181;BA.debugLine="Public const TEXT_LOWERCASE As String = \"text-low";
_text_lowercase = "text-lowercase";
 //BA.debugLineNum = 182;BA.debugLine="Public const TEXT_UPPERCASE As String = \"text-upp";
_text_uppercase = "text-uppercase";
 //BA.debugLineNum = 183;BA.debugLine="Public const TEXT_CAPITALIZE As String = \"text-ca";
_text_capitalize = "text-capitalize";
 //BA.debugLineNum = 185;BA.debugLine="Public SnackBar As VMSnackBar";
_snackbar = new b4j.example.vmsnackbar();
 //BA.debugLineNum = 186;BA.debugLine="Public RTL As Boolean";
_rtl = false;
 //BA.debugLineNum = 187;BA.debugLine="Public Dark As Boolean";
_dark = false;
 //BA.debugLineNum = 188;BA.debugLine="Private Options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 189;BA.debugLine="Private lang As String";
_lang = "";
 //BA.debugLineNum = 190;BA.debugLine="Private drawers As List";
_drawers = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 191;BA.debugLine="Private placeHolder As Int";
_placeholder = 0;
 //BA.debugLineNum = 192;BA.debugLine="Public Floats As Map";
_floats = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 193;BA.debugLine="Public FontSizes As Map";
_fontsizes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 194;BA.debugLine="Private bUseRouter As Boolean";
_buserouter = false;
 //BA.debugLineNum = 195;BA.debugLine="Public Position As Map";
_position = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 196;BA.debugLine="Public ShowWarnings As Boolean";
_showwarnings = false;
 //BA.debugLineNum = 197;BA.debugLine="Public ScrollBarWidth As Int";
_scrollbarwidth = 0;
 //BA.debugLineNum = 199;BA.debugLine="Public CONST BREAKPOINT_XS As String = \"xs\"";
_breakpoint_xs = "xs";
 //BA.debugLineNum = 200;BA.debugLine="Public CONST BREAKPOINT_SM As String = \"sm\"";
_breakpoint_sm = "sm";
 //BA.debugLineNum = 201;BA.debugLine="Public CONST BREAKPOINT_MD As String = \"md\"";
_breakpoint_md = "md";
 //BA.debugLineNum = 202;BA.debugLine="Public CONST BREAKPOINT_LG As String = \"lg\"";
_breakpoint_lg = "lg";
 //BA.debugLineNum = 203;BA.debugLine="Public CONST BREAKPOINT_XL As String = \"xl\"";
_breakpoint_xl = "xl";
 //BA.debugLineNum = 205;BA.debugLine="Public CONST BREAKPOINT_xsOnly As String = \"xsOnl";
_breakpoint_xsonly = "xsOnly";
 //BA.debugLineNum = 206;BA.debugLine="Public CONST BREAKPOINT_smOnly As String = \"smOnl";
_breakpoint_smonly = "smOnly";
 //BA.debugLineNum = 207;BA.debugLine="Public CONST BREAKPOINT_smAndDown As String = \"sm";
_breakpoint_smanddown = "smAndDown";
 //BA.debugLineNum = 208;BA.debugLine="Public CONST BREAKPOINT_smAndUp As String = \"smAn";
_breakpoint_smandup = "smAndUp";
 //BA.debugLineNum = 209;BA.debugLine="Public CONST BREAKPOINT_mdOnly As String = \"mdOnl";
_breakpoint_mdonly = "mdOnly";
 //BA.debugLineNum = 210;BA.debugLine="Public CONST BREAKPOINT_mdAndDown As String = \"md";
_breakpoint_mdanddown = "mdAndDown";
 //BA.debugLineNum = 211;BA.debugLine="Public CONST BREAKPOINT_mdAndUp As String = \"mdAn";
_breakpoint_mdandup = "mdAndUp";
 //BA.debugLineNum = 212;BA.debugLine="Public CONST BREAKPOINT_lgOnly As String = \"lgOnl";
_breakpoint_lgonly = "lgOnly";
 //BA.debugLineNum = 213;BA.debugLine="Public CONST BREAKPOINT_lgAndDown As String = \"lg";
_breakpoint_lganddown = "lgAndDown";
 //BA.debugLineNum = 214;BA.debugLine="Public CONST BREAKPOINT_lgAndUp As String = \"lgAn";
_breakpoint_lgandup = "lgAndUp";
 //BA.debugLineNum = 215;BA.debugLine="Public CONST BREAKPOINT_xlOnly As String = \"xlOnl";
_breakpoint_xlonly = "xlOnly";
 //BA.debugLineNum = 216;BA.debugLine="Public Breakpoint As Object";
_breakpoint = new Object();
 //BA.debugLineNum = 217;BA.debugLine="Public BreakpointName As String";
_breakpointname = "";
 //BA.debugLineNum = 218;BA.debugLine="Public Config As BANanoObject";
_config = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 219;BA.debugLine="Public UsesDrawer As Boolean";
_usesdrawer = false;
 //BA.debugLineNum = 220;BA.debugLine="Public UsesNavBar As Boolean";
_usesnavbar = false;
 //BA.debugLineNum = 221;BA.debugLine="Public UsesFooter As Boolean";
_usesfooter = false;
 //BA.debugLineNum = 222;BA.debugLine="Public UsesBottomNav As Boolean";
_usesbottomnav = false;
 //BA.debugLineNum = 223;BA.debugLine="Public UsesOverlay As Boolean";
_usesoverlay = false;
 //BA.debugLineNum = 224;BA.debugLine="Public UsesLoader As Boolean";
_usesloader = false;
 //BA.debugLineNum = 225;BA.debugLine="Public UsesSnackBar As Boolean";
_usessnackbar = false;
 //BA.debugLineNum = 226;BA.debugLine="Public UsesDialog As Boolean";
_usesdialog = false;
 //BA.debugLineNum = 227;BA.debugLine="Public UsesNotification As Boolean";
_usesnotification = false;
 //BA.debugLineNum = 229;BA.debugLine="Public const LOCALE_Afrikaans As String = \"af\"";
_locale_afrikaans = "af";
 //BA.debugLineNum = 230;BA.debugLine="Public const LOCALE_Arabic As String = \"ar\"";
_locale_arabic = "ar";
 //BA.debugLineNum = 231;BA.debugLine="Public const LOCALE_Catalan As String = \"ca\"";
_locale_catalan = "ca";
 //BA.debugLineNum = 232;BA.debugLine="Public const LOCALE_Czech As String = \"cs\"";
_locale_czech = "cs";
 //BA.debugLineNum = 233;BA.debugLine="Public const LOCALE_German As String = \"de\"";
_locale_german = "de";
 //BA.debugLineNum = 234;BA.debugLine="Public const LOCALE_Greek As String = \"el\"";
_locale_greek = "el";
 //BA.debugLineNum = 235;BA.debugLine="Public const LOCALE_English	As String = \"en\"";
_locale_english = "en";
 //BA.debugLineNum = 236;BA.debugLine="Public const LOCALE_Spanish As String = \"es\"";
_locale_spanish = "es";
 //BA.debugLineNum = 237;BA.debugLine="Public const LOCALE_Estonian As String = \"et\"";
_locale_estonian = "et";
 //BA.debugLineNum = 238;BA.debugLine="Public const LOCALE_Persian As String = \"fa\"";
_locale_persian = "fa";
 //BA.debugLineNum = 239;BA.debugLine="Public const LOCALE_Finnish	As String = \"fi\"";
_locale_finnish = "fi";
 //BA.debugLineNum = 240;BA.debugLine="Public const LOCALE_French 	As String = \"fr\"";
_locale_french = "fr";
 //BA.debugLineNum = 241;BA.debugLine="Public const LOCALE_Hebrew 	As String = \"he\"";
_locale_hebrew = "he";
 //BA.debugLineNum = 242;BA.debugLine="Public const LOCALE_Croatian As String = \"hr\"";
_locale_croatian = "hr";
 //BA.debugLineNum = 243;BA.debugLine="Public const LOCALE_Hungarian As String = \"hu\"";
_locale_hungarian = "hu";
 //BA.debugLineNum = 244;BA.debugLine="Public const LOCALE_Indonesian As String = \"id\"";
_locale_indonesian = "id";
 //BA.debugLineNum = 245;BA.debugLine="Public const LOCALE_Italian As String = \"it\"";
_locale_italian = "it";
 //BA.debugLineNum = 246;BA.debugLine="Public const LOCALE_Japanese As String = \"ja\"";
_locale_japanese = "ja";
 //BA.debugLineNum = 247;BA.debugLine="Public const LOCALE_Korean As String = \"ko\"";
_locale_korean = "ko";
 //BA.debugLineNum = 248;BA.debugLine="Public const LOCALE_Lithuanian As String = \"lt\"";
_locale_lithuanian = "lt";
 //BA.debugLineNum = 249;BA.debugLine="Public const LOCALE_Latvian As String = \"lv\"";
_locale_latvian = "lv";
 //BA.debugLineNum = 250;BA.debugLine="Public const LOCALE_Dutch As String = \"nl\"";
_locale_dutch = "nl";
 //BA.debugLineNum = 251;BA.debugLine="Public const LOCALE_Norwegian As String = \"no\"";
_locale_norwegian = "no";
 //BA.debugLineNum = 252;BA.debugLine="Public const LOCALE_Polish As String = \"pl\"";
_locale_polish = "pl";
 //BA.debugLineNum = 253;BA.debugLine="Public const LOCALE_Portuguese As String = \"pt\"";
_locale_portuguese = "pt";
 //BA.debugLineNum = 254;BA.debugLine="Public const LOCALE_Romanian As String = \"ro\"";
_locale_romanian = "ro";
 //BA.debugLineNum = 255;BA.debugLine="Public const LOCALE_Russian As String = \"ru\"";
_locale_russian = "ru";
 //BA.debugLineNum = 256;BA.debugLine="Public const LOCALE_Slovak As String = \"sk\"";
_locale_slovak = "sk";
 //BA.debugLineNum = 257;BA.debugLine="Public const LOCALE_Slovene As String = \"sl\"";
_locale_slovene = "sl";
 //BA.debugLineNum = 258;BA.debugLine="Public const LOCALE_Serbian As String = \"srCyrl\"";
_locale_serbian = "srCyrl";
 //BA.debugLineNum = 259;BA.debugLine="Public const LOCALE_Swedish As String = \"sv\"";
_locale_swedish = "sv";
 //BA.debugLineNum = 260;BA.debugLine="Public const LOCALE_Thai As String = \"th\"";
_locale_thai = "th";
 //BA.debugLineNum = 261;BA.debugLine="Public const LOCALE_Turkish As String = \"tr\"";
_locale_turkish = "tr";
 //BA.debugLineNum = 262;BA.debugLine="Public const LOCALE_Ukrainian As String = \"uk\"";
_locale_ukrainian = "uk";
 //BA.debugLineNum = 263;BA.debugLine="Public const LOCALE_Chinese As String = \"zhHans\"";
_locale_chinese = "zhHans";
 //BA.debugLineNum = 264;BA.debugLine="Public const LOCALE_Chinese1 As String = \"zhHant\"";
_locale_chinese1 = "zhHant";
 //BA.debugLineNum = 266;BA.debugLine="Public const VISIBILITY_PrintOnly As String = \"pr";
_visibility_printonly = "print-only";
 //BA.debugLineNum = 267;BA.debugLine="Public const VISIBILITY_ScreenOnly As String = \"s";
_visibility_screenonly = "screen-only";
 //BA.debugLineNum = 268;BA.debugLine="Public const VISIBILITY_XsOnly As String = \"xs-on";
_visibility_xsonly = "xs-only";
 //BA.debugLineNum = 269;BA.debugLine="Public const VISIBILITY_SmOnly As String = \"sm-on";
_visibility_smonly = "sm-only";
 //BA.debugLineNum = 270;BA.debugLine="Public const VISIBILITY_SmAndDown As String = \"sm";
_visibility_smanddown = "sm-and-down";
 //BA.debugLineNum = 271;BA.debugLine="Public const VISIBILITY_SmAndUp As String = \"sm-a";
_visibility_smandup = "sm-and-up";
 //BA.debugLineNum = 272;BA.debugLine="Public const VISIBILITY_MdOnly As String = \"md-on";
_visibility_mdonly = "md-only";
 //BA.debugLineNum = 273;BA.debugLine="Public const VISIBILITY_MdAndDown As String = \"md";
_visibility_mdanddown = "md-and-down";
 //BA.debugLineNum = 274;BA.debugLine="Public const VISIBILITY_MdAndUp As String = \"md-a";
_visibility_mdandup = "md-and-up";
 //BA.debugLineNum = 275;BA.debugLine="Public const VISIBILITY_LgOnly As String = \"lg-on";
_visibility_lgonly = "lg-only";
 //BA.debugLineNum = 276;BA.debugLine="Public const VISIBILITY_LgAndDown As String = \"lg";
_visibility_lganddown = "lg-and-down";
 //BA.debugLineNum = 277;BA.debugLine="Public const VISIBILITY_LgAndUp As String = \"lg-a";
_visibility_lgandup = "lg-and-up";
 //BA.debugLineNum = 278;BA.debugLine="Public const VISIBILITY_XlOnly As String = \"xl-on";
_visibility_xlonly = "xl-only";
 //BA.debugLineNum = 279;BA.debugLine="Public const VISIBILITY_ALL As String = \"\"";
_visibility_all = "";
 //BA.debugLineNum = 281;BA.debugLine="Public const ALERT_BORDER_LEFT As String = \"left\"";
_alert_border_left = "left";
 //BA.debugLineNum = 282;BA.debugLine="Public const ALERT_BORDER_RIGHT As String = \"righ";
_alert_border_right = "right";
 //BA.debugLineNum = 283;BA.debugLine="Public const ALERT_BORDER_BOTTOM As String = \"bot";
_alert_border_bottom = "bottom";
 //BA.debugLineNum = 284;BA.debugLine="Public const ALERT_BORDER_TOP As String = \"top\"";
_alert_border_top = "top";
 //BA.debugLineNum = 286;BA.debugLine="Public const ALERT_TYPE_SUCCESS As String = \"succ";
_alert_type_success = "success";
 //BA.debugLineNum = 287;BA.debugLine="Public const ALERT_TYPE_INFO As String = \"info\"";
_alert_type_info = "info";
 //BA.debugLineNum = 288;BA.debugLine="Public const ALERT_TYPE_WARNING As String = \"warn";
_alert_type_warning = "warning";
 //BA.debugLineNum = 289;BA.debugLine="Public const ALERT_TYPE_ERROR As String = \"error\"";
_alert_type_error = "error";
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return "";
}
public String  _confirmhide() throws Exception{
 //BA.debugLineNum = 1243;BA.debugLine="Sub ConfirmHide";
 //BA.debugLineNum = 1244;BA.debugLine="Confirm.hide";
_confirm._hide /*b4j.example.vmdialog*/ ();
 //BA.debugLineNum = 1245;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _copymap(anywheresoftware.b4a.objects.collections.Map _source,anywheresoftware.b4a.objects.collections.List _keys) throws Exception{
 //BA.debugLineNum = 2601;BA.debugLine="Sub CopyMap(source As Map, keys As List) As Map";
 //BA.debugLineNum = 2602;BA.debugLine="Return vue.CopyMap(source, keys)";
if (true) return _vue._copymap /*anywheresoftware.b4a.objects.collections.Map*/ (_source,_keys);
 //BA.debugLineNum = 2603;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createa(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2559;BA.debugLine="Sub CreateA(sid As String) As VMElement";
 //BA.debugLineNum = 2560;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2561;BA.debugLine="el.Initialize(vue, sid).SetTag(\"a\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("a");
 //BA.debugLineNum = 2563;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2564;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _createalert(String _eid,Object _eventhandler,String _typeof) throws Exception{
b4j.example.vmalert _el = null;
 //BA.debugLineNum = 1331;BA.debugLine="Sub CreateAlert(eID As String, eventHandler As Obj";
 //BA.debugLineNum = 1332;BA.debugLine="Dim el As VMAlert";
_el = new b4j.example.vmalert();
 //BA.debugLineNum = 1333;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmalert*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1334;BA.debugLine="If typeOf <> \"\" Then el.SetType(typeOf)";
if ((_typeof).equals("") == false) { 
_el._settype /*b4j.example.vmalert*/ (_typeof);};
 //BA.debugLineNum = 1335;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _createanchor(String _id) throws Exception{
b4j.example.vmlabel _elx = null;
 //BA.debugLineNum = 3857;BA.debugLine="Sub CreateAnchor(id As String) As VMLabel";
 //BA.debugLineNum = 3858;BA.debugLine="Dim elx As VMLabel = CreateLabel(id).SetA";
_elx = _createlabel(_id)._seta /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 3859;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3860;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _createappbar(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmtoolbar _el = null;
 //BA.debugLineNum = 2945;BA.debugLine="Sub CreateAppBar(sid As String, moduleObj As Objec";
 //BA.debugLineNum = 2946;BA.debugLine="Dim el As VMToolBar";
_el = new b4j.example.vmtoolbar();
 //BA.debugLineNum = 2947;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmtoolbar*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 2948;BA.debugLine="el.SetAppBar(True)";
_el._setappbar /*b4j.example.vmtoolbar*/ (__c.True);
 //BA.debugLineNum = 2949;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2950;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _createautocomplete(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 1360;BA.debugLine="Sub CreateAutoComplete(eID As String, eventHandler";
 //BA.debugLineNum = 1361;BA.debugLine="Dim el As VMSelect";
_el = new b4j.example.vmselect();
 //BA.debugLineNum = 1362;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmselect*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1363;BA.debugLine="el.SetAutoComplete";
_el._setautocomplete /*b4j.example.vmselect*/ ();
 //BA.debugLineNum = 1364;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1365;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _createavatar(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmavatar _el = null;
 //BA.debugLineNum = 2232;BA.debugLine="Sub CreateAvatar(sid As String, moduleObj As Objec";
 //BA.debugLineNum = 2233;BA.debugLine="Dim el As VMAvatar";
_el = new b4j.example.vmavatar();
 //BA.debugLineNum = 2234;BA.debugLine="el.Initialize(vue,sid, moduleObj)";
_el._initialize /*b4j.example.vmavatar*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 2235;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2236;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _createb4xlist(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
 //BA.debugLineNum = 2911;BA.debugLine="Sub CreateB4xList(lst As List) As List";
 //BA.debugLineNum = 2912;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2913;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 2914;BA.debugLine="nl.AddAll(lst)";
_nl.AddAll(_lst);
 //BA.debugLineNum = 2915;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 2916;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _createbadge(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmbadge _el = null;
 //BA.debugLineNum = 2251;BA.debugLine="Sub CreateBadge(sid As String, moduleObj As Object";
 //BA.debugLineNum = 2252;BA.debugLine="Dim el As VMBadge";
_el = new b4j.example.vmbadge();
 //BA.debugLineNum = 2253;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmbadge*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 2254;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbanner  _createbanner(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmbanner _el = null;
 //BA.debugLineNum = 1432;BA.debugLine="Sub CreateBanner(eID As String, eventHandler As Ob";
 //BA.debugLineNum = 1433;BA.debugLine="Dim el As VMBanner";
_el = new b4j.example.vmbanner();
 //BA.debugLineNum = 1434;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmbanner*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1435;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomnavigation  _createbottomnavigation(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmbottomnavigation _el = null;
 //BA.debugLineNum = 1438;BA.debugLine="Sub CreateBottomNavigation(eID As String, eventHan";
 //BA.debugLineNum = 1439;BA.debugLine="Dim el As VMBottomNavigation";
_el = new b4j.example.vmbottomnavigation();
 //BA.debugLineNum = 1440;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmbottomnavigation*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1441;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1442;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottomsheet  _createbottomsheet(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmbottomsheet _el = null;
 //BA.debugLineNum = 2782;BA.debugLine="Sub CreateBottomSheet(sid As String, eventHandler";
 //BA.debugLineNum = 2783;BA.debugLine="Dim el As VMBottomSheet";
_el = new b4j.example.vmbottomsheet();
 //BA.debugLineNum = 2784;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmbottomsheet*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2785;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2786;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _createbutton(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmbutton _el = null;
 //BA.debugLineNum = 2898;BA.debugLine="Sub CreateButton(sid As String,moduleObj As Object";
 //BA.debugLineNum = 2899;BA.debugLine="Dim el As VMButton";
_el = new b4j.example.vmbutton();
 //BA.debugLineNum = 2900;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmbutton*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 2901;BA.debugLine="el.SetType(\"button\")";
_el._settype /*b4j.example.vmbutton*/ ("button");
 //BA.debugLineNum = 2902;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2903;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbuttontoggle  _createbuttontoggle(String _bid,Object _moduleobj) throws Exception{
b4j.example.vmbuttontoggle _el = null;
 //BA.debugLineNum = 2905;BA.debugLine="Sub CreateButtonToggle(bid As String, moduleObj As";
 //BA.debugLineNum = 2906;BA.debugLine="Dim el As VMButtonToggle";
_el = new b4j.example.vmbuttontoggle();
 //BA.debugLineNum = 2907;BA.debugLine="el.Initialize(vue, bid, moduleObj)";
_el._initialize /*b4j.example.vmbuttontoggle*/ (ba,_vue,_bid,_moduleobj);
 //BA.debugLineNum = 2908;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2909;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcalendar  _createcalendar(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmcalendar _el = null;
 //BA.debugLineNum = 2794;BA.debugLine="Sub CreateCalendar(sid As String, eventHandler As";
 //BA.debugLineNum = 2795;BA.debugLine="Dim el As VMCalendar";
_el = new b4j.example.vmcalendar();
 //BA.debugLineNum = 2796;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmcalendar*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2797;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2798;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _createcard(String _cid,Object _eventhandler) throws Exception{
b4j.example.vmcard _el = null;
 //BA.debugLineNum = 1468;BA.debugLine="Sub CreateCard(cID As String, eventHandler As Obje";
 //BA.debugLineNum = 1469;BA.debugLine="Dim el As VMCard";
_el = new b4j.example.vmcard();
 //BA.debugLineNum = 1470;BA.debugLine="el.Initialize(vue, cID, eventHandler)";
_el._initialize /*b4j.example.vmcard*/ (ba,_vue,_cid,_eventhandler);
 //BA.debugLineNum = 1471;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1472;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _createcardtext(String _cid,Object _eventhandler) throws Exception{
b4j.example.vmcardtext _el = null;
 //BA.debugLineNum = 1474;BA.debugLine="Sub CreateCardText(cID As String, eventHandler As";
 //BA.debugLineNum = 1475;BA.debugLine="Dim el As VMCardText";
_el = new b4j.example.vmcardtext();
 //BA.debugLineNum = 1476;BA.debugLine="el.Initialize(vue, cID, eventHandler)";
_el._initialize /*b4j.example.vmcardtext*/ (ba,_vue,_cid,_eventhandler);
 //BA.debugLineNum = 1477;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1478;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarousel  _createcarousel(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmcarousel _el = null;
 //BA.debugLineNum = 2245;BA.debugLine="Sub CreateCarousel(sid As String, moduleObj As Obj";
 //BA.debugLineNum = 2246;BA.debugLine="Dim el As VMCarousel";
_el = new b4j.example.vmcarousel();
 //BA.debugLineNum = 2247;BA.debugLine="el.Initialize(vue,sid, moduleObj)";
_el._initialize /*b4j.example.vmcarousel*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 2248;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcarouselitem  _createcarouselitem(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmcarouselitem _el = null;
 //BA.debugLineNum = 2807;BA.debugLine="Sub CreateCarouselItem(sid As String, eventHandler";
 //BA.debugLineNum = 2808;BA.debugLine="Dim el As VMCarouselItem";
_el = new b4j.example.vmcarouselitem();
 //BA.debugLineNum = 2809;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmcarouselitem*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2810;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2811;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _createcheckbox(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmcheckbox _el = null;
 //BA.debugLineNum = 2514;BA.debugLine="Sub CreateCheckBox(sid As String, eventHandler As";
 //BA.debugLineNum = 2515;BA.debugLine="Dim el As VMCheckBox";
_el = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 2516;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2518;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2519;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _createchip(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmchip _el = null;
 //BA.debugLineNum = 2801;BA.debugLine="Sub CreateChip(sid As String, eventHandler As Obje";
 //BA.debugLineNum = 2802;BA.debugLine="Dim el As VMChip";
_el = new b4j.example.vmchip();
 //BA.debugLineNum = 2803;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmchip*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2804;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2805;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _createchipgroup(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmchipgroup _el = null;
 //BA.debugLineNum = 1344;BA.debugLine="Sub CreateChipGroup(eID As String, eventHandler As";
 //BA.debugLineNum = 1345;BA.debugLine="Dim el As VMChipGroup";
_el = new b4j.example.vmchipgroup();
 //BA.debugLineNum = 1346;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmchipgroup*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1347;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1348;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _createcolorpicker(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmcolorpicker _el = null;
 //BA.debugLineNum = 1411;BA.debugLine="Sub CreateColorPicker(eID As String, eventHandler";
 //BA.debugLineNum = 1412;BA.debugLine="Dim el As VMColorPicker";
_el = new b4j.example.vmcolorpicker();
 //BA.debugLineNum = 1413;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmcolorpicker*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1414;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1415;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _createcombobox(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 1367;BA.debugLine="Sub CreateComboBox(eID As String, eventHandler As";
 //BA.debugLineNum = 1368;BA.debugLine="Dim el As VMSelect";
_el = new b4j.example.vmselect();
 //BA.debugLineNum = 1369;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmselect*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1370;BA.debugLine="el.SetComboBox";
_el._setcombobox /*b4j.example.vmselect*/ ();
 //BA.debugLineNum = 1371;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1372;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createcomponent(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2112;BA.debugLine="Sub CreateComponent(id As String) As VMElement";
 //BA.debugLineNum = 2113;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2114;BA.debugLine="el.Initialize(vue, id).SetTag(\"component\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("component");
 //BA.debugLineNum = 2115;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _createcontainer(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmcontainer _el = null;
 //BA.debugLineNum = 1806;BA.debugLine="Sub CreateContainer(sid As String, eventHandler As";
 //BA.debugLineNum = 1807;BA.debugLine="Dim el As VMContainer";
_el = new b4j.example.vmcontainer();
 //BA.debugLineNum = 1808;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmcontainer*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1809;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1810;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createcustomcomponent(String _id,String _tag) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2104;BA.debugLine="Sub CreateCustomComponent(id As String, tag As Str";
 //BA.debugLineNum = 2105;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2106;BA.debugLine="el.Initialize(vue, id).SetTag(tag)";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ (_tag);
 //BA.debugLineNum = 2108;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _createdatatable(String _cid,String _primarykey,Object _eventhandler) throws Exception{
b4j.example.vmdatatable _el = null;
 //BA.debugLineNum = 1445;BA.debugLine="Sub CreateDataTable(cID As String, PrimaryKey As S";
 //BA.debugLineNum = 1446;BA.debugLine="Dim el As VMDataTable";
_el = new b4j.example.vmdatatable();
 //BA.debugLineNum = 1447;BA.debugLine="el.Initialize(vue, cID,PrimaryKey,  eventHandler)";
_el._initialize /*b4j.example.vmdatatable*/ (ba,_vue,_cid,_primarykey,_eventhandler);
 //BA.debugLineNum = 1448;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1449;BA.debugLine="End Sub";
return null;
}
public String  _createdatatable1(b4j.example.vmdatatable _el,String _cid,String _primarykey,Object _eventhandler) throws Exception{
 //BA.debugLineNum = 1458;BA.debugLine="Sub CreateDataTable1(el As VMDataTable, cID As Str";
 //BA.debugLineNum = 1459;BA.debugLine="el.Initialize(vue, cID,PrimaryKey,  eventHandler)";
_el._initialize /*b4j.example.vmdatatable*/ (ba,_vue,_cid,_primarykey,_eventhandler);
 //BA.debugLineNum = 1460;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatetimepicker  _createdatepicker(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmdatetimepicker _el = null;
 //BA.debugLineNum = 1381;BA.debugLine="Sub CreateDatePicker(eID As String, eventHandler A";
 //BA.debugLineNum = 1382;BA.debugLine="Dim el As VMDateTimePicker";
_el = new b4j.example.vmdatetimepicker();
 //BA.debugLineNum = 1383;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmdatetimepicker*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1384;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1385;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _createdatetimepicker(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmdatetimepicker _el = null;
 //BA.debugLineNum = 2873;BA.debugLine="Sub CreateDateTimePicker(sid As String, eventHandl";
 //BA.debugLineNum = 2874;BA.debugLine="Dim el As VMDateTimePicker";
_el = new b4j.example.vmdatetimepicker();
 //BA.debugLineNum = 2875;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmdatetimepicker*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2876;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2877;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _createdialog(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmdialog _el = null;
 //BA.debugLineNum = 2853;BA.debugLine="Sub CreateDialog(sid As String, moduleObj As Objec";
 //BA.debugLineNum = 2854;BA.debugLine="Dim el As VMDialog";
_el = new b4j.example.vmdialog();
 //BA.debugLineNum = 2855;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmdialog*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 2857;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2858;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _creatediv(String _sid) throws Exception{
 //BA.debugLineNum = 1401;BA.debugLine="Sub CreateDiv(sid As String) As VMElement";
 //BA.debugLineNum = 1402;BA.debugLine="Return vue.CreateDiv(sid)";
if (true) return _vue._creatediv /*b4j.example.vmelement*/ (_sid);
 //BA.debugLineNum = 1403;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _createdivider() throws Exception{
b4j.example.vmdivider _el = null;
 //BA.debugLineNum = 2860;BA.debugLine="Sub CreateDivider As VMDivider";
 //BA.debugLineNum = 2861;BA.debugLine="Dim el As VMDivider";
_el = new b4j.example.vmdivider();
 //BA.debugLineNum = 2862;BA.debugLine="el.Initialize(vue)";
_el._initialize /*b4j.example.vmdivider*/ (ba,_vue);
 //BA.debugLineNum = 2863;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2864;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnavigationdrawer  _createdrawer(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmnavigationdrawer _el = null;
 //BA.debugLineNum = 3159;BA.debugLine="Sub CreateDrawer(sid As String, eventHandler As Ob";
 //BA.debugLineNum = 3160;BA.debugLine="Dim el As VMNavigationDrawer";
_el = new b4j.example.vmnavigationdrawer();
 //BA.debugLineNum = 3161;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmnavigationdrawer*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 3162;BA.debugLine="el.RemoveAttr(\"app\")";
_el._removeattr /*b4j.example.vmnavigationdrawer*/ ("app");
 //BA.debugLineNum = 3163;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3164;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createdynamiccontent(String _sid) throws Exception{
String _pp = "";
b4j.example.vmelement _ui = null;
 //BA.debugLineNum = 2527;BA.debugLine="Sub CreateDynamicContent(sid As String) As VMEleme";
 //BA.debugLineNum = 2528;BA.debugLine="sid = sid.tolowercase";
_sid = _sid.toLowerCase();
 //BA.debugLineNum = 2529;BA.debugLine="Dim pp As String = $\"${sid}htmlcontent\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_sid))+"htmlcontent");
 //BA.debugLineNum = 2530;BA.debugLine="SetStateSingle(pp,\"<div></div>\")";
_setstatesingle(_pp,(Object)("<div></div>"));
 //BA.debugLineNum = 2531;BA.debugLine="Dim UI As VMElement = CreateTag(sid, \"renderstrin";
_ui = _createtag(_sid,"renderstring");
 //BA.debugLineNum = 2532;BA.debugLine="UI.Bind(\":string\", pp)";
_ui._bind /*b4j.example.vmelement*/ (":string",_pp);
 //BA.debugLineNum = 2533;BA.debugLine="UI.SetStyleSingle(\"width\", \"100% !important\")";
_ui._setstylesingle /*b4j.example.vmelement*/ ("width",(Object)("100% !important"));
 //BA.debugLineNum = 2534;BA.debugLine="UI.SetStyleSingle(\"height\", \"100% !important\")";
_ui._setstylesingle /*b4j.example.vmelement*/ ("height",(Object)("100% !important"));
 //BA.debugLineNum = 2535;BA.debugLine="UI.SetStyleSingle(\"max-height\", \"100% !important\"";
_ui._setstylesingle /*b4j.example.vmelement*/ ("max-height",(Object)("100% !important"));
 //BA.debugLineNum = 2536;BA.debugLine="UI.SetStyleSingle(\"max-width\", \"100% !important\")";
_ui._setstylesingle /*b4j.example.vmelement*/ ("max-width",(Object)("100% !important"));
 //BA.debugLineNum = 2537;BA.debugLine="UI.SetStyleSingle(\"overflow-y\", \"auto !important\"";
_ui._setstylesingle /*b4j.example.vmelement*/ ("overflow-y",(Object)("auto !important"));
 //BA.debugLineNum = 2538;BA.debugLine="UI.SetStyleSingle(\"overflow-x\", \"hidden !importan";
_ui._setstylesingle /*b4j.example.vmelement*/ ("overflow-x",(Object)("hidden !important"));
 //BA.debugLineNum = 2539;BA.debugLine="UI.SetStyleSingle(\"float\", \"left !important\")";
_ui._setstylesingle /*b4j.example.vmelement*/ ("float",(Object)("left !important"));
 //BA.debugLineNum = 2540;BA.debugLine="Return UI";
if (true) return _ui;
 //BA.debugLineNum = 2541;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createelement(String _sid,String _stag) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2892;BA.debugLine="Sub CreateElement(sid As String, stag As String) A";
 //BA.debugLineNum = 2893;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2894;BA.debugLine="el.Initialize(vue,sid).SetTag(stag)";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ (_stag);
 //BA.debugLineNum = 2895;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2896;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpandtransition  _createexpandtransition(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmexpandtransition _el = null;
 //BA.debugLineNum = 1293;BA.debugLine="Sub CreateExpandTransition(eID As String, eventHan";
 //BA.debugLineNum = 1294;BA.debugLine="Dim el As VMExpandTransition";
_el = new b4j.example.vmexpandtransition();
 //BA.debugLineNum = 1295;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmexpandtransition*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1296;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1297;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanel  _createexpansionpanel(String _eid,String _parentid,Object _eventhandler) throws Exception{
b4j.example.vmexpansionpanel _el = null;
 //BA.debugLineNum = 1405;BA.debugLine="Sub CreateExpansionPanel(eID As String, parentid A";
 //BA.debugLineNum = 1406;BA.debugLine="Dim el As VMExpansionPanel";
_el = new b4j.example.vmexpansionpanel();
 //BA.debugLineNum = 1407;BA.debugLine="el.Initialize(vue, parentid, eID, eventHandler)";
_el._initialize /*b4j.example.vmexpansionpanel*/ (ba,_vue,_parentid,_eid,_eventhandler);
 //BA.debugLineNum = 1408;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1409;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanels  _createexpansionpanels(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmexpansionpanels _el = null;
 //BA.debugLineNum = 2768;BA.debugLine="Sub CreateExpansionPanels(sid As String, eventHand";
 //BA.debugLineNum = 2769;BA.debugLine="Dim el As VMExpansionPanels";
_el = new b4j.example.vmexpansionpanels();
 //BA.debugLineNum = 2770;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmexpansionpanels*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2771;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2772;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _createfabbutton(String _sid,Object _moduleobj,String _iconname) throws Exception{
b4j.example.vmbutton _el = null;
 //BA.debugLineNum = 2932;BA.debugLine="Sub CreateFABButton(sid As String,moduleObj As Obj";
 //BA.debugLineNum = 2933;BA.debugLine="Dim el As VMButton";
_el = new b4j.example.vmbutton();
 //BA.debugLineNum = 2934;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmbutton*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 2935;BA.debugLine="el.SetFabButton(iconName)";
_el._setfabbutton /*b4j.example.vmbutton*/ (_iconname);
 //BA.debugLineNum = 2936;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2937;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _createfileinput(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmfileinput _el = null;
 //BA.debugLineNum = 2827;BA.debugLine="Sub CreateFileInput(sid As String, eventHandler As";
 //BA.debugLineNum = 2828;BA.debugLine="Dim el As VMFileInput";
_el = new b4j.example.vmfileinput();
 //BA.debugLineNum = 2829;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmfileinput*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2830;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2831;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _createform(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmform _el = null;
 //BA.debugLineNum = 2775;BA.debugLine="Sub CreateForm(sid As String, eventHandler As Obje";
 //BA.debugLineNum = 2776;BA.debugLine="Dim el As VMForm";
_el = new b4j.example.vmform();
 //BA.debugLineNum = 2777;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmform*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2779;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2780;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _createh1(String _id) throws Exception{
b4j.example.vmlabel _elx = null;
 //BA.debugLineNum = 3822;BA.debugLine="Sub CreateH1(id As String) As VMLabel";
 //BA.debugLineNum = 3823;BA.debugLine="Dim elx As VMLabel = CreateLabel(id).seth1";
_elx = _createlabel(_id)._seth1 /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 3824;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3825;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _createh2(String _id) throws Exception{
b4j.example.vmlabel _elx = null;
 //BA.debugLineNum = 3827;BA.debugLine="Sub CreateH2(id As String) As VMLabel";
 //BA.debugLineNum = 3828;BA.debugLine="Dim elx As VMLabel = CreateLabel(id).seth2";
_elx = _createlabel(_id)._seth2 /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 3829;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3830;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _createh3(String _id) throws Exception{
b4j.example.vmlabel _elx = null;
 //BA.debugLineNum = 3832;BA.debugLine="Sub CreateH3(id As String) As VMLabel";
 //BA.debugLineNum = 3833;BA.debugLine="Dim elx As VMLabel = CreateLabel(id).seth3";
_elx = _createlabel(_id)._seth3 /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 3834;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3835;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _createh4(String _id) throws Exception{
b4j.example.vmlabel _elx = null;
 //BA.debugLineNum = 3837;BA.debugLine="Sub CreateH4(id As String) As VMLabel";
 //BA.debugLineNum = 3838;BA.debugLine="Dim elx As VMLabel = CreateLabel(id).seth4";
_elx = _createlabel(_id)._seth4 /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 3839;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3840;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _createh5(String _id) throws Exception{
b4j.example.vmlabel _elx = null;
 //BA.debugLineNum = 3842;BA.debugLine="Sub CreateH5(id As String) As VMLabel";
 //BA.debugLineNum = 3843;BA.debugLine="Dim elx As VMLabel = CreateLabel(id).seth5";
_elx = _createlabel(_id)._seth5 /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 3844;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3845;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _createh6(String _id) throws Exception{
b4j.example.vmlabel _elx = null;
 //BA.debugLineNum = 3847;BA.debugLine="Sub CreateH6(id As String) As VMLabel";
 //BA.debugLineNum = 3848;BA.debugLine="Dim elx As VMLabel = CreateLabel(id).seth6";
_elx = _createlabel(_id)._seth6 /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 3849;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3850;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createhamburger(b4j.example.bananovue _v,String _eid,Object _eventhandler) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 947;BA.debugLine="Sub CreateHamburger(v As BANanoVue, eid As String,";
 //BA.debugLineNum = 948;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 949;BA.debugLine="elx.Initialize(v, eid)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_v,_eid);
 //BA.debugLineNum = 950;BA.debugLine="elx.SetTag(\"v-app-bar-nav-icon\")";
_elx._settag /*b4j.example.vmelement*/ ("v-app-bar-nav-icon");
 //BA.debugLineNum = 951;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 952;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _createicon(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmicon _el = null;
 //BA.debugLineNum = 2879;BA.debugLine="Sub CreateIcon(sid As String, moduleObj As Object)";
 //BA.debugLineNum = 2880;BA.debugLine="Dim el As VMIcon";
_el = new b4j.example.vmicon();
 //BA.debugLineNum = 2881;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmicon*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 2882;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2883;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _createiconbutton(String _sid,Object _moduleobj,String _iconname) throws Exception{
b4j.example.vmbutton _el = null;
 //BA.debugLineNum = 2925;BA.debugLine="Sub CreateIconButton(sid As String,moduleObj As Ob";
 //BA.debugLineNum = 2926;BA.debugLine="Dim el As VMButton";
_el = new b4j.example.vmbutton();
 //BA.debugLineNum = 2927;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmbutton*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 2928;BA.debugLine="el.SetIconButton(iconName)";
_el._seticonbutton /*b4j.example.vmbutton*/ (_iconname);
 //BA.debugLineNum = 2929;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2930;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _createimage(String _simg,Object _eventhandler) throws Exception{
b4j.example.vmimage _el = null;
 //BA.debugLineNum = 1844;BA.debugLine="Sub CreateImage(sImg As String, eventHandler As Ob";
 //BA.debugLineNum = 1845;BA.debugLine="Dim el As VMImage";
_el = new b4j.example.vmimage();
 //BA.debugLineNum = 1846;BA.debugLine="el.Initialize(vue, sImg, eventHandler)";
_el._initialize /*b4j.example.vmimage*/ (ba,_vue,_simg,_eventhandler);
 //BA.debugLineNum = 1847;BA.debugLine="el.Image.typeof = \"image\"";
_el._image /*b4j.example.vmelement*/ ._typeof /*String*/  = "image";
 //BA.debugLineNum = 1848;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1849;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _createinput(String _sid,Object _eventhandler) throws Exception{
b4j.example.vminput _el = null;
 //BA.debugLineNum = 2820;BA.debugLine="Sub CreateInput(sid As String, eventHandler As Obj";
 //BA.debugLineNum = 2821;BA.debugLine="Dim el As VMInput";
_el = new b4j.example.vminput();
 //BA.debugLineNum = 2822;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vminput*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2824;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2825;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createinvisiblefileinput(Object _eventhandler,String _fid) throws Exception{
String _methodname = "";
b4j.example.vmelement _fu = null;
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1094;BA.debugLine="private Sub CreateInvisibleFileInput(eventHandler";
 //BA.debugLineNum = 1095;BA.debugLine="fid = fid.tolowercase";
_fid = _fid.toLowerCase();
 //BA.debugLineNum = 1096;BA.debugLine="Dim methodName As String = $\"${fid}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_fid))+"_change");
 //BA.debugLineNum = 1098;BA.debugLine="Dim fu As VMElement";
_fu = new b4j.example.vmelement();
 //BA.debugLineNum = 1099;BA.debugLine="fu.Initialize(vue, fid).SetTag(\"input\")";
_fu._initialize /*b4j.example.vmelement*/ (ba,_vue,_fid)._settag /*b4j.example.vmelement*/ ("input");
 //BA.debugLineNum = 1100;BA.debugLine="fu.SetAttrSingle(\"v-show\", \"false\")";
_fu._setattrsingle /*b4j.example.vmelement*/ ("v-show","false");
 //BA.debugLineNum = 1101;BA.debugLine="fu.SetAttrSingle(\"ref\", fid)";
_fu._setattrsingle /*b4j.example.vmelement*/ ("ref",_fid);
 //BA.debugLineNum = 1102;BA.debugLine="fu.SetAttrSingle(\"type\", \"file\")";
_fu._setattrsingle /*b4j.example.vmelement*/ ("type","file");
 //BA.debugLineNum = 1103;BA.debugLine="fu.SetAttrSingle(\"@change\", methodName)";
_fu._setattrsingle /*b4j.example.vmelement*/ ("@change",_methodname);
 //BA.debugLineNum = 1105;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return _fu;};
 //BA.debugLineNum = 1106;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1107;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1109;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1110;BA.debugLine="Return fu";
if (true) return _fu;
 //BA.debugLineNum = 1111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _createitem(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmitem _el = null;
 //BA.debugLineNum = 1325;BA.debugLine="Sub CreateItem(eID As String, eventHandler As Obje";
 //BA.debugLineNum = 1326;BA.debugLine="Dim el As VMItem";
_el = new b4j.example.vmitem();
 //BA.debugLineNum = 1327;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmitem*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1328;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1329;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitemgroup  _createitemgroup(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmitemgroup _el = null;
 //BA.debugLineNum = 1299;BA.debugLine="Sub CreateItemGroup(eID As String, eventHandler As";
 //BA.debugLineNum = 1300;BA.debugLine="Dim el As VMItemGroup";
_el = new b4j.example.vmitemgroup();
 //BA.debugLineNum = 1301;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmitemgroup*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1302;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1303;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createkeepalive(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2280;BA.debugLine="Sub CreateKeepAlive(sid As String) As VMElement";
 //BA.debugLineNum = 2281;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2282;BA.debugLine="el.Initialize(vue,sid).SetTag(\"keep-alive\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("keep-alive");
 //BA.debugLineNum = 2284;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2285;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _createlabel(String _id) throws Exception{
b4j.example.vmlabel _el = null;
 //BA.debugLineNum = 2294;BA.debugLine="Sub CreateLabel(id As String) As VMLabel";
 //BA.debugLineNum = 2295;BA.debugLine="Dim el As VMLabel";
_el = new b4j.example.vmlabel();
 //BA.debugLineNum = 2296;BA.debugLine="el.Initialize(vue, id)";
_el._initialize /*b4j.example.vmlabel*/ (ba,_vue,_id);
 //BA.debugLineNum = 2297;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2298;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _createlist(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmlist _el = null;
 //BA.debugLineNum = 1642;BA.debugLine="Sub CreateList(sid As String, eventHandler As Obje";
 //BA.debugLineNum = 1643;BA.debugLine="Dim el As VMList";
_el = new b4j.example.vmlist();
 //BA.debugLineNum = 1644;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmlist*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1645;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1646;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _createlist1(String _delimiter,String _values) throws Exception{
 //BA.debugLineNum = 1637;BA.debugLine="Sub CreateList1(Delimiter As String, Values As Str";
 //BA.debugLineNum = 1638;BA.debugLine="Return vue.CreateList(Delimiter, Values)";
if (true) return _vue._createlist /*anywheresoftware.b4a.objects.collections.List*/ (_delimiter,_values);
 //BA.debugLineNum = 1639;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _createmenu(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmmenu _el = null;
 //BA.debugLineNum = 2845;BA.debugLine="Sub CreateMenu(sid As String, moduleObj As Object)";
 //BA.debugLineNum = 2846;BA.debugLine="Dim el As VMMenu";
_el = new b4j.example.vmmenu();
 //BA.debugLineNum = 2847;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmmenu*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 2849;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2850;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _createmultichecklist(Object _eventhandler,String _dtid,String _dtsource,String _dtkey,String _dttitle,String _dttarget) throws Exception{
b4j.example.vmlist _dtlist = null;
b4j.example.vmlistitemgroup _vlig = null;
b4j.example.vmlistitem _dtli = null;
b4j.example.vmtemplate _tmpx = null;
b4j.example.vmlistitemaction _vlia = null;
b4j.example.vmcheckbox _vliacb = null;
b4j.example.vmlistitemcontent _vlic = null;
b4j.example.vmlistitemtitle _vlit = null;
 //BA.debugLineNum = 3766;BA.debugLine="Sub CreateMultiCheckList(EventHandler As Object, d";
 //BA.debugLineNum = 3768;BA.debugLine="dtID = dtID.tolowercase";
_dtid = _dtid.toLowerCase();
 //BA.debugLineNum = 3769;BA.debugLine="Dim dtList As VMList";
_dtlist = new b4j.example.vmlist();
 //BA.debugLineNum = 3770;BA.debugLine="dtList.Initialize(vue, dtID, EventHandler)";
_dtlist._initialize /*b4j.example.vmlist*/ (ba,_vue,_dtid,_eventhandler);
 //BA.debugLineNum = 3771;BA.debugLine="dtList.SetDense(True)";
_dtlist._setdense /*b4j.example.vmlist*/ (__c.True);
 //BA.debugLineNum = 3773;BA.debugLine="Dim vlig As VMListItemGroup";
_vlig = new b4j.example.vmlistitemgroup();
 //BA.debugLineNum = 3774;BA.debugLine="vlig.Initialize(vue, $\"${dtID}lig\"$, EventHandler";
_vlig._initialize /*b4j.example.vmlistitemgroup*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_dtid))+"lig"),_eventhandler);
 //BA.debugLineNum = 3775;BA.debugLine="vlig.SetVModel(dtTarget)";
_vlig._setvmodel /*b4j.example.vmlistitemgroup*/ (_dttarget);
 //BA.debugLineNum = 3776;BA.debugLine="vlig.SetAttrLoose(\"multiple\")";
_vlig._setattrloose /*b4j.example.vmlistitemgroup*/ ("multiple");
 //BA.debugLineNum = 3777;BA.debugLine="vlig.SetOnChange($\"${dtID}_check\"$)";
_vlig._setonchange /*b4j.example.vmlistitemgroup*/ ((""+__c.SmartStringFormatter("",(Object)(_dtid))+"_check"));
 //BA.debugLineNum = 3779;BA.debugLine="Dim dtLI As VMListItem";
_dtli = new b4j.example.vmlistitem();
 //BA.debugLineNum = 3780;BA.debugLine="dtLI.Initialize(vue, \"\", EventHandler)";
_dtli._initialize /*b4j.example.vmlistitem*/ (ba,_vue,"",_eventhandler);
 //BA.debugLineNum = 3781;BA.debugLine="dtLI.SetAttrSingle(\"v-for\", $\"(item, index) in ${";
_dtli._setattrsingle /*b4j.example.vmlistitem*/ ("v-for",("(item, index) in "+__c.SmartStringFormatter("",(Object)(_dtsource))+""));
 //BA.debugLineNum = 3782;BA.debugLine="dtLI.SetAttrSingle(\":key\", $\"item.${dtKey}\"$)";
_dtli._setattrsingle /*b4j.example.vmlistitem*/ (":key",("item."+__c.SmartStringFormatter("",(Object)(_dtkey))+""));
 //BA.debugLineNum = 3783;BA.debugLine="dtLI.SetAttrSingle(\":value\", $\"item.${dtKey}\"$)";
_dtli._setattrsingle /*b4j.example.vmlistitem*/ (":value",("item."+__c.SmartStringFormatter("",(Object)(_dtkey))+""));
 //BA.debugLineNum = 3785;BA.debugLine="Dim tmpx As VMTemplate";
_tmpx = new b4j.example.vmtemplate();
 //BA.debugLineNum = 3786;BA.debugLine="tmpx.Initialize(vue, \"\", EventHandler)";
_tmpx._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",_eventhandler);
 //BA.debugLineNum = 3787;BA.debugLine="tmpx.SetAttrSingle(\"v-slot:default\", \"{ active, t";
_tmpx._setattrsingle /*b4j.example.vmtemplate*/ ("v-slot:default","{ active, toggle }");
 //BA.debugLineNum = 3789;BA.debugLine="Dim vlia As VMListItemAction";
_vlia = new b4j.example.vmlistitemaction();
 //BA.debugLineNum = 3790;BA.debugLine="vlia.Initialize(vue, \"\", EventHandler)";
_vlia._initialize /*b4j.example.vmlistitemaction*/ (ba,_vue,"",_eventhandler);
 //BA.debugLineNum = 3792;BA.debugLine="Dim vliacb As VMCheckBox";
_vliacb = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 3793;BA.debugLine="vliacb.Initialize(vue, \"\", EventHandler)";
_vliacb._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,"",_eventhandler);
 //BA.debugLineNum = 3794;BA.debugLine="vliacb.SetAttrSingle(\":input-value\", \"active\")";
_vliacb._setattrsingle /*b4j.example.vmcheckbox*/ (":input-value","active");
 //BA.debugLineNum = 3795;BA.debugLine="vliacb.SetAttrSingle(\":key\", $\"item.${dtKey}\"$)";
_vliacb._setattrsingle /*b4j.example.vmcheckbox*/ (":key",("item."+__c.SmartStringFormatter("",(Object)(_dtkey))+""));
 //BA.debugLineNum = 3796;BA.debugLine="vliacb.SetAttrSingle(\":true-value\", $\"item.${dtKe";
_vliacb._setattrsingle /*b4j.example.vmcheckbox*/ (":true-value",("item."+__c.SmartStringFormatter("",(Object)(_dtkey))+""));
 //BA.debugLineNum = 3797;BA.debugLine="vliacb.SetColor(\"primary\")";
_vliacb._setcolor /*b4j.example.vmcheckbox*/ ("primary");
 //BA.debugLineNum = 3798;BA.debugLine="vliacb.SetDense(True)";
_vliacb._setdense /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 3799;BA.debugLine="vliacb.SetAttrSingle(\"@click\", \"toggle\")";
_vliacb._setattrsingle /*b4j.example.vmcheckbox*/ ("@click","toggle");
 //BA.debugLineNum = 3802;BA.debugLine="vlia.AddComponent(vliacb.tostring)";
_vlia._addcomponent /*b4j.example.vmlistitemaction*/ (_vliacb._tostring /*String*/ ());
 //BA.debugLineNum = 3803;BA.debugLine="tmpx.AddComponent(vlia.ToString)";
_tmpx._addcomponent /*b4j.example.vmtemplate*/ (_vlia._tostring /*String*/ ());
 //BA.debugLineNum = 3806;BA.debugLine="Dim vlic As VMListItemContent";
_vlic = new b4j.example.vmlistitemcontent();
 //BA.debugLineNum = 3807;BA.debugLine="vlic.Initialize(vue, \"\", EventHandler)";
_vlic._initialize /*b4j.example.vmlistitemcontent*/ (ba,_vue,"",_eventhandler);
 //BA.debugLineNum = 3808;BA.debugLine="Dim vlit As VMListItemTitle";
_vlit = new b4j.example.vmlistitemtitle();
 //BA.debugLineNum = 3809;BA.debugLine="vlit.Initialize(vue, \"\", EventHandler)";
_vlit._initialize /*b4j.example.vmlistitemtitle*/ (ba,_vue,"",_eventhandler);
 //BA.debugLineNum = 3810;BA.debugLine="vlit.SetVText($\"item.${dtTitle}\"$)";
_vlit._setvtext /*b4j.example.vmlistitemtitle*/ (("item."+__c.SmartStringFormatter("",(Object)(_dttitle))+""));
 //BA.debugLineNum = 3811;BA.debugLine="vlic.AddComponent(vlit.ToString)";
_vlic._addcomponent /*b4j.example.vmlistitemcontent*/ (_vlit._tostring /*String*/ ());
 //BA.debugLineNum = 3813;BA.debugLine="tmpx.AddComponent(vlic.ToString)";
_tmpx._addcomponent /*b4j.example.vmtemplate*/ (_vlic._tostring /*String*/ ());
 //BA.debugLineNum = 3814;BA.debugLine="dtLI.AddComponent(tmpx.tostring)";
_dtli._addcomponent /*b4j.example.vmlistitem*/ (_tmpx._tostring /*String*/ ());
 //BA.debugLineNum = 3816;BA.debugLine="vlig.AddComponent(dtLI.ToString)";
_vlig._addcomponent /*b4j.example.vmlistitemgroup*/ (_dtli._tostring /*String*/ ());
 //BA.debugLineNum = 3818;BA.debugLine="dtList.AddComponent(vlig.tostring)";
_dtlist._addcomponent /*b4j.example.vmlist*/ (_vlig._tostring /*String*/ ());
 //BA.debugLineNum = 3819;BA.debugLine="Return dtList";
if (true) return _dtlist;
 //BA.debugLineNum = 3820;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmoverlay  _createoverlay(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmoverlay _el = null;
 //BA.debugLineNum = 2984;BA.debugLine="Sub CreateOverlay(sid As String, moduleObj As Obje";
 //BA.debugLineNum = 2985;BA.debugLine="Dim el As VMOverlay";
_el = new b4j.example.vmoverlay();
 //BA.debugLineNum = 2986;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmoverlay*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 2987;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2988;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createowncomponent(String _id,String _compname) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 2119;BA.debugLine="Sub CreateOwnComponent(id As String, compName As S";
 //BA.debugLineNum = 2120;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 2121;BA.debugLine="elx.Initialize(vue, id).SetTag(compName)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ (_compname);
 //BA.debugLineNum = 2122;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 2123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpagination  _createpagination(String _cid,Object _eventhandler) throws Exception{
b4j.example.vmpagination _el = null;
 //BA.debugLineNum = 1451;BA.debugLine="Sub CreatePagination(cID As String, eventHandler A";
 //BA.debugLineNum = 1452;BA.debugLine="Dim el As VMPagination";
_el = new b4j.example.vmpagination();
 //BA.debugLineNum = 1453;BA.debugLine="el.Initialize(vue, cID, eventHandler)";
_el._initialize /*b4j.example.vmpagination*/ (ba,_vue,_cid,_eventhandler);
 //BA.debugLineNum = 1454;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1455;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _createparagraph(String _id) throws Exception{
b4j.example.vmlabel _elx = null;
 //BA.debugLineNum = 3852;BA.debugLine="Sub CreateParagraph(id As String) As VMLabel";
 //BA.debugLineNum = 3853;BA.debugLine="Dim elx As VMLabel = CreateLabel(id).SetParagraph";
_elx = _createlabel(_id)._setparagraph /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 3854;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 3855;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _createparallax(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmparallax _el = null;
 //BA.debugLineNum = 1338;BA.debugLine="Sub CreateParallax(eID As String, eventHandler As";
 //BA.debugLineNum = 1339;BA.debugLine="Dim el As VMParallax";
_el = new b4j.example.vmparallax();
 //BA.debugLineNum = 1340;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmparallax*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1341;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1342;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _createplaceholder() throws Exception{
String _skey = "";
b4j.example.vmlabel _lbl = null;
 //BA.debugLineNum = 1222;BA.debugLine="Sub CreatePlaceholder() As VMLabel";
 //BA.debugLineNum = 1223;BA.debugLine="placeHolder = placeHolder + 1";
_placeholder = (int) (_placeholder+1);
 //BA.debugLineNum = 1224;BA.debugLine="Dim sKey As String = $\"placeholder${placeHolder}\"";
_skey = ("placeholder"+__c.SmartStringFormatter("",(Object)(_placeholder))+"");
 //BA.debugLineNum = 1225;BA.debugLine="Dim lbl As VMLabel = CreateLabel(sKey).SetText(\"P";
_lbl = _createlabel(_skey)._settext /*b4j.example.vmlabel*/ ("Placeholder")._setvisible /*b4j.example.vmlabel*/ (__c.False)._setparagraph /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 1226;BA.debugLine="Return lbl";
if (true) return _lbl;
 //BA.debugLineNum = 1227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _createprogresscircular(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmprogresscircular _el = null;
 //BA.debugLineNum = 1490;BA.debugLine="Sub CreateProgressCircular(sid As String, eventHan";
 //BA.debugLineNum = 1491;BA.debugLine="Dim el As VMProgressCircular";
_el = new b4j.example.vmprogresscircular();
 //BA.debugLineNum = 1492;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmprogresscircular*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1493;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1494;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _createprogresslinear(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmprogresslinear _el = null;
 //BA.debugLineNum = 1496;BA.debugLine="Sub CreateProgressLinear(sid As String, eventHandl";
 //BA.debugLineNum = 1497;BA.debugLine="Dim el As VMProgressLinear";
_el = new b4j.example.vmprogresslinear();
 //BA.debugLineNum = 1498;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmprogresslinear*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1499;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1500;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _createproperty(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmproperty _el = null;
 //BA.debugLineNum = 1395;BA.debugLine="Sub CreateProperty(eID As String, eventHandler As";
 //BA.debugLineNum = 1396;BA.debugLine="Dim el As VMProperty";
_el = new b4j.example.vmproperty();
 //BA.debugLineNum = 1397;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmproperty*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1398;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1399;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _createradio(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmradio _el = null;
 //BA.debugLineNum = 2866;BA.debugLine="Sub CreateRadio(sid As String, eventHandler As Obj";
 //BA.debugLineNum = 2867;BA.debugLine="Dim el As VMRadio";
_el = new b4j.example.vmradio();
 //BA.debugLineNum = 2868;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmradio*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2870;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2871;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _createradiogroup(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmradiogroup _el = null;
 //BA.debugLineNum = 2939;BA.debugLine="Sub CreateRadioGroup(sid As String, eventHandler A";
 //BA.debugLineNum = 2940;BA.debugLine="Dim el As VMRadioGroup";
_el = new b4j.example.vmradiogroup();
 //BA.debugLineNum = 2941;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmradiogroup*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2942;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2943;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrating  _createrating(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmrating _el = null;
 //BA.debugLineNum = 1418;BA.debugLine="Sub CreateRating(eID As String, eventHandler As Ob";
 //BA.debugLineNum = 1419;BA.debugLine="Dim el As VMRating";
_el = new b4j.example.vmrating();
 //BA.debugLineNum = 1420;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmrating*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1421;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1422;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createrouterlink(String _rid,String _rto,String _text) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2267;BA.debugLine="Sub CreateRouterLink(rID As String, rTo As String,";
 //BA.debugLineNum = 2268;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2269;BA.debugLine="el.Initialize(vue,rID).SetTag(\"router-link\").SetT";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_rid)._settag /*b4j.example.vmelement*/ ("router-link")._setto /*b4j.example.vmelement*/ (_rto)._settext /*b4j.example.vmelement*/ (_text);
 //BA.debugLineNum = 2270;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createrouterview(String _rid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2273;BA.debugLine="Sub CreateRouterView(rID As String) As VMElement";
 //BA.debugLineNum = 2274;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2275;BA.debugLine="el.Initialize(vue,rID).SetTag(\"router-view\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_rid)._settag /*b4j.example.vmelement*/ ("router-view");
 //BA.debugLineNum = 2277;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2278;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _createselect(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 2994;BA.debugLine="Sub CreateSelect(sid As String, eventHandler As Ob";
 //BA.debugLineNum = 2995;BA.debugLine="Dim el As VMSelect";
_el = new b4j.example.vmselect();
 //BA.debugLineNum = 2996;BA.debugLine="el.Initialize(vue,sid,eventHandler)";
_el._initialize /*b4j.example.vmselect*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2998;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2999;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _createsheet(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmsheet _el = null;
 //BA.debugLineNum = 2788;BA.debugLine="Sub CreateSheet(sid As String, eventHandler As Obj";
 //BA.debugLineNum = 2789;BA.debugLine="Dim el As VMSheet";
_el = new b4j.example.vmsheet();
 //BA.debugLineNum = 2790;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmsheet*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2791;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2792;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _createskeletonloader(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmskeletonloader _el = null;
 //BA.debugLineNum = 1425;BA.debugLine="Sub CreateSkeletonLoader(eID As String, eventHandl";
 //BA.debugLineNum = 1426;BA.debugLine="Dim el As VMSkeletonLoader";
_el = new b4j.example.vmskeletonloader();
 //BA.debugLineNum = 1427;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmskeletonloader*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1428;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1429;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _createslidegroup(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmslidegroup _el = null;
 //BA.debugLineNum = 2952;BA.debugLine="Sub CreateSlideGroup(sid As String, moduleObj As O";
 //BA.debugLineNum = 2953;BA.debugLine="Dim el As VMSlideGroup";
_el = new b4j.example.vmslidegroup();
 //BA.debugLineNum = 2954;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmslidegroup*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 2955;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2956;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslideitem  _createslideitem(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmslideitem _el = null;
 //BA.debugLineNum = 1318;BA.debugLine="Sub CreateSlideItem(eID As String, eventHandler As";
 //BA.debugLineNum = 1319;BA.debugLine="Dim el As VMSlideItem";
_el = new b4j.example.vmslideitem();
 //BA.debugLineNum = 1320;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmslideitem*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1321;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1322;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _createslider(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmslider _el = null;
 //BA.debugLineNum = 2489;BA.debugLine="Sub CreateSlider(sid As String, eventHandler As Ob";
 //BA.debugLineNum = 2490;BA.debugLine="Dim el As VMSlider";
_el = new b4j.example.vmslider();
 //BA.debugLineNum = 2491;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmslider*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2492;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2493;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _createsnackbar(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmsnackbar _el = null;
 //BA.debugLineNum = 2756;BA.debugLine="Sub CreateSnackBar(sid As String, eventHandler As";
 //BA.debugLineNum = 2757;BA.debugLine="Dim el As VMSnackBar";
_el = new b4j.example.vmsnackbar();
 //BA.debugLineNum = 2758;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmsnackbar*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2760;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2761;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createspan(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2885;BA.debugLine="Sub CreateSpan(sid As String) As VMElement";
 //BA.debugLineNum = 2886;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2887;BA.debugLine="el.Initialize(vue,sid).SetTag(\"span\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 2889;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2890;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsparkline  _createsparkline(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmsparkline _el = null;
 //BA.debugLineNum = 2238;BA.debugLine="Sub CreateSparkLine(sid As String, moduleObj As Ob";
 //BA.debugLineNum = 2239;BA.debugLine="Dim el As VMSparkLine";
_el = new b4j.example.vmsparkline();
 //BA.debugLineNum = 2240;BA.debugLine="el.Initialize(vue,sid, moduleObj)";
_el._initialize /*b4j.example.vmsparkline*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 2241;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2242;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _createspeeddial(String _sid,Object _eventhandler,String _initialicon,String _finalicon) throws Exception{
b4j.example.vmspeeddial _el = null;
 //BA.debugLineNum = 2837;BA.debugLine="Sub CreateSpeedDial(sid As String, eventHandler As";
 //BA.debugLineNum = 2838;BA.debugLine="Dim el As VMSpeedDial";
_el = new b4j.example.vmspeeddial();
 //BA.debugLineNum = 2839;BA.debugLine="el.Initialize(vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmspeeddial*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2840;BA.debugLine="el.SetInitialIcon(initialIcon)";
_el._setinitialicon /*b4j.example.vmspeeddial*/ (_initialicon);
 //BA.debugLineNum = 2841;BA.debugLine="el.SetFinalIcon(finalIcon)";
_el._setfinalicon /*b4j.example.vmspeeddial*/ (_finalicon);
 //BA.debugLineNum = 2842;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2843;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _createstepper(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmstepper _el = null;
 //BA.debugLineNum = 2553;BA.debugLine="Sub CreateStepper(sid As String, eventHandler As O";
 //BA.debugLineNum = 2554;BA.debugLine="Dim el As VMStepper";
_el = new b4j.example.vmstepper();
 //BA.debugLineNum = 2555;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmstepper*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2556;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2557;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _createswitch(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmcheckbox _el = null;
 //BA.debugLineNum = 2507;BA.debugLine="Sub CreateSwitch(sid As String, eventHandler As Ob";
 //BA.debugLineNum = 2508;BA.debugLine="Dim el As VMCheckBox";
_el = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 2509;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2510;BA.debugLine="el.SetSwitch";
_el._setswitch /*b4j.example.vmcheckbox*/ ();
 //BA.debugLineNum = 2511;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2512;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _createsystembar(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmtoolbar _el = null;
 //BA.debugLineNum = 2959;BA.debugLine="Sub CreateSystemBar(sid As String, moduleObj As Ob";
 //BA.debugLineNum = 2960;BA.debugLine="Dim el As VMToolBar";
_el = new b4j.example.vmtoolbar();
 //BA.debugLineNum = 2961;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmtoolbar*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 2962;BA.debugLine="el.SetSystemBar(True)";
_el._setsystembar /*b4j.example.vmtoolbar*/ (__c.True);
 //BA.debugLineNum = 2963;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2964;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _createtab(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmtab _el = null;
 //BA.debugLineNum = 2501;BA.debugLine="Sub CreateTab(sid As String, eventHandler As Objec";
 //BA.debugLineNum = 2502;BA.debugLine="Dim el As VMTab";
_el = new b4j.example.vmtab();
 //BA.debugLineNum = 2503;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmtab*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2504;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2505;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _createtabs(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmtabs _el = null;
 //BA.debugLineNum = 2495;BA.debugLine="Sub CreateTabs(sid As String, eventHandler As Obje";
 //BA.debugLineNum = 2496;BA.debugLine="Dim el As VMTabs";
_el = new b4j.example.vmtabs();
 //BA.debugLineNum = 2497;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmtabs*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2498;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2499;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createtag(String _id,String _tag) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2287;BA.debugLine="Sub CreateTag(id As String, tag As String) As VMEl";
 //BA.debugLineNum = 2288;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2289;BA.debugLine="el.Initialize(vue,id).SetTag(tag)";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ (_tag);
 //BA.debugLineNum = 2291;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2292;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _createtemplate(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmtemplate _el = null;
 //BA.debugLineNum = 2382;BA.debugLine="Sub CreateTemplate(sid As String, eventHandler As";
 //BA.debugLineNum = 2383;BA.debugLine="Dim el As VMTemplate";
_el = new b4j.example.vmtemplate();
 //BA.debugLineNum = 2384;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmtemplate*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2385;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2386;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _createtextarea(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmtextfield _el = null;
 //BA.debugLineNum = 1387;BA.debugLine="Sub CreateTextArea(eID As String, eventHandler As";
 //BA.debugLineNum = 1388;BA.debugLine="Dim el As VMTextField";
_el = new b4j.example.vmtextfield();
 //BA.debugLineNum = 1389;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmtextfield*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1390;BA.debugLine="el.SetTextArea";
_el._settextarea /*b4j.example.vmtextfield*/ ();
 //BA.debugLineNum = 1391;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1392;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _createtextfield(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmtextfield _el = null;
 //BA.debugLineNum = 2813;BA.debugLine="Sub CreateTextField(sid As String, eventHandler As";
 //BA.debugLineNum = 2814;BA.debugLine="Dim el As VMTextField";
_el = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2815;BA.debugLine="el.Initialize(vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmtextfield*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 2816;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2817;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _createtimepicker(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmdatetimepicker _el = null;
 //BA.debugLineNum = 1374;BA.debugLine="Sub CreateTimePicker(eID As String, eventHandler A";
 //BA.debugLineNum = 1375;BA.debugLine="Dim el As VMDateTimePicker";
_el = new b4j.example.vmdatetimepicker();
 //BA.debugLineNum = 1376;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmdatetimepicker*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1377;BA.debugLine="el.SetTimePicker";
_el._settimepicker /*b4j.example.vmdatetimepicker*/ ();
 //BA.debugLineNum = 1378;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _createtoolbar(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmtoolbar _el = null;
 //BA.debugLineNum = 2970;BA.debugLine="Sub CreateToolbar(sid As String, moduleObj As Obje";
 //BA.debugLineNum = 2971;BA.debugLine="Dim el As VMToolBar";
_el = new b4j.example.vmtoolbar();
 //BA.debugLineNum = 2972;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmtoolbar*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 2973;BA.debugLine="el.SetToolBar(True)";
_el._settoolbar /*b4j.example.vmtoolbar*/ (__c.True);
 //BA.debugLineNum = 2974;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2975;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbartitle  _createtoolbartitle(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmtoolbartitle _el = null;
 //BA.debugLineNum = 2977;BA.debugLine="Sub CreateToolbarTitle(sid As String, moduleObj As";
 //BA.debugLineNum = 2978;BA.debugLine="Dim el As VMToolbarTitle";
_el = new b4j.example.vmtoolbartitle();
 //BA.debugLineNum = 2979;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmtoolbartitle*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 2980;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2981;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _createtreeview(String _cid,Object _eventhandler) throws Exception{
b4j.example.vmtreeview _el = null;
 //BA.debugLineNum = 1462;BA.debugLine="Sub CreateTreeView(cID As String, eventHandler As";
 //BA.debugLineNum = 1463;BA.debugLine="Dim el As VMTreeView";
_el = new b4j.example.vmtreeview();
 //BA.debugLineNum = 1464;BA.debugLine="el.Initialize(vue, cID, eventHandler)";
_el._initialize /*b4j.example.vmtreeview*/ (ba,_vue,_cid,_eventhandler);
 //BA.debugLineNum = 1465;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1466;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _createwindow(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmwindow _el = null;
 //BA.debugLineNum = 1305;BA.debugLine="Sub CreateWindow(eID As String, eventHandler As Ob";
 //BA.debugLineNum = 1306;BA.debugLine="Dim el As VMWindow";
_el = new b4j.example.vmwindow();
 //BA.debugLineNum = 1307;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmwindow*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1308;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1309;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _createwindowitem(String _eid,Object _eventhandler) throws Exception{
b4j.example.vmwindowitem _el = null;
 //BA.debugLineNum = 1311;BA.debugLine="Sub CreateWindowItem(eID As String, eventHandler A";
 //BA.debugLineNum = 1312;BA.debugLine="Dim el As VMWindowItem";
_el = new b4j.example.vmwindowitem();
 //BA.debugLineNum = 1313;BA.debugLine="el.Initialize(vue, eID, eventHandler)";
_el._initialize /*b4j.example.vmwindowitem*/ (ba,_vue,_eid,_eventhandler);
 //BA.debugLineNum = 1314;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1315;BA.debugLine="End Sub";
return null;
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 1856;BA.debugLine="Sub CStr(o As Object) As String";
 //BA.debugLineNum = 1857;BA.debugLine="Return vue.CStr(o)";
if (true) return _vue._cstr /*String*/ (_o);
 //BA.debugLineNum = 1858;BA.debugLine="End Sub";
return "";
}
public String  _dateadd(String _mdate,int _howmanydays) throws Exception{
 //BA.debugLineNum = 1802;BA.debugLine="Sub DateAdd(mDate As String, HowManyDays As Int) A";
 //BA.debugLineNum = 1803;BA.debugLine="Return vue.DateAdd(mDate, HowManyDays)";
if (true) return _vue._dateadd /*String*/ (_mdate,_howmanydays);
 //BA.debugLineNum = 1804;BA.debugLine="End Sub";
return "";
}
public String  _datenow() throws Exception{
 //BA.debugLineNum = 3001;BA.debugLine="Public Sub DateNow() As String";
 //BA.debugLineNum = 3002;BA.debugLine="Return vue.DateNow";
if (true) return _vue._datenow /*String*/ ();
 //BA.debugLineNum = 3003;BA.debugLine="End Sub";
return "";
}
public String  _datetimenow() throws Exception{
 //BA.debugLineNum = 3009;BA.debugLine="Public Sub DateTimeNow() As String";
 //BA.debugLineNum = 3010;BA.debugLine="Return vue.DateTimeNow";
if (true) return _vue._datetimenow /*String*/ ();
 //BA.debugLineNum = 3011;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _decrement(String _elid,int _valueof) throws Exception{
int _oldv = 0;
 //BA.debugLineNum = 1567;BA.debugLine="Sub Decrement(elID As String, valueOf As Int) As B";
 //BA.debugLineNum = 1568;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 1569;BA.debugLine="Dim oldv As Int = vue.GetState(elID,0)";
_oldv = (int)(BA.ObjectToNumber(_vue._getstate /*Object*/ (_elid,(Object)(0))));
 //BA.debugLineNum = 1570;BA.debugLine="oldv = BANano.parseInt(oldv) - valueOf";
_oldv = (int) (_banano.parseInt((Object)(_oldv))-_valueof);
 //BA.debugLineNum = 1571;BA.debugLine="vue.SetStateSingle(elID, oldv)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_elid,(Object)(_oldv));
 //BA.debugLineNum = 1572;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1573;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _decrementbadge(String _elid,int _counted) throws Exception{
String _badvalue = "";
String _lastvalue = "";
int _intlast = 0;
 //BA.debugLineNum = 2203;BA.debugLine="Sub DecrementBadge(elID As String, counted As Int)";
 //BA.debugLineNum = 2204;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 2205;BA.debugLine="Dim badValue As String = $\"${elID}badgecontent\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"badgecontent");
 //BA.debugLineNum = 2206;BA.debugLine="Dim lastValue As String = vue.GetState(badValue,";
_lastvalue = BA.ObjectToString(_vue._getstate /*Object*/ (_badvalue,(Object)("0")));
 //BA.debugLineNum = 2207;BA.debugLine="Dim intLast As Int = BANano.parseInt(lastValue)";
_intlast = _banano.parseInt((Object)(_lastvalue));
 //BA.debugLineNum = 2208;BA.debugLine="intLast = intLast - counted";
_intlast = (int) (_intlast-_counted);
 //BA.debugLineNum = 2209;BA.debugLine="vue.SetStateSingle(badValue, intLast)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_badvalue,(Object)(_intlast));
 //BA.debugLineNum = 2210;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2211;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _decrementto(String _elid,int _valueof,int _limitto) throws Exception{
int _oldv = 0;
 //BA.debugLineNum = 1576;BA.debugLine="Sub DecrementTo(elID As String, valueOf As Int, Li";
 //BA.debugLineNum = 1577;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 1578;BA.debugLine="Dim oldv As Int = vue.GetState(elID,0)";
_oldv = (int)(BA.ObjectToNumber(_vue._getstate /*Object*/ (_elid,(Object)(0))));
 //BA.debugLineNum = 1579;BA.debugLine="oldv = BANano.parseInt(oldv) - valueOf";
_oldv = (int) (_banano.parseInt((Object)(_oldv))-_valueof);
 //BA.debugLineNum = 1580;BA.debugLine="If oldv <= 0 Then oldv = LimitTo";
if (_oldv<=0) { 
_oldv = _limitto;};
 //BA.debugLineNum = 1581;BA.debugLine="vue.SetStateSingle(elID, oldv)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_elid,(Object)(_oldv));
 //BA.debugLineNum = 1582;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1583;BA.debugLine="End Sub";
return null;
}
public String  _disable(String _elid) throws Exception{
 //BA.debugLineNum = 1782;BA.debugLine="Sub Disable(elID As String)";
 //BA.debugLineNum = 1783;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 1784;BA.debugLine="vue.SetStateSingle($\"${elID}disabled\"$, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"disabled"),(Object)(__c.True));
 //BA.debugLineNum = 1785;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _div(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 467;BA.debugLine="Sub Div(elID As String) As VMElement";
 //BA.debugLineNum = 468;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 469;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 470;BA.debugLine="elx.SetTag(\"div\")";
_elx._settag /*b4j.example.vmelement*/ ("div");
 //BA.debugLineNum = 471;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 472;BA.debugLine="End Sub";
return null;
}
public String  _enable(String _elid) throws Exception{
 //BA.debugLineNum = 1777;BA.debugLine="Sub Enable(elID As String)";
 //BA.debugLineNum = 1778;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 1779;BA.debugLine="vue.SetStateSingle($\"${elID}disabled\"$, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"disabled"),(Object)(__c.False));
 //BA.debugLineNum = 1780;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _eqoperators(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 1824;BA.debugLine="Sub EQOperators(sm As Map) As List";
 //BA.debugLineNum = 1825;BA.debugLine="Return vue.EQOperators(sm)";
if (true) return _vue._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (_sm);
 //BA.debugLineNum = 1826;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _extractmap(anywheresoftware.b4a.objects.collections.Map _source,anywheresoftware.b4a.objects.collections.List _keys) throws Exception{
 //BA.debugLineNum = 1829;BA.debugLine="Sub ExtractMap(source As Map, keys As List) As Map";
 //BA.debugLineNum = 1830;BA.debugLine="Return vue.ExtractMap(source, keys)";
if (true) return _vue._extractmap /*anywheresoftware.b4a.objects.collections.Map*/ (_source,_keys);
 //BA.debugLineNum = 1831;BA.debugLine="End Sub";
return null;
}
public String  _fileicon(String _ext) throws Exception{
anywheresoftware.b4a.objects.collections.Map _extm = null;
String _res = "";
 //BA.debugLineNum = 3737;BA.debugLine="Sub FileIcon(ext As String) As String";
 //BA.debugLineNum = 3738;BA.debugLine="Dim extm As Map = CreateMap()";
_extm = new anywheresoftware.b4a.objects.collections.Map();
_extm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 3739;BA.debugLine="extm.Put(\"html\", \"mdi-language-html5\")";
_extm.Put((Object)("html"),(Object)("mdi-language-html5"));
 //BA.debugLineNum = 3740;BA.debugLine="extm.Put(\"js\", \"mdi-nodejs\")";
_extm.Put((Object)("js"),(Object)("mdi-nodejs"));
 //BA.debugLineNum = 3741;BA.debugLine="extm.Put(\"json\", \"mdi-code-json\")";
_extm.Put((Object)("json"),(Object)("mdi-code-json"));
 //BA.debugLineNum = 3742;BA.debugLine="extm.Put(\"md\", \"mdi-markdown\")";
_extm.Put((Object)("md"),(Object)("mdi-markdown"));
 //BA.debugLineNum = 3743;BA.debugLine="extm.Put(\"pdf\", \"mdi-file-pdf\")";
_extm.Put((Object)("pdf"),(Object)("mdi-file-pdf"));
 //BA.debugLineNum = 3744;BA.debugLine="extm.Put(\"png\", \"mdi-file-image\")";
_extm.Put((Object)("png"),(Object)("mdi-file-image"));
 //BA.debugLineNum = 3745;BA.debugLine="extm.Put(\"txt\", \"mdi-file-document-outline\")";
_extm.Put((Object)("txt"),(Object)("mdi-file-document-outline"));
 //BA.debugLineNum = 3746;BA.debugLine="extm.Put(\"xls\", \"mdi-file-excel\")";
_extm.Put((Object)("xls"),(Object)("mdi-file-excel"));
 //BA.debugLineNum = 3747;BA.debugLine="extm.Put(\"csv\", \"mdi-file-delimited-outline\")";
_extm.Put((Object)("csv"),(Object)("mdi-file-delimited-outline"));
 //BA.debugLineNum = 3748;BA.debugLine="extm.Put(\"pre\", \"mdi-file-code-outline\")";
_extm.Put((Object)("pre"),(Object)("mdi-file-code-outline"));
 //BA.debugLineNum = 3749;BA.debugLine="extm.Put(\"code\", \"mdi-file-code-outline\")";
_extm.Put((Object)("code"),(Object)("mdi-file-code-outline"));
 //BA.debugLineNum = 3750;BA.debugLine="extm.Put(\"doc\", \"mdi-file-word-box-outline\")";
_extm.Put((Object)("doc"),(Object)("mdi-file-word-box-outline"));
 //BA.debugLineNum = 3751;BA.debugLine="extm.Put(\"mp3\", \"mdi-file-music-outline\")";
_extm.Put((Object)("mp3"),(Object)("mdi-file-music-outline"));
 //BA.debugLineNum = 3752;BA.debugLine="extm.Put(\"folder\", \"mdi-folder\")";
_extm.Put((Object)("folder"),(Object)("mdi-folder"));
 //BA.debugLineNum = 3753;BA.debugLine="extm.Put(\"woff\", \"marketweb-webfont.woff\")";
_extm.Put((Object)("woff"),(Object)("marketweb-webfont.woff"));
 //BA.debugLineNum = 3754;BA.debugLine="extm.Put(\"css\", \"mdi-language-css3\")";
_extm.Put((Object)("css"),(Object)("mdi-language-css3"));
 //BA.debugLineNum = 3756;BA.debugLine="ext = ext.ToLowerCase";
_ext = _ext.toLowerCase();
 //BA.debugLineNum = 3757;BA.debugLine="If extm.ContainsKey(ext) Then";
if (_extm.ContainsKey((Object)(_ext))) { 
 //BA.debugLineNum = 3758;BA.debugLine="Dim res As String = extm.Get(ext)";
_res = BA.ObjectToString(_extm.Get((Object)(_ext)));
 //BA.debugLineNum = 3759;BA.debugLine="Return res";
if (true) return _res;
 }else {
 //BA.debugLineNum = 3761;BA.debugLine="Return \"mdi-file-document-outline\"";
if (true) return "mdi-file-document-outline";
 };
 //BA.debugLineNum = 3763;BA.debugLine="End Sub";
return "";
}
public String  _fixrecords(anywheresoftware.b4a.objects.collections.List _recs,anywheresoftware.b4a.objects.collections.List _trimthese,anywheresoftware.b4a.objects.collections.List _numthese,anywheresoftware.b4a.objects.collections.List _boolthese,anywheresoftware.b4a.objects.collections.List _datethese,anywheresoftware.b4a.objects.collections.List _dblthese) throws Exception{
 //BA.debugLineNum = 2605;BA.debugLine="Sub FixRecords(recs As List, trimThese As List, nu";
 //BA.debugLineNum = 2606;BA.debugLine="vue.FixRecords(recs, trimThese, numThese, boolThe";
_vue._fixrecords /*String*/ (_recs,_trimthese,_numthese,_boolthese,_datethese,_dblthese);
 //BA.debugLineNum = 2607;BA.debugLine="End Sub";
return "";
}
public String  _fixrecordsusedesign(anywheresoftware.b4a.objects.collections.List _recs,b4j.example.vmcontainer _design) throws Exception{
 //BA.debugLineNum = 1676;BA.debugLine="Sub FixRecordsUseDesign(recs As List, design As VM";
 //BA.debugLineNum = 1677;BA.debugLine="vue.FixRecords(recs, design.Strings, design.Integ";
_vue._fixrecords /*String*/ (_recs,_design._strings /*anywheresoftware.b4a.objects.collections.List*/ ,_design._integers /*anywheresoftware.b4a.objects.collections.List*/ ,_design._booleans /*anywheresoftware.b4a.objects.collections.List*/ ,_design._dates /*anywheresoftware.b4a.objects.collections.List*/ ,_design._doubles /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 1678;BA.debugLine="End Sub";
return "";
}
public String  _forceupdate() throws Exception{
 //BA.debugLineNum = 2485;BA.debugLine="Sub ForceUpdate";
 //BA.debugLineNum = 2486;BA.debugLine="vue.ForceUpdate";
_vue._forceupdate /*String*/ ();
 //BA.debugLineNum = 2487;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _form(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 617;BA.debugLine="Sub Form(elID As String) As VMElement";
 //BA.debugLineNum = 618;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 619;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 620;BA.debugLine="elx.SetTag(\"form\")";
_elx._settag /*b4j.example.vmelement*/ ("form");
 //BA.debugLineNum = 621;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 622;BA.debugLine="End Sub";
return null;
}
public String  _formreset(String _frmid) throws Exception{
 //BA.debugLineNum = 1062;BA.debugLine="Sub FormReset(frmID As String)";
 //BA.debugLineNum = 1063;BA.debugLine="frmID = frmID.tolowercase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 1064;BA.debugLine="vue.refs.GetField(frmID).RunMethod(\"reset\", Null)";
_vue._refs /*com.ab.banano.BANanoObject*/ .GetField(_frmid).RunMethod("reset",__c.Null);
 //BA.debugLineNum = 1065;BA.debugLine="End Sub";
return "";
}
public String  _formvalidate(String _frmid) throws Exception{
 //BA.debugLineNum = 1057;BA.debugLine="Sub FormValidate(frmID As String)";
 //BA.debugLineNum = 1058;BA.debugLine="frmID = frmID.tolowercase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 1059;BA.debugLine="vue.refs.GetField(frmID).RunMethod(\"validate\", Nu";
_vue._refs /*com.ab.banano.BANanoObject*/ .GetField(_frmid).RunMethod("validate",__c.Null);
 //BA.debugLineNum = 1060;BA.debugLine="End Sub";
return "";
}
public String  _getalert() throws Exception{
 //BA.debugLineNum = 2764;BA.debugLine="Sub GetAlert As String";
 //BA.debugLineNum = 2765;BA.debugLine="Return vue.getstate(\"alertkey\",\"\")";
if (true) return BA.ObjectToString(_vue._getstate /*Object*/ ("alertkey",(Object)("")));
 //BA.debugLineNum = 2766;BA.debugLine="End Sub";
return "";
}
public String  _getalphabets(String _value) throws Exception{
 //BA.debugLineNum = 1816;BA.debugLine="Public Sub GetAlphabets(value As String) As String";
 //BA.debugLineNum = 1817;BA.debugLine="Return vue.GetAlphabets(value)";
if (true) return _vue._getalphabets /*String*/ (_value);
 //BA.debugLineNum = 1818;BA.debugLine="End Sub";
return "";
}
public String  _getchipidfromevent(com.ab.banano.BANanoEvent _e) throws Exception{
anywheresoftware.b4a.objects.collections.List _spath = null;
anywheresoftware.b4a.objects.collections.Map _sitem = null;
String _sid = "";
 //BA.debugLineNum = 2220;BA.debugLine="Sub GetChipIDFromEvent(e As BANanoEvent) As String";
 //BA.debugLineNum = 2221;BA.debugLine="Try";
try { //BA.debugLineNum = 2222;BA.debugLine="Dim spath As List = e.OtherField(\"path\").Result";
_spath = new anywheresoftware.b4a.objects.collections.List();
_spath = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e.OtherField("path").Result()));
 //BA.debugLineNum = 2223;BA.debugLine="Dim sitem As Map = spath.get(5)";
_sitem = new anywheresoftware.b4a.objects.collections.Map();
_sitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_spath.Get((int) (5))));
 //BA.debugLineNum = 2224;BA.debugLine="Dim sid As String = sitem.get(\"id\")";
_sid = BA.ObjectToString(_sitem.Get((Object)("id")));
 //BA.debugLineNum = 2225;BA.debugLine="Return sid";
if (true) return _sid;
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 2227;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 //BA.debugLineNum = 2228;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 2230;BA.debugLine="End Sub";
return "";
}
public String  _getconfirm() throws Exception{
String _sproc = "";
 //BA.debugLineNum = 1265;BA.debugLine="Sub GetConfirm As String";
 //BA.debugLineNum = 1266;BA.debugLine="Dim sproc As String = vue.GetData(\"confirmkey\")";
_sproc = BA.ObjectToString(_vue._getdata /*Object*/ ("confirmkey"));
 //BA.debugLineNum = 1267;BA.debugLine="Return sproc";
if (true) return _sproc;
 //BA.debugLineNum = 1268;BA.debugLine="End Sub";
return "";
}
public Object  _getdata(String _prop) throws Exception{
Object _obj = null;
 //BA.debugLineNum = 2393;BA.debugLine="Sub GetData(prop As String) As Object";
 //BA.debugLineNum = 2394;BA.debugLine="Dim obj As Object = vue.GetState(prop, Null)";
_obj = _vue._getstate /*Object*/ (_prop,__c.Null);
 //BA.debugLineNum = 2395;BA.debugLine="Return obj";
if (true) return _obj;
 //BA.debugLineNum = 2396;BA.debugLine="End Sub";
return null;
}
public boolean  _getdisabledstate(String _k) throws Exception{
String _diskey = "";
 //BA.debugLineNum = 2571;BA.debugLine="Sub GetDisabledState(k As String) As Boolean";
 //BA.debugLineNum = 2572;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"disabled");
 //BA.debugLineNum = 2573;BA.debugLine="Return GetState(disKey,False)";
if (true) return BA.ObjectToBoolean(_getstate(_diskey,(Object)(__c.False)));
 //BA.debugLineNum = 2574;BA.debugLine="End Sub";
return false;
}
public com.ab.banano.BANanoObject  _getelementbyid(String _sid) throws Exception{
com.ab.banano.BANanoObject _el = null;
 //BA.debugLineNum = 1124;BA.debugLine="Sub getElementById(sid As String) As BANanoObject";
 //BA.debugLineNum = 1125;BA.debugLine="Dim el As BANanoObject = BANano.Window.GetField(\"";
_el = new com.ab.banano.BANanoObject();
_el = _banano.Window().GetField("document").RunMethod("getElementById",(Object)(new Object[]{(Object)(_sid)}));
 //BA.debugLineNum = 1126;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1127;BA.debugLine="End Sub";
return null;
}
public String  _geteventtargetproperty(com.ab.banano.BANanoEvent _e,String _prop) throws Exception{
 //BA.debugLineNum = 2432;BA.debugLine="Sub GetEventTargetProperty(e As BANanoEvent, prop";
 //BA.debugLineNum = 2433;BA.debugLine="Return vue.GetEventTargetProperty(e, prop)";
if (true) return _vue._geteventtargetproperty /*String*/ (_e,_prop);
 //BA.debugLineNum = 2434;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananoshared._fileobject  _getfiledetails(anywheresoftware.b4a.objects.collections.Map _fileobj) throws Exception{
 //BA.debugLineNum = 3023;BA.debugLine="Sub GetFileDetails(fileObj As Map) As FileObject";
 //BA.debugLineNum = 3024;BA.debugLine="Return vue.GetFileDetails(fileObj)";
if (true) return _vue._getfiledetails /*b4j.example.bananoshared._fileobject*/ (_fileobj);
 //BA.debugLineNum = 3025;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getfilelistfromtarget(com.ab.banano.BANanoEvent _e) throws Exception{
anywheresoftware.b4a.objects.collections.List _files = null;
 //BA.debugLineNum = 2213;BA.debugLine="Sub GetFileListFromTarget(e As BANanoEvent) As Lis";
 //BA.debugLineNum = 2214;BA.debugLine="Dim files As List = e.OtherField(\"target\").GetFie";
_files = new anywheresoftware.b4a.objects.collections.List();
_files = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e.OtherField("target").GetField("files").Result()));
 //BA.debugLineNum = 2215;BA.debugLine="Return files";
if (true) return _files;
 //BA.debugLineNum = 2216;BA.debugLine="End Sub";
return null;
}
public String  _getidfromevent(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 2423;BA.debugLine="Sub GetIDFromEvent(e As BANanoEvent) As String";
 //BA.debugLineNum = 2424;BA.debugLine="Return vue.GetIDFromEvent(e)";
if (true) return _vue._getidfromevent /*String*/ (_e);
 //BA.debugLineNum = 2425;BA.debugLine="End Sub";
return "";
}
public String  _getkeyfromevent(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 2427;BA.debugLine="Sub GetKeyFromEvent(e As BANanoEvent) As String";
 //BA.debugLineNum = 2428;BA.debugLine="Return vue.GetKeyFromEvent(e)";
if (true) return _vue._getkeyfromevent /*String*/ (_e);
 //BA.debugLineNum = 2429;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getlistofmapsproperty(anywheresoftware.b4a.objects.collections.List _lst,String _prop) throws Exception{
 //BA.debugLineNum = 1195;BA.debugLine="Sub GetListOfMapsProperty(lst As List, prop As Str";
 //BA.debugLineNum = 1196;BA.debugLine="Return vue.GetListOfMapsProperty(lst, prop)";
if (true) return _vue._getlistofmapsproperty /*anywheresoftware.b4a.objects.collections.List*/ (_lst,_prop);
 //BA.debugLineNum = 1197;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getoptionsfromkv(String _delim,String _k,String _v) throws Exception{
 //BA.debugLineNum = 2716;BA.debugLine="Sub GetOptionsFromKV(delim As String, k As String,";
 //BA.debugLineNum = 2717;BA.debugLine="Return vue.GetOptionsFromKV(delim, k, v)";
if (true) return _vue._getoptionsfromkv /*anywheresoftware.b4a.objects.collections.Map*/ (_delim,_k,_v);
 //BA.debugLineNum = 2718;BA.debugLine="End Sub";
return null;
}
public String  _getprogressvalue(String _elid) throws Exception{
String _elkey = "";
String _svalue = "";
 //BA.debugLineNum = 1551;BA.debugLine="Sub GetProgressValue(elID As String) As String";
 //BA.debugLineNum = 1552;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 1553;BA.debugLine="Dim elKey As String = $\"${elID}value\"$";
_elkey = (""+__c.SmartStringFormatter("",(Object)(_elid))+"value");
 //BA.debugLineNum = 1554;BA.debugLine="Dim svalue As String = vue.getData(elKey)";
_svalue = BA.ObjectToString(_vue._getdata /*Object*/ (_elkey));
 //BA.debugLineNum = 1555;BA.debugLine="Return svalue";
if (true) return _svalue;
 //BA.debugLineNum = 1556;BA.debugLine="End Sub";
return "";
}
public String  _getprompt() throws Exception{
String _ss = "";
 //BA.debugLineNum = 2730;BA.debugLine="Sub GetPrompt As String";
 //BA.debugLineNum = 2731;BA.debugLine="Dim ss As String = vue.GetState(\"promptvalue\",\"\")";
_ss = BA.ObjectToString(_vue._getstate /*Object*/ ("promptvalue",(Object)("")));
 //BA.debugLineNum = 2732;BA.debugLine="ss = ss.tolowercase";
_ss = _ss.toLowerCase();
 //BA.debugLineNum = 2733;BA.debugLine="Return ss";
if (true) return _ss;
 //BA.debugLineNum = 2734;BA.debugLine="End Sub";
return "";
}
public boolean  _getrequiredstate(String _k) throws Exception{
String _diskey = "";
 //BA.debugLineNum = 2576;BA.debugLine="Sub GetRequiredState(k As String) As Boolean";
 //BA.debugLineNum = 2577;BA.debugLine="Dim disKey As String = $\"${k}required\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"required");
 //BA.debugLineNum = 2578;BA.debugLine="Return GetState(disKey,False)";
if (true) return BA.ObjectToBoolean(_getstate(_diskey,(Object)(__c.False)));
 //BA.debugLineNum = 2579;BA.debugLine="End Sub";
return false;
}
public boolean  _getshowstate(String _k) throws Exception{
String _showkey = "";
 //BA.debugLineNum = 2566;BA.debugLine="Sub GetShowState(k As String) As Boolean";
 //BA.debugLineNum = 2567;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"show");
 //BA.debugLineNum = 2568;BA.debugLine="Return GetState(showKey,False)";
if (true) return BA.ObjectToBoolean(_getstate(_showkey,(Object)(__c.False)));
 //BA.debugLineNum = 2569;BA.debugLine="End Sub";
return false;
}
public Object  _getstate(String _k,Object _default) throws Exception{
Object _res = null;
 //BA.debugLineNum = 2473;BA.debugLine="Sub GetState(k As String, default As Object) As Ob";
 //BA.debugLineNum = 2474;BA.debugLine="Dim res As Object = vue.GetState(k, default)";
_res = _vue._getstate /*Object*/ (_k,_default);
 //BA.debugLineNum = 2475;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 2476;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getstates(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
 //BA.debugLineNum = 2307;BA.debugLine="Sub GetStates(lst As List) As Map";
 //BA.debugLineNum = 2308;BA.debugLine="Return vue.GetStates(lst)";
if (true) return _vue._getstates /*anywheresoftware.b4a.objects.collections.Map*/ (_lst);
 //BA.debugLineNum = 2309;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _h1(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 415;BA.debugLine="Sub H1(elID As String) As VMElement";
 //BA.debugLineNum = 416;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 417;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 418;BA.debugLine="elx.SetTag(\"h1\")";
_elx._settag /*b4j.example.vmelement*/ ("h1");
 //BA.debugLineNum = 419;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _h2(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 429;BA.debugLine="Sub H2(elID As String) As VMElement";
 //BA.debugLineNum = 430;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 431;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 432;BA.debugLine="elx.SetTag(\"h2\")";
_elx._settag /*b4j.example.vmelement*/ ("h2");
 //BA.debugLineNum = 433;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _h3(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 436;BA.debugLine="Sub H3(elID As String) As VMElement";
 //BA.debugLineNum = 437;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 438;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 439;BA.debugLine="elx.SetTag(\"h3\")";
_elx._settag /*b4j.example.vmelement*/ ("h3");
 //BA.debugLineNum = 440;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 441;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _h4(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 443;BA.debugLine="Sub H4(elID As String) As VMElement";
 //BA.debugLineNum = 444;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 445;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 446;BA.debugLine="elx.SetTag(\"h4\")";
_elx._settag /*b4j.example.vmelement*/ ("h4");
 //BA.debugLineNum = 447;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 448;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _h5(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 451;BA.debugLine="Sub H5(elID As String) As VMElement";
 //BA.debugLineNum = 452;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 453;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 454;BA.debugLine="elx.SetTag(\"h5\")";
_elx._settag /*b4j.example.vmelement*/ ("h5");
 //BA.debugLineNum = 455;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _h6(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 459;BA.debugLine="Sub H6(elID As String) As VMElement";
 //BA.debugLineNum = 460;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 461;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 462;BA.debugLine="elx.SetTag(\"h6\")";
_elx._settag /*b4j.example.vmelement*/ ("h6");
 //BA.debugLineNum = 463;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return null;
}
public boolean  _hasstate(String _k) throws Exception{
 //BA.debugLineNum = 2302;BA.debugLine="Sub HasState(k As String) As Boolean";
 //BA.debugLineNum = 2303;BA.debugLine="Return vue.HasState(k)";
if (true) return _vue._hasstate /*boolean*/ (_k);
 //BA.debugLineNum = 2304;BA.debugLine="End Sub";
return false;
}
public String  _hide(String _elid) throws Exception{
 //BA.debugLineNum = 1792;BA.debugLine="Sub Hide(elID As String)";
 //BA.debugLineNum = 1793;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 1794;BA.debugLine="vue.SetStateSingle($\"${elID}show\"$, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"show"),(Object)(__c.False));
 //BA.debugLineNum = 1795;BA.debugLine="End Sub";
return "";
}
public String  _hidebottomsheet(String _did) throws Exception{
 //BA.debugLineNum = 1717;BA.debugLine="Sub HideBottomSheet(dID As String)";
 //BA.debugLineNum = 1718;BA.debugLine="dID = dID.tolowercase";
_did = _did.toLowerCase();
 //BA.debugLineNum = 1719;BA.debugLine="vue.SetData($\"${dID}show\"$, False)";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_did))+"show"),(Object)(__c.False));
 //BA.debugLineNum = 1720;BA.debugLine="End Sub";
return "";
}
public String  _hidedialog(String _did) throws Exception{
 //BA.debugLineNum = 1762;BA.debugLine="Sub HideDialog(dID As String)";
 //BA.debugLineNum = 1763;BA.debugLine="dID = dID.tolowercase";
_did = _did.toLowerCase();
 //BA.debugLineNum = 1764;BA.debugLine="SetStateFalse(dID & \"show\")";
_setstatefalse(_did+"show");
 //BA.debugLineNum = 1765;BA.debugLine="End Sub";
return "";
}
public String  _hidedrawer(String _did) throws Exception{
 //BA.debugLineNum = 1732;BA.debugLine="Sub HideDrawer(dID As String)";
 //BA.debugLineNum = 1733;BA.debugLine="dID = dID.tolowercase";
_did = _did.toLowerCase();
 //BA.debugLineNum = 1734;BA.debugLine="SetStateFalse(dID)";
_setstatefalse(_did);
 //BA.debugLineNum = 1735;BA.debugLine="End Sub";
return "";
}
public String  _hidedrawers() throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
 //BA.debugLineNum = 1745;BA.debugLine="Sub HideDrawers";
 //BA.debugLineNum = 1746;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1747;BA.debugLine="For Each k As String In drawers";
{
final anywheresoftware.b4a.BA.IterableList group2 = _drawers;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1748;BA.debugLine="nm.Put(k, False)";
_nm.Put((Object)(_k),(Object)(__c.False));
 }
};
 //BA.debugLineNum = 1750;BA.debugLine="SetState(nm)";
_setstate(_nm);
 //BA.debugLineNum = 1751;BA.debugLine="End Sub";
return "";
}
public String  _hideerror(String _elid) throws Exception{
 //BA.debugLineNum = 3369;BA.debugLine="Sub HideError(elID As String)";
 //BA.debugLineNum = 3370;BA.debugLine="vue.HideError(elID)";
_vue._hideerror /*String*/ (_elid);
 //BA.debugLineNum = 3371;BA.debugLine="End Sub";
return "";
}
public String  _hideitem(String _elid) throws Exception{
 //BA.debugLineNum = 2343;BA.debugLine="Sub HideItem(elID As String)";
 //BA.debugLineNum = 2344;BA.debugLine="vue.HideItem(elID)";
_vue._hideitem /*String*/ (_elid);
 //BA.debugLineNum = 2345;BA.debugLine="End Sub";
return "";
}
public String  _hideitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
String _item = "";
 //BA.debugLineNum = 2333;BA.debugLine="Sub HideItems(items As List)";
 //BA.debugLineNum = 2334;BA.debugLine="For Each item As String In items";
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2335;BA.debugLine="HideItem(item)";
_hideitem(_item);
 }
};
 //BA.debugLineNum = 2337;BA.debugLine="End Sub";
return "";
}
public String  _hideloading() throws Exception{
 //BA.debugLineNum = 943;BA.debugLine="Sub HideLoading";
 //BA.debugLineNum = 944;BA.debugLine="NavBar.SetLoading(False)";
_navbar._setloading /*String*/ (__c.False);
 //BA.debugLineNum = 945;BA.debugLine="End Sub";
return "";
}
public String  _hidemulti(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
String _item = "";
 //BA.debugLineNum = 1630;BA.debugLine="Sub HideMulti(lst As List)";
 //BA.debugLineNum = 1631;BA.debugLine="For Each item As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1632;BA.debugLine="Hide(item)";
_hide(_item);
 }
};
 //BA.debugLineNum = 1634;BA.debugLine="End Sub";
return "";
}
public String  _hidenotification() throws Exception{
 //BA.debugLineNum = 1261;BA.debugLine="Sub HideNotification";
 //BA.debugLineNum = 1262;BA.debugLine="Notification.hide";
_notification._hide /*b4j.example.vmalert*/ ();
 //BA.debugLineNum = 1263;BA.debugLine="End Sub";
return "";
}
public String  _hideotherdrawers(String _sexcept) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
 //BA.debugLineNum = 1753;BA.debugLine="Sub HideOtherDrawers(sexcept As String)";
 //BA.debugLineNum = 1754;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1755;BA.debugLine="For Each k As String In drawers";
{
final anywheresoftware.b4a.BA.IterableList group2 = _drawers;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1756;BA.debugLine="If k.EqualsIgnoreCase(sexcept) = False Then nm.P";
if (_k.equalsIgnoreCase(_sexcept)==__c.False) { 
_nm.Put((Object)(_k),(Object)(__c.False));};
 }
};
 //BA.debugLineNum = 1758;BA.debugLine="SetState(nm)";
_setstate(_nm);
 //BA.debugLineNum = 1759;BA.debugLine="End Sub";
return "";
}
public String  _hideoverlay(String _did) throws Exception{
 //BA.debugLineNum = 1727;BA.debugLine="Sub HideOverlay(dID As String)";
 //BA.debugLineNum = 1728;BA.debugLine="dID = dID.tolowercase";
_did = _did.toLowerCase();
 //BA.debugLineNum = 1729;BA.debugLine="vue.SetData($\"${dID}show\"$, False)";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_did))+"show"),(Object)(__c.False));
 //BA.debugLineNum = 1730;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _hidespeeddial(String _elid) throws Exception{
 //BA.debugLineNum = 1480;BA.debugLine="Sub HideSpeedDial(elID As String) As BANanoVM";
 //BA.debugLineNum = 1481;BA.debugLine="SetStateSingle(elID, False)";
_setstatesingle(_elid,(Object)(__c.False));
 //BA.debugLineNum = 1482;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1483;BA.debugLine="End Sub";
return null;
}
public String  _hr() throws Exception{
 //BA.debugLineNum = 2263;BA.debugLine="Sub HR As String";
 //BA.debugLineNum = 2264;BA.debugLine="Return \"<hr>\"";
if (true) return "<hr>";
 //BA.debugLineNum = 2265;BA.debugLine="End Sub";
return "";
}
public String  _httpupload(Object _fileobj,Object _moduleobj,String _methodname) throws Exception{
 //BA.debugLineNum = 3019;BA.debugLine="Sub HTTPUpload(fileObj As Object, moduleObj As Obj";
 //BA.debugLineNum = 3020;BA.debugLine="vue.HTTPUpload(fileObj, moduleObj, methodname)";
_vue._httpupload /*String*/ (_fileobj,_moduleobj,_methodname);
 //BA.debugLineNum = 3021;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _img(String _tid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 899;BA.debugLine="Sub Img(tID As String) As VMElement";
 //BA.debugLineNum = 900;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 901;BA.debugLine="elx.Initialize(vue, tID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_tid);
 //BA.debugLineNum = 902;BA.debugLine="elx.SetTag(\"img\")";
_elx._settag /*b4j.example.vmelement*/ ("img");
 //BA.debugLineNum = 903;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 904;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _increment(String _elid,int _valueof) throws Exception{
int _oldv = 0;
 //BA.debugLineNum = 1559;BA.debugLine="Sub Increment(elID As String, valueOf As Int) As B";
 //BA.debugLineNum = 1560;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 1561;BA.debugLine="Dim oldv As Int = vue.GetState(elID,0)";
_oldv = (int)(BA.ObjectToNumber(_vue._getstate /*Object*/ (_elid,(Object)(0))));
 //BA.debugLineNum = 1562;BA.debugLine="oldv = BANano.parseInt(oldv) + valueOf";
_oldv = (int) (_banano.parseInt((Object)(_oldv))+_valueof);
 //BA.debugLineNum = 1563;BA.debugLine="vue.SetStateSingle(elID, oldv)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_elid,(Object)(_oldv));
 //BA.debugLineNum = 1564;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1565;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _incrementbadge(String _elid,int _counted) throws Exception{
String _badvalue = "";
String _lastvalue = "";
int _intlast = 0;
 //BA.debugLineNum = 2193;BA.debugLine="Sub IncrementBadge(elID As String, counted As Int)";
 //BA.debugLineNum = 2194;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 2195;BA.debugLine="Dim badValue As String = $\"${elID}badgecontent\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"badgecontent");
 //BA.debugLineNum = 2196;BA.debugLine="Dim lastValue As String = vue.GetState(badValue,";
_lastvalue = BA.ObjectToString(_vue._getstate /*Object*/ (_badvalue,(Object)("0")));
 //BA.debugLineNum = 2197;BA.debugLine="Dim intLast As Int = BANano.parseInt(lastValue)";
_intlast = _banano.parseInt((Object)(_lastvalue));
 //BA.debugLineNum = 2198;BA.debugLine="intLast = intLast + counted";
_intlast = (int) (_intlast+_counted);
 //BA.debugLineNum = 2199;BA.debugLine="vue.SetStateSingle(badValue, intLast)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_badvalue,(Object)(_intlast));
 //BA.debugLineNum = 2200;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2201;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _incrementto(String _elid,int _valueof,int _limitto) throws Exception{
int _oldv = 0;
 //BA.debugLineNum = 1585;BA.debugLine="Sub IncrementTo(elID As String, valueOf As Int, Li";
 //BA.debugLineNum = 1586;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 1587;BA.debugLine="Dim oldv As Int = vue.GetState(elID,0)";
_oldv = (int)(BA.ObjectToNumber(_vue._getstate /*Object*/ (_elid,(Object)(0))));
 //BA.debugLineNum = 1588;BA.debugLine="oldv = BANano.parseInt(oldv) + valueOf";
_oldv = (int) (_banano.parseInt((Object)(_oldv))+_valueof);
 //BA.debugLineNum = 1589;BA.debugLine="If oldv >= LimitTo Then oldv = LimitTo";
if (_oldv>=_limitto) { 
_oldv = _limitto;};
 //BA.debugLineNum = 1590;BA.debugLine="vue.SetStateSingle(elID, oldv)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_elid,(Object)(_oldv));
 //BA.debugLineNum = 1591;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1592;BA.debugLine="End Sub";
return null;
}
public String  _initcolors() throws Exception{
int _e = 0;
anywheresoftware.b4a.objects.collections.List _tran = null;
String _sl = "";
anywheresoftware.b4a.objects.collections.List _flist = null;
anywheresoftware.b4a.objects.collections.List _xlist = null;
 //BA.debugLineNum = 1875;BA.debugLine="private Sub InitColors";
 //BA.debugLineNum = 1876;BA.debugLine="Dim e As Int";
_e = 0;
 //BA.debugLineNum = 1877;BA.debugLine="Elevation.initialize";
_elevation.Initialize();
 //BA.debugLineNum = 1878;BA.debugLine="For e = 0 To 24";
{
final int step3 = 1;
final int limit3 = (int) (24);
_e = (int) (0) ;
for (;_e <= limit3 ;_e = _e + step3 ) {
 //BA.debugLineNum = 1879;BA.debugLine="Elevation.Put(e, e)";
_elevation.Put((Object)(_e),(Object)(_e));
 }
};
 //BA.debugLineNum = 1881;BA.debugLine="Elevation.Put(\"\", \"None\")";
_elevation.Put((Object)(""),(Object)("None"));
 //BA.debugLineNum = 1883;BA.debugLine="Dim tran As List";
_tran = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1884;BA.debugLine="tran.Initialize";
_tran.Initialize();
 //BA.debugLineNum = 1886;BA.debugLine="tran.AddAll(Array(\"slide-x-transition\", \"slide-x-";
_tran.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("slide-x-transition"),(Object)("slide-x-reverse-transition"),(Object)("slide-y-transition"),(Object)("slide-y-reverse-transition"),(Object)("scroll-x-transition")}));
 //BA.debugLineNum = 1887;BA.debugLine="tran.AddAll(Array(\"scroll-x-reverse-transition\",";
_tran.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("scroll-x-reverse-transition"),(Object)("scroll-y-transition"),(Object)("scroll-y-reverse-transition"),(Object)("scale-transition"),(Object)("fade-transition"),(Object)("fab-transition")}));
 //BA.debugLineNum = 1889;BA.debugLine="Transition.Initialize";
_transition.Initialize();
 //BA.debugLineNum = 1890;BA.debugLine="Transitions.Initialize";
_transitions.Initialize();
 //BA.debugLineNum = 1891;BA.debugLine="For Each sl As String In tran";
{
final anywheresoftware.b4a.BA.IterableList group13 = _tran;
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_sl = BA.ObjectToString(group13.Get(index13));
 //BA.debugLineNum = 1892;BA.debugLine="Transition.Put(sl, sl)";
_transition.Put((Object)(_sl),(Object)(_sl));
 //BA.debugLineNum = 1893;BA.debugLine="Transitions.Put($\"v-${sl}\"$, sl)";
_transitions.Put((Object)(("v-"+__c.SmartStringFormatter("",(Object)(_sl))+"")),(Object)(_sl));
 }
};
 //BA.debugLineNum = 1895;BA.debugLine="Transition.Put(\"\", \"None\")";
_transition.Put((Object)(""),(Object)("None"));
 //BA.debugLineNum = 1897;BA.debugLine="DisplayOptions.Initialize";
_displayoptions.Initialize();
 //BA.debugLineNum = 1898;BA.debugLine="DisplayOptions.Put(\"\", \"None\")";
_displayoptions.Put((Object)(""),(Object)("None"));
 //BA.debugLineNum = 1899;BA.debugLine="DisplayOptions.Put(\"display-4\", \"Display 4\")";
_displayoptions.Put((Object)("display-4"),(Object)("Display 4"));
 //BA.debugLineNum = 1900;BA.debugLine="DisplayOptions.Put(\"display-3\", \"Display 3\")";
_displayoptions.Put((Object)("display-3"),(Object)("Display 3"));
 //BA.debugLineNum = 1901;BA.debugLine="DisplayOptions.Put(\"display-2\", \"Display 2\")";
_displayoptions.Put((Object)("display-2"),(Object)("Display 2"));
 //BA.debugLineNum = 1902;BA.debugLine="DisplayOptions.Put(\"display-1\", \"Display 1\")";
_displayoptions.Put((Object)("display-1"),(Object)("Display 1"));
 //BA.debugLineNum = 1903;BA.debugLine="DisplayOptions.Put(\"headline\", \"Headline\")";
_displayoptions.Put((Object)("headline"),(Object)("Headline"));
 //BA.debugLineNum = 1904;BA.debugLine="DisplayOptions.Put(\"title\", \"Title\")";
_displayoptions.Put((Object)("title"),(Object)("Title"));
 //BA.debugLineNum = 1905;BA.debugLine="DisplayOptions.Put(\"subtitle-1\", \"Sub Title 1\")";
_displayoptions.Put((Object)("subtitle-1"),(Object)("Sub Title 1"));
 //BA.debugLineNum = 1906;BA.debugLine="DisplayOptions.Put(\"subtitle-2\", \"Sub Title 2\")";
_displayoptions.Put((Object)("subtitle-2"),(Object)("Sub Title 2"));
 //BA.debugLineNum = 1907;BA.debugLine="DisplayOptions.Put(\"body-1\", \"Body 2\")";
_displayoptions.Put((Object)("body-1"),(Object)("Body 2"));
 //BA.debugLineNum = 1908;BA.debugLine="DisplayOptions.Put(\"body-2\", \"Body 1\")";
_displayoptions.Put((Object)("body-2"),(Object)("Body 1"));
 //BA.debugLineNum = 1909;BA.debugLine="DisplayOptions.Put(\"caption\", \"Caption\")";
_displayoptions.Put((Object)("caption"),(Object)("Caption"));
 //BA.debugLineNum = 1910;BA.debugLine="DisplayOptions.Put(\"overline\", \"Overline\")";
_displayoptions.Put((Object)("overline"),(Object)("Overline"));
 //BA.debugLineNum = 1912;BA.debugLine="TextAlignmentOptions.Initialize";
_textalignmentoptions.Initialize();
 //BA.debugLineNum = 1913;BA.debugLine="TextAlignmentOptions.put(\"\", \"None\")";
_textalignmentoptions.Put((Object)(""),(Object)("None"));
 //BA.debugLineNum = 1914;BA.debugLine="TextAlignmentOptions.put(\"text-left\", \"Left\")";
_textalignmentoptions.Put((Object)("text-left"),(Object)("Left"));
 //BA.debugLineNum = 1915;BA.debugLine="TextAlignmentOptions.put(\"text-center\", \"Center\")";
_textalignmentoptions.Put((Object)("text-center"),(Object)("Center"));
 //BA.debugLineNum = 1916;BA.debugLine="TextAlignmentOptions.put(\"text-right\", \"Right\")";
_textalignmentoptions.Put((Object)("text-right"),(Object)("Right"));
 //BA.debugLineNum = 1917;BA.debugLine="TextAlignmentOptions.put(\"text-justify\", \"Justify";
_textalignmentoptions.Put((Object)("text-justify"),(Object)("Justify"));
 //BA.debugLineNum = 1919;BA.debugLine="FontWeightOptions.Initialize";
_fontweightoptions.Initialize();
 //BA.debugLineNum = 1920;BA.debugLine="FontWeightOptions.Put(\"\", \"None\")";
_fontweightoptions.Put((Object)(""),(Object)("None"));
 //BA.debugLineNum = 1921;BA.debugLine="FontWeightOptions.Put(\"font-weight-black\", \"Black";
_fontweightoptions.Put((Object)("font-weight-black"),(Object)("Black"));
 //BA.debugLineNum = 1922;BA.debugLine="FontWeightOptions.Put(\"font-weight-bold\",\"Bold\")";
_fontweightoptions.Put((Object)("font-weight-bold"),(Object)("Bold"));
 //BA.debugLineNum = 1923;BA.debugLine="FontWeightOptions.Put(\"font-weight-medium\", \"Medi";
_fontweightoptions.Put((Object)("font-weight-medium"),(Object)("Medium"));
 //BA.debugLineNum = 1924;BA.debugLine="FontWeightOptions.Put(\"font-weight-regular\", \"Reg";
_fontweightoptions.Put((Object)("font-weight-regular"),(Object)("Regular"));
 //BA.debugLineNum = 1925;BA.debugLine="FontWeightOptions.Put(\"font-weight-light\", \"Light";
_fontweightoptions.Put((Object)("font-weight-light"),(Object)("Light"));
 //BA.debugLineNum = 1926;BA.debugLine="FontWeightOptions.Put(\"font-weight-thin\", \"Thin\")";
_fontweightoptions.Put((Object)("font-weight-thin"),(Object)("Thin"));
 //BA.debugLineNum = 1928;BA.debugLine="IntensityOptions.Initialize";
_intensityoptions.Initialize();
 //BA.debugLineNum = 1929;BA.debugLine="IntensityOptions.put(\"\",\"Normal\")";
_intensityoptions.Put((Object)(""),(Object)("Normal"));
 //BA.debugLineNum = 1930;BA.debugLine="IntensityOptions.put(\"lighten-1\",\"Lighten 1\")";
_intensityoptions.Put((Object)("lighten-1"),(Object)("Lighten 1"));
 //BA.debugLineNum = 1931;BA.debugLine="IntensityOptions.put(\"lighten-2\",\"Lighten 2\")";
_intensityoptions.Put((Object)("lighten-2"),(Object)("Lighten 2"));
 //BA.debugLineNum = 1932;BA.debugLine="IntensityOptions.put(\"lighten-3\",\"Lighten 3\")";
_intensityoptions.Put((Object)("lighten-3"),(Object)("Lighten 3"));
 //BA.debugLineNum = 1933;BA.debugLine="IntensityOptions.put(\"lighten-4\",\"Lighten 4\")";
_intensityoptions.Put((Object)("lighten-4"),(Object)("Lighten 4"));
 //BA.debugLineNum = 1934;BA.debugLine="IntensityOptions.put(\"lighten-5\",\"Lighten 5\")";
_intensityoptions.Put((Object)("lighten-5"),(Object)("Lighten 5"));
 //BA.debugLineNum = 1935;BA.debugLine="IntensityOptions.put(\"darken-1\",\"Darken 1\")";
_intensityoptions.Put((Object)("darken-1"),(Object)("Darken 1"));
 //BA.debugLineNum = 1936;BA.debugLine="IntensityOptions.put(\"darken-2\",\"Darken 2\")";
_intensityoptions.Put((Object)("darken-2"),(Object)("Darken 2"));
 //BA.debugLineNum = 1937;BA.debugLine="IntensityOptions.put(\"darken-3\",\"Darken 3\")";
_intensityoptions.Put((Object)("darken-3"),(Object)("Darken 3"));
 //BA.debugLineNum = 1938;BA.debugLine="IntensityOptions.put(\"darken-4\",\"Darken 4\")";
_intensityoptions.Put((Object)("darken-4"),(Object)("Darken 4"));
 //BA.debugLineNum = 1939;BA.debugLine="IntensityOptions.put(\"accent-1\",\"Accent 1\")";
_intensityoptions.Put((Object)("accent-1"),(Object)("Accent 1"));
 //BA.debugLineNum = 1940;BA.debugLine="IntensityOptions.put(\"accent-2\",\"Accent 2\")";
_intensityoptions.Put((Object)("accent-2"),(Object)("Accent 2"));
 //BA.debugLineNum = 1941;BA.debugLine="IntensityOptions.put(\"accent-3\",\"Accent 3\")";
_intensityoptions.Put((Object)("accent-3"),(Object)("Accent 3"));
 //BA.debugLineNum = 1942;BA.debugLine="IntensityOptions.put(\"accent-4\",\"Accent 4\")";
_intensityoptions.Put((Object)("accent-4"),(Object)("Accent 4"));
 //BA.debugLineNum = 1944;BA.debugLine="ColorOptions.Initialize";
_coloroptions.Initialize();
 //BA.debugLineNum = 1945;BA.debugLine="ColorOptions.Put(\"amber\",\"Amber\")";
_coloroptions.Put((Object)("amber"),(Object)("Amber"));
 //BA.debugLineNum = 1946;BA.debugLine="ColorOptions.Put(\"black\",\"Black\")";
_coloroptions.Put((Object)("black"),(Object)("Black"));
 //BA.debugLineNum = 1947;BA.debugLine="ColorOptions.Put(\"blue\",\"Blue\")";
_coloroptions.Put((Object)("blue"),(Object)("Blue"));
 //BA.debugLineNum = 1948;BA.debugLine="ColorOptions.Put(\"blue-grey\",\"Blue Grey\")";
_coloroptions.Put((Object)("blue-grey"),(Object)("Blue Grey"));
 //BA.debugLineNum = 1949;BA.debugLine="ColorOptions.Put(\"brown\",\"Brown\")";
_coloroptions.Put((Object)("brown"),(Object)("Brown"));
 //BA.debugLineNum = 1950;BA.debugLine="ColorOptions.Put(\"cyan\",\"Cyan\")";
_coloroptions.Put((Object)("cyan"),(Object)("Cyan"));
 //BA.debugLineNum = 1951;BA.debugLine="ColorOptions.Put(\"deep-orange\",\"Deep Orange\")";
_coloroptions.Put((Object)("deep-orange"),(Object)("Deep Orange"));
 //BA.debugLineNum = 1952;BA.debugLine="ColorOptions.Put(\"deep-purple\",\"Deep Purple\")";
_coloroptions.Put((Object)("deep-purple"),(Object)("Deep Purple"));
 //BA.debugLineNum = 1953;BA.debugLine="ColorOptions.Put(\"green\",\"Green\")";
_coloroptions.Put((Object)("green"),(Object)("Green"));
 //BA.debugLineNum = 1954;BA.debugLine="ColorOptions.Put(\"grey\",\"Grey\")";
_coloroptions.Put((Object)("grey"),(Object)("Grey"));
 //BA.debugLineNum = 1955;BA.debugLine="ColorOptions.Put(\"indigo\",\"Indigo\")";
_coloroptions.Put((Object)("indigo"),(Object)("Indigo"));
 //BA.debugLineNum = 1956;BA.debugLine="ColorOptions.Put(\"light-blue\",\"Light Blue\")";
_coloroptions.Put((Object)("light-blue"),(Object)("Light Blue"));
 //BA.debugLineNum = 1957;BA.debugLine="ColorOptions.Put(\"light-green\", \"Light Green\")";
_coloroptions.Put((Object)("light-green"),(Object)("Light Green"));
 //BA.debugLineNum = 1958;BA.debugLine="ColorOptions.Put(\"lime\", \"Lime\")";
_coloroptions.Put((Object)("lime"),(Object)("Lime"));
 //BA.debugLineNum = 1959;BA.debugLine="ColorOptions.Put(\"orange\", \"Orange\")";
_coloroptions.Put((Object)("orange"),(Object)("Orange"));
 //BA.debugLineNum = 1960;BA.debugLine="ColorOptions.Put(\"pink\", \"Pink\")";
_coloroptions.Put((Object)("pink"),(Object)("Pink"));
 //BA.debugLineNum = 1961;BA.debugLine="ColorOptions.Put(\"purple\", \"Purple\")";
_coloroptions.Put((Object)("purple"),(Object)("Purple"));
 //BA.debugLineNum = 1962;BA.debugLine="ColorOptions.Put(\"red\", \"Red\")";
_coloroptions.Put((Object)("red"),(Object)("Red"));
 //BA.debugLineNum = 1963;BA.debugLine="ColorOptions.Put(\"teal\", \"Teal\")";
_coloroptions.Put((Object)("teal"),(Object)("Teal"));
 //BA.debugLineNum = 1964;BA.debugLine="ColorOptions.Put(\"transparent\", \"Transparent\")";
_coloroptions.Put((Object)("transparent"),(Object)("Transparent"));
 //BA.debugLineNum = 1965;BA.debugLine="ColorOptions.Put(\"white\", \"White\")";
_coloroptions.Put((Object)("white"),(Object)("White"));
 //BA.debugLineNum = 1966;BA.debugLine="ColorOptions.Put(\"yellow\", \"Yellow\")";
_coloroptions.Put((Object)("yellow"),(Object)("Yellow"));
 //BA.debugLineNum = 1967;BA.debugLine="ColorOptions.Put(\"\", \"None\")";
_coloroptions.Put((Object)(""),(Object)("None"));
 //BA.debugLineNum = 1968;BA.debugLine="ColorOptions.Put(\"primary\",\"Primary\")";
_coloroptions.Put((Object)("primary"),(Object)("Primary"));
 //BA.debugLineNum = 1969;BA.debugLine="ColorOptions.Put(\"secondary\",\"Secondary\")";
_coloroptions.Put((Object)("secondary"),(Object)("Secondary"));
 //BA.debugLineNum = 1970;BA.debugLine="ColorOptions.Put(\"accent\",\"Accent\")";
_coloroptions.Put((Object)("accent"),(Object)("Accent"));
 //BA.debugLineNum = 1971;BA.debugLine="ColorOptions.Put(\"error\",\"Error\")";
_coloroptions.Put((Object)("error"),(Object)("Error"));
 //BA.debugLineNum = 1972;BA.debugLine="ColorOptions.Put(\"info\",\"Info\")";
_coloroptions.Put((Object)("info"),(Object)("Info"));
 //BA.debugLineNum = 1973;BA.debugLine="ColorOptions.Put(\"success\",\"Success\")";
_coloroptions.Put((Object)("success"),(Object)("Success"));
 //BA.debugLineNum = 1974;BA.debugLine="ColorOptions.Put(\"warning\",\"Warning\")";
_coloroptions.Put((Object)("warning"),(Object)("Warning"));
 //BA.debugLineNum = 1976;BA.debugLine="BorderOptions.Initialize";
_borderoptions.Initialize();
 //BA.debugLineNum = 1977;BA.debugLine="BorderOptions.Put(\"dashed\", \"Dashed\")";
_borderoptions.Put((Object)("dashed"),(Object)("Dashed"));
 //BA.debugLineNum = 1978;BA.debugLine="BorderOptions.Put(\"dotted\", \"Dotted\")";
_borderoptions.Put((Object)("dotted"),(Object)("Dotted"));
 //BA.debugLineNum = 1979;BA.debugLine="BorderOptions.Put(\"double\", \"Double\")";
_borderoptions.Put((Object)("double"),(Object)("Double"));
 //BA.debugLineNum = 1980;BA.debugLine="BorderOptions.Put(\"groove\", \"Groove\")";
_borderoptions.Put((Object)("groove"),(Object)("Groove"));
 //BA.debugLineNum = 1981;BA.debugLine="BorderOptions.Put(\"hidden\", \"Hidden\")";
_borderoptions.Put((Object)("hidden"),(Object)("Hidden"));
 //BA.debugLineNum = 1982;BA.debugLine="BorderOptions.Put(\"inset\", \"Inset\")";
_borderoptions.Put((Object)("inset"),(Object)("Inset"));
 //BA.debugLineNum = 1983;BA.debugLine="BorderOptions.Put(\"none\", \"None\")";
_borderoptions.Put((Object)("none"),(Object)("None"));
 //BA.debugLineNum = 1984;BA.debugLine="BorderOptions.Put(\"outset\", \"Outset\")";
_borderoptions.Put((Object)("outset"),(Object)("Outset"));
 //BA.debugLineNum = 1985;BA.debugLine="BorderOptions.Put(\"ridge\", \"Ridge\")";
_borderoptions.Put((Object)("ridge"),(Object)("Ridge"));
 //BA.debugLineNum = 1986;BA.debugLine="BorderOptions.Put(\"solid\", \"Solid\")";
_borderoptions.Put((Object)("solid"),(Object)("Solid"));
 //BA.debugLineNum = 1988;BA.debugLine="TargetOptions.Put(\"\",\"None\")";
_targetoptions.Put((Object)(""),(Object)("None"));
 //BA.debugLineNum = 1989;BA.debugLine="TargetOptions.Put(\"_blank\",\"Blank\")";
_targetoptions.Put((Object)("_blank"),(Object)("Blank"));
 //BA.debugLineNum = 1990;BA.debugLine="TargetOptions.Put(\"_self\",\"Self\")";
_targetoptions.Put((Object)("_self"),(Object)("Self"));
 //BA.debugLineNum = 1991;BA.debugLine="TargetOptions.Put(\"_parent\",\"Parent\")";
_targetoptions.Put((Object)("_parent"),(Object)("Parent"));
 //BA.debugLineNum = 1992;BA.debugLine="TargetOptions.Put(\"_top\",\"Top\")";
_targetoptions.Put((Object)("_top"),(Object)("Top"));
 //BA.debugLineNum = 1994;BA.debugLine="ColumnTypes.Initialize";
_columntypes.Initialize();
 //BA.debugLineNum = 1995;BA.debugLine="ColumnTypes.put(\"date\",\"Date\")";
_columntypes.Put((Object)("date"),(Object)("Date"));
 //BA.debugLineNum = 1996;BA.debugLine="ColumnTypes.put(\"text\", \"Text\")";
_columntypes.Put((Object)("text"),(Object)("Text"));
 //BA.debugLineNum = 1997;BA.debugLine="ColumnTypes.put(\"icon\", \"Icon\")";
_columntypes.Put((Object)("icon"),(Object)("Icon"));
 //BA.debugLineNum = 1998;BA.debugLine="ColumnTypes.put(\"checkbox\", \"Check Box\")";
_columntypes.Put((Object)("checkbox"),(Object)("Check Box"));
 //BA.debugLineNum = 1999;BA.debugLine="ColumnTypes.put(\"\", \"None\")";
_columntypes.Put((Object)(""),(Object)("None"));
 //BA.debugLineNum = 2000;BA.debugLine="ColumnTypes.put(\"time\",\"Time\")";
_columntypes.Put((Object)("time"),(Object)("Time"));
 //BA.debugLineNum = 2001;BA.debugLine="ColumnTypes.put(\"datetime\",\"Date Time\")";
_columntypes.Put((Object)("datetime"),(Object)("Date Time"));
 //BA.debugLineNum = 2002;BA.debugLine="ColumnTypes.put(\"image\",\"Image\")";
_columntypes.Put((Object)("image"),(Object)("Image"));
 //BA.debugLineNum = 2003;BA.debugLine="ColumnTypes.Put(\"money\",\"Money\")";
_columntypes.Put((Object)("money"),(Object)("Money"));
 //BA.debugLineNum = 2004;BA.debugLine="ColumnTypes.put(\"filesize\", \"File Size\")";
_columntypes.Put((Object)("filesize"),(Object)("File Size"));
 //BA.debugLineNum = 2005;BA.debugLine="ColumnTypes.put(\"chip\",\"Chip\")";
_columntypes.Put((Object)("chip"),(Object)("Chip"));
 //BA.debugLineNum = 2006;BA.debugLine="ColumnTypes.put(\"edit\",\"Edit\")";
_columntypes.Put((Object)("edit"),(Object)("Edit"));
 //BA.debugLineNum = 2007;BA.debugLine="ColumnTypes.put(\"delete\",\"Delete\")";
_columntypes.Put((Object)("delete"),(Object)("Delete"));
 //BA.debugLineNum = 2008;BA.debugLine="ColumnTypes.put(\"action\",\"Action\")";
_columntypes.Put((Object)("action"),(Object)("Action"));
 //BA.debugLineNum = 2009;BA.debugLine="ColumnTypes.put(\"save\",\"Save\")";
_columntypes.Put((Object)("save"),(Object)("Save"));
 //BA.debugLineNum = 2010;BA.debugLine="ColumnTypes.put(\"cancel\",\"Cancel\")";
_columntypes.Put((Object)("cancel"),(Object)("Cancel"));
 //BA.debugLineNum = 2011;BA.debugLine="ColumnTypes.Put(\"switch\", \"Switch\")";
_columntypes.Put((Object)("switch"),(Object)("Switch"));
 //BA.debugLineNum = 2012;BA.debugLine="ColumnTypes.put(\"avatarimg\", \"Avatar\")";
_columntypes.Put((Object)("avatarimg"),(Object)("Avatar"));
 //BA.debugLineNum = 2013;BA.debugLine="ColumnTypes.Put(\"rating\", \"Rating\")";
_columntypes.Put((Object)("rating"),(Object)("Rating"));
 //BA.debugLineNum = 2014;BA.debugLine="ColumnTypes.Put(\"progresscircular\", \"ProgressCirc";
_columntypes.Put((Object)("progresscircular"),(Object)("ProgressCircular"));
 //BA.debugLineNum = 2015;BA.debugLine="ColumnTypes.Put(\"progresslinear\", \"ProgressLinear";
_columntypes.Put((Object)("progresslinear"),(Object)("ProgressLinear"));
 //BA.debugLineNum = 2018;BA.debugLine="ColumnAlign.Initialize";
_columnalign.Initialize();
 //BA.debugLineNum = 2019;BA.debugLine="ColumnAlign.Put(\"start\", \"Start\")";
_columnalign.Put((Object)("start"),(Object)("Start"));
 //BA.debugLineNum = 2020;BA.debugLine="ColumnAlign.Put(\"center\", \"Center\")";
_columnalign.Put((Object)("center"),(Object)("Center"));
 //BA.debugLineNum = 2021;BA.debugLine="ColumnAlign.Put(\"end\", \"End\")";
_columnalign.Put((Object)("end"),(Object)("End"));
 //BA.debugLineNum = 2023;BA.debugLine="DataTypes.Initialize";
_datatypes.Initialize();
 //BA.debugLineNum = 2024;BA.debugLine="DataTypes.Put(\"BOOL\", \"Boolean\")";
_datatypes.Put((Object)("BOOL"),(Object)("Boolean"));
 //BA.debugLineNum = 2025;BA.debugLine="DataTypes.Put(\"INT\", \"Integer\")";
_datatypes.Put((Object)("INT"),(Object)("Integer"));
 //BA.debugLineNum = 2026;BA.debugLine="DataTypes.Put(\"TEXT\", \"Text\")";
_datatypes.Put((Object)("TEXT"),(Object)("Text"));
 //BA.debugLineNum = 2027;BA.debugLine="DataTypes.Put(\"FLOAT\", \"Double\")";
_datatypes.Put((Object)("FLOAT"),(Object)("Double"));
 //BA.debugLineNum = 2028;BA.debugLine="DataTypes.Put(\"BLOB\", \"Blob\")";
_datatypes.Put((Object)("BLOB"),(Object)("Blob"));
 //BA.debugLineNum = 2029;BA.debugLine="DataTypes.Put(\"DATE\", \"Date\")";
_datatypes.Put((Object)("DATE"),(Object)("Date"));
 //BA.debugLineNum = 2030;BA.debugLine="DataTypes.Put(\"None\", \"None\")";
_datatypes.Put((Object)("None"),(Object)("None"));
 //BA.debugLineNum = 2032;BA.debugLine="ControlTypes.Initialize";
_controltypes.Initialize();
 //BA.debugLineNum = 2033;BA.debugLine="ControlTypes.put(\"text\", \"Text\")";
_controltypes.Put((Object)("text"),(Object)("Text"));
 //BA.debugLineNum = 2034;BA.debugLine="ControlTypes.put(\"textarea\", \"Text Area\")";
_controltypes.Put((Object)("textarea"),(Object)("Text Area"));
 //BA.debugLineNum = 2035;BA.debugLine="ControlTypes.put(\"checkbox\", \"Check Box\")";
_controltypes.Put((Object)("checkbox"),(Object)("Check Box"));
 //BA.debugLineNum = 2036;BA.debugLine="ControlTypes.put(\"date\", \"Date\")";
_controltypes.Put((Object)("date"),(Object)("Date"));
 //BA.debugLineNum = 2037;BA.debugLine="ControlTypes.put(\"file\", \"File\")";
_controltypes.Put((Object)("file"),(Object)("File"));
 //BA.debugLineNum = 2038;BA.debugLine="ControlTypes.put(\"radio\", \"Radio\")";
_controltypes.Put((Object)("radio"),(Object)("Radio"));
 //BA.debugLineNum = 2039;BA.debugLine="ControlTypes.put(\"select\", \"Select\")";
_controltypes.Put((Object)("select"),(Object)("Select"));
 //BA.debugLineNum = 2040;BA.debugLine="ControlTypes.put(\"slider\", \"Slider\")";
_controltypes.Put((Object)("slider"),(Object)("Slider"));
 //BA.debugLineNum = 2041;BA.debugLine="ControlTypes.put(\"switch\", \"Switch\")";
_controltypes.Put((Object)("switch"),(Object)("Switch"));
 //BA.debugLineNum = 2042;BA.debugLine="ControlTypes.put(\"label\", \"Label\")";
_controltypes.Put((Object)("label"),(Object)("Label"));
 //BA.debugLineNum = 2043;BA.debugLine="ControlTypes.put(\"email\", \"Email\")";
_controltypes.Put((Object)("email"),(Object)("Email"));
 //BA.debugLineNum = 2044;BA.debugLine="ControlTypes.put(\"rating\", \"Rating\")";
_controltypes.Put((Object)("rating"),(Object)("Rating"));
 //BA.debugLineNum = 2045;BA.debugLine="ControlTypes.put(\"password\", \"Password\")";
_controltypes.Put((Object)("password"),(Object)("Password"));
 //BA.debugLineNum = 2046;BA.debugLine="ControlTypes.put(\"tel\", \"Telephone\")";
_controltypes.Put((Object)("tel"),(Object)("Telephone"));
 //BA.debugLineNum = 2047;BA.debugLine="ControlTypes.put(\"time\", \"Time\")";
_controltypes.Put((Object)("time"),(Object)("Time"));
 //BA.debugLineNum = 2048;BA.debugLine="ControlTypes.put(\"combo\", \"Combo\")";
_controltypes.Put((Object)("combo"),(Object)("Combo"));
 //BA.debugLineNum = 2049;BA.debugLine="ControlTypes.put(\"auto\", \"Auto Complete\")";
_controltypes.Put((Object)("auto"),(Object)("Auto Complete"));
 //BA.debugLineNum = 2050;BA.debugLine="ControlTypes.put(\"profile\", \"Profile\")";
_controltypes.Put((Object)("profile"),(Object)("Profile"));
 //BA.debugLineNum = 2051;BA.debugLine="ControlTypes.put(\"image\", \"Image\")";
_controltypes.Put((Object)("image"),(Object)("Image"));
 //BA.debugLineNum = 2052;BA.debugLine="ControlTypes.put(\"button\", \"Button\")";
_controltypes.Put((Object)("button"),(Object)("Button"));
 //BA.debugLineNum = 2053;BA.debugLine="ControlTypes.put(\"icon\", \"Icon\")";
_controltypes.Put((Object)("icon"),(Object)("Icon"));
 //BA.debugLineNum = 2054;BA.debugLine="ControlTypes.put(\"parallax\", \"Parallax\")";
_controltypes.Put((Object)("parallax"),(Object)("Parallax"));
 //BA.debugLineNum = 2055;BA.debugLine="ControlTypes.put(\"container\", \"Container\")";
_controltypes.Put((Object)("container"),(Object)("Container"));
 //BA.debugLineNum = 2056;BA.debugLine="ControlTypes.put(\"menu\", \"Menu\")";
_controltypes.Put((Object)("menu"),(Object)("Menu"));
 //BA.debugLineNum = 2057;BA.debugLine="ControlTypes.put(\"carousel\", \"Carousel\")";
_controltypes.Put((Object)("carousel"),(Object)("Carousel"));
 //BA.debugLineNum = 2058;BA.debugLine="ControlTypes.put(\"speeddial\", \"Speed Dial\")";
_controltypes.Put((Object)("speeddial"),(Object)("Speed Dial"));
 //BA.debugLineNum = 2059;BA.debugLine="ControlTypes.Put(\"quill\", \"Quill Editor\")";
_controltypes.Put((Object)("quill"),(Object)("Quill Editor"));
 //BA.debugLineNum = 2060;BA.debugLine="ControlTypes.Put(\"None\", \"None\")";
_controltypes.Put((Object)("None"),(Object)("None"));
 //BA.debugLineNum = 2061;BA.debugLine="ControlTypes.Put(\"rangeslider\", \"Range Slider\")";
_controltypes.Put((Object)("rangeslider"),(Object)("Range Slider"));
 //BA.debugLineNum = 2062;BA.debugLine="ControlTypes.Put(\"infobox\", \"Info Box\")";
_controltypes.Put((Object)("infobox"),(Object)("Info Box"));
 //BA.debugLineNum = 2063;BA.debugLine="ControlTypes.Put(\"fileselect\", \"File Select\")";
_controltypes.Put((Object)("fileselect"),(Object)("File Select"));
 //BA.debugLineNum = 2064;BA.debugLine="ControlTypes.Put(\"sparkline\", \"Sparkline\")";
_controltypes.Put((Object)("sparkline"),(Object)("Sparkline"));
 //BA.debugLineNum = 2065;BA.debugLine="ControlTypes.Put(\"number\", \"Number\")";
_controltypes.Put((Object)("number"),(Object)("Number"));
 //BA.debugLineNum = 2067;BA.debugLine="Direction.Initialize";
_direction.Initialize();
 //BA.debugLineNum = 2068;BA.debugLine="Direction.Put(\"top\", \"Top\")";
_direction.Put((Object)("top"),(Object)("Top"));
 //BA.debugLineNum = 2069;BA.debugLine="Direction.Put(\"bottom\", \"Bottom\")";
_direction.Put((Object)("bottom"),(Object)("Bottom"));
 //BA.debugLineNum = 2070;BA.debugLine="Direction.Put(\"left\", \"Left\")";
_direction.Put((Object)("left"),(Object)("Left"));
 //BA.debugLineNum = 2071;BA.debugLine="Direction.Put(\"right\", \"Right\")";
_direction.Put((Object)("right"),(Object)("Right"));
 //BA.debugLineNum = 2073;BA.debugLine="Dim fList As List";
_flist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2074;BA.debugLine="fList.Initialize";
_flist.Initialize();
 //BA.debugLineNum = 2075;BA.debugLine="fList.AddAll(Array(\"float-left\", \"float-right\", \"";
_flist.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("float-left"),(Object)("float-right"),(Object)("float-none"),(Object)("float-sm-left"),(Object)("float-sm-right"),(Object)("float-sm-none"),(Object)("float-md-left"),(Object)("float-md-right"),(Object)("float-md-none"),(Object)("float-lg-left"),(Object)("float-lg-right"),(Object)("float-lg-none"),(Object)("float-xl-left"),(Object)("float-xl-right"),(Object)("float-xl-none")}));
 //BA.debugLineNum = 2078;BA.debugLine="Floats = vue.List2MapSimple(fList, True)";
_floats = _vue._list2mapsimple /*anywheresoftware.b4a.objects.collections.Map*/ (_flist,__c.True);
 //BA.debugLineNum = 2079;BA.debugLine="Floats.Put(\"\",\"None\")";
_floats.Put((Object)(""),(Object)("None"));
 //BA.debugLineNum = 2081;BA.debugLine="Dim xList As List = vue.NewList";
_xlist = new anywheresoftware.b4a.objects.collections.List();
_xlist = _vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 2082;BA.debugLine="xList.AddAll(Array(\"medium\",\"xx-small\",\"x-small\",";
_xlist.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("medium"),(Object)("xx-small"),(Object)("x-small"),(Object)("small"),(Object)("large"),(Object)("x-large"),(Object)("xx-large"),(Object)("smaller"),(Object)("larger"),(Object)("initial"),(Object)("inherit")}));
 //BA.debugLineNum = 2084;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _eventhandler,String _appname) throws Exception{
innerInitialize(_ba);
b4j.example.vmprogresscircular _vpc = null;
 //BA.debugLineNum = 293;BA.debugLine="Public Sub Initialize(eventHandler As Object, appN";
 //BA.debugLineNum = 295;BA.debugLine="vue.Initialize(eventHandler)";
_vue._initialize /*String*/ (ba,_eventhandler);
 //BA.debugLineNum = 296;BA.debugLine="Modules.Initialize";
_modules.Initialize();
 //BA.debugLineNum = 297;BA.debugLine="Modules = vue.modules";
_modules = _vue._modules /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 298;BA.debugLine="placeHolder = 0";
_placeholder = (int) (0);
 //BA.debugLineNum = 299;BA.debugLine="ShowWarnings = True";
_showwarnings = __c.True;
 //BA.debugLineNum = 300;BA.debugLine="vue.ShowWarnings = True";
_vue._showwarnings /*boolean*/  = __c.True;
 //BA.debugLineNum = 301;BA.debugLine="Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 302;BA.debugLine="drawers.Initialize";
_drawers.Initialize();
 //BA.debugLineNum = 303;BA.debugLine="Position.initialize";
_position.Initialize();
 //BA.debugLineNum = 304;BA.debugLine="Position.Put(\"static\",\"static\")";
_position.Put((Object)("static"),(Object)("static"));
 //BA.debugLineNum = 305;BA.debugLine="Position.Put(\"relative\",\"relative\")";
_position.Put((Object)("relative"),(Object)("relative"));
 //BA.debugLineNum = 306;BA.debugLine="Position.Put(\"fixed\",\"fixe\")";
_position.Put((Object)("fixed"),(Object)("fixe"));
 //BA.debugLineNum = 307;BA.debugLine="Position.Put(\"absolute\",\"absolute\")";
_position.Put((Object)("absolute"),(Object)("absolute"));
 //BA.debugLineNum = 308;BA.debugLine="Position.Put(\"sticky\", \"sticky\")";
_position.Put((Object)("sticky"),(Object)("sticky"));
 //BA.debugLineNum = 309;BA.debugLine="Position.Put(\"\", \"none\")";
_position.Put((Object)(""),(Object)("none"));
 //BA.debugLineNum = 310;BA.debugLine="RTL = False";
_rtl = __c.False;
 //BA.debugLineNum = 311;BA.debugLine="Dark = False";
_dark = __c.False;
 //BA.debugLineNum = 312;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 313;BA.debugLine="lang = \"en\"";
_lang = "en";
 //BA.debugLineNum = 314;BA.debugLine="Floats.Initialize";
_floats.Initialize();
 //BA.debugLineNum = 315;BA.debugLine="FontSizes.Initialize";
_fontsizes.Initialize();
 //BA.debugLineNum = 316;BA.debugLine="bUseRouter = False";
_buserouter = __c.False;
 //BA.debugLineNum = 318;BA.debugLine="RouterView.Initialize(vue, \"\").SetTag(\"router-vie";
_routerview._initialize /*b4j.example.vmelement*/ (ba,_vue,"")._settag /*b4j.example.vmelement*/ ("router-view");
 //BA.debugLineNum = 321;BA.debugLine="Pages.initialize";
_pages.Initialize();
 //BA.debugLineNum = 323;BA.debugLine="VApp.Initialize(vue, appName).SetTag(\"v-app\")";
_vapp._initialize /*b4j.example.vmelement*/ (ba,_vue,_appname)._settag /*b4j.example.vmelement*/ ("v-app");
 //BA.debugLineNum = 324;BA.debugLine="VContent.Initialize(vue, \"main\").SetTag(\"v-main\")";
_vcontent._initialize /*b4j.example.vmelement*/ (ba,_vue,"main")._settag /*b4j.example.vmelement*/ ("v-main");
 //BA.debugLineNum = 325;BA.debugLine="Container.Initialize(vue, \"container\", eventHandl";
_container._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"container",_eventhandler)._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 327;BA.debugLine="Drawer.Initialize(vue, \"drawer\", eventHandler)";
_drawer._initialize /*b4j.example.vmnavigationdrawer*/ (ba,_vue,"drawer",_eventhandler);
 //BA.debugLineNum = 328;BA.debugLine="Drawer.SetApp(True)";
_drawer._setapp /*b4j.example.vmnavigationdrawer*/ (__c.True);
 //BA.debugLineNum = 329;BA.debugLine="Drawer.SetVModel(\"drawer\")";
_drawer._setvmodel /*b4j.example.vmnavigationdrawer*/ ("drawer");
 //BA.debugLineNum = 331;BA.debugLine="NavBar.Initialize(vue, \"appbar\", eventHandler)";
_navbar._initialize /*b4j.example.vmtoolbar*/ (ba,_vue,"appbar",_eventhandler);
 //BA.debugLineNum = 332;BA.debugLine="NavBar.SetAppBar(True)";
_navbar._setappbar /*b4j.example.vmtoolbar*/ (__c.True);
 //BA.debugLineNum = 333;BA.debugLine="NavBar.Show";
_navbar._show /*String*/ ();
 //BA.debugLineNum = 335;BA.debugLine="Footer.Initialize(vue, \"footer\", eventHandler)";
_footer._initialize /*b4j.example.vmfooter*/ (ba,_vue,"footer",_eventhandler);
 //BA.debugLineNum = 336;BA.debugLine="Footer.SetApp(True)";
_footer._setapp /*b4j.example.vmfooter*/ (__c.True);
 //BA.debugLineNum = 338;BA.debugLine="BottomNav.Initialize(vue, \"bottomnav\", eventHandl";
_bottomnav._initialize /*b4j.example.vmbottomnavigation*/ (ba,_vue,"bottomnav",_eventhandler);
 //BA.debugLineNum = 339;BA.debugLine="BottomNav.SetApp(True)";
_bottomnav._setapp /*b4j.example.vmbottomnavigation*/ (__c.True);
 //BA.debugLineNum = 340;BA.debugLine="BottomNav.Hide";
_bottomnav._hide /*b4j.example.vmbottomnavigation*/ ();
 //BA.debugLineNum = 342;BA.debugLine="SnackBar = CreateSnackBar(\"snack\", eventHandler).";
_snackbar = _createsnackbar("snack",_eventhandler)._setcolor /*b4j.example.vmsnackbar*/ ("")._setbottom /*b4j.example.vmsnackbar*/ (__c.False)._setright /*b4j.example.vmsnackbar*/ (__c.False);
 //BA.debugLineNum = 343;BA.debugLine="Notification = CreateAlert(\"notif\", eventHandler,";
_notification = _createalert("notif",_eventhandler,"");
 //BA.debugLineNum = 344;BA.debugLine="Notification.SetContent(\"Notification\")";
_notification._setcontent /*b4j.example.vmalert*/ ("Notification");
 //BA.debugLineNum = 345;BA.debugLine="Notification.SetBorder(\"left\")";
_notification._setborder /*b4j.example.vmalert*/ ("left");
 //BA.debugLineNum = 346;BA.debugLine="Notification.SetColor(\"green\")";
_notification._setcolor /*b4j.example.vmalert*/ ("green");
 //BA.debugLineNum = 347;BA.debugLine="Notification.SetColoredBorder(True)";
_notification._setcoloredborder /*b4j.example.vmalert*/ (__c.True);
 //BA.debugLineNum = 348;BA.debugLine="Notification.SetDismissible(True)";
_notification._setdismissible /*b4j.example.vmalert*/ (__c.True);
 //BA.debugLineNum = 349;BA.debugLine="Notification.SetIcon(\"\")";
_notification._seticon /*b4j.example.vmalert*/ ("");
 //BA.debugLineNum = 350;BA.debugLine="Notification.SetType(\"\")";
_notification._settype /*b4j.example.vmalert*/ ("");
 //BA.debugLineNum = 351;BA.debugLine="Notification.Hide";
_notification._hide /*b4j.example.vmalert*/ ();
 //BA.debugLineNum = 354;BA.debugLine="Overlay.Initialize(vue, \"pageloader\", eventHandle";
_overlay._initialize /*b4j.example.vmoverlay*/ (ba,_vue,"pageloader",_eventhandler);
 //BA.debugLineNum = 356;BA.debugLine="Animate.Initialize(vue, \"appanimate\", eventHandle";
_animate._initialize /*b4j.example.vmtransition*/ (ba,_vue,"appanimate",_eventhandler)._settype /*b4j.example.vmtransition*/ (_transition_fade);
 //BA.debugLineNum = 357;BA.debugLine="Animate.SetMode(\"out-in\").SetHideOnLeave(True)";
_animate._setmode /*b4j.example.vmtransition*/ ("out-in")._sethideonleave /*b4j.example.vmtransition*/ (__c.True);
 //BA.debugLineNum = 359;BA.debugLine="Dim vpc As VMProgressCircular";
_vpc = new b4j.example.vmprogresscircular();
 //BA.debugLineNum = 360;BA.debugLine="vpc.Initialize(vue, \"pageloaderprogress\", eventHa";
_vpc._initialize /*b4j.example.vmprogresscircular*/ (ba,_vue,"pageloaderprogress",_eventhandler);
 //BA.debugLineNum = 361;BA.debugLine="vpc.SetSize(200)";
_vpc._setsize /*b4j.example.vmprogresscircular*/ (BA.NumberToString(200));
 //BA.debugLineNum = 362;BA.debugLine="vpc.SetIndeterminate(True)";
_vpc._setindeterminate /*b4j.example.vmprogresscircular*/ (__c.True);
 //BA.debugLineNum = 363;BA.debugLine="vpc.SetColor(\"blue\")";
_vpc._setcolor /*b4j.example.vmprogresscircular*/ ("blue");
 //BA.debugLineNum = 364;BA.debugLine="Overlay.AddComponent(vpc.ToString)";
_overlay._addcomponent /*b4j.example.vmoverlay*/ (_vpc._tostring /*String*/ ());
 //BA.debugLineNum = 366;BA.debugLine="Drawer.Hide";
_drawer._hide /*b4j.example.vmnavigationdrawer*/ ();
 //BA.debugLineNum = 367;BA.debugLine="Footer.hide";
_footer._hide /*b4j.example.vmfooter*/ ();
 //BA.debugLineNum = 368;BA.debugLine="Overlay.hide";
_overlay._hide /*b4j.example.vmoverlay*/ ();
 //BA.debugLineNum = 369;BA.debugLine="BottomNav.hide";
_bottomnav._hide /*b4j.example.vmbottomnavigation*/ ();
 //BA.debugLineNum = 371;BA.debugLine="vue.SetData(\"confirmtitle\", \"Confirm\")";
_vue._setdata /*b4j.example.bananovue*/ ("confirmtitle",(Object)("Confirm"));
 //BA.debugLineNum = 372;BA.debugLine="vue.SetData(\"btnconfirmcancellabel\", \"Cancel\")";
_vue._setdata /*b4j.example.bananovue*/ ("btnconfirmcancellabel",(Object)("Cancel"));
 //BA.debugLineNum = 373;BA.debugLine="vue.SetData(\"btnconfirmoklabel\", \"Ok\")";
_vue._setdata /*b4j.example.bananovue*/ ("btnconfirmoklabel",(Object)("Ok"));
 //BA.debugLineNum = 374;BA.debugLine="vue.SetData(\"confirmcontent\",\"Confirm Message\")";
_vue._setdata /*b4j.example.bananovue*/ ("confirmcontent",(Object)("Confirm Message"));
 //BA.debugLineNum = 375;BA.debugLine="vue.SetData(\"confirmkey\", \"confirm\")";
_vue._setdata /*b4j.example.bananovue*/ ("confirmkey",(Object)("confirm"));
 //BA.debugLineNum = 377;BA.debugLine="Confirm = CreateDialog(\"confirm\", Me).SetWidth(\"6";
_confirm = _createdialog("confirm",this)._setwidth /*b4j.example.vmdialog*/ ("600")._setmodal /*b4j.example.vmdialog*/ (__c.True);
 //BA.debugLineNum = 378;BA.debugLine="Confirm.SetTitle(\"Title\")";
_confirm._settitle /*b4j.example.vmdialog*/ ("Title");
 //BA.debugLineNum = 379;BA.debugLine="Confirm.SetContent(\"Confirm Message\")";
_confirm._setcontent /*b4j.example.vmdialog*/ ("Confirm Message");
 //BA.debugLineNum = 380;BA.debugLine="Confirm.AddCancel(\"btnConfirmCancel\", \"Cancel\")";
_confirm._addcancel /*b4j.example.vmdialog*/ ("btnConfirmCancel","Cancel");
 //BA.debugLineNum = 381;BA.debugLine="Confirm.AddOK(\"btnConfirmOk\", \"Ok\")";
_confirm._addok /*b4j.example.vmdialog*/ ("btnConfirmOk","Ok");
 //BA.debugLineNum = 382;BA.debugLine="Confirm.Hide";
_confirm._hide /*b4j.example.vmdialog*/ ();
 //BA.debugLineNum = 384;BA.debugLine="Alert = CreateDialog(\"alert\", Me).SetWidth(\"600\")";
_alert = _createdialog("alert",this)._setwidth /*b4j.example.vmdialog*/ ("600")._setmodal /*b4j.example.vmdialog*/ (__c.True);
 //BA.debugLineNum = 385;BA.debugLine="Alert.SetTitle(\"Title\")";
_alert._settitle /*b4j.example.vmdialog*/ ("Title");
 //BA.debugLineNum = 386;BA.debugLine="Alert.SetContent(\"Alert Message\")";
_alert._setcontent /*b4j.example.vmdialog*/ ("Alert Message");
 //BA.debugLineNum = 387;BA.debugLine="Alert.AddOK(\"btnalertOk\", \"Ok\")";
_alert._addok /*b4j.example.vmdialog*/ ("btnalertOk","Ok");
 //BA.debugLineNum = 388;BA.debugLine="Alert.Hide";
_alert._hide /*b4j.example.vmdialog*/ ();
 //BA.debugLineNum = 390;BA.debugLine="InitColors";
_initcolors();
 //BA.debugLineNum = 391;BA.debugLine="UsesDrawer = True";
_usesdrawer = __c.True;
 //BA.debugLineNum = 392;BA.debugLine="UsesNavBar = True";
_usesnavbar = __c.True;
 //BA.debugLineNum = 393;BA.debugLine="UsesFooter = True";
_usesfooter = __c.True;
 //BA.debugLineNum = 394;BA.debugLine="UsesBottomNav = True";
_usesbottomnav = __c.True;
 //BA.debugLineNum = 395;BA.debugLine="UsesOverlay = True";
_usesoverlay = __c.True;
 //BA.debugLineNum = 396;BA.debugLine="UsesLoader = True";
_usesloader = __c.True;
 //BA.debugLineNum = 397;BA.debugLine="UsesSnackBar = True";
_usessnackbar = __c.True;
 //BA.debugLineNum = 398;BA.debugLine="UsesDialog = True";
_usesdialog = __c.True;
 //BA.debugLineNum = 399;BA.debugLine="UsesNotification = True";
_usesnotification = __c.True;
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return "";
}
public int  _instr(String _searchit,String _searchfor) throws Exception{
 //BA.debugLineNum = 1812;BA.debugLine="Sub InStr(searchit As String, searchfor As String)";
 //BA.debugLineNum = 1813;BA.debugLine="Return vue.InStr(searchit, searchfor)";
if (true) return _vue._instr /*int*/ (_searchit,_searchfor);
 //BA.debugLineNum = 1814;BA.debugLine="End Sub";
return 0;
}
public String  _join(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
 //BA.debugLineNum = 1666;BA.debugLine="Sub Join(delimiter As String, lst As List) As Stri";
 //BA.debugLineNum = 1667;BA.debugLine="Return vue.Join(delimiter, lst)";
if (true) return _vue._join /*String*/ (_delimiter,_lst);
 //BA.debugLineNum = 1668;BA.debugLine="End Sub";
return "";
}
public String  _joinitems(String _delimiter,String _squote,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
String _xfld = "";
 //BA.debugLineNum = 1009;BA.debugLine="Sub JoinItems(delimiter As String, sQuote As Strin";
 //BA.debugLineNum = 1010;BA.debugLine="If lst.Size = 0 Then Return \"\"";
if (_lst.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 1011;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 1012;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1013;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 1014;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1015;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 1016;BA.debugLine="Dim xfld As String = $\"${fld}\"$";
_xfld = (""+__c.SmartStringFormatter("",(Object)(_fld))+"");
 //BA.debugLineNum = 1017;BA.debugLine="xfld = sQuote & xfld & sQuote";
_xfld = _squote+_xfld+_squote;
 //BA.debugLineNum = 1018;BA.debugLine="sb.Append(xfld)";
_sb.Append(_xfld);
 //BA.debugLineNum = 1019;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 1020;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 1021;BA.debugLine="Dim xfld As String = $\"${fld}\"$";
_xfld = (""+__c.SmartStringFormatter("",(Object)(_fld))+"");
 //BA.debugLineNum = 1022;BA.debugLine="xfld = sQuote & xfld & sQuote";
_xfld = _squote+_xfld+_squote;
 //BA.debugLineNum = 1023;BA.debugLine="sb.Append(delimiter).Append(xfld)";
_sb.Append(_delimiter).Append(_xfld);
 }
};
 //BA.debugLineNum = 1025;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1026;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _joinlists(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
 //BA.debugLineNum = 1671;BA.debugLine="Sub JoinLists(lst As List) As List";
 //BA.debugLineNum = 1672;BA.debugLine="Return vue.JoinLists(lst)";
if (true) return _vue._joinlists /*anywheresoftware.b4a.objects.collections.List*/ (_lst);
 //BA.debugLineNum = 1673;BA.debugLine="End Sub";
return null;
}
public String  _joinmapkeys(anywheresoftware.b4a.objects.collections.Map _m,String _delim) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _strkey = "";
 //BA.debugLineNum = 983;BA.debugLine="Sub JoinMapKeys(m As Map, delim As String) As Stri";
 //BA.debugLineNum = 984;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 985;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 986;BA.debugLine="Dim kTot As Int = m.Size - 1";
_ktot = (int) (_m.getSize()-1);
 //BA.debugLineNum = 987;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 988;BA.debugLine="Dim strKey As String = m.getkeyat(0)";
_strkey = BA.ObjectToString(_m.GetKeyAt((int) (0)));
 //BA.debugLineNum = 989;BA.debugLine="sb.Append(strKey)";
_sb.Append(_strkey);
 //BA.debugLineNum = 990;BA.debugLine="For kCnt = 1 To kTot";
{
final int step7 = 1;
final int limit7 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit7 ;_kcnt = _kcnt + step7 ) {
 //BA.debugLineNum = 991;BA.debugLine="Dim strKey As String = m.getkeyat(kCnt)";
_strkey = BA.ObjectToString(_m.GetKeyAt(_kcnt));
 //BA.debugLineNum = 992;BA.debugLine="sb.Append(delim).append(strKey)";
_sb.Append(_delim).Append(_strkey);
 }
};
 //BA.debugLineNum = 994;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 995;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _joinmaps(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
 //BA.debugLineNum = 2630;BA.debugLine="Sub JoinMaps(lst As List) As Map";
 //BA.debugLineNum = 2631;BA.debugLine="Return vue.JoinMaps(lst)";
if (true) return _vue._joinmaps /*anywheresoftware.b4a.objects.collections.Map*/ (_lst);
 //BA.debugLineNum = 2632;BA.debugLine="End Sub";
return null;
}
public String  _joinnonblanks(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
 //BA.debugLineNum = 2626;BA.debugLine="Sub JoinNonBlanks(delimiter As String, lst As List";
 //BA.debugLineNum = 2627;BA.debugLine="Return vue.JoinNonBlanks(delimiter, lst)";
if (true) return _vue._joinnonblanks /*String*/ (_delimiter,_lst);
 //BA.debugLineNum = 2628;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _json2list(String _strvalue) throws Exception{
 //BA.debugLineNum = 1289;BA.debugLine="Sub Json2List(strValue As String) As List";
 //BA.debugLineNum = 1290;BA.debugLine="Return vue.Json2List(strValue)";
if (true) return _vue._json2list /*anywheresoftware.b4a.objects.collections.List*/ (_strvalue);
 //BA.debugLineNum = 1291;BA.debugLine="End Sub";
return null;
}
public String  _jsonpretty(Object _m) throws Exception{
 //BA.debugLineNum = 1840;BA.debugLine="Sub JSONPretty(m As Object) As String";
 //BA.debugLineNum = 1841;BA.debugLine="Return vue.JSONPretty(m)";
if (true) return _vue._jsonpretty /*String*/ (_m);
 //BA.debugLineNum = 1842;BA.debugLine="End Sub";
return "";
}
public String  _jsonsetproperty(String _sjson,anywheresoftware.b4a.objects.collections.Map _updates) throws Exception{
 //BA.debugLineNum = 1820;BA.debugLine="Sub JSONSetProperty(sjson As String, updates As Ma";
 //BA.debugLineNum = 1821;BA.debugLine="Return vue.JSONSetProperty(sjson, updates)";
if (true) return _vue._jsonsetproperty /*String*/ (_sjson,_updates);
 //BA.debugLineNum = 1822;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _keyvalues2map(String _delim,String _keys,String _values) throws Exception{
 //BA.debugLineNum = 1190;BA.debugLine="Sub KeyValues2Map(delim As String, keys As String,";
 //BA.debugLineNum = 1191;BA.debugLine="Return vue.KeyValues2Map(delim, keys, values)";
if (true) return _vue._keyvalues2map /*anywheresoftware.b4a.objects.collections.Map*/ (_delim,_keys,_values);
 //BA.debugLineNum = 1192;BA.debugLine="End Sub";
return null;
}
public String  _leftstring(String _text,long _llength) throws Exception{
 //BA.debugLineNum = 3037;BA.debugLine="Sub LeftString(Text As String, lLength As Long)As";
 //BA.debugLineNum = 3038;BA.debugLine="Return vue.LeftString(Text, lLength)";
if (true) return _vue._leftstring /*String*/ (_text,_llength);
 //BA.debugLineNum = 3039;BA.debugLine="End Sub";
return "";
}
public int  _len(String _text) throws Exception{
 //BA.debugLineNum = 1867;BA.debugLine="private Sub Len(Text As String) As Int";
 //BA.debugLineNum = 1868;BA.debugLine="Return Text.Length";
if (true) return _text.length();
 //BA.debugLineNum = 1869;BA.debugLine="End Sub";
return 0;
}
public String  _list2arrayvariable(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 1129;BA.debugLine="Sub List2ArrayVariable(lst As List) As String";
 //BA.debugLineNum = 1130;BA.debugLine="If lst.Size = 0 Then";
if (_lst.getSize()==0) { 
 //BA.debugLineNum = 1131;BA.debugLine="Return $\"\"\"\"$";
if (true) return ("\"\"");
 };
 //BA.debugLineNum = 1133;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 1134;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1135;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 1136;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1137;BA.debugLine="fld = $\"\"${lst.Get(0)}\"\"$";
_fld = ("\""+__c.SmartStringFormatter("",_lst.Get((int) (0)))+"\"");
 //BA.debugLineNum = 1138;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 1139;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 1140;BA.debugLine="fld = $\"\"${lst.Get(i)}\"\"$";
_fld = ("\""+__c.SmartStringFormatter("",_lst.Get(_i))+"\"");
 //BA.debugLineNum = 1141;BA.debugLine="sb.Append(\",\").Append(fld)";
_sb.Append(",").Append(_fld);
 }
};
 //BA.debugLineNum = 1143;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1144;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _list2map(anywheresoftware.b4a.objects.collections.List _lst,String _keyname,String _valuename) throws Exception{
 //BA.debugLineNum = 2323;BA.debugLine="Sub List2Map(lst As List, keyName As String, value";
 //BA.debugLineNum = 2324;BA.debugLine="Return vue.List2Options(lst, keyName, valueName)";
if (true) return _vue._list2options /*anywheresoftware.b4a.objects.collections.Map*/ (_lst,_keyname,_valuename);
 //BA.debugLineNum = 2325;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _list2options(anywheresoftware.b4a.objects.collections.List _lst,String _keyname,String _valuename) throws Exception{
 //BA.debugLineNum = 2318;BA.debugLine="Sub List2Options(lst As List, keyName As String, v";
 //BA.debugLineNum = 2319;BA.debugLine="Return vue.List2Options(lst, keyName, valueName)";
if (true) return _vue._list2options /*anywheresoftware.b4a.objects.collections.Map*/ (_lst,_keyname,_valuename);
 //BA.debugLineNum = 2320;BA.debugLine="End Sub";
return null;
}
public int  _listofmapsrecordpos(anywheresoftware.b4a.objects.collections.List _lst,String _k,String _v) throws Exception{
int _ltot = 0;
int _lcnt = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _sk = "";
 //BA.debugLineNum = 1034;BA.debugLine="Sub ListOfMapsRecordPos(lst As List, k As String,";
 //BA.debugLineNum = 1035;BA.debugLine="Dim lTot As Int = lst.Size - 1";
_ltot = (int) (_lst.getSize()-1);
 //BA.debugLineNum = 1036;BA.debugLine="Dim lCnt As Int";
_lcnt = 0;
 //BA.debugLineNum = 1037;BA.debugLine="For lCnt = 0 To lTot";
{
final int step3 = 1;
final int limit3 = _ltot;
_lcnt = (int) (0) ;
for (;_lcnt <= limit3 ;_lcnt = _lcnt + step3 ) {
 //BA.debugLineNum = 1038;BA.debugLine="Dim m As Map = lst.Get(lCnt)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_lst.Get(_lcnt)));
 //BA.debugLineNum = 1039;BA.debugLine="Dim sk As String = m.GetDefault(k, \"\")";
_sk = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 1040;BA.debugLine="If sk.EqualsIgnoreCase(v) Then";
if (_sk.equalsIgnoreCase(_v)) { 
 //BA.debugLineNum = 1041;BA.debugLine="Return lCnt";
if (true) return _lcnt;
 };
 }
};
 //BA.debugLineNum = 1044;BA.debugLine="Return -1";
if (true) return (int) (-1);
 //BA.debugLineNum = 1045;BA.debugLine="End Sub";
return 0;
}
public String  _logstate(String _statename) throws Exception{
Object _rec = null;
 //BA.debugLineNum = 1203;BA.debugLine="Sub LogState(stateName As String)";
 //BA.debugLineNum = 1204;BA.debugLine="stateName = stateName.ToLowerCase";
_statename = _statename.toLowerCase();
 //BA.debugLineNum = 1205;BA.debugLine="Dim rec As Object = vue.GetData(stateName)";
_rec = _vue._getdata /*Object*/ (_statename);
 //BA.debugLineNum = 1206;BA.debugLine="Log(rec)";
__c.Log(BA.ObjectToString(_rec));
 //BA.debugLineNum = 1207;BA.debugLine="End Sub";
return "";
}
public String  _loremipsum() throws Exception{
 //BA.debugLineNum = 3862;BA.debugLine="Sub LoremIpsum As String";
 //BA.debugLineNum = 3863;BA.debugLine="Return BANanoShared.Rand_LoremIpsum(1)";
if (true) return _bananoshared._rand_loremipsum /*String*/ ((int) (1));
 //BA.debugLineNum = 3864;BA.debugLine="End Sub";
return "";
}
public String  _makeboolean(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
 //BA.debugLineNum = 2617;BA.debugLine="Sub MakeBoolean(m As Map, xkeys As List)";
 //BA.debugLineNum = 2618;BA.debugLine="vue.MakeBoolean(m, xkeys)";
_vue._makeboolean /*String*/ (_m,_xkeys);
 //BA.debugLineNum = 2619;BA.debugLine="End Sub";
return "";
}
public String  _makedate(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
 //BA.debugLineNum = 2634;BA.debugLine="Sub MakeDate(m As Map, xkeys As List)";
 //BA.debugLineNum = 2635;BA.debugLine="vue.MakeDate(m, xkeys)";
_vue._makedate /*String*/ (_m,_xkeys);
 //BA.debugLineNum = 2636;BA.debugLine="End Sub";
return "";
}
public String  _makedouble(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
 //BA.debugLineNum = 2609;BA.debugLine="Sub MakeDouble(m As Map, xkeys As List)";
 //BA.debugLineNum = 2610;BA.debugLine="vue.MakeDouble(m, xkeys)";
_vue._makedouble /*String*/ (_m,_xkeys);
 //BA.debugLineNum = 2611;BA.debugLine="End Sub";
return "";
}
public String  _makeinteger(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
 //BA.debugLineNum = 2613;BA.debugLine="Sub MakeInteger(m As Map, xkeys As List)";
 //BA.debugLineNum = 2614;BA.debugLine="vue.MakeInteger(m, xkeys)";
_vue._makeinteger /*String*/ (_m,_xkeys);
 //BA.debugLineNum = 2615;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _makelowercase(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 3015;BA.debugLine="Sub MakeLowerCase(m As Map) As Map";
 //BA.debugLineNum = 3016;BA.debugLine="Return vue.MakeLowerCase(m)";
if (true) return _vue._makelowercase /*anywheresoftware.b4a.objects.collections.Map*/ (_m);
 //BA.debugLineNum = 3017;BA.debugLine="End Sub";
return null;
}
public String  _makepx(String _svalue) throws Exception{
 //BA.debugLineNum = 2643;BA.debugLine="Sub MakePx(sValue As String) As String";
 //BA.debugLineNum = 2644;BA.debugLine="Return vue.MakePx(sValue)";
if (true) return _vue._makepx /*String*/ (_svalue);
 //BA.debugLineNum = 2645;BA.debugLine="End Sub";
return "";
}
public String  _maketrim(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
 //BA.debugLineNum = 2621;BA.debugLine="Sub MakeTrim(m As Map, xkeys As List)";
 //BA.debugLineNum = 2622;BA.debugLine="vue.MakeTrim(m, xkeys)";
_vue._maketrim /*String*/ (_m,_xkeys);
 //BA.debugLineNum = 2623;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _map2options(anywheresoftware.b4a.objects.collections.Map _m,String _keyname,String _valuename) throws Exception{
 //BA.debugLineNum = 2328;BA.debugLine="Sub Map2Options(m As Map, keyName As String, value";
 //BA.debugLineNum = 2329;BA.debugLine="Return vue.Map2Options(m, keyName, valueName)";
if (true) return _vue._map2options /*anywheresoftware.b4a.objects.collections.List*/ (_m,_keyname,_valuename);
 //BA.debugLineNum = 2330;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _mapkeys2list(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 1600;BA.debugLine="Sub MapKeys2List(m As Map) As List";
 //BA.debugLineNum = 1601;BA.debugLine="Return vue.MapKeys2List(m)";
if (true) return _vue._mapkeys2list /*anywheresoftware.b4a.objects.collections.List*/ (_m);
 //BA.debugLineNum = 1602;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _mergemaps(anywheresoftware.b4a.objects.collections.Map _oldm,anywheresoftware.b4a.objects.collections.Map _newm) throws Exception{
 //BA.debugLineNum = 2087;BA.debugLine="Sub MergeMaps(oldm As Map, newm As Map) As Map";
 //BA.debugLineNum = 2088;BA.debugLine="Return vue.MergeMaps(oldm, newm)";
if (true) return _vue._mergemaps /*anywheresoftware.b4a.objects.collections.Map*/ (_oldm,_newm);
 //BA.debugLineNum = 2089;BA.debugLine="End Sub";
return null;
}
public String  _midstring2(String _text,int _start) throws Exception{
 //BA.debugLineNum = 2966;BA.debugLine="Sub MidString2(Text As String, Start As Int) As St";
 //BA.debugLineNum = 2967;BA.debugLine="Return vue.MidString2(Text, Start)";
if (true) return _vue._midstring2 /*String*/ (_text,_start);
 //BA.debugLineNum = 2968;BA.debugLine="End Sub";
return "";
}
public boolean  _moduleexist(String _tagname) throws Exception{
boolean _b = false;
 //BA.debugLineNum = 960;BA.debugLine="Sub ModuleExist(tagName As String) As Boolean";
 //BA.debugLineNum = 961;BA.debugLine="tagName = tagName.tolowercase";
_tagname = _tagname.toLowerCase();
 //BA.debugLineNum = 962;BA.debugLine="Dim b As Boolean = Modules.ContainsKey(tagName)";
_b = _modules.ContainsKey((Object)(_tagname));
 //BA.debugLineNum = 963;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 964;BA.debugLine="End Sub";
return false;
}
public String  _monthnow() throws Exception{
 //BA.debugLineNum = 1661;BA.debugLine="Public Sub MonthNow() As String";
 //BA.debugLineNum = 1662;BA.debugLine="Return vue.monthnow";
if (true) return _vue._monthnow /*String*/ ();
 //BA.debugLineNum = 1663;BA.debugLine="End Sub";
return "";
}
public String  _mvfield(String _svalue,int _iposition,String _delimiter) throws Exception{
 //BA.debugLineNum = 1851;BA.debugLine="Sub MvField(sValue As String, iPosition As Int, De";
 //BA.debugLineNum = 1852;BA.debugLine="Return vue.MvField(sValue, iPosition, Delimiter)";
if (true) return _vue._mvfield /*String*/ (_svalue,_iposition,_delimiter);
 //BA.debugLineNum = 1853;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _newautocompletedatasource(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,boolean _brequired,boolean _bmultiple,String _splaceholder,String _sourcetable,String _sourcefield,String _displayfield,boolean _returnobject,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 3502;BA.debugLine="Sub NewAutoCompleteDataSource(eventHandler As Obje";
 //BA.debugLineNum = 3503;BA.debugLine="Dim el As VMSelect = CreateSelect(sname, eventHan";
_el = _createselect(_sname,_eventhandler)._setautocomplete /*b4j.example.vmselect*/ ();
 //BA.debugLineNum = 3504;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmselect*/ (_bstatic);
 //BA.debugLineNum = 3505;BA.debugLine="el.Setlabel(sLabel)";
_el._setlabel /*b4j.example.vmselect*/ (_slabel);
 //BA.debugLineNum = 3506;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmselect*/ (_brequired);
 //BA.debugLineNum = 3507;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmselect*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 3508;BA.debugLine="el.SetPlaceholder(sPlaceHolder)";
_el._setplaceholder /*b4j.example.vmselect*/ (_splaceholder);
 //BA.debugLineNum = 3509;BA.debugLine="el.SetHint(sHelperText)";
_el._sethint /*b4j.example.vmselect*/ (_shelpertext);
 //BA.debugLineNum = 3510;BA.debugLine="el.SetMultiple(bMultiple)";
_el._setmultiple /*b4j.example.vmselect*/ (_bmultiple);
 //BA.debugLineNum = 3511;BA.debugLine="el.SetDataSource(sourceTable, sourceField, displa";
_el._setdatasource /*b4j.example.vmselect*/ (_sourcetable,_sourcefield,_displayfield,_returnobject);
 //BA.debugLineNum = 3512;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmselect*/ (_vmodel);
 //BA.debugLineNum = 3513;BA.debugLine="el.SetRules(True)";
_el._setrules /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 3514;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmselect*/ (__c.False);
 //BA.debugLineNum = 3515;BA.debugLine="el.SetErrorMessages(True)";
_el._seterrormessages /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 3516;BA.debugLine="el.Combo.ErrorMessage = sErrorText";
_el._combo /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 3517;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3518;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _newautocompleteoptions(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,boolean _brequired,boolean _bmultiple,String _splaceholder,anywheresoftware.b4a.objects.collections.Map _optionsm,String _sourcefield,String _displayfield,boolean _returnobject,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 3484;BA.debugLine="Sub NewAutoCompleteOptions(eventHandler As Object,";
 //BA.debugLineNum = 3485;BA.debugLine="Dim el As VMSelect = CreateSelect(sname, eventHan";
_el = _createselect(_sname,_eventhandler)._setautocomplete /*b4j.example.vmselect*/ ();
 //BA.debugLineNum = 3486;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmselect*/ (_bstatic);
 //BA.debugLineNum = 3487;BA.debugLine="el.Setlabel(sLabel)";
_el._setlabel /*b4j.example.vmselect*/ (_slabel);
 //BA.debugLineNum = 3488;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmselect*/ (_brequired);
 //BA.debugLineNum = 3489;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmselect*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 3490;BA.debugLine="el.Setplaceholder(sPlaceHolder)";
_el._setplaceholder /*b4j.example.vmselect*/ (_splaceholder);
 //BA.debugLineNum = 3491;BA.debugLine="el.SetHint(sHelperText)";
_el._sethint /*b4j.example.vmselect*/ (_shelpertext);
 //BA.debugLineNum = 3492;BA.debugLine="el.Setmultiple(bMultiple)";
_el._setmultiple /*b4j.example.vmselect*/ (_bmultiple);
 //BA.debugLineNum = 3493;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmselect*/ (_vmodel);
 //BA.debugLineNum = 3494;BA.debugLine="el.SetOptions($\"${vmodel}items\"$, optionsm, sourc";
_el._setoptions /*b4j.example.vmselect*/ ((""+__c.SmartStringFormatter("",(Object)(_vmodel))+"items"),_optionsm,_sourcefield,_displayfield,_returnobject);
 //BA.debugLineNum = 3495;BA.debugLine="el.SetRules(True)";
_el._setrules /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 3496;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmselect*/ (__c.False);
 //BA.debugLineNum = 3497;BA.debugLine="el.SetErrorMessages(True)";
_el._seterrormessages /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 3498;BA.debugLine="el.Combo.ErrorMessage = sErrorText";
_el._combo /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 3499;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3500;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newblockquote(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 3651;BA.debugLine="Sub NewBLOCKQUOTE(bStatic As Boolean,sname As Stri";
 //BA.debugLineNum = 3652;BA.debugLine="Return NewLabel(bStatic,sname, sname, SIZE_BLOCKQ";
if (true) return _newlabel(_bstatic,_sname,_sname,_size_blockquote,_stext);
 //BA.debugLineNum = 3653;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _newbutton(Object _eventhandler,boolean _bstatic,String _sname,String _slabel,boolean _braised,boolean _bprimary,boolean _baccent,boolean _bfitwidth) throws Exception{
b4j.example.vmbutton _el = null;
 //BA.debugLineNum = 3472;BA.debugLine="Sub NewButton(eventHandler As Object,bStatic As Bo";
 //BA.debugLineNum = 3473;BA.debugLine="Dim el As VMButton = CreateButton(sname, eventHan";
_el = _createbutton(_sname,_eventhandler);
 //BA.debugLineNum = 3474;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 3475;BA.debugLine="el.SetLabel(sLabel)";
_el._setlabel /*b4j.example.vmbutton*/ (_slabel);
 //BA.debugLineNum = 3476;BA.debugLine="If bRaised = False Then el.SetTransparent(True)";
if (_braised==__c.False) { 
_el._settransparent /*b4j.example.vmbutton*/ (__c.True);};
 //BA.debugLineNum = 3477;BA.debugLine="If bPrimary Then el.SetPrimary(bPrimary)";
if (_bprimary) { 
_el._setprimary /*b4j.example.vmbutton*/ (_bprimary);};
 //BA.debugLineNum = 3478;BA.debugLine="If bAccent Then el.SetColor(\"accent\")";
if (_baccent) { 
_el._setcolor /*b4j.example.vmbutton*/ ("accent");};
 //BA.debugLineNum = 3479;BA.debugLine="If bFitWidth Then el.SetBlock(True)";
if (_bfitwidth) { 
_el._setblock /*b4j.example.vmbutton*/ (__c.True);};
 //BA.debugLineNum = 3480;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3481;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _newcheckbox(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,Object _svalue,Object _sunchecked,boolean _bprimary,int _itabindex) throws Exception{
b4j.example.vmcheckbox _el = null;
 //BA.debugLineNum = 3254;BA.debugLine="Sub NewCheckBox(eventHandler As Object, bStatic As";
 //BA.debugLineNum = 3255;BA.debugLine="Dim el As VMCheckBox = CreateCheckBox(sid, eventH";
_el = _createcheckbox(_sid,_eventhandler);
 //BA.debugLineNum = 3256;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmcheckbox*/ (_bstatic);
 //BA.debugLineNum = 3257;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmcheckbox*/ (_vmodel);
 //BA.debugLineNum = 3258;BA.debugLine="el.SetValue(svalue)";
_el._setvalue /*b4j.example.vmcheckbox*/ (BA.ObjectToString(_svalue));
 //BA.debugLineNum = 3259;BA.debugLine="el.SetTrueValue(svalue)";
_el._settruevalue /*b4j.example.vmcheckbox*/ (BA.ObjectToString(_svalue));
 //BA.debugLineNum = 3260;BA.debugLine="el.Setlabel(slabel)";
_el._setlabel /*b4j.example.vmcheckbox*/ (_slabel);
 //BA.debugLineNum = 3261;BA.debugLine="el.SetPrimary(bPrimary)";
_el._setprimary /*b4j.example.vmcheckbox*/ (_bprimary);
 //BA.debugLineNum = 3262;BA.debugLine="el.SetUncheckedValue(sunchecked)";
_el._setuncheckedvalue /*b4j.example.vmcheckbox*/ (_sunchecked);
 //BA.debugLineNum = 3263;BA.debugLine="el.SetFalseValue(sunchecked)";
_el._setfalsevalue /*b4j.example.vmcheckbox*/ (BA.ObjectToString(_sunchecked));
 //BA.debugLineNum = 3264;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmcheckbox*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 3265;BA.debugLine="vue.SetData(vmodel, sunchecked)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,_sunchecked);
 //BA.debugLineNum = 3266;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _newcombodatasource(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,boolean _brequired,boolean _bmultiple,String _splaceholder,String _sourcetable,String _sourcefield,String _displayfield,boolean _returnobject,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 3557;BA.debugLine="Sub NewComboDataSource(eventHandler As Object,bSta";
 //BA.debugLineNum = 3558;BA.debugLine="Dim el As VMSelect = CreateSelect(sname, eventHan";
_el = _createselect(_sname,_eventhandler)._setcombobox /*b4j.example.vmselect*/ ();
 //BA.debugLineNum = 3559;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmselect*/ (_bstatic);
 //BA.debugLineNum = 3560;BA.debugLine="el.Setlabel(sLabel)";
_el._setlabel /*b4j.example.vmselect*/ (_slabel);
 //BA.debugLineNum = 3561;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmselect*/ (_brequired);
 //BA.debugLineNum = 3562;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmselect*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 3563;BA.debugLine="el.SetPlaceholder(sPlaceHolder)";
_el._setplaceholder /*b4j.example.vmselect*/ (_splaceholder);
 //BA.debugLineNum = 3564;BA.debugLine="el.SetHint(sHelperText)";
_el._sethint /*b4j.example.vmselect*/ (_shelpertext);
 //BA.debugLineNum = 3565;BA.debugLine="el.SetMultiple(bMultiple)";
_el._setmultiple /*b4j.example.vmselect*/ (_bmultiple);
 //BA.debugLineNum = 3566;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmselect*/ (_vmodel);
 //BA.debugLineNum = 3567;BA.debugLine="el.SetDataSource(sourceTable, sourceField, displa";
_el._setdatasource /*b4j.example.vmselect*/ (_sourcetable,_sourcefield,_displayfield,_returnobject);
 //BA.debugLineNum = 3568;BA.debugLine="el.SetRules(True)";
_el._setrules /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 3569;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmselect*/ (__c.False);
 //BA.debugLineNum = 3570;BA.debugLine="el.SetErrorMessages(True)";
_el._seterrormessages /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 3571;BA.debugLine="el.Combo.ErrorMessage = sErrorText";
_el._combo /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 3572;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3573;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _newcombooptions(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,boolean _brequired,boolean _bmultiple,String _splaceholder,anywheresoftware.b4a.objects.collections.Map _optionsm,String _sourcefield,String _displayfield,boolean _returnobject,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 3576;BA.debugLine="Sub NewComboOptions(eventHandler As Object,bStatic";
 //BA.debugLineNum = 3577;BA.debugLine="Dim el As VMSelect = CreateSelect(sname, eventHan";
_el = _createselect(_sname,_eventhandler)._setcombobox /*b4j.example.vmselect*/ ();
 //BA.debugLineNum = 3578;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmselect*/ (_bstatic);
 //BA.debugLineNum = 3579;BA.debugLine="el.Setlabel(sLabel)";
_el._setlabel /*b4j.example.vmselect*/ (_slabel);
 //BA.debugLineNum = 3580;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmselect*/ (_brequired);
 //BA.debugLineNum = 3581;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmselect*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 3582;BA.debugLine="el.Setplaceholder(sPlaceHolder)";
_el._setplaceholder /*b4j.example.vmselect*/ (_splaceholder);
 //BA.debugLineNum = 3583;BA.debugLine="el.SetHint(sHelperText)";
_el._sethint /*b4j.example.vmselect*/ (_shelpertext);
 //BA.debugLineNum = 3584;BA.debugLine="el.Setmultiple(bMultiple)";
_el._setmultiple /*b4j.example.vmselect*/ (_bmultiple);
 //BA.debugLineNum = 3585;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmselect*/ (_vmodel);
 //BA.debugLineNum = 3586;BA.debugLine="el.SetOptions($\"${vmodel}items\"$, optionsm, sourc";
_el._setoptions /*b4j.example.vmselect*/ ((""+__c.SmartStringFormatter("",(Object)(_vmodel))+"items"),_optionsm,_sourcefield,_displayfield,_returnobject);
 //BA.debugLineNum = 3587;BA.debugLine="el.SetRules(True)";
_el._setrules /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 3588;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmselect*/ (__c.False);
 //BA.debugLineNum = 3589;BA.debugLine="el.SetErrorMessages(True)";
_el._seterrormessages /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 3590;BA.debugLine="el.Combo.ErrorMessage = sErrorText";
_el._combo /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 3591;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3592;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _newdatepicker(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,boolean _brequired,String _splaceholder,String _shint,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmdatetimepicker _el = null;
 //BA.debugLineNum = 3269;BA.debugLine="Sub NewDatePicker(eventHandler As Object, bStatic";
 //BA.debugLineNum = 3270;BA.debugLine="Dim el As VMDateTimePicker = CreateDateTimePicker";
_el = _createdatetimepicker(_sid,_eventhandler);
 //BA.debugLineNum = 3271;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmdatetimepicker*/ (_bstatic);
 //BA.debugLineNum = 3272;BA.debugLine="el.Setlabel(slabel)";
_el._setlabel /*b4j.example.vmdatetimepicker*/ (_slabel);
 //BA.debugLineNum = 3273;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmdatetimepicker*/ (_brequired);
 //BA.debugLineNum = 3274;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmdatetimepicker*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 3275;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmdatetimepicker*/ (_vmodel);
 //BA.debugLineNum = 3276;BA.debugLine="el.SetPlaceHolder(sPlaceholder)";
_el._setplaceholder /*b4j.example.vmdatetimepicker*/ (_splaceholder);
 //BA.debugLineNum = 3277;BA.debugLine="el.SetHint(sHint)";
_el._sethint /*b4j.example.vmdatetimepicker*/ (_shint);
 //BA.debugLineNum = 3278;BA.debugLine="el.TextField.SetRules(True)";
_el._textfield /*b4j.example.vmtextfield*/ ._setrules /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 3279;BA.debugLine="el.TextField.SetErrorMessages(True)";
_el._textfield /*b4j.example.vmtextfield*/ ._seterrormessages /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 3280;BA.debugLine="el.DateTimePicker.ErrorMessage = sErrorText";
_el._datetimepicker /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 3281;BA.debugLine="el.TextField.SetError(False)";
_el._textfield /*b4j.example.vmtextfield*/ ._seterror /*b4j.example.vmtextfield*/ (__c.False);
 //BA.debugLineNum = 3282;BA.debugLine="el.SetForInput";
_el._setforinput /*b4j.example.vmdatetimepicker*/ ();
 //BA.debugLineNum = 3283;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _newdivider(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 935;BA.debugLine="Sub NewDivider(elid As String) As VMElement";
 //BA.debugLineNum = 936;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 937;BA.debugLine="elx.Initialize(vue, elid)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 938;BA.debugLine="elx.SetTag(\"v-divider\")";
_elx._settag /*b4j.example.vmelement*/ ("v-divider");
 //BA.debugLineNum = 939;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 940;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _newelement(String _elid,String _eltag,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose,String _eltext) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 917;BA.debugLine="Sub NewElement(elID As String, elTag As String, mp";
 //BA.debugLineNum = 918;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 919;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 920;BA.debugLine="elx.SetTag(elTag)";
_elx._settag /*b4j.example.vmelement*/ (_eltag);
 //BA.debugLineNum = 921;BA.debugLine="elx.BuildModel(mprops, mstyles, lclasses, loose)";
_elx._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 922;BA.debugLine="elx.SetText(elText)";
_elx._settext /*b4j.example.vmelement*/ (_eltext);
 //BA.debugLineNum = 923;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 924;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _newemail(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,String _sicon,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmtextfield _el = null;
 //BA.debugLineNum = 3197;BA.debugLine="Sub NewEmail(eventHandler As Object, bStatic As Bo";
 //BA.debugLineNum = 3198;BA.debugLine="Dim el As VMTextField = NewTextField(eventHandler";
_el = _newtextfield(_eventhandler,_bstatic,_sid,_vmodel,_slabel,_splaceholder,_brequired,_sicon,(int) (0),_shelpertext,_serrortext,_itabindex);
 //BA.debugLineNum = 3199;BA.debugLine="el.SetType(\"email\")";
_el._settype /*b4j.example.vmtextfield*/ ("email");
 //BA.debugLineNum = 3200;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3201;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _newfabbutton(Object _eventhandler,boolean _bstatic,String _sname,String _iconname,String _scolor,String _stooltip) throws Exception{
b4j.example.vmbutton _el = null;
 //BA.debugLineNum = 3603;BA.debugLine="Sub NewFABButton(eventHandler As Object,bStatic As";
 //BA.debugLineNum = 3604;BA.debugLine="Dim el As VMButton = CreateFABButton(sname, event";
_el = _createfabbutton(_sname,_eventhandler,_iconname);
 //BA.debugLineNum = 3605;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 3606;BA.debugLine="el.SetColor(sColor)";
_el._setcolor /*b4j.example.vmbutton*/ (_scolor);
 //BA.debugLineNum = 3607;BA.debugLine="el.SetTooltip(sTooltip)";
_el._settooltip /*b4j.example.vmbutton*/ (_stooltip);
 //BA.debugLineNum = 3608;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3609;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _newfile(Object _eventhandler,boolean _bstatic,boolean _bupload,String _sname,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
 //BA.debugLineNum = 3415;BA.debugLine="Sub NewFile(eventHandler As Object,bStatic As Bool";
 //BA.debugLineNum = 3416;BA.debugLine="Return NewFileInput(eventHandler,bStatic,bUpload,";
if (true) return _newfileinput(_eventhandler,_bstatic,_bupload,_sname,_vmodel,_slabel,_splaceholder,_brequired,_shelpertext,_serrortext,_itabindex);
 //BA.debugLineNum = 3417;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfileinput  _newfileinput(Object _eventhandler,boolean _bstatic,boolean _bupload,String _sname,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmfileinput _el = null;
 //BA.debugLineNum = 3419;BA.debugLine="Sub NewFileInput(eventHandler As Object,bStatic As";
 //BA.debugLineNum = 3420;BA.debugLine="Dim el As VMFileInput = CreateFileInput(sname, ev";
_el = _createfileinput(_sname,_eventhandler);
 //BA.debugLineNum = 3421;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmfileinput*/ (_bstatic);
 //BA.debugLineNum = 3422;BA.debugLine="el.SetHint(shelperText)";
_el._sethint /*b4j.example.vmfileinput*/ (_shelpertext);
 //BA.debugLineNum = 3423;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmfileinput*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 3424;BA.debugLine="el.SetPlaceHolder(splaceholder)";
_el._setplaceholder /*b4j.example.vmfileinput*/ (_splaceholder);
 //BA.debugLineNum = 3425;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmfileinput*/ (_vmodel);
 //BA.debugLineNum = 3426;BA.debugLine="el.Setlabel(slabel)";
_el._setlabel /*b4j.example.vmfileinput*/ (_slabel);
 //BA.debugLineNum = 3427;BA.debugLine="el.SetClearable(False)";
_el._setclearable /*b4j.example.vmfileinput*/ (__c.False);
 //BA.debugLineNum = 3428;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmfileinput*/ (_brequired);
 //BA.debugLineNum = 3429;BA.debugLine="vue.SetData(vmodel, Null)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,__c.Null);
 //BA.debugLineNum = 3430;BA.debugLine="el.SetRules(vue.NewList)";
_el._setrules /*b4j.example.vmfileinput*/ (_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 3431;BA.debugLine="el.SetErrorMessages(vue.NewList)";
_el._seterrormessages /*b4j.example.vmfileinput*/ (_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 3432;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmfileinput*/ (__c.False);
 //BA.debugLineNum = 3433;BA.debugLine="el.SetErrorText(sErrorText)";
_el._seterrortext /*b4j.example.vmfileinput*/ (_serrortext);
 //BA.debugLineNum = 3434;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3435;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newh1(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 3619;BA.debugLine="Sub NewH1(bStatic As Boolean,sname As String, sTex";
 //BA.debugLineNum = 3620;BA.debugLine="Return NewLabel(bStatic,sname, sname, \"h1\", sText";
if (true) return _newlabel(_bstatic,_sname,_sname,"h1",_stext);
 //BA.debugLineNum = 3621;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newh2(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 3623;BA.debugLine="Sub NewH2(bStatic As Boolean,sname As String, sTex";
 //BA.debugLineNum = 3624;BA.debugLine="Return NewLabel(bStatic,sname, sname, \"h2\", sText";
if (true) return _newlabel(_bstatic,_sname,_sname,"h2",_stext);
 //BA.debugLineNum = 3625;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newh3(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 3627;BA.debugLine="Sub NewH3(bStatic As Boolean,sname As String, sTex";
 //BA.debugLineNum = 3628;BA.debugLine="Return NewLabel(bStatic,sname, sname, \"h3\", sText";
if (true) return _newlabel(_bstatic,_sname,_sname,"h3",_stext);
 //BA.debugLineNum = 3629;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newh4(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 3631;BA.debugLine="Sub NewH4(bStatic As Boolean,sname As String, sTex";
 //BA.debugLineNum = 3632;BA.debugLine="Return NewLabel(bStatic,sname, sname, \"h4\", sText";
if (true) return _newlabel(_bstatic,_sname,_sname,"h4",_stext);
 //BA.debugLineNum = 3633;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newh5(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 3635;BA.debugLine="Sub NewH5(bStatic As Boolean,sname As String, sTex";
 //BA.debugLineNum = 3636;BA.debugLine="Return NewLabel(bStatic,sname,sname, \"h5\", sText)";
if (true) return _newlabel(_bstatic,_sname,_sname,"h5",_stext);
 //BA.debugLineNum = 3637;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newh6(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 3639;BA.debugLine="Sub NewH6(bStatic As Boolean,sname As String, sTex";
 //BA.debugLineNum = 3640;BA.debugLine="Return NewLabel(bStatic,sname, sname, \"h6\", sText";
if (true) return _newlabel(_bstatic,_sname,_sname,"h6",_stext);
 //BA.debugLineNum = 3641;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _newicon(Object _eventhandler,boolean _bstatic,String _sname,String _sicon,String _ssize,String _scolor,String _sintensity) throws Exception{
b4j.example.vmicon _el = null;
 //BA.debugLineNum = 3463;BA.debugLine="Sub NewIcon(eventHandler As Object,bStatic As Bool";
 //BA.debugLineNum = 3464;BA.debugLine="Dim el As VMIcon = CreateIcon(sname, eventHandler";
_el = _createicon(_sname,_eventhandler);
 //BA.debugLineNum = 3465;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmicon*/ (_bstatic);
 //BA.debugLineNum = 3466;BA.debugLine="el.SetText(sIcon)";
_el._settext /*b4j.example.vmicon*/ (_sicon);
 //BA.debugLineNum = 3467;BA.debugLine="el.SetAttributes(Array(sSize))";
_el._setattributes /*b4j.example.vmicon*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_ssize)}));
 //BA.debugLineNum = 3468;BA.debugLine="el.SetColorIntensity(scolor,sintensity)";
_el._setcolorintensity /*b4j.example.vmicon*/ (_scolor,_sintensity);
 //BA.debugLineNum = 3469;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3470;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _newiconbutton(Object _eventhandler,boolean _bstatic,String _sname,String _iconname,String _scolor,String _stooltip) throws Exception{
b4j.example.vmbutton _el = null;
 //BA.debugLineNum = 3594;BA.debugLine="Sub NewIconButton(eventHandler As Object,bStatic A";
 //BA.debugLineNum = 3595;BA.debugLine="Dim el As VMButton = CreateButton(sname, eventHan";
_el = _createbutton(_sname,_eventhandler);
 //BA.debugLineNum = 3596;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 3597;BA.debugLine="el.SetIconButton(iconName)";
_el._seticonbutton /*b4j.example.vmbutton*/ (_iconname);
 //BA.debugLineNum = 3598;BA.debugLine="el.SetColor(sColor)";
_el._setcolor /*b4j.example.vmbutton*/ (_scolor);
 //BA.debugLineNum = 3599;BA.debugLine="el.SetTooltip(sTooltip)";
_el._settooltip /*b4j.example.vmbutton*/ (_stooltip);
 //BA.debugLineNum = 3600;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3601;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _newimage(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _src,String _salt,String _swidth,String _sheight) throws Exception{
b4j.example.vmimage _el = null;
 //BA.debugLineNum = 3437;BA.debugLine="Sub NewImage(eventHandler As Object,bStatic As Boo";
 //BA.debugLineNum = 3438;BA.debugLine="vmodel = vmodel.ToLowerCase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 3439;BA.debugLine="Dim el As VMImage = CreateImage(sname, eventHandl";
_el = _createimage(_sname,_eventhandler);
 //BA.debugLineNum = 3440;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmimage*/ (_bstatic);
 //BA.debugLineNum = 3441;BA.debugLine="el.SetWidth(swidth)";
_el._setwidth /*b4j.example.vmimage*/ (_swidth);
 //BA.debugLineNum = 3442;BA.debugLine="el.SetHeight(sheight)";
_el._setheight /*b4j.example.vmimage*/ (_sheight);
 //BA.debugLineNum = 3443;BA.debugLine="el.SetAlt(salt)";
_el._setalt /*b4j.example.vmimage*/ (_salt);
 //BA.debugLineNum = 3444;BA.debugLine="el.SetVModel(vmodel, src)";
_el._setvmodel /*b4j.example.vmimage*/ (_vmodel,_src);
 //BA.debugLineNum = 3445;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3446;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newlabel(boolean _bstatic,String _sname,String _vmodel,String _ssize,String _stext) throws Exception{
b4j.example.vmlabel _el = null;
 //BA.debugLineNum = 3449;BA.debugLine="Sub NewLabel(bStatic As Boolean,sname As String, v";
 //BA.debugLineNum = 3450;BA.debugLine="vmodel = vmodel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 3451;BA.debugLine="Dim el As VMLabel = CreateLabel(sname)";
_el = _createlabel(_sname);
 //BA.debugLineNum = 3452;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmlabel*/ (_bstatic);
 //BA.debugLineNum = 3453;BA.debugLine="el.SetTag(sSize)";
_el._settag /*b4j.example.vmlabel*/ (_ssize);
 //BA.debugLineNum = 3454;BA.debugLine="el.SetVModel(vmodel, sText)";
_el._setvmodel /*b4j.example.vmlabel*/ (_vmodel,_stext);
 //BA.debugLineNum = 3455;BA.debugLine="Select Case sSize";
switch (BA.switchObjectToInt(_ssize,_vue._size_blockquote /*String*/ )) {
case 0: {
 //BA.debugLineNum = 3457;BA.debugLine="el.AddClass(\"blockquote\")";
_el._addclass /*b4j.example.vmlabel*/ ("blockquote");
 break; }
}
;
 //BA.debugLineNum = 3459;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3460;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _newlist() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 1209;BA.debugLine="Sub NewList As List";
 //BA.debugLineNum = 1210;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1211;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 1212;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 1213;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _newlist1(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
 //BA.debugLineNum = 2918;BA.debugLine="Sub NewList1(lst As List) As List";
 //BA.debugLineNum = 2919;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2920;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 2921;BA.debugLine="nl.AddAll(lst)";
_nl.AddAll(_lst);
 //BA.debugLineNum = 2922;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 2923;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _newmap() throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
 //BA.debugLineNum = 1028;BA.debugLine="Sub NewMap As Map";
 //BA.debugLineNum = 1029;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1030;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 1031;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _newnumber(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,String _sicon,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmtextfield _el = null;
 //BA.debugLineNum = 3379;BA.debugLine="Sub NewNumber(eventHandler As Object,bStatic As Bo";
 //BA.debugLineNum = 3380;BA.debugLine="Dim el As VMTextField = NewTextField(eventHandler";
_el = _newtextfield(_eventhandler,_bstatic,_sname,_vmodel,_slabel,_splaceholder,_brequired,_sicon,(int) (0),_shelpertext,_serrortext,_itabindex);
 //BA.debugLineNum = 3381;BA.debugLine="el.SetType(\"number\")";
_el._settype /*b4j.example.vmtextfield*/ ("number");
 //BA.debugLineNum = 3382;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3383;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newp(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 3643;BA.debugLine="Sub NewP(bStatic As Boolean,sname As String, sText";
 //BA.debugLineNum = 3644;BA.debugLine="Return NewLabel(bStatic,sname, sname, \"p\", sText)";
if (true) return _newlabel(_bstatic,_sname,_sname,"p",_stext);
 //BA.debugLineNum = 3645;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _newparallax(Object _eventhandler,boolean _bstatic,String _sname,String _sheight,String _src,String _salt) throws Exception{
b4j.example.vmparallax _el = null;
 //BA.debugLineNum = 1351;BA.debugLine="Sub NewParallax(eventHandler As Object,bStatic As";
 //BA.debugLineNum = 1352;BA.debugLine="Dim el As VMParallax = CreateParallax(sname, even";
_el = _createparallax(_sname,_eventhandler);
 //BA.debugLineNum = 1353;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmparallax*/ (_bstatic);
 //BA.debugLineNum = 1354;BA.debugLine="el.SetHeight(sheight)";
_el._setheight /*b4j.example.vmparallax*/ (_sheight);
 //BA.debugLineNum = 1355;BA.debugLine="el.SetSrc(src)";
_el._setsrc /*b4j.example.vmparallax*/ (_src);
 //BA.debugLineNum = 1356;BA.debugLine="el.SetAlt(salt)";
_el._setalt /*b4j.example.vmparallax*/ (_salt);
 //BA.debugLineNum = 1357;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1358;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _newpassword(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,boolean _btoggle,String _sicon,int _imaxlen,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmtextfield _el = null;
 //BA.debugLineNum = 3408;BA.debugLine="Sub NewPassword(eventHandler As Object,bStatic As";
 //BA.debugLineNum = 3409;BA.debugLine="Dim el As VMTextField = NewTextField(eventHandler";
_el = _newtextfield(_eventhandler,_bstatic,_sname,_vmodel,_slabel,_splaceholder,_brequired,_sicon,_imaxlen,_shelpertext,_serrortext,_itabindex);
 //BA.debugLineNum = 3410;BA.debugLine="el.SetPassword(True, bToggle)";
_el._setpassword /*b4j.example.vmtextfield*/ (__c.True,_btoggle);
 //BA.debugLineNum = 3411;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3412;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _newradiogroup(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,Object _svalue,anywheresoftware.b4a.objects.collections.Map _optionsm,boolean _bshowlabel,boolean _blabelontop,int _itabindex) throws Exception{
b4j.example.vmradiogroup _el = null;
 //BA.debugLineNum = 3218;BA.debugLine="Sub NewRadioGroup(eventHandler As Object, bStatic";
 //BA.debugLineNum = 3219;BA.debugLine="Dim el As VMRadioGroup = CreateRadioGroup(sid, ev";
_el = _createradiogroup(_sid,_eventhandler);
 //BA.debugLineNum = 3220;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmradiogroup*/ (_bstatic);
 //BA.debugLineNum = 3221;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmradiogroup*/ (_vmodel);
 //BA.debugLineNum = 3222;BA.debugLine="el.Setlabel(slabel)";
_el._setlabel /*b4j.example.vmradiogroup*/ (_slabel);
 //BA.debugLineNum = 3223;BA.debugLine="el.SetOptions(optionsm)";
_el._setoptions /*String*/ (_optionsm);
 //BA.debugLineNum = 3224;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmradiogroup*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 3225;BA.debugLine="el.SetValue(svalue)";
_el._setvalue /*b4j.example.vmradiogroup*/ (BA.ObjectToString(_svalue));
 //BA.debugLineNum = 3226;BA.debugLine="vue.SetData(vmodel, svalue)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,_svalue);
 //BA.debugLineNum = 3227;BA.debugLine="If bShowLabel = False Then el.SetLabel(\"\")";
if (_bshowlabel==__c.False) { 
_el._setlabel /*b4j.example.vmradiogroup*/ ("");};
 //BA.debugLineNum = 3228;BA.debugLine="If bLabelOnTop Then";
if (_blabelontop) { 
 //BA.debugLineNum = 3229;BA.debugLine="el.SetColumn(bLabelOnTop)";
_el._setcolumn /*b4j.example.vmradiogroup*/ (_blabelontop);
 }else {
 //BA.debugLineNum = 3231;BA.debugLine="el.SetRow(True)";
_el._setrow /*b4j.example.vmradiogroup*/ (__c.True);
 };
 //BA.debugLineNum = 3233;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3234;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _newradiogroupdatasource(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,String _svalue,String _sourcetable,String _sourcefield,String _displayfield,boolean _bshowlabel,boolean _blabelontop,int _itabindex) throws Exception{
b4j.example.vmradiogroup _el = null;
 //BA.debugLineNum = 3237;BA.debugLine="Sub NewRadioGroupDataSource(eventHandler As Object";
 //BA.debugLineNum = 3238;BA.debugLine="Dim el As VMRadioGroup = CreateRadioGroup(sname,";
_el = _createradiogroup(_sname,_eventhandler);
 //BA.debugLineNum = 3239;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmradiogroup*/ (_bstatic);
 //BA.debugLineNum = 3240;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmradiogroup*/ (_vmodel);
 //BA.debugLineNum = 3241;BA.debugLine="el.Setlabel(sLabel)";
_el._setlabel /*b4j.example.vmradiogroup*/ (_slabel);
 //BA.debugLineNum = 3242;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmradiogroup*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 3243;BA.debugLine="el.SetDataSource(sourceTable, sourceField, displa";
_el._setdatasource /*b4j.example.vmradiogroup*/ (_sourcetable,_sourcefield,_displayfield);
 //BA.debugLineNum = 3244;BA.debugLine="vue.SetData(vmodel, svalue)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(_svalue));
 //BA.debugLineNum = 3245;BA.debugLine="If bShowLabel = False Then el.SetLabel(\"\")";
if (_bshowlabel==__c.False) { 
_el._setlabel /*b4j.example.vmradiogroup*/ ("");};
 //BA.debugLineNum = 3246;BA.debugLine="If bLabelOnTop Then";
if (_blabelontop) { 
 //BA.debugLineNum = 3247;BA.debugLine="el.SetColumn(bLabelOnTop)";
_el._setcolumn /*b4j.example.vmradiogroup*/ (_blabelontop);
 }else {
 //BA.debugLineNum = 3249;BA.debugLine="el.SetRow(True)";
_el._setrow /*b4j.example.vmradiogroup*/ (__c.True);
 };
 //BA.debugLineNum = 3251;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3252;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _newselectdatasource(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,boolean _brequired,boolean _bmultiple,String _splaceholder,String _sourcetable,String _sourcefield,String _displayfield,boolean _returnobject,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 3520;BA.debugLine="Sub NewSelectDataSource(eventHandler As Object,bSt";
 //BA.debugLineNum = 3521;BA.debugLine="Dim el As VMSelect = CreateSelect(sname, eventHan";
_el = _createselect(_sname,_eventhandler);
 //BA.debugLineNum = 3522;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmselect*/ (_bstatic);
 //BA.debugLineNum = 3523;BA.debugLine="el.Setlabel(sLabel)";
_el._setlabel /*b4j.example.vmselect*/ (_slabel);
 //BA.debugLineNum = 3524;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmselect*/ (_brequired);
 //BA.debugLineNum = 3525;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmselect*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 3526;BA.debugLine="el.SetPlaceholder(sPlaceHolder)";
_el._setplaceholder /*b4j.example.vmselect*/ (_splaceholder);
 //BA.debugLineNum = 3527;BA.debugLine="el.SetHint(sHelperText)";
_el._sethint /*b4j.example.vmselect*/ (_shelpertext);
 //BA.debugLineNum = 3528;BA.debugLine="el.SetMultiple(bMultiple)";
_el._setmultiple /*b4j.example.vmselect*/ (_bmultiple);
 //BA.debugLineNum = 3529;BA.debugLine="el.SetDataSource(sourceTable, sourceField, displa";
_el._setdatasource /*b4j.example.vmselect*/ (_sourcetable,_sourcefield,_displayfield,_returnobject);
 //BA.debugLineNum = 3530;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmselect*/ (_vmodel);
 //BA.debugLineNum = 3531;BA.debugLine="el.SetRules(True)";
_el._setrules /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 3532;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmselect*/ (__c.False);
 //BA.debugLineNum = 3533;BA.debugLine="el.SetErrorMessages(True)";
_el._seterrormessages /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 3534;BA.debugLine="el.Combo.ErrorMessage = sErrorText";
_el._combo /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 3535;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3536;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _newselectoptions(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,boolean _brequired,boolean _bmultiple,String _splaceholder,anywheresoftware.b4a.objects.collections.Map _optionsm,String _sourcefield,String _displayfield,boolean _returnobject,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 3539;BA.debugLine="Sub NewSelectOptions(eventHandler As Object,bStati";
 //BA.debugLineNum = 3540;BA.debugLine="Dim el As VMSelect = CreateSelect(sname, eventHan";
_el = _createselect(_sname,_eventhandler);
 //BA.debugLineNum = 3541;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmselect*/ (_bstatic);
 //BA.debugLineNum = 3542;BA.debugLine="el.Setlabel(sLabel)";
_el._setlabel /*b4j.example.vmselect*/ (_slabel);
 //BA.debugLineNum = 3543;BA.debugLine="el.Setrequired(bRequired)";
_el._setrequired /*b4j.example.vmselect*/ (_brequired);
 //BA.debugLineNum = 3544;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmselect*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 3545;BA.debugLine="el.Setplaceholder(sPlaceHolder)";
_el._setplaceholder /*b4j.example.vmselect*/ (_splaceholder);
 //BA.debugLineNum = 3546;BA.debugLine="el.SetHint(sHelperText)";
_el._sethint /*b4j.example.vmselect*/ (_shelpertext);
 //BA.debugLineNum = 3547;BA.debugLine="el.Setmultiple(bMultiple)";
_el._setmultiple /*b4j.example.vmselect*/ (_bmultiple);
 //BA.debugLineNum = 3548;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmselect*/ (_vmodel);
 //BA.debugLineNum = 3549;BA.debugLine="el.SetOptions($\"${vmodel}items\"$, optionsm, sourc";
_el._setoptions /*b4j.example.vmselect*/ ((""+__c.SmartStringFormatter("",(Object)(_vmodel))+"items"),_optionsm,_sourcefield,_displayfield,_returnobject);
 //BA.debugLineNum = 3550;BA.debugLine="el.SetRules(True)";
_el._setrules /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 3551;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmselect*/ (__c.False);
 //BA.debugLineNum = 3552;BA.debugLine="el.SetErrorMessages(True)";
_el._seterrormessages /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 3553;BA.debugLine="el.Combo.ErrorMessage = sErrorText";
_el._combo /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 3554;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3555;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _newslider(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,String _iminvalue,String _imaxvalue,int _itabindex) throws Exception{
b4j.example.vmslider _el = null;
 //BA.debugLineNum = 3327;BA.debugLine="Sub NewSlider(eventHandler As Object,bStatic As Bo";
 //BA.debugLineNum = 3328;BA.debugLine="Dim el As VMSlider = CreateSlider(sid, eventHandl";
_el = _createslider(_sid,_eventhandler);
 //BA.debugLineNum = 3329;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmslider*/ (_bstatic);
 //BA.debugLineNum = 3330;BA.debugLine="el.SetMin(iMinValue)";
_el._setmin /*b4j.example.vmslider*/ ((double)(Double.parseDouble(_iminvalue)));
 //BA.debugLineNum = 3331;BA.debugLine="el.SetMax(iMaxValue)";
_el._setmax /*b4j.example.vmslider*/ ((double)(Double.parseDouble(_imaxvalue)));
 //BA.debugLineNum = 3332;BA.debugLine="el.SetLabel(slabel)";
_el._setlabel /*b4j.example.vmslider*/ (_slabel);
 //BA.debugLineNum = 3333;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmslider*/ (_vmodel);
 //BA.debugLineNum = 3334;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmslider*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 3335;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _newspacer(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 927;BA.debugLine="Sub NewSpacer(elid As String) As VMElement";
 //BA.debugLineNum = 928;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 929;BA.debugLine="elx.Initialize(vue, elid)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 930;BA.debugLine="elx.SetTag(\"v-spacer\")";
_elx._settag /*b4j.example.vmelement*/ ("v-spacer");
 //BA.debugLineNum = 931;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 932;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _newspan(boolean _bstatic,String _sname,String _stext) throws Exception{
 //BA.debugLineNum = 3647;BA.debugLine="Sub NewSPAN(bstatic As Boolean,sname As String, sT";
 //BA.debugLineNum = 3648;BA.debugLine="Return NewLabel(bstatic,sname, sname, SIZE_SPAN,";
if (true) return _newlabel(_bstatic,_sname,_sname,_size_span,_stext);
 //BA.debugLineNum = 3649;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _newswitch(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,Object _svalue,Object _sunchecked,boolean _bprimary,int _itabindex) throws Exception{
b4j.example.vmcheckbox _el = null;
 //BA.debugLineNum = 3203;BA.debugLine="Sub NewSwitch(eventHandler As Object, bStatic As B";
 //BA.debugLineNum = 3204;BA.debugLine="Dim el As VMCheckBox = CreateSwitch(sid, eventHan";
_el = _createswitch(_sid,_eventhandler);
 //BA.debugLineNum = 3205;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmcheckbox*/ (_bstatic);
 //BA.debugLineNum = 3206;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmcheckbox*/ (_vmodel);
 //BA.debugLineNum = 3207;BA.debugLine="el.Setlabel(slabel)";
_el._setlabel /*b4j.example.vmcheckbox*/ (_slabel);
 //BA.debugLineNum = 3208;BA.debugLine="el.SetValue(svalue)";
_el._setvalue /*b4j.example.vmcheckbox*/ (BA.ObjectToString(_svalue));
 //BA.debugLineNum = 3209;BA.debugLine="el.SetTrueValue(svalue)";
_el._settruevalue /*b4j.example.vmcheckbox*/ (BA.ObjectToString(_svalue));
 //BA.debugLineNum = 3210;BA.debugLine="el.SetPrimary(bPrimary)";
_el._setprimary /*b4j.example.vmcheckbox*/ (_bprimary);
 //BA.debugLineNum = 3211;BA.debugLine="el.SetUncheckedValue(sunchecked)";
_el._setuncheckedvalue /*b4j.example.vmcheckbox*/ (_sunchecked);
 //BA.debugLineNum = 3212;BA.debugLine="el.SetFalseValue(sunchecked)";
_el._setfalsevalue /*b4j.example.vmcheckbox*/ (BA.ObjectToString(_sunchecked));
 //BA.debugLineNum = 3213;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmcheckbox*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 3214;BA.debugLine="vue.SetData(vmodel, sunchecked)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,_sunchecked);
 //BA.debugLineNum = 3215;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3216;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _newtel(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,String _sicon,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmtextfield _el = null;
 //BA.debugLineNum = 3373;BA.debugLine="Sub NewTel(eventHandler As Object,bStatic As Boole";
 //BA.debugLineNum = 3374;BA.debugLine="Dim el As VMTextField = NewTextField(eventHandler";
_el = _newtextfield(_eventhandler,_bstatic,_sname,_vmodel,_slabel,_splaceholder,_brequired,_sicon,(int) (0),_shelpertext,_serrortext,_itabindex);
 //BA.debugLineNum = 3375;BA.debugLine="el.SetType(\"tel\")";
_el._settype /*b4j.example.vmtextfield*/ ("tel");
 //BA.debugLineNum = 3376;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3377;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _newtext(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,String _sicon,int _imaxlen,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
 //BA.debugLineNum = 3339;BA.debugLine="Sub NewText(eventHandler As Object,bStatic As Bool";
 //BA.debugLineNum = 3340;BA.debugLine="Return NewTextField(eventHandler,bStatic,sid, vmo";
if (true) return _newtextfield(_eventhandler,_bstatic,_sid,_vmodel,_slabel,_splaceholder,_brequired,_sicon,_imaxlen,_shelpertext,_serrortext,_itabindex);
 //BA.debugLineNum = 3341;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _newtextarea(Object _eventhandler,boolean _bstatic,String _sname,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,boolean _bautogrow,String _sicon,int _imaxlen,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmtextfield _el = null;
 //BA.debugLineNum = 3385;BA.debugLine="Sub NewTextArea(eventHandler As Object,bStatic As";
 //BA.debugLineNum = 3386;BA.debugLine="Dim el As VMTextField = CreateTextField(sname, ev";
_el = _createtextfield(_sname,_eventhandler)._settextarea /*b4j.example.vmtextfield*/ ();
 //BA.debugLineNum = 3387;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmtextfield*/ (_bstatic);
 //BA.debugLineNum = 3388;BA.debugLine="el.Setlabel(slabel)";
_el._setlabel /*b4j.example.vmtextfield*/ (_slabel);
 //BA.debugLineNum = 3389;BA.debugLine="el.Setrequired(bRequired)";
_el._setrequired /*b4j.example.vmtextfield*/ (_brequired);
 //BA.debugLineNum = 3390;BA.debugLine="el.SetPrependIcon(sIcon)";
_el._setprependicon /*b4j.example.vmtextfield*/ (_sicon);
 //BA.debugLineNum = 3391;BA.debugLine="If iMaxLen > 0 Then";
if (_imaxlen>0) { 
 //BA.debugLineNum = 3392;BA.debugLine="el.SetCounter(iMaxLen)";
_el._setcounter /*b4j.example.vmtextfield*/ (BA.ObjectToBoolean(_imaxlen));
 //BA.debugLineNum = 3393;BA.debugLine="el.SetMaxLength(iMaxLen)";
_el._setmaxlength /*b4j.example.vmtextfield*/ (BA.NumberToString(_imaxlen));
 };
 //BA.debugLineNum = 3395;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmtextfield*/ (_vmodel);
 //BA.debugLineNum = 3396;BA.debugLine="el.SetPlaceHolder(splaceholder)";
_el._setplaceholder /*b4j.example.vmtextfield*/ (_splaceholder);
 //BA.debugLineNum = 3397;BA.debugLine="el.SetHint(shelpertext)";
_el._sethint /*b4j.example.vmtextfield*/ (_shelpertext);
 //BA.debugLineNum = 3398;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmtextfield*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 3399;BA.debugLine="el.SetRules(True)";
_el._setrules /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 3400;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmtextfield*/ (__c.False);
 //BA.debugLineNum = 3401;BA.debugLine="el.SetErrorMessages(True)";
_el._seterrormessages /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 3402;BA.debugLine="el.SetAutoGrow(bAutoGrow)";
_el._setautogrow /*b4j.example.vmtextfield*/ (_bautogrow);
 //BA.debugLineNum = 3403;BA.debugLine="el.TextField.ErrorMessage = sErrorText";
_el._textfield /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 3404;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3405;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _newtextfield(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,String _splaceholder,boolean _brequired,String _sicon,int _imaxlen,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmtextfield _el = null;
 //BA.debugLineNum = 3343;BA.debugLine="Sub NewTextField(eventHandler As Object,bStatic As";
 //BA.debugLineNum = 3344;BA.debugLine="Dim el As VMTextField = CreateTextField(sid, even";
_el = _createtextfield(_sid,_eventhandler);
 //BA.debugLineNum = 3345;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmtextfield*/ (_bstatic);
 //BA.debugLineNum = 3346;BA.debugLine="el.Setlabel(slabel)";
_el._setlabel /*b4j.example.vmtextfield*/ (_slabel);
 //BA.debugLineNum = 3347;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmtextfield*/ (_brequired);
 //BA.debugLineNum = 3348;BA.debugLine="el.SetPrependIcon(sIcon)";
_el._setprependicon /*b4j.example.vmtextfield*/ (_sicon);
 //BA.debugLineNum = 3349;BA.debugLine="If iMaxLen > 0 Then";
if (_imaxlen>0) { 
 //BA.debugLineNum = 3350;BA.debugLine="el.SetMaxLength(iMaxLen)";
_el._setmaxlength /*b4j.example.vmtextfield*/ (BA.NumberToString(_imaxlen));
 //BA.debugLineNum = 3351;BA.debugLine="el.SetCounter(True)";
_el._setcounter /*b4j.example.vmtextfield*/ (__c.True);
 };
 //BA.debugLineNum = 3353;BA.debugLine="el.SetPlaceHolder(splaceholder)";
_el._setplaceholder /*b4j.example.vmtextfield*/ (_splaceholder);
 //BA.debugLineNum = 3354;BA.debugLine="el.SetHint(shelpertext)";
_el._sethint /*b4j.example.vmtextfield*/ (_shelpertext);
 //BA.debugLineNum = 3355;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmtextfield*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 3356;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmtextfield*/ (_vmodel);
 //BA.debugLineNum = 3357;BA.debugLine="el.SetType(\"text\")";
_el._settype /*b4j.example.vmtextfield*/ ("text");
 //BA.debugLineNum = 3358;BA.debugLine="el.SetRules(True)";
_el._setrules /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 3359;BA.debugLine="el.SetErrorMessages(True)";
_el._seterrormessages /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 3360;BA.debugLine="el.TextField.ErrorMessage = sErrorText";
_el._textfield /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 3361;BA.debugLine="el.SetError(False)";
_el._seterror /*b4j.example.vmtextfield*/ (__c.False);
 //BA.debugLineNum = 3362;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatetimepicker  _newtimepicker(Object _eventhandler,boolean _bstatic,String _sid,String _vmodel,String _slabel,boolean _brequired,String _splaceholder,String _shint,String _serrortext,int _itabindex) throws Exception{
b4j.example.vmdatetimepicker _el = null;
 //BA.debugLineNum = 3286;BA.debugLine="Sub NewTimePicker(eventHandler As Object, bStatic";
 //BA.debugLineNum = 3287;BA.debugLine="Dim el As VMDateTimePicker = CreateDateTimePicker";
_el = _createdatetimepicker(_sid,_eventhandler)._settimepicker /*b4j.example.vmdatetimepicker*/ ();
 //BA.debugLineNum = 3288;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmdatetimepicker*/ (_bstatic);
 //BA.debugLineNum = 3289;BA.debugLine="el.Setlabel(slabel)";
_el._setlabel /*b4j.example.vmdatetimepicker*/ (_slabel);
 //BA.debugLineNum = 3290;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmdatetimepicker*/ (_vmodel);
 //BA.debugLineNum = 3291;BA.debugLine="el.SetRequired(bRequired)";
_el._setrequired /*b4j.example.vmdatetimepicker*/ (_brequired);
 //BA.debugLineNum = 3292;BA.debugLine="el.SetPlaceHolder(sPlaceholder)";
_el._setplaceholder /*b4j.example.vmdatetimepicker*/ (_splaceholder);
 //BA.debugLineNum = 3293;BA.debugLine="el.SetHint(sHint)";
_el._sethint /*b4j.example.vmdatetimepicker*/ (_shint);
 //BA.debugLineNum = 3294;BA.debugLine="el.SetTabIndex(iTabIndex)";
_el._settabindex /*b4j.example.vmdatetimepicker*/ (BA.NumberToString(_itabindex));
 //BA.debugLineNum = 3295;BA.debugLine="el.TextField.SetRules(True)";
_el._textfield /*b4j.example.vmtextfield*/ ._setrules /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 3296;BA.debugLine="el.TextField.SetErrorMessages(True)";
_el._textfield /*b4j.example.vmtextfield*/ ._seterrormessages /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 3297;BA.debugLine="el.DateTimePicker.ErrorMessage = sErrorText";
_el._datetimepicker /*b4j.example.vmelement*/ ._errormessage /*String*/  = _serrortext;
 //BA.debugLineNum = 3298;BA.debugLine="el.TextField.SetError(False)";
_el._textfield /*b4j.example.vmtextfield*/ ._seterror /*b4j.example.vmtextfield*/ (__c.False);
 //BA.debugLineNum = 3299;BA.debugLine="el.SetForInput";
_el._setforinput /*b4j.example.vmdatetimepicker*/ ();
 //BA.debugLineNum = 3300;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 3301;BA.debugLine="End Sub";
return null;
}
public String  _nullifyfileselect(String _refid) throws Exception{
 //BA.debugLineNum = 1048;BA.debugLine="Sub NullifyFileSelect(refID As String)";
 //BA.debugLineNum = 1049;BA.debugLine="RefNull(refID)";
_refnull(_refid);
 //BA.debugLineNum = 1050;BA.debugLine="End Sub";
return "";
}
public String  _onerror(anywheresoftware.b4a.objects.collections.Map _event) throws Exception{
com.ab.banano.BANanoObject _filereader = null;
com.ab.banano.BANanoObject _uploadedfile = null;
boolean _abort = false;
 //BA.debugLineNum = 3711;BA.debugLine="private Sub OnError(event As Map) As String 'ignor";
 //BA.debugLineNum = 3712;BA.debugLine="Dim FileReader As BANanoObject = event.Get(\"targe";
_filereader = new com.ab.banano.BANanoObject();
_filereader = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_event.Get((Object)("target"))));
 //BA.debugLineNum = 3713;BA.debugLine="Dim UploadedFile As BANanoObject = FileReader.Get";
_uploadedfile = new com.ab.banano.BANanoObject();
_uploadedfile = _filereader.GetField("file");
 //BA.debugLineNum = 3714;BA.debugLine="Dim Abort As Boolean = False";
_abort = __c.False;
 //BA.debugLineNum = 3719;BA.debugLine="BANano.ReturnElse(CreateMap(\"name\": UploadedFile.";
_banano.ReturnElse((Object)(__c.createMap(new Object[] {(Object)("name"),(Object)(_uploadedfile.GetField("name").getObject()),(Object)("result"),(Object)(_filereader.GetField("error").getObject()),(Object)("abort"),(Object)(_abort)}).getObject()));
 //BA.debugLineNum = 3720;BA.debugLine="End Sub";
return "";
}
public String  _onload(anywheresoftware.b4a.objects.collections.Map _event) throws Exception{
com.ab.banano.BANanoObject _filereader = null;
com.ab.banano.BANanoObject _uploadedfile = null;
 //BA.debugLineNum = 3703;BA.debugLine="private Sub OnLoad(event As Map) As String 'ignore";
 //BA.debugLineNum = 3705;BA.debugLine="Dim FileReader As BANanoObject = event.Get(\"targe";
_filereader = new com.ab.banano.BANanoObject();
_filereader = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_event.Get((Object)("target"))));
 //BA.debugLineNum = 3706;BA.debugLine="Dim UploadedFile As BANanoObject = FileReader.Get";
_uploadedfile = new com.ab.banano.BANanoObject();
_uploadedfile = _filereader.GetField("file");
 //BA.debugLineNum = 3708;BA.debugLine="BANano.ReturnThen(CreateMap(\"name\": UploadedFile.";
_banano.ReturnThen((Object)(__c.createMap(new Object[] {(Object)("name"),(Object)(_uploadedfile.GetField("name").getObject()),(Object)("result"),(Object)(_filereader.GetField("result").getObject())}).getObject()));
 //BA.debugLineNum = 3709;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _p(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 495;BA.debugLine="Sub P(elID As String) As VMElement";
 //BA.debugLineNum = 496;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 497;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 498;BA.debugLine="elx.SetTag(\"p\")";
_elx._settag /*b4j.example.vmelement*/ ("p");
 //BA.debugLineNum = 499;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 500;BA.debugLine="End Sub";
return null;
}
public String  _padright(String _value,int _maxlen,String _padchar) throws Exception{
 //BA.debugLineNum = 1862;BA.debugLine="Sub PadRight(Value As String, MaxLen As Int, PadCh";
 //BA.debugLineNum = 1863;BA.debugLine="Return vue.PadRight(Value, MaxLen, PadChar)";
if (true) return _vue._padright /*String*/ (_value,_maxlen,_padchar);
 //BA.debugLineNum = 1864;BA.debugLine="End Sub";
return "";
}
public String  _pagepause() throws Exception{
 //BA.debugLineNum = 3028;BA.debugLine="Sub PagePause";
 //BA.debugLineNum = 3029;BA.debugLine="Overlay.show";
_overlay._show /*b4j.example.vmoverlay*/ ();
 //BA.debugLineNum = 3030;BA.debugLine="End Sub";
return "";
}
public String  _pageresume() throws Exception{
 //BA.debugLineNum = 3033;BA.debugLine="Sub PageResume";
 //BA.debugLineNum = 3034;BA.debugLine="Overlay.hide";
_overlay._hide /*b4j.example.vmoverlay*/ ();
 //BA.debugLineNum = 3035;BA.debugLine="End Sub";
return "";
}
public String  _propercase(String _mystr) throws Exception{
 //BA.debugLineNum = 1608;BA.debugLine="Sub ProperCase(myStr As String) As String";
 //BA.debugLineNum = 1609;BA.debugLine="Return vue.ProperCase(myStr)";
if (true) return _vue._propercase /*String*/ (_mystr);
 //BA.debugLineNum = 1610;BA.debugLine="End Sub";
return "";
}
public String  _rand_loremipsum(int _count) throws Exception{
String _str = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
 //BA.debugLineNum = 998;BA.debugLine="Sub Rand_LoremIpsum(count As Int) As String";
 //BA.debugLineNum = 999;BA.debugLine="Dim str As String = $\"Lorem ipsum dolor sit amet,";
_str = ("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
 //BA.debugLineNum = 1000;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1001;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1002;BA.debugLine="For i = 1 To count";
{
final int step4 = 1;
final int limit4 = _count;
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 1003;BA.debugLine="sb.Append(str).Append(CRLF)";
_sb.Append(_str).Append(__c.CRLF);
 }
};
 //BA.debugLineNum = 1005;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1006;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoPromise  _readasarraybuffer(String _fr) throws Exception{
com.ab.banano.BANanoPromise _promise = null;
 //BA.debugLineNum = 3679;BA.debugLine="Sub readAsArrayBuffer(fr As String) As BANanoPromi";
 //BA.debugLineNum = 3680;BA.debugLine="Dim promise As BANanoPromise 'ignore";
_promise = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 3683;BA.debugLine="promise.CallSub(Me, \"ReadFile\", Array(fr, \"readAs";
_promise.CallSub(this,"ReadFile",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fr),(Object)("readAsArrayBuffer")}));
 //BA.debugLineNum = 3684;BA.debugLine="Return promise";
if (true) return _promise;
 //BA.debugLineNum = 3685;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _readasbinarystring(String _fr) throws Exception{
com.ab.banano.BANanoPromise _promise = null;
 //BA.debugLineNum = 3663;BA.debugLine="Sub readAsBinaryString(fr As String) As BANanoProm";
 //BA.debugLineNum = 3664;BA.debugLine="Dim promise As BANanoPromise 'ignore";
_promise = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 3667;BA.debugLine="promise.CallSub(Me, \"ReadFile\", Array(fr, \"readAs";
_promise.CallSub(this,"ReadFile",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fr),(Object)("readAsBinaryString")}));
 //BA.debugLineNum = 3668;BA.debugLine="Return promise";
if (true) return _promise;
 //BA.debugLineNum = 3669;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _readasdataurl(String _fr) throws Exception{
com.ab.banano.BANanoPromise _promise = null;
 //BA.debugLineNum = 3671;BA.debugLine="Sub readAsDataURL(fr As String) As BANanoPromise";
 //BA.debugLineNum = 3672;BA.debugLine="Dim promise As BANanoPromise 'ignore";
_promise = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 3675;BA.debugLine="promise.CallSub(Me, \"ReadFile\", Array(fr, \"readAs";
_promise.CallSub(this,"ReadFile",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fr),(Object)("readAsDataURL")}));
 //BA.debugLineNum = 3676;BA.debugLine="Return promise";
if (true) return _promise;
 //BA.debugLineNum = 3677;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _readastext(String _fr) throws Exception{
com.ab.banano.BANanoPromise _promise = null;
 //BA.debugLineNum = 3655;BA.debugLine="public Sub readAsText(fr As String) As BANanoPromi";
 //BA.debugLineNum = 3656;BA.debugLine="Dim promise As BANanoPromise 'ignore";
_promise = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 3659;BA.debugLine="promise.CallSub(Me, \"ReadFile\", Array(fr, \"readAs";
_promise.CallSub(this,"ReadFile",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fr),(Object)("readAsText")}));
 //BA.debugLineNum = 3660;BA.debugLine="Return promise";
if (true) return _promise;
 //BA.debugLineNum = 3661;BA.debugLine="End Sub";
return null;
}
public String  _readfile(Object _filetoread,String _methodname) throws Exception{
com.ab.banano.BANanoObject _filereader = null;
anywheresoftware.b4a.objects.collections.Map _event = null;
 //BA.debugLineNum = 3687;BA.debugLine="private Sub ReadFile(FileToRead As Object, MethodN";
 //BA.debugLineNum = 3689;BA.debugLine="Dim FileReader As BANanoObject";
_filereader = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 3690;BA.debugLine="FileReader.Initialize2(\"FileReader\", Null)";
_filereader.Initialize2("FileReader",__c.Null);
 //BA.debugLineNum = 3692;BA.debugLine="FileReader.SetField(\"file\", FileToRead)";
_filereader.SetField("file",_filetoread);
 //BA.debugLineNum = 3696;BA.debugLine="Dim event As Map";
_event = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 3697;BA.debugLine="FileReader.SetField(\"onload\", BANano.CallBack(Me,";
_filereader.SetField("onload",_banano.CallBack(this,"OnLoad",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_event.getObject())})));
 //BA.debugLineNum = 3698;BA.debugLine="FileReader.SetField(\"onerror\", BANano.CallBack(Me";
_filereader.SetField("onerror",_banano.CallBack(this,"OnError",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_event.getObject())})));
 //BA.debugLineNum = 3700;BA.debugLine="FileReader.RunMethod(MethodName, FileToRead)";
_filereader.RunMethod(_methodname,_filetoread);
 //BA.debugLineNum = 3701;BA.debugLine="End Sub";
return "";
}
public String  _refclick(String _refid) throws Exception{
 //BA.debugLineNum = 1073;BA.debugLine="Sub RefClick(refID As String)";
 //BA.debugLineNum = 1074;BA.debugLine="refID = refID.tolowercase";
_refid = _refid.toLowerCase();
 //BA.debugLineNum = 1075;BA.debugLine="vue.refs.GetField(refID).RunMethod(\"click\", Null)";
_vue._refs /*com.ab.banano.BANanoObject*/ .GetField(_refid).RunMethod("click",__c.Null);
 //BA.debugLineNum = 1076;BA.debugLine="End Sub";
return "";
}
public String  _refnull(String _refid) throws Exception{
 //BA.debugLineNum = 1052;BA.debugLine="Sub RefNull(refID As String)";
 //BA.debugLineNum = 1053;BA.debugLine="refID = refID.tolowercase";
_refid = _refid.toLowerCase();
 //BA.debugLineNum = 1054;BA.debugLine="vue.refs.GetField(refID).SetField(\"value\", Null)";
_vue._refs /*com.ab.banano.BANanoObject*/ .GetField(_refid).SetField("value",__c.Null);
 //BA.debugLineNum = 1055;BA.debugLine="End Sub";
return "";
}
public String  _refreset(String _frmid) throws Exception{
 //BA.debugLineNum = 1067;BA.debugLine="Sub RefReset(frmID As String)";
 //BA.debugLineNum = 1068;BA.debugLine="frmID = frmID.tolowercase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 1069;BA.debugLine="vue.refs.GetField(frmID).RunMethod(\"reset\", Null)";
_vue._refs /*com.ab.banano.BANanoObject*/ .GetField(_frmid).RunMethod("reset",__c.Null);
 //BA.debugLineNum = 1070;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _refreshkey(String _keyname) throws Exception{
 //BA.debugLineNum = 1216;BA.debugLine="Sub RefreshKey(keyName As String) As BANanoVM";
 //BA.debugLineNum = 1217;BA.debugLine="keyName = keyName.ToLowerCase";
_keyname = _keyname.toLowerCase();
 //BA.debugLineNum = 1218;BA.debugLine="vue.SetData(keyName, DateTime.now)";
_vue._setdata /*b4j.example.bananovue*/ (_keyname,(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 1219;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1220;BA.debugLine="End Sub";
return null;
}
public String  _remdelim(String _svalue,String _delim) throws Exception{
boolean _sw = false;
int _ldelim = 0;
String _nvalue = "";
 //BA.debugLineNum = 967;BA.debugLine="Sub RemDelim(sValue As String, Delim As String) As";
 //BA.debugLineNum = 968;BA.debugLine="Dim sw As Boolean = sValue.EndsWith(Delim)";
_sw = _svalue.endsWith(_delim);
 //BA.debugLineNum = 969;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 970;BA.debugLine="Dim lDelim As Int = Delim.Length";
_ldelim = _delim.length();
 //BA.debugLineNum = 971;BA.debugLine="Dim nValue As String = sValue";
_nvalue = _svalue;
 //BA.debugLineNum = 972;BA.debugLine="sw = nValue.EndsWith(Delim)";
_sw = _nvalue.endsWith(_delim);
 //BA.debugLineNum = 973;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 974;BA.debugLine="nValue = nValue.SubString2(0, nValue.Length-lDe";
_nvalue = _nvalue.substring((int) (0),(int) (_nvalue.length()-_ldelim));
 };
 //BA.debugLineNum = 976;BA.debugLine="Return nValue";
if (true) return _nvalue;
 }else {
 //BA.debugLineNum = 978;BA.debugLine="Return sValue";
if (true) return _svalue;
 };
 //BA.debugLineNum = 980;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _removemethod(String _methodname) throws Exception{
 //BA.debugLineNum = 2751;BA.debugLine="Sub RemoveMethod(methodName As String) As BANanoVM";
 //BA.debugLineNum = 2752;BA.debugLine="vue.RemoveMethod(methodName)";
_vue._removemethod /*b4j.example.bananovue*/ (_methodname);
 //BA.debugLineNum = 2753;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2754;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _runmethod(String _methodname,Object _params) throws Exception{
 //BA.debugLineNum = 2410;BA.debugLine="Sub RunMethod(methodName As String, params As Obje";
 //BA.debugLineNum = 2411;BA.debugLine="Return vue.RunMethod(methodName, params)";
if (true) return _vue._runmethod /*com.ab.banano.BANanoObject*/ (_methodname,_params);
 //BA.debugLineNum = 2412;BA.debugLine="End Sub";
return null;
}
public String  _savetext2file(String _scontent,String _sfilename) throws Exception{
 //BA.debugLineNum = 1604;BA.debugLine="Sub SaveText2File(sContent As String, sfileName As";
 //BA.debugLineNum = 1605;BA.debugLine="vue.SaveText2File(sContent, sfileName)";
_vue._savetext2file /*String*/ (_scontent,_sfilename);
 //BA.debugLineNum = 1606;BA.debugLine="End Sub";
return "";
}
public String  _scrollto(String _elid,int _duration,int _offset,String _easing) throws Exception{
com.ab.banano.BANanoObject _el = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 3131;BA.debugLine="Sub ScrollTo(elID As String, duration As Int, offs";
 //BA.debugLineNum = 3132;BA.debugLine="Try";
try { //BA.debugLineNum = 3133;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 3134;BA.debugLine="Dim el As BANanoObject = vue.refs.GetField(elID)";
_el = new com.ab.banano.BANanoObject();
_el = _vue._refs /*com.ab.banano.BANanoObject*/ .GetField(_elid);
 //BA.debugLineNum = 3135;BA.debugLine="If duration = Null Then duration = 300";
if (_duration==(double)(BA.ObjectToNumber(__c.Null))) { 
_duration = (int) (300);};
 //BA.debugLineNum = 3136;BA.debugLine="If offset = Null Then offset = 0";
if (_offset==(double)(BA.ObjectToNumber(__c.Null))) { 
_offset = (int) (0);};
 //BA.debugLineNum = 3137;BA.debugLine="If easing = \"\" Then easing = \"easeInOutCubic\"";
if ((_easing).equals("")) { 
_easing = "easeInOutCubic";};
 //BA.debugLineNum = 3138;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 3139;BA.debugLine="opt.Put(\"duration\", duration)";
_opt.Put((Object)("duration"),(Object)(_duration));
 //BA.debugLineNum = 3140;BA.debugLine="opt.Put(\"offset\", offset)";
_opt.Put((Object)("offset"),(Object)(_offset));
 //BA.debugLineNum = 3141;BA.debugLine="opt.Put(\"easing\", easing)";
_opt.Put((Object)("easing"),(Object)(_easing));
 //BA.debugLineNum = 3142;BA.debugLine="vuetify.RunMethod(\"goTo\", Array(el, opt))";
_vuetify.RunMethod("goTo",(Object)(new Object[]{(Object)(_el.getObject()),(Object)(_opt.getObject())}));
 } 
       catch (Exception e13) {
			ba.setLastException(e13); //BA.debugLineNum = 3144;BA.debugLine="Log(\"ScrollTo Error\")";
__c.Log("ScrollTo Error");
 };
 //BA.debugLineNum = 3146;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _setactivated(Object _moduleobj,String _methodname) throws Exception{
 //BA.debugLineNum = 2652;BA.debugLine="Sub SetActivated(moduleObj As Object, methodName A";
 //BA.debugLineNum = 2653;BA.debugLine="vue.SetActivated(moduleObj, methodName)";
_vue._setactivated /*b4j.example.bananovue*/ (_moduleobj,_methodname);
 //BA.debugLineNum = 2654;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2655;BA.debugLine="End Sub";
return null;
}
public String  _setactivepanel(String _parentid,String _activeid) throws Exception{
 //BA.debugLineNum = 2521;BA.debugLine="Sub SetActivePanel(parentID As String, activeID As";
 //BA.debugLineNum = 2522;BA.debugLine="parentID = parentID.ToLowerCase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 2523;BA.debugLine="activeID = activeID.tolowercase";
_activeid = _activeid.toLowerCase();
 //BA.debugLineNum = 2524;BA.debugLine="vue.SetData($\"${parentID}active\"$, activeID)";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_parentid))+"active"),(Object)(_activeid));
 //BA.debugLineNum = 2525;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _setbadgeavatar(String _elid,boolean _b) throws Exception{
String _badvalue = "";
 //BA.debugLineNum = 2131;BA.debugLine="Sub SetBadgeAvatar(elID As String, b As Boolean) A";
 //BA.debugLineNum = 2132;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 2133;BA.debugLine="Dim badValue As String = $\"${elID}badgeavatar\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"badgeavatar");
 //BA.debugLineNum = 2134;BA.debugLine="vue.SetStateSingle(badValue, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_badvalue,(Object)(_b));
 //BA.debugLineNum = 2135;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2136;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbadgebordered(String _elid,boolean _bordered) throws Exception{
String _badvalue = "";
 //BA.debugLineNum = 2146;BA.debugLine="Sub SetBadgeBordered(elID As String, bordered As B";
 //BA.debugLineNum = 2147;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 2148;BA.debugLine="Dim badValue As String = $\"${elID}badgebordered\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"badgebordered");
 //BA.debugLineNum = 2149;BA.debugLine="vue.SetStateSingle(badValue, bordered)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_badvalue,(Object)(_bordered));
 //BA.debugLineNum = 2150;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2151;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbadgecolor(String _elid,String _color,String _intensity) throws Exception{
String _scolor = "";
String _badvalue = "";
 //BA.debugLineNum = 2153;BA.debugLine="Sub SetBadgeColor(elID As String, color As String,";
 //BA.debugLineNum = 2154;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 2155;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 2156;BA.debugLine="Dim badValue As String = $\"${elID}badgecolor\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"badgecolor");
 //BA.debugLineNum = 2157;BA.debugLine="vue.SetStateSingle(badValue, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_badvalue,(Object)(_scolor));
 //BA.debugLineNum = 2158;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2159;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbadgecontent(String _elid,String _counted) throws Exception{
String _badvalue = "";
 //BA.debugLineNum = 2168;BA.debugLine="Sub SetBadgeContent(elID As String, counted As Str";
 //BA.debugLineNum = 2169;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 2170;BA.debugLine="counted = BANano.parseInt(counted)";
_counted = BA.NumberToString(_banano.parseInt((Object)(_counted)));
 //BA.debugLineNum = 2171;BA.debugLine="Dim badValue As String = $\"${elID}badgecontent\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"badgecontent");
 //BA.debugLineNum = 2172;BA.debugLine="vue.SetStateSingle(badValue, counted)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_badvalue,(Object)(_counted));
 //BA.debugLineNum = 2173;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2174;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbadgeicon(String _elid,String _sicon) throws Exception{
String _badvalue = "";
 //BA.debugLineNum = 2161;BA.debugLine="Sub SetBadgeIcon(elID As String, sicon As String)";
 //BA.debugLineNum = 2162;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 2163;BA.debugLine="Dim badValue As String = $\"${elID}badgeicon\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"badgeicon");
 //BA.debugLineNum = 2164;BA.debugLine="vue.SetStateSingle(badValue, sicon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_badvalue,(Object)(_sicon));
 //BA.debugLineNum = 2165;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2166;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbadgeoffsetx(String _elid,String _counted) throws Exception{
String _badvalue = "";
 //BA.debugLineNum = 2176;BA.debugLine="Sub SetBadgeOffsetX(elID As String, counted As Str";
 //BA.debugLineNum = 2177;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 2178;BA.debugLine="counted = BANano.parseInt(counted)";
_counted = BA.NumberToString(_banano.parseInt((Object)(_counted)));
 //BA.debugLineNum = 2179;BA.debugLine="Dim badValue As String = $\"${elID}badgeoffsetx\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"badgeoffsetx");
 //BA.debugLineNum = 2180;BA.debugLine="vue.SetStateSingle(badValue, counted)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_badvalue,(Object)(_counted));
 //BA.debugLineNum = 2181;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2182;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbadgeoffsety(String _elid,String _counted) throws Exception{
String _badvalue = "";
 //BA.debugLineNum = 2184;BA.debugLine="Sub SetBadgeOffsetY(elID As String, counted As Str";
 //BA.debugLineNum = 2185;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 2186;BA.debugLine="counted = BANano.parseInt(counted)";
_counted = BA.NumberToString(_banano.parseInt((Object)(_counted)));
 //BA.debugLineNum = 2187;BA.debugLine="Dim badValue As String = $\"${elID}badgeoffsety\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"badgeoffsety");
 //BA.debugLineNum = 2188;BA.debugLine="vue.SetStateSingle(badValue, counted)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_badvalue,(Object)(_counted));
 //BA.debugLineNum = 2189;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2190;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbadgeoverlap(String _elid,boolean _b) throws Exception{
String _badvalue = "";
 //BA.debugLineNum = 2138;BA.debugLine="Sub SetBadgeOverlap(elID As String, b As Boolean)";
 //BA.debugLineNum = 2139;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 2140;BA.debugLine="Dim badValue As String = $\"${elID}badgeoverlap\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"badgeoverlap");
 //BA.debugLineNum = 2141;BA.debugLine="vue.SetStateSingle(badValue, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_badvalue,(Object)(_b));
 //BA.debugLineNum = 2142;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2143;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbeforecreate(Object _moduleobj,String _methodname) throws Exception{
 //BA.debugLineNum = 2688;BA.debugLine="Sub SetBeforeCreate(moduleObj As Object, methodNam";
 //BA.debugLineNum = 2689;BA.debugLine="vue.SetBeforeCreate(moduleObj, methodName)";
_vue._setbeforecreate /*b4j.example.bananovue*/ (_moduleobj,_methodname);
 //BA.debugLineNum = 2690;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2691;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbeforedestroy(Object _moduleobj,String _methodname) throws Exception{
 //BA.debugLineNum = 2683;BA.debugLine="Sub SetBeforeDestroy(moduleObj As Object, methodNa";
 //BA.debugLineNum = 2684;BA.debugLine="vue.SetBeforeDestroy(moduleObj, methodName)";
_vue._setbeforedestroy /*b4j.example.bananovue*/ (_moduleobj,_methodname);
 //BA.debugLineNum = 2685;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2686;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbeforemount(Object _moduleobj,String _methodname) throws Exception{
 //BA.debugLineNum = 2673;BA.debugLine="Sub SetBeforeMount(moduleObj As Object, methodName";
 //BA.debugLineNum = 2674;BA.debugLine="vue.SetBeforeMount(moduleObj, methodName)";
_vue._setbeforemount /*b4j.example.bananovue*/ (_moduleobj,_methodname);
 //BA.debugLineNum = 2675;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2676;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbeforeupdate(Object _moduleobj,String _methodname) throws Exception{
 //BA.debugLineNum = 2678;BA.debugLine="Sub SetBeforeUpdate(moduleObj As Object, methodNam";
 //BA.debugLineNum = 2679;BA.debugLine="vue.SetBeforeUpdate(moduleObj, methodName)";
_vue._setbeforeupdate /*b4j.example.bananovue*/ (_moduleobj,_methodname);
 //BA.debugLineNum = 2680;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2681;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _setbooleans(anywheresoftware.b4a.objects.collections.Map _rec,anywheresoftware.b4a.objects.collections.List _xfields,String _checkedvalue,String _uncheckedvalue) throws Exception{
 //BA.debugLineNum = 1649;BA.debugLine="Sub SetBooleans(rec As Map, xFields As List, check";
 //BA.debugLineNum = 1650;BA.debugLine="Return vue.SetBooleans(rec, xFields, checkedValue";
if (true) return _vue._setbooleans /*anywheresoftware.b4a.objects.collections.Map*/ (_rec,_xfields,_checkedvalue,_uncheckedvalue);
 //BA.debugLineNum = 1651;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbuttontext(String _btnid,String _txt) throws Exception{
 //BA.debugLineNum = 2745;BA.debugLine="Sub SetButtonText(btnID As String, txt As String)";
 //BA.debugLineNum = 2746;BA.debugLine="btnID = btnID.tolowercase";
_btnid = _btnid.toLowerCase();
 //BA.debugLineNum = 2747;BA.debugLine="vue.SetStateSingle($\"${btnID}text\"$, txt)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_btnid))+"text"),(Object)(_txt));
 //BA.debugLineNum = 2748;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2749;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setcallback(Object _moduleobj,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2736;BA.debugLine="Sub SetCallBack(moduleObj As Object, methodName As";
 //BA.debugLineNum = 2737;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2738;BA.debugLine="If SubExists(moduleObj, methodName) = False Then";
if (__c.SubExists(ba,_moduleobj,_methodname)==__c.False) { 
if (true) return (b4j.example.bananovm)(this);};
 //BA.debugLineNum = 2739;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2740;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(moduleOb";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_moduleobj,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2741;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2742;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2743;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setcloak(boolean _b) throws Exception{
 //BA.debugLineNum = 1767;BA.debugLine="Sub SetCloak(b As Boolean) As BANanoVM";
 //BA.debugLineNum = 1768;BA.debugLine="vue.SetCloak(b)";
_vue._setcloak /*b4j.example.bananovue*/ (_b);
 //BA.debugLineNum = 1769;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1770;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setcomputed(String _k,Object _moduleobj,String _methodname) throws Exception{
 //BA.debugLineNum = 2657;BA.debugLine="Sub SetComputed(k As String, moduleObj As Object,";
 //BA.debugLineNum = 2658;BA.debugLine="vue.SetComputed(k, moduleObj, methodName)";
_vue._setcomputed /*b4j.example.bananovue*/ (_k,_moduleobj,_methodname);
 //BA.debugLineNum = 2659;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2660;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setcreated(Object _moduleobj,String _methodname) throws Exception{
 //BA.debugLineNum = 2405;BA.debugLine="Sub SetCreated(moduleObj As Object, methodName As";
 //BA.debugLineNum = 2406;BA.debugLine="vue.SetCreated(moduleObj, methodName)";
_vue._setcreated /*b4j.example.bananovue*/ (_moduleobj,_methodname);
 //BA.debugLineNum = 2407;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2408;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setdata(String _prop,Object _valuex) throws Exception{
 //BA.debugLineNum = 2388;BA.debugLine="Sub SetData(prop As String, valuex As Object) As B";
 //BA.debugLineNum = 2389;BA.debugLine="vue.SetStateSingle(prop, valuex)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_prop,_valuex);
 //BA.debugLineNum = 2390;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2391;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setdeactivated(Object _moduleobj,String _methodname) throws Exception{
 //BA.debugLineNum = 2663;BA.debugLine="Sub SetDeActivated(moduleObj As Object, methodName";
 //BA.debugLineNum = 2664;BA.debugLine="vue.SetDeActivated(moduleObj, methodName)";
_vue._setdeactivated /*b4j.example.bananovue*/ (_moduleobj,_methodname);
 //BA.debugLineNum = 2665;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2666;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setdestroyed(Object _moduleobj,String _methodname) throws Exception{
 //BA.debugLineNum = 2647;BA.debugLine="Sub SetDestroyed(moduleObj As Object, methodName A";
 //BA.debugLineNum = 2648;BA.debugLine="vue.SetDestroyed(moduleObj, methodName)";
_vue._setdestroyed /*b4j.example.bananovue*/ (_moduleobj,_methodname);
 //BA.debugLineNum = 2649;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2650;BA.debugLine="End Sub";
return null;
}
public String  _setdisabledstate(String _k,boolean _v) throws Exception{
String _diskey = "";
 //BA.debugLineNum = 2591;BA.debugLine="Sub SetDisabledState(k As String, v As Boolean)";
 //BA.debugLineNum = 2592;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"disabled");
 //BA.debugLineNum = 2593;BA.debugLine="SetStateSingle(disKey, v)";
_setstatesingle(_diskey,(Object)(_v));
 //BA.debugLineNum = 2594;BA.debugLine="End Sub";
return "";
}
public String  _setdynamiccontent(String _sid,String _dynacontent) throws Exception{
String _pp = "";
 //BA.debugLineNum = 2543;BA.debugLine="Sub SetDynamicContent(sid As String, dynaContent A";
 //BA.debugLineNum = 2544;BA.debugLine="sid = sid.ToLowerCase";
_sid = _sid.toLowerCase();
 //BA.debugLineNum = 2545;BA.debugLine="Dim pp As String = $\"${sid}htmlcontent\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_sid))+"htmlcontent");
 //BA.debugLineNum = 2546;BA.debugLine="SetStateSingle(pp,dynaContent)";
_setstatesingle(_pp,(Object)(_dynacontent));
 //BA.debugLineNum = 2547;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(String _elid,boolean _b) throws Exception{
 //BA.debugLineNum = 1787;BA.debugLine="Sub SetEnabled(elID As String, b As Boolean)";
 //BA.debugLineNum = 1788;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 1789;BA.debugLine="vue.SetStateSingle($\"${elID}disabled\"$, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"disabled"),(Object)(_b));
 //BA.debugLineNum = 1790;BA.debugLine="End Sub";
return "";
}
public String  _seterrorstate(String _k,boolean _v) throws Exception{
String _showkey = "";
 //BA.debugLineNum = 2581;BA.debugLine="Sub SetErrorState(k As String, v As Boolean)";
 //BA.debugLineNum = 2582;BA.debugLine="Dim showKey As String = $\"${k}error\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"error");
 //BA.debugLineNum = 2583;BA.debugLine="SetStateSingle(showKey, v)";
_setstatesingle(_showkey,(Object)(_v));
 //BA.debugLineNum = 2584;BA.debugLine="End Sub";
return "";
}
public String  _setfocus(String _refid) throws Exception{
 //BA.debugLineNum = 1083;BA.debugLine="Sub SetFocus(refID As String)";
 //BA.debugLineNum = 1084;BA.debugLine="refID = refID.tolowercase";
_refid = _refid.toLowerCase();
 //BA.debugLineNum = 1085;BA.debugLine="vue.refs.GetField(refID).RunMethod(\"focus\", Null)";
_vue._refs /*com.ab.banano.BANanoObject*/ .GetField(_refid).RunMethod("focus",__c.Null);
 //BA.debugLineNum = 1086;BA.debugLine="End Sub";
return "";
}
public String  _setfontfamily(Object _ff) throws Exception{
 //BA.debugLineNum = 2436;BA.debugLine="private Sub SetFontFamily(ff As Object)";
 //BA.debugLineNum = 2437;BA.debugLine="vue.SetFontFamily(ff)";
_vue._setfontfamily /*String*/ (_ff);
 //BA.debugLineNum = 2438;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _setlocale(String _slang) throws Exception{
 //BA.debugLineNum = 3149;BA.debugLine="Sub SetLocale(slang As String) As BANanoVM";
 //BA.debugLineNum = 3150;BA.debugLine="lang = slang";
_lang = _slang;
 //BA.debugLineNum = 3151;BA.debugLine="Try";
try { //BA.debugLineNum = 3152;BA.debugLine="vuetify.GetField(\"lang\").SetField(\"current\", sla";
_vuetify.GetField("lang").SetField("current",(Object)(_slang));
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 3154;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
 //BA.debugLineNum = 3156;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 3157;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setmethod(Object _moduleobj,String _methodname) throws Exception{
 //BA.debugLineNum = 2399;BA.debugLine="Sub SetMethod(moduleObj As Object, methodName As S";
 //BA.debugLineNum = 2400;BA.debugLine="vue.SetMethod(moduleObj, methodName)";
_vue._setmethod /*b4j.example.bananovue*/ (_moduleobj,_methodname);
 //BA.debugLineNum = 2401;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2402;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setmounted(Object _moduleobj,String _methodname) throws Exception{
 //BA.debugLineNum = 2479;BA.debugLine="Sub SetMounted(moduleObj As Object, methodName As";
 //BA.debugLineNum = 2480;BA.debugLine="vue.SetMounted(moduleObj, methodName)";
_vue._setmounted /*b4j.example.bananovue*/ (_moduleobj,_methodname);
 //BA.debugLineNum = 2481;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2482;BA.debugLine="End Sub";
return null;
}
public String  _setonclick(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1113;BA.debugLine="Sub SetOnClick(EventHandler As Object, methodName";
 //BA.debugLineNum = 1114;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1115;BA.debugLine="If SubExists(EventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1116;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1117;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(EventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1119;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1120;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _setprogressbuffer(String _pid,int _bval) throws Exception{
 //BA.debugLineNum = 1686;BA.debugLine="Sub SetProgressBuffer(pID As String, bVal As Int)";
 //BA.debugLineNum = 1687;BA.debugLine="pID = pID.ToLowerCase";
_pid = _pid.toLowerCase();
 //BA.debugLineNum = 1688;BA.debugLine="SetStateSingle($\"${pID}buffer\"$, bVal)";
_setstatesingle((""+__c.SmartStringFormatter("",(Object)(_pid))+"buffer"),(Object)(_bval));
 //BA.debugLineNum = 1689;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1690;BA.debugLine="End Sub";
return null;
}
public String  _setprogressvalue(String _elid,String _elvalue) throws Exception{
String _elkey = "";
 //BA.debugLineNum = 1545;BA.debugLine="Sub SetProgressValue(elID As String, elValue As St";
 //BA.debugLineNum = 1546;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 1547;BA.debugLine="Dim elKey As String = $\"${elID}value\"$";
_elkey = (""+__c.SmartStringFormatter("",(Object)(_elid))+"value");
 //BA.debugLineNum = 1548;BA.debugLine="vue.SetData(elKey, elValue)";
_vue._setdata /*b4j.example.bananovue*/ (_elkey,(Object)(_elvalue));
 //BA.debugLineNum = 1549;BA.debugLine="End Sub";
return "";
}
public String  _setprompt(Object _pvalue) throws Exception{
 //BA.debugLineNum = 2726;BA.debugLine="Sub SetPrompt(pvalue As Object)";
 //BA.debugLineNum = 2727;BA.debugLine="vue.SetStateSingle(\"promptvalue\",pvalue)";
_vue._setstatesingle /*b4j.example.bananovue*/ ("promptvalue",_pvalue);
 //BA.debugLineNum = 2728;BA.debugLine="End Sub";
return "";
}
public String  _setrequired(String _elid,boolean _b) throws Exception{
 //BA.debugLineNum = 1772;BA.debugLine="Sub SetRequired(elID As String, b As Boolean)";
 //BA.debugLineNum = 1773;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 1774;BA.debugLine="vue.SetStateSingle($\"${elID}required\"$, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"required"),(Object)(_b));
 //BA.debugLineNum = 1775;BA.debugLine="End Sub";
return "";
}
public String  _setrequiredstate(String _k,boolean _v) throws Exception{
String _diskey = "";
 //BA.debugLineNum = 2596;BA.debugLine="Sub SetRequiredState(k As String, v As Boolean)";
 //BA.debugLineNum = 2597;BA.debugLine="Dim disKey As String = $\"${k}required\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"required");
 //BA.debugLineNum = 2598;BA.debugLine="SetStateSingle(disKey, v)";
_setstatesingle(_diskey,(Object)(_v));
 //BA.debugLineNum = 2599;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _setrtl(boolean _b) throws Exception{
 //BA.debugLineNum = 3042;BA.debugLine="Sub SetRTL(b As Boolean) As BANanoVM";
 //BA.debugLineNum = 3043;BA.debugLine="RTL = b";
_rtl = _b;
 //BA.debugLineNum = 3044;BA.debugLine="Drawer.SetRight(RTL)";
_drawer._setright /*b4j.example.vmnavigationdrawer*/ (_rtl);
 //BA.debugLineNum = 3045;BA.debugLine="vuetify.SetField(\"rtl\", b)";
_vuetify.SetField("rtl",(Object)(_b));
 //BA.debugLineNum = 3046;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 3047;BA.debugLine="End Sub";
return null;
}
public String  _setshowstate(String _k,boolean _v) throws Exception{
String _showkey = "";
 //BA.debugLineNum = 2586;BA.debugLine="Sub SetShowState(k As String, v As Boolean)";
 //BA.debugLineNum = 2587;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"show");
 //BA.debugLineNum = 2588;BA.debugLine="SetStateSingle(showKey, v)";
_setstatesingle(_showkey,(Object)(_v));
 //BA.debugLineNum = 2589;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _setstate(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 2312;BA.debugLine="Sub SetState(m As Map) As BANanoVM";
 //BA.debugLineNum = 2313;BA.debugLine="vue.SetState(m)";
_vue._setstate /*b4j.example.bananovue*/ (_m);
 //BA.debugLineNum = 2314;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2315;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatedecrement(String _k) throws Exception{
 //BA.debugLineNum = 2468;BA.debugLine="Sub SetStateDecrement(k As String) As BANanoVM";
 //BA.debugLineNum = 2469;BA.debugLine="vue.SetStateDecrement(k)";
_vue._setstatedecrement /*b4j.example.bananovue*/ (_k);
 //BA.debugLineNum = 2470;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2471;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatefalse(String _k) throws Exception{
 //BA.debugLineNum = 2458;BA.debugLine="Sub SetStateFalse(k As String) As BANanoVM";
 //BA.debugLineNum = 2459;BA.debugLine="vue.SetStateFalse(k)";
_vue._setstatefalse /*b4j.example.bananovue*/ (_k);
 //BA.debugLineNum = 2460;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2461;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstateincrement(String _k) throws Exception{
 //BA.debugLineNum = 2463;BA.debugLine="Sub SetStateIncrement(k As String) As BANanoVM";
 //BA.debugLineNum = 2464;BA.debugLine="vue.SetStateIncrement(k)";
_vue._setstateincrement /*b4j.example.bananovue*/ (_k);
 //BA.debugLineNum = 2465;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2466;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatelist(String _mapkey,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
 //BA.debugLineNum = 2365;BA.debugLine="Sub SetStateList(mapKey As String, mapValues As Li";
 //BA.debugLineNum = 2366;BA.debugLine="vue.SetStateList(mapKey, mapValues)";
_vue._setstatelist /*b4j.example.bananovue*/ (_mapkey,_mapvalues);
 //BA.debugLineNum = 2367;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2368;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatelistvalues(anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
 //BA.debugLineNum = 2359;BA.debugLine="Sub SetStateListValues(mapValues As List) As BANan";
 //BA.debugLineNum = 2360;BA.debugLine="vue.SetStateListValues(mapValues)";
_vue._setstatelistvalues /*b4j.example.bananovue*/ (_mapvalues);
 //BA.debugLineNum = 2361;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2362;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatemap(String _mapkey,anywheresoftware.b4a.objects.collections.Map _mapvalues) throws Exception{
 //BA.debugLineNum = 2371;BA.debugLine="Sub SetStateMap(mapKey As String, mapValues As Map";
 //BA.debugLineNum = 2372;BA.debugLine="vue.SetStateMap(mapKey, mapValues)";
_vue._setstatemap /*b4j.example.bananovue*/ (_mapkey,_mapvalues);
 //BA.debugLineNum = 2373;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2374;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatesingle(String _k,Object _v) throws Exception{
 //BA.debugLineNum = 2354;BA.debugLine="Sub SetStateSingle(k As String, v As Object) As BA";
 //BA.debugLineNum = 2355;BA.debugLine="vue.SetStateSingle(k, v)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_k,_v);
 //BA.debugLineNum = 2356;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2357;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatetrue(String _k) throws Exception{
 //BA.debugLineNum = 2449;BA.debugLine="Sub SetStateTrue(k As String) As BANanoVM";
 //BA.debugLineNum = 2450;BA.debugLine="vue.SetStateTrue(k)";
_vue._setstatetrue /*b4j.example.bananovue*/ (_k);
 //BA.debugLineNum = 2451;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2452;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstyle(String _classname,String _prop,String _vals) throws Exception{
 //BA.debugLineNum = 1834;BA.debugLine="Sub SetStyle(className As String, prop As String,";
 //BA.debugLineNum = 1835;BA.debugLine="vue.SetStyle(className, prop, vals)";
_vue._setstyle /*b4j.example.bananovue*/ (_classname,_prop,_vals);
 //BA.debugLineNum = 1836;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1837;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _setuncheckedvalue(anywheresoftware.b4a.objects.collections.Map _rec,anywheresoftware.b4a.objects.collections.List _xfields,String _checkedvalue,String _uncheckedvalue) throws Exception{
 //BA.debugLineNum = 1653;BA.debugLine="Sub SetUncheckedValue(rec As Map, xfields As List,";
 //BA.debugLineNum = 1654;BA.debugLine="Return vue.SetUncheckedValue(rec, xfields, checke";
if (true) return _vue._setuncheckedvalue /*anywheresoftware.b4a.objects.collections.Map*/ (_rec,_xfields,_checkedvalue,_uncheckedvalue);
 //BA.debugLineNum = 1655;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setupdated(Object _moduleobj,String _methodname) throws Exception{
 //BA.debugLineNum = 2668;BA.debugLine="Sub SetUpdated(moduleObj As Object, methodName As";
 //BA.debugLineNum = 2669;BA.debugLine="vue.SetUpdated(moduleObj, methodName)";
_vue._setupdated /*b4j.example.bananovue*/ (_moduleobj,_methodname);
 //BA.debugLineNum = 2670;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2671;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setuserouter(boolean _b) throws Exception{
 //BA.debugLineNum = 906;BA.debugLine="Sub SetUseRouter(b As Boolean) As BANanoVM";
 //BA.debugLineNum = 907;BA.debugLine="bUseRouter = b";
_buserouter = _b;
 //BA.debugLineNum = 908;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 909;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setwatch(String _k,boolean _bimmediate,boolean _bdeep,Object _moduleobj,String _methodname) throws Exception{
 //BA.debugLineNum = 2377;BA.debugLine="Sub SetWatch(k As String, bImmediate As Boolean, b";
 //BA.debugLineNum = 2378;BA.debugLine="vue.SetWatch(k, bImmediate, bDeep, moduleObj, met";
_vue._setwatch /*b4j.example.bananovue*/ (_k,_bimmediate,_bdeep,_moduleobj,_methodname);
 //BA.debugLineNum = 2379;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2380;BA.debugLine="End Sub";
return null;
}
public String  _show(String _elid) throws Exception{
 //BA.debugLineNum = 1797;BA.debugLine="Sub Show(elID As String)";
 //BA.debugLineNum = 1798;BA.debugLine="vue.SetStateSingle($\"${elID}show\"$, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"show"),(Object)(__c.True));
 //BA.debugLineNum = 1799;BA.debugLine="End Sub";
return "";
}
public String  _showalert(String _process,String _title,String _message,String _confirmtext) throws Exception{
 //BA.debugLineNum = 1247;BA.debugLine="Sub ShowAlert(process As String, Title As String,";
 //BA.debugLineNum = 1248;BA.debugLine="process = process.tolowercase";
_process = _process.toLowerCase();
 //BA.debugLineNum = 1249;BA.debugLine="vue.SetState(CreateMap(\"alertkey\":process, \"alert";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("alertkey"),(Object)(_process),(Object)("alerttitle"),(Object)(_title),(Object)("alertcontent"),(Object)(_message),(Object)("btnalertoklabel"),(Object)(_confirmtext)}));
 //BA.debugLineNum = 1250;BA.debugLine="Alert.Show";
_alert._show /*b4j.example.vmdialog*/ ();
 //BA.debugLineNum = 1251;BA.debugLine="End Sub";
return "";
}
public String  _showbottomsheet(String _did) throws Exception{
 //BA.debugLineNum = 1712;BA.debugLine="Sub ShowBottomSheet(dID As String)";
 //BA.debugLineNum = 1713;BA.debugLine="dID = dID.tolowercase";
_did = _did.toLowerCase();
 //BA.debugLineNum = 1714;BA.debugLine="vue.SetData($\"${dID}show\"$, True)";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_did))+"show"),(Object)(__c.True));
 //BA.debugLineNum = 1715;BA.debugLine="End Sub";
return "";
}
public String  _showconfirm(String _process,String _title,String _message,String _confirmtext,String _canceltext) throws Exception{
 //BA.debugLineNum = 1229;BA.debugLine="Sub ShowConfirm(process As String, Title As String";
 //BA.debugLineNum = 1230;BA.debugLine="process = process.tolowercase";
_process = _process.toLowerCase();
 //BA.debugLineNum = 1231;BA.debugLine="vue.SetState(CreateMap(\"confirmtitle\":Title,\"conf";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("confirmtitle"),(Object)(_title),(Object)("confirmcontent"),(Object)(_message),(Object)("confirmkey"),(Object)(_process),(Object)("btnconfirmoklabel"),(Object)(_confirmtext),(Object)("btnconfirmcancellabel"),(Object)(_canceltext)}));
 //BA.debugLineNum = 1232;BA.debugLine="Confirm.Show";
_confirm._show /*b4j.example.vmdialog*/ ();
 //BA.debugLineNum = 1233;BA.debugLine="End Sub";
return "";
}
public String  _showconfirm1(Object _eventhandler,String _process,String _title,String _message,String _confirmtext,String _canceltext) throws Exception{
 //BA.debugLineNum = 1235;BA.debugLine="Sub ShowConfirm1(eventHandler As Object, process A";
 //BA.debugLineNum = 1236;BA.debugLine="process = process.tolowercase";
_process = _process.toLowerCase();
 //BA.debugLineNum = 1237;BA.debugLine="vue.SetState(CreateMap(\"confirmtitle\":Title,\"conf";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("confirmtitle"),(Object)(_title),(Object)("confirmcontent"),(Object)(_message),(Object)("confirmkey"),(Object)(_process),(Object)("btnconfirmoklabel"),(Object)(_confirmtext),(Object)("btnconfirmcancellabel"),(Object)(_canceltext)}));
 //BA.debugLineNum = 1238;BA.debugLine="SetOnClick(eventHandler, \"btnConfirmOk_click\")";
_setonclick(_eventhandler,"btnConfirmOk_click");
 //BA.debugLineNum = 1239;BA.debugLine="SetOnClick(eventHandler, \"btnConfirmCancel_click\"";
_setonclick(_eventhandler,"btnConfirmCancel_click");
 //BA.debugLineNum = 1240;BA.debugLine="Confirm.Show";
_confirm._show /*b4j.example.vmdialog*/ ();
 //BA.debugLineNum = 1241;BA.debugLine="End Sub";
return "";
}
public String  _showdialog(String _did) throws Exception{
 //BA.debugLineNum = 1707;BA.debugLine="Sub ShowDialog(dID As String)";
 //BA.debugLineNum = 1708;BA.debugLine="dID = dID.tolowercase";
_did = _did.toLowerCase();
 //BA.debugLineNum = 1709;BA.debugLine="SetStateTrue(dID & \"show\")";
_setstatetrue(_did+"show");
 //BA.debugLineNum = 1710;BA.debugLine="End Sub";
return "";
}
public String  _showdrawer(String _did) throws Exception{
 //BA.debugLineNum = 1738;BA.debugLine="Sub ShowDrawer(dID As String)";
 //BA.debugLineNum = 1739;BA.debugLine="dID = dID.tolowercase";
_did = _did.toLowerCase();
 //BA.debugLineNum = 1740;BA.debugLine="HideOtherDrawers(dID)";
_hideotherdrawers(_did);
 //BA.debugLineNum = 1741;BA.debugLine="SetStateTrue(dID)";
_setstatetrue(_did);
 //BA.debugLineNum = 1742;BA.debugLine="End Sub";
return "";
}
public String  _showerror(String _elid,String _elerror) throws Exception{
 //BA.debugLineNum = 3365;BA.debugLine="Sub ShowError(elID As String, elError As String)";
 //BA.debugLineNum = 3366;BA.debugLine="vue.ShowError(elID, elError)";
_vue._showerror /*String*/ (_elid,_elerror);
 //BA.debugLineNum = 3367;BA.debugLine="End Sub";
return "";
}
public String  _showfileselect(String _fsname) throws Exception{
 //BA.debugLineNum = 1078;BA.debugLine="Sub ShowFileSelect(fsName As String)";
 //BA.debugLineNum = 1079;BA.debugLine="RefClick(fsName)";
_refclick(_fsname);
 //BA.debugLineNum = 1080;BA.debugLine="End Sub";
return "";
}
public String  _showitem(String _elid) throws Exception{
 //BA.debugLineNum = 2339;BA.debugLine="Sub ShowItem(elID As String)";
 //BA.debugLineNum = 2340;BA.debugLine="vue.ShowItem(elID)";
_vue._showitem /*String*/ (_elid);
 //BA.debugLineNum = 2341;BA.debugLine="End Sub";
return "";
}
public String  _showitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
String _item = "";
 //BA.debugLineNum = 2348;BA.debugLine="Sub ShowItems(items As List)";
 //BA.debugLineNum = 2349;BA.debugLine="For Each item As String In items";
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2350;BA.debugLine="ShowItem(item)";
_showitem(_item);
 }
};
 //BA.debugLineNum = 2352;BA.debugLine="End Sub";
return "";
}
public String  _showloading() throws Exception{
 //BA.debugLineNum = 912;BA.debugLine="Sub ShowLoading";
 //BA.debugLineNum = 913;BA.debugLine="NavBar.SetLoading(True)";
_navbar._setloading /*String*/ (__c.True);
 //BA.debugLineNum = 914;BA.debugLine="End Sub";
return "";
}
public String  _showmulti(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
String _item = "";
 //BA.debugLineNum = 1620;BA.debugLine="Sub ShowMulti(lst As List)";
 //BA.debugLineNum = 1621;BA.debugLine="For Each item As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1622;BA.debugLine="Show(item)";
_show(_item);
 }
};
 //BA.debugLineNum = 1624;BA.debugLine="End Sub";
return "";
}
public String  _shownotification(String _message,String _color,boolean _dismissable) throws Exception{
 //BA.debugLineNum = 1253;BA.debugLine="Sub ShowNotification(Message As String, Color As S";
 //BA.debugLineNum = 1254;BA.debugLine="Notification.SetContent(Message)";
_notification._setcontent /*b4j.example.vmalert*/ (_message);
 //BA.debugLineNum = 1255;BA.debugLine="Notification.SetColor(Color)";
_notification._setcolor /*b4j.example.vmalert*/ (_color);
 //BA.debugLineNum = 1256;BA.debugLine="Notification.SetDismissible(Dismissable)";
_notification._setdismissible /*b4j.example.vmalert*/ (_dismissable);
 //BA.debugLineNum = 1257;BA.debugLine="Notification.SetIcon(\"\")";
_notification._seticon /*b4j.example.vmalert*/ ("");
 //BA.debugLineNum = 1258;BA.debugLine="Notification.Show";
_notification._show /*b4j.example.vmalert*/ ();
 //BA.debugLineNum = 1259;BA.debugLine="End Sub";
return "";
}
public String  _showoverlay(String _did) throws Exception{
 //BA.debugLineNum = 1722;BA.debugLine="Sub ShowOverlay(dID As String)";
 //BA.debugLineNum = 1723;BA.debugLine="dID = dID.tolowercase";
_did = _did.toLowerCase();
 //BA.debugLineNum = 1724;BA.debugLine="vue.SetData($\"${dID}show\"$, True)";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_did))+"show"),(Object)(__c.True));
 //BA.debugLineNum = 1725;BA.debugLine="End Sub";
return "";
}
public String  _showpage(String _name) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _page = "";
 //BA.debugLineNum = 2702;BA.debugLine="Sub ShowPage(name As String)";
 //BA.debugLineNum = 2703;BA.debugLine="name = name.tolowercase";
_name = _name.toLowerCase();
 //BA.debugLineNum = 2704;BA.debugLine="If Pages.IndexOf(name) = -1 Then";
if (_pages.IndexOf((Object)(_name))==-1) { 
 //BA.debugLineNum = 2705;BA.debugLine="Log($\"ShowPage: ${name} does not exist!\"$)";
__c.Log(("ShowPage: "+__c.SmartStringFormatter("",(Object)(_name))+" does not exist!"));
 };
 //BA.debugLineNum = 2707;BA.debugLine="HideDrawers";
_hidedrawers();
 //BA.debugLineNum = 2708;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2709;BA.debugLine="For Each page As String In Pages";
{
final anywheresoftware.b4a.BA.IterableList group7 = _pages;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_page = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 2710;BA.debugLine="nm.Put($\"${page}show\"$, False)";
_nm.Put((Object)((""+__c.SmartStringFormatter("",(Object)(_page))+"show")),(Object)(__c.False));
 }
};
 //BA.debugLineNum = 2712;BA.debugLine="nm.Put($\"${name}show\"$, True)";
_nm.Put((Object)((""+__c.SmartStringFormatter("",(Object)(_name))+"show")),(Object)(__c.True));
 //BA.debugLineNum = 2713;BA.debugLine="SetState(nm)";
_setstate(_nm);
 //BA.debugLineNum = 2714;BA.debugLine="End Sub";
return "";
}
public String  _showprompt1(String _pname) throws Exception{
 //BA.debugLineNum = 2721;BA.debugLine="Sub ShowPrompt1(pName As String)";
 //BA.debugLineNum = 2722;BA.debugLine="SetPrompt(Null)";
_setprompt(__c.Null);
 //BA.debugLineNum = 2723;BA.debugLine="ShowDialog(pName)";
_showdialog(_pname);
 //BA.debugLineNum = 2724;BA.debugLine="End Sub";
return "";
}
public String  _showsnackbar(String _message) throws Exception{
 //BA.debugLineNum = 1526;BA.debugLine="Sub ShowSnackBar(Message As String)";
 //BA.debugLineNum = 1527;BA.debugLine="Message = CStr(Message)";
_message = _cstr((Object)(_message));
 //BA.debugLineNum = 1528;BA.debugLine="Message = Message.Replace(\"null\", \"\")";
_message = _message.replace("null","");
 //BA.debugLineNum = 1529;BA.debugLine="Message = Message.Trim";
_message = _message.trim();
 //BA.debugLineNum = 1530;BA.debugLine="If Message = \"\" Then Return";
if ((_message).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 1531;BA.debugLine="SetStateSingle(\"snackmessage\", Message)";
_setstatesingle("snackmessage",(Object)(_message));
 //BA.debugLineNum = 1532;BA.debugLine="SnackBar.Button.Hide";
_snackbar._button /*b4j.example.vmbutton*/ ._hide /*b4j.example.vmbutton*/ ();
 //BA.debugLineNum = 1533;BA.debugLine="SnackBar.show";
_snackbar._show /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 1534;BA.debugLine="End Sub";
return "";
}
public String  _showsnackbarbutton(String _message,String _buttontext,String _onclick) throws Exception{
 //BA.debugLineNum = 1536;BA.debugLine="Sub ShowSnackBarButton(Message As String, buttonTe";
 //BA.debugLineNum = 1537;BA.debugLine="SetStateSingle(\"snackmessage\", Message)";
_setstatesingle("snackmessage",(Object)(_message));
 //BA.debugLineNum = 1538;BA.debugLine="SnackBar.Button.Show";
_snackbar._button /*b4j.example.vmbutton*/ ._show /*b4j.example.vmbutton*/ ();
 //BA.debugLineNum = 1539;BA.debugLine="SnackBar.SetOnClick(OnClick)";
_snackbar._setonclick /*b4j.example.vmsnackbar*/ (_onclick);
 //BA.debugLineNum = 1540;BA.debugLine="SnackBar.Button.SetLabel(buttonText)";
_snackbar._button /*b4j.example.vmbutton*/ ._setlabel /*b4j.example.vmbutton*/ (_buttontext);
 //BA.debugLineNum = 1541;BA.debugLine="SnackBar.show";
_snackbar._show /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 1542;BA.debugLine="End Sub";
return "";
}
public String  _showsnackbarerror(String _message) throws Exception{
 //BA.debugLineNum = 1502;BA.debugLine="Sub ShowSnackBarError(Message As String)";
 //BA.debugLineNum = 1503;BA.debugLine="Message = CStr(Message)";
_message = _cstr((Object)(_message));
 //BA.debugLineNum = 1504;BA.debugLine="Message = Message.Replace(\"null\", \"\")";
_message = _message.replace("null","");
 //BA.debugLineNum = 1505;BA.debugLine="Message = Message.Trim";
_message = _message.trim();
 //BA.debugLineNum = 1506;BA.debugLine="If Message = \"\" Then Return";
if ((_message).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 1507;BA.debugLine="SetStateSingle(\"snackmessage\", Message)";
_setstatesingle("snackmessage",(Object)(_message));
 //BA.debugLineNum = 1508;BA.debugLine="SnackBar.SetTop(True)";
_snackbar._settop /*b4j.example.vmsnackbar*/ (__c.True);
 //BA.debugLineNum = 1509;BA.debugLine="SnackBar.SetColor(\"red\")";
_snackbar._setcolor /*b4j.example.vmsnackbar*/ ("red");
 //BA.debugLineNum = 1510;BA.debugLine="SnackBar.Button.Hide";
_snackbar._button /*b4j.example.vmbutton*/ ._hide /*b4j.example.vmbutton*/ ();
 //BA.debugLineNum = 1511;BA.debugLine="SnackBar.show";
_snackbar._show /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 1512;BA.debugLine="End Sub";
return "";
}
public String  _showsnackbarsuccess(String _message) throws Exception{
 //BA.debugLineNum = 1514;BA.debugLine="Sub ShowSnackBarSuccess(Message As String)";
 //BA.debugLineNum = 1515;BA.debugLine="Message = CStr(Message)";
_message = _cstr((Object)(_message));
 //BA.debugLineNum = 1516;BA.debugLine="Message = Message.Replace(\"null\", \"\")";
_message = _message.replace("null","");
 //BA.debugLineNum = 1517;BA.debugLine="Message = Message.Trim";
_message = _message.trim();
 //BA.debugLineNum = 1518;BA.debugLine="If Message = \"\" Then Return";
if ((_message).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 1519;BA.debugLine="SetStateSingle(\"snackmessage\", Message)";
_setstatesingle("snackmessage",(Object)(_message));
 //BA.debugLineNum = 1520;BA.debugLine="SnackBar.SetColor(\"green\")";
_snackbar._setcolor /*b4j.example.vmsnackbar*/ ("green");
 //BA.debugLineNum = 1521;BA.debugLine="SnackBar.SetTop(True)";
_snackbar._settop /*b4j.example.vmsnackbar*/ (__c.True);
 //BA.debugLineNum = 1522;BA.debugLine="SnackBar.Button.Hide";
_snackbar._button /*b4j.example.vmbutton*/ ._hide /*b4j.example.vmbutton*/ ();
 //BA.debugLineNum = 1523;BA.debugLine="SnackBar.show";
_snackbar._show /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 1524;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _showspeeddial(String _elid) throws Exception{
 //BA.debugLineNum = 1485;BA.debugLine="Sub ShowSpeedDial(elID As String) As BANanoVM";
 //BA.debugLineNum = 1486;BA.debugLine="SetStateSingle(elID, True)";
_setstatesingle(_elid,(Object)(__c.True));
 //BA.debugLineNum = 1487;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1488;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _span(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 474;BA.debugLine="Sub Span(elID As String) As VMElement";
 //BA.debugLineNum = 475;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 476;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 477;BA.debugLine="elx.SetTag(\"span\")";
_elx._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 478;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return null;
}
public String  _state2another(String _source,String _target,Object _defaultvalue) throws Exception{
 //BA.debugLineNum = 1681;BA.debugLine="Sub State2Another(source As String, target As Stri";
 //BA.debugLineNum = 1682;BA.debugLine="vue.State2Another(source, target, defaultValue)";
_vue._state2another /*String*/ (_source,_target,_defaultvalue);
 //BA.debugLineNum = 1683;BA.debugLine="End Sub";
return "";
}
public boolean  _stateexists(String _statename) throws Exception{
 //BA.debugLineNum = 2440;BA.debugLine="Sub StateExists(stateName As String) As Boolean";
 //BA.debugLineNum = 2441;BA.debugLine="Return vue.StateExists(stateName)";
if (true) return _vue._stateexists /*boolean*/ (_statename);
 //BA.debugLineNum = 2442;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _strparse(String _delim,String _inputstring) throws Exception{
 //BA.debugLineNum = 1871;BA.debugLine="Sub StrParse(Delim As String, InputString As Strin";
 //BA.debugLineNum = 1872;BA.debugLine="Return vue.StrParse(Delim, InputString)";
if (true) return _vue._strparse /*anywheresoftware.b4a.objects.collections.List*/ (_delim,_inputstring);
 //BA.debugLineNum = 1873;BA.debugLine="End Sub";
return null;
}
public String  _timenow() throws Exception{
 //BA.debugLineNum = 3005;BA.debugLine="Public Sub TimeNow() As String";
 //BA.debugLineNum = 3006;BA.debugLine="Return vue.timenow";
if (true) return _vue._timenow /*String*/ ();
 //BA.debugLineNum = 3007;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _togglenamedstate(String _statename,String _state1,String _state2) throws Exception{
 //BA.debugLineNum = 2638;BA.debugLine="Sub ToggleNamedState(stateName As String, state1 A";
 //BA.debugLineNum = 2639;BA.debugLine="vue.ToggleNamedState(stateName, state1, state2)";
_vue._togglenamedstate /*b4j.example.bananovue*/ (_statename,_state1,_state2);
 //BA.debugLineNum = 2640;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2641;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _togglestate(String _statename) throws Exception{
 //BA.debugLineNum = 2444;BA.debugLine="Sub ToggleState(stateName As String) As BANanoVM";
 //BA.debugLineNum = 2445;BA.debugLine="vue.ToggleState(stateName)";
_vue._togglestate /*b4j.example.bananovue*/ (_statename);
 //BA.debugLineNum = 2446;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 2447;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _treeitem(String _parentid,String _key,String _text,String _mhref,String _micon,boolean _mdisabled) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 3723;BA.debugLine="Sub TreeItem(parentID As String, key As String, te";
 //BA.debugLineNum = 3724;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 3725;BA.debugLine="key = key.tolowercase";
_key = _key.toLowerCase();
 //BA.debugLineNum = 3726;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 3727;BA.debugLine="mitem.Put(\"id\", key)";
_mitem.Put((Object)("id"),(Object)(_key));
 //BA.debugLineNum = 3728;BA.debugLine="mitem.Put(\"name\", text)";
_mitem.Put((Object)("name"),(Object)(_text));
 //BA.debugLineNum = 3729;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 3730;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 3731;BA.debugLine="mitem.Put(\"disabled\", mDisabled)";
_mitem.Put((Object)("disabled"),(Object)(_mdisabled));
 //BA.debugLineNum = 3732;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 3733;BA.debugLine="Return mitem";
if (true) return _mitem;
 //BA.debugLineNum = 3734;BA.debugLine="End Sub";
return null;
}
public String  _use(com.ab.banano.BANanoObject _bo) throws Exception{
 //BA.debugLineNum = 2549;BA.debugLine="Sub Use(bo As BANanoObject)";
 //BA.debugLineNum = 2550;BA.debugLine="vue.Use(bo)";
_vue._use /*String*/ (_bo);
 //BA.debugLineNum = 2551;BA.debugLine="End Sub";
return "";
}
public String  _useblanktemplate() throws Exception{
 //BA.debugLineNum = 403;BA.debugLine="Sub UseBlankTemplate";
 //BA.debugLineNum = 404;BA.debugLine="UsesDrawer = False";
_usesdrawer = __c.False;
 //BA.debugLineNum = 405;BA.debugLine="UsesNavBar = False";
_usesnavbar = __c.False;
 //BA.debugLineNum = 406;BA.debugLine="UsesFooter = False";
_usesfooter = __c.False;
 //BA.debugLineNum = 407;BA.debugLine="UsesBottomNav = False";
_usesbottomnav = __c.False;
 //BA.debugLineNum = 408;BA.debugLine="UsesOverlay = False";
_usesoverlay = __c.False;
 //BA.debugLineNum = 409;BA.debugLine="UsesLoader = False";
_usesloader = __c.False;
 //BA.debugLineNum = 410;BA.debugLine="UsesSnackBar = False";
_usessnackbar = __c.False;
 //BA.debugLineNum = 411;BA.debugLine="UsesDialog = False";
_usesdialog = __c.False;
 //BA.debugLineNum = 412;BA.debugLine="UsesNotification = False";
_usesnotification = __c.False;
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return "";
}
public String  _ux() throws Exception{
anywheresoftware.b4a.objects.collections.Map _mlang = null;
anywheresoftware.b4a.objects.collections.Map _theme = null;
String _sdialog = "";
String _svuetify = "";
 //BA.debugLineNum = 3050;BA.debugLine="Sub UX";
 //BA.debugLineNum = 3051;BA.debugLine="vue.ShowWarnings = ShowWarnings";
_vue._showwarnings /*boolean*/  = _showwarnings;
 //BA.debugLineNum = 3052;BA.debugLine="If ShowWarnings Then";
if (_showwarnings) { 
 //BA.debugLineNum = 3053;BA.debugLine="If SubExists(Module, \"confirm_ok\") = False Then";
if (__c.SubExists(ba,_module,"confirm_ok")==__c.False) { 
 //BA.debugLineNum = 3054;BA.debugLine="Log(\"Initialize.confirm_ok - please consider ad";
__c.Log("Initialize.confirm_ok - please consider adding this optional event to trap confirm dialog!");
 };
 //BA.debugLineNum = 3057;BA.debugLine="If SubExists(Module, \"confirm_cancel\") = False T";
if (__c.SubExists(ba,_module,"confirm_cancel")==__c.False) { 
 //BA.debugLineNum = 3058;BA.debugLine="Log(\"Initialize.confirm_cancel - please conside";
__c.Log("Initialize.confirm_cancel - please consider adding this optional event to trap confirm dialog!");
 };
 //BA.debugLineNum = 3061;BA.debugLine="If SubExists(Module, \"alert_ok\") = False Then";
if (__c.SubExists(ba,_module,"alert_ok")==__c.False) { 
 //BA.debugLineNum = 3062;BA.debugLine="Log(\"Initialize.alert_ok - please consider addi";
__c.Log("Initialize.alert_ok - please consider adding this optional event to trap alert dialog!");
 };
 //BA.debugLineNum = 3065;BA.debugLine="If SubExists(Module, \"logo_click\") = False Then";
if (__c.SubExists(ba,_module,"logo_click")==__c.False) { 
 //BA.debugLineNum = 3066;BA.debugLine="Log(\"Initialize.logo_click - please consider ad";
__c.Log("Initialize.logo_click - please consider adding this optional event to trap logo click event if needed!");
 };
 //BA.debugLineNum = 3069;BA.debugLine="If SubExists(Module, \"title_click\") = False Then";
if (__c.SubExists(ba,_module,"title_click")==__c.False) { 
 //BA.debugLineNum = 3070;BA.debugLine="Log(\"Initialize.title_click - please consider a";
__c.Log("Initialize.title_click - please consider adding this optional event to trap title click event if needed!");
 };
 };
 //BA.debugLineNum = 3073;BA.debugLine="Drawer.SetRight(RTL)";
_drawer._setright /*b4j.example.vmnavigationdrawer*/ (_rtl);
 //BA.debugLineNum = 3075;BA.debugLine="Dim mlang As Map = CreateMap()";
_mlang = new anywheresoftware.b4a.objects.collections.Map();
_mlang = __c.createMap(new Object[] {});
 //BA.debugLineNum = 3076;BA.debugLine="mlang.Put(\"current\", lang)";
_mlang.Put((Object)("current"),(Object)(_lang));
 //BA.debugLineNum = 3078;BA.debugLine="Dim theme As Map = CreateMap()";
_theme = new anywheresoftware.b4a.objects.collections.Map();
_theme = __c.createMap(new Object[] {});
 //BA.debugLineNum = 3079;BA.debugLine="theme.Put(\"dark\", Dark)";
_theme.Put((Object)("dark"),(Object)(_dark));
 //BA.debugLineNum = 3080;BA.debugLine="Options.Put(\"rtl\", RTL)";
_options.Put((Object)("rtl"),(Object)(_rtl));
 //BA.debugLineNum = 3081;BA.debugLine="Options.Put(\"theme\", theme)";
_options.Put((Object)("theme"),(Object)(_theme.getObject()));
 //BA.debugLineNum = 3082;BA.debugLine="Options.Put(\"lang\", mlang)";
_options.Put((Object)("lang"),(Object)(_mlang.getObject()));
 //BA.debugLineNum = 3084;BA.debugLine="If UsesDialog Then";
if (_usesdialog) { 
 //BA.debugLineNum = 3085;BA.debugLine="Dim sDialog As String = Confirm.tostring";
_sdialog = _confirm._tostring /*String*/ ();
 //BA.debugLineNum = 3086;BA.debugLine="AddContent(sDialog)";
_addcontent(_sdialog);
 //BA.debugLineNum = 3088;BA.debugLine="Dim sDialog As String = Alert.tostring";
_sdialog = _alert._tostring /*String*/ ();
 //BA.debugLineNum = 3089;BA.debugLine="AddContent(sDialog)";
_addcontent(_sdialog);
 };
 //BA.debugLineNum = 3092;BA.debugLine="If UsesSnackBar Then SnackBar.Pop(VContent)";
if (_usessnackbar) { 
_snackbar._pop /*String*/ (_vcontent);};
 //BA.debugLineNum = 3093;BA.debugLine="If UsesOverlay Then Overlay.Pop(VContent)";
if (_usesoverlay) { 
_overlay._pop /*String*/ (_vcontent);};
 //BA.debugLineNum = 3094;BA.debugLine="If UsesNotification Then Notification.Pop(VConten";
if (_usesnotification) { 
_notification._pop /*String*/ (_vcontent);};
 //BA.debugLineNum = 3097;BA.debugLine="If UsesDrawer Then Drawer.Pop(VApp)";
if (_usesdrawer) { 
_drawer._pop /*String*/ (_vapp);};
 //BA.debugLineNum = 3099;BA.debugLine="If UsesNavBar Then NavBar.Pop(VApp)";
if (_usesnavbar) { 
_navbar._pop /*String*/ (_vapp);};
 //BA.debugLineNum = 3101;BA.debugLine="If bUseRouter Then";
if (_buserouter) { 
 //BA.debugLineNum = 3102;BA.debugLine="Animate.AddComponent(RouterView.ToString)";
_animate._addcomponent /*b4j.example.vmtransition*/ (_routerview._tostring /*String*/ ());
 //BA.debugLineNum = 3103;BA.debugLine="VContent.AddComponent(Animate.ToString)";
_vcontent._addcomponent /*b4j.example.vmelement*/ (_animate._tostring /*String*/ ());
 }else {
 //BA.debugLineNum = 3105;BA.debugLine="Container.Pop(VContent)";
_container._pop /*String*/ (_vcontent);
 };
 //BA.debugLineNum = 3109;BA.debugLine="VContent.Pop(VApp)";
_vcontent._pop /*String*/ (_vapp);
 //BA.debugLineNum = 3111;BA.debugLine="If UsesFooter Then Footer.Pop(VApp)";
if (_usesfooter) { 
_footer._pop /*String*/ (_vapp);};
 //BA.debugLineNum = 3113;BA.debugLine="If UsesBottomNav Then BottomNav.Pop(VApp)";
if (_usesbottomnav) { 
_bottomnav._pop /*String*/ (_vapp);};
 //BA.debugLineNum = 3115;BA.debugLine="vue.SetTemplate(VApp.ToString)";
_vue._settemplate /*String*/ (_vapp._tostring /*String*/ ());
 //BA.debugLineNum = 3119;BA.debugLine="BOVuetify.Initialize2(\"Vuetify\", Options)";
_bovuetify.Initialize2("Vuetify",(Object)(_options.getObject()));
 //BA.debugLineNum = 3120;BA.debugLine="vue.SetFrameWork(\"vuetify\", BOVuetify)";
_vue._setframework /*String*/ ("vuetify",_bovuetify);
 //BA.debugLineNum = 3122;BA.debugLine="vue.ux";
_vue._ux /*String*/ ();
 //BA.debugLineNum = 3124;BA.debugLine="Dim svuetify As String = \"$vuetify\"";
_svuetify = "$vuetify";
 //BA.debugLineNum = 3125;BA.debugLine="vuetify = vue.BOVue.GetField(svuetify)";
_vuetify = _vue._bovue /*com.ab.banano.BANanoObject*/ .GetField(_svuetify);
 //BA.debugLineNum = 3126;BA.debugLine="Breakpoint = vuetify.GetField(\"breakpoint\").Resul";
_breakpoint = _vuetify.GetField("breakpoint").Result();
 //BA.debugLineNum = 3127;BA.debugLine="BreakpointName = vuetify.GetField(\"breakpoint\").G";
_breakpointname = BA.ObjectToString(_vuetify.GetField("breakpoint").GetField("name").Result());
 //BA.debugLineNum = 3128;BA.debugLine="End Sub";
return "";
}
public boolean  _validate(anywheresoftware.b4a.objects.collections.Map _rec,anywheresoftware.b4a.objects.collections.Map _required) throws Exception{
 //BA.debugLineNum = 2990;BA.debugLine="Sub Validate(rec As Map, required As Map) As Boole";
 //BA.debugLineNum = 2991;BA.debugLine="Return vue.Validate(rec, required)";
if (true) return _vue._validate /*boolean*/ (_rec,_required);
 //BA.debugLineNum = 2992;BA.debugLine="End Sub";
return false;
}
public b4j.example.vmelement  _vappbar(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 779;BA.debugLine="Sub VAppBar(elID As String) As VMElement";
 //BA.debugLineNum = 780;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 781;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 782;BA.debugLine="elx.SetTag(\"v-app-bar\").AddAttr(\"app\", True)";
_elx._settag /*b4j.example.vmelement*/ ("v-app-bar")._addattr /*b4j.example.vmelement*/ ("app",BA.ObjectToString(__c.True));
 //BA.debugLineNum = 783;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 784;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vappbarnavicon(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 793;BA.debugLine="Sub VAppBarNavIcon(elID As String) As VMElement";
 //BA.debugLineNum = 794;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 795;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 796;BA.debugLine="elx.SetTag(\"v-app-bar-nav-icon\")";
_elx._settag /*b4j.example.vmelement*/ ("v-app-bar-nav-icon");
 //BA.debugLineNum = 797;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 798;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vautocomplete(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 689;BA.debugLine="Sub VAutoComplete(elID As String) As VMElement";
 //BA.debugLineNum = 690;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 691;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 692;BA.debugLine="elx.SetTag(\"v-autocomplete\")";
_elx._settag /*b4j.example.vmelement*/ ("v-autocomplete");
 //BA.debugLineNum = 693;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 694;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vavatar(String _tid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 885;BA.debugLine="Sub VAvatar(tID As String) As VMElement";
 //BA.debugLineNum = 886;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 887;BA.debugLine="elx.Initialize(vue, tID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_tid);
 //BA.debugLineNum = 888;BA.debugLine="elx.SetTag(\"v-avatar\")";
_elx._settag /*b4j.example.vmelement*/ ("v-avatar");
 //BA.debugLineNum = 889;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 890;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vbottomnav(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 531;BA.debugLine="Sub VBottomNav(elID As String) As VMElement";
 //BA.debugLineNum = 532;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 533;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 534;BA.debugLine="elx.SetTag(\"v-bottom-nav\")";
_elx._settag /*b4j.example.vmelement*/ ("v-bottom-nav");
 //BA.debugLineNum = 535;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 536;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vbtn(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 871;BA.debugLine="Sub VBtn(elID As String) As VMElement";
 //BA.debugLineNum = 872;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 873;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 874;BA.debugLine="elx.SetTag(\"v-btn\")";
_elx._settag /*b4j.example.vmelement*/ ("v-btn");
 //BA.debugLineNum = 875;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 876;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vcard(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 653;BA.debugLine="Sub VCard(elID As String) As VMElement";
 //BA.debugLineNum = 654;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 655;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 656;BA.debugLine="elx.SetTag(\"v-card\")";
_elx._settag /*b4j.example.vmelement*/ ("v-card");
 //BA.debugLineNum = 657;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 658;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vcardactions(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 603;BA.debugLine="Sub VCardActions(elID As String) As VMElement";
 //BA.debugLineNum = 604;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 605;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 606;BA.debugLine="elx.SetTag(\"v-card-actions\")";
_elx._settag /*b4j.example.vmelement*/ ("v-card-actions");
 //BA.debugLineNum = 607;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 608;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vcardtext(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 660;BA.debugLine="Sub VCardText(elID As String) As VMElement";
 //BA.debugLineNum = 661;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 662;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 663;BA.debugLine="elx.SetTag(\"v-card-text\")";
_elx._settag /*b4j.example.vmelement*/ ("v-card-text");
 //BA.debugLineNum = 664;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 665;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vcardtitle(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 667;BA.debugLine="Sub VCardTitle(elID As String) As VMElement";
 //BA.debugLineNum = 668;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 669;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 670;BA.debugLine="elx.SetTag(\"v-card-title\")";
_elx._settag /*b4j.example.vmelement*/ ("v-card-title");
 //BA.debugLineNum = 671;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 672;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vcarousel(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 517;BA.debugLine="Sub VCarousel(elID As String) As VMElement";
 //BA.debugLineNum = 518;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 519;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 520;BA.debugLine="elx.SetTag(\"v-carousel\")";
_elx._settag /*b4j.example.vmelement*/ ("v-carousel");
 //BA.debugLineNum = 521;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 522;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vcarouselitem(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 509;BA.debugLine="Sub VCarouselItem(elID As String) As VMElement";
 //BA.debugLineNum = 510;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 511;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 512;BA.debugLine="elx.SetTag(\"v-carousel-item\")";
_elx._settag /*b4j.example.vmelement*/ ("v-carousel-item");
 //BA.debugLineNum = 513;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 514;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vcheckbox(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 719;BA.debugLine="Sub VCheckBox(elID As String) As VMElement";
 //BA.debugLineNum = 720;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 721;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 722;BA.debugLine="elx.SetTag(\"<v-checkbox\")";
_elx._settag /*b4j.example.vmelement*/ ("<v-checkbox");
 //BA.debugLineNum = 723;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 724;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vchip(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 849;BA.debugLine="Sub VChip(elid As String) As VMElement";
 //BA.debugLineNum = 850;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 851;BA.debugLine="elx.Initialize(vue, elid)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 852;BA.debugLine="elx.SetTag(\"v-chip\")";
_elx._settag /*b4j.example.vmelement*/ ("v-chip");
 //BA.debugLineNum = 853;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 854;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vchipgroup(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 856;BA.debugLine="Sub VChipGroup(elid As String) As VMElement";
 //BA.debugLineNum = 857;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 858;BA.debugLine="elx.Initialize(vue, elid)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 859;BA.debugLine="elx.SetTag(\"v-chip-group\")";
_elx._settag /*b4j.example.vmelement*/ ("v-chip-group");
 //BA.debugLineNum = 860;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 861;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vcol(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 674;BA.debugLine="Sub VCol(elID As String) As VMElement";
 //BA.debugLineNum = 675;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 676;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 677;BA.debugLine="elx.SetTag(\"v-col\")";
_elx._settag /*b4j.example.vmelement*/ ("v-col");
 //BA.debugLineNum = 678;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vcontainer(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 646;BA.debugLine="Sub VContainer(elID As String) As VMElement";
 //BA.debugLineNum = 647;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 648;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 649;BA.debugLine="elx.SetTag(\"v-container\")";
_elx._settag /*b4j.example.vmelement*/ ("v-container");
 //BA.debugLineNum = 650;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 651;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vdialog(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 596;BA.debugLine="Sub VDialog(elID As String) As VMElement";
 //BA.debugLineNum = 597;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 598;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 599;BA.debugLine="elx.SetTag(\"v-dialog\")";
_elx._settag /*b4j.example.vmelement*/ ("v-dialog");
 //BA.debugLineNum = 600;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 601;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vdivider(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 842;BA.debugLine="Sub VDivider(elid As String) As VMElement";
 //BA.debugLineNum = 843;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 844;BA.debugLine="elx.Initialize(vue, elid)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 845;BA.debugLine="elx.SetTag(\"v-divider\")";
_elx._settag /*b4j.example.vmelement*/ ("v-divider");
 //BA.debugLineNum = 846;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 847;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vfileinput(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 422;BA.debugLine="Sub VFileInput(elID As String) As VMElement";
 //BA.debugLineNum = 423;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 424;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 425;BA.debugLine="elx.SetTag(\"v-file-input\")";
_elx._settag /*b4j.example.vmelement*/ ("v-file-input");
 //BA.debugLineNum = 426;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vicon(String _tid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 892;BA.debugLine="Sub VIcon(tID As String) As VMElement";
 //BA.debugLineNum = 893;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 894;BA.debugLine="elx.Initialize(vue, tID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_tid);
 //BA.debugLineNum = 895;BA.debugLine="elx.SetTag(\"v-icon\")";
_elx._settag /*b4j.example.vmelement*/ ("v-icon");
 //BA.debugLineNum = 896;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 897;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vimg(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 734;BA.debugLine="Sub VImg(elID As String) As VMElement";
 //BA.debugLineNum = 735;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 736;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 737;BA.debugLine="elx.SetTag(\"v-img\")";
_elx._settag /*b4j.example.vmelement*/ ("v-img");
 //BA.debugLineNum = 738;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 739;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vlist(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 864;BA.debugLine="Sub VList(elID As String) As VMElement";
 //BA.debugLineNum = 865;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 866;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 867;BA.debugLine="elx.SetTag(\"v-list\")";
_elx._settag /*b4j.example.vmelement*/ ("v-list");
 //BA.debugLineNum = 868;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 869;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vlistitem(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 800;BA.debugLine="Sub VListItem(elID As String) As VMElement";
 //BA.debugLineNum = 801;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 802;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 803;BA.debugLine="elx.SetTag(\"v-list-item\")";
_elx._settag /*b4j.example.vmelement*/ ("v-list-item");
 //BA.debugLineNum = 804;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 805;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vlistitemaction(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 828;BA.debugLine="Sub VListItemAction(elID As String) As VMElement";
 //BA.debugLineNum = 829;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 830;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 831;BA.debugLine="elx.SetTag(\"v-list-item-action\")";
_elx._settag /*b4j.example.vmelement*/ ("v-list-item-action");
 //BA.debugLineNum = 832;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 833;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vlistitemactiontext(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 631;BA.debugLine="Sub VListItemActionText(elID As String) As VMEleme";
 //BA.debugLineNum = 632;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 633;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 634;BA.debugLine="elx.SetTag(\"v-list-item-action-text\")";
_elx._settag /*b4j.example.vmelement*/ ("v-list-item-action-text");
 //BA.debugLineNum = 635;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 636;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vlistitemavatar(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 807;BA.debugLine="Sub VListItemAvatar(elID As String) As VMElement";
 //BA.debugLineNum = 808;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 809;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 810;BA.debugLine="elx.SetTag(\"v-list-item-avatar\")";
_elx._settag /*b4j.example.vmelement*/ ("v-list-item-avatar");
 //BA.debugLineNum = 811;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 812;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vlistitemcontent(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 814;BA.debugLine="Sub VListItemContent(elID As String) As VMElement";
 //BA.debugLineNum = 815;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 816;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 817;BA.debugLine="elx.SetTag(\"v-list-item-content\")";
_elx._settag /*b4j.example.vmelement*/ ("v-list-item-content");
 //BA.debugLineNum = 818;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 819;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vlistitemgroup(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 624;BA.debugLine="Sub VListItemGroup(elID As String) As VMElement";
 //BA.debugLineNum = 625;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 626;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 627;BA.debugLine="elx.SetTag(\"v-list-item-group\")";
_elx._settag /*b4j.example.vmelement*/ ("v-list-item-group");
 //BA.debugLineNum = 628;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 629;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vlistitemsubtitle(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 726;BA.debugLine="Sub VListItemSubTitle(elID As String) As VMElement";
 //BA.debugLineNum = 727;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 728;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 729;BA.debugLine="elx.SetTag(\"v-list-item-subtitle\")";
_elx._settag /*b4j.example.vmelement*/ ("v-list-item-subtitle");
 //BA.debugLineNum = 730;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 731;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vlistitemtitle(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 821;BA.debugLine="Sub VListItemTitle(elID As String) As VMElement";
 //BA.debugLineNum = 822;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 823;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 824;BA.debugLine="elx.SetTag(\"v-list-item-title\")";
_elx._settag /*b4j.example.vmelement*/ ("v-list-item-title");
 //BA.debugLineNum = 825;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 826;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vmenu(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 742;BA.debugLine="Sub VMenu(elID As String) As VMElement";
 //BA.debugLineNum = 743;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 744;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 745;BA.debugLine="elx.SetTag(\"v-menu\")";
_elx._settag /*b4j.example.vmelement*/ ("v-menu");
 //BA.debugLineNum = 746;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 747;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vnavigationdrawer(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 786;BA.debugLine="Sub VNavigationDrawer(elID As String) As VMElement";
 //BA.debugLineNum = 787;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 788;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 789;BA.debugLine="elx.SetTag(\"v-navigation-drawer\")";
_elx._settag /*b4j.example.vmelement*/ ("v-navigation-drawer");
 //BA.debugLineNum = 790;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 791;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vprogresslinear(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 697;BA.debugLine="Sub VProgressLinear(elID As String) As VMElement";
 //BA.debugLineNum = 698;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 699;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 700;BA.debugLine="elx.SetTag(\"v-progress-linear\")";
_elx._settag /*b4j.example.vmelement*/ ("v-progress-linear");
 //BA.debugLineNum = 701;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 702;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vradio(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 758;BA.debugLine="Sub VRadio(elID As String) As VMElement";
 //BA.debugLineNum = 759;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 760;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 761;BA.debugLine="elx.SetTag(\"v-radio\")";
_elx._settag /*b4j.example.vmelement*/ ("v-radio");
 //BA.debugLineNum = 762;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 763;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vradiogroup(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 765;BA.debugLine="Sub VRadioGroup(elID As String) As VMElement";
 //BA.debugLineNum = 766;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 767;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 768;BA.debugLine="elx.SetTag(\"v-radio-group\")";
_elx._settag /*b4j.example.vmelement*/ ("v-radio-group");
 //BA.debugLineNum = 769;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 770;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vrating(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 502;BA.debugLine="Sub VRating(elID As String) As VMElement";
 //BA.debugLineNum = 503;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 504;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 505;BA.debugLine="elx.SetTag(\"v-rating\")";
_elx._settag /*b4j.example.vmelement*/ ("v-rating");
 //BA.debugLineNum = 506;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 507;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vresponsive(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 524;BA.debugLine="Sub VResponsive(elID As String) As VMElement";
 //BA.debugLineNum = 525;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 526;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 527;BA.debugLine="elx.SetTag(\"v-responsive\")";
_elx._settag /*b4j.example.vmelement*/ ("v-responsive");
 //BA.debugLineNum = 528;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 529;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vrow(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 589;BA.debugLine="Sub VRow(elID As String) As VMElement";
 //BA.debugLineNum = 590;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 591;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 592;BA.debugLine="elx.SetTag(\"v-row\")";
_elx._settag /*b4j.example.vmelement*/ ("v-row");
 //BA.debugLineNum = 593;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 594;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vselect(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 681;BA.debugLine="Sub VSelect(elID As String) As VMElement";
 //BA.debugLineNum = 682;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 683;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 684;BA.debugLine="elx.SetTag(\"v-select\")";
_elx._settag /*b4j.example.vmelement*/ ("v-select");
 //BA.debugLineNum = 685;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 686;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vsnackbar(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 481;BA.debugLine="Sub VSnackBar(elID As String) As VMElement";
 //BA.debugLineNum = 482;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 483;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 484;BA.debugLine="elx.SetTag(\"v-snackbar\")";
_elx._settag /*b4j.example.vmelement*/ ("v-snackbar");
 //BA.debugLineNum = 485;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 486;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vspacer(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 835;BA.debugLine="Sub VSpacer(elID As String) As VMElement";
 //BA.debugLineNum = 836;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 837;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 838;BA.debugLine="elx.SetTag(\"v-spacer\")";
_elx._settag /*b4j.example.vmelement*/ ("v-spacer");
 //BA.debugLineNum = 839;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 840;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vstepper(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 538;BA.debugLine="Sub VStepper(elID As String) As VMElement";
 //BA.debugLineNum = 539;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 540;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 541;BA.debugLine="elx.SetTag(\"v-stepper\")";
_elx._settag /*b4j.example.vmelement*/ ("v-stepper");
 //BA.debugLineNum = 542;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 543;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vsteppercontent(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 582;BA.debugLine="Sub VStepperContent(elID As String) As VMElement";
 //BA.debugLineNum = 583;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 584;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 585;BA.debugLine="elx.SetTag(\"v-stepper-content\")";
_elx._settag /*b4j.example.vmelement*/ ("v-stepper-content");
 //BA.debugLineNum = 586;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 587;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vstepperheader(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 545;BA.debugLine="Sub VStepperHeader(elID As String) As VMElement";
 //BA.debugLineNum = 546;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 547;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 548;BA.debugLine="elx.SetTag(\"v-stepper-header\")";
_elx._settag /*b4j.example.vmelement*/ ("v-stepper-header");
 //BA.debugLineNum = 549;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 550;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vstepperitems(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 575;BA.debugLine="Sub VStepperItems(elID As String) As VMElement";
 //BA.debugLineNum = 576;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 577;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 578;BA.debugLine="elx.SetTag(\"v-stepper-items\")";
_elx._settag /*b4j.example.vmelement*/ ("v-stepper-items");
 //BA.debugLineNum = 579;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 580;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vstepperstep(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 553;BA.debugLine="Sub VStepperStep(elID As String) As VMElement";
 //BA.debugLineNum = 554;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 555;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 556;BA.debugLine="elx.SetTag(\"v-stepper-step\")";
_elx._settag /*b4j.example.vmelement*/ ("v-stepper-step");
 //BA.debugLineNum = 557;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 558;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vsubheader(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 712;BA.debugLine="Sub VSubHeader(elID As String) As VMElement";
 //BA.debugLineNum = 713;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 714;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 715;BA.debugLine="elx.SetTag(\"v-subheader\")";
_elx._settag /*b4j.example.vmelement*/ ("v-subheader");
 //BA.debugLineNum = 716;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 717;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vtemplate(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 639;BA.debugLine="Sub VTemplate(elID As String) As VMElement";
 //BA.debugLineNum = 640;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 641;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 642;BA.debugLine="elx.SetTag(\"template\")";
_elx._settag /*b4j.example.vmelement*/ ("template");
 //BA.debugLineNum = 643;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 644;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vtextfield(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 772;BA.debugLine="Sub VTextField(elID As String) As VMElement";
 //BA.debugLineNum = 773;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 774;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 775;BA.debugLine="elx.SetTag(\"v-text-field\")";
_elx._settag /*b4j.example.vmelement*/ ("v-text-field");
 //BA.debugLineNum = 776;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 777;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vtimeline(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 560;BA.debugLine="Sub VTimeline(elID As String) As VMElement";
 //BA.debugLineNum = 561;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 562;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 563;BA.debugLine="elx.SetTag(\"v-timeline\")";
_elx._settag /*b4j.example.vmelement*/ ("v-timeline");
 //BA.debugLineNum = 564;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 565;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vtimelineitem(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 567;BA.debugLine="Sub VTimelineItem(elID As String) As VMElement";
 //BA.debugLineNum = 568;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 569;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 570;BA.debugLine="elx.SetTag(\"v-timeline-item\")";
_elx._settag /*b4j.example.vmelement*/ ("v-timeline-item");
 //BA.debugLineNum = 571;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 572;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vtoolbar(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 705;BA.debugLine="Sub VToolBar(elID As String) As VMElement";
 //BA.debugLineNum = 706;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 707;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 708;BA.debugLine="elx.SetTag(\"v-toolbar\")";
_elx._settag /*b4j.example.vmelement*/ ("v-toolbar");
 //BA.debugLineNum = 709;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 710;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vtoolbaritems(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 750;BA.debugLine="Sub VToolbarItems(elID As String) As VMElement";
 //BA.debugLineNum = 751;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 752;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 753;BA.debugLine="elx.SetTag(\"v-toolbar-items\")";
_elx._settag /*b4j.example.vmelement*/ ("v-toolbar-items");
 //BA.debugLineNum = 754;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 755;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vtoolbartitle(String _tid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 878;BA.debugLine="Sub VToolbarTitle(tID As String) As VMElement";
 //BA.debugLineNum = 879;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 880;BA.debugLine="elx.Initialize(vue, tID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_tid);
 //BA.debugLineNum = 881;BA.debugLine="elx.SetTag(\"v-toolbar-title\")";
_elx._settag /*b4j.example.vmelement*/ ("v-toolbar-title");
 //BA.debugLineNum = 882;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 883;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _vtooltip(String _elid) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 610;BA.debugLine="Sub VTooltip(elID As String) As VMElement";
 //BA.debugLineNum = 611;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 612;BA.debugLine="elx.Initialize(vue, elID)";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid);
 //BA.debugLineNum = 613;BA.debugLine="elx.SetTag(\"v-tooltip\")";
_elx._settag /*b4j.example.vmelement*/ ("v-tooltip");
 //BA.debugLineNum = 614;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 615;BA.debugLine="End Sub";
return null;
}
public String  _yearnow() throws Exception{
 //BA.debugLineNum = 1657;BA.debugLine="Public Sub YearNow() As String";
 //BA.debugLineNum = 1658;BA.debugLine="Return vue.YearNow";
if (true) return _vue._yearnow /*String*/ ();
 //BA.debugLineNum = 1659;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "READFILE"))
	return _readfile((Object) args[0], (String) args[1]);
return BA.SubDelegator.SubNotFound;
}
}
