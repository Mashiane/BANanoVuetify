B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "progressCode"
	Public title As String = "Progress"
	Private vm As BANanoVM
	Private vue As BANanoVue
	Private BANano As BANano
	Private pc5 As VMProgressCircular
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	cont.AddRows(10).AddColumns2x6
	'hide this container
	cont.Hide
	'
	Dim plprogresslinear1 As VMProgressLinear
	plprogresslinear1.Initialize(vue, "plprogresslinear1", Me)
	plprogresslinear1.SetValue("15")
	plprogresslinear1.SetVisible(True)
	plprogresslinear1.AddToContainer(cont, 1, 1)
	'
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"Dim plprogresslinear1 As VMProgressLinear"$)
	vue.AddCode($"plprogresslinear1.Initialize(vue, "plprogresslinear1", Me)"$)
	vue.AddCode($"plprogresslinear1.SetValue("15")"$)
	vue.AddCode($"plprogresslinear1.SetVisible(True)"$)
	vue.AddCode($"cont.AddControl(plprogresslinear1.ProgressLinear, plprogresslinear1.tostring, 1, 1, 0, 0, 0, 0, 12, 6, 6, 6)"$)
	Main.CreateVBCode(vue, Me, "prg1code", "Progress", vue.GetSourceCode).AddToContainer(cont, 1, 1)

	'
	'use vmodel to set data
	Dim plprogresslinear2 As VMProgressLinear
	plprogresslinear2.Initialize(vue, "plprogresslinear2", Me)
	plprogresslinear2.SetVModel("pl2")
	vue.setdata("pl2", "50")
	plprogresslinear2.SetVisible(True)
	plprogresslinear2.SetColor(vm.color_deeppurple)
	plprogresslinear2.AddToContainer(cont, 1,2)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"'use vmodel to set data"$)
