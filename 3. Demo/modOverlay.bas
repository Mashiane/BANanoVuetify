B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "overlayCode"
	Public title As String = "Overlay"
	Private vm As BANanoVM
	Private vue As BANanoVue
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	cont.AddRows(2).AddColumns12
	
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"'show the overlay"$)
	vue.AddCode($"vm.PageResume"$)
	vue.AddCode($"'hide the overlay"$)
	vue.AddCode($"vm.PagePause"$)
	Main.CreateVBCode(vue, Me, "overlaycode", "Overlay", vue.GetSourceCode).AddToContainer(cont, 1, 1)

	'hide this container
	cont.Hide
	'add container to page
	vm.AddContainer(cont)
	
End Sub

Sub overlaycodecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("overlaycode")
End Sub

Sub overlaycodedownload_click(e As BANanoEvent)
	vue.DownloadCode("overlaycode", "overlaycode.txt")
End Sub

