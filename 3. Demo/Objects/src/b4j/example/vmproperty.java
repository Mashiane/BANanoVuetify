package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmproperty extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmproperty", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmproperty.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmexpansionpanels _expnl = null;
public String _id = "";
public Object _module = null;
public b4j.example.bananovue _vue = null;
public boolean _designmode = false;
public anywheresoftware.b4a.objects.collections.Map _controls = null;
public anywheresoftware.b4a.objects.collections.List _fields = null;
public com.ab.banano.BANano _banano = null;
public anywheresoftware.b4a.objects.collections.List _booleans = null;
public anywheresoftware.b4a.objects.collections.List _strings = null;
public anywheresoftware.b4a.objects.collections.List _integers = null;
public anywheresoftware.b4a.objects.collections.List _doubles = null;
public anywheresoftware.b4a.objects.collections.List _dates = null;
public anywheresoftware.b4a.objects.collections.Map _defaults = null;
public anywheresoftware.b4a.objects.collections.Map _labels = null;
public String _sshow = "";
public b4j.example.vmcontainer _contchecks = null;
public boolean _haschecks = false;
public String _changeevent = "";
public anywheresoftware.b4a.objects.collections.List _btext = null;
public anywheresoftware.b4a.objects.collections.List _stext = null;
public anywheresoftware.b4a.objects.collections.List _contentitems = null;
public anywheresoftware.b4a.objects.collections.Map _itemtypes = null;
public boolean _istable = false;
public anywheresoftware.b4a.objects.collections.Map _internalitemtype = null;
public anywheresoftware.b4a.objects.collections.Map _internalitemtypeoptions = null;
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
public static class _propcontrols{
public boolean IsInitialized;
public String vmodel;
public String value;
public String text;
public String typeOf;
public Object module;
public String methodName;
public String text1;
public String vmodel1;
public String iconName;
public int MinValue;
public int MaxValue;
public String sourceName;
public anywheresoftware.b4a.objects.collections.Map options;
public String sourcefield;
public String displayfield;
public String sourceName1;
public anywheresoftware.b4a.objects.collections.Map options1;
public String sourcefield1;
public String displayfield1;
public anywheresoftware.b4a.objects.collections.List OptionsList;
public b4j.example.vmcontainer cont;
public boolean horizontal;
public void Initialize() {
IsInitialized = true;
vmodel = "";
value = "";
text = "";
typeOf = "";
module = new Object();
methodName = "";
text1 = "";
vmodel1 = "";
iconName = "";
MinValue = 0;
MaxValue = 0;
sourceName = "";
options = new anywheresoftware.b4a.objects.collections.Map();
sourcefield = "";
displayfield = "";
sourceName1 = "";
options1 = new anywheresoftware.b4a.objects.collections.Map();
sourcefield1 = "";
displayfield1 = "";
OptionsList = new anywheresoftware.b4a.objects.collections.List();
cont = new b4j.example.vmcontainer();
horizontal = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public b4j.example.vmproperty  _addbooleans(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 225;BA.debugLine="Sub AddBooleans(i As List) As VMProperty";
 //BA.debugLineNum = 226;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 227;BA.debugLine="Booleans.Add(s)";
_booleans.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public String  _addbutton(String _parent,String _btnid,String _btntext,String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 418;BA.debugLine="Sub AddButton(parent As String, btnID As String, b";
 //BA.debugLineNum = 419;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 420;BA.debugLine="btnID = btnID.tolowercase";
_btnid = _btnid.toLowerCase();
 //BA.debugLineNum = 421;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 422;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 423;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 424;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 426;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 429;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 430;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 431;BA.debugLine="nc.vmodel = \"\"";
_nc.vmodel /*String*/  = "";
 //BA.debugLineNum = 432;BA.debugLine="nc.text = btnText";
_nc.text /*String*/  = _btntext;
 //BA.debugLineNum = 433;BA.debugLine="nc.value = btnID";
_nc.value /*String*/  = _btnid;
 //BA.debugLineNum = 434;BA.debugLine="nc.typeOf = \"button\"";
_nc.typeOf /*String*/  = "button";
 //BA.debugLineNum = 435;BA.debugLine="nc.module = module";
_nc.module /*Object*/  = _module;
 //BA.debugLineNum = 436;BA.debugLine="nc.methodName = methodName";
_nc.methodName /*String*/  = _methodname;
 //BA.debugLineNum = 437;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 438;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return "";
}
public String  _addcarouselitems(String _parent) throws Exception{
 //BA.debugLineNum = 540;BA.debugLine="Sub AddCarouselItems(parent As String)";
 //BA.debugLineNum = 541;BA.debugLine="AddCrudList(parent, CreateMap(\"key\":\"Item Key\",\"a";
_addcrudlist(_parent,__c.createMap(new Object[] {(Object)("key"),(Object)("Item Key"),(Object)("avatar"),(Object)("Src"),(Object)("title"),(Object)("Title")}));
 //BA.debugLineNum = 542;BA.debugLine="End Sub";
return "";
}
public String  _addcheck(String _parent,String _vmodel,String _text,boolean _bvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 912;BA.debugLine="Sub AddCheck(parent As String, vModel As String, t";
 //BA.debugLineNum = 913;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 914;BA.debugLine="vModel = vModel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 915;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 916;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 917;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 918;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 920;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 922;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 923;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 924;BA.debugLine="nc.vmodel = vModel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 925;BA.debugLine="nc.text = text";
_nc.text /*String*/  = _text;
 //BA.debugLineNum = 926;BA.debugLine="nc.value = bvalue";
_nc.value /*String*/  = BA.ObjectToString(_bvalue);
 //BA.debugLineNum = 927;BA.debugLine="nc.typeOf = \"checkbox\"";
_nc.typeOf /*String*/  = "checkbox";
 //BA.debugLineNum = 928;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 929;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 930;BA.debugLine="fields.Add(vModel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 931;BA.debugLine="Booleans.Add(vModel)";
_booleans.Add((Object)(_vmodel));
 //BA.debugLineNum = 932;BA.debugLine="defaults.Put(vModel,bvalue)";
_defaults.Put((Object)(_vmodel),(Object)(_bvalue));
 //BA.debugLineNum = 933;BA.debugLine="End Sub";
return "";
}
public String  _addcheck1(b4j.example.vmcontainer _pcont,int _r,int _c,String _k,String _v) throws Exception{
b4j.example.vmcheckbox _chk = null;
 //BA.debugLineNum = 2496;BA.debugLine="Sub AddCheck1(pcont As VMContainer, r As Int, c As";
 //BA.debugLineNum = 2497;BA.debugLine="Dim chk As VMCheckBox = BuildCheckBox(k, v)";
_chk = _buildcheckbox(_k,_v);
 //BA.debugLineNum = 2498;BA.debugLine="chk.SetOnChange(Me, \"RaiseChangeEvent\")";
_chk._setonchange /*b4j.example.vmcheckbox*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2499;BA.debugLine="bText.Add(k)";
_btext.Add((Object)(_k));
 //BA.debugLineNum = 2500;BA.debugLine="pcont.AddControlS(chk.CheckBox, chk.ToString, r,";
_pcont._addcontrols /*String*/ (_chk._checkbox /*b4j.example.vmelement*/ ,_chk._tostring /*String*/ (),BA.NumberToString(_r),BA.NumberToString(_c),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 2501;BA.debugLine="End Sub";
return "";
}
public String  _addcheck2(int _r,int _c,String _k,String _v) throws Exception{
b4j.example.vmcheckbox _chk = null;
 //BA.debugLineNum = 2510;BA.debugLine="Sub AddCheck2(r As Int, c As Int, k As String, v A";
 //BA.debugLineNum = 2511;BA.debugLine="Dim chk As VMCheckBox = BuildCheckBox(k, v)";
_chk = _buildcheckbox(_k,_v);
 //BA.debugLineNum = 2512;BA.debugLine="chk.SetOnChange(Me, \"RaiseChangeEvent\")";
_chk._setonchange /*b4j.example.vmcheckbox*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2513;BA.debugLine="bText.Add(k)";
_btext.Add((Object)(_k));
 //BA.debugLineNum = 2514;BA.debugLine="contChecks.AddControlS(chk.CheckBox, chk.ToString";
_contchecks._addcontrols /*String*/ (_chk._checkbox /*b4j.example.vmelement*/ ,_chk._tostring /*String*/ (),BA.NumberToString(_r),BA.NumberToString(_c),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 2515;BA.debugLine="hasChecks = True";
_haschecks = __c.True;
 //BA.debugLineNum = 2516;BA.debugLine="End Sub";
return "";
}
public String  _addcontainer(String _parent,b4j.example.vmcontainer _cont) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 467;BA.debugLine="Sub AddContainer(parent As String, cont As VMConta";
 //BA.debugLineNum = 468;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 469;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 470;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 471;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 472;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 474;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 476;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 477;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 478;BA.debugLine="nc.vmodel = cont.id";
_nc.vmodel /*String*/  = _cont._id /*String*/ ;
 //BA.debugLineNum = 479;BA.debugLine="nc.text = \"\"";
_nc.text /*String*/  = "";
 //BA.debugLineNum = 480;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 481;BA.debugLine="nc.typeOf = \"container\"";
_nc.typeOf /*String*/  = "container";
 //BA.debugLineNum = 482;BA.debugLine="nc.cont = cont";
_nc.cont /*b4j.example.vmcontainer*/  = _cont;
 //BA.debugLineNum = 483;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 484;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 485;BA.debugLine="End Sub";
return "";
}
public String  _addcrudlist(String _parent,anywheresoftware.b4a.objects.collections.Map _options) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 608;BA.debugLine="Sub AddCrudList(parent As String, options As Map)";
 //BA.debugLineNum = 609;BA.debugLine="itemtypes.Initialize";
_itemtypes.Initialize();
 //BA.debugLineNum = 610;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 611;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 612;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 613;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 614;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 616;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 619;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 620;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 621;BA.debugLine="nc.vmodel = \"items\"";
_nc.vmodel /*String*/  = "items";
 //BA.debugLineNum = 622;BA.debugLine="nc.text = \"table\"";
_nc.text /*String*/  = "table";
 //BA.debugLineNum = 623;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 624;BA.debugLine="nc.typeOf = \"table\"";
_nc.typeOf /*String*/  = "table";
 //BA.debugLineNum = 625;BA.debugLine="nc.options = options";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/  = _options;
 //BA.debugLineNum = 626;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 627;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 628;BA.debugLine="End Sub";
return "";
}
public String  _adddatatablecolumns(String _parent) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 544;BA.debugLine="Sub AddDataTableColumns(parent As String)";
 //BA.debugLineNum = 545;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 546;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 547;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 548;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 549;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 551;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 554;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 555;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 556;BA.debugLine="nc.vmodel = \"dtcolumns\"";
_nc.vmodel /*String*/  = "dtcolumns";
 //BA.debugLineNum = 557;BA.debugLine="nc.text = \"dtcolumns\"";
_nc.text /*String*/  = "dtcolumns";
 //BA.debugLineNum = 558;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 559;BA.debugLine="nc.typeOf = \"dtcolumns\"";
_nc.typeOf /*String*/  = "dtcolumns";
 //BA.debugLineNum = 560;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 561;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 562;BA.debugLine="End Sub";
return "";
}
public String  _adddatepicker(String _parent,String _vmodel,String _text,String _vvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 935;BA.debugLine="Sub AddDatePicker(parent As String, vModel As Stri";
 //BA.debugLineNum = 936;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 937;BA.debugLine="vModel = vModel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 938;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 939;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 940;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 941;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 943;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 946;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 947;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 948;BA.debugLine="nc.vmodel = vModel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 949;BA.debugLine="nc.text = text";
_nc.text /*String*/  = _text;
 //BA.debugLineNum = 950;BA.debugLine="nc.value = vValue";
_nc.value /*String*/  = _vvalue;
 //BA.debugLineNum = 951;BA.debugLine="nc.typeOf = \"datepicker\"";
_nc.typeOf /*String*/  = "datepicker";
 //BA.debugLineNum = 952;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 953;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 954;BA.debugLine="fields.Add(vModel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 955;BA.debugLine="Strings.Add(vModel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 956;BA.debugLine="defaults.Put(vModel,vValue)";
_defaults.Put((Object)(_vmodel),(Object)(_vvalue));
 //BA.debugLineNum = 957;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _adddates(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 239;BA.debugLine="Sub AddDates(i As List) As VMProperty";
 //BA.debugLineNum = 240;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 241;BA.debugLine="Dates.Add(s)";
_dates.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public String  _adddesignerproperties(String _parent) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 585;BA.debugLine="Sub AddDesignerProperties(parent As String)";
 //BA.debugLineNum = 586;BA.debugLine="itemtypes.Initialize";
_itemtypes.Initialize();
 //BA.debugLineNum = 587;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 588;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 589;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 590;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 591;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 593;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 596;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 597;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 598;BA.debugLine="nc.vmodel = \"items\"";
_nc.vmodel /*String*/  = "items";
 //BA.debugLineNum = 599;BA.debugLine="nc.text = \"table\"";
_nc.text /*String*/  = "table";
 //BA.debugLineNum = 600;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 601;BA.debugLine="nc.typeOf = \"designerproperty\"";
_nc.typeOf /*String*/  = "designerproperty";
 //BA.debugLineNum = 602;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 603;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 604;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _adddoubles(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 232;BA.debugLine="Sub AddDoubles(i As List) As VMProperty";
 //BA.debugLineNum = 233;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 234;BA.debugLine="Doubles.Add(s)";
_doubles.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public String  _addemail(String _parent,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
 //BA.debugLineNum = 867;BA.debugLine="Sub AddEmail(parent As String, vModel As String, v";
 //BA.debugLineNum = 868;BA.debugLine="AddInput(parent, \"email\", vModel, vText, vIcon, v";
_addinput(_parent,"email",_vmodel,_vtext,_vicon,_vvalue);
 //BA.debugLineNum = 869;BA.debugLine="Strings.Add(vModel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 870;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _addheading(String _sectname,String _sectheading) throws Exception{
anywheresoftware.b4a.objects.collections.List _items = null;
 //BA.debugLineNum = 791;BA.debugLine="Sub AddHeading(sectName As String, sectHeading As";
 //BA.debugLineNum = 792;BA.debugLine="sectName = sectName.tolowercase";
_sectname = _sectname.toLowerCase();
 //BA.debugLineNum = 793;BA.debugLine="labels.Put(sectName, sectHeading)";
_labels.Put((Object)(_sectname),(Object)(_sectheading));
 //BA.debugLineNum = 795;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 796;BA.debugLine="items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 797;BA.debugLine="controls.Put(sectName, items)";
_controls.Put((Object)(_sectname),(Object)(_items.getObject()));
 //BA.debugLineNum = 798;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 799;BA.debugLine="End Sub";
return null;
}
public String  _addheightwidths(String _parent) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 487;BA.debugLine="Sub AddHeightWidths(parent As String)";
 //BA.debugLineNum = 488;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 489;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 490;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 491;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 492;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 494;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 497;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 498;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 499;BA.debugLine="nc.vmodel = \"widths\"";
_nc.vmodel /*String*/  = "widths";
 //BA.debugLineNum = 500;BA.debugLine="nc.text = \"Widths\"";
_nc.text /*String*/  = "Widths";
 //BA.debugLineNum = 501;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 502;BA.debugLine="nc.typeOf = \"widths\"";
_nc.typeOf /*String*/  = "widths";
 //BA.debugLineNum = 503;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 504;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 505;BA.debugLine="fields.Add(\"width\")";
_fields.Add((Object)("width"));
 //BA.debugLineNum = 506;BA.debugLine="fields.Add(\"minwidth\")";
_fields.Add((Object)("minwidth"));
 //BA.debugLineNum = 507;BA.debugLine="fields.Add(\"maxwidth\")";
_fields.Add((Object)("maxwidth"));
 //BA.debugLineNum = 509;BA.debugLine="fields.Add(\"height\")";
_fields.Add((Object)("height"));
 //BA.debugLineNum = 510;BA.debugLine="fields.Add(\"minheight\")";
_fields.Add((Object)("minheight"));
 //BA.debugLineNum = 511;BA.debugLine="fields.Add(\"maxheight\")";
_fields.Add((Object)("maxheight"));
 //BA.debugLineNum = 513;BA.debugLine="Strings.Add(\"height\")";
_strings.Add((Object)("height"));
 //BA.debugLineNum = 514;BA.debugLine="Strings.Add(\"minheight\")";
_strings.Add((Object)("minheight"));
 //BA.debugLineNum = 515;BA.debugLine="Strings.Add(\"maxheight\")";
_strings.Add((Object)("maxheight"));
 //BA.debugLineNum = 517;BA.debugLine="Strings.Add(\"width\")";
_strings.Add((Object)("width"));
 //BA.debugLineNum = 518;BA.debugLine="Strings.Add(\"minwidth\")";
_strings.Add((Object)("minwidth"));
 //BA.debugLineNum = 519;BA.debugLine="Strings.Add(\"maxwidth\")";
_strings.Add((Object)("maxwidth"));
 //BA.debugLineNum = 521;BA.debugLine="defaults.Put(\"width\",\"\")";
_defaults.Put((Object)("width"),(Object)(""));
 //BA.debugLineNum = 522;BA.debugLine="defaults.Put(\"minwidth\",\"\")";
_defaults.Put((Object)("minwidth"),(Object)(""));
 //BA.debugLineNum = 523;BA.debugLine="defaults.Put(\"maxwidth\",\"\")";
_defaults.Put((Object)("maxwidth"),(Object)(""));
 //BA.debugLineNum = 524;BA.debugLine="defaults.Put(\"height\",\"\")";
_defaults.Put((Object)("height"),(Object)(""));
 //BA.debugLineNum = 525;BA.debugLine="defaults.Put(\"minheight\",\"\")";
_defaults.Put((Object)("minheight"),(Object)(""));
 //BA.debugLineNum = 526;BA.debugLine="defaults.Put(\"maxheight\",\"\")";
_defaults.Put((Object)("maxheight"),(Object)(""));
 //BA.debugLineNum = 528;BA.debugLine="sText.add(\"width\")";
_stext.Add((Object)("width"));
 //BA.debugLineNum = 529;BA.debugLine="sText.add(\"minwidth\")";
_stext.Add((Object)("minwidth"));
 //BA.debugLineNum = 530;BA.debugLine="sText.add(\"maxwidth\")";
_stext.Add((Object)("maxwidth"));
 //BA.debugLineNum = 531;BA.debugLine="sText.add(\"height\")";
_stext.Add((Object)("height"));
 //BA.debugLineNum = 532;BA.debugLine="sText.add(\"minheight\")";
_stext.Add((Object)("minheight"));
 //BA.debugLineNum = 533;BA.debugLine="sText.add(\"maxheight\")";
_stext.Add((Object)("maxheight"));
 //BA.debugLineNum = 534;BA.debugLine="End Sub";
return "";
}
public String  _addiconbutton(String _parent,String _btnid,String _btnicon,String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 825;BA.debugLine="Sub AddIconButton(parent As String, btnID As Strin";
 //BA.debugLineNum = 826;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 827;BA.debugLine="btnID = btnID.tolowercase";
_btnid = _btnid.toLowerCase();
 //BA.debugLineNum = 828;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 829;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 830;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 831;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 833;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 836;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 837;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 838;BA.debugLine="nc.iconName = btnIcon";
_nc.iconName /*String*/  = _btnicon;
 //BA.debugLineNum = 839;BA.debugLine="nc.value = btnID";
_nc.value /*String*/  = _btnid;
 //BA.debugLineNum = 840;BA.debugLine="nc.typeOf = \"iconbutton\"";
_nc.typeOf /*String*/  = "iconbutton";
 //BA.debugLineNum = 841;BA.debugLine="nc.module = module";
_nc.module /*Object*/  = _module;
 //BA.debugLineNum = 842;BA.debugLine="nc.methodName = methodName";
_nc.methodName /*String*/  = _methodname;
 //BA.debugLineNum = 843;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 844;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 845;BA.debugLine="End Sub";
return "";
}
public String  _addinput(String _parent,String _typeof,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 877;BA.debugLine="private Sub AddInput(parent As String, typeOf As S";
 //BA.debugLineNum = 878;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 879;BA.debugLine="vModel = vModel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 880;BA.debugLine="sText.Add(vModel)";
_stext.Add((Object)(_vmodel));
 //BA.debugLineNum = 881;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 882;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 883;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 884;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 886;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 889;BA.debugLine="Select Case typeOf";
switch (BA.switchObjectToInt(_typeof,"number","tel")) {
case 0: 
case 1: {
 //BA.debugLineNum = 891;BA.debugLine="If vValue = \"\" Then vValue = \"0\"";
if ((_vvalue).equals("")) { 
_vvalue = "0";};
 //BA.debugLineNum = 892;BA.debugLine="vValue = BANano.parseInt(vValue)";
_vvalue = BA.NumberToString(_banano.parseInt((Object)(_vvalue)));
 break; }
}
;
 //BA.debugLineNum = 894;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 895;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 896;BA.debugLine="nc.vmodel = vModel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 897;BA.debugLine="nc.text = vText";
_nc.text /*String*/  = _vtext;
 //BA.debugLineNum = 898;BA.debugLine="nc.value = vValue";
_nc.value /*String*/  = _vvalue;
 //BA.debugLineNum = 899;BA.debugLine="nc.typeOf = typeOf";
_nc.typeOf /*String*/  = _typeof;
 //BA.debugLineNum = 900;BA.debugLine="nc.iconName = vIcon";
_nc.iconName /*String*/  = _vicon;
 //BA.debugLineNum = 901;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 902;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 903;BA.debugLine="fields.Add(vModel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 904;BA.debugLine="defaults.Put(vModel,vValue)";
_defaults.Put((Object)(_vmodel),(Object)(_vvalue));
 //BA.debugLineNum = 905;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _addintegers(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 211;BA.debugLine="Sub AddIntegers(i As List) As VMProperty";
 //BA.debugLineNum = 212;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 213;BA.debugLine="Integers.Add(s)";
_integers.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public String  _additem() throws Exception{
 //BA.debugLineNum = 1120;BA.debugLine="Sub AddItem";
 //BA.debugLineNum = 1121;BA.debugLine="ClearContents";
_clearcontents();
 //BA.debugLineNum = 1122;BA.debugLine="End Sub";
return "";
}
public String  _addlabel(String _parent,String _vmodel,String _txt) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 769;BA.debugLine="Sub AddLabel(parent As String, vmodel As String, t";
 //BA.debugLineNum = 770;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 771;BA.debugLine="vmodel = vmodel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 772;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 773;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 774;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 775;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 777;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 780;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 781;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 782;BA.debugLine="nc.vmodel = vmodel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 783;BA.debugLine="nc.text = txt";
_nc.text /*String*/  = _txt;
 //BA.debugLineNum = 784;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 785;BA.debugLine="nc.typeOf = \"label\"";
_nc.typeOf /*String*/  = "label";
 //BA.debugLineNum = 786;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 787;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 788;BA.debugLine="End Sub";
return "";
}
public String  _addmarginspaddings(String _parent) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub AddMarginsPaddings(parent As String)";
 //BA.debugLineNum = 256;BA.debugLine="AddText2(parent, CreateMap(\"margintop\":\"MT\",\"marg";
_addtext2(_parent,__c.createMap(new Object[] {(Object)("margintop"),(Object)("MT"),(Object)("marginbottom"),(Object)("MB"),(Object)("marginleft"),(Object)("ML"),(Object)("marginright"),(Object)("MR")}));
 //BA.debugLineNum = 257;BA.debugLine="AddText2(parent, CreateMap(\"margins\":\"MS\",\"margin";
_addtext2(_parent,__c.createMap(new Object[] {(Object)("margins"),(Object)("MS"),(Object)("margine"),(Object)("ME"),(Object)("marginx"),(Object)("MX"),(Object)("marginy"),(Object)("MY")}));
 //BA.debugLineNum = 258;BA.debugLine="AddText2(parent, CreateMap(\"paddingtop\":\"PT\",\"pad";
_addtext2(_parent,__c.createMap(new Object[] {(Object)("paddingtop"),(Object)("PT"),(Object)("paddingbottom"),(Object)("PB"),(Object)("paddingleft"),(Object)("PL"),(Object)("paddingright"),(Object)("PR")}));
 //BA.debugLineNum = 259;BA.debugLine="AddText2(parent, CreateMap(\"paddings\":\"PS\",\"paddi";
_addtext2(_parent,__c.createMap(new Object[] {(Object)("paddings"),(Object)("PS"),(Object)("paddinge"),(Object)("PE"),(Object)("paddingx"),(Object)("PX"),(Object)("paddingy"),(Object)("PY")}));
 //BA.debugLineNum = 260;BA.debugLine="AddText2(parent, CreateMap(\"margina\":\"MA\",\"paddin";
_addtext2(_parent,__c.createMap(new Object[] {(Object)("margina"),(Object)("MA"),(Object)("paddinga"),(Object)("PA")}));
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return "";
}
public String  _addmatrix(String _parent) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 707;BA.debugLine="Sub AddMatrix(parent As String)";
 //BA.debugLineNum = 708;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 709;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 710;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 711;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 712;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 714;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 717;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 718;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 719;BA.debugLine="nc.vmodel = \"sizes\"";
_nc.vmodel /*String*/  = "sizes";
 //BA.debugLineNum = 720;BA.debugLine="nc.text = \"Sizes\"";
_nc.text /*String*/  = "Sizes";
 //BA.debugLineNum = 721;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 722;BA.debugLine="nc.typeOf = \"sizes\"";
_nc.typeOf /*String*/  = "sizes";
 //BA.debugLineNum = 723;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 724;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 725;BA.debugLine="fields.Add(\"row\")";
_fields.Add((Object)("row"));
 //BA.debugLineNum = 726;BA.debugLine="fields.Add(\"col\")";
_fields.Add((Object)("col"));
 //BA.debugLineNum = 727;BA.debugLine="fields.Add(\"offsetsmall\")";
_fields.Add((Object)("offsetsmall"));
 //BA.debugLineNum = 728;BA.debugLine="fields.Add(\"offsetmedium\")";
_fields.Add((Object)("offsetmedium"));
 //BA.debugLineNum = 729;BA.debugLine="fields.Add(\"offsetlarge\")";
_fields.Add((Object)("offsetlarge"));
 //BA.debugLineNum = 730;BA.debugLine="fields.Add(\"offsetxlarge\")";
_fields.Add((Object)("offsetxlarge"));
 //BA.debugLineNum = 732;BA.debugLine="Integers.Add(\"offsetsmall\")";
_integers.Add((Object)("offsetsmall"));
 //BA.debugLineNum = 733;BA.debugLine="Integers.Add(\"offsetmedium\")";
_integers.Add((Object)("offsetmedium"));
 //BA.debugLineNum = 734;BA.debugLine="Integers.Add(\"offsetlarge\")";
_integers.Add((Object)("offsetlarge"));
 //BA.debugLineNum = 735;BA.debugLine="Integers.Add(\"offsetxlarge\")";
_integers.Add((Object)("offsetxlarge"));
 //BA.debugLineNum = 737;BA.debugLine="defaults.Put(\"offsetsmall\",0)";
_defaults.Put((Object)("offsetsmall"),(Object)(0));
 //BA.debugLineNum = 738;BA.debugLine="defaults.Put(\"offsetmedium\",0)";
_defaults.Put((Object)("offsetmedium"),(Object)(0));
 //BA.debugLineNum = 739;BA.debugLine="defaults.Put(\"offsetlarge\",0)";
_defaults.Put((Object)("offsetlarge"),(Object)(0));
 //BA.debugLineNum = 740;BA.debugLine="defaults.Put(\"offsetxlarge\",0)";
_defaults.Put((Object)("offsetxlarge"),(Object)(0));
 //BA.debugLineNum = 742;BA.debugLine="fields.Add(\"sizesmall\")";
_fields.Add((Object)("sizesmall"));
 //BA.debugLineNum = 743;BA.debugLine="fields.Add(\"sizemedium\")";
_fields.Add((Object)("sizemedium"));
 //BA.debugLineNum = 744;BA.debugLine="fields.Add(\"sizelarge\")";
_fields.Add((Object)("sizelarge"));
 //BA.debugLineNum = 745;BA.debugLine="fields.Add(\"sizexlarge\")";
_fields.Add((Object)("sizexlarge"));
 //BA.debugLineNum = 747;BA.debugLine="Integers.Add(\"row\")";
_integers.Add((Object)("row"));
 //BA.debugLineNum = 748;BA.debugLine="Integers.Add(\"col\")";
_integers.Add((Object)("col"));
 //BA.debugLineNum = 749;BA.debugLine="Integers.Add(\"sizesmall\")";
_integers.Add((Object)("sizesmall"));
 //BA.debugLineNum = 750;BA.debugLine="Integers.Add(\"sizemedium\")";
_integers.Add((Object)("sizemedium"));
 //BA.debugLineNum = 751;BA.debugLine="Integers.Add(\"sizelarge\")";
_integers.Add((Object)("sizelarge"));
 //BA.debugLineNum = 752;BA.debugLine="Integers.Add(\"sizexlarge\")";
_integers.Add((Object)("sizexlarge"));
 //BA.debugLineNum = 754;BA.debugLine="defaults.put(\"row\",1)";
_defaults.Put((Object)("row"),(Object)(1));
 //BA.debugLineNum = 755;BA.debugLine="defaults.put(\"col\",1)";
_defaults.Put((Object)("col"),(Object)(1));
 //BA.debugLineNum = 756;BA.debugLine="defaults.Put(\"sizesmall\",12)";
_defaults.Put((Object)("sizesmall"),(Object)(12));
 //BA.debugLineNum = 757;BA.debugLine="defaults.Put(\"sizemedium\",12)";
_defaults.Put((Object)("sizemedium"),(Object)(12));
 //BA.debugLineNum = 758;BA.debugLine="defaults.Put(\"sizelarge\",12)";
_defaults.Put((Object)("sizelarge"),(Object)(12));
 //BA.debugLineNum = 759;BA.debugLine="defaults.Put(\"sizexlarge\",12)";
_defaults.Put((Object)("sizexlarge"),(Object)(12));
 //BA.debugLineNum = 761;BA.debugLine="sText.Add(\"row\")";
_stext.Add((Object)("row"));
 //BA.debugLineNum = 762;BA.debugLine="sText.Add(\"col\")";
_stext.Add((Object)("col"));
 //BA.debugLineNum = 763;BA.debugLine="sText.Add(\"sizesmall\")";
_stext.Add((Object)("sizesmall"));
 //BA.debugLineNum = 764;BA.debugLine="sText.Add(\"sizemedium\")";
_stext.Add((Object)("sizemedium"));
 //BA.debugLineNum = 765;BA.debugLine="sText.Add(\"sizelarge\")";
_stext.Add((Object)("sizelarge"));
 //BA.debugLineNum = 766;BA.debugLine="sText.Add(\"sizexlarge\")";
_stext.Add((Object)("sizexlarge"));
 //BA.debugLineNum = 767;BA.debugLine="End Sub";
return "";
}
public String  _addmenuitems(String _parent) throws Exception{
 //BA.debugLineNum = 536;BA.debugLine="Sub AddMenuItems(parent As String)";
 //BA.debugLineNum = 537;BA.debugLine="AddCrudList(parent, CreateMap(\"key\":\"Item Key\",\"a";
_addcrudlist(_parent,__c.createMap(new Object[] {(Object)("key"),(Object)("Item Key"),(Object)("avatar"),(Object)("Avatar"),(Object)("icon"),(Object)("Icon Name"),(Object)("iconcolor"),(Object)("Icon Color"),(Object)("title"),(Object)("Title"),(Object)("subtitle"),(Object)("Sub Title"),(Object)("action"),(Object)("Action Icon")}));
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return "";
}
public String  _addnumber(String _parent,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
 //BA.debugLineNum = 862;BA.debugLine="Sub AddNumber(parent As String, vModel As String,";
 //BA.debugLineNum = 863;BA.debugLine="AddInput(parent, \"number\", vModel, vText, vIcon,";
_addinput(_parent,"number",_vmodel,_vtext,_vicon,_vvalue);
 //BA.debugLineNum = 864;BA.debugLine="Integers.Add(vModel)";
_integers.Add((Object)(_vmodel));
 //BA.debugLineNum = 865;BA.debugLine="End Sub";
return "";
}
public String  _addpassword(String _parent,String _vmodel,String _vtext,String _vvalue) throws Exception{
 //BA.debugLineNum = 847;BA.debugLine="Sub AddPassword(parent As String, vModel As String";
 //BA.debugLineNum = 848;BA.debugLine="AddInput(parent, \"password\", vModel, vText, \"\", v";
_addinput(_parent,"password",_vmodel,_vtext,"",_vvalue);
 //BA.debugLineNum = 849;BA.debugLine="Strings.Add(vModel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 850;BA.debugLine="End Sub";
return "";
}
public String  _addradiogroup(String _parent,String _vmodel,String _vtext,anywheresoftware.b4a.objects.collections.Map _options) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
String _sourcename = "";
String _sourcefield = "";
String _displayfield = "";
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 984;BA.debugLine="Sub AddRadioGroup(parent As String, vmodel As Stri";
 //BA.debugLineNum = 985;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 986;BA.debugLine="vmodel = vmodel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 987;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 988;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 989;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 990;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 992;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 994;BA.debugLine="Dim sourceName As String = $\"${vmodel}items\"$";
_sourcename = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"items");
 //BA.debugLineNum = 995;BA.debugLine="Dim sourcefield As String = \"id\"";
_sourcefield = "id";
 //BA.debugLineNum = 996;BA.debugLine="Dim displayfield As String = \"text\"";
_displayfield = "text";
 //BA.debugLineNum = 998;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 999;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 1000;BA.debugLine="nc.vmodel = vmodel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 1001;BA.debugLine="nc.text = vText";
_nc.text /*String*/  = _vtext;
 //BA.debugLineNum = 1002;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 1003;BA.debugLine="nc.typeOf = \"radiogroup\"";
_nc.typeOf /*String*/  = "radiogroup";
 //BA.debugLineNum = 1004;BA.debugLine="nc.sourceName = sourceName";
_nc.sourceName /*String*/  = _sourcename;
 //BA.debugLineNum = 1005;BA.debugLine="nc.options = options";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/  = _options;
 //BA.debugLineNum = 1006;BA.debugLine="nc.sourcefield = sourcefield";
_nc.sourcefield /*String*/  = _sourcefield;
 //BA.debugLineNum = 1007;BA.debugLine="nc.displayfield = displayfield";
_nc.displayfield /*String*/  = _displayfield;
 //BA.debugLineNum = 1008;BA.debugLine="nc.horizontal = False";
_nc.horizontal /*boolean*/  = __c.False;
 //BA.debugLineNum = 1009;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 1010;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 1011;BA.debugLine="fields.Add(vmodel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 1012;BA.debugLine="Strings.Add(vmodel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 1013;BA.debugLine="defaults.Put(vmodel,\"\")";
_defaults.Put((Object)(_vmodel),(Object)(""));
 //BA.debugLineNum = 1014;BA.debugLine="End Sub";
return "";
}
public String  _addradiogrouph(String _parent,String _vmodel,String _vtext,anywheresoftware.b4a.objects.collections.Map _options) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
String _sourcename = "";
String _sourcefield = "";
String _displayfield = "";
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 1016;BA.debugLine="Sub AddRadioGroupH(parent As String, vmodel As Str";
 //BA.debugLineNum = 1017;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 1018;BA.debugLine="vmodel = vmodel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 1019;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 1020;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1021;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 1022;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 1024;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 1026;BA.debugLine="Dim sourceName As String = $\"${vmodel}items\"$";
_sourcename = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"items");
 //BA.debugLineNum = 1027;BA.debugLine="Dim sourcefield As String = \"id\"";
_sourcefield = "id";
 //BA.debugLineNum = 1028;BA.debugLine="Dim displayfield As String = \"text\"";
_displayfield = "text";
 //BA.debugLineNum = 1030;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 1031;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 1032;BA.debugLine="nc.vmodel = vmodel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 1033;BA.debugLine="nc.text = vText";
_nc.text /*String*/  = _vtext;
 //BA.debugLineNum = 1034;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 1035;BA.debugLine="nc.typeOf = \"radiogroup\"";
_nc.typeOf /*String*/  = "radiogroup";
 //BA.debugLineNum = 1036;BA.debugLine="nc.sourceName = sourceName";
_nc.sourceName /*String*/  = _sourcename;
 //BA.debugLineNum = 1037;BA.debugLine="nc.options = options";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/  = _options;
 //BA.debugLineNum = 1038;BA.debugLine="nc.sourcefield = sourcefield";
_nc.sourcefield /*String*/  = _sourcefield;
 //BA.debugLineNum = 1039;BA.debugLine="nc.displayfield = displayfield";
_nc.displayfield /*String*/  = _displayfield;
 //BA.debugLineNum = 1040;BA.debugLine="nc.horizontal = True";
_nc.horizontal /*boolean*/  = __c.True;
 //BA.debugLineNum = 1041;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 1042;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 1043;BA.debugLine="fields.Add(vmodel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 1044;BA.debugLine="Strings.Add(vmodel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 1045;BA.debugLine="defaults.Put(vmodel,\"\")";
