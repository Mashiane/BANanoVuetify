package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmstepper extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmstepper", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmstepper.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _stepper = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public b4j.example.vmstepperheader _header = null;
public b4j.example.vmstepperitems _items = null;
public anywheresoftware.b4a.objects.collections.Map _steps = null;
public int _stepcount = 0;
public anywheresoftware.b4a.objects.collections.Map _content = null;
public boolean _bvertical = false;
public boolean _bstatic = false;
public String _vmodel = "";
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
public b4j.example.vmstepper  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 263;BA.debugLine="Sub AddChild(child As VMElement) As VMStepper";
 //BA.debugLineNum = 264;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 265;BA.debugLine="Stepper.SetText(childHTML)";
_stepper._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 299;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 300;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 301;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepper  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub AddClass(c As String) As VMStepper";
 //BA.debugLineNum = 282;BA.debugLine="Stepper.AddClass(c)";
_stepper._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _addstep(String _stepid,String _steplabel,String _stepdescription,boolean _stepeditable,String _stepcontent) throws Exception{
b4j.example.vmstepperstep _stepitem = null;
b4j.example.vmsteppercontent _stpcontent = null;
 //BA.debugLineNum = 101;BA.debugLine="Sub AddStep(stepID As String, stepLabel As String,";
 //BA.debugLineNum = 102;BA.debugLine="stepCount = stepCount + 1";
_stepcount = (int) (_stepcount+1);
 //BA.debugLineNum = 103;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 105;BA.debugLine="Dim stepitem As VMStepperStep";
_stepitem = new b4j.example.vmstepperstep();
 //BA.debugLineNum = 106;BA.debugLine="stepitem.Initialize(vue, stepID, Module).SetStati";
_stepitem._initialize /*b4j.example.vmstepperstep*/ (ba,_vue,_stepid,_module)._setstatic /*b4j.example.vmstepperstep*/ (__c.True)._setdesignmode /*b4j.example.vmstepperstep*/ (_designmode);
 //BA.debugLineNum = 107;BA.debugLine="stepitem.SetComplete(False)";
_stepitem._setcomplete /*b4j.example.vmstepperstep*/ (__c.False);
 //BA.debugLineNum = 108;BA.debugLine="stepitem.SetEditable(stepEditable)";
_stepitem._seteditable /*b4j.example.vmstepperstep*/ (_stepeditable);
 //BA.debugLineNum = 109;BA.debugLine="stepitem.SetStep(vue.CStr(stepCount))";
_stepitem._setstep /*b4j.example.vmstepperstep*/ (_vue._cstr /*String*/ ((Object)(_stepcount)));
 //BA.debugLineNum = 110;BA.debugLine="stepitem.Content = stepContent";
_stepitem._content /*String*/  = _stepcontent;
 //BA.debugLineNum = 111;BA.debugLine="stepitem.Setlabel(stepLabel, stepDescription)";
_stepitem._setlabel /*b4j.example.vmstepperstep*/ (_steplabel,_stepdescription);
 //BA.debugLineNum = 112;BA.debugLine="steps.put(stepID, stepitem)";
_steps.Put((Object)(_stepid),(Object)(_stepitem));
 //BA.debugLineNum = 114;BA.debugLine="Dim stpContent As VMStepperContent";
_stpcontent = new b4j.example.vmsteppercontent();
 //BA.debugLineNum = 115;BA.debugLine="stpContent.initialize(vue, $\"${stepID}content\"$,";
_stpcontent._initialize /*b4j.example.vmsteppercontent*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_stepid))+"content"),_module)._setstatic /*b4j.example.vmsteppercontent*/ (__c.True)._setdesignmode /*b4j.example.vmsteppercontent*/ (_designmode);
 //BA.debugLineNum = 116;BA.debugLine="stpContent.SetStep(vue.CStr(stepCount))";
_stpcontent._setstep /*b4j.example.vmsteppercontent*/ (_vue._cstr /*String*/ ((Object)(_stepcount)));
 //BA.debugLineNum = 117;BA.debugLine="If stepContent <> Null Then";
if (_stepcontent!= null) { 
 //BA.debugLineNum = 118;BA.debugLine="stpContent.AddComponent(stepContent)";
_stpcontent._addcomponent /*b4j.example.vmsteppercontent*/ (_stepcontent);
 };
 //BA.debugLineNum = 120;BA.debugLine="content.Put(stepID, stpContent)";
_content.Put((Object)(_stepid),(Object)(_stpcontent));
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public String  _addstep1(String _stepid,String _steplabel,String _stepdescription,String _stepcontent) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub AddStep1(stepID As String, stepLabel As String";
 //BA.debugLineNum = 97;BA.debugLine="AddStep(stepID, stepLabel, stepDescription, True,";
_addstep(_stepid,_steplabel,_stepdescription,__c.True,_stepcontent);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 465;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 466;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepper  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 414;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 415;BA.debugLine="Stepper.Bind(prop, stateprop)";
_stepper._bind /*b4j.example.vmelement*/ (_prop,_stateprop);
 //BA.debugLineNum = 416;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 417;BA.debugLine="End Sub";
return null;
}
public String  _build() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _stot = 0;
int _ctot = 0;
String _k = "";
b4j.example.vmstepperstep _sstep = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbc = null;
b4j.example.vmsteppercontent _vstep = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb1 = null;
 //BA.debugLineNum = 136;BA.debugLine="Private Sub Build";
 //BA.debugLineNum = 137;BA.debugLine="If bVertical = False Then";
if (_bvertical==__c.False) { 
 //BA.debugLineNum = 138;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 139;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 140;BA.debugLine="Dim sTot As Int = steps.Size";
_stot = _steps.getSize();
 //BA.debugLineNum = 141;BA.debugLine="Dim cTot As Int = 0";
_ctot = (int) (0);
 //BA.debugLineNum = 142;BA.debugLine="For Each k As String In steps.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _steps.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_k = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 143;BA.debugLine="Dim sstep As VMStepperStep = steps.Get(k)";
_sstep = (b4j.example.vmstepperstep)(_steps.Get((Object)(_k)));
 //BA.debugLineNum = 144;BA.debugLine="sb.Append(sstep.ToString)";
_sb.Append(_sstep._tostring /*String*/ ());
 //BA.debugLineNum = 145;BA.debugLine="cTot = cTot + 1";
_ctot = (int) (_ctot+1);
 //BA.debugLineNum = 146;BA.debugLine="If cTot < sTot Then";
if (_ctot<_stot) { 
 //BA.debugLineNum = 147;BA.debugLine="sb.Append($\"<v-divider></v-divider>\"$)";
_sb.Append(("<v-divider></v-divider>"));
 };
 }
};
 //BA.debugLineNum = 150;BA.debugLine="Header.AddComponent(sb.ToString)";
