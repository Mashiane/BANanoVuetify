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
	'the navbar will be hidden
	vm.NavBar.Hide
	vm.Drawer.Hide
	'add the code from the modules
	vm.AddPage(pgLogin.name, pgLogin)
	'show the dialog when page opens
	vm.ShowDialog("mdlsignin")
	'build the page
	vm.ux
End Sub

