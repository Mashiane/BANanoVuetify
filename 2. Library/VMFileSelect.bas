B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Public FileSelect As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the FileSelect
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMFileSelect
	ID = sid.tolowercase
	FileSelect.Initialize(v, ID)
	FileSelect.SetTag("input")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return FileSelect.ToString
End Sub

Sub SetVModel(k As String) As VMFileSelect
	FileSelect.SetVModel(k)
	Return Me
End Sub

'set tab index
Sub SetAction(ti As String) As VMFileSelect
	Return Me
End Sub