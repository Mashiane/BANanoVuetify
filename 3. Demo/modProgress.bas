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
	'hide this container
	cont.Hide
	'
	Dim plprogresslinear1 As VMProgressLinear
	plprogresslinear1.Initialize(vue, "plprogresslinear1", Me)
	plprogresslinear1.SetValue("15")
	plprogresslinear1.SetVisible(True)
	cont.AddControl(plprogresslinear1.ProgressLinear, plprogresslinear1.tostring, 1, 1, 0, 0, 0, 0, 12, 6, 6, 6)
	'
	'use vmodel to set data
	Dim plprogresslinear2 As VMProgressLinear
	plprogresslinear2.Initialize(vue, "plprogresslinear2", Me)
	plprogresslinear2.SetVModel("pl2")
	plprogresslinear2.SetVisible(True)
	plprogresslinear2.SetColor(vm.color_deeppurple)
	cont.AddControl(plprogresslinear2.ProgressLinear, plprogresslinear2.tostring, 1, 2, 0, 0, 0, 0, 12, 6, 6, 6)
	vue.setdata("pl2", "50")
	'
	Dim pl3 As VMProgressLinear
	pl3.Initialize(vue, "pl3", Me).SetVisible(True).SetIndeterminate(True)
	pl3.SetColorIntensity(vm.color_yellow, vm.Intensity_darken2)
	cont.AddControl(pl3.ProgressLinear, pl3.tostring, 2, 1, 0, 0, 0, 0, 12, 6, 6, 6)
	'
	Dim pl4 As VMProgressLinear
	pl4.Initialize(vue, "pl4", Me).SetVisible(True).SetValue("10").SetBufferValue("20")
	pl4.SetColorIntensity(vm.color_yellow, vm.Intensity_darken2)
	cont.AddControl(pl4.ProgressLinear, pl4.tostring, 2, 2, 0, 0, 0, 0, 12, 6, 6, 6)
	'
	Dim pl5 As VMProgressLinear
	pl5.Initialize(vue, "pl5", Me).SetVisible(True).SetValue("30")
	pl5.SetBackgroundColorIntensity(vm.color_bluegrey, vm.intensity_normal)
	cont.AddControl(pl5.ProgressLinear, pl5.tostring, 3, 1, 0, 0, 0, 0, 12, 6, 6, 6)
	'
	Dim pl6 As VMProgressLinear
	pl6.Initialize(vue, "pl6", Me).SetVisible(True).SetValue("20").SetBufferValue("0").SetStream(True)
	pl6.SetColorIntensity(vm.color_yellow, vm.Intensity_darken2)
	cont.AddControl(pl6.ProgressLinear, pl6.tostring, 3, 2, 0, 0, 0, 0, 12, 6, 6, 6)
	'
	Dim pl7 As VMProgressLinear
	pl7.Initialize(vue, "pl7", Me).SetVisible(True).SetValue("10").SetHeight("30").SetStriped(True)
	cont.AddControl(pl7.ProgressLinear, pl7.tostring, 4, 1, 0, 0, 0, 0, 12, 6, 6, 6)
	'
	Dim pl8 As VMProgressLinear
	pl8.Initialize(vue, "pl8", Me).SetVisible(True).SetHeight("30").SetReactive(True)
	pl8.SetVModel("pl8").SetLabel("%")
	cont.AddControl(pl8.ProgressLinear, pl8.tostring, 4, 2, 0, 0, 0, 0, 12, 6, 6, 6)
	vue.SetData("pl8", "60")
	'
	Dim pc1 As VMProgressCircular
	pc1.Initialize(vue, "pc1", Me).SetVisible(True).SetValue("20")
	cont.AddControl(pc1.ProgressCircular, pc1.tostring, 5, 1, 0, 0, 0, 0, 12, 4, 4, 4)
	'
	Dim pc2 As VMProgressCircular
	pc2.Initialize(vue, "pc2", Me).SetVisible(True).SetValue("80").SetColor(vm.Color_bluegrey)
	cont.AddControl(pc2.ProgressCircular, pc2.tostring, 5, 2, 0, 0, 0, 0, 12, 4, 4, 4)
	'
	Dim pc3 As VMProgressCircular
	pc3.Initialize(vue, "pc3", Me).SetVisible(True).SetColor(vm.color_red).SetIndeterminate(True)
	cont.AddControl(pc3.ProgressCircular, pc3.tostring, 5, 3, 0, 0, 0, 0, 12, 4, 4, 4)
	'
	Dim pc4 As VMProgressCircular
	pc4.Initialize(vue, "pc4", Me).SetVisible(True).SetIndeterminate(True).SetWidth("7").SetSize("80")
	cont.AddControl(pc4.ProgressCircular, pc4.tostring, 6, 1, 0, 0, 0, 0, 12, 6, 6, 6)
	'
	pc5.Initialize(vue, "pc5", Me).SetVisible(True).SetLabel("%").SetTextColor(vm.COLOR_BLUE)
	pc5.SetRotate("360").SetSize("90").SetWidth("20").SetColor(vm.COLOR_AMBER).SetValue("0")
	cont.AddControl(pc5.ProgressCircular, pc5.tostring, 6, 2, 0, 0, 0, 0, 12, 6, 6, 6)
	'
	vm.AddContainer(cont)
	vue.SetMounted(Me, "startit")
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
