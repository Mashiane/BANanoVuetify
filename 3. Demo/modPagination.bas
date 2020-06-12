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
	cont.AddControl(pgnpagination1.Pagination, pgnpagination1.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	'add container to page
	vm.AddContainer(cont)
End Sub

Private Sub pgnpagination1_input(value As Object)
	vm.ShowSnackBarSuccess(value)
End Sub
	

Private Sub pgnpagination1_next(e As BANanoEvent)
End Sub

Private Sub pgnpagination1_previous(e As BANanoEvent)
End Sub