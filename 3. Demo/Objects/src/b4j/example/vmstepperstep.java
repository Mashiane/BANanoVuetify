package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmstepperstep extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmstepperstep", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmstepperstep.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _stepperstep = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public String _content = "";
public String _description = "";
public boolean _bstatic = false;
public String _xmodel = "";
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
public b4j.example.vmstepperstep  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 95;BA.debugLine="Sub AddChild(child As VMElement) As VMStepperStep";
 //BA.debugLineNum = 96;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 97;BA.debugLine="StepperStep.SetText(childHTML)";
_stepperstep._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 131;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 132;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 133;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepperstep  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub AddClass(c As String) As VMStepperStep";
 //BA.debugLineNum = 114;BA.debugLine="StepperStep.AddClass(c)";
_stepperstep._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 268;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 269;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 319;BA.debugLine="StepperStep.BuildModel(mprops, mstyles, lclasses,";
_stepperstep._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public StepperStep As VMElement";
_stepperstep = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Public Content As String";
_content = "";
 //BA.debugLineNum = 10;BA.debugLine="Public Description As String";
_description = "";
 //BA.debugLineNum = 11;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 12;BA.debugLine="Private xmodel As String";
_xmodel = "";
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepperstep  _disable() throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub Disable As VMStepperStep";
 //BA.debugLineNum = 261;BA.debugLine="StepperStep.Disable(True)";
_stepperstep._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _enable() throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub Enable As VMStepperStep";
 //BA.debugLineNum = 256;BA.debugLine="StepperStep.Enable(True)";
_stepperstep._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _hide() throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub Hide As VMStepperStep";
 //BA.debugLineNum = 246;BA.debugLine="StepperStep.SetVisible(False)";
_stepperstep._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 17;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 18;BA.debugLine="StepperStep.Initialize(v, ID)";
_stepperstep._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 19;BA.debugLine="StepperStep.SetTag(\"v-stepper-step\")";
_stepperstep._settag /*b4j.example.vmelement*/ ("v-stepper-step");
 //BA.debugLineNum = 20;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 22;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 23;BA.debugLine="Content = \"\"";
_content = "";
 //BA.debugLineNum = 24;BA.debugLine="Description = \"\"";
_description = "";
 //BA.debugLineNum = 25;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 26;BA.debugLine="xmodel = \"\"";
_xmodel = "";
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 109;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepperstep  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="public Sub RemoveAttr(sName As String) As VMSteppe";
 //BA.debugLineNum = 275;BA.debugLine="StepperStep.RemoveAttr(sName)";
_stepperstep._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub Render";
 //BA.debugLineNum = 91;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepperstep  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetAttr(attr As Map) As VMStepperStep";
 //BA.debugLineNum = 120;BA.debugLine="StepperStep.SetAttr(attr)";
_stepperstep._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 61;BA.debugLine="Sub SetAttributes(attrs As List) As VMStepperStep";
 //BA.debugLineNum = 62;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 63;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetAttrLoose(loose As String) As VMStepperStep";
 //BA.debugLineNum = 57;BA.debugLine="StepperStep.SetAttrLoose(loose)";
_stepperstep._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 314;BA.debugLine="StepperStep.SetAttrSingle(prop, value)";
_stepperstep._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 315;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 138;BA.debugLine="Sub SetColor(varColor As String) As VMStepperStep";
 //BA.debugLineNum = 139;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmstepperstep)(this);};
 //BA.debugLineNum = 140;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 141;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 };
 //BA.debugLineNum = 144;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 145;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 146;BA.debugLine="StepperStep.Bind(\":color\", pp)";
_stepperstep._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setcomplete(boolean _varcomplete) throws Exception{
String _pp = "";
 //BA.debugLineNum = 151;BA.debugLine="Sub SetComplete(varComplete As Boolean) As VMStepp";
 //BA.debugLineNum = 152;BA.debugLine="If varComplete = False Then Return Me";
if (_varcomplete==__c.False) { 
if (true) return (b4j.example.vmstepperstep)(this);};
 //BA.debugLineNum = 153;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 154;BA.debugLine="SetAttrSingle(\"complete\", varComplete)";
_setattrsingle("complete",BA.ObjectToString(_varcomplete));
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 };
 //BA.debugLineNum = 157;BA.debugLine="Dim pp As String = $\"${ID}Complete\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Complete");
 //BA.debugLineNum = 158;BA.debugLine="vue.SetStateSingle(pp, varComplete)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcomplete));
 //BA.debugLineNum = 159;BA.debugLine="StepperStep.Bind(\":complete\", pp)";
