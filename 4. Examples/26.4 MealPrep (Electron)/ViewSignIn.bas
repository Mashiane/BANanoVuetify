B4J=true
Group=Default Group\Views
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private signin As VMComponent
	Private vue As BANanoVue
	Private vm As BANanoVM
End Sub

Sub Initialize
	'get the app instance
	vm = pgIndex.vm
	'get the view instance
	vue = vm.vue
	'initialize the page
	signin.Initialize(vue, "signin", "/signin", Me)
	'
	Dim cont As VMContainer = vm.CreateContainer("", Me)
	cont.SetFluid(True)
	cont.SetFillHeight(True)
	cont.SetCoverImage("./assets/login.jpg")
	cont.SetStyleSingle("max-height", "100vh")
	'
	'set the template for the page
	signin.SetTemplate(cont.tostring)
	 
	'add the component as a router/page for the app
	vm.AddRoute(signin)	 
End Sub
