B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "chipsCode"
	Public title As String = "Chips"
	Private vm As BANanoVM
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
	cont.AddRows(5).AddColumns12
	'
	Dim chipsx As VMContainer = vm.CreateContainer("chips", Me).SetTextCenter
		
	vm.CreateChip("c1", Me).AddClass("ma-2").SetText("Default").AddToContainer(chipsx, 0 , 0)
	vm.CreateChip("c2", Me).AddClass("ma-2").SetText("Primary").SetColor("primary").AddToContainer(chipsx, 0 , 0)
	vm.CreateChip("c3", Me).AddClass("ma-2").SetText("Secondary").SetColor("secondary").AddToContainer(chipsx, 0 , 0)
	vm.CreateChip("c4", Me).AddClass("ma-2").SetText("Red Chip").SetTextColor("white").SetColor("red").AddToContainer(chipsx, 0 , 0)
	vm.CreateChip("c5", Me).AddClass("ma-2").SetText("Green Chip").SetTextColor("white").SetColor("green").AddToContainer(chipsx, 0 , 0)
	'
	vm.createchip("c6", Me).AddClass("ma-2").SetColor(vm.COLOR_INDIGO).SetTextColor(vm.COLOR_WHITE).SetIcon("mdi-account-circle", "left").SetText("Ranee").AddToContainer(chipsx, 0, 0)
	vm.createchip("c7", Me).AddClass("ma-2").SetColor(vm.COLOR_INDIGO).SetTextColor(vm.COLOR_WHITE).SetText("Premium").SetIcon("mdi-star", "right").AddToContainer(chipsx, 0, 0)
	vm.createchip("c8", Me).AddClass("ma-2").SetColor(vm.COLOR_TEAL).SetTextColor(vm.COLOR_WHITE).SetIcon("mdi-checkbox-marked-circle", "left").SetText("Confirm").SetClose(True).AddToContainer(chipsx, 0, 0)
	vm.createchip("c9", Me).AddClass("ma-2").SetColor(vm.COLOR_TEAL).SetCloseIcon("mdi-delete").SetTextColor(vm.COLOR_WHITE).SetIcon("mdi-checkbox-marked-circle", "left").SetText("TheMash").SetClose(True).AddToContainer(chipsx, 0, 0)
	vm.createchip("c10", Me).AddClass("ma-2").SetColor("success").SetIcon("mdi-server-plus", "left").SetOutlined(True).SetText("Server Status").AddToContainer(chipsx, 0, 0)
	vm.createchip("c11", Me).AddClass("ma-2").SetColor(vm.COLOR_PINK).SetTextColor(vm.COLOR_WHITE).SetIcon("mdi-label", "left").SetLabel(True).SetText("Tags").AddToContainer(chipsx, 0, 0)
	vm.createchip("c12", Me).AddClass("ma-2").SetColor(vm.COLOR_RED).SetTextColor(vm.COLOR_WHITE).SetText("Remove").SetClose(True).AddToContainer(chipsx, 0, 0)
	
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"vm.CreateChip("c1", Me).AddClass("ma-2").SetText("Default").AddToContainer(chipsx, 0 , 0)"$)
vue.AddCode($"vm.CreateChip("c2", Me).AddClass("ma-2").SetText("Primary").SetColor("primary").AddToContainer(chipsx, 0 , 0)"$)
vue.AddCode($"vm.CreateChip("c3", Me).AddClass("ma-2").SetText("Secondary").SetColor("secondary").AddToContainer(chipsx, 0 , 0)"$)
vue.AddCode($"vm.CreateChip("c4", Me).AddClass("ma-2").SetText("Red Chip").SetTextColor("white").SetColor("red").AddToContainer(chipsx, 0 , 0)"$)
vue.AddCode($"vm.CreateChip("c5", Me).AddClass("ma-2").SetText("Green Chip").SetTextColor("white").SetColor("green").AddToContainer(chipsx, 0 , 0)"$)
vue.AddCode($"'"$)
vue.AddCode($"vm.createchip("c6", Me).AddClass("ma-2").SetColor(vm.COLOR_INDIGO).SetTextColor(vm.COLOR_WHITE).SetIcon("mdi-account-circle", "left").SetText("Ranee").AddToContainer(chipsx, 0, 0)"$)
vue.AddCode($"vm.createchip("c7", Me).AddClass("ma-2").SetColor(vm.COLOR_INDIGO).SetTextColor(vm.COLOR_WHITE).SetText("Premium").SetIcon("mdi-star", "right").AddToContainer(chipsx, 0, 0)"$)
vue.AddCode($"vm.createchip("c8", Me).AddClass("ma-2").SetColor(vm.COLOR_TEAL).SetTextColor(vm.COLOR_WHITE).SetIcon("mdi-checkbox-marked-circle", "left").SetText("Confirm").SetClose(True).AddToContainer(chipsx, 0, 0)"$)
vue.AddCode($"vm.createchip("c9", Me).AddClass("ma-2").SetColor(vm.COLOR_TEAL).SetCloseIcon("mdi-delete").SetTextColor(vm.COLOR_WHITE).SetIcon("mdi-checkbox-marked-circle", "left").SetText("TheMash").SetClose(True).AddToContainer(chipsx, 0, 0)"$)
vue.AddCode($"vm.createchip("c10", Me).AddClass("ma-2").SetColor("success").SetIcon("mdi-server-plus", "left").SetOutlined(True).SetText("Server Status").AddToContainer(chipsx, 0, 0)"$)
vue.AddCode($"vm.createchip("c11", Me).AddClass("ma-2").SetColor(vm.COLOR_PINK).SetTextColor(vm.COLOR_WHITE).SetIcon("mdi-label", "left").SetLabel(True).SetText("Tags").AddToContainer(chipsx, 0, 0)"$)
vue.AddCode($"vm.createchip("c12", Me).AddClass("ma-2").SetColor(vm.COLOR_RED).SetTextColor(vm.COLOR_WHITE).SetText("Remove").SetClose(True).AddToContainer(chipsx, 0, 0)"$)
vue.AddCode($""$)
Main.CreateVBCode(vue, Me, "chipscode", "Chips", vue.GetSourceCode).AddToContainer(cont, 2, 1)

	
	cont.AddComponent(0, 0, chipsx.ToString)

	vm.AddContainer(cont)
End Sub


Sub chipscodecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("chipscode")
End Sub

Sub chipscodedownload_click(e As BANanoEvent)
vue.DownloadCode("chipscode", "chipscode.txt")
End Sub



Sub c10_click(e As BANanoEvent)
	vm.ShowSnackBar("Server status check!")
End Sub

Sub c12_close(e As BANanoEvent)
	vm.SetData("c12", False)
End Sub


Sub c8_close(e As BANanoEvent)
	BANano.Window.Alert("Close!")
End Sub
