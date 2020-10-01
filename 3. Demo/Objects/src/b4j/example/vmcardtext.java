package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcardtext extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmcardtext", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcardtext.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _cardtext = null;
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
public b4j.example.vmcardtext  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 133;BA.debugLine="Sub AddChild(child As VMElement) As VMCardText";
 //BA.debugLineNum = 134;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 135;BA.debugLine="CardText.SetText(childHTML)";
_cardtext._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 136;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 172;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 173;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 174;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardtext  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub AddClass(c As String) As VMCardText";
 //BA.debugLineNum = 155;BA.debugLine="CardText.AddClass(c)";
_cardtext._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _addcontent(String _scontent) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub AddContent(scontent As String) As VMCardText";
 //BA.debugLineNum = 55;BA.debugLine="If scontent = \"\" Then Return Me";
if ((_scontent).equals("")) { 
if (true) return (b4j.example.vmcardtext)(this);};
 //BA.debugLineNum = 56;BA.debugLine="SetText(scontent)";
_settext(_scontent);
 //BA.debugLineNum = 57;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _adddivider() throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub AddDivider As VMCardText";
 //BA.debugLineNum = 74;BA.debugLine="CardText.AddDivider";
_cardtext._adddivider /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 75;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _addelement(String _elid,String _eltag,String _eltext,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses) throws Exception{
b4j.example.vmelement _d = null;
 //BA.debugLineNum = 26;BA.debugLine="Sub AddElement(elID As String, elTag As String, el";
 //BA.debugLineNum = 27;BA.debugLine="Dim d As VMElement";
_d = new b4j.example.vmelement();
 //BA.debugLineNum = 28;BA.debugLine="d.Initialize(vue,elID).SetDesignMode(DesignMode).";
_d._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid)._setdesignmode /*b4j.example.vmelement*/ (_designmode)._settag /*b4j.example.vmelement*/ (_eltag);
 //BA.debugLineNum = 29;BA.debugLine="d.SetText(elText)";
_d._settext /*b4j.example.vmelement*/ (_eltext);
 //BA.debugLineNum = 30;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, Null)";
_d._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 31;BA.debugLine="SetText(d.ToString)";
_settext(_d._tostring /*String*/ ());
 //BA.debugLineNum = 32;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _addspacer() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub AddSpacer As VMCardText";
 //BA.debugLineNum = 62;BA.debugLine="CardText.AddSpacer";
_cardtext._addspacer /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 63;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 202;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 203;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 253;BA.debugLine="CardText.BuildModel(mprops, mstyles, lclasses, loo";
_cardtext._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public CardText As VMElement";
_cardtext = new b4j.example.vmelement();
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
public b4j.example.vmcardtext  _disable() throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub Disable As VMCardText";
 //BA.debugLineNum = 195;BA.debugLine="CardText.Disable(True)";
_cardtext._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _enable() throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub Enable As VMCardText";
 //BA.debugLineNum = 190;BA.debugLine="CardText.Enable(True)";
_cardtext._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _hide() throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub Hide As VMCardText";
 //BA.debugLineNum = 180;BA.debugLine="CardText.SetVisible(False)";
_cardtext._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="CardText.Initialize(v, ID)";
_cardtext._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 17;BA.debugLine="CardText.SetTag(\"v-card-text\")";
_cardtext._settag /*b4j.example.vmelement*/ ("v-card-text");
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
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 150;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardtext  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="public Sub RemoveAttr(sName As String) As VMCardTe";
 //BA.debugLineNum = 209;BA.debugLine="CardText.RemoveAttr(sName)";
_cardtext._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub Render";
 //BA.debugLineNum = 129;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardtext  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetAttr(attr As Map) As VMCardText";
 //BA.debugLineNum = 161;BA.debugLine="CardText.SetAttr(attr)";
