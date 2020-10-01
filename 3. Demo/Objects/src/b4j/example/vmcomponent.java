package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcomponent extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmcomponent", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcomponent.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _template = null;
public String _id = "";
public boolean _designmode = false;
public boolean _static = false;
public Object _eventhandler = null;
public b4j.example.bananovue _vue = null;
public anywheresoftware.b4a.objects.collections.Map _methods = null;
public anywheresoftware.b4a.objects.collections.Map _computed = null;
public anywheresoftware.b4a.objects.collections.Map _watches = null;
public anywheresoftware.b4a.objects.collections.Map _filters = null;
public anywheresoftware.b4a.objects.collections.Map _opt = null;
public anywheresoftware.b4a.objects.collections.Map _data = null;
public anywheresoftware.b4a.objects.collections.Map _refs = null;
public anywheresoftware.b4a.objects.collections.List _props = null;
public com.ab.banano.BANano _banano = null;
public String _path = "";
public String _name = "";
public String _propfrom = "";
public anywheresoftware.b4a.objects.collections.Map _query = null;
public com.ab.banano.BANanoObject _jsstring = null;
public com.ab.banano.BANanoObject _jsnumber = null;
public com.ab.banano.BANanoObject _jsboolean = null;
public com.ab.banano.BANanoObject _jsarray = null;
public com.ab.banano.BANanoObject _jsobject = null;
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
public b4j.example.vmcomponent  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub AddComponent(comp As String) As VMComponent";
 //BA.debugLineNum = 208;BA.debugLine="SetText(comp)";
