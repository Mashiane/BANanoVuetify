B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "page2code"
End Sub


Sub Code(vmx As BANanoVM)
	'the instance of view material
	vm = vmx
	'create a container to hold all contents for this page
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container, will be made available when we need
	cont.Hide
	'create the grid for the container in the page
	cont.AddRows(1).AddColumns2x6
	' create a H1 label
	Dim lbl As VMLabel = vm.CreateLABEL("lbl").SetText("This is page 2!").SetH1
	'create button
	Dim btn As VMButton = vm.CreateButton("btn1", Me).SetLabel("Page 1").SetAccent(True).SetRaised(True).SetToolTip("Go to Page 1")
	'add label to R1C1
	cont.AddComponent(1,1, lbl.ToString)
	'add button to r1c2
	cont.AddComponent(1,2, btn.ToString)
	
	'add this container to the contents of the page
	vm.AddHTML(cont.tostring)
End Sub

Sub btn1_click(e As BANanoEvent)
	vm.navbar.UpdateTitle("Navigation - Page 1")
	vm.ShowPage(modPage1.name)
	vm.Show("npage2")
	vm.Hide("npage1")
End Sub