package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmdatatable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmdatatable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmdatatable.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _datatable = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public String _primarykey = "";
public String _column_date = "";
public String _column_text = "";
public String _column_icon = "";
public String _column_checkbox = "";
public String _column_none = "";
public String _column_time = "";
public String _column_datetime = "";
public String _column_image = "";
public String _column_money = "";
public String _column_filesize = "";
public String _column_chip = "";
public String _column_edit = "";
public String _column_delete = "";
public String _column_action = "";
public String _column_switch = "";
public String _column_avatarimg = "";
public String _column_rating = "";
public String _column_progress_circular = "";
public String _column_progress_linear = "";
public String _column_save = "";
public String _column_cancel = "";
public String _align_center = "";
public String _align_right = "";
public String _align_left = "";
public anywheresoftware.b4a.objects.collections.Map _columnsm = null;
public anywheresoftware.b4a.objects.collections.List _filters = null;
public boolean _hasfilters = false;
public anywheresoftware.b4a.objects.collections.List _exclusions = null;
public String _headers = "";
public b4j.example.vmcard _vcard = null;
public String _title = "";
public String _search = "";
public String _items = "";
public boolean _bstatic = false;
public anywheresoftware.b4a.objects.collections.List _hdr = null;
public String _keyid = "";
public anywheresoftware.b4a.objects.collections.List _mastercolumns = null;
public b4j.example.vmcardtitle _cardtitle = null;
public boolean _hastotals = false;
public boolean _hasexternalpagination = false;
public String _totalvisible = "";
public String _selected = "";
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
public static class _datatablecolumn{
public boolean IsInitialized;
public String value;
public String text;
public String align;
public boolean sortable;
public boolean filterable;
public boolean divider;
public String className;
public String width;
public String filter;
public String sort;
public String TypeOf;
public String extra;
public String icon;
public boolean Disabled;
public String imgWidth;
public String imgHeight;
public String avatarSize;
public String iconSize;
public String iconColor;
public boolean ReadOnly;
public String progressColor;
public String progressRotate;
public String progressSize;
public String progressWidth;
public String progressHeight;
public boolean progressShowValue;
public String valueFormat;
public String bindTotals;
public boolean hasTotal;
public void Initialize() {
IsInitialized = true;
value = "";
text = "";
align = "";
sortable = false;
filterable = false;
divider = false;
className = "";
width = "";
filter = "";
sort = "";
TypeOf = "";
extra = "";
icon = "";
Disabled = false;
imgWidth = "";
imgHeight = "";
avatarSize = "";
iconSize = "";
iconColor = "";
ReadOnly = false;
progressColor = "";
progressRotate = "";
progressSize = "";
progressWidth = "";
progressHeight = "";
progressShowValue = false;
valueFormat = "";
bindTotals = "";
hasTotal = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _addaction(String _colfield,String _coltitle,String _colicon) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub AddAction(colField As String, colTitle As Stri";
 //BA.debugLineNum = 297;BA.debugLine="AddExclusion(colField)";
_addexclusion(_colfield);
 //BA.debugLineNum = 298;BA.debugLine="AddColumn(colField,colTitle)";
_addcolumn(_colfield,_coltitle);
 //BA.debugLineNum = 299;BA.debugLine="SetColumnFilterable(colField,False)";
_setcolumnfilterable(_colfield,__c.False);
 //BA.debugLineNum = 300;BA.debugLine="SetColumnType(colField, COLUMN_ACTION)";
_setcolumntype(_colfield,_column_action);
 //BA.debugLineNum = 301;BA.debugLine="SetColumnSortable(colField, False)";
_setcolumnsortable(_colfield,__c.False);
 //BA.debugLineNum = 302;BA.debugLine="SetColumnAlignment(colField, ALIGN_CENTER)";
_setcolumnalignment(_colfield,_align_center);
 //BA.debugLineNum = 303;BA.debugLine="SetColumnIcon(colField, colIcon)";
_setcolumnicon(_colfield,_colicon);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return "";
}
public String  _addavatarimg(String _colfield,String _coltitle) throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub AddAvatarImg(colField As String, colTitle As S";
 //BA.debugLineNum = 345;BA.debugLine="AddColumn(colField,colTitle)";
_addcolumn(_colfield,_coltitle);
 //BA.debugLineNum = 346;BA.debugLine="SetColumnType(colField, COLUMN_AVATARIMG)";
_setcolumntype(_colfield,_column_avatarimg);
 //BA.debugLineNum = 347;BA.debugLine="SetColumnFilterable(colField,False)";
_setcolumnfilterable(_colfield,__c.False);
 //BA.debugLineNum = 348;BA.debugLine="SetColumnSortable(colField, False)";
_setcolumnsortable(_colfield,__c.False);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _addbutton(b4j.example.vmbutton _btn) throws Exception{
 //BA.debugLineNum = 683;BA.debugLine="Sub AddButton(btn As VMButton) As VMDataTable";
 //BA.debugLineNum = 684;BA.debugLine="vcard.Title.SetText(btn.tostring)";
_vcard._title /*b4j.example.vmcardtitle*/ ._settext /*b4j.example.vmcardtitle*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 685;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 686;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _addbutton1(String _key,String _iconname,String _text,String _tooltip) throws Exception{
 //BA.debugLineNum = 688;BA.debugLine="Sub AddButton1(key As String, iconName As String,";
 //BA.debugLineNum = 689;BA.debugLine="vcard.Title.AddButton1(key, iconName, \"\", text, t";
_vcard._title /*b4j.example.vmcardtitle*/ ._addbutton1 /*b4j.example.vmcardtitle*/ (_key,_iconname,"",_text,_tooltip,"");
 //BA.debugLineNum = 690;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _addbuttonicon(String _key,String _iconname,String _iconcolor,String _tooltip) throws Exception{
 //BA.debugLineNum = 693;BA.debugLine="Sub AddButtonIcon(key As String, iconName As Strin";
 //BA.debugLineNum = 694;BA.debugLine="vcard.Title.AddIcon(key, iconName, iconColor, \"\",";
_vcard._title /*b4j.example.vmcardtitle*/ ._addicon /*b4j.example.vmcardtitle*/ (_key,_iconname,_iconcolor,"",_tooltip,"");
 //BA.debugLineNum = 695;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 696;BA.debugLine="End Sub";
return null;
}
public String  _addcancel(String _colfield,String _coltitle) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub AddCancel(colField As String, colTitle As Stri";
 //BA.debugLineNum = 255;BA.debugLine="AddExclusion(colField)";
_addexclusion(_colfield);
 //BA.debugLineNum = 256;BA.debugLine="AddColumn(colField,colTitle)";
_addcolumn(_colfield,_coltitle);
 //BA.debugLineNum = 257;BA.debugLine="SetColumnFilterable(colField,False)";
_setcolumnfilterable(_colfield,__c.False);
 //BA.debugLineNum = 258;BA.debugLine="SetColumnType(colField, COLUMN_CANCEL)";
_setcolumntype(_colfield,_column_cancel);
 //BA.debugLineNum = 259;BA.debugLine="SetColumnSortable(colField, False)";
_setcolumnsortable(_colfield,__c.False);
 //BA.debugLineNum = 260;BA.debugLine="SetColumnAlignment(colField, ALIGN_CENTER)";
_setcolumnalignment(_colfield,_align_center);
 //BA.debugLineNum = 261;BA.debugLine="SetColumnIcon(colField, \"mdi-cancel\")";
_setcolumnicon(_colfield,"mdi-cancel");
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 1471;BA.debugLine="Sub AddChild(child As VMElement) As VMDataTable";
 //BA.debugLineNum = 1472;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 1473;BA.debugLine="DataTable.SetText(childHTML)";
_datatable._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 1474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1475;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 1512;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 1513;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 1514;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 1516;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 1494;BA.debugLine="Sub AddClass(c As String) As VMDataTable";
 //BA.debugLineNum = 1495;BA.debugLine="DataTable.AddClass(c)";
_datatable._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 1496;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1497;BA.debugLine="End Sub";
return null;
}
public String  _addclone() throws Exception{
 //BA.debugLineNum = 427;BA.debugLine="Sub AddClone";
 //BA.debugLineNum = 428;BA.debugLine="AddIcon(\"clone\",\"Clone\",\"done_all\")";
_addicon("clone","Clone","done_all");
 //BA.debugLineNum = 429;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _addcolumn(String _colname,String _coltitle) throws Exception{
 //BA.debugLineNum = 735;BA.debugLine="Sub AddColumn(colName As String, colTitle As Strin";
 //BA.debugLineNum = 736;BA.debugLine="AddColumn1(colName, colTitle, COLUMN_TEXT, 0, Tru";
_addcolumn1(_colname,_coltitle,_column_text,(int) (0),__c.True,_align_left);
 //BA.debugLineNum = 737;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 738;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _addcolumn1(String _colname,String _coltitle,String _coltype,int _colwidth,boolean _colsortable,String _colalign) throws Exception{
b4j.example.vmdatatable._datatablecolumn _nf = null;
 //BA.debugLineNum = 892;BA.debugLine="Sub AddColumn1(colName As String, colTitle As Stri";
 //BA.debugLineNum = 893;BA.debugLine="masterColumns.Add(colName)";
_mastercolumns.Add((Object)(_colname));
 //BA.debugLineNum = 894;BA.debugLine="If hasFilters Then";
if (_hasfilters) { 
 //BA.debugLineNum = 895;BA.debugLine="If exclusions.IndexOf(colName) = -1 Then";
if (_exclusions.IndexOf((Object)(_colname))==-1) { 
 //BA.debugLineNum = 896;BA.debugLine="If filters.IndexOf(colName) = -1 Then Return Me";
if (_filters.IndexOf((Object)(_colname))==-1) { 
if (true) return (b4j.example.vmdatatable)(this);};
 };
 };
 //BA.debugLineNum = 900;BA.debugLine="Dim nf As DataTableColumn";
_nf = new b4j.example.vmdatatable._datatablecolumn();
 //BA.debugLineNum = 901;BA.debugLine="nf.Initialize";
_nf.Initialize();
 //BA.debugLineNum = 902;BA.debugLine="nf.text = colTitle";
_nf.text /*String*/  = _coltitle;
 //BA.debugLineNum = 903;BA.debugLine="nf.value = colName";
_nf.value /*String*/  = _colname;
 //BA.debugLineNum = 904;BA.debugLine="nf.align = colAlign";
_nf.align /*String*/  = _colalign;
 //BA.debugLineNum = 905;BA.debugLine="nf.sortable = colSortable";
_nf.sortable /*boolean*/  = _colsortable;
 //BA.debugLineNum = 906;BA.debugLine="nf.filterable = True  ' can search";
_nf.filterable /*boolean*/  = __c.True;
 //BA.debugLineNum = 907;BA.debugLine="nf.divider = False";
_nf.divider /*boolean*/  = __c.False;
 //BA.debugLineNum = 908;BA.debugLine="nf.className = Null";
_nf.className /*String*/  = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 909;BA.debugLine="nf.width = colWidth";
_nf.width /*String*/  = BA.NumberToString(_colwidth);
 //BA.debugLineNum = 910;BA.debugLine="nf.filter = Null";
_nf.filter /*String*/  = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 911;BA.debugLine="nf.sort = Null";
_nf.sort /*String*/  = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 912;BA.debugLine="nf.TypeOf = colType";
_nf.TypeOf /*String*/  = _coltype;
 //BA.debugLineNum = 913;BA.debugLine="nf.Disabled = False";
_nf.Disabled /*boolean*/  = __c.False;
 //BA.debugLineNum = 914;BA.debugLine="nf.valueFormat = \"\"";
_nf.valueFormat /*String*/  = "";
 //BA.debugLineNum = 915;BA.debugLine="nf.bindTotals = \"\"";
_nf.bindTotals /*String*/  = "";
 //BA.debugLineNum = 916;BA.debugLine="nf.hasTotal = False";
_nf.hasTotal /*boolean*/  = __c.False;
 //BA.debugLineNum = 918;BA.debugLine="columnsM.Put(colName, nf)";
_columnsm.Put((Object)(_colname),(Object)(_nf));
 //BA.debugLineNum = 919;BA.debugLine="SetColumnType(colName, colType)";
_setcolumntype(_colname,_coltype);
 //BA.debugLineNum = 920;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 921;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _addcolumns(anywheresoftware.b4a.objects.collections.Map _flds) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 741;BA.debugLine="Sub AddColumns(flds As Map) As VMDataTable";
 //BA.debugLineNum = 742;BA.debugLine="For Each k As String In flds.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _flds.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 743;BA.debugLine="Dim v As String = flds.Get(k)";
_v = BA.ObjectToString(_flds.Get((Object)(_k)));
 //BA.debugLineNum = 744;BA.debugLine="AddColumn(k, v)";
_addcolumn(_k,_v);
 }
};
 //BA.debugLineNum = 746;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 747;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _addcomponent(String _tcomp) throws Exception{
 //BA.debugLineNum = 1477;BA.debugLine="Sub AddComponent(tcomp As String) As VMDataTable";
 //BA.debugLineNum = 1478;BA.debugLine="SetText(tcomp)";
_settext((Object)(_tcomp));
 //BA.debugLineNum = 1479;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1480;BA.debugLine="End Sub";
return null;
}
public String  _adddelete(String _colfield,String _coltitle) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub AddDelete(colField As String, colTitle As Stri";
 //BA.debugLineNum = 277;BA.debugLine="AddExclusion(colField)";
_addexclusion(_colfield);
 //BA.debugLineNum = 278;BA.debugLine="AddColumn(colField,colTitle)";
_addcolumn(_colfield,_coltitle);
 //BA.debugLineNum = 279;BA.debugLine="SetColumnFilterable(colField,False)";
_setcolumnfilterable(_colfield,__c.False);
 //BA.debugLineNum = 280;BA.debugLine="SetColumnType(colField, COLUMN_DELETE)";
_setcolumntype(_colfield,_column_delete);
 //BA.debugLineNum = 281;BA.debugLine="SetColumnSortable(colField, False)";
_setcolumnsortable(_colfield,__c.False);
 //BA.debugLineNum = 282;BA.debugLine="SetColumnAlignment(colField, ALIGN_CENTER)";
_setcolumnalignment(_colfield,_align_center);
 //BA.debugLineNum = 283;BA.debugLine="SetColumnIcon(colField, \"mdi-delete\")";
_setcolumnicon(_colfield,"mdi-delete");
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public String  _adddivider() throws Exception{
 //BA.debugLineNum = 464;BA.debugLine="Sub AddDivider";
 //BA.debugLineNum = 465;BA.debugLine="AddToolBarDivider";
_addtoolbardivider();
 //BA.debugLineNum = 466;BA.debugLine="End Sub";
return "";
}
public String  _adddownload() throws Exception{
 //BA.debugLineNum = 403;BA.debugLine="Sub AddDownload";
 //BA.debugLineNum = 404;BA.debugLine="AddIcon(\"download\",\"Get\",\"attach_file\")";
_addicon("download","Get","attach_file");
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return "";
}
public String  _addedit(String _colfield,String _coltitle) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub AddEdit(colField As String, colTitle As String";
 //BA.debugLineNum = 267;BA.debugLine="AddExclusion(colField)";
_addexclusion(_colfield);
 //BA.debugLineNum = 268;BA.debugLine="AddColumn(colField,colTitle)";
_addcolumn(_colfield,_coltitle);
 //BA.debugLineNum = 269;BA.debugLine="SetColumnFilterable(colField,False)";
_setcolumnfilterable(_colfield,__c.False);
 //BA.debugLineNum = 270;BA.debugLine="SetColumnType(colField, COLUMN_EDIT)";
_setcolumntype(_colfield,_column_edit);
 //BA.debugLineNum = 271;BA.debugLine="SetColumnSortable(colField, False)";
_setcolumnsortable(_colfield,__c.False);
 //BA.debugLineNum = 272;BA.debugLine="SetColumnAlignment(colField, ALIGN_CENTER)";
_setcolumnalignment(_colfield,_align_center);
 //BA.debugLineNum = 273;BA.debugLine="SetColumnIcon(colField, \"mdi-pencil\")";
_setcolumnicon(_colfield,"mdi-pencil");
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return "";
}
public String  _addeditdialog(String _colname,boolean _blarge) throws Exception{
String _slarge = "";
String _temp = "";
 //BA.debugLineNum = 825;BA.debugLine="Sub AddEditDialog(colName As String, bLarge As Boo";
 //BA.debugLineNum = 826;BA.debugLine="Dim slarge As String = \"large\"";
_slarge = "large";
 //BA.debugLineNum = 827;BA.debugLine="If bLarge = False Then slarge = \"\"";
if (_blarge==__c.False) { 
_slarge = "";};
 //BA.debugLineNum = 828;BA.debugLine="Dim temp As String = $\"<template v-slot:item.${col";
_temp = ("<template v-slot:item."+__c.SmartStringFormatter("",(Object)(_colname))+"=\"props\">\n"+"<v-edit-dialog :return-value.sync=\"props.item."+__c.SmartStringFormatter("",(Object)(_colname))+"\" @save=\""+__c.SmartStringFormatter("",(Object)(_id))+"_saveitem(props.item)\" @cancel=\""+__c.SmartStringFormatter("",(Object)(_id))+"_cancelitem(props.item)\" \n"+"@open=\""+__c.SmartStringFormatter("",(Object)(_id))+"_openitem(props.item)\" @close=\""+__c.SmartStringFormatter("",(Object)(_id))+"_closeitem(props.item)\" "+__c.SmartStringFormatter("",(Object)(_slarge))+" lazy> {{ props.item."+__c.SmartStringFormatter("",(Object)(_colname))+" }}\n"+"<template v-slot:input> <v-text-field @change=\""+__c.SmartStringFormatter("",(Object)(_id))+"_saveitem(props.item)\" v-model=\"props.item."+__c.SmartStringFormatter("",(Object)(_colname))+"\" :label=\"props.header.text\" counter></v-text-field></template></v-edit-dialog>\n"+"</template>");
 //BA.debugLineNum = 833;BA.debugLine="AddComponent(temp)";
_addcomponent(_temp);
 //BA.debugLineNum = 834;BA.debugLine="End Sub";
return "";
}
public String  _addeditdialogautocomplete(String _colname,boolean _blarge,String _sourcetable,String _sourcefield,String _displayfield,boolean _returnobject) throws Exception{
String _changeevent = "";
b4j.example.vmselect _el = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
com.ab.banano.BANanoObject _cb = null;
String _scombo = "";
String _slarge = "";
String _temp = "";
 //BA.debugLineNum = 794;BA.debugLine="Sub AddEditDialogAutoComplete(colName As String, b";
 //BA.debugLineNum = 795;BA.debugLine="Dim changeEvent As String = $\"${ID}_${colName}_ch";
_changeevent = (""+__c.SmartStringFormatter("",(Object)(_id))+"_"+__c.SmartStringFormatter("",(Object)(_colname))+"_change");
 //BA.debugLineNum = 796;BA.debugLine="Dim el As VMSelect";
_el = new b4j.example.vmselect();
 //BA.debugLineNum = 797;BA.debugLine="el.Initialize(vue, $\"${ID}${colName}\"$, Module)";
_el._initialize /*b4j.example.vmselect*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+""+__c.SmartStringFormatter("",(Object)(_colname))+""),_module);
 //BA.debugLineNum = 798;BA.debugLine="If SubExists(Module, changeEvent) Then";
if (__c.SubExists(ba,_module,_changeevent)) { 
 //BA.debugLineNum = 799;BA.debugLine="el.SetOnChange(Module, $\"${ID}_${colName}_change";
_el._setonchange /*b4j.example.vmselect*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_"+__c.SmartStringFormatter("",(Object)(_colname))+"_change"));
 //BA.debugLineNum = 800;BA.debugLine="el.SetAttrSingle(\"@change\", $\"${changeEvent}(pro";
_el._setattrsingle /*b4j.example.vmselect*/ ("@change",(""+__c.SmartStringFormatter("",(Object)(_changeevent))+"(props)"));
 //BA.debugLineNum = 801;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 802;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_changeevent,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_item.getObject())}))));
 //BA.debugLineNum = 803;BA.debugLine="vue.SetCallBack(changeEvent, cb)";
_vue._setcallback /*String*/ (_changeevent,_cb);
 };
 //BA.debugLineNum = 805;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmselect*/ (_bstatic);
 //BA.debugLineNum = 806;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmselect*/ (_designmode);
 //BA.debugLineNum = 807;BA.debugLine="el.SetAutoComplete";
_el._setautocomplete /*b4j.example.vmselect*/ ();
 //BA.debugLineNum = 808;BA.debugLine="el.SetAttrSingle(\":label\", $\"props.header.text\"$)";
_el._setattrsingle /*b4j.example.vmselect*/ (":label",("props.header.text"));
 //BA.debugLineNum = 809;BA.debugLine="el.SetClearable(True)";
_el._setclearable /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 810;BA.debugLine="el.SetReturnObject(False)";
_el._setreturnobject /*b4j.example.vmselect*/ (__c.False);
 //BA.debugLineNum = 811;BA.debugLine="el.SetVModel($\"props.item.${colName}\"$)";
_el._setvmodel /*b4j.example.vmselect*/ (("props.item."+__c.SmartStringFormatter("",(Object)(_colname))+""));
 //BA.debugLineNum = 812;BA.debugLine="el.SetDataSource(sourceTable, sourceField, displa";
_el._setdatasource /*b4j.example.vmselect*/ (_sourcetable,_sourcefield,_displayfield,_returnobject);
 //BA.debugLineNum = 813;BA.debugLine="Dim scombo As String = el.tostring";
_scombo = _el._tostring /*String*/ ();
 //BA.debugLineNum = 815;BA.debugLine="Dim slarge As String = \"large\"";
_slarge = "large";
 //BA.debugLineNum = 816;BA.debugLine="If bLarge = False Then slarge = \"\"";
if (_blarge==__c.False) { 
_slarge = "";};
 //BA.debugLineNum = 817;BA.debugLine="Dim temp As String = $\"<template v-slot:item.${co";
_temp = ("<template v-slot:item."+__c.SmartStringFormatter("",(Object)(_colname))+"=\"props\">\n"+"<v-edit-dialog :return-value.sync=\"props.item."+__c.SmartStringFormatter("",(Object)(_colname))+"\" @save=\""+__c.SmartStringFormatter("",(Object)(_id))+"_saveitem(props.item)\" @cancel=\""+__c.SmartStringFormatter("",(Object)(_id))+"_cancelitem(props.item)\" @open=\""+__c.SmartStringFormatter("",(Object)(_id))+"_openitem(props.item)\" @close=\""+__c.SmartStringFormatter("",(Object)(_id))+"_closeitem(props.item)\" "+__c.SmartStringFormatter("",(Object)(_slarge))+" lazy> {{ props.item."+__c.SmartStringFormatter("",(Object)(_colname))+" }}\n"+"<template v-slot:input> "+__c.SmartStringFormatter("",(Object)(_scombo))+" </template>\n"+"</v-edit-dialog>\n"+"</template>");
 //BA.debugLineNum = 822;BA.debugLine="AddComponent(temp)";
_addcomponent(_temp);
 //BA.debugLineNum = 823;BA.debugLine="End Sub";
return "";
}
public String  _addeditdialogcombo(String _colname,boolean _blarge,String _sourcetable,String _sourcefield,String _displayfield,boolean _returnobject) throws Exception{
String _changeevent = "";
b4j.example.vmselect _el = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
com.ab.banano.BANanoObject _cb = null;
String _scombo = "";
String _slarge = "";
String _temp = "";
 //BA.debugLineNum = 763;BA.debugLine="Sub AddEditDialogCombo(colName As String, bLarge A";
 //BA.debugLineNum = 764;BA.debugLine="Dim changeEvent As String = $\"${ID}_${colName}_ch";
_changeevent = (""+__c.SmartStringFormatter("",(Object)(_id))+"_"+__c.SmartStringFormatter("",(Object)(_colname))+"_change");
 //BA.debugLineNum = 765;BA.debugLine="Dim el As VMSelect";
_el = new b4j.example.vmselect();
 //BA.debugLineNum = 766;BA.debugLine="el.Initialize(vue, $\"${ID}${colName}\"$, Module)";
_el._initialize /*b4j.example.vmselect*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+""+__c.SmartStringFormatter("",(Object)(_colname))+""),_module);
 //BA.debugLineNum = 767;BA.debugLine="If SubExists(Module, changeEvent) Then";
if (__c.SubExists(ba,_module,_changeevent)) { 
 //BA.debugLineNum = 768;BA.debugLine="el.SetOnChange(Module, $\"${ID}_${colName}_change";
_el._setonchange /*b4j.example.vmselect*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_"+__c.SmartStringFormatter("",(Object)(_colname))+"_change"));
 //BA.debugLineNum = 769;BA.debugLine="el.SetAttrSingle(\"@change\", $\"${changeEvent}(pro";
_el._setattrsingle /*b4j.example.vmselect*/ ("@change",(""+__c.SmartStringFormatter("",(Object)(_changeevent))+"(props.item)"));
 //BA.debugLineNum = 770;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 771;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_changeevent,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_item.getObject())}))));
 //BA.debugLineNum = 772;BA.debugLine="vue.SetCallBack(changeEvent, cb)";
_vue._setcallback /*String*/ (_changeevent,_cb);
 };
 //BA.debugLineNum = 774;BA.debugLine="el.SetStatic(bStatic)";
_el._setstatic /*b4j.example.vmselect*/ (_bstatic);
 //BA.debugLineNum = 775;BA.debugLine="el.SetDesignMode(DesignMode)";
_el._setdesignmode /*b4j.example.vmselect*/ (_designmode);
 //BA.debugLineNum = 776;BA.debugLine="el.SetAttrSingle(\":label\", \"props.header.text\")";
_el._setattrsingle /*b4j.example.vmselect*/ (":label","props.header.text");
 //BA.debugLineNum = 777;BA.debugLine="el.SetComboBox";
_el._setcombobox /*b4j.example.vmselect*/ ();
 //BA.debugLineNum = 778;BA.debugLine="el.SetClearable(True)";
_el._setclearable /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 779;BA.debugLine="el.SetReturnObject(False)";
_el._setreturnobject /*b4j.example.vmselect*/ (__c.False);
 //BA.debugLineNum = 780;BA.debugLine="el.SetVModel($\"props.item.${colName}\"$)";
_el._setvmodel /*b4j.example.vmselect*/ (("props.item."+__c.SmartStringFormatter("",(Object)(_colname))+""));
 //BA.debugLineNum = 781;BA.debugLine="el.SetDataSource(sourceTable, sourceField, displa";
_el._setdatasource /*b4j.example.vmselect*/ (_sourcetable,_sourcefield,_displayfield,_returnobject);
 //BA.debugLineNum = 782;BA.debugLine="Dim scombo As String = el.tostring";
_scombo = _el._tostring /*String*/ ();
 //BA.debugLineNum = 784;BA.debugLine="Dim slarge As String = \"large lazy\"";
_slarge = "large lazy";
 //BA.debugLineNum = 785;BA.debugLine="If bLarge = False Then slarge = \"\"";
if (_blarge==__c.False) { 
_slarge = "";};
 //BA.debugLineNum = 786;BA.debugLine="Dim temp As String = $\"<template v-slot:item.${co";
_temp = ("<template v-slot:item."+__c.SmartStringFormatter("",(Object)(_colname))+"=\"props\">\n"+"<v-edit-dialog :return-value.sync=\"props.item."+__c.SmartStringFormatter("",(Object)(_colname))+"\" @save=\""+__c.SmartStringFormatter("",(Object)(_id))+"_saveitem(props.item)\" @cancel=\""+__c.SmartStringFormatter("",(Object)(_id))+"_cancelitem(props.item)\" @open=\""+__c.SmartStringFormatter("",(Object)(_id))+"_openitem(props.item)\" @close=\""+__c.SmartStringFormatter("",(Object)(_id))+"_closeitem(props.item)\" "+__c.SmartStringFormatter("",(Object)(_slarge))+"> {{ props.item."+__c.SmartStringFormatter("",(Object)(_colname))+" }}\n"+"<template v-slot:input> "+__c.SmartStringFormatter("",(Object)(_scombo))+" </template>\n"+"</v-edit-dialog>\n"+"</template>");
 //BA.debugLineNum = 791;BA.debugLine="AddComponent(temp)";
_addcomponent(_temp);
 //BA.debugLineNum = 792;BA.debugLine="End Sub";
return "";
}
public String  _addeditdialogtextarea(String _colname,boolean _blarge) throws Exception{
String _slarge = "";
String _temp = "";
 //BA.debugLineNum = 836;BA.debugLine="Sub AddEditDialogTextArea(colName As String, bLarg";
 //BA.debugLineNum = 837;BA.debugLine="Dim slarge As String = \"large\"";
_slarge = "large";
 //BA.debugLineNum = 838;BA.debugLine="If bLarge = False Then slarge = \"\"";
if (_blarge==__c.False) { 
_slarge = "";};
 //BA.debugLineNum = 839;BA.debugLine="Dim temp As String = $\"<template v-slot:item.${col";
_temp = ("<template v-slot:item."+__c.SmartStringFormatter("",(Object)(_colname))+"=\"props\">\n"+"<v-edit-dialog :return-value.sync=\"props.item."+__c.SmartStringFormatter("",(Object)(_colname))+"\" @save=\""+__c.SmartStringFormatter("",(Object)(_id))+"_saveitem(props.item)\" @cancel=\""+__c.SmartStringFormatter("",(Object)(_id))+"_cancelitem(props.item)\" @open=\""+__c.SmartStringFormatter("",(Object)(_id))+"_openitem(props.item)\" @close=\""+__c.SmartStringFormatter("",(Object)(_id))+"_closeitem(props.item)\" "+__c.SmartStringFormatter("",(Object)(_slarge))+" lazy> {{ props.item."+__c.SmartStringFormatter("",(Object)(_colname))+" }}\n"+"<template v-slot:input> <v-textarea v-model=\"props.item."+__c.SmartStringFormatter("",(Object)(_colname))+"\" :label=\"props.header.text\" counter></v-textarea></template>\n"+"</v-edit-dialog>\n"+"</template>");
 //BA.debugLineNum = 844;BA.debugLine="AddComponent(temp)";
_addcomponent(_temp);
 //BA.debugLineNum = 845;BA.debugLine="End Sub";
return "";
}
public String  _addeditthrash() throws Exception{
 //BA.debugLineNum = 367;BA.debugLine="Sub AddEditThrash";
 //BA.debugLineNum = 368;BA.debugLine="AddAction(\"edit\", \"Edit\", \"mdi-pencil\")";
_addaction("edit","Edit","mdi-pencil");
 //BA.debugLineNum = 369;BA.debugLine="AddAction(\"delete\", \"Delete\", \"mdi-delete\")";
_addaction("delete","Delete","mdi-delete");
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _addexclusion(String _colkey) throws Exception{
 //BA.debugLineNum = 723;BA.debugLine="Sub AddExclusion(colKey As String) As VMDataTable";
 //BA.debugLineNum = 724;BA.debugLine="exclusions.Add(colKey)";
_exclusions.Add((Object)(_colkey));
 //BA.debugLineNum = 725;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 726;BA.debugLine="End Sub";
return null;
}
public String  _addexpandcolumn() throws Exception{
 //BA.debugLineNum = 886;BA.debugLine="Sub AddExpandColumn";
 //BA.debugLineNum = 887;BA.debugLine="AddColumn(\"data-table-expand\", \"\")";
_addcolumn("data-table-expand","");
 //BA.debugLineNum = 888;BA.debugLine="End Sub";
return "";
}
public String  _addexpandslot(boolean _bsingleexpand,b4j.example.vmcontainer _cont) throws Exception{
b4j.example.vmtemplate _expandslot = null;
 //BA.debugLineNum = 750;BA.debugLine="Sub AddExpandSlot(bSingleExpand As Boolean, cont A";
 //BA.debugLineNum = 751;BA.debugLine="AddExpandColumn";
_addexpandcolumn();
 //BA.debugLineNum = 752;BA.debugLine="SetSingleExpand(bSingleExpand)";
_setsingleexpand(_bsingleexpand);
 //BA.debugLineNum = 753;BA.debugLine="SetExpanded(vue.newlist)";
_setexpanded(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 754;BA.debugLine="SetShowExpand(True)";
_setshowexpand(__c.True);
 //BA.debugLineNum = 756;BA.debugLine="Dim expandSlot As VMTemplate";
_expandslot = new b4j.example.vmtemplate();
 //BA.debugLineNum = 757;BA.debugLine="expandSlot.Initialize(vue, $\"${ID}expand\"$, Modul";
_expandslot._initialize /*b4j.example.vmtemplate*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"expand"),_module);
 //BA.debugLineNum = 758;BA.debugLine="expandSlot.SetAttrSingle(\"v-slot:expanded-item\",";
_expandslot._setattrsingle /*b4j.example.vmtemplate*/ ("v-slot:expanded-item","{ headers, item }");
 //BA.debugLineNum = 759;BA.debugLine="If cont <> Null Then expandSlot.SetText(cont.tost";
if (_cont!= null) { 
_expandslot._settext /*b4j.example.vmtemplate*/ (_cont._tostring /*String*/ ());};
 //BA.debugLineNum = 760;BA.debugLine="AddComponent(expandSlot.tostring)";
_addcomponent(_expandslot._tostring /*String*/ ());
 //BA.debugLineNum = 761;BA.debugLine="End Sub";
return "";
}
public String  _addicon(String _colfield,String _coltitle,String _colicon) throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub AddIcon(colField As String, colTitle As String";
 //BA.debugLineNum = 287;BA.debugLine="AddExclusion(colField)";
_addexclusion(_colfield);
 //BA.debugLineNum = 288;BA.debugLine="AddColumn(colField,colTitle)";
_addcolumn(_colfield,_coltitle);
 //BA.debugLineNum = 289;BA.debugLine="SetColumnFilterable(colField,False)";
_setcolumnfilterable(_colfield,__c.False);
 //BA.debugLineNum = 290;BA.debugLine="SetColumnType(colField, COLUMN_ACTION)";
_setcolumntype(_colfield,_column_action);
 //BA.debugLineNum = 291;BA.debugLine="SetColumnSortable(colField, False)";
_setcolumnsortable(_colfield,__c.False);
 //BA.debugLineNum = 292;BA.debugLine="SetColumnAlignment(colField, ALIGN_CENTER)";
_setcolumnalignment(_colfield,_align_center);
 //BA.debugLineNum = 293;BA.debugLine="SetColumnIcon(colField, colIcon)";
_setcolumnicon(_colfield,_colicon);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return "";
}
public String  _addiconview(String _colfield,String _coltitle) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub AddIconView(colField As String, colTitle As St";
 //BA.debugLineNum = 307;BA.debugLine="AddColumn(colField,colTitle)";
_addcolumn(_colfield,_coltitle);
 //BA.debugLineNum = 308;BA.debugLine="SetColumnType(colField, COLUMN_ICON)";
_setcolumntype(_colfield,_column_icon);
 //BA.debugLineNum = 309;BA.debugLine="SetColumnFilterable(colField,False)";
_setcolumnfilterable(_colfield,__c.False);
 //BA.debugLineNum = 310;BA.debugLine="SetColumnSortable(colField, False)";
_setcolumnsortable(_colfield,__c.False);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return "";
}
public String  _addimage(String _colfield,String _coltitle) throws Exception{
 //BA.debugLineNum = 336;BA.debugLine="Sub AddImage(colField As String, colTitle As Strin";
 //BA.debugLineNum = 337;BA.debugLine="AddColumn(colField,colTitle)";
_addcolumn(_colfield,_coltitle);
 //BA.debugLineNum = 338;BA.debugLine="SetColumnType(colField, COLUMN_IMAGE)";
_setcolumntype(_colfield,_column_image);
 //BA.debugLineNum = 339;BA.debugLine="SetColumnFilterable(colField,False)";
_setcolumnfilterable(_colfield,__c.False);
 //BA.debugLineNum = 340;BA.debugLine="SetColumnSortable(colField, False)";
_setcolumnsortable(_colfield,__c.False);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _addmenu(b4j.example.vmmenu _menu) throws Exception{
 //BA.debugLineNum = 698;BA.debugLine="Sub AddMenu(menu As VMMenu) As VMDataTable";
 //BA.debugLineNum = 699;BA.debugLine="vcard.Title.SetText(menu.ToString)";
_vcard._title /*b4j.example.vmcardtitle*/ ._settext /*b4j.example.vmcardtitle*/ (_menu._tostring /*String*/ ());
 //BA.debugLineNum = 700;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 701;BA.debugLine="End Sub";
return null;
}
public String  _addmenuh() throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Sub AddMenuH";
 //BA.debugLineNum = 408;BA.debugLine="AddIcon(\"menu\",\"Menu\",\"more_horiz\")";
_addicon("menu","Menu","more_horiz");
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return "";
}
public String  _addmenuv() throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub AddMenuV";
 //BA.debugLineNum = 418;BA.debugLine="AddIcon(\"menu\",\"Menu\",\"more_vert\")";
_addicon("menu","Menu","more_vert");
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _addnew(String _key,String _iconname,String _tooltip) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 643;BA.debugLine="Sub AddNew(key As String, iconName As String, tool";
 //BA.debugLineNum = 644;BA.debugLine="key = key.tolowercase";
_key = _key.toLowerCase();
 //BA.debugLineNum = 645;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 646;BA.debugLine="btn.Initialize(vue, key, Module).SetStatic(bStati";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_key,_module)._setstatic /*b4j.example.vmbutton*/ (_bstatic)._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 647;BA.debugLine="btn.SetFabButton(iconName).SetTooltip(toolTip).Se";
_btn._setfabbutton /*b4j.example.vmbutton*/ (_iconname)._settooltip /*b4j.example.vmbutton*/ (_tooltip)._setprimary /*b4j.example.vmbutton*/ (__c.True)._addclass /*b4j.example.vmbutton*/ ("mb-2");
 //BA.debugLineNum = 648;BA.debugLine="vcard.Title.SetText(btn.ToString)";
_vcard._title /*b4j.example.vmcardtitle*/ ._settext /*b4j.example.vmcardtitle*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 649;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 650;BA.debugLine="End Sub";
return null;
}
public String  _addprint() throws Exception{
 //BA.debugLineNum = 437;BA.debugLine="Sub AddPrint";
 //BA.debugLineNum = 438;BA.debugLine="AddIcon(\"print\", \"Print\", \"print\")";
_addicon("print","Print","print");
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return "";
}
public String  _addprogresscircular(String _colfield,String _coltitle) throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Sub AddProgressCircular(colField As String, colTit";
 //BA.debugLineNum = 357;BA.debugLine="AddColumn(colField,colTitle)";
_addcolumn(_colfield,_coltitle);
 //BA.debugLineNum = 358;BA.debugLine="SetColumnType(colField, COLUMN_PROGRESS_CIRCULAR)";
_setcolumntype(_colfield,_column_progress_circular);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return "";
}
public String  _addprogresslinear(String _colfield,String _coltitle) throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Sub AddProgressLinear(colField As String, colTitle";
 //BA.debugLineNum = 362;BA.debugLine="AddColumn(colField,colTitle)";
_addcolumn(_colfield,_coltitle);
 //BA.debugLineNum = 363;BA.debugLine="SetColumnType(colField, COLUMN_PROGRESS_LINEAR)";
_setcolumntype(_colfield,_column_progress_linear);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return "";
}
public String  _addrating(String _colfield,String _coltitle) throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Sub AddRating(colField As String, colTitle As Stri";
 //BA.debugLineNum = 352;BA.debugLine="AddColumn(colField,colTitle)";
_addcolumn(_colfield,_coltitle);
 //BA.debugLineNum = 353;BA.debugLine="SetColumnType(colField, COLUMN_RATING)";
_setcolumntype(_colfield,_column_rating);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return "";
}
public String  _addsave(String _colfield,String _coltitle) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub AddSave(colField As String, colTitle As String";
 //BA.debugLineNum = 244;BA.debugLine="AddExclusion(colField)";
_addexclusion(_colfield);
 //BA.debugLineNum = 245;BA.debugLine="AddColumn(colField,colTitle)";
_addcolumn(_colfield,_coltitle);
 //BA.debugLineNum = 246;BA.debugLine="SetColumnFilterable(colField,False)";
_setcolumnfilterable(_colfield,__c.False);
 //BA.debugLineNum = 247;BA.debugLine="SetColumnType(colField, COLUMN_SAVE)";
_setcolumntype(_colfield,_column_save);
 //BA.debugLineNum = 248;BA.debugLine="SetColumnSortable(colField, False)";
_setcolumnsortable(_colfield,__c.False);
 //BA.debugLineNum = 249;BA.debugLine="SetColumnAlignment(colField, ALIGN_CENTER)";
_setcolumnalignment(_colfield,_align_center);
 //BA.debugLineNum = 250;BA.debugLine="SetColumnIcon(colField, \"mdi-content-save\")";
_setcolumnicon(_colfield,"mdi-content-save");
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public String  _addsavecancelopenclose() throws Exception{
String _savemethodname = "";
anywheresoftware.b4a.objects.collections.Map _item = null;
com.ab.banano.BANanoObject _cb = null;
String _cancelmethodname = "";
String _openmethodname = "";
String _closemethodname = "";
 //BA.debugLineNum = 848;BA.debugLine="Sub AddSaveCancelOpenClose";
 //BA.debugLineNum = 849;BA.debugLine="Dim savemethodName As String = $\"${ID}_saveitem\"$";
_savemethodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_saveitem");
 //BA.debugLineNum = 850;BA.debugLine="If SubExists(Module, savemethodName) = False Then";
if (__c.SubExists(ba,_module,_savemethodname)==__c.False) { 
 //BA.debugLineNum = 851;BA.debugLine="Log($\"VMDataTable: Please add '${ID}_saveitem(it";
__c.Log(("VMDataTable: Please add '"+__c.SmartStringFormatter("",(Object)(_id))+"_saveitem(item As Map)' callback."));
 //BA.debugLineNum = 852;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 854;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 855;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_savemethodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_item.getObject())}))));
 //BA.debugLineNum = 856;BA.debugLine="vue.SetCallBack(savemethodName, cb)";
_vue._setcallback /*String*/ (_savemethodname,_cb);
 //BA.debugLineNum = 858;BA.debugLine="Dim cancelmethodName As String = $\"${ID}_cancelit";
_cancelmethodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_cancelitem");
 //BA.debugLineNum = 859;BA.debugLine="If SubExists(Module, cancelmethodName) = False Th";
if (__c.SubExists(ba,_module,_cancelmethodname)==__c.False) { 
 //BA.debugLineNum = 860;BA.debugLine="Log($\"VMDataTable: Please add '${ID}_cancelitem(";
__c.Log(("VMDataTable: Please add '"+__c.SmartStringFormatter("",(Object)(_id))+"_cancelitem(item As Map)' callback."));
 //BA.debugLineNum = 861;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 863;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 864;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_cancelmethodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_item.getObject())}))));
 //BA.debugLineNum = 865;BA.debugLine="vue.SetCallBack(cancelmethodName, cb)";
_vue._setcallback /*String*/ (_cancelmethodname,_cb);
 //BA.debugLineNum = 867;BA.debugLine="Dim openmethodName As String = $\"${ID}_openitem\"$";
_openmethodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_openitem");
 //BA.debugLineNum = 868;BA.debugLine="If SubExists(Module, openmethodName) = False Then";
if (__c.SubExists(ba,_module,_openmethodname)==__c.False) { 
 //BA.debugLineNum = 869;BA.debugLine="Log($\"VMDataTable: Please add '${ID}_openitem(it";
__c.Log(("VMDataTable: Please add '"+__c.SmartStringFormatter("",(Object)(_id))+"_openitem(item As Map)' callback."));
 //BA.debugLineNum = 870;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 872;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 873;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_openmethodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_item.getObject())}))));
 //BA.debugLineNum = 874;BA.debugLine="vue.SetCallBack(openmethodName, cb)";
_vue._setcallback /*String*/ (_openmethodname,_cb);
 //BA.debugLineNum = 876;BA.debugLine="Dim closemethodName As String = $\"${ID}_closeitem";
_closemethodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_closeitem");
 //BA.debugLineNum = 877;BA.debugLine="If SubExists(Module, closemethodName) = False The";
if (__c.SubExists(ba,_module,_closemethodname)==__c.False) { 
 //BA.debugLineNum = 878;BA.debugLine="Log($\"VMDataTable: Please add '${ID}_closeitem(i";
__c.Log(("VMDataTable: Please add '"+__c.SmartStringFormatter("",(Object)(_id))+"_closeitem(item As Map)' callback."));
 //BA.debugLineNum = 879;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 881;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 882;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_closemethodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_item.getObject())}))));
 //BA.debugLineNum = 883;BA.debugLine="vue.SetCallBack(closemethodName, cb)";
_vue._setcallback /*String*/ (_closemethodname,_cb);
 //BA.debugLineNum = 884;BA.debugLine="End Sub";
return "";
}
public String  _addsearch() throws Exception{
 //BA.debugLineNum = 453;BA.debugLine="Sub AddSearch";
 //BA.debugLineNum = 454;BA.debugLine="DataTable.Bind(\":search\", search)";
_datatable._bind /*b4j.example.vmelement*/ (":search",_search);
 //BA.debugLineNum = 455;BA.debugLine="vcard.Title.AddSearch(search)";
_vcard._title /*b4j.example.vmcardtitle*/ ._addsearch /*b4j.example.vmcardtitle*/ (_search);
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
return "";
}
public String  _addspacer() throws Exception{
 //BA.debugLineNum = 468;BA.debugLine="Sub AddSpacer";
 //BA.debugLineNum = 469;BA.debugLine="AddToolBarSpacer";
_addtoolbarspacer();
 //BA.debugLineNum = 470;BA.debugLine="End Sub";
return "";
}
public String  _addswitch(String _colfield,String _coltitle) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub AddSwitch(colField As String, colTitle As Stri";
 //BA.debugLineNum = 314;BA.debugLine="AddColumn(colField,colTitle)";
_addcolumn(_colfield,_coltitle);
 //BA.debugLineNum = 315;BA.debugLine="SetColumnType(colField, COLUMN_SWITCH)";
_setcolumntype(_colfield,_column_switch);
 //BA.debugLineNum = 316;BA.debugLine="SetColumnFilterable(colField,False)";
_setcolumnfilterable(_colfield,__c.False);
 //BA.debugLineNum = 317;BA.debugLine="SetColumnSortable(colField, False)";
_setcolumnsortable(_colfield,__c.False);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 2494;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 2495;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 2496;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _addtoolbardivider() throws Exception{
 //BA.debugLineNum = 473;BA.debugLine="Sub AddToolBarDivider As VMDataTable";
 //BA.debugLineNum = 474;BA.debugLine="vcard.Title.AddDivider(True, Null, Null, Array(\"m";
_vcard._title /*b4j.example.vmcardtitle*/ ._adddivider /*b4j.example.vmcardtitle*/ (__c.True,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__c.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__c.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("mx-2")}),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 475;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 476;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _addtoolbarspacer() throws Exception{
 //BA.debugLineNum = 459;BA.debugLine="Sub AddToolBarSpacer As VMDataTable";
 //BA.debugLineNum = 460;BA.debugLine="vcard.Title.AddSpacer";
_vcard._title /*b4j.example.vmcardtitle*/ ._addspacer /*b4j.example.vmcardtitle*/ ();
 //BA.debugLineNum = 461;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return null;
}
public String  _applyfilter(anywheresoftware.b4a.objects.collections.List _thisfilter) throws Exception{
anywheresoftware.b4a.objects.collections.List _cols = null;
anywheresoftware.b4a.objects.collections.Map _tk = null;
String _colx = "";
anywheresoftware.b4a.objects.collections.List _ds = null;
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _mc = "";
b4j.example.vmdatatable._datatablecolumn _nf = null;
String _ctext = "";
anywheresoftware.b4a.objects.collections.Map _nc = null;
 //BA.debugLineNum = 147;BA.debugLine="Sub ApplyFilter(thisFilter As List)";
 //BA.debugLineNum = 150;BA.debugLine="Dim cols As List = vue.newlist";
_cols = new anywheresoftware.b4a.objects.collections.List();
_cols = _vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 151;BA.debugLine="Dim tk As Map = CreateMap()";
_tk = new anywheresoftware.b4a.objects.collections.Map();
_tk = __c.createMap(new Object[] {});
 //BA.debugLineNum = 152;BA.debugLine="For Each colx As String In thisFilter";
{
final anywheresoftware.b4a.BA.IterableList group3 = _thisfilter;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_colx = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 153;BA.debugLine="tk.Put(colx, colx)";
_tk.Put((Object)(_colx),(Object)(_colx));
 }
};
 //BA.debugLineNum = 155;BA.debugLine="Dim ds As List = vue.NewList";
_ds = new anywheresoftware.b4a.objects.collections.List();
_ds = _vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 158;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 160;BA.debugLine="For Each mc As String In masterColumns";
{
final anywheresoftware.b4a.BA.IterableList group8 = _mastercolumns;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_mc = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 162;BA.debugLine="If tk.ContainsKey(mc) Then";
if (_tk.ContainsKey((Object)(_mc))) { 
 //BA.debugLineNum = 163;BA.debugLine="Dim nf As DataTableColumn = columnsM.Get(mc)";
_nf = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_mc)));
 //BA.debugLineNum = 164;BA.debugLine="nm.Put(mc, nf)";
_nm.Put((Object)(_mc),(Object)(_nf));
 //BA.debugLineNum = 165;BA.debugLine="cols.Add(mc)";
_cols.Add((Object)(_mc));
 //BA.debugLineNum = 167;BA.debugLine="Dim ctext As String = nf.text";
_ctext = _nf.text /*String*/ ;
 //BA.debugLineNum = 168;BA.debugLine="Dim nc As Map = CreateMap()";
_nc = new anywheresoftware.b4a.objects.collections.Map();
_nc = __c.createMap(new Object[] {});
 //BA.debugLineNum = 169;BA.debugLine="nc.Put(\"id\", mc)";
_nc.Put((Object)("id"),(Object)(_mc));
 //BA.debugLineNum = 170;BA.debugLine="nc.Put(\"text\", ctext)";
_nc.Put((Object)("text"),(Object)(_ctext));
 //BA.debugLineNum = 171;BA.debugLine="ds.Add(nc)";
_ds.Add((Object)(_nc.getObject()));
 };
 }
};
 //BA.debugLineNum = 174;BA.debugLine="BuildHeaders(nm)";
_buildheaders(_nm);
 //BA.debugLineNum = 175;BA.debugLine="vue.SetData($\"${ID}columns\"$, cols)";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"columns"),(Object)(_cols.getObject()));
 //BA.debugLineNum = 177;BA.debugLine="vue.SetData($\"${ID}fsource\"$, ds)";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"fsource"),(Object)(_ds.getObject()));
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _bananoreplace() throws Exception{
String _x = "";
 //BA.debugLineNum = 137;BA.debugLine="Sub BANanoReplace";
 //BA.debugLineNum = 138;BA.debugLine="Dim x As String = ToString";
_x = _tostring();
 //BA.debugLineNum = 139;BA.debugLine="BANano.GetElement($\"#${ID}card\"$).RenderReplace(x";
_banano.GetElement(("#"+__c.SmartStringFormatter("",(Object)(_id))+"card")).RenderReplace(_x,"");
 //BA.debugLineNum = 140;BA.debugLine="Refresh";
_refresh();
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 2387;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 2388;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 2389;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 2390;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2391;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 2471;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 2472;BA.debugLine="DataTable.BindStyleSingle(prop, value)";
_datatable._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 2473;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2474;BA.debugLine="End Sub";
return null;
}
public String  _buildcontrols() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbtotals = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _k = "";
b4j.example.vmdatatable._datatablecolumn _nf = null;
String _ct = "";
String _value = "";
String _methodname = "";
String _bindtotals = "";
String _df = "";
b4j.example.vmtemplate _tmp = null;
b4j.example.vmelement _span = null;
String _sline = "";
b4j.example.vmprogresslinear _pl = null;
b4j.example.vmelement _tmpx = null;
b4j.example.vmprogresscircular _pc = null;
b4j.example.vmrating _rat = null;
b4j.example.vmavatar _avt = null;
b4j.example.vmimage _avtimg = null;
b4j.example.vmcheckbox _swt = null;
b4j.example.vmicon _aicon = null;
b4j.example.vmchip _chp = null;
b4j.example.vmtemplate _tmpa = null;
b4j.example.vmbutton _abtn = null;
 //BA.debugLineNum = 1151;BA.debugLine="private Sub BuildControls";
 //BA.debugLineNum = 1152;BA.debugLine="Dim sbTotals As StringBuilder";
_sbtotals = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1153;BA.debugLine="sbTotals.Initialize";
_sbtotals.Initialize();
 //BA.debugLineNum = 1154;BA.debugLine="If hasTotals Then";
if (_hastotals) { 
 //BA.debugLineNum = 1156;BA.debugLine="sbTotals.Append($\"<template slot=\"body.append\">\"";
_sbtotals.Append(("<template slot=\"body.append\">"));
 //BA.debugLineNum = 1157;BA.debugLine="sbTotals.Append($\"<tr>\"$)";
_sbtotals.Append(("<tr>"));
 //BA.debugLineNum = 1158;BA.debugLine="sbTotals.Append($\"<th class=\"title\">Totals</th>\"";
_sbtotals.Append(("<th class=\"title\">Totals</th>"));
 };
 //BA.debugLineNum = 1161;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1162;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1163;BA.debugLine="For Each k As String In columnsM.Keys";
{
final anywheresoftware.b4a.BA.IterableList group10 = _columnsm.Keys();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_k = BA.ObjectToString(group10.Get(index10));
 //BA.debugLineNum = 1164;BA.debugLine="Dim nf As DataTableColumn = columnsM.Get(k)";
_nf = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_k)));
 //BA.debugLineNum = 1166;BA.debugLine="Dim ct As String = nf.TypeOf";