_settext(_comp);
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public String  _addcontainer(b4j.example.vmcontainer _elx) throws Exception{
String _sto = "";
 //BA.debugLineNum = 217;BA.debugLine="Sub AddContainer(elx As VMContainer)";
 //BA.debugLineNum = 218;BA.debugLine="Dim sTo As String = elx.ToString";
_sto = _elx._tostring /*String*/ ();
 //BA.debugLineNum = 219;BA.debugLine="Template.SetText(sTo)";
_template._settext /*b4j.example.vmelement*/ (_sto);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return "";
}
public String  _addelement(b4j.example.vmelement _elx) throws Exception{
String _sto = "";
 //BA.debugLineNum = 212;BA.debugLine="Sub AddElement(elx As VMElement)";
 //BA.debugLineNum = 213;BA.debugLine="Dim sTo As String = elx.ToString";
_sto = _elx._tostring /*String*/ ();
 //BA.debugLineNum = 214;BA.debugLine="Template.SetText(sTo)";
_template._settext /*b4j.example.vmelement*/ (_sto);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcomponent  _addprop(String _propname) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub AddProp(propName As String) As VMComponent";
 //BA.debugLineNum = 235;BA.debugLine="props.Add(propName)";
_props.Add((Object)(_propname));
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _addprops(anywheresoftware.b4a.objects.collections.List _propslist) throws Exception{
String _k = "";
 //BA.debugLineNum = 239;BA.debugLine="Sub AddProps(propsList As List) As VMComponent";
 //BA.debugLineNum = 240;BA.debugLine="For Each k As String In propsList";
{
final anywheresoftware.b4a.BA.IterableList group1 = _propslist;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 241;BA.debugLine="AddProp(k)";
_addprop(_k);
 }
};
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Template As VMElement";
_template = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private DesignMode As Boolean   'ignore";
_designmode = false;
 //BA.debugLineNum = 6;BA.debugLine="Private Static As Boolean      'ignore";
_static = false;
 //BA.debugLineNum = 7;BA.debugLine="Private EventHandler As Object   'ignore";
_eventhandler = new Object();
 //BA.debugLineNum = 8;BA.debugLine="Private vue As BANanoVue    'ignore";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 9;BA.debugLine="Private methods As Map";
_methods = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Private computed As Map";
_computed = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Private watches As Map";
_watches = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 12;BA.debugLine="Private filters As Map";
_filters = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Private opt As Map";
_opt = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 14;BA.debugLine="Private data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 15;BA.debugLine="Public refs As Map";
_refs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 16;BA.debugLine="Private props As List";
_props = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 17;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 18;BA.debugLine="Public Path As String";
_path = "";
 //BA.debugLineNum = 19;BA.debugLine="Public name As String";
_name = "";
 //BA.debugLineNum = 20;BA.debugLine="Private propFrom As String";
_propfrom = "";
 //BA.debugLineNum = 21;BA.debugLine="Public Query As Map";
_query = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 22;BA.debugLine="Public jsString As BANanoObject";
_jsstring = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 23;BA.debugLine="Public jsNumber As BANanoObject";
_jsnumber = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 24;BA.debugLine="Public jsBoolean As BANanoObject";
_jsboolean = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 25;BA.debugLine="Public jsArray As BANanoObject";
_jsarray = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 26;BA.debugLine="Public jsObject As BANanoObject";
_jsobject = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _component() throws Exception{
String _tmp = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 282;BA.debugLine="Sub Component() As Map";
 //BA.debugLineNum = 283;BA.debugLine="Template.RemoveAttributes(Array(\"v-show\", \":disab";
_template._removeattributes /*b4j.example.vmelement*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("v-show"),(Object)(":disabled"),(Object)(":required"),(Object)(":class"),(Object)("v-model"),(Object)("tabindex"),(Object)(":style")}));
 //BA.debugLineNum = 284;BA.debugLine="Dim tmp As String = Template.tostring";
_tmp = _template._tostring /*String*/ ();
 //BA.debugLineNum = 285;BA.debugLine="If data.Size > 0 Then";
if (_data.getSize()>0) { 
 //BA.debugLineNum = 286;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"re";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(this,"returnData",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 287;BA.debugLine="opt.Put(\"data\", cb)";
_opt.Put((Object)("data"),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 289;BA.debugLine="If methods.Size > 0 Then opt.Put(\"methods\", metho";
if (_methods.getSize()>0) { 
_opt.Put((Object)("methods"),(Object)(_methods.getObject()));};
 //BA.debugLineNum = 290;BA.debugLine="If computed.Size > 0 Then opt.Put(\"computed\", com";
if (_computed.getSize()>0) { 
_opt.Put((Object)("computed"),(Object)(_computed.getObject()));};
 //BA.debugLineNum = 291;BA.debugLine="If watches.Size > 0 Then opt.Put(\"watch\", watches";
if (_watches.getSize()>0) { 
_opt.Put((Object)("watch"),(Object)(_watches.getObject()));};
 //BA.debugLineNum = 292;BA.debugLine="If props.Size <> 0 Then opt.Put(\"props\", props)";
if (_props.getSize()!=0) { 
_opt.Put((Object)("props"),(Object)(_props.getObject()));};
 //BA.debugLineNum = 293;BA.debugLine="If filters.Size <> 0 Then opt.Put(\"filters\", filt";
if (_filters.getSize()!=0) { 
_opt.Put((Object)("filters"),(Object)(_filters.getObject()));};
 //BA.debugLineNum = 294;BA.debugLine="opt.Put(\"template\", tmp)";
_opt.Put((Object)("template"),(Object)(_tmp));
 //BA.debugLineNum = 295;BA.debugLine="Return opt";
if (true) return _opt;
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public Object  _getdata(String _prop) throws Exception{
Object _obj = null;
 //BA.debugLineNum = 201;BA.debugLine="Sub GetData(prop As String) As Object";
 //BA.debugLineNum = 202;BA.debugLine="Dim obj As Object = GetState(prop, Null)";
_obj = _getstate(_prop,__c.Null);
 //BA.debugLineNum = 203;BA.debugLine="Return obj";
if (true) return _obj;
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public Object  _getstate(String _k,Object _v) throws Exception{
Object _out = null;
 //BA.debugLineNum = 392;BA.debugLine="Sub GetState(k As String, v As Object) As Object";
 //BA.debugLineNum = 393;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 394;BA.debugLine="If data.ContainsKey(k) Then";
if (_data.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 395;BA.debugLine="Dim out As Object = data.GetDefault(k,v)";
_out = _data.GetDefault((Object)(_k),_v);
 //BA.debugLineNum = 396;BA.debugLine="Return out";
if (true) return _out;
 }else {
 //BA.debugLineNum = 398;BA.debugLine="Log(\"GetState: First set the v-model for \" & k)";
__c.Log("GetState: First set the v-model for "+_k);
 //BA.debugLineNum = 399;BA.debugLine="Return \"\"";
if (true) return (Object)("");
 };
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getstates(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.Map _smm = null;
String _lstrec = "";
Object _state = null;
 //BA.debugLineNum = 464;BA.debugLine="Sub GetStates(lst As List) As Map";
 //BA.debugLineNum = 465;BA.debugLine="Dim smm As Map = CreateMap()";
_smm = new anywheresoftware.b4a.objects.collections.Map();
_smm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 466;BA.debugLine="For Each lstrec As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lstrec = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 467;BA.debugLine="lstrec = lstrec.tolowercase";
_lstrec = _lstrec.toLowerCase();
 //BA.debugLineNum = 468;BA.debugLine="Dim state As Object = GetState(lstrec, Null)";
_state = _getstate(_lstrec,__c.Null);
 //BA.debugLineNum = 469;BA.debugLine="smm.Put(lstrec, state)";
_smm.Put((Object)(_lstrec),_state);
 }
};
 //BA.debugLineNum = 471;BA.debugLine="Return smm";
if (true) return _smm;
 //BA.debugLineNum = 472;BA.debugLine="End Sub";
return null;
}
public boolean  _hasstate(String _k) throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub HasState(k As String) As Boolean";
 //BA.debugLineNum = 387;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 388;BA.debugLine="Return data.ContainsKey(k)";
if (true) return _data.ContainsKey((Object)(_k));
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return false;
}
public String  _hideelement(String _elid) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub HideElement(elID As String)";
 //BA.debugLineNum = 66;BA.debugLine="elID = elID.ToLowerCase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 67;BA.debugLine="SetData($\"${elID}show\"$, False)";
_setdata((""+__c.SmartStringFormatter("",(Object)(_elid))+"show"),(Object)(__c.False));
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcomponent  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _spath,Object _module) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 31;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 32;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 33;BA.debugLine="Template.Initialize(v, ID).SetTag(\"template\")";
_template._initialize /*b4j.example.vmelement*/ (ba,_v,_id)._settag /*b4j.example.vmelement*/ ("template");
 //BA.debugLineNum = 34;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 35;BA.debugLine="EventHandler = Module";
_eventhandler = _module;
 //BA.debugLineNum = 36;BA.debugLine="Static = False";
_static = __c.False;
 //BA.debugLineNum = 38;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 39;BA.debugLine="opt.Initialize";
_opt.Initialize();
 //BA.debugLineNum = 40;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 41;BA.debugLine="refs.Initialize";
_refs.Initialize();
 //BA.debugLineNum = 42;BA.debugLine="props.Initialize";
_props.Initialize();
 //BA.debugLineNum = 43;BA.debugLine="methods.Initialize";
_methods.Initialize();
 //BA.debugLineNum = 44;BA.debugLine="computed.Initialize";
_computed.Initialize();
 //BA.debugLineNum = 45;BA.debugLine="watches.Initialize";
_watches.Initialize();
 //BA.debugLineNum = 46;BA.debugLine="filters.Initialize";
_filters.Initialize();
 //BA.debugLineNum = 47;BA.debugLine="Path = sPath";
_path = _spath;
 //BA.debugLineNum = 48;BA.debugLine="name = ID";
_name = _id;
 //BA.debugLineNum = 49;BA.debugLine="Query.Initialize";
_query.Initialize();
 //BA.debugLineNum = 51;BA.debugLine="jsString.Initialize(\"String\")";
_jsstring.Initialize((Object)("String"));
 //BA.debugLineNum = 52;BA.debugLine="jsNumber.Initialize(\"Number\")";
_jsnumber.Initialize((Object)("Number"));
 //BA.debugLineNum = 53;BA.debugLine="jsBoolean.Initialize(\"Boolean\")";
_jsboolean.Initialize((Object)("Boolean"));
 //BA.debugLineNum = 54;BA.debugLine="jsArray.Initialize(\"Array\")";
_jsarray.Initialize((Object)("Array"));
 //BA.debugLineNum = 55;BA.debugLine="jsObject.Initialize(\"Object\")";
_jsobject.Initialize((Object)("Object"));
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _removedata(String _key) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub RemoveData(key As String) As VMComponent";
 //BA.debugLineNum = 191;BA.debugLine="key = key.ToLowerCase";
_key = _key.toLowerCase();
 //BA.debugLineNum = 192;BA.debugLine="data.Remove(key)";
_data.Remove((Object)(_key));
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _renderit() throws Exception{
anywheresoftware.b4a.objects.collections.Map _option = null;
com.ab.banano.BANanoObject _bo = null;
 //BA.debugLineNum = 246;BA.debugLine="Sub RenderIt As BANanoObject";
 //BA.debugLineNum = 247;BA.debugLine="Dim option As Map = CreateMap(\"template\" : $\"{{ $";
_option = new anywheresoftware.b4a.objects.collections.Map();
_option = __c.createMap(new Object[] {(Object)("template"),(Object)(("{{ "+__c.SmartStringFormatter("",(Object)(_propfrom))+" }}"))});
 //BA.debugLineNum = 248;BA.debugLine="Dim bo As BANanoObject = BANano.RunJavascriptMeth";
_bo = new com.ab.banano.BANanoObject();
_bo = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.RunJavascriptMethod("createElement",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_option.getObject())}))));
 //BA.debugLineNum = 249;BA.debugLine="Return bo";
