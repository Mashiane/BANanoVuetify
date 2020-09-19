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
	Private vue As BANanoVue
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(20).AddColumns12
	'
	vm.CreateButton("btn4", Me).SetLabel("Confirm").UseTheme("red-l-2").AddToContainer(cont, 1, 1)
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateButton("btn4", Me).SetLabel("Confirm").UseTheme("red-l-2").AddToContainer(cont, 1, 1)"$)
	pgIndex.CreateVBCode(vue, Me, "buttoncode", "Buttons", vue.GetSourceCode).AddToContainer(cont, 1, 1)
	'
	vm.CreateButton("btnPrimary", Me).SetLabel("Alert").SetPrimary(True).AddToContainer(cont, 2, 1)
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateButton("btnPrimary", Me).SetLabel("Alert").SetPrimary(True).AddToContainer(cont, 2, 1)"$)
	pgIndex.CreateVBCode(vue, Me, "buttoncode1", "Buttons", vue.GetSourceCode).AddToContainer(cont, 2, 1)

	vm.CreateButton("btnAccent", Me).SetLabel("Accent").SetAccent(True).AddToContainer(cont, 3, 1)
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateButton("btnAccent", Me).SetLabel("Accent").SetAccent(True).AddToContainer(cont, 3, 1)"$)
	pgIndex.CreateVBCode(vue, Me, "buttoncode2", "Buttons", vue.GetSourceCode).AddToContainer(cont, 3, 1)
	'
	vm.CreateIconButton("btnx", Me, "mdi-heart").SetColor("pink").AddToContainer(cont, 4, 1)
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateIconButton("btnx", Me, "mdi-heart").SetColor("pink").AddToContainer(cont, 4, 1)"$)
	pgIndex.CreateVBCode(vue, Me, "buttoncode3", "Buttons", vue.GetSourceCode).AddToContainer(cont, 4, 1)
	'
	vm.CreateFABButton("fab1", Me, "mdi-plus").SetColor("indigo").AddToContainer(cont, 5, 1)
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateFABButton("fab1", Me, "mdi-plus").SetColor("indigo").AddToContainer(cont, 5, 1)"$)
	pgIndex.CreateVBCode(vue, Me, "buttoncode4", "Buttons", vue.GetSourceCode).AddToContainer(cont, 5, 1)
	'
	vm.CreateFABButton("fab2", Me, "mdi-pencil").SetOutlined(True).SetLarge(True).SetColor("teal").AddToContainer(cont, 6, 1)
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateFABButton("fab2", Me, "mdi-pencil").SetOutlined(True).SetLarge(True).SetColor("teal").AddToContainer(cont, 6, 1)"$)
	pgIndex.CreateVBCode(vue, Me, "buttoncode5", "Buttons", vue.GetSourceCode).AddToContainer(cont, 6, 1)
	'
	vm.CreateButton("tilex", Me).SetLabel("Tile Button").SetTile(True).SetColor("orange").AddToContainer(cont, 7, 1)
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateButton("tilex", Me).SetLabel("Tile Button").SetTile(True).SetColor("orange").AddToContainer(cont, 7, 1)"$)
	pgIndex.CreateVBCode(vue, Me, "buttoncode6", "Buttons", vue.GetSourceCode).AddToContainer(cont, 7, 1)
	'
	vm.CreateButton("blockx", Me).SetLabel("Block Button").SetBlock(True).SetColor("green").AddToContainer(cont, 8, 1)
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateButton("blockx", Me).SetLabel("Block Button").SetBlock(True).SetColor("green").AddToContainer(cont, 8, 1)"$)
	pgIndex.CreateVBCode(vue, Me, "buttoncode7", "Buttons", vue.GetSourceCode).AddToContainer(cont, 8, 1)
	'
	vm.CreateButton("roundx", Me).SetLabel("Round Button").SetRounded(True).SetColor("yellow").AddToContainer(cont, 9, 1)
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateButton("roundx", Me).SetLabel("Round Button").SetRounded(True).SetColor("yellow").AddToContainer(cont, 9, 1)"$)
	pgIndex.CreateVBCode(vue, Me, "buttoncode8", "Buttons", vue.GetSourceCode).AddToContainer(cont, 9, 1)
	'
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($""$)
	vue.AddCode($"Sub edit_click(e As BANanoEvent)"$)
	vue.AddCode($"vm.ShowSnackBar("Edit!")"$)
	vue.AddCode($"End Sub"$)
	vue.AddCode($""$)
	vue.AddCode($""$)
	vue.AddCode($"Sub addit_click(e As BANanoEvent)"$)
	vue.AddCode($"vm.ShowSnackBar("Add It!")"$)
	vue.AddCode($"End Sub"$)
	vue.AddCode($""$)
	vue.AddCode($""$)
	vue.AddCode($"Sub deleteit_click(e As BANanoEvent)"$)
	vue.AddCode($"vm.ShowSnackBar("Delete It!")"$)
	vue.AddCode($"End Sub"$)
	pgIndex.CreateVBCode(vue, Me, "btnButtonClick", "Button Clicks", vue.GetSourceCode).AddToContainer(cont, 10, 1)

	'single selection	
	Dim btnToggle As VMButtonToggle = vm.CreateButtonToggle("btnToggle", Me)
	btnToggle.setvmodel("toggleexclusive")
	vm.setdata("toggleexclusive", 2)
	btnToggle.AddIcon("al", "mdi-format-align-left", "", "", "Align left")
	btnToggle.AddIcon("ac", "mdi-format-align-center","","", "Align center")
	btnToggle.AddIcon("ar", "mdi-format-align-right", "", "", "Align right")
	btnToggle.AddIcon("aj", "mdi-format-align-justify","","", "Align justify")
	btnToggle.AddToContainer(cont, 11,1)
	'
	vue.SourceCodeBuilder
	vue.AddCode($"'single selection"$)
	vue.AddCode($"Dim btnToggle As VMButtonToggle = vm.CreateButtonToggle("btnToggle", Me)"$)
	vue.AddCode($"btnToggle.setvmodel("toggleexclusive")"$)
	vue.AddCode($"vm.setdata("toggleexclusive", 2)"$)
	vue.AddCode($"btnToggle.AddIcon("al", "mdi-format-align-left", "", "", "Align left")"$)
	vue.AddCode($"btnToggle.AddIcon("ac", "mdi-format-align-center","","", "Align center")"$)
	vue.AddCode($"btnToggle.AddIcon("ar", "mdi-format-align-right", "", "", "Align right")"$)
	vue.AddCode($"btnToggle.AddIcon("aj", "mdi-format-align-justify","","", "Align justify")"$)
	vue.AddCode($"btnToggle.AddToContainer(cont, 10,1)"$)
	pgIndex.CreateVBCode(vue, Me, "btnToggleCode", "Toggle", vue.GetSourceCode).AddToContainer(cont, 11, 1)

	'multiple selection
	Dim btnToggleM As VMButtonToggle = vm.CreateButtonToggle("btnToggleM", Me)
	btnToggleM.SetMultiple(True)
	btnToggleM.SetShaped(True)
	btnToggleM.setvmodel("togglemultiple")
	Dim nl As List = vm.CreateB4xList(Array(0,1,2))
	vm.setdata("togglemultiple", nl)
	btnToggleM.AddIcon("al", "mdi-format-bold", "", "", "Bold")
	btnToggleM.AddIcon("ac", "mdi-format-italic","","", "Italic")
	btnToggleM.AddIcon("ar", "mdi-format-underline", "", "", "Underline")
	btnToggleM.AddIcon("aj", "mdi-format-color-fill","","", "Color Fill")
	btnToggleM.AddToContainer(cont, 12,1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"'multiple selection"$)
