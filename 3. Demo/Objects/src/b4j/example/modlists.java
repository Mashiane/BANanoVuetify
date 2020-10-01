package b4j.example;


import anywheresoftware.b4a.BA;

public class modlists extends Object{
public static modlists mostCurrent = new modlists();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modlists", null);
		ba.loadHtSubs(modlists.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modlists", ba);
		}
	}
    public static Class<?> getObject() {
		return modlists.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _name = "";
public static String _title = "";
public static b4j.example.bananovm _vm = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.bananovue _vue = null;
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moditemgroups _moditemgroups = null;
public static b4j.example.modcalendar _modcalendar = null;
public static b4j.example.modcard _modcard = null;
public static b4j.example.modsparkline _modsparkline = null;
public static b4j.example.modbuttons _modbuttons = null;
public static b4j.example.modchips _modchips = null;
public static b4j.example.moddialog _moddialog = null;
public static b4j.example.modbadges _modbadges = null;
public static b4j.example.modtabs _modtabs = null;
public static b4j.example.modalert _modalert = null;
public static b4j.example.modautocomplete _modautocomplete = null;
public static b4j.example.modavatar _modavatar = null;
public static b4j.example.modbanner _modbanner = null;
public static b4j.example.modbottomnavigation _modbottomnavigation = null;
public static b4j.example.modbottomsheet _modbottomsheet = null;
public static b4j.example.modbreadcrumbs _modbreadcrumbs = null;
public static b4j.example.modcarousel _modcarousel = null;
public static b4j.example.modcheckbox _modcheckbox = null;
public static b4j.example.modcolorpicker _modcolorpicker = null;
public static b4j.example.modcombo _modcombo = null;
public static b4j.example.moddatatable _moddatatable = null;
public static b4j.example.moddatepicker _moddatepicker = null;
public static b4j.example.moddesign _moddesign = null;
public static b4j.example.modexpansionpanels _modexpansionpanels = null;
public static b4j.example.modfileinput _modfileinput = null;
public static b4j.example.modform _modform = null;
public static b4j.example.modgrid _modgrid = null;
public static b4j.example.modicons _modicons = null;
public static b4j.example.modimages _modimages = null;
public static b4j.example.modloadingskeleton _modloadingskeleton = null;
public static b4j.example.modmenus _modmenus = null;
public static b4j.example.modmessageboard _modmessageboard = null;
public static b4j.example.modoverlay _modoverlay = null;
public static b4j.example.modpagination _modpagination = null;
public static b4j.example.modparallax _modparallax = null;
public static b4j.example.modprogress _modprogress = null;
public static b4j.example.modradiogroups _modradiogroups = null;
public static b4j.example.modrating _modrating = null;
public static b4j.example.modrealtimelogging _modrealtimelogging = null;
public static b4j.example.modselects _modselects = null;
public static b4j.example.modslidegroups _modslidegroups = null;
public static b4j.example.modslider _modslider = null;
public static b4j.example.modsnackbar _modsnackbar = null;
public static b4j.example.modstepper _modstepper = null;
public static b4j.example.modswitch _modswitch = null;
public static b4j.example.modtextarea _modtextarea = null;
public static b4j.example.modtextfield _modtextfield = null;
public static b4j.example.modtimeline _modtimeline = null;
public static b4j.example.modtimepicker _modtimepicker = null;
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.modtoolkit _modtoolkit = null;
public static b4j.example.modtreeview _modtreeview = null;
public static b4j.example.modwindow _modwindow = null;
public static b4j.example.pgbrs _pgbrs = null;
public static b4j.example.bananoshared _bananoshared = null;
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmlist _vlist = null;
anywheresoftware.b4a.objects.collections.List _ds = null;
b4j.example.vmlist _vlist1 = null;
 //BA.debugLineNum = 11;BA.debugLine="Sub Code";
 //BA.debugLineNum = 12;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 13;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 15;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modlists.getObject());
 //BA.debugLineNum = 17;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 19;BA.debugLine="cont.AddRows(5).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (5))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 21;BA.debugLine="Dim vList As VMList = vm.CreateList(\"lst1\", Me).S";
_vlist = _vm._createlist /*b4j.example.vmlist*/ ("lst1",modlists.getObject())._setelevation /*b4j.example.vmlist*/ (BA.NumberToString(3));
 //BA.debugLineNum = 22;BA.debugLine="vList.AddSubHeader(\"Reports\")";
_vlist._addsubheader /*b4j.example.vmlist*/ ("Reports");
 //BA.debugLineNum = 23;BA.debugLine="vList.AddItem(\"myfiles\", \"\", \"mdi-folder\", \"My Fi";
_vlist._additem /*b4j.example.vmlist*/ ("myfiles","","mdi-folder","My Files","","");
 //BA.debugLineNum = 24;BA.debugLine="vList.AddItem(\"account\", \"\", \"mdi-account-multipl";
_vlist._additem /*b4j.example.vmlist*/ ("account","","mdi-account-multiple","Shared with Me","","mdi-information");
 //BA.debugLineNum = 25;BA.debugLine="vList.AddItem(\"starred\", \"\", \"mdi-star\", \"Starred";
_vlist._additem /*b4j.example.vmlist*/ ("starred","","mdi-star","Starred","","mdi-information");
 //BA.debugLineNum = 26;BA.debugLine="vList.AddItem(\"person1\", \"./assets/1.png\", \"\", \"\"";
_vlist._additem /*b4j.example.vmlist*/ ("person1","./assets/1.png","","","","mdi-information");
 //BA.debugLineNum = 27;BA.debugLine="vList.AddItem(\"person2\", \"./assets/2.png\", \"\", \"\"";
_vlist._additem /*b4j.example.vmlist*/ ("person2","./assets/2.png","","","","mdi-information");
 //BA.debugLineNum = 28;BA.debugLine="vList.AddItem(\"person3\", \"./assets/1.png\", \"\", \"J";
_vlist._additem /*b4j.example.vmlist*/ ("person3","./assets/1.png","","Jane Smith","Logged In","mdi-information");
 //BA.debugLineNum = 29;BA.debugLine="vList.AddItem(\"sa\", \"\", \"\",  \"Sandra Adams\", \"san";
_vlist._additem /*b4j.example.vmlist*/ ("sa","","","Sandra Adams","sandra_a88@gmail.com","mdi-information");
 //BA.debugLineNum = 30;BA.debugLine="vList.AddItem(\"person4\", \"./assets/2.png\", \"\", \"A";
_vlist._additem /*b4j.example.vmlist*/ ("person4","./assets/2.png","","Anele Mbanga","","mdi-information");
 //BA.debugLineNum = 31;BA.debugLine="vList.AddToContainer(cont, 1,  1)";
_vlist._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 34;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 35;BA.debugLine="vue.AddCode($\"Dim vList As VMList = vm.CreateList(";
_vue._addcode /*String*/ (("Dim vList As VMList = vm.CreateList(\"lst1\", Me).SetElevation(3)"));
 //BA.debugLineNum = 36;BA.debugLine="vue.AddCode($\"vList.AddSubHeader(\"Reports\")\"$)";
_vue._addcode /*String*/ (("vList.AddSubHeader(\"Reports\")"));
 //BA.debugLineNum = 37;BA.debugLine="vue.AddCode($\"vList.AddItem(\"myfiles\", \"\", \"mdi-fo";
_vue._addcode /*String*/ (("vList.AddItem(\"myfiles\", \"\", \"mdi-folder\", \"My Files\", \"\", \"\")"));
 //BA.debugLineNum = 38;BA.debugLine="vue.AddCode($\"vList.AddItem(\"account\", \"\", \"mdi-ac";
_vue._addcode /*String*/ (("vList.AddItem(\"account\", \"\", \"mdi-account-multiple\", \"Shared with Me\", \"\",\"mdi-information\")"));
 //BA.debugLineNum = 39;BA.debugLine="vue.AddCode($\"vList.AddItem(\"starred\", \"\", \"mdi-st";
_vue._addcode /*String*/ (("vList.AddItem(\"starred\", \"\", \"mdi-star\", \"Starred\", \"\",\"mdi-information\")"));
 //BA.debugLineNum = 40;BA.debugLine="vue.AddCode($\"vList.AddItem(\"person1\", \"./assets/1";
_vue._addcode /*String*/ (("vList.AddItem(\"person1\", \"./assets/1.png\", \"\", \"\", \"\",\"mdi-information\")"));
 //BA.debugLineNum = 41;BA.debugLine="vue.AddCode($\"vList.AddItem(\"person2\", \"./assets/2";
_vue._addcode /*String*/ (("vList.AddItem(\"person2\", \"./assets/2.png\", \"\", \"\", \"\",\"mdi-information\")"));
 //BA.debugLineNum = 42;BA.debugLine="vue.AddCode($\"vList.AddItem(\"person3\", \"./assets/1";
_vue._addcode /*String*/ (("vList.AddItem(\"person3\", \"./assets/1.png\", \"\", \"Jane Smith\", \"Logged In\",\"mdi-information\")"));
 //BA.debugLineNum = 43;BA.debugLine="vue.AddCode($\"vList.AddItem(\"sa\", \"\", \"\",  \"Sandra";
_vue._addcode /*String*/ (("vList.AddItem(\"sa\", \"\", \"\",  \"Sandra Adams\", \"sandra_a88@gmail.com\",\"mdi-information\")"));
 //BA.debugLineNum = 44;BA.debugLine="vue.AddCode($\"vList.AddItem(\"person4\", \"./assets/2";
_vue._addcode /*String*/ (("vList.AddItem(\"person4\", \"./assets/2.png\", \"\", \"Anele Mbanga\", \"\",\"mdi-information\")"));
 //BA.debugLineNum = 45;BA.debugLine="vue.AddCode($\"vList.AddToContainer(cont, 1,  1)\"$)";
_vue._addcode /*String*/ (("vList.AddToContainer(cont, 1,  1)"));
 //BA.debugLineNum = 46;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"list1code\", \"List\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modlists.getObject(),"list1code","List",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 49;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 50;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 51;BA.debugLine="vue.AddCode($\"Sub lst1_click(e As BANanoEvent)\"$)";
_vue._addcode /*String*/ (("Sub lst1_click(e As BANanoEvent)"));
 //BA.debugLineNum = 52;BA.debugLine="vue.AddCode($\"Dim itemID As String = vm.GetIDFromE";
_vue._addcode /*String*/ (("Dim itemID As String = vm.GetIDFromEvent(e)"));
 //BA.debugLineNum = 53;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(itemID)\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(itemID)"));
 //BA.debugLineNum = 54;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 55;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"list1click\", \"List";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modlists.getObject(),"list1click","List Item Click",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 60;BA.debugLine="Dim ds As List";
_ds = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 61;BA.debugLine="ds.Initialize";
_ds.Initialize();
 //BA.debugLineNum = 62;BA.debugLine="ds.Add(CreateMap(\"action\": \"move_to_inbox\",	\"titl";
_ds.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("action"),(Object)("move_to_inbox"),(Object)("title"),(Object)("Inbox")}).getObject()));
 //BA.debugLineNum = 63;BA.debugLine="ds.Add(CreateMap(\"action\": \"send\", \"title\": \"Sent";
