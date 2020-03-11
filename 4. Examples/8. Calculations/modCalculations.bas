B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public Name As String = "calcode"
	Public Title As String = "Calculations"
	Private BANano As BANano  'ignore
End Sub

Sub Code
	Log("modSkeleton.Code")
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(Name,Me)
	'hide this container
	cont.Hide
	'create 1 row with 3 columns equal to 4 spans
	cont.AddRows(2).AddColumns3x4
	
	Dim txtQty As VMTextField = vm.CreateTextField("txtqty", Me).SetLabel("Quantity").SetVModel("qty").SetTypeNumber(True)
	Dim txtRate As VMTextField = vm.CreateTextField("txtrate", Me).SetLabel("Rate").SetVModel("rate").SetTypeNumber(True)
	Dim txtTotal As VMTextField = vm.CreateTextField("txttotal", Me).SetLabel("Total").SetVModel("total").SetTypeNumber(True)
	'
	cont.AddComponent(1,1, txtQty.tostring)
	cont.AddComponent(1,2, txtRate.tostring)
	cont.AddComponent(1,3, txtTotal.tostring)
			
	'add container to the page content
	vm.AddContainer(cont)
	'when the rate and quantity changes, update the total via a callback
	'we want to watch for changes in quantity
	vm.SetWatch("qty", True, False, Me, "computetotal")
	'we want t watch for changes in rate
	vm.SetWatch("rate", True, False, Me, "computetotal")
End Sub

'set computed for the total
Sub ComputeTotal
	'get the qty
	Dim iQty As Int = vm.getstate("qty",0)
	'get the rate
	Dim iRate As Int = vm.getstate("rate", 0)
	'calculate total
	Dim iTot As Double = BANano.parseint(iQty) * BANano.parseFloat(iRate)
	
	'format the amout
	iTot = Round2(iTot, 2)
	'save the total
	vm.SetStateSingle("total", iTot)
End Sub