_ct = _nf.TypeOf /*String*/ ;
 //BA.debugLineNum = 1168;BA.debugLine="Dim value As String = nf.value";
_value = _nf.value /*String*/ ;
 //BA.debugLineNum = 1169;BA.debugLine="Dim methodName As String = $\"${ID}_${value}\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_"+__c.SmartStringFormatter("",(Object)(_value))+"");
 //BA.debugLineNum = 1171;BA.debugLine="If hasTotals Then";
if (_hastotals) { 
 //BA.debugLineNum = 1172;BA.debugLine="Dim bindTotals As String = nf.bindTotals";
_bindtotals = _nf.bindTotals /*String*/ ;
 //BA.debugLineNum = 1173;BA.debugLine="Select Case bindTotals";
switch (BA.switchObjectToInt(_bindtotals,"")) {
case 0: {
 //BA.debugLineNum = 1175;BA.debugLine="sbTotals.Append($\"<th class=\"title\"></th>\"$)";
_sbtotals.Append(("<th class=\"title\"></th>"));
 break; }
default: {
 //BA.debugLineNum = 1177;BA.debugLine="sbTotals.Append($\"<th class=\"title\">{{ ${bindT";
_sbtotals.Append(("<th class=\"title\">{{ "+__c.SmartStringFormatter("",(Object)(_bindtotals))+" }}</th>"));
 break; }
}
;
 };
 //BA.debugLineNum = 1181;BA.debugLine="Select Case ct";
