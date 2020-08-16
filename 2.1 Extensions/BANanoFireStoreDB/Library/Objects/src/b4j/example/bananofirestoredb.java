package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananofirestoredb extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.bananofirestoredb", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananofirestoredb.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _firebaseconfig = null;
public String _apikey = "";
public String _authdomain = "";
public String _databaseurl = "";
public String _projectid = "";
public String _storagebucket = "";
public String _messagingsenderid = "";
public String _appid = "";
public String _measurementid = "";
public com.ab.banano.BANano _banano = null;
public com.ab.banano.BANanoObject _firebase = null;
public com.ab.banano.BANanoObject _firebaseapp = null;
public com.ab.banano.BANanoObject _firestore = null;
public String _fromcollection = "";
public anywheresoftware.b4a.objects.collections.List _whereclauses = null;
public String _fb_eq = "";
public String _fb_gt = "";
public String _fb_ge = "";
public String _fb_lt = "";
public String _fb_le = "";
public String _fb_in = "";
public String _fb_contains_any = "";
public String _fb_contains = "";
public String _fb_ne = "";
public String _fb_asc = "";
public String _fb_desc = "";
public String _fb_added = "";
public String _fb_modified = "";
public String _fb_removed = "";
public anywheresoftware.b4a.objects.collections.Map _ordering = null;
public int _limitselectionto = 0;
public Object _ostartat = null;
public Object _oendat = null;
public com.ab.banano.BANanoObject _storage = null;
public com.ab.banano.BANanoObject _performance = null;
public com.ab.banano.BANanoObject _analytics = null;
public anywheresoftware.b4a.objects.collections.Map _settings = null;
public com.ab.banano.BANanoObject _googleauthprovider = null;
public com.ab.banano.BANanoObject _facebookauthprovider = null;
public com.ab.banano.BANanoObject _twitterauthprovider = null;
public com.ab.banano.BANanoObject _githubauthprovider = null;
public b4j.example.main _main = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private firebaseConfig As Map";
_firebaseconfig = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 3;BA.debugLine="Public apiKey As String";
_apikey = "";
 //BA.debugLineNum = 4;BA.debugLine="Public authDomain As String";
_authdomain = "";
 //BA.debugLineNum = 5;BA.debugLine="Public databaseURL As String";
_databaseurl = "";
 //BA.debugLineNum = 6;BA.debugLine="Public projectId As String";
_projectid = "";
 //BA.debugLineNum = 7;BA.debugLine="Public storageBucket As String";
_storagebucket = "";
 //BA.debugLineNum = 8;BA.debugLine="Public messagingSenderId As String";
_messagingsenderid = "";
 //BA.debugLineNum = 9;BA.debugLine="Public appId As String";
_appid = "";
 //BA.debugLineNum = 10;BA.debugLine="Public measurementId As String";
_measurementid = "";
 //BA.debugLineNum = 11;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 12;BA.debugLine="Private firebase As BANanoObject";
_firebase = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 13;BA.debugLine="Private firebaseApp As BANanoObject";
_firebaseapp = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 14;BA.debugLine="Private firestore As BANanoObject";
_firestore = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 16;BA.debugLine="Private fromCollection As String";
_fromcollection = "";
 //BA.debugLineNum = 17;BA.debugLine="Private whereClauses As List";
_whereclauses = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 19;BA.debugLine="Public const FB_EQ As String = \"==\"";
_fb_eq = "==";
 //BA.debugLineNum = 20;BA.debugLine="Public const FB_GT As String = \">\"";
_fb_gt = ">";
 //BA.debugLineNum = 21;BA.debugLine="Public const FB_GE As String = \">=\"";
_fb_ge = ">=";
 //BA.debugLineNum = 22;BA.debugLine="Public const FB_LT As String = \"<\"";
_fb_lt = "<";
 //BA.debugLineNum = 23;BA.debugLine="Public const FB_LE As String = \"<=\"";
_fb_le = "<=";
 //BA.debugLineNum = 24;BA.debugLine="Public const FB_IN As String = \"in\"";
_fb_in = "in";
 //BA.debugLineNum = 25;BA.debugLine="Public const FB_CONTAINS_ANY As String = \"array-c";
_fb_contains_any = "array-contains-any";
 //BA.debugLineNum = 26;BA.debugLine="Public const FB_CONTAINS As String = \"array-conta";
_fb_contains = "array-contains";
 //BA.debugLineNum = 27;BA.debugLine="Public const FB_NE As String = \"ne\"";
_fb_ne = "ne";
 //BA.debugLineNum = 28;BA.debugLine="Public const FB_ASC As String = \"asc\"";
_fb_asc = "asc";
 //BA.debugLineNum = 29;BA.debugLine="Public const FB_DESC As String = \"desc\"";
_fb_desc = "desc";
 //BA.debugLineNum = 31;BA.debugLine="Public const FB_ADDED As String = \"added\"";
_fb_added = "added";
 //BA.debugLineNum = 32;BA.debugLine="Public const FB_MODIFIED As String = \"modified\"";
_fb_modified = "modified";
 //BA.debugLineNum = 33;BA.debugLine="Public const FB_REMOVED As String = \"removed\"";
_fb_removed = "removed";
 //BA.debugLineNum = 35;BA.debugLine="Private ordering As Map";
_ordering = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 36;BA.debugLine="Private limitSelectionTo As Int";
_limitselectionto = 0;
 //BA.debugLineNum = 37;BA.debugLine="Private ostartAt As Object";
_ostartat = new Object();
 //BA.debugLineNum = 38;BA.debugLine="Private oendAt As Object";
_oendat = new Object();
 //BA.debugLineNum = 40;BA.debugLine="Public storage As BANanoObject";
_storage = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 41;BA.debugLine="Public performance As BANanoObject";
_performance = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 42;BA.debugLine="Public analytics As BANanoObject";
_analytics = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 43;BA.debugLine="Private settings As Map";
_settings = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 44;BA.debugLine="Private GoogleAuthProvider As BANanoObject";
_googleauthprovider = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 45;BA.debugLine="Private FacebookAuthProvider As BANanoObject";
_facebookauthprovider = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 46;BA.debugLine="Private TwitterAuthProvider As BANanoObject";
_twitterauthprovider = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 47;BA.debugLine="Private GithubAuthProvider As BANanoObject";
_githubauthprovider = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoPromise  _collectionadd(String _collection,anywheresoftware.b4a.objects.collections.Map _record) throws Exception{
com.ab.banano.BANanoPromise _promadd = null;
 //BA.debugLineNum = 223;BA.debugLine="Sub collectionAdd(Collection As String, record As";
 //BA.debugLineNum = 225;BA.debugLine="Dim promAdd As BANanoPromise = getCollection(Coll";
_promadd = new com.ab.banano.BANanoPromise();
_promadd = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_getcollection(_collection).RunMethod("add",(Object)(new Object[]{(Object)(_record.getObject())})).getObject()));
 //BA.debugLineNum = 226;BA.debugLine="Return promAdd";
