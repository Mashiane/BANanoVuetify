package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcardactions extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmcardactions", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcardactions.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _cardactions = null;
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
public b4j.example.vmcardactions  _addbutton(b4j.example.vmbutton _btn) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub AddButton(btn As VMButton) As VMCardActions";
 //BA.debugLineNum = 75;BA.debugLine="btn.Pop(CardActions)";
_btn._pop /*String*/ (_cardactions);
 //BA.debugLineNum = 76;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _addbutton1(String _key,String _iconname,String _iconcolor,String _text,String _tooltip,String _badge) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 81;BA.debugLine="Sub AddButton1(key As String, iconName As String,";
 //BA.debugLineNum = 82;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 83;BA.debugLine="btn.Initialize(vue, key, Module).SetStatic(bStati";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_key,_module)._setstatic /*b4j.example.vmbutton*/ (_bstatic)._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 84;BA.debugLine="btn.SetToolTip(toolTip)";
_btn._settooltip /*b4j.example.vmbutton*/ (_tooltip);
 //BA.debugLineNum = 85;BA.debugLine="If iconName <> \"\" Then btn.AddIcon(iconName,\"left";
if ((_iconname).equals("") == false) { 
_btn._addicon /*b4j.example.vmbutton*/ (_iconname,"left","");};
 //BA.debugLineNum = 86;BA.debugLine="btn.SetLabel(text)";
_btn._setlabel /*b4j.example.vmbutton*/ (_text);
 //BA.debugLineNum = 87;BA.debugLine="btn.SetColor(iconColor)";
_btn._setcolor /*b4j.example.vmbutton*/ (_iconcolor);
 //BA.debugLineNum = 88;BA.debugLine="btn.SetTransparent(True)";
_btn._settransparent /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 89;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
 //BA.debugLineNum = 90;BA.debugLine="btn.SetHasBadge(True)";
_btn._sethasbadge /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 91;BA.debugLine="btn.SetBadge(badge)";
_btn._setbadge /*b4j.example.vmbutton*/ (_badge);
 };
 //BA.debugLineNum = 93;BA.debugLine="CardActions.SetText(btn.tostring)";
_cardactions._settext /*b4j.example.vmelement*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 94;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 156;BA.debugLine="Sub AddChild(child As VMElement) As VMCardActions";
 //BA.debugLineNum = 157;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 158;BA.debugLine="CardActions.SetText(childHTML)";
_cardactions._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 159;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 195;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 196;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 197;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardactions  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub AddClass(c As String) As VMCardActions";
 //BA.debugLineNum = 178;BA.debugLine="CardActions.AddClass(c)";
_cardactions._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _addelement(String _elid,String _eltag,String _eltext,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses) throws Exception{
b4j.example.vmelement _d = null;
 //BA.debugLineNum = 35;BA.debugLine="Sub AddElement(elID As String, elTag As String, el";
 //BA.debugLineNum = 36;BA.debugLine="Dim d As VMElement";
_d = new b4j.example.vmelement();
 //BA.debugLineNum = 37;BA.debugLine="d.Initialize(vue,elID).SetDesignMode(DesignMode).";
_d._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid)._setdesignmode /*b4j.example.vmelement*/ (_designmode)._settag /*b4j.example.vmelement*/ (_eltag);
 //BA.debugLineNum = 38;BA.debugLine="d.SetText(elText)";
_d._settext /*b4j.example.vmelement*/ (_eltext);
 //BA.debugLineNum = 39;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, Null)";
_d._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 40;BA.debugLine="SetText(d.ToString)";
_settext(_d._tostring /*String*/ ());
 //BA.debugLineNum = 41;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _addicon(String _key,String _iconname,String _iconcolor,String _iconsize,String _tooltip,String _badge) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 98;BA.debugLine="Sub AddIcon(key As String, iconName As String, ico";
 //BA.debugLineNum = 99;BA.debugLine="key = key.tolowercase";
_key = _key.toLowerCase();
 //BA.debugLineNum = 100;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 101;BA.debugLine="btn.Initialize(vue, key, Module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_key,_module);
 //BA.debugLineNum = 102;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 103;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 104;BA.debugLine="btn.SetIconButton(iconName).SetTooltip(toolTip)";
_btn._seticonbutton /*b4j.example.vmbutton*/ (_iconname)._settooltip /*b4j.example.vmbutton*/ (_tooltip);
 //BA.debugLineNum = 105;BA.debugLine="btn.SetColor(iconColor)";
_btn._setcolor /*b4j.example.vmbutton*/ (_iconcolor);
 //BA.debugLineNum = 106;BA.debugLine="btn.SetSize(iconSize)";
_btn._setsize /*b4j.example.vmbutton*/ (_iconsize);
 //BA.debugLineNum = 107;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
 //BA.debugLineNum = 108;BA.debugLine="btn.SetHasBadge(True)";
_btn._sethasbadge /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 109;BA.debugLine="btn.SetBadge(badge)";
_btn._setbadge /*b4j.example.vmbutton*/ (_badge);
 };
 //BA.debugLineNum = 111;BA.debugLine="CardActions.SetText(btn.tostring)";
_cardactions._settext /*b4j.example.vmelement*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 112;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _addmenu(b4j.example.vmmenu _menu) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub AddMenu(menu As VMMenu) As VMCardActions";
 //BA.debugLineNum = 118;BA.debugLine="menu.Pop(CardActions)";
_menu._pop /*String*/ (_cardactions);
 //BA.debugLineNum = 119;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _addspacer() throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub AddSpacer As VMCardActions";
 //BA.debugLineNum = 124;BA.debugLine="CardActions.AddSpacer";
