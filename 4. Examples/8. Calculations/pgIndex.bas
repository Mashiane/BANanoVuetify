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
	'add a hamburger
	vm.NavBar.AddHamburger
	vm.NavBar.Hamburger.SetVisible(True)
	'add a logo
	vm.NavBar.Logo.SetBorderRadius("50%")
	vm.NavBar.Logo.SetBorderWidth("1px")
	vm.NavBar.Logo.SetBorderColor("black")
	vm.NavBar.Logo.SetBorderStyle("solid")
	vm.NavBar.Logo.SetSize("46px","46px")
	vm.NavBar.AddLogo("./assets/sponge.png")
	vm.NavBar.Logo.Show
	vm.NavBar.AddTitle("Hello World","")
	vm.NavBar.AddSubHeading1("")
	vm.NavBar.AddSpacer
	vm.NavBar.SetVisible(True)
	'set primary color for the navbar
	vm.NavBar.SetPrimary(True)
	'fix the navbar so that it does not move
	vm.NavBar.SetModeFixed(True)
	'set the logo of the app
	vm.NavBar.UpdateLogo(Main.AppLogo)
	'update the title of the navbar
	vm.NavBar.UpdateTitle(Main.AppTitle)
	
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

