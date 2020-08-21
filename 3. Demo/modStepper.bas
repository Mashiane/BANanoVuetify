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
	Private vue As BANanoVue
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	cont.AddRows(4).AddColumns12
	'
	'create containers and content
	Dim lbl1 As VMLabel = vm.CreateLabel("").SetParagraph
	lbl1.SetText(vm.Rand_LoremIpsum(1))
	Dim contbtna As VMContainer
	contbtna = vm.CreateContainer("contxa", Me)
	contbtna.AddControlS(lbl1.Label, lbl1.tostring, 1, 1, 12, 12, 12, 12)
	'
	Dim lbl2 As VMLabel = vm.CreateLabel("").SetParagraph
	lbl2.SetText(vm.Rand_LoremIpsum(1))
	Dim contbtnb As VMContainer
	contbtnb = vm.CreateContainer("contxb", Me)
	contbtnb.AddControlS(lbl2.Label, lbl2.tostring, 1, 1, 12, 12, 12, 12)

	'
	Dim lbl3 As VMLabel = vm.CreateLabel("").SetParagraph
	lbl3.SetText(vm.Rand_LoremIpsum(1))
	Dim contbtnc As VMContainer
	contbtnc = vm.CreateContainer("contxc", Me)
	contbtnc.AddControlS(lbl3.Label, lbl3.tostring, 1, 1, 12, 12, 12, 12)


	Dim stepper As VMStepper = vm.CreateStepper("a", Me).SetOnChange(Me, "stepperChange")
	stepper.AddStep("astep1", "Step 1", "Name of Step 1", True, contbtna.Tostring)
	stepper.AddStep("astep2", "Step 2", "Name of Step 2", True, contbtnb.ToString)
	stepper.AddStep("astep3", "Step 3", "Name of Step 3", True, contbtnc.ToString)
	stepper.AddToContainer(cont, 1, 1)
	'
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"'create containers and content"$)
	vue.AddCode($"Dim lbl1 As VMLabel = vm.CreateLabel("").SetParagraph"$)
	vue.AddCode($"lbl1.SetText(vm.Rand_LoremIpsum(1))"$)
	vue.AddCode($"Dim contbtna As VMContainer"$)
	vue.AddCode($"contbtna = vm.CreateContainer("contxa", Me)"$)
	vue.AddCode($"contbtna.AddControlS(lbl1.Label, lbl1.tostring, 1, 1, 12, 12, 12, 12)"$)
	vue.AddCode($"'"$)
	vue.AddCode($"Dim lbl2 As VMLabel = vm.CreateLabel("").SetParagraph"$)
	vue.AddCode($"lbl2.SetText(vm.Rand_LoremIpsum(1))"$)
	vue.AddCode($"Dim contbtnb As VMContainer"$)
	vue.AddCode($"contbtnb = vm.CreateContainer("contxb", Me)"$)
	vue.AddCode($"contbtnb.AddControlS(lbl2.Label, lbl2.tostring, 1, 1, 12, 12, 12, 12)"$)
	vue.AddCode($""$)
	vue.AddCode($"'"$)
	vue.AddCode($"Dim lbl3 As VMLabel = vm.CreateLabel("").SetParagraph"$)
	vue.AddCode($"lbl3.SetText(vm.Rand_LoremIpsum(1))"$)
	vue.AddCode($"Dim contbtnc As VMContainer"$)
	vue.AddCode($"contbtnc = vm.CreateContainer("contxc", Me)"$)
	vue.AddCode($"contbtnc.AddControlS(lbl3.Label, lbl3.tostring, 1, 1, 12, 12, 12, 12)"$)
	Main.CreateVBCode(vue, Me, "step1code", "Creating Containers with Content", vue.GetSourceCode).AddToContainer(cont, 1, 1)

	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($""$)
vue.AddCode($"Dim stepper As VMStepper = vm.CreateStepper("a", Me).SetOnChange(Me, "stepperChange")"$)
vue.AddCode($"stepper.AddStep("astep1", "Step 1", "Name of Step 1", True, contbtna.Tostring)"$)
vue.AddCode($"stepper.AddStep("astep2", "Step 2", "Name of Step 2", True, contbtnb.ToString)"$)
vue.AddCode($"stepper.AddStep("astep3", "Step 3", "Name of Step 3", True, contbtnc.ToString)"$)
vue.AddCode($"stepper.AddToContainer(cont, 1, 1)"$)
vue.AddCode($"'"$)
Main.CreateVBCode(vue, Me, "step2code", "Stepper", vue.GetSourceCode).AddToContainer(cont, 1, 1)

	
	
	'
	Dim stepper2 As VMStepper = vm.CreateStepper("b", Me).SetOnChange(Me, "stepperChange")
	stepper2.AddStep("bstep1", "Step 1", "", True, contbtna.ToString).SetStepComplete("bstep1",True)
	stepper2.AddStep("bstep2", "Step 2", "", True, contbtnb.ToString).SetStepComplete("bstep2", True)
	stepper2.AddStep("bstep3", "Step 3", "", True, contbtnc.ToString)
	stepper2.AddToContainer(cont, 2, 2)
	'
	Dim stepper3 As VMStepper = vm.CreateStepper("c", Me).SetVertical(True).SetOnChange(Me, "stepperChange")
	stepper3.AddStep("cstep1", "Step 1", "", True, contbtna.ToString)
	stepper3.AddStep("cstep2", "Step 2", "", True, contbtnb.ToString)
	stepper3.AddStep("cstep3", "Step 3", "", True, contbtnc.ToString)
	stepper3.AddToContainer(cont, 3, 1)
	'	
	Dim stepper4 As VMStepper = vm.CreateStepper("d", Me).SetVertical(True).SetAltLabels(True).SetOnChange(Me, "stepperChange")
	stepper4.AddStep("dstep1", "Step 1", "", True, contbtna.ToString)
	stepper4.AddStep("dstep2", "Step 2", "", True, contbtnb.ToString)
	stepper4.AddStep("dstep3", "Step 3", "", True, contbtnc.ToString)
	stepper4.AddToContainer(cont, 4, 1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim stepper4 As VMStepper = vm.CreateStepper("d", Me).SetVertical(True).SetAltLabels(True).SetOnChange(Me, "stepperChange")"$)
vue.AddCode($"stepper4.AddStep("dstep1", "Step 1", "", True, contbtna.ToString)"$)
vue.AddCode($"stepper4.AddStep("dstep2", "Step 2", "", True, contbtnb.ToString)"$)
vue.AddCode($"stepper4.AddStep("dstep3", "Step 3", "", True, contbtnc.ToString)"$)
vue.AddCode($"stepper4.AddToContainer(cont, 4, 1)"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Sub stepperChange(numx As Int)		'ignore"$)
vue.AddCode($"vm.ShowSnackBar(numx)"$)
vue.AddCode($"End Sub"$)
Main.CreateVBCode(vue, Me, "step3code", "Stepper with Event", vue.GetSourceCode).AddToContainer(cont, 4, 1)



	'add container to page
	vm.AddContainer(cont)
End Sub


Sub step2codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("step2code")
End Sub

Sub step2codedownload_click(e As BANanoEvent)
	vue.DownloadCode("step2code", "step2code.txt")
End Sub


Sub step3codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("step3code")
End Sub

Sub step3codedownload_click(e As BANanoEvent)
	vue.DownloadCode("step3code", "step3code.txt")
End Sub

Sub stepperChange(numx As Int)		'ignore
	vm.ShowSnackBar(numx)
End Sub


Sub step1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("step1code")
End Sub

Sub step1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("step1code", "step1code.txt")
End Sub

