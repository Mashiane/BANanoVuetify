B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "expansionPanelCode"
	Public title As String = "Expansion Panels"
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
	cont.AddRows(2).AddColumns12
	' make accordion
	Dim ep As VMExpansionPanels = vm.CreateExpansionPanels("ep", Me).SetAccordion(True)
	Dim expx As VMExpansionPanel = vm.CreateExpansionPanel("ep1", "ep", Me)
	expx.SetVFor("(item, i)", "5")
	expx.Bind(":key", "i")
	expx.Bind(":id", "i")
	expx.Header.SetText("Item")
	expx.Content.SetText(vm.Rand_LoremIpsum(1))
	ep.AddPanel(expx)	
	cont.AddComponent(1, 1, ep.tostring)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"' make accordion"$)
vue.AddCode($"Dim ep As VMExpansionPanels = vm.CreateExpansionPanels("ep", Me).SetAccordion(True)"$)
vue.AddCode($"Dim expx As VMExpansionPanel = vm.CreateExpansionPanel("ep1", "ep", Me)"$)
vue.AddCode($"expx.SetVFor("(item, i)", "5")"$)
vue.AddCode($"expx.Bind(":key", "i")"$)
vue.AddCode($"expx.Bind(":id", "i")"$)
vue.AddCode($"expx.Header.SetText("Item")"$)
vue.AddCode($"expx.Content.SetText(vm.Rand_LoremIpsum(1))"$)
vue.AddCode($"ep.AddPanel(expx)"$)
vue.AddCode($"cont.AddComponent(1, 1, ep.tostring)"$)
Main.CreateVBCode(vue, Me, "exp1code", "Accordion v-for", vue.GetSourceCode).AddToContainer(cont, 1, 1)


	Dim lbl1 As VMLabel = vm.CreateLabel("").SetH1
	lbl1.SetText(vm.Rand_LoremIpsum(1))
	
	Dim contbtna As VMContainer
	contbtna = vm.CreateContainer("contbtna", Me)
	contbtna.AddControlS(lbl1.Label, lbl1.tostring, 1, 1, 12, 12, 12, 12)

Dim contbtnb As VMContainer
	contbtnb = vm.CreateContainer("contbtnb", Me)
	contbtnb.AddControlS(lbl1.Label, lbl1.tostring, 1, 1, 12, 12, 12, 12)


Dim contbtnc As VMContainer
contbtnc = vm.CreateContainer("contbtnc", Me)
	contbtnc.AddControlS(lbl1.Label, lbl1.tostring, 1, 1, 12, 12, 12, 12)


Dim contbtnd As VMContainer
	contbtnd = vm.CreateContainer("contbtnd", Me)
	contbtnd.AddControlS(lbl1.Label, lbl1.tostring, 1, 1, 12, 12, 12, 12)


Dim contbtne As VMContainer
	contbtne = vm.CreateContainer("contbtne", Me)
	contbtne.AddControlS(lbl1.Label, lbl1.tostring, 1, 1, 12, 12, 12, 12)


Dim exppanel1 As VMExpansionPanels = vm.CreateExpansionPanels("exppanel1", Me)
exppanel1.SetAccordion(True)
exppanel1.SetActivepanel("1")
exppanel1.SetTile(True)
exppanel1.SetVisible(True)
exppanel1.AddPanel1("btna", "Banner", contbtna)
exppanel1.AddPanel1("btnb", "Squirrel", contbtnb)
exppanel1.AddPanel1("btnc", "Sky", contbtnc)
exppanel1.AddPanel1("btnd", "Planet", contbtnd)
	exppanel1.AddPanel1("btne", "Bird", contbtne)
	cont.AddComponent(2, 1, exppanel1.tostring)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim lbl1 As VMLabel = vm.CreateLabel("").SetH1"$)
vue.AddCode($"lbl1.SetText(vm.Rand_LoremIpsum(1))"$)
vue.AddCode($""$)
vue.AddCode($"Dim contbtna As VMContainer"$)
vue.AddCode($"contbtna = vm.CreateContainer("contbtna", Me)"$)
vue.AddCode($"contbtna.AddControlS(lbl1.Label, lbl1.tostring, 1, 1, 12, 12, 12, 12)"$)
vue.AddCode($""$)
vue.AddCode($"Dim contbtnb As VMContainer"$)
vue.AddCode($"contbtnb = vm.CreateContainer("contbtnb", Me)"$)
vue.AddCode($"contbtnb.AddControlS(lbl1.Label, lbl1.tostring, 1, 1, 12, 12, 12, 12)"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Dim contbtnc As VMContainer"$)
vue.AddCode($"contbtnc = vm.CreateContainer("contbtnc", Me)"$)
vue.AddCode($"contbtnc.AddControlS(lbl1.Label, lbl1.tostring, 1, 1, 12, 12, 12, 12)"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Dim contbtnd As VMContainer"$)
vue.AddCode($"contbtnd = vm.CreateContainer("contbtnd", Me)"$)
vue.AddCode($"contbtnd.AddControlS(lbl1.Label, lbl1.tostring, 1, 1, 12, 12, 12, 12)"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Dim contbtne As VMContainer"$)
vue.AddCode($"contbtne = vm.CreateContainer("contbtne", Me)"$)
vue.AddCode($"contbtne.AddControlS(lbl1.Label, lbl1.tostring, 1, 1, 12, 12, 12, 12)"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Dim exppanel1 As VMExpansionPanels = vm.CreateExpansionPanels("exppanel1", Me)"$)
vue.AddCode($"exppanel1.SetAccordion(True)"$)
vue.AddCode($"exppanel1.SetActivepanel("1")"$)
vue.AddCode($"exppanel1.SetTile(True)"$)
vue.AddCode($"exppanel1.SetVisible(True)"$)
vue.AddCode($"exppanel1.AddPanel1("btna", "Banner", contbtna)"$)
vue.AddCode($"exppanel1.AddPanel1("btnb", "Squirrel", contbtnb)"$)
vue.AddCode($"exppanel1.AddPanel1("btnc", "Sky", contbtnc)"$)
vue.AddCode($"exppanel1.AddPanel1("btnd", "Planet", contbtnd)"$)
vue.AddCode($"exppanel1.AddPanel1("btne", "Bird", contbtne)"$)
vue.AddCode($"cont.AddComponent(2, 1, exppanel1.tostring)"$)
Main.CreateVBCode(vue, Me, "exp2code", "Accordion using Containers", vue.GetSourceCode).AddToContainer(cont, 2, 1)


	vm.AddContainer(cont)
End Sub


Sub exp2codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("exp2code")
End Sub

Sub exp2codedownload_click(e As BANanoEvent)
	vue.DownloadCode("exp2code", "exp2code.txt")
End Sub


Sub exp1codecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("exp1code")
End Sub

Sub exp1codedownload_click(e As BANanoEvent)
vue.DownloadCode("exp1code", "exp1code.txt")
End Sub

Private Sub exppanel1_click(e As BANanoEvent)
	Dim expid As String = vm.GetIDFromEvent(e)
	vm.ShowSnackBar(expid)
End Sub

Sub ep_click(e As BANanoEvent)
	Dim eID As String = vm.GetIDFromEvent(e)
	vm.ShowSnackBar(eID)
End Sub