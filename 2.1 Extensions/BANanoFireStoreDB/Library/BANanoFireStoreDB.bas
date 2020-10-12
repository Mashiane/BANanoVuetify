B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	Private firebaseConfig As Map
	Public apiKey As String
	Public authDomain As String
	Public databaseURL As String
	Public projectId As String
	Public storageBucket As String
	Public messagingSenderId As String
	Public appId As String
	Public measurementId As String
	Private BANano As BANano  'ignore
	Public firebase As BANanoObject
	Public firebaseApp As BANanoObject
	Public firestore As BANanoObject
	
	'
	Private fromCollection As String
	Private whereClauses As List
	'
	Public const FB_EQ As String = "=="
	Public const FB_GT As String = ">"
	Public const FB_GE As String = ">="
	Public const FB_LT As String = "<"
	Public const FB_LE As String = "<="
	Public const FB_IN As String = "in"
	Public const FB_CONTAINS_ANY As String = "array-contains-any"
	Public const FB_CONTAINS As String = "array-contains"
	Public const FB_NE As String = "ne"
	Public const FB_ASC As String = "asc"
	Public const FB_DESC As String = "desc"
	'
	Public const FB_ADDED As String = "added"
	Public const FB_MODIFIED As String = "modified"
	Public const FB_REMOVED As String = "removed"
	'
	Private ordering As Map
	Private limitSelectionTo As Int
	Private ostartAt As Object
	Private oendAt As Object
	'
	Public storage As BANanoObject
	Public database As BANanoObject
	Public performance As BANanoObject
	Public analytics As BANanoObject
	Public messaging As BANanoObject
	Private settings As Map
	Private GoogleAuthProvider As BANanoObject
	Private FacebookAuthProvider As BANanoObject
	Private TwitterAuthProvider As BANanoObject
	Private GithubAuthProvider As BANanoObject
End Sub

'Notes: https://firebase.google.com/docs/firestore/quickstart
'NOTES: update permissions here, https://firebase.google.com/docs/firestore/security/get-started#auth-required
'NOTES on queries, https://firebase.google.com/docs/firestore/query-data/queries

'initialize the bv class
Public Sub Initialize() As BANanoFireStoreDB
	firebaseConfig.Initialize
	apiKey = ""
	authDomain = ""
	databaseURL = ""
	projectId = ""
	storageBucket = ""
	messagingSenderId = ""
	appId = ""
	measurementId = ""
	firebase.Initialize("firebase")
	settings.Initialize 
	Return Me
End Sub

'build up the config connection string
Sub Connect() As BANanoFireStoreDB
	firebaseConfig.put("apiKey", apiKey)
	firebaseConfig.put("authDomain", authDomain)
	firebaseConfig.put("databaseURL", databaseURL)
	firebaseConfig.put("projectId", projectId)
	firebaseConfig.put("storageBucket", storageBucket)
	firebaseConfig.put("messagingSenderId", messagingSenderId)
	firebaseConfig.put("appId", appId)
	firebaseConfig.put("measurementId", measurementId)
	'initialize the app
	firebaseApp = firebase.RunMethod("initializeApp", firebaseConfig)
	'start analytics
	analytics = firebase.RunMethod("analytics", Null)
	database = firebase.RunMethod("database", Null)
	storage = firebase.RunMethod("storage", Null)
	performance = firebase.RunMethod("performance", Null)
	messaging = firebase.RunMethod("messaging", Null)
	'get the db
	firestore = firebaseApp.RunMethod("firestore", Null)
	firestore.SetField("settings", settings)
	Return Me
End Sub

'sign with google popup
Sub signInWithPopupGoogle() As BANanoPromise
	GoogleAuthProvider.Initialize2("firebase.auth.GoogleAuthProvider", Null)
	GoogleAuthProvider.RunMethod("addScope", Array("https://www.googleapis.com/auth/contacts.readonly"))
	Dim si As BANanoPromise = getAuth.RunMethod("signInWithPopup", Array(GoogleAuthProvider))
	Return si
End Sub

'sign with facebook popup
Sub signInWithPopupFacebook() As BANanoPromise
	FacebookAuthProvider.Initialize2("firebase.auth.FacebookAuthProvider", Null)
	Dim si As BANanoPromise = getAuth.RunMethod("signInWithPopup", Array(FacebookAuthProvider))
	Return si
End Sub

