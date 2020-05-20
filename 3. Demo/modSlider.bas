B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "sliderCode"
	Public title As String = "Sliders"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	cont.AddRows(10).AddColumns2x6
	'
	vm.SetState(CreateMap("volume": 10, "min": 0, "max": 100, "disabled": False, "readonly": False, "vertical": False, _
	"range": False))
	Dim seasons As List
	seasons.Initialize 
	seasons.AddAll(Array("Winter", "Spring", "Summer", "Fall"))
	
	vm.CreateSlider("sl1", Me).SetVModel("min").SetMin("-100").SetMax("100").SetLabel("Min").AddToContainer(cont, 1, 1)
	'
	vm.CreateSlider("sl2", Me).SetVModel("min").SetReadOnly(True).SetMin("-100").SetMax("100").SetLabel("Read Only").SetValue("30").AddToContainer(cont, 2, 1)
	'
	vm.CreateSlider("sl3", Me).SetVModel("min").SetDisabled(True).SetMin("-100").SetMax("100").SetLabel("Min").SetValue("30").SetInverseLabel(True).AddToContainer(cont, 3, 1)
	'
	vm.CreateSlider("sl4", Me).SetPrependIcon("volume_up").SetThumbLabel("always").SetTrackColor("pink").SetThumbColor("orange").SetVModel("volume").SetMin("0").SetMax("10").SetLabel("Volume").SetValue("5").AddToContainer(cont, 4, 1)
	'
	vm.CreateSlider("sl5", Me).SetAppendIcon("alarm").SetVModel("alarm").SetMin("0").SetColor("brown").SetMax("10").SetLabel("Alarm").SetValue("5").AddToContainer(cont, 5, 1)
	'
	vm.CreateSlider("sl6", Me).SetPrependIcon("zoom_out").SetAppendIcon("zoom_in").SetVModel("zoom").SetMin("0").SetMax("10").SetValue("5").AddToContainer(cont, 6, 1)
	'
	Dim sldx As VMSlider = vm.CreateSlider("sldx", Me).SetTickLabels(seasons).SetVModel("season").SetValue("0")
	sldx.SetMin("0").SetMax("3").SetTicks("always").SetTickSize("4").SetStep("1")
	sldx.AddToContainer(cont, 7, 1)
	'
	'*range slider buggy
	'Dim rs As VMRangeSlider = vm.CreateRangeSlider("sl7", Me).SetVModel("zoom").SetRange(30, 60)
	'rs.AddToContainer(cont, 8, 1)
	'
	vm.AddContainer(cont)
End Sub


Sub sl6_append(e As BANanoEvent)
	vm.Increment("zoom", 1)
	
End Sub

Sub s16_prepend(e As BANanoEvent)
	vm.Decrement("zoom", 1)
End Sub