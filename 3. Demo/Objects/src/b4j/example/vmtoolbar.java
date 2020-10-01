package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtoolbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtoolbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtoolbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _toolbar = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public boolean _hascontent = false;
public b4j.example.vmelement _endsection = null;
public Object _module = null;
public anywheresoftware.b4a.objects.collections.List _objects = null;
public b4j.example.vmelement _title = null;
public b4j.example.vmelement _hamburger = null;
public boolean _designmode = false;
public b4j.example.vmimage _logo = null;
public b4j.example.vmtemplate _extension = null;
public b4j.example.vmtabs _tabs = null;
public int _compx = 0;
public boolean _bstatic = false;
public String _ttitle = "";
public b4j.example.vmelement _righthamburger = null;
public int _spancnt = 0;
public String _titlevmodel = "";
public b4j.example.vmprogresslinear _progress = null;
public b4j.example.vmlabel _subheading = null;
public String _subheadingkey = "";
public com.ab.banano.BANano _banano = null;
public String _smodel = "";
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
public b4j.example.vmtoolbar  _addavatar(b4j.example.vmavatar _btn) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub AddAvatar(btn As VMAvatar) As VMToolBar";
 //BA.debugLineNum = 243;BA.debugLine="AddComponent(btn.ID, btn.ToString)";
_addcomponent(_btn._id /*String*/ ,_btn._tostring /*String*/ ());
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addbutton(b4j.example.vmbutton _btn) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub AddButton(btn As VMButton) As VMToolBar";
 //BA.debugLineNum = 238;BA.debugLine="AddComponent(btn.ID, btn.ToString)";
_addcomponent(_btn._id /*String*/ ,_btn._tostring /*String*/ ());
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addbutton1(String _key,String _iconname,String _text,String _tooltip,String _badge) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 1083;BA.debugLine="Sub AddButton1(key As String, iconName As String,";
 //BA.debugLineNum = 1084;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 1085;BA.debugLine="btn.Initialize(vue, key, module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_key,_module);
 //BA.debugLineNum = 1086;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 1087;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 1088;BA.debugLine="btn.SetToolTip(toolTip).AddIcon(iconName,\"left\",\"";
_btn._settooltip /*b4j.example.vmbutton*/ (_tooltip)._addicon /*b4j.example.vmbutton*/ (_iconname,"left","")._setlabel /*b4j.example.vmbutton*/ (_text);
 //BA.debugLineNum = 1089;BA.debugLine="btn.SetTransparent(True)";
_btn._settransparent /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 1090;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
 //BA.debugLineNum = 1091;BA.debugLine="btn.SetHasBadge(True)";
_btn._sethasbadge /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 1092;BA.debugLine="btn.SetBadge(badge)";
_btn._setbadge /*b4j.example.vmbutton*/ (_badge);
 };
 //BA.debugLineNum = 1094;BA.debugLine="AddComponent(btn.ID, btn.ToString)";
_addcomponent(_btn._id /*String*/ ,_btn._tostring /*String*/ ());
 //BA.debugLineNum = 1095;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1096;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 1132;BA.debugLine="Sub AddChild(child As VMElement) As VMToolBar";
 //BA.debugLineNum = 1133;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 1134;BA.debugLine="AddComponent(child.ID, childHTML)";
_addcomponent(_child._id /*String*/ ,_childhtml);
 //BA.debugLineNum = 1135;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1136;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 1145;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 1146;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 1147;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 1149;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub AddClass(c As String) As VMToolBar";
 //BA.debugLineNum = 305;BA.debugLine="ToolBar.AddClass(c)";
_toolbar._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addcomponent(String _key,String _comp) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub AddComponent(key As String, comp As String) As";
 //BA.debugLineNum = 231;BA.debugLine="ToolBar.SetText(comp)";
_toolbar._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 232;BA.debugLine="objects.Add(key)";
_objects.Add((Object)(_key));
 //BA.debugLineNum = 233;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _adddivider(boolean _bvertical,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
String _skey = "";
b4j.example.vmdivider _d = null;
 //BA.debugLineNum = 174;BA.debugLine="Sub AddDivider(bVertical As Boolean, mprops As Map";
 //BA.debugLineNum = 175;BA.debugLine="compx = compx + 1";
_compx = (int) (_compx+1);
 //BA.debugLineNum = 176;BA.debugLine="Dim skey As String = $\"item${compx}\"$";
_skey = ("item"+__c.SmartStringFormatter("",(Object)(_compx))+"");
 //BA.debugLineNum = 177;BA.debugLine="Dim d As VMDivider";
_d = new b4j.example.vmdivider();
 //BA.debugLineNum = 178;BA.debugLine="d.Initialize(vue).SetDesignMode(DesignMode)";
_d._initialize /*b4j.example.vmdivider*/ (ba,_vue)._setdesignmode /*b4j.example.vmdivider*/ (_designmode);
 //BA.debugLineNum = 179;BA.debugLine="If bVertical Then d.SetVertical";
if (_bvertical) { 
_d._setvertical /*b4j.example.vmdivider*/ ();};
 //BA.debugLineNum = 180;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, loose)";
_d._buildmodel /*b4j.example.vmdivider*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 181;BA.debugLine="AddComponent(skey, d.ToString)";
_addcomponent(_skey,_d._tostring /*String*/ ());
 //BA.debugLineNum = 182;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _adddivider1() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub AddDivider1 As VMToolBar";
 //BA.debugLineNum = 79;BA.debugLine="AddDivider(True, Null, Null, Array(\"mx-2\"), Null)";
_adddivider(__c.True,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__c.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__c.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("mx-2")}),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addfab(b4j.example.vmbutton _btn) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub AddFAB(btn As VMButton) As VMToolBar";
 //BA.debugLineNum = 255;BA.debugLine="Extension.SetText(btn.ToString)";
_extension._settext /*b4j.example.vmtemplate*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 256;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addhamburger() throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub AddHamburger As VMToolBar";
 //BA.debugLineNum = 148;BA.debugLine="Hamburger.SetVisible(True)";
_hamburger._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 149;BA.debugLine="AddComponent(Hamburger.ID, Hamburger.ToString)";
_addcomponent(_hamburger._id /*String*/ ,_hamburger._tostring /*String*/ ());
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addicon(String _key,String _iconname,String _tooltip,String _badge) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 373;BA.debugLine="Sub AddIcon(key As String, iconName As String, too";
 //BA.debugLineNum = 374;BA.debugLine="key = key.tolowercase";
_key = _key.toLowerCase();
 //BA.debugLineNum = 375;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 376;BA.debugLine="btn.Initialize(vue, key, module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_key,_module);
 //BA.debugLineNum = 377;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 378;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 379;BA.debugLine="btn.SetIconButton(iconName).SetTooltip(toolTip)";
_btn._seticonbutton /*b4j.example.vmbutton*/ (_iconname)._settooltip /*b4j.example.vmbutton*/ (_tooltip);
 //BA.debugLineNum = 380;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
 //BA.debugLineNum = 381;BA.debugLine="btn.SetHasBadge(True)";
_btn._sethasbadge /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 382;BA.debugLine="btn.SetBadge(badge)";
_btn._setbadge /*b4j.example.vmbutton*/ (_badge);
 };
 //BA.debugLineNum = 384;BA.debugLine="AddComponent(btn.ID, btn.ToString)";
_addcomponent(_btn._id /*String*/ ,_btn._tostring /*String*/ ());
 //BA.debugLineNum = 385;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addicon1(String _key,String _iconname,String _iconcolor,String _tooltip,String _badge) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 388;BA.debugLine="Sub AddIcon1(key As String, iconName As String, ic";
 //BA.debugLineNum = 389;BA.debugLine="key = key.tolowercase";
_key = _key.toLowerCase();
 //BA.debugLineNum = 390;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 391;BA.debugLine="btn.Initialize(vue, key, module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_key,_module);
 //BA.debugLineNum = 392;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 393;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 394;BA.debugLine="btn.SetColor(iconColor)";
_btn._setcolor /*b4j.example.vmbutton*/ (_iconcolor);
 //BA.debugLineNum = 395;BA.debugLine="btn.SetIconButton(iconName).SetTooltip(toolTip)";
_btn._seticonbutton /*b4j.example.vmbutton*/ (_iconname)._settooltip /*b4j.example.vmbutton*/ (_tooltip);
 //BA.debugLineNum = 396;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
 //BA.debugLineNum = 397;BA.debugLine="btn.SetHasBadge(True)";
_btn._sethasbadge /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 398;BA.debugLine="btn.SetBadge(badge)";
_btn._setbadge /*b4j.example.vmbutton*/ (_badge);
 };
 //BA.debugLineNum = 400;BA.debugLine="AddComponent(btn.ID, btn.ToString)";
_addcomponent(_btn._id /*String*/ ,_btn._tostring /*String*/ ());
 //BA.debugLineNum = 401;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _additem(String _key,String _iconname,String _color,String _text,String _tooltip,String _badge) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 1098;BA.debugLine="Sub AddItem(key As String, iconName As String, col";
 //BA.debugLineNum = 1099;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 1100;BA.debugLine="btn.Initialize(vue, key, module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_key,_module);
 //BA.debugLineNum = 1101;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 1102;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 1103;BA.debugLine="btn.SetColor(color)";
_btn._setcolor /*b4j.example.vmbutton*/ (_color);
 //BA.debugLineNum = 1104;BA.debugLine="btn.SetTransparent(True)";
_btn._settransparent /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 1105;BA.debugLine="btn.SetToolTip(toolTip).AddIcon(iconName,\"left\",\"";
_btn._settooltip /*b4j.example.vmbutton*/ (_tooltip)._addicon /*b4j.example.vmbutton*/ (_iconname,"left","")._setlabel /*b4j.example.vmbutton*/ (_text);
 //BA.debugLineNum = 1106;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
 //BA.debugLineNum = 1107;BA.debugLine="btn.SetHasBadge(True)";
