B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
Sub Class_Globals
	Private exp As VMExpansionPanels
	Public ID As String
	Private module As Object
	Private vue As BANanoVue
	Private DesignMode As Boolean
	Private controls As Map
	Private fields As List
	Private BANano As BANano 'ignore
	Private Booleans As List
	Private Strings As List
	Private Integers As List
	Private Doubles As List
	Private Dates As List
	Private defaults As Map
End Sub


Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMPropertyBag
	ID = sid.tolowercase
	module = eventHandler
	exp.Initialize(v, ID, eventHandler)
	DesignMode = False
	controls.initialize
	fields.initialize
	Booleans.initialize
	Strings.initialize
	Integers.initialize
	Doubles.initialize
	Dates.initialize
	defaults.initialize
	Return Me
End Sub

