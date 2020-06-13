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
	AddComponents
	AddRouters
	BuildNavBar
	BuildNavDrawer
	AddPages
	AddContent
	BuildBottomNav
	BuildFooter
	'
	vm.ux
	'

End Sub

Sub AddComponents
	modComponent1.Import
	modComponent2.Import
	modDynamic.Import
End Sub

Sub AddRouters
	modR1.AddRouter
	modR2.AddRouter
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
	'hide the navbar
	vm.NavBar.Hide
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
	'create a div to hold the component
	Dim div As VMElement = vue.CreateDiv("")
	'create the component
	Dim c1 As VMElement = vue.CreateOwnComponent("c1", "comp1")
	'add component to parent
	div.AddComponent(c1.tostring)
	'
	Dim c2 As VMElement = vue.CreateOwnComponent("c2", "comp2")
	'add component to parent
	div.AddComponent(c2.tostring)
	'
	Dim c3 As VMElement = vue.CreateDynamicComponent("c3", "c3view", "dyna")
	'add component to parent
	div.AddComponent(c3.tostring)
	'
	vue.setdata("firstname", "Anele")
	vue.SetData("lastname", "Mbanga")
	'
	Dim fname As VMElement = vue.CreateH1("").SetText("The fullname is {{ getfullname }}")
	Dim fnamecount As VMElement = vue.CreateH1("").SetText("The count of strings is {{ getfullname | countletters }}")
	
	div.AddComponent(fname.tostring)
	div.AddComponent(fnamecount.tostring)
	vue.SetComputed("getfullname", Me, "getfullname1")
	'
	vue.setdata("kilometers", "0")
	vue.Setdata("meters", "0")
	
	'
	Dim inpk As VMElement = vue.CreateINPUT("").settype("text").setvmodel("kilometers")
	Dim inpm As VMElement = vue.createinput("").settype("text").Setvmodel("meters")
	
	div.AddComponent(inpk.tostring)
	div.AddComponent(inpm.tostring)
	
	vue.SetWatch("kilometers", True, True, Me, "kilometers1")
	vue.SetWatch("meters", True, True, Me, "meters1")
	vue.SetFilter("countletters", Me, "countletters1")
	
	'create router links
	Dim p As VMElement = vue.CreateP("")
	Dim lnk1 As VMElement = vm.CreateRouterLink("", modR1.r1.path, "Router Link 1")
	p.AddComponent(lnk1.tostring)
	Dim lnk2 As VMElement = vm.CreateRouterLink("", modR2.r2.path, "Router Link 2")
	p.AddComponent(lnk2.tostring)
	
	div.AddComponent(p.ToString)
	'add route links 
	Dim rv As VMElement = vm.CreateRouterView("")
	div.AddComponent(rv.tostring)
	
	'add parent to page
	vm.AddContent(div.tostring)
	
End Sub

Sub countletters1(value As String) As Int
	Return value.length
End Sub

Sub kilometers1(val As Object)
	Dim dmeters As Int = val * 1000
	vue.setdata("kilometers", val)
	vue.setdata("meters", dmeters)
End Sub

Sub meters1(val As Object)
	Dim dkilometers As Int = val / 1000
	vue.setdata("kilometers", dkilometers)
	vue.setdata("meters", val)
End Sub


Sub getfullname1 As String
	Dim fname As String = vue.getdata("firstname")
	Dim lname As String = vue.GetData("lastname")
	Return $"${fname} ${lname}"$
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