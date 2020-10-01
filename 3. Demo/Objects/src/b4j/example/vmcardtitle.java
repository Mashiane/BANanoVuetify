package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcardtitle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmcardtitle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcardtitle.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _cardtitle = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public boolean _hascontent = false;
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
public b4j.example.vmcardtitle  _addbutton(b4j.example.vmbutton _btn) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub AddButton(btn As VMButton) As VMCardTitle";
 //BA.debugLineNum = 113;BA.debugLine="CardTitle.SetText(btn.tostring)";
_cardtitle._settext /*b4j.example.vmelement*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 114;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _addbutton1(String _key,String _iconname,String _iconcolor,String _text,String _tooltip,String _badge) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 118;BA.debugLine="Sub AddButton1(key As String, iconName As String,";
 //BA.debugLineNum = 119;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 120;BA.debugLine="btn.Initialize(vue, key, Module).SetStatic(bStati";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_key,_module)._setstatic /*b4j.example.vmbutton*/ (_bstatic)._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 121;BA.debugLine="btn.SetToolTip(toolTip)";
_btn._settooltip /*b4j.example.vmbutton*/ (_tooltip);
 //BA.debugLineNum = 122;BA.debugLine="If iconName <> \"\" Then btn.AddIcon(iconName,\"left";
if ((_iconname).equals("") == false) { 
_btn._addicon /*b4j.example.vmbutton*/ (_iconname,"left","");};
 //BA.debugLineNum = 123;BA.debugLine="btn.SetLabel(text)";
_btn._setlabel /*b4j.example.vmbutton*/ (_text);
 //BA.debugLineNum = 124;BA.debugLine="btn.SetColor(iconColor)";
_btn._setcolor /*b4j.example.vmbutton*/ (_iconcolor);
 //BA.debugLineNum = 125;BA.debugLine="btn.SetTransparent(True)";
_btn._settransparent /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 126;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
 //BA.debugLineNum = 127;BA.debugLine="btn.SetHasBadge(True)";
_btn._sethasbadge /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 128;BA.debugLine="btn.SetBadge(badge)";
_btn._setbadge /*b4j.example.vmbutton*/ (_badge);
 };
 //BA.debugLineNum = 130;BA.debugLine="CardTitle.SetText(btn.tostring)";
_cardtitle._settext /*b4j.example.vmelement*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 131;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public String  _addbutton2(String _btnid,String _btntext,String _btnicon,String _btncolor,String _btnvalue,String _btntooltip,String _btnbadge,boolean _btnraised,boolean _btnfab) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 161;BA.debugLine="Sub AddButton2(btnID As String, btnText As String,";
 //BA.debugLineNum = 162;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 163;BA.debugLine="btn.Initialize(vue, btnID, Module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_btnid,_module);
 //BA.debugLineNum = 164;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 165;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 166;BA.debugLine="btn.SetColor(btnColor)";
_btn._setcolor /*b4j.example.vmbutton*/ (_btncolor);
 //BA.debugLineNum = 167;BA.debugLine="btn.SetSpan(btnText)";
_btn._setspan /*b4j.example.vmbutton*/ (_btntext);
 //BA.debugLineNum = 168;BA.debugLine="btn.AddIcon(btnIcon, \"\", \"\")";
_btn._addicon /*b4j.example.vmbutton*/ (_btnicon,"","");
 //BA.debugLineNum = 169;BA.debugLine="btn.SetTooltip(btnToolTip)";
_btn._settooltip /*b4j.example.vmbutton*/ (_btntooltip);
 //BA.debugLineNum = 170;BA.debugLine="btn.SetRaised(btnRaised)";
_btn._setraised /*b4j.example.vmbutton*/ (_btnraised);
 //BA.debugLineNum = 171;BA.debugLine="btn.SetAttrSingle(\"value\", btnValue)";
_btn._setattrsingle /*b4j.example.vmbutton*/ ("value",_btnvalue);
 //BA.debugLineNum = 172;BA.debugLine="btn.SetFab(btnFab)";
_btn._setfab /*b4j.example.vmbutton*/ (_btnfab);
 //BA.debugLineNum = 173;BA.debugLine="If btnBadge <> \"\" Then";