_btn._sethasbadge /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 1108;BA.debugLine="btn.SetBadge(badge)";
_btn._setbadge /*b4j.example.vmbutton*/ (_badge);
 };
 //BA.debugLineNum = 1110;BA.debugLine="AddComponent(btn.ID, btn.ToString)";
_addcomponent(_btn._id /*String*/ ,_btn._tostring /*String*/ ());
 //BA.debugLineNum = 1111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addlogo(String _url) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="public Sub AddLogo(url As String) As VMToolBar";
 //BA.debugLineNum = 290;BA.debugLine="Logo.SetVisible(True)";
_logo._setvisible /*b4j.example.vmimage*/ (__c.True);
 //BA.debugLineNum = 291;BA.debugLine="Logo.SetVModel(\"logo\", url).Pop(ToolBar)";
_logo._setvmodel /*b4j.example.vmimage*/ ("logo",_url)._pop /*String*/ (_toolbar);
 //BA.debugLineNum = 292;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addmenu(b4j.example.vmmenu _menu) throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Sub AddMenu(menu As VMMenu) As VMToolBar";
 //BA.debugLineNum = 362;BA.debugLine="AddComponent(menu.ID, menu.ToString)";
_addcomponent(_menu._id /*String*/ ,_menu._tostring /*String*/ ());
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addrighthamburger() throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub AddRightHamburger As VMToolBar";
 //BA.debugLineNum = 155;BA.debugLine="RightHamburger.SetVisible(True)";
_righthamburger._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 156;BA.debugLine="AddComponent(RightHamburger.ID, RightHamburger.To";
_addcomponent(_righthamburger._id /*String*/ ,_righthamburger._tostring /*String*/ ());
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addsearch(String _key) throws Exception{
b4j.example.vmtextfield _txt = null;
 //BA.debugLineNum = 347;BA.debugLine="Sub AddSearch(key As String) As VMToolBar";
 //BA.debugLineNum = 348;BA.debugLine="Dim txt As VMTextField";
_txt = new b4j.example.vmtextfield();
 //BA.debugLineNum = 349;BA.debugLine="txt.Initialize(vue, key, module)";
_txt._initialize /*b4j.example.vmtextfield*/ (ba,_vue,_key,_module);
 //BA.debugLineNum = 350;BA.debugLine="txt.SetStatic(bStatic)";
_txt._setstatic /*b4j.example.vmtextfield*/ (_bstatic);
 //BA.debugLineNum = 351;BA.debugLine="txt.SetDesignMode(DesignMode)";
_txt._setdesignmode /*b4j.example.vmtextfield*/ (_designmode);
 //BA.debugLineNum = 352;BA.debugLine="txt.AddClass(\"mx-4\").SetAttributes(Array(\"flat\",";
_txt._addclass /*b4j.example.vmtextfield*/ ("mx-4")._setattributes /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("flat"),(Object)("hide-details"),(Object)("single-line")}));
 //BA.debugLineNum = 353;BA.debugLine="txt.SetLabel(\"Search\").SetPrependInnerIcon(\"searc";
_txt._setlabel /*b4j.example.vmtextfield*/ ("Search")._setprependinnericon /*b4j.example.vmtextfield*/ ("search")._addclass /*b4j.example.vmtextfield*/ ("hidden-sm-and-down")._setclearable /*b4j.example.vmtextfield*/ (__c.True)._setvmodel /*b4j.example.vmtextfield*/ (_key);
 //BA.debugLineNum = 354;BA.debugLine="txt.SetOnChange(module, $\"${key}_change\"$)";
_txt._setonchange /*b4j.example.vmtextfield*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_key))+"_change"));
 //BA.debugLineNum = 355;BA.debugLine="ToolBar.SetText(txt.ToString)";
_toolbar._settext /*b4j.example.vmelement*/ (_txt._tostring /*String*/ ());
 //BA.debugLineNum = 356;BA.debugLine="objects.Add(key)";
_objects.Add((Object)(_key));
 //BA.debugLineNum = 357;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 358;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addspacer() throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Sub AddSpacer As VMToolBar";
 //BA.debugLineNum = 318;BA.debugLine="ToolBar.AddSpacer";
_toolbar._addspacer /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 319;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addspan(String _spantext) throws Exception{
String _elid = "";
b4j.example.vmelement _span = null;
 //BA.debugLineNum = 88;BA.debugLine="Sub AddSpan(spanText As String) As VMToolBar";
 //BA.debugLineNum = 89;BA.debugLine="spanCnt = spanCnt + 1";
_spancnt = (int) (_spancnt+1);
 //BA.debugLineNum = 90;BA.debugLine="Dim elID As String = \"span\" & spanCnt";
_elid = "span"+BA.NumberToString(_spancnt);
 //BA.debugLineNum = 91;BA.debugLine="Dim span As VMElement";
_span = new b4j.example.vmelement();
 //BA.debugLineNum = 92;BA.debugLine="span.Initialize(vue, elID).SetTag(\"span\").SetText";
_span._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid)._settag /*b4j.example.vmelement*/ ("span")._settext /*b4j.example.vmelement*/ (_spantext);
 //BA.debugLineNum = 93;BA.debugLine="AddComponent(elID, span.ToString)";
_addcomponent(_elid,_span._tostring /*String*/ ());
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addsubheading(String _stext,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
String _skey = "";
b4j.example.vmlabel _d = null;
 //BA.debugLineNum = 203;BA.debugLine="Sub AddSubHeading(sText As String, mprops As Map,";
 //BA.debugLineNum = 204;BA.debugLine="Dim skey As String = $\"${ID}subheading\"$";
_skey = (""+__c.SmartStringFormatter("",(Object)(_id))+"subheading");
 //BA.debugLineNum = 205;BA.debugLine="Dim d As VMLabel";
_d = new b4j.example.vmlabel();
 //BA.debugLineNum = 206;BA.debugLine="d.Initialize(vue, skey)";
_d._initialize /*b4j.example.vmlabel*/ (ba,_vue,_skey);
 //BA.debugLineNum = 207;BA.debugLine="d.SetStatic(bStatic)";
_d._setstatic /*b4j.example.vmlabel*/ (_bstatic);
 //BA.debugLineNum = 208;BA.debugLine="d.SetDesignMode(DesignMode)";
_d._setdesignmode /*b4j.example.vmlabel*/ (_designmode);
 //BA.debugLineNum = 209;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 210;BA.debugLine="d.SetSpan.SetText(sText)";
_d._setspan /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ (_stext);
 }else {
 //BA.debugLineNum = 212;BA.debugLine="d.SetSpan.SetText($\"{{ ${skey} }}\"$)";
_d._setspan /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_skey))+" }}"));
 };
 //BA.debugLineNum = 214;BA.debugLine="d.AddClass(\"subheading\").AddClass(\"mx-2\")";
_d._addclass /*b4j.example.vmlabel*/ ("subheading")._addclass /*b4j.example.vmlabel*/ ("mx-2");
 //BA.debugLineNum = 215;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, loose)";
_d._buildmodel /*b4j.example.vmlabel*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 216;BA.debugLine="AddComponent(skey, d.ToString)";
_addcomponent(_skey,_d._tostring /*String*/ ());
 //BA.debugLineNum = 217;BA.debugLine="vue.SetData(skey, sText)";
_vue._setdata /*b4j.example.bananovue*/ (_skey,(Object)(_stext));
 //BA.debugLineNum = 218;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addsubheading1(String _stext) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub AddSubHeading1(sText As String) As VMToolBar";
 //BA.debugLineNum = 188;BA.debugLine="SubHeading.SetStatic(bStatic)";
_subheading._setstatic /*b4j.example.vmlabel*/ (_bstatic);
 //BA.debugLineNum = 189;BA.debugLine="SubHeading.SetDesignMode(DesignMode)";
_subheading._setdesignmode /*b4j.example.vmlabel*/ (_designmode);
 //BA.debugLineNum = 190;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 191;BA.debugLine="SubHeading.SetSpan.SetText(sText)";
_subheading._setspan /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ (_stext);
 }else {
 //BA.debugLineNum = 193;BA.debugLine="SubHeading.SetSpan.SetText($\"{{ ${SubHeadingKey}";
_subheading._setspan /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_subheadingkey))+" }}"));
 };
 //BA.debugLineNum = 195;BA.debugLine="SubHeading.AddClass(\"subheading\").AddClass(\"mx-2\"";
_subheading._addclass /*b4j.example.vmlabel*/ ("subheading")._addclass /*b4j.example.vmlabel*/ ("mx-2");
 //BA.debugLineNum = 196;BA.debugLine="AddComponent(SubHeadingKey, SubHeading.ToString)";
_addcomponent(_subheadingkey,_subheading._tostring /*String*/ ());
 //BA.debugLineNum = 197;BA.debugLine="vue.SetData(SubHeadingKey, sText)";
_vue._setdata /*b4j.example.bananovue*/ (_subheadingkey,(Object)(_stext));
 //BA.debugLineNum = 198;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addswitch(String _sid,String _vmodel,String _vlabel) throws Exception{
b4j.example.vmcheckbox _el = null;
 //BA.debugLineNum = 323;BA.debugLine="Sub AddSwitch(sid As String, vmodel As String, vla";
 //BA.debugLineNum = 324;BA.debugLine="sid = sid.tolowercase";
_sid = _sid.toLowerCase();
 //BA.debugLineNum = 325;BA.debugLine="Dim el As VMCheckBox";
