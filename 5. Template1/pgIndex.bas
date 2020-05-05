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