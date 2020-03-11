B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano  'ignore
	Public vm As BANanoVM
End Sub

Sub Init
	'initialize the page
	vm.Initialize(Me, Main.appname)
	'set the logo of the app
	vm.NavBar.UpdateLogo(Main.AppLogo)
	'update the title of the navbar
	vm.NavBar.UpdateTitle(Main.AppTitle)
	'set primary color for the navbar
	vm.NavBar.SetPrimary(True)
	'fix the navbar so that it does not move
	vm.NavBar.SetModeFixed(True)
	'show the hamburger button
	vm.NavBar.SetHasMenuButton(False)
	'build the drawer buttons
	BuildDrawer
	'add the pages to the app
	AddPages
	'build the page
	vm.ux
	'show the calculations page
	vm.showpage(modCalculations.Name)
End Sub


Sub BuildDrawer
End Sub

'add different 'pages' you have created add them here
'these should be code modules
Sub AddPages
	vm.AddPage(modCalculations.Name, modCalculations)
End Sub

Sub back_click(e As BANanoEvent)

End Sub

Sub confirm_ok(e As BANanoEvent)
	Dim sconfirm As String = vm.GetConfirm
	Select Case sconfirm
	'***add code here***	
	End Select
End Sub

Sub confirm_cancel(e As BANanoEvent)
	
End Sub