if (true) return _bo;
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public String  _renderto(String _elid) throws Exception{
com.ab.banano.BANanoObject _bovue = null;
String _dkey = "";
String _rkey = "";
 //BA.debugLineNum = 404;BA.debugLine="Sub RenderTo(elID As String)";
 //BA.debugLineNum = 405;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 406;BA.debugLine="BANano.GetElement($\"#${elID}\"$).empty";
_banano.GetElement(("#"+__c.SmartStringFormatter("",(Object)(_elid))+"")).Empty();
 //BA.debugLineNum = 408;BA.debugLine="Dim boVUE As BANanoObject";
_bovue = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 409;BA.debugLine="opt.Put(\"el\", $\"#${elID}\"$)";
_opt.Put((Object)("el"),(Object)(("#"+__c.SmartStringFormatter("",(Object)(_elid))+"")));
 //BA.debugLineNum = 410;BA.debugLine="Component";
_component();
 //BA.debugLineNum = 411;BA.debugLine="boVUE.Initialize2(\"Vue\", opt)";
_bovue.Initialize2("Vue",(Object)(_opt.getObject()));
 //BA.debugLineNum = 413;BA.debugLine="Dim dKey As String = \"$data\"";
_dkey = "$data";
 //BA.debugLineNum = 414;BA.debugLine="data = boVUE.GetField(dKey).Result";
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_bovue.GetField(_dkey).Result()));
 //BA.debugLineNum = 416;BA.debugLine="Dim rKey As String = \"$refs\"";