vue.AddCode($"Dim btnToggleM As VMButtonToggle = vm.CreateButtonToggle("btnToggleM", Me)"$)
vue.AddCode($"btnToggleM.SetMultiple(True)"$)
vue.AddCode($"btnToggleM.SetShaped(True)"$)
vue.AddCode($"btnToggleM.setvmodel("togglemultiple")"$)
vue.AddCode($"Dim nl As List = vm.CreateB4xList(Array(0,1,2))"$)
vue.AddCode($"vm.setdata("togglemultiple", nl)"$)
vue.AddCode($"btnToggleM.AddIcon("al", "mdi-format-bold", "", "", "Bold")"$)
vue.AddCode($"btnToggleM.AddIcon("ac", "mdi-format-italic","","", "Italic")"$)
vue.AddCode($"btnToggleM.AddIcon("ar", "mdi-format-underline", "", "", "Underline")"$)
vue.AddCode($"btnToggleM.AddIcon("aj", "mdi-format-color-fill","","", "Color Fill")"$)
vue.AddCode($"btnToggleM.AddToContainer(cont, 11,1)"$)
pgIndex.CreateVBCode(vue, Me, "btnToggleCodeM", "Toggle Multiple", vue.GetSourceCode).AddToContainer(cont, 12, 1)
		
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

	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim sp1 As VMSpeedDial = vm.CreateSpeedDial("sp1", Me, "mdi-account-circle", "mdi-close")"$)
