package b4j.example;


import anywheresoftware.b4a.BA;

public class modselects extends Object{
public static modselects mostCurrent = new modselects();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modselects", null);
		ba.loadHtSubs(modselects.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modselects", ba);
		}
	}
    public static Class<?> getObject() {
		return modselects.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _name = "";
public static String _title = "";
public static b4j.example.bananovm _vm = null;
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
public static b4j.example.modlists _modlists = null;
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
b4j.example.vmselect _sel8 = null;
b4j.example.vmselect _sel9 = null;
b4j.example.vmselect _sellist = null;
b4j.example.vmselect _sellist1 = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub Code";
 //BA.debugLineNum = 10;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modselects.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.AddRows(20).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (20))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="vm.setstatesingle(\"items\", Array(\"Programming\", \"";
_vm._setstatesingle /*b4j.example.bananovm*/ ("items",(Object)(new Object[]{(Object)("Programming"),(Object)("Design"),(Object)("Vue"),(Object)("Vuetify")}));
 //BA.debugLineNum = 19;BA.debugLine="vm.SetStateSingle(\"states\", Array(\"Alabama\", \"Ala";
_vm._setstatesingle /*b4j.example.bananovm*/ ("states",(Object)(new Object[]{(Object)("Alabama"),(Object)("Alaska"),(Object)("American Samoa"),(Object)("Arizona"),(Object)("Arkansas"),(Object)("California"),(Object)("Colorado"),(Object)("Connecticut"),(Object)("Delaware"),(Object)("District of Columbia"),(Object)("Federated States of Micronesia"),(Object)("Florida"),(Object)("Georgia"),(Object)("Guam"),(Object)("Hawaii"),(Object)("Idaho"),(Object)("Illinois"),(Object)("Indiana"),(Object)("Iowa"),(Object)("Kansas"),(Object)("Kentucky"),(Object)("Louisiana"),(Object)("Maine"),(Object)("Marshall Islands"),(Object)("Maryland"),(Object)("Massachusetts"),(Object)("Michigan"),(Object)("Minnesota"),(Object)("Mississippi"),(Object)("Missouri"),(Object)("Montana"),(Object)("Nebraska"),(Object)("Nevada"),(Object)("New Hampshire"),(Object)("New Jersey"),(Object)("New Mexico"),(Object)("New York"),(Object)("North Carolina"),(Object)("North Dakota"),(Object)("Northern Mariana Islands"),(Object)("Ohio"),(Object)("Oklahoma"),(Object)("Oregon"),(Object)("Palau"),(Object)("Pennsylvania"),(Object)("Puerto Rico"),(Object)("Rhode Island"),(Object)("South Carolina"),(Object)("South Dakota"),(Object)("Tennessee"),(Object)("Texas"),(Object)("Utah"),(Object)("Vermont"),(Object)("Virgin Island"),(Object)("Virginia"),(Object)("Washington"),(Object)("West Virginia"),(Object)("Wisconsin"),(Object)("Wyoming")}));
 //BA.debugLineNum = 34;BA.debugLine="vm.CreateSelect(\"sel1\", Me).SetItems(\"items\").Set";
_vm._createselect /*b4j.example.vmselect*/ ("sel1",modselects.getObject())._setitems /*b4j.example.vmselect*/ ("items")._setlabel /*b4j.example.vmselect*/ ("Disabled")._setdisabled /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 36;BA.debugLine="vm.CreateSelect(\"sel2\", Me).SetItems(\"items\").Set";
_vm._createselect /*b4j.example.vmselect*/ ("sel2",modselects.getObject())._setitems /*b4j.example.vmselect*/ ("items")._setlabel /*b4j.example.vmselect*/ ("Read Only")._setreadonly /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 38;BA.debugLine="vm.CreateSelect(\"sel3\", Me).SetMultiple(True).Set";
_vm._createselect /*b4j.example.vmselect*/ ("sel3",modselects.getObject())._setmultiple /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setchips /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setattach /*b4j.example.vmselect*/ (BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True))._setvmodel /*b4j.example.vmselect*/ ("sel3")._setitems /*b4j.example.vmselect*/ ("items")._setlabel /*b4j.example.vmselect*/ ("Chips")._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 40;BA.debugLine="vm.CreateSelect(\"sel4\", Me).SetFilled(True).SetOn";
_vm._createselect /*b4j.example.vmselect*/ ("sel4",modselects.getObject())._setfilled /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setonchange /*b4j.example.vmselect*/ (modselects.getObject(),"sel4_change")._setchips /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setattach /*b4j.example.vmselect*/ (BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True))._setvmodel /*b4j.example.vmselect*/ ("sel4")._setitems /*b4j.example.vmselect*/ ("items")._setlabel /*b4j.example.vmselect*/ ("Chips")._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 42;BA.debugLine="vm.CreateSelect(\"sel5\", Me).SetOutlined(True).Set";
_vm._createselect /*b4j.example.vmselect*/ ("sel5",modselects.getObject())._setoutlined /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setmultiple /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setchips /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setvmodel /*b4j.example.vmselect*/ ("sel5")._setitems /*b4j.example.vmselect*/ ("items")._setlabel /*b4j.example.vmselect*/ ("Chips")._addtocontainer /*String*/ (_cont,(int) (5),(int) (1));
 //BA.debugLineNum = 44;BA.debugLine="vm.CreateSelect(\"sel6\", Me).SetSolo(True).SetMult";
