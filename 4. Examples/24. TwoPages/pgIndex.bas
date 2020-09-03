B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public vm As BANanoVM
	Public vue As BANanoVue   'ignore
End Sub

Sub Init
	'initialize the page
	vm.Initialize(Me, Main.AppName)
	vue = vm.vue
	'we want to use a blank template
	vm.UseBlankTemplate
	'
	BuildNavBar
	'
	'add different pages
	'the app will know to use the router
	pghome.Initialize
	pgabout.Initialize
	
	vm.ux
End Sub

Sub BuildNavBar
	'create the app bar
	Dim appBar As VMElement
	appBar.Initialize(vue, "navbar").SetTag("v-app-bar").AddAttr("app", True)
	
	'create the toolbar title
	Dim title As VMElement
	title.Initialize(vue, "lbltitle").SetTag("v-toolbar-title").AddClass("headline text-uppercase").SetText("Two Pages")
	
	'add title To the toolbar
	title.AddToParent(appBar)
	
	'add a spacer
	appBar.AddSpacer
	
	'add a button that will open the home page
	'specify the router to go to
	Dim btnHome As VMElement
	btnHome.Initialize(vue, "btnHome").SetTag("v-btn").AddAttr("text", True).SetText("Home").AddAttr("to", "/")
	btnHome.AddToParent(appBar)
	
	'add vertical divider
	appBar.AddVerticalDivider("mx-2")
	
	'create a button To add To the navBar
	'when clicked, this will open the /about page
	Dim btnAbout As VMElement
	btnAbout.Initialize(vue, "btnAbout").SetTag("v-btn").AddAttr("text", True).SetText("About").AddAttr("to", "/about")
	btnAbout.AddToParent(appBar)
	
	'add vertical divider
	appBar.AddVerticalDivider("mx-2")
	
	'add navBar To the app
	appBar.AddToParent(vm.VApp)
	
End Sub