'sign with twitter popup
Sub signInWithPopupTwitter() As BANanoPromise
	TwitterAuthProvider.Initialize2("firebase.auth.TwitterAuthProvider", Null)
	Dim si As BANanoPromise = getAuth.RunMethod("signInWithPopup", Array(TwitterAuthProvider))
	Return si
End Sub

'sign with github popup
Sub signInWithPopupGithub() As BANanoPromise
	GithubAuthProvider.Initialize2("firebase.auth.GithubAuthProvider", Null)
	Dim si As BANanoPromise = getAuth.RunMethod("signInWithPopup", Array(GithubAuthProvider))
	Return si
End Sub

'get access token when login from google
Sub getAccessToken(response As Map) As String
	Dim bo As BANanoObject = response
	Dim token As String = bo.getfield("credential").getfield("accessToken").Result
	Return token
End Sub

'a user can sign in anonymously
Sub signInAnonymously() As BANanoPromise
	Dim si As BANanoPromise = getAuth.RunMethod("signInAnonymously", Null)
	Return si
End Sub

'detect changes when made
Sub onSnapshot(Collection As String, Module As Object, methodName As String)
	methodName = methodName.ToLowerCase
	Dim doc As Map
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(doc))
	getCollection(Collection).RunMethod("onSnapshot", cb)
End Sub

'set snapshots
Sub SetOnSnapShot(bo As BANanoObject, Module As Object, methodName As String)
	methodName = methodName.ToLowerCase
	Dim doc As Map
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(doc))
	bo.RunMethod("onSnapshot", cb)
End Sub

'detect user log in and log off pass the user variable
Sub onAuthStateChanged(Module As Object, methodName As String)
	methodName = methodName.ToLowerCase
	Dim user As Map
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(user))
	getAuth.RunMethod("onAuthStateChanged", cb)
End Sub

'timestampsInSnapshots
Sub timestampsInSnapshots As BANanoFireStoreDB
	settings.Put("timestampsInSnapshots", True)
	Return Me
End Sub


'enable persistence
Sub enablePersistence() As BANanoPromise
	Dim synchronizeTabs As Map = CreateMap("synchronizeTabs":True)
	Dim boOffline As BANanoObject = firestore.RunMethod("enablePersistence", Array(synchronizeTabs))
	Return boOffline
End Sub

'disableNetwork
Sub disableNetwork() As BANanoPromise
	Dim boOffline As BANanoObject = firestore.RunMethod("disableNetwork", Null)
	Return boOffline
End Sub

'enableNetwork
Sub enableNetwork() As BANanoPromise
	Dim boOffline As BANanoObject = firestore.RunMethod("enableNetwork", Null)
	Return boOffline
End Sub

'get the auth object
public Sub getAuth() As BANanoObject
	Dim boAuth As BANanoObject = firebaseApp.RunMethod("auth", Null)
	Return boAuth
End Sub


'get logged in user
Public Sub getCurrentUser() As Map
	Dim boUser As Object = getAuth.GetField("currentUser").Result
	If BANano.IsNull(boUser) Or BANano.IsUndefined(boUser) Then Return Null
	Dim usr As Map = GetUserData(boUser)
	Return usr
End Sub

'get a user
public Sub getUser(resp As Map) As Map
	Dim usr As Map = resp.Get("user")
	Return usr
End Sub

'get the display name of a user
public Sub getDisplayName(resp As Map) As String
	Dim dn As String = resp.Get("displayName")
	Return dn
End Sub

'get a collection
Sub getCollection(colName As String) As BANanoObject
	Dim boTable As BANanoObject = firestore.RunMethod("collection", Array(colName))
	Return boTable
End Sub

'add a record
Sub collectionAdd(Collection As String, record As Map) As BANanoPromise
	'execute the addition
	Dim promAdd As BANanoPromise = getCollection(Collection).RunMethod("add", Array(record))
	Return promAdd
End Sub

'update a record using a primary autoincrement id
'dont pass the id as part of the record map
Sub collectionUpdate(Collection As String, colID As String, record As Map) As BANanoPromise
	'execute the update
	Dim promAdd As BANanoPromise = getCollection(Collection).RunMethod("doc", Array(colID)).RunMethod("update", Array(record))
	Return promAdd
End Sub

'update a single record
Sub collectionUpdateRecord(rec As BANanoObject, record As Map) As BANanoPromise
	Dim promAdd As BANanoPromise = rec.RunMethod("update", Array(record))
	Return promAdd
End Sub

