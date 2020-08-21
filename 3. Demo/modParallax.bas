B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "parallaxCode"
	Public title As String = "Parallax"
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
	cont.addrows(2).AddColumns12
	'
	Dim par As VMParallax = vm.CreateParallax("p1", Me).SetSRC("./assets/material.jpg")
	cont.AddComponent(1, 1, par.tostring)
	'
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"Dim par As VMParallax = vm.CreateParallax("p1", Me).SetSRC("./assets/material.jpg")"$)
	vue.AddCode($"cont.AddComponent(1, 1, par.tostring)"$)
	Main.CreateVBCode(vue, Me, "par1code", "Parallax", vue.GetSourceCode).AddToContainer(cont, 1, 1)
	'
	Dim par1 As VMParallax = vm.CreateParallax("p2", Me).SetSRC("./assets/bg-2.jpg").SetAttrLoose("dark")
	par1.Container.AddRows(1).AddColumns12
	par1.Container.SetAlignRC(1, 0, vm.ALIGN_CENTER)
	par1.Container.SetJustifyRC(1, 0, vm.JUSTIFY_CENTER)
	par1.Container.SetTextCenterRC(1, 1)
	'
	Dim h1 As VMLabel = vm.CreateLabel("h1").AddClass("display-1 font-weight-thin mb-4").SetText("Vuetify.js").SetH1
	par1.Container.AddComponent(1, 1, h1.tostring)
	'
	Dim h4 As VMLabel = vm.createlabel("h4").AddClass("subheading").SetText("Build your application today!").SetH4
	par1.Container.AddComponent(1, 1, h4.tostring)
		
	cont.AddComponent(2, 1, par1.tostring)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim par1 As VMParallax = vm.CreateParallax("p2", Me).SetSRC("./assets/bg-2.jpg").SetAttrLoose("dark")"$)
vue.AddCode($"par1.Container.AddRows(1).AddColumns12"$)
vue.AddCode($"par1.Container.SetAlignRC(1, 0, vm.ALIGN_CENTER)"$)
vue.AddCode($"par1.Container.SetJustifyRC(1, 0, vm.JUSTIFY_CENTER)"$)
vue.AddCode($"par1.Container.SetTextCenterRC(1, 1)"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim h1 As VMLabel = vm.CreateLabel("h1").AddClass("display-1 font-weight-thin mb-4").SetText("Vuetify.js").SetH1"$)
vue.AddCode($"par1.Container.AddComponent(1, 1, h1.tostring)"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim h4 As VMLabel = vm.createlabel("h4").AddClass("subheading").SetText("Build your application today!").SetH4"$)
vue.AddCode($"par1.Container.AddComponent(1, 1, h4.tostring)"$)
vue.AddCode($""$)
vue.AddCode($"cont.AddComponent(2, 1, par1.tostring)"$)
Main.CreateVBCode(vue, Me, "par2code", "Parallax with Container", vue.GetSourceCode).AddToContainer(cont, 2, 1)

	vm.AddContainer(cont)
End Sub


Sub par1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("par1code")
End Sub

Sub par1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("par1code", "par1code.txt")
End Sub


Sub par2codecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("par2code")
End Sub

Sub par2codedownload_click(e As BANanoEvent)
vue.DownloadCode("par2code", "par2code.txt")
End Sub

