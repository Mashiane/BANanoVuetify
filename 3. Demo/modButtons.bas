B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "buttonsCode"
	Public title As String = "Buttons"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(5).AddColumns(2, 12, 6, 6, 6)
	'
	vm.CreateButton("btn4", Me).SetLabel("Confirm").UseTheme("red-l-2").AddToContainer(cont, 1, 1)
	'
	vm.CreateButton("btnPrimary", Me).SetLabel("Alert").SetPrimary(True).AddToContainer(cont, 1, 2)
	vm.CreateButton("btnAccent", Me).SetLabel("Accent").SetAccent(True).AddToContainer(cont, 2, 1)
	'
	vm.CreateIconButton("btnx", Me, "mdi-heart").SetColor("pink").AddToContainer(cont, 2, 2)
	'
	vm.CreateFABButton("fab1", Me, "mdi-plus").SetColor("indigo").AddToContainer(cont, 3, 1)
	'
	vm.CreateFABButton("fab2", Me, "mdi-pencil").SetOutlined(True).SetLarge(True).SetColor("teal").AddToContainer(cont, 3, 2)
	'
	vm.CreateButton("tilex", Me).SetLabel("Tile Button").SetTile(True).SetColor("orange").AddToContainer(cont, 4, 1)
	'
	vm.CreateButton("blockx", Me).SetLabel("Block Button").SetBlock(True).SetColor("green").AddToContainer(cont, 4, 2)
	'
	vm.CreateButton("roundx", Me).SetLabel("Round Button").SetRounded(True).SetColor("yellow").AddToContainer(cont, 5, 1)
	'
	Dim sp1 As VMSpeedDial = vm.CreateSpeedDial("sp1", Me, "mdi-account-circle", "mdi-close")
	sp1.SetColorIntensity(vm.COLOR_BLUE, vm.INTENSITY_DARKEN2)
	sp1.SetDark(True)
	sp1.SetAbsolute(True)
	sp1.SetBottom(True)
	sp1.SetRight(True)
	sp1.SetOpenOnHover(True)
	sp1.AddItem("speededit", "mdi-pencil", "green")
	sp1.AddItem("speedaddit", "mdi-plus", "indigo")
	sp1.AddItem("speeddeleteit", "mdi-delete", "red")
	vm.AddSpeedDial(sp1)
	
	'add container to page
	vm.AddContainer(cont)
End Sub

Sub speededit_click(e As BANanoEvent)
	vm.ShowSnackBarSuccess("Speed edit")
End Sub

Sub speedaddit_click(e As BANanoEvent)
	vm.ShowSnackBarSuccess("Speed add it")
End Sub

Sub speeddeleteit_click(e As BANanoEvent)
	vm.ShowSnackBarSuccess("Speed delete it")
End Sub

Sub tilex_click(e As BANanoEvent)
	vm.ShowSnackBAr("clicked Tile")
End Sub


Sub fab2_click(e As BANanoEvent)
	vm.ShowSnackBAr("clicked fab2")
End Sub

Sub fab1_click(e As BANanoEvent)
	vm.ShowSnackBAr("clicked fab1")
End Sub


Sub btnAccent_click(e As BANanoEvent)
	vm.ShowSnackBAr("clicked accent")
End Sub

Sub btnPrimary_click(e As BANanoEvent)
	vm.ShowAlert("did_it", "TheMash", "This is my first alert!", "Cool")
End Sub

Sub btn4_click(e As BANanoEvent)
	vm.ShowConfirm("delete_user", "Confirm Delete", "Are you sure you want to delete this user?", "Yes", "No")
End Sub

Sub edit_click(e As BANanoEvent)
	vm.ShowSnackBar("Edit!")
End Sub


Sub addit_click(e As BANanoEvent)
	vm.ShowSnackBar("Add It!")
End Sub


Sub deleteit_click(e As BANanoEvent)
	vm.ShowSnackBar("Delete It!")
End Sub
