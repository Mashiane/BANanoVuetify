B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
#ignorewarnings: 12
Sub Process_Globals
	Private BANano As BANano  'ignore
	Type FileObject(FileName As String, FileDate As String, FileSize As Long, FileType As String)
End Sub

Sub NewList As List
	Dim elx As List
	elx.Initialize 
	Return elx
End Sub

'build the map to send an email to use in callinlinephp
Sub BuildPHPEmail(sfrom As String, sto As String, scc As String, ssubject As String, smsg As String) As Map
	Dim se As Map = CreateMap("from":sfrom, "to":sto, "cc":scc, "subject":ssubject, "msg":smsg)
	Return se
End Sub

'get id from event
Sub GetIDFromEvent(e As BANanoEvent) As String
	Dim curEve As BANanoElement = BANano.ToElement(e.OtherField("currentTarget"))
	Dim ID As String = curEve.GetField("id").Result
	Return ID
End Sub

'get id from event
Sub GetKeyFromEvent(e As BANanoEvent) As String
	Dim curEve As BANanoElement = BANano.ToElement(e.OtherField("currentTarget"))
	Dim ID As String = curEve.GetField("key").Result
	Return ID
End Sub

Sub GetEventTargetProperty(e As BANanoEvent, prop As String) As String
	Dim sid As String = e.OtherField("target").GetField(prop).Result
	Return sid
End Sub

Sub GetFileListFromTarget(e As BANanoEvent) As List
	Dim files As List = e.OtherField("target").GetField("files").Result
	Return files
End Sub


Sub BeautifyName(idName As String) As String
	idName = idName.trim
	If idName = "" Then Return ""
	Dim ls As StringBuilder
	ls.Initialize
	Dim slen As Int = idName.Length
	Dim i As Int = 0
	For i = 0 To slen - 1
		Dim mout As String = idName.CharAt(i)
		If "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".IndexOf(mout) = -1 Then
			ls.Append("-")
		Else
			ls.Append(mout)
		End If
	Next
	Dim sname As String = ls.tostring
	sname = ProperSubName(sname, False)
	Return sname
End Sub

Sub ProperSubName(vx As String, removePref As Boolean) As String
	vx = vx.Replace(":", "-")
	vx = vx.Replace(".", "-")
	Dim varList As List = StrParse("-", vx)
	If removePref Then
		varList.RemoveAt(0)
	End If
	Dim varTot As Int = varList.Size - 1
	Dim varCnt As Int
	For varCnt = 0 To varTot
		Dim varItem As String = varList.Get(varCnt)
		varItem = ProperCase(varItem)
		varList.Set(varCnt, varItem)
	Next
	Dim subName1 As String = Join("",varList)
	Return subName1
End Sub

Sub Capitalize(t As String) As String
	Return ProperCase(t)
End Sub

Sub StrParse(delim As String, inputString As String) As List
	Dim nl As List
	nl.Initialize
	inputString = CStr(inputString)
	If inputString = "null" Then inputString = ""
	If inputString = "undefined" Then inputString = ""
	If inputString = "" Then Return nl
	Dim values() As String = BANano.Split(delim,inputString)
	nl.AddAll(values)
	Return nl
End Sub