_vm._createselect /*b4j.example.vmselect*/ ("sel6",modselects.getObject())._setsolo /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setmultiple /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setchips /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setvmodel /*b4j.example.vmselect*/ ("sel6")._setitems /*b4j.example.vmselect*/ ("items")._setlabel /*b4j.example.vmselect*/ ("Chips")._addtocontainer /*String*/ (_cont,(int) (6),(int) (1));
 //BA.debugLineNum = 46;BA.debugLine="vm.CreateSelect(\"sel7\", Me).SetMenuProps(\"auto\").";
_vm._createselect /*b4j.example.vmselect*/ ("sel7",modselects.getObject())._setmenuprops /*b4j.example.vmselect*/ ((Object)("auto"))._sethidedetails /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setprependicon /*b4j.example.vmselect*/ ("map")._setsingleline /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setvmodel /*b4j.example.vmselect*/ ("sel7")._setitems /*b4j.example.vmselect*/ ("states")._setlabel /*b4j.example.vmselect*/ ("States")._addtocontainer /*String*/ (_cont,(int) (7),(int) (1));
 //BA.debugLineNum = 48;BA.debugLine="Dim sel8 As VMSelect = vm.CreateSelect(\"sel8\", Me";
_sel8 = _vm._createselect /*b4j.example.vmselect*/ ("sel8",modselects.getObject())._setmenuprops /*b4j.example.vmselect*/ ((Object)("auto"))._sethidedetails /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setappendoutericon /*b4j.example.vmselect*/ ("map")._setvmodel /*b4j.example.vmselect*/ ("sel8")._setitems /*b4j.example.vmselect*/ ("states")._setlabel /*b4j.example.vmselect*/ ("States");
 //BA.debugLineNum = 49;BA.debugLine="sel8.SetHint(\"Pick your favorite states\").SetPers";
_sel8._sethint /*b4j.example.vmselect*/ ("Pick your favorite states")._setpersistenthint /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setmultiple /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 50;BA.debugLine="sel8.AddToContainer(cont, 8, 1)";
_sel8._addtocontainer /*String*/ (_cont,(int) (8),(int) (1));
 //BA.debugLineNum = 52;BA.debugLine="Dim sel9 As VMSelect = vm.CreateSelect(\"sel9\", Me";
