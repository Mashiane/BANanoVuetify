package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmdialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmdialog", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmdialog.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _dialog = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public b4j.example.vmcard _card = null;
public b4j.example.vmcardtitle _title = null;
public b4j.example.vmcardtext _content = null;
public b4j.example.vmcardactions _actions = null;
public b4j.example.vmcontainer _container = null;
public String _titlekey = "";
public String _contentkey = "";
public boolean _bstatic = false;
public b4j.example.vmform _form = null;
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
public b4j.example.vmdialog  _addbutton(b4j.example.vmbutton _btn) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub AddButton(btn As VMButton) As VMDialog";
 //BA.debugLineNum = 197;BA.debugLine="btn.pop(Actions.CardActions)";
_btn._pop /*String*/ (_actions._cardactions /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _addcancel(String _cancelid,String _cancelcaption) throws Exception{
b4j.example.vmbutton _btncancel = null;
 //BA.debugLineNum = 201;BA.debugLine="Sub AddCANCEL(cancelID As String, cancelCaption As";
 //BA.debugLineNum = 202;BA.debugLine="Dim btnCancel As VMButton";
_btncancel = new b4j.example.vmbutton();
 //BA.debugLineNum = 203;BA.debugLine="btnCancel.Initialize(vue, cancelID, Module).SetSt";
_btncancel._initialize /*b4j.example.vmbutton*/ (ba,_vue,_cancelid,_module)._setstatic /*b4j.example.vmbutton*/ (_bstatic)._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 204;BA.debugLine="btnCancel.SetLabel(cancelCaption)";
_btncancel._setlabel /*b4j.example.vmbutton*/ (_cancelcaption);
 //BA.debugLineNum = 205;BA.debugLine="btnCancel.SetAccent(True)";
_btncancel._setaccent /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 206;BA.debugLine="btnCancel.SetTransparent(True)";
_btncancel._settransparent /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 207;BA.debugLine="btnCancel.Pop(Actions.CardActions)";
_btncancel._pop /*String*/ (_actions._cardactions /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 244;BA.debugLine="Sub AddChild(child As VMElement) As VMDialog";
 //BA.debugLineNum = 245;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 246;BA.debugLine="Dialog.SetText(childHTML)";
_dialog._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 280;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 281;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 282;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdialog  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Sub AddClass(c As String) As VMDialog";
 //BA.debugLineNum = 263;BA.debugLine="Dialog.AddClass(c)";
_dialog._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _addok(String _okid,String _okcaption) throws Exception{
b4j.example.vmbutton _btnok = null;
 //BA.debugLineNum = 181;BA.debugLine="Sub AddOK(okID As String, okCaption As String) As";
 //BA.debugLineNum = 182;BA.debugLine="Dim btnOK As VMButton";
_btnok = new b4j.example.vmbutton();
 //BA.debugLineNum = 183;BA.debugLine="btnOK.Initialize(vue, okID, Module).SetStatic(bSt";
_btnok._initialize /*b4j.example.vmbutton*/ (ba,_vue,_okid,_module)._setstatic /*b4j.example.vmbutton*/ (_bstatic)._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 184;BA.debugLine="btnOK.SetPrimary(True)";
_btnok._setprimary /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 185;BA.debugLine="btnOK.SetLabel(okCaption)";
_btnok._setlabel /*b4j.example.vmbutton*/ (_okcaption);
 //BA.debugLineNum = 186;BA.debugLine="btnOK.SetTransparent(True)";
_btnok._settransparent /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 187;BA.debugLine="btnOK.Pop(Actions.CardActions)";
_btnok._pop /*String*/ (_actions._cardactions /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 637;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 638;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 639;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 640;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 641;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 102;BA.debugLine="Dialog.BindStyleSingle(prop, value)";
_dialog._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 697;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 698;BA.debugLine="Dialog.BuildModel(mprops, mstyles, lclasses, loos";
_dialog._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 699;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 700;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Dialog As VMElement";
_dialog = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private Card As VMCard";
_card = new b4j.example.vmcard();
 //BA.debugLineNum = 10;BA.debugLine="Public Title As VMCardTitle";
_title = new b4j.example.vmcardtitle();
 //BA.debugLineNum = 11;BA.debugLine="Public Content As VMCardText";
_content = new b4j.example.vmcardtext();
 //BA.debugLineNum = 12;BA.debugLine="Public Actions As VMCardActions";
_actions = new b4j.example.vmcardactions();
 //BA.debugLineNum = 13;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
 //BA.debugLineNum = 14;BA.debugLine="Private titleKey As String";
_titlekey = "";
 //BA.debugLineNum = 15;BA.debugLine="Private contentKey As String";
_contentkey = "";
 //BA.debugLineNum = 16;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 17;BA.debugLine="Private Form As VMForm";
_form = new b4j.example.vmform();
 //BA.debugLineNum = 18;BA.debugLine="Private smodel As String";
_smodel = "";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdialog  _disable() throws Exception{
 //BA.debugLineNum = 631;BA.debugLine="Sub Disable As VMDialog";
 //BA.debugLineNum = 632;BA.debugLine="Dialog.Disable(True)";
_dialog._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 633;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 634;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _enable() throws Exception{
 //BA.debugLineNum = 626;BA.debugLine="Sub Enable As VMDialog";
 //BA.debugLineNum = 627;BA.debugLine="Dialog.Enable(True)";
_dialog._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 628;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 629;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getdata() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub GetData As Map";
 //BA.debugLineNum = 92;BA.debugLine="Return Container.GetData";
if (true) return _container._getdata /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _hide() throws Exception{
 //BA.debugLineNum = 615;BA.debugLine="Sub Hide As VMDialog";
 //BA.debugLineNum = 616;BA.debugLine="vue.SetStateSingle(smodel, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_smodel,(Object)(__c.False));
 //BA.debugLineNum = 617;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 618;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 23;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 24;BA.debugLine="Dialog.Initialize(v, ID)";
_dialog._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 25;BA.debugLine="Dialog.SetTag(\"v-dialog\")";
_dialog._settag /*b4j.example.vmelement*/ ("v-dialog");
 //BA.debugLineNum = 26;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 27;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 28;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 29;BA.debugLine="SetVModel(Dialog.showkey)";
_setvmodel(_dialog._showkey /*String*/ );
 //BA.debugLineNum = 30;BA.debugLine="Card.Initialize(vue, $\"${ID}card\"$, eventHandler)";
_card._initialize /*b4j.example.vmcard*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"card"),_eventhandler);
 //BA.debugLineNum = 31;BA.debugLine="Card.IsDialog = True";
_card._isdialog /*boolean*/  = __c.True;
 //BA.debugLineNum = 32;BA.debugLine="Title = Card.title";
_title = _card._title /*b4j.example.vmcardtitle*/ ;
 //BA.debugLineNum = 33;BA.debugLine="Content = Card.text";
_content = _card._text /*b4j.example.vmcardtext*/ ;
 //BA.debugLineNum = 34;BA.debugLine="Actions = Card.Actions";
_actions = _card._actions /*b4j.example.vmcardactions*/ ;
 //BA.debugLineNum = 35;BA.debugLine="Form = Card.Form";
_form = _card._form /*b4j.example.vmform*/ ;
 //BA.debugLineNum = 36;BA.debugLine="Container = Form.Container";
_container = _form._container /*b4j.example.vmcontainer*/ ;
 //BA.debugLineNum = 37;BA.debugLine="Actions.AddSpacer";
_actions._addspacer /*b4j.example.vmcardactions*/ ();
 //BA.debugLineNum = 39;BA.debugLine="Title.AddClass(\"headline\")";
_title._addclass /*b4j.example.vmcardtitle*/ ("headline");
 //BA.debugLineNum = 40;BA.debugLine="titleKey = $\"${ID}title\"$";
_titlekey = (""+__c.SmartStringFormatter("",(Object)(_id))+"title");
 //BA.debugLineNum = 41;BA.debugLine="contentKey = $\"${ID}content\"$";
_contentkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"content");
 //BA.debugLineNum = 42;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 43;BA.debugLine="Hide";
_hide();
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _makediv() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub MakeDiv As VMDialog";
 //BA.debugLineNum = 81;BA.debugLine="Dialog.SetTag(\"div\")";
_dialog._settag /*b4j.example.vmelement*/ ("div");
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 258;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdialog  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 644;BA.debugLine="public Sub RemoveAttr(sName As String) As VMDialog";
 //BA.debugLineNum = 645;BA.debugLine="Dialog.RemoveAttr(sName)";
_dialog._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 646;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 647;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _removevmodel() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub RemoveVModel As VMDialog";
 //BA.debugLineNum = 54;BA.debugLine="RemoveAttr(\"v-model\")";
_removeattr("v-model");
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub Render";
 //BA.debugLineNum = 240;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _required() throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub Required As Map";
 //BA.debugLineNum = 97;BA.debugLine="Return Container.Required";
if (true) return _container._required /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public String  _reset() throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub Reset";
 //BA.debugLineNum = 64;BA.debugLine="Card.Form.Reset";
_card._form /*b4j.example.vmform*/ ._reset /*String*/ ();
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public String  _resetvalidation() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub ResetValidation";
 //BA.debugLineNum = 68;BA.debugLine="Card.Form.ResetValidation";
_card._form /*b4j.example.vmform*/ ._resetvalidation /*String*/ ();
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdialog  _setactivator(String _varactivator) throws Exception{
String _pp = "";
 //BA.debugLineNum = 287;BA.debugLine="Sub SetActivator(varActivator As String) As VMDial";
 //BA.debugLineNum = 288;BA.debugLine="If varActivator = \"\" Then Return Me";
if ((_varactivator).equals("")) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 289;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 290;BA.debugLine="SetAttrSingle(\"activator\", varActivator)";
_setattrsingle("activator",_varactivator);
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 293;BA.debugLine="Dim pp As String = $\"${ID}Activator\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Activator");
 //BA.debugLineNum = 294;BA.debugLine="vue.SetStateSingle(pp, varActivator)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactivator));
 //BA.debugLineNum = 295;BA.debugLine="Dialog.Bind(\":activator\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":activator",_pp);
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setattach(boolean _varattach) throws Exception{
String _pp = "";
 //BA.debugLineNum = 300;BA.debugLine="Sub SetAttach(varAttach As Boolean) As VMDialog";
 //BA.debugLineNum = 301;BA.debugLine="If varAttach = False Then Return Me";
if (_varattach==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 302;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 303;BA.debugLine="SetAttrSingle(\"attach\", varAttach)";
_setattrsingle("attach",BA.ObjectToString(_varattach));
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 306;BA.debugLine="Dim pp As String = $\"${ID}Attach\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Attach");
 //BA.debugLineNum = 307;BA.debugLine="vue.SetStateSingle(pp, varAttach)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varattach));
 //BA.debugLineNum = 308;BA.debugLine="Dialog.Bind(\":attach\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":attach",_pp);
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub SetAttr(attr As Map) As VMDialog";
 //BA.debugLineNum = 269;BA.debugLine="Dialog.SetAttr(attr)";
_dialog._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 111;BA.debugLine="Sub SetAttributes(attrs As List) As VMDialog";
 //BA.debugLineNum = 112;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 113;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetAttrLoose(loose As String) As VMDialog";
 //BA.debugLineNum = 107;BA.debugLine="Dialog.SetAttrLoose(loose)";
_dialog._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 684;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 685;BA.debugLine="Dialog.SetAttrSingle(prop, value)";
_dialog._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 686;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 687;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setbackdrop(boolean _b) throws Exception{
 //BA.debugLineNum = 378;BA.debugLine="Sub SetBackdrop(b As Boolean) As VMDialog";
 //BA.debugLineNum = 379;BA.debugLine="SetHideOverlay(b)";
_sethideoverlay(_b);
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setcancel(String _cancelid,String _cancelcaption) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetCancel(cancelID As String, cancelCaption As";
 //BA.debugLineNum = 192;BA.debugLine="AddCANCEL(cancelID, cancelCaption)";
_addcancel(_cancelid,_cancelcaption);
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 163;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 164;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 165;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 166;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 167;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 170;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 171;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 172;BA.debugLine="Dialog.Bind(\":color\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setcontent(String _scontent) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetContent(sContent As String) As VMDialog";
 //BA.debugLineNum = 130;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 131;BA.debugLine="Content.SetText(sContent)";
_content._settext /*b4j.example.vmcardtext*/ (_scontent);
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 134;BA.debugLine="vue.SetStateSingle(contentKey, sContent)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_contentkey,(Object)(_scontent));
 //BA.debugLineNum = 135;BA.debugLine="Content.SetText($\"{{ ${contentKey} }}\"$)";
_content._settext /*b4j.example.vmcardtext*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_contentkey))+" }}"));
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setcontentclass(String _varcontentclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 313;BA.debugLine="Sub SetContentClass(varContentClass As String) As";
 //BA.debugLineNum = 314;BA.debugLine="If varContentClass = \"\" Then Return Me";
if ((_varcontentclass).equals("")) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 315;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 316;BA.debugLine="SetAttrSingle(\"content-class\", varContentClass)";
_setattrsingle("content-class",_varcontentclass);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 319;BA.debugLine="Dim pp As String = $\"${ID}ContentClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ContentClass");
 //BA.debugLineNum = 320;BA.debugLine="vue.SetStateSingle(pp, varContentClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcontentclass));
 //BA.debugLineNum = 321;BA.debugLine="Dialog.Bind(\":content-class\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":content-class",_pp);
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 326;BA.debugLine="Sub SetDark(varDark As Boolean) As VMDialog";
 //BA.debugLineNum = 327;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 328;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 329;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 332;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 333;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 334;BA.debugLine="Dialog.Bind(\":dark\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 48;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public String  _setdefaults() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetDefaults";
 //BA.debugLineNum = 87;BA.debugLine="Container.SetDefaults";
_container._setdefaults /*String*/ ();
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdialog  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 660;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMDialog";
 //BA.debugLineNum = 661;BA.debugLine="Dialog.SetDesignMode(b)";
_dialog._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 662;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 663;BA.debugLine="Card.SetDesignMode(b)";
_card._setdesignmode /*b4j.example.vmcard*/ (_b);
 //BA.debugLineNum = 664;BA.debugLine="Container.SetDesignMode(b)";
_container._setdesignmode /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 665;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 666;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 339;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMDialo";
 //BA.debugLineNum = 340;BA.debugLine="Dialog.SetDisabled(varDisabled)";
_dialog._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 341;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _seteager(boolean _vareager) throws Exception{
String _pp = "";
 //BA.debugLineNum = 345;BA.debugLine="Sub SetEager(varEager As Boolean) As VMDialog";
 //BA.debugLineNum = 346;BA.debugLine="If varEager = False Then Return Me";
if (_vareager==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 347;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 348;BA.debugLine="SetAttrSingle(\"eager\", varEager)";
_setattrsingle("eager",BA.ObjectToString(_vareager));
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 351;BA.debugLine="Dim pp As String = $\"${ID}Eager\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Eager");
 //BA.debugLineNum = 352;BA.debugLine="vue.SetStateSingle(pp, varEager)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareager));
 //BA.debugLineNum = 353;BA.debugLine="Dialog.Bind(\":eager\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":eager",_pp);
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setfullscreen(boolean _varfullscreen) throws Exception{
String _pp = "";
 //BA.debugLineNum = 358;BA.debugLine="Sub SetFullscreen(varFullscreen As Boolean) As VMD";
 //BA.debugLineNum = 359;BA.debugLine="If varFullscreen = False Then Return Me";
if (_varfullscreen==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 360;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 361;BA.debugLine="SetAttrSingle(\"fullscreen\", varFullscreen)";
_setattrsingle("fullscreen",BA.ObjectToString(_varfullscreen));
 //BA.debugLineNum = 362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 364;BA.debugLine="Dim pp As String = $\"${ID}fullscreen\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"fullscreen");
 //BA.debugLineNum = 365;BA.debugLine="vue.SetStateSingle(pp, varFullscreen)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfullscreen));
 //BA.debugLineNum = 366;BA.debugLine="Dialog.Bind(\":fullscreen\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":fullscreen",_pp);
 //BA.debugLineNum = 367;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setheight(String _h) throws Exception{
 //BA.debugLineNum = 690;BA.debugLine="Sub SetHeight(h As String) As VMDialog";
 //BA.debugLineNum = 691;BA.debugLine="If h = \"\" Then Return Me";
if ((_h).equals("")) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 692;BA.debugLine="Dialog.SetStyleSingle(\"height\", h)";
_dialog._setstylesingle /*b4j.example.vmelement*/ ("height",(Object)(_h));
 //BA.debugLineNum = 693;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 694;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _sethideoverlay(boolean _varhideoverlay) throws Exception{
 //BA.debugLineNum = 371;BA.debugLine="Sub SetHideOverlay(varHideOverlay As Boolean) As V";
 //BA.debugLineNum = 372;BA.debugLine="If varHideOverlay = False Then Return Me";
if (_varhideoverlay==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 373;BA.debugLine="Dialog.SetAttrLoose(\"hide-overlay\")";
_dialog._setattrloose /*b4j.example.vmelement*/ ("hide-overlay");
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setinternalactivator(boolean _varinternalactivator) throws Exception{
String _pp = "";
 //BA.debugLineNum = 384;BA.debugLine="Sub SetInternalActivator(varInternalActivator As B";
 //BA.debugLineNum = 385;BA.debugLine="If varInternalActivator = False Then Return Me";
if (_varinternalactivator==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 386;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 387;BA.debugLine="SetAttrSingle(\"internal-activator\", varInternalA";
_setattrsingle("internal-activator",BA.ObjectToString(_varinternalactivator));
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 390;BA.debugLine="Dim pp As String = $\"${ID}InternalActivator\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"InternalActivator");
 //BA.debugLineNum = 391;BA.debugLine="vue.SetStateSingle(pp, varInternalActivator)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varinternalactivator));
 //BA.debugLineNum = 392;BA.debugLine="Dialog.Bind(\":internal-activator\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":internal-activator",_pp);
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 397;BA.debugLine="Sub SetLight(varLight As Boolean) As VMDialog";
 //BA.debugLineNum = 398;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 399;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 400;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 401;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 403;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 404;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 405;BA.debugLine="Dialog.Bind(\":light\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 655;BA.debugLine="Sub SetMarginAll(p As String) As VMDialog";
 //BA.debugLineNum = 656;BA.debugLine="Dialog.setmarginall(p)";
_dialog._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 657;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 658;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setmaxwidth(String _varmaxwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 410;BA.debugLine="Sub SetMaxWidth(varMaxWidth As String) As VMDialog";
 //BA.debugLineNum = 411;BA.debugLine="If varMaxWidth = \"\" Then Return Me";
if ((_varmaxwidth).equals("")) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 412;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 413;BA.debugLine="SetAttrSingle(\"max-width\", varMaxWidth)";
_setattrsingle("max-width",_varmaxwidth);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 416;BA.debugLine="Dim pp As String = $\"${ID}MaxWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxWidth");
 //BA.debugLineNum = 417;BA.debugLine="vue.SetStateSingle(pp, varMaxWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxwidth));
 //BA.debugLineNum = 418;BA.debugLine="Dialog.Bind(\":max-width\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":max-width",_pp);
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setmodal(boolean _b) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetModal(b As Boolean) As VMDialog";
 //BA.debugLineNum = 146;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 147;BA.debugLine="SetPersistent(True)";
_setpersistent(__c.True);
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 674;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 675;BA.debugLine="Dialog.SetName(varName, bbind)";
_dialog._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 676;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 677;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setnoclickanimation(boolean _varnoclickanimation) throws Exception{
String _pp = "";
 //BA.debugLineNum = 423;BA.debugLine="Sub SetNoClickAnimation(varNoClickAnimation As Boo";
 //BA.debugLineNum = 424;BA.debugLine="If varNoClickAnimation = False Then Return Me";
if (_varnoclickanimation==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 425;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 426;BA.debugLine="SetAttrSingle(\"no-click-animation\", varNoClickAn";
_setattrsingle("no-click-animation",BA.ObjectToString(_varnoclickanimation));
 //BA.debugLineNum = 427;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 429;BA.debugLine="Dim pp As String = $\"${ID}NoClickAnimation\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NoClickAnimation");
 //BA.debugLineNum = 430;BA.debugLine="vue.SetStateSingle(pp, varNoClickAnimation)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnoclickanimation));
 //BA.debugLineNum = 431;BA.debugLine="Dialog.Bind(\":no-click-animation\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":no-click-animation",_pp);
 //BA.debugLineNum = 432;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setok(String _okid,String _okcaption) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub SetOK(okID As String, okCaption As String) As";
 //BA.debugLineNum = 177;BA.debugLine="AddOK(okID, okCaption)";
_addok(_okid,_okcaption);
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setonclickoutside(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 579;BA.debugLine="Sub SetOnClickOutside(methodName As String) As VMD";
 //BA.debugLineNum = 580;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 581;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 582;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 583;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 584;BA.debugLine="SetAttr(CreateMap(\"@click:outside\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:outside"),(Object)(_methodname)}));
 //BA.debugLineNum = 586;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 587;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 588;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setoninput(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 591;BA.debugLine="Sub SetOnInput(methodName As String) As VMDialog";
 //BA.debugLineNum = 592;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 593;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 594;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 595;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 596;BA.debugLine="SetAttr(CreateMap(\"@input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_methodname)}));
 //BA.debugLineNum = 598;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 599;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 600;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setonkeydown(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 603;BA.debugLine="Sub SetOnKeydown(methodName As String) As VMDialog";
 //BA.debugLineNum = 604;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 605;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 606;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 607;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 608;BA.debugLine="SetAttr(CreateMap(\"@keydown\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@keydown"),(Object)(_methodname)}));
 //BA.debugLineNum = 610;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 611;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 612;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setopenonhover(boolean _varopenonhover) throws Exception{
String _pp = "";
 //BA.debugLineNum = 436;BA.debugLine="Sub SetOpenOnHover(varOpenOnHover As Boolean) As V";
 //BA.debugLineNum = 437;BA.debugLine="If varOpenOnHover = False Then Return Me";
if (_varopenonhover==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 438;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 439;BA.debugLine="SetAttrSingle(\"open-on-hover\", varOpenOnHover)";
_setattrsingle("open-on-hover",BA.ObjectToString(_varopenonhover));
 //BA.debugLineNum = 440;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 442;BA.debugLine="Dim pp As String = $\"${ID}OpenOnHover\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OpenOnHover");
 //BA.debugLineNum = 443;BA.debugLine="vue.SetStateSingle(pp, varOpenOnHover)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varopenonhover));
 //BA.debugLineNum = 444;BA.debugLine="Dialog.Bind(\":open-on-hover\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":open-on-hover",_pp);
 //BA.debugLineNum = 445;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 446;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setorigin(String _varorigin) throws Exception{
String _pp = "";
 //BA.debugLineNum = 449;BA.debugLine="Sub SetOrigin(varOrigin As String) As VMDialog";
 //BA.debugLineNum = 450;BA.debugLine="If varOrigin = \"\" Then Return Me";
if ((_varorigin).equals("")) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 451;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 452;BA.debugLine="SetAttrSingle(\"origin\", varOrigin)";
_setattrsingle("origin",_varorigin);
 //BA.debugLineNum = 453;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 455;BA.debugLine="Dim pp As String = $\"${ID}Origin\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Origin");
 //BA.debugLineNum = 456;BA.debugLine="vue.SetStateSingle(pp, varOrigin)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varorigin));
 //BA.debugLineNum = 457;BA.debugLine="Dialog.Bind(\":origin\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":origin",_pp);
 //BA.debugLineNum = 458;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 459;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setoverlaycolor(String _varoverlaycolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 462;BA.debugLine="Sub SetOverlayColor(varOverlayColor As String) As";
 //BA.debugLineNum = 463;BA.debugLine="If varOverlayColor = \"\" Then Return Me";
if ((_varoverlaycolor).equals("")) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 464;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 465;BA.debugLine="SetAttrSingle(\"overlay-color\", varOverlayColor)";
_setattrsingle("overlay-color",_varoverlaycolor);
 //BA.debugLineNum = 466;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 468;BA.debugLine="Dim pp As String = $\"${ID}OverlayColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OverlayColor");
 //BA.debugLineNum = 469;BA.debugLine="vue.SetStateSingle(pp, varOverlayColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoverlaycolor));
 //BA.debugLineNum = 470;BA.debugLine="Dialog.Bind(\":overlay-color\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":overlay-color",_pp);
 //BA.debugLineNum = 471;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 472;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setoverlaycolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 475;BA.debugLine="Sub SetOverlayColorIntensity(varColor As String, v";
 //BA.debugLineNum = 476;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 477;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 478;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 479;BA.debugLine="SetAttrSingle(\"overlay-color\", scolor)";
_setattrsingle("overlay-color",_scolor);
 //BA.debugLineNum = 480;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 482;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 483;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 484;BA.debugLine="Dialog.Bind(\":overlay-color\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":overlay-color",_pp);
 //BA.debugLineNum = 485;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 486;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setoverlayopacity(String _varoverlayopacity) throws Exception{
String _pp = "";
 //BA.debugLineNum = 489;BA.debugLine="Sub SetOverlayOpacity(varOverlayOpacity As String)";
 //BA.debugLineNum = 490;BA.debugLine="If varOverlayOpacity = \"\" Then Return Me";
if ((_varoverlayopacity).equals("")) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 491;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 492;BA.debugLine="SetAttrSingle(\"overlay-opacity\", varOverlayOpaci";
_setattrsingle("overlay-opacity",_varoverlayopacity);
 //BA.debugLineNum = 493;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 495;BA.debugLine="Dim pp As String = $\"${ID}OverlayOpacity\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OverlayOpacity");
 //BA.debugLineNum = 496;BA.debugLine="vue.SetStateSingle(pp, varOverlayOpacity)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varoverlayopacity));
 //BA.debugLineNum = 497;BA.debugLine="Dialog.Bind(\":overlay-opacity\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":overlay-opacity",_pp);
 //BA.debugLineNum = 498;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 499;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 650;BA.debugLine="Sub SetPaddingAll(p As String) As VMDialog";
 //BA.debugLineNum = 651;BA.debugLine="Dialog.SetPaddingAll(p)";
_dialog._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 652;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 653;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setpersistent(boolean _varpersistent) throws Exception{
String _pp = "";
 //BA.debugLineNum = 502;BA.debugLine="Sub SetPersistent(varPersistent As Boolean) As VMD";
 //BA.debugLineNum = 503;BA.debugLine="If varPersistent = False Then Return Me";
if (_varpersistent==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 504;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 505;BA.debugLine="SetAttrSingle(\"persistent\", varPersistent)";
_setattrsingle("persistent",BA.ObjectToString(_varpersistent));
 //BA.debugLineNum = 506;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 508;BA.debugLine="Dim pp As String = $\"${ID}Persistent\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Persistent");
 //BA.debugLineNum = 509;BA.debugLine="vue.SetStateSingle(pp, varPersistent)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpersistent));
 //BA.debugLineNum = 510;BA.debugLine="Dialog.Bind(\":persistent\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":persistent",_pp);
 //BA.debugLineNum = 511;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 512;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setretainfocus(boolean _varretainfocus) throws Exception{
String _pp = "";
 //BA.debugLineNum = 515;BA.debugLine="Sub SetRetainFocus(varRetainFocus As Boolean) As V";
 //BA.debugLineNum = 516;BA.debugLine="If varRetainFocus Then Return Me";
if (_varretainfocus) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 517;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 518;BA.debugLine="SetAttrSingle(\"retain-focus\", varRetainFocus)";
_setattrsingle("retain-focus",BA.ObjectToString(_varretainfocus));
 //BA.debugLineNum = 519;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 521;BA.debugLine="Dim pp As String = $\"${ID}RetainFocus\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"RetainFocus");
 //BA.debugLineNum = 522;BA.debugLine="vue.SetStateSingle(pp, varRetainFocus)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varretainfocus));
 //BA.debugLineNum = 523;BA.debugLine="Dialog.Bind(\":retain-focus\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":retain-focus",_pp);
 //BA.debugLineNum = 524;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setscrollable(boolean _varscrollable) throws Exception{
String _pp = "";
 //BA.debugLineNum = 528;BA.debugLine="Sub SetScrollable(varScrollable As Boolean) As VMD";
 //BA.debugLineNum = 529;BA.debugLine="If varScrollable = False Then Return Me";
if (_varscrollable==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 530;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 531;BA.debugLine="SetAttrSingle(\"scrollable\", varScrollable)";
_setattrsingle("scrollable",BA.ObjectToString(_varscrollable));
 //BA.debugLineNum = 532;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 534;BA.debugLine="Dim pp As String = $\"${ID}scrollable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"scrollable");
 //BA.debugLineNum = 535;BA.debugLine="vue.SetStateSingle(pp, varScrollable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varscrollable));
 //BA.debugLineNum = 536;BA.debugLine="Dialog.Bind(\":scrollable\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":scrollable",_pp);
 //BA.debugLineNum = 537;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setslotactivator(boolean _b) throws Exception{
 //BA.debugLineNum = 573;BA.debugLine="Sub SetSlotActivator(b As Boolean) As VMDialog";
 //BA.debugLineNum = 574;BA.debugLine="SetAttr(CreateMap(\"slot\": \"activator\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("activator")}));
 //BA.debugLineNum = 575;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 576;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetStatic(b As Boolean) As VMDialog";
 //BA.debugLineNum = 72;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 73;BA.debugLine="Dialog.SetStatic(b)";
_dialog._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 74;BA.debugLine="Card.setstatic(b)";
_card._setstatic /*b4j.example.vmcard*/ (_b);
 //BA.debugLineNum = 75;BA.debugLine="Container.SetStatic(b)";
_container._setstatic /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub SetStyle(sm As Map) As VMDialog";
 //BA.debugLineNum = 275;BA.debugLine="Dialog.SetStyle(sm)";
_dialog._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 679;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 680;BA.debugLine="Dialog.SetStyleSingle(prop, value)";
_dialog._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 681;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 682;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 668;BA.debugLine="Sub SetTabIndex(ti As String) As VMDialog";
 //BA.debugLineNum = 669;BA.debugLine="Dialog.SetTabIndex(ti)";
_dialog._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 670;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 671;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetText(t As Object) As VMDialog";
 //BA.debugLineNum = 252;BA.debugLine="Dialog.SetText(t)";
_dialog._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 703;BA.debugLine="Sub SetTextColor(varColor As String) As VMDialog";
 //BA.debugLineNum = 704;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 705;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 706;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 707;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 708;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 711;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 712;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 713;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 714;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 715;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 716;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 717;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 718;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _settitle(String _stitle) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetTitle(sTitle As String) As VMDialog";
 //BA.debugLineNum = 120;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 121;BA.debugLine="Title.SetText(sTitle)";
_title._settext /*b4j.example.vmcardtitle*/ (_stitle);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 124;BA.debugLine="vue.SetStateSingle(titleKey, sTitle)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_titlekey,(Object)(_stitle));
 //BA.debugLineNum = 125;BA.debugLine="Title.SetText($\"{{ ${titleKey} }}\"$)";
_title._settext /*b4j.example.vmcardtitle*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_titlekey))+" }}"));
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _settitleprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetTitlePrimary(b As Boolean) As VMDialog";
 //BA.debugLineNum = 212;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 213;BA.debugLine="Card.Title.SetAttrSingle(\"primary-title\", True)";
_card._title /*b4j.example.vmcardtitle*/ ._setattrsingle /*b4j.example.vmcardtitle*/ ("primary-title",BA.ObjectToString(__c.True));
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _settransition(String _vartransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 541;BA.debugLine="Sub SetTransition(varTransition As String) As VMDi";
 //BA.debugLineNum = 542;BA.debugLine="If varTransition = \"\" Then Return Me";
if ((_vartransition).equals("")) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 543;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 544;BA.debugLine="SetAttrSingle(\"transition\", varTransition)";
_setattrsingle("transition",_vartransition);
 //BA.debugLineNum = 545;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 547;BA.debugLine="Dim pp As String = $\"${ID}Transition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Transition");
 //BA.debugLineNum = 548;BA.debugLine="vue.SetStateSingle(pp, varTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartransition));
 //BA.debugLineNum = 549;BA.debugLine="Dialog.Bind(\":transition\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":transition",_pp);
 //BA.debugLineNum = 550;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 551;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setvalue(boolean _varvalue) throws Exception{
 //BA.debugLineNum = 554;BA.debugLine="Sub SetValue(varValue As Boolean) As VMDialog";
 //BA.debugLineNum = 555;BA.debugLine="Dialog.SetValue(varValue, False)";
_dialog._setvalue /*b4j.example.vmelement*/ (BA.ObjectToString(_varvalue),__c.False);
 //BA.debugLineNum = 556;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 557;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetVIf(vif As String) As VMDialog";
 //BA.debugLineNum = 229;BA.debugLine="Dialog.SetVIf(vif)";
_dialog._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetVModel(k As String) As VMDialog";
 //BA.debugLineNum = 223;BA.debugLine="smodel = k";
_smodel = _k;
 //BA.debugLineNum = 224;BA.debugLine="Dialog.SetVModel(k)";
_dialog._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub SetVShow(vif As String) As VMDialog";
 //BA.debugLineNum = 234;BA.debugLine="Dialog.SetVShow(vif)";
_dialog._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setwidth(String _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 560;BA.debugLine="Sub SetWidth(varWidth As String) As VMDialog";
 //BA.debugLineNum = 561;BA.debugLine="If varWidth = \"\" Then Return Me";
if ((_varwidth).equals("")) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 562;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 563;BA.debugLine="SetAttrSingle(\"width\", varWidth)";
_setattrsingle("width",_varwidth);
 //BA.debugLineNum = 564;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 };
 //BA.debugLineNum = 566;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 567;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varwidth));
 //BA.debugLineNum = 568;BA.debugLine="Dialog.Bind(\":width\", pp)";
_dialog._bind /*b4j.example.vmelement*/ (":width",_pp);
 //BA.debugLineNum = 569;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 570;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _show() throws Exception{
 //BA.debugLineNum = 620;BA.debugLine="Sub Show As VMDialog";
 //BA.debugLineNum = 621;BA.debugLine="Container.SetDefaults";
_container._setdefaults /*String*/ ();
 //BA.debugLineNum = 622;BA.debugLine="vue.SetStateSingle(smodel, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_smodel,(Object)(__c.True));
 //BA.debugLineNum = 623;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 624;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 218;BA.debugLine="Card.Pop(Dialog)";
_card._pop /*String*/ (_dialog);
 //BA.debugLineNum = 219;BA.debugLine="Return Dialog.tostring";
if (true) return _dialog._tostring /*String*/ ();
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdialog  _updatetitle(String _stitle) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub UpdateTitle(sTitle As String) As VMDialog";
 //BA.debugLineNum = 141;BA.debugLine="vue.SetStateSingle(titleKey, sTitle)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_titlekey,(Object)(_stitle));
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 152;BA.debugLine="Sub UseTheme(themeName As String) As VMDialog";
 //BA.debugLineNum = 153;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 154;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 155;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 156;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 157;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public String  _validate() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub Validate";
 //BA.debugLineNum = 60;BA.debugLine="Card.Form.validate";
_card._form /*b4j.example.vmform*/ ._validate /*String*/ ();
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
