B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private Lines As List
	Private indent As Int = 0
	Private linePos As Int
	Private strActual As String
	Private strTemp As String
	Private SelStart As Boolean
	Public SubRoutines As Map
	Private SubStart As Int
	Private SubEnd As Int
	Private SubName As String
	Private SubDeclaration As String
	Private SubCode As String
	Private strCode As String
	Private fName As String
	Private BANano As BANano
End Sub


'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sDir As String, sPath As String)
	Log("Initialize...")
	SubRoutines.initialize
	fName = File.combine(sDir, sPath)
	'get the code lines
	Lines = File.ReadList("", fName)
	'trim the code lines
	Code_TrimLines
	'remove blank lines
	Code_RemoveLines("", True)
	'how many line continuations do we have
	Dim lc As Long = Code_CountLineContinuation
	If lc > 0 Then Code_RemoveLineContinuation
	Code_Scan
	Log(SubRoutines)
End Sub


private Sub SortMap(m As Map) As Map
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
End Sub

private Sub Join(lst As List, Delim As String) As String
	Dim lTot As Int
	Dim lCnt As Int
	Dim lStr As StringBuilder
	lStr.Initialize
	lTot = lst.Size - 1
	For lCnt = 0 To lTot
		lStr.Append(lst.Get(lCnt))
		If lCnt <> lTot Then lStr.Append(Delim)
	Next
	Return lStr.tostring
End Sub
	
public Sub Code_Arguements(strDeclaration As String) As String
	If ConfirmSub(strDeclaration) Or ConfirmPublicSub(strDeclaration) Or ConfirmPrivateSub(strDeclaration) Then
		Dim fBracket As Long
		Dim sBracket As Long
		Dim line As String
		'first first bracket
		fBracket = StrInStr(strDeclaration, "(")
		'find last bracket
		sBracket = StrInStrRev(strDeclaration, ")")
		If fBracket = -1 Or sBracket = 0 Then Return ""
		Select Case sBracket
			Case fBracket + 1
				Return ""
			Case Else
				line = StrMid2(strDeclaration, fBracket + 1, (sBracket - fBracket - 1))
				Return line
		End Select
	Else
		Return ""
	End If
End Sub

private Sub ConfirmPublicSub(Tempstring As String) As Boolean
	Tempstring = Tempstring.Trim.tolowercase
	Dim tLen As Int = StrLen(Tempstring)
	If tLen < 10 Then
		Return False
	else if tLen = 10 Then
		If StrLeft(Tempstring, 10) = "public sub" Then Return True
	else if tLen > 10 Then
		If StrLeft(Tempstring, 11) = "public sub " Then Return True
	End If
	Return False
End Sub
	
private Sub ConfirmSub(Tempstring As String) As Boolean
	Tempstring = Tempstring.Trim.tolowercase
	Dim tLen As Int = StrLen(Tempstring)
	If tLen < 3 Then
		Return False
	else if tLen = 3 Then
		If StrLeft(Tempstring, 3) = "sub" Then Return True
	else if tLen > 3 Then
		If StrLeft(Tempstring, 4) = "sub " Then Return True
	End If
	Return False
End Sub

private Sub ConfirmPrivateSub(Tempstring As String) As Boolean
	Tempstring = Tempstring.Trim.tolowercase
	Dim tLen As Int = StrLen(Tempstring)
	If tLen < 10 Then
		Return False
	else if tLen = 10 Then
		If StrLeft(Tempstring, 11) = "private sub" Then Return True
	else if tLen > 10 Then
		If StrLeft(Tempstring, 12) = "private sub " Then Return True
	End If
	Return False
End Sub

private Sub ConfirmEndSub(Tempstring As String) As Boolean
	Tempstring = Tempstring.Trim.tolowercase
	Dim tLen As Int = StrLen(Tempstring)
	If tLen < 7 Then
		Return False
	else if tLen = 7 Then
		If StrLeft(Tempstring, 7) = "end sub" Then Return True
	End If
	Return False
End Sub

