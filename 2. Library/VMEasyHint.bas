B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private stepsm As Map
	Private BANano As BANano 'ignore
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize As VMEasyHint
	stepsm.Initialize
	Return Me
End Sub

'add a hint for the element
Sub AddStep(eID As String,eDescription As String) As VMEasyHint
	Dim eachstep As Map
	eachstep.Initialize
	eID = eID.tolowercase
	Dim sKey As String = $"next #${eID}"$
	eachstep.Put(sKey,eDescription)
	stepsm.Put(eID,eachstep)
	Return Me
End Sub

Sub AddGijgoTable(tblID As String, eDescription As String) As VMEasyHint
	AddStep($"${tblID}tblbar"$, eDescription)
	Return Me
End Sub

Sub AddRadio(tblID As String, eDescription As String) As VMEasyHint
	AddStep($"${tblID}label"$, eDescription)
	Return Me
End Sub

Sub AddDatePicker(tblID As String, eDescription As String) As VMEasyHint
	AddStep($"${tblID}"$, eDescription)
	Return Me
End Sub

Sub AddTimePicker(tblID As String, eDescription As String) As VMEasyHint
	AddStep($"${tblID}field"$, eDescription)
	Return Me
End Sub


Sub AddCheckBox(tblID As String, eDescription As String) As VMEasyHint
	AddStep($"${tblID}field"$, eDescription)
	Return Me
End Sub

Sub AddSwitch(tblID As String, eDescription As String) As VMEasyHint
	AddStep($"${tblID}field"$, eDescription)
	Return Me
End Sub


Sub AddSlider(tblID As String, eDescription As String) As VMEasyHint
	AddStep($"${tblID}field"$, eDescription)
	Return Me
End Sub


Sub AddSelect(tblID As String, eDescription As String) As VMEasyHint
	AddStep($"${tblID}field"$, eDescription)
	Return Me
End Sub

Sub AddInput(tblID As String, eDescription As String) As VMEasyHint
	AddStep($"${tblID}field"$, eDescription)
	Return Me
End Sub

Sub EndsOnDatePicker(tblID As String) As VMEasyHint
	EndsOn($"${tblID}"$)
	Return Me
End Sub


Sub EndsOnTimePicker(tblID As String) As VMEasyHint
	EndsOn($"${tblID}field"$)
	Return Me
End Sub

Sub EndsOnSelect(tblID As String) As VMEasyHint
	EndsOn($"${tblID}field"$)
	Return Me
End Sub


Sub EndsOnInput(tblID As String) As VMEasyHint
	EndsOn($"${tblID}field"$)
	Return Me
End Sub

Sub EndsOnSlider(tblID As String) As VMEasyHint
	EndsOn($"${tblID}field"$)
	Return Me
End Sub

Sub EndsOnCheckBox(tblID As String) As VMEasyHint
	EndsOn($"${tblID}field"$)
	Return Me
End Sub


Sub EndsOnRadio(tblID As String) As VMEasyHint
	EndsOn($"${tblID}label"$)
	Return Me
End Sub

Sub EndsOnGijgo(tblID As String) As VMEasyHint
	EndsOn($"${tblID}tblbar"$)
	Return Me
End Sub

'add a hint for the element that runs on click
Sub AddClick(eID As String,eDescription As String) As VMEasyHint
	Dim eachstep As Map
	eachstep.Initialize
	eID = eID.tolowercase
	Dim sKey As String = $"click #${eID}"$
	eachstep.Put(sKey,eDescription)
	stepsm.Put(eID,eachstep)
	Return Me
End Sub

'add a hint to the element that runs when ENTER is pressed
Sub AddKeyPress(eID As String,eDescription As String) As VMEasyHint
	Dim eachstep As Map
	eachstep.Initialize
	eID = eID.tolowercase
	Dim sKey As String = $"key #${eID}"$
	eachstep.Put(sKey,eDescription)
	eachstep.Put("keyCode", "13")
	stepsm.Put(eID,eachstep)
	Return Me
End Sub

'indicate the ending element of the running hints
Sub EndsOn(eID As String)
	eID = eID.tolowercase
	HideSkip(eID)
	SetNextButton(eID,"Got it!")
End Sub

'hide skip for an element
Sub HideSkip(eID As String) As VMEasyHint
	eID = eID.tolowercase
	Dim rec As Map
	If stepsm.ContainsKey(eID) Then
		rec = stepsm.Get(eID)
		rec.Put("showSkip", False)
		stepsm.Put(eID,rec)
	End If
	Return Me
End Sub

'hide next step for an element
Sub HideNext(eID As String) As VMEasyHint
	eID = eID.tolowercase
	Dim rec As Map
	If stepsm.ContainsKey(eID) Then
		rec = stepsm.Get(eID)
		rec.Put("showNext", False)
		stepsm.Put(eID,rec)
	End If
	Return Me
End Sub

'set the next item text for the element
Sub SetNextButton(eID As String, Text As String) As VMEasyHint
	eID = eID.tolowercase
	Dim rec As Map
	If stepsm.ContainsKey(eID) Then
		rec = stepsm.Get(eID)
		Dim sb As Map = CreateMap("className":"myNext","text":Text)
		rec.Put("nextButton",sb)
		stepsm.Put(eID,rec)
	End If
	Return Me
End Sub

'set the skip button text for the element
Sub SetSkipButton(eID As String, Text As String) As VMEasyHint
	eID = eID.tolowercase
	Dim rec As Map
	If stepsm.ContainsKey(eID) Then
		rec = stepsm.Get(eID)
		Dim sb As Map = CreateMap("className":"mySkip","text":Text)
		rec.Put("skipButton",sb)
		stepsm.Put(eID,rec)
	End If
	Return Me
End Sub

'set an element to show a circle hint
Sub SetCircle(eID As String, radius As Int) As VMEasyHint
	eID = eID.tolowercase
	Dim rec As Map
	If stepsm.ContainsKey(eID) Then
		rec = stepsm.Get(eID)
		rec.Put("shape","circle")
		If radius > 0 Then rec.Put("radius", radius)
		stepsm.Put(eID,rec)
	End If
	Return Me
End Sub

'run the hints
Sub Run
	'build the steps
	Dim enjoyhint_script_steps As List
	enjoyhint_script_steps.Initialize
	For Each stepm As Map In stepsm.Values
		enjoyhint_script_steps.Add(stepm)
	Next
	'create the object
	Dim easySteps_instance As BANanoObject
	easySteps_instance.Initialize2("EnjoyHint",Null)
	easySteps_instance.RunMethod("set",Array(enjoyhint_script_steps))
	easySteps_instance.RunMethod("run",Null)
End Sub