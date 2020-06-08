B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "sparkLineCode"
	Public title As String = "SparkLine"
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
	
	Dim sparksparkline1 As VMSparkLine
	sparksparkline1.Initialize(vue, "sparksparkline1", Me)
	sparksparkline1.SetValue(Array(0, 2, 5 ,9 ,5 ,10 ,3, 5, 0, 0, 1, 8, 2, 9, 0))
	sparksparkline1.SetGradient(Array("#f72047", "#ffd200", "#1feaea"))
	sparksparkline1.SetSmooth(10)
	sparksparkline1.SetPadding("8")
	sparksparkline1.SetLinewidth("2")
	sparksparkline1.SetStrokeLineCap("round")
	sparksparkline1.SetGradientdirection("top")
	sparksparkline1.SetFill(False)
	sparksparkline1.SetType("trend")
	sparksparkline1.SetAutoLineWidth(False)
	sparksparkline1.SetVisible(True)
	sparksparkline1.SetAutoDraw(True)
	cont.AddControl(sparksparkline1.SparkLine, sparksparkline1.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	'add container to page
	vm.AddContainer(cont)
End Sub


  