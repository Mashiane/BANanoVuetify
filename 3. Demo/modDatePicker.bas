B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "datePickerCode"
	Public title As String = "Date Picker"
	Private vm As BANanoVM
	Private vue As BANanoVue
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	vue.DateDisplayFormat = "DD, MMM YYYY"
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(10).AddColumns9p3
	'
	Dim dp4 As VMDateTimePicker = vm.CreateDatePicker("dp4", Me).SetVModel("dp4").SetLabel("Date of Birth").SetForInput
	dp4.AddToContainer(cont, 1, 1)
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim dp4 As VMDateTimePicker = vm.CreateDatePicker("dp4", Me).SetVModel("dp4").SetLabel("Date of Birth").SetForInput"$)
vue.AddCode($"dp4.AddToContainer(cont, 1, 1)"$)
pgIndex.CreateVBCode(vue, Me, "datep", "Date Picker", vue.GetSourceCode).AddToContainer(cont, 1, 1)

	vm.CreateLabel("lbl2").SetParagraph.SetText("Dates: {{ dp4 }}").AddToContainer(cont, 1, 2)
	'
	Dim dpx As VMDateTimePicker = vm.CreateDatePicker("dp1", Me).SetVModel("dp1")
	dpx.AddToContainer(cont, 2, 1)
	'
	vm.CreateLabel("lbl1").SetParagraph.SetText("Date: {{ dp1 }}").AddToContainer(cont, 2, 2)
	'
	Dim dp2 As VMDateTimePicker = vm.CreateDatePicker("dp2", Me).SetVModel("dp2").SetFullWidth(True)
	dp2.AddToContainer(cont, 3, 1)
	'
	Dim dp3 As VMDateTimePicker = vm.CreateDatePicker("dp3", Me).SetVModel("dp3").SetMonthPicker
	dp3.AddToContainer(cont, 3, 2)
	'
	Dim dp4 As VMDateTimePicker = vm.CreateDatePicker("dp4", Me).SetVModel("dp4").SetDateTimePicker
	dp4.AddToContainer(cont, 4, 1)
	
	vm.AddContainer(cont)
End Sub


Sub datepcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("datep")
End Sub

Sub datepdownload_click(e As BANanoEvent)
	vue.DownloadCode("datep", "datep.txt")
End Sub