_defaults.Put((Object)(_vmodel),(Object)(""));
 //BA.debugLineNum = 1046;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _addselect(String _parent,String _vmodel,String _vtext,anywheresoftware.b4a.objects.collections.Map _options) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
String _sourcename = "";
String _sourcefield = "";
String _displayfield = "";
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 264;BA.debugLine="Sub AddSelect(parent As String, vmodel As String,";
 //BA.debugLineNum = 265;BA.debugLine="vmodel = vmodel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 266;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 267;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 268;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 269;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 270;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 272;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 274;BA.debugLine="Dim sourceName As String = $\"${vmodel}items\"$";
_sourcename = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"items");
 //BA.debugLineNum = 275;BA.debugLine="Dim sourcefield As String = \"id\"";
_sourcefield = "id";
 //BA.debugLineNum = 276;BA.debugLine="Dim displayfield As String = \"text\"";
_displayfield = "text";
 //BA.debugLineNum = 278;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 279;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 280;BA.debugLine="nc.vmodel = vmodel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 281;BA.debugLine="nc.text = vText";
_nc.text /*String*/  = _vtext;
 //BA.debugLineNum = 282;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 283;BA.debugLine="nc.typeOf = \"selectbox\"";
_nc.typeOf /*String*/  = "selectbox";
 //BA.debugLineNum = 284;BA.debugLine="nc.sourceName = sourceName";
_nc.sourceName /*String*/  = _sourcename;
 //BA.debugLineNum = 285;BA.debugLine="nc.options = options";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/  = _options;
 //BA.debugLineNum = 286;BA.debugLine="nc.sourcefield = sourcefield";
_nc.sourcefield /*String*/  = _sourcefield;
 //BA.debugLineNum = 287;BA.debugLine="nc.displayfield = displayfield";
_nc.displayfield /*String*/  = _displayfield;
 //BA.debugLineNum = 288;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 289;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 290;BA.debugLine="fields.Add(vmodel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 291;BA.debugLine="Strings.Add(vmodel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 292;BA.debugLine="defaults.Put(vmodel,\"\")";
_defaults.Put((Object)(_vmodel),(Object)(""));
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _addselect1(String _parent,String _vmodel,String _vtext,String _source,String _keyfield,String _valuefield) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 327;BA.debugLine="Sub AddSelect1(parent As String, vmodel As String,";
 //BA.debugLineNum = 328;BA.debugLine="vmodel = vmodel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 329;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 330;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 331;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 332;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 333;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 335;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 338;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 339;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 340;BA.debugLine="nc.vmodel = vmodel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 341;BA.debugLine="nc.text = vText";
_nc.text /*String*/  = _vtext;
 //BA.debugLineNum = 342;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 343;BA.debugLine="nc.typeOf = \"selectbox1\"";
_nc.typeOf /*String*/  = "selectbox1";
 //BA.debugLineNum = 344;BA.debugLine="nc.sourceName = source";
_nc.sourceName /*String*/  = _source;
 //BA.debugLineNum = 345;BA.debugLine="nc.sourcefield = keyField";
_nc.sourcefield /*String*/  = _keyfield;
 //BA.debugLineNum = 346;BA.debugLine="nc.displayfield = valueField";
_nc.displayfield /*String*/  = _valuefield;
 //BA.debugLineNum = 347;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 348;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 349;BA.debugLine="fields.Add(vmodel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 350;BA.debugLine="Strings.Add(vmodel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 351;BA.debugLine="defaults.Put(vmodel,\"\")";
_defaults.Put((Object)(_vmodel),(Object)(""));
 //BA.debugLineNum = 352;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _addselect2(String _parent,String _vmodel,String _vtext,anywheresoftware.b4a.objects.collections.Map _options,String _vmodel1,String _vtext1,anywheresoftware.b4a.objects.collections.Map _options1) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
String _sourcename = "";
String _sourcename1 = "";
String _sourcefield = "";
String _displayfield = "";
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 659;BA.debugLine="Sub AddSelect2(parent As String, vmodel As String,";
 //BA.debugLineNum = 660;BA.debugLine="vmodel = vmodel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 661;BA.debugLine="vmodel1 = vmodel1.tolowercase";
_vmodel1 = _vmodel1.toLowerCase();
 //BA.debugLineNum = 662;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 663;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 664;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 665;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 666;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 668;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 671;BA.debugLine="Dim sourceName As String = $\"${vmodel}items\"$";
_sourcename = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"items");
 //BA.debugLineNum = 672;BA.debugLine="Dim sourceName1 As String = $\"${vmodel1}items\"$";
_sourcename1 = (""+__c.SmartStringFormatter("",(Object)(_vmodel1))+"items");
 //BA.debugLineNum = 673;BA.debugLine="Dim sourcefield As String = \"id\"";
_sourcefield = "id";
 //BA.debugLineNum = 674;BA.debugLine="Dim displayfield As String = \"text\"";
_displayfield = "text";
 //BA.debugLineNum = 676;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 677;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 678;BA.debugLine="nc.vmodel = vmodel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 679;BA.debugLine="nc.vmodel1 = vmodel1";
_nc.vmodel1 /*String*/  = _vmodel1;
 //BA.debugLineNum = 680;BA.debugLine="nc.text = vText";
_nc.text /*String*/  = _vtext;
 //BA.debugLineNum = 681;BA.debugLine="nc.text1 = vText1";
_nc.text1 /*String*/  = _vtext1;
 //BA.debugLineNum = 682;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 683;BA.debugLine="nc.typeOf = \"select2\"";
_nc.typeOf /*String*/  = "select2";
 //BA.debugLineNum = 684;BA.debugLine="nc.sourceName = sourceName";
_nc.sourceName /*String*/  = _sourcename;
 //BA.debugLineNum = 685;BA.debugLine="nc.options = options";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/  = _options;
 //BA.debugLineNum = 686;BA.debugLine="nc.sourcefield = sourcefield";
_nc.sourcefield /*String*/  = _sourcefield;
 //BA.debugLineNum = 687;BA.debugLine="nc.displayfield = displayfield";
_nc.displayfield /*String*/  = _displayfield;
 //BA.debugLineNum = 689;BA.debugLine="nc.sourceName1 = sourceName1";
_nc.sourceName1 /*String*/  = _sourcename1;
 //BA.debugLineNum = 690;BA.debugLine="nc.options1 = options1";
_nc.options1 /*anywheresoftware.b4a.objects.collections.Map*/  = _options1;
 //BA.debugLineNum = 691;BA.debugLine="nc.sourcefield1 = sourcefield";
_nc.sourcefield1 /*String*/  = _sourcefield;
 //BA.debugLineNum = 692;BA.debugLine="nc.displayfield1 = displayfield";
_nc.displayfield1 /*String*/  = _displayfield;
 //BA.debugLineNum = 694;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 695;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 696;BA.debugLine="fields.Add(vmodel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 697;BA.debugLine="Strings.Add(vmodel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 698;BA.debugLine="defaults.Put(vmodel,\"\")";
_defaults.Put((Object)(_vmodel),(Object)(""));
 //BA.debugLineNum = 700;BA.debugLine="fields.Add(vmodel1)";
_fields.Add((Object)(_vmodel1));
 //BA.debugLineNum = 701;BA.debugLine="Strings.Add(vmodel1)";
_strings.Add((Object)(_vmodel1));
 //BA.debugLineNum = 702;BA.debugLine="defaults.Put(vmodel1,\"\")";
_defaults.Put((Object)(_vmodel1),(Object)(""));
 //BA.debugLineNum = 703;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 704;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _addselectds(String _parent,String _vmodel,String _vtext,String _source,String _keyfield,String _valuefield,String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 297;BA.debugLine="Sub AddSelectDS(parent As String, vmodel As String";
 //BA.debugLineNum = 298;BA.debugLine="vmodel = vmodel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 299;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 300;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 301;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 302;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 303;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 305;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 308;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 309;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 310;BA.debugLine="nc.vmodel = vmodel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 311;BA.debugLine="nc.text = vText";
_nc.text /*String*/  = _vtext;
 //BA.debugLineNum = 312;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 313;BA.debugLine="nc.typeOf = \"selectboxds\"";
_nc.typeOf /*String*/  = "selectboxds";
 //BA.debugLineNum = 314;BA.debugLine="nc.sourceName = source";
_nc.sourceName /*String*/  = _source;
 //BA.debugLineNum = 315;BA.debugLine="nc.sourcefield = keyField";
_nc.sourcefield /*String*/  = _keyfield;
 //BA.debugLineNum = 316;BA.debugLine="nc.displayfield = valueField";
_nc.displayfield /*String*/  = _valuefield;
 //BA.debugLineNum = 317;BA.debugLine="nc.methodName = methodName";
_nc.methodName /*String*/  = _methodname;
 //BA.debugLineNum = 318;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 319;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 320;BA.debugLine="fields.Add(vmodel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 321;BA.debugLine="Strings.Add(vmodel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 322;BA.debugLine="defaults.Put(vmodel,\"\")";
_defaults.Put((Object)(_vmodel),(Object)(""));
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _addselectm(String _parent,String _vmodel,String _vtext,anywheresoftware.b4a.objects.collections.Map _options) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
String _sourcename = "";
String _sourcefield = "";
String _displayfield = "";
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 357;BA.debugLine="Sub AddSelectM(parent As String, vmodel As String,";
 //BA.debugLineNum = 358;BA.debugLine="vmodel = vmodel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 359;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 360;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 361;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 362;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 363;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 365;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 367;BA.debugLine="Dim sourceName As String = $\"${vmodel}items\"$";
_sourcename = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"items");
 //BA.debugLineNum = 368;BA.debugLine="Dim sourcefield As String = \"id\"";
_sourcefield = "id";
 //BA.debugLineNum = 369;BA.debugLine="Dim displayfield As String = \"text\"";
_displayfield = "text";
 //BA.debugLineNum = 371;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 372;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 373;BA.debugLine="nc.vmodel = vmodel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 374;BA.debugLine="nc.text = vText";
_nc.text /*String*/  = _vtext;
 //BA.debugLineNum = 375;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 376;BA.debugLine="nc.typeOf = \"selectboxm\"";
_nc.typeOf /*String*/  = "selectboxm";
 //BA.debugLineNum = 377;BA.debugLine="nc.sourceName = sourceName";
_nc.sourceName /*String*/  = _sourcename;
 //BA.debugLineNum = 378;BA.debugLine="nc.options = options";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/  = _options;
 //BA.debugLineNum = 379;BA.debugLine="nc.sourcefield = sourcefield";
_nc.sourcefield /*String*/  = _sourcefield;
 //BA.debugLineNum = 380;BA.debugLine="nc.displayfield = displayfield";
_nc.displayfield /*String*/  = _displayfield;
 //BA.debugLineNum = 381;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 382;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 383;BA.debugLine="fields.Add(vmodel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 384;BA.debugLine="Strings.Add(vmodel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 385;BA.debugLine="defaults.Put(vmodel,\"\")";
_defaults.Put((Object)(_vmodel),(Object)(""));
 //BA.debugLineNum = 386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return null;
}
public String  _addslider(String _parent,String _vmodel,String _label,int _minvalue,int _maxvalue,int _value) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 441;BA.debugLine="Sub AddSlider(parent As String, vmodel As String,";
 //BA.debugLineNum = 442;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 443;BA.debugLine="vmodel = vmodel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 444;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 445;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 446;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 447;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 449;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 452;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 453;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 454;BA.debugLine="nc.vmodel = vmodel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 455;BA.debugLine="nc.text = Label";
_nc.text /*String*/  = _label;
 //BA.debugLineNum = 456;BA.debugLine="nc.value = value";
_nc.value /*String*/  = BA.NumberToString(_value);
 //BA.debugLineNum = 457;BA.debugLine="nc.typeOf = \"slider\"";
_nc.typeOf /*String*/  = "slider";
 //BA.debugLineNum = 458;BA.debugLine="nc.MinValue = minValue";
_nc.MinValue /*int*/  = _minvalue;
 //BA.debugLineNum = 459;BA.debugLine="nc.MaxValue = maxValue";
_nc.MaxValue /*int*/  = _maxvalue;
 //BA.debugLineNum = 460;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 461;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 462;BA.debugLine="fields.Add(vmodel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 463;BA.debugLine="Integers.Add(vmodel)";
_integers.Add((Object)(_vmodel));
 //BA.debugLineNum = 464;BA.debugLine="defaults.Put(vmodel,value)";
_defaults.Put((Object)(_vmodel),(Object)(_value));
 //BA.debugLineNum = 465;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _addstrings(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 218;BA.debugLine="Sub AddStrings(i As List) As VMProperty";
 //BA.debugLineNum = 219;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 220;BA.debugLine="Strings.Add(s)";
_strings.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public String  _addswitch(String _parent,String _vmodel,String _text,boolean _bvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 802;BA.debugLine="Sub AddSwitch(parent As String, vModel As String,";
 //BA.debugLineNum = 803;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 804;BA.debugLine="vModel = vModel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 805;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 806;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 807;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 808;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 810;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 812;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 813;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 814;BA.debugLine="nc.vmodel = vModel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 815;BA.debugLine="nc.text = text";
_nc.text /*String*/  = _text;
 //BA.debugLineNum = 816;BA.debugLine="nc.value = bValue";
_nc.value /*String*/  = BA.ObjectToString(_bvalue);
 //BA.debugLineNum = 817;BA.debugLine="nc.typeOf = \"switch\"";
_nc.typeOf /*String*/  = "switch";
 //BA.debugLineNum = 818;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 819;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 820;BA.debugLine="fields.Add(vModel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 821;BA.debugLine="Booleans.Add(vModel)";
_booleans.Add((Object)(_vmodel));
 //BA.debugLineNum = 822;BA.debugLine="defaults.Put(vModel,bValue)";
_defaults.Put((Object)(_vmodel),(Object)(_bvalue));
 //BA.debugLineNum = 823;BA.debugLine="End Sub";
return "";
}
public String  _addswitch1(b4j.example.vmcontainer _pcont,int _r,int _c,String _k,String _v) throws Exception{
b4j.example.vmcheckbox _chk = null;
 //BA.debugLineNum = 2503;BA.debugLine="Sub AddSwitch1(pcont As VMContainer, r As Int, c A";
 //BA.debugLineNum = 2504;BA.debugLine="Dim chk As VMCheckBox = BuildSwitch(k, v)";
_chk = _buildswitch(_k,_v);
 //BA.debugLineNum = 2505;BA.debugLine="chk.SetOnChange(Me, \"RaiseChangeEvent\")";
_chk._setonchange /*b4j.example.vmcheckbox*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2506;BA.debugLine="bText.Add(k)";
_btext.Add((Object)(_k));
 //BA.debugLineNum = 2507;BA.debugLine="pcont.AddControlS(chk.CheckBox, chk.ToString, r,";
_pcont._addcontrols /*String*/ (_chk._checkbox /*b4j.example.vmelement*/ ,_chk._tostring /*String*/ (),BA.NumberToString(_r),BA.NumberToString(_c),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 2508;BA.debugLine="End Sub";
return "";
}
public String  _addswitch2(int _r,int _c,String _k,String _v) throws Exception{
b4j.example.vmcheckbox _chk = null;
 //BA.debugLineNum = 2518;BA.debugLine="Sub AddSwitch2(r As Int, c As Int, k As String, v";
 //BA.debugLineNum = 2519;BA.debugLine="Dim chk As VMCheckBox = BuildSwitch(k, v)";
_chk = _buildswitch(_k,_v);
 //BA.debugLineNum = 2520;BA.debugLine="chk.SetOnChange(Me, \"RaiseChangeEvent\")";
_chk._setonchange /*b4j.example.vmcheckbox*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2521;BA.debugLine="bText.Add(k)";
_btext.Add((Object)(_k));
 //BA.debugLineNum = 2522;BA.debugLine="contChecks.AddControlS(chk.CheckBox, chk.ToString";
_contchecks._addcontrols /*String*/ (_chk._checkbox /*b4j.example.vmelement*/ ,_chk._tostring /*String*/ (),BA.NumberToString(_r),BA.NumberToString(_c),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 2523;BA.debugLine="hasChecks = True";
_haschecks = __c.True;
 //BA.debugLineNum = 2524;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcheckbox  _addswitcha(String _tid,String _tvmodel,String _tlabel) throws Exception{
b4j.example.vmcheckbox _sw = null;
 //BA.debugLineNum = 2466;BA.debugLine="Sub AddSwitchA(tID As String, tvModel As String, t";
 //BA.debugLineNum = 2467;BA.debugLine="Dim sw As VMCheckBox";
_sw = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 2468;BA.debugLine="sw.Initialize(vue, tID, module)";
_sw._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,_tid,_module);
 //BA.debugLineNum = 2469;BA.debugLine="sw.SetStatic(True)";
_sw._setstatic /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 2470;BA.debugLine="sw.SetVModel(tvModel)";
_sw._setvmodel /*b4j.example.vmcheckbox*/ (_tvmodel);
 //BA.debugLineNum = 2471;BA.debugLine="sw.SetSwitch";
_sw._setswitch /*b4j.example.vmcheckbox*/ ();
 //BA.debugLineNum = 2472;BA.debugLine="sw.Setlabel(tLabel)";
_sw._setlabel /*b4j.example.vmcheckbox*/ (_tlabel);
 //BA.debugLineNum = 2473;BA.debugLine="sw.SetTrueValue(\"Yes\")";
_sw._settruevalue /*b4j.example.vmcheckbox*/ ("Yes");
 //BA.debugLineNum = 2474;BA.debugLine="sw.SetFalseValue(\"No\")";
_sw._setfalsevalue /*b4j.example.vmcheckbox*/ ("No");
 //BA.debugLineNum = 2475;BA.debugLine="sw.SetHideDetails(True)";
_sw._sethidedetails /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 2476;BA.debugLine="sw.SetFieldType(\"string\")";
_sw._setfieldtype /*b4j.example.vmcheckbox*/ ("string");
 //BA.debugLineNum = 2477;BA.debugLine="sw.RemoveAttr(\"ref\")";
_sw._removeattr /*b4j.example.vmcheckbox*/ ("ref");
 //BA.debugLineNum = 2478;BA.debugLine="sw.SetDense(True)";
_sw._setdense /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 2479;BA.debugLine="sw.SetInset(True)";
_sw._setinset /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 2480;BA.debugLine="sw.AddClass(\"my-1\")";
_sw._addclass /*b4j.example.vmcheckbox*/ ("my-1");
 //BA.debugLineNum = 2481;BA.debugLine="vue.SetData(tvModel, \"No\")";
_vue._setdata /*b4j.example.bananovue*/ (_tvmodel,(Object)("No"));
 //BA.debugLineNum = 2482;BA.debugLine="Return sw";
if (true) return _sw;
 //BA.debugLineNum = 2483;BA.debugLine="End Sub";
return null;
}
public String  _addswitches(String _parent,anywheresoftware.b4a.objects.collections.Map _options) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
String _k = "";
 //BA.debugLineNum = 2578;BA.debugLine="Sub AddSwitches(parent As String, options As Map)";
 //BA.debugLineNum = 2579;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 2580;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 2581;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2582;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 2583;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 2585;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 2588;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 2589;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 2590;BA.debugLine="nc.vmodel = \"switches\"";
_nc.vmodel /*String*/  = "switches";
 //BA.debugLineNum = 2591;BA.debugLine="nc.text = \"Switches\"";
_nc.text /*String*/  = "Switches";
 //BA.debugLineNum = 2592;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 2593;BA.debugLine="nc.typeOf = \"switches\"";
_nc.typeOf /*String*/  = "switches";
 //BA.debugLineNum = 2594;BA.debugLine="nc.options = options";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/  = _options;
 //BA.debugLineNum = 2595;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 2596;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 2598;BA.debugLine="For Each k As String In options.keys";
{
final anywheresoftware.b4a.BA.IterableList group18 = _options.Keys();
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_k = BA.ObjectToString(group18.Get(index18));
 //BA.debugLineNum = 2599;BA.debugLine="fields.Add(k)";
_fields.Add((Object)(_k));
 //BA.debugLineNum = 2600;BA.debugLine="defaults.Put(k, \"No\")";
_defaults.Put((Object)(_k),(Object)("No"));
 //BA.debugLineNum = 2601;BA.debugLine="sText.Add(k)";
_stext.Add((Object)(_k));
 //BA.debugLineNum = 2602;BA.debugLine="Strings.Add(k)";
_strings.Add((Object)(_k));
 //BA.debugLineNum = 2603;BA.debugLine="vue.SetData(k, \"No\")";
_vue._setdata /*b4j.example.bananovue*/ (_k,(Object)("No"));
 }
};
 //BA.debugLineNum = 2605;BA.debugLine="End Sub";
return "";
}
public String  _addtel(String _parent,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
 //BA.debugLineNum = 857;BA.debugLine="Sub AddTel(parent As String, vModel As String, vTe";
 //BA.debugLineNum = 858;BA.debugLine="AddInput(parent, \"tel\", vModel, vText, vIcon, vVa";
_addinput(_parent,"tel",_vmodel,_vtext,_vicon,_vvalue);
 //BA.debugLineNum = 859;BA.debugLine="Integers.add(vModel)";
_integers.Add((Object)(_vmodel));
 //BA.debugLineNum = 860;BA.debugLine="End Sub";
return "";
}
public String  _addtext(String _parent,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
 //BA.debugLineNum = 852;BA.debugLine="Sub AddText(parent As String, vModel As String, vT";
 //BA.debugLineNum = 853;BA.debugLine="AddInput(parent, \"text\", vModel, vText, vIcon, vV";
_addinput(_parent,"text",_vmodel,_vtext,_vicon,_vvalue);
 //BA.debugLineNum = 854;BA.debugLine="Strings.add(vModel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 855;BA.debugLine="End Sub";
return "";
}
public String  _addtext2(String _parent,anywheresoftware.b4a.objects.collections.Map _options) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
String _k = "";
 //BA.debugLineNum = 630;BA.debugLine="Sub AddText2(parent As String, options As Map)";
 //BA.debugLineNum = 631;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 632;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 633;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 634;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 635;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 637;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 640;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 641;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 642;BA.debugLine="nc.vmodel = \"text2\"";
_nc.vmodel /*String*/  = "text2";
 //BA.debugLineNum = 643;BA.debugLine="nc.text = \"Text2\"";
_nc.text /*String*/  = "Text2";
 //BA.debugLineNum = 644;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 645;BA.debugLine="nc.typeOf = \"text2\"";
_nc.typeOf /*String*/  = "text2";
 //BA.debugLineNum = 646;BA.debugLine="nc.options = options";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/  = _options;
 //BA.debugLineNum = 647;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 648;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 650;BA.debugLine="For Each k As String In options.keys";
{
final anywheresoftware.b4a.BA.IterableList group18 = _options.Keys();
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_k = BA.ObjectToString(group18.Get(index18));
 //BA.debugLineNum = 651;BA.debugLine="fields.Add(k)";
_fields.Add((Object)(_k));
 //BA.debugLineNum = 652;BA.debugLine="defaults.Put(k, \"\")";
_defaults.Put((Object)(_k),(Object)(""));
 //BA.debugLineNum = 653;BA.debugLine="sText.Add(k)";
_stext.Add((Object)(_k));
 //BA.debugLineNum = 654;BA.debugLine="Strings.Add(k)";
_strings.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 656;BA.debugLine="End Sub";
return "";
}
public String  _addtextarea(String _parent,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
 //BA.debugLineNum = 872;BA.debugLine="Sub AddTextArea(parent As String, vModel As String";
 //BA.debugLineNum = 873;BA.debugLine="AddInput(parent, \"textarea\", vModel, vText, vIcon";
_addinput(_parent,"textarea",_vmodel,_vtext,_vicon,_vvalue);
 //BA.debugLineNum = 874;BA.debugLine="Strings.Add(vModel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 875;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtextfield  _addtextfield(String _tid,String _tvmodel,String _tlabel) throws Exception{
b4j.example.vmtextfield _t = null;
 //BA.debugLineNum = 2435;BA.debugLine="Sub AddTextField(tID As String, tVModel As String,";
 //BA.debugLineNum = 2436;BA.debugLine="Dim t As VMTextField";
_t = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2437;BA.debugLine="t.Initialize(vue, tID, module)";
_t._initialize /*b4j.example.vmtextfield*/ (ba,_vue,_tid,_module);
 //BA.debugLineNum = 2438;BA.debugLine="t.SetStatic(True)";
_t._setstatic /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2439;BA.debugLine="t.Setlabel(tLabel)";
_t._setlabel /*b4j.example.vmtextfield*/ (_tlabel);
 //BA.debugLineNum = 2440;BA.debugLine="t.SetVModel(tVModel)";
_t._setvmodel /*b4j.example.vmtextfield*/ (_tvmodel);
 //BA.debugLineNum = 2441;BA.debugLine="t.SetType(\"text\")";
_t._settype /*b4j.example.vmtextfield*/ ("text");
 //BA.debugLineNum = 2442;BA.debugLine="t.RemoveAttr(\"ref\")";
_t._removeattr /*b4j.example.vmtextfield*/ ("ref");
 //BA.debugLineNum = 2443;BA.debugLine="t.SetDense(True)";
_t._setdense /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2444;BA.debugLine="t.SetOutlined(True)";
_t._setoutlined /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2445;BA.debugLine="t.SetHideDetails(True)";
_t._sethidedetails /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2446;BA.debugLine="t.AddClass(\"my-1\")";
_t._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2447;BA.debugLine="Return t";
if (true) return _t;
 //BA.debugLineNum = 2448;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _addtextfielda(String _tid,String _tvmodel,String _tlabel) throws Exception{
b4j.example.vmtextfield _t = null;
 //BA.debugLineNum = 2450;BA.debugLine="Sub AddTextFieldA(tID As String, tVModel As String";
 //BA.debugLineNum = 2451;BA.debugLine="Dim t As VMTextField";
_t = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2452;BA.debugLine="t.Initialize(vue, tID, module)";
_t._initialize /*b4j.example.vmtextfield*/ (ba,_vue,_tid,_module);
 //BA.debugLineNum = 2453;BA.debugLine="t.SetStatic(True)";
_t._setstatic /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2454;BA.debugLine="t.Setlabel(tLabel)";
_t._setlabel /*b4j.example.vmtextfield*/ (_tlabel);
 //BA.debugLineNum = 2455;BA.debugLine="t.SetVModel(tVModel)";
_t._setvmodel /*b4j.example.vmtextfield*/ (_tvmodel);
 //BA.debugLineNum = 2456;BA.debugLine="t.SetType(\"text\")";
_t._settype /*b4j.example.vmtextfield*/ ("text");
 //BA.debugLineNum = 2457;BA.debugLine="t.RemoveAttr(\"ref\")";
_t._removeattr /*b4j.example.vmtextfield*/ ("ref");
 //BA.debugLineNum = 2458;BA.debugLine="t.SetDense(True)";
_t._setdense /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2459;BA.debugLine="t.SetOutlined(True)";
_t._setoutlined /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2460;BA.debugLine="t.SetHideDetails(True)";
_t._sethidedetails /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2461;BA.debugLine="t.SetTextArea";
_t._settextarea /*b4j.example.vmtextfield*/ ();
 //BA.debugLineNum = 2462;BA.debugLine="t.AddClass(\"my-1\")";
_t._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2463;BA.debugLine="Return t";
if (true) return _t;
 //BA.debugLineNum = 2464;BA.debugLine="End Sub";
return null;
}
public String  _addtimepicker(String _parent,String _vmodel,String _text,String _vvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 960;BA.debugLine="Sub AddTimePicker(parent As String, vModel As Stri";
 //BA.debugLineNum = 961;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 962;BA.debugLine="vModel = vModel.tolowercase";
_vmodel = _vmodel.toLowerCase();
 //BA.debugLineNum = 963;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 964;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 965;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 966;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 968;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 971;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 972;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 973;BA.debugLine="nc.vmodel = vModel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 974;BA.debugLine="nc.text = text";
_nc.text /*String*/  = _text;
 //BA.debugLineNum = 975;BA.debugLine="nc.value = vValue";
_nc.value /*String*/  = _vvalue;
 //BA.debugLineNum = 976;BA.debugLine="nc.typeOf = \"timepicker\"";
_nc.typeOf /*String*/  = "timepicker";
 //BA.debugLineNum = 977;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 978;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 979;BA.debugLine="fields.Add(vModel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 980;BA.debugLine="Strings.Add(vModel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 981;BA.debugLine="defaults.Put(vModel,vValue)";
_defaults.Put((Object)(_vmodel),(Object)(_vvalue));
 //BA.debugLineNum = 982;BA.debugLine="End Sub";
return "";
}
public String  _addtoolbaritems(String _parent) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 565;BA.debugLine="Sub AddToolbarItems(parent As String)";
 //BA.debugLineNum = 566;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 567;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 568;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 569;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 570;BA.debugLine="existing = controls.Get(parent)";
_existing = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 572;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 575;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 576;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 577;BA.debugLine="nc.vmodel = \"toolbaritems\"";
_nc.vmodel /*String*/  = "toolbaritems";
 //BA.debugLineNum = 578;BA.debugLine="nc.text = \"toolbaritems\"";
_nc.text /*String*/  = "toolbaritems";
 //BA.debugLineNum = 579;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 580;BA.debugLine="nc.typeOf = \"toolbaritems\"";
_nc.typeOf /*String*/  = "toolbaritems";
 //BA.debugLineNum = 581;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 582;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 583;BA.debugLine="End Sub";
return "";
}
public String  _btnaddmultiple_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 1063;BA.debugLine="Sub btnAddMultiple_click(e As BANanoEvent)";
 //BA.debugLineNum = 1064;BA.debugLine="If SubExists(module, \"btnaddmultiple_click\") Then";
if (__c.SubExists(ba,_module,"btnaddmultiple_click")) { 
 //BA.debugLineNum = 1065;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1066;BA.debugLine="BANano.CallSub(module, \"btnaddmultiple_click\", A";
_banano.CallSub(_module,"btnaddmultiple_click",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}));
 };
 //BA.debugLineNum = 1068;BA.debugLine="End Sub";
return "";
}
public String  _btnaddtable_click(com.ab.banano.BANanoEvent _e) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
String _k = "";
String _vmodel = "";
String _v = "";
 //BA.debugLineNum = 1071;BA.debugLine="Sub btnAddTable_click(e As BANanoEvent)";
 //BA.debugLineNum = 1072;BA.debugLine="ClearContents";
_clearcontents();
 //BA.debugLineNum = 1073;BA.debugLine="Dim m As Map = CreateMap()";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1074;BA.debugLine="m.Put(\"subtitle\", \"text\")";
_m.Put((Object)("subtitle"),(Object)("text"));
 //BA.debugLineNum = 1075;BA.debugLine="m.Put(\"colalign\", \"start\")";
_m.Put((Object)("colalign"),(Object)("start"));
 //BA.debugLineNum = 1076;BA.debugLine="m.Put(\"colcontroltype\", \"text\")";
_m.Put((Object)("colcontroltype"),(Object)("text"));
 //BA.debugLineNum = 1077;BA.debugLine="m.Put(\"coldatatype\", \"TEXT\")";
_m.Put((Object)("coldatatype"),(Object)("TEXT"));
 //BA.debugLineNum = 1078;BA.debugLine="m.Put(\"coloptionkeys\", \"1,2,3\")";
_m.Put((Object)("coloptionkeys"),(Object)("1,2,3"));
 //BA.debugLineNum = 1079;BA.debugLine="m.Put(\"coloptionvalues\", \"One,Two,Three\")";
_m.Put((Object)("coloptionvalues"),(Object)("One,Two,Three"));
 //BA.debugLineNum = 1080;BA.debugLine="m.Put(\"colforeignkey\", \"id\")";
_m.Put((Object)("colforeignkey"),(Object)("id"));
 //BA.debugLineNum = 1081;BA.debugLine="m.Put(\"colforeignvalue\", \"text\")";
_m.Put((Object)("colforeignvalue"),(Object)("text"));
 //BA.debugLineNum = 1082;BA.debugLine="m.Put(\"colforeigntable\", \"\")";
_m.Put((Object)("colforeigntable"),(Object)(""));
 //BA.debugLineNum = 1084;BA.debugLine="m.Put(\"colisautofocus\", \"No\")";
_m.Put((Object)("colisautofocus"),(Object)("No"));
 //BA.debugLineNum = 1085;BA.debugLine="m.Put(\"colishidedetails\",\"No\")";
_m.Put((Object)("colishidedetails"),(Object)("No"));
 //BA.debugLineNum = 1086;BA.debugLine="m.Put(\"colisdense\", \"No\")";
_m.Put((Object)("colisdense"),(Object)("No"));
 //BA.debugLineNum = 1087;BA.debugLine="m.Put(\"colnoduplicate\", \"No\")";
_m.Put((Object)("colnoduplicate"),(Object)("No"));
 //BA.debugLineNum = 1088;BA.debugLine="m.Put(\"colprimarykey\", \"No\")";
_m.Put((Object)("colprimarykey"),(Object)("No"));
 //BA.debugLineNum = 1089;BA.debugLine="m.Put(\"coldisplayvalue\", \"No\")";
_m.Put((Object)("coldisplayvalue"),(Object)("No"));
 //BA.debugLineNum = 1090;BA.debugLine="m.Put(\"colautoincrement\", \"No\")";
_m.Put((Object)("colautoincrement"),(Object)("No"));
 //BA.debugLineNum = 1091;BA.debugLine="m.Put(\"colislookup\", \"No\")";
_m.Put((Object)("colislookup"),(Object)("No"));
 //BA.debugLineNum = 1092;BA.debugLine="m.Put(\"colvisible\", \"Yes\")";
_m.Put((Object)("colvisible"),(Object)("Yes"));
 //BA.debugLineNum = 1093;BA.debugLine="m.Put(\"colactive\", \"Yes\")";
_m.Put((Object)("colactive"),(Object)("Yes"));
 //BA.debugLineNum = 1094;BA.debugLine="m.Put(\"colontable\", \"Yes\")";
_m.Put((Object)("colontable"),(Object)("Yes"));
 //BA.debugLineNum = 1095;BA.debugLine="m.Put(\"colindexed\", \"Yes\")";
_m.Put((Object)("colindexed"),(Object)("Yes"));
 //BA.debugLineNum = 1096;BA.debugLine="m.Put(\"colsortable\", \"Yes\")";
_m.Put((Object)("colsortable"),(Object)("Yes"));
 //BA.debugLineNum = 1097;BA.debugLine="m.Put(\"colrequired\", \"Yes\")";
_m.Put((Object)("colrequired"),(Object)("Yes"));
 //BA.debugLineNum = 1098;BA.debugLine="m.Put(\"colrow\", \"1\")";
_m.Put((Object)("colrow"),(Object)("1"));
 //BA.debugLineNum = 1099;BA.debugLine="m.Put(\"colcolumn\", \"1\")";
_m.Put((Object)("colcolumn"),(Object)("1"));
 //BA.debugLineNum = 1100;BA.debugLine="m.Put(\"coloffsetsmall\", \"0\")";
_m.Put((Object)("coloffsetsmall"),(Object)("0"));
 //BA.debugLineNum = 1101;BA.debugLine="m.Put(\"coloffsetmedium\", \"0\")";
_m.Put((Object)("coloffsetmedium"),(Object)("0"));
 //BA.debugLineNum = 1102;BA.debugLine="m.Put(\"coloffsetlarge\", \"0\")";
_m.Put((Object)("coloffsetlarge"),(Object)("0"));
 //BA.debugLineNum = 1103;BA.debugLine="m.Put(\"coloffsetxlarge\", \"0\")";
_m.Put((Object)("coloffsetxlarge"),(Object)("0"));
 //BA.debugLineNum = 1104;BA.debugLine="m.Put(\"colsizesmall\", \"12\")";
_m.Put((Object)("colsizesmall"),(Object)("12"));
 //BA.debugLineNum = 1105;BA.debugLine="m.Put(\"colsizemedium\", \"12\")";
_m.Put((Object)("colsizemedium"),(Object)("12"));
 //BA.debugLineNum = 1106;BA.debugLine="m.Put(\"colsizelarge\", \"12\")";
_m.Put((Object)("colsizelarge"),(Object)("12"));
 //BA.debugLineNum = 1107;BA.debugLine="m.Put(\"colsizexlarge\", \"12\")";
_m.Put((Object)("colsizexlarge"),(Object)("12"));
 //BA.debugLineNum = 1108;BA.debugLine="m.put(\"coluseoptions\",\"No\")";
_m.Put((Object)("coluseoptions"),(Object)("No"));
 //BA.debugLineNum = 1109;BA.debugLine="m.Put(\"colkeys\",\"1,2,3\")";
_m.Put((Object)("colkeys"),(Object)("1,2,3"));
 //BA.debugLineNum = 1110;BA.debugLine="m.Put(\"colvalues\",\"1,2,3\")";
_m.Put((Object)("colvalues"),(Object)("1,2,3"));
 //BA.debugLineNum = 1112;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group39 = _m.Keys();
