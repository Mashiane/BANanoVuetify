B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Private BANano As BANano
	Private MyApp As VueApp
	Private zircle As BANanoObject
End Sub

Sub Init
	BANano.LoadLayout("#body", "pagezircle")
	'initialize the vue instance, we will render it to #app div element
	MyApp.Initialize(Me, "#app", "#body")
	'
	zircle.Initialize("zircle")
	Log(zircle)
	
	'serve the webapp
	MyApp.Serve
	'
	Log(MyApp.Template)
	
End Sub