_rkey = "$refs";
 //BA.debugLineNum = 417;BA.debugLine="refs = boVUE.GetField(rKey).result";
_refs = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_bovue.GetField(_rkey).Result()));
 //BA.debugLineNum = 418;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _returndata() throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="private Sub ReturnData As Map";
 //BA.debugLineNum = 322;BA.debugLine="Return data";
if (true) return _data;
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setactivated(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _activated = null;
 //BA.debugLineNum = 162;BA.debugLine="Sub SetActivated(module As Object, methodName As S";
 //BA.debugLineNum = 163;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 164;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcomponent)(this);};
 //BA.debugLineNum = 165;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 166;BA.debugLine="Dim activated As BANanoObject = BANano.CallBack(m";
_activated = new com.ab.banano.BANanoObject();
_activated = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 167;BA.debugLine="opt.Put(\"activated\", activated)";
_opt.Put((Object)("activated"),(Object)(_activated.getObject()));
 //BA.debugLineNum = 168;BA.debugLine="SetMethod(module, methodName)";
_setmethod(_module,_methodname);
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setbeforecreate(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _beforecreate = null;
 //BA.debugLineNum = 127;BA.debugLine="Sub SetBeforeCreate(module As Object, methodName A";
 //BA.debugLineNum = 128;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 129;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcomponent)(this);};
 //BA.debugLineNum = 130;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 131;BA.debugLine="Dim beforeCreate As BANanoObject = BANano.CallBac";
_beforecreate = new com.ab.banano.BANanoObject();
_beforecreate = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 132;BA.debugLine="opt.Put(\"beforeCreate\", beforeCreate)";
_opt.Put((Object)("beforeCreate"),(Object)(_beforecreate.getObject()));
 //BA.debugLineNum = 133;BA.debugLine="SetMethod(module, methodName)";
_setmethod(_module,_methodname);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setbeforedestroy(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
boolean _beforedestroy = false;
 //BA.debugLineNum = 115;BA.debugLine="Sub SetBeforeDestroy(module As Object, methodName";
 //BA.debugLineNum = 116;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 117;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcomponent)(this);};
 //BA.debugLineNum = 118;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 119;BA.debugLine="Dim beforeDestroy As Boolean = BANano.CallBack(mo";
_beforedestroy = BA.ObjectToBoolean(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)})));
 //BA.debugLineNum = 120;BA.debugLine="opt.Put(\"beforeDestroy\", beforeDestroy)";
_opt.Put((Object)("beforeDestroy"),(Object)(_beforedestroy));
 //BA.debugLineNum = 121;BA.debugLine="SetMethod(module, methodName)";