final int groupLen39 = group39.getSize()
;int index39 = 0;
;
for (; index39 < groupLen39;index39++){
_k = BA.ObjectToString(group39.Get(index39));
 //BA.debugLineNum = 1113;BA.debugLine="Dim vmodel As String = $\"items${k}\"$";
_vmodel = ("items"+__c.SmartStringFormatter("",(Object)(_k))+"");
 //BA.debugLineNum = 1114;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 1115;BA.debugLine="vue.SetData(vmodel, v)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(_v));
 }
};
 //BA.debugLineNum = 1117;BA.debugLine="End Sub";
return "";
}
public String  _btndeleteitem_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 1199;BA.debugLine="Sub btnDeleteItem_click(e As BANanoEvent)";
 //BA.debugLineNum = 1200;BA.debugLine="DeleteItem";
_deleteitem();
 //BA.debugLineNum = 1201;BA.debugLine="End Sub";
return "";
}
public String  _btndeletetable_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 1232;BA.debugLine="Sub btnDeleteTable_click(e As BANanoEvent)";
 //BA.debugLineNum = 1233;BA.debugLine="DeleteItem";
_deleteitem();
 //BA.debugLineNum = 1234;BA.debugLine="End Sub";
return "";
}
public String  _btnempty_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 1226;BA.debugLine="Sub btnEmpty_click(e As BANanoEvent)";
 //BA.debugLineNum = 1227;BA.debugLine="vue.SetData(\"tableitems\", vue.NewList)";
_vue._setdata /*b4j.example.bananovue*/ ("tableitems",(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 1228;BA.debugLine="ClearContents";
_clearcontents();
 //BA.debugLineNum = 1229;BA.debugLine="BANano.CallSub(module, changeEvent, Null)";
_banano.CallSub(_module,_changeevent,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 1230;BA.debugLine="End Sub";
return "";
}
public String  _btnsaveitem_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 1124;BA.debugLine="Sub btnSaveItem_click(e As BANanoEvent)";
 //BA.debugLineNum = 1125;BA.debugLine="SaveItem";
_saveitem();
 //BA.debugLineNum = 1126;BA.debugLine="End Sub";
return "";
}
public String  _btnsavetable_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 1129;BA.debugLine="Sub btnSaveTable_click(e As BANanoEvent)";
 //BA.debugLineNum = 1130;BA.debugLine="SaveItem";
_saveitem();
 //BA.debugLineNum = 1131;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcheckbox  _buildcheckbox(String _k,String _v) throws Exception{
b4j.example.vmcheckbox _chk = null;
 //BA.debugLineNum = 2541;BA.debugLine="private Sub BuildCheckBox(k As String, v As String";
 //BA.debugLineNum = 2542;BA.debugLine="Dim chk As VMCheckBox";
_chk = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 2543;BA.debugLine="chk.Initialize(vue, \"chk\" & k, module)";
_chk._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,"chk"+_k,_module);
 //BA.debugLineNum = 2544;BA.debugLine="chk.SetStatic(True)";
_chk._setstatic /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 2545;BA.debugLine="chk.SetVModel(k)";
_chk._setvmodel /*b4j.example.vmcheckbox*/ (_k);
 //BA.debugLineNum = 2546;BA.debugLine="chk.SetTrueValue(\"Yes\")";
_chk._settruevalue /*b4j.example.vmcheckbox*/ ("Yes");
 //BA.debugLineNum = 2547;BA.debugLine="chk.Setlabel(v)";
_chk._setlabel /*b4j.example.vmcheckbox*/ (_v);
 //BA.debugLineNum = 2548;BA.debugLine="chk.SetFalseValue(\"No\")";
_chk._setfalsevalue /*b4j.example.vmcheckbox*/ ("No");
 //BA.debugLineNum = 2549;BA.debugLine="chk.SetHideDetails(True)";
_chk._sethidedetails /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 2550;BA.debugLine="chk.SetDense(True)";
_chk._setdense /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 2551;BA.debugLine="vue.SetData(k, \"No\")";
_vue._setdata /*b4j.example.bananovue*/ (_k,(Object)("No"));
 //BA.debugLineNum = 2552;BA.debugLine="defaults.Put(k,\"No\")";
_defaults.Put((Object)(_k),(Object)("No"));
 //BA.debugLineNum = 2553;BA.debugLine="fields.Add(k)";
_fields.Add((Object)(_k));
 //BA.debugLineNum = 2554;BA.debugLine="Strings.Add(k)";
_strings.Add((Object)(_k));
 //BA.debugLineNum = 2555;BA.debugLine="chk.RemoveAttr(\"ref\")";
_chk._removeattr /*b4j.example.vmcheckbox*/ ("ref");
 //BA.debugLineNum = 2556;BA.debugLine="Return chk";
if (true) return _chk;
 //BA.debugLineNum = 2557;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _buildswitch(String _k,String _v) throws Exception{
b4j.example.vmcheckbox _sw = null;
 //BA.debugLineNum = 2559;BA.debugLine="private Sub BuildSwitch(k As String, v As String)";
 //BA.debugLineNum = 2560;BA.debugLine="Dim sw As VMCheckBox";
_sw = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 2561;BA.debugLine="sw.Initialize(vue, \"sw\" & k, module).SetSwitch";
_sw._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,"sw"+_k,_module)._setswitch /*b4j.example.vmcheckbox*/ ();
 //BA.debugLineNum = 2562;BA.debugLine="sw.SetVModel(k)";
_sw._setvmodel /*b4j.example.vmcheckbox*/ (_k);
 //BA.debugLineNum = 2563;BA.debugLine="sw.Setlabel(v)";
_sw._setlabel /*b4j.example.vmcheckbox*/ (_v);
 //BA.debugLineNum = 2564;BA.debugLine="sw.SetTrueValue(\"Yes\")";
_sw._settruevalue /*b4j.example.vmcheckbox*/ ("Yes");
 //BA.debugLineNum = 2565;BA.debugLine="sw.SetFalseValue(\"No\")";
_sw._setfalsevalue /*b4j.example.vmcheckbox*/ ("No");
 //BA.debugLineNum = 2566;BA.debugLine="sw.SetHideDetails(True)";
_sw._sethidedetails /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 2567;BA.debugLine="sw.SetInset(True)";
_sw._setinset /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 2568;BA.debugLine="sw.SetFieldType(\"string\")";
_sw._setfieldtype /*b4j.example.vmcheckbox*/ ("string");
 //BA.debugLineNum = 2569;BA.debugLine="vue.SetData(k, \"No\")";
_vue._setdata /*b4j.example.bananovue*/ (_k,(Object)("No"));
 //BA.debugLineNum = 2570;BA.debugLine="defaults.Put(k,\"No\")";
_defaults.Put((Object)(_k),(Object)("No"));
 //BA.debugLineNum = 2571;BA.debugLine="fields.Add(k)";
_fields.Add((Object)(_k));
 //BA.debugLineNum = 2572;BA.debugLine="Strings.Add(k)";
_strings.Add((Object)(_k));
 //BA.debugLineNum = 2573;BA.debugLine="sw.RemoveAttr(\"ref\")";
_sw._removeattr /*b4j.example.vmcheckbox*/ ("ref");
 //BA.debugLineNum = 2574;BA.debugLine="sw.SetDense(True)";
_sw._setdense /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 2575;BA.debugLine="Return sw";
if (true) return _sw;
 //BA.debugLineNum = 2576;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _buildtextfield(b4j.example.vmproperty._propcontrols _nc) throws Exception{
b4j.example.vmtextfield _el = null;
 //BA.debugLineNum = 2526;BA.debugLine="private Sub BuildTextField(nc As PropControls) As";
 //BA.debugLineNum = 2527;BA.debugLine="Dim el As VMTextField";
_el = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2528;BA.debugLine="el.Initialize(vue, \"txt\" & nc.vmodel, module)";
_el._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"txt"+_nc.vmodel /*String*/ ,_module);
 //BA.debugLineNum = 2529;BA.debugLine="el.SetStatic(True)";
_el._setstatic /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2530;BA.debugLine="el.Setlabel(nc.text)";
_el._setlabel /*b4j.example.vmtextfield*/ (_nc.text /*String*/ );
 //BA.debugLineNum = 2531;BA.debugLine="el.SetVModel(nc.vmodel)";
_el._setvmodel /*b4j.example.vmtextfield*/ (_nc.vmodel /*String*/ );
 //BA.debugLineNum = 2532;BA.debugLine="el.SetType(\"text\")";
_el._settype /*b4j.example.vmtextfield*/ ("text");
 //BA.debugLineNum = 2533;BA.debugLine="el.RemoveAttr(\"ref\")";
_el._removeattr /*b4j.example.vmtextfield*/ ("ref");
 //BA.debugLineNum = 2534;BA.debugLine="el.SetDense(True)";
_el._setdense /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2535;BA.debugLine="el.SetOutlined(True)";
_el._setoutlined /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2536;BA.debugLine="el.SetHideDetails(True)";
_el._sethidedetails /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2537;BA.debugLine="el.AddClass(\"my-1\")";
_el._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2538;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2539;BA.debugLine="End Sub";
return null;
}
public String  _cbokeyselect(String _value) throws Exception{
 //BA.debugLineNum = 2608;BA.debugLine="Sub cboKeySelect(value As String)";
 //BA.debugLineNum = 2609;BA.debugLine="If value = \"\" Then Return";
if ((_value).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 2610;BA.debugLine="EditItem(value)";
_edititem(_value);
 //BA.debugLineNum = 2611;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private expnl As VMExpansionPanels";
_expnl = new b4j.example.vmexpansionpanels();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private controls As Map";
_controls = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Private fields As List";
_fields = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="Private BANano As BANano 'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 11;BA.debugLine="Private Booleans As List";
_booleans = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Private Strings As List";
_strings = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 13;BA.debugLine="Private Integers As List";
_integers = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 14;BA.debugLine="Private Doubles As List";
_doubles = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 15;BA.debugLine="Private Dates As List";
_dates = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="Private defaults As Map";
_defaults = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 17;BA.debugLine="Private labels As Map";
_labels = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 18;BA.debugLine="Type PropControls(vmodel As String, value As Stri";
;
 //BA.debugLineNum = 21;BA.debugLine="Dim sshow As String";
_sshow = "";
 //BA.debugLineNum = 22;BA.debugLine="Private contChecks As VMContainer";
_contchecks = new b4j.example.vmcontainer();
 //BA.debugLineNum = 23;BA.debugLine="Private hasChecks As Boolean";
_haschecks = false;
 //BA.debugLineNum = 24;BA.debugLine="Private changeEvent As String";
_changeevent = "";
 //BA.debugLineNum = 25;BA.debugLine="Public bText As List";
_btext = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 26;BA.debugLine="Public sText As List";
_stext = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 27;BA.debugLine="Public contentitems As List";
_contentitems = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 28;BA.debugLine="Private itemtypes As Map";
_itemtypes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 29;BA.debugLine="Public IsTable As Boolean";
_istable = false;
 //BA.debugLineNum = 30;BA.debugLine="Private InternalItemType As Map";
_internalitemtype = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 31;BA.debugLine="Private InternalItemTypeOptions As Map";
_internalitemtypeoptions = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _clear() throws Exception{
String _k = "";
 //BA.debugLineNum = 405;BA.debugLine="Sub Clear";
 //BA.debugLineNum = 406;BA.debugLine="For Each k As String In fields";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fields;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 407;BA.debugLine="vue.SetStateSingle(k, Null)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_k,__c.Null);
 }
};
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return "";
}
public String  _clearcontents() throws Exception{
anywheresoftware.b4a.objects.collections.Map _item = null;
String _k = "";
String _v = "";
 //BA.debugLineNum = 1189;BA.debugLine="Sub ClearContents";
 //BA.debugLineNum = 1191;BA.debugLine="Dim item As Map = CreateMap()";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1192;BA.debugLine="For Each k As String In contentitems";
{
final anywheresoftware.b4a.BA.IterableList group2 = _contentitems;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1193;BA.debugLine="Dim v As String = $\"items${k}\"$";
_v = ("items"+__c.SmartStringFormatter("",(Object)(_k))+"");
 //BA.debugLineNum = 1194;BA.debugLine="item.Put(v, Null)";
_item.Put((Object)(_v),__c.Null);
 }
};
 //BA.debugLineNum = 1196;BA.debugLine="vue.SetState(item)";
_vue._setstate /*b4j.example.bananovue*/ (_item);
 //BA.debugLineNum = 1197;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlist  _createlist(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmlist _el = null;
 //BA.debugLineNum = 1057;BA.debugLine="Sub CreateList(sid As String, eventHandler As Obje";
 //BA.debugLineNum = 1058;BA.debugLine="Dim el As VMList";
_el = new b4j.example.vmlist();
 //BA.debugLineNum = 1059;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmlist*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1060;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1061;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _createtoolbar(String _sid,Object _moduleobj) throws Exception{
b4j.example.vmtoolbar _el = null;
 //BA.debugLineNum = 1049;BA.debugLine="Sub CreateToolbar(sid As String, moduleObj As Obje";
 //BA.debugLineNum = 1050;BA.debugLine="Dim el As VMToolBar";
_el = new b4j.example.vmtoolbar();
 //BA.debugLineNum = 1051;BA.debugLine="el.Initialize(vue, sid, moduleObj)";
_el._initialize /*b4j.example.vmtoolbar*/ (ba,_vue,_sid,_moduleobj);
 //BA.debugLineNum = 1052;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmtoolbar*/ (_designmode);
 //BA.debugLineNum = 1053;BA.debugLine="el.SetToolBar(True)";
_el._settoolbar /*b4j.example.vmtoolbar*/ (__c.True);
 //BA.debugLineNum = 1054;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1055;BA.debugLine="End Sub";
return null;
}
public String  _deleteitem() throws Exception{
anywheresoftware.b4a.objects.collections.Map _item = null;
String _k = "";
String _v = "";
anywheresoftware.b4a.objects.collections.List _contents = null;
int _rpos = 0;
 //BA.debugLineNum = 1204;BA.debugLine="Sub DeleteItem";
 //BA.debugLineNum = 1205;BA.debugLine="Dim item As Map = CreateMap()";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1206;BA.debugLine="For Each k As String In contentitems";
{
final anywheresoftware.b4a.BA.IterableList group2 = _contentitems;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1207;BA.debugLine="Dim v As String = vue.GetData($\"items${k}\"$)";
_v = BA.ObjectToString(_vue._getdata /*Object*/ (("items"+__c.SmartStringFormatter("",(Object)(_k))+"")));
 //BA.debugLineNum = 1208;BA.debugLine="item.Put(k, v)";
_item.Put((Object)(_k),(Object)(_v));
 }
};
 //BA.debugLineNum = 1211;BA.debugLine="Dim contents As List = vue.GetData(\"tableitems\")";
_contents = new anywheresoftware.b4a.objects.collections.List();
_contents = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_vue._getdata /*Object*/ ("tableitems")));
 //BA.debugLineNum = 1213;BA.debugLine="Dim v As String = item.Get(\"key\")";
_v = BA.ObjectToString(_item.Get((Object)("key")));
 //BA.debugLineNum = 1214;BA.debugLine="If v = \"\" Then Return";
if ((_v).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 1216;BA.debugLine="Dim rpos As Int = RecordPos(contents, \"key\", v)";
_rpos = _recordpos(_contents,"key",_v);
 //BA.debugLineNum = 1217;BA.debugLine="rpos = BANano.parseInt(rpos)";
_rpos = _banano.parseInt((Object)(_rpos));
 //BA.debugLineNum = 1218;BA.debugLine="If rpos <> -1 Then";
if (_rpos!=-1) { 
 //BA.debugLineNum = 1219;BA.debugLine="contents.RemoveAt(rpos)";
_contents.RemoveAt(_rpos);
 };
 //BA.debugLineNum = 1221;BA.debugLine="vue.SetData(\"tableitems\", contents)";
_vue._setdata /*b4j.example.bananovue*/ ("tableitems",(Object)(_contents.getObject()));
 //BA.debugLineNum = 1222;BA.debugLine="ClearContents";
_clearcontents();
 //BA.debugLineNum = 1223;BA.debugLine="BANano.CallSub(module, changeEvent, Null)";
_banano.CallSub(_module,_changeevent,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 1224;BA.debugLine="End Sub";
return "";
}
public String  _edititem(String _menuid) throws Exception{
anywheresoftware.b4a.objects.collections.List _contents = null;
int _rpos = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _k = "";
String _v = "";
 //BA.debugLineNum = 1237;BA.debugLine="Sub EditItem(menuID As String)";
 //BA.debugLineNum = 1238;BA.debugLine="If menuID = \"\" Then Return";
if ((_menuid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 1240;BA.debugLine="Dim contents As List = vue.GetData(\"tableitems\")";
_contents = new anywheresoftware.b4a.objects.collections.List();
_contents = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_vue._getdata /*Object*/ ("tableitems")));
 //BA.debugLineNum = 1242;BA.debugLine="Dim rpos As Int = RecordPos(contents, \"key\", menu";
_rpos = _recordpos(_contents,"key",_menuid);
 //BA.debugLineNum = 1244;BA.debugLine="If rpos = -1 Then Return";
if (_rpos==-1) { 
if (true) return "";};
 //BA.debugLineNum = 1246;BA.debugLine="Dim m As Map = contents.Get(rpos)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_contents.Get(_rpos)));
 //BA.debugLineNum = 1247;BA.debugLine="For Each k As String In contentitems";
{
final anywheresoftware.b4a.BA.IterableList group6 = _contentitems;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_k = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 1249;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 1250;BA.debugLine="m.Put($\"items${k}\"$, v)";
_m.Put((Object)(("items"+__c.SmartStringFormatter("",(Object)(_k))+"")),(Object)(_v));
 }
};
 //BA.debugLineNum = 1252;BA.debugLine="vue.SetState(m)";
_vue._setstate /*b4j.example.bananovue*/ (_m);
 //BA.debugLineNum = 1253;BA.debugLine="End Sub";
return "";
}
public String  _getjson() throws Exception{
anywheresoftware.b4a.objects.collections.Map _them = null;
String _sjson = "";
 //BA.debugLineNum = 412;BA.debugLine="Sub getJSON As String";
 //BA.debugLineNum = 413;BA.debugLine="Dim them As Map = getProperties";
_them = new anywheresoftware.b4a.objects.collections.Map();
_them = _getproperties();
 //BA.debugLineNum = 414;BA.debugLine="Dim sjson As String = BANano.ToJson(them)";
_sjson = BA.ObjectToString(_banano.ToJson((Object)(_them.getObject())));
 //BA.debugLineNum = 415;BA.debugLine="Return sjson";
if (true) return _sjson;
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getproperties() throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 390;BA.debugLine="Sub getProperties As Map";
 //BA.debugLineNum = 391;BA.debugLine="Dim rec As Map = CreateMap()";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 392;BA.debugLine="For Each k As String In fields";
{
final anywheresoftware.b4a.BA.IterableList group2 = _fields;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 393;BA.debugLine="Dim v As Object = vue.GetState(k, \"\")";
_v = _vue._getstate /*Object*/ (_k,(Object)(""));
 //BA.debugLineNum = 394;BA.debugLine="If v = BANano.UNDEFINED Then v = \"\"";
if ((_v).equals(_banano.UNDEFINED())) { 
_v = (Object)("");};
 //BA.debugLineNum = 395;BA.debugLine="rec.Put(k, v)";
_rec.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 397;BA.debugLine="If Booleans.Size > 0 Then vue.MakeBoolean(rec, Bo";
if (_booleans.getSize()>0) { 
_vue._makeboolean /*String*/ (_rec,_booleans);};
 //BA.debugLineNum = 398;BA.debugLine="If Doubles.Size > 0 Then vue.MakeDouble(rec, Doub";
if (_doubles.getSize()>0) { 
_vue._makedouble /*String*/ (_rec,_doubles);};
 //BA.debugLineNum = 399;BA.debugLine="If Integers.Size > 0 Then vue.MakeInteger(rec, In";
if (_integers.getSize()>0) { 
_vue._makeinteger /*String*/ (_rec,_integers);};
 //BA.debugLineNum = 400;BA.debugLine="If Strings.Size > 0 Then vue.MakeTrim(rec, String";
if (_strings.getSize()>0) { 
_vue._maketrim /*String*/ (_rec,_strings);};
 //BA.debugLineNum = 401;BA.debugLine="Return rec";
if (true) return _rec;
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return null;
}
public String  _hide() throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub Hide";
 //BA.debugLineNum = 204;BA.debugLine="vue.setdata(sshow, False)";
_vue._setdata /*b4j.example.bananovue*/ (_sshow,(Object)(__c.False));
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public String  _hideitem(String _item) throws Exception{
 //BA.debugLineNum = 2491;BA.debugLine="Sub HideItem(item As String)";
 //BA.debugLineNum = 2492;BA.debugLine="item = item.ToLowerCase & \"show\"";
_item = _item.toLowerCase()+"show";
 //BA.debugLineNum = 2493;BA.debugLine="vue.SetData(item, False)";
_vue._setdata /*b4j.example.bananovue*/ (_item,(Object)(__c.False));
 //BA.debugLineNum = 2494;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 34;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 35;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 36;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 37;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 38;BA.debugLine="expnl.Initialize(v, ID, eventHandler).SetAccordio";
_expnl._initialize /*b4j.example.vmexpansionpanels*/ (ba,_v,_id,_eventhandler)._setaccordion /*b4j.example.vmexpansionpanels*/ (__c.True)._setfocusable /*b4j.example.vmexpansionpanels*/ (__c.True)._setflat /*b4j.example.vmexpansionpanels*/ (__c.True);
 //BA.debugLineNum = 39;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 40;BA.debugLine="controls.initialize";
_controls.Initialize();
 //BA.debugLineNum = 41;BA.debugLine="fields.initialize";
_fields.Initialize();
 //BA.debugLineNum = 42;BA.debugLine="Booleans.initialize";
_booleans.Initialize();
 //BA.debugLineNum = 43;BA.debugLine="Strings.initialize";
_strings.Initialize();
 //BA.debugLineNum = 44;BA.debugLine="Integers.initialize";
_integers.Initialize();
 //BA.debugLineNum = 45;BA.debugLine="Doubles.initialize";
_doubles.Initialize();
 //BA.debugLineNum = 46;BA.debugLine="Dates.initialize";
_dates.Initialize();
 //BA.debugLineNum = 47;BA.debugLine="defaults.initialize";
_defaults.Initialize();
 //BA.debugLineNum = 48;BA.debugLine="labels.initialize";
_labels.Initialize();
 //BA.debugLineNum = 49;BA.debugLine="sshow = \"\"";
_sshow = "";
 //BA.debugLineNum = 50;BA.debugLine="hasChecks = False";
_haschecks = __c.False;
 //BA.debugLineNum = 51;BA.debugLine="contChecks.Initialize(vue, \"checks\", module).SetF";
_contchecks._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"checks",_module)._setfluid /*b4j.example.vmcontainer*/ (__c.True)._settag /*b4j.example.vmcontainer*/ ("div")._setnogutters /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 52;BA.debugLine="changeEvent = $\"${ID}_change\"$";
_changeevent = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 53;BA.debugLine="bText.Initialize";
_btext.Initialize();
 //BA.debugLineNum = 54;BA.debugLine="sText.Initialize";
_stext.Initialize();
 //BA.debugLineNum = 55;BA.debugLine="InternalItemType.Initialize";
_internalitemtype.Initialize();
 //BA.debugLineNum = 56;BA.debugLine="InternalItemTypeOptions.Initialize";
_internalitemtypeoptions.Initialize();
 //BA.debugLineNum = 57;BA.debugLine="contentitems.Initialize";
_contentitems.Initialize();
 //BA.debugLineNum = 58;BA.debugLine="contentitems.Add(\"key\")";
_contentitems.Add((Object)("key"));
 //BA.debugLineNum = 59;BA.debugLine="contentitems.Add(\"avatar\")";
_contentitems.Add((Object)("avatar"));
 //BA.debugLineNum = 60;BA.debugLine="contentitems.Add(\"icon\")";
_contentitems.Add((Object)("icon"));
 //BA.debugLineNum = 61;BA.debugLine="contentitems.Add(\"title\")";
_contentitems.Add((Object)("title"));
 //BA.debugLineNum = 62;BA.debugLine="contentitems.Add(\"subtitle\")";
_contentitems.Add((Object)("subtitle"));
 //BA.debugLineNum = 63;BA.debugLine="contentitems.Add(\"action\")";
_contentitems.Add((Object)("action"));
 //BA.debugLineNum = 64;BA.debugLine="contentitems.Add(\"itemtype\")";
_contentitems.Add((Object)("itemtype"));
 //BA.debugLineNum = 65;BA.debugLine="contentitems.Add(\"badge\")";
_contentitems.Add((Object)("badge"));
 //BA.debugLineNum = 66;BA.debugLine="contentitems.Add(\"iconcolor\")";
_contentitems.Add((Object)("iconcolor"));
 //BA.debugLineNum = 67;BA.debugLine="contentitems.Add(\"subtitle1\")";
_contentitems.Add((Object)("subtitle1"));
 //BA.debugLineNum = 68;BA.debugLine="contentitems.Add(\"actioncolor\")";
_contentitems.Add((Object)("actioncolor"));
 //BA.debugLineNum = 69;BA.debugLine="contentitems.Add(\"colwidth\")";
_contentitems.Add((Object)("colwidth"));
 //BA.debugLineNum = 70;BA.debugLine="contentitems.Add(\"colsortable\")";
_contentitems.Add((Object)("colsortable"));
 //BA.debugLineNum = 71;BA.debugLine="contentitems.Add(\"colalign\")";
_contentitems.Add((Object)("colalign"));
 //BA.debugLineNum = 72;BA.debugLine="contentitems.Add(\"colcontroltype\")";
_contentitems.Add((Object)("colcontroltype"));
 //BA.debugLineNum = 73;BA.debugLine="contentitems.Add(\"coldatatype\")";
_contentitems.Add((Object)("coldatatype"));
 //BA.debugLineNum = 74;BA.debugLine="contentitems.Add(\"collength\")";
_contentitems.Add((Object)("collength"));
 //BA.debugLineNum = 75;BA.debugLine="contentitems.Add(\"colvalue\")";
_contentitems.Add((Object)("colvalue"));
 //BA.debugLineNum = 76;BA.debugLine="contentitems.Add(\"colplaceholder\")";
_contentitems.Add((Object)("colplaceholder"));
 //BA.debugLineNum = 77;BA.debugLine="contentitems.Add(\"colhelpertext\")";
_contentitems.Add((Object)("colhelpertext"));
 //BA.debugLineNum = 78;BA.debugLine="contentitems.Add(\"colforeigntable\")";
_contentitems.Add((Object)("colforeigntable"));
 //BA.debugLineNum = 79;BA.debugLine="contentitems.Add(\"colforeignkey\")";
_contentitems.Add((Object)("colforeignkey"));
 //BA.debugLineNum = 80;BA.debugLine="contentitems.Add(\"colforeignvalue\")";
_contentitems.Add((Object)("colforeignvalue"));
 //BA.debugLineNum = 81;BA.debugLine="contentitems.Add(\"coloptionkeys\")";
_contentitems.Add((Object)("coloptionkeys"));
 //BA.debugLineNum = 82;BA.debugLine="contentitems.Add(\"coloptionvalues\")";
_contentitems.Add((Object)("coloptionvalues"));
 //BA.debugLineNum = 84;BA.debugLine="contentitems.Add(\"colindexed\")";
_contentitems.Add((Object)("colindexed"));
 //BA.debugLineNum = 85;BA.debugLine="contentitems.Add(\"colrequired\")";
_contentitems.Add((Object)("colrequired"));
 //BA.debugLineNum = 86;BA.debugLine="contentitems.Add(\"colactive\")";
_contentitems.Add((Object)("colactive"));
 //BA.debugLineNum = 87;BA.debugLine="contentitems.Add(\"colontable\")";
_contentitems.Add((Object)("colontable"));
 //BA.debugLineNum = 88;BA.debugLine="contentitems.Add(\"colvisible\")";
_contentitems.Add((Object)("colvisible"));
 //BA.debugLineNum = 89;BA.debugLine="contentitems.Add(\"colvaluedisplay\")";
_contentitems.Add((Object)("colvaluedisplay"));
 //BA.debugLineNum = 91;BA.debugLine="contentitems.Add(\"colrow\")";
_contentitems.Add((Object)("colrow"));
 //BA.debugLineNum = 92;BA.debugLine="contentitems.Add(\"colcolumn\")";
_contentitems.Add((Object)("colcolumn"));
 //BA.debugLineNum = 93;BA.debugLine="contentitems.Add(\"coloffsetsmall\")";
_contentitems.Add((Object)("coloffsetsmall"));
 //BA.debugLineNum = 94;BA.debugLine="contentitems.Add(\"coloffsetmedium\")";
_contentitems.Add((Object)("coloffsetmedium"));
 //BA.debugLineNum = 95;BA.debugLine="contentitems.Add(\"coloffsetlarge\")";
_contentitems.Add((Object)("coloffsetlarge"));
 //BA.debugLineNum = 96;BA.debugLine="contentitems.Add(\"coloffsetxlarge\")";
_contentitems.Add((Object)("coloffsetxlarge"));
 //BA.debugLineNum = 97;BA.debugLine="contentitems.Add(\"colsizesmall\")";
_contentitems.Add((Object)("colsizesmall"));
 //BA.debugLineNum = 98;BA.debugLine="contentitems.Add(\"colsizemedium\")";
_contentitems.Add((Object)("colsizemedium"));
 //BA.debugLineNum = 99;BA.debugLine="contentitems.Add(\"colsizelarge\")";
_contentitems.Add((Object)("colsizelarge"));
 //BA.debugLineNum = 100;BA.debugLine="contentitems.Add(\"colsizexlarge\")";
_contentitems.Add((Object)("colsizexlarge"));
 //BA.debugLineNum = 102;BA.debugLine="contentitems.Add(\"coldefaultvalue\")";
_contentitems.Add((Object)("coldefaultvalue"));
 //BA.debugLineNum = 103;BA.debugLine="contentitems.Add(\"colminrange\")";
_contentitems.Add((Object)("colminrange"));
 //BA.debugLineNum = 104;BA.debugLine="contentitems.Add(\"colmaxrange\")";
_contentitems.Add((Object)("colmaxrange"));
 //BA.debugLineNum = 105;BA.debugLine="contentitems.Add(\"collist\")";
_contentitems.Add((Object)("collist"));
 //BA.debugLineNum = 106;BA.debugLine="contentitems.Add(\"coltype\")";
_contentitems.Add((Object)("coltype"));
 //BA.debugLineNum = 107;BA.debugLine="contentitems.Add(\"colsetranges\")";
_contentitems.Add((Object)("colsetranges"));
 //BA.debugLineNum = 108;BA.debugLine="contentitems.Add(\"colhasset\")";
_contentitems.Add((Object)("colhasset"));
 //BA.debugLineNum = 109;BA.debugLine="contentitems.Add(\"colhasget\")";
_contentitems.Add((Object)("colhasget"));
 //BA.debugLineNum = 110;BA.debugLine="contentitems.Add(\"colisconsant\")";
_contentitems.Add((Object)("colisconsant"));
 //BA.debugLineNum = 111;BA.debugLine="contentitems.Add(\"colscope\")";
_contentitems.Add((Object)("colscope"));
 //BA.debugLineNum = 112;BA.debugLine="contentitems.Add(\"colfieldtype\")";
_contentitems.Add((Object)("colfieldtype"));
 //BA.debugLineNum = 113;BA.debugLine="contentitems.Add(\"colislookup\")";
_contentitems.Add((Object)("colislookup"));
 //BA.debugLineNum = 114;BA.debugLine="contentitems.Add(\"colisautofocus\")";
_contentitems.Add((Object)("colisautofocus"));
 //BA.debugLineNum = 115;BA.debugLine="contentitems.Add(\"colishidedetails\")";
_contentitems.Add((Object)("colishidedetails"));
 //BA.debugLineNum = 116;BA.debugLine="contentitems.Add(\"colisdense\")";
_contentitems.Add((Object)("colisdense"));
 //BA.debugLineNum = 117;BA.debugLine="contentitems.Add(\"colnoduplicate\")";
_contentitems.Add((Object)("colnoduplicate"));
 //BA.debugLineNum = 118;BA.debugLine="contentitems.Add(\"colprimarykey\")";
_contentitems.Add((Object)("colprimarykey"));
 //BA.debugLineNum = 119;BA.debugLine="contentitems.Add(\"coldisplayvalue\")";
_contentitems.Add((Object)("coldisplayvalue"));
 //BA.debugLineNum = 120;BA.debugLine="contentitems.Add(\"colautoincrement\")";
_contentitems.Add((Object)("colautoincrement"));
 //BA.debugLineNum = 122;BA.debugLine="contentitems.Add(\"coluseoptions\")";
_contentitems.Add((Object)("coluseoptions"));
 //BA.debugLineNum = 123;BA.debugLine="contentitems.Add(\"colkeys\")";
_contentitems.Add((Object)("colkeys"));
 //BA.debugLineNum = 124;BA.debugLine="contentitems.Add(\"colvalues\")";
_contentitems.Add((Object)("colvalues"));
 //BA.debugLineNum = 125;BA.debugLine="contentitems.Add(\"coldateformat\")";
_contentitems.Add((Object)("coldateformat"));
 //BA.debugLineNum = 127;BA.debugLine="IsTable = False";
_istable = __c.False;
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public String  _itemscrud_click(com.ab.banano.BANanoEvent _e) throws Exception{
String _menuid = "";
 //BA.debugLineNum = 1255;BA.debugLine="Sub itemscrud_click(e As BANanoEvent)";
 //BA.debugLineNum = 1256;BA.debugLine="Dim menuID As String = vue.getidfromevent(e)";
_menuid = _vue._getidfromevent /*String*/ (_e);
 //BA.debugLineNum = 1257;BA.debugLine="EditItem(menuID)";
_edititem(_menuid);
 //BA.debugLineNum = 1258;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _multiselect(b4j.example.vmproperty._propcontrols _nc,String _vmodel,String _vtext,anywheresoftware.b4a.objects.collections.Map _options,String _vmodel1,String _vtext1,anywheresoftware.b4a.objects.collections.Map _options1) throws Exception{
b4j.example.vmcontainer _tcont = null;
b4j.example.vmselect _cbo = null;
b4j.example.vmselect _cbo1 = null;
 //BA.debugLineNum = 1295;BA.debugLine="Sub MultiSelect(nc As PropControls, vmodel As Stri";
 //BA.debugLineNum = 1296;BA.debugLine="Dim tcont As VMContainer";
_tcont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 1297;BA.debugLine="tcont.Initialize(vue, \"mt\" & nc.vmodel, module).S";
_tcont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"mt"+_nc.vmodel /*String*/ ,_module)._settag /*b4j.example.vmcontainer*/ ("div")._setfluid /*b4j.example.vmcontainer*/ (__c.True)._setnogutters /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1299;BA.debugLine="Dim cbo As VMSelect";
_cbo = new b4j.example.vmselect();
 //BA.debugLineNum = 1300;BA.debugLine="cbo.Initialize(vue, \"cbo\" & vmodel, module).SetSt";
_cbo._initialize /*b4j.example.vmselect*/ (ba,_vue,"cbo"+_vmodel,_module)._setstatic /*b4j.example.vmselect*/ (__c.True)._setlabel /*b4j.example.vmselect*/ (_vtext)._setvmodel /*b4j.example.vmselect*/ ((""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+""+__c.SmartStringFormatter("",(Object)(_vmodel))+""));
 //BA.debugLineNum = 1301;BA.debugLine="cbo.SetOptions($\"${vmodel}1\"$, options, \"id\", \"te";
_cbo._setoptions /*b4j.example.vmselect*/ ((""+__c.SmartStringFormatter("",(Object)(_vmodel))+"1"),_options,"id","text",__c.False)._removeattr /*b4j.example.vmselect*/ ("ref")._setdense /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1302;BA.debugLine="cbo.SetOutlined(True).SetHideDetails(True).AddCla";
_cbo._setoutlined /*b4j.example.vmselect*/ (__c.True)._sethidedetails /*b4j.example.vmselect*/ (__c.True)._addclass /*b4j.example.vmselect*/ ("my-1");
 //BA.debugLineNum = 1303;BA.debugLine="tcont.AddControlS(cbo.Combo, cbo.ToString, 1, 1,";
_tcont._addcontrols /*String*/ (_cbo._combo /*b4j.example.vmelement*/ ,_cbo._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 1305;BA.debugLine="Dim cbo1 As VMSelect";
_cbo1 = new b4j.example.vmselect();
 //BA.debugLineNum = 1306;BA.debugLine="cbo1.Initialize(vue, \"cbo\" & vmodel1, module).Set";
_cbo1._initialize /*b4j.example.vmselect*/ (ba,_vue,"cbo"+_vmodel1,_module)._setstatic /*b4j.example.vmselect*/ (__c.True)._setlabel /*b4j.example.vmselect*/ (_vtext1)._setvmodel /*b4j.example.vmselect*/ ((""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+""+__c.SmartStringFormatter("",(Object)(_vmodel1))+""));
 //BA.debugLineNum = 1307;BA.debugLine="cbo1.SetOptions($\"${vmodel1}1\"$, options1, \"id\",";
_cbo1._setoptions /*b4j.example.vmselect*/ ((""+__c.SmartStringFormatter("",(Object)(_vmodel1))+"1"),_options1,"id","text",__c.False)._removeattr /*b4j.example.vmselect*/ ("ref")._setdense /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1308;BA.debugLine="cbo1.SetOutlined(True).SetHideDetails(True).AddCl";
_cbo1._setoutlined /*b4j.example.vmselect*/ (__c.True)._sethidedetails /*b4j.example.vmselect*/ (__c.True)._addclass /*b4j.example.vmselect*/ ("my-1");
 //BA.debugLineNum = 1309;BA.debugLine="tcont.AddControlS(cbo1.Combo, cbo1.ToString, 1, 2";
_tcont._addcontrols /*String*/ (_cbo1._combo /*b4j.example.vmelement*/ ,_cbo1._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 1310;BA.debugLine="Return tcont";
if (true) return _tcont;
 //BA.debugLineNum = 1311;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _multiswitches(b4j.example.vmproperty._propcontrols _nc,anywheresoftware.b4a.objects.collections.Map _options) throws Exception{
b4j.example.vmcontainer _acont = null;
int _colpos = 0;
String _k = "";
String _v = "";
String _vmodel = "";
b4j.example.vmcheckbox _sw = null;
 //BA.debugLineNum = 1313;BA.debugLine="Sub MultiSwitches(nc As PropControls, options As M";
 //BA.debugLineNum = 1314;BA.debugLine="Dim acont As VMContainer";
_acont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 1315;BA.debugLine="acont.Initialize(vue, \"\", module).SetTag(\"div\")";
_acont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"",_module)._settag /*b4j.example.vmcontainer*/ ("div");
 //BA.debugLineNum = 1316;BA.debugLine="acont.NoGutters = True";
_acont._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 1317;BA.debugLine="acont.SetFluid(True)";
_acont._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1318;BA.debugLine="Dim colPos As Int = 0";
_colpos = (int) (0);
 //BA.debugLineNum = 1319;BA.debugLine="For Each k As String In options.keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _options.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_k = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 1320;BA.debugLine="Dim v As String = options.Get(k)";
_v = BA.ObjectToString(_options.Get((Object)(_k)));
 //BA.debugLineNum = 1321;BA.debugLine="Dim vmodel As String = $\"${nc.vmodel}${k}\"$";
_vmodel = (""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+""+__c.SmartStringFormatter("",(Object)(_k))+"");
 //BA.debugLineNum = 1322;BA.debugLine="colPos = colPos + 1";
_colpos = (int) (_colpos+1);
 //BA.debugLineNum = 1324;BA.debugLine="Dim sw As VMCheckBox";
_sw = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 1325;BA.debugLine="sw.Initialize(vue, \"sw\" & k, module).SetStatic(T";
_sw._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,"sw"+_k,_module)._setstatic /*b4j.example.vmcheckbox*/ (__c.True)._setvmodel /*b4j.example.vmcheckbox*/ (_vmodel)._setswitch /*b4j.example.vmcheckbox*/ ();
 //BA.debugLineNum = 1326;BA.debugLine="sw.Setlabel(v).SetTrueValue(\"Yes\").SetFalseValue";
_sw._setlabel /*b4j.example.vmcheckbox*/ (_v)._settruevalue /*b4j.example.vmcheckbox*/ ("Yes")._setfalsevalue /*b4j.example.vmcheckbox*/ ("No")._sethidedetails /*b4j.example.vmcheckbox*/ (__c.True)._setfieldtype /*b4j.example.vmcheckbox*/ ("string");
 //BA.debugLineNum = 1327;BA.debugLine="sw.RemoveAttr(\"ref\").SetDense(True).SetInset(Tru";
_sw._removeattr /*b4j.example.vmcheckbox*/ ("ref")._setdense /*b4j.example.vmcheckbox*/ (__c.True)._setinset /*b4j.example.vmcheckbox*/ (__c.True)._addclass /*b4j.example.vmcheckbox*/ ("my-1");
 //BA.debugLineNum = 1328;BA.debugLine="acont.AddControlS(sw.CheckBox, sw.ToString, 1, c";
_acont._addcontrols /*String*/ (_sw._checkbox /*b4j.example.vmelement*/ ,_sw._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(_colpos),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 1329;BA.debugLine="vue.SetData(vmodel, \"No\")";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)("No"));
 }
};
 //BA.debugLineNum = 1331;BA.debugLine="Return acont";
