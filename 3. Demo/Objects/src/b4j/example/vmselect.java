package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmselect extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmselect", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmselect.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _combo = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public String _vmodel = "";
public String _sitems = "";
public anywheresoftware.b4a.objects.collections.List _items = null;
public boolean _hasitems = false;
public boolean _haslistitems = false;
public boolean _marked = false;
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
public b4j.example.vmselect  _addbuttonafter(b4j.example.vmbutton _btn) throws Exception{
b4j.example.vmtemplate _appendouter = null;
 //BA.debugLineNum = 50;BA.debugLine="Sub AddButtonAfter(btn As VMButton) As VMSelect";
 //BA.debugLineNum = 51;BA.debugLine="Dim appendOuter As VMTemplate";
_appendouter = new b4j.example.vmtemplate();
 //BA.debugLineNum = 52;BA.debugLine="appendOuter.Initialize(vue, $\"${ID}menuafter\"$, M";
_appendouter._initialize /*b4j.example.vmtemplate*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"menuafter"),_module);
 //BA.debugLineNum = 53;BA.debugLine="appendOuter.SetAttrLoose(\"v-slot:append-outer\")";
_appendouter._setattrloose /*b4j.example.vmtemplate*/ ("v-slot:append-outer");
 //BA.debugLineNum = 54;BA.debugLine="appendOuter.AddComponent(btn.ToString)";
_appendouter._addcomponent /*b4j.example.vmtemplate*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 55;BA.debugLine="AddComponent(appendOuter.ToString)";
_addcomponent(_appendouter._tostring /*String*/ ());
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 416;BA.debugLine="Sub AddChild(child As VMElement) As VMSelect";
 //BA.debugLineNum = 417;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 418;BA.debugLine="Combo.SetText(childHTML)";
_combo._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 452;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 453;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 454;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 434;BA.debugLine="Sub AddClass(c As String) As VMSelect";
 //BA.debugLineNum = 435;BA.debugLine="Combo.AddClass(c)";
_combo._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 436;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub AddComponent(comp As String) As VMSelect";
 //BA.debugLineNum = 145;BA.debugLine="Combo.SetText(comp)";