_setmethod(_module,_methodname);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setbeforemount(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _beforemount = null;
 //BA.debugLineNum = 93;BA.debugLine="Sub SetBeforeMount(module As Object, methodName As";
 //BA.debugLineNum = 94;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 95;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcomponent)(this);};
 //BA.debugLineNum = 96;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 97;BA.debugLine="Dim beforeMount As BANanoObject = BANano.CallBack";
_beforemount = new com.ab.banano.BANanoObject();
_beforemount = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 98;BA.debugLine="opt.Put(\"beforeMount\", beforeMount)";
_opt.Put((Object)("beforeMount"),(Object)(_beforemount.getObject()));
 //BA.debugLineNum = 99;BA.debugLine="SetMethod(module, methodName)";
_setmethod(_module,_methodname);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setbeforeupdate(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
boolean _beforeupdate = false;
 //BA.debugLineNum = 104;BA.debugLine="Sub SetBeforeUpdate(module As Object, methodName A";
 //BA.debugLineNum = 105;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 106;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcomponent)(this);};
 //BA.debugLineNum = 107;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 108;BA.debugLine="Dim beforeUpdate As Boolean = BANano.CallBack(mod";
_beforeupdate = BA.ObjectToBoolean(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)})));
 //BA.debugLineNum = 109;BA.debugLine="opt.Put(\"beforeUpdate\", beforeUpdate)";
_opt.Put((Object)("beforeUpdate"),(Object)(_beforeupdate));
 //BA.debugLineNum = 110;BA.debugLine="SetMethod(module, methodName)";