_sel9 = _vm._createselect /*b4j.example.vmselect*/ ("sel9",modselects.getObject())._setvmodel /*b4j.example.vmselect*/ ("sel9")._setlabel /*b4j.example.vmselect*/ ("Key Value Pairs")._setpersistenthint /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 53;BA.debugLine="sel9.SetOptions(\"littlestates\", CreateMap(\"Florid";
_sel9._setoptions /*b4j.example.vmselect*/ ("littlestates",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Florida"),(Object)("FL"),(Object)("Georgia"),(Object)("GA"),(Object)("Nebraska"),(Object)("NE"),(Object)("California"),(Object)("CA"),(Object)("New York"),(Object)("NY")}),"state","abbr",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 54;BA.debugLine="sel9.AddToContainer(cont, 9, 1)";
_sel9._addtocontainer /*String*/ (_cont,(int) (9),(int) (1));
 //BA.debugLineNum = 56;BA.debugLine="vm.CreateSelect(\"sel10\", Me).SetVModel(\"value\").S";
_vm._createselect /*b4j.example.vmselect*/ ("sel10",modselects.getObject())._setvmodel /*b4j.example.vmselect*/ ("value")._setitems /*b4j.example.vmselect*/ ("items")._setlabel /*b4j.example.vmselect*/ ("Standard")._setdense /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (10),(int) (1));
 //BA.debugLineNum = 58;BA.debugLine="vm.CreateSelect(\"sel11\", Me).SetVModel(\"value\").S";
_vm._createselect /*b4j.example.vmselect*/ ("sel11",modselects.getObject())._setvmodel /*b4j.example.vmselect*/ ("value")._setitems /*b4j.example.vmselect*/ ("items")._setlabel /*b4j.example.vmselect*/ ("Filled")._setfilled /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setdense /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (11),(int) (1));
 //BA.debugLineNum = 60;BA.debugLine="vm.CreateSelect(\"sel12\", Me).SetVModel(\"value\").S";
_vm._createselect /*b4j.example.vmselect*/ ("sel12",modselects.getObject())._setvmodel /*b4j.example.vmselect*/ ("value")._setitems /*b4j.example.vmselect*/ ("items")._setlabel /*b4j.example.vmselect*/ ("Outlined")._setoutlined /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setdense /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (12),(int) (1));
 //BA.debugLineNum = 62;BA.debugLine="vm.CreateSelect(\"sel13\", Me).SetVModel(\"value\").S";
_vm._createselect /*b4j.example.vmselect*/ ("sel13",modselects.getObject())._setvmodel /*b4j.example.vmselect*/ ("value")._setitems /*b4j.example.vmselect*/ ("items")._setlabel /*b4j.example.vmselect*/ ("Solo")._setsolo /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setdense /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (13),(int) (1));
 //BA.debugLineNum = 65;BA.debugLine="Dim selList As VMSelect = vm.CreateSelect(\"selLis";
_sellist = _vm._createselect /*b4j.example.vmselect*/ ("selList",modselects.getObject());
 //BA.debugLineNum = 66;BA.debugLine="selList.setvmodel(\"mylistx\")";
_sellist._setvmodel /*b4j.example.vmselect*/ ("mylistx");
 //BA.debugLineNum = 67;BA.debugLine="selList.SetLabel(\"List Items\")";
_sellist._setlabel /*b4j.example.vmselect*/ ("List Items");
 //BA.debugLineNum = 68;BA.debugLine="selList.AddListItem(\"myfiles\", \"\", \"mdi-folder\",";
_sellist._addlistitem /*b4j.example.vmselect*/ ("myfiles","","mdi-folder","red","My Files","","");
 //BA.debugLineNum = 69;BA.debugLine="selList.AddListItem(\"account\", \"\", \"mdi-account-m";
_sellist._addlistitem /*b4j.example.vmselect*/ ("account","","mdi-account-multiple","blue","Shared with Me","","");
 //BA.debugLineNum = 70;BA.debugLine="selList.AddListItem(\"starred\", \"\", \"mdi-star\", \"y";
_sellist._addlistitem /*b4j.example.vmselect*/ ("starred","","mdi-star","yellow","Starred","","");
 //BA.debugLineNum = 71;BA.debugLine="selList.AddListItem(\"person1\", \"./assets/1.png\",";
_sellist._addlistitem /*b4j.example.vmselect*/ ("person1","./assets/1.png","","","Person 1","","");
 //BA.debugLineNum = 72;BA.debugLine="selList.AddListItem(\"person2\", \"./assets/2.png\",";
_sellist._addlistitem /*b4j.example.vmselect*/ ("person2","./assets/2.png","","","Person 2","","");
 //BA.debugLineNum = 73;BA.debugLine="selList.AddListItem(\"person3\", \"./assets/1.png\",";
