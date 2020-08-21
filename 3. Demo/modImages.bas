B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "imagesCode"
	Public title As String = "Images"
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
	cont.addrows(3).AddColumns12
	'
	vm.CreateImage("img1", Me).SetValue("./assets/bg-2.jpg").SetHover(True).SetHeight("125").SetAspectRatio("1.7").AddToContainer(cont, 1, 1)
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateImage("img1", Me).SetValue("./assets/bg-2.jpg").SetHover(True).SetHeight("125").SetAspectRatio("1.7").AddToContainer(cont, 1, 1)"$)
	Main.CreateVBCode(vue, Me, "image1code", "Image", vue.GetSourceCode).AddToContainer(cont, 1, 1)


	'
	vm.CreateImage("img2", Me).SetLazySrc("https://picsum.photos/id/11/100/60").SetMaxWidth("500").SetMaxHeight("300").SetValue("https://picsum.photos/510/300?random").SetAspectRatio("2").AddToContainer(cont, 2, 1)
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateImage("img2", Me).SetLazySrc("https://picsum.photos/id/11/100/60").SetMaxWidth("500").SetMaxHeight("300").SetValue("https://picsum.photos/510/300?random").SetAspectRatio("2").AddToContainer(cont, 2, 1)"$)
	Main.CreateVBCode(vue, Me, "image2code", "Image Lady Load", vue.GetSourceCode).AddToContainer(cont, 2, 1)

	vm.CreateImage("img3", Me).SetValue("./assets/squirrel.jpg").SetContain("125").SetMaxHeight("125").SetAspectRatio("1.4").AddToContainer(cont, 3, 1)
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"vm.CreateImage("img3", Me).SetValue("./assets/squirrel.jpg").SetContain("125").SetMaxHeight("125").SetAspectRatio("1.4").AddToContainer(cont, 3, 1)"$)
Main.CreateVBCode(vue, Me, "image3code", "Image", vue.GetSourceCode).AddToContainer(cont, 3, 1)


	vm.AddContainer(cont)
End Sub


Sub image1codecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("image1code")
End Sub

Sub image1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("image1code", "image1code.txt")
End Sub


Sub image2codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("image2code")
End Sub

Sub image2codedownload_click(e As BANanoEvent)
	vue.DownloadCode("image2code", "image2code.txt")
End Sub


Sub image3codecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("image3code")
End Sub

Sub image3codedownload_click(e As BANanoEvent)
vue.DownloadCode("image3code", "image3code.txt")
End Sub
