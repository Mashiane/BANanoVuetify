B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "rangeslidercode"
	Public Title As String = "Range Slider"
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(5).AddColumns12
	'
	vm.CreateRangeSlider("rs0", Me).SetLabel("Range 0").SetMarginAll("25px").SetTooltipFormatter("{value}%").AddToContainer(cont, 1, 1)
	'
	vm.CreateRangeSlider("rs1", Me).SetLabel("Range 1").SetTooltipAlways.SetValue(10).SetInterval(10).SetShowLabel(True).SetShowMarks.SetMarginAll("25px").AddToContainer(cont, 1, 1)
	'
	vm.CreateRangeSlider("rs2", Me).SetLabel("Range 2").SetTooltipAlways.SetTooltipPlacementRight.SetValue(20).SetShowLabel(True).SetMarginAll("25px").AddToContainer(cont, 1, 1)
	'
	vm.CreateRangeSlider("rs3", Me).SetData(Array("A","B","C","D","E")).SetMarks(Array("A","B","C","D","E")).SetValue("C").SetMarginAll("25px").AddToContainer(cont, 1, 1)
	'
	vm.CreateRangeSlider("rs4", Me).SetValueMulti(5, 25).SetMarginAll("25px").SetTooltipPlacementLeft.SetTooltipAlways.AddToContainer(cont, 1, 1)
	'
	vm.CreateRangeSlider("rs5", Me).SetMin(0).SetMax(1).SetInterval(0.01).SetValue(0.3).SetTooltipAlways.SetMarginAll("25px").AddToContainer(cont, 1, 1)
	'
	vm.CreateRangeSlider("rs7", Me).SetMarks(Array(0, 10, 30, 50, 100)).SetValue(60).SetIncluded(True).SetMarginAll("25px").AddToContainer(cont, 1, 1)
		'
	Dim marks As Map = CreateMap()
	marks.put(0, "😭")
	marks.put(30, "😢")
	marks.put(60, "😑")
	marks.Put(80, "😊")
	marks.put(100, "😆")
	vm.CreateRangeSlider("rs6", Me).SetMarks(marks).SetValue(80).SetMarginAll("25px").AddToContainer(cont, 1, 1)
	
	vm.AddContainer(cont)
End Sub
