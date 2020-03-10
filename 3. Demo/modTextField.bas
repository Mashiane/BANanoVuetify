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
	vm.CreateTextField("t1", Me).SetLabel("Regular").SetHint("Enter a name").SetPersistentHint(True).SetPrependIcon("place").SetSingleLine(True).SetClearable(True).SetMaxLength(25).AddToContainer(cont, 1, 1)
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