_ds.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("action"),(Object)("send"),(Object)("title"),(Object)("Sent")}).getObject()));
 //BA.debugLineNum = 64;BA.debugLine="ds.Add(CreateMap(\"action\": \"delete\", \"title\": \"Tr";
_ds.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("action"),(Object)("delete"),(Object)("title"),(Object)("Trash")}).getObject()));
 //BA.debugLineNum = 65;BA.debugLine="ds.Add(CreateMap(\"action\": \"report\", \"title\": \"Sp";
_ds.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("action"),(Object)("report"),(Object)("title"),(Object)("Spam")}).getObject()));
 //BA.debugLineNum = 66;BA.debugLine="ds.Add(CreateMap(\"divider\": True))";
_ds.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("divider"),(Object)(anywheresoftware.b4a.keywords.Common.True)}).getObject()));
 //BA.debugLineNum = 67;BA.debugLine="ds.Add(CreateMap(\"header\": \"Labels\"))";
_ds.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("header"),(Object)("Labels")}).getObject()));
 //BA.debugLineNum = 68;BA.debugLine="ds.Add(CreateMap(\"action\": \"label\", \"title\": \"Fam";
_ds.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("action"),(Object)("label"),(Object)("title"),(Object)("Family")}).getObject()));
 //BA.debugLineNum = 69;BA.debugLine="ds.Add(CreateMap(\"action\": \"label\", \"title\": \"Fri";