if ((_btnbadge).equals("") == false) { 
 //BA.debugLineNum = 174;BA.debugLine="btn.SetHasBadge(True)";
_btn._sethasbadge /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 175;BA.debugLine="btn.SetBadge(btnBadge)";
_btn._setbadge /*b4j.example.vmbutton*/ (_btnbadge);
 };
 //BA.debugLineNum = 177;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 178;BA.debugLine="CardTitle.SetText(btn.ToString)";
_cardtitle._settext /*b4j.example.vmelement*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardtitle  _addbutton3(String _key,String _iconname,String _iconcolor,String _iconpos,String _text,boolean _boutlined,String _tooltip,String _badge) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 135;BA.debugLine="Sub AddButton3(key As String, iconName As String,";
 //BA.debugLineNum = 136;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 137;BA.debugLine="btn.Initialize(vue, key, Module).SetStatic(bStati";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_key,_module)._setstatic /*b4j.example.vmbutton*/ (_bstatic)._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 138;BA.debugLine="btn.SetToolTip(toolTip)";
_btn._settooltip /*b4j.example.vmbutton*/ (_tooltip);
 //BA.debugLineNum = 139;BA.debugLine="If iconName <> \"\" Then btn.AddIcon(iconName,iconP";
if ((_iconname).equals("") == false) { 
_btn._addicon /*b4j.example.vmbutton*/ (_iconname,_iconpos,"");};
 //BA.debugLineNum = 140;BA.debugLine="btn.SetLabel(text)";
_btn._setlabel /*b4j.example.vmbutton*/ (_text);
 //BA.debugLineNum = 141;BA.debugLine="btn.SetColor(iconColor)";
_btn._setcolor /*b4j.example.vmbutton*/ (_iconcolor);
 //BA.debugLineNum = 142;BA.debugLine="btn.SetTransparent(True)";
_btn._settransparent /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 143;BA.debugLine="btn.SetOutlined(bOutlined)";
_btn._setoutlined /*b4j.example.vmbutton*/ (_boutlined);
 //BA.debugLineNum = 144;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
 //BA.debugLineNum = 145;BA.debugLine="btn.SetHasBadge(True)";
_btn._sethasbadge /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 146;BA.debugLine="btn.SetBadge(badge)";
_btn._setbadge /*b4j.example.vmbutton*/ (_badge);
 };
 //BA.debugLineNum = 148;BA.debugLine="CardTitle.SetText(btn.tostring)";
_cardtitle._settext /*b4j.example.vmelement*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 149;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 284;BA.debugLine="Sub AddChild(child As VMElement) As VMCardTitle";
 //BA.debugLineNum = 285;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 286;BA.debugLine="CardTitle.SetText(childHTML)";
_cardtitle._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 287;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 327;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 328;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 329;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardtitle  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub AddClass(c As String) As VMCardTitle";
 //BA.debugLineNum = 310;BA.debugLine="CardTitle.AddClass(c)";
_cardtitle._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub AddComponent(comp As String) As VMCardTitle";
 //BA.debugLineNum = 106;BA.debugLine="CardTitle.SetText(comp)";
_cardtitle._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 107;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _adddivider(boolean _bvertical,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
b4j.example.vmdivider _d = null;
 //BA.debugLineNum = 94;BA.debugLine="Sub AddDivider(bVertical As Boolean, mprops As Map";
 //BA.debugLineNum = 95;BA.debugLine="Dim d As VMDivider";
_d = new b4j.example.vmdivider();
 //BA.debugLineNum = 96;BA.debugLine="d.Initialize(vue).SetDesignMode(DesignMode)";
_d._initialize /*b4j.example.vmdivider*/ (ba,_vue)._setdesignmode /*b4j.example.vmdivider*/ (_designmode);
 //BA.debugLineNum = 97;BA.debugLine="If bVertical Then d.SetVertical";
if (_bvertical) { 
_d._setvertical /*b4j.example.vmdivider*/ ();};
 //BA.debugLineNum = 98;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, loose)";