if (true) return _promadd;
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _collectiondelete(String _collection,String _colid) throws Exception{
com.ab.banano.BANanoPromise _promdel = null;
 //BA.debugLineNum = 238;BA.debugLine="Sub collectionDelete(Collection As String, colID A";
 //BA.debugLineNum = 240;BA.debugLine="Dim promDel As BANanoPromise = getCollection(Coll";
_promdel = new com.ab.banano.BANanoPromise();
_promdel = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_getcollection(_collection).RunMethod("doc",(Object)(new Object[]{(Object)(_colid)})).RunMethod("delete",__c.Null).getObject()));
 //BA.debugLineNum = 241;BA.debugLine="Return promDel";
if (true) return _promdel;
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _collectionget(String _collection,String _colid) throws Exception{
com.ab.banano.BANanoPromise _promget = null;
 //BA.debugLineNum = 260;BA.debugLine="Sub collectionGet(collection As String, colID As S";
 //BA.debugLineNum = 261;BA.debugLine="Dim promGet As BANanoPromise = getCollection(coll";
_promget = new com.ab.banano.BANanoPromise();
_promget = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_getcollection(_collection).RunMethod("doc",(Object)(new Object[]{(Object)(_colid)})).RunMethod("get",__c.Null).getObject()));
 //BA.debugLineNum = 262;BA.debugLine="Return promGet";
if (true) return _promget;
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _collectiongetall(String _collection,String _sorderby) throws Exception{
com.ab.banano.BANanoObject _botable = null;
com.ab.banano.BANanoPromise _promget = null;
 //BA.debugLineNum = 245;BA.debugLine="Sub collectionGetAll(collection As String, sOrderB";
 //BA.debugLineNum = 246;BA.debugLine="Dim boTable As BANanoObject = getCollection(colle";
_botable = new com.ab.banano.BANanoObject();
_botable = _getcollection(_collection);
 //BA.debugLineNum = 247;BA.debugLine="If sOrderBy <> \"\" Then";
if ((_sorderby).equals("") == false) { 
 //BA.debugLineNum = 248;BA.debugLine="If sOrderBy.IndexOf(\" \") = -1 Then";
if (_sorderby.indexOf(" ")==-1) { 
 //BA.debugLineNum = 249;BA.debugLine="boTable = boTable.RunMethod(\"orderBy\", Array(sO";
_botable = _botable.RunMethod("orderBy",(Object)(new Object[]{(Object)(_sorderby),(Object)("asc")}));
 }else {
 //BA.debugLineNum = 251;BA.debugLine="boTable = boTable.RunMethod(\"orderBy\", Array(sO";
_botable = _botable.RunMethod("orderBy",(Object)(new Object[]{(Object)(_sorderby),(Object)("desc")}));
 };
 };
 //BA.debugLineNum = 255;BA.debugLine="Dim promGet As BANanoPromise = boTable.RunMethod(";
_promget = new com.ab.banano.BANanoPromise();
_promget = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_botable.RunMethod("get",__c.Null).getObject()));
 //BA.debugLineNum = 256;BA.debugLine="Return promGet";
if (true) return _promget;
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _collectionupdate(String _collection,String _colid,anywheresoftware.b4a.objects.collections.Map _record) throws Exception{
com.ab.banano.BANanoPromise _promadd = null;
 //BA.debugLineNum = 231;BA.debugLine="Sub collectionUpdate(Collection As String, colID A";
 //BA.debugLineNum = 233;BA.debugLine="Dim promAdd As BANanoPromise = getCollection(Coll";
_promadd = new com.ab.banano.BANanoPromise();
_promadd = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_getcollection(_collection).RunMethod("doc",(Object)(new Object[]{(Object)(_colid)})).RunMethod("update",(Object)(new Object[]{(Object)(_record.getObject())})).getObject()));
 //BA.debugLineNum = 234;BA.debugLine="Return promAdd";
if (true) return _promadd;
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananofirestoredb  _connect() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub Connect() As BANanoFireStoreDB";
 //BA.debugLineNum = 72;BA.debugLine="firebaseConfig.put(\"apiKey\", apiKey)";
_firebaseconfig.Put((Object)("apiKey"),(Object)(_apikey));
 //BA.debugLineNum = 73;BA.debugLine="firebaseConfig.put(\"authDomain\", authDomain)";
_firebaseconfig.Put((Object)("authDomain"),(Object)(_authdomain));
 //BA.debugLineNum = 74;BA.debugLine="firebaseConfig.put(\"databaseURL\", databaseURL)";
_firebaseconfig.Put((Object)("databaseURL"),(Object)(_databaseurl));
 //BA.debugLineNum = 75;BA.debugLine="firebaseConfig.put(\"projectId\", projectId)";
_firebaseconfig.Put((Object)("projectId"),(Object)(_projectid));
 //BA.debugLineNum = 76;BA.debugLine="firebaseConfig.put(\"storageBucket\", storageBucket";
_firebaseconfig.Put((Object)("storageBucket"),(Object)(_storagebucket));
 //BA.debugLineNum = 77;BA.debugLine="firebaseConfig.put(\"messagingSenderId\", messaging";
_firebaseconfig.Put((Object)("messagingSenderId"),(Object)(_messagingsenderid));
 //BA.debugLineNum = 78;BA.debugLine="firebaseConfig.put(\"appId\", appId)";
_firebaseconfig.Put((Object)("appId"),(Object)(_appid));
 //BA.debugLineNum = 79;BA.debugLine="firebaseConfig.put(\"measurementId\", measurementId";
_firebaseconfig.Put((Object)("measurementId"),(Object)(_measurementid));
 //BA.debugLineNum = 81;BA.debugLine="firebaseApp = firebase.RunMethod(\"initializeApp\",";
_firebaseapp = _firebase.RunMethod("initializeApp",(Object)(_firebaseconfig.getObject()));
 //BA.debugLineNum = 83;BA.debugLine="firebase.RunMethod(\"analytics\", Null)";
_firebase.RunMethod("analytics",__c.Null);
 //BA.debugLineNum = 85;BA.debugLine="firestore = firebaseApp.RunMethod(\"firestore\", Nu";
_firestore = _firebaseapp.RunMethod("firestore",__c.Null);
 //BA.debugLineNum = 86;BA.debugLine="firestore.SetField(\"settings\", settings)";