_ds.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("action"),(Object)("label"),(Object)("title"),(Object)("Friends")}).getObject()));
 //BA.debugLineNum = 70;BA.debugLine="ds.Add(CreateMap(\"action\": \"label\", \"title\": \"Wor";
_ds.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("action"),(Object)("label"),(Object)("title"),(Object)("Work")}).getObject()));
 //BA.debugLineNum = 72;BA.debugLine="vm.SetData(\"lst2\", ds)";
_vm._setdata /*b4j.example.bananovm*/ ("lst2",(Object)(_ds.getObject()));
 //BA.debugLineNum = 73;BA.debugLine="Dim vList1 As VMList = vm.CreateList(\"lst2\", Me).";
_vlist1 = _vm._createlist /*b4j.example.vmlist*/ ("lst2",modlists.getObject())._setelevation /*b4j.example.vmlist*/ (BA.NumberToString(3));
 //BA.debugLineNum = 74;BA.debugLine="vList1.SetDataSourceTemplate(\"lst2\", \"action\", \"\"";
_vlist1._setdatasourcetemplate /*b4j.example.vmlist*/ ("lst2","action","","action","title","","");
 //BA.debugLineNum = 75;BA.debugLine="vList1.AddToContainer(cont, 2,  1)";
_vlist1._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 78;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 79;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 80;BA.debugLine="vue.AddCode($\"Dim ds As List\"$)";
_vue._addcode /*String*/ (("Dim ds As List"));
 //BA.debugLineNum = 81;BA.debugLine="vue.AddCode($\"ds.Initialize\"$)";