_setmethod(_module,_methodname);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public String  _setcallback(String _methodname,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Sub SetCallBack(methodName As String, cb As BANano";
 //BA.debugLineNum = 370;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 371;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcomponent  _setcomputed(String _k,Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 326;BA.debugLine="Sub SetComputed(k As String, module As Object, met";
 //BA.debugLineNum = 327;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 328;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 329;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 330;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 331;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 332;BA.debugLine="computed.Put(k, cb.Result)";
_computed.Put((Object)(_k),_cb.Result());
 };
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setcreated(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _created = null;
 //BA.debugLineNum = 139;BA.debugLine="Sub SetCreated(module As Object, methodName As Str";
 //BA.debugLineNum = 140;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 141;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcomponent)(this);};
 //BA.debugLineNum = 142;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 143;BA.debugLine="Dim created As BANanoObject = BANano.CallBack(mod";
_created = new com.ab.banano.BANanoObject();
_created = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 144;BA.debugLine="opt.Put(\"created\", created)";
_opt.Put((Object)("created"),(Object)(_created.getObject()));
 //BA.debugLineNum = 145;BA.debugLine="SetMethod(module, methodName)";
_setmethod(_module,_methodname);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setdata(String _prop,Object _valuex) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub SetData(prop As String, valuex As Object) As V";
 //BA.debugLineNum = 197;BA.debugLine="SetStateSingle(prop, valuex)";
_setstatesingle(_prop,_valuex);
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setdeactivated(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _deactivated = null;
 //BA.debugLineNum = 174;BA.debugLine="Sub SetDeActivated(module As Object, methodName As";
 //BA.debugLineNum = 175;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 176;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcomponent)(this);};
 //BA.debugLineNum = 177;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 178;BA.debugLine="Dim deactivated As BANanoObject = BANano.CallBack";
_deactivated = new com.ab.banano.BANanoObject();
_deactivated = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 179;BA.debugLine="opt.Put(\"deactivated\", deactivated)";
_opt.Put((Object)("deactivated"),(Object)(_deactivated.getObject()));
 //BA.debugLineNum = 180;BA.debugLine="SetMethod(module, methodName)";
_setmethod(_module,_methodname);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMComponent";
 //BA.debugLineNum = 277;BA.debugLine="Template.SetDesignMode(b)";
_template._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 278;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setdestroyed(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _destroyed = null;
 //BA.debugLineNum = 150;BA.debugLine="Sub SetDestroyed(module As Object, methodName As S";
 //BA.debugLineNum = 151;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 152;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcomponent)(this);};
 //BA.debugLineNum = 153;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 154;BA.debugLine="Dim destroyed As BANanoObject = BANano.CallBack(m";
_destroyed = new com.ab.banano.BANanoObject();
_destroyed = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 155;BA.debugLine="opt.Put(\"destroyed\", destroyed)";
_opt.Put((Object)("destroyed"),(Object)(_destroyed.getObject()));
 //BA.debugLineNum = 156;BA.debugLine="SetMethod(module, methodName)";
_setmethod(_module,_methodname);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setfilter(Object _module,String _methodname) throws Exception{
Object _value = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 309;BA.debugLine="Sub SetFilter(module As Object, methodName As Stri";
 //BA.debugLineNum = 310;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 311;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 312;BA.debugLine="Dim value As Object";
_value = new Object();
 //BA.debugLineNum = 313;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_value}))));
 //BA.debugLineNum = 314;BA.debugLine="filters.Put(methodName, cb)";
_filters.Put((Object)(_methodname),(Object)(_cb.getObject()));
 }else {
 //BA.debugLineNum = 316;BA.debugLine="Log($\"SetFilter.${methodName} could not be found";
__c.Log(("SetFilter."+__c.SmartStringFormatter("",(Object)(_methodname))+" could not be found!"));
 };
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setfunctional(boolean _b) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetFunctional(b As Boolean) As VMComponent";
 //BA.debugLineNum = 253;BA.debugLine="opt.Put(\"functional\", b)";
_opt.Put((Object)("functional"),(Object)(_b));
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setmethod(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 357;BA.debugLine="Sub SetMethod(Module As Object,methodName As Strin";
 //BA.debugLineNum = 358;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 359;BA.debugLine="If SubExists(Module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 360;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 361;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 362;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setmethod1(Object _module,String _methodname,anywheresoftware.b4a.objects.collections.List _args) throws Exception{
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 299;BA.debugLine="Sub SetMethod1(Module As Object, methodName As Str";
 //BA.debugLineNum = 300;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 301;BA.debugLine="If SubExists(Module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 302;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,_args)));
 //BA.debugLineNum = 303;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setmounted(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _mounted = null;
 //BA.debugLineNum = 71;BA.debugLine="Sub SetMounted(module As Object, methodName As Str";
 //BA.debugLineNum = 72;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 73;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcomponent)(this);};
 //BA.debugLineNum = 74;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 75;BA.debugLine="Dim mounted As BANanoObject = BANano.CallBack(mod";
_mounted = new com.ab.banano.BANanoObject();
_mounted = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 76;BA.debugLine="opt.Put(\"mounted\", mounted)";
_opt.Put((Object)("mounted"),(Object)(_mounted.getObject()));
 //BA.debugLineNum = 77;BA.debugLine="SetMethod(module, methodName)";
_setmethod(_module,_methodname);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setquerystring(String _k,String _v) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetQueryString(k As String, v As String) As VM";
 //BA.debugLineNum = 186;BA.debugLine="Query.Put(k, v)";
_query.Put((Object)(_k),(Object)(_v));
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setstate(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
Object _v = null;
 //BA.debugLineNum = 376;BA.debugLine="Sub SetState(m As Map) As VMComponent";
 //BA.debugLineNum = 377;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 378;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 379;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 380;BA.debugLine="data.Put(k, v)";
_data.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 382;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setstatedecrement(String _k) throws Exception{
String _oldv = "";
 //BA.debugLineNum = 491;BA.debugLine="Sub SetStateDecrement(k As String) As VMComponent";
 //BA.debugLineNum = 492;BA.debugLine="Dim oldV As String = GetState(k, \"0\")";
_oldv = BA.ObjectToString(_getstate(_k,(Object)("0")));
 //BA.debugLineNum = 493;BA.debugLine="oldV = BANano.parseInt(oldV) - 1";
_oldv = BA.NumberToString(_banano.parseInt((Object)(_oldv))-1);
 //BA.debugLineNum = 494;BA.debugLine="SetStateSingle(k, oldV)";
_setstatesingle(_k,(Object)(_oldv));
 //BA.debugLineNum = 495;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 496;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setstatefalse(String _k) throws Exception{
 //BA.debugLineNum = 479;BA.debugLine="Sub SetStateFalse(k As String) As VMComponent";
 //BA.debugLineNum = 480;BA.debugLine="SetStateSingle(k,False)";
_setstatesingle(_k,(Object)(__c.False));
 //BA.debugLineNum = 481;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 482;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setstateincrement(String _k) throws Exception{
String _oldv = "";
 //BA.debugLineNum = 484;BA.debugLine="Sub SetStateIncrement(k As String) As VMComponent";
 //BA.debugLineNum = 485;BA.debugLine="Dim oldV As String = GetState(k, \"0\")";
_oldv = BA.ObjectToString(_getstate(_k,(Object)("0")));
 //BA.debugLineNum = 486;BA.debugLine="oldV = BANano.parseInt(oldV) + 1";
_oldv = BA.NumberToString(_banano.parseInt((Object)(_oldv))+1);
 //BA.debugLineNum = 487;BA.debugLine="SetStateSingle(k, oldV)";
_setstatesingle(_k,(Object)(_oldv));
 //BA.debugLineNum = 488;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setstatelist(String _mapkey,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
 //BA.debugLineNum = 446;BA.debugLine="Sub SetStateList(mapKey As String, mapValues As Li";
 //BA.debugLineNum = 447;BA.debugLine="mapKey = mapKey.tolowercase";
_mapkey = _mapkey.toLowerCase();
 //BA.debugLineNum = 448;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 449;BA.debugLine="opt.Put(mapKey, mapValues)";
_opt.Put((Object)(_mapkey),(Object)(_mapvalues.getObject()));
 //BA.debugLineNum = 450;BA.debugLine="SetState(opt)";
_setstate(_opt);
 //BA.debugLineNum = 451;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setstatelistvalues(anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
String _lstvalue = "";
 //BA.debugLineNum = 454;BA.debugLine="Sub SetStateListValues(mapValues As List) As VMCom";
 //BA.debugLineNum = 455;BA.debugLine="For Each lstValue As String In mapValues";
{
final anywheresoftware.b4a.BA.IterableList group1 = _mapvalues;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lstvalue = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 456;BA.debugLine="lstValue = lstValue.tolowercase";
_lstvalue = _lstvalue.toLowerCase();
 //BA.debugLineNum = 457;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 458;BA.debugLine="opt.Put(lstValue, \"\")";
_opt.Put((Object)(_lstvalue),(Object)(""));
 //BA.debugLineNum = 459;BA.debugLine="SetState(opt)";
_setstate(_opt);
 }
};
 //BA.debugLineNum = 461;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setstatemap(String _mapkey,anywheresoftware.b4a.objects.collections.Map _mapvalues) throws Exception{
 //BA.debugLineNum = 437;BA.debugLine="Sub SetStateMap(mapKey As String, mapValues As Map";
 //BA.debugLineNum = 438;BA.debugLine="mapKey = mapKey.tolowercase";
_mapkey = _mapkey.toLowerCase();
 //BA.debugLineNum = 439;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 440;BA.debugLine="opt.Put(mapKey, mapValues)";
_opt.Put((Object)(_mapkey),(Object)(_mapvalues.getObject()));
 //BA.debugLineNum = 441;BA.debugLine="SetState(opt)";
_setstate(_opt);
 //BA.debugLineNum = 442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setstatesingle(String _k,Object _v) throws Exception{
anywheresoftware.b4a.objects.collections.Map _optx = null;
 //BA.debugLineNum = 499;BA.debugLine="Sub SetStateSingle(k As String, v As Object) As VM";
 //BA.debugLineNum = 500;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 501;BA.debugLine="Dim optx As Map = CreateMap()";
_optx = new anywheresoftware.b4a.objects.collections.Map();
_optx = __c.createMap(new Object[] {});
 //BA.debugLineNum = 502;BA.debugLine="optx.Put(k, v)";
_optx.Put((Object)(_k),_v);
 //BA.debugLineNum = 503;BA.debugLine="SetState(optx)";
_setstate(_optx);
 //BA.debugLineNum = 504;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setstatetrue(String _k) throws Exception{
 //BA.debugLineNum = 474;BA.debugLine="Sub SetStateTrue(k As String) As VMComponent";
 //BA.debugLineNum = 475;BA.debugLine="SetStateSingle(k,True)";
_setstatesingle(_k,(Object)(__c.True));
 //BA.debugLineNum = 476;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 477;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub SetStatic(b As Boolean) As VMComponent";
 //BA.debugLineNum = 267;BA.debugLine="Static = b";
_static = _b;
 //BA.debugLineNum = 268;BA.debugLine="Template.SetStatic(b)";
_template._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetTemplate(t As String) As VMComponent";
 //BA.debugLineNum = 229;BA.debugLine="Template.SetText(t)";
_template._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _settext(String _t) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetText(t As String) As VMComponent";
 //BA.debugLineNum = 224;BA.debugLine="Template.SetText(t)";
_template._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setupdated(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _updated = null;
 //BA.debugLineNum = 82;BA.debugLine="Sub SetUpdated(module As Object, methodName As Str";
 //BA.debugLineNum = 83;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 84;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcomponent)(this);};
 //BA.debugLineNum = 85;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 86;BA.debugLine="Dim updated As BANanoObject = BANano.CallBack(mod";
_updated = new com.ab.banano.BANanoObject();
_updated = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 87;BA.debugLine="opt.Put(\"updated\", updated)";
_opt.Put((Object)("updated"),(Object)(_updated.getObject()));
 //BA.debugLineNum = 88;BA.debugLine="SetMethod(module, methodName)";
_setmethod(_module,_methodname);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _setwatch(Object _module,String _k,boolean _bimmediate,boolean _bdeep,String _methodname) throws Exception{
Object _newval = null;
com.ab.banano.BANanoObject _cb = null;
anywheresoftware.b4a.objects.collections.Map _deepit = null;
 //BA.debugLineNum = 338;BA.debugLine="Sub SetWatch(Module As Object, k As String, bImmed";
 //BA.debugLineNum = 339;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 340;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 341;BA.debugLine="If SubExists(Module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 342;BA.debugLine="Dim newVal As Object";
_newval = new Object();
 //BA.debugLineNum = 343;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_newval}))));
 //BA.debugLineNum = 344;BA.debugLine="Dim deepit As Map = CreateMap()";
_deepit = new anywheresoftware.b4a.objects.collections.Map();
_deepit = __c.createMap(new Object[] {});
 //BA.debugLineNum = 345;BA.debugLine="deepit.Put(\"handler\", methodName)";
_deepit.Put((Object)("handler"),(Object)(_methodname));
 //BA.debugLineNum = 346;BA.debugLine="deepit.Put(\"deep\", bDeep)";
_deepit.Put((Object)("deep"),(Object)(_bdeep));
 //BA.debugLineNum = 347;BA.debugLine="deepit.Put(\"immediate\", bImmediate)";
_deepit.Put((Object)("immediate"),(Object)(_bimmediate));
 //BA.debugLineNum = 348;BA.debugLine="watches.Put(k, deepit)";
_watches.Put((Object)(_k),(Object)(_deepit.getObject()));
 //BA.debugLineNum = 349;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public String  _showelement(String _elid) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub ShowElement(elID As String)";
 //BA.debugLineNum = 61;BA.debugLine="elID = elID.ToLowerCase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 62;BA.debugLine="SetData($\"${elID}show\"$, True)";
_setdata((""+__c.SmartStringFormatter("",(Object)(_elid))+"show"),(Object)(__c.True));
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public boolean  _stateexists(String _statename) throws Exception{
 //BA.debugLineNum = 431;BA.debugLine="Sub StateExists(stateName As String) As Boolean";
 //BA.debugLineNum = 432;BA.debugLine="stateName = stateName.tolowercase";
_statename = _statename.toLowerCase();
 //BA.debugLineNum = 433;BA.debugLine="Return data.ContainsKey(stateName)";
if (true) return _data.ContainsKey((Object)(_statename));
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return false;
}
public b4j.example.vmcomponent  _templatefromproperty(String _propname) throws Exception{
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 257;BA.debugLine="Sub TemplateFromProperty(propName As String) As VM";
 //BA.debugLineNum = 258;BA.debugLine="propName = propName.ToLowerCase";
_propname = _propname.toLowerCase();
 //BA.debugLineNum = 259;BA.debugLine="propFrom = propName";
_propfrom = _propname;
 //BA.debugLineNum = 260;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"Ren";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(this,"RenderIt",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 261;BA.debugLine="opt.Put(\"render\", cb)";
_opt.Put((Object)("render"),(Object)(_cb.getObject()));
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcomponent  _togglestate(String _statename) throws Exception{
boolean _bcurrent = false;
anywheresoftware.b4a.objects.collections.Map _optx = null;
 //BA.debugLineNum = 421;BA.debugLine="Sub ToggleState(stateName As String) As VMComponen";
 //BA.debugLineNum = 422;BA.debugLine="Dim bcurrent As Boolean = GetState(stateName,\"\")";
_bcurrent = BA.ObjectToBoolean(_getstate(_statename,(Object)("")));
 //BA.debugLineNum = 423;BA.debugLine="bcurrent = Not(bcurrent)";
_bcurrent = __c.Not(_bcurrent);
 //BA.debugLineNum = 424;BA.debugLine="Dim optx As Map = CreateMap()";
_optx = new anywheresoftware.b4a.objects.collections.Map();
_optx = __c.createMap(new Object[] {});
 //BA.debugLineNum = 425;BA.debugLine="optx.Put(stateName, bcurrent)";
_optx.Put((Object)(_statename),(Object)(_bcurrent));
 //BA.debugLineNum = 426;BA.debugLine="SetState(optx)";
_setstate(_optx);
 //BA.debugLineNum = 427;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcomponent)(this);
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 273;BA.debugLine="Return Template.ToString";
if (true) return _template._tostring /*String*/ ();
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
