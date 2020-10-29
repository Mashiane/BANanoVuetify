B4J=true
Group=Default Group\Views
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private home As VMComponent
	Private vue As BANanoVue
	Private vm As BANanoVM
End Sub

Sub Initialize
	'get the app instance
	vm = pgIndex.vm
	'get the view instance
	vue = vm.vue
	'initialize the component
	home.Initialize(vue, "home", "/", Me)
	'import the components, each code module should have the Initialize method without parameters
	CompHomeHero.initialize
	home.Import(CompHomeHero.name, CompHomeHero.homehero)
	CompHomeDetails.Initialize 
	home.Import(CompHomeDetails.name, CompHomeDetails.homedetails) 
	'CompHomePlans.Initialize
	'home.Import(CompHomePlans.name, CompHomePlans.homeplans) 
		
	'define the structure of the page
	Dim span As VMElement = vm.Span("")
	span.SetStatic(True)
	'add each of the custom elements
	span.AddCustomElement(CompHomeHero.name, "", Null, "")
	span.AddCustomElement(CompHomeDetails.name, "", Null, "")
	'span.AddCustomElement(CompHomePlans.name, "", Null, "")
	
	Dim scont As String = span.tostring
	'set the template for the page
	home.SetTemplate(span.tostring)
	'add the component as a router/page for the app
	vm.AddRoute(home)
End Sub