vue.AddCode($"sp1.SetColorIntensity(vm.COLOR_BLUE, vm.INTENSITY_DARKEN2)"$)
vue.AddCode($"sp1.SetDark(True)"$)
vue.AddCode($"sp1.SetAbsolute(True)"$)
vue.AddCode($"sp1.SetBottom(True)"$)
vue.AddCode($"sp1.SetRight(True)"$)
vue.AddCode($"sp1.SetOpenOnHover(True)"$)
vue.AddCode($"sp1.AddItem("speededit", "mdi-pencil", "green")"$)
vue.AddCode($"sp1.AddItem("speedaddit", "mdi-plus", "indigo")"$)
vue.AddCode($"sp1.AddItem("speeddeleteit", "mdi-delete", "red")"$)
vue.AddCode($"vm.AddSpeedDial(sp1)"$)
vue.AddCode($""$)
vue.AddCode($"'add container to page"$)
vue.AddCode($"vm.AddContainer(cont)"$)
pgIndex.CreateVBCode(vue, Me, "btnSpeedDialCode", "Speed Dial", vue.GetSourceCode).AddToContainer(cont, 13, 1)
'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($""$)
vue.AddCode($"Sub speededit_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBarSuccess("Speed edit")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub speedaddit_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBarSuccess("Speed add it")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub speeddeleteit_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBarSuccess("Speed delete it")"$)
vue.AddCode($"End Sub"$)
	pgIndex.CreateVBCode(vue, Me, "btnSpeedDialClick", "Speed Dial Click", vue.GetSourceCode).AddToContainer(cont, 14, 1)
	'
	
	'add container to page
	vm.AddContainer(cont)
	



End Sub


Sub btnSpeedDialClickcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("btnSpeedDialClick")
End Sub

Sub btnSpeedDialClickdownload_click(e As BANanoEvent)
	vue.DownloadCode("btnSpeedDialClick", "btnSpeedDialClick.txt")
End Sub


Sub btnButtonClickcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("btnSpeedDialClick")
End Sub

Sub btnButtonClickdownload_click(e As BANanoEvent)
	vue.DownloadCode("btnSpeedDialClick", "btnSpeedDialClick.txt")
End Sub


Sub btnSpeedDialCodecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("btnSpeedDialCode")
End Sub

Sub btnSpeedDialCodedownload_click(e As BANanoEvent)
	vue.DownloadCode("btnSpeedDialCode", "btnSpeedDialCode.txt")
End Sub


Sub btnToggleCodeMcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("btnToggleCodeM")
End Sub

Sub btnToggleCodeMdownload_click(e As BANanoEvent)
	vue.DownloadCode("btnToggleCodeM", "btnToggleCodeM.txt")
End Sub



Sub btnToggleCodecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("btnToggleCode")
End Sub

Sub btnToggleCodedownload_click(e As BANanoEvent)
	vue.DownloadCode("btnToggleCode", "btnToggleCode.txt")
End Sub


Sub buttoncodecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("buttoncode")
End Sub

Sub buttoncodedownload_click(e As BANanoEvent)
	vue.DownloadCode("buttoncode", "buttoncode.txt")
End Sub
'
Sub buttoncode1copy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("buttoncode1")
End Sub

Sub buttoncode1download_click(e As BANanoEvent)
	vue.DownloadCode("buttoncode1", "buttoncode1.txt")
End Sub
'
Sub buttoncode2copy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("buttoncode2")
End Sub

Sub buttoncode2download_click(e As BANanoEvent)
	vue.DownloadCode("buttoncode2", "buttoncode2.txt")
End Sub
'
Sub buttoncode3copy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("buttoncode3")
End Sub

Sub buttoncode3download_click(e As BANanoEvent)
	vue.DownloadCode("buttoncode3", "buttoncode3.txt")
End Sub
'
Sub buttoncode4copy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("buttoncode4")
End Sub

Sub buttoncode4download_click(e As BANanoEvent)
	vue.DownloadCode("buttoncode4", "buttoncode4.txt")
End Sub
'
Sub buttoncode5copy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("buttoncode5")
End Sub

Sub buttoncode5download_click(e As BANanoEvent)
	vue.DownloadCode("buttoncode5", "buttoncode5.txt")
End Sub
'
Sub buttoncode6copy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("buttoncode6")
End Sub

Sub buttoncode6download_click(e As BANanoEvent)
	vue.DownloadCode("buttoncode6", "buttoncode6.txt")
End Sub
'
Sub buttoncode7copy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("buttoncode7")
End Sub

Sub buttoncode7download_click(e As BANanoEvent)
	vue.DownloadCode("buttoncode7", "buttoncode7.txt")
End Sub
'
Sub buttoncode8copy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("buttoncode8")
End Sub

Sub buttoncode8download_click(e As BANanoEvent)
	vue.DownloadCode("buttoncode8", "buttoncode8.txt")
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