_d._buildmodel /*b4j.example.vmdivider*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 99;BA.debugLine="CardTitle.SetText(d.ToString)";
_cardtitle._settext /*b4j.example.vmelement*/ (_d._tostring /*String*/ ());
 //BA.debugLineNum = 100;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _adddivider1() throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub AddDivider1 As VMCardTitle";
 //BA.debugLineNum = 156;BA.debugLine="AddDivider(True, Null, Null, Array(\"mx-2\"), Null)";
_adddivider(__c.True,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__c.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__c.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("mx-2")}),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _addelement(String _elid,String _eltag,String _eltext,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses) throws Exception{
b4j.example.vmelement _d = null;
 //BA.debugLineNum = 84;BA.debugLine="Sub AddElement(elID As String, elTag As String, el";
 //BA.debugLineNum = 85;BA.debugLine="Dim d As VMElement";
_d = new b4j.example.vmelement();
 //BA.debugLineNum = 86;BA.debugLine="d.Initialize(vue,elID).SetDesignMode(DesignMode).";
_d._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid)._setdesignmode /*b4j.example.vmelement*/ (_designmode)._settag /*b4j.example.vmelement*/ (_eltag);
 //BA.debugLineNum = 87;BA.debugLine="d.SetText(elText)";
_d._settext /*b4j.example.vmelement*/ (_eltext);
 //BA.debugLineNum = 88;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, Null)";
_d._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 89;BA.debugLine="CardTitle.SetText(d.ToString)";
_cardtitle._settext /*b4j.example.vmelement*/ (_d._tostring /*String*/ ());
 //BA.debugLineNum = 90;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _addfab(String _key,String _iconname,String _iconcolor,String _iconsize,String _tooltip,String _badge) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 218;BA.debugLine="Sub AddFab(key As String, iconName As String, icon";
 //BA.debugLineNum = 219;BA.debugLine="key = key.tolowercase";
_key = _key.toLowerCase();
 //BA.debugLineNum = 220;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 221;BA.debugLine="btn.Initialize(vue, key, Module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_key,_module);
 //BA.debugLineNum = 222;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 223;BA.debugLine="btn.SetFab(True)";
_btn._setfab /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 224;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 225;BA.debugLine="btn.AddIcon(iconName,\"\",\"\")";
_btn._addicon /*b4j.example.vmbutton*/ (_iconname,"","");
 //BA.debugLineNum = 226;BA.debugLine="btn.SetColor(iconColor)";
_btn._setcolor /*b4j.example.vmbutton*/ (_iconcolor);
 //BA.debugLineNum = 227;BA.debugLine="btn.SetSize(iconSize)";
_btn._setsize /*b4j.example.vmbutton*/ (_iconsize);
 //BA.debugLineNum = 228;BA.debugLine="btn.SetTooltip(toolTip)";
_btn._settooltip /*b4j.example.vmbutton*/ (_tooltip);
 //BA.debugLineNum = 229;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
 //BA.debugLineNum = 230;BA.debugLine="btn.SetHasBadge(True)";
_btn._sethasbadge /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 231;BA.debugLine="btn.SetBadge(badge)";
_btn._setbadge /*b4j.example.vmbutton*/ (_badge);
 };
 //BA.debugLineNum = 233;BA.debugLine="CardTitle.SetText(btn.tostring)";
_cardtitle._settext /*b4j.example.vmelement*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 234;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _addicon(String _key,String _iconname,String _iconcolor,String _iconsize,String _tooltip,String _badge) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 181;BA.debugLine="Sub AddIcon(key As String, iconName As String, ico";
 //BA.debugLineNum = 182;BA.debugLine="key = key.tolowercase";
_key = _key.toLowerCase();
 //BA.debugLineNum = 183;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 184;BA.debugLine="btn.Initialize(vue, key, Module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_key,_module);
 //BA.debugLineNum = 185;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 186;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 187;BA.debugLine="btn.SetIconButton(iconName).SetTooltip(toolTip)";
_btn._seticonbutton /*b4j.example.vmbutton*/ (_iconname)._settooltip /*b4j.example.vmbutton*/ (_tooltip);
 //BA.debugLineNum = 188;BA.debugLine="btn.SetColor(iconColor)";