_header._addcomponent /*b4j.example.vmstepperheader*/ (_sb.ToString());
 //BA.debugLineNum = 152;BA.debugLine="Dim sbc As StringBuilder";
_sbc = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 153;BA.debugLine="sbc.Initialize";
_sbc.Initialize();
 //BA.debugLineNum = 154;BA.debugLine="For Each k As String In content.Keys";
{
final anywheresoftware.b4a.BA.IterableList group17 = _content.Keys();
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_k = BA.ObjectToString(group17.Get(index17));
 //BA.debugLineNum = 155;BA.debugLine="Dim vstep As VMStepperContent = content.Get(k)";
_vstep = (b4j.example.vmsteppercontent)(_content.Get((Object)(_k)));
 //BA.debugLineNum = 156;BA.debugLine="sbc.Append(vstep.ToString)";
_sbc.Append(_vstep._tostring /*String*/ ());
 }
};
 //BA.debugLineNum = 158;BA.debugLine="Items.AddComponent(sbc.ToString)";
_items._addcomponent /*b4j.example.vmstepperitems*/ (_sbc.ToString());
 }else {
 //BA.debugLineNum = 160;BA.debugLine="Dim sb1 As StringBuilder";
_sb1 = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 161;BA.debugLine="sb1.Initialize";
_sb1.Initialize();
 //BA.debugLineNum = 162;BA.debugLine="For Each k As String In steps.Keys";
{
final anywheresoftware.b4a.BA.IterableList group25 = _steps.Keys();
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_k = BA.ObjectToString(group25.Get(index25));
 //BA.debugLineNum = 163;BA.debugLine="Dim sstep As VMStepperStep = steps.Get(k)";
_sstep = (b4j.example.vmstepperstep)(_steps.Get((Object)(_k)));
 //BA.debugLineNum = 164;BA.debugLine="Dim vstep As VMStepperContent = content.Get(k)";
_vstep = (b4j.example.vmsteppercontent)(_content.Get((Object)(_k)));
 //BA.debugLineNum = 166;BA.debugLine="sb1.Append(sstep.ToString)";
_sb1.Append(_sstep._tostring /*String*/ ());
 //BA.debugLineNum = 167;BA.debugLine="sb1.Append(vstep.ToString)";
_sb1.Append(_vstep._tostring /*String*/ ());
 }
};
 //BA.debugLineNum = 169;BA.debugLine="SetText(sb1.ToString)";
