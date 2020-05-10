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
	BuildNavBar
	BuildNavDrawer
	AddPages
	vm.ux
End Sub

Sub BuildNavBar
	'*copy code after this line
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
	vm.NavBar.AddTitle("MyYoutube","")
	vm.NavBar.AddSubHeading1("1.00")
	vm.NavBar.AddSpacer
	vm.NavBar.AddSearch("appsearch")
	vm.NavBar.AddSpacer
	vm.NavBar.SetVisible(True)

	vm.NavBar.AddItem("btnCreate", "mdi-plus", "green", "Create", "Add a video", "")
	vm.NavBar.AddIcon1("btnHelp", "help", "red", "Help", "")
	vm.NavBar.AddIcon1("btnAccount", "mdi-account", "orange", "My Profile", "")
End Sub

Sub BuildNavDrawer
	'*copy code after this line
End Sub

Sub AddPages
	'*copy code after this line
End Sub

'*IMPORTANT
Sub draweritems_click(e As BANanoEvent)
	'get the id from the event
	Dim elID As String = vm.GetIDFromEvent(e)
	Select Case elID
	'copy code below this line
	End Select
End Sub

'confirm ok click
Sub confirm_ok(e As BANanoEvent)
	Dim sconfirm As String = vm.GetConfirm
	Select Case sconfirm
	'copy code below this line
	End Select
End Sub

'confirm cancel click
Sub cancel_ok(e As BANanoEvent)

End Sub

'alert ok
Sub alert_ok(e As BANanoEvent)

End Sub

'confirm cancel
Sub confirm_cancel(e As BANanoEvent)

End Sub

Private Sub btnCreate_click(e As BANanoEvent)
	vm.ShowSnackBar("Create")
End Sub

Private Sub btnHelp_click(e As BANanoEvent)
	vm.ShowSnackBar("Help")
End Sub

Private Sub btnAccount_click(e As BANanoEvent)
	vm.ShowSnackBar("Account")
End Sub


'fire when search looses focus
Private Sub appsearch_change(e As BANanoEvent)
	'get the search phrase
	Dim sappsearch As String = vm.GetData("appsearch")
	vm.ShowSnackBar(sappsearch)
End Sub