Sub Code_Scan
	Log("Code_Scan...")
	Dim fileTot As Long = Lines.Size - 1
	For linePos = 0 To fileTot
		strActual = Lines.Get(linePos)
		strTemp = strActual.Trim.tolowercase
		If strTemp.EndsWith("end sub") Then
			SubEnd = linePos
			SubCode = Code_GetBetween(SubStart,SubEnd)
			SubRoutines.Put(SubName,SubCode)
		End If
		If strTemp.StartsWith("sub ") Or strTemp.StartsWith("public sub ") Or strTemp.StartsWith("private sub ") Then
			SubStart = linePos
			SubName = Code_GetSubName(strActual,False)
			SubRoutines.Put(SubName,"")
		End If
	Next
End Sub

public Sub Code_CleanArguements(strArgue As String) As String
	If strArgue.Length = 0 Then
		Return ""
	End If
	Dim lst As List
	lst.Initialize
	Dim spArgue() As String = BANano.Split(",", strArgue)
	For Each strLine As String In spArgue
		strLine = strLine.trim
		Dim proptype As String = MvField(strLine,3," ")
		Dim propname As String = MvField(strLine,1," ")
		proptype = proptype.Trim
		propname = propname.trim
		lst.Add(propname)
	Next
	Dim str As String = Join(lst, ",")
	Return str
End Sub

'remove lines containing a string
private Sub Code_RemoveLines(StrSearch As String, ExactMatch As Boolean)
	Log("Code_RemoveLines...")
	Dim nLines As List
	nLines.Initialize
	Dim totLines As Long
	Dim cntLines As Long
	Dim curLine As String
	totLines = Lines.size - 1
	For cntLines = 0 To totLines
		curLine = Lines.Get(cntLines)
		If ExactMatch = True Then
			If StrLCase(StrSearch) = StrLCase(curLine) Then
			Else
				nLines.Add(curLine)
			End If
		Else
			If StrInStr(StrLCase(curLine), StrLCase(StrSearch)) > 0 Then
			Else
				nLines.Add(curLine)
			End If
		End If
	Next
	Lines = nLines
End Sub


private Sub Code_CountLineContinuation() As Long
	Log("Code_CountLineContinuation...")
	Private totLines As Long
	Private cntLines As Long
	Private curLine As String
	Private LC As Long = 0
	totLines = Lines.Size - 1
	For cntLines = totLines To 0 Step -1
		curLine = Lines.Get(cntLines)
		curLine = curLine.Trim
		If StrRight(curLine,1) = "_" Then
			LC = LC + 1
		End If
	Next
	Return LC
End Sub


private Sub Code_RemoveLineContinuation()
	Log("Code_RemoveLineContinuation...")
	Dim tLines As Long
	Dim tCount As Long
	Dim currLine As String
	Dim NextLine As String
	tLines = Lines.Size - 2
	For tCount = 0 To tLines
		currLine = Lines.Get(tCount)
		NextLine = Lines.Get(tCount + 1)
		If StrRight(currLine, 1) = "_" Then
			If StrLen(currLine) + StrLen(NextLine) < 255 Then
				currLine = StrLeft(currLine, StrLen(currLine-1)) & " " & NextLine
				Lines.Set(tCount,currLine)
				Lines.Set(tCount + 1,"")
			End If
		End If
	Next
End Sub

'trim all lines in this file
private Sub Code_TrimLines
	Log("Code_TrimLines...")
	Dim totLines As Long
	Dim cntLines As Long
	Dim curLine As String
	totLines = Lines.Size - 1
	For cntLines = 0 To totLines
		curLine = Lines.get(cntLines)
		curLine = StrTrim(curLine)
		Lines.Set(cntLines, curLine)
	Next
End Sub


'return the position of a string found in a string
private Sub StrInStr(Text As String, sFind As String) As Int
	Return Text.tolowercase.IndexOf(sFind.tolowercase) + 1
End Sub

private Sub StrMid2(Text As String, Start As Int, Length As Int) As String
	Return Text.SubString2(Start-1,Start+Length-1)
End Sub

private Sub StrMid(Text As String, Start As Int) As String
	Return Text.SubString(Start-1)
End Sub

private Sub StrRight(Text As String, Length As Long) As String
	If Length>Text.Length Then Length=Text.Length
	Return Text.SubString(Text.Length-Length)
End Sub

private Sub StrLeft(Text As String, lLength As Long)As String
	If lLength>Text.Length Then lLength=Text.Length
	Return Text.SubString2(0, lLength)
