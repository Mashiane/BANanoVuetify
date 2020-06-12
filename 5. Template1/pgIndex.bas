B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12, 15
Sub Process_Globals
	Private BANano As BANano  'ignore
	Public vm As BANanoVM
	Private vue As BANanoVue   'ignore
End Sub

Sub Init
	'initialize the page
	vm.Initialize(Me, Main.appname)
	vue = vm.vue
	BuildNavBar
	BuildNavDrawer
	AddPages
	AddContent
	BuildBottomNav
	BuildFooter
	'
	vm.ux
End Sub


'build the footer of the page
Sub BuildFooter
	'*copy code after this line
	
End Sub

'build the bottom nav bar
Sub BuildBottomNav
	'*copy code after this line
	
End Sub

Sub Destroyed
	Log(vm.DateTimeNow & " App Destroyed")
End Sub


Sub BeforeDestroy
	Log(vm.DateTimeNow & " App BeforeDestroy")
End Sub

Sub Updated
	Log(vm.DateTimeNow & " App Updated")
End Sub


Sub BeforeUpdate
	Log(vm.DateTimeNow & " App BeforeUpdate")
End Sub

Sub BeforeMount
	Log(vm.DateTimeNow & " App BeforeMount")
	vm.PagePause
End Sub


Sub BeforeCreate
	Log(vm.DateTimeNow & " App BeforeCreate")
End Sub

'when the #el is mounted
Sub Mounted
	Log(vm.DateTimeNow & " App Mounted!")
End Sub


'when the instance is created
Sub Created
	Log(vm.datetimenow & " App Created!")
End Sub

'build the navigation bar
Sub BuildNavBar
	'*copy code after this line
End Sub

'build the nav drawer
Sub BuildNavDrawer
	'*copy code after this line
End Sub

'add pages to the app
Sub AddPages
	'*copy code after this line
End Sub

'add content to this page
Sub AddContent
	'*copy code here to add to thos page
End Sub

'*IMPORTANT when a drawer item is clicked
Sub draweritems_click(e As BANanoEvent)
	'get the id from the event
	Dim elID As String = vm.GetIDFromEvent(e)
	Select Case elID
	'copy code below this line
	End Select
End Sub

'confirm dialog ok click
Sub confirm_ok(e As BANanoEvent)
	Dim sconfirm As String = vm.GetConfirm
	Select Case sconfirm
	'copy code below this line
	End Select
End Sub

'confirm dialog cancel click
Sub cancel_ok(e As BANanoEvent)

End Sub

'alert dialog ok clock
Sub alert_ok(e As BANanoEvent)

End Sub

'confirm dialog cancel click
Sub confirm_cancel(e As BANanoEvent)

End Sub

'fired when the logo is clicked
Sub logo_click(e As BANanoEvent)
	'you could show the home page
End Sub

'fired when the title is clicked
Sub title_click(e As BANanoEvent)
	'you could show the home page
End Sub

'fire when a button in the bottom nav is clicked
Private Sub bottomnav_change(value As Object)
	
End Sub

'toggle bottom bar visibility trap
Private Sub bottomnav_updateinputvalue(value As Object)
End Sub