B4J=true
Group=Default Group\Views
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private menu As VMComponent
	Private vue As BANanoVue
	Private vm As BANanoVM
End Sub

Sub Initialize
	'get the app instance
	vm = pgIndex.vm
	'get the view instance
	vue = vm.vue
	'initialize the component
	menu.Initialize(vue, "menu", "/menu", Me)
	'import the components
	CompHomePlans.initialize
	menu.Import(CompHomePlans.name, CompHomePlans.homeplans)
		
	'define the structure of the page
	Dim div As VMElement = vm.Div("")
	'add each of the custom elements
	div.AddCustomElement(CompHomePlans.name, "", Null, "")
	
	'set the template for the page
	menu.SetTemplate(div.tostring)
	 
	'add the component as a router/page for the app
	vm.AddRoute(menu)
End Sub