_cardactions._addspacer /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 125;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 225;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 226;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 276;BA.debugLine="CardActions.BuildModel(mprops, mstyles, lclasses,";
_cardactions._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public CardActions As VMElement";
_cardactions = new b4j.example.vmelement();
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
public b4j.example.vmcardactions  _disable() throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub Disable As VMCardActions";
 //BA.debugLineNum = 218;BA.debugLine="CardActions.Disable(True)";
_cardactions._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _enable() throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub Enable As VMCardActions";
 //BA.debugLineNum = 213;BA.debugLine="CardActions.Enable(True)";
_cardactions._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _hide() throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub Hide As VMCardActions";
 //BA.debugLineNum = 203;BA.debugLine="CardActions.SetVisible(False)";
_cardactions._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="CardActions.Initialize(v, ID)";
_cardactions._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 17;BA.debugLine="CardActions.SetTag(\"v-card-actions\")";
_cardactions._settag /*b4j.example.vmelement*/ ("v-card-actions");
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 21;BA.debugLine="HasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 173;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardactions  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="public Sub RemoveAttr(sName As String) As VMCardAc";
 //BA.debugLineNum = 232;BA.debugLine="CardActions.RemoveAttr(sName)";
_cardactions._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub Render";
 //BA.debugLineNum = 152;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardactions  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetAttr(attr As Map) As VMCardActions";
 //BA.debugLineNum = 184;BA.debugLine="CardActions.SetAttr(attr)";
_cardactions._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 56;BA.debugLine="Sub SetAttributes(attrs As List) As VMCardActions";
 //BA.debugLineNum = 57;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 58;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetAttrLoose(loose As String) As VMCardActions";
 //BA.debugLineNum = 52;BA.debugLine="CardActions.SetAttrLoose(loose)";
_cardactions._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 271;BA.debugLine="CardActions.SetAttrSingle(prop, value)";
_cardactions._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 304;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 305;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmcardactions)(this);};
 //BA.debugLineNum = 306;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 307;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 308;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 };
 //BA.debugLineNum = 311;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 312;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 313;BA.debugLine="CardActions.Bind(\":color\", pp)";
_cardactions._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 26;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMCardActions";
 //BA.debugLineNum = 248;BA.debugLine="CardActions.SetDesignMode(b)";
_cardactions._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 249;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub SetMarginAll(p As String) As VMCardActions";
 //BA.debugLineNum = 243;BA.debugLine="CardActions.setmarginall(p)";
_cardactions._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 260;BA.debugLine="CardActions.SetName(varName, bbind)";
_cardactions._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub SetPaddingAll(p As String) As VMCardActions";
 //BA.debugLineNum = 238;BA.debugLine="CardActions.SetPaddingAll(p)";
_cardactions._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setspacebetween() throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetSpaceBetween As VMCardActions";
 //BA.debugLineNum = 31;BA.debugLine="AddClass(\"justify-space-between\")";
_addclass("justify-space-between");
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetStatic(b As Boolean) As VMCardActions";
 //BA.debugLineNum = 46;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 47;BA.debugLine="CardActions.SetStatic(b)";
_cardactions._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub SetStyle(sm As Map) As VMCardActions";
 //BA.debugLineNum = 190;BA.debugLine="CardActions.SetStyle(sm)";
_cardactions._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 266;BA.debugLine="CardActions.SetStyleSingle(prop, value)";
_cardactions._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetTabIndex(ti As String) As VMCardActions";
 //BA.debugLineNum = 254;BA.debugLine="CardActions.SetTabIndex(ti)";
_cardactions._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _settext(String _t) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SetText(t As String) As VMCardActions";
 //BA.debugLineNum = 165;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmcardactions)(this);};
 //BA.debugLineNum = 166;BA.debugLine="CardActions.SetText(t)";
_cardactions._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 167;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 286;BA.debugLine="Sub SetTextColor(varColor As String) As VMCardActi";
 //BA.debugLineNum = 287;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 288;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _settextcolorintensity(String _textcolor,String _textintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 294;BA.debugLine="Sub SetTextColorIntensity(textcolor As String, tex";
 //BA.debugLineNum = 295;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmcardactions)(this);};
 //BA.debugLineNum = 296;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 297;BA.debugLine="Dim sIntensity As String = $\"text--${textintensit";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_textintensity))+"");
 //BA.debugLineNum = 298;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 299;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetVIf(vif As String) As VMCardActions";
 //BA.debugLineNum = 141;BA.debugLine="CardActions.SetVIf(vif)";
_cardactions._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub SetVisible(b As Boolean) As VMCardActions";
 //BA.debugLineNum = 281;BA.debugLine="CardActions.SetVisible(b)";
_cardactions._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetVModel(k As String) As VMCardActions";
 //BA.debugLineNum = 136;BA.debugLine="CardActions.SetVModel(k)";
_cardactions._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetVShow(vif As String) As VMCardActions";
 //BA.debugLineNum = 146;BA.debugLine="CardActions.SetVShow(vif)";
_cardactions._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _show() throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub Show As VMCardActions";
 //BA.debugLineNum = 208;BA.debugLine="CardActions.SetVisible(True)";
_cardactions._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 132;BA.debugLine="Return CardActions.ToString";
if (true) return _cardactions._tostring /*String*/ ();
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardactions  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 64;BA.debugLine="Sub UseTheme(themeName As String) As VMCardActions";
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
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