_combo._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _additem(String _itemkey,String _itemvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nrec = null;
 //BA.debugLineNum = 207;BA.debugLine="Sub AddItem(itemkey As String, itemvalue As String";
 //BA.debugLineNum = 208;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 209;BA.debugLine="nrec.Put(\"value\", itemvalue)";
_nrec.Put((Object)("value"),(Object)(_itemvalue));
 //BA.debugLineNum = 210;BA.debugLine="nrec.Put(\"key\", itemkey)";
_nrec.Put((Object)("key"),(Object)(_itemkey));
 //BA.debugLineNum = 211;BA.debugLine="items.Add(nrec)";
_items.Add((Object)(_nrec.getObject()));
 //BA.debugLineNum = 212;BA.debugLine="hasItems = True";
_hasitems = __c.True;
 //BA.debugLineNum = 213;BA.debugLine="If marked = False Then";
if (_marked==__c.False) { 
 //BA.debugLineNum = 214;BA.debugLine="UsesKeyValue";
_useskeyvalue();
 //BA.debugLineNum = 215;BA.debugLine="marked = True";
_marked = __c.True;
 };
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _additems(anywheresoftware.b4a.objects.collections.List _xitems) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub AddItems(xitems As List) As VMSelect";
 //BA.debugLineNum = 151;BA.debugLine="vue.SetData(sitems, xitems)";
_vue._setdata /*b4j.example.bananovue*/ (_sitems,(Object)(_xitems.getObject()));
 //BA.debugLineNum = 152;BA.debugLine="SetItems(sitems)";
_setitems(_sitems);
 //BA.debugLineNum = 153;BA.debugLine="items = xitems";
_items = _xitems;
 //BA.debugLineNum = 154;BA.debugLine="hasItems = True";
_hasitems = __c.True;
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _addlistitem(String _key,String _avatar,String _iconname,String _iconcolor,String _title,String _subtitle,String _subtitle1) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nrec = null;
 //BA.debugLineNum = 237;BA.debugLine="Sub AddListItem(key As String, avatar As String, i";
 //BA.debugLineNum = 238;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 239;BA.debugLine="nrec.Put(\"key\", key)";
_nrec.Put((Object)("key"),(Object)(_key));
 //BA.debugLineNum = 240;BA.debugLine="nrec.Put(\"value\", title)";
_nrec.Put((Object)("value"),(Object)(_title));
 //BA.debugLineNum = 241;BA.debugLine="nrec.Put(\"avatar\", avatar)";
_nrec.Put((Object)("avatar"),(Object)(_avatar));
 //BA.debugLineNum = 242;BA.debugLine="nrec.Put(\"iconname\", iconName)";
_nrec.Put((Object)("iconname"),(Object)(_iconname));
 //BA.debugLineNum = 243;BA.debugLine="nrec.Put(\"iconcolor\", iconColor)";
_nrec.Put((Object)("iconcolor"),(Object)(_iconcolor));
 //BA.debugLineNum = 244;BA.debugLine="nrec.Put(\"title\", title)";
_nrec.Put((Object)("title"),(Object)(_title));
 //BA.debugLineNum = 245;BA.debugLine="nrec.Put(\"subtitle\", subtitle)";
_nrec.Put((Object)("subtitle"),(Object)(_subtitle));
 //BA.debugLineNum = 246;BA.debugLine="nrec.Put(\"subtitle1\", subtitle1)";
_nrec.Put((Object)("subtitle1"),(Object)(_subtitle1));
 //BA.debugLineNum = 247;BA.debugLine="items.Add(nrec)";
_items.Add((Object)(_nrec.getObject()));
 //BA.debugLineNum = 248;BA.debugLine="hasItems = True";
_hasitems = __c.True;
 //BA.debugLineNum = 249;BA.debugLine="hasListItems = True";
_haslistitems = __c.True;
 //BA.debugLineNum = 250;BA.debugLine="If marked = False Then";
if (_marked==__c.False) { 
 //BA.debugLineNum = 251;BA.debugLine="UsesListItems";
_useslistitems();
 //BA.debugLineNum = 252;BA.debugLine="marked = True";
_marked = __c.True;
 };
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _addmenuafter(b4j.example.vmmenu _menu) throws Exception{
b4j.example.vmtemplate _appendouter = null;
 //BA.debugLineNum = 40;BA.debugLine="Sub AddMenuAfter(menu As VMMenu) As VMSelect";
 //BA.debugLineNum = 41;BA.debugLine="Dim appendOuter As VMTemplate";
_appendouter = new b4j.example.vmtemplate();
 //BA.debugLineNum = 42;BA.debugLine="appendOuter.Initialize(vue, $\"${ID}menuafter\"$, M";
_appendouter._initialize /*b4j.example.vmtemplate*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"menuafter"),_module);
 //BA.debugLineNum = 43;BA.debugLine="appendOuter.SetAttrLoose(\"v-slot:append-outer\")";
_appendouter._setattrloose /*b4j.example.vmtemplate*/ ("v-slot:append-outer");
 //BA.debugLineNum = 44;BA.debugLine="appendOuter.AddComponent(menu.ToString)";
_appendouter._addcomponent /*b4j.example.vmtemplate*/ (_menu._tostring /*String*/ ());
 //BA.debugLineNum = 45;BA.debugLine="AddComponent(appendOuter.ToString)";
_addcomponent(_appendouter._tostring /*String*/ ());
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 1619;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 1620;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 1621;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 1567;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 1568;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 1569;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 1570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1571;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 1623;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 1624;BA.debugLine="Combo.BuildModel(mprops, mstyles, lclasses, loose";
_combo._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 1625;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1626;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Combo As VMElement";
_combo = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object   'ignore";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="Private vmodel As String";
_vmodel = "";
 //BA.debugLineNum = 11;BA.debugLine="Private sitems As String";
_sitems = "";
 //BA.debugLineNum = 12;BA.debugLine="Private items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 13;BA.debugLine="Private hasItems As Boolean";
_hasitems = false;
 //BA.debugLineNum = 14;BA.debugLine="Private hasListItems As Boolean";
_haslistitems = false;
 //BA.debugLineNum = 15;BA.debugLine="Private marked As Boolean";
_marked = false;
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _clear() throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub Clear As VMSelect";
 //BA.debugLineNum = 160;BA.debugLine="vue.SetData(sitems, vue.NewList)";
_vue._setdata /*b4j.example.bananovue*/ (_sitems,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 161;BA.debugLine="items.clear";
_items.Clear();
 //BA.debugLineNum = 162;BA.debugLine="hasItems = True";
_hasitems = __c.True;
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _disable() throws Exception{
 //BA.debugLineNum = 1560;BA.debugLine="Sub Disable As VMSelect";
 //BA.debugLineNum = 1561;BA.debugLine="Combo.Disable(True)";
_combo._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1562;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _enable() throws Exception{
 //BA.debugLineNum = 1555;BA.debugLine="Sub Enable As VMSelect";
 //BA.debugLineNum = 1556;BA.debugLine="Combo.Enable(True)";
_combo._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1557;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1558;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _hide() throws Exception{
 //BA.debugLineNum = 1545;BA.debugLine="Sub Hide As VMSelect";
 //BA.debugLineNum = 1546;BA.debugLine="Combo.SetVisible(False)";
_combo._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 1547;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1548;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 20;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 21;BA.debugLine="Combo.Initialize(v, ID)";
_combo._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 22;BA.debugLine="Combo.SetTag(\"v-select\")";
_combo._settag /*b4j.example.vmelement*/ ("v-select");
 //BA.debugLineNum = 23;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 24;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 25;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 26;BA.debugLine="Combo.typeOf = \"selectbox\"";
_combo._typeof /*String*/  = "selectbox";
 //BA.debugLineNum = 27;BA.debugLine="Combo.typeOf = \"select\"";
_combo._typeof /*String*/  = "select";
 //BA.debugLineNum = 28;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 29;BA.debugLine="vmodel = \"\"";
_vmodel = "";
 //BA.debugLineNum = 30;BA.debugLine="sitems = $\"${ID}items\"$";
_sitems = (""+__c.SmartStringFormatter("",(Object)(_id))+"items");
 //BA.debugLineNum = 31;BA.debugLine="items = vue.newlist";
_items = _vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 32;BA.debugLine="hasItems = False";
_hasitems = __c.False;
 //BA.debugLineNum = 33;BA.debugLine="hasListItems = False";
_haslistitems = __c.False;
 //BA.debugLineNum = 34;BA.debugLine="marked = False";
_marked = __c.False;
 //BA.debugLineNum = 35;BA.debugLine="SetOnChange(Module, $\"${ID}_change\"$)";
_setonchange(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_change"));
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 429;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 430;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 1574;BA.debugLine="public Sub RemoveAttr(sName As String) As VMSelect";
 //BA.debugLineNum = 1575;BA.debugLine="Combo.RemoveAttr(sName)";
_combo._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 1576;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1577;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Sub Render";
 //BA.debugLineNum = 412;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _setallowoverflow(boolean _varallowoverflow) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1652;BA.debugLine="Sub SetAllowOverflow(varAllowOverflow As Boolean)";
 //BA.debugLineNum = 1653;BA.debugLine="If varAllowOverflow = False Then Return Me";
if (_varallowoverflow==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1654;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1655;BA.debugLine="SetAttrSingle(\"allow-overflow\", varAllowOverflow";
_setattrsingle("allow-overflow",BA.ObjectToString(_varallowoverflow));
 //BA.debugLineNum = 1656;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 };
 //BA.debugLineNum = 1658;BA.debugLine="Dim pp As String = $\"${ID}AllowOverflow\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AllowOverflow");
 //BA.debugLineNum = 1659;BA.debugLine="vue.SetStateSingle(pp, varAllowOverflow)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varallowoverflow));
 //BA.debugLineNum = 1660;BA.debugLine="Combo.Bind(\":allow-overflow\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":allow-overflow",_pp);
 //BA.debugLineNum = 1661;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1662;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setappendicon(String _varappendicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 459;BA.debugLine="Sub SetAppendIcon(varAppendIcon As String) As VMSe";
 //BA.debugLineNum = 460;BA.debugLine="If varAppendIcon = \"\" Then Return Me";
if ((_varappendicon).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 461;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 462;BA.debugLine="SetAttrSingle(\"append-icon\", varAppendIcon)";
_setattrsingle("append-icon",_varappendicon);
 }else {
 //BA.debugLineNum = 464;BA.debugLine="Dim pp As String = $\"${ID}AppendIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AppendIcon");
 //BA.debugLineNum = 465;BA.debugLine="vue.SetStateSingle(pp, varAppendIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varappendicon));
 //BA.debugLineNum = 466;BA.debugLine="Combo.Bind(\":append-icon\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":append-icon",_pp);
 };
 //BA.debugLineNum = 468;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setappendoutericon(String _varappendoutericon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 472;BA.debugLine="Sub SetAppendOuterIcon(varAppendOuterIcon As Strin";
 //BA.debugLineNum = 473;BA.debugLine="If varAppendOuterIcon = \"\" Then Return Me";
if ((_varappendoutericon).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 474;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 475;BA.debugLine="SetAttrSingle(\"append-outer-icon\", varAppendOute";
_setattrsingle("append-outer-icon",_varappendoutericon);
 }else {
 //BA.debugLineNum = 477;BA.debugLine="Dim pp As String = $\"${ID}AppendOuterIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AppendOuterIcon");
 //BA.debugLineNum = 478;BA.debugLine="vue.SetStateSingle(pp, varAppendOuterIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varappendoutericon));
 //BA.debugLineNum = 479;BA.debugLine="Combo.Bind(\":append-outer-icon\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":append-outer-icon",_pp);
 };
 //BA.debugLineNum = 481;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 482;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setattach(String _varattach) throws Exception{
String _pp = "";
 //BA.debugLineNum = 485;BA.debugLine="Sub SetAttach(varAttach As String) As VMSelect";
 //BA.debugLineNum = 486;BA.debugLine="If varAttach = \"\" Then Return Me";
if ((_varattach).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 487;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 488;BA.debugLine="SetAttrSingle(\"attach\", varAttach)";
_setattrsingle("attach",_varattach);
 }else {
 //BA.debugLineNum = 490;BA.debugLine="Dim pp As String = $\"${ID}Attach\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Attach");
 //BA.debugLineNum = 491;BA.debugLine="vue.SetStateSingle(pp, varAttach)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varattach));
 //BA.debugLineNum = 492;BA.debugLine="Combo.Bind(\":attach\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":attach",_pp);
 };
 //BA.debugLineNum = 494;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 440;BA.debugLine="Sub SetAttr(attr As Map) As VMSelect";
 //BA.debugLineNum = 441;BA.debugLine="Combo.SetAttr(attr)";
_combo._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 137;BA.debugLine="Sub SetAttributes(attrs As List) As VMSelect";
 //BA.debugLineNum = 138;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 139;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetAttrLoose(loose As String) As VMSelect";
 //BA.debugLineNum = 133;BA.debugLine="Combo.SetAttrLoose(loose)";
_combo._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1613;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 1614;BA.debugLine="Combo.SetAttrSingle(prop, value)";
_combo._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 1615;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1616;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setautocomplete() throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetAutoComplete As VMSelect";
 //BA.debugLineNum = 78;BA.debugLine="Combo.SetTag(\"v-autocomplete\")";
_combo._settag /*b4j.example.vmelement*/ ("v-autocomplete");
 //BA.debugLineNum = 79;BA.debugLine="Combo.typeOf = \"auto\"";
_combo._typeof /*String*/  = "auto";
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setautofocus(boolean _varautofocus) throws Exception{
String _pp = "";
 //BA.debugLineNum = 498;BA.debugLine="Sub SetAutofocus(varAutofocus As Boolean) As VMSel";
 //BA.debugLineNum = 499;BA.debugLine="If varAutofocus = False Then Return Me";
if (_varautofocus==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 500;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 501;BA.debugLine="SetAttrSingle(\"autofocus\", varAutofocus)";
_setattrsingle("autofocus",BA.ObjectToString(_varautofocus));
 }else {
 //BA.debugLineNum = 503;BA.debugLine="Dim pp As String = $\"${ID}Autofocus\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Autofocus");
 //BA.debugLineNum = 504;BA.debugLine="vue.SetStateSingle(pp, varAutofocus)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varautofocus));
 //BA.debugLineNum = 505;BA.debugLine="Combo.Bind(\":autofocus\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":autofocus",_pp);
 };
 //BA.debugLineNum = 507;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 508;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setautoselectfirst(boolean _varautoselectfirst) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1665;BA.debugLine="Sub SetAutoSelectFirst(varAutoSelectFirst As Boole";
 //BA.debugLineNum = 1666;BA.debugLine="If varAutoSelectFirst = False Then Return Me";
if (_varautoselectfirst==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1667;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1668;BA.debugLine="SetAttrSingle(\"auto-select-first\", varAutoSelect";
_setattrsingle("auto-select-first",BA.ObjectToString(_varautoselectfirst));
 //BA.debugLineNum = 1669;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 };
 //BA.debugLineNum = 1671;BA.debugLine="Dim pp As String = $\"${ID}AutoSelectFirst\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AutoSelectFirst");
 //BA.debugLineNum = 1672;BA.debugLine="vue.SetStateSingle(pp, varAutoSelectFirst)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varautoselectfirst));
 //BA.debugLineNum = 1673;BA.debugLine="Combo.Bind(\":auto-select-first\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":auto-select-first",_pp);
 //BA.debugLineNum = 1674;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1675;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setbackgroundcolor(String _varbackgroundcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 511;BA.debugLine="Sub SetBackgroundColor(varBackgroundColor As Strin";
 //BA.debugLineNum = 512;BA.debugLine="If varBackgroundColor = \"\" Then Return Me";
if ((_varbackgroundcolor).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 513;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 514;BA.debugLine="SetAttrSingle(\"background-color\", varBackgroundC";
_setattrsingle("background-color",_varbackgroundcolor);
 }else {
 //BA.debugLineNum = 516;BA.debugLine="Dim pp As String = $\"${ID}BackgroundColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BackgroundColor");
 //BA.debugLineNum = 517;BA.debugLine="vue.SetStateSingle(pp, varBackgroundColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbackgroundcolor));
 //BA.debugLineNum = 518;BA.debugLine="Combo.Bind(\":background-color\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 };
 //BA.debugLineNum = 520;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 521;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setcacheitems(boolean _varcacheitems) throws Exception{
String _pp = "";
 //BA.debugLineNum = 524;BA.debugLine="Sub SetCacheItems(varCacheItems As Boolean) As VMS";
 //BA.debugLineNum = 525;BA.debugLine="If varCacheItems = False Then Return Me";
if (_varcacheitems==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 526;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 527;BA.debugLine="SetAttrSingle(\"cache-items\", varCacheItems)";
_setattrsingle("cache-items",BA.ObjectToString(_varcacheitems));
 }else {
 //BA.debugLineNum = 529;BA.debugLine="Dim pp As String = $\"${ID}CacheItems\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CacheItems");
 //BA.debugLineNum = 530;BA.debugLine="vue.SetStateSingle(pp, varCacheItems)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcacheitems));
 //BA.debugLineNum = 531;BA.debugLine="Combo.Bind(\":cache-items\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":cache-items",_pp);
 };
 //BA.debugLineNum = 533;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 534;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setchips(boolean _varchips) throws Exception{
String _pp = "";
 //BA.debugLineNum = 537;BA.debugLine="Sub SetChips(varChips As Boolean) As VMSelect";
 //BA.debugLineNum = 538;BA.debugLine="If varChips = False Then Return Me";
if (_varchips==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 539;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 540;BA.debugLine="SetAttrSingle(\"chips\", varChips)";
_setattrsingle("chips",BA.ObjectToString(_varchips));
 }else {
 //BA.debugLineNum = 542;BA.debugLine="Dim pp As String = $\"${ID}Chips\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Chips");
 //BA.debugLineNum = 543;BA.debugLine="vue.SetStateSingle(pp, varChips)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varchips));
 //BA.debugLineNum = 544;BA.debugLine="Combo.Bind(\":chips\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":chips",_pp);
 };
 //BA.debugLineNum = 546;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 547;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setclearable(boolean _varclearable) throws Exception{
String _pp = "";
 //BA.debugLineNum = 563;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMSel";
 //BA.debugLineNum = 564;BA.debugLine="If varClearable = False Then Return Me";
if (_varclearable==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 565;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 566;BA.debugLine="SetAttrSingle(\"clearable\", varClearable)";
_setattrsingle("clearable",BA.ObjectToString(_varclearable));
 }else {
 //BA.debugLineNum = 568;BA.debugLine="Dim pp As String = $\"${ID}Clearable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Clearable");
 //BA.debugLineNum = 569;BA.debugLine="vue.SetStateSingle(pp, varClearable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varclearable));
 //BA.debugLineNum = 570;BA.debugLine="Combo.Bind(\":clearable\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":clearable",_pp);
 };
 //BA.debugLineNum = 572;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 573;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setclearicon(String _varclearicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 550;BA.debugLine="Sub SetClearIcon(varClearIcon As String) As VMSele";
 //BA.debugLineNum = 551;BA.debugLine="If varClearIcon = \"\" Then Return Me";
if ((_varclearicon).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 552;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 553;BA.debugLine="SetAttrSingle(\"clear-icon\", varClearIcon)";
_setattrsingle("clear-icon",_varclearicon);
 }else {
 //BA.debugLineNum = 555;BA.debugLine="Dim pp As String = $\"${ID}ClearIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ClearIcon");
 //BA.debugLineNum = 556;BA.debugLine="vue.SetStateSingle(pp, varClearIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varclearicon));
 //BA.debugLineNum = 557;BA.debugLine="Combo.Bind(\":clear-icon\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":clear-icon",_pp);
 };
 //BA.debugLineNum = 559;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 560;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 576;BA.debugLine="Sub SetColor(varColor As String) As VMSelect";
 //BA.debugLineNum = 577;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 578;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 579;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 }else {
 //BA.debugLineNum = 581;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 582;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 583;BA.debugLine="Combo.Bind(\":color\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":color",_pp);
 };
 //BA.debugLineNum = 585;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 586;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 381;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 382;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 383;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 384;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 385;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 }else {
 //BA.debugLineNum = 387;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 388;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 389;BA.debugLine="Combo.Bind(\":color\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":color",_pp);
 };
 //BA.debugLineNum = 391;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setcombobox() throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetComboBox As VMSelect";
 //BA.debugLineNum = 85;BA.debugLine="Combo.SetTag(\"v-combobox\")";
_combo._settag /*b4j.example.vmelement*/ ("v-combobox");
 //BA.debugLineNum = 86;BA.debugLine="Combo.typeOf = \"combo\"";
_combo._typeof /*String*/  = "combo";
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setcounter(boolean _varcounter) throws Exception{
String _pp = "";
 //BA.debugLineNum = 589;BA.debugLine="Sub SetCounter(varCounter As Boolean) As VMSelect";
 //BA.debugLineNum = 590;BA.debugLine="If varCounter = False Then Return Me";
if (_varcounter==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 591;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 592;BA.debugLine="SetAttrSingle(\"counter\", varCounter)";
_setattrsingle("counter",BA.ObjectToString(_varcounter));
 }else {
 //BA.debugLineNum = 594;BA.debugLine="Dim pp As String = $\"${ID}Counter\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Counter");
 //BA.debugLineNum = 595;BA.debugLine="vue.SetStateSingle(pp, varCounter)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcounter));
 //BA.debugLineNum = 596;BA.debugLine="Combo.Bind(\":counter\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":counter",_pp);
 };
 //BA.debugLineNum = 598;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 599;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setcountervalue(String _varcountervalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 602;BA.debugLine="Sub SetCounterValue(varCounterValue As String) As";
 //BA.debugLineNum = 603;BA.debugLine="If varCounterValue = \"\" Then Return Me";
if ((_varcountervalue).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 604;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 605;BA.debugLine="SetAttrSingle(\"counter-value\", varCounterValue)";
_setattrsingle("counter-value",_varcountervalue);
 }else {
 //BA.debugLineNum = 607;BA.debugLine="Dim pp As String = $\"${ID}CounterValue\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CounterValue");
 //BA.debugLineNum = 608;BA.debugLine="vue.SetStateSingle(pp, varCounterValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcountervalue));
 //BA.debugLineNum = 609;BA.debugLine="Combo.Bind(\":counter-value\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":counter-value",_pp);
 };
 //BA.debugLineNum = 611;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 612;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 615;BA.debugLine="Sub SetDark(varDark As Boolean) As VMSelect";
 //BA.debugLineNum = 616;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 617;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 618;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 }else {
 //BA.debugLineNum = 620;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 621;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 622;BA.debugLine="Combo.Bind(\":dark\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":dark",_pp);
 };
 //BA.debugLineNum = 624;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 625;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 60;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setdatasource(String _sourcename,String _sourcefield,String _displayfield,boolean _returnobject) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetDataSource(sourceName As String, sourceFiel";
 //BA.debugLineNum = 168;BA.debugLine="sourceName = sourceName.tolowercase";
_sourcename = _sourcename.toLowerCase();
 //BA.debugLineNum = 169;BA.debugLine="sourceField = sourceField.ToLowerCase";
_sourcefield = _sourcefield.toLowerCase();
 //BA.debugLineNum = 170;BA.debugLine="displayField = displayField.ToLowerCase";
_displayfield = _displayfield.toLowerCase();
 //BA.debugLineNum = 171;BA.debugLine="SetItems(sourceName)";
_setitems(_sourcename);
 //BA.debugLineNum = 172;BA.debugLine="SetItemText(displayField)";
_setitemtext(_displayfield);
 //BA.debugLineNum = 173;BA.debugLine="SetItemValue(sourceField)";
_setitemvalue(_sourcefield);
 //BA.debugLineNum = 174;BA.debugLine="SetReturnObject(returnObject)";
_setreturnobject(_returnobject);
 //BA.debugLineNum = 175;BA.debugLine="If vue.StateExists(sourceName) = False Then";
if (_vue._stateexists /*boolean*/ (_sourcename)==__c.False) { 
 //BA.debugLineNum = 176;BA.debugLine="vue.SetData(sourceName, vue.newlist)";
_vue._setdata /*b4j.example.bananovue*/ (_sourcename,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 };
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setdeletablechips(boolean _vardeletablechips) throws Exception{
String _pp = "";
 //BA.debugLineNum = 628;BA.debugLine="Sub SetDeletableChips(varDeletableChips As Boolean";
 //BA.debugLineNum = 629;BA.debugLine="If varDeletableChips = False Then Return Me";
if (_vardeletablechips==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 630;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 631;BA.debugLine="SetAttrSingle(\"deletable-chips\", varDeletableChi";
_setattrsingle("deletable-chips",BA.ObjectToString(_vardeletablechips));
 }else {
 //BA.debugLineNum = 633;BA.debugLine="Dim pp As String = $\"${ID}DeletableChips\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DeletableChips");
 //BA.debugLineNum = 634;BA.debugLine="vue.SetStateSingle(pp, varDeletableChips)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardeletablechips));
 //BA.debugLineNum = 635;BA.debugLine="Combo.Bind(\":deletable-chips\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":deletable-chips",_pp);
 };
 //BA.debugLineNum = 637;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 638;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setdense(boolean _vardense) throws Exception{
String _pp = "";
 //BA.debugLineNum = 641;BA.debugLine="Sub SetDense(varDense As Boolean) As VMSelect";
 //BA.debugLineNum = 642;BA.debugLine="If varDense = False Then Return Me";
if (_vardense==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 643;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 644;BA.debugLine="SetAttrSingle(\"dense\", varDense)";
_setattrsingle("dense",BA.ObjectToString(_vardense));
 }else {
 //BA.debugLineNum = 646;BA.debugLine="Dim pp As String = $\"${ID}Dense\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dense");
 //BA.debugLineNum = 647;BA.debugLine="vue.SetStateSingle(pp, varDense)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardense));
 //BA.debugLineNum = 648;BA.debugLine="Combo.Bind(\":dense\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":dense",_pp);
 };
 //BA.debugLineNum = 650;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 651;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 1590;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMSelect";
 //BA.debugLineNum = 1591;BA.debugLine="Combo.SetDesignMode(b)";
_combo._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 1592;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 1593;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1594;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 115;BA.debugLine="Combo.SetDeviceOffsets(OS, OM, OL, OX)";
_combo._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 127;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 128;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 121;BA.debugLine="Combo.SetDeviceSizes(SS, SM, SL, SX)";
_combo._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 667;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMSelec";
 //BA.debugLineNum = 668;BA.debugLine="Combo.SetDisabled(varDisabled)";
_combo._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 669;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 670;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setdisablelookup(boolean _vardisablelookup) throws Exception{
String _pp = "";
 //BA.debugLineNum = 654;BA.debugLine="Sub SetDisableLookup(varDisableLookup As Boolean)";
 //BA.debugLineNum = 655;BA.debugLine="If varDisableLookup = False Then Return Me";
if (_vardisablelookup==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 656;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 657;BA.debugLine="SetAttrSingle(\"disable-lookup\", varDisableLookup";
_setattrsingle("disable-lookup",BA.ObjectToString(_vardisablelookup));
 }else {
 //BA.debugLineNum = 659;BA.debugLine="Dim pp As String = $\"${ID}DisableLookup\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DisableLookup");
 //BA.debugLineNum = 660;BA.debugLine="vue.SetStateSingle(pp, varDisableLookup)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisablelookup));
 //BA.debugLineNum = 661;BA.debugLine="Combo.Bind(\":disable-lookup\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":disable-lookup",_pp);
 };
 //BA.debugLineNum = 663;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 664;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _seteager(boolean _vareager) throws Exception{
String _pp = "";
 //BA.debugLineNum = 673;BA.debugLine="Sub SetEager(varEager As Boolean) As VMSelect";
 //BA.debugLineNum = 674;BA.debugLine="If varEager = False Then Return Me";
if (_vareager==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 675;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 676;BA.debugLine="SetAttrSingle(\"eager\", varEager)";
_setattrsingle("eager",BA.ObjectToString(_vareager));
 }else {
 //BA.debugLineNum = 678;BA.debugLine="Dim pp As String = $\"${ID}Eager\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Eager");
 //BA.debugLineNum = 679;BA.debugLine="vue.SetStateSingle(pp, varEager)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareager));
 //BA.debugLineNum = 680;BA.debugLine="Combo.Bind(\":eager\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":eager",_pp);
 };
 //BA.debugLineNum = 682;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 683;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _seterror(boolean _varerror) throws Exception{
String _pp = "";
 //BA.debugLineNum = 686;BA.debugLine="Sub SetError(varError As Boolean) As VMSelect";
 //BA.debugLineNum = 687;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 688;BA.debugLine="SetAttrSingle(\"error\", varError)";
_setattrsingle("error",BA.ObjectToString(_varerror));
 //BA.debugLineNum = 689;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 };
 //BA.debugLineNum = 691;BA.debugLine="Dim pp As String = $\"${vmodel}Error\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"Error");
 //BA.debugLineNum = 692;BA.debugLine="vue.SetStateSingle(pp, varError)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varerror));
 //BA.debugLineNum = 693;BA.debugLine="Combo.Bind(\":error\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":error",_pp);
 //BA.debugLineNum = 694;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 695;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _seterrorcount(String _varerrorcount) throws Exception{
String _pp = "";
 //BA.debugLineNum = 698;BA.debugLine="Sub SetErrorCount(varErrorCount As String) As VMSe";
 //BA.debugLineNum = 699;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 700;BA.debugLine="SetAttrSingle(\"error-count\", varErrorCount)";
_setattrsingle("error-count",_varerrorcount);
 //BA.debugLineNum = 701;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 };
 //BA.debugLineNum = 703;BA.debugLine="Dim pp As String = $\"${vmodel}ErrorCount\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"ErrorCount");
 //BA.debugLineNum = 704;BA.debugLine="vue.SetStateSingle(pp, varErrorCount)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varerrorcount));
 //BA.debugLineNum = 705;BA.debugLine="Combo.Bind(\":error-count\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":error-count",_pp);
 //BA.debugLineNum = 706;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 707;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _seterrormessages(boolean _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _pp = "";
 //BA.debugLineNum = 710;BA.debugLine="Sub SetErrorMessages(b As Boolean) As VMSelect";
 //BA.debugLineNum = 711;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 712;BA.debugLine="Dim nl As List = vue.NewList";
_nl = new anywheresoftware.b4a.objects.collections.List();
_nl = _vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 713;BA.debugLine="Dim pp As String = $\"${vmodel}ErrorMessages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"ErrorMessages");
 //BA.debugLineNum = 714;BA.debugLine="vue.SetData(pp, nl)";
_vue._setdata /*b4j.example.bananovue*/ (_pp,(Object)(_nl.getObject()));
 //BA.debugLineNum = 715;BA.debugLine="Combo.Bind(\":error-messages\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":error-messages",_pp);
 //BA.debugLineNum = 716;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 717;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setfieldtype(String _ft) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetFieldType(ft As String) As VMSelect";
 //BA.debugLineNum = 72;BA.debugLine="Combo.fieldType = ft";
_combo._fieldtype /*String*/  = _ft;
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setfilled(boolean _varfilled) throws Exception{
String _pp = "";
 //BA.debugLineNum = 720;BA.debugLine="Sub SetFilled(varFilled As Boolean) As VMSelect";
 //BA.debugLineNum = 721;BA.debugLine="If varFilled = False Then Return Me";
if (_varfilled==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 722;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 723;BA.debugLine="SetAttrSingle(\"filled\", varFilled)";
_setattrsingle("filled",BA.ObjectToString(_varfilled));
 }else {
 //BA.debugLineNum = 725;BA.debugLine="Dim pp As String = $\"${ID}Filled\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Filled");
 //BA.debugLineNum = 726;BA.debugLine="vue.SetStateSingle(pp, varFilled)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfilled));
 //BA.debugLineNum = 727;BA.debugLine="Combo.Bind(\":filled\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":filled",_pp);
 };
 //BA.debugLineNum = 729;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 730;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setfilter(Object _varfilter) throws Exception{
 //BA.debugLineNum = 733;BA.debugLine="Sub SetFilter(varFilter As Object) As VMSelect";
 //BA.debugLineNum = 734;BA.debugLine="SetAttrSingle(\"filter\", varFilter)";
_setattrsingle("filter",BA.ObjectToString(_varfilter));
 //BA.debugLineNum = 735;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 736;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setflat(boolean _varflat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 739;BA.debugLine="Sub SetFlat(varFlat As Boolean) As VMSelect";
 //BA.debugLineNum = 740;BA.debugLine="If varFlat = False Then Return Me";
if (_varflat==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 741;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 742;BA.debugLine="SetAttrSingle(\"flat\", varFlat)";
_setattrsingle("flat",BA.ObjectToString(_varflat));
 }else {
 //BA.debugLineNum = 744;BA.debugLine="Dim pp As String = $\"${ID}Flat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Flat");
 //BA.debugLineNum = 745;BA.debugLine="vue.SetStateSingle(pp, varFlat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varflat));
 //BA.debugLineNum = 746;BA.debugLine="Combo.Bind(\":flat\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":flat",_pp);
 };
 //BA.debugLineNum = 748;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 749;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setfullwidth(boolean _varfullwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 752;BA.debugLine="Sub SetFullWidth(varFullWidth As Boolean) As VMSel";
 //BA.debugLineNum = 753;BA.debugLine="If varFullWidth = False Then Return Me";
if (_varfullwidth==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 754;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 755;BA.debugLine="SetAttrSingle(\"full-width\", varFullWidth)";
_setattrsingle("full-width",BA.ObjectToString(_varfullwidth));
 }else {
 //BA.debugLineNum = 757;BA.debugLine="Dim pp As String = $\"${ID}FullWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"FullWidth");
 //BA.debugLineNum = 758;BA.debugLine="vue.SetStateSingle(pp, varFullWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfullwidth));
 //BA.debugLineNum = 759;BA.debugLine="Combo.Bind(\":full-width\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":full-width",_pp);
 };
 //BA.debugLineNum = 761;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 762;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 765;BA.debugLine="Sub SetHeight(varHeight As String) As VMSelect";
 //BA.debugLineNum = 766;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 767;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 768;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 }else {
 //BA.debugLineNum = 770;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 771;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 772;BA.debugLine="Combo.Bind(\":height\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":height",_pp);
 };
 //BA.debugLineNum = 774;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 775;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _sethidedetails(boolean _varhidedetails) throws Exception{
String _pp = "";
 //BA.debugLineNum = 778;BA.debugLine="Sub SetHideDetails(varHideDetails As Boolean) As V";
 //BA.debugLineNum = 779;BA.debugLine="If varHideDetails = False Then Return Me";
if (_varhidedetails==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 780;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 781;BA.debugLine="SetAttrSingle(\"hide-details\", varHideDetails)";
_setattrsingle("hide-details",BA.ObjectToString(_varhidedetails));
 }else {
 //BA.debugLineNum = 783;BA.debugLine="Dim pp As String = $\"${ID}HideDetails\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideDetails");
 //BA.debugLineNum = 784;BA.debugLine="vue.SetStateSingle(pp, varHideDetails)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhidedetails));
 //BA.debugLineNum = 785;BA.debugLine="Combo.Bind(\":hide-details\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":hide-details",_pp);
 };
 //BA.debugLineNum = 787;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 788;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _sethidenodata(boolean _varhidenodata) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1679;BA.debugLine="Sub SetHideNoData(varHideNoData As Boolean) As VMS";
 //BA.debugLineNum = 1680;BA.debugLine="If varHideNoData = False Then Return Me";
if (_varhidenodata==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1681;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1682;BA.debugLine="SetAttrSingle(\"hide-no-data\", varHideNoData)";
_setattrsingle("hide-no-data",BA.ObjectToString(_varhidenodata));
 //BA.debugLineNum = 1683;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 };
 //BA.debugLineNum = 1685;BA.debugLine="Dim pp As String = $\"${ID}HideNoData\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideNoData");
 //BA.debugLineNum = 1686;BA.debugLine="vue.SetStateSingle(pp, varHideNoData)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhidenodata));
 //BA.debugLineNum = 1687;BA.debugLine="Combo.Bind(\":hide-no-data\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":hide-no-data",_pp);
 //BA.debugLineNum = 1688;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1689;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _sethideselected(boolean _varhideselected) throws Exception{
String _pp = "";
 //BA.debugLineNum = 791;BA.debugLine="Sub SetHideSelected(varHideSelected As Boolean) As";
 //BA.debugLineNum = 792;BA.debugLine="If varHideSelected = False Then Return Me";
if (_varhideselected==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 793;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 794;BA.debugLine="SetAttrSingle(\"hide-selected\", varHideSelected)";
_setattrsingle("hide-selected",BA.ObjectToString(_varhideselected));
 }else {
 //BA.debugLineNum = 796;BA.debugLine="Dim pp As String = $\"${ID}HideSelected\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideSelected");
 //BA.debugLineNum = 797;BA.debugLine="vue.SetStateSingle(pp, varHideSelected)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhideselected));
 //BA.debugLineNum = 798;BA.debugLine="Combo.Bind(\":hide-selected\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":hide-selected",_pp);
 };
 //BA.debugLineNum = 800;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 801;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _sethint(String _varhint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 804;BA.debugLine="Sub SetHint(varHint As String) As VMSelect";
 //BA.debugLineNum = 805;BA.debugLine="If varHint = \"\" Then Return Me";
if ((_varhint).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 806;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 807;BA.debugLine="SetAttrSingle(\"hint\", varHint)";
_setattrsingle("hint",_varhint);
 }else {
 //BA.debugLineNum = 809;BA.debugLine="Dim pp As String = $\"${ID}Hint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Hint");
 //BA.debugLineNum = 810;BA.debugLine="vue.SetStateSingle(pp, varHint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhint));
 //BA.debugLineNum = 811;BA.debugLine="Combo.Bind(\":hint\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":hint",_pp);
 };
 //BA.debugLineNum = 813;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 814;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setid(Object _varid) throws Exception{
String _pp = "";
 //BA.debugLineNum = 817;BA.debugLine="Sub SetId(varId As Object) As VMSelect";
 //BA.debugLineNum = 818;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 819;BA.debugLine="SetAttrSingle(\"id\", varId)";
_setattrsingle("id",BA.ObjectToString(_varid));
 }else {
 //BA.debugLineNum = 821;BA.debugLine="Dim pp As String = $\"${ID}Id\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Id");
 //BA.debugLineNum = 822;BA.debugLine="vue.SetStateSingle(pp, varId)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varid);
 //BA.debugLineNum = 823;BA.debugLine="Combo.Bind(\":id\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":id",_pp);
 };
 //BA.debugLineNum = 825;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 826;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setint() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetInt As VMSelect";
 //BA.debugLineNum = 103;BA.debugLine="Combo.fieldType = \"int\"";
_combo._fieldtype /*String*/  = "int";
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setitemcolor(String _varitemcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 829;BA.debugLine="Sub SetItemColor(varItemColor As String) As VMSele";
 //BA.debugLineNum = 830;BA.debugLine="If varItemColor = \"\" Then Return Me";
if ((_varitemcolor).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 831;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 832;BA.debugLine="SetAttrSingle(\"item-color\", varItemColor)";
_setattrsingle("item-color",_varitemcolor);
 }else {
 //BA.debugLineNum = 834;BA.debugLine="Dim pp As String = $\"${ID}ItemColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ItemColor");
 //BA.debugLineNum = 835;BA.debugLine="vue.SetStateSingle(pp, varItemColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varitemcolor));
 //BA.debugLineNum = 836;BA.debugLine="Combo.Bind(\":item-color\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":item-color",_pp);
 };
 //BA.debugLineNum = 838;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 839;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setitemdisabled(boolean _varitemdisabled) throws Exception{
String _pp = "";
 //BA.debugLineNum = 842;BA.debugLine="Sub SetItemDisabled(varItemDisabled As Boolean) As";
 //BA.debugLineNum = 843;BA.debugLine="If varItemDisabled = False Then Return Me";
if (_varitemdisabled==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 844;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 845;BA.debugLine="SetAttrSingle(\"item-disabled\", varItemDisabled)";
_setattrsingle("item-disabled",BA.ObjectToString(_varitemdisabled));
 }else {
 //BA.debugLineNum = 847;BA.debugLine="Dim pp As String = $\"${ID}ItemDisabled\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ItemDisabled");
 //BA.debugLineNum = 848;BA.debugLine="vue.SetStateSingle(pp, varItemDisabled)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varitemdisabled));
 //BA.debugLineNum = 849;BA.debugLine="Combo.Bind(\":item-disabled\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":item-disabled",_pp);
 };
 //BA.debugLineNum = 851;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 852;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setitems(String _varitems) throws Exception{
 //BA.debugLineNum = 869;BA.debugLine="Sub SetItems(varItems As String) As VMSelect";
 //BA.debugLineNum = 870;BA.debugLine="If varItems = \"\" Then Return Me";
if ((_varitems).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 871;BA.debugLine="varItems = varItems.tolowercase";
_varitems = _varitems.toLowerCase();
 //BA.debugLineNum = 872;BA.debugLine="Combo.SetAttrsingle(\":items\", varItems)";
_combo._setattrsingle /*b4j.example.vmelement*/ (":items",_varitems);
 //BA.debugLineNum = 873;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 874;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setitemtext(String _varitemtext) throws Exception{
 //BA.debugLineNum = 855;BA.debugLine="Sub SetItemText(varItemText As String) As VMSelect";
 //BA.debugLineNum = 856;BA.debugLine="If varItemText = \"\" Then Return Me";
if ((_varitemtext).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 857;BA.debugLine="SetAttrSingle(\"item-text\", varItemText)";
_setattrsingle("item-text",_varitemtext);
 //BA.debugLineNum = 858;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 859;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setitemvalue(String _varitemvalue) throws Exception{
 //BA.debugLineNum = 862;BA.debugLine="Sub SetItemValue(varItemValue As String) As VMSele";
 //BA.debugLineNum = 863;BA.debugLine="If varItemValue = \"\" Then Return Me";
if ((_varitemvalue).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 864;BA.debugLine="SetAttrSingle(\"item-value\", varItemValue)";
_setattrsingle("item-value",_varitemvalue);
 //BA.debugLineNum = 865;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 866;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setlabel(String _varlabel) throws Exception{
String _pp = "";
 //BA.debugLineNum = 877;BA.debugLine="Sub SetLabel(varLabel As String) As VMSelect";
 //BA.debugLineNum = 878;BA.debugLine="If varLabel = \"\" Then Return Me";
if ((_varlabel).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 879;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 880;BA.debugLine="SetAttrSingle(\"label\", varLabel)";
_setattrsingle("label",_varlabel);
 }else {
 //BA.debugLineNum = 882;BA.debugLine="Dim pp As String = $\"${ID}Label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Label");
 //BA.debugLineNum = 883;BA.debugLine="vue.SetStateSingle(pp, varLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlabel));
 //BA.debugLineNum = 884;BA.debugLine="Combo.Bind(\":label\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":label",_pp);
 };
 //BA.debugLineNum = 886;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 887;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 890;BA.debugLine="Sub SetLight(varLight As Boolean) As VMSelect";
 //BA.debugLineNum = 891;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 892;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 893;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 }else {
 //BA.debugLineNum = 895;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 896;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 897;BA.debugLine="Combo.Bind(\":light\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":light",_pp);
 };
 //BA.debugLineNum = 899;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 900;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setlistitems() throws Exception{
b4j.example.vmtemplate _tmp = null;
b4j.example.vmlistitem _vli = null;
b4j.example.vmlistitemavatar _lia = null;
b4j.example.vmimage _img = null;
b4j.example.vmlistitemicon _vlii = null;
b4j.example.vmicon _icon = null;
b4j.example.vmlistitemcontent _lic = null;
b4j.example.vmlistitemtitle _lit = null;
b4j.example.vmlistitemsubtitle _listt = null;
b4j.example.vmlistitemsubtitle _listt1 = null;
 //BA.debugLineNum = 258;BA.debugLine="private Sub SetListItems As VMSelect";
 //BA.debugLineNum = 259;BA.debugLine="If DesignMode Then Return Me";
if (_designmode) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 261;BA.debugLine="Dim tmp As VMTemplate";
_tmp = new b4j.example.vmtemplate();
 //BA.debugLineNum = 262;BA.debugLine="tmp.Initialize(vue, $\"${ID}tmpl\"$, Module)";
_tmp._initialize /*b4j.example.vmtemplate*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tmpl"),_module);
 //BA.debugLineNum = 263;BA.debugLine="tmp.SetStatic(bStatic)";
_tmp._setstatic /*b4j.example.vmtemplate*/ (_bstatic);
 //BA.debugLineNum = 264;BA.debugLine="tmp.SetDesignMode(DesignMode)";
_tmp._setdesignmode /*b4j.example.vmtemplate*/ (_designmode);
 //BA.debugLineNum = 265;BA.debugLine="tmp.SetAttrSingle(\"v-slot:item\", \"{ item, attrs,";
_tmp._setattrsingle /*b4j.example.vmtemplate*/ ("v-slot:item","{ item, attrs, on }");
 //BA.debugLineNum = 267;BA.debugLine="Dim vli As VMListItem";
_vli = new b4j.example.vmlistitem();
 //BA.debugLineNum = 268;BA.debugLine="vli.Initialize(vue, \"\", Module).SetStatic(bStatic";
_vli._initialize /*b4j.example.vmlistitem*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmlistitem*/ (_bstatic)._setdesignmode /*b4j.example.vmlistitem*/ (_designmode);
 //BA.debugLineNum = 269;BA.debugLine="vli.SetVIf($\"item.key\"$)";
_vli._setvif /*b4j.example.vmlistitem*/ (("item.key"));
 //BA.debugLineNum = 270;BA.debugLine="vli.Bind(\":key\", $\"item.key\"$)";
_vli._bind /*b4j.example.vmlistitem*/ (":key",("item.key"));
 //BA.debugLineNum = 271;BA.debugLine="vli.SetAttrSingle(\":id\", $\"item.key\"$)";
_vli._setattrsingle /*b4j.example.vmlistitem*/ (":id",("item.key"));
 //BA.debugLineNum = 272;BA.debugLine="vli.SetAttrSingle(\"v-bind\", \"attrs\")";
_vli._setattrsingle /*b4j.example.vmlistitem*/ ("v-bind","attrs");
 //BA.debugLineNum = 273;BA.debugLine="vli.SetAttrSingle(\"v-on\", \"on\")";
_vli._setattrsingle /*b4j.example.vmlistitem*/ ("v-on","on");
 //BA.debugLineNum = 275;BA.debugLine="Dim lia As VMListItemAvatar";
_lia = new b4j.example.vmlistitemavatar();
 //BA.debugLineNum = 276;BA.debugLine="lia.Initialize(vue, \"\", Module)";
_lia._initialize /*b4j.example.vmlistitemavatar*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 277;BA.debugLine="lia.SetStatic(bStatic)";
_lia._setstatic /*b4j.example.vmlistitemavatar*/ (_bstatic);
 //BA.debugLineNum = 278;BA.debugLine="lia.SetDesignMode(DesignMode)";
_lia._setdesignmode /*b4j.example.vmlistitemavatar*/ (_designmode);
 //BA.debugLineNum = 279;BA.debugLine="lia.SetVIf($\"item.avatar\"$)";
_lia._setvif /*b4j.example.vmlistitemavatar*/ (("item.avatar"));
 //BA.debugLineNum = 280;BA.debugLine="Dim img As VMImage";
_img = new b4j.example.vmimage();
 //BA.debugLineNum = 281;BA.debugLine="img.Initialize(vue, \"\", Module)";
_img._initialize /*b4j.example.vmimage*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 282;BA.debugLine="img.SetStatic(bStatic)";
_img._setstatic /*b4j.example.vmimage*/ (_bstatic);
 //BA.debugLineNum = 283;BA.debugLine="img.SetDesignMode(DesignMode)";
_img._setdesignmode /*b4j.example.vmimage*/ (_designmode);
 //BA.debugLineNum = 284;BA.debugLine="img.SetAttrSingle(\":src\", $\"item.avatar\"$)";
_img._setattrsingle /*b4j.example.vmimage*/ (":src",("item.avatar"));
 //BA.debugLineNum = 285;BA.debugLine="img.Pop(lia.ListItemAvatar)";
_img._pop /*String*/ (_lia._listitemavatar /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 286;BA.debugLine="lia.Pop(vli.ListItem)";
_lia._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 288;BA.debugLine="Dim vlii As VMListItemIcon";
_vlii = new b4j.example.vmlistitemicon();
 //BA.debugLineNum = 289;BA.debugLine="vlii.Initialize(vue, \"\", Module)";
_vlii._initialize /*b4j.example.vmlistitemicon*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 290;BA.debugLine="vlii.SetStatic(bStatic)";
_vlii._setstatic /*b4j.example.vmlistitemicon*/ (_bstatic);
 //BA.debugLineNum = 291;BA.debugLine="vlii.SetDesignMode(DesignMode)";
_vlii._setdesignmode /*b4j.example.vmlistitemicon*/ (_designmode);
 //BA.debugLineNum = 292;BA.debugLine="vlii.SetVif($\"item.iconname\"$)";
_vlii._setvif /*b4j.example.vmlistitemicon*/ (("item.iconname"));
 //BA.debugLineNum = 293;BA.debugLine="Dim icon As VMIcon";
_icon = new b4j.example.vmicon();
 //BA.debugLineNum = 294;BA.debugLine="icon.Initialize(vue,\"\", Module)";
_icon._initialize /*b4j.example.vmicon*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 295;BA.debugLine="icon.SetStatic(bStatic)";
_icon._setstatic /*b4j.example.vmicon*/ (_bstatic);
 //BA.debugLineNum = 296;BA.debugLine="icon.SetDesignMode(DesignMode)";
_icon._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 297;BA.debugLine="icon.SetVText($\"item.iconname\"$)";
_icon._setvtext /*b4j.example.vmicon*/ (("item.iconname"));
 //BA.debugLineNum = 298;BA.debugLine="icon.SetAttrSingle(\":color\", $\"item.iconcolor\"$)";
_icon._setattrsingle /*b4j.example.vmicon*/ (":color",("item.iconcolor"));
 //BA.debugLineNum = 299;BA.debugLine="icon.Pop(vlii.ListItemIcon)";
_icon._pop /*String*/ (_vlii._listitemicon /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 300;BA.debugLine="vlii.Pop(vli.ListItem)";
_vlii._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 302;BA.debugLine="Dim lic As VMListItemContent";
_lic = new b4j.example.vmlistitemcontent();
 //BA.debugLineNum = 303;BA.debugLine="lic.Initialize(vue,\"\", Module)";
_lic._initialize /*b4j.example.vmlistitemcontent*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 304;BA.debugLine="lic.SetStatic(bStatic)";
_lic._setstatic /*b4j.example.vmlistitemcontent*/ (_bstatic);
 //BA.debugLineNum = 305;BA.debugLine="lic.SetDesignMode(DesignMode)";
_lic._setdesignmode /*b4j.example.vmlistitemcontent*/ (_designmode);
 //BA.debugLineNum = 307;BA.debugLine="Dim lit As VMListItemTitle";
_lit = new b4j.example.vmlistitemtitle();
 //BA.debugLineNum = 308;BA.debugLine="lit.Initialize(vue, \"\", Module)";
_lit._initialize /*b4j.example.vmlistitemtitle*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 309;BA.debugLine="lit.SetStatic(bStatic)";
_lit._setstatic /*b4j.example.vmlistitemtitle*/ (_bstatic);
 //BA.debugLineNum = 310;BA.debugLine="lit.SetDesignMode(DesignMode)";
_lit._setdesignmode /*b4j.example.vmlistitemtitle*/ (_designmode);
 //BA.debugLineNum = 311;BA.debugLine="lit.SetVif($\"item.title\"$)";
_lit._setvif /*b4j.example.vmlistitemtitle*/ (("item.title"));
 //BA.debugLineNum = 312;BA.debugLine="lit.SetVText($\"item.title\"$)";
_lit._setvtext /*b4j.example.vmlistitemtitle*/ (("item.title"));
 //BA.debugLineNum = 313;BA.debugLine="lit.Pop(lic.ListItemContent)";
_lit._pop /*String*/ (_lic._listitemcontent /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 315;BA.debugLine="Dim listt As VMListItemSubTitle";
_listt = new b4j.example.vmlistitemsubtitle();
 //BA.debugLineNum = 316;BA.debugLine="listt.Initialize(vue, \"\", Module)";
_listt._initialize /*b4j.example.vmlistitemsubtitle*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 317;BA.debugLine="listt.SetStatic(bStatic)";
_listt._setstatic /*b4j.example.vmlistitemsubtitle*/ (_bstatic);
 //BA.debugLineNum = 318;BA.debugLine="listt.SetDesignMode(DesignMode)";
_listt._setdesignmode /*b4j.example.vmlistitemsubtitle*/ (_designmode);
 //BA.debugLineNum = 319;BA.debugLine="listt.SetVIf($\"item.subtitle\"$)";
_listt._setvif /*b4j.example.vmlistitemsubtitle*/ (("item.subtitle"));
 //BA.debugLineNum = 320;BA.debugLine="listt.SetVText($\"item.subtitle\"$)";
_listt._setvtext /*b4j.example.vmlistitemsubtitle*/ (("item.subtitle"));
 //BA.debugLineNum = 321;BA.debugLine="listt.Pop(lic.ListItemContent)";
_listt._pop /*String*/ (_lic._listitemcontent /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 323;BA.debugLine="Dim listt1 As VMListItemSubTitle";
_listt1 = new b4j.example.vmlistitemsubtitle();
 //BA.debugLineNum = 324;BA.debugLine="listt1.Initialize(vue, \"\", Module)";
_listt1._initialize /*b4j.example.vmlistitemsubtitle*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 325;BA.debugLine="listt1.SetStatic(bStatic)";
_listt1._setstatic /*b4j.example.vmlistitemsubtitle*/ (_bstatic);
 //BA.debugLineNum = 326;BA.debugLine="listt1.SetDesignMode(DesignMode)";
_listt1._setdesignmode /*b4j.example.vmlistitemsubtitle*/ (_designmode);
 //BA.debugLineNum = 327;BA.debugLine="listt1.SetVIf($\"item.subtitle1\"$)";
_listt1._setvif /*b4j.example.vmlistitemsubtitle*/ (("item.subtitle1"));
 //BA.debugLineNum = 328;BA.debugLine="listt1.SetVText($\"item.subtitle1\"$)";
_listt1._setvtext /*b4j.example.vmlistitemsubtitle*/ (("item.subtitle1"));
 //BA.debugLineNum = 329;BA.debugLine="listt1.Pop(lic.ListItemContent)";
_listt1._pop /*String*/ (_lic._listitemcontent /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 331;BA.debugLine="lic.Pop(vli.ListItem)";
_lic._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 333;BA.debugLine="vli.Pop(tmp.Template)";
_vli._pop /*String*/ (_tmp._template /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 334;BA.debugLine="SetText(tmp.ToString)";
_settext(_tmp._tostring /*String*/ ());
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setloaderheight(String _varloaderheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 903;BA.debugLine="Sub SetLoaderHeight(varLoaderHeight As String) As";
 //BA.debugLineNum = 904;BA.debugLine="If varLoaderHeight = \"\" Then Return Me";
if ((_varloaderheight).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 905;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 906;BA.debugLine="SetAttrSingle(\"loader-height\", varLoaderHeight)";
_setattrsingle("loader-height",_varloaderheight);
 }else {
 //BA.debugLineNum = 908;BA.debugLine="Dim pp As String = $\"${ID}LoaderHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"LoaderHeight");
 //BA.debugLineNum = 909;BA.debugLine="vue.SetStateSingle(pp, varLoaderHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloaderheight));
 //BA.debugLineNum = 910;BA.debugLine="Combo.Bind(\":loader-height\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":loader-height",_pp);
 };
 //BA.debugLineNum = 912;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 913;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setloading(boolean _varloading) throws Exception{
String _pp = "";
 //BA.debugLineNum = 916;BA.debugLine="Sub SetLoading(varLoading As Boolean) As VMSelect";
 //BA.debugLineNum = 917;BA.debugLine="If varLoading = False Then Return Me";
if (_varloading==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 918;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 919;BA.debugLine="SetAttrSingle(\"loading\", varLoading)";
_setattrsingle("loading",BA.ObjectToString(_varloading));
 }else {
 //BA.debugLineNum = 921;BA.debugLine="Dim pp As String = $\"${ID}Loading\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Loading");
 //BA.debugLineNum = 922;BA.debugLine="vue.SetStateSingle(pp, varLoading)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloading));
 //BA.debugLineNum = 923;BA.debugLine="Combo.Bind(\":loading\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":loading",_pp);
 };
 //BA.debugLineNum = 925;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 926;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 1585;BA.debugLine="Sub SetMarginAll(p As String) As VMSelect";
 //BA.debugLineNum = 1586;BA.debugLine="Combo.setmarginall(p)";
_combo._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 1587;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1588;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setmenuprops(Object _varmenuprops) throws Exception{
String _pp = "";
 //BA.debugLineNum = 929;BA.debugLine="Sub SetMenuProps(varMenuProps As Object) As VMSele";
 //BA.debugLineNum = 930;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 931;BA.debugLine="SetAttrSingle(\"menu-props\", varMenuProps)";
_setattrsingle("menu-props",BA.ObjectToString(_varmenuprops));
 }else {
 //BA.debugLineNum = 933;BA.debugLine="Dim pp As String = $\"${ID}MenuProps\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MenuProps");
 //BA.debugLineNum = 934;BA.debugLine="vue.SetStateSingle(pp, varMenuProps)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmenuprops);
 //BA.debugLineNum = 935;BA.debugLine="Combo.Bind(\":menu-props\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":menu-props",_pp);
 };
 //BA.debugLineNum = 937;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 938;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setmessages(Object _varmessages) throws Exception{
String _pp = "";
 //BA.debugLineNum = 941;BA.debugLine="Sub SetMessages(varMessages As Object) As VMSelect";
 //BA.debugLineNum = 942;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 943;BA.debugLine="SetAttrSingle(\"messages\", varMessages)";
_setattrsingle("messages",BA.ObjectToString(_varmessages));
 }else {
 //BA.debugLineNum = 945;BA.debugLine="Dim pp As String = $\"${ID}Messages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Messages");
 //BA.debugLineNum = 946;BA.debugLine="vue.SetStateSingle(pp, varMessages)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmessages);
 //BA.debugLineNum = 947;BA.debugLine="Combo.Bind(\":messages\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":messages",_pp);
 };
 //BA.debugLineNum = 949;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 950;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setmultiple(boolean _varmultiple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 953;BA.debugLine="Sub SetMultiple(varMultiple As Boolean) As VMSelec";
 //BA.debugLineNum = 954;BA.debugLine="If varMultiple = False Then Return Me";
if (_varmultiple==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 955;BA.debugLine="If varMultiple Then Combo.IsArray = True";
if (_varmultiple) { 
_combo._isarray /*boolean*/  = __c.True;};
 //BA.debugLineNum = 956;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 957;BA.debugLine="SetAttrSingle(\"multiple\", varMultiple)";
_setattrsingle("multiple",BA.ObjectToString(_varmultiple));
 }else {
 //BA.debugLineNum = 959;BA.debugLine="Dim pp As String = $\"${ID}Multiple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Multiple");
 //BA.debugLineNum = 960;BA.debugLine="vue.SetStateSingle(pp, varMultiple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmultiple));
 //BA.debugLineNum = 961;BA.debugLine="Combo.Bind(\":multiple\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":multiple",_pp);
 };
 //BA.debugLineNum = 963;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 964;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 1602;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 1603;BA.debugLine="Combo.SetName(varName, bbind)";
_combo._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 1604;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1605;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setnodatatext(String _varnodatatext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 967;BA.debugLine="Sub SetNoDataText(varNoDataText As String) As VMSe";
 //BA.debugLineNum = 968;BA.debugLine="If varNoDataText = \"\" Then Return Me";
if ((_varnodatatext).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 969;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 970;BA.debugLine="SetAttrSingle(\"no-data-text\", varNoDataText)";
_setattrsingle("no-data-text",_varnodatatext);
 }else {
 //BA.debugLineNum = 972;BA.debugLine="Dim pp As String = $\"${ID}NoDataText\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NoDataText");
 //BA.debugLineNum = 973;BA.debugLine="vue.SetStateSingle(pp, varNoDataText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnodatatext));
 //BA.debugLineNum = 974;BA.debugLine="Combo.Bind(\":no-data-text\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":no-data-text",_pp);
 };
 //BA.debugLineNum = 976;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 977;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setnofilter(boolean _varnofilter) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1692;BA.debugLine="Sub SetNoFilter(varNoFilter As Boolean) As VMSelec";
 //BA.debugLineNum = 1693;BA.debugLine="If varNoFilter = False Then Return Me";
if (_varnofilter==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1694;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1695;BA.debugLine="SetAttrSingle(\"no-filter\", varNoFilter)";
_setattrsingle("no-filter",BA.ObjectToString(_varnofilter));
 //BA.debugLineNum = 1696;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 };
 //BA.debugLineNum = 1698;BA.debugLine="Dim pp As String = $\"${ID}NoFilter\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NoFilter");
 //BA.debugLineNum = 1699;BA.debugLine="vue.SetStateSingle(pp, varNoFilter)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnofilter));
 //BA.debugLineNum = 1700;BA.debugLine="Combo.Bind(\":no-filter\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":no-filter",_pp);
 //BA.debugLineNum = 1701;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1702;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonblur(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1353;BA.debugLine="Sub SetOnBlur(eventHandler As Object, methodName A";
 //BA.debugLineNum = 1354;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1355;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1356;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1357;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1358;BA.debugLine="SetAttr(CreateMap(\"@blur\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@blur"),(Object)(_methodname)}));
 //BA.debugLineNum = 1360;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1361;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1362;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonchange(Object _eventhandler,String _methodname) throws Exception{
Object _value = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1365;BA.debugLine="Sub SetOnChange(eventHandler As Object, methodName";
 //BA.debugLineNum = 1366;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1367;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1368;BA.debugLine="Dim value As Object";
_value = new Object();
 //BA.debugLineNum = 1369;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_value}))));
 //BA.debugLineNum = 1370;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 1372;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1373;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1374;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonclick(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1377;BA.debugLine="Sub SetOnClick(eventHandler As Object, methodName";
 //BA.debugLineNum = 1378;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1379;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1380;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1381;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1382;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 1384;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1385;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1386;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonclickappend(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1389;BA.debugLine="Sub SetOnClickAppend(eventHandler As Object, metho";
 //BA.debugLineNum = 1390;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1391;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1392;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1393;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1394;BA.debugLine="SetAttr(CreateMap(\"@click:append\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:append"),(Object)(_methodname)}));
 //BA.debugLineNum = 1396;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1397;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1398;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonclickappendouter(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1401;BA.debugLine="Sub SetOnClickAppendOuter(eventHandler As Object,";
 //BA.debugLineNum = 1402;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1403;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1404;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1405;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1406;BA.debugLine="SetAttr(CreateMap(\"@click:append-outer\": methodNa";
_setattr(__c.createMap(new Object[] {(Object)("@click:append-outer"),(Object)(_methodname)}));
 //BA.debugLineNum = 1408;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1409;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1410;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonclickclear(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1413;BA.debugLine="Sub SetOnClickClear(eventHandler As Object, method";
 //BA.debugLineNum = 1414;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1415;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1416;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1417;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1418;BA.debugLine="SetAttr(CreateMap(\"@click:clear\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:clear"),(Object)(_methodname)}));
 //BA.debugLineNum = 1420;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1421;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1422;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonclickprepend(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1425;BA.debugLine="Sub SetOnClickPrepend(eventHandler As Object, meth";
 //BA.debugLineNum = 1426;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1427;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1428;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1429;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1430;BA.debugLine="SetAttr(CreateMap(\"@click:prepend\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:prepend"),(Object)(_methodname)}));
 //BA.debugLineNum = 1432;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1433;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1434;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonclickprependinner(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1437;BA.debugLine="Sub SetOnClickPrependInner(eventHandler As Object,";
 //BA.debugLineNum = 1438;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1439;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1440;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1441;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1442;BA.debugLine="SetAttr(CreateMap(\"@click:prepend-inner\": methodN";
_setattr(__c.createMap(new Object[] {(Object)("@click:prepend-inner"),(Object)(_methodname)}));
 //BA.debugLineNum = 1444;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1445;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1446;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonfocus(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1449;BA.debugLine="Sub SetOnFocus(eventHandler As Object, methodName";
 //BA.debugLineNum = 1450;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1451;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1452;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1453;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1454;BA.debugLine="SetAttr(CreateMap(\"@focus\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@focus"),(Object)(_methodname)}));
 //BA.debugLineNum = 1456;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1457;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1458;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setoninput(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1461;BA.debugLine="Sub SetOnInput(eventHandler As Object, methodName";
 //BA.debugLineNum = 1462;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1463;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1464;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1465;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1466;BA.debugLine="SetAttr(CreateMap(\"@input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_methodname)}));
 //BA.debugLineNum = 1468;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1469;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1470;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonkeydown(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1473;BA.debugLine="Sub SetOnKeydown(eventHandler As Object, methodNam";
 //BA.debugLineNum = 1474;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1475;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1476;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1477;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1478;BA.debugLine="SetAttr(CreateMap(\"@keydown\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@keydown"),(Object)(_methodname)}));
 //BA.debugLineNum = 1480;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1481;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1482;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonmousedown(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1485;BA.debugLine="Sub SetOnMousedown(eventHandler As Object, methodN";
 //BA.debugLineNum = 1486;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1487;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1488;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1489;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1490;BA.debugLine="SetAttr(CreateMap(\"@mousedown\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mousedown"),(Object)(_methodname)}));
 //BA.debugLineNum = 1492;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1493;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1494;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonmouseup(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1497;BA.debugLine="Sub SetOnMouseup(eventHandler As Object, methodNam";
 //BA.debugLineNum = 1498;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1499;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1500;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1501;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1502;BA.debugLine="SetAttr(CreateMap(\"@mouseup\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mouseup"),(Object)(_methodname)}));
 //BA.debugLineNum = 1504;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1505;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1506;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonupdateerror(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1509;BA.debugLine="Sub SetOnUpdateError(eventHandler As Object, metho";
 //BA.debugLineNum = 1510;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1511;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1512;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1513;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1514;BA.debugLine="SetAttr(CreateMap(\"@update:error\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:error"),(Object)(_methodname)}));
 //BA.debugLineNum = 1516;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1517;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1518;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonupdatelistindex(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1521;BA.debugLine="Sub SetOnUpdateListIndex(eventHandler As Object, m";
 //BA.debugLineNum = 1522;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1523;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1524;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1525;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1526;BA.debugLine="SetAttr(CreateMap(\"@update:list-index\": methodNam";
_setattr(__c.createMap(new Object[] {(Object)("@update:list-index"),(Object)(_methodname)}));
 //BA.debugLineNum = 1528;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1529;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1530;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonupdatesearchinput(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1533;BA.debugLine="Sub SetOnUpdateSearchInput(eventHandler As Object,";
 //BA.debugLineNum = 1534;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1535;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1536;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1537;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1538;BA.debugLine="SetAttr(CreateMap(\"@update:search-input\": methodN";
_setattr(__c.createMap(new Object[] {(Object)("@update:search-input"),(Object)(_methodname)}));
 //BA.debugLineNum = 1540;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1541;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1542;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setopenonclear(boolean _varopenonclear) throws Exception{
String _pp = "";
 //BA.debugLineNum = 980;BA.debugLine="Sub SetOpenOnClear(varOpenOnClear As Boolean) As V";
 //BA.debugLineNum = 981;BA.debugLine="If varOpenOnClear = False Then Return Me";
if (_varopenonclear==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 982;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 983;BA.debugLine="SetAttrSingle(\"open-on-clear\", varOpenOnClear)";
_setattrsingle("open-on-clear",BA.ObjectToString(_varopenonclear));
 }else {
 //BA.debugLineNum = 985;BA.debugLine="Dim pp As String = $\"${ID}OpenOnClear\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OpenOnClear");
 //BA.debugLineNum = 986;BA.debugLine="vue.SetStateSingle(pp, varOpenOnClear)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varopenonclear));
 //BA.debugLineNum = 987;BA.debugLine="Combo.Bind(\":open-on-clear\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":open-on-clear",_pp);
 };
 //BA.debugLineNum = 989;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 990;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setoptions(String _sourcename,anywheresoftware.b4a.objects.collections.Map _options,String _sourcefield,String _displayfield,boolean _returnobject) throws Exception{
anywheresoftware.b4a.objects.collections.List _recs = null;
String _k = "";
String _v = "";
anywheresoftware.b4a.objects.collections.Map _nrec = null;
 //BA.debugLineNum = 182;BA.debugLine="Sub SetOptions(sourceName As String, options As Ma";
 //BA.debugLineNum = 183;BA.debugLine="sourceName = sourceName.tolowercase";
_sourcename = _sourcename.toLowerCase();
 //BA.debugLineNum = 184;BA.debugLine="sourcefield = sourcefield.ToLowerCase";
_sourcefield = _sourcefield.toLowerCase();
 //BA.debugLineNum = 185;BA.debugLine="displayfield = displayfield.ToLowerCase";
_displayfield = _displayfield.toLowerCase();
 //BA.debugLineNum = 186;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 187;BA.debugLine="recs.Initialize";
_recs.Initialize();
 //BA.debugLineNum = 188;BA.debugLine="For Each k As String In options.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _options.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_k = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 189;BA.debugLine="Dim v As String = options.Get(k)";
_v = BA.ObjectToString(_options.Get((Object)(_k)));
 //BA.debugLineNum = 190;BA.debugLine="k = vue.CStr(k)";
_k = _vue._cstr /*String*/ ((Object)(_k));
 //BA.debugLineNum = 191;BA.debugLine="v = vue.CStr(v)";
_v = _vue._cstr /*String*/ ((Object)(_v));
 //BA.debugLineNum = 192;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 193;BA.debugLine="nrec.Put(sourcefield, k)";
_nrec.Put((Object)(_sourcefield),(Object)(_k));
 //BA.debugLineNum = 194;BA.debugLine="nrec.Put(displayfield, v)";
_nrec.Put((Object)(_displayfield),(Object)(_v));
 //BA.debugLineNum = 195;BA.debugLine="recs.Add(nrec)";
_recs.Add((Object)(_nrec.getObject()));
 }
};
 //BA.debugLineNum = 198;BA.debugLine="vue.SetData(sourceName, recs)";
_vue._setdata /*b4j.example.bananovue*/ (_sourcename,(Object)(_recs.getObject()));
 //BA.debugLineNum = 199;BA.debugLine="SetItems(sourceName)";
_setitems(_sourcename);
 //BA.debugLineNum = 200;BA.debugLine="SetItemText(displayfield)";
_setitemtext(_displayfield);
 //BA.debugLineNum = 201;BA.debugLine="SetItemValue(sourcefield)";
_setitemvalue(_sourcefield);
 //BA.debugLineNum = 202;BA.debugLine="SetReturnObject(returnObject)";
_setreturnobject(_returnobject);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setoutlined(boolean _varoutlined) throws Exception{
String _pp = "";
 //BA.debugLineNum = 993;BA.debugLine="Sub SetOutlined(varOutlined As Boolean) As VMSelec";
 //BA.debugLineNum = 994;BA.debugLine="If varOutlined = False Then Return Me";
if (_varoutlined==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 995;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 996;BA.debugLine="SetAttrSingle(\"outlined\", varOutlined)";
_setattrsingle("outlined",BA.ObjectToString(_varoutlined));
 }else {
 //BA.debugLineNum = 998;BA.debugLine="Dim pp As String = $\"${ID}Outlined\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Outlined");
 //BA.debugLineNum = 999;BA.debugLine="vue.SetStateSingle(pp, varOutlined)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoutlined));
 //BA.debugLineNum = 1000;BA.debugLine="Combo.Bind(\":outlined\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":outlined",_pp);
 };
 //BA.debugLineNum = 1002;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1003;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 1580;BA.debugLine="Sub SetPaddingAll(p As String) As VMSelect";
 //BA.debugLineNum = 1581;BA.debugLine="Combo.SetPaddingAll(p)";
_combo._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 1582;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1583;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setpersistenthint(boolean _varpersistenthint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1006;BA.debugLine="Sub SetPersistentHint(varPersistentHint As Boolean";
 //BA.debugLineNum = 1007;BA.debugLine="If varPersistentHint = False Then Return Me";
if (_varpersistenthint==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1008;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1009;BA.debugLine="SetAttrSingle(\"persistent-hint\", varPersistentHi";
_setattrsingle("persistent-hint",BA.ObjectToString(_varpersistenthint));
 }else {
 //BA.debugLineNum = 1011;BA.debugLine="Dim pp As String = $\"${ID}PersistentHint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PersistentHint");
 //BA.debugLineNum = 1012;BA.debugLine="vue.SetStateSingle(pp, varPersistentHint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpersistenthint));
 //BA.debugLineNum = 1013;BA.debugLine="Combo.Bind(\":persistent-hint\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":persistent-hint",_pp);
 };
 //BA.debugLineNum = 1015;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1016;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setplaceholder(String _varplaceholder) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1019;BA.debugLine="Sub SetPlaceholder(varPlaceholder As String) As VM";
 //BA.debugLineNum = 1020;BA.debugLine="If varPlaceholder = \"\" Then Return Me";
if ((_varplaceholder).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1021;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1022;BA.debugLine="SetAttrSingle(\"placeholder\", varPlaceholder)";
_setattrsingle("placeholder",_varplaceholder);
 }else {
 //BA.debugLineNum = 1024;BA.debugLine="Dim pp As String = $\"${ID}Placeholder\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Placeholder");
 //BA.debugLineNum = 1025;BA.debugLine="vue.SetStateSingle(pp, varPlaceholder)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varplaceholder));
 //BA.debugLineNum = 1026;BA.debugLine="Combo.Bind(\":placeholder\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":placeholder",_pp);
 };
 //BA.debugLineNum = 1028;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1029;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setprefix(String _varprefix) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1032;BA.debugLine="Sub SetPrefix(varPrefix As String) As VMSelect";
 //BA.debugLineNum = 1033;BA.debugLine="If varPrefix = \"\" Then Return Me";
if ((_varprefix).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1034;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1035;BA.debugLine="SetAttrSingle(\"prefix\", varPrefix)";
_setattrsingle("prefix",_varprefix);
 }else {
 //BA.debugLineNum = 1037;BA.debugLine="Dim pp As String = $\"${ID}Prefix\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Prefix");
 //BA.debugLineNum = 1038;BA.debugLine="vue.SetStateSingle(pp, varPrefix)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprefix));
 //BA.debugLineNum = 1039;BA.debugLine="Combo.Bind(\":prefix\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":prefix",_pp);
 };
 //BA.debugLineNum = 1041;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1042;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setprependicon(String _varprependicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1045;BA.debugLine="Sub SetPrependIcon(varPrependIcon As String) As VM";
 //BA.debugLineNum = 1046;BA.debugLine="If varPrependIcon = \"\" Then Return Me";
if ((_varprependicon).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1047;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1048;BA.debugLine="SetAttrSingle(\"prepend-icon\", varPrependIcon)";
_setattrsingle("prepend-icon",_varprependicon);
 }else {
 //BA.debugLineNum = 1050;BA.debugLine="Dim pp As String = $\"${ID}PrependIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrependIcon");
 //BA.debugLineNum = 1051;BA.debugLine="vue.SetStateSingle(pp, varPrependIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprependicon));
 //BA.debugLineNum = 1052;BA.debugLine="Combo.Bind(\":prepend-icon\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":prepend-icon",_pp);
 };
 //BA.debugLineNum = 1054;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1055;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setprependinnericon(String _varprependinnericon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1058;BA.debugLine="Sub SetPrependInnerIcon(varPrependInnerIcon As Str";
 //BA.debugLineNum = 1059;BA.debugLine="If varPrependInnerIcon = \"\" Then Return Me";
if ((_varprependinnericon).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1060;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1061;BA.debugLine="SetAttrSingle(\"prepend-inner-icon\", varPrependIn";
_setattrsingle("prepend-inner-icon",_varprependinnericon);
 }else {
 //BA.debugLineNum = 1063;BA.debugLine="Dim pp As String = $\"${ID}PrependInnerIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrependInnerIcon");
 //BA.debugLineNum = 1064;BA.debugLine="vue.SetStateSingle(pp, varPrependInnerIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprependinnericon));
 //BA.debugLineNum = 1065;BA.debugLine="Combo.Bind(\":prepend-inner-icon\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":prepend-inner-icon",_pp);
 };
 //BA.debugLineNum = 1067;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1068;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMSel";
 //BA.debugLineNum = 109;BA.debugLine="Combo.SetRC(sRow, sCol)";
_combo._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setreadonly(boolean _varreadonly) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1071;BA.debugLine="Sub SetReadonly(varReadonly As Boolean) As VMSelec";
 //BA.debugLineNum = 1072;BA.debugLine="If varReadonly = False Then Return Me";
if (_varreadonly==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1073;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1074;BA.debugLine="SetAttrSingle(\"readonly\", varReadonly)";
_setattrsingle("readonly",BA.ObjectToString(_varreadonly));
 }else {
 //BA.debugLineNum = 1076;BA.debugLine="Dim pp As String = $\"${ID}Readonly\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Readonly");
 //BA.debugLineNum = 1077;BA.debugLine="vue.SetStateSingle(pp, varReadonly)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreadonly));
 //BA.debugLineNum = 1078;BA.debugLine="Combo.Bind(\":readonly\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":readonly",_pp);
 };
 //BA.debugLineNum = 1080;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1081;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setrequired(boolean _varrequired) throws Exception{
 //BA.debugLineNum = 373;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMSelec";
 //BA.debugLineNum = 374;BA.debugLine="If varRequired = False Then Return Me";
if (_varrequired==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 375;BA.debugLine="Combo.SetRequired(varRequired)";
_combo._setrequired /*b4j.example.vmelement*/ (_varrequired);
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setreturnobject(boolean _varreturnobject) throws Exception{
 //BA.debugLineNum = 1084;BA.debugLine="Sub SetReturnObject(varReturnObject As Boolean) As";
 //BA.debugLineNum = 1085;BA.debugLine="Select Case Combo.typeOf";
switch (BA.switchObjectToInt(_combo._typeof /*String*/ ,"auto","select","combo")) {
case 0: 
case 1: {
 //BA.debugLineNum = 1087;BA.debugLine="If varReturnObject = False Then Return Me";
if (_varreturnobject==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 break; }
case 2: {
 //BA.debugLineNum = 1089;BA.debugLine="If varReturnObject = True Then Return Me";
if (_varreturnobject==__c.True) { 
if (true) return (b4j.example.vmselect)(this);};
 break; }
}
;
 //BA.debugLineNum = 1091;BA.debugLine="SetAttrSingle(\":return-object\", varReturnObject)";
_setattrsingle(":return-object",BA.ObjectToString(_varreturnobject));
 //BA.debugLineNum = 1092;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1093;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setreverse(boolean _varreverse) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1096;BA.debugLine="Sub SetReverse(varReverse As Boolean) As VMSelect";
 //BA.debugLineNum = 1097;BA.debugLine="If varReverse = False Then Return Me";
if (_varreverse==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1098;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1099;BA.debugLine="SetAttrSingle(\"reverse\", varReverse)";
_setattrsingle("reverse",BA.ObjectToString(_varreverse));
 }else {
 //BA.debugLineNum = 1101;BA.debugLine="Dim pp As String = $\"${ID}Reverse\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Reverse");
 //BA.debugLineNum = 1102;BA.debugLine="vue.SetStateSingle(pp, varReverse)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreverse));
 //BA.debugLineNum = 1103;BA.debugLine="Combo.Bind(\":reverse\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":reverse",_pp);
 };
 //BA.debugLineNum = 1105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setrounded(boolean _varrounded) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1109;BA.debugLine="Sub SetRounded(varRounded As Boolean) As VMSelect";
 //BA.debugLineNum = 1110;BA.debugLine="If varRounded = False Then Return Me";
if (_varrounded==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1111;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1112;BA.debugLine="SetAttrSingle(\"rounded\", varRounded)";
_setattrsingle("rounded",BA.ObjectToString(_varrounded));
 }else {
 //BA.debugLineNum = 1114;BA.debugLine="Dim pp As String = $\"${ID}Rounded\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Rounded");
 //BA.debugLineNum = 1115;BA.debugLine="vue.SetStateSingle(pp, varRounded)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varrounded));
 //BA.debugLineNum = 1116;BA.debugLine="Combo.Bind(\":rounded\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":rounded",_pp);
 };
 //BA.debugLineNum = 1118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setrules(boolean _varrules) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1122;BA.debugLine="Sub SetRules(varRules As Boolean) As VMSelect";
 //BA.debugLineNum = 1123;BA.debugLine="If varRules = False Then Return Me";
if (_varrules==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1124;BA.debugLine="If bStatic Then Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1125;BA.debugLine="If DesignMode Then Return Me";
if (_designmode) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1126;BA.debugLine="Dim pp As String = $\"${vmodel}Rules\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"Rules");
 //BA.debugLineNum = 1127;BA.debugLine="Combo.Bind(\":rules\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":rules",_pp);
 //BA.debugLineNum = 1128;BA.debugLine="vue.SetData(pp, vue.NewList)";
_vue._setdata /*b4j.example.bananovue*/ (_pp,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 1129;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1130;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setsearchinput(boolean _varsearchinput) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1705;BA.debugLine="Sub SetSearchInput(varSearchInput As Boolean) As V";
 //BA.debugLineNum = 1706;BA.debugLine="If varSearchInput = False Then Return Me";
if (_varsearchinput==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1707;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1708;BA.debugLine="SetAttrSingle(\"search-input\", varSearchInput)";
_setattrsingle("search-input",BA.ObjectToString(_varsearchinput));
 //BA.debugLineNum = 1709;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 };
 //BA.debugLineNum = 1711;BA.debugLine="Dim pp As String = $\"${ID}SearchInput\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SearchInput");
 //BA.debugLineNum = 1712;BA.debugLine="vue.SetStateSingle(pp, varSearchInput)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsearchinput));
 //BA.debugLineNum = 1713;BA.debugLine="Combo.Bind(\":search-input\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":search-input",_pp);
 //BA.debugLineNum = 1714;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1715;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setshaped(boolean _varshaped) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1133;BA.debugLine="Sub SetShaped(varShaped As Boolean) As VMSelect";
 //BA.debugLineNum = 1134;BA.debugLine="If varShaped = False Then Return Me";
if (_varshaped==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1135;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1136;BA.debugLine="SetAttrSingle(\"shaped\", varShaped)";
_setattrsingle("shaped",BA.ObjectToString(_varshaped));
 }else {
 //BA.debugLineNum = 1138;BA.debugLine="Dim pp As String = $\"${ID}Shaped\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Shaped");
 //BA.debugLineNum = 1139;BA.debugLine="vue.SetStateSingle(pp, varShaped)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshaped));
 //BA.debugLineNum = 1140;BA.debugLine="Combo.Bind(\":shaped\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":shaped",_pp);
 };
 //BA.debugLineNum = 1142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1143;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setsingleline(boolean _varsingleline) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1146;BA.debugLine="Sub SetSingleLine(varSingleLine As Boolean) As VMS";
 //BA.debugLineNum = 1147;BA.debugLine="If varSingleLine = False Then Return Me";
if (_varsingleline==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1148;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1149;BA.debugLine="SetAttrSingle(\"single-line\", varSingleLine)";
_setattrsingle("single-line",BA.ObjectToString(_varsingleline));
 }else {
 //BA.debugLineNum = 1151;BA.debugLine="Dim pp As String = $\"${ID}SingleLine\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SingleLine");
 //BA.debugLineNum = 1152;BA.debugLine="vue.SetStateSingle(pp, varSingleLine)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsingleline));
 //BA.debugLineNum = 1153;BA.debugLine="Combo.Bind(\":single-line\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":single-line",_pp);
 };
 //BA.debugLineNum = 1155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setslotappend(boolean _b) throws Exception{
 //BA.debugLineNum = 1281;BA.debugLine="Sub SetSlotAppend(b As Boolean) As VMSelect    'ig";
 //BA.debugLineNum = 1282;BA.debugLine="SetAttr(CreateMap(\"slot\": \"append\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("append")}));
 //BA.debugLineNum = 1283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setslotappenditem(boolean _b) throws Exception{
 //BA.debugLineNum = 1287;BA.debugLine="Sub SetSlotAppendItem(b As Boolean) As VMSelect";
 //BA.debugLineNum = 1288;BA.debugLine="SetAttr(CreateMap(\"slot\": \"append-item\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("append-item")}));
 //BA.debugLineNum = 1289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1290;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setslotappendouter(boolean _b) throws Exception{
 //BA.debugLineNum = 1293;BA.debugLine="Sub SetSlotAppendOuter(b As Boolean) As VMSelect";
 //BA.debugLineNum = 1294;BA.debugLine="SetAttr(CreateMap(\"slot\": \"append-outer\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("append-outer")}));
 //BA.debugLineNum = 1295;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1296;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setslotitem(boolean _b) throws Exception{
 //BA.debugLineNum = 1299;BA.debugLine="Sub SetSlotItem(b As Boolean) As VMSelect    'igno";
 //BA.debugLineNum = 1300;BA.debugLine="SetAttr(CreateMap(\"slot\": \"item\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("item")}));
 //BA.debugLineNum = 1301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1302;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setslotlabel(boolean _b) throws Exception{
 //BA.debugLineNum = 1305;BA.debugLine="Sub SetSlotLabel(b As Boolean) As VMSelect    'ign";
 //BA.debugLineNum = 1306;BA.debugLine="SetAttr(CreateMap(\"slot\": \"label\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("label")}));
 //BA.debugLineNum = 1307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1308;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setslotmessage(boolean _b) throws Exception{
 //BA.debugLineNum = 1311;BA.debugLine="Sub SetSlotMessage(b As Boolean) As VMSelect    'i";
 //BA.debugLineNum = 1312;BA.debugLine="SetAttr(CreateMap(\"slot\": \"message\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("message")}));
 //BA.debugLineNum = 1313;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1314;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setslotnodata(boolean _b) throws Exception{
 //BA.debugLineNum = 1317;BA.debugLine="Sub SetSlotNoData(b As Boolean) As VMSelect    'ig";
 //BA.debugLineNum = 1318;BA.debugLine="SetAttr(CreateMap(\"slot\": \"no-data\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("no-data")}));
 //BA.debugLineNum = 1319;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1320;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setslotprepend(boolean _b) throws Exception{
 //BA.debugLineNum = 1323;BA.debugLine="Sub SetSlotPrepend(b As Boolean) As VMSelect    'i";
 //BA.debugLineNum = 1324;BA.debugLine="SetAttr(CreateMap(\"slot\": \"prepend\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("prepend")}));
 //BA.debugLineNum = 1325;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1326;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setslotprependinner(boolean _b) throws Exception{
 //BA.debugLineNum = 1329;BA.debugLine="Sub SetSlotPrependInner(b As Boolean) As VMSelect";
 //BA.debugLineNum = 1330;BA.debugLine="SetAttr(CreateMap(\"slot\": \"prepend-inner\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("prepend-inner")}));
 //BA.debugLineNum = 1331;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1332;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setslotprependitem(boolean _b) throws Exception{
 //BA.debugLineNum = 1335;BA.debugLine="Sub SetSlotPrependItem(b As Boolean) As VMSelect";
 //BA.debugLineNum = 1336;BA.debugLine="SetAttr(CreateMap(\"slot\": \"prepend-item\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("prepend-item")}));
 //BA.debugLineNum = 1337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1338;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setslotprogress(boolean _b) throws Exception{
 //BA.debugLineNum = 1341;BA.debugLine="Sub SetSlotProgress(b As Boolean) As VMSelect    '";
 //BA.debugLineNum = 1342;BA.debugLine="SetAttr(CreateMap(\"slot\": \"progress\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("progress")}));
 //BA.debugLineNum = 1343;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1344;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setslotselection(boolean _b) throws Exception{
 //BA.debugLineNum = 1347;BA.debugLine="Sub SetSlotSelection(b As Boolean) As VMSelect";
 //BA.debugLineNum = 1348;BA.debugLine="SetAttr(CreateMap(\"slot\": \"selection\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("selection")}));
 //BA.debugLineNum = 1349;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1350;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setsmallchips(boolean _varsmallchips) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1159;BA.debugLine="Sub SetSmallChips(varSmallChips As Boolean) As VMS";
 //BA.debugLineNum = 1160;BA.debugLine="If varSmallChips = False Then Return Me";
if (_varsmallchips==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1161;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1162;BA.debugLine="SetAttrSingle(\"small-chips\", varSmallChips)";
_setattrsingle("small-chips",BA.ObjectToString(_varsmallchips));
 }else {
 //BA.debugLineNum = 1164;BA.debugLine="Dim pp As String = $\"${ID}SmallChips\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SmallChips");
 //BA.debugLineNum = 1165;BA.debugLine="vue.SetStateSingle(pp, varSmallChips)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsmallchips));
 //BA.debugLineNum = 1166;BA.debugLine="Combo.Bind(\":small-chips\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":small-chips",_pp);
 };
 //BA.debugLineNum = 1168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1169;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setsolo(boolean _varsolo) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1172;BA.debugLine="Sub SetSolo(varSolo As Boolean) As VMSelect";
 //BA.debugLineNum = 1173;BA.debugLine="If varSolo = False Then Return Me";
if (_varsolo==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1174;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1175;BA.debugLine="SetAttrSingle(\"solo\", varSolo)";
_setattrsingle("solo",BA.ObjectToString(_varsolo));
 }else {
 //BA.debugLineNum = 1177;BA.debugLine="Dim pp As String = $\"${ID}Solo\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Solo");
 //BA.debugLineNum = 1178;BA.debugLine="vue.SetStateSingle(pp, varSolo)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsolo));
 //BA.debugLineNum = 1179;BA.debugLine="Combo.Bind(\":solo\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":solo",_pp);
 };
 //BA.debugLineNum = 1181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setsoloinverted(boolean _varsoloinverted) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1185;BA.debugLine="Sub SetSoloInverted(varSoloInverted As Boolean) As";
 //BA.debugLineNum = 1186;BA.debugLine="If varSoloInverted = False Then Return Me";
if (_varsoloinverted==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1187;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1188;BA.debugLine="SetAttrSingle(\"solo-inverted\", varSoloInverted)";
_setattrsingle("solo-inverted",BA.ObjectToString(_varsoloinverted));
 }else {
 //BA.debugLineNum = 1190;BA.debugLine="Dim pp As String = $\"${ID}SoloInverted\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SoloInverted");
 //BA.debugLineNum = 1191;BA.debugLine="vue.SetStateSingle(pp, varSoloInverted)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsoloinverted));
 //BA.debugLineNum = 1192;BA.debugLine="Combo.Bind(\":solo-inverted\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":solo-inverted",_pp);
 };
 //BA.debugLineNum = 1194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetStatic(b As Boolean) As VMSelect";
 //BA.debugLineNum = 91;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 92;BA.debugLine="Combo.SetStatic(b)";
_combo._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setstring() throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetString As VMSelect";
 //BA.debugLineNum = 97;BA.debugLine="Combo.fieldType = \"string\"";
_combo._fieldtype /*String*/  = "string";
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 446;BA.debugLine="Sub SetStyle(sm As Map) As VMSelect";
 //BA.debugLineNum = 447;BA.debugLine="Combo.SetStyle(sm)";
_combo._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1608;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 1609;BA.debugLine="Combo.SetStyleSingle(prop, value)";
_combo._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 1610;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1611;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setsuccess(boolean _varsuccess) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1198;BA.debugLine="Sub SetSuccess(varSuccess As Boolean) As VMSelect";
 //BA.debugLineNum = 1199;BA.debugLine="If varSuccess = False Then Return Me";
if (_varsuccess==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1200;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1201;BA.debugLine="SetAttrSingle(\"success\", varSuccess)";
_setattrsingle("success",BA.ObjectToString(_varsuccess));
 }else {
 //BA.debugLineNum = 1203;BA.debugLine="Dim pp As String = $\"${ID}Success\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Success");
 //BA.debugLineNum = 1204;BA.debugLine="vue.SetStateSingle(pp, varSuccess)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsuccess));
 //BA.debugLineNum = 1205;BA.debugLine="Combo.Bind(\":success\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":success",_pp);
 };
 //BA.debugLineNum = 1207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1208;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setsuccessmessages(Object _varsuccessmessages) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1211;BA.debugLine="Sub SetSuccessMessages(varSuccessMessages As Objec";
 //BA.debugLineNum = 1212;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1213;BA.debugLine="SetAttrSingle(\"success-messages\", varSuccessMess";
_setattrsingle("success-messages",BA.ObjectToString(_varsuccessmessages));
 }else {
 //BA.debugLineNum = 1215;BA.debugLine="Dim pp As String = $\"${ID}SuccessMessages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SuccessMessages");
 //BA.debugLineNum = 1216;BA.debugLine="vue.SetStateSingle(pp, varSuccessMessages)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varsuccessmessages);
 //BA.debugLineNum = 1217;BA.debugLine="Combo.Bind(\":success-messages\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":success-messages",_pp);
 };
 //BA.debugLineNum = 1219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setsuffix(String _varsuffix) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1223;BA.debugLine="Sub SetSuffix(varSuffix As String) As VMSelect";
 //BA.debugLineNum = 1224;BA.debugLine="If varSuffix = \"\" Then Return Me";
if ((_varsuffix).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1225;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1226;BA.debugLine="SetAttrSingle(\"suffix\", varSuffix)";
_setattrsingle("suffix",_varsuffix);
 }else {
 //BA.debugLineNum = 1228;BA.debugLine="Dim pp As String = $\"${ID}Suffix\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Suffix");
 //BA.debugLineNum = 1229;BA.debugLine="vue.SetStateSingle(pp, varSuffix)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsuffix));
 //BA.debugLineNum = 1230;BA.debugLine="Combo.Bind(\":suffix\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":suffix",_pp);
 };
 //BA.debugLineNum = 1232;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1233;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 1596;BA.debugLine="Sub SetTabIndex(ti As String) As VMSelect";
 //BA.debugLineNum = 1597;BA.debugLine="Combo.SetTabIndex(ti)";
_combo._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 1598;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1599;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _settext(String _t) throws Exception{
 //BA.debugLineNum = 423;BA.debugLine="Sub SetText(t As String) As VMSelect";
 //BA.debugLineNum = 424;BA.debugLine="Combo.SetText(t)";
_combo._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 425;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 1634;BA.debugLine="Sub SetTextColor(varColor As String) As VMSelect";
 //BA.debugLineNum = 1635;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 1636;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 1637;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1638;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 1641;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 1642;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 1643;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 1644;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 1645;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 1646;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1647;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _settype(String _vartype) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1236;BA.debugLine="Sub SetType(varType As String) As VMSelect";
 //BA.debugLineNum = 1237;BA.debugLine="If varType = \"\" Then Return Me";
if ((_vartype).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1238;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1239;BA.debugLine="SetAttrSingle(\"type\", varType)";
_setattrsingle("type",_vartype);
 }else {
 //BA.debugLineNum = 1241;BA.debugLine="Dim pp As String = $\"${ID}Type\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Type");
 //BA.debugLineNum = 1242;BA.debugLine="vue.SetStateSingle(pp, varType)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartype));
 //BA.debugLineNum = 1243;BA.debugLine="Combo.Bind(\":type\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":type",_pp);
 };
 //BA.debugLineNum = 1245;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1246;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setvalidateonblur(boolean _varvalidateonblur) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1249;BA.debugLine="Sub SetValidateOnBlur(varValidateOnBlur As Boolean";
 //BA.debugLineNum = 1250;BA.debugLine="If varValidateOnBlur = False Then Return Me";
if (_varvalidateonblur==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 1251;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1252;BA.debugLine="SetAttrSingle(\"validate-on-blur\", varValidateOnB";
_setattrsingle("validate-on-blur",BA.ObjectToString(_varvalidateonblur));
 }else {
 //BA.debugLineNum = 1254;BA.debugLine="Dim pp As String = $\"${ID}ValidateOnBlur\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ValidateOnBlur");
 //BA.debugLineNum = 1255;BA.debugLine="vue.SetStateSingle(pp, varValidateOnBlur)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalidateonblur));
 //BA.debugLineNum = 1256;BA.debugLine="Combo.Bind(\":validate-on-blur\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":validate-on-blur",_pp);
 };
 //BA.debugLineNum = 1258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 1262;BA.debugLine="Sub SetValue(varValue As String) As VMSelect";
 //BA.debugLineNum = 1263;BA.debugLine="Combo.SetValue(varValue, False)";
_combo._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 1264;BA.debugLine="vue.SetData(vmodel, varValue)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(_varvalue));
 //BA.debugLineNum = 1265;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1266;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setvaluecomparator(Object _varvaluecomparator) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1269;BA.debugLine="Sub SetValueComparator(varValueComparator As Objec";
 //BA.debugLineNum = 1270;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1271;BA.debugLine="SetAttrSingle(\"value-comparator\", varValueCompar";
_setattrsingle("value-comparator",BA.ObjectToString(_varvaluecomparator));
 }else {
 //BA.debugLineNum = 1273;BA.debugLine="Dim pp As String = $\"${ID}ValueComparator\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ValueComparator");
 //BA.debugLineNum = 1274;BA.debugLine="vue.SetStateSingle(pp, varValueComparator)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varvaluecomparator);
 //BA.debugLineNum = 1275;BA.debugLine="Combo.Bind(\":value-comparator\", pp)";
_combo._bind /*b4j.example.vmelement*/ (":value-comparator",_pp);
 };
 //BA.debugLineNum = 1277;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1278;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 400;BA.debugLine="Sub SetVIf(vif As String) As VMSelect";
 //BA.debugLineNum = 401;BA.debugLine="Combo.SetVIf(vif)";
_combo._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 402;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 1628;BA.debugLine="Sub SetVisible(b As Boolean) As VMSelect";
 //BA.debugLineNum = 1629;BA.debugLine="Combo.SetVisible(b)";
_combo._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 1630;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1631;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 394;BA.debugLine="Sub SetVModel(k As String) As VMSelect";
 //BA.debugLineNum = 395;BA.debugLine="vmodel = k.tolowercase";
_vmodel = _k.toLowerCase();
 //BA.debugLineNum = 396;BA.debugLine="Combo.SetVModel(k)";
_combo._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 397;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setvonce(boolean _t) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetVOnce(t As Boolean) As VMSelect";
 //BA.debugLineNum = 67;BA.debugLine="Combo.setvonce(t)";
_combo._setvonce /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Sub SetVShow(vif As String) As VMSelect";
 //BA.debugLineNum = 406;BA.debugLine="Combo.SetVShow(vif)";
_combo._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 407;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _show() throws Exception{
 //BA.debugLineNum = 1550;BA.debugLine="Sub Show As VMSelect";
 //BA.debugLineNum = 1551;BA.debugLine="Combo.SetVisible(True)";
_combo._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1552;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 1553;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 339;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 340;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 341;BA.debugLine="Dim eName As String = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 342;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 343;BA.debugLine="Log($\"VMSelect.${eName} event has not been defin";
__c.Log(("VMSelect."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 346;BA.debugLine="If hasItems Then";
if (_hasitems) { 
 //BA.debugLineNum = 347;BA.debugLine="SetItems(sitems)";
_setitems(_sitems);
 //BA.debugLineNum = 348;BA.debugLine="vue.SetData(sitems, items)";
_vue._setdata /*b4j.example.bananovue*/ (_sitems,(Object)(_items.getObject()));
 };
 //BA.debugLineNum = 350;BA.debugLine="If hasListItems Then SetListItems";
if (_haslistitems) { 
_setlistitems();};
 //BA.debugLineNum = 351;BA.debugLine="Return Combo.ToString";
if (true) return _combo._tostring /*String*/ ();
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return "";
}
public String  _update() throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Sub Update";
 //BA.debugLineNum = 356;BA.debugLine="SetItems(sitems)";
_setitems(_sitems);
 //BA.debugLineNum = 357;BA.debugLine="vue.SetData(sitems, items)";
_vue._setdata /*b4j.example.bananovue*/ (_sitems,(Object)(_items.getObject()));
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _useskeyvalue() throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub UsesKeyValue As VMSelect";
 //BA.debugLineNum = 222;BA.debugLine="SetItemText(\"value\")";
_setitemtext("value");
 //BA.debugLineNum = 223;BA.debugLine="SetItemValue(\"key\")";
_setitemvalue("key");
 //BA.debugLineNum = 224;BA.debugLine="SetReturnObject(False)";
_setreturnobject(__c.False);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _useslistitems() throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub UsesListItems As VMSelect";
 //BA.debugLineNum = 230;BA.debugLine="SetItemText(\"title\")";
_setitemtext("title");
 //BA.debugLineNum = 231;BA.debugLine="SetItemValue(\"key\")";
_setitemvalue("key");
 //BA.debugLineNum = 232;BA.debugLine="SetReturnObject(False)";
_setreturnobject(__c.False);
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 361;BA.debugLine="Sub UseTheme(themeName As String) As VMSelect";
 //BA.debugLineNum = 362;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 363;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 364;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 365;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 366;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
