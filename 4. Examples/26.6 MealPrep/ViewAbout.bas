B4J=true
Group=Default Group\Views
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private about As VMComponent
	Private vue As BANanoVue
	Private vm As BANanoVM
End Sub

Sub Initialize
	'get the app instance
	vm = pgIndex.vm
	'get the view instance
	vue = vm.vue
	'initialize the component
	about.Initialize(vue, "about", "/about", Me)
	'
	Dim cont As VMContainer = vm.CreateContainer("", Me)
	Dim vlay As VMElement = vm.vlayout("").SetColumn
	'
	vlay.AddElement1("h1", "", "My Recipes", Null, Null, Array("title my-3"), Null)
	'
	Dim div As VMElement = vm.Div("")
	div.SetVFor("(item, idx)", "userrecipes")
	div.SetText("{{ item }}")
	div.bind(":key", "idx")
	div.AddClass("subheading mb-2")
	vlay.AddElement(div)
	'
	Dim vflex As VMElement = vm.vflex("").AddClass("mt-4")
	vflex.AddElement1("v-btn", "", "Go to Menu", CreateMap("color":"primary", "to":"/menu"),Null, Null, Null)
	vlay.AddElement(vflex)
	
	cont.AddComponent(0, 0, vlay.tostring)
		
	'set the template for the page
	about.SetTemplate(cont.tostring)
	 
	'set computed property
	about.SetComputed("userRecipes", Me, "getuserRecipes")
	'when mounted, get the user recipes
	about.SetMounted(Me, "getRecipes")
	'add the component as a router/page for the app
	vm.AddRoute(about)
End Sub

'define a callback
Sub getUserRecipes As List 'IgnoreDeadCode
	Dim userRecipes As List = vm.GetDataGlobal("userRecipes")
	Return userRecipes
End Sub

Sub getRecipes 'IgnoreDeadCode
	vm.RunMethod("getUserRecipes", Null)
End Sub