_firestore.SetField("settings",(Object)(_settings.getObject()));
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.bananofirestoredb)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _createuserwithemailandpassword(String _emailaddress,String _password) throws Exception{
com.ab.banano.BANanoPromise _promregister = null;
 //BA.debugLineNum = 272;BA.debugLine="Sub createUserWithEmailAndPassword(emailaddress As";
 //BA.debugLineNum = 273;BA.debugLine="Dim promRegister As BANanoPromise = getAuth.RunMe";
_promregister = new com.ab.banano.BANanoPromise();
_promregister = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_getauth().RunMethod("createUserWithEmailAndPassword",(Object)(new Object[]{(Object)(_emailaddress),(Object)(_password)})).getObject()));
 //BA.debugLineNum = 274;BA.debugLine="Return promRegister";
if (true) return _promregister;
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _disablenetwork() throws Exception{
com.ab.banano.BANanoObject _booffline = null;
 //BA.debugLineNum = 180;BA.debugLine="Sub disableNetwork() As BANanoPromise";
 //BA.debugLineNum = 181;BA.debugLine="Dim boOffline As BANanoObject = firestore.RunMeth";
_booffline = new com.ab.banano.BANanoObject();
_booffline = _firestore.RunMethod("disableNetwork",__c.Null);
 //BA.debugLineNum = 182;BA.debugLine="Return boOffline";
if (true) return (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_booffline.getObject()));
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _docchanges(anywheresoftware.b4a.objects.collections.Map _snapshot) throws Exception{
com.ab.banano.BANanoObject _xdocchanges = null;
anywheresoftware.b4a.objects.collections.List _changes = null;
anywheresoftware.b4a.objects.collections.List _recs = null;
com.ab.banano.BANanoObject _recx = null;
String _stype = "";
com.ab.banano.BANanoObject _doc = null;
anywheresoftware.b4a.objects.collections.Map _rdata = null;
String _uid = "";
 //BA.debugLineNum = 325;BA.debugLine="Sub DocChanges(snapShot As Map) As List";
 //BA.debugLineNum = 326;BA.debugLine="Dim xDocChanges As BANanoObject = snapShot";
_xdocchanges = new com.ab.banano.BANanoObject();
_xdocchanges = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_snapshot.getObject()));
 //BA.debugLineNum = 327;BA.debugLine="Dim changes As List = xDocChanges.RunMethod(\"docC";
_changes = new anywheresoftware.b4a.objects.collections.List();
_changes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_xdocchanges.RunMethod("docChanges",__c.Null).Result()));
 //BA.debugLineNum = 328;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 329;BA.debugLine="recs.Initialize";
_recs.Initialize();
 //BA.debugLineNum = 330;BA.debugLine="For Each recx As BANanoObject In changes";
_recx = new com.ab.banano.BANanoObject();
{
final anywheresoftware.b4a.BA.IterableList group5 = _changes;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_recx = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(group5.Get(index5)));
 //BA.debugLineNum = 331;BA.debugLine="Dim stype As String = recx.GetField(\"type\").Resu";
_stype = BA.ObjectToString(_recx.GetField("type").Result());
 //BA.debugLineNum = 332;BA.debugLine="Dim doc As BANanoObject = recx.GetField(\"doc\")";
_doc = new com.ab.banano.BANanoObject();
_doc = _recx.GetField("doc");
 //BA.debugLineNum = 333;BA.debugLine="Dim rdata As Map = doc.RunMethod(\"data\", Null).R";
_rdata = new anywheresoftware.b4a.objects.collections.Map();
_rdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_doc.RunMethod("data",__c.Null).Result()));
 //BA.debugLineNum = 334;BA.debugLine="Dim uid As String = doc.Getfield(\"id\").Result";
_uid = BA.ObjectToString(_doc.GetField("id").Result());
 //BA.debugLineNum = 335;BA.debugLine="rdata.Put(\"changetype\", stype)";
_rdata.Put((Object)("changetype"),(Object)(_stype));
 //BA.debugLineNum = 336;BA.debugLine="rdata.Put(\"id\", uid)";
_rdata.Put((Object)("id"),(Object)(_uid));
 //BA.debugLineNum = 337;BA.debugLine="recs.Add(rdata)";
_recs.Add((Object)(_rdata.getObject()));
 }
};
 //BA.debugLineNum = 339;BA.debugLine="Return recs";
if (true) return _recs;
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananofirestoredb  _enableanalytics() throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub enableAnalytics() As BANanoFireStoreDB";
 //BA.debugLineNum = 156;BA.debugLine="analytics = firestore.RunMethod(\"analytics\", Null";
_analytics = _firestore.RunMethod("analytics",__c.Null);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.bananofirestoredb)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _enablenetwork() throws Exception{
com.ab.banano.BANanoObject _booffline = null;
 //BA.debugLineNum = 186;BA.debugLine="Sub enableNetwork() As BANanoPromise";
 //BA.debugLineNum = 187;BA.debugLine="Dim boOffline As BANanoObject = firestore.RunMeth";
_booffline = new com.ab.banano.BANanoObject();
_booffline = _firestore.RunMethod("enableNetwork",__c.Null);
 //BA.debugLineNum = 188;BA.debugLine="Return boOffline";
if (true) return (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_booffline.getObject()));
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananofirestoredb  _enableperformance() throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub enablePerformance() As BANanoFireStoreDB";
 //BA.debugLineNum = 168;BA.debugLine="performance = firestore.RunMethod(\"performance\",";
_performance = _firestore.RunMethod("performance",__c.Null);
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.bananofirestoredb)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _enablepersistence() throws Exception{
anywheresoftware.b4a.objects.collections.Map _synchronizetabs = null;
com.ab.banano.BANanoObject _booffline = null;
 //BA.debugLineNum = 173;BA.debugLine="Sub enablePersistence() As BANanoPromise";
 //BA.debugLineNum = 174;BA.debugLine="Dim synchronizeTabs As Map = CreateMap(\"synchroni";
_synchronizetabs = new anywheresoftware.b4a.objects.collections.Map();
_synchronizetabs = __c.createMap(new Object[] {(Object)("synchronizeTabs"),(Object)(__c.True)});
 //BA.debugLineNum = 175;BA.debugLine="Dim boOffline As BANanoObject = firestore.RunMeth";
_booffline = new com.ab.banano.BANanoObject();
_booffline = _firestore.RunMethod("enablePersistence",(Object)(new Object[]{(Object)(_synchronizetabs.getObject())}));
 //BA.debugLineNum = 176;BA.debugLine="Return boOffline";
if (true) return (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_booffline.getObject()));
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananofirestoredb  _enablestorage() throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub enableStorage() As BANanoFireStoreDB";
 //BA.debugLineNum = 162;BA.debugLine="storage = firestore.RunMethod(\"storage\", Null)";
