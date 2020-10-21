B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "fileinputCode"
	Public title As String = "File Input"
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
	cont.AddRows(12).AddColumns(1, 12, 12, 12, 12)
	'
	vm.CreateFileInput("fi1", Me).SetMultiple(True).SetLabel("File input").SetVModel("myfiles").SetPlaceholder("Please choose some files").AddToContainer(cont, 1, 1)
	
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateFileInput("fi1", Me).SetMultiple(True).SetLabel("File input").SetVModel("myfiles").SetPlaceholder("Please choose some files").AddToContainer(cont, 1, 1)"$)
	pgIndex.CreateVBCode(vue, Me, "fileinput", "File Input", vue.GetSourceCode).AddToContainer(cont, 1, 1)
	'
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"'file change"$)
	vue.AddCode($"Sub fi1_change(fileList As List)"$)
	vue.AddCode($"For Each obj As Object In fileList"$)
	vue.AddCode($"Dim fo As FileObject = BANanoShared.GetFileDetails(obj)"$)
	vue.AddCode($"Log(fo.filename)"$)
	vue.AddCode($"Log(fo.fileDate)"$)
	vue.AddCode($"Log(fo.filesize)"$)
	vue.AddCode($"Log(fo.filetype)"$)
	vue.AddCode($"Log("***")"$)
	vue.AddCode($"Next"$)
	vue.AddCode($"End Sub"$)
	pgIndex.CreateVBCode(vue, Me, "filechange", "Multiple Files Change Event", vue.GetSourceCode).AddToContainer(cont, 1, 1)

	'
	vm.CreateFileInput("fi2", Me).SetAccept("image/*").SetLabel("File input").SetPrependIcon("mdi-camera").SetHideInput(True).AddToContainer(cont, 2, 1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"vm.CreateFileInput("fi2", Me).SetAccept("image/*").SetLabel("File input").SetPrependIcon("mdi-camera").SetHideInput(True).AddToContainer(cont, 2, 1)"$)
pgIndex.CreateVBCode(vue, Me, "singlefile", "Single File", vue.GetSourceCode).AddToContainer(cont, 2, 1)

	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($""$)
	vue.AddCode($"Sub fi2_change(fObj As Map)"$)
	vue.AddCode($"Try"$)
	vue.AddCode($"Dim fO As FileObject = BANanoShared.GetFileDetails(fObj)"$)
	vue.AddCode($"vm.ShowSnackBarSuccess(fO.filename)"$)
	vue.AddCode($"Catch"$)
	vue.AddCode($"Log("myfile_change Error")"$)
	vue.AddCode($"End Try"$)
	vue.AddCode($"End Sub"$)
	pgIndex.CreateVBCode(vue, Me, "multipleoff", "Single File Change Event", vue.GetSourceCode).AddToContainer(cont, 2, 1)
	
	'
	vm.CreateFileInput("fi3", Me).SetChips(True).SetLabel("File input (with chips)").AddToContainer(cont, 3, 1)
	'
	vm.CreateFileInput("fi4", Me).SetSmallChips(True).SetLabel("File input (with small chips)").AddToContainer(cont, 4, 1)
	'
	vm.CreateFileInput("fi5", Me).SetShowSize(True).SetLabel("File input (show size)").AddToContainer(cont, 5, 1)
	'
	vm.CreateFileInput("fi6", Me).SetMultiple(True).SetShowSize(True).SetCounter(True).SetLabel("File input (show size & counter)").AddToContainer(cont, 6, 1)
	'
	vm.CreateFileInput("fi7", Me).SetFilled(True).SetPrependIcon("mdi-camera").SetLabel("File input (custom)").AddToContainer(cont, 7, 1)
	'
	vm.CreateFileInput("fi8", Me).SetOutlined(True).SetDense(True).SetLabel("File input (custom)").AddToContainer(cont, 8, 1)
	'
	Dim fi9 As VMFileInput = vm.CreateFileInput("fi9", Me).SetVModel("files").SetColorIntensity(vm.vue.COLOR_DEEPPURPLE, vm.vue.INTENSITY_ACCENT4)
	fi9.SetCounter(True).SetLabel("File Input").SetMultiple(True).SetPlaceholder("Select your files")
	fi9.SetPrependIcon("mdi-paperclip").SetOutlined(True).SetShowSize("1000").AddToContainer(cont, 9, 1)
	'
	


	'add container to page
	vm.AddContainer(cont)
End Sub


Sub singlefilecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("singlefile")
End Sub

Sub singlefiledownload_click(e As BANanoEvent)
	vue.DownloadCode("singlefile", "singlefile.txt")
End Sub



Sub multipleoffcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("multipleoff")
End Sub

Sub multipleoffdownload_click(e As BANanoEvent)
	vue.DownloadCode("multipleoff", "multipleoff.txt")
End Sub


Sub filechangecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("filechange")
End Sub

Sub filechangedownload_click(e As BANanoEvent)
	vue.DownloadCode("filechange", "filechange.txt")
End Sub



Sub fileinputcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("fileinput")
End Sub

Sub fileinputdownload_click(e As BANanoEvent)
	vue.DownloadCode("fileinput", "fileinput.txt")
End Sub



'file change
Sub fi1_change(fileList As List)
	Dim sb As StringBuilder
	sb.initialize
	For Each obj As Object In fileList
		Dim fo As FileObject = BANanoShared.GetFileDetails(obj)
		Log(fo.filename)
		Log(fo.fileDate)
		Log(fo.filesize)
		Log(fo.filetype)
		Log("***")
		sb.append(fo.filename).append(CRLF)
	Next
	vm.ShowSnackBarSuccess(sb.tostring)
End Sub

'file change
Sub fi2_change(fileList As Map)
	Dim fo As FileObject = BANanoShared.GetFileDetails(fileList)
	vm.ShowSnackBarSuccess(fo.filename)
End Sub