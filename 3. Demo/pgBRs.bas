B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "bordersCode"
	Public title As String = "Borders & Radius"
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
	'create 2 columns each spanning 12 columns
	cont.addrows(3).AddColumns6x2
	cont.AddRows(3).AddColumns12
	'
	vm.Div("").SetRounded.AddClass("pa-6 text-center grey lighten-2").SetText("Rounded").AddToContainer(cont,1,1)
	vm.Div("").SetRounded_SM.AddClass("pa-6 text-center grey lighten-2").SetText("Rounded_SM").AddToContainer(cont,1,2)
	vm.Div("").SetRounded_LG.AddClass("pa-6 text-center grey lighten-2").SetText("Rounded_LG").AddToContainer(cont,1,3)
	vm.Div("").SetRounded_XL.AddClass("pa-6 text-center grey lighten-2").SetText("Rounded_XL").AddToContainer(cont,1,4)
	vm.Div("").SetRounded_Pill.AddClass("pa-6 text-center grey lighten-2").SetText("Pill").AddToContainer(cont,1,5)
	vm.Div("").SetRounded_Circle.AddClass("pa-6 text-center grey lighten-2").SetText("Circle").AddToContainer(cont,1,6)
	'
	vm.Div("").SetRounded_Top("xl").AddClass("pa-6 text-center grey lighten-2").SetText("Rounded Top").AddToContainer(cont,2,1)
	vm.Div("").SetRounded_Right("xl").AddClass("pa-6 text-center grey lighten-2").SetText("Rounded Right").AddToContainer(cont,2,2)
	vm.Div("").SetRounded_Bottom("xl").AddClass("pa-6 text-center grey lighten-2").SetText("Rounded Bottom").AddToContainer(cont,2,3)
	vm.Div("").SetRounded_Left("xl").AddClass("pa-6 text-center grey lighten-2").SetText("Rounded Left").AddToContainer(cont,2,4)
	'
	vm.Div("").SetRounded_TopLeft("xl").AddClass("pa-6 text-center grey lighten-2").SetText("Top Left").AddToContainer(cont,3,1)
	vm.Div("").SetRounded_TopRight("xl").AddClass("pa-6 text-center grey lighten-2").SetText("Top Right").AddToContainer(cont,3,2)
	vm.Div("").SetRounded_BottomRight("xl").AddClass("pa-6 text-center grey lighten-2").SetText("Bottom Right").AddToContainer(cont,3,3)
	vm.Div("").SetRounded_BottomLeft("xl").AddClass("pa-6 text-center grey lighten-2").SetText("Bottom Left").AddToContainer(cont,3,4)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"vm.Div("").SetRounded.AddClass("pa-6 text-center grey lighten-2").SetText("Rounded").AddToContainer(cont,1,1)"$)
vue.AddCode($"vm.Div("").SetRounded_SM.AddClass("pa-6 text-center grey lighten-2").SetText("Rounded_SM").AddToContainer(cont,1,2)"$)
vue.AddCode($"vm.Div("").SetRounded_LG.AddClass("pa-6 text-center grey lighten-2").SetText("Rounded_LG").AddToContainer(cont,1,3)"$)
vue.AddCode($"vm.Div("").SetRounded_XL.AddClass("pa-6 text-center grey lighten-2").SetText("Rounded_XL").AddToContainer(cont,1,4)"$)
vue.AddCode($"vm.Div("").SetRounded_Pill.AddClass("pa-6 text-center grey lighten-2").SetText("Pill").AddToContainer(cont,1,5)"$)
vue.AddCode($"vm.Div("").SetRounded_Circle.AddClass("pa-6 text-center grey lighten-2").SetText("Circle").AddToContainer(cont,1,6)"$)
pgIndex.CreateVBCode(vue, Me, "border1code", "Rounded 1", vue.GetSourceCode).AddToContainer(cont, 4, 1)
'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"vm.Div("").SetRounded_Top("xl").AddClass("pa-6 text-center grey lighten-2").SetText("Rounded Top").AddToContainer(cont,2,1)"$)
vue.AddCode($"vm.Div("").SetRounded_Right("xl").AddClass("pa-6 text-center grey lighten-2").SetText("Rounded Right").AddToContainer(cont,2,2)"$)
vue.AddCode($"vm.Div("").SetRounded_Bottom("xl").AddClass("pa-6 text-center grey lighten-2").SetText("Rounded Bottom").AddToContainer(cont,2,3)"$)
vue.AddCode($"vm.Div("").SetRounded_Left("xl").AddClass("pa-6 text-center grey lighten-2").SetText("Rounded Left").AddToContainer(cont,2,4)"$)
pgIndex.CreateVBCode(vue, Me, "border2code", "Rounded 2", vue.GetSourceCode).AddToContainer(cont, 5, 1)

'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"vm.Div("").SetRounded_TopLeft("xl").AddClass("pa-6 text-center grey lighten-2").SetText("Top Left").AddToContainer(cont,3,1)"$)
vue.AddCode($"vm.Div("").SetRounded_TopRight("xl").AddClass("pa-6 text-center grey lighten-2").SetText("Top Right").AddToContainer(cont,3,2)"$)
vue.AddCode($"vm.Div("").SetRounded_BottomRight("xl").AddClass("pa-6 text-center grey lighten-2").SetText("Bottom Right").AddToContainer(cont,3,3)"$)
vue.AddCode($"vm.Div("").SetRounded_BottomLeft("xl").AddClass("pa-6 text-center grey lighten-2").SetText("Bottom Left").AddToContainer(cont,3,4)"$)
pgIndex.CreateVBCode(vue, Me, "border3code", "Rounded 3", vue.GetSourceCode).AddToContainer(cont, 6, 1)



	vm.AddContainer(cont)
End Sub


Sub border1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("border1code")
End Sub

Sub border1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("border1code", "border1code.txt")
End Sub


Sub border2codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("border2code")
End Sub

Sub border2codedownload_click(e As BANanoEvent)
	vue.DownloadCode("border2code", "border2code.txt")
End Sub



Sub border3codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("border3code")
End Sub

Sub border3codedownload_click(e As BANanoEvent)
	vue.DownloadCode("border3code", "border3code.txt")
End Sub
