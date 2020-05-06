B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "skeletonCode"
	Public title As String = "Skeleton Loaders"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(4).AddColumns2X6
	'
	Dim s1 As VMSheet = vm.createsheet("sheet1", Me).AddClass("px-3 pt-3 pb-3")
	'
	Dim skl As VMSkeletonLoader = vm.CreateSkeletonLoader("sl1", Me).AddClass("mx-auto").SetMaxWidth("300").SetType("card")
	'
	s1.AddComponent(skl.tostring)
	'
	cont.AddComponent(1, 1, s1.tostring)
	
	'add container to page
	vm.AddContainer(cont)
End Sub