_btn._setcolor /*b4j.example.vmbutton*/ (_iconcolor);
 //BA.debugLineNum = 189;BA.debugLine="btn.SetSize(iconSize)";
_btn._setsize /*b4j.example.vmbutton*/ (_iconsize);
 //BA.debugLineNum = 190;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
 //BA.debugLineNum = 191;BA.debugLine="btn.SetHasBadge(True)";
_btn._sethasbadge /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 192;BA.debugLine="btn.SetBadge(badge)";
_btn._setbadge /*b4j.example.vmbutton*/ (_badge);
 };
 //BA.debugLineNum = 194;BA.debugLine="CardTitle.SetText(btn.tostring)";
_cardtitle._settext /*b4j.example.vmelement*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 195;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _addicon1(String _elid,String _iconname,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses) throws Exception{
b4j.example.vmicon _d = null;
 //BA.debugLineNum = 74;BA.debugLine="Sub AddIcon1(elID As String, iconName As String, m";
 //BA.debugLineNum = 75;BA.debugLine="Dim d As VMIcon";
_d = new b4j.example.vmicon();
 //BA.debugLineNum = 76;BA.debugLine="d.Initialize(vue,elID,Module).SetDesignMode(Desig";
_d._initialize /*b4j.example.vmicon*/ (ba,_vue,_elid,_module)._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 77;BA.debugLine="d.SetText(iconName)";
_d._settext /*b4j.example.vmicon*/ (_iconname);
 //BA.debugLineNum = 78;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, Null)";
_d._buildmodel /*b4j.example.vmicon*/ (_mprops,_mstyles,_lclasses,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 79;BA.debugLine="CardTitle.SetText(d.ToString)";
_cardtitle._settext /*b4j.example.vmelement*/ (_d._tostring /*String*/ ());
 //BA.debugLineNum = 80;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _addicon2(String _key,String _iconname,String _iconcolor,String _iconsize,String _tooltip,String _badge,String _classes) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 199;BA.debugLine="Sub AddIcon2(key As String, iconName As String, ic";
 //BA.debugLineNum = 200;BA.debugLine="key = key.tolowercase";
_key = _key.toLowerCase();
 //BA.debugLineNum = 201;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 202;BA.debugLine="btn.Initialize(vue, key, Module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_key,_module);
 //BA.debugLineNum = 203;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 204;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 205;BA.debugLine="btn.SetIconButton(iconName).SetTooltip(toolTip)";
_btn._seticonbutton /*b4j.example.vmbutton*/ (_iconname)._settooltip /*b4j.example.vmbutton*/ (_tooltip);
 //BA.debugLineNum = 206;BA.debugLine="btn.SetColor(iconColor)";
_btn._setcolor /*b4j.example.vmbutton*/ (_iconcolor);
 //BA.debugLineNum = 207;BA.debugLine="btn.SetSize(iconSize)";
_btn._setsize /*b4j.example.vmbutton*/ (_iconsize);
 //BA.debugLineNum = 208;BA.debugLine="btn.AddClass(classes)";
_btn._addclass /*b4j.example.vmbutton*/ (_classes);
 //BA.debugLineNum = 209;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
 //BA.debugLineNum = 210;BA.debugLine="btn.SetHasBadge(True)";
_btn._sethasbadge /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 211;BA.debugLine="btn.SetBadge(badge)";
_btn._setbadge /*b4j.example.vmbutton*/ (_badge);
 };
 //BA.debugLineNum = 213;BA.debugLine="CardTitle.SetText(btn.tostring)";
_cardtitle._settext /*b4j.example.vmelement*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 214;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _addmenu(b4j.example.vmmenu _menu) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub AddMenu(menu As VMMenu) As VMCardTitle";
 //BA.debugLineNum = 241;BA.debugLine="AddComponent(menu.ToString)";
_addcomponent(_menu._tostring /*String*/ ());
 //BA.debugLineNum = 242;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _addsearch(String _key) throws Exception{