switch (BA.switchObjectToInt(_ct,_column_date,_column_datetime,_column_time,_column_money,_column_filesize,_column_progress_linear,_column_progress_circular,_column_rating,_column_avatarimg,_column_switch,_column_checkbox,_column_icon,_column_image,_column_chip,_column_action,_column_edit,_column_delete,_column_save,_column_cancel)) {
case 0: 
case 1: 
case 2: {
 //BA.debugLineNum = 1184;BA.debugLine="Dim df As String = nf.valueFormat";
_df = _nf.valueFormat /*String*/ ;
 //BA.debugLineNum = 1186;BA.debugLine="Dim tmp As VMTemplate";
_tmp = new b4j.example.vmtemplate();
 //BA.debugLineNum = 1187;BA.debugLine="tmp.Initialize(vue, \"\" , Module).SetStatic(bSta";
_tmp._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmtemplate*/ (_bstatic)._setdesignmode /*b4j.example.vmtemplate*/ (_designmode);
 //BA.debugLineNum = 1188;BA.debugLine="tmp.SetAttrSingle($\"#item.${value}\"$, \"{item}\")";
_tmp._setattrsingle /*b4j.example.vmtemplate*/ (("#item."+__c.SmartStringFormatter("",(Object)(_value))+""),"{item}");
 //BA.debugLineNum = 1190;BA.debugLine="Dim span As VMElement";
_span = new b4j.example.vmelement();
 //BA.debugLineNum = 1191;BA.debugLine="span.Initialize(vue,\"\")";
_span._initialize /*b4j.example.vmelement*/ (ba,_vue,"");
 //BA.debugLineNum = 1192;BA.debugLine="span.SetTag(\"span\")";
_span._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 1193;BA.debugLine="span.SetText($\"{{ getdateformat(item.${value},";
_span._settext /*b4j.example.vmelement*/ (("{{ getdateformat(item."+__c.SmartStringFormatter("",(Object)(_value))+", \""+__c.SmartStringFormatter("",(Object)(_df))+"\") }}"));
 //BA.debugLineNum = 1194;BA.debugLine="tmp.AddComponent(span.ToString)";
_tmp._addcomponent /*b4j.example.vmtemplate*/ (_span._tostring /*String*/ ());
 //BA.debugLineNum = 1195;BA.debugLine="sb.Append(tmp.ToString)";
_sb.Append(_tmp._tostring /*String*/ ());
 break; }
case 3: {
 //BA.debugLineNum = 1197;BA.debugLine="Dim tmp As VMTemplate";
_tmp = new b4j.example.vmtemplate();
 //BA.debugLineNum = 1198;BA.debugLine="tmp.Initialize(vue, \"\" , Module).SetStatic(bSta";
_tmp._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmtemplate*/ (_bstatic)._setdesignmode /*b4j.example.vmtemplate*/ (_designmode);
 //BA.debugLineNum = 1199;BA.debugLine="tmp.SetAttrSingle($\"#item.${value}\"$, \"{item}\")";
_tmp._setattrsingle /*b4j.example.vmtemplate*/ (("#item."+__c.SmartStringFormatter("",(Object)(_value))+""),"{item}");
 //BA.debugLineNum = 1201;BA.debugLine="Dim span As VMElement";
_span = new b4j.example.vmelement();
 //BA.debugLineNum = 1202;BA.debugLine="span.Initialize(vue,\"\")";
_span._initialize /*b4j.example.vmelement*/ (ba,_vue,"");
 //BA.debugLineNum = 1203;BA.debugLine="span.SetTag(\"span\")";
_span._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 1204;BA.debugLine="span.SetText($\"{{ getmoneyformat(item.${value})";
_span._settext /*b4j.example.vmelement*/ (("{{ getmoneyformat(item."+__c.SmartStringFormatter("",(Object)(_value))+") }}"));
 //BA.debugLineNum = 1205;BA.debugLine="tmp.AddComponent(span.ToString)";
_tmp._addcomponent /*b4j.example.vmtemplate*/ (_span._tostring /*String*/ ());
 //BA.debugLineNum = 1206;BA.debugLine="sb.Append(tmp.ToString)";
_sb.Append(_tmp._tostring /*String*/ ());
 break; }
case 4: {
 //BA.debugLineNum = 1208;BA.debugLine="Dim tmp As VMTemplate";
_tmp = new b4j.example.vmtemplate();
 //BA.debugLineNum = 1209;BA.debugLine="tmp.Initialize(vue, \"\" , Module).SetStatic(bSta";
_tmp._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmtemplate*/ (_bstatic)._setdesignmode /*b4j.example.vmtemplate*/ (_designmode);
 //BA.debugLineNum = 1210;BA.debugLine="tmp.SetAttrSingle($\"#item.${value}\"$, \"{item}\")";
_tmp._setattrsingle /*b4j.example.vmtemplate*/ (("#item."+__c.SmartStringFormatter("",(Object)(_value))+""),"{item}");
 //BA.debugLineNum = 1212;BA.debugLine="Dim span As VMElement";
_span = new b4j.example.vmelement();
 //BA.debugLineNum = 1213;BA.debugLine="span.Initialize(vue,\"\")";
_span._initialize /*b4j.example.vmelement*/ (ba,_vue,"");
 //BA.debugLineNum = 1214;BA.debugLine="span.SetTag(\"span\")";
_span._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 1215;BA.debugLine="span.SetText($\"{{ getfilesize(item.${value}) }}";
_span._settext /*b4j.example.vmelement*/ (("{{ getfilesize(item."+__c.SmartStringFormatter("",(Object)(_value))+") }}"));
 //BA.debugLineNum = 1216;BA.debugLine="tmp.AddComponent(span.ToString)";
_tmp._addcomponent /*b4j.example.vmtemplate*/ (_span._tostring /*String*/ ());
 //BA.debugLineNum = 1217;BA.debugLine="sb.Append(tmp.ToString)";
_sb.Append(_tmp._tostring /*String*/ ());
 break; }
case 5: {
 //BA.debugLineNum = 1220;BA.debugLine="Dim tmp As VMTemplate";
_tmp = new b4j.example.vmtemplate();
 //BA.debugLineNum = 1221;BA.debugLine="tmp.Initialize(vue, \"\" , Module).SetStatic(bSta";
_tmp._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmtemplate*/ (_bstatic)._setdesignmode /*b4j.example.vmtemplate*/ (_designmode);
 //BA.debugLineNum = 1222;BA.debugLine="Dim sline As String = $\"v-slot:item.${value}=\"{";
_sline = ("v-slot:item."+__c.SmartStringFormatter("",(Object)(_value))+"=\"{ item }\"");
 //BA.debugLineNum = 1223;BA.debugLine="tmp.SetAttrLoose(sline)";
_tmp._setattrloose /*b4j.example.vmtemplate*/ (_sline);
 //BA.debugLineNum = 1225;BA.debugLine="Dim pl As VMProgressLinear";
_pl = new b4j.example.vmprogresslinear();
 //BA.debugLineNum = 1226;BA.debugLine="pl.Initialize(vue, $\"${ID}${value}\"$, Module).S";
_pl._initialize /*b4j.example.vmprogresslinear*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+""+__c.SmartStringFormatter("",(Object)(_value))+""),_module)._setstatic /*b4j.example.vmprogresslinear*/ (_bstatic)._setdesignmode /*b4j.example.vmprogresslinear*/ (_designmode);
 //BA.debugLineNum = 1227;BA.debugLine="pl.SetVModel($\"item.${value}\"$)";
_pl._setvmodel /*b4j.example.vmprogresslinear*/ (("item."+__c.SmartStringFormatter("",(Object)(_value))+""));
 //BA.debugLineNum = 1228;BA.debugLine="pl.SetReactive(True)";
_pl._setreactive /*b4j.example.vmprogresslinear*/ (__c.True);
 //BA.debugLineNum = 1229;BA.debugLine="pl.SetRounded(True)";
_pl._setrounded /*b4j.example.vmprogresslinear*/ (__c.True);
 //BA.debugLineNum = 1230;BA.debugLine="If nf.progressColor <> \"\" Then pl.SetColor(nf.p";
if ((_nf.progressColor /*String*/ ).equals("") == false) { 
_pl._setcolor /*b4j.example.vmprogresslinear*/ (_nf.progressColor /*String*/ );};
 //BA.debugLineNum = 1231;BA.debugLine="If nf.progressheight <> \"\" Then pl.SetHeight(nf";
if ((_nf.progressHeight /*String*/ ).equals("") == false) { 
_pl._setheight /*b4j.example.vmprogresslinear*/ (_nf.progressHeight /*String*/ );};
 //BA.debugLineNum = 1232;BA.debugLine="If nf.progressShowValue Then";
if (_nf.progressShowValue /*boolean*/ ) { 
 //BA.debugLineNum = 1233;BA.debugLine="Dim tmpx As VMElement";
_tmpx = new b4j.example.vmelement();
 //BA.debugLineNum = 1234;BA.debugLine="tmpx.Initialize(vue, \"\").SetTag(\"strong\")";
_tmpx._initialize /*b4j.example.vmelement*/ (ba,_vue,"")._settag /*b4j.example.vmelement*/ ("strong");
 //BA.debugLineNum = 1235;BA.debugLine="tmpx.AddComponent($\"{{ Math.ceil(item.${value}";
_tmpx._addcomponent /*b4j.example.vmelement*/ (("{{ Math.ceil(item."+__c.SmartStringFormatter("",(Object)(_value))+") }}%"));
 //BA.debugLineNum = 1236;BA.debugLine="pl.AddComponent(tmpx.ToString)";
_pl._addcomponent /*b4j.example.vmprogresslinear*/ (_tmpx._tostring /*String*/ ());
 };
 //BA.debugLineNum = 1238;BA.debugLine="tmp.AddComponent(pl.ToString)";
_tmp._addcomponent /*b4j.example.vmtemplate*/ (_pl._tostring /*String*/ ());
 //BA.debugLineNum = 1239;BA.debugLine="sb.Append(tmp.ToString)";
_sb.Append(_tmp._tostring /*String*/ ());
 break; }
case 6: {
 //BA.debugLineNum = 1241;BA.debugLine="Dim tmp As VMTemplate";
_tmp = new b4j.example.vmtemplate();
 //BA.debugLineNum = 1242;BA.debugLine="tmp.Initialize(vue, \"\" , Module).SetStatic(bSta";
_tmp._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmtemplate*/ (_bstatic)._setdesignmode /*b4j.example.vmtemplate*/ (_designmode);
 //BA.debugLineNum = 1243;BA.debugLine="Dim sline As String = $\"v-slot:item.${value}=\"{";
_sline = ("v-slot:item."+__c.SmartStringFormatter("",(Object)(_value))+"=\"{ item }\"");
 //BA.debugLineNum = 1244;BA.debugLine="tmp.SetAttrLoose(sline)";
_tmp._setattrloose /*b4j.example.vmtemplate*/ (_sline);
 //BA.debugLineNum = 1246;BA.debugLine="Dim pc As VMProgressCircular";
_pc = new b4j.example.vmprogresscircular();
 //BA.debugLineNum = 1247;BA.debugLine="pc.Initialize(vue, $\"${ID}${value}\"$, Module).S";
_pc._initialize /*b4j.example.vmprogresscircular*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+""+__c.SmartStringFormatter("",(Object)(_value))+""),_module)._setstatic /*b4j.example.vmprogresscircular*/ (_bstatic)._setdesignmode /*b4j.example.vmprogresscircular*/ (_designmode);
 //BA.debugLineNum = 1248;BA.debugLine="pc.SetVModel($\"item.${value}\"$)";
_pc._setvmodel /*b4j.example.vmprogresscircular*/ (("item."+__c.SmartStringFormatter("",(Object)(_value))+""));
 //BA.debugLineNum = 1249;BA.debugLine="pc.SetReactive(True)";
_pc._setreactive /*b4j.example.vmprogresscircular*/ (__c.True);
 //BA.debugLineNum = 1250;BA.debugLine="pc.AddComponent($\"{{ item.${value} }}\"$)";
_pc._addcomponent /*b4j.example.vmprogresscircular*/ (("{{ item."+__c.SmartStringFormatter("",(Object)(_value))+" }}"));
 //BA.debugLineNum = 1251;BA.debugLine="If nf.progressRotate <> \"\" Then pc.SetRotate(nf";
if ((_nf.progressRotate /*String*/ ).equals("") == false) { 
_pc._setrotate /*b4j.example.vmprogresscircular*/ (_nf.progressRotate /*String*/ );};
 //BA.debugLineNum = 1252;BA.debugLine="If nf.progressSize <> \"\" Then pc.SetSize(nf.pro";
if ((_nf.progressSize /*String*/ ).equals("") == false) { 
_pc._setsize /*b4j.example.vmprogresscircular*/ (_nf.progressSize /*String*/ );};
 //BA.debugLineNum = 1253;BA.debugLine="If nf.progressWidth <> \"\" Then pc.SetWidth(nf.p";
if ((_nf.progressWidth /*String*/ ).equals("") == false) { 
_pc._setwidth /*b4j.example.vmprogresscircular*/ (_nf.progressWidth /*String*/ );};
 //BA.debugLineNum = 1254;BA.debugLine="If nf.progressColor <> \"\" Then pc.SetColor(nf.p";
if ((_nf.progressColor /*String*/ ).equals("") == false) { 
_pc._setcolor /*b4j.example.vmprogresscircular*/ (_nf.progressColor /*String*/ );};
 //BA.debugLineNum = 1255;BA.debugLine="tmp.AddComponent(pc.ToString)";
_tmp._addcomponent /*b4j.example.vmtemplate*/ (_pc._tostring /*String*/ ());
 //BA.debugLineNum = 1256;BA.debugLine="sb.Append(tmp.ToString)";
_sb.Append(_tmp._tostring /*String*/ ());
 break; }
case 7: {
 //BA.debugLineNum = 1258;BA.debugLine="Dim tmp As VMTemplate";
_tmp = new b4j.example.vmtemplate();
 //BA.debugLineNum = 1259;BA.debugLine="tmp.Initialize(vue, \"\" , Module).SetStatic(bSta";
_tmp._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmtemplate*/ (_bstatic)._setdesignmode /*b4j.example.vmtemplate*/ (_designmode);
 //BA.debugLineNum = 1260;BA.debugLine="Dim sline As String = $\"v-slot:item.${value}=\"{";
_sline = ("v-slot:item."+__c.SmartStringFormatter("",(Object)(_value))+"=\"{ item }\"");
 //BA.debugLineNum = 1261;BA.debugLine="tmp.SetAttrLoose(sline)";
_tmp._setattrloose /*b4j.example.vmtemplate*/ (_sline);
 //BA.debugLineNum = 1263;BA.debugLine="Dim rat As VMRating";
_rat = new b4j.example.vmrating();
 //BA.debugLineNum = 1264;BA.debugLine="rat.Initialize(vue, $\"${ID}${value}\"$, Module).";
_rat._initialize /*b4j.example.vmrating*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+""+__c.SmartStringFormatter("",(Object)(_value))+""),_module)._setstatic /*b4j.example.vmrating*/ (_bstatic)._setdesignmode /*b4j.example.vmrating*/ (_designmode);
 //BA.debugLineNum = 1265;BA.debugLine="rat.SetDense(True)";
_rat._setdense /*b4j.example.vmrating*/ (__c.True);
 //BA.debugLineNum = 1266;BA.debugLine="rat.SetVModel($\"item.${value}\"$)";
_rat._setvmodel /*b4j.example.vmrating*/ (("item."+__c.SmartStringFormatter("",(Object)(_value))+""));
 //BA.debugLineNum = 1267;BA.debugLine="If nf.Disabled Then rat.SetAttrLoose(\"disabled\"";
if (_nf.Disabled /*boolean*/ ) { 
_rat._setattrloose /*b4j.example.vmrating*/ ("disabled");};
 //BA.debugLineNum = 1268;BA.debugLine="If nf.ReadOnly Then rat.SetAttrLoose(\"readonly\"";
if (_nf.ReadOnly /*boolean*/ ) { 
_rat._setattrloose /*b4j.example.vmrating*/ ("readonly");};
 //BA.debugLineNum = 1269;BA.debugLine="If nf.iconSize <> \"\" Then rat.SetLength(nf.icon";
if ((_nf.iconSize /*String*/ ).equals("") == false) { 
_rat._setlength /*b4j.example.vmrating*/ (_nf.iconSize /*String*/ );};
 //BA.debugLineNum = 1270;BA.debugLine="If nf.iconColor <> \"\" Then rat.SetColor(nf.icon";
if ((_nf.iconColor /*String*/ ).equals("") == false) { 
_rat._setcolor /*b4j.example.vmrating*/ (_nf.iconColor /*String*/ );};
 //BA.debugLineNum = 1272;BA.debugLine="Dim methodName As String = $\"${ID}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 1273;BA.debugLine="If SubExists(Module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 1274;BA.debugLine="rat.SetAttrSingle(\"@input\", $\"${methodName}(it";
_rat._setattrsingle /*b4j.example.vmrating*/ ("@input",(""+__c.SmartStringFormatter("",(Object)(_methodname))+"(item)"));
 //BA.debugLineNum = 1275;BA.debugLine="vue.SetMethod(Module, methodName)";
_vue._setmethod /*b4j.example.bananovue*/ (_module,_methodname);
 };
 //BA.debugLineNum = 1277;BA.debugLine="tmp.AddComponent(rat.ToString)";
_tmp._addcomponent /*b4j.example.vmtemplate*/ (_rat._tostring /*String*/ ());
 //BA.debugLineNum = 1278;BA.debugLine="sb.Append(tmp.ToString)";
_sb.Append(_tmp._tostring /*String*/ ());
 break; }
case 8: {
 //BA.debugLineNum = 1280;BA.debugLine="Dim tmp As VMTemplate";
_tmp = new b4j.example.vmtemplate();
 //BA.debugLineNum = 1281;BA.debugLine="tmp.Initialize(vue, \"\" , Module).SetStatic(bSta";
_tmp._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmtemplate*/ (_bstatic)._setdesignmode /*b4j.example.vmtemplate*/ (_designmode);
 //BA.debugLineNum = 1282;BA.debugLine="Dim sline As String = $\"v-slot:item.${value}=\"{";
_sline = ("v-slot:item."+__c.SmartStringFormatter("",(Object)(_value))+"=\"{ item }\"");
 //BA.debugLineNum = 1283;BA.debugLine="tmp.SetAttrLoose(sline)";
_tmp._setattrloose /*b4j.example.vmtemplate*/ (_sline);
 //BA.debugLineNum = 1285;BA.debugLine="Dim avt As VMAvatar";
_avt = new b4j.example.vmavatar();
 //BA.debugLineNum = 1286;BA.debugLine="Dim avtimg As VMImage";
_avtimg = new b4j.example.vmimage();
 //BA.debugLineNum = 1288;BA.debugLine="avt.Initialize(vue,\"\", \"\").SetStatic(bStatic).S";
_avt._initialize /*b4j.example.vmavatar*/ (ba,_vue,"",(Object)(""))._setstatic /*b4j.example.vmavatar*/ (_bstatic)._setdesignmode /*b4j.example.vmavatar*/ (_designmode);
 //BA.debugLineNum = 1289;BA.debugLine="avtimg.Initialize(vue, \"\",\"\").SetStatic(bStatic";
_avtimg._initialize /*b4j.example.vmimage*/ (ba,_vue,"",(Object)(""))._setstatic /*b4j.example.vmimage*/ (_bstatic)._setdesignmode /*b4j.example.vmimage*/ (_designmode);
 //BA.debugLineNum = 1290;BA.debugLine="avtimg.SetSrc($\"item.${value}\"$)";
_avtimg._setsrc /*b4j.example.vmimage*/ (("item."+__c.SmartStringFormatter("",(Object)(_value))+""));
 //BA.debugLineNum = 1291;BA.debugLine="avtimg.SetAlt($\"item.${value}\"$)";
_avtimg._setalt /*b4j.example.vmimage*/ (("item."+__c.SmartStringFormatter("",(Object)(_value))+""));
 //BA.debugLineNum = 1292;BA.debugLine="If nf.imgHeight <> \"\" Then";
if ((_nf.imgHeight /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1293;BA.debugLine="avtimg.SetHeight(nf.imgheight)";
_avtimg._setheight /*b4j.example.vmimage*/ (_nf.imgHeight /*String*/ );
 //BA.debugLineNum = 1294;BA.debugLine="avtimg.SetMaxHeight(nf.imgheight)";
_avtimg._setmaxheight /*b4j.example.vmimage*/ (_nf.imgHeight /*String*/ );
 };
 //BA.debugLineNum = 1297;BA.debugLine="If nf.imgWidth <> \"\" Then";
if ((_nf.imgWidth /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1298;BA.debugLine="avtimg.SetWidth(nf.imgWidth)";
_avtimg._setwidth /*b4j.example.vmimage*/ (_nf.imgWidth /*String*/ );
 //BA.debugLineNum = 1299;BA.debugLine="avtimg.SetMaxWidth(nf.imgWidth)";
_avtimg._setmaxwidth /*b4j.example.vmimage*/ (_nf.imgWidth /*String*/ );
 };
 //BA.debugLineNum = 1301;BA.debugLine="avt.AddComponent(avtimg.ToString)";
_avt._addcomponent /*b4j.example.vmavatar*/ (_avtimg._tostring /*String*/ ());
 //BA.debugLineNum = 1302;BA.debugLine="tmp.AddComponent(avt.ToString)";
_tmp._addcomponent /*b4j.example.vmtemplate*/ (_avt._tostring /*String*/ ());
 //BA.debugLineNum = 1303;BA.debugLine="sb.Append(tmp.ToString)";
_sb.Append(_tmp._tostring /*String*/ ());
 break; }
case 9: 
case 10: {
 //BA.debugLineNum = 1305;BA.debugLine="Dim tmp As VMTemplate";
_tmp = new b4j.example.vmtemplate();
 //BA.debugLineNum = 1306;BA.debugLine="tmp.Initialize(vue, \"\" , Module).SetStatic(bSta";
_tmp._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmtemplate*/ (_bstatic)._setdesignmode /*b4j.example.vmtemplate*/ (_designmode);
 //BA.debugLineNum = 1307;BA.debugLine="Dim sline As String = $\"v-slot:item.${value}=\"{";
_sline = ("v-slot:item."+__c.SmartStringFormatter("",(Object)(_value))+"=\"{ item }\"");
 //BA.debugLineNum = 1308;BA.debugLine="tmp.SetAttrLoose(sline)";
_tmp._setattrloose /*b4j.example.vmtemplate*/ (_sline);
 //BA.debugLineNum = 1310;BA.debugLine="Dim swt As VMCheckBox";
_swt = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 1311;BA.debugLine="swt.Initialize(vue, $\"${ID}${value}\"$, Module).";
_swt._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+""+__c.SmartStringFormatter("",(Object)(_value))+""),_module)._setstatic /*b4j.example.vmcheckbox*/ (_bstatic)._setdesignmode /*b4j.example.vmcheckbox*/ (_designmode);
 //BA.debugLineNum = 1312;BA.debugLine="If ct = COLUMN_SWITCH Then";
if ((_ct).equals(_column_switch)) { 
 //BA.debugLineNum = 1313;BA.debugLine="swt.SetTag(\"v-switch\")";
_swt._settag /*b4j.example.vmcheckbox*/ ("v-switch");
 //BA.debugLineNum = 1314;BA.debugLine="swt.SetInset(True)";
_swt._setinset /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 1315;BA.debugLine="swt.SetDense(True)";
_swt._setdense /*b4j.example.vmcheckbox*/ (__c.True);
 };
 //BA.debugLineNum = 1317;BA.debugLine="swt.SetValue(\"Yes\")";
_swt._setvalue /*b4j.example.vmcheckbox*/ ("Yes");
 //BA.debugLineNum = 1318;BA.debugLine="swt.SetTrueValue(\"Yes\")";
_swt._settruevalue /*b4j.example.vmcheckbox*/ ("Yes");
 //BA.debugLineNum = 1319;BA.debugLine="swt.SetUncheckedValue(\"No\")";
_swt._setuncheckedvalue /*b4j.example.vmcheckbox*/ ((Object)("No"));
 //BA.debugLineNum = 1320;BA.debugLine="swt.SetFalseValue(\"No\")";
_swt._setfalsevalue /*b4j.example.vmcheckbox*/ ("No");
 //BA.debugLineNum = 1321;BA.debugLine="swt.SetVModel($\"item.${value}\"$)";
_swt._setvmodel /*b4j.example.vmcheckbox*/ (("item."+__c.SmartStringFormatter("",(Object)(_value))+""));
 //BA.debugLineNum = 1322;BA.debugLine="If nf.Disabled Then swt.SetAttrLoose(\"disabled\"";
if (_nf.Disabled /*boolean*/ ) { 
_swt._setattrloose /*b4j.example.vmcheckbox*/ ("disabled");};
 //BA.debugLineNum = 1324;BA.debugLine="Dim methodName As String = $\"${ID}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 1325;BA.debugLine="If SubExists(Module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 1326;BA.debugLine="swt.SetAttrSingle(\"@change\", $\"${methodName}(i";
_swt._setattrsingle /*b4j.example.vmcheckbox*/ ("@change",(""+__c.SmartStringFormatter("",(Object)(_methodname))+"(item)"));
 //BA.debugLineNum = 1327;BA.debugLine="vue.SetMethod(Module, methodName)";
_vue._setmethod /*b4j.example.bananovue*/ (_module,_methodname);
 };
 //BA.debugLineNum = 1329;BA.debugLine="tmp.AddComponent(swt.ToString)";
_tmp._addcomponent /*b4j.example.vmtemplate*/ (_swt._tostring /*String*/ ());
 //BA.debugLineNum = 1330;BA.debugLine="sb.Append(tmp.ToString)";
_sb.Append(_tmp._tostring /*String*/ ());
 break; }
case 11: {
 //BA.debugLineNum = 1332;BA.debugLine="Dim tmp As VMTemplate";
_tmp = new b4j.example.vmtemplate();
 //BA.debugLineNum = 1333;BA.debugLine="tmp.Initialize(vue, \"\" , Module).SetStatic(bSta";
_tmp._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmtemplate*/ (_bstatic)._setdesignmode /*b4j.example.vmtemplate*/ (_designmode);
 //BA.debugLineNum = 1334;BA.debugLine="Dim sline As String = $\"v-slot:item.${value}=\"{";
_sline = ("v-slot:item."+__c.SmartStringFormatter("",(Object)(_value))+"=\"{ item }\"");
 //BA.debugLineNum = 1335;BA.debugLine="tmp.SetAttrLoose(sline)";
_tmp._setattrloose /*b4j.example.vmtemplate*/ (_sline);
 //BA.debugLineNum = 1337;BA.debugLine="Dim aIcon As VMIcon";
_aicon = new b4j.example.vmicon();
 //BA.debugLineNum = 1338;BA.debugLine="aIcon.Initialize(vue, $\"${ID}${value}\"$, Module";
_aicon._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+""+__c.SmartStringFormatter("",(Object)(_value))+""),_module)._setstatic /*b4j.example.vmicon*/ (_bstatic)._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 1339;BA.debugLine="aIcon.SetVText($\"item.${value}\"$)";
_aicon._setvtext /*b4j.example.vmicon*/ (("item."+__c.SmartStringFormatter("",(Object)(_value))+""));
 //BA.debugLineNum = 1340;BA.debugLine="If nf.Disabled Then aIcon.SetAttrLoose(\"disable";
if (_nf.Disabled /*boolean*/ ) { 
_aicon._setattrloose /*b4j.example.vmicon*/ ("disabled");};
 //BA.debugLineNum = 1341;BA.debugLine="If nf.iconSize <> \"\" Then aIcon.SetSize(nf.icon";
if ((_nf.iconSize /*String*/ ).equals("") == false) { 
_aicon._setsize /*b4j.example.vmicon*/ (_nf.iconSize /*String*/ );};
 //BA.debugLineNum = 1342;BA.debugLine="If nf.iconColor <> \"\" Then aIcon.SetColor(nf.ic";
if ((_nf.iconColor /*String*/ ).equals("") == false) { 
_aicon._setcolor /*b4j.example.vmicon*/ (_nf.iconColor /*String*/ );};
 //BA.debugLineNum = 1343;BA.debugLine="tmp.AddComponent(aIcon.ToString)";
_tmp._addcomponent /*b4j.example.vmtemplate*/ (_aicon._tostring /*String*/ ());
 //BA.debugLineNum = 1344;BA.debugLine="sb.Append(tmp.ToString)";
_sb.Append(_tmp._tostring /*String*/ ());
 break; }
