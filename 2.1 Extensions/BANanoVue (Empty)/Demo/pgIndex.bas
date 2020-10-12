B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.31
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Private BANano As BANano
	Private MyApp As VueApp
	Private btnIncrement As VHTML
End Sub

Sub Init
	BANano.LoadLayout("#body", "testlayout")
	'initialize the vue instance, we will render it to #app div element
	MyApp.Initialize(Me, "#app", "#body")	
	'test global state
	MyApp.SetData("count", 0)
	'add the method
	MyApp.SetMethod(Me, "increment")
	
	'serve the webapp
	MyApp.Serve
	'
	Log(MyApp.Template)
	
End Sub

'define the callback
Sub increment
	'get the value of the coun
	Dim cc As Int = MyApp.GetData("count")
	cc = BANano.parseInt(cc)
	'increment by 1
	cc = cc + 1
	'save back to state
	MyApp.SetData("count", cc)
End Sub

Sub btnIncrement_Click (event As BANanoEvent)
	MyApp.CallMethod("increment")
End Sub