package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmlist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmlist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmlist.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _list = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _hascontent = false;
public anywheresoftware.b4a.objects.collections.Map _items = null;
public boolean _bstatic = false;
public anywheresoftware.b4a.objects.collections.Map _parentchild = null;
public boolean _usevisibility = false;
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
public b4j.example.vmlist  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 894;BA.debugLine="Sub AddChild(child As VMElement) As VMList";
 //BA.debugLineNum = 895;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 896;BA.debugLine="List.SetText(childHTML)";
_list._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 897;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 898;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 899;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 932;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 933;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 934;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 936;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlist  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 914;BA.debugLine="Sub AddClass(c As String) As VMList";
 //BA.debugLineNum = 915;BA.debugLine="List.AddClass(c)";
_list._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 916;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 917;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 759;BA.debugLine="Sub AddComponent(comp As String) As VMList";
 //BA.debugLineNum = 760;BA.debugLine="List.SetText(comp)";
_list._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 761;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 762;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _adddivider() throws Exception{
String _strline = "";
 //BA.debugLineNum = 95;BA.debugLine="Sub AddDivider As VMList";
 //BA.debugLineNum = 96;BA.debugLine="Dim strLine As String = $\"<v-divider></v-divider>";
_strline = ("<v-divider></v-divider>");
 //BA.debugLineNum = 97;BA.debugLine="SetText(strLine)";
_settext(_strline);
 //BA.debugLineNum = 98;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _adddivider1(boolean _binset) throws Exception{
b4j.example.vmdivider _div = null;
 //BA.debugLineNum = 764;BA.debugLine="Sub AddDivider1(bInset As Boolean) As VMList";
 //BA.debugLineNum = 765;BA.debugLine="Dim div As VMDivider";
_div = new b4j.example.vmdivider();
 //BA.debugLineNum = 766;BA.debugLine="div.Initialize(vue)";
_div._initialize /*b4j.example.vmdivider*/ (ba,_vue);
 //BA.debugLineNum = 767;BA.debugLine="If bInset Then div.SetAttrLoose(\"inset\")";
if (_binset) { 
_div._setattrloose /*b4j.example.vmdivider*/ ("inset");};
 //BA.debugLineNum = 768;BA.debugLine="div.Pop(List)";
_div._pop /*String*/ (_list);
 //BA.debugLineNum = 769;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 770;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _additem(String _key,String _avatar,String _iconname,String _title,String _subtitle,String _actionicon) throws Exception{
anywheresoftware.b4a.objects.collections.Map _item = null;
 //BA.debugLineNum = 460;BA.debugLine="Sub AddItem(key As String, avatar As String, iconN";
 //BA.debugLineNum = 461;BA.debugLine="key = key.tolowercase";
_key = _key.toLowerCase();
 //BA.debugLineNum = 462;BA.debugLine="If key = \"\" Then";
if ((_key).equals("")) { 
 //BA.debugLineNum = 463;BA.debugLine="key = items.size";
_key = BA.NumberToString(_items.getSize());
 };
 //BA.debugLineNum = 465;BA.debugLine="title = BANano.SF(title)";
_title = _banano.SF(_title);
 //BA.debugLineNum = 466;BA.debugLine="subtitle = BANano.SF(subtitle)";
_subtitle = _banano.SF(_subtitle);
 //BA.debugLineNum = 467;BA.debugLine="Dim item As Map = CreateMap()";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = __c.createMap(new Object[] {});
 //BA.debugLineNum = 468;BA.debugLine="item.Put(\"id\", key)";
_item.Put((Object)("id"),(Object)(_key));
 //BA.debugLineNum = 469;BA.debugLine="item.Put(\"avatar\", avatar)";
_item.Put((Object)("avatar"),(Object)(_avatar));
 //BA.debugLineNum = 470;BA.debugLine="item.Put(\"icon\", iconName)";
_item.Put((Object)("icon"),(Object)(_iconname));
 //BA.debugLineNum = 471;BA.debugLine="item.Put(\"title\", title)";
_item.Put((Object)("title"),(Object)(_title));
 //BA.debugLineNum = 472;BA.debugLine="item.Put(\"subtitle\", subtitle)";
_item.Put((Object)("subtitle"),(Object)(_subtitle));
 //BA.debugLineNum = 473;BA.debugLine="item.Put(\"action\", actionIcon)";
_item.Put((Object)("action"),(Object)(_actionicon));
 //BA.debugLineNum = 474;BA.debugLine="items.Put(key, item)";
_items.Put((Object)(_key),(Object)(_item.getObject()));
 //BA.debugLineNum = 475;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 476;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 477;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _additem1(String _key,String _avatar,String _iconname,String _iconcolor,String _title,String _subtitle,String _subtitle1,String _actionicon,String _actioniconcolor) throws Exception{
b4j.example.vmlistitem _vli = null;
b4j.example.vmlistitemavatar _lia = null;
b4j.example.vmimage _img = null;
b4j.example.vmlistitemicon _vlii = null;
b4j.example.vmicon _icon = null;
int _icontent = 0;
b4j.example.vmlistitemcontent _lic = null;
b4j.example.vmlistitemtitle _lit = null;
b4j.example.vmlistitemsubtitle _listt = null;
b4j.example.vmlistitemsubtitle _listt1 = null;
b4j.example.vmlistitemaction _la = null;
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 653;BA.debugLine="Sub AddItem1(key As String, avatar As String, icon";
 //BA.debugLineNum = 654;BA.debugLine="Dim vli As VMListItem";
_vli = new b4j.example.vmlistitem();
 //BA.debugLineNum = 655;BA.debugLine="vli.Initialize(vue, key, Module)";
_vli._initialize /*b4j.example.vmlistitem*/ (ba,_vue,_key,_module);
 //BA.debugLineNum = 656;BA.debugLine="vli.SetStatic(bStatic)";
_vli._setstatic /*b4j.example.vmlistitem*/ (_bstatic);
 //BA.debugLineNum = 657;BA.debugLine="vli.SetDesignMode(DesignMode)";
_vli._setdesignmode /*b4j.example.vmlistitem*/ (_designmode);
 //BA.debugLineNum = 658;BA.debugLine="vli.SetAttrSingle(\"key\", key)";
_vli._setattrsingle /*b4j.example.vmlistitem*/ ("key",_key);
 //BA.debugLineNum = 659;BA.debugLine="vli.SetOnClick($\"${ID}_click\"$)";
_vli._setonclick /*b4j.example.vmlistitem*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 661;BA.debugLine="If avatar <> \"\" Then";
if ((_avatar).equals("") == false) { 
 //BA.debugLineNum = 662;BA.debugLine="Dim lia As VMListItemAvatar";
_lia = new b4j.example.vmlistitemavatar();
 //BA.debugLineNum = 663;BA.debugLine="lia.Initialize(vue, \"\", Module)";
_lia._initialize /*b4j.example.vmlistitemavatar*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 664;BA.debugLine="lia.SetStatic(bStatic)";
_lia._setstatic /*b4j.example.vmlistitemavatar*/ (_bstatic);
 //BA.debugLineNum = 665;BA.debugLine="lia.SetDesignMode(DesignMode)";
_lia._setdesignmode /*b4j.example.vmlistitemavatar*/ (_designmode);
 //BA.debugLineNum = 666;BA.debugLine="Dim img As VMImage";
_img = new b4j.example.vmimage();
 //BA.debugLineNum = 667;BA.debugLine="img.Initialize(vue, \"\", Module)";
_img._initialize /*b4j.example.vmimage*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 668;BA.debugLine="img.SetStatic(bStatic)";
_img._setstatic /*b4j.example.vmimage*/ (_bstatic);
 //BA.debugLineNum = 669;BA.debugLine="img.SetDesignMode(DesignMode)";
_img._setdesignmode /*b4j.example.vmimage*/ (_designmode);
 //BA.debugLineNum = 670;BA.debugLine="img.SetAttrSingle(\"src\", avatar)";
_img._setattrsingle /*b4j.example.vmimage*/ ("src",_avatar);
 //BA.debugLineNum = 671;BA.debugLine="img.Pop(lia.ListItemAvatar)";
_img._pop /*String*/ (_lia._listitemavatar /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 672;BA.debugLine="lia.Pop(vli.ListItem)";
_lia._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 675;BA.debugLine="If iconName <> \"\" Then";
if ((_iconname).equals("") == false) { 
 //BA.debugLineNum = 676;BA.debugLine="Dim vlii As VMListItemIcon";
_vlii = new b4j.example.vmlistitemicon();
 //BA.debugLineNum = 677;BA.debugLine="vlii.Initialize(vue, \"\", Module)";
_vlii._initialize /*b4j.example.vmlistitemicon*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 678;BA.debugLine="vlii.SetStatic(bStatic)";
_vlii._setstatic /*b4j.example.vmlistitemicon*/ (_bstatic);
 //BA.debugLineNum = 679;BA.debugLine="vlii.SetDesignMode(DesignMode)";
_vlii._setdesignmode /*b4j.example.vmlistitemicon*/ (_designmode);
 //BA.debugLineNum = 680;BA.debugLine="Dim icon As VMIcon";
_icon = new b4j.example.vmicon();
 //BA.debugLineNum = 681;BA.debugLine="icon.Initialize(vue,\"\", Module)";
_icon._initialize /*b4j.example.vmicon*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 682;BA.debugLine="icon.SetStatic(bStatic)";
_icon._setstatic /*b4j.example.vmicon*/ (_bstatic);
 //BA.debugLineNum = 683;BA.debugLine="icon.SetDesignMode(DesignMode)";
_icon._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 684;BA.debugLine="icon.SetText(iconName)";
_icon._settext /*b4j.example.vmicon*/ (_iconname);
 //BA.debugLineNum = 685;BA.debugLine="If iconColor <> \"\" Then";
if ((_iconcolor).equals("") == false) { 
 //BA.debugLineNum = 686;BA.debugLine="icon.SetAttrSingle(\"color\", iconColor)";
_icon._setattrsingle /*b4j.example.vmicon*/ ("color",_iconcolor);
 };
 //BA.debugLineNum = 688;BA.debugLine="icon.Pop(vlii.ListItemIcon)";
_icon._pop /*String*/ (_vlii._listitemicon /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 689;BA.debugLine="vlii.Pop(vli.ListItem)";
_vlii._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 692;BA.debugLine="Dim iContent As Int = 0";
_icontent = (int) (0);
 //BA.debugLineNum = 693;BA.debugLine="If title <> \"\" Then iContent = iContent + 1";
if ((_title).equals("") == false) { 
_icontent = (int) (_icontent+1);};
 //BA.debugLineNum = 694;BA.debugLine="If subtitle <> \"\" Then iContent = iContent + 1";
if ((_subtitle).equals("") == false) { 
_icontent = (int) (_icontent+1);};
 //BA.debugLineNum = 696;BA.debugLine="If iContent > 0 Then";
if (_icontent>0) { 
 //BA.debugLineNum = 697;BA.debugLine="Dim lic As VMListItemContent";
_lic = new b4j.example.vmlistitemcontent();
 //BA.debugLineNum = 698;BA.debugLine="lic.Initialize(vue,\"\", Module)";
_lic._initialize /*b4j.example.vmlistitemcontent*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 699;BA.debugLine="lic.SetStatic(bStatic)";
_lic._setstatic /*b4j.example.vmlistitemcontent*/ (_bstatic);
 //BA.debugLineNum = 700;BA.debugLine="lic.SetDesignMode(DesignMode)";
_lic._setdesignmode /*b4j.example.vmlistitemcontent*/ (_designmode);
 //BA.debugLineNum = 702;BA.debugLine="If title <> \"\" Then";
if ((_title).equals("") == false) { 
 //BA.debugLineNum = 703;BA.debugLine="Dim lit As VMListItemTitle";
_lit = new b4j.example.vmlistitemtitle();
 //BA.debugLineNum = 704;BA.debugLine="lit.Initialize(vue, \"\", Module)";
_lit._initialize /*b4j.example.vmlistitemtitle*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 705;BA.debugLine="lit.SetStatic(bStatic)";
_lit._setstatic /*b4j.example.vmlistitemtitle*/ (_bstatic);
 //BA.debugLineNum = 706;BA.debugLine="lit.SetDesignMode(DesignMode)";
_lit._setdesignmode /*b4j.example.vmlistitemtitle*/ (_designmode);
 //BA.debugLineNum = 707;BA.debugLine="lit.SetText(title)";
_lit._settext /*b4j.example.vmlistitemtitle*/ ((Object)(_title));
 //BA.debugLineNum = 708;BA.debugLine="lit.Pop(lic.ListItemContent)";
_lit._pop /*String*/ (_lic._listitemcontent /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 711;BA.debugLine="If subtitle <> \"\" Then";
if ((_subtitle).equals("") == false) { 
 //BA.debugLineNum = 712;BA.debugLine="Dim listt As VMListItemSubTitle";
_listt = new b4j.example.vmlistitemsubtitle();
 //BA.debugLineNum = 713;BA.debugLine="listt.Initialize(vue, \"\", Module)";
_listt._initialize /*b4j.example.vmlistitemsubtitle*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 714;BA.debugLine="listt.SetStatic(bStatic)";
_listt._setstatic /*b4j.example.vmlistitemsubtitle*/ (_bstatic);
 //BA.debugLineNum = 715;BA.debugLine="listt.SetDesignMode(DesignMode)";
_listt._setdesignmode /*b4j.example.vmlistitemsubtitle*/ (_designmode);
 //BA.debugLineNum = 716;BA.debugLine="listt.SetText(subtitle)";
_listt._settext /*b4j.example.vmlistitemsubtitle*/ ((Object)(_subtitle));
 //BA.debugLineNum = 717;BA.debugLine="listt.Pop(lic.ListItemContent)";
_listt._pop /*String*/ (_lic._listitemcontent /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 720;BA.debugLine="If subtitle1 <> \"\" Then";
if ((_subtitle1).equals("") == false) { 
 //BA.debugLineNum = 721;BA.debugLine="Dim listt1 As VMListItemSubTitle";
_listt1 = new b4j.example.vmlistitemsubtitle();
 //BA.debugLineNum = 722;BA.debugLine="listt1.Initialize(vue, \"\", Module)";
_listt1._initialize /*b4j.example.vmlistitemsubtitle*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 723;BA.debugLine="listt1.SetStatic(bStatic)";
_listt1._setstatic /*b4j.example.vmlistitemsubtitle*/ (_bstatic);
 //BA.debugLineNum = 724;BA.debugLine="listt1.SetDesignMode(DesignMode)";
_listt1._setdesignmode /*b4j.example.vmlistitemsubtitle*/ (_designmode);
 //BA.debugLineNum = 725;BA.debugLine="listt1.SetText(subtitle1)";
_listt1._settext /*b4j.example.vmlistitemsubtitle*/ ((Object)(_subtitle1));
 //BA.debugLineNum = 726;BA.debugLine="listt1.Pop(lic.ListItemContent)";
_listt1._pop /*String*/ (_lic._listitemcontent /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 728;BA.debugLine="lic.Pop(vli.ListItem)";
_lic._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 731;BA.debugLine="If actionIcon <> \"\" Then";
if ((_actionicon).equals("") == false) { 
 //BA.debugLineNum = 732;BA.debugLine="Dim la As VMListItemAction";
_la = new b4j.example.vmlistitemaction();
 //BA.debugLineNum = 733;BA.debugLine="la.Initialize(vue, \"\", Module)";
_la._initialize /*b4j.example.vmlistitemaction*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 734;BA.debugLine="la.SetStatic(bStatic)";
_la._setstatic /*b4j.example.vmlistitemaction*/ (_bstatic);
 //BA.debugLineNum = 735;BA.debugLine="la.SetDesignMode(DesignMode)";
_la._setdesignmode /*b4j.example.vmlistitemaction*/ (_designmode);
 //BA.debugLineNum = 736;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 737;BA.debugLine="btn.Initialize(vue, \"\", Module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 738;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 739;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 740;BA.debugLine="btn.SetAttrLoose(\"icon\")";
_btn._setattrloose /*b4j.example.vmbutton*/ ("icon");
 //BA.debugLineNum = 741;BA.debugLine="Dim icon As VMIcon";
_icon = new b4j.example.vmicon();
 //BA.debugLineNum = 742;BA.debugLine="icon.Initialize(vue, \"\", Module)";
_icon._initialize /*b4j.example.vmicon*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 743;BA.debugLine="icon.SetStatic(bStatic)";
_icon._setstatic /*b4j.example.vmicon*/ (_bstatic);
 //BA.debugLineNum = 744;BA.debugLine="icon.SetDesignMode(DesignMode)";
_icon._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 745;BA.debugLine="If actionIconColor <> \"\" Then";
if ((_actioniconcolor).equals("") == false) { 
 //BA.debugLineNum = 746;BA.debugLine="icon.SetAttrSingle(\"color\", actionIconColor)";
_icon._setattrsingle /*b4j.example.vmicon*/ ("color",_actioniconcolor);
 };
 //BA.debugLineNum = 748;BA.debugLine="icon.SetText(actionIcon)";
_icon._settext /*b4j.example.vmicon*/ (_actionicon);
 //BA.debugLineNum = 749;BA.debugLine="btn.AddComponent(icon.ToString)";
_btn._addcomponent /*b4j.example.vmbutton*/ (_icon._tostring /*String*/ ());
 //BA.debugLineNum = 750;BA.debugLine="la.AddComponent(btn.ToString)";
_la._addcomponent /*b4j.example.vmlistitemaction*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 751;BA.debugLine="la.Pop(vli.ListItem)";
_la._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 754;BA.debugLine="vli.Pop(List)";
_vli._pop /*String*/ (_list);
 //BA.debugLineNum = 755;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 756;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 757;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _additem2(String _key,String _avatar,String _iconname,String _iconcolor,String _title,String _subtitle,String _subtitle1,String _actionicon,String _actioniconcolor) throws Exception{
anywheresoftware.b4a.objects.collections.Map _item = null;
 //BA.debugLineNum = 480;BA.debugLine="Sub AddItem2(key As String, avatar As String, icon";
 //BA.debugLineNum = 481;BA.debugLine="key = key.tolowercase";
_key = _key.toLowerCase();
 //BA.debugLineNum = 482;BA.debugLine="If key = \"\" Then";
if ((_key).equals("")) { 
 //BA.debugLineNum = 483;BA.debugLine="key = items.size";
_key = BA.NumberToString(_items.getSize());
 };
 //BA.debugLineNum = 485;BA.debugLine="title = BANano.SF(title)";
_title = _banano.SF(_title);
 //BA.debugLineNum = 486;BA.debugLine="subtitle = BANano.SF(subtitle)";
_subtitle = _banano.SF(_subtitle);
 //BA.debugLineNum = 487;BA.debugLine="Dim item As Map = CreateMap()";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = __c.createMap(new Object[] {});
 //BA.debugLineNum = 488;BA.debugLine="item.Put(\"id\", key)";
_item.Put((Object)("id"),(Object)(_key));
 //BA.debugLineNum = 489;BA.debugLine="item.Put(\"avatar\", avatar)";
_item.Put((Object)("avatar"),(Object)(_avatar));
 //BA.debugLineNum = 490;BA.debugLine="item.Put(\"icon\", iconName)";
_item.Put((Object)("icon"),(Object)(_iconname));
 //BA.debugLineNum = 491;BA.debugLine="item.Put(\"iconcolor\", iconColor)";
_item.Put((Object)("iconcolor"),(Object)(_iconcolor));
 //BA.debugLineNum = 492;BA.debugLine="item.Put(\"title\", title)";
_item.Put((Object)("title"),(Object)(_title));
 //BA.debugLineNum = 493;BA.debugLine="item.Put(\"subtitle\", subtitle)";
_item.Put((Object)("subtitle"),(Object)(_subtitle));
 //BA.debugLineNum = 494;BA.debugLine="item.Put(\"subtitle1\", subtitle1)";
_item.Put((Object)("subtitle1"),(Object)(_subtitle1));
 //BA.debugLineNum = 495;BA.debugLine="item.Put(\"action\", actionIcon)";
_item.Put((Object)("action"),(Object)(_actionicon));
 //BA.debugLineNum = 496;BA.debugLine="item.Put(\"actioniconcolor\", actionIconColor)";
_item.Put((Object)("actioniconcolor"),(Object)(_actioniconcolor));
 //BA.debugLineNum = 497;BA.debugLine="items.Put(key, item)";
_items.Put((Object)(_key),(Object)(_item.getObject()));
 //BA.debugLineNum = 498;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 499;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 500;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _additemdivider() throws Exception{
String _key = "";
anywheresoftware.b4a.objects.collections.Map _item = null;
 //BA.debugLineNum = 503;BA.debugLine="Sub AddItemDivider() As VMList";
 //BA.debugLineNum = 504;BA.debugLine="Dim key As String = items.size";
_key = BA.NumberToString(_items.getSize());
 //BA.debugLineNum = 505;BA.debugLine="Dim item As Map = CreateMap()";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = __c.createMap(new Object[] {});
 //BA.debugLineNum = 506;BA.debugLine="item.Put(\"divider\", True)";
_item.Put((Object)("divider"),(Object)(__c.True));
 //BA.debugLineNum = 507;BA.debugLine="items.Put(key, item)";
_items.Put((Object)(_key),(Object)(_item.getObject()));
 //BA.debugLineNum = 508;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 509;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 510;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _additemgroup(String _datasource,String _key,String _avatar,String _iconname,String _title,String _subtitle,String _actionicon) throws Exception{
b4j.example.vmlistitemgroup _vlig = null;
b4j.example.vmlistitem _vli = null;
 //BA.debugLineNum = 610;BA.debugLine="private Sub AddItemGroup(dataSource As String, key";
 //BA.debugLineNum = 611;BA.debugLine="dataSource = dataSource.ToLowerCase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 613;BA.debugLine="Dim vlig As VMListItemGroup";
_vlig = new b4j.example.vmlistitemgroup();
 //BA.debugLineNum = 614;BA.debugLine="vlig.Initialize(vue, $\"${ID}lig\"$, Module).SetVMo";
_vlig._initialize /*b4j.example.vmlistitemgroup*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"lig"),_module)._setvmodel /*b4j.example.vmlistitemgroup*/ ("item")._setcolor /*b4j.example.vmlistitemgroup*/ ("primary");
 //BA.debugLineNum = 616;BA.debugLine="Dim vli As VMListItem = CreateListItem(dataSource";
_vli = _createlistitem(_datasource,_key,_avatar,_iconname,_title,_subtitle,_actionicon);
 //BA.debugLineNum = 617;BA.debugLine="vli.Pop(vlig.ListItemGroup)";
_vli._pop /*String*/ (_vlig._listitemgroup /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 618;BA.debugLine="vlig.Pop(List)";
_vlig._pop /*String*/ (_list);
 //BA.debugLineNum = 619;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 620;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 621;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _additemheader(String _hdr) throws Exception{
String _key = "";
anywheresoftware.b4a.objects.collections.Map _item = null;
 //BA.debugLineNum = 512;BA.debugLine="Sub AddItemHeader(hdr As String) As VMList";
 //BA.debugLineNum = 513;BA.debugLine="Dim key As String = items.size";
_key = BA.NumberToString(_items.getSize());
 //BA.debugLineNum = 514;BA.debugLine="Dim item As Map = CreateMap()";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = __c.createMap(new Object[] {});
 //BA.debugLineNum = 515;BA.debugLine="item.Put(\"header\", hdr)";
_item.Put((Object)("header"),(Object)(_hdr));
 //BA.debugLineNum = 516;BA.debugLine="items.Put(key, item)";
_items.Put((Object)(_key),(Object)(_item.getObject()));
 //BA.debugLineNum = 517;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 518;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 519;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _additemjson(String _json) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 544;BA.debugLine="Sub AddItemJSON(json As String) As VMList";
 //BA.debugLineNum = 545;BA.debugLine="Dim m As Map = vue.Json2Map(json)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _vue._json2map /*anywheresoftware.b4a.objects.collections.Map*/ (_json);
 //BA.debugLineNum = 546;BA.debugLine="items.Put(items.size, m)";
_items.Put((Object)(_items.getSize()),(Object)(_m.getObject()));
 //BA.debugLineNum = 547;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 548;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 549;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _additemmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 552;BA.debugLine="Sub AddItemMap(m As Map) As VMList";
 //BA.debugLineNum = 553;BA.debugLine="items.Put(items.size, m)";
_items.Put((Object)(_items.getSize()),(Object)(_m.getObject()));
 //BA.debugLineNum = 554;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 555;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 556;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _additemsubheader(String _hdr) throws Exception{
anywheresoftware.b4a.objects.collections.Map _item = null;
 //BA.debugLineNum = 559;BA.debugLine="Sub AddItemSubHeader(hdr As String) As VMList";
 //BA.debugLineNum = 560;BA.debugLine="Dim item As Map = CreateMap()";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = __c.createMap(new Object[] {});
 //BA.debugLineNum = 561;BA.debugLine="item.Put(\"header\", hdr)";
_item.Put((Object)("header"),(Object)(_hdr));
 //BA.debugLineNum = 562;BA.debugLine="items.Put(items.Size, item)";
_items.Put((Object)(_items.getSize()),(Object)(_item.getObject()));
 //BA.debugLineNum = 563;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 564;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 565;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _additemv(String _key,String _avatar,String _iconname,String _title,String _subtitle,String _actionicon,boolean _visibility) throws Exception{
anywheresoftware.b4a.objects.collections.Map _item = null;
 //BA.debugLineNum = 522;BA.debugLine="Sub AddItemV(key As String, avatar As String, icon";
 //BA.debugLineNum = 523;BA.debugLine="key = key.tolowercase";
_key = _key.toLowerCase();
 //BA.debugLineNum = 524;BA.debugLine="If key = \"\" Then";
if ((_key).equals("")) { 
 //BA.debugLineNum = 525;BA.debugLine="key = items.size";
_key = BA.NumberToString(_items.getSize());
 };
 //BA.debugLineNum = 527;BA.debugLine="title = BANano.SF(title)";
_title = _banano.SF(_title);
 //BA.debugLineNum = 528;BA.debugLine="subtitle = BANano.SF(subtitle)";
_subtitle = _banano.SF(_subtitle);
 //BA.debugLineNum = 529;BA.debugLine="Dim item As Map = CreateMap()";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = __c.createMap(new Object[] {});
 //BA.debugLineNum = 530;BA.debugLine="item.Put(\"id\", key)";
_item.Put((Object)("id"),(Object)(_key));
 //BA.debugLineNum = 531;BA.debugLine="item.Put(\"avatar\", avatar)";
_item.Put((Object)("avatar"),(Object)(_avatar));
 //BA.debugLineNum = 532;BA.debugLine="item.Put(\"icon\", iconName)";
_item.Put((Object)("icon"),(Object)(_iconname));
 //BA.debugLineNum = 533;BA.debugLine="item.Put(\"title\", title)";
_item.Put((Object)("title"),(Object)(_title));
 //BA.debugLineNum = 534;BA.debugLine="item.Put(\"subtitle\", subtitle)";
_item.Put((Object)("subtitle"),(Object)(_subtitle));
 //BA.debugLineNum = 535;BA.debugLine="item.Put(\"action\", actionIcon)";
_item.Put((Object)("action"),(Object)(_actionicon));
 //BA.debugLineNum = 536;BA.debugLine="item.Put(\"visibility\", visibility)";
_item.Put((Object)("visibility"),(Object)(_visibility));
 //BA.debugLineNum = 537;BA.debugLine="items.Put(key, item)";
_items.Put((Object)(_key),(Object)(_item.getObject()));
 //BA.debugLineNum = 538;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 539;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _addparentchild(String _parent,String _key,String _iconname,String _iconcolor,String _title,String _badge) throws Exception{
anywheresoftware.b4a.objects.collections.Map _pitem = null;
anywheresoftware.b4a.objects.collections.List _psubitems = null;
anywheresoftware.b4a.objects.collections.Map _citem = null;
anywheresoftware.b4a.objects.collections.List _csubitems = null;
anywheresoftware.b4a.objects.collections.Map _aitem = null;
 //BA.debugLineNum = 568;BA.debugLine="Sub AddParentChild(parent As String, key As String";
 //BA.debugLineNum = 569;BA.debugLine="parent = parent.ToLowerCase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 570;BA.debugLine="key = key.tolowercase";
_key = _key.toLowerCase();
 //BA.debugLineNum = 571;BA.debugLine="If key = \"\" Then Return Me";
if ((_key).equals("")) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 573;BA.debugLine="If parent = \"\" Then";
if ((_parent).equals("")) { 
 //BA.debugLineNum = 575;BA.debugLine="Dim pitem As Map = CreateMap()";
_pitem = new anywheresoftware.b4a.objects.collections.Map();
_pitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 576;BA.debugLine="pitem.Put(\"id\", key)";
_pitem.Put((Object)("id"),(Object)(_key));
 //BA.debugLineNum = 577;BA.debugLine="pitem.Put(\"icon\", iconName)";
_pitem.Put((Object)("icon"),(Object)(_iconname));
 //BA.debugLineNum = 578;BA.debugLine="pitem.Put(\"iconcolor\", iconColor)";
_pitem.Put((Object)("iconcolor"),(Object)(_iconcolor));
 //BA.debugLineNum = 579;BA.debugLine="pitem.Put(\"title\", title)";
_pitem.Put((Object)("title"),(Object)(_title));
 //BA.debugLineNum = 580;BA.debugLine="pitem.Put(\"badge\", badge)";
_pitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 581;BA.debugLine="Dim psubitems As List";
_psubitems = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 582;BA.debugLine="psubitems.Initialize";
_psubitems.Initialize();
 //BA.debugLineNum = 583;BA.debugLine="pitem.Put(\"items\", psubitems)";
_pitem.Put((Object)("items"),(Object)(_psubitems.getObject()));
 //BA.debugLineNum = 584;BA.debugLine="parentchild.Put(key, pitem)";
_parentchild.Put((Object)(_key),(Object)(_pitem.getObject()));
 //BA.debugLineNum = 585;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 }else {
 //BA.debugLineNum = 587;BA.debugLine="If parentchild.ContainsKey(parent) Then";
if (_parentchild.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 589;BA.debugLine="Dim citem As Map = parentchild.Get(parent)";
_citem = new anywheresoftware.b4a.objects.collections.Map();
_citem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_parentchild.Get((Object)(_parent))));
 //BA.debugLineNum = 590;BA.debugLine="Dim csubitems As List = citem.Get(\"items\")";
_csubitems = new anywheresoftware.b4a.objects.collections.List();
_csubitems = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_citem.Get((Object)("items"))));
 //BA.debugLineNum = 592;BA.debugLine="Dim aitem As Map = CreateMap()";
_aitem = new anywheresoftware.b4a.objects.collections.Map();
_aitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 593;BA.debugLine="aitem.Put(\"id\", key)";
_aitem.Put((Object)("id"),(Object)(_key));
 //BA.debugLineNum = 594;BA.debugLine="aitem.Put(\"icon\", iconName)";
_aitem.Put((Object)("icon"),(Object)(_iconname));
 //BA.debugLineNum = 595;BA.debugLine="aitem.Put(\"iconcolor\", iconColor)";
_aitem.Put((Object)("iconcolor"),(Object)(_iconcolor));
 //BA.debugLineNum = 596;BA.debugLine="aitem.Put(\"title\", title)";
_aitem.Put((Object)("title"),(Object)(_title));
 //BA.debugLineNum = 597;BA.debugLine="aitem.Put(\"badge\", badge)";
_aitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 599;BA.debugLine="csubitems.Add(aitem)";
_csubitems.Add((Object)(_aitem.getObject()));
 //BA.debugLineNum = 601;BA.debugLine="citem.Put(\"items\", csubitems)";
_citem.Put((Object)("items"),(Object)(_csubitems.getObject()));
 //BA.debugLineNum = 602;BA.debugLine="parentchild.Put(parent, citem)";
_parentchild.Put((Object)(_parent),(Object)(_citem.getObject()));
 //BA.debugLineNum = 603;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 };
 };
 //BA.debugLineNum = 606;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 607;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _addsubheader(String _text) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub AddSubHeader(Text As String) As VMList";
 //BA.debugLineNum = 90;BA.debugLine="List.AddSubHeader(Text)";
_list._addsubheader /*b4j.example.vmelement*/ (_text);
 //BA.debugLineNum = 91;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _addsubheader1(String _hdr,boolean _binset) throws Exception{
b4j.example.vmelement _sh = null;
 //BA.debugLineNum = 772;BA.debugLine="Sub AddSubHeader1(hdr As String, bInset As Boolean";
 //BA.debugLineNum = 773;BA.debugLine="Dim sh As VMElement";
_sh = new b4j.example.vmelement();
 //BA.debugLineNum = 774;BA.debugLine="sh.Initialize(vue, \"\").SetTag(\"v-subheader\")";
_sh._initialize /*b4j.example.vmelement*/ (ba,_vue,"")._settag /*b4j.example.vmelement*/ ("v-subheader");
 //BA.debugLineNum = 775;BA.debugLine="If bInset Then sh.SetAttrLoose(\"inset\")";
if (_binset) { 
_sh._setattrloose /*b4j.example.vmelement*/ ("inset");};
 //BA.debugLineNum = 776;BA.debugLine="sh.SetText(hdr)";
_sh._settext /*b4j.example.vmelement*/ (_hdr);
 //BA.debugLineNum = 777;BA.debugLine="sh.Pop(List)";
_sh._pop /*String*/ (_list);
 //BA.debugLineNum = 778;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 779;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 1285;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 1286;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 1287;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlist  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 1233;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 1234;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 1235;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 1236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1237;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 1289;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 1290;BA.debugLine="List.BuildModel(mprops, mstyles, lclasses, loose)";
_list._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 1291;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1292;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public List As VMElement";
_list = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 10;BA.debugLine="Private items As Map";
_items = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 12;BA.debugLine="Private parentchild As Map";
_parentchild = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Public UseVisibility As Boolean";
_usevisibility = false;
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlist  _clear() throws Exception{
String _listkey = "";
 //BA.debugLineNum = 860;BA.debugLine="Sub Clear As VMList";
 //BA.debugLineNum = 861;BA.debugLine="items.Clear";
_items.Clear();
 //BA.debugLineNum = 862;BA.debugLine="parentchild.Clear";
_parentchild.Clear();
 //BA.debugLineNum = 863;BA.debugLine="Dim listKey As String = $\"${ID}ds\"$";
_listkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"ds");
 //BA.debugLineNum = 864;BA.debugLine="vue.SetStateSingle(listKey, items)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_listkey,(Object)(_items.getObject()));
 //BA.debugLineNum = 865;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 866;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _createlistitem(String _datasource,String _key,String _avatar,String _iconname,String _title,String _subtitle,String _actionicon) throws Exception{
b4j.example.vmlistitem _vli = null;
b4j.example.vmlistitemavatar _lia = null;
b4j.example.vmimage _img = null;
b4j.example.vmlistitemicon _vlii = null;
b4j.example.vmicon _icon = null;
int _icontent = 0;
b4j.example.vmlistitemcontent _lic = null;
b4j.example.vmlistitemtitle _lit = null;
b4j.example.vmlistitemsubtitle _listt = null;
b4j.example.vmlistitemaction _la = null;
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 103;BA.debugLine="Sub CreateListItem(datasource As String, key As St";
 //BA.debugLineNum = 104;BA.debugLine="Dim vli As VMListItem";
_vli = new b4j.example.vmlistitem();
 //BA.debugLineNum = 105;BA.debugLine="vli.Initialize(vue, \"\", Module)";
_vli._initialize /*b4j.example.vmlistitem*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 106;BA.debugLine="vli.SetStatic(bStatic)";
_vli._setstatic /*b4j.example.vmlistitem*/ (_bstatic);
 //BA.debugLineNum = 107;BA.debugLine="vli.SetDesignMode(DesignMode)";
_vli._setdesignmode /*b4j.example.vmlistitem*/ (_designmode);
 //BA.debugLineNum = 108;BA.debugLine="If DesignMode Then Return vli";
if (_designmode) { 
if (true) return _vli;};
 //BA.debugLineNum = 109;BA.debugLine="vli.SetAttrSingle(\"v-for\", $\"(item, i) in ${datas";
_vli._setattrsingle /*b4j.example.vmlistitem*/ ("v-for",("(item, i) in "+__c.SmartStringFormatter("",(Object)(_datasource))+""));
 //BA.debugLineNum = 110;BA.debugLine="If key = \"\" Then";
if ((_key).equals("")) { 
 //BA.debugLineNum = 111;BA.debugLine="vli.SetAttrSingle(\":key\", \"i\")";
_vli._setattrsingle /*b4j.example.vmlistitem*/ (":key","i");
 //BA.debugLineNum = 112;BA.debugLine="vli.SetAttrSingle(\":id\", \"i\")";
_vli._setattrsingle /*b4j.example.vmlistitem*/ (":id","i");
 }else {
 //BA.debugLineNum = 114;BA.debugLine="vli.SetAttrSingle(\":key\", $\"item.${key}\"$)";
_vli._setattrsingle /*b4j.example.vmlistitem*/ (":key",("item."+__c.SmartStringFormatter("",(Object)(_key))+""));
 //BA.debugLineNum = 115;BA.debugLine="vli.SetAttrSingle(\":id\", $\"item.${key}\"$)";
_vli._setattrsingle /*b4j.example.vmlistitem*/ (":id",("item."+__c.SmartStringFormatter("",(Object)(_key))+""));
 };
 //BA.debugLineNum = 117;BA.debugLine="vli.SetOnClick($\"${ID}_click\"$)";
_vli._setonclick /*b4j.example.vmlistitem*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 119;BA.debugLine="If avatar <> \"\" Then";
if ((_avatar).equals("") == false) { 
 //BA.debugLineNum = 120;BA.debugLine="Dim lia As VMListItemAvatar";
_lia = new b4j.example.vmlistitemavatar();
 //BA.debugLineNum = 121;BA.debugLine="lia.Initialize(vue, \"\", Module)";
_lia._initialize /*b4j.example.vmlistitemavatar*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 122;BA.debugLine="lia.SetStatic(bStatic)";
_lia._setstatic /*b4j.example.vmlistitemavatar*/ (_bstatic);
 //BA.debugLineNum = 123;BA.debugLine="lia.SetVIf($\"item.${avatar}\"$)";
_lia._setvif /*b4j.example.vmlistitemavatar*/ (("item."+__c.SmartStringFormatter("",(Object)(_avatar))+""));
 //BA.debugLineNum = 124;BA.debugLine="Dim img As VMImage";
_img = new b4j.example.vmimage();
 //BA.debugLineNum = 125;BA.debugLine="img.Initialize(vue, \"\", Module).SetStatic(bStati";
_img._initialize /*b4j.example.vmimage*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmimage*/ (_bstatic);
 //BA.debugLineNum = 126;BA.debugLine="img.SetAttrSingle(\":src\", $\"item.${avatar}\"$)";
_img._setattrsingle /*b4j.example.vmimage*/ (":src",("item."+__c.SmartStringFormatter("",(Object)(_avatar))+""));
 //BA.debugLineNum = 127;BA.debugLine="img.Pop(lia.ListItemAvatar)";
_img._pop /*String*/ (_lia._listitemavatar /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 128;BA.debugLine="lia.Pop(vli.ListItem)";
_lia._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 131;BA.debugLine="If iconName <> \"\" Then";
if ((_iconname).equals("") == false) { 
 //BA.debugLineNum = 132;BA.debugLine="Dim vlii As VMListItemIcon";
_vlii = new b4j.example.vmlistitemicon();
 //BA.debugLineNum = 133;BA.debugLine="vlii.Initialize(vue, \"\", Module)";
_vlii._initialize /*b4j.example.vmlistitemicon*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 134;BA.debugLine="vlii.SetStatic(bStatic)";
_vlii._setstatic /*b4j.example.vmlistitemicon*/ (_bstatic);
 //BA.debugLineNum = 135;BA.debugLine="vlii.SetVif($\"item.${iconName}\"$)";
_vlii._setvif /*b4j.example.vmlistitemicon*/ (("item."+__c.SmartStringFormatter("",(Object)(_iconname))+""));
 //BA.debugLineNum = 136;BA.debugLine="Dim icon As VMIcon";
_icon = new b4j.example.vmicon();
 //BA.debugLineNum = 137;BA.debugLine="icon.Initialize(vue,\"\", Module)";
_icon._initialize /*b4j.example.vmicon*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 138;BA.debugLine="icon.SetStatic(bStatic)";
_icon._setstatic /*b4j.example.vmicon*/ (_bstatic);
 //BA.debugLineNum = 139;BA.debugLine="icon.SetVText($\"item.${iconName}\"$)";
_icon._setvtext /*b4j.example.vmicon*/ (("item."+__c.SmartStringFormatter("",(Object)(_iconname))+""));
 //BA.debugLineNum = 140;BA.debugLine="icon.Pop(vlii.ListItemIcon)";
_icon._pop /*String*/ (_vlii._listitemicon /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 141;BA.debugLine="vlii.Pop(vli.ListItem)";
_vlii._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 144;BA.debugLine="Dim iContent As Int = 0";
_icontent = (int) (0);
 //BA.debugLineNum = 145;BA.debugLine="If title <> \"\" Then iContent = iContent + 1";
if ((_title).equals("") == false) { 
_icontent = (int) (_icontent+1);};
 //BA.debugLineNum = 146;BA.debugLine="If subtitle <> \"\" Then iContent = iContent + 1";
if ((_subtitle).equals("") == false) { 
_icontent = (int) (_icontent+1);};
 //BA.debugLineNum = 148;BA.debugLine="If iContent > 0 Then";
if (_icontent>0) { 
 //BA.debugLineNum = 149;BA.debugLine="Dim lic As VMListItemContent";
_lic = new b4j.example.vmlistitemcontent();
 //BA.debugLineNum = 150;BA.debugLine="lic.Initialize(vue,\"\", Module).SetStatic(bStatic";
_lic._initialize /*b4j.example.vmlistitemcontent*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmlistitemcontent*/ (_bstatic);
 //BA.debugLineNum = 152;BA.debugLine="If title <> \"\" Then";
if ((_title).equals("") == false) { 
 //BA.debugLineNum = 153;BA.debugLine="Dim lit As VMListItemTitle";
_lit = new b4j.example.vmlistitemtitle();
 //BA.debugLineNum = 154;BA.debugLine="lit.Initialize(vue, \"\", Module)";
_lit._initialize /*b4j.example.vmlistitemtitle*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 155;BA.debugLine="lit.SetStatic(bStatic)";
_lit._setstatic /*b4j.example.vmlistitemtitle*/ (_bstatic);
 //BA.debugLineNum = 156;BA.debugLine="lit.SetVif($\"item.${title}\"$)";
_lit._setvif /*b4j.example.vmlistitemtitle*/ (("item."+__c.SmartStringFormatter("",(Object)(_title))+""));
 //BA.debugLineNum = 157;BA.debugLine="lit.SetVText($\"item.${title}\"$)";
_lit._setvtext /*b4j.example.vmlistitemtitle*/ (("item."+__c.SmartStringFormatter("",(Object)(_title))+""));
 //BA.debugLineNum = 158;BA.debugLine="lit.Pop(lic.ListItemContent)";
_lit._pop /*String*/ (_lic._listitemcontent /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 161;BA.debugLine="If subtitle <> \"\" Then";
if ((_subtitle).equals("") == false) { 
 //BA.debugLineNum = 162;BA.debugLine="Dim listt As VMListItemSubTitle";
_listt = new b4j.example.vmlistitemsubtitle();
 //BA.debugLineNum = 163;BA.debugLine="listt.Initialize(vue, \"\", Module)";
_listt._initialize /*b4j.example.vmlistitemsubtitle*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 164;BA.debugLine="listt.SetStatic(bStatic)";
_listt._setstatic /*b4j.example.vmlistitemsubtitle*/ (_bstatic);
 //BA.debugLineNum = 165;BA.debugLine="listt.SetVIf($\"item.${subtitle}\"$)";
_listt._setvif /*b4j.example.vmlistitemsubtitle*/ (("item."+__c.SmartStringFormatter("",(Object)(_subtitle))+""));
 //BA.debugLineNum = 166;BA.debugLine="listt.SetVText($\"item.${subtitle}\"$)";
_listt._setvtext /*b4j.example.vmlistitemsubtitle*/ (("item."+__c.SmartStringFormatter("",(Object)(_subtitle))+""));
 //BA.debugLineNum = 167;BA.debugLine="listt.Pop(lic.ListItemContent)";
_listt._pop /*String*/ (_lic._listitemcontent /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 169;BA.debugLine="lic.Pop(vli.ListItem)";
_lic._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 172;BA.debugLine="If actionIcon <> \"\" Then";
if ((_actionicon).equals("") == false) { 
 //BA.debugLineNum = 173;BA.debugLine="Dim la As VMListItemAction";
_la = new b4j.example.vmlistitemaction();
 //BA.debugLineNum = 174;BA.debugLine="la.Initialize(vue, \"\", Module)";
_la._initialize /*b4j.example.vmlistitemaction*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 175;BA.debugLine="la.SetStatic(bStatic)";
_la._setstatic /*b4j.example.vmlistitemaction*/ (_bstatic);
 //BA.debugLineNum = 176;BA.debugLine="la.SetDesignMode(DesignMode)";
_la._setdesignmode /*b4j.example.vmlistitemaction*/ (_designmode);
 //BA.debugLineNum = 177;BA.debugLine="la.SetVIf($\"item.${actionIcon}\"$)";
_la._setvif /*b4j.example.vmlistitemaction*/ (("item."+__c.SmartStringFormatter("",(Object)(_actionicon))+""));
 //BA.debugLineNum = 178;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 179;BA.debugLine="btn.Initialize(vue, \"\", Module).SetAttrLoose(\"ic";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,"",_module)._setattrloose /*b4j.example.vmbutton*/ ("icon");
 //BA.debugLineNum = 180;BA.debugLine="Dim icon As VMIcon";
_icon = new b4j.example.vmicon();
 //BA.debugLineNum = 181;BA.debugLine="icon.Initialize(vue, \"\", Module)";
_icon._initialize /*b4j.example.vmicon*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 182;BA.debugLine="icon.SetVText($\"item.${actionIcon}\"$)";
_icon._setvtext /*b4j.example.vmicon*/ (("item."+__c.SmartStringFormatter("",(Object)(_actionicon))+""));
 //BA.debugLineNum = 183;BA.debugLine="btn.AddComponent(icon.ToString)";
_btn._addcomponent /*b4j.example.vmbutton*/ (_icon._tostring /*String*/ ());
 //BA.debugLineNum = 184;BA.debugLine="la.AddComponent(btn.ToString)";
_la._addcomponent /*b4j.example.vmlistitemaction*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 185;BA.debugLine="la.Pop(vli.ListItem)";
_la._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 187;BA.debugLine="Return vli";
if (true) return _vli;
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _disable() throws Exception{
 //BA.debugLineNum = 1226;BA.debugLine="Sub Disable As VMList";
 //BA.debugLineNum = 1227;BA.debugLine="List.Disable(True)";
_list._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1228;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1229;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _enable() throws Exception{
 //BA.debugLineNum = 1221;BA.debugLine="Sub Enable As VMList";
 //BA.debugLineNum = 1222;BA.debugLine="List.Enable(True)";
_list._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _hide() throws Exception{
 //BA.debugLineNum = 1211;BA.debugLine="Sub Hide As VMList";
 //BA.debugLineNum = 1212;BA.debugLine="List.SetVisible(False)";
_list._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 1213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1214;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 18;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 19;BA.debugLine="List.Initialize(v, ID)";
_list._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 20;BA.debugLine="List.SetTag(\"v-list\")";
_list._settag /*b4j.example.vmelement*/ ("v-list");
 //BA.debugLineNum = 21;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 23;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 24;BA.debugLine="HasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 26;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 27;BA.debugLine="parentchild.Initialize";
_parentchild.Initialize();
 //BA.debugLineNum = 28;BA.debugLine="vue.SetData($\"${ID}ds\"$, Null)";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"ds"),__c.Null);
 //BA.debugLineNum = 29;BA.debugLine="UseVisibility = False";
_usevisibility = __c.False;
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 909;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 910;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 911;BA.debugLine="End Sub";
return "";
}
public String  _refresh() throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _k = "";
anywheresoftware.b4a.objects.collections.Map _li = null;
 //BA.debugLineNum = 851;BA.debugLine="Sub Refresh";
 //BA.debugLineNum = 852;BA.debugLine="Dim nl As List = vue.NewList";
_nl = new anywheresoftware.b4a.objects.collections.List();
_nl = _vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 853;BA.debugLine="For Each k As String In parentchild.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _parentchild.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 854;BA.debugLine="Dim li As Map = parentchild.get(k)";
_li = new anywheresoftware.b4a.objects.collections.Map();
_li = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_parentchild.Get((Object)(_k))));
 //BA.debugLineNum = 855;BA.debugLine="nl.Add(li)";
_nl.Add((Object)(_li.getObject()));
 }
};
 //BA.debugLineNum = 857;BA.debugLine="vue.SetData($\"${ID}ds\"$, nl)";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"ds"),(Object)(_nl.getObject()));
 //BA.debugLineNum = 858;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlist  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 1240;BA.debugLine="public Sub RemoveAttr(sName As String) As VMList";
 //BA.debugLineNum = 1241;BA.debugLine="List.RemoveAttr(sName)";
_list._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 1242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1243;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 889;BA.debugLine="Sub Render";
 //BA.debugLineNum = 890;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 891;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlist  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 920;BA.debugLine="Sub SetAttr(attr As Map) As VMList";
 //BA.debugLineNum = 921;BA.debugLine="List.SetAttr(attr)";
_list._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 922;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 923;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 81;BA.debugLine="Sub SetAttributes(attrs As List) As VMList";
 //BA.debugLineNum = 82;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 83;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetAttrLoose(loose As String) As VMList";
 //BA.debugLineNum = 77;BA.debugLine="List.SetAttrLoose(loose)";
_list._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1279;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 1280;BA.debugLine="List.SetAttrSingle(prop, value)";
_list._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 1281;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1282;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 939;BA.debugLine="Sub SetColor(varColor As String) As VMList";
 //BA.debugLineNum = 940;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 941;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 942;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 943;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 945;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 946;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 947;BA.debugLine="List.Bind(\":color\", pp)";
_list._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 948;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 949;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 638;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 639;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 640;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 641;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 642;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 643;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 645;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 646;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 647;BA.debugLine="List.Bind(\":color\", pp)";
_list._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 648;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 649;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 650;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 952;BA.debugLine="Sub SetDark(varDark As Boolean) As VMList";
 //BA.debugLineNum = 953;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 954;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 955;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 956;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 958;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 959;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 960;BA.debugLine="List.Bind(\":dark\", pp)";
_list._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 961;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 962;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 34;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setdatasource(String _datasource,String _key,String _avatar,String _iconname,String _title,String _subtitle,String _actionicon) throws Exception{
b4j.example.vmlistitem _vli = null;
 //BA.debugLineNum = 453;BA.debugLine="Sub SetDataSource(datasource As String, key As Str";
 //BA.debugLineNum = 454;BA.debugLine="Dim vli As VMListItem = CreateListItem(datasource";
_vli = _createlistitem(_datasource,_key,_avatar,_iconname,_title,_subtitle,_actionicon);
 //BA.debugLineNum = 455;BA.debugLine="vli.pop(List)";
_vli._pop /*String*/ (_list);
 //BA.debugLineNum = 456;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 457;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setdatasourcetemplate(String _datasource,String _key,String _avatar,String _iconname,String _title,String _subtitle,String _actionicon) throws Exception{
b4j.example.vmtemplate _tmp = null;
b4j.example.vmlistitem _vli = null;
b4j.example.vmlistitemavatar _lia = null;
b4j.example.vmimage _img = null;
b4j.example.vmlistitemicon _vlii = null;
b4j.example.vmicon _icon = null;
int _icontent = 0;
b4j.example.vmlistitemcontent _lic = null;
b4j.example.vmlistitemtitle _lit = null;
b4j.example.vmlistitemsubtitle _listt = null;
b4j.example.vmlistitemaction _la = null;
b4j.example.vmbutton _btn = null;
String _btnkey = "";
String _scode = "";
b4j.example.vmdivider _dvd = null;
b4j.example.vmsubheader _sh = null;
 //BA.debugLineNum = 191;BA.debugLine="Sub SetDataSourceTemplate(datasource As String, ke";
 //BA.debugLineNum = 192;BA.debugLine="If vue.StateExists(datasource) = False Then";
if (_vue._stateexists /*boolean*/ (_datasource)==__c.False) { 
 //BA.debugLineNum = 193;BA.debugLine="vue.SetData(datasource, vue.newlist)";
_vue._setdata /*b4j.example.bananovue*/ (_datasource,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 };
 //BA.debugLineNum = 195;BA.debugLine="If DesignMode Then Return Me";
if (_designmode) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 197;BA.debugLine="Dim tmp As VMTemplate";
_tmp = new b4j.example.vmtemplate();
 //BA.debugLineNum = 198;BA.debugLine="tmp.Initialize(vue, $\"${ID}tmpl\"$, Module)";
_tmp._initialize /*b4j.example.vmtemplate*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tmpl"),_module);
 //BA.debugLineNum = 199;BA.debugLine="tmp.SetStatic(bStatic)";
_tmp._setstatic /*b4j.example.vmtemplate*/ (_bstatic);
 //BA.debugLineNum = 200;BA.debugLine="tmp.SetDesignMode(DesignMode)";
_tmp._setdesignmode /*b4j.example.vmtemplate*/ (_designmode);
 //BA.debugLineNum = 201;BA.debugLine="tmp.SetAttrSingle(\"v-for\", $\"(item, i) in ${datas";
_tmp._setattrsingle /*b4j.example.vmtemplate*/ ("v-for",("(item, i) in "+__c.SmartStringFormatter("",(Object)(_datasource))+""));
 //BA.debugLineNum = 203;BA.debugLine="Dim vli As VMListItem";
_vli = new b4j.example.vmlistitem();
 //BA.debugLineNum = 204;BA.debugLine="vli.Initialize(vue, \"\", Module).SetStatic(bStatic";
_vli._initialize /*b4j.example.vmlistitem*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmlistitem*/ (_bstatic);
 //BA.debugLineNum = 205;BA.debugLine="vli.Bind(\":key\", $\"item.${key}\"$)";
_vli._bind /*b4j.example.vmlistitem*/ (":key",("item."+__c.SmartStringFormatter("",(Object)(_key))+""));
 //BA.debugLineNum = 206;BA.debugLine="vli.SetAttrSingle(\":id\", $\"item.${key}\"$)";
_vli._setattrsingle /*b4j.example.vmlistitem*/ (":id",("item."+__c.SmartStringFormatter("",(Object)(_key))+""));
 //BA.debugLineNum = 207;BA.debugLine="vli.SetOnClick($\"${ID}_click\"$)";
_vli._setonclick /*b4j.example.vmlistitem*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 208;BA.debugLine="If UseVisibility Then";
if (_usevisibility) { 
 //BA.debugLineNum = 209;BA.debugLine="vli.SetVIf($\"item.visibility\"$)";
_vli._setvif /*b4j.example.vmlistitem*/ (("item.visibility"));
 }else {
 //BA.debugLineNum = 211;BA.debugLine="vli.SetVIf($\"item.${key}\"$)";
_vli._setvif /*b4j.example.vmlistitem*/ (("item."+__c.SmartStringFormatter("",(Object)(_key))+""));
 };
 //BA.debugLineNum = 214;BA.debugLine="If avatar <> \"\" Then";
if ((_avatar).equals("") == false) { 
 //BA.debugLineNum = 215;BA.debugLine="Dim lia As VMListItemAvatar";
_lia = new b4j.example.vmlistitemavatar();
 //BA.debugLineNum = 216;BA.debugLine="lia.Initialize(vue, \"\", Module)";
_lia._initialize /*b4j.example.vmlistitemavatar*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 217;BA.debugLine="lia.SetStatic(bStatic)";
_lia._setstatic /*b4j.example.vmlistitemavatar*/ (_bstatic);
 //BA.debugLineNum = 218;BA.debugLine="lia.SetDesignMode(DesignMode)";
_lia._setdesignmode /*b4j.example.vmlistitemavatar*/ (_designmode);
 //BA.debugLineNum = 219;BA.debugLine="lia.SetVIf($\"item.${avatar}\"$)";
_lia._setvif /*b4j.example.vmlistitemavatar*/ (("item."+__c.SmartStringFormatter("",(Object)(_avatar))+""));
 //BA.debugLineNum = 220;BA.debugLine="Dim img As VMImage";
_img = new b4j.example.vmimage();
 //BA.debugLineNum = 221;BA.debugLine="img.Initialize(vue, \"\", Module)";
_img._initialize /*b4j.example.vmimage*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 222;BA.debugLine="img.SetStatic(bStatic)";
_img._setstatic /*b4j.example.vmimage*/ (_bstatic);
 //BA.debugLineNum = 223;BA.debugLine="img.SetDesignMode(DesignMode)";
_img._setdesignmode /*b4j.example.vmimage*/ (_designmode);
 //BA.debugLineNum = 224;BA.debugLine="img.SetAttrSingle(\":src\", $\"item.${avatar}\"$)";
_img._setattrsingle /*b4j.example.vmimage*/ (":src",("item."+__c.SmartStringFormatter("",(Object)(_avatar))+""));
 //BA.debugLineNum = 225;BA.debugLine="img.Pop(lia.ListItemAvatar)";
_img._pop /*String*/ (_lia._listitemavatar /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 226;BA.debugLine="lia.Pop(vli.ListItem)";
_lia._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 229;BA.debugLine="If iconName <> \"\" Then";
if ((_iconname).equals("") == false) { 
 //BA.debugLineNum = 230;BA.debugLine="Dim vlii As VMListItemIcon";
_vlii = new b4j.example.vmlistitemicon();
 //BA.debugLineNum = 231;BA.debugLine="vlii.Initialize(vue, \"\", Module)";
_vlii._initialize /*b4j.example.vmlistitemicon*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 232;BA.debugLine="vlii.SetStatic(bStatic)";
_vlii._setstatic /*b4j.example.vmlistitemicon*/ (_bstatic);
 //BA.debugLineNum = 233;BA.debugLine="vlii.SetDesignMode(DesignMode)";
_vlii._setdesignmode /*b4j.example.vmlistitemicon*/ (_designmode);
 //BA.debugLineNum = 234;BA.debugLine="vlii.SetVif($\"item.${iconName}\"$)";
_vlii._setvif /*b4j.example.vmlistitemicon*/ (("item."+__c.SmartStringFormatter("",(Object)(_iconname))+""));
 //BA.debugLineNum = 235;BA.debugLine="Dim icon As VMIcon";
_icon = new b4j.example.vmicon();
 //BA.debugLineNum = 236;BA.debugLine="icon.Initialize(vue,\"\", Module)";
_icon._initialize /*b4j.example.vmicon*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 237;BA.debugLine="icon.SetStatic(bStatic)";
_icon._setstatic /*b4j.example.vmicon*/ (_bstatic);
 //BA.debugLineNum = 238;BA.debugLine="icon.SetDesignMode(DesignMode)";
_icon._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 239;BA.debugLine="icon.SetVText($\"item.${iconName}\"$)";
_icon._setvtext /*b4j.example.vmicon*/ (("item."+__c.SmartStringFormatter("",(Object)(_iconname))+""));
 //BA.debugLineNum = 240;BA.debugLine="icon.Pop(vlii.ListItemIcon)";
_icon._pop /*String*/ (_vlii._listitemicon /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 241;BA.debugLine="vlii.Pop(vli.ListItem)";
_vlii._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 244;BA.debugLine="Dim iContent As Int = 0";
_icontent = (int) (0);
 //BA.debugLineNum = 245;BA.debugLine="If title <> \"\" Then iContent = iContent + 1";
if ((_title).equals("") == false) { 
_icontent = (int) (_icontent+1);};
 //BA.debugLineNum = 246;BA.debugLine="If subtitle <> \"\" Then iContent = iContent + 1";
if ((_subtitle).equals("") == false) { 
_icontent = (int) (_icontent+1);};
 //BA.debugLineNum = 248;BA.debugLine="If iContent > 0 Then";
if (_icontent>0) { 
 //BA.debugLineNum = 249;BA.debugLine="Dim lic As VMListItemContent";
_lic = new b4j.example.vmlistitemcontent();
 //BA.debugLineNum = 250;BA.debugLine="lic.Initialize(vue,\"\", Module)";
_lic._initialize /*b4j.example.vmlistitemcontent*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 251;BA.debugLine="lic.SetStatic(bStatic)";
_lic._setstatic /*b4j.example.vmlistitemcontent*/ (_bstatic);
 //BA.debugLineNum = 252;BA.debugLine="lic.SetDesignMode(DesignMode)";
_lic._setdesignmode /*b4j.example.vmlistitemcontent*/ (_designmode);
 //BA.debugLineNum = 254;BA.debugLine="If title <> \"\" Then";
if ((_title).equals("") == false) { 
 //BA.debugLineNum = 255;BA.debugLine="Dim lit As VMListItemTitle";
_lit = new b4j.example.vmlistitemtitle();
 //BA.debugLineNum = 256;BA.debugLine="lit.Initialize(vue, \"\", Module)";
_lit._initialize /*b4j.example.vmlistitemtitle*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 257;BA.debugLine="lit.SetStatic(bStatic)";
_lit._setstatic /*b4j.example.vmlistitemtitle*/ (_bstatic);
 //BA.debugLineNum = 258;BA.debugLine="lit.SetDesignMode(DesignMode)";
_lit._setdesignmode /*b4j.example.vmlistitemtitle*/ (_designmode);
 //BA.debugLineNum = 259;BA.debugLine="lit.SetVIf($\"item.${title}\"$)";
_lit._setvif /*b4j.example.vmlistitemtitle*/ (("item."+__c.SmartStringFormatter("",(Object)(_title))+""));
 //BA.debugLineNum = 260;BA.debugLine="lit.SetVText($\"item.${title}\"$)";
_lit._setvtext /*b4j.example.vmlistitemtitle*/ (("item."+__c.SmartStringFormatter("",(Object)(_title))+""));
 //BA.debugLineNum = 261;BA.debugLine="lit.Pop(lic.ListItemContent)";
_lit._pop /*String*/ (_lic._listitemcontent /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 264;BA.debugLine="If subtitle <> \"\" Then";
if ((_subtitle).equals("") == false) { 
 //BA.debugLineNum = 265;BA.debugLine="Dim listt As VMListItemSubTitle";
_listt = new b4j.example.vmlistitemsubtitle();
 //BA.debugLineNum = 266;BA.debugLine="listt.Initialize(vue, \"\", Module)";
_listt._initialize /*b4j.example.vmlistitemsubtitle*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 267;BA.debugLine="listt.SetStatic(bStatic)";
_listt._setstatic /*b4j.example.vmlistitemsubtitle*/ (_bstatic);
 //BA.debugLineNum = 268;BA.debugLine="listt.SetDesignMode(DesignMode)";
_listt._setdesignmode /*b4j.example.vmlistitemsubtitle*/ (_designmode);
 //BA.debugLineNum = 269;BA.debugLine="listt.SetVIf($\"item.${subtitle}\"$)";
_listt._setvif /*b4j.example.vmlistitemsubtitle*/ (("item."+__c.SmartStringFormatter("",(Object)(_subtitle))+""));
 //BA.debugLineNum = 270;BA.debugLine="listt.SetVText($\"item.${subtitle}\"$)";
_listt._setvtext /*b4j.example.vmlistitemsubtitle*/ (("item."+__c.SmartStringFormatter("",(Object)(_subtitle))+""));
 //BA.debugLineNum = 271;BA.debugLine="listt.Pop(lic.ListItemContent)";
_listt._pop /*String*/ (_lic._listitemcontent /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 273;BA.debugLine="lic.Pop(vli.ListItem)";
_lic._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 276;BA.debugLine="If actionIcon <> \"\" Then";
if ((_actionicon).equals("") == false) { 
 //BA.debugLineNum = 277;BA.debugLine="Dim la As VMListItemAction";
_la = new b4j.example.vmlistitemaction();
 //BA.debugLineNum = 278;BA.debugLine="la.Initialize(vue, \"\", Module)";
_la._initialize /*b4j.example.vmlistitemaction*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 279;BA.debugLine="la.SetStatic(bStatic)";
_la._setstatic /*b4j.example.vmlistitemaction*/ (_bstatic);
 //BA.debugLineNum = 280;BA.debugLine="la.SetDesignMode(DesignMode)";
_la._setdesignmode /*b4j.example.vmlistitemaction*/ (_designmode);
 //BA.debugLineNum = 281;BA.debugLine="la.SetVIf($\"item.${actionIcon}\"$)";
_la._setvif /*b4j.example.vmlistitemaction*/ (("item."+__c.SmartStringFormatter("",(Object)(_actionicon))+""));
 //BA.debugLineNum = 282;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 283;BA.debugLine="Dim btnKey As String = $\"${ID}action\"$";
_btnkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"action");
 //BA.debugLineNum = 284;BA.debugLine="btn.Initialize(vue, btnKey, Module).SetAttrLoose";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_btnkey,_module)._setattrloose /*b4j.example.vmbutton*/ ("icon");
 //BA.debugLineNum = 285;BA.debugLine="Dim icon As VMIcon";
_icon = new b4j.example.vmicon();
 //BA.debugLineNum = 286;BA.debugLine="icon.Initialize(vue, \"\", Module)";
_icon._initialize /*b4j.example.vmicon*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 287;BA.debugLine="icon.SetVText($\"item.${actionIcon}\"$)";
_icon._setvtext /*b4j.example.vmicon*/ (("item."+__c.SmartStringFormatter("",(Object)(_actionicon))+""));
 //BA.debugLineNum = 288;BA.debugLine="btn.AddComponent(icon.ToString)";
_btn._addcomponent /*b4j.example.vmbutton*/ (_icon._tostring /*String*/ ());
 //BA.debugLineNum = 289;BA.debugLine="If SubExists(Module, $\"${ID}action_click\"$) Then";
if (__c.SubExists(ba,_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"action_click"))) { 
 //BA.debugLineNum = 290;BA.debugLine="Dim sCode As String = $\"${ID}action_click(item.";
_scode = (""+__c.SmartStringFormatter("",(Object)(_id))+"action_click(item."+__c.SmartStringFormatter("",(Object)(_key))+")");
 //BA.debugLineNum = 291;BA.debugLine="btn.SetAttrSingle(\"v-on:click.stop\", sCode)";
_btn._setattrsingle /*b4j.example.vmbutton*/ ("v-on:click.stop",_scode);
 };
 //BA.debugLineNum = 293;BA.debugLine="la.AddComponent(btn.ToString)";
_la._addcomponent /*b4j.example.vmlistitemaction*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 294;BA.debugLine="la.Pop(vli.ListItem)";
_la._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 296;BA.debugLine="vli.Pop(tmp.Template)";
_vli._pop /*String*/ (_tmp._template /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 298;BA.debugLine="Dim dvd As VMDivider";
_dvd = new b4j.example.vmdivider();
 //BA.debugLineNum = 299;BA.debugLine="dvd.Initialize(vue).SetVElseIf(\"item.divider\").Bi";
_dvd._initialize /*b4j.example.vmdivider*/ (ba,_vue)._setvelseif /*b4j.example.vmdivider*/ ("item.divider")._bind /*b4j.example.vmdivider*/ (":key","i")._setinset /*b4j.example.vmdivider*/ ();
 //BA.debugLineNum = 300;BA.debugLine="dvd.Pop(tmp.Template)";
_dvd._pop /*String*/ (_tmp._template /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 302;BA.debugLine="Dim sh As VMSubHeader";
_sh = new b4j.example.vmsubheader();
 //BA.debugLineNum = 303;BA.debugLine="sh.Initialize(vue).SetVElseIf(\"item.header\").Bind";
_sh._initialize /*b4j.example.vmsubheader*/ (ba,_vue)._setvelseif /*b4j.example.vmsubheader*/ ("item.header")._bind /*b4j.example.vmsubheader*/ (":key","item.header")._setvtext /*b4j.example.vmsubheader*/ ("item.header")._setinset /*b4j.example.vmsubheader*/ ((Object)(__c.True));
 //BA.debugLineNum = 304;BA.debugLine="sh.Pop(tmp.Template)";
_sh._pop /*String*/ (_tmp._template /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 305;BA.debugLine="tmp.Pop(List)";
_tmp._pop /*String*/ (_list);
 //BA.debugLineNum = 306;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setdatasourcetemplate1(String _datasource,String _key,String _avatar,String _iconname,String _iconcolor,String _title,String _subtitle,String _subtitle1,String _actionicon,String _actioniconcolor) throws Exception{
b4j.example.vmtemplate _tmp = null;
b4j.example.vmlistitem _vli = null;
b4j.example.vmlistitemavatar _lia = null;
b4j.example.vmimage _img = null;
b4j.example.vmlistitemicon _vlii = null;
b4j.example.vmicon _icon = null;
int _icontent = 0;
b4j.example.vmlistitemcontent _lic = null;
b4j.example.vmlistitemtitle _lit = null;
b4j.example.vmlistitemsubtitle _listt = null;
b4j.example.vmlistitemsubtitle _listt1 = null;
b4j.example.vmlistitemaction _la = null;
b4j.example.vmbutton _btn = null;
b4j.example.vmdivider _dvd = null;
b4j.example.vmsubheader _sh = null;
 //BA.debugLineNum = 311;BA.debugLine="Sub SetDataSourceTemplate1(datasource As String, k";
 //BA.debugLineNum = 312;BA.debugLine="If vue.StateExists(datasource) = False Then";
if (_vue._stateexists /*boolean*/ (_datasource)==__c.False) { 
 //BA.debugLineNum = 313;BA.debugLine="vue.SetData(datasource, vue.newlist)";
_vue._setdata /*b4j.example.bananovue*/ (_datasource,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 };
 //BA.debugLineNum = 315;BA.debugLine="If DesignMode Then Return Me";
if (_designmode) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 317;BA.debugLine="Dim tmp As VMTemplate";
_tmp = new b4j.example.vmtemplate();
 //BA.debugLineNum = 318;BA.debugLine="tmp.Initialize(vue, $\"${ID}tmpl\"$, Module)";
_tmp._initialize /*b4j.example.vmtemplate*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tmpl"),_module);
 //BA.debugLineNum = 319;BA.debugLine="tmp.SetStatic(bStatic)";
_tmp._setstatic /*b4j.example.vmtemplate*/ (_bstatic);
 //BA.debugLineNum = 320;BA.debugLine="tmp.SetDesignMode(DesignMode)";
_tmp._setdesignmode /*b4j.example.vmtemplate*/ (_designmode);
 //BA.debugLineNum = 321;BA.debugLine="tmp.SetAttrSingle(\"v-for\", $\"(item, i) in ${datas";
_tmp._setattrsingle /*b4j.example.vmtemplate*/ ("v-for",("(item, i) in "+__c.SmartStringFormatter("",(Object)(_datasource))+""));
 //BA.debugLineNum = 323;BA.debugLine="Dim vli As VMListItem";
_vli = new b4j.example.vmlistitem();
 //BA.debugLineNum = 324;BA.debugLine="vli.Initialize(vue, \"\", Module).SetStatic(bStatic";
_vli._initialize /*b4j.example.vmlistitem*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmlistitem*/ (_bstatic);
 //BA.debugLineNum = 325;BA.debugLine="vli.Bind(\":key\", $\"item.${key}\"$)";
_vli._bind /*b4j.example.vmlistitem*/ (":key",("item."+__c.SmartStringFormatter("",(Object)(_key))+""));
 //BA.debugLineNum = 326;BA.debugLine="vli.SetAttrSingle(\":id\", $\"item.${key}\"$)";
_vli._setattrsingle /*b4j.example.vmlistitem*/ (":id",("item."+__c.SmartStringFormatter("",(Object)(_key))+""));
 //BA.debugLineNum = 327;BA.debugLine="vli.SetOnClick($\"${ID}_click\"$)";
_vli._setonclick /*b4j.example.vmlistitem*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 328;BA.debugLine="If UseVisibility Then";
if (_usevisibility) { 
 //BA.debugLineNum = 329;BA.debugLine="vli.SetVIf($\"item.visibility\"$)";
_vli._setvif /*b4j.example.vmlistitem*/ (("item.visibility"));
 }else {
 //BA.debugLineNum = 331;BA.debugLine="vli.SetVIf($\"item.${key}\"$)";
_vli._setvif /*b4j.example.vmlistitem*/ (("item."+__c.SmartStringFormatter("",(Object)(_key))+""));
 };
 //BA.debugLineNum = 334;BA.debugLine="If avatar <> \"\" Then";
if ((_avatar).equals("") == false) { 
 //BA.debugLineNum = 335;BA.debugLine="Dim lia As VMListItemAvatar";
_lia = new b4j.example.vmlistitemavatar();
 //BA.debugLineNum = 336;BA.debugLine="lia.Initialize(vue, \"\", Module)";
_lia._initialize /*b4j.example.vmlistitemavatar*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 337;BA.debugLine="lia.SetStatic(bStatic)";
_lia._setstatic /*b4j.example.vmlistitemavatar*/ (_bstatic);
 //BA.debugLineNum = 338;BA.debugLine="lia.SetDesignMode(DesignMode)";
_lia._setdesignmode /*b4j.example.vmlistitemavatar*/ (_designmode);
 //BA.debugLineNum = 339;BA.debugLine="lia.SetVIf($\"item.${avatar}\"$)";
_lia._setvif /*b4j.example.vmlistitemavatar*/ (("item."+__c.SmartStringFormatter("",(Object)(_avatar))+""));
 //BA.debugLineNum = 340;BA.debugLine="Dim img As VMImage";
_img = new b4j.example.vmimage();
 //BA.debugLineNum = 341;BA.debugLine="img.Initialize(vue, \"\", Module)";
_img._initialize /*b4j.example.vmimage*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 342;BA.debugLine="img.SetStatic(bStatic)";
_img._setstatic /*b4j.example.vmimage*/ (_bstatic);
 //BA.debugLineNum = 343;BA.debugLine="img.SetDesignMode(DesignMode)";
_img._setdesignmode /*b4j.example.vmimage*/ (_designmode);
 //BA.debugLineNum = 344;BA.debugLine="img.SetAttrSingle(\":src\", $\"item.${avatar}\"$)";
_img._setattrsingle /*b4j.example.vmimage*/ (":src",("item."+__c.SmartStringFormatter("",(Object)(_avatar))+""));
 //BA.debugLineNum = 345;BA.debugLine="img.Pop(lia.ListItemAvatar)";
_img._pop /*String*/ (_lia._listitemavatar /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 346;BA.debugLine="lia.Pop(vli.ListItem)";
_lia._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 349;BA.debugLine="If iconName <> \"\" Then";
if ((_iconname).equals("") == false) { 
 //BA.debugLineNum = 350;BA.debugLine="Dim vlii As VMListItemIcon";
_vlii = new b4j.example.vmlistitemicon();
 //BA.debugLineNum = 351;BA.debugLine="vlii.Initialize(vue, \"\", Module)";
_vlii._initialize /*b4j.example.vmlistitemicon*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 352;BA.debugLine="vlii.SetStatic(bStatic)";
_vlii._setstatic /*b4j.example.vmlistitemicon*/ (_bstatic);
 //BA.debugLineNum = 353;BA.debugLine="vlii.SetDesignMode(DesignMode)";
_vlii._setdesignmode /*b4j.example.vmlistitemicon*/ (_designmode);
 //BA.debugLineNum = 354;BA.debugLine="vlii.SetVif($\"item.${iconName}\"$)";
_vlii._setvif /*b4j.example.vmlistitemicon*/ (("item."+__c.SmartStringFormatter("",(Object)(_iconname))+""));
 //BA.debugLineNum = 355;BA.debugLine="Dim icon As VMIcon";
_icon = new b4j.example.vmicon();
 //BA.debugLineNum = 356;BA.debugLine="icon.Initialize(vue,\"\", Module)";
_icon._initialize /*b4j.example.vmicon*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 357;BA.debugLine="icon.SetStatic(bStatic)";
_icon._setstatic /*b4j.example.vmicon*/ (_bstatic);
 //BA.debugLineNum = 358;BA.debugLine="icon.SetDesignMode(DesignMode)";
_icon._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 359;BA.debugLine="icon.SetVText($\"item.${iconName}\"$)";
_icon._setvtext /*b4j.example.vmicon*/ (("item."+__c.SmartStringFormatter("",(Object)(_iconname))+""));
 //BA.debugLineNum = 360;BA.debugLine="If iconColor <> \"\" Then icon.SetAttrSingle(\":col";
if ((_iconcolor).equals("") == false) { 
_icon._setattrsingle /*b4j.example.vmicon*/ (":color",("item."+__c.SmartStringFormatter("",(Object)(_iconcolor))+""));};
 //BA.debugLineNum = 361;BA.debugLine="icon.Pop(vlii.ListItemIcon)";
_icon._pop /*String*/ (_vlii._listitemicon /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 362;BA.debugLine="vlii.Pop(vli.ListItem)";
_vlii._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 365;BA.debugLine="Dim iContent As Int = 0";
_icontent = (int) (0);
 //BA.debugLineNum = 366;BA.debugLine="If title <> \"\" Then iContent = iContent + 1";
if ((_title).equals("") == false) { 
_icontent = (int) (_icontent+1);};
 //BA.debugLineNum = 367;BA.debugLine="If subtitle <> \"\" Then iContent = iContent + 1";
if ((_subtitle).equals("") == false) { 
_icontent = (int) (_icontent+1);};
 //BA.debugLineNum = 369;BA.debugLine="If iContent > 0 Then";
if (_icontent>0) { 
 //BA.debugLineNum = 370;BA.debugLine="Dim lic As VMListItemContent";
_lic = new b4j.example.vmlistitemcontent();
 //BA.debugLineNum = 371;BA.debugLine="lic.Initialize(vue,\"\", Module)";
_lic._initialize /*b4j.example.vmlistitemcontent*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 372;BA.debugLine="lic.SetStatic(bStatic)";
_lic._setstatic /*b4j.example.vmlistitemcontent*/ (_bstatic);
 //BA.debugLineNum = 373;BA.debugLine="lic.SetDesignMode(DesignMode)";
_lic._setdesignmode /*b4j.example.vmlistitemcontent*/ (_designmode);
 //BA.debugLineNum = 375;BA.debugLine="If title <> \"\" Then";
if ((_title).equals("") == false) { 
 //BA.debugLineNum = 376;BA.debugLine="Dim lit As VMListItemTitle";
_lit = new b4j.example.vmlistitemtitle();
 //BA.debugLineNum = 377;BA.debugLine="lit.Initialize(vue, \"\", Module)";
_lit._initialize /*b4j.example.vmlistitemtitle*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 378;BA.debugLine="lit.SetStatic(bStatic)";
_lit._setstatic /*b4j.example.vmlistitemtitle*/ (_bstatic);
 //BA.debugLineNum = 379;BA.debugLine="lit.SetDesignMode(DesignMode)";
_lit._setdesignmode /*b4j.example.vmlistitemtitle*/ (_designmode);
 //BA.debugLineNum = 380;BA.debugLine="lit.SetVif($\"item.${title}\"$)";
_lit._setvif /*b4j.example.vmlistitemtitle*/ (("item."+__c.SmartStringFormatter("",(Object)(_title))+""));
 //BA.debugLineNum = 381;BA.debugLine="lit.SetVText($\"item.${title}\"$)";
_lit._setvtext /*b4j.example.vmlistitemtitle*/ (("item."+__c.SmartStringFormatter("",(Object)(_title))+""));
 //BA.debugLineNum = 382;BA.debugLine="lit.Pop(lic.ListItemContent)";
_lit._pop /*String*/ (_lic._listitemcontent /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 385;BA.debugLine="If subtitle <> \"\" Then";
if ((_subtitle).equals("") == false) { 
 //BA.debugLineNum = 386;BA.debugLine="Dim listt As VMListItemSubTitle";
_listt = new b4j.example.vmlistitemsubtitle();
 //BA.debugLineNum = 387;BA.debugLine="listt.Initialize(vue, \"\", Module)";
_listt._initialize /*b4j.example.vmlistitemsubtitle*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 388;BA.debugLine="listt.SetStatic(bStatic)";
_listt._setstatic /*b4j.example.vmlistitemsubtitle*/ (_bstatic);
 //BA.debugLineNum = 389;BA.debugLine="listt.SetDesignMode(DesignMode)";
_listt._setdesignmode /*b4j.example.vmlistitemsubtitle*/ (_designmode);
 //BA.debugLineNum = 390;BA.debugLine="listt.SetVIf($\"item.${subtitle}\"$)";
_listt._setvif /*b4j.example.vmlistitemsubtitle*/ (("item."+__c.SmartStringFormatter("",(Object)(_subtitle))+""));
 //BA.debugLineNum = 391;BA.debugLine="listt.SetVText($\"item.${subtitle}\"$)";
_listt._setvtext /*b4j.example.vmlistitemsubtitle*/ (("item."+__c.SmartStringFormatter("",(Object)(_subtitle))+""));
 //BA.debugLineNum = 392;BA.debugLine="listt.Pop(lic.ListItemContent)";
_listt._pop /*String*/ (_lic._listitemcontent /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 395;BA.debugLine="If subtitle1 <> \"\" Then";
if ((_subtitle1).equals("") == false) { 
 //BA.debugLineNum = 396;BA.debugLine="Dim listt1 As VMListItemSubTitle";
_listt1 = new b4j.example.vmlistitemsubtitle();
 //BA.debugLineNum = 397;BA.debugLine="listt1.Initialize(vue, \"\", Module)";
_listt1._initialize /*b4j.example.vmlistitemsubtitle*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 398;BA.debugLine="listt1.SetStatic(bStatic)";
_listt1._setstatic /*b4j.example.vmlistitemsubtitle*/ (_bstatic);
 //BA.debugLineNum = 399;BA.debugLine="listt1.SetDesignMode(DesignMode)";
_listt1._setdesignmode /*b4j.example.vmlistitemsubtitle*/ (_designmode);
 //BA.debugLineNum = 400;BA.debugLine="listt1.SetVIf($\"item.${subtitle1}\"$)";
_listt1._setvif /*b4j.example.vmlistitemsubtitle*/ (("item."+__c.SmartStringFormatter("",(Object)(_subtitle1))+""));
 //BA.debugLineNum = 401;BA.debugLine="listt1.SetVText($\"item.${subtitle1}\"$)";
_listt1._setvtext /*b4j.example.vmlistitemsubtitle*/ (("item."+__c.SmartStringFormatter("",(Object)(_subtitle1))+""));
 //BA.debugLineNum = 402;BA.debugLine="listt1.Pop(lic.ListItemContent)";
_listt1._pop /*String*/ (_lic._listitemcontent /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 404;BA.debugLine="lic.Pop(vli.ListItem)";
_lic._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 407;BA.debugLine="If actionIcon <> \"\" Then";
if ((_actionicon).equals("") == false) { 
 //BA.debugLineNum = 408;BA.debugLine="Dim la As VMListItemAction";
_la = new b4j.example.vmlistitemaction();
 //BA.debugLineNum = 409;BA.debugLine="la.Initialize(vue, \"\", Module)";
_la._initialize /*b4j.example.vmlistitemaction*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 410;BA.debugLine="la.SetStatic(bStatic)";
_la._setstatic /*b4j.example.vmlistitemaction*/ (_bstatic);
 //BA.debugLineNum = 411;BA.debugLine="la.SetDesignMode(DesignMode)";
_la._setdesignmode /*b4j.example.vmlistitemaction*/ (_designmode);
 //BA.debugLineNum = 412;BA.debugLine="la.SetVIf($\"item.${actionIcon}\"$)";
_la._setvif /*b4j.example.vmlistitemaction*/ (("item."+__c.SmartStringFormatter("",(Object)(_actionicon))+""));
 //BA.debugLineNum = 413;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 414;BA.debugLine="btn.Initialize(vue, \"\", Module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 415;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 416;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 417;BA.debugLine="btn.SetAttrLoose(\"icon\")";
_btn._setattrloose /*b4j.example.vmbutton*/ ("icon");
 //BA.debugLineNum = 418;BA.debugLine="Dim icon As VMIcon";
_icon = new b4j.example.vmicon();
 //BA.debugLineNum = 419;BA.debugLine="icon.Initialize(vue, \"\", Module)";
_icon._initialize /*b4j.example.vmicon*/ (ba,_vue,"",_module);
 //BA.debugLineNum = 420;BA.debugLine="icon.SetStatic(bStatic)";
_icon._setstatic /*b4j.example.vmicon*/ (_bstatic);
 //BA.debugLineNum = 421;BA.debugLine="icon.SetDesignMode(DesignMode)";
_icon._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 422;BA.debugLine="If actionIconColor <> \"\" Then";
if ((_actioniconcolor).equals("") == false) { 
 //BA.debugLineNum = 423;BA.debugLine="icon.SetAttrSingle(\":color\", $\"item.${actionIco";
_icon._setattrsingle /*b4j.example.vmicon*/ (":color",("item."+__c.SmartStringFormatter("",(Object)(_actioniconcolor))+""));
 };
 //BA.debugLineNum = 425;BA.debugLine="icon.SetVText($\"item.${actionIcon}\"$)";
_icon._setvtext /*b4j.example.vmicon*/ (("item."+__c.SmartStringFormatter("",(Object)(_actionicon))+""));
 //BA.debugLineNum = 426;BA.debugLine="btn.AddComponent(icon.ToString)";
_btn._addcomponent /*b4j.example.vmbutton*/ (_icon._tostring /*String*/ ());
 //BA.debugLineNum = 427;BA.debugLine="la.AddComponent(btn.ToString)";
_la._addcomponent /*b4j.example.vmlistitemaction*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 428;BA.debugLine="la.Pop(vli.ListItem)";
_la._pop /*String*/ (_vli._listitem /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 431;BA.debugLine="vli.Pop(tmp.Template)";
_vli._pop /*String*/ (_tmp._template /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 433;BA.debugLine="Dim dvd As VMDivider";
_dvd = new b4j.example.vmdivider();
 //BA.debugLineNum = 434;BA.debugLine="dvd.Initialize(vue)";
_dvd._initialize /*b4j.example.vmdivider*/ (ba,_vue);
 //BA.debugLineNum = 435;BA.debugLine="dvd.SetVElseIf(\"item.divider\")";
_dvd._setvelseif /*b4j.example.vmdivider*/ ("item.divider");
 //BA.debugLineNum = 436;BA.debugLine="dvd.Bind(\":key\", \"i\").SetInset";
_dvd._bind /*b4j.example.vmdivider*/ (":key","i")._setinset /*b4j.example.vmdivider*/ ();
 //BA.debugLineNum = 437;BA.debugLine="dvd.Pop(tmp.Template)";
_dvd._pop /*String*/ (_tmp._template /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 439;BA.debugLine="Dim sh As VMSubHeader";
_sh = new b4j.example.vmsubheader();
 //BA.debugLineNum = 440;BA.debugLine="sh.Initialize(vue)";
_sh._initialize /*b4j.example.vmsubheader*/ (ba,_vue);
 //BA.debugLineNum = 441;BA.debugLine="sh.SetVElseIf(\"item.header\")";
_sh._setvelseif /*b4j.example.vmsubheader*/ ("item.header");
 //BA.debugLineNum = 442;BA.debugLine="sh.Bind(\":key\", \"item.header\")";
_sh._bind /*b4j.example.vmsubheader*/ (":key","item.header");
 //BA.debugLineNum = 443;BA.debugLine="sh.SetVText(\"item.header\")";
_sh._setvtext /*b4j.example.vmsubheader*/ ("item.header");
 //BA.debugLineNum = 444;BA.debugLine="sh.SetInset(True)";
_sh._setinset /*b4j.example.vmsubheader*/ ((Object)(__c.True));
 //BA.debugLineNum = 445;BA.debugLine="sh.Pop(tmp.Template)";
_sh._pop /*String*/ (_tmp._template /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 446;BA.debugLine="tmp.Pop(List)";
_tmp._pop /*String*/ (_list);
 //BA.debugLineNum = 447;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setdense(boolean _vardense) throws Exception{
String _pp = "";
 //BA.debugLineNum = 965;BA.debugLine="Sub SetDense(varDense As Boolean) As VMList";
 //BA.debugLineNum = 966;BA.debugLine="If varDense = False Then Return Me";
if (_vardense==__c.False) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 967;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 968;BA.debugLine="SetAttrSingle(\"dense\", varDense)";
_setattrsingle("dense",BA.ObjectToString(_vardense));
 //BA.debugLineNum = 969;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 971;BA.debugLine="Dim pp As String = $\"${ID}Dense\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dense");
 //BA.debugLineNum = 972;BA.debugLine="vue.SetStateSingle(pp, varDense)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardense));
 //BA.debugLineNum = 973;BA.debugLine="List.Bind(\":dense\", pp)";
_list._bind /*b4j.example.vmelement*/ (":dense",_pp);
 //BA.debugLineNum = 974;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 975;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 1256;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMList";
 //BA.debugLineNum = 1257;BA.debugLine="List.SetDesignMode(b)";
_list._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 1258;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 1259;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 59;BA.debugLine="List.SetDeviceOffsets(OS, OM, OL, OX)";
_list._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 71;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 72;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 65;BA.debugLine="List.SetDeviceSizes(SS, SM, SL, SX)";
_list._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 978;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMList";
 //BA.debugLineNum = 979;BA.debugLine="List.SetDisabled(varDisabled)";
_list._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 980;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 981;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setelevation(String _varelevation) throws Exception{
String _pp = "";
 //BA.debugLineNum = 984;BA.debugLine="Sub SetElevation(varElevation As String) As VMList";
 //BA.debugLineNum = 985;BA.debugLine="If varElevation = \"\" Then Return Me";
if ((_varelevation).equals("")) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 986;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 987;BA.debugLine="SetAttrSingle(\"elevation\", varElevation)";
_setattrsingle("elevation",_varelevation);
 //BA.debugLineNum = 988;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 990;BA.debugLine="Dim pp As String = $\"${ID}Elevation\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Elevation");
 //BA.debugLineNum = 991;BA.debugLine="vue.SetStateSingle(pp, varElevation)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varelevation));
 //BA.debugLineNum = 992;BA.debugLine="List.Bind(\":elevation\", pp)";
_list._bind /*b4j.example.vmelement*/ (":elevation",_pp);
 //BA.debugLineNum = 993;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 994;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setexpand(boolean _varexpand) throws Exception{
String _pp = "";
 //BA.debugLineNum = 997;BA.debugLine="Sub SetExpand(varExpand As Boolean) As VMList";
 //BA.debugLineNum = 998;BA.debugLine="If varExpand = False Then Return Me";
if (_varexpand==__c.False) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 999;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1000;BA.debugLine="SetAttrSingle(\"expand\", varExpand)";
_setattrsingle("expand",BA.ObjectToString(_varexpand));
 //BA.debugLineNum = 1001;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 1003;BA.debugLine="Dim pp As String = $\"${ID}Expand\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Expand");
 //BA.debugLineNum = 1004;BA.debugLine="vue.SetStateSingle(pp, varExpand)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexpand));
 //BA.debugLineNum = 1005;BA.debugLine="List.Bind(\":expand\", pp)";
_list._bind /*b4j.example.vmelement*/ (":expand",_pp);
 //BA.debugLineNum = 1006;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1007;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setflat(boolean _varflat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1010;BA.debugLine="Sub SetFlat(varFlat As Boolean) As VMList";
 //BA.debugLineNum = 1011;BA.debugLine="If varFlat = False Then Return Me";
if (_varflat==__c.False) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 1012;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1013;BA.debugLine="SetAttrSingle(\"flat\", varFlat)";
_setattrsingle("flat",BA.ObjectToString(_varflat));
 //BA.debugLineNum = 1014;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 1016;BA.debugLine="Dim pp As String = $\"${ID}Flat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Flat");
 //BA.debugLineNum = 1017;BA.debugLine="vue.SetStateSingle(pp, varFlat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varflat));
 //BA.debugLineNum = 1018;BA.debugLine="List.Bind(\":flat\", pp)";
_list._bind /*b4j.example.vmelement*/ (":flat",_pp);
 //BA.debugLineNum = 1019;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1020;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1023;BA.debugLine="Sub SetHeight(varHeight As String) As VMList";
 //BA.debugLineNum = 1024;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 1025;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1026;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 1027;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 1029;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 1030;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 1031;BA.debugLine="List.Bind(\":height\", pp)";
_list._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 1032;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1033;BA.debugLine="End Sub";
return null;
}
public String  _setitemvisibility(anywheresoftware.b4a.objects.collections.Map _itms) throws Exception{
String _listkey = "";
anywheresoftware.b4a.objects.collections.List _xitems = null;
int _titems = 0;
int _citems = 0;
anywheresoftware.b4a.objects.collections.Map _itemm = null;
String _ikey = "";
boolean _visibility = false;
 //BA.debugLineNum = 781;BA.debugLine="Sub SetItemVisibility(itms As Map)";
 //BA.debugLineNum = 782;BA.debugLine="Dim listKey As String = $\"${ID}ds\"$";
_listkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"ds");
 //BA.debugLineNum = 783;BA.debugLine="Dim xitems As List = vue.GetData(listKey)";
_xitems = new anywheresoftware.b4a.objects.collections.List();
_xitems = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_vue._getdata /*Object*/ (_listkey)));
 //BA.debugLineNum = 784;BA.debugLine="Dim tItems As Int = xitems.Size - 1";
_titems = (int) (_xitems.getSize()-1);
 //BA.debugLineNum = 785;BA.debugLine="Dim cItems As Int";
_citems = 0;
 //BA.debugLineNum = 786;BA.debugLine="For cItems = 0 To tItems";
{
final int step5 = 1;
final int limit5 = _titems;
_citems = (int) (0) ;
for (;_citems <= limit5 ;_citems = _citems + step5 ) {
 //BA.debugLineNum = 787;BA.debugLine="Dim itemm As Map = xitems.Get(cItems)";
_itemm = new anywheresoftware.b4a.objects.collections.Map();
_itemm = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_xitems.Get(_citems)));
 //BA.debugLineNum = 788;BA.debugLine="Dim ikey As String = itemm.Get(\"id\")";
_ikey = BA.ObjectToString(_itemm.Get((Object)("id")));
 //BA.debugLineNum = 789;BA.debugLine="If itms.ContainsKey(ikey) Then";
if (_itms.ContainsKey((Object)(_ikey))) { 
 //BA.debugLineNum = 790;BA.debugLine="Dim visibility As Boolean = itms.Get(ikey)";
_visibility = BA.ObjectToBoolean(_itms.Get((Object)(_ikey)));
 //BA.debugLineNum = 791;BA.debugLine="itemm.Put(\"visibility\", visibility)";
_itemm.Put((Object)("visibility"),(Object)(_visibility));
 //BA.debugLineNum = 792;BA.debugLine="xitems.Set(cItems, itemm)";
_xitems.Set(_citems,(Object)(_itemm.getObject()));
 };
 }
};
 //BA.debugLineNum = 795;BA.debugLine="vue.SetData(listKey, xitems)";
_vue._setdata /*b4j.example.bananovue*/ (_listkey,(Object)(_xitems.getObject()));
 //BA.debugLineNum = 796;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlist  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1036;BA.debugLine="Sub SetLight(varLight As Boolean) As VMList";
 //BA.debugLineNum = 1037;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 1038;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1039;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 1040;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 1042;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 1043;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 1044;BA.debugLine="List.Bind(\":light\", pp)";
_list._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 1045;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1046;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 1251;BA.debugLine="Sub SetMarginAll(p As String) As VMList";
 //BA.debugLineNum = 1252;BA.debugLine="List.setmarginall(p)";
_list._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 1253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1254;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setmaxheight(String _varmaxheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1049;BA.debugLine="Sub SetMaxHeight(varMaxHeight As String) As VMList";
 //BA.debugLineNum = 1050;BA.debugLine="If varMaxHeight = \"\" Then Return Me";
if ((_varmaxheight).equals("")) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 1051;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1052;BA.debugLine="SetAttrSingle(\"max-height\", varMaxHeight)";
_setattrsingle("max-height",_varmaxheight);
 //BA.debugLineNum = 1053;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 1055;BA.debugLine="Dim pp As String = $\"${ID}MaxHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxHeight");
 //BA.debugLineNum = 1056;BA.debugLine="vue.SetStateSingle(pp, varMaxHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxheight));
 //BA.debugLineNum = 1057;BA.debugLine="List.Bind(\":max-height\", pp)";
_list._bind /*b4j.example.vmelement*/ (":max-height",_pp);
 //BA.debugLineNum = 1058;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1059;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setmaxwidth(String _varmaxwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1062;BA.debugLine="Sub SetMaxWidth(varMaxWidth As String) As VMList";
 //BA.debugLineNum = 1063;BA.debugLine="If varMaxWidth = \"\" Then Return Me";
if ((_varmaxwidth).equals("")) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 1064;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1065;BA.debugLine="SetAttrSingle(\"max-width\", varMaxWidth)";
_setattrsingle("max-width",_varmaxwidth);
 //BA.debugLineNum = 1066;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 1068;BA.debugLine="Dim pp As String = $\"${ID}MaxWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxWidth");
 //BA.debugLineNum = 1069;BA.debugLine="vue.SetStateSingle(pp, varMaxWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxwidth));
 //BA.debugLineNum = 1070;BA.debugLine="List.Bind(\":max-width\", pp)";
_list._bind /*b4j.example.vmelement*/ (":max-width",_pp);
 //BA.debugLineNum = 1071;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1072;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setminheight(String _varminheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1075;BA.debugLine="Sub SetMinHeight(varMinHeight As String) As VMList";
 //BA.debugLineNum = 1076;BA.debugLine="If varMinHeight = \"\" Then Return Me";
if ((_varminheight).equals("")) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 1077;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1078;BA.debugLine="SetAttrSingle(\"min-height\", varMinHeight)";
_setattrsingle("min-height",_varminheight);
 //BA.debugLineNum = 1079;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 1081;BA.debugLine="Dim pp As String = $\"${ID}MinHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinHeight");
 //BA.debugLineNum = 1082;BA.debugLine="vue.SetStateSingle(pp, varMinHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminheight));
 //BA.debugLineNum = 1083;BA.debugLine="List.Bind(\":min-height\", pp)";
_list._bind /*b4j.example.vmelement*/ (":min-height",_pp);
 //BA.debugLineNum = 1084;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1085;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setminwidth(String _varminwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1088;BA.debugLine="Sub SetMinWidth(varMinWidth As String) As VMList";
 //BA.debugLineNum = 1089;BA.debugLine="If varMinWidth = \"\" Then Return Me";
if ((_varminwidth).equals("")) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 1090;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1091;BA.debugLine="SetAttrSingle(\"min-width\", varMinWidth)";
_setattrsingle("min-width",_varminwidth);
 //BA.debugLineNum = 1092;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 1094;BA.debugLine="Dim pp As String = $\"${ID}MinWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinWidth");
 //BA.debugLineNum = 1095;BA.debugLine="vue.SetStateSingle(pp, varMinWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminwidth));
 //BA.debugLineNum = 1096;BA.debugLine="List.Bind(\":min-width\", pp)";
_list._bind /*b4j.example.vmelement*/ (":min-width",_pp);
 //BA.debugLineNum = 1097;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1098;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 1268;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 1269;BA.debugLine="List.SetName(varName, bbind)";
_list._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 1270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setnav(boolean _varnav) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1101;BA.debugLine="Sub SetNav(varNav As Boolean) As VMList";
 //BA.debugLineNum = 1102;BA.debugLine="If varNav = False Then Return Me";
if (_varnav==__c.False) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 1103;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1104;BA.debugLine="SetAttrSingle(\"nav\", varNav)";
_setattrsingle("nav",BA.ObjectToString(_varnav));
 //BA.debugLineNum = 1105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 1107;BA.debugLine="Dim pp As String = $\"${ID}Nav\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Nav");
 //BA.debugLineNum = 1108;BA.debugLine="vue.SetStateSingle(pp, varNav)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnav));
 //BA.debugLineNum = 1109;BA.debugLine="List.Bind(\":nav\", pp)";
_list._bind /*b4j.example.vmelement*/ (":nav",_pp);
 //BA.debugLineNum = 1110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 1246;BA.debugLine="Sub SetPaddingAll(p As String) As VMList";
 //BA.debugLineNum = 1247;BA.debugLine="List.SetPaddingAll(p)";
_list._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 1248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMLis";
 //BA.debugLineNum = 53;BA.debugLine="List.SetRC(sRow, sCol)";
_list._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setrounded(boolean _varrounded) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1114;BA.debugLine="Sub SetRounded(varRounded As Boolean) As VMList";
 //BA.debugLineNum = 1115;BA.debugLine="If varRounded = False Then Return Me";
if (_varrounded==__c.False) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 1116;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1117;BA.debugLine="SetAttrSingle(\"rounded\", varRounded)";
_setattrsingle("rounded",BA.ObjectToString(_varrounded));
 //BA.debugLineNum = 1118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 1120;BA.debugLine="Dim pp As String = $\"${ID}Rounded\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Rounded");
 //BA.debugLineNum = 1121;BA.debugLine="vue.SetStateSingle(pp, varRounded)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varrounded));
 //BA.debugLineNum = 1122;BA.debugLine="List.Bind(\":rounded\", pp)";
_list._bind /*b4j.example.vmelement*/ (":rounded",_pp);
 //BA.debugLineNum = 1123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setshaped(boolean _varshaped) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1127;BA.debugLine="Sub SetShaped(varShaped As Boolean) As VMList";
 //BA.debugLineNum = 1128;BA.debugLine="If varShaped = False Then Return Me";
if (_varshaped==__c.False) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 1129;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1130;BA.debugLine="SetAttrSingle(\"shaped\", varShaped)";
_setattrsingle("shaped",BA.ObjectToString(_varshaped));
 //BA.debugLineNum = 1131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 1133;BA.debugLine="Dim pp As String = $\"${ID}Shaped\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Shaped");
 //BA.debugLineNum = 1134;BA.debugLine="vue.SetStateSingle(pp, varShaped)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshaped));
 //BA.debugLineNum = 1135;BA.debugLine="List.Bind(\":shaped\", pp)";
_list._bind /*b4j.example.vmelement*/ (":shaped",_pp);
 //BA.debugLineNum = 1136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetStatic(b As Boolean) As VMList";
 //BA.debugLineNum = 46;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 47;BA.debugLine="List.SetStatic(b)";
_list._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 926;BA.debugLine="Sub SetStyle(sm As Map) As VMList";
 //BA.debugLineNum = 927;BA.debugLine="List.SetStyle(sm)";
_list._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 928;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 929;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1274;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 1275;BA.debugLine="List.SetStyleSingle(prop, value)";
_list._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 1276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setsubheader(boolean _varsubheader) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1140;BA.debugLine="Sub SetSubheader(varSubheader As Boolean) As VMLis";
 //BA.debugLineNum = 1141;BA.debugLine="If varSubheader = False Then Return Me";
if (_varsubheader==__c.False) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 1142;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1143;BA.debugLine="SetAttrSingle(\"subheader\", varSubheader)";
_setattrsingle("subheader",BA.ObjectToString(_varsubheader));
 //BA.debugLineNum = 1144;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 1146;BA.debugLine="Dim pp As String = $\"${ID}Subheader\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Subheader");
 //BA.debugLineNum = 1147;BA.debugLine="vue.SetStateSingle(pp, varSubheader)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsubheader));
 //BA.debugLineNum = 1148;BA.debugLine="List.Bind(\":subheader\", pp)";
_list._bind /*b4j.example.vmelement*/ (":subheader",_pp);
 //BA.debugLineNum = 1149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1150;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 1262;BA.debugLine="Sub SetTabIndex(ti As String) As VMList";
 //BA.debugLineNum = 1263;BA.debugLine="List.SetTabIndex(ti)";
_list._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 1264;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1265;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _settag(String _vartag) throws Exception{
 //BA.debugLineNum = 1153;BA.debugLine="Sub SetTag(varTag As String) As VMList";
 //BA.debugLineNum = 1154;BA.debugLine="If varTag = \"\" Then Return Me";
if ((_vartag).equals("")) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 1155;BA.debugLine="SetAttrSingle(\"tag\", varTag)";
_setattrsingle("tag",_vartag);
 //BA.debugLineNum = 1156;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1157;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _settext(String _t) throws Exception{
 //BA.debugLineNum = 902;BA.debugLine="Sub SetText(t As String) As VMList";
 //BA.debugLineNum = 903;BA.debugLine="List.SetText(t)";
_list._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 904;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 905;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 906;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setthreeline(boolean _varthreeline) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1160;BA.debugLine="Sub SetThreeLine(varThreeLine As Boolean) As VMLis";
 //BA.debugLineNum = 1161;BA.debugLine="If varThreeLine = False Then Return Me";
if (_varthreeline==__c.False) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 1162;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1163;BA.debugLine="SetAttrSingle(\"three-line\", varThreeLine)";
_setattrsingle("three-line",BA.ObjectToString(_varthreeline));
 //BA.debugLineNum = 1164;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 1166;BA.debugLine="Dim pp As String = $\"${ID}ThreeLine\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ThreeLine");
 //BA.debugLineNum = 1167;BA.debugLine="vue.SetStateSingle(pp, varThreeLine)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varthreeline));
 //BA.debugLineNum = 1168;BA.debugLine="List.Bind(\":three-line\", pp)";
_list._bind /*b4j.example.vmelement*/ (":three-line",_pp);
 //BA.debugLineNum = 1169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1170;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _settile(boolean _vartile) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1173;BA.debugLine="Sub SetTile(varTile As Boolean) As VMList";
 //BA.debugLineNum = 1174;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1175;BA.debugLine="SetAttrSingle(\"tile\", varTile)";
_setattrsingle("tile",BA.ObjectToString(_vartile));
 //BA.debugLineNum = 1176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 1178;BA.debugLine="Dim pp As String = $\"${ID}Tile\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tile");
 //BA.debugLineNum = 1179;BA.debugLine="vue.SetStateSingle(pp, varTile)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartile));
 //BA.debugLineNum = 1180;BA.debugLine="List.Bind(\":tile\", pp)";
_list._bind /*b4j.example.vmelement*/ (":tile",_pp);
 //BA.debugLineNum = 1181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _settwoline(boolean _vartwoline) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1185;BA.debugLine="Sub SetTwoLine(varTwoLine As Boolean) As VMList";
 //BA.debugLineNum = 1186;BA.debugLine="If varTwoLine = False Then Return Me";
if (_vartwoline==__c.False) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 1187;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1188;BA.debugLine="SetAttrSingle(\"two-line\", varTwoLine)";
_setattrsingle("two-line",BA.ObjectToString(_vartwoline));
 //BA.debugLineNum = 1189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 1191;BA.debugLine="Dim pp As String = $\"${ID}TwoLine\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"TwoLine");
 //BA.debugLineNum = 1192;BA.debugLine="vue.SetStateSingle(pp, varTwoLine)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartwoline));
 //BA.debugLineNum = 1193;BA.debugLine="List.Bind(\":two-line\", pp)";
_list._bind /*b4j.example.vmelement*/ (":two-line",_pp);
 //BA.debugLineNum = 1194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 878;BA.debugLine="Sub SetVIf(vif As String) As VMList";
 //BA.debugLineNum = 879;BA.debugLine="List.SetVIf(vif)";
_list._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 880;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 881;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 1294;BA.debugLine="Sub SetVisible(b As Boolean) As VMList";
 //BA.debugLineNum = 1295;BA.debugLine="List.SetVisible(b)";
_list._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 1296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1297;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 873;BA.debugLine="Sub SetVModel(k As String) As VMList";
 //BA.debugLineNum = 874;BA.debugLine="List.SetVModel(k)";
_list._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 875;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 876;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setvonce(boolean _t) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetVOnce(t As Boolean) As VMList";
 //BA.debugLineNum = 41;BA.debugLine="List.setvonce(t)";
_list._setvonce /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 883;BA.debugLine="Sub SetVShow(vif As String) As VMList";
 //BA.debugLineNum = 884;BA.debugLine="List.SetVShow(vif)";
_list._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 885;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 886;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setwidth(String _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1198;BA.debugLine="Sub SetWidth(varWidth As String) As VMList";
 //BA.debugLineNum = 1199;BA.debugLine="If varWidth = \"\" Then Return Me";
if ((_varwidth).equals("")) { 
if (true) return (b4j.example.vmlist)(this);};
 //BA.debugLineNum = 1200;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1201;BA.debugLine="SetAttrSingle(\"width\", varWidth)";
_setattrsingle("width",_varwidth);
 //BA.debugLineNum = 1202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 };
 //BA.debugLineNum = 1204;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 1205;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varwidth));
 //BA.debugLineNum = 1206;BA.debugLine="List.Bind(\":width\", pp)";
_list._bind /*b4j.example.vmelement*/ (":width",_pp);
 //BA.debugLineNum = 1207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1208;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _show() throws Exception{
 //BA.debugLineNum = 1216;BA.debugLine="Sub Show As VMList";
 //BA.debugLineNum = 1217;BA.debugLine="List.SetVisible(True)";
_list._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 1219;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _listkey = "";
anywheresoftware.b4a.objects.collections.List _xitems = null;
String _k = "";
anywheresoftware.b4a.objects.collections.Map _v = null;
String _scode = "";
String _methodname = "";
Object _value = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 799;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 800;BA.debugLine="If items.Size > 0 Then";
if (_items.getSize()>0) { 
 //BA.debugLineNum = 801;BA.debugLine="Dim listKey As String = $\"${ID}ds\"$";
_listkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"ds");
 //BA.debugLineNum = 803;BA.debugLine="Dim xitems As List";
_xitems = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 804;BA.debugLine="xitems.Initialize";
_xitems.Initialize();
 //BA.debugLineNum = 805;BA.debugLine="For Each k As String In items.Keys";
{
final anywheresoftware.b4a.BA.IterableList group5 = _items.Keys();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_k = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 806;BA.debugLine="Dim v As Map = items.Get(k)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_items.Get((Object)(_k))));
 //BA.debugLineNum = 807;BA.debugLine="xitems.Add(v)";
_xitems.Add((Object)(_v.getObject()));
 }
};
 //BA.debugLineNum = 809;BA.debugLine="vue.SetStateSingle(listKey, xitems)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_listkey,(Object)(_xitems.getObject()));
 //BA.debugLineNum = 810;BA.debugLine="SetDataSourceTemplate1(listKey, \"id\", \"avatar\",";
_setdatasourcetemplate1(_listkey,"id","avatar","icon","iconcolor","title","subtitle","subtitle1","action","actioniconcolor");
 };
 //BA.debugLineNum = 813;BA.debugLine="If parentchild.Size > 0 Then";
if (_parentchild.getSize()>0) { 
 //BA.debugLineNum = 814;BA.debugLine="Dim sCode As String = $\"<v-list-group         v-";
_scode = ("<v-list-group\n"+"        v-for=\"item in "+__c.SmartStringFormatter("",(Object)(_id))+"ds\"\n"+"        :key=\"item.id\"\n"+"        v-model=\"item.active\"\n"+"        :prepend-icon=\"item.icon\"\n"+"        no-action\n"+"      >\n"+"        <template v-slot:activator>\n"+"          <v-list-item-content>\n"+"            <v-list-item-title v-text=\"item.title\"></v-list-item-title>\n"+"          </v-list-item-content>\n"+"        </template>\n"+"\n"+"        <v-list-item\n"+"          v-for=\"subitem in item.items\"\n"+"          :key=\"subitem.id\"\n"+"          @click=\""+__c.SmartStringFormatter("",(Object)(_id))+"_click(subitem.id)\"\n"+"        >\n"+"          <v-list-item-content>\n"+"            <v-list-item-title v-text=\"subitem.title\"></v-list-item-title>\n"+"          </v-list-item-content>\n"+"        </v-list-item>\n"+"      </v-list-group>");
 //BA.debugLineNum = 838;BA.debugLine="List.SetText(sCode)";
_list._settext /*b4j.example.vmelement*/ (_scode);
 //BA.debugLineNum = 840;BA.debugLine="Dim methodname As String = $\"${ID}_click\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_click");
 //BA.debugLineNum = 841;BA.debugLine="If SubExists(Module, methodname) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 842;BA.debugLine="Dim value As Object";
_value = new Object();
 //BA.debugLineNum = 843;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_value}))));
 //BA.debugLineNum = 844;BA.debugLine="vue.SetCallBack(methodname, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 };
 };
 //BA.debugLineNum = 847;BA.debugLine="Return List.ToString";
if (true) return _list._tostring /*String*/ ();
 //BA.debugLineNum = 848;BA.debugLine="End Sub";
return "";
}
public String  _update() throws Exception{
String _listkey = "";
 //BA.debugLineNum = 868;BA.debugLine="Sub Update";
 //BA.debugLineNum = 869;BA.debugLine="Dim listKey As String = $\"${ID}ds\"$";
_listkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"ds");
 //BA.debugLineNum = 870;BA.debugLine="vue.SetStateSingle(listKey, items)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_listkey,(Object)(_items.getObject()));
 //BA.debugLineNum = 871;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlist  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 625;BA.debugLine="Sub UseTheme(themeName As String) As VMList";
 //BA.debugLineNum = 626;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 627;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 628;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 629;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 630;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 632;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 633;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 634;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
