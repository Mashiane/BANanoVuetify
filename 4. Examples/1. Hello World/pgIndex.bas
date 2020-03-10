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
	'update the nav bar title
	vm.navbar.UpdateLogo("./assets/sponge.png")
	vm.NavBar.UpdateTitle("Hello World")
	'set primary color for the navbar
	vm.NavBar.SetPrimary(True)
	'fix the navbar so that it does not move
	vm.NavBar.SetModeFixed(True)
	'show the hamburger button
	vm.NavBar.SetHasMenuButton(False)
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
