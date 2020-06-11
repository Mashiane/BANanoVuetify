B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "bottomNavCode"
	Public title As String = "Bottom Navigation"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'
	vm.BottomNav.Hide
	vm.BottomNav.SetVModel("botnav")
	vm.BottomNav.SetAbsolute(True)
	vm.BottomNav.SetGrow(True)
	vm.BottomNav.SetHeight("56")
	vm.BottomNav.SetShift(True)
	'add items
	vm.BottomNav.AddButton("btnaz", "Banner", "dashboard", "red", "btnaz", "A business banner", "")
	vm.BottomNav.AddButton("btnbz", "Squirrel", "account_box", "indigo", "btnbz", "Another squirrel", "")
	vm.BottomNav.AddButton("btncz", "Sky", "gavel", "green", "btncz", "Heavens", "")
	vm.BottomNav.AddButton("btndz", "Planet", "question_answer", "purple", "btndz", "Planets of the world", "")
	vm.BottomNav.AddButton("btnez", "Bird", "mdi-account", "yellow", "btnez", "This is a beautiful bird", "")
	'
	vm.AddContainer(cont)
End Sub