_storage = _firestore.RunMethod("storage",__c.Null);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.bananofirestoredb)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananofirestoredb  _endat(Object _endvalue) throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub endAt(endValue As Object) As BANanoFireStoreDB";
 //BA.debugLineNum = 387;BA.debugLine="oendAt = endValue";
_oendat = _endvalue;
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.example.bananofirestoredb)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _execute() throws Exception{
com.ab.banano.BANanoObject _botable = null;
anywheresoftware.b4a.objects.collections.List _wc = null;
anywheresoftware.b4a.objects.collections.Map _wm = null;
String _fld = "";
String _oper = "";
Object _value = null;
String _fldo = "";
com.ab.banano.BANanoPromise _promexec = null;
 //BA.debugLineNum = 415;BA.debugLine="Sub execute As BANanoPromise";
 //BA.debugLineNum = 417;BA.debugLine="Dim boTable As BANanoObject = getCollection(fromC";
_botable = new com.ab.banano.BANanoObject();
_botable = _getcollection(_fromcollection);
 //BA.debugLineNum = 419;BA.debugLine="Dim wc As List = whereClauses";
_wc = new anywheresoftware.b4a.objects.collections.List();
_wc = _whereclauses;
 //BA.debugLineNum = 420;BA.debugLine="For Each wm As Map In wc";
_wm = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _wc;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_wm = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group3.Get(index3)));
 //BA.debugLineNum = 421;BA.debugLine="Dim fld As String = wm.Get(\"fld\")";
_fld = BA.ObjectToString(_wm.Get((Object)("fld")));
 //BA.debugLineNum = 422;BA.debugLine="Dim oper As String = wm.Get(\"oper\")";
_oper = BA.ObjectToString(_wm.Get((Object)("oper")));
 //BA.debugLineNum = 423;BA.debugLine="Dim value As Object = wm.Get(\"value\")";
_value = _wm.Get((Object)("value"));
 //BA.debugLineNum = 425;BA.debugLine="Select Case oper";
switch (BA.switchObjectToInt(_oper,"ne")) {
case 0: {
 //BA.debugLineNum = 428;BA.debugLine="boTable = boTable.RunMethod(\"where\", Array(fld,";
_botable = _botable.RunMethod("where",(Object)(new Object[]{(Object)(_fld),(Object)("<"),_value}));
 //BA.debugLineNum = 429;BA.debugLine="boTable = boTable.RunMethod(\"where\", Array(fld,";
_botable = _botable.RunMethod("where",(Object)(new Object[]{(Object)(_fld),(Object)(">"),_value}));
 break; }
default: {
 //BA.debugLineNum = 431;BA.debugLine="boTable = boTable.RunMethod(\"where\", Array(fld,";
_botable = _botable.RunMethod("where",(Object)(new Object[]{(Object)(_fld),(Object)(_oper),_value}));
 break; }
}
;
 }
};
 //BA.debugLineNum = 435;BA.debugLine="For Each fld As String In ordering.Keys";
{
final anywheresoftware.b4a.BA.IterableList group15 = _ordering.Keys();
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_fld = BA.ObjectToString(group15.Get(index15));
 //BA.debugLineNum = 436;BA.debugLine="Dim fldo As String = ordering.Get(fld)";
_fldo = BA.ObjectToString(_ordering.Get((Object)(_fld)));
 //BA.debugLineNum = 437;BA.debugLine="boTable = boTable.RunMethod(\"orderBy\", Array(fld";
_botable = _botable.RunMethod("orderBy",(Object)(new Object[]{(Object)(_fld),(Object)(_fldo)}));
 }
};
 //BA.debugLineNum = 440;BA.debugLine="limitSelectionTo = BANano.parseInt(limitSelection";
_limitselectionto = _banano.parseInt((Object)(_limitselectionto));
 //BA.debugLineNum = 441;BA.debugLine="If limitSelectionTo > 0 Then";
if (_limitselectionto>0) { 
 //BA.debugLineNum = 442;BA.debugLine="boTable.RunMethod(\"limit\", Array(limitSelectionT";
_botable.RunMethod("limit",(Object)(new Object[]{(Object)(_limitselectionto)}));
 };
 //BA.debugLineNum = 445;BA.debugLine="If BANano.IsNull(ostartAt) = False Then";
if (_banano.IsNull(_ostartat)==__c.False) { 
 //BA.debugLineNum = 446;BA.debugLine="boTable.RunMethod(\"startAt\", Array(ostartAt))";
_botable.RunMethod("startAt",(Object)(new Object[]{_ostartat}));
 };
 //BA.debugLineNum = 449;BA.debugLine="If BANano.IsNull(oendAt) = False Then";
if (_banano.IsNull(_oendat)==__c.False) { 
 //BA.debugLineNum = 450;BA.debugLine="boTable.RunMethod(\"endAt\", Array(oendAt))";
_botable.RunMethod("endAt",(Object)(new Object[]{_oendat}));
 };
 //BA.debugLineNum = 453;BA.debugLine="fromCollection = \"\"";
_fromcollection = "";
 //BA.debugLineNum = 454;BA.debugLine="whereClauses.Initialize";
_whereclauses.Initialize();
 //BA.debugLineNum = 455;BA.debugLine="ordering.Initialize";
_ordering.Initialize();
 //BA.debugLineNum = 456;BA.debugLine="limitSelectionTo = -1";
_limitselectionto = (int) (-1);
 //BA.debugLineNum = 457;BA.debugLine="ostartAt = Null";
_ostartat = __c.Null;
 //BA.debugLineNum = 458;BA.debugLine="oendAt = Null";
_oendat = __c.Null;
 //BA.debugLineNum = 459;BA.debugLine="Dim promExec As BANanoPromise = boTable.RunMethod";
_promexec = new com.ab.banano.BANanoPromise();
_promexec = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_botable.RunMethod("get",__c.Null).getObject()));
 //BA.debugLineNum = 460;BA.debugLine="Return promExec";
if (true) return _promexec;
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _fromjson(anywheresoftware.b4a.objects.collections.Map _response) throws Exception{
anywheresoftware.b4a.objects.collections.List _docs = null;
anywheresoftware.b4a.objects.collections.List _recs = null;
com.ab.banano.BANanoObject _userx = null;
String _uid = "";
anywheresoftware.b4a.objects.collections.Map _udata = null;
 //BA.debugLineNum = 310;BA.debugLine="Sub FromJSON(response As Map) As List";
 //BA.debugLineNum = 312;BA.debugLine="Dim docs As List = response.Get(\"docs\")";
_docs = new anywheresoftware.b4a.objects.collections.List();
_docs = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_response.Get((Object)("docs"))));
 //BA.debugLineNum = 313;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 314;BA.debugLine="recs.Initialize";