'delete a record using a primary autoincrement id
Sub collectionDelete(Collection As String, colID As String) As BANanoPromise
	'execute the update
	Dim promDel As BANanoPromise = getCollection(Collection).RunMethod("doc", Array(colID)).RunMethod("delete", Null)
	Return promDel
End Sub

'get all records
Sub collectionGetAll(Collection As String, sOrderBy As String) As BANanoPromise
	Dim boTable As BANanoObject = getCollection(Collection)
	If sOrderBy <> "" Then
		If sOrderBy.IndexOf(" ") = -1 Then
			boTable = boTable.RunMethod("orderBy", Array(sOrderBy, "asc"))
		Else
			boTable = boTable.RunMethod("orderBy", Array(sOrderBy, "desc"))
		End If
	End If
	'execute the addition
	Dim promGet As BANanoPromise = boTable.RunMethod("get", Null)
	Return promGet
End Sub

'set orderby on bananoobject
Sub SetOrderBy(bo As BANanoObject, fld As String, orderType As String) As BANanoObject
	bo = bo.RunMethod("orderBy", Array(fld, orderType))
	Return bo
End Sub

'set limit
Sub SetLimit(bo As BANanoObject, iLimit As Int) As BANanoObject
	bo = bo.RunMethod("limit", Array(iLimit))
	Return bo
End Sub	

'set startat
Sub SetStartAt(bo As BANanoObject, iLimit As Int) As BANanoObject
	bo = bo.RunMethod("startAt", Array(iLimit))
	Return bo
End Sub	

'set end at
Sub SetEndAt(bo As BANanoObject, iLimit As Int) As BANanoObject
	bo = bo.RunMethod("endAt", Array(iLimit))
	Return bo
End Sub	

'get a record
Sub collectionGet(collection As String, colID As String) As BANanoPromise
	Dim promGet As BANanoPromise = getCollection(collection).RunMethod("doc", Array(colID)).RunMethod("get", Null)
	Return promGet
End Sub

'get a user record by user id
Sub readUser(uid As String) As BANanoPromise
	Dim promGet As BANanoPromise = getCollection("users").RunMethod("doc", Array(uid)).RunMethod("get", Null)
	Return promGet
End Sub

'register a user
Sub createUserWithEmailAndPassword(emailaddress As String, password As String) As BANanoPromise
	Dim promRegister As BANanoPromise = getAuth.RunMethod("createUserWithEmailAndPassword", Array(emailaddress, password))
	Return promRegister
End Sub


'sign in
Sub signInWithEmailAndPassword(emailaddress As String, password As String) As BANanoPromise
	Dim promRegister As BANanoPromise = getAuth.RunMethod("signInWithEmailAndPassword", Array(emailaddress, password))
	Return promRegister
End Sub

'signOut
Sub signOut() As BANanoPromise
	Dim promRegister As BANanoPromise = getAuth.RunMethod("signOut", Null)
	Return promRegister
End Sub

'sendPasswordResetEmail
Sub sendPasswordResetEmail(email As String) As BANanoPromise
	Dim promRegister As BANanoPromise = getAuth.RunMethod("sendPasswordResetEmail", Array(email))
	Return promRegister
End Sub

'sendEmailVerification
Sub sendEmailVerification As BANanoPromise
	Dim promRegister As BANanoPromise = getAuth.GetField("user").RunMethod("sendEmailVerification", Null)
	Return promRegister
End Sub

'update display name
Sub updateDisplayName(res As BANanoObject, displayName As String) As BANanoPromise
	Dim rec As Map = CreateMap("displayName": displayName)
	Dim promUpdate As BANanoPromise = res.getfield("user").RunMethod("updateProfile", Array(rec))
	Return promUpdate
End Sub

'convert docs to list
Sub FromJSON(response As Map) As List
	'get the returned docs
	Dim docs As List = response.Get("docs")
	Dim recs As List
	recs.Initialize
	For Each userx As BANanoObject In docs
		Dim uid As String = userx.Getfield("id").Result
		Dim udata As Map = userx.RunMethod("data", Null).Result
		udata.Put("id", uid)
		recs.Add(udata)
	Next
	Return recs
End Sub