vue.AddCode($"Dim plprogresslinear2 As VMProgressLinear"$)
vue.AddCode($"plprogresslinear2.Initialize(vue, "plprogresslinear2", Me)"$)
vue.AddCode($"plprogresslinear2.SetVModel("pl2")"$)
vue.AddCode($"vue.setdata("pl2", "50")"$)
vue.AddCode($"plprogresslinear2.SetVisible(True)"$)
vue.AddCode($"plprogresslinear2.SetColor(vm.color_deeppurple)"$)
vue.AddCode($"plprogresslinear2.AddToContainer(cont, 1,2)"$)
Main.CreateVBCode(vue, Me, "prg2code", "Progress", vue.GetSourceCode).AddToContainer(cont, 1, 2)


	'
	Dim pl3 As VMProgressLinear
	pl3.Initialize(vue, "pl3", Me).SetVisible(True).SetIndeterminate(True)
	pl3.SetColorIntensity(vm.color_yellow, vm.Intensity_darken2)
	pl3.AddToContainer(cont, 2,1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim pl3 As VMProgressLinear"$)
vue.AddCode($"pl3.Initialize(vue, "pl3", Me).SetVisible(True).SetIndeterminate(True)"$)
vue.AddCode($"pl3.SetColorIntensity(vm.color_yellow, vm.Intensity_darken2)"$)
vue.AddCode($"pl3.AddToContainer(cont, 2,1)"$)
vue.AddCode($""$)
Main.CreateVBCode(vue, Me, "pl3code", "Progress", vue.GetSourceCode).AddToContainer(cont, 2, 1)

	'
	Dim pl4 As VMProgressLinear
	pl4.Initialize(vue, "pl4", Me).SetVisible(True).SetValue("10").SetBufferValue("20")
	pl4.SetColorIntensity(vm.color_yellow, vm.Intensity_darken2)
	pl4.AddToContainer(cont, 2,2)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim pl4 As VMProgressLinear"$)
vue.AddCode($"pl4.Initialize(vue, "pl4", Me).SetVisible(True).SetValue("10").SetBufferValue("20")"$)
vue.AddCode($"pl4.SetColorIntensity(vm.color_yellow, vm.Intensity_darken2)"$)
vue.AddCode($"pl4.AddToContainer(cont, 2,2)"$)
Main.CreateVBCode(vue, Me, "pl4code", "Progress", vue.GetSourceCode).AddToContainer(cont, 2, 2)


	'
	Dim pl5 As VMProgressLinear
	pl5.Initialize(vue, "pl5", Me).SetVisible(True).SetValue("30")
	pl5.SetBackgroundColorIntensity(vm.color_bluegrey, vm.intensity_normal)
	pl5.AddToContainer(cont, 3,1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim pl5 As VMProgressLinear"$)
vue.AddCode($"pl5.Initialize(vue, "pl5", Me).SetVisible(True).SetValue("30")"$)
vue.AddCode($"pl5.SetBackgroundColorIntensity(vm.color_bluegrey, vm.intensity_normal)"$)
vue.AddCode($"pl5.AddToContainer(cont, 3,1)"$)
vue.AddCode($""$)
Main.CreateVBCode(vue, Me, "pl5code", "Progress", vue.GetSourceCode).AddToContainer(cont, 3, 1)



	'
	Dim pl6 As VMProgressLinear
	pl6.Initialize(vue, "pl6", Me).SetVisible(True).SetValue("20").SetBufferValue("0").SetStream(True)
	pl6.SetColorIntensity(vm.color_yellow, vm.Intensity_darken2)
	pl6.AddToContainer(cont, 3,2)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim pl6 As VMProgressLinear"$)
vue.AddCode($"pl6.Initialize(vue, "pl6", Me).SetVisible(True).SetValue("20").SetBufferValue("0").SetStream(True)"$)
vue.AddCode($"pl6.SetColorIntensity(vm.color_yellow, vm.Intensity_darken2)"$)
vue.AddCode($"pl6.AddToContainer(cont, 3,2)"$)
Main.CreateVBCode(vue, Me, "pl6code", "Progress", vue.GetSourceCode).AddToContainer(cont, 3, 2)

	Dim pl7 As VMProgressLinear
	pl7.Initialize(vue, "pl7", Me).SetVisible(True).SetValue("10").SetHeight("30").SetStriped(True)
	pl7.AddToContainer(cont, 4,1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim pl7 As VMProgressLinear"$)
vue.AddCode($"pl7.Initialize(vue, "pl7", Me).SetVisible(True).SetValue("10").SetHeight("30").SetStriped(True)"$)
vue.AddCode($"pl7.AddToContainer(cont, 4,1)"$)
Main.CreateVBCode(vue, Me, "pl7code", "Progress", vue.GetSourceCode).AddToContainer(cont, 4, 1)


	Dim pl8 As VMProgressLinear
	pl8.Initialize(vue, "pl8", Me).SetVisible(True).SetHeight("30").SetReactive(True)
	pl8.SetVModel("pl8").SetLabel("%")
	pl8.AddToContainer(cont, 4,2)
	vue.SetData("pl8", "60")
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim pl8 As VMProgressLinear"$)
vue.AddCode($"pl8.Initialize(vue, "pl8", Me).SetVisible(True).SetHeight("30").SetReactive(True)"$)
vue.AddCode($"pl8.SetVModel("pl8").SetLabel("%")"$)
vue.AddCode($"pl8.AddToContainer(cont, 4,2)"$)
vue.AddCode($"vue.SetData("pl8", "60")"$)
Main.CreateVBCode(vue, Me, "pl8code", "Progress", vue.GetSourceCode).AddToContainer(cont, 4, 2)


	'
	Dim pc1 As VMProgressCircular
	pc1.Initialize(vue, "pc1", Me).SetVisible(True).SetValue("20")
	pc1.AddToContainer(cont, 5,1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim pc1 As VMProgressCircular"$)
vue.AddCode($"pc1.Initialize(vue, "pc1", Me).SetVisible(True).SetValue("20")"$)
vue.AddCode($"pc1.AddToContainer(cont, 5,1)"$)
Main.CreateVBCode(vue, Me, "pc1code", "Progress", vue.GetSourceCode).AddToContainer(cont, 5, 1)


	'
	Dim pc2 As VMProgressCircular
	pc2.Initialize(vue, "pc2", Me).SetVisible(True).SetValue("80").SetColor(vm.Color_bluegrey)
	pc2.AddToContainer(cont, 5,2)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim pc2 As VMProgressCircular"$)
vue.AddCode($"pc2.Initialize(vue, "pc2", Me).SetVisible(True).SetValue("80").SetColor(vm.Color_bluegrey)"$)
vue.AddCode($"pc2.AddToContainer(cont, 5,2)"$)
Main.CreateVBCode(vue, Me, "pc2code", "Progress", vue.GetSourceCode).AddToContainer(cont, 5, 2)

	'
	Dim pc3 As VMProgressCircular
	pc3.Initialize(vue, "pc3", Me).SetVisible(True).SetColor(vm.color_red).SetIndeterminate(True)
	pc3.AddToContainer(cont, 6,1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim pc3 As VMProgressCircular"$)
vue.AddCode($"pc3.Initialize(vue, "pc3", Me).SetVisible(True).SetColor(vm.color_red).SetIndeterminate(True)"$)
vue.AddCode($"pc3.AddToContainer(cont, 6,1)"$)
vue.AddCode($""$)
Main.CreateVBCode(vue, Me, "pc3code", "Progress", vue.GetSourceCode).AddToContainer(cont, 6, 1)


	
	Dim pc4 As VMProgressCircular
	pc4.Initialize(vue, "pc4", Me).SetVisible(True).SetIndeterminate(True).SetWidth("7").SetSize("80")
	pc4.AddToContainer(cont, 7,1)
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($""$)
vue.AddCode($"Dim pc4 As VMProgressCircular"$)
vue.AddCode($"pc4.Initialize(vue, "pc4", Me).SetVisible(True).SetIndeterminate(True).SetWidth("7").SetSize("80")"$)
vue.AddCode($"pc4.AddToContainer(cont, 7,1)"$)
Main.CreateVBCode(vue, Me, "pc4code", "Progress", vue.GetSourceCode).AddToContainer(cont, 7, 1)


	
	pc5.Initialize(vue, "pc5", Me).SetVisible(True).SetLabel("%").SetTextColor(vm.COLOR_BLUE)
	pc5.SetRotate("360").SetSize("90").SetWidth("20").SetColor(vm.COLOR_AMBER).SetValue("0")
	pc5.AddToContainer(cont, 7,2)
	'
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"'when the app is mounted, execute startit"$)
vue.AddCode($"vue.SetMounted(Me, "startit")"$)
vue.AddCode($""$)
vue.AddCode($"pc5.Initialize(vue, "pc5", Me).SetVisible(True).SetLabel("%").SetTextColor(vm.COLOR_BLUE)"$)
vue.AddCode($"pc5.SetRotate("360").SetSize("90").SetWidth("20").SetColor(vm.COLOR_AMBER).SetValue("0")"$)
vue.AddCode($"pc5.AddToContainer(cont, 7,2)"$)
vue.AddCode($"'"$)
vue.AddCode($"Sub startit"$)
vue.AddCode($"Dim cb As BANanoObject = BANano.callback(Me,"circulate", Null)"$)
vue.AddCode($"BANano.Window.SetInterval(cb, 1000)"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub circulate"$)
vue.AddCode($"'read the stored value"$)
vue.AddCode($"Dim vpc5 As String = pc5.GetValue"$)
vue.AddCode($"vpc5 = BANano.parseint(vpc5)"$)
vue.AddCode($"If vpc5 = "100" Then"$)
vue.AddCode($"'we have reached 100%"$)
vue.AddCode($"vpc5 = "0""$)
vue.AddCode($"Else"$)
vue.AddCode($"'increment by 10"$)
vue.AddCode($"vpc5 = BANano.parseint(vpc5) + 10"$)
vue.AddCode($"End If"$)
vue.AddCode($"'save the state"$)
vue.AddCode($"pc5.SetValue(vpc5)"$)
vue.AddCode($"End Sub"$)
Main.CreateVBCode(vue, Me, "pc5code", "Progress", vue.GetSourceCode).AddToContainer(cont, 7, 2)


	vm.AddContainer(cont)
	vue.SetMounted(Me, "startit")
End Sub


Sub pc5codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("pc5code")
End Sub

Sub pc5codedownload_click(e As BANanoEvent)
	vue.DownloadCode("pc4code", "pc5code.txt")
End Sub


Sub pc4codecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("pc4code")
End Sub

Sub pc4codedownload_click(e As BANanoEvent)
vue.DownloadCode("pc4code", "pc4code.txt")
End Sub


Sub pc3codecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("pc3code")
End Sub

Sub pc3codedownload_click(e As BANanoEvent)
vue.DownloadCode("pc3code", "pc3code.txt")
End Sub


Sub pc2codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("pc2code")
End Sub

Sub pc2codedownload_click(e As BANanoEvent)
	vue.DownloadCode("pc2code", "pc2code.txt")
End Sub



Sub pc1codecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("pc1code")
End Sub

Sub pc1codedownload_click(e As BANanoEvent)
vue.DownloadCode("pc1code", "pc1code.txt")
End Sub


Sub pl8codecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("pl8code")
End Sub

Sub pl8codedownload_click(e As BANanoEvent)
vue.DownloadCode("pl8code", "pl8code.txt")
End Sub


Sub pl7codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("pl7code")
End Sub

Sub pl7codedownload_click(e As BANanoEvent)
	vue.DownloadCode("pl7code", "pl7code.txt")
End Sub


Sub pl6codecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("pl6code")
End Sub

Sub pl6codedownload_click(e As BANanoEvent)
vue.DownloadCode("pl6code", "pl6code.txt")
End Sub


Sub pl5codecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("pl5code")
End Sub

Sub pl5codedownload_click(e As BANanoEvent)
vue.DownloadCode("pl5code", "pl5code.txt")
End Sub

Sub pl4codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("pl4code")
End Sub

Sub pl4codedownload_click(e As BANanoEvent)
	vue.DownloadCode("pl4code", "pl4code.txt")
End Sub


Sub pl3codecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("pl3code")
End Sub

Sub pl3codedownload_click(e As BANanoEvent)
vue.DownloadCode("pl3code", "pl3code.txt")
End Sub


Sub prg2codecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("prg2code")
End Sub

Sub prg2codedownload_click(e As BANanoEvent)
vue.DownloadCode("prg2code", "prg2code.txt")
End Sub


Sub prg1codecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("prg1code")
End Sub

Sub prg1codedownload_click(e As BANanoEvent)
vue.DownloadCode("prg1code", "prg1code.txt")
End Sub




Sub startit
	Dim cb As BANanoObject = BANano.callback(Me,"circulate", Null)
	BANano.Window.SetInterval(cb, 1000)
End Sub

Sub circulate
	'read the stored value
	Dim vpc5 As String = pc5.GetValue
	vpc5 = BANano.parseint(vpc5)
	If vpc5 = "100" Then 
		'we have reached 100%
		vpc5 = "0"
	Else
		'increment by 10
		vpc5 = BANano.parseint(vpc5) + 10
	End If
	'save the state
	pc5.SetValue(vpc5)
End Sub
