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
End Sub


Sub Code
	vm = pgIndex.vm
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
	expx.Content.SetText(vm.Fake.Rand_LoremIpsum(1))
	ep.AddPanel(expx)	
	cont.AddComponent(1, 1, ep.tostring)
	'
	Dim lbl1 As VMLabel = vm.CreateLabel("").SetH1
	lbl1.SetText(vm.Fake.Rand_LoremIpsum(1))
	
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
	
	vm.AddContainer(cont)
End Sub


Private Sub exppanel1_click(e As BANanoEvent)
	Dim expid As String = vm.GetIDFromEvent(e)
	vm.ShowSnackBar(expid)
End Sub

Sub ep_click(e As BANanoEvent)
	Dim eID As String = vm.GetIDFromEvent(e)
	vm.ShowSnackBar(eID)
End Sub