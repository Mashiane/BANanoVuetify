

/* bananovuetifyprism */
/* =========================== VMPrism  =========================== */
function banano_bananovuetifyprism_vmprism() {
var _B=this;
_B._prismcomponent= new banano_bananovuetifycore_vmelement();

_B._id="";

_B._vue= new banano_bananovuetifycore_bananovue();

_B._designmode=false;

_B._module={};

_B._codekey="";

_B._card= new banano_bananovuetifycore_vmcard();

_B._pc=null;

_B._code_css="css";

_B._code_js="js";

_B._code_html="html";

_B._code_vb="vb";

_B._code_other="";

_B._lang="";

// [21] Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMPrism 
_B.initialize=function(_v,_sid,_eventhandler) {
// [22]  vue = v 
_B._vue=_v;
// [23]  Module = eventHandler 
_B._module=_eventhandler;
// [25]  If vue.ModuleExist( {19} ) = False Then 
if (_B._vue.moduleexist("prism")==false) {
// [26]  PC.Initialize( {20} ) 
_B._pc=PrismComponent;
// [27]  vue.AddComponentBO( {21} , PC) 
_B._vue.addcomponentbo("prism",_B._pc);
// [28]  vue.AddModule( {22} ) 
_B._vue.addmodule("prism");
// [29]  End If 
}
// [31]  BANano.DependsOnAsset( {23} ) 
;
// [32]  BANano.DependsOnAsset( {24} ) 
;
// [34]  BANano.DependsOnAsset( {25} ) 
;
// [35]  BANano.DependsOnAsset( {26} ) 
;
// [36]  BANano.DependsOnAsset( {27} ) 
;
// [38]  BANano.DependsOnAsset( {28} ) 
;
// [39]  BANano.DependsOnAsset( {29} ) 
;
// [40]  BANano.DependsOnAsset( {30} ) 
;
// [41]  BANano.DependsOnAsset( {31} ) 
;
// [43]  ID = sid.tolowercase 
_B._id=_sid.toLowerCase();
// [44]  PrismComponent.Initialize(v, ID) 
_B._prismcomponent.initialize(_v,_B._id);
// [45]  PrismComponent.SetTag( {32} ) 
_B._prismcomponent.settag("prism");
// [46]  DesignMode = False 
_B._designmode=false;
// [47]  codeKey = {0} 
_B._codekey="" + _B._id + "code";
// [48]  vue.SetStateSingle(codeKey , {33} ) 
_B._vue.setstatesingle(_B._codekey,"");
// [49]  Bind( {34} , codeKey) 
_B.bind(":code",_B._codekey,_B);
// [50]  Card.Initialize(vue, {1} , Module) 
_B._card.initialize(_B._vue,"" + _B._id + "card",_B._module);
// [51]  Card.ToolBar.AddTitle( {35} , {36} ) 
_B._card._toolbar.addtitle("Source Code","");
// [52]  Return Me 
return _B;
// End Sub
};

// [55] Sub SetTitle(sTitle As String) 
_B.settitle=function(_stitle) {
// [56]  Card.ToolBar.UpdateTitle(sTitle) 
_B._card._toolbar.updatetitle(_stitle);
// End Sub
};

// [60] Sub ToString As String 
_B.tostring=function() {
// [61]  Card.ToolBar.SetDense(True) 
_B._card._toolbar.setdense(true);
// [62]  Card.ToolBar.SetFlat(True) 
_B._card._toolbar.setflat(true);
// [63]  Card.ToolBar.AddSpacer 
_B._card._toolbar.addspacer();
// [64]  Card.ToolBar.AddIcon( {2} , {37} , {38} , {39} ) 
_B._card._toolbar.addicon("" + _B._id + "copy","mdi-content-copy","Copy code to clipboard","");
// [65]  Card.ToolBar.AddDivider(True, Null, Null, Null, Null) 
_B._card._toolbar.adddivider(true,null,null,null,null);
// [66]  Card.ToolBar.AddIcon( {3} , {40} , {41} , {42} ) 
_B._card._toolbar.addicon("" + _B._id + "download","mdi-cloud-download-outline","Download code","");
// [67]  Card.Actions.SetVisible(False) 
_B._card._actions.setvisible(false);
// [68]  Card.Container.SetTag( {43} ) 
_B._card._container.settag("div");
// [69]  Card.container.SetNoGutters(True) 
_B._card._container.setnogutters(true);
// [70]  Card.Container.AddControlS(PrismComponent, PrismComponent.ToString,1,1,12,12,12,12) 
_B._card._container.addcontrols(_B._prismcomponent,_B._prismcomponent.tostring(),1,1,12,12,12,12);
// [72]  Return Card.ToString 
return _B._card.tostring();
// End Sub
};

// [76] Sub Download(fileName As String) 
_B.download=function(_filename) {
var _scode,_fc,_blob;
// [77]  Dim sCode As String = vue.GetData(codeKey) 
_scode=_B._vue.getdata(_B._codekey);
// [78]  Dim fc As List 
_fc=[];
// [79]  fc.Initialize 
_fc.length=0;
// [80]  fc.Add(sCode) 
_fc.push(_scode);
// [81]  Dim blob As BANanoObject 
_blob=null;
// [82]  blob.Initialize2( {44} ,Array(fc, CreateMap( {45} : {46} ))) 
_blob=new Blob(_fc,{"type":"text/plain;charset=utf-8"});
// [83]  BANano.RunJavascriptMethod( {47} ,Array(blob,fileName)) 
BANanoExec("saveAs", window, _blob,_filename);
// End Sub
};

// [87] Sub Copy2Clipboard As BANanoPromise 
_B.copy2clipboard=function() {
var _scode,_bp;
// [89]  Dim sCode As String = vue.GetData(codeKey) 
_scode=_B._vue.getdata(_B._codekey);
// [90]  Dim bp As BANanoPromise = vue.RunMethod( {48} , Array(sCode)) 
_bp=_B._vue.runmethod("$copyText",[_scode]);
// [91]  Return bp 
return _bp;
// End Sub
};

// [94] Sub SetVIf(vif As Object) As VMPrism 
_B.setvif=function(_vif) {
// [95] PrismComponent.SetVIf(vif) 
_B._prismcomponent.setvif(_vif);
// [96] Return Me 
return _B;
// End Sub
};

// [99] Sub SetVShow(vif As Object) As VMPrism 
_B.setvshow=function(_vif) {
// [100] PrismComponent.SetVShow(vif) 
_B._prismcomponent.setvshow(_vif);
// [101] Return Me 
return _B;
// End Sub
};

// [105] Sub Render 
_B.render=function() {
// [106] vue.SetTemplate(ToString) 
_B._vue.settemplate(_B.tostring(_B));
// End Sub
};

// [110] Sub AddChild(child As VMElement) As VMPrism 
_B.addchild=function(_child) {
var _childhtml;
// [111] Dim childHTML As String = child.ToString 
_childhtml=_child.tostring();
// [112] PrismComponent.SetText(childHTML) 
_B._prismcomponent.settext(_childhtml);
// [113] Return Me 
return _B;
// End Sub
};

// [117] Sub Pop(p As VMElement) 
_B.pop=function(_p) {
// [118] p.SetText(ToString) 
_p.settext(_B.tostring(_B));
// End Sub
};

// [122] Sub AddClass(c As String) As VMPrism 
_B.addclass=function(_c) {
// [123] PrismComponent.AddClass(c) 
_B._prismcomponent.addclass(_c);
// [124] Return Me 
return _B;
// End Sub
};

// [128] Sub SetAttr(attr As Map) As VMPrism 
_B.setattr=function(_attr) {
// [129] PrismComponent.SetAttr(attr) 
_B._prismcomponent.setattr(_attr);
// [130] Return Me 
return _B;
// End Sub
};

// [134] Sub SetStyle(sm As Map) As VMPrism 
_B.setstyle=function(_sm) {
// [135] PrismComponent.SetStyle(sm) 
_B._prismcomponent.setstyle(_sm);
// [136] Return Me 
return _B;
// End Sub
};

// [140] Sub AddChildren(children As List) 
_B.addchildren=function(_children) {
var _childx;
// [141] For Each childx As VMElement In children 
for (var _childxindex=0;_childxindex<_children.length;_childxindex++) {
_childx=_children[_childxindex];
// [142] AddChild(childx) 
_B.addchild(_childx,_B);
// [143] Next 
}
// End Sub
};

// [147] Sub SetCode(varCode As String) As VMPrism 
_B.setcode=function(_varcode) {
var _sformat;
// [148]  Select lang 
switch ("" + _B._lang) {
// [149]  Case {49} , {50} , {51} 
case "" + "js":
case "" + "css":
case "" + "html":
// [150]  Dim sformat As String = BeautifySourceCode(lang, varCode) 
_sformat=_B.beautifysourcecode(_B._lang,_varcode,_B);
// [151]  varCode = sformat 
_varcode=_sformat;
// [152]  End Select 
break;
}
// [153]  vue.SetStateSingle(codeKey, varCode) 
_B._vue.setstatesingle(_B._codekey,_varcode);
// [154]  Return Me 
return _B;
// End Sub
};

// [158] Sub SetInline(varInline As Object) As VMPrism 
_B.setinline=function(_varinline) {
var _pp;
// [159]  Dim pp As String = {4} 
_pp="" + _B._id + "Inline";
// [160]  vue.SetStateSingle(pp, varInline) 
_B._vue.setstatesingle(_pp,_varinline);
// [161]  PrismComponent.Bind( {52} , pp) 
_B._prismcomponent.bind(":inline",_pp);
// [162]  Return Me 
return _B;
// End Sub
};

// [166] Sub SetLanguage(varLanguage As String) As VMPrism 
_B.setlanguage=function(_varlanguage) {
var _pp;
// [167]  Dim pp As String = {5} 
_pp="" + _B._id + "Language";
// [168]  vue.SetStateSingle(pp, varLanguage) 
_B._vue.setstatesingle(_pp,_varlanguage);
// [169]  PrismComponent.Bind( {53} , pp) 
_B._prismcomponent.bind(":language",_pp);
// [170]  lang = varLanguage 
_B._lang=_varlanguage;
// [171]  Return Me 
return _B;
// End Sub
};

// [175] Sub BeautifySourceCode(slang As String, sc As String) As String 
_B.beautifysourcecode=function(_slang,_sc) {
var _res;
// [176]  Select Case slang 
switch ("" + _slang) {
// [177]  Case {54} 
case "" + "js":
// [178]  Dim res As String = BANano.RunJavascriptMethod( {55} , Array(sc)) 
_res=BANanoExec("js_beautify", window, _sc);
// [179]  Case {56} 
break;
case "" + "css":
// [180]  Dim res As String = BANano.RunJavascriptMethod( {57} , Array(sc)) 
_res=BANanoExec("css_beautify", window, _sc);
// [181]  Case {58} 
break;
case "" + "html":
// [182]  Dim res As String = BANano.RunJavascriptMethod( {59} , Array(sc)) 
_res=BANanoExec("html_beautify", window, _sc);
// [183]  End Select 
break;
}
// [184]  Return res 
return _res;
// End Sub
};

// [189] Sub Hide As VMPrism 
_B.hide=function() {
// [190]  PrismComponent.SetVisible(False) 
_B._prismcomponent.setvisible(false);
// [191]  Return Me 
return _B;
// End Sub
};

// [195] Sub Show As VMPrism 
_B.show=function() {
// [196]  PrismComponent.SetVisible(True) 
_B._prismcomponent.setvisible(true);
// [197]  Return Me 
return _B;
// End Sub
};

// [201] Sub Enable As VMPrism 
_B.enable=function() {
// [202]  PrismComponent.Enable(True) 
_B._prismcomponent.enable(true);
// [203]  Return Me 
return _B;
// End Sub
};

// [207] Sub Disable As VMPrism 
_B.disable=function() {
// [208]  PrismComponent.Disable(True) 
_B._prismcomponent.disable(true);
// [209]  Return Me 
return _B;
// End Sub
};

// [214] Sub Bind(prop As String, stateprop As String) As VMPrism 
_B.bind=function(_prop,_stateprop) {
// [215]  stateprop = stateprop.ToLowerCase 
_stateprop=_stateprop.toLowerCase();
// [216]  SetAttrSingle(prop, stateprop) 
_B.setattrsingle(_prop,_stateprop,_B);
// [217]  Return Me 
return _B;
// End Sub
};

// [221] Sub SetAttrLoose(loose As String) As VMPrism 
_B.setattrloose=function(_loose) {
// [222]  PrismComponent.SetAttrLoose(loose) 
_B._prismcomponent.setattrloose(_loose);
// [223]  Return Me 
return _B;
// End Sub
};

// [227] Sub UseTheme(themeName As String) As VMPrism 
_B.usetheme=function(_themename) {
var _themes,_sclass;
// [228]  themeName = themeName.ToLowerCase 
_themename=_themename.toLowerCase();
// [229]  Dim themes As Map = vue.themes 
_themes=_B._vue._themes;
// [230]  If themes.ContainsKey(themeName) Then 
if ((_themename in _themes)) {
// [231]  Dim sclass As String = themes.Get(themeName) 
_sclass=_themes[_themename];
// [232]  AddClass(sclass) 
_B.addclass(_sclass,_B);
// [233]  End If 
}
// [234]  Return Me 
return _B;
// End Sub
};

// [239] Sub SetColorIntensity(varColor As String, varIntensity As String) As VMPrism 
_B.setcolorintensity=function(_varcolor,_varintensity) {
var _pp,_scolor;
// [240]  Dim pp As String = {6} 
_pp="" + _B._id + "Color";
// [241]  Dim scolor As String = {7} 
_scolor="" + _varcolor + " " + _varintensity + "";
// [242]  vue.SetStateSingle(pp, scolor) 
_B._vue.setstatesingle(_pp,_scolor);
// [243]  PrismComponent.Bind( {60} , pp) 
_B._prismcomponent.bind(":color",_pp);
// [244]  Return Me 
return _B;
// End Sub
};

// [248] public Sub RemoveAttr(sName As String) As VMPrism 
_B.removeattr=function(_sname) {
// [249]  PrismComponent.RemoveAttr(sName) 
_B._prismcomponent.removeattr(_sname);
// [250]  Return Me 
return _B;
// End Sub
};

// [254] Sub SetPaddingAll(p As String) As VMPrism 
_B.setpaddingall=function(_p) {
// [255]  PrismComponent.SetPaddingAll(p) 
_B._prismcomponent.setpaddingall(_p);
// [256]  Return Me 
return _B;
// End Sub
};

// [260] Sub SetMarginAll(p As String) As VMPrism 
_B.setmarginall=function(_p) {
// [261]  PrismComponent.setmarginall(p) 
_B._prismcomponent.setmarginall(_p);
// [262]  Return Me 
return _B;
// End Sub
};

// [266] Sub SetDesignMode(b As Boolean) As VMPrism 
_B.setdesignmode=function(_b) {
// [267]  PrismComponent.SetDesignMode(b) 
_B._prismcomponent.setdesignmode(_b);
// [268]  DesignMode = b 
_B._designmode=_b;
// [269]  Return Me 
return _B;
// End Sub
};

// [273] Sub SetTabIndex(ti As String) As VMPrism 
_B.settabindex=function(_ti) {
// [274]  PrismComponent.SetTabIndex(ti) 
_B._prismcomponent.settabindex(_ti);
// [275]  Return Me 
return _B;
// End Sub
};

// [279] Sub SetName(varName As Object, bbind As Boolean) As VMPrism 
_B.setname=function(_varname,_bbind) {
// [280]  PrismComponent.SetName(varName, bbind) 
_B._prismcomponent.setname(_varname,_bbind);
// [281]  Return Me 
return _B;
// End Sub
};

// [285] Sub SetStyleSingle(prop As String, value As String) As VMPrism 
_B.setstylesingle=function(_prop,_value) {
// [286]  PrismComponent.SetStyleSingle(prop, value) 
_B._prismcomponent.setstylesingle(_prop,_value);
// [287]  Return Me 
return _B;
// End Sub
};

// [291] Sub SetAttrSingle(prop As String, value As String) As VMPrism 
_B.setattrsingle=function(_prop,_value) {
// [292]  PrismComponent.SetAttrSingle(prop, value) 
_B._prismcomponent.setattrsingle(_prop,_value);
// [293]  Return Me 
return _B;
// End Sub
};

// [297] Sub BindStyleSingle(prop As String, value As String) As VMPrism 
_B.bindstylesingle=function(_prop,_value) {
// [298]  PrismComponent.BindStyleSingle(prop, value) 
_B._prismcomponent.bindstylesingle(_prop,_value);
// [299]  Return Me 
return _B;
// End Sub
};

// [302] Sub SetVElse(vif As String) As VMPrism 
_B.setvelse=function(_vif) {
// [303]  PrismComponent.SetVElse(vif) 
_B._prismcomponent.setvelse(_vif);
// [304]  Return Me 
return _B;
// End Sub
};

// [307] Sub SetVText(vhtml As String) As VMPrism 
_B.setvtext=function(_vhtml) {
// [308]  PrismComponent.SetVText(vhtml) 
_B._prismcomponent.setvtext(_vhtml);
// [309]  Return Me 
return _B;
// End Sub
};

// [312] Sub SetVhtml(vhtml As String) As VMPrism 
_B.setvhtml=function(_vhtml) {
// [313]  PrismComponent.SetVHtml(vhtml) 
_B._prismcomponent.setvhtml(_vhtml);
// [314]  Return Me 
return _B;
// End Sub
};

// [317] Sub SetAttributes(attrs As List) As VMPrism 
_B.setattributes=function(_attrs) {
var _stra;
// [318]  For Each stra As String In attrs 
for (var _straindex=0;_straindex<_attrs.length;_straindex++) {
_stra=_attrs[_straindex];
// [319]  SetAttrLoose(stra) 
_B.setattrloose(_stra,_B);
// [320]  Next 
}
// [321]  Return Me 
return _B;
// End Sub
};

// [325] Sub SetVFor(item As String, dataSource As String) As VMPrism 
_B.setvfor=function(_item,_datasource) {
var _sline;
// [326]  dataSource = dataSource.tolowercase 
_datasource=_datasource.toLowerCase();
// [327]  item = item.tolowercase 
_item=_item.toLowerCase();
// [328]  Dim sline As String = {8} 
_sline="" + _item + " in " + _datasource + "";
// [329]  SetAttrSingle( {61} , sline) 
_B.setattrsingle("v-for",_sline,_B);
// [330]  Return Me 
return _B;
// End Sub
};

// [333] Sub SetKey(k As String) As VMPrism 
_B.setkey=function(_k) {
// [334]  k = k.tolowercase 
_k=_k.toLowerCase();
// [335]  SetAttrSingle( {62} , k) 
_B.setattrsingle(":key",_k,_B);
// [336]  Return Me 
return _B;
// End Sub
};

// [340] Sub SetRC(sRow As String, sCol As String) As VMPrism 
_B.setrc=function(_srow,_scol) {
// [341]  PrismComponent.SetRC(sRow, sCol) 
_B._prismcomponent.setrc(_srow,_scol);
// [342]  Return Me 
return _B;
// End Sub
};

// [346] Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMPrism 
_B.setdeviceoffsets=function(_os,_om,_ol,_ox) {
// [347]  PrismComponent.SetDeviceOffsets(OS, OM, OL, OX) 
_B._prismcomponent.setdeviceoffsets(_os,_om,_ol,_ox);
// [348]  Return Me 
return _B;
// End Sub
};

// [353] Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMPrism 
_B.setdevicepositions=function(_srow,_scell,_small,_medium,_large,_xlarge) {
// [354]  SetRC(srow, scell) 
_B.setrc(_srow,_scell,_B);
// [355]  SetDeviceSizes(small,medium, large, xlarge) 
_B.setdevicesizes(_small,_medium,_large,_xlarge,_B);
// [356]  Return Me 
return _B;
// End Sub
};

// [360] Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMPrism 
_B.setdevicesizes=function(_ss,_sm,_sl,_sx) {
// [361]  PrismComponent.SetDeviceSizes(SS, SM, SL, SX) 
_B._prismcomponent.setdevicesizes(_ss,_sm,_sl,_sx);
// [362]  Return Me 
return _B;
// End Sub
};

// [366] Sub AddComponent(comp As String) As VMPrism 
_B.addcomponent=function(_comp) {
// [367]  PrismComponent.SetText(comp) 
_B._prismcomponent.settext(_comp);
// [368]  Return Me 
return _B;
// End Sub
};

// [372] Sub SetTextCenter As VMPrism 
_B.settextcenter=function() {
// [373]  PrismComponent.AddClass( {63} ) 
_B._prismcomponent.addclass("text-center");
// [374]  Return Me 
return _B;
// End Sub
};

// [377] Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int) 
_B.addtocontainer=function(_pcont,_rowpos,_colpos) {
// [378]  pCont.AddComponent(rowPos, colPos, ToString) 
_pcont.addcomponent(_rowpos,_colpos,_B.tostring(_B));
// End Sub
};

// [382] Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMPrism 
_B.buildmodel=function(_mprops,_mstyles,_lclasses,_loose) {
// [383] PrismComponent.BuildModel(mprops, mstyles, lclasses, loose) 
_B._prismcomponent.buildmodel(_mprops,_mstyles,_lclasses,_loose);
// [384] Return Me 
return _B;
// End Sub
};

// [388] Sub SetVisible(b As Boolean) As VMPrism 
_B.setvisible=function(_b) {
// [389] PrismComponent.SetVisible(b) 
_B._prismcomponent.setvisible(_b);
// [390] Return Me 
return _B;
// End Sub
};

// [395] Sub SetTextColor(varColor As String) As VMPrism 
_B.settextcolor=function(_varcolor) {
var _scolor;
// [396]  Dim sColor As String = {9} 
_scolor="" + _varcolor + "--text";
// [397]  AddClass(sColor) 
_B.addclass(_scolor,_B);
// [398]  Return Me 
return _B;
// End Sub
};

// [402] Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMPrism 
_B.settextcolorintensity=function(_varcolor,_varintensity) {
var _scolor,_sintensity,_mcolor;
// [403]  Dim sColor As String = {10} 
_scolor="" + _varcolor + "--text";
// [404]  Dim sIntensity As String = {11} 
_sintensity="text--" + _varintensity + "";
// [405]  Dim mcolor As String = {12} 
_mcolor="" + _scolor + " " + _sintensity + "";
// [406]  AddClass(mcolor) 
_B.addclass(_mcolor,_B);
// [407]  Return Me 
return _B;
// End Sub
};

}
