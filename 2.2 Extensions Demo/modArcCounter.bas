B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Public name As String = "arcCounterCode"
	Public title As String = "Arc Counter"
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
	cont.addrows(5).AddColumns4x3
	'
	Dim arc As VMArcCounter
	arc.Initialize(vue, "arc1", Me)
	arc.setsize("10rem").SetStart("-40").SetEnd("40").SetText("123")
	cont.AddComponent(1,1,arc.tostring)
	'
	Dim arc2 As VMArcCounter
	arc2.Initialize(vue, "arc2", Me)
	arc2.SetSize("10rem").SetDashSpacing("0.6").SetStrokeWidth("60")
	arc2.SetActiveWidth("60").SetDashCount("45").SetActiveCount("17")
	arc2.SetStart("300").SetEnd("60").SetText("Label").SetTextX("right")
	arc2.SetTextY("bottom")
	cont.AddComponent(1,2,arc2.tostring)
	'
	Dim arc3 As VMArcCounter
	arc3.Initialize(vue, "arc3", Me)
	arc3.SetSize("10rem").SetStrokeWidth("2").SetActiveWidth("6")
	arc3.SetDashSpacing("0").SetStart("140").SetEnd("-140")
	arc3.SetStroke("black").SetActiveStroke("red")
	arc3.SetText("5").SetTextX("center").SetTextY("bottom")
	cont.AddComponent(1,3,arc3.tostring)
	'
	Dim arc4 As VMCircleCounter
	arc4.Initialize(vue, "arc4", Me)
	arc4.SetSize("10rem").SetText("123")
	cont.AddComponent(2,1,arc4.tostring)
	'
	Dim arc5 As VMCircleCounter
	arc5.Initialize(vue, "arc5", Me)
	arc5.SetSize("10rem").SetDashSpacing("0").SetStrokeWidth("2").SetActiveWidth("6")
	arc5.SetActiveCount("50").SetText("label")
	cont.AddComponent(2,2,arc5.tostring)
	'
	Dim arc6 As VMCircleCounter
	arc6.Initialize(vue, "arc6", Me)
	arc6.SetSize("10rem").SetReverse("true").SetRotate("90").SetStrokeWidth("60")
	arc6.SetActiveWidth("60").SetDashSpacing("0.6").SetStroke("black").SetActiveStroke("red")
	cont.AddComponent(2,3,arc6.tostring)
	
	vm.AddContainer(cont)
End Sub

