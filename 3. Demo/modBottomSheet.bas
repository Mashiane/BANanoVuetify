B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "bottomSheetCode"
	Public title As String = "Bottom Sheet"
	Private vm As BANanoVM
	Private bs1 As VMBottomSheet
	Private bs2 As VMBottomSheet
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(10).AddColumns2x6
	vm.CreateButton("btnSheet", Me).SetLabel("Show Persistent Sheet").AddToContainer(cont, 1, 1)
	vm.CreateButton("btnInset", Me).SetLabel("Show Inset").AddToContainer(cont, 1, 2)
	vm.AddContainer(cont)
	
	bs1 = vm.CreateBottomSheet("bs1", Me).SetPersistent(True)
	'
	Dim s1 As VMSheet = vm.CreateSheet("s1", Me).SetTextCenter.SetHeight("200px")
	s1.Container.AddRows(1).AddColumns12
	'
	Dim lbl As VMLabel = vm.CreateLabel("lblme").SetText("This is a bottom sheet using persistent prop!").SetParagraph
	s1.Container.AddComponent(1, 1, lbl.ToString)
	'
	Dim btnClose As VMButton = vm.CreateButton("btnCloseSheet", Me).SetLabel("Close Sheet")
	s1.Container.AddComponent(1, 1, btnClose.ToString)
	'
	bs1.AddComponent(s1.ToString)
	'
	bs2 = vm.CreateBottomSheet("bs2", Me).SetInset(True)
	Dim s As VMSheet = vm.CreateSheet("s2", Me).SetTextCenter.SetHeight("200px")
	'
	s.Container.AddRows(1).AddColumns12
	'
	Dim lbl As VMLabel = vm.CreateLabel("lbl2").SetText("This is a bottom sheet using inset prop!").SetParagraph
	s.Container.AddComponent(1, 1, lbl.ToString)
	'
	Dim btnClose As VMButton = vm.CreateButton("btnCloseSheet2", Me).SetLabel("Close Sheet")
	s.Container.AddComponent(1, 1, btnClose.ToString)
	'
	bs2.AddComponent(s.ToString)
	
	'
	vm.AddBottomSheet(bs1)
	vm.AddBottomSheet(bs2)
End Sub

Sub btnCloseSheet2_click(e As BANanoEvent)
	bs2.hide
End Sub

Sub btnInset_click(e As BANanoEvent)
	bs2.show
End Sub

Sub btnSheet_click(e As BANanoEvent)
	bs1.show
End Sub

Sub btnCloseSheet_click(e As BANanoEvent)
	bs1.hide
End Sub