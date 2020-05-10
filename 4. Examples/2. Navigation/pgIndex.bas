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
	vm.NavBar.AddTitle("Navigation","")
	vm.NavBar.AddSubHeading1("")
	vm.NavBar.AddSpacer
	vm.NavBar.SetVisible(True)
	'set primary color for the navbar
	vm.NavBar.SetPrimary(True)
	'fix the navbar so that it does not move
	vm.NavBar.SetModeFixed(True)
	'add buttons
	vm.NavBar.AddIcon("npage1","done","Go to page 1", "")
	vm.NavBar.AddIcon("npage2","done_all","Go to page 2", "")
	
	'add the drawer items
	vm.Drawer.AddItem("page1","done", "Page 1")
	vm.Drawer.AddItem("page2","done_all", "Page 2")
	'add the code from the modules
	vm.AddPage(modPage1.name, modPage1)
	vm.addpage(modPage2.name, modPage2)
	'show this page
	vm.navbar.UpdateTitle("Navigation - Page 1")
	vm.ShowPage(modPage1.name)
	vm.Hide("npage1")
	vm.Show("npage2")
	
	'build the page
	vm.ux
End Sub

'*IMPORTANT
Sub draweritems_click(e As BANanoEvent)
	'get the id from the event
	Dim elID As String = vm.GetIDFromEvent(e)
	Select Case elID
	Case "page1"
		'update the title of the navigation bar
		vm.navbar.UpdateTitle("Navigation - Page 1")
		'show page 1
		vm.showpage(modPage1.name)
		'hide the navbar button
		vm.Hide("npage1")
		'show the navbar button
		vm.Show("npage2")
	Case "page2"
		'update the title of the navigation bar
		vm.navbar.UpdateTitle("Navigation - Page 2")
		'show page 2
		vm.showpage(modPage2.name)
		vm.Show("npage1")
		vm.Hide("npage2")
	End Select
End Sub

Sub npage1_click(e As BANanoEvent)
	vm.navbar.UpdateTitle("Navigation - Page 1")
	vm.ShowPage(modPage1.name)
	vm.Show("npage2")
	vm.Hide("npage1")
End Sub

Sub npage2_click(e As BANanoEvent)
	vm.navbar.UpdateTitle("Navigation - Page 2")
	vm.ShowPage(modPage2.name)
	vm.Show("npage1")
	vm.Hide("npage2")
End Sub