End Sub

' return length of a string
private Sub StrLen(Text As String) As Long
	Return Text.Length
End Sub


'trim a string
private Sub StrTrim(strValue As String) As String
	Return strValue.trim
End Sub

'lowercase a string
private Sub StrLCase(Text As String) As String
	Return Text.ToLowerCase
End Sub


private Sub Code_GetBetween(intStart As Int, intEnd As Int) As String
	Log("Code_GetBetween...")
	Dim sb As StringBuilder
	sb.Initialize
	For iStart = intStart To intEnd
		sb.Append(Lines.Get(iStart)).Append(CRLF)
	Next
	Return sb.tostring
End Sub

private Sub Code_GetSubName(strDeclaration As String, bIncludeBrackets As Boolean) As String
	Log("Code_GetSubName...")
	Dim fBracket As Int
	Dim sBracket As Int
	Dim sResult As String
	strDeclaration = strDeclaration.trim
	fBracket = StrInStr(strDeclaration, "(")
	sBracket = StrInStrRev(strDeclaration, ")")
	If fBracket > 0 Then
		sResult = StrLeft(strDeclaration, fBracket - 1)
	Else
		sResult = strDeclaration
	End If
	If bIncludeBrackets = True Then
		sResult = sResult & "()"
	End If
	If sBracket > 0 Then
		sResult = sResult & StrMid(strDeclaration, sBracket + 1)
	End If
	If sResult.tolowercase.StartsWith("sub ") Then
		sResult = StrMid(sResult,5)
		sResult = sResult.trim
	else if sResult.tolowercase.StartsWith("private sub ") Then
		sResult = StrMid(sResult,13)
	else if sResult.tolowercase.StartsWith("public sub ") Then
		sResult = StrMid(sResult,12)
	End If
	sResult = sResult.trim
	sResult = MvField(sResult,1," ")
	Return sResult
End Sub

private Sub StrInStrRev(value As String, search As String) As Long
	Return value.tolowercase.LastIndexOf(search.tolowercase) + 1
End Sub


Sub MvField(sValue As String, iPosition As Int, Delimiter As String) As String
	If sValue.Length = 0 Then Return ""
	Dim xPos As Int: xPos = sValue.IndexOf(Delimiter)
	If xPos = -1 Then Return sValue
	Dim mValues() As String
	Dim tValues As Int
	If sValue.EndsWith(Delimiter) Then sValue = sValue & " "
	mValues = BANano.Split(Delimiter, sValue)
	tValues = mValues.Length -1
	Select Case iPosition
		Case -1
			Return mValues(tValues)
		Case -2
			Return mValues(tValues - 1)
		Case -3
			Dim sbl As StringBuilder
			sbl.Initialize
			Dim startcnt As Int
			For startcnt = 1 To tValues
				sbl.Append(mValues(startcnt)).append(Delimiter)
			Next
			sbl.Remove(sbl.Length - Delimiter.Length, sbl.Length)
			Return sbl.tostring
		Case Else
			iPosition = iPosition - 1
			If iPosition <= -1 Then Return mValues(tValues)
			If iPosition > tValues Then Return ""
			Return mValues(iPosition)
	End Select
End Sub

private Sub Code_GetDeclaration(decl As String) As String
	decl = decl.Replace("Public ","")
	decl = decl.Replace("Private ","")
	decl = decl.Replace("public ","")
	decl = decl.Replace("private ","")
	decl = decl.Replace("sub ","")
	decl = decl.Replace("Sub ","")
	decl = decl.Trim
	Return decl
End Sub

private Sub Code_CommentStrip(Tempstring As String) As String
	Dim iSingQuote As Int
	Dim iQUOTE As Int
	If Tempstring.Contains("'") Then
		iSingQuote = Tempstring.LastIndexOf("'")
		Do While iSingQuote > 0
			iSingQuote = Tempstring.LastIndexOf("'")
			iQUOTE = Tempstring.LastIndexOf(QUOTE)
			If iSingQuote > iQUOTE Then
				Tempstring = Tempstring.SubString2(0, Tempstring.LastIndexOf("'"))
				Tempstring = Tempstring.Trim
			Else
				Exit
			End If
		Loop
		Return Tempstring
	Else
		Return Tempstring
	End If
End Sub