'get the changes that have been made for added, modified, removed
Sub docChanges(snapShot As Map) As List
	Dim xDocChanges As BANanoObject = snapShot
	Dim changes As List = xDocChanges.RunMethod("docChanges",Null).Result
	Dim recs As List
	recs.Initialize
	For Each recx As BANanoObject In changes
		Dim stype As String = recx.GetField("type").Result
		Dim doc As BANanoObject = recx.GetField("doc")
		Dim rdata As Map = doc.RunMethod("data", Null).Result
		Dim uid As String = doc.Getfield("id").Result
		rdata.Put("changetype", stype)
		rdata.Put("id", uid)
		recs.Add(rdata)
	Next
	Return recs
End Sub

'set on each doc change
Sub SetOnDocChanges(snapShot As Map, Module As Object, methodName As String)
	methodName = methodName.ToLowerCase
	Dim xDocChanges As BANanoObject = snapShot
	Dim changes As List = xDocChanges.RunMethod("docChanges",Null).Result
	For Each recx As BANanoObject In changes
		Dim stype As String = recx.GetField("type").Result
		Dim doc As BANanoObject = recx.GetField("doc")
		Dim rdata As Map = doc.RunMethod("data", Null).Result
		Dim uid As String = doc.Getfield("id").Result
		rdata.Put("changetype", stype)
		rdata.Put("id", uid)
		BANano.CallSub(Module, methodName, Array(rdata))
	Next
End Sub

Sub IsRemoved(m As Map) As Boolean
	Dim ct As String = getChangeType(m)
	If ct = "removed" Then Return True
	Return False
End Sub

Sub IsAdded(m As Map) As Boolean
	Dim ct As String = getChangeType(m)
	If ct = "added" Then Return True
	Return False
End Sub

Sub IsModified(m As Map) As Boolean
	Dim ct As String = getChangeType(m)
	If ct = "modified" Then Return True
	Return False
End Sub

'get the change type
Sub getChangeType(item As Map) As String
	Dim ct As String = item.Get("changetype")
	Return ct
End Sub

'get the id from a response
Sub getID(response As Map) As String
	Dim res As String = response.Get("id")
	Return res
End Sub

'get the message from error
Sub getMessage(error As Map) As String
	Dim res As String = error.Get("message")
	Return res
End Sub

'get the complete record including the id
Sub getRecord(response As BANanoObject) As Map
	Dim id As String = response.GetField("id").Result
	Dim data As Map = response.RunMethod("data", Null).Result
	data.Put("id", id)
	Return data
End Sub

'create a select where
Sub selectFrom(collectionFrom As String) As BANanoFireStoreDB
	fromCollection = collectionFrom
	whereClauses.Initialize
	ordering.Initialize 
	limitSelectionTo = -1
	ostartAt = Null
	oendAt = Null
	Return Me  
End Sub

'specify start at
Sub startAt(startValue As Object) As BANanoFireStoreDB
	ostartAt = startValue
	Return Me
End Sub

'specify end at
Sub endAt(endValue As Object) As BANanoFireStoreDB
	oendAt = endValue
	Return Me
End Sub


'order in ascending order
Sub orderBy(fld As String) As BANanoFireStoreDB
	ordering.Put(fld, FB_ASC)
	Return Me
End Sub

'specify order by
Sub orderBy1(fld As String, ordertype As String) As BANanoFireStoreDB
	ordering.Put(fld, ordertype)
	Return Me
End Sub

'specify the conditions
Sub whereCondition(fieldName As String, fieldOperation As String, fieldValue As Object) As BANanoFireStoreDB
	Dim wherem As Map = CreateMap()
	wherem.Put("fld", fieldName)
	wherem.Put("oper", fieldOperation)
	wherem.Put("value", fieldValue)
	whereClauses.Add(wherem)
	Return Me
End Sub

Sub SetWhere(bo As BANanoObject, fld As String, oper As String, value As Object) As BANanoObject
	Select Case oper
	Case "ne"
		bo = bo.RunMethod("where", Array(fld, "<", value))
		bo = bo.RunMethod("where", Array(fld, ">", value))
	Case Else
		bo = bo.RunMethod("where", Array(fld, oper, value))
	End Select
	Return bo
End Sub