_vue._addcode /*String*/ (("ds.Initialize"));
 //BA.debugLineNum = 82;BA.debugLine="vue.AddCode($\"ds.Add(CreateMap(\"action\": \"move_to_";
_vue._addcode /*String*/ (("ds.Add(CreateMap(\"action\": \"move_to_inbox\",	\"title\": \"Inbox\"))"));
 //BA.debugLineNum = 83;BA.debugLine="vue.AddCode($\"ds.Add(CreateMap(\"action\": \"send\", \"";
_vue._addcode /*String*/ (("ds.Add(CreateMap(\"action\": \"send\", \"title\": \"Sent\"))"));
 //BA.debugLineNum = 84;BA.debugLine="vue.AddCode($\"ds.Add(CreateMap(\"action\": \"delete\",";
_vue._addcode /*String*/ (("ds.Add(CreateMap(\"action\": \"delete\", \"title\": \"Trash\"))"));
 //BA.debugLineNum = 85;BA.debugLine="vue.AddCode($\"ds.Add(CreateMap(\"action\": \"report\",";
_vue._addcode /*String*/ (("ds.Add(CreateMap(\"action\": \"report\", \"title\": \"Spam\"))"));
 //BA.debugLineNum = 86;BA.debugLine="vue.AddCode($\"ds.Add(CreateMap(\"divider\": True))\"$";
_vue._addcode /*String*/ (("ds.Add(CreateMap(\"divider\": True))"));
 //BA.debugLineNum = 87;BA.debugLine="vue.AddCode($\"ds.Add(CreateMap(\"header\": \"Labels\")";
