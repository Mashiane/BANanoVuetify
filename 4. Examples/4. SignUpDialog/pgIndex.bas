B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano  'ignore
	Private vm As BANanoVM
End Sub

Sub Init
	'initialize the page
	vm.Initialize(Me, Main.appname)
	vm.NavBar.Hide
	
	'add the drawer items
	'add the code from the modules
	vm.AddPage(pgLogin.name, pgLogin)
	vm.AddPage(pgRegister.name, pgRegister)
	'show the dialog when page opens
	vm.ShowDialog("mdlsignin")
	'build the page
	vm.ux
End Sub

