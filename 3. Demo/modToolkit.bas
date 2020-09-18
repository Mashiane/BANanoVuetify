B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "toolkitCode"
	Public title As String = "Toolkit"
	Private vm As BANanoVM
	Private tv As VMTreeView
	Private BANano As BANano  'ignore
	Private vue As BANanoVue
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(10).AddColumns12
	
	'add container to page
	vm.AddContainer(cont)
End Sub

Sub Show
End Sub