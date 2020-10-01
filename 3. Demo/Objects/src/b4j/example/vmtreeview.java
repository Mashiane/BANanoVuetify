package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtreeview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtreeview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtreeview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _treeview = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public String _sactive = "";
public boolean _loaded = false;
public boolean _bstatic = false;
public String _sopen = "";
public b4j.example.vmtemplate _iconslot = null;
public String _sselected = "";
public anywheresoftware.b4a.objects.collections.Map _extm = null;
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
public b4j.example.vmtreeview  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 225;BA.debugLine="Sub AddChild(child As VMElement) As VMTreeView";
 //BA.debugLineNum = 226;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 227;BA.debugLine="TreeView.SetText(childHTML)";
_treeview._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 261;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 262;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 263;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtreeview  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub AddClass(c As String) As VMTreeView";
 //BA.debugLineNum = 244;BA.debugLine="TreeView.AddClass(c)";
_treeview._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public String  _addextension(String _icon,String _fullicon) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub AddExtension(icon As String, fullicon As Strin";
 //BA.debugLineNum = 76;BA.debugLine="extm.Put(icon, fullicon)";
_extm.Put((Object)(_icon),(Object)(_fullicon));
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtreeview  _additem(String _parentid,String _key,String _text,String _mhref,String _micon,boolean _mdisabled) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 145;BA.debugLine="Sub AddItem(parentID As String, key As String, tex";
 //BA.debugLineNum = 146;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 147;BA.debugLine="key = key.tolowercase";
_key = _key.toLowerCase();
 //BA.debugLineNum = 148;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 149;BA.debugLine="mitem.Put(\"id\", key)";
_mitem.Put((Object)("id"),(Object)(_key));
 //BA.debugLineNum = 150;BA.debugLine="mitem.Put(\"name\", text)";
_mitem.Put((Object)("name"),(Object)(_text));
 //BA.debugLineNum = 151;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 152;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 153;BA.debugLine="mitem.Put(\"disabled\", mDisabled)";
_mitem.Put((Object)("disabled"),(Object)(_mdisabled));
 //BA.debugLineNum = 154;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 155;BA.debugLine="If extm.ContainsKey(mIcon) Then";
if (_extm.ContainsKey((Object)(_micon))) { 
 //BA.debugLineNum = 156;BA.debugLine="mIcon = extm.Get(mIcon)";
_micon = BA.ObjectToString(_extm.Get((Object)(_micon)));
 //BA.debugLineNum = 157;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 };
 //BA.debugLineNum = 159;BA.debugLine="items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 160;BA.debugLine="loaded = False";
_loaded = __c.False;
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 140;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 141;BA.debugLine="loaded = True";
_loaded = __c.True;
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtreeview  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 716;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 717;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 718;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 719;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 720;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 799;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 800;BA.debugLine="TreeView.BindStyleSingle(prop, value)";
_treeview._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 801;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 802;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 837;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 838;BA.debugLine="TreeView.BuildModel(mprops, mstyles, lclasses, loo";
_treeview._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 839;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 840;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public TreeView As VMElement";
_treeview = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean  'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="Private sActive As String";
_sactive = "";
 //BA.debugLineNum = 11;BA.debugLine="Private loaded As Boolean   'ignore";
_loaded = false;
 //BA.debugLineNum = 12;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 13;BA.debugLine="Private sOpen As String";
_sopen = "";
 //BA.debugLineNum = 14;BA.debugLine="Private IconSlot As VMTemplate";
_iconslot = new b4j.example.vmtemplate();
 //BA.debugLineNum = 15;BA.debugLine="Private sSelected As String";
_sselected = "";
 //BA.debugLineNum = 16;BA.debugLine="Private extm As Map";
_extm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _clear() throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub Clear";
 //BA.debugLineNum = 166;BA.debugLine="items.clear";
_items.Clear();
 //BA.debugLineNum = 167;BA.debugLine="SetItems(items)";
_setitems(_items);
 //BA.debugLineNum = 168;BA.debugLine="SetActive(vue.NewList)";
_setactive(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 169;BA.debugLine="SetValue(vue.NewList)";
_setvalue(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 170;BA.debugLine="SetOpen(vue.NewList)";
_setopen(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtreeview  _disable() throws Exception{
 //BA.debugLineNum = 709;BA.debugLine="Sub Disable As VMTreeView";
 //BA.debugLineNum = 710;BA.debugLine="TreeView.Disable(True)";
_treeview._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 711;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 712;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _enable() throws Exception{
 //BA.debugLineNum = 703;BA.debugLine="Sub Enable As VMTreeView";
 //BA.debugLineNum = 704;BA.debugLine="TreeView.Enable(True)";
_treeview._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 705;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 706;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getactive() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 97;BA.debugLine="Sub GetActive As List";
 //BA.debugLineNum = 98;BA.debugLine="Dim lst As List = vue.GetData(sActive)";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_vue._getdata /*Object*/ (_sactive)));
 //BA.debugLineNum = 99;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getopen() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 103;BA.debugLine="Sub GetOpen As List";
 //BA.debugLineNum = 104;BA.debugLine="Dim lst As List = vue.GetData(sOpen)";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_vue._getdata /*Object*/ (_sopen)));
 //BA.debugLineNum = 105;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getselected() throws Exception{
anywheresoftware.b4a.objects.collections.List _res = null;
 //BA.debugLineNum = 84;BA.debugLine="Sub GetSelected As List";
 //BA.debugLineNum = 85;BA.debugLine="Dim res As List = vue.GetData(sSelected)";
_res = new anywheresoftware.b4a.objects.collections.List();
_res = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_vue._getdata /*Object*/ (_sselected)));
 //BA.debugLineNum = 86;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _hide() throws Exception{
 //BA.debugLineNum = 691;BA.debugLine="Sub Hide As VMTreeView";
 //BA.debugLineNum = 692;BA.debugLine="TreeView.SetVisible(False)";
_treeview._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 693;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 694;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
b4j.example.vmicon _tvicon = null;
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 21;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 22;BA.debugLine="TreeView.Initialize(v, ID)";
_treeview._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 23;BA.debugLine="TreeView.SetTag(\"v-treeview\")";
_treeview._settag /*b4j.example.vmelement*/ ("v-treeview");
 //BA.debugLineNum = 24;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 26;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 27;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 28;BA.debugLine="extm = CreateMap()";
_extm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 30;BA.debugLine="sActive = $\"${ID}active\"$";
_sactive = (""+__c.SmartStringFormatter("",(Object)(_id))+"active");
 //BA.debugLineNum = 31;BA.debugLine="sOpen = $\"${ID}open\"$";
_sopen = (""+__c.SmartStringFormatter("",(Object)(_id))+"open");
 //BA.debugLineNum = 32;BA.debugLine="sSelected = $\"${ID}selected\"$";
_sselected = (""+__c.SmartStringFormatter("",(Object)(_id))+"selected");
 //BA.debugLineNum = 33;BA.debugLine="items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 34;BA.debugLine="SetActive(vue.NewList)";
_setactive(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 35;BA.debugLine="SetItems(vue.NewList)";
_setitems(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 36;BA.debugLine="SetOpen(vue.NewList)";
_setopen(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 37;BA.debugLine="SetVModel(sSelected)";
_setvmodel(_sselected);
 //BA.debugLineNum = 38;BA.debugLine="vue.SetData(sSelected, vue.NewList)";
_vue._setdata /*b4j.example.bananovue*/ (_sselected,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 39;BA.debugLine="SetExpandIcon(\"mdi-chevron-down\")";
_setexpandicon("mdi-chevron-down");
 //BA.debugLineNum = 40;BA.debugLine="loaded = False";
_loaded = __c.False;
 //BA.debugLineNum = 42;BA.debugLine="IconSlot.Initialize(vue, $\"${ID}iconslot\"$, Modul";
_iconslot._initialize /*b4j.example.vmtemplate*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"iconslot"),_module);
 //BA.debugLineNum = 43;BA.debugLine="IconSlot.SetSlotPrepend($\"{ item, ${sActive} }\"$)";
_iconslot._setslotprepend /*b4j.example.vmtemplate*/ (("{ item, "+__c.SmartStringFormatter("",(Object)(_sactive))+" }"));
 //BA.debugLineNum = 44;BA.debugLine="Dim tvicon As VMIcon";
_tvicon = new b4j.example.vmicon();
 //BA.debugLineNum = 45;BA.debugLine="tvicon.Initialize(vue,\"\", Module).SetVIf(\"item.ic";
_tvicon._initialize /*b4j.example.vmicon*/ (ba,_vue,"",_module)._setvif /*b4j.example.vmicon*/ ("item.icon")._setvtext /*b4j.example.vmicon*/ ("item.icon");
 //BA.debugLineNum = 46;BA.debugLine="IconSlot.AddComponent(tvicon.ToString)";
_iconslot._addcomponent /*b4j.example.vmtemplate*/ (_tvicon._tostring /*String*/ ());
 //BA.debugLineNum = 47;BA.debugLine="SetItemKey(\"id\")";
_setitemkey("id");
 //BA.debugLineNum = 48;BA.debugLine="SetItemText(\"name\")";
_setitemtext("name");
 //BA.debugLineNum = 49;BA.debugLine="SetOpenOnClick(True)";
_setopenonclick(__c.True);
 //BA.debugLineNum = 50;BA.debugLine="SetTransition(True)";
_settransition(__c.True);
 //BA.debugLineNum = 51;BA.debugLine="SetOnUpdateActive";
_setonupdateactive();
 //BA.debugLineNum = 52;BA.debugLine="SetOnUpdateOpen";
_setonupdateopen();
 //BA.debugLineNum = 53;BA.debugLine="SetOnInput";
_setoninput();
 //BA.debugLineNum = 55;BA.debugLine="extm.Put(\"html\", \"mdi-language-html5\")";
_extm.Put((Object)("html"),(Object)("mdi-language-html5"));
 //BA.debugLineNum = 56;BA.debugLine="extm.Put(\"js\", \"mdi-nodejs\")";
_extm.Put((Object)("js"),(Object)("mdi-nodejs"));
 //BA.debugLineNum = 57;BA.debugLine="extm.Put(\"json\", \"mdi-code-json\")";
_extm.Put((Object)("json"),(Object)("mdi-code-json"));
 //BA.debugLineNum = 58;BA.debugLine="extm.Put(\"md\", \"mdi-markdown\")";
_extm.Put((Object)("md"),(Object)("mdi-markdown"));
 //BA.debugLineNum = 59;BA.debugLine="extm.Put(\"pdf\", \"mdi-file-pdf\")";
_extm.Put((Object)("pdf"),(Object)("mdi-file-pdf"));
 //BA.debugLineNum = 60;BA.debugLine="extm.Put(\"png\", \"mdi-file-image\")";
_extm.Put((Object)("png"),(Object)("mdi-file-image"));
 //BA.debugLineNum = 61;BA.debugLine="extm.Put(\"txt\", \"mdi-file-document-outline\")";
_extm.Put((Object)("txt"),(Object)("mdi-file-document-outline"));
 //BA.debugLineNum = 62;BA.debugLine="extm.Put(\"xls\", \"mdi-file-excel\")";
_extm.Put((Object)("xls"),(Object)("mdi-file-excel"));
 //BA.debugLineNum = 63;BA.debugLine="extm.Put(\"csv\", \"mdi-file-delimited-outline\")";
_extm.Put((Object)("csv"),(Object)("mdi-file-delimited-outline"));
 //BA.debugLineNum = 64;BA.debugLine="extm.Put(\"pre\", \"mdi-file-code-outline\")";
_extm.Put((Object)("pre"),(Object)("mdi-file-code-outline"));
 //BA.debugLineNum = 65;BA.debugLine="extm.Put(\"code\", \"mdi-file-code-outline\")";
_extm.Put((Object)("code"),(Object)("mdi-file-code-outline"));
 //BA.debugLineNum = 66;BA.debugLine="extm.Put(\"doc\", \"mdi-file-word-box-outline\")";
_extm.Put((Object)("doc"),(Object)("mdi-file-word-box-outline"));
 //BA.debugLineNum = 67;BA.debugLine="extm.Put(\"mp3\", \"mdi-file-music-outline\")";
_extm.Put((Object)("mp3"),(Object)("mdi-file-music-outline"));
 //BA.debugLineNum = 68;BA.debugLine="extm.Put(\"folder\", \"mdi-folder\")";
_extm.Put((Object)("folder"),(Object)("mdi-folder"));
 //BA.debugLineNum = 69;BA.debugLine="extm.Put(\"woff\", \"marketweb-webfont.woff\")";
_extm.Put((Object)("woff"),(Object)("marketweb-webfont.woff"));
 //BA.debugLineNum = 70;BA.debugLine="extm.Put(\"css\", \"mdi-language-css3\")";
_extm.Put((Object)("css"),(Object)("mdi-language-css3"));
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 239;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtreeview  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 750;BA.debugLine="public Sub RemoveAttr(sName As String) As VMTreeVi";
 //BA.debugLineNum = 751;BA.debugLine="TreeView.RemoveAttr(sName)";
_treeview._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 752;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 753;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub Render";
 //BA.debugLineNum = 221;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtreeview  _setactivatable(boolean _varactivatable) throws Exception{
String _pp = "";
 //BA.debugLineNum = 268;BA.debugLine="Sub SetActivatable(varActivatable As Boolean) As V";
 //BA.debugLineNum = 269;BA.debugLine="If varActivatable = False Then Return Me";
if (_varactivatable==__c.False) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 270;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 271;BA.debugLine="SetAttrSingle(\"activatable\", varActivatable)";
_setattrsingle("activatable",BA.ObjectToString(_varactivatable));
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 274;BA.debugLine="Dim pp As String = $\"${ID}Activatable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Activatable");
 //BA.debugLineNum = 275;BA.debugLine="vue.SetStateSingle(pp, varActivatable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactivatable));
 //BA.debugLineNum = 276;BA.debugLine="TreeView.Bind(\":activatable\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":activatable",_pp);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setactive(anywheresoftware.b4a.objects.collections.List _varactive) throws Exception{
String _pp = "";
 //BA.debugLineNum = 431;BA.debugLine="Sub SetActive(varActive As List) As VMTreeView";
 //BA.debugLineNum = 432;BA.debugLine="Dim pp As String = $\"${ID}Active\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Active");
 //BA.debugLineNum = 433;BA.debugLine="vue.SetStateSingle(pp, varActive)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactive.getObject()));
 //BA.debugLineNum = 434;BA.debugLine="TreeView.Bind(\":active.sync\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":active.sync",_pp);
 //BA.debugLineNum = 435;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 439;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 440;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 441;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 442;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 443;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 445;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 446;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 447;BA.debugLine="TreeView.Bind(\":active-class\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub SetAttr(attr As Map) As VMTreeView";
 //BA.debugLineNum = 250;BA.debugLine="TreeView.SetAttr(attr)";
_treeview._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 815;BA.debugLine="Sub SetAttributes(attrs As List) As VMTreeView";
 //BA.debugLineNum = 816;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 817;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 819;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 820;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 723;BA.debugLine="Sub SetAttrLoose(loose As String) As VMTreeView";
 //BA.debugLineNum = 724;BA.debugLine="TreeView.SetAttrLoose(loose)";
_treeview._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 725;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 726;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 793;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 794;BA.debugLine="TreeView.SetAttrSingle(prop, value)";
_treeview._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 795;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 796;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 452;BA.debugLine="Sub SetColor(varColor As String) As VMTreeView";
 //BA.debugLineNum = 453;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 454;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 455;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 456;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 458;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 459;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 460;BA.debugLine="TreeView.Bind(\":color\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 461;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 741;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 742;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 743;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 744;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 745;BA.debugLine="TreeView.Bind(\":color\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 746;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 747;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 281;BA.debugLine="Sub SetDark(varDark As Boolean) As VMTreeView";
 //BA.debugLineNum = 282;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 283;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 284;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 287;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 288;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 289;BA.debugLine="TreeView.Bind(\":dark\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 90;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public String  _setdatasource(anywheresoftware.b4a.objects.collections.List _recs) throws Exception{
anywheresoftware.b4a.objects.collections.List _unflat = null;
 //BA.debugLineNum = 198;BA.debugLine="private Sub SetDataSource(recs As List)";
 //BA.debugLineNum = 199;BA.debugLine="Dim unflat As List = vue.Unflatten(recs, \"childre";
_unflat = new anywheresoftware.b4a.objects.collections.List();
_unflat = _vue._unflatten /*anywheresoftware.b4a.objects.collections.List*/ (_recs,"children");
 //BA.debugLineNum = 200;BA.debugLine="vue.SetData($\"${ID}items\"$, unflat)";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"items"),(Object)(_unflat.getObject()));
 //BA.debugLineNum = 201;BA.debugLine="loaded = True";
_loaded = __c.True;
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtreeview  _setdense(boolean _vardense) throws Exception{
String _pp = "";
 //BA.debugLineNum = 294;BA.debugLine="Sub SetDense(varDense As Boolean) As VMTreeView";
 //BA.debugLineNum = 295;BA.debugLine="If varDense = False Then Return Me";
if (_vardense==__c.False) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 296;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 297;BA.debugLine="SetAttrSingle(\"dense\", varDense)";
_setattrsingle("dense",BA.ObjectToString(_vardense));
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 300;BA.debugLine="Dim pp As String = $\"${ID}Dense\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dense");
 //BA.debugLineNum = 301;BA.debugLine="vue.SetStateSingle(pp, varDense)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardense));
 //BA.debugLineNum = 302;BA.debugLine="TreeView.Bind(\":dense\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":dense",_pp);
 //BA.debugLineNum = 303;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 768;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMTreeView";
 //BA.debugLineNum = 769;BA.debugLine="TreeView.SetDesignMode(b)";
_treeview._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 770;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 771;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 772;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 122;BA.debugLine="TreeView.SetDeviceOffsets(OS, OM, OL, OX)";
_treeview._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 134;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 135;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 128;BA.debugLine="TreeView.SetDeviceSizes(SS, SM, SL, SX)";
_treeview._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setexpandicon(String _varexpandicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 465;BA.debugLine="Sub SetExpandIcon(varExpandIcon As String) As VMTr";
 //BA.debugLineNum = 466;BA.debugLine="If varExpandIcon = \"\" Then Return Me";
if ((_varexpandicon).equals("")) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 467;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 468;BA.debugLine="SetAttrSingle(\"expand-icon\", varExpandIcon)";
_setattrsingle("expand-icon",_varexpandicon);
 //BA.debugLineNum = 469;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 471;BA.debugLine="Dim pp As String = $\"${ID}ExpandIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ExpandIcon");
 //BA.debugLineNum = 472;BA.debugLine="vue.SetStateSingle(pp, varExpandIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexpandicon));
 //BA.debugLineNum = 473;BA.debugLine="TreeView.Bind(\":expand-icon\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":expand-icon",_pp);
 //BA.debugLineNum = 474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _sethoverable(boolean _varhoverable) throws Exception{
String _pp = "";
 //BA.debugLineNum = 307;BA.debugLine="Sub SetHoverable(varHoverable As Boolean) As VMTre";
 //BA.debugLineNum = 308;BA.debugLine="If varHoverable = False Then Return Me";
if (_varhoverable==__c.False) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 309;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 310;BA.debugLine="SetAttrSingle(\"hoverable\", varHoverable)";
_setattrsingle("hoverable",BA.ObjectToString(_varhoverable));
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 313;BA.debugLine="Dim pp As String = $\"${ID}Hoverable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Hoverable");
 //BA.debugLineNum = 314;BA.debugLine="vue.SetStateSingle(pp, varHoverable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhoverable));
 //BA.debugLineNum = 315;BA.debugLine="TreeView.Bind(\":hoverable\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":hoverable",_pp);
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setindeterminateicon(String _varindeterminateicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 478;BA.debugLine="Sub SetIndeterminateIcon(varIndeterminateIcon As S";
 //BA.debugLineNum = 479;BA.debugLine="If varIndeterminateIcon = \"\" Then Return Me";
if ((_varindeterminateicon).equals("")) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 480;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 481;BA.debugLine="SetAttrSingle(\"indeterminate-icon\", varIndetermi";
_setattrsingle("indeterminate-icon",_varindeterminateicon);
 //BA.debugLineNum = 482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 484;BA.debugLine="Dim pp As String = $\"${ID}IndeterminateIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"IndeterminateIcon");
 //BA.debugLineNum = 485;BA.debugLine="vue.SetStateSingle(pp, varIndeterminateIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varindeterminateicon));
 //BA.debugLineNum = 486;BA.debugLine="TreeView.Bind(\":indeterminate-icon\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":indeterminate-icon",_pp);
 //BA.debugLineNum = 487;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 488;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setitemchildren(String _varitemchildren) throws Exception{
 //BA.debugLineNum = 491;BA.debugLine="Sub SetItemChildren(varItemChildren As String) As";
 //BA.debugLineNum = 492;BA.debugLine="If varItemChildren = \"\" Then Return Me";
if ((_varitemchildren).equals("")) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 493;BA.debugLine="SetAttrSingle(\"item-children\", varItemChildren)";
_setattrsingle("item-children",_varitemchildren);
 //BA.debugLineNum = 494;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setitemdisabled(String _varitemdisabled) throws Exception{
 //BA.debugLineNum = 498;BA.debugLine="Sub SetItemDisabled(varItemDisabled As String) As";
 //BA.debugLineNum = 499;BA.debugLine="If varItemDisabled = \"\" Then Return Me";
if ((_varitemdisabled).equals("")) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 500;BA.debugLine="SetAttrSingle(\"item-disabled\", varItemDisabled)";
_setattrsingle("item-disabled",_varitemdisabled);
 //BA.debugLineNum = 501;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 502;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setitemkey(String _varitemkey) throws Exception{
 //BA.debugLineNum = 505;BA.debugLine="Sub SetItemKey(varItemKey As String) As VMTreeView";
 //BA.debugLineNum = 506;BA.debugLine="If varItemKey = \"\" Then Return Me";
if ((_varitemkey).equals("")) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 507;BA.debugLine="SetAttrSingle(\"item-key\", varItemKey)";
_setattrsingle("item-key",_varitemkey);
 //BA.debugLineNum = 508;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 509;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setitems(anywheresoftware.b4a.objects.collections.List _varitems) throws Exception{
String _pp = "";
 //BA.debugLineNum = 519;BA.debugLine="Sub SetItems(varItems As List) As VMTreeView";
 //BA.debugLineNum = 520;BA.debugLine="Dim pp As String = $\"${ID}Items\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Items");
 //BA.debugLineNum = 521;BA.debugLine="vue.SetStateSingle(pp, varItems)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varitems.getObject()));
 //BA.debugLineNum = 522;BA.debugLine="TreeView.Bind(\":items\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":items",_pp);
 //BA.debugLineNum = 523;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 524;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setitemtext(String _varitemtext) throws Exception{
 //BA.debugLineNum = 512;BA.debugLine="Sub SetItemText(varItemText As String) As VMTreeVi";
 //BA.debugLineNum = 513;BA.debugLine="If varItemText = \"\" Then Return Me";
if ((_varitemtext).equals("")) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 514;BA.debugLine="SetAttrSingle(\"item-text\", varItemText)";
_setattrsingle("item-text",_varitemtext);
 //BA.debugLineNum = 515;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 516;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 831;BA.debugLine="Sub SetKey(k As String) As VMTreeView";
 //BA.debugLineNum = 832;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 833;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 834;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 835;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 320;BA.debugLine="Sub SetLight(varLight As Boolean) As VMTreeView";
 //BA.debugLineNum = 321;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 322;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 323;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 326;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 327;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 328;BA.debugLine="TreeView.Bind(\":light\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setloadingicon(String _varloadingicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 527;BA.debugLine="Sub SetLoadingIcon(varLoadingIcon As String) As VM";
 //BA.debugLineNum = 528;BA.debugLine="If varLoadingIcon = \"\" Then Return Me";
if ((_varloadingicon).equals("")) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 529;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 530;BA.debugLine="SetAttrSingle(\"loading-icon\", varLoadingIcon)";
_setattrsingle("loading-icon",_varloadingicon);
 //BA.debugLineNum = 531;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 533;BA.debugLine="Dim pp As String = $\"${ID}LoadingIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"LoadingIcon");
 //BA.debugLineNum = 534;BA.debugLine="vue.SetStateSingle(pp, varLoadingIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloadingicon));
 //BA.debugLineNum = 535;BA.debugLine="TreeView.Bind(\":loading-icon\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":loading-icon",_pp);
 //BA.debugLineNum = 536;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 537;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 762;BA.debugLine="Sub SetMarginAll(p As String) As VMTreeView";
 //BA.debugLineNum = 763;BA.debugLine="TreeView.setmarginall(p)";
_treeview._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 764;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 765;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setmultipleactive(boolean _varmultipleactive) throws Exception{
String _pp = "";
 //BA.debugLineNum = 333;BA.debugLine="Sub SetMultipleActive(varMultipleActive As Boolean";
 //BA.debugLineNum = 334;BA.debugLine="If varMultipleActive = False Then Return Me";
if (_varmultipleactive==__c.False) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 335;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 336;BA.debugLine="SetAttrSingle(\"multiple-active\", varMultipleActi";
_setattrsingle("multiple-active",BA.ObjectToString(_varmultipleactive));
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 339;BA.debugLine="Dim pp As String = $\"${ID}MultipleActive\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MultipleActive");
 //BA.debugLineNum = 340;BA.debugLine="vue.SetStateSingle(pp, varMultipleActive)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmultipleactive));
 //BA.debugLineNum = 341;BA.debugLine="TreeView.Bind(\":multiple-active\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":multiple-active",_pp);
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 781;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 782;BA.debugLine="TreeView.SetName(varName, bbind)";
_treeview._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 783;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 784;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setofficon(String _varofficon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 540;BA.debugLine="Sub SetOffIcon(varOffIcon As String) As VMTreeView";
 //BA.debugLineNum = 541;BA.debugLine="If varOffIcon = \"\" Then Return Me";
if ((_varofficon).equals("")) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 542;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 543;BA.debugLine="SetAttrSingle(\"off-icon\", varOffIcon)";
_setattrsingle("off-icon",_varofficon);
 //BA.debugLineNum = 544;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 546;BA.debugLine="Dim pp As String = $\"${ID}OffIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OffIcon");
 //BA.debugLineNum = 547;BA.debugLine="vue.SetStateSingle(pp, varOffIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varofficon));
 //BA.debugLineNum = 548;BA.debugLine="TreeView.Bind(\":off-icon\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":off-icon",_pp);
 //BA.debugLineNum = 549;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 550;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setonicon(String _varonicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 553;BA.debugLine="Sub SetOnIcon(varOnIcon As String) As VMTreeView";
 //BA.debugLineNum = 554;BA.debugLine="If varOnIcon = \"\" Then Return Me";
if ((_varonicon).equals("")) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 555;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 556;BA.debugLine="SetAttrSingle(\"on-icon\", varOnIcon)";
_setattrsingle("on-icon",_varonicon);
 //BA.debugLineNum = 557;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 559;BA.debugLine="Dim pp As String = $\"${ID}OnIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OnIcon");
 //BA.debugLineNum = 560;BA.debugLine="vue.SetStateSingle(pp, varOnIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varonicon));
 //BA.debugLineNum = 561;BA.debugLine="TreeView.Bind(\":on-icon\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":on-icon",_pp);
 //BA.debugLineNum = 562;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setoninput() throws Exception{
String _methodname = "";
Object _xitems = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 654;BA.debugLine="Sub SetOnInput As VMTreeView";
 //BA.debugLineNum = 655;BA.debugLine="Dim methodName As String = $\"${ID}_input\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_input");
 //BA.debugLineNum = 656;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 657;BA.debugLine="Dim xitems As Object";
_xitems = new Object();
 //BA.debugLineNum = 658;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_xitems}))));
 //BA.debugLineNum = 659;BA.debugLine="SetAttr(CreateMap(\"@input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_methodname)}));
 //BA.debugLineNum = 661;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 662;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 663;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setonupdateactive() throws Exception{
String _methodname = "";
Object _xitems = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 666;BA.debugLine="Sub SetOnUpdateActive As VMTreeView";
 //BA.debugLineNum = 667;BA.debugLine="Dim methodName As String = $\"${ID}_updateactive\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_updateactive");
 //BA.debugLineNum = 668;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 669;BA.debugLine="Dim xitems As Object";
_xitems = new Object();
 //BA.debugLineNum = 670;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_xitems}))));
 //BA.debugLineNum = 671;BA.debugLine="SetAttr(CreateMap(\"@update:active\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:active"),(Object)(_methodname)}));
 //BA.debugLineNum = 673;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 674;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 675;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setonupdateopen() throws Exception{
String _methodname = "";
Object _xitems = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 678;BA.debugLine="Sub SetOnUpdateOpen As VMTreeView";
 //BA.debugLineNum = 679;BA.debugLine="Dim methodName As String = $\"${ID}_updateopen\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_updateopen");
 //BA.debugLineNum = 680;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 681;BA.debugLine="Dim xitems As Object";
_xitems = new Object();
 //BA.debugLineNum = 682;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_xitems}))));
 //BA.debugLineNum = 683;BA.debugLine="SetAttr(CreateMap(\"@update:open\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:open"),(Object)(_methodname)}));
 //BA.debugLineNum = 685;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 686;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 687;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setopen(anywheresoftware.b4a.objects.collections.List _varopen) throws Exception{
String _pp = "";
 //BA.debugLineNum = 566;BA.debugLine="Sub SetOpen(varOpen As List) As VMTreeView";
 //BA.debugLineNum = 567;BA.debugLine="Dim pp As String = $\"${ID}Open\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Open");
 //BA.debugLineNum = 568;BA.debugLine="vue.SetStateSingle(pp, varOpen)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varopen.getObject()));
 //BA.debugLineNum = 569;BA.debugLine="TreeView.Bind(\":open.sync\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":open.sync",_pp);
 //BA.debugLineNum = 570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 571;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setopenall(boolean _varopenall) throws Exception{
String _pp = "";
 //BA.debugLineNum = 346;BA.debugLine="Sub SetOpenAll(varOpenAll As Boolean) As VMTreeVie";
 //BA.debugLineNum = 347;BA.debugLine="If varOpenAll = False Then Return Me";
if (_varopenall==__c.False) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 348;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 349;BA.debugLine="SetAttrSingle(\"open-all\", varOpenAll)";
_setattrsingle("open-all",BA.ObjectToString(_varopenall));
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 352;BA.debugLine="Dim pp As String = $\"${ID}OpenAll\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OpenAll");
 //BA.debugLineNum = 353;BA.debugLine="vue.SetStateSingle(pp, varOpenAll)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varopenall));
 //BA.debugLineNum = 354;BA.debugLine="TreeView.Bind(\":open-all\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":open-all",_pp);
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setopenonclick(boolean _varopenonclick) throws Exception{
String _pp = "";
 //BA.debugLineNum = 359;BA.debugLine="Sub SetOpenOnClick(varOpenOnClick As Boolean) As V";
 //BA.debugLineNum = 360;BA.debugLine="If varOpenOnClick = False Then Return Me";
if (_varopenonclick==__c.False) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 361;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 362;BA.debugLine="SetAttrSingle(\"open-on-click\", varOpenOnClick)";
_setattrsingle("open-on-click",BA.ObjectToString(_varopenonclick));
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 365;BA.debugLine="Dim pp As String = $\"${ID}OpenOnClick\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OpenOnClick");
 //BA.debugLineNum = 366;BA.debugLine="vue.SetStateSingle(pp, varOpenOnClick)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varopenonclick));
 //BA.debugLineNum = 367;BA.debugLine="TreeView.Bind(\":open-on-click\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":open-on-click",_pp);
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 756;BA.debugLine="Sub SetPaddingAll(p As String) As VMTreeView";
 //BA.debugLineNum = 757;BA.debugLine="TreeView.SetPaddingAll(p)";
_treeview._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 758;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 759;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMTre";
 //BA.debugLineNum = 116;BA.debugLine="TreeView.SetRC(sRow, sCol)";
_treeview._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setreturnobject(boolean _varreturnobject) throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Sub SetReturnObject(varReturnObject As Boolean) As";
 //BA.debugLineNum = 373;BA.debugLine="If varReturnObject = False Then Return Me";
if (_varreturnobject==__c.False) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 374;BA.debugLine="TreeView.Bind(\":return-object\", varReturnObject)";
_treeview._bind /*b4j.example.vmelement*/ (":return-object",BA.ObjectToString(_varreturnobject));
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setrounded(boolean _varrounded) throws Exception{
String _pp = "";
 //BA.debugLineNum = 379;BA.debugLine="Sub SetRounded(varRounded As Boolean) As VMTreeVie";
 //BA.debugLineNum = 380;BA.debugLine="If varRounded = False Then Return Me";
if (_varrounded==__c.False) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 381;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 382;BA.debugLine="SetAttrSingle(\"rounded\", varRounded)";
_setattrsingle("rounded",BA.ObjectToString(_varrounded));
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 385;BA.debugLine="Dim pp As String = $\"${ID}Rounded\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Rounded");
 //BA.debugLineNum = 386;BA.debugLine="vue.SetStateSingle(pp, varRounded)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varrounded));
 //BA.debugLineNum = 387;BA.debugLine="TreeView.Bind(\":rounded\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":rounded",_pp);
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setsearch(String _varsearch) throws Exception{
String _pp = "";
 //BA.debugLineNum = 574;BA.debugLine="Sub SetSearch(varSearch As String) As VMTreeView";
 //BA.debugLineNum = 575;BA.debugLine="If varSearch = \"\" Then Return Me";
if ((_varsearch).equals("")) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 576;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 577;BA.debugLine="SetAttrSingle(\"search\", varSearch)";
_setattrsingle("search",_varsearch);
 //BA.debugLineNum = 578;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 580;BA.debugLine="Dim pp As String = $\"${ID}Search\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Search");
 //BA.debugLineNum = 581;BA.debugLine="vue.SetStateSingle(pp, varSearch)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsearch));
 //BA.debugLineNum = 582;BA.debugLine="TreeView.Bind(\":search\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":search",_pp);
 //BA.debugLineNum = 583;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 584;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setselectable(boolean _varselectable) throws Exception{
String _pp = "";
 //BA.debugLineNum = 392;BA.debugLine="Sub SetSelectable(varSelectable As Boolean) As VMT";
 //BA.debugLineNum = 393;BA.debugLine="If varSelectable = False Then Return Me";
if (_varselectable==__c.False) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 394;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 395;BA.debugLine="SetAttrSingle(\"selectable\", varSelectable)";
_setattrsingle("selectable",BA.ObjectToString(_varselectable));
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 398;BA.debugLine="Dim pp As String = $\"${ID}Selectable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Selectable");
 //BA.debugLineNum = 399;BA.debugLine="vue.SetStateSingle(pp, varSelectable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varselectable));
 //BA.debugLineNum = 400;BA.debugLine="TreeView.Bind(\":selectable\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":selectable",_pp);
 //BA.debugLineNum = 401;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return null;
}
public String  _setselected(anywheresoftware.b4a.objects.collections.List _xitems) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetSelected(xitems As List)";
 //BA.debugLineNum = 81;BA.debugLine="vue.SetData(sSelected, xitems)";
_vue._setdata /*b4j.example.bananovue*/ (_sselected,(Object)(_xitems.getObject()));
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtreeview  _setselectedcolor(String _varselectedcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 587;BA.debugLine="Sub SetSelectedColor(varSelectedColor As String) A";
 //BA.debugLineNum = 588;BA.debugLine="If varSelectedColor = \"\" Then Return Me";
if ((_varselectedcolor).equals("")) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 589;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 590;BA.debugLine="SetAttrSingle(\"selected-color\", varSelectedColor";
_setattrsingle("selected-color",_varselectedcolor);
 //BA.debugLineNum = 591;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 593;BA.debugLine="Dim pp As String = $\"${ID}SelectedColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SelectedColor");
 //BA.debugLineNum = 594;BA.debugLine="vue.SetStateSingle(pp, varSelectedColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varselectedcolor));
 //BA.debugLineNum = 595;BA.debugLine="TreeView.Bind(\":selected-color\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":selected-color",_pp);
 //BA.debugLineNum = 596;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 597;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setselectedcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 601;BA.debugLine="Sub SetSelectedColorIntensity(varColor As String,";
 //BA.debugLineNum = 602;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 603;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 604;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 605;BA.debugLine="SetAttrSingle(\"selected-color\", scolor)";
_setattrsingle("selected-color",_scolor);
 //BA.debugLineNum = 606;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 608;BA.debugLine="Dim pp As String = $\"${ID}SelectedColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SelectedColor");
 //BA.debugLineNum = 609;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 610;BA.debugLine="TreeView.Bind(\":selected-color\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":selected-color",_pp);
 //BA.debugLineNum = 611;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 612;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setselectiontype(String _varselectiontype) throws Exception{
String _pp = "";
 //BA.debugLineNum = 616;BA.debugLine="Sub SetSelectionType(varSelectionType As String) A";
 //BA.debugLineNum = 617;BA.debugLine="If varSelectionType = \"\" Then Return Me";
if ((_varselectiontype).equals("")) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 618;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 619;BA.debugLine="SetAttrSingle(\"selection-type\", varSelectionType";
_setattrsingle("selection-type",_varselectiontype);
 //BA.debugLineNum = 620;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 622;BA.debugLine="Dim pp As String = $\"${ID}SelectionType\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SelectionType");
 //BA.debugLineNum = 623;BA.debugLine="vue.SetStateSingle(pp, varSelectionType)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varselectiontype));
 //BA.debugLineNum = 624;BA.debugLine="TreeView.Bind(\":selection-type\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":selection-type",_pp);
 //BA.debugLineNum = 625;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 626;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setshaped(boolean _varshaped) throws Exception{
String _pp = "";
 //BA.debugLineNum = 405;BA.debugLine="Sub SetShaped(varShaped As Boolean) As VMTreeView";
 //BA.debugLineNum = 406;BA.debugLine="If varShaped = False Then Return Me";
if (_varshaped==__c.False) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 407;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 408;BA.debugLine="SetAttrSingle(\"shaped\", varShaped)";
_setattrsingle("shaped",BA.ObjectToString(_varshaped));
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 411;BA.debugLine="Dim pp As String = $\"${ID}Shaped\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Shaped");
 //BA.debugLineNum = 412;BA.debugLine="vue.SetStateSingle(pp, varShaped)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshaped));
 //BA.debugLineNum = 413;BA.debugLine="TreeView.Bind(\":shaped\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":shaped",_pp);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setslotappend(boolean _b) throws Exception{
 //BA.debugLineNum = 636;BA.debugLine="Sub SetSlotAppend(b As Boolean) As VMTreeView    '";
 //BA.debugLineNum = 637;BA.debugLine="SetAttr(CreateMap(\"slot\": \"append\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("append")}));
 //BA.debugLineNum = 638;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 639;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setslotlabel(boolean _b) throws Exception{
 //BA.debugLineNum = 642;BA.debugLine="Sub SetSlotLabel(b As Boolean) As VMTreeView    'i";
 //BA.debugLineNum = 643;BA.debugLine="SetAttr(CreateMap(\"slot\": \"label\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("label")}));
 //BA.debugLineNum = 644;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 645;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setslotprepend(boolean _b) throws Exception{
 //BA.debugLineNum = 648;BA.debugLine="Sub SetSlotPrepend(b As Boolean) As VMTreeView";
 //BA.debugLineNum = 649;BA.debugLine="SetAttr(CreateMap(\"slot\": \"prepend\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("prepend")}));
 //BA.debugLineNum = 650;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 651;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetStatic(b As Boolean) As VMTreeView";
 //BA.debugLineNum = 109;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 110;BA.debugLine="TreeView.SetStatic(b)";
_treeview._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetStyle(sm As Map) As VMTreeView";
 //BA.debugLineNum = 256;BA.debugLine="TreeView.SetStyle(sm)";
_treeview._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 787;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 788;BA.debugLine="TreeView.SetStyleSingle(prop, value)";
_treeview._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 789;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 790;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 775;BA.debugLine="Sub SetTabIndex(ti As String) As VMTreeView";
 //BA.debugLineNum = 776;BA.debugLine="TreeView.SetTabIndex(ti)";
_treeview._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 777;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 778;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub SetText(t As Object) As VMTreeView";
 //BA.debugLineNum = 233;BA.debugLine="TreeView.SetText(t)";
_treeview._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _settransition(boolean _vartransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 418;BA.debugLine="Sub SetTransition(varTransition As Boolean) As VMT";
 //BA.debugLineNum = 419;BA.debugLine="If varTransition = False Then Return Me";
if (_vartransition==__c.False) { 
if (true) return (b4j.example.vmtreeview)(this);};
 //BA.debugLineNum = 420;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 421;BA.debugLine="SetAttrSingle(\"transition\", varTransition)";
_setattrsingle("transition",BA.ObjectToString(_vartransition));
 //BA.debugLineNum = 422;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 };
 //BA.debugLineNum = 424;BA.debugLine="Dim pp As String = $\"${ID}Transition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Transition");
 //BA.debugLineNum = 425;BA.debugLine="vue.SetStateSingle(pp, varTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartransition));
 //BA.debugLineNum = 426;BA.debugLine="TreeView.Bind(\":transition\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":transition",_pp);
 //BA.debugLineNum = 427;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setvalue(anywheresoftware.b4a.objects.collections.List _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 629;BA.debugLine="Sub SetValue(varValue As List) As VMTreeView";
 //BA.debugLineNum = 630;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 631;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue.getObject()));
 //BA.debugLineNum = 632;BA.debugLine="TreeView.Bind(\":value\", pp)";
_treeview._bind /*b4j.example.vmelement*/ (":value",_pp);
 //BA.debugLineNum = 633;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 634;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 823;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 824;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 825;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 826;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 827;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 828;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 829;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 810;BA.debugLine="Sub SetVhtml(vhtml As String) As VMTreeView";
 //BA.debugLineNum = 811;BA.debugLine="TreeView.SetVHtml(vhtml)";
_treeview._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 812;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 813;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetVIf(vif As String) As VMTreeView";
 //BA.debugLineNum = 210;BA.debugLine="TreeView.SetVIf(vif)";
_treeview._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 842;BA.debugLine="Sub SetVisible(b As Boolean) As VMTreeView";
 //BA.debugLineNum = 843;BA.debugLine="TreeView.SetVisible(b)";
_treeview._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 844;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 845;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Sub SetVModel(k As String) As VMTreeView";
 //BA.debugLineNum = 205;BA.debugLine="TreeView.SetVModel(k)";
_treeview._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub SetVShow(vif As String) As VMTreeView";
 //BA.debugLineNum = 215;BA.debugLine="TreeView.SetVShow(vif)";
_treeview._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 805;BA.debugLine="Sub SetVText(vhtml As String) As VMTreeView";
 //BA.debugLineNum = 806;BA.debugLine="TreeView.SetVText(vhtml)";
_treeview._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 807;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 808;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtreeview  _show() throws Exception{
 //BA.debugLineNum = 697;BA.debugLine="Sub Show As VMTreeView";
 //BA.debugLineNum = 698;BA.debugLine="TreeView.SetVisible(True)";
_treeview._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 699;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 700;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
anywheresoftware.b4a.objects.collections.List _unflat = null;
 //BA.debugLineNum = 178;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 179;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 180;BA.debugLine="Dim eName As String = $\"${ID}_updateactive\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_updateactive");
 //BA.debugLineNum = 181;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 182;BA.debugLine="Log($\"VMTreeView.${eName} event has not been def";
__c.Log(("VMTreeView."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 //BA.debugLineNum = 184;BA.debugLine="eName = $\"${ID}_updateopen\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_updateopen");
 //BA.debugLineNum = 185;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 186;BA.debugLine="Log($\"VMTreeView.${eName} event has not been def";
__c.Log(("VMTreeView."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 190;BA.debugLine="Dim unflat As List = vue.Unflatten(items, \"childr";
_unflat = new anywheresoftware.b4a.objects.collections.List();
_unflat = _vue._unflatten /*anywheresoftware.b4a.objects.collections.List*/ (_items,"children");
 //BA.debugLineNum = 191;BA.debugLine="vue.SetData($\"${ID}items\"$, unflat)";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"items"),(Object)(_unflat.getObject()));
 //BA.debugLineNum = 192;BA.debugLine="loaded = True";
_loaded = __c.True;
 //BA.debugLineNum = 193;BA.debugLine="TreeView.AddComponent(IconSlot.ToString)";
_treeview._addcomponent /*b4j.example.vmelement*/ (_iconslot._tostring /*String*/ ());
 //BA.debugLineNum = 194;BA.debugLine="Return TreeView.ToString";
if (true) return _treeview._tostring /*String*/ ();
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public String  _update() throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub Update";
 //BA.debugLineNum = 174;BA.debugLine="SetDataSource(items)";
_setdatasource(_items);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtreeview  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 729;BA.debugLine="Sub UseTheme(themeName As String) As VMTreeView";
 //BA.debugLineNum = 730;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 731;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 732;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 733;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 734;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 736;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtreeview)(this);
 //BA.debugLineNum = 737;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