_recs.Initialize();
 //BA.debugLineNum = 315;BA.debugLine="For Each userx As BANanoObject In docs";
_userx = new com.ab.banano.BANanoObject();
{
final anywheresoftware.b4a.BA.IterableList group4 = _docs;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_userx = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(group4.Get(index4)));
 //BA.debugLineNum = 316;BA.debugLine="Dim uid As String = userx.Getfield(\"id\").Result";
_uid = BA.ObjectToString(_userx.GetField("id").Result());
 //BA.debugLineNum = 317;BA.debugLine="Dim udata As Map = userx.RunMethod(\"data\", Null)";
_udata = new anywheresoftware.b4a.objects.collections.Map();
_udata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_userx.RunMethod("data",__c.Null).Result()));
 //BA.debugLineNum = 318;BA.debugLine="udata.Put(\"id\", uid)";
_udata.Put((Object)("id"),(Object)(_uid));
 //BA.debugLineNum = 319;BA.debugLine="recs.Add(udata)";
_recs.Add((Object)(_udata.getObject()));
 }
};
 //BA.debugLineNum = 321;BA.debugLine="Return recs";
if (true) return _recs;
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public String  _getaccesstoken(anywheresoftware.b4a.objects.collections.Map _response) throws Exception{
com.ab.banano.BANanoObject _bo = null;
String _token = "";
 //BA.debugLineNum = 120;BA.debugLine="Sub getAccessToken(response As Map) As String";
 //BA.debugLineNum = 121;BA.debugLine="Dim bo As BANanoObject = response";
_bo = new com.ab.banano.BANanoObject();
_bo = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_response.getObject()));
 //BA.debugLineNum = 122;BA.debugLine="Dim token As String = bo.getfield(\"credential\").g";
_token = BA.ObjectToString(_bo.GetField("credential").GetField("accessToken").Result());
 //BA.debugLineNum = 123;BA.debugLine="Return token";