'join list to mv string
Sub Join(delimiter As String, lst As List) As String
	Dim i As Int
	Dim sbx As StringBuilder
	Dim fld As String
	sbx.Initialize
	fld = lst.Get(0)
	sbx.Append(fld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		sbx.Append(delimiter).Append(fld)
	Next
	Return sbx.ToString
End Sub


Sub CorrectName(oldName As String) As String
	Dim strName As String = StringBreakAtUpperCase(oldName)
	strName = strName.replace(" ", "-")
	strName = strName.tolowercase
	Return strName
End Sub


'double quote each item of the mv
Sub MVQuoteItems(delim As String, mvstring As String) As String
	Dim sbOut As StringBuilder
	sbOut.Initialize
	Dim lItems As List = StrParse(delim, mvstring)
	For Each k As String In lItems
		k = CStr(k)
		k = k.Trim
		sbOut.Append($""${k}""$).Append(delim)
	Next
	Dim sout As String = sbOut.ToString
	sout = RemDelim(sout, delim)
	Return sout
End Sub

'double quote each item of the mv
Sub MVSingleQuoteItems(delim As String, mvstring As String) As String
	Dim sbOut As StringBuilder
	sbOut.Initialize
	Dim lItems As List = StrParse(delim, mvstring)
	For Each k As String In lItems
		k = CStr(k)
		k = k.Trim
		sbOut.Append($"'${k}'"$).Append(delim)
	Next
	Dim sout As String = sbOut.ToString
	sout = RemDelim(sout, delim)
	Return sout
End Sub


'get document ready state
Sub GetReadyState As String
	Dim rs As String = BANano.Window.GetField("document").GetField("readyState").Result
	Return rs
End Sub

'set ready change event
Sub SetOnReadyChange(EventHandler As Object)
	If SubExists(EventHandler, "ReadyChange") = False Then Return
	Dim cb As BANanoObject = BANano.callback(EventHandler, "ReadyChange", Null)
	BANano.Window.GetField("document").AddEventListener("readystatechange", cb, True)
End Sub
'

Sub YesNoToBoolean(xvalue As String) As Boolean
	Select Case xvalue
		Case "Yes","yes"
			Return True
		Case Else
			Return False
	End Select
End Sub


Sub DateIsAfter(date1 As String, date2 As String) As Boolean
	Dim d1 As Int = DateIconv(date1)
	Dim d2 As Int = DateIconv(date2)
	d1 = BANano.parseint(d1)
	d2 = BANano.parseInt(d2)
	Dim b As Boolean = BANano.IIf(d1 > d2, True, False)
	Return b
End Sub


'remove the delimiter from stringbuilder
Sub RemDelim(sValue As String, Delim As String) As String
	Dim sw As Boolean = sValue.EndsWith(Delim)
	If sw Then
		Dim lDelim As Int = Delim.Length
		Dim nValue As String = sValue
		sw = nValue.EndsWith(Delim)
		If sw Then
			nValue = nValue.SubString2(0, nValue.Length-lDelim)
		End If
		Return nValue
	Else
		Return sValue
	End If
End Sub

Sub DateIconv(sdate As String) As Long
	Dim lps As Long = DateTime.DateParse(sdate)
	Return lps
End Sub

Sub DateOconv(lDate As Long) As String
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim sdate As String = DateTime.Date(lDate)
	Return sdate
End Sub

'break a string at uppercase to have a space
Sub StringBreakAtUpperCase(st As String) As String
	If st.Length = 0 Then Return ""
	Dim k As Int
	Dim s As String
	Dim newst As String = st.CharAt(0)
	For i = 1 To st.Length - 1
		s = st.CharAt(i)
		k = Asc(s)
		If (k > 64) And (k < 91) And (st.CharAt(i-1) <> " ") Then
			newst = newst & " " & s
		Else
			newst = newst & s
		End If
	Next
	Return newst
End Sub


'build the styles
Sub BuildStyle(styles As Map) As String
	Dim sbx As StringBuilder
	sbx.Initialize
	For Each k As String In styles.keys
		Dim v As String = styles.get(k)
		If BANano.IsUndefined(v) Then v = ""
		If BANano.IsNull(v) Then v = ""
		k = k.trim
		v = v.trim
		If k = "" Then Continue
		If v = "" Then Continue
		sbx.Append($"${k}:${v};"$)
	Next
	Return sbx.tostring
End Sub

Sub BuildAttributes(properties As Map) As String
	If properties.ContainsKey("tagname") Then
		properties.remove("tagname")
	End If
	Dim sbx As StringBuilder
	sbx.Initialize
	For Each k As String In properties.keys
		Dim v As String = properties.get(k)
		If BANano.IsUndefined(v) Then v = ""
		If BANano.IsNull(v) Then v = ""
		If BANano.IsBoolean(v) Then
			sbx.Append($"${k}="${v}" "$)
		Else
			k = k.trim
			v = v.trim
			If k = "" Then Continue
			If v = "" Then Continue
			sbx.Append($"${k}="${v}" "$)
		End If
	Next
	Return sbx.tostring
End Sub

Sub JoinMapKeys(m As Map, delim As String) As String
	Dim sb As StringBuilder
	sb.Initialize
	Dim kTot As Int = m.Size - 1
	Dim kCnt As Int
	Dim strKey As String = m.getkeyat(0)
	sb.Append(strKey)
	For kCnt = 1 To kTot
		Dim strKey As String = m.getkeyat(kCnt)
		sb.Append(delim).append(strKey)
	Next
	Return sb.ToString
End Sub

Sub LoremIpsum(count As String) As String
	Return Rand_LoremIpsum(count)
End Sub

'return sentences of lorem ipsum
Sub Rand_LoremIpsum(count As Int) As String
	Dim str As String = $"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."$
	Dim sb As StringBuilder
	sb.Initialize
	For i = 1 To count
		sb.Append(str).Append(CRLF)
	Next
	Return sb.tostring
End Sub


'get the record position from saved items
Sub ListOfMapsRecordPos(lst As List, k As String, v As String) As Int
	Dim lTot As Int = lst.Size - 1
	Dim lCnt As Int
	For lCnt = 0 To lTot
		Dim m As Map = lst.Get(lCnt)
		Dim sk As String = m.GetDefault(k, "")
		If sk.EqualsIgnoreCase(v) Then
			Return lCnt
		End If
	Next
	Return -1
End Sub

Sub MvDistinct(delim As String, strmv As String) As String
	Dim items As List = StrParse(delim, strmv)
	Dim mi As Map = CreateMap()
	For Each k As String In items
		mi.Put(k, k)
	Next
	Dim nl As List = NewList
	For Each k As String In mi.Keys
		nl.Add(k)
	Next
	Dim sout As String = Join(delim, nl)
	Return sout
End Sub

'convert delimited values and keys to a map
Sub KeyValues2Map(delim As String, keys As String, values As String) As Map
	Dim rkeys As List = StrParse(delim, keys)
	Dim rvalues As List = StrParse(delim, values)
	'
	Dim optm As Map = CreateMap()
	
	Dim rTot As Int = rkeys.Size -1
	Dim vTot As Int = rvalues.Size - 1
	If rTot <> vTot Then
	Else
		Dim rCnt As Int
		For rCnt = 0 To rTot
			Dim k As String = rkeys.Get(rCnt)
			Dim v As String = rvalues.Get(rCnt)
			optm.put(k, v)
		Next
	End If
	Return optm
End Sub

Sub NewMap As Map
	Dim nm As Map
	nm.Initialize
	Return nm
End Sub

'javascript getElementById
Sub getElementById(sid As String) As BANanoObject
	Dim el As BANanoObject = BANano.Window.GetField("document").RunMethod("getElementById", Array(sid))
	Return el
End Sub
'
'Sub DateDiff(currentDate As String, otherDate As String) As Int
'	Dim dateS, dateE As BANanoObject
'	dateS.Initialize4("moment", currentDate)
'	dateE.Initialize4("moment", otherDate)
'	Return dateS.RunMethod("diff", Array(dateE, "days"))
'End Sub


Sub ListRemoveDuplicates(lst As List) As List
	Dim nd As Map = CreateMap()
	For Each k As String In lst
		nd.Put(k, k)
	Next
	Dim nl As List
	nl.Initialize
	For Each k As String In nd.Keys
		nl.Add(k)
	Next
	nl.Sort(True)
	Return nl
End Sub


Sub GetFileDetails(fileObj As Map) As FileObject
	Dim sname As String = fileObj.Get("name")
	Dim slastModifiedDate As BANanoObject = fileObj.Get("lastModifiedDate")
	Dim ssize As String = fileObj.Get("size")
	Dim stype As String = fileObj.Get("type")
	'
	Dim yyyy As String = slastModifiedDate.RunMethod("getFullYear", Null).Result
	Dim dd As String = slastModifiedDate.RunMethod("getDate", Null).Result
	Dim mm As String = slastModifiedDate.RunMethod("getMonth", Null).Result
	Dim hh As String = slastModifiedDate.RunMethod("getHours", Null).Result
	Dim minutes As String = slastModifiedDate.RunMethod("getMinutes", Null).Result
	'pad the details
	dd = PadRight(dd, 2, "0")
	mm = PadRight(mm, 2, "0")
	hh = PadRight(hh, 2, "0")
	minutes = PadRight(minutes, 2, "0")
	'
	Dim fd As String = $"${yyyy}-${mm}-${dd} ${hh}:${minutes}"$
	'
	
	Dim ff As FileObject
	ff.Initialize
	ff.FileName = sname
	ff.FileDate = fd
	ff.FileSize = ssize
	ff.FileType = stype
	Return ff
End Sub


Sub BeautifySourceCode(slang As String, sc As String) As String
	Select Case slang
	Case "js"
		Dim res As String = BANano.RunJavascriptMethod("js_beautify", Array(sc))
	Case "css"
		Dim res As String = BANano.RunJavascriptMethod("css_beautify", Array(sc))
	Case "html"
		Dim res As String = BANano.RunJavascriptMethod("html_beautify", Array(sc))
	End Select
	Return res
End Sub


private Sub DoUpload(fileObj As Object) As String   'ignore
	Dim aEvt As Object
	Dim xhr As BANanoXMLHttpRequest
	'define form data
	Dim fd As BANanoObject
	fd.Initialize2("FormData",Null)
	fd.RunMethod("append", Array("upload", fileObj))
	'
	xhr.Initialize
	xhr.Open("POST", "./assets/upload.php")
	xhr.AddEventListenerOpenAsync("onreadystatechange", aEvt)
	If xhr.ReadyState = 4 Then
		If xhr.Status = 200 Then
			BANano.ReturnThen(xhr.ResponseText)
		Else
			Dim err As Map = CreateMap()
			err.Put("status", "error")
			Dim serr As String = BANano.ToJson(err)
			BANano.ReturnElse(serr)
		End If
	End If
	xhr.CloseEventListener
	xhr.Send2(fd)
End Sub

Sub HTTPUpload(fileObj As Object, module As Object, methodname As String)
	Dim promise As BANanoPromise 'ignore
	' some vars to hold our results
	Dim Error As String
	Dim json As String
	
	' call the http request
	promise.CallSub(Me, "DoUpload", Array(fileObj))
	promise.ThenWait(json)
	BANano.CallSub(module, methodname, Array(fileObj, json))
	promise.ElseWait(Error)  'ignore
	BANano.CallSub(module, methodname, Array(fileObj, Error))
	promise.End
End Sub


Public Sub GetAlphabets(value As String) As String
	value = CStr(value)
	Try
		value = value.Trim
		If value = "" Then value = ""
		Dim sout As String = ""
		Dim mout As String = ""
		Dim slen As Int = value.Length
		Dim i As Int = 0
		For i = 0 To slen - 1
			mout = value.CharAt(i)
			If InStr("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ", mout) <> -1 Then
				sout = sout & mout
			End If
		Next
		Return sout
	Catch
		Return value
	End Try
End Sub

'return a pretty json from something
Sub JSONPretty(m As Object) As String
	Dim pretty As String = BANano.RunJavascriptMethod("JSON.stringify", Array(m, Null, 4))
	Return pretty
End Sub

'create a map subset from list of keys
Sub ExtractMap(source As Map, keys As List) As Map
	Dim nm As Map = CreateMap()
	For Each k As String In keys
		Dim v As Object = source.get(k)
		nm.put(k, v)
	Next
	Return nm
End Sub

Sub InStr(Text As String, sFind As String) As Int
	Return Text.tolowercase.IndexOf(sFind.tolowercase)
End Sub

'join list to mv string
Sub JoinNonBlanks(delimiter As String, lst As List) As String
	If lst.size = 0 Then Return ""
	'ensure we have non blanks
	Dim nl As List
	nl.Initialize
	For Each str As String In lst
		str = str.Trim
		If str.Length > 0 Then
			nl.Add(str)
		End If
	Next
	If nl.Size = 0 Then Return ""
	'
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = nl.Get(0)
	sb.Append(fld)
	For i = 1 To nl.size - 1
		Dim fld As String = nl.Get(i)
		sb.Append(delimiter).Append(fld)
	Next
	Return sb.ToString
End Sub


'join maps
Sub JoinMaps(lst As List) As Map
	Dim nm As Map = CreateMap()
	If lst.Size = 0 Then Return nm
	For Each mr As Map In lst
		For Each k As String In mr.Keys
			Dim v As Object = mr.Get(k)
			nm.Put(k, v)
		Next
	Next
	Return nm
End Sub

'join lists
Sub JoinLists(lst As List) As List
	Dim nl As List
	nl.Initialize
	For Each lo As List In lst
		For Each k As Object In lo
			nl.Add(k)
		Next
	Next
	Return nl
End Sub


'convert map keys to a list
Sub MapKeys2List(m As Map) As List
	Dim lst As List
	lst.Initialize
	For Each k As String In m.Keys
		lst.Add(k)
	Next
	Return lst
End Sub

'convert map keys to a list
Sub MapValues2List(m As Map) As List
	Dim lst As List
	lst.Initialize
	For Each k As String In m.values
		lst.Add(k)
	Next
	Return lst
End Sub


'rsa id to date of birth
Sub RSAIDNumber2DateOfBirth(rsaID As String) As String
	'south african id
	If rsaID.length = 13 Then
		Dim yymmdd As String = LeftString(rsaID, 6)
		Dim yy As String = LeftString(yymmdd,2)
		Dim mm As String = MidString(yymmdd,3,2)
		Dim dd As String = RightString(yymmdd,2)
		yymmdd = $"19${yy}-${mm}-${dd}"$
		Return yymmdd
	Else
		Return ""
	End If
End Sub

Public Sub YearNow() As String
	Dim lNow As Long
	Dim dt As String
	lNow = DateTime.Now
	DateTime.DateFormat = "yyyy"
	dt = DateTime.Date(lNow)
	Return dt
End Sub

Public Sub MonthNow() As String
	Dim lNow As Long
	Dim dt As String
	lNow = DateTime.Now
	DateTime.DateFormat = "M"
	dt = DateTime.Date(lNow)
	Return dt
End Sub

Sub DateAdd(mDate As String, HowManyDays As Int) As String
	HowManyDays = BANano.parseInt(HowManyDays)
	Dim ConvertDate, NewDateDay As Long
	ConvertDate = DateTime.DateParse(mDate)
	NewDateDay = DateTime.Add(ConvertDate, 0, 0, HowManyDays)
	Return DateTime.Date(NewDateDay)
End Sub

'Returns the number of days that have passed between two dates.
'Pass the dates as a String
Sub NumberOfDaysBetweenDates(CurrentDate As String, OtherDate As String) As Int
	Dim CurrDate, OthDate As Long
	CurrDate = DateTime.DateParse(CurrentDate)
	OthDate = DateTime.DateParse(OtherDate)
	Dim tpd As Long = DateTime.TicksPerDay
	Dim iOut As Long = (CurrDate - OthDate)/tpd
	Return iOut
End Sub

Public Sub CDbl(value As String) As Double
	Try
		value = value.Trim
		If value = "" Then value = "0"
		value = value.Replace(",","")
		Dim out As Double = NumberFormat2(value,0,2,2,False)
		Return out
	Catch
		Return value
	End Try
End Sub


Sub ProjectDays(sDays As String) As String
	Try
		sDays = sDays.trim
		If sDays = "" Then sDays = "0"
		sDays = sDays.Replace(",","")
		sDays = NumberFormat2(sDays,0,0,0,True)
		Return sDays & " Dys"
	Catch
		Return "0 Dys"
	End Try
End Sub

Sub ProjectDate(sDate As String) As String
	If sDate.Length = 0 Then Return ""
	Try
		DateTime.DateFormat = "yyyy-MM-dd"
		Dim dt As Long = DateTime.DateParse(sDate)
		DateTime.DateFormat = "dd-MMM-yyyy, EEE"
		Return DateTime.Date(dt)
	Catch
		Return ""
	End Try
End Sub


Sub FormatFileSize(Bytes As Float) As String
	Try
		Private Unit() As String = Array As String(" Byte", " KB", " MB", " GB", " TB", " PB", " EB", " ZB", " YB")
		If Bytes = 0 Then
			Return "0 Bytes"
		Else
			Private Po, Si As Double
			Private I As Int
			Bytes = Abs(Bytes)
			I = Floor(Logarithm(Bytes, 1024))
			Po = Power(1024, I)
			Si = Bytes / Po
			Return NumberFormat(Si, 1, 3) & Unit(I)
		End If
	Catch
		Return "0 Bytes"
	End Try
End Sub

Sub InStrRev(value As String, search As String) As Long
	Return value.LastIndexOf(search) + 1
End Sub


'get the length of the string
Sub Len(Text As String) As Int
	Return Text.Length
End Sub

'pad things to the right
Sub PadRight(Value As String, MaxLen As Int, PadChar As String) As String
	Value = CStr(Value)
	Dim intOrdNoLen As Int = Len(Value)
	Dim i As Int
	For i = 1 To (MaxLen - intOrdNoLen) Step 1
		Value = PadChar & Value
	Next
	Return Value
End Sub

Sub GetListOfMapsProperty(lst As List, prop As String) As List
	prop = prop.tolowercase
	Dim kc As List
	kc.initialize
	For Each rec As Map In lst
		Dim v As String = rec.Get(prop)
		kc.add(v)
	Next
	Return kc
End Sub

'sum list of maps property
Sub SumListOfMapsProperty(lst As List, prop As String) As Double
	Dim tsum As Double = 0
	For Each rec As Map In lst
		Dim propv As String = rec.GetDefault(prop,"0")
		tsum = tsum + BANAno.parseFloat(propv)
	Next
	Return tsum
End Sub

'extract all numeric values from a string
Public Sub Val(value As String) As String
	value = CStr(value)
	Try
		value = value.Trim
		If value = "" Then value = "0"
		Dim sout As String = ""
		Dim mout As String = ""
		Dim slen As Int = value.Length
		Dim i As Int = 0
		For i = 0 To slen - 1
			mout = value.CharAt(i)
			If InStr("0123456789.-", mout) <> -1 Then
				sout = sout & mout
			End If
		Next
		Return sout
	Catch
		Return value
	End Try
End Sub

Public Sub Alpha(value As String) As String
	value = CStr(value)
	Try
		value = value.Trim
		If value = "" Then value = ""
		Dim sout As String = ""
		Dim mout As String = ""
		Dim slen As Int = value.Length
		Dim i As Int = 0
		For i = 0 To slen - 1
			mout = value.CharAt(i)
			If InStr("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", mout) <> -1 Then
				sout = sout & mout
			End If
		Next
		Return sout
	Catch
		Return value
	End Try
End Sub


'convert list of maps to key,value pairs
Sub List2KeyValues(lst As List, mapvalues As List) As List
	Return List2IDValue(lst, mapvalues)
End Sub

'convest list of maps to id & value
Sub List2IDValue(lst As List, mapValues As List) As List
	Dim mv1 As String = mapValues.get(0)
	Dim mv2 As String = mapValues.get(1)
	Dim nlst As List
	nlst.initialize
	For Each dict As Map In lst
		Dim mk As String = dict.get(mv1)
		Dim mv As String = dict.get(mv2)
		Dim nm As Map = CreateMap()
		nm.Put("id", mk)
		nm.put("value", mv)
		nlst.Add(nm)
	Next
	Return nlst
End Sub

Sub List2ArrayVariable(lst As List) As String
	If lst.Size = 0 Then
		Return $""""$
	End If
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = lst.Get(0)
	fld = $""${fld}""$
	sb.Append(fld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		fld = $""${fld}""$
		sb.Append(",").Append(fld)
	Next
	Return sb.ToString
End Sub


Sub JSONValues2LowerCase(sJSON As String, props As List) As String
	'convert json to map
	Dim jmap As Map = Json2Map(sJSON)
	MapValues2LowerCase(jmap, props)
	Dim nJSON As String = Map2Json(jmap)
	Return nJSON
End Sub


'convert a map to a json string using BANanoJSONGenerator
Sub Map2Json(mp As Map) As String
	Dim JSON As BANanoJSONGenerator
	JSON.Initialize(mp)
	Return JSON.ToString
End Sub

Sub Map2JsonPretty(mp As Map) As String
	Dim JSON As BANanoJSONGenerator
	JSON.Initialize(mp)
	Return JSON.ToPrettyString(4)
End Sub


'convert a json string to a map
Sub Json2Map(strJSON As String) As Map
	Dim json As BANanoJSONParser
	Dim Map1 As Map
	Map1.Initialize
	Map1.clear
	Try
		If strJSON.length > 0 Then
			json.Initialize(strJSON)
			Map1 = json.NextObject
		End If
		Return Map1
	Catch
		Return Map1
	End Try
End Sub

Sub NewDate(year As Int, month As Int, day As Int) As BANanoObject
	Dim dd As BANanoObject
	dd.Initialize2("Date", Array(year, month, day))
	Return dd
End Sub

Sub NewDateTime(year As Int, month As Int, day As Int, hour As Int, minute As Int) As BANanoObject
	Dim dd As BANanoObject
	dd.Initialize2("Date", Array(year, month, day, hour, minute))
	Return dd
End Sub

Sub Pad(Value As String, MaxLen As Int, PadChar As String, right As Boolean) As String
	Dim  intOrdNoLen As Int = Value.Length
	Dim i As Int
	For i = 1 To (MaxLen - intOrdNoLen) Step 1
		If right Then
			Value =  Value & PadChar
		Else
			Value = PadChar & Value
		End If
	Next
	Return Value
End Sub

Sub CLng(o As Object) As Long
	Return Floor(o)
End Sub

Sub CInt(o As Object) As Int
	Return Floor(o)
End Sub


'convert a list to json
Sub List2Json(mp As List) As String
	Dim JSON As BANanoJSONGenerator
	JSON.Initialize2(mp)
	Return JSON.ToString
End Sub

' convert a json string to a list
Sub Json2List(strValue As String) As List
	Dim lst As List
	lst.Initialize
	lst.clear
	If strValue.Length = 0 Then
		Return lst
	End If
	Try
		Dim parser As BANanoJSONParser
		parser.Initialize(strValue)
		Return parser.NextArray
	Catch
		Return lst
	End Try
End Sub

'convert map values to lowercase
Sub MapValues2LowerCase(m As Map, props As List)
	For Each prop As String In props
		If m.ContainsKey(prop) Then
			Dim v As String = m.GetDefault(prop,"")
			v = v.tolowercase
			m.Put(prop,v)
		End If
	Next
End Sub

Sub NumberSuffix(N As Double) As String
	If N < 0 Then
		Return "-" & NumberSuffix(-N)
	End If
	Dim Suffix() As String = Array As String("", "k", "M", "B", "T")
	Dim Thousands As Int = 0
	Do While N >= 1000 And Thousands < Suffix.Length - 1
		Thousands = Thousands + 1
		N = N / 1000
	Loop
	If Thousands = 0 Then
		Return NumberFormat2(N, 1, 2, 2, False)
	End If
 
	Dim MaxDecimalPlaces As Int = 0
	Do While MaxDecimalPlaces < 5
		Dim RelativeError As Double = Abs(N - Round2(N, MaxDecimalPlaces)) / N
		If RelativeError < 0.007 Then
			Exit
		End If
		MaxDecimalPlaces = MaxDecimalPlaces + 1
	Loop
	Return NumberFormat2(N, 1, 0, MaxDecimalPlaces, False) & Suffix(Thousands)
End Sub


Sub List2Array (a_lstArgs As List) As String()
	Dim arrArgs(a_lstArgs.Size) As String
	For i = 0 To arrArgs.Length - 1
		arrArgs(i) = a_lstArgs.Get(i)
	Next
	Return arrArgs
End Sub


Sub RandomString(iLength As Int, bLowerCase As Boolean, bUpperCase As Boolean, bNumbers As Boolean, AdditionalChars As String) As String
	Dim source As String
	If bLowerCase = True Then
		source = source &"abcdefghijklmnopqrstuvwxyz"
	End If
	If bUpperCase = True Then
		source = source &"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	End If
	If bNumbers = True Then
		source = source &"0123456789"
	End If
	If AdditionalChars.Length > 0 Then
		source = source&AdditionalChars
	End If

	Dim SB As StringBuilder
	SB.Initialize
	For i = 1 To iLength
		Dim r As Int = Rnd(0,source.Length-1)
		SB.Append(source.SubString2(r,r+1))
	Next
	Return SB.ToString
End Sub

Sub GeneratePassword(IntNum As Int) As String
	Return RandomString(IntNum,True,True,True,"")
End Sub

'remove a delimiter from a string
Sub RemDelimSB(delimiter As String, value As StringBuilder) As StringBuilder
	If value.tostring.EndsWith(delimiter) = True Then
		Dim delimLen As Int = delimiter.length
		value.Remove(value.Length-delimLen,value.Length)
	End If
	Return value
End Sub


Sub Space(HM As Int) As String
	Dim RS As String = ""
	Do While Len(RS) < HM
		RS = RS & " "
	Loop
	Return RS
End Sub

Sub MakeMoney(sValue As String) As String
	If sValue.Length = 0 Then Return "0.00"
	If sValue = "null" Then sValue = "0.00"
	sValue = sValue.Replace(",","")
	sValue = Val(sValue)
	If sValue = "0" Then sValue = "000"
	sValue = Round2(sValue,2)
	Return NumberFormat2(sValue, 1, 2, 2, True)
End Sub

Sub Percentage(sValue As String) As String
	If sValue = "" Then sValue = "0.00"
	If sValue.Length = 0 Then Return "0.00"
	If sValue = "null" Then sValue = "0.00"
	sValue = sValue.Replace(",","")
	sValue = Val(sValue)
	If sValue = "0" Then sValue = "0.00"
	sValue = Round2(sValue,2)
	sValue = sValue & "%"
	Return sValue
End Sub

Sub MidString(Text As String, Start As Int, lLength As Int) As String
	Return Text.SubString2(Start-1,Start+lLength-1)
End Sub

Sub MidString2(Text As String, Start As Int) As String
	Return Text.SubString(Start-1)
End Sub

Sub RightString(Text As String, lLength As Long) As String
	If lLength>Text.Length Then lLength=Text.Length
	Return Text.SubString(Text.Length-lLength)
End Sub

Sub LeftString(Text As String, lLength As Long)As String
	If lLength>Text.Length Then lLength=Text.Length
	Return Text.SubString2(0, lLength)
End Sub

Sub ReplaceString(Text As String, sFind As String, sReplaceWith As String) As String
	Return Text.Replace(sFind, sReplaceWith)
End Sub

Sub LongDate(sDate As String) As String
	If sDate.Length = 0 Then Return ""
	Try
		DateTime.DateFormat = "yyyy-MM-dd"
		Dim dt As Long = DateTime.DateParse(sDate)
		DateTime.DateFormat = "EEEE, dd MMMM yyyy"
		Return DateTime.Date(dt)
	Catch
		Return ""
	End Try
End Sub

Sub LongDateTime(sDate As String) As String
	If sDate.Length = 0 Then Return ""
	Try
		DateTime.DateFormat = "yyyy-MM-dd HH:mm"
		Dim dt As Long = DateTime.DateParse(sDate)
		DateTime.DateFormat = "EEEE, dd MMMM yyyy HH:mm"
		Return DateTime.Date(dt)
	Catch
		Return ""
	End Try
End Sub

private Sub TrimString(strValue As String) As String
	Return strValue.trim
End Sub

Sub LCase(Text As String) As String
	Return Text.ToLowerCase
End Sub

Public Sub InQuotes(sValue As String) As String
	Return QUOTE & sValue & QUOTE
End Sub

Sub ProperCase(myStr As String) As String
	Try
		If myStr.trim.length = 0 Then Return ""
		Dim x As String
		Dim j, k As Int
		myStr = myStr.tolowercase
		x = myStr.ToUpperCase.CharAt(0)
		myStr = x & myStr.SubString2(1, myStr.Length)
		For j = 1 To myStr.Length
			k = myStr.IndexOf2(" ", j + 1)
			If k = -1 Then Exit
			x = myStr.ToUpperCase.CharAt(k + 1)
			myStr = myStr.SubString2(0, k + 1) & x & myStr.SubString2(k + 2, myStr.Length)
		Next
		Return myStr
	Catch
		Return myStr
	End Try
End Sub


'lowercase map keys
Sub MapKeysLowerCaseSingle(m As Map) As Map
	Dim nm As Map = CreateMap()
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		k = k.tolowercase
		nm.Put(k, v)
	Next
	Return nm
End Sub

'convert a list of map records to lowerase
Sub MapKeysLowerCaseList(lst As List) As List
	Dim nl As List
	nl.Initialize
	For Each rec As Map In lst
		rec = MapKeysLowerCaseSingle(rec)
		nl.Add(rec)
	Next
	Return nl
End Sub


'get map values to a list
Sub GetMapValues(sourceMap As Map) As List
	Dim listOfValues As List
	listOfValues.Initialize
	Dim iCnt As Int
	Dim iTot As Int
	iTot = sourceMap.Size - 1
	For iCnt = 0 To iTot
		Dim value As Object = sourceMap.GetValueAt(iCnt)
		listOfValues.Add(value)
	Next
	Return listOfValues
End Sub

'get map keys to a list
Sub GetMapKeys(sourceMap As Map) As List
	Dim listOfValues As List
	listOfValues.Initialize
	Dim iCnt As Int
	Dim iTot As Int
	iTot = sourceMap.Size - 1
	For iCnt = 0 To iTot
		Dim value As Object = sourceMap.GetKeyAt(iCnt)
		listOfValues.Add(value)
	Next
	Return listOfValues
End Sub


'extract all numeric values from a string
Public Sub GetNumbers(value As String) As String
	value = CStr(value)
	Try
		value = value.Trim
		Dim sout As String = ""
		Dim mout As String = ""
		Dim slen As Int = value.Length
		Dim i As Int = 0
		For i = 0 To slen - 1
			mout = value.CharAt(i)
			If InStr("0123456789.-", mout) <> -1 Then
				sout = sout & mout
			End If
		Next
		Return sout
	Catch
		Return value
	End Try
End Sub


Sub SortMap(m As Map) As Map
	Try
		Dim nm As Map
		nm.Initialize
		Dim lst As List
		lst.Initialize
		For Each strkey As String In m.Keys
			lst.Add(strkey)
		Next
		'sort the list keys
		lst.Sort(True)
		For Each strkey As String In lst
			Dim strvalue As Object = m.Get(strkey)
			nm.Put(strkey,strvalue)
		Next
		Return nm
	Catch
		Return m
	End Try
End Sub


Sub MergeMaps(oldm As Map, newm As Map) As Map
	Dim om As Map = CreateMap()
	For Each k As String In oldm.Keys
		Dim v As Object = oldm.Get(k)
		om.Put(k, v)
	Next
	'
	For Each k As String In newm.Keys
		Dim v As Object = newm.Get(k)
		om.Put(k, v)
	Next
	Return om
End Sub


Sub List2MapSimple(lst As List, bSort As Boolean) As Map
	If bSort Then lst.Sort(True)
	Dim nm As Map = CreateMap()
	For Each k As String In lst
		nm.Put(k, k)	
	Next
	Return nm
End Sub


'convert a list to key value pairs map records
Sub List2Options(lst As List, keyName As String, valueName As String) As Map
	Dim recs As List
	recs.Initialize
	For Each k As String In lst
		Dim nrec As Map = CreateMap()
		nrec.Put(keyName, k)
		nrec.Put(valueName, k)
		recs.Add(nrec)
	Next
	Return recs
End Sub

'convert a list to key value pairs map records
Sub List2Map(lst As List, keyName As String, valueName As String) As Map
	Return List2Options(lst, keyName, valueName)
End Sub

'convert map to a list of maps with key and values
Sub Map2Options(m As Map, keyName As String, valueName As String) As List
	Dim recs As List
	recs.Initialize
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		Dim nrec As Map = CreateMap()
		nrec.Put(keyName, k)
		nrec.Put(valueName, v)
		recs.Add(nrec)
	Next
	Return recs
End Sub

'create a replica of a map
Sub MapClone(oldMap As Map) As Map
	Dim nm As Map = CreateMap()
	For Each k As String In oldMap.keys
		Dim v As Object = oldMap.Get(k)
		nm.Put(k, v)
	Next
	Return nm
End Sub

'create a replica of a map by swap key values
Sub MapCloneSwap(oldMap As Map) As Map
	Dim nm As Map = CreateMap()
	For Each k As String In oldMap.keys
		Dim v As Object = oldMap.Get(k)
		nm.Put(v, k)
	Next
	Return nm
End Sub

'update the background image for the page during runtime
Sub SetBackgroundImage(elid As String, url As String)
	BANano.GetElement(elid).SetStyle(BANano.ToJson(CreateMap("background-image": $"url('${url}')"$, "background-size": "100% 100%")))
End Sub

'set a property in a json string
Sub JSONSetProperty(sjson As String, updates As Map) As String
	Dim m As Map = BANano.FromJson(sjson)
	For Each k As String In updates.Keys
		Dim v As Object = updates.Get(k)
		m.Put(k, v)
	Next
	Dim sout As String = BANano.ToJson(m)
	Return sout
End Sub


Sub EQOperators(sm As Map) As List   'ignore
	Dim nl As List
	nl.initialize
	For Each k As String In sm.Keys
		nl.Add("=")
	Next
	Return nl
End Sub


'add break
Sub BR As String
	Return "<br>"
End Sub

'add hr
Sub HR As String
	Return "<hr>"
End Sub


#if javascript
function hexToRgb(hexCode) {
    var patt = /^#([\da-fA-F]{2})([\da-fA-F]{2})([\da-fA-F]{2})$/;
    var matches = patt.exec(hexCode);
    var rgb = "rgb(" + parseInt(matches[1], 16) + "," + parseInt(matches[2], 16) + "," + parseInt(matches[3], 16) + ")";
    return rgb;
}

function hexToRgba(hexCode, opacity) {
    var patt = /^#([\da-fA-F]{2})([\da-fA-F]{2})([\da-fA-F]{2})$/;
    var matches = patt.exec(hexCode);
    var rgb = "rgba(" + parseInt(matches[1], 16) + "," + parseInt(matches[2], 16) + "," + parseInt(matches[3], 16) + "," + opacity + ")";
    return rgb;
}
#End If

Sub MakePx(sValue As String) As String
	sValue = sValue.trim
	If sValue.EndsWith("%") Then
		Return sValue
	else If sValue.EndsWith("vm") Then
		Return sValue
	else If sValue.EndsWith("px") Then
		Return sValue
	else If sValue.EndsWith("cm") Then
		Return sValue
	else If sValue.EndsWith("mm") Then
		Return sValue
	else If sValue.EndsWith("in") Then
		Return sValue
	else If sValue.EndsWith("pt") Then
		Return sValue
	else If sValue.EndsWith("pc") Then
		Return sValue
	else If sValue.EndsWith("em") Then
		Return sValue
	else If sValue.EndsWith("ex") Then
		Return sValue
	else If sValue.EndsWith("ch") Then
		Return sValue
	else If sValue.EndsWith("rem") Then
		Return sValue
	else If sValue.EndsWith("vw") Then
		Return sValue
	else If sValue.EndsWith("vh") Then
		Return sValue
	else If sValue.EndsWith("vmin") Then
		Return sValue
	else If sValue.EndsWith("vmax") Then
		Return sValue
	else If sValue.EndsWith(";") Then
		Return sValue
	Else
		sValue = sValue.Replace("px","")
		sValue = $"${sValue}px"$
		If sValue = "px" Then sValue = ""
		Return sValue
	End If
End Sub


'save text to a file
Sub SaveText2File(content As String, fileName As String)
	Dim fc As List
	fc.Initialize
	fc.Add(content)
	Dim blob As BANanoObject
	blob.Initialize2("Blob",Array(fc, CreateMap("type": "text/plain;charset=utf-8")))
	BANAno.RunJavascriptMethod("saveAs",Array(blob,fileName))
End Sub

Sub SaveBinaryArray2File(iUint8Array As Object, dbName As String)
	Dim fc As List
	fc.Initialize
	fc.Add(iUint8Array)
	'
	Dim blob As BANanoObject
	blob.Initialize2("Blob",Array(fc, CreateMap("type": "application/octet-stream")))
	BANano.RunJavascriptMethod("saveAs",Array(blob, dbName))
End Sub


Sub MvCount(strMV As String, Delimiter As String) As Int
	Dim spValues() As String = BANano.Split(Delimiter,strMV)
	Return spValues.Length
End Sub


Sub AuditTrail(oldM As Map, newM As Map) As Map
	Dim df As Map = CreateMap()
	For Each k As String In oldM.Keys
		Dim v As Object = oldM.Get(k)
		If newM.ContainsKey(k) Then
			Dim nv As Object = newM.Get(k)
			If v <> nv Then
				df.Put(k, nv)
			End If
		End If
	Next
	For Each k As String In newM.Keys
		Dim v As Object = newM.Get(k)
		If oldM.ContainsKey(k) Then
			Dim ov As Object = oldM.Get(k)
			If v <> ov Then
				df.Put(k, v)
			End If
		Else
			df.Put(k, v)	
		End If
	Next
	Return df
End Sub

Public Sub TimeNow() As String
	Dim lNow As Long
	Dim dt As String
	lNow = DateTime.Now
	DateTime.DateFormat = "HH:mm"
	dt = DateTime.Date(lNow)
	Return dt
End Sub

Public Sub DateNow() As String
	Dim lNow As Long
	Dim dt As String
	lNow = DateTime.Now
	DateTime.DateFormat = "yyyy-MM-dd"
	dt = DateTime.Date(lNow)
	Return dt
End Sub

Public Sub DateTimeNow() As String
	Dim lNow As Long
	Dim dt As String
	lNow = DateTime.Now
	DateTime.DateFormat = "yyyy-MM-dd HH:mm"
	dt = DateTime.Date(lNow)
	Return dt
End Sub


Sub LongDateTimeToday() As String
	DateTime.DateFormat = "yyyy-MM-dd HH:mm"
	Dim dt As Long = DateTime.now
	DateTime.DateFormat = "dd/MM/yyyy, HH:mm"
	Return DateTime.Date(dt)
End Sub

Sub CopyMap(source As Map, keys As List) As Map
	Dim nm As Map = CreateMap()
	If keys.Get(0) = "*" Then
		For Each k As String In source.Keys
			Dim v As Object = source.Get(k)
			nm.Put(k, v)
		Next
	Else
		For Each k As String In keys
			Dim v As Object = source.Get(k)
			nm.Put(k, v)
		Next
	End If
	Return nm
End Sub


Sub GetFileParentPath(Path As String) As String
	Dim Path1 As String
	Dim L As Int
	If Path = "/" Then
		Return "/"
	End If
	L = Path.LastIndexOf("/")
	If L = Path.Length - 1 Then
		'Strip the last slash
		Path1 = Path.SubString2(0,L)
	Else
		Path1 = Path
	End If
	L = Path.LastIndexOf("/")
	If L = 0 Then
		L = 1
	End If
	Return Path1.SubString2(0,L)
End Sub

Sub GetFileExt(FullPath As String) As String
	Return FullPath.SubString(FullPath.LastIndexOf(".")+1)
End Sub

Sub SetPrefix(prefix As String, target As Map) As Map
	Dim nm As Map = CreateMap()
	For Each mk As String In target.Keys
		Dim mv As Object = target.Get(mk)
		Dim mk1 As String = prefix & "_" & mk
		nm.Put(mk1,mv)
	Next
	Return nm
End Sub

'convert object to string
Sub CStr(o As Object) As String
	If o = BANano.UNDEFINED Then o = ""
	Return "" & o
End Sub

'make all keys lowercase
Sub FixRecords(recs As List, trimThese As List, numThese As List, boolThese As List, dateThese As List, dblThese As List)
	Dim rTot As Int = recs.Size - 1
	Dim rCnt As Int
	For rCnt = 0 To rTot
		Dim rec As Map = recs.Get(rCnt)
		'make all keys lowercase
		Dim nrec As Map = CreateMap()
		For Each k As String In rec.keys
			Dim v As Object = rec.Get(k)
			k = k.ToLowerCase
			nrec.Put(k, v)
		Next
		If dateThese <> Null Then MakeDate(nrec,dateThese)
		If trimThese <> Null Then MakeTrim(nrec,trimThese)
		If numThese <> Null Then MakeInteger(nrec, numThese)
		If dblThese <> Null Then MakeDouble(nrec, dblThese)
		If boolThese <> Null Then MakeBoolean(nrec, boolThese)
		recs.Set(rCnt, nrec)	
	Next
End Sub

Sub MakeInteger(m As Map, xkeys As List)
	For Each k As String In xkeys
		If m.ContainsKey(k) Then
			Dim v As String = m.GetDefault(k,"")
			v = CStr(v)
			v = v.trim
			If v = "" Then v = "0"
			v = BANano.parseInt(v)
			m.Put(k, v)
		End If
	Next
End Sub

Sub MakeDouble(m As Map, xkeys As List)
	For Each k As String In xkeys
		If m.ContainsKey(k) Then
			Dim v As String = m.GetDefault(k,"")
			v = CStr(v)
			v = v.trim
			If v = "" Then v = "0"
			v = BANAno.parseFloat(v)
			m.Put(k, v)
		End If
	Next
End Sub

Sub MakeYesNo(m As Map, xkeys As List)
	For Each k As String In xkeys
		If m.ContainsKey(k) Then
			Dim v As String = m.GetDefault(k,"No")
			v = CStr(v)
			v = v.trim
			Select Case v
				Case "","0", "false", "False",False,0,"no","No"
					m.Put(k, "No")
				Case "1", "true", "True",True,1,"yes","Yes"
					m.Put(k, "Yes")
			End Select
		End If
	Next
End Sub



Sub MakeBoolean(m As Map, xkeys As List)
	For Each k As String In xkeys
		If m.ContainsKey(k) Then
			Dim v As String = m.GetDefault(k,"0")
			v = CStr(v)
			v = v.trim
			Select Case v
			Case "","0", "false", "False",False,0,"no","No"
				m.Put(k, False)
			Case "1", "true", "True",True,1,"yes","Yes"
				m.Put(k, True)
			End Select
		End If
	Next
End Sub


Sub MakeTrim(m As Map, xkeys As List)
	For Each k As String In xkeys
		If m.ContainsKey(k) Then
			Dim v As String = m.GetDefault(k,"")
			v = CStr(v)
			v = v.trim
			m.Put(k, v)
		End If
	Next
End Sub

Sub MakeLowerCase(m As Map) As Map
	Dim nm As Map = CreateMap()
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		k = k.tolowercase
		nm.Put(k, v)
	Next
	Return nm
End Sub

Sub MakeDate(m As Map, xkeys As List)
	For Each k As String In xkeys
		If m.ContainsKey(k) Then
			Dim v As String = m.GetDefault(k,"")
			v = CStr(v)
			v = v.trim
			v = MvField(v,1," ")
			m.Put(k, v)
		End If
	Next
End Sub


Sub CreateList(Delimiter As String, Values As String) As List
	Dim newLst As List
	newLst.Initialize
	If Values.length > 0 Then
		Dim spV As List = StrParse(Delimiter,Values)
		newLst.AddAll(spV)
	End If
	Return newLst
End Sub

'mvfield sub
Sub MvField(sValue As String, iPosition As Int, Delimiter As String) As String
	If sValue.Length = 0 Then Return ""
	Dim xPos As Int = sValue.IndexOf(Delimiter)
	If xPos = -1 Then Return sValue
	Dim mValues As List = StrParse(Delimiter,sValue)
	Dim tValues As Int
	tValues = mValues.size -1
	Select Case iPosition
		Case -1
			Return mValues.get(tValues)
		Case -2
			Return mValues.get(tValues - 1)
		Case -3
			Dim sb As StringBuilder
			sb.Initialize
			Dim startcnt As Int
			sb.Append(mValues.Get(1))
			For startcnt = 2 To tValues
				sb.Append(Delimiter)
				sb.Append(mValues.get(startcnt))
			Next
			Return sb.tostring
		Case Else
			iPosition = iPosition - 1
			If iPosition <= -1 Then
				Return mValues.get(tValues)
			End If
			If iPosition > tValues Then
				Return ""
			End If
			Return mValues.get(iPosition)
	End Select
End Sub


'Returns a random list value from a LIST 
Sub RandListValue(ListX As List) As Object
	ShuffleList(ListX)
	Return ListX.Get(Rnd(0, ListX.Size -1))
End Sub

'remove from list
Sub RamoveFromList(listX As List, item As String)
	Dim li As Int = listX.IndexOf(item)
	If li >= 0 Then listX.RemoveAt(li)
End Sub

Sub ShuffleList(pl As List) As List
	For i = pl.Size - 1 To 0 Step -1
		Dim j As Int
		Dim k As Object
		j = Rnd(0, i + 1)
		k = pl.Get(j)
		pl.Set(j,pl.Get(i))
		pl.Set(i,k)
	Next
	Return pl
End Sub

'
'''set the font family
'Sub SetFontFamily(ff As Object)
'	body.SetStyle(BANano.ToJson(CreateMap("font-family": ff)))
'End Sub
'
''set the background image style
'Sub SetCoverImage(imgURL As String)
'	Dim opt As Map = CreateMap()
'	If imgURL = "none" Then
'		opt.Put("background-image", "none")
'	Else
'		'opt.Put("background-image", $"url('${imgURL}')"$)
'		'opt.Put("background-position", "center center")
'		'opt.Put("background-repeat", "no-repeat")
'		'opt.Put("background-attachment", "fixed")
'		'opt.Put("background-size", "cover")
'		
'		opt.Put("background", $"url('${imgURL}')"$)
'		opt.Put("position", "absolute")
'		opt.Put("height", "100%")
'		opt.Put("width", "100%")
'		opt.Put("top", "0")
'		opt.Put("bottom", "0")
'		opt.Put("right", "0")
'		opt.Put("left", "0")
'		opt.Put("z-index", "0")
'	End If
'	Dim sjson As String = BANano.ToJson(opt)
'	body.SetStyle(sjson)
'End Sub


public Sub AfterTodayRG(dVariance As Long) As String
	If dVariance <= 0 Then
		Return "./assets/green.png"
	else if dVariance > 0 Then
		Return "./assets/red.png"
	Else
		Return "./assets/gray.png"
	End If
End Sub


Public Sub ProgressRAG(dVariance As Double) As String
	If dVariance < 0 Then
		Return "./assets/red.png"
	else if dVariance > 0 Then
		Return "./assets/green.png"
	else if dVariance = 0 Then
		Return "./assets/orange.png"
	Else
		Return "./assets/gray.png"
	End If
End Sub


Public Sub ExpectedRAG(dValue As Double) As String
	If dValue = 0 Then
		Return "./assets/orange.png"
	else if dValue > 0 Then
		Return "./assets/red.png"
	else if dValue < 0 Then
		Return "./assets/green.png"
	Else
		Return "./assets/red.png"
	End If
End Sub

Public Sub ExpenditureRAG(dVariance As Double) As String
	If dVariance > 0 Then
		Return "./assets/green.png"
	else if dVariance < 0 Then
		Return "./assets/red.png"
	else if dVariance = 0 Then
		Return "./assets/orange.png"
	Else
		Return "./assets/gray.png"
	End If
End Sub

Public Sub PriorityRAG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/green.png"
		Case 1
			Return "./assets/orange.png"
		Case 2
			Return "./assets/red.png"
		Case Else
			Return "./assets/gray.png"
	End Select
End Sub

Public Sub RAG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/red.png"
		Case 1
			Return "./assets/orange.png"
		Case 2
			Return "./assets/green.png"
		Case Else
			Return "./assets/gray.png"
	End Select
End Sub

Public Sub GAR(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/green.png"
		Case 1
			Return "./assets/orange.png"
		Case 2
			Return "./assets/red.png"
		Case Else
			Return "./assets/gray.png"
	End Select
End Sub

Public Sub StatusRAG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/red.png"
		Case 1
			Return "./assets/orange.png"
		Case 2
			Return "./assets/green.png"
		Case Else
			Return "./assets/gray.png"
	End Select
End Sub

Public Sub FaceRAG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/sadface.png"
		Case 1
			Return "./assets/neutralface.png"
		Case 2
			Return "./assets/happyface.png"
		Case Else
			Return "./assets/sadface.png"
	End Select
End Sub

Public Sub FaceRG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/sadface.png"
		Case 1
			Return "./assets/happyface.png"
		Case Else
			Return "./assets/sadface.png"
	End Select
End Sub

Public Sub FaceRG1(dValue As Int) As String
	Select Case dValue
		Case 1
			Return "./assets/sadface.png"
		Case 0
			Return "./assets/happyface.png"
		Case Else
			Return "./assets/sadface.png"
	End Select
End Sub

Public Sub FaceDone(dValue As Int) As String
	Select Case dValue
		Case 100
			Return "./assets/happyface.png"
		Case Else
			Return "./assets/sadface.png"
	End Select
End Sub

Sub ProgressStatus(dValue As Int) As Int
	Select Case dValue
		Case 100
			Return 1
		Case Else
			Return 0
	End Select
End Sub

Sub StatusRG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/red.png"
		Case 1
			Return "./assets/green.png"
		Case Else
			Return "./assets/red.png"
	End Select
End Sub

Sub EscapeField(f As String) As String
	Return $"[${f}]"$
End Sub

'join list to multi value string
Sub JoinFields(delimiter As String, lst As List) As String
	If lst.Size = 0 Then Return ""
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = lst.Get(0)
	fld = EscapeField(fld)
	sb.Append(fld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		fld = EscapeField(fld)
		sb.Append(delimiter).Append(fld)
	Next
	Return sb.ToString
End Sub

'join list to multi value string with a quote
Sub JoinFields1(delimiter As String, sQuote As String, lst As List) As String
	If lst.Size = 0 Then Return ""
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = lst.Get(0)
	Dim xfld As String = $"${fld}"$
	xfld = sQuote & xfld & sQuote
	sb.Append(xfld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		Dim xfld As String = $"${fld}"$
		xfld = sQuote & xfld & sQuote
		sb.Append(delimiter).Append(xfld)
	Next
	Return sb.ToString
End Sub


Sub GetOptionsFromKV(delim As String, k As String, v As String) As Map
	k = CStr(k)
	v = CStr(v)
	Dim no As Map = CreateMap()
	Dim rkeys() As String = BANano.Split(delim, k)
	Dim rvalues() As String = BANano.Split(delim, v)
	'
	Dim rTot As Int = rkeys.Length - 1
	Dim vTot As Int = rvalues.Length - 1
	'
	If rTot <> vTot Then Return no
	'
	Dim rCnt As Int
	For rCnt = 0 To rTot
		Dim k1 As String = rkeys(rCnt)
		Dim v1 As String = rvalues(rCnt)
		no.put(k1, v1)
	Next
	Return no
End Sub


'unflatten as list of map objects using id, parentid, data attributes
Sub Unflatten(tdata As List, childname As String) As List
	'id, parentid, data
	Dim tree As List
	Dim mappedArr As Map
	'
	tree.Initialize
	mappedArr.Initialize
	'
	'create a temp map to hold everything with 'children' as 'data'
	For Each arrElem As Map In tdata
		Dim dID As String = arrElem.Get("id")
		'
		Dim cdata As List
		cdata.Initialize
		arrElem.Put(childname, cdata)
		'
		mappedArr.Put(dID, arrElem)
	Next
	'
	For Each dID As String In mappedArr.Keys
		Dim mappedElem As Map = mappedArr.Get(dID)
		Dim parentid As String = mappedElem.Get("parentid")
		' If the element is at the root level, add it to first level elements list.
		If parentid = "" Or parentid = "0" Then
			tree.Add(mappedElem)
		Else
			'If the element is not at the root level, add it to its parent list of children.
			Dim parentElem As Map = mappedArr.Get(parentid)
			Dim children As List = parentElem.Get(childname)
			children.Add(mappedElem)
			parentElem.Put(childname, children)
			mappedArr.Put(parentid, parentElem)
		End If
	Next
	'
	For Each mk As String In mappedArr.Keys
		Dim mi As Map = mappedArr.Get(mk)
		Dim childs As List = mi.Get(childname)
		If childs.Size = 0 Then mi.Remove(childname)
	Next
	Return tree
End Sub

public Sub readAsText(fr As Map) As BANanoPromise
	Dim promise As BANanoPromise 'ignore
		
	' calling a single upload
	promise.CallSub(Me, "ReadFile", Array(fr, "readAsText"))
	Return promise
End Sub

Sub readAsBinaryString(fr As Map) As BANanoPromise
	Dim promise As BANanoPromise 'ignore
		
	' calling a single upload
	promise.CallSub(Me, "ReadFile", Array(fr, "readAsBinaryString"))
	Return promise
End Sub

Sub readAsDataURL(fr As Map) As BANanoPromise
	Dim promise As BANanoPromise 'ignore
		
	' calling a single upload
	promise.CallSub(Me, "ReadFile", Array(fr, "readAsDataURL"))
	Return promise
End Sub

Sub readAsArrayBuffer(fr As Map) As BANanoPromise
	Dim promise As BANanoPromise 'ignore
		
	' calling a single upload
	promise.CallSub(Me, "ReadFile", Array(fr, "readAsArrayBuffer"))
	Return promise
End Sub

private Sub ReadFile(FileToRead As Object, MethodName As String)
	' make a filereader
	Dim FileReader As BANanoObject
	FileReader.Initialize2("FileReader", Null)
	' attach the file (to get the name later)
	FileReader.SetField("file", FileToRead)
	
	' make a callback for the onload event
	' an onload of a FileReader requires a 'event' param
	Dim event As Map
	FileReader.SetField("onload", BANano.CallBack(Me, "OnLoad", Array(event)))
	FileReader.SetField("onerror", BANano.CallBack(Me, "OnError", Array(event)))
	' start reading the DataURL
	FileReader.RunMethod(MethodName, FileToRead)
End Sub

private Sub OnLoad(event As Map) As String 'ignore
	' getting our file again (set in UploadFileAndGetDataURL)
	Dim FileReader As BANanoObject = event.Get("target")
	Dim UploadedFile As BANanoObject = FileReader.GetField("file")
	' return to the then of the UploadFileAndGetDataURL
	BANano.ReturnThen(CreateMap("name": UploadedFile.GetField("name"), "result": FileReader.Getfield("result")))
End Sub

private Sub OnError(event As Map) As String 'ignore
	Dim FileReader As BANanoObject = event.Get("target")
	Dim UploadedFile As BANanoObject = FileReader.GetField("file")
	Dim Abort As Boolean = False
	' uncomment this if you want to abort the whole operatio
	' Abort = true
	' FileReader.RunMethod("abort", Null)
	
	BANano.ReturnElse(CreateMap("name": UploadedFile.GetField("name"), "result": FileReader.GetField("error"), "abort": Abort))
End Sub

'
'join list to multi value string with a quote
Sub JoinItems(delimiter As String, sQuote As String, lst As List) As String
	If lst.Size = 0 Then Return ""
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = lst.Get(0)
	Dim xfld As String = $"${fld}"$
	xfld = sQuote & xfld & sQuote
	sb.Append(xfld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		Dim xfld As String = $"${fld}"$
		xfld = sQuote & xfld & sQuote
		sb.Append(delimiter).Append(xfld)
	Next
	Return sb.ToString
End Sub




'format the text
Sub FormatText(sText As String) As String
	Dim RM As Map
	RM.Initialize
	RM.clear
	RM.Put("{U}", "<ins>")
	RM.Put("{/U}", "</ins>")
	RM.Put("¢","&cent;")
	RM.put("£","&pound;")
	RM.Put("{SUP}", "<sup>")
	RM.Put("{/SUP}", "</sup>")
	RM.Put("¥","&yen;")
	RM.Put("€","&euro;")
	RM.put("©","&copy;")
	RM.Put("®","&reg;")
	RM.Put("{POUND}","&pound;")
	RM.Put("{/B}", "</b>")
	RM.Put("{I}", "<i>")
	RM.Put("{YEN}","&yen;")
	RM.Put("{EURO}","&euro;")
	RM.Put("{CODE}","<code>")
	RM.Put("{/CODE}","</code>")
	RM.put("{COPYRIGHT}","&copy;")
	RM.Put("{REGISTERED}","&reg;")
	RM.Put("®", "&reg;")
	RM.Put("{B}", "<b>")
	RM.Put("{SMALL}", "<small>")
	RM.Put("{/SMALL}", "</small>")
	RM.Put("{EM}", "<em>")
	RM.Put("{/EM}", "</em>")
	RM.Put("{MARK}", "<mark>")
	RM.Put("{/MARK}", "</mark>")
	RM.Put("{/I}", "</i>")
	RM.Put("{SUB}", "<sub>")
	RM.Put("{/SUB}", "</sub>")
	RM.Put("{BR}", "<br/>")
	RM.Put("{WBR}","<wbr>")
	RM.Put("{STRONG}", "<strong>")
	RM.Put("{/STRONG}", "</strong>")
	RM.Put("{NBSP}", "&nbsp;")
	RM.Put("“","")
	RM.Put("”","")
	RM.Put("’","'")
	Dim kTot As Int = RM.Size - 1
	Dim kCnt As Int
	For kCnt = 0 To kTot
		Dim strValue As String = RM.GetKeyAt(kCnt)
		Dim strRep As String = RM.Get(strValue)
		sText = sText.Replace(strValue, strRep)
	Next
	sText = BANano.SF(sText)
	Return sText
End Sub
'
Sub HideElement(elID As String)
	elID = elID.tolowercase
	Dim stylem As Map = CreateMap("visibility":"hidden")
	BANano.GetElement($"#${elID}"$).SetStyle(BANano.ToJson(stylem))
End Sub

Sub ShowElement(elID As String)
	Dim stylem As Map = CreateMap("visibility":"visible")
	BANano.GetElement($"#${elID}"$).SetStyle(BANano.ToJson(stylem))
End Sub

'Sub DateDiff(currentDate As String, otherDate As String) As Int
'	Dim dateS, dateE As BANanoObject
'	dateS.Initialize4("moment", currentDate)
'	dateE.Initialize4("moment", otherDate)
'	Return dateS.RunMethod("diff", Array(dateE, "days"))
'End Sub

Sub GetAlphaNumeric(value As String) As String
	value = CStr(value)
	Try
		value = value.Trim
		If value = "" Then value = ""
		Dim sout As String = ""
		Dim mout As String = ""
		Dim slen As Int = value.Length
		Dim i As Int = 0
		For i = 0 To slen - 1
			mout = value.CharAt(i)
			If InStr("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", mout) <> -1 Then
				sout = sout & mout
			End If
		Next
		Return sout
	Catch
		Return value
	End Try	
End Sub

Sub ListOfMap2Strings(lst As List) As List
	Dim nl As List
	nl = NewList
	For Each m As Map In lst
		Dim nm As Map = Map2Strings(m)
		nl.Add(nm)
	Next
	Return nl
End Sub


'ensure record meets the form requirements for display
Sub Map2Strings(m As Map) As Map
	Dim nm As Map = CreateMap()
	For Each k As String In m.keys
		Dim v As Object = m.get(k)
		If BANano.IsNull(v) Then v = ""
		If BANano.IsUndefined(v) Then v = ""
		Dim vv As String = CStr(v)
		nm.put(k, vv)
	Next
	Return nm
End Sub

'convert data type to field type
Sub DataType2FieldType(fldtype As String) As String
	fldtype = fldtype.ToUpperCase
	If fldtype.EqualsIgnoreCase("double") Then fldtype = "FLOAT"
	If fldtype.EqualsIgnoreCase("integer") Then fldtype = "INT"
	If fldtype.EqualsIgnoreCase("long") Then fldtype = "INT"
	If fldtype.EqualsIgnoreCase("short") Then fldtype = "INT"
	If fldtype.endswith("INT") Then fldtype = "INT"
	If fldtype.endswith("CHAR") Then fldtype = "TEXT"
	If fldtype.endswith("TEXT") Then fldtype = "TEXT"
	If fldtype.endswith("REAL") Then fldtype = "FLOAT"
	If fldtype.endswith("BIT") Then fldtype = "INT"
	'
	fldtype = fldtype.tolowercase
	fldtype = fldtype.replace("text", "string")
	fldtype = fldtype.replace("float", "dbl")
	fldtype = fldtype.replace("blob", "string")
	fldtype = fldtype.replace("none", "string")
	fldtype = fldtype.replace("varchar", "string")
	Return fldtype
End Sub


Sub MapRemovePrefix(m As Map) As Map
	Dim nm As Map = CreateMap()
	For Each k As String In m.keys
		Dim v As String = m.Get(k)
		k = MvField(k,2,"_")
		nm.Put(k, v)
	Next
	Return nm
End Sub


'set the background image style
Sub SetCoverImage(imgURL As String)
	Dim opt As Map = CreateMap()
	If imgURL = "none" Then
		opt.Put("background-image", "none")
	Else
		'opt.Put("background-image", $"url('${imgURL}')"$)
		'opt.Put("background-position", "center center")
		'opt.Put("background-repeat", "no-repeat")
		'opt.Put("background-attachment", "fixed")
		'opt.Put("background-size", "cover")
		
		opt.Put("background", $"url('${imgURL}')"$)
		opt.Put("position", "absolute")
		opt.Put("height", "100%")
		opt.Put("width", "100%")
		opt.Put("top", "0")
		opt.Put("bottom", "0")
		opt.Put("right", "0")
		opt.Put("left", "0")
		opt.Put("z-index", "0")
	End If
	Dim sjson As String = BANano.ToJson(opt)
	BANano.GetElement("#body").SetStyle(sjson)
End Sub