if (true) return _acont;
 //BA.debugLineNum = 1332;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _multitext(b4j.example.vmproperty._propcontrols _nc,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
b4j.example.vmcontainer _tcont = null;
int _ttot = 0;
int _colsize = 0;
int _colpos = 0;
String _k = "";
String _v = "";
String _vmodel = "";
b4j.example.vmtextfield _tw = null;
 //BA.debugLineNum = 1261;BA.debugLine="Sub MultiText(nc As PropControls, m As Map) As VMC";
 //BA.debugLineNum = 1263;BA.debugLine="Dim tcont As VMContainer";
_tcont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 1264;BA.debugLine="tcont.Initialize(vue, \"mt\" & nc.vmodel, module).S";
_tcont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"mt"+_nc.vmodel /*String*/ ,_module)._settag /*b4j.example.vmcontainer*/ ("div")._setfluid /*b4j.example.vmcontainer*/ (__c.True)._setnogutters /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1266;BA.debugLine="Dim tTot As Int = m.Size";
_ttot = _m.getSize();
 //BA.debugLineNum = 1267;BA.debugLine="Dim colSize As Int";
_colsize = 0;
 //BA.debugLineNum = 1268;BA.debugLine="Select Case tTot";
switch (_ttot) {
case 1: {
 //BA.debugLineNum = 1270;BA.debugLine="colSize = 12";
_colsize = (int) (12);
 break; }
case 2: {
 //BA.debugLineNum = 1272;BA.debugLine="colSize = 6";
_colsize = (int) (6);
 break; }
case 3: {
 //BA.debugLineNum = 1274;BA.debugLine="colSize = 4";
_colsize = (int) (4);
 break; }
case 4: {
 //BA.debugLineNum = 1276;BA.debugLine="colSize = 3";
_colsize = (int) (3);
 break; }
case 6: {
 //BA.debugLineNum = 1278;BA.debugLine="colSize = 2";
_colsize = (int) (2);
 break; }
default: {
 //BA.debugLineNum = 1280;BA.debugLine="Log(\"VMProperty.MultiText - item sizes should be";
__c.Log("VMProperty.MultiText - item sizes should be 1, 2, 3, 4, 6");
 break; }
}
;
 //BA.debugLineNum = 1283;BA.debugLine="Dim colPos As Int = 0";
_colpos = (int) (0);
 //BA.debugLineNum = 1284;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group20 = _m.Keys();
final int groupLen20 = group20.getSize()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_k = BA.ObjectToString(group20.Get(index20));
 //BA.debugLineNum = 1285;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 1286;BA.debugLine="Dim vmodel As String = $\"${nc.vmodel}${k}\"$";
_vmodel = (""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+""+__c.SmartStringFormatter("",(Object)(_k))+"");
 //BA.debugLineNum = 1287;BA.debugLine="colPos = colPos + 1";
_colpos = (int) (_colpos+1);
 //BA.debugLineNum = 1289;BA.debugLine="Dim tw As VMTextField = AddTextField(k, vmodel,";
_tw = _addtextfield(_k,_vmodel,_v);
 //BA.debugLineNum = 1290;BA.debugLine="tcont.AddControlS(tw.TextField, tw.ToString, 1,";
_tcont._addcontrols /*String*/ (_tw._textfield /*b4j.example.vmelement*/ ,_tw._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(_colpos),BA.NumberToString(_colsize),BA.NumberToString(_colsize),BA.NumberToString(_colsize),BA.NumberToString(_colsize));
 }
};
 //BA.debugLineNum = 1292;BA.debugLine="Return tcont";
if (true) return _tcont;
 //BA.debugLineNum = 1293;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _newbutton(Object _eventhandler,boolean _bstatic,String _sname,String _slabel,boolean _braised,boolean _bprimary,boolean _baccent,boolean _bfitwidth) throws Exception{
b4j.example.vmbutton _el = null;
 //BA.debugLineNum = 2422;BA.debugLine="Sub NewButton(eventHandler As Object,bStatic As Bo";
 //BA.debugLineNum = 2423;BA.debugLine="Dim el As VMButton";
_el = new b4j.example.vmbutton();
 //BA.debugLineNum = 2424;BA.debugLine="el.Initialize(vue, sname, eventHandler)";
_el._initialize /*b4j.example.vmbutton*/ (ba,_vue,_sname,_eventhandler);
 //BA.debugLineNum = 2425;BA.debugLine="el.SetType(\"button\")";
_el._settype /*b4j.example.vmbutton*/ ("button");
 //BA.debugLineNum = 2426;BA.debugLine="el.setstatic(bStatic)";
_el._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 2427;BA.debugLine="el.SetLabel(sLabel)";
_el._setlabel /*b4j.example.vmbutton*/ (_slabel);
 //BA.debugLineNum = 2428;BA.debugLine="If bRaised = False Then el.SetTransparent(True)";
if (_braised==__c.False) { 
_el._settransparent /*b4j.example.vmbutton*/ (__c.True);};
 //BA.debugLineNum = 2429;BA.debugLine="If bPrimary Then el.SetPrimary(bPrimary)";
if (_bprimary) { 
_el._setprimary /*b4j.example.vmbutton*/ (_bprimary);};
 //BA.debugLineNum = 2430;BA.debugLine="If bAccent Then el.SetColor(\"accent\")";
if (_baccent) { 
_el._setcolor /*b4j.example.vmbutton*/ ("accent");};
 //BA.debugLineNum = 2431;BA.debugLine="If bFitWidth Then el.SetBlock(True)";
if (_bfitwidth) { 
_el._setblock /*b4j.example.vmbutton*/ (__c.True);};
 //BA.debugLineNum = 2432;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2433;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextfield  _newtextarea(String _tid,String _tvmodel,String _tlabel) throws Exception{
b4j.example.vmtextfield _txta = null;
 //BA.debugLineNum = 2405;BA.debugLine="Sub NewTextArea(tID As String, tvModel As String,";
 //BA.debugLineNum = 2406;BA.debugLine="Dim txta As VMTextField";
_txta = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2407;BA.debugLine="txta.Initialize(vue, tID, module)";
_txta._initialize /*b4j.example.vmtextfield*/ (ba,_vue,_tid,_module);
 //BA.debugLineNum = 2408;BA.debugLine="txta.SetTextArea";
_txta._settextarea /*b4j.example.vmtextfield*/ ();
 //BA.debugLineNum = 2409;BA.debugLine="txta.SetClearable(True)";
_txta._setclearable /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2410;BA.debugLine="txta.Setlabel(tLabel)";
_txta._setlabel /*b4j.example.vmtextfield*/ (_tlabel);
 //BA.debugLineNum = 2411;BA.debugLine="txta.SetAutoGrow(True)";
_txta._setautogrow /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2412;BA.debugLine="txta.SetVModel(tvModel)";
_txta._setvmodel /*b4j.example.vmtextfield*/ (_tvmodel);
 //BA.debugLineNum = 2413;BA.debugLine="txta.SetDense(True)";
_txta._setdense /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2414;BA.debugLine="txta.RemoveAttr(\"ref\")";
_txta._removeattr /*b4j.example.vmtextfield*/ ("ref");
 //BA.debugLineNum = 2415;BA.debugLine="txta.SetOutlined(True)";
_txta._setoutlined /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2416;BA.debugLine="txta.SetHideDetails(True)";
_txta._sethidedetails /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2417;BA.debugLine="txta.AddClass(\"my-1\")";
_txta._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2418;BA.debugLine="Return txta";
if (true) return _txta;
 //BA.debugLineNum = 2419;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _openpanel(String _pnl) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub OpenPanel(pnl As String) As VMProperty";
 //BA.debugLineNum = 169;BA.debugLine="SetActivePanel(pnl)";
_setactivepanel(_pnl);
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public String  _raisechangeevent() throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="private Sub RaiseChangeEvent";
 //BA.debugLineNum = 185;BA.debugLine="If SubExists(module, changeEvent) Then";
if (__c.SubExists(ba,_module,_changeevent)) { 
 //BA.debugLineNum = 186;BA.debugLine="BANano.CallSub(module, changeEvent, Null)";
_banano.CallSub(_module,_changeevent,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 };
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return "";
}
public int  _recordpos(anywheresoftware.b4a.objects.collections.List _lst,String _k,String _v) throws Exception{
int _ltot = 0;
int _lcnt = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _sk = "";
 //BA.debugLineNum = 1175;BA.debugLine="Sub RecordPos(lst As List, k As String, v As Strin";
 //BA.debugLineNum = 1176;BA.debugLine="Dim lTot As Int = lst.Size - 1";
_ltot = (int) (_lst.getSize()-1);
 //BA.debugLineNum = 1177;BA.debugLine="Dim lCnt As Int";
_lcnt = 0;
 //BA.debugLineNum = 1178;BA.debugLine="For lCnt = 0 To lTot";
{
final int step3 = 1;
final int limit3 = _ltot;
_lcnt = (int) (0) ;
for (;_lcnt <= limit3 ;_lcnt = _lcnt + step3 ) {
 //BA.debugLineNum = 1179;BA.debugLine="Dim m As Map = lst.Get(lCnt)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_lst.Get(_lcnt)));
 //BA.debugLineNum = 1180;BA.debugLine="Dim sk As String = m.GetDefault(k, \"\")";
_sk = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 1181;BA.debugLine="If sk.EqualsIgnoreCase(v) Then";
if (_sk.equalsIgnoreCase(_v)) { 
 //BA.debugLineNum = 1182;BA.debugLine="Return lCnt";
if (true) return _lcnt;
 };
 }
};
 //BA.debugLineNum = 1185;BA.debugLine="Return -1";
if (true) return (int) (-1);
 //BA.debugLineNum = 1186;BA.debugLine="End Sub";
return 0;
}
public String  _saveitem() throws Exception{
anywheresoftware.b4a.objects.collections.Map _item = null;
String _k = "";
String _v = "";
anywheresoftware.b4a.objects.collections.List _b = null;
anywheresoftware.b4a.objects.collections.List _s = null;
anywheresoftware.b4a.objects.collections.List _contents = null;
int _rpos = 0;
 //BA.debugLineNum = 1133;BA.debugLine="Sub SaveItem";
 //BA.debugLineNum = 1134;BA.debugLine="Dim item As Map = CreateMap()";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1135;BA.debugLine="For Each k As String In contentitems";
{
final anywheresoftware.b4a.BA.IterableList group2 = _contentitems;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1136;BA.debugLine="Dim v As String = vue.GetData($\"items${k}\"$)";
_v = BA.ObjectToString(_vue._getdata /*Object*/ (("items"+__c.SmartStringFormatter("",(Object)(_k))+"")));
 //BA.debugLineNum = 1137;BA.debugLine="If v = BANano.UNDEFINED Then v = \"\"";
if ((_v).equals(BA.ObjectToString(_banano.UNDEFINED()))) { 
_v = "";};
 //BA.debugLineNum = 1138;BA.debugLine="item.Put(k, v)";
_item.Put((Object)(_k),(Object)(_v));
 }
};
 //BA.debugLineNum = 1141;BA.debugLine="Dim b As List";
_b = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1142;BA.debugLine="b.Initialize";
_b.Initialize();
 //BA.debugLineNum = 1143;BA.debugLine="Dim s As List";
_s = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1144;BA.debugLine="s.Initialize";
_s.Initialize();
 //BA.debugLineNum = 1145;BA.debugLine="For Each k As String In itemtypes.keys";
{
final anywheresoftware.b4a.BA.IterableList group11 = _itemtypes.Keys();
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_k = BA.ObjectToString(group11.Get(index11));
 //BA.debugLineNum = 1146;BA.debugLine="Dim v As String = itemtypes.Get(k)";
_v = BA.ObjectToString(_itemtypes.Get((Object)(_k)));
 //BA.debugLineNum = 1147;BA.debugLine="If v.EqualsIgnoreCase(\"boolean\") Then b.Add(k)";
if (_v.equalsIgnoreCase("boolean")) { 
_b.Add((Object)(_k));};
 //BA.debugLineNum = 1148;BA.debugLine="If v.EqualsIgnoreCase(\"string\") Then s.Add(k)";
if (_v.equalsIgnoreCase("string")) { 
_s.Add((Object)(_k));};
 }
};
 //BA.debugLineNum = 1150;BA.debugLine="If B.Size > 0 Then vue.MakeYesNo(item, B)";
if (_b.getSize()>0) { 
_vue._makeyesno /*String*/ (_item,_b);};
 //BA.debugLineNum = 1151;BA.debugLine="If S.Size > 0 Then vue.MakeTrim(item, S)";
if (_s.getSize()>0) { 
_vue._maketrim /*String*/ (_item,_s);};
 //BA.debugLineNum = 1154;BA.debugLine="Dim contents As List = vue.GetData(\"tableitems\")";
_contents = new anywheresoftware.b4a.objects.collections.List();
_contents = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_vue._getdata /*Object*/ ("tableitems")));
 //BA.debugLineNum = 1157;BA.debugLine="Dim v As String = item.Get(\"key\")";
_v = BA.ObjectToString(_item.Get((Object)("key")));
 //BA.debugLineNum = 1158;BA.debugLine="If v = \"\" Then Return";
