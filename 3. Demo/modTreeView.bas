B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "treeCode"
	Public title As String = "TreeView"
	Private vm As BANanoVM
	Private tv As VMTreeView
	Private BANano As BANano  'ignore
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
	cont.AddRows(5).AddColumns12
	'
	Dim tv As VMTreeView = vm.CreateTreeView("tv1", Me)
	tv.SetSelectable(True)
	tv.AddItem("", "1", "Applications", "", "", False)
	tv.AddItem("1", "2", "Calendar : app", "", "", False)
	tv.AddItem("1", "3", "Chrome : app", "", "", False)
	tv.AddItem("1", "4", "Webstorm : app", "", "", False)
	tv.AddItem("", "5", "Documents :", "", "", False)
	tv.AddItem("5", "6", "vuetify :", "", "", False)
	tv.AddItem("6", "7", "src :", "", "", False)
	tv.AddItem("7", "8", "index : ts", "", "", False)
	tv.AddItem("7", "9", "bootstrap : ts", "", "", False)
	tv.AddItem("5", "10", "material2 : ", "", "", False)
	tv.AddItem("10", "11", "src : ", "", "", False)
	tv.AddItem("11", "12", "v-btn : ts", "", "", False)
	tv.AddItem("11", "13", "v-card : ts", "", "", False)
	tv.AddItem("11", "14", "v-window : ts", "", "", False)
	tv.SetOnInput("tv1_oninput")
	'
	tv.AddToContainer(cont, 1, 1)
	'
	cont.AddLabel(1, 1, "lblx2","p", $"{{ tv1selected }}"$)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim tv As VMTreeView = vm.CreateTreeView("tv1", Me)"$)
vue.AddCode($"tv.SetSelectable(True)"$)
vue.AddCode($"tv.AddItem("", "1", "Applications", "", "", False)"$)
vue.AddCode($"tv.AddItem("1", "2", "Calendar : app", "", "", False)"$)
vue.AddCode($"tv.AddItem("1", "3", "Chrome : app", "", "", False)"$)
vue.AddCode($"tv.AddItem("1", "4", "Webstorm : app", "", "", False)"$)
vue.AddCode($"tv.AddItem("", "5", "Documents :", "", "", False)"$)
vue.AddCode($"tv.AddItem("5", "6", "vuetify :", "", "", False)"$)
vue.AddCode($"tv.AddItem("6", "7", "src :", "", "", False)"$)
vue.AddCode($"tv.AddItem("7", "8", "index : ts", "", "", False)"$)
vue.AddCode($"tv.AddItem("7", "9", "bootstrap : ts", "", "", False)"$)
vue.AddCode($"tv.AddItem("5", "10", "material2 : ", "", "", False)"$)
vue.AddCode($"tv.AddItem("10", "11", "src : ", "", "", False)"$)
vue.AddCode($"tv.AddItem("11", "12", "v-btn : ts", "", "", False)"$)
vue.AddCode($"tv.AddItem("11", "13", "v-card : ts", "", "", False)"$)
vue.AddCode($"tv.AddItem("11", "14", "v-window : ts", "", "", False)"$)
vue.AddCode($"tv.SetOnInput("tv1_oninput")"$)
vue.AddCode($"'"$)
vue.AddCode($"tv.AddToContainer(cont, 1, 1)"$)
vue.AddCode($"'"$)
Main.CreateVBCode(vue, Me, "tree1code", "TreeView", vue.GetSourceCode).AddToContainer(cont, 2, 1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($""$)
vue.AddCode($"Sub tv1_oninput(items As List)"$)
vue.AddCode($"Dim sCode As String = BANano.tojson(items)"$)
vue.AddCode($"vm.setdata("tv1selected", sCode)"$)
vue.AddCode($"End Sub"$)
Main.CreateVBCode(vue, Me, "tree1codeclick", "TreeView Selected", vue.GetSourceCode).AddToContainer(cont, 3, 1)


	'add container to page
	vm.AddContainer(cont)
	vm.setdata("tv1selected", "")
End Sub

Sub tv1_oninput(items As List)
	Dim sCode As String = BANano.tojson(items)
	vm.setdata("tv1selected", sCode)
End Sub


Sub tree1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("tree1code")
End Sub

Sub tree1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("tree1code", "tree1code.txt")
End Sub


Sub tree1codeclickcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("tree1codeclick")
End Sub

Sub tree1codeclickdownload_click(e As BANanoEvent)
	vue.DownloadCode("tree1codeclick", "tree1codeclick.txt")
End Sub

