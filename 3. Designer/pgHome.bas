B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private rtc As VMRTC
	Private rt As VMRT
End Sub


Sub Init
	'initialize the application
	vm.Initialize(Me, Main.appname)
	vue = vm.vue
	'
	BuildNavBar
	BuildDrawer	'
	
	vm.Container.AddRows(3).AddColumns12
	'
	
	Dim lbl As VMLabel
	lbl.Initialize(vue, "lbl").SetText("This is a label...")
	vm.Container.AddComponent(1, 1, lbl.ToString)
	'
	rt.Initialize(vue, "rt1", Me)
	vm.Container.AddComponent(2, 1, rt.ToString)
	'
	rtc.Initialize(vue, "rtc1", Me)
	vm.Container.AddComponent(3, 1, rtc.ToString)
	'
	vm.UX
	'
	vue.SetData("firstname", "Anele Mashy")
	Dim appTitle As VMElement
	appTitle.Initialize(vue, "title").SetTag("h1").SetText("How are you doing?")
	rt.SetTemplate(appTitle.tostring)
	
	Dim el As BANanoObject = vm.getElementById("el")
	rtc.SetParent(el)
	'
	Dim appTitle1 As VMElement
	appTitle1.Initialize(vue, "title1").SetTag("h1").SetText("How are you doing {{ firstname }}?")
	rtc.SetTemplate(appTitle1.tostring)
End Sub

'build nav drawer
Sub BuildNavBar
	vm.NavBar.SetVisible(True)
	vm.NavBar.SetModeFixed(True)
	vm.NavBar.SetClippedLeft(True)
	vm.NavBar.SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	vm.NavBar.SetDark(True)
	'
	vm.NavBar.AddHamburger
	vm.NavBar.Hamburger.SetVisible(True)
	vm.NavBar.AddTitle(Main.AppTitle,"")
	vm.NavBar.AddSubHeading1(Main.Version)
	vm.NavBar.AddSpacer
	'
	'add a logo
	vm.NavBar.Logo.SetBorderRadius("50%")
	vm.NavBar.Logo.SetBorderWidth("1px")
	vm.NavBar.Logo.SetBorderColor("black")
	vm.NavBar.Logo.SetBorderStyle("solid")
	vm.NavBar.Logo.SetSize("46px","46px")
	vm.NavBar.AddLogo("./assets/sponge.png")
	vm.NavBar.Logo.Show
End Sub

'build drawer
Sub BuildDrawer
	
End Sub


Sub Destroyed
End Sub


Sub BeforeDestroy
End Sub

Sub Updated
End Sub


Sub BeforeUpdate
End Sub

Sub BeforeMount
End Sub


Sub BeforeCreate
End Sub

'when the #el is mounted
Sub Mounted
End Sub


'when the instance is created
Sub Created
End Sub