B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Public name As String = "circleColorCode"
	Public title As String = "Circle Color"
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
	cont.addrows(1).AddColumns4x3
	'
	Dim arc As VMCircleChoice
	arc.Initialize(vue, "color1", Me)
	arc.SetRadius("10em")
	arc.SetOnUpateColor("colorPick")
	cont.AddComponent(1,1,arc.tostring)
	
	
	vm.AddContainer(cont)
End Sub

Sub colorPick(index As Object, color As String)
	Log(index)
	Log(color)
End Sub
