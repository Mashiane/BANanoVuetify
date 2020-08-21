B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "sparkLineCode"
	Public title As String = "SparkLine"
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
	
	Dim sparksparkline1 As VMSparkLine
	sparksparkline1.Initialize(vue, "sparksparkline1", Me)
	sparksparkline1.SetValue(Array(0, 2, 5 ,9 ,5 ,10 ,3, 5, 0, 0, 1, 8, 2, 9, 0))
	sparksparkline1.SetGradient(Array("#f72047", "#ffd200", "#1feaea"))
	sparksparkline1.SetSmooth(10)
	sparksparkline1.SetPadding("8")
	sparksparkline1.SetLinewidth("2")
	sparksparkline1.SetStrokeLineCap("round")
	sparksparkline1.SetGradientdirection("top")
	sparksparkline1.SetFill(False)
	sparksparkline1.SetType("trend")
	sparksparkline1.SetAutoLineWidth(False)
	sparksparkline1.SetVisible(True)
	sparksparkline1.SetAutoDraw(True)
	sparksparkline1.AddToContainer(cont,1,1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim sparksparkline1 As VMSparkLine"$)
vue.AddCode($"sparksparkline1.Initialize(vue, "sparksparkline1", Me)"$)
vue.AddCode($"sparksparkline1.SetValue(Array(0, 2, 5 ,9 ,5 ,10 ,3, 5, 0, 0, 1, 8, 2, 9, 0))"$)
vue.AddCode($"sparksparkline1.SetGradient(Array("#f72047", "#ffd200", "#1feaea"))"$)
vue.AddCode($"sparksparkline1.SetSmooth(10)"$)
vue.AddCode($"sparksparkline1.SetPadding("8")"$)
vue.AddCode($"sparksparkline1.SetLinewidth("2")"$)
vue.AddCode($"sparksparkline1.SetStrokeLineCap("round")"$)
vue.AddCode($"sparksparkline1.SetGradientdirection("top")"$)
vue.AddCode($"sparksparkline1.SetFill(False)"$)
vue.AddCode($"sparksparkline1.SetType("trend")"$)
vue.AddCode($"sparksparkline1.SetAutoLineWidth(False)"$)
vue.AddCode($"sparksparkline1.SetVisible(True)"$)
vue.AddCode($"sparksparkline1.SetAutoDraw(True)"$)
vue.AddCode($"sparksparkline1.AddToContainer(cont,1,1)"$)
Main.CreateVBCode(vue, Me, "sparkcode", "Sparkline", vue.GetSourceCode).AddToContainer(cont, 1, 1)


	'add container to page
	vm.AddContainer(cont)
End Sub


  
Sub sparkcodecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("sparkcode")
End Sub

Sub sparkcodedownload_click(e As BANanoEvent)
	vue.DownloadCode("sparkcode", "sparkcode.txt")
End Sub