case 12: {
 //BA.debugLineNum = 1346;BA.debugLine="Dim tmp As VMTemplate";
_tmp = new b4j.example.vmtemplate();
 //BA.debugLineNum = 1347;BA.debugLine="tmp.Initialize(vue, \"\" , Module).SetStatic(bSta";
_tmp._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmtemplate*/ (_bstatic)._setdesignmode /*b4j.example.vmtemplate*/ (_designmode);
 //BA.debugLineNum = 1348;BA.debugLine="Dim sline As String = $\"v-slot:item.${value}=\"{";
_sline = ("v-slot:item."+__c.SmartStringFormatter("",(Object)(_value))+"=\"{ item }\"");
 //BA.debugLineNum = 1349;BA.debugLine="tmp.SetAttrLoose(sline)";
_tmp._setattrloose /*b4j.example.vmtemplate*/ (_sline);
 //BA.debugLineNum = 1351;BA.debugLine="Dim avtimg As VMImage";
_avtimg = new b4j.example.vmimage();
 //BA.debugLineNum = 1352;BA.debugLine="avtimg.Initialize(vue, \"\",\"\").SetStatic(bStatic";
_avtimg._initialize /*b4j.example.vmimage*/ (ba,_vue,"",(Object)(""))._setstatic /*b4j.example.vmimage*/ (_bstatic)._setdesignmode /*b4j.example.vmimage*/ (_designmode);
 //BA.debugLineNum = 1353;BA.debugLine="avtimg.SetSrc($\"item.${value}\"$)";
_avtimg._setsrc /*b4j.example.vmimage*/ (("item."+__c.SmartStringFormatter("",(Object)(_value))+""));
 //BA.debugLineNum = 1354;BA.debugLine="avtimg.SetAlt($\"item.${value}\"$)";
_avtimg._setalt /*b4j.example.vmimage*/ (("item."+__c.SmartStringFormatter("",(Object)(_value))+""));
 //BA.debugLineNum = 1355;BA.debugLine="If nf.Disabled Then avtimg.SetAttrLoose(\"disabl";
if (_nf.Disabled /*boolean*/ ) { 
_avtimg._setattrloose /*b4j.example.vmimage*/ ("disabled");};
 //BA.debugLineNum = 1356;BA.debugLine="If nf.imgHeight <> \"\" Then";
if ((_nf.imgHeight /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1357;BA.debugLine="avtimg.SetHeight(nf.imgheight)";
_avtimg._setheight /*b4j.example.vmimage*/ (_nf.imgHeight /*String*/ );
 //BA.debugLineNum = 1358;BA.debugLine="avtimg.SetMaxHeight(nf.imgheight)";
_avtimg._setmaxheight /*b4j.example.vmimage*/ (_nf.imgHeight /*String*/ );
 };
 //BA.debugLineNum = 1361;BA.debugLine="If nf.imgWidth <> \"\" Then";
if ((_nf.imgWidth /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1362;BA.debugLine="avtimg.SetWidth(nf.imgWidth)";
_avtimg._setwidth /*b4j.example.vmimage*/ (_nf.imgWidth /*String*/ );
 //BA.debugLineNum = 1363;BA.debugLine="avtimg.SetMaxWidth(nf.imgWidth)";
_avtimg._setmaxwidth /*b4j.example.vmimage*/ (_nf.imgWidth /*String*/ );
 };
 //BA.debugLineNum = 1365;BA.debugLine="tmp.AddComponent(avtimg.ToString)";
_tmp._addcomponent /*b4j.example.vmtemplate*/ (_avtimg._tostring /*String*/ ());
 //BA.debugLineNum = 1366;BA.debugLine="sb.Append(tmp.ToString)";
_sb.Append(_tmp._tostring /*String*/ ());
 break; }
case 13: {
 //BA.debugLineNum = 1368;BA.debugLine="Dim tmp As VMTemplate";
_tmp = new b4j.example.vmtemplate();
 //BA.debugLineNum = 1369;BA.debugLine="tmp.Initialize(vue, \"\" , Module).SetStatic(bSta";
_tmp._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmtemplate*/ (_bstatic)._setdesignmode /*b4j.example.vmtemplate*/ (_designmode);
 //BA.debugLineNum = 1370;BA.debugLine="Dim sline As String = $\"v-slot:item.${value}=\"{";
_sline = ("v-slot:item."+__c.SmartStringFormatter("",(Object)(_value))+"=\"{ item }\"");
 //BA.debugLineNum = 1371;BA.debugLine="tmp.SetAttrLoose(sline)";
_tmp._setattrloose /*b4j.example.vmtemplate*/ (_sline);
 //BA.debugLineNum = 1373;BA.debugLine="Dim chp As VMChip";
_chp = new b4j.example.vmchip();
 //BA.debugLineNum = 1374;BA.debugLine="chp.Initialize(vue, \"\", Module).SetStatic(bStat";
_chp._initialize /*b4j.example.vmchip*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmchip*/ (_bstatic)._setdesignmode /*b4j.example.vmchip*/ (_designmode);
 //BA.debugLineNum = 1375;BA.debugLine="chp.SetAttributes(Array(\"dark\"))";
_chp._setattributes /*b4j.example.vmchip*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("dark")}));
 //BA.debugLineNum = 1376;BA.debugLine="chp.SetText($\"{{ item.${value} }}\"$)";
_chp._settext /*b4j.example.vmchip*/ (("{{ item."+__c.SmartStringFormatter("",(Object)(_value))+" }}"));
 //BA.debugLineNum = 1377;BA.debugLine="If nf.Disabled Then chp.SetAttrLoose(\"disabled\"";
if (_nf.Disabled /*boolean*/ ) { 
_chp._setattrloose /*b4j.example.vmchip*/ ("disabled");};
 //BA.debugLineNum = 1378;BA.debugLine="If nf.extra <> \"\" Then chp.SetAttrLoose(nf.extr";
if ((_nf.extra /*String*/ ).equals("") == false) { 
_chp._setattrloose /*b4j.example.vmchip*/ (_nf.extra /*String*/ );};
 //BA.debugLineNum = 1380;BA.debugLine="tmp.AddComponent(chp.ToString)";
_tmp._addcomponent /*b4j.example.vmtemplate*/ (_chp._tostring /*String*/ ());
 //BA.debugLineNum = 1381;BA.debugLine="sb.Append(tmp.ToString)";
_sb.Append(_tmp._tostring /*String*/ ());
 break; }
case 14: 
case 15: 
case 16: 
case 17: 
case 18: {
 //BA.debugLineNum = 1383;BA.debugLine="Dim tmpa As VMTemplate";
_tmpa = new b4j.example.vmtemplate();
 //BA.debugLineNum = 1384;BA.debugLine="tmpa.Initialize(vue, \"\" , Module).SetStatic(bSt";
_tmpa._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",_module)._setstatic /*b4j.example.vmtemplate*/ (_bstatic)._setdesignmode /*b4j.example.vmtemplate*/ (_designmode);
 //BA.debugLineNum = 1385;BA.debugLine="Dim sline As String = $\"v-slot:item.${value}=\"{";
_sline = ("v-slot:item."+__c.SmartStringFormatter("",(Object)(_value))+"=\"{ item }\"");
 //BA.debugLineNum = 1386;BA.debugLine="tmpa.SetAttrLoose(sline)";
_tmpa._setattrloose /*b4j.example.vmtemplate*/ (_sline);
 //BA.debugLineNum = 1388;BA.debugLine="Dim abtn As VMButton";
_abtn = new b4j.example.vmbutton();
 //BA.debugLineNum = 1389;BA.debugLine="abtn.Initialize(vue, $\"${ID}${value}\"$, Module)";
_abtn._initialize /*b4j.example.vmbutton*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+""+__c.SmartStringFormatter("",(Object)(_value))+""),_module)._setstatic /*b4j.example.vmbutton*/ (_bstatic)._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 1390;BA.debugLine="abtn.SetElevation(\"4\").SetFab(True).SetSmall(Tr";
_abtn._setelevation /*b4j.example.vmbutton*/ ("4")._setfab /*b4j.example.vmbutton*/ (__c.True)._setsmall /*b4j.example.vmbutton*/ (__c.True)._setdark /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 1391;BA.debugLine="abtn.AddClass(\"mr-2\")";
_abtn._addclass /*b4j.example.vmbutton*/ ("mr-2");
 //BA.debugLineNum = 1392;BA.debugLine="If nf.iconColor <> \"\" Then abtn.SetColor(nf.ico";
if ((_nf.iconColor /*String*/ ).equals("") == false) { 
_abtn._setcolor /*b4j.example.vmbutton*/ (_nf.iconColor /*String*/ );};
 //BA.debugLineNum = 1393;BA.debugLine="If nf.Disabled Then abtn.SetAttrLoose(\"disabled";
if (_nf.Disabled /*boolean*/ ) { 
_abtn._setattrloose /*b4j.example.vmbutton*/ ("disabled");};
 //BA.debugLineNum = 1395;BA.debugLine="Dim aIcon As VMIcon";
_aicon = new b4j.example.vmicon();
 //BA.debugLineNum = 1396;BA.debugLine="aIcon.Initialize(vue, $\"${ID}${value}icon\"$, Mo";
_aicon._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+""+__c.SmartStringFormatter("",(Object)(_value))+"icon"),_module)._setstatic /*b4j.example.vmicon*/ (_bstatic)._setdesignmode /*b4j.example.vmicon*/ (_designmode);
 //BA.debugLineNum = 1397;BA.debugLine="aIcon.SetText(nf.icon)";
_aicon._settext /*b4j.example.vmicon*/ (_nf.icon /*String*/ );
 //BA.debugLineNum = 1398;BA.debugLine="If nf.iconSize <> \"\" Then aIcon.SetSize(nf.icon";
if ((_nf.iconSize /*String*/ ).equals("") == false) { 
_aicon._setsize /*b4j.example.vmicon*/ (_nf.iconSize /*String*/ );};
 //BA.debugLineNum = 1399;BA.debugLine="abtn.AddComponent(aIcon.tostring)";
_abtn._addcomponent /*b4j.example.vmbutton*/ (_aicon._tostring /*String*/ ());
 //BA.debugLineNum = 1401;BA.debugLine="If SubExists(Module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 1402;BA.debugLine="abtn.SetAttrSingle(\"@click\", $\"${ID}_${value}(";
_abtn._setattrsingle /*b4j.example.vmbutton*/ ("@click",(""+__c.SmartStringFormatter("",(Object)(_id))+"_"+__c.SmartStringFormatter("",(Object)(_value))+"(item)"));
 //BA.debugLineNum = 1403;BA.debugLine="vue.SetMethod(Module, methodName)";
_vue._setmethod /*b4j.example.bananovue*/ (_module,_methodname);
 };
 //BA.debugLineNum = 1405;BA.debugLine="tmpa.AddComponent(abtn.ToString)";
_tmpa._addcomponent /*b4j.example.vmtemplate*/ (_abtn._tostring /*String*/ ());
 //BA.debugLineNum = 1406;BA.debugLine="sb.Append(tmpa.ToString)";
_sb.Append(_tmpa._tostring /*String*/ ());
 break; }
}
;
 }
};
 //BA.debugLineNum = 1410;BA.debugLine="If hasTotals Then";
if (_hastotals) { 
 //BA.debugLineNum = 1411;BA.debugLine="sbTotals.Append($\"</tr>\"$)";
_sbtotals.Append(("</tr>"));
 //BA.debugLineNum = 1412;BA.debugLine="sbTotals.Append(\"</template>\")";
_sbtotals.Append("</template>");
 //BA.debugLineNum = 1413;BA.debugLine="sb.Append(sbTotals.ToString)";
_sb.Append(_sbtotals.ToString());
 };
 //BA.debugLineNum = 1415;BA.debugLine="DataTable.SetText(sb.ToString)";
_datatable._settext /*b4j.example.vmelement*/ (_sb.ToString());
 //BA.debugLineNum = 1416;BA.debugLine="End Sub";
return "";
}
public String  _buildheaders(anywheresoftware.b4a.objects.collections.Map _colnames) throws Exception{
String _k = "";
b4j.example.vmdatatable._datatablecolumn _nf = null;
anywheresoftware.b4a.objects.collections.Map _header = null;
 //BA.debugLineNum = 1090;BA.debugLine="private Sub BuildHeaders(colNames As Map)";
 //BA.debugLineNum = 1091;BA.debugLine="hdr.Initialize";
_hdr.Initialize();
 //BA.debugLineNum = 1093;BA.debugLine="For Each k As String In colNames.keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _colnames.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1095;BA.debugLine="Dim nf As DataTableColumn = colNames.Get(k)";
_nf = (b4j.example.vmdatatable._datatablecolumn)(_colnames.Get((Object)(_k)));
 //BA.debugLineNum = 1097;BA.debugLine="Dim header As Map = CreateMap()";
_header = new anywheresoftware.b4a.objects.collections.Map();
_header = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1098;BA.debugLine="header.Initialize";
_header.Initialize();
 //BA.debugLineNum = 1099;BA.debugLine="header.put(\"text\", nf.text)";
_header.Put((Object)("text"),(Object)(_nf.text /*String*/ ));
 //BA.debugLineNum = 1100;BA.debugLine="header.put(\"value\", nf.value)";
_header.Put((Object)("value"),(Object)(_nf.value /*String*/ ));
 //BA.debugLineNum = 1101;BA.debugLine="header.put(\"align\", nf.align)";
_header.Put((Object)("align"),(Object)(_nf.align /*String*/ ));
 //BA.debugLineNum = 1102;BA.debugLine="header.put(\"sortable\", nf.Sortable)";
_header.Put((Object)("sortable"),(Object)(_nf.sortable /*boolean*/ ));
 //BA.debugLineNum = 1103;BA.debugLine="header.put(\"filterable\", nf.filterable)";
_header.Put((Object)("filterable"),(Object)(_nf.filterable /*boolean*/ ));
 //BA.debugLineNum = 1104;BA.debugLine="header.put(\"divider\", nf.divider)";
_header.Put((Object)("divider"),(Object)(_nf.divider /*boolean*/ ));
 //BA.debugLineNum = 1105;BA.debugLine="header.Put(\"class\", nf.classname)";
_header.Put((Object)("class"),(Object)(_nf.className /*String*/ ));
 //BA.debugLineNum = 1106;BA.debugLine="If nf.width <> 0 Then header.Put(\"width\", nf.wid";
if ((_nf.width /*String*/ ).equals(BA.NumberToString(0)) == false) { 
_header.Put((Object)("width"),(Object)(_nf.width /*String*/ ));};
 //BA.debugLineNum = 1107;BA.debugLine="If nf.filter <> Null Then header.put(\"filter\", n";
if (_nf.filter /*String*/ != null) { 
_header.Put((Object)("filter"),(Object)(_nf.filter /*String*/ ));};
 //BA.debugLineNum = 1108;BA.debugLine="If nf.sort <> Null Then header.Put(\"sort\", nf.so";
if (_nf.sort /*String*/ != null) { 
_header.Put((Object)("sort"),(Object)(_nf.sort /*String*/ ));};
 //BA.debugLineNum = 1109;BA.debugLine="hdr.Add(header)";
_hdr.Add((Object)(_header.getObject()));
 }
};
 //BA.debugLineNum = 1111;BA.debugLine="vue.SetData(headers, hdr)";
_vue._setdata /*b4j.example.bananovue*/ (_headers,(Object)(_hdr.getObject()));
 //BA.debugLineNum = 1112;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 2498;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 2499;BA.debugLine="DataTable.BuildModel(mprops, mstyles, lclasses, l";
_datatable._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 2500;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2501;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public DataTable As VMElement";
_datatable = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Public PrimaryKey As String = \"id\"";
_primarykey = "id";
 //BA.debugLineNum = 11;BA.debugLine="Public COLUMN_DATE As String = \"date\"";
_column_date = "date";
 //BA.debugLineNum = 12;BA.debugLine="Public COLUMN_TEXT As String = \"text\"";
_column_text = "text";
 //BA.debugLineNum = 13;BA.debugLine="Public COLUMN_ICON As String = \"icon\"";
_column_icon = "icon";
 //BA.debugLineNum = 14;BA.debugLine="Public COLUMN_CHECKBOX As String = \"checkbox\"";
_column_checkbox = "checkbox";
 //BA.debugLineNum = 15;BA.debugLine="Public COLUMN_NONE As String = \"\"";
_column_none = "";
 //BA.debugLineNum = 16;BA.debugLine="Public COLUMN_TIME As String = \"time\"";
_column_time = "time";
 //BA.debugLineNum = 17;BA.debugLine="Public COLUMN_DATETIME As String = \"datetime\"";
_column_datetime = "datetime";
 //BA.debugLineNum = 18;BA.debugLine="Public COLUMN_IMAGE As String = \"image\"";
_column_image = "image";
 //BA.debugLineNum = 19;BA.debugLine="Public COLUMN_MONEY As String = \"money\"";
_column_money = "money";
 //BA.debugLineNum = 20;BA.debugLine="Public COLUMN_FILESIZE As String = \"filesize\"";
_column_filesize = "filesize";
 //BA.debugLineNum = 21;BA.debugLine="Public COLUMN_CHIP As String = \"chip\"";
_column_chip = "chip";
 //BA.debugLineNum = 22;BA.debugLine="Public COLUMN_EDIT As String = \"edit\"";
_column_edit = "edit";
 //BA.debugLineNum = 23;BA.debugLine="Public COLUMN_DELETE As String = \"delete\"";
_column_delete = "delete";
 //BA.debugLineNum = 24;BA.debugLine="Public COLUMN_ACTION As String = \"action\"";
_column_action = "action";
 //BA.debugLineNum = 25;BA.debugLine="Public COLUMN_SWITCH As String = \"switch\"";
_column_switch = "switch";
 //BA.debugLineNum = 26;BA.debugLine="Public COLUMN_AVATARIMG As String = \"avatarimg\"";
_column_avatarimg = "avatarimg";
 //BA.debugLineNum = 27;BA.debugLine="Public COLUMN_RATING As String = \"rating\"";
_column_rating = "rating";
 //BA.debugLineNum = 28;BA.debugLine="Public COLUMN_PROGRESS_CIRCULAR As String = \"prog";
_column_progress_circular = "progresscircular";
 //BA.debugLineNum = 29;BA.debugLine="Public COLUMN_PROGRESS_LINEAR As String = \"progre";
_column_progress_linear = "progresslinear";
 //BA.debugLineNum = 30;BA.debugLine="Public COLUMN_SAVE As String = \"save\"";
_column_save = "save";
 //BA.debugLineNum = 31;BA.debugLine="Public COLUMN_CANCEL As String = \"cancel\"";
_column_cancel = "cancel";
 //BA.debugLineNum = 34;BA.debugLine="Public ALIGN_CENTER As String = \"center\"";
_align_center = "center";
 //BA.debugLineNum = 35;BA.debugLine="Public ALIGN_RIGHT As String = \"end\"";
_align_right = "end";
 //BA.debugLineNum = 36;BA.debugLine="Public ALIGN_LEFT As String = \"start\"";
_align_left = "start";
 //BA.debugLineNum = 38;BA.debugLine="Private columnsM As Map";
_columnsm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 39;BA.debugLine="Private filters As List";
_filters = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 40;BA.debugLine="Private hasFilters As Boolean";
_hasfilters = false;
 //BA.debugLineNum = 41;BA.debugLine="Private exclusions As List";
_exclusions = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 43;BA.debugLine="Private headers As String";
_headers = "";
 //BA.debugLineNum = 44;BA.debugLine="Public vcard As VMCard";
_vcard = new b4j.example.vmcard();
 //BA.debugLineNum = 45;BA.debugLine="Private title As String";
_title = "";
 //BA.debugLineNum = 46;BA.debugLine="Private search As String";
_search = "";
 //BA.debugLineNum = 47;BA.debugLine="Private items As String";
_items = "";
 //BA.debugLineNum = 48;BA.debugLine="Type DataTableColumn(value As String, text As Str";
;
 //BA.debugLineNum = 50;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 51;BA.debugLine="Private hdr As List";
_hdr = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 52;BA.debugLine="Private keyID As String";
_keyid = "";
 //BA.debugLineNum = 53;BA.debugLine="Public masterColumns As List";
_mastercolumns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 54;BA.debugLine="Public CardTitle As VMCardTitle";
_cardtitle = new b4j.example.vmcardtitle();
 //BA.debugLineNum = 55;BA.debugLine="Private hasTotals As Boolean";
_hastotals = false;
 //BA.debugLineNum = 56;BA.debugLine="Private hasExternalPagination As Boolean";
_hasexternalpagination = false;
 //BA.debugLineNum = 57;BA.debugLine="Private totalVisible As String";
_totalvisible = "";
 //BA.debugLineNum = 58;BA.debugLine="Private selected As String";
_selected = "";
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _columnchooser() throws Exception{
anywheresoftware.b4a.objects.collections.List _cols = null;
 //BA.debugLineNum = 631;BA.debugLine="private Sub columnchooser";
 //BA.debugLineNum = 633;BA.debugLine="Dim cols As List = vue.GetData($\"${ID}columns\"$)";
_cols = new anywheresoftware.b4a.objects.collections.List();
_cols = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_vue._getdata /*Object*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"columns"))));
 //BA.debugLineNum = 634;BA.debugLine="ApplyFilter(cols)";
_applyfilter(_cols);
 //BA.debugLineNum = 635;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _disable() throws Exception{
 //BA.debugLineNum = 2380;BA.debugLine="Sub Disable As VMDataTable";
 //BA.debugLineNum = 2381;BA.debugLine="DataTable.Disable(True)";
_datatable._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 2382;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2383;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _enable() throws Exception{
 //BA.debugLineNum = 2374;BA.debugLine="Sub Enable As VMDataTable";
 //BA.debugLineNum = 2375;BA.debugLine="DataTable.Enable(True)";
_datatable._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 2376;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2377;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getdata() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 115;BA.debugLine="Sub GetData As List";
 //BA.debugLineNum = 116;BA.debugLine="Dim lst As List = vue.GetData(items)";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_vue._getdata /*Object*/ (_items)));
 //BA.debugLineNum = 117;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public String  _getdateformat(String _item,String _sformat) throws Exception{
String _svalue = "";
 //BA.debugLineNum = 2651;BA.debugLine="private Sub getdateformat(item As String, sFormat";
 //BA.debugLineNum = 2652;BA.debugLine="Dim svalue As String = vue.DateFormat(item, sForm";
_svalue = _vue._dateformat /*String*/ (_item,_sformat);
 //BA.debugLineNum = 2653;BA.debugLine="Return svalue";
if (true) return _svalue;
 //BA.debugLineNum = 2654;BA.debugLine="End Sub";
return "";
}
public String  _getfilesize(String _item) throws Exception{
String _svalue = "";
 //BA.debugLineNum = 2662;BA.debugLine="private Sub getfilesize(item As String) As String";
 //BA.debugLineNum = 2663;BA.debugLine="Dim svalue As String = vue.FormatFileSize(item)";
_svalue = _vue._formatfilesize /*String*/ ((float)(Double.parseDouble(_item)));
 //BA.debugLineNum = 2664;BA.debugLine="Return svalue";
if (true) return _svalue;
 //BA.debugLineNum = 2665;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getitemkeys(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _xlist = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _xkey = "";
 //BA.debugLineNum = 121;BA.debugLine="Sub GetItemKeys(lst As List) As List";
 //BA.debugLineNum = 122;BA.debugLine="Dim xlist As List";
_xlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 123;BA.debugLine="xlist.Initialize";
_xlist.Initialize();
 //BA.debugLineNum = 124;BA.debugLine="For Each m As Map In lst";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group3.Get(index3)));
 //BA.debugLineNum = 125;BA.debugLine="Dim xkey As String = m.GetDefault(PrimaryKey, \"\"";
_xkey = BA.ObjectToString(_m.GetDefault((Object)(_primarykey),(Object)("")));
 //BA.debugLineNum = 126;BA.debugLine="xlist.Add(xkey)";
_xlist.Add((Object)(_xkey));
 }
};
 //BA.debugLineNum = 128;BA.debugLine="Return xlist";