if ((_v).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 1160;BA.debugLine="Dim rpos As Int = RecordPos(contents, \"key\", v)";
_rpos = _recordpos(_contents,"key",_v);
 //BA.debugLineNum = 1161;BA.debugLine="rpos = BANano.parseInt(rpos)";
_rpos = _banano.parseInt((Object)(_rpos));
 //BA.debugLineNum = 1162;BA.debugLine="Select Case rpos";
switch (BA.switchObjectToInt(_rpos,(int) (-1))) {
case 0: {
 //BA.debugLineNum = 1164;BA.debugLine="contents.Add(item)";
_contents.Add((Object)(_item.getObject()));
 break; }
default: {
 //BA.debugLineNum = 1166;BA.debugLine="contents.Set(rpos, item)";
_contents.Set(_rpos,(Object)(_item.getObject()));
 break; }
}
;
 //BA.debugLineNum = 1168;BA.debugLine="vue.SetData(\"tableitems\", contents)";
_vue._setdata /*b4j.example.bananovue*/ ("tableitems",(Object)(_contents.getObject()));
 //BA.debugLineNum = 1169;BA.debugLine="ClearContents";
_clearcontents();
 //BA.debugLineNum = 1171;BA.debugLine="BANano.CallSub(module, changeEvent, Null)";
_banano.CallSub(_module,_changeevent,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 1172;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _setactivepanel(String _activeid) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub SetActivePanel(activeID As String) As VMProper";
 //BA.debugLineNum = 175;BA.debugLine="expnl.SetActivePanel(activeID)";
_expnl._setactivepanel /*b4j.example.vmexpansionpanels*/ (_activeid);
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _setchangeevent(String _cex) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetChangeEvent(cEx As String) As VMProperty";
 //BA.debugLineNum = 180;BA.debugLine="changeEvent = cEx";
_changeevent = _cex;
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public String  _setchecks(String _parent) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetChecks(parent As String)";
 //BA.debugLineNum = 192;BA.debugLine="If hasChecks Then";
if (_haschecks) { 
 //BA.debugLineNum = 193;BA.debugLine="AddContainer(parent, contChecks)";
_addcontainer(_parent,_contchecks);
 };
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 132;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public String  _setdefaults() throws Exception{
 //BA.debugLineNum = 907;BA.debugLine="Sub SetDefaults";
 //BA.debugLineNum = 908;BA.debugLine="vue.SetState(defaults)";
_vue._setstate /*b4j.example.bananovue*/ (_defaults);
 //BA.debugLineNum = 909;BA.debugLine="expnl.OpenPanel(0)";
_expnl._openpanel /*b4j.example.vmexpansionpanels*/ (BA.NumberToString(0));
 //BA.debugLineNum = 910;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _setitemsradio(String _itemkey,anywheresoftware.b4a.objects.collections.Map _itemoptions) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetItemsRadio(itemKey As String, itemOptions A";
 //BA.debugLineNum = 162;BA.debugLine="InternalItemType.Put(itemKey, \"radio\")";
_internalitemtype.Put((Object)(_itemkey),(Object)("radio"));
 //BA.debugLineNum = 163;BA.debugLine="InternalItemTypeOptions.Put(itemKey, itemOptions)";
_internalitemtypeoptions.Put((Object)(_itemkey),(Object)(_itemoptions.getObject()));
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _setitemsselect(String _itemkey,anywheresoftware.b4a.objects.collections.Map _itemoptions) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetItemsSelect(itemKey As String, itemOptions";
 //BA.debugLineNum = 155;BA.debugLine="InternalItemType.Put(itemKey, \"select\")";
_internalitemtype.Put((Object)(_itemkey),(Object)("select"));
 //BA.debugLineNum = 156;BA.debugLine="InternalItemTypeOptions.Put(itemKey, itemOptions)";
_internalitemtypeoptions.Put((Object)(_itemkey),(Object)(_itemoptions.getObject()));
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _setitemsswitch(anywheresoftware.b4a.objects.collections.List _itemkeys) throws Exception{
String _k = "";
 //BA.debugLineNum = 146;BA.debugLine="Sub SetItemsSwitch(itemKeys As List) As VMProperty";
 //BA.debugLineNum = 147;BA.debugLine="For Each k As String In itemKeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _itemkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 148;BA.debugLine="InternalItemType.Put(k,\"switch\")";
_internalitemtype.Put((Object)(_k),(Object)("switch"));
 }
};
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public String  _setproperties(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub setProperties(m As Map)";
 //BA.debugLineNum = 247;BA.debugLine="If Doubles.Size > 0 Then vue.MakeDouble(m, Double";
if (_doubles.getSize()>0) { 
_vue._makedouble /*String*/ (_m,_doubles);};
 //BA.debugLineNum = 248;BA.debugLine="If Integers.Size > 0 Then vue.MakeInteger(m, Inte";
if (_integers.getSize()>0) { 
_vue._makeinteger /*String*/ (_m,_integers);};
 //BA.debugLineNum = 249;BA.debugLine="If Strings.Size > 0 Then vue.MakeTrim(m, Strings)";
if (_strings.getSize()>0) { 
_vue._maketrim /*String*/ (_m,_strings);};
 //BA.debugLineNum = 250;BA.debugLine="If Dates.Size > 0 Then vue.MakeDate(m, Dates)";
if (_dates.getSize()>0) { 
_vue._makedate /*String*/ (_m,_dates);};
 //BA.debugLineNum = 251;BA.debugLine="If Booleans.Size > 0 Then vue.MakeBoolean(m, Bool";
if (_booleans.getSize()>0) { 
_vue._makeboolean /*String*/ (_m,_booleans);};
 //BA.debugLineNum = 252;BA.debugLine="vue.SetState(m)";
_vue._setstate /*b4j.example.bananovue*/ (_m);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetVisible(b As Boolean) As VMProperty";
 //BA.debugLineNum = 140;BA.debugLine="expnl.SetVisible(b)";
_expnl._setvisible /*b4j.example.vmexpansionpanels*/ (_b);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetVShow(vif As String) As VMProperty";
 //BA.debugLineNum = 198;BA.debugLine="sshow = vif";
_sshow = _vif;
 //BA.debugLineNum = 199;BA.debugLine="expnl.SetVShow(vif)";
_expnl._setvshow /*b4j.example.vmexpansionpanels*/ (_vif);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public String  _show() throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub Show";
 //BA.debugLineNum = 208;BA.debugLine="vue.setdata(sshow, True)";
_vue._setdata /*b4j.example.bananovue*/ (_sshow,(Object)(__c.True));
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public String  _showitem(String _item) throws Exception{
 //BA.debugLineNum = 2486;BA.debugLine="Sub ShowItem(item As String)";
 //BA.debugLineNum = 2487;BA.debugLine="item = item.ToLowerCase & \"show\"";
_item = _item.toLowerCase()+"show";
 //BA.debugLineNum = 2488;BA.debugLine="vue.SetData(item, True)";
_vue._setdata /*b4j.example.bananovue*/ (_item,(Object)(__c.True));
 //BA.debugLineNum = 2489;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
String _slabel = "";
String _hdr = "";
anywheresoftware.b4a.objects.collections.List _items = null;
b4j.example.vmexpansionpanel _expanel = null;
b4j.example.vmproperty._propcontrols _nc = null;
b4j.example.vmcontainer _bcont = null;
b4j.example.vmtoolbar _tblx = null;
b4j.example.vmselect _cbo = null;
b4j.example.vmcontainer _tcont = null;
b4j.example.vmcontainer _vc = null;
anywheresoftware.b4a.objects.collections.Map _optx = null;
b4j.example.vmselect _cbo1 = null;
anywheresoftware.b4a.objects.collections.Map _xx = null;
b4j.example.vmtextfield _txta = null;
boolean _iconfound = false;
boolean _lenfound = false;
boolean _forfound = false;
boolean _datfound = false;
boolean _disfound = false;
boolean _usefound = false;
String _k = "";
String _v = "";
String _vmodel = "";
b4j.example.vmcheckbox _sw = null;
String _lblname = "";
b4j.example.vmtextfield _tt = null;
b4j.example.vmradiogroup _rg = null;
b4j.example.vmtextfield _tw = null;
anywheresoftware.b4a.objects.collections.Map _xm = null;
b4j.example.vmcontainer _acont = null;
int _colpos = 0;
b4j.example.vmcontainer _mcont = null;
b4j.example.vmtextfield _rw = null;
b4j.example.vmtextfield _cl = null;
b4j.example.vmtextfield _os = null;
b4j.example.vmtextfield _om = null;
b4j.example.vmtextfield _ol = null;
b4j.example.vmtextfield _oxl = null;
b4j.example.vmtextfield _ss = null;
b4j.example.vmtextfield _sm = null;
b4j.example.vmtextfield _sl = null;
b4j.example.vmtextfield _sxl = null;
b4j.example.vmbutton _btnsaveitem = null;
b4j.example.vmbutton _btndeleteitem = null;
int _rowpos = 0;
b4j.example.vmlist _mitems = null;
String _mlist = "";
String _itype = "";
anywheresoftware.b4a.objects.collections.Map _opts = null;
int _colsize = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _ttot = 0;
b4j.example.vmcontainer _wcont = null;
b4j.example.vmtextfield _w1 = null;
b4j.example.vmtextfield _w2 = null;
b4j.example.vmtextfield _w3 = null;
b4j.example.vmtextfield _h1 = null;
b4j.example.vmtextfield _h2 = null;
b4j.example.vmtextfield _h3 = null;
b4j.example.vmcontainer _scont = null;
String _scombo = "";
b4j.example.vmbutton _btnx = null;
b4j.example.vmslider _sld = null;
b4j.example.vmlabel _lbl = null;
b4j.example.vmbutton _btnicon = null;
b4j.example.vmtextfield _pwd = null;
b4j.example.vmtextfield _text = null;
b4j.example.vmtextfield _numx = null;
b4j.example.vmtextfield _tel = null;
b4j.example.vmtextfield _email = null;
b4j.example.vmcheckbox _chk = null;
b4j.example.vmdatetimepicker _tp = null;
b4j.example.vmdatetimepicker _dp = null;
 //BA.debugLineNum = 1334;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 1335;BA.debugLine="For Each slabel As String In labels.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _labels.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_slabel = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1337;BA.debugLine="Dim hdr As String = labels.get(slabel)";
_hdr = BA.ObjectToString(_labels.Get((Object)(_slabel)));
 //BA.debugLineNum = 1339;BA.debugLine="Dim items As List = controls.Get(slabel)";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_controls.Get((Object)(_slabel))));
 //BA.debugLineNum = 1342;BA.debugLine="Dim expanel As VMExpansionPanel";
_expanel = new b4j.example.vmexpansionpanel();
 //BA.debugLineNum = 1343;BA.debugLine="expanel.initialize(vue, ID, slabel, module)";
_expanel._initialize /*b4j.example.vmexpansionpanel*/ (ba,_vue,_id,_slabel,_module);
 //BA.debugLineNum = 1344;BA.debugLine="expanel.Header.SetText(hdr)";
_expanel._header /*b4j.example.vmexpansionpanelheader*/ ._settext /*b4j.example.vmexpansionpanelheader*/ (_hdr);
 //BA.debugLineNum = 1345;BA.debugLine="expanel.Content.Container.SetTag(\"div\")";
_expanel._content /*b4j.example.vmexpansionpanelcontent*/ ._container /*b4j.example.vmcontainer*/ ._settag /*b4j.example.vmcontainer*/ ("div");
 //BA.debugLineNum = 1346;BA.debugLine="expanel.Content.Container.NoGutters = True";
_expanel._content /*b4j.example.vmexpansionpanelcontent*/ ._container /*b4j.example.vmcontainer*/ ._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 1347;BA.debugLine="expanel.Container.SetFluid(True)";
_expanel._container /*b4j.example.vmcontainer*/ ._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1349;BA.debugLine="For Each nc As PropControls In items";
{
final anywheresoftware.b4a.BA.IterableList group10 = _items;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_nc = (b4j.example.vmproperty._propcontrols)(group10.Get(index10));
 //BA.debugLineNum = 1350;BA.debugLine="Select Case nc.typeOf";
switch (BA.switchObjectToInt(_nc.typeOf /*String*/ ,"designerproperty","dtcolumns","toolbaritems","table","switches","select2","text2","widths","container","sizes","selectboxds","selectbox1","selectbox","selectboxm","button","slider","label","switch","iconbutton","password","text","number","tel","email","textarea","checkbox","radiogroup","timepicker","datepicker")) {
case 0: {
 //BA.debugLineNum = 1352;BA.debugLine="itemtypes.Initialize";
_itemtypes.Initialize();
 //BA.debugLineNum = 1353;BA.debugLine="nc.vmodel = \"items\"";
_nc.vmodel /*String*/  = "items";
 //BA.debugLineNum = 1354;BA.debugLine="Dim bcont As VMContainer";
_bcont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 1355;BA.debugLine="bcont.Initialize(vue, \"tx\" & nc.vmodel, module";
_bcont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"tx"+_nc.vmodel /*String*/ ,_module)._setstatic /*b4j.example.vmcontainer*/ (__c.True)._settag /*b4j.example.vmcontainer*/ ("div")._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 1356;BA.debugLine="bcont.SetFluid(True)";
_bcont._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1357;BA.debugLine="bcont.AddRows(1).AddColumns12";
_bcont._addrows /*b4j.example.vmcontainer*/ ((int) (1))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 1359;BA.debugLine="Dim tblx As VMToolBar = CreateToolbar(\"t\" & nc";
_tblx = _createtoolbar("t"+_nc.vmodel /*String*/ ,this)._setstatic /*b4j.example.vmtoolbar*/ (__c.True)._setflat /*b4j.example.vmtoolbar*/ (__c.True);
 //BA.debugLineNum = 1360;BA.debugLine="tblx.SetDense(True).AddSpacer";
_tblx._setdense /*b4j.example.vmtoolbar*/ (__c.True)._addspacer /*b4j.example.vmtoolbar*/ ();
 //BA.debugLineNum = 1361;BA.debugLine="tblx.AddIcon(\"btnAddTable\", \"mdi-plus\", \"Add i";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnAddTable","mdi-plus","Add item","");
 //BA.debugLineNum = 1362;BA.debugLine="tblx.AddIcon(\"btnAddMultiple\", \"mdi-book-plus-";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnAddMultiple","mdi-book-plus-multiple","Add multiple items","");
 //BA.debugLineNum = 1363;BA.debugLine="tblx.AddIcon(\"btnSaveTable\", \"save\", \"Save ite";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnSaveTable","save","Save item","");
 //BA.debugLineNum = 1364;BA.debugLine="tblx.AddIcon(\"btnDeleteTable\", \"delete\", \"Dele";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnDeleteTable","delete","Delete item","");
 //BA.debugLineNum = 1365;BA.debugLine="tblx.AddIcon(\"btnEmpty\",\"mdi-delete-empty-outl";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnEmpty","mdi-delete-empty-outline","Empty items","");
 //BA.debugLineNum = 1366;BA.debugLine="bcont.AddComponent(1, 1, tblx.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_tblx._tostring /*String*/ ());
 //BA.debugLineNum = 1369;BA.debugLine="Dim cbo As VMSelect";
_cbo = new b4j.example.vmselect();
 //BA.debugLineNum = 1370;BA.debugLine="cbo.Initialize(vue, \"cboKeySelect\", Me)";
_cbo._initialize /*b4j.example.vmselect*/ (ba,_vue,"cboKeySelect",this);
 //BA.debugLineNum = 1371;BA.debugLine="cbo.Setlabel(\"Item Selector\")";
_cbo._setlabel /*b4j.example.vmselect*/ ("Item Selector");
 //BA.debugLineNum = 1372;BA.debugLine="cbo.SetVModel(\"keyselector\")";
_cbo._setvmodel /*b4j.example.vmselect*/ ("keyselector");
 //BA.debugLineNum = 1373;BA.debugLine="cbo.SetDataSource(\"tableitems\", \"key\", \"key\",";
_cbo._setdatasource /*b4j.example.vmselect*/ ("tableitems","key","key",__c.False);
 //BA.debugLineNum = 1374;BA.debugLine="cbo.RemoveAttr(\"ref\")";
_cbo._removeattr /*b4j.example.vmselect*/ ("ref");
 //BA.debugLineNum = 1375;BA.debugLine="cbo.SetDense(True)";
_cbo._setdense /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1376;BA.debugLine="cbo.SetOutlined(True)";
_cbo._setoutlined /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1377;BA.debugLine="cbo.SetHideDetails(True)";
_cbo._sethidedetails /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1378;BA.debugLine="cbo.AddClass(\"my-1\")";
_cbo._addclass /*b4j.example.vmselect*/ ("my-1");
 //BA.debugLineNum = 1379;BA.debugLine="cbo.SetOnChange(Me, \"cboKeySelect\")";
_cbo._setonchange /*b4j.example.vmselect*/ (this,"cboKeySelect");
 //BA.debugLineNum = 1380;BA.debugLine="bcont.AddComponent(1,1, cbo.ToString)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_cbo._tostring /*String*/ ());
 //BA.debugLineNum = 1383;BA.debugLine="Dim tcont As VMContainer";
_tcont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 1384;BA.debugLine="tcont.Initialize(vue, \"tbl\" & nc.vmodel, modul";
_tcont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"tbl"+_nc.vmodel /*String*/ ,_module)._settag /*b4j.example.vmcontainer*/ ("div")._setstatic /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1385;BA.debugLine="tcont.NoGutters = True";
_tcont._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 1386;BA.debugLine="tcont.SetFluid(True)";
_tcont._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1388;BA.debugLine="nc.options.Initialize";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 1389;BA.debugLine="nc.options.Put(\"key\", \"Key\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("key"),(Object)("Key"));
 //BA.debugLineNum = 1390;BA.debugLine="nc.options.Put(\"title\", \"Display Name\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("title"),(Object)("Display Name"));
 //BA.debugLineNum = 1391;BA.debugLine="nc.options.Put(\"colscope\", \"Scope\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colscope"),(Object)("Scope"));
 //BA.debugLineNum = 1392;BA.debugLine="nc.options.Put(\"colfieldtype\", \"Field Type\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colfieldtype"),(Object)("Field Type"));
 //BA.debugLineNum = 1393;BA.debugLine="nc.options.Put(\"coldefaultvalue\", \"Default Val";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("coldefaultvalue"),(Object)("Default Value"));
 //BA.debugLineNum = 1394;BA.debugLine="nc.options.Put(\"subtitle1\", \"Description\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("subtitle1"),(Object)("Description"));
 //BA.debugLineNum = 1395;BA.debugLine="nc.options.Put(\"colminrange\", \"Min Range\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colminrange"),(Object)("Min Range"));
 //BA.debugLineNum = 1396;BA.debugLine="nc.options.Put(\"colmaxrange\", \"Max Range\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colmaxrange"),(Object)("Max Range"));
 //BA.debugLineNum = 1397;BA.debugLine="nc.options.Put(\"collist\", \"List / Parameters\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("collist"),(Object)("List / Parameters"));
 //BA.debugLineNum = 1398;BA.debugLine="nc.options.Put(\"coltype\", \"Type\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("coltype"),(Object)("Type"));
 //BA.debugLineNum = 1399;BA.debugLine="nc.options.Put(\"colsetranges\", \"Set Ranges\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colsetranges"),(Object)("Set Ranges"));
 //BA.debugLineNum = 1400;BA.debugLine="nc.options.Put(\"colhasset\", \"Set\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colhasset"),(Object)("Set"));
 //BA.debugLineNum = 1401;BA.debugLine="nc.options.Put(\"colhasget\", \"Get\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colhasget"),(Object)("Get"));
 //BA.debugLineNum = 1403;BA.debugLine="Dim vc As VMContainer = MultiText(nc, CreateMa";
_vc = _multitext(_nc,__c.createMap(new Object[] {(Object)("key"),(Object)("Key")}));
 //BA.debugLineNum = 1404;BA.debugLine="bcont.AddComponent(1, 1, vc.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_vc._tostring /*String*/ ());
 //BA.debugLineNum = 1406;BA.debugLine="Dim vc As VMContainer = MultiText(nc, CreateMa";
_vc = _multitext(_nc,__c.createMap(new Object[] {(Object)("title"),(Object)("Display Name")}));
 //BA.debugLineNum = 1407;BA.debugLine="bcont.AddComponent(1, 1, vc.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_vc._tostring /*String*/ ());
 //BA.debugLineNum = 1409;BA.debugLine="Dim vc As VMContainer = MultiText(nc, CreateMa";
_vc = _multitext(_nc,__c.createMap(new Object[] {(Object)("coldefaultvalue"),(Object)("Default Value")}));
 //BA.debugLineNum = 1410;BA.debugLine="bcont.AddComponent(1, 1, vc.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_vc._tostring /*String*/ ());
 //BA.debugLineNum = 1412;BA.debugLine="Dim optx As Map = vue.List2MapSimple(Array(\"St";
_optx = new anywheresoftware.b4a.objects.collections.Map();
_optx = _vue._list2mapsimple /*anywheresoftware.b4a.objects.collections.Map*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("String"),(Object)("StringBuilder"),(Object)("Byte"),(Object)("Int"),(Object)("Long"),(Object)("Map"),(Object)("List"),(Object)("Object"),(Object)("Canvas"),(Object)("Boolean"),(Object)("Short"),(Object)("Float"),(Object)("Double"),(Object)("Char"),(Object)("Color")}),__c.True);
 //BA.debugLineNum = 1414;BA.debugLine="Dim vc As VMContainer = MultiSelect(nc, \"colsc";
_vc = _multiselect(_nc,"colscope","Scope",__c.createMap(new Object[] {(Object)("Private"),(Object)("Private"),(Object)("Public"),(Object)("Public")}),"colfieldtype","Field Type",_optx);
 //BA.debugLineNum = 1416;BA.debugLine="bcont.AddComponent(1, 1, vc.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_vc._tostring /*String*/ ());
 //BA.debugLineNum = 1418;BA.debugLine="Dim cbo1 As VMSelect";
_cbo1 = new b4j.example.vmselect();
 //BA.debugLineNum = 1419;BA.debugLine="cbo1.Initialize(vue, \"coltype\", module).SetSta";
_cbo1._initialize /*b4j.example.vmselect*/ (ba,_vue,"coltype",_module)._setstatic /*b4j.example.vmselect*/ (__c.True)._setlabel /*b4j.example.vmselect*/ ("Type")._setvmodel /*b4j.example.vmselect*/ ((""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+"coltype"));
 //BA.debugLineNum = 1420;BA.debugLine="Dim xx As Map = CreateMap(\"isconstant\":\"Consta";
_xx = new anywheresoftware.b4a.objects.collections.Map();
_xx = __c.createMap(new Object[] {(Object)("isconstant"),(Object)("Constant"),(Object)("isproperty"),(Object)("Property"),(Object)("isdesign"),(Object)("Design Property"),(Object)("isevent"),(Object)("Event"),(Object)("isclass"),(Object)("Class Name"),(Object)("isstyle"),(Object)("Style")});
 //BA.debugLineNum = 1421;BA.debugLine="cbo1.SetOptions(\"coltypes\", xx, \"id\", \"text\",";
_cbo1._setoptions /*b4j.example.vmselect*/ ("coltypes",_xx,"id","text",__c.False)._removeattr /*b4j.example.vmselect*/ ("ref")._setdense /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1422;BA.debugLine="cbo1.SetOutlined(True).SetHideDetails(True).Ad";
_cbo1._setoutlined /*b4j.example.vmselect*/ (__c.True)._sethidedetails /*b4j.example.vmselect*/ (__c.True)._addclass /*b4j.example.vmselect*/ ("my-1");
 //BA.debugLineNum = 1423;BA.debugLine="bcont.AddComponent(1, 1, cbo1.ToString)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_cbo1._tostring /*String*/ ());
 //BA.debugLineNum = 1425;BA.debugLine="Dim vc As VMContainer = MultiText(nc, CreateMa";
_vc = _multitext(_nc,__c.createMap(new Object[] {(Object)("subtitle1"),(Object)("Description")}));
 //BA.debugLineNum = 1426;BA.debugLine="bcont.AddComponent(1, 1, vc.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_vc._tostring /*String*/ ());
 //BA.debugLineNum = 1428;BA.debugLine="Dim vc As VMContainer = MultiText(nc, CreateMa";
_vc = _multitext(_nc,__c.createMap(new Object[] {(Object)("colminrange"),(Object)("Min Range"),(Object)("colmaxrange"),(Object)("Max Range")}));
 //BA.debugLineNum = 1429;BA.debugLine="bcont.AddComponent(1, 1, vc.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_vc._tostring /*String*/ ());
 //BA.debugLineNum = 1431;BA.debugLine="Dim txta As VMTextField = NewTextArea(\"collist";
_txta = _newtextarea("collist",(""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+"collist"),"List / Parameters");
 //BA.debugLineNum = 1432;BA.debugLine="bcont.AddComponent(1, 1, txta.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_txta._tostring /*String*/ ());
 //BA.debugLineNum = 1434;BA.debugLine="Dim vc As VMContainer = MultiSwitches(nc, Crea";
_vc = _multiswitches(_nc,__c.createMap(new Object[] {(Object)("colsetranges"),(Object)("Set Ranges")}));
 //BA.debugLineNum = 1435;BA.debugLine="bcont.AddComponent(1, 1, vc.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_vc._tostring /*String*/ ());
 //BA.debugLineNum = 1437;BA.debugLine="Dim vc As VMContainer = MultiSwitches(nc, Crea";
_vc = _multiswitches(_nc,__c.createMap(new Object[] {(Object)("colhasset"),(Object)("Set"),(Object)("colhasget"),(Object)("Get")}));
 //BA.debugLineNum = 1438;BA.debugLine="bcont.AddComponent(1, 1, vc.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_vc._tostring /*String*/ ());
 //BA.debugLineNum = 1439;BA.debugLine="expanel.Container.AddControlS(bcont.Container,";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_bcont._container /*b4j.example.vmelement*/ ,_bcont._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 1: {
 //BA.debugLineNum = 1443;BA.debugLine="Dim iconfound As Boolean = False";
_iconfound = __c.False;
 //BA.debugLineNum = 1444;BA.debugLine="Dim lenfound As Boolean = False";
_lenfound = __c.False;
 //BA.debugLineNum = 1445;BA.debugLine="Dim forfound As Boolean = False";
_forfound = __c.False;
 //BA.debugLineNum = 1446;BA.debugLine="Dim datfound As Boolean = False";
_datfound = __c.False;
 //BA.debugLineNum = 1447;BA.debugLine="Dim disfound As Boolean = False";
_disfound = __c.False;
 //BA.debugLineNum = 1448;BA.debugLine="Dim useFound As Boolean = False";
_usefound = __c.False;
 //BA.debugLineNum = 1450;BA.debugLine="itemtypes.Initialize";
_itemtypes.Initialize();
 //BA.debugLineNum = 1451;BA.debugLine="nc.vmodel = \"items\"";
_nc.vmodel /*String*/  = "items";
 //BA.debugLineNum = 1452;BA.debugLine="Dim bcont As VMContainer";
_bcont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 1453;BA.debugLine="bcont.Initialize(vue, \"tx\" & nc.vmodel, module";
_bcont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"tx"+_nc.vmodel /*String*/ ,_module)._setstatic /*b4j.example.vmcontainer*/ (__c.True)._settag /*b4j.example.vmcontainer*/ ("div")._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 1454;BA.debugLine="bcont.SetFluid(True)";
_bcont._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1455;BA.debugLine="bcont.AddRows(2).AddColumns12";
_bcont._addrows /*b4j.example.vmcontainer*/ ((int) (2))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 1457;BA.debugLine="Dim tblx As VMToolBar = CreateToolbar(\"t\" & nc";
_tblx = _createtoolbar("t"+_nc.vmodel /*String*/ ,this)._setstatic /*b4j.example.vmtoolbar*/ (__c.True)._setflat /*b4j.example.vmtoolbar*/ (__c.True);
 //BA.debugLineNum = 1458;BA.debugLine="tblx.SetDense(True).AddSpacer";
_tblx._setdense /*b4j.example.vmtoolbar*/ (__c.True)._addspacer /*b4j.example.vmtoolbar*/ ();
 //BA.debugLineNum = 1459;BA.debugLine="tblx.AddIcon(\"btnAddTable\", \"mdi-plus\", \"Add i";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnAddTable","mdi-plus","Add item","");
 //BA.debugLineNum = 1460;BA.debugLine="tblx.AddIcon(\"btnAddMultiple\", \"mdi-book-plus-";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnAddMultiple","mdi-book-plus-multiple","Add multiple items","");
 //BA.debugLineNum = 1461;BA.debugLine="tblx.AddIcon(\"btnSaveTable\", \"save\", \"Save ite";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnSaveTable","save","Save item","");
 //BA.debugLineNum = 1462;BA.debugLine="tblx.AddIcon(\"btnDeleteTable\", \"delete\", \"Dele";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnDeleteTable","delete","Delete item","");
 //BA.debugLineNum = 1463;BA.debugLine="tblx.AddIcon(\"btnEmpty\",\"mdi-delete-empty-outl";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnEmpty","mdi-delete-empty-outline","Empty items","");
 //BA.debugLineNum = 1464;BA.debugLine="bcont.AddComponent(1, 1, tblx.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_tblx._tostring /*String*/ ());
 //BA.debugLineNum = 1466;BA.debugLine="Dim cbo As VMSelect";
_cbo = new b4j.example.vmselect();
 //BA.debugLineNum = 1467;BA.debugLine="cbo.Initialize(vue, \"cboKeySelect\", Me)";
_cbo._initialize /*b4j.example.vmselect*/ (ba,_vue,"cboKeySelect",this);
 //BA.debugLineNum = 1468;BA.debugLine="cbo.Setlabel(\"Item Selector\")";
_cbo._setlabel /*b4j.example.vmselect*/ ("Item Selector");
 //BA.debugLineNum = 1469;BA.debugLine="cbo.SetVModel(\"keyselector\")";
_cbo._setvmodel /*b4j.example.vmselect*/ ("keyselector");
 //BA.debugLineNum = 1470;BA.debugLine="cbo.SetDataSource(\"tableitems\", \"key\", \"key\",";
_cbo._setdatasource /*b4j.example.vmselect*/ ("tableitems","key","key",__c.False);
 //BA.debugLineNum = 1471;BA.debugLine="cbo.RemoveAttr(\"ref\")";
_cbo._removeattr /*b4j.example.vmselect*/ ("ref");
 //BA.debugLineNum = 1472;BA.debugLine="cbo.SetDense(True)";
_cbo._setdense /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1473;BA.debugLine="cbo.SetOutlined(True)";
_cbo._setoutlined /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1474;BA.debugLine="cbo.SetHideDetails(True)";
_cbo._sethidedetails /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1475;BA.debugLine="cbo.AddClass(\"my-1\")";
_cbo._addclass /*b4j.example.vmselect*/ ("my-1");
 //BA.debugLineNum = 1476;BA.debugLine="cbo.SetOnChange(Me, \"cboKeySelect\")";
_cbo._setonchange /*b4j.example.vmselect*/ (this,"cboKeySelect");
 //BA.debugLineNum = 1477;BA.debugLine="bcont.AddComponent(1,1, cbo.ToString)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_cbo._tostring /*String*/ ());
 //BA.debugLineNum = 1480;BA.debugLine="Dim tcont As VMContainer";
_tcont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 1481;BA.debugLine="tcont.Initialize(vue, \"tbl\" & nc.vmodel, modul";
_tcont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"tbl"+_nc.vmodel /*String*/ ,_module)._settag /*b4j.example.vmcontainer*/ ("div")._setstatic /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1482;BA.debugLine="tcont.NoGutters = True";
_tcont._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 1483;BA.debugLine="tcont.SetFluid(True)";
_tcont._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1485;BA.debugLine="nc.options.Initialize";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 1486;BA.debugLine="nc.options.Put(\"key\", \"Name\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("key"),(Object)("Name"));
 //BA.debugLineNum = 1487;BA.debugLine="nc.options.Put(\"title\", \"Title\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("title"),(Object)("Title"));
 //BA.debugLineNum = 1488;BA.debugLine="nc.options.Put(\"subtitle\", \"Col Type\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("subtitle"),(Object)("Col Type"));
 //BA.debugLineNum = 1489;BA.debugLine="nc.options.Put(\"colwidth\", \"Width\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colwidth"),(Object)("Width"));
 //BA.debugLineNum = 1490;BA.debugLine="nc.options.Put(\"icon\", \"Icon\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("icon"),(Object)("Icon"));
 //BA.debugLineNum = 1491;BA.debugLine="nc.options.Put(\"colalign\", \"Col Align\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colalign"),(Object)("Col Align"));
 //BA.debugLineNum = 1492;BA.debugLine="nc.options.Put(\"colcontroltype\", \"Component\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colcontroltype"),(Object)("Component"));
 //BA.debugLineNum = 1493;BA.debugLine="nc.options.Put(\"coldatatype\", \"Data Type\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("coldatatype"),(Object)("Data Type"));
 //BA.debugLineNum = 1494;BA.debugLine="nc.options.Put(\"collength\", \"Length\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("collength"),(Object)("Length"));
 //BA.debugLineNum = 1495;BA.debugLine="nc.options.Put(\"colvalue\", \"Value\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colvalue"),(Object)("Value"));
 //BA.debugLineNum = 1496;BA.debugLine="nc.options.Put(\"coldateformat\", \"DateFormat\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("coldateformat"),(Object)("DateFormat"));
 //BA.debugLineNum = 1498;BA.debugLine="nc.options.Put(\"colislookup\", \"Look Up\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colislookup"),(Object)("Look Up"));
 //BA.debugLineNum = 1499;BA.debugLine="nc.options.Put(\"colforeigntable\",\"ForeignTable";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colforeigntable"),(Object)("ForeignTable"));
 //BA.debugLineNum = 1500;BA.debugLine="nc.options.Put(\"colforeignkey\", \"ForeignKey\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colforeignkey"),(Object)("ForeignKey"));
 //BA.debugLineNum = 1501;BA.debugLine="nc.options.Put(\"colforeignvalue\", \"ForeignValu";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colforeignvalue"),(Object)("ForeignValue"));
 //BA.debugLineNum = 1503;BA.debugLine="nc.options.Put(\"coluseoptions\",\"Use These Item";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("coluseoptions"),(Object)("Use These Items"));
 //BA.debugLineNum = 1504;BA.debugLine="nc.options.Put(\"colkeys\", \"Item Keys (,)\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colkeys"),(Object)("Item Keys (,)"));
 //BA.debugLineNum = 1505;BA.debugLine="nc.options.Put(\"colvalues\", \"Item Values (,)\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colvalues"),(Object)("Item Values (,)"));
 //BA.debugLineNum = 1507;BA.debugLine="nc.options.Put(\"colisautofocus\", \"AutoFocus\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colisautofocus"),(Object)("AutoFocus"));
 //BA.debugLineNum = 1508;BA.debugLine="nc.options.Put(\"colishidedetails\",\"HideDetails";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colishidedetails"),(Object)("HideDetails"));
 //BA.debugLineNum = 1509;BA.debugLine="nc.options.Put(\"colisdense\", \"Dense\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colisdense"),(Object)("Dense"));
 //BA.debugLineNum = 1510;BA.debugLine="nc.options.Put(\"colnoduplicate\", \"Unique\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colnoduplicate"),(Object)("Unique"));
 //BA.debugLineNum = 1511;BA.debugLine="nc.Options.Put(\"colprimarykey\", \"Primary Key\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colprimarykey"),(Object)("Primary Key"));
 //BA.debugLineNum = 1512;BA.debugLine="nc.options.Put(\"coldisplayvalue\", \"Display Val";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("coldisplayvalue"),(Object)("Display Value"));
 //BA.debugLineNum = 1513;BA.debugLine="nc.options.Put(\"colautoincrement\", \"Auto Incre";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colautoincrement"),(Object)("Auto Increment"));
 //BA.debugLineNum = 1514;BA.debugLine="nc.options.Put(\"colsortable\", \"Sortable\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colsortable"),(Object)("Sortable"));
 //BA.debugLineNum = 1515;BA.debugLine="nc.options.Put(\"colrequired\", \"Required\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colrequired"),(Object)("Required"));
 //BA.debugLineNum = 1516;BA.debugLine="nc.options.Put(\"colvisible\", \"Visible\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colvisible"),(Object)("Visible"));
 //BA.debugLineNum = 1517;BA.debugLine="nc.options.Put(\"colactive\", \"Active\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colactive"),(Object)("Active"));
 //BA.debugLineNum = 1518;BA.debugLine="nc.options.Put(\"colontable\", \"On Table\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colontable"),(Object)("On Table"));
 //BA.debugLineNum = 1519;BA.debugLine="nc.options.Put(\"colindexed\", \"Indexed\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colindexed"),(Object)("Indexed"));
 //BA.debugLineNum = 1521;BA.debugLine="nc.options.Put(\"colrow\", \"Row\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colrow"),(Object)("Row"));
 //BA.debugLineNum = 1522;BA.debugLine="nc.options.Put(\"colcolumn\", \"Col\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colcolumn"),(Object)("Col"));
 //BA.debugLineNum = 1523;BA.debugLine="nc.options.Put(\"coloffsetsmall\", \"OS\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("coloffsetsmall"),(Object)("OS"));
 //BA.debugLineNum = 1524;BA.debugLine="nc.options.Put(\"coloffsetmedium\", \"OM\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("coloffsetmedium"),(Object)("OM"));
 //BA.debugLineNum = 1525;BA.debugLine="nc.options.Put(\"coloffsetlarge\", \"OL\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("coloffsetlarge"),(Object)("OL"));
 //BA.debugLineNum = 1526;BA.debugLine="nc.options.Put(\"coloffsetxlarge\", \"OX\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("coloffsetxlarge"),(Object)("OX"));
 //BA.debugLineNum = 1527;BA.debugLine="nc.options.Put(\"colsizesmall\", \"SS\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colsizesmall"),(Object)("SS"));
 //BA.debugLineNum = 1528;BA.debugLine="nc.options.Put(\"colsizemedium\", \"SM\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colsizemedium"),(Object)("SM"));
 //BA.debugLineNum = 1529;BA.debugLine="nc.options.Put(\"colsizelarge\", \"SL\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colsizelarge"),(Object)("SL"));
 //BA.debugLineNum = 1530;BA.debugLine="nc.options.Put(\"colsizexlarge\", \"SX\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colsizexlarge"),(Object)("SX"));
 //BA.debugLineNum = 1533;BA.debugLine="Dim vc As VMContainer = MultiText(nc, CreateMa";
_vc = _multitext(_nc,__c.createMap(new Object[] {(Object)("key"),(Object)("Name"),(Object)("title"),(Object)("Title")}));
 //BA.debugLineNum = 1534;BA.debugLine="bcont.AddComponent(1, 1, vc.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_vc._tostring /*String*/ ());
 //BA.debugLineNum = 1537;BA.debugLine="For Each k As String In nc.options.Keys";
{
final anywheresoftware.b4a.BA.IterableList group164 = _nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen164 = group164.getSize()
;int index164 = 0;
;
for (; index164 < groupLen164;index164++){
_k = BA.ObjectToString(group164.Get(index164));
 //BA.debugLineNum = 1538;BA.debugLine="Dim v As String = nc.options.Get(k)";
_v = BA.ObjectToString(_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
 //BA.debugLineNum = 1539;BA.debugLine="Dim vmodel As String = $\"${nc.vmodel}${k}\"$";
_vmodel = (""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+""+__c.SmartStringFormatter("",(Object)(_k))+"");
 //BA.debugLineNum = 1541;BA.debugLine="If iconfound Then";
if (_iconfound) { 
 //BA.debugLineNum = 1542;BA.debugLine="Dim vc As VMContainer = MultiText(nc, Create";
_vc = _multitext(_nc,__c.createMap(new Object[] {(Object)("colwidth"),(Object)("Col Width"),(Object)("icon"),(Object)("Col Icon")}));
 //BA.debugLineNum = 1543;BA.debugLine="tcont.AddControlS(vc.Container, vc.ToString,";
_tcont._addcontrols /*String*/ (_vc._container /*b4j.example.vmelement*/ ,_vc._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 1544;BA.debugLine="iconfound = False";
_iconfound = __c.False;
 };
 //BA.debugLineNum = 1547;BA.debugLine="If lenfound Then";
if (_lenfound) { 
 //BA.debugLineNum = 1548;BA.debugLine="Dim vc As VMContainer = MultiText(nc, Create";
_vc = _multitext(_nc,__c.createMap(new Object[] {(Object)("collength"),(Object)("Length"),(Object)("colvalue"),(Object)("Value")}));
 //BA.debugLineNum = 1549;BA.debugLine="tcont.AddControlS(vc.Container, vc.ToString,";
_tcont._addcontrols /*String*/ (_vc._container /*b4j.example.vmelement*/ ,_vc._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 1550;BA.debugLine="lenfound = False";
_lenfound = __c.False;
 };
 //BA.debugLineNum = 1553;BA.debugLine="If datfound Then";
if (_datfound) { 
 //BA.debugLineNum = 1554;BA.debugLine="Dim vc As VMContainer = MultiSelect(nc, \"col";
_vc = _multiselect(_nc,"colcontroltype","Component",_vue._controltypes /*anywheresoftware.b4a.objects.collections.Map*/ ,"coldatatype","Data Type",_vue._datatypes /*anywheresoftware.b4a.objects.collections.Map*/ );
 //BA.debugLineNum = 1556;BA.debugLine="tcont.AddControlS(vc.Container, vc.ToString,";
_tcont._addcontrols /*String*/ (_vc._container /*b4j.example.vmelement*/ ,_vc._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 1557;BA.debugLine="itemtypes.put(\"colcontroltype\", \"String\")";
_itemtypes.Put((Object)("colcontroltype"),(Object)("String"));
 //BA.debugLineNum = 1558;BA.debugLine="itemtypes.Put(\"coldatatype\", \"String\")";
_itemtypes.Put((Object)("coldatatype"),(Object)("String"));
 //BA.debugLineNum = 1559;BA.debugLine="datfound = False";
_datfound = __c.False;
 };
 //BA.debugLineNum = 1562;BA.debugLine="If disfound Then";
if (_disfound) { 
 //BA.debugLineNum = 1563;BA.debugLine="Dim vc As VMContainer = MultiText(nc, Create";
_vc = _multitext(_nc,__c.createMap(new Object[] {(Object)("colforeignkey"),(Object)("ForeignKey"),(Object)("colforeignvalue"),(Object)("ForeignValue")}));
 //BA.debugLineNum = 1564;BA.debugLine="tcont.AddControlS(vc.Container, vc.ToString,";
_tcont._addcontrols /*String*/ (_vc._container /*b4j.example.vmelement*/ ,_vc._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 1565;BA.debugLine="disfound = False";
_disfound = __c.False;
 };
 //BA.debugLineNum = 1568;BA.debugLine="Select Case k";
switch (BA.switchObjectToInt(_k,"colislookup","coluseoptions","colkeys","colvalues","coldateformat","colvalue","colwidth","collength","icon","key","title","colrow","colcolumn","coloffsetsmall","coloffsetmedium","coloffsetlarge","coloffsetxlarge","colsizesmall","colsizemedium","colsizelarge","colsizexlarge","colsortable","colrequired","colvisible","colindexed","colactive","colontable","colislookup","colisautofocus","colishidedetails","colisdense","colnoduplicate","colprimarykey","coldisplayvalue","colautoincrement","colalign","colcontroltype","coldatatype","subtitle","colforeigntable","colforeignkey","colforeignvalue")) {
case 0: {
 //BA.debugLineNum = 1570;BA.debugLine="Dim sw As VMCheckBox = AddSwitchA(k, $\"${nc.";
_sw = _addswitcha(_k,(""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+""+__c.SmartStringFormatter("",(Object)(_k))+""),"Look Up");
 //BA.debugLineNum = 1571;BA.debugLine="tcont.AddControlS(sw.CheckBox, sw.ToString,";
_tcont._addcontrols /*String*/ (_sw._checkbox /*b4j.example.vmelement*/ ,_sw._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 1572;BA.debugLine="itemtypes.Put(k, \"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 break; }
case 1: {
 //BA.debugLineNum = 1574;BA.debugLine="Dim sw As VMCheckBox = AddSwitchA(k, $\"${nc.";
_sw = _addswitcha(_k,(""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+""+__c.SmartStringFormatter("",(Object)(_k))+""),"Use These Items");
 //BA.debugLineNum = 1575;BA.debugLine="tcont.AddControlS(sw.CheckBox, sw.ToString,";
_tcont._addcontrols /*String*/ (_sw._checkbox /*b4j.example.vmelement*/ ,_sw._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 1576;BA.debugLine="itemtypes.Put(k, \"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 break; }
case 2: 
case 3: {
 //BA.debugLineNum = 1578;BA.debugLine="Dim lblName As String = \"Item Keys (,)\"";
_lblname = "Item Keys (,)";
 //BA.debugLineNum = 1579;BA.debugLine="If k = \"colvalues\" Then lblName = \"Item Valu";
if ((_k).equals("colvalues")) { 
_lblname = "Item Values (,)";};
 //BA.debugLineNum = 1580;BA.debugLine="Dim tt As VMTextField = AddTextFieldA(k, $\"$";
_tt = _addtextfielda(_k,(""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+""+__c.SmartStringFormatter("",(Object)(_k))+""),_lblname);
 //BA.debugLineNum = 1581;BA.debugLine="tcont.AddControlS(tt.TextField, tt.ToString,";
_tcont._addcontrols /*String*/ (_tt._textfield /*b4j.example.vmelement*/ ,_tt._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 1582;BA.debugLine="itemtypes.Put(k, \"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 //BA.debugLineNum = 1583;BA.debugLine="vue.SetData(vmodel,\"\")";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(""));
 break; }
case 4: {
 //BA.debugLineNum = 1585;BA.debugLine="Dim tt As VMTextField = AddTextFieldA(k, $\"$";
_tt = _addtextfielda(_k,(""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+""+__c.SmartStringFormatter("",(Object)(_k))+""),"DateFormat");
 //BA.debugLineNum = 1586;BA.debugLine="tcont.AddControlS(tt.TextField, tt.ToString,";
_tcont._addcontrols /*String*/ (_tt._textfield /*b4j.example.vmelement*/ ,_tt._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 1587;BA.debugLine="itemtypes.Put(k, \"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 //BA.debugLineNum = 1588;BA.debugLine="vue.SetData(vmodel,\"\")";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(""));
 break; }
case 5: {
 //BA.debugLineNum = 1590;BA.debugLine="lenfound = True";
_lenfound = __c.True;
 //BA.debugLineNum = 1591;BA.debugLine="itemtypes.Put(k, \"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 //BA.debugLineNum = 1592;BA.debugLine="vue.SetData(vmodel,\"\")";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(""));
 break; }
case 6: 
case 7: {
 //BA.debugLineNum = 1594;BA.debugLine="itemtypes.Put(k, \"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 //BA.debugLineNum = 1595;BA.debugLine="vue.SetData(vmodel,\"\")";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(""));
 break; }
case 8: {
 //BA.debugLineNum = 1597;BA.debugLine="iconfound = True";
_iconfound = __c.True;
 //BA.debugLineNum = 1598;BA.debugLine="itemtypes.Put(k, \"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 //BA.debugLineNum = 1599;BA.debugLine="vue.SetData(vmodel,\"\")";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(""));
 break; }
case 9: 
case 10: {
 //BA.debugLineNum = 1601;BA.debugLine="itemtypes.Put(k, \"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 //BA.debugLineNum = 1602;BA.debugLine="vue.SetData(vmodel,\"\")";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(""));
 break; }
case 11: 
case 12: 
case 13: 
case 14: 
case 15: 
case 16: {
 //BA.debugLineNum = 1604;BA.debugLine="itemtypes.Put(k, \"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 break; }
case 17: 
case 18: 
case 19: 
case 20: {
 //BA.debugLineNum = 1606;BA.debugLine="itemtypes.Put(k, \"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 break; }
case 21: 
case 22: 
case 23: 
case 24: 
case 25: 
case 26: 
case 27: 
case 28: 
case 29: 
case 30: 
case 31: 
case 32: 
case 33: 
case 34: {
 //BA.debugLineNum = 1610;BA.debugLine="itemtypes.put(k, \"Boolean\")";
_itemtypes.Put((Object)(_k),(Object)("Boolean"));
 break; }
case 35: {
 //BA.debugLineNum = 1612;BA.debugLine="Dim rg As VMRadioGroup";
_rg = new b4j.example.vmradiogroup();
 //BA.debugLineNum = 1613;BA.debugLine="rg.Initialize(vue, \"rgalign\", module).SetSta";
_rg._initialize /*b4j.example.vmradiogroup*/ (ba,_vue,"rgalign",_module)._setstatic /*b4j.example.vmradiogroup*/ (__c.True)._setvmodel /*b4j.example.vmradiogroup*/ (_vmodel)._setlabel /*b4j.example.vmradiogroup*/ (_v);
 //BA.debugLineNum = 1614;BA.debugLine="rg.SetOptions(CreateMap(\"start\":\"Start\",\"cen";
_rg._setoptions /*String*/ (__c.createMap(new Object[] {(Object)("start"),(Object)("Start"),(Object)("center"),(Object)("Center"),(Object)("end"),(Object)("End")}));
 //BA.debugLineNum = 1615;BA.debugLine="vue.SetData(vmodel, \"start\")";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)("start"));
 //BA.debugLineNum = 1616;BA.debugLine="rg.SetDense(True).SetRow(True).RemoveAttr(\"r";
_rg._setdense /*b4j.example.vmradiogroup*/ (__c.True)._setrow /*b4j.example.vmradiogroup*/ (__c.True)._removeattr /*b4j.example.vmradiogroup*/ ("ref")._sethidedetails /*b4j.example.vmradiogroup*/ (__c.True);
 //BA.debugLineNum = 1617;BA.debugLine="rg.AddClass(\"my-1\")";
_rg._addclass /*b4j.example.vmradiogroup*/ ("my-1");
 //BA.debugLineNum = 1618;BA.debugLine="tcont.AddControlS(rg.RadioGroup, rg.ToString";
_tcont._addcontrols /*String*/ (_rg._radiogroup /*b4j.example.vmelement*/ ,_rg._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 1619;BA.debugLine="itemtypes.put(k, \"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 break; }
case 36: {
 //BA.debugLineNum = 1621;BA.debugLine="itemtypes.Put(k, \"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 //BA.debugLineNum = 1622;BA.debugLine="vue.SetData(vmodel, \"\")";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(""));
 break; }
case 37: {
 //BA.debugLineNum = 1624;BA.debugLine="datfound = True";
_datfound = __c.True;
 //BA.debugLineNum = 1625;BA.debugLine="itemtypes.Put(k, \"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 //BA.debugLineNum = 1626;BA.debugLine="vue.SetData(vmodel,\"\")";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(""));
 break; }
case 38: {
 //BA.debugLineNum = 1628;BA.debugLine="Dim cbo As VMSelect";
_cbo = new b4j.example.vmselect();
 //BA.debugLineNum = 1629;BA.debugLine="cbo.Initialize(vue, \"cbosubtitle\", module).S";
_cbo._initialize /*b4j.example.vmselect*/ (ba,_vue,"cbosubtitle",_module)._setstatic /*b4j.example.vmselect*/ (__c.True)._setlabel /*b4j.example.vmselect*/ (_v)._setvmodel /*b4j.example.vmselect*/ (_vmodel);
 //BA.debugLineNum = 1630;BA.debugLine="cbo.SetOptions(\"columntypes\", vue.ColumnType";
_cbo._setoptions /*b4j.example.vmselect*/ ("columntypes",_vue._columntypes /*anywheresoftware.b4a.objects.collections.Map*/ ,"id","text",__c.False);
 //BA.debugLineNum = 1631;BA.debugLine="cbo.RemoveAttr(\"ref\").SetDense(True).SetOutl";
_cbo._removeattr /*b4j.example.vmselect*/ ("ref")._setdense /*b4j.example.vmselect*/ (__c.True)._setoutlined /*b4j.example.vmselect*/ (__c.True)._sethidedetails /*b4j.example.vmselect*/ (__c.True)._addclass /*b4j.example.vmselect*/ ("my-1");
 //BA.debugLineNum = 1632;BA.debugLine="tcont.AddControlS(cbo.Combo, cbo.ToString, 1";
_tcont._addcontrols /*String*/ (_cbo._combo /*b4j.example.vmelement*/ ,_cbo._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 1633;BA.debugLine="itemtypes.put(k,\"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 break; }
case 39: {
 //BA.debugLineNum = 1636;BA.debugLine="Dim cbo As VMSelect";
_cbo = new b4j.example.vmselect();
 //BA.debugLineNum = 1637;BA.debugLine="cbo.Initialize(vue, \"colforeigntable\" , modu";
_cbo._initialize /*b4j.example.vmselect*/ (ba,_vue,"colforeigntable",_module)._setstatic /*b4j.example.vmselect*/ (__c.True)._setlabel /*b4j.example.vmselect*/ ("ForeignTable")._setvmodel /*b4j.example.vmselect*/ (_vmodel);
 //BA.debugLineNum = 1638;BA.debugLine="cbo.SetDataSource(\"tablenames\", \"tablename\",";
_cbo._setdatasource /*b4j.example.vmselect*/ ("tablenames","tablename","tablename",__c.False);
 //BA.debugLineNum = 1639;BA.debugLine="cbo.RemoveAttr(\"ref\").SetDense(True).SetOutl";
_cbo._removeattr /*b4j.example.vmselect*/ ("ref")._setdense /*b4j.example.vmselect*/ (__c.True)._setoutlined /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1640;BA.debugLine="cbo.SetHideDetails(True).AddClass(\"my-1\")";
_cbo._sethidedetails /*b4j.example.vmselect*/ (__c.True)._addclass /*b4j.example.vmselect*/ ("my-1");
 //BA.debugLineNum = 1641;BA.debugLine="cbo.SetOnChange(module, \"colforeigntable_cha";
_cbo._setonchange /*b4j.example.vmselect*/ (_module,"colforeigntable_change");
 //BA.debugLineNum = 1642;BA.debugLine="tcont.AddControlS(cbo.Combo, cbo.ToString, 1";
_tcont._addcontrols /*String*/ (_cbo._combo /*b4j.example.vmelement*/ ,_cbo._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 1643;BA.debugLine="itemtypes.put(k,\"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 break; }
case 40: {
 //BA.debugLineNum = 1646;BA.debugLine="itemtypes.put(k,\"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 //BA.debugLineNum = 1647;BA.debugLine="vue.SetData(vmodel,\"\")";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(""));
 break; }
case 41: {
 //BA.debugLineNum = 1650;BA.debugLine="itemtypes.put(k,\"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 //BA.debugLineNum = 1651;BA.debugLine="disfound = True";
_disfound = __c.True;
 //BA.debugLineNum = 1652;BA.debugLine="vue.SetData(vmodel,\"\")";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(""));
 break; }
default: {
 //BA.debugLineNum = 1654;BA.debugLine="Dim tw As VMTextField";
_tw = new b4j.example.vmtextfield();
 //BA.debugLineNum = 1655;BA.debugLine="tw.Initialize(vue, vmodel, module).SetStatic";
_tw._initialize /*b4j.example.vmtextfield*/ (ba,_vue,_vmodel,_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ (_v);
 //BA.debugLineNum = 1656;BA.debugLine="tw.SetVModel(vmodel).SetType(\"text\").RemoveA";
_tw._setvmodel /*b4j.example.vmtextfield*/ (_vmodel)._settype /*b4j.example.vmtextfield*/ ("text")._removeattr /*b4j.example.vmtextfield*/ ("ref")._setdense /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 1657;BA.debugLine="tw.SetOutlined(True).SetHideDetails(True).Ad";
_tw._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1")._removeattr /*b4j.example.vmtextfield*/ ("v-show");
 //BA.debugLineNum = 1658;BA.debugLine="tcont.AddControlS(tw.TextField, tw.ToString,";
_tcont._addcontrols /*String*/ (_tw._textfield /*b4j.example.vmelement*/ ,_tw._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 1659;BA.debugLine="vue.SetData(vmodel,\"\")";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(""));
 //BA.debugLineNum = 1660;BA.debugLine="itemtypes.put(k,\"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 break; }
}
;
 }
};
 //BA.debugLineNum = 1663;BA.debugLine="bcont.AddComponent(1, 1, tcont.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_tcont._tostring /*String*/ ());
 //BA.debugLineNum = 1665;BA.debugLine="Dim xm As Map = CreateMap()";
_xm = new anywheresoftware.b4a.objects.collections.Map();
_xm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1666;BA.debugLine="xm.put(\"colisautofocus\", \"AutoFocus\")";
_xm.Put((Object)("colisautofocus"),(Object)("AutoFocus"));
 //BA.debugLineNum = 1667;BA.debugLine="xm.Put(\"colishidedetails\",\"HideDetails\")";
_xm.Put((Object)("colishidedetails"),(Object)("HideDetails"));
 //BA.debugLineNum = 1668;BA.debugLine="xm.put(\"colisdense\",\"Dense\")";
_xm.Put((Object)("colisdense"),(Object)("Dense"));
 //BA.debugLineNum = 1669;BA.debugLine="xm.Put(\"colnoduplicate\", \"Unique\")";
_xm.Put((Object)("colnoduplicate"),(Object)("Unique"));
 //BA.debugLineNum = 1670;BA.debugLine="xm.put(\"colprimarykey\", \"Primary Key\")";
_xm.Put((Object)("colprimarykey"),(Object)("Primary Key"));
 //BA.debugLineNum = 1671;BA.debugLine="xm.Put(\"colautoincrement\", \"A.Increment\")";
_xm.Put((Object)("colautoincrement"),(Object)("A.Increment"));
 //BA.debugLineNum = 1672;BA.debugLine="xm.put(\"coldisplayvalue\",\"Display Value\")";
_xm.Put((Object)("coldisplayvalue"),(Object)("Display Value"));
 //BA.debugLineNum = 1673;BA.debugLine="xm.Put(\"colsortable\", \"Sortable\")";
_xm.Put((Object)("colsortable"),(Object)("Sortable"));
 //BA.debugLineNum = 1674;BA.debugLine="xm.Put(\"colrequired\", \"Required\")";
_xm.Put((Object)("colrequired"),(Object)("Required"));
 //BA.debugLineNum = 1675;BA.debugLine="xm.Put(\"colvisible\", \"Visible\")";
_xm.Put((Object)("colvisible"),(Object)("Visible"));
 //BA.debugLineNum = 1676;BA.debugLine="xm.Put(\"colactive\", \"Active\")";
_xm.Put((Object)("colactive"),(Object)("Active"));
 //BA.debugLineNum = 1677;BA.debugLine="xm.Put(\"colontable\", \"On Table\")";
_xm.Put((Object)("colontable"),(Object)("On Table"));
 //BA.debugLineNum = 1678;BA.debugLine="xm.Put(\"colindexed\", \"Indexed\")";
_xm.Put((Object)("colindexed"),(Object)("Indexed"));
 //BA.debugLineNum = 1680;BA.debugLine="Dim acont As VMContainer";
_acont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 1681;BA.debugLine="acont.Initialize(vue, \"abc\", module).SetTag(\"d";
_acont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"abc",_module)._settag /*b4j.example.vmcontainer*/ ("div");
 //BA.debugLineNum = 1682;BA.debugLine="acont.NoGutters = True";
_acont._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 1683;BA.debugLine="acont.SetFluid(True)";
_acont._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1684;BA.debugLine="Dim colPos As Int = 0";
_colpos = (int) (0);
 //BA.debugLineNum = 1685;BA.debugLine="For Each k As String In xm.keys";
{
final anywheresoftware.b4a.BA.IterableList group299 = _xm.Keys();
final int groupLen299 = group299.getSize()
;int index299 = 0;
;
for (; index299 < groupLen299;index299++){
_k = BA.ObjectToString(group299.Get(index299));
 //BA.debugLineNum = 1686;BA.debugLine="Dim v As String = xm.Get(k)";
_v = BA.ObjectToString(_xm.Get((Object)(_k)));
 //BA.debugLineNum = 1687;BA.debugLine="Dim vmodel As String = $\"${nc.vmodel}${k}\"$";
_vmodel = (""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+""+__c.SmartStringFormatter("",(Object)(_k))+"");
 //BA.debugLineNum = 1688;BA.debugLine="colPos = colPos + 1";
_colpos = (int) (_colpos+1);
 //BA.debugLineNum = 1690;BA.debugLine="Dim sw As VMCheckBox";
_sw = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 1691;BA.debugLine="sw.Initialize(vue, \"sw\" & k, module).SetStati";
_sw._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,"sw"+_k,_module)._setstatic /*b4j.example.vmcheckbox*/ (__c.True)._setvmodel /*b4j.example.vmcheckbox*/ (_vmodel)._setswitch /*b4j.example.vmcheckbox*/ ();
 //BA.debugLineNum = 1692;BA.debugLine="sw.Setlabel(v).SetTrueValue(\"Yes\").SetFalseVa";
_sw._setlabel /*b4j.example.vmcheckbox*/ (_v)._settruevalue /*b4j.example.vmcheckbox*/ ("Yes")._setfalsevalue /*b4j.example.vmcheckbox*/ ("No")._sethidedetails /*b4j.example.vmcheckbox*/ (__c.True)._setfieldtype /*b4j.example.vmcheckbox*/ ("string");
 //BA.debugLineNum = 1693;BA.debugLine="sw.RemoveAttr(\"ref\").SetDense(True).SetInset(";
_sw._removeattr /*b4j.example.vmcheckbox*/ ("ref")._setdense /*b4j.example.vmcheckbox*/ (__c.True)._setinset /*b4j.example.vmcheckbox*/ (__c.True)._addclass /*b4j.example.vmcheckbox*/ ("my-1");
 //BA.debugLineNum = 1694;BA.debugLine="acont.AddControlS(sw.CheckBox, sw.ToString, 1";
_acont._addcontrols /*String*/ (_sw._checkbox /*b4j.example.vmelement*/ ,_sw._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(_colpos),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 1695;BA.debugLine="vue.SetData(vmodel, \"No\")";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)("No"));
 }
};
 //BA.debugLineNum = 1697;BA.debugLine="bcont.AddComponent(1, 1, acont.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_acont._tostring /*String*/ ());
 //BA.debugLineNum = 1699;BA.debugLine="Dim mcont As VMContainer";
_mcont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 1700;BA.debugLine="mcont.Initialize(vue, \"size\" & nc.vmodel, modu";
_mcont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"size"+_nc.vmodel /*String*/ ,_module)._settag /*b4j.example.vmcontainer*/ ("div");
 //BA.debugLineNum = 1701;BA.debugLine="mcont.NoGutters = True";
_mcont._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 1702;BA.debugLine="mcont.SetFluid(True)";
_mcont._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1704;BA.debugLine="Dim rw As VMTextField = AddTextField(\"colrow\",";
_rw = _addtextfield("colrow",(""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+"colrow"),"Row");
 //BA.debugLineNum = 1705;BA.debugLine="mcont.AddControlS(rw.TextField, rw.ToString, 1";
_mcont._addcontrols /*String*/ (_rw._textfield /*b4j.example.vmelement*/ ,_rw._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 1707;BA.debugLine="Dim cl As VMTextField = AddTextField(\"colcolum";
_cl = _addtextfield("colcolumn",(""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+"colcolumn"),"Col");
 //BA.debugLineNum = 1708;BA.debugLine="mcont.AddControlS(cl.TextField, cl.ToString, 1";
_mcont._addcontrols /*String*/ (_cl._textfield /*b4j.example.vmelement*/ ,_cl._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 1710;BA.debugLine="Dim os As VMTextField = AddTextField(\"coloffse";
_os = _addtextfield("coloffsetsmall",(""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+"coloffsetsmall"),"OS");
 //BA.debugLineNum = 1711;BA.debugLine="mcont.AddControlS(os.TextField, os.ToString, 2";
_mcont._addcontrols /*String*/ (_os._textfield /*b4j.example.vmelement*/ ,_os._tostring /*String*/ (),BA.NumberToString(2),BA.NumberToString(1),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 1713;BA.debugLine="Dim om As VMTextField = AddTextField(\"coloffse";
_om = _addtextfield("coloffsetmedium",(""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+"coloffsetmedium"),"OM");
 //BA.debugLineNum = 1714;BA.debugLine="mcont.AddControlS(om.TextField, om.ToString, 2";
_mcont._addcontrols /*String*/ (_om._textfield /*b4j.example.vmelement*/ ,_om._tostring /*String*/ (),BA.NumberToString(2),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 1716;BA.debugLine="Dim ol As VMTextField = AddTextField(\"coloffse";
_ol = _addtextfield("coloffsetlarge",(""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+"coloffsetlarge"),"OL");
 //BA.debugLineNum = 1717;BA.debugLine="mcont.AddControlS(ol.TextField, ol.ToString, 2";
_mcont._addcontrols /*String*/ (_ol._textfield /*b4j.example.vmelement*/ ,_ol._tostring /*String*/ (),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 1719;BA.debugLine="Dim oxl As VMTextField = AddTextField(\"coloffs";
_oxl = _addtextfield("coloffsetxlarge",(""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+"coloffsetxlarge"),"OL");
 //BA.debugLineNum = 1720;BA.debugLine="mcont.AddControlS(oxl.TextField, oxl.ToString,";
_mcont._addcontrols /*String*/ (_oxl._textfield /*b4j.example.vmelement*/ ,_oxl._tostring /*String*/ (),BA.NumberToString(2),BA.NumberToString(4),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 1722;BA.debugLine="Dim ss As VMTextField = AddTextField(\"colsizes";
_ss = _addtextfield("colsizesmall",(""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+"colsizesmall"),"SS");
 //BA.debugLineNum = 1723;BA.debugLine="mcont.AddControlS(ss.TextField, ss.ToString, 3";
_mcont._addcontrols /*String*/ (_ss._textfield /*b4j.example.vmelement*/ ,_ss._tostring /*String*/ (),BA.NumberToString(3),BA.NumberToString(1),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 1725;BA.debugLine="Dim sm As VMTextField = AddTextField(\"colsizem";
_sm = _addtextfield("colsizemedium",(""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+"colsizemedium"),"SM");
 //BA.debugLineNum = 1726;BA.debugLine="mcont.AddControlS(sm.TextField, sm.ToString, 3";
_mcont._addcontrols /*String*/ (_sm._textfield /*b4j.example.vmelement*/ ,_sm._tostring /*String*/ (),BA.NumberToString(3),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 1728;BA.debugLine="Dim sl As VMTextField = AddTextField(\"colsizel";
_sl = _addtextfield("colsizelarge",(""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+"colsizelarge"),"SL");
 //BA.debugLineNum = 1729;BA.debugLine="mcont.AddControlS(sl.TextField, sl.ToString, 3";
_mcont._addcontrols /*String*/ (_sl._textfield /*b4j.example.vmelement*/ ,_sl._tostring /*String*/ (),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 1731;BA.debugLine="Dim sxl As VMTextField = AddTextField(\"colsize";
_sxl = _addtextfield("colsizexlarge",(""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+"colsizexlarge"),"SX");
 //BA.debugLineNum = 1732;BA.debugLine="mcont.AddControlS(sxl.TextField, sxl.ToString,";
_mcont._addcontrols /*String*/ (_sxl._textfield /*b4j.example.vmelement*/ ,_sxl._tostring /*String*/ (),BA.NumberToString(3),BA.NumberToString(4),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 1734;BA.debugLine="Dim btnSaveItem As VMButton = NewButton(Me, Tr";
_btnsaveitem = _newbutton(this,__c.True,"btnSaveItem","Save Item",__c.True,__c.False,__c.False,__c.True);
 //BA.debugLineNum = 1735;BA.debugLine="btnSaveItem.SetColorIntensity(\"green\", \"\")";
_btnsaveitem._setcolorintensity /*b4j.example.vmbutton*/ ("green","");
 //BA.debugLineNum = 1736;BA.debugLine="btnSaveItem.Setoutlined(True)";
_btnsaveitem._setoutlined /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 1737;BA.debugLine="mcont.AddControlS(btnSaveItem.Button, btnSaveI";
_mcont._addcontrols /*String*/ (_btnsaveitem._button /*b4j.example.vmelement*/ ,_btnsaveitem._tostring /*String*/ (),BA.NumberToString(4),BA.NumberToString(2),BA.NumberToString(12),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 1739;BA.debugLine="Dim btnDeleteItem As VMButton = NewButton(Me,";
_btndeleteitem = _newbutton(this,__c.True,"btnDeleteItem","Delete Item",__c.True,__c.False,__c.False,__c.True);
 //BA.debugLineNum = 1740;BA.debugLine="btnDeleteItem.SetColorIntensity(\"red\", \"\")";
_btndeleteitem._setcolorintensity /*b4j.example.vmbutton*/ ("red","");
 //BA.debugLineNum = 1741;BA.debugLine="btnDeleteItem.Setoutlined(True)";
_btndeleteitem._setoutlined /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 1742;BA.debugLine="mcont.AddControlS(btnDeleteItem.Button, btnDel";
_mcont._addcontrols /*String*/ (_btndeleteitem._button /*b4j.example.vmelement*/ ,_btndeleteitem._tostring /*String*/ (),BA.NumberToString(4),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 1744;BA.debugLine="bcont.AddComponent(1, 1, mcont.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_mcont._tostring /*String*/ ());
 //BA.debugLineNum = 1745;BA.debugLine="expanel.Container.AddControlS(bcont.Container,";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_bcont._container /*b4j.example.vmelement*/ ,_bcont._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 2: {
 //BA.debugLineNum = 1747;BA.debugLine="itemtypes.Initialize";
_itemtypes.Initialize();
 //BA.debugLineNum = 1748;BA.debugLine="nc.vmodel = \"items\"";
_nc.vmodel /*String*/  = "items";
 //BA.debugLineNum = 1749;BA.debugLine="Dim bcont As VMContainer";
_bcont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 1750;BA.debugLine="bcont.Initialize(vue, \"tx\" & nc.vmodel, module";
_bcont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"tx"+_nc.vmodel /*String*/ ,_module)._setstatic /*b4j.example.vmcontainer*/ (__c.True)._settag /*b4j.example.vmcontainer*/ ("div")._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 1751;BA.debugLine="bcont.SetFluid(True)";
_bcont._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1752;BA.debugLine="bcont.AddRows(2).AddColumns12";
_bcont._addrows /*b4j.example.vmcontainer*/ ((int) (2))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 1754;BA.debugLine="Dim tblx As VMToolBar = CreateToolbar(\"t\" & nc";
_tblx = _createtoolbar("t"+_nc.vmodel /*String*/ ,this)._setstatic /*b4j.example.vmtoolbar*/ (__c.True);
 //BA.debugLineNum = 1755;BA.debugLine="tblx.SetDense(True).AddSpacer.SetElevation(\"1\"";
_tblx._setdense /*b4j.example.vmtoolbar*/ (__c.True)._addspacer /*b4j.example.vmtoolbar*/ ()._setelevation /*b4j.example.vmtoolbar*/ ("1");
 //BA.debugLineNum = 1756;BA.debugLine="tblx.AddIcon(\"btnAddTable\", \"mdi-plus\", \"Add i";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnAddTable","mdi-plus","Add item","");
 //BA.debugLineNum = 1757;BA.debugLine="tblx.AddIcon(\"btnAddMultiple\", \"mdi-book-plus-";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnAddMultiple","mdi-book-plus-multiple","Add multiple items","");
 //BA.debugLineNum = 1758;BA.debugLine="tblx.AddIcon(\"btnSaveTable\", \"save\", \"Save ite";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnSaveTable","save","Save item","");
 //BA.debugLineNum = 1759;BA.debugLine="tblx.AddIcon(\"btnDeleteTable\", \"delete\", \"Dele";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnDeleteTable","delete","Delete item","");
 //BA.debugLineNum = 1760;BA.debugLine="tblx.AddIcon(\"btnEmpty\",\"mdi-delete-empty-outl";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnEmpty","mdi-delete-empty-outline","Empty items","");
 //BA.debugLineNum = 1761;BA.debugLine="bcont.AddComponent(1, 1, tblx.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_tblx._tostring /*String*/ ());
 //BA.debugLineNum = 1763;BA.debugLine="Dim cbo As VMSelect";
_cbo = new b4j.example.vmselect();
 //BA.debugLineNum = 1764;BA.debugLine="cbo.Initialize(vue, \"cboKeySelect\", Me)";
_cbo._initialize /*b4j.example.vmselect*/ (ba,_vue,"cboKeySelect",this);
 //BA.debugLineNum = 1765;BA.debugLine="cbo.Setlabel(\"Item Selector\")";
_cbo._setlabel /*b4j.example.vmselect*/ ("Item Selector");
 //BA.debugLineNum = 1766;BA.debugLine="cbo.SetVModel(\"keyselector\")";
_cbo._setvmodel /*b4j.example.vmselect*/ ("keyselector");
 //BA.debugLineNum = 1767;BA.debugLine="cbo.SetDataSource(\"tableitems\", \"key\", \"key\",";
_cbo._setdatasource /*b4j.example.vmselect*/ ("tableitems","key","key",__c.False);
 //BA.debugLineNum = 1768;BA.debugLine="cbo.RemoveAttr(\"ref\")";
_cbo._removeattr /*b4j.example.vmselect*/ ("ref");
 //BA.debugLineNum = 1769;BA.debugLine="cbo.SetDense(True)";
_cbo._setdense /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1770;BA.debugLine="cbo.SetOutlined(True)";
_cbo._setoutlined /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1771;BA.debugLine="cbo.SetHideDetails(True)";
_cbo._sethidedetails /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1772;BA.debugLine="cbo.AddClass(\"my-1\")";
_cbo._addclass /*b4j.example.vmselect*/ ("my-1");
 //BA.debugLineNum = 1773;BA.debugLine="cbo.SetOnChange(Me, \"cboKeySelect\")";
_cbo._setonchange /*b4j.example.vmselect*/ (this,"cboKeySelect");
 //BA.debugLineNum = 1774;BA.debugLine="bcont.AddComponent(1,1, cbo.ToString)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_cbo._tostring /*String*/ ());
 //BA.debugLineNum = 1777;BA.debugLine="Dim tcont As VMContainer";
_tcont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 1778;BA.debugLine="tcont.Initialize(vue, \"tbl\" & nc.vmodel, modul";
_tcont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"tbl"+_nc.vmodel /*String*/ ,_module)._settag /*b4j.example.vmcontainer*/ ("div")._setstatic /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1779;BA.debugLine="tcont.NoGutters = True";
_tcont._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 1780;BA.debugLine="tcont.SetFluid(True)";
_tcont._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1781;BA.debugLine="tcont.SetElevation(\"1\")";
_tcont._setelevation /*b4j.example.vmcontainer*/ ("1");
 //BA.debugLineNum = 1783;BA.debugLine="nc.options.Initialize";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 1784;BA.debugLine="nc.options.Put(\"key\", \"Item Key\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("key"),(Object)("Item Key"));
 //BA.debugLineNum = 1785;BA.debugLine="nc.options.Put(\"icon\", \"Icon Name\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("icon"),(Object)("Icon Name"));
 //BA.debugLineNum = 1786;BA.debugLine="nc.options.Put(\"iconcolor\", \"Color\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("iconcolor"),(Object)("Color"));
 //BA.debugLineNum = 1787;BA.debugLine="nc.options.Put(\"title\", \"Title\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("title"),(Object)("Title"));
 //BA.debugLineNum = 1788;BA.debugLine="nc.options.Put(\"subtitle\", \"Tooltip\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("subtitle"),(Object)("Tooltip"));
 //BA.debugLineNum = 1789;BA.debugLine="nc.options.Put(\"badge\", \"Badge\")";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("badge"),(Object)("Badge"));
 //BA.debugLineNum = 1791;BA.debugLine="Dim rg As VMRadioGroup";
_rg = new b4j.example.vmradiogroup();
 //BA.debugLineNum = 1792;BA.debugLine="rg.Initialize(vue, \"rg\" & nc.vmodel, module).S";
_rg._initialize /*b4j.example.vmradiogroup*/ (ba,_vue,"rg"+_nc.vmodel /*String*/ ,_module)._setstatic /*b4j.example.vmradiogroup*/ (__c.True)._setvmodel /*b4j.example.vmradiogroup*/ ("itemsitemtype")._setlabel /*b4j.example.vmradiogroup*/ ("Type");
 //BA.debugLineNum = 1793;BA.debugLine="rg.SetOptions(CreateMap(\"menu\":\"Menu\",\"btn\":\"B";
_rg._setoptions /*String*/ (__c.createMap(new Object[] {(Object)("menu"),(Object)("Menu"),(Object)("btn"),(Object)("Button"),(Object)("icon"),(Object)("Icon")}));
 //BA.debugLineNum = 1794;BA.debugLine="vue.SetData(\"itemsitemtype\", \"icon\")";
_vue._setdata /*b4j.example.bananovue*/ ("itemsitemtype",(Object)("icon"));
 //BA.debugLineNum = 1795;BA.debugLine="rg.SetDense(True).SetRow(True).RemoveAttr(\"ref";
_rg._setdense /*b4j.example.vmradiogroup*/ (__c.True)._setrow /*b4j.example.vmradiogroup*/ (__c.True)._removeattr /*b4j.example.vmradiogroup*/ ("ref")._sethidedetails /*b4j.example.vmradiogroup*/ (__c.True)._addclass /*b4j.example.vmradiogroup*/ ("my-1");
 //BA.debugLineNum = 1796;BA.debugLine="tcont.AddControlS(rg.RadioGroup, rg.ToString,";
_tcont._addcontrols /*String*/ (_rg._radiogroup /*b4j.example.vmelement*/ ,_rg._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 1797;BA.debugLine="itemtypes.put(\"itemtype\",\"String\")";
_itemtypes.Put((Object)("itemtype"),(Object)("String"));
 //BA.debugLineNum = 1799;BA.debugLine="Dim rowPos As Int = 2";
_rowpos = (int) (2);
 //BA.debugLineNum = 1800;BA.debugLine="Dim colPos As Int = 0";
_colpos = (int) (0);
 //BA.debugLineNum = 1801;BA.debugLine="For Each k As String In nc.options.Keys";
{
final anywheresoftware.b4a.BA.IterableList group393 = _nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen393 = group393.getSize()
;int index393 = 0;
;
for (; index393 < groupLen393;index393++){
_k = BA.ObjectToString(group393.Get(index393));
 //BA.debugLineNum = 1802;BA.debugLine="Dim v As String = nc.options.Get(k)";
_v = BA.ObjectToString(_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
 //BA.debugLineNum = 1804;BA.debugLine="colPos = colPos + 1";
_colpos = (int) (_colpos+1);
 //BA.debugLineNum = 1805;BA.debugLine="If colPos = 3 Then";
if (_colpos==3) { 
 //BA.debugLineNum = 1806;BA.debugLine="rowPos = rowPos + 1";
_rowpos = (int) (_rowpos+1);
 //BA.debugLineNum = 1807;BA.debugLine="colPos = 1";
_colpos = (int) (1);
 };
 //BA.debugLineNum = 1810;BA.debugLine="Dim vmodel As String = $\"${nc.vmodel}${k}\"$";
_vmodel = (""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+""+__c.SmartStringFormatter("",(Object)(_k))+"");
 //BA.debugLineNum = 1811;BA.debugLine="Dim tw As VMTextField";
_tw = new b4j.example.vmtextfield();
 //BA.debugLineNum = 1812;BA.debugLine="tw.Initialize(vue, vmodel, module).SetStatic(";
_tw._initialize /*b4j.example.vmtextfield*/ (ba,_vue,_vmodel,_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ (_v);
 //BA.debugLineNum = 1813;BA.debugLine="tw.SetVModel(vmodel).SetType(\"text\").RemoveAt";
_tw._setvmodel /*b4j.example.vmtextfield*/ (_vmodel)._settype /*b4j.example.vmtextfield*/ ("text")._removeattr /*b4j.example.vmtextfield*/ ("ref")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 1814;BA.debugLine="tw.SetHideDetails(True).AddClass(\"my-1\").Remo";
_tw._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1")._removeattr /*b4j.example.vmtextfield*/ ("v-show");
 //BA.debugLineNum = 1815;BA.debugLine="tcont.AddControlS(tw.TextField, tw.ToString,";
_tcont._addcontrols /*String*/ (_tw._textfield /*b4j.example.vmelement*/ ,_tw._tostring /*String*/ (),BA.NumberToString(_rowpos),BA.NumberToString(_colpos),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 1816;BA.debugLine="itemtypes.put(k,\"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 }
};
 //BA.debugLineNum = 1818;BA.debugLine="bcont.AddComponent(1, 1, tcont.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_tcont._tostring /*String*/ ());
 //BA.debugLineNum = 1820;BA.debugLine="Dim mItems As VMList = CreateList(nc.vmodel &";
_mitems = _createlist(_nc.vmodel /*String*/ +"crud",this)._setelevation /*b4j.example.vmlist*/ ("1");
 //BA.debugLineNum = 1821;BA.debugLine="mItems.SetStatic(True)";
_mitems._setstatic /*b4j.example.vmlist*/ (__c.True);
 //BA.debugLineNum = 1822;BA.debugLine="mItems.SetDataSourceTemplate1(\"tableitems\", \"k";
_mitems._setdatasourcetemplate1 /*b4j.example.vmlist*/ ("tableitems","key","","icon","iconcolor","title","subtitle","","","");
 //BA.debugLineNum = 1823;BA.debugLine="Dim mList As String = mItems.tostring";
_mlist = _mitems._tostring /*String*/ ();
 //BA.debugLineNum = 1824;BA.debugLine="bcont.AddComponent(2, 1, mList)";
_bcont._addcomponent /*String*/ ((int) (2),(int) (1),_mlist);
 //BA.debugLineNum = 1826;BA.debugLine="expanel.Container.AddControlS(bcont.Container,";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_bcont._container /*b4j.example.vmelement*/ ,_bcont._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 3: {
 //BA.debugLineNum = 1829;BA.debugLine="itemtypes.Initialize";
_itemtypes.Initialize();
 //BA.debugLineNum = 1830;BA.debugLine="Dim bcont As VMContainer";
_bcont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 1831;BA.debugLine="bcont.Initialize(vue, \"a\" & nc.vmodel, module)";
_bcont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"a"+_nc.vmodel /*String*/ ,_module)._setstatic /*b4j.example.vmcontainer*/ (__c.True)._settag /*b4j.example.vmcontainer*/ ("div")._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 1832;BA.debugLine="bcont.SetFluid(True)";
_bcont._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1833;BA.debugLine="bcont.AddClass(\"mx-0\")";
_bcont._addclass /*b4j.example.vmcontainer*/ ("mx-0");
 //BA.debugLineNum = 1834;BA.debugLine="bcont.AddRows(2).AddColumns12";
_bcont._addrows /*b4j.example.vmcontainer*/ ((int) (2))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 1836;BA.debugLine="Dim tblx As VMToolBar = CreateToolbar(\"t\" & nc";
_tblx = _createtoolbar("t"+_nc.vmodel /*String*/ ,this)._setstatic /*b4j.example.vmtoolbar*/ (__c.True);
 //BA.debugLineNum = 1837;BA.debugLine="tblx.SetDense(True).AddSpacer.SetElevation(\"1\"";
_tblx._setdense /*b4j.example.vmtoolbar*/ (__c.True)._addspacer /*b4j.example.vmtoolbar*/ ()._setelevation /*b4j.example.vmtoolbar*/ ("1");
 //BA.debugLineNum = 1838;BA.debugLine="tblx.AddIcon(\"btnAddTable\", \"mdi-plus\", \"Add i";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnAddTable","mdi-plus","Add item","");
 //BA.debugLineNum = 1839;BA.debugLine="tblx.AddIcon(\"btnAddMultiple\", \"mdi-book-plus-";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnAddMultiple","mdi-book-plus-multiple","Add multiple items","");
 //BA.debugLineNum = 1840;BA.debugLine="tblx.AddIcon(\"btnSaveTable\", \"save\", \"Save ite";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnSaveTable","save","Save item","");
 //BA.debugLineNum = 1841;BA.debugLine="tblx.AddIcon(\"btnDeleteTable\", \"delete\", \"Dele";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnDeleteTable","delete","Delete item","");
 //BA.debugLineNum = 1842;BA.debugLine="tblx.AddIcon(\"btnEmpty\",\"mdi-delete-empty-outl";
_tblx._addicon /*b4j.example.vmtoolbar*/ ("btnEmpty","mdi-delete-empty-outline","Empty items","");
 //BA.debugLineNum = 1843;BA.debugLine="bcont.AddComponent(1, 1, tblx.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_tblx._tostring /*String*/ ());
 //BA.debugLineNum = 1845;BA.debugLine="Dim cbo As VMSelect";
_cbo = new b4j.example.vmselect();
 //BA.debugLineNum = 1846;BA.debugLine="cbo.Initialize(vue, \"cboKeySelect\", Me)";
_cbo._initialize /*b4j.example.vmselect*/ (ba,_vue,"cboKeySelect",this);
 //BA.debugLineNum = 1847;BA.debugLine="cbo.Setlabel(\"Item Selector\")";
_cbo._setlabel /*b4j.example.vmselect*/ ("Item Selector");
 //BA.debugLineNum = 1848;BA.debugLine="cbo.SetVModel(\"keyselector\")";
_cbo._setvmodel /*b4j.example.vmselect*/ ("keyselector");
 //BA.debugLineNum = 1849;BA.debugLine="cbo.SetDataSource(\"tableitems\", \"key\", \"key\",";
_cbo._setdatasource /*b4j.example.vmselect*/ ("tableitems","key","key",__c.False);
 //BA.debugLineNum = 1850;BA.debugLine="cbo.RemoveAttr(\"ref\")";
_cbo._removeattr /*b4j.example.vmselect*/ ("ref");
 //BA.debugLineNum = 1851;BA.debugLine="cbo.SetDense(True)";
_cbo._setdense /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1852;BA.debugLine="cbo.SetOutlined(True)";
_cbo._setoutlined /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1853;BA.debugLine="cbo.SetHideDetails(True)";
_cbo._sethidedetails /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1854;BA.debugLine="cbo.AddClass(\"my-1\")";
_cbo._addclass /*b4j.example.vmselect*/ ("my-1");
 //BA.debugLineNum = 1855;BA.debugLine="cbo.SetOnChange(Me, \"cboKeySelect\")";
_cbo._setonchange /*b4j.example.vmselect*/ (this,"cboKeySelect");
 //BA.debugLineNum = 1856;BA.debugLine="bcont.AddComponent(1,1, cbo.ToString)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_cbo._tostring /*String*/ ());
 //BA.debugLineNum = 1859;BA.debugLine="Dim tcont As VMContainer";
_tcont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 1860;BA.debugLine="tcont.Initialize(vue, \"tbl\" & nc.vmodel, modul";
_tcont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"tbl"+_nc.vmodel /*String*/ ,_module)._settag /*b4j.example.vmcontainer*/ ("div")._setstatic /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1861;BA.debugLine="tcont.NoGutters = True";
_tcont._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 1862;BA.debugLine="tcont.SetFluid(True)";
_tcont._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1863;BA.debugLine="tcont.SetElevation(\"1\")";
_tcont._setelevation /*b4j.example.vmcontainer*/ ("1");
 //BA.debugLineNum = 1865;BA.debugLine="Dim rowPos As Int = 1";
_rowpos = (int) (1);
 //BA.debugLineNum = 1866;BA.debugLine="Dim colPos As Int = 0";
_colpos = (int) (0);
 //BA.debugLineNum = 1867;BA.debugLine="For Each k As String In nc.options.Keys";
{
final anywheresoftware.b4a.BA.IterableList group449 = _nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen449 = group449.getSize()
;int index449 = 0;
;
for (; index449 < groupLen449;index449++){
_k = BA.ObjectToString(group449.Get(index449));
 //BA.debugLineNum = 1869;BA.debugLine="If contentitems.IndexOf(k) = -1 Then";
if (_contentitems.IndexOf((Object)(_k))==-1) { 
 //BA.debugLineNum = 1870;BA.debugLine="contentitems.add(k)";
_contentitems.Add((Object)(_k));
 };
 //BA.debugLineNum = 1872;BA.debugLine="Dim v As String = nc.options.Get(k)";
_v = BA.ObjectToString(_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
 //BA.debugLineNum = 1874;BA.debugLine="colPos = colPos + 1";
_colpos = (int) (_colpos+1);
 //BA.debugLineNum = 1875;BA.debugLine="If colPos = 3 Then";
if (_colpos==3) { 
 //BA.debugLineNum = 1876;BA.debugLine="rowPos = rowPos + 1";
_rowpos = (int) (_rowpos+1);
 //BA.debugLineNum = 1877;BA.debugLine="colPos = 1";
_colpos = (int) (1);
 };
 //BA.debugLineNum = 1880;BA.debugLine="Dim vmodel As String = $\"${nc.vmodel}${k}\"$";
_vmodel = (""+__c.SmartStringFormatter("",(Object)(_nc.vmodel /*String*/ ))+""+__c.SmartStringFormatter("",(Object)(_k))+"");
 //BA.debugLineNum = 1883;BA.debugLine="If InternalItemType.ContainsKey(k) Then";
if (_internalitemtype.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 1884;BA.debugLine="Dim itype As String = InternalItemType.Get(k";
_itype = BA.ObjectToString(_internalitemtype.Get((Object)(_k)));
 //BA.debugLineNum = 1885;BA.debugLine="Select Case itype";
switch (BA.switchObjectToInt(_itype,"switch","select","radio")) {
case 0: {
 //BA.debugLineNum = 1887;BA.debugLine="Dim sw As VMCheckBox";
_sw = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 1888;BA.debugLine="sw.Initialize(vue, \"sw\" & k, module).SetSta";
_sw._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,"sw"+_k,_module)._setstatic /*b4j.example.vmcheckbox*/ (__c.True)._setvmodel /*b4j.example.vmcheckbox*/ (_vmodel)._setswitch /*b4j.example.vmcheckbox*/ ();
 //BA.debugLineNum = 1889;BA.debugLine="sw.Setlabel(v).SetTrueValue(\"Yes\").SetFalse";
_sw._setlabel /*b4j.example.vmcheckbox*/ (_v)._settruevalue /*b4j.example.vmcheckbox*/ ("Yes")._setfalsevalue /*b4j.example.vmcheckbox*/ ("No")._sethidedetails /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 1890;BA.debugLine="sw.SetFieldType(\"string\")";
_sw._setfieldtype /*b4j.example.vmcheckbox*/ ("string");
 //BA.debugLineNum = 1891;BA.debugLine="sw.RemoveAttr(\"ref\").SetDense(True).SetInse";
_sw._removeattr /*b4j.example.vmcheckbox*/ ("ref")._setdense /*b4j.example.vmcheckbox*/ (__c.True)._setinset /*b4j.example.vmcheckbox*/ (__c.True)._addclass /*b4j.example.vmcheckbox*/ ("my-1");
 //BA.debugLineNum = 1892;BA.debugLine="sw.AddClass(\"mx-2\")";
_sw._addclass /*b4j.example.vmcheckbox*/ ("mx-2");
 //BA.debugLineNum = 1893;BA.debugLine="tcont.AddControlS(sw.CheckBox, sw.ToString,";
_tcont._addcontrols /*String*/ (_sw._checkbox /*b4j.example.vmelement*/ ,_sw._tostring /*String*/ (),BA.NumberToString(_rowpos),BA.NumberToString(_colpos),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 1894;BA.debugLine="vue.SetData(vmodel, \"No\")";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)("No"));
 //BA.debugLineNum = 1895;BA.debugLine="itemtypes.put(k,\"Boolean\")";
_itemtypes.Put((Object)(_k),(Object)("Boolean"));
 break; }
case 1: {
 //BA.debugLineNum = 1897;BA.debugLine="Dim opts As Map = InternalItemTypeOptions.G";
_opts = new anywheresoftware.b4a.objects.collections.Map();
_opts = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_internalitemtypeoptions.Get((Object)(_k))));
 //BA.debugLineNum = 1898;BA.debugLine="Dim cbo As VMSelect";
_cbo = new b4j.example.vmselect();
 //BA.debugLineNum = 1899;BA.debugLine="cbo.Initialize(vue, \"cbo\" & k, module).SetS";
_cbo._initialize /*b4j.example.vmselect*/ (ba,_vue,"cbo"+_k,_module)._setstatic /*b4j.example.vmselect*/ (__c.True)._setlabel /*b4j.example.vmselect*/ (_v)._setvmodel /*b4j.example.vmselect*/ (_vmodel);
 //BA.debugLineNum = 1900;BA.debugLine="cbo.SetOptions($\"${vmodel}1\"$, opts, \"id\",";
_cbo._setoptions /*b4j.example.vmselect*/ ((""+__c.SmartStringFormatter("",(Object)(_vmodel))+"1"),_opts,"id","text",__c.False)._removeattr /*b4j.example.vmselect*/ ("ref")._setdense /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1901;BA.debugLine="cbo.SetOutlined(True).SetHideDetails(True).";
_cbo._setoutlined /*b4j.example.vmselect*/ (__c.True)._sethidedetails /*b4j.example.vmselect*/ (__c.True)._addclass /*b4j.example.vmselect*/ ("my-1");
 //BA.debugLineNum = 1902;BA.debugLine="tcont.AddControlS(cbo.Combo, cbo.ToString,";
_tcont._addcontrols /*String*/ (_cbo._combo /*b4j.example.vmelement*/ ,_cbo._tostring /*String*/ (),BA.NumberToString(_rowpos),BA.NumberToString(_colpos),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 1903;BA.debugLine="vue.SetData(vmodel, \"No\")";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)("No"));
 //BA.debugLineNum = 1904;BA.debugLine="itemtypes.put(k,\"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 break; }
case 2: {
 //BA.debugLineNum = 1906;BA.debugLine="Dim opts As Map = InternalItemTypeOptions.G";
_opts = new anywheresoftware.b4a.objects.collections.Map();
_opts = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_internalitemtypeoptions.Get((Object)(_k))));
 //BA.debugLineNum = 1907;BA.debugLine="Dim rg As VMRadioGroup";
_rg = new b4j.example.vmradiogroup();
 //BA.debugLineNum = 1908;BA.debugLine="rg.Initialize(vue, \"rg\" & k, module).SetSta";
_rg._initialize /*b4j.example.vmradiogroup*/ (ba,_vue,"rg"+_k,_module)._setstatic /*b4j.example.vmradiogroup*/ (__c.True)._setvmodel /*b4j.example.vmradiogroup*/ (_vmodel)._setlabel /*b4j.example.vmradiogroup*/ (_v);
 //BA.debugLineNum = 1909;BA.debugLine="rg.SetOptions(opts)";
_rg._setoptions /*String*/ (_opts);
 //BA.debugLineNum = 1910;BA.debugLine="rg.AddClass(\"mx-2\")";
_rg._addclass /*b4j.example.vmradiogroup*/ ("mx-2");
 //BA.debugLineNum = 1911;BA.debugLine="rg.SetFieldType(\"string\")";
_rg._setfieldtype /*b4j.example.vmradiogroup*/ ("string");
 //BA.debugLineNum = 1912;BA.debugLine="rg.SetDense(True).RemoveAttr(\"ref\").SetHide";
_rg._setdense /*b4j.example.vmradiogroup*/ (__c.True)._removeattr /*b4j.example.vmradiogroup*/ ("ref")._sethidedetails /*b4j.example.vmradiogroup*/ (__c.True)._addclass /*b4j.example.vmradiogroup*/ ("my-1");
 //BA.debugLineNum = 1913;BA.debugLine="tcont.AddControlS(rg.RadioGroup, rg.ToStrin";
_tcont._addcontrols /*String*/ (_rg._radiogroup /*b4j.example.vmelement*/ ,_rg._tostring /*String*/ (),BA.NumberToString(_rowpos),BA.NumberToString(_colpos),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 1914;BA.debugLine="itemtypes.put(\"itemtype\",\"String\")";
_itemtypes.Put((Object)("itemtype"),(Object)("String"));
 break; }
}
;
 }else {
 //BA.debugLineNum = 1917;BA.debugLine="Dim tw As VMTextField";
_tw = new b4j.example.vmtextfield();
 //BA.debugLineNum = 1918;BA.debugLine="tw.Initialize(vue, vmodel, module).SetStatic";
_tw._initialize /*b4j.example.vmtextfield*/ (ba,_vue,_vmodel,_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ (_v);
 //BA.debugLineNum = 1919;BA.debugLine="tw.SetVModel(vmodel).SetType(\"text\").RemoveA";
_tw._setvmodel /*b4j.example.vmtextfield*/ (_vmodel)._settype /*b4j.example.vmtextfield*/ ("text")._removeattr /*b4j.example.vmtextfield*/ ("ref")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 1920;BA.debugLine="tw.SetHideDetails(True).AddClass(\"my-2\").Rem";
_tw._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-2")._removeattr /*b4j.example.vmtextfield*/ ("v-show");
 //BA.debugLineNum = 1921;BA.debugLine="tcont.AddControlS(tw.TextField, tw.ToString,";
_tcont._addcontrols /*String*/ (_tw._textfield /*b4j.example.vmelement*/ ,_tw._tostring /*String*/ (),BA.NumberToString(_rowpos),BA.NumberToString(_colpos),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 1922;BA.debugLine="itemtypes.put(k,\"String\")";
_itemtypes.Put((Object)(_k),(Object)("String"));
 };
 }
};
 //BA.debugLineNum = 1925;BA.debugLine="bcont.AddComponent(1, 1, tcont.tostring)";
_bcont._addcomponent /*String*/ ((int) (1),(int) (1),_tcont._tostring /*String*/ ());
 //BA.debugLineNum = 1927;BA.debugLine="Dim mItems As VMList = CreateList(nc.vmodel &";
_mitems = _createlist(_nc.vmodel /*String*/ +"crud",this)._setelevation /*b4j.example.vmlist*/ ("1");
 //BA.debugLineNum = 1928;BA.debugLine="mItems.SetStatic(True)";
_mitems._setstatic /*b4j.example.vmlist*/ (__c.True);
 //BA.debugLineNum = 1929;BA.debugLine="mItems.SetDataSourceTemplate1(\"tableitems\", \"k";
_mitems._setdatasourcetemplate1 /*b4j.example.vmlist*/ ("tableitems","key","avatar","icon","iconcolor","title","subtitle","subtitle1","action","actioncolor");
 //BA.debugLineNum = 1930;BA.debugLine="Dim mList As String = mItems.tostring";
_mlist = _mitems._tostring /*String*/ ();
 //BA.debugLineNum = 1931;BA.debugLine="bcont.AddComponent(2, 1, mList)";
_bcont._addcomponent /*String*/ ((int) (2),(int) (1),_mlist);
 //BA.debugLineNum = 1933;BA.debugLine="expanel.Container.AddControlS(bcont.Container,";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_bcont._container /*b4j.example.vmelement*/ ,_bcont._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 4: {
 //BA.debugLineNum = 1935;BA.debugLine="Dim acont As VMContainer";
_acont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 1936;BA.debugLine="acont.Initialize(vue, \"a\" & nc.vmodel, module)";
_acont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"a"+_nc.vmodel /*String*/ ,_module)._settag /*b4j.example.vmcontainer*/ ("div");
 //BA.debugLineNum = 1937;BA.debugLine="acont.NoGutters = True";
_acont._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 1938;BA.debugLine="acont.SetFluid(True)";
_acont._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1939;BA.debugLine="Dim colPos As Int = 0";
_colpos = (int) (0);
 //BA.debugLineNum = 1940;BA.debugLine="For Each k As String In nc.options.Keys";
{
final anywheresoftware.b4a.BA.IterableList group515 = _nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen515 = group515.getSize()
;int index515 = 0;
;
for (; index515 < groupLen515;index515++){
_k = BA.ObjectToString(group515.Get(index515));
 //BA.debugLineNum = 1941;BA.debugLine="Dim v As String = nc.options.Get(k)";
_v = BA.ObjectToString(_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
 //BA.debugLineNum = 1942;BA.debugLine="colPos = colPos + 1";
_colpos = (int) (_colpos+1);
 //BA.debugLineNum = 1944;BA.debugLine="Dim sw As VMCheckBox";
_sw = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 1945;BA.debugLine="sw.Initialize(vue, \"sw\" & k, module).SetStati";
_sw._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,"sw"+_k,_module)._setstatic /*b4j.example.vmcheckbox*/ (__c.True)._setvmodel /*b4j.example.vmcheckbox*/ (_k)._setswitch /*b4j.example.vmcheckbox*/ ();
 //BA.debugLineNum = 1946;BA.debugLine="sw.Setlabel(v).SetTrueValue(\"Yes\").SetFalseVa";
_sw._setlabel /*b4j.example.vmcheckbox*/ (_v)._settruevalue /*b4j.example.vmcheckbox*/ ("Yes")._setfalsevalue /*b4j.example.vmcheckbox*/ ("No")._sethidedetails /*b4j.example.vmcheckbox*/ (__c.True)._setfieldtype /*b4j.example.vmcheckbox*/ ("string");
 //BA.debugLineNum = 1947;BA.debugLine="sw.RemoveAttr(\"ref\").SetDense(True).SetOnChan";
_sw._removeattr /*b4j.example.vmcheckbox*/ ("ref")._setdense /*b4j.example.vmcheckbox*/ (__c.True)._setonchange /*b4j.example.vmcheckbox*/ (this,"RaiseChangeEvent")._setinset /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 1948;BA.debugLine="sw.AddClass(\"my-1\")";
_sw._addclass /*b4j.example.vmcheckbox*/ ("my-1");
 //BA.debugLineNum = 1949;BA.debugLine="acont.AddControlS(sw.CheckBox, sw.ToString, 1";
_acont._addcontrols /*String*/ (_sw._checkbox /*b4j.example.vmelement*/ ,_sw._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(_colpos),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 1950;BA.debugLine="vue.SetData(k, \"No\")";
_vue._setdata /*b4j.example.bananovue*/ (_k,(Object)("No"));
 }
};
 //BA.debugLineNum = 1952;BA.debugLine="expanel.Container.AddControlS(acont.Container,";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_acont._container /*b4j.example.vmelement*/ ,_acont._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 5: {
 //BA.debugLineNum = 1954;BA.debugLine="Dim tcont As VMContainer";
_tcont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 1955;BA.debugLine="tcont.Initialize(vue, \"\", module).SetTag(\"div\"";
_tcont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"",_module)._settag /*b4j.example.vmcontainer*/ ("div");
 //BA.debugLineNum = 1956;BA.debugLine="tcont.NoGutters = True";
_tcont._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 1957;BA.debugLine="tcont.SetFluid(True)";
_tcont._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1959;BA.debugLine="sText.Add(nc.vmodel)";
_stext.Add((Object)(_nc.vmodel /*String*/ ));
 //BA.debugLineNum = 1960;BA.debugLine="sText.Add(nc.vmodel1)";
_stext.Add((Object)(_nc.vmodel1 /*String*/ ));
 //BA.debugLineNum = 1962;BA.debugLine="Dim cbo As VMSelect";
_cbo = new b4j.example.vmselect();
 //BA.debugLineNum = 1963;BA.debugLine="cbo.Initialize(vue, \"cbo\" & nc.vmodel, module)";
_cbo._initialize /*b4j.example.vmselect*/ (ba,_vue,"cbo"+_nc.vmodel /*String*/ ,_module)._setstatic /*b4j.example.vmselect*/ (__c.True)._setlabel /*b4j.example.vmselect*/ (_nc.text /*String*/ )._setvmodel /*b4j.example.vmselect*/ (_nc.vmodel /*String*/ );
 //BA.debugLineNum = 1964;BA.debugLine="cbo.SetOptions(nc.sourceName, nc.options, nc.s";
_cbo._setoptions /*b4j.example.vmselect*/ (_nc.sourceName /*String*/ ,_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ ,_nc.sourcefield /*String*/ ,_nc.displayfield /*String*/ ,__c.False)._removeattr /*b4j.example.vmselect*/ ("ref")._setdense /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1965;BA.debugLine="cbo.SetOutlined(True).SetHideDetails(True).Add";
_cbo._setoutlined /*b4j.example.vmselect*/ (__c.True)._sethidedetails /*b4j.example.vmselect*/ (__c.True)._addclass /*b4j.example.vmselect*/ ("my-1")._setvshow /*b4j.example.vmselect*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 1966;BA.debugLine="cbo.SetOnChange(Me, \"RaiseChangeEvent\")";
_cbo._setonchange /*b4j.example.vmselect*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 1967;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 1968;BA.debugLine="tcont.AddControlS(cbo.Combo, cbo.ToString, 1,";
_tcont._addcontrols /*String*/ (_cbo._combo /*b4j.example.vmelement*/ ,_cbo._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 1970;BA.debugLine="Dim cbo1 As VMSelect";
_cbo1 = new b4j.example.vmselect();
 //BA.debugLineNum = 1971;BA.debugLine="cbo1.Initialize(vue, \"cbo\" & nc.vmodel1, modul";
_cbo1._initialize /*b4j.example.vmselect*/ (ba,_vue,"cbo"+_nc.vmodel1 /*String*/ ,_module)._setstatic /*b4j.example.vmselect*/ (__c.True)._setlabel /*b4j.example.vmselect*/ (_nc.text1 /*String*/ )._setvmodel /*b4j.example.vmselect*/ (_nc.vmodel1 /*String*/ );
 //BA.debugLineNum = 1972;BA.debugLine="cbo1.SetOptions(nc.sourceName1, nc.options1, n";
_cbo1._setoptions /*b4j.example.vmselect*/ (_nc.sourceName1 /*String*/ ,_nc.options1 /*anywheresoftware.b4a.objects.collections.Map*/ ,_nc.sourcefield1 /*String*/ ,_nc.displayfield1 /*String*/ ,__c.False)._removeattr /*b4j.example.vmselect*/ ("ref")._setdense /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1973;BA.debugLine="cbo1.SetOutlined(True).SetHideDetails(True).Ad";
_cbo1._setoutlined /*b4j.example.vmselect*/ (__c.True)._sethidedetails /*b4j.example.vmselect*/ (__c.True)._addclass /*b4j.example.vmselect*/ ("my-1")._setvshow /*b4j.example.vmselect*/ (_nc.vmodel1 /*String*/ +"show");
 //BA.debugLineNum = 1974;BA.debugLine="cbo1.SetOnChange(Me, \"RaiseChangeEvent\")";
_cbo1._setonchange /*b4j.example.vmselect*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 1975;BA.debugLine="vue.SetData(nc.vmodel1 & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel1 /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 1976;BA.debugLine="tcont.AddControlS(cbo1.Combo, cbo1.ToString, 1";
_tcont._addcontrols /*String*/ (_cbo1._combo /*b4j.example.vmelement*/ ,_cbo1._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 1978;BA.debugLine="expanel.Container.AddControlS(tcont.Container,";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_tcont._container /*b4j.example.vmelement*/ ,_tcont._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 6: {
 //BA.debugLineNum = 1981;BA.debugLine="Dim tcont As VMContainer";
_tcont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 1982;BA.debugLine="tcont.Initialize(vue, \"t\" & nc.vmodel, module)";
_tcont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"t"+_nc.vmodel /*String*/ ,_module)._settag /*b4j.example.vmcontainer*/ ("div");
 //BA.debugLineNum = 1983;BA.debugLine="tcont.NoGutters = True";
_tcont._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 1984;BA.debugLine="tcont.SetFluid(True)";
_tcont._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 1985;BA.debugLine="Dim colSize As Int";
_colsize = 0;
 //BA.debugLineNum = 1986;BA.debugLine="Dim m As Map = nc.options";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _nc.options /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 1987;BA.debugLine="Dim tTot As Int = m.Size";
_ttot = _m.getSize();
 //BA.debugLineNum = 1988;BA.debugLine="Select Case tTot";
switch (_ttot) {
case 12: {
 //BA.debugLineNum = 1990;BA.debugLine="colSize = 1";
_colsize = (int) (1);
 break; }
case 1: {
 //BA.debugLineNum = 1992;BA.debugLine="colSize = 12";
_colsize = (int) (12);
 break; }
case 2: {
 //BA.debugLineNum = 1994;BA.debugLine="colSize = 6";
_colsize = (int) (6);
 break; }
case 3: {
 //BA.debugLineNum = 1996;BA.debugLine="colSize = 4";
_colsize = (int) (4);
 break; }
case 4: {
 //BA.debugLineNum = 1998;BA.debugLine="colSize = 3";
_colsize = (int) (3);
 break; }
default: {
 //BA.debugLineNum = 2000;BA.debugLine="colSize = 2";
_colsize = (int) (2);
 break; }
}
;
 //BA.debugLineNum = 2003;BA.debugLine="Dim colPos As Int = 0";
_colpos = (int) (0);
 //BA.debugLineNum = 2004;BA.debugLine="For Each k As String In nc.options.Keys";
{
final anywheresoftware.b4a.BA.IterableList group572 = _nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen572 = group572.getSize()
;int index572 = 0;
;
for (; index572 < groupLen572;index572++){
_k = BA.ObjectToString(group572.Get(index572));
 //BA.debugLineNum = 2005;BA.debugLine="Dim v As String = nc.options.Get(k)";
_v = BA.ObjectToString(_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
 //BA.debugLineNum = 2006;BA.debugLine="colPos = colPos + 1";
_colpos = (int) (_colpos+1);
 //BA.debugLineNum = 2008;BA.debugLine="Dim tw As VMTextField";
_tw = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2009;BA.debugLine="tw.Initialize(vue, k, module).SetStatic(True)";
_tw._initialize /*b4j.example.vmtextfield*/ (ba,_vue,_k,_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ (_v);
 //BA.debugLineNum = 2010;BA.debugLine="tw.SetVModel(k).SetType(\"text\").RemoveAttr(\"r";
_tw._setvmodel /*b4j.example.vmtextfield*/ (_k)._settype /*b4j.example.vmtextfield*/ ("text")._removeattr /*b4j.example.vmtextfield*/ ("ref")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2011;BA.debugLine="tw.SetHideDetails(True).AddClass(\"my-1\")";
_tw._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2012;BA.debugLine="tcont.AddControlS(tw.TextField, tw.ToString,";
_tcont._addcontrols /*String*/ (_tw._textfield /*b4j.example.vmelement*/ ,_tw._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(_colpos),BA.NumberToString(_colsize),BA.NumberToString(_colsize),BA.NumberToString(_colsize),BA.NumberToString(_colsize));
 }
};
 //BA.debugLineNum = 2014;BA.debugLine="expanel.Container.AddControlS(tcont.Container,";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_tcont._container /*b4j.example.vmelement*/ ,_tcont._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 7: {
 //BA.debugLineNum = 2016;BA.debugLine="Dim wcont As VMContainer";
_wcont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 2017;BA.debugLine="wcont.Initialize(vue, \"w\" & nc.vmodel, module)";
_wcont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"w"+_nc.vmodel /*String*/ ,_module)._settag /*b4j.example.vmcontainer*/ ("div");
 //BA.debugLineNum = 2018;BA.debugLine="wcont.NoGutters = True";
_wcont._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 2019;BA.debugLine="wcont.SetFluid(True)";
_wcont._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 2021;BA.debugLine="Dim w1 As VMTextField";
_w1 = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2022;BA.debugLine="w1.Initialize(vue, \"txtwidth\", module).SetStat";
_w1._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"txtwidth",_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ ("Width");
 //BA.debugLineNum = 2023;BA.debugLine="w1.SetVModel(\"width\").SetDense(True).SetOutlin";
_w1._setvmodel /*b4j.example.vmtextfield*/ ("width")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2024;BA.debugLine="w1.SetHideDetails(True).AddClass(\"my-1\")";
_w1._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2025;BA.debugLine="wcont.AddControlS(w1.TextField, w1.ToString, 1";
_wcont._addcontrols /*String*/ (_w1._textfield /*b4j.example.vmelement*/ ,_w1._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(4),BA.NumberToString(4),BA.NumberToString(4),BA.NumberToString(4));
 //BA.debugLineNum = 2027;BA.debugLine="Dim w2 As VMTextField";
_w2 = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2028;BA.debugLine="w2.Initialize(vue, \"txtminwidth\", module).SetS";
_w2._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"txtminwidth",_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ ("Min Width");
 //BA.debugLineNum = 2029;BA.debugLine="w2.SetVModel(\"minwidth\").SetDense(True).SetOu";
_w2._setvmodel /*b4j.example.vmtextfield*/ ("minwidth")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2030;BA.debugLine="w2.SetHideDetails(True).AddClass(\"my-1\")";
_w2._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2031;BA.debugLine="wcont.AddControlS(w2.TextField, w2.ToString, 1";
_wcont._addcontrols /*String*/ (_w2._textfield /*b4j.example.vmelement*/ ,_w2._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(4),BA.NumberToString(4),BA.NumberToString(4),BA.NumberToString(4));
 //BA.debugLineNum = 2033;BA.debugLine="Dim w3 As VMTextField";
_w3 = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2034;BA.debugLine="w3.Initialize(vue, \"txtmaxwidth\", module).SetS";
_w3._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"txtmaxwidth",_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ ("Max Width");
 //BA.debugLineNum = 2035;BA.debugLine="w3.SetVModel(\"maxwidth\").SetDense(True).SetOu";
_w3._setvmodel /*b4j.example.vmtextfield*/ ("maxwidth")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2036;BA.debugLine="w3.SetHideDetails(True).AddClass(\"my-1\")";
_w3._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2037;BA.debugLine="wcont.AddControlS(w3.TextField, w3.ToString, 1";
_wcont._addcontrols /*String*/ (_w3._textfield /*b4j.example.vmelement*/ ,_w3._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(3),BA.NumberToString(4),BA.NumberToString(4),BA.NumberToString(4),BA.NumberToString(4));
 //BA.debugLineNum = 2039;BA.debugLine="Dim h1 As VMTextField";
_h1 = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2040;BA.debugLine="h1.Initialize(vue, \"txtheight\", module).SetSta";
_h1._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"txtheight",_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ ("Height");
 //BA.debugLineNum = 2041;BA.debugLine="h1.SetVModel(\"height\").SetDense(True).SetOutl";
_h1._setvmodel /*b4j.example.vmtextfield*/ ("height")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2042;BA.debugLine="h1.SetHideDetails(True).AddClass(\"my-1\")";
_h1._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2043;BA.debugLine="wcont.AddControlS(h1.TextField, h1.ToString, 2";
_wcont._addcontrols /*String*/ (_h1._textfield /*b4j.example.vmelement*/ ,_h1._tostring /*String*/ (),BA.NumberToString(2),BA.NumberToString(1),BA.NumberToString(4),BA.NumberToString(4),BA.NumberToString(4),BA.NumberToString(4));
 //BA.debugLineNum = 2045;BA.debugLine="Dim h2 As VMTextField";
_h2 = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2046;BA.debugLine="h2.Initialize(vue, \"txtminheight\", module).Set";
_h2._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"txtminheight",_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ ("Min Height");
 //BA.debugLineNum = 2047;BA.debugLine="h2.SetVModel(\"minheight\").SetDense(True).SetO";
_h2._setvmodel /*b4j.example.vmtextfield*/ ("minheight")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2048;BA.debugLine="h2.SetHideDetails(True).AddClass(\"my-1\")";
_h2._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2049;BA.debugLine="wcont.AddControlS(h2.TextField, h2.ToString, 2";
_wcont._addcontrols /*String*/ (_h2._textfield /*b4j.example.vmelement*/ ,_h2._tostring /*String*/ (),BA.NumberToString(2),BA.NumberToString(2),BA.NumberToString(4),BA.NumberToString(4),BA.NumberToString(4),BA.NumberToString(4));
 //BA.debugLineNum = 2051;BA.debugLine="Dim h3 As VMTextField";
_h3 = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2052;BA.debugLine="h3.Initialize(vue, \"txtmaxheight\", module).Set";
_h3._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"txtmaxheight",_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ ("Max Height");
 //BA.debugLineNum = 2053;BA.debugLine="h3.SetVModel(\"maxheight\").SetDense(True).SetO";
_h3._setvmodel /*b4j.example.vmtextfield*/ ("maxheight")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2054;BA.debugLine="h3.SetHideDetails(True).AddClass(\"my-1\")";
_h3._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2055;BA.debugLine="wcont.AddControlS(h3.TextField, h3.ToString, 2";
_wcont._addcontrols /*String*/ (_h3._textfield /*b4j.example.vmelement*/ ,_h3._tostring /*String*/ (),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(4),BA.NumberToString(4),BA.NumberToString(4),BA.NumberToString(4));
 //BA.debugLineNum = 2057;BA.debugLine="expanel.Container.AddControlS(wcont.Container,";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_wcont._container /*b4j.example.vmelement*/ ,_wcont._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 8: {
 //BA.debugLineNum = 2060;BA.debugLine="nc.cont.NoGutters = True";
_nc.cont /*b4j.example.vmcontainer*/ ._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 2061;BA.debugLine="nc.cont.SetTag(\"div\")";
_nc.cont /*b4j.example.vmcontainer*/ ._settag /*b4j.example.vmcontainer*/ ("div");
 //BA.debugLineNum = 2062;BA.debugLine="nc.Cont.SetFluid(True)";
_nc.cont /*b4j.example.vmcontainer*/ ._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 2063;BA.debugLine="nc.cont.NoGutters = True";
_nc.cont /*b4j.example.vmcontainer*/ ._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 2064;BA.debugLine="expanel.Content.Container.AddControlS(nc.cont.";
_expanel._content /*b4j.example.vmexpansionpanelcontent*/ ._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_nc.cont /*b4j.example.vmcontainer*/ ._container /*b4j.example.vmelement*/ ,_nc.cont /*b4j.example.vmcontainer*/ ._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 9: {
 //BA.debugLineNum = 2066;BA.debugLine="Dim scont As VMContainer";
_scont = new b4j.example.vmcontainer();
 //BA.debugLineNum = 2067;BA.debugLine="scont.Initialize(vue, \"size\" & nc.vmodel, modu";
_scont._initialize /*b4j.example.vmcontainer*/ (ba,_vue,"size"+_nc.vmodel /*String*/ ,_module)._settag /*b4j.example.vmcontainer*/ ("div");
 //BA.debugLineNum = 2068;BA.debugLine="scont.NoGutters = True";
_scont._nogutters /*boolean*/  = __c.True;
 //BA.debugLineNum = 2069;BA.debugLine="scont.SetFluid(True)";
_scont._setfluid /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 2071;BA.debugLine="Dim rw As VMTextField";
_rw = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2072;BA.debugLine="rw.Initialize(vue, \"txtrow\", module).SetStatic";
_rw._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"txtrow",_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ ("Row");
 //BA.debugLineNum = 2073;BA.debugLine="rw.SetVModel(\"row\").SetType(\"number\").RemoveA";
_rw._setvmodel /*b4j.example.vmtextfield*/ ("row")._settype /*b4j.example.vmtextfield*/ ("number")._removeattr /*b4j.example.vmtextfield*/ ("ref")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2074;BA.debugLine="rw.SetHideDetails(True).AddClass(\"my-1\")";
_rw._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2075;BA.debugLine="scont.AddControlS(rw.TextField, rw.ToString, 1";
_scont._addcontrols /*String*/ (_rw._textfield /*b4j.example.vmelement*/ ,_rw._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 2077;BA.debugLine="Dim cl As VMTextField";
_cl = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2078;BA.debugLine="cl.Initialize(vue, \"txtcol\", module).SetStatic";
_cl._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"txtcol",_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ ("Col");
 //BA.debugLineNum = 2079;BA.debugLine="cl.SetVModel(\"col\").SetType(\"number\").RemoveA";
_cl._setvmodel /*b4j.example.vmtextfield*/ ("col")._settype /*b4j.example.vmtextfield*/ ("number")._removeattr /*b4j.example.vmtextfield*/ ("ref")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2080;BA.debugLine="cl.SetHideDetails(True).AddClass(\"my-1\")";
_cl._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2081;BA.debugLine="scont.AddControlS(cl.TextField, cl.ToString, 1";
_scont._addcontrols /*String*/ (_cl._textfield /*b4j.example.vmelement*/ ,_cl._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 2083;BA.debugLine="Dim os As VMTextField";
_os = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2084;BA.debugLine="os.Initialize(vue, \"txtoffsetsmall\", module).S";
_os._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"txtoffsetsmall",_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ ("OS");
 //BA.debugLineNum = 2085;BA.debugLine="os.SetVModel(\"offsetsmall\").SetType(\"number\")";
_os._setvmodel /*b4j.example.vmtextfield*/ ("offsetsmall")._settype /*b4j.example.vmtextfield*/ ("number")._removeattr /*b4j.example.vmtextfield*/ ("ref")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2086;BA.debugLine="os.SetHideDetails(True).AddClass(\"my-1\")";
_os._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2087;BA.debugLine="scont.AddControlS(os.TextField, os.ToString, 2";
_scont._addcontrols /*String*/ (_os._textfield /*b4j.example.vmelement*/ ,_os._tostring /*String*/ (),BA.NumberToString(2),BA.NumberToString(1),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 2089;BA.debugLine="Dim om As VMTextField";
_om = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2090;BA.debugLine="om.Initialize(vue, \"txtoffsetmedium\", module).";
_om._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"txtoffsetmedium",_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ ("OM");
 //BA.debugLineNum = 2091;BA.debugLine="om.SetVModel(\"offsetmedium\").SetType(\"number\"";
_om._setvmodel /*b4j.example.vmtextfield*/ ("offsetmedium")._settype /*b4j.example.vmtextfield*/ ("number")._removeattr /*b4j.example.vmtextfield*/ ("ref")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2092;BA.debugLine="om.SetHideDetails(True).AddClass(\"my-1\")";
_om._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2093;BA.debugLine="scont.AddControlS(om.TextField, om.ToString, 2";
_scont._addcontrols /*String*/ (_om._textfield /*b4j.example.vmelement*/ ,_om._tostring /*String*/ (),BA.NumberToString(2),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 2095;BA.debugLine="Dim ol As VMTextField";
_ol = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2096;BA.debugLine="ol.Initialize(vue, \"txtoffsetlarge\", module).S";
_ol._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"txtoffsetlarge",_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ ("OL");
 //BA.debugLineNum = 2097;BA.debugLine="ol.SetVModel(\"offsetlarge\").SetType(\"number\")";
_ol._setvmodel /*b4j.example.vmtextfield*/ ("offsetlarge")._settype /*b4j.example.vmtextfield*/ ("number")._removeattr /*b4j.example.vmtextfield*/ ("ref")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2098;BA.debugLine="ol.SetHideDetails(True).AddClass(\"my-1\")";
_ol._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2099;BA.debugLine="scont.AddControlS(ol.TextField, ol.ToString, 2";
_scont._addcontrols /*String*/ (_ol._textfield /*b4j.example.vmelement*/ ,_ol._tostring /*String*/ (),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 2101;BA.debugLine="Dim oxl As VMTextField";
_oxl = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2102;BA.debugLine="oxl.Initialize(vue, \"txtoffsetxlarge\", module)";
_oxl._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"txtoffsetxlarge",_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ ("OX");
 //BA.debugLineNum = 2103;BA.debugLine="oxl.SetVModel(\"offsetxlarge\").SetType(\"number";
_oxl._setvmodel /*b4j.example.vmtextfield*/ ("offsetxlarge")._settype /*b4j.example.vmtextfield*/ ("number")._removeattr /*b4j.example.vmtextfield*/ ("ref")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2104;BA.debugLine="oxl.SetHideDetails(True).AddClass(\"my-1\")";
_oxl._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2105;BA.debugLine="scont.AddControlS(oxl.TextField, oxl.ToString,";
_scont._addcontrols /*String*/ (_oxl._textfield /*b4j.example.vmelement*/ ,_oxl._tostring /*String*/ (),BA.NumberToString(2),BA.NumberToString(4),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 2107;BA.debugLine="Dim ss As VMTextField";
_ss = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2108;BA.debugLine="ss.Initialize(vue, \"txtsizesmall\", module).Set";
_ss._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"txtsizesmall",_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ ("SS");
 //BA.debugLineNum = 2109;BA.debugLine="ss.SetVModel(\"sizesmall\").SetType(\"number\").R";
_ss._setvmodel /*b4j.example.vmtextfield*/ ("sizesmall")._settype /*b4j.example.vmtextfield*/ ("number")._removeattr /*b4j.example.vmtextfield*/ ("ref")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2110;BA.debugLine="ss.SetHideDetails(True).AddClass(\"my-1\")";
_ss._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2111;BA.debugLine="scont.AddControlS(ss.TextField, ss.ToString, 3";
_scont._addcontrols /*String*/ (_ss._textfield /*b4j.example.vmelement*/ ,_ss._tostring /*String*/ (),BA.NumberToString(3),BA.NumberToString(1),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 2113;BA.debugLine="Dim sm As VMTextField";
_sm = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2114;BA.debugLine="sm.Initialize(vue, \"txtsizemedium\", module).Se";
_sm._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"txtsizemedium",_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ ("SM");
 //BA.debugLineNum = 2115;BA.debugLine="sm.SetVModel(\"sizemedium\").SetType(\"number\").";
_sm._setvmodel /*b4j.example.vmtextfield*/ ("sizemedium")._settype /*b4j.example.vmtextfield*/ ("number")._removeattr /*b4j.example.vmtextfield*/ ("ref")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2116;BA.debugLine="sm.SetHideDetails(True).AddClass(\"my-1\")";
_sm._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2117;BA.debugLine="scont.AddControlS(sm.TextField, sm.ToString, 3";
_scont._addcontrols /*String*/ (_sm._textfield /*b4j.example.vmelement*/ ,_sm._tostring /*String*/ (),BA.NumberToString(3),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 2119;BA.debugLine="Dim sl As VMTextField";
_sl = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2120;BA.debugLine="sl.Initialize(vue, \"txtsizelarge\", module).Set";
_sl._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"txtsizelarge",_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ ("SL");
 //BA.debugLineNum = 2121;BA.debugLine="sl.SetVModel(\"sizelarge\").SetType(\"number\").R";
_sl._setvmodel /*b4j.example.vmtextfield*/ ("sizelarge")._settype /*b4j.example.vmtextfield*/ ("number")._removeattr /*b4j.example.vmtextfield*/ ("ref")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2122;BA.debugLine="sl.SetHideDetails(True).AddClass(\"my-1\")";
_sl._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2123;BA.debugLine="scont.AddControlS(sl.TextField, sl.ToString, 3";
_scont._addcontrols /*String*/ (_sl._textfield /*b4j.example.vmelement*/ ,_sl._tostring /*String*/ (),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 2125;BA.debugLine="Dim sxl As VMTextField";
_sxl = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2126;BA.debugLine="sxl.Initialize(vue, \"txtsizexlarge\", module).S";
_sxl._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"txtsizexlarge",_module)._setstatic /*b4j.example.vmtextfield*/ (__c.True)._setlabel /*b4j.example.vmtextfield*/ ("SX");
 //BA.debugLineNum = 2127;BA.debugLine="sxl.SetVModel(\"sizexlarge\").SetType(\"number\")";
_sxl._setvmodel /*b4j.example.vmtextfield*/ ("sizexlarge")._settype /*b4j.example.vmtextfield*/ ("number")._removeattr /*b4j.example.vmtextfield*/ ("ref")._setdense /*b4j.example.vmtextfield*/ (__c.True)._setoutlined /*b4j.example.vmtextfield*/ (__c.True)._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2128;BA.debugLine="sxl.SetHideDetails(True).AddClass(\"my-1\")";
_sxl._sethidedetails /*b4j.example.vmtextfield*/ (__c.True)._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2129;BA.debugLine="scont.AddControlS(sxl.TextField, sxl.ToString,";
_scont._addcontrols /*String*/ (_sxl._textfield /*b4j.example.vmelement*/ ,_sxl._tostring /*String*/ (),BA.NumberToString(3),BA.NumberToString(4),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 2131;BA.debugLine="expanel.Content.Container.AddControlS(scont.Co";
_expanel._content /*b4j.example.vmexpansionpanelcontent*/ ._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_scont._container /*b4j.example.vmelement*/ ,_scont._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 10: {
 //BA.debugLineNum = 2133;BA.debugLine="sText.Add(nc.vmodel)";
_stext.Add((Object)(_nc.vmodel /*String*/ ));
 //BA.debugLineNum = 2134;BA.debugLine="Dim cbo As VMSelect";
_cbo = new b4j.example.vmselect();
 //BA.debugLineNum = 2135;BA.debugLine="cbo.Initialize(vue, \"cbo\" & nc.vmodel, module)";
_cbo._initialize /*b4j.example.vmselect*/ (ba,_vue,"cbo"+_nc.vmodel /*String*/ ,_module);
 //BA.debugLineNum = 2136;BA.debugLine="cbo.SetStatic(True)";
_cbo._setstatic /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2137;BA.debugLine="cbo.Setlabel(nc.Text)";
_cbo._setlabel /*b4j.example.vmselect*/ (_nc.text /*String*/ );
 //BA.debugLineNum = 2138;BA.debugLine="cbo.SetVModel(nc.vmodel)";
_cbo._setvmodel /*b4j.example.vmselect*/ (_nc.vmodel /*String*/ );
 //BA.debugLineNum = 2139;BA.debugLine="cbo.SetDataSource(nc.sourceName, nc.sourcefiel";
_cbo._setdatasource /*b4j.example.vmselect*/ (_nc.sourceName /*String*/ ,_nc.sourcefield /*String*/ ,_nc.displayfield /*String*/ ,__c.False);
 //BA.debugLineNum = 2140;BA.debugLine="cbo.RemoveAttr(\"ref\")";
_cbo._removeattr /*b4j.example.vmselect*/ ("ref");
 //BA.debugLineNum = 2141;BA.debugLine="cbo.SetDense(True)";
_cbo._setdense /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2142;BA.debugLine="cbo.SetOutlined(True)";
_cbo._setoutlined /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2143;BA.debugLine="cbo.SetHideDetails(True)";
_cbo._sethidedetails /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2144;BA.debugLine="cbo.AddClass(\"my-1\")";
_cbo._addclass /*b4j.example.vmselect*/ ("my-1");
 //BA.debugLineNum = 2145;BA.debugLine="cbo.SetVShow(nc.vmodel & \"show\")";
_cbo._setvshow /*b4j.example.vmselect*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2146;BA.debugLine="cbo.SetOnChange(module, nc.methodname)";
_cbo._setonchange /*b4j.example.vmselect*/ (_module,_nc.methodName /*String*/ );
 //BA.debugLineNum = 2147;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2148;BA.debugLine="Dim scombo As String = cbo.tostring";
_scombo = _cbo._tostring /*String*/ ();
 //BA.debugLineNum = 2149;BA.debugLine="expanel.Content.Container.AddControlS(cbo.Comb";
_expanel._content /*b4j.example.vmexpansionpanelcontent*/ ._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_cbo._combo /*b4j.example.vmelement*/ ,_scombo,BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 11: {
 //BA.debugLineNum = 2151;BA.debugLine="sText.Add(nc.vmodel)";
_stext.Add((Object)(_nc.vmodel /*String*/ ));
 //BA.debugLineNum = 2152;BA.debugLine="Dim cbo As VMSelect";
_cbo = new b4j.example.vmselect();
 //BA.debugLineNum = 2153;BA.debugLine="cbo.Initialize(vue, \"cbo\" & nc.vmodel, module)";
_cbo._initialize /*b4j.example.vmselect*/ (ba,_vue,"cbo"+_nc.vmodel /*String*/ ,_module);
 //BA.debugLineNum = 2154;BA.debugLine="cbo.SetStatic(True)";
_cbo._setstatic /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2155;BA.debugLine="cbo.Setlabel(nc.Text)";
_cbo._setlabel /*b4j.example.vmselect*/ (_nc.text /*String*/ );
 //BA.debugLineNum = 2156;BA.debugLine="cbo.SetVModel(nc.vmodel)";
_cbo._setvmodel /*b4j.example.vmselect*/ (_nc.vmodel /*String*/ );
 //BA.debugLineNum = 2157;BA.debugLine="cbo.SetDataSource(nc.sourceName, nc.sourcefiel";
_cbo._setdatasource /*b4j.example.vmselect*/ (_nc.sourceName /*String*/ ,_nc.sourcefield /*String*/ ,_nc.displayfield /*String*/ ,__c.False);
 //BA.debugLineNum = 2158;BA.debugLine="cbo.RemoveAttr(\"ref\")";
_cbo._removeattr /*b4j.example.vmselect*/ ("ref");
 //BA.debugLineNum = 2159;BA.debugLine="cbo.SetDense(True)";
_cbo._setdense /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2160;BA.debugLine="cbo.SetOutlined(True)";
_cbo._setoutlined /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2161;BA.debugLine="cbo.SetHideDetails(True)";
_cbo._sethidedetails /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2162;BA.debugLine="cbo.AddClass(\"my-1\")";
_cbo._addclass /*b4j.example.vmselect*/ ("my-1");
 //BA.debugLineNum = 2163;BA.debugLine="cbo.SetVShow(nc.vmodel & \"show\")";
_cbo._setvshow /*b4j.example.vmselect*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2164;BA.debugLine="cbo.SetOnChange(Me, \"RaiseChangeEvent\")";
_cbo._setonchange /*b4j.example.vmselect*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2165;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2166;BA.debugLine="Dim scombo As String = cbo.tostring";
_scombo = _cbo._tostring /*String*/ ();
 //BA.debugLineNum = 2167;BA.debugLine="expanel.Content.Container.AddControlS(cbo.Comb";
_expanel._content /*b4j.example.vmexpansionpanelcontent*/ ._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_cbo._combo /*b4j.example.vmelement*/ ,_scombo,BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 12: {
 //BA.debugLineNum = 2169;BA.debugLine="sText.Add(nc.vmodel)";
_stext.Add((Object)(_nc.vmodel /*String*/ ));
 //BA.debugLineNum = 2170;BA.debugLine="Dim cbo As VMSelect";
_cbo = new b4j.example.vmselect();
 //BA.debugLineNum = 2171;BA.debugLine="cbo.Initialize(vue, \"cbo\" & nc.vmodel, module)";
_cbo._initialize /*b4j.example.vmselect*/ (ba,_vue,"cbo"+_nc.vmodel /*String*/ ,_module);
 //BA.debugLineNum = 2172;BA.debugLine="cbo.SetStatic(True)";
_cbo._setstatic /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2173;BA.debugLine="cbo.Setlabel(nc.Text)";
_cbo._setlabel /*b4j.example.vmselect*/ (_nc.text /*String*/ );
 //BA.debugLineNum = 2174;BA.debugLine="cbo.SetVModel(nc.vmodel)";
_cbo._setvmodel /*b4j.example.vmselect*/ (_nc.vmodel /*String*/ );
 //BA.debugLineNum = 2175;BA.debugLine="cbo.SetOptions(nc.sourceName, nc.options, nc.s";
_cbo._setoptions /*b4j.example.vmselect*/ (_nc.sourceName /*String*/ ,_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ ,_nc.sourcefield /*String*/ ,_nc.displayfield /*String*/ ,__c.False);
 //BA.debugLineNum = 2176;BA.debugLine="cbo.RemoveAttr(\"ref\")";
_cbo._removeattr /*b4j.example.vmselect*/ ("ref");
 //BA.debugLineNum = 2177;BA.debugLine="cbo.SetDense(True)";
_cbo._setdense /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2178;BA.debugLine="cbo.SetOutlined(True)";
_cbo._setoutlined /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2179;BA.debugLine="cbo.SetHideDetails(True)";
_cbo._sethidedetails /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2180;BA.debugLine="cbo.AddClass(\"my-1\")";
_cbo._addclass /*b4j.example.vmselect*/ ("my-1");
 //BA.debugLineNum = 2181;BA.debugLine="cbo.SetVShow(nc.vmodel & \"show\")";
_cbo._setvshow /*b4j.example.vmselect*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2182;BA.debugLine="cbo.SetOnChange(Me, \"RaiseChangeEvent\")";
_cbo._setonchange /*b4j.example.vmselect*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2183;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2184;BA.debugLine="Dim scombo As String = cbo.tostring";
_scombo = _cbo._tostring /*String*/ ();
 //BA.debugLineNum = 2185;BA.debugLine="expanel.Content.Container.AddControlS(cbo.Comb";
_expanel._content /*b4j.example.vmexpansionpanelcontent*/ ._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_cbo._combo /*b4j.example.vmelement*/ ,_scombo,BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 13: {
 //BA.debugLineNum = 2187;BA.debugLine="sText.Add(nc.vmodel)";
_stext.Add((Object)(_nc.vmodel /*String*/ ));
 //BA.debugLineNum = 2188;BA.debugLine="Dim cbo As VMSelect";
_cbo = new b4j.example.vmselect();
 //BA.debugLineNum = 2189;BA.debugLine="cbo.Initialize(vue, \"cbo\" & nc.vmodel, module)";
_cbo._initialize /*b4j.example.vmselect*/ (ba,_vue,"cbo"+_nc.vmodel /*String*/ ,_module);
 //BA.debugLineNum = 2190;BA.debugLine="cbo.SetStatic(True)";
_cbo._setstatic /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2191;BA.debugLine="cbo.Setlabel(nc.Text)";
_cbo._setlabel /*b4j.example.vmselect*/ (_nc.text /*String*/ );
 //BA.debugLineNum = 2192;BA.debugLine="cbo.SetVModel(nc.vmodel)";
_cbo._setvmodel /*b4j.example.vmselect*/ (_nc.vmodel /*String*/ );
 //BA.debugLineNum = 2193;BA.debugLine="cbo.SetOptions(nc.sourceName, nc.options, nc.s";
_cbo._setoptions /*b4j.example.vmselect*/ (_nc.sourceName /*String*/ ,_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ ,_nc.sourcefield /*String*/ ,_nc.displayfield /*String*/ ,__c.False);
 //BA.debugLineNum = 2194;BA.debugLine="cbo.RemoveAttr(\"ref\")";
_cbo._removeattr /*b4j.example.vmselect*/ ("ref");
 //BA.debugLineNum = 2195;BA.debugLine="cbo.SetDense(True)";
_cbo._setdense /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2196;BA.debugLine="cbo.SetOutlined(True)";
_cbo._setoutlined /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2197;BA.debugLine="cbo.SetHideDetails(True)";
_cbo._sethidedetails /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2198;BA.debugLine="cbo.AddClass(\"my-1\")";
_cbo._addclass /*b4j.example.vmselect*/ ("my-1");
 //BA.debugLineNum = 2199;BA.debugLine="cbo.SetVShow(nc.vmodel & \"show\")";
_cbo._setvshow /*b4j.example.vmselect*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2200;BA.debugLine="cbo.SetOnChange(Me, \"RaiseChangeEvent\")";
_cbo._setonchange /*b4j.example.vmselect*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2201;BA.debugLine="cbo.SetMultiple(True)";
_cbo._setmultiple /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2202;BA.debugLine="cbo.SetChips(True)";
_cbo._setchips /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2203;BA.debugLine="cbo.SetDeletableChips(True)";
_cbo._setdeletablechips /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2204;BA.debugLine="cbo.SetSmallChips(True)";
_cbo._setsmallchips /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 2205;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2206;BA.debugLine="Dim scombo As String = cbo.tostring";
_scombo = _cbo._tostring /*String*/ ();
 //BA.debugLineNum = 2207;BA.debugLine="expanel.Content.Container.AddControlS(cbo.Comb";
_expanel._content /*b4j.example.vmexpansionpanelcontent*/ ._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_cbo._combo /*b4j.example.vmelement*/ ,_scombo,BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 14: {
 //BA.debugLineNum = 2209;BA.debugLine="Dim btnx As VMButton";
_btnx = new b4j.example.vmbutton();
 //BA.debugLineNum = 2210;BA.debugLine="btnx.Initialize(vue, nc.value, module)";
_btnx._initialize /*b4j.example.vmbutton*/ (ba,_vue,_nc.value /*String*/ ,_module);
 //BA.debugLineNum = 2211;BA.debugLine="btnx.SetLabel(nc.text)";
_btnx._setlabel /*b4j.example.vmbutton*/ (_nc.text /*String*/ );
 //BA.debugLineNum = 2212;BA.debugLine="btnx.SetRaised(True)";
_btnx._setraised /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 2213;BA.debugLine="btnx.SetPrimary(True)";
_btnx._setprimary /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 2214;BA.debugLine="btnx.SetBlock(True)";
_btnx._setblock /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 2215;BA.debugLine="btnx.RemoveAttr(\"ref\")";
_btnx._removeattr /*b4j.example.vmbutton*/ ("ref");
 //BA.debugLineNum = 2216;BA.debugLine="btnx.AddClass(\"my-1\")";
_btnx._addclass /*b4j.example.vmbutton*/ ("my-1");
 //BA.debugLineNum = 2217;BA.debugLine="btnx.SetVShow(nc.vmodel & \"show\")";
_btnx._setvshow /*b4j.example.vmbutton*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2218;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2219;BA.debugLine="If nc.methodName <> \"\" Then btnx.SetOnClick(nc";
if ((_nc.methodName /*String*/ ).equals("") == false) { 
_btnx._setonclick /*b4j.example.vmbutton*/ (_nc.methodName /*String*/ );};
 //BA.debugLineNum = 2220;BA.debugLine="expanel.Content.Container.AddControlS(btnx.But";
_expanel._content /*b4j.example.vmexpansionpanelcontent*/ ._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_btnx._button /*b4j.example.vmelement*/ ,_btnx._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 15: {
 //BA.debugLineNum = 2222;BA.debugLine="Dim sld As VMSlider";
_sld = new b4j.example.vmslider();
 //BA.debugLineNum = 2223;BA.debugLine="sld.Initialize(vue, \"sld\" & nc.vmodel, module)";
_sld._initialize /*b4j.example.vmslider*/ (ba,_vue,"sld"+_nc.vmodel /*String*/ ,_module);
 //BA.debugLineNum = 2224;BA.debugLine="sld.Setmin(nc.MinValue)";
_sld._setmin /*b4j.example.vmslider*/ (_nc.MinValue /*int*/ );
 //BA.debugLineNum = 2225;BA.debugLine="sld.Setmax(nc.MaxValue)";
_sld._setmax /*b4j.example.vmslider*/ (_nc.MaxValue /*int*/ );
 //BA.debugLineNum = 2226;BA.debugLine="sld.Setlabel(nc.text)";
_sld._setlabel /*b4j.example.vmslider*/ (_nc.text /*String*/ );
 //BA.debugLineNum = 2227;BA.debugLine="sld.SetVModel(nc.vmodel)";
_sld._setvmodel /*b4j.example.vmslider*/ (_nc.vmodel /*String*/ );
 //BA.debugLineNum = 2228;BA.debugLine="sld.SetThumbLabel(\"always\")";
_sld._setthumblabel /*b4j.example.vmslider*/ ("always");
 //BA.debugLineNum = 2229;BA.debugLine="sld.SetHideDetails(True)";
_sld._sethidedetails /*b4j.example.vmslider*/ (__c.True);
 //BA.debugLineNum = 2230;BA.debugLine="vue.SetData(nc.vmodel, nc.value)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ ,(Object)(_nc.value /*String*/ ));
 //BA.debugLineNum = 2231;BA.debugLine="sld.RemoveAttr(\"ref\")";
_sld._removeattr /*b4j.example.vmslider*/ ("ref");
 //BA.debugLineNum = 2232;BA.debugLine="sld.SetDense(True)";
_sld._setdense /*b4j.example.vmslider*/ (__c.True);
 //BA.debugLineNum = 2233;BA.debugLine="sld.SetVShow(nc.vmodel & \"show\")";
_sld._setvshow /*b4j.example.vmslider*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2234;BA.debugLine="sld.SetOnClick(\"RaiseChangeEvent\")";
_sld._setonclick /*b4j.example.vmslider*/ ("RaiseChangeEvent");
 //BA.debugLineNum = 2235;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2236;BA.debugLine="expanel.Container.AddControlS(sld.Slider, sld.";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_sld._slider /*b4j.example.vmelement*/ ,_sld._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 2237;BA.debugLine="sText.Add(nc.vmodel)";
_stext.Add((Object)(_nc.vmodel /*String*/ ));
 break; }
case 16: {
 //BA.debugLineNum = 2239;BA.debugLine="Dim lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
 //BA.debugLineNum = 2240;BA.debugLine="lbl.Initialize(vue, \"lbl\" & nc.vmodel)";
_lbl._initialize /*b4j.example.vmlabel*/ (ba,_vue,"lbl"+_nc.vmodel /*String*/ );
 //BA.debugLineNum = 2241;BA.debugLine="lbl.SetTag(\"p\")";
_lbl._settag /*b4j.example.vmlabel*/ ("p");
 //BA.debugLineNum = 2242;BA.debugLine="lbl.SetVModel(nc.vmodel, nc.text)";
_lbl._setvmodel /*b4j.example.vmlabel*/ (_nc.vmodel /*String*/ ,_nc.text /*String*/ );
 //BA.debugLineNum = 2243;BA.debugLine="lbl.RemoveAttr(\"ref\")";
_lbl._removeattr /*b4j.example.vmlabel*/ ("ref");
 //BA.debugLineNum = 2244;BA.debugLine="lbl.SetVShow(nc.vmodel & \"show\")";
_lbl._setvshow /*b4j.example.vmlabel*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2245;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2246;BA.debugLine="expanel.Container.AddControlS(lbl.label, lbl.T";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_lbl._label /*b4j.example.vmelement*/ ,_lbl._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 2247;BA.debugLine="sText.Add(nc.vmodel)";
_stext.Add((Object)(_nc.vmodel /*String*/ ));
 break; }
case 17: {
 //BA.debugLineNum = 2249;BA.debugLine="Dim sw As VMCheckBox";
_sw = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 2250;BA.debugLine="sw.Initialize(vue, \"sw\" & nc.vmodel, module).S";
_sw._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,"sw"+_nc.vmodel /*String*/ ,_module)._setswitch /*b4j.example.vmcheckbox*/ ();
 //BA.debugLineNum = 2251;BA.debugLine="sw.SetVModel(nc.vmodel)";
_sw._setvmodel /*b4j.example.vmcheckbox*/ (_nc.vmodel /*String*/ );
 //BA.debugLineNum = 2252;BA.debugLine="sw.Setlabel(nc.text)";
_sw._setlabel /*b4j.example.vmcheckbox*/ (_nc.text /*String*/ );
 //BA.debugLineNum = 2253;BA.debugLine="sw.SetTrueValue(nc.value)";
_sw._settruevalue /*b4j.example.vmcheckbox*/ (_nc.value /*String*/ );
 //BA.debugLineNum = 2254;BA.debugLine="sw.SetFalseValue(\"No\")";
_sw._setfalsevalue /*b4j.example.vmcheckbox*/ ("No");
 //BA.debugLineNum = 2255;BA.debugLine="sw.SetHideDetails(True)";
_sw._sethidedetails /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 2256;BA.debugLine="vue.SetData(nc.vmodel, \"No\")";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ ,(Object)("No"));
 //BA.debugLineNum = 2257;BA.debugLine="defaults.Put(nc.vModel,\"No\")";
_defaults.Put((Object)(_nc.vmodel /*String*/ ),(Object)("No"));
 //BA.debugLineNum = 2258;BA.debugLine="sw.RemoveAttr(\"ref\")";
_sw._removeattr /*b4j.example.vmcheckbox*/ ("ref");
 //BA.debugLineNum = 2259;BA.debugLine="sw.SetDense(True)";
_sw._setdense /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 2260;BA.debugLine="sw.SetVShow(nc.vmodel & \"show\")";
_sw._setvshow /*b4j.example.vmcheckbox*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2261;BA.debugLine="sw.SetOnChange(Me,\"RaiseChangeEvent\")";
_sw._setonchange /*b4j.example.vmcheckbox*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2262;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2263;BA.debugLine="expanel.Container.AddControlS(sw.CheckBox, sw.";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_sw._checkbox /*b4j.example.vmelement*/ ,_sw._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 2264;BA.debugLine="bText.Add(nc.vmodel)";
_btext.Add((Object)(_nc.vmodel /*String*/ ));
 break; }
case 18: {
 //BA.debugLineNum = 2266;BA.debugLine="Dim btnicon As VMButton";
_btnicon = new b4j.example.vmbutton();
 //BA.debugLineNum = 2267;BA.debugLine="btnicon.Initialize(vue, nc.value, module)";
_btnicon._initialize /*b4j.example.vmbutton*/ (ba,_vue,_nc.value /*String*/ ,_module);
 //BA.debugLineNum = 2268;BA.debugLine="btnicon.SetIconButton(nc.iconName)";
_btnicon._seticonbutton /*b4j.example.vmbutton*/ (_nc.iconName /*String*/ );
 //BA.debugLineNum = 2269;BA.debugLine="If nc.methodName <> \"\" Then btnicon.SetOnClick";
if ((_nc.methodName /*String*/ ).equals("") == false) { 
_btnicon._setonclick /*b4j.example.vmbutton*/ (_nc.methodName /*String*/ );};
 //BA.debugLineNum = 2270;BA.debugLine="btnicon.RemoveAttr(\"ref\")";
_btnicon._removeattr /*b4j.example.vmbutton*/ ("ref");
 //BA.debugLineNum = 2271;BA.debugLine="btnicon.SetVShow(nc.vmodel & \"show\")";
_btnicon._setvshow /*b4j.example.vmbutton*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2272;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2273;BA.debugLine="expanel.Container.AddControlS(btnicon.Button,";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_btnicon._button /*b4j.example.vmelement*/ ,_btnicon._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 19: {
 //BA.debugLineNum = 2275;BA.debugLine="Dim pwd As VMTextField = BuildTextField(nc)";
_pwd = _buildtextfield(_nc);
 //BA.debugLineNum = 2276;BA.debugLine="pwd.SetPassword(True, True)";
_pwd._setpassword /*b4j.example.vmtextfield*/ (__c.True,__c.True);
 //BA.debugLineNum = 2277;BA.debugLine="pwd.SetVShow(nc.vmodel & \"show\")";
_pwd._setvshow /*b4j.example.vmtextfield*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2278;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2279;BA.debugLine="pwd.SetOnChange(Me, \"RaiseChangeEvent\")";
_pwd._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2280;BA.debugLine="expanel.Container.AddControlS(pwd.TextField, p";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_pwd._textfield /*b4j.example.vmelement*/ ,_pwd._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 20: {
 //BA.debugLineNum = 2282;BA.debugLine="Dim text As VMTextField = BuildTextField(nc)";
_text = _buildtextfield(_nc);
 //BA.debugLineNum = 2283;BA.debugLine="text.SetType(\"text\")";
_text._settype /*b4j.example.vmtextfield*/ ("text");
 //BA.debugLineNum = 2284;BA.debugLine="text.SetVShow(nc.vmodel & \"show\")";
_text._setvshow /*b4j.example.vmtextfield*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2285;BA.debugLine="text.SetOnChange(Me, \"RaiseChangeEvent\")";
_text._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2286;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2287;BA.debugLine="expanel.Container.AddControlS(text.TextField,";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_text._textfield /*b4j.example.vmelement*/ ,_text._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 21: {
 //BA.debugLineNum = 2289;BA.debugLine="Dim numx As VMTextField = BuildTextField(nc)";
_numx = _buildtextfield(_nc);
 //BA.debugLineNum = 2290;BA.debugLine="numx.SetType(\"number\")";
_numx._settype /*b4j.example.vmtextfield*/ ("number");
 //BA.debugLineNum = 2291;BA.debugLine="numx.SetVShow(nc.vmodel & \"show\")";
_numx._setvshow /*b4j.example.vmtextfield*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2292;BA.debugLine="numx.SetOnChange(Me, \"RaiseChangeEvent\")";
_numx._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2293;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2294;BA.debugLine="expanel.Container.AddControlS(numx.TextField,";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_numx._textfield /*b4j.example.vmelement*/ ,_numx._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 22: {
 //BA.debugLineNum = 2296;BA.debugLine="Dim tel As VMTextField = BuildTextField(nc)";
_tel = _buildtextfield(_nc);
 //BA.debugLineNum = 2297;BA.debugLine="tel.SetType(\"tel\")";
_tel._settype /*b4j.example.vmtextfield*/ ("tel");
 //BA.debugLineNum = 2298;BA.debugLine="tel.SetVShow(nc.vmodel & \"show\")";
_tel._setvshow /*b4j.example.vmtextfield*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2299;BA.debugLine="tel.SetOnChange(Me, \"RaiseChangeEvent\")";
_tel._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2300;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2301;BA.debugLine="expanel.Container.AddControlS(tel.TextField, t";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_tel._textfield /*b4j.example.vmelement*/ ,_tel._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 23: {
 //BA.debugLineNum = 2303;BA.debugLine="Dim email As VMTextField = BuildTextField(nc)";
_email = _buildtextfield(_nc);
 //BA.debugLineNum = 2304;BA.debugLine="email.SetType(\"email\")";
_email._settype /*b4j.example.vmtextfield*/ ("email");
 //BA.debugLineNum = 2305;BA.debugLine="email.SetVShow(nc.vmodel & \"show\")";
_email._setvshow /*b4j.example.vmtextfield*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2306;BA.debugLine="email.SetOnChange(Me, \"RaiseChangeEvent\")";
_email._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2307;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2308;BA.debugLine="expanel.Container.AddControlS(email.TextField,";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_email._textfield /*b4j.example.vmelement*/ ,_email._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 24: {
 //BA.debugLineNum = 2310;BA.debugLine="Dim txta As VMTextField";
_txta = new b4j.example.vmtextfield();
 //BA.debugLineNum = 2311;BA.debugLine="txta.Initialize(vue, \"ta\" & nc.vmodel, module)";
_txta._initialize /*b4j.example.vmtextfield*/ (ba,_vue,"ta"+_nc.vmodel /*String*/ ,_module);
 //BA.debugLineNum = 2312;BA.debugLine="txta.SetTextArea";
_txta._settextarea /*b4j.example.vmtextfield*/ ();
 //BA.debugLineNum = 2313;BA.debugLine="txta.SetClearable(True)";
_txta._setclearable /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2314;BA.debugLine="txta.Setlabel(nc.text)";
_txta._setlabel /*b4j.example.vmtextfield*/ (_nc.text /*String*/ );
 //BA.debugLineNum = 2315;BA.debugLine="txta.SetAutoGrow(True)";
_txta._setautogrow /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2316;BA.debugLine="txta.SetVModel(nc.vmodel)";
_txta._setvmodel /*b4j.example.vmtextfield*/ (_nc.vmodel /*String*/ );
 //BA.debugLineNum = 2317;BA.debugLine="txta.SetDense(True)";
_txta._setdense /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2318;BA.debugLine="txta.RemoveAttr(\"ref\")";
_txta._removeattr /*b4j.example.vmtextfield*/ ("ref");
 //BA.debugLineNum = 2319;BA.debugLine="txta.SetOutlined(True)";
_txta._setoutlined /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2320;BA.debugLine="txta.SetVShow(nc.vmodel & \"show\")";
_txta._setvshow /*b4j.example.vmtextfield*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2321;BA.debugLine="txta.SetHideDetails(True)";
_txta._sethidedetails /*b4j.example.vmtextfield*/ (__c.True);
 //BA.debugLineNum = 2322;BA.debugLine="txta.AddClass(\"my-1\")";
_txta._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2323;BA.debugLine="txta.SetOnChange(Me, \"RaiseChangeEvent\")";
_txta._setonchange /*b4j.example.vmtextfield*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2324;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2325;BA.debugLine="expanel.Container.AddControlS(txta.TextField,";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_txta._textfield /*b4j.example.vmelement*/ ,_txta._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 break; }
case 25: {
 //BA.debugLineNum = 2327;BA.debugLine="Dim chk As VMCheckBox";
_chk = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 2328;BA.debugLine="chk.Initialize(vue, \"chk\" & nc.vmodel, module)";
_chk._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,"chk"+_nc.vmodel /*String*/ ,_module);
 //BA.debugLineNum = 2329;BA.debugLine="chk.SetStatic(True)";
_chk._setstatic /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 2330;BA.debugLine="chk.SetVModel(nc.vmodel)";
_chk._setvmodel /*b4j.example.vmcheckbox*/ (_nc.vmodel /*String*/ );
 //BA.debugLineNum = 2331;BA.debugLine="chk.SetTrueValue(nc.value)";
_chk._settruevalue /*b4j.example.vmcheckbox*/ (_nc.value /*String*/ );
 //BA.debugLineNum = 2332;BA.debugLine="chk.Setlabel(nc.text)";
_chk._setlabel /*b4j.example.vmcheckbox*/ (_nc.text /*String*/ );
 //BA.debugLineNum = 2333;BA.debugLine="chk.SetHideDetails(True)";
_chk._sethidedetails /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 2334;BA.debugLine="chk.SetFalseValue(\"No\")";
_chk._setfalsevalue /*b4j.example.vmcheckbox*/ ("No");
 //BA.debugLineNum = 2335;BA.debugLine="vue.SetData(nc.vmodel, \"No\")";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ ,(Object)("No"));
 //BA.debugLineNum = 2336;BA.debugLine="defaults.Put(nc.vModel,\"No\")";
_defaults.Put((Object)(_nc.vmodel /*String*/ ),(Object)("No"));
 //BA.debugLineNum = 2337;BA.debugLine="chk.SetDense(True)";
_chk._setdense /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 2338;BA.debugLine="chk.RemoveAttr(\"ref\")";
_chk._removeattr /*b4j.example.vmcheckbox*/ ("ref");
 //BA.debugLineNum = 2339;BA.debugLine="chk.SetVShow(nc.vmodel & \"show\")";
_chk._setvshow /*b4j.example.vmcheckbox*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2340;BA.debugLine="chk.SetOnChange(Me, \"RaiseChangeEvent\")";
_chk._setonchange /*b4j.example.vmcheckbox*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2341;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2342;BA.debugLine="expanel.Container.AddControlS(chk.CheckBox, ch";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_chk._checkbox /*b4j.example.vmelement*/ ,_chk._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 2343;BA.debugLine="bText.Add(nc.vmodel)";
_btext.Add((Object)(_nc.vmodel /*String*/ ));
 break; }
case 26: {
 //BA.debugLineNum = 2345;BA.debugLine="Dim rg As VMRadioGroup";
_rg = new b4j.example.vmradiogroup();
 //BA.debugLineNum = 2346;BA.debugLine="rg.Initialize(vue, \"rd\" & nc.vmodel, module)";
_rg._initialize /*b4j.example.vmradiogroup*/ (ba,_vue,"rd"+_nc.vmodel /*String*/ ,_module);
 //BA.debugLineNum = 2347;BA.debugLine="rg.SetStatic(True)";
_rg._setstatic /*b4j.example.vmradiogroup*/ (__c.True);
 //BA.debugLineNum = 2348;BA.debugLine="rg.SetVModel(nc.vmodel)";
_rg._setvmodel /*b4j.example.vmradiogroup*/ (_nc.vmodel /*String*/ );
 //BA.debugLineNum = 2349;BA.debugLine="rg.Setlabel(nc.text)";
_rg._setlabel /*b4j.example.vmradiogroup*/ (_nc.text /*String*/ );
 //BA.debugLineNum = 2350;BA.debugLine="rg.SetOptions(nc.options)";
_rg._setoptions /*String*/ (_nc.options /*anywheresoftware.b4a.objects.collections.Map*/ );
 //BA.debugLineNum = 2351;BA.debugLine="vue.SetData(nc.vmodel, nc.value)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ ,(Object)(_nc.value /*String*/ ));
 //BA.debugLineNum = 2352;BA.debugLine="rg.SetDense(True)";
_rg._setdense /*b4j.example.vmradiogroup*/ (__c.True);
 //BA.debugLineNum = 2353;BA.debugLine="rg.SetRow(nc.horizontal)";
_rg._setrow /*b4j.example.vmradiogroup*/ (_nc.horizontal /*boolean*/ );
 //BA.debugLineNum = 2354;BA.debugLine="rg.RemoveAttr(\"ref\")";
_rg._removeattr /*b4j.example.vmradiogroup*/ ("ref");
 //BA.debugLineNum = 2355;BA.debugLine="rg.SetVShow(nc.vmodel & \"show\")";
_rg._setvshow /*b4j.example.vmradiogroup*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2356;BA.debugLine="rg.SetOnChange(Me, \"RaiseChangeEvent\")";
_rg._setonchange /*b4j.example.vmradiogroup*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2357;BA.debugLine="rg.SetHideDetails(True)";
_rg._sethidedetails /*b4j.example.vmradiogroup*/ (__c.True);
 //BA.debugLineNum = 2358;BA.debugLine="rg.AddClass(\"my-1\")";
_rg._addclass /*b4j.example.vmradiogroup*/ ("my-1");
 //BA.debugLineNum = 2359;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2360;BA.debugLine="expanel.Container.AddControlS(rg.RadioGroup, r";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_rg._radiogroup /*b4j.example.vmelement*/ ,_rg._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 2361;BA.debugLine="sText.Add(nc.vmodel)";
_stext.Add((Object)(_nc.vmodel /*String*/ ));
 break; }
case 27: {
 //BA.debugLineNum = 2363;BA.debugLine="Dim tp As VMDateTimePicker";
_tp = new b4j.example.vmdatetimepicker();
 //BA.debugLineNum = 2364;BA.debugLine="tp.Initialize(vue, \"tp\" & nc.vmodel, module).S";
_tp._initialize /*b4j.example.vmdatetimepicker*/ (ba,_vue,"tp"+_nc.vmodel /*String*/ ,_module)._settimepicker /*b4j.example.vmdatetimepicker*/ ();
 //BA.debugLineNum = 2365;BA.debugLine="tp.SetStatic(True)";
_tp._setstatic /*b4j.example.vmdatetimepicker*/ (__c.True);
 //BA.debugLineNum = 2366;BA.debugLine="tp.Setlabel(nc.text)";
_tp._setlabel /*b4j.example.vmdatetimepicker*/ (_nc.text /*String*/ );
 //BA.debugLineNum = 2367;BA.debugLine="tp.SetVModel(nc.vmodel)";
_tp._setvmodel /*b4j.example.vmdatetimepicker*/ (_nc.vmodel /*String*/ );
 //BA.debugLineNum = 2368;BA.debugLine="tp.SetForInput";
_tp._setforinput /*b4j.example.vmdatetimepicker*/ ();
 //BA.debugLineNum = 2369;BA.debugLine="vue.SetData(nc.vmodel, nc.value)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ ,(Object)(_nc.value /*String*/ ));
 //BA.debugLineNum = 2370;BA.debugLine="tp.RemoveAttr(\"ref\")";
_tp._removeattr /*b4j.example.vmdatetimepicker*/ ("ref");
 //BA.debugLineNum = 2371;BA.debugLine="tp.SetDense(True)";
_tp._setdense /*b4j.example.vmdatetimepicker*/ (__c.True);
 //BA.debugLineNum = 2372;BA.debugLine="tp.SetOutlined(True)";
_tp._setoutlined /*b4j.example.vmdatetimepicker*/ (__c.True);
 //BA.debugLineNum = 2373;BA.debugLine="tp.SetVShow(nc.vmodel & \"show\")";
_tp._setvshow /*b4j.example.vmdatetimepicker*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2374;BA.debugLine="tp.SetOnChange(Me, \"RaiseChangeEvent\")";
_tp._setonchange /*b4j.example.vmdatetimepicker*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2375;BA.debugLine="tp.SetHideDetails(True)";
_tp._sethidedetails /*b4j.example.vmdatetimepicker*/ (__c.True);
 //BA.debugLineNum = 2376;BA.debugLine="tp.TextField.AddClass(\"my-1\")";
_tp._textfield /*b4j.example.vmtextfield*/ ._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2377;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2378;BA.debugLine="expanel.Container.AddControlS(tp.DateTimePicke";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_tp._datetimepicker /*b4j.example.vmelement*/ ,_tp._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 2379;BA.debugLine="sText.Add(nc.vmodel)";
_stext.Add((Object)(_nc.vmodel /*String*/ ));
 break; }
case 28: {
 //BA.debugLineNum = 2381;BA.debugLine="Dim dp As VMDateTimePicker";
_dp = new b4j.example.vmdatetimepicker();
 //BA.debugLineNum = 2382;BA.debugLine="dp.Initialize(vue, \"dp\" & nc.vmodel, module)";
_dp._initialize /*b4j.example.vmdatetimepicker*/ (ba,_vue,"dp"+_nc.vmodel /*String*/ ,_module);
 //BA.debugLineNum = 2383;BA.debugLine="dp.SetStatic(True)";
_dp._setstatic /*b4j.example.vmdatetimepicker*/ (__c.True);
 //BA.debugLineNum = 2384;BA.debugLine="dp.Setlabel(nc.text)";
_dp._setlabel /*b4j.example.vmdatetimepicker*/ (_nc.text /*String*/ );
 //BA.debugLineNum = 2385;BA.debugLine="dp.SetVModel(nc.vmodel)";
_dp._setvmodel /*b4j.example.vmdatetimepicker*/ (_nc.vmodel /*String*/ );
 //BA.debugLineNum = 2386;BA.debugLine="dp.SetForInput";
_dp._setforinput /*b4j.example.vmdatetimepicker*/ ();
 //BA.debugLineNum = 2387;BA.debugLine="vue.SetData(nc.vmodel, nc.value)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ ,(Object)(_nc.value /*String*/ ));
 //BA.debugLineNum = 2388;BA.debugLine="dp.RemoveAttr(\"ref\")";
_dp._removeattr /*b4j.example.vmdatetimepicker*/ ("ref");
 //BA.debugLineNum = 2389;BA.debugLine="dp.SetDense(True)";
_dp._setdense /*b4j.example.vmdatetimepicker*/ (__c.True);
 //BA.debugLineNum = 2390;BA.debugLine="dp.SetOutlined(True)";
_dp._setoutlined /*b4j.example.vmdatetimepicker*/ (__c.True);
 //BA.debugLineNum = 2391;BA.debugLine="dp.SetVShow(nc.vmodel & \"show\")";
_dp._setvshow /*b4j.example.vmdatetimepicker*/ (_nc.vmodel /*String*/ +"show");
 //BA.debugLineNum = 2392;BA.debugLine="dp.SetOnChange(Me, \"RaiseChangeEvent\")";
_dp._setonchange /*b4j.example.vmdatetimepicker*/ (this,"RaiseChangeEvent");
 //BA.debugLineNum = 2393;BA.debugLine="dp.SetHideDetails(True)";
_dp._sethidedetails /*b4j.example.vmdatetimepicker*/ (__c.True);
 //BA.debugLineNum = 2394;BA.debugLine="dp.TextField.AddClass(\"my-1\")";
_dp._textfield /*b4j.example.vmtextfield*/ ._addclass /*b4j.example.vmtextfield*/ ("my-1");
 //BA.debugLineNum = 2395;BA.debugLine="vue.SetData(nc.vmodel & \"show\", True)";
_vue._setdata /*b4j.example.bananovue*/ (_nc.vmodel /*String*/ +"show",(Object)(__c.True));
 //BA.debugLineNum = 2396;BA.debugLine="expanel.Container.AddControlS(dp.DateTimePicke";
_expanel._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (_dp._datetimepicker /*b4j.example.vmelement*/ ,_dp._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 2397;BA.debugLine="sText.Add(nc.vmodel)";
_stext.Add((Object)(_nc.vmodel /*String*/ ));
 break; }
}
;
 }
};
 //BA.debugLineNum = 2400;BA.debugLine="expnl.addpanel(expanel)";
_expnl._addpanel /*b4j.example.vmexpansionpanels*/ (_expanel);
 }
};
 //BA.debugLineNum = 2402;BA.debugLine="Return expnl.tostring";
if (true) return _expnl._tostring /*String*/ ();
 //BA.debugLineNum = 2403;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "BTNADDMULTIPLE_CLICK"))
	return _btnaddmultiple_click((com.ab.banano.BANanoEvent) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
