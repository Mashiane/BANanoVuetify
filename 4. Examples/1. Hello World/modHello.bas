B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "hellocode"
End Sub


Sub Code(vmx As BANanoVM)
	'the instance of view material
	vm = vmx
	'create a container to hold all contents for this page
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container, will be made available when we need
	cont.Hide
	
	'
	cont.addrows(1).AddColumns12
	cont.AddRows(1).AddColumns(1,12,1,1,1).AddColumns(1,12,11,11,11)
	cont.AddRows(1).AddColumns(1,12,2,2,2).AddColumns(1,12,10,10,10)
	cont.AddRows(1).AddColumns(1,12,3,3,3).AddColumns(1,12,9,9,9)
	cont.AddRows(1).AddColumns(1,12,4,4,4).AddColumns(1,12,8,8,8)
	cont.AddRows(1).AddColumns(1,12,5,5,5).AddColumns(1,12,7,7,7)
	cont.AddRows(1).AddColumns(1,12,6,6,6).AddColumns(1,12,6,6,6)
	cont.AddRows(1).AddColumns3x4
	cont.AddRows(1).AddColumns4x3
	'
	Dim rCnt As Int
	
	For rCnt = 1 To 9 
		cont.SetBorderRC(rCnt,1,"1px", vm.vue.COLOR_BLUEGREY, vm.vue.BORDER_DOTTED)
		cont.SetBorderRC(rCnt,2,"1px", vm.vue.COLOR_BLUEGREY, vm.vue.BORDER_DOTTED)
		cont.SetBorderRC(rCnt,3,"1px", vm.vue.COLOR_BLUEGREY, vm.vue.BORDER_DOTTED)
		'
		Dim rkey As String = $"lbl${rCnt}1"$
		Dim lblx As VMLabel = vm.CreateLABEL(rkey).SetText($"R${rCnt}.C${1}"$).SetParagraph
		cont.AddComponent(rCnt,1, lblx.ToString)
		'
		Dim rkey1 As String = $"lbl${rCnt}2"$
		Dim lblx1 As VMLabel = vm.CreateLABEL(rkey1).SetText($"R${rCnt}.C2"$).SetParagraph
		cont.AddComponent(rCnt,2, lblx1.ToString)

	Next
	
	Dim scont As String = cont.tostring
	Log(scont)
	
	'
	'add this container to the contents of the page
	vm.AddHTML(scont)
End Sub