package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcard extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmcard", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcard.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _card = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public b4j.example.vmcardtitle _title = null;
public b4j.example.vmcardsubtitle _subtitle = null;
public b4j.example.vmcardtext _text = null;
public b4j.example.vmcardactions _actions = null;
public boolean _isdialog = false;
public b4j.example.vmimage _image = null;
public b4j.example.vmtoolbar _toolbar = null;
public b4j.example.vmform _form = null;
public anywheresoftware.b4a.objects.collections.List _textafter = null;
public anywheresoftware.b4a.objects.collections.List _extra = null;
public boolean _istable = false;
public boolean _bstatic = false;
public String _titlekey = "";
public String _subtitlekey = "";
public b4j.example.vmcontainer _container = null;
public b4j.example.vmsheet _topsheet = null;
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
public b4j.example.vmcard  _addbutton(b4j.example.vmbutton _btn) throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Sub AddButton(btn As VMButton) As VMCard";
 //BA.debugLineNum = 294;BA.debugLine="Actions.SetText(btn.ToString)";
_actions._settext /*b4j.example.vmcardactions*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _addcancel(String _cancelid,String _cancelcaption) throws Exception{
b4j.example.vmbutton _btncancel = null;
 //BA.debugLineNum = 305;BA.debugLine="private Sub AddCANCEL(cancelID As String, cancelCa";
 //BA.debugLineNum = 306;BA.debugLine="Dim btnCancel As VMButton";
_btncancel = new b4j.example.vmbutton();
 //BA.debugLineNum = 307;BA.debugLine="btnCancel.Initialize(vue, cancelID, Module).SetSt";
_btncancel._initialize /*b4j.example.vmbutton*/ (ba,_vue,_cancelid,_module)._setstatic /*b4j.example.vmbutton*/ (_bstatic)._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 308;BA.debugLine="btnCancel.SetLabel(cancelCaption)";
_btncancel._setlabel /*b4j.example.vmbutton*/ (_cancelcaption);
 //BA.debugLineNum = 309;BA.debugLine="btnCancel.SetAccent(True)";
_btncancel._setaccent /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 310;BA.debugLine="btnCancel.SetTransparent(True)";
_btncancel._settransparent /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 311;BA.debugLine="Actions.SetText(btnCancel.ToString)";
_actions._settext /*b4j.example.vmcardactions*/ (_btncancel._tostring /*String*/ ());
 //BA.debugLineNum = 312;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _addcardtext(b4j.example.vmcardtext _ct) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub AddCardText(ct As VMCardText) As VMCard";
 //BA.debugLineNum = 182;BA.debugLine="AddStuff(ct.ToString)";
_addstuff(_ct._tostring /*String*/ ());
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 336;BA.debugLine="Sub AddChild(child As VMElement) As VMCard";
 //BA.debugLineNum = 337;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 338;BA.debugLine="Card.SetText(childHTML)";
_card._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 372;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 373;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 374;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcard  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub AddClass(c As String) As VMCard";
 //BA.debugLineNum = 355;BA.debugLine="Card.AddClass(c)";
_card._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub AddComponent(comp As String) As VMCard";
 //BA.debugLineNum = 188;BA.debugLine="Card.SetText(comp)";
_card._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _adddivider() throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub AddDivider As VMCard";
 //BA.debugLineNum = 215;BA.debugLine="IsDialog = True";
_isdialog = __c.True;
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _addelement(String _elid,String _eltag,String _eltext,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses) throws Exception{
b4j.example.vmelement _d = null;
 //BA.debugLineNum = 172;BA.debugLine="Sub AddElement(elID As String, elTag As String, el";
 //BA.debugLineNum = 173;BA.debugLine="Dim d As VMElement";
_d = new b4j.example.vmelement();
 //BA.debugLineNum = 174;BA.debugLine="d.Initialize(vue,elID).SetDesignMode(DesignMode).";
_d._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid)._setdesignmode /*b4j.example.vmelement*/ (_designmode)._settag /*b4j.example.vmelement*/ (_eltag);
 //BA.debugLineNum = 175;BA.debugLine="d.SetText(elText)";
_d._settext /*b4j.example.vmelement*/ (_eltext);
 //BA.debugLineNum = 176;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, Null)";
_d._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 177;BA.debugLine="AddStuff(d.ToString)";
_addstuff(_d._tostring /*String*/ ());
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _addextracontent(String _scontent) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub AddExtraContent(scontent As String) As VMCard";
 //BA.debugLineNum = 168;BA.debugLine="extra.Add(scontent)";
_extra.Add((Object)(_scontent));
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _addmenu(b4j.example.vmmenu _menu) throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub AddMenu(menu As VMMenu) As VMCard";
 //BA.debugLineNum = 300;BA.debugLine="Actions.SetText(menu.ToString)";