'execute the query
Sub execute As BANanoPromise
	'get the collection
	Dim boTable As BANanoObject = getCollection(fromCollection)
	'get the where clauses
	Dim wc As List = whereClauses
	For Each wm As Map In wc
		Dim fld As String = wm.Get("fld")
		Dim oper As String = wm.Get("oper")
		Dim value As Object = wm.Get("value")
		'
		Select Case oper
		Case "ne"
			'this is not supported, create it
			boTable = boTable.RunMethod("where", Array(fld, "<", value))
			boTable = boTable.RunMethod("where", Array(fld, ">", value))
		Case Else
			boTable = boTable.RunMethod("where", Array(fld, oper, value))
		End Select
	Next
	'get ordering
	For Each fld As String In ordering.Keys
		Dim fldo As String = ordering.Get(fld)
		boTable = boTable.RunMethod("orderBy", Array(fld, fldo))
	Next
	'has a limig
	limitSelectionTo = BANano.parseInt(limitSelectionTo)
	If limitSelectionTo > 0 Then
		boTable.RunMethod("limit", Array(limitSelectionTo))
	End If
	'start and end clauses
	If BANano.IsNull(ostartAt) = False Then
		boTable.RunMethod("startAt", Array(ostartAt))
	End If
	'end and end clauses
	If BANano.IsNull(oendAt) = False Then
		boTable.RunMethod("endAt", Array(oendAt))
	End If
	'cler everything else
	fromCollection = "" 
	whereClauses.Initialize
	ordering.Initialize
	limitSelectionTo = -1
	ostartAt = Null
	oendAt = Null
	Dim promExec As BANanoPromise = boTable.RunMethod("get", Null)
	Return promExec
End Sub

'get
Sub Get(bo As BANanoObject) As BANanoPromise
	Dim promExec As BANanoPromise = bo.RunMethod("get", Null)
	Return promExec
End Sub

'set a limit to the number of pages
Sub LimitTo(lt As Int) As BANanoFireStoreDB
	limitSelectionTo = lt
	Return Me
End Sub

'returned the signed in user details
Sub getSignedInUserDetails(user As Map) As Map
	Dim usr As Map = getUser(user)
	Dim usr1 As Map = GetUserData(usr)
	Return usr1
End Sub

'get user data after sign in
Sub GetUserData(user As Map) As Map
	Dim userData As Map = CreateMap()
	If BANano.IsNull(user) Or BANano.IsUndefined(user) Then Return userData
	Dim displayName As String = user.Get("displayName")
	Dim email As String = user.Get("email")
	Dim emailVerified As Boolean = user.Get("emailVerified")
	Dim photoURL As String = user.Get("photoURL")
	Dim isAnonymous As Boolean = user.Get("isAnonymous")
	Dim uid As String = user.Get("uid")
	Dim phoneNumber As String = user.Get("phoneNumber")
	'
	userData.Put("displayName", displayName)
	userData.Put("email", email)
	userData.Put("emailVerified", emailVerified)
	userData.Put("photoURL", photoURL)
	userData.Put("isAnonymous", isAnonymous)
	userData.Put("uid", uid)
	userData.Put("phoneNumber", phoneNumber)
	Return userData
End Sub

'get UID
Sub getUID(userData As Map) As String
	Dim suid As String = userData.Get("uid")
	Return suid
End Sub

'get current user UID
Sub getCurrentUID As String
	'get the current user
	Dim user As Map = getCurrentUser
	'get the user id
	Dim uid As String = user.Get("uid")
	Return uid
End Sub

'get a reference to a realtime collection
Sub getDatabaseRef(refName As String) As BANanoObject
	Dim bo As BANanoObject = database.RunMethod("ref", Array(refName))
	Return bo
End Sub

'push to a ref a record
Sub DatabasePush(refName As String, record As Map) As BANanoPromise
	Dim tbl As BANanoObject = getDatabaseRef(refName)
	Dim bp As BANanoPromise = tbl.RunMethod("push", Array(record))
	Return bp
End Sub

'get a reference to a storage path
Sub getStorageRef(refName As String) As BANanoObject
	Dim bo As BANanoObject = storage.RunMethod("ref", Array(refName))
	Return bo
End Sub

'put a file to storage 
Sub StoragePut(refName As String, fo As Map) As BANanoPromise
	Dim tbl As BANanoObject = getStorageRef(refName)
	Dim bp As BANanoPromise = tbl.RunMethod("put", Array(fo))
	Return bp
End Sub

'get the storage URI
Sub getStorageURI(snapShot As BANanoObject) As String
	Dim sURI As String = snapShot.GetField("metadata").GetField("fullPath").Result
	Return sURI
End Sub

Sub getDownloadURL(snapShot As BANanoObject) As BANanoPromise
	Dim bp As BANanoPromise = snapShot.getfield("ref").RunMethod("getDownloadURL", Null)
	Return bp
End Sub