b4j.example.vmtextfield _txt = null;
 //BA.debugLineNum = 34;BA.debugLine="Sub AddSearch(key As String) As VMCardTitle";
 //BA.debugLineNum = 35;BA.debugLine="Dim txt As VMTextField";
_txt = new b4j.example.vmtextfield();
 //BA.debugLineNum = 36;BA.debugLine="txt.Initialize(vue, key, Module).SetStatic(bStati";
_txt._initialize /*b4j.example.vmtextfield*/ (ba,_vue,_key,_module)._setstatic /*b4j.example.vmtextfield*/ (_bstatic)._setdesignmode /*b4j.example.vmtextfield*/ (_designmode)._setattributes /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("single-line"),(Object)("hide-details")}));
 //BA.debugLineNum = 37;BA.debugLine="txt.SetLabel(\"Search\").SetAppendIcon(\"mdi-magnify";
_txt._setlabel /*b4j.example.vmtextfield*/ ("Search")._setappendicon /*b4j.example.vmtextfield*/ ("mdi-magnify")._setclearable /*b4j.example.vmtextfield*/ (__c.True)._setvmodel /*b4j.example.vmtextfield*/ (_key);
 //BA.debugLineNum = 38;BA.debugLine="txt.SetSolo(True)";
_txt._setsolo /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 39;BA.debugLine="txt.SetOnChange(Module, $\"${key}_change\"$)";
_txt._setonchange /*b4j.example.vmtextfield*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_key))+"_change"));
 //BA.debugLineNum = 40;BA.debugLine="CardTitle.SetText(txt.ToString)";
_cardtitle._settext /*b4j.example.vmelement*/ (_txt._tostring /*String*/ ());
 //BA.debugLineNum = 41;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _addspacer() throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub AddSpacer As VMCardTitle";
 //BA.debugLineNum = 247;BA.debugLine="CardTitle.AddSpacer";
_cardtitle._addspacer /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 248;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 357;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 358;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 408;BA.debugLine="CardTitle.BuildModel(mprops, mstyles, lclasses, lo";
_cardtitle._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public CardTitle As VMElement";
_cardtitle = new b4j.example.vmelement();
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
 //BA.debugLineNum = 10;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _clear() throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub Clear";
 //BA.debugLineNum = 300;BA.debugLine="CardTitle.Clear";
_cardtitle._clear /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardtitle  _disable() throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub Disable As VMCardTitle";
 //BA.debugLineNum = 350;BA.debugLine="CardTitle.Disable(True)";
_cardtitle._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _enable() throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub Enable As VMCardTitle";
 //BA.debugLineNum = 345;BA.debugLine="CardTitle.Enable(True)";
_cardtitle._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _hide() throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub Hide As VMCardTitle";
 //BA.debugLineNum = 335;BA.debugLine="CardTitle.SetVisible(False)";
_cardtitle._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="CardTitle.Initialize(v, ID)";
_cardtitle._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 17;BA.debugLine="CardTitle.SetTag(\"v-card-title\")";
_cardtitle._settag /*b4j.example.vmelement*/ ("v-card-title");
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 21;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="HasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 305;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardtitle  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 363;BA.debugLine="public Sub RemoveAttr(sName As String) As VMCardTi";
 //BA.debugLineNum = 364;BA.debugLine="CardTitle.RemoveAttr(sName)";
_cardtitle._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub Render";
 //BA.debugLineNum = 280;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardtitle  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub SetAttr(attr As Map) As VMCardTitle";
 //BA.debugLineNum = 316;BA.debugLine="CardTitle.SetAttr(attr)";
_cardtitle._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 50;BA.debugLine="Sub SetAttributes(attrs As List) As VMCardTitle";
 //BA.debugLineNum = 51;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 52;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetAttrLoose(loose As String) As VMCardTitle";
 //BA.debugLineNum = 46;BA.debugLine="CardTitle.SetAttrLoose(loose)";
