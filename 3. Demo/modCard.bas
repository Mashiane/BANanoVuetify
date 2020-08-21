B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "cardCode"
	Public title As String = "Card"
	Private vm As BANanoVM
	Private vue As BANanoVue
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'
	Dim carcard1 As VMCard
	carcard1.Initialize(vue, "carcard1", Me)
	carcard1.SetTitle("card1")
	carcard1.SetSubTitle("card1 SubTitle")
	carcard1.Image.SetHeight(200)
	carcard1.Image.SetValue("./assets/sky.jpg")
	carcard1.Text.AddContent("This is card1card content")
	carcard1.SetHover(True)
	carcard1.SetLoaderheight("4")
	carcard1.SetMaxwidth("450")
	carcard1.SetRaised(True)
	carcard1.SetShaped(True)
	carcard1.SetVisible(True)
	carcard1.AddDivider
	carcard1.Actions.AddSpacer
	carcard1.Actions.AddButton1("btna", "dashboard", "red", "Banner", "A business banner", "")
	carcard1.Actions.AddIcon("btnb", "account_box", "indigo", "", "Another squirrel", "")
	carcard1.Actions.AddIcon("btnc", "gavel", "green", "", "Heavens", "")
	carcard1.Actions.AddIcon("btnd", "question_answer", "purple", "", "Planets of the world", "")
	carcard1.Actions.AddIcon("btne", "mdi-account", "yellow", "", "This is a beautiful bird", "")
	cont.AddControl(carcard1.Card, carcard1.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim carcard1 As VMCard"$)
vue.AddCode($"carcard1.Initialize(vue, "carcard1", Me)"$)
vue.AddCode($"carcard1.SetTitle("card1")"$)
vue.AddCode($"carcard1.SetSubTitle("card1 SubTitle")"$)
vue.AddCode($"carcard1.Image.SetHeight(200)"$)
vue.AddCode($"carcard1.Image.SetValue("./assets/sky.jpg")"$)
vue.AddCode($"carcard1.Text.AddContent("This is card1card content")"$)
vue.AddCode($"carcard1.SetHover(True)"$)
vue.AddCode($"carcard1.SetLoaderheight("4")"$)
vue.AddCode($"carcard1.SetMaxwidth("450")"$)
vue.AddCode($"carcard1.SetRaised(True)"$)
vue.AddCode($"carcard1.SetShaped(True)"$)
vue.AddCode($"carcard1.SetVisible(True)"$)
vue.AddCode($"carcard1.AddDivider"$)
vue.AddCode($"carcard1.Actions.AddSpacer"$)
vue.AddCode($"carcard1.Actions.AddButton1("btna", "dashboard", "red", "Banner", "A business banner", "")"$)
vue.AddCode($"carcard1.Actions.AddIcon("btnb", "account_box", "indigo", "", "Another squirrel", "")"$)
vue.AddCode($"carcard1.Actions.AddIcon("btnc", "gavel", "green", "", "Heavens", "")"$)
vue.AddCode($"carcard1.Actions.AddIcon("btnd", "question_answer", "purple", "", "Planets of the world", "")"$)
vue.AddCode($"carcard1.Actions.AddIcon("btne", "mdi-account", "yellow", "", "This is a beautiful bird", "")"$)
vue.AddCode($"cont.AddControl(carcard1.Card, carcard1.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)"$)
	Dim codeit As VMPrism = Main.CreateVBCode(vue, Me, "cardcode", "Card", vue.GetSourceCode)
	cont.AddControl(codeit.PrismComponent, codeit.ToString, 2 ,1, 0, 0, 0, 0, 12, 12, 12, 12)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Private Sub btna_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBar("Banner")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Private Sub btnb_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBar("Squirrel")"$)
vue.AddCode($"End Sub"$)
	Dim codeit1 As VMPrism = Main.CreateVBCode(vue, Me, "cardclickcode", "Card Button Click", vue.GetSourceCode)
	cont.AddControl(codeit1.PrismComponent, codeit1.ToString, 2 ,1, 0, 0, 0, 0, 12, 12, 12, 12)
	

	vm.AddContainer(cont)
End Sub


Sub cardclickcodecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("cardclickcode")
End Sub

Sub cardclickcodedownload_click(e As BANanoEvent)
	vue.DownloadCode("cardclickcode", "cardclickcode.txt")
End Sub

Sub cardcodecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("cardcode")
End Sub

Sub cardcodedownload_click(e As BANanoEvent)
	vue.DownloadCode("cardcode", "cardcode.txt")
End Sub

Private Sub btna_click(e As BANanoEvent)
	vm.ShowSnackBar("Banner")
End Sub


Private Sub btnb_click(e As BANanoEvent)
	vm.ShowSnackBar("Squirrel")
End Sub


Private Sub btnc_click(e As BANanoEvent)
	vm.ShowSnackBar("Sky")
End Sub


Private Sub btnd_click(e As BANanoEvent)
	vm.ShowSnackBar("Planet")
End Sub


Private Sub btne_click(e As BANanoEvent)
	vm.ShowSnackBar("Bird")
End Sub


Private Sub carcard1_click(e As BANanoEvent)
	vm.ShowSnackBar("Card Clicked!")
End Sub
