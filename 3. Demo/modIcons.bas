B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "iconCode"
	Public title As String = "Icons"
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
	cont.AddRows(4).AddColumns12
	'
	vm.CreateIcon("icon1", Me).SetText("home").AddToContainer(cont, 1, 1)
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateIcon("icon1", Me).SetText("home").AddToContainer(cont, 1, 1)"$)
	Main.CreateVBCode(vue, Me, "icon1code", "Icon", vue.GetSourceCode).AddToContainer(cont, 1, 1)


	'
	vm.CreateIcon("icon2", Me).SetText("add").SetColor("red").SetLarge(True).AddToContainer(cont, 2, 1)
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateIcon("icon2", Me).SetText("add").SetColor("red").SetLarge(True).AddToContainer(cont, 2, 1)"$)
	Main.CreateVBCode(vue, Me, "icon2code", "Icon", vue.GetSourceCode).AddToContainer(cont, 2, 1)

	'
	vm.CreateIcon("icon3", Me).SetText("mdi-email").SetColor("teal").SetXLarge(True).AddToContainer(cont, 3, 1)
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateIcon("icon3", Me).SetText("mdi-email").SetColor("teal").SetXLarge(True).AddToContainer(cont, 3, 1)"$)
	Main.CreateVBCode(vue, Me, "icon3code", "Icon", vue.GetSourceCode).AddToContainer(cont, 3, 1)



	'
	vm.CreateButton("btn1", Me).SetLabel("Accept").SetColor("purple").AddIcon("add", "left", "").AddToContainer(cont, 4, 1)
	'
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateButton("btn1", Me).SetLabel("Accept").SetColor("purple").AddIcon("add", "left", "").AddToContainer(cont, 4, 1)"$)
	Main.CreateVBCode(vue, Me, "btnxcode", "Button Icon", vue.GetSourceCode).AddToContainer(cont, 4, 1)


	'add container to page
	vm.AddContainer(cont)
End Sub


Sub btnxcodecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("btnxcode")
End Sub

Sub btnxcodedownload_click(e As BANanoEvent)
vue.DownloadCode("btnxcode", "btnxcode.txt")
End Sub


Sub icon1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("icon1code")
End Sub

Sub icon1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("icon1code", "icon1code.txt")
End Sub


Sub icon2codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("icon2code")
End Sub

Sub icon2codedownload_click(e As BANanoEvent)
	vue.DownloadCode("icon2code", "icon2code.txt")
End Sub


Sub icon3codecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("icon3code")
End Sub

Sub icon3codedownload_click(e As BANanoEvent)
vue.DownloadCode("icon3code", "icon3code.txt")
End Sub