_cardtext._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 47;BA.debugLine="Sub SetAttributes(attrs As List) As VMCardText";
 //BA.debugLineNum = 48;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 49;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetAttrLoose(loose As String) As VMCardText";
 //BA.debugLineNum = 43;BA.debugLine="CardText.SetAttrLoose(loose)";
_cardtext._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 248;BA.debugLine="CardText.SetAttrSingle(prop, value)";
_cardtext._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _setcolor(String _varcolor) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetColor(varColor As String) As VMCardText";
 //BA.debugLineNum = 92;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcardtext)(this);};
 //BA.debugLineNum = 93;BA.debugLine="AddClass(varColor)";
_addclass(_varcolor);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 98;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 99;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmcardtext)(this);};
 //BA.debugLineNum = 100;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 101;BA.debugLine="AddClass(scolor)";
_addclass(_scolor);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 68;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMCardText";
 //BA.debugLineNum = 225;BA.debugLine="CardText.SetDesignMode(b)";
_cardtext._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 226;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Sub SetMarginAll(p As String) As VMCardText";
 //BA.debugLineNum = 220;BA.debugLine="CardText.setmarginall(p)";
_cardtext._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 237;BA.debugLine="CardText.SetName(varName, bbind)";
_cardtext._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub SetPaddingAll(p As String) As VMCardText";
 //BA.debugLineNum = 215;BA.debugLine="CardText.SetPaddingAll(p)";
_cardtext._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetStatic(b As Boolean) As VMCardText";
 //BA.debugLineNum = 37;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 38;BA.debugLine="CardText.SetStatic(b)";
_cardtext._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetStyle(sm As Map) As VMCardText";
 //BA.debugLineNum = 167;BA.debugLine="CardText.SetStyle(sm)";
_cardtext._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 243;BA.debugLine="CardText.SetStyleSingle(prop, value)";
_cardtext._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetTabIndex(ti As String) As VMCardText";
 //BA.debugLineNum = 231;BA.debugLine="CardText.SetTabIndex(ti)";
_cardtext._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _settext(String _t) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetText(t As String) As VMCardText";
 //BA.debugLineNum = 142;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmcardtext)(this);};
 //BA.debugLineNum = 143;BA.debugLine="CardText.SetText(t)";
_cardtext._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 144;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 263;BA.debugLine="Sub SetTextColor(varColor As String) As VMCardText";
 //BA.debugLineNum = 264;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 265;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _settextcolorintensity(String _textcolor,String _textintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 270;BA.debugLine="Sub SetTextColorIntensity(textcolor As String, tex";
 //BA.debugLineNum = 271;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmcardtext)(this);};
 //BA.debugLineNum = 272;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 273;BA.debugLine="Dim sIntensity As String = $\"text--${textintensit";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_textintensity))+"");
 //BA.debugLineNum = 274;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 275;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetVIf(vif As String) As VMCardText";
 //BA.debugLineNum = 118;BA.debugLine="CardText.SetVIf(vif)";
_cardtext._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub SetVisible(b As Boolean) As VMCardText";
 //BA.debugLineNum = 258;BA.debugLine="CardText.SetVisible(b)";
_cardtext._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetVModel(k As String) As VMCardText";
 //BA.debugLineNum = 113;BA.debugLine="CardText.SetVModel(k)";
_cardtext._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetVShow(vif As String) As VMCardText";
 //BA.debugLineNum = 123;BA.debugLine="CardText.SetVShow(vif)";
_cardtext._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardtext  _show() throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub Show As VMCardText";
 //BA.debugLineNum = 185;BA.debugLine="CardText.SetVisible(True)";
_cardtext._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 109;BA.debugLine="Return CardText.ToString";
if (true) return _cardtext._tostring /*String*/ ();
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardtext  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 80;BA.debugLine="Sub UseTheme(themeName As String) As VMCardText";
 //BA.debugLineNum = 81;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 82;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 83;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 84;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 85;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardtext)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