if (true) return _token;
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _getauth() throws Exception{
com.ab.banano.BANanoObject _boauth = null;
 //BA.debugLineNum = 192;BA.debugLine="private Sub getAuth() As BANanoObject";
 //BA.debugLineNum = 193;BA.debugLine="Dim boAuth As BANanoObject = firebaseApp.RunMetho";
_boauth = new com.ab.banano.BANanoObject();
_boauth = _firebaseapp.RunMethod("auth",__c.Null);
 //BA.debugLineNum = 194;BA.debugLine="Return boAuth";
if (true) return _boauth;
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public String  _getchangetype(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
String _ct = "";
 //BA.debugLineNum = 343;BA.debugLine="Sub getChangeType(item As Map) As String";
 //BA.debugLineNum = 344;BA.debugLine="Dim ct As String = item.Get(\"changetype\")";
_ct = BA.ObjectToString(_item.Get((Object)("changetype")));
 //BA.debugLineNum = 345;BA.debugLine="Return ct";
if (true) return _ct;
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _getcollection(String _colname) throws Exception{
com.ab.banano.BANanoObject _botable = null;
 //BA.debugLineNum = 217;BA.debugLine="private Sub getCollection(colName As String) As BA";
 //BA.debugLineNum = 218;BA.debugLine="Dim boTable As BANanoObject = firestore.RunMethod";
_botable = new com.ab.banano.BANanoObject();
_botable = _firestore.RunMethod("collection",(Object)(new Object[]{(Object)(_colname)}));
 //BA.debugLineNum = 219;BA.debugLine="Return boTable";
if (true) return _botable;
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _getcurrentuser() throws Exception{
com.ab.banano.BANanoPromise _bouser = null;
 //BA.debugLineNum = 199;BA.debugLine="Public Sub getCurrentUser() As BANanoPromise";
 //BA.debugLineNum = 200;BA.debugLine="Dim boUser As BANanoPromise = getAuth.RunMethod(\"";
_bouser = new com.ab.banano.BANanoPromise();
_bouser = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_getauth().RunMethod("currentUser",__c.Null).getObject()));
 //BA.debugLineNum = 201;BA.debugLine="Return boUser";
if (true) return _bouser;
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public String  _getdisplayname(anywheresoftware.b4a.objects.collections.Map _resp) throws Exception{
String _dn = "";
 //BA.debugLineNum = 211;BA.debugLine="public Sub getDisplayName(resp As Map) As String";
 //BA.debugLineNum = 212;BA.debugLine="Dim dn As String = resp.Get(\"displayName\")";
_dn = BA.ObjectToString(_resp.Get((Object)("displayName")));
 //BA.debugLineNum = 213;BA.debugLine="Return dn";
if (true) return _dn;
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return "";
}
public String  _getid(anywheresoftware.b4a.objects.collections.Map _response) throws Exception{
String _res = "";
 //BA.debugLineNum = 349;BA.debugLine="Sub getID(response As Map) As String";
 //BA.debugLineNum = 350;BA.debugLine="Dim res As String = response.Get(\"id\")";
_res = BA.ObjectToString(_response.Get((Object)("id")));
 //BA.debugLineNum = 351;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return "";
}
public String  _getmessage(anywheresoftware.b4a.objects.collections.Map _error) throws Exception{
String _res = "";
 //BA.debugLineNum = 355;BA.debugLine="Sub getMessage(error As Map) As String";
 //BA.debugLineNum = 356;BA.debugLine="Dim res As String = error.Get(\"message\")";
_res = BA.ObjectToString(_error.Get((Object)("message")));
 //BA.debugLineNum = 357;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getrecord(com.ab.banano.BANanoObject _response) throws Exception{
String _id = "";
anywheresoftware.b4a.objects.collections.Map _data = null;
 //BA.debugLineNum = 361;BA.debugLine="Sub getRecord(response As BANanoObject) As Map";
 //BA.debugLineNum = 362;BA.debugLine="Dim id As String = response.GetField(\"id\").Result";
_id = BA.ObjectToString(_response.GetField("id").Result());
 //BA.debugLineNum = 363;BA.debugLine="Dim data As Map = response.RunMethod(\"data\", Null";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_response.RunMethod("data",__c.Null).Result()));
 //BA.debugLineNum = 364;BA.debugLine="data.Put(\"id\", id)";
_data.Put((Object)("id"),(Object)(_id));
 //BA.debugLineNum = 365;BA.debugLine="Return data";
if (true) return _data;
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public String  _getuid(anywheresoftware.b4a.objects.collections.Map _userdata) throws Exception{
String _suid = "";
 //BA.debugLineNum = 492;BA.debugLine="Sub getUID(userData As Map) As String";
 //BA.debugLineNum = 493;BA.debugLine="Dim suid As String = userData.Get(\"uid\")";
_suid = BA.ObjectToString(_userdata.Get((Object)("uid")));
 //BA.debugLineNum = 494;BA.debugLine="Return suid";
if (true) return _suid;
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getuser(anywheresoftware.b4a.objects.collections.Map _resp) throws Exception{
anywheresoftware.b4a.objects.collections.Map _usr = null;
 //BA.debugLineNum = 205;BA.debugLine="public Sub getUser(resp As Map) As Map";
 //BA.debugLineNum = 206;BA.debugLine="Dim usr As Map = resp.Get(\"user\")";
_usr = new anywheresoftware.b4a.objects.collections.Map();
_usr = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_resp.Get((Object)("user"))));
 //BA.debugLineNum = 207;BA.debugLine="Return usr";
if (true) return _usr;
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getuserdata(anywheresoftware.b4a.objects.collections.Map _user) throws Exception{
anywheresoftware.b4a.objects.collections.Map _userdata = null;
String _displayname = "";
String _email = "";
boolean _emailverified = false;
String _photourl = "";
boolean _isanonymous = false;
String _uid = "";
String _phonenumber = "";
 //BA.debugLineNum = 470;BA.debugLine="Sub GetUserData(user As Map) As Map";
 //BA.debugLineNum = 471;BA.debugLine="Dim userData As Map = CreateMap()";
_userdata = new anywheresoftware.b4a.objects.collections.Map();
_userdata = __c.createMap(new Object[] {});
 //BA.debugLineNum = 472;BA.debugLine="If BANano.IsNull(user) Or BANano.IsUndefined(user";
if (_banano.IsNull((Object)(_user.getObject())) || _banano.IsUndefined((Object)(_user.getObject()))) { 
if (true) return _userdata;};
 //BA.debugLineNum = 473;BA.debugLine="Dim displayName As String = user.Get(\"displayName";
_displayname = BA.ObjectToString(_user.Get((Object)("displayName")));
 //BA.debugLineNum = 474;BA.debugLine="Dim email As String = user.Get(\"email\")";
_email = BA.ObjectToString(_user.Get((Object)("email")));
 //BA.debugLineNum = 475;BA.debugLine="Dim emailVerified As Boolean = user.Get(\"emailVer";
_emailverified = BA.ObjectToBoolean(_user.Get((Object)("emailVerified")));
 //BA.debugLineNum = 476;BA.debugLine="Dim photoURL As String = user.Get(\"photoURL\")";
_photourl = BA.ObjectToString(_user.Get((Object)("photoURL")));
 //BA.debugLineNum = 477;BA.debugLine="Dim isAnonymous As Boolean = user.Get(\"isAnonymou";
_isanonymous = BA.ObjectToBoolean(_user.Get((Object)("isAnonymous")));
 //BA.debugLineNum = 478;BA.debugLine="Dim uid As String = user.Get(\"uid\")";
_uid = BA.ObjectToString(_user.Get((Object)("uid")));
 //BA.debugLineNum = 479;BA.debugLine="Dim phoneNumber As String = user.Get(\"phoneNumber";
_phonenumber = BA.ObjectToString(_user.Get((Object)("phoneNumber")));
 //BA.debugLineNum = 481;BA.debugLine="userData.Put(\"displayName\", displayName)";
_userdata.Put((Object)("displayName"),(Object)(_displayname));
 //BA.debugLineNum = 482;BA.debugLine="userData.Put(\"email\", email)";
_userdata.Put((Object)("email"),(Object)(_email));
 //BA.debugLineNum = 483;BA.debugLine="userData.Put(\"emailVerified\", emailVerified)";
_userdata.Put((Object)("emailVerified"),(Object)(_emailverified));
 //BA.debugLineNum = 484;BA.debugLine="userData.Put(\"photoURL\", photoURL)";
_userdata.Put((Object)("photoURL"),(Object)(_photourl));
 //BA.debugLineNum = 485;BA.debugLine="userData.Put(\"isAnonymous\", isAnonymous)";
_userdata.Put((Object)("isAnonymous"),(Object)(_isanonymous));
 //BA.debugLineNum = 486;BA.debugLine="userData.Put(\"uid\", uid)";
_userdata.Put((Object)("uid"),(Object)(_uid));
 //BA.debugLineNum = 487;BA.debugLine="userData.Put(\"phoneNumber\", phoneNumber)";
_userdata.Put((Object)("phoneNumber"),(Object)(_phonenumber));
 //BA.debugLineNum = 488;BA.debugLine="Return userData";
if (true) return _userdata;
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananofirestoredb  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 55;BA.debugLine="Public Sub Initialize() As BANanoFireStoreDB";
 //BA.debugLineNum = 56;BA.debugLine="firebaseConfig.Initialize";
_firebaseconfig.Initialize();
 //BA.debugLineNum = 57;BA.debugLine="apiKey = \"\"";
_apikey = "";
 //BA.debugLineNum = 58;BA.debugLine="authDomain = \"\"";
_authdomain = "";
 //BA.debugLineNum = 59;BA.debugLine="databaseURL = \"\"";
_databaseurl = "";
 //BA.debugLineNum = 60;BA.debugLine="projectId = \"\"";
_projectid = "";
 //BA.debugLineNum = 61;BA.debugLine="storageBucket = \"\"";
_storagebucket = "";
 //BA.debugLineNum = 62;BA.debugLine="messagingSenderId = \"\"";
_messagingsenderid = "";
 //BA.debugLineNum = 63;BA.debugLine="appId = \"\"";
_appid = "";
 //BA.debugLineNum = 64;BA.debugLine="measurementId = \"\"";
_measurementid = "";
 //BA.debugLineNum = 65;BA.debugLine="firebase.Initialize(\"firebase\")";
_firebase.Initialize((Object)("firebase"));
 //BA.debugLineNum = 66;BA.debugLine="settings.Initialize";
_settings.Initialize();
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.bananofirestoredb)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananofirestoredb  _limitto(int _lt) throws Exception{
 //BA.debugLineNum = 464;BA.debugLine="Sub LimitTo(lt As Int) As BANanoFireStoreDB";
 //BA.debugLineNum = 465;BA.debugLine="limitSelectionTo = lt";
_limitselectionto = _lt;
 //BA.debugLineNum = 466;BA.debugLine="Return Me";
if (true) return (b4j.example.bananofirestoredb)(this);
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return null;
}
public String  _onauthstatechanged(Object _module,String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _user = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 141;BA.debugLine="Sub onAuthStateChanged(Module As Object, methodNam";
 //BA.debugLineNum = 142;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 143;BA.debugLine="Dim user As Map";
_user = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 144;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_user.getObject())}))));
 //BA.debugLineNum = 145;BA.debugLine="getAuth.RunMethod(\"onAuthStateChanged\", cb)";