_stepperstep._bind /*b4j.example.vmelement*/ (":complete",_pp);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setcompleteicon(String _varcompleteicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 164;BA.debugLine="Sub SetCompleteIcon(varCompleteIcon As String) As";
 //BA.debugLineNum = 165;BA.debugLine="If varCompleteIcon = \"\" Then Return Me";
if ((_varcompleteicon).equals("")) { 
if (true) return (b4j.example.vmstepperstep)(this);};
 //BA.debugLineNum = 166;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 167;BA.debugLine="SetAttrSingle(\"complete-icon\", varCompleteIcon)";
_setattrsingle("complete-icon",_varcompleteicon);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 };
 //BA.debugLineNum = 170;BA.debugLine="Dim pp As String = $\"${ID}CompleteIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CompleteIcon");
 //BA.debugLineNum = 171;BA.debugLine="vue.SetStateSingle(pp, varCompleteIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcompleteicon));
 //BA.debugLineNum = 172;BA.debugLine="StepperStep.Bind(\":complete-icon\", pp)";
_stepperstep._bind /*b4j.example.vmelement*/ (":complete-icon",_pp);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 31;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMStepperStep";
 //BA.debugLineNum = 291;BA.debugLine="StepperStep.SetDesignMode(b)";
_stepperstep._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 292;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _seteditable(boolean _vareditable) throws Exception{
String _pp = "";
 //BA.debugLineNum = 190;BA.debugLine="Sub SetEditable(varEditable As Boolean) As VMStepp";
 //BA.debugLineNum = 191;BA.debugLine="If varEditable = False Then Return Me";
if (_vareditable==__c.False) { 
if (true) return (b4j.example.vmstepperstep)(this);};
 //BA.debugLineNum = 192;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 193;BA.debugLine="SetAttrSingle(\"editable\", \"varEditable\")";
_setattrsingle("editable","varEditable");
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 };
 //BA.debugLineNum = 196;BA.debugLine="Dim pp As String = $\"${ID}Editable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Editable");
 //BA.debugLineNum = 197;BA.debugLine="vue.SetStateSingle(pp, varEditable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareditable));
 //BA.debugLineNum = 198;BA.debugLine="StepperStep.Bind(\":editable\", pp)";
_stepperstep._bind /*b4j.example.vmelement*/ (":editable",_pp);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setediticon(String _varediticon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 177;BA.debugLine="Sub SetEditIcon(varEditIcon As String) As VMSteppe";
 //BA.debugLineNum = 178;BA.debugLine="If varEditIcon = \"\" Then Return Me";
if ((_varediticon).equals("")) { 
if (true) return (b4j.example.vmstepperstep)(this);};
 //BA.debugLineNum = 179;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 180;BA.debugLine="SetAttrSingle(\"edit-icon\", varEditIcon)";
_setattrsingle("edit-icon",_varediticon);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 };
 //BA.debugLineNum = 183;BA.debugLine="Dim pp As String = $\"${ID}EditIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"EditIcon");
 //BA.debugLineNum = 184;BA.debugLine="vue.SetStateSingle(pp, varEditIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varediticon));
 //BA.debugLineNum = 185;BA.debugLine="StepperStep.Bind(\":edit-icon\", pp)";
_stepperstep._bind /*b4j.example.vmelement*/ (":edit-icon",_pp);
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _seterroricon(String _varerroricon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 203;BA.debugLine="Sub SetErrorIcon(varErrorIcon As String) As VMStep";
 //BA.debugLineNum = 204;BA.debugLine="If varErrorIcon = \"\" Then Return Me";
if ((_varerroricon).equals("")) { 
if (true) return (b4j.example.vmstepperstep)(this);};
 //BA.debugLineNum = 205;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 206;BA.debugLine="SetAttrSingle(\"error-icon\", varErrorIcon)";
_setattrsingle("error-icon",_varerroricon);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 };
 //BA.debugLineNum = 209;BA.debugLine="Dim pp As String = $\"${ID}ErrorIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ErrorIcon");
 //BA.debugLineNum = 210;BA.debugLine="vue.SetStateSingle(pp, varErrorIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varerroricon));
 //BA.debugLineNum = 211;BA.debugLine="StepperStep.Bind(\":error-icon\", pp)";