_vue._addcode /*String*/ (("ds.Add(CreateMap(\"header\": \"Labels\"))"));
 //BA.debugLineNum = 88;BA.debugLine="vue.AddCode($\"ds.Add(CreateMap(\"action\": \"label\",";
_vue._addcode /*String*/ (("ds.Add(CreateMap(\"action\": \"label\", \"title\": \"Family\"))"));
 //BA.debugLineNum = 89;BA.debugLine="vue.AddCode($\"ds.Add(CreateMap(\"action\": \"label\",";
_vue._addcode /*String*/ (("ds.Add(CreateMap(\"action\": \"label\", \"title\": \"Friends\"))"));
 //BA.debugLineNum = 90;BA.debugLine="vue.AddCode($\"ds.Add(CreateMap(\"action\": \"label\",";
_vue._addcode /*String*/ (("ds.Add(CreateMap(\"action\": \"label\", \"title\": \"Work\"))"));
 //BA.debugLineNum = 91;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 92;BA.debugLine="vue.AddCode($\"vm.SetData(\"lst2\", ds)\"$)";
_vue._addcode /*String*/ (("vm.SetData(\"lst2\", ds)"));
 //BA.debugLineNum = 93;BA.debugLine="vue.AddCode($\"Dim vList1 As VMList = vm.CreateList";
_vue._addcode /*String*/ (("Dim vList1 As VMList = vm.CreateList(\"lst2\", Me).SetElevation(3)"));
 //BA.debugLineNum = 94;BA.debugLine="vue.AddCode($\"vList1.SetDataSourceTemplate(\"lst2\",";
_vue._addcode /*String*/ (("vList1.SetDataSourceTemplate(\"lst2\", \"action\", \"\", \"action\", \"title\", \"\", \"\")"));
 //BA.debugLineNum = 95;BA.debugLine="vue.AddCode($\"vList1.AddToContainer(cont, 2,  1)\"$";
_vue._addcode /*String*/ (("vList1.AddToContainer(cont, 2,  1)"));
 //BA.debugLineNum = 96;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"list2code\", \"List S";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modlists.getObject(),"list2code","List State",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 99;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public static String  _list1clickcopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub list1clickcopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 104;BA.debugLine="vue.CopyCode2Clipboard(\"list1click\")";
_vue._copycode2clipboard /*String*/ ("list1click");
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public static String  _list1clickdownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub list1clickdownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 108;BA.debugLine="vue.DownloadCode(\"list1click\", \"list1click.txt\")";
_vue._downloadcode /*String*/ ("list1click","list1click.txt");
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public static String  _list1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub list1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 118;BA.debugLine="vue.CopyCode2Clipboard(\"list1code\")";
_vue._copycode2clipboard /*String*/ ("list1code");
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public static String  _list1codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub list1codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 122;BA.debugLine="vue.DownloadCode(\"list1code\", \"list1code.txt\")";
_vue._downloadcode /*String*/ ("list1code","list1code.txt");
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public static String  _list2codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub list2codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 127;BA.debugLine="vue.CopyCode2Clipboard(\"list2code\")";
_vue._copycode2clipboard /*String*/ ("list2code");
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public static String  _list2codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub list2codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 131;BA.debugLine="vue.DownloadCode(\"list2code\", \"list2code.txt\")";
_vue._downloadcode /*String*/ ("list2code","list2code.txt");
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public static String  _lst1_click(com.ab.banano.BANanoEvent _e) throws Exception{
String _itemid = "";
 //BA.debugLineNum = 111;BA.debugLine="Sub lst1_click(e As BANanoEvent)";
 //BA.debugLineNum = 112;BA.debugLine="Dim itemID As String = vm.GetIDFromEvent(e)";
_itemid = _vm._getidfromevent /*String*/ (_e);
 //BA.debugLineNum = 113;BA.debugLine="vm.ShowSnackBar(itemID)";
_vm._showsnackbar /*String*/ (_itemid);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"listCode\"";
_name = "listCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Lists\"";
_title = "Lists";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
}