_getauth().RunMethod("onAuthStateChanged",(Object)(_cb.getObject()));
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _onsnapshot(String _collection,Object _module,String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _doc = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 133;BA.debugLine="Sub onSnapshot(Collection As String, Module As Obj";
 //BA.debugLineNum = 134;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 135;BA.debugLine="Dim doc As Map";
_doc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 136;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_doc.getObject())}))));
 //BA.debugLineNum = 137;BA.debugLine="getCollection(Collection).RunMethod(\"onSnapshot\",";
_getcollection(_collection).RunMethod("onSnapshot",(Object)(_cb.getObject()));
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananofirestoredb  _orderby(String _fld) throws Exception{
 //BA.debugLineNum = 393;BA.debugLine="Sub orderBy(fld As String) As BANanoFireStoreDB";
 //BA.debugLineNum = 394;BA.debugLine="ordering.Put(fld, FB_ASC)";
_ordering.Put((Object)(_fld),(Object)(_fb_asc));
 //BA.debugLineNum = 395;BA.debugLine="Return Me";
if (true) return (b4j.example.bananofirestoredb)(this);
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananofirestoredb  _orderby1(String _fld,String _ordertype) throws Exception{
 //BA.debugLineNum = 399;BA.debugLine="Sub orderBy1(fld As String, ordertype As String) A";
 //BA.debugLineNum = 400;BA.debugLine="ordering.Put(fld, ordertype)";
_ordering.Put((Object)(_fld),(Object)(_ordertype));
 //BA.debugLineNum = 401;BA.debugLine="Return Me";
if (true) return (b4j.example.bananofirestoredb)(this);
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _readuser(String _uid) throws Exception{
com.ab.banano.BANanoPromise _promget = null;
 //BA.debugLineNum = 266;BA.debugLine="Sub readUser(uid As String) As BANanoPromise";
 //BA.debugLineNum = 267;BA.debugLine="Dim promGet As BANanoPromise = getCollection(\"use";
_promget = new com.ab.banano.BANanoPromise();
_promget = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_getcollection("users").RunMethod("doc",(Object)(new Object[]{(Object)(_uid)})).RunMethod("get",__c.Null).getObject()));
 //BA.debugLineNum = 268;BA.debugLine="Return promGet";
if (true) return _promget;
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananofirestoredb  _selectfrom(String _collectionfrom) throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Sub selectFrom(collectionFrom As String) As BANano";
 //BA.debugLineNum = 370;BA.debugLine="fromCollection = collectionFrom";
_fromcollection = _collectionfrom;
 //BA.debugLineNum = 371;BA.debugLine="whereClauses.Initialize";
_whereclauses.Initialize();
 //BA.debugLineNum = 372;BA.debugLine="ordering.Initialize";
_ordering.Initialize();
 //BA.debugLineNum = 373;BA.debugLine="limitSelectionTo = -1";
_limitselectionto = (int) (-1);
 //BA.debugLineNum = 374;BA.debugLine="ostartAt = Null";
_ostartat = __c.Null;
 //BA.debugLineNum = 375;BA.debugLine="oendAt = Null";
_oendat = __c.Null;
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.example.bananofirestoredb)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _sendemailverification() throws Exception{
com.ab.banano.BANanoPromise _promregister = null;
 //BA.debugLineNum = 297;BA.debugLine="Sub sendEmailVerification As BANanoPromise";
 //BA.debugLineNum = 298;BA.debugLine="Dim promRegister As BANanoPromise = getAuth.GetFi";
_promregister = new com.ab.banano.BANanoPromise();
_promregister = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_getauth().GetField("user").RunMethod("sendEmailVerification",__c.Null).getObject()));
 //BA.debugLineNum = 299;BA.debugLine="Return promRegister";
if (true) return _promregister;
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _sendpasswordresetemail(String _email) throws Exception{
com.ab.banano.BANanoPromise _promregister = null;
 //BA.debugLineNum = 291;BA.debugLine="Sub sendPasswordResetEmail(email As String) As BAN";
 //BA.debugLineNum = 292;BA.debugLine="Dim promRegister As BANanoPromise = getAuth.RunMe";
_promregister = new com.ab.banano.BANanoPromise();
_promregister = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_getauth().RunMethod("sendPasswordResetEmail",(Object)(new Object[]{(Object)(_email)})).getObject()));
 //BA.debugLineNum = 293;BA.debugLine="Return promRegister";
if (true) return _promregister;
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _signinanonymously() throws Exception{
com.ab.banano.BANanoPromise _si = null;
 //BA.debugLineNum = 127;BA.debugLine="Sub signInAnonymously() As BANanoPromise";
 //BA.debugLineNum = 128;BA.debugLine="Dim si As BANanoPromise = getAuth.RunMethod(\"sign";
_si = new com.ab.banano.BANanoPromise();
_si = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_getauth().RunMethod("signInAnonymously",__c.Null).getObject()));
 //BA.debugLineNum = 129;BA.debugLine="Return si";
if (true) return _si;
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _signinwithemailandpassword(String _emailaddress,String _password) throws Exception{
com.ab.banano.BANanoPromise _promregister = null;
 //BA.debugLineNum = 279;BA.debugLine="Sub signInWithEmailAndPassword(emailaddress As Str";
 //BA.debugLineNum = 280;BA.debugLine="Dim promRegister As BANanoPromise = getAuth.RunMe";
_promregister = new com.ab.banano.BANanoPromise();
_promregister = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_getauth().RunMethod("signInWithEmailAndPassword",(Object)(new Object[]{(Object)(_emailaddress),(Object)(_password)})).getObject()));
 //BA.debugLineNum = 281;BA.debugLine="Return promRegister";
if (true) return _promregister;
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _signinwithpopupfacebook() throws Exception{
com.ab.banano.BANanoPromise _si = null;
 //BA.debugLineNum = 99;BA.debugLine="Sub signInWithPopupFacebook() As BANanoPromise";
 //BA.debugLineNum = 100;BA.debugLine="FacebookAuthProvider.Initialize2(\"firebase.auth.F";
_facebookauthprovider.Initialize2("firebase.auth.FacebookAuthProvider",__c.Null);
 //BA.debugLineNum = 101;BA.debugLine="Dim si As BANanoPromise = getAuth.RunMethod(\"sign";
_si = new com.ab.banano.BANanoPromise();
_si = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_getauth().RunMethod("signInWithPopup",(Object)(new Object[]{(Object)(_facebookauthprovider.getObject())})).getObject()));
 //BA.debugLineNum = 102;BA.debugLine="Return si";
