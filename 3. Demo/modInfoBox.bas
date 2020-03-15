B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "infoboxcode"
	Private allspent As VMInfoBox
	Private mostspentby As VMInfoBox
	Private mostspenton As VMInfoBox
	Private spentthisyear As VMInfoBox
	Public Title As String = "Info Box"
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.AddRows(1).AddColumns4x3
	allspent = vm.CreateInfoBox("allspent", Me).SetIcon("attach_money")
	allspent.SetFrom("0")
	allspent.SetTo("3967")
	allspent.SetText("Overall Spent")
	allspent.SetIconBackgroundColor(vm.vue.Colors.green)
	allspent.SetHoverExpandEffect(True)
	cont.AddComponent(1,1,allspent.tostring)
	'
	mostspentby = vm.CreateInfoBox("mostspentby", Me).SetIcon("insert_chart")
	mostspentby.SetFrom("0")
	mostspentby.SetTo("1800")
	mostspentby.SetText("Cheque")
	mostspentby.SetIconBackgroundColor(vm.vue.Colors.Orange)
	mostspentby.SetHoverExpandEffect(True)
	cont.AddComponent(1,2,mostspentby.tostring)
	'
	mostspenton = vm.CreateInfoBox("mostspenton", Me).SetIcon("insert_chart")
	mostspenton.SetFrom("0")
	mostspenton.SetTo("1600")
	mostspenton.SetText("Shopping")
	mostspenton.SetIconBackgroundColor(vm.vue.Colors.blue)
	mostspenton.SetHoverExpandEffect(True)
	cont.AddComponent(1,3,mostspenton.tostring)
	'
	spentthisyear = vm.CreateInfoBox("spentthisyear", Me).SetIcon("attach_money")
	spentthisyear.SetFrom("0")
	spentthisyear.SetTo("2000")
	spentthisyear.SetText("Spent This Year")
	spentthisyear.SetIconBackgroundColor(vm.vue.Colors.pink)
	spentthisyear.SetHoverExpandEffect(True)
	cont.AddComponent(1,4,spentthisyear.tostring)
	
	vm.AddContainer(cont)
End Sub

Sub allspent_click(e As BANanoEvent)
	vm.ShowSnackBar("All Spent!")
End Sub

Sub mostspentby_click(e As BANanoEvent)
	vm.ShowSnackBar("Most Spent By!")
End Sub

Sub mostspenton_click(e As BANanoEvent)
	vm.ShowSnackBar("Most Spent On!")
End Sub

Sub spentthisyear_click(e As BANanoEvent)
	vm.ShowSnackBar("Spent this Year!")
End Sub