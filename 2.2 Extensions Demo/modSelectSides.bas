B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.27
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "selectSidesCode"
	Public title As String = "Select Sides"
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
	cont.addrows(1).AddColumns(2,6,6,6,6)
	'
	Dim ss As VMSelectSides
	ss.Initialize(vue, "ss1", Me).SetVModel("selecteditem")
	ss.SetType("mirror")
	ss.AddItemsFromList(Array("BANanoEncrypt","BANanoExcel","BANanoFaker","BANanoPDFMake","BANanoVuetifyArcCounter", _
	"BANanoVuetifyChartKick","BANanoVuetifyCircleCounter","BANanoVuetifyConnect","BANanoVuetifyDevice", _
	"BANanoVuetifyECharts","BANanoVuetifyGoogleMap","BANanoVuetifyInfoBox","BANanoVuetifyPrism","BANanoVuetifyQuill", _
	"BANanoVuetifySelectSides"))
	Dim xs As String = ss.tostring
	cont.AddComponent(1, 1, xs)
	Log(xs)
	'
	'will show the selected item
	Dim lbl As VMLabel = vm.CreateLabel("lblx").SetText("{{ selecteditem }}")
	cont.AddComponent(1, 2, lbl.tostring)
	
	vm.AddContainer(cont)
End Sub
