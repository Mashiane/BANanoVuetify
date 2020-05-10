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
	Private sections As List
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
	'
	'BuildDrawer
	
	'add the code from the modules
	InitSections
	'show the initial page
	ShowSection(modHello.name)
	'build the page
	vm.ux
End Sub

'build list once and for all for all pages
Sub InitSections
	sections.initialize
	'
	sections.add(modHello.name)
	modHello.Code(vm)
	
End Sub

'show 1 section from available sections
Sub ShowSection(sectionName As String)
	For Each section As String In sections
		If section = sectionName Then
			vm.show(section)
		Else
			vm.hide(section)
		End If
	Next
End Sub


Sub BuildDrawer
	'vm.Drawer.AddItem("ui","whatshot","UI Elements")
	'vm.drawer.AddSubItem("ui", "avatar", "person_outline", "Avatar")
End Sub
