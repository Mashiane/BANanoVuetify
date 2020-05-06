B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "textfieldCode"
	Public title As String = "Text Field"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(10).AddColumns2x6
	
	'
	Dim mytxt As VMTextField = vm.CreateTextField("t1", Me).SetLabel("Regular").SetHint("Enter a name").SetPersistentHint(True)
	mytxt.SetPrependIcon("place")
	mytxt.SetPrependInnerIcon("mdi-account-circle-outline")
	mytxt.SetAppendIcon("mdi-caravan")
	mytxt.SetAppendOuterIcon("mdi-map-marker-radius")
	mytxt.SetSingleLine(True).SetClearable(True).SetMaxLength(25)
	mytxt.SetVModel("t1data")
	'
	'events
	mytxt.SetOnKeydown(Me, "t1_keydown")
	mytxt.SetOnClickAppend(Me, "t1append_click")
	mytxt.SetOnClickAppendOuter(Me, "t1appendouter_click")
	mytxt.SetOnClickPrepend(Me, "t1prepend_click")
	mytxt.SetOnClickPrependInner(Me, "t1prependinner_click")
	mytxt.SetOnClickClear(Me, "t1_clear")
	mytxt.AddToContainer(cont, 1, 1)
	'
	vm.CreateTextField("t2", Me).SetLabel("Solo").SetPlaceholder("Text fields").SetPrependInnerIcon("place").SetSolo(True).SetClearable(True).SetCounter(25).AddToContainer(cont, 1, 2)
	'
	vm.CreateTextField("t3", Me).SetLabel("Filled").SetAppendIcon("place").SetFilled(True).SetClearable(True).AddToContainer(cont, 2, 1)
	'
	vm.CreateTextField("t4", Me).SetLabel("Outline").SetPrefix("$").SetAppendOuterIcon("place").SetValue("10").Setoutlined(True).SetClearable(True).AddToContainer(cont, 2, 2)
	'
	vm.CreateTextField("t5", Me).SetVModel("firstname").SetLabel("Filled Shaped").SetCounter(25).SetClearable(True).SetShaped(True).SetFilled(True).AddToContainer(cont, 3, 1)
	'
	vm.CreateTextField("t6", Me).SetVModel("lastname").SetSuffix("@gmail.com").SetLabel("Outline Shaped").SetClearable(True).SetShaped(True).SetOutlined(True).AddToContainer(cont, 3, 2)
	'
	vm.CreateTextField("p1", Me).SetLabel("Password").SetPassword(True,True).SetName("password",False).SetHint("At least enter 8 characters.").SetCounter(8).AddToContainer(cont, 4, 1)
	vm.AddContainer(cont)
End Sub

Sub t1_clear(e As BANanoEvent)
	vm.ShowSnackBar("t1 clear")
End Sub


Sub t1_keydown(e As BANanoEvent)
	vm.NavBar.UpdateTitle($"t1 keydown..."$)
End Sub

Sub t1append_click(e As BANanoEvent)
	vm.ShowSnackBar("append click")
End Sub

Sub t1appendouter_click(e As BANanoEvent)
	vm.ShowSnackBar("append-outer click")
End Sub

Sub t1prepend_click(e As BANanoEvent)
	vm.ShowSnackBar("prepend click")

End Sub

Sub t1prependinner_click(e As BANanoEvent)
	vm.ShowSnackBar("prepend-inner click")
End Sub

