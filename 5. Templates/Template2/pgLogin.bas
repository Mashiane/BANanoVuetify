B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.45
@EndOfDesignText@

'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Public Name As String = "LoginCode"
	Public Title As String = "Login"
	Private vm As BANanoVM
	Private BANano As BANano  'ignore
	Private cont As VMContainer
	Private Mode As String
End Sub

Sub Code
	'Establish a reference to the app
	vm = pgIndex.vm
	'create a container to hold all contents based on the page name
	cont = vm.CreateContainer(Name, Me)
	'hide the container
	cont.Hide
	'add the container to the page
	vm.AddContainer(cont)
	'add method to get all records
End Sub

'show the page
Sub Show
	'the navbar is visible for this page
	vm.NavBar.Hide
	'the drawer should be hidden for this page
	vm.Drawer.Hide
	'2. Show the page and hide others
	vm.ShowPage(Name)
End Sub