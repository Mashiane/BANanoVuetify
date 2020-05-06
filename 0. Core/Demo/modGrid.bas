B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "introCode"
	Public title As String = "Grid"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(1).AddColumns12
	cont.SetBorderRC(1,1, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.AddLabel(1, 1, "", "p", "R1C1")
	'
	cont.AddRows(1).AddColumns11p1
	cont.SetBorderRC(2,1, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.SetBorderRC(2,2, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.AddLabel(2, 1, "", "p", "R2C1")
	cont.AddLabel(2, 2, "", "p", "R2C2")
	'
	cont.AddRows(1).AddColumns10p2
	cont.SetBorderRC(3,1, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.SetBorderRC(3,2, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.AddLabel(3, 1, "", "p", "R3C1")
	cont.AddLabel(3, 2, "", "p", "R3C2")
	
	'
	cont.AddRows(1).AddColumns9p3
	cont.SetBorderRC(4,1, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.SetBorderRC(4,2, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.AddLabel(4, 1, "", "p", "R4C1")
	cont.AddLabel(4, 2, "", "p", "R4C2")
	
	cont.AddRows(1).AddColumns8p4
	cont.SetBorderRC(5,1, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.SetBorderRC(5,2, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.AddLabel(5, 1, "", "p", "R5C1")
	cont.AddLabel(5, 2, "", "p", "R5C2")
	
	'
	cont.AddRows(1).AddColumns7p5
	cont.SetBorderRC(6,1, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.SetBorderRC(6,2, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.AddLabel(6, 1, "", "p", "R6C1")
	cont.AddLabel(6, 2, "", "p", "R6C2")
	
	cont.AddRows(1).AddColumns2x6
	cont.SetBorderRC(7,1, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.SetBorderRC(7,2, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.AddLabel(7, 1, "", "p", "R8C1")
	cont.AddLabel(7, 2, "", "p", "R8C2")
	
	'
	cont.AddRows(1).AddColumns5p7
	cont.SetBorderRC(8,1, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.SetBorderRC(8,2, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.AddLabel(8, 1, "", "p", "R8C1")
	cont.AddLabel(8, 2, "", "p", "R8C2")
	
	
	cont.AddRows(1).AddColumns4p8
	cont.SetBorderRC(9,1, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.SetBorderRC(9,2, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.AddLabel(9, 1, "", "p", "R9C1")
	cont.AddLabel(9, 2, "", "p", "R9C2")
	
	
	cont.AddRows(1).AddColumns3p9
	cont.SetBorderRC(10,1, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.SetBorderRC(10,2, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.AddLabel(10, 1, "", "p", "R10C1")
	cont.AddLabel(10, 2, "", "p", "R10C2")
	
	'
	cont.AddRows(1).AddColumns2p10
	cont.SetBorderRC(11,1, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.SetBorderRC(11,2, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.AddLabel(11, 1, "", "p", "R11C1")
	cont.AddLabel(11, 2, "", "p", "R11C2")
	
	'
	cont.AddRows(1).AddColumns1p11
	cont.SetBorderRC(12,1, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.SetBorderRC(12,2, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.AddLabel(12, 1, "", "p", "R12C1")
	cont.AddLabel(12, 2, "", "p", "R12C2")
	
	'
	'
	'2 plus 8 plus 2 = 12
	cont.AddRows(1).AddColumns(1,2,2,2,2).AddColumns(1,8,8,8,8).AddColumns(1,2,2,2,2)
	cont.SetBorderRC(13,1, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.SetBorderRC(13,2, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.SetBorderRC(13,3, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	cont.AddLabel(13, 1, "", "p", "R13C1")
	cont.AddLabel(13, 2, "", "p", "R13C2")
	cont.AddLabel(13, 3, "", "p", "R13C3")
	
	'add container to page
	vm.AddContainer(cont)
End Sub