_el = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 326;BA.debugLine="el.Initialize(vue, sid, module)";
_el._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,_sid,_module);
 //BA.debugLineNum = 327;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmcheckbox*/ (_bstatic);
 //BA.debugLineNum = 328;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmcheckbox*/ (_designmode);
 //BA.debugLineNum = 329;BA.debugLine="el.SetSwitch";
_el._setswitch /*b4j.example.vmcheckbox*/ ();
 //BA.debugLineNum = 330;BA.debugLine="el.SetInset(True)";
_el._setinset /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 331;BA.debugLine="el.SetFalseValue(\"No\")";
_el._setfalsevalue /*b4j.example.vmcheckbox*/ ("No");
 //BA.debugLineNum = 332;BA.debugLine="el.SetTrueValue(\"Yes\")";
_el._settruevalue /*b4j.example.vmcheckbox*/ ("Yes");
 //BA.debugLineNum = 333;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmcheckbox*/ (_vmodel);
 //BA.debugLineNum = 334;BA.debugLine="el.Setlabel(vlabel)";
_el._setlabel /*b4j.example.vmcheckbox*/ (_vlabel);
 //BA.debugLineNum = 335;BA.debugLine="el.SetHideDetails(True)";
_el._sethidedetails /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 336;BA.debugLine="vue.SetData(vmodel, \"No\")";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)("No"));
 //BA.debugLineNum = 337;BA.debugLine="el.SetOnChange(module, $\"${sid}_change\"$)";
_el._setonchange /*b4j.example.vmcheckbox*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_sid))+"_change"));
 //BA.debugLineNum = 338;BA.debugLine="el.show";
_el._show /*b4j.example.vmcheckbox*/ ();
 //BA.debugLineNum = 339;BA.debugLine="el.AddClass(\"mx-2\")";
_el._addclass /*b4j.example.vmcheckbox*/ ("mx-2");
 //BA.debugLineNum = 340;BA.debugLine="ToolBar.SetText(el.ToString)";
_toolbar._settext /*b4j.example.vmelement*/ (_el._tostring /*String*/ ());
 //BA.debugLineNum = 341;BA.debugLine="objects.Add(sid)";
_objects.Add((Object)(_sid));
 //BA.debugLineNum = 342;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 343;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return null;
}
public String  _addtab(String _tabid,String _tablabel,String _tabicon,b4j.example.vmcontainer _tabcontent) throws Exception{
 //BA.debugLineNum = 527;BA.debugLine="Sub AddTab(tabID As String, tabLabel As String, ta";
 //BA.debugLineNum = 528;BA.debugLine="Tabs.AddTab(tabID, tabLabel, tabIcon, tabContent)";
_tabs._addtab /*String*/ (_tabid,_tablabel,_tabicon,_tabcontent);
 //BA.debugLineNum = 529;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _addtabs(b4j.example.vmtabs _vtabs) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub AddTabs(vTabs As VMTabs) As VMToolBar";
 //BA.debugLineNum = 261;BA.debugLine="Extension.SetText(vTabs.ToString)";
_extension._settext /*b4j.example.vmtemplate*/ (_vtabs._tostring /*String*/ ());
 //BA.debugLineNum = 262;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addtitle(String _tt,String _ttclass) throws Exception{
String _page_title = "";
 //BA.debugLineNum = 411;BA.debugLine="Sub AddTitle(tt As String, ttClass As String) As V";
 //BA.debugLineNum = 412;BA.debugLine="If ttClass <> \"\" Then Title.AddClass(ttClass)";
if ((_ttclass).equals("") == false) { 
_title._addclass /*b4j.example.vmelement*/ (_ttclass);};
 //BA.debugLineNum = 413;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 414;BA.debugLine="Title.SetText(tt)";
_title._settext /*b4j.example.vmelement*/ (_tt);
 }else {
 //BA.debugLineNum = 416;BA.debugLine="vue.SetStateSingle(tTitle, tt)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_ttitle,(Object)(_tt));
 //BA.debugLineNum = 417;BA.debugLine="Dim page_title As String = $\"{{ ${tTitle} }}\"$";
_page_title = ("{{ "+__c.SmartStringFormatter("",(Object)(_ttitle))+" }}");
 //BA.debugLineNum = 418;BA.debugLine="Title.SetText(page_title)";
_title._settext /*b4j.example.vmelement*/ (_page_title);
 };
 //BA.debugLineNum = 420;BA.debugLine="Title.SetVisible(True)";
_title._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 421;BA.debugLine="Title.Pop(ToolBar)";
_title._pop /*String*/ (_toolbar);
 //BA.debugLineNum = 422;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 423;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 424;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 1161;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 1162;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 1163;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 968;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 969;BA.debugLine="ToolBar.Bind(prop, stateprop)";
_toolbar._bind /*b4j.example.vmelement*/ (_prop,_stateprop);
 //BA.debugLineNum = 970;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 971;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 1030;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 1031;BA.debugLine="ToolBar.BuildModel(mprops, mstyles, lclasses, loo";
_toolbar._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 1032;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1033;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ToolBar As VMElement";
_toolbar = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 7;BA.debugLine="Public EndSection As VMElement";
_endsection = new b4j.example.vmelement();
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private objects As List";
_objects = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="Public Title As VMElement";
_title = new b4j.example.vmelement();
 //BA.debugLineNum = 11;BA.debugLine="Public Hamburger As VMElement";
_hamburger = new b4j.example.vmelement();
 //BA.debugLineNum = 12;BA.debugLine="Private DesignMode As Boolean";
_designmode = false;
 //BA.debugLineNum = 13;BA.debugLine="Public Logo As VMImage";
_logo = new b4j.example.vmimage();
 //BA.debugLineNum = 14;BA.debugLine="Private Extension As VMTemplate";
_extension = new b4j.example.vmtemplate();
 //BA.debugLineNum = 15;BA.debugLine="Public Tabs As VMTabs";
_tabs = new b4j.example.vmtabs();
 //BA.debugLineNum = 16;BA.debugLine="Private compx As Int";
_compx = 0;
 //BA.debugLineNum = 17;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 18;BA.debugLine="Private tTitle As String";
_ttitle = "";
 //BA.debugLineNum = 19;BA.debugLine="Public RightHamburger As VMElement";
_righthamburger = new b4j.example.vmelement();
 //BA.debugLineNum = 20;BA.debugLine="Private spanCnt As Int";
_spancnt = 0;
 //BA.debugLineNum = 21;BA.debugLine="Public TitleVModel As String";
_titlevmodel = "";
 //BA.debugLineNum = 22;BA.debugLine="Public Progress As VMProgressLinear";
_progress = new b4j.example.vmprogresslinear();
 //BA.debugLineNum = 23;BA.debugLine="Public SubHeading As VMLabel";
_subheading = new b4j.example.vmlabel();
 //BA.debugLineNum = 24;BA.debugLine="Private SubHeadingKey As String";
_subheadingkey = "";
 //BA.debugLineNum = 25;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 26;BA.debugLine="Private smodel As String";
_smodel = "";
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _disable() throws Exception{
 //BA.debugLineNum = 1156;BA.debugLine="Sub Disable As VMToolBar";
 //BA.debugLineNum = 1157;BA.debugLine="ToolBar.Disable(True)";
_toolbar._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1158;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1159;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _enable() throws Exception{
 //BA.debugLineNum = 1151;BA.debugLine="Sub Enable As VMToolBar";
 //BA.debugLineNum = 1152;BA.debugLine="ToolBar.Enable(True)";
_toolbar._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1154;BA.debugLine="End Sub";
return null;
}
public String  _hide() throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub Hide";
 //BA.debugLineNum = 310;BA.debugLine="vue.SetStateSingle(smodel, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_smodel,(Object)(__c.False));
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return "";
}
public String  _hideitems() throws Exception{
String _item = "";
 //BA.debugLineNum = 451;BA.debugLine="Sub HideItems";
 //BA.debugLineNum = 452;BA.debugLine="For Each item As String In objects";
{
final anywheresoftware.b4a.BA.IterableList group1 = _objects;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 453;BA.debugLine="ToolBar.HideItem(item)";
_toolbar._hideitem /*b4j.example.vmelement*/ (_item);
 }
};
 //BA.debugLineNum = 455;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 29;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 30;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 31;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 32;BA.debugLine="spanCnt = 0";
_spancnt = (int) (0);
 //BA.debugLineNum = 33;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 34;BA.debugLine="ToolBar.Initialize(vue, ID)";
_toolbar._initialize /*b4j.example.vmelement*/ (ba,_vue,_id);
 //BA.debugLineNum = 35;BA.debugLine="SetVShow(ToolBar.showkey)";
_setvshow(_toolbar._showkey /*String*/ );
 //BA.debugLineNum = 38;BA.debugLine="Hamburger.Initialize(vue, \"menu\").SetTag(\"v-app-b";
_hamburger._initialize /*b4j.example.vmelement*/ (ba,_vue,"menu")._settag /*b4j.example.vmelement*/ ("v-app-bar-nav-icon")._setonclickstop /*b4j.example.vmelement*/ (this,"menu_click");
 //BA.debugLineNum = 39;BA.debugLine="RightHamburger.Initialize(vue, \"rightmenu\").SetTa";
_righthamburger._initialize /*b4j.example.vmelement*/ (ba,_vue,"rightmenu")._settag /*b4j.example.vmelement*/ ("v-app-bar-nav-icon");
 //BA.debugLineNum = 40;BA.debugLine="RightHamburger.SetVisible(False)";
_righthamburger._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 41;BA.debugLine="objects.Initialize";
_objects.Initialize();
 //BA.debugLineNum = 42;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 43;BA.debugLine="Extension.Initialize(vue, $\"${ID}tmpl\"$, module).";