_actions._settext /*b4j.example.vmcardactions*/ (_menu._tostring /*String*/ ());
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _addok(String _okid,String _okcaption) throws Exception{
b4j.example.vmbutton _btnok = null;
 //BA.debugLineNum = 276;BA.debugLine="private Sub AddOK(okID As String, okCaption As Str";
 //BA.debugLineNum = 277;BA.debugLine="Dim btnOK As VMButton";
_btnok = new b4j.example.vmbutton();
 //BA.debugLineNum = 278;BA.debugLine="btnOK.Initialize(vue, okID, Module)";
_btnok._initialize /*b4j.example.vmbutton*/ (ba,_vue,_okid,_module);
 //BA.debugLineNum = 279;BA.debugLine="btnOK.SetStatic(bStatic)";
_btnok._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 280;BA.debugLine="btnOK.SetDesignMode(DesignMode)";
_btnok._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 281;BA.debugLine="btnOK.SetPrimary(True)";
_btnok._setprimary /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 282;BA.debugLine="btnOK.SetLabel(okCaption)";
_btnok._setlabel /*b4j.example.vmbutton*/ (_okcaption);
 //BA.debugLineNum = 283;BA.debugLine="btnOK.SetTransparent(True)";
_btnok._settransparent /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 284;BA.debugLine="Actions.SetText(btnOK.ToString)";
_actions._settext /*b4j.example.vmcardactions*/ (_btnok._tostring /*String*/ ());
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _addstuff(String _stuff) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub AddStuff(stuff As String) As VMCard";
 //BA.debugLineNum = 194;BA.debugLine="TextAfter.Add(stuff)";
_textafter.Add((Object)(_stuff));
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _addtextafter(String _stuff) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub AddTextAfter(stuff As String) As VMCard";
 //BA.debugLineNum = 204;BA.debugLine="TextAfter.Add(stuff)";
_textafter.Add((Object)(_stuff));
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _addtextafterdivider(String _classname) throws Exception{
b4j.example.vmdivider _div = null;
 //BA.debugLineNum = 219;BA.debugLine="Sub AddTextAfterDivider(className As String) As VM";
 //BA.debugLineNum = 220;BA.debugLine="Dim div As VMDivider";
_div = new b4j.example.vmdivider();
 //BA.debugLineNum = 221;BA.debugLine="div.Initialize(vue).AddClass(className)";
_div._initialize /*b4j.example.vmdivider*/ (ba,_vue)._addclass /*b4j.example.vmdivider*/ (_classname);
 //BA.debugLineNum = 222;BA.debugLine="SetTextAfter(div.ToString)";
_settextafter(_div._tostring /*String*/ ());
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 880;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 881;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 882;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcard  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 821;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 822;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 823;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 824;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 825;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 884;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 885;BA.debugLine="Card.BuildModel(mprops, mstyles, lclasses, loose)";
_card._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 886;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 887;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Card As VMElement";
_card = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Public Title As VMCardTitle";
_title = new b4j.example.vmcardtitle();
 //BA.debugLineNum = 10;BA.debugLine="Public SubTitle As VMCardSubTitle";
_subtitle = new b4j.example.vmcardsubtitle();
 //BA.debugLineNum = 11;BA.debugLine="Public Text As VMCardText";
_text = new b4j.example.vmcardtext();
 //BA.debugLineNum = 12;BA.debugLine="Public Actions As VMCardActions";
_actions = new b4j.example.vmcardactions();
 //BA.debugLineNum = 13;BA.debugLine="Public IsDialog As Boolean";
_isdialog = false;
 //BA.debugLineNum = 14;BA.debugLine="Public Image As VMImage";
_image = new b4j.example.vmimage();
 //BA.debugLineNum = 15;BA.debugLine="Public ToolBar As VMToolBar";
_toolbar = new b4j.example.vmtoolbar();
 //BA.debugLineNum = 16;BA.debugLine="Public Form As VMForm";
_form = new b4j.example.vmform();
 //BA.debugLineNum = 17;BA.debugLine="Public TextAfter As List";
_textafter = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 18;BA.debugLine="Private extra As List";
_extra = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 19;BA.debugLine="Public IsTable As Boolean";
_istable = false;
 //BA.debugLineNum = 20;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 21;BA.debugLine="Private titleKey As String";
_titlekey = "";
 //BA.debugLineNum = 22;BA.debugLine="Private subTitleKey As String";
_subtitlekey = "";
 //BA.debugLineNum = 23;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
 //BA.debugLineNum = 24;BA.debugLine="Public TopSheet As VMSheet";
_topsheet = new b4j.example.vmsheet();
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcard  _disable() throws Exception{
 //BA.debugLineNum = 814;BA.debugLine="Sub Disable As VMCard";
 //BA.debugLineNum = 815;BA.debugLine="Card.Disable(True)";
_card._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 816;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 817;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _enable() throws Exception{
 //BA.debugLineNum = 809;BA.debugLine="Sub Enable As VMCard";
 //BA.debugLineNum = 810;BA.debugLine="Card.Enable(True)";
_card._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 811;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 812;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _hide() throws Exception{
 //BA.debugLineNum = 799;BA.debugLine="Sub Hide As VMCard";
 //BA.debugLineNum = 800;BA.debugLine="Card.SetVisible(False)";
_card._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 801;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 802;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 29;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 30;BA.debugLine="Card.Initialize(v, ID)";
_card._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 31;BA.debugLine="Card.SetTag(\"v-card\")";
_card._settag /*b4j.example.vmelement*/ ("v-card");
 //BA.debugLineNum = 32;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 33;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 34;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 36;BA.debugLine="IsDialog = False";
_isdialog = __c.False;
 //BA.debugLineNum = 37;BA.debugLine="Title.Initialize(vue, $\"${ID}title\"$, Module)";
_title._initialize /*b4j.example.vmcardtitle*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"title"),_module);
 //BA.debugLineNum = 38;BA.debugLine="SubTitle.Initialize(vue, $\"${ID}subtitle\"$, Modul";
_subtitle._initialize /*b4j.example.vmcardsubtitle*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"subtitle"),_module);
 //BA.debugLineNum = 39;BA.debugLine="Text.Initialize(vue, $\"${ID}text\"$, Module)";
_text._initialize /*b4j.example.vmcardtext*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"text"),_module);
 //BA.debugLineNum = 40;BA.debugLine="Actions.Initialize(vue, $\"${ID}actions\"$, Module)";
_actions._initialize /*b4j.example.vmcardactions*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"actions"),_module);
 //BA.debugLineNum = 41;BA.debugLine="Form.Initialize(vue, $\"${ID}form\"$, Module)";
_form._initialize /*b4j.example.vmform*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"form"),_module);
 //BA.debugLineNum = 42;BA.debugLine="ToolBar.Initialize(vue, $\"${ID}bar\"$, Module).Set";
_toolbar._initialize /*b4j.example.vmtoolbar*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"bar"),_module)._settoolbar /*b4j.example.vmtoolbar*/ (__c.True);
 //BA.debugLineNum = 43;BA.debugLine="Image.Initialize(vue, $\"${ID}img\"$, Module)";
_image._initialize /*b4j.example.vmimage*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"img"),_module);
 //BA.debugLineNum = 44;BA.debugLine="TopSheet.Initialize(vue, $\"${ID}ps\"$, Module).Set";
_topsheet._initialize /*b4j.example.vmsheet*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"ps"),_module)._settopoverlap /*b4j.example.vmsheet*/ ();
 //BA.debugLineNum = 45;BA.debugLine="Container = Form.Container";
_container = _form._container /*b4j.example.vmcontainer*/ ;
 //BA.debugLineNum = 46;BA.debugLine="TextAfter.Initialize";
_textafter.Initialize();
 //BA.debugLineNum = 47;BA.debugLine="extra.Initialize";
_extra.Initialize();
 //BA.debugLineNum = 48;BA.debugLine="IsTable = False";
_istable = __c.False;
 //BA.debugLineNum = 49;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 50;BA.debugLine="titleKey = $\"${ID}title\"$";
_titlekey = (""+__c.SmartStringFormatter("",(Object)(_id))+"title");
 //BA.debugLineNum = 51;BA.debugLine="subTitleKey = $\"${ID}subtitle\"$";
_subtitlekey = (""+__c.SmartStringFormatter("",(Object)(_id))+"subtitle");
 //BA.debugLineNum = 52;BA.debugLine="SetOnClick($\"${ID}_click\"$)";
_setonclick((""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 350;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcard  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 828;BA.debugLine="public Sub RemoveAttr(sName As String) As VMCard";
 //BA.debugLineNum = 829;BA.debugLine="Card.RemoveAttr(sName)";
_card._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 830;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 831;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub Render";
 //BA.debugLineNum = 332;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return "";
}
public String  _reset() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub Reset";
 //BA.debugLineNum = 61;BA.debugLine="Form.Reset";
_form._reset /*String*/ ();
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _resetvalidation() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub ResetValidation";
 //BA.debugLineNum = 65;BA.debugLine="Form.ResetValidation";
_form._resetvalidation /*String*/ ();
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcard  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 580;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 581;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 582;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 583;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 584;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 586;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 587;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 588;BA.debugLine="Card.Bind(\":active-class\", pp)";
_card._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 589;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setappend(boolean _varappend) throws Exception{
String _pp = "";
 //BA.debugLineNum = 379;BA.debugLine="Sub SetAppend(varAppend As Boolean) As VMCard";
 //BA.debugLineNum = 380;BA.debugLine="If varAppend = False Then Return Me";
if (_varappend==__c.False) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 381;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 382;BA.debugLine="SetAttrSingle(\"append\", varAppend)";
_setattrsingle("append",BA.ObjectToString(_varappend));
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 385;BA.debugLine="Dim pp As String = $\"${ID}Append\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Append");
 //BA.debugLineNum = 386;BA.debugLine="vue.SetStateSingle(pp, varAppend)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varappend));
 //BA.debugLineNum = 387;BA.debugLine="Card.Bind(\":append\", pp)";
_card._bind /*b4j.example.vmelement*/ (":append",_pp);
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 360;BA.debugLine="Sub SetAttr(attr As Map) As VMCard";
 //BA.debugLineNum = 361;BA.debugLine="Card.SetAttr(attr)";
_card._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 148;BA.debugLine="Sub SetAttributes(attrs As List) As VMCard";
 //BA.debugLineNum = 149;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 150;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetAttrLoose(loose As String) As VMCard";
 //BA.debugLineNum = 144;BA.debugLine="Card.SetAttrLoose(loose)";
_card._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 875;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 876;BA.debugLine="Card.SetAttrSingle(prop, value)";
_card._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 877;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 878;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setcancel(String _cancelid,String _cancelcaption) throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub SetCancel(cancelID As String, cancelCaption As";
 //BA.debugLineNum = 289;BA.debugLine="AddCANCEL(cancelID, cancelCaption)";
_addcancel(_cancelid,_cancelcaption);
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 593;BA.debugLine="Sub SetColor(varColor As String) As VMCard";
 //BA.debugLineNum = 594;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 595;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 596;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 597;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 599;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 600;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 601;BA.debugLine="Card.Bind(\":color\", pp)";
_card._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 602;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 603;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 895;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 896;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 897;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 898;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 899;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 900;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 902;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 903;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 904;BA.debugLine="Card.Bind(\":color\", pp)";
_card._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 905;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 906;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 392;BA.debugLine="Sub SetDark(varDark As Boolean) As VMCard";
 //BA.debugLineNum = 393;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 394;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 395;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 398;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 399;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 400;BA.debugLine="Card.Bind(\":dark\", pp)";
_card._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 401;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 209;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 844;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMCard";
 //BA.debugLineNum = 845;BA.debugLine="Card.SetDesignMode(b)";
_card._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 846;BA.debugLine="Title.SetDesignMode(b)";
_title._setdesignmode /*b4j.example.vmcardtitle*/ (_b);
 //BA.debugLineNum = 847;BA.debugLine="Text.SetDesignMode(b)";
_text._setdesignmode /*b4j.example.vmcardtext*/ (_b);
 //BA.debugLineNum = 848;BA.debugLine="Actions.SetDesignMode(b)";
_actions._setdesignmode /*b4j.example.vmcardactions*/ (_b);
 //BA.debugLineNum = 849;BA.debugLine="Form.SetDesignMode(b)";
_form._setdesignmode /*b4j.example.vmform*/ (_b);
 //BA.debugLineNum = 850;BA.debugLine="ToolBar.SetDesignMode(b)";
_toolbar._setdesignmode /*b4j.example.vmtoolbar*/ (_b);
 //BA.debugLineNum = 851;BA.debugLine="Container.SetDesignMode(b)";
_container._setdesignmode /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 852;BA.debugLine="SubTitle.SetDesignMode(b)";
_subtitle._setdesignmode /*b4j.example.vmcardsubtitle*/ (_b);
 //BA.debugLineNum = 853;BA.debugLine="Image.SetDesignMode(b)";
_image._setdesignmode /*b4j.example.vmimage*/ (_b);
 //BA.debugLineNum = 854;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 855;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 856;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 126;BA.debugLine="Card.SetDeviceOffsets(OS, OM, OL, OX)";
_card._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 138;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 139;BA.debugLine="SetDeviceSizes(small, medium , large , xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 132;BA.debugLine="Card.SetDeviceSizes(SS , SM , SL , SX )";
_card._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMCard";
 //BA.debugLineNum = 406;BA.debugLine="Card.SetDisabled(varDisabled)";
_card._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 407;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setelevation(String _varelevation) throws Exception{
 //BA.debugLineNum = 606;BA.debugLine="Sub SetElevation(varElevation As String) As VMCard";
 //BA.debugLineNum = 607;BA.debugLine="If varElevation = \"\" Then Return Me";
if ((_varelevation).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 608;BA.debugLine="AddClass($\"elevation-${varElevation}\"$)";
_addclass(("elevation-"+__c.SmartStringFormatter("",(Object)(_varelevation))+""));
 //BA.debugLineNum = 609;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 610;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setexact(boolean _varexact) throws Exception{
String _pp = "";
 //BA.debugLineNum = 411;BA.debugLine="Sub SetExact(varExact As Boolean) As VMCard";
 //BA.debugLineNum = 412;BA.debugLine="If varExact = False Then Return Me";
if (_varexact==__c.False) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 413;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 414;BA.debugLine="SetAttrSingle(\"exact\", varExact)";
_setattrsingle("exact",BA.ObjectToString(_varexact));
 //BA.debugLineNum = 415;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 417;BA.debugLine="Dim pp As String = $\"${ID}Exact\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Exact");
 //BA.debugLineNum = 418;BA.debugLine="vue.SetStateSingle(pp, varExact)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexact));
 //BA.debugLineNum = 419;BA.debugLine="Card.Bind(\":exact\", pp)";
_card._bind /*b4j.example.vmelement*/ (":exact",_pp);
 //BA.debugLineNum = 420;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 421;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setexactactiveclass(String _varexactactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 613;BA.debugLine="Sub SetExactActiveClass(varExactActiveClass As Str";
 //BA.debugLineNum = 614;BA.debugLine="If varExactActiveClass = \"\" Then Return Me";
if ((_varexactactiveclass).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 615;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 616;BA.debugLine="SetAttrSingle(\"exact-active-class\", varExactActi";
_setattrsingle("exact-active-class",_varexactactiveclass);
 //BA.debugLineNum = 617;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 619;BA.debugLine="Dim pp As String = $\"${ID}ExactActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ExactActiveClass");
 //BA.debugLineNum = 620;BA.debugLine="vue.SetStateSingle(pp, varExactActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexactactiveclass));
 //BA.debugLineNum = 621;BA.debugLine="Card.Bind(\":exact-active-class\", pp)";
_card._bind /*b4j.example.vmelement*/ (":exact-active-class",_pp);
 //BA.debugLineNum = 622;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 623;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setflat(boolean _varflat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 424;BA.debugLine="Sub SetFlat(varFlat As Boolean) As VMCard";
 //BA.debugLineNum = 425;BA.debugLine="If varFlat = False Then Return Me";
if (_varflat==__c.False) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 426;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 427;BA.debugLine="SetAttrSingle(\"flat\", varFlat)";
_setattrsingle("flat",BA.ObjectToString(_varflat));
 //BA.debugLineNum = 428;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 430;BA.debugLine="Dim pp As String = $\"${ID}Flat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Flat");
 //BA.debugLineNum = 431;BA.debugLine="vue.SetStateSingle(pp, varFlat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varflat));
 //BA.debugLineNum = 432;BA.debugLine="Card.Bind(\":flat\", pp)";
_card._bind /*b4j.example.vmelement*/ (":flat",_pp);
 //BA.debugLineNum = 433;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 626;BA.debugLine="Sub SetHeight(varHeight As String) As VMCard";
 //BA.debugLineNum = 627;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 628;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 629;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 630;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 632;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 633;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 634;BA.debugLine="Card.Bind(\":height\", pp)";
_card._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 635;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 636;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _sethover(boolean _varhover) throws Exception{
String _pp = "";
 //BA.debugLineNum = 437;BA.debugLine="Sub SetHover(varHover As Boolean) As VMCard";
 //BA.debugLineNum = 438;BA.debugLine="If varHover = False Then Return Me";
if (_varhover==__c.False) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 439;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 440;BA.debugLine="SetAttrSingle(\"hover\", varHover)";
_setattrsingle("hover",BA.ObjectToString(_varhover));
 //BA.debugLineNum = 441;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 443;BA.debugLine="Dim pp As String = $\"${ID}Hover\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Hover");
 //BA.debugLineNum = 444;BA.debugLine="vue.SetStateSingle(pp, varHover)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhover));
 //BA.debugLineNum = 445;BA.debugLine="Card.Bind(\":hover\", pp)";
_card._bind /*b4j.example.vmelement*/ (":hover",_pp);
 //BA.debugLineNum = 446;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _sethref(String _varhref) throws Exception{
String _pp = "";
 //BA.debugLineNum = 639;BA.debugLine="Sub SetHref(varHref As String) As VMCard";
 //BA.debugLineNum = 640;BA.debugLine="If varHref = \"\" Then Return Me";
if ((_varhref).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 641;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 642;BA.debugLine="SetAttrSingle(\"href\", varHref)";
_setattrsingle("href",_varhref);
 //BA.debugLineNum = 643;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 645;BA.debugLine="Dim pp As String = $\"${ID}Href\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Href");
 //BA.debugLineNum = 646;BA.debugLine="vue.SetStateSingle(pp, varHref)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhref));
 //BA.debugLineNum = 647;BA.debugLine="Card.Bind(\":href\", pp)";
_card._bind /*b4j.example.vmelement*/ (":href",_pp);
 //BA.debugLineNum = 648;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 649;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setimg(String _varimg) throws Exception{
String _pp = "";
 //BA.debugLineNum = 652;BA.debugLine="Sub SetImg(varImg As String) As VMCard";
 //BA.debugLineNum = 653;BA.debugLine="If varImg = \"\" Then Return Me";
if ((_varimg).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 654;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 655;BA.debugLine="SetAttrSingle(\"img\", varImg)";
_setattrsingle("img",_varimg);
 //BA.debugLineNum = 656;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 658;BA.debugLine="Dim pp As String = $\"${ID}Img\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Img");
 //BA.debugLineNum = 659;BA.debugLine="vue.SetStateSingle(pp, varImg)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varimg));
 //BA.debugLineNum = 660;BA.debugLine="Card.Bind(\":img\", pp)";
_card._bind /*b4j.example.vmelement*/ (":img",_pp);
 //BA.debugLineNum = 661;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 662;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 450;BA.debugLine="Sub SetLight(varLight As Boolean) As VMCard";
 //BA.debugLineNum = 451;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 452;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 453;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 454;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 456;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 457;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 458;BA.debugLine="Card.Bind(\":light\", pp)";
_card._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 459;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 460;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setlink(boolean _varlink) throws Exception{
String _pp = "";
 //BA.debugLineNum = 463;BA.debugLine="Sub SetLink(varLink As Boolean) As VMCard";
 //BA.debugLineNum = 464;BA.debugLine="If varLink = False Then Return Me";
if (_varlink==__c.False) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 465;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 466;BA.debugLine="SetAttrSingle(\"link\", varLink)";
_setattrsingle("link",BA.ObjectToString(_varlink));
 //BA.debugLineNum = 467;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 469;BA.debugLine="Dim pp As String = $\"${ID}Link\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Link");
 //BA.debugLineNum = 470;BA.debugLine="vue.SetStateSingle(pp, varLink)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlink));
 //BA.debugLineNum = 471;BA.debugLine="Card.Bind(\":link\", pp)";
_card._bind /*b4j.example.vmelement*/ (":link",_pp);
 //BA.debugLineNum = 472;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setloaderheight(String _varloaderheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 665;BA.debugLine="Sub SetLoaderHeight(varLoaderHeight As String) As";
 //BA.debugLineNum = 666;BA.debugLine="If varLoaderHeight = \"\" Then Return Me";
if ((_varloaderheight).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 667;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 668;BA.debugLine="SetAttrSingle(\"loader-height\", varLoaderHeight)";
_setattrsingle("loader-height",_varloaderheight);
 //BA.debugLineNum = 669;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 671;BA.debugLine="Dim pp As String = $\"${ID}LoaderHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"LoaderHeight");
 //BA.debugLineNum = 672;BA.debugLine="vue.SetStateSingle(pp, varLoaderHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloaderheight));
 //BA.debugLineNum = 673;BA.debugLine="Card.Bind(\":loader-height\", pp)";
_card._bind /*b4j.example.vmelement*/ (":loader-height",_pp);
 //BA.debugLineNum = 674;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 675;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setloading(boolean _varloading) throws Exception{
String _pp = "";
 //BA.debugLineNum = 476;BA.debugLine="Sub SetLoading(varLoading As Boolean) As VMCard";
 //BA.debugLineNum = 477;BA.debugLine="If varLoading = False Then Return Me";
if (_varloading==__c.False) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 478;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 479;BA.debugLine="SetAttrSingle(\"loading\", varLoading)";
_setattrsingle("loading",BA.ObjectToString(_varloading));
 //BA.debugLineNum = 480;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 482;BA.debugLine="Dim pp As String = $\"${ID}Loading\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Loading");
 //BA.debugLineNum = 483;BA.debugLine="vue.SetStateSingle(pp, varLoading)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloading));
 //BA.debugLineNum = 484;BA.debugLine="Card.Bind(\":loading\", pp)";
_card._bind /*b4j.example.vmelement*/ (":loading",_pp);
 //BA.debugLineNum = 485;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 486;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 839;BA.debugLine="Sub SetMarginAll(p As String) As VMCard";
 //BA.debugLineNum = 840;BA.debugLine="Card.setmarginall(p)";
_card._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 841;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 842;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setmaxheight(String _varmaxheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 678;BA.debugLine="Sub SetMaxHeight(varMaxHeight As String) As VMCard";
 //BA.debugLineNum = 679;BA.debugLine="If varMaxHeight = \"\" Then Return Me";
if ((_varmaxheight).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 680;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 681;BA.debugLine="SetAttrSingle(\"max-height\", varMaxHeight)";
_setattrsingle("max-height",_varmaxheight);
 //BA.debugLineNum = 682;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 684;BA.debugLine="Dim pp As String = $\"${ID}MaxHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxHeight");
 //BA.debugLineNum = 685;BA.debugLine="vue.SetStateSingle(pp, varMaxHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxheight));
 //BA.debugLineNum = 686;BA.debugLine="Card.Bind(\":max-height\", pp)";
_card._bind /*b4j.example.vmelement*/ (":max-height",_pp);
 //BA.debugLineNum = 687;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 688;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setmaxwidth(String _varmaxwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 691;BA.debugLine="Sub SetMaxWidth(varMaxWidth As String) As VMCard";
 //BA.debugLineNum = 692;BA.debugLine="If varMaxWidth = \"\" Then Return Me";
if ((_varmaxwidth).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 693;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 694;BA.debugLine="SetAttrSingle(\"max-width\", varMaxWidth)";
_setattrsingle("max-width",_varmaxwidth);
 //BA.debugLineNum = 695;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 697;BA.debugLine="Dim pp As String = $\"${ID}MaxWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxWidth");
 //BA.debugLineNum = 698;BA.debugLine="vue.SetStateSingle(pp, varMaxWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxwidth));
 //BA.debugLineNum = 699;BA.debugLine="Card.Bind(\":max-width\", pp)";
_card._bind /*b4j.example.vmelement*/ (":max-width",_pp);
 //BA.debugLineNum = 700;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 701;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setminheight(String _varminheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 704;BA.debugLine="Sub SetMinHeight(varMinHeight As String) As VMCard";
 //BA.debugLineNum = 705;BA.debugLine="If varMinHeight = \"\" Then Return Me";
if ((_varminheight).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 706;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 707;BA.debugLine="SetAttrSingle(\"min-height\", varMinHeight)";
_setattrsingle("min-height",_varminheight);
 //BA.debugLineNum = 708;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 710;BA.debugLine="Dim pp As String = $\"${ID}MinHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinHeight");
 //BA.debugLineNum = 711;BA.debugLine="vue.SetStateSingle(pp, varMinHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminheight));
 //BA.debugLineNum = 712;BA.debugLine="Card.Bind(\":min-height\", pp)";
_card._bind /*b4j.example.vmelement*/ (":min-height",_pp);
 //BA.debugLineNum = 713;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 714;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setminwidth(String _varminwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 717;BA.debugLine="Sub SetMinWidth(varMinWidth As String) As VMCard";
 //BA.debugLineNum = 718;BA.debugLine="If varMinWidth = \"\" Then Return Me";
if ((_varminwidth).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 719;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 720;BA.debugLine="SetAttrSingle(\"min-width\", varMinWidth)";
_setattrsingle("min-width",_varminwidth);
 //BA.debugLineNum = 721;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 723;BA.debugLine="Dim pp As String = $\"${ID}MinWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinWidth");
 //BA.debugLineNum = 724;BA.debugLine="vue.SetStateSingle(pp, varMinWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminwidth));
 //BA.debugLineNum = 725;BA.debugLine="Card.Bind(\":min-width\", pp)";
_card._bind /*b4j.example.vmelement*/ (":min-width",_pp);
 //BA.debugLineNum = 726;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 727;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 864;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 865;BA.debugLine="Card.SetName(varName, bbind)";
_card._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 866;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 867;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setnuxt(boolean _varnuxt) throws Exception{
String _pp = "";
 //BA.debugLineNum = 489;BA.debugLine="Sub SetNuxt(varNuxt As Boolean) As VMCard";
 //BA.debugLineNum = 490;BA.debugLine="If varNuxt = False Then Return Me";
if (_varnuxt==__c.False) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 491;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 492;BA.debugLine="SetAttrSingle(\"nuxt\", varNuxt)";
_setattrsingle("nuxt",BA.ObjectToString(_varnuxt));
 //BA.debugLineNum = 493;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 495;BA.debugLine="Dim pp As String = $\"${ID}Nuxt\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Nuxt");
 //BA.debugLineNum = 496;BA.debugLine="vue.SetStateSingle(pp, varNuxt)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnuxt));
 //BA.debugLineNum = 497;BA.debugLine="Card.Bind(\":nuxt\", pp)";
_card._bind /*b4j.example.vmelement*/ (":nuxt",_pp);
 //BA.debugLineNum = 498;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 499;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setok(String _okid,String _okcaption) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub SetOK(okID As String, okCaption As String) As";
 //BA.debugLineNum = 265;BA.debugLine="AddOK(okID, okCaption)";
_addok(_okid,_okcaption);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setonclick(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 787;BA.debugLine="Sub SetOnClick(methodName As String) As VMCard";
 //BA.debugLineNum = 788;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 789;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 790;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 791;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 792;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 794;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 795;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 796;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setoutlined(boolean _varoutlined) throws Exception{
String _pp = "";
 //BA.debugLineNum = 502;BA.debugLine="Sub SetOutlined(varOutlined As Boolean) As VMCard";
 //BA.debugLineNum = 503;BA.debugLine="If varOutlined = False Then Return Me";
if (_varoutlined==__c.False) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 504;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 505;BA.debugLine="SetAttrSingle(\"outlined\", varOutlined)";
_setattrsingle("outlined",BA.ObjectToString(_varoutlined));
 //BA.debugLineNum = 506;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 508;BA.debugLine="Dim pp As String = $\"${ID}Outlined\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Outlined");
 //BA.debugLineNum = 509;BA.debugLine="vue.SetStateSingle(pp, varOutlined)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoutlined));
 //BA.debugLineNum = 510;BA.debugLine="Card.Bind(\":outlined\", pp)";
_card._bind /*b4j.example.vmelement*/ (":outlined",_pp);
 //BA.debugLineNum = 511;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 512;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 834;BA.debugLine="Sub SetPaddingAll(p As String) As VMCard";
 //BA.debugLineNum = 835;BA.debugLine="Card.SetPaddingAll(p)";
_card._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 836;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 837;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setraised(boolean _varraised) throws Exception{
String _pp = "";
 //BA.debugLineNum = 515;BA.debugLine="Sub SetRaised(varRaised As Boolean) As VMCard";
 //BA.debugLineNum = 516;BA.debugLine="If varRaised = False Then Return Me";
if (_varraised==__c.False) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 517;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 518;BA.debugLine="SetAttrSingle(\"raised\", varRaised)";
_setattrsingle("raised",BA.ObjectToString(_varraised));
 //BA.debugLineNum = 519;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 521;BA.debugLine="Dim pp As String = $\"${ID}Raised\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Raised");
 //BA.debugLineNum = 522;BA.debugLine="vue.SetStateSingle(pp, varRaised)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varraised));
 //BA.debugLineNum = 523;BA.debugLine="Card.Bind(\":raised\", pp)";
_card._bind /*b4j.example.vmelement*/ (":raised",_pp);
 //BA.debugLineNum = 524;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMCar";
 //BA.debugLineNum = 120;BA.debugLine="Card.SetRC(sRow, sCol)";
_card._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setreplace(boolean _varreplace) throws Exception{
String _pp = "";
 //BA.debugLineNum = 528;BA.debugLine="Sub SetReplace(varReplace As Boolean) As VMCard";
 //BA.debugLineNum = 529;BA.debugLine="If varReplace = False Then Return Me";
if (_varreplace==__c.False) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 530;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 531;BA.debugLine="SetAttrSingle(\"replace\", varReplace)";
_setattrsingle("replace",BA.ObjectToString(_varreplace));
 //BA.debugLineNum = 532;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 534;BA.debugLine="Dim pp As String = $\"${ID}Replace\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Replace");
 //BA.debugLineNum = 535;BA.debugLine="vue.SetStateSingle(pp, varReplace)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreplace));
 //BA.debugLineNum = 536;BA.debugLine="Card.Bind(\":replace\", pp)";
_card._bind /*b4j.example.vmelement*/ (":replace",_pp);
 //BA.debugLineNum = 537;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setripple(boolean _varripple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 541;BA.debugLine="Sub SetRipple(varRipple As Boolean) As VMCard";
 //BA.debugLineNum = 542;BA.debugLine="If varRipple = False Then Return Me";
if (_varripple==__c.False) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 543;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 544;BA.debugLine="SetAttrSingle(\"ripple\", varRipple)";
_setattrsingle("ripple",BA.ObjectToString(_varripple));
 //BA.debugLineNum = 545;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 547;BA.debugLine="Dim pp As String = $\"${ID}Ripple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Ripple");
 //BA.debugLineNum = 548;BA.debugLine="vue.SetStateSingle(pp, varRipple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varripple));
 //BA.debugLineNum = 549;BA.debugLine="Card.Bind(\":ripple\", pp)";
_card._bind /*b4j.example.vmelement*/ (":ripple",_pp);
 //BA.debugLineNum = 550;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 551;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setshaped(boolean _varshaped) throws Exception{
String _pp = "";
 //BA.debugLineNum = 554;BA.debugLine="Sub SetShaped(varShaped As Boolean) As VMCard";
 //BA.debugLineNum = 555;BA.debugLine="If varShaped = False Then Return Me";
if (_varshaped==__c.False) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 556;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 557;BA.debugLine="SetAttrSingle(\"shaped\", varShaped)";
_setattrsingle("shaped",BA.ObjectToString(_varshaped));
 //BA.debugLineNum = 558;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 560;BA.debugLine="Dim pp As String = $\"${ID}Shaped\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Shaped");
 //BA.debugLineNum = 561;BA.debugLine="vue.SetStateSingle(pp, varShaped)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshaped));
 //BA.debugLineNum = 562;BA.debugLine="Card.Bind(\":shaped\", pp)";
_card._bind /*b4j.example.vmelement*/ (":shaped",_pp);
 //BA.debugLineNum = 563;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 564;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setslotprogress(boolean _b) throws Exception{
 //BA.debugLineNum = 781;BA.debugLine="Sub SetSlotProgress(b As Boolean) As VMCard    'ig";
 //BA.debugLineNum = 782;BA.debugLine="SetAttr(CreateMap(\"slot\": \"progress\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("progress")}));
 //BA.debugLineNum = 783;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 784;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetStatic(b As Boolean) As VMCard";
 //BA.debugLineNum = 104;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 105;BA.debugLine="Card.SetStatic(b)";
_card._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 106;BA.debugLine="Title.setstatic(b)";
_title._setstatic /*b4j.example.vmcardtitle*/ (_b);
 //BA.debugLineNum = 107;BA.debugLine="SubTitle.setstatic(b)";
_subtitle._setstatic /*b4j.example.vmcardsubtitle*/ (_b);
 //BA.debugLineNum = 108;BA.debugLine="Text.setstatic(b)";
_text._setstatic /*b4j.example.vmcardtext*/ (_b);
 //BA.debugLineNum = 109;BA.debugLine="Actions.SetStatic(b)";
_actions._setstatic /*b4j.example.vmcardactions*/ (_b);
 //BA.debugLineNum = 110;BA.debugLine="ToolBar.SetStatic(b)";
_toolbar._setstatic /*b4j.example.vmtoolbar*/ (_b);
 //BA.debugLineNum = 111;BA.debugLine="Form.SetStatic(b)";
_form._setstatic /*b4j.example.vmform*/ (_b);
 //BA.debugLineNum = 112;BA.debugLine="Container.SetStatic(b)";
_container._setstatic /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 113;BA.debugLine="Image.SetStatic(b)";
_image._setstatic /*b4j.example.vmimage*/ (_b);
 //BA.debugLineNum = 114;BA.debugLine="TopSheet.SetStatic(b)";
_topsheet._setstatic /*b4j.example.vmsheet*/ (_b);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Sub SetStyle(sm As Map) As VMCard";
 //BA.debugLineNum = 367;BA.debugLine="Card.SetStyle(sm)";
_card._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 870;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 871;BA.debugLine="Card.SetStyleSingle(prop, value)";
_card._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 872;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 873;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setsubtitle(String _ssubtitle) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetSubTitle(sSubTitle As String) As VMCard";
 //BA.debugLineNum = 81;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 82;BA.debugLine="SubTitle.Clear";
_subtitle._clear /*String*/ ();
 //BA.debugLineNum = 83;BA.debugLine="SubTitle.SetText(sSubTitle)";
_subtitle._settext /*b4j.example.vmcardsubtitle*/ (_ssubtitle);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 86;BA.debugLine="vue.SetStateSingle(subTitleKey, sSubTitle)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_subtitlekey,(Object)(_ssubtitle));
 //BA.debugLineNum = 87;BA.debugLine="SubTitle.SetText($\"{{ ${subTitleKey} }}\"$)";
_subtitle._settext /*b4j.example.vmcardsubtitle*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_subtitlekey))+" }}"));
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 858;BA.debugLine="Sub SetTabIndex(ti As String) As VMCard";
 //BA.debugLineNum = 859;BA.debugLine="Card.SetTabIndex(ti)";
_card._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 860;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 861;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _settag(String _vartag) throws Exception{
String _pp = "";
 //BA.debugLineNum = 730;BA.debugLine="Sub SetTag(varTag As String) As VMCard";
 //BA.debugLineNum = 731;BA.debugLine="If varTag = \"\" Then Return Me";
if ((_vartag).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 732;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 733;BA.debugLine="SetAttrSingle(\"tag\", varTag)";
_setattrsingle("tag",_vartag);
 //BA.debugLineNum = 734;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 736;BA.debugLine="Dim pp As String = $\"${ID}Tag\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tag");
 //BA.debugLineNum = 737;BA.debugLine="vue.SetStateSingle(pp, varTag)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartag));
 //BA.debugLineNum = 738;BA.debugLine="Card.Bind(\":tag\", pp)";
_card._bind /*b4j.example.vmelement*/ (":tag",_pp);
 //BA.debugLineNum = 739;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 740;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _settarget(String _vartarget) throws Exception{
String _pp = "";
 //BA.debugLineNum = 743;BA.debugLine="Sub SetTarget(varTarget As String) As VMCard";
 //BA.debugLineNum = 744;BA.debugLine="If varTarget = \"\" Then Return Me";
if ((_vartarget).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 745;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 746;BA.debugLine="SetAttrSingle(\"target\", varTarget)";
_setattrsingle("target",_vartarget);
 //BA.debugLineNum = 747;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 749;BA.debugLine="Dim pp As String = $\"${ID}Target\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Target");
 //BA.debugLineNum = 750;BA.debugLine="vue.SetStateSingle(pp, varTarget)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartarget));
 //BA.debugLineNum = 751;BA.debugLine="Card.Bind(\":target\", pp)";
_card._bind /*b4j.example.vmelement*/ (":target",_pp);
 //BA.debugLineNum = 752;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 753;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetText(t As Object) As VMCard";
 //BA.debugLineNum = 344;BA.debugLine="Card.SetText(t)";
_card._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _settextafter(String _stuff) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetTextAfter(stuff As String) As VMCard";
 //BA.debugLineNum = 199;BA.debugLine="TextAfter.Add(stuff)";
_textafter.Add((Object)(_stuff));
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _settextafterdivider(String _classname) throws Exception{
b4j.example.vmdivider _div = null;
 //BA.debugLineNum = 226;BA.debugLine="Sub SetTextAfterDivider(className As String) As VM";
 //BA.debugLineNum = 227;BA.debugLine="Dim div As VMDivider";
_div = new b4j.example.vmdivider();
 //BA.debugLineNum = 228;BA.debugLine="div.Initialize(vue).AddClass(className)";
_div._initialize /*b4j.example.vmdivider*/ (ba,_vue)._addclass /*b4j.example.vmdivider*/ (_classname);
 //BA.debugLineNum = 229;BA.debugLine="SetTextAfter(div.ToString)";
_settextafter(_div._tostring /*String*/ ());
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _settextcolor(String _textcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 909;BA.debugLine="Sub SetTextColor(textcolor As String) As VMCard";
 //BA.debugLineNum = 910;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 911;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 912;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 913;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 914;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _settextcolorintensity(String _textcolor,String _textintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 917;BA.debugLine="Sub SetTextColorIntensity(textcolor As String, tex";
 //BA.debugLineNum = 918;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 919;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 920;BA.debugLine="Dim sIntensity As String = $\"text--${textintensit";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_textintensity))+"");
 //BA.debugLineNum = 921;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 922;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 923;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 924;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _settile(boolean _vartile) throws Exception{
String _pp = "";
 //BA.debugLineNum = 567;BA.debugLine="Sub SetTile(varTile As Boolean) As VMCard";
 //BA.debugLineNum = 568;BA.debugLine="If varTile = False Then Return Me";
if (_vartile==__c.False) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 569;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 570;BA.debugLine="SetAttrSingle(\"tile\", varTile)";
_setattrsingle("tile",BA.ObjectToString(_vartile));
 //BA.debugLineNum = 571;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 573;BA.debugLine="Dim pp As String = $\"${ID}Tile\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tile");
 //BA.debugLineNum = 574;BA.debugLine="vue.SetStateSingle(pp, varTile)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartile));
 //BA.debugLineNum = 575;BA.debugLine="Card.Bind(\":tile\", pp)";
_card._bind /*b4j.example.vmelement*/ (":tile",_pp);
 //BA.debugLineNum = 576;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 577;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _settitle(String _stitle) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetTitle(sTitle As String) As VMCard";
 //BA.debugLineNum = 70;BA.debugLine="Title.Clear";
_title._clear /*String*/ ();
 //BA.debugLineNum = 71;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 72;BA.debugLine="Title.SetText(sTitle)";
_title._settext /*b4j.example.vmcardtitle*/ (_stitle);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 75;BA.debugLine="vue.SetStateSingle(titleKey, sTitle)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_titlekey,(Object)(_stitle));
 //BA.debugLineNum = 76;BA.debugLine="Title.SetText($\"{{ ${titleKey} }}\"$)";
_title._settext /*b4j.example.vmcardtitle*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_titlekey))+" }}"));
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _settitleprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetTitlePrimary(b As Boolean) As VMCard";
 //BA.debugLineNum = 271;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 272;BA.debugLine="Title.SetAttrSingle(\"primary-title\", True)";
_title._setattrsingle /*b4j.example.vmcardtitle*/ ("primary-title",BA.ObjectToString(__c.True));
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setto(String _varto) throws Exception{
String _pp = "";
 //BA.debugLineNum = 756;BA.debugLine="Sub SetTo(varTo As String) As VMCard";
 //BA.debugLineNum = 757;BA.debugLine="If varTo = \"\" Then Return Me";
if ((_varto).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 758;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 759;BA.debugLine="SetAttrSingle(\"to\", varTo)";
_setattrsingle("to",_varto);
 //BA.debugLineNum = 760;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 762;BA.debugLine="Dim pp As String = $\"${ID}To\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"To");
 //BA.debugLineNum = 763;BA.debugLine="vue.SetStateSingle(pp, varTo)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varto));
 //BA.debugLineNum = 764;BA.debugLine="Card.Bind(\":to\", pp)";
_card._bind /*b4j.example.vmelement*/ (":to",_pp);
 //BA.debugLineNum = 765;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 766;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub SetVIf(vif As String) As VMCard";
 //BA.debugLineNum = 321;BA.debugLine="Card.SetVIf(vif)";
_card._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 889;BA.debugLine="Sub SetVisible(b As Boolean) As VMCard";
 //BA.debugLineNum = 890;BA.debugLine="Card.SetVisible(b)";
_card._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 891;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 892;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub SetVModel(k As String) As VMCard";
 //BA.debugLineNum = 316;BA.debugLine="Card.SetVModel(k)";
_card._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub SetVShow(vif As String) As VMCard";
 //BA.debugLineNum = 326;BA.debugLine="Card.SetVShow(vif)";
_card._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setwidth(String _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 769;BA.debugLine="Sub SetWidth(varWidth As String) As VMCard";
 //BA.debugLineNum = 770;BA.debugLine="If varWidth = \"\" Then Return Me";
if ((_varwidth).equals("")) { 
if (true) return (b4j.example.vmcard)(this);};
 //BA.debugLineNum = 771;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 772;BA.debugLine="SetAttrSingle(\"width\", varWidth)";
_setattrsingle("width",_varwidth);
 //BA.debugLineNum = 773;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 };
 //BA.debugLineNum = 775;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 776;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varwidth));
 //BA.debugLineNum = 777;BA.debugLine="Card.Bind(\":width\", pp)";
_card._bind /*b4j.example.vmelement*/ (":width",_pp);
 //BA.debugLineNum = 778;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 779;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _show() throws Exception{
 //BA.debugLineNum = 804;BA.debugLine="Sub Show As VMCard";
 //BA.debugLineNum = 805;BA.debugLine="Card.SetVisible(True)";
_card._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 806;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 807;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
String _stritem = "";
 //BA.debugLineNum = 234;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 235;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 236;BA.debugLine="Dim eName As String = $\"${ID}_click\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_click");
 //BA.debugLineNum = 237;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 238;BA.debugLine="Log($\"VMCard.${eName} event has not been define";
__c.Log(("VMCard."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 241;BA.debugLine="If TopSheet.hascontent Then TopSheet.Pop(Card)";
if (_topsheet._hascontent /*boolean*/ ) { 
_topsheet._pop /*String*/ (_card);};
 //BA.debugLineNum = 242;BA.debugLine="If ToolBar.hasContent Then ToolBar.Pop(Card)";
if (_toolbar._hascontent /*boolean*/ ) { 
_toolbar._pop /*String*/ (_card);};
 //BA.debugLineNum = 243;BA.debugLine="If Image.HasContent Then Image.Pop(Card)";
if (_image._hascontent /*boolean*/ ) { 
_image._pop /*String*/ (_card);};
 //BA.debugLineNum = 244;BA.debugLine="If Title.HasContent Then Title.Pop(Card)";
if (_title._hascontent /*boolean*/ ) { 
_title._pop /*String*/ (_card);};
 //BA.debugLineNum = 245;BA.debugLine="If SubTitle.HasContent Then SubTitle.Pop(Card)";
if (_subtitle._hascontent /*boolean*/ ) { 
_subtitle._pop /*String*/ (_card);};
 //BA.debugLineNum = 246;BA.debugLine="If IsTable = False Then";
if (_istable==__c.False) { 
 //BA.debugLineNum = 247;BA.debugLine="If Form.hascontent Then Text.AddContent(Form.ToS";
if (_form._hascontent /*boolean*/ ()) { 
_text._addcontent /*b4j.example.vmcardtext*/ (_form._tostring /*String*/ ());};
 //BA.debugLineNum = 248;BA.debugLine="If Text.HasContent Then Text.Pop(Card)";
if (_text._hascontent /*boolean*/ ) { 
_text._pop /*String*/ (_card);};
 };
 //BA.debugLineNum = 250;BA.debugLine="For Each strItem As String In TextAfter";
{
final anywheresoftware.b4a.BA.IterableList group16 = _textafter;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_stritem = BA.ObjectToString(group16.Get(index16));
 //BA.debugLineNum = 251;BA.debugLine="Card.SetText(strItem)";
_card._settext /*b4j.example.vmelement*/ (_stritem);
 }
};
 //BA.debugLineNum = 253;BA.debugLine="If IsDialog Then Card.AddDivider";
if (_isdialog) { 
_card._adddivider /*b4j.example.vmelement*/ ();};
 //BA.debugLineNum = 254;BA.debugLine="If IsTable = False Then";
if (_istable==__c.False) { 
 //BA.debugLineNum = 255;BA.debugLine="If Actions.HasContent Then Actions.Pop(Card)";
if (_actions._hascontent /*boolean*/ ) { 
_actions._pop /*String*/ (_card);};
 //BA.debugLineNum = 256;BA.debugLine="For Each strItem As String In extra";
{
final anywheresoftware.b4a.BA.IterableList group22 = _extra;
final int groupLen22 = group22.getSize()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_stritem = BA.ObjectToString(group22.Get(index22));
 //BA.debugLineNum = 257;BA.debugLine="Card.SetText(strItem)";
_card._settext /*b4j.example.vmelement*/ (_stritem);
 }
};
 };
 //BA.debugLineNum = 260;BA.debugLine="Return Card.tostring";
if (true) return _card._tostring /*String*/ ();
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcard  _updatesubtitle(String _ssubtitle) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub UpdateSubTitle(sSubTitle As String) As VMCard";
 //BA.debugLineNum = 99;BA.debugLine="vue.SetStateSingle(subTitleKey, sSubTitle)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_subtitlekey,(Object)(_ssubtitle));
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _updatetitle(String _stitle) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub UpdateTitle(sTitle As String) As VMCard";
 //BA.debugLineNum = 93;BA.debugLine="vue.SetStateSingle(titleKey, sTitle)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_titlekey,(Object)(_stitle));
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 156;BA.debugLine="Sub UseTheme(themeName As String) As VMCard";
 //BA.debugLineNum = 157;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 158;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 159;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 160;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 161;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public String  _validate() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub Validate";
 //BA.debugLineNum = 57;BA.debugLine="Form.validate";
_form._validate /*String*/ ();
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
