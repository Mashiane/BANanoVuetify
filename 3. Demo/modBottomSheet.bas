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
	Private vue As BANanoVue
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(5).AddColumns12
	vm.CreateButton("btnSheet", Me).SetLabel("Show Persistent Sheet").AddToContainer(cont, 1, 1)
	vm.CreateButton("btnInset", Me).SetLabel("Show Inset").AddToContainer(cont, 2, 1)
	
	
	bs1 = vm.CreateBottomSheet("bs1", Me).SetPersistent(True)
	'
	Dim s1 As VMSheet = vm.CreateSheet("s1", Me).SetTextCenter.SetHeight("200px")
	s1.Sheet.AddRows(1).AddColumns12
	'
	Dim lbl As VMLabel = vm.CreateLabel("lblme").SetText("This is a bottom sheet using persistent prop!").SetSpan
	s1.Sheet.AddComponent(1, 1, lbl.ToString)
	'
	Dim btnClose As VMButton = vm.CreateButton("btnCloseSheet", Me).SetLabel("Close Sheet")
	s1.Sheet.AddComponent(3, 1, btnClose.ToString)
	'
	bs1.AddComponent(s1.ToString)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode("Private bs1 As VMBottomSheet")
vue.AddCode($"bs1 = vm.CreateBottomSheet("bs1", Me).SetPersistent(True)"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim s1 As VMSheet = vm.CreateSheet("s1", Me).SetTextCenter.SetHeight("200px")"$)
vue.AddCode($"s1.Sheet.AddRows(1).AddColumns12"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim lbl As VMLabel = vm.CreateLabel("lblme").SetText("This is a bottom sheet using persistent prop!").SetParagraph"$)
vue.AddCode($"s1.Sheet.AddComponent(1, 1, lbl.ToString)"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim btnClose As VMButton = vm.CreateButton("btnCloseSheet", Me).SetLabel("Close Sheet")"$)
vue.AddCode($"s1.Sheet.AddComponent(1, 1, btnClose.ToString)"$)
vue.AddCode($"'"$)
vue.AddCode($"bs1.AddComponent(s1.ToString)"$)
vue.AddCode($"vm.AddBottomSheet(bs1)"$)
vue.AddCode("")
vue.AddCode("' to show the sheet...")
vue.AddCode("bs1.show")
vue.AddCode("' to hide the sheet...")
vue.AddCode("bs1.hide")
Main.CreateVBCode(vue, Me, "bscode", "Bottom Sheet", vue.GetSourceCode).AddToContainer(cont, 3, 1)

	'
	bs2 = vm.CreateBottomSheet("bs2", Me).SetInset(True)
	Dim s As VMSheet = vm.CreateSheet("s2", Me).SetTextCenter.SetHeight("200px")
	'
	s.Sheet.AddRows(1).AddColumns12
	'
	Dim lbl As VMLabel = vm.CreateLabel("lbl2").SetText("This is a bottom sheet using inset prop!").SetParagraph
	s.Sheet.AddComponent(1, 1, lbl.ToString)
	'
	Dim btnClose As VMButton = vm.CreateButton("btnCloseSheet2", Me).SetLabel("Close Sheet")
	s.Sheet.AddComponent(1, 1, btnClose.ToString)
	'
	bs2.AddComponent(s.ToString)
	
	vm.AddContainer(cont)
	'
	vm.AddBottomSheet(bs1)
	vm.AddBottomSheet(bs2)
End Sub


Sub bscodecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("bscode")
End Sub

Sub bscodedownload_click(e As BANanoEvent)
	vue.DownloadCode("bscode", "bscode.txt")
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