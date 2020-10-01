package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmchipgroup extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmchipgroup", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmchipgroup.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _chipgroup = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public String _itemkey = "";
public anywheresoftware.b4a.objects.collections.List _items = null;
public boolean _hassubheading = false;
public String _heading = "";
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
public b4j.example.vmchipgroup  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 149;BA.debugLine="Sub AddChild(child As VMElement) As VMChipGroup";
 //BA.debugLineNum = 150;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 151;BA.debugLine="ChipGroup.SetText(childHTML)";
_chipgroup._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 185;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 186;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 187;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchipgroup  _addchip(b4j.example.vmchip _chip) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub AddChip(chip As VMChip) As VMChipGroup";
 //BA.debugLineNum = 45;BA.debugLine="SetText(chip.ToString)";
_settext((Object)(_chip._tostring /*String*/ ()));
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _addchip1(String _mkey,String _mtext,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses) throws Exception{
b4j.example.vmchip _mchip = null;
 //BA.debugLineNum = 55;BA.debugLine="Sub AddChip1(mkey As String, mtext As String, mpro";
 //BA.debugLineNum = 56;BA.debugLine="Dim mchip As VMChip";
_mchip = new b4j.example.vmchip();
 //BA.debugLineNum = 57;BA.debugLine="mchip.Initialize(vue, mkey, Module)";
_mchip._initialize /*b4j.example.vmchip*/ (ba,_vue,_mkey,_module);
 //BA.debugLineNum = 58;BA.debugLine="mchip.BuildModel(mprops, mstyles, lclasses, Null)";
_mchip._buildmodel /*b4j.example.vmchip*/ (_mprops,_mstyles,_lclasses,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 59;BA.debugLine="mchip.SetText(mtext)";
_mchip._settext /*b4j.example.vmchip*/ (_mtext);
 //BA.debugLineNum = 60;BA.debugLine="SetText(mchip.ToString)";
_settext((Object)(_mchip._tostring /*String*/ ()));
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub AddClass(c As String) As VMChipGroup";
 //BA.debugLineNum = 168;BA.debugLine="ChipGroup.AddClass(c)";
_chipgroup._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 492;BA.debugLine="Sub AddComponent(comp As String) As VMChipGroup";
 //BA.debugLineNum = 493;BA.debugLine="ChipGroup.SetText(comp)";
_chipgroup._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 494;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return null;
}
public String  _additem(String _ckey,boolean _boutlined,boolean _bfilter,String _ctext) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mchip = null;
 //BA.debugLineNum = 70;BA.debugLine="Sub AddItem(cKey As String, bOutlined As Boolean,";
 //BA.debugLineNum = 71;BA.debugLine="Dim mchip As Map = CreateMap()";
_mchip = new anywheresoftware.b4a.objects.collections.Map();
_mchip = __c.createMap(new Object[] {});
 //BA.debugLineNum = 72;BA.debugLine="mchip.Put(\"key\", cKey)";
_mchip.Put((Object)("key"),(Object)(_ckey));
 //BA.debugLineNum = 73;BA.debugLine="mchip.Put(\"outlined\", bOutlined)";
_mchip.Put((Object)("outlined"),(Object)(_boutlined));
 //BA.debugLineNum = 74;BA.debugLine="mchip.Put(\"filter\", bFilter)";
_mchip.Put((Object)("filter"),(Object)(_bfilter));
 //BA.debugLineNum = 75;BA.debugLine="mchip.Put(\"outlined\", bOutlined)";
_mchip.Put((Object)("outlined"),(Object)(_boutlined));
 //BA.debugLineNum = 76;BA.debugLine="mchip.Put(\"label\", cText)";
_mchip.Put((Object)("label"),(Object)(_ctext));
 //BA.debugLineNum = 77;BA.debugLine="items.Add(mchip)";
_items.Add((Object)(_mchip.getObject()));
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchipgroup  _additems(anywheresoftware.b4a.objects.collections.List _ctext) throws Exception{
String _k = "";
anywheresoftware.b4a.objects.collections.Map _mchip = null;
 //BA.debugLineNum = 81;BA.debugLine="Sub AddItems(cText As List) As VMChipGroup";
 //BA.debugLineNum = 82;BA.debugLine="For Each k As String In cText";
{
final anywheresoftware.b4a.BA.IterableList group1 = _ctext;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 83;BA.debugLine="Dim mchip As Map = CreateMap()";
_mchip = new anywheresoftware.b4a.objects.collections.Map();
_mchip = __c.createMap(new Object[] {});
 //BA.debugLineNum = 84;BA.debugLine="mchip.Put(\"label\", k)";
_mchip.Put((Object)("label"),(Object)(_k));
 //BA.debugLineNum = 85;BA.debugLine="mchip.Put(\"key\", k)";
_mchip.Put((Object)("key"),(Object)(_k));
 //BA.debugLineNum = 86;BA.debugLine="items.Add(mchip)";
_items.Add((Object)(_mchip.getObject()));
 }
};
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 503;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 504;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchipgroup  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 341;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 342;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 343;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 423;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 424;BA.debugLine="ChipGroup.BindStyleSingle(prop, value)";
_chipgroup._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 425;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 507;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 508;BA.debugLine="ChipGroup.BuildModel(mprops, mstyles, lclasses, lo";
_chipgroup._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 509;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 510;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ChipGroup As VMElement";
_chipgroup = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private itemKey As String";
_itemkey = "";
 //BA.debugLineNum = 10;BA.debugLine="Private items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 11;BA.debugLine="Private hasSubHeading As Boolean";
_hassubheading = false;
 //BA.debugLineNum = 12;BA.debugLine="Private heading As String";
_heading = "";
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchipgroup  _clear() throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub Clear As VMChipGroup";
 //BA.debugLineNum = 93;BA.debugLine="vue.SetData(itemKey, vue.NewList)";
_vue._setdata /*b4j.example.bananovue*/ (_itemkey,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 94;BA.debugLine="items.clear";
_items.Clear();
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _disable() throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub Disable As VMChipGroup";
 //BA.debugLineNum = 334;BA.debugLine="ChipGroup.Disable(True)";
_chipgroup._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _enable() throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub Enable As VMChipGroup";
 //BA.debugLineNum = 328;BA.debugLine="ChipGroup.Enable(True)";
_chipgroup._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _hide() throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub Hide As VMChipGroup";
 //BA.debugLineNum = 316;BA.debugLine="ChipGroup.SetVisible(False)";
_chipgroup._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 17;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 18;BA.debugLine="ChipGroup.Initialize(v, ID)";
_chipgroup._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 19;BA.debugLine="ChipGroup.SetTag(\"v-chip-group\")";
_chipgroup._settag /*b4j.example.vmelement*/ ("v-chip-group");
 //BA.debugLineNum = 20;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 22;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 23;BA.debugLine="itemKey = $\"${ID}items\"$";
_itemkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"items");
 //BA.debugLineNum = 24;BA.debugLine="vue.SetData(itemKey, vue.NewList)";
_vue._setdata /*b4j.example.bananovue*/ (_itemkey,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 25;BA.debugLine="items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 26;BA.debugLine="hasSubHeading = False";
_hassubheading = __c.False;
 //BA.debugLineNum = 27;BA.debugLine="heading = \"\"";
_heading = "";
 //BA.debugLineNum = 28;BA.debugLine="SetOnChange(Module, $\"${ID}_change\"$)";
_setonchange(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_change"));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 163;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchipgroup  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 374;BA.debugLine="public Sub RemoveAttr(sName As String) As VMChipGr";
 //BA.debugLineNum = 375;BA.debugLine="ChipGroup.RemoveAttr(sName)";
_chipgroup._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub Render";
 //BA.debugLineNum = 145;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchipgroup  _setactiveclass(Object _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 192;BA.debugLine="Sub SetActiveClass(varActiveClass As Object) As VM";
 //BA.debugLineNum = 193;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 194;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varactiveclass);
 //BA.debugLineNum = 195;BA.debugLine="ChipGroup.Bind(\":active-class\", pp)";
_chipgroup._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetAttr(attr As Map) As VMChipGroup";
 //BA.debugLineNum = 174;BA.debugLine="ChipGroup.SetAttr(attr)";
_chipgroup._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 443;BA.debugLine="Sub SetAttributes(attrs As List) As VMChipGroup";
 //BA.debugLineNum = 444;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 445;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 447;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 448;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Sub SetAttrLoose(loose As String) As VMChipGroup";
 //BA.debugLineNum = 348;BA.debugLine="ChipGroup.SetAttrLoose(loose)";
_chipgroup._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 418;BA.debugLine="ChipGroup.SetAttrSingle(prop, value)";
_chipgroup._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setcenteractive(Object _varcenteractive) throws Exception{
String _pp = "";
 //BA.debugLineNum = 200;BA.debugLine="Sub SetCenterActive(varCenterActive As Object) As";
 //BA.debugLineNum = 201;BA.debugLine="Dim pp As String = $\"${ID}CenterActive\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CenterActive");
 //BA.debugLineNum = 202;BA.debugLine="vue.SetStateSingle(pp, varCenterActive)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varcenteractive);
 //BA.debugLineNum = 203;BA.debugLine="ChipGroup.Bind(\":center-active\", pp)";
_chipgroup._bind /*b4j.example.vmelement*/ (":center-active",_pp);
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setcolor(Object _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 208;BA.debugLine="Sub SetColor(varColor As Object) As VMChipGroup";
 //BA.debugLineNum = 209;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 210;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varcolor);
 //BA.debugLineNum = 211;BA.debugLine="ChipGroup.Bind(\":color\", pp)";
_chipgroup._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 365;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 366;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 367;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 368;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 369;BA.debugLine="ChipGroup.Bind(\":color\", pp)";
_chipgroup._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setcolumn(Object _varcolumn) throws Exception{
String _pp = "";
 //BA.debugLineNum = 216;BA.debugLine="Sub SetColumn(varColumn As Object) As VMChipGroup";
 //BA.debugLineNum = 217;BA.debugLine="Dim pp As String = $\"${ID}Column\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Column");
 //BA.debugLineNum = 218;BA.debugLine="vue.SetStateSingle(pp, varColumn)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varcolumn);
 //BA.debugLineNum = 219;BA.debugLine="ChipGroup.Bind(\":column\", pp)";
_chipgroup._bind /*b4j.example.vmelement*/ (":column",_pp);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setdark(Object _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 224;BA.debugLine="Sub SetDark(varDark As Object) As VMChipGroup";
 //BA.debugLineNum = 225;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 226;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vardark);
 //BA.debugLineNum = 227;BA.debugLine="ChipGroup.Bind(\":dark\", pp)";
_chipgroup._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 50;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMChipGroup";
 //BA.debugLineNum = 393;BA.debugLine="ChipGroup.SetDesignMode(b)";
_chipgroup._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 394;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 395;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 472;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 473;BA.debugLine="ChipGroup.SetDeviceOffsets(OS, OM, OL, OX)";
_chipgroup._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 479;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 480;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 481;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 483;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 486;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 487;BA.debugLine="ChipGroup.SetDeviceSizes(SS, SM, SL, SX)";
_chipgroup._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 488;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 459;BA.debugLine="Sub SetKey(k As String) As VMChipGroup";
 //BA.debugLineNum = 460;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 461;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 462;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 463;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setlight(Object _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 232;BA.debugLine="Sub SetLight(varLight As Object) As VMChipGroup";
 //BA.debugLineNum = 233;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 234;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varlight);
 //BA.debugLineNum = 235;BA.debugLine="ChipGroup.Bind(\":light\", pp)";
_chipgroup._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setmandatory(Object _varmandatory) throws Exception{
String _pp = "";
 //BA.debugLineNum = 240;BA.debugLine="Sub SetMandatory(varMandatory As Object) As VMChip";
 //BA.debugLineNum = 241;BA.debugLine="Dim pp As String = $\"${ID}Mandatory\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Mandatory");
 //BA.debugLineNum = 242;BA.debugLine="vue.SetStateSingle(pp, varMandatory)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmandatory);
 //BA.debugLineNum = 243;BA.debugLine="ChipGroup.Bind(\":mandatory\", pp)";
_chipgroup._bind /*b4j.example.vmelement*/ (":mandatory",_pp);
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub SetMarginAll(p As String) As VMChipGroup";
 //BA.debugLineNum = 387;BA.debugLine="ChipGroup.setmarginall(p)";
_chipgroup._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setmax(Object _varmax) throws Exception{
String _pp = "";
 //BA.debugLineNum = 248;BA.debugLine="Sub SetMax(varMax As Object) As VMChipGroup";
 //BA.debugLineNum = 249;BA.debugLine="Dim pp As String = $\"${ID}Max\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Max");
 //BA.debugLineNum = 250;BA.debugLine="vue.SetStateSingle(pp, varMax)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmax);
 //BA.debugLineNum = 251;BA.debugLine="ChipGroup.Bind(\":max\", pp)";
_chipgroup._bind /*b4j.example.vmelement*/ (":max",_pp);
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setmobilebreakpoint(Object _varmobilebreakpoint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 256;BA.debugLine="Sub SetMobileBreakPoint(varMobileBreakPoint As Obj";
 //BA.debugLineNum = 257;BA.debugLine="Dim pp As String = $\"${ID}MobileBreakPoint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MobileBreakPoint");
 //BA.debugLineNum = 258;BA.debugLine="vue.SetStateSingle(pp, varMobileBreakPoint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmobilebreakpoint);
 //BA.debugLineNum = 259;BA.debugLine="ChipGroup.Bind(\":mobile-break-point\", pp)";
_chipgroup._bind /*b4j.example.vmelement*/ (":mobile-break-point",_pp);
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setmultiple(Object _varmultiple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 264;BA.debugLine="Sub SetMultiple(varMultiple As Object) As VMChipGr";
 //BA.debugLineNum = 265;BA.debugLine="Dim pp As String = $\"${ID}Multiple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Multiple");
 //BA.debugLineNum = 266;BA.debugLine="vue.SetStateSingle(pp, varMultiple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmultiple);
 //BA.debugLineNum = 267;BA.debugLine="ChipGroup.Bind(\":multiple\", pp)";
_chipgroup._bind /*b4j.example.vmelement*/ (":multiple",_pp);
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 406;BA.debugLine="ChipGroup.SetName(varName, bbind)";
_chipgroup._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 407;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setnexticon(Object _varnexticon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 272;BA.debugLine="Sub SetNextIcon(varNextIcon As Object) As VMChipGr";
 //BA.debugLineNum = 273;BA.debugLine="Dim pp As String = $\"${ID}NextIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NextIcon");
 //BA.debugLineNum = 274;BA.debugLine="vue.SetStateSingle(pp, varNextIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varnexticon);
 //BA.debugLineNum = 275;BA.debugLine="ChipGroup.Bind(\":next-icon\", pp)";
_chipgroup._bind /*b4j.example.vmelement*/ (":next-icon",_pp);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setonchange(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 302;BA.debugLine="Sub SetOnChange(eventHandler As Object, methodName";
 //BA.debugLineNum = 303;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 304;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmchipgroup)(this);};
 //BA.debugLineNum = 305;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 306;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 307;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 309;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 380;BA.debugLine="Sub SetPaddingAll(p As String) As VMChipGroup";
 //BA.debugLineNum = 381;BA.debugLine="ChipGroup.SetPaddingAll(p)";
_chipgroup._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 382;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setprevicon(Object _varprevicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 280;BA.debugLine="Sub SetPrevIcon(varPrevIcon As Object) As VMChipGr";
 //BA.debugLineNum = 281;BA.debugLine="Dim pp As String = $\"${ID}PrevIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrevIcon");
 //BA.debugLineNum = 282;BA.debugLine="vue.SetStateSingle(pp, varPrevIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varprevicon);
 //BA.debugLineNum = 283;BA.debugLine="ChipGroup.Bind(\":prev-icon\", pp)";
_chipgroup._bind /*b4j.example.vmelement*/ (":prev-icon",_pp);
 //BA.debugLineNum = 284;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 466;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMChi";
 //BA.debugLineNum = 467;BA.debugLine="ChipGroup.SetRC(sRow, sCol)";
_chipgroup._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 468;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setshowarrows(Object _varshowarrows) throws Exception{
String _pp = "";
 //BA.debugLineNum = 288;BA.debugLine="Sub SetShowArrows(varShowArrows As Object) As VMCh";
 //BA.debugLineNum = 289;BA.debugLine="Dim pp As String = $\"${ID}ShowArrows\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowArrows");
 //BA.debugLineNum = 290;BA.debugLine="vue.SetStateSingle(pp, varShowArrows)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varshowarrows);
 //BA.debugLineNum = 291;BA.debugLine="ChipGroup.Bind(\":show-arrows\", pp)";
_chipgroup._bind /*b4j.example.vmelement*/ (":show-arrows",_pp);
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetStyle(sm As Map) As VMChipGroup";
 //BA.debugLineNum = 180;BA.debugLine="ChipGroup.SetStyle(sm)";
_chipgroup._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 412;BA.debugLine="ChipGroup.SetStyleSingle(prop, value)";
_chipgroup._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 413;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setsubheading(String _hdr) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 32;BA.debugLine="Sub SetSubHeading(hdr As String) As VMChipGroup";
 //BA.debugLineNum = 33;BA.debugLine="hasSubHeading = True";
_hassubheading = __c.True;
 //BA.debugLineNum = 34;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 35;BA.debugLine="el.Initialize(vue, $\"${ID}hdr\"$)";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"hdr"));
 //BA.debugLineNum = 36;BA.debugLine="el.SetTag(\"span\")";
_el._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 37;BA.debugLine="el.SetText(hdr)";
_el._settext /*b4j.example.vmelement*/ (_hdr);
 //BA.debugLineNum = 38;BA.debugLine="el.AddClass(\"subheading\")";
_el._addclass /*b4j.example.vmelement*/ ("subheading");
 //BA.debugLineNum = 39;BA.debugLine="heading = el.tostring";
_heading = _el._tostring /*String*/ ();
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 399;BA.debugLine="Sub SetTabIndex(ti As String) As VMChipGroup";
 //BA.debugLineNum = 400;BA.debugLine="ChipGroup.SetTabIndex(ti)";
_chipgroup._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 401;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetText(t As Object) As VMChipGroup";
 //BA.debugLineNum = 157;BA.debugLine="ChipGroup.SetText(t)";
_chipgroup._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _settextcenter() throws Exception{
 //BA.debugLineNum = 498;BA.debugLine="Sub SetTextCenter As VMChipGroup";
 //BA.debugLineNum = 499;BA.debugLine="ChipGroup.AddClass(\"text-center\")";
_chipgroup._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 500;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 501;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 518;BA.debugLine="Sub SetTextColor(varColor As String) As VMChipGrou";
 //BA.debugLineNum = 519;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 520;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 521;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 522;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 525;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 526;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 527;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 528;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 529;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 530;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 531;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setvalue(Object _varvalue) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetValue(varValue As Object) As VMChipGroup";
 //BA.debugLineNum = 297;BA.debugLine="ChipGroup.SetValue(varValue, False)";
_chipgroup._setvalue /*b4j.example.vmelement*/ (BA.ObjectToString(_varvalue),__c.False);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 428;BA.debugLine="Sub SetVElse(vif As String) As VMChipGroup";
 //BA.debugLineNum = 429;BA.debugLine="ChipGroup.SetVElse(vif)";
_chipgroup._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 430;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 451;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 452;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 453;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 454;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 455;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 456;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 438;BA.debugLine="Sub SetVhtml(vhtml As String) As VMChipGroup";
 //BA.debugLineNum = 439;BA.debugLine="ChipGroup.SetVHtml(vhtml)";
_chipgroup._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 440;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 441;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetVIf(vif As String) As VMChipGroup";
 //BA.debugLineNum = 134;BA.debugLine="ChipGroup.SetVIf(vif)";
_chipgroup._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 512;BA.debugLine="Sub SetVisible(b As Boolean) As VMChipGroup";
 //BA.debugLineNum = 513;BA.debugLine="ChipGroup.SetVisible(b)";
_chipgroup._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 514;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetVModel(k As String) As VMChipGroup";
 //BA.debugLineNum = 129;BA.debugLine="ChipGroup.SetVModel(k)";
_chipgroup._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetVShow(vif As String) As VMChipGroup";
 //BA.debugLineNum = 139;BA.debugLine="ChipGroup.SetVShow(vif)";
_chipgroup._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 433;BA.debugLine="Sub SetVText(vhtml As String) As VMChipGroup";
 //BA.debugLineNum = 434;BA.debugLine="ChipGroup.SetVText(vhtml)";
_chipgroup._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 435;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchipgroup  _show() throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub Show As VMChipGroup";
 //BA.debugLineNum = 322;BA.debugLine="ChipGroup.SetVisible(True)";
_chipgroup._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
b4j.example.vmchip _xchip = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 99;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 100;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 101;BA.debugLine="Dim eName As String = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 102;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 103;BA.debugLine="Log($\"VMChipGroup.${eName} event has not been d";
__c.Log(("VMChipGroup."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 106;BA.debugLine="If items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 107;BA.debugLine="Dim xchip As VMChip";
_xchip = new b4j.example.vmchip();
 //BA.debugLineNum = 108;BA.debugLine="xchip.Initialize(vue, \"\", Module)";
_xchip._initialize /*b4j.example.vmchip*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 109;BA.debugLine="xchip.SetVFor(\"item\", itemKey)";
_xchip._setvfor /*b4j.example.vmchip*/ ("item",_itemkey);
 //BA.debugLineNum = 110;BA.debugLine="xchip.SetAttrSingle(\":outlined\", \"item.outlined\"";
_xchip._setattrsingle /*b4j.example.vmchip*/ (":outlined","item.outlined");
 //BA.debugLineNum = 111;BA.debugLine="xchip.SetAttrSingle(\":filter\", \"item.filter\")";
_xchip._setattrsingle /*b4j.example.vmchip*/ (":filter","item.filter");
 //BA.debugLineNum = 112;BA.debugLine="xchip.SetAttrSingle(\":key\", \"item.key\")";
_xchip._setattrsingle /*b4j.example.vmchip*/ (":key","item.key");
 //BA.debugLineNum = 113;BA.debugLine="xchip.SetAttrSingle(\":id\", \"item.key\")";
_xchip._setattrsingle /*b4j.example.vmchip*/ (":id","item.key");
 //BA.debugLineNum = 114;BA.debugLine="xchip.SetAttrSingle(\":value\", \"item.key\")";
_xchip._setattrsingle /*b4j.example.vmchip*/ (":value","item.key");
 //BA.debugLineNum = 115;BA.debugLine="xchip.SetText(\"{{ item.label }}\")";
_xchip._settext /*b4j.example.vmchip*/ ("{{ item.label }}");
 //BA.debugLineNum = 116;BA.debugLine="SetText(xchip.ToString)";
_settext((Object)(_xchip._tostring /*String*/ ()));
 //BA.debugLineNum = 117;BA.debugLine="Update";
_update();
 };
 //BA.debugLineNum = 119;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 120;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 121;BA.debugLine="If hasSubHeading Then";
if (_hassubheading) { 
 //BA.debugLineNum = 122;BA.debugLine="sb.Append(heading)";
_sb.Append(_heading);
 };
 //BA.debugLineNum = 124;BA.debugLine="sb.Append(ChipGroup.ToString)";
_sb.Append(_chipgroup._tostring /*String*/ ());
 //BA.debugLineNum = 125;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public String  _update() throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub Update";
 //BA.debugLineNum = 66;BA.debugLine="vue.SetData(itemKey, items)";
_vue._setdata /*b4j.example.bananovue*/ (_itemkey,(Object)(_items.getObject()));
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchipgroup  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 353;BA.debugLine="Sub UseTheme(themeName As String) As VMChipGroup";
 //BA.debugLineNum = 354;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 355;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 356;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 357;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 358;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchipgroup)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