_settext((Object)(_sb1.ToString()));
 };
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepper  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 469;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 470;BA.debugLine="Stepper.BuildModel(mprops, mstyles, lclasses, loos";
_stepper._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 471;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 472;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Stepper As VMElement";
_stepper = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private Header As VMStepperHeader";
_header = new b4j.example.vmstepperheader();
 //BA.debugLineNum = 10;BA.debugLine="Private Items As VMStepperItems";
_items = new b4j.example.vmstepperitems();
 //BA.debugLineNum = 11;BA.debugLine="Private steps As Map";
_steps = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 12;BA.debugLine="Private stepCount As Int";
_stepcount = 0;
 //BA.debugLineNum = 13;BA.debugLine="Private content As Map";
_content = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 14;BA.debugLine="Private bVertical As Boolean";
_bvertical = false;
 //BA.debugLineNum = 15;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 16;BA.debugLine="Private vmodel As String";
_vmodel = "";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepper  _disable() throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Sub Disable As VMStepper";
 //BA.debugLineNum = 408;BA.debugLine="Stepper.Disable(True)";
_stepper._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _enable() throws Exception{
 //BA.debugLineNum = 402;BA.debugLine="Sub Enable As VMStepper";
 //BA.debugLineNum = 403;BA.debugLine="Stepper.Enable(True)";
_stepper._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 404;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _hide() throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Sub Hide As VMStepper";
 //BA.debugLineNum = 393;BA.debugLine="Stepper.Hide";
_stepper._hide /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 394;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 21;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 22;BA.debugLine="Stepper.Initialize(v, ID).SetTag(\"v-stepper\")";
_stepper._initialize /*b4j.example.vmelement*/ (ba,_v,_id)._settag /*b4j.example.vmelement*/ ("v-stepper");
 //BA.debugLineNum = 23;BA.debugLine="SetVModel($\"${ID}value\"$)";
_setvmodel((""+__c.SmartStringFormatter("",(Object)(_id))+"value"));
 //BA.debugLineNum = 24;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 26;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 27;BA.debugLine="vue.SetData(ID, ID)";
_vue._setdata /*b4j.example.bananovue*/ (_id,(Object)(_id));
 //BA.debugLineNum = 28;BA.debugLine="Header.Initialize(vue, $\"${ID}hdr\"$, Module)";
_header._initialize /*b4j.example.vmstepperheader*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"hdr"),_module);
 //BA.debugLineNum = 29;BA.debugLine="Items.Initialize(vue, $\"${ID}items\"$, Module)";
_items._initialize /*b4j.example.vmstepperitems*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"items"),_module);
 //BA.debugLineNum = 30;BA.debugLine="stepCount = 0";
_stepcount = (int) (0);
 //BA.debugLineNum = 31;BA.debugLine="content.Initialize";
_content.Initialize();
 //BA.debugLineNum = 32;BA.debugLine="bVertical = False";
_bvertical = __c.False;
 //BA.debugLineNum = 33;BA.debugLine="steps.Initialize";
_steps.Initialize();
 //BA.debugLineNum = 34;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 35;BA.debugLine="SetStep(1)";
_setstep((int) (1));
 //BA.debugLineNum = 36;BA.debugLine="SetOnChange(Module, $\"${ID}_change\"$)";
_setonchange(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_change"));
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 277;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepper  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 420;BA.debugLine="public Sub RemoveAttr(sName As String) As VMSteppe";
 //BA.debugLineNum = 421;BA.debugLine="Stepper.RemoveAttr(sName)";
_stepper._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 422;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _removevmodel() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub RemoveVModel As VMStepper";
 //BA.debugLineNum = 67;BA.debugLine="RemoveAttr(\"v-model\")";
_removeattr("v-model");
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub Render";
 //BA.debugLineNum = 259;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepper  _setaltlabels(boolean _varaltlabels) throws Exception{
String _pp = "";
 //BA.debugLineNum = 306;BA.debugLine="Sub SetAltLabels(varAltLabels As Boolean) As VMSte";
 //BA.debugLineNum = 307;BA.debugLine="If varAltLabels = False Then Return Me";
if (_varaltlabels==__c.False) { 
if (true) return (b4j.example.vmstepper)(this);};
 //BA.debugLineNum = 308;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 309;BA.debugLine="SetAttrSingle(\"alt-labels\", varAltLabels)";
_setattrsingle("alt-labels",BA.ObjectToString(_varaltlabels));
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 };
 //BA.debugLineNum = 312;BA.debugLine="Dim pp As String = $\"${ID}AltLabels\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AltLabels");
 //BA.debugLineNum = 313;BA.debugLine="vue.SetStateSingle(pp, varAltLabels)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varaltlabels));
 //BA.debugLineNum = 314;BA.debugLine="Stepper.Bind(\":alt-labels\", pp)";
_stepper._bind /*b4j.example.vmelement*/ (":alt-labels",_pp);
 //BA.debugLineNum = 315;BA.debugLine="bVertical = False";
_bvertical = __c.False;
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetAttr(attr As Map) As VMStepper";
 //BA.debugLineNum = 288;BA.debugLine="Stepper.SetAttr(attr)";
_stepper._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 129;BA.debugLine="Sub SetAttributes(attrs As List) As VMStepper";
 //BA.debugLineNum = 130;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 131;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetAttrLoose(loose As String) As VMStepper";
 //BA.debugLineNum = 125;BA.debugLine="Stepper.SetAttrLoose(loose)";
_stepper._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 459;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 460;BA.debugLine="Stepper.SetAttrSingle(prop, value)";
_stepper._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 461;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 320;BA.debugLine="Sub SetDark(varDark As Boolean) As VMStepper";
 //BA.debugLineNum = 321;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmstepper)(this);};
 //BA.debugLineNum = 322;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 323;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 };
 //BA.debugLineNum = 326;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 327;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 328;BA.debugLine="Stepper.Bind(\":dark\", pp)";
_stepper._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 53;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 436;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMStepper";
 //BA.debugLineNum = 437;BA.debugLine="Stepper.SetDesignMode(b)";
_stepper._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 438;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 439;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 440;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 79;BA.debugLine="Stepper.SetDeviceOffsets(OS, OM, OL, OX)";
_stepper._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 91;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 92;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 85;BA.debugLine="Stepper.SetDeviceSizes(SS, SM, SL, SX)";
_stepper._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 333;BA.debugLine="Sub SetLight(varLight As Boolean) As VMStepper";
 //BA.debugLineNum = 334;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmstepper)(this);};
 //BA.debugLineNum = 335;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 336;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 };
 //BA.debugLineNum = 339;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 340;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 341;BA.debugLine="Stepper.Bind(\":light\", pp)";
_stepper._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 431;BA.debugLine="Sub SetMarginAll(p As String) As VMStepper";
 //BA.debugLineNum = 432;BA.debugLine="Stepper.setmarginall(p)";
_stepper._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 433;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 448;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 449;BA.debugLine="Stepper.SetName(varName, bbind)";
_stepper._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 450;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setnonlinear(boolean _varnonlinear) throws Exception{
String _pp = "";
 //BA.debugLineNum = 346;BA.debugLine="Sub SetNonLinear(varNonLinear As Boolean) As VMSte";
 //BA.debugLineNum = 347;BA.debugLine="If varNonLinear = False Then Return Me";
if (_varnonlinear==__c.False) { 
if (true) return (b4j.example.vmstepper)(this);};
 //BA.debugLineNum = 348;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 349;BA.debugLine="SetAttrSingle(\"non-linear\", varNonLinear)";
_setattrsingle("non-linear",BA.ObjectToString(_varnonlinear));
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 };
 //BA.debugLineNum = 352;BA.debugLine="Dim pp As String = $\"${ID}NonLinear\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NonLinear");
 //BA.debugLineNum = 353;BA.debugLine="vue.SetStateSingle(pp, varNonLinear)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnonlinear));
 //BA.debugLineNum = 354;BA.debugLine="Stepper.Bind(\":non-linear\", pp)";
_stepper._bind /*b4j.example.vmelement*/ (":non-linear",_pp);
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setonchange(Object _eventhandler,String _methodname) throws Exception{
int _num = 0;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 380;BA.debugLine="Sub SetOnChange(eventHandler As Object, methodName";
 //BA.debugLineNum = 381;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 382;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmstepper)(this);};
 //BA.debugLineNum = 383;BA.debugLine="Dim num As Int  'ignore";
_num = 0;
 //BA.debugLineNum = 384;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_num)}))));
 //BA.debugLineNum = 385;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 387;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 426;BA.debugLine="Sub SetPaddingAll(p As String) As VMStepper";
 //BA.debugLineNum = 427;BA.debugLine="Stepper.SetPaddingAll(p)";
_stepper._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 428;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 429;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMSte";
 //BA.debugLineNum = 73;BA.debugLine="Stepper.SetRC(sRow, sCol)";
_stepper._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetStatic(b As Boolean) As VMStepper";
 //BA.debugLineNum = 58;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 59;BA.debugLine="Stepper.SetStatic(b)";
_stepper._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 60;BA.debugLine="Header.SetStatic(b)";
_header._setstatic /*b4j.example.vmstepperheader*/ (_b);
 //BA.debugLineNum = 61;BA.debugLine="Items.setstatic(b)";
_items._setstatic /*b4j.example.vmstepperitems*/ (_b);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setstep(int _istep) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetStep(iStep As Int) As VMStepper";
 //BA.debugLineNum = 42;BA.debugLine="vue.SetData(vmodel, iStep)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(_istep));
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setstepactive(String _varactivestep) throws Exception{
String _stepa = "";
 //BA.debugLineNum = 216;BA.debugLine="Sub SetStepActive(varActiveStep As String) As VMSt";
 //BA.debugLineNum = 217;BA.debugLine="If varActiveStep = \"\" Then Return Me";
if ((_varactivestep).equals("")) { 
if (true) return (b4j.example.vmstepper)(this);};
 //BA.debugLineNum = 218;BA.debugLine="varActiveStep = varActiveStep.tolowercase";
_varactivestep = _varactivestep.toLowerCase();
 //BA.debugLineNum = 219;BA.debugLine="vue.SetStateSingle(ID, varActiveStep)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_id,(Object)(_varactivestep));
 //BA.debugLineNum = 220;BA.debugLine="For Each stepa As String In steps.keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _steps.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_stepa = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 221;BA.debugLine="If stepa = varActiveStep Then";
if ((_stepa).equals(_varactivestep)) { 
 }else {
 //BA.debugLineNum = 223;BA.debugLine="SetStepComplete(stepa, False)";
_setstepcomplete(_stepa,__c.False);
 };
 }
};
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setstepcomplete(String _stepdone,boolean _b) throws Exception{
String _dd = "";
 //BA.debugLineNum = 207;BA.debugLine="Sub SetStepComplete(stepDone As String, b As Boole";
 //BA.debugLineNum = 208;BA.debugLine="If stepDone = \"\" Then Return Me";
if ((_stepdone).equals("")) { 
if (true) return (b4j.example.vmstepper)(this);};
 //BA.debugLineNum = 209;BA.debugLine="stepDone = stepDone.tolowercase";
_stepdone = _stepdone.toLowerCase();
 //BA.debugLineNum = 210;BA.debugLine="Dim dd As String = $\"${stepDone}Complete\"$";
_dd = (""+__c.SmartStringFormatter("",(Object)(_stepdone))+"Complete");
 //BA.debugLineNum = 211;BA.debugLine="vue.SetStateSingle(dd, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_dd,(Object)(_b));
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setstepdescription(String _stepid,String _stepeditable) throws Exception{
String _stepshow = "";
 //BA.debugLineNum = 182;BA.debugLine="Sub SetStepDescription(stepID As String, stepEdita";
 //BA.debugLineNum = 183;BA.debugLine="If stepID = \"\" Then Return Me";
if ((_stepid).equals("")) { 
if (true) return (b4j.example.vmstepper)(this);};
 //BA.debugLineNum = 184;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 185;BA.debugLine="Dim stepShow As String = $\"${stepID}description\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"description");
 //BA.debugLineNum = 186;BA.debugLine="vue.SetStateSingle(stepShow, stepEditable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_stepshow,(Object)(_stepeditable));
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setstepeditable(String _stepid,boolean _stepeditable) throws Exception{
String _stepshow = "";
 //BA.debugLineNum = 174;BA.debugLine="Sub SetStepEditable(stepID As String, stepEditable";
 //BA.debugLineNum = 175;BA.debugLine="If stepID = \"\" Then Return Me";
if ((_stepid).equals("")) { 
if (true) return (b4j.example.vmstepper)(this);};
 //BA.debugLineNum = 176;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 177;BA.debugLine="Dim stepShow As String = $\"${stepID}editable\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"editable");
 //BA.debugLineNum = 178;BA.debugLine="vue.SetStateSingle(stepShow, stepEditable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_stepshow,(Object)(_stepeditable));
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setsteperror(String _stepid,String _steperror) throws Exception{
String _dd = "";
 //BA.debugLineNum = 199;BA.debugLine="Sub SetStepError(stepID As String, stepError As St";
 //BA.debugLineNum = 200;BA.debugLine="If stepID = \"\" Then Return Me";
if ((_stepid).equals("")) { 
if (true) return (b4j.example.vmstepper)(this);};
 //BA.debugLineNum = 201;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 202;BA.debugLine="Dim dd As String = $\"${stepID}error\"$";
_dd = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"error");
 //BA.debugLineNum = 203;BA.debugLine="vue.SetStateSingle(dd, stepError)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_dd,(Object)(_steperror));
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setsteplabel(String _stepid,String _steplabel) throws Exception{
String _stepshow = "";
 //BA.debugLineNum = 190;BA.debugLine="Sub SetStepLabel(stepID As String, stepLabel As St";
 //BA.debugLineNum = 191;BA.debugLine="If stepID = \"\" Then Return Me";
if ((_stepid).equals("")) { 
if (true) return (b4j.example.vmstepper)(this);};
 //BA.debugLineNum = 192;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 193;BA.debugLine="Dim stepShow As String = $\"${stepID}label\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"label");
 //BA.debugLineNum = 194;BA.debugLine="vue.SetStateSingle(stepShow, stepLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_stepshow,(Object)(_steplabel));
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Sub SetStyle(sm As Map) As VMStepper";
 //BA.debugLineNum = 294;BA.debugLine="Stepper.SetStyle(sm)";
_stepper._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 454;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 455;BA.debugLine="Stepper.SetStyleSingle(prop, value)";
_stepper._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 456;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 442;BA.debugLine="Sub SetTabIndex(ti As String) As VMStepper";
 //BA.debugLineNum = 443;BA.debugLine="Stepper.SetTabIndex(ti)";
_stepper._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 444;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetText(t As Object) As VMStepper";
 //BA.debugLineNum = 271;BA.debugLine="Stepper.SetText(t)";
_stepper._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 359;BA.debugLine="Sub SetValue(varValue As String) As VMStepper";
 //BA.debugLineNum = 360;BA.debugLine="If varValue = \"\" Then Return Me";
if ((_varvalue).equals("")) { 
if (true) return (b4j.example.vmstepper)(this);};
 //BA.debugLineNum = 361;BA.debugLine="Stepper.SetValue(varValue, False)";
_stepper._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setvertical(boolean _varvertical) throws Exception{
String _pp = "";
 //BA.debugLineNum = 366;BA.debugLine="Sub SetVertical(varVertical As Boolean) As VMStepp";
 //BA.debugLineNum = 367;BA.debugLine="If varVertical = False Then Return Me";
if (_varvertical==__c.False) { 
if (true) return (b4j.example.vmstepper)(this);};
 //BA.debugLineNum = 368;BA.debugLine="bVertical = True";
_bvertical = __c.True;
 //BA.debugLineNum = 369;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 370;BA.debugLine="SetAttrSingle(\"vertical\", varVertical)";
_setattrsingle("vertical",BA.ObjectToString(_varvertical));
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 };
 //BA.debugLineNum = 373;BA.debugLine="Dim pp As String = $\"${ID}Vertical\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Vertical");
 //BA.debugLineNum = 374;BA.debugLine="vue.SetStateSingle(pp, varVertical)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvertical));
 //BA.debugLineNum = 375;BA.debugLine="Stepper.Bind(\":vertical\", pp)";
_stepper._bind /*b4j.example.vmelement*/ (":vertical",_pp);
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetVIf(vif As String) As VMStepper";
 //BA.debugLineNum = 248;BA.debugLine="Stepper.SetVIf(vif)";
_stepper._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 474;BA.debugLine="Sub SetVisible(b As Boolean) As VMStepper";
 //BA.debugLineNum = 475;BA.debugLine="Stepper.SetVisible(b)";
_stepper._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 476;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 477;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setvmodel(String _smodel) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetVModel(smodel As String) As VMStepper";
 //BA.debugLineNum = 47;BA.debugLine="vmodel = smodel";
_vmodel = _smodel;
 //BA.debugLineNum = 48;BA.debugLine="Stepper.SetVModel(vmodel)";
_stepper._setvmodel /*b4j.example.vmelement*/ (_vmodel);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetVShow(vif As String) As VMStepper";
 //BA.debugLineNum = 253;BA.debugLine="Stepper.SetVShow(vif)";
_stepper._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepper  _show() throws Exception{
 //BA.debugLineNum = 397;BA.debugLine="Sub Show As VMStepper";
 //BA.debugLineNum = 398;BA.debugLine="Stepper.Show";
_stepper._show /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 399;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepper)(this);
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 231;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 232;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 233;BA.debugLine="Dim eName As String = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 234;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 235;BA.debugLine="Log($\"VMStepper.${eName} event has not been defi";
__c.Log(("VMStepper."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 238;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 240;BA.debugLine="If bVertical = False Then";
if (_bvertical==__c.False) { 
 //BA.debugLineNum = 241;BA.debugLine="Header.Pop(Stepper)";
_header._pop /*String*/ (_stepper);
 //BA.debugLineNum = 242;BA.debugLine="Items.Pop(Stepper)";
_items._pop /*String*/ (_stepper);
 };
 //BA.debugLineNum = 244;BA.debugLine="Return Stepper.ToString";
if (true) return _stepper._tostring /*String*/ ();
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