_extension._initialize /*b4j.example.vmtemplate*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tmpl"),_module)._setslotextension /*b4j.example.vmtemplate*/ ();
 //BA.debugLineNum = 44;BA.debugLine="Tabs.Initialize(vue, $\"${ID}tabls\"$, module)";
_tabs._initialize /*b4j.example.vmtabs*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tabls"),_module);
 //BA.debugLineNum = 45;BA.debugLine="Tabs.OnToolBar = True";
_tabs._ontoolbar /*boolean*/  = __c.True;
 //BA.debugLineNum = 47;BA.debugLine="tTitle = $\"${ID}title\"$";
_ttitle = (""+__c.SmartStringFormatter("",(Object)(_id))+"title");
 //BA.debugLineNum = 48;BA.debugLine="TitleVModel = tTitle";
_titlevmodel = _ttitle;
 //BA.debugLineNum = 49;BA.debugLine="Title.Initialize(vue, $\"${ID}title\"$).SetTag(\"v-t";
_title._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"title"))._settag /*b4j.example.vmelement*/ ("v-toolbar-title");
 //BA.debugLineNum = 50;BA.debugLine="Title.SetCursorPointer";
_title._setcursorpointer /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 52;BA.debugLine="Logo.Initialize(vue, $\"${ID}logo\"$, module).SetSi";
_logo._initialize /*b4j.example.vmimage*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"logo"),_module)._setsize /*b4j.example.vmimage*/ ("46","46")._addclass /*b4j.example.vmimage*/ ("mx-2")._addclass /*b4j.example.vmimage*/ ("my-1")._bindstylesingle /*b4j.example.vmimage*/ ("opacity","1");
 //BA.debugLineNum = 53;BA.debugLine="Logo.Image.SetCursorPointer";
_logo._image /*b4j.example.vmelement*/ ._setcursorpointer /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 55;BA.debugLine="compx = 0";
_compx = (int) (0);
 //BA.debugLineNum = 56;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 57;BA.debugLine="Progress.Initialize(vue, $\"${ID}progress\"$, Me)";
_progress._initialize /*b4j.example.vmprogresslinear*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"progress"),this);
 //BA.debugLineNum = 58;BA.debugLine="Progress.SetActive(False)";
_progress._setactive /*b4j.example.vmprogresslinear*/ (__c.False);
 //BA.debugLineNum = 59;BA.debugLine="Progress.SetBottom(True)";
_progress._setbottom /*b4j.example.vmprogresslinear*/ (__c.True);
 //BA.debugLineNum = 60;BA.debugLine="Progress.SetIndeterminate(False)";
_progress._setindeterminate /*b4j.example.vmprogresslinear*/ (__c.False);
 //BA.debugLineNum = 61;BA.debugLine="Progress.SetAbsolute(True)";
_progress._setabsolute /*b4j.example.vmprogresslinear*/ (__c.True);
 //BA.debugLineNum = 63;BA.debugLine="SubHeadingKey = $\"${ID}subheading\"$";
_subheadingkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"subheading");
 //BA.debugLineNum = 64;BA.debugLine="SubHeading.Initialize(vue, SubHeadingKey)";
_subheading._initialize /*b4j.example.vmlabel*/ (ba,_vue,_subheadingkey);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public String  _menu_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub menu_click(e As BANanoEvent)";
 //BA.debugLineNum = 108;BA.debugLine="vue.ToggleState(\"drawer\")";
_vue._togglestate /*b4j.example.bananovue*/ ("drawer");
 //BA.debugLineNum = 109;BA.debugLine="If SubExists(module, \"menu_click\") Then";
if (__c.SubExists(ba,_module,"menu_click")) { 
 //BA.debugLineNum = 110;BA.debugLine="BANano.CallSub(module, \"menu_click\", Null)";
_banano.CallSub(_module,"menu_click",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 };
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 440;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 441;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 442;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 974;BA.debugLine="public Sub RemoveAttr(sName As String) As VMToolBa";
 //BA.debugLineNum = 975;BA.debugLine="ToolBar.RemoveAttr(sName)";
_toolbar._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 976;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 977;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 1127;BA.debugLine="Sub Render";
 //BA.debugLineNum = 1128;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 1129;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _setabsolute(boolean _varabsolute) throws Exception{
String _pp = "";
 //BA.debugLineNum = 464;BA.debugLine="Sub SetAbsolute(varAbsolute As Boolean) As VMToolB";
 //BA.debugLineNum = 465;BA.debugLine="If varAbsolute = False Then Return Me";
if (_varabsolute==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 466;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 467;BA.debugLine="SetAttrSingle(\"absolute\", varAbsolute)";
_setattrsingle("absolute",BA.ObjectToString(_varabsolute));
 //BA.debugLineNum = 468;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 470;BA.debugLine="Dim pp As String = $\"${ID}Absolute\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Absolute");
 //BA.debugLineNum = 471;BA.debugLine="vue.SetStateSingle(pp, varAbsolute)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varabsolute));
 //BA.debugLineNum = 472;BA.debugLine="ToolBar.Bind(\":absolute\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":absolute",_pp);
 //BA.debugLineNum = 473;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 474;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setappbar(boolean _b) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetAppBar(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 128;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 129;BA.debugLine="ToolBar.SetAttrSingle(\"app\", True)";
_toolbar._setattrsingle /*b4j.example.vmelement*/ ("app",BA.ObjectToString(__c.True));
 //BA.debugLineNum = 130;BA.debugLine="ToolBar.SetTag(\"v-app-bar\")";
_toolbar._settag /*b4j.example.vmelement*/ ("v-app-bar");
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 367;BA.debugLine="Sub SetAttr(attr As Map) As VMToolBar";
 //BA.debugLineNum = 368;BA.debugLine="ToolBar.SetAttr(attr)";
_toolbar._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 369;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 271;BA.debugLine="Sub SetAttributes(attrs As List) As VMToolBar";
 //BA.debugLineNum = 272;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 273;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub SetAttrLoose(loose As String) As VMToolBar";
 //BA.debugLineNum = 267;BA.debugLine="ToolBar.SetAttrLoose(loose)";
_toolbar._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1024;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 1025;BA.debugLine="ToolBar.SetAttrSingle(prop, value)";
_toolbar._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 1026;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1027;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setbottom(boolean _varbottom) throws Exception{
String _pp = "";
 //BA.debugLineNum = 501;BA.debugLine="Sub SetBottom(varBottom As Boolean) As VMToolBar";
 //BA.debugLineNum = 502;BA.debugLine="If varBottom = False Then Return Me";
if (_varbottom==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 503;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 504;BA.debugLine="SetAttrSingle(\"bottom\", varBottom)";
_setattrsingle("bottom",BA.ObjectToString(_varbottom));
 //BA.debugLineNum = 505;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 507;BA.debugLine="Dim pp As String = $\"${ID}Bottom\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Bottom");
 //BA.debugLineNum = 508;BA.debugLine="vue.SetStateSingle(pp, varBottom)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbottom));
 //BA.debugLineNum = 509;BA.debugLine="ToolBar.Bind(\":bottom\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":bottom",_pp);
 //BA.debugLineNum = 510;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 511;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setclippedleft(boolean _varclippedleft) throws Exception{
String _pp = "";
 //BA.debugLineNum = 514;BA.debugLine="Sub SetClippedLeft(varClippedLeft As Boolean) As V";
 //BA.debugLineNum = 515;BA.debugLine="If varClippedLeft = False Then Return Me";
if (_varclippedleft==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 516;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 517;BA.debugLine="SetAttrSingle(\"clipped-left\", varClippedLeft)";
_setattrsingle("clipped-left",BA.ObjectToString(_varclippedleft));
 //BA.debugLineNum = 518;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 520;BA.debugLine="Dim pp As String = $\"${ID}ClippedLeft\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ClippedLeft");
 //BA.debugLineNum = 521;BA.debugLine="vue.SetStateSingle(pp, varClippedLeft)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varclippedleft));
 //BA.debugLineNum = 522;BA.debugLine="ToolBar.Bind(\":clipped-left\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":clipped-left",_pp);
 //BA.debugLineNum = 523;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 524;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setclippedright(boolean _varclippedright) throws Exception{
String _pp = "";
 //BA.debugLineNum = 533;BA.debugLine="Sub SetClippedRight(varClippedRight As Boolean) As";
 //BA.debugLineNum = 534;BA.debugLine="If varClippedRight = False Then Return Me";
if (_varclippedright==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 535;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 536;BA.debugLine="SetAttrSingle(\"clipped-right\", varClippedRight)";
_setattrsingle("clipped-right",BA.ObjectToString(_varclippedright));
 //BA.debugLineNum = 537;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 539;BA.debugLine="Dim pp As String = $\"${ID}ClippedRight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ClippedRight");
 //BA.debugLineNum = 540;BA.debugLine="vue.SetStateSingle(pp, varClippedRight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varclippedright));
 //BA.debugLineNum = 541;BA.debugLine="ToolBar.Bind(\":clipped-right\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":clipped-right",_pp);
 //BA.debugLineNum = 542;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 543;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setcollapse(boolean _varcollapse) throws Exception{
String _pp = "";
 //BA.debugLineNum = 546;BA.debugLine="Sub SetCollapse(varCollapse As Boolean) As VMToolB";
 //BA.debugLineNum = 547;BA.debugLine="If varCollapse = False Then Return Me";
if (_varcollapse==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 548;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 549;BA.debugLine="SetAttrSingle(\"collapse\", varCollapse)";
_setattrsingle("collapse",BA.ObjectToString(_varcollapse));
 //BA.debugLineNum = 550;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 552;BA.debugLine="Dim pp As String = $\"${ID}Collapse\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Collapse");
 //BA.debugLineNum = 553;BA.debugLine="vue.SetStateSingle(pp, varCollapse)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcollapse));
 //BA.debugLineNum = 554;BA.debugLine="ToolBar.Bind(\":collapse\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":collapse",_pp);
 //BA.debugLineNum = 555;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 556;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setcollapseonscroll(boolean _varcollapseonscroll) throws Exception{
String _pp = "";
 //BA.debugLineNum = 559;BA.debugLine="Sub SetCollapseOnScroll(varCollapseOnScroll As Boo";
 //BA.debugLineNum = 560;BA.debugLine="If varCollapseOnScroll = False Then Return Me";
if (_varcollapseonscroll==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 561;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 562;BA.debugLine="SetAttrSingle(\"collapse-on-scroll\", varCollapseO";
_setattrsingle("collapse-on-scroll",BA.ObjectToString(_varcollapseonscroll));
 //BA.debugLineNum = 563;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 565;BA.debugLine="Dim pp As String = $\"${ID}CollapseOnScroll\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CollapseOnScroll");
 //BA.debugLineNum = 566;BA.debugLine="vue.SetStateSingle(pp, varCollapseOnScroll)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcollapseonscroll));
 //BA.debugLineNum = 567;BA.debugLine="ToolBar.Bind(\":collapse-on-scroll\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":collapse-on-scroll",_pp);
 //BA.debugLineNum = 568;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 569;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 572;BA.debugLine="Sub SetColor(varColor As String) As VMToolBar";
 //BA.debugLineNum = 573;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 574;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 575;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 576;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 578;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 579;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 580;BA.debugLine="ToolBar.Bind(\":color\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 581;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 582;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 161;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 162;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 163;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 164;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 165;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 168;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 169;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 170;BA.debugLine="ToolBar.Bind(\":color\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 585;BA.debugLine="Sub SetDark(varDark As Boolean) As VMToolBar";
 //BA.debugLineNum = 586;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 587;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 588;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 589;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 591;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 592;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 593;BA.debugLine="ToolBar.Bind(\":dark\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 594;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 595;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 71;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setdense(boolean _vardense) throws Exception{
String _pp = "";
 //BA.debugLineNum = 598;BA.debugLine="Sub SetDense(varDense As Boolean) As VMToolBar";
 //BA.debugLineNum = 599;BA.debugLine="If varDense = False Then Return Me";
if (_vardense==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 600;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 601;BA.debugLine="SetAttrSingle(\"dense\", varDense)";
_setattrsingle("dense",BA.ObjectToString(_vardense));
 //BA.debugLineNum = 602;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 604;BA.debugLine="Dim pp As String = $\"${ID}Dense\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dense");
 //BA.debugLineNum = 605;BA.debugLine="vue.SetStateSingle(pp, varDense)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardense));
 //BA.debugLineNum = 606;BA.debugLine="ToolBar.Bind(\":dense\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":dense",_pp);
 //BA.debugLineNum = 607;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 608;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 990;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 991;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 992;BA.debugLine="ToolBar.SetDesignMode(b)";
_toolbar._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 993;BA.debugLine="Hamburger.SetDesignMode(b)";
_hamburger._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 994;BA.debugLine="Extension.SetDesignMode(b)";
_extension._setdesignmode /*b4j.example.vmtemplate*/ (_b);
 //BA.debugLineNum = 995;BA.debugLine="Tabs.SetDesignMode(b)";
_tabs._setdesignmode /*b4j.example.vmtabs*/ (_b);
 //BA.debugLineNum = 996;BA.debugLine="Logo.SetDesignMode(b)";
_logo._setdesignmode /*b4j.example.vmimage*/ (_b);
 //BA.debugLineNum = 997;BA.debugLine="Title.SetDesignMode(b)";
_title._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 998;BA.debugLine="Progress.SetDesignMode(b)";
_progress._setdesignmode /*b4j.example.vmprogresslinear*/ (_b);
 //BA.debugLineNum = 999;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1000;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 1065;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 1066;BA.debugLine="ToolBar.SetDeviceOffsets(OS, OM, OL, OX)";
_toolbar._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 1067;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1068;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 1077;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 1078;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 1079;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 1080;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1081;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 1071;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 1072;BA.debugLine="ToolBar.SetDeviceSizes(SS, SM, SL, SX)";
_toolbar._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 1073;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1074;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 1013;BA.debugLine="Sub SetDisabled(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 1014;BA.debugLine="ToolBar.SetDisabled(b)";
_toolbar._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 1015;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1016;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setelevateonscroll(boolean _varelevateonscroll) throws Exception{
String _pp = "";
 //BA.debugLineNum = 611;BA.debugLine="Sub SetElevateOnScroll(varElevateOnScroll As Boole";
 //BA.debugLineNum = 612;BA.debugLine="If varElevateOnScroll = False Then Return Me";
if (_varelevateonscroll==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 613;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 614;BA.debugLine="SetAttrSingle(\"elevate-on-scroll\", varElevateOnS";
_setattrsingle("elevate-on-scroll",BA.ObjectToString(_varelevateonscroll));
 //BA.debugLineNum = 615;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 617;BA.debugLine="Dim pp As String = $\"${ID}ElevateOnScroll\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ElevateOnScroll");
 //BA.debugLineNum = 618;BA.debugLine="vue.SetStateSingle(pp, varElevateOnScroll)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varelevateonscroll));
 //BA.debugLineNum = 619;BA.debugLine="ToolBar.Bind(\":elevate-on-scroll\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":elevate-on-scroll",_pp);
 //BA.debugLineNum = 620;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 621;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setelevation(String _varelevation) throws Exception{
String _pp = "";
 //BA.debugLineNum = 624;BA.debugLine="Sub SetElevation(varElevation As String) As VMTool";
 //BA.debugLineNum = 625;BA.debugLine="If varElevation = \"\" Then Return Me";
if ((_varelevation).equals("")) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 626;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 627;BA.debugLine="SetAttrSingle(\"elevation\", varElevation)";
_setattrsingle("elevation",_varelevation);
 //BA.debugLineNum = 628;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 630;BA.debugLine="Dim pp As String = $\"${ID}Elevation\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Elevation");
 //BA.debugLineNum = 631;BA.debugLine="vue.SetStateSingle(pp, varElevation)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varelevation));
 //BA.debugLineNum = 632;BA.debugLine="ToolBar.Bind(\":elevation\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":elevation",_pp);
 //BA.debugLineNum = 633;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 634;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setextended(boolean _varextended) throws Exception{
String _pp = "";
 //BA.debugLineNum = 637;BA.debugLine="Sub SetExtended(varExtended As Boolean) As VMToolB";
 //BA.debugLineNum = 638;BA.debugLine="If varExtended = False Then Return Me";
if (_varextended==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 639;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 640;BA.debugLine="SetAttrSingle(\"extended\", varExtended)";
_setattrsingle("extended",BA.ObjectToString(_varextended));
 //BA.debugLineNum = 641;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 643;BA.debugLine="Dim pp As String = $\"${ID}Extended\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Extended");
 //BA.debugLineNum = 644;BA.debugLine="vue.SetStateSingle(pp, varExtended)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varextended));
 //BA.debugLineNum = 645;BA.debugLine="ToolBar.Bind(\":extended\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":extended",_pp);
 //BA.debugLineNum = 646;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 647;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setextensionheight(String _varextensionheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 650;BA.debugLine="Sub SetExtensionHeight(varExtensionHeight As Strin";
 //BA.debugLineNum = 651;BA.debugLine="If varExtensionHeight = \"\" Then Return Me";
if ((_varextensionheight).equals("")) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 652;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 653;BA.debugLine="SetAttrSingle(\"extension-height\", varExtensionHe";
_setattrsingle("extension-height",_varextensionheight);
 //BA.debugLineNum = 654;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 656;BA.debugLine="Dim pp As String = $\"${ID}ExtensionHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ExtensionHeight");
 //BA.debugLineNum = 657;BA.debugLine="vue.SetStateSingle(pp, varExtensionHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varextensionheight));
 //BA.debugLineNum = 658;BA.debugLine="ToolBar.Bind(\":extension-height\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":extension-height",_pp);
 //BA.debugLineNum = 659;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 660;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setfadeimgonscroll(boolean _varfadeimgonscroll) throws Exception{
String _pp = "";
 //BA.debugLineNum = 663;BA.debugLine="Sub SetFadeImgOnScroll(varFadeImgOnScroll As Boole";
 //BA.debugLineNum = 664;BA.debugLine="If varFadeImgOnScroll = False Then Return Me";
if (_varfadeimgonscroll==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 665;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 666;BA.debugLine="SetAttrSingle(\"fade-img-on-scroll\", varFadeImgOn";
_setattrsingle("fade-img-on-scroll",BA.ObjectToString(_varfadeimgonscroll));
 //BA.debugLineNum = 667;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 669;BA.debugLine="Dim pp As String = $\"${ID}FadeImgOnScroll\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"FadeImgOnScroll");
 //BA.debugLineNum = 670;BA.debugLine="vue.SetStateSingle(pp, varFadeImgOnScroll)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfadeimgonscroll));
 //BA.debugLineNum = 671;BA.debugLine="ToolBar.Bind(\":fade-img-on-scroll\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":fade-img-on-scroll",_pp);
 //BA.debugLineNum = 672;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 673;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setfixed(boolean _varfixed) throws Exception{
String _pp = "";
 //BA.debugLineNum = 676;BA.debugLine="Sub SetFixed(varFixed As Boolean) As VMToolBar";
 //BA.debugLineNum = 677;BA.debugLine="If varFixed = False Then Return Me";
if (_varfixed==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 678;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 679;BA.debugLine="SetAttrSingle(\"fixed\", varFixed)";
_setattrsingle("fixed",BA.ObjectToString(_varfixed));
 //BA.debugLineNum = 680;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 682;BA.debugLine="Dim pp As String = $\"${ID}Fixed\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Fixed");
 //BA.debugLineNum = 683;BA.debugLine="vue.SetStateSingle(pp, varFixed)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfixed));
 //BA.debugLineNum = 684;BA.debugLine="ToolBar.Bind(\":fixed\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":fixed",_pp);
 //BA.debugLineNum = 685;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 686;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setflat(boolean _varflat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 689;BA.debugLine="Sub SetFlat(varFlat As Boolean) As VMToolBar";
 //BA.debugLineNum = 690;BA.debugLine="If varFlat = False Then Return Me";
if (_varflat==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 691;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 692;BA.debugLine="SetAttrSingle(\"flat\", varFlat)";
_setattrsingle("flat",BA.ObjectToString(_varflat));
 //BA.debugLineNum = 693;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 695;BA.debugLine="Dim pp As String = $\"${ID}Flat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Flat");
 //BA.debugLineNum = 696;BA.debugLine="vue.SetStateSingle(pp, varFlat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varflat));
 //BA.debugLineNum = 697;BA.debugLine="ToolBar.Bind(\":flat\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":flat",_pp);
 //BA.debugLineNum = 698;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setfloating(boolean _varfloating) throws Exception{
String _pp = "";
 //BA.debugLineNum = 702;BA.debugLine="Sub SetFloating(varFloating As Boolean) As VMToolB";
 //BA.debugLineNum = 703;BA.debugLine="If varFloating = False Then Return Me";
if (_varfloating==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 704;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 705;BA.debugLine="SetAttrSingle(\"floating\", varFloating)";
_setattrsingle("floating",BA.ObjectToString(_varfloating));
 //BA.debugLineNum = 706;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 708;BA.debugLine="Dim pp As String = $\"${ID}Floating\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Floating");
 //BA.debugLineNum = 709;BA.debugLine="vue.SetStateSingle(pp, varFloating)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfloating));
 //BA.debugLineNum = 710;BA.debugLine="ToolBar.Bind(\":floating\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":floating",_pp);
 //BA.debugLineNum = 711;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 712;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _sethasmenubutton(boolean _b) throws Exception{
 //BA.debugLineNum = 433;BA.debugLine="Sub SetHasMenuButton(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 434;BA.debugLine="vue.SetStateSingle(\"menushow\", b)";
_vue._setstatesingle /*b4j.example.bananovue*/ ("menushow",(Object)(_b));
 //BA.debugLineNum = 435;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 436;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 715;BA.debugLine="Sub SetHeight(varHeight As String) As VMToolBar";
 //BA.debugLineNum = 716;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 717;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 718;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 719;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 721;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 722;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 723;BA.debugLine="ToolBar.Bind(\":height\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 724;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 725;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _sethideonscroll(boolean _varhideonscroll) throws Exception{
String _pp = "";
 //BA.debugLineNum = 728;BA.debugLine="Sub SetHideOnScroll(varHideOnScroll As Boolean) As";
 //BA.debugLineNum = 729;BA.debugLine="If varHideOnScroll = False Then Return Me";
if (_varhideonscroll==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 730;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 731;BA.debugLine="SetAttrSingle(\"hide-on-scroll\", varHideOnScroll)";
_setattrsingle("hide-on-scroll",BA.ObjectToString(_varhideonscroll));
 //BA.debugLineNum = 732;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 734;BA.debugLine="Dim pp As String = $\"${ID}HideOnScroll\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideOnScroll");
 //BA.debugLineNum = 735;BA.debugLine="vue.SetStateSingle(pp, varHideOnScroll)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhideonscroll));
 //BA.debugLineNum = 736;BA.debugLine="ToolBar.Bind(\":hide-on-scroll\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":hide-on-scroll",_pp);
 //BA.debugLineNum = 737;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 738;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setinvertedscroll(boolean _varinvertedscroll) throws Exception{
String _pp = "";
 //BA.debugLineNum = 741;BA.debugLine="Sub SetInvertedScroll(varInvertedScroll As Boolean";
 //BA.debugLineNum = 742;BA.debugLine="If varInvertedScroll = False Then Return Me";
if (_varinvertedscroll==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 743;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 744;BA.debugLine="SetAttrSingle(\"inverted-scroll\", varInvertedScro";
_setattrsingle("inverted-scroll",BA.ObjectToString(_varinvertedscroll));
 //BA.debugLineNum = 745;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 747;BA.debugLine="Dim pp As String = $\"${ID}InvertedScroll\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"InvertedScroll");
 //BA.debugLineNum = 748;BA.debugLine="vue.SetStateSingle(pp, varInvertedScroll)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varinvertedscroll));
 //BA.debugLineNum = 749;BA.debugLine="ToolBar.Bind(\":inverted-scroll\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":inverted-scroll",_pp);
 //BA.debugLineNum = 750;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 751;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 754;BA.debugLine="Sub SetLight(varLight As Boolean) As VMToolBar";
 //BA.debugLineNum = 755;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 756;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 757;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 758;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 760;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 761;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 762;BA.debugLine="ToolBar.Bind(\":light\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 763;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 764;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setlightsout(boolean _varlightsout) throws Exception{
String _pp = "";
 //BA.debugLineNum = 476;BA.debugLine="Sub SetLightsOut(varLightsOut As Boolean) As VMToo";
 //BA.debugLineNum = 477;BA.debugLine="If varLightsOut = False Then Return Me";
if (_varlightsout==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 478;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 479;BA.debugLine="SetAttrSingle(\"lights-out\", varLightsOut)";
_setattrsingle("lights-out",BA.ObjectToString(_varlightsout));
 //BA.debugLineNum = 480;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 482;BA.debugLine="Dim pp As String = $\"${ID}LightsOut\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"LightsOut");
 //BA.debugLineNum = 483;BA.debugLine="vue.SetStateSingle(pp, varLightsOut)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlightsout));
 //BA.debugLineNum = 484;BA.debugLine="ToolBar.Bind(\":lights-out\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":lights-out",_pp);
 //BA.debugLineNum = 485;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 486;BA.debugLine="End Sub";
return null;
}
public String  _setloading(boolean _b) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetLoading(b As Boolean)";
 //BA.debugLineNum = 84;BA.debugLine="Progress.SetActive(b)";
_progress._setactive /*b4j.example.vmprogresslinear*/ (_b);
 //BA.debugLineNum = 85;BA.debugLine="Progress.SetIndeterminate(b)";
_progress._setindeterminate /*b4j.example.vmprogresslinear*/ (_b);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 985;BA.debugLine="Sub SetMarginAll(p As String) As VMToolBar";
 //BA.debugLineNum = 986;BA.debugLine="ToolBar.setmarginall(p)";
_toolbar._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 987;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 988;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmaxheight(String _varmaxheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 767;BA.debugLine="Sub SetMaxHeight(varMaxHeight As String) As VMTool";
 //BA.debugLineNum = 768;BA.debugLine="If varMaxHeight = \"\" Then Return Me";
if ((_varmaxheight).equals("")) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 769;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 770;BA.debugLine="SetAttrSingle(\"max-height\", varMaxHeight)";
_setattrsingle("max-height",_varmaxheight);
 //BA.debugLineNum = 771;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 773;BA.debugLine="Dim pp As String = $\"${ID}MaxHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxHeight");
 //BA.debugLineNum = 774;BA.debugLine="vue.SetStateSingle(pp, varMaxHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxheight));
 //BA.debugLineNum = 775;BA.debugLine="ToolBar.Bind(\":max-height\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":max-height",_pp);
 //BA.debugLineNum = 776;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 777;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmaxwidth(String _varmaxwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 780;BA.debugLine="Sub SetMaxWidth(varMaxWidth As String) As VMToolBa";
 //BA.debugLineNum = 781;BA.debugLine="If varMaxWidth = \"\" Then Return Me";
if ((_varmaxwidth).equals("")) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 782;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 783;BA.debugLine="SetAttrSingle(\"max-width\", varMaxWidth)";
_setattrsingle("max-width",_varmaxwidth);
 //BA.debugLineNum = 784;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 786;BA.debugLine="Dim pp As String = $\"${ID}MaxWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxWidth");
 //BA.debugLineNum = 787;BA.debugLine="vue.SetStateSingle(pp, varMaxWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxwidth));
 //BA.debugLineNum = 788;BA.debugLine="ToolBar.Bind(\":max-width\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":max-width",_pp);
 //BA.debugLineNum = 789;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 790;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setminheight(String _varminheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 793;BA.debugLine="Sub SetMinHeight(varMinHeight As String) As VMTool";
 //BA.debugLineNum = 794;BA.debugLine="If varMinHeight = \"\" Then Return Me";
if ((_varminheight).equals("")) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 795;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 796;BA.debugLine="SetAttrSingle(\"min-height\", varMinHeight)";
_setattrsingle("min-height",_varminheight);
 //BA.debugLineNum = 797;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 799;BA.debugLine="Dim pp As String = $\"${ID}MinHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinHeight");
 //BA.debugLineNum = 800;BA.debugLine="vue.SetStateSingle(pp, varMinHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminheight));
 //BA.debugLineNum = 801;BA.debugLine="ToolBar.Bind(\":min-height\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":min-height",_pp);
 //BA.debugLineNum = 802;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 803;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setminwidth(String _varminwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 806;BA.debugLine="Sub SetMinWidth(varMinWidth As String) As VMToolBa";
 //BA.debugLineNum = 807;BA.debugLine="If varMinWidth = \"\" Then Return Me";
if ((_varminwidth).equals("")) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 808;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 809;BA.debugLine="SetAttrSingle(\"min-width\", varMinWidth)";
_setattrsingle("min-width",_varminwidth);
 //BA.debugLineNum = 810;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 812;BA.debugLine="Dim pp As String = $\"${ID}MinWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinWidth");
 //BA.debugLineNum = 813;BA.debugLine="vue.SetStateSingle(pp, varMinWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminwidth));
 //BA.debugLineNum = 814;BA.debugLine="ToolBar.Bind(\":min-width\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":min-width",_pp);
 //BA.debugLineNum = 815;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 816;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmodefixed(boolean _b) throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Sub SetModeFixed(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 406;BA.debugLine="ToolBar.SetAttrSingle(\"fixed\", b)";
_toolbar._setattrsingle /*b4j.example.vmelement*/ ("fixed",BA.ObjectToString(_b));
 //BA.debugLineNum = 407;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 1008;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 1009;BA.debugLine="ToolBar.SetName(varName, bbind)";
_toolbar._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 1010;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1011;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setonmenuclick(Object _eventhandler,String _methodname) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetOnMenuClick(eventHandler As Object, MethodN";
 //BA.debugLineNum = 98;BA.debugLine="Hamburger.SetOnClickStop(eventHandler, MethodName";
_hamburger._setonclickstop /*b4j.example.vmelement*/ (_eventhandler,_methodname);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setonrightmenuclick(Object _eventhandler,String _methodname) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetOnRightMenuClick(eventHandler As Object, Me";
 //BA.debugLineNum = 103;BA.debugLine="RightHamburger.SetOnClickStop(eventHandler, Metho";
_righthamburger._setonclickstop /*b4j.example.vmelement*/ (_eventhandler,_methodname);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 980;BA.debugLine="Sub SetPaddingAll(p As String) As VMToolBar";
 //BA.debugLineNum = 981;BA.debugLine="ToolBar.SetPaddingAll(p)";
_toolbar._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 982;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 983;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetPrimary(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 249;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 250;BA.debugLine="SetColor(\"primary\")";
_setcolor("primary");
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setprominent(boolean _varprominent) throws Exception{
String _pp = "";
 //BA.debugLineNum = 819;BA.debugLine="Sub SetProminent(varProminent As Boolean) As VMToo";
 //BA.debugLineNum = 820;BA.debugLine="If varProminent = False Then Return Me";
if (_varprominent==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 821;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 822;BA.debugLine="SetAttrSingle(\"prominent\", varProminent)";
_setattrsingle("prominent",BA.ObjectToString(_varprominent));
 //BA.debugLineNum = 823;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 825;BA.debugLine="Dim pp As String = $\"${ID}Prominent\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Prominent");
 //BA.debugLineNum = 826;BA.debugLine="vue.SetStateSingle(pp, varProminent)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprominent));
 //BA.debugLineNum = 827;BA.debugLine="ToolBar.Bind(\":prominent\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":prominent",_pp);
 //BA.debugLineNum = 828;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 829;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 1059;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMToo";
 //BA.debugLineNum = 1060;BA.debugLine="ToolBar.SetRC(sRow, sCol)";
_toolbar._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 1061;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1062;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setscrolloffscreen(boolean _varscrolloffscreen) throws Exception{
String _pp = "";
 //BA.debugLineNum = 832;BA.debugLine="Sub SetScrollOffScreen(varScrollOffScreen As Boole";
 //BA.debugLineNum = 833;BA.debugLine="If varScrollOffScreen = False Then Return Me";
if (_varscrolloffscreen==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 834;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 835;BA.debugLine="SetAttrSingle(\"scroll-off-screen\", varScrollOffS";
_setattrsingle("scroll-off-screen",BA.ObjectToString(_varscrolloffscreen));
 //BA.debugLineNum = 836;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 838;BA.debugLine="Dim pp As String = $\"${ID}ScrollOffScreen\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ScrollOffScreen");
 //BA.debugLineNum = 839;BA.debugLine="vue.SetStateSingle(pp, varScrollOffScreen)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varscrolloffscreen));
 //BA.debugLineNum = 840;BA.debugLine="ToolBar.Bind(\":scroll-off-screen\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":scroll-off-screen",_pp);
 //BA.debugLineNum = 841;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 842;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setscrolltarget(String _varscrolltarget) throws Exception{
String _pp = "";
 //BA.debugLineNum = 845;BA.debugLine="Sub SetScrollTarget(varScrollTarget As String) As";
 //BA.debugLineNum = 846;BA.debugLine="If varScrollTarget = \"\" Then Return Me";
if ((_varscrolltarget).equals("")) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 847;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 848;BA.debugLine="SetAttrSingle(\"scroll-target\", varScrollTarget)";
_setattrsingle("scroll-target",_varscrolltarget);
 //BA.debugLineNum = 849;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 851;BA.debugLine="Dim pp As String = $\"${ID}ScrollTarget\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ScrollTarget");
 //BA.debugLineNum = 852;BA.debugLine="vue.SetStateSingle(pp, varScrollTarget)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varscrolltarget));
 //BA.debugLineNum = 853;BA.debugLine="ToolBar.Bind(\":scroll-target\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":scroll-target",_pp);
 //BA.debugLineNum = 854;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 855;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setscrollthreshold(String _varscrollthreshold) throws Exception{
String _pp = "";
 //BA.debugLineNum = 858;BA.debugLine="Sub SetScrollThreshold(varScrollThreshold As Strin";
 //BA.debugLineNum = 859;BA.debugLine="If varScrollThreshold = \"\" Then Return Me";
if ((_varscrollthreshold).equals("")) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 860;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 861;BA.debugLine="SetAttrSingle(\"scroll-threshold\", varScrollThres";
_setattrsingle("scroll-threshold",_varscrollthreshold);
 //BA.debugLineNum = 862;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 864;BA.debugLine="Dim pp As String = $\"${ID}ScrollThreshold\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ScrollThreshold");
 //BA.debugLineNum = 865;BA.debugLine="vue.SetStateSingle(pp, varScrollThreshold)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varscrollthreshold));
 //BA.debugLineNum = 866;BA.debugLine="ToolBar.Bind(\":scroll-threshold\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":scroll-threshold",_pp);
 //BA.debugLineNum = 867;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 868;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setshort(boolean _varshort) throws Exception{
String _pp = "";
 //BA.debugLineNum = 871;BA.debugLine="Sub SetShort(varShort As Boolean) As VMToolBar";
 //BA.debugLineNum = 872;BA.debugLine="If varShort = False Then Return Me";
if (_varshort==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 873;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 874;BA.debugLine="SetAttrSingle(\"short\", varShort)";
_setattrsingle("short",BA.ObjectToString(_varshort));
 //BA.debugLineNum = 875;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 877;BA.debugLine="Dim pp As String = $\"${ID}Short\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Short");
 //BA.debugLineNum = 878;BA.debugLine="vue.SetStateSingle(pp, varShort)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshort));
 //BA.debugLineNum = 879;BA.debugLine="ToolBar.Bind(\":short\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":short",_pp);
 //BA.debugLineNum = 880;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 881;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setshrinkonscroll(boolean _varshrinkonscroll) throws Exception{
String _pp = "";
 //BA.debugLineNum = 884;BA.debugLine="Sub SetShrinkOnScroll(varShrinkOnScroll As Boolean";
 //BA.debugLineNum = 885;BA.debugLine="If varShrinkOnScroll = False Then Return Me";
if (_varshrinkonscroll==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 886;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 887;BA.debugLine="SetAttrSingle(\"shrink-on-scroll\", varShrinkOnScr";
_setattrsingle("shrink-on-scroll",BA.ObjectToString(_varshrinkonscroll));
 //BA.debugLineNum = 888;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 890;BA.debugLine="Dim pp As String = $\"${ID}ShrinkOnScroll\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShrinkOnScroll");
 //BA.debugLineNum = 891;BA.debugLine="vue.SetStateSingle(pp, varShrinkOnScroll)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshrinkonscroll));
 //BA.debugLineNum = 892;BA.debugLine="ToolBar.Bind(\":shrink-on-scroll\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":shrink-on-scroll",_pp);
 //BA.debugLineNum = 893;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 894;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setslotextension(boolean _b) throws Exception{
 //BA.debugLineNum = 955;BA.debugLine="Sub SetSlotExtension(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 956;BA.debugLine="SetAttr(CreateMap(\"slot\": \"extension\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("extension")}));
 //BA.debugLineNum = 957;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 958;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setslotimg(boolean _b) throws Exception{
 //BA.debugLineNum = 961;BA.debugLine="Sub SetSlotImg(b As Boolean) As VMToolBar    'igno";
 //BA.debugLineNum = 962;BA.debugLine="SetAttr(CreateMap(\"slot\": \"img\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("img")}));
 //BA.debugLineNum = 963;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 964;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setsrc(String _varsrc) throws Exception{
String _pp = "";
 //BA.debugLineNum = 897;BA.debugLine="Sub SetSrc(varSrc As String) As VMToolBar";
 //BA.debugLineNum = 898;BA.debugLine="If varSrc = \"\" Then Return Me";
if ((_varsrc).equals("")) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 899;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 900;BA.debugLine="SetAttrSingle(\"src\", varSrc)";
_setattrsingle("src",_varsrc);
 //BA.debugLineNum = 901;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 903;BA.debugLine="Dim pp As String = $\"${ID}Src\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Src");
 //BA.debugLineNum = 904;BA.debugLine="vue.SetStateSingle(pp, varSrc)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsrc));
 //BA.debugLineNum = 905;BA.debugLine="ToolBar.Bind(\":src\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":src",_pp);
 //BA.debugLineNum = 906;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 907;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetStatic(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 115;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 116;BA.debugLine="ToolBar.SetStatic(b)";
_toolbar._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 117;BA.debugLine="Hamburger.setstatic(b)";
_hamburger._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 118;BA.debugLine="Extension.setstatic(b)";
_extension._setstatic /*b4j.example.vmtemplate*/ (_b);
 //BA.debugLineNum = 119;BA.debugLine="Tabs.SetStatic(b)";
_tabs._setstatic /*b4j.example.vmtabs*/ (_b);
 //BA.debugLineNum = 120;BA.debugLine="Title.SetStatic(b)";
_title._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 121;BA.debugLine="Logo.SetStatic(b)";
_logo._setstatic /*b4j.example.vmimage*/ (_b);
 //BA.debugLineNum = 122;BA.debugLine="Progress.SetStatic(b)";
_progress._setstatic /*b4j.example.vmprogresslinear*/ (_b);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 1139;BA.debugLine="Sub SetStyle(sm As Map) As VMToolBar";
 //BA.debugLineNum = 1140;BA.debugLine="ToolBar.SetStyle(sm)";
_toolbar._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 1141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1019;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 1020;BA.debugLine="ToolBar.SetStyleSingle(prop, value)";
_toolbar._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 1021;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1022;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setsystembar(boolean _b) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetSystemBar(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 141;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 142;BA.debugLine="ToolBar.SetTag(\"v-system-bar\")";
_toolbar._settag /*b4j.example.vmelement*/ ("v-system-bar");
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 1002;BA.debugLine="Sub SetTabIndex(ti As String) As VMToolBar";
 //BA.debugLineNum = 1003;BA.debugLine="ToolBar.SetTabIndex(ti)";
_toolbar._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 1004;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1005;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _settag(String _vartag) throws Exception{
String _pp = "";
 //BA.debugLineNum = 910;BA.debugLine="Sub SetTag(varTag As String) As VMToolBar";
 //BA.debugLineNum = 911;BA.debugLine="If varTag = \"\" Then Return Me";
if ((_vartag).equals("")) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 912;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 913;BA.debugLine="SetAttrSingle(\"tag\", varTag)";
_setattrsingle("tag",_vartag);
 //BA.debugLineNum = 914;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 916;BA.debugLine="Dim pp As String = $\"${ID}Tag\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tag");
 //BA.debugLineNum = 917;BA.debugLine="vue.SetStateSingle(pp, varTag)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartag));
 //BA.debugLineNum = 918;BA.debugLine="ToolBar.Bind(\":tag\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":tag",_pp);
 //BA.debugLineNum = 919;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 920;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 1041;BA.debugLine="Sub SetTextColor(varColor As String) As VMToolBar";
 //BA.debugLineNum = 1042;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 1043;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 1044;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 1045;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1046;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 1049;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 1050;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 1051;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 1052;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 1053;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 1054;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 1055;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1056;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _settile(boolean _vartile) throws Exception{
String _pp = "";
 //BA.debugLineNum = 923;BA.debugLine="Sub SetTile(varTile As Boolean) As VMToolBar";
 //BA.debugLineNum = 924;BA.debugLine="If varTile = False Then Return Me";
if (_vartile==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 925;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 926;BA.debugLine="SetAttrSingle(\"tile\", varTile)";
_setattrsingle("tile",BA.ObjectToString(_vartile));
 //BA.debugLineNum = 927;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 929;BA.debugLine="Dim pp As String = $\"${ID}Tile\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tile");
 //BA.debugLineNum = 930;BA.debugLine="vue.SetStateSingle(pp, varTile)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartile));
 //BA.debugLineNum = 931;BA.debugLine="ToolBar.Bind(\":tile\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":tile",_pp);
 //BA.debugLineNum = 932;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 933;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _settoolbar(boolean _b) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetToolBar(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 135;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 136;BA.debugLine="ToolBar.SetTag(\"v-toolbar\")";
_toolbar._settag /*b4j.example.vmelement*/ ("v-toolbar");
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setvalue(boolean _varvalue) throws Exception{
 //BA.debugLineNum = 936;BA.debugLine="Sub SetValue(varValue As Boolean) As VMToolBar";
 //BA.debugLineNum = 937;BA.debugLine="ToolBar.SetValue(varValue, False)";
_toolbar._setvalue /*b4j.example.vmelement*/ (BA.ObjectToString(_varvalue),__c.False);
 //BA.debugLineNum = 938;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 939;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 1115;BA.debugLine="Sub SetVIf(vif As String) As VMToolBar";
 //BA.debugLineNum = 1116;BA.debugLine="ToolBar.SetVIf(vif)";
_toolbar._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 1117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1118;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 1035;BA.debugLine="Sub SetVisible(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 1036;BA.debugLine="ToolBar.SetVisible(b)";
_toolbar._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 1037;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1038;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 1120;BA.debugLine="Sub SetVShow(vif As String) As VMToolBar";
 //BA.debugLineNum = 1121;BA.debugLine="smodel = vif";
_smodel = _vif;
 //BA.debugLineNum = 1122;BA.debugLine="ToolBar.SetVShow(vif)";
_toolbar._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 1123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 1124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setwidth(String _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 942;BA.debugLine="Sub SetWidth(varWidth As String) As VMToolBar";
 //BA.debugLineNum = 943;BA.debugLine="If varWidth = \"\" Then Return Me";
if ((_varwidth).equals("")) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 944;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 945;BA.debugLine="SetAttrSingle(\"width\", varWidth)";
_setattrsingle("width",_varwidth);
 //BA.debugLineNum = 946;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 948;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 949;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varwidth));
 //BA.debugLineNum = 950;BA.debugLine="ToolBar.Bind(\":width\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":width",_pp);
 //BA.debugLineNum = 951;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 952;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setwindow(boolean _varwindow) throws Exception{
String _pp = "";
 //BA.debugLineNum = 488;BA.debugLine="Sub SetWindow(varWindow As Boolean) As VMToolBar";
 //BA.debugLineNum = 489;BA.debugLine="If varWindow = False Then Return Me";
if (_varwindow==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 490;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 491;BA.debugLine="SetAttrSingle(\"window\", varWindow)";
_setattrsingle("window",BA.ObjectToString(_varwindow));
 //BA.debugLineNum = 492;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 };
 //BA.debugLineNum = 494;BA.debugLine="Dim pp As String = $\"${ID}Window\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Window");
 //BA.debugLineNum = 495;BA.debugLine="vue.SetStateSingle(pp, varWindow)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varwindow));
 //BA.debugLineNum = 496;BA.debugLine="ToolBar.Bind(\":window\", pp)";
_toolbar._bind /*b4j.example.vmelement*/ (":window",_pp);
 //BA.debugLineNum = 497;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return null;
}
public String  _show() throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub Show";
 //BA.debugLineNum = 314;BA.debugLine="vue.SetStateSingle(smodel, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_smodel,(Object)(__c.True));
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return "";
}
public String  _showitems() throws Exception{
String _item = "";
 //BA.debugLineNum = 457;BA.debugLine="Sub ShowItems";
 //BA.debugLineNum = 458;BA.debugLine="For Each item As String In objects";
{
final anywheresoftware.b4a.BA.IterableList group1 = _objects;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 459;BA.debugLine="ToolBar.ShowItem(item)";
_toolbar._showitem /*b4j.example.vmelement*/ (_item);
 }
};
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 444;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 445;BA.debugLine="ToolBar.SetText(Progress.ToString)";
_toolbar._settext /*b4j.example.vmelement*/ (_progress._tostring /*String*/ ());
 //BA.debugLineNum = 446;BA.debugLine="If Tabs.hascontent Then AddTabs(Tabs)";
if (_tabs._hascontent /*boolean*/ ) { 
_addtabs(_tabs);};
 //BA.debugLineNum = 447;BA.debugLine="If Extension.HasContent Then Extension.pop(ToolBa";
if (_extension._hascontent /*boolean*/ ) { 
_extension._pop /*String*/ (_toolbar);};
 //BA.debugLineNum = 448;BA.debugLine="Return ToolBar.tostring";
if (true) return _toolbar._tostring /*String*/ ();
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _updatelogo(String _url) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub UpdateLogo(URL As String) As VMToolBar";
 //BA.debugLineNum = 297;BA.debugLine="vue.SetData(\"logo\", URL)";
_vue._setdata /*b4j.example.bananovue*/ ("logo",(Object)(_url));
 //BA.debugLineNum = 298;BA.debugLine="Logo.Show";
_logo._show /*b4j.example.vmimage*/ ();
 //BA.debugLineNum = 299;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _updatesubtitle(String _stext) throws Exception{
String _skey = "";
 //BA.debugLineNum = 222;BA.debugLine="Sub UpdateSubTitle(sText As String) As VMToolBar";
 //BA.debugLineNum = 223;BA.debugLine="Dim skey As String = $\"${ID}subheading\"$";
_skey = (""+__c.SmartStringFormatter("",(Object)(_id))+"subheading");
 //BA.debugLineNum = 224;BA.debugLine="vue.SetData(skey, sText)";
_vue._setdata /*b4j.example.bananovue*/ (_skey,(Object)(_stext));
 //BA.debugLineNum = 225;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _updatetitle(String _tt) throws Exception{
 //BA.debugLineNum = 426;BA.debugLine="Sub UpdateTitle(tt As String) As VMToolBar";
 //BA.debugLineNum = 427;BA.debugLine="vue.SetStateSingle(tTitle, tt)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_ttitle,(Object)(_tt));
 //BA.debugLineNum = 428;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 429;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 430;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 279;BA.debugLine="Sub UseTheme(themeName As String) As VMToolBar";
 //BA.debugLineNum = 280;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 281;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 282;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 283;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 284;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "MENU_CLICK"))
	return _menu_click((com.ab.banano.BANanoEvent) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
