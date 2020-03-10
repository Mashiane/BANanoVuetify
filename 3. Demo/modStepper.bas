B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "stepperCode"
	Public title As String = "Steppers"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	cont.AddRows(4).AddColumns(2, 12, 6, 6, 6)
	'
	Dim stepper As VMStepper = vm.CreateStepper("a", Me)
	stepper.AddStep("a_step1", "Step 1", "Name of Step 1", True, Null)
	stepper.AddStep("a_step2", "Step 2", "Name of Step 2", True, Null)
	stepper.AddStep("a_step3", "Step 3", "Name of Step 3", True, Null)
	stepper.AddToContainer(cont, 1, 1)
	'
	Dim stepper2 As VMStepper = vm.CreateStepper("b", Me)
	stepper2.AddStep("b_step1", "Step 1", "", True, Null).SetStepComplete("b_step1",True)
	stepper2.AddStep("b_step2", "Step 2", "", True, Null).SetStepComplete("b_step2", True)
	stepper2.AddStep("b_step3", "Step 3", "", True, Null)
	stepper2.AddToContainer(cont, 1, 2)
	'
	Dim stepper3 As VMStepper = vm.CreateStepper("c", Me).SetVertical(True)
	stepper3.AddStep("c_step1", "Step 1", "", True, Null)
	stepper3.AddStep("c_step2", "Step 2", "", True, Null)
	stepper3.AddStep("c_step3", "Step 3", "", True, Null)
	stepper3.AddToContainer(cont, 2, 1)
	'	
	Dim stepper4 As VMStepper = vm.CreateStepper("d", Me).SetVertical(True).SetAltLabels(True)
	stepper4.AddStep("d_step1", "Step 1", "", True, Null)
	stepper4.AddStep("d_step2", "Step 2", "", True, Null)
	stepper4.AddStep("d_step3", "Step 3", "", True, Null)
	stepper4.AddToContainer(cont, 2, 2)
	
	'add container to page
	vm.AddContainer(cont)
End Sub


