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
	cont.AddRows(10).AddColumns12
	'
	Dim tv As VMTreeView = vm.CreateTreeView("tv1", Me)
	'has checkboxes
	tv.SetSelectable(True)
	tv.AddItem("", "1", "Applications", "", Null, False)
	tv.AddItem("1", "2", "Calendar", "", Null, False)
	tv.AddItem("1", "3", "Chrome", "", Null, False)
	tv.AddItem("1", "4", "Webstorm", "", Null, False)
	tv.AddItem("", "5", "Documents", "", Null, False)
	tv.AddItem("5", "6", "vuetify", "", Null, False)
	tv.AddItem("6", "7", "src", "", Null, False)
	tv.AddItem("7", "8", "index.html", "", "html", False)
	tv.AddItem("7", "9", "bootstrap.ts", "", "ts", False)
	tv.AddItem("7", "15", "logo.png", "", "png", False)
	tv.AddItem("7", "16", ".gitignore.txt", "", "txt", False)
	tv.AddItem("7", "17", "babel.config.js", "", "js", False)
	tv.AddItem("7", "18", "package.json", "", "json", False)
	tv.AddItem("5", "10", "material2 : ", "", Null, False)
	tv.AddItem("10", "11", "src : ", "", Null, False)
	tv.AddItem("11", "12", "v-btn.ts", "", "ts", False)
	tv.AddItem("11", "13", "v-card.ts", "", "ts", False)
	tv.AddItem("11", "14", "v-window.ts", "", "ts", False)
	tv.AddToContainer(cont, 1, 1)
	'
	cont.AddLabel(2, 1, "lblx2","p", $"Selected: {{ tv1selected }}"$)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim tv As VMTreeView = vm.CreateTreeView("tv1", Me)"$)
vue.AddCode($"'has checkboxes"$)
vue.AddCode($"tv.SetSelectable(True)"$)
vue.AddCode($"tv.AddItem("", "1", "Applications", "", Null, False)"$)
vue.AddCode($"tv.AddItem("1", "2", "Calendar", "", Null, False)"$)
vue.AddCode($"tv.AddItem("1", "3", "Chrome", "", Null, False)"$)
vue.AddCode($"tv.AddItem("1", "4", "Webstorm", "", Null, False)"$)
vue.AddCode($"tv.AddItem("", "5", "Documents", "", Null, False)"$)
vue.AddCode($"tv.AddItem("5", "6", "vuetify", "", Null, False)"$)
vue.AddCode($"tv.AddItem("6", "7", "src", "", Null, False)"$)
vue.AddCode($"tv.AddItem("7", "8", "index.html", "", "html", False)"$)
vue.AddCode($"tv.AddItem("7", "9", "bootstrap.ts", "", "ts", False)"$)
vue.AddCode($"tv.AddItem("7", "15", "logo.png", "", "png", False)"$)
vue.AddCode($"tv.AddItem("7", "16", ".gitignore.txt", "", "txt", False)"$)
vue.AddCode($"tv.AddItem("7", "17", "babel.config.js", "", "js", False)"$)
vue.AddCode($"tv.AddItem("7", "18", "package.json", "", "json", False)"$)
vue.AddCode($"tv.AddItem("5", "10", "material2 : ", "", Null, False)"$)
vue.AddCode($"tv.AddItem("10", "11", "src : ", "", Null, False)"$)
vue.AddCode($"tv.AddItem("11", "12", "v-btn.ts", "", "ts", False)"$)
vue.AddCode($"tv.AddItem("11", "13", "v-card.ts", "", "ts", False)"$)
vue.AddCode($"tv.AddItem("11", "14", "v-window.ts", "", "ts", False)"$)
vue.AddCode($"tv.AddToContainer(cont, 1, 1)"$)
vue.AddCode($"'"$)
vue.AddCode($"cont.AddLabel(2, 1, "lblx2","p", ~"Selected: {{ tv1selected }}"~)"$)
Main.CreateVBCode(vue, Me, "tv1code", "Treeview with Checkboxes", vue.GetSourceCode).AddToContainer(cont, 3, 1)
'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($""$)
vue.AddCode($"'selected"$)
vue.AddCode($"Sub tv1_oninput(items As List)"$)
vue.AddCode($"Dim sCode As String = BANano.tojson(items)"$)
vue.AddCode($"vm.showsnackbar("Selected: " & sCode)"$)
vue.AddCode($"End Sub"$)
Main.CreateVBCode(vue, Me, "tv1codechecked", "TreeView Get Checked", vue.GetSourceCode).AddToContainer(cont, 4, 1)
	'
	Dim tv2 As VMTreeView = vm.CreateTreeView("tv2", Me)
	tv2.SetActivatable(True)
	tv2.AddItem("", "1", "Applications", "", Null, False)
	tv2.AddItem("1", "2", "Calendar", "", Null, False)
	tv2.AddItem("1", "3", "Chrome", "", Null, False)
	tv2.AddItem("1", "4", "Webstorm", "", Null, False)
	tv2.AddItem("", "5", "Documents", "", Null, False)
	tv2.AddItem("5", "6", "vuetify", "", Null, False)
	tv2.AddItem("6", "7", "src", "", Null, False)
	tv2.AddItem("7", "8", "index.html", "", "html", False)
	tv2.AddItem("7", "9", "bootstrap.ts", "", "ts", False)
	tv2.AddItem("7", "15", "logo.png", "", "png", False)
	tv2.AddItem("7", "16", ".gitignore.txt", "", "txt", False)
	tv2.AddItem("7", "17", "babel.config.js", "", "js", False)
	tv2.AddItem("7", "18", "package.json", "", "json", False)
	tv2.AddItem("5", "10", "material2 : ", "", Null, False)
	tv2.AddItem("10", "11", "src : ", "", Null, False)
	tv2.AddItem("11", "12", "v-btn.ts", "", "ts", False)
	tv2.AddItem("11", "13", "v-card.ts", "", "ts", False)
	tv2.AddItem("11", "14", "v-window.ts", "", "ts", False)
	tv2.AddToContainer(cont, 5, 1)
	'
	cont.AddLabel(6, 1, "lblxx3","p", $"Active: {{ tv2active }}"$)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim tv2 As VMTreeView = vm.CreateTreeView("tv2", Me)"$)