_stepperstep._bind /*b4j.example.vmelement*/ (":error-icon",_pp);
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setlabel(String _lbl,String _lbldesc) throws Exception{
String _pp = "";
String _pd = "";
 //BA.debugLineNum = 43;BA.debugLine="Sub SetLabel(lbl As String, lbldesc As String) As";
 //BA.debugLineNum = 44;BA.debugLine="Dim pp As String = $\"${ID}label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"label");
 //BA.debugLineNum = 45;BA.debugLine="Dim pd As String = $\"${ID}desc\"$";
_pd = (""+__c.SmartStringFormatter("",(Object)(_id))+"desc");
 //BA.debugLineNum = 46;BA.debugLine="vue.SetData(pp, lbl)";
_vue._setdata /*b4j.example.bananovue*/ (_pp,(Object)(_lbl));
 //BA.debugLineNum = 47;BA.debugLine="vue.SetData(pd, lbldesc)";
_vue._setdata /*b4j.example.bananovue*/ (_pd,(Object)(_lbldesc));
 //BA.debugLineNum = 48;BA.debugLine="If bStatic Or DesignMode Then";
if (_bstatic || _designmode) { 
 //BA.debugLineNum = 49;BA.debugLine="StepperStep.SetText($\"${lbl}<small>${lbldesc}</s";
_stepperstep._settext /*b4j.example.vmelement*/ ((""+__c.SmartStringFormatter("",(Object)(_lbl))+"<small>"+__c.SmartStringFormatter("",(Object)(_lbldesc))+"</small>"));
 }else {
 //BA.debugLineNum = 51;BA.debugLine="StepperStep.SetText($\"{{ ${pp} }}<small>{{ ${pd}";
_stepperstep._settext /*b4j.example.vmelement*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_pp))+" }}<small>{{ "+__c.SmartStringFormatter("",(Object)(_pd))+" }}</small>"));
 };
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub SetMarginAll(p As String) As VMStepperStep";
 //BA.debugLineNum = 286;BA.debugLine="StepperStep.setmarginall(p)";
_stepperstep._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 303;BA.debugLine="StepperStep.SetName(varName, bbind)";
_stepperstep._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setonclick(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 233;BA.debugLine="Sub SetOnClick(methodName As String) As VMStepperS";
 //BA.debugLineNum = 234;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 235;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmstepperstep)(this);};
 //BA.debugLineNum = 236;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 237;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 238;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 240;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub SetPaddingAll(p As String) As VMStepperStep";
 //BA.debugLineNum = 281;BA.debugLine="StepperStep.SetPaddingAll(p)";
_stepperstep._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setrules(boolean _varrules) throws Exception{
String _pp = "";
 //BA.debugLineNum = 216;BA.debugLine="Sub SetRules(varRules As Boolean) As VMStepperStep";
 //BA.debugLineNum = 217;BA.debugLine="If varRules = False Then Return Me";
if (_varrules==__c.False) { 
if (true) return (b4j.example.vmstepperstep)(this);};
 //BA.debugLineNum = 218;BA.debugLine="If bStatic Then Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vmstepperstep)(this);};
 //BA.debugLineNum = 219;BA.debugLine="If DesignMode Then Return Me";
if (_designmode) { 
if (true) return (b4j.example.vmstepperstep)(this);};
 //BA.debugLineNum = 220;BA.debugLine="Dim pp As String = $\"${xmodel}Rules\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_xmodel))+"Rules");
 //BA.debugLineNum = 221;BA.debugLine="StepperStep.Bind(\":rules\", pp)";
_stepperstep._bind /*b4j.example.vmelement*/ (":rules",_pp);
 //BA.debugLineNum = 222;BA.debugLine="vue.SetData(pp, vue.NewList)";
_vue._setdata /*b4j.example.bananovue*/ (_pp,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetStatic(b As Boolean) As VMStepperStep";
 //BA.debugLineNum = 38;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 39;BA.debugLine="StepperStep.SetStatic(b)";
_stepperstep._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setstep(String _varstep) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetStep(varStep As String) As VMStepperStep";
 //BA.debugLineNum = 228;BA.debugLine="StepperStep.Bind(\"step\", varStep)";
_stepperstep._bind /*b4j.example.vmelement*/ ("step",_varstep);
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetStyle(sm As Map) As VMStepperStep";
 //BA.debugLineNum = 126;BA.debugLine="StepperStep.SetStyle(sm)";
_stepperstep._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 309;BA.debugLine="StepperStep.SetStyleSingle(prop, value)";
_stepperstep._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetTabIndex(ti As String) As VMStepperStep";
 //BA.debugLineNum = 297;BA.debugLine="StepperStep.SetTabIndex(ti)";
_stepperstep._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _settext(String _t) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetText(t As String) As VMStepperStep";
 //BA.debugLineNum = 103;BA.debugLine="StepperStep.SetText(t)";
_stepperstep._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetVIf(vif As String) As VMStepperStep";
 //BA.debugLineNum = 80;BA.debugLine="StepperStep.SetVIf(vif)";
_stepperstep._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Sub SetVisible(b As Boolean) As VMStepperStep";
 //BA.debugLineNum = 324;BA.debugLine="StepperStep.SetVisible(b)";
_stepperstep._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetVModel(k As String) As VMStepperStep";
 //BA.debugLineNum = 74;BA.debugLine="xmodel = k.tolowercase";
_xmodel = _k.toLowerCase();
 //BA.debugLineNum = 75;BA.debugLine="StepperStep.SetVModel(k)";
_stepperstep._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetVShow(vif As String) As VMStepperStep";
 //BA.debugLineNum = 85;BA.debugLine="StepperStep.SetVShow(vif)";
_stepperstep._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperstep  _show() throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub Show As VMStepperStep";
 //BA.debugLineNum = 251;BA.debugLine="StepperStep.SetVisible(True)";
_stepperstep._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperstep)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 70;BA.debugLine="Return StepperStep.ToString";
if (true) return _stepperstep._tostring /*String*/ ();
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
