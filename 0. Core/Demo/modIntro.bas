B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "introCode"
	Public title As String = "Intro"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(1).AddColumns(2, 12, 6, 6, 6)
	cont.AddRows(1).AddColumns12x1
	cont.AddRows(20).AddColumns12x1
	cont.SetAttrRC(2,0, "justify", "space-around")
	
	cont.AddLabel(1, 1, "lbl1", "p", "R1.C1")
	cont.AddLabel(1, 2, "lbl1", "p", "R1.C2")
	'
	cont.SetBorderRC(1,2, "1px", vm.vue.COLOR_BLUE, vm.vue.BORDER_DASHED)
	'*** ICONS
	Dim icon As VMIcon = vm.CreateIcon("icon1", Me, "home")
	cont.AddComponent(2, 1, icon.ToString)
	'
	Dim icon2 As VMIcon = vm.CreateIcon("icon2", Me, "add").SetColor("red").SetLarge(True)
	'
	cont.AddComponent(2, 2, icon2.ToString)
	'
	Dim icon3 As VMIcon = vm.CreateIcon("icon3", Me, "mdi-email").SetColor("teal").SetXLarge(True)
	'
	cont.AddComponent(2, 3, icon3.ToString)
	'*** BUTTONS
	'
	Dim btn4 As VMButton = vm.CreateButton("btn4", Me, "Done").UseTheme("red-l-2")
	cont.AddComponent(2, 5, btn4.ToString)
	'
	Dim btnPrimary As VMButton = vm.CreateButton("btnPrimary", Me, "Primary").SetPrimary(True)
	Dim btnAccent As VMButton = vm.CreateButton("btnAccent", Me, "Accent").SetAccent(True)
	'
	cont.AddComponent(3, 10, btnPrimary.tostring)
	cont.AddComponent(3, 12, btnAccent.ToString)
	'
	vm.CreateIconButton("btnx", Me, "mdi-heart").SetColor("pink").AddToContainer(cont, 4, 1)
	'
	vm.CreateFABButton("fab1", Me, "mdi-plus").SetColor("indigo").AddToContainer(cont, 4, 2)
	'
	vm.CreateFABButton("fab2", Me, "mdi-pencil").SetOutlined(True).SetLarge(True).SetColor("teal").AddToContainer(cont, 4, 3)
	'
	vm.CreateButton("tilex", Me, "Tile Button").SetTile(True).SetColor("orange").AddToContainer(cont, 4, 6)
	'
	vm.CreateButton("blockx", Me, "Block Button").SetBlock(True).SetColor("green").AddToContainer(cont, 4, 8)
	'
	vm.CreateButton("roundx", Me, "Round Button").SetRounded(True).SetColor("yellow").AddToContainer(cont, 4, 10)
	
	
	'add container to page
	vm.AddContainer(cont)
End Sub


