B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "textareaCode"
	Public title As String = "Text Area"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(10).AddColumns2x6
	'
	vm.CreateTextArea("ta1", Me).SetLabel("Prepend Icon").SetRows(1).SetPrependIcon("comment").AddToContainer(cont, 1, 1)
	'
	vm.CreateTextArea("ta2", Me).SetLabel("Prepend Inner Icon").SetPrependInnerIcon("comment").AddToContainer(cont, 1, 2)
	'
	vm.CreateTextArea("ta3", Me).SetLabel("Prepend Outer Icon").SetAppendOuterIcon("comment").AddToContainer(cont, 2, 1)
	'
	Dim ta4 As VMTextField = vm.CreateTextArea("ta4", Me)
	ta4.SetLabel("Label").SetAutoGrow(True).SetName("ta4", False).SetFilled(True)
	ta4.SetValue("The Woodman set to work at once, and so sharp was his axe that the tree was soon chopped nearly through.").AddToContainer(cont, 2, 2)
	'
	vm.CreateTextArea("ta5", Me).SetLabel("Background").SetBackgroundColorIntensity(vm.vue.COLOR_AMBER, vm.vue.INTENSITY_ACCENT1).AddToContainer(cont, 3, 1)
	'
	vm.CreateTextArea("ta6", Me).SetLabel("Clearable").SetClearable(True).AddToContainer(cont, 3, 2)
	'
	vm.CreateTextArea("ta7", Me).SetLabel("Clearable").SetOutlined(True).SetShaped(True).AddToContainer(cont, 4, 1)
	'
	vm.AddContainer(cont)
End Sub