vue.AddCode($"tv2.SetActivatable(True)"$)
vue.AddCode($"tv2.AddItem("", "1", "Applications", "", Null, False)"$)
vue.AddCode($"tv2.AddItem("1", "2", "Calendar", "", Null, False)"$)
vue.AddCode($"tv2.AddItem("1", "3", "Chrome", "", Null, False)"$)
vue.AddCode($"tv2.AddItem("1", "4", "Webstorm", "", Null, False)"$)
vue.AddCode($"tv2.AddItem("", "5", "Documents", "", Null, False)"$)
vue.AddCode($"tv2.AddItem("5", "6", "vuetify", "", Null, False)"$)
vue.AddCode($"tv2.AddItem("6", "7", "src", "", Null, False)"$)
vue.AddCode($"tv2.AddItem("7", "8", "index.html", "", "html", False)"$)
vue.AddCode($"tv2.AddItem("7", "9", "bootstrap.ts", "", "ts", False)"$)
vue.AddCode($"tv2.AddItem("7", "15", "logo.png", "", "png", False)"$)
vue.AddCode($"tv2.AddItem("7", "16", ".gitignore.txt", "", "txt", False)"$)
vue.AddCode($"tv2.AddItem("7", "17", "babel.config.js", "", "js", False)"$)
vue.AddCode($"tv2.AddItem("7", "18", "package.json", "", "json", False)"$)
vue.AddCode($"tv2.AddItem("5", "10", "material2 : ", "", Null, False)"$)
vue.AddCode($"tv2.AddItem("10", "11", "src : ", "", Null, False)"$)
vue.AddCode($"tv2.AddItem("11", "12", "v-btn.ts", "", "ts", False)"$)
vue.AddCode($"tv2.AddItem("11", "13", "v-card.ts", "", "ts", False)"$)
vue.AddCode($"tv2.AddItem("11", "14", "v-window.ts", "", "ts", False)"$)
vue.AddCode($"tv2.AddToContainer(cont, 5, 1)"$)
vue.AddCode($"'"$)
vue.AddCode($"cont.AddLabel(6, 1, "lblxx3","p", ~"Active: {{ tv2active }}"~)"$)
vue.AddCode($""$)
Main.CreateVBCode(vue, Me, "tv2code", "TreeView Node Click", vue.GetSourceCode).AddToContainer(cont, 7, 1)
'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($""$)
vue.AddCode($"'active"$)
vue.AddCode($"Sub tv2_updateactive(items As List)"$)
vue.AddCode($"Dim sCode As String = BANano.tojson(items)"$)
vue.AddCode($"vm.showsnackbar("Active: " & sCode)"$)
vue.AddCode($"End Sub"$)
Main.CreateVBCode(vue, Me, "tv2codeclick", "TreeView Node Click Event", vue.GetSourceCode).AddToContainer(cont, 8, 1)


	'add container to page
	vm.AddContainer(cont)
End Sub


Sub tv1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("tv1code")
End Sub

Sub tv1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("tv1code", "tv1code.txt")
End Sub


'active
Sub tv2_updateactive(items As List)
	Dim sCode As String = BANano.tojson(items)
	vm.showsnackbar("Active: " & sCode)
End Sub

'selected
Sub tv1_oninput(items As List)
	Dim sCode As String = BANano.tojson(items)
	vm.showsnackbar("Selected: " & sCode)
End Sub


Sub tv1codecheckedcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("tv1codechecked")
End Sub

Sub tv1codecheckeddownload_click(e As BANanoEvent)
	vue.DownloadCode("tv1codechecked", "tv1codechecked.txt")
End Sub


Sub tv2codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("tv2code")
End Sub

Sub tv2codedownload_click(e As BANanoEvent)
	vue.DownloadCode("tv2code", "tv2code.txt")
End Sub


Sub tv2codeclickcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("tv2codeclick")
End Sub

Sub tv2codeclickdownload_click(e As BANanoEvent)
	vue.DownloadCode("tv2codeclick", "tv2codeclick.txt")
End Sub

