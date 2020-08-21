B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "paginationCode"
	Public title As String = "Pagination"
	Private vm As BANanoVM
	Private vue As BANanoVue
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	cont.AddRows(2).AddColumns12
	'hide this container
	cont.Hide
	'
	Dim pgnpagination1 As VMPagination
	pgnpagination1.Initialize(vue, "pgnpagination1", Me)
	pgnpagination1.SetCircle(True)
	pgnpagination1.SetColor("blue")
	pgnpagination1.SetLength("10")
	pgnpagination1.SetVisible(True)
	pgnpagination1.SetOnInput("pgnpagination1_input")
	pgnpagination1.SetOnNext("pgnpagination1_next")
	pgnpagination1.SetOnPrevious("pgnpagination1_previous")
	pgnpagination1.AddToContainer(cont,1,1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim pgnpagination1 As VMPagination"$)
vue.AddCode($"pgnpagination1.Initialize(vue, "pgnpagination1", Me)"$)
vue.AddCode($"pgnpagination1.SetCircle(True)"$)
vue.AddCode($"pgnpagination1.SetColor("blue")"$)
vue.AddCode($"pgnpagination1.SetLength("10")"$)
vue.AddCode($"pgnpagination1.SetVisible(True)"$)
vue.AddCode($"pgnpagination1.SetOnInput("pgnpagination1_input")"$)
vue.AddCode($"pgnpagination1.SetOnNext("pgnpagination1_next")"$)
vue.AddCode($"pgnpagination1.SetOnPrevious("pgnpagination1_previous")"$)
vue.AddCode($"pgnpagination1.AddToContainer(cont,1,1)"$)
Main.CreateVBCode(vue, Me, "pagi1code", "Pagination", vue.GetSourceCode).AddToContainer(cont, 1, 1)
'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($""$)
vue.AddCode($"Private Sub pgnpagination1_input(value As Object)"$)
vue.AddCode($"vm.ShowSnackBarSuccess(value)"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Private Sub pgnpagination1_next(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBar("Next...")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Private Sub pgnpagination1_previous(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBar("Previous....")"$)
vue.AddCode($"End Sub"$)
Main.CreateVBCode(vue, Me, "pagi1clickcode", "Pagination Events", vue.GetSourceCode).AddToContainer(cont, 2, 1)


	'add container to page
	vm.AddContainer(cont)
End Sub

Private Sub pgnpagination1_input(value As Object)
	vm.ShowSnackBarSuccess(value)
End Sub
	

Private Sub pgnpagination1_next(e As BANanoEvent)
	vm.ShowSnackBar("Next...")
End Sub

Private Sub pgnpagination1_previous(e As BANanoEvent)
vm.ShowSnackBar("Previous....")
End Sub


Sub pagi1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("pagi1code")
End Sub

Sub pagi1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("pagi1code", "pagi1code.txt")
End Sub


Sub pagi1clickcodecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("pagi1clickcode")
End Sub

Sub pagi1clickcodedownload_click(e As BANanoEvent)
vue.DownloadCode("pagi1clickcode", "pagi1clickcode.txt")
End Sub