_cardtitle._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 402;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 403;BA.debugLine="CardTitle.SetAttrSingle(prop, value)";
_cardtitle._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 404;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setcolor(String _varcolor) throws Exception{
 //BA.debugLineNum = 437;BA.debugLine="Sub SetColor(varColor As String) As VMCardTitle";
 //BA.debugLineNum = 438;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcardtitle)(this);};
 //BA.debugLineNum = 439;BA.debugLine="AddClass(varColor)";
_addclass(_varcolor);
 //BA.debugLineNum = 440;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 441;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 444;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 445;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcardtitle)(this);};
 //BA.debugLineNum = 446;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 447;BA.debugLine="AddClass(scolor)";
_addclass(_scolor);
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 253;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMCardTitle";
 //BA.debugLineNum = 380;BA.debugLine="CardTitle.SetDesignMode(b)";
_cardtitle._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 381;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 382;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 374;BA.debugLine="Sub SetMarginAll(p As String) As VMCardTitle";
 //BA.debugLineNum = 375;BA.debugLine="CardTitle.setmarginall(p)";
_cardtitle._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 392;BA.debugLine="CardTitle.SetName(varName, bbind)";
_cardtitle._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Sub SetPaddingAll(p As String) As VMCardTitle";
 //BA.debugLineNum = 370;BA.debugLine="CardTitle.SetPaddingAll(p)";
_cardtitle._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setprimarytitle(boolean _b) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetPrimaryTitle(b As Boolean) As VMCardTitle";
 //BA.debugLineNum = 58;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmcardtitle)(this);};
 //BA.debugLineNum = 59;BA.debugLine="CardTitle.SetAttrLoose(\"primary-title\")";
_cardtitle._setattrloose /*b4j.example.vmelement*/ ("primary-title");
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetStatic(b As Boolean) As VMCardTitle";
 //BA.debugLineNum = 28;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 29;BA.debugLine="CardTitle.SetStatic(b)";
_cardtitle._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub SetStyle(sm As Map) As VMCardTitle";
 //BA.debugLineNum = 322;BA.debugLine="CardTitle.SetStyle(sm)";
_cardtitle._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 397;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 398;BA.debugLine="CardTitle.SetStyleSingle(prop, value)";
_cardtitle._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 399;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 385;BA.debugLine="Sub SetTabIndex(ti As String) As VMCardTitle";
 //BA.debugLineNum = 386;BA.debugLine="CardTitle.SetTabIndex(ti)";
_cardtitle._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _settext(String _t) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub SetText(t As String) As VMCardTitle";
 //BA.debugLineNum = 293;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmcardtitle)(this);};
 //BA.debugLineNum = 294;BA.debugLine="CardTitle.SetText(t)";
_cardtitle._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 295;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 418;BA.debugLine="Sub SetTextColor(varColor As String) As VMCardTitl";
 //BA.debugLineNum = 419;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcardtitle)(this);};
 //BA.debugLineNum = 420;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 421;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 422;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 426;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 427;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcardtitle)(this);};
 //BA.debugLineNum = 428;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 429;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 430;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 431;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 432;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub SetVIf(vif As String) As VMCardTitle";
 //BA.debugLineNum = 269;BA.debugLine="CardTitle.SetVIf(vif)";
_cardtitle._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Sub SetVisible(b As Boolean) As VMCardTitle";
 //BA.debugLineNum = 413;BA.debugLine="CardTitle.SetVisible(b)";
_cardtitle._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub SetVModel(k As String) As VMCardTitle";
 //BA.debugLineNum = 264;BA.debugLine="CardTitle.SetVModel(k)";
_cardtitle._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetVShow(vif As String) As VMCardTitle";
 //BA.debugLineNum = 274;BA.debugLine="CardTitle.SetVShow(vif)";
_cardtitle._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtitle  _show() throws Exception{
 //BA.debugLineNum = 339;BA.debugLine="Sub Show As VMCardTitle";
 //BA.debugLineNum = 340;BA.debugLine="CardTitle.SetVisible(True)";
_cardtitle._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 341;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 260;BA.debugLine="Return CardTitle.ToString";
if (true) return _cardtitle._tostring /*String*/ ();
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardtitle  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 64;BA.debugLine="Sub UseTheme(themeName As String) As VMCardTitle";
 //BA.debugLineNum = 65;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 66;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 67;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 68;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 69;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtitle)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