if (true) return _si;
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _signinwithpopupgithub() throws Exception{
com.ab.banano.BANanoPromise _si = null;
 //BA.debugLineNum = 113;BA.debugLine="Sub signInWithPopupGithub() As BANanoPromise";
 //BA.debugLineNum = 114;BA.debugLine="GithubAuthProvider.Initialize2(\"firebase.auth.Git";
_githubauthprovider.Initialize2("firebase.auth.GithubAuthProvider",__c.Null);
 //BA.debugLineNum = 115;BA.debugLine="Dim si As BANanoPromise = getAuth.RunMethod(\"sign";
_si = new com.ab.banano.BANanoPromise();
_si = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_getauth().RunMethod("signInWithPopup",(Object)(new Object[]{(Object)(_githubauthprovider.getObject())})).getObject()));
 //BA.debugLineNum = 116;BA.debugLine="Return si";
if (true) return _si;
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _signinwithpopupgoogle() throws Exception{
com.ab.banano.BANanoPromise _si = null;
 //BA.debugLineNum = 91;BA.debugLine="Sub signInWithPopupGoogle() As BANanoPromise";
 //BA.debugLineNum = 92;BA.debugLine="GoogleAuthProvider.Initialize2(\"firebase.auth.Goo";
_googleauthprovider.Initialize2("firebase.auth.GoogleAuthProvider",__c.Null);
 //BA.debugLineNum = 93;BA.debugLine="GoogleAuthProvider.RunMethod(\"addScope\", Array(\"h";
_googleauthprovider.RunMethod("addScope",(Object)(new Object[]{(Object)("https://www.googleapis.com/auth/contacts.readonly")}));
 //BA.debugLineNum = 94;BA.debugLine="Dim si As BANanoPromise = getAuth.RunMethod(\"sign";
_si = new com.ab.banano.BANanoPromise();
_si = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_getauth().RunMethod("signInWithPopup",(Object)(new Object[]{(Object)(_googleauthprovider.getObject())})).getObject()));
 //BA.debugLineNum = 95;BA.debugLine="Return si";
if (true) return _si;
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _signinwithpopuptwitter() throws Exception{
com.ab.banano.BANanoPromise _si = null;
 //BA.debugLineNum = 106;BA.debugLine="Sub signInWithPopupTwitter() As BANanoPromise";
 //BA.debugLineNum = 107;BA.debugLine="TwitterAuthProvider.Initialize2(\"firebase.auth.Tw";
_twitterauthprovider.Initialize2("firebase.auth.TwitterAuthProvider",__c.Null);
 //BA.debugLineNum = 108;BA.debugLine="Dim si As BANanoPromise = getAuth.RunMethod(\"sign";
_si = new com.ab.banano.BANanoPromise();
_si = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_getauth().RunMethod("signInWithPopup",(Object)(new Object[]{(Object)(_twitterauthprovider.getObject())})).getObject()));
 //BA.debugLineNum = 109;BA.debugLine="Return si";
if (true) return _si;
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _signout() throws Exception{
com.ab.banano.BANanoPromise _promregister = null;
 //BA.debugLineNum = 285;BA.debugLine="Sub signOut() As BANanoPromise";
 //BA.debugLineNum = 286;BA.debugLine="Dim promRegister As BANanoPromise = getAuth.RunMe";
_promregister = new com.ab.banano.BANanoPromise();
_promregister = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_getauth().RunMethod("signOut",__c.Null).getObject()));
 //BA.debugLineNum = 287;BA.debugLine="Return promRegister";
if (true) return _promregister;
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananofirestoredb  _startat(Object _startvalue) throws Exception{
 //BA.debugLineNum = 380;BA.debugLine="Sub startAt(startValue As Object) As BANanoFireSto";
 //BA.debugLineNum = 381;BA.debugLine="ostartAt = startValue";
_ostartat = _startvalue;
 //BA.debugLineNum = 382;BA.debugLine="Return Me";
if (true) return (b4j.example.bananofirestoredb)(this);
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananofirestoredb  _timestampsinsnapshots() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub timestampsInSnapshots As BANanoFireStoreDB";
 //BA.debugLineNum = 150;BA.debugLine="settings.Put(\"timestampsInSnapshots\", True)";
_settings.Put((Object)("timestampsInSnapshots"),(Object)(__c.True));
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.bananofirestoredb)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoPromise  _updatedisplayname(com.ab.banano.BANanoObject _res,String _displayname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
com.ab.banano.BANanoPromise _promupdate = null;
 //BA.debugLineNum = 303;BA.debugLine="Sub updateDisplayName(res As BANanoObject, display";
 //BA.debugLineNum = 304;BA.debugLine="Dim rec As Map = CreateMap(\"displayName\": display";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = __c.createMap(new Object[] {(Object)("displayName"),(Object)(_displayname)});
 //BA.debugLineNum = 305;BA.debugLine="Dim promUpdate As BANanoPromise = res.getfield(\"u";
_promupdate = new com.ab.banano.BANanoPromise();
_promupdate = (com.ab.banano.BANanoPromise) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoPromise(), (java.lang.Object)(_res.GetField("user").RunMethod("updateProfile",(Object)(new Object[]{(Object)(_rec.getObject())})).getObject()));
 //BA.debugLineNum = 306;BA.debugLine="Return promUpdate";
if (true) return _promupdate;
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananofirestoredb  _wherecondition(String _fieldname,String _fieldoperation,Object _fieldvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _wherem = null;
 //BA.debugLineNum = 405;BA.debugLine="Sub whereCondition(fieldName As String, fieldOpera";
 //BA.debugLineNum = 406;BA.debugLine="Dim wherem As Map = CreateMap()";
_wherem = new anywheresoftware.b4a.objects.collections.Map();
_wherem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 407;BA.debugLine="wherem.Put(\"fld\", fieldName)";
_wherem.Put((Object)("fld"),(Object)(_fieldname));
 //BA.debugLineNum = 408;BA.debugLine="wherem.Put(\"oper\", fieldOperation)";
_wherem.Put((Object)("oper"),(Object)(_fieldoperation));
 //BA.debugLineNum = 409;BA.debugLine="wherem.Put(\"value\", fieldValue)";
_wherem.Put((Object)("value"),_fieldvalue);
 //BA.debugLineNum = 410;BA.debugLine="whereClauses.Add(wherem)";
_whereclauses.Add((Object)(_wherem.getObject()));
 //BA.debugLineNum = 411;BA.debugLine="Return Me";
if (true) return (b4j.example.bananofirestoredb)(this);
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
