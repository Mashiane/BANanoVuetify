B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public Name As String = "skeletoncode"
	Public Title As String = "skeletoncode"
End Sub

Sub Code
	Log("modSkeleton.Code")
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(Name,Me)
	'hide this container
	cont.Hide
	'create 1 columns each spanning 12 columns
	cont.AddRows(2).AddColumns12
	
	'add container to the page content
	vm.AddContainer(cont)
End Sub