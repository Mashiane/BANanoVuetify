B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "formCode"
	Public title As String = "Form"
	Private vm As BANanoVM
	Private frmUser As VMForm
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(10).AddColumns(1, 12, 12, 12, 12)
	'
	vm.setstatesingle("items", Array("Programming", "Design", "Vue", "Vuetify"))
	'
	frmUser = vm.CreateForm("frmUser", Me)
	'add a row with 3 columns each spanning 4 spaces
	frmUser.Container.AddRows(2).AddColumns(3, 12, 4, 4, 4) 
	'
	Dim txtFirstName As VMTextField = vm.CreateTextField("firstname", Me).SetVModel("firstname").SetCounter("10").SetLabel("First Name").SetRequired(True)
	frmUser.Container.AddComponent(1,1, txtFirstName.ToString)
	'
	Dim txtLastName As VMTextField = vm.CreateTextField("lastname", Me).SetVModel("lastname").SetCounter("10").SetLabel("Last Name").SetRequired(True)
	frmUser.Container.AddComponent(1,2, txtLastName.ToString)
	'
	Dim txtEmail As VMTextField = vm.CreateTextField("email", Me).SetVModel("email").SetLabel("E-mail").SetRequired(True)
	frmUser.Container.AddComponent(1,3, txtEmail.ToString)
	'
	Dim selItems As VMSelect = vm.CreateSelect("item", Me).SetVModel("select").SetLabel("Item").SetRequired(True).SetItems("items")
	frmUser.Container.AddComponent(2,1, selItems.ToString)
	'
	Dim chk As VMCheckBox = vm.CreateCheckBox("chkAgree", Me).SetVModel("checkbox").SetLabel("Do you agree?").SetRequired(True)
	frmUser.Container.AddComponent(2,2, chk.ToString)
	'
	Dim txtLoad As VMTextField = vm.CreateTextField("txtload", Me).SetColor("success").SetLoading(True).SetDisabled(True)
	frmUser.Container.AddComponent(2,3, txtLoad.ToString)
	
	cont.AddComponent(1, 1, frmUser.ToString)
	
	'add container to page
	vm.AddContainer(cont)
End Sub
