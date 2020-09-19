B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "bottomNavCode"
	Public title As String = "Bottom Navigation"
	Private vm As BANanoVM
	Private vue As BANanoVue
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(1).AddColumns12
	'
	vm.BottomNav.Hide
	vm.BottomNav.SetVModel("botnav")
	vm.BottomNav.SetAbsolute(True)
	vm.BottomNav.SetGrow(True)
	vm.BottomNav.SetHeight("56")
	vm.BottomNav.SetShift(True)
	'add items
	vm.BottomNav.AddButton("btnaz", "Banner", "dashboard", "red", "btnaz", "A business banner", "")
	vm.BottomNav.AddButton("btnbz", "Squirrel", "account_box", "indigo", "btnbz", "Another squirrel", "")
	vm.BottomNav.AddButton("btncz", "Sky", "gavel", "green", "btncz", "Heavens", "")
	vm.BottomNav.AddButton("btndz", "Planet", "question_answer", "purple", "btndz", "Planets of the world", "")
	vm.BottomNav.AddButton("btnez", "Bird", "mdi-account", "yellow", "btnez", "This is a beautiful bird", "")
	'
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"vm.BottomNav.Hide"$)
vue.AddCode($"vm.BottomNav.SetVModel("botnav")"$)
vue.AddCode($"vm.BottomNav.SetAbsolute(True)"$)
vue.AddCode($"vm.BottomNav.SetGrow(True)"$)
vue.AddCode($"vm.BottomNav.SetHeight("56")"$)
vue.AddCode($"vm.BottomNav.SetShift(True)"$)
vue.AddCode($"'add items"$)
vue.AddCode($"vm.BottomNav.AddButton("btnaz", "Banner", "dashboard", "red", "btnaz", "A business banner", "")"$)
vue.AddCode($"vm.BottomNav.AddButton("btnbz", "Squirrel", "account_box", "indigo", "btnbz", "Another squirrel", "")"$)
vue.AddCode($"vm.BottomNav.AddButton("btncz", "Sky", "gavel", "green", "btncz", "Heavens", "")"$)
vue.AddCode($"vm.BottomNav.AddButton("btndz", "Planet", "question_answer", "purple", "btndz", "Planets of the world", "")"$)
vue.AddCode($"vm.BottomNav.AddButton("btnez", "Bird", "mdi-account", "yellow", "btnez", "This is a beautiful bird", "")"$)
pgIndex.CreateVBCode(vue, Me, "botnavcode", "Bottom Nav", vue.GetSourceCode).AddToContainer(cont, 1, 1)


	vm.AddContainer(cont)
End Sub


Sub botnavcodecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("botnavcode")
End Sub

Sub botnavcodedownload_click(e As BANanoEvent)
	vue.DownloadCode("botnavcode", "botnavcode.txt")
End Sub
