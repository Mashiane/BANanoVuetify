B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "quillCode"
	Public title As String = "Quill Editor"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(3).AddColumns12
	'
	Dim q As VMQuill = vm.CreateQuill("q1", Me).SetVModel("quill") 
	cont.AddComponent(1, 1, q.tostring)
	'
Dim sCode As String = $"Dim q As VMQuill = vm.CreateQuill("q1", Me).SetVModel("quill") 
cont.AddComponent(1, 1, q.tostring)"$
	
	Dim p As VMPrism = vm.CreatePrism("p2", Me).SetLanguage("vb").SetLineNumbers(True).SetCode(sCode)
	cont.AddComponent(3, 1, p.tostring)
	
	
	vm.AddContainer(cont)
End Sub