_sellist._addlistitem /*b4j.example.vmselect*/ ("person3","./assets/1.png","","","Jane Smith","Logged In","");
 //BA.debugLineNum = 74;BA.debugLine="selList.AddListItem(\"sa\", \"\", \"\",  \"\", \"Sandra Ad";
_sellist._addlistitem /*b4j.example.vmselect*/ ("sa","","","","Sandra Adams","Chief Executive Officer","sandra_a88@gmail.com");
 //BA.debugLineNum = 75;BA.debugLine="selList.AddListItem(\"person4\", \"./assets/2.png\",";
_sellist._addlistitem /*b4j.example.vmselect*/ ("person4","./assets/2.png","","","Anele Mbanga","","");
 //BA.debugLineNum = 76;BA.debugLine="selList.SetOnChange(Me, \"sellist_change\")";
_sellist._setonchange /*b4j.example.vmselect*/ (modselects.getObject(),"sellist_change");
 //BA.debugLineNum = 77;BA.debugLine="selList.AddToContainer(cont, 14,  1)";
_sellist._addtocontainer /*String*/ (_cont,(int) (14),(int) (1));
 //BA.debugLineNum = 79;BA.debugLine="Dim selList1 As VMSelect = vm.CreateSelect(\"selLi";
_sellist1 = _vm._createselect /*b4j.example.vmselect*/ ("selList1",modselects.getObject());
 //BA.debugLineNum = 80;BA.debugLine="selList1.setvmodel(\"mylistx\")";
_sellist1._setvmodel /*b4j.example.vmselect*/ ("mylistx");
 //BA.debugLineNum = 81;BA.debugLine="selList1.SetLabel(\"Add at runtime\")";
_sellist1._setlabel /*b4j.example.vmselect*/ ("Add at runtime");
 //BA.debugLineNum = 83;BA.debugLine="selList1.AddItem(\"dummy\", \"dummy\")";
_sellist1._additem /*b4j.example.vmselect*/ ("dummy","dummy");
 //BA.debugLineNum = 84;BA.debugLine="selList1.AddToContainer(cont, 15,  1)";
_sellist1._addtocontainer /*String*/ (_cont,(int) (15),(int) (1));
 //BA.debugLineNum = 86;BA.debugLine="selList1.Clear";
_sellist1._clear /*b4j.example.vmselect*/ ();
 //BA.debugLineNum = 87;BA.debugLine="selList1.AddItem(\"markhams\", \"Khanyiso\")";
_sellist1._additem /*b4j.example.vmselect*/ ("markhams","Khanyiso");
 //BA.debugLineNum = 88;BA.debugLine="selList1.AddItem(\"siba\", \"Usibabale\")";
_sellist1._additem /*b4j.example.vmselect*/ ("siba","Usibabale");
 //BA.debugLineNum = 89;BA.debugLine="selList1.AddItem(\"orio\", \"Olothando\")";
_sellist1._additem /*b4j.example.vmselect*/ ("orio","Olothando");
 //BA.debugLineNum = 90;BA.debugLine="selList1.AddItem(\"ernesto\", \"Esona\")";
_sellist1._additem /*b4j.example.vmselect*/ ("ernesto","Esona");
 //BA.debugLineNum = 91;BA.debugLine="selList1.AddItem(\"gift\", \"Sisipho\")";
_sellist1._additem /*b4j.example.vmselect*/ ("gift","Sisipho");
 //BA.debugLineNum = 92;BA.debugLine="selList1.Update";
_sellist1._update /*String*/ ();
 //BA.debugLineNum = 95;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"selectsCode\"";
_name = "selectsCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Selects\"";
_title = "Selects";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public static String  _sel4_change(Object _value) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub sel4_change(value As Object)";
 //BA.debugLineNum = 104;BA.debugLine="vm.ShowSnackBar(value)";
_vm._showsnackbar /*String*/ (BA.ObjectToString(_value));
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public static String  _sellist_change(Object _value) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub selList_change(value As Object)";
 //BA.debugLineNum = 100;BA.debugLine="vm.ShowSnackBarSuccess(value)";
_vm._showsnackbarsuccess /*String*/ (BA.ObjectToString(_value));
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
}
