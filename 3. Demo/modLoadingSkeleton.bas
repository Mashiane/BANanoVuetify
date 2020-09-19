B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "skeletonCode"
	Public title As String = "Skeleton Loaders"
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
	cont.AddRows(4).AddColumns2X6
	'
	Dim s1 As VMSheet = vm.createsheet("sheet1", Me).AddClass("px-3 pt-3 pb-3")
	'
	Dim skl As VMSkeletonLoader = vm.CreateSkeletonLoader("sl1", Me).AddClass("mx-auto").SetMaxWidth("300").SetType("card")
	'
	s1.AddComponent(skl.tostring)
	'
	cont.AddComponent(1, 1, s1.tostring)
	'
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"Dim s1 As VMSheet = vm.createsheet("sheet1", Me).AddClass("px-3 pt-3 pb-3")"$)
	vue.AddCode($"Dim skl As VMSkeletonLoader = vm.CreateSkeletonLoader("sl1", Me).AddClass("mx-auto").SetMaxWidth("300").SetType("card")"$)
	vue.AddCode($"s1.AddComponent(skl.tostring)"$)
	vue.AddCode($"cont.AddComponent(1, 1, s1.tostring)"$)
	pgIndex.CreateVBCode(vue, Me, "skel1code", "Skeleton", vue.GetSourceCode).AddToContainer(cont, 2, 1)


	'add container to page
	vm.AddContainer(cont)
End Sub


Sub skel1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("skel1code")
End Sub

Sub skel1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("skel1code", "skel1code.txt")
End Sub