if (true) return _xlist;
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public String  _getmoneyformat(String _item) throws Exception{
String _svalue = "";
 //BA.debugLineNum = 2657;BA.debugLine="private Sub getmoneyformat(item As String) As Stri";
 //BA.debugLineNum = 2658;BA.debugLine="Dim svalue As String = vue.MakeMoney(item)";
_svalue = _vue._makemoney /*String*/ (_item);
 //BA.debugLineNum = 2659;BA.debugLine="Return svalue";
if (true) return _svalue;
 //BA.debugLineNum = 2660;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getselected() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 109;BA.debugLine="Sub GetSelected As List";
 //BA.debugLineNum = 110;BA.debugLine="Dim lst As List = vue.GetData(selected)";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_vue._getdata /*Object*/ (_selected)));
 //BA.debugLineNum = 111;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getselectedcolumns() throws Exception{
anywheresoftware.b4a.objects.collections.List _cols = null;
 //BA.debugLineNum = 638;BA.debugLine="Sub GetSelectedColumns As List";
 //BA.debugLineNum = 639;BA.debugLine="Dim cols As List = vue.GetData($\"${ID}columns\"$)";
_cols = new anywheresoftware.b4a.objects.collections.List();
_cols = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_vue._getdata /*Object*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"columns"))));
 //BA.debugLineNum = 640;BA.debugLine="Return cols";
if (true) return _cols;
 //BA.debugLineNum = 641;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _hide() throws Exception{
 //BA.debugLineNum = 2362;BA.debugLine="Sub Hide As VMDataTable";
 //BA.debugLineNum = 2363;BA.debugLine="vcard.SetVisible(False)";
_vcard._setvisible /*b4j.example.vmcard*/ (__c.False);
 //BA.debugLineNum = 2364;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2365;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _sprimarykey,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 62;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 63;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 64;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 65;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 66;BA.debugLine="keyID = $\"${ID}key\"$";
_keyid = (""+__c.SmartStringFormatter("",(Object)(_id))+"key");
 //BA.debugLineNum = 67;BA.debugLine="DataTable.Initialize(v, ID)";
_datatable._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 68;BA.debugLine="DataTable.SetTag(\"v-data-table\")";
_datatable._settag /*b4j.example.vmelement*/ ("v-data-table");
 //BA.debugLineNum = 69;BA.debugLine="vcard.Initialize(vue, $\"${ID}card\"$, Module)";
_vcard._initialize /*b4j.example.vmcard*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"card"),_module);
 //BA.debugLineNum = 70;BA.debugLine="CardTitle = vcard.Title";
_cardtitle = _vcard._title /*b4j.example.vmcardtitle*/ ;
 //BA.debugLineNum = 71;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 72;BA.debugLine="filters.Initialize";
_filters.Initialize();
 //BA.debugLineNum = 73;BA.debugLine="hasFilters = False";
_hasfilters = __c.False;
 //BA.debugLineNum = 74;BA.debugLine="exclusions.Initialize";
_exclusions.Initialize();
 //BA.debugLineNum = 75;BA.debugLine="headers = $\"${ID}headers\"$";
_headers = (""+__c.SmartStringFormatter("",(Object)(_id))+"headers");
 //BA.debugLineNum = 76;BA.debugLine="title = $\"${ID}title\"$";
_title = (""+__c.SmartStringFormatter("",(Object)(_id))+"title");
 //BA.debugLineNum = 77;BA.debugLine="search = $\"${ID}search\"$";
_search = (""+__c.SmartStringFormatter("",(Object)(_id))+"search");
 //BA.debugLineNum = 78;BA.debugLine="items = $\"${ID}items\"$";
_items = (""+__c.SmartStringFormatter("",(Object)(_id))+"items");
 //BA.debugLineNum = 79;BA.debugLine="selected = $\"${ID}selected\"$";
_selected = (""+__c.SmartStringFormatter("",(Object)(_id))+"selected");
 //BA.debugLineNum = 80;BA.debugLine="vue.SetData(headers, vue.newlist)";
_vue._setdata /*b4j.example.bananovue*/ (_headers,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 81;BA.debugLine="vue.SetData(items, vue.newlist)";
_vue._setdata /*b4j.example.bananovue*/ (_items,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 82;BA.debugLine="vue.SetData(title, \"\")";
_vue._setdata /*b4j.example.bananovue*/ (_title,(Object)(""));
 //BA.debugLineNum = 83;BA.debugLine="vue.SetData(selected, vue.NewList)";
_vue._setdata /*b4j.example.bananovue*/ (_selected,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 84;BA.debugLine="PrimaryKey = sPrimaryKey";
_primarykey = _sprimarykey;
 //BA.debugLineNum = 85;BA.debugLine="SetSortBy(vue.newlist)";
_setsortby(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 86;BA.debugLine="SetGroupBy(vue.NewList)";
_setgroupby(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 87;BA.debugLine="SetExpanded(vue.NewList)";
_setexpanded(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 88;BA.debugLine="SetGroupDesc(vue.NewList)";
_setgroupdesc(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 89;BA.debugLine="SetSortDesc(vue.NewList)";
_setsortdesc(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 90;BA.debugLine="SetValue(vue.NewList)";
_setvalue(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 92;BA.debugLine="vcard.IsDialog = False";
_vcard._isdialog /*boolean*/  = __c.False;
 //BA.debugLineNum = 93;BA.debugLine="vcard.IsTable = True	'";
_vcard._istable /*boolean*/  = __c.True;
 //BA.debugLineNum = 94;BA.debugLine="columnsM.Initialize";
_columnsm.Initialize();
 //BA.debugLineNum = 95;BA.debugLine="masterColumns.Initialize";
_mastercolumns.Initialize();
 //BA.debugLineNum = 96;BA.debugLine="hasTotals = False";
_hastotals = __c.False;
 //BA.debugLineNum = 97;BA.debugLine="hasExternalPagination = False";
_hasexternalpagination = __c.False;
 //BA.debugLineNum = 98;BA.debugLine="totalVisible = \"\"";
_totalvisible = "";
 //BA.debugLineNum = 99;BA.debugLine="SetVModel(selected)";
_setvmodel(_selected);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 1489;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 1490;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 1491;BA.debugLine="End Sub";
return "";
}
public String  _refresh() throws Exception{
String _dt = "";
 //BA.debugLineNum = 1450;BA.debugLine="Sub Refresh";
 //BA.debugLineNum = 1451;BA.debugLine="Dim dt As String = DateTime.now";
_dt = BA.NumberToString(__c.DateTime.getNow());
 //BA.debugLineNum = 1452;BA.debugLine="vue.SetData(keyID, dt)";
_vue._setdata /*b4j.example.bananovue*/ (_keyid,(Object)(_dt));
 //BA.debugLineNum = 1453;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 2421;BA.debugLine="public Sub RemoveAttr(sName As String) As VMDataTa";
 //BA.debugLineNum = 2422;BA.debugLine="DataTable.RemoveAttr(sName)";
_datatable._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 2423;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2424;BA.debugLine="End Sub";
return null;
}
public String  _removefilter_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 627;BA.debugLine="private Sub removefilter_click(e As BANanoEvent)";
 //BA.debugLineNum = 628;BA.debugLine="ApplyFilter(masterColumns)";
_applyfilter(_mastercolumns);
 //BA.debugLineNum = 629;BA.debugLine="End Sub";
return "";
}
public String  _removesort_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 493;BA.debugLine="Sub removesort_click(e As BANanoEvent)";
 //BA.debugLineNum = 494;BA.debugLine="SetSortBy(vue.NewList)";
_setsortby(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 1466;BA.debugLine="Sub Render";
 //BA.debugLineNum = 1467;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 1468;BA.debugLine="End Sub";
return "";
}
public String  _reset() throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub Reset";
 //BA.debugLineNum = 189;BA.debugLine="exclusions.Initialize";
_exclusions.Initialize();
 //BA.debugLineNum = 190;BA.debugLine="filters.Initialize";
_filters.Initialize();
 //BA.debugLineNum = 191;BA.debugLine="hasFilters = False";
_hasfilters = __c.False;
 //BA.debugLineNum = 192;BA.debugLine="columnsM.Initialize";
_columnsm.Initialize();
 //BA.debugLineNum = 193;BA.debugLine="masterColumns.Initialize";
_mastercolumns.Initialize();
 //BA.debugLineNum = 194;BA.debugLine="vue.SetData(headers, vue.newlist)";
_vue._setdata /*b4j.example.bananovue*/ (_headers,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 195;BA.debugLine="vue.SetData(items, vue.newlist)";
_vue._setdata /*b4j.example.bananovue*/ (_items,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 196;BA.debugLine="vue.SetData(title, \"\")";
_vue._setdata /*b4j.example.bananovue*/ (_title,(Object)(""));
 //BA.debugLineNum = 197;BA.debugLine="vue.SetData(selected, vue.NewList)";
_vue._setdata /*b4j.example.bananovue*/ (_selected,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 198;BA.debugLine="SetSortBy(vue.newlist)";
_setsortby(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 199;BA.debugLine="SetGroupBy(vue.NewList)";
_setgroupby(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 200;BA.debugLine="SetExpanded(vue.NewList)";
_setexpanded(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 201;BA.debugLine="SetGroupDesc(vue.NewList)";
_setgroupdesc(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 202;BA.debugLine="SetSortDesc(vue.NewList)";
_setsortdesc(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 203;BA.debugLine="SetValue(vue.NewList)";
_setvalue(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 204;BA.debugLine="vue.SetData($\"${ID}columns\"$, vue.newlist)";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"columns"),(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 205;BA.debugLine="vue.SetData($\"${ID}fsource\"$, vue.newlist)";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"fsource"),(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 206;BA.debugLine="SetPage(\"1\")";
_setpage("1");
 //BA.debugLineNum = 207;BA.debugLine="vue.SetData($\"${ID}pagecount\"$, \"0\")";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"pagecount"),(Object)("0"));
 //BA.debugLineNum = 208;BA.debugLine="vue.SetData(keyID, DateTime.Now)";
_vue._setdata /*b4j.example.bananovue*/ (_keyid,(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public String  _resetcolumns() throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub ResetColumns";
 //BA.debugLineNum = 214;BA.debugLine="BuildHeaders(columnsM)";
_buildheaders(_columnsm);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public String  _resetfilter() throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub ResetFilter";
 //BA.debugLineNum = 144;BA.debugLine="ApplyFilter(masterColumns)";
_applyfilter(_mastercolumns);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _setaddnew(String _key,String _iconname,String _tooltip) throws Exception{
 //BA.debugLineNum = 441;BA.debugLine="Sub SetAddNew(key As String, iconName As String, t";
 //BA.debugLineNum = 442;BA.debugLine="AddNew(key, iconName, toolTip)";
_addnew(_key,_iconname,_tooltip);
 //BA.debugLineNum = 443;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 1500;BA.debugLine="Sub SetAttr(attr As Map) As VMDataTable";
 //BA.debugLineNum = 1501;BA.debugLine="DataTable.SetAttr(attr)";
_datatable._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 1502;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1503;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 2487;BA.debugLine="Sub SetAttributes(attrs As List) As VMDataTable";
 //BA.debugLineNum = 2488;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2489;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 2491;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2492;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 2394;BA.debugLine="Sub SetAttrLoose(loose As String) As VMDataTable";
 //BA.debugLineNum = 2395;BA.debugLine="DataTable.SetAttrLoose(loose)";
_datatable._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 2396;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2397;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 2465;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 2466;BA.debugLine="DataTable.SetAttrSingle(prop, value)";
_datatable._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 2467;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2468;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcalculatewidths(boolean _varcalculatewidths) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1519;BA.debugLine="Sub SetCalculateWidths(varCalculateWidths As Boole";
 //BA.debugLineNum = 1520;BA.debugLine="If varCalculateWidths = False Then Return Me";
if (_varcalculatewidths==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1521;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1522;BA.debugLine="SetAttrSingle(\"calculate-widths\", varCalculateWi";
_setattrsingle("calculate-widths",BA.ObjectToString(_varcalculatewidths));
 //BA.debugLineNum = 1523;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1525;BA.debugLine="Dim pp As String = $\"${ID}CalculateWidths\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CalculateWidths");
 //BA.debugLineNum = 1526;BA.debugLine="vue.SetStateSingle(pp, varCalculateWidths)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcalculatewidths));
 //BA.debugLineNum = 1527;BA.debugLine="DataTable.Bind(\":calculate-widths\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":calculate-widths",_pp);
 //BA.debugLineNum = 1528;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1529;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcancel(boolean _b) throws Exception{
 //BA.debugLineNum = 390;BA.debugLine="Sub SetCancel(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 391;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 392;BA.debugLine="AddCancel(\"cancel\", \"Cancel\")";
_addcancel("cancel","Cancel");
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcaption(String _varcaption) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1752;BA.debugLine="Sub SetCaption(varCaption As String) As VMDataTabl";
 //BA.debugLineNum = 1753;BA.debugLine="If varCaption = \"\" Then Return Me";
if ((_varcaption).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1754;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1755;BA.debugLine="SetAttrSingle(\"caption\", varCaption)";
_setattrsingle("caption",_varcaption);
 //BA.debugLineNum = 1756;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1758;BA.debugLine="Dim pp As String = $\"${ID}Caption\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Caption");
 //BA.debugLineNum = 1759;BA.debugLine="vue.SetStateSingle(pp, varCaption)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcaption));
 //BA.debugLineNum = 1760;BA.debugLine="DataTable.Bind(\":caption\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":caption",_pp);
 //BA.debugLineNum = 1761;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1762;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcenteraligncolumns(anywheresoftware.b4a.objects.collections.List _flds) throws Exception{
String _k = "";
 //BA.debugLineNum = 2509;BA.debugLine="Sub SetCenterAlignColumns(flds As List) As VMDataT";
 //BA.debugLineNum = 2510;BA.debugLine="For Each k As String In flds";
{
final anywheresoftware.b4a.BA.IterableList group1 = _flds;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2511;BA.debugLine="SetColumnAlignment(k, ALIGN_CENTER)";
_setcolumnalignment(_k,_align_center);
 }
};
 //BA.debugLineNum = 2513;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2514;BA.debugLine="End Sub";
return null;
}
public String  _setclearsort() throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 480;BA.debugLine="Sub SetClearSort";
 //BA.debugLineNum = 481;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 482;BA.debugLine="btn.Initialize(vue, \"removesort\", Me)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,"removesort",this);
 //BA.debugLineNum = 483;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 484;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 485;BA.debugLine="btn.SetToolTip(\"Clear Sort\")";
_btn._settooltip /*b4j.example.vmbutton*/ ("Clear Sort");
 //BA.debugLineNum = 486;BA.debugLine="btn.AddIcon(\"mdi-sort-variant-remove\",\"\",\"\")";
_btn._addicon /*b4j.example.vmbutton*/ ("mdi-sort-variant-remove","","");
 //BA.debugLineNum = 487;BA.debugLine="btn.SetColor(\"orange\")";
_btn._setcolor /*b4j.example.vmbutton*/ ("orange");
 //BA.debugLineNum = 488;BA.debugLine="btn.SetAttrLoose(\"icon\")";
_btn._setattrloose /*b4j.example.vmbutton*/ ("icon");
 //BA.debugLineNum = 489;BA.debugLine="btn.SetTransparent(True)";
_btn._settransparent /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 490;BA.debugLine="vcard.Title.AddComponent(btn.tostring)";
_vcard._title /*b4j.example.vmcardtitle*/ ._addcomponent /*b4j.example.vmcardtitle*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 491;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _setclone(boolean _b) throws Exception{
 //BA.debugLineNum = 421;BA.debugLine="Sub SetClone(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 422;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 423;BA.debugLine="AddClone";
_addclone();
 //BA.debugLineNum = 424;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 2412;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 2413;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 2414;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 2415;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 2416;BA.debugLine="DataTable.Bind(\":color\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 2417;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2418;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcolumnalignment(String _colname,String _colalign) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
 //BA.debugLineNum = 976;BA.debugLine="Sub SetColumnAlignment(colName As String, colAlign";
 //BA.debugLineNum = 977;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 978;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 979;BA.debugLine="col.align = colAlign";
_col.align /*String*/  = _colalign;
 //BA.debugLineNum = 980;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 };
 //BA.debugLineNum = 982;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 983;BA.debugLine="End Sub";
return null;
}
public String  _setcolumnchooser(boolean _isfilter) throws Exception{
anywheresoftware.b4a.objects.collections.List _ftime = null;
anywheresoftware.b4a.objects.collections.List _fsource = null;
String _colname = "";
b4j.example.vmdatatable._datatablecolumn _colm = null;
String _coltext = "";
anywheresoftware.b4a.objects.collections.Map _cols = null;
String _dsource = "";
String _dtkey = "";
String _dttitle = "";
b4j.example.vmmenu _dtmenu = null;
b4j.example.vmtemplate _tmpact = null;
b4j.example.vmbutton _btnmenu = null;
b4j.example.vmicon _btnicon = null;
b4j.example.vmlist _dtlist = null;
b4j.example.vmlistitemgroup _vlig = null;
b4j.example.vmlistitem _dtli = null;
b4j.example.vmtemplate _tmpx = null;
b4j.example.vmlistitemaction _vlia = null;
b4j.example.vmcheckbox _vliacb = null;
b4j.example.vmlistitemcontent _vlic = null;
b4j.example.vmlistitemtitle _vlit = null;
String _smenu = "";
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 498;BA.debugLine="Sub SetColumnChooser(isfilter As Boolean)";
 //BA.debugLineNum = 499;BA.debugLine="If isfilter = False Then Return";
if (_isfilter==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 501;BA.debugLine="Dim ftime As List = vue.newlist";
_ftime = new anywheresoftware.b4a.objects.collections.List();
_ftime = _vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 502;BA.debugLine="Dim fsource As List = vue.newlist";
_fsource = new anywheresoftware.b4a.objects.collections.List();
_fsource = _vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 503;BA.debugLine="For Each colname As String In masterColumns";
{
final anywheresoftware.b4a.BA.IterableList group4 = _mastercolumns;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_colname = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 504;BA.debugLine="Dim colm As DataTableColumn = columnsM.Get(colna";
_colm = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 505;BA.debugLine="Dim coltext As String = colm.text";
_coltext = _colm.text /*String*/ ;
 //BA.debugLineNum = 507;BA.debugLine="ftime.add(colname)";
_ftime.Add((Object)(_colname));
 //BA.debugLineNum = 509;BA.debugLine="Dim cols As Map = CreateMap()";
_cols = new anywheresoftware.b4a.objects.collections.Map();
_cols = __c.createMap(new Object[] {});
 //BA.debugLineNum = 510;BA.debugLine="cols.Put(\"id\", colname)";
_cols.Put((Object)("id"),(Object)(_colname));
 //BA.debugLineNum = 511;BA.debugLine="cols.Put(\"text\", coltext)";
_cols.Put((Object)("text"),(Object)(_coltext));
 //BA.debugLineNum = 512;BA.debugLine="fsource.Add(cols)";
_fsource.Add((Object)(_cols.getObject()));
 }
};
 //BA.debugLineNum = 515;BA.debugLine="vue.SetData($\"${ID}columns\"$, ftime)";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"columns"),(Object)(_ftime.getObject()));
 //BA.debugLineNum = 517;BA.debugLine="vue.SetData($\"${ID}fsource\"$, fsource)";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"fsource"),(Object)(_fsource.getObject()));
 //BA.debugLineNum = 519;BA.debugLine="Dim dSource As String = $\"${ID}fsource\"$";
_dsource = (""+__c.SmartStringFormatter("",(Object)(_id))+"fsource");
 //BA.debugLineNum = 520;BA.debugLine="Dim dtKey As String = \"id\"";
_dtkey = "id";
 //BA.debugLineNum = 521;BA.debugLine="Dim dtTitle As String = \"text\"";
_dttitle = "text";
 //BA.debugLineNum = 523;BA.debugLine="Dim dtMenu As VMMenu";
_dtmenu = new b4j.example.vmmenu();
 //BA.debugLineNum = 524;BA.debugLine="dtMenu.Initialize(vue, $\"${ID}fsmenu\"$, Me)";
_dtmenu._initialize /*b4j.example.vmmenu*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"fsmenu"),this);
 //BA.debugLineNum = 525;BA.debugLine="dtMenu.SetOpenOnHover(False)";
_dtmenu._setopenonhover /*b4j.example.vmmenu*/ (__c.False);
 //BA.debugLineNum = 526;BA.debugLine="dtMenu.SetOffSetY(True)";
_dtmenu._setoffsety /*b4j.example.vmmenu*/ (__c.True);
 //BA.debugLineNum = 528;BA.debugLine="dtMenu.SetAttrSingle(\":close-on-content-click\", \"";
_dtmenu._setattrsingle /*b4j.example.vmmenu*/ (":close-on-content-click","false");
 //BA.debugLineNum = 530;BA.debugLine="Dim tmpact As VMTemplate";
_tmpact = new b4j.example.vmtemplate();
 //BA.debugLineNum = 531;BA.debugLine="tmpact.Initialize(vue, \"\", Me)";
_tmpact._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",this);
 //BA.debugLineNum = 532;BA.debugLine="tmpact.SetAttrSingle(\"v-slot:activator\", \"{ on, a";
_tmpact._setattrsingle /*b4j.example.vmtemplate*/ ("v-slot:activator","{ on, attrs }");
 //BA.debugLineNum = 535;BA.debugLine="Dim btnMenu As VMButton";
_btnmenu = new b4j.example.vmbutton();
 //BA.debugLineNum = 536;BA.debugLine="btnMenu.Initialize(vue, $\"${ID}fsbutton\"$, Me)";
_btnmenu._initialize /*b4j.example.vmbutton*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"fsbutton"),this);
 //BA.debugLineNum = 537;BA.debugLine="btnMenu.SetAttrLoose(\"icon\")";
_btnmenu._setattrloose /*b4j.example.vmbutton*/ ("icon");
 //BA.debugLineNum = 538;BA.debugLine="btnMenu.SetAttrSingle(\"v-on\", \"on\")";
_btnmenu._setattrsingle /*b4j.example.vmbutton*/ ("v-on","on");
 //BA.debugLineNum = 539;BA.debugLine="btnMenu.SetAttrSingle(\"v-bind\", \"attrs\")";
_btnmenu._setattrsingle /*b4j.example.vmbutton*/ ("v-bind","attrs");
 //BA.debugLineNum = 540;BA.debugLine="btnMenu.Show";
_btnmenu._show /*b4j.example.vmbutton*/ ();
 //BA.debugLineNum = 542;BA.debugLine="Dim btnIcon As VMIcon";
_btnicon = new b4j.example.vmicon();
 //BA.debugLineNum = 543;BA.debugLine="btnIcon.initialize(vue, $\"${ID}fsicon\"$, Me)";
_btnicon._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"fsicon"),this);
 //BA.debugLineNum = 544;BA.debugLine="btnIcon.SetText(\"more_vert\")";
_btnicon._settext /*b4j.example.vmicon*/ ("more_vert");
 //BA.debugLineNum = 546;BA.debugLine="btnMenu.AddComponent(btnIcon.tostring)";
_btnmenu._addcomponent /*b4j.example.vmbutton*/ (_btnicon._tostring /*String*/ ());
 //BA.debugLineNum = 548;BA.debugLine="tmpact.AddComponent(btnMenu.ToString)";
_tmpact._addcomponent /*b4j.example.vmtemplate*/ (_btnmenu._tostring /*String*/ ());
 //BA.debugLineNum = 550;BA.debugLine="dtMenu.AddComponent(tmpact.tostring)";
_dtmenu._addcomponent /*b4j.example.vmmenu*/ (_tmpact._tostring /*String*/ ());
 //BA.debugLineNum = 552;BA.debugLine="Dim dtList As VMList";
_dtlist = new b4j.example.vmlist();
 //BA.debugLineNum = 553;BA.debugLine="dtList.Initialize(vue, $\"${ID}list\"$, Me)";
_dtlist._initialize /*b4j.example.vmlist*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"list"),this);
 //BA.debugLineNum = 554;BA.debugLine="dtList.SetDense(True)";
_dtlist._setdense /*b4j.example.vmlist*/ (__c.True);
 //BA.debugLineNum = 556;BA.debugLine="Dim vlig As VMListItemGroup";
_vlig = new b4j.example.vmlistitemgroup();
 //BA.debugLineNum = 557;BA.debugLine="vlig.Initialize(vue, $\"${ID}lig\"$, Me)";
_vlig._initialize /*b4j.example.vmlistitemgroup*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"lig"),this);
 //BA.debugLineNum = 558;BA.debugLine="vlig.SetVModel($\"${ID}columns\"$)";
_vlig._setvmodel /*b4j.example.vmlistitemgroup*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"columns"));
 //BA.debugLineNum = 559;BA.debugLine="vlig.SetAttrLoose(\"multiple\")";
_vlig._setattrloose /*b4j.example.vmlistitemgroup*/ ("multiple");
 //BA.debugLineNum = 560;BA.debugLine="vlig.SetOnChange(\"columnchooser\")";
_vlig._setonchange /*b4j.example.vmlistitemgroup*/ ("columnchooser");
 //BA.debugLineNum = 562;BA.debugLine="Dim dtLI As VMListItem";
_dtli = new b4j.example.vmlistitem();
 //BA.debugLineNum = 563;BA.debugLine="dtLI.Initialize(vue, \"\", Me)";
_dtli._initialize /*b4j.example.vmlistitem*/ (ba,_vue,"",this);
 //BA.debugLineNum = 564;BA.debugLine="dtLI.SetAttrSingle(\"v-for\", $\"(item, index) in ${";
_dtli._setattrsingle /*b4j.example.vmlistitem*/ ("v-for",("(item, index) in "+__c.SmartStringFormatter("",(Object)(_dsource))+""));
 //BA.debugLineNum = 565;BA.debugLine="dtLI.SetAttrSingle(\":key\", $\"item.${dtKey}\"$)";
_dtli._setattrsingle /*b4j.example.vmlistitem*/ (":key",("item."+__c.SmartStringFormatter("",(Object)(_dtkey))+""));
 //BA.debugLineNum = 566;BA.debugLine="dtLI.SetAttrSingle(\":value\", $\"item.${dtKey}\"$)";
_dtli._setattrsingle /*b4j.example.vmlistitem*/ (":value",("item."+__c.SmartStringFormatter("",(Object)(_dtkey))+""));
 //BA.debugLineNum = 568;BA.debugLine="Dim tmpx As VMTemplate";
_tmpx = new b4j.example.vmtemplate();
 //BA.debugLineNum = 569;BA.debugLine="tmpx.Initialize(vue, \"\", Me)";
_tmpx._initialize /*b4j.example.vmtemplate*/ (ba,_vue,"",this);
 //BA.debugLineNum = 570;BA.debugLine="tmpx.SetAttrSingle(\"v-slot:default\", \"{ active, t";
_tmpx._setattrsingle /*b4j.example.vmtemplate*/ ("v-slot:default","{ active, toggle }");
 //BA.debugLineNum = 572;BA.debugLine="Dim vlia As VMListItemAction";
_vlia = new b4j.example.vmlistitemaction();
 //BA.debugLineNum = 573;BA.debugLine="vlia.Initialize(vue, \"\", Me)";
_vlia._initialize /*b4j.example.vmlistitemaction*/ (ba,_vue,"",this);
 //BA.debugLineNum = 575;BA.debugLine="Dim vliacb As VMCheckBox";
_vliacb = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 576;BA.debugLine="vliacb.Initialize(vue, \"\", Me)";
_vliacb._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,"",this);
 //BA.debugLineNum = 577;BA.debugLine="vliacb.SetStatic(bStatic)";
_vliacb._setstatic /*b4j.example.vmcheckbox*/ (_bstatic);
 //BA.debugLineNum = 578;BA.debugLine="vliacb.SetAttrSingle(\":input-value\", \"active\")";
_vliacb._setattrsingle /*b4j.example.vmcheckbox*/ (":input-value","active");
 //BA.debugLineNum = 579;BA.debugLine="vliacb.SetAttrSingle(\":key\", $\"item.${dtKey}\"$)";
_vliacb._setattrsingle /*b4j.example.vmcheckbox*/ (":key",("item."+__c.SmartStringFormatter("",(Object)(_dtkey))+""));
 //BA.debugLineNum = 580;BA.debugLine="vliacb.SetAttrSingle(\":true-value\", $\"item.${dtKe";
_vliacb._setattrsingle /*b4j.example.vmcheckbox*/ (":true-value",("item."+__c.SmartStringFormatter("",(Object)(_dtkey))+""));
 //BA.debugLineNum = 581;BA.debugLine="vliacb.SetColor(\"primary\")";
_vliacb._setcolor /*b4j.example.vmcheckbox*/ ("primary");
 //BA.debugLineNum = 582;BA.debugLine="vliacb.SetDense(True)";
_vliacb._setdense /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 583;BA.debugLine="vliacb.SetAttrSingle(\"@click\", \"toggle\")";
_vliacb._setattrsingle /*b4j.example.vmcheckbox*/ ("@click","toggle");
 //BA.debugLineNum = 586;BA.debugLine="vlia.AddComponent(vliacb.tostring)";
_vlia._addcomponent /*b4j.example.vmlistitemaction*/ (_vliacb._tostring /*String*/ ());
 //BA.debugLineNum = 587;BA.debugLine="tmpx.AddComponent(vlia.ToString)";
_tmpx._addcomponent /*b4j.example.vmtemplate*/ (_vlia._tostring /*String*/ ());
 //BA.debugLineNum = 590;BA.debugLine="Dim vlic As VMListItemContent";
_vlic = new b4j.example.vmlistitemcontent();
 //BA.debugLineNum = 591;BA.debugLine="vlic.Initialize(vue, \"\", Me)";
_vlic._initialize /*b4j.example.vmlistitemcontent*/ (ba,_vue,"",this);
 //BA.debugLineNum = 592;BA.debugLine="Dim vlit As VMListItemTitle";
_vlit = new b4j.example.vmlistitemtitle();
 //BA.debugLineNum = 593;BA.debugLine="vlit.Initialize(vue, \"\", Me)";
_vlit._initialize /*b4j.example.vmlistitemtitle*/ (ba,_vue,"",this);
 //BA.debugLineNum = 594;BA.debugLine="vlit.SetStatic(bStatic)";
_vlit._setstatic /*b4j.example.vmlistitemtitle*/ (_bstatic);
 //BA.debugLineNum = 595;BA.debugLine="vlit.SetVText($\"item.${dtTitle}\"$)";
_vlit._setvtext /*b4j.example.vmlistitemtitle*/ (("item."+__c.SmartStringFormatter("",(Object)(_dttitle))+""));
 //BA.debugLineNum = 596;BA.debugLine="vlic.AddComponent(vlit.ToString)";
_vlic._addcomponent /*b4j.example.vmlistitemcontent*/ (_vlit._tostring /*String*/ ());
 //BA.debugLineNum = 598;BA.debugLine="tmpx.AddComponent(vlic.ToString)";
_tmpx._addcomponent /*b4j.example.vmtemplate*/ (_vlic._tostring /*String*/ ());
 //BA.debugLineNum = 599;BA.debugLine="dtLI.AddComponent(tmpx.tostring)";
_dtli._addcomponent /*b4j.example.vmlistitem*/ (_tmpx._tostring /*String*/ ());
 //BA.debugLineNum = 601;BA.debugLine="vlig.AddComponent(dtLI.ToString)";
_vlig._addcomponent /*b4j.example.vmlistitemgroup*/ (_dtli._tostring /*String*/ ());
 //BA.debugLineNum = 603;BA.debugLine="dtList.AddComponent(vlig.tostring)";
_dtlist._addcomponent /*b4j.example.vmlist*/ (_vlig._tostring /*String*/ ());
 //BA.debugLineNum = 605;BA.debugLine="dtMenu.AddComponent(dtList.Tostring)";
_dtmenu._addcomponent /*b4j.example.vmmenu*/ (_dtlist._tostring /*String*/ ());
 //BA.debugLineNum = 607;BA.debugLine="Dim smenu As String = dtMenu.ToString";
_smenu = _dtmenu._tostring /*String*/ ();
 //BA.debugLineNum = 608;BA.debugLine="vcard.Title.AddComponent(smenu)";
_vcard._title /*b4j.example.vmcardtitle*/ ._addcomponent /*b4j.example.vmcardtitle*/ (_smenu);
 //BA.debugLineNum = 611;BA.debugLine="vcard.Title.AddDivider(True,Null,Null,Array(\"mx-2";
_vcard._title /*b4j.example.vmcardtitle*/ ._adddivider /*b4j.example.vmcardtitle*/ (__c.True,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__c.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__c.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("mx-2")}),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 613;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 614;BA.debugLine="btn.Initialize(vue, \"removefilter\", Me)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,"removefilter",this);
 //BA.debugLineNum = 615;BA.debugLine="btn.SetStatic(bStatic)";
_btn._setstatic /*b4j.example.vmbutton*/ (_bstatic);
 //BA.debugLineNum = 616;BA.debugLine="btn.SetDesignMode(DesignMode)";
_btn._setdesignmode /*b4j.example.vmbutton*/ (_designmode);
 //BA.debugLineNum = 617;BA.debugLine="btn.SetToolTip(\"Reset filter\")";
_btn._settooltip /*b4j.example.vmbutton*/ ("Reset filter");
 //BA.debugLineNum = 618;BA.debugLine="btn.AddIcon(\"mdi-filter-remove\",\"\",\"\")";
_btn._addicon /*b4j.example.vmbutton*/ ("mdi-filter-remove","","");
 //BA.debugLineNum = 619;BA.debugLine="btn.SetColor(\"red\")";
_btn._setcolor /*b4j.example.vmbutton*/ ("red");
 //BA.debugLineNum = 620;BA.debugLine="btn.SetAttrLoose(\"icon\")";
_btn._setattrloose /*b4j.example.vmbutton*/ ("icon");
 //BA.debugLineNum = 621;BA.debugLine="btn.SetTransparent(True)";
_btn._settransparent /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 622;BA.debugLine="vcard.Title.AddComponent(btn.tostring)";
_vcard._title /*b4j.example.vmcardtitle*/ ._addcomponent /*b4j.example.vmcardtitle*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 625;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _setcolumnclass(String _colname,String _colclass) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
 //BA.debugLineNum = 1081;BA.debugLine="Sub SetColumnClass(colName As String, colClass As";
 //BA.debugLineNum = 1082;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 1083;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 1084;BA.debugLine="col.classname = colClass";
_col.className /*String*/  = _colclass;
 //BA.debugLineNum = 1085;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 };
 //BA.debugLineNum = 1087;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1088;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcolumndateformat(String _colname,String _colformat) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2636;BA.debugLine="Sub SetColumnDateFormat(colName As String, colForm";
 //BA.debugLineNum = 2638;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 2639;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 2640;BA.debugLine="col.valueFormat = colFormat";
_col.valueFormat /*String*/  = _colformat;
 //BA.debugLineNum = 2641;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 //BA.debugLineNum = 2643;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2644;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"ge";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(this,"getdateformat",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_item.getObject()),(Object)(_colformat)}))));
 //BA.debugLineNum = 2646;BA.debugLine="vue.SetCallBack(\"getdateformat\", cb)";
_vue._setcallback /*String*/ ("getdateformat",_cb);
 };
 //BA.debugLineNum = 2648;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2649;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcolumndisabled(String _colname,boolean _coldisabled) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
 //BA.debugLineNum = 956;BA.debugLine="Sub SetColumnDisabled(colName As String, colDisabl";
 //BA.debugLineNum = 957;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 958;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 959;BA.debugLine="col.Disabled = colDisabled";
_col.Disabled /*boolean*/  = _coldisabled;
 //BA.debugLineNum = 960;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 };
 //BA.debugLineNum = 962;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 963;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcolumnextra(String _colname,String _colextra) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
 //BA.debugLineNum = 986;BA.debugLine="Sub SetColumnExtra(colName As String, colExtra As";
 //BA.debugLineNum = 987;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 988;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 989;BA.debugLine="col.extra = colExtra";
_col.extra /*String*/  = _colextra;
 //BA.debugLineNum = 990;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 };
 //BA.debugLineNum = 992;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 993;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcolumnfilterable(String _colname,boolean _colfilter) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
 //BA.debugLineNum = 1071;BA.debugLine="Sub SetColumnFilterable(colName As String, colFilt";
 //BA.debugLineNum = 1072;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 1073;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 1074;BA.debugLine="col.filterable = colFilter";
_col.filterable /*boolean*/  = _colfilter;
 //BA.debugLineNum = 1075;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 };
 //BA.debugLineNum = 1077;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1078;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcolumnicon(String _colname,String _icon) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
 //BA.debugLineNum = 995;BA.debugLine="Sub SetColumnIcon(colName As String, icon As Strin";
 //BA.debugLineNum = 996;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 997;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 998;BA.debugLine="col.icon = icon";
_col.icon /*String*/  = _icon;
 //BA.debugLineNum = 999;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 };
 //BA.debugLineNum = 1001;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1002;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcolumnreadonly(String _colname,boolean _colreadonly) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
 //BA.debugLineNum = 966;BA.debugLine="Sub SetColumnReadOnly(colName As String, colReadOn";
 //BA.debugLineNum = 967;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 968;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 969;BA.debugLine="col.ReadOnly = colReadOnly";
_col.ReadOnly /*boolean*/  = _colreadonly;
 //BA.debugLineNum = 970;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 };
 //BA.debugLineNum = 972;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 973;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcolumnsalignmentcenter(anywheresoftware.b4a.objects.collections.List _flds) throws Exception{
 //BA.debugLineNum = 2517;BA.debugLine="Sub SetColumnsAlignmentCenter(flds As List) As VMD";
 //BA.debugLineNum = 2518;BA.debugLine="SetCenterAlignColumns(flds)";
_setcenteraligncolumns(_flds);
 //BA.debugLineNum = 2519;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2520;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcolumnsalignmentright(anywheresoftware.b4a.objects.collections.List _flds) throws Exception{
 //BA.debugLineNum = 2524;BA.debugLine="Sub SetColumnsAlignmentRight(flds As List) As VMDa";
 //BA.debugLineNum = 2525;BA.debugLine="SetRightAlignColumns(flds)";
_setrightaligncolumns(_flds);
 //BA.debugLineNum = 2526;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2527;BA.debugLine="End Sub";
return null;
}
public String  _setcolumnscheckbox(anywheresoftware.b4a.objects.collections.List _colfields) throws Exception{
String _col = "";
 //BA.debugLineNum = 328;BA.debugLine="Sub SetColumnsCheckBox(colFields As List)";
 //BA.debugLineNum = 329;BA.debugLine="For Each col As String In colFields";
{
final anywheresoftware.b4a.BA.IterableList group1 = _colfields;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 330;BA.debugLine="SetColumnType(col, COLUMN_CHECKBOX)";
_setcolumntype(_col,_column_checkbox);
 //BA.debugLineNum = 331;BA.debugLine="SetColumnFilterable(col,False)";
_setcolumnfilterable(_col,__c.False);
 //BA.debugLineNum = 332;BA.debugLine="SetColumnSortable(col, False)";
_setcolumnsortable(_col,__c.False);
 }
};
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _setcolumnsformatdate(anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
 //BA.debugLineNum = 2545;BA.debugLine="Sub SetColumnsFormatDate(dates As List) As VMDataT";
 //BA.debugLineNum = 2546;BA.debugLine="SetDateColumns(dates)";
_setdatecolumns(_dates);
 //BA.debugLineNum = 2547;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2548;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcolumnsformatdatetime(anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
 //BA.debugLineNum = 2576;BA.debugLine="Sub SetColumnsFormatDateTime(dates As List) As VMD";
 //BA.debugLineNum = 2577;BA.debugLine="SetDateTimeColumns(dates)";
_setdatetimecolumns(_dates);
 //BA.debugLineNum = 2578;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2579;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcolumnsformatfilesize(anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
 //BA.debugLineNum = 2589;BA.debugLine="Sub SetColumnsFormatFileSize(dates As List) As VMD";
 //BA.debugLineNum = 2590;BA.debugLine="SetFileSizeColumns(dates)";
_setfilesizecolumns(_dates);
 //BA.debugLineNum = 2591;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2592;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcolumnsformatmoney(anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
 //BA.debugLineNum = 2608;BA.debugLine="Sub SetColumnsFormatMoney(dates As List) As VMData";
 //BA.debugLineNum = 2609;BA.debugLine="SetMoneyColumns(dates)";
_setmoneycolumns(_dates);
 //BA.debugLineNum = 2610;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2611;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcolumnsformattime(anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
 //BA.debugLineNum = 2603;BA.debugLine="Sub SetColumnsFormatTime(dates As List) As VMDataT";
 //BA.debugLineNum = 2604;BA.debugLine="SetTimeColumns(dates)";
_settimecolumns(_dates);
 //BA.debugLineNum = 2605;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2606;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcolumnsortable(String _colname,boolean _colsortable) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
 //BA.debugLineNum = 946;BA.debugLine="Sub SetColumnSortable(colName As String, colSortab";
 //BA.debugLineNum = 947;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 948;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 949;BA.debugLine="col.sortable = colSortable";
_col.sortable /*boolean*/  = _colsortable;
 //BA.debugLineNum = 950;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 };
 //BA.debugLineNum = 952;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 953;BA.debugLine="End Sub";
return null;
}
public String  _setcolumnsswitch(anywheresoftware.b4a.objects.collections.List _colfields) throws Exception{
String _col = "";
 //BA.debugLineNum = 320;BA.debugLine="Sub SetColumnsSwitch(colFields As List)";
 //BA.debugLineNum = 321;BA.debugLine="For Each col As String In colFields";
{
final anywheresoftware.b4a.BA.IterableList group1 = _colfields;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 322;BA.debugLine="SetColumnType(col, COLUMN_SWITCH)";
_setcolumntype(_col,_column_switch);
 //BA.debugLineNum = 323;BA.debugLine="SetColumnFilterable(col,False)";
_setcolumnfilterable(_col,__c.False);
 //BA.debugLineNum = 324;BA.debugLine="SetColumnSortable(col, False)";
_setcolumnsortable(_col,__c.False);
 }
};
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _setcolumntotal(String _colname,String _callbackmethod) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
 //BA.debugLineNum = 924;BA.debugLine="Sub SetColumnTotal(colName As String, callBackMeth";
 //BA.debugLineNum = 925;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 926;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 927;BA.debugLine="col.bindTotals = callBackMethod";
_col.bindTotals /*String*/  = _callbackmethod;
 //BA.debugLineNum = 928;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 //BA.debugLineNum = 929;BA.debugLine="hasTotals = True";
_hastotals = __c.True;
 };
 //BA.debugLineNum = 931;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 932;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcolumntype(String _colname,String _coltype) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
com.ab.banano.BANanoObject _cb = null;
String _value = "";
 //BA.debugLineNum = 1115;BA.debugLine="Sub SetColumnType(colName As String, colType As St";
 //BA.debugLineNum = 1116;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 1117;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 1118;BA.debugLine="col.TypeOf = colType";
_col.TypeOf /*String*/  = _coltype;
 //BA.debugLineNum = 1119;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,_column_image,_column_avatarimg,_column_switch,_column_money,_column_filesize,_column_date,_column_time,_column_datetime)) {
case 0: 
case 1: 
case 2: {
 //BA.debugLineNum = 1121;BA.debugLine="col.filterable = False";
_col.filterable /*boolean*/  = __c.False;
 break; }
case 3: {
 //BA.debugLineNum = 1123;BA.debugLine="col.align = ALIGN_RIGHT";
_col.align /*String*/  = _align_right;
 //BA.debugLineNum = 1124;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1125;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"g";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(this,"getmoneyformat",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_item.getObject())}))));
 //BA.debugLineNum = 1127;BA.debugLine="vue.SetCallBack(\"getmoneyformat\", cb)";
_vue._setcallback /*String*/ ("getmoneyformat",_cb);
 break; }
case 4: {
 //BA.debugLineNum = 1129;BA.debugLine="col.align = ALIGN_RIGHT";
_col.align /*String*/  = _align_right;
 //BA.debugLineNum = 1130;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1131;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"g";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(this,"getfilesize",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_item.getObject())}))));
 //BA.debugLineNum = 1133;BA.debugLine="vue.SetCallBack(\"getfilesize\", cb)";
_vue._setcallback /*String*/ ("getfilesize",_cb);
 break; }
case 5: {
 //BA.debugLineNum = 1135;BA.debugLine="col.valueFormat = \"yyyy-MM-dd\"";
_col.valueFormat /*String*/  = "yyyy-MM-dd";
 //BA.debugLineNum = 1136;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1137;BA.debugLine="Dim value As String";
_value = "";
 //BA.debugLineNum = 1138;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"g";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(this,"getdateformat",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_item.getObject()),(Object)(_value)}))));
 //BA.debugLineNum = 1140;BA.debugLine="vue.SetCallBack(\"getdateformat\", cb)";
_vue._setcallback /*String*/ ("getdateformat",_cb);
 break; }
case 6: {
 //BA.debugLineNum = 1142;BA.debugLine="col.valueFormat = \"HH:MM\"";
_col.valueFormat /*String*/  = "HH:MM";
 break; }
case 7: {
 //BA.debugLineNum = 1144;BA.debugLine="col.valueFormat = \"yyyy-MM-dd HH:MM\"";
_col.valueFormat /*String*/  = "yyyy-MM-dd HH:MM";
 break; }
}
;
 //BA.debugLineNum = 1146;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 };
 //BA.debugLineNum = 1148;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1149;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setcolumnwidth(String _colname,int _colwidth) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
 //BA.debugLineNum = 1061;BA.debugLine="Sub SetColumnWidth(colName As String, colWidth As";
 //BA.debugLineNum = 1062;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 1063;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 1064;BA.debugLine="col.width = colWidth";
_col.width /*String*/  = BA.NumberToString(_colwidth);
 //BA.debugLineNum = 1065;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 };
 //BA.debugLineNum = 1067;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1068;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1532;BA.debugLine="Sub SetDark(varDark As Boolean) As VMDataTable";
 //BA.debugLineNum = 1533;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1534;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1535;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 1536;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1538;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 1539;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 1540;BA.debugLine="DataTable.Bind(\":dark\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 1541;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1542;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 132;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setdatasource(anywheresoftware.b4a.objects.collections.List _ds) throws Exception{
 //BA.debugLineNum = 670;BA.debugLine="Sub SetDataSource(ds As List) As VMDataTable";
 //BA.debugLineNum = 671;BA.debugLine="vue.SetData(items, ds)";
_vue._setdata /*b4j.example.bananovue*/ (_items,(Object)(_ds.getObject()));
 //BA.debugLineNum = 672;BA.debugLine="SetSortBy(vue.newlist)";
_setsortby(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 673;BA.debugLine="SetGroupBy(vue.NewList)";
_setgroupby(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 674;BA.debugLine="SetExpanded(vue.NewList)";
_setexpanded(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 675;BA.debugLine="SetGroupDesc(vue.NewList)";
_setgroupdesc(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 676;BA.debugLine="SetSortDesc(vue.NewList)";
_setsortdesc(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 677;BA.debugLine="SetValue(vue.NewList)";
_setvalue(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 678;BA.debugLine="SetPage(\"1\")";
_setpage("1");
 //BA.debugLineNum = 679;BA.debugLine="vue.SetData($\"${ID}pagecount\"$, \"0\")";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"pagecount"),(Object)("0"));
 //BA.debugLineNum = 680;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 681;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setdatasourcename(String _dsname) throws Exception{
anywheresoftware.b4a.objects.collections.List _recs = null;
 //BA.debugLineNum = 653;BA.debugLine="Sub SetDataSourceName(dsName As String) As VMDataT";
 //BA.debugLineNum = 654;BA.debugLine="dsName = dsName.ToLowerCase";
_dsname = _dsname.toLowerCase();
 //BA.debugLineNum = 655;BA.debugLine="If vue.StateExists(dsName) = False Then";
if (_vue._stateexists /*boolean*/ (_dsname)==__c.False) { 
 //BA.debugLineNum = 656;BA.debugLine="vue.SetData(dsName, vue.newlist)";
_vue._setdata /*b4j.example.bananovue*/ (_dsname,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 };
 //BA.debugLineNum = 658;BA.debugLine="Dim recs As List = vue.GetData(dsName)";
_recs = new anywheresoftware.b4a.objects.collections.List();
_recs = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_vue._getdata /*Object*/ (_dsname)));
 //BA.debugLineNum = 659;BA.debugLine="vue.SetData(items, recs)";
_vue._setdata /*b4j.example.bananovue*/ (_items,(Object)(_recs.getObject()));
 //BA.debugLineNum = 660;BA.debugLine="SetSortBy(vue.newlist)";
_setsortby(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 661;BA.debugLine="SetGroupBy(vue.NewList)";
_setgroupby(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 662;BA.debugLine="SetExpanded(vue.NewList)";
_setexpanded(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 663;BA.debugLine="SetGroupDesc(vue.NewList)";
_setgroupdesc(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 664;BA.debugLine="SetSortDesc(vue.NewList)";
_setsortdesc(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 665;BA.debugLine="SetValue(vue.NewList)";
_setvalue(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 666;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 667;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setdatecolumns(anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
String _k = "";
 //BA.debugLineNum = 2538;BA.debugLine="Sub SetDateColumns(dates As List) As VMDataTable";
 //BA.debugLineNum = 2539;BA.debugLine="For Each k As String In dates";
{
final anywheresoftware.b4a.BA.IterableList group1 = _dates;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2540;BA.debugLine="SetColumnType(k, COLUMN_DATE)";
_setcolumntype(_k,_column_date);
 }
};
 //BA.debugLineNum = 2542;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2543;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setdatetimecolumns(anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
String _k = "";
 //BA.debugLineNum = 2551;BA.debugLine="Sub SetDateTimeColumns(dates As List) As VMDataTab";
 //BA.debugLineNum = 2552;BA.debugLine="For Each k As String In dates";
{
final anywheresoftware.b4a.BA.IterableList group1 = _dates;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2553;BA.debugLine="SetColumnType(k, COLUMN_DATETIME)";
_setcolumntype(_k,_column_datetime);
 }
};
 //BA.debugLineNum = 2555;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2556;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setdelete(boolean _b) throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Sub SetDelete(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 373;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 374;BA.debugLine="AddAction(\"delete\", \"Delete\", \"mdi-delete\")";
_addaction("delete","Delete","mdi-delete");
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setdense(boolean _vardense) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1545;BA.debugLine="Sub SetDense(varDense As Boolean) As VMDataTable";
 //BA.debugLineNum = 1546;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1547;BA.debugLine="SetAttrSingle(\"dense\", varDense)";
_setattrsingle("dense",BA.ObjectToString(_vardense));
 //BA.debugLineNum = 1548;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1550;BA.debugLine="Dim pp As String = $\"${ID}Dense\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dense");
 //BA.debugLineNum = 1551;BA.debugLine="vue.SetStateSingle(pp, varDense)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardense));
 //BA.debugLineNum = 1552;BA.debugLine="DataTable.Bind(\":dense\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":dense",_pp);
 //BA.debugLineNum = 1553;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1554;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 2439;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 2440;BA.debugLine="DataTable.SetDesignMode(b)";
_datatable._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 2441;BA.debugLine="vcard.SetDesignMode(b)";
_vcard._setdesignmode /*b4j.example.vmcard*/ (_b);
 //BA.debugLineNum = 2442;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 2443;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2444;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 225;BA.debugLine="DataTable.SetDeviceOffsets(OS, OM, OL, OX)";
_datatable._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 237;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 238;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 231;BA.debugLine="DataTable.SetDeviceSizes(SS, SM, SL, SX)";
_datatable._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setdisablefiltering(boolean _vardisablefiltering) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1557;BA.debugLine="Sub SetDisableFiltering(varDisableFiltering As Boo";
 //BA.debugLineNum = 1558;BA.debugLine="If varDisableFiltering = False Then Return Me";
if (_vardisablefiltering==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1559;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1560;BA.debugLine="SetAttrSingle(\"disable-filtering\", varDisableFil";
_setattrsingle("disable-filtering",BA.ObjectToString(_vardisablefiltering));
 //BA.debugLineNum = 1561;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1563;BA.debugLine="Dim pp As String = $\"${ID}DisableFiltering\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DisableFiltering");
 //BA.debugLineNum = 1564;BA.debugLine="vue.SetStateSingle(pp, varDisableFiltering)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisablefiltering));
 //BA.debugLineNum = 1565;BA.debugLine="DataTable.Bind(\":disable-filtering\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":disable-filtering",_pp);
 //BA.debugLineNum = 1566;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1567;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setdisablepagination(boolean _vardisablepagination) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1570;BA.debugLine="Sub SetDisablePagination(varDisablePagination As B";
 //BA.debugLineNum = 1571;BA.debugLine="If varDisablePagination = False Then Return Me";
if (_vardisablepagination==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1572;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1573;BA.debugLine="SetAttrSingle(\"disable-pagination\", varDisablePa";
_setattrsingle("disable-pagination",BA.ObjectToString(_vardisablepagination));
 //BA.debugLineNum = 1574;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1576;BA.debugLine="Dim pp As String = $\"${ID}DisablePagination\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DisablePagination");
 //BA.debugLineNum = 1577;BA.debugLine="vue.SetStateSingle(pp, varDisablePagination)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisablepagination));
 //BA.debugLineNum = 1578;BA.debugLine="DataTable.Bind(\":disable-pagination\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":disable-pagination",_pp);
 //BA.debugLineNum = 1579;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1580;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setdisablesort(boolean _vardisablesort) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1583;BA.debugLine="Sub SetDisableSort(varDisableSort As Boolean) As V";
 //BA.debugLineNum = 1584;BA.debugLine="If varDisableSort = False Then Return Me";
if (_vardisablesort==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1585;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1586;BA.debugLine="SetAttrSingle(\"disable-sort\", varDisableSort)";
_setattrsingle("disable-sort",BA.ObjectToString(_vardisablesort));
 //BA.debugLineNum = 1587;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1589;BA.debugLine="Dim pp As String = $\"${ID}DisableSort\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DisableSort");
 //BA.debugLineNum = 1590;BA.debugLine="vue.SetStateSingle(pp, varDisableSort)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisablesort));
 //BA.debugLineNum = 1591;BA.debugLine="DataTable.Bind(\":disable-sort\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":disable-sort",_pp);
 //BA.debugLineNum = 1592;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1593;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setdownload(boolean _b) throws Exception{
 //BA.debugLineNum = 397;BA.debugLine="Sub SetDownload(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 398;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 399;BA.debugLine="AddDownload";
_adddownload();
 //BA.debugLineNum = 400;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setedit(boolean _b) throws Exception{
 //BA.debugLineNum = 378;BA.debugLine="Sub SetEdit(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 379;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 380;BA.debugLine="AddAction(\"edit\", \"Edit\", \"mdi-pencil\")";
_addaction("edit","Edit","mdi-pencil");
 //BA.debugLineNum = 381;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setexpanded(anywheresoftware.b4a.objects.collections.List _varexpanded) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1963;BA.debugLine="Sub SetExpanded(varExpanded As List) As VMDataTabl";
 //BA.debugLineNum = 1964;BA.debugLine="Dim pp As String = $\"${ID}Expanded\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Expanded");
 //BA.debugLineNum = 1965;BA.debugLine="vue.SetStateSingle(pp, varExpanded)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexpanded.getObject()));
 //BA.debugLineNum = 1966;BA.debugLine="DataTable.Bind(\":expanded.sync\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":expanded.sync",_pp);
 //BA.debugLineNum = 1967;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1968;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setexpandicon(String _varexpandicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1765;BA.debugLine="Sub SetExpandIcon(varExpandIcon As String) As VMDa";
 //BA.debugLineNum = 1766;BA.debugLine="If varExpandIcon = \"\" Then Return Me";
if ((_varexpandicon).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1767;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1768;BA.debugLine="SetAttrSingle(\"expand-icon\", varExpandIcon)";
_setattrsingle("expand-icon",_varexpandicon);
 //BA.debugLineNum = 1769;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1771;BA.debugLine="Dim pp As String = $\"${ID}ExpandIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ExpandIcon");
 //BA.debugLineNum = 1772;BA.debugLine="vue.SetStateSingle(pp, varExpandIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexpandicon));
 //BA.debugLineNum = 1773;BA.debugLine="DataTable.Bind(\":expand-icon\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":expand-icon",_pp);
 //BA.debugLineNum = 1774;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1775;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setexternalpagination() throws Exception{
String _scode = "";
 //BA.debugLineNum = 1926;BA.debugLine="Sub SetExternalPagination As VMDataTable";
 //BA.debugLineNum = 1927;BA.debugLine="SetPage(\"1\")";
_setpage("1");
 //BA.debugLineNum = 1928;BA.debugLine="vue.SetData($\"${ID}pagecount\"$, \"0\")";
_vue._setdata /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"pagecount"),(Object)("0"));
 //BA.debugLineNum = 1929;BA.debugLine="Dim scode As String = ID & \"pagecount = $event\"";
_scode = _id+"pagecount = $event";
 //BA.debugLineNum = 1930;BA.debugLine="SetAttrSingle(\"@page-count\", scode)";
_setattrsingle("@page-count",_scode);
 //BA.debugLineNum = 1931;BA.debugLine="SetHideDefaultFooter(True)";
_sethidedefaultfooter(__c.True);
 //BA.debugLineNum = 1932;BA.debugLine="hasExternalPagination = True";
_hasexternalpagination = __c.True;
 //BA.debugLineNum = 1933;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1934;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setfilesizecolumns(anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
String _k = "";
 //BA.debugLineNum = 2582;BA.debugLine="Sub SetFileSizeColumns(dates As List) As VMDataTab";
 //BA.debugLineNum = 2583;BA.debugLine="For Each k As String In dates";
{
final anywheresoftware.b4a.BA.IterableList group1 = _dates;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2584;BA.debugLine="SetColumnType(k, COLUMN_FILESIZE)";
_setcolumntype(_k,_column_filesize);
 }
};
 //BA.debugLineNum = 2586;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2587;BA.debugLine="End Sub";
return null;
}
public String  _setfilters(String _sourceof) throws Exception{
 //BA.debugLineNum = 729;BA.debugLine="Sub SetFilters(sourceOf As String)";
 //BA.debugLineNum = 730;BA.debugLine="filters = vue.GetState(sourceOf, vue.newlist)";
_filters = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_vue._getstate /*Object*/ (_sourceof,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()))));
 //BA.debugLineNum = 731;BA.debugLine="hasFilters = True";
_hasfilters = __c.True;
 //BA.debugLineNum = 732;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _setfixedheader(boolean _varfixedheader) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1596;BA.debugLine="Sub SetFixedHeader(varFixedHeader As Boolean) As V";
 //BA.debugLineNum = 1597;BA.debugLine="If varFixedHeader = False Then Return Me";
if (_varfixedheader==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1598;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1599;BA.debugLine="SetAttrSingle(\"fixed-header\", varFixedHeader)";
_setattrsingle("fixed-header",BA.ObjectToString(_varfixedheader));
 //BA.debugLineNum = 1600;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1602;BA.debugLine="Dim pp As String = $\"${ID}FixedHeader\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"FixedHeader");
 //BA.debugLineNum = 1603;BA.debugLine="vue.SetStateSingle(pp, varFixedHeader)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfixedheader));
 //BA.debugLineNum = 1604;BA.debugLine="DataTable.Bind(\":fixed-header\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":fixed-header",_pp);
 //BA.debugLineNum = 1605;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1606;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setgroupby(anywheresoftware.b4a.objects.collections.List _vargroupby) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1971;BA.debugLine="Sub SetGroupBy(varGroupBy As List) As VMDataTable";
 //BA.debugLineNum = 1972;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1973;BA.debugLine="SetAttrSingle(\"group-by\", BANano.FromJson(varGro";
_setattrsingle("group-by",BA.ObjectToString(_banano.FromJson((Object)(_vargroupby.getObject()))));
 //BA.debugLineNum = 1974;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1976;BA.debugLine="Dim pp As String = $\"${ID}GroupBy\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"GroupBy");
 //BA.debugLineNum = 1977;BA.debugLine="vue.SetStateSingle(pp, varGroupBy)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vargroupby.getObject()));
 //BA.debugLineNum = 1978;BA.debugLine="DataTable.Bind(\":group-by\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":group-by",_pp);
 //BA.debugLineNum = 1979;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1980;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setgroupdesc(anywheresoftware.b4a.objects.collections.List _vargroupdesc) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1983;BA.debugLine="Sub SetGroupDesc(varGroupDesc As List) As VMDataTa";
 //BA.debugLineNum = 1984;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1985;BA.debugLine="SetAttrSingle(\"group-desc\", BANano.FromJson(varG";
_setattrsingle("group-desc",BA.ObjectToString(_banano.FromJson((Object)(_vargroupdesc.getObject()))));
 //BA.debugLineNum = 1986;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1988;BA.debugLine="Dim pp As String = $\"${ID}GroupDesc\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"GroupDesc");
 //BA.debugLineNum = 1989;BA.debugLine="vue.SetStateSingle(pp, varGroupDesc)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vargroupdesc.getObject()));
 //BA.debugLineNum = 1990;BA.debugLine="DataTable.Bind(\":group-desc\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":group-desc",_pp);
 //BA.debugLineNum = 1991;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1992;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setheaderslength(String _varheaderslength) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1778;BA.debugLine="Sub SetHeadersLength(varHeadersLength As String) A";
 //BA.debugLineNum = 1779;BA.debugLine="If varHeadersLength = \"\" Then Return Me";
if ((_varheaderslength).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1780;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1781;BA.debugLine="SetAttrSingle(\"headers-length\", varHeadersLength";
_setattrsingle("headers-length",_varheaderslength);
 //BA.debugLineNum = 1782;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1784;BA.debugLine="Dim pp As String = $\"${ID}HeadersLength\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HeadersLength");
 //BA.debugLineNum = 1785;BA.debugLine="vue.SetStateSingle(pp, varHeadersLength)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheaderslength));
 //BA.debugLineNum = 1786;BA.debugLine="DataTable.Bind(\":headers-length\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":headers-length",_pp);
 //BA.debugLineNum = 1787;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1788;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1791;BA.debugLine="Sub SetHeight(varHeight As String) As VMDataTable";
 //BA.debugLineNum = 1792;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1793;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1794;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 1795;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1797;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 1798;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 1799;BA.debugLine="DataTable.Bind(\":height\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 1800;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1801;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _sethidedefaultfooter(boolean _varhidedefaultfooter) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1609;BA.debugLine="Sub SetHideDefaultFooter(varHideDefaultFooter As B";
 //BA.debugLineNum = 1610;BA.debugLine="If varHideDefaultFooter = False Then Return Me";
if (_varhidedefaultfooter==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1611;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1612;BA.debugLine="SetAttrSingle(\"hide-default-footer\", varHideDefa";
_setattrsingle("hide-default-footer",BA.ObjectToString(_varhidedefaultfooter));
 //BA.debugLineNum = 1613;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1615;BA.debugLine="Dim pp As String = $\"${ID}HideDefaultFooter\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideDefaultFooter");
 //BA.debugLineNum = 1616;BA.debugLine="vue.SetStateSingle(pp, varHideDefaultFooter)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhidedefaultfooter));
 //BA.debugLineNum = 1617;BA.debugLine="DataTable.Bind(\":hide-default-footer\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":hide-default-footer",_pp);
 //BA.debugLineNum = 1618;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _sethidedefaultheader(boolean _varhidedefaultheader) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1622;BA.debugLine="Sub SetHideDefaultHeader(varHideDefaultHeader As B";
 //BA.debugLineNum = 1623;BA.debugLine="If varHideDefaultHeader = False Then Return Me";
if (_varhidedefaultheader==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1624;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1625;BA.debugLine="SetAttrSingle(\"hide-default-header\", varHideDefa";
_setattrsingle("hide-default-header",BA.ObjectToString(_varhidedefaultheader));
 //BA.debugLineNum = 1626;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1628;BA.debugLine="Dim pp As String = $\"${ID}HideDefaultHeader\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideDefaultHeader");
 //BA.debugLineNum = 1629;BA.debugLine="vue.SetStateSingle(pp, varHideDefaultHeader)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhidedefaultheader));
 //BA.debugLineNum = 1630;BA.debugLine="DataTable.Bind(\":hide-default-header\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":hide-default-header",_pp);
 //BA.debugLineNum = 1631;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1632;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _seticondimensions(String _colname,String _iconsize,String _iconcolor) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
 //BA.debugLineNum = 1004;BA.debugLine="Sub SetIconDimensions(colName As String, iconSize";
 //BA.debugLineNum = 1005;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 1006;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 1007;BA.debugLine="col.iconSize = iconSize";
_col.iconSize /*String*/  = _iconsize;
 //BA.debugLineNum = 1008;BA.debugLine="col.iconColor = iconColor";
_col.iconColor /*String*/  = _iconcolor;
 //BA.debugLineNum = 1009;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 };
 //BA.debugLineNum = 1011;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1012;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _seticondimensions1(String _colname,String _iconsize,String _iconcolor,String _columnwidth) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
 //BA.debugLineNum = 1014;BA.debugLine="Sub SetIconDimensions1(colName As String, iconSize";
 //BA.debugLineNum = 1015;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 1016;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 1017;BA.debugLine="col.iconSize = iconSize";
_col.iconSize /*String*/  = _iconsize;
 //BA.debugLineNum = 1018;BA.debugLine="col.iconColor = iconColor";
_col.iconColor /*String*/  = _iconcolor;
 //BA.debugLineNum = 1019;BA.debugLine="col.width = columnWidth";
_col.width /*String*/  = _columnwidth;
 //BA.debugLineNum = 1020;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 };
 //BA.debugLineNum = 1022;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1023;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setimagedimensions(String _colname,String _imgheight,String _imgwidth) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
 //BA.debugLineNum = 935;BA.debugLine="Sub SetImageDimensions(colName As String, imgHeigh";
 //BA.debugLineNum = 936;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 937;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 938;BA.debugLine="col.imgHeight = imgHeight";
_col.imgHeight /*String*/  = _imgheight;
 //BA.debugLineNum = 939;BA.debugLine="col.imgWidth = imgWidth";
_col.imgWidth /*String*/  = _imgwidth;
 //BA.debugLineNum = 940;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 };
 //BA.debugLineNum = 942;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 943;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setitemclass(String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _item = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2621;BA.debugLine="Sub SetItemClass(methodName As String) As VMDataTa";
 //BA.debugLineNum = 2622;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2623;BA.debugLine="If SubExists(Module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 2624;BA.debugLine="SetAttrSingle(\":item-class\", methodName)";
_setattrsingle(":item-class",_methodname);
 //BA.debugLineNum = 2625;BA.debugLine="Dim Item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2626;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_item.getObject())}))));
 //BA.debugLineNum = 2628;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 }else {
 //BA.debugLineNum = 2630;BA.debugLine="Log(\"VMDataTable:SetItemClass - the item-class m";
__c.Log("VMDataTable:SetItemClass - the item-class method has not been defined!");
 };
 //BA.debugLineNum = 2632;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2633;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setitemkey(String _varitemkey) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1818;BA.debugLine="Sub SetItemKey(varItemKey As String) As VMDataTabl";
 //BA.debugLineNum = 1819;BA.debugLine="PrimaryKey = varItemKey";
_primarykey = _varitemkey;
 //BA.debugLineNum = 1820;BA.debugLine="If varItemKey = \"\" Then Return Me";
if ((_varitemkey).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1821;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1822;BA.debugLine="SetAttrSingle(\"item-key\", varItemKey)";
_setattrsingle("item-key",_varitemkey);
 //BA.debugLineNum = 1823;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1825;BA.debugLine="Dim pp As String = $\"${ID}ItemKey\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ItemKey");
 //BA.debugLineNum = 1826;BA.debugLine="vue.SetStateSingle(pp, varItemKey)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varitemkey));
 //BA.debugLineNum = 1827;BA.debugLine="DataTable.Bind(\":item-key\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":item-key",_pp);
 //BA.debugLineNum = 1828;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1829;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setitemkey1(String _varitemkey) throws Exception{
 //BA.debugLineNum = 1804;BA.debugLine="Sub SetItemKey1(varItemKey As String) As VMDataTab";
 //BA.debugLineNum = 1805;BA.debugLine="PrimaryKey = varItemKey";
_primarykey = _varitemkey;
 //BA.debugLineNum = 1814;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1815;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setitemsperpage(String _varitemsperpage) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1832;BA.debugLine="Sub SetItemsPerPage(varItemsPerPage As String) As";
 //BA.debugLineNum = 1833;BA.debugLine="If varItemsPerPage = \"\" Then Return Me";
if ((_varitemsperpage).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1834;BA.debugLine="varItemsPerPage = BANano.parseInt(varItemsPerPage";
_varitemsperpage = BA.NumberToString(_banano.parseInt((Object)(_varitemsperpage)));
 //BA.debugLineNum = 1835;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1836;BA.debugLine="SetAttrSingle(\"items-per-page\", varItemsPerPage)";
_setattrsingle("items-per-page",_varitemsperpage);
 //BA.debugLineNum = 1837;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1839;BA.debugLine="Dim pp As String = $\"${ID}ItemsPerPage\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ItemsPerPage");
 //BA.debugLineNum = 1840;BA.debugLine="vue.SetStateSingle(pp, varItemsPerPage)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varitemsperpage));
 //BA.debugLineNum = 1841;BA.debugLine="DataTable.Bind(\":items-per-page\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":items-per-page",_pp);
 //BA.debugLineNum = 1842;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1843;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1635;BA.debugLine="Sub SetLight(varLight As Boolean) As VMDataTable";
 //BA.debugLineNum = 1636;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1637;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1638;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 1639;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1641;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 1642;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 1643;BA.debugLine="DataTable.Bind(\":light\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 1644;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1645;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setloading(boolean _varloading) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1648;BA.debugLine="Sub SetLoading(varLoading As Boolean) As VMDataTab";
 //BA.debugLineNum = 1649;BA.debugLine="If varLoading = False Then Return Me";
if (_varloading==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1650;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1651;BA.debugLine="SetAttrSingle(\"loading\", varLoading)";
_setattrsingle("loading",BA.ObjectToString(_varloading));
 //BA.debugLineNum = 1652;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1654;BA.debugLine="Dim pp As String = $\"${ID}Loading\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Loading");
 //BA.debugLineNum = 1655;BA.debugLine="vue.SetStateSingle(pp, varLoading)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloading));
 //BA.debugLineNum = 1656;BA.debugLine="DataTable.Bind(\":loading\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":loading",_pp);
 //BA.debugLineNum = 1657;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1658;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setloadingtext(String _varloadingtext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1846;BA.debugLine="Sub SetLoadingText(varLoadingText As String) As VM";
 //BA.debugLineNum = 1847;BA.debugLine="If varLoadingText = \"\" Then Return Me";
if ((_varloadingtext).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1848;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1849;BA.debugLine="SetAttrSingle(\"loading-text\", varLoadingText)";
_setattrsingle("loading-text",_varloadingtext);
 //BA.debugLineNum = 1850;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1852;BA.debugLine="Dim pp As String = $\"${ID}LoadingText\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"LoadingText");
 //BA.debugLineNum = 1853;BA.debugLine="vue.SetStateSingle(pp, varLoadingText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varloadingtext));
 //BA.debugLineNum = 1854;BA.debugLine="DataTable.Bind(\":loading-text\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":loading-text",_pp);
 //BA.debugLineNum = 1855;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1856;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setlocale(String _varlocale) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1859;BA.debugLine="Sub SetLocale(varLocale As String) As VMDataTable";
 //BA.debugLineNum = 1860;BA.debugLine="If varLocale = \"\" Then Return Me";
if ((_varlocale).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1861;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1862;BA.debugLine="SetAttrSingle(\"locale\", varLocale)";
_setattrsingle("locale",_varlocale);
 //BA.debugLineNum = 1863;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1865;BA.debugLine="Dim pp As String = $\"${ID}Locale\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Locale");
 //BA.debugLineNum = 1866;BA.debugLine="vue.SetStateSingle(pp, varLocale)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlocale));
 //BA.debugLineNum = 1867;BA.debugLine="DataTable.Bind(\":locale\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":locale",_pp);
 //BA.debugLineNum = 1868;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1869;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 2433;BA.debugLine="Sub SetMarginAll(p As String) As VMDataTable";
 //BA.debugLineNum = 2434;BA.debugLine="DataTable.setmarginall(p)";
_datatable._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 2435;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setmenu(boolean _b) throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Sub SetMenu(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 412;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 413;BA.debugLine="AddMenuV";
_addmenuv();
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setmobilebreakpoint(String _varmobilebreakpoint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1872;BA.debugLine="Sub SetMobileBreakpoint(varMobileBreakpoint As Str";
 //BA.debugLineNum = 1873;BA.debugLine="If varMobileBreakpoint = \"\" Then Return Me";
if ((_varmobilebreakpoint).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1874;BA.debugLine="varMobileBreakpoint = BANano.parseInt(varMobileBr";
_varmobilebreakpoint = BA.NumberToString(_banano.parseInt((Object)(_varmobilebreakpoint)));
 //BA.debugLineNum = 1875;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1876;BA.debugLine="SetAttrSingle(\"mobile-breakpoint\", varMobileBrea";
_setattrsingle("mobile-breakpoint",_varmobilebreakpoint);
 //BA.debugLineNum = 1877;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1879;BA.debugLine="Dim pp As String = $\"${ID}MobileBreakpoint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MobileBreakpoint");
 //BA.debugLineNum = 1880;BA.debugLine="vue.SetStateSingle(pp, varMobileBreakpoint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmobilebreakpoint));
 //BA.debugLineNum = 1881;BA.debugLine="DataTable.Bind(\":mobile-breakpoint\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":mobile-breakpoint",_pp);
 //BA.debugLineNum = 1882;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1883;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setmoneycolumns(anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
String _k = "";
 //BA.debugLineNum = 2614;BA.debugLine="Sub SetMoneyColumns(dates As List) As VMDataTable";
 //BA.debugLineNum = 2615;BA.debugLine="For Each k As String In dates";
{
final anywheresoftware.b4a.BA.IterableList group1 = _dates;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2616;BA.debugLine="SetColumnType(k, COLUMN_MONEY)";
_setcolumntype(_k,_column_money);
 }
};
 //BA.debugLineNum = 2618;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setmultisort(boolean _varmultisort) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1661;BA.debugLine="Sub SetMultiSort(varMultiSort As Boolean) As VMDat";
 //BA.debugLineNum = 1662;BA.debugLine="If varMultiSort = False Then Return Me";
if (_varmultisort==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1663;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1664;BA.debugLine="SetAttrSingle(\"multi-sort\", varMultiSort)";
_setattrsingle("multi-sort",BA.ObjectToString(_varmultisort));
 //BA.debugLineNum = 1665;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1667;BA.debugLine="Dim pp As String = $\"${ID}MultiSort\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MultiSort");
 //BA.debugLineNum = 1668;BA.debugLine="vue.SetStateSingle(pp, varMultiSort)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmultisort));
 //BA.debugLineNum = 1669;BA.debugLine="DataTable.Bind(\":multi-sort\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":multi-sort",_pp);
 //BA.debugLineNum = 1670;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1671;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setmustsort(boolean _varmustsort) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1674;BA.debugLine="Sub SetMustSort(varMustSort As Boolean) As VMDataT";
 //BA.debugLineNum = 1675;BA.debugLine="If varMustSort = False Then Return Me";
if (_varmustsort==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1676;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1677;BA.debugLine="SetAttrSingle(\"must-sort\", varMustSort)";
_setattrsingle("must-sort",BA.ObjectToString(_varmustsort));
 //BA.debugLineNum = 1678;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1680;BA.debugLine="Dim pp As String = $\"${ID}MustSort\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MustSort");
 //BA.debugLineNum = 1681;BA.debugLine="vue.SetStateSingle(pp, varMustSort)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmustsort));
 //BA.debugLineNum = 1682;BA.debugLine="DataTable.Bind(\":must-sort\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":must-sort",_pp);
 //BA.debugLineNum = 1683;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1684;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 2453;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 2454;BA.debugLine="DataTable.SetName(varName, bbind)";
_datatable._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 2455;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2456;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setnodatatext(String _varnodatatext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1886;BA.debugLine="Sub SetNoDataText(varNoDataText As String) As VMDa";
 //BA.debugLineNum = 1887;BA.debugLine="If varNoDataText = \"\" Then Return Me";
if ((_varnodatatext).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1888;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1889;BA.debugLine="SetAttrSingle(\"no-data-text\", varNoDataText)";
_setattrsingle("no-data-text",_varnodatatext);
 //BA.debugLineNum = 1890;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1892;BA.debugLine="Dim pp As String = $\"${ID}NoDataText\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NoDataText");
 //BA.debugLineNum = 1893;BA.debugLine="vue.SetStateSingle(pp, varNoDataText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnodatatext));
 //BA.debugLineNum = 1894;BA.debugLine="DataTable.Bind(\":no-data-text\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":no-data-text",_pp);
 //BA.debugLineNum = 1895;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1896;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setnoresultstext(String _varnoresultstext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1899;BA.debugLine="Sub SetNoResultsText(varNoResultsText As String) A";
 //BA.debugLineNum = 1900;BA.debugLine="If varNoResultsText = \"\" Then Return Me";
if ((_varnoresultstext).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1901;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1902;BA.debugLine="SetAttrSingle(\"no-results-text\", varNoResultsTex";
_setattrsingle("no-results-text",_varnoresultstext);
 //BA.debugLineNum = 1903;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1905;BA.debugLine="Dim pp As String = $\"${ID}NoResultsText\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NoResultsText");
 //BA.debugLineNum = 1906;BA.debugLine="vue.SetStateSingle(pp, varNoResultsText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnoresultstext));
 //BA.debugLineNum = 1907;BA.debugLine="DataTable.Bind(\":no-results-text\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":no-results-text",_pp);
 //BA.debugLineNum = 1908;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1909;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setonclickrow(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2146;BA.debugLine="Sub SetOnClickRow(methodName As String) As VMDataT";
 //BA.debugLineNum = 2147;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2148;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2149;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2150;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2151;BA.debugLine="SetAttr(CreateMap(\"@click:row\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:row"),(Object)(_methodname)}));
 //BA.debugLineNum = 2153;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setoncurrentitems(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2158;BA.debugLine="Sub SetOnCurrentItems(methodName As String) As VMD";
 //BA.debugLineNum = 2159;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2160;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2161;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2162;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2163;BA.debugLine="SetAttr(CreateMap(\"@current-items\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@current-items"),(Object)(_methodname)}));
 //BA.debugLineNum = 2165;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setoninput(String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.List _xitems = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2170;BA.debugLine="Sub SetOnInput(methodName As String) As VMDataTabl";
 //BA.debugLineNum = 2171;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2172;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2173;BA.debugLine="Dim xitems As List";
_xitems = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2174;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_xitems.getObject())}))));
 //BA.debugLineNum = 2175;BA.debugLine="SetAttr(CreateMap(\"@input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_methodname)}));
 //BA.debugLineNum = 2177;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setonitemexpanded(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2182;BA.debugLine="Sub SetOnItemExpanded(methodName As String) As VMD";
 //BA.debugLineNum = 2183;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2184;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2185;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2186;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2187;BA.debugLine="SetAttr(CreateMap(\"@item-expanded\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@item-expanded"),(Object)(_methodname)}));
 //BA.debugLineNum = 2189;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2190;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2191;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setonitemselected(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2194;BA.debugLine="Sub SetOnItemSelected(methodName As String) As VMD";
 //BA.debugLineNum = 2195;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2196;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2197;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2198;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2199;BA.debugLine="SetAttr(CreateMap(\"@item-selected\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@item-selected"),(Object)(_methodname)}));
 //BA.debugLineNum = 2201;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setonpagecount(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2206;BA.debugLine="Sub SetOnPageCount(methodName As String) As VMData";
 //BA.debugLineNum = 2207;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2208;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2209;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2210;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2211;BA.debugLine="SetAttr(CreateMap(\"@page-count\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@page-count"),(Object)(_methodname)}));
 //BA.debugLineNum = 2213;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2214;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2215;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setonpagination(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2218;BA.debugLine="Sub SetOnPagination(methodName As String) As VMDat";
 //BA.debugLineNum = 2219;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2220;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2221;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2222;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2223;BA.debugLine="SetAttr(CreateMap(\"@pagination\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@pagination"),(Object)(_methodname)}));
 //BA.debugLineNum = 2225;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setontoggleselectall(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2230;BA.debugLine="Sub SetOnToggleSelectAll(methodName As String) As";
 //BA.debugLineNum = 2231;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2232;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2233;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2234;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2235;BA.debugLine="SetAttr(CreateMap(\"@toggle-select-all\": methodName";
_setattr(__c.createMap(new Object[] {(Object)("@toggle-select-all"),(Object)(_methodname)}));
 //BA.debugLineNum = 2237;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2238;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2239;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setonupdateexpanded(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2242;BA.debugLine="Sub SetOnUpdateExpanded(methodName As String) As V";
 //BA.debugLineNum = 2243;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2244;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2245;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2246;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2247;BA.debugLine="SetAttr(CreateMap(\"@update:expanded\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:expanded"),(Object)(_methodname)}));
 //BA.debugLineNum = 2249;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setonupdategroupby(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2254;BA.debugLine="Sub SetOnUpdateGroupBy(methodName As String) As VM";
 //BA.debugLineNum = 2255;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2256;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2257;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2258;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2259;BA.debugLine="SetAttr(CreateMap(\"@update:group-by\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:group-by"),(Object)(_methodname)}));
 //BA.debugLineNum = 2261;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2262;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setonupdategroupdesc(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2266;BA.debugLine="Sub SetOnUpdateGroupDesc(methodName As String) As";
 //BA.debugLineNum = 2267;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2268;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2269;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2270;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2271;BA.debugLine="SetAttr(CreateMap(\"@update:group-desc\": methodName";
_setattr(__c.createMap(new Object[] {(Object)("@update:group-desc"),(Object)(_methodname)}));
 //BA.debugLineNum = 2273;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setonupdateitemsperpage(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2278;BA.debugLine="Sub SetOnUpdateItemsPerPage(methodName As String)";
 //BA.debugLineNum = 2279;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2280;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2281;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2282;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2283;BA.debugLine="SetAttr(CreateMap(\"@update:items-per-page\": method";
_setattr(__c.createMap(new Object[] {(Object)("@update:items-per-page"),(Object)(_methodname)}));
 //BA.debugLineNum = 2285;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2286;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2287;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setonupdatemultisort(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2290;BA.debugLine="Sub SetOnUpdateMultiSort(methodName As String) As";
 //BA.debugLineNum = 2291;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2292;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2293;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2294;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2295;BA.debugLine="SetAttr(CreateMap(\"@update:multi-sort\": methodName";
_setattr(__c.createMap(new Object[] {(Object)("@update:multi-sort"),(Object)(_methodname)}));
 //BA.debugLineNum = 2297;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setonupdatemustsort(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2302;BA.debugLine="Sub SetOnUpdateMustSort(methodName As String) As V";
 //BA.debugLineNum = 2303;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2304;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2305;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2306;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2307;BA.debugLine="SetAttr(CreateMap(\"@update:must-sort\": methodName)";
_setattr(__c.createMap(new Object[] {(Object)("@update:must-sort"),(Object)(_methodname)}));
 //BA.debugLineNum = 2309;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2311;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setonupdateoptions(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2314;BA.debugLine="Sub SetOnUpdateOptions(methodName As String) As VM";
 //BA.debugLineNum = 2315;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2316;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2317;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2318;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2319;BA.debugLine="SetAttr(CreateMap(\"@update:options\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:options"),(Object)(_methodname)}));
 //BA.debugLineNum = 2321;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setonupdatepage(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2326;BA.debugLine="Sub SetOnUpdatePage(methodName As String) As VMDat";
 //BA.debugLineNum = 2327;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2328;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2329;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2330;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2331;BA.debugLine="SetAttr(CreateMap(\"@update:page\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:page"),(Object)(_methodname)}));
 //BA.debugLineNum = 2333;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2334;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2335;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setonupdatesortby(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2338;BA.debugLine="Sub SetOnUpdateSortBy(methodName As String) As VMD";
 //BA.debugLineNum = 2339;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2340;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2341;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2342;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2343;BA.debugLine="SetAttr(CreateMap(\"@update:sort-by\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:sort-by"),(Object)(_methodname)}));
 //BA.debugLineNum = 2345;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setonupdatesortdesc(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2350;BA.debugLine="Sub SetOnUpdateSortDesc(methodName As String) As V";
 //BA.debugLineNum = 2351;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2352;BA.debugLine="If SubExists(Module, methodName) = False Then Retu";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2353;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2354;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2355;BA.debugLine="SetAttr(CreateMap(\"@update:sort-desc\": methodName";
_setattr(__c.createMap(new Object[] {(Object)("@update:sort-desc"),(Object)(_methodname)}));
 //BA.debugLineNum = 2357;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 2358;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2359;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 2427;BA.debugLine="Sub SetPaddingAll(p As String) As VMDataTable";
 //BA.debugLineNum = 2428;BA.debugLine="DataTable.SetPaddingAll(p)";
_datatable._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 2429;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2430;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setpage(String _varpage) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1912;BA.debugLine="Sub SetPage(varPage As String) As VMDataTable";
 //BA.debugLineNum = 1913;BA.debugLine="If varPage = \"\" Then Return Me";
if ((_varpage).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1914;BA.debugLine="varPage = BANano.parseInt(varPage)";
_varpage = BA.NumberToString(_banano.parseInt((Object)(_varpage)));
 //BA.debugLineNum = 1915;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1916;BA.debugLine="SetAttrSingle(\"page\", varPage)";
_setattrsingle("page",_varpage);
 //BA.debugLineNum = 1917;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1919;BA.debugLine="Dim pp As String = $\"${ID}Page\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Page");
 //BA.debugLineNum = 1920;BA.debugLine="vue.SetStateSingle(pp, varPage)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpage));
 //BA.debugLineNum = 1921;BA.debugLine="DataTable.Bind(\":page.sync\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":page.sync",_pp);
 //BA.debugLineNum = 1922;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1923;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setprint(boolean _b) throws Exception{
 //BA.debugLineNum = 431;BA.debugLine="Sub SetPrint(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 432;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 433;BA.debugLine="AddPrint";
_addprint();
 //BA.debugLineNum = 434;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setprogresscirculardimensions(String _colname,String _progresscolor,String _progressrotate,String _progresssize,String _progresswidth) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
 //BA.debugLineNum = 1026;BA.debugLine="Sub SetProgressCircularDimensions(colName As Strin";
 //BA.debugLineNum = 1027;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 1028;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 1029;BA.debugLine="col.progressRotate = progressRotate";
_col.progressRotate /*String*/  = _progressrotate;
 //BA.debugLineNum = 1030;BA.debugLine="col.progressSize = progressSize";
_col.progressSize /*String*/  = _progresssize;
 //BA.debugLineNum = 1031;BA.debugLine="col.progressWidth = progressWidth";
_col.progressWidth /*String*/  = _progresswidth;
 //BA.debugLineNum = 1032;BA.debugLine="col.progressColor = progressColor";
_col.progressColor /*String*/  = _progresscolor;
 //BA.debugLineNum = 1033;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 };
 //BA.debugLineNum = 1035;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1036;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setprogresslineardimensions(String _colname,String _progresscolor,String _progressheight,boolean _progressshowvalue) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
 //BA.debugLineNum = 1038;BA.debugLine="Sub SetProgressLinearDimensions(colName As String,";
 //BA.debugLineNum = 1039;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 1040;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 1041;BA.debugLine="col.progressHeight = progressHeight";
_col.progressHeight /*String*/  = _progressheight;
 //BA.debugLineNum = 1042;BA.debugLine="col.progressShowValue = progressShowValue";
_col.progressShowValue /*boolean*/  = _progressshowvalue;
 //BA.debugLineNum = 1043;BA.debugLine="col.progressColor = progressColor";
_col.progressColor /*String*/  = _progresscolor;
 //BA.debugLineNum = 1044;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 };
 //BA.debugLineNum = 1046;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1047;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setratingdimensions(String _colname,String _ratlength,String _ratcolor) throws Exception{
b4j.example.vmdatatable._datatablecolumn _col = null;
 //BA.debugLineNum = 1049;BA.debugLine="Sub SetRatingDimensions(colName As String, ratLeng";
 //BA.debugLineNum = 1050;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 1051;BA.debugLine="Dim col As DataTableColumn = columnsM.Get(colNam";
_col = (b4j.example.vmdatatable._datatablecolumn)(_columnsm.Get((Object)(_colname)));
 //BA.debugLineNum = 1052;BA.debugLine="col.iconSize = ratLength";
_col.iconSize /*String*/  = _ratlength;
 //BA.debugLineNum = 1053;BA.debugLine="col.iconColor = ratColor";
_col.iconColor /*String*/  = _ratcolor;
 //BA.debugLineNum = 1054;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col));
 };
 //BA.debugLineNum = 1056;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1057;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMDat";
 //BA.debugLineNum = 219;BA.debugLine="DataTable.SetRC(sRow, sCol)";
_datatable._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setrightaligncolumns(anywheresoftware.b4a.objects.collections.List _flds) throws Exception{
String _k = "";
 //BA.debugLineNum = 2530;BA.debugLine="Sub SetRightAlignColumns(flds As List) As VMDataTa";
 //BA.debugLineNum = 2531;BA.debugLine="For Each k As String In flds";
{
final anywheresoftware.b4a.BA.IterableList group1 = _flds;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2532;BA.debugLine="SetColumnAlignment(k, ALIGN_RIGHT)";
_setcolumnalignment(_k,_align_right);
 }
};
 //BA.debugLineNum = 2534;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2535;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setsave(boolean _b) throws Exception{
 //BA.debugLineNum = 384;BA.debugLine="Sub SetSave(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 385;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 386;BA.debugLine="AddSave(\"save\", \"Save\")";
_addsave("save","Save");
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setsearchbox(boolean _b) throws Exception{
 //BA.debugLineNum = 447;BA.debugLine="Sub SetSearchBox(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 448;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 449;BA.debugLine="AddSearch";
_addsearch();
 //BA.debugLineNum = 450;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setselectablekey(String _varselectablekey) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1937;BA.debugLine="Sub SetSelectableKey(varSelectableKey As String) A";
 //BA.debugLineNum = 1938;BA.debugLine="If varSelectableKey = \"\" Then Return Me";
if ((_varselectablekey).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1939;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1940;BA.debugLine="SetAttrSingle(\"selectable-key\", varSelectableKey";
_setattrsingle("selectable-key",_varselectablekey);
 //BA.debugLineNum = 1941;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1943;BA.debugLine="Dim pp As String = $\"${ID}SelectableKey\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SelectableKey");
 //BA.debugLineNum = 1944;BA.debugLine="vue.SetStateSingle(pp, varSelectableKey)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varselectablekey));
 //BA.debugLineNum = 1945;BA.debugLine="DataTable.Bind(\":selectable-key\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":selectable-key",_pp);
 //BA.debugLineNum = 1946;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1947;BA.debugLine="End Sub";
return null;
}
public String  _setselected(anywheresoftware.b4a.objects.collections.List _nl) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetSelected(nl As List)";
 //BA.debugLineNum = 105;BA.debugLine="vue.SetData(selected, nl)";
_vue._setdata /*b4j.example.bananovue*/ (_selected,(Object)(_nl.getObject()));
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _setselectfields(String _selfields) throws Exception{
 //BA.debugLineNum = 2565;BA.debugLine="Sub SetSelectFields(selFields As String) As VMData";
 //BA.debugLineNum = 2566;BA.debugLine="If selFields = \"\" Then Return Me";
if ((_selfields).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2567;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2568;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setselecttype(String _seltype) throws Exception{
 //BA.debugLineNum = 2559;BA.debugLine="Sub SetSelectType(selType As String) As VMDataTabl";
 //BA.debugLineNum = 2560;BA.debugLine="If selType = \"\" Then Return Me";
if ((_seltype).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2561;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2562;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setserveritemslength(String _varserveritemslength) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1950;BA.debugLine="Sub SetServerItemsLength(varServerItemsLength As S";
 //BA.debugLineNum = 1951;BA.debugLine="If varServerItemsLength = \"\" Then Return Me";
if ((_varserveritemslength).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1952;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1953;BA.debugLine="SetAttrSingle(\"server-items-length\", varServerIt";
_setattrsingle("server-items-length",_varserveritemslength);
 //BA.debugLineNum = 1954;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1956;BA.debugLine="Dim pp As String = $\"${ID}ServerItemsLength\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ServerItemsLength");
 //BA.debugLineNum = 1957;BA.debugLine="vue.SetStateSingle(pp, varServerItemsLength)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varserveritemslength));
 //BA.debugLineNum = 1958;BA.debugLine="DataTable.Bind(\":server-items-length\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":server-items-length",_pp);
 //BA.debugLineNum = 1959;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1960;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setshowexpand(boolean _varshowexpand) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1687;BA.debugLine="Sub SetShowExpand(varShowExpand As Boolean) As VMD";
 //BA.debugLineNum = 1688;BA.debugLine="If varShowExpand = False Then Return Me";
if (_varshowexpand==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1689;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1690;BA.debugLine="SetAttrSingle(\"show-expand\", varShowExpand)";
_setattrsingle("show-expand",BA.ObjectToString(_varshowexpand));
 //BA.debugLineNum = 1691;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1693;BA.debugLine="Dim pp As String = $\"${ID}ShowExpand\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowExpand");
 //BA.debugLineNum = 1694;BA.debugLine="vue.SetStateSingle(pp, varShowExpand)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshowexpand));
 //BA.debugLineNum = 1695;BA.debugLine="DataTable.Bind(\":show-expand\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":show-expand",_pp);
 //BA.debugLineNum = 1696;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1697;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setshowgroupby(boolean _varshowgroupby) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1700;BA.debugLine="Sub SetShowGroupBy(varShowGroupBy As Boolean) As V";
 //BA.debugLineNum = 1701;BA.debugLine="If varShowGroupBy = False Then Return Me";
if (_varshowgroupby==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1702;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1703;BA.debugLine="SetAttrSingle(\"show-group-by\", varShowGroupBy)";
_setattrsingle("show-group-by",BA.ObjectToString(_varshowgroupby));
 //BA.debugLineNum = 1704;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1706;BA.debugLine="Dim pp As String = $\"${ID}ShowGroupBy\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowGroupBy");
 //BA.debugLineNum = 1707;BA.debugLine="vue.SetStateSingle(pp, varShowGroupBy)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshowgroupby));
 //BA.debugLineNum = 1708;BA.debugLine="DataTable.Bind(\":show-group-by\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":show-group-by",_pp);
 //BA.debugLineNum = 1709;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1710;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setshowselect(boolean _varshowselect) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1713;BA.debugLine="Sub SetShowSelect(varShowSelect As Boolean) As VMD";
 //BA.debugLineNum = 1714;BA.debugLine="If varShowSelect = False Then Return Me";
if (_varshowselect==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1715;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1716;BA.debugLine="SetAttrSingle(\"show-select\", varShowSelect)";
_setattrsingle("show-select",BA.ObjectToString(_varshowselect));
 //BA.debugLineNum = 1717;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1719;BA.debugLine="Dim pp As String = $\"${ID}ShowSelect\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowSelect");
 //BA.debugLineNum = 1720;BA.debugLine="vue.SetStateSingle(pp, varShowSelect)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshowselect));
 //BA.debugLineNum = 1721;BA.debugLine="DataTable.Bind(\":show-select\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":show-select",_pp);
 //BA.debugLineNum = 1722;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1723;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setsingleexpand(boolean _varsingleexpand) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1726;BA.debugLine="Sub SetSingleExpand(varSingleExpand As Boolean) As";
 //BA.debugLineNum = 1727;BA.debugLine="If varSingleExpand = False Then Return Me";
if (_varsingleexpand==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1728;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1729;BA.debugLine="SetAttrSingle(\"single-expand\", varSingleExpand)";
_setattrsingle("single-expand",BA.ObjectToString(_varsingleexpand));
 //BA.debugLineNum = 1730;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1732;BA.debugLine="Dim pp As String = $\"${ID}SingleExpand\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SingleExpand");
 //BA.debugLineNum = 1733;BA.debugLine="vue.SetStateSingle(pp, varSingleExpand)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsingleexpand));
 //BA.debugLineNum = 1734;BA.debugLine="DataTable.Bind(\":single-expand\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":single-expand",_pp);
 //BA.debugLineNum = 1735;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1736;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setsingleselect(boolean _varsingleselect) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1739;BA.debugLine="Sub SetSingleSelect(varSingleSelect As Boolean) As";
 //BA.debugLineNum = 1740;BA.debugLine="If varSingleSelect = False Then Return Me";
if (_varsingleselect==__c.False) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 1741;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1742;BA.debugLine="SetAttrSingle(\"single-select\", varSingleSelect)";
_setattrsingle("single-select",BA.ObjectToString(_varsingleselect));
 //BA.debugLineNum = 1743;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 1745;BA.debugLine="Dim pp As String = $\"${ID}SingleSelect\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SingleSelect");
 //BA.debugLineNum = 1746;BA.debugLine="vue.SetStateSingle(pp, varSingleSelect)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsingleselect));
 //BA.debugLineNum = 1747;BA.debugLine="DataTable.Bind(\":single-select\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":single-select",_pp);
 //BA.debugLineNum = 1748;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1749;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotbody(boolean _b) throws Exception{
 //BA.debugLineNum = 2032;BA.debugLine="Sub SetSlotBody(b As Boolean) As VMDataTable    'i";
 //BA.debugLineNum = 2033;BA.debugLine="SetAttr(CreateMap(\"slot\": \"body\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("body")}));
 //BA.debugLineNum = 2034;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2035;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotbodyappend(boolean _b) throws Exception{
 //BA.debugLineNum = 2038;BA.debugLine="Sub SetSlotBodyAppend(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 2039;BA.debugLine="SetAttr(CreateMap(\"slot\": \"body.append\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("body.append")}));
 //BA.debugLineNum = 2040;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2041;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotbodyprepend(boolean _b) throws Exception{
 //BA.debugLineNum = 2044;BA.debugLine="Sub SetSlotBodyPrepend(b As Boolean) As VMDataTabl";
 //BA.debugLineNum = 2045;BA.debugLine="SetAttr(CreateMap(\"slot\": \"body.prepend\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("body.prepend")}));
 //BA.debugLineNum = 2046;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2047;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotexpandeditem(boolean _b) throws Exception{
 //BA.debugLineNum = 2050;BA.debugLine="Sub SetSlotExpandedItem(b As Boolean) As VMDataTab";
 //BA.debugLineNum = 2051;BA.debugLine="SetAttr(CreateMap(\"slot\": \"expanded.item\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("expanded.item")}));
 //BA.debugLineNum = 2052;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2053;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotfooter(boolean _b) throws Exception{
 //BA.debugLineNum = 2056;BA.debugLine="Sub SetSlotFooter(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 2057;BA.debugLine="SetAttr(CreateMap(\"slot\": \"footer\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("footer")}));
 //BA.debugLineNum = 2058;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2059;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotfooterppagetext(boolean _b) throws Exception{
 //BA.debugLineNum = 2062;BA.debugLine="Sub SetSlotFooterPpageText(b As Boolean) As VMData";
 //BA.debugLineNum = 2063;BA.debugLine="SetAttr(CreateMap(\"slot\": \"footer.page-text\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("footer.page-text")}));
 //BA.debugLineNum = 2064;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2065;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotgroup(boolean _b) throws Exception{
 //BA.debugLineNum = 2068;BA.debugLine="Sub SetSlotGroup(b As Boolean) As VMDataTable    '";
 //BA.debugLineNum = 2069;BA.debugLine="SetAttr(CreateMap(\"slot\": \"group\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("group")}));
 //BA.debugLineNum = 2070;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2071;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotgroupheader(boolean _b) throws Exception{
 //BA.debugLineNum = 2074;BA.debugLine="Sub SetSlotGroupHeader(b As Boolean) As VMDataTabl";
 //BA.debugLineNum = 2075;BA.debugLine="SetAttr(CreateMap(\"slot\": \"group.header\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("group.header")}));
 //BA.debugLineNum = 2076;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2077;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotgroupsummary(boolean _b) throws Exception{
 //BA.debugLineNum = 2080;BA.debugLine="Sub SetSlotGroupSummary(b As Boolean) As VMDataTab";
 //BA.debugLineNum = 2081;BA.debugLine="SetAttr(CreateMap(\"slot\": \"group.summary\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("group.summary")}));
 //BA.debugLineNum = 2082;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2083;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotheader(boolean _b) throws Exception{
 //BA.debugLineNum = 2086;BA.debugLine="Sub SetSlotHeader(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 2087;BA.debugLine="SetAttr(CreateMap(\"slot\": \"header\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("header")}));
 //BA.debugLineNum = 2088;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2089;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotheaderdatatableselect(boolean _b) throws Exception{
 //BA.debugLineNum = 2092;BA.debugLine="Sub SetSlotHeaderDataTableSelect(b As Boolean) As";
 //BA.debugLineNum = 2093;BA.debugLine="SetAttr(CreateMap(\"slot\": \"header.data-table-selec";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("header.data-table-select")}));
 //BA.debugLineNum = 2094;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2095;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotitem(boolean _b) throws Exception{
 //BA.debugLineNum = 2098;BA.debugLine="Sub SetSlotItem(b As Boolean) As VMDataTable    'i";
 //BA.debugLineNum = 2099;BA.debugLine="SetAttr(CreateMap(\"slot\": \"item\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("item")}));
 //BA.debugLineNum = 2100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotitemdatatableexpand(boolean _b) throws Exception{
 //BA.debugLineNum = 2104;BA.debugLine="Sub SetSlotItemDataTableExpand(b As Boolean) As VM";
 //BA.debugLineNum = 2105;BA.debugLine="SetAttr(CreateMap(\"slot\": \"item.data-table-expand\"";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("item.data-table-expand")}));
 //BA.debugLineNum = 2106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotitemdatatableselect(boolean _b) throws Exception{
 //BA.debugLineNum = 2110;BA.debugLine="Sub SetSlotItemDataTableSelect(b As Boolean) As VM";
 //BA.debugLineNum = 2111;BA.debugLine="SetAttr(CreateMap(\"slot\": \"item.data-table-select\"";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("item.data-table-select")}));
 //BA.debugLineNum = 2112;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2113;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotloading(boolean _b) throws Exception{
 //BA.debugLineNum = 2116;BA.debugLine="Sub SetSlotLoading(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 2117;BA.debugLine="SetAttr(CreateMap(\"slot\": \"loading\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("loading")}));
 //BA.debugLineNum = 2118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotnodata(boolean _b) throws Exception{
 //BA.debugLineNum = 2122;BA.debugLine="Sub SetSlotNoData(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 2123;BA.debugLine="SetAttr(CreateMap(\"slot\": \"no-data\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("no-data")}));
 //BA.debugLineNum = 2124;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2125;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotnoresults(boolean _b) throws Exception{
 //BA.debugLineNum = 2128;BA.debugLine="Sub SetSlotNoResults(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 2129;BA.debugLine="SetAttr(CreateMap(\"slot\": \"no-results\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("no-results")}));
 //BA.debugLineNum = 2130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslotprogress(boolean _b) throws Exception{
 //BA.debugLineNum = 2134;BA.debugLine="Sub SetSlotProgress(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 2135;BA.debugLine="SetAttr(CreateMap(\"slot\": \"progress\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("progress")}));
 //BA.debugLineNum = 2136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setslottop(boolean _b) throws Exception{
 //BA.debugLineNum = 2140;BA.debugLine="Sub SetSlotTop(b As Boolean) As VMDataTable    'ig";
 //BA.debugLineNum = 2141;BA.debugLine="SetAttr(CreateMap(\"slot\": \"top\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("top")}));
 //BA.debugLineNum = 2142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2143;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setsortby(anywheresoftware.b4a.objects.collections.List _varsortby) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1995;BA.debugLine="Sub SetSortBy(varSortBy As List) As VMDataTable";
 //BA.debugLineNum = 1996;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1997;BA.debugLine="SetAttrSingle(\"sort-by\", BANano.FromJson(varSort";
_setattrsingle("sort-by",BA.ObjectToString(_banano.FromJson((Object)(_varsortby.getObject()))));
 //BA.debugLineNum = 1998;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 2000;BA.debugLine="Dim pp As String = $\"${ID}SortBy\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SortBy");
 //BA.debugLineNum = 2001;BA.debugLine="vue.SetStateSingle(pp, varSortBy)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsortby.getObject()));
 //BA.debugLineNum = 2002;BA.debugLine="DataTable.Bind(\":sort-by\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":sort-by",_pp);
 //BA.debugLineNum = 2003;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2004;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setsortdesc(anywheresoftware.b4a.objects.collections.List _varsortdesc) throws Exception{
String _pp = "";
 //BA.debugLineNum = 2007;BA.debugLine="Sub SetSortDesc(varSortDesc As List) As VMDataTabl";
 //BA.debugLineNum = 2008;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 2009;BA.debugLine="SetAttrSingle(\"sort-desc\", BANano.FromJson(varSo";
_setattrsingle("sort-desc",BA.ObjectToString(_banano.FromJson((Object)(_varsortdesc.getObject()))));
 //BA.debugLineNum = 2010;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 2012;BA.debugLine="Dim pp As String = $\"${ID}SortDesc\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SortDesc");
 //BA.debugLineNum = 2013;BA.debugLine="vue.SetStateSingle(pp, varSortDesc)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsortdesc.getObject()));
 //BA.debugLineNum = 2014;BA.debugLine="DataTable.Bind(\":sort-desc\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":sort-desc",_pp);
 //BA.debugLineNum = 2015;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2016;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setsortfields(String _sortfields) throws Exception{
 //BA.debugLineNum = 2571;BA.debugLine="Sub SetSortFields(sortFields As String) As VMDataT";
 //BA.debugLineNum = 2572;BA.debugLine="If sortFields = \"\" Then Return Me";
if ((_sortfields).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 2573;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2574;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetStatic(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 181;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 182;BA.debugLine="DataTable.SetStatic(b)";
_datatable._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 183;BA.debugLine="vcard.setstatic(b)";
_vcard._setstatic /*b4j.example.vmcard*/ (_b);
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 1506;BA.debugLine="Sub SetStyle(sm As Map) As VMDataTable";
 //BA.debugLineNum = 1507;BA.debugLine="DataTable.SetStyle(sm)";
_datatable._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 1508;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1509;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 2459;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 2460;BA.debugLine="DataTable.SetStyleSingle(prop, value)";
_datatable._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 2461;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2462;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 2447;BA.debugLine="Sub SetTabIndex(ti As String) As VMDataTable";
 //BA.debugLineNum = 2448;BA.debugLine="DataTable.SetTabIndex(ti)";
_datatable._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 2449;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2450;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 1483;BA.debugLine="Sub SetText(t As Object) As VMDataTable";
 //BA.debugLineNum = 1484;BA.debugLine="DataTable.SetText(t)";
_datatable._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 1485;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1486;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _settimecolumns(anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
String _k = "";
 //BA.debugLineNum = 2596;BA.debugLine="Sub SetTimeColumns(dates As List) As VMDataTable";
 //BA.debugLineNum = 2597;BA.debugLine="For Each k As String In dates";
{
final anywheresoftware.b4a.BA.IterableList group1 = _dates;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2598;BA.debugLine="SetColumnType(k, COLUMN_TIME)";
_setcolumntype(_k,_column_time);
 }
};
 //BA.debugLineNum = 2600;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2601;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _settitle(String _stitle) throws Exception{
 //BA.debugLineNum = 704;BA.debugLine="Sub SetTitle(sTitle As String) As VMDataTable";
 //BA.debugLineNum = 705;BA.debugLine="If sTitle = \"\" Then Return Me";
if ((_stitle).equals("")) { 
if (true) return (b4j.example.vmdatatable)(this);};
 //BA.debugLineNum = 706;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 707;BA.debugLine="vcard.Title.SetText(sTitle)";
_vcard._title /*b4j.example.vmcardtitle*/ ._settext /*b4j.example.vmcardtitle*/ (_stitle);
 //BA.debugLineNum = 708;BA.debugLine="vcard.Title.AddSpacer";
_vcard._title /*b4j.example.vmcardtitle*/ ._addspacer /*b4j.example.vmcardtitle*/ ();
 //BA.debugLineNum = 709;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 711;BA.debugLine="vue.SetData(title, sTitle)";
_vue._setdata /*b4j.example.bananovue*/ (_title,(Object)(_stitle));
 //BA.debugLineNum = 712;BA.debugLine="vcard.Title.SetText($\"{{ ${title} }}\"$)";
_vcard._title /*b4j.example.vmcardtitle*/ ._settext /*b4j.example.vmcardtitle*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_title))+" }}"));
 //BA.debugLineNum = 713;BA.debugLine="vcard.Title.AddSpacer";
_vcard._title /*b4j.example.vmcardtitle*/ ._addspacer /*b4j.example.vmcardtitle*/ ();
 //BA.debugLineNum = 714;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 715;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _settotalvisible(String _vartotalvisible) throws Exception{
 //BA.debugLineNum = 1444;BA.debugLine="Sub SetTotalVisible(varTotalVisible As String) As";
 //BA.debugLineNum = 1445;BA.debugLine="totalVisible = varTotalVisible";
_totalvisible = _vartotalvisible;
 //BA.debugLineNum = 1446;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1447;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setvalue(anywheresoftware.b4a.objects.collections.List _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 2020;BA.debugLine="Sub SetValue(varValue As List) As VMDataTable";
 //BA.debugLineNum = 2021;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 2022;BA.debugLine="SetAttrSingle(\"value\", BANano.FromJson(varValue)";
_setattrsingle("value",BA.ObjectToString(_banano.FromJson((Object)(_varvalue.getObject()))));
 //BA.debugLineNum = 2023;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 };
 //BA.debugLineNum = 2025;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 2026;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue.getObject()));
 //BA.debugLineNum = 2027;BA.debugLine="DataTable.Bind(\":value\", pp)";
_datatable._bind /*b4j.example.vmelement*/ (":value",_pp);
 //BA.debugLineNum = 2028;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2029;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 2482;BA.debugLine="Sub SetVhtml(vhtml As String) As VMDataTable";
 //BA.debugLineNum = 2483;BA.debugLine="DataTable.SetVHtml(vhtml)";
_datatable._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 2484;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2485;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 1460;BA.debugLine="Sub SetVIf(vif As String) As VMDataTable";
 //BA.debugLineNum = 1461;BA.debugLine="vcard.SetVIf(vif)";
_vcard._setvif /*b4j.example.vmcard*/ (_vif);
 //BA.debugLineNum = 1462;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1463;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 2503;BA.debugLine="Sub SetVisible(b As Boolean) As VMDataTable";
 //BA.debugLineNum = 2504;BA.debugLine="vcard.SetVisible(b)";
_vcard._setvisible /*b4j.example.vmcard*/ (_b);
 //BA.debugLineNum = 2505;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2506;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 1455;BA.debugLine="Sub SetVModel(k As String) As VMDataTable";
 //BA.debugLineNum = 1456;BA.debugLine="DataTable.SetVModel(k)";
_datatable._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 1457;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 1458;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 2477;BA.debugLine="Sub SetVText(vhtml As String) As VMDataTable";
 //BA.debugLineNum = 2478;BA.debugLine="DataTable.SetVText(vhtml)";
_datatable._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 2479;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2480;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _show() throws Exception{
 //BA.debugLineNum = 2368;BA.debugLine="Sub Show As VMDataTable";
 //BA.debugLineNum = 2369;BA.debugLine="vcard.SetVisible(True)";
_vcard._setvisible /*b4j.example.vmcard*/ (__c.True);
 //BA.debugLineNum = 2370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2371;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
b4j.example.vmelement _pgdiv = null;
b4j.example.vmpagination _pg = null;
 //BA.debugLineNum = 1419;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 1420;BA.debugLine="vue.SetData(keyID, DateTime.Now)";
_vue._setdata /*b4j.example.bananovue*/ (_keyid,(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 1422;BA.debugLine="BuildHeaders(columnsM)";
_buildheaders(_columnsm);
 //BA.debugLineNum = 1423;BA.debugLine="vcard.Bind(\":key\", keyID)";
_vcard._bind /*b4j.example.vmcard*/ (":key",_keyid);
 //BA.debugLineNum = 1424;BA.debugLine="DataTable.Bind(\":headers\", headers)";
_datatable._bind /*b4j.example.vmelement*/ (":headers",_headers);
 //BA.debugLineNum = 1425;BA.debugLine="DataTable.Bind(\":items\", items)";
_datatable._bind /*b4j.example.vmelement*/ (":items",_items);
 //BA.debugLineNum = 1426;BA.debugLine="BuildControls";
_buildcontrols();
 //BA.debugLineNum = 1427;BA.debugLine="vcard.AddStuff(DataTable.ToString)";
_vcard._addstuff /*b4j.example.vmcard*/ (_datatable._tostring /*String*/ ());
 //BA.debugLineNum = 1428;BA.debugLine="If hasExternalPagination Then";
if (_hasexternalpagination) { 
 //BA.debugLineNum = 1429;BA.debugLine="Dim pgDiv As VMElement";
_pgdiv = new b4j.example.vmelement();
 //BA.debugLineNum = 1430;BA.debugLine="pgDiv.Initialize(vue, $\"${ID}pgdiv\"$)";
_pgdiv._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"pgdiv"));
 //BA.debugLineNum = 1431;BA.debugLine="pgDiv.AddClass(\"text-xs-center pt-2\")";
_pgdiv._addclass /*b4j.example.vmelement*/ ("text-xs-center pt-2");
 //BA.debugLineNum = 1433;BA.debugLine="Dim pg As VMPagination";
_pg = new b4j.example.vmpagination();
 //BA.debugLineNum = 1434;BA.debugLine="pg.Initialize(vue, $\"${ID}pagination\"$, Module)";
_pg._initialize /*b4j.example.vmpagination*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"pagination"),_module);
 //BA.debugLineNum = 1435;BA.debugLine="pg.SetTotalVisible(totalVisible)";
_pg._settotalvisible /*b4j.example.vmpagination*/ (_totalvisible);
 //BA.debugLineNum = 1436;BA.debugLine="pg.SetDataTable(ID)";
_pg._setdatatable /*b4j.example.vmpagination*/ (_id);
 //BA.debugLineNum = 1437;BA.debugLine="pgDiv.AddComponent(pg.ToString)";
_pgdiv._addcomponent /*b4j.example.vmelement*/ (_pg._tostring /*String*/ ());
 //BA.debugLineNum = 1438;BA.debugLine="vcard.AddStuff(pgDiv.ToString)";
_vcard._addstuff /*b4j.example.vmcard*/ (_pgdiv._tostring /*String*/ ());
 };
 //BA.debugLineNum = 1440;BA.debugLine="Return vcard.ToString";
if (true) return _vcard._tostring /*String*/ ();
 //BA.debugLineNum = 1441;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatatable  _updatetitle(String _stitle) throws Exception{
 //BA.debugLineNum = 717;BA.debugLine="Sub UpdateTitle(sTitle As String) As VMDataTable";
 //BA.debugLineNum = 718;BA.debugLine="vue.SetData(title, sTitle)";
_vue._setdata /*b4j.example.bananovue*/ (_title,(Object)(_stitle));
 //BA.debugLineNum = 719;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 720;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatatable  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 2400;BA.debugLine="Sub UseTheme(themeName As String) As VMDataTable";
 //BA.debugLineNum = 2401;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 2402;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 2403;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 2404;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 2405;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 2407;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatatable)(this);
 //BA.debugLineNum = 